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
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime2.plus(readableDuration4);
        org.joda.time.DateTime dateTime7 = dateTime2.withWeekOfWeekyear((int) (short) 10);
        org.joda.time.DateTime dateTime9 = dateTime7.withYearOfEra(5);
        org.joda.time.DateTime dateTime11 = dateTime7.plusHours((int) (byte) 10);
        org.joda.time.DateTime dateTime13 = dateTime7.plusWeeks((int) (byte) 0);
        org.joda.time.DateTime dateTime15 = dateTime13.minusMillis((int) (short) 1);
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.DateTime dateTime18 = dateTime13.withDurationAdded(readableDuration16, 52);
        org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime.Property property22 = localTime21.secondOfMinute();
        org.joda.time.LocalTime localTime24 = localTime21.plusMinutes((int) (short) 100);
        org.joda.time.LocalTime localTime26 = localTime24.withHourOfDay((int) (byte) 10);
        org.joda.time.Chronology chronology27 = localTime26.getChronology();
        org.joda.time.LocalTime localTime28 = new org.joda.time.LocalTime(0L, chronology27);
        org.joda.time.DateTimeField dateTimeField29 = chronology27.year();
        org.joda.time.DurationField durationField30 = chronology27.hours();
        org.joda.time.DurationField durationField31 = chronology27.halfdays();
        org.joda.time.DurationField durationField32 = chronology27.minutes();
        org.joda.time.Chronology chronology33 = chronology27.withUTC();
        org.joda.time.DateTimeField dateTimeField34 = chronology33.millisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime35 = dateTime13.toMutableDateTime(chronology33);
        org.joda.time.DateTimeField dateTimeField36 = chronology33.dayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime7 and mutableDateTime35", (dateTime7.compareTo(mutableDateTime35) == 0) == dateTime7.equals(mutableDateTime35));
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1002");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.yearOfCentury();
        org.joda.time.DateTime dateTime4 = property3.roundFloorCopy();
        org.joda.time.DateTime dateTime6 = property3.addToCopy((long) 0);
        org.joda.time.DateTime dateTime8 = property3.addWrapFieldToCopy(843);
        org.joda.time.Instant instant9 = dateTime8.toInstant();
        org.joda.time.Chronology chronology10 = instant9.getChronology();
        org.joda.time.DurationField durationField11 = chronology10.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and instant9", (dateTime8.compareTo(instant9) == 0) == dateTime8.equals(instant9));
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1003");
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.parse("2030-03-22T17:54:29.166");
        int int2 = dateTime1.getMonthOfYear();
        org.joda.time.Instant instant4 = new org.joda.time.Instant((long) 'a');
        org.joda.time.DateTime dateTime5 = instant4.toDateTimeISO();
        long long6 = dateTime5.getMillis();
        org.joda.time.DateTime dateTime8 = dateTime5.minus((-97363L));
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.DateTime dateTime11 = dateTime5.withDurationAdded(readableDuration9, 476);
        boolean boolean12 = dateTime1.isEqual((org.joda.time.ReadableInstant) dateTime11);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant4 and dateTime11", (instant4.compareTo(dateTime11) == 0) == instant4.equals(dateTime11));
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1004");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        boolean boolean2 = localDateTime0.equals((java.lang.Object) (-1L));
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType3.getField(chronology4);
        org.joda.time.DurationFieldType durationFieldType6 = dateTimeFieldType3.getRangeDurationType();
        boolean boolean7 = localDateTime0.isSupported(durationFieldType6);
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.LocalDateTime localDateTime10 = localDateTime0.withDurationAdded(readableDuration8, 4);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.minusMinutes(26403599);
        org.joda.time.LocalDateTime.Property property13 = localDateTime10.monthOfYear();
        org.joda.time.DateTime dateTime14 = localDateTime10.toDateTime();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) 0, chronology16);
        org.joda.time.DateTime.Property property18 = dateTime17.yearOfCentury();
        org.joda.time.DateTime dateTime20 = dateTime17.minusSeconds(9);
        org.joda.time.Instant instant21 = dateTime17.toInstant();
        org.joda.time.DateTime dateTime22 = localDateTime10.toDateTime((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.LocalDateTime.Property property23 = localDateTime10.weekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime17 and instant21", (dateTime17.compareTo(instant21) == 0) == dateTime17.equals(instant21));
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1005");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime((long) 0, chronology3);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime4.toMutableDateTime(chronology5);
        org.joda.time.DateTime dateTime8 = dateTime4.minus((long) '#');
        org.joda.time.DateTime dateTime10 = dateTime4.withDayOfWeek(4);
        org.joda.time.LocalDate localDate11 = dateTime4.toLocalDate();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalDate localDate13 = localDate11.plus(readablePeriod12);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) 0, chronology18);
        org.joda.time.DateTime.Property property20 = dateTime19.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.DateTime dateTime22 = dateTime19.plus(readableDuration21);
        org.joda.time.DateTime dateTime24 = dateTime19.withWeekOfWeekyear((int) (short) 10);
        int int25 = dateTimeZone16.getOffset((org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.DateTime dateTime26 = localDate13.toDateTimeAtCurrentTime(dateTimeZone16);
        org.joda.time.Chronology chronology27 = dateTime26.getChronology();
        org.joda.time.LocalDate localDate28 = new org.joda.time.LocalDate((long) 26403599, chronology27);
        org.joda.time.LocalDate localDate29 = new org.joda.time.LocalDate((long) 23, chronology27);
        org.joda.time.LocalDate localDate31 = localDate29.withDayOfYear(22);
        org.joda.time.LocalDate localDate33 = localDate29.minusYears(406);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime((long) 0, chronology35);
        org.joda.time.DateTime.Property property37 = dateTime36.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration38 = null;
        org.joda.time.DateTime dateTime39 = dateTime36.plus(readableDuration38);
        org.joda.time.DateTimeFieldType dateTimeFieldType40 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int41 = dateTime39.get(dateTimeFieldType40);
        org.joda.time.DateTime dateTime42 = dateTime39.withTimeAtStartOfDay();
        org.joda.time.LocalDate localDate43 = dateTime42.toLocalDate();
        org.joda.time.DateTimeZone dateTimeZone44 = dateTime42.getZone();
        org.joda.time.DateTime dateTime45 = localDate29.toDateTimeAtStartOfDay(dateTimeZone44);
        org.joda.time.Instant instant46 = dateTime45.toInstant();
        org.joda.time.Instant instant47 = instant46.toInstant();
        org.joda.time.Instant instant48 = instant47.toInstant();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime42 and instant48", (dateTime42.compareTo(instant48) == 0) == dateTime42.equals(instant48));
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1006");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        boolean boolean2 = localDateTime0.equals((java.lang.Object) (-1L));
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.withWeekyear(5);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfMonth();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((long) 0, chronology7);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = dateTime8.toMutableDateTime(chronology9);
        org.joda.time.DateTime dateTime12 = dateTime8.minus((long) '#');
        org.joda.time.MutableDateTime mutableDateTime13 = dateTime8.toMutableDateTime();
        org.joda.time.Instant instant14 = new org.joda.time.Instant((java.lang.Object) dateTime8);
        int int15 = property5.getDifference((org.joda.time.ReadableInstant) instant14);
        org.joda.time.Instant instant17 = instant14.minus((long) 10);
        org.joda.time.MutableDateTime mutableDateTime18 = instant17.toMutableDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and instant14", (dateTime8.compareTo(instant14) == 0) == dateTime8.equals(instant14));
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1007");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.roundCeilingCopy();
        org.joda.time.LocalTime localTime4 = property2.withMinimumValue();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) 0, chronology6);
        int int8 = dateTime7.getSecondOfMinute();
        org.joda.time.DateTime dateTime10 = dateTime7.withYear(10);
        org.joda.time.DateTime dateTime12 = dateTime7.minusMillis(11);
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime.Property property16 = localTime15.secondOfMinute();
        org.joda.time.LocalTime localTime18 = localTime15.plusMinutes((int) (short) 100);
        org.joda.time.LocalTime localTime20 = localTime18.withHourOfDay((int) (byte) 10);
        org.joda.time.Chronology chronology21 = localTime20.getChronology();
        org.joda.time.LocalTime localTime22 = new org.joda.time.LocalTime(0L, chronology21);
        org.joda.time.LocalTime localTime24 = localTime22.plusSeconds(37919999);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forOffsetHours(1);
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime(dateTimeZone26);
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int29 = dateTime27.get(dateTimeFieldType28);
        org.joda.time.LocalTime.Property property30 = localTime22.property(dateTimeFieldType28);
        org.joda.time.DurationFieldType durationFieldType31 = dateTimeFieldType28.getDurationType();
        int int32 = dateTime7.get(dateTimeFieldType28);
        int int33 = property2.compareTo((org.joda.time.ReadableInstant) dateTime7);
        java.util.Date date35 = new java.util.Date((long) (byte) -1);
        java.util.Date date37 = new java.util.Date((long) (byte) -1);
        date37.setTime((long) ' ');
        boolean boolean40 = date35.after(date37);
        java.time.Instant instant41 = date37.toInstant();
        org.joda.time.LocalTime localTime45 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime.Property property46 = localTime45.secondOfMinute();
        org.joda.time.LocalTime localTime48 = localTime45.plusMinutes((int) (short) 100);
        org.joda.time.LocalTime localTime50 = localTime48.withHourOfDay((int) (byte) 10);
        org.joda.time.Chronology chronology51 = localTime50.getChronology();
        org.joda.time.LocalTime localTime52 = new org.joda.time.LocalTime(0L, chronology51);
        org.joda.time.DateTimeField dateTimeField53 = chronology51.monthOfYear();
        org.joda.time.DateTime dateTime54 = new org.joda.time.DateTime((long) 64331, chronology51);
        org.joda.time.DateTime dateTime55 = new org.joda.time.DateTime((java.lang.Object) date37, chronology51);
        org.joda.time.DateTimeZone dateTimeZone59 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        boolean boolean60 = dateTimeZone59.isFixed();
        org.joda.time.DateTime dateTime61 = new org.joda.time.DateTime((long) (byte) 100, dateTimeZone59);
        java.lang.String str63 = dateTimeZone59.getShortName((long) 8);
        org.joda.time.LocalTime localTime64 = new org.joda.time.LocalTime((java.lang.Object) dateTime55, dateTimeZone59);
        org.joda.time.DateTime dateTime65 = dateTime7.toDateTime(dateTimeZone59);
        org.joda.time.DateTime dateTime67 = dateTime7.plusDays(1919);
        org.joda.time.LocalTime localTime69 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime.Property property70 = localTime69.secondOfMinute();
        org.joda.time.LocalTime localTime71 = property70.roundCeilingCopy();
        int int72 = localTime71.getSecondOfMinute();
        org.joda.time.Chronology chronology73 = localTime71.getChronology();
        org.joda.time.DateTime dateTime74 = dateTime67.withFields((org.joda.time.ReadablePartial) localTime71);
        org.joda.time.LocalTime localTime79 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime.Property property80 = localTime79.secondOfMinute();
        org.joda.time.LocalTime localTime82 = localTime79.plusMinutes((int) (short) 100);
        org.joda.time.LocalTime localTime84 = localTime82.withHourOfDay((int) (byte) 10);
        org.joda.time.Chronology chronology85 = localTime84.getChronology();
        org.joda.time.LocalTime localTime86 = new org.joda.time.LocalTime(0L, chronology85);
        org.joda.time.DateTimeField dateTimeField87 = chronology85.monthOfYear();
        org.joda.time.DateTime dateTime88 = new org.joda.time.DateTime((long) 64331, chronology85);
        org.joda.time.DateTimeField dateTimeField89 = chronology85.weekyearOfCentury();
        org.joda.time.DurationField durationField90 = chronology85.hours();
        org.joda.time.ReadablePeriod readablePeriod91 = null;
        long long94 = chronology85.add(readablePeriod91, 33120097L, 64415612);
        java.lang.String str95 = chronology85.toString();
        org.joda.time.DateTimeField dateTimeField96 = chronology85.secondOfMinute();
        org.joda.time.DateTime dateTime97 = new org.joda.time.DateTime(0L, chronology85);
        org.joda.time.DateTime dateTime98 = dateTime67.toDateTime(chronology85);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime7 and dateTime97", (dateTime7.compareTo(dateTime97) == 0) == dateTime7.equals(dateTime97));
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1008");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(0L);
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.Instant instant4 = instant1.withDurationAdded(readableDuration2, 0);
        org.joda.time.Instant instant6 = instant1.withMillis(8L);
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.Instant instant9 = instant6.withDurationAdded(readableDuration7, 54);
        boolean boolean11 = instant9.isAfter(1000L);
        org.joda.time.Chronology chronology12 = instant9.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.weekOfWeekyear();
        boolean boolean14 = dateTimeField13.isLenient();
        java.util.Calendar calendar15 = java.util.Calendar.getInstance();
        int int17 = calendar15.getMinimum(0);
        calendar15.clear();
        calendar15.clear();
        java.util.TimeZone timeZone21 = java.util.TimeZone.getTimeZone("South Korea");
        int int22 = timeZone21.getRawOffset();
        calendar15.setTimeZone(timeZone21);
        java.lang.String str24 = timeZone21.getID();
        timeZone21.setID("hours");
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.DateTimeField dateTimeField29 = dateTimeFieldType27.getField(chronology28);
        long long32 = dateTimeField29.getDifferenceAsLong((long) (short) 10, (long) ' ');
        long long34 = dateTimeField29.remainder((-22L));
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime();
        org.joda.time.DurationFieldType durationFieldType36 = org.joda.time.DurationFieldType.months();
        org.joda.time.LocalDateTime localDateTime38 = localDateTime35.withFieldAdded(durationFieldType36, (int) 'a');
        org.joda.time.LocalDateTime localDateTime40 = localDateTime38.withMinuteOfHour(9);
        org.joda.time.DateTime dateTime41 = localDateTime38.toDateTime();
        org.joda.time.LocalDateTime localDateTime43 = localDateTime38.withDayOfYear(7);
        org.joda.time.ReadablePeriod readablePeriod44 = null;
        org.joda.time.LocalDateTime localDateTime45 = localDateTime38.plus(readablePeriod44);
        org.joda.time.LocalDateTime.Property property46 = localDateTime45.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime48 = property46.addToCopy((long) 9);
        java.lang.String str49 = localDateTime48.toString();
        org.joda.time.LocalDateTime localDateTime51 = localDateTime48.minusDays((-717648));
        org.joda.time.LocalDateTime localDateTime53 = localDateTime48.withWeekyear(99);
        org.joda.time.DateTimeFieldType dateTimeFieldType55 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology56 = null;
        org.joda.time.DateTimeField dateTimeField57 = dateTimeFieldType55.getField(chronology56);
        org.joda.time.ReadablePartial readablePartial58 = null;
        java.util.Locale locale61 = java.util.Locale.forLanguageTag("");
        java.lang.String str62 = dateTimeField57.getAsShortText(readablePartial58, (int) (byte) 1, locale61);
        java.lang.String str63 = locale61.getLanguage();
        java.util.Locale locale64 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale65 = locale64.stripExtensions();
        java.lang.String str66 = locale61.getDisplayName(locale64);
        java.lang.String str67 = dateTimeField29.getAsShortText((org.joda.time.ReadablePartial) localDateTime53, 22, locale61);
        java.util.Calendar calendar68 = java.util.Calendar.getInstance(locale61);
        java.util.Calendar calendar69 = java.util.Calendar.getInstance(timeZone21, locale61);
        int int70 = dateTimeField13.getMaximumTextLength(locale61);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar68 and calendar69", (calendar68.compareTo(calendar69) == 0) == calendar68.equals(calendar69));
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1009");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.yearOfCentury();
        org.joda.time.DateTime dateTime5 = dateTime2.minusSeconds(9);
        org.joda.time.Instant instant6 = dateTime2.toInstant();
        long long7 = instant6.getMillis();
        org.joda.time.Instant instant9 = instant6.minus((-360000L));
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTimeField dateTimeField12 = dateTimeFieldType10.getField(chronology11);
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime.Property property15 = localTime14.secondOfMinute();
        int int16 = dateTimeField12.getMinimumValue((org.joda.time.ReadablePartial) localTime14);
        org.joda.time.LocalTime localTime18 = localTime14.plusMillis((int) (byte) 100);
        org.joda.time.LocalTime localTime20 = localTime18.withMillisOfDay((int) (short) 0);
        org.joda.time.LocalTime localTime22 = localTime18.plusMinutes(590);
        org.joda.time.Chronology chronology23 = localTime18.getChronology();
        org.joda.time.DateTimeField dateTimeField24 = chronology23.hourOfDay();
        org.joda.time.DurationField durationField25 = chronology23.weekyears();
        org.joda.time.DateTime dateTime26 = instant6.toDateTime(chronology23);
        org.joda.time.DurationField durationField27 = chronology23.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant6", (dateTime2.compareTo(instant6) == 0) == dateTime2.equals(instant6));
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1010");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime2.toMutableDateTime(chronology3);
        org.joda.time.DateTime dateTime6 = dateTime2.minus((long) '#');
        org.joda.time.DateTime dateTime8 = dateTime2.withDayOfWeek(4);
        org.joda.time.DateTime.Property property9 = dateTime8.minuteOfHour();
        org.joda.time.LocalTime localTime10 = dateTime8.toLocalTime();
        org.joda.time.DateTime dateTime12 = dateTime8.minusWeeks(64367);
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime((java.lang.Object) dateTime8);
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime.Property property18 = localTime17.secondOfMinute();
        org.joda.time.LocalTime localTime20 = localTime17.plusMinutes((int) (short) 100);
        org.joda.time.LocalTime localTime22 = localTime20.withHourOfDay((int) (byte) 10);
        org.joda.time.Chronology chronology23 = localTime22.getChronology();
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime(0L, chronology23);
        org.joda.time.DateTimeField dateTimeField25 = chronology23.monthOfYear();
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime((long) 64331, chronology23);
        org.joda.time.DateTimeField dateTimeField27 = chronology23.weekyearOfCentury();
        org.joda.time.DateTime dateTime28 = dateTime8.toDateTime(chronology23);
        org.joda.time.DateTime.Property property29 = dateTime28.secondOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.DateTimeField dateTimeField32 = dateTimeFieldType30.getField(chronology31);
        org.joda.time.ReadablePartial readablePartial33 = null;
        java.util.Locale locale36 = java.util.Locale.forLanguageTag("");
        java.lang.String str37 = dateTimeField32.getAsShortText(readablePartial33, (int) (byte) 1, locale36);
        java.util.Locale locale39 = java.util.Locale.forLanguageTag("");
        java.lang.String str40 = locale39.getScript();
        java.lang.String str41 = locale36.getDisplayVariant(locale39);
        boolean boolean42 = locale36.hasExtensions();
        int int43 = property29.getMaximumShortTextLength(locale36);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime28", (dateTime2.compareTo(dateTime28) == 0) == dateTime2.equals(dateTime28));
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1011");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime2.plus(readableDuration4);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((long) 0, chronology7);
        org.joda.time.DateTime.Property property9 = dateTime8.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.DateTime dateTime11 = dateTime8.plus(readableDuration10);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int13 = dateTime11.get(dateTimeFieldType12);
        boolean boolean14 = dateTime5.isEqual((org.joda.time.ReadableInstant) dateTime11);
        org.joda.time.Instant instant15 = dateTime11.toInstant();
        boolean boolean16 = instant15.isAfterNow();
        org.joda.time.MutableDateTime mutableDateTime17 = instant15.toMutableDateTimeISO();
        int int18 = mutableDateTime17.getHourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant15", (dateTime2.compareTo(instant15) == 0) == dateTime2.equals(instant15));
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1012");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime2.toMutableDateTime(chronology3);
        org.joda.time.DateTime dateTime6 = dateTime2.minus((long) '#');
        org.joda.time.DateTime dateTime8 = dateTime2.withDayOfWeek(4);
        org.joda.time.LocalDate localDate9 = dateTime2.toLocalDate();
        org.joda.time.LocalDate.Property property10 = localDate9.dayOfWeek();
        org.joda.time.LocalDate localDate11 = property10.withMinimumValue();
        org.joda.time.LocalDate localDate12 = property10.roundHalfCeilingCopy();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDate localDate15 = localDate12.withPeriodAdded(readablePeriod13, 48);
        org.joda.time.format.DateTimePrinter dateTimePrinter16 = null;
        org.joda.time.format.DateTimeParser dateTimeParser17 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter16, dateTimeParser17);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = dateTimeFormatter18.withZoneUTC();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime((long) 0, chronology21);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = dateTime22.toMutableDateTime(chronology23);
        org.joda.time.DateTime dateTime26 = dateTime22.minus((long) '#');
        org.joda.time.DateTime dateTime28 = dateTime22.withDayOfWeek(4);
        org.joda.time.LocalDate localDate29 = dateTime22.toLocalDate();
        org.joda.time.ReadablePeriod readablePeriod30 = null;
        org.joda.time.LocalDate localDate31 = localDate29.plus(readablePeriod30);
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime((long) 0, chronology36);
        org.joda.time.DateTime.Property property38 = dateTime37.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration39 = null;
        org.joda.time.DateTime dateTime40 = dateTime37.plus(readableDuration39);
        org.joda.time.DateTime dateTime42 = dateTime37.withWeekOfWeekyear((int) (short) 10);
        int int43 = dateTimeZone34.getOffset((org.joda.time.ReadableInstant) dateTime42);
        org.joda.time.DateTime dateTime44 = localDate31.toDateTimeAtCurrentTime(dateTimeZone34);
        long long48 = dateTimeZone34.convertLocalToUTC((long) 31, true, (long) 'u');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter49 = dateTimeFormatter19.withZone(dateTimeZone34);
        org.joda.time.DateTimeZone dateTimeZone52 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        java.lang.String str54 = dateTimeZone52.getShortName((long) (byte) -1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter55 = dateTimeFormatter49.withZone(dateTimeZone52);
        org.joda.time.format.DateTimePrinter dateTimePrinter56 = null;
        org.joda.time.format.DateTimeParser dateTimeParser57 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter58 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter56, dateTimeParser57);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter59 = dateTimeFormatter58.withZoneUTC();
        java.util.Locale locale61 = java.util.Locale.forLanguageTag("");
        java.util.Set<java.lang.String> strSet62 = locale61.getUnicodeLocaleAttributes();
        java.util.Locale locale64 = java.util.Locale.forLanguageTag("");
        java.lang.String str65 = locale64.getScript();
        java.lang.String str66 = locale61.getDisplayLanguage(locale64);
        java.lang.String str67 = locale64.getDisplayName();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter68 = dateTimeFormatter58.withLocale(locale64);
        boolean boolean69 = dateTimeFormatter68.isParser();
        org.joda.time.Chronology chronology71 = null;
        org.joda.time.DateTime dateTime72 = new org.joda.time.DateTime((long) 0, chronology71);
        org.joda.time.DateTime.Property property73 = dateTime72.yearOfCentury();
        org.joda.time.DateTime dateTime75 = dateTime72.minusSeconds(9);
        org.joda.time.DateTime dateTime77 = dateTime72.minusMinutes(6);
        org.joda.time.DateTimeZone dateTimeZone80 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        java.util.TimeZone timeZone81 = dateTimeZone80.toTimeZone();
        org.joda.time.DateTime dateTime82 = dateTime77.withZone(dateTimeZone80);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter83 = dateTimeFormatter68.withZone(dateTimeZone80);
        long long85 = dateTimeZone52.getMillisKeepLocal(dateTimeZone80, (long) 37920);
        java.lang.String str87 = dateTimeZone80.getNameKey((long) 64436);
        org.joda.time.DateTime dateTime88 = localDate12.toDateTimeAtStartOfDay(dateTimeZone80);
        org.joda.time.LocalDateTime localDateTime89 = new org.joda.time.LocalDateTime(dateTimeZone80);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime77 and dateTime82", (dateTime77.compareTo(dateTime82) == 0) == dateTime77.equals(dateTime82));
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1013");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withZoneUTC();
        java.util.Locale locale5 = java.util.Locale.forLanguageTag("");
        java.util.Set<java.lang.String> strSet6 = locale5.getUnicodeLocaleAttributes();
        java.util.Locale locale8 = java.util.Locale.forLanguageTag("");
        java.lang.String str9 = locale8.getScript();
        java.lang.String str10 = locale5.getDisplayLanguage(locale8);
        java.lang.String str11 = locale8.getDisplayName();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter2.withLocale(locale8);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) 0, chronology14);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = dateTime15.toMutableDateTime(chronology16);
        org.joda.time.DateTime dateTime19 = dateTime15.minus((long) '#');
        org.joda.time.DateTime dateTime21 = dateTime15.withDayOfWeek(4);
        org.joda.time.LocalDate localDate22 = dateTime15.toLocalDate();
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.LocalDate localDate24 = localDate22.plus(readablePeriod23);
        org.joda.time.LocalDate localDate26 = localDate24.withCenturyOfEra(0);
        org.joda.time.LocalDate localDate28 = localDate24.withYearOfEra((int) 'x');
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) 0, chronology31);
        org.joda.time.DateTime.Property property33 = dateTime32.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration34 = null;
        org.joda.time.DateTime dateTime35 = dateTime32.plus(readableDuration34);
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int37 = dateTime35.get(dateTimeFieldType36);
        org.joda.time.DateTime dateTime38 = dateTime35.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime42 = dateTime35.toDateTime(dateTimeZone41);
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime((long) 2, dateTimeZone41);
        org.joda.time.DateTime dateTime44 = localDate24.toDateTimeAtMidnight(dateTimeZone41);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter45 = dateTimeFormatter2.withZone(dateTimeZone41);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter46 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.DateTime dateTime50 = new org.joda.time.DateTime((long) 0, chronology49);
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.MutableDateTime mutableDateTime52 = dateTime50.toMutableDateTime(chronology51);
        org.joda.time.DateTime dateTime54 = dateTime50.minus((long) '#');
        org.joda.time.DateTime dateTime56 = dateTime50.withDayOfWeek(4);
        org.joda.time.LocalDate localDate57 = dateTime50.toLocalDate();
        org.joda.time.ReadablePeriod readablePeriod58 = null;
        org.joda.time.LocalDate localDate59 = localDate57.plus(readablePeriod58);
        org.joda.time.DateTimeZone dateTimeZone62 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.Chronology chronology64 = null;
        org.joda.time.DateTime dateTime65 = new org.joda.time.DateTime((long) 0, chronology64);
        org.joda.time.DateTime.Property property66 = dateTime65.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration67 = null;
        org.joda.time.DateTime dateTime68 = dateTime65.plus(readableDuration67);
        org.joda.time.DateTime dateTime70 = dateTime65.withWeekOfWeekyear((int) (short) 10);
        int int71 = dateTimeZone62.getOffset((org.joda.time.ReadableInstant) dateTime70);
        org.joda.time.DateTime dateTime72 = localDate59.toDateTimeAtCurrentTime(dateTimeZone62);
        org.joda.time.Chronology chronology73 = dateTime72.getChronology();
        org.joda.time.LocalDate localDate74 = new org.joda.time.LocalDate((long) 26403599, chronology73);
        org.joda.time.DurationField durationField75 = chronology73.millis();
        org.joda.time.DurationField durationField76 = chronology73.years();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter77 = dateTimeFormatter2.withChronology(chronology73);
        org.joda.time.DateTimeField dateTimeField78 = chronology73.secondOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime15 and dateTime42", (dateTime15.compareTo(dateTime42) == 0) == dateTime15.equals(dateTime42));
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1014");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime((long) 0, chronology3);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime4.toMutableDateTime(chronology5);
        org.joda.time.DateTime dateTime8 = dateTime4.minus((long) '#');
        org.joda.time.DateTime dateTime10 = dateTime4.withDayOfWeek(4);
        org.joda.time.LocalDate localDate11 = dateTime4.toLocalDate();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalDate localDate13 = localDate11.plus(readablePeriod12);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) 0, chronology18);
        org.joda.time.DateTime.Property property20 = dateTime19.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.DateTime dateTime22 = dateTime19.plus(readableDuration21);
        org.joda.time.DateTime dateTime24 = dateTime19.withWeekOfWeekyear((int) (short) 10);
        int int25 = dateTimeZone16.getOffset((org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.DateTime dateTime26 = localDate13.toDateTimeAtCurrentTime(dateTimeZone16);
        org.joda.time.Chronology chronology27 = dateTime26.getChronology();
        org.joda.time.LocalDate localDate28 = new org.joda.time.LocalDate((long) 26403599, chronology27);
        org.joda.time.DateTimeField dateTimeField29 = chronology27.secondOfDay();
        org.joda.time.DateTimeField dateTimeField30 = chronology27.centuryOfEra();
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime(4557231841L, chronology27);
        org.joda.time.DateTimeField dateTimeField32 = chronology27.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone33 = chronology27.getZone();
        org.joda.time.DurationField durationField34 = chronology27.eras();
        org.joda.time.DurationField durationField35 = chronology27.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField34, durationField35, and durationField34", !(durationField34.compareTo(durationField35) == 0) || (Math.signum(durationField34.compareTo(durationField34)) == Math.signum(durationField35.compareTo(durationField34))));
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1015");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(0L);
        org.joda.time.Instant instant3 = instant1.plus((long) 43);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        boolean boolean7 = dateTimeZone6.isFixed();
        java.lang.String str8 = dateTimeZone6.toString();
        long long12 = dateTimeZone6.convertLocalToUTC((long) 0, true, (long) 64327);
        int int14 = dateTimeZone6.getOffset((long) 53);
        org.joda.time.LocalDate localDate15 = org.joda.time.LocalDate.now(dateTimeZone6);
        org.joda.time.DateTime dateTime16 = instant1.toDateTime(dateTimeZone6);
        org.joda.time.DateTime dateTime17 = dateTime16.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime19 = dateTime16.withMillisOfDay(812);
        org.joda.time.DateTime dateTime21 = dateTime19.plusHours(64455047);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime16", (instant1.compareTo(dateTime16) == 0) == instant1.equals(dateTime16));
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1016");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 292278993);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeFormatter7.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter7.withDefaultYear(64333);
        org.joda.time.Chronology chronology11 = dateTimeFormatter7.getChronolgy();
        java.lang.Object obj12 = null;
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((long) 0, chronology17);
        org.joda.time.DateTime.Property property19 = dateTime18.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.DateTime dateTime21 = dateTime18.plus(readableDuration20);
        org.joda.time.DateTime dateTime23 = dateTime18.withWeekOfWeekyear((int) (short) 10);
        int int24 = dateTimeZone15.getOffset((org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime(obj12, dateTimeZone15);
        org.joda.time.DateTime.Property property26 = dateTime25.year();
        org.joda.time.LocalTime localTime28 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime.Property property29 = localTime28.secondOfMinute();
        org.joda.time.LocalTime localTime31 = localTime28.plusMinutes((int) (short) 100);
        org.joda.time.LocalTime localTime33 = localTime31.withHourOfDay((int) (byte) 10);
        org.joda.time.Chronology chronology34 = localTime33.getChronology();
        org.joda.time.DateTimeField dateTimeField35 = chronology34.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone36 = chronology34.getZone();
        org.joda.time.DurationField durationField37 = chronology34.millis();
        org.joda.time.DateTime dateTime38 = dateTime25.withChronology(chronology34);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter39 = dateTimeFormatter7.withChronology(chronology34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime25 and dateTime38", (dateTime25.compareTo(dateTime38) == 0) == dateTime25.equals(dateTime38));
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1017");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime2.toMutableDateTime(chronology3);
        org.joda.time.DateTime dateTime6 = dateTime2.minus((long) '#');
        org.joda.time.DateTime dateTime8 = dateTime2.plusHours((int) (byte) 100);
        org.joda.time.DateTime dateTime10 = dateTime8.minusHours(9);
        org.joda.time.DateTime dateTime12 = dateTime8.minusSeconds(11);
        org.joda.time.DateTime dateTime14 = dateTime12.minusHours((-717648));
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.DateTime dateTime16 = dateTime12.minus(readableDuration15);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) 0, chronology18);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = dateTime19.toMutableDateTime(chronology20);
        org.joda.time.DateTime dateTime23 = dateTime19.minus((long) '#');
        org.joda.time.DateTime dateTime25 = dateTime19.withDayOfWeek(4);
        org.joda.time.LocalDate localDate26 = dateTime19.toLocalDate();
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        org.joda.time.LocalDate localDate28 = localDate26.plus(readablePeriod27);
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime((long) 0, chronology33);
        org.joda.time.DateTime.Property property35 = dateTime34.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration36 = null;
        org.joda.time.DateTime dateTime37 = dateTime34.plus(readableDuration36);
        org.joda.time.DateTime dateTime39 = dateTime34.withWeekOfWeekyear((int) (short) 10);
        int int40 = dateTimeZone31.getOffset((org.joda.time.ReadableInstant) dateTime39);
        org.joda.time.DateTime dateTime41 = localDate28.toDateTimeAtCurrentTime(dateTimeZone31);
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime((long) 0, chronology43);
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.MutableDateTime mutableDateTime46 = dateTime44.toMutableDateTime(chronology45);
        org.joda.time.DateTime dateTime48 = dateTime44.minus((long) '#');
        org.joda.time.DateTime dateTime50 = dateTime44.withDayOfWeek(4);
        org.joda.time.DateTime.Property property51 = dateTime50.minuteOfHour();
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.DateTime dateTime54 = new org.joda.time.DateTime((long) 0, chronology53);
        org.joda.time.DateTime.Property property55 = dateTime54.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration56 = null;
        org.joda.time.DateTime dateTime57 = dateTime54.plus(readableDuration56);
        org.joda.time.DateTime dateTime59 = dateTime54.withWeekOfWeekyear((int) (short) 10);
        boolean boolean60 = dateTime50.isBefore((org.joda.time.ReadableInstant) dateTime54);
        boolean boolean61 = dateTime54.isAfterNow();
        int int62 = dateTimeZone31.getOffset((org.joda.time.ReadableInstant) dateTime54);
        java.util.Locale locale65 = java.util.Locale.forLanguageTag("");
        java.util.Set<java.lang.String> strSet66 = locale65.getUnicodeLocaleAttributes();
        java.util.Locale locale68 = java.util.Locale.forLanguageTag("");
        java.lang.String str69 = locale68.getScript();
        java.lang.String str70 = locale65.getDisplayLanguage(locale68);
        java.lang.String str71 = locale68.getDisplayName();
        java.lang.String str72 = dateTimeZone31.getShortName(32L, locale68);
        org.joda.time.DateTime dateTime73 = dateTime16.toDateTime(dateTimeZone31);
        org.joda.time.DateTime dateTime75 = dateTime73.plusDays(914);
        org.joda.time.Chronology chronology77 = null;
        org.joda.time.DateTime dateTime78 = new org.joda.time.DateTime((long) 0, chronology77);
        org.joda.time.DateTime.Property property79 = dateTime78.yearOfCentury();
        org.joda.time.DateTime dateTime81 = dateTime78.minusSeconds(9);
        org.joda.time.Instant instant82 = dateTime78.toInstant();
        org.joda.time.Instant instant84 = instant82.plus((long) 849);
        int int85 = dateTime73.compareTo((org.joda.time.ReadableInstant) instant84);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant82", (dateTime2.compareTo(instant82) == 0) == dateTime2.equals(instant82));
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1018");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.yearOfCentury();
        org.joda.time.DateTime dateTime5 = dateTime2.minusSeconds(9);
        org.joda.time.DateTime.Property property6 = dateTime2.centuryOfEra();
        org.joda.time.DateTime dateTime7 = property6.withMinimumValue();
        org.joda.time.DateTime dateTime9 = property6.setCopy(64327);
        org.joda.time.MutableDateTime mutableDateTime10 = dateTime9.toMutableDateTimeISO();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.DurationFieldType durationFieldType12 = dateTimeFieldType11.getRangeDurationType();
        int int13 = dateTime9.get(dateTimeFieldType11);
        org.joda.time.Instant instant14 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime15 = instant14.toDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.DurationFieldType durationFieldType17 = dateTimeFieldType16.getDurationType();
        boolean boolean18 = dateTime15.isSupported(dateTimeFieldType16);
        int int19 = dateTime9.get(dateTimeFieldType16);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant14 and dateTime15", (instant14.compareTo(dateTime15) == 0) == instant14.equals(dateTime15));
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1019");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (byte) 0, dateTimeZone1);
        org.joda.time.LocalDate.Property property3 = localDate2.weekOfWeekyear();
        org.joda.time.LocalDate localDate4 = property3.roundHalfCeilingCopy();
        org.joda.time.LocalDate localDate5 = property3.roundCeilingCopy();
        org.joda.time.LocalDate.Property property6 = localDate5.dayOfYear();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) 0, chronology8);
        org.joda.time.DateTime.Property property10 = dateTime9.yearOfCentury();
        org.joda.time.DateTime dateTime12 = dateTime9.minusSeconds(9);
        int int13 = dateTime12.getWeekOfWeekyear();
        int int14 = property6.compareTo((org.joda.time.ReadableInstant) dateTime12);
        org.joda.time.DateTime.Property property15 = dateTime12.weekyear();
        org.joda.time.DateTime.Property property16 = dateTime12.dayOfYear();
        org.joda.time.DateTime dateTime17 = property16.roundFloorCopy();
        org.joda.time.DateTime dateTime18 = property16.roundHalfCeilingCopy();
        org.joda.time.DateTime dateTime20 = dateTime18.plusMonths(23);
        org.joda.time.Instant instant21 = dateTime20.toInstant();
        org.joda.time.Instant instant22 = instant21.toInstant();
        org.joda.time.Chronology chronology23 = instant21.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime20 and instant21", (dateTime20.compareTo(instant21) == 0) == dateTime20.equals(instant21));
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1020");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((long) 0, chronology5);
        org.joda.time.DateTime.Property property7 = dateTime6.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.DateTime dateTime9 = dateTime6.plus(readableDuration8);
        org.joda.time.DateTime dateTime11 = dateTime6.withWeekOfWeekyear((int) (short) 10);
        int int12 = dateTimeZone3.getOffset((org.joda.time.ReadableInstant) dateTime11);
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(obj0, dateTimeZone3);
        int int14 = dateTime13.getYear();
        org.joda.time.DateTime dateTime16 = dateTime13.minusMinutes(14);
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.DateTime dateTime18 = dateTime16.plus(readableDuration17);
        boolean boolean20 = dateTime16.isEqual((-457069L));
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime((long) 0, chronology26);
        org.joda.time.DateTime.Property property28 = dateTime27.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration29 = null;
        org.joda.time.DateTime dateTime30 = dateTime27.plus(readableDuration29);
        org.joda.time.DateTime dateTime32 = dateTime27.withWeekOfWeekyear((int) (short) 10);
        int int33 = dateTimeZone24.getOffset((org.joda.time.ReadableInstant) dateTime32);
        org.joda.time.DateTime dateTime35 = dateTime32.withYear(16);
        int int36 = dateTime32.getWeekOfWeekyear();
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime((long) 0, chronology38);
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.MutableDateTime mutableDateTime41 = dateTime39.toMutableDateTime(chronology40);
        org.joda.time.DateTime dateTime43 = dateTime39.minus((long) '#');
        org.joda.time.DateTime dateTime45 = dateTime39.withDayOfWeek(4);
        org.joda.time.LocalDate localDate46 = dateTime39.toLocalDate();
        org.joda.time.LocalDate.Property property47 = localDate46.dayOfWeek();
        org.joda.time.LocalDate localDate49 = localDate46.minusWeeks(0);
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.DateTime dateTime52 = new org.joda.time.DateTime((long) 0, chronology51);
        org.joda.time.DateTime.Property property53 = dateTime52.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration54 = null;
        org.joda.time.DateTime dateTime55 = dateTime52.plus(readableDuration54);
        org.joda.time.DateTimeFieldType dateTimeFieldType56 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int57 = dateTime55.get(dateTimeFieldType56);
        org.joda.time.Chronology chronology58 = null;
        boolean boolean59 = dateTimeFieldType56.isSupported(chronology58);
        boolean boolean60 = localDate49.isSupported(dateTimeFieldType56);
        boolean boolean61 = dateTime32.isSupported(dateTimeFieldType56);
        org.joda.time.Chronology chronology63 = null;
        org.joda.time.DateTime dateTime64 = new org.joda.time.DateTime((long) 0, chronology63);
        org.joda.time.Chronology chronology65 = null;
        org.joda.time.MutableDateTime mutableDateTime66 = dateTime64.toMutableDateTime(chronology65);
        org.joda.time.DateTime dateTime68 = dateTime64.minus((long) '#');
        org.joda.time.DateTime dateTime70 = dateTime64.withDayOfWeek(4);
        org.joda.time.LocalDate localDate71 = dateTime64.toLocalDate();
        org.joda.time.ReadablePeriod readablePeriod72 = null;
        org.joda.time.LocalDate localDate73 = localDate71.plus(readablePeriod72);
        java.util.Locale.FilteringMode filteringMode74 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        boolean boolean75 = localDate71.equals((java.lang.Object) filteringMode74);
        org.joda.time.LocalDate.Property property76 = localDate71.year();
        org.joda.time.LocalDate localDate77 = property76.roundHalfEvenCopy();
        org.joda.time.DateTimeZone dateTimeZone78 = null;
        org.joda.time.DateTime dateTime79 = localDate77.toDateTimeAtCurrentTime(dateTimeZone78);
        org.joda.time.Chronology chronology80 = dateTime79.getChronology();
        org.joda.time.DateTime dateTime81 = dateTime32.toDateTime(chronology80);
        org.joda.time.DateTimeField dateTimeField82 = chronology80.weekyearOfCentury();
        org.joda.time.DateTime dateTime83 = new org.joda.time.DateTime((-58874987916663L), chronology80);
        org.joda.time.DateTime dateTime84 = dateTime16.toDateTime(chronology80);
        org.joda.time.DateTime.Property property85 = dateTime16.centuryOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and dateTime84", (dateTime16.compareTo(dateTime84) == 0) == dateTime16.equals(dateTime84));
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1021");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) 0, chronology4);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = dateTime5.toMutableDateTime(chronology6);
        org.joda.time.DateTime dateTime9 = dateTime5.minus((long) '#');
        org.joda.time.DateTime dateTime11 = dateTime5.withDayOfWeek(4);
        org.joda.time.LocalDate localDate12 = dateTime5.toLocalDate();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDate localDate14 = localDate12.plus(readablePeriod13);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) 0, chronology16);
        org.joda.time.DateTime.Property property18 = dateTime17.yearOfCentury();
        org.joda.time.DateTime dateTime20 = dateTime17.minusSeconds(9);
        org.joda.time.DateTime dateTime22 = dateTime17.minusMinutes(6);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        java.util.TimeZone timeZone26 = dateTimeZone25.toTimeZone();
        org.joda.time.DateTime dateTime27 = dateTime22.withZone(dateTimeZone25);
        org.joda.time.DateTime dateTime28 = localDate14.toDateTimeAtMidnight(dateTimeZone25);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = dateTimeFormatter2.withZone(dateTimeZone25);
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.DateTimeField dateTimeField32 = dateTimeFieldType30.getField(chronology31);
        org.joda.time.ReadablePartial readablePartial33 = null;
        java.util.Locale locale36 = java.util.Locale.forLanguageTag("");
        java.lang.String str37 = dateTimeField32.getAsShortText(readablePartial33, (int) (byte) 1, locale36);
        java.util.Locale locale39 = java.util.Locale.forLanguageTag("");
        java.lang.String str40 = locale39.getScript();
        java.lang.String str41 = locale36.getDisplayVariant(locale39);
        java.lang.String str42 = locale36.getScript();
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.DateTime dateTime46 = new org.joda.time.DateTime((long) 0, chronology45);
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.MutableDateTime mutableDateTime48 = dateTime46.toMutableDateTime(chronology47);
        org.joda.time.DateTime dateTime50 = dateTime46.minus((long) '#');
        org.joda.time.DateTime dateTime52 = dateTime46.withDayOfWeek(4);
        org.joda.time.LocalDate localDate53 = dateTime46.toLocalDate();
        org.joda.time.ReadablePeriod readablePeriod54 = null;
        org.joda.time.LocalDate localDate55 = localDate53.plus(readablePeriod54);
        org.joda.time.DateTimeZone dateTimeZone58 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.Chronology chronology60 = null;
        org.joda.time.DateTime dateTime61 = new org.joda.time.DateTime((long) 0, chronology60);
        org.joda.time.DateTime.Property property62 = dateTime61.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration63 = null;
        org.joda.time.DateTime dateTime64 = dateTime61.plus(readableDuration63);
        org.joda.time.DateTime dateTime66 = dateTime61.withWeekOfWeekyear((int) (short) 10);
        int int67 = dateTimeZone58.getOffset((org.joda.time.ReadableInstant) dateTime66);
        org.joda.time.DateTime dateTime68 = localDate55.toDateTimeAtCurrentTime(dateTimeZone58);
        org.joda.time.Chronology chronology69 = dateTime68.getChronology();
        org.joda.time.LocalDate localDate70 = new org.joda.time.LocalDate((long) 26403599, chronology69);
        org.joda.time.DateTimeField dateTimeField71 = chronology69.weekOfWeekyear();
        java.util.Locale locale73 = java.util.Locale.KOREAN;
        java.lang.String str74 = dateTimeField71.getAsText(97, locale73);
        java.lang.String str75 = locale36.getDisplayCountry(locale73);
        java.util.Locale locale77 = java.util.Locale.forLanguageTag("1 Jan 1970 00:00:00 GMT");
        java.lang.String str78 = locale36.getDisplayLanguage(locale77);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter79 = dateTimeFormatter29.withLocale(locale36);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter81 = dateTimeFormatter29.withPivotYear((java.lang.Integer) 64363);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter83 = dateTimeFormatter81.withPivotYear(0);
        org.joda.time.DateTimeZone dateTimeZone84 = dateTimeFormatter81.getZone();
        org.joda.time.LocalDate localDate85 = new org.joda.time.LocalDate(dateTimeZone84);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime22 and dateTime27", (dateTime22.compareTo(dateTime27) == 0) == dateTime22.equals(dateTime27));
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1022");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withDefaultYear(86399999);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withZoneUTC();
        java.util.Locale locale7 = dateTimeFormatter6.getLocale();
        org.joda.time.Chronology chronology8 = dateTimeFormatter6.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter6.withPivotYear(23);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) 0, chronology12);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = dateTime13.toMutableDateTime(chronology14);
        org.joda.time.DateTime dateTime17 = dateTime13.minus((long) '#');
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        org.joda.time.DateTime dateTime19 = dateTime13.minus(readablePeriod18);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        java.lang.String str24 = dateTimeZone22.getShortName((long) (byte) -1);
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime((java.lang.Object) dateTime19, dateTimeZone22);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = dateTimeFormatter6.withZone(dateTimeZone22);
        java.util.Calendar calendar27 = java.util.Calendar.getInstance();
        int int29 = calendar27.getMinimum(0);
        calendar27.clear();
        calendar27.clear();
        java.util.TimeZone timeZone33 = java.util.TimeZone.getTimeZone("South Korea");
        int int34 = timeZone33.getRawOffset();
        calendar27.setTimeZone(timeZone33);
        org.joda.time.LocalDateTime localDateTime38 = new org.joda.time.LocalDateTime();
        boolean boolean40 = localDateTime38.equals((java.lang.Object) (-1L));
        org.joda.time.LocalDateTime localDateTime42 = localDateTime38.withWeekyear(5);
        org.joda.time.LocalDateTime.Property property43 = localDateTime42.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime44 = property43.roundCeilingCopy();
        org.joda.time.DurationField durationField45 = property43.getLeapDurationField();
        java.util.Locale locale47 = java.util.Locale.forLanguageTag("");
        java.util.Set<java.lang.String> strSet48 = locale47.getUnicodeLocaleAttributes();
        int int49 = property43.getMaximumShortTextLength(locale47);
        java.lang.String str50 = locale47.getDisplayCountry();
        java.util.Map<java.lang.String, java.lang.Integer> strMap51 = calendar27.getDisplayNames((int) (byte) 1, 0, locale47);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter52 = dateTimeFormatter6.withLocale(locale47);
        org.joda.time.DateTimeZone dateTimeZone53 = dateTimeFormatter6.getZone();
        org.joda.time.Chronology chronology54 = dateTimeFormatter6.getChronolgy();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime13 and dateTime25", (dateTime13.compareTo(dateTime25) == 0) == dateTime13.equals(dateTime25));
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1023");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime2.toMutableDateTime(chronology3);
        org.joda.time.DateTime dateTime6 = dateTime2.minus((long) '#');
        org.joda.time.DateTime dateTime8 = dateTime2.withDayOfWeek(4);
        org.joda.time.LocalDate localDate9 = dateTime2.toLocalDate();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDate localDate11 = localDate9.plus(readablePeriod10);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) 0, chronology16);
        org.joda.time.DateTime.Property property18 = dateTime17.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration19 = null;
        org.joda.time.DateTime dateTime20 = dateTime17.plus(readableDuration19);
        org.joda.time.DateTime dateTime22 = dateTime17.withWeekOfWeekyear((int) (short) 10);
        int int23 = dateTimeZone14.getOffset((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.DateTime dateTime24 = localDate11.toDateTimeAtCurrentTime(dateTimeZone14);
        org.joda.time.Chronology chronology25 = dateTime24.getChronology();
        org.joda.time.DurationField durationField26 = chronology25.eras();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetHours(1);
        org.joda.time.Chronology chronology29 = chronology25.withZone(dateTimeZone28);
        int int31 = dateTimeZone28.getStandardOffset((-9000L));
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime((long) 0, chronology33);
        org.joda.time.DateTime.Property property35 = dateTime34.yearOfCentury();
        org.joda.time.DateTime dateTime37 = dateTime34.minusSeconds(9);
        org.joda.time.DateTime dateTime39 = dateTime34.plusMonths(1969);
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.DateTime dateTime42 = new org.joda.time.DateTime((long) 0, chronology41);
        org.joda.time.DateTime.Property property43 = dateTime42.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration44 = null;
        org.joda.time.DateTime dateTime45 = dateTime42.plus(readableDuration44);
        org.joda.time.DateTimeFieldType dateTimeFieldType46 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int47 = dateTime45.get(dateTimeFieldType46);
        org.joda.time.DateTime dateTime48 = dateTime45.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime52 = dateTime45.toDateTime(dateTimeZone51);
        int int54 = dateTimeZone51.getStandardOffset((long) '4');
        long long57 = dateTimeZone51.convertLocalToUTC((long) 86399999, false);
        org.joda.time.tz.NameProvider nameProvider59 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale60 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str63 = nameProvider59.getName(locale60, "712", "java.util.GregorianCalendar[time=1645514401770,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=20,SECOND=1,MILLISECOND=770,ZONE_OFFSET=0,DST_OFFSET=0]");
        java.lang.String str64 = dateTimeZone51.getName((long) (short) 100, locale60);
        java.util.TimeZone timeZone65 = dateTimeZone51.toTimeZone();
        org.joda.time.DateTime dateTime66 = dateTime34.withZone(dateTimeZone51);
        int int67 = dateTimeZone28.getOffset((org.joda.time.ReadableInstant) dateTime34);
        int int68 = dateTime34.getDayOfWeek();
        int int69 = dateTime34.getDayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime52", (dateTime2.compareTo(dateTime52) == 0) == dateTime2.equals(dateTime52));
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1024");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder4 = builder0.setDate(9, 807, (int) (byte) 1);
        java.util.Calendar.Builder builder8 = builder0.setWeekDate(0, (-95), (int) (short) 1);
        java.util.Calendar.Builder builder12 = builder0.setDate(6, 16, 37920032);
        java.util.Calendar.Builder builder16 = builder0.setTimeOfDay(32772, (int) (short) -1, 2);
        java.util.Locale.Category category17 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale18 = java.util.Locale.getDefault(category17);
        java.util.Locale locale19 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale20 = locale19.stripExtensions();
        java.lang.String str21 = locale18.getDisplayLanguage(locale20);
        java.util.Calendar.Builder builder22 = builder16.setLocale(locale20);
        java.util.Calendar.Builder builder27 = builder16.setTimeOfDay(26722774, 67, 99, 956);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime((long) 0, chronology29);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.MutableDateTime mutableDateTime32 = dateTime30.toMutableDateTime(chronology31);
        org.joda.time.DateTime dateTime34 = dateTime30.minus((long) '#');
        org.joda.time.DateTime dateTime36 = dateTime30.withDayOfWeek(4);
        org.joda.time.LocalDate localDate37 = dateTime30.toLocalDate();
        org.joda.time.ReadablePeriod readablePeriod38 = null;
        org.joda.time.LocalDate localDate39 = localDate37.plus(readablePeriod38);
        java.util.Locale.FilteringMode filteringMode40 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        boolean boolean41 = localDate37.equals((java.lang.Object) filteringMode40);
        org.joda.time.LocalDate.Property property42 = localDate37.year();
        org.joda.time.LocalDate localDate43 = property42.roundHalfEvenCopy();
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.DateTime dateTime45 = localDate43.toDateTimeAtCurrentTime(dateTimeZone44);
        org.joda.time.Chronology chronology46 = dateTime45.getChronology();
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.DateTime dateTime49 = new org.joda.time.DateTime((long) 0, chronology48);
        org.joda.time.DateTime.Property property50 = dateTime49.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration51 = null;
        org.joda.time.DateTime dateTime52 = dateTime49.plus(readableDuration51);
        org.joda.time.DateTimeFieldType dateTimeFieldType53 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int54 = dateTime52.get(dateTimeFieldType53);
        org.joda.time.DateTime dateTime55 = dateTime52.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone58 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime59 = dateTime52.toDateTime(dateTimeZone58);
        int int61 = dateTimeZone58.getStandardOffset((long) '4');
        org.joda.time.DateTime dateTime62 = dateTime45.withZoneRetainFields(dateTimeZone58);
        org.joda.time.DateTimeZone dateTimeZone63 = dateTime62.getZone();
        java.util.Locale locale67 = new java.util.Locale("0", "java.util.GregorianCalendar[time=1645514401770,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=20,SECOND=1,MILLISECOND=770,ZONE_OFFSET=0,DST_OFFSET=0]");
        java.util.Locale locale68 = locale67.stripExtensions();
        java.lang.String str69 = dateTimeZone63.getShortName((long) 37919965, locale68);
        java.util.Set<java.lang.String> strSet70 = locale68.getUnicodeLocaleAttributes();
        java.util.Calendar.Builder builder71 = builder27.setLocale(locale68);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime30 and dateTime59", (dateTime30.compareTo(dateTime59) == 0) == dateTime30.equals(dateTime59));
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1025");
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        boolean boolean5 = dateTimeZone4.isFixed();
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((long) (byte) 100, dateTimeZone4);
        int int7 = dateTime6.getCenturyOfEra();
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.DateTime dateTime9 = dateTime6.minus(readableDuration8);
        org.joda.time.DateTime.Property property10 = dateTime9.secondOfMinute();
        int int11 = dateTime9.getSecondOfDay();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetMillis(64354167);
        java.lang.String str14 = dateTimeZone13.toString();
        java.lang.String str16 = dateTimeZone13.getNameKey(1646006400000L);
        org.joda.time.MutableDateTime mutableDateTime17 = dateTime9.toMutableDateTime(dateTimeZone13);
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(1296000032L, dateTimeZone13);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and mutableDateTime17", (dateTime6.compareTo(mutableDateTime17) == 0) == dateTime6.equals(mutableDateTime17));
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1026");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime2.toMutableDateTime(chronology3);
        org.joda.time.DateTime dateTime6 = dateTime2.minus((long) '#');
        org.joda.time.DateTime dateTime8 = dateTime2.withDayOfWeek(4);
        org.joda.time.LocalDate localDate9 = dateTime2.toLocalDate();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDate localDate11 = localDate9.plus(readablePeriod10);
        org.joda.time.LocalDate.Property property12 = localDate11.weekyear();
        org.joda.time.LocalDate localDate13 = property12.withMinimumValue();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((long) 0, chronology15);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = dateTime16.toMutableDateTime(chronology17);
        org.joda.time.DateTime dateTime20 = dateTime16.minus((long) '#');
        org.joda.time.DateTime dateTime22 = dateTime16.withDayOfWeek(4);
        org.joda.time.LocalDate localDate23 = dateTime16.toLocalDate();
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateTime dateTime25 = localDate23.toDateTimeAtMidnight(dateTimeZone24);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime((long) 0, chronology27);
        org.joda.time.DateTime.Property property29 = dateTime28.yearOfCentury();
        org.joda.time.DateTime dateTime31 = dateTime28.minusSeconds(9);
        org.joda.time.DateTime dateTime33 = dateTime28.minusMinutes(6);
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        java.util.TimeZone timeZone37 = dateTimeZone36.toTimeZone();
        org.joda.time.DateTime dateTime38 = dateTime33.withZone(dateTimeZone36);
        org.joda.time.DateTime dateTime39 = localDate23.toDateTimeAtMidnight(dateTimeZone36);
        int int40 = property12.compareTo((org.joda.time.ReadableInstant) dateTime39);
        org.joda.time.YearMonthDay yearMonthDay41 = dateTime39.toYearMonthDay();
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime((long) 0, chronology43);
        org.joda.time.DateTime.Property property45 = dateTime44.yearOfCentury();
        org.joda.time.DateTime dateTime47 = dateTime44.minusSeconds(9);
        org.joda.time.DateTime dateTime49 = dateTime44.minusMinutes(6);
        int int50 = dateTime44.getMinuteOfHour();
        int int51 = dateTime44.getWeekyear();
        org.joda.time.DateTime dateTime53 = dateTime44.plusMillis(64348274);
        org.joda.time.DateTime dateTime55 = dateTime53.minusYears(134);
        org.joda.time.DateTime dateTime57 = dateTime53.withMillisOfDay(15856061);
        int int58 = dateTime39.compareTo((org.joda.time.ReadableInstant) dateTime57);
        org.joda.time.Instant instant59 = dateTime39.toInstant();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime33 and dateTime38", (dateTime33.compareTo(dateTime38) == 0) == dateTime33.equals(dateTime38));
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1027");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withZoneUTC();
        java.util.Locale locale5 = java.util.Locale.forLanguageTag("");
        java.util.Set<java.lang.String> strSet6 = locale5.getUnicodeLocaleAttributes();
        java.util.Locale locale8 = java.util.Locale.forLanguageTag("");
        java.lang.String str9 = locale8.getScript();
        java.lang.String str10 = locale5.getDisplayLanguage(locale8);
        java.lang.String str11 = locale8.getDisplayName();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter2.withLocale(locale8);
        boolean boolean13 = dateTimeFormatter12.isParser();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((long) 0, chronology15);
        org.joda.time.DateTime.Property property17 = dateTime16.yearOfCentury();
        org.joda.time.DateTime dateTime19 = dateTime16.minusSeconds(9);
        org.joda.time.DateTime dateTime21 = dateTime16.minusMinutes(6);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        java.util.TimeZone timeZone25 = dateTimeZone24.toTimeZone();
        org.joda.time.DateTime dateTime26 = dateTime21.withZone(dateTimeZone24);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = dateTimeFormatter12.withZone(dateTimeZone24);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = dateTimeFormatter27.withDefaultYear(3600000);
        java.util.Locale.Builder builder30 = new java.util.Locale.Builder();
        java.util.Locale locale31 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale.Builder builder32 = builder30.setLocale(locale31);
        java.util.Locale locale33 = java.util.Locale.US;
        java.lang.String str34 = locale33.getISO3Language();
        java.util.Locale.Builder builder35 = builder32.setLocale(locale33);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter36 = dateTimeFormatter27.withLocale(locale33);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter38 = dateTimeFormatter36.withPivotYear((java.lang.Integer) 292278994);
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter40 = dateTimeFormatter36.withChronology(chronology39);
        org.joda.time.format.DateTimePrinter dateTimePrinter41 = dateTimeFormatter40.getPrinter();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime21 and dateTime26", (dateTime21.compareTo(dateTime26) == 0) == dateTime21.equals(dateTime26));
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1028");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField(chronology1);
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime.Property property5 = localTime4.secondOfMinute();
        int int6 = dateTimeField2.getMinimumValue((org.joda.time.ReadablePartial) localTime4);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime(dateTimeZone7);
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime localTime11 = localTime8.withFields((org.joda.time.ReadablePartial) localTime10);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime(dateTimeZone12);
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime localTime16 = localTime13.withFields((org.joda.time.ReadablePartial) localTime15);
        int int17 = localTime10.compareTo((org.joda.time.ReadablePartial) localTime13);
        int int18 = localTime13.getHourOfDay();
        int int19 = localTime4.compareTo((org.joda.time.ReadablePartial) localTime13);
        org.joda.time.LocalTime localTime21 = localTime13.minusHours(23);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((long) 0, chronology23);
        org.joda.time.DateTime.Property property25 = dateTime24.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration26 = null;
        org.joda.time.DateTime dateTime27 = dateTime24.plus(readableDuration26);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime((long) 0, chronology29);
        org.joda.time.DateTime.Property property31 = dateTime30.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration32 = null;
        org.joda.time.DateTime dateTime33 = dateTime30.plus(readableDuration32);
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int35 = dateTime33.get(dateTimeFieldType34);
        boolean boolean36 = dateTime27.isEqual((org.joda.time.ReadableInstant) dateTime33);
        org.joda.time.DateTime dateTime38 = dateTime33.minusHours((int) '4');
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime42 = dateTime38.toDateTime(dateTimeZone41);
        boolean boolean43 = localTime21.equals((java.lang.Object) dateTime42);
        int int44 = dateTime42.getMillisOfSecond();
        org.joda.time.DateTime.Property property45 = dateTime42.monthOfYear();
        java.util.Locale locale46 = null;
        java.lang.String str47 = property45.getAsText(locale46);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime38 and dateTime42", (dateTime38.compareTo(dateTime42) == 0) == dateTime38.equals(dateTime42));
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1029");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime2.toMutableDateTime(chronology3);
        org.joda.time.DateTime dateTime6 = dateTime2.minus((long) '#');
        org.joda.time.DateTime dateTime8 = dateTime2.plusHours((int) (byte) 100);
        org.joda.time.DateTime dateTime10 = dateTime8.minusHours(9);
        java.lang.Object obj11 = null;
        boolean boolean12 = dateTime8.equals(obj11);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        java.util.TimeZone timeZone16 = dateTimeZone15.toTimeZone();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) 0, chronology18);
        org.joda.time.DateTime.Property property20 = dateTime19.yearOfCentury();
        org.joda.time.DateTime dateTime22 = dateTime19.minusSeconds(9);
        org.joda.time.DateTime dateTime24 = dateTime19.minusMinutes(6);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        java.util.TimeZone timeZone28 = dateTimeZone27.toTimeZone();
        org.joda.time.DateTime dateTime29 = dateTime24.withZone(dateTimeZone27);
        long long31 = dateTimeZone15.getMillisKeepLocal(dateTimeZone27, (long) 632);
        org.joda.time.DateTime dateTime32 = dateTime8.toDateTime(dateTimeZone15);
        org.joda.time.DateTime.Property property33 = dateTime32.era();
        org.joda.time.DateTime dateTime34 = dateTime32.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime36 = dateTime34.minusMillis(999);
        org.joda.time.MutableDateTime mutableDateTime37 = dateTime34.toMutableDateTimeISO();
        java.util.Calendar calendar38 = java.util.Calendar.getInstance();
        int int40 = calendar38.getMaximum(11);
        calendar38.set((int) (short) 100, (int) '4', (int) (short) 0, (int) (short) -1, 821);
        java.lang.String str47 = calendar38.getCalendarType();
        int int49 = calendar38.getMinimum(0);
        java.util.Date date50 = calendar38.getTime();
        int int51 = date50.getDay();
        date50.setMinutes(32772);
        int int54 = date50.getHours();
        int int55 = date50.getMinutes();
        date50.setHours(64358004);
        int int58 = date50.getYear();
        java.util.Date date65 = new java.util.Date(64383438, 64367, 195, 83606132, 13, 31536000);
        org.joda.time.LocalDate localDate66 = org.joda.time.LocalDate.fromDateFields(date65);
        boolean boolean67 = date50.before(date65);
        int int68 = date65.getMonth();
        boolean boolean69 = mutableDateTime37.equals((java.lang.Object) date65);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and dateTime32", (dateTime8.compareTo(dateTime32) == 0) == dateTime8.equals(dateTime32));
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1030");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (byte) 0, dateTimeZone1);
        org.joda.time.LocalDate.Property property3 = localDate2.weekOfWeekyear();
        org.joda.time.LocalDate localDate4 = property3.roundHalfCeilingCopy();
        org.joda.time.LocalDate localDate5 = property3.roundCeilingCopy();
        org.joda.time.LocalDate.Property property6 = localDate5.dayOfYear();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) 0, chronology8);
        org.joda.time.DateTime.Property property10 = dateTime9.yearOfCentury();
        org.joda.time.DateTime dateTime12 = dateTime9.minusSeconds(9);
        int int13 = dateTime12.getWeekOfWeekyear();
        int int14 = property6.compareTo((org.joda.time.ReadableInstant) dateTime12);
        org.joda.time.DateTime.Property property15 = dateTime12.weekyear();
        java.lang.String str16 = property15.getAsShortText();
        org.joda.time.DateTime dateTime18 = property15.addToCopy(64333);
        org.joda.time.DateTime dateTime19 = property15.withMaximumValue();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate((long) (byte) 0, dateTimeZone21);
        org.joda.time.LocalDate.Property property23 = localDate22.weekOfWeekyear();
        org.joda.time.LocalDate localDate24 = property23.roundHalfCeilingCopy();
        org.joda.time.LocalDate localDate25 = property23.roundCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        boolean boolean29 = dateTimeZone28.isFixed();
        org.joda.time.DateMidnight dateMidnight30 = localDate25.toDateMidnight(dateTimeZone28);
        long long32 = dateTimeZone28.convertUTCToLocal((long) 632);
        int int34 = dateTimeZone28.getStandardOffset(53L);
        int int36 = dateTimeZone28.getOffset(38348076L);
        org.joda.time.DateTime dateTime37 = dateTime19.toDateTime(dateTimeZone28);
        java.util.Locale locale40 = new java.util.Locale("Japanisch (Japan)", "java.util.GregorianCalendar[time=1645514489030,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"South Korea\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=21,SECOND=29,MILLISECOND=30,ZONE_OFFSET=0,DST_OFFSET=0]");
        java.util.Locale locale41 = java.util.Locale.ENGLISH;
        java.lang.String str42 = locale41.getISO3Language();
        java.lang.String str43 = locale40.getDisplayVariant(locale41);
        java.util.Calendar calendar44 = dateTime37.toCalendar(locale40);
        int int45 = calendar44.getMinimalDaysInFirstWeek();
        org.joda.time.LocalDateTime localDateTime46 = org.joda.time.LocalDateTime.fromCalendarFields(calendar44);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime19 and dateTime37", (dateTime19.compareTo(dateTime37) == 0) == dateTime19.equals(dateTime37));
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1031");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.yearOfCentury();
        org.joda.time.DateTime dateTime4 = property3.roundFloorCopy();
        org.joda.time.DateTime dateTime5 = property3.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime6 = property3.withMaximumValue();
        org.joda.time.DateTime dateTime7 = property3.roundCeilingCopy();
        org.joda.time.DateTime dateTime9 = dateTime7.plusMillis((-95));
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime.Property property12 = localTime11.secondOfMinute();
        org.joda.time.LocalTime localTime14 = localTime11.plusMinutes((int) (short) 100);
        org.joda.time.LocalTime localTime16 = localTime14.withHourOfDay((int) (byte) 10);
        org.joda.time.Chronology chronology17 = localTime16.getChronology();
        org.joda.time.DurationField durationField18 = chronology17.weekyears();
        org.joda.time.MutableDateTime mutableDateTime19 = dateTime7.toMutableDateTime(chronology17);
        org.joda.time.DateTime dateTime21 = dateTime7.minus((long) 54);
        org.joda.time.ReadableDuration readableDuration22 = null;
        org.joda.time.DateTime dateTime23 = dateTime7.plus(readableDuration22);
        int int24 = dateTime23.getYearOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime23 and mutableDateTime19", (dateTime23.compareTo(mutableDateTime19) == 0) == dateTime23.equals(mutableDateTime19));
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1032");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) 64364030);
        org.joda.time.Chronology chronology2 = instant1.getChronology();
        org.joda.time.Instant instant3 = instant1.toInstant();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.Instant instant6 = instant1.withDurationAdded(readableDuration4, 800);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) 0, chronology8);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = dateTime9.toMutableDateTime(chronology10);
        org.joda.time.DateTime dateTime13 = dateTime9.minus((long) '#');
        org.joda.time.DateTime dateTime15 = dateTime9.withDayOfWeek(4);
        org.joda.time.LocalDate localDate16 = dateTime9.toLocalDate();
        org.joda.time.DateTime.Property property17 = dateTime9.centuryOfEra();
        org.joda.time.DateTime dateTime18 = property17.roundHalfFloorCopy();
        org.joda.time.Instant instant19 = new org.joda.time.Instant((java.lang.Object) dateTime18);
        int int20 = instant6.compareTo((org.joda.time.ReadableInstant) instant19);
        boolean boolean22 = instant6.isAfter((long) 604);
        org.joda.time.Instant instant24 = instant6.withMillis(52L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime18 and instant19", (dateTime18.compareTo(instant19) == 0) == dateTime18.equals(instant19));
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1033");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime2.plus(readableDuration4);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int7 = dateTime5.get(dateTimeFieldType6);
        int int8 = dateTime5.getWeekyear();
        java.lang.String str9 = dateTime5.toString();
        org.joda.time.MutableDateTime mutableDateTime10 = dateTime5.toMutableDateTime();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) 0, chronology12);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = dateTime13.toMutableDateTime(chronology14);
        org.joda.time.DateTime dateTime17 = dateTime13.minus((long) '#');
        org.joda.time.DateTime dateTime19 = dateTime13.withDayOfWeek(4);
        org.joda.time.DateTime.Property property20 = dateTime19.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime((long) 0, chronology25);
        org.joda.time.DateTime.Property property27 = dateTime26.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration28 = null;
        org.joda.time.DateTime dateTime29 = dateTime26.plus(readableDuration28);
        org.joda.time.DateTime dateTime31 = dateTime26.withWeekOfWeekyear((int) (short) 10);
        int int32 = dateTimeZone23.getOffset((org.joda.time.ReadableInstant) dateTime31);
        org.joda.time.LocalTime localTime33 = new org.joda.time.LocalTime((java.lang.Object) dateTime19, dateTimeZone23);
        java.lang.String str35 = dateTimeZone23.getNameKey((long) 5);
        boolean boolean36 = dateTimeZone23.isFixed();
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime(dateTimeZone23);
        boolean boolean38 = mutableDateTime10.isEqual((org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.LocalTime localTime40 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime.Property property41 = localTime40.secondOfMinute();
        org.joda.time.LocalTime localTime43 = localTime40.plusMinutes((int) (short) 100);
        org.joda.time.LocalTime localTime45 = localTime43.withHourOfDay((int) (byte) 10);
        org.joda.time.Chronology chronology46 = localTime45.getChronology();
        org.joda.time.DurationField durationField47 = chronology46.days();
        org.joda.time.DurationField durationField48 = chronology46.years();
        org.joda.time.DateTimeField dateTimeField49 = chronology46.clockhourOfDay();
        org.joda.time.DurationField durationField50 = chronology46.halfdays();
        org.joda.time.MutableDateTime mutableDateTime51 = mutableDateTime10.toMutableDateTime(chronology46);
        org.joda.time.DateTimeField dateTimeField52 = chronology46.monthOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and mutableDateTime51", (dateTime2.compareTo(mutableDateTime51) == 0) == dateTime2.equals(mutableDateTime51));
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1034");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType2.getField(chronology3);
        org.joda.time.LocalTime localTime6 = localTime1.withField(dateTimeFieldType2, 4);
        org.joda.time.LocalTime.Property property7 = localTime6.millisOfDay();
        int int8 = property7.getMaximumValueOverall();
        org.joda.time.LocalTime localTime10 = property7.addWrapFieldToCopy(12);
        org.joda.time.DateTime dateTime11 = localTime10.toDateTimeToday();
        org.joda.time.DateTime.Property property12 = dateTime11.dayOfYear();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) 0, chronology14);
        org.joda.time.DateTime.Property property16 = dateTime15.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone17 = dateTime15.getZone();
        org.joda.time.LocalTime localTime18 = org.joda.time.LocalTime.now(dateTimeZone17);
        java.lang.String str19 = dateTimeZone17.getID();
        org.joda.time.DateTime dateTime20 = dateTime11.toDateTime(dateTimeZone17);
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.DateTimeField dateTimeField23 = dateTimeFieldType21.getField(chronology22);
        org.joda.time.LocalTime localTime25 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime.Property property26 = localTime25.secondOfMinute();
        int int27 = dateTimeField23.getMinimumValue((org.joda.time.ReadablePartial) localTime25);
        org.joda.time.LocalTime localTime29 = localTime25.plusMinutes((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField31 = localTime25.getField((int) (short) 0);
        org.joda.time.LocalTime.Property property32 = localTime25.secondOfMinute();
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        org.joda.time.LocalTime localTime34 = localTime25.minus(readablePeriod33);
        org.joda.time.LocalTime.Property property35 = localTime34.millisOfSecond();
        boolean boolean36 = dateTime11.equals((java.lang.Object) localTime34);
        org.joda.time.LocalTime localTime38 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime.Property property39 = localTime38.secondOfMinute();
        org.joda.time.LocalTime localTime41 = localTime38.plusMinutes((int) (short) 100);
        org.joda.time.LocalTime localTime43 = localTime41.withHourOfDay((int) (byte) 10);
        org.joda.time.Chronology chronology44 = localTime43.getChronology();
        org.joda.time.DateTimeField dateTimeField45 = chronology44.clockhourOfHalfday();
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.LocalTime localTime48 = new org.joda.time.LocalTime((long) '#', chronology47);
        org.joda.time.ReadablePeriod readablePeriod49 = null;
        org.joda.time.LocalTime localTime50 = localTime48.plus(readablePeriod49);
        long long52 = chronology44.set((org.joda.time.ReadablePartial) localTime48, (long) 32);
        org.joda.time.DateTimeField dateTimeField53 = chronology44.hourOfDay();
        org.joda.time.DurationField durationField54 = chronology44.halfdays();
        org.joda.time.DurationField durationField55 = chronology44.years();
        org.joda.time.DateTime dateTime56 = dateTime11.toDateTime(chronology44);
        org.joda.time.DateTime dateTime57 = dateTime11.toDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime57 and dateTime56", (dateTime57.compareTo(dateTime56) == 0) == dateTime57.equals(dateTime56));
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1035");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime2.plus(readableDuration4);
        org.joda.time.DateTime dateTime7 = dateTime2.withWeekOfWeekyear((int) (short) 10);
        org.joda.time.DateTime dateTime9 = dateTime7.withYearOfEra(5);
        org.joda.time.DateTime dateTime11 = dateTime7.plusHours((int) (byte) 10);
        org.joda.time.DateTime dateTime13 = dateTime7.plusWeeks((int) (byte) 0);
        org.joda.time.YearMonthDay yearMonthDay14 = dateTime7.toYearMonthDay();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHours(1);
        java.util.TimeZone timeZone17 = dateTimeZone16.toTimeZone();
        org.joda.time.DateTime dateTime18 = dateTime7.toDateTime(dateTimeZone16);
        org.joda.time.DateTime dateTime20 = dateTime18.minusMinutes(704);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.LocalTime localTime22 = new org.joda.time.LocalTime(dateTimeZone21);
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.DateTimeField dateTimeField25 = dateTimeFieldType23.getField(chronology24);
        org.joda.time.LocalTime localTime27 = localTime22.withField(dateTimeFieldType23, 4);
        org.joda.time.LocalTime.Property property28 = localTime27.millisOfDay();
        int int29 = property28.getMaximumValueOverall();
        org.joda.time.LocalTime localTime31 = property28.addWrapFieldToCopy(12);
        org.joda.time.DateTime dateTime32 = localTime31.toDateTimeToday();
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.LocalTime localTime34 = new org.joda.time.LocalTime(dateTimeZone33);
        org.joda.time.DateTimeFieldType dateTimeFieldType35 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.DateTimeField dateTimeField37 = dateTimeFieldType35.getField(chronology36);
        org.joda.time.LocalTime localTime39 = localTime34.withField(dateTimeFieldType35, 4);
        org.joda.time.LocalTime localTime41 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime.Property property42 = localTime41.secondOfMinute();
        org.joda.time.LocalTime localTime44 = localTime41.plusMinutes((int) (short) 100);
        org.joda.time.LocalTime localTime46 = localTime44.withHourOfDay((int) (byte) 10);
        org.joda.time.Chronology chronology47 = localTime46.getChronology();
        org.joda.time.DateTimeField dateTimeField48 = chronology47.clockhourOfHalfday();
        boolean boolean49 = dateTimeFieldType35.isSupported(chronology47);
        org.joda.time.LocalTime localTime52 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime.Property property53 = localTime52.secondOfMinute();
        org.joda.time.LocalTime localTime55 = localTime52.plusMinutes((int) (short) 100);
        org.joda.time.LocalTime localTime57 = localTime55.withHourOfDay((int) (byte) 10);
        org.joda.time.Chronology chronology58 = localTime57.getChronology();
        org.joda.time.LocalTime localTime59 = new org.joda.time.LocalTime(0L, chronology58);
        org.joda.time.DateTimeField dateTimeField60 = chronology58.year();
        org.joda.time.DurationField durationField61 = chronology58.hours();
        org.joda.time.DurationField durationField62 = chronology58.halfdays();
        org.joda.time.DurationField durationField63 = chronology58.minutes();
        org.joda.time.DateTimeField dateTimeField64 = chronology58.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField65 = chronology58.dayOfMonth();
        boolean boolean66 = dateTimeFieldType35.isSupported(chronology58);
        boolean boolean67 = localTime31.isSupported(dateTimeFieldType35);
        java.util.Date date69 = new java.util.Date((long) (byte) -1);
        java.util.Date date71 = new java.util.Date((long) (byte) -1);
        date71.setTime((long) ' ');
        boolean boolean74 = date69.after(date71);
        java.time.Instant instant75 = date71.toInstant();
        org.joda.time.LocalTime localTime79 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime.Property property80 = localTime79.secondOfMinute();
        org.joda.time.LocalTime localTime82 = localTime79.plusMinutes((int) (short) 100);
        org.joda.time.LocalTime localTime84 = localTime82.withHourOfDay((int) (byte) 10);
        org.joda.time.Chronology chronology85 = localTime84.getChronology();
        org.joda.time.LocalTime localTime86 = new org.joda.time.LocalTime(0L, chronology85);
        org.joda.time.DateTimeField dateTimeField87 = chronology85.monthOfYear();
        org.joda.time.DateTime dateTime88 = new org.joda.time.DateTime((long) 64331, chronology85);
        org.joda.time.DateTime dateTime89 = new org.joda.time.DateTime((java.lang.Object) date71, chronology85);
        org.joda.time.DateTimeField dateTimeField90 = chronology85.dayOfYear();
        org.joda.time.DateTimeField dateTimeField91 = chronology85.era();
        org.joda.time.DateTimeField dateTimeField92 = dateTimeFieldType35.getField(chronology85);
        int int93 = dateTime20.get(dateTimeFieldType35);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime7 and dateTime18", (dateTime7.compareTo(dateTime18) == 0) == dateTime7.equals(dateTime18));
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1036");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime2.plus(readableDuration4);
        org.joda.time.DateTime dateTime7 = dateTime5.plusYears((int) (short) 1);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) 0, chronology9);
        org.joda.time.DateTime.Property property11 = dateTime10.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.DateTime dateTime13 = dateTime10.plus(readableDuration12);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int15 = dateTime13.get(dateTimeFieldType14);
        org.joda.time.Chronology chronology16 = null;
        boolean boolean17 = dateTimeFieldType14.isSupported(chronology16);
        org.joda.time.DateTime.Property property18 = dateTime5.property(dateTimeFieldType14);
        boolean boolean20 = dateTime5.isAfter((long) 'u');
        org.joda.time.DateTime dateTime21 = dateTime5.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetMillis(26403599);
        long long27 = dateTimeZone23.convertLocalToUTC(48479999L, true, (long) (-95));
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime();
        boolean boolean35 = localDateTime33.equals((java.lang.Object) (-1L));
        org.joda.time.LocalDateTime localDateTime37 = localDateTime33.plusMonths(4);
        int int38 = localDateTime33.getYearOfCentury();
        org.joda.time.LocalDateTime localDateTime40 = localDateTime33.minusMinutes(12);
        boolean boolean41 = dateTimeZone32.isLocalDateTimeGap(localDateTime33);
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime((long) 59, dateTimeZone32);
        long long44 = dateTimeZone32.convertUTCToLocal(0L);
        org.joda.time.DateTime dateTime45 = new org.joda.time.DateTime((long) 33120097, dateTimeZone32);
        int int46 = dateTimeZone23.getOffset((org.joda.time.ReadableInstant) dateTime45);
        long long48 = dateTimeZone23.previousTransition((long) 239);
        org.joda.time.MutableDateTime mutableDateTime49 = dateTime21.toMutableDateTime(dateTimeZone23);
        org.joda.time.DateTime dateTime51 = dateTime21.withYearOfEra(429);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime21 and mutableDateTime49", (dateTime21.compareTo(mutableDateTime49) == 0) == dateTime21.equals(mutableDateTime49));
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1037");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.DurationFieldType durationFieldType1 = org.joda.time.DurationFieldType.months();
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.withFieldAdded(durationFieldType1, (int) 'a');
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.withMinuteOfHour(9);
        org.joda.time.DateTime dateTime6 = localDateTime3.toDateTime();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime3.withDayOfYear(7);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.LocalDateTime localDateTime10 = localDateTime3.plus(readablePeriod9);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime13 = property11.addToCopy((long) 9);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.minusMinutes(64327);
        int int16 = localDateTime13.getYearOfEra();
        org.joda.time.LocalDateTime.Property property17 = localDateTime13.hourOfDay();
        org.joda.time.LocalDateTime localDateTime18 = property17.getLocalDateTime();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(258482352L, dateTimeZone20);
        org.joda.time.format.DateTimePrinter dateTimePrinter22 = null;
        org.joda.time.format.DateTimeParser dateTimeParser23 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter22, dateTimeParser23);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = dateTimeFormatter24.withZoneUTC();
        org.joda.time.Chronology chronology26 = dateTimeFormatter24.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = dateTimeFormatter24.withPivotYear((java.lang.Integer) 292278993);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = dateTimeFormatter24.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone30 = dateTimeFormatter29.getZone();
        boolean boolean31 = dateTimeFormatter29.isPrinter();
        java.util.Locale locale32 = java.util.Locale.JAPANESE;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter33 = dateTimeFormatter29.withLocale(locale32);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter34 = dateTimeFormatter29.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter36 = dateTimeFormatter34.withDefaultYear(41);
        org.joda.time.DateTimeZone dateTimeZone37 = dateTimeFormatter34.getZone();
        org.joda.time.MutableDateTime mutableDateTime38 = dateTime21.toMutableDateTime(dateTimeZone37);
        org.joda.time.LocalTime localTime39 = new org.joda.time.LocalTime((java.lang.Object) localDateTime18, dateTimeZone37);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime21 and mutableDateTime38", (dateTime21.compareTo(mutableDateTime38) == 0) == dateTime21.equals(mutableDateTime38));
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1038");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime2.toMutableDateTime(chronology3);
        org.joda.time.DateTime dateTime6 = dateTime2.minus((long) '#');
        org.joda.time.DateTime dateTime8 = dateTime2.withDayOfWeek(4);
        org.joda.time.DateTime.Property property9 = dateTime8.minuteOfHour();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) 0, chronology11);
        org.joda.time.DateTime.Property property13 = dateTime12.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.DateTime dateTime15 = dateTime12.plus(readableDuration14);
        org.joda.time.DateTime dateTime17 = dateTime12.withWeekOfWeekyear((int) (short) 10);
        boolean boolean18 = dateTime8.isBefore((org.joda.time.ReadableInstant) dateTime12);
        org.joda.time.DateTime dateTime20 = dateTime12.withMillisOfDay(86399999);
        int int21 = dateTime20.getYearOfCentury();
        org.joda.time.LocalTime localTime28 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime.Property property29 = localTime28.secondOfMinute();
        org.joda.time.LocalTime localTime31 = localTime28.plusMinutes((int) (short) 100);
        org.joda.time.LocalTime localTime33 = localTime31.withHourOfDay((int) (byte) 10);
        org.joda.time.Chronology chronology34 = localTime33.getChronology();
        org.joda.time.DurationField durationField35 = chronology34.days();
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime(31, 7, (int) (byte) 1, 0, 12, chronology34);
        org.joda.time.DateTime dateTime37 = dateTime20.withChronology(chronology34);
        org.joda.time.DateTimeField dateTimeField38 = chronology34.minuteOfHour();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime20 and dateTime37", (dateTime20.compareTo(dateTime37) == 0) == dateTime20.equals(dateTime37));
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1039");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime2.toMutableDateTime(chronology3);
        org.joda.time.DateTime dateTime6 = dateTime2.minus((long) '#');
        org.joda.time.DateTime dateTime8 = dateTime2.withDayOfWeek(4);
        org.joda.time.DateTime.Property property9 = dateTime2.weekyear();
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.DateTime dateTime11 = dateTime2.plus(readableDuration10);
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime.Property property14 = localTime13.secondOfMinute();
        org.joda.time.LocalTime localTime16 = localTime13.plusMinutes((int) (short) 100);
        org.joda.time.LocalTime localTime18 = localTime16.withHourOfDay((int) (byte) 10);
        org.joda.time.Chronology chronology19 = localTime18.getChronology();
        org.joda.time.DurationField durationField20 = chronology19.centuries();
        org.joda.time.DurationField durationField21 = chronology19.months();
        org.joda.time.DurationField durationField22 = chronology19.halfdays();
        org.joda.time.DateTimeField dateTimeField23 = chronology19.secondOfDay();
        org.joda.time.MutableDateTime mutableDateTime24 = dateTime2.toMutableDateTime(chronology19);
        org.joda.time.DateTime dateTime26 = dateTime2.plusSeconds(38520000);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime4 and mutableDateTime24", (mutableDateTime4.compareTo(mutableDateTime24) == 0) == mutableDateTime4.equals(mutableDateTime24));
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1040");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime2.toMutableDateTime(chronology3);
        org.joda.time.DateTime dateTime6 = dateTime2.minus((long) '#');
        org.joda.time.DateTime dateTime8 = dateTime2.withDayOfWeek(4);
        org.joda.time.DateTime.Property property9 = dateTime2.weekyear();
        org.joda.time.DateTime dateTime11 = property9.addToCopy((long) 70);
        org.joda.time.DateTime dateTime12 = property9.roundHalfCeilingCopy();
        org.joda.time.DateTime dateTime14 = property9.setCopy(464);
        org.joda.time.DateTime dateTime15 = property9.getDateTime();
        org.joda.time.LocalTime localTime17 = org.joda.time.LocalTime.fromMillisOfDay((long) 1);
        org.joda.time.LocalTime localTime19 = localTime17.plusMillis(12);
        org.joda.time.LocalTime localTime21 = localTime17.minusMillis(64342031);
        org.joda.time.LocalTime localTime23 = localTime21.plusMinutes((int) '4');
        org.joda.time.LocalTime localTime25 = localTime23.plusMinutes((-1977));
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.DurationFieldType durationFieldType27 = dateTimeFieldType26.getRangeDurationType();
        boolean boolean28 = localTime25.isSupported(dateTimeFieldType26);
        org.joda.time.DateTime.Property property29 = dateTime15.property(dateTimeFieldType26);
        org.joda.time.Instant instant30 = dateTime15.toInstant();
        org.joda.time.Instant instant31 = instant30.toInstant();
        org.joda.time.DateTime dateTime32 = instant31.toDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant31", (dateTime2.compareTo(instant31) == 0) == dateTime2.equals(instant31));
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1041");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime.Property property3 = localTime2.secondOfMinute();
        org.joda.time.LocalTime localTime5 = localTime2.plusMinutes((int) (short) 100);
        org.joda.time.LocalTime localTime7 = localTime5.withHourOfDay((int) (byte) 10);
        org.joda.time.Chronology chronology8 = localTime7.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.clockhourOfHalfday();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime((long) '#', chronology11);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalTime localTime14 = localTime12.plus(readablePeriod13);
        long long16 = chronology8.set((org.joda.time.ReadablePartial) localTime12, (long) 32);
        org.joda.time.DateTimeField dateTimeField17 = chronology8.hourOfDay();
        org.joda.time.DurationField durationField18 = chronology8.halfdays();
        org.joda.time.DateTimeField dateTimeField19 = chronology8.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone20 = chronology8.getZone();
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(0L, dateTimeZone20);
        java.util.Calendar.Builder builder22 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder26 = builder22.setDate(9, 807, (int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetHours(1);
        java.util.TimeZone timeZone29 = dateTimeZone28.toTimeZone();
        java.util.Calendar.Builder builder30 = builder22.setTimeZone(timeZone29);
        boolean boolean31 = timeZone29.observesDaylightTime();
        boolean boolean32 = timeZone29.observesDaylightTime();
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forTimeZone(timeZone29);
        long long35 = dateTimeZone20.getMillisKeepLocal(dateTimeZone33, (long) 64598902);
        java.util.TimeZone timeZone36 = dateTimeZone33.toTimeZone();
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime((long) 0, chronology38);
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.MutableDateTime mutableDateTime41 = dateTime39.toMutableDateTime(chronology40);
        org.joda.time.DateTime dateTime43 = dateTime39.minus((long) '#');
        org.joda.time.DateTime dateTime45 = dateTime39.withDayOfWeek(4);
        org.joda.time.DateTime.Property property46 = dateTime45.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.DateTime dateTime52 = new org.joda.time.DateTime((long) 0, chronology51);
        org.joda.time.DateTime.Property property53 = dateTime52.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration54 = null;
        org.joda.time.DateTime dateTime55 = dateTime52.plus(readableDuration54);
        org.joda.time.DateTime dateTime57 = dateTime52.withWeekOfWeekyear((int) (short) 10);
        int int58 = dateTimeZone49.getOffset((org.joda.time.ReadableInstant) dateTime57);
        org.joda.time.LocalTime localTime59 = new org.joda.time.LocalTime((java.lang.Object) dateTime45, dateTimeZone49);
        java.util.TimeZone timeZone60 = dateTimeZone49.toTimeZone();
        int int61 = timeZone60.getRawOffset();
        boolean boolean62 = timeZone36.hasSameRules(timeZone60);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime21 and dateTime39", (dateTime21.compareTo(dateTime39) == 0) == dateTime21.equals(dateTime39));
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1042");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime2.toMutableDateTime(chronology3);
        org.joda.time.DateTime dateTime6 = dateTime2.minus((long) '#');
        org.joda.time.DateTime dateTime8 = dateTime2.withDayOfWeek(4);
        org.joda.time.DateTime.Property property9 = dateTime8.minuteOfHour();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) 0, chronology11);
        org.joda.time.DateTime.Property property13 = dateTime12.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.DateTime dateTime15 = dateTime12.plus(readableDuration14);
        org.joda.time.DateTime dateTime17 = dateTime12.withWeekOfWeekyear((int) (short) 10);
        boolean boolean18 = dateTime8.isBefore((org.joda.time.ReadableInstant) dateTime12);
        org.joda.time.DateTime dateTime20 = dateTime12.withMillisOfDay(86399999);
        int int21 = dateTime20.getYearOfCentury();
        org.joda.time.LocalTime localTime28 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime.Property property29 = localTime28.secondOfMinute();
        org.joda.time.LocalTime localTime31 = localTime28.plusMinutes((int) (short) 100);
        org.joda.time.LocalTime localTime33 = localTime31.withHourOfDay((int) (byte) 10);
        org.joda.time.Chronology chronology34 = localTime33.getChronology();
        org.joda.time.DurationField durationField35 = chronology34.days();
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime(31, 7, (int) (byte) 1, 0, 12, chronology34);
        org.joda.time.DateTime dateTime37 = dateTime20.withChronology(chronology34);
        org.joda.time.DateTime dateTime39 = dateTime20.minusHours(61274);
        org.joda.time.ReadableDuration readableDuration40 = null;
        org.joda.time.DateTime dateTime41 = dateTime20.plus(readableDuration40);
        boolean boolean42 = dateTime41.isAfterNow();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime41 and dateTime37", (dateTime41.compareTo(dateTime37) == 0) == dateTime41.equals(dateTime37));
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1043");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone4 = dateTime2.getZone();
        org.joda.time.LocalTime localTime5 = dateTime2.toLocalTime();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.minus(readablePeriod6);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) 0, chronology9);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = dateTime10.toMutableDateTime(chronology11);
        org.joda.time.DateTime dateTime14 = dateTime10.minus((long) '#');
        org.joda.time.DateTime dateTime16 = dateTime10.withDayOfWeek(4);
        org.joda.time.DateTime.Property property17 = dateTime16.minuteOfHour();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((long) 0, chronology19);
        org.joda.time.DateTime.Property property21 = dateTime20.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration22 = null;
        org.joda.time.DateTime dateTime23 = dateTime20.plus(readableDuration22);
        org.joda.time.DateTime dateTime25 = dateTime20.withWeekOfWeekyear((int) (short) 10);
        boolean boolean26 = dateTime16.isBefore((org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.DateTime dateTime28 = dateTime20.withMillisOfDay(86399999);
        int int29 = dateTime28.getYearOfCentury();
        org.joda.time.LocalTime localTime36 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime.Property property37 = localTime36.secondOfMinute();
        org.joda.time.LocalTime localTime39 = localTime36.plusMinutes((int) (short) 100);
        org.joda.time.LocalTime localTime41 = localTime39.withHourOfDay((int) (byte) 10);
        org.joda.time.Chronology chronology42 = localTime41.getChronology();
        org.joda.time.DurationField durationField43 = chronology42.days();
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime(31, 7, (int) (byte) 1, 0, 12, chronology42);
        org.joda.time.DateTime dateTime45 = dateTime28.withChronology(chronology42);
        org.joda.time.DateTime dateTime47 = dateTime28.minusHours(61274);
        int int48 = dateTime2.compareTo((org.joda.time.ReadableInstant) dateTime47);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime28 and dateTime45", (dateTime28.compareTo(dateTime45) == 0) == dateTime28.equals(dateTime45));
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1044");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime2.toMutableDateTime(chronology3);
        org.joda.time.DateTime dateTime6 = dateTime2.minus((long) '#');
        org.joda.time.DateTime dateTime8 = dateTime2.withDayOfWeek(4);
        org.joda.time.DateTime.Property property9 = dateTime8.minuteOfHour();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) 0, chronology11);
        org.joda.time.DateTime.Property property13 = dateTime12.yearOfCentury();
        org.joda.time.DateTime dateTime15 = dateTime12.minusSeconds(9);
        org.joda.time.DateTime dateTime17 = dateTime12.minusMinutes(6);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        java.util.TimeZone timeZone21 = dateTimeZone20.toTimeZone();
        org.joda.time.DateTime dateTime22 = dateTime17.withZone(dateTimeZone20);
        boolean boolean23 = dateTime8.isEqual((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.Instant instant24 = dateTime17.toInstant();
        org.joda.time.MutableDateTime mutableDateTime25 = instant24.toMutableDateTimeISO();
        org.joda.time.Instant instant26 = instant24.toInstant();
        org.joda.time.DateTime dateTime27 = instant24.toDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime17 and instant24", (dateTime17.compareTo(instant24) == 0) == dateTime17.equals(instant24));
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1045");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime2.toMutableDateTime(chronology3);
        org.joda.time.DateTime dateTime6 = dateTime2.minus((long) '#');
        org.joda.time.MutableDateTime mutableDateTime7 = dateTime2.toMutableDateTime();
        org.joda.time.Instant instant8 = new org.joda.time.Instant((java.lang.Object) dateTime2);
        org.joda.time.Instant instant10 = instant8.withMillis((long) 4);
        org.joda.time.DateTime dateTime11 = instant10.toDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant8", (dateTime2.compareTo(instant8) == 0) == dateTime2.equals(instant8));
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1046");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime2.toMutableDateTime(chronology3);
        org.joda.time.DateTime dateTime6 = dateTime2.minus((long) '#');
        org.joda.time.DateTime dateTime8 = dateTime2.plusHours((int) (byte) 100);
        org.joda.time.DateTime dateTime10 = dateTime8.minusHours(9);
        org.joda.time.DateTime dateTime12 = dateTime8.minusSeconds(11);
        org.joda.time.DateTime dateTime14 = dateTime12.plusSeconds(64334605);
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime();
        boolean boolean17 = localDateTime15.equals((java.lang.Object) (-1L));
        org.joda.time.LocalDateTime localDateTime19 = localDateTime15.withWeekyear(5);
        org.joda.time.LocalDateTime.Property property20 = localDateTime19.dayOfMonth();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime((long) 0, chronology22);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = dateTime23.toMutableDateTime(chronology24);
        org.joda.time.DateTime dateTime27 = dateTime23.minus((long) '#');
        org.joda.time.MutableDateTime mutableDateTime28 = dateTime23.toMutableDateTime();
        org.joda.time.Instant instant29 = new org.joda.time.Instant((java.lang.Object) dateTime23);
        int int30 = property20.getDifference((org.joda.time.ReadableInstant) instant29);
        org.joda.time.Instant instant32 = instant29.minus((long) 10);
        boolean boolean33 = dateTime14.equals((java.lang.Object) instant29);
        org.joda.time.ReadableDuration readableDuration34 = null;
        org.joda.time.Instant instant36 = instant29.withDurationAdded(readableDuration34, 267);
        long long37 = instant36.getMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant36", (dateTime2.compareTo(instant36) == 0) == dateTime2.equals(instant36));
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1047");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime2.plus(readableDuration4);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((long) 0, chronology7);
        org.joda.time.DateTime.Property property9 = dateTime8.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.DateTime dateTime11 = dateTime8.plus(readableDuration10);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int13 = dateTime11.get(dateTimeFieldType12);
        boolean boolean14 = dateTime5.isEqual((org.joda.time.ReadableInstant) dateTime11);
        org.joda.time.Instant instant15 = dateTime11.toInstant();
        org.joda.time.DateTime dateTime17 = dateTime11.plusMillis(826);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant15", (dateTime2.compareTo(instant15) == 0) == dateTime2.equals(instant15));
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1048");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime((long) 0, chronology3);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime4.toMutableDateTime(chronology5);
        org.joda.time.DateTime dateTime8 = dateTime4.minus((long) '#');
        org.joda.time.DateTime dateTime10 = dateTime4.withDayOfWeek(4);
        org.joda.time.LocalDate localDate11 = dateTime4.toLocalDate();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalDate localDate13 = localDate11.plus(readablePeriod12);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) 0, chronology18);
        org.joda.time.DateTime.Property property20 = dateTime19.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.DateTime dateTime22 = dateTime19.plus(readableDuration21);
        org.joda.time.DateTime dateTime24 = dateTime19.withWeekOfWeekyear((int) (short) 10);
        int int25 = dateTimeZone16.getOffset((org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.DateTime dateTime26 = localDate13.toDateTimeAtCurrentTime(dateTimeZone16);
        org.joda.time.Chronology chronology27 = dateTime26.getChronology();
        org.joda.time.LocalDate localDate28 = new org.joda.time.LocalDate((long) 26403599, chronology27);
        org.joda.time.LocalDate localDate29 = new org.joda.time.LocalDate((long) 23, chronology27);
        org.joda.time.DurationField durationField30 = chronology27.days();
        org.joda.time.DateTimeField dateTimeField31 = chronology27.monthOfYear();
        org.joda.time.DurationField durationField32 = chronology27.eras();
        long long36 = chronology27.add(0L, (long) 520, 37823035);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField30 and durationField32", Math.signum(durationField30.compareTo(durationField32)) == -Math.signum(durationField32.compareTo(durationField30)));
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1049");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime2.plus(readableDuration4);
        org.joda.time.DateTime dateTime7 = dateTime2.withWeekOfWeekyear((int) (short) 10);
        org.joda.time.DateTime dateTime9 = dateTime7.withYearOfEra(5);
        org.joda.time.DateTime dateTime11 = dateTime7.plusHours((int) (byte) 10);
        org.joda.time.DateTime dateTime13 = dateTime7.plusWeeks((int) (byte) 0);
        org.joda.time.DateTime dateTime15 = dateTime13.minusMillis((int) (short) 1);
        org.joda.time.DateTime dateTime17 = dateTime13.withCenturyOfEra(1970);
        int int18 = dateTime17.getMillisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        boolean boolean23 = dateTimeZone22.isFixed();
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((long) (byte) 100, dateTimeZone22);
        org.joda.time.DateTime dateTime26 = dateTime24.minusSeconds((-1));
        int int27 = dateTime26.getMillisOfSecond();
        org.joda.time.DateTime dateTime29 = dateTime26.withEra(0);
        org.joda.time.DateTime dateTime31 = dateTime29.minusMonths(75);
        int int32 = dateTime31.getCenturyOfEra();
        int int33 = dateTime17.compareTo((org.joda.time.ReadableInstant) dateTime31);
        org.joda.time.format.DateTimePrinter dateTimePrinter34 = null;
        org.joda.time.format.DateTimeParser dateTimeParser35 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter36 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter34, dateTimeParser35);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter37 = dateTimeFormatter36.withZoneUTC();
        org.joda.time.Chronology chronology38 = dateTimeFormatter36.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter40 = dateTimeFormatter36.withPivotYear((java.lang.Integer) 292278993);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter41 = dateTimeFormatter36.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone42 = dateTimeFormatter41.getZone();
        boolean boolean43 = dateTimeFormatter41.isPrinter();
        java.util.Locale locale44 = java.util.Locale.JAPANESE;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter45 = dateTimeFormatter41.withLocale(locale44);
        org.joda.time.DateTimeZone dateTimeZone46 = dateTimeFormatter41.getZone();
        org.joda.time.LocalDateTime localDateTime47 = new org.joda.time.LocalDateTime(dateTimeZone46);
        org.joda.time.DateTime dateTime48 = dateTime31.toDateTime(dateTimeZone46);
        org.joda.time.DateMidnight dateMidnight49 = dateTime48.toDateMidnight();
        org.joda.time.DateTime dateTime51 = dateTime48.minusWeeks(32770);
        org.joda.time.ReadableDuration readableDuration52 = null;
        org.joda.time.DateTime dateTime53 = dateTime48.plus(readableDuration52);
        org.joda.time.LocalDateTime localDateTime54 = new org.joda.time.LocalDateTime();
        org.joda.time.DurationFieldType durationFieldType55 = org.joda.time.DurationFieldType.months();
        org.joda.time.LocalDateTime localDateTime57 = localDateTime54.withFieldAdded(durationFieldType55, (int) 'a');
        org.joda.time.LocalDateTime localDateTime59 = localDateTime57.withMinuteOfHour(9);
        org.joda.time.DateTime dateTime60 = localDateTime57.toDateTime();
        org.joda.time.LocalDateTime localDateTime62 = localDateTime57.withDayOfYear(7);
        org.joda.time.ReadablePeriod readablePeriod63 = null;
        org.joda.time.LocalDateTime localDateTime64 = localDateTime57.plus(readablePeriod63);
        org.joda.time.LocalDateTime.Property property65 = localDateTime64.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime67 = property65.addToCopy((long) 9);
        java.lang.String str68 = localDateTime67.toString();
        org.joda.time.LocalDateTime localDateTime70 = localDateTime67.minusDays((-717648));
        org.joda.time.LocalDateTime localDateTime72 = localDateTime67.withWeekyear(99);
        org.joda.time.DateTimeFieldType dateTimeFieldType73 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        int int74 = localDateTime67.indexOf(dateTimeFieldType73);
        org.joda.time.DurationFieldType durationFieldType75 = dateTimeFieldType73.getRangeDurationType();
        int int76 = dateTime48.get(dateTimeFieldType73);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime31 and dateTime48", (dateTime31.compareTo(dateTime48) == 0) == dateTime31.equals(dateTime48));
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1050");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime((long) 0, chronology3);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime4.toMutableDateTime(chronology5);
        org.joda.time.DateTime dateTime8 = dateTime4.minus((long) '#');
        org.joda.time.DateTime dateTime10 = dateTime4.withDayOfWeek(4);
        org.joda.time.LocalDate localDate11 = dateTime4.toLocalDate();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalDate localDate13 = localDate11.plus(readablePeriod12);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) 0, chronology18);
        org.joda.time.DateTime.Property property20 = dateTime19.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.DateTime dateTime22 = dateTime19.plus(readableDuration21);
        org.joda.time.DateTime dateTime24 = dateTime19.withWeekOfWeekyear((int) (short) 10);
        int int25 = dateTimeZone16.getOffset((org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.DateTime dateTime26 = localDate13.toDateTimeAtCurrentTime(dateTimeZone16);
        org.joda.time.Chronology chronology27 = dateTime26.getChronology();
        org.joda.time.LocalDate localDate28 = new org.joda.time.LocalDate((long) 26403599, chronology27);
        org.joda.time.LocalDate localDate29 = new org.joda.time.LocalDate((long) 23, chronology27);
        org.joda.time.LocalDate localDate31 = localDate29.withDayOfYear(22);
        org.joda.time.LocalDate localDate33 = localDate29.minusYears(406);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime((long) 0, chronology35);
        org.joda.time.DateTime.Property property37 = dateTime36.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration38 = null;
        org.joda.time.DateTime dateTime39 = dateTime36.plus(readableDuration38);
        org.joda.time.DateTimeFieldType dateTimeFieldType40 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int41 = dateTime39.get(dateTimeFieldType40);
        org.joda.time.DateTime dateTime42 = dateTime39.withTimeAtStartOfDay();
        org.joda.time.LocalDate localDate43 = dateTime42.toLocalDate();
        org.joda.time.DateTimeZone dateTimeZone44 = dateTime42.getZone();
        org.joda.time.DateTime dateTime45 = localDate29.toDateTimeAtStartOfDay(dateTimeZone44);
        org.joda.time.Instant instant46 = dateTime45.toInstant();
        org.joda.time.Instant instant47 = instant46.toInstant();
        org.joda.time.DateTime dateTime48 = instant47.toDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime42 and instant47", (dateTime42.compareTo(instant47) == 0) == dateTime42.equals(instant47));
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1051");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("");
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleAttributes();
        java.util.Locale locale4 = java.util.Locale.forLanguageTag("");
        java.lang.String str5 = locale4.getScript();
        java.lang.String str6 = locale1.getDisplayLanguage(locale4);
        java.lang.String str7 = locale4.getDisplayName();
        java.util.Set<java.lang.String> strSet8 = locale4.getUnicodeLocaleAttributes();
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime();
        boolean boolean11 = localDateTime9.equals((java.lang.Object) (-1L));
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTimeField dateTimeField14 = dateTimeFieldType12.getField(chronology13);
        org.joda.time.DurationFieldType durationFieldType15 = dateTimeFieldType12.getRangeDurationType();
        boolean boolean16 = localDateTime9.isSupported(durationFieldType15);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime9.minusSeconds((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.minusWeeks((int) (byte) 1);
        org.joda.time.DurationFieldType durationFieldType21 = org.joda.time.DurationFieldType.months();
        org.joda.time.LocalDateTime localDateTime23 = localDateTime18.withFieldAdded(durationFieldType21, (int) (byte) -1);
        org.joda.time.LocalDateTime.Property property24 = localDateTime23.weekyear();
        org.joda.time.Chronology chronology25 = localDateTime23.getChronology();
        boolean boolean26 = strSet8.remove((java.lang.Object) chronology25);
        org.joda.time.DateTimeField dateTimeField27 = chronology25.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime();
        boolean boolean30 = localDateTime28.equals((java.lang.Object) (-1L));
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.DateTimeField dateTimeField33 = dateTimeFieldType31.getField(chronology32);
        org.joda.time.DurationFieldType durationFieldType34 = dateTimeFieldType31.getRangeDurationType();
        boolean boolean35 = localDateTime28.isSupported(durationFieldType34);
        org.joda.time.LocalDateTime localDateTime37 = localDateTime28.minusSeconds((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime39 = localDateTime37.minusWeeks((int) (byte) 1);
        org.joda.time.DurationFieldType durationFieldType40 = org.joda.time.DurationFieldType.months();
        org.joda.time.LocalDateTime localDateTime42 = localDateTime37.withFieldAdded(durationFieldType40, (int) (byte) -1);
        org.joda.time.LocalDateTime.Property property43 = localDateTime42.weekyear();
        org.joda.time.Chronology chronology44 = localDateTime42.getChronology();
        org.joda.time.LocalDateTime.Property property45 = localDateTime42.dayOfMonth();
        org.joda.time.LocalDateTime.Property property46 = localDateTime42.hourOfDay();
        org.joda.time.LocalDateTime localDateTime48 = property46.addToCopy(1645514451097L);
        java.util.Locale locale52 = new java.util.Locale("\uce90\ub098\ub2e4", "dayOfYear", "gregory");
        java.util.TimeZone timeZone54 = java.util.TimeZone.getTimeZone("South Korea");
        int int55 = timeZone54.getRawOffset();
        java.time.ZoneId zoneId56 = timeZone54.toZoneId();
        org.joda.time.DateTimeZone dateTimeZone57 = org.joda.time.DateTimeZone.forTimeZone(timeZone54);
        java.util.Locale.Builder builder58 = new java.util.Locale.Builder();
        java.util.Locale locale59 = builder58.build();
        java.util.Calendar calendar60 = java.util.Calendar.getInstance(timeZone54, locale59);
        java.lang.String str61 = locale52.getDisplayCountry(locale59);
        java.lang.String str62 = locale59.getCountry();
        java.lang.String str63 = dateTimeField27.getAsShortText((org.joda.time.ReadablePartial) localDateTime48, locale59);
        java.util.Calendar calendar64 = java.util.Calendar.getInstance(locale59);
        java.util.Locale locale65 = locale59.stripExtensions();
        java.util.Locale locale67 = new java.util.Locale("37920023");
        java.util.Set<java.lang.String> strSet68 = locale67.getUnicodeLocaleAttributes();
        java.lang.String str69 = locale65.getDisplayVariant(locale67);
        java.util.Locale.setDefault(locale65);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar60 and calendar64", (calendar60.compareTo(calendar64) == 0) == calendar60.equals(calendar64));
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1052");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime2.plus(readableDuration4);
        org.joda.time.DateTime dateTime7 = dateTime2.withWeekOfWeekyear((int) (short) 10);
        org.joda.time.DateTime dateTime9 = dateTime7.withYearOfEra(5);
        org.joda.time.DateTime dateTime11 = dateTime7.plusHours((int) (byte) 10);
        org.joda.time.DateTime dateTime13 = dateTime7.plusWeeks((int) (byte) 0);
        org.joda.time.YearMonthDay yearMonthDay14 = dateTime7.toYearMonthDay();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHours(1);
        java.util.TimeZone timeZone17 = dateTimeZone16.toTimeZone();
        org.joda.time.DateTime dateTime18 = dateTime7.toDateTime(dateTimeZone16);
        org.joda.time.LocalDate localDate19 = dateTime18.toLocalDate();
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        org.joda.time.LocalDate localDate22 = localDate19.withPeriodAdded(readablePeriod20, 514);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime7 and dateTime18", (dateTime7.compareTo(dateTime18) == 0) == dateTime7.equals(dateTime18));
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1053");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime2.toMutableDateTime(chronology3);
        org.joda.time.DateTime dateTime6 = dateTime2.minus((long) '#');
        org.joda.time.DateTime dateTime8 = dateTime2.withDayOfWeek(4);
        org.joda.time.DateTime.Property property9 = dateTime8.minuteOfHour();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) 0, chronology11);
        org.joda.time.DateTime.Property property13 = dateTime12.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.DateTime dateTime15 = dateTime12.plus(readableDuration14);
        org.joda.time.DateTime dateTime17 = dateTime12.withWeekOfWeekyear((int) (short) 10);
        boolean boolean18 = dateTime8.isBefore((org.joda.time.ReadableInstant) dateTime12);
        org.joda.time.DateTime dateTime20 = dateTime12.withMillisOfDay(86399999);
        int int21 = dateTime20.getYearOfCentury();
        org.joda.time.LocalTime localTime28 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime.Property property29 = localTime28.secondOfMinute();
        org.joda.time.LocalTime localTime31 = localTime28.plusMinutes((int) (short) 100);
        org.joda.time.LocalTime localTime33 = localTime31.withHourOfDay((int) (byte) 10);
        org.joda.time.Chronology chronology34 = localTime33.getChronology();
        org.joda.time.DurationField durationField35 = chronology34.days();
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime(31, 7, (int) (byte) 1, 0, 12, chronology34);
        org.joda.time.DateTime dateTime37 = dateTime20.withChronology(chronology34);
        org.joda.time.DateTime dateTime39 = dateTime20.minusHours(61274);
        org.joda.time.ReadableDuration readableDuration40 = null;
        org.joda.time.DateTime dateTime41 = dateTime20.plus(readableDuration40);
        org.joda.time.DateTime dateTime43 = dateTime41.minusDays(0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime43 and dateTime37", (dateTime43.compareTo(dateTime37) == 0) == dateTime43.equals(dateTime37));
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1054");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.DurationFieldType durationFieldType1 = dateTimeFieldType0.getRangeDurationType();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DurationField durationField3 = durationFieldType1.getField(chronology2);
        java.util.Locale locale5 = java.util.Locale.forLanguageTag("");
        java.util.Set<java.lang.String> strSet6 = locale5.getUnicodeLocaleAttributes();
        java.util.Locale locale8 = java.util.Locale.forLanguageTag("");
        java.lang.String str9 = locale8.getScript();
        java.lang.String str10 = locale5.getDisplayLanguage(locale8);
        java.lang.String str11 = locale8.getDisplayName();
        java.util.Set<java.lang.String> strSet12 = locale8.getUnicodeLocaleAttributes();
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime();
        boolean boolean15 = localDateTime13.equals((java.lang.Object) (-1L));
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.DateTimeField dateTimeField18 = dateTimeFieldType16.getField(chronology17);
        org.joda.time.DurationFieldType durationFieldType19 = dateTimeFieldType16.getRangeDurationType();
        boolean boolean20 = localDateTime13.isSupported(durationFieldType19);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime13.minusSeconds((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime22.minusWeeks((int) (byte) 1);
        org.joda.time.DurationFieldType durationFieldType25 = org.joda.time.DurationFieldType.months();
        org.joda.time.LocalDateTime localDateTime27 = localDateTime22.withFieldAdded(durationFieldType25, (int) (byte) -1);
        org.joda.time.LocalDateTime.Property property28 = localDateTime27.weekyear();
        org.joda.time.Chronology chronology29 = localDateTime27.getChronology();
        boolean boolean30 = strSet12.remove((java.lang.Object) chronology29);
        org.joda.time.DurationField durationField31 = durationFieldType1.getField(chronology29);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime((long) 0, chronology33);
        org.joda.time.DateTime.Property property35 = dateTime34.yearOfCentury();
        org.joda.time.DateTime dateTime37 = property35.addWrapFieldToCopy((int) (byte) -1);
        org.joda.time.DateTime dateTime41 = dateTime37.withDate((int) ' ', (int) (byte) 10, 1);
        boolean boolean42 = dateTime41.isEqualNow();
        org.joda.time.DateTime dateTime44 = dateTime41.withMinuteOfHour(8);
        boolean boolean45 = dateTime44.isEqualNow();
        org.joda.time.DateTime dateTime47 = dateTime44.minusHours(22);
        org.joda.time.DateTime dateTime48 = dateTime44.toDateTime();
        org.joda.time.Chronology chronology49 = dateTime48.getChronology();
        org.joda.time.DateTime dateTime50 = org.joda.time.DateTime.now(chronology49);
        boolean boolean51 = durationFieldType1.isSupported(chronology49);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField31", (durationField3.compareTo(durationField31) == 0) == durationField3.equals(durationField31));
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1055");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime2.toMutableDateTime(chronology3);
        org.joda.time.DateTime dateTime6 = dateTime2.minus((long) '#');
        org.joda.time.DateTime dateTime8 = dateTime2.withDayOfWeek(4);
        org.joda.time.LocalDate localDate9 = dateTime2.toLocalDate();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) 0, chronology11);
        org.joda.time.DateTime.Property property13 = dateTime12.yearOfCentury();
        org.joda.time.DateTime dateTime15 = property13.addWrapFieldToCopy((int) (byte) -1);
        boolean boolean16 = dateTime2.isAfter((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.DateTime dateTime18 = dateTime2.withYear((int) (short) 10);
        org.joda.time.ReadableDuration readableDuration19 = null;
        org.joda.time.DateTime dateTime20 = dateTime2.minus(readableDuration19);
        org.joda.time.DateTime dateTime22 = dateTime2.plus((-1L));
        boolean boolean24 = dateTime22.isBefore((long) 10);
        org.joda.time.DateTimeZone dateTimeZone25 = dateTime22.getZone();
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime((long) 0, chronology27);
        org.joda.time.DateTime.Property property29 = dateTime28.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration30 = null;
        org.joda.time.DateTime dateTime31 = dateTime28.plus(readableDuration30);
        org.joda.time.DateTime dateTime33 = dateTime28.withWeekOfWeekyear((int) (short) 10);
        org.joda.time.DateTime dateTime35 = dateTime33.withYearOfEra(5);
        org.joda.time.DateTime dateTime37 = dateTime33.plusHours((int) (byte) 10);
        org.joda.time.DateTime dateTime39 = dateTime33.plusWeeks((int) (byte) 0);
        org.joda.time.YearMonthDay yearMonthDay40 = dateTime33.toYearMonthDay();
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.forOffsetHours(1);
        java.util.TimeZone timeZone43 = dateTimeZone42.toTimeZone();
        org.joda.time.DateTime dateTime44 = dateTime33.toDateTime(dateTimeZone42);
        boolean boolean45 = dateTime22.isAfter((org.joda.time.ReadableInstant) dateTime44);
        org.joda.time.ReadablePeriod readablePeriod46 = null;
        org.joda.time.DateTime dateTime48 = dateTime22.withPeriodAdded(readablePeriod46, 859);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime33 and dateTime44", (dateTime33.compareTo(dateTime44) == 0) == dateTime33.equals(dateTime44));
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1056");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        int int2 = calendar0.getMinimum(0);
        calendar0.clear();
        calendar0.clear();
        java.util.TimeZone timeZone6 = java.util.TimeZone.getTimeZone("South Korea");
        int int7 = timeZone6.getRawOffset();
        calendar0.setTimeZone(timeZone6);
        java.util.Locale locale10 = java.util.Locale.forLanguageTag("");
        java.util.Set<java.lang.String> strSet11 = locale10.getUnicodeLocaleAttributes();
        java.lang.String str12 = locale10.getVariant();
        java.util.Calendar calendar13 = java.util.Calendar.getInstance(timeZone6, locale10);
        java.util.Locale locale14 = java.util.Locale.CANADA;
        java.util.Locale locale15 = java.util.Locale.KOREA;
        java.lang.String str16 = locale14.getDisplayVariant(locale15);
        java.lang.String str17 = locale14.getISO3Country();
        java.util.Calendar calendar18 = java.util.Calendar.getInstance(timeZone6, locale14);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        timeZone6.setID("41520000");
        java.util.Calendar calendar22 = java.util.Calendar.getInstance(timeZone6);
        java.util.Calendar calendar23 = java.util.Calendar.getInstance();
        int int25 = calendar23.getMinimum(0);
        calendar23.clear();
        calendar23.clear();
        java.util.TimeZone timeZone29 = java.util.TimeZone.getTimeZone("South Korea");
        int int30 = timeZone29.getRawOffset();
        calendar23.setTimeZone(timeZone29);
        calendar23.clear(0);
        int int34 = calendar23.getMinimalDaysInFirstWeek();
        java.util.TimeZone timeZone36 = java.util.TimeZone.getTimeZone("575");
        calendar23.setTimeZone(timeZone36);
        java.util.Locale locale38 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str39 = locale38.getCountry();
        java.util.Set<java.lang.Character> charSet40 = locale38.getExtensionKeys();
        java.util.Calendar calendar41 = java.util.Calendar.getInstance(locale38);
        calendar41.roll(5, false);
        java.lang.String str45 = calendar41.getCalendarType();
        calendar41.set(45, 64363, 0);
        java.util.TimeZone timeZone50 = calendar41.getTimeZone();
        boolean boolean51 = timeZone36.hasSameRules(timeZone50);
        boolean boolean52 = timeZone6.hasSameRules(timeZone36);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar0 and calendar23", (calendar0.compareTo(calendar23) == 0) == calendar0.equals(calendar23));
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1057");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime4 = localTime1.minusMinutes((int) (byte) 0);
        org.joda.time.LocalTime.Property property5 = localTime4.hourOfDay();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((long) 0, chronology7);
        org.joda.time.DateTime.Property property9 = dateTime8.yearOfCentury();
        org.joda.time.DateTime dateTime11 = dateTime8.minusSeconds(9);
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime.Property property14 = localTime13.secondOfMinute();
        org.joda.time.LocalTime localTime16 = localTime13.plusMinutes((int) (short) 100);
        org.joda.time.LocalTime localTime18 = localTime16.withHourOfDay((int) (byte) 10);
        org.joda.time.Chronology chronology19 = localTime18.getChronology();
        org.joda.time.DateTime dateTime20 = dateTime11.withChronology(chronology19);
        org.joda.time.TimeOfDay timeOfDay21 = dateTime11.toTimeOfDay();
        org.joda.time.LocalTime localTime22 = localTime4.withFields((org.joda.time.ReadablePartial) timeOfDay21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and dateTime20", (dateTime11.compareTo(dateTime20) == 0) == dateTime11.equals(dateTime20));
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1058");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("CA");
        java.lang.String str2 = languageRange1.getRange();
        double double3 = languageRange1.getWeight();
        double double4 = languageRange1.getWeight();
        org.joda.time.Instant instant6 = new org.joda.time.Instant(0L);
        org.joda.time.Instant instant8 = instant6.plus((long) 43);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        boolean boolean12 = dateTimeZone11.isFixed();
        java.lang.String str13 = dateTimeZone11.toString();
        long long17 = dateTimeZone11.convertLocalToUTC((long) 0, true, (long) 64327);
        int int19 = dateTimeZone11.getOffset((long) 53);
        org.joda.time.LocalDate localDate20 = org.joda.time.LocalDate.now(dateTimeZone11);
        org.joda.time.DateTime dateTime21 = instant6.toDateTime(dateTimeZone11);
        org.joda.time.DateTime dateTime22 = instant6.toDateTimeISO();
        org.joda.time.Chronology chronology23 = instant6.getChronology();
        boolean boolean24 = languageRange1.equals((java.lang.Object) chronology23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant6 and dateTime21", (instant6.compareTo(dateTime21) == 0) == instant6.equals(dateTime21));
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1059");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 0, chronology2);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.MutableDateTime mutableDateTime5 = dateTime3.toMutableDateTime(chronology4);
        org.joda.time.DateTime dateTime7 = dateTime3.minus((long) '#');
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) 0, chronology9);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = dateTime10.toMutableDateTime(chronology11);
        org.joda.time.DateTime dateTime14 = dateTime10.minus((long) '#');
        org.joda.time.DateTime dateTime16 = dateTime10.withDayOfWeek(4);
        org.joda.time.DateTime.Property property17 = dateTime16.minuteOfHour();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((long) 0, chronology19);
        org.joda.time.DateTime.Property property21 = dateTime20.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration22 = null;
        org.joda.time.DateTime dateTime23 = dateTime20.plus(readableDuration22);
        org.joda.time.DateTime dateTime25 = dateTime20.withWeekOfWeekyear((int) (short) 10);
        boolean boolean26 = dateTime16.isBefore((org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.DateTime dateTime28 = dateTime20.withMillisOfDay(86399999);
        boolean boolean29 = dateTime7.isBefore((org.joda.time.ReadableInstant) dateTime28);
        org.joda.time.DateTime.Property property30 = dateTime28.hourOfDay();
        org.joda.time.Instant instant31 = dateTime28.toInstant();
        org.joda.time.DateTime.Property property32 = dateTime28.millisOfSecond();
        org.joda.time.format.DateTimePrinter dateTimePrinter33 = null;
        org.joda.time.format.DateTimeParser dateTimeParser34 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter35 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter33, dateTimeParser34);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter36 = dateTimeFormatter35.withZoneUTC();
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime((long) 0, chronology38);
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.MutableDateTime mutableDateTime41 = dateTime39.toMutableDateTime(chronology40);
        org.joda.time.DateTime dateTime43 = dateTime39.minus((long) '#');
        org.joda.time.DateTime dateTime45 = dateTime39.withDayOfWeek(4);
        org.joda.time.LocalDate localDate46 = dateTime39.toLocalDate();
        org.joda.time.ReadablePeriod readablePeriod47 = null;
        org.joda.time.LocalDate localDate48 = localDate46.plus(readablePeriod47);
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.DateTime dateTime54 = new org.joda.time.DateTime((long) 0, chronology53);
        org.joda.time.DateTime.Property property55 = dateTime54.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration56 = null;
        org.joda.time.DateTime dateTime57 = dateTime54.plus(readableDuration56);
        org.joda.time.DateTime dateTime59 = dateTime54.withWeekOfWeekyear((int) (short) 10);
        int int60 = dateTimeZone51.getOffset((org.joda.time.ReadableInstant) dateTime59);
        org.joda.time.DateTime dateTime61 = localDate48.toDateTimeAtCurrentTime(dateTimeZone51);
        long long65 = dateTimeZone51.convertLocalToUTC((long) 31, true, (long) 'u');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter66 = dateTimeFormatter36.withZone(dateTimeZone51);
        org.joda.time.Chronology chronology69 = null;
        org.joda.time.DateTime dateTime70 = new org.joda.time.DateTime((long) 0, chronology69);
        org.joda.time.Chronology chronology71 = null;
        org.joda.time.MutableDateTime mutableDateTime72 = dateTime70.toMutableDateTime(chronology71);
        org.joda.time.DateTime dateTime74 = dateTime70.minus((long) '#');
        org.joda.time.DateTime dateTime76 = dateTime70.withDayOfWeek(4);
        org.joda.time.LocalDate localDate77 = dateTime70.toLocalDate();
        org.joda.time.ReadablePeriod readablePeriod78 = null;
        org.joda.time.LocalDate localDate79 = localDate77.plus(readablePeriod78);
        org.joda.time.DateTimeZone dateTimeZone82 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.Chronology chronology84 = null;
        org.joda.time.DateTime dateTime85 = new org.joda.time.DateTime((long) 0, chronology84);
        org.joda.time.DateTime.Property property86 = dateTime85.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration87 = null;
        org.joda.time.DateTime dateTime88 = dateTime85.plus(readableDuration87);
        org.joda.time.DateTime dateTime90 = dateTime85.withWeekOfWeekyear((int) (short) 10);
        int int91 = dateTimeZone82.getOffset((org.joda.time.ReadableInstant) dateTime90);
        org.joda.time.DateTime dateTime92 = localDate79.toDateTimeAtCurrentTime(dateTimeZone82);
        org.joda.time.Chronology chronology93 = dateTime92.getChronology();
        org.joda.time.LocalDate localDate94 = new org.joda.time.LocalDate((long) 26403599, chronology93);
        org.joda.time.DateTimeField dateTimeField95 = chronology93.weekOfWeekyear();
        org.joda.time.DurationField durationField96 = chronology93.hours();
        boolean boolean97 = dateTimeZone51.equals((java.lang.Object) chronology93);
        org.joda.time.DateTime dateTime98 = dateTime28.toDateTime(chronology93);
        org.joda.time.LocalDateTime localDateTime99 = new org.joda.time.LocalDateTime((java.lang.Object) "1971-12-11T21:55:52.124", chronology93);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime28 and instant31", (dateTime28.compareTo(instant31) == 0) == dateTime28.equals(instant31));
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1060");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("South Korea");
        timeZone1.setID("South Korea");
        timeZone1.setRawOffset(5);
        boolean boolean6 = timeZone1.observesDaylightTime();
        int int7 = timeZone1.getRawOffset();
        java.util.Calendar calendar8 = java.util.Calendar.getInstance();
        java.util.TimeZone timeZone9 = calendar8.getTimeZone();
        boolean boolean10 = timeZone1.hasSameRules(timeZone9);
        timeZone9.setID("TW");
        java.util.Calendar calendar13 = java.util.Calendar.getInstance();
        java.util.TimeZone timeZone14 = calendar13.getTimeZone();
        org.joda.time.LocalTime localTime15 = org.joda.time.LocalTime.fromCalendarFields(calendar13);
        java.util.TimeZone timeZone16 = calendar13.getTimeZone();
        boolean boolean17 = timeZone9.hasSameRules(timeZone16);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar8 and calendar13", (calendar8.compareTo(calendar13) == 0) == calendar8.equals(calendar13));
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1061");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.yearOfCentury();
        org.joda.time.DateTime dateTime4 = property3.roundFloorCopy();
        org.joda.time.DateTime dateTime5 = property3.roundHalfFloorCopy();
        boolean boolean6 = dateTime5.isBeforeNow();
        org.joda.time.Instant instant7 = dateTime5.toInstant();
        org.joda.time.DateTime dateTime9 = dateTime5.minus((long) 64745);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and instant7", (dateTime4.compareTo(instant7) == 0) == dateTime4.equals(instant7));
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1062");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime2.plus(readableDuration4);
        org.joda.time.DateTime dateTime7 = dateTime5.plusYears((int) (short) 1);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) 0, chronology9);
        org.joda.time.DateTime.Property property11 = dateTime10.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.DateTime dateTime13 = dateTime10.plus(readableDuration12);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int15 = dateTime13.get(dateTimeFieldType14);
        org.joda.time.Chronology chronology16 = null;
        boolean boolean17 = dateTimeFieldType14.isSupported(chronology16);
        org.joda.time.DateTime.Property property18 = dateTime5.property(dateTimeFieldType14);
        org.joda.time.DateTime dateTime19 = property18.roundCeilingCopy();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime((long) 0, chronology21);
        org.joda.time.DateTime.Property property23 = dateTime22.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration24 = null;
        org.joda.time.DateTime dateTime25 = dateTime22.plus(readableDuration24);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime((long) 0, chronology27);
        org.joda.time.DateTime.Property property29 = dateTime28.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration30 = null;
        org.joda.time.DateTime dateTime31 = dateTime28.plus(readableDuration30);
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int33 = dateTime31.get(dateTimeFieldType32);
        boolean boolean34 = dateTime25.isEqual((org.joda.time.ReadableInstant) dateTime31);
        boolean boolean35 = dateTime25.isBeforeNow();
        int int36 = dateTime19.compareTo((org.joda.time.ReadableInstant) dateTime25);
        int int37 = dateTime19.getMinuteOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType38 = org.joda.time.DateTimeFieldType.dayOfMonth();
        boolean boolean39 = dateTime19.isSupported(dateTimeFieldType38);
        org.joda.time.Instant instant40 = dateTime19.toInstant();
        org.joda.time.Instant instant42 = instant40.plus(77L);
        org.joda.time.ReadableDuration readableDuration43 = null;
        org.joda.time.Instant instant45 = instant42.withDurationAdded(readableDuration43, 7287);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant40", (dateTime2.compareTo(instant40) == 0) == dateTime2.equals(instant40));
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1063");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime2.plus(readableDuration4);
        org.joda.time.DateTime dateTime7 = dateTime2.withWeekOfWeekyear((int) (short) 10);
        org.joda.time.DateTime dateTime9 = dateTime7.withYearOfEra(5);
        org.joda.time.DateTime dateTime11 = dateTime7.plusHours((int) (byte) 10);
        org.joda.time.DateTime dateTime13 = dateTime7.plusWeeks((int) (byte) 0);
        org.joda.time.YearMonthDay yearMonthDay14 = dateTime7.toYearMonthDay();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHours(1);
        java.util.TimeZone timeZone17 = dateTimeZone16.toTimeZone();
        org.joda.time.DateTime dateTime18 = dateTime7.toDateTime(dateTimeZone16);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime((long) 0, chronology20);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = dateTime21.toMutableDateTime(chronology22);
        org.joda.time.DateTime dateTime25 = dateTime21.minus((long) '#');
        org.joda.time.DateTime dateTime27 = dateTime21.withDayOfWeek(4);
        org.joda.time.LocalDate localDate28 = dateTime21.toLocalDate();
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        org.joda.time.LocalDate localDate30 = localDate28.plus(readablePeriod29);
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime((long) 0, chronology35);
        org.joda.time.DateTime.Property property37 = dateTime36.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration38 = null;
        org.joda.time.DateTime dateTime39 = dateTime36.plus(readableDuration38);
        org.joda.time.DateTime dateTime41 = dateTime36.withWeekOfWeekyear((int) (short) 10);
        int int42 = dateTimeZone33.getOffset((org.joda.time.ReadableInstant) dateTime41);
        org.joda.time.DateTime dateTime43 = localDate30.toDateTimeAtCurrentTime(dateTimeZone33);
        org.joda.time.DateTime dateTime44 = localDate30.toDateTimeAtStartOfDay();
        org.joda.time.ReadablePeriod readablePeriod45 = null;
        org.joda.time.DateTime dateTime47 = dateTime44.withPeriodAdded(readablePeriod45, 86399999);
        int int48 = dateTime47.getMillisOfSecond();
        org.joda.time.DateTime dateTime50 = dateTime47.minus(39600000L);
        org.joda.time.DateTime dateTime52 = dateTime47.minusMinutes(64337583);
        org.joda.time.DateTime.Property property53 = dateTime47.minuteOfDay();
        org.joda.time.DateTime dateTime55 = dateTime47.minusYears(204);
        int int56 = dateTime18.compareTo((org.joda.time.ReadableInstant) dateTime47);
        org.joda.time.DateTime.Property property57 = dateTime47.yearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime7 and dateTime18", (dateTime7.compareTo(dateTime18) == 0) == dateTime7.equals(dateTime18));
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1064");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.yearOfCentury();
        org.joda.time.DateTime dateTime4 = property3.roundFloorCopy();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime4.withDurationAdded(readableDuration5, 22);
        org.joda.time.Instant instant8 = dateTime7.toInstant();
        org.joda.time.MutableDateTime mutableDateTime9 = instant8.toMutableDateTimeISO();
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.Instant instant11 = instant8.plus(readableDuration10);
        org.joda.time.MutableDateTime mutableDateTime12 = instant11.toMutableDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and instant11", (dateTime4.compareTo(instant11) == 0) == dateTime4.equals(instant11));
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1065");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        int int2 = calendar0.getMinimum(0);
        calendar0.clear();
        calendar0.clear();
        java.util.TimeZone timeZone6 = java.util.TimeZone.getTimeZone("South Korea");
        int int7 = timeZone6.getRawOffset();
        calendar0.setTimeZone(timeZone6);
        java.lang.String str9 = timeZone6.getID();
        timeZone6.setID("hours");
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTimeField dateTimeField14 = dateTimeFieldType12.getField(chronology13);
        long long17 = dateTimeField14.getDifferenceAsLong((long) (short) 10, (long) ' ');
        long long19 = dateTimeField14.remainder((-22L));
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime();
        org.joda.time.DurationFieldType durationFieldType21 = org.joda.time.DurationFieldType.months();
        org.joda.time.LocalDateTime localDateTime23 = localDateTime20.withFieldAdded(durationFieldType21, (int) 'a');
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.withMinuteOfHour(9);
        org.joda.time.DateTime dateTime26 = localDateTime23.toDateTime();
        org.joda.time.LocalDateTime localDateTime28 = localDateTime23.withDayOfYear(7);
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        org.joda.time.LocalDateTime localDateTime30 = localDateTime23.plus(readablePeriod29);
        org.joda.time.LocalDateTime.Property property31 = localDateTime30.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime33 = property31.addToCopy((long) 9);
        java.lang.String str34 = localDateTime33.toString();
        org.joda.time.LocalDateTime localDateTime36 = localDateTime33.minusDays((-717648));
        org.joda.time.LocalDateTime localDateTime38 = localDateTime33.withWeekyear(99);
        org.joda.time.DateTimeFieldType dateTimeFieldType40 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.DateTimeField dateTimeField42 = dateTimeFieldType40.getField(chronology41);
        org.joda.time.ReadablePartial readablePartial43 = null;
        java.util.Locale locale46 = java.util.Locale.forLanguageTag("");
        java.lang.String str47 = dateTimeField42.getAsShortText(readablePartial43, (int) (byte) 1, locale46);
        java.lang.String str48 = locale46.getLanguage();
        java.util.Locale locale49 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale50 = locale49.stripExtensions();
        java.lang.String str51 = locale46.getDisplayName(locale49);
        java.lang.String str52 = dateTimeField14.getAsShortText((org.joda.time.ReadablePartial) localDateTime38, 22, locale46);
        java.util.Calendar calendar53 = java.util.Calendar.getInstance(locale46);
        java.util.Calendar calendar54 = java.util.Calendar.getInstance(timeZone6, locale46);
        java.lang.String str55 = locale46.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar53 and calendar54", (calendar53.compareTo(calendar54) == 0) == calendar53.equals(calendar54));
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1066");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale.Builder builder2 = builder0.setLocale(locale1);
        java.util.Locale.Builder builder3 = new java.util.Locale.Builder();
        java.util.Locale locale5 = java.util.Locale.forLanguageTag("");
        java.util.Set<java.lang.String> strSet6 = locale5.getUnicodeLocaleAttributes();
        java.util.Locale.Builder builder7 = builder3.setLocale(locale5);
        java.lang.String str8 = locale5.getISO3Language();
        java.util.Locale.Builder builder9 = builder2.setLocale(locale5);
        java.util.Set<java.lang.String> strSet10 = locale5.getUnicodeLocaleKeys();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) 0, chronology12);
        org.joda.time.DateTime.Property property14 = dateTime13.yearOfCentury();
        org.joda.time.DateTime dateTime16 = dateTime13.minusSeconds(9);
        org.joda.time.DateTime dateTime18 = dateTime13.minusMinutes(6);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        java.util.TimeZone timeZone22 = dateTimeZone21.toTimeZone();
        org.joda.time.DateTime dateTime23 = dateTime18.withZone(dateTimeZone21);
        boolean boolean24 = strSet10.equals((java.lang.Object) dateTime18);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime((long) 0, chronology26);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutableDateTime mutableDateTime29 = dateTime27.toMutableDateTime(chronology28);
        org.joda.time.DateTime dateTime31 = dateTime27.minus((long) '#');
        org.joda.time.DateTime dateTime33 = dateTime27.withDayOfWeek(4);
        org.joda.time.LocalDate localDate34 = dateTime27.toLocalDate();
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime((long) 0, chronology36);
        org.joda.time.DateTime.Property property38 = dateTime37.yearOfCentury();
        org.joda.time.DateTime dateTime40 = property38.addWrapFieldToCopy((int) (byte) -1);
        boolean boolean41 = dateTime27.isAfter((org.joda.time.ReadableInstant) dateTime40);
        org.joda.time.DateTime dateTime43 = dateTime27.withYear((int) (short) 10);
        org.joda.time.DateTime.Property property44 = dateTime27.weekOfWeekyear();
        long long45 = property44.remainder();
        org.joda.time.DateTime dateTime46 = property44.roundCeilingCopy();
        org.joda.time.DateTime.Property property47 = dateTime46.secondOfDay();
        org.joda.time.DateTime dateTime48 = property47.withMaximumValue();
        org.joda.time.DateTime dateTime50 = property47.addToCopy((long) (short) 10);
        org.joda.time.DateTime dateTime53 = dateTime50.withDurationAdded(37923750L, 2081);
        org.joda.time.Chronology chronology56 = null;
        org.joda.time.DateTime dateTime57 = new org.joda.time.DateTime((long) 0, chronology56);
        org.joda.time.Chronology chronology58 = null;
        org.joda.time.MutableDateTime mutableDateTime59 = dateTime57.toMutableDateTime(chronology58);
        org.joda.time.DateTime dateTime61 = dateTime57.minus((long) '#');
        org.joda.time.DateTime dateTime63 = dateTime57.withDayOfWeek(4);
        org.joda.time.LocalDate localDate64 = dateTime57.toLocalDate();
        org.joda.time.Chronology chronology66 = null;
        org.joda.time.DateTime dateTime67 = new org.joda.time.DateTime((long) 0, chronology66);
        org.joda.time.DateTime.Property property68 = dateTime67.yearOfCentury();
        org.joda.time.DateTime dateTime70 = property68.addWrapFieldToCopy((int) (byte) -1);
        boolean boolean71 = dateTime57.isAfter((org.joda.time.ReadableInstant) dateTime70);
        org.joda.time.DateTime dateTime73 = dateTime57.withYear((int) (short) 10);
        org.joda.time.DateTime.Property property74 = dateTime57.weekOfWeekyear();
        long long75 = property74.remainder();
        org.joda.time.DateTime dateTime76 = property74.roundCeilingCopy();
        org.joda.time.DateTime dateTime77 = property74.roundHalfCeilingCopy();
        org.joda.time.format.DateTimePrinter dateTimePrinter78 = null;
        org.joda.time.format.DateTimeParser dateTimeParser79 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter80 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter78, dateTimeParser79);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter81 = dateTimeFormatter80.withZoneUTC();
        java.util.Locale locale83 = java.util.Locale.forLanguageTag("");
        java.util.Set<java.lang.String> strSet84 = locale83.getUnicodeLocaleAttributes();
        java.util.Locale locale86 = java.util.Locale.forLanguageTag("");
        java.lang.String str87 = locale86.getScript();
        java.lang.String str88 = locale83.getDisplayLanguage(locale86);
        java.lang.String str89 = locale86.getDisplayName();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter90 = dateTimeFormatter80.withLocale(locale86);
        java.lang.String str91 = property74.getAsShortText(locale86);
        java.lang.String str92 = dateTime50.toString("2030", locale86);
        boolean boolean93 = strSet10.contains((java.lang.Object) locale86);
        boolean boolean95 = strSet10.contains((java.lang.Object) "US");
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime18 and dateTime23", (dateTime18.compareTo(dateTime23) == 0) == dateTime18.equals(dateTime23));
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1067");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        java.util.TimeZone timeZone3 = dateTimeZone2.toTimeZone();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((long) 0, chronology5);
        org.joda.time.DateTime.Property property7 = dateTime6.yearOfCentury();
        org.joda.time.DateTime dateTime9 = dateTime6.minusSeconds(9);
        org.joda.time.DateTime dateTime11 = dateTime6.minusMinutes(6);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        java.util.TimeZone timeZone15 = dateTimeZone14.toTimeZone();
        org.joda.time.DateTime dateTime16 = dateTime11.withZone(dateTimeZone14);
        long long18 = dateTimeZone2.getMillisKeepLocal(dateTimeZone14, (long) 632);
        org.joda.time.DateTime dateTime19 = org.joda.time.DateTime.now(dateTimeZone14);
        org.joda.time.DateTime.Property property20 = dateTime19.millisOfSecond();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and dateTime16", (dateTime11.compareTo(dateTime16) == 0) == dateTime11.equals(dateTime16));
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1068");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime2.toMutableDateTime(chronology3);
        org.joda.time.DateTime dateTime6 = dateTime2.minus((long) '#');
        org.joda.time.DateTime dateTime8 = dateTime2.withDayOfWeek(4);
        org.joda.time.LocalDate localDate9 = dateTime2.toLocalDate();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = localDate9.toDateTimeAtMidnight(dateTimeZone10);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) 0, chronology13);
        org.joda.time.DateTime.Property property15 = dateTime14.yearOfCentury();
        org.joda.time.DateTime dateTime17 = dateTime14.minusSeconds(9);
        org.joda.time.DateTime dateTime19 = dateTime14.minusMinutes(6);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        java.util.TimeZone timeZone23 = dateTimeZone22.toTimeZone();
        org.joda.time.DateTime dateTime24 = dateTime19.withZone(dateTimeZone22);
        org.joda.time.DateTime dateTime25 = localDate9.toDateTimeAtMidnight(dateTimeZone22);
        org.joda.time.LocalDate localDate27 = localDate9.plusDays(632);
        org.joda.time.LocalDate localDate29 = localDate9.withWeekyear(100);
        org.joda.time.LocalDate localDate31 = localDate29.withYear(37920156);
        org.joda.time.ReadablePeriod readablePeriod32 = null;
        org.joda.time.LocalDate localDate34 = localDate29.withPeriodAdded(readablePeriod32, 14);
        java.lang.String str35 = localDate29.toString();
        org.joda.time.LocalDate localDate37 = localDate29.minusWeeks(64395);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime19 and dateTime24", (dateTime19.compareTo(dateTime24) == 0) == dateTime19.equals(dateTime24));
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1069");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime((long) 0, chronology3);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime4.toMutableDateTime(chronology5);
        org.joda.time.DateTime dateTime8 = dateTime4.minus((long) '#');
        org.joda.time.DateTime dateTime10 = dateTime4.withDayOfWeek(4);
        org.joda.time.LocalDate localDate11 = dateTime4.toLocalDate();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalDate localDate13 = localDate11.plus(readablePeriod12);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) 0, chronology18);
        org.joda.time.DateTime.Property property20 = dateTime19.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.DateTime dateTime22 = dateTime19.plus(readableDuration21);
        org.joda.time.DateTime dateTime24 = dateTime19.withWeekOfWeekyear((int) (short) 10);
        int int25 = dateTimeZone16.getOffset((org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.DateTime dateTime26 = localDate13.toDateTimeAtCurrentTime(dateTimeZone16);
        org.joda.time.Chronology chronology27 = dateTime26.getChronology();
        org.joda.time.LocalDate localDate28 = new org.joda.time.LocalDate((long) 26403599, chronology27);
        org.joda.time.LocalDate localDate29 = new org.joda.time.LocalDate((long) 23, chronology27);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) 0, chronology31);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.MutableDateTime mutableDateTime34 = dateTime32.toMutableDateTime(chronology33);
        org.joda.time.DateTime dateTime36 = dateTime32.minus((long) '#');
        org.joda.time.DateTime dateTime38 = dateTime32.withDayOfWeek(4);
        org.joda.time.LocalDate localDate39 = dateTime32.toLocalDate();
        org.joda.time.ReadablePeriod readablePeriod40 = null;
        org.joda.time.LocalDate localDate41 = localDate39.plus(readablePeriod40);
        org.joda.time.LocalDate localDate43 = localDate41.withCenturyOfEra(0);
        org.joda.time.LocalDate localDate45 = localDate41.withYearOfEra((int) 'x');
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.DateTime dateTime48 = new org.joda.time.DateTime((long) 0, chronology47);
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.MutableDateTime mutableDateTime50 = dateTime48.toMutableDateTime(chronology49);
        org.joda.time.DateTime dateTime52 = dateTime48.minus((long) '#');
        org.joda.time.ReadablePeriod readablePeriod53 = null;
        org.joda.time.DateTime dateTime54 = dateTime48.minus(readablePeriod53);
        org.joda.time.DateTimeZone dateTimeZone57 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        java.lang.String str59 = dateTimeZone57.getShortName((long) (byte) -1);
        org.joda.time.DateTime dateTime60 = new org.joda.time.DateTime((java.lang.Object) dateTime54, dateTimeZone57);
        long long62 = dateTimeZone57.convertUTCToLocal((long) 64331);
        long long66 = dateTimeZone57.convertLocalToUTC((long) 37920000, false, (long) 64334605);
        org.joda.time.DateTime dateTime67 = localDate45.toDateTimeAtCurrentTime(dateTimeZone57);
        org.joda.time.Chronology chronology68 = chronology27.withZone(dateTimeZone57);
        long long71 = dateTimeZone57.convertLocalToUTC(11L, false);
        java.lang.String str72 = dateTimeZone57.getID();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and dateTime60", (dateTime4.compareTo(dateTime60) == 0) == dateTime4.equals(dateTime60));
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1070");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime2.toMutableDateTime(chronology3);
        org.joda.time.DateTime dateTime6 = dateTime2.minus((long) '#');
        org.joda.time.DateTime dateTime8 = dateTime2.withDayOfWeek(4);
        org.joda.time.DateTime.Property property9 = dateTime8.minuteOfHour();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) 0, chronology11);
        org.joda.time.DateTime.Property property13 = dateTime12.yearOfCentury();
        org.joda.time.DateTime dateTime15 = dateTime12.minusSeconds(9);
        org.joda.time.DateTime dateTime17 = dateTime12.minusMinutes(6);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        java.util.TimeZone timeZone21 = dateTimeZone20.toTimeZone();
        org.joda.time.DateTime dateTime22 = dateTime17.withZone(dateTimeZone20);
        boolean boolean23 = dateTime8.isEqual((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.DateTime.Property property24 = dateTime8.year();
        org.joda.time.DateTime dateTime26 = dateTime8.minusWeeks(393);
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetMillis(64333);
        long long30 = dateTimeZone28.nextTransition(75L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone28);
        org.joda.time.LocalDate localDate32 = new org.joda.time.LocalDate(dateTimeZone28);
        org.joda.time.LocalDateTime localDateTime33 = null;
        boolean boolean34 = dateTimeZone28.isLocalDateTimeGap(localDateTime33);
        org.joda.time.DateTime dateTime35 = dateTime26.toDateTime(dateTimeZone28);
        org.joda.time.DateTime dateTime37 = dateTime35.withMillisOfDay(55);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime17 and dateTime22", (dateTime17.compareTo(dateTime22) == 0) == dateTime17.equals(dateTime22));
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1071");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime2.plus(readableDuration4);
        org.joda.time.DateTime dateTime7 = dateTime2.withWeekOfWeekyear((int) (short) 10);
        org.joda.time.DateTime dateTime9 = dateTime7.withYearOfEra(5);
        int int10 = dateTime7.getMonthOfYear();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        java.lang.String str15 = dateTimeZone13.getShortName((long) (byte) -1);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((long) 0, chronology17);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = dateTime18.toMutableDateTime(chronology19);
        org.joda.time.DateTime dateTime22 = dateTime18.minus((long) '#');
        org.joda.time.DateTime dateTime24 = dateTime18.plusHours((int) (byte) 100);
        int int25 = dateTimeZone13.getOffset((org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.DateTime dateTime26 = org.joda.time.DateTime.now(dateTimeZone13);
        long long28 = dateTimeZone13.previousTransition((long) 9);
        int int30 = dateTimeZone13.getOffset((long) 186);
        org.joda.time.DateTime dateTime31 = dateTime7.withZoneRetainFields(dateTimeZone13);
        long long34 = dateTimeZone13.adjustOffset((long) (-27424628), true);
        org.joda.time.DateTimeFieldType dateTimeFieldType35 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.DateTimeField dateTimeField37 = dateTimeFieldType35.getField(chronology36);
        org.joda.time.LocalTime localTime39 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime.Property property40 = localTime39.secondOfMinute();
        int int41 = dateTimeField37.getMinimumValue((org.joda.time.ReadablePartial) localTime39);
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.LocalTime localTime43 = new org.joda.time.LocalTime(dateTimeZone42);
        org.joda.time.LocalTime localTime45 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime localTime46 = localTime43.withFields((org.joda.time.ReadablePartial) localTime45);
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.LocalTime localTime48 = new org.joda.time.LocalTime(dateTimeZone47);
        org.joda.time.LocalTime localTime50 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime localTime51 = localTime48.withFields((org.joda.time.ReadablePartial) localTime50);
        int int52 = localTime45.compareTo((org.joda.time.ReadablePartial) localTime48);
        int int53 = localTime48.getHourOfDay();
        int int54 = localTime39.compareTo((org.joda.time.ReadablePartial) localTime48);
        org.joda.time.LocalTime localTime56 = localTime48.minusHours(23);
        org.joda.time.Chronology chronology58 = null;
        org.joda.time.DateTime dateTime59 = new org.joda.time.DateTime((long) 0, chronology58);
        org.joda.time.DateTime.Property property60 = dateTime59.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration61 = null;
        org.joda.time.DateTime dateTime62 = dateTime59.plus(readableDuration61);
        org.joda.time.Chronology chronology64 = null;
        org.joda.time.DateTime dateTime65 = new org.joda.time.DateTime((long) 0, chronology64);
        org.joda.time.DateTime.Property property66 = dateTime65.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration67 = null;
        org.joda.time.DateTime dateTime68 = dateTime65.plus(readableDuration67);
        org.joda.time.DateTimeFieldType dateTimeFieldType69 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int70 = dateTime68.get(dateTimeFieldType69);
        boolean boolean71 = dateTime62.isEqual((org.joda.time.ReadableInstant) dateTime68);
        org.joda.time.DateTime dateTime73 = dateTime68.minusHours((int) '4');
        org.joda.time.DateTimeZone dateTimeZone76 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime77 = dateTime73.toDateTime(dateTimeZone76);
        boolean boolean78 = localTime56.equals((java.lang.Object) dateTime77);
        int int79 = dateTime77.getMillisOfSecond();
        org.joda.time.DateTime.Property property80 = dateTime77.monthOfYear();
        org.joda.time.DateTime dateTime81 = property80.getDateTime();
        int int82 = dateTimeZone13.getOffset((org.joda.time.ReadableInstant) dateTime81);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime73 and dateTime81", (dateTime73.compareTo(dateTime81) == 0) == dateTime73.equals(dateTime81));
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1072");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime4 = localTime1.plusMinutes((int) (short) 100);
        org.joda.time.LocalTime localTime6 = localTime4.withHourOfDay((int) (byte) 10);
        org.joda.time.LocalTime.Property property7 = localTime6.minuteOfHour();
        org.joda.time.LocalTime localTime8 = property7.withMinimumValue();
        org.joda.time.LocalTime localTime9 = property7.roundCeilingCopy();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) 0, chronology11);
        org.joda.time.DateTime.Property property13 = dateTime12.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.DateTime dateTime15 = dateTime12.plus(readableDuration14);
        org.joda.time.DateTime dateTime17 = dateTime15.plusYears((int) (short) 1);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((long) 0, chronology19);
        org.joda.time.DateTime.Property property21 = dateTime20.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration22 = null;
        org.joda.time.DateTime dateTime23 = dateTime20.plus(readableDuration22);
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int25 = dateTime23.get(dateTimeFieldType24);
        org.joda.time.Chronology chronology26 = null;
        boolean boolean27 = dateTimeFieldType24.isSupported(chronology26);
        org.joda.time.DateTime.Property property28 = dateTime15.property(dateTimeFieldType24);
        java.lang.Object obj29 = null;
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime((long) 0, chronology34);
        org.joda.time.DateTime.Property property36 = dateTime35.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration37 = null;
        org.joda.time.DateTime dateTime38 = dateTime35.plus(readableDuration37);
        org.joda.time.DateTime dateTime40 = dateTime35.withWeekOfWeekyear((int) (short) 10);
        int int41 = dateTimeZone32.getOffset((org.joda.time.ReadableInstant) dateTime40);
        org.joda.time.DateTime dateTime42 = new org.joda.time.DateTime(obj29, dateTimeZone32);
        int int43 = dateTime42.getYear();
        org.joda.time.DateTime dateTime45 = dateTime42.minusMinutes(14);
        org.joda.time.DateTime.Property property46 = dateTime45.dayOfYear();
        boolean boolean47 = dateTime15.isEqual((org.joda.time.ReadableInstant) dateTime45);
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        java.lang.String str52 = dateTimeZone50.getShortName((long) (byte) -1);
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.DateTime dateTime55 = new org.joda.time.DateTime((long) 0, chronology54);
        org.joda.time.Chronology chronology56 = null;
        org.joda.time.MutableDateTime mutableDateTime57 = dateTime55.toMutableDateTime(chronology56);
        org.joda.time.DateTime dateTime59 = dateTime55.minus((long) '#');
        org.joda.time.DateTime dateTime61 = dateTime55.plusHours((int) (byte) 100);
        int int62 = dateTimeZone50.getOffset((org.joda.time.ReadableInstant) dateTime61);
        org.joda.time.DateTime dateTime63 = org.joda.time.DateTime.now(dateTimeZone50);
        long long65 = dateTimeZone50.previousTransition((long) 9);
        int int67 = dateTimeZone50.getOffset(37920035L);
        org.joda.time.MutableDateTime mutableDateTime68 = dateTime15.toMutableDateTime(dateTimeZone50);
        org.joda.time.LocalTime localTime69 = new org.joda.time.LocalTime((java.lang.Object) localTime9, dateTimeZone50);
        org.joda.time.LocalTime localTime71 = localTime9.minusMinutes(0);
        org.joda.time.Chronology chronology72 = localTime71.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime12 and mutableDateTime68", (dateTime12.compareTo(mutableDateTime68) == 0) == dateTime12.equals(mutableDateTime68));
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1073");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime2.plus(readableDuration4);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((long) 0, chronology7);
        org.joda.time.DateTime.Property property9 = dateTime8.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.DateTime dateTime11 = dateTime8.plus(readableDuration10);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int13 = dateTime11.get(dateTimeFieldType12);
        boolean boolean14 = dateTime5.isEqual((org.joda.time.ReadableInstant) dateTime11);
        org.joda.time.DateTime dateTime16 = dateTime11.minusHours((int) '4');
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime20 = dateTime16.toDateTime(dateTimeZone19);
        int int21 = dateTime16.getDayOfYear();
        org.joda.time.DateTime dateTime22 = dateTime16.toDateTimeISO();
        org.joda.time.DateTime dateTime25 = dateTime22.withDurationAdded((long) 7, 32770);
        org.joda.time.DateTime dateTime27 = dateTime25.withCenturyOfEra(7);
        org.joda.time.DateTime dateTime29 = dateTime27.withMillisOfDay(599);
        int int30 = dateTime27.getSecondOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and dateTime20", (dateTime16.compareTo(dateTime20) == 0) == dateTime16.equals(dateTime20));
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1074");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime2.toMutableDateTime(chronology3);
        org.joda.time.DateTime dateTime6 = dateTime2.minus((long) '#');
        org.joda.time.DateTime dateTime8 = dateTime2.withDayOfWeek(4);
        org.joda.time.LocalDate localDate9 = dateTime2.toLocalDate();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDate localDate11 = localDate9.plus(readablePeriod10);
        java.util.Locale.FilteringMode filteringMode12 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        boolean boolean13 = localDate9.equals((java.lang.Object) filteringMode12);
        org.joda.time.LocalDate.Property property14 = localDate9.year();
        org.joda.time.LocalDate localDate15 = property14.roundHalfEvenCopy();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = localDate15.toDateTimeAtCurrentTime(dateTimeZone16);
        org.joda.time.Chronology chronology18 = dateTime17.getChronology();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime((long) 0, chronology20);
        org.joda.time.DateTime.Property property22 = dateTime21.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration23 = null;
        org.joda.time.DateTime dateTime24 = dateTime21.plus(readableDuration23);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int26 = dateTime24.get(dateTimeFieldType25);
        org.joda.time.DateTime dateTime27 = dateTime24.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime31 = dateTime24.toDateTime(dateTimeZone30);
        int int33 = dateTimeZone30.getStandardOffset((long) '4');
        org.joda.time.DateTime dateTime34 = dateTime17.withZoneRetainFields(dateTimeZone30);
        org.joda.time.DateTime.Property property35 = dateTime34.hourOfDay();
        org.joda.time.DateTime dateTime37 = dateTime34.withMillis(0L);
        java.lang.String str38 = dateTime37.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime31", (dateTime2.compareTo(dateTime31) == 0) == dateTime2.equals(dateTime31));
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1075");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        boolean boolean2 = localDateTime0.equals((java.lang.Object) (-1L));
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType3.getField(chronology4);
        org.joda.time.DurationFieldType durationFieldType6 = dateTimeFieldType3.getRangeDurationType();
        boolean boolean7 = localDateTime0.isSupported(durationFieldType6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime0.minusSeconds((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.minusMonths((int) 'x');
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime();
        org.joda.time.DurationFieldType durationFieldType13 = org.joda.time.DurationFieldType.months();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime12.withFieldAdded(durationFieldType13, (int) 'a');
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.withMinuteOfHour(9);
        org.joda.time.DateTime dateTime18 = localDateTime15.toDateTime();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime15.withDayOfYear(7);
        int int21 = localDateTime15.getEra();
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime((long) 0, chronology24);
        org.joda.time.DateTime.Property property26 = dateTime25.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration27 = null;
        org.joda.time.DateTime dateTime28 = dateTime25.plus(readableDuration27);
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int30 = dateTime28.get(dateTimeFieldType29);
        boolean boolean31 = localDateTime22.equals((java.lang.Object) dateTime28);
        int int32 = localDateTime22.getMillisOfSecond();
        int int33 = localDateTime22.getCenturyOfEra();
        org.joda.time.Chronology chronology34 = localDateTime22.getChronology();
        boolean boolean35 = localDateTime15.equals((java.lang.Object) chronology34);
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime((long) 0, chronology37);
        org.joda.time.DateTime.Property property39 = dateTime38.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration40 = null;
        org.joda.time.DateTime dateTime41 = dateTime38.plus(readableDuration40);
        org.joda.time.DateTime dateTime43 = dateTime38.withWeekOfWeekyear((int) (short) 10);
        org.joda.time.DateTime dateTime45 = dateTime43.withYearOfEra(5);
        int int46 = dateTime45.getYear();
        org.joda.time.DateTime dateTime48 = dateTime45.withWeekyear(3);
        org.joda.time.DateTime dateTime49 = localDateTime15.toDateTime((org.joda.time.ReadableInstant) dateTime45);
        org.joda.time.DateTime dateTime51 = dateTime45.withWeekyear(576);
        org.joda.time.DateTime dateTime52 = localDateTime11.toDateTime((org.joda.time.ReadableInstant) dateTime45);
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.DateTime dateTime55 = new org.joda.time.DateTime((long) 0, chronology54);
        org.joda.time.DateTime.Property property56 = dateTime55.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration57 = null;
        org.joda.time.DateTime dateTime58 = dateTime55.plus(readableDuration57);
        org.joda.time.DateTime dateTime60 = dateTime55.withWeekOfWeekyear((int) (short) 10);
        org.joda.time.DateTime dateTime62 = dateTime60.withYearOfEra(5);
        org.joda.time.DateTime dateTime64 = dateTime60.plusHours((int) (byte) 10);
        org.joda.time.Chronology chronology66 = null;
        org.joda.time.DateTime dateTime67 = new org.joda.time.DateTime((long) 0, chronology66);
        org.joda.time.Chronology chronology68 = null;
        org.joda.time.MutableDateTime mutableDateTime69 = dateTime67.toMutableDateTime(chronology68);
        org.joda.time.DateTime dateTime71 = dateTime67.minus((long) '#');
        org.joda.time.ReadablePeriod readablePeriod72 = null;
        org.joda.time.DateTime dateTime73 = dateTime67.minus(readablePeriod72);
        org.joda.time.DateTime dateTime75 = dateTime67.withYearOfEra(64348274);
        org.joda.time.Chronology chronology77 = null;
        org.joda.time.DateTime dateTime78 = new org.joda.time.DateTime((long) 0, chronology77);
        org.joda.time.DateTime.Property property79 = dateTime78.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration80 = null;
        org.joda.time.DateTime dateTime81 = dateTime78.plus(readableDuration80);
        org.joda.time.DateTimeFieldType dateTimeFieldType82 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int83 = dateTime81.get(dateTimeFieldType82);
        org.joda.time.DateTime dateTime84 = dateTime81.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone87 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime88 = dateTime81.toDateTime(dateTimeZone87);
        int int90 = dateTimeZone87.getStandardOffset((long) '4');
        org.joda.time.DateTime dateTime91 = dateTime67.toDateTime(dateTimeZone87);
        org.joda.time.DateTime dateTime93 = dateTime91.plusMillis(49);
        boolean boolean94 = dateTime64.isBefore((org.joda.time.ReadableInstant) dateTime91);
        org.joda.time.DateTime dateTime96 = dateTime91.minusSeconds(1073);
        int int97 = dateTime52.compareTo((org.joda.time.ReadableInstant) dateTime96);
        long long98 = dateTime96.getMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime25 and dateTime88", (dateTime25.compareTo(dateTime88) == 0) == dateTime25.equals(dateTime88));
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1076");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (byte) 0, dateTimeZone1);
        org.joda.time.LocalDate.Property property3 = localDate2.weekOfWeekyear();
        org.joda.time.LocalDate localDate4 = property3.roundHalfCeilingCopy();
        org.joda.time.LocalDate localDate6 = localDate4.withYear(64338037);
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((java.lang.Object) localDate6);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) 0, chronology9);
        org.joda.time.DateTime.Property property11 = dateTime10.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.DateTime dateTime13 = dateTime10.plus(readableDuration12);
        org.joda.time.DateTime dateTime15 = dateTime13.plusYears((int) (short) 1);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((long) 0, chronology17);
        org.joda.time.DateTime.Property property19 = dateTime18.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.DateTime dateTime21 = dateTime18.plus(readableDuration20);
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int23 = dateTime21.get(dateTimeFieldType22);
        org.joda.time.Chronology chronology24 = null;
        boolean boolean25 = dateTimeFieldType22.isSupported(chronology24);
        org.joda.time.DateTime.Property property26 = dateTime13.property(dateTimeFieldType22);
        org.joda.time.DateTime dateTime27 = property26.roundCeilingCopy();
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime((long) 0, chronology29);
        org.joda.time.DateTime.Property property31 = dateTime30.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration32 = null;
        org.joda.time.DateTime dateTime33 = dateTime30.plus(readableDuration32);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime((long) 0, chronology35);
        org.joda.time.DateTime.Property property37 = dateTime36.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration38 = null;
        org.joda.time.DateTime dateTime39 = dateTime36.plus(readableDuration38);
        org.joda.time.DateTimeFieldType dateTimeFieldType40 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int41 = dateTime39.get(dateTimeFieldType40);
        boolean boolean42 = dateTime33.isEqual((org.joda.time.ReadableInstant) dateTime39);
        boolean boolean43 = dateTime33.isBeforeNow();
        int int44 = dateTime27.compareTo((org.joda.time.ReadableInstant) dateTime33);
        int int45 = dateTime27.getMinuteOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType46 = org.joda.time.DateTimeFieldType.dayOfMonth();
        boolean boolean47 = dateTime27.isSupported(dateTimeFieldType46);
        org.joda.time.Instant instant48 = dateTime27.toInstant();
        org.joda.time.Instant instant50 = instant48.plus(77L);
        long long51 = instant48.getMillis();
        boolean boolean52 = localDate6.equals((java.lang.Object) long51);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and instant48", (dateTime10.compareTo(instant48) == 0) == dateTime10.equals(instant48));
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1077");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime2.toMutableDateTime(chronology3);
        org.joda.time.DateTime dateTime6 = dateTime2.minus((long) '#');
        org.joda.time.DateTime dateTime8 = dateTime2.withDayOfWeek(4);
        org.joda.time.LocalDate localDate9 = dateTime2.toLocalDate();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDate localDate11 = localDate9.plus(readablePeriod10);
        org.joda.time.LocalDate.Property property12 = localDate11.weekyear();
        org.joda.time.LocalDate localDate13 = property12.withMinimumValue();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((long) 0, chronology15);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = dateTime16.toMutableDateTime(chronology17);
        org.joda.time.DateTime dateTime20 = dateTime16.minus((long) '#');
        org.joda.time.DateTime dateTime22 = dateTime16.withDayOfWeek(4);
        org.joda.time.LocalDate localDate23 = dateTime16.toLocalDate();
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateTime dateTime25 = localDate23.toDateTimeAtMidnight(dateTimeZone24);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime((long) 0, chronology27);
        org.joda.time.DateTime.Property property29 = dateTime28.yearOfCentury();
        org.joda.time.DateTime dateTime31 = dateTime28.minusSeconds(9);
        org.joda.time.DateTime dateTime33 = dateTime28.minusMinutes(6);
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        java.util.TimeZone timeZone37 = dateTimeZone36.toTimeZone();
        org.joda.time.DateTime dateTime38 = dateTime33.withZone(dateTimeZone36);
        org.joda.time.DateTime dateTime39 = localDate23.toDateTimeAtMidnight(dateTimeZone36);
        int int40 = property12.compareTo((org.joda.time.ReadableInstant) dateTime39);
        org.joda.time.YearMonthDay yearMonthDay41 = dateTime39.toYearMonthDay();
        org.joda.time.Instant instant42 = dateTime39.toInstant();
        org.joda.time.Chronology chronology43 = instant42.getChronology();
        org.joda.time.DurationField durationField44 = chronology43.months();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime25 and instant42", (dateTime25.compareTo(instant42) == 0) == dateTime25.equals(instant42));
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1078");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime2.plus(readableDuration4);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((long) 0, chronology7);
        org.joda.time.DateTime.Property property9 = dateTime8.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.DateTime dateTime11 = dateTime8.plus(readableDuration10);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int13 = dateTime11.get(dateTimeFieldType12);
        boolean boolean14 = dateTime5.isEqual((org.joda.time.ReadableInstant) dateTime11);
        org.joda.time.Instant instant15 = dateTime11.toInstant();
        boolean boolean16 = instant15.isAfterNow();
        org.joda.time.Instant instant18 = instant15.minus((long) 61285);
        org.joda.time.Instant instant20 = instant15.withMillis((long) 797);
        org.joda.time.Instant instant23 = instant15.withDurationAdded(259199369L, 139);
        org.joda.time.Instant instant25 = instant23.minus((long) 804);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant15", (dateTime2.compareTo(instant15) == 0) == dateTime2.equals(instant15));
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1079");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime.Property property3 = localTime2.secondOfMinute();
        org.joda.time.LocalTime localTime5 = localTime2.plusMinutes((int) (short) 100);
        org.joda.time.LocalTime localTime7 = localTime5.withHourOfDay((int) (byte) 10);
        org.joda.time.Chronology chronology8 = localTime7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        boolean boolean10 = dateTimeFieldType0.isSupported(chronology8);
        org.joda.time.DateTimeField dateTimeField11 = chronology8.halfdayOfDay();
        org.joda.time.DateTime dateTime12 = org.joda.time.DateTime.now(chronology8);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime((long) '#', chronology14);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.LocalTime localTime17 = localTime15.plus(readablePeriod16);
        org.joda.time.LocalTime localTime19 = localTime15.minusSeconds(97);
        org.joda.time.LocalTime localTime21 = localTime19.withMillisOfDay(64333);
        org.joda.time.LocalTime localTime23 = new org.joda.time.LocalTime((long) (short) 1);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime((long) 0, chronology25);
        org.joda.time.DateTime.Property property27 = dateTime26.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration28 = null;
        org.joda.time.DateTime dateTime29 = dateTime26.plus(readableDuration28);
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int31 = dateTime29.get(dateTimeFieldType30);
        org.joda.time.LocalTime.Property property32 = localTime23.property(dateTimeFieldType30);
        int int33 = property32.getMinimumValueOverall();
        org.joda.time.LocalTime localTime34 = property32.getLocalTime();
        org.joda.time.LocalTime localTime35 = property32.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime37 = localTime35.withMillisOfSecond(32);
        int[] intArray38 = localTime35.getValues();
        chronology8.validate((org.joda.time.ReadablePartial) localTime21, intArray38);
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.DateTime dateTime42 = new org.joda.time.DateTime((long) 0, chronology41);
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.MutableDateTime mutableDateTime44 = dateTime42.toMutableDateTime(chronology43);
        org.joda.time.DateTime dateTime46 = dateTime42.minus((long) '#');
        org.joda.time.DateTime dateTime48 = dateTime42.withDayOfWeek(4);
        org.joda.time.DateTime.Property property49 = dateTime48.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone52 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.DateTime dateTime55 = new org.joda.time.DateTime((long) 0, chronology54);
        org.joda.time.DateTime.Property property56 = dateTime55.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration57 = null;
        org.joda.time.DateTime dateTime58 = dateTime55.plus(readableDuration57);
        org.joda.time.DateTime dateTime60 = dateTime55.withWeekOfWeekyear((int) (short) 10);
        int int61 = dateTimeZone52.getOffset((org.joda.time.ReadableInstant) dateTime60);
        org.joda.time.LocalTime localTime62 = new org.joda.time.LocalTime((java.lang.Object) dateTime48, dateTimeZone52);
        java.lang.String str64 = dateTimeZone52.getNameKey((long) 5);
        org.joda.time.Chronology chronology65 = chronology8.withZone(dateTimeZone52);
        org.joda.time.DateTimeField dateTimeField66 = chronology8.secondOfDay();
        org.joda.time.DurationField durationField67 = chronology8.eras();
        org.joda.time.DurationField durationField68 = chronology8.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField9 and durationField67", Math.signum(durationField9.compareTo(durationField67)) == -Math.signum(durationField67.compareTo(durationField9)));
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1080");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        int int3 = dateTime2.getSecondOfMinute();
        org.joda.time.DateTime dateTime5 = dateTime2.withYear(10);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((long) 0, chronology7);
        org.joda.time.DateTime.Property property9 = dateTime8.yearOfCentury();
        org.joda.time.DateTime dateTime11 = dateTime8.minusSeconds(9);
        org.joda.time.DateTime dateTime13 = dateTime8.minusMinutes(6);
        org.joda.time.YearMonthDay yearMonthDay14 = dateTime13.toYearMonthDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DurationFieldType durationFieldType16 = dateTimeFieldType15.getDurationType();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) 0, chronology18);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = dateTime19.toMutableDateTime(chronology20);
        org.joda.time.DateTime dateTime23 = dateTime19.minus((long) '#');
        org.joda.time.DateTime dateTime25 = dateTime19.withDayOfWeek(4);
        org.joda.time.LocalDate localDate26 = dateTime19.toLocalDate();
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        org.joda.time.LocalDate localDate28 = localDate26.plus(readablePeriod27);
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime((long) 0, chronology33);
        org.joda.time.DateTime.Property property35 = dateTime34.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration36 = null;
        org.joda.time.DateTime dateTime37 = dateTime34.plus(readableDuration36);
        org.joda.time.DateTime dateTime39 = dateTime34.withWeekOfWeekyear((int) (short) 10);
        int int40 = dateTimeZone31.getOffset((org.joda.time.ReadableInstant) dateTime39);
        org.joda.time.DateTime dateTime41 = localDate28.toDateTimeAtCurrentTime(dateTimeZone31);
        org.joda.time.Chronology chronology42 = dateTime41.getChronology();
        org.joda.time.DurationField durationField43 = chronology42.eras();
        org.joda.time.DateTimeField dateTimeField44 = dateTimeFieldType15.getField(chronology42);
        org.joda.time.DateTime.Property property45 = dateTime13.property(dateTimeFieldType15);
        org.joda.time.DateTime.Property property46 = dateTime5.property(dateTimeFieldType15);
        org.joda.time.DateTime dateTime48 = dateTime5.plusMonths(33120097);
        org.joda.time.ReadablePeriod readablePeriod49 = null;
        org.joda.time.DateTime dateTime50 = dateTime48.minus(readablePeriod49);
        org.joda.time.Instant instant51 = dateTime48.toInstant();
        boolean boolean53 = dateTime48.isEqual(1645514962881L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime48 and instant51", (dateTime48.compareTo(instant51) == 0) == dateTime48.equals(instant51));
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1081");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) 1970);
        org.joda.time.Instant instant4 = instant1.withDurationAdded((long) 32772, 7);
        org.joda.time.Instant instant5 = instant4.toInstant();
        org.joda.time.Instant instant6 = instant5.toInstant();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) 0, chronology9);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = dateTime10.toMutableDateTime(chronology11);
        org.joda.time.DateTime dateTime14 = dateTime10.minus((long) '#');
        org.joda.time.DateTime dateTime16 = dateTime10.withDayOfWeek(4);
        org.joda.time.LocalDate localDate17 = dateTime10.toLocalDate();
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        org.joda.time.LocalDate localDate19 = localDate17.plus(readablePeriod18);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime((long) 0, chronology24);
        org.joda.time.DateTime.Property property26 = dateTime25.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration27 = null;
        org.joda.time.DateTime dateTime28 = dateTime25.plus(readableDuration27);
        org.joda.time.DateTime dateTime30 = dateTime25.withWeekOfWeekyear((int) (short) 10);
        int int31 = dateTimeZone22.getOffset((org.joda.time.ReadableInstant) dateTime30);
        org.joda.time.DateTime dateTime32 = localDate19.toDateTimeAtCurrentTime(dateTimeZone22);
        org.joda.time.Chronology chronology33 = dateTime32.getChronology();
        org.joda.time.LocalDate localDate34 = new org.joda.time.LocalDate((long) 26403599, chronology33);
        org.joda.time.DateTimeField dateTimeField35 = chronology33.weekOfWeekyear();
        org.joda.time.DurationField durationField36 = chronology33.hours();
        org.joda.time.DateTimeField dateTimeField37 = chronology33.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField38 = chronology33.minuteOfHour();
        org.joda.time.MutableDateTime mutableDateTime39 = instant6.toMutableDateTime(chronology33);
        org.joda.time.LocalDateTime localDateTime40 = new org.joda.time.LocalDateTime();
        boolean boolean42 = localDateTime40.equals((java.lang.Object) (-1L));
        org.joda.time.LocalDateTime localDateTime44 = localDateTime40.withWeekyear(5);
        org.joda.time.LocalDateTime.Property property45 = localDateTime44.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime46 = property45.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime48 = property45.addWrapFieldToCopy((int) 'x');
        org.joda.time.LocalDateTime.Property property49 = localDateTime48.millisOfDay();
        org.joda.time.LocalDateTime localDateTime50 = property49.roundHalfCeilingCopy();
        long long52 = chronology33.set((org.joda.time.ReadablePartial) localDateTime50, 1645514677658L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant4 and mutableDateTime39", (instant4.compareTo(mutableDateTime39) == 0) == instant4.equals(mutableDateTime39));
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1082");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime2.plus(readableDuration4);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((long) 0, chronology7);
        org.joda.time.DateTime.Property property9 = dateTime8.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.DateTime dateTime11 = dateTime8.plus(readableDuration10);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int13 = dateTime11.get(dateTimeFieldType12);
        boolean boolean14 = dateTime5.isEqual((org.joda.time.ReadableInstant) dateTime11);
        org.joda.time.Instant instant15 = dateTime11.toInstant();
        org.joda.time.DateTime dateTime17 = dateTime11.withMillisOfDay(202);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant15", (dateTime2.compareTo(instant15) == 0) == dateTime2.equals(instant15));
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1083");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) 64358004);
        org.joda.time.MutableDateTime mutableDateTime2 = instant1.toMutableDateTime();
        org.joda.time.Instant instant4 = instant1.minus((long) 64443855);
        org.joda.time.Instant instant5 = instant1.toInstant();
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.Instant instant8 = instant1.withDurationAdded(readableDuration6, 75477942);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant8", (mutableDateTime2.compareTo(instant8) == 0) == mutableDateTime2.equals(instant8));
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1084");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime2.plus(readableDuration4);
        org.joda.time.DateTime dateTime7 = dateTime2.withWeekOfWeekyear((int) (short) 10);
        org.joda.time.DateTime dateTime9 = dateTime7.withYearOfEra(5);
        int int10 = dateTime9.getYear();
        org.joda.time.LocalDate localDate11 = dateTime9.toLocalDate();
        int int12 = localDate11.getMonthOfYear();
        org.joda.time.DateTime dateTime13 = localDate11.toDateTimeAtMidnight();
        int int14 = localDate11.getYearOfCentury();
        org.joda.time.DateTime dateTime15 = localDate11.toDateTimeAtMidnight();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate((long) (byte) 0, dateTimeZone17);
        org.joda.time.LocalDate.Property property19 = localDate18.weekOfWeekyear();
        org.joda.time.LocalDate localDate21 = localDate18.withWeekOfWeekyear(6);
        org.joda.time.Chronology chronology22 = localDate21.getChronology();
        org.joda.time.DurationField durationField23 = chronology22.hours();
        org.joda.time.DateTimeField dateTimeField24 = chronology22.weekOfWeekyear();
        org.joda.time.DateTime dateTime25 = dateTime15.withChronology(chronology22);
        org.joda.time.DateTime.Property property26 = dateTime25.dayOfYear();
        org.joda.time.DateTimeField dateTimeField27 = property26.getField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime13 and dateTime25", (dateTime13.compareTo(dateTime25) == 0) == dateTime13.equals(dateTime25));
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1085");
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        boolean boolean4 = dateTimeZone3.isFixed();
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) (byte) 100, dateTimeZone3);
        org.joda.time.DateTime dateTime7 = dateTime5.minusSeconds((-1));
        org.joda.time.DateTime.Property property8 = dateTime7.millisOfDay();
        org.joda.time.DateTime dateTime10 = dateTime7.withMillis((long) 461);
        int int11 = dateTime10.getYear();
        org.joda.time.MutableDateTime mutableDateTime12 = dateTime10.toMutableDateTimeISO();
        org.joda.time.DateTime.Property property13 = dateTime10.era();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((long) 0, chronology15);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = dateTime16.toMutableDateTime(chronology17);
        org.joda.time.DateTime dateTime20 = dateTime16.minus((long) '#');
        org.joda.time.DateTime dateTime22 = dateTime16.withDayOfWeek(4);
        org.joda.time.LocalDate localDate23 = dateTime16.toLocalDate();
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        org.joda.time.LocalDate localDate25 = localDate23.plus(readablePeriod24);
        org.joda.time.LocalDate.Property property26 = localDate25.weekyear();
        org.joda.time.LocalDate localDate27 = property26.withMinimumValue();
        org.joda.time.LocalDate localDate28 = property26.roundHalfFloorCopy();
        org.joda.time.LocalDate localDate30 = localDate28.withWeekOfWeekyear(23);
        org.joda.time.LocalDate localDate32 = localDate28.withYear(16);
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.LocalDate localDate35 = new org.joda.time.LocalDate((long) (byte) 0, dateTimeZone34);
        org.joda.time.LocalDate.Property property36 = localDate35.weekOfWeekyear();
        org.joda.time.LocalDate localDate38 = localDate35.withWeekOfWeekyear(6);
        org.joda.time.DateTimeFieldType dateTimeFieldType40 = localDate38.getFieldType((int) (short) 0);
        org.joda.time.LocalDate.Property property41 = localDate32.property(dateTimeFieldType40);
        org.joda.time.DateTimeFieldType dateTimeFieldType42 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DurationFieldType durationFieldType43 = dateTimeFieldType42.getDurationType();
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.DateTime dateTime46 = new org.joda.time.DateTime((long) 0, chronology45);
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.MutableDateTime mutableDateTime48 = dateTime46.toMutableDateTime(chronology47);
        org.joda.time.DateTime dateTime50 = dateTime46.minus((long) '#');
        org.joda.time.DateTime dateTime52 = dateTime46.withDayOfWeek(4);
        org.joda.time.LocalDate localDate53 = dateTime46.toLocalDate();
        org.joda.time.ReadablePeriod readablePeriod54 = null;
        org.joda.time.LocalDate localDate55 = localDate53.plus(readablePeriod54);
        org.joda.time.DateTimeZone dateTimeZone58 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.Chronology chronology60 = null;
        org.joda.time.DateTime dateTime61 = new org.joda.time.DateTime((long) 0, chronology60);
        org.joda.time.DateTime.Property property62 = dateTime61.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration63 = null;
        org.joda.time.DateTime dateTime64 = dateTime61.plus(readableDuration63);
        org.joda.time.DateTime dateTime66 = dateTime61.withWeekOfWeekyear((int) (short) 10);
        int int67 = dateTimeZone58.getOffset((org.joda.time.ReadableInstant) dateTime66);
        org.joda.time.DateTime dateTime68 = localDate55.toDateTimeAtCurrentTime(dateTimeZone58);
        org.joda.time.Chronology chronology69 = dateTime68.getChronology();
        org.joda.time.DurationField durationField70 = chronology69.eras();
        org.joda.time.DateTimeField dateTimeField71 = dateTimeFieldType42.getField(chronology69);
        org.joda.time.DateTimeField dateTimeField72 = dateTimeFieldType40.getField(chronology69);
        boolean boolean73 = dateTime10.isSupported(dateTimeFieldType40);
        org.joda.time.DateTime.Property property74 = dateTime10.dayOfWeek();
        org.joda.time.DateTime dateTime75 = property74.roundHalfEvenCopy();
        org.joda.time.DateTime dateTime76 = property74.roundFloorCopy();
        org.joda.time.DurationField durationField77 = property74.getDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField70, durationField77, and durationField70", !(durationField70.compareTo(durationField77) == 0) || (Math.signum(durationField70.compareTo(durationField70)) == Math.signum(durationField77.compareTo(durationField70))));
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1086");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime2.plus(readableDuration4);
        org.joda.time.DateTime dateTime7 = dateTime2.withWeekOfWeekyear((int) (short) 10);
        org.joda.time.DateTime dateTime9 = dateTime7.withYearOfEra(5);
        org.joda.time.DateTime dateTime11 = dateTime7.plusHours((int) (byte) 10);
        org.joda.time.DateTime dateTime13 = dateTime7.plusWeeks((int) (byte) 0);
        org.joda.time.YearMonthDay yearMonthDay14 = dateTime7.toYearMonthDay();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHours(1);
        java.util.TimeZone timeZone17 = dateTimeZone16.toTimeZone();
        org.joda.time.DateTime dateTime18 = dateTime7.toDateTime(dateTimeZone16);
        boolean boolean19 = dateTimeZone16.isFixed();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime7 and dateTime18", (dateTime7.compareTo(dateTime18) == 0) == dateTime7.equals(dateTime18));
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1087");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "und", "Thu Jan 01 00:00:00 UTC 1970" };
        java.util.LinkedHashSet<java.lang.String> strSet4 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet4, strArray3);
        java.util.Locale locale7 = java.util.Locale.forLanguageTag("");
        java.util.Set<java.lang.String> strSet8 = locale7.getUnicodeLocaleKeys();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTimeField dateTimeField11 = dateTimeFieldType9.getField(chronology10);
        org.joda.time.ReadablePartial readablePartial12 = null;
        java.util.Locale locale15 = java.util.Locale.forLanguageTag("");
        java.lang.String str16 = dateTimeField11.getAsShortText(readablePartial12, (int) (byte) 1, locale15);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) 0, chronology18);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = dateTime19.toMutableDateTime(chronology20);
        org.joda.time.DateTime dateTime23 = dateTime19.minus((long) '#');
        org.joda.time.DateTime dateTime25 = dateTime19.withDayOfWeek(4);
        org.joda.time.LocalDate localDate26 = dateTime19.toLocalDate();
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        org.joda.time.LocalDate localDate28 = localDate26.plus(readablePeriod27);
        java.util.Locale.FilteringMode filteringMode29 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        boolean boolean30 = localDate26.equals((java.lang.Object) filteringMode29);
        int int31 = dateTimeField11.getMaximumValue((org.joda.time.ReadablePartial) localDate26);
        boolean boolean32 = strSet8.equals((java.lang.Object) int31);
        boolean boolean33 = strSet4.addAll((java.util.Collection<java.lang.String>) strSet8);
        int int34 = strSet4.size();
        org.joda.time.Instant instant36 = new org.joda.time.Instant((long) 64358004);
        org.joda.time.MutableDateTime mutableDateTime37 = instant36.toMutableDateTime();
        boolean boolean38 = strSet4.remove((java.lang.Object) instant36);
        org.joda.time.Chronology chronology39 = instant36.getChronology();
        org.joda.time.DateTimeField dateTimeField40 = chronology39.era();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant36 and mutableDateTime37", (instant36.compareTo(mutableDateTime37) == 0) == instant36.equals(mutableDateTime37));
    }
}

