import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test01");
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (short) 1);
        org.joda.time.DateMidnight.Property property3 = dateMidnight2.monthOfYear();
        org.joda.time.Chronology chronology4 = dateMidnight2.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.years();
        org.joda.time.DurationField durationField6 = chronology4.eras();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((long) '4', chronology4);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField5 and durationField6", Math.signum(durationField5.compareTo(durationField6)) == -Math.signum(durationField6.compareTo(durationField5)));
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((int) (byte) 1, (int) (byte) 100, 0, 0, (int) ' ', (int) 'a', (int) 'a', 1);
        mutablePeriod8.setYears((int) '#');
        org.joda.time.Duration duration12 = org.joda.time.Duration.standardSeconds((long) (byte) -1);
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight((long) (short) 1);
        org.joda.time.DateMidnight.Property property15 = dateMidnight14.monthOfYear();
        org.joda.time.DateMidnight dateMidnight17 = new org.joda.time.DateMidnight((long) (short) 1);
        long long18 = property15.getDifferenceAsLong((org.joda.time.ReadableInstant) dateMidnight17);
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        org.joda.time.DateMidnight dateMidnight21 = dateMidnight17.withField(dateTimeFieldType19, (int) ' ');
        org.joda.time.Period period22 = duration12.toPeriodTo((org.joda.time.ReadableInstant) dateMidnight21);
        org.joda.time.DateMidnight dateMidnight24 = new org.joda.time.DateMidnight((long) (short) 1);
        org.joda.time.DateMidnight.Property property25 = dateMidnight24.monthOfYear();
        org.joda.time.Chronology chronology26 = dateMidnight24.getChronology();
        org.joda.time.DurationField durationField27 = chronology26.years();
        org.joda.time.DurationField durationField28 = chronology26.eras();
        mutablePeriod8.setPeriod((org.joda.time.ReadableDuration) duration12, chronology26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField27 and durationField28", Math.signum(durationField27.compareTo(durationField28)) == -Math.signum(durationField28.compareTo(durationField27)));
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight((long) (short) 1);
        org.joda.time.DateMidnight.Property property2 = dateMidnight1.monthOfYear();
        org.joda.time.Chronology chronology3 = dateMidnight1.getChronology();
        org.joda.time.DurationField durationField4 = chronology3.years();
        org.joda.time.DurationField durationField5 = chronology3.eras();
        org.joda.time.DurationField durationField6 = chronology3.weeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField4 and durationField5", Math.signum(durationField4.compareTo(durationField5)) == -Math.signum(durationField5.compareTo(durationField4)));
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        mutableDateTime0.add((long) (byte) 0);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period(readableInstant3, readableInstant4);
        mutableDateTime0.add((org.joda.time.ReadablePeriod) period5);
        mutableDateTime0.setTime((long) (byte) 10);
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime0.secondOfDay();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime0.minuteOfHour();
        mutableDateTime0.setMonthOfYear(1);
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight((long) (short) 1);
        org.joda.time.DateMidnight.Property property15 = dateMidnight14.monthOfYear();
        org.joda.time.Chronology chronology16 = dateMidnight14.getChronology();
        org.joda.time.DurationField durationField17 = chronology16.years();
        org.joda.time.DurationField durationField18 = chronology16.eras();
        mutableDateTime0.setChronology(chronology16);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField17 and durationField18", Math.signum(durationField17.compareTo(durationField18)) == -Math.signum(durationField18.compareTo(durationField17)));
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight((long) (short) 1);
        org.joda.time.DateMidnight.Property property2 = dateMidnight1.monthOfYear();
        org.joda.time.Chronology chronology3 = dateMidnight1.getChronology();
        org.joda.time.DurationField durationField4 = chronology3.years();
        org.joda.time.DurationField durationField5 = chronology3.eras();
        org.joda.time.DateTime dateTime6 = org.joda.time.DateTime.now(chronology3);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField4 and durationField5", Math.signum(durationField4.compareTo(durationField5)) == -Math.signum(durationField5.compareTo(durationField4)));
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        java.text.ParsePosition parsePosition1 = new java.text.ParsePosition(1024);
        java.lang.String str2 = parsePosition1.toString();
        java.util.Locale locale3 = java.util.Locale.KOREA;
        java.lang.String str4 = locale3.getDisplayScript();
        java.util.Set<java.lang.String> strSet5 = locale3.getUnicodeLocaleKeys();
        java.util.Locale.LanguageRange[] languageRangeArray6 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList7 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList7, languageRangeArray6);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap9 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList10 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList7, strMap9);
        boolean boolean12 = languageRangeList10.contains((java.lang.Object) "");
        boolean boolean13 = languageRangeList10.isEmpty();
        boolean boolean15 = languageRangeList10.remove((java.lang.Object) 10L);
        boolean boolean16 = strSet5.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList10);
        int int17 = strSet5.size();
        org.joda.time.DateMidnight dateMidnight19 = new org.joda.time.DateMidnight((long) (short) 1);
        org.joda.time.DateMidnight.Property property20 = dateMidnight19.monthOfYear();
        org.joda.time.DateMidnight dateMidnight22 = new org.joda.time.DateMidnight((long) (short) 1);
        long long23 = property20.getDifferenceAsLong((org.joda.time.ReadableInstant) dateMidnight22);
        boolean boolean24 = strSet5.contains((java.lang.Object) dateMidnight22);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.weekyear();
        boolean boolean26 = dateMidnight22.isSupported(dateTimeFieldType25);
        org.joda.time.Instant instant27 = dateMidnight22.toInstant();
        boolean boolean28 = parsePosition1.equals((java.lang.Object) dateMidnight22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight19 and instant27", (dateMidnight19.compareTo(instant27) == 0) == dateMidnight19.equals(instant27));
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        boolean boolean3 = timeZone1.hasSameRules(timeZone2);
        int int4 = timeZone2.getRawOffset();
        java.util.Calendar.Builder builder5 = builder0.setTimeZone(timeZone2);
        java.time.Clock clock6 = java.time.Clock.systemUTC();
        java.time.Instant instant7 = clock6.instant();
        java.util.Date date8 = java.util.Date.from(instant7);
        date8.setHours((int) (short) 10);
        java.util.Calendar.Builder builder11 = builder5.setInstant(date8);
        java.util.Calendar.Builder builder13 = builder11.setInstant(125L);
        java.util.Calendar.Builder builder17 = builder13.setWeekDate(96, 956000000, 37930000);
        java.util.Locale locale18 = java.util.Locale.KOREA;
        java.util.GregorianCalendar gregorianCalendar19 = new java.util.GregorianCalendar(locale18);
        org.joda.time.YearMonthDay yearMonthDay20 = org.joda.time.YearMonthDay.fromCalendarFields((java.util.Calendar) gregorianCalendar19);
        java.time.Instant instant21 = gregorianCalendar19.toInstant();
        java.time.Clock clock22 = java.time.Clock.systemDefaultZone();
        boolean boolean23 = gregorianCalendar19.after((java.lang.Object) clock22);
        java.util.TimeZone timeZone24 = gregorianCalendar19.getTimeZone();
        timeZone24.setRawOffset(19);
        java.util.Calendar.Builder builder27 = builder17.setTimeZone(timeZone24);
        java.util.Locale locale28 = java.util.Locale.KOREA;
        java.util.GregorianCalendar gregorianCalendar29 = new java.util.GregorianCalendar(locale28);
        org.joda.time.YearMonthDay yearMonthDay30 = org.joda.time.YearMonthDay.fromCalendarFields((java.util.Calendar) gregorianCalendar29);
        java.time.Instant instant31 = gregorianCalendar29.toInstant();
        java.util.TimeZone timeZone32 = gregorianCalendar29.getTimeZone();
        java.time.ZoneId zoneId33 = timeZone32.toZoneId();
        java.util.Calendar.Builder builder34 = builder27.setTimeZone(timeZone32);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on gregorianCalendar19 and gregorianCalendar29", (gregorianCalendar19.compareTo(gregorianCalendar29) == 0) == gregorianCalendar19.equals(gregorianCalendar29));
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.Instant instant3 = instant0.withDurationAdded((long) 0, 365);
        org.joda.time.DateTime dateTime4 = instant0.toDateTime();
        java.util.Date date5 = instant0.toDate();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime4", (instant0.compareTo(dateTime4) == 0) == instant0.equals(dateTime4));
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        java.time.LocalDateTime localDateTime0 = java.time.LocalDateTime.now();
        java.time.LocalDateTime localDateTime1 = java.time.LocalDateTime.now();
        boolean boolean2 = localDateTime0.isAfter((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime1);
        java.util.TimeZone timeZone3 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone4 = java.util.TimeZone.getDefault();
        boolean boolean5 = timeZone3.hasSameRules(timeZone4);
        java.time.ZoneId zoneId6 = timeZone3.toZoneId();
        java.time.ZonedDateTime zonedDateTime7 = localDateTime0.atZone(zoneId6);
        java.time.LocalDateTime localDateTime8 = java.time.LocalDateTime.now();
        java.time.LocalTime localTime9 = localDateTime8.toLocalTime();
        java.time.LocalDateTime localDateTime11 = localDateTime8.withNano(0);
        java.time.Duration duration13 = java.time.Duration.ofHours(0L);
        java.time.Duration duration15 = java.time.Duration.ofHours(0L);
        int int16 = duration13.compareTo(duration15);
        java.time.Duration duration18 = duration13.minusMinutes((long) 'a');
        java.util.List<java.time.temporal.TemporalUnit> temporalUnitList19 = duration13.getUnits();
        java.time.temporal.Temporal temporal20 = localDateTime11.plus((java.time.temporal.TemporalAmount) duration13);
        boolean boolean21 = localDateTime0.isEqual((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime11);
        org.joda.time.TimeOfDay timeOfDay23 = org.joda.time.TimeOfDay.fromMillisOfDay((long) ' ');
        org.joda.time.TimeOfDay.Property property24 = timeOfDay23.minuteOfHour();
        int int25 = property24.getMaximumValueOverall();
        org.joda.time.DateMidnight dateMidnight27 = new org.joda.time.DateMidnight((long) (short) 1);
        org.joda.time.DateMidnight.Property property28 = dateMidnight27.monthOfYear();
        org.joda.time.DateMidnight dateMidnight30 = new org.joda.time.DateMidnight((long) (short) 1);
        long long31 = property28.getDifferenceAsLong((org.joda.time.ReadableInstant) dateMidnight30);
        java.util.Locale locale32 = java.util.Locale.getDefault();
        int int33 = property28.getMaximumTextLength(locale32);
        java.util.Locale.setDefault(locale32);
        java.lang.String str35 = property24.getAsText(locale32);
        int int36 = property24.getMinimumValue();
        org.joda.time.DurationField durationField37 = property24.getRangeDurationField();
        org.joda.time.TimeOfDay timeOfDay39 = property24.addWrapFieldToCopy(21);
        org.joda.time.TimeOfDay timeOfDay40 = property24.withMinimumValue();
        boolean boolean41 = localDateTime0.equals((java.lang.Object) timeOfDay40);
        org.joda.time.Instant instant42 = org.joda.time.Instant.now();
        org.joda.time.Instant instant45 = instant42.withDurationAdded((long) 0, 365);
        org.joda.time.MutableDateTime mutableDateTime46 = instant42.toMutableDateTimeISO();
        boolean boolean47 = localDateTime0.equals((java.lang.Object) mutableDateTime46);
        org.joda.time.MutableDateTime mutableDateTime48 = org.joda.time.MutableDateTime.now();
        mutableDateTime48.add((long) (byte) 0);
        org.joda.time.ReadableInstant readableInstant51 = null;
        org.joda.time.ReadableInstant readableInstant52 = null;
        org.joda.time.Period period53 = new org.joda.time.Period(readableInstant51, readableInstant52);
        mutableDateTime48.add((org.joda.time.ReadablePeriod) period53);
        mutableDateTime48.setTime((long) (byte) 10);
        org.joda.time.MutableDateTime.Property property57 = mutableDateTime48.secondOfDay();
        org.joda.time.MutableDateTime.Property property58 = mutableDateTime48.minuteOfHour();
        org.joda.time.DateMidnight dateMidnight60 = new org.joda.time.DateMidnight((long) (short) 1);
        org.joda.time.DateMidnight.Property property61 = dateMidnight60.monthOfYear();
        org.joda.time.DateMidnight dateMidnight63 = new org.joda.time.DateMidnight((long) (short) 1);
        long long64 = property61.getDifferenceAsLong((org.joda.time.ReadableInstant) dateMidnight63);
        java.util.Locale locale65 = java.util.Locale.getDefault();
        int int66 = property61.getMaximumTextLength(locale65);
        org.joda.time.DateMidnight dateMidnight67 = property61.roundHalfCeilingCopy();
        org.joda.time.Duration duration69 = org.joda.time.Duration.millis((long) 'a');
        org.joda.time.DateMidnight dateMidnight70 = dateMidnight67.plus((org.joda.time.ReadableDuration) duration69);
        mutableDateTime48.setDate((org.joda.time.ReadableInstant) dateMidnight67);
        org.joda.time.DurationFieldType durationFieldType72 = org.joda.time.DurationFieldType.weekyears();
        mutableDateTime48.add(durationFieldType72, 12);
        org.joda.time.MutableDateTime.Property property75 = mutableDateTime48.minuteOfDay();
        org.joda.time.Period period76 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime46, (org.joda.time.ReadableInstant) mutableDateTime48);
        org.joda.time.Period period78 = period76.minusMillis(0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant42 and mutableDateTime46", (instant42.compareTo(mutableDateTime46) == 0) == instant42.equals(mutableDateTime46));
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.Instant instant3 = instant0.withDurationAdded((long) 0, 365);
        java.util.TimeZone timeZone6 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone7 = java.util.TimeZone.getDefault();
        boolean boolean8 = timeZone6.hasSameRules(timeZone7);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime((long) 32, dateTimeZone9);
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((int) (short) 1, 10, (int) (short) 10, (int) (byte) 10, (int) ' ', (int) (byte) 10);
        org.joda.time.DateTime dateTime19 = dateTime17.plusMonths((int) (short) 1);
        org.joda.time.DateTime.Property property20 = dateTime19.hourOfDay();
        org.joda.time.DateTime dateTime21 = property20.roundFloorCopy();
        org.joda.time.DateTime.Property property22 = dateTime21.centuryOfEra();
        int int23 = dateTimeZone9.getOffset((org.joda.time.ReadableInstant) dateTime21);
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate(dateTimeZone9);
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime(3000L, dateTimeZone9);
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate();
        int int27 = localDate26.getYearOfEra();
        int int28 = localDate26.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime29 = dateTime25.withFields((org.joda.time.ReadablePartial) localDate26);
        org.joda.time.Minutes minutes30 = org.joda.time.Minutes.minutesBetween((org.joda.time.ReadableInstant) instant3, (org.joda.time.ReadableInstant) dateTime25);
        org.joda.time.MutableDateTime mutableDateTime31 = instant3.toMutableDateTime();
        org.joda.time.Instant instant33 = instant3.withMillis((long) 126);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime31", (instant3.compareTo(mutableDateTime31) == 0) == instant3.equals(mutableDateTime31));
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.weeks();
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight((long) (short) 1);
        org.joda.time.DateMidnight.Property property6 = dateMidnight5.monthOfYear();
        org.joda.time.Chronology chronology7 = dateMidnight5.getChronology();
        org.joda.time.YearMonthDay yearMonthDay8 = new org.joda.time.YearMonthDay((long) 50, chronology7);
        org.joda.time.DurationField durationField9 = chronology7.weeks();
        org.joda.time.DurationField durationField10 = chronology7.eras();
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((long) 956000000, 1645436551L, periodType2, chronology7);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField9 and durationField10", Math.signum(durationField9.compareTo(durationField10)) == -Math.signum(durationField10.compareTo(durationField9)));
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        org.joda.time.TimeOfDay timeOfDay1 = org.joda.time.TimeOfDay.fromMillisOfDay((long) ' ');
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight((long) (short) 1);
        org.joda.time.DateMidnight.Property property5 = dateMidnight4.monthOfYear();
        org.joda.time.Chronology chronology6 = dateMidnight4.getChronology();
        org.joda.time.DurationField durationField7 = chronology6.halfdays();
        org.joda.time.DateMidnight dateMidnight8 = new org.joda.time.DateMidnight(0L, chronology6);
        org.joda.time.TimeOfDay timeOfDay9 = timeOfDay1.withChronologyRetainFields(chronology6);
        org.joda.time.DurationField durationField10 = chronology6.eras();
        org.joda.time.LocalTime localTime11 = org.joda.time.LocalTime.now(chronology6);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField7 and durationField10", Math.signum(durationField7.compareTo(durationField10)) == -Math.signum(durationField10.compareTo(durationField7)));
    }
}

