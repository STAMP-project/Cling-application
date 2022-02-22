import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest5 {

    public static boolean debug = false;

    @Test
    public void test2501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2501");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime2 = instant1.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.withZoneRetainFields(dateTimeZone3);
        org.joda.time.DateTime.Property property5 = dateTime4.centuryOfEra();
        boolean boolean7 = property5.equals((java.lang.Object) "1969-12-31T23:59:59.899Z");
        java.util.Locale locale8 = java.util.Locale.KOREA;
        int int9 = property5.getMaximumTextLength(locale8);
        org.joda.time.DateTimeField dateTimeField10 = property5.getField();
        org.joda.time.Interval interval11 = property5.toInterval();
        java.lang.String str12 = interval11.toString();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(chronology13);
        org.joda.time.DateTime.Property property15 = dateTime14.yearOfEra();
        org.joda.time.Interval interval16 = property15.toInterval();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(chronology17);
        org.joda.time.DateTime.Property property19 = dateTime18.yearOfEra();
        org.joda.time.Interval interval20 = property19.toInterval();
        boolean boolean21 = interval16.contains((org.joda.time.ReadableInterval) interval20);
        java.lang.String str22 = interval16.toString();
        long long23 = interval16.getEndMillis();
        org.joda.time.Duration duration26 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.PeriodType periodType28 = null;
        org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration26, readableInstant27, periodType28);
        org.joda.time.Days days30 = org.joda.time.Days.THREE;
        org.joda.time.DurationFieldType durationFieldType31 = org.joda.time.DurationFieldType.minutes();
        int int32 = days30.get(durationFieldType31);
        mutablePeriod29.add(durationFieldType31, 8);
        int int35 = mutablePeriod29.getHours();
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime(chronology36);
        org.joda.time.DateTime.Property property38 = dateTime37.yearOfEra();
        org.joda.time.Interval interval39 = property38.toInterval();
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime(chronology40);
        org.joda.time.DateTime.Property property42 = dateTime41.yearOfEra();
        org.joda.time.Interval interval43 = property42.toInterval();
        boolean boolean44 = interval39.contains((org.joda.time.ReadableInterval) interval43);
        java.lang.String str45 = interval39.toString();
        mutablePeriod29.add((org.joda.time.ReadableInterval) interval39);
        java.lang.String str47 = interval39.toString();
        java.lang.Object obj48 = null;
        boolean boolean49 = interval39.equals(obj48);
        boolean boolean50 = interval16.isBefore((org.joda.time.ReadableInterval) interval39);
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.DateTime dateTime52 = new org.joda.time.DateTime(chronology51);
        org.joda.time.DateTime.Property property53 = dateTime52.yearOfEra();
        org.joda.time.Interval interval54 = property53.toInterval();
        org.joda.time.DateTime dateTime55 = interval54.getStart();
        boolean boolean56 = interval16.contains((org.joda.time.ReadableInterval) interval54);
        boolean boolean57 = interval11.contains((org.joda.time.ReadableInterval) interval16);
        java.lang.Object obj58 = null;
        org.joda.time.Instant instant59 = new org.joda.time.Instant(obj58);
        org.joda.time.DateTimeZone dateTimeZone60 = instant59.getZone();
        java.lang.String str61 = dateTimeZone60.toString();
        org.joda.time.DateTime dateTime62 = new org.joda.time.DateTime(dateTimeZone60);
        org.joda.time.Days days63 = org.joda.time.Days.FIVE;
        org.joda.time.DateTime dateTime64 = dateTime62.plus((org.joda.time.ReadablePeriod) days63);
        org.joda.time.DateTime.Property property65 = dateTime62.dayOfYear();
        java.util.GregorianCalendar gregorianCalendar66 = dateTime62.toGregorianCalendar();
        org.joda.time.DateTime dateTime68 = dateTime62.plusMinutes((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType69 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.DateTime.Property property70 = dateTime62.property(dateTimeFieldType69);
        boolean boolean71 = interval16.equals((java.lang.Object) property70);
        org.joda.time.DateTime dateTime72 = interval16.getEnd();
        boolean boolean73 = dateTime72.isAfterNow();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime2", (instant1.compareTo(dateTime2) == 0) == instant1.equals(dateTime2));
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2502");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime2 = instant1.toDateTime();
        org.joda.time.DateTime.Property property3 = dateTime2.era();
        org.joda.time.DateTime dateTime4 = dateTime2.withTimeAtStartOfDay();
        org.joda.time.Instant instant5 = dateTime2.toInstant();
        org.joda.time.TimeOfDay timeOfDay6 = dateTime2.toTimeOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateTimeField dateTimeField9 = dateTimeFieldType7.getField(chronology8);
        long long12 = dateTimeField9.add(0L, (long) (short) 1);
        long long14 = dateTimeField9.roundHalfCeiling((long) 2);
        org.joda.time.Instant instant16 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime17 = instant16.toDateTime();
        org.joda.time.DateTime.Property property18 = dateTime17.era();
        org.joda.time.Instant instant20 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.Instant instant22 = instant20.minus(100L);
        org.joda.time.Instant instant24 = instant22.plus((long) 100);
        org.joda.time.Instant instant26 = instant22.withMillis((long) (byte) 1);
        org.joda.time.Minutes minutes27 = org.joda.time.Minutes.minutesBetween((org.joda.time.ReadableInstant) dateTime17, (org.joda.time.ReadableInstant) instant22);
        org.joda.time.LocalTime localTime28 = dateTime17.toLocalTime();
        org.joda.time.Duration duration32 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.PeriodType periodType34 = null;
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration32, readableInstant33, periodType34);
        mutablePeriod35.setMonths((int) '4');
        org.joda.time.Period period38 = mutablePeriod35.toPeriod();
        int[] intArray39 = period38.getValues();
        int[] intArray41 = dateTimeField9.addWrapField((org.joda.time.ReadablePartial) localTime28, 0, intArray39, 3);
        org.joda.time.Minutes minutes42 = org.joda.time.Minutes.minutesBetween((org.joda.time.ReadablePartial) timeOfDay6, (org.joda.time.ReadablePartial) localTime28);
        org.joda.time.Minutes minutes44 = minutes42.dividedBy(5);
        int int45 = minutes44.getMinutes();
        org.joda.time.Duration duration48 = new org.joda.time.Duration((long) ' ', (long) ' ');
        org.joda.time.Period period49 = duration48.toPeriod();
        org.joda.time.Duration duration51 = duration48.plus((long) (byte) 0);
        org.joda.time.Minutes minutes52 = duration48.toStandardMinutes();
        boolean boolean53 = minutes44.isLessThan(minutes52);
        org.joda.time.Minutes minutes55 = org.joda.time.Minutes.minutes((int) (short) -1);
        org.joda.time.Period period56 = minutes55.toPeriod();
        org.joda.time.DurationFieldType durationFieldType57 = minutes55.getFieldType();
        org.joda.time.Minutes minutes59 = minutes55.multipliedBy((int) (byte) 100);
        int int60 = minutes55.size();
        org.joda.time.Minutes minutes62 = minutes55.dividedBy(18);
        org.joda.time.Minutes minutes64 = minutes55.minus(525600);
        org.joda.time.Minutes minutes65 = minutes52.plus(minutes64);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime2", (instant1.compareTo(dateTime2) == 0) == instant1.equals(dateTime2));
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2503");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime2 = instant1.toDateTime();
        org.joda.time.DateTime.Property property3 = dateTime2.era();
        org.joda.time.DateTime dateTime4 = dateTime2.withTimeAtStartOfDay();
        org.joda.time.Duration duration7 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.PeriodType periodType9 = null;
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration7, readableInstant8, periodType9);
        mutablePeriod10.setMonths((int) '4');
        org.joda.time.DateTime dateTime13 = dateTime2.plus((org.joda.time.ReadablePeriod) mutablePeriod10);
        org.joda.time.LocalDate localDate14 = dateTime2.toLocalDate();
        org.joda.time.Instant instant16 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime17 = instant16.toDateTime();
        org.joda.time.DateTime.Property property18 = dateTime17.era();
        org.joda.time.DateTime dateTime19 = dateTime17.withTimeAtStartOfDay();
        org.joda.time.Instant instant20 = dateTime17.toInstant();
        org.joda.time.Seconds seconds21 = org.joda.time.Seconds.secondsBetween((org.joda.time.ReadableInstant) dateTime2, (org.joda.time.ReadableInstant) instant20);
        org.joda.time.Instant instant23 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime24 = instant23.toDateTime();
        org.joda.time.DateTime.Property property25 = dateTime24.era();
        org.joda.time.DateTime dateTime26 = property25.withMinimumValue();
        int int27 = property25.getMaximumValueOverall();
        java.util.Locale locale28 = java.util.Locale.ENGLISH;
        java.lang.String str29 = locale28.getScript();
        java.lang.String str30 = locale28.getDisplayCountry();
        int int31 = property25.getMaximumShortTextLength(locale28);
        org.joda.time.DateTime dateTime32 = property25.withMaximumValue();
        org.joda.time.PeriodType periodType33 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType34 = periodType33.withMinutesRemoved();
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime2, (org.joda.time.ReadableInstant) dateTime32, periodType33);
        org.joda.time.DateTime dateTime37 = dateTime32.plusWeeks((-2147483648));
        long long38 = dateTime37.getMillis();
        org.joda.time.DateTime.Property property39 = dateTime37.dayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime2", (instant1.compareTo(dateTime2) == 0) == instant1.equals(dateTime2));
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2504");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.Instant instant3 = instant1.minus(100L);
        java.lang.String str4 = instant3.toString();
        org.joda.time.Duration duration7 = new org.joda.time.Duration((long) ' ', (long) ' ');
        org.joda.time.Period period8 = duration7.toPeriod();
        org.joda.time.Duration duration10 = duration7.plus((long) (byte) 0);
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.Period period12 = duration7.toPeriodTo(readableInstant11);
        org.joda.time.Duration duration14 = duration7.withMillis((long) (short) 0);
        org.joda.time.Instant instant15 = instant3.plus((org.joda.time.ReadableDuration) duration7);
        org.joda.time.Instant instant17 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime18 = instant17.toDateTime();
        org.joda.time.DateTime.Property property19 = dateTime18.era();
        org.joda.time.DateTime dateTime20 = dateTime18.withTimeAtStartOfDay();
        org.joda.time.Duration duration23 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.PeriodType periodType25 = null;
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration23, readableInstant24, periodType25);
        mutablePeriod26.setMonths((int) '4');
        org.joda.time.DateTime dateTime29 = dateTime18.plus((org.joda.time.ReadablePeriod) mutablePeriod26);
        org.joda.time.Instant instant31 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.Instant instant32 = instant31.toInstant();
        boolean boolean33 = dateTime18.isEqual((org.joda.time.ReadableInstant) instant32);
        boolean boolean34 = instant15.isAfter((org.joda.time.ReadableInstant) instant32);
        org.joda.time.Instant instant35 = instant32.toInstant();
        org.joda.time.Period period37 = org.joda.time.Period.millis((int) (short) -1);
        org.joda.time.Period period39 = period37.plusWeeks((int) (byte) 1);
        int int40 = period37.size();
        org.joda.time.ReadablePeriod readablePeriod41 = null;
        org.joda.time.Period period42 = period37.minus(readablePeriod41);
        org.joda.time.Period period44 = period37.minusWeeks(2);
        org.joda.time.Period period46 = period44.withHours(1969);
        org.joda.time.Period period47 = period46.negated();
        boolean boolean48 = instant35.equals((java.lang.Object) period46);
        org.joda.time.Period period50 = period46.plusMonths(999);
        org.joda.time.Period period52 = period50.withMillis(1970);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime18", (instant1.compareTo(dateTime18) == 0) == instant1.equals(dateTime18));
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2505");
        org.joda.time.Duration duration2 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.Seconds seconds3 = duration2.toStandardSeconds();
        org.joda.time.ReadableDuration readableDuration4 = null;
        boolean boolean5 = duration2.isEqual(readableDuration4);
        org.joda.time.Duration duration7 = duration2.minus((long) 1);
        org.joda.time.Duration duration9 = duration7.minus((long) '4');
        org.joda.time.Instant instant11 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime12 = instant11.toDateTime();
        org.joda.time.DateTime.Property property13 = dateTime12.era();
        org.joda.time.Duration duration16 = new org.joda.time.Duration((long) 0, (long) (byte) 100);
        org.joda.time.Duration duration19 = new org.joda.time.Duration((long) ' ', (long) ' ');
        org.joda.time.Period period20 = duration19.toPeriod();
        org.joda.time.Duration duration22 = duration19.plus((long) (byte) 0);
        org.joda.time.Instant instant24 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime25 = instant24.toDateTime();
        boolean boolean27 = dateTime25.isEqual(10L);
        org.joda.time.PeriodType periodType30 = org.joda.time.PeriodType.yearDay();
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod((long) 100, 0L, periodType30, chronology31);
        org.joda.time.PeriodType periodType33 = periodType30.withWeeksRemoved();
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration22, (org.joda.time.ReadableInstant) dateTime25, periodType33);
        org.joda.time.Period period35 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime12, (org.joda.time.ReadableDuration) duration16, periodType33);
        org.joda.time.PeriodType periodType36 = org.joda.time.PeriodType.dayTime();
        org.joda.time.Period period37 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration7, (org.joda.time.ReadableInstant) dateTime12, periodType36);
        org.joda.time.TimeOfDay timeOfDay38 = dateTime12.toTimeOfDay();
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.DateTime dateTime40 = timeOfDay38.toDateTime(readableInstant39);
        org.joda.time.Instant instant42 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.Instant instant44 = instant42.minus(100L);
        org.joda.time.MutableDateTime mutableDateTime45 = instant42.toMutableDateTimeISO();
        org.joda.time.DateTime dateTime46 = timeOfDay38.toDateTime((org.joda.time.ReadableInstant) instant42);
        org.joda.time.DateTimeFieldType dateTimeFieldType47 = org.joda.time.DateTimeFieldType.year();
        boolean boolean48 = dateTime46.isSupported(dateTimeFieldType47);
        java.lang.Object obj49 = null;
        org.joda.time.Instant instant50 = new org.joda.time.Instant(obj49);
        org.joda.time.DateTimeZone dateTimeZone51 = instant50.getZone();
        java.lang.String str52 = dateTimeZone51.toString();
        long long54 = dateTimeZone51.nextTransition((long) (short) 100);
        org.joda.time.DateTime dateTime55 = dateTime46.toDateTime(dateTimeZone51);
        org.joda.time.Chronology chronology56 = null;
        org.joda.time.DateTime dateTime57 = new org.joda.time.DateTime(chronology56);
        org.joda.time.DateTime.Property property58 = dateTime57.yearOfEra();
        org.joda.time.DateTime.Property property59 = dateTime57.weekOfWeekyear();
        org.joda.time.Chronology chronology60 = dateTime57.getChronology();
        org.joda.time.MutablePeriod mutablePeriod61 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime46, (org.joda.time.ReadableInstant) dateTime57);
        org.joda.time.Chronology chronology63 = null;
        org.joda.time.Period period64 = new org.joda.time.Period((long) (short) 10, chronology63);
        org.joda.time.Period period66 = period64.minusYears((int) (byte) 100);
        org.joda.time.Duration duration69 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.Seconds seconds70 = duration69.toStandardSeconds();
        org.joda.time.Instant instant72 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.Instant instant74 = instant72.minus(100L);
        org.joda.time.MutableDateTime mutableDateTime75 = instant72.toMutableDateTimeISO();
        org.joda.time.Period period76 = duration69.toPeriodTo((org.joda.time.ReadableInstant) instant72);
        org.joda.time.Duration duration77 = period76.toStandardDuration();
        org.joda.time.Period period78 = period66.plus((org.joda.time.ReadablePeriod) period76);
        boolean boolean79 = dateTime57.equals((java.lang.Object) period78);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant11 and dateTime12", (instant11.compareTo(dateTime12) == 0) == instant11.equals(dateTime12));
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2506");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime.Property property2 = dateTime1.yearOfEra();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.DateTime dateTime4 = interval3.getStart();
        org.joda.time.DateTime dateTime5 = dateTime4.toDateTimeISO();
        org.joda.time.DateTime dateTime7 = dateTime5.withYear(97);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(chronology8);
        org.joda.time.DateTime.Property property10 = dateTime9.yearOfEra();
        org.joda.time.Interval interval11 = property10.toInterval();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = property10.getFieldType();
        boolean boolean13 = property10.isLeap();
        org.joda.time.DateTime dateTime14 = property10.withMinimumValue();
        org.joda.time.DateTime.Property property15 = dateTime14.yearOfCentury();
        org.joda.time.DateTime dateTime17 = dateTime14.withSecondOfMinute(10);
        org.joda.time.DateTime dateTime19 = dateTime17.withCenturyOfEra((int) (short) 0);
        org.joda.time.Instant instant21 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime22 = instant21.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateTime dateTime24 = dateTime22.withZone(dateTimeZone23);
        org.joda.time.Instant instant26 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime27 = instant26.toDateTime();
        org.joda.time.DateTime.Property property28 = dateTime27.era();
        org.joda.time.DateTime dateTime29 = dateTime27.withTimeAtStartOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        boolean boolean31 = dateTime27.isSupported(dateTimeFieldType30);
        org.joda.time.DateTime.Property property32 = dateTime22.property(dateTimeFieldType30);
        org.joda.time.DateTime.Property property33 = dateTime22.dayOfMonth();
        java.lang.String str34 = property33.getName();
        org.joda.time.DateTimeFieldType dateTimeFieldType35 = property33.getFieldType();
        boolean boolean36 = dateTime19.isSupported(dateTimeFieldType35);
        org.joda.time.DateTime.Property property37 = dateTime7.property(dateTimeFieldType35);
        java.lang.Object obj38 = null;
        org.joda.time.Instant instant39 = new org.joda.time.Instant(obj38);
        org.joda.time.DateTimeZone dateTimeZone40 = instant39.getZone();
        java.lang.String str41 = dateTimeZone40.toString();
        java.lang.String str43 = dateTimeZone40.getName((long) 10);
        long long46 = dateTimeZone40.convertLocalToUTC((long) (byte) -1, true);
        org.joda.time.MutableDateTime mutableDateTime47 = dateTime7.toMutableDateTime(dateTimeZone40);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant39", (dateTime1.compareTo(instant39) == 0) == dateTime1.equals(instant39));
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2507");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime.Property property2 = dateTime1.yearOfEra();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(chronology4);
        org.joda.time.DateTime.Property property6 = dateTime5.yearOfEra();
        org.joda.time.Interval interval7 = property6.toInterval();
        boolean boolean8 = interval3.contains((org.joda.time.ReadableInterval) interval7);
        java.lang.Object obj9 = null;
        org.joda.time.Instant instant10 = new org.joda.time.Instant(obj9);
        org.joda.time.DateTimeZone dateTimeZone11 = instant10.getZone();
        java.lang.String str12 = dateTimeZone11.toString();
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(dateTimeZone11);
        boolean boolean14 = interval3.contains((org.joda.time.ReadableInstant) dateTime13);
        org.joda.time.Instant instant16 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime17 = instant16.toDateTime();
        org.joda.time.DateTime.Property property18 = dateTime17.era();
        boolean boolean19 = interval3.contains((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.Period period20 = interval3.toPeriod();
        org.joda.time.PeriodType periodType23 = org.joda.time.PeriodType.yearDay();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutablePeriod mutablePeriod25 = new org.joda.time.MutablePeriod((long) 100, 0L, periodType23, chronology24);
        org.joda.time.PeriodType periodType26 = periodType23.withWeeksRemoved();
        org.joda.time.PeriodType periodType27 = periodType26.withSecondsRemoved();
        org.joda.time.PeriodType periodType28 = periodType27.withWeeksRemoved();
        org.joda.time.Period period29 = interval3.toPeriod(periodType27);
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime(chronology30);
        org.joda.time.DateTime.Property property32 = dateTime31.yearOfEra();
        org.joda.time.Interval interval33 = property32.toInterval();
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime(chronology34);
        org.joda.time.DateTime.Property property36 = dateTime35.yearOfEra();
        org.joda.time.Interval interval37 = property36.toInterval();
        boolean boolean38 = interval33.contains((org.joda.time.ReadableInterval) interval37);
        java.lang.Object obj39 = null;
        org.joda.time.Instant instant40 = new org.joda.time.Instant(obj39);
        org.joda.time.DateTimeZone dateTimeZone41 = instant40.getZone();
        java.lang.String str42 = dateTimeZone41.toString();
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime(dateTimeZone41);
        boolean boolean44 = interval33.contains((org.joda.time.ReadableInstant) dateTime43);
        org.joda.time.Instant instant46 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime47 = instant46.toDateTime();
        org.joda.time.DateTime.Property property48 = dateTime47.era();
        boolean boolean49 = interval33.contains((org.joda.time.ReadableInstant) dateTime47);
        org.joda.time.Seconds seconds50 = org.joda.time.Seconds.secondsIn((org.joda.time.ReadableInterval) interval33);
        org.joda.time.Period period51 = interval33.toPeriod();
        boolean boolean52 = interval3.isBefore((org.joda.time.ReadableInterval) interval33);
        long long53 = interval33.getStartMillis();
        org.joda.time.MutableInterval mutableInterval54 = interval33.toMutableInterval();
        org.joda.time.Instant instant56 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime57 = instant56.toDateTime();
        org.joda.time.DateTime.Property property58 = dateTime57.era();
        org.joda.time.DateTime dateTime59 = dateTime57.withTimeAtStartOfDay();
        org.joda.time.Duration duration62 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant63 = null;
        org.joda.time.PeriodType periodType64 = null;
        org.joda.time.MutablePeriod mutablePeriod65 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration62, readableInstant63, periodType64);
        mutablePeriod65.setMonths((int) '4');
        org.joda.time.DateTime dateTime68 = dateTime57.plus((org.joda.time.ReadablePeriod) mutablePeriod65);
        org.joda.time.LocalDate localDate69 = dateTime57.toLocalDate();
        org.joda.time.Instant instant71 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime72 = instant71.toDateTime();
        org.joda.time.DateTime.Property property73 = dateTime72.era();
        org.joda.time.DateTime dateTime74 = dateTime72.withTimeAtStartOfDay();
        org.joda.time.Instant instant75 = dateTime72.toInstant();
        org.joda.time.Seconds seconds76 = org.joda.time.Seconds.secondsBetween((org.joda.time.ReadableInstant) dateTime57, (org.joda.time.ReadableInstant) instant75);
        org.joda.time.Instant instant78 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime79 = instant78.toDateTime();
        org.joda.time.DateTime.Property property80 = dateTime79.era();
        org.joda.time.DateTime dateTime81 = property80.withMinimumValue();
        int int82 = property80.getMaximumValueOverall();
        java.util.Locale locale83 = java.util.Locale.ENGLISH;
        java.lang.String str84 = locale83.getScript();
        java.lang.String str85 = locale83.getDisplayCountry();
        int int86 = property80.getMaximumShortTextLength(locale83);
        org.joda.time.DateTime dateTime87 = property80.withMaximumValue();
        org.joda.time.PeriodType periodType88 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType89 = periodType88.withMinutesRemoved();
        org.joda.time.MutablePeriod mutablePeriod90 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime57, (org.joda.time.ReadableInstant) dateTime87, periodType88);
        org.joda.time.DateTime dateTime92 = dateTime87.plusWeeks((-2147483648));
        org.joda.time.DateTime.Property property93 = dateTime92.dayOfWeek();
        org.joda.time.DateTime.Property property94 = dateTime92.millisOfSecond();
        org.joda.time.DateTime dateTime96 = dateTime92.minusMillis(26174957);
        boolean boolean97 = mutableInterval54.isBefore((org.joda.time.ReadableInstant) dateTime92);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant10", (dateTime1.compareTo(instant10) == 0) == dateTime1.equals(instant10));
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2508");
        org.joda.time.Period period1 = org.joda.time.Period.seconds((-1));
        org.joda.time.Period period3 = period1.minusMonths((int) (short) 10);
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.Duration duration5 = period3.toDurationTo(readableInstant4);
        org.joda.time.Instant instant7 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime8 = instant7.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = dateTime8.withZoneRetainFields(dateTimeZone9);
        org.joda.time.DateTime.Property property11 = dateTime10.weekOfWeekyear();
        org.joda.time.Duration duration14 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.PeriodType periodType16 = null;
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration14, readableInstant15, periodType16);
        org.joda.time.DateTime dateTime18 = dateTime10.plus((org.joda.time.ReadableDuration) duration14);
        boolean boolean19 = duration5.isShorterThan((org.joda.time.ReadableDuration) duration14);
        org.joda.time.Duration duration22 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.PeriodType periodType24 = null;
        org.joda.time.MutablePeriod mutablePeriod25 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration22, readableInstant23, periodType24);
        long long26 = duration22.getStandardSeconds();
        org.joda.time.Duration duration28 = duration14.withDurationAdded((org.joda.time.ReadableDuration) duration22, 10);
        org.joda.time.Hours hours29 = duration14.toStandardHours();
        org.joda.time.Duration duration30 = duration14.toDuration();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant7 and dateTime8", (instant7.compareTo(dateTime8) == 0) == instant7.equals(dateTime8));
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2509");
        org.joda.time.Duration duration3 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration3, readableInstant4, periodType5);
        org.joda.time.Days days7 = org.joda.time.Days.THREE;
        org.joda.time.DurationFieldType durationFieldType8 = org.joda.time.DurationFieldType.minutes();
        int int9 = days7.get(durationFieldType8);
        mutablePeriod6.add(durationFieldType8, 8);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        mutablePeriod6.add(readablePeriod12);
        int int14 = mutablePeriod6.getMonths();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(chronology15);
        org.joda.time.DateTime.Property property17 = dateTime16.yearOfEra();
        org.joda.time.Interval interval18 = property17.toInterval();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime(chronology19);
        org.joda.time.DateTime.Property property21 = dateTime20.yearOfEra();
        org.joda.time.Interval interval22 = property21.toInterval();
        boolean boolean23 = interval18.contains((org.joda.time.ReadableInterval) interval22);
        mutablePeriod6.setPeriod((org.joda.time.ReadableInterval) interval18);
        org.joda.time.DurationFieldType durationFieldType26 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.Instant instant28 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime29 = instant28.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.DateTime dateTime31 = dateTime29.withZoneRetainFields(dateTimeZone30);
        org.joda.time.Instant instant33 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime34 = instant33.toDateTime();
        org.joda.time.DateTime.Property property35 = dateTime34.era();
        org.joda.time.DateTime dateTime36 = dateTime34.withTimeAtStartOfDay();
        org.joda.time.Duration duration39 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.PeriodType periodType41 = null;
        org.joda.time.MutablePeriod mutablePeriod42 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration39, readableInstant40, periodType41);
        mutablePeriod42.setMonths((int) '4');
        org.joda.time.DateTime dateTime45 = dateTime34.plus((org.joda.time.ReadablePeriod) mutablePeriod42);
        org.joda.time.DateTime dateTime47 = dateTime34.minusWeeks((int) (byte) 1);
        int int48 = dateTime31.compareTo((org.joda.time.ReadableInstant) dateTime34);
        org.joda.time.DateTime.Property property49 = dateTime34.minuteOfHour();
        org.joda.time.DateTime dateTime51 = dateTime34.withYear(1969);
        org.joda.time.Chronology chronology52 = dateTime51.getChronology();
        org.joda.time.DurationField durationField53 = durationFieldType26.getField(chronology52);
        mutablePeriod6.add((-43199999L), chronology52);
        org.joda.time.DurationField durationField55 = chronology52.millis();
        org.joda.time.DurationField durationField56 = chronology52.months();
        org.joda.time.DateTime dateTime57 = new org.joda.time.DateTime((long) 69, chronology52);
        org.joda.time.DateTimeField dateTimeField58 = chronology52.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField59 = chronology52.clockhourOfDay();
        org.joda.time.DurationField durationField60 = chronology52.halfdays();
        org.joda.time.Chronology chronology61 = chronology52.withUTC();
        org.joda.time.DurationField durationField62 = chronology52.days();
        org.joda.time.DateTimeZone dateTimeZone63 = chronology52.getZone();
        java.util.TimeZone timeZone64 = dateTimeZone63.toTimeZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant28 and dateTime29", (instant28.compareTo(dateTime29) == 0) == instant28.equals(dateTime29));
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2510");
        org.joda.time.PeriodType periodType4 = org.joda.time.PeriodType.yearDay();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod((long) 100, 0L, periodType4, chronology5);
        org.joda.time.PeriodType periodType7 = periodType4.withWeeksRemoved();
        org.joda.time.PeriodType periodType8 = periodType7.withSecondsRemoved();
        org.joda.time.PeriodType periodType9 = periodType8.withWeeksRemoved();
        org.joda.time.Instant instant11 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime12 = instant11.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = dateTime12.withZoneRetainFields(dateTimeZone13);
        org.joda.time.Instant instant16 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime17 = instant16.toDateTime();
        org.joda.time.DateTime.Property property18 = dateTime17.era();
        org.joda.time.DateTime dateTime19 = dateTime17.withTimeAtStartOfDay();
        org.joda.time.Duration duration22 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.PeriodType periodType24 = null;
        org.joda.time.MutablePeriod mutablePeriod25 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration22, readableInstant23, periodType24);
        mutablePeriod25.setMonths((int) '4');
        org.joda.time.DateTime dateTime28 = dateTime17.plus((org.joda.time.ReadablePeriod) mutablePeriod25);
        org.joda.time.DateTime dateTime30 = dateTime17.minusWeeks((int) (byte) 1);
        int int31 = dateTime14.compareTo((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.DateTime.Property property32 = dateTime17.minuteOfHour();
        org.joda.time.DateTime dateTime34 = dateTime17.withYear(1969);
        org.joda.time.Chronology chronology35 = dateTime34.getChronology();
        org.joda.time.DateTimeField dateTimeField36 = chronology35.year();
        org.joda.time.DateTimeField dateTimeField37 = chronology35.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField38 = chronology35.year();
        org.joda.time.Period period39 = new org.joda.time.Period((long) (byte) 100, (long) 'a', periodType9, chronology35);
        int int40 = period39.getHours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant11 and dateTime12", (instant11.compareTo(dateTime12) == 0) == instant11.equals(dateTime12));
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2511");
        org.joda.time.Duration duration2 = new org.joda.time.Duration((long) ' ', (long) ' ');
        org.joda.time.Period period3 = duration2.toPeriod();
        org.joda.time.Duration duration5 = duration2.plus((long) (byte) 0);
        org.joda.time.Instant instant7 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime8 = instant7.toDateTime();
        boolean boolean10 = dateTime8.isEqual(10L);
        org.joda.time.PeriodType periodType13 = org.joda.time.PeriodType.yearDay();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((long) 100, 0L, periodType13, chronology14);
        org.joda.time.PeriodType periodType16 = periodType13.withWeeksRemoved();
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration5, (org.joda.time.ReadableInstant) dateTime8, periodType16);
        org.joda.time.Instant instant19 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime20 = instant19.toDateTime();
        org.joda.time.DateTime.Property property21 = dateTime20.era();
        org.joda.time.DateTime dateTime22 = dateTime20.withTimeAtStartOfDay();
        org.joda.time.Instant instant23 = dateTime20.toInstant();
        org.joda.time.DateTime dateTime25 = dateTime20.withMillis((long) '4');
        org.joda.time.Minutes minutes26 = org.joda.time.Minutes.minutesBetween((org.joda.time.ReadableInstant) dateTime8, (org.joda.time.ReadableInstant) dateTime20);
        int int27 = dateTime20.getYear();
        org.joda.time.DateTime.Property property28 = dateTime20.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.DateTime dateTime30 = dateTime20.toDateTime(dateTimeZone29);
        org.joda.time.DateTimeZone dateTimeZone31 = dateTime20.getZone();
        long long33 = dateTimeZone31.nextTransition((long) (short) -1);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant7 and dateTime8", (instant7.compareTo(dateTime8) == 0) == instant7.equals(dateTime8));
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2512");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period((long) (short) 10, periodType1);
        org.joda.time.Instant instant4 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.Instant instant5 = instant4.toInstant();
        org.joda.time.DateTime dateTime6 = instant5.toDateTimeISO();
        org.joda.time.Duration duration7 = period2.toDurationFrom((org.joda.time.ReadableInstant) dateTime6);
        int int8 = dateTime6.getWeekyear();
        org.joda.time.Instant instant10 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime11 = instant10.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = dateTime11.withZoneRetainFields(dateTimeZone12);
        org.joda.time.Instant instant15 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime16 = instant15.toDateTime();
        org.joda.time.DateTime.Property property17 = dateTime16.era();
        org.joda.time.DateTime dateTime18 = dateTime16.withTimeAtStartOfDay();
        org.joda.time.Duration duration21 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.PeriodType periodType23 = null;
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration21, readableInstant22, periodType23);
        mutablePeriod24.setMonths((int) '4');
        org.joda.time.DateTime dateTime27 = dateTime16.plus((org.joda.time.ReadablePeriod) mutablePeriod24);
        org.joda.time.DateTime dateTime29 = dateTime16.minusWeeks((int) (byte) 1);
        int int30 = dateTime13.compareTo((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateTime.Property property31 = dateTime16.minuteOfHour();
        org.joda.time.DateTime.Property property32 = dateTime16.weekyear();
        org.joda.time.Instant instant34 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime35 = instant34.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.DateTime dateTime37 = dateTime35.withZone(dateTimeZone36);
        org.joda.time.Instant instant39 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime40 = instant39.toDateTime();
        org.joda.time.DateTime.Property property41 = dateTime40.era();
        org.joda.time.DateTime dateTime42 = dateTime40.withTimeAtStartOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType43 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        boolean boolean44 = dateTime40.isSupported(dateTimeFieldType43);
        org.joda.time.DateTime.Property property45 = dateTime35.property(dateTimeFieldType43);
        org.joda.time.DateTime dateTime46 = dateTime35.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime48 = dateTime46.minusSeconds((int) '#');
        org.joda.time.DateTime dateTime50 = dateTime48.minusYears(11);
        org.joda.time.DateTime dateTime52 = dateTime50.withWeekyear((-52));
        boolean boolean53 = dateTime16.isEqual((org.joda.time.ReadableInstant) dateTime52);
        int int54 = dateTime6.compareTo((org.joda.time.ReadableInstant) dateTime16);
        boolean boolean56 = dateTime6.isAfter((long) (-10));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant4 and dateTime11", (instant4.compareTo(dateTime11) == 0) == instant4.equals(dateTime11));
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2513");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime2 = instant1.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.withZoneRetainFields(dateTimeZone3);
        org.joda.time.DateTime.Property property5 = dateTime4.centuryOfEra();
        boolean boolean7 = property5.equals((java.lang.Object) "1969-12-31T23:59:59.899Z");
        java.util.Locale locale8 = java.util.Locale.KOREA;
        int int9 = property5.getMaximumTextLength(locale8);
        org.joda.time.DateTime dateTime10 = property5.roundHalfEvenCopy();
        org.joda.time.DateTime dateTime12 = dateTime10.plusDays(11);
        org.joda.time.DateTime.Property property13 = dateTime12.hourOfDay();
        java.lang.Object obj14 = null;
        org.joda.time.Instant instant15 = new org.joda.time.Instant(obj14);
        org.joda.time.DateTimeZone dateTimeZone16 = instant15.getZone();
        java.lang.String str17 = dateTimeZone16.toString();
        int int19 = dateTimeZone16.getOffset(1L);
        boolean boolean21 = dateTimeZone16.isStandardOffset(0L);
        java.lang.String str23 = dateTimeZone16.getNameKey((long) 1);
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime(dateTimeZone16);
        boolean boolean25 = dateTimeZone16.isFixed();
        org.joda.time.DateTime dateTime26 = dateTime12.withZoneRetainFields(dateTimeZone16);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime2", (instant1.compareTo(dateTime2) == 0) == instant1.equals(dateTime2));
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2514");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime2 = instant1.toDateTime();
        org.joda.time.DateTime.Property property3 = dateTime2.era();
        org.joda.time.DateTime dateTime4 = dateTime2.withTimeAtStartOfDay();
        org.joda.time.Duration duration7 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.PeriodType periodType9 = null;
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration7, readableInstant8, periodType9);
        mutablePeriod10.setMonths((int) '4');
        org.joda.time.DateTime dateTime13 = dateTime2.plus((org.joda.time.ReadablePeriod) mutablePeriod10);
        org.joda.time.DateTime dateTime15 = dateTime2.minusWeeks((int) (byte) 1);
        org.joda.time.DateTime.Property property16 = dateTime15.monthOfYear();
        org.joda.time.DateTime.Property property17 = dateTime15.weekyear();
        java.lang.Object obj18 = null;
        org.joda.time.Instant instant19 = new org.joda.time.Instant(obj18);
        org.joda.time.DateTimeZone dateTimeZone20 = instant19.getZone();
        java.lang.String str21 = dateTimeZone20.toString();
        java.lang.String str23 = dateTimeZone20.getName((long) 10);
        java.lang.String str25 = dateTimeZone20.getName((long) 8);
        int int27 = dateTimeZone20.getOffsetFromLocal((long) (short) -1);
        org.joda.time.DateTime dateTime28 = dateTime15.withZone(dateTimeZone20);
        org.joda.time.PeriodType periodType29 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType30 = periodType29.withMonthsRemoved();
        java.lang.String str31 = periodType30.getName();
        org.joda.time.Instant instant33 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime34 = instant33.toDateTime();
        org.joda.time.DateTime.Property property35 = dateTime34.era();
        org.joda.time.DateTime dateTime36 = dateTime34.withTimeAtStartOfDay();
        org.joda.time.Instant instant37 = dateTime34.toInstant();
        boolean boolean38 = periodType30.equals((java.lang.Object) dateTime34);
        org.joda.time.DateTime.Property property39 = dateTime34.millisOfSecond();
        boolean boolean40 = dateTime28.isAfter((org.joda.time.ReadableInstant) dateTime34);
        org.joda.time.Instant instant42 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.Instant instant44 = instant42.minus(100L);
        org.joda.time.Instant instant46 = instant44.plus((long) 100);
        org.joda.time.Instant instant48 = instant44.withMillis((long) (byte) 1);
        org.joda.time.Instant instant51 = instant44.withDurationAdded((long) '4', (int) 'a');
        org.joda.time.Duration duration54 = new org.joda.time.Duration((long) ' ', (long) ' ');
        org.joda.time.Period period55 = duration54.toPeriod();
        org.joda.time.Duration duration57 = duration54.plus((long) (byte) 0);
        org.joda.time.ReadableInstant readableInstant58 = null;
        org.joda.time.Period period59 = duration54.toPeriodTo(readableInstant58);
        org.joda.time.Duration duration61 = duration54.withMillis((long) (short) 0);
        org.joda.time.Duration duration64 = duration54.withDurationAdded((long) 1, (int) ' ');
        org.joda.time.Instant instant66 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime67 = instant66.toDateTime();
        boolean boolean69 = dateTime67.isEqual(10L);
        org.joda.time.PeriodType periodType70 = org.joda.time.PeriodType.minutes();
        org.joda.time.Period period71 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration64, (org.joda.time.ReadableInstant) dateTime67, periodType70);
        java.lang.Object obj72 = null;
        org.joda.time.Instant instant73 = new org.joda.time.Instant(obj72);
        org.joda.time.DateTimeZone dateTimeZone74 = instant73.getZone();
        org.joda.time.DateTime dateTime75 = dateTime67.toDateTime(dateTimeZone74);
        org.joda.time.Seconds seconds76 = org.joda.time.Seconds.secondsBetween((org.joda.time.ReadableInstant) instant51, (org.joda.time.ReadableInstant) dateTime75);
        java.lang.Object obj77 = null;
        org.joda.time.Instant instant78 = new org.joda.time.Instant(obj77);
        org.joda.time.DateTimeZone dateTimeZone79 = instant78.getZone();
        java.lang.String str80 = dateTimeZone79.toString();
        org.joda.time.DateTime dateTime81 = new org.joda.time.DateTime(dateTimeZone79);
        boolean boolean82 = instant51.isBefore((org.joda.time.ReadableInstant) dateTime81);
        org.joda.time.DateTime dateTime84 = dateTime81.plusMinutes(720);
        boolean boolean85 = dateTime28.equals((java.lang.Object) 720);
        org.joda.time.DateTime dateTime87 = dateTime28.withMillisOfDay(362);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime2", (instant1.compareTo(dateTime2) == 0) == instant1.equals(dateTime2));
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2515");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime2 = instant1.toDateTime();
        org.joda.time.DateTime.Property property3 = dateTime2.era();
        org.joda.time.DateTime dateTime4 = dateTime2.withTimeAtStartOfDay();
        org.joda.time.Instant instant5 = dateTime2.toInstant();
        org.joda.time.TimeOfDay timeOfDay6 = dateTime2.toTimeOfDay();
        org.joda.time.DateTime.Property property7 = dateTime2.millisOfSecond();
        org.joda.time.DateTime dateTime8 = property7.withMinimumValue();
        boolean boolean9 = dateTime8.isAfterNow();
        org.joda.time.DateTime.Property property10 = dateTime8.era();
        org.joda.time.DateTime dateTime11 = property10.roundFloorCopy();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime2", (instant1.compareTo(dateTime2) == 0) == instant1.equals(dateTime2));
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2516");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField(chronology1);
        long long5 = dateTimeField2.add(0L, (long) (short) 1);
        long long8 = dateTimeField2.getDifferenceAsLong((long) ' ', (long) 1969);
        java.util.Locale locale9 = java.util.Locale.JAPAN;
        java.lang.String str10 = locale9.getVariant();
        int int11 = dateTimeField2.getMaximumShortTextLength(locale9);
        org.joda.time.DurationField durationField12 = dateTimeField2.getLeapDurationField();
        java.lang.String str14 = dateTimeField2.getAsShortText((long) 7);
        org.joda.time.DurationField durationField15 = dateTimeField2.getDurationField();
        long long18 = durationField15.add((long) 1970, (-19656120000L));
        int int21 = durationField15.getValue(0L, 1645514012L);
        org.joda.time.DurationFieldType durationFieldType22 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.Instant instant24 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime25 = instant24.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.DateTime dateTime27 = dateTime25.withZoneRetainFields(dateTimeZone26);
        org.joda.time.Instant instant29 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime30 = instant29.toDateTime();
        org.joda.time.DateTime.Property property31 = dateTime30.era();
        org.joda.time.DateTime dateTime32 = dateTime30.withTimeAtStartOfDay();
        org.joda.time.Duration duration35 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.PeriodType periodType37 = null;
        org.joda.time.MutablePeriod mutablePeriod38 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration35, readableInstant36, periodType37);
        mutablePeriod38.setMonths((int) '4');
        org.joda.time.DateTime dateTime41 = dateTime30.plus((org.joda.time.ReadablePeriod) mutablePeriod38);
        org.joda.time.DateTime dateTime43 = dateTime30.minusWeeks((int) (byte) 1);
        int int44 = dateTime27.compareTo((org.joda.time.ReadableInstant) dateTime30);
        org.joda.time.DateTime.Property property45 = dateTime30.minuteOfHour();
        org.joda.time.DateTime dateTime47 = dateTime30.withYear(1969);
        org.joda.time.Chronology chronology48 = dateTime47.getChronology();
        org.joda.time.DurationField durationField49 = durationFieldType22.getField(chronology48);
        java.lang.String str50 = durationField49.toString();
        long long53 = durationField49.add(0L, 27882730L);
        int int54 = durationField15.compareTo(durationField49);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant24 and dateTime25", (instant24.compareTo(dateTime25) == 0) == instant24.equals(dateTime25));
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2517");
        org.joda.time.PeriodType periodType3 = org.joda.time.PeriodType.millis();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(chronology4);
        org.joda.time.Instant instant7 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime8 = instant7.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = dateTime8.withZoneRetainFields(dateTimeZone9);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime13 = instant12.toDateTime();
        org.joda.time.DateTime.Property property14 = dateTime13.era();
        org.joda.time.DateTime dateTime15 = dateTime13.withTimeAtStartOfDay();
        org.joda.time.Duration duration18 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.PeriodType periodType20 = null;
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration18, readableInstant19, periodType20);
        mutablePeriod21.setMonths((int) '4');
        org.joda.time.DateTime dateTime24 = dateTime13.plus((org.joda.time.ReadablePeriod) mutablePeriod21);
        org.joda.time.DateTime dateTime26 = dateTime13.minusWeeks((int) (byte) 1);
        int int27 = dateTime10.compareTo((org.joda.time.ReadableInstant) dateTime13);
        org.joda.time.DateTime.Property property28 = dateTime13.minuteOfHour();
        org.joda.time.DateTime dateTime30 = dateTime13.withYear(1969);
        org.joda.time.Chronology chronology31 = dateTime30.getChronology();
        org.joda.time.DateTimeField dateTimeField32 = chronology31.dayOfMonth();
        org.joda.time.DurationField durationField33 = chronology31.minutes();
        org.joda.time.DateTime dateTime34 = dateTime5.toDateTime(chronology31);
        org.joda.time.DateTimeField dateTimeField35 = chronology31.hourOfHalfday();
        org.joda.time.Period period36 = new org.joda.time.Period(1L, periodType3, chronology31);
        long long40 = chronology31.add((long) (byte) 100, (long) 6, 59);
        org.joda.time.DateTimeField dateTimeField41 = chronology31.weekyearOfCentury();
        org.joda.time.Chronology chronology42 = chronology31.withUTC();
        org.joda.time.Period period43 = new org.joda.time.Period(201L, 1124645990400000L, chronology42);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant7 and dateTime8", (instant7.compareTo(dateTime8) == 0) == instant7.equals(dateTime8));
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2518");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime2 = instant1.toDateTime();
        org.joda.time.DateTime.Property property3 = dateTime2.era();
        org.joda.time.DateTime dateTime4 = dateTime2.withTimeAtStartOfDay();
        org.joda.time.DateTime.Property property5 = dateTime2.minuteOfHour();
        org.joda.time.DateTime dateTime7 = dateTime2.minusMonths((int) 'x');
        org.joda.time.DateTime.Property property8 = dateTime2.secondOfDay();
        org.joda.time.DateTime.Property property9 = dateTime2.dayOfMonth();
        org.joda.time.Instant instant11 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime12 = instant11.toDateTime();
        boolean boolean14 = dateTime12.isEqual(10L);
        org.joda.time.DateTime dateTime16 = dateTime12.withWeekOfWeekyear(8);
        org.joda.time.DateTime dateTime18 = dateTime12.plusDays(100);
        org.joda.time.LocalTime localTime19 = dateTime12.toLocalTime();
        org.joda.time.DateTime dateTime21 = dateTime12.withYearOfEra(1);
        org.joda.time.DateTime dateTime22 = dateTime12.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime23 = dateTime22.withEarlierOffsetAtOverlap();
        int int24 = property9.compareTo((org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.Instant instant26 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime27 = instant26.toDateTime();
        org.joda.time.DateTime.Property property28 = dateTime27.era();
        org.joda.time.DateTime dateTime29 = property28.withMinimumValue();
        int int30 = property28.getMaximumValueOverall();
        java.util.Locale locale31 = java.util.Locale.ENGLISH;
        java.lang.String str32 = locale31.getScript();
        java.lang.String str33 = locale31.getDisplayCountry();
        int int34 = property28.getMaximumShortTextLength(locale31);
        org.joda.time.DateTime dateTime35 = property28.withMaximumValue();
        org.joda.time.Instant instant37 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime38 = instant37.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.DateTime dateTime40 = dateTime38.withZoneRetainFields(dateTimeZone39);
        org.joda.time.DateTime.Property property41 = dateTime40.weekOfWeekyear();
        org.joda.time.Duration duration44 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.PeriodType periodType46 = null;
        org.joda.time.MutablePeriod mutablePeriod47 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration44, readableInstant45, periodType46);
        org.joda.time.DateTime dateTime48 = dateTime40.plus((org.joda.time.ReadableDuration) duration44);
        org.joda.time.DateTime dateTime50 = dateTime40.withYearOfEra(9);
        org.joda.time.Weeks weeks51 = org.joda.time.Weeks.weeksBetween((org.joda.time.ReadableInstant) dateTime35, (org.joda.time.ReadableInstant) dateTime50);
        org.joda.time.DateTime dateTime53 = dateTime50.minusSeconds(1969);
        java.lang.Object obj54 = null;
        boolean boolean55 = dateTime50.equals(obj54);
        org.joda.time.DateTime dateTime57 = dateTime50.plusMonths(1970);
        int int58 = property9.getDifference((org.joda.time.ReadableInstant) dateTime50);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime2", (instant1.compareTo(dateTime2) == 0) == instant1.equals(dateTime2));
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2519");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.Instant instant3 = instant1.minus(100L);
        org.joda.time.MutableDateTime mutableDateTime4 = instant1.toMutableDateTimeISO();
        java.lang.Object obj5 = null;
        org.joda.time.Instant instant6 = new org.joda.time.Instant(obj5);
        boolean boolean7 = mutableDateTime4.isAfter((org.joda.time.ReadableInstant) instant6);
        org.joda.time.Instant instant9 = instant6.withMillis((long) 8);
        org.joda.time.Duration duration12 = new org.joda.time.Duration((long) ' ', (long) ' ');
        org.joda.time.Period period13 = duration12.toPeriod();
        org.joda.time.Duration duration15 = duration12.plus((long) (byte) 0);
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.Period period17 = duration12.toPeriodTo(readableInstant16);
        org.joda.time.Duration duration20 = duration12.withDurationAdded((long) (short) -1, (int) (byte) 100);
        org.joda.time.Seconds seconds21 = duration20.toStandardSeconds();
        org.joda.time.PeriodType periodType25 = org.joda.time.PeriodType.yearDay();
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod((long) 100, 0L, periodType25, chronology26);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod((long) (short) 0, periodType25, chronology28);
        org.joda.time.DurationFieldType durationFieldType30 = org.joda.time.DurationFieldType.minutes();
        int int31 = periodType25.indexOf(durationFieldType30);
        org.joda.time.Period period32 = duration20.toPeriod(periodType25);
        org.joda.time.Period period33 = new org.joda.time.Period((org.joda.time.ReadableInstant) instant9, (org.joda.time.ReadableDuration) duration20);
        java.lang.String str34 = duration20.toString();
        org.joda.time.Duration duration35 = duration20.toDuration();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and mutableDateTime4", (instant1.compareTo(mutableDateTime4) == 0) == instant1.equals(mutableDateTime4));
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2520");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime2 = instant1.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.withZoneRetainFields(dateTimeZone3);
        org.joda.time.Instant instant6 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime7 = instant6.toDateTime();
        org.joda.time.DateTime.Property property8 = dateTime7.era();
        org.joda.time.DateTime dateTime9 = dateTime7.withTimeAtStartOfDay();
        org.joda.time.Duration duration12 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.PeriodType periodType14 = null;
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration12, readableInstant13, periodType14);
        mutablePeriod15.setMonths((int) '4');
        org.joda.time.DateTime dateTime18 = dateTime7.plus((org.joda.time.ReadablePeriod) mutablePeriod15);
        org.joda.time.DateTime dateTime20 = dateTime7.minusWeeks((int) (byte) 1);
        int int21 = dateTime4.compareTo((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTime.Property property22 = dateTime7.minuteOfHour();
        org.joda.time.DateTime dateTime24 = dateTime7.withYear(1969);
        org.joda.time.Chronology chronology25 = dateTime24.getChronology();
        org.joda.time.DateTime.Property property26 = dateTime24.dayOfMonth();
        org.joda.time.DurationField durationField27 = property26.getRangeDurationField();
        org.joda.time.DateTime dateTime28 = property26.getDateTime();
        boolean boolean29 = dateTime28.isAfterNow();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime2", (instant1.compareTo(dateTime2) == 0) == instant1.equals(dateTime2));
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2521");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime2 = instant1.toDateTime();
        org.joda.time.Duration duration5 = new org.joda.time.Duration((long) ' ', (long) ' ');
        org.joda.time.Period period6 = duration5.toPeriod();
        org.joda.time.Duration duration8 = duration5.plus((long) (byte) 0);
        org.joda.time.Minutes minutes9 = duration5.toStandardMinutes();
        org.joda.time.PeriodType periodType10 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType11 = periodType10.withMinutesRemoved();
        org.joda.time.Period period12 = new org.joda.time.Period((org.joda.time.ReadableInstant) instant1, (org.joda.time.ReadableDuration) duration5, periodType10);
        org.joda.time.Instant instant14 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.Instant instant16 = instant14.minus(100L);
        org.joda.time.Instant instant18 = instant16.plus((long) 100);
        boolean boolean19 = instant16.isBeforeNow();
        org.joda.time.DateTime dateTime20 = instant16.toDateTimeISO();
        org.joda.time.Instant instant22 = instant16.minus(0L);
        org.joda.time.Duration duration23 = period12.toDurationTo((org.joda.time.ReadableInstant) instant22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime2", (instant1.compareTo(dateTime2) == 0) == instant1.equals(dateTime2));
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2522");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod(0, (int) 'a', 1, 100, (int) (byte) 10, 0, (int) (short) -1, (int) (byte) -1);
        int int9 = mutablePeriod8.getDays();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(chronology12);
        org.joda.time.DateTime.Property property14 = dateTime13.yearOfEra();
        org.joda.time.Interval interval15 = property14.toInterval();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime(chronology16);
        org.joda.time.DateTime.Property property18 = dateTime17.yearOfEra();
        org.joda.time.Interval interval19 = property18.toInterval();
        boolean boolean20 = interval15.contains((org.joda.time.ReadableInterval) interval19);
        org.joda.time.Chronology chronology21 = interval19.getChronology();
        mutablePeriod8.setPeriod((long) 'u', (long) 1969, chronology21);
        org.joda.time.DateTimeField dateTimeField23 = chronology21.millisOfDay();
        org.joda.time.DateTimeField dateTimeField24 = chronology21.yearOfCentury();
        org.joda.time.Duration duration27 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.Seconds seconds28 = duration27.toStandardSeconds();
        org.joda.time.ReadableDuration readableDuration29 = null;
        boolean boolean30 = duration27.isEqual(readableDuration29);
        org.joda.time.Duration duration32 = duration27.minus((long) 1);
        org.joda.time.Duration duration34 = duration32.minus((long) '4');
        org.joda.time.Instant instant36 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime37 = instant36.toDateTime();
        org.joda.time.DateTime.Property property38 = dateTime37.era();
        org.joda.time.Duration duration41 = new org.joda.time.Duration((long) 0, (long) (byte) 100);
        org.joda.time.Duration duration44 = new org.joda.time.Duration((long) ' ', (long) ' ');
        org.joda.time.Period period45 = duration44.toPeriod();
        org.joda.time.Duration duration47 = duration44.plus((long) (byte) 0);
        org.joda.time.Instant instant49 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime50 = instant49.toDateTime();
        boolean boolean52 = dateTime50.isEqual(10L);
        org.joda.time.PeriodType periodType55 = org.joda.time.PeriodType.yearDay();
        org.joda.time.Chronology chronology56 = null;
        org.joda.time.MutablePeriod mutablePeriod57 = new org.joda.time.MutablePeriod((long) 100, 0L, periodType55, chronology56);
        org.joda.time.PeriodType periodType58 = periodType55.withWeeksRemoved();
        org.joda.time.MutablePeriod mutablePeriod59 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration47, (org.joda.time.ReadableInstant) dateTime50, periodType58);
        org.joda.time.Period period60 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime37, (org.joda.time.ReadableDuration) duration41, periodType58);
        org.joda.time.PeriodType periodType61 = org.joda.time.PeriodType.dayTime();
        org.joda.time.Period period62 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration32, (org.joda.time.ReadableInstant) dateTime37, periodType61);
        org.joda.time.TimeOfDay timeOfDay63 = dateTime37.toTimeOfDay();
        int[] intArray65 = chronology21.get((org.joda.time.ReadablePartial) timeOfDay63, (long) (-1));
        org.joda.time.DateTimeField dateTimeField66 = chronology21.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField67 = chronology21.millisOfDay();
        org.joda.time.DurationField durationField68 = dateTimeField67.getDurationField();
        long long70 = durationField68.getMillis(86399999);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant36 and dateTime37", (instant36.compareTo(dateTime37) == 0) == instant36.equals(dateTime37));
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2523");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime2 = instant1.toDateTime();
        org.joda.time.DateTime.Property property3 = dateTime2.era();
        org.joda.time.DateTime dateTime4 = dateTime2.withTimeAtStartOfDay();
        org.joda.time.Instant instant5 = dateTime2.toInstant();
        org.joda.time.TimeOfDay timeOfDay6 = dateTime2.toTimeOfDay();
        org.joda.time.Instant instant8 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime9 = instant8.toDateTime();
        org.joda.time.DateTime.Property property10 = dateTime9.era();
        org.joda.time.DateTime dateTime11 = dateTime9.withTimeAtStartOfDay();
        org.joda.time.Instant instant12 = dateTime9.toInstant();
        org.joda.time.DateMidnight dateMidnight13 = dateTime9.toDateMidnight();
        org.joda.time.DateTime dateTime16 = dateTime9.withDurationAdded(0L, (int) 'a');
        org.joda.time.Seconds seconds17 = org.joda.time.Seconds.secondsBetween((org.joda.time.ReadableInstant) dateTime2, (org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateTime.Property property18 = dateTime2.secondOfDay();
        org.joda.time.DateTime.Property property19 = dateTime2.era();
        int int20 = property19.getMinimumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.DateTimeField dateTimeField23 = dateTimeFieldType21.getField(chronology22);
        long long26 = dateTimeField23.add(0L, (long) (short) 1);
        boolean boolean28 = dateTimeField23.isLeap(10L);
        int int30 = dateTimeField23.get((-1L));
        long long32 = dateTimeField23.remainder((long) (byte) 0);
        java.util.Locale locale33 = java.util.Locale.ITALY;
        int int34 = dateTimeField23.getMaximumShortTextLength(locale33);
        java.lang.String str35 = property19.getAsText(locale33);
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = property19.getFieldType();
        int int37 = property19.get();
        org.joda.time.DurationField durationField38 = property19.getLeapDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime2", (instant1.compareTo(dateTime2) == 0) == instant1.equals(dateTime2));
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2524");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime2 = instant1.toDateTime();
        org.joda.time.DateTime.Property property3 = dateTime2.era();
        org.joda.time.DateTime dateTime4 = dateTime2.withTimeAtStartOfDay();
        org.joda.time.Instant instant5 = dateTime2.toInstant();
        org.joda.time.DateMidnight dateMidnight6 = dateTime2.toDateMidnight();
        org.joda.time.DateTime dateTime9 = dateTime2.withDurationAdded(0L, (int) 'a');
        org.joda.time.Duration duration12 = new org.joda.time.Duration((long) ' ', (long) ' ');
        org.joda.time.Period period13 = duration12.toPeriod();
        org.joda.time.DurationFieldType[] durationFieldTypeArray14 = period13.getFieldTypes();
        org.joda.time.Period period16 = period13.minusYears((int) (byte) 1);
        org.joda.time.Period period18 = period13.plusMonths((int) (byte) 0);
        int int19 = period13.size();
        org.joda.time.Period period21 = period13.plusYears(100);
        org.joda.time.Period period23 = period13.minusSeconds(292278993);
        org.joda.time.Duration duration26 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.PeriodType periodType28 = null;
        org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration26, readableInstant27, periodType28);
        mutablePeriod29.addDays((int) (short) 100);
        org.joda.time.DurationFieldType durationFieldType32 = org.joda.time.DurationFieldType.days();
        mutablePeriod29.add(durationFieldType32, 8);
        boolean boolean35 = period13.isSupported(durationFieldType32);
        org.joda.time.DateTime dateTime37 = dateTime2.withFieldAdded(durationFieldType32, (-2147483648));
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.DateTime dateTime39 = dateTime2.toDateTime(chronology38);
        org.joda.time.DateTime dateTime41 = dateTime2.withYearOfEra((int) (short) 100);
        org.joda.time.Days days42 = org.joda.time.Days.MIN_VALUE;
        org.joda.time.Days days44 = days42.dividedBy((int) (byte) 1);
        org.joda.time.Days days46 = days42.dividedBy((int) (short) -1);
        org.joda.time.Duration duration49 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant50 = null;
        org.joda.time.PeriodType periodType51 = null;
        org.joda.time.MutablePeriod mutablePeriod52 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration49, readableInstant50, periodType51);
        mutablePeriod52.setMonths((int) '4');
        org.joda.time.Period period55 = mutablePeriod52.toPeriod();
        mutablePeriod52.setYears((int) (short) -1);
        org.joda.time.Duration duration60 = new org.joda.time.Duration((long) ' ', (long) ' ');
        org.joda.time.Period period61 = duration60.toPeriod();
        org.joda.time.Duration duration63 = duration60.plus((long) (byte) 0);
        org.joda.time.ReadableInstant readableInstant64 = null;
        org.joda.time.Period period65 = duration60.toPeriodTo(readableInstant64);
        org.joda.time.Days days66 = duration60.toStandardDays();
        boolean boolean67 = mutablePeriod52.equals((java.lang.Object) days66);
        org.joda.time.Days days68 = org.joda.time.Days.FIVE;
        boolean boolean69 = days66.isLessThan(days68);
        org.joda.time.PeriodType periodType70 = days66.getPeriodType();
        org.joda.time.Days days72 = org.joda.time.Days.days(0);
        org.joda.time.Days days74 = days72.dividedBy((int) (short) 10);
        org.joda.time.Days days75 = days66.plus(days72);
        boolean boolean76 = days42.isLessThan(days72);
        org.joda.time.Days days78 = org.joda.time.Days.days(0);
        org.joda.time.Days days80 = days78.dividedBy((int) (short) 10);
        boolean boolean81 = days72.isLessThan(days78);
        org.joda.time.DurationFieldType durationFieldType82 = days78.getFieldType();
        org.joda.time.DateTime dateTime84 = dateTime2.withFieldAdded(durationFieldType82, 440);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime2", (instant1.compareTo(dateTime2) == 0) == instant1.equals(dateTime2));
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2525");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardMinutes(29227899301L);
        org.joda.time.Duration duration3 = new org.joda.time.Duration((long) 149);
        boolean boolean4 = duration1.isEqual((org.joda.time.ReadableDuration) duration3);
        org.joda.time.PeriodType periodType7 = org.joda.time.PeriodType.yearDay();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((long) 100, 0L, periodType7, chronology8);
        org.joda.time.PeriodType periodType10 = periodType7.withWeeksRemoved();
        org.joda.time.PeriodType periodType11 = periodType10.withSecondsRemoved();
        org.joda.time.PeriodType periodType12 = periodType11.withHoursRemoved();
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod(periodType12);
        mutablePeriod13.addDays(7);
        int int16 = mutablePeriod13.getHours();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(chronology17);
        org.joda.time.DateTime.Property property19 = dateTime18.yearOfEra();
        org.joda.time.DateTime.Property property20 = dateTime18.weekOfWeekyear();
        org.joda.time.DateTime.Property property21 = dateTime18.hourOfDay();
        java.util.Locale locale23 = java.util.Locale.forLanguageTag("2022-02-22T07:11:13.646Z");
        int int24 = property21.getMaximumShortTextLength(locale23);
        int int25 = property21.getMinimumValueOverall();
        java.lang.String str26 = property21.getAsString();
        org.joda.time.Interval interval27 = property21.toInterval();
        mutablePeriod13.setPeriod((org.joda.time.ReadableInterval) interval27);
        org.joda.time.PeriodType periodType33 = org.joda.time.PeriodType.yearDay();
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod((long) 100, 0L, periodType33, chronology34);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod(1L, (long) 10, periodType33, chronology36);
        org.joda.time.PeriodType periodType38 = periodType33.withDaysRemoved();
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.DurationFieldType durationFieldType40 = dateTimeFieldType39.getRangeDurationType();
        boolean boolean41 = periodType33.isSupported(durationFieldType40);
        org.joda.time.Instant instant43 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime44 = instant43.toDateTime();
        org.joda.time.DateTime.Property property45 = dateTime44.secondOfMinute();
        int int46 = dateTime44.getDayOfYear();
        org.joda.time.Instant instant48 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime49 = instant48.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.DateTime dateTime51 = dateTime49.withZone(dateTimeZone50);
        org.joda.time.Instant instant53 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime54 = instant53.toDateTime();
        org.joda.time.DateTime.Property property55 = dateTime54.era();
        org.joda.time.DateTime dateTime56 = dateTime54.withTimeAtStartOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType57 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        boolean boolean58 = dateTime54.isSupported(dateTimeFieldType57);
        org.joda.time.DateTime.Property property59 = dateTime49.property(dateTimeFieldType57);
        boolean boolean60 = dateTime44.isSupported(dateTimeFieldType57);
        org.joda.time.DurationFieldType durationFieldType61 = dateTimeFieldType57.getDurationType();
        boolean boolean62 = periodType33.isSupported(durationFieldType61);
        org.joda.time.Period period63 = interval27.toPeriod(periodType33);
        org.joda.time.Period period64 = duration1.toPeriod(periodType33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant43 and dateTime44", (instant43.compareTo(dateTime44) == 0) == instant43.equals(dateTime44));
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2526");
        org.joda.time.Instant instant2 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime3 = instant2.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = dateTime3.withZoneRetainFields(dateTimeZone4);
        org.joda.time.Instant instant7 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime8 = instant7.toDateTime();
        org.joda.time.DateTime.Property property9 = dateTime8.era();
        org.joda.time.DateTime dateTime10 = dateTime8.withTimeAtStartOfDay();
        org.joda.time.Duration duration13 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.PeriodType periodType15 = null;
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration13, readableInstant14, periodType15);
        mutablePeriod16.setMonths((int) '4');
        org.joda.time.DateTime dateTime19 = dateTime8.plus((org.joda.time.ReadablePeriod) mutablePeriod16);
        org.joda.time.DateTime dateTime21 = dateTime8.minusWeeks((int) (byte) 1);
        int int22 = dateTime5.compareTo((org.joda.time.ReadableInstant) dateTime8);
        org.joda.time.DateTime.Property property23 = dateTime8.minuteOfHour();
        org.joda.time.DateTime dateTime25 = dateTime8.withYear(1969);
        org.joda.time.Chronology chronology26 = dateTime25.getChronology();
        org.joda.time.DateTimeField dateTimeField27 = chronology26.year();
        org.joda.time.DateTimeField dateTimeField28 = chronology26.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField29 = chronology26.centuryOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = dateTimeField29.getType();
        org.joda.time.DurationFieldType durationFieldType31 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.Instant instant33 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime34 = instant33.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.DateTime dateTime36 = dateTime34.withZoneRetainFields(dateTimeZone35);
        org.joda.time.Instant instant38 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime39 = instant38.toDateTime();
        org.joda.time.DateTime.Property property40 = dateTime39.era();
        org.joda.time.DateTime dateTime41 = dateTime39.withTimeAtStartOfDay();
        org.joda.time.Duration duration44 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.PeriodType periodType46 = null;
        org.joda.time.MutablePeriod mutablePeriod47 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration44, readableInstant45, periodType46);
        mutablePeriod47.setMonths((int) '4');
        org.joda.time.DateTime dateTime50 = dateTime39.plus((org.joda.time.ReadablePeriod) mutablePeriod47);
        org.joda.time.DateTime dateTime52 = dateTime39.minusWeeks((int) (byte) 1);
        int int53 = dateTime36.compareTo((org.joda.time.ReadableInstant) dateTime39);
        org.joda.time.DateTime.Property property54 = dateTime39.minuteOfHour();
        org.joda.time.DateTime dateTime56 = dateTime39.withYear(1969);
        org.joda.time.Chronology chronology57 = dateTime56.getChronology();
        org.joda.time.DurationField durationField58 = durationFieldType31.getField(chronology57);
        org.joda.time.DateTimeField dateTimeField59 = chronology57.clockhourOfHalfday();
        boolean boolean60 = dateTimeFieldType30.isSupported(chronology57);
        org.joda.time.DateTimeField dateTimeField61 = chronology57.yearOfEra();
        org.joda.time.MutablePeriod mutablePeriod62 = new org.joda.time.MutablePeriod(4438800000L, chronology57);
        org.joda.time.DurationField durationField63 = chronology57.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant2 and dateTime3", (instant2.compareTo(dateTime3) == 0) == instant2.equals(dateTime3));
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2527");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.Instant instant3 = instant1.minus(100L);
        org.joda.time.Instant instant5 = instant3.plus((long) 100);
        org.joda.time.Instant instant7 = instant3.withMillis((long) (byte) 1);
        org.joda.time.Period period9 = org.joda.time.Period.seconds((-1));
        org.joda.time.Period period11 = period9.minusMonths((int) (short) 10);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Duration duration13 = period11.toDurationTo(readableInstant12);
        org.joda.time.Duration duration16 = duration13.withDurationAdded((long) '#', 0);
        org.joda.time.Instant instant18 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.Instant instant20 = instant18.minus(100L);
        org.joda.time.MutableDateTime mutableDateTime21 = instant18.toMutableDateTimeISO();
        org.joda.time.PeriodType periodType22 = org.joda.time.PeriodType.minutes();
        org.joda.time.Period period23 = duration16.toPeriodFrom((org.joda.time.ReadableInstant) mutableDateTime21, periodType22);
        org.joda.time.Instant instant24 = instant7.minus((org.joda.time.ReadableDuration) duration16);
        org.joda.time.Instant instant26 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime27 = instant26.toDateTime();
        org.joda.time.DateTime.Property property28 = dateTime27.era();
        org.joda.time.DateTime dateTime29 = dateTime27.withTimeAtStartOfDay();
        org.joda.time.Instant instant30 = dateTime27.toInstant();
        org.joda.time.DateMidnight dateMidnight31 = dateTime27.toDateMidnight();
        int int32 = dateTime27.getHourOfDay();
        org.joda.time.Days days33 = org.joda.time.Days.daysBetween((org.joda.time.ReadableInstant) instant24, (org.joda.time.ReadableInstant) dateTime27);
        org.joda.time.DateTime dateTime35 = dateTime27.plusHours((int) 'x');
        org.joda.time.DateTime dateTime37 = dateTime27.minusHours(0);
        org.joda.time.LocalDate localDate38 = dateTime37.toLocalDate();
        org.joda.time.Days days39 = org.joda.time.Days.THREE;
        org.joda.time.DurationFieldType durationFieldType40 = org.joda.time.DurationFieldType.minutes();
        int int41 = days39.get(durationFieldType40);
        org.joda.time.MutablePeriod mutablePeriod42 = days39.toMutablePeriod();
        org.joda.time.Days days44 = days39.multipliedBy((int) (byte) 1);
        org.joda.time.DurationFieldType durationFieldType45 = org.joda.time.DurationFieldType.halfdays();
        boolean boolean46 = days44.isSupported(durationFieldType45);
        boolean boolean47 = localDate38.equals((java.lang.Object) durationFieldType45);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and mutableDateTime21", (instant1.compareTo(mutableDateTime21) == 0) == instant1.equals(mutableDateTime21));
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2528");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime2 = instant1.toDateTime();
        org.joda.time.DateTime.Property property3 = dateTime2.era();
        org.joda.time.DateTime dateTime4 = dateTime2.withTimeAtStartOfDay();
        org.joda.time.Duration duration7 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.PeriodType periodType9 = null;
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration7, readableInstant8, periodType9);
        mutablePeriod10.setMonths((int) '4');
        org.joda.time.DateTime dateTime13 = dateTime2.plus((org.joda.time.ReadablePeriod) mutablePeriod10);
        org.joda.time.DateTime dateTime15 = dateTime2.minusWeeks((int) (byte) 1);
        org.joda.time.DateTime.Property property16 = dateTime15.monthOfYear();
        org.joda.time.DateTime.Property property17 = dateTime15.weekyear();
        java.lang.Object obj18 = null;
        org.joda.time.Instant instant19 = new org.joda.time.Instant(obj18);
        org.joda.time.DateTimeZone dateTimeZone20 = instant19.getZone();
        java.lang.String str21 = dateTimeZone20.toString();
        java.lang.String str23 = dateTimeZone20.getName((long) 10);
        java.lang.String str25 = dateTimeZone20.getName((long) 8);
        int int27 = dateTimeZone20.getOffsetFromLocal((long) (short) -1);
        org.joda.time.DateTime dateTime28 = dateTime15.withZone(dateTimeZone20);
        java.lang.String str29 = dateTimeZone20.getID();
        java.lang.String str31 = dateTimeZone20.getName((long) 'x');
        int int33 = dateTimeZone20.getStandardOffset((-85559990L));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime2", (instant1.compareTo(dateTime2) == 0) == instant1.equals(dateTime2));
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2529");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime2 = instant1.toDateTime();
        boolean boolean4 = dateTime2.isEqual(10L);
        org.joda.time.DateTime dateTime6 = dateTime2.withCenturyOfEra((int) (byte) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateTimeField dateTimeField9 = dateTimeFieldType7.getField(chronology8);
        long long12 = dateTimeField9.add(0L, (long) (short) 1);
        long long15 = dateTimeField9.add(1L, (-1));
        int int16 = dateTime2.get(dateTimeField9);
        org.joda.time.Instant instant18 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime19 = instant18.toDateTime();
        org.joda.time.DateTime.Property property20 = dateTime19.era();
        org.joda.time.DateTime dateTime21 = dateTime19.withTimeAtStartOfDay();
        org.joda.time.Duration duration24 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.PeriodType periodType26 = null;
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration24, readableInstant25, periodType26);
        mutablePeriod27.setMonths((int) '4');
        org.joda.time.DateTime dateTime30 = dateTime19.plus((org.joda.time.ReadablePeriod) mutablePeriod27);
        org.joda.time.DateTime dateTime32 = dateTime19.minusWeeks((int) (byte) 1);
        long long33 = dateTime19.getMillis();
        org.joda.time.DurationFieldType durationFieldType34 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.Instant instant36 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime37 = instant36.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.DateTime dateTime39 = dateTime37.withZoneRetainFields(dateTimeZone38);
        org.joda.time.Instant instant41 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime42 = instant41.toDateTime();
        org.joda.time.DateTime.Property property43 = dateTime42.era();
        org.joda.time.DateTime dateTime44 = dateTime42.withTimeAtStartOfDay();
        org.joda.time.Duration duration47 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant48 = null;
        org.joda.time.PeriodType periodType49 = null;
        org.joda.time.MutablePeriod mutablePeriod50 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration47, readableInstant48, periodType49);
        mutablePeriod50.setMonths((int) '4');
        org.joda.time.DateTime dateTime53 = dateTime42.plus((org.joda.time.ReadablePeriod) mutablePeriod50);
        org.joda.time.DateTime dateTime55 = dateTime42.minusWeeks((int) (byte) 1);
        int int56 = dateTime39.compareTo((org.joda.time.ReadableInstant) dateTime42);
        org.joda.time.DateTime.Property property57 = dateTime42.minuteOfHour();
        org.joda.time.DateTime dateTime59 = dateTime42.withYear(1969);
        org.joda.time.Chronology chronology60 = dateTime59.getChronology();
        org.joda.time.DurationField durationField61 = durationFieldType34.getField(chronology60);
        org.joda.time.DateTime dateTime62 = dateTime19.toDateTime(chronology60);
        org.joda.time.DateTime dateTime63 = dateTime2.toDateTime(chronology60);
        org.joda.time.DateTime dateTime64 = org.joda.time.DateTime.now(chronology60);
        java.lang.String str65 = chronology60.toString();
        org.joda.time.DateTimeField dateTimeField66 = chronology60.minuteOfHour();
        org.joda.time.Duration duration69 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant70 = null;
        org.joda.time.PeriodType periodType71 = null;
        org.joda.time.MutablePeriod mutablePeriod72 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration69, readableInstant70, periodType71);
        mutablePeriod72.setMillis((int) (short) 1);
        int int75 = mutablePeriod72.getSeconds();
        org.joda.time.Weeks weeks76 = org.joda.time.Weeks.THREE;
        org.joda.time.DurationFieldType durationFieldType77 = weeks76.getFieldType();
        mutablePeriod72.add(durationFieldType77, (int) (byte) 0);
        mutablePeriod72.addMonths(0);
        mutablePeriod72.setPeriod((long) 2, (long) 23);
        mutablePeriod72.addMillis(0);
        mutablePeriod72.add(141012, 12, (int) (short) 100, (int) (byte) 100, 10, 9, (-1), 23);
        org.joda.time.MutablePeriod mutablePeriod96 = mutablePeriod72.toMutablePeriod();
        int[] intArray99 = chronology60.get((org.joda.time.ReadablePeriod) mutablePeriod96, (-32054399993L), 4L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime2", (instant1.compareTo(dateTime2) == 0) == instant1.equals(dateTime2));
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2530");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.Instant instant2 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime3 = instant2.toDateTime();
        boolean boolean5 = dateTime3.isEqual(10L);
        org.joda.time.DateTime dateTime7 = dateTime3.withCenturyOfEra((int) (byte) 1);
        int int8 = instant0.compareTo((org.joda.time.ReadableInstant) dateTime3);
        org.joda.time.Minutes minutes9 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.Minutes minutes10 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.Minutes minutes12 = minutes10.minus((int) (short) -1);
        boolean boolean13 = minutes9.isGreaterThan(minutes10);
        org.joda.time.Minutes minutes14 = null;
        org.joda.time.Minutes minutes15 = minutes10.minus(minutes14);
        org.joda.time.Minutes minutes17 = minutes10.plus((int) (short) 1);
        org.joda.time.PeriodType periodType18 = minutes17.getPeriodType();
        org.joda.time.Minutes minutes19 = org.joda.time.Minutes.TWO;
        boolean boolean20 = minutes17.isLessThan(minutes19);
        org.joda.time.Minutes minutes22 = minutes19.minus(70);
        org.joda.time.DurationFieldType durationFieldType23 = minutes19.getFieldType();
        org.joda.time.DateTime dateTime25 = dateTime3.withFieldAdded(durationFieldType23, (-1));
        org.joda.time.DateMidnight dateMidnight26 = dateTime25.toDateMidnight();
        org.joda.time.DateTime dateTime28 = dateTime25.minus(4830L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant2 and dateTime3", (instant2.compareTo(dateTime3) == 0) == instant2.equals(dateTime3));
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2531");
        org.joda.time.PeriodType periodType3 = org.joda.time.PeriodType.yearDay();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((long) 100, 0L, periodType3, chronology4);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((long) (short) 0, periodType3, chronology6);
        org.joda.time.PeriodType periodType9 = null;
        org.joda.time.Period period10 = new org.joda.time.Period((long) (short) 10, periodType9);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.Instant instant13 = instant12.toInstant();
        org.joda.time.DateTime dateTime14 = instant13.toDateTimeISO();
        org.joda.time.Duration duration15 = period10.toDurationFrom((org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.Duration duration18 = new org.joda.time.Duration((-1L), (long) 23);
        org.joda.time.Period period20 = org.joda.time.Period.seconds((-1));
        org.joda.time.Period period22 = period20.minusMonths((int) (short) 10);
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.Duration duration24 = period22.toDurationTo(readableInstant23);
        org.joda.time.Duration duration27 = duration24.withDurationAdded((long) '#', 0);
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.Period period29 = duration27.toPeriodFrom(readableInstant28);
        org.joda.time.Duration duration30 = duration18.minus((org.joda.time.ReadableDuration) duration27);
        org.joda.time.Duration duration31 = duration15.plus((org.joda.time.ReadableDuration) duration18);
        mutablePeriod7.add((org.joda.time.ReadableDuration) duration18);
        org.joda.time.MutablePeriod mutablePeriod44 = new org.joda.time.MutablePeriod(0, (int) 'a', 1, 100, (int) (byte) 10, 0, (int) (short) -1, (int) (byte) -1);
        int int45 = mutablePeriod44.getDays();
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.DateTime dateTime49 = new org.joda.time.DateTime(chronology48);
        org.joda.time.DateTime.Property property50 = dateTime49.yearOfEra();
        org.joda.time.Interval interval51 = property50.toInterval();
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.DateTime dateTime53 = new org.joda.time.DateTime(chronology52);
        org.joda.time.DateTime.Property property54 = dateTime53.yearOfEra();
        org.joda.time.Interval interval55 = property54.toInterval();
        boolean boolean56 = interval51.contains((org.joda.time.ReadableInterval) interval55);
        org.joda.time.Chronology chronology57 = interval55.getChronology();
        mutablePeriod44.setPeriod((long) 'u', (long) 1969, chronology57);
        org.joda.time.Period period59 = new org.joda.time.Period((long) (byte) 100, chronology57);
        mutablePeriod7.setPeriod((long) 1, (long) 69, chronology57);
        org.joda.time.DateTimeField dateTimeField61 = chronology57.year();
        org.joda.time.DateTimeField dateTimeField62 = chronology57.halfdayOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType63 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.Chronology chronology64 = null;
        org.joda.time.DateTimeField dateTimeField65 = dateTimeFieldType63.getField(chronology64);
        long long68 = dateTimeField65.add(0L, (long) (short) 1);
        org.joda.time.ReadablePartial readablePartial69 = null;
        int int70 = dateTimeField65.getMinimumValue(readablePartial69);
        long long73 = dateTimeField65.add(0L, 69);
        org.joda.time.Instant instant75 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime76 = instant75.toDateTime();
        org.joda.time.DateTime.Property property77 = dateTime76.era();
        org.joda.time.Instant instant79 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.Instant instant81 = instant79.minus(100L);
        org.joda.time.Instant instant83 = instant81.plus((long) 100);
        org.joda.time.Instant instant85 = instant81.withMillis((long) (byte) 1);
        org.joda.time.Minutes minutes86 = org.joda.time.Minutes.minutesBetween((org.joda.time.ReadableInstant) dateTime76, (org.joda.time.ReadableInstant) instant81);
        org.joda.time.LocalTime localTime87 = dateTime76.toLocalTime();
        int int88 = dateTimeField65.getMinimumValue((org.joda.time.ReadablePartial) localTime87);
        int int89 = dateTimeField62.getMaximumValue((org.joda.time.ReadablePartial) localTime87);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant12 and dateTime14", (instant12.compareTo(dateTime14) == 0) == instant12.equals(dateTime14));
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2532");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod(0, (int) 'a', 1, 100, (int) (byte) 10, 0, (int) (short) -1, (int) (byte) -1);
        int int9 = mutablePeriod8.getDays();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(chronology12);
        org.joda.time.DateTime.Property property14 = dateTime13.yearOfEra();
        org.joda.time.Interval interval15 = property14.toInterval();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime(chronology16);
        org.joda.time.DateTime.Property property18 = dateTime17.yearOfEra();
        org.joda.time.Interval interval19 = property18.toInterval();
        boolean boolean20 = interval15.contains((org.joda.time.ReadableInterval) interval19);
        org.joda.time.Chronology chronology21 = interval19.getChronology();
        mutablePeriod8.setPeriod((long) 'u', (long) 1969, chronology21);
        org.joda.time.DateTimeField dateTimeField23 = chronology21.millisOfDay();
        org.joda.time.DateTimeField dateTimeField24 = chronology21.yearOfCentury();
        org.joda.time.Duration duration27 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.Seconds seconds28 = duration27.toStandardSeconds();
        org.joda.time.ReadableDuration readableDuration29 = null;
        boolean boolean30 = duration27.isEqual(readableDuration29);
        org.joda.time.Duration duration32 = duration27.minus((long) 1);
        org.joda.time.Duration duration34 = duration32.minus((long) '4');
        org.joda.time.Instant instant36 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime37 = instant36.toDateTime();
        org.joda.time.DateTime.Property property38 = dateTime37.era();
        org.joda.time.Duration duration41 = new org.joda.time.Duration((long) 0, (long) (byte) 100);
        org.joda.time.Duration duration44 = new org.joda.time.Duration((long) ' ', (long) ' ');
        org.joda.time.Period period45 = duration44.toPeriod();
        org.joda.time.Duration duration47 = duration44.plus((long) (byte) 0);
        org.joda.time.Instant instant49 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime50 = instant49.toDateTime();
        boolean boolean52 = dateTime50.isEqual(10L);
        org.joda.time.PeriodType periodType55 = org.joda.time.PeriodType.yearDay();
        org.joda.time.Chronology chronology56 = null;
        org.joda.time.MutablePeriod mutablePeriod57 = new org.joda.time.MutablePeriod((long) 100, 0L, periodType55, chronology56);
        org.joda.time.PeriodType periodType58 = periodType55.withWeeksRemoved();
        org.joda.time.MutablePeriod mutablePeriod59 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration47, (org.joda.time.ReadableInstant) dateTime50, periodType58);
        org.joda.time.Period period60 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime37, (org.joda.time.ReadableDuration) duration41, periodType58);
        org.joda.time.PeriodType periodType61 = org.joda.time.PeriodType.dayTime();
        org.joda.time.Period period62 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration32, (org.joda.time.ReadableInstant) dateTime37, periodType61);
        org.joda.time.TimeOfDay timeOfDay63 = dateTime37.toTimeOfDay();
        int[] intArray65 = chronology21.get((org.joda.time.ReadablePartial) timeOfDay63, (long) (-1));
        org.joda.time.DateTimeField dateTimeField66 = chronology21.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField67 = chronology21.millisOfDay();
        org.joda.time.DateTime dateTime68 = org.joda.time.DateTime.now(chronology21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant36 and dateTime37", (instant36.compareTo(dateTime37) == 0) == instant36.equals(dateTime37));
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2533");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime2 = instant1.toDateTime();
        org.joda.time.DateTime.Property property3 = dateTime2.era();
        org.joda.time.DateTime dateTime4 = dateTime2.withTimeAtStartOfDay();
        org.joda.time.Duration duration7 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.PeriodType periodType9 = null;
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration7, readableInstant8, periodType9);
        mutablePeriod10.setMonths((int) '4');
        org.joda.time.DateTime dateTime13 = dateTime2.plus((org.joda.time.ReadablePeriod) mutablePeriod10);
        java.lang.Object obj14 = null;
        org.joda.time.Instant instant15 = new org.joda.time.Instant(obj14);
        org.joda.time.DateTimeZone dateTimeZone16 = instant15.getZone();
        java.lang.String str17 = dateTimeZone16.toString();
        int int19 = dateTimeZone16.getOffset(1L);
        boolean boolean21 = dateTimeZone16.isStandardOffset(0L);
        org.joda.time.DateTime dateTime22 = dateTime2.withZoneRetainFields(dateTimeZone16);
        org.joda.time.Instant instant23 = dateTime22.toInstant();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = null;
        java.lang.String str25 = instant23.toString(dateTimeFormatter24);
        org.joda.time.DateTime dateTime26 = instant23.toDateTime();
        long long27 = instant23.getMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime2", (instant1.compareTo(dateTime2) == 0) == instant1.equals(dateTime2));
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2534");
        org.joda.time.Duration duration2 = new org.joda.time.Duration((long) ' ', (long) ' ');
        org.joda.time.Period period3 = duration2.toPeriod();
        org.joda.time.Duration duration5 = duration2.plus((long) (byte) 0);
        org.joda.time.Instant instant7 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime8 = instant7.toDateTime();
        boolean boolean10 = dateTime8.isEqual(10L);
        org.joda.time.PeriodType periodType13 = org.joda.time.PeriodType.yearDay();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((long) 100, 0L, periodType13, chronology14);
        org.joda.time.PeriodType periodType16 = periodType13.withWeeksRemoved();
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration5, (org.joda.time.ReadableInstant) dateTime8, periodType16);
        org.joda.time.Minutes minutes18 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.Minutes minutes19 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.Minutes minutes21 = minutes19.minus((int) (short) -1);
        boolean boolean22 = minutes18.isGreaterThan(minutes19);
        org.joda.time.Minutes minutes23 = org.joda.time.Minutes.TWO;
        boolean boolean24 = minutes18.isLessThan(minutes23);
        org.joda.time.DateTime dateTime25 = dateTime8.plus((org.joda.time.ReadablePeriod) minutes18);
        org.joda.time.DateTime.Property property26 = dateTime25.year();
        int int27 = dateTime25.getWeekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone28 = dateTime25.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant7 and dateTime8", (instant7.compareTo(dateTime8) == 0) == instant7.equals(dateTime8));
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2535");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime.Property property2 = dateTime1.yearOfEra();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(chronology4);
        org.joda.time.DateTime.Property property6 = dateTime5.yearOfEra();
        org.joda.time.Interval interval7 = property6.toInterval();
        boolean boolean8 = interval3.contains((org.joda.time.ReadableInterval) interval7);
        java.lang.Object obj9 = null;
        org.joda.time.Instant instant10 = new org.joda.time.Instant(obj9);
        org.joda.time.DateTimeZone dateTimeZone11 = instant10.getZone();
        java.lang.String str12 = dateTimeZone11.toString();
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(dateTimeZone11);
        boolean boolean14 = interval3.contains((org.joda.time.ReadableInstant) dateTime13);
        org.joda.time.Instant instant16 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime17 = instant16.toDateTime();
        org.joda.time.DateTime.Property property18 = dateTime17.era();
        boolean boolean19 = interval3.contains((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.Period period20 = interval3.toPeriod();
        org.joda.time.PeriodType periodType23 = org.joda.time.PeriodType.yearDay();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutablePeriod mutablePeriod25 = new org.joda.time.MutablePeriod((long) 100, 0L, periodType23, chronology24);
        org.joda.time.PeriodType periodType26 = periodType23.withWeeksRemoved();
        org.joda.time.PeriodType periodType27 = periodType26.withSecondsRemoved();
        org.joda.time.PeriodType periodType28 = periodType27.withWeeksRemoved();
        org.joda.time.Period period29 = interval3.toPeriod(periodType27);
        org.joda.time.DateTime dateTime30 = interval3.getEnd();
        org.joda.time.Instant instant32 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.Instant instant34 = instant32.minus(100L);
        java.lang.String str35 = instant34.toString();
        org.joda.time.Duration duration38 = new org.joda.time.Duration((long) ' ', (long) ' ');
        org.joda.time.Period period39 = duration38.toPeriod();
        org.joda.time.Duration duration41 = duration38.plus((long) (byte) 0);
        org.joda.time.ReadableInstant readableInstant42 = null;
        org.joda.time.Period period43 = duration38.toPeriodTo(readableInstant42);
        org.joda.time.Duration duration45 = duration38.withMillis((long) (short) 0);
        org.joda.time.Instant instant46 = instant34.plus((org.joda.time.ReadableDuration) duration38);
        java.lang.String str47 = duration38.toString();
        org.joda.time.Instant instant49 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime50 = instant49.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone51 = null;
        org.joda.time.DateTime dateTime52 = dateTime50.withZoneRetainFields(dateTimeZone51);
        org.joda.time.Instant instant54 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime55 = instant54.toDateTime();
        org.joda.time.DateTime.Property property56 = dateTime55.era();
        org.joda.time.DateTime dateTime57 = dateTime55.withTimeAtStartOfDay();
        org.joda.time.Duration duration60 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant61 = null;
        org.joda.time.PeriodType periodType62 = null;
        org.joda.time.MutablePeriod mutablePeriod63 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration60, readableInstant61, periodType62);
        mutablePeriod63.setMonths((int) '4');
        org.joda.time.DateTime dateTime66 = dateTime55.plus((org.joda.time.ReadablePeriod) mutablePeriod63);
        org.joda.time.DateTime dateTime68 = dateTime55.minusWeeks((int) (byte) 1);
        int int69 = dateTime52.compareTo((org.joda.time.ReadableInstant) dateTime55);
        org.joda.time.DateTime dateTime70 = dateTime52.toDateTimeISO();
        org.joda.time.Interval interval71 = duration38.toIntervalTo((org.joda.time.ReadableInstant) dateTime52);
        org.joda.time.MutableInterval mutableInterval72 = interval71.toMutableInterval();
        org.joda.time.DateTime dateTime73 = interval71.getStart();
        org.joda.time.Chronology chronology74 = null;
        org.joda.time.DateTime dateTime75 = new org.joda.time.DateTime(chronology74);
        org.joda.time.DateTime.Property property76 = dateTime75.yearOfEra();
        org.joda.time.Interval interval77 = property76.toInterval();
        org.joda.time.Chronology chronology78 = null;
        org.joda.time.DateTime dateTime79 = new org.joda.time.DateTime(chronology78);
        org.joda.time.DateTime.Property property80 = dateTime79.yearOfEra();
        org.joda.time.Interval interval81 = property80.toInterval();
        boolean boolean82 = interval77.contains((org.joda.time.ReadableInterval) interval81);
        org.joda.time.Chronology chronology83 = null;
        org.joda.time.DateTime dateTime84 = new org.joda.time.DateTime(chronology83);
        org.joda.time.DateTime.Property property85 = dateTime84.yearOfEra();
        org.joda.time.Interval interval86 = property85.toInterval();
        org.joda.time.Chronology chronology87 = null;
        org.joda.time.DateTime dateTime88 = new org.joda.time.DateTime(chronology87);
        org.joda.time.DateTime.Property property89 = dateTime88.yearOfEra();
        org.joda.time.Interval interval90 = property89.toInterval();
        boolean boolean91 = interval86.contains((org.joda.time.ReadableInterval) interval90);
        boolean boolean92 = interval81.contains((org.joda.time.ReadableInterval) interval86);
        org.joda.time.Chronology chronology93 = interval81.getChronology();
        org.joda.time.Hours hours94 = org.joda.time.Hours.hoursIn((org.joda.time.ReadableInterval) interval81);
        long long95 = interval81.toDurationMillis();
        boolean boolean96 = interval71.overlaps((org.joda.time.ReadableInterval) interval81);
        org.joda.time.Interval interval97 = interval81.toInterval();
        boolean boolean98 = interval3.overlaps((org.joda.time.ReadableInterval) interval97);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant10", (dateTime1.compareTo(instant10) == 0) == dateTime1.equals(instant10));
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2536");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime2 = instant1.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.withZoneRetainFields(dateTimeZone3);
        org.joda.time.DateTime.Property property5 = dateTime4.weekOfWeekyear();
        org.joda.time.Duration duration8 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.PeriodType periodType10 = null;
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration8, readableInstant9, periodType10);
        org.joda.time.DateTime dateTime12 = dateTime4.plus((org.joda.time.ReadableDuration) duration8);
        org.joda.time.DateTime dateTime14 = dateTime4.withYearOfEra(9);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod(0, (int) 'a', 1, 100, (int) (byte) 10, 0, (int) (short) -1, (int) (byte) -1);
        int int25 = mutablePeriod24.getDays();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime(chronology28);
        org.joda.time.DateTime.Property property30 = dateTime29.yearOfEra();
        org.joda.time.Interval interval31 = property30.toInterval();
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime(chronology32);
        org.joda.time.DateTime.Property property34 = dateTime33.yearOfEra();
        org.joda.time.Interval interval35 = property34.toInterval();
        boolean boolean36 = interval31.contains((org.joda.time.ReadableInterval) interval35);
        org.joda.time.Chronology chronology37 = interval35.getChronology();
        mutablePeriod24.setPeriod((long) 'u', (long) 1969, chronology37);
        org.joda.time.DateTimeField dateTimeField39 = dateTimeFieldType15.getField(chronology37);
        org.joda.time.DateTimeField dateTimeField40 = chronology37.weekyear();
        org.joda.time.DateTime dateTime41 = dateTime4.toDateTime(chronology37);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime41", (instant1.compareTo(dateTime41) == 0) == instant1.equals(dateTime41));
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2537");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime2 = instant1.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.withZoneRetainFields(dateTimeZone3);
        org.joda.time.Instant instant6 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime7 = instant6.toDateTime();
        org.joda.time.DateTime.Property property8 = dateTime7.era();
        org.joda.time.DateTime dateTime9 = dateTime7.withTimeAtStartOfDay();
        org.joda.time.Duration duration12 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.PeriodType periodType14 = null;
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration12, readableInstant13, periodType14);
        mutablePeriod15.setMonths((int) '4');
        org.joda.time.DateTime dateTime18 = dateTime7.plus((org.joda.time.ReadablePeriod) mutablePeriod15);
        org.joda.time.DateTime dateTime20 = dateTime7.minusWeeks((int) (byte) 1);
        int int21 = dateTime4.compareTo((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTime dateTime22 = dateTime4.toDateTimeISO();
        org.joda.time.Instant instant24 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.Instant instant26 = instant24.minus(100L);
        java.lang.String str27 = instant26.toString();
        org.joda.time.Duration duration30 = new org.joda.time.Duration((long) ' ', (long) ' ');
        org.joda.time.Period period31 = duration30.toPeriod();
        org.joda.time.Duration duration33 = duration30.plus((long) (byte) 0);
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.Period period35 = duration30.toPeriodTo(readableInstant34);
        org.joda.time.Duration duration37 = duration30.withMillis((long) (short) 0);
        org.joda.time.Instant instant38 = instant26.plus((org.joda.time.ReadableDuration) duration30);
        org.joda.time.Seconds seconds39 = org.joda.time.Seconds.secondsBetween((org.joda.time.ReadableInstant) dateTime22, (org.joda.time.ReadableInstant) instant26);
        org.joda.time.DateTime dateTime41 = dateTime22.withWeekOfWeekyear(7);
        org.joda.time.DateTime.Property property42 = dateTime41.dayOfWeek();
        org.joda.time.DateTimeFieldType dateTimeFieldType43 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.DateTimeField dateTimeField45 = dateTimeFieldType43.getField(chronology44);
        int int47 = dateTimeField45.get((long) 'a');
        org.joda.time.Instant instant50 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime51 = instant50.toDateTime();
        org.joda.time.DateTime.Property property52 = dateTime51.era();
        org.joda.time.DateTime dateTime53 = property52.withMinimumValue();
        int int54 = property52.getMaximumValueOverall();
        java.util.Locale locale55 = java.util.Locale.ENGLISH;
        java.lang.String str56 = locale55.getScript();
        java.lang.String str57 = locale55.getDisplayCountry();
        int int58 = property52.getMaximumShortTextLength(locale55);
        java.util.Locale locale62 = new java.util.Locale("1969-12-31T23:59:59.899Z", "P0W", "hourOfHalfday");
        java.lang.String str63 = locale62.toLanguageTag();
        java.lang.String str64 = property52.getAsText(locale62);
        java.lang.String str65 = dateTimeField45.getAsShortText(97L, locale62);
        java.util.Calendar calendar66 = dateTime41.toCalendar(locale62);
        org.joda.time.DateTimeZone dateTimeZone67 = dateTime41.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime2", (instant1.compareTo(dateTime2) == 0) == instant1.equals(dateTime2));
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2538");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime2 = instant1.toDateTime();
        org.joda.time.TimeOfDay timeOfDay3 = dateTime2.toTimeOfDay();
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime((java.lang.Object) dateTime2);
        org.joda.time.Instant instant6 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime7 = instant6.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = dateTime7.withZoneRetainFields(dateTimeZone8);
        org.joda.time.Instant instant11 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime12 = instant11.toDateTime();
        org.joda.time.DateTime.Property property13 = dateTime12.era();
        org.joda.time.DateTime dateTime14 = dateTime12.withTimeAtStartOfDay();
        org.joda.time.Duration duration17 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.PeriodType periodType19 = null;
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration17, readableInstant18, periodType19);
        mutablePeriod20.setMonths((int) '4');
        org.joda.time.DateTime dateTime23 = dateTime12.plus((org.joda.time.ReadablePeriod) mutablePeriod20);
        org.joda.time.DateTime dateTime25 = dateTime12.minusWeeks((int) (byte) 1);
        int int26 = dateTime9.compareTo((org.joda.time.ReadableInstant) dateTime12);
        org.joda.time.DateTime.Property property27 = dateTime12.minuteOfHour();
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime2, (org.joda.time.ReadableInstant) dateTime12);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime(chronology29);
        org.joda.time.DateTime.Property property31 = dateTime30.yearOfEra();
        org.joda.time.Interval interval32 = property31.toInterval();
        org.joda.time.DateTime dateTime33 = interval32.getStart();
        org.joda.time.DateTime dateTime34 = dateTime33.toDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone35 = dateTime34.getZone();
        org.joda.time.DateTime dateTime37 = dateTime34.withWeekyear(86399);
        org.joda.time.Seconds seconds38 = org.joda.time.Seconds.secondsBetween((org.joda.time.ReadableInstant) dateTime2, (org.joda.time.ReadableInstant) dateTime34);
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 0);
        org.joda.time.DateTime dateTime41 = dateTime34.withZoneRetainFields(dateTimeZone40);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime2", (instant1.compareTo(dateTime2) == 0) == instant1.equals(dateTime2));
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2539");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime2 = instant1.toDateTime();
        org.joda.time.DateTime.Property property3 = dateTime2.era();
        org.joda.time.DateTime dateTime4 = dateTime2.withTimeAtStartOfDay();
        org.joda.time.Duration duration7 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.PeriodType periodType9 = null;
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration7, readableInstant8, periodType9);
        mutablePeriod10.setMonths((int) '4');
        org.joda.time.DateTime dateTime13 = dateTime2.plus((org.joda.time.ReadablePeriod) mutablePeriod10);
        org.joda.time.DateTime dateTime15 = dateTime2.minusWeeks((int) (byte) 1);
        org.joda.time.DateTime dateTime16 = dateTime15.toDateTimeISO();
        int int17 = dateTime16.getMonthOfYear();
        org.joda.time.DateTime dateTime18 = dateTime16.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime.Property property19 = dateTime16.centuryOfEra();
        org.joda.time.DateTime.Property property20 = dateTime16.weekOfWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime2", (instant1.compareTo(dateTime2) == 0) == instant1.equals(dateTime2));
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2540");
        java.lang.Object obj1 = null;
        org.joda.time.Instant instant2 = new org.joda.time.Instant(obj1);
        org.joda.time.DateTimeZone dateTimeZone3 = instant2.getZone();
        java.lang.String str4 = dateTimeZone3.toString();
        int int6 = dateTimeZone3.getOffset(1L);
        boolean boolean8 = dateTimeZone3.isStandardOffset(0L);
        java.lang.String str10 = dateTimeZone3.getNameKey((long) 1);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone3);
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((-1L), dateTimeZone3);
        org.joda.time.Period period14 = org.joda.time.Period.seconds((-1));
        org.joda.time.Period period16 = period14.minusMonths((int) (short) 10);
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.Duration duration18 = period16.toDurationTo(readableInstant17);
        org.joda.time.Duration duration21 = duration18.withDurationAdded((long) '#', 0);
        org.joda.time.Instant instant23 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.Instant instant25 = instant23.minus(100L);
        org.joda.time.MutableDateTime mutableDateTime26 = instant23.toMutableDateTimeISO();
        org.joda.time.PeriodType periodType27 = org.joda.time.PeriodType.minutes();
        org.joda.time.Period period28 = duration21.toPeriodFrom((org.joda.time.ReadableInstant) mutableDateTime26, periodType27);
        org.joda.time.Minutes minutes29 = duration21.toStandardMinutes();
        org.joda.time.DateTime dateTime30 = dateTime12.plus((org.joda.time.ReadableDuration) duration21);
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((java.lang.Object) dateTime12, dateTimeZone31);
        org.joda.time.format.PeriodPrinter periodPrinter34 = null;
        org.joda.time.format.PeriodParser periodParser35 = null;
        org.joda.time.format.PeriodFormatter periodFormatter36 = new org.joda.time.format.PeriodFormatter(periodPrinter34, periodParser35);
        org.joda.time.PeriodType periodType37 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.format.PeriodFormatter periodFormatter38 = periodFormatter36.withParseType(periodType37);
        java.util.Locale locale39 = periodFormatter36.getLocale();
        java.util.Locale locale40 = java.util.Locale.ITALY;
        java.lang.String str41 = locale40.getScript();
        org.joda.time.format.PeriodFormatter periodFormatter42 = periodFormatter36.withLocale(locale40);
        java.util.Locale locale43 = locale40.stripExtensions();
        java.lang.String str44 = dateTimeZone31.getShortName(43199999L, locale43);
        org.joda.time.DateTime dateTime45 = org.joda.time.DateTime.now(dateTimeZone31);
        java.lang.String str47 = dateTimeZone31.getShortName((long) 20);
        boolean boolean49 = dateTimeZone31.isStandardOffset((-95053551666421L));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant2 and dateTime45", (instant2.compareTo(dateTime45) == 0) == instant2.equals(dateTime45));
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2541");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime2 = instant1.toDateTime();
        boolean boolean4 = dateTime2.isEqual(10L);
        org.joda.time.DateTime dateTime6 = dateTime2.withCenturyOfEra((int) (byte) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateTimeField dateTimeField9 = dateTimeFieldType7.getField(chronology8);
        long long12 = dateTimeField9.add(0L, (long) (short) 1);
        long long15 = dateTimeField9.add(1L, (-1));
        int int16 = dateTime2.get(dateTimeField9);
        org.joda.time.Instant instant18 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime19 = instant18.toDateTime();
        org.joda.time.DateTime.Property property20 = dateTime19.era();
        org.joda.time.DateTime dateTime21 = dateTime19.withTimeAtStartOfDay();
        org.joda.time.Duration duration24 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.PeriodType periodType26 = null;
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration24, readableInstant25, periodType26);
        mutablePeriod27.setMonths((int) '4');
        org.joda.time.DateTime dateTime30 = dateTime19.plus((org.joda.time.ReadablePeriod) mutablePeriod27);
        org.joda.time.DateTime dateTime32 = dateTime19.minusWeeks((int) (byte) 1);
        long long33 = dateTime19.getMillis();
        org.joda.time.DurationFieldType durationFieldType34 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.Instant instant36 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime37 = instant36.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.DateTime dateTime39 = dateTime37.withZoneRetainFields(dateTimeZone38);
        org.joda.time.Instant instant41 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime42 = instant41.toDateTime();
        org.joda.time.DateTime.Property property43 = dateTime42.era();
        org.joda.time.DateTime dateTime44 = dateTime42.withTimeAtStartOfDay();
        org.joda.time.Duration duration47 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant48 = null;
        org.joda.time.PeriodType periodType49 = null;
        org.joda.time.MutablePeriod mutablePeriod50 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration47, readableInstant48, periodType49);
        mutablePeriod50.setMonths((int) '4');
        org.joda.time.DateTime dateTime53 = dateTime42.plus((org.joda.time.ReadablePeriod) mutablePeriod50);
        org.joda.time.DateTime dateTime55 = dateTime42.minusWeeks((int) (byte) 1);
        int int56 = dateTime39.compareTo((org.joda.time.ReadableInstant) dateTime42);
        org.joda.time.DateTime.Property property57 = dateTime42.minuteOfHour();
        org.joda.time.DateTime dateTime59 = dateTime42.withYear(1969);
        org.joda.time.Chronology chronology60 = dateTime59.getChronology();
        org.joda.time.DurationField durationField61 = durationFieldType34.getField(chronology60);
        org.joda.time.DateTime dateTime62 = dateTime19.toDateTime(chronology60);
        org.joda.time.DateTime dateTime63 = dateTime2.toDateTime(chronology60);
        org.joda.time.DateTimeField dateTimeField64 = chronology60.millisOfDay();
        org.joda.time.DateTimeField dateTimeField65 = chronology60.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField66 = chronology60.yearOfEra();
        int int68 = dateTimeField66.getMinimumValue((long) 25985711);
        int int69 = dateTimeField66.getMinimumValue();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime2", (instant1.compareTo(dateTime2) == 0) == instant1.equals(dateTime2));
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2542");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.Instant instant2 = instant1.toInstant();
        org.joda.time.Instant instant4 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime5 = instant4.toDateTime();
        org.joda.time.DateTime.Property property6 = dateTime5.era();
        org.joda.time.DateTime dateTime7 = dateTime5.withTimeAtStartOfDay();
        org.joda.time.Duration duration10 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration10, readableInstant11, periodType12);
        mutablePeriod13.setMonths((int) '4');
        org.joda.time.DateTime dateTime16 = dateTime5.plus((org.joda.time.ReadablePeriod) mutablePeriod13);
        org.joda.time.LocalDate localDate17 = dateTime5.toLocalDate();
        int int18 = instant1.compareTo((org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.DateTime.Property property19 = dateTime5.minuteOfDay();
        org.joda.time.Duration duration22 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.PeriodType periodType24 = null;
        org.joda.time.MutablePeriod mutablePeriod25 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration22, readableInstant23, periodType24);
        org.joda.time.Duration duration28 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.PeriodType periodType30 = null;
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration28, readableInstant29, periodType30);
        boolean boolean32 = duration22.isLongerThan((org.joda.time.ReadableDuration) duration28);
        org.joda.time.Duration duration35 = new org.joda.time.Duration((long) ' ', (long) ' ');
        org.joda.time.Period period36 = duration35.toPeriod();
        org.joda.time.Duration duration38 = duration35.plus((long) (byte) 0);
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.Period period40 = duration35.toPeriodTo(readableInstant39);
        org.joda.time.Duration duration42 = duration35.minus(43200000L);
        org.joda.time.Duration duration44 = duration28.withDurationAdded((org.joda.time.ReadableDuration) duration35, (int) ' ');
        org.joda.time.Period period45 = duration44.toPeriod();
        org.joda.time.Duration duration46 = duration44.toDuration();
        org.joda.time.DateTime dateTime47 = dateTime5.minus((org.joda.time.ReadableDuration) duration44);
        long long48 = duration44.getStandardDays();
        long long49 = duration44.getStandardDays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime5", (instant1.compareTo(dateTime5) == 0) == instant1.equals(dateTime5));
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2543");
        org.joda.time.Duration duration2 = new org.joda.time.Duration((long) ' ', (long) ' ');
        org.joda.time.Period period3 = duration2.toPeriod();
        org.joda.time.DurationFieldType[] durationFieldTypeArray4 = period3.getFieldTypes();
        org.joda.time.Period period6 = period3.minusYears((int) (byte) 1);
        org.joda.time.Period period8 = period3.plusMonths((int) (byte) 0);
        org.joda.time.Period period10 = period3.withMillis((int) '#');
        org.joda.time.Weeks weeks11 = period3.toStandardWeeks();
        org.joda.time.Weeks weeks12 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.Weeks weeks14 = weeks12.dividedBy((int) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType16 = weeks12.getFieldType(0);
        org.joda.time.Period period18 = period3.withField(durationFieldType16, 0);
        org.joda.time.Period period20 = period3.multipliedBy((int) '4');
        org.joda.time.Duration duration21 = period20.toStandardDuration();
        org.joda.time.Period period22 = duration21.toPeriod();
        long long23 = duration21.getStandardHours();
        long long24 = duration21.getMillis();
        org.joda.time.Instant instant26 = new org.joda.time.Instant((long) (short) 1);
        org.joda.time.Period period28 = org.joda.time.Period.weeks((int) (byte) 0);
        org.joda.time.Instant instant30 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime31 = instant30.toDateTime();
        org.joda.time.TimeOfDay timeOfDay32 = dateTime31.toTimeOfDay();
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime((java.lang.Object) dateTime31);
        org.joda.time.Duration duration34 = period28.toDurationFrom((org.joda.time.ReadableInstant) dateTime33);
        org.joda.time.Instant instant36 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime37 = instant36.toDateTime();
        boolean boolean39 = dateTime37.isEqual(10L);
        org.joda.time.DateTime dateTime41 = dateTime37.withWeekOfWeekyear(8);
        boolean boolean42 = duration34.equals((java.lang.Object) dateTime37);
        org.joda.time.Instant instant44 = instant26.withDurationAdded((org.joda.time.ReadableDuration) duration34, (-19045));
        org.joda.time.Period period45 = duration21.toPeriodTo((org.joda.time.ReadableInstant) instant26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant30 and dateTime31", (instant30.compareTo(dateTime31) == 0) == instant30.equals(dateTime31));
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2544");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime2 = instant1.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.withZoneRetainFields(dateTimeZone3);
        org.joda.time.Instant instant6 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime7 = instant6.toDateTime();
        org.joda.time.DateTime.Property property8 = dateTime7.era();
        org.joda.time.DateTime dateTime9 = dateTime7.withTimeAtStartOfDay();
        org.joda.time.Duration duration12 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.PeriodType periodType14 = null;
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration12, readableInstant13, periodType14);
        mutablePeriod15.setMonths((int) '4');
        org.joda.time.DateTime dateTime18 = dateTime7.plus((org.joda.time.ReadablePeriod) mutablePeriod15);
        org.joda.time.DateTime dateTime20 = dateTime7.minusWeeks((int) (byte) 1);
        int int21 = dateTime4.compareTo((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTime.Property property22 = dateTime7.minuteOfHour();
        org.joda.time.DateTime dateTime24 = dateTime7.withYear(1969);
        org.joda.time.Chronology chronology25 = dateTime24.getChronology();
        org.joda.time.DateTimeField dateTimeField26 = chronology25.year();
        org.joda.time.DateTimeField dateTimeField27 = chronology25.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField28 = chronology25.year();
        org.joda.time.DateTimeField dateTimeField29 = chronology25.year();
        long long32 = dateTimeField29.getDifferenceAsLong(4438800000L, 31536000000L);
        org.joda.time.Instant instant34 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime35 = instant34.toDateTime();
        org.joda.time.DateTime.Property property36 = dateTime35.era();
        org.joda.time.DateTime dateTime37 = dateTime35.withTimeAtStartOfDay();
        org.joda.time.Duration duration40 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant41 = null;
        org.joda.time.PeriodType periodType42 = null;
        org.joda.time.MutablePeriod mutablePeriod43 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration40, readableInstant41, periodType42);
        mutablePeriod43.setMonths((int) '4');
        org.joda.time.DateTime dateTime46 = dateTime35.plus((org.joda.time.ReadablePeriod) mutablePeriod43);
        org.joda.time.DateTime dateTime48 = dateTime35.minusWeeks((int) (byte) 1);
        org.joda.time.DateTime.Property property49 = dateTime48.monthOfYear();
        org.joda.time.DateTime.Property property50 = dateTime48.weekyear();
        org.joda.time.DateTime dateTime51 = dateTime48.toDateTime();
        int int52 = dateTime48.getSecondOfDay();
        org.joda.time.DateTime dateTime54 = dateTime48.minus((long) (short) 100);
        org.joda.time.TimeOfDay timeOfDay55 = dateTime48.toTimeOfDay();
        java.util.Locale.Builder builder57 = new java.util.Locale.Builder();
        java.lang.Object obj58 = null;
        org.joda.time.Instant instant59 = new org.joda.time.Instant(obj58);
        org.joda.time.DateTimeZone dateTimeZone60 = instant59.getZone();
        java.lang.String str61 = dateTimeZone60.toString();
        org.joda.time.DateTime dateTime62 = new org.joda.time.DateTime(dateTimeZone60);
        java.util.Locale locale64 = java.util.Locale.JAPANESE;
        java.lang.String str65 = locale64.getDisplayScript();
        java.lang.String str66 = dateTimeZone60.getShortName(100L, locale64);
        java.lang.String str67 = locale64.getScript();
        java.util.Locale locale68 = java.util.Locale.ENGLISH;
        java.util.Set<java.lang.Character> charSet69 = locale68.getExtensionKeys();
        java.lang.String str70 = locale64.getDisplayVariant(locale68);
        java.util.Locale.Builder builder71 = builder57.setLocale(locale68);
        java.lang.String str72 = dateTimeField29.getAsText((org.joda.time.ReadablePartial) timeOfDay55, 26033472, locale68);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime2", (instant1.compareTo(dateTime2) == 0) == instant1.equals(dateTime2));
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2545");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime.Property property2 = dateTime1.yearOfEra();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(chronology4);
        org.joda.time.DateTime.Property property6 = dateTime5.yearOfEra();
        org.joda.time.Interval interval7 = property6.toInterval();
        boolean boolean8 = interval3.contains((org.joda.time.ReadableInterval) interval7);
        java.lang.Object obj9 = null;
        org.joda.time.Instant instant10 = new org.joda.time.Instant(obj9);
        org.joda.time.DateTimeZone dateTimeZone11 = instant10.getZone();
        java.lang.String str12 = dateTimeZone11.toString();
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(dateTimeZone11);
        boolean boolean14 = interval3.contains((org.joda.time.ReadableInstant) dateTime13);
        org.joda.time.Instant instant16 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime17 = instant16.toDateTime();
        org.joda.time.DateTime.Property property18 = dateTime17.era();
        boolean boolean19 = interval3.contains((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.MutableInterval mutableInterval20 = interval3.toMutableInterval();
        org.joda.time.Duration duration23 = new org.joda.time.Duration((long) ' ', (long) ' ');
        org.joda.time.Period period24 = duration23.toPeriod();
        org.joda.time.Duration duration26 = duration23.plus((long) (byte) 0);
        org.joda.time.Instant instant28 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime29 = instant28.toDateTime();
        boolean boolean31 = dateTime29.isEqual(10L);
        org.joda.time.PeriodType periodType34 = org.joda.time.PeriodType.yearDay();
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.MutablePeriod mutablePeriod36 = new org.joda.time.MutablePeriod((long) 100, 0L, periodType34, chronology35);
        org.joda.time.PeriodType periodType37 = periodType34.withWeeksRemoved();
        org.joda.time.MutablePeriod mutablePeriod38 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration26, (org.joda.time.ReadableInstant) dateTime29, periodType37);
        org.joda.time.Instant instant40 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime41 = instant40.toDateTime();
        org.joda.time.DateTime.Property property42 = dateTime41.era();
        org.joda.time.DateTime dateTime43 = dateTime41.withTimeAtStartOfDay();
        org.joda.time.Instant instant44 = dateTime41.toInstant();
        org.joda.time.DateTime dateTime46 = dateTime41.withMillis((long) '4');
        org.joda.time.Minutes minutes47 = org.joda.time.Minutes.minutesBetween((org.joda.time.ReadableInstant) dateTime29, (org.joda.time.ReadableInstant) dateTime41);
        org.joda.time.Instant instant49 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime50 = instant49.toDateTime();
        org.joda.time.TimeOfDay timeOfDay51 = dateTime50.toTimeOfDay();
        org.joda.time.DateTime dateTime52 = dateTime41.withFields((org.joda.time.ReadablePartial) timeOfDay51);
        org.joda.time.DateTime.Property property53 = dateTime52.millisOfSecond();
        org.joda.time.DateTime dateTime54 = property53.withMinimumValue();
        org.joda.time.DateTime dateTime57 = dateTime54.withDurationAdded(1970L, 1969);
        boolean boolean58 = interval3.isBefore((org.joda.time.ReadableInstant) dateTime57);
        long long59 = interval3.toDurationMillis();
        org.joda.time.Interval interval60 = interval3.toInterval();
        org.joda.time.Chronology chronology61 = interval3.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant10", (dateTime1.compareTo(instant10) == 0) == dateTime1.equals(instant10));
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2546");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime2 = instant1.toDateTime();
        org.joda.time.DateTime.Property property3 = dateTime2.era();
        org.joda.time.DateTime dateTime4 = dateTime2.withTimeAtStartOfDay();
        org.joda.time.Duration duration7 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.PeriodType periodType9 = null;
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration7, readableInstant8, periodType9);
        mutablePeriod10.setMonths((int) '4');
        org.joda.time.DateTime dateTime13 = dateTime2.plus((org.joda.time.ReadablePeriod) mutablePeriod10);
        org.joda.time.LocalDate localDate14 = dateTime2.toLocalDate();
        org.joda.time.DateTime dateTime16 = dateTime2.plusSeconds(248400000);
        org.joda.time.DateTime.Property property17 = dateTime16.year();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime2", (instant1.compareTo(dateTime2) == 0) == instant1.equals(dateTime2));
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2547");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime.Property property2 = dateTime1.yearOfEra();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(chronology4);
        org.joda.time.DateTime.Property property6 = dateTime5.yearOfEra();
        org.joda.time.Interval interval7 = property6.toInterval();
        boolean boolean8 = interval3.contains((org.joda.time.ReadableInterval) interval7);
        org.joda.time.Chronology chronology9 = interval7.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.weeks();
        org.joda.time.DateTimeField dateTimeField11 = chronology9.minuteOfHour();
        org.joda.time.Instant instant13 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime14 = instant13.toDateTime();
        org.joda.time.TimeOfDay timeOfDay15 = dateTime14.toTimeOfDay();
        int int16 = dateTimeField11.getMinimumValue((org.joda.time.ReadablePartial) timeOfDay15);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(chronology17);
        org.joda.time.DateTime.Property property19 = dateTime18.yearOfEra();
        org.joda.time.Interval interval20 = property19.toInterval();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime(chronology21);
        org.joda.time.DateTime.Property property23 = dateTime22.yearOfEra();
        org.joda.time.Interval interval24 = property23.toInterval();
        boolean boolean25 = interval20.contains((org.joda.time.ReadableInterval) interval24);
        org.joda.time.Chronology chronology26 = interval24.getChronology();
        org.joda.time.DurationField durationField27 = chronology26.weeks();
        org.joda.time.DateTimeField dateTimeField28 = chronology26.minuteOfHour();
        org.joda.time.Instant instant30 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime31 = instant30.toDateTime();
        org.joda.time.TimeOfDay timeOfDay32 = dateTime31.toTimeOfDay();
        int int33 = dateTimeField28.getMinimumValue((org.joda.time.ReadablePartial) timeOfDay32);
        org.joda.time.Instant instant35 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime36 = instant35.toDateTime();
        boolean boolean38 = dateTime36.isEqual(10L);
        org.joda.time.DateTime dateTime40 = dateTime36.withWeekOfWeekyear(8);
        org.joda.time.DateTime dateTime42 = dateTime36.plusDays(100);
        org.joda.time.LocalTime localTime43 = dateTime36.toLocalTime();
        org.joda.time.Seconds seconds44 = org.joda.time.Seconds.secondsBetween((org.joda.time.ReadablePartial) timeOfDay32, (org.joda.time.ReadablePartial) localTime43);
        int int45 = dateTimeField11.getMinimumValue((org.joda.time.ReadablePartial) timeOfDay32);
        org.joda.time.DateTimeFieldType dateTimeFieldType47 = timeOfDay32.getFieldType(3);
        org.joda.time.Duration duration50 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.Seconds seconds51 = duration50.toStandardSeconds();
        org.joda.time.ReadableDuration readableDuration52 = null;
        boolean boolean53 = duration50.isEqual(readableDuration52);
        org.joda.time.Duration duration55 = duration50.minus((long) 1);
        org.joda.time.Duration duration57 = duration55.minus((long) '4');
        org.joda.time.Instant instant59 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime60 = instant59.toDateTime();
        org.joda.time.DateTime.Property property61 = dateTime60.era();
        org.joda.time.Duration duration64 = new org.joda.time.Duration((long) 0, (long) (byte) 100);
        org.joda.time.Duration duration67 = new org.joda.time.Duration((long) ' ', (long) ' ');
        org.joda.time.Period period68 = duration67.toPeriod();
        org.joda.time.Duration duration70 = duration67.plus((long) (byte) 0);
        org.joda.time.Instant instant72 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime73 = instant72.toDateTime();
        boolean boolean75 = dateTime73.isEqual(10L);
        org.joda.time.PeriodType periodType78 = org.joda.time.PeriodType.yearDay();
        org.joda.time.Chronology chronology79 = null;
        org.joda.time.MutablePeriod mutablePeriod80 = new org.joda.time.MutablePeriod((long) 100, 0L, periodType78, chronology79);
        org.joda.time.PeriodType periodType81 = periodType78.withWeeksRemoved();
        org.joda.time.MutablePeriod mutablePeriod82 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration70, (org.joda.time.ReadableInstant) dateTime73, periodType81);
        org.joda.time.Period period83 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime60, (org.joda.time.ReadableDuration) duration64, periodType81);
        org.joda.time.PeriodType periodType84 = org.joda.time.PeriodType.dayTime();
        org.joda.time.Period period85 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration55, (org.joda.time.ReadableInstant) dateTime60, periodType84);
        org.joda.time.TimeOfDay timeOfDay86 = dateTime60.toTimeOfDay();
        org.joda.time.ReadableInstant readableInstant87 = null;
        org.joda.time.DateTime dateTime88 = timeOfDay86.toDateTime(readableInstant87);
        org.joda.time.Instant instant90 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.Instant instant92 = instant90.minus(100L);
        org.joda.time.MutableDateTime mutableDateTime93 = instant90.toMutableDateTimeISO();
        org.joda.time.DateTime dateTime94 = timeOfDay86.toDateTime((org.joda.time.ReadableInstant) instant90);
        org.joda.time.DateTimeField dateTimeField96 = timeOfDay86.getField(2);
        org.joda.time.Seconds seconds97 = org.joda.time.Seconds.secondsBetween((org.joda.time.ReadablePartial) timeOfDay32, (org.joda.time.ReadablePartial) timeOfDay86);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant13 and dateTime14", (instant13.compareTo(dateTime14) == 0) == instant13.equals(dateTime14));
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2548");
        org.joda.time.Duration duration2 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration2, readableInstant3, periodType4);
        org.joda.time.Days days6 = org.joda.time.Days.THREE;
        org.joda.time.DurationFieldType durationFieldType7 = org.joda.time.DurationFieldType.minutes();
        int int8 = days6.get(durationFieldType7);
        mutablePeriod5.add(durationFieldType7, 8);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        mutablePeriod5.add(readablePeriod11);
        int int13 = mutablePeriod5.getMillis();
        org.joda.time.Chronology chronology15 = null;
        mutablePeriod5.add((long) 8, chronology15);
        mutablePeriod5.setMillis(1439);
        org.joda.time.ReadableDuration readableDuration19 = null;
        org.joda.time.Instant instant21 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.Instant instant23 = instant21.minus(100L);
        org.joda.time.MutableDateTime mutableDateTime24 = instant21.toMutableDateTimeISO();
        java.lang.Object obj25 = null;
        org.joda.time.Instant instant26 = new org.joda.time.Instant(obj25);
        boolean boolean27 = mutableDateTime24.isAfter((org.joda.time.ReadableInstant) instant26);
        org.joda.time.PeriodType periodType30 = org.joda.time.PeriodType.yearDay();
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod((long) 100, 0L, periodType30, chronology31);
        org.joda.time.PeriodType periodType33 = periodType30.withWeeksRemoved();
        org.joda.time.PeriodType periodType34 = periodType33.withSecondsRemoved();
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod(readableDuration19, (org.joda.time.ReadableInstant) instant26, periodType33);
        org.joda.time.Duration duration38 = new org.joda.time.Duration((long) ' ', (long) ' ');
        org.joda.time.Period period39 = duration38.toPeriod();
        org.joda.time.DurationFieldType[] durationFieldTypeArray40 = period39.getFieldTypes();
        org.joda.time.Period period42 = period39.minusYears((int) (byte) 1);
        org.joda.time.Period period44 = period39.plusMonths((int) (byte) 0);
        int int45 = period39.size();
        org.joda.time.Period period47 = period39.plusYears(100);
        org.joda.time.Period period49 = period39.minusSeconds(292278993);
        org.joda.time.Duration duration52 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant53 = null;
        org.joda.time.PeriodType periodType54 = null;
        org.joda.time.MutablePeriod mutablePeriod55 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration52, readableInstant53, periodType54);
        mutablePeriod55.addDays((int) (short) 100);
        org.joda.time.DurationFieldType durationFieldType58 = org.joda.time.DurationFieldType.days();
        mutablePeriod55.add(durationFieldType58, 8);
        boolean boolean61 = period39.isSupported(durationFieldType58);
        org.joda.time.Chronology chronology62 = null;
        boolean boolean63 = durationFieldType58.isSupported(chronology62);
        boolean boolean64 = periodType33.isSupported(durationFieldType58);
        mutablePeriod5.add(durationFieldType58, 1);
        mutablePeriod5.setYears(23);
        mutablePeriod5.addMillis((-41297762));
        mutablePeriod5.addSeconds((-38709));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant21 and mutableDateTime24", (instant21.compareTo(mutableDateTime24) == 0) == instant21.equals(mutableDateTime24));
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2549");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime2 = instant1.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.withZoneRetainFields(dateTimeZone3);
        org.joda.time.Instant instant6 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime7 = instant6.toDateTime();
        org.joda.time.DateTime.Property property8 = dateTime7.era();
        org.joda.time.DateTime dateTime9 = dateTime7.withTimeAtStartOfDay();
        org.joda.time.Duration duration12 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.PeriodType periodType14 = null;
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration12, readableInstant13, periodType14);
        mutablePeriod15.setMonths((int) '4');
        org.joda.time.DateTime dateTime18 = dateTime7.plus((org.joda.time.ReadablePeriod) mutablePeriod15);
        org.joda.time.DateTime dateTime20 = dateTime7.minusWeeks((int) (byte) 1);
        int int21 = dateTime4.compareTo((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTime.Property property22 = dateTime7.minuteOfHour();
        org.joda.time.DateTime dateTime24 = dateTime7.withYear(1969);
        org.joda.time.Chronology chronology25 = dateTime24.getChronology();
        org.joda.time.DateTimeField dateTimeField26 = chronology25.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField27 = chronology25.monthOfYear();
        org.joda.time.DurationField durationField28 = chronology25.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime2", (instant1.compareTo(dateTime2) == 0) == instant1.equals(dateTime2));
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2550");
        org.joda.time.Duration duration2 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration2, readableInstant3, periodType4);
        mutablePeriod5.setMonths((int) '4');
        org.joda.time.Period period8 = mutablePeriod5.toPeriod();
        org.joda.time.ReadableInterval readableInterval9 = null;
        mutablePeriod5.setPeriod(readableInterval9);
        mutablePeriod5.setWeeks(69);
        mutablePeriod5.addDays((int) 'x');
        mutablePeriod5.setYears((int) (short) 100);
        mutablePeriod5.clear();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime(chronology18);
        org.joda.time.DateTime.Property property20 = dateTime19.yearOfEra();
        org.joda.time.Interval interval21 = property20.toInterval();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime(chronology22);
        org.joda.time.DateTime.Property property24 = dateTime23.yearOfEra();
        org.joda.time.Interval interval25 = property24.toInterval();
        boolean boolean26 = interval21.contains((org.joda.time.ReadableInterval) interval25);
        java.lang.String str27 = interval21.toString();
        long long28 = interval21.getEndMillis();
        org.joda.time.Minutes minutes29 = org.joda.time.Minutes.minutesIn((org.joda.time.ReadableInterval) interval21);
        org.joda.time.Instant instant31 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime32 = instant31.toDateTime();
        org.joda.time.DateTime.Property property33 = dateTime32.era();
        int int34 = dateTime32.getWeekOfWeekyear();
        int int35 = dateTime32.getMonthOfYear();
        boolean boolean36 = interval21.isBefore((org.joda.time.ReadableInstant) dateTime32);
        org.joda.time.DateTime dateTime37 = interval21.getStart();
        org.joda.time.Duration duration38 = interval21.toDuration();
        mutablePeriod5.setPeriod((org.joda.time.ReadableInterval) interval21);
        org.joda.time.MutablePeriod mutablePeriod40 = mutablePeriod5.toMutablePeriod();
        mutablePeriod40.addMillis(411);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant31 and dateTime32", (instant31.compareTo(dateTime32) == 0) == instant31.equals(dateTime32));
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2551");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime2 = instant1.toDateTime();
        org.joda.time.DateTime.Property property3 = dateTime2.era();
        org.joda.time.DateTime dateTime4 = dateTime2.withTimeAtStartOfDay();
        org.joda.time.Duration duration7 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.PeriodType periodType9 = null;
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration7, readableInstant8, periodType9);
        mutablePeriod10.setMonths((int) '4');
        org.joda.time.DateTime dateTime13 = dateTime2.plus((org.joda.time.ReadablePeriod) mutablePeriod10);
        java.lang.Object obj14 = null;
        org.joda.time.Instant instant15 = new org.joda.time.Instant(obj14);
        org.joda.time.DateTimeZone dateTimeZone16 = instant15.getZone();
        java.lang.String str17 = dateTimeZone16.toString();
        int int19 = dateTimeZone16.getOffset(1L);
        boolean boolean21 = dateTimeZone16.isStandardOffset(0L);
        org.joda.time.DateTime dateTime22 = dateTime2.withZoneRetainFields(dateTimeZone16);
        org.joda.time.DateTime dateTime24 = dateTime22.plusYears(1969);
        org.joda.time.DateTime dateTime26 = dateTime24.minusWeeks(1439);
        org.joda.time.Instant instant28 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime29 = instant28.toDateTime();
        org.joda.time.DateTime.Property property30 = dateTime29.era();
        org.joda.time.DateTime dateTime31 = dateTime29.withTimeAtStartOfDay();
        org.joda.time.Duration duration34 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.PeriodType periodType36 = null;
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration34, readableInstant35, periodType36);
        mutablePeriod37.setMonths((int) '4');
        org.joda.time.DateTime dateTime40 = dateTime29.plus((org.joda.time.ReadablePeriod) mutablePeriod37);
        org.joda.time.LocalDate localDate41 = dateTime29.toLocalDate();
        int int42 = localDate41.size();
        org.joda.time.DateTime dateTime43 = dateTime26.withFields((org.joda.time.ReadablePartial) localDate41);
        org.joda.time.Duration duration46 = new org.joda.time.Duration((long) ' ', (long) ' ');
        org.joda.time.Period period47 = duration46.toPeriod();
        org.joda.time.Duration duration49 = duration46.plus((long) (byte) 0);
        org.joda.time.ReadableInstant readableInstant50 = null;
        org.joda.time.Period period51 = duration46.toPeriodTo(readableInstant50);
        org.joda.time.Duration duration53 = duration46.minus(43200000L);
        org.joda.time.DateTime dateTime54 = dateTime26.plus((org.joda.time.ReadableDuration) duration53);
        org.joda.time.DateTimeFieldType dateTimeFieldType55 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.Chronology chronology56 = null;
        org.joda.time.DateTimeField dateTimeField57 = dateTimeFieldType55.getField(chronology56);
        long long60 = dateTimeField57.add(0L, (long) (short) 1);
        long long62 = dateTimeField57.roundHalfCeiling((long) 2);
        org.joda.time.DurationField durationField63 = dateTimeField57.getDurationField();
        long long66 = durationField63.getMillis(0, (long) 4);
        long long68 = durationField63.getMillis((int) '#');
        long long70 = durationField63.getMillis(1);
        long long73 = durationField63.subtract((long) (-59), (long) 11);
        boolean boolean74 = durationField63.isSupported();
        boolean boolean75 = duration53.equals((java.lang.Object) boolean74);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime2", (instant1.compareTo(dateTime2) == 0) == instant1.equals(dateTime2));
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2552");
        org.joda.time.Duration duration3 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration3, readableInstant4, periodType5);
        org.joda.time.Days days7 = org.joda.time.Days.THREE;
        org.joda.time.DurationFieldType durationFieldType8 = org.joda.time.DurationFieldType.minutes();
        int int9 = days7.get(durationFieldType8);
        mutablePeriod6.add(durationFieldType8, 8);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        mutablePeriod6.add(readablePeriod12);
        int int14 = mutablePeriod6.getMonths();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(chronology15);
        org.joda.time.DateTime.Property property17 = dateTime16.yearOfEra();
        org.joda.time.Interval interval18 = property17.toInterval();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime(chronology19);
        org.joda.time.DateTime.Property property21 = dateTime20.yearOfEra();
        org.joda.time.Interval interval22 = property21.toInterval();
        boolean boolean23 = interval18.contains((org.joda.time.ReadableInterval) interval22);
        mutablePeriod6.setPeriod((org.joda.time.ReadableInterval) interval18);
        org.joda.time.DurationFieldType durationFieldType26 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.Instant instant28 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime29 = instant28.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.DateTime dateTime31 = dateTime29.withZoneRetainFields(dateTimeZone30);
        org.joda.time.Instant instant33 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime34 = instant33.toDateTime();
        org.joda.time.DateTime.Property property35 = dateTime34.era();
        org.joda.time.DateTime dateTime36 = dateTime34.withTimeAtStartOfDay();
        org.joda.time.Duration duration39 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.PeriodType periodType41 = null;
        org.joda.time.MutablePeriod mutablePeriod42 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration39, readableInstant40, periodType41);
        mutablePeriod42.setMonths((int) '4');
        org.joda.time.DateTime dateTime45 = dateTime34.plus((org.joda.time.ReadablePeriod) mutablePeriod42);
        org.joda.time.DateTime dateTime47 = dateTime34.minusWeeks((int) (byte) 1);
        int int48 = dateTime31.compareTo((org.joda.time.ReadableInstant) dateTime34);
        org.joda.time.DateTime.Property property49 = dateTime34.minuteOfHour();
        org.joda.time.DateTime dateTime51 = dateTime34.withYear(1969);
        org.joda.time.Chronology chronology52 = dateTime51.getChronology();
        org.joda.time.DurationField durationField53 = durationFieldType26.getField(chronology52);
        mutablePeriod6.add((-43199999L), chronology52);
        org.joda.time.DurationField durationField55 = chronology52.millis();
        org.joda.time.DurationField durationField56 = chronology52.months();
        org.joda.time.DateTime dateTime57 = new org.joda.time.DateTime((long) 69, chronology52);
        org.joda.time.DurationField durationField58 = chronology52.seconds();
        long long61 = durationField58.add(62613000L, (-20));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant28 and dateTime29", (instant28.compareTo(dateTime29) == 0) == instant28.equals(dateTime29));
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2553");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime2 = instant1.toDateTime();
        org.joda.time.DateTime.Property property3 = dateTime2.era();
        org.joda.time.DateTime dateTime4 = property3.withMaximumValue();
        org.joda.time.Instant instant5 = dateTime4.toInstant();
        org.joda.time.DateTime dateTime7 = dateTime4.minusYears(1970);
        int int8 = dateTime7.getYearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime2", (instant1.compareTo(dateTime2) == 0) == instant1.equals(dateTime2));
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2554");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime2 = instant1.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.withZoneRetainFields(dateTimeZone3);
        org.joda.time.Instant instant6 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime7 = instant6.toDateTime();
        org.joda.time.DateTime.Property property8 = dateTime7.era();
        org.joda.time.DateTime dateTime9 = dateTime7.withTimeAtStartOfDay();
        org.joda.time.Duration duration12 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.PeriodType periodType14 = null;
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration12, readableInstant13, periodType14);
        mutablePeriod15.setMonths((int) '4');
        org.joda.time.DateTime dateTime18 = dateTime7.plus((org.joda.time.ReadablePeriod) mutablePeriod15);
        org.joda.time.DateTime dateTime20 = dateTime7.minusWeeks((int) (byte) 1);
        int int21 = dateTime4.compareTo((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTime dateTime22 = dateTime4.toDateTimeISO();
        org.joda.time.Duration duration25 = new org.joda.time.Duration((long) ' ', (long) ' ');
        org.joda.time.Period period26 = duration25.toPeriod();
        org.joda.time.Duration duration28 = duration25.plus((long) (byte) 0);
        org.joda.time.Period period29 = duration28.toPeriod();
        org.joda.time.Period period31 = period29.plusSeconds((int) (short) 0);
        org.joda.time.DateTime dateTime32 = dateTime4.plus((org.joda.time.ReadablePeriod) period31);
        org.joda.time.Duration duration35 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.Period period37 = duration35.toPeriod(chronology36);
        org.joda.time.Period period39 = org.joda.time.Period.seconds((-1));
        org.joda.time.Period period41 = period39.minusMonths((int) (short) 10);
        org.joda.time.ReadableInstant readableInstant42 = null;
        org.joda.time.Duration duration43 = period41.toDurationTo(readableInstant42);
        org.joda.time.Duration duration44 = duration35.minus((org.joda.time.ReadableDuration) duration43);
        org.joda.time.PeriodType periodType49 = org.joda.time.PeriodType.yearDay();
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.MutablePeriod mutablePeriod51 = new org.joda.time.MutablePeriod((long) 100, 0L, periodType49, chronology50);
        org.joda.time.Period period52 = new org.joda.time.Period((long) 11, 0L, periodType49);
        java.lang.String str53 = periodType49.getName();
        org.joda.time.PeriodType periodType54 = periodType49.withMonthsRemoved();
        org.joda.time.PeriodType periodType55 = periodType49.withDaysRemoved();
        org.joda.time.Period period56 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime4, (org.joda.time.ReadableDuration) duration35, periodType55);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime4", (instant1.compareTo(dateTime4) == 0) == instant1.equals(dateTime4));
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2555");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime2 = instant1.toDateTime();
        org.joda.time.DateTime.Property property3 = dateTime2.era();
        org.joda.time.DateTime dateTime4 = dateTime2.withTimeAtStartOfDay();
        org.joda.time.Instant instant5 = dateTime2.toInstant();
        org.joda.time.TimeOfDay timeOfDay6 = dateTime2.toTimeOfDay();
        org.joda.time.Instant instant8 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime9 = instant8.toDateTime();
        org.joda.time.DateTime.Property property10 = dateTime9.era();
        org.joda.time.DateTime dateTime11 = dateTime9.withTimeAtStartOfDay();
        org.joda.time.Instant instant12 = dateTime9.toInstant();
        org.joda.time.DateMidnight dateMidnight13 = dateTime9.toDateMidnight();
        org.joda.time.DateTime dateTime16 = dateTime9.withDurationAdded(0L, (int) 'a');
        org.joda.time.Seconds seconds17 = org.joda.time.Seconds.secondsBetween((org.joda.time.ReadableInstant) dateTime2, (org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateTime.Property property18 = dateTime2.year();
        org.joda.time.DateTime.Property property19 = dateTime2.yearOfCentury();
        org.joda.time.DateTime dateTime20 = property19.roundFloorCopy();
        org.joda.time.format.PeriodPrinter periodPrinter21 = null;
        org.joda.time.format.PeriodParser periodParser22 = null;
        org.joda.time.format.PeriodFormatter periodFormatter23 = new org.joda.time.format.PeriodFormatter(periodPrinter21, periodParser22);
        org.joda.time.PeriodType periodType24 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType25 = periodType24.withMinutesRemoved();
        org.joda.time.format.PeriodFormatter periodFormatter26 = periodFormatter23.withParseType(periodType24);
        java.util.Locale locale27 = null;
        org.joda.time.format.PeriodFormatter periodFormatter28 = periodFormatter23.withLocale(locale27);
        org.joda.time.format.PeriodPrinter periodPrinter29 = periodFormatter23.getPrinter();
        java.util.Locale locale30 = java.util.Locale.CANADA;
        java.util.Locale locale34 = new java.util.Locale("1969-12-31T23:59:59.899Z", "P0W", "hourOfHalfday");
        java.lang.String str35 = locale30.getDisplayVariant(locale34);
        org.joda.time.format.PeriodFormatter periodFormatter36 = periodFormatter23.withLocale(locale34);
        int int37 = property19.getMaximumShortTextLength(locale34);
        java.util.Locale.setDefault(locale34);
        java.lang.String str40 = locale34.getExtension('a');
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime2", (instant1.compareTo(dateTime2) == 0) == instant1.equals(dateTime2));
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2556");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime2 = instant1.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.withZoneRetainFields(dateTimeZone3);
        org.joda.time.Instant instant6 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime7 = instant6.toDateTime();
        org.joda.time.DateTime.Property property8 = dateTime7.era();
        org.joda.time.DateTime dateTime9 = dateTime7.withTimeAtStartOfDay();
        org.joda.time.Duration duration12 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.PeriodType periodType14 = null;
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration12, readableInstant13, periodType14);
        mutablePeriod15.setMonths((int) '4');
        org.joda.time.DateTime dateTime18 = dateTime7.plus((org.joda.time.ReadablePeriod) mutablePeriod15);
        org.joda.time.DateTime dateTime20 = dateTime7.minusWeeks((int) (byte) 1);
        int int21 = dateTime4.compareTo((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTime.Property property22 = dateTime4.minuteOfDay();
        org.joda.time.DateTime dateTime23 = property22.withMaximumValue();
        org.joda.time.DateTime dateTime24 = property22.withMinimumValue();
        org.joda.time.Instant instant28 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime29 = instant28.toDateTime();
        org.joda.time.DateTime.Property property30 = dateTime29.era();
        org.joda.time.Instant instant32 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.Instant instant34 = instant32.minus(100L);
        org.joda.time.Instant instant36 = instant34.plus((long) 100);
        org.joda.time.Instant instant38 = instant34.withMillis((long) (byte) 1);
        org.joda.time.Minutes minutes39 = org.joda.time.Minutes.minutesBetween((org.joda.time.ReadableInstant) dateTime29, (org.joda.time.ReadableInstant) instant34);
        org.joda.time.LocalTime localTime40 = dateTime29.toLocalTime();
        org.joda.time.Chronology chronology41 = localTime40.getChronology();
        org.joda.time.MutablePeriod mutablePeriod42 = new org.joda.time.MutablePeriod(2678400000L, 720070L, chronology41);
        org.joda.time.DateTimeField dateTimeField43 = chronology41.hourOfHalfday();
        org.joda.time.DateTime dateTime44 = dateTime24.withChronology(chronology41);
        int int45 = dateTime24.getMillisOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime2", (instant1.compareTo(dateTime2) == 0) == instant1.equals(dateTime2));
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2557");
        org.joda.time.Duration duration1 = new org.joda.time.Duration(432000000L);
        java.lang.String str2 = duration1.toString();
        org.joda.time.Instant instant4 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime5 = instant4.toDateTime();
        org.joda.time.DateTime.Property property6 = dateTime5.era();
        org.joda.time.DateTime dateTime7 = dateTime5.withTimeAtStartOfDay();
        org.joda.time.Duration duration10 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration10, readableInstant11, periodType12);
        mutablePeriod13.setMonths((int) '4');
        org.joda.time.DateTime dateTime16 = dateTime5.plus((org.joda.time.ReadablePeriod) mutablePeriod13);
        java.lang.Object obj17 = null;
        org.joda.time.Instant instant18 = new org.joda.time.Instant(obj17);
        org.joda.time.DateTimeZone dateTimeZone19 = instant18.getZone();
        java.lang.String str20 = dateTimeZone19.toString();
        int int22 = dateTimeZone19.getOffset(1L);
        boolean boolean24 = dateTimeZone19.isStandardOffset(0L);
        org.joda.time.DateTime dateTime25 = dateTime5.withZoneRetainFields(dateTimeZone19);
        org.joda.time.DateTime dateTime27 = dateTime25.plusYears(1969);
        org.joda.time.PeriodType periodType32 = org.joda.time.PeriodType.yearDay();
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod((long) 100, 0L, periodType32, chronology33);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.MutablePeriod mutablePeriod36 = new org.joda.time.MutablePeriod(1L, (long) 10, periodType32, chronology35);
        org.joda.time.PeriodType periodType37 = periodType32.withDaysRemoved();
        org.joda.time.Period period38 = duration1.toPeriodTo((org.joda.time.ReadableInstant) dateTime27, periodType32);
        org.joda.time.Instant instant40 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime41 = instant40.toDateTime();
        org.joda.time.DateTime.Property property42 = dateTime41.era();
        org.joda.time.DateTime dateTime43 = dateTime41.withTimeAtStartOfDay();
        org.joda.time.Instant instant44 = dateTime41.toInstant();
        org.joda.time.DateTime dateTime46 = dateTime41.withMillis((long) '4');
        org.joda.time.PeriodType periodType47 = org.joda.time.PeriodType.standard();
        org.joda.time.Period period48 = duration1.toPeriodTo((org.joda.time.ReadableInstant) dateTime41, periodType47);
        org.joda.time.DateTimeFieldType dateTimeFieldType49 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        org.joda.time.DurationFieldType durationFieldType50 = dateTimeFieldType49.getRangeDurationType();
        boolean boolean51 = dateTime41.isSupported(dateTimeFieldType49);
        org.joda.time.PeriodType periodType52 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType53 = periodType52.withMonthsRemoved();
        org.joda.time.PeriodType periodType54 = periodType53.withMinutesRemoved();
        org.joda.time.DateTimeFieldType dateTimeFieldType55 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.Chronology chronology56 = null;
        org.joda.time.DateTimeField dateTimeField57 = dateTimeFieldType55.getField(chronology56);
        org.joda.time.DurationFieldType durationFieldType58 = dateTimeFieldType55.getRangeDurationType();
        org.joda.time.DurationFieldType durationFieldType59 = dateTimeFieldType55.getRangeDurationType();
        int int60 = periodType54.indexOf(durationFieldType59);
        org.joda.time.Instant instant62 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime63 = instant62.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone64 = null;
        org.joda.time.DateTime dateTime65 = dateTime63.withZoneRetainFields(dateTimeZone64);
        org.joda.time.Instant instant67 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime68 = instant67.toDateTime();
        org.joda.time.DateTime.Property property69 = dateTime68.era();
        org.joda.time.DateTime dateTime70 = dateTime68.withTimeAtStartOfDay();
        org.joda.time.Duration duration73 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant74 = null;
        org.joda.time.PeriodType periodType75 = null;
        org.joda.time.MutablePeriod mutablePeriod76 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration73, readableInstant74, periodType75);
        mutablePeriod76.setMonths((int) '4');
        org.joda.time.DateTime dateTime79 = dateTime68.plus((org.joda.time.ReadablePeriod) mutablePeriod76);
        org.joda.time.DateTime dateTime81 = dateTime68.minusWeeks((int) (byte) 1);
        int int82 = dateTime65.compareTo((org.joda.time.ReadableInstant) dateTime68);
        org.joda.time.DateTime.Property property83 = dateTime68.minuteOfHour();
        org.joda.time.DateTime dateTime85 = dateTime68.withYear(1969);
        org.joda.time.Chronology chronology86 = dateTime85.getChronology();
        org.joda.time.DateTimeField dateTimeField87 = chronology86.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField88 = chronology86.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField89 = chronology86.weekOfWeekyear();
        boolean boolean90 = durationFieldType59.isSupported(chronology86);
        boolean boolean91 = dateTimeFieldType49.isSupported(chronology86);
        org.joda.time.DateTimeField dateTimeField92 = chronology86.minuteOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant4 and dateTime5", (instant4.compareTo(dateTime5) == 0) == instant4.equals(dateTime5));
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2558");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime2 = instant1.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.withZoneRetainFields(dateTimeZone3);
        org.joda.time.DateTime.Property property5 = dateTime4.centuryOfEra();
        boolean boolean7 = property5.equals((java.lang.Object) "1969-12-31T23:59:59.899Z");
        org.joda.time.DateTime dateTime8 = property5.roundHalfEvenCopy();
        org.joda.time.DateTime dateTime10 = dateTime8.minus((long) (-52));
        org.joda.time.Duration duration13 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.PeriodType periodType15 = null;
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration13, readableInstant14, periodType15);
        mutablePeriod16.setMonths((int) '4');
        org.joda.time.Period period19 = mutablePeriod16.toPeriod();
        org.joda.time.ReadableInterval readableInterval20 = null;
        mutablePeriod16.setPeriod(readableInterval20);
        mutablePeriod16.setWeeks(69);
        mutablePeriod16.addDays((int) 'x');
        mutablePeriod16.setYears((int) (short) 100);
        mutablePeriod16.clear();
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime(chronology29);
        org.joda.time.DateTime.Property property31 = dateTime30.yearOfEra();
        org.joda.time.Interval interval32 = property31.toInterval();
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime(chronology33);
        org.joda.time.DateTime.Property property35 = dateTime34.yearOfEra();
        org.joda.time.Interval interval36 = property35.toInterval();
        boolean boolean37 = interval32.contains((org.joda.time.ReadableInterval) interval36);
        java.lang.String str38 = interval32.toString();
        long long39 = interval32.getEndMillis();
        org.joda.time.Minutes minutes40 = org.joda.time.Minutes.minutesIn((org.joda.time.ReadableInterval) interval32);
        org.joda.time.Instant instant42 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime43 = instant42.toDateTime();
        org.joda.time.DateTime.Property property44 = dateTime43.era();
        int int45 = dateTime43.getWeekOfWeekyear();
        int int46 = dateTime43.getMonthOfYear();
        boolean boolean47 = interval32.isBefore((org.joda.time.ReadableInstant) dateTime43);
        org.joda.time.DateTime dateTime48 = interval32.getStart();
        org.joda.time.Duration duration49 = interval32.toDuration();
        mutablePeriod16.setPeriod((org.joda.time.ReadableInterval) interval32);
        org.joda.time.MutablePeriod mutablePeriod51 = mutablePeriod16.toMutablePeriod();
        org.joda.time.DateTime dateTime52 = dateTime10.plus((org.joda.time.ReadablePeriod) mutablePeriod51);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime2", (instant1.compareTo(dateTime2) == 0) == instant1.equals(dateTime2));
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2559");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime2 = instant1.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.withZoneRetainFields(dateTimeZone3);
        org.joda.time.Instant instant6 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime7 = instant6.toDateTime();
        org.joda.time.DateTime.Property property8 = dateTime7.era();
        org.joda.time.DateTime dateTime9 = dateTime7.withTimeAtStartOfDay();
        org.joda.time.Duration duration12 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.PeriodType periodType14 = null;
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration12, readableInstant13, periodType14);
        mutablePeriod15.setMonths((int) '4');
        org.joda.time.DateTime dateTime18 = dateTime7.plus((org.joda.time.ReadablePeriod) mutablePeriod15);
        org.joda.time.DateTime dateTime20 = dateTime7.minusWeeks((int) (byte) 1);
        int int21 = dateTime4.compareTo((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTime dateTime22 = dateTime4.toDateTimeISO();
        org.joda.time.Instant instant24 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime25 = instant24.toDateTime();
        org.joda.time.DateTime.Property property26 = dateTime25.era();
        org.joda.time.DateTime dateTime27 = dateTime25.withTimeAtStartOfDay();
        org.joda.time.Duration duration30 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.PeriodType periodType32 = null;
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration30, readableInstant31, periodType32);
        mutablePeriod33.setMonths((int) '4');
        org.joda.time.DateTime dateTime36 = dateTime25.plus((org.joda.time.ReadablePeriod) mutablePeriod33);
        org.joda.time.DateTime dateTime38 = dateTime25.minusWeeks((int) (byte) 1);
        long long39 = dateTime25.getMillis();
        org.joda.time.DurationFieldType durationFieldType40 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.Instant instant42 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime43 = instant42.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.DateTime dateTime45 = dateTime43.withZoneRetainFields(dateTimeZone44);
        org.joda.time.Instant instant47 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime48 = instant47.toDateTime();
        org.joda.time.DateTime.Property property49 = dateTime48.era();
        org.joda.time.DateTime dateTime50 = dateTime48.withTimeAtStartOfDay();
        org.joda.time.Duration duration53 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant54 = null;
        org.joda.time.PeriodType periodType55 = null;
        org.joda.time.MutablePeriod mutablePeriod56 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration53, readableInstant54, periodType55);
        mutablePeriod56.setMonths((int) '4');
        org.joda.time.DateTime dateTime59 = dateTime48.plus((org.joda.time.ReadablePeriod) mutablePeriod56);
        org.joda.time.DateTime dateTime61 = dateTime48.minusWeeks((int) (byte) 1);
        int int62 = dateTime45.compareTo((org.joda.time.ReadableInstant) dateTime48);
        org.joda.time.DateTime.Property property63 = dateTime48.minuteOfHour();
        org.joda.time.DateTime dateTime65 = dateTime48.withYear(1969);
        org.joda.time.Chronology chronology66 = dateTime65.getChronology();
        org.joda.time.DurationField durationField67 = durationFieldType40.getField(chronology66);
        org.joda.time.DateTime dateTime68 = dateTime25.toDateTime(chronology66);
        int int69 = dateTime22.compareTo((org.joda.time.ReadableInstant) dateTime68);
        int int70 = dateTime22.getDayOfYear();
        org.joda.time.DateTime dateTime71 = dateTime22.withLaterOffsetAtOverlap();
        org.joda.time.DateTime dateTime73 = dateTime71.withMillis((long) 999);
        boolean boolean75 = dateTime73.isBefore(17038080020972L);
        org.joda.time.LocalDate localDate76 = dateTime73.toLocalDate();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime2", (instant1.compareTo(dateTime2) == 0) == instant1.equals(dateTime2));
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2560");
        org.joda.time.Duration duration2 = new org.joda.time.Duration((-1L), 10L);
        long long3 = duration2.getStandardDays();
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.Instant instant7 = instant5.minus(100L);
        org.joda.time.MutableDateTime mutableDateTime8 = instant5.toMutableDateTimeISO();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(chronology9);
        org.joda.time.DateTime.Property property11 = dateTime10.yearOfEra();
        org.joda.time.DateTime.Property property12 = dateTime10.weekOfWeekyear();
        boolean boolean13 = mutableDateTime8.isBefore((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.DateTime.Property property14 = dateTime10.dayOfWeek();
        boolean boolean15 = property14.isLeap();
        org.joda.time.DateTime dateTime16 = property14.roundHalfCeilingCopy();
        org.joda.time.DateTime dateTime18 = dateTime16.minusDays((int) 'a');
        org.joda.time.DateTime dateTime20 = dateTime16.minusYears(59);
        org.joda.time.Instant instant22 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime23 = instant22.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateTime dateTime25 = dateTime23.withZoneRetainFields(dateTimeZone24);
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = org.joda.time.DateTimeFieldType.secondOfDay();
        boolean boolean27 = dateTime25.isSupported(dateTimeFieldType26);
        org.joda.time.Instant instant29 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime30 = instant29.toDateTime();
        org.joda.time.DateTime.Property property31 = dateTime30.era();
        org.joda.time.DateTime dateTime32 = dateTime30.withTimeAtStartOfDay();
        org.joda.time.Duration duration35 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.PeriodType periodType37 = null;
        org.joda.time.MutablePeriod mutablePeriod38 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration35, readableInstant36, periodType37);
        mutablePeriod38.setMonths((int) '4');
        org.joda.time.DateTime dateTime41 = dateTime30.plus((org.joda.time.ReadablePeriod) mutablePeriod38);
        int int42 = dateTime30.getMinuteOfDay();
        org.joda.time.DateTime dateTime44 = dateTime30.withMillisOfSecond((int) '#');
        long long45 = dateTime44.getMillis();
        org.joda.time.Minutes minutes46 = org.joda.time.Minutes.minutesBetween((org.joda.time.ReadableInstant) dateTime25, (org.joda.time.ReadableInstant) dateTime44);
        org.joda.time.PeriodType periodType47 = minutes46.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod48 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration2, (org.joda.time.ReadableInstant) dateTime20, periodType47);
        org.joda.time.Instant instant49 = new org.joda.time.Instant((java.lang.Object) dateTime20);
        org.joda.time.DateTime dateTime50 = dateTime20.withLaterOffsetAtOverlap();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant5 and mutableDateTime8", (instant5.compareTo(mutableDateTime8) == 0) == instant5.equals(mutableDateTime8));
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2561");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime2 = instant1.toDateTime();
        org.joda.time.DateTime.Property property3 = dateTime2.era();
        org.joda.time.DateTime dateTime4 = dateTime2.withTimeAtStartOfDay();
        org.joda.time.Duration duration7 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.PeriodType periodType9 = null;
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration7, readableInstant8, periodType9);
        mutablePeriod10.setMonths((int) '4');
        org.joda.time.DateTime dateTime13 = dateTime2.plus((org.joda.time.ReadablePeriod) mutablePeriod10);
        org.joda.time.DateTime dateTime15 = dateTime2.withMillisOfDay(4);
        org.joda.time.DateTimeZone dateTimeZone16 = dateTime2.getZone();
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod((long) (-292275054));
        org.joda.time.Hours hours19 = org.joda.time.Hours.FIVE;
        org.joda.time.Hours hours20 = org.joda.time.Hours.TWO;
        org.joda.time.Hours hours21 = hours19.plus(hours20);
        org.joda.time.DurationFieldType durationFieldType22 = hours19.getFieldType();
        boolean boolean23 = mutablePeriod18.isSupported(durationFieldType22);
        org.joda.time.DateTime dateTime24 = dateTime2.minus((org.joda.time.ReadablePeriod) mutablePeriod18);
        org.joda.time.DateTime.Property property25 = dateTime2.era();
        org.joda.time.DurationField durationField26 = property25.getLeapDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime2", (instant1.compareTo(dateTime2) == 0) == instant1.equals(dateTime2));
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2562");
        org.joda.time.Duration duration2 = new org.joda.time.Duration((long) ' ', (long) ' ');
        org.joda.time.Period period3 = duration2.toPeriod();
        org.joda.time.Duration duration5 = duration2.plus((long) (byte) 0);
        org.joda.time.Instant instant7 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime8 = instant7.toDateTime();
        boolean boolean10 = dateTime8.isEqual(10L);
        org.joda.time.PeriodType periodType13 = org.joda.time.PeriodType.yearDay();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((long) 100, 0L, periodType13, chronology14);
        org.joda.time.PeriodType periodType16 = periodType13.withWeeksRemoved();
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration5, (org.joda.time.ReadableInstant) dateTime8, periodType16);
        org.joda.time.Minutes minutes18 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.Minutes minutes19 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.Minutes minutes21 = minutes19.minus((int) (short) -1);
        boolean boolean22 = minutes18.isGreaterThan(minutes19);
        org.joda.time.Minutes minutes23 = org.joda.time.Minutes.TWO;
        boolean boolean24 = minutes18.isLessThan(minutes23);
        org.joda.time.DateTime dateTime25 = dateTime8.plus((org.joda.time.ReadablePeriod) minutes18);
        org.joda.time.DateTime dateTime26 = dateTime8.withLaterOffsetAtOverlap();
        org.joda.time.DateTime dateTime28 = dateTime8.minusMonths(1969);
        org.joda.time.MutableDateTime mutableDateTime29 = dateTime8.toMutableDateTimeISO();
        java.lang.Object obj31 = null;
        org.joda.time.Instant instant32 = new org.joda.time.Instant(obj31);
        org.joda.time.DateTimeZone dateTimeZone33 = instant32.getZone();
        boolean boolean34 = dateTimeZone33.isFixed();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone33);
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime((-27349920L), dateTimeZone33);
        java.util.TimeZone timeZone37 = dateTimeZone33.toTimeZone();
        long long41 = dateTimeZone33.convertLocalToUTC((long) (-59), true, (-7152L));
        org.joda.time.DateTime dateTime42 = dateTime8.toDateTime(dateTimeZone33);
        org.joda.time.Duration duration45 = new org.joda.time.Duration((long) ' ', (long) ' ');
        org.joda.time.Period period46 = duration45.toPeriod();
        org.joda.time.Duration duration48 = duration45.plus((long) (byte) 0);
        org.joda.time.ReadableInstant readableInstant49 = null;
        org.joda.time.Period period50 = duration45.toPeriodTo(readableInstant49);
        org.joda.time.Duration duration52 = duration45.withMillis((long) (short) 0);
        org.joda.time.Duration duration55 = duration45.withDurationAdded((long) 1, (int) ' ');
        org.joda.time.Instant instant57 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime58 = instant57.toDateTime();
        boolean boolean60 = dateTime58.isEqual(10L);
        org.joda.time.PeriodType periodType61 = org.joda.time.PeriodType.minutes();
        org.joda.time.Period period62 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration55, (org.joda.time.ReadableInstant) dateTime58, periodType61);
        java.lang.Object obj63 = null;
        org.joda.time.Instant instant64 = new org.joda.time.Instant(obj63);
        org.joda.time.DateTimeZone dateTimeZone65 = instant64.getZone();
        org.joda.time.DateTime dateTime66 = dateTime58.toDateTime(dateTimeZone65);
        org.joda.time.DateTime dateTime68 = dateTime66.withSecondOfMinute(7);
        org.joda.time.DateTime dateTime70 = dateTime68.minusMonths((int) '#');
        org.joda.time.DateTime dateTime72 = dateTime70.plusYears(23);
        boolean boolean73 = dateTime8.isBefore((org.joda.time.ReadableInstant) dateTime70);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant7 and dateTime8", (instant7.compareTo(dateTime8) == 0) == instant7.equals(dateTime8));
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2563");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime2 = instant1.toDateTime();
        boolean boolean4 = dateTime2.isEqual(10L);
        org.joda.time.DateTime dateTime6 = dateTime2.withCenturyOfEra((int) (byte) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateTimeField dateTimeField9 = dateTimeFieldType7.getField(chronology8);
        long long12 = dateTimeField9.add(0L, (long) (short) 1);
        long long15 = dateTimeField9.add(1L, (-1));
        int int16 = dateTime2.get(dateTimeField9);
        org.joda.time.Instant instant18 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime19 = instant18.toDateTime();
        org.joda.time.DateTime.Property property20 = dateTime19.era();
        org.joda.time.DateTime dateTime21 = dateTime19.withTimeAtStartOfDay();
        org.joda.time.Duration duration24 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.PeriodType periodType26 = null;
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration24, readableInstant25, periodType26);
        mutablePeriod27.setMonths((int) '4');
        org.joda.time.DateTime dateTime30 = dateTime19.plus((org.joda.time.ReadablePeriod) mutablePeriod27);
        org.joda.time.DateTime dateTime32 = dateTime19.minusWeeks((int) (byte) 1);
        long long33 = dateTime19.getMillis();
        org.joda.time.DurationFieldType durationFieldType34 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.Instant instant36 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime37 = instant36.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.DateTime dateTime39 = dateTime37.withZoneRetainFields(dateTimeZone38);
        org.joda.time.Instant instant41 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime42 = instant41.toDateTime();
        org.joda.time.DateTime.Property property43 = dateTime42.era();
        org.joda.time.DateTime dateTime44 = dateTime42.withTimeAtStartOfDay();
        org.joda.time.Duration duration47 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant48 = null;
        org.joda.time.PeriodType periodType49 = null;
        org.joda.time.MutablePeriod mutablePeriod50 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration47, readableInstant48, periodType49);
        mutablePeriod50.setMonths((int) '4');
        org.joda.time.DateTime dateTime53 = dateTime42.plus((org.joda.time.ReadablePeriod) mutablePeriod50);
        org.joda.time.DateTime dateTime55 = dateTime42.minusWeeks((int) (byte) 1);
        int int56 = dateTime39.compareTo((org.joda.time.ReadableInstant) dateTime42);
        org.joda.time.DateTime.Property property57 = dateTime42.minuteOfHour();
        org.joda.time.DateTime dateTime59 = dateTime42.withYear(1969);
        org.joda.time.Chronology chronology60 = dateTime59.getChronology();
        org.joda.time.DurationField durationField61 = durationFieldType34.getField(chronology60);
        org.joda.time.DateTime dateTime62 = dateTime19.toDateTime(chronology60);
        org.joda.time.DateTime dateTime63 = dateTime2.toDateTime(chronology60);
        org.joda.time.DateTimeField dateTimeField64 = chronology60.millisOfDay();
        org.joda.time.DateTimeField dateTimeField65 = chronology60.clockhourOfHalfday();
        long long67 = dateTimeField65.roundHalfEven((long) 62);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime2", (instant1.compareTo(dateTime2) == 0) == instant1.equals(dateTime2));
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2564");
        org.joda.time.Duration duration2 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.Seconds seconds3 = duration2.toStandardSeconds();
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.Instant instant7 = instant5.minus(100L);
        org.joda.time.MutableDateTime mutableDateTime8 = instant5.toMutableDateTimeISO();
        org.joda.time.Period period9 = duration2.toPeriodTo((org.joda.time.ReadableInstant) instant5);
        long long10 = instant5.getMillis();
        org.joda.time.Chronology chronology11 = instant5.getChronology();
        org.joda.time.DateTime dateTime12 = org.joda.time.DateTime.now(chronology11);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant5 and mutableDateTime8", (instant5.compareTo(mutableDateTime8) == 0) == instant5.equals(mutableDateTime8));
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2565");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime2 = instant1.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.withZoneRetainFields(dateTimeZone3);
        org.joda.time.Instant instant6 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime7 = instant6.toDateTime();
        org.joda.time.DateTime.Property property8 = dateTime7.era();
        org.joda.time.DateTime dateTime9 = dateTime7.withTimeAtStartOfDay();
        org.joda.time.Duration duration12 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.PeriodType periodType14 = null;
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration12, readableInstant13, periodType14);
        mutablePeriod15.setMonths((int) '4');
        org.joda.time.DateTime dateTime18 = dateTime7.plus((org.joda.time.ReadablePeriod) mutablePeriod15);
        org.joda.time.DateTime dateTime20 = dateTime7.minusWeeks((int) (byte) 1);
        int int21 = dateTime4.compareTo((org.joda.time.ReadableInstant) dateTime7);
        int int22 = dateTime4.getDayOfWeek();
        org.joda.time.DateTime dateTime23 = dateTime4.withLaterOffsetAtOverlap();
        org.joda.time.DateTime dateTime25 = dateTime4.minusHours((-2147483648));
        org.joda.time.DateTime dateTime27 = dateTime25.minusSeconds(78719999);
        org.joda.time.DateTime.Property property28 = dateTime25.yearOfEra();
        int int29 = property28.get();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime2", (instant1.compareTo(dateTime2) == 0) == instant1.equals(dateTime2));
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2566");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardMinutes(29227899301L);
        org.joda.time.Instant instant3 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime4 = instant3.toDateTime();
        org.joda.time.DateTime.Property property5 = dateTime4.era();
        org.joda.time.DateTime dateTime6 = dateTime4.withTimeAtStartOfDay();
        org.joda.time.Instant instant7 = dateTime4.toInstant();
        org.joda.time.DateMidnight dateMidnight8 = dateTime4.toDateMidnight();
        org.joda.time.DateTime dateTime11 = dateTime4.withDurationAdded(0L, (int) 'a');
        java.lang.Object obj12 = null;
        org.joda.time.Instant instant13 = new org.joda.time.Instant(obj12);
        org.joda.time.DateTimeZone dateTimeZone14 = instant13.getZone();
        java.lang.String str15 = dateTimeZone14.toString();
        long long17 = dateTimeZone14.nextTransition((long) (short) 100);
        java.lang.String str18 = dateTimeZone14.toString();
        org.joda.time.DateTime dateTime19 = dateTime11.withZone(dateTimeZone14);
        org.joda.time.Duration duration22 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.Seconds seconds23 = duration22.toStandardSeconds();
        org.joda.time.ReadableDuration readableDuration24 = null;
        boolean boolean25 = duration22.isEqual(readableDuration24);
        org.joda.time.Duration duration28 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.Seconds seconds29 = duration28.toStandardSeconds();
        org.joda.time.ReadableDuration readableDuration30 = null;
        boolean boolean31 = duration28.isEqual(readableDuration30);
        org.joda.time.Duration duration32 = duration22.minus((org.joda.time.ReadableDuration) duration28);
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime19, (org.joda.time.ReadableDuration) duration28);
        boolean boolean34 = duration1.isEqual((org.joda.time.ReadableDuration) duration28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and dateTime4", (instant3.compareTo(dateTime4) == 0) == instant3.equals(dateTime4));
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2567");
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType6 = org.joda.time.PeriodType.yearDay();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((long) 100, 0L, periodType6, chronology7);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((long) (short) 0, periodType6, chronology9);
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period((long) (short) 10, periodType12);
        org.joda.time.Instant instant15 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.Instant instant16 = instant15.toInstant();
        org.joda.time.DateTime dateTime17 = instant16.toDateTimeISO();
        org.joda.time.Duration duration18 = period13.toDurationFrom((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.Duration duration21 = new org.joda.time.Duration((-1L), (long) 23);
        org.joda.time.Period period23 = org.joda.time.Period.seconds((-1));
        org.joda.time.Period period25 = period23.minusMonths((int) (short) 10);
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.Duration duration27 = period25.toDurationTo(readableInstant26);
        org.joda.time.Duration duration30 = duration27.withDurationAdded((long) '#', 0);
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.Period period32 = duration30.toPeriodFrom(readableInstant31);
        org.joda.time.Duration duration33 = duration21.minus((org.joda.time.ReadableDuration) duration30);
        org.joda.time.Duration duration34 = duration18.plus((org.joda.time.ReadableDuration) duration21);
        mutablePeriod10.add((org.joda.time.ReadableDuration) duration21);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime(chronology36);
        org.joda.time.DateTime.Property property38 = dateTime37.yearOfEra();
        org.joda.time.Interval interval39 = property38.toInterval();
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime(chronology40);
        org.joda.time.DateTime.Property property42 = dateTime41.yearOfEra();
        org.joda.time.Interval interval43 = property42.toInterval();
        boolean boolean44 = interval39.contains((org.joda.time.ReadableInterval) interval43);
        java.lang.String str45 = interval39.toString();
        long long46 = interval39.getEndMillis();
        org.joda.time.Instant instant48 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime49 = instant48.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.DateTime dateTime51 = dateTime49.withZoneRetainFields(dateTimeZone50);
        org.joda.time.Instant instant53 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime54 = instant53.toDateTime();
        org.joda.time.DateTime.Property property55 = dateTime54.era();
        org.joda.time.DateTime dateTime56 = dateTime54.withTimeAtStartOfDay();
        org.joda.time.Duration duration59 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant60 = null;
        org.joda.time.PeriodType periodType61 = null;
        org.joda.time.MutablePeriod mutablePeriod62 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration59, readableInstant60, periodType61);
        mutablePeriod62.setMonths((int) '4');
        org.joda.time.DateTime dateTime65 = dateTime54.plus((org.joda.time.ReadablePeriod) mutablePeriod62);
        org.joda.time.DateTime dateTime67 = dateTime54.minusWeeks((int) (byte) 1);
        int int68 = dateTime51.compareTo((org.joda.time.ReadableInstant) dateTime54);
        org.joda.time.DateTime.Property property69 = dateTime54.minuteOfHour();
        org.joda.time.DateTime dateTime71 = dateTime54.withYear(1969);
        org.joda.time.Chronology chronology72 = dateTime71.getChronology();
        boolean boolean73 = interval39.isBefore((org.joda.time.ReadableInstant) dateTime71);
        mutablePeriod10.setPeriod((org.joda.time.ReadableInterval) interval39);
        long long75 = interval39.getEndMillis();
        org.joda.time.Chronology chronology76 = interval39.getChronology();
        org.joda.time.DateTimeField dateTimeField77 = chronology76.hourOfHalfday();
        org.joda.time.PeriodType periodType82 = org.joda.time.PeriodType.yearDay();
        org.joda.time.Chronology chronology83 = null;
        org.joda.time.MutablePeriod mutablePeriod84 = new org.joda.time.MutablePeriod((long) 100, 0L, periodType82, chronology83);
        org.joda.time.MutablePeriod mutablePeriod85 = new org.joda.time.MutablePeriod((-1L), (long) 100, periodType82);
        mutablePeriod85.setDays(201);
        int[] intArray89 = chronology76.get((org.joda.time.ReadablePeriod) mutablePeriod85, (long) (-2147483551));
        org.joda.time.Period period90 = new org.joda.time.Period(5011200000L, 1640995080000L, periodType2, chronology76);
        org.joda.time.DateTimeField dateTimeField91 = chronology76.year();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant15 and dateTime17", (instant15.compareTo(dateTime17) == 0) == instant15.equals(dateTime17));
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2568");
        org.joda.time.Duration duration2 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Period period4 = duration2.toPeriod(chronology3);
        org.joda.time.Period period6 = org.joda.time.Period.seconds((-1));
        org.joda.time.Period period8 = period6.minusMonths((int) (short) 10);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.Duration duration10 = period8.toDurationTo(readableInstant9);
        org.joda.time.Duration duration11 = duration2.minus((org.joda.time.ReadableDuration) duration10);
        org.joda.time.PeriodType periodType15 = org.joda.time.PeriodType.yearDay();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((long) 100, 0L, periodType15, chronology16);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((long) (short) 0, periodType15, chronology18);
        org.joda.time.DurationFieldType durationFieldType20 = org.joda.time.DurationFieldType.minutes();
        int int21 = periodType15.indexOf(durationFieldType20);
        org.joda.time.PeriodType periodType22 = periodType15.withYearsRemoved();
        org.joda.time.Instant instant24 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime25 = instant24.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.DateTime dateTime27 = dateTime25.withZoneRetainFields(dateTimeZone26);
        org.joda.time.Instant instant29 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime30 = instant29.toDateTime();
        org.joda.time.DateTime.Property property31 = dateTime30.era();
        org.joda.time.DateTime dateTime32 = dateTime30.withTimeAtStartOfDay();
        org.joda.time.Duration duration35 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.PeriodType periodType37 = null;
        org.joda.time.MutablePeriod mutablePeriod38 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration35, readableInstant36, periodType37);
        mutablePeriod38.setMonths((int) '4');
        org.joda.time.DateTime dateTime41 = dateTime30.plus((org.joda.time.ReadablePeriod) mutablePeriod38);
        org.joda.time.DateTime dateTime43 = dateTime30.minusWeeks((int) (byte) 1);
        int int44 = dateTime27.compareTo((org.joda.time.ReadableInstant) dateTime30);
        org.joda.time.DateTime.Property property45 = dateTime30.minuteOfHour();
        org.joda.time.DateTime dateTime47 = dateTime30.withYear(1969);
        org.joda.time.Chronology chronology48 = dateTime47.getChronology();
        org.joda.time.DateTimeField dateTimeField49 = chronology48.year();
        org.joda.time.DateTimeField dateTimeField50 = chronology48.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField51 = chronology48.year();
        org.joda.time.DateTimeZone dateTimeZone52 = chronology48.getZone();
        org.joda.time.DurationField durationField53 = chronology48.weekyears();
        org.joda.time.Period period54 = duration11.toPeriod(periodType22, chronology48);
        org.joda.time.DateTimeField dateTimeField55 = chronology48.minuteOfHour();
        int int57 = dateTimeField55.getMinimumValue((long) (-97));
        org.joda.time.DateTimeFieldType dateTimeFieldType59 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.Chronology chronology60 = null;
        org.joda.time.DateTimeField dateTimeField61 = dateTimeFieldType59.getField(chronology60);
        long long64 = dateTimeField61.add(0L, (long) (short) 1);
        long long67 = dateTimeField61.getDifferenceAsLong((long) ' ', (long) 1969);
        int int69 = dateTimeField61.get((long) 6);
        long long71 = dateTimeField61.roundCeiling((long) 8);
        org.joda.time.Chronology chronology72 = null;
        org.joda.time.DateTime dateTime73 = new org.joda.time.DateTime(chronology72);
        org.joda.time.DateTime.Property property74 = dateTime73.yearOfEra();
        org.joda.time.Interval interval75 = property74.toInterval();
        java.util.Locale locale76 = java.util.Locale.KOREAN;
        java.lang.String str77 = property74.getAsText(locale76);
        int int78 = property74.getMaximumValue();
        org.joda.time.format.PeriodPrinter periodPrinter79 = null;
        org.joda.time.format.PeriodParser periodParser80 = null;
        org.joda.time.format.PeriodFormatter periodFormatter81 = new org.joda.time.format.PeriodFormatter(periodPrinter79, periodParser80);
        org.joda.time.PeriodType periodType82 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.format.PeriodFormatter periodFormatter83 = periodFormatter81.withParseType(periodType82);
        java.util.Locale locale84 = periodFormatter81.getLocale();
        java.util.Locale locale85 = java.util.Locale.ITALY;
        java.lang.String str86 = locale85.getScript();
        org.joda.time.format.PeriodFormatter periodFormatter87 = periodFormatter81.withLocale(locale85);
        java.util.Locale locale88 = locale85.stripExtensions();
        int int89 = property74.getMaximumShortTextLength(locale85);
        java.lang.String str90 = locale85.getVariant();
        java.lang.String str91 = locale85.getLanguage();
        int int92 = dateTimeField61.getMaximumShortTextLength(locale85);
        java.lang.String str93 = locale85.getDisplayScript();
        java.lang.String str94 = locale85.getISO3Language();
        java.lang.String str96 = locale85.getExtension('x');
        java.lang.String str97 = dateTimeField55.getAsShortText((-2592000001L), locale85);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant24 and dateTime25", (instant24.compareTo(dateTime25) == 0) == instant24.equals(dateTime25));
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2569");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime2 = instant1.toDateTime();
        org.joda.time.DateTime.Property property3 = dateTime2.era();
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.Instant instant7 = instant5.minus(100L);
        org.joda.time.Instant instant9 = instant7.plus((long) 100);
        org.joda.time.Instant instant11 = instant7.withMillis((long) (byte) 1);
        org.joda.time.Minutes minutes12 = org.joda.time.Minutes.minutesBetween((org.joda.time.ReadableInstant) dateTime2, (org.joda.time.ReadableInstant) instant7);
        org.joda.time.MutableDateTime mutableDateTime13 = instant7.toMutableDateTimeISO();
        org.joda.time.MutableDateTime mutableDateTime14 = instant7.toMutableDateTimeISO();
        java.util.Date date15 = instant7.toDate();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime2", (instant1.compareTo(dateTime2) == 0) == instant1.equals(dateTime2));
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2570");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime2 = instant1.toDateTime();
        org.joda.time.DateTime.Property property3 = dateTime2.era();
        org.joda.time.DateTime dateTime4 = dateTime2.withTimeAtStartOfDay();
        org.joda.time.DateTime.Property property5 = dateTime2.minuteOfHour();
        org.joda.time.DateTime dateTime7 = dateTime2.minusMonths((int) 'x');
        org.joda.time.Duration duration10 = new org.joda.time.Duration((long) ' ', (long) ' ');
        org.joda.time.Period period11 = duration10.toPeriod();
        org.joda.time.Duration duration13 = duration10.withMillis((long) 4);
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime2, (org.joda.time.ReadableDuration) duration10);
        org.joda.time.Days days15 = duration10.toStandardDays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime2", (instant1.compareTo(dateTime2) == 0) == instant1.equals(dateTime2));
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2571");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime2 = instant1.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.withZoneRetainFields(dateTimeZone3);
        org.joda.time.Instant instant6 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime7 = instant6.toDateTime();
        org.joda.time.DateTime.Property property8 = dateTime7.era();
        org.joda.time.DateTime dateTime9 = dateTime7.withTimeAtStartOfDay();
        org.joda.time.Duration duration12 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.PeriodType periodType14 = null;
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration12, readableInstant13, periodType14);
        mutablePeriod15.setMonths((int) '4');
        org.joda.time.DateTime dateTime18 = dateTime7.plus((org.joda.time.ReadablePeriod) mutablePeriod15);
        org.joda.time.DateTime dateTime20 = dateTime7.minusWeeks((int) (byte) 1);
        int int21 = dateTime4.compareTo((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTime.Property property22 = dateTime7.minuteOfHour();
        org.joda.time.DateTime dateTime24 = dateTime7.withYear(1969);
        org.joda.time.Chronology chronology25 = dateTime24.getChronology();
        org.joda.time.DateTimeField dateTimeField26 = chronology25.year();
        org.joda.time.DateTimeField dateTimeField27 = chronology25.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField28 = chronology25.weekyearOfCentury();
        org.joda.time.DurationField durationField29 = chronology25.months();
        org.joda.time.DateTimeField dateTimeField30 = chronology25.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField31 = chronology25.hourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime2", (instant1.compareTo(dateTime2) == 0) == instant1.equals(dateTime2));
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2572");
        org.joda.time.Duration duration2 = new org.joda.time.Duration((long) ' ', (long) ' ');
        org.joda.time.Period period3 = duration2.toPeriod();
        org.joda.time.Duration duration5 = duration2.plus((long) (byte) 0);
        org.joda.time.Duration duration8 = new org.joda.time.Duration((-1L), 10L);
        long long9 = duration8.getStandardDays();
        org.joda.time.Duration duration10 = duration5.plus((org.joda.time.ReadableDuration) duration8);
        java.lang.Object obj12 = null;
        org.joda.time.Instant instant13 = new org.joda.time.Instant(obj12);
        org.joda.time.DateTimeZone dateTimeZone14 = instant13.getZone();
        java.lang.String str15 = dateTimeZone14.toString();
        int int17 = dateTimeZone14.getOffset(1L);
        boolean boolean19 = dateTimeZone14.isStandardOffset(0L);
        java.lang.String str21 = dateTimeZone14.getNameKey((long) 1);
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime(dateTimeZone14);
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime((-1L), dateTimeZone14);
        org.joda.time.Period period25 = org.joda.time.Period.seconds((-1));
        org.joda.time.Period period27 = period25.minusMonths((int) (short) 10);
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.Duration duration29 = period27.toDurationTo(readableInstant28);
        org.joda.time.Duration duration32 = duration29.withDurationAdded((long) '#', 0);
        org.joda.time.Instant instant34 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.Instant instant36 = instant34.minus(100L);
        org.joda.time.MutableDateTime mutableDateTime37 = instant34.toMutableDateTimeISO();
        org.joda.time.PeriodType periodType38 = org.joda.time.PeriodType.minutes();
        org.joda.time.Period period39 = duration32.toPeriodFrom((org.joda.time.ReadableInstant) mutableDateTime37, periodType38);
        org.joda.time.Minutes minutes40 = duration32.toStandardMinutes();
        org.joda.time.DateTime dateTime41 = dateTime23.plus((org.joda.time.ReadableDuration) duration32);
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime((java.lang.Object) dateTime23, dateTimeZone42);
        org.joda.time.PeriodType periodType46 = org.joda.time.PeriodType.yearDay();
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.MutablePeriod mutablePeriod48 = new org.joda.time.MutablePeriod((long) 100, 0L, periodType46, chronology47);
        org.joda.time.Period period49 = duration5.toPeriodTo((org.joda.time.ReadableInstant) dateTime43, periodType46);
        int int50 = dateTime43.getCenturyOfEra();
        int int51 = dateTime43.getYearOfCentury();
        org.joda.time.DateTime.Property property52 = dateTime43.hourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime23 and mutableDateTime37", (dateTime23.compareTo(mutableDateTime37) == 0) == dateTime23.equals(mutableDateTime37));
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2573");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.Instant instant2 = instant1.toInstant();
        org.joda.time.DateTime dateTime3 = instant2.toDateTimeISO();
        org.joda.time.DateTime dateTime5 = dateTime3.plusDays(10);
        org.joda.time.DateTime.Property property6 = dateTime3.minuteOfDay();
        org.joda.time.DateTime dateTime8 = property6.addWrapFieldToCopy((-10));
        java.lang.String str9 = property6.getAsText();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime3", (instant1.compareTo(dateTime3) == 0) == instant1.equals(dateTime3));
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2574");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime2 = instant1.toDateTime();
        org.joda.time.DateTime.Property property3 = dateTime2.era();
        org.joda.time.ReadablePartial readablePartial4 = null;
        org.joda.time.DateTime dateTime5 = dateTime2.withFields(readablePartial4);
        org.joda.time.DateMidnight dateMidnight6 = dateTime5.toDateMidnight();
        org.joda.time.Chronology chronology7 = dateMidnight6.getChronology();
        org.joda.time.Duration duration10 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.Seconds seconds11 = duration10.toStandardSeconds();
        org.joda.time.Instant instant13 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.Instant instant15 = instant13.minus(100L);
        org.joda.time.MutableDateTime mutableDateTime16 = instant13.toMutableDateTimeISO();
        org.joda.time.Period period17 = duration10.toPeriodTo((org.joda.time.ReadableInstant) instant13);
        org.joda.time.Period period19 = period17.plusDays(23);
        int[] intArray21 = chronology7.get((org.joda.time.ReadablePeriod) period19, (long) 97);
        org.joda.time.Period period23 = period19.minusYears(12);
        org.joda.time.MutablePeriod mutablePeriod24 = period19.toMutablePeriod();
        mutablePeriod24.setDays(896);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime2", (instant1.compareTo(dateTime2) == 0) == instant1.equals(dateTime2));
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2575");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime2 = instant1.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.withZoneRetainFields(dateTimeZone3);
        org.joda.time.Instant instant6 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime7 = instant6.toDateTime();
        org.joda.time.DateTime.Property property8 = dateTime7.era();
        org.joda.time.DateTime dateTime9 = dateTime7.withTimeAtStartOfDay();
        org.joda.time.Duration duration12 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.PeriodType periodType14 = null;
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration12, readableInstant13, periodType14);
        mutablePeriod15.setMonths((int) '4');
        org.joda.time.DateTime dateTime18 = dateTime7.plus((org.joda.time.ReadablePeriod) mutablePeriod15);
        org.joda.time.DateTime dateTime20 = dateTime7.minusWeeks((int) (byte) 1);
        int int21 = dateTime4.compareTo((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTime.Property property22 = dateTime7.minuteOfHour();
        org.joda.time.DateTime dateTime24 = dateTime7.withYear(1969);
        org.joda.time.Chronology chronology25 = dateTime24.getChronology();
        org.joda.time.DateTimeField dateTimeField26 = chronology25.year();
        org.joda.time.DateTimeField dateTimeField27 = chronology25.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField28 = chronology25.centuryOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = dateTimeField28.getType();
        org.joda.time.Instant instant31 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime32 = instant31.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.DateTime dateTime34 = dateTime32.withZone(dateTimeZone33);
        org.joda.time.Instant instant36 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime37 = instant36.toDateTime();
        org.joda.time.DateTime.Property property38 = dateTime37.era();
        org.joda.time.DateTime dateTime39 = dateTime37.withTimeAtStartOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType40 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        boolean boolean41 = dateTime37.isSupported(dateTimeFieldType40);
        org.joda.time.DateTime.Property property42 = dateTime32.property(dateTimeFieldType40);
        org.joda.time.DateTimeZone dateTimeZone43 = dateTime32.getZone();
        org.joda.time.LocalDateTime localDateTime44 = dateTime32.toLocalDateTime();
        int int45 = localDateTime44.size();
        org.joda.time.Instant instant47 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime48 = instant47.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.DateTime dateTime50 = dateTime48.withZone(dateTimeZone49);
        org.joda.time.Instant instant52 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime53 = instant52.toDateTime();
        org.joda.time.DateTime.Property property54 = dateTime53.era();
        org.joda.time.DateTime dateTime55 = dateTime53.withTimeAtStartOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType56 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        boolean boolean57 = dateTime53.isSupported(dateTimeFieldType56);
        org.joda.time.DateTime.Property property58 = dateTime48.property(dateTimeFieldType56);
        org.joda.time.DateTimeZone dateTimeZone59 = dateTime48.getZone();
        org.joda.time.LocalDateTime localDateTime60 = dateTime48.toLocalDateTime();
        int int61 = localDateTime60.size();
        org.joda.time.Days days62 = org.joda.time.Days.daysBetween((org.joda.time.ReadablePartial) localDateTime44, (org.joda.time.ReadablePartial) localDateTime60);
        org.joda.time.DateTimeFieldType dateTimeFieldType63 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.Chronology chronology64 = null;
        org.joda.time.DateTimeField dateTimeField65 = dateTimeFieldType63.getField(chronology64);
        long long68 = dateTimeField65.add(0L, (long) (short) 1);
        boolean boolean70 = dateTimeField65.isLeap(10L);
        int int71 = dateTimeField65.getMinimumValue();
        long long73 = dateTimeField65.roundHalfEven((long) (byte) 1);
        org.joda.time.ReadablePartial readablePartial74 = null;
        org.joda.time.Duration duration78 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant79 = null;
        org.joda.time.PeriodType periodType80 = null;
        org.joda.time.MutablePeriod mutablePeriod81 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration78, readableInstant79, periodType80);
        mutablePeriod81.setMonths((int) '4');
        org.joda.time.Period period84 = mutablePeriod81.toPeriod();
        int[] intArray85 = period84.getValues();
        int[] intArray87 = dateTimeField65.addWrapPartial(readablePartial74, 10, intArray85, 0);
        int int88 = dateTimeField28.getMaximumValue((org.joda.time.ReadablePartial) localDateTime60, intArray87);
        org.joda.time.DurationField durationField89 = dateTimeField28.getRangeDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime2", (instant1.compareTo(dateTime2) == 0) == instant1.equals(dateTime2));
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2576");
        java.util.Locale locale0 = java.util.Locale.JAPANESE;
        java.util.Locale locale1 = java.util.Locale.ENGLISH;
        java.lang.String str2 = locale0.getDisplayScript(locale1);
        java.lang.String str3 = locale0.getISO3Country();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(chronology4);
        org.joda.time.Instant instant7 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime8 = instant7.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = dateTime8.withZoneRetainFields(dateTimeZone9);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime13 = instant12.toDateTime();
        org.joda.time.DateTime.Property property14 = dateTime13.era();
        org.joda.time.DateTime dateTime15 = dateTime13.withTimeAtStartOfDay();
        org.joda.time.Duration duration18 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.PeriodType periodType20 = null;
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration18, readableInstant19, periodType20);
        mutablePeriod21.setMonths((int) '4');
        org.joda.time.DateTime dateTime24 = dateTime13.plus((org.joda.time.ReadablePeriod) mutablePeriod21);
        org.joda.time.DateTime dateTime26 = dateTime13.minusWeeks((int) (byte) 1);
        int int27 = dateTime10.compareTo((org.joda.time.ReadableInstant) dateTime13);
        org.joda.time.DateTime.Property property28 = dateTime13.minuteOfHour();
        org.joda.time.DateTime dateTime30 = dateTime13.withYear(1969);
        org.joda.time.Chronology chronology31 = dateTime30.getChronology();
        org.joda.time.DateTimeField dateTimeField32 = chronology31.dayOfMonth();
        org.joda.time.DurationField durationField33 = chronology31.minutes();
        org.joda.time.DateTime dateTime34 = dateTime5.toDateTime(chronology31);
        org.joda.time.DateTimeField dateTimeField35 = chronology31.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField36 = chronology31.clockhourOfHalfday();
        org.joda.time.Instant instant38 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime39 = instant38.toDateTime();
        org.joda.time.DateTime.Property property40 = dateTime39.era();
        org.joda.time.DateTime dateTime41 = dateTime39.withTimeAtStartOfDay();
        org.joda.time.Duration duration44 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.PeriodType periodType46 = null;
        org.joda.time.MutablePeriod mutablePeriod47 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration44, readableInstant45, periodType46);
        mutablePeriod47.setMonths((int) '4');
        org.joda.time.DateTime dateTime50 = dateTime39.plus((org.joda.time.ReadablePeriod) mutablePeriod47);
        org.joda.time.LocalDate localDate51 = dateTime39.toLocalDate();
        int int52 = localDate51.size();
        org.joda.time.Instant instant54 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime55 = instant54.toDateTime();
        org.joda.time.DateTime.Property property56 = dateTime55.era();
        org.joda.time.DateTime dateTime57 = dateTime55.withTimeAtStartOfDay();
        org.joda.time.Duration duration60 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant61 = null;
        org.joda.time.PeriodType periodType62 = null;
        org.joda.time.MutablePeriod mutablePeriod63 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration60, readableInstant61, periodType62);
        mutablePeriod63.setMonths((int) '4');
        org.joda.time.DateTime dateTime66 = dateTime55.plus((org.joda.time.ReadablePeriod) mutablePeriod63);
        org.joda.time.LocalDate localDate67 = dateTime55.toLocalDate();
        int int68 = localDate51.compareTo((org.joda.time.ReadablePartial) localDate67);
        org.joda.time.format.PeriodPrinter periodPrinter70 = null;
        org.joda.time.format.PeriodParser periodParser71 = null;
        org.joda.time.format.PeriodFormatter periodFormatter72 = new org.joda.time.format.PeriodFormatter(periodPrinter70, periodParser71);
        org.joda.time.PeriodType periodType73 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.format.PeriodFormatter periodFormatter74 = periodFormatter72.withParseType(periodType73);
        java.util.Locale locale75 = periodFormatter72.getLocale();
        java.util.Locale locale76 = java.util.Locale.ITALY;
        java.lang.String str77 = locale76.getScript();
        org.joda.time.format.PeriodFormatter periodFormatter78 = periodFormatter72.withLocale(locale76);
        java.util.Locale locale79 = locale76.stripExtensions();
        java.lang.String str80 = locale79.getDisplayName();
        java.lang.String str81 = dateTimeField36.getAsShortText((org.joda.time.ReadablePartial) localDate51, (int) (short) -1, locale79);
        java.util.Locale.Builder builder82 = new java.util.Locale.Builder();
        java.util.Locale locale83 = java.util.Locale.ENGLISH;
        java.util.Locale.Builder builder84 = builder82.setLocale(locale83);
        java.lang.String str85 = locale79.getDisplayLanguage(locale83);
        java.lang.String str86 = locale0.getDisplayLanguage(locale83);
        java.util.Locale.Category category87 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale88 = java.util.Locale.getDefault(category87);
        java.util.Locale locale89 = java.util.Locale.ITALIAN;
        java.util.Locale.setDefault(category87, locale89);
        java.util.Locale locale92 = java.util.Locale.forLanguageTag("11");
        java.util.Locale.setDefault(category87, locale92);
        java.util.Locale locale94 = java.util.Locale.getDefault(category87);
        java.util.Locale locale95 = java.util.Locale.getDefault(category87);
        java.lang.String str96 = locale0.getDisplayLanguage(locale95);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant7 and dateTime8", (instant7.compareTo(dateTime8) == 0) == instant7.equals(dateTime8));
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2577");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime.Property property2 = dateTime1.yearOfEra();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.DateTime dateTime4 = interval3.getStart();
        org.joda.time.DateTime dateTime5 = dateTime4.toDateTimeISO();
        org.joda.time.DateTime dateTime7 = dateTime5.withYear(97);
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.Duration duration14 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.PeriodType periodType16 = null;
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration14, readableInstant15, periodType16);
        org.joda.time.Duration duration20 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.PeriodType periodType22 = null;
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration20, readableInstant21, periodType22);
        boolean boolean24 = duration14.isLongerThan((org.joda.time.ReadableDuration) duration20);
        org.joda.time.Duration duration27 = new org.joda.time.Duration((long) ' ', (long) ' ');
        org.joda.time.Period period28 = duration27.toPeriod();
        org.joda.time.Duration duration30 = duration27.plus((long) (byte) 0);
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.Period period32 = duration27.toPeriodTo(readableInstant31);
        org.joda.time.Duration duration34 = duration27.minus(43200000L);
        org.joda.time.Duration duration36 = duration20.withDurationAdded((org.joda.time.ReadableDuration) duration27, (int) ' ');
        java.lang.String str37 = duration20.toString();
        org.joda.time.Duration duration39 = new org.joda.time.Duration((long) 365);
        boolean boolean40 = duration20.isLongerThan((org.joda.time.ReadableDuration) duration39);
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.DateTime dateTime42 = new org.joda.time.DateTime(chronology41);
        org.joda.time.DateTime.Property property43 = dateTime42.yearOfEra();
        org.joda.time.Interval interval44 = property43.toInterval();
        org.joda.time.PeriodType periodType45 = org.joda.time.PeriodType.months();
        org.joda.time.Period period46 = interval44.toPeriod(periodType45);
        org.joda.time.PeriodType periodType47 = periodType45.withYearsRemoved();
        org.joda.time.Period period48 = duration39.toPeriod(periodType47);
        org.joda.time.Instant instant50 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime51 = instant50.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.DateTime dateTime53 = dateTime51.withZoneRetainFields(dateTimeZone52);
        org.joda.time.Instant instant55 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime56 = instant55.toDateTime();
        org.joda.time.DateTime.Property property57 = dateTime56.era();
        org.joda.time.DateTime dateTime58 = dateTime56.withTimeAtStartOfDay();
        org.joda.time.Duration duration61 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant62 = null;
        org.joda.time.PeriodType periodType63 = null;
        org.joda.time.MutablePeriod mutablePeriod64 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration61, readableInstant62, periodType63);
        mutablePeriod64.setMonths((int) '4');
        org.joda.time.DateTime dateTime67 = dateTime56.plus((org.joda.time.ReadablePeriod) mutablePeriod64);
        org.joda.time.DateTime dateTime69 = dateTime56.minusWeeks((int) (byte) 1);
        int int70 = dateTime53.compareTo((org.joda.time.ReadableInstant) dateTime56);
        org.joda.time.DateTime.Property property71 = dateTime56.minuteOfHour();
        org.joda.time.DateTime dateTime73 = dateTime56.withYear(1969);
        org.joda.time.Chronology chronology74 = dateTime73.getChronology();
        org.joda.time.DateTimeField dateTimeField75 = chronology74.dayOfMonth();
        org.joda.time.DurationField durationField76 = chronology74.weekyears();
        org.joda.time.Period period77 = new org.joda.time.Period(69L, periodType47, chronology74);
        org.joda.time.Period period78 = new org.joda.time.Period(20532372436819045L, 31535999899L, periodType47);
        org.joda.time.PeriodType periodType79 = periodType47.withWeeksRemoved();
        org.joda.time.Period period80 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime7, readableInstant8, periodType47);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant50 and dateTime51", (instant50.compareTo(dateTime51) == 0) == instant50.equals(dateTime51));
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2578");
        org.joda.time.Instant instant2 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime3 = instant2.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = dateTime3.withZoneRetainFields(dateTimeZone4);
        org.joda.time.Instant instant7 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime8 = instant7.toDateTime();
        org.joda.time.DateTime.Property property9 = dateTime8.era();
        org.joda.time.DateTime dateTime10 = dateTime8.withTimeAtStartOfDay();
        org.joda.time.Duration duration13 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.PeriodType periodType15 = null;
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration13, readableInstant14, periodType15);
        mutablePeriod16.setMonths((int) '4');
        org.joda.time.DateTime dateTime19 = dateTime8.plus((org.joda.time.ReadablePeriod) mutablePeriod16);
        org.joda.time.DateTime dateTime21 = dateTime8.minusWeeks((int) (byte) 1);
        int int22 = dateTime5.compareTo((org.joda.time.ReadableInstant) dateTime8);
        org.joda.time.DateTime.Property property23 = dateTime8.minuteOfHour();
        org.joda.time.DateTime dateTime25 = dateTime8.withYear(1969);
        org.joda.time.Chronology chronology26 = dateTime25.getChronology();
        org.joda.time.DateTimeField dateTimeField27 = chronology26.year();
        org.joda.time.DateTimeField dateTimeField28 = chronology26.millisOfDay();
        java.lang.String str29 = chronology26.toString();
        org.joda.time.MutablePeriod mutablePeriod30 = new org.joda.time.MutablePeriod((long) (short) 10, chronology26);
        mutablePeriod30.setMillis(70);
        org.joda.time.Duration duration35 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.PeriodType periodType37 = null;
        org.joda.time.MutablePeriod mutablePeriod38 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration35, readableInstant36, periodType37);
        org.joda.time.Days days39 = org.joda.time.Days.THREE;
        org.joda.time.DurationFieldType durationFieldType40 = org.joda.time.DurationFieldType.minutes();
        int int41 = days39.get(durationFieldType40);
        mutablePeriod38.add(durationFieldType40, 8);
        int int44 = mutablePeriod38.getHours();
        mutablePeriod38.addMillis(10);
        mutablePeriod38.setSeconds((int) (short) -1);
        int int49 = mutablePeriod38.getMinutes();
        mutablePeriod38.setPeriod(37868342400000L);
        org.joda.time.MutablePeriod mutablePeriod56 = new org.joda.time.MutablePeriod((int) (short) 10, (int) (short) 10, (int) (byte) 0, 100);
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.DateTime dateTime58 = new org.joda.time.DateTime(chronology57);
        org.joda.time.DateTime.Property property59 = dateTime58.yearOfEra();
        org.joda.time.Interval interval60 = property59.toInterval();
        org.joda.time.Chronology chronology61 = null;
        org.joda.time.DateTime dateTime62 = new org.joda.time.DateTime(chronology61);
        org.joda.time.DateTime.Property property63 = dateTime62.yearOfEra();
        org.joda.time.Interval interval64 = property63.toInterval();
        boolean boolean65 = interval60.contains((org.joda.time.ReadableInterval) interval64);
        java.lang.String str66 = interval64.toString();
        org.joda.time.Chronology chronology67 = null;
        org.joda.time.DateTime dateTime68 = new org.joda.time.DateTime(chronology67);
        org.joda.time.DateTime.Property property69 = dateTime68.yearOfEra();
        org.joda.time.Interval interval70 = property69.toInterval();
        org.joda.time.Chronology chronology71 = null;
        org.joda.time.DateTime dateTime72 = new org.joda.time.DateTime(chronology71);
        org.joda.time.DateTime.Property property73 = dateTime72.yearOfEra();
        org.joda.time.Interval interval74 = property73.toInterval();
        boolean boolean75 = interval70.contains((org.joda.time.ReadableInterval) interval74);
        boolean boolean76 = interval64.isBefore((org.joda.time.ReadableInterval) interval74);
        mutablePeriod56.setPeriod((org.joda.time.ReadableInterval) interval74);
        org.joda.time.DurationFieldType durationFieldType78 = org.joda.time.DurationFieldType.days();
        mutablePeriod56.set(durationFieldType78, 19);
        org.joda.time.Chronology chronology81 = null;
        boolean boolean82 = durationFieldType78.isSupported(chronology81);
        mutablePeriod38.add(durationFieldType78, 35);
        mutablePeriod30.set(durationFieldType78, 0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant2 and dateTime3", (instant2.compareTo(dateTime3) == 0) == instant2.equals(dateTime3));
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2579");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime2 = instant1.toDateTime();
        org.joda.time.DateTime.Property property3 = dateTime2.era();
        org.joda.time.DateTime dateTime4 = dateTime2.withTimeAtStartOfDay();
        org.joda.time.Instant instant5 = dateTime2.toInstant();
        org.joda.time.DateTime dateTime7 = dateTime2.withMillis((long) '4');
        java.lang.Object obj8 = null;
        org.joda.time.Instant instant9 = new org.joda.time.Instant(obj8);
        org.joda.time.DateTimeZone dateTimeZone10 = instant9.getZone();
        java.lang.String str11 = dateTimeZone10.toString();
        int int13 = dateTimeZone10.getOffset(1L);
        boolean boolean15 = dateTimeZone10.isStandardOffset(0L);
        org.joda.time.DateTime dateTime16 = dateTime2.withZoneRetainFields(dateTimeZone10);
        org.joda.time.DateTime.Property property17 = dateTime16.weekOfWeekyear();
        org.joda.time.DateTime.Property property18 = dateTime16.centuryOfEra();
        org.joda.time.DateTime dateTime19 = dateTime16.withTimeAtStartOfDay();
        org.joda.time.LocalDate localDate20 = dateTime16.toLocalDate();
        org.joda.time.Chronology chronology21 = localDate20.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime2", (instant1.compareTo(dateTime2) == 0) == instant1.equals(dateTime2));
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2580");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime2 = instant1.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.withZoneRetainFields(dateTimeZone3);
        org.joda.time.Instant instant6 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime7 = instant6.toDateTime();
        org.joda.time.DateTime.Property property8 = dateTime7.era();
        org.joda.time.DateTime dateTime9 = dateTime7.withTimeAtStartOfDay();
        org.joda.time.Duration duration12 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.PeriodType periodType14 = null;
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration12, readableInstant13, periodType14);
        mutablePeriod15.setMonths((int) '4');
        org.joda.time.DateTime dateTime18 = dateTime7.plus((org.joda.time.ReadablePeriod) mutablePeriod15);
        org.joda.time.DateTime dateTime20 = dateTime7.minusWeeks((int) (byte) 1);
        int int21 = dateTime4.compareTo((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTime.Property property22 = dateTime7.minuteOfHour();
        org.joda.time.DateTime dateTime24 = dateTime7.withYear(1969);
        org.joda.time.Chronology chronology25 = dateTime24.getChronology();
        org.joda.time.DateTimeField dateTimeField26 = chronology25.year();
        org.joda.time.DateTimeField dateTimeField27 = chronology25.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField28 = chronology25.year();
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = dateTimeField28.getType();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime2", (instant1.compareTo(dateTime2) == 0) == instant1.equals(dateTime2));
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2581");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.Instant instant3 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime4 = instant3.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime4.withZoneRetainFields(dateTimeZone5);
        org.joda.time.Instant instant8 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime9 = instant8.toDateTime();
        org.joda.time.DateTime.Property property10 = dateTime9.era();
        org.joda.time.DateTime dateTime11 = dateTime9.withTimeAtStartOfDay();
        org.joda.time.Duration duration14 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.PeriodType periodType16 = null;
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration14, readableInstant15, periodType16);
        mutablePeriod17.setMonths((int) '4');
        org.joda.time.DateTime dateTime20 = dateTime9.plus((org.joda.time.ReadablePeriod) mutablePeriod17);
        org.joda.time.DateTime dateTime22 = dateTime9.minusWeeks((int) (byte) 1);
        int int23 = dateTime6.compareTo((org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.DateTime.Property property24 = dateTime9.minuteOfHour();
        org.joda.time.DateTime dateTime26 = dateTime9.withYear(1969);
        org.joda.time.Chronology chronology27 = dateTime26.getChronology();
        org.joda.time.DateTimeField dateTimeField28 = chronology27.dayOfMonth();
        org.joda.time.DurationField durationField29 = chronology27.minutes();
        org.joda.time.DateTime dateTime30 = dateTime1.toDateTime(chronology27);
        org.joda.time.DateTime dateTime32 = dateTime1.plusMillis(6);
        org.joda.time.Instant instant34 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime35 = instant34.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.DateTime dateTime37 = dateTime35.withZoneRetainFields(dateTimeZone36);
        org.joda.time.Instant instant39 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime40 = instant39.toDateTime();
        org.joda.time.DateTime.Property property41 = dateTime40.era();
        org.joda.time.DateTime dateTime42 = dateTime40.withTimeAtStartOfDay();
        org.joda.time.Duration duration45 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant46 = null;
        org.joda.time.PeriodType periodType47 = null;
        org.joda.time.MutablePeriod mutablePeriod48 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration45, readableInstant46, periodType47);
        mutablePeriod48.setMonths((int) '4');
        org.joda.time.DateTime dateTime51 = dateTime40.plus((org.joda.time.ReadablePeriod) mutablePeriod48);
        org.joda.time.DateTime dateTime53 = dateTime40.minusWeeks((int) (byte) 1);
        int int54 = dateTime37.compareTo((org.joda.time.ReadableInstant) dateTime40);
        org.joda.time.DateTime.Property property55 = dateTime40.minuteOfHour();
        org.joda.time.DateTime dateTime57 = dateTime40.withYear(1969);
        org.joda.time.Chronology chronology58 = dateTime57.getChronology();
        org.joda.time.DateTimeField dateTimeField59 = chronology58.year();
        org.joda.time.DateTimeField dateTimeField60 = chronology58.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField61 = chronology58.year();
        org.joda.time.DateTimeZone dateTimeZone62 = chronology58.getZone();
        org.joda.time.DateTime dateTime63 = dateTime32.withChronology(chronology58);
        org.joda.time.DurationField durationField64 = chronology58.days();
        org.joda.time.DurationField durationField65 = chronology58.seconds();
        long long67 = durationField65.getValueAsLong(12626452497600000L);
        java.lang.String str68 = durationField65.getName();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and dateTime4", (instant3.compareTo(dateTime4) == 0) == instant3.equals(dateTime4));
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2582");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime2 = instant1.toDateTime();
        org.joda.time.DateTime.Property property3 = dateTime2.era();
        org.joda.time.DateTime dateTime4 = property3.withMinimumValue();
        int int5 = property3.getMaximumValueOverall();
        java.util.Locale locale6 = java.util.Locale.ENGLISH;
        java.lang.String str7 = locale6.getScript();
        java.lang.String str8 = locale6.getDisplayCountry();
        int int9 = property3.getMaximumShortTextLength(locale6);
        org.joda.time.DateTime dateTime10 = property3.withMaximumValue();
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime13 = instant12.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = dateTime13.withZoneRetainFields(dateTimeZone14);
        org.joda.time.DateTime.Property property16 = dateTime15.weekOfWeekyear();
        org.joda.time.Duration duration19 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.PeriodType periodType21 = null;
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration19, readableInstant20, periodType21);
        org.joda.time.DateTime dateTime23 = dateTime15.plus((org.joda.time.ReadableDuration) duration19);
        org.joda.time.DateTime dateTime25 = dateTime15.withYearOfEra(9);
        org.joda.time.Weeks weeks26 = org.joda.time.Weeks.weeksBetween((org.joda.time.ReadableInstant) dateTime10, (org.joda.time.ReadableInstant) dateTime25);
        org.joda.time.Duration duration29 = new org.joda.time.Duration((long) ' ', (long) ' ');
        org.joda.time.Period period30 = duration29.toPeriod();
        org.joda.time.DurationFieldType[] durationFieldTypeArray31 = period30.getFieldTypes();
        int int32 = period30.getMinutes();
        org.joda.time.Weeks weeks33 = period30.toStandardWeeks();
        boolean boolean34 = weeks26.isGreaterThan(weeks33);
        org.joda.time.Weeks weeks35 = weeks26.negated();
        org.joda.time.PeriodType periodType36 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType37 = periodType36.withMonthsRemoved();
        java.lang.String str38 = periodType37.getName();
        org.joda.time.Instant instant40 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime41 = instant40.toDateTime();
        org.joda.time.DateTime.Property property42 = dateTime41.era();
        org.joda.time.DateTime dateTime43 = dateTime41.withTimeAtStartOfDay();
        org.joda.time.Instant instant44 = dateTime41.toInstant();
        boolean boolean45 = periodType37.equals((java.lang.Object) dateTime41);
        org.joda.time.Instant instant47 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime48 = instant47.toDateTime();
        org.joda.time.DateTime.Property property49 = dateTime48.era();
        org.joda.time.DateTime dateTime50 = property49.withMinimumValue();
        boolean boolean51 = dateTime50.isAfterNow();
        org.joda.time.Weeks weeks52 = org.joda.time.Weeks.weeksBetween((org.joda.time.ReadableInstant) dateTime41, (org.joda.time.ReadableInstant) dateTime50);
        org.joda.time.Duration duration53 = weeks52.toStandardDuration();
        org.joda.time.Weeks weeks54 = weeks52.negated();
        org.joda.time.Weeks weeks55 = weeks26.plus(weeks54);
        org.joda.time.Weeks weeks57 = weeks54.minus(105);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime2", (instant1.compareTo(dateTime2) == 0) == instant1.equals(dateTime2));
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2583");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        org.joda.time.Duration duration4 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.PeriodType periodType6 = null;
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration4, readableInstant5, periodType6);
        org.joda.time.Days days8 = org.joda.time.Days.THREE;
        org.joda.time.DurationFieldType durationFieldType9 = org.joda.time.DurationFieldType.minutes();
        int int10 = days8.get(durationFieldType9);
        mutablePeriod7.add(durationFieldType9, 8);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        mutablePeriod7.add(readablePeriod13);
        int int15 = mutablePeriod7.getMonths();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime(chronology16);
        org.joda.time.DateTime.Property property18 = dateTime17.yearOfEra();
        org.joda.time.Interval interval19 = property18.toInterval();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(chronology20);
        org.joda.time.DateTime.Property property22 = dateTime21.yearOfEra();
        org.joda.time.Interval interval23 = property22.toInterval();
        boolean boolean24 = interval19.contains((org.joda.time.ReadableInterval) interval23);
        mutablePeriod7.setPeriod((org.joda.time.ReadableInterval) interval19);
        org.joda.time.DurationFieldType durationFieldType27 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.Instant instant29 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime30 = instant29.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.DateTime dateTime32 = dateTime30.withZoneRetainFields(dateTimeZone31);
        org.joda.time.Instant instant34 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime35 = instant34.toDateTime();
        org.joda.time.DateTime.Property property36 = dateTime35.era();
        org.joda.time.DateTime dateTime37 = dateTime35.withTimeAtStartOfDay();
        org.joda.time.Duration duration40 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant41 = null;
        org.joda.time.PeriodType periodType42 = null;
        org.joda.time.MutablePeriod mutablePeriod43 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration40, readableInstant41, periodType42);
        mutablePeriod43.setMonths((int) '4');
        org.joda.time.DateTime dateTime46 = dateTime35.plus((org.joda.time.ReadablePeriod) mutablePeriod43);
        org.joda.time.DateTime dateTime48 = dateTime35.minusWeeks((int) (byte) 1);
        int int49 = dateTime32.compareTo((org.joda.time.ReadableInstant) dateTime35);
        org.joda.time.DateTime.Property property50 = dateTime35.minuteOfHour();
        org.joda.time.DateTime dateTime52 = dateTime35.withYear(1969);
        org.joda.time.Chronology chronology53 = dateTime52.getChronology();
        org.joda.time.DurationField durationField54 = durationFieldType27.getField(chronology53);
        mutablePeriod7.add((-43199999L), chronology53);
        org.joda.time.DurationField durationField56 = chronology53.millis();
        org.joda.time.DurationField durationField57 = chronology53.months();
        org.joda.time.DateTime dateTime58 = new org.joda.time.DateTime((long) 69, chronology53);
        org.joda.time.DateTimeField dateTimeField59 = chronology53.minuteOfDay();
        org.joda.time.DurationField durationField60 = chronology53.months();
        org.joda.time.DateTime dateTime61 = org.joda.time.DateTime.now(chronology53);
        org.joda.time.DateTimeField dateTimeField62 = dateTimeFieldType0.getField(chronology53);
        org.joda.time.DurationField durationField63 = chronology53.days();
        long long66 = durationField63.subtract((-36744L), (-19L));
        java.lang.String str67 = durationField63.getName();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant29 and dateTime30", (instant29.compareTo(dateTime30) == 0) == instant29.equals(dateTime30));
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2584");
        java.lang.Object obj0 = null;
        org.joda.time.Instant instant1 = new org.joda.time.Instant(obj0);
        org.joda.time.DateTimeZone dateTimeZone2 = instant1.getZone();
        java.lang.String str3 = dateTimeZone2.toString();
        int int5 = dateTimeZone2.getOffset(1L);
        boolean boolean7 = dateTimeZone2.isStandardOffset(0L);
        java.lang.String str9 = dateTimeZone2.getNameKey((long) 1);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(dateTimeZone2);
        org.joda.time.DateTime.Property property11 = dateTime10.secondOfDay();
        org.joda.time.DateTime dateTime13 = property11.addToCopy((int) ' ');
        org.joda.time.Duration duration15 = org.joda.time.Duration.millis(0L);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime(chronology16);
        org.joda.time.DateTime.Property property18 = dateTime17.yearOfEra();
        org.joda.time.Interval interval19 = property18.toInterval();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(chronology20);
        org.joda.time.DateTime.Property property22 = dateTime21.yearOfEra();
        org.joda.time.Interval interval23 = property22.toInterval();
        boolean boolean24 = interval19.contains((org.joda.time.ReadableInterval) interval23);
        java.lang.String str25 = interval19.toString();
        long long26 = interval19.getEndMillis();
        org.joda.time.Instant instant28 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime29 = instant28.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.DateTime dateTime31 = dateTime29.withZoneRetainFields(dateTimeZone30);
        org.joda.time.Instant instant33 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime34 = instant33.toDateTime();
        org.joda.time.DateTime.Property property35 = dateTime34.era();
        org.joda.time.DateTime dateTime36 = dateTime34.withTimeAtStartOfDay();
        org.joda.time.Duration duration39 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.PeriodType periodType41 = null;
        org.joda.time.MutablePeriod mutablePeriod42 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration39, readableInstant40, periodType41);
        mutablePeriod42.setMonths((int) '4');
        org.joda.time.DateTime dateTime45 = dateTime34.plus((org.joda.time.ReadablePeriod) mutablePeriod42);
        org.joda.time.DateTime dateTime47 = dateTime34.minusWeeks((int) (byte) 1);
        int int48 = dateTime31.compareTo((org.joda.time.ReadableInstant) dateTime34);
        org.joda.time.DateTime.Property property49 = dateTime34.minuteOfHour();
        org.joda.time.DateTime dateTime51 = dateTime34.withYear(1969);
        org.joda.time.Chronology chronology52 = dateTime51.getChronology();
        boolean boolean53 = interval19.isBefore((org.joda.time.ReadableInstant) dateTime51);
        org.joda.time.Duration duration56 = new org.joda.time.Duration((long) ' ', (long) ' ');
        org.joda.time.Period period57 = duration56.toPeriod();
        org.joda.time.Duration duration59 = duration56.plus((long) (byte) 0);
        org.joda.time.ReadableInstant readableInstant60 = null;
        org.joda.time.Period period61 = duration56.toPeriodTo(readableInstant60);
        org.joda.time.Instant instant63 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.Instant instant65 = instant63.minus(100L);
        java.lang.String str66 = instant65.toString();
        org.joda.time.Duration duration69 = new org.joda.time.Duration((long) ' ', (long) ' ');
        org.joda.time.Period period70 = duration69.toPeriod();
        org.joda.time.Duration duration72 = duration69.plus((long) (byte) 0);
        org.joda.time.ReadableInstant readableInstant73 = null;
        org.joda.time.Period period74 = duration69.toPeriodTo(readableInstant73);
        org.joda.time.Duration duration77 = duration69.withDurationAdded((long) (short) -1, (int) (byte) 100);
        org.joda.time.PeriodType periodType80 = org.joda.time.PeriodType.yearDay();
        org.joda.time.Chronology chronology81 = null;
        org.joda.time.MutablePeriod mutablePeriod82 = new org.joda.time.MutablePeriod((long) 100, 0L, periodType80, chronology81);
        org.joda.time.PeriodType periodType83 = periodType80.withWeeksRemoved();
        org.joda.time.Chronology chronology84 = null;
        org.joda.time.Period period85 = duration77.toPeriod(periodType83, chronology84);
        org.joda.time.Period period86 = duration56.toPeriodFrom((org.joda.time.ReadableInstant) instant65, periodType83);
        org.joda.time.Period period87 = interval19.toPeriod(periodType83);
        org.joda.time.MutablePeriod mutablePeriod88 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime13, (org.joda.time.ReadableDuration) duration15, periodType83);
        org.joda.time.Minutes minutes89 = org.joda.time.Minutes.standardMinutesIn((org.joda.time.ReadablePeriod) mutablePeriod88);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime17", (instant1.compareTo(dateTime17) == 0) == instant1.equals(dateTime17));
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2585");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime2 = instant1.toDateTime();
        org.joda.time.DateTime.Property property3 = dateTime2.era();
        org.joda.time.DateTime dateTime4 = dateTime2.withTimeAtStartOfDay();
        org.joda.time.Duration duration7 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.PeriodType periodType9 = null;
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration7, readableInstant8, periodType9);
        mutablePeriod10.setMonths((int) '4');
        org.joda.time.DateTime dateTime13 = dateTime2.plus((org.joda.time.ReadablePeriod) mutablePeriod10);
        org.joda.time.DateTime dateTime15 = dateTime2.minusWeeks((int) (byte) 1);
        org.joda.time.DateTime.Property property16 = dateTime15.monthOfYear();
        org.joda.time.DateTime.Property property17 = dateTime15.weekyear();
        org.joda.time.DateTime dateTime18 = dateTime15.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetHours(0);
        org.joda.time.DateTime dateTime21 = dateTime18.withZone(dateTimeZone20);
        org.joda.time.Instant instant23 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime24 = instant23.toDateTime();
        org.joda.time.DateTime.Property property25 = dateTime24.era();
        org.joda.time.DateTime dateTime26 = dateTime24.withTimeAtStartOfDay();
        org.joda.time.Instant instant27 = dateTime24.toInstant();
        org.joda.time.DateMidnight dateMidnight28 = dateTime24.toDateMidnight();
        int int29 = dateMidnight28.getDayOfYear();
        boolean boolean30 = dateMidnight28.isAfterNow();
        org.joda.time.Instant instant31 = dateMidnight28.toInstant();
        boolean boolean32 = dateTime21.isEqual((org.joda.time.ReadableInstant) dateMidnight28);
        org.joda.time.LocalDate localDate33 = dateTime21.toLocalDate();
        org.joda.time.Duration duration36 = new org.joda.time.Duration(27349920L, 8772796800062L);
        org.joda.time.Instant instant40 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime41 = instant40.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.DateTime dateTime43 = dateTime41.withZoneRetainFields(dateTimeZone42);
        org.joda.time.Instant instant45 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime46 = instant45.toDateTime();
        org.joda.time.DateTime.Property property47 = dateTime46.era();
        org.joda.time.DateTime dateTime48 = dateTime46.withTimeAtStartOfDay();
        org.joda.time.Duration duration51 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant52 = null;
        org.joda.time.PeriodType periodType53 = null;
        org.joda.time.MutablePeriod mutablePeriod54 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration51, readableInstant52, periodType53);
        mutablePeriod54.setMonths((int) '4');
        org.joda.time.DateTime dateTime57 = dateTime46.plus((org.joda.time.ReadablePeriod) mutablePeriod54);
        org.joda.time.DateTime dateTime59 = dateTime46.minusWeeks((int) (byte) 1);
        int int60 = dateTime43.compareTo((org.joda.time.ReadableInstant) dateTime46);
        org.joda.time.DateTime.Property property61 = dateTime46.minuteOfHour();
        org.joda.time.DateTime dateTime63 = dateTime46.withYear(1969);
        org.joda.time.Chronology chronology64 = dateTime63.getChronology();
        org.joda.time.DateTimeField dateTimeField65 = chronology64.year();
        org.joda.time.DateTimeField dateTimeField66 = chronology64.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField67 = chronology64.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField68 = chronology64.weekyearOfCentury();
        org.joda.time.MutablePeriod mutablePeriod69 = new org.joda.time.MutablePeriod(128770560000000000L, (long) (short) -1, chronology64);
        boolean boolean70 = duration36.equals((java.lang.Object) chronology64);
        org.joda.time.MutableDateTime mutableDateTime71 = dateTime21.toMutableDateTime(chronology64);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime2", (instant1.compareTo(dateTime2) == 0) == instant1.equals(dateTime2));
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2586");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime.Property property2 = dateTime1.yearOfEra();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(chronology4);
        org.joda.time.DateTime.Property property6 = dateTime5.yearOfEra();
        org.joda.time.Interval interval7 = property6.toInterval();
        boolean boolean8 = interval3.contains((org.joda.time.ReadableInterval) interval7);
        org.joda.time.Chronology chronology9 = interval7.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.weeks();
        org.joda.time.DateTimeField dateTimeField11 = chronology9.minuteOfDay();
        org.joda.time.DurationField durationField12 = chronology9.days();
        org.joda.time.Instant instant14 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime15 = instant14.toDateTime();
        org.joda.time.DateTime.Property property16 = dateTime15.era();
        org.joda.time.DateTime dateTime17 = property16.withMinimumValue();
        int int18 = property16.getMaximumValueOverall();
        java.util.Locale locale19 = java.util.Locale.ENGLISH;
        java.lang.String str20 = locale19.getScript();
        java.lang.String str21 = locale19.getDisplayCountry();
        int int22 = property16.getMaximumShortTextLength(locale19);
        org.joda.time.DateTime dateTime23 = property16.withMaximumValue();
        org.joda.time.LocalTime localTime24 = dateTime23.toLocalTime();
        long long26 = chronology9.set((org.joda.time.ReadablePartial) localTime24, (long) (byte) 10);
        org.joda.time.Instant instant28 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime29 = instant28.toDateTime();
        org.joda.time.DateTime.Property property30 = dateTime29.era();
        org.joda.time.DateTime dateTime31 = property30.withMinimumValue();
        int int32 = property30.getMaximumValueOverall();
        java.util.Locale locale33 = java.util.Locale.ENGLISH;
        java.lang.String str34 = locale33.getScript();
        java.lang.String str35 = locale33.getDisplayCountry();
        int int36 = property30.getMaximumShortTextLength(locale33);
        org.joda.time.DateTime dateTime37 = property30.withMaximumValue();
        org.joda.time.LocalTime localTime38 = dateTime37.toLocalTime();
        org.joda.time.Instant instant40 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.Instant instant42 = instant40.minus(100L);
        org.joda.time.MutableDateTime mutableDateTime43 = instant40.toMutableDateTimeISO();
        java.lang.Object obj44 = null;
        org.joda.time.Instant instant45 = new org.joda.time.Instant(obj44);
        boolean boolean46 = mutableDateTime43.isAfter((org.joda.time.ReadableInstant) instant45);
        boolean boolean47 = localTime38.equals((java.lang.Object) mutableDateTime43);
        org.joda.time.Chronology chronology48 = localTime38.getChronology();
        org.joda.time.DateTimeFieldType dateTimeFieldType49 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.DateTimeField dateTimeField51 = dateTimeFieldType49.getField(chronology50);
        long long54 = dateTimeField51.add(0L, (long) (short) 1);
        long long56 = dateTimeField51.roundHalfCeiling((long) 2);
        org.joda.time.Instant instant58 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.DateTime dateTime59 = instant58.toDateTime();
        org.joda.time.DateTime.Property property60 = dateTime59.era();
        org.joda.time.Instant instant62 = new org.joda.time.Instant((long) (byte) -1);
        org.joda.time.Instant instant64 = instant62.minus(100L);
        org.joda.time.Instant instant66 = instant64.plus((long) 100);
        org.joda.time.Instant instant68 = instant64.withMillis((long) (byte) 1);
        org.joda.time.Minutes minutes69 = org.joda.time.Minutes.minutesBetween((org.joda.time.ReadableInstant) dateTime59, (org.joda.time.ReadableInstant) instant64);
        org.joda.time.LocalTime localTime70 = dateTime59.toLocalTime();
        org.joda.time.Duration duration74 = new org.joda.time.Duration((-1L), 10L);
        org.joda.time.ReadableInstant readableInstant75 = null;
        org.joda.time.PeriodType periodType76 = null;
        org.joda.time.MutablePeriod mutablePeriod77 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration74, readableInstant75, periodType76);
        mutablePeriod77.setMonths((int) '4');
        org.joda.time.Period period80 = mutablePeriod77.toPeriod();
        int[] intArray81 = period80.getValues();
        int[] intArray83 = dateTimeField51.addWrapField((org.joda.time.ReadablePartial) localTime70, 0, intArray81, 3);
        org.joda.time.Period period84 = new org.joda.time.Period((org.joda.time.ReadablePartial) localTime38, (org.joda.time.ReadablePartial) localTime70);
        org.joda.time.Minutes minutes85 = org.joda.time.Minutes.minutesBetween((org.joda.time.ReadablePartial) localTime24, (org.joda.time.ReadablePartial) localTime70);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant14 and dateTime15", (instant14.compareTo(dateTime15) == 0) == instant14.equals(dateTime15));
    }
}

