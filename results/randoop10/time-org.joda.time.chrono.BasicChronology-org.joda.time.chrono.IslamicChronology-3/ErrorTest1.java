import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest1 {

    public static boolean debug = false;

    @Test
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test501");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.minusMinutes(0);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.withYearOfEra((int) (byte) 10);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfYear();
        org.joda.time.LocalDateTime.Property property6 = localDateTime4.era();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology9 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone8);
        org.joda.time.DurationField durationField10 = islamicChronology9.weekyears();
        org.joda.time.DurationField durationField11 = islamicChronology9.months();
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology9.minuteOfHour();
        org.joda.time.DurationField durationField13 = islamicChronology9.hours();
        org.joda.time.DateTimeField dateTimeField14 = islamicChronology9.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((long) 1);
        int int17 = localDateTime16.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.minusHours((int) (byte) -1);
        int int20 = localDateTime16.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime22 = localDateTime16.minusMinutes((int) '#');
        org.joda.time.LocalDateTime.Property property23 = localDateTime22.centuryOfEra();
        java.util.Locale locale25 = java.util.Locale.FRENCH;
        java.lang.String str26 = dateTimeField14.getAsShortText((org.joda.time.ReadablePartial) localDateTime22, (int) (short) 100, locale25);
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime((long) 1);
        int int29 = localDateTime28.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime31 = localDateTime28.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology34 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone33);
        org.joda.time.DateTime dateTime35 = localDateTime28.toDateTime(dateTimeZone33);
        org.joda.time.ReadableInstant readableInstant36 = null;
        boolean boolean37 = dateTime35.isAfter(readableInstant36);
        org.joda.time.Instant instant38 = dateTime35.toInstant();
        org.joda.time.DateTime dateTime39 = localDateTime22.toDateTime((org.joda.time.ReadableInstant) instant38);
        org.joda.time.Instant instant40 = instant38.toInstant();
        int int41 = property6.compareTo((org.joda.time.ReadableInstant) instant40);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime35 and instant40", (dateTime35.compareTo(instant40) == 0) == dateTime35.equals(instant40));
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test502");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology2.yearOfEra();
        org.joda.time.DurationField durationField5 = islamicChronology2.hours();
        org.joda.time.DateTimeZone dateTimeZone6 = islamicChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology2.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology2.minuteOfHour();
        org.joda.time.DurationField durationField9 = islamicChronology2.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField3, and durationField5", !(durationField9.compareTo(durationField3) == 0) || (Math.signum(durationField9.compareTo(durationField5)) == Math.signum(durationField3.compareTo(durationField5))));
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test503");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology2.yearOfEra();
        long long6 = dateTimeField4.roundCeiling(0L);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) 1);
        int int9 = localDateTime8.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.minusHours((int) (byte) -1);
        int int12 = localDateTime8.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime8.withMinuteOfHour((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime8.plusHours((int) (byte) 100);
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.LocalDateTime localDateTime18 = localDateTime8.minus(readableDuration17);
        java.util.Locale locale19 = java.util.Locale.PRC;
        java.util.Locale locale20 = locale19.stripExtensions();
        java.lang.String str21 = dateTimeField4.getAsShortText((org.joda.time.ReadablePartial) localDateTime18, locale19);
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        org.joda.time.LocalDateTime localDateTime23 = localDateTime18.plus(readablePeriod22);
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        org.joda.time.LocalDateTime localDateTime25 = localDateTime18.plus(readablePeriod24);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime25.plusMonths((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.withDayOfYear(5);
        org.joda.time.LocalDateTime.Property property30 = localDateTime29.dayOfMonth();
        org.joda.time.DateTime dateTime31 = localDateTime29.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone32 = dateTime31.getZone();
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime((long) 1);
        int int35 = localDateTime34.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime37 = localDateTime34.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology40 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone39);
        org.joda.time.DateTime dateTime41 = localDateTime34.toDateTime(dateTimeZone39);
        long long42 = dateTime41.getMillis();
        long long43 = dateTime41.getMillis();
        org.joda.time.Instant instant44 = dateTime41.toInstant();
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology47 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone46);
        org.joda.time.DurationField durationField48 = islamicChronology47.weekyears();
        org.joda.time.DurationField durationField49 = islamicChronology47.halfdays();
        org.joda.time.DateTimeField dateTimeField50 = islamicChronology47.yearOfEra();
        org.joda.time.DateTimeField dateTimeField51 = islamicChronology47.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField52 = islamicChronology47.weekyear();
        org.joda.time.DurationField durationField53 = islamicChronology47.days();
        org.joda.time.DateTimeField dateTimeField54 = islamicChronology47.millisOfSecond();
        org.joda.time.DateTimeFieldType dateTimeFieldType55 = dateTimeField54.getType();
        boolean boolean56 = dateTime41.isSupported(dateTimeFieldType55);
        boolean boolean57 = dateTime31.isEqual((org.joda.time.ReadableInstant) dateTime41);
        org.joda.time.DateTimeZone dateTimeZone58 = dateTime41.getZone();
        org.joda.time.DateTimeZone dateTimeZone60 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology61 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone60);
        org.joda.time.DateTimeField dateTimeField62 = islamicChronology61.yearOfCentury();
        org.joda.time.DurationField durationField63 = islamicChronology61.years();
        org.joda.time.LocalDateTime localDateTime65 = new org.joda.time.LocalDateTime((long) 1);
        int int66 = localDateTime65.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime68 = localDateTime65.minusHours((int) (byte) -1);
        int int70 = localDateTime65.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime72 = localDateTime65.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod73 = null;
        org.joda.time.LocalDateTime localDateTime74 = localDateTime65.minus(readablePeriod73);
        int int75 = localDateTime74.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField77 = localDateTime74.getField(0);
        org.joda.time.LocalDateTime.Property property78 = localDateTime74.centuryOfEra();
        int[] intArray80 = islamicChronology61.get((org.joda.time.ReadablePartial) localDateTime74, (long) 0);
        org.joda.time.DateTimeField dateTimeField81 = islamicChronology61.millisOfDay();
        org.joda.time.DurationField durationField82 = islamicChronology61.days();
        org.joda.time.DateTimeField dateTimeField83 = islamicChronology61.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField84 = islamicChronology61.secondOfMinute();
        boolean boolean85 = dateTime41.equals((java.lang.Object) dateTimeField84);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField63", (durationField3.compareTo(durationField63) == 0) == durationField3.equals(durationField63));
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test504");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology2.weekyear();
        org.joda.time.DurationField durationField4 = islamicChronology2.years();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology2.hourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology2.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology2.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone9 = islamicChronology2.getZone();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology13 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone12);
        org.joda.time.DurationField durationField14 = islamicChronology13.weekyears();
        org.joda.time.DurationField durationField15 = islamicChronology13.halfdays();
        org.joda.time.DateTimeField dateTimeField16 = islamicChronology13.yearOfEra();
        org.joda.time.DateTimeField dateTimeField17 = islamicChronology13.halfdayOfDay();
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime((long) 1);
        int int20 = localDateTime19.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime22 = localDateTime19.minusHours((int) (byte) -1);
        int int23 = localDateTime19.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime25 = localDateTime19.minusMinutes((int) '#');
        org.joda.time.LocalDateTime localDateTime27 = localDateTime19.plusMonths((-1));
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime((long) 1);
        int int30 = localDateTime29.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime32 = localDateTime29.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology35 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone34);
        org.joda.time.DurationField durationField36 = islamicChronology35.weekyears();
        org.joda.time.DurationField durationField37 = islamicChronology35.halfdays();
        org.joda.time.DateTimeField dateTimeField38 = islamicChronology35.yearOfEra();
        org.joda.time.DurationField durationField39 = islamicChronology35.halfdays();
        org.joda.time.DurationFieldType durationFieldType40 = durationField39.getType();
        boolean boolean41 = localDateTime29.isSupported(durationFieldType40);
        org.joda.time.LocalDateTime localDateTime43 = localDateTime19.withFieldAdded(durationFieldType40, 12);
        org.joda.time.tz.NameProvider nameProvider44 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale45 = java.util.Locale.KOREA;
        java.util.Set<java.lang.String> strSet46 = locale45.getUnicodeLocaleAttributes();
        java.lang.String str48 = locale45.getUnicodeLocaleType("FR");
        java.lang.String str51 = nameProvider44.getName(locale45, "\uc601\uc5b4", "GMT+00:00");
        java.lang.String str52 = dateTimeField17.getAsText((org.joda.time.ReadablePartial) localDateTime19, locale45);
        java.lang.String str53 = locale45.getISO3Language();
        java.util.Locale locale54 = locale45.stripExtensions();
        java.util.Locale locale55 = java.util.Locale.ENGLISH;
        java.lang.String str56 = locale45.getDisplayLanguage(locale55);
        java.lang.String str57 = dateTimeZone9.getShortName(295871022L, locale55);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField14", (durationField4.compareTo(durationField14) == 0) == durationField4.equals(durationField14));
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test505");
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(100, (int) (short) 10, (int) (short) 10, (int) (byte) 0, 0, (int) ' ');
        int int7 = localDateTime6.getMinuteOfHour();
        org.joda.time.LocalDateTime.Property property8 = localDateTime6.hourOfDay();
        org.joda.time.LocalDateTime localDateTime10 = property8.addToCopy((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology13 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone12);
        org.joda.time.DateTimeField dateTimeField14 = islamicChronology13.yearOfCentury();
        org.joda.time.DurationField durationField15 = islamicChronology13.years();
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime((long) 1);
        int int18 = localDateTime17.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime17.minusHours((int) (byte) -1);
        int int22 = localDateTime17.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime17.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        org.joda.time.LocalDateTime localDateTime26 = localDateTime17.minus(readablePeriod25);
        int int27 = localDateTime26.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField29 = localDateTime26.getField(0);
        org.joda.time.LocalDateTime.Property property30 = localDateTime26.centuryOfEra();
        int[] intArray32 = islamicChronology13.get((org.joda.time.ReadablePartial) localDateTime26, (long) 0);
        org.joda.time.DateTimeField dateTimeField33 = islamicChronology13.hourOfDay();
        org.joda.time.DurationField durationField34 = islamicChronology13.centuries();
        boolean boolean35 = property8.equals((java.lang.Object) durationField34);
        org.joda.time.LocalDateTime localDateTime36 = property8.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime38 = localDateTime36.minusWeeks(24);
        org.joda.time.DateTimeField dateTimeField40 = localDateTime38.getField((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime((long) 1);
        int int43 = localDateTime42.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime45 = localDateTime42.minusHours((int) (byte) -1);
        int int46 = localDateTime42.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime48 = localDateTime42.withMinuteOfHour((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime50 = localDateTime42.plusHours((int) (byte) 100);
        int int51 = localDateTime42.getMillisOfDay();
        org.joda.time.LocalDateTime localDateTime53 = localDateTime42.withWeekOfWeekyear(9);
        org.joda.time.LocalDateTime.Property property54 = localDateTime42.weekyear();
        org.joda.time.LocalDateTime localDateTime56 = localDateTime42.plusMinutes(0);
        org.joda.time.LocalDateTime localDateTime58 = new org.joda.time.LocalDateTime((long) 1);
        int int59 = localDateTime58.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime61 = localDateTime58.minusHours((int) (byte) -1);
        int int63 = localDateTime58.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime65 = localDateTime58.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod66 = null;
        org.joda.time.LocalDateTime localDateTime67 = localDateTime58.minus(readablePeriod66);
        org.joda.time.LocalDateTime.Property property68 = localDateTime58.millisOfSecond();
        long long69 = property68.remainder();
        java.lang.String str70 = property68.getName();
        int int71 = property68.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime73 = property68.addWrapFieldToCopy(70);
        org.joda.time.LocalDateTime localDateTime74 = property68.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone76 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology77 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone76);
        org.joda.time.DurationField durationField78 = islamicChronology77.weekyears();
        org.joda.time.DateTimeZone dateTimeZone80 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology81 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone80);
        boolean boolean83 = dateTimeZone80.equals((java.lang.Object) 10L);
        org.joda.time.Chronology chronology84 = islamicChronology77.withZone(dateTimeZone80);
        org.joda.time.ReadablePeriod readablePeriod85 = null;
        long long88 = islamicChronology77.add(readablePeriod85, (long) (byte) 0, (-1));
        org.joda.time.DateTimeField dateTimeField89 = islamicChronology77.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField90 = islamicChronology77.era();
        org.joda.time.DateTimeField dateTimeField91 = islamicChronology77.centuryOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType92 = dateTimeField91.getType();
        org.joda.time.LocalDateTime localDateTime94 = localDateTime74.withField(dateTimeFieldType92, 3632);
        org.joda.time.LocalDateTime.Property property95 = localDateTime42.property(dateTimeFieldType92);
        boolean boolean96 = localDateTime38.isSupported(dateTimeFieldType92);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField15 and durationField78", (durationField15.compareTo(durationField78) == 0) == durationField15.equals(durationField78));
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test506");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = islamicChronology2.years();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) 1);
        int int7 = localDateTime6.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.minusHours((int) (byte) -1);
        int int11 = localDateTime6.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime6.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalDateTime localDateTime15 = localDateTime6.minus(readablePeriod14);
        int int16 = localDateTime15.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField18 = localDateTime15.getField(0);
        org.joda.time.LocalDateTime.Property property19 = localDateTime15.centuryOfEra();
        int[] intArray21 = islamicChronology2.get((org.joda.time.ReadablePartial) localDateTime15, (long) 0);
        org.joda.time.DateTimeField dateTimeField22 = islamicChronology2.millisOfDay();
        org.joda.time.DurationField durationField23 = islamicChronology2.centuries();
        org.joda.time.DateTimeZone dateTimeZone24 = islamicChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField25 = islamicChronology2.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime();
        int[] intArray28 = islamicChronology2.get((org.joda.time.ReadablePartial) localDateTime26, 10L);
        org.joda.time.DateTimeField dateTimeField29 = islamicChronology2.secondOfDay();
        org.joda.time.DateTimeField dateTimeField30 = islamicChronology2.era();
        org.joda.time.DateTimeField dateTimeField31 = islamicChronology2.centuryOfEra();
        org.joda.time.DurationField durationField32 = islamicChronology2.halfdays();
        int int33 = islamicChronology2.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField34 = islamicChronology2.millisOfSecond();
        java.util.Set<java.lang.String> strSet35 = org.joda.time.DateTimeZone.getAvailableIDs();
        java.util.Locale locale36 = java.util.Locale.KOREA;
        java.util.Set<java.lang.String> strSet37 = locale36.getUnicodeLocaleAttributes();
        java.util.Locale locale38 = java.util.Locale.KOREA;
        java.util.Set<java.lang.String> strSet39 = locale38.getUnicodeLocaleAttributes();
        boolean boolean40 = strSet37.removeAll((java.util.Collection<java.lang.String>) strSet39);
        boolean boolean41 = strSet35.addAll((java.util.Collection<java.lang.String>) strSet37);
        java.util.Locale.LanguageRange[] languageRangeArray42 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList43 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList43, languageRangeArray42);
        java.util.Locale locale45 = java.util.Locale.JAPAN;
        java.lang.String str46 = locale45.getVariant();
        java.util.Locale locale47 = java.util.Locale.JAPAN;
        java.util.Locale locale48 = java.util.Locale.FRANCE;
        java.lang.String str49 = locale48.getCountry();
        java.util.Locale locale50 = java.util.Locale.GERMAN;
        java.util.Locale locale51 = java.util.Locale.KOREA;
        java.util.Set<java.lang.String> strSet52 = locale51.getUnicodeLocaleAttributes();
        java.util.Locale[] localeArray53 = new java.util.Locale[] { locale45, locale47, locale48, locale50, locale51 };
        java.util.ArrayList<java.util.Locale> localeList54 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList54, localeArray53);
        java.util.Locale.FilteringMode filteringMode56 = null;
        java.util.List<java.util.Locale> localeList57 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList43, (java.util.Collection<java.util.Locale>) localeList54, filteringMode56);
        boolean boolean58 = strSet37.remove((java.lang.Object) localeList54);
        boolean boolean59 = strSet37.isEmpty();
        java.util.Locale locale60 = java.util.Locale.KOREA;
        java.util.Set<java.lang.String> strSet61 = locale60.getUnicodeLocaleAttributes();
        boolean boolean62 = strSet37.removeAll((java.util.Collection<java.lang.String>) strSet61);
        org.joda.time.DateTimeZone dateTimeZone64 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology65 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone64);
        org.joda.time.DurationField durationField66 = islamicChronology65.weekyears();
        org.joda.time.DateTimeField dateTimeField67 = islamicChronology65.millisOfSecond();
        long long71 = islamicChronology65.add((long) (byte) -1, (long) 0, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime73 = new org.joda.time.LocalDateTime((long) 1);
        int int74 = localDateTime73.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime76 = localDateTime73.minusHours((int) (byte) -1);
        int int78 = localDateTime73.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime80 = localDateTime73.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod81 = null;
        org.joda.time.LocalDateTime localDateTime82 = localDateTime73.minus(readablePeriod81);
        int int83 = localDateTime82.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField85 = localDateTime82.getField(0);
        org.joda.time.LocalDateTime.Property property86 = localDateTime82.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime88 = localDateTime82.withMonthOfYear((int) (short) 10);
        boolean boolean89 = islamicChronology65.equals((java.lang.Object) localDateTime82);
        org.joda.time.DurationField durationField90 = islamicChronology65.minutes();
        boolean boolean91 = strSet61.remove((java.lang.Object) islamicChronology65);
        org.joda.time.DurationField durationField92 = islamicChronology65.months();
        org.joda.time.Chronology chronology93 = islamicChronology65.withUTC();
        org.joda.time.DateTimeField dateTimeField94 = chronology93.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField95 = chronology93.yearOfEra();
        boolean boolean96 = islamicChronology2.equals((java.lang.Object) dateTimeField95);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField66", (durationField4.compareTo(durationField66) == 0) == durationField4.equals(durationField66));
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test507");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology6 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone5);
        boolean boolean8 = dateTimeZone5.equals((java.lang.Object) 10L);
        org.joda.time.Chronology chronology9 = islamicChronology2.withZone(dateTimeZone5);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        long long13 = islamicChronology2.add(readablePeriod10, (long) (byte) 0, (-1));
        org.joda.time.DateTimeField dateTimeField14 = islamicChronology2.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField15 = islamicChronology2.halfdayOfDay();
        org.joda.time.DurationField durationField16 = islamicChronology2.years();
        org.joda.time.DateTimeField dateTimeField17 = islamicChronology2.weekOfWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField16", (durationField3.compareTo(durationField16) == 0) == durationField3.equals(durationField16));
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test508");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology6 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone5);
        boolean boolean8 = dateTimeZone5.equals((java.lang.Object) 10L);
        org.joda.time.Chronology chronology9 = islamicChronology2.withZone(dateTimeZone5);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        long long13 = islamicChronology2.add(readablePeriod10, (long) (byte) 0, (-1));
        org.joda.time.DateTimeField dateTimeField14 = islamicChronology2.halfdayOfDay();
        org.joda.time.DurationField durationField15 = islamicChronology2.years();
        org.joda.time.DurationField durationField16 = islamicChronology2.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField15", (durationField3.compareTo(durationField15) == 0) == durationField3.equals(durationField15));
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test509");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology2.yearOfEra();
        long long6 = dateTimeField4.roundCeiling(0L);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) 1);
        int int9 = localDateTime8.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.minusHours((int) (byte) -1);
        int int12 = localDateTime8.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime8.withMinuteOfHour((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime8.plusHours((int) (byte) 100);
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.LocalDateTime localDateTime18 = localDateTime8.minus(readableDuration17);
        java.util.Locale locale19 = java.util.Locale.PRC;
        java.util.Locale locale20 = locale19.stripExtensions();
        java.lang.String str21 = dateTimeField4.getAsShortText((org.joda.time.ReadablePartial) localDateTime18, locale19);
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        org.joda.time.LocalDateTime localDateTime23 = localDateTime18.plus(readablePeriod22);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.plusYears(100);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime23.plusMillis(4);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime23.plusMillis(9);
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime((long) 1);
        int int32 = localDateTime31.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime34 = localDateTime31.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology37 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone36);
        org.joda.time.DateTime dateTime38 = localDateTime31.toDateTime(dateTimeZone36);
        org.joda.time.ReadableInstant readableInstant39 = null;
        boolean boolean40 = dateTime38.isAfter(readableInstant39);
        org.joda.time.DateTime dateTime41 = localDateTime29.toDateTime((org.joda.time.ReadableInstant) dateTime38);
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology44 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone43);
        org.joda.time.DurationField durationField45 = islamicChronology44.weekyears();
        org.joda.time.DurationField durationField46 = islamicChronology44.halfdays();
        org.joda.time.DurationField durationField47 = islamicChronology44.weeks();
        org.joda.time.DateTimeField dateTimeField48 = islamicChronology44.yearOfEra();
        org.joda.time.LocalDateTime localDateTime50 = new org.joda.time.LocalDateTime((long) 1);
        int int51 = localDateTime50.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime53 = localDateTime50.minusHours((int) (byte) -1);
        org.joda.time.DateTimeField[] dateTimeFieldArray54 = localDateTime53.getFields();
        java.util.Locale locale55 = java.util.Locale.KOREA;
        java.util.Locale locale56 = java.util.Locale.KOREA;
        java.lang.String str57 = locale55.getDisplayLanguage(locale56);
        java.lang.String str58 = dateTimeField48.getAsText((org.joda.time.ReadablePartial) localDateTime53, locale55);
        org.joda.time.LocalDateTime localDateTime60 = new org.joda.time.LocalDateTime((long) 1);
        int int61 = localDateTime60.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime63 = localDateTime60.minusHours((int) (byte) -1);
        int int65 = localDateTime60.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime67 = localDateTime60.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod68 = null;
        org.joda.time.LocalDateTime localDateTime69 = localDateTime60.minus(readablePeriod68);
        int int70 = localDateTime69.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField72 = localDateTime69.getField(0);
        org.joda.time.LocalDateTime.Property property73 = localDateTime69.centuryOfEra();
        org.joda.time.ReadableDuration readableDuration74 = null;
        org.joda.time.LocalDateTime localDateTime75 = localDateTime69.plus(readableDuration74);
        org.joda.time.LocalDateTime localDateTime77 = localDateTime69.minusMonths(59);
        org.joda.time.LocalDateTime localDateTime79 = localDateTime77.minusMillis((int) (short) 0);
        org.joda.time.tz.NameProvider nameProvider80 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale81 = java.util.Locale.ROOT;
        java.lang.String str84 = nameProvider80.getShortName(locale81, "jpn", "jpn");
        java.lang.String str85 = dateTimeField48.getAsText((org.joda.time.ReadablePartial) localDateTime77, locale81);
        boolean boolean86 = dateTime38.equals((java.lang.Object) locale81);
        org.joda.time.Instant instant87 = dateTime38.toInstant();
        java.lang.String str88 = instant87.toString();
        org.joda.time.DateTimeZone dateTimeZone90 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology91 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone90);
        org.joda.time.DurationField durationField92 = islamicChronology91.weekyears();
        org.joda.time.DateTimeField dateTimeField93 = islamicChronology91.yearOfEra();
        org.joda.time.DateTimeField dateTimeField94 = islamicChronology91.weekOfWeekyear();
        boolean boolean95 = instant87.equals((java.lang.Object) islamicChronology91);
        org.joda.time.DateTimeField dateTimeField96 = islamicChronology91.minuteOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime38 and instant87", (dateTime38.compareTo(instant87) == 0) == dateTime38.equals(instant87));
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test510");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        int int2 = localDateTime1.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.minusHours((int) (byte) -1);
        int int5 = localDateTime1.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.withMinuteOfHour((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime1.plusHours((int) (byte) 100);
        java.util.Date date10 = localDateTime9.toDate();
        org.joda.time.LocalDateTime localDateTime11 = org.joda.time.LocalDateTime.fromDateFields(date10);
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((long) 1);
        int int14 = localDateTime13.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime13.minusHours((int) (byte) -1);
        int int18 = localDateTime13.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime13.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.LocalDateTime localDateTime22 = localDateTime13.minus(readablePeriod21);
        int int23 = localDateTime22.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField25 = localDateTime22.getField(0);
        org.joda.time.LocalDateTime.Property property26 = localDateTime22.centuryOfEra();
        int int27 = property26.getMinimumValue();
        org.joda.time.LocalDateTime localDateTime29 = property26.setCopy(0);
        org.joda.time.LocalDateTime localDateTime30 = property26.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime(100, (int) (short) 10, (int) (short) 10, (int) (byte) 0, 0, (int) ' ');
        int int38 = localDateTime37.getMinuteOfHour();
        org.joda.time.LocalDateTime.Property property39 = localDateTime37.hourOfDay();
        org.joda.time.LocalDateTime localDateTime41 = property39.addToCopy((int) (byte) 100);
        org.joda.time.LocalDateTime.Property property42 = localDateTime41.dayOfMonth();
        java.lang.String str43 = property42.getAsText();
        org.joda.time.DateTimeFieldType dateTimeFieldType44 = property42.getFieldType();
        int int45 = localDateTime30.indexOf(dateTimeFieldType44);
        boolean boolean46 = localDateTime11.isSupported(dateTimeFieldType44);
        org.joda.time.LocalDateTime.Property property47 = localDateTime11.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology50 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone49);
        org.joda.time.DurationField durationField51 = islamicChronology50.weekyears();
        org.joda.time.DurationField durationField52 = islamicChronology50.months();
        org.joda.time.DateTimeField dateTimeField53 = islamicChronology50.minuteOfHour();
        org.joda.time.DurationField durationField54 = islamicChronology50.hours();
        org.joda.time.DateTimeField dateTimeField55 = islamicChronology50.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime57 = new org.joda.time.LocalDateTime((long) 1);
        int int58 = localDateTime57.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime60 = localDateTime57.minusHours((int) (byte) -1);
        int int61 = localDateTime57.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime63 = localDateTime57.minusMinutes((int) '#');
        org.joda.time.LocalDateTime.Property property64 = localDateTime63.centuryOfEra();
        java.util.Locale locale66 = java.util.Locale.FRENCH;
        java.lang.String str67 = dateTimeField55.getAsShortText((org.joda.time.ReadablePartial) localDateTime63, (int) (short) 100, locale66);
        org.joda.time.LocalDateTime localDateTime69 = new org.joda.time.LocalDateTime((long) 1);
        int int70 = localDateTime69.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime72 = localDateTime69.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone74 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology75 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone74);
        org.joda.time.DateTime dateTime76 = localDateTime69.toDateTime(dateTimeZone74);
        org.joda.time.ReadableInstant readableInstant77 = null;
        boolean boolean78 = dateTime76.isAfter(readableInstant77);
        org.joda.time.Instant instant79 = dateTime76.toInstant();
        org.joda.time.DateTime dateTime80 = localDateTime63.toDateTime((org.joda.time.ReadableInstant) instant79);
        org.joda.time.LocalDateTime localDateTime87 = new org.joda.time.LocalDateTime(100, (int) (short) 10, (int) (short) 10, (int) (byte) 0, 0, (int) ' ');
        int int88 = localDateTime87.getMinuteOfHour();
        org.joda.time.LocalDateTime.Property property89 = localDateTime87.hourOfDay();
        org.joda.time.LocalDateTime localDateTime90 = property89.roundFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType92 = localDateTime90.getFieldType(0);
        boolean boolean93 = instant79.isSupported(dateTimeFieldType92);
        org.joda.time.Instant instant94 = instant79.toInstant();
        int int95 = property47.compareTo((org.joda.time.ReadableInstant) instant94);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime76 and instant94", (dateTime76.compareTo(instant94) == 0) == dateTime76.equals(instant94));
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test511");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = islamicChronology2.years();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) 1);
        int int7 = localDateTime6.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.minusHours((int) (byte) -1);
        int int11 = localDateTime6.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime6.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalDateTime localDateTime15 = localDateTime6.minus(readablePeriod14);
        int int16 = localDateTime15.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField18 = localDateTime15.getField(0);
        org.joda.time.LocalDateTime.Property property19 = localDateTime15.centuryOfEra();
        int[] intArray21 = islamicChronology2.get((org.joda.time.ReadablePartial) localDateTime15, (long) 0);
        org.joda.time.DateTimeField dateTimeField22 = islamicChronology2.millisOfDay();
        org.joda.time.DurationField durationField23 = islamicChronology2.centuries();
        org.joda.time.DateTimeZone dateTimeZone24 = islamicChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField25 = islamicChronology2.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime();
        int[] intArray28 = islamicChronology2.get((org.joda.time.ReadablePartial) localDateTime26, 10L);
        org.joda.time.DateTimeField dateTimeField29 = islamicChronology2.secondOfDay();
        org.joda.time.DateTimeField dateTimeField30 = islamicChronology2.minuteOfHour();
        org.joda.time.DurationField durationField31 = islamicChronology2.weeks();
        org.joda.time.DurationField durationField32 = islamicChronology2.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField32, durationField4, and durationField23", !(durationField32.compareTo(durationField4) == 0) || (Math.signum(durationField32.compareTo(durationField23)) == Math.signum(durationField4.compareTo(durationField23))));
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test512");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DurationField durationField4 = islamicChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.yearOfEra();
        org.joda.time.DurationField durationField6 = islamicChronology2.halfdays();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((org.joda.time.Chronology) islamicChronology2);
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology2.yearOfEra();
        java.util.Locale locale9 = java.util.Locale.US;
        int int10 = dateTimeField8.getMaximumShortTextLength(locale9);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology13 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone12);
        org.joda.time.DateTimeField dateTimeField14 = islamicChronology13.weekyear();
        org.joda.time.DurationField durationField15 = islamicChronology13.years();
        org.joda.time.DateTimeField dateTimeField16 = islamicChronology13.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField17 = islamicChronology13.hourOfDay();
        long long20 = dateTimeField17.addWrapField((long) (-1), (int) (byte) -1);
        long long23 = dateTimeField17.set(1L, 5);
        java.util.Locale locale24 = java.util.Locale.getDefault();
        int int25 = dateTimeField17.getMaximumShortTextLength(locale24);
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime((long) 1);
        int int28 = localDateTime27.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime30 = localDateTime27.minusHours((int) (byte) -1);
        int int32 = localDateTime27.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime27.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod35 = null;
        org.joda.time.LocalDateTime localDateTime36 = localDateTime27.minus(readablePeriod35);
        org.joda.time.LocalDateTime.Property property37 = localDateTime27.millisOfSecond();
        long long38 = property37.remainder();
        java.lang.String str39 = property37.getName();
        java.util.Locale locale40 = java.util.Locale.CHINA;
        java.lang.String str41 = property37.getAsText(locale40);
        org.joda.time.LocalDateTime localDateTime42 = property37.withMinimumValue();
        boolean boolean44 = property37.equals((java.lang.Object) 59);
        org.joda.time.DurationField durationField45 = property37.getRangeDurationField();
        java.util.Locale locale49 = new java.util.Locale("DateTimeField[minuteOfDay]", "kor", "fra");
        int int50 = property37.getMaximumTextLength(locale49);
        java.lang.String str51 = locale24.getDisplayName(locale49);
        java.util.Locale.Category category52 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale53 = java.util.Locale.KOREA;
        java.util.Locale locale54 = java.util.Locale.KOREA;
        java.lang.String str55 = locale53.getDisplayLanguage(locale54);
        java.util.Locale.setDefault(locale53);
        java.util.Locale.setDefault(category52, locale53);
        java.util.Locale locale58 = java.util.Locale.getDefault(category52);
        java.lang.String str59 = locale24.getDisplayLanguage(locale58);
        java.util.Set<java.lang.String> strSet60 = locale24.getUnicodeLocaleAttributes();
        java.lang.String str61 = locale9.getDisplayScript(locale24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField15", (durationField3.compareTo(durationField15) == 0) == durationField3.equals(durationField15));
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test513");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = islamicChronology2.years();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) 1);
        int int7 = localDateTime6.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.minusHours((int) (byte) -1);
        int int11 = localDateTime6.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime6.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalDateTime localDateTime15 = localDateTime6.minus(readablePeriod14);
        int int16 = localDateTime15.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField18 = localDateTime15.getField(0);
        org.joda.time.LocalDateTime.Property property19 = localDateTime15.centuryOfEra();
        int[] intArray21 = islamicChronology2.get((org.joda.time.ReadablePartial) localDateTime15, (long) 0);
        org.joda.time.DateTimeField dateTimeField22 = islamicChronology2.millisOfDay();
        org.joda.time.DurationField durationField23 = islamicChronology2.centuries();
        org.joda.time.DateTimeZone dateTimeZone24 = islamicChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField25 = islamicChronology2.dayOfWeek();
        org.joda.time.DurationField durationField26 = islamicChronology2.months();
        org.joda.time.DateTimeField dateTimeField27 = islamicChronology2.weekyearOfCentury();
        org.joda.time.DurationField durationField28 = islamicChronology2.months();
        org.joda.time.DateTimeField dateTimeField29 = islamicChronology2.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology33 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone32);
        org.joda.time.DurationField durationField34 = islamicChronology33.weekyears();
        org.joda.time.DurationField durationField35 = islamicChronology33.halfdays();
        org.joda.time.DateTimeField dateTimeField36 = islamicChronology33.era();
        org.joda.time.DateTimeField dateTimeField37 = islamicChronology33.secondOfMinute();
        java.util.Locale locale39 = java.util.Locale.TAIWAN;
        java.lang.String str40 = dateTimeField37.getAsText(17763840000100L, locale39);
        java.lang.String str41 = dateTimeField29.getAsShortText(3600015L, locale39);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField34", (durationField4.compareTo(durationField34) == 0) == durationField4.equals(durationField34));
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test514");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        boolean boolean3 = dateTimeZone1.isFixed();
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((long) 1);
        int int6 = localDateTime5.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology11 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone10);
        org.joda.time.DateTime dateTime12 = localDateTime5.toDateTime(dateTimeZone10);
        org.joda.time.ReadableInstant readableInstant13 = null;
        boolean boolean14 = dateTime12.isAfter(readableInstant13);
        org.joda.time.Instant instant15 = dateTime12.toInstant();
        java.lang.String str16 = dateTime12.toString();
        int int17 = dateTimeZone1.getOffset((org.joda.time.ReadableInstant) dateTime12);
        long long18 = dateTime12.getMillis();
        org.joda.time.Instant instant19 = dateTime12.toInstant();
        long long20 = instant19.getMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime12 and instant15", (dateTime12.compareTo(instant15) == 0) == dateTime12.equals(instant15));
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test515");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology2.weekyear();
        org.joda.time.DurationField durationField4 = islamicChronology2.years();
        org.joda.time.DurationField durationField5 = islamicChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology2.millisOfSecond();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField5", (durationField4.compareTo(durationField5) == 0) == durationField4.equals(durationField5));
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test516");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = islamicChronology2.years();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) 1);
        int int7 = localDateTime6.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.minusHours((int) (byte) -1);
        int int11 = localDateTime6.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime6.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalDateTime localDateTime15 = localDateTime6.minus(readablePeriod14);
        int int16 = localDateTime15.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField18 = localDateTime15.getField(0);
        org.joda.time.LocalDateTime.Property property19 = localDateTime15.centuryOfEra();
        int[] intArray21 = islamicChronology2.get((org.joda.time.ReadablePartial) localDateTime15, (long) 0);
        org.joda.time.DateTimeField dateTimeField22 = islamicChronology2.millisOfDay();
        org.joda.time.DurationField durationField23 = islamicChronology2.centuries();
        org.joda.time.DateTimeZone dateTimeZone24 = islamicChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField25 = islamicChronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField26 = islamicChronology2.era();
        org.joda.time.DateTimeField dateTimeField27 = islamicChronology2.weekyear();
        org.joda.time.DateTimeField dateTimeField28 = islamicChronology2.dayOfMonth();
        org.joda.time.DurationField durationField29 = islamicChronology2.seconds();
        org.joda.time.DateTimeField dateTimeField30 = islamicChronology2.yearOfEra();
        org.joda.time.DurationField durationField31 = islamicChronology2.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField31, durationField4, and durationField23", !(durationField31.compareTo(durationField4) == 0) || (Math.signum(durationField31.compareTo(durationField23)) == Math.signum(durationField4.compareTo(durationField23))));
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test517");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DurationField durationField4 = islamicChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.yearOfEra();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology2.halfdayOfDay();
        org.joda.time.DurationField durationField7 = islamicChronology2.halfdays();
        org.joda.time.DateTimeZone dateTimeZone8 = islamicChronology2.getZone();
        org.joda.time.DurationField durationField9 = islamicChronology2.millis();
        org.joda.time.DurationField durationField10 = islamicChronology2.weeks();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology2.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology2.minuteOfDay();
        org.joda.time.DurationField durationField13 = islamicChronology2.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField13, durationField3, and durationField4", !(durationField13.compareTo(durationField3) == 0) || (Math.signum(durationField13.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test518");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DurationField durationField4 = islamicChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.yearOfEra();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology2.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology2.yearOfEra();
        org.joda.time.DurationField durationField8 = islamicChronology2.days();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.Chronology chronology10 = islamicChronology2.withZone(dateTimeZone9);
        org.joda.time.DurationField durationField11 = chronology10.years();
        org.joda.time.DateTimeField dateTimeField12 = chronology10.centuryOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField11", (durationField3.compareTo(durationField11) == 0) == durationField3.equals(durationField11));
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test519");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DurationField durationField4 = islamicChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.yearOfEra();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology2.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology2.monthOfYear();
        org.joda.time.Chronology chronology8 = islamicChronology2.withUTC();
        org.joda.time.DurationField durationField9 = islamicChronology2.weekyears();
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((long) 1);
        int int12 = localDateTime11.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.minusHours((int) (byte) -1);
        int int15 = localDateTime11.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime17 = localDateTime11.withMinuteOfHour((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime11.plusHours((int) (byte) 100);
        int int20 = localDateTime11.getMillisOfDay();
        org.joda.time.LocalDateTime localDateTime22 = localDateTime11.withWeekOfWeekyear(9);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime22.minusSeconds((int) '4');
        long long26 = islamicChronology2.set((org.joda.time.ReadablePartial) localDateTime22, 0L);
        org.joda.time.DateTimeField dateTimeField27 = islamicChronology2.year();
        org.joda.time.DateTimeField dateTimeField28 = islamicChronology2.era();
        org.joda.time.DateTimeField dateTimeField29 = islamicChronology2.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime((long) 1);
        int int32 = localDateTime31.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime34 = localDateTime31.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology37 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone36);
        org.joda.time.DateTime dateTime38 = localDateTime31.toDateTime(dateTimeZone36);
        java.lang.String str40 = dateTimeZone36.getName(70L);
        int int42 = dateTimeZone36.getOffsetFromLocal((long) 12);
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology45 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone44);
        int int46 = islamicChronology45.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField47 = islamicChronology45.weekyear();
        org.joda.time.DurationField durationField48 = islamicChronology45.hours();
        org.joda.time.LocalDateTime localDateTime50 = new org.joda.time.LocalDateTime((long) 1);
        int int51 = localDateTime50.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime53 = localDateTime50.minusHours((int) (byte) -1);
        org.joda.time.DateTimeField[] dateTimeFieldArray54 = localDateTime53.getFields();
        org.joda.time.LocalDateTime localDateTime56 = localDateTime53.minusDays(4);
        org.joda.time.DateTimeZone dateTimeZone58 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology59 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone58);
        org.joda.time.DateTimeField dateTimeField60 = islamicChronology59.yearOfCentury();
        org.joda.time.DurationField durationField61 = islamicChronology59.years();
        org.joda.time.DurationField durationField62 = islamicChronology59.halfdays();
        org.joda.time.DateTimeField dateTimeField63 = islamicChronology59.hourOfHalfday();
        org.joda.time.LocalDateTime localDateTime65 = new org.joda.time.LocalDateTime((long) 1);
        int int66 = localDateTime65.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime68 = localDateTime65.minusHours((int) (byte) -1);
        int int69 = localDateTime65.getSecondOfMinute();
        int[] intArray76 = new int[] { 292278993, ' ', (short) 1, (short) -1, (byte) -1 };
        int[] intArray78 = dateTimeField63.set((org.joda.time.ReadablePartial) localDateTime65, (int) (byte) 0, intArray76, 10);
        islamicChronology45.validate((org.joda.time.ReadablePartial) localDateTime53, intArray78);
        org.joda.time.DurationField durationField80 = islamicChronology45.years();
        boolean boolean81 = dateTimeZone36.equals((java.lang.Object) durationField80);
        org.joda.time.Chronology chronology82 = islamicChronology2.withZone(dateTimeZone36);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField61", (durationField3.compareTo(durationField61) == 0) == durationField3.equals(durationField61));
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test520");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology2.yearOfEra();
        long long6 = dateTimeField4.roundCeiling(0L);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) 1);
        int int9 = localDateTime8.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.minusHours((int) (byte) -1);
        int int12 = localDateTime8.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime8.withMinuteOfHour((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime8.plusHours((int) (byte) 100);
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.LocalDateTime localDateTime18 = localDateTime8.minus(readableDuration17);
        java.util.Locale locale19 = java.util.Locale.PRC;
        java.util.Locale locale20 = locale19.stripExtensions();
        java.lang.String str21 = dateTimeField4.getAsShortText((org.joda.time.ReadablePartial) localDateTime18, locale19);
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        org.joda.time.LocalDateTime localDateTime23 = localDateTime18.plus(readablePeriod22);
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        org.joda.time.LocalDateTime localDateTime25 = localDateTime18.plus(readablePeriod24);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime25.plusMonths((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.withDayOfYear(5);
        org.joda.time.LocalDateTime.Property property30 = localDateTime29.dayOfMonth();
        org.joda.time.DateTime dateTime31 = localDateTime29.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone32 = dateTime31.getZone();
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime((long) 1);
        int int35 = localDateTime34.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime37 = localDateTime34.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology40 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone39);
        org.joda.time.DateTime dateTime41 = localDateTime34.toDateTime(dateTimeZone39);
        long long42 = dateTime41.getMillis();
        long long43 = dateTime41.getMillis();
        org.joda.time.Instant instant44 = dateTime41.toInstant();
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology47 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone46);
        org.joda.time.DurationField durationField48 = islamicChronology47.weekyears();
        org.joda.time.DurationField durationField49 = islamicChronology47.halfdays();
        org.joda.time.DateTimeField dateTimeField50 = islamicChronology47.yearOfEra();
        org.joda.time.DateTimeField dateTimeField51 = islamicChronology47.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField52 = islamicChronology47.weekyear();
        org.joda.time.DurationField durationField53 = islamicChronology47.days();
        org.joda.time.DateTimeField dateTimeField54 = islamicChronology47.millisOfSecond();
        org.joda.time.DateTimeFieldType dateTimeFieldType55 = dateTimeField54.getType();
        boolean boolean56 = dateTime41.isSupported(dateTimeFieldType55);
        boolean boolean57 = dateTime31.isEqual((org.joda.time.ReadableInstant) dateTime41);
        org.joda.time.DateTimeZone dateTimeZone58 = dateTime41.getZone();
        long long60 = dateTimeZone58.nextTransition(408L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime41 and instant44", (dateTime41.compareTo(instant44) == 0) == dateTime41.equals(instant44));
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test521");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DurationField durationField4 = islamicChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.yearOfEra();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology2.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology2.yearOfEra();
        org.joda.time.DurationField durationField8 = islamicChronology2.days();
        org.joda.time.DurationField durationField9 = islamicChronology2.weeks();
        org.joda.time.DurationField durationField10 = islamicChronology2.seconds();
        int int11 = islamicChronology2.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology2.year();
        org.joda.time.DurationField durationField13 = dateTimeField12.getDurationField();
        int int15 = dateTimeField12.get((long) 22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField13", (durationField3.compareTo(durationField13) == 0) == durationField3.equals(durationField13));
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test522");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DurationField durationField4 = islamicChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.yearOfEra();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology2.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology2.monthOfYear();
        org.joda.time.Chronology chronology8 = islamicChronology2.withUTC();
        org.joda.time.DurationField durationField9 = islamicChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology2.weekyearOfCentury();
        org.joda.time.DurationField durationField11 = islamicChronology2.years();
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology2.dayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField11", (durationField3.compareTo(durationField11) == 0) == durationField3.equals(durationField11));
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test523");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = islamicChronology2.years();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.monthOfYear();
        org.joda.time.DurationField durationField6 = islamicChronology2.eras();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology2.yearOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField4 and durationField6", Math.signum(durationField4.compareTo(durationField6)) == -Math.signum(durationField6.compareTo(durationField4)));
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test524");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology2.yearOfEra();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology2.minuteOfDay();
        org.joda.time.DurationField durationField7 = islamicChronology2.years();
        org.joda.time.DurationField durationField8 = islamicChronology2.years();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField8", (durationField3.compareTo(durationField8) == 0) == durationField3.equals(durationField8));
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test525");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = islamicChronology2.years();
        org.joda.time.DurationField durationField5 = islamicChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology2.hourOfHalfday();
        org.joda.time.DurationField durationField7 = islamicChronology2.hours();
        org.joda.time.DurationField durationField8 = islamicChronology2.weekyears();
        org.joda.time.DurationField durationField9 = islamicChronology2.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField9", (durationField4.compareTo(durationField9) == 0) == durationField4.equals(durationField9));
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test526");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology6 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone5);
        boolean boolean8 = dateTimeZone5.equals((java.lang.Object) 10L);
        org.joda.time.Chronology chronology9 = islamicChronology2.withZone(dateTimeZone5);
        java.util.Locale locale11 = java.util.Locale.KOREA;
        java.util.Locale locale12 = java.util.Locale.KOREA;
        java.lang.String str13 = locale11.getDisplayLanguage(locale12);
        java.lang.String str14 = locale12.getISO3Country();
        java.util.Set<java.lang.String> strSet15 = locale12.getUnicodeLocaleAttributes();
        java.lang.String str16 = dateTimeZone5.getName(24796800001L, locale12);
        int int18 = dateTimeZone5.getOffsetFromLocal(1134L);
        long long20 = dateTimeZone5.nextTransition(3600L);
        long long23 = dateTimeZone5.adjustOffset(5L, false);
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime((long) 1);
        int int26 = localDateTime25.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime28 = localDateTime25.minusHours((int) (byte) -1);
        int int29 = localDateTime25.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime31 = localDateTime25.minusMinutes((int) '#');
        org.joda.time.LocalDateTime.Property property32 = localDateTime31.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime33 = property32.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime33.withFields((org.joda.time.ReadablePartial) localDateTime35);
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology39 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone38);
        org.joda.time.DateTimeField dateTimeField40 = islamicChronology39.yearOfCentury();
        org.joda.time.DurationField durationField41 = islamicChronology39.years();
        org.joda.time.LocalDateTime localDateTime43 = new org.joda.time.LocalDateTime((long) 1);
        int int44 = localDateTime43.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime46 = localDateTime43.minusHours((int) (byte) -1);
        int int48 = localDateTime43.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime50 = localDateTime43.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod51 = null;
        org.joda.time.LocalDateTime localDateTime52 = localDateTime43.minus(readablePeriod51);
        int int53 = localDateTime52.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField55 = localDateTime52.getField(0);
        org.joda.time.LocalDateTime.Property property56 = localDateTime52.centuryOfEra();
        int[] intArray58 = islamicChronology39.get((org.joda.time.ReadablePartial) localDateTime52, (long) 0);
        org.joda.time.DateTimeField dateTimeField59 = islamicChronology39.millisOfDay();
        org.joda.time.DurationField durationField60 = islamicChronology39.centuries();
        org.joda.time.DateTimeZone dateTimeZone61 = islamicChronology39.getZone();
        org.joda.time.LocalDateTime localDateTime63 = new org.joda.time.LocalDateTime((long) 1);
        int int64 = localDateTime63.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime66 = localDateTime63.minusHours((int) (byte) -1);
        int int68 = localDateTime63.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime70 = localDateTime63.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod71 = null;
        org.joda.time.LocalDateTime localDateTime72 = localDateTime63.minus(readablePeriod71);
        int int73 = localDateTime72.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField75 = localDateTime72.getField(0);
        org.joda.time.LocalDateTime.Property property76 = localDateTime72.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime78 = localDateTime72.withMonthOfYear((int) (short) 10);
        boolean boolean79 = dateTimeZone61.isLocalDateTimeGap(localDateTime72);
        org.joda.time.LocalDateTime.Property property80 = localDateTime72.yearOfEra();
        int int81 = localDateTime35.compareTo((org.joda.time.ReadablePartial) localDateTime72);
        org.joda.time.LocalDateTime.Property property82 = localDateTime72.millisOfDay();
        org.joda.time.ReadablePeriod readablePeriod83 = null;
        org.joda.time.LocalDateTime localDateTime84 = localDateTime72.plus(readablePeriod83);
        org.joda.time.LocalDateTime.Property property85 = localDateTime84.centuryOfEra();
        boolean boolean86 = dateTimeZone5.isLocalDateTimeGap(localDateTime84);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField41", (durationField3.compareTo(durationField41) == 0) == durationField3.equals(durationField41));
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test527");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        int int2 = localDateTime1.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology7 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone6);
        org.joda.time.DateTime dateTime8 = localDateTime1.toDateTime(dateTimeZone6);
        long long9 = dateTime8.getMillis();
        long long10 = dateTime8.getMillis();
        org.joda.time.Instant instant11 = dateTime8.toInstant();
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((long) 1);
        int int14 = localDateTime13.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime13.minusHours((int) (byte) -1);
        org.joda.time.DateTimeField[] dateTimeFieldArray17 = localDateTime16.getFields();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.minusDays(4);
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime((long) 1);
        int int22 = localDateTime21.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime24 = localDateTime21.minusHours((int) (byte) -1);
        int int26 = localDateTime21.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime21.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        org.joda.time.LocalDateTime localDateTime30 = localDateTime21.minus(readablePeriod29);
        int int31 = localDateTime30.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField33 = localDateTime30.getField(0);
        org.joda.time.LocalDateTime.Property property34 = localDateTime30.centuryOfEra();
        org.joda.time.LocalDateTime.Property property35 = localDateTime30.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime40 = localDateTime30.withTime((int) (byte) 1, 0, 5, (int) (byte) 100);
        boolean boolean41 = localDateTime16.isBefore((org.joda.time.ReadablePartial) localDateTime40);
        org.joda.time.LocalDateTime.Property property42 = localDateTime40.weekyear();
        int int43 = property42.getLeapAmount();
        org.joda.time.LocalDateTime localDateTime45 = property42.addWrapFieldToCopy(45);
        org.joda.time.LocalDateTime localDateTime47 = new org.joda.time.LocalDateTime((long) 1);
        int int48 = localDateTime47.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime50 = localDateTime47.withYear((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod51 = null;
        org.joda.time.LocalDateTime localDateTime53 = localDateTime50.withPeriodAdded(readablePeriod51, 10);
        org.joda.time.LocalDateTime localDateTime55 = localDateTime53.withDayOfYear(11);
        org.joda.time.LocalDateTime localDateTime57 = localDateTime55.withYear(10);
        org.joda.time.DateTime dateTime58 = localDateTime55.toDateTime();
        long long59 = dateTime58.getMillis();
        int int60 = property42.compareTo((org.joda.time.ReadableInstant) dateTime58);
        org.joda.time.DateTimeZone dateTimeZone61 = dateTime58.getZone();
        boolean boolean62 = instant11.isAfter((org.joda.time.ReadableInstant) dateTime58);
        org.joda.time.DateTimeZone dateTimeZone63 = dateTime58.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and instant11", (dateTime8.compareTo(instant11) == 0) == dateTime8.equals(instant11));
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test528");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        int int2 = localDateTime1.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.minusHours((int) (byte) -1);
        int int6 = localDateTime1.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.LocalDateTime localDateTime10 = localDateTime1.minus(readablePeriod9);
        org.joda.time.LocalDateTime.Property property11 = localDateTime1.millisOfSecond();
        long long12 = property11.remainder();
        java.lang.String str13 = property11.getName();
        org.joda.time.DurationField durationField14 = property11.getRangeDurationField();
        int int15 = property11.getMinimumValue();
        org.joda.time.LocalDateTime localDateTime16 = property11.roundHalfCeilingCopy();
        int int17 = localDateTime16.getMinuteOfHour();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.withMillisOfSecond(70);
        int int20 = localDateTime19.size();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology23 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone22);
        org.joda.time.DurationField durationField24 = islamicChronology23.weekyears();
        org.joda.time.DurationField durationField25 = islamicChronology23.millis();
        org.joda.time.DateTimeField dateTimeField26 = islamicChronology23.millisOfSecond();
        org.joda.time.DurationField durationField27 = islamicChronology23.seconds();
        org.joda.time.DurationField durationField28 = islamicChronology23.years();
        org.joda.time.DurationFieldType durationFieldType29 = durationField28.getType();
        boolean boolean30 = localDateTime19.isSupported(durationFieldType29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField14 and durationField27", (durationField14.compareTo(durationField27) == 0) == durationField14.equals(durationField27));
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test529");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DurationField durationField4 = islamicChronology2.months();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.halfdayOfDay();
        org.joda.time.DurationField durationField6 = islamicChronology2.millis();
        java.lang.String str7 = islamicChronology2.toString();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology2.secondOfMinute();
        org.joda.time.DurationField durationField9 = islamicChronology2.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField3, and durationField4", !(durationField9.compareTo(durationField3) == 0) || (Math.signum(durationField9.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test530");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology2.weekyear();
        org.joda.time.DurationField durationField4 = islamicChronology2.years();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology2.hourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology2.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone8 = islamicChronology2.getZone();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology12 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone11);
        java.lang.String str13 = dateTimeZone11.toString();
        long long15 = dateTimeZone11.nextTransition((long) 1);
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType16 = org.joda.time.chrono.IslamicChronology.LEAP_YEAR_INDIAN;
        org.joda.time.chrono.IslamicChronology islamicChronology17 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone11, leapYearPatternType16);
        org.joda.time.DateTimeZone dateTimeZone18 = islamicChronology17.getZone();
        java.util.TimeZone timeZone19 = dateTimeZone18.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology22 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone21);
        org.joda.time.DurationField durationField23 = islamicChronology22.weekyears();
        org.joda.time.DurationField durationField24 = islamicChronology22.halfdays();
        org.joda.time.DateTimeField dateTimeField25 = islamicChronology22.yearOfEra();
        org.joda.time.DurationField durationField26 = islamicChronology22.months();
        org.joda.time.DateTimeField dateTimeField27 = islamicChronology22.yearOfEra();
        boolean boolean28 = dateTimeZone18.equals((java.lang.Object) dateTimeField27);
        java.util.Locale locale30 = java.util.Locale.KOREA;
        java.util.Locale locale31 = java.util.Locale.KOREA;
        java.lang.String str32 = locale30.getDisplayLanguage(locale31);
        java.util.Locale.setDefault(locale30);
        java.util.Locale locale34 = java.util.Locale.JAPAN;
        java.lang.String str35 = locale30.getDisplayCountry(locale34);
        java.util.Locale locale36 = locale34.stripExtensions();
        java.lang.String str37 = locale36.getScript();
        java.lang.String str38 = locale36.getISO3Country();
        java.lang.String str39 = dateTimeField27.getAsShortText(17212262400100L, locale36);
        java.lang.String str40 = dateTimeZone8.getShortName(2674800000L, locale36);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField23", (durationField4.compareTo(durationField23) == 0) == durationField4.equals(durationField23));
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test531");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = islamicChronology2.years();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) 1);
        int int7 = localDateTime6.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.minusHours((int) (byte) -1);
        int int11 = localDateTime6.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime6.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalDateTime localDateTime15 = localDateTime6.minus(readablePeriod14);
        int int16 = localDateTime15.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField18 = localDateTime15.getField(0);
        org.joda.time.LocalDateTime.Property property19 = localDateTime15.centuryOfEra();
        int[] intArray21 = islamicChronology2.get((org.joda.time.ReadablePartial) localDateTime15, (long) 0);
        org.joda.time.DateTimeField dateTimeField22 = islamicChronology2.millisOfDay();
        org.joda.time.DurationField durationField23 = islamicChronology2.centuries();
        org.joda.time.DateTimeField dateTimeField24 = islamicChronology2.dayOfYear();
        org.joda.time.DateTimeField dateTimeField25 = islamicChronology2.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField26 = islamicChronology2.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology29 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone28);
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime((long) 1);
        int int32 = localDateTime31.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime34 = localDateTime31.minusHours((int) (byte) -1);
        org.joda.time.DateTimeField[] dateTimeFieldArray35 = localDateTime34.getFields();
        boolean boolean36 = dateTimeZone28.isLocalDateTimeGap(localDateTime34);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone28);
        java.util.TimeZone timeZone38 = dateTimeZone28.toTimeZone();
        org.joda.time.Chronology chronology39 = islamicChronology2.withZone(dateTimeZone28);
        org.joda.time.DateTimeField dateTimeField40 = islamicChronology2.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField41 = islamicChronology2.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField42 = islamicChronology2.hourOfDay();
        org.joda.time.DateTimeField dateTimeField43 = islamicChronology2.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField44 = islamicChronology2.hourOfDay();
        org.joda.time.DurationField durationField45 = islamicChronology2.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField45, durationField4, and durationField23", !(durationField45.compareTo(durationField4) == 0) || (Math.signum(durationField45.compareTo(durationField23)) == Math.signum(durationField4.compareTo(durationField23))));
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test532");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology2.yearOfEra();
        org.joda.time.DurationField durationField5 = islamicChronology2.hours();
        org.joda.time.DurationField durationField6 = islamicChronology2.halfdays();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType7 = islamicChronology2.getLeapYearPatternType();
        org.joda.time.DurationField durationField8 = islamicChronology2.months();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology2.dayOfYear();
        org.joda.time.DurationField durationField10 = islamicChronology2.minutes();
        org.joda.time.DurationField durationField11 = islamicChronology2.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField11, durationField3, and durationField5", !(durationField11.compareTo(durationField3) == 0) || (Math.signum(durationField11.compareTo(durationField5)) == Math.signum(durationField3.compareTo(durationField5))));
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test533");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("");
        java.util.TimeZone timeZone3 = java.util.TimeZone.getTimeZone("");
        boolean boolean4 = timeZone1.hasSameRules(timeZone3);
        timeZone3.setRawOffset(11);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone3);
        boolean boolean8 = dateTimeZone7.isFixed();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology11 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone10);
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology11.yearOfCentury();
        org.joda.time.DurationField durationField13 = islamicChronology11.years();
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((long) 1);
        int int16 = localDateTime15.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime15.minusHours((int) (byte) -1);
        int int20 = localDateTime15.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime15.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.LocalDateTime localDateTime24 = localDateTime15.minus(readablePeriod23);
        int int25 = localDateTime24.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField27 = localDateTime24.getField(0);
        org.joda.time.LocalDateTime.Property property28 = localDateTime24.centuryOfEra();
        int[] intArray30 = islamicChronology11.get((org.joda.time.ReadablePartial) localDateTime24, (long) 0);
        org.joda.time.DateTimeField dateTimeField31 = islamicChronology11.millisOfDay();
        org.joda.time.DurationField durationField32 = islamicChronology11.centuries();
        org.joda.time.DateTimeField dateTimeField33 = islamicChronology11.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone34 = islamicChronology11.getZone();
        org.joda.time.LocalDateTime localDateTime35 = org.joda.time.LocalDateTime.now(dateTimeZone34);
        boolean boolean36 = dateTimeZone7.isLocalDateTimeGap(localDateTime35);
        long long38 = dateTimeZone7.nextTransition(0L);
        org.joda.time.chrono.IslamicChronology islamicChronology39 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone7);
        int int41 = dateTimeZone7.getOffset((long) 17);
        org.joda.time.LocalDateTime localDateTime43 = new org.joda.time.LocalDateTime((long) 1);
        int int44 = localDateTime43.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime46 = localDateTime43.minusHours((int) (byte) -1);
        int int47 = localDateTime43.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime49 = localDateTime43.minusMinutes((int) '#');
        org.joda.time.LocalDateTime.Property property50 = localDateTime49.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime51 = property50.roundCeilingCopy();
        java.lang.String str52 = property50.toString();
        org.joda.time.LocalDateTime localDateTime54 = new org.joda.time.LocalDateTime((long) 1);
        int int55 = localDateTime54.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime57 = localDateTime54.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone59 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology60 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone59);
        org.joda.time.DateTime dateTime61 = localDateTime54.toDateTime(dateTimeZone59);
        org.joda.time.ReadableInstant readableInstant62 = null;
        boolean boolean63 = dateTime61.isAfter(readableInstant62);
        org.joda.time.Instant instant64 = dateTime61.toInstant();
        int int65 = property50.compareTo((org.joda.time.ReadableInstant) dateTime61);
        org.joda.time.DateTimeZone dateTimeZone66 = dateTime61.getZone();
        long long68 = dateTimeZone7.getMillisKeepLocal(dateTimeZone66, (-3599883L));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime61 and instant64", (dateTime61.compareTo(instant64) == 0) == dateTime61.equals(instant64));
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test534");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone2);
        org.joda.time.DurationField durationField4 = islamicChronology3.weekyears();
        org.joda.time.DurationField durationField5 = islamicChronology3.halfdays();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology3.yearOfEra();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology3.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology3.weekyear();
        org.joda.time.DurationField durationField9 = islamicChronology3.days();
        org.joda.time.DurationField durationField10 = islamicChronology3.days();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology3.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime((-5699999L), (org.joda.time.Chronology) islamicChronology3);
        org.joda.time.DateTimeField dateTimeField13 = islamicChronology3.yearOfEra();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        long long17 = islamicChronology3.add(readablePeriod14, (long) 45, 100);
        org.joda.time.DateTimeField dateTimeField18 = islamicChronology3.secondOfMinute();
        org.joda.time.DurationField durationField19 = islamicChronology3.years();
        org.joda.time.DateTimeField dateTimeField20 = islamicChronology3.minuteOfHour();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField19", (durationField4.compareTo(durationField19) == 0) == durationField4.equals(durationField19));
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test535");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = islamicChronology2.years();
        org.joda.time.DurationField durationField5 = islamicChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology2.hourOfHalfday();
        org.joda.time.DurationField durationField7 = islamicChronology2.hours();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology2.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology2.monthOfYear();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology2.yearOfEra();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology2.minuteOfHour();
        org.joda.time.DurationField durationField12 = islamicChronology2.months();
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((long) 1);
        int int16 = localDateTime15.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime15.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology21 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone20);
        org.joda.time.DateTime dateTime22 = localDateTime15.toDateTime(dateTimeZone20);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology25 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone24);
        org.joda.time.DurationField durationField26 = islamicChronology25.weekyears();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology29 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone28);
        boolean boolean31 = dateTimeZone28.equals((java.lang.Object) 10L);
        org.joda.time.Chronology chronology32 = islamicChronology25.withZone(dateTimeZone28);
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        long long36 = islamicChronology25.add(readablePeriod33, (long) (byte) 0, (-1));
        org.joda.time.DateTimeField dateTimeField37 = islamicChronology25.dayOfMonth();
        boolean boolean38 = dateTimeZone20.equals((java.lang.Object) dateTimeField37);
        org.joda.time.LocalDateTime localDateTime39 = new org.joda.time.LocalDateTime(21600112L, dateTimeZone20);
        org.joda.time.LocalDateTime.Property property40 = localDateTime39.millisOfDay();
        int[] intArray42 = islamicChronology2.get((org.joda.time.ReadablePartial) localDateTime39, (-29117059199952L));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField26", (durationField4.compareTo(durationField26) == 0) == durationField4.equals(durationField26));
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test536");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology2.hourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.millisOfSecond();
        java.lang.String str6 = islamicChronology2.toString();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology2.weekyear();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology2.hourOfDay();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology2.millisOfDay();
        org.joda.time.DurationField durationField10 = islamicChronology2.years();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology2.monthOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField10", (durationField3.compareTo(durationField10) == 0) == durationField3.equals(durationField10));
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test537");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology2.yearOfEra();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology2.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology2.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology2.year();
        org.joda.time.DurationField durationField9 = islamicChronology2.halfdays();
        org.joda.time.DurationField durationField10 = islamicChronology2.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField10, durationField3, and durationField9", !(durationField10.compareTo(durationField3) == 0) || (Math.signum(durationField10.compareTo(durationField9)) == Math.signum(durationField3.compareTo(durationField9))));
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test538");
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(100, (int) (short) 10, (int) (short) 10, (int) (byte) 0, 0, (int) ' ');
        int int7 = localDateTime6.getMinuteOfHour();
        org.joda.time.LocalDateTime.Property property8 = localDateTime6.hourOfDay();
        org.joda.time.LocalDateTime localDateTime10 = property8.addToCopy((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology13 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone12);
        org.joda.time.DateTimeField dateTimeField14 = islamicChronology13.yearOfCentury();
        org.joda.time.DurationField durationField15 = islamicChronology13.years();
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime((long) 1);
        int int18 = localDateTime17.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime17.minusHours((int) (byte) -1);
        int int22 = localDateTime17.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime17.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        org.joda.time.LocalDateTime localDateTime26 = localDateTime17.minus(readablePeriod25);
        int int27 = localDateTime26.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField29 = localDateTime26.getField(0);
        org.joda.time.LocalDateTime.Property property30 = localDateTime26.centuryOfEra();
        int[] intArray32 = islamicChronology13.get((org.joda.time.ReadablePartial) localDateTime26, (long) 0);
        org.joda.time.DateTimeField dateTimeField33 = islamicChronology13.hourOfDay();
        org.joda.time.DurationField durationField34 = islamicChronology13.centuries();
        boolean boolean35 = property8.equals((java.lang.Object) durationField34);
        org.joda.time.LocalDateTime localDateTime36 = property8.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime38 = localDateTime36.minusWeeks(7580);
        org.joda.time.LocalDateTime localDateTime40 = new org.joda.time.LocalDateTime((long) 1);
        int int41 = localDateTime40.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime43 = localDateTime40.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology46 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone45);
        org.joda.time.DateTime dateTime47 = localDateTime40.toDateTime(dateTimeZone45);
        org.joda.time.LocalDateTime localDateTime49 = new org.joda.time.LocalDateTime((long) 1);
        int int50 = localDateTime49.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime52 = localDateTime49.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone54 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology55 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone54);
        org.joda.time.DateTime dateTime56 = localDateTime49.toDateTime(dateTimeZone54);
        long long57 = dateTime56.getMillis();
        boolean boolean58 = dateTime47.isAfter((org.joda.time.ReadableInstant) dateTime56);
        long long59 = dateTime56.getMillis();
        java.lang.String str60 = dateTime56.toString();
        org.joda.time.Instant instant61 = dateTime56.toInstant();
        org.joda.time.DateTime dateTime62 = localDateTime36.toDateTime((org.joda.time.ReadableInstant) dateTime56);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime47 and instant61", (dateTime47.compareTo(instant61) == 0) == dateTime47.equals(instant61));
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test539");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = islamicChronology2.years();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) 1);
        int int7 = localDateTime6.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.minusHours((int) (byte) -1);
        int int11 = localDateTime6.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime6.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalDateTime localDateTime15 = localDateTime6.minus(readablePeriod14);
        int int16 = localDateTime15.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField18 = localDateTime15.getField(0);
        org.joda.time.LocalDateTime.Property property19 = localDateTime15.centuryOfEra();
        int[] intArray21 = islamicChronology2.get((org.joda.time.ReadablePartial) localDateTime15, (long) 0);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime15.withMillisOfSecond(60);
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime((long) 1);
        int int26 = localDateTime25.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime28 = localDateTime25.minusHours((int) (byte) -1);
        int int29 = localDateTime25.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime31 = localDateTime25.withMinuteOfHour((int) (byte) 1);
        int int33 = localDateTime31.getValue(0);
        boolean boolean34 = localDateTime23.equals((java.lang.Object) 0);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime23.minusYears(951);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter37 = null;
        java.lang.String str38 = localDateTime36.toString(dateTimeFormatter37);
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology41 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone40);
        org.joda.time.DurationField durationField42 = islamicChronology41.weekyears();
        org.joda.time.DateTimeField dateTimeField43 = islamicChronology41.hourOfDay();
        org.joda.time.DateTimeField dateTimeField44 = islamicChronology41.millisOfSecond();
        java.lang.String str45 = islamicChronology41.toString();
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology48 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone47);
        java.lang.String str49 = dateTimeZone47.toString();
        org.joda.time.LocalDateTime localDateTime51 = new org.joda.time.LocalDateTime((long) 1);
        int int52 = localDateTime51.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime54 = localDateTime51.withYear((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod55 = null;
        org.joda.time.LocalDateTime localDateTime57 = localDateTime54.withPeriodAdded(readablePeriod55, 10);
        org.joda.time.LocalDateTime localDateTime59 = localDateTime54.plusSeconds((int) ' ');
        boolean boolean60 = dateTimeZone47.isLocalDateTimeGap(localDateTime59);
        org.joda.time.Chronology chronology61 = islamicChronology41.withZone(dateTimeZone47);
        org.joda.time.DurationField durationField62 = islamicChronology41.seconds();
        org.joda.time.DateTimeField dateTimeField63 = islamicChronology41.secondOfDay();
        boolean boolean64 = localDateTime36.equals((java.lang.Object) islamicChronology41);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField42", (durationField4.compareTo(durationField42) == 0) == durationField4.equals(durationField42));
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test540");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology6 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone5);
        boolean boolean8 = dateTimeZone5.equals((java.lang.Object) 10L);
        org.joda.time.Chronology chronology9 = islamicChronology2.withZone(dateTimeZone5);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        long long13 = islamicChronology2.add(readablePeriod10, (long) (byte) 0, (-1));
        org.joda.time.DateTimeField dateTimeField14 = islamicChronology2.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology17 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone16);
        org.joda.time.DurationField durationField18 = islamicChronology17.weekyears();
        org.joda.time.DurationField durationField19 = islamicChronology17.halfdays();
        org.joda.time.DateTimeField dateTimeField20 = islamicChronology17.yearOfEra();
        org.joda.time.DateTimeField dateTimeField21 = islamicChronology17.halfdayOfDay();
        org.joda.time.DurationField durationField22 = islamicChronology17.halfdays();
        org.joda.time.DateTimeZone dateTimeZone23 = islamicChronology17.getZone();
        org.joda.time.Chronology chronology24 = islamicChronology2.withZone(dateTimeZone23);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forOffsetHours(60);
        java.lang.String str28 = dateTimeZone26.getShortName(30335385600001L);
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime((long) 1);
        int int31 = localDateTime30.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime33 = localDateTime30.minusHours((int) (byte) -1);
        int int35 = localDateTime30.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime37 = localDateTime30.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod38 = null;
        org.joda.time.LocalDateTime localDateTime39 = localDateTime30.minus(readablePeriod38);
        int int40 = localDateTime39.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField42 = localDateTime39.getField(0);
        org.joda.time.LocalDateTime.Property property43 = localDateTime39.centuryOfEra();
        org.joda.time.LocalDateTime.Property property44 = localDateTime39.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime49 = localDateTime39.withTime((int) (byte) 1, 0, 5, (int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime51 = localDateTime39.withWeekyear(59);
        org.joda.time.LocalDateTime localDateTime53 = new org.joda.time.LocalDateTime((long) 1);
        int int54 = localDateTime53.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime56 = localDateTime53.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone58 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology59 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone58);
        org.joda.time.DateTime dateTime60 = localDateTime53.toDateTime(dateTimeZone58);
        org.joda.time.LocalDateTime localDateTime62 = new org.joda.time.LocalDateTime((long) 1);
        int int63 = localDateTime62.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime65 = localDateTime62.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone67 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology68 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone67);
        org.joda.time.DateTime dateTime69 = localDateTime62.toDateTime(dateTimeZone67);
        long long70 = dateTime69.getMillis();
        boolean boolean71 = dateTime60.isAfter((org.joda.time.ReadableInstant) dateTime69);
        long long72 = dateTime69.getMillis();
        org.joda.time.Instant instant73 = dateTime69.toInstant();
        org.joda.time.DateTime dateTime74 = localDateTime39.toDateTime((org.joda.time.ReadableInstant) instant73);
        int int75 = dateTimeZone26.getOffset((org.joda.time.ReadableInstant) instant73);
        int int76 = dateTimeZone23.getOffset((org.joda.time.ReadableInstant) instant73);
        boolean boolean78 = dateTimeZone23.equals((java.lang.Object) 17766384240L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime60 and instant73", (dateTime60.compareTo(instant73) == 0) == dateTime60.equals(instant73));
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test541");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology2.millisOfSecond();
        long long8 = islamicChronology2.add((long) (byte) -1, (long) 0, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((long) 1);
        int int11 = localDateTime10.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime10.minusHours((int) (byte) -1);
        int int15 = localDateTime10.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime10.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        org.joda.time.LocalDateTime localDateTime19 = localDateTime10.minus(readablePeriod18);
        int int20 = localDateTime19.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField22 = localDateTime19.getField(0);
        org.joda.time.LocalDateTime.Property property23 = localDateTime19.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime25 = localDateTime19.withMonthOfYear((int) (short) 10);
        boolean boolean26 = islamicChronology2.equals((java.lang.Object) localDateTime19);
        org.joda.time.DateTimeField dateTimeField27 = islamicChronology2.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField28 = islamicChronology2.year();
        org.joda.time.DateTimeField dateTimeField29 = islamicChronology2.halfdayOfDay();
        org.joda.time.DurationField durationField30 = islamicChronology2.centuries();
        org.joda.time.DateTimeField dateTimeField31 = islamicChronology2.era();
        org.joda.time.DurationField durationField32 = islamicChronology2.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField32, durationField3, and durationField30", !(durationField32.compareTo(durationField3) == 0) || (Math.signum(durationField32.compareTo(durationField30)) == Math.signum(durationField3.compareTo(durationField30))));
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test542");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        int int2 = localDateTime1.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.minusHours((int) (byte) -1);
        int int6 = localDateTime1.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.LocalDateTime localDateTime10 = localDateTime1.minus(readablePeriod9);
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime((long) 1);
        int int13 = localDateTime12.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime12.minusHours((int) (byte) -1);
        int int16 = localDateTime12.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime12.withMinuteOfHour((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime12.plusHours((int) (byte) 100);
        java.util.Date date21 = localDateTime20.toDate();
        org.joda.time.DateTime dateTime22 = localDateTime20.toDateTime();
        org.joda.time.Instant instant23 = dateTime22.toInstant();
        org.joda.time.DateTime dateTime24 = localDateTime1.toDateTime((org.joda.time.ReadableInstant) instant23);
        int int25 = localDateTime1.getYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime22 and instant23", (dateTime22.compareTo(instant23) == 0) == dateTime22.equals(instant23));
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test543");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology2.yearOfEra();
        long long6 = dateTimeField4.roundCeiling(0L);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) 1);
        int int9 = localDateTime8.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.minusHours((int) (byte) -1);
        int int12 = localDateTime8.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime8.withMinuteOfHour((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime8.plusHours((int) (byte) 100);
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.LocalDateTime localDateTime18 = localDateTime8.minus(readableDuration17);
        java.util.Locale locale19 = java.util.Locale.PRC;
        java.util.Locale locale20 = locale19.stripExtensions();
        java.lang.String str21 = dateTimeField4.getAsShortText((org.joda.time.ReadablePartial) localDateTime18, locale19);
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        org.joda.time.LocalDateTime localDateTime23 = localDateTime18.plus(readablePeriod22);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.plusYears(100);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime23.plusMillis(4);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime23.plusMillis(9);
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime((long) 1);
        int int32 = localDateTime31.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime34 = localDateTime31.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology37 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone36);
        org.joda.time.DateTime dateTime38 = localDateTime31.toDateTime(dateTimeZone36);
        org.joda.time.ReadableInstant readableInstant39 = null;
        boolean boolean40 = dateTime38.isAfter(readableInstant39);
        org.joda.time.DateTime dateTime41 = localDateTime29.toDateTime((org.joda.time.ReadableInstant) dateTime38);
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology44 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone43);
        org.joda.time.DurationField durationField45 = islamicChronology44.weekyears();
        org.joda.time.DurationField durationField46 = islamicChronology44.halfdays();
        org.joda.time.DurationField durationField47 = islamicChronology44.weeks();
        org.joda.time.DateTimeField dateTimeField48 = islamicChronology44.yearOfEra();
        org.joda.time.LocalDateTime localDateTime50 = new org.joda.time.LocalDateTime((long) 1);
        int int51 = localDateTime50.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime53 = localDateTime50.minusHours((int) (byte) -1);
        org.joda.time.DateTimeField[] dateTimeFieldArray54 = localDateTime53.getFields();
        java.util.Locale locale55 = java.util.Locale.KOREA;
        java.util.Locale locale56 = java.util.Locale.KOREA;
        java.lang.String str57 = locale55.getDisplayLanguage(locale56);
        java.lang.String str58 = dateTimeField48.getAsText((org.joda.time.ReadablePartial) localDateTime53, locale55);
        org.joda.time.LocalDateTime localDateTime60 = new org.joda.time.LocalDateTime((long) 1);
        int int61 = localDateTime60.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime63 = localDateTime60.minusHours((int) (byte) -1);
        int int65 = localDateTime60.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime67 = localDateTime60.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod68 = null;
        org.joda.time.LocalDateTime localDateTime69 = localDateTime60.minus(readablePeriod68);
        int int70 = localDateTime69.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField72 = localDateTime69.getField(0);
        org.joda.time.LocalDateTime.Property property73 = localDateTime69.centuryOfEra();
        org.joda.time.ReadableDuration readableDuration74 = null;
        org.joda.time.LocalDateTime localDateTime75 = localDateTime69.plus(readableDuration74);
        org.joda.time.LocalDateTime localDateTime77 = localDateTime69.minusMonths(59);
        org.joda.time.LocalDateTime localDateTime79 = localDateTime77.minusMillis((int) (short) 0);
        org.joda.time.tz.NameProvider nameProvider80 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale81 = java.util.Locale.ROOT;
        java.lang.String str84 = nameProvider80.getShortName(locale81, "jpn", "jpn");
        java.lang.String str85 = dateTimeField48.getAsText((org.joda.time.ReadablePartial) localDateTime77, locale81);
        boolean boolean86 = dateTime38.equals((java.lang.Object) locale81);
        org.joda.time.Instant instant87 = dateTime38.toInstant();
        java.lang.String str88 = instant87.toString();
        org.joda.time.DateTimeZone dateTimeZone90 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology91 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone90);
        org.joda.time.DurationField durationField92 = islamicChronology91.weekyears();
        org.joda.time.DateTimeField dateTimeField93 = islamicChronology91.yearOfEra();
        org.joda.time.DateTimeField dateTimeField94 = islamicChronology91.weekOfWeekyear();
        boolean boolean95 = instant87.equals((java.lang.Object) islamicChronology91);
        org.joda.time.DurationField durationField96 = islamicChronology91.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime38 and instant87", (dateTime38.compareTo(instant87) == 0) == dateTime38.equals(instant87));
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test544");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        int int2 = localDateTime1.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.minusHours((int) (byte) -1);
        int int6 = localDateTime1.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.LocalDateTime localDateTime10 = localDateTime1.minus(readablePeriod9);
        int int11 = localDateTime10.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField13 = localDateTime10.getField(0);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forID("+01:00");
        long long18 = dateTimeZone15.adjustOffset((long) 82800001, true);
        boolean boolean19 = dateTimeZone15.isFixed();
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime10, dateTimeZone15);
        int int21 = localDateTime10.getCenturyOfEra();
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime((long) 1);
        int int24 = localDateTime23.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime26 = localDateTime23.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology29 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone28);
        org.joda.time.DateTime dateTime30 = localDateTime23.toDateTime(dateTimeZone28);
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime((long) 1);
        int int33 = localDateTime32.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime35 = localDateTime32.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology38 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone37);
        org.joda.time.DateTime dateTime39 = localDateTime32.toDateTime(dateTimeZone37);
        long long40 = dateTime39.getMillis();
        boolean boolean41 = dateTime30.isAfter((org.joda.time.ReadableInstant) dateTime39);
        long long42 = dateTime39.getMillis();
        org.joda.time.Instant instant43 = dateTime39.toInstant();
        org.joda.time.LocalDateTime localDateTime45 = new org.joda.time.LocalDateTime((long) 1);
        int int46 = localDateTime45.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime48 = localDateTime45.minusHours((int) (byte) -1);
        int int50 = localDateTime45.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime52 = localDateTime45.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod53 = null;
        org.joda.time.LocalDateTime localDateTime54 = localDateTime45.minus(readablePeriod53);
        org.joda.time.LocalDateTime.Property property55 = localDateTime45.millisOfSecond();
        long long56 = property55.remainder();
        java.lang.String str57 = property55.getName();
        java.util.Locale locale58 = java.util.Locale.CHINA;
        java.lang.String str59 = property55.getAsText(locale58);
        org.joda.time.LocalDateTime localDateTime60 = property55.withMinimumValue();
        org.joda.time.LocalDateTime localDateTime62 = localDateTime60.plusYears(4);
        org.joda.time.ReadablePeriod readablePeriod63 = null;
        org.joda.time.LocalDateTime localDateTime64 = localDateTime62.plus(readablePeriod63);
        org.joda.time.DateTimeZone dateTimeZone66 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology67 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone66);
        org.joda.time.DurationField durationField68 = islamicChronology67.weekyears();
        org.joda.time.DurationField durationField69 = islamicChronology67.halfdays();
        org.joda.time.DurationField durationField70 = islamicChronology67.weeks();
        org.joda.time.DateTimeField dateTimeField71 = islamicChronology67.yearOfEra();
        org.joda.time.LocalDateTime localDateTime73 = new org.joda.time.LocalDateTime((long) 1);
        int int74 = localDateTime73.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime76 = localDateTime73.minusHours((int) (byte) -1);
        org.joda.time.DateTimeField[] dateTimeFieldArray77 = localDateTime76.getFields();
        java.util.Locale locale78 = java.util.Locale.KOREA;
        java.util.Locale locale79 = java.util.Locale.KOREA;
        java.lang.String str80 = locale78.getDisplayLanguage(locale79);
        java.lang.String str81 = dateTimeField71.getAsText((org.joda.time.ReadablePartial) localDateTime76, locale78);
        org.joda.time.DateTimeFieldType dateTimeFieldType82 = dateTimeField71.getType();
        org.joda.time.LocalDateTime localDateTime84 = localDateTime62.withField(dateTimeFieldType82, (int) ' ');
        boolean boolean85 = instant43.isSupported(dateTimeFieldType82);
        org.joda.time.LocalDateTime localDateTime87 = localDateTime10.withField(dateTimeFieldType82, 3605100);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime30 and instant43", (dateTime30.compareTo(instant43) == 0) == dateTime30.equals(instant43));
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test545");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology2.weekyear();
        org.joda.time.DurationField durationField4 = islamicChronology2.years();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology2.hourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology2.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology2.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone9 = islamicChronology2.getZone();
        org.joda.time.DurationField durationField10 = islamicChronology2.halfdays();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetMillis(101);
        org.joda.time.Chronology chronology13 = islamicChronology2.withZone(dateTimeZone12);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 0);
        int int17 = dateTimeZone15.getStandardOffset(10L);
        long long19 = dateTimeZone15.nextTransition((long) (-1000));
        boolean boolean20 = dateTimeZone15.isFixed();
        org.joda.time.Chronology chronology21 = islamicChronology2.withZone(dateTimeZone15);
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime((long) 1);
        int int24 = localDateTime23.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime26 = localDateTime23.minusHours((int) (byte) -1);
        org.joda.time.DateTimeField[] dateTimeFieldArray27 = localDateTime26.getFields();
        org.joda.time.LocalDateTime localDateTime29 = localDateTime26.minusDays(4);
        org.joda.time.ReadablePeriod readablePeriod30 = null;
        org.joda.time.LocalDateTime localDateTime31 = localDateTime29.minus(readablePeriod30);
        int int32 = localDateTime31.getYearOfCentury();
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime((long) 1);
        int int35 = localDateTime34.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime37 = localDateTime34.minusHours((int) (byte) -1);
        int int38 = localDateTime34.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime40 = localDateTime34.minusMinutes((int) '#');
        org.joda.time.LocalDateTime localDateTime42 = localDateTime34.plusMonths((-1));
        org.joda.time.LocalDateTime localDateTime44 = new org.joda.time.LocalDateTime((long) 1);
        int int45 = localDateTime44.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime47 = localDateTime44.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology50 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone49);
        org.joda.time.DurationField durationField51 = islamicChronology50.weekyears();
        org.joda.time.DurationField durationField52 = islamicChronology50.halfdays();
        org.joda.time.DateTimeField dateTimeField53 = islamicChronology50.yearOfEra();
        org.joda.time.DurationField durationField54 = islamicChronology50.halfdays();
        org.joda.time.DurationFieldType durationFieldType55 = durationField54.getType();
        boolean boolean56 = localDateTime44.isSupported(durationFieldType55);
        org.joda.time.LocalDateTime localDateTime58 = localDateTime34.withFieldAdded(durationFieldType55, 12);
        boolean boolean59 = localDateTime31.isSupported(durationFieldType55);
        org.joda.time.LocalDateTime.Property property60 = localDateTime31.hourOfDay();
        int int61 = property60.getMaximumValueOverall();
        boolean boolean62 = dateTimeZone15.equals((java.lang.Object) property60);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField51", (durationField4.compareTo(durationField51) == 0) == durationField4.equals(durationField51));
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test546");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology2.yearOfEra();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology2.year();
        org.joda.time.DurationField durationField7 = islamicChronology2.seconds();
        org.joda.time.DurationField durationField8 = islamicChronology2.years();
        org.joda.time.DurationField durationField9 = islamicChronology2.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField8", (durationField3.compareTo(durationField8) == 0) == durationField3.equals(durationField8));
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test547");
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(100, (int) (short) 10, (int) (short) 10, (int) (byte) 0, 0, (int) ' ');
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.plus(readableDuration7);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.plus(readablePeriod9);
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime((long) 1);
        int int13 = localDateTime12.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime12.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology18 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone17);
        org.joda.time.DateTime dateTime19 = localDateTime12.toDateTime(dateTimeZone17);
        long long20 = dateTime19.getMillis();
        org.joda.time.DateTime dateTime21 = localDateTime8.toDateTime((org.joda.time.ReadableInstant) dateTime19);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology24 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone23);
        org.joda.time.DurationField durationField25 = islamicChronology24.weekyears();
        org.joda.time.DurationField durationField26 = islamicChronology24.months();
        org.joda.time.DateTimeField dateTimeField27 = islamicChronology24.minuteOfHour();
        org.joda.time.DurationField durationField28 = islamicChronology24.hours();
        org.joda.time.DateTimeField dateTimeField29 = islamicChronology24.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime((long) 1);
        int int32 = localDateTime31.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime34 = localDateTime31.minusHours((int) (byte) -1);
        int int35 = localDateTime31.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime37 = localDateTime31.minusMinutes((int) '#');
        org.joda.time.LocalDateTime.Property property38 = localDateTime37.centuryOfEra();
        java.util.Locale locale40 = java.util.Locale.FRENCH;
        java.lang.String str41 = dateTimeField29.getAsShortText((org.joda.time.ReadablePartial) localDateTime37, (int) (short) 100, locale40);
        org.joda.time.LocalDateTime localDateTime43 = new org.joda.time.LocalDateTime((long) 1);
        int int44 = localDateTime43.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime46 = localDateTime43.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology49 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone48);
        org.joda.time.DateTime dateTime50 = localDateTime43.toDateTime(dateTimeZone48);
        org.joda.time.ReadableInstant readableInstant51 = null;
        boolean boolean52 = dateTime50.isAfter(readableInstant51);
        org.joda.time.Instant instant53 = dateTime50.toInstant();
        org.joda.time.DateTime dateTime54 = localDateTime37.toDateTime((org.joda.time.ReadableInstant) instant53);
        org.joda.time.Instant instant55 = instant53.toInstant();
        boolean boolean56 = dateTime19.isEqual((org.joda.time.ReadableInstant) instant55);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime50 and instant55", (dateTime50.compareTo(instant55) == 0) == dateTime50.equals(instant55));
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test548");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        int int2 = localDateTime1.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology7 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone6);
        org.joda.time.DateTime dateTime8 = localDateTime1.toDateTime(dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((long) 1);
        int int11 = localDateTime10.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime10.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology16 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone15);
        org.joda.time.DateTime dateTime17 = localDateTime10.toDateTime(dateTimeZone15);
        long long18 = dateTime17.getMillis();
        boolean boolean19 = dateTime8.isAfter((org.joda.time.ReadableInstant) dateTime17);
        long long20 = dateTime17.getMillis();
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime((long) 1);
        int int23 = localDateTime22.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime25 = localDateTime22.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology28 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone27);
        org.joda.time.DateTime dateTime29 = localDateTime22.toDateTime(dateTimeZone27);
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime((long) 1);
        int int32 = localDateTime31.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime34 = localDateTime31.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology37 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone36);
        org.joda.time.DateTime dateTime38 = localDateTime31.toDateTime(dateTimeZone36);
        long long39 = dateTime38.getMillis();
        boolean boolean40 = dateTime29.isAfter((org.joda.time.ReadableInstant) dateTime38);
        long long41 = dateTime38.getMillis();
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology44 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone43);
        org.joda.time.DurationField durationField45 = islamicChronology44.weekyears();
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology48 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone47);
        boolean boolean50 = dateTimeZone47.equals((java.lang.Object) 10L);
        org.joda.time.Chronology chronology51 = islamicChronology44.withZone(dateTimeZone47);
        org.joda.time.DateTimeField dateTimeField52 = islamicChronology44.hourOfHalfday();
        org.joda.time.DurationField durationField53 = dateTimeField52.getRangeDurationField();
        boolean boolean54 = dateTime38.equals((java.lang.Object) durationField53);
        org.joda.time.Instant instant55 = dateTime38.toInstant();
        boolean boolean56 = dateTime17.isEqual((org.joda.time.ReadableInstant) instant55);
        org.joda.time.Instant instant57 = instant55.toInstant();
        org.joda.time.DateTimeZone dateTimeZone58 = instant55.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and instant55", (dateTime8.compareTo(instant55) == 0) == dateTime8.equals(instant55));
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test549");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology2.weekyear();
        org.joda.time.DurationField durationField4 = islamicChronology2.years();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology2.hourOfHalfday();
        org.joda.time.DurationField durationField7 = islamicChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology2.yearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField7", (durationField4.compareTo(durationField7) == 0) == durationField4.equals(durationField7));
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test550");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology2.hourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.millisOfSecond();
        java.lang.String str6 = islamicChronology2.toString();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology2.weekyear();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology2.hourOfDay();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology2.millisOfDay();
        org.joda.time.DurationField durationField10 = islamicChronology2.years();
        org.joda.time.DurationField durationField11 = islamicChronology2.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField10", (durationField3.compareTo(durationField10) == 0) == durationField3.equals(durationField10));
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test551");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = islamicChronology2.years();
        org.joda.time.DurationField durationField5 = islamicChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology2.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone8 = islamicChronology2.getZone();
        boolean boolean9 = dateTimeZone8.isFixed();
        int int11 = dateTimeZone8.getOffsetFromLocal((long) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology14 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone13);
        org.joda.time.DurationField durationField15 = islamicChronology14.weekyears();
        org.joda.time.DurationField durationField16 = islamicChronology14.months();
        org.joda.time.DateTimeField dateTimeField17 = islamicChronology14.minuteOfHour();
        org.joda.time.DurationField durationField18 = islamicChronology14.hours();
        org.joda.time.DateTimeField dateTimeField19 = islamicChronology14.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField20 = islamicChronology14.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField21 = islamicChronology14.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField22 = islamicChronology14.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField23 = islamicChronology14.minuteOfDay();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType24 = islamicChronology14.getLeapYearPatternType();
        org.joda.time.chrono.IslamicChronology islamicChronology25 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone8, leapYearPatternType24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField15", (durationField4.compareTo(durationField15) == 0) == durationField4.equals(durationField15));
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test552");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology6 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone5);
        boolean boolean8 = dateTimeZone5.equals((java.lang.Object) 10L);
        org.joda.time.Chronology chronology9 = islamicChronology2.withZone(dateTimeZone5);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        long long13 = islamicChronology2.add(readablePeriod10, (long) (byte) 0, (-1));
        org.joda.time.DateTimeField dateTimeField14 = islamicChronology2.halfdayOfDay();
        org.joda.time.DurationField durationField15 = islamicChronology2.years();
        org.joda.time.DurationField durationField16 = islamicChronology2.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField15", (durationField3.compareTo(durationField15) == 0) == durationField3.equals(durationField15));
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test553");
        java.util.Set<java.lang.String> strSet0 = org.joda.time.DateTimeZone.getAvailableIDs();
        java.util.Locale locale1 = java.util.Locale.KOREA;
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleAttributes();
        java.util.Locale locale3 = java.util.Locale.KOREA;
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleAttributes();
        boolean boolean5 = strSet2.removeAll((java.util.Collection<java.lang.String>) strSet4);
        boolean boolean6 = strSet0.addAll((java.util.Collection<java.lang.String>) strSet2);
        java.util.Locale.LanguageRange[] languageRangeArray7 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList8 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList8, languageRangeArray7);
        java.util.Locale locale10 = java.util.Locale.JAPAN;
        java.lang.String str11 = locale10.getVariant();
        java.util.Locale locale12 = java.util.Locale.JAPAN;
        java.util.Locale locale13 = java.util.Locale.FRANCE;
        java.lang.String str14 = locale13.getCountry();
        java.util.Locale locale15 = java.util.Locale.GERMAN;
        java.util.Locale locale16 = java.util.Locale.KOREA;
        java.util.Set<java.lang.String> strSet17 = locale16.getUnicodeLocaleAttributes();
        java.util.Locale[] localeArray18 = new java.util.Locale[] { locale10, locale12, locale13, locale15, locale16 };
        java.util.ArrayList<java.util.Locale> localeList19 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList19, localeArray18);
        java.util.Locale.FilteringMode filteringMode21 = null;
        java.util.List<java.util.Locale> localeList22 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList8, (java.util.Collection<java.util.Locale>) localeList19, filteringMode21);
        boolean boolean23 = strSet2.remove((java.lang.Object) localeList19);
        boolean boolean24 = strSet2.isEmpty();
        java.util.Locale locale25 = java.util.Locale.KOREA;
        java.util.Set<java.lang.String> strSet26 = locale25.getUnicodeLocaleAttributes();
        boolean boolean27 = strSet2.removeAll((java.util.Collection<java.lang.String>) strSet26);
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology30 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone29);
        org.joda.time.DurationField durationField31 = islamicChronology30.weekyears();
        org.joda.time.DateTimeField dateTimeField32 = islamicChronology30.millisOfSecond();
        long long36 = islamicChronology30.add((long) (byte) -1, (long) 0, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime38 = new org.joda.time.LocalDateTime((long) 1);
        int int39 = localDateTime38.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime41 = localDateTime38.minusHours((int) (byte) -1);
        int int43 = localDateTime38.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime45 = localDateTime38.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod46 = null;
        org.joda.time.LocalDateTime localDateTime47 = localDateTime38.minus(readablePeriod46);
        int int48 = localDateTime47.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField50 = localDateTime47.getField(0);
        org.joda.time.LocalDateTime.Property property51 = localDateTime47.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime53 = localDateTime47.withMonthOfYear((int) (short) 10);
        boolean boolean54 = islamicChronology30.equals((java.lang.Object) localDateTime47);
        org.joda.time.DurationField durationField55 = islamicChronology30.minutes();
        boolean boolean56 = strSet26.remove((java.lang.Object) islamicChronology30);
        org.joda.time.DurationField durationField57 = islamicChronology30.months();
        org.joda.time.DateTimeField dateTimeField58 = islamicChronology30.minuteOfHour();
        org.joda.time.DurationField durationField59 = islamicChronology30.hours();
        org.joda.time.DateTimeField dateTimeField60 = islamicChronology30.dayOfYear();
        org.joda.time.DurationField durationField61 = islamicChronology30.years();
        org.joda.time.DateTimeField dateTimeField62 = islamicChronology30.minuteOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField31 and durationField61", (durationField31.compareTo(durationField61) == 0) == durationField31.equals(durationField61));
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test554");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = islamicChronology2.years();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) 1);
        int int7 = localDateTime6.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.minusHours((int) (byte) -1);
        int int11 = localDateTime6.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime6.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalDateTime localDateTime15 = localDateTime6.minus(readablePeriod14);
        int int16 = localDateTime15.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField18 = localDateTime15.getField(0);
        org.joda.time.LocalDateTime.Property property19 = localDateTime15.centuryOfEra();
        int[] intArray21 = islamicChronology2.get((org.joda.time.ReadablePartial) localDateTime15, (long) 0);
        org.joda.time.DateTimeField dateTimeField22 = islamicChronology2.millisOfDay();
        org.joda.time.DurationField durationField23 = islamicChronology2.centuries();
        org.joda.time.DateTimeField dateTimeField24 = islamicChronology2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone25 = islamicChronology2.getZone();
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        long long29 = islamicChronology2.add(readablePeriod26, (long) 3, 10);
        org.joda.time.DateTimeField dateTimeField30 = islamicChronology2.yearOfCentury();
        org.joda.time.DurationField durationField31 = islamicChronology2.centuries();
        org.joda.time.DateTimeField dateTimeField32 = islamicChronology2.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField33 = islamicChronology2.clockhourOfDay();
        org.joda.time.DurationField durationField34 = islamicChronology2.years();
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology38 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone37);
        org.joda.time.DurationField durationField39 = islamicChronology38.weekyears();
        org.joda.time.DateTimeField dateTimeField40 = islamicChronology38.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField41 = islamicChronology38.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField42 = islamicChronology38.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone43 = islamicChronology38.getZone();
        org.joda.time.LocalDateTime localDateTime44 = new org.joda.time.LocalDateTime((long) 365, dateTimeZone43);
        org.joda.time.Chronology chronology45 = islamicChronology2.withZone(dateTimeZone43);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField39", (durationField4.compareTo(durationField39) == 0) == durationField4.equals(durationField39));
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test555");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        int int2 = localDateTime1.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.minusHours((int) (byte) -1);
        int int6 = localDateTime1.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.LocalDateTime localDateTime10 = localDateTime1.minus(readablePeriod9);
        org.joda.time.LocalDateTime.Property property11 = localDateTime1.millisOfSecond();
        long long12 = property11.remainder();
        java.lang.String str13 = property11.getName();
        org.joda.time.DurationField durationField14 = property11.getRangeDurationField();
        org.joda.time.DateTimeField dateTimeField15 = property11.getField();
        org.joda.time.LocalDateTime localDateTime16 = property11.getLocalDateTime();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology19 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone18);
        boolean boolean20 = dateTimeZone18.isFixed();
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime((long) 1);
        int int23 = localDateTime22.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime25 = localDateTime22.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology28 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone27);
        org.joda.time.DateTime dateTime29 = localDateTime22.toDateTime(dateTimeZone27);
        org.joda.time.ReadableInstant readableInstant30 = null;
        boolean boolean31 = dateTime29.isAfter(readableInstant30);
        org.joda.time.Instant instant32 = dateTime29.toInstant();
        java.lang.String str33 = dateTime29.toString();
        int int34 = dateTimeZone18.getOffset((org.joda.time.ReadableInstant) dateTime29);
        long long35 = property11.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime29);
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology38 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone37);
        org.joda.time.DurationField durationField39 = islamicChronology38.weekyears();
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology42 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone41);
        boolean boolean44 = dateTimeZone41.equals((java.lang.Object) 10L);
        org.joda.time.Chronology chronology45 = islamicChronology38.withZone(dateTimeZone41);
        org.joda.time.DateTimeField dateTimeField46 = islamicChronology38.hourOfHalfday();
        org.joda.time.LocalDateTime localDateTime48 = new org.joda.time.LocalDateTime((long) 1);
        int int49 = localDateTime48.getHourOfDay();
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology52 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone51);
        org.joda.time.DateTimeField dateTimeField53 = islamicChronology52.weekyear();
        org.joda.time.ReadablePartial readablePartial54 = null;
        int[] intArray61 = new int[] { (short) 100, 10, 100, (short) -1, (byte) 10 };
        int[] intArray63 = dateTimeField53.addWrapPartial(readablePartial54, 100, intArray61, (int) (short) 0);
        int int64 = dateTimeField46.getMaximumValue((org.joda.time.ReadablePartial) localDateTime48, intArray61);
        org.joda.time.LocalDateTime localDateTime66 = new org.joda.time.LocalDateTime((long) 1);
        int int67 = localDateTime66.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime69 = localDateTime66.minusHours((int) (byte) -1);
        int int71 = localDateTime66.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime73 = localDateTime66.withMillisOfSecond((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime74 = localDateTime48.withFields((org.joda.time.ReadablePartial) localDateTime73);
        org.joda.time.DateTimeField[] dateTimeFieldArray75 = localDateTime73.getFields();
        org.joda.time.ReadableDuration readableDuration76 = null;
        org.joda.time.LocalDateTime localDateTime77 = localDateTime73.plus(readableDuration76);
        int int78 = property11.compareTo((org.joda.time.ReadablePartial) localDateTime77);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime29 and instant32", (dateTime29.compareTo(instant32) == 0) == dateTime29.equals(instant32));
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test556");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology2.weekyear();
        org.joda.time.DurationField durationField4 = islamicChronology2.years();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology2.hourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology2.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology2.weekyear();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology2.yearOfEra();
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((long) 1);
        int int12 = localDateTime11.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.minusHours((int) (byte) -1);
        int int16 = localDateTime11.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime11.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.LocalDateTime localDateTime20 = localDateTime11.minus(readablePeriod19);
        int int21 = localDateTime20.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField23 = localDateTime20.getField(0);
        org.joda.time.LocalDateTime.Property property24 = localDateTime20.centuryOfEra();
        org.joda.time.LocalDateTime.Property property25 = localDateTime20.millisOfSecond();
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = property25.getFieldType();
        java.lang.String str27 = property25.getAsString();
        org.joda.time.LocalDateTime localDateTime29 = property25.addWrapFieldToCopy(999);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime29.plusWeeks(11);
        int[] intArray33 = islamicChronology2.get((org.joda.time.ReadablePartial) localDateTime31, (-86400001L));
        org.joda.time.Chronology chronology34 = islamicChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField35 = islamicChronology2.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField36 = islamicChronology2.dayOfYear();
        org.joda.time.DurationField durationField37 = islamicChronology2.eras();
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology40 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone39);
        org.joda.time.DurationField durationField41 = islamicChronology40.weekyears();
        org.joda.time.DateTimeField dateTimeField42 = islamicChronology40.yearOfEra();
        long long44 = dateTimeField42.roundCeiling(0L);
        org.joda.time.LocalDateTime localDateTime46 = new org.joda.time.LocalDateTime((long) 1);
        int int47 = localDateTime46.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime49 = localDateTime46.minusHours((int) (byte) -1);
        int int50 = localDateTime46.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime52 = localDateTime46.withMinuteOfHour((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime54 = localDateTime46.plusHours((int) (byte) 100);
        org.joda.time.ReadableDuration readableDuration55 = null;
        org.joda.time.LocalDateTime localDateTime56 = localDateTime46.minus(readableDuration55);
        java.util.Locale locale57 = java.util.Locale.PRC;
        java.util.Locale locale58 = locale57.stripExtensions();
        java.lang.String str59 = dateTimeField42.getAsShortText((org.joda.time.ReadablePartial) localDateTime56, locale57);
        org.joda.time.ReadablePeriod readablePeriod60 = null;
        org.joda.time.LocalDateTime localDateTime61 = localDateTime56.plus(readablePeriod60);
        org.joda.time.LocalDateTime localDateTime63 = localDateTime61.plusYears(100);
        org.joda.time.LocalDateTime localDateTime65 = localDateTime61.plusMillis(4);
        org.joda.time.DateTimeZone dateTimeZone68 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology69 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone68);
        boolean boolean70 = dateTimeZone68.isFixed();
        long long74 = dateTimeZone68.convertLocalToUTC((long) (byte) 100, false, 10L);
        org.joda.time.LocalDateTime localDateTime75 = new org.joda.time.LocalDateTime((long) 86399, dateTimeZone68);
        boolean boolean76 = localDateTime61.isEqual((org.joda.time.ReadablePartial) localDateTime75);
        org.joda.time.LocalDateTime localDateTime78 = localDateTime75.minusMinutes(7200098);
        org.joda.time.LocalDateTime localDateTime80 = localDateTime75.withDayOfMonth(5);
        org.joda.time.LocalDateTime localDateTime82 = localDateTime80.minusSeconds(3600000);
        org.joda.time.LocalDateTime localDateTime84 = localDateTime80.minusMillis((int) ' ');
        int[] intArray86 = islamicChronology2.get((org.joda.time.ReadablePartial) localDateTime84, 3059938800000L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField4 and durationField37", Math.signum(durationField4.compareTo(durationField37)) == -Math.signum(durationField37.compareTo(durationField4)));
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test557");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology6 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone5);
        boolean boolean8 = dateTimeZone5.equals((java.lang.Object) 10L);
        org.joda.time.Chronology chronology9 = islamicChronology2.withZone(dateTimeZone5);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        long long13 = islamicChronology2.add(readablePeriod10, (long) (byte) 0, (-1));
        org.joda.time.DateTimeField dateTimeField14 = islamicChronology2.halfdayOfDay();
        org.joda.time.DurationField durationField15 = islamicChronology2.years();
        org.joda.time.DateTimeField dateTimeField16 = islamicChronology2.centuryOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField15", (durationField3.compareTo(durationField15) == 0) == durationField3.equals(durationField15));
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test558");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = islamicChronology2.years();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) 1);
        int int7 = localDateTime6.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.minusHours((int) (byte) -1);
        int int11 = localDateTime6.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime6.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalDateTime localDateTime15 = localDateTime6.minus(readablePeriod14);
        int int16 = localDateTime15.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField18 = localDateTime15.getField(0);
        org.joda.time.LocalDateTime.Property property19 = localDateTime15.centuryOfEra();
        int[] intArray21 = islamicChronology2.get((org.joda.time.ReadablePartial) localDateTime15, (long) 0);
        org.joda.time.DateTimeField dateTimeField22 = islamicChronology2.millisOfDay();
        org.joda.time.DurationField durationField23 = islamicChronology2.centuries();
        org.joda.time.DateTimeZone dateTimeZone24 = islamicChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField25 = islamicChronology2.dayOfWeek();
        org.joda.time.DurationField durationField26 = islamicChronology2.minutes();
        org.joda.time.DateTimeField dateTimeField27 = islamicChronology2.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField28 = islamicChronology2.secondOfDay();
        org.joda.time.DurationField durationField29 = islamicChronology2.days();
        org.joda.time.DurationField durationField30 = islamicChronology2.weeks();
        org.joda.time.DateTimeField dateTimeField31 = islamicChronology2.dayOfMonth();
        org.joda.time.DurationField durationField32 = islamicChronology2.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField32, durationField4, and durationField23", !(durationField32.compareTo(durationField4) == 0) || (Math.signum(durationField32.compareTo(durationField23)) == Math.signum(durationField4.compareTo(durationField23))));
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test559");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DurationField durationField4 = islamicChronology2.halfdays();
        org.joda.time.DurationField durationField5 = islamicChronology2.weeks();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology2.yearOfEra();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology2.dayOfWeek();
        org.joda.time.DurationField durationField8 = islamicChronology2.seconds();
        org.joda.time.DateTimeZone dateTimeZone9 = islamicChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology2.weekyearOfCentury();
        org.joda.time.DurationField durationField11 = islamicChronology2.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField11, durationField3, and durationField4", !(durationField11.compareTo(durationField3) == 0) || (Math.signum(durationField11.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test560");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((-18426));
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology4 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone3);
        org.joda.time.DurationField durationField5 = islamicChronology4.weekyears();
        org.joda.time.DurationField durationField6 = islamicChronology4.months();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology4.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology10 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone9);
        org.joda.time.DurationField durationField11 = islamicChronology10.weekyears();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology14 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone13);
        boolean boolean16 = dateTimeZone13.equals((java.lang.Object) 10L);
        org.joda.time.Chronology chronology17 = islamicChronology10.withZone(dateTimeZone13);
        org.joda.time.DateTimeField dateTimeField18 = islamicChronology10.hourOfHalfday();
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime((long) 1);
        int int21 = localDateTime20.getHourOfDay();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology24 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField25 = islamicChronology24.weekyear();
        org.joda.time.ReadablePartial readablePartial26 = null;
        int[] intArray33 = new int[] { (short) 100, 10, 100, (short) -1, (byte) 10 };
        int[] intArray35 = dateTimeField25.addWrapPartial(readablePartial26, 100, intArray33, (int) (short) 0);
        int int36 = dateTimeField18.getMaximumValue((org.joda.time.ReadablePartial) localDateTime20, intArray33);
        org.joda.time.LocalDateTime localDateTime38 = new org.joda.time.LocalDateTime((long) 1);
        int int39 = localDateTime38.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime41 = localDateTime38.minusHours((int) (byte) -1);
        int int43 = localDateTime38.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime45 = localDateTime38.withMillisOfSecond((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime46 = localDateTime20.withFields((org.joda.time.ReadablePartial) localDateTime45);
        int int47 = dateTimeField7.getMinimumValue((org.joda.time.ReadablePartial) localDateTime46);
        org.joda.time.DurationField durationField48 = dateTimeField7.getRangeDurationField();
        boolean boolean49 = dateTimeZone1.equals((java.lang.Object) durationField48);
        org.joda.time.chrono.IslamicChronology islamicChronology50 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField51 = islamicChronology50.dayOfYear();
        org.joda.time.ReadablePeriod readablePeriod52 = null;
        long long55 = islamicChronology50.add(readablePeriod52, (long) (byte) 10, 0);
        org.joda.time.DateTimeField dateTimeField56 = islamicChronology50.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone58 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology59 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone58);
        org.joda.time.DateTimeField dateTimeField60 = islamicChronology59.weekyear();
        org.joda.time.DurationField durationField61 = islamicChronology59.years();
        org.joda.time.DateTimeField dateTimeField62 = islamicChronology59.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField63 = islamicChronology59.hourOfDay();
        org.joda.time.DateTimeField dateTimeField64 = islamicChronology59.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField65 = islamicChronology59.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone66 = islamicChronology59.getZone();
        org.joda.time.Chronology chronology67 = islamicChronology50.withZone(dateTimeZone66);
        org.joda.time.LocalDateTime localDateTime69 = new org.joda.time.LocalDateTime((long) 1);
        int int70 = localDateTime69.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime72 = localDateTime69.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone74 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology75 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone74);
        org.joda.time.DateTime dateTime76 = localDateTime69.toDateTime(dateTimeZone74);
        org.joda.time.LocalDateTime localDateTime78 = new org.joda.time.LocalDateTime((long) 1);
        int int79 = localDateTime78.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime81 = localDateTime78.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone83 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology84 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone83);
        org.joda.time.DateTime dateTime85 = localDateTime78.toDateTime(dateTimeZone83);
        long long86 = dateTime85.getMillis();
        boolean boolean87 = dateTime76.isAfter((org.joda.time.ReadableInstant) dateTime85);
        int int88 = dateTimeZone66.getOffset((org.joda.time.ReadableInstant) dateTime85);
        int int89 = dateTimeZone1.getOffset((org.joda.time.ReadableInstant) dateTime85);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField61", (durationField5.compareTo(durationField61) == 0) == durationField5.equals(durationField61));
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test561");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        int int3 = islamicChronology2.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology2.weekyear();
        org.joda.time.DurationField durationField5 = islamicChronology2.hours();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology2.centuryOfEra();
        org.joda.time.DurationField durationField8 = islamicChronology2.centuries();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology2.weekOfWeekyear();
        java.lang.String str10 = islamicChronology2.toString();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology13 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone12);
        org.joda.time.DateTimeField dateTimeField14 = islamicChronology13.weekyear();
        org.joda.time.DurationField durationField15 = islamicChronology13.weekyears();
        org.joda.time.DateTimeZone dateTimeZone16 = islamicChronology13.getZone();
        long long19 = dateTimeZone16.adjustOffset((-42404947200001L), true);
        org.joda.time.Chronology chronology20 = islamicChronology2.withZone(dateTimeZone16);
        org.joda.time.DateTimeField dateTimeField21 = islamicChronology2.weekyear();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology25 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone24);
        org.joda.time.DateTimeField dateTimeField26 = islamicChronology25.weekyear();
        org.joda.time.DurationField durationField27 = islamicChronology25.years();
        org.joda.time.DateTimeField dateTimeField28 = islamicChronology25.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField29 = islamicChronology25.hourOfDay();
        boolean boolean30 = dateTimeField29.isLenient();
        long long32 = dateTimeField29.roundHalfFloor((long) 60);
        int int33 = dateTimeField29.getMinimumValue();
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime((long) 1);
        int int36 = localDateTime35.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime38 = localDateTime35.minusHours((int) (byte) -1);
        int int39 = localDateTime35.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime41 = localDateTime35.minusMinutes((int) '#');
        org.joda.time.LocalDateTime.Property property42 = localDateTime41.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime43 = property42.roundCeilingCopy();
        int int44 = localDateTime43.size();
        org.joda.time.LocalDateTime localDateTime46 = localDateTime43.plusMinutes(292278993);
        org.joda.time.LocalDateTime localDateTime48 = localDateTime43.plusMonths((-1));
        org.joda.time.tz.NameProvider nameProvider49 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale50 = java.util.Locale.KOREA;
        java.util.Set<java.lang.String> strSet51 = locale50.getUnicodeLocaleAttributes();
        java.lang.String str53 = locale50.getUnicodeLocaleType("FR");
        java.lang.String str56 = nameProvider49.getName(locale50, "\uc601\uc5b4", "GMT+00:00");
        java.lang.String str57 = locale50.getLanguage();
        java.util.Locale locale58 = java.util.Locale.KOREA;
        java.util.Set<java.lang.String> strSet59 = locale58.getUnicodeLocaleAttributes();
        java.lang.String str60 = locale50.getDisplayScript(locale58);
        java.lang.String str61 = dateTimeField29.getAsText((org.joda.time.ReadablePartial) localDateTime43, locale50);
        java.util.Set<java.lang.String> strSet62 = locale50.getUnicodeLocaleKeys();
        java.lang.String str63 = dateTimeField21.getAsShortText(5612400001L, locale50);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField15 and durationField27", (durationField15.compareTo(durationField27) == 0) == durationField15.equals(durationField27));
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test562");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology2.hourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology2.monthOfYear();
        org.joda.time.DurationField durationField7 = islamicChronology2.years();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology2.weekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField7", (durationField3.compareTo(durationField7) == 0) == durationField3.equals(durationField7));
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test563");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = islamicChronology2.years();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) 1);
        int int7 = localDateTime6.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.minusHours((int) (byte) -1);
        int int11 = localDateTime6.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime6.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalDateTime localDateTime15 = localDateTime6.minus(readablePeriod14);
        int int16 = localDateTime15.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField18 = localDateTime15.getField(0);
        org.joda.time.LocalDateTime.Property property19 = localDateTime15.centuryOfEra();
        int[] intArray21 = islamicChronology2.get((org.joda.time.ReadablePartial) localDateTime15, (long) 0);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime15.withMillisOfSecond(60);
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime((long) 1);
        int int26 = localDateTime25.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime28 = localDateTime25.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology31 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone30);
        org.joda.time.DateTime dateTime32 = localDateTime25.toDateTime(dateTimeZone30);
        org.joda.time.Instant instant33 = dateTime32.toInstant();
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime((long) 1);
        int int36 = localDateTime35.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime38 = localDateTime35.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology41 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone40);
        org.joda.time.DateTime dateTime42 = localDateTime35.toDateTime(dateTimeZone40);
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology45 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone44);
        org.joda.time.DurationField durationField46 = islamicChronology45.weekyears();
        org.joda.time.DurationField durationField47 = islamicChronology45.months();
        org.joda.time.DateTimeField dateTimeField48 = islamicChronology45.halfdayOfDay();
        org.joda.time.LocalDateTime localDateTime50 = new org.joda.time.LocalDateTime((long) 1);
        int int51 = localDateTime50.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime53 = localDateTime50.minusHours((int) (byte) -1);
        int int55 = localDateTime50.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime57 = localDateTime50.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod58 = null;
        org.joda.time.LocalDateTime localDateTime59 = localDateTime50.minus(readablePeriod58);
        int int60 = localDateTime59.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField62 = localDateTime59.getField(0);
        org.joda.time.LocalDateTime.Property property63 = localDateTime59.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime65 = new org.joda.time.LocalDateTime((long) 1);
        int int66 = localDateTime65.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime68 = localDateTime65.withYear((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod69 = null;
        org.joda.time.LocalDateTime localDateTime71 = localDateTime68.withPeriodAdded(readablePeriod69, 10);
        org.joda.time.LocalDateTime localDateTime73 = localDateTime71.withDayOfYear(11);
        int[] intArray74 = localDateTime73.getValues();
        islamicChronology45.validate((org.joda.time.ReadablePartial) localDateTime59, intArray74);
        org.joda.time.LocalDateTime localDateTime77 = localDateTime59.withMillisOfDay(0);
        boolean boolean78 = dateTime42.equals((java.lang.Object) localDateTime77);
        boolean boolean79 = instant33.isEqual((org.joda.time.ReadableInstant) dateTime42);
        org.joda.time.DateTime dateTime80 = localDateTime23.toDateTime((org.joda.time.ReadableInstant) instant33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField46", (durationField4.compareTo(durationField46) == 0) == durationField4.equals(durationField46));
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test564");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DurationField durationField4 = islamicChronology2.months();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.minuteOfHour();
        org.joda.time.DurationField durationField6 = islamicChronology2.seconds();
        org.joda.time.DurationField durationField7 = islamicChronology2.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField7, durationField3, and durationField4", !(durationField7.compareTo(durationField3) == 0) || (Math.signum(durationField7.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test565");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DurationField durationField4 = islamicChronology2.months();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology8 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone7);
        org.joda.time.DurationField durationField9 = islamicChronology8.weekyears();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology12 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone11);
        boolean boolean14 = dateTimeZone11.equals((java.lang.Object) 10L);
        org.joda.time.Chronology chronology15 = islamicChronology8.withZone(dateTimeZone11);
        org.joda.time.DateTimeField dateTimeField16 = islamicChronology8.hourOfHalfday();
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime((long) 1);
        int int19 = localDateTime18.getHourOfDay();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology22 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone21);
        org.joda.time.DateTimeField dateTimeField23 = islamicChronology22.weekyear();
        org.joda.time.ReadablePartial readablePartial24 = null;
        int[] intArray31 = new int[] { (short) 100, 10, 100, (short) -1, (byte) 10 };
        int[] intArray33 = dateTimeField23.addWrapPartial(readablePartial24, 100, intArray31, (int) (short) 0);
        int int34 = dateTimeField16.getMaximumValue((org.joda.time.ReadablePartial) localDateTime18, intArray31);
        org.joda.time.LocalDateTime localDateTime36 = new org.joda.time.LocalDateTime((long) 1);
        int int37 = localDateTime36.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime39 = localDateTime36.minusHours((int) (byte) -1);
        int int41 = localDateTime36.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime43 = localDateTime36.withMillisOfSecond((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime44 = localDateTime18.withFields((org.joda.time.ReadablePartial) localDateTime43);
        int int45 = dateTimeField5.getMinimumValue((org.joda.time.ReadablePartial) localDateTime44);
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology49 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone48);
        org.joda.time.DateTimeField dateTimeField50 = islamicChronology49.weekyear();
        org.joda.time.DurationField durationField51 = islamicChronology49.years();
        org.joda.time.DateTimeField dateTimeField52 = islamicChronology49.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField53 = islamicChronology49.hourOfDay();
        long long56 = dateTimeField53.addWrapField((long) (-1), (int) (byte) -1);
        long long59 = dateTimeField53.set(1L, 5);
        java.util.Locale locale60 = java.util.Locale.getDefault();
        int int61 = dateTimeField53.getMaximumShortTextLength(locale60);
        org.joda.time.LocalDateTime localDateTime63 = new org.joda.time.LocalDateTime((long) 1);
        int int64 = localDateTime63.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime66 = localDateTime63.minusHours((int) (byte) -1);
        int int68 = localDateTime63.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime70 = localDateTime63.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod71 = null;
        org.joda.time.LocalDateTime localDateTime72 = localDateTime63.minus(readablePeriod71);
        org.joda.time.LocalDateTime.Property property73 = localDateTime63.millisOfSecond();
        long long74 = property73.remainder();
        java.lang.String str75 = property73.getName();
        java.util.Locale locale76 = java.util.Locale.CHINA;
        java.lang.String str77 = property73.getAsText(locale76);
        org.joda.time.LocalDateTime localDateTime78 = property73.withMinimumValue();
        boolean boolean80 = property73.equals((java.lang.Object) 59);
        org.joda.time.DurationField durationField81 = property73.getRangeDurationField();
        java.util.Locale locale85 = new java.util.Locale("DateTimeField[minuteOfDay]", "kor", "fra");
        int int86 = property73.getMaximumTextLength(locale85);
        java.lang.String str87 = locale60.getDisplayName(locale85);
        java.util.Locale.Category category88 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale89 = java.util.Locale.KOREA;
        java.util.Locale locale90 = java.util.Locale.KOREA;
        java.lang.String str91 = locale89.getDisplayLanguage(locale90);
        java.util.Locale.setDefault(locale89);
        java.util.Locale.setDefault(category88, locale89);
        java.util.Locale locale94 = java.util.Locale.getDefault(category88);
        java.lang.String str95 = locale60.getDisplayLanguage(locale94);
        java.lang.String str96 = dateTimeField5.getAsShortText(26, locale60);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField51", (durationField3.compareTo(durationField51) == 0) == durationField3.equals(durationField51));
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test566");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone2);
        org.joda.time.DurationField durationField4 = islamicChronology3.weekyears();
        org.joda.time.DurationField durationField5 = islamicChronology3.months();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology3.halfdayOfDay();
        org.joda.time.DurationField durationField7 = islamicChronology3.millis();
        java.lang.String str8 = islamicChronology3.toString();
        org.joda.time.DurationField durationField9 = islamicChronology3.halfdays();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology12 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone11);
        org.joda.time.DurationField durationField13 = islamicChronology12.weekyears();
        org.joda.time.DurationField durationField14 = islamicChronology12.halfdays();
        org.joda.time.DateTimeField dateTimeField15 = islamicChronology12.yearOfEra();
        org.joda.time.DurationField durationField16 = islamicChronology12.halfdays();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology19 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone18);
        org.joda.time.DurationField durationField20 = islamicChronology19.weekyears();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology23 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone22);
        boolean boolean25 = dateTimeZone22.equals((java.lang.Object) 10L);
        org.joda.time.Chronology chronology26 = islamicChronology19.withZone(dateTimeZone22);
        java.util.Locale locale28 = java.util.Locale.KOREA;
        java.util.Locale locale29 = java.util.Locale.KOREA;
        java.lang.String str30 = locale28.getDisplayLanguage(locale29);
        java.lang.String str31 = locale29.getISO3Country();
        java.util.Set<java.lang.String> strSet32 = locale29.getUnicodeLocaleAttributes();
        java.lang.String str33 = dateTimeZone22.getName(24796800001L, locale29);
        org.joda.time.Chronology chronology34 = islamicChronology12.withZone(dateTimeZone22);
        int int36 = dateTimeZone22.getStandardOffset(43200010L);
        org.joda.time.Chronology chronology37 = islamicChronology3.withZone(dateTimeZone22);
        org.joda.time.LocalDateTime localDateTime38 = new org.joda.time.LocalDateTime(obj0, chronology37);
        org.joda.time.LocalDateTime localDateTime40 = localDateTime38.minusHours((-16385303));
        java.util.Set<java.lang.String> strSet41 = org.joda.time.DateTimeZone.getAvailableIDs();
        java.util.Locale locale42 = java.util.Locale.KOREA;
        java.util.Set<java.lang.String> strSet43 = locale42.getUnicodeLocaleAttributes();
        java.util.Locale locale44 = java.util.Locale.KOREA;
        java.util.Set<java.lang.String> strSet45 = locale44.getUnicodeLocaleAttributes();
        boolean boolean46 = strSet43.removeAll((java.util.Collection<java.lang.String>) strSet45);
        boolean boolean47 = strSet41.addAll((java.util.Collection<java.lang.String>) strSet43);
        java.util.Locale.LanguageRange[] languageRangeArray48 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList49 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList49, languageRangeArray48);
        java.util.Locale locale51 = java.util.Locale.JAPAN;
        java.lang.String str52 = locale51.getVariant();
        java.util.Locale locale53 = java.util.Locale.JAPAN;
        java.util.Locale locale54 = java.util.Locale.FRANCE;
        java.lang.String str55 = locale54.getCountry();
        java.util.Locale locale56 = java.util.Locale.GERMAN;
        java.util.Locale locale57 = java.util.Locale.KOREA;
        java.util.Set<java.lang.String> strSet58 = locale57.getUnicodeLocaleAttributes();
        java.util.Locale[] localeArray59 = new java.util.Locale[] { locale51, locale53, locale54, locale56, locale57 };
        java.util.ArrayList<java.util.Locale> localeList60 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList60, localeArray59);
        java.util.Locale.FilteringMode filteringMode62 = null;
        java.util.List<java.util.Locale> localeList63 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList49, (java.util.Collection<java.util.Locale>) localeList60, filteringMode62);
        boolean boolean64 = strSet43.remove((java.lang.Object) localeList60);
        boolean boolean65 = strSet43.isEmpty();
        org.joda.time.LocalDateTime localDateTime67 = new org.joda.time.LocalDateTime((long) 1);
        int int68 = localDateTime67.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime70 = localDateTime67.minusHours((int) (byte) -1);
        int int72 = localDateTime67.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime74 = localDateTime67.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod75 = null;
        org.joda.time.LocalDateTime localDateTime76 = localDateTime67.minus(readablePeriod75);
        int int77 = localDateTime76.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField79 = localDateTime76.getField(0);
        boolean boolean80 = strSet43.remove((java.lang.Object) 0);
        java.util.Locale locale81 = java.util.Locale.KOREA;
        java.util.Locale locale82 = java.util.Locale.KOREA;
        java.lang.String str83 = locale81.getDisplayLanguage(locale82);
        java.lang.String str84 = locale82.getISO3Country();
        java.util.Set<java.lang.String> strSet85 = locale82.getUnicodeLocaleAttributes();
        boolean boolean86 = strSet43.removeAll((java.util.Collection<java.lang.String>) strSet85);
        org.joda.time.DateTimeZone dateTimeZone88 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology89 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone88);
        org.joda.time.DateTimeField dateTimeField90 = islamicChronology89.yearOfCentury();
        org.joda.time.DurationField durationField91 = islamicChronology89.years();
        org.joda.time.DurationField durationField92 = islamicChronology89.halfdays();
        org.joda.time.DateTimeField dateTimeField93 = islamicChronology89.hourOfHalfday();
        org.joda.time.DurationField durationField94 = islamicChronology89.hours();
        boolean boolean95 = strSet85.remove((java.lang.Object) islamicChronology89);
        org.joda.time.DateTimeZone dateTimeZone96 = islamicChronology89.getZone();
        org.joda.time.DateTimeZone dateTimeZone97 = islamicChronology89.getZone();
        org.joda.time.DateTime dateTime98 = localDateTime38.toDateTime(dateTimeZone97);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField91", (durationField4.compareTo(durationField91) == 0) == durationField4.equals(durationField91));
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test567");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        int int2 = localDateTime1.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.minusHours((int) (byte) -1);
        int int6 = localDateTime1.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.LocalDateTime localDateTime10 = localDateTime1.minus(readablePeriod9);
        org.joda.time.LocalDateTime.Property property11 = localDateTime1.millisOfSecond();
        long long12 = property11.remainder();
        java.lang.String str13 = property11.getName();
        org.joda.time.DurationField durationField14 = property11.getRangeDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = property11.getFieldType();
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime((long) 1);
        int int18 = localDateTime17.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime17.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology23 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone22);
        org.joda.time.DateTime dateTime24 = localDateTime17.toDateTime(dateTimeZone22);
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime((long) 1);
        int int27 = localDateTime26.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime29 = localDateTime26.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology32 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone31);
        org.joda.time.DateTime dateTime33 = localDateTime26.toDateTime(dateTimeZone31);
        long long34 = dateTime33.getMillis();
        boolean boolean35 = dateTime24.isAfter((org.joda.time.ReadableInstant) dateTime33);
        long long36 = dateTime33.getMillis();
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology39 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone38);
        org.joda.time.DurationField durationField40 = islamicChronology39.weekyears();
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology43 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone42);
        boolean boolean45 = dateTimeZone42.equals((java.lang.Object) 10L);
        org.joda.time.Chronology chronology46 = islamicChronology39.withZone(dateTimeZone42);
        org.joda.time.DateTimeField dateTimeField47 = islamicChronology39.hourOfHalfday();
        org.joda.time.DurationField durationField48 = dateTimeField47.getRangeDurationField();
        boolean boolean49 = dateTime33.equals((java.lang.Object) durationField48);
        org.joda.time.Instant instant50 = dateTime33.toInstant();
        long long51 = instant50.getMillis();
        long long52 = property11.getDifferenceAsLong((org.joda.time.ReadableInstant) instant50);
        java.lang.String str53 = property11.getName();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime24 and instant50", (dateTime24.compareTo(instant50) == 0) == dateTime24.equals(instant50));
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test568");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = islamicChronology2.years();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) 1);
        int int7 = localDateTime6.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.minusHours((int) (byte) -1);
        int int11 = localDateTime6.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime6.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalDateTime localDateTime15 = localDateTime6.minus(readablePeriod14);
        int int16 = localDateTime15.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField18 = localDateTime15.getField(0);
        org.joda.time.LocalDateTime.Property property19 = localDateTime15.centuryOfEra();
        int[] intArray21 = islamicChronology2.get((org.joda.time.ReadablePartial) localDateTime15, (long) 0);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime15.withMillisOfSecond(60);
        org.joda.time.LocalDateTime.Property property24 = localDateTime23.dayOfYear();
        int int25 = localDateTime23.getYear();
        org.joda.time.LocalDateTime localDateTime27 = localDateTime23.plusMinutes(2022);
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime((long) 1);
        int int30 = localDateTime29.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime32 = localDateTime29.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology35 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone34);
        org.joda.time.DateTime dateTime36 = localDateTime29.toDateTime(dateTimeZone34);
        org.joda.time.ReadableInstant readableInstant37 = null;
        boolean boolean38 = dateTime36.isAfter(readableInstant37);
        org.joda.time.Instant instant39 = dateTime36.toInstant();
        java.lang.String str40 = dateTime36.toString();
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime((long) (byte) -1);
        org.joda.time.LocalDateTime localDateTime44 = localDateTime42.minusDays(12);
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology47 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone46);
        org.joda.time.DurationField durationField48 = islamicChronology47.weekyears();
        org.joda.time.DurationField durationField49 = islamicChronology47.halfdays();
        org.joda.time.DateTimeField dateTimeField50 = islamicChronology47.yearOfEra();
        org.joda.time.DurationField durationField51 = islamicChronology47.halfdays();
        org.joda.time.DurationFieldType durationFieldType52 = durationField51.getType();
        org.joda.time.LocalDateTime localDateTime54 = localDateTime42.withFieldAdded(durationFieldType52, (int) '#');
        org.joda.time.DateTimeZone dateTimeZone56 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology57 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone56);
        org.joda.time.DurationField durationField58 = islamicChronology57.weekyears();
        org.joda.time.DurationField durationField59 = islamicChronology57.halfdays();
        org.joda.time.DurationField durationField60 = islamicChronology57.weeks();
        org.joda.time.DateTimeField dateTimeField61 = islamicChronology57.yearOfEra();
        org.joda.time.LocalDateTime localDateTime63 = new org.joda.time.LocalDateTime((long) 1);
        int int64 = localDateTime63.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime66 = localDateTime63.minusHours((int) (byte) -1);
        org.joda.time.DateTimeField[] dateTimeFieldArray67 = localDateTime66.getFields();
        java.util.Locale locale68 = java.util.Locale.KOREA;
        java.util.Locale locale69 = java.util.Locale.KOREA;
        java.lang.String str70 = locale68.getDisplayLanguage(locale69);
        java.lang.String str71 = dateTimeField61.getAsText((org.joda.time.ReadablePartial) localDateTime66, locale68);
        org.joda.time.DateTimeFieldType dateTimeFieldType72 = dateTimeField61.getType();
        org.joda.time.LocalDateTime.Property property73 = localDateTime54.property(dateTimeFieldType72);
        int int74 = dateTime36.get(dateTimeFieldType72);
        boolean boolean75 = localDateTime27.isSupported(dateTimeFieldType72);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField48", (durationField4.compareTo(durationField48) == 0) == durationField4.equals(durationField48));
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test569");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = islamicChronology2.years();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) 1);
        int int7 = localDateTime6.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.minusHours((int) (byte) -1);
        int int11 = localDateTime6.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime6.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalDateTime localDateTime15 = localDateTime6.minus(readablePeriod14);
        int int16 = localDateTime15.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField18 = localDateTime15.getField(0);
        org.joda.time.LocalDateTime.Property property19 = localDateTime15.centuryOfEra();
        int[] intArray21 = islamicChronology2.get((org.joda.time.ReadablePartial) localDateTime15, (long) 0);
        org.joda.time.DateTimeField dateTimeField22 = islamicChronology2.millisOfDay();
        org.joda.time.DurationField durationField23 = islamicChronology2.centuries();
        org.joda.time.DateTimeField dateTimeField24 = islamicChronology2.dayOfYear();
        org.joda.time.DateTimeField dateTimeField25 = islamicChronology2.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone26 = islamicChronology2.getZone();
        long long28 = dateTimeZone26.nextTransition((long) 59);
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology31 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone30);
        org.joda.time.DurationField durationField32 = islamicChronology31.weekyears();
        org.joda.time.DurationField durationField33 = islamicChronology31.halfdays();
        org.joda.time.DateTimeField dateTimeField34 = islamicChronology31.yearOfEra();
        org.joda.time.DateTimeField dateTimeField35 = islamicChronology31.halfdayOfDay();
        org.joda.time.DurationField durationField36 = islamicChronology31.halfdays();
        org.joda.time.DateTimeZone dateTimeZone37 = islamicChronology31.getZone();
        java.lang.String str38 = islamicChronology31.toString();
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology41 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone40);
        org.joda.time.DurationField durationField42 = islamicChronology41.weekyears();
        org.joda.time.DurationField durationField43 = islamicChronology41.halfdays();
        org.joda.time.DateTimeField dateTimeField44 = islamicChronology41.yearOfEra();
        org.joda.time.DateTimeField dateTimeField45 = islamicChronology41.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField46 = islamicChronology41.weekyearOfCentury();
        org.joda.time.LocalDateTime localDateTime49 = new org.joda.time.LocalDateTime((long) 1);
        int int50 = localDateTime49.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime52 = localDateTime49.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone54 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology55 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone54);
        org.joda.time.DateTime dateTime56 = localDateTime49.toDateTime(dateTimeZone54);
        java.lang.String str57 = dateTimeZone54.getID();
        org.joda.time.LocalDateTime localDateTime58 = new org.joda.time.LocalDateTime((-20217598030L), dateTimeZone54);
        org.joda.time.Chronology chronology59 = islamicChronology41.withZone(dateTimeZone54);
        java.util.Locale locale61 = java.util.Locale.KOREA;
        java.util.Locale locale62 = java.util.Locale.KOREA;
        java.lang.String str63 = locale61.getDisplayLanguage(locale62);
        java.util.Locale.setDefault(locale61);
        java.lang.String str65 = dateTimeZone54.getShortName((-4320000001L), locale61);
        long long67 = dateTimeZone54.nextTransition(9185187933840384L);
        org.joda.time.Chronology chronology68 = islamicChronology31.withZone(dateTimeZone54);
        org.joda.time.DateTimeZone dateTimeZone70 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology71 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone70);
        org.joda.time.DurationField durationField72 = islamicChronology71.weekyears();
        org.joda.time.DateTimeZone dateTimeZone74 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology75 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone74);
        boolean boolean77 = dateTimeZone74.equals((java.lang.Object) 10L);
        org.joda.time.Chronology chronology78 = islamicChronology71.withZone(dateTimeZone74);
        long long80 = dateTimeZone54.getMillisKeepLocal(dateTimeZone74, 19360302568999L);
        long long82 = dateTimeZone26.getMillisKeepLocal(dateTimeZone54, 18682354800000L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField32", (durationField4.compareTo(durationField32) == 0) == durationField4.equals(durationField32));
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test570");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.minuteOfDay();
        org.joda.time.DurationField durationField2 = islamicChronology0.months();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = islamicChronology0.add(readablePeriod6, (long) (short) 1, 411199);
        org.joda.time.DurationField durationField10 = islamicChronology0.years();
        org.joda.time.DurationField durationField11 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology0.clockhourOfHalfday();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField10 and durationField11", (durationField10.compareTo(durationField11) == 0) == durationField10.equals(durationField11));
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test571");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology2.hourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.millisOfSecond();
        java.lang.String str6 = islamicChronology2.toString();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology2.weekyear();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology2.hourOfDay();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology2.millisOfDay();
        org.joda.time.DurationField durationField10 = islamicChronology2.minutes();
        org.joda.time.DurationField durationField11 = islamicChronology2.millis();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology14 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone13);
        org.joda.time.DateTimeField dateTimeField15 = islamicChronology14.yearOfCentury();
        org.joda.time.DurationField durationField16 = islamicChronology14.years();
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime((long) 1);
        int int19 = localDateTime18.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime18.minusHours((int) (byte) -1);
        int int23 = localDateTime18.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime18.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        org.joda.time.LocalDateTime localDateTime27 = localDateTime18.minus(readablePeriod26);
        int int28 = localDateTime27.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField30 = localDateTime27.getField(0);
        org.joda.time.LocalDateTime.Property property31 = localDateTime27.centuryOfEra();
        int[] intArray33 = islamicChronology14.get((org.joda.time.ReadablePartial) localDateTime27, (long) 0);
        org.joda.time.DateTimeField dateTimeField34 = islamicChronology14.millisOfDay();
        org.joda.time.DurationField durationField35 = islamicChronology14.centuries();
        org.joda.time.DateTimeField dateTimeField36 = islamicChronology14.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone37 = islamicChronology14.getZone();
        org.joda.time.DateTimeZone dateTimeZone38 = islamicChronology14.getZone();
        org.joda.time.DurationField durationField39 = islamicChronology14.months();
        org.joda.time.DateTimeField dateTimeField40 = islamicChronology14.millisOfSecond();
        org.joda.time.DurationField durationField41 = islamicChronology14.days();
        int int42 = durationField11.compareTo(durationField41);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField16", (durationField3.compareTo(durationField16) == 0) == durationField3.equals(durationField16));
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test572");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        int int2 = localDateTime1.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.minusHours((int) (byte) -1);
        int int6 = localDateTime1.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.LocalDateTime localDateTime10 = localDateTime1.minus(readablePeriod9);
        org.joda.time.LocalDateTime.Property property11 = localDateTime1.millisOfSecond();
        long long12 = property11.remainder();
        java.lang.String str13 = property11.getName();
        int int14 = property11.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime16 = property11.addWrapFieldToCopy(70);
        java.lang.String str17 = property11.getAsShortText();
        int int18 = property11.get();
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime((long) 1);
        int int21 = localDateTime20.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime23 = localDateTime20.minusHours((int) (byte) -1);
        int int24 = localDateTime20.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime26 = localDateTime20.withMinuteOfHour((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime20.plusHours((int) (byte) 100);
        java.util.Date date29 = localDateTime28.toDate();
        org.joda.time.DateTime dateTime30 = localDateTime28.toDateTime();
        org.joda.time.Instant instant31 = dateTime30.toInstant();
        int int32 = property11.compareTo((org.joda.time.ReadableInstant) dateTime30);
        org.joda.time.DurationField durationField33 = property11.getRangeDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime30 and instant31", (dateTime30.compareTo(instant31) == 0) == dateTime30.equals(instant31));
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test573");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DurationField durationField4 = islamicChronology2.months();
        org.joda.time.DurationField durationField5 = islamicChronology2.centuries();
        org.joda.time.DurationField durationField6 = islamicChronology2.centuries();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology2.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology2.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((long) 1);
        int int11 = localDateTime10.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime10.withYear((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalDateTime localDateTime16 = localDateTime13.withPeriodAdded(readablePeriod14, 10);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.withDayOfYear(11);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.withYear(10);
        org.joda.time.LocalDateTime.Property property21 = localDateTime20.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime23 = localDateTime20.withWeekyear(86399);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.minusMinutes(0);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology28 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone27);
        org.joda.time.DateTimeField dateTimeField29 = islamicChronology28.yearOfCentury();
        org.joda.time.DurationField durationField30 = islamicChronology28.years();
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime((long) 1);
        int int33 = localDateTime32.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime35 = localDateTime32.minusHours((int) (byte) -1);
        int int37 = localDateTime32.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime39 = localDateTime32.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod40 = null;
        org.joda.time.LocalDateTime localDateTime41 = localDateTime32.minus(readablePeriod40);
        int int42 = localDateTime41.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField44 = localDateTime41.getField(0);
        org.joda.time.LocalDateTime.Property property45 = localDateTime41.centuryOfEra();
        int[] intArray47 = islamicChronology28.get((org.joda.time.ReadablePartial) localDateTime41, (long) 0);
        org.joda.time.DateTimeField dateTimeField48 = islamicChronology28.millisOfDay();
        org.joda.time.DurationField durationField49 = islamicChronology28.centuries();
        org.joda.time.DateTimeField dateTimeField50 = islamicChronology28.dayOfYear();
        org.joda.time.DateTimeField dateTimeField51 = islamicChronology28.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone52 = islamicChronology28.getZone();
        java.util.Locale locale54 = java.util.Locale.KOREA;
        java.util.Locale.Category category55 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale56 = java.util.Locale.GERMAN;
        java.util.Locale locale57 = java.util.Locale.JAPAN;
        java.lang.String str58 = locale57.getISO3Country();
        java.lang.String str59 = locale56.getDisplayCountry(locale57);
        java.util.Locale.setDefault(category55, locale57);
        java.lang.String str61 = locale54.getDisplayScript(locale57);
        java.lang.String str62 = locale54.getVariant();
        java.lang.String str63 = dateTimeZone52.getName(3L, locale54);
        java.lang.String str64 = dateTimeZone52.getID();
        org.joda.time.DateTime dateTime65 = localDateTime25.toDateTime(dateTimeZone52);
        org.joda.time.Chronology chronology66 = islamicChronology2.withZone(dateTimeZone52);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField30", (durationField3.compareTo(durationField30) == 0) == durationField3.equals(durationField30));
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test574");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        int int2 = localDateTime1.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.minusHours((int) (byte) -1);
        org.joda.time.DateTimeField[] dateTimeFieldArray5 = localDateTime4.getFields();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.minusDays(4);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.minus(readablePeriod8);
        int int10 = localDateTime9.size();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime9.withMillisOfDay(2);
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((long) 1);
        int int15 = localDateTime14.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime17 = localDateTime14.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology20 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone19);
        org.joda.time.DateTime dateTime21 = localDateTime14.toDateTime(dateTimeZone19);
        org.joda.time.ReadableInstant readableInstant22 = null;
        boolean boolean23 = dateTime21.isAfter(readableInstant22);
        org.joda.time.Instant instant24 = dateTime21.toInstant();
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime((long) 1);
        int int27 = localDateTime26.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime29 = localDateTime26.minusHours((int) (byte) -1);
        int int31 = localDateTime26.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime26.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        org.joda.time.LocalDateTime localDateTime35 = localDateTime26.minus(readablePeriod34);
        int int36 = localDateTime35.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField38 = localDateTime35.getField(0);
        org.joda.time.LocalDateTime.Property property39 = localDateTime35.centuryOfEra();
        org.joda.time.ReadableDuration readableDuration40 = null;
        org.joda.time.LocalDateTime localDateTime41 = localDateTime35.plus(readableDuration40);
        org.joda.time.LocalDateTime localDateTime43 = new org.joda.time.LocalDateTime((long) 1);
        int int44 = localDateTime43.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime46 = localDateTime43.minusHours((int) (byte) -1);
        int int48 = localDateTime43.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime50 = localDateTime43.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod51 = null;
        org.joda.time.LocalDateTime localDateTime52 = localDateTime43.minus(readablePeriod51);
        org.joda.time.LocalDateTime.Property property53 = localDateTime43.millisOfSecond();
        long long54 = property53.remainder();
        java.lang.String str55 = property53.getName();
        java.util.Locale locale56 = java.util.Locale.CHINA;
        java.lang.String str57 = property53.getAsText(locale56);
        org.joda.time.LocalDateTime localDateTime58 = property53.withMinimumValue();
        boolean boolean60 = property53.equals((java.lang.Object) 59);
        org.joda.time.LocalDateTime localDateTime61 = property53.getLocalDateTime();
        org.joda.time.LocalDateTime localDateTime63 = new org.joda.time.LocalDateTime((long) 1);
        int int64 = localDateTime63.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime66 = localDateTime63.withYear((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod67 = null;
        org.joda.time.LocalDateTime localDateTime69 = localDateTime66.withPeriodAdded(readablePeriod67, 10);
        org.joda.time.LocalDateTime localDateTime71 = localDateTime69.withDayOfYear(11);
        org.joda.time.Chronology chronology72 = localDateTime71.getChronology();
        org.joda.time.DateTimeFieldType dateTimeFieldType74 = localDateTime71.getFieldType((int) (byte) 0);
        int int75 = localDateTime61.indexOf(dateTimeFieldType74);
        org.joda.time.LocalDateTime localDateTime77 = localDateTime35.withField(dateTimeFieldType74, (int) (short) -1);
        boolean boolean78 = instant24.isSupported(dateTimeFieldType74);
        org.joda.time.chrono.IslamicChronology islamicChronology79 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField80 = islamicChronology79.minuteOfDay();
        org.joda.time.DurationField durationField81 = islamicChronology79.months();
        org.joda.time.DurationField durationField82 = islamicChronology79.weeks();
        org.joda.time.DateTimeField dateTimeField83 = islamicChronology79.clockhourOfDay();
        org.joda.time.ReadablePeriod readablePeriod84 = null;
        long long87 = islamicChronology79.add(readablePeriod84, 292278993L, 59);
        org.joda.time.DateTimeField dateTimeField88 = islamicChronology79.hourOfHalfday();
        org.joda.time.DateTimeFieldType dateTimeFieldType89 = dateTimeField88.getType();
        int int90 = instant24.get(dateTimeFieldType89);
        boolean boolean91 = localDateTime12.isSupported(dateTimeFieldType89);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime21 and instant24", (dateTime21.compareTo(instant24) == 0) == dateTime21.equals(instant24));
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test575");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        int int2 = localDateTime1.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.minusHours((int) (byte) -1);
        int int5 = localDateTime1.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.minusMinutes((int) '#');
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.centuryOfEra();
        java.lang.String str9 = localDateTime7.toString();
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.LocalDateTime localDateTime11 = localDateTime7.plus(readableDuration10);
        org.joda.time.Chronology chronology12 = localDateTime7.getChronology();
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((long) 1);
        int int15 = localDateTime14.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime17 = localDateTime14.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology20 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone19);
        org.joda.time.DateTime dateTime21 = localDateTime14.toDateTime(dateTimeZone19);
        org.joda.time.ReadableInstant readableInstant22 = null;
        boolean boolean23 = dateTime21.isAfter(readableInstant22);
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime((long) 1);
        int int26 = localDateTime25.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime28 = localDateTime25.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology31 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone30);
        org.joda.time.DateTime dateTime32 = localDateTime25.toDateTime(dateTimeZone30);
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime((long) 1);
        int int35 = localDateTime34.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime37 = localDateTime34.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology40 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone39);
        org.joda.time.DateTime dateTime41 = localDateTime34.toDateTime(dateTimeZone39);
        long long42 = dateTime41.getMillis();
        boolean boolean43 = dateTime32.isAfter((org.joda.time.ReadableInstant) dateTime41);
        long long44 = dateTime41.getMillis();
        boolean boolean45 = dateTime21.isAfter((org.joda.time.ReadableInstant) dateTime41);
        org.joda.time.DateTime dateTime46 = localDateTime7.toDateTime((org.joda.time.ReadableInstant) dateTime21);
        org.joda.time.DateTime dateTime47 = localDateTime7.toDateTime();
        org.joda.time.LocalDateTime localDateTime49 = new org.joda.time.LocalDateTime((long) 1);
        int int50 = localDateTime49.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime52 = localDateTime49.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone54 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology55 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone54);
        org.joda.time.DateTime dateTime56 = localDateTime49.toDateTime(dateTimeZone54);
        org.joda.time.Instant instant57 = dateTime56.toInstant();
        org.joda.time.Chronology chronology58 = instant57.getChronology();
        boolean boolean59 = dateTime47.isAfter((org.joda.time.ReadableInstant) instant57);
        org.joda.time.LocalDateTime localDateTime61 = new org.joda.time.LocalDateTime((long) 1);
        int int62 = localDateTime61.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime64 = localDateTime61.minusHours((int) (byte) -1);
        int int66 = localDateTime61.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime68 = localDateTime61.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod69 = null;
        org.joda.time.LocalDateTime localDateTime70 = localDateTime61.minus(readablePeriod69);
        int int71 = localDateTime70.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField73 = localDateTime70.getField(0);
        org.joda.time.LocalDateTime.Property property74 = localDateTime70.centuryOfEra();
        org.joda.time.LocalDateTime.Property property75 = localDateTime70.hourOfDay();
        boolean boolean76 = dateTime47.equals((java.lang.Object) localDateTime70);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime21 and instant57", (dateTime21.compareTo(instant57) == 0) == dateTime21.equals(instant57));
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test576");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = islamicChronology2.years();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) 1);
        int int7 = localDateTime6.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.minusHours((int) (byte) -1);
        int int11 = localDateTime6.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime6.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalDateTime localDateTime15 = localDateTime6.minus(readablePeriod14);
        int int16 = localDateTime15.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField18 = localDateTime15.getField(0);
        org.joda.time.LocalDateTime.Property property19 = localDateTime15.centuryOfEra();
        int[] intArray21 = islamicChronology2.get((org.joda.time.ReadablePartial) localDateTime15, (long) 0);
        org.joda.time.DateTimeField dateTimeField22 = islamicChronology2.millisOfDay();
        org.joda.time.DurationField durationField23 = islamicChronology2.centuries();
        org.joda.time.DateTimeField dateTimeField24 = islamicChronology2.dayOfYear();
        org.joda.time.DateTimeField dateTimeField25 = islamicChronology2.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField26 = islamicChronology2.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology29 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone28);
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime((long) 1);
        int int32 = localDateTime31.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime34 = localDateTime31.minusHours((int) (byte) -1);
        org.joda.time.DateTimeField[] dateTimeFieldArray35 = localDateTime34.getFields();
        boolean boolean36 = dateTimeZone28.isLocalDateTimeGap(localDateTime34);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone28);
        java.util.TimeZone timeZone38 = dateTimeZone28.toTimeZone();
        org.joda.time.Chronology chronology39 = islamicChronology2.withZone(dateTimeZone28);
        org.joda.time.DateTimeField dateTimeField40 = islamicChronology2.weekyearOfCentury();
        org.joda.time.DurationField durationField41 = islamicChronology2.weeks();
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.Chronology chronology43 = islamicChronology2.withZone(dateTimeZone42);
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology46 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone45);
        org.joda.time.DurationField durationField47 = islamicChronology46.weekyears();
        org.joda.time.DateTimeField dateTimeField48 = islamicChronology46.yearOfEra();
        org.joda.time.DateTimeField dateTimeField49 = islamicChronology46.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone50 = islamicChronology46.getZone();
        org.joda.time.DateTimeZone dateTimeZone52 = org.joda.time.DateTimeZone.forOffsetHours((-1));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone52);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone52);
        java.lang.String str56 = dateTimeZone52.getShortName((-25059600000L));
        java.util.TimeZone timeZone57 = dateTimeZone52.toTimeZone();
        long long59 = dateTimeZone50.getMillisKeepLocal(dateTimeZone52, 120000L);
        java.lang.String str60 = dateTimeZone50.getID();
        org.joda.time.Chronology chronology61 = islamicChronology2.withZone(dateTimeZone50);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField47", (durationField4.compareTo(durationField47) == 0) == durationField4.equals(durationField47));
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test577");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        int int2 = localDateTime1.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.minusHours((int) (byte) -1);
        int int6 = localDateTime1.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.LocalDateTime localDateTime10 = localDateTime1.minus(readablePeriod9);
        org.joda.time.LocalDateTime.Property property11 = localDateTime1.millisOfSecond();
        long long12 = property11.remainder();
        java.lang.String str13 = property11.getName();
        org.joda.time.DurationField durationField14 = property11.getRangeDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = property11.getFieldType();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology18 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone17);
        java.lang.String str19 = dateTimeZone17.toString();
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime((long) 1);
        int int22 = localDateTime21.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime24 = localDateTime21.withYear((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        org.joda.time.LocalDateTime localDateTime27 = localDateTime24.withPeriodAdded(readablePeriod25, 10);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime24.plusSeconds((int) ' ');
        boolean boolean30 = dateTimeZone17.isLocalDateTimeGap(localDateTime29);
        org.joda.time.LocalDateTime.Property property31 = localDateTime29.weekyear();
        boolean boolean32 = property11.equals((java.lang.Object) localDateTime29);
        org.joda.time.LocalDateTime.Property property33 = localDateTime29.dayOfYear();
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime((long) 1);
        int int36 = localDateTime35.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime38 = localDateTime35.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology41 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone40);
        org.joda.time.DateTime dateTime42 = localDateTime35.toDateTime(dateTimeZone40);
        org.joda.time.LocalDateTime localDateTime44 = new org.joda.time.LocalDateTime((long) 1);
        int int45 = localDateTime44.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime47 = localDateTime44.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology50 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone49);
        org.joda.time.DateTime dateTime51 = localDateTime44.toDateTime(dateTimeZone49);
        long long52 = dateTime51.getMillis();
        boolean boolean53 = dateTime42.isAfter((org.joda.time.ReadableInstant) dateTime51);
        long long54 = dateTime51.getMillis();
        org.joda.time.LocalDateTime localDateTime56 = new org.joda.time.LocalDateTime((long) 1);
        int int57 = localDateTime56.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime59 = localDateTime56.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone61 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology62 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone61);
        org.joda.time.DateTime dateTime63 = localDateTime56.toDateTime(dateTimeZone61);
        org.joda.time.LocalDateTime localDateTime65 = new org.joda.time.LocalDateTime((long) 1);
        int int66 = localDateTime65.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime68 = localDateTime65.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone70 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology71 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone70);
        org.joda.time.DateTime dateTime72 = localDateTime65.toDateTime(dateTimeZone70);
        long long73 = dateTime72.getMillis();
        boolean boolean74 = dateTime63.isAfter((org.joda.time.ReadableInstant) dateTime72);
        long long75 = dateTime72.getMillis();
        org.joda.time.DateTimeZone dateTimeZone77 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology78 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone77);
        org.joda.time.DurationField durationField79 = islamicChronology78.weekyears();
        org.joda.time.DateTimeZone dateTimeZone81 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology82 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone81);
        boolean boolean84 = dateTimeZone81.equals((java.lang.Object) 10L);
        org.joda.time.Chronology chronology85 = islamicChronology78.withZone(dateTimeZone81);
        org.joda.time.DateTimeField dateTimeField86 = islamicChronology78.hourOfHalfday();
        org.joda.time.DurationField durationField87 = dateTimeField86.getRangeDurationField();
        boolean boolean88 = dateTime72.equals((java.lang.Object) durationField87);
        org.joda.time.Instant instant89 = dateTime72.toInstant();
        boolean boolean90 = dateTime51.isEqual((org.joda.time.ReadableInstant) instant89);
        org.joda.time.Instant instant91 = instant89.toInstant();
        int int92 = property33.compareTo((org.joda.time.ReadableInstant) instant91);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime42 and instant91", (dateTime42.compareTo(instant91) == 0) == dateTime42.equals(instant91));
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test578");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DurationField durationField4 = islamicChronology2.months();
        org.joda.time.DurationField durationField5 = islamicChronology2.centuries();
        org.joda.time.DurationField durationField6 = islamicChronology2.centuries();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology2.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology2.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology11 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone10);
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology11.yearOfCentury();
        org.joda.time.DurationField durationField13 = islamicChronology11.years();
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((long) 1);
        int int16 = localDateTime15.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime15.minusHours((int) (byte) -1);
        int int20 = localDateTime15.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime15.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.LocalDateTime localDateTime24 = localDateTime15.minus(readablePeriod23);
        int int25 = localDateTime24.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField27 = localDateTime24.getField(0);
        org.joda.time.LocalDateTime.Property property28 = localDateTime24.centuryOfEra();
        int[] intArray30 = islamicChronology11.get((org.joda.time.ReadablePartial) localDateTime24, (long) 0);
        org.joda.time.DateTimeField dateTimeField31 = islamicChronology11.millisOfDay();
        org.joda.time.DurationField durationField32 = islamicChronology11.centuries();
        org.joda.time.DateTimeField dateTimeField33 = islamicChronology11.dayOfYear();
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime((long) 1);
        int int36 = localDateTime35.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime38 = localDateTime35.minusHours((int) (byte) -1);
        int int40 = localDateTime35.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime42 = localDateTime35.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod43 = null;
        org.joda.time.LocalDateTime localDateTime44 = localDateTime35.minus(readablePeriod43);
        org.joda.time.LocalDateTime.Property property45 = localDateTime35.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime52 = new org.joda.time.LocalDateTime(100, (int) (short) 10, (int) (short) 10, (int) (byte) 0, 0, (int) ' ');
        int int53 = localDateTime52.getMinuteOfHour();
        org.joda.time.LocalDateTime.Property property54 = localDateTime52.hourOfDay();
        org.joda.time.LocalDateTime localDateTime56 = property54.addToCopy((int) (byte) 100);
        int int57 = localDateTime35.compareTo((org.joda.time.ReadablePartial) localDateTime56);
        org.joda.time.LocalDateTime localDateTime59 = localDateTime35.withMinuteOfHour((int) '4');
        int[] intArray61 = islamicChronology11.get((org.joda.time.ReadablePartial) localDateTime35, (-3600000L));
        int[] intArray62 = localDateTime35.getValues();
        long long64 = islamicChronology2.set((org.joda.time.ReadablePartial) localDateTime35, 3059938800000L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField13", (durationField3.compareTo(durationField13) == 0) == durationField3.equals(durationField13));
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test579");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = islamicChronology2.years();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) 1);
        int int7 = localDateTime6.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.minusHours((int) (byte) -1);
        int int11 = localDateTime6.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime6.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalDateTime localDateTime15 = localDateTime6.minus(readablePeriod14);
        int int16 = localDateTime15.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField18 = localDateTime15.getField(0);
        org.joda.time.LocalDateTime.Property property19 = localDateTime15.centuryOfEra();
        int[] intArray21 = islamicChronology2.get((org.joda.time.ReadablePartial) localDateTime15, (long) 0);
        org.joda.time.DateTimeField dateTimeField22 = islamicChronology2.millisOfDay();
        org.joda.time.DurationField durationField23 = islamicChronology2.centuries();
        org.joda.time.DateTimeField dateTimeField24 = islamicChronology2.year();
        org.joda.time.DurationField durationField25 = islamicChronology2.millis();
        org.joda.time.DateTimeField dateTimeField26 = islamicChronology2.year();
        org.joda.time.DateTimeField dateTimeField27 = islamicChronology2.minuteOfHour();
        org.joda.time.DurationField durationField28 = islamicChronology2.centuries();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType29 = islamicChronology2.getLeapYearPatternType();
        org.joda.time.DurationField durationField30 = islamicChronology2.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField30, durationField4, and durationField23", !(durationField30.compareTo(durationField4) == 0) || (Math.signum(durationField30.compareTo(durationField23)) == Math.signum(durationField4.compareTo(durationField23))));
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test580");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        int int2 = localDateTime1.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.minusHours((int) (byte) -1);
        int int5 = localDateTime1.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.withMinuteOfHour((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime1.plusHours((int) (byte) 100);
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.LocalDateTime localDateTime11 = localDateTime1.minus(readableDuration10);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology14 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone13);
        boolean boolean16 = dateTimeZone13.equals((java.lang.Object) 10L);
        int int18 = dateTimeZone13.getOffsetFromLocal(6L);
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime1, dateTimeZone13);
        int int20 = localDateTime19.getDayOfMonth();
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.LocalDateTime localDateTime22 = localDateTime19.minus(readableDuration21);
        int int23 = localDateTime22.getMillisOfDay();
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime((long) 1);
        int int26 = localDateTime25.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime28 = localDateTime25.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology31 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone30);
        org.joda.time.DateTime dateTime32 = localDateTime25.toDateTime(dateTimeZone30);
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime((long) 1);
        int int35 = localDateTime34.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime37 = localDateTime34.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology40 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone39);
        org.joda.time.DateTime dateTime41 = localDateTime34.toDateTime(dateTimeZone39);
        long long42 = dateTime41.getMillis();
        boolean boolean43 = dateTime32.isAfter((org.joda.time.ReadableInstant) dateTime41);
        long long44 = dateTime41.getMillis();
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology47 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone46);
        org.joda.time.DurationField durationField48 = islamicChronology47.weekyears();
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology51 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone50);
        boolean boolean53 = dateTimeZone50.equals((java.lang.Object) 10L);
        org.joda.time.Chronology chronology54 = islamicChronology47.withZone(dateTimeZone50);
        org.joda.time.DateTimeField dateTimeField55 = islamicChronology47.hourOfHalfday();
        org.joda.time.DurationField durationField56 = dateTimeField55.getRangeDurationField();
        boolean boolean57 = dateTime41.equals((java.lang.Object) durationField56);
        org.joda.time.Instant instant58 = dateTime41.toInstant();
        long long59 = instant58.getMillis();
        org.joda.time.LocalDateTime localDateTime66 = new org.joda.time.LocalDateTime(100, (int) (short) 10, (int) (short) 10, (int) (byte) 0, 0, (int) ' ');
        int int67 = localDateTime66.getMinuteOfHour();
        org.joda.time.LocalDateTime.Property property68 = localDateTime66.hourOfDay();
        org.joda.time.LocalDateTime localDateTime70 = property68.addToCopy((int) (byte) 100);
        org.joda.time.LocalDateTime.Property property71 = localDateTime70.dayOfMonth();
        java.lang.String str72 = property71.getAsText();
        org.joda.time.DateTimeFieldType dateTimeFieldType73 = property71.getFieldType();
        boolean boolean74 = instant58.isSupported(dateTimeFieldType73);
        boolean boolean75 = localDateTime22.isSupported(dateTimeFieldType73);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime32 and instant58", (dateTime32.compareTo(instant58) == 0) == dateTime32.equals(instant58));
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test581");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology2.weekyear();
        org.joda.time.DurationField durationField4 = islamicChronology2.years();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology2.hourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology2.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology2.weekyear();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology2.yearOfEra();
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((long) 1);
        int int12 = localDateTime11.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.minusHours((int) (byte) -1);
        int int16 = localDateTime11.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime11.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.LocalDateTime localDateTime20 = localDateTime11.minus(readablePeriod19);
        int int21 = localDateTime20.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField23 = localDateTime20.getField(0);
        org.joda.time.LocalDateTime.Property property24 = localDateTime20.centuryOfEra();
        org.joda.time.LocalDateTime.Property property25 = localDateTime20.millisOfSecond();
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = property25.getFieldType();
        java.lang.String str27 = property25.getAsString();
        org.joda.time.LocalDateTime localDateTime29 = property25.addWrapFieldToCopy(999);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime29.plusWeeks(11);
        int[] intArray33 = islamicChronology2.get((org.joda.time.ReadablePartial) localDateTime31, (-86400001L));
        org.joda.time.Chronology chronology34 = islamicChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField35 = islamicChronology2.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField36 = islamicChronology2.dayOfYear();
        org.joda.time.DurationField durationField37 = islamicChronology2.eras();
        org.joda.time.Chronology chronology38 = islamicChronology2.withUTC();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField4 and durationField37", Math.signum(durationField4.compareTo(durationField37)) == -Math.signum(durationField37.compareTo(durationField4)));
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test582");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = islamicChronology2.years();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) 1);
        int int7 = localDateTime6.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.minusHours((int) (byte) -1);
        int int11 = localDateTime6.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime6.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalDateTime localDateTime15 = localDateTime6.minus(readablePeriod14);
        int int16 = localDateTime15.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField18 = localDateTime15.getField(0);
        org.joda.time.LocalDateTime.Property property19 = localDateTime15.centuryOfEra();
        int[] intArray21 = islamicChronology2.get((org.joda.time.ReadablePartial) localDateTime15, (long) 0);
        org.joda.time.DateTimeField dateTimeField22 = islamicChronology2.millisOfDay();
        org.joda.time.DurationField durationField23 = islamicChronology2.centuries();
        org.joda.time.DateTimeZone dateTimeZone24 = islamicChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField25 = islamicChronology2.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime();
        int[] intArray28 = islamicChronology2.get((org.joda.time.ReadablePartial) localDateTime26, 10L);
        org.joda.time.DateTimeField dateTimeField29 = islamicChronology2.weekyearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology32 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone31);
        org.joda.time.DurationField durationField33 = islamicChronology32.weekyears();
        org.joda.time.DateTimeField dateTimeField34 = islamicChronology32.hourOfDay();
        org.joda.time.DateTimeField dateTimeField35 = islamicChronology32.millisOfSecond();
        java.lang.String str36 = islamicChronology32.toString();
        org.joda.time.DateTimeField dateTimeField37 = islamicChronology32.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField38 = islamicChronology32.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField39 = islamicChronology32.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField40 = islamicChronology32.era();
        org.joda.time.DateTimeZone dateTimeZone41 = islamicChronology32.getZone();
        org.joda.time.Chronology chronology42 = islamicChronology2.withZone(dateTimeZone41);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField33", (durationField4.compareTo(durationField33) == 0) == durationField4.equals(durationField33));
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test583");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology2.weekyear();
        org.joda.time.DurationField durationField4 = islamicChronology2.weekyears();
        org.joda.time.DateTimeZone dateTimeZone5 = islamicChronology2.getZone();
        long long8 = dateTimeZone5.adjustOffset((-42404947200001L), true);
        int int10 = dateTimeZone5.getStandardOffset((-61253999989L));
        boolean boolean11 = dateTimeZone5.isFixed();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology15 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone14);
        org.joda.time.DurationField durationField16 = islamicChronology15.weekyears();
        org.joda.time.DateTimeField dateTimeField17 = islamicChronology15.yearOfEra();
        org.joda.time.DurationField durationField18 = islamicChronology15.hours();
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime((-3599990L), (org.joda.time.Chronology) islamicChronology15);
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime(100, (int) (short) 10, (int) (short) 10, (int) (byte) 0, 0, (int) ' ');
        int int27 = localDateTime26.getMinuteOfHour();
        org.joda.time.LocalDateTime.Property property28 = localDateTime26.hourOfDay();
        org.joda.time.LocalDateTime localDateTime30 = property28.addToCopy((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime31 = property28.roundFloorCopy();
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime((long) 1);
        int int34 = localDateTime33.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime36 = localDateTime33.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology39 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone38);
        org.joda.time.DateTime dateTime40 = localDateTime33.toDateTime(dateTimeZone38);
        long long41 = dateTime40.getMillis();
        long long42 = dateTime40.getMillis();
        org.joda.time.Instant instant43 = dateTime40.toInstant();
        org.joda.time.LocalDateTime localDateTime45 = new org.joda.time.LocalDateTime((long) 1);
        int int46 = localDateTime45.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime48 = localDateTime45.minusHours((int) (byte) -1);
        org.joda.time.DateTimeField[] dateTimeFieldArray49 = localDateTime48.getFields();
        org.joda.time.LocalDateTime localDateTime51 = localDateTime48.minusDays(4);
        org.joda.time.LocalDateTime localDateTime53 = new org.joda.time.LocalDateTime((long) 1);
        int int54 = localDateTime53.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime56 = localDateTime53.minusHours((int) (byte) -1);
        int int58 = localDateTime53.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime60 = localDateTime53.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod61 = null;
        org.joda.time.LocalDateTime localDateTime62 = localDateTime53.minus(readablePeriod61);
        int int63 = localDateTime62.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField65 = localDateTime62.getField(0);
        org.joda.time.LocalDateTime.Property property66 = localDateTime62.centuryOfEra();
        org.joda.time.LocalDateTime.Property property67 = localDateTime62.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime72 = localDateTime62.withTime((int) (byte) 1, 0, 5, (int) (byte) 100);
        boolean boolean73 = localDateTime48.isBefore((org.joda.time.ReadablePartial) localDateTime72);
        org.joda.time.LocalDateTime.Property property74 = localDateTime72.weekyear();
        int int75 = property74.getLeapAmount();
        org.joda.time.LocalDateTime localDateTime77 = property74.addWrapFieldToCopy(45);
        org.joda.time.LocalDateTime localDateTime79 = new org.joda.time.LocalDateTime((long) 1);
        int int80 = localDateTime79.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime82 = localDateTime79.withYear((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod83 = null;
        org.joda.time.LocalDateTime localDateTime85 = localDateTime82.withPeriodAdded(readablePeriod83, 10);
        org.joda.time.LocalDateTime localDateTime87 = localDateTime85.withDayOfYear(11);
        org.joda.time.LocalDateTime localDateTime89 = localDateTime87.withYear(10);
        org.joda.time.DateTime dateTime90 = localDateTime87.toDateTime();
        long long91 = dateTime90.getMillis();
        int int92 = property74.compareTo((org.joda.time.ReadableInstant) dateTime90);
        org.joda.time.DateTimeZone dateTimeZone93 = dateTime90.getZone();
        boolean boolean94 = instant43.isAfter((org.joda.time.ReadableInstant) dateTime90);
        org.joda.time.DateTime dateTime95 = localDateTime31.toDateTime((org.joda.time.ReadableInstant) instant43);
        org.joda.time.DateTime dateTime96 = localDateTime19.toDateTime((org.joda.time.ReadableInstant) instant43);
        int int97 = dateTimeZone5.getOffset((org.joda.time.ReadableInstant) instant43);
        java.util.TimeZone timeZone98 = dateTimeZone5.toTimeZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime40 and instant43", (dateTime40.compareTo(instant43) == 0) == dateTime40.equals(instant43));
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test584");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DurationField durationField4 = islamicChronology2.months();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.minuteOfHour();
        org.joda.time.DurationField durationField6 = islamicChronology2.seconds();
        org.joda.time.Chronology chronology7 = islamicChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology2.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology11 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone10);
        org.joda.time.DurationField durationField12 = islamicChronology11.weekyears();
        org.joda.time.DurationField durationField13 = islamicChronology11.months();
        org.joda.time.DateTimeField dateTimeField14 = islamicChronology11.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField15 = islamicChronology11.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone16 = islamicChronology11.getZone();
        java.util.TimeZone timeZone18 = java.util.TimeZone.getTimeZone("");
        java.util.TimeZone timeZone20 = java.util.TimeZone.getTimeZone("");
        boolean boolean21 = timeZone18.hasSameRules(timeZone20);
        int int22 = timeZone20.getRawOffset();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone20);
        long long25 = dateTimeZone16.getMillisKeepLocal(dateTimeZone23, (long) 12);
        org.joda.time.Chronology chronology26 = islamicChronology2.withZone(dateTimeZone23);
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology29 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone28);
        org.joda.time.DateTimeField dateTimeField30 = islamicChronology29.yearOfCentury();
        org.joda.time.DurationField durationField31 = islamicChronology29.years();
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime((long) 1);
        int int34 = localDateTime33.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime36 = localDateTime33.minusHours((int) (byte) -1);
        int int38 = localDateTime33.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime40 = localDateTime33.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod41 = null;
        org.joda.time.LocalDateTime localDateTime42 = localDateTime33.minus(readablePeriod41);
        int int43 = localDateTime42.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField45 = localDateTime42.getField(0);
        org.joda.time.LocalDateTime.Property property46 = localDateTime42.centuryOfEra();
        int[] intArray48 = islamicChronology29.get((org.joda.time.ReadablePartial) localDateTime42, (long) 0);
        org.joda.time.DateTimeField dateTimeField49 = islamicChronology29.millisOfDay();
        org.joda.time.DateTimeField dateTimeField50 = islamicChronology29.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField51 = islamicChronology29.era();
        org.joda.time.DateTimeField dateTimeField52 = islamicChronology29.clockhourOfDay();
        boolean boolean53 = dateTimeZone23.equals((java.lang.Object) islamicChronology29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField31", (durationField3.compareTo(durationField31) == 0) == durationField3.equals(durationField31));
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test585");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        int int2 = localDateTime1.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology7 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone6);
        org.joda.time.DateTime dateTime8 = localDateTime1.toDateTime(dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((long) 1);
        int int11 = localDateTime10.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime10.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology16 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone15);
        org.joda.time.DateTime dateTime17 = localDateTime10.toDateTime(dateTimeZone15);
        long long18 = dateTime17.getMillis();
        boolean boolean19 = dateTime8.isAfter((org.joda.time.ReadableInstant) dateTime17);
        long long20 = dateTime17.getMillis();
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime((long) 1);
        int int23 = localDateTime22.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime25 = localDateTime22.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology28 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone27);
        org.joda.time.DateTime dateTime29 = localDateTime22.toDateTime(dateTimeZone27);
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime((long) 1);
        int int32 = localDateTime31.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime34 = localDateTime31.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology37 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone36);
        org.joda.time.DateTime dateTime38 = localDateTime31.toDateTime(dateTimeZone36);
        long long39 = dateTime38.getMillis();
        boolean boolean40 = dateTime29.isAfter((org.joda.time.ReadableInstant) dateTime38);
        long long41 = dateTime38.getMillis();
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology44 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone43);
        org.joda.time.DurationField durationField45 = islamicChronology44.weekyears();
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology48 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone47);
        boolean boolean50 = dateTimeZone47.equals((java.lang.Object) 10L);
        org.joda.time.Chronology chronology51 = islamicChronology44.withZone(dateTimeZone47);
        org.joda.time.DateTimeField dateTimeField52 = islamicChronology44.hourOfHalfday();
        org.joda.time.DurationField durationField53 = dateTimeField52.getRangeDurationField();
        boolean boolean54 = dateTime38.equals((java.lang.Object) durationField53);
        org.joda.time.Instant instant55 = dateTime38.toInstant();
        boolean boolean56 = dateTime17.isEqual((org.joda.time.ReadableInstant) instant55);
        org.joda.time.Chronology chronology57 = dateTime17.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and instant55", (dateTime8.compareTo(instant55) == 0) == dateTime8.equals(instant55));
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test586");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology2.yearOfEra();
        org.joda.time.DurationField durationField5 = islamicChronology2.hours();
        org.joda.time.DurationField durationField6 = islamicChronology2.days();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology2.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology2.dayOfYear();
        org.joda.time.DurationField durationField9 = islamicChronology2.days();
        org.joda.time.DurationField durationField10 = islamicChronology2.years();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology2.era();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField10", (durationField3.compareTo(durationField10) == 0) == durationField3.equals(durationField10));
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test587");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology2.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology2.hourOfHalfday();
        org.joda.time.DurationField durationField5 = islamicChronology2.days();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology2.year();
        org.joda.time.DurationField durationField7 = islamicChronology2.weekyears();
        org.joda.time.DurationField durationField8 = islamicChronology2.centuries();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology2.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology2.hourOfDay();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology2.hourOfHalfday();
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((long) 1);
        int int14 = localDateTime13.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime13.minusHours((int) (byte) -1);
        int int18 = localDateTime13.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime13.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.LocalDateTime localDateTime22 = localDateTime13.minus(readablePeriod21);
        org.joda.time.LocalDateTime.Property property23 = localDateTime13.millisOfSecond();
        long long24 = property23.remainder();
        java.lang.String str25 = property23.getName();
        int int26 = property23.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime28 = property23.addWrapFieldToCopy(70);
        int int29 = localDateTime28.getYearOfCentury();
        int int30 = localDateTime28.getWeekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology33 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone32);
        org.joda.time.DateTimeField dateTimeField34 = islamicChronology33.yearOfCentury();
        org.joda.time.DurationField durationField35 = islamicChronology33.years();
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime((long) 1);
        int int38 = localDateTime37.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime40 = localDateTime37.minusHours((int) (byte) -1);
        int int42 = localDateTime37.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime44 = localDateTime37.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod45 = null;
        org.joda.time.LocalDateTime localDateTime46 = localDateTime37.minus(readablePeriod45);
        int int47 = localDateTime46.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField49 = localDateTime46.getField(0);
        org.joda.time.LocalDateTime.Property property50 = localDateTime46.centuryOfEra();
        int[] intArray52 = islamicChronology33.get((org.joda.time.ReadablePartial) localDateTime46, (long) 0);
        org.joda.time.DateTimeField dateTimeField53 = islamicChronology33.millisOfDay();
        org.joda.time.DurationField durationField54 = islamicChronology33.centuries();
        org.joda.time.DateTimeField dateTimeField55 = islamicChronology33.dayOfYear();
        org.joda.time.LocalDateTime localDateTime57 = new org.joda.time.LocalDateTime((long) 1);
        int int58 = localDateTime57.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime60 = localDateTime57.minusHours((int) (byte) -1);
        int int62 = localDateTime57.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime64 = localDateTime57.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod65 = null;
        org.joda.time.LocalDateTime localDateTime66 = localDateTime57.minus(readablePeriod65);
        org.joda.time.LocalDateTime.Property property67 = localDateTime57.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime74 = new org.joda.time.LocalDateTime(100, (int) (short) 10, (int) (short) 10, (int) (byte) 0, 0, (int) ' ');
        int int75 = localDateTime74.getMinuteOfHour();
        org.joda.time.LocalDateTime.Property property76 = localDateTime74.hourOfDay();
        org.joda.time.LocalDateTime localDateTime78 = property76.addToCopy((int) (byte) 100);
        int int79 = localDateTime57.compareTo((org.joda.time.ReadablePartial) localDateTime78);
        org.joda.time.LocalDateTime localDateTime81 = localDateTime57.withMinuteOfHour((int) '4');
        int[] intArray83 = islamicChronology33.get((org.joda.time.ReadablePartial) localDateTime57, (-3600000L));
        int int84 = dateTimeField11.getMaximumValue((org.joda.time.ReadablePartial) localDateTime28, intArray83);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField7 and durationField35", (durationField7.compareTo(durationField35) == 0) == durationField7.equals(durationField35));
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test588");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = islamicChronology2.years();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) 1);
        int int7 = localDateTime6.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.minusHours((int) (byte) -1);
        int int11 = localDateTime6.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime6.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalDateTime localDateTime15 = localDateTime6.minus(readablePeriod14);
        int int16 = localDateTime15.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField18 = localDateTime15.getField(0);
        org.joda.time.LocalDateTime.Property property19 = localDateTime15.centuryOfEra();
        int[] intArray21 = islamicChronology2.get((org.joda.time.ReadablePartial) localDateTime15, (long) 0);
        org.joda.time.DateTimeField dateTimeField22 = islamicChronology2.millisOfDay();
        org.joda.time.DurationField durationField23 = islamicChronology2.centuries();
        org.joda.time.DateTimeZone dateTimeZone24 = islamicChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField25 = islamicChronology2.dayOfWeek();
        org.joda.time.DurationField durationField26 = islamicChronology2.minutes();
        org.joda.time.DurationField durationField27 = islamicChronology2.years();
        org.joda.time.DurationField durationField28 = islamicChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField29 = islamicChronology2.monthOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField28", (durationField4.compareTo(durationField28) == 0) == durationField4.equals(durationField28));
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test589");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology2.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology9 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone8);
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology9.weekyear();
        org.joda.time.DurationField durationField11 = islamicChronology9.years();
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology9.secondOfDay();
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((long) 45, (org.joda.time.Chronology) islamicChronology9);
        org.joda.time.Chronology chronology14 = localDateTime13.getChronology();
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((long) 1);
        int int17 = localDateTime16.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.minusHours((int) (byte) -1);
        int int21 = localDateTime16.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime16.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        org.joda.time.LocalDateTime localDateTime25 = localDateTime16.minus(readablePeriod24);
        int int26 = localDateTime25.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField28 = localDateTime25.getField(0);
        org.joda.time.LocalDateTime.Property property29 = localDateTime25.centuryOfEra();
        org.joda.time.LocalDateTime.Property property30 = localDateTime25.millisOfSecond();
        org.joda.time.LocalDateTime.Property property31 = localDateTime25.yearOfEra();
        java.util.Locale locale32 = java.util.Locale.FRENCH;
        java.lang.String str33 = locale32.getVariant();
        java.lang.String str34 = property31.getAsShortText(locale32);
        java.lang.String str35 = dateTimeField5.getAsShortText((org.joda.time.ReadablePartial) localDateTime13, locale32);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField11", (durationField3.compareTo(durationField11) == 0) == durationField3.equals(durationField11));
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test590");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.minusMinutes(0);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.plusMillis(60);
        int int5 = localDateTime2.getYear();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.withWeekyear((int) 'x');
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.dayOfMonth();
        boolean boolean9 = property8.isLeap();
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((long) 1);
        int int12 = localDateTime11.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology17 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone16);
        org.joda.time.DateTime dateTime18 = localDateTime11.toDateTime(dateTimeZone16);
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime((long) 1);
        int int21 = localDateTime20.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime23 = localDateTime20.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology26 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone25);
        org.joda.time.DateTime dateTime27 = localDateTime20.toDateTime(dateTimeZone25);
        long long28 = dateTime27.getMillis();
        boolean boolean29 = dateTime18.isAfter((org.joda.time.ReadableInstant) dateTime27);
        long long30 = dateTime27.getMillis();
        org.joda.time.Instant instant31 = dateTime27.toInstant();
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime((long) 1);
        int int34 = localDateTime33.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime36 = localDateTime33.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology39 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone38);
        org.joda.time.DateTime dateTime40 = localDateTime33.toDateTime(dateTimeZone38);
        java.lang.String str41 = dateTimeZone38.getID();
        org.joda.time.LocalDateTime localDateTime43 = new org.joda.time.LocalDateTime((long) 1);
        int int44 = localDateTime43.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime46 = localDateTime43.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology49 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone48);
        org.joda.time.DateTime dateTime50 = localDateTime43.toDateTime(dateTimeZone48);
        long long51 = dateTime50.getMillis();
        org.joda.time.LocalDateTime localDateTime53 = new org.joda.time.LocalDateTime((long) 1);
        int int54 = localDateTime53.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime56 = localDateTime53.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone58 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology59 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone58);
        org.joda.time.DateTime dateTime60 = localDateTime53.toDateTime(dateTimeZone58);
        long long61 = dateTime60.getMillis();
        long long62 = dateTime60.getMillis();
        boolean boolean63 = dateTime50.isAfter((org.joda.time.ReadableInstant) dateTime60);
        int int64 = dateTimeZone38.getOffset((org.joda.time.ReadableInstant) dateTime60);
        org.joda.time.LocalDateTime localDateTime71 = new org.joda.time.LocalDateTime(100, (int) (short) 10, (int) (short) 10, (int) (byte) 0, 0, (int) ' ');
        org.joda.time.ReadableDuration readableDuration72 = null;
        org.joda.time.LocalDateTime localDateTime73 = localDateTime71.plus(readableDuration72);
        org.joda.time.ReadablePeriod readablePeriod74 = null;
        org.joda.time.LocalDateTime localDateTime75 = localDateTime73.plus(readablePeriod74);
        org.joda.time.LocalDateTime localDateTime77 = new org.joda.time.LocalDateTime((long) 1);
        int int78 = localDateTime77.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime80 = localDateTime77.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone82 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology83 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone82);
        org.joda.time.DateTime dateTime84 = localDateTime77.toDateTime(dateTimeZone82);
        long long85 = dateTime84.getMillis();
        org.joda.time.DateTime dateTime86 = localDateTime73.toDateTime((org.joda.time.ReadableInstant) dateTime84);
        boolean boolean87 = dateTime60.isBefore((org.joda.time.ReadableInstant) dateTime86);
        boolean boolean88 = instant31.isEqual((org.joda.time.ReadableInstant) dateTime60);
        org.joda.time.Instant instant89 = instant31.toInstant();
        int int90 = property8.getDifference((org.joda.time.ReadableInstant) instant89);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime18 and instant89", (dateTime18.compareTo(instant89) == 0) == dateTime18.equals(instant89));
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test591");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DurationField durationField4 = islamicChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.yearOfEra();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology2.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology2.monthOfYear();
        org.joda.time.DurationField durationField8 = islamicChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology2.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology2.year();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology2.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology2.clockhourOfDay();
        org.joda.time.DurationField durationField13 = islamicChronology2.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField13, durationField3, and durationField4", !(durationField13.compareTo(durationField3) == 0) || (Math.signum(durationField13.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test592");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology2.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology2.year();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((java.lang.Object) 2551440384L);
        long long8 = islamicChronology2.set((org.joda.time.ReadablePartial) localDateTime6, 1L);
        org.joda.time.DurationField durationField9 = islamicChronology2.years();
        org.joda.time.DateTimeZone dateTimeZone10 = islamicChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology2.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology2.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology15 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone14);
        org.joda.time.DurationField durationField16 = islamicChronology15.weekyears();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology19 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone18);
        boolean boolean21 = dateTimeZone18.equals((java.lang.Object) 10L);
        org.joda.time.Chronology chronology22 = islamicChronology15.withZone(dateTimeZone18);
        org.joda.time.DateTimeField dateTimeField23 = islamicChronology15.hourOfHalfday();
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime((long) 1);
        int int26 = localDateTime25.getHourOfDay();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology29 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone28);
        org.joda.time.DateTimeField dateTimeField30 = islamicChronology29.weekyear();
        org.joda.time.ReadablePartial readablePartial31 = null;
        int[] intArray38 = new int[] { (short) 100, 10, 100, (short) -1, (byte) 10 };
        int[] intArray40 = dateTimeField30.addWrapPartial(readablePartial31, 100, intArray38, (int) (short) 0);
        int int41 = dateTimeField23.getMaximumValue((org.joda.time.ReadablePartial) localDateTime25, intArray38);
        org.joda.time.LocalDateTime localDateTime43 = new org.joda.time.LocalDateTime((long) 1);
        int int44 = localDateTime43.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime46 = localDateTime43.minusHours((int) (byte) -1);
        int int47 = localDateTime43.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime49 = localDateTime43.minusMinutes((int) '#');
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology52 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone51);
        org.joda.time.DurationField durationField53 = islamicChronology52.weekyears();
        org.joda.time.DateTimeZone dateTimeZone55 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology56 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone55);
        boolean boolean58 = dateTimeZone55.equals((java.lang.Object) 10L);
        org.joda.time.Chronology chronology59 = islamicChronology52.withZone(dateTimeZone55);
        org.joda.time.DateTimeField dateTimeField60 = islamicChronology52.hourOfHalfday();
        org.joda.time.LocalDateTime localDateTime62 = new org.joda.time.LocalDateTime((long) 1);
        int int63 = localDateTime62.getHourOfDay();
        org.joda.time.DateTimeZone dateTimeZone65 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology66 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone65);
        org.joda.time.DateTimeField dateTimeField67 = islamicChronology66.weekyear();
        org.joda.time.ReadablePartial readablePartial68 = null;
        int[] intArray75 = new int[] { (short) 100, 10, 100, (short) -1, (byte) 10 };
        int[] intArray77 = dateTimeField67.addWrapPartial(readablePartial68, 100, intArray75, (int) (short) 0);
        int int78 = dateTimeField60.getMaximumValue((org.joda.time.ReadablePartial) localDateTime62, intArray75);
        int int79 = dateTimeField23.getMinimumValue((org.joda.time.ReadablePartial) localDateTime49, intArray75);
        org.joda.time.LocalDateTime.Property property80 = localDateTime49.hourOfDay();
        int int81 = dateTimeField12.getMinimumValue((org.joda.time.ReadablePartial) localDateTime49);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField9 and durationField16", (durationField9.compareTo(durationField16) == 0) == durationField9.equals(durationField16));
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test593");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone2);
        org.joda.time.DurationField durationField4 = islamicChronology3.weekyears();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology7 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone6);
        boolean boolean9 = dateTimeZone6.equals((java.lang.Object) 10L);
        org.joda.time.Chronology chronology10 = islamicChronology3.withZone(dateTimeZone6);
        java.util.Locale locale12 = java.util.Locale.KOREA;
        java.util.Locale locale13 = java.util.Locale.KOREA;
        java.lang.String str14 = locale12.getDisplayLanguage(locale13);
        java.lang.String str15 = locale13.getISO3Country();
        java.util.Set<java.lang.String> strSet16 = locale13.getUnicodeLocaleAttributes();
        java.lang.String str17 = dateTimeZone6.getName(24796800001L, locale13);
        java.lang.String str19 = dateTimeZone6.getName(0L);
        boolean boolean20 = dateTimeZone6.isFixed();
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime(0L, dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology24 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField25 = islamicChronology24.yearOfCentury();
        org.joda.time.DurationField durationField26 = islamicChronology24.years();
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime((long) 1);
        int int29 = localDateTime28.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime31 = localDateTime28.minusHours((int) (byte) -1);
        int int33 = localDateTime28.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime35 = localDateTime28.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod36 = null;
        org.joda.time.LocalDateTime localDateTime37 = localDateTime28.minus(readablePeriod36);
        int int38 = localDateTime37.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField40 = localDateTime37.getField(0);
        org.joda.time.LocalDateTime.Property property41 = localDateTime37.centuryOfEra();
        int[] intArray43 = islamicChronology24.get((org.joda.time.ReadablePartial) localDateTime37, (long) 0);
        org.joda.time.DateTimeField dateTimeField44 = islamicChronology24.millisOfDay();
        org.joda.time.DurationField durationField45 = islamicChronology24.centuries();
        org.joda.time.DateTimeField dateTimeField46 = islamicChronology24.dayOfYear();
        org.joda.time.DateTimeField dateTimeField47 = islamicChronology24.clockhourOfDay();
        org.joda.time.DurationField durationField48 = islamicChronology24.centuries();
        org.joda.time.DateTimeField dateTimeField49 = islamicChronology24.clockhourOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType50 = dateTimeField49.getType();
        int int51 = localDateTime21.get(dateTimeFieldType50);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField26", (durationField4.compareTo(durationField26) == 0) == durationField4.equals(durationField26));
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test594");
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 1);
        int int3 = localDateTime2.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.minusHours((int) (byte) -1);
        int int6 = localDateTime2.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime2.withMinuteOfHour((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime2.plusHours((int) (byte) 100);
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.LocalDateTime localDateTime12 = localDateTime2.minus(readableDuration11);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology15 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone14);
        boolean boolean17 = dateTimeZone14.equals((java.lang.Object) 10L);
        int int19 = dateTimeZone14.getOffsetFromLocal(6L);
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime2, dateTimeZone14);
        boolean boolean21 = dateTimeZone14.isFixed();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetHours((int) '4');
        long long25 = dateTimeZone23.convertUTCToLocal(24796800001L);
        long long27 = dateTimeZone14.getMillisKeepLocal(dateTimeZone23, (-60L));
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime((long) 5754817, dateTimeZone14);
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime((long) 1);
        int int31 = localDateTime30.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime33 = localDateTime30.minusHours((int) (byte) -1);
        int int35 = localDateTime30.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime37 = localDateTime30.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod38 = null;
        org.joda.time.LocalDateTime localDateTime39 = localDateTime30.minus(readablePeriod38);
        int int40 = localDateTime39.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField42 = localDateTime39.getField(0);
        org.joda.time.LocalDateTime.Property property43 = localDateTime39.centuryOfEra();
        org.joda.time.LocalDateTime.Property property44 = localDateTime39.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime49 = localDateTime39.withTime((int) (byte) 1, 0, 5, (int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime51 = localDateTime39.withWeekyear(59);
        org.joda.time.LocalDateTime localDateTime53 = new org.joda.time.LocalDateTime((long) 1);
        int int54 = localDateTime53.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime56 = localDateTime53.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone58 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology59 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone58);
        org.joda.time.DateTime dateTime60 = localDateTime53.toDateTime(dateTimeZone58);
        org.joda.time.LocalDateTime localDateTime62 = new org.joda.time.LocalDateTime((long) 1);
        int int63 = localDateTime62.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime65 = localDateTime62.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone67 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology68 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone67);
        org.joda.time.DateTime dateTime69 = localDateTime62.toDateTime(dateTimeZone67);
        long long70 = dateTime69.getMillis();
        boolean boolean71 = dateTime60.isAfter((org.joda.time.ReadableInstant) dateTime69);
        long long72 = dateTime69.getMillis();
        org.joda.time.Instant instant73 = dateTime69.toInstant();
        org.joda.time.DateTime dateTime74 = localDateTime39.toDateTime((org.joda.time.ReadableInstant) instant73);
        org.joda.time.DateTime dateTime75 = localDateTime28.toDateTime((org.joda.time.ReadableInstant) dateTime74);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime60 and instant73", (dateTime60.compareTo(instant73) == 0) == dateTime60.equals(instant73));
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test595");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = islamicChronology2.years();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) 1);
        int int7 = localDateTime6.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.minusHours((int) (byte) -1);
        int int11 = localDateTime6.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime6.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalDateTime localDateTime15 = localDateTime6.minus(readablePeriod14);
        int int16 = localDateTime15.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField18 = localDateTime15.getField(0);
        org.joda.time.LocalDateTime.Property property19 = localDateTime15.centuryOfEra();
        int[] intArray21 = islamicChronology2.get((org.joda.time.ReadablePartial) localDateTime15, (long) 0);
        org.joda.time.DateTimeField dateTimeField22 = islamicChronology2.millisOfDay();
        org.joda.time.DurationField durationField23 = islamicChronology2.centuries();
        org.joda.time.DateTimeField dateTimeField24 = islamicChronology2.dayOfYear();
        org.joda.time.DateTimeField dateTimeField25 = islamicChronology2.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField26 = islamicChronology2.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology29 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone28);
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime((long) 1);
        int int32 = localDateTime31.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime34 = localDateTime31.minusHours((int) (byte) -1);
        org.joda.time.DateTimeField[] dateTimeFieldArray35 = localDateTime34.getFields();
        boolean boolean36 = dateTimeZone28.isLocalDateTimeGap(localDateTime34);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone28);
        java.util.TimeZone timeZone38 = dateTimeZone28.toTimeZone();
        org.joda.time.Chronology chronology39 = islamicChronology2.withZone(dateTimeZone28);
        org.joda.time.DateTimeField dateTimeField40 = islamicChronology2.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField41 = islamicChronology2.hourOfHalfday();
        org.joda.time.DurationField durationField42 = islamicChronology2.months();
        org.joda.time.DateTimeField dateTimeField43 = islamicChronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField44 = islamicChronology2.secondOfDay();
        org.joda.time.DateTimeField dateTimeField45 = islamicChronology2.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology48 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone47);
        org.joda.time.DurationField durationField49 = islamicChronology48.weekyears();
        org.joda.time.DurationField durationField50 = islamicChronology48.halfdays();
        org.joda.time.DurationField durationField51 = islamicChronology48.weeks();
        org.joda.time.DateTimeField dateTimeField52 = islamicChronology48.yearOfEra();
        org.joda.time.LocalDateTime localDateTime54 = new org.joda.time.LocalDateTime((long) 1);
        int int55 = localDateTime54.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime57 = localDateTime54.minusHours((int) (byte) -1);
        org.joda.time.DateTimeField[] dateTimeFieldArray58 = localDateTime57.getFields();
        java.util.Locale locale59 = java.util.Locale.KOREA;
        java.util.Locale locale60 = java.util.Locale.KOREA;
        java.lang.String str61 = locale59.getDisplayLanguage(locale60);
        java.lang.String str62 = dateTimeField52.getAsText((org.joda.time.ReadablePartial) localDateTime57, locale59);
        org.joda.time.LocalDateTime localDateTime64 = localDateTime57.minusSeconds((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime66 = localDateTime64.withSecondOfMinute(45);
        org.joda.time.LocalDateTime localDateTime68 = localDateTime66.plusDays(354);
        org.joda.time.DateTimeZone dateTimeZone70 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology71 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone70);
        org.joda.time.DurationField durationField72 = islamicChronology71.weekyears();
        org.joda.time.DateTimeField dateTimeField73 = islamicChronology71.yearOfEra();
        org.joda.time.DurationField durationField74 = islamicChronology71.hours();
        org.joda.time.DurationField durationField75 = islamicChronology71.halfdays();
        org.joda.time.DurationField durationField76 = islamicChronology71.weeks();
        org.joda.time.DateTimeField dateTimeField77 = islamicChronology71.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField78 = islamicChronology71.minuteOfDay();
        java.util.Locale locale83 = new java.util.Locale("4", "it", "JP");
        java.lang.String str84 = dateTimeField78.getAsShortText(10807069L, locale83);
        java.lang.String str85 = dateTimeField45.getAsText((org.joda.time.ReadablePartial) localDateTime68, locale83);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField49", (durationField4.compareTo(durationField49) == 0) == durationField4.equals(durationField49));
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test596");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.minusMinutes(0);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.plusMillis(60);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((long) 1);
        int int8 = localDateTime7.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime7.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology13 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone12);
        org.joda.time.DateTime dateTime14 = localDateTime7.toDateTime(dateTimeZone12);
        org.joda.time.Instant instant15 = dateTime14.toInstant();
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime((long) 1);
        int int18 = localDateTime17.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime17.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology23 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone22);
        org.joda.time.DateTime dateTime24 = localDateTime17.toDateTime(dateTimeZone22);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology27 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone26);
        org.joda.time.DurationField durationField28 = islamicChronology27.weekyears();
        org.joda.time.DurationField durationField29 = islamicChronology27.months();
        org.joda.time.DateTimeField dateTimeField30 = islamicChronology27.halfdayOfDay();
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime((long) 1);
        int int33 = localDateTime32.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime35 = localDateTime32.minusHours((int) (byte) -1);
        int int37 = localDateTime32.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime39 = localDateTime32.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod40 = null;
        org.joda.time.LocalDateTime localDateTime41 = localDateTime32.minus(readablePeriod40);
        int int42 = localDateTime41.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField44 = localDateTime41.getField(0);
        org.joda.time.LocalDateTime.Property property45 = localDateTime41.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime47 = new org.joda.time.LocalDateTime((long) 1);
        int int48 = localDateTime47.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime50 = localDateTime47.withYear((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod51 = null;
        org.joda.time.LocalDateTime localDateTime53 = localDateTime50.withPeriodAdded(readablePeriod51, 10);
        org.joda.time.LocalDateTime localDateTime55 = localDateTime53.withDayOfYear(11);
        int[] intArray56 = localDateTime55.getValues();
        islamicChronology27.validate((org.joda.time.ReadablePartial) localDateTime41, intArray56);
        org.joda.time.LocalDateTime localDateTime59 = localDateTime41.withMillisOfDay(0);
        boolean boolean60 = dateTime24.equals((java.lang.Object) localDateTime59);
        boolean boolean61 = instant15.isEqual((org.joda.time.ReadableInstant) dateTime24);
        int int62 = property5.compareTo((org.joda.time.ReadableInstant) dateTime24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime14 and instant15", (dateTime14.compareTo(instant15) == 0) == dateTime14.equals(instant15));
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test597");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        boolean boolean3 = dateTimeZone1.isFixed();
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((long) 1);
        int int6 = localDateTime5.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology11 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone10);
        org.joda.time.DateTime dateTime12 = localDateTime5.toDateTime(dateTimeZone10);
        org.joda.time.ReadableInstant readableInstant13 = null;
        boolean boolean14 = dateTime12.isAfter(readableInstant13);
        org.joda.time.Instant instant15 = dateTime12.toInstant();
        java.lang.String str16 = dateTime12.toString();
        int int17 = dateTimeZone1.getOffset((org.joda.time.ReadableInstant) dateTime12);
        long long18 = dateTime12.getMillis();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology21 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone20);
        java.lang.String str22 = dateTimeZone20.toString();
        long long24 = dateTimeZone20.nextTransition((long) 1);
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType25 = org.joda.time.chrono.IslamicChronology.LEAP_YEAR_INDIAN;
        org.joda.time.chrono.IslamicChronology islamicChronology26 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone20, leapYearPatternType25);
        org.joda.time.DurationField durationField27 = islamicChronology26.months();
        org.joda.time.DateTimeField dateTimeField28 = islamicChronology26.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField29 = islamicChronology26.dayOfWeek();
        boolean boolean30 = dateTime12.equals((java.lang.Object) islamicChronology26);
        org.joda.time.DurationField durationField31 = islamicChronology26.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime12 and instant15", (dateTime12.compareTo(instant15) == 0) == dateTime12.equals(instant15));
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test598");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = islamicChronology2.years();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) 1);
        int int7 = localDateTime6.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.minusHours((int) (byte) -1);
        int int11 = localDateTime6.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime6.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalDateTime localDateTime15 = localDateTime6.minus(readablePeriod14);
        int int16 = localDateTime15.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField18 = localDateTime15.getField(0);
        org.joda.time.LocalDateTime.Property property19 = localDateTime15.centuryOfEra();
        int[] intArray21 = islamicChronology2.get((org.joda.time.ReadablePartial) localDateTime15, (long) 0);
        org.joda.time.DateTimeField dateTimeField22 = islamicChronology2.millisOfDay();
        org.joda.time.DurationField durationField23 = islamicChronology2.centuries();
        org.joda.time.DateTimeZone dateTimeZone24 = islamicChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField25 = islamicChronology2.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime();
        int[] intArray28 = islamicChronology2.get((org.joda.time.ReadablePartial) localDateTime26, 10L);
        org.joda.time.DateTimeField dateTimeField29 = islamicChronology2.secondOfDay();
        org.joda.time.DateTimeField dateTimeField30 = islamicChronology2.era();
        org.joda.time.DateTimeField dateTimeField31 = islamicChronology2.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField32 = islamicChronology2.centuryOfEra();
        org.joda.time.DurationField durationField33 = islamicChronology2.halfdays();
        org.joda.time.DurationField durationField34 = islamicChronology2.weekyears();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType35 = islamicChronology2.getLeapYearPatternType();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField34", (durationField4.compareTo(durationField34) == 0) == durationField4.equals(durationField34));
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test599");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        int int2 = localDateTime1.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.minusHours((int) (byte) -1);
        int int6 = localDateTime1.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.LocalDateTime localDateTime10 = localDateTime1.minus(readablePeriod9);
        org.joda.time.LocalDateTime.Property property11 = localDateTime1.millisOfSecond();
        long long12 = property11.remainder();
        java.lang.String str13 = property11.getName();
        org.joda.time.DurationField durationField14 = property11.getRangeDurationField();
        org.joda.time.DateTimeField dateTimeField15 = property11.getField();
        org.joda.time.LocalDateTime localDateTime16 = property11.getLocalDateTime();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology19 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone18);
        boolean boolean20 = dateTimeZone18.isFixed();
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime((long) 1);
        int int23 = localDateTime22.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime25 = localDateTime22.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology28 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone27);
        org.joda.time.DateTime dateTime29 = localDateTime22.toDateTime(dateTimeZone27);
        org.joda.time.ReadableInstant readableInstant30 = null;
        boolean boolean31 = dateTime29.isAfter(readableInstant30);
        org.joda.time.Instant instant32 = dateTime29.toInstant();
        java.lang.String str33 = dateTime29.toString();
        int int34 = dateTimeZone18.getOffset((org.joda.time.ReadableInstant) dateTime29);
        long long35 = property11.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime29);
        org.joda.time.LocalDateTime localDateTime36 = property11.roundHalfEvenCopy();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime29 and instant32", (dateTime29.compareTo(instant32) == 0) == dateTime29.equals(instant32));
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test600");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        int int2 = localDateTime1.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology7 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone6);
        org.joda.time.DateTime dateTime8 = localDateTime1.toDateTime(dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((long) 1);
        int int11 = localDateTime10.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime10.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology16 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone15);
        org.joda.time.DateTime dateTime17 = localDateTime10.toDateTime(dateTimeZone15);
        long long18 = dateTime17.getMillis();
        boolean boolean19 = dateTime8.isAfter((org.joda.time.ReadableInstant) dateTime17);
        long long20 = dateTime17.getMillis();
        org.joda.time.Instant instant21 = dateTime17.toInstant();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology24 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone23);
        boolean boolean26 = dateTimeZone23.equals((java.lang.Object) 10L);
        java.util.Locale locale28 = java.util.Locale.JAPAN;
        java.lang.String str29 = locale28.getISO3Country();
        java.lang.String str30 = dateTimeZone23.getShortName(1970L, locale28);
        java.util.TimeZone timeZone31 = dateTimeZone23.toTimeZone();
        long long34 = dateTimeZone23.convertLocalToUTC(2626841168L, false);
        boolean boolean35 = instant21.equals((java.lang.Object) false);
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime((long) 1);
        int int38 = localDateTime37.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime40 = localDateTime37.minusHours((int) (byte) -1);
        int int42 = localDateTime37.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime44 = localDateTime37.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod45 = null;
        org.joda.time.LocalDateTime localDateTime46 = localDateTime37.minus(readablePeriod45);
        org.joda.time.LocalDateTime.Property property47 = localDateTime37.millisOfSecond();
        long long48 = property47.remainder();
        java.lang.String str49 = property47.getName();
        java.util.Locale locale50 = java.util.Locale.CHINA;
        java.lang.String str51 = property47.getAsText(locale50);
        org.joda.time.LocalDateTime localDateTime52 = property47.withMinimumValue();
        boolean boolean54 = property47.equals((java.lang.Object) 59);
        org.joda.time.DurationField durationField55 = property47.getRangeDurationField();
        java.util.Locale locale59 = new java.util.Locale("DateTimeField[minuteOfDay]", "kor", "fra");
        int int60 = property47.getMaximumTextLength(locale59);
        java.lang.String str61 = property47.toString();
        org.joda.time.DateTimeFieldType dateTimeFieldType62 = property47.getFieldType();
        int int63 = instant21.get(dateTimeFieldType62);
        java.util.Locale locale64 = java.util.Locale.KOREA;
        java.util.Set<java.lang.String> strSet65 = locale64.getUnicodeLocaleAttributes();
        org.joda.time.DateTimeZone dateTimeZone67 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology68 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone67);
        org.joda.time.DurationField durationField69 = islamicChronology68.weekyears();
        org.joda.time.DurationField durationField70 = islamicChronology68.halfdays();
        org.joda.time.DateTimeField dateTimeField71 = islamicChronology68.yearOfEra();
        org.joda.time.DateTimeField dateTimeField72 = islamicChronology68.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField73 = islamicChronology68.monthOfYear();
        org.joda.time.DateTimeField dateTimeField74 = islamicChronology68.secondOfDay();
        boolean boolean75 = strSet65.equals((java.lang.Object) islamicChronology68);
        org.joda.time.LocalDateTime localDateTime76 = new org.joda.time.LocalDateTime((java.lang.Object) instant21, (org.joda.time.Chronology) islamicChronology68);
        org.joda.time.DurationField durationField77 = islamicChronology68.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and instant21", (dateTime8.compareTo(instant21) == 0) == dateTime8.equals(instant21));
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test601");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology2.weekyear();
        org.joda.time.DurationField durationField4 = islamicChronology2.weekyears();
        org.joda.time.DateTimeZone dateTimeZone5 = islamicChronology2.getZone();
        org.joda.time.chrono.IslamicChronology islamicChronology6 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = islamicChronology6.getZone();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone7);
        int int10 = dateTimeZone7.getOffsetFromLocal(745732313852400070L);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology14 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone13);
        org.joda.time.DateTimeField dateTimeField15 = islamicChronology14.yearOfCentury();
        org.joda.time.DurationField durationField16 = islamicChronology14.years();
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime((long) 1);
        int int19 = localDateTime18.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime18.minusHours((int) (byte) -1);
        int int23 = localDateTime18.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime18.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        org.joda.time.LocalDateTime localDateTime27 = localDateTime18.minus(readablePeriod26);
        int int28 = localDateTime27.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField30 = localDateTime27.getField(0);
        org.joda.time.LocalDateTime.Property property31 = localDateTime27.centuryOfEra();
        int[] intArray33 = islamicChronology14.get((org.joda.time.ReadablePartial) localDateTime27, (long) 0);
        org.joda.time.DateTimeField dateTimeField34 = islamicChronology14.millisOfDay();
        org.joda.time.DurationField durationField35 = islamicChronology14.centuries();
        org.joda.time.DateTimeZone dateTimeZone36 = islamicChronology14.getZone();
        org.joda.time.DateTimeField dateTimeField37 = islamicChronology14.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField38 = islamicChronology14.era();
        org.joda.time.DateTimeField dateTimeField39 = islamicChronology14.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField40 = islamicChronology14.minuteOfDay();
        java.util.Locale.Category category42 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale43 = java.util.Locale.KOREA;
        java.util.Set<java.lang.String> strSet44 = locale43.getUnicodeLocaleAttributes();
        java.util.Locale.setDefault(category42, locale43);
        java.util.Locale locale46 = java.util.Locale.getDefault(category42);
        java.lang.String str47 = locale46.getCountry();
        java.lang.String str48 = dateTimeField40.getAsShortText(292278993, locale46);
        java.lang.String str49 = dateTimeZone7.getName((long) 22, locale46);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField16", (durationField4.compareTo(durationField16) == 0) == durationField4.equals(durationField16));
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test602");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology6 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone5);
        boolean boolean8 = dateTimeZone5.equals((java.lang.Object) 10L);
        org.joda.time.Chronology chronology9 = islamicChronology2.withZone(dateTimeZone5);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        long long13 = islamicChronology2.add(readablePeriod10, (long) (byte) 0, (-1));
        org.joda.time.DateTimeField dateTimeField14 = islamicChronology2.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField15 = islamicChronology2.clockhourOfHalfday();
        org.joda.time.DurationField durationField16 = islamicChronology2.days();
        org.joda.time.DurationField durationField17 = islamicChronology2.weeks();
        org.joda.time.LocalDateTime localDateTime18 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) islamicChronology2);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology21 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone20);
        org.joda.time.DateTimeField dateTimeField22 = islamicChronology21.yearOfCentury();
        org.joda.time.DurationField durationField23 = islamicChronology21.years();
        org.joda.time.DurationField durationField24 = islamicChronology21.halfdays();
        org.joda.time.DateTimeField dateTimeField25 = islamicChronology21.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField26 = islamicChronology21.dayOfYear();
        org.joda.time.DateTimeField dateTimeField27 = islamicChronology21.hourOfHalfday();
        org.joda.time.DurationField durationField28 = islamicChronology21.minutes();
        org.joda.time.DateTimeField dateTimeField29 = islamicChronology21.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime((long) 1);
        int int32 = localDateTime31.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime34 = localDateTime31.minusHours((int) (byte) -1);
        int int36 = localDateTime31.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime38 = localDateTime31.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod39 = null;
        org.joda.time.LocalDateTime localDateTime40 = localDateTime31.minus(readablePeriod39);
        org.joda.time.LocalDateTime.Property property41 = localDateTime31.millisOfSecond();
        long long42 = property41.remainder();
        java.lang.String str43 = property41.getName();
        java.util.Locale locale44 = java.util.Locale.CHINA;
        java.lang.String str45 = property41.getAsText(locale44);
        org.joda.time.LocalDateTime localDateTime46 = property41.withMinimumValue();
        boolean boolean48 = property41.equals((java.lang.Object) 59);
        int int49 = property41.getMaximumValue();
        int int50 = property41.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime51 = property41.withMaximumValue();
        int[] intArray53 = islamicChronology21.get((org.joda.time.ReadablePartial) localDateTime51, (long) 292271022);
        org.joda.time.LocalDateTime localDateTime54 = new org.joda.time.LocalDateTime((org.joda.time.Chronology) islamicChronology21);
        org.joda.time.DateTimeZone dateTimeZone57 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology58 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone57);
        org.joda.time.LocalDateTime localDateTime60 = new org.joda.time.LocalDateTime((long) 1);
        int int61 = localDateTime60.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime63 = localDateTime60.minusHours((int) (byte) -1);
        org.joda.time.DateTimeField[] dateTimeFieldArray64 = localDateTime63.getFields();
        boolean boolean65 = dateTimeZone57.isLocalDateTimeGap(localDateTime63);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone57);
        java.util.TimeZone timeZone67 = dateTimeZone57.toTimeZone();
        long long69 = dateTimeZone57.previousTransition((long) 24);
        org.joda.time.LocalDateTime localDateTime70 = new org.joda.time.LocalDateTime(11L, dateTimeZone57);
        org.joda.time.LocalDateTime localDateTime71 = org.joda.time.LocalDateTime.now(dateTimeZone57);
        int int72 = localDateTime71.getDayOfWeek();
        boolean boolean73 = localDateTime54.isBefore((org.joda.time.ReadablePartial) localDateTime71);
        int[] intArray75 = islamicChronology2.get((org.joda.time.ReadablePartial) localDateTime54, 1645447773124L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField23", (durationField3.compareTo(durationField23) == 0) == durationField3.equals(durationField23));
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test603");
        java.lang.String[] strArray14 = new java.lang.String[] { "1970-01-01T00:25:00.001", "+01:00", "", "JPN", "jpn", "19", "1970", "10", "", "FR", "10", "0", "millis", "DurationField[seconds]" };
        java.util.LinkedHashSet<java.lang.String> strSet15 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet15, strArray14);
        boolean boolean17 = strSet15.isEmpty();
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime((long) 1);
        int int20 = localDateTime19.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime22 = localDateTime19.minusHours((int) (byte) -1);
        int int24 = localDateTime19.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime19.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        org.joda.time.LocalDateTime localDateTime28 = localDateTime19.minus(readablePeriod27);
        org.joda.time.LocalDateTime.Property property29 = localDateTime19.millisOfSecond();
        long long30 = property29.remainder();
        java.lang.String str31 = property29.getName();
        org.joda.time.DurationField durationField32 = property29.getRangeDurationField();
        org.joda.time.LocalDateTime localDateTime34 = property29.addToCopy(11);
        java.lang.String str35 = property29.getAsText();
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime((long) 1);
        int int38 = localDateTime37.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime40 = localDateTime37.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology43 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone42);
        org.joda.time.DateTime dateTime44 = localDateTime37.toDateTime(dateTimeZone42);
        org.joda.time.LocalDateTime localDateTime46 = new org.joda.time.LocalDateTime((long) 1);
        int int47 = localDateTime46.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime49 = localDateTime46.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology52 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone51);
        org.joda.time.DateTime dateTime53 = localDateTime46.toDateTime(dateTimeZone51);
        long long54 = dateTime53.getMillis();
        boolean boolean55 = dateTime44.isAfter((org.joda.time.ReadableInstant) dateTime53);
        long long56 = dateTime53.getMillis();
        org.joda.time.DateTimeZone dateTimeZone58 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology59 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone58);
        org.joda.time.DurationField durationField60 = islamicChronology59.weekyears();
        org.joda.time.DateTimeZone dateTimeZone62 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology63 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone62);
        boolean boolean65 = dateTimeZone62.equals((java.lang.Object) 10L);
        org.joda.time.Chronology chronology66 = islamicChronology59.withZone(dateTimeZone62);
        org.joda.time.DateTimeField dateTimeField67 = islamicChronology59.hourOfHalfday();
        org.joda.time.DurationField durationField68 = dateTimeField67.getRangeDurationField();
        boolean boolean69 = dateTime53.equals((java.lang.Object) durationField68);
        org.joda.time.Instant instant70 = dateTime53.toInstant();
        org.joda.time.Chronology chronology71 = instant70.getChronology();
        long long72 = property29.getDifferenceAsLong((org.joda.time.ReadableInstant) instant70);
        org.joda.time.LocalDateTime localDateTime74 = new org.joda.time.LocalDateTime((long) 1);
        int int75 = localDateTime74.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime77 = localDateTime74.minusHours((int) (byte) -1);
        int int79 = localDateTime74.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime81 = localDateTime74.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod82 = null;
        org.joda.time.LocalDateTime localDateTime83 = localDateTime74.minus(readablePeriod82);
        int int84 = localDateTime83.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField86 = localDateTime83.getField(0);
        org.joda.time.LocalDateTime.Property property87 = localDateTime83.centuryOfEra();
        org.joda.time.LocalDateTime.Property property88 = localDateTime83.millisOfSecond();
        org.joda.time.DateTimeFieldType dateTimeFieldType89 = property88.getFieldType();
        boolean boolean90 = instant70.isSupported(dateTimeFieldType89);
        boolean boolean91 = strSet15.equals((java.lang.Object) instant70);
        org.joda.time.DateTimeZone dateTimeZone92 = instant70.getZone();
        java.lang.String str94 = dateTimeZone92.getNameKey(19360303556920L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime44 and instant70", (dateTime44.compareTo(instant70) == 0) == dateTime44.equals(instant70));
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test604");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = islamicChronology2.years();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) 1);
        int int7 = localDateTime6.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.minusHours((int) (byte) -1);
        int int11 = localDateTime6.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime6.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalDateTime localDateTime15 = localDateTime6.minus(readablePeriod14);
        int int16 = localDateTime15.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField18 = localDateTime15.getField(0);
        org.joda.time.LocalDateTime.Property property19 = localDateTime15.centuryOfEra();
        int[] intArray21 = islamicChronology2.get((org.joda.time.ReadablePartial) localDateTime15, (long) 0);
        org.joda.time.DateTimeField dateTimeField22 = islamicChronology2.millisOfDay();
        org.joda.time.DurationField durationField23 = islamicChronology2.centuries();
        org.joda.time.DateTimeZone dateTimeZone24 = islamicChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField25 = islamicChronology2.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime();
        int[] intArray28 = islamicChronology2.get((org.joda.time.ReadablePartial) localDateTime26, 10L);
        org.joda.time.DateTimeField dateTimeField29 = islamicChronology2.secondOfDay();
        org.joda.time.DateTimeField dateTimeField30 = islamicChronology2.era();
        org.joda.time.DurationField durationField31 = islamicChronology2.seconds();
        org.joda.time.DateTimeField dateTimeField32 = islamicChronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField33 = islamicChronology2.secondOfMinute();
        org.joda.time.DurationField durationField34 = islamicChronology2.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField34, durationField4, and durationField23", !(durationField34.compareTo(durationField4) == 0) || (Math.signum(durationField34.compareTo(durationField23)) == Math.signum(durationField4.compareTo(durationField23))));
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test605");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = islamicChronology2.years();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) 1);
        int int7 = localDateTime6.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.minusHours((int) (byte) -1);
        int int11 = localDateTime6.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime6.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalDateTime localDateTime15 = localDateTime6.minus(readablePeriod14);
        int int16 = localDateTime15.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField18 = localDateTime15.getField(0);
        org.joda.time.LocalDateTime.Property property19 = localDateTime15.centuryOfEra();
        int[] intArray21 = islamicChronology2.get((org.joda.time.ReadablePartial) localDateTime15, (long) 0);
        org.joda.time.DateTimeField dateTimeField22 = islamicChronology2.millisOfDay();
        org.joda.time.DurationField durationField23 = islamicChronology2.centuries();
        org.joda.time.DateTimeField dateTimeField24 = islamicChronology2.dayOfYear();
        org.joda.time.DateTimeField dateTimeField25 = islamicChronology2.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology29 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone28);
        org.joda.time.DurationField durationField30 = islamicChronology29.weekyears();
        org.joda.time.DurationField durationField31 = islamicChronology29.millis();
        org.joda.time.DurationField durationField32 = islamicChronology29.hours();
        org.joda.time.DurationField durationField33 = islamicChronology29.centuries();
        org.joda.time.DateTimeField dateTimeField34 = islamicChronology29.hourOfDay();
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime(17763837540001L, (org.joda.time.Chronology) islamicChronology29);
        java.util.Locale locale37 = null;
        java.lang.String str38 = dateTimeField25.getAsShortText((org.joda.time.ReadablePartial) localDateTime35, 3632, locale37);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField30", (durationField4.compareTo(durationField30) == 0) == durationField4.equals(durationField30));
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test606");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        int int2 = localDateTime1.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYear((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.minus(readablePeriod5);
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.plus(readableDuration7);
        int int9 = localDateTime6.size();
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((long) 1);
        int int12 = localDateTime11.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology17 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone16);
        org.joda.time.DateTime dateTime18 = localDateTime11.toDateTime(dateTimeZone16);
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime((long) 1);
        int int21 = localDateTime20.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime23 = localDateTime20.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology26 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone25);
        org.joda.time.DateTime dateTime27 = localDateTime20.toDateTime(dateTimeZone25);
        long long28 = dateTime27.getMillis();
        boolean boolean29 = dateTime18.isAfter((org.joda.time.ReadableInstant) dateTime27);
        long long30 = dateTime27.getMillis();
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology33 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone32);
        org.joda.time.DurationField durationField34 = islamicChronology33.weekyears();
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology37 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone36);
        boolean boolean39 = dateTimeZone36.equals((java.lang.Object) 10L);
        org.joda.time.Chronology chronology40 = islamicChronology33.withZone(dateTimeZone36);
        org.joda.time.DateTimeField dateTimeField41 = islamicChronology33.hourOfHalfday();
        org.joda.time.DurationField durationField42 = dateTimeField41.getRangeDurationField();
        boolean boolean43 = dateTime27.equals((java.lang.Object) durationField42);
        org.joda.time.Instant instant44 = dateTime27.toInstant();
        org.joda.time.LocalDateTime localDateTime46 = new org.joda.time.LocalDateTime((long) 1);
        int int47 = localDateTime46.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime49 = localDateTime46.minusHours((int) (byte) -1);
        int int51 = localDateTime46.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime53 = localDateTime46.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod54 = null;
        org.joda.time.LocalDateTime localDateTime55 = localDateTime46.minus(readablePeriod54);
        org.joda.time.LocalDateTime.Property property56 = localDateTime46.millisOfSecond();
        long long57 = property56.remainder();
        java.lang.String str58 = property56.getName();
        java.util.Locale locale59 = java.util.Locale.CHINA;
        java.lang.String str60 = property56.getAsText(locale59);
        org.joda.time.LocalDateTime localDateTime61 = property56.withMinimumValue();
        org.joda.time.LocalDateTime localDateTime63 = localDateTime61.plusYears(4);
        org.joda.time.ReadablePeriod readablePeriod64 = null;
        org.joda.time.LocalDateTime localDateTime65 = localDateTime63.plus(readablePeriod64);
        org.joda.time.DateTimeZone dateTimeZone67 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology68 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone67);
        org.joda.time.DurationField durationField69 = islamicChronology68.weekyears();
        org.joda.time.DurationField durationField70 = islamicChronology68.halfdays();
        org.joda.time.DurationField durationField71 = islamicChronology68.weeks();
        org.joda.time.DateTimeField dateTimeField72 = islamicChronology68.yearOfEra();
        org.joda.time.LocalDateTime localDateTime74 = new org.joda.time.LocalDateTime((long) 1);
        int int75 = localDateTime74.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime77 = localDateTime74.minusHours((int) (byte) -1);
        org.joda.time.DateTimeField[] dateTimeFieldArray78 = localDateTime77.getFields();
        java.util.Locale locale79 = java.util.Locale.KOREA;
        java.util.Locale locale80 = java.util.Locale.KOREA;
        java.lang.String str81 = locale79.getDisplayLanguage(locale80);
        java.lang.String str82 = dateTimeField72.getAsText((org.joda.time.ReadablePartial) localDateTime77, locale79);
        org.joda.time.DateTimeFieldType dateTimeFieldType83 = dateTimeField72.getType();
        org.joda.time.LocalDateTime localDateTime85 = localDateTime63.withField(dateTimeFieldType83, (int) ' ');
        boolean boolean86 = instant44.isSupported(dateTimeFieldType83);
        int int87 = localDateTime6.indexOf(dateTimeFieldType83);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime18 and instant44", (dateTime18.compareTo(instant44) == 0) == dateTime18.equals(instant44));
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test607");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DurationField durationField4 = islamicChronology2.halfdays();
        org.joda.time.DurationField durationField5 = islamicChronology2.weeks();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology2.yearOfEra();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology2.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology2.dayOfYear();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology2.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology2.hourOfHalfday();
        org.joda.time.DurationField durationField11 = islamicChronology2.years();
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology2.centuryOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField11", (durationField3.compareTo(durationField11) == 0) == durationField3.equals(durationField11));
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test608");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.minuteOfDay();
        org.joda.time.DurationField durationField2 = islamicChronology0.months();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField5 = islamicChronology0.eras();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.dayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField2 and durationField5", Math.signum(durationField2.compareTo(durationField5)) == -Math.signum(durationField5.compareTo(durationField2)));
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test609");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DurationField durationField4 = islamicChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.yearOfEra();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology2.halfdayOfDay();
        org.joda.time.DurationField durationField7 = islamicChronology2.halfdays();
        org.joda.time.DateTimeZone dateTimeZone8 = islamicChronology2.getZone();
        org.joda.time.DurationField durationField9 = islamicChronology2.millis();
        org.joda.time.DurationField durationField10 = islamicChronology2.weeks();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology2.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology14 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone13);
        org.joda.time.DateTimeField dateTimeField15 = islamicChronology14.weekyear();
        org.joda.time.DurationField durationField16 = islamicChronology14.years();
        org.joda.time.DateTimeField dateTimeField17 = islamicChronology14.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField18 = islamicChronology14.hourOfDay();
        org.joda.time.DateTimeField dateTimeField19 = islamicChronology14.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField20 = islamicChronology14.monthOfYear();
        org.joda.time.DateTimeField dateTimeField21 = islamicChronology14.hourOfHalfday();
        java.lang.String str23 = dateTimeField21.getAsText(3600000L);
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.DateTime dateTime26 = localDateTime25.toDateTime();
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime((long) 1);
        int int29 = localDateTime28.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime31 = localDateTime28.minusHours((int) (byte) -1);
        org.joda.time.DateTimeField[] dateTimeFieldArray32 = localDateTime31.getFields();
        org.joda.time.LocalDateTime localDateTime34 = localDateTime31.withYearOfCentury(10);
        boolean boolean35 = localDateTime25.isAfter((org.joda.time.ReadablePartial) localDateTime34);
        org.joda.time.LocalDateTime localDateTime37 = localDateTime34.plusSeconds(3600000);
        java.util.Locale.Builder builder38 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder40 = builder38.setVariant("");
        java.util.Locale locale41 = builder40.build();
        java.util.Locale locale43 = new java.util.Locale("");
        java.util.Locale.Builder builder44 = builder40.setLocale(locale43);
        java.util.Locale locale45 = java.util.Locale.TAIWAN;
        boolean boolean46 = locale45.hasExtensions();
        java.util.Locale locale47 = locale45.stripExtensions();
        java.lang.String str48 = locale45.getDisplayCountry();
        java.util.Locale locale49 = java.util.Locale.TAIWAN;
        boolean boolean50 = locale49.hasExtensions();
        java.lang.String str51 = locale45.getDisplayCountry(locale49);
        java.util.Locale.Builder builder52 = builder40.setLocale(locale49);
        java.util.Locale.setDefault(locale49);
        java.lang.String str55 = locale49.getExtension('x');
        java.lang.String str56 = dateTimeField21.getAsText((org.joda.time.ReadablePartial) localDateTime34, locale49);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter57 = null;
        java.lang.String str58 = localDateTime34.toString(dateTimeFormatter57);
        int int59 = dateTimeField11.getMaximumValue((org.joda.time.ReadablePartial) localDateTime34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField16", (durationField3.compareTo(durationField16) == 0) == durationField3.equals(durationField16));
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test610");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = islamicChronology2.years();
        org.joda.time.DurationField durationField5 = islamicChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology2.hourOfHalfday();
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) 1);
        int int9 = localDateTime8.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.minusHours((int) (byte) -1);
        int int12 = localDateTime8.getSecondOfMinute();
        int[] intArray19 = new int[] { 292278993, ' ', (short) 1, (short) -1, (byte) -1 };
        int[] intArray21 = dateTimeField6.set((org.joda.time.ReadablePartial) localDateTime8, (int) (byte) 0, intArray19, 10);
        org.joda.time.LocalDateTime.Property property22 = localDateTime8.millisOfDay();
        org.joda.time.DateTime dateTime23 = localDateTime8.toDateTime();
        java.util.Locale locale24 = java.util.Locale.KOREA;
        java.util.Set<java.lang.String> strSet25 = locale24.getUnicodeLocaleAttributes();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology28 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone27);
        org.joda.time.DurationField durationField29 = islamicChronology28.weekyears();
        org.joda.time.DurationField durationField30 = islamicChronology28.halfdays();
        org.joda.time.DateTimeField dateTimeField31 = islamicChronology28.yearOfEra();
        org.joda.time.DateTimeField dateTimeField32 = islamicChronology28.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField33 = islamicChronology28.monthOfYear();
        org.joda.time.DateTimeField dateTimeField34 = islamicChronology28.secondOfDay();
        boolean boolean35 = strSet25.equals((java.lang.Object) islamicChronology28);
        org.joda.time.DateTimeField dateTimeField36 = islamicChronology28.secondOfDay();
        java.lang.String str37 = islamicChronology28.toString();
        org.joda.time.LocalDateTime localDateTime39 = new org.joda.time.LocalDateTime((long) 1);
        int int40 = localDateTime39.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime42 = localDateTime39.minusHours((int) (byte) -1);
        int int44 = localDateTime39.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime46 = localDateTime39.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod47 = null;
        org.joda.time.LocalDateTime localDateTime48 = localDateTime39.minus(readablePeriod47);
        org.joda.time.LocalDateTime.Property property49 = localDateTime39.millisOfSecond();
        long long50 = property49.remainder();
        java.lang.String str51 = property49.getName();
        java.util.Locale locale52 = java.util.Locale.CHINA;
        java.lang.String str53 = property49.getAsText(locale52);
        org.joda.time.LocalDateTime localDateTime54 = property49.withMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone56 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology57 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone56);
        boolean boolean59 = dateTimeZone56.equals((java.lang.Object) 10L);
        java.util.Locale locale61 = java.util.Locale.JAPAN;
        java.lang.String str62 = locale61.getISO3Country();
        java.lang.String str63 = dateTimeZone56.getShortName(1970L, locale61);
        org.joda.time.DateTime dateTime64 = localDateTime54.toDateTime(dateTimeZone56);
        org.joda.time.Chronology chronology65 = islamicChronology28.withZone(dateTimeZone56);
        org.joda.time.LocalDateTime localDateTime66 = new org.joda.time.LocalDateTime(chronology65);
        org.joda.time.LocalDateTime.Property property67 = localDateTime66.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime69 = property67.addToCopy((-1620785));
        org.joda.time.LocalDateTime localDateTime71 = property67.setCopy(12);
        int int72 = localDateTime8.compareTo((org.joda.time.ReadablePartial) localDateTime71);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField29", (durationField4.compareTo(durationField29) == 0) == durationField4.equals(durationField29));
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test611");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = islamicChronology2.years();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) 1);
        int int7 = localDateTime6.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.minusHours((int) (byte) -1);
        int int11 = localDateTime6.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime6.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalDateTime localDateTime15 = localDateTime6.minus(readablePeriod14);
        int int16 = localDateTime15.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField18 = localDateTime15.getField(0);
        org.joda.time.LocalDateTime.Property property19 = localDateTime15.centuryOfEra();
        int[] intArray21 = islamicChronology2.get((org.joda.time.ReadablePartial) localDateTime15, (long) 0);
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime((long) 1);
        int int24 = localDateTime23.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime26 = localDateTime23.withYear((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        org.joda.time.LocalDateTime localDateTime29 = localDateTime26.withPeriodAdded(readablePeriod27, 10);
        boolean boolean30 = localDateTime15.equals((java.lang.Object) 10);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime15.plusHours(1978);
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology35 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone34);
        org.joda.time.DurationField durationField36 = islamicChronology35.weekyears();
        org.joda.time.DurationField durationField37 = islamicChronology35.halfdays();
        org.joda.time.DurationField durationField38 = islamicChronology35.weeks();
        org.joda.time.DateTimeField dateTimeField39 = islamicChronology35.yearOfEra();
        org.joda.time.LocalDateTime localDateTime41 = new org.joda.time.LocalDateTime((long) 1);
        int int42 = localDateTime41.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime44 = localDateTime41.minusHours((int) (byte) -1);
        org.joda.time.DateTimeField[] dateTimeFieldArray45 = localDateTime44.getFields();
        java.util.Locale locale46 = java.util.Locale.KOREA;
        java.util.Locale locale47 = java.util.Locale.KOREA;
        java.lang.String str48 = locale46.getDisplayLanguage(locale47);
        java.lang.String str49 = dateTimeField39.getAsText((org.joda.time.ReadablePartial) localDateTime44, locale46);
        org.joda.time.LocalDateTime localDateTime51 = localDateTime44.minusSeconds((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime53 = localDateTime51.withSecondOfMinute(45);
        org.joda.time.LocalDateTime localDateTime55 = localDateTime53.plusMinutes(31);
        org.joda.time.LocalDateTime.Property property56 = localDateTime53.hourOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType57 = property56.getFieldType();
        boolean boolean58 = localDateTime15.isSupported(dateTimeFieldType57);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField36", (durationField4.compareTo(durationField36) == 0) == durationField4.equals(durationField36));
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test612");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleAttributes();
        java.util.Locale locale2 = java.util.Locale.KOREA;
        java.util.Set<java.lang.String> strSet3 = locale2.getUnicodeLocaleAttributes();
        boolean boolean4 = strSet1.removeAll((java.util.Collection<java.lang.String>) strSet3);
        java.util.Set<java.lang.String> strSet5 = org.joda.time.DateTimeZone.getAvailableIDs();
        java.util.Locale locale6 = java.util.Locale.KOREA;
        java.util.Set<java.lang.String> strSet7 = locale6.getUnicodeLocaleAttributes();
        java.util.Locale locale8 = java.util.Locale.KOREA;
        java.util.Set<java.lang.String> strSet9 = locale8.getUnicodeLocaleAttributes();
        boolean boolean10 = strSet7.removeAll((java.util.Collection<java.lang.String>) strSet9);
        boolean boolean11 = strSet5.addAll((java.util.Collection<java.lang.String>) strSet7);
        boolean boolean12 = strSet1.addAll((java.util.Collection<java.lang.String>) strSet7);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology15 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone14);
        org.joda.time.DurationField durationField16 = islamicChronology15.weekyears();
        org.joda.time.DurationField durationField17 = islamicChronology15.halfdays();
        org.joda.time.DateTimeField dateTimeField18 = islamicChronology15.yearOfEra();
        org.joda.time.DateTimeField dateTimeField19 = islamicChronology15.minuteOfHour();
        boolean boolean20 = strSet7.contains((java.lang.Object) dateTimeField19);
        java.util.Locale locale22 = new java.util.Locale("CA");
        boolean boolean23 = strSet7.contains((java.lang.Object) locale22);
        org.joda.time.tz.NameProvider nameProvider24 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale25 = java.util.Locale.getDefault();
        java.lang.String str28 = nameProvider24.getName(locale25, "JPN", "0");
        java.lang.String str29 = locale25.getDisplayName();
        java.util.Set<java.lang.String> strSet30 = locale25.getUnicodeLocaleAttributes();
        boolean boolean31 = strSet7.retainAll((java.util.Collection<java.lang.String>) strSet30);
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology34 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone33);
        org.joda.time.DateTimeField dateTimeField35 = islamicChronology34.yearOfCentury();
        org.joda.time.DurationField durationField36 = islamicChronology34.years();
        org.joda.time.LocalDateTime localDateTime38 = new org.joda.time.LocalDateTime((long) 1);
        int int39 = localDateTime38.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime41 = localDateTime38.minusHours((int) (byte) -1);
        int int43 = localDateTime38.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime45 = localDateTime38.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod46 = null;
        org.joda.time.LocalDateTime localDateTime47 = localDateTime38.minus(readablePeriod46);
        int int48 = localDateTime47.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField50 = localDateTime47.getField(0);
        org.joda.time.LocalDateTime.Property property51 = localDateTime47.centuryOfEra();
        int[] intArray53 = islamicChronology34.get((org.joda.time.ReadablePartial) localDateTime47, (long) 0);
        org.joda.time.DateTimeField dateTimeField54 = islamicChronology34.millisOfDay();
        org.joda.time.DurationField durationField55 = islamicChronology34.centuries();
        org.joda.time.DateTimeField dateTimeField56 = islamicChronology34.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone58 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology59 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone58);
        org.joda.time.DateTimeField dateTimeField60 = islamicChronology59.yearOfCentury();
        org.joda.time.DurationField durationField61 = islamicChronology59.years();
        org.joda.time.LocalDateTime localDateTime63 = new org.joda.time.LocalDateTime((long) 1);
        int int64 = localDateTime63.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime66 = localDateTime63.minusHours((int) (byte) -1);
        int int68 = localDateTime63.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime70 = localDateTime63.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod71 = null;
        org.joda.time.LocalDateTime localDateTime72 = localDateTime63.minus(readablePeriod71);
        int int73 = localDateTime72.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField75 = localDateTime72.getField(0);
        org.joda.time.LocalDateTime.Property property76 = localDateTime72.centuryOfEra();
        int[] intArray78 = islamicChronology59.get((org.joda.time.ReadablePartial) localDateTime72, (long) 0);
        org.joda.time.DateTimeField dateTimeField79 = islamicChronology59.millisOfDay();
        org.joda.time.DurationField durationField80 = islamicChronology59.centuries();
        org.joda.time.DateTimeZone dateTimeZone81 = islamicChronology59.getZone();
        org.joda.time.Chronology chronology82 = islamicChronology34.withZone(dateTimeZone81);
        org.joda.time.DateTimeField dateTimeField83 = islamicChronology34.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField84 = islamicChronology34.millisOfSecond();
        int int86 = dateTimeField84.getMinimumValue((long) (-16385303));
        boolean boolean87 = strSet7.contains((java.lang.Object) int86);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField16 and durationField36", (durationField16.compareTo(durationField36) == 0) == durationField16.equals(durationField36));
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test613");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology2.yearOfEra();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology2.year();
        org.joda.time.DurationField durationField7 = islamicChronology2.seconds();
        org.joda.time.DurationField durationField8 = islamicChronology2.years();
        org.joda.time.DurationField durationField9 = islamicChronology2.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField8", (durationField3.compareTo(durationField8) == 0) == durationField3.equals(durationField8));
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test614");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DurationField durationField4 = islamicChronology2.halfdays();
        org.joda.time.DurationField durationField5 = islamicChronology2.weeks();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology2.yearOfEra();
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) 1);
        int int9 = localDateTime8.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.minusHours((int) (byte) -1);
        org.joda.time.DateTimeField[] dateTimeFieldArray12 = localDateTime11.getFields();
        java.util.Locale locale13 = java.util.Locale.KOREA;
        java.util.Locale locale14 = java.util.Locale.KOREA;
        java.lang.String str15 = locale13.getDisplayLanguage(locale14);
        java.lang.String str16 = dateTimeField6.getAsText((org.joda.time.ReadablePartial) localDateTime11, locale13);
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime((long) 1);
        int int19 = localDateTime18.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime18.minusHours((int) (byte) -1);
        int int23 = localDateTime18.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime18.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        org.joda.time.LocalDateTime localDateTime27 = localDateTime18.minus(readablePeriod26);
        int int28 = localDateTime27.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField30 = localDateTime27.getField(0);
        org.joda.time.LocalDateTime.Property property31 = localDateTime27.centuryOfEra();
        org.joda.time.ReadableDuration readableDuration32 = null;
        org.joda.time.LocalDateTime localDateTime33 = localDateTime27.plus(readableDuration32);
        org.joda.time.LocalDateTime localDateTime35 = localDateTime27.minusMonths(59);
        org.joda.time.LocalDateTime localDateTime37 = localDateTime35.minusMillis((int) (short) 0);
        org.joda.time.tz.NameProvider nameProvider38 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale39 = java.util.Locale.ROOT;
        java.lang.String str42 = nameProvider38.getShortName(locale39, "jpn", "jpn");
        java.lang.String str43 = dateTimeField6.getAsText((org.joda.time.ReadablePartial) localDateTime35, locale39);
        org.joda.time.LocalDateTime localDateTime45 = localDateTime35.minusYears(69);
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology48 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone47);
        org.joda.time.DateTimeField dateTimeField49 = islamicChronology48.weekyear();
        org.joda.time.DurationField durationField50 = islamicChronology48.years();
        org.joda.time.DateTimeField dateTimeField51 = islamicChronology48.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField52 = islamicChronology48.hourOfDay();
        org.joda.time.DateTimeField dateTimeField53 = islamicChronology48.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField54 = islamicChronology48.weekyear();
        org.joda.time.DateTimeField dateTimeField55 = islamicChronology48.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType56 = dateTimeField55.getType();
        int int57 = localDateTime45.indexOf(dateTimeFieldType56);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField50", (durationField3.compareTo(durationField50) == 0) == durationField3.equals(durationField50));
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test615");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DurationField durationField4 = islamicChronology2.months();
        org.joda.time.DurationField durationField5 = islamicChronology2.centuries();
        org.joda.time.DurationField durationField6 = islamicChronology2.centuries();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology2.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology2.minuteOfHour();
        org.joda.time.DurationField durationField9 = islamicChronology2.weeks();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology2.halfdayOfDay();
        org.joda.time.DurationField durationField11 = islamicChronology2.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField11, durationField3, and durationField4", !(durationField11.compareTo(durationField3) == 0) || (Math.signum(durationField11.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test616");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = islamicChronology2.years();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) 1);
        int int7 = localDateTime6.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.minusHours((int) (byte) -1);
        int int11 = localDateTime6.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime6.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalDateTime localDateTime15 = localDateTime6.minus(readablePeriod14);
        int int16 = localDateTime15.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField18 = localDateTime15.getField(0);
        org.joda.time.LocalDateTime.Property property19 = localDateTime15.centuryOfEra();
        int[] intArray21 = islamicChronology2.get((org.joda.time.ReadablePartial) localDateTime15, (long) 0);
        org.joda.time.DateTimeField dateTimeField22 = islamicChronology2.millisOfDay();
        org.joda.time.DurationField durationField23 = islamicChronology2.centuries();
        org.joda.time.DateTimeField dateTimeField24 = islamicChronology2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone25 = islamicChronology2.getZone();
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        long long29 = islamicChronology2.add(readablePeriod26, (long) 3, 10);
        org.joda.time.DateTimeField dateTimeField30 = islamicChronology2.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField31 = islamicChronology2.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField32 = islamicChronology2.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology35 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone34);
        org.joda.time.DurationField durationField36 = islamicChronology35.weekyears();
        org.joda.time.DurationField durationField37 = islamicChronology35.months();
        org.joda.time.DateTimeField dateTimeField38 = islamicChronology35.minuteOfHour();
        org.joda.time.DurationField durationField39 = islamicChronology35.hours();
        org.joda.time.DateTimeField dateTimeField40 = islamicChronology35.yearOfCentury();
        org.joda.time.DurationField durationField41 = islamicChronology35.months();
        org.joda.time.DateTimeField dateTimeField42 = islamicChronology35.yearOfEra();
        org.joda.time.Chronology chronology43 = islamicChronology35.withUTC();
        org.joda.time.DateTimeField dateTimeField44 = islamicChronology35.yearOfEra();
        org.joda.time.LocalDateTime localDateTime45 = new org.joda.time.LocalDateTime((org.joda.time.Chronology) islamicChronology35);
        org.joda.time.LocalDateTime localDateTime47 = new org.joda.time.LocalDateTime((long) 1);
        int int48 = localDateTime47.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime50 = localDateTime47.minusHours((int) (byte) -1);
        int int52 = localDateTime47.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime54 = localDateTime47.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod55 = null;
        org.joda.time.LocalDateTime localDateTime56 = localDateTime47.minus(readablePeriod55);
        org.joda.time.LocalDateTime.Property property57 = localDateTime47.millisOfSecond();
        long long58 = property57.remainder();
        java.lang.String str59 = property57.getAsString();
        org.joda.time.DateTimeZone dateTimeZone61 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology62 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone61);
        org.joda.time.DurationField durationField63 = islamicChronology62.weekyears();
        org.joda.time.DateTimeField dateTimeField64 = islamicChronology62.yearOfEra();
        org.joda.time.DurationField durationField65 = islamicChronology62.hours();
        org.joda.time.DateTimeZone dateTimeZone66 = islamicChronology62.getZone();
        org.joda.time.DateTimeField dateTimeField67 = islamicChronology62.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField68 = islamicChronology62.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField69 = islamicChronology62.clockhourOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType70 = dateTimeField69.getType();
        java.util.Locale.Builder builder72 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder74 = builder72.setVariant("");
        java.util.Locale locale75 = java.util.Locale.PRC;
        java.util.Locale locale76 = locale75.stripExtensions();
        java.lang.String str77 = locale75.getScript();
        java.util.Locale.Builder builder78 = builder72.setLocale(locale75);
        java.util.Locale.Builder builder81 = builder78.setExtension('x', "1969");
        java.util.Locale locale82 = builder78.build();
        java.util.Locale locale83 = java.util.Locale.KOREA;
        java.util.Locale locale84 = java.util.Locale.KOREA;
        java.lang.String str85 = locale83.getDisplayLanguage(locale84);
        java.lang.String str86 = locale84.getISO3Country();
        java.util.Locale.Builder builder87 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder90 = builder87.setExtension('a', "FR");
        java.util.Locale.Builder builder92 = builder90.addUnicodeLocaleAttribute("KOR");
        java.util.Locale locale93 = java.util.Locale.TAIWAN;
        java.util.Locale.Builder builder94 = builder92.setLocale(locale93);
        java.lang.String str95 = locale84.getDisplayVariant(locale93);
        java.util.Locale.Builder builder96 = builder78.setLocale(locale84);
        java.lang.String str97 = dateTimeField69.getAsText((-3599899L), locale84);
        int int98 = property57.getMaximumTextLength(locale84);
        java.lang.String str99 = dateTimeField32.getAsText((org.joda.time.ReadablePartial) localDateTime45, locale84);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField36", (durationField4.compareTo(durationField36) == 0) == durationField4.equals(durationField36));
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test617");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = islamicChronology2.years();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) 1);
        int int7 = localDateTime6.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.minusHours((int) (byte) -1);
        int int11 = localDateTime6.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime6.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalDateTime localDateTime15 = localDateTime6.minus(readablePeriod14);
        int int16 = localDateTime15.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField18 = localDateTime15.getField(0);
        org.joda.time.LocalDateTime.Property property19 = localDateTime15.centuryOfEra();
        int[] intArray21 = islamicChronology2.get((org.joda.time.ReadablePartial) localDateTime15, (long) 0);
        org.joda.time.DateTimeField dateTimeField22 = islamicChronology2.millisOfDay();
        org.joda.time.DurationField durationField23 = islamicChronology2.centuries();
        org.joda.time.DateTimeZone dateTimeZone24 = islamicChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField25 = islamicChronology2.dayOfWeek();
        org.joda.time.DurationField durationField26 = islamicChronology2.minutes();
        org.joda.time.DateTimeField dateTimeField27 = islamicChronology2.monthOfYear();
        org.joda.time.DurationField durationField28 = islamicChronology2.weeks();
        org.joda.time.DurationField durationField29 = islamicChronology2.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField29, durationField4, and durationField23", !(durationField29.compareTo(durationField4) == 0) || (Math.signum(durationField29.compareTo(durationField23)) == Math.signum(durationField4.compareTo(durationField23))));
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test618");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(216000000);
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.now(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology5 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone4);
        int int6 = islamicChronology5.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology5.millisOfDay();
        long long11 = islamicChronology5.add(2015L, (-3598030L), 19);
        org.joda.time.DurationField durationField12 = islamicChronology5.weeks();
        org.joda.time.DateTimeZone dateTimeZone13 = islamicChronology5.getZone();
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((long) 1);
        int int16 = localDateTime15.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime15.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology21 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone20);
        org.joda.time.DateTime dateTime22 = localDateTime15.toDateTime(dateTimeZone20);
        long long23 = dateTime22.getMillis();
        long long24 = dateTime22.getMillis();
        org.joda.time.Instant instant25 = dateTime22.toInstant();
        boolean boolean26 = dateTimeZone13.equals((java.lang.Object) instant25);
        long long28 = dateTimeZone1.getMillisKeepLocal(dateTimeZone13, 2535110838463680288L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime22 and instant25", (dateTime22.compareTo(instant25) == 0) == dateTime22.equals(instant25));
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test619");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        int int3 = islamicChronology2.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology2.weekyear();
        org.joda.time.DurationField durationField5 = islamicChronology2.hours();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology2.millisOfDay();
        org.joda.time.DurationField durationField7 = islamicChronology2.eras();
        org.joda.time.DurationField durationField8 = islamicChronology2.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField5 and durationField7", Math.signum(durationField5.compareTo(durationField7)) == -Math.signum(durationField7.compareTo(durationField5)));
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test620");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        int int2 = localDateTime1.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.minusHours((int) (byte) -1);
        int int6 = localDateTime1.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.LocalDateTime localDateTime10 = localDateTime1.minus(readablePeriod9);
        int int11 = localDateTime10.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField13 = localDateTime10.getField(0);
        org.joda.time.LocalDateTime.Property property14 = localDateTime10.centuryOfEra();
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.LocalDateTime localDateTime16 = localDateTime10.plus(readableDuration15);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime10.minusMonths(59);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.minusMillis((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime18.minusMillis((int) (short) 1);
        org.joda.time.Chronology chronology23 = localDateTime18.getChronology();
        org.joda.time.LocalDateTime.Property property24 = localDateTime18.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime26 = localDateTime18.withMinuteOfHour(59);
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology29 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone28);
        org.joda.time.DurationField durationField30 = islamicChronology29.weekyears();
        org.joda.time.DurationField durationField31 = islamicChronology29.halfdays();
        org.joda.time.DateTimeField dateTimeField32 = islamicChronology29.yearOfEra();
        org.joda.time.DateTimeField dateTimeField33 = islamicChronology29.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField34 = islamicChronology29.monthOfYear();
        org.joda.time.Chronology chronology35 = islamicChronology29.withUTC();
        org.joda.time.DurationField durationField36 = islamicChronology29.weekyears();
        org.joda.time.DateTimeField dateTimeField37 = islamicChronology29.weekyearOfCentury();
        org.joda.time.DurationField durationField38 = islamicChronology29.years();
        int int41 = durationField38.getValue((-3599999L), (-18L));
        org.joda.time.DurationFieldType durationFieldType42 = durationField38.getType();
        org.joda.time.LocalDateTime localDateTime44 = localDateTime18.withFieldAdded(durationFieldType42, 86399);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField30 and durationField38", (durationField30.compareTo(durationField38) == 0) == durationField30.equals(durationField38));
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test621");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DurationField durationField4 = islamicChronology2.weekyears();
        org.joda.time.DurationField durationField5 = islamicChronology2.halfdays();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology8 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone7);
        java.lang.String str9 = dateTimeZone7.toString();
        long long11 = dateTimeZone7.nextTransition((long) 1);
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType12 = org.joda.time.chrono.IslamicChronology.LEAP_YEAR_INDIAN;
        org.joda.time.chrono.IslamicChronology islamicChronology13 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone7, leapYearPatternType12);
        org.joda.time.DurationField durationField14 = islamicChronology13.months();
        org.joda.time.DateTimeField dateTimeField15 = islamicChronology13.minuteOfDay();
        org.joda.time.DurationField durationField16 = islamicChronology13.seconds();
        boolean boolean17 = islamicChronology2.equals((java.lang.Object) islamicChronology13);
        org.joda.time.DurationField durationField18 = islamicChronology13.halfdays();
        org.joda.time.DateTimeField dateTimeField19 = islamicChronology13.year();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField18", (durationField5.compareTo(durationField18) == 0) == durationField5.equals(durationField18));
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test622");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = islamicChronology2.years();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) 1);
        int int7 = localDateTime6.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.minusHours((int) (byte) -1);
        int int11 = localDateTime6.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime6.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalDateTime localDateTime15 = localDateTime6.minus(readablePeriod14);
        int int16 = localDateTime15.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField18 = localDateTime15.getField(0);
        org.joda.time.LocalDateTime.Property property19 = localDateTime15.centuryOfEra();
        int[] intArray21 = islamicChronology2.get((org.joda.time.ReadablePartial) localDateTime15, (long) 0);
        org.joda.time.DateTimeField dateTimeField22 = islamicChronology2.millisOfDay();
        org.joda.time.DurationField durationField23 = islamicChronology2.centuries();
        org.joda.time.DateTimeZone dateTimeZone24 = islamicChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField25 = islamicChronology2.dayOfWeek();
        org.joda.time.DurationField durationField26 = islamicChronology2.minutes();
        org.joda.time.DurationField durationField27 = islamicChronology2.weekyears();
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        long long31 = islamicChronology2.add(readablePeriod28, 0L, 69);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField27", (durationField4.compareTo(durationField27) == 0) == durationField4.equals(durationField27));
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test623");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DurationField durationField4 = islamicChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.yearOfEra();
        org.joda.time.DurationField durationField6 = islamicChronology2.months();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology2.yearOfEra();
        org.joda.time.DurationField durationField8 = islamicChronology2.weeks();
        org.joda.time.DurationField durationField9 = islamicChronology2.minutes();
        org.joda.time.DurationField durationField10 = islamicChronology2.weeks();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology2.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology2.hourOfDay();
        org.joda.time.DurationField durationField13 = islamicChronology2.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField13, durationField3, and durationField4", !(durationField13.compareTo(durationField3) == 0) || (Math.signum(durationField13.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test624");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        int int3 = islamicChronology2.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology2.weekyear();
        org.joda.time.DurationField durationField5 = islamicChronology2.hours();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((long) 1);
        int int8 = localDateTime7.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime7.minusHours((int) (byte) -1);
        org.joda.time.DateTimeField[] dateTimeFieldArray11 = localDateTime10.getFields();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime10.minusDays(4);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology16 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField17 = islamicChronology16.yearOfCentury();
        org.joda.time.DurationField durationField18 = islamicChronology16.years();
        org.joda.time.DurationField durationField19 = islamicChronology16.halfdays();
        org.joda.time.DateTimeField dateTimeField20 = islamicChronology16.hourOfHalfday();
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime((long) 1);
        int int23 = localDateTime22.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime25 = localDateTime22.minusHours((int) (byte) -1);
        int int26 = localDateTime22.getSecondOfMinute();
        int[] intArray33 = new int[] { 292278993, ' ', (short) 1, (short) -1, (byte) -1 };
        int[] intArray35 = dateTimeField20.set((org.joda.time.ReadablePartial) localDateTime22, (int) (byte) 0, intArray33, 10);
        islamicChronology2.validate((org.joda.time.ReadablePartial) localDateTime10, intArray35);
        org.joda.time.DurationField durationField37 = islamicChronology2.years();
        org.joda.time.DateTimeField dateTimeField38 = islamicChronology2.dayOfYear();
        org.joda.time.DateTimeField dateTimeField39 = islamicChronology2.era();
        org.joda.time.DateTimeField dateTimeField40 = islamicChronology2.era();
        org.joda.time.DateTimeField dateTimeField41 = islamicChronology2.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField42 = islamicChronology2.year();
        org.joda.time.DurationField durationField43 = islamicChronology2.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField43, durationField5, and durationField18", !(durationField43.compareTo(durationField5) == 0) || (Math.signum(durationField43.compareTo(durationField18)) == Math.signum(durationField5.compareTo(durationField18))));
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test625");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = islamicChronology2.years();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.monthOfYear();
        org.joda.time.DurationField durationField6 = islamicChronology2.months();
        org.joda.time.DurationField durationField7 = islamicChronology2.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField7, durationField4, and durationField6", !(durationField7.compareTo(durationField4) == 0) || (Math.signum(durationField7.compareTo(durationField6)) == Math.signum(durationField4.compareTo(durationField6))));
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test626");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DurationField durationField4 = islamicChronology2.months();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.minuteOfHour();
        org.joda.time.DurationField durationField6 = islamicChronology2.hours();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology2.yearOfCentury();
        org.joda.time.DurationField durationField8 = islamicChronology2.months();
        org.joda.time.DurationField durationField9 = islamicChronology2.years();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology2.monthOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField9", (durationField3.compareTo(durationField9) == 0) == durationField3.equals(durationField9));
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test627");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology2.yearOfEra();
        org.joda.time.DurationField durationField5 = islamicChronology2.hours();
        org.joda.time.DurationField durationField6 = islamicChronology2.halfdays();
        org.joda.time.DurationField durationField7 = islamicChronology2.centuries();
        org.joda.time.DurationField durationField8 = islamicChronology2.minutes();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology11 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone10);
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology11.weekyear();
        org.joda.time.DurationField durationField13 = islamicChronology11.years();
        org.joda.time.DateTimeField dateTimeField14 = islamicChronology11.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone15 = islamicChronology11.getZone();
        org.joda.time.DateTimeField dateTimeField16 = islamicChronology11.clockhourOfDay();
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime((long) 1);
        int int19 = localDateTime18.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime18.minusHours((int) (byte) -1);
        int int22 = localDateTime18.getSecondOfMinute();
        int int23 = localDateTime18.getCenturyOfEra();
        long long25 = islamicChronology11.set((org.joda.time.ReadablePartial) localDateTime18, 70L);
        org.joda.time.DateTimeField dateTimeField26 = islamicChronology11.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField27 = islamicChronology11.clockhourOfHalfday();
        org.joda.time.DurationField durationField28 = islamicChronology11.halfdays();
        org.joda.time.Chronology chronology29 = islamicChronology11.withUTC();
        boolean boolean30 = islamicChronology2.equals((java.lang.Object) chronology29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField13", (durationField3.compareTo(durationField13) == 0) == durationField3.equals(durationField13));
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test628");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology2.yearOfEra();
        long long6 = dateTimeField4.roundCeiling(0L);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) 1);
        int int9 = localDateTime8.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.minusHours((int) (byte) -1);
        int int12 = localDateTime8.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime8.withMinuteOfHour((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime8.plusHours((int) (byte) 100);
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.LocalDateTime localDateTime18 = localDateTime8.minus(readableDuration17);
        java.util.Locale locale19 = java.util.Locale.PRC;
        java.util.Locale locale20 = locale19.stripExtensions();
        java.lang.String str21 = dateTimeField4.getAsShortText((org.joda.time.ReadablePartial) localDateTime18, locale19);
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        org.joda.time.LocalDateTime localDateTime23 = localDateTime18.plus(readablePeriod22);
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        org.joda.time.LocalDateTime localDateTime25 = localDateTime18.plus(readablePeriod24);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime25.plusMonths((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.withDayOfYear(5);
        org.joda.time.LocalDateTime.Property property30 = localDateTime29.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime((long) 1);
        int int33 = localDateTime32.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime35 = localDateTime32.minusHours((int) (byte) -1);
        int int36 = localDateTime32.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime38 = localDateTime32.minusMinutes((int) '#');
        org.joda.time.LocalDateTime.Property property39 = localDateTime38.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime40 = property39.roundCeilingCopy();
        java.lang.String str41 = property39.toString();
        org.joda.time.LocalDateTime localDateTime43 = new org.joda.time.LocalDateTime((long) 1);
        int int44 = localDateTime43.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime46 = localDateTime43.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology49 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone48);
        org.joda.time.DateTime dateTime50 = localDateTime43.toDateTime(dateTimeZone48);
        org.joda.time.ReadableInstant readableInstant51 = null;
        boolean boolean52 = dateTime50.isAfter(readableInstant51);
        org.joda.time.Instant instant53 = dateTime50.toInstant();
        int int54 = property39.compareTo((org.joda.time.ReadableInstant) dateTime50);
        long long55 = property30.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime50);
        int int56 = property30.getMaximumValue();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime50 and instant53", (dateTime50.compareTo(instant53) == 0) == dateTime50.equals(instant53));
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test629");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = islamicChronology2.years();
        org.joda.time.DurationField durationField5 = islamicChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology2.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology2.dayOfYear();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology2.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology2.millisOfDay();
        long long13 = islamicChronology2.add((long) 86399, 87354000000L, 54);
        org.joda.time.LocalDateTime localDateTime14 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) islamicChronology2);
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((long) 1);
        int int17 = localDateTime16.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.withYear((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        org.joda.time.LocalDateTime localDateTime22 = localDateTime19.withPeriodAdded(readablePeriod20, 10);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime22.withDayOfYear(11);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime24.withYear(10);
        org.joda.time.LocalDateTime.Property property27 = localDateTime26.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime29 = localDateTime26.withWeekyear(86399);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime29.minusMinutes(0);
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology34 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone33);
        org.joda.time.DurationField durationField35 = islamicChronology34.weekyears();
        org.joda.time.DurationField durationField36 = islamicChronology34.halfdays();
        org.joda.time.DateTimeField dateTimeField37 = islamicChronology34.yearOfEra();
        org.joda.time.DurationField durationField38 = islamicChronology34.halfdays();
        org.joda.time.LocalDateTime localDateTime39 = new org.joda.time.LocalDateTime((org.joda.time.Chronology) islamicChronology34);
        org.joda.time.DateTimeField dateTimeField40 = islamicChronology34.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime41 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) islamicChronology34);
        boolean boolean42 = localDateTime31.isAfter((org.joda.time.ReadablePartial) localDateTime41);
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology45 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone44);
        org.joda.time.DateTimeField dateTimeField46 = islamicChronology45.weekyear();
        org.joda.time.LocalDateTime localDateTime53 = new org.joda.time.LocalDateTime(100, (int) (short) 10, (int) (short) 10, (int) (byte) 0, 0, (int) ' ');
        org.joda.time.ReadableDuration readableDuration54 = null;
        org.joda.time.LocalDateTime localDateTime55 = localDateTime53.plus(readableDuration54);
        org.joda.time.ReadablePeriod readablePeriod56 = null;
        org.joda.time.LocalDateTime localDateTime57 = localDateTime55.plus(readablePeriod56);
        org.joda.time.LocalDateTime localDateTime59 = localDateTime55.withMinuteOfHour(0);
        java.util.Locale locale61 = new java.util.Locale("\u5927\u97d3\u6c11\u56fd");
        java.lang.String str62 = dateTimeField46.getAsShortText((org.joda.time.ReadablePartial) localDateTime55, locale61);
        org.joda.time.DateTimeFieldType dateTimeFieldType64 = localDateTime55.getFieldType((int) (byte) 0);
        org.joda.time.LocalDateTime.Property property65 = localDateTime31.property(dateTimeFieldType64);
        org.joda.time.LocalDateTime.Property property66 = localDateTime14.property(dateTimeFieldType64);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField35", (durationField4.compareTo(durationField35) == 0) == durationField4.equals(durationField35));
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test630");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        int int2 = localDateTime1.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYear((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withPeriodAdded(readablePeriod5, 10);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withDayOfYear(11);
        org.joda.time.Chronology chronology10 = localDateTime9.getChronology();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime9.plusMonths((int) (byte) 10);
        int int13 = localDateTime12.getMillisOfDay();
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((long) 1);
        int int16 = localDateTime15.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime15.minusHours((int) (byte) -1);
        int int19 = localDateTime15.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime15.minusMinutes((int) '#');
        org.joda.time.LocalDateTime.Property property22 = localDateTime21.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime23 = property22.roundCeilingCopy();
        java.lang.String str24 = property22.toString();
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime((long) 1);
        int int27 = localDateTime26.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime29 = localDateTime26.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology32 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone31);
        org.joda.time.DateTime dateTime33 = localDateTime26.toDateTime(dateTimeZone31);
        org.joda.time.ReadableInstant readableInstant34 = null;
        boolean boolean35 = dateTime33.isAfter(readableInstant34);
        org.joda.time.Instant instant36 = dateTime33.toInstant();
        int int37 = property22.compareTo((org.joda.time.ReadableInstant) dateTime33);
        org.joda.time.DateTimeZone dateTimeZone38 = dateTime33.getZone();
        org.joda.time.LocalDateTime localDateTime40 = new org.joda.time.LocalDateTime((long) 1);
        int int41 = localDateTime40.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime43 = localDateTime40.minusHours((int) (byte) -1);
        int int45 = localDateTime40.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime47 = localDateTime40.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod48 = null;
        org.joda.time.LocalDateTime localDateTime49 = localDateTime40.minus(readablePeriod48);
        int int50 = localDateTime49.getYearOfCentury();
        org.joda.time.LocalDateTime localDateTime52 = new org.joda.time.LocalDateTime((long) 1);
        int int53 = localDateTime52.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime55 = localDateTime52.minusHours((int) (byte) -1);
        int int57 = localDateTime52.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime59 = localDateTime52.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod60 = null;
        org.joda.time.LocalDateTime localDateTime61 = localDateTime52.minus(readablePeriod60);
        org.joda.time.LocalDateTime.Property property62 = localDateTime52.millisOfSecond();
        long long63 = property62.remainder();
        java.lang.String str64 = property62.getName();
        java.util.Locale locale65 = java.util.Locale.CHINA;
        java.lang.String str66 = property62.getAsText(locale65);
        org.joda.time.LocalDateTime localDateTime67 = property62.withMinimumValue();
        boolean boolean69 = property62.equals((java.lang.Object) 59);
        org.joda.time.LocalDateTime localDateTime70 = property62.getLocalDateTime();
        org.joda.time.LocalDateTime localDateTime72 = new org.joda.time.LocalDateTime((long) 1);
        int int73 = localDateTime72.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime75 = localDateTime72.withYear((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod76 = null;
        org.joda.time.LocalDateTime localDateTime78 = localDateTime75.withPeriodAdded(readablePeriod76, 10);
        org.joda.time.LocalDateTime localDateTime80 = localDateTime78.withDayOfYear(11);
        org.joda.time.Chronology chronology81 = localDateTime80.getChronology();
        org.joda.time.DateTimeFieldType dateTimeFieldType83 = localDateTime80.getFieldType((int) (byte) 0);
        int int84 = localDateTime70.indexOf(dateTimeFieldType83);
        int int85 = localDateTime49.get(dateTimeFieldType83);
        int int86 = dateTime33.get(dateTimeFieldType83);
        int int87 = localDateTime12.get(dateTimeFieldType83);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime33 and instant36", (dateTime33.compareTo(instant36) == 0) == dateTime33.equals(instant36));
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test631");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = islamicChronology2.years();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) 1);
        int int7 = localDateTime6.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.minusHours((int) (byte) -1);
        int int11 = localDateTime6.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime6.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalDateTime localDateTime15 = localDateTime6.minus(readablePeriod14);
        int int16 = localDateTime15.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField18 = localDateTime15.getField(0);
        org.joda.time.LocalDateTime.Property property19 = localDateTime15.centuryOfEra();
        int[] intArray21 = islamicChronology2.get((org.joda.time.ReadablePartial) localDateTime15, (long) 0);
        org.joda.time.DateTimeField dateTimeField22 = islamicChronology2.millisOfDay();
        org.joda.time.DurationField durationField23 = islamicChronology2.centuries();
        org.joda.time.DateTimeField dateTimeField24 = islamicChronology2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone25 = islamicChronology2.getZone();
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        long long29 = islamicChronology2.add(readablePeriod26, (long) 3, 10);
        org.joda.time.DateTimeField dateTimeField30 = islamicChronology2.yearOfCentury();
        org.joda.time.DurationField durationField31 = islamicChronology2.centuries();
        org.joda.time.DateTimeField dateTimeField32 = islamicChronology2.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField33 = islamicChronology2.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField34 = islamicChronology2.dayOfMonth();
        org.joda.time.DurationField durationField35 = islamicChronology2.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField35, durationField4, and durationField23", !(durationField35.compareTo(durationField4) == 0) || (Math.signum(durationField35.compareTo(durationField23)) == Math.signum(durationField4.compareTo(durationField23))));
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test632");
        java.lang.String[] strArray14 = new java.lang.String[] { "1970-01-01T00:25:00.001", "+01:00", "", "JPN", "jpn", "19", "1970", "10", "", "FR", "10", "0", "millis", "DurationField[seconds]" };
        java.util.LinkedHashSet<java.lang.String> strSet15 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet15, strArray14);
        boolean boolean17 = strSet15.isEmpty();
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime((long) 1);
        int int20 = localDateTime19.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime22 = localDateTime19.minusHours((int) (byte) -1);
        int int24 = localDateTime19.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime19.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        org.joda.time.LocalDateTime localDateTime28 = localDateTime19.minus(readablePeriod27);
        org.joda.time.LocalDateTime.Property property29 = localDateTime19.millisOfSecond();
        long long30 = property29.remainder();
        java.lang.String str31 = property29.getName();
        org.joda.time.DurationField durationField32 = property29.getRangeDurationField();
        org.joda.time.LocalDateTime localDateTime34 = property29.addToCopy(11);
        java.lang.String str35 = property29.getAsText();
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime((long) 1);
        int int38 = localDateTime37.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime40 = localDateTime37.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology43 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone42);
        org.joda.time.DateTime dateTime44 = localDateTime37.toDateTime(dateTimeZone42);
        org.joda.time.LocalDateTime localDateTime46 = new org.joda.time.LocalDateTime((long) 1);
        int int47 = localDateTime46.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime49 = localDateTime46.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology52 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone51);
        org.joda.time.DateTime dateTime53 = localDateTime46.toDateTime(dateTimeZone51);
        long long54 = dateTime53.getMillis();
        boolean boolean55 = dateTime44.isAfter((org.joda.time.ReadableInstant) dateTime53);
        long long56 = dateTime53.getMillis();
        org.joda.time.DateTimeZone dateTimeZone58 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology59 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone58);
        org.joda.time.DurationField durationField60 = islamicChronology59.weekyears();
        org.joda.time.DateTimeZone dateTimeZone62 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology63 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone62);
        boolean boolean65 = dateTimeZone62.equals((java.lang.Object) 10L);
        org.joda.time.Chronology chronology66 = islamicChronology59.withZone(dateTimeZone62);
        org.joda.time.DateTimeField dateTimeField67 = islamicChronology59.hourOfHalfday();
        org.joda.time.DurationField durationField68 = dateTimeField67.getRangeDurationField();
        boolean boolean69 = dateTime53.equals((java.lang.Object) durationField68);
        org.joda.time.Instant instant70 = dateTime53.toInstant();
        org.joda.time.Chronology chronology71 = instant70.getChronology();
        long long72 = property29.getDifferenceAsLong((org.joda.time.ReadableInstant) instant70);
        org.joda.time.LocalDateTime localDateTime74 = new org.joda.time.LocalDateTime((long) 1);
        int int75 = localDateTime74.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime77 = localDateTime74.minusHours((int) (byte) -1);
        int int79 = localDateTime74.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime81 = localDateTime74.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod82 = null;
        org.joda.time.LocalDateTime localDateTime83 = localDateTime74.minus(readablePeriod82);
        int int84 = localDateTime83.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField86 = localDateTime83.getField(0);
        org.joda.time.LocalDateTime.Property property87 = localDateTime83.centuryOfEra();
        org.joda.time.LocalDateTime.Property property88 = localDateTime83.millisOfSecond();
        org.joda.time.DateTimeFieldType dateTimeFieldType89 = property88.getFieldType();
        boolean boolean90 = instant70.isSupported(dateTimeFieldType89);
        boolean boolean91 = strSet15.equals((java.lang.Object) instant70);
        int int92 = strSet15.size();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime44 and instant70", (dateTime44.compareTo(instant70) == 0) == dateTime44.equals(instant70));
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test633");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        int int2 = localDateTime1.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology7 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone6);
        org.joda.time.DateTime dateTime8 = localDateTime1.toDateTime(dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((long) 1);
        int int11 = localDateTime10.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime10.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology16 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone15);
        org.joda.time.DateTime dateTime17 = localDateTime10.toDateTime(dateTimeZone15);
        long long18 = dateTime17.getMillis();
        boolean boolean19 = dateTime8.isAfter((org.joda.time.ReadableInstant) dateTime17);
        long long20 = dateTime17.getMillis();
        org.joda.time.Instant instant21 = dateTime17.toInstant();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology24 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone23);
        boolean boolean26 = dateTimeZone23.equals((java.lang.Object) 10L);
        java.util.Locale locale28 = java.util.Locale.JAPAN;
        java.lang.String str29 = locale28.getISO3Country();
        java.lang.String str30 = dateTimeZone23.getShortName(1970L, locale28);
        java.util.TimeZone timeZone31 = dateTimeZone23.toTimeZone();
        long long34 = dateTimeZone23.convertLocalToUTC(2626841168L, false);
        boolean boolean35 = instant21.equals((java.lang.Object) false);
        java.lang.String str36 = instant21.toString();
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology39 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone38);
        boolean boolean40 = dateTimeZone38.isFixed();
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime((long) 1);
        int int43 = localDateTime42.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime45 = localDateTime42.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology48 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone47);
        org.joda.time.DateTime dateTime49 = localDateTime42.toDateTime(dateTimeZone47);
        org.joda.time.ReadableInstant readableInstant50 = null;
        boolean boolean51 = dateTime49.isAfter(readableInstant50);
        org.joda.time.Instant instant52 = dateTime49.toInstant();
        java.lang.String str53 = dateTime49.toString();
        int int54 = dateTimeZone38.getOffset((org.joda.time.ReadableInstant) dateTime49);
        long long55 = dateTime49.getMillis();
        org.joda.time.Instant instant56 = dateTime49.toInstant();
        boolean boolean57 = instant21.isAfter((org.joda.time.ReadableInstant) instant56);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and instant52", (dateTime8.compareTo(instant52) == 0) == dateTime8.equals(instant52));
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test634");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology6 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone5);
        boolean boolean8 = dateTimeZone5.equals((java.lang.Object) 10L);
        org.joda.time.Chronology chronology9 = islamicChronology2.withZone(dateTimeZone5);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        long long13 = islamicChronology2.add(readablePeriod10, (long) (byte) 0, (-1));
        org.joda.time.DateTimeField dateTimeField14 = islamicChronology2.halfdayOfDay();
        org.joda.time.DurationField durationField15 = islamicChronology2.millis();
        org.joda.time.DateTimeField dateTimeField16 = islamicChronology2.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField17 = islamicChronology2.hourOfDay();
        org.joda.time.DateTimeField dateTimeField18 = islamicChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField19 = islamicChronology2.yearOfEra();
        org.joda.time.DateTimeField dateTimeField20 = islamicChronology2.era();
        org.joda.time.DateTimeField dateTimeField21 = islamicChronology2.weekyear();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology24 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField25 = islamicChronology24.yearOfCentury();
        org.joda.time.DurationField durationField26 = islamicChronology24.years();
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime((long) 1);
        int int29 = localDateTime28.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime31 = localDateTime28.minusHours((int) (byte) -1);
        int int33 = localDateTime28.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime35 = localDateTime28.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod36 = null;
        org.joda.time.LocalDateTime localDateTime37 = localDateTime28.minus(readablePeriod36);
        int int38 = localDateTime37.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField40 = localDateTime37.getField(0);
        org.joda.time.LocalDateTime.Property property41 = localDateTime37.centuryOfEra();
        int[] intArray43 = islamicChronology24.get((org.joda.time.ReadablePartial) localDateTime37, (long) 0);
        org.joda.time.DateTimeField dateTimeField44 = islamicChronology24.millisOfDay();
        org.joda.time.DurationField durationField45 = islamicChronology24.centuries();
        org.joda.time.DateTimeZone dateTimeZone46 = islamicChronology24.getZone();
        org.joda.time.DateTimeField dateTimeField47 = islamicChronology24.dayOfWeek();
        org.joda.time.DurationField durationField48 = islamicChronology24.months();
        org.joda.time.DurationField durationField49 = islamicChronology24.months();
        org.joda.time.DateTimeField dateTimeField50 = islamicChronology24.dayOfYear();
        long long52 = dateTimeField50.roundCeiling((long) 575);
        org.joda.time.DurationField durationField53 = dateTimeField50.getRangeDurationField();
        boolean boolean54 = islamicChronology2.equals((java.lang.Object) dateTimeField50);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField26", (durationField3.compareTo(durationField26) == 0) == durationField3.equals(durationField26));
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test635");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = islamicChronology2.eras();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology2.yearOfCentury();
        org.joda.time.DurationField durationField7 = islamicChronology2.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField4, durationField7, and durationField4", !(durationField4.compareTo(durationField7) == 0) || (Math.signum(durationField4.compareTo(durationField4)) == Math.signum(durationField7.compareTo(durationField4))));
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test636");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology2.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology2.year();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((java.lang.Object) 2551440384L);
        long long8 = islamicChronology2.set((org.joda.time.ReadablePartial) localDateTime6, 1L);
        org.joda.time.DurationField durationField9 = islamicChronology2.years();
        org.joda.time.DateTimeZone dateTimeZone10 = islamicChronology2.getZone();
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(dateTimeZone10);
        long long13 = dateTimeZone10.nextTransition(94913593200000L);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology16 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone15);
        org.joda.time.DurationField durationField17 = islamicChronology16.weekyears();
        org.joda.time.DateTimeField dateTimeField18 = islamicChronology16.hourOfDay();
        org.joda.time.DateTimeField dateTimeField19 = islamicChronology16.millisOfSecond();
        java.lang.String str20 = islamicChronology16.toString();
        org.joda.time.DateTimeField dateTimeField21 = islamicChronology16.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField22 = islamicChronology16.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField23 = islamicChronology16.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField24 = islamicChronology16.era();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType25 = islamicChronology16.getLeapYearPatternType();
        org.joda.time.DateTimeZone dateTimeZone26 = islamicChronology16.getZone();
        long long28 = dateTimeZone10.getMillisKeepLocal(dateTimeZone26, 0L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField9 and durationField17", (durationField9.compareTo(durationField17) == 0) == durationField9.equals(durationField17));
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test637");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DurationField durationField4 = islamicChronology2.months();
        org.joda.time.DurationField durationField5 = islamicChronology2.centuries();
        org.joda.time.DateTimeZone dateTimeZone6 = islamicChronology2.getZone();
        long long10 = dateTimeZone6.convertLocalToUTC(839699746L, true, (long) 'x');
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology13 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone12);
        org.joda.time.DateTimeField dateTimeField14 = islamicChronology13.yearOfCentury();
        org.joda.time.DurationField durationField15 = islamicChronology13.years();
        org.joda.time.DurationField durationField16 = islamicChronology13.halfdays();
        org.joda.time.DateTimeField dateTimeField17 = islamicChronology13.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField18 = islamicChronology13.dayOfYear();
        org.joda.time.DateTimeField dateTimeField19 = islamicChronology13.hourOfHalfday();
        org.joda.time.DurationField durationField20 = islamicChronology13.minutes();
        org.joda.time.DateTimeField dateTimeField21 = islamicChronology13.weekOfWeekyear();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType22 = islamicChronology13.getLeapYearPatternType();
        org.joda.time.chrono.IslamicChronology islamicChronology23 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone6, leapYearPatternType22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField15", (durationField3.compareTo(durationField15) == 0) == durationField3.equals(durationField15));
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test638");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        int int2 = localDateTime1.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.minusHours((int) (byte) -1);
        int int5 = localDateTime1.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.minusMinutes((int) '#');
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime9 = property8.roundCeilingCopy();
        int int10 = localDateTime9.size();
        org.joda.time.LocalDateTime.Property property11 = localDateTime9.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime12 = property11.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((long) 1);
        int int15 = localDateTime14.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime17 = localDateTime14.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology20 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone19);
        org.joda.time.DateTime dateTime21 = localDateTime14.toDateTime(dateTimeZone19);
        org.joda.time.ReadableInstant readableInstant22 = null;
        boolean boolean23 = dateTime21.isAfter(readableInstant22);
        org.joda.time.Instant instant24 = dateTime21.toInstant();
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime((long) 1);
        int int27 = localDateTime26.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime29 = localDateTime26.minusHours((int) (byte) -1);
        int int31 = localDateTime26.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime26.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        org.joda.time.LocalDateTime localDateTime35 = localDateTime26.minus(readablePeriod34);
        int int36 = localDateTime35.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField38 = localDateTime35.getField(0);
        org.joda.time.LocalDateTime.Property property39 = localDateTime35.centuryOfEra();
        org.joda.time.ReadableDuration readableDuration40 = null;
        org.joda.time.LocalDateTime localDateTime41 = localDateTime35.plus(readableDuration40);
        org.joda.time.LocalDateTime localDateTime43 = new org.joda.time.LocalDateTime((long) 1);
        int int44 = localDateTime43.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime46 = localDateTime43.minusHours((int) (byte) -1);
        int int48 = localDateTime43.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime50 = localDateTime43.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod51 = null;
        org.joda.time.LocalDateTime localDateTime52 = localDateTime43.minus(readablePeriod51);
        org.joda.time.LocalDateTime.Property property53 = localDateTime43.millisOfSecond();
        long long54 = property53.remainder();
        java.lang.String str55 = property53.getName();
        java.util.Locale locale56 = java.util.Locale.CHINA;
        java.lang.String str57 = property53.getAsText(locale56);
        org.joda.time.LocalDateTime localDateTime58 = property53.withMinimumValue();
        boolean boolean60 = property53.equals((java.lang.Object) 59);
        org.joda.time.LocalDateTime localDateTime61 = property53.getLocalDateTime();
        org.joda.time.LocalDateTime localDateTime63 = new org.joda.time.LocalDateTime((long) 1);
        int int64 = localDateTime63.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime66 = localDateTime63.withYear((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod67 = null;
        org.joda.time.LocalDateTime localDateTime69 = localDateTime66.withPeriodAdded(readablePeriod67, 10);
        org.joda.time.LocalDateTime localDateTime71 = localDateTime69.withDayOfYear(11);
        org.joda.time.Chronology chronology72 = localDateTime71.getChronology();
        org.joda.time.DateTimeFieldType dateTimeFieldType74 = localDateTime71.getFieldType((int) (byte) 0);
        int int75 = localDateTime61.indexOf(dateTimeFieldType74);
        org.joda.time.LocalDateTime localDateTime77 = localDateTime35.withField(dateTimeFieldType74, (int) (short) -1);
        boolean boolean78 = instant24.isSupported(dateTimeFieldType74);
        org.joda.time.chrono.IslamicChronology islamicChronology79 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField80 = islamicChronology79.minuteOfDay();
        org.joda.time.DurationField durationField81 = islamicChronology79.months();
        org.joda.time.DurationField durationField82 = islamicChronology79.weeks();
        org.joda.time.DateTimeField dateTimeField83 = islamicChronology79.clockhourOfDay();
        org.joda.time.ReadablePeriod readablePeriod84 = null;
        long long87 = islamicChronology79.add(readablePeriod84, 292278993L, 59);
        org.joda.time.DateTimeField dateTimeField88 = islamicChronology79.hourOfHalfday();
        org.joda.time.DateTimeFieldType dateTimeFieldType89 = dateTimeField88.getType();
        int int90 = instant24.get(dateTimeFieldType89);
        boolean boolean91 = localDateTime12.isSupported(dateTimeFieldType89);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime21 and instant24", (dateTime21.compareTo(instant24) == 0) == dateTime21.equals(instant24));
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test639");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DurationField durationField4 = islamicChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.yearOfEra();
        org.joda.time.DurationField durationField6 = islamicChronology2.months();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology2.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime((long) 1);
        int int10 = localDateTime9.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime9.minusHours((int) (byte) -1);
        int int13 = localDateTime9.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime9.withMinuteOfHour((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime9.plusHours((int) (byte) 100);
        int int18 = localDateTime9.getMillisOfDay();
        int[] intArray20 = islamicChronology2.get((org.joda.time.ReadablePartial) localDateTime9, (long) 99);
        org.joda.time.DateTimeField dateTimeField21 = islamicChronology2.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField22 = islamicChronology2.clockhourOfHalfday();
        org.joda.time.DurationField durationField23 = islamicChronology2.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField23, durationField3, and durationField4", !(durationField23.compareTo(durationField3) == 0) || (Math.signum(durationField23.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test640");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = islamicChronology2.years();
        org.joda.time.DurationField durationField5 = islamicChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology2.hourOfHalfday();
        org.joda.time.DurationField durationField7 = islamicChronology2.weeks();
        long long11 = islamicChronology2.add(100L, 1970L, 10);
        org.joda.time.DurationField durationField12 = islamicChronology2.millis();
        org.joda.time.DateTimeField dateTimeField13 = islamicChronology2.millisOfSecond();
        org.joda.time.DurationField durationField14 = islamicChronology2.hours();
        org.joda.time.DurationField durationField15 = islamicChronology2.millis();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology18 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone17);
        org.joda.time.DurationField durationField19 = islamicChronology18.weekyears();
        org.joda.time.DurationField durationField20 = islamicChronology18.halfdays();
        org.joda.time.LocalDateTime localDateTime21 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime((long) 1);
        int int24 = localDateTime23.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime26 = localDateTime23.withYear((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        org.joda.time.LocalDateTime localDateTime29 = localDateTime26.withPeriodAdded(readablePeriod27, 10);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime29.withDayOfYear(11);
        int[] intArray32 = localDateTime31.getValues();
        org.joda.time.LocalDateTime localDateTime34 = localDateTime31.plusHours((int) (short) 0);
        int int35 = localDateTime21.compareTo((org.joda.time.ReadablePartial) localDateTime31);
        long long37 = islamicChronology18.set((org.joda.time.ReadablePartial) localDateTime21, (-24796798031L));
        org.joda.time.DateTimeField dateTimeField38 = islamicChronology18.hourOfHalfday();
        boolean boolean39 = islamicChronology2.equals((java.lang.Object) dateTimeField38);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField19", (durationField4.compareTo(durationField19) == 0) == durationField4.equals(durationField19));
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test641");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology2.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone5 = islamicChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology2.millisOfSecond();
        org.joda.time.DurationField durationField7 = islamicChronology2.seconds();
        org.joda.time.DurationField durationField8 = islamicChronology2.millis();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology2.dayOfYear();
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((long) (byte) -1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.minusDays(12);
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.weekOfWeekyear();
        int int15 = localDateTime13.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime((long) 1);
        int int18 = localDateTime17.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime17.minusHours((int) (byte) -1);
        int int21 = localDateTime17.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime23 = localDateTime17.minusMinutes((int) '#');
        org.joda.time.LocalDateTime.Property property24 = localDateTime23.centuryOfEra();
        java.lang.String str25 = property24.getAsShortText();
        org.joda.time.LocalDateTime localDateTime27 = property24.addToCopy((long) 70);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.minusHours((int) (short) -1);
        boolean boolean30 = localDateTime13.isEqual((org.joda.time.ReadablePartial) localDateTime27);
        java.util.Locale locale32 = java.util.Locale.JAPAN;
        java.lang.String str33 = locale32.getVariant();
        java.util.Locale.Builder builder34 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder36 = builder34.setVariant("");
        java.util.Locale locale37 = builder36.build();
        java.util.Locale locale38 = java.util.Locale.CANADA;
        java.lang.String str39 = locale37.getDisplayCountry(locale38);
        java.lang.String str40 = locale38.getVariant();
        java.lang.String str41 = locale32.getDisplayCountry(locale38);
        java.util.Set<java.lang.String> strSet42 = locale38.getUnicodeLocaleAttributes();
        java.lang.String str43 = locale38.getDisplayLanguage();
        java.lang.String str44 = dateTimeField9.getAsShortText((org.joda.time.ReadablePartial) localDateTime13, 78, locale38);
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology47 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone46);
        org.joda.time.DateTimeField dateTimeField48 = islamicChronology47.yearOfCentury();
        org.joda.time.DurationField durationField49 = islamicChronology47.years();
        org.joda.time.LocalDateTime localDateTime51 = new org.joda.time.LocalDateTime((long) 1);
        int int52 = localDateTime51.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime54 = localDateTime51.minusHours((int) (byte) -1);
        int int56 = localDateTime51.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime58 = localDateTime51.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod59 = null;
        org.joda.time.LocalDateTime localDateTime60 = localDateTime51.minus(readablePeriod59);
        int int61 = localDateTime60.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField63 = localDateTime60.getField(0);
        org.joda.time.LocalDateTime.Property property64 = localDateTime60.centuryOfEra();
        int[] intArray66 = islamicChronology47.get((org.joda.time.ReadablePartial) localDateTime60, (long) 0);
        org.joda.time.LocalDateTime localDateTime68 = localDateTime60.withMillisOfSecond(60);
        org.joda.time.LocalDateTime.Property property69 = localDateTime68.dayOfYear();
        org.joda.time.LocalDateTime localDateTime71 = new org.joda.time.LocalDateTime((long) 1);
        int int72 = localDateTime71.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime74 = localDateTime71.minusHours((int) (byte) -1);
        int int76 = localDateTime71.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime78 = localDateTime71.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod79 = null;
        org.joda.time.LocalDateTime localDateTime80 = localDateTime71.minus(readablePeriod79);
        org.joda.time.LocalDateTime.Property property81 = localDateTime71.millisOfSecond();
        long long82 = property81.remainder();
        java.lang.String str83 = property81.getName();
        java.util.Locale locale84 = java.util.Locale.CHINA;
        java.lang.String str85 = property81.getAsText(locale84);
        int int86 = property69.getMaximumShortTextLength(locale84);
        java.lang.String str87 = locale38.getDisplayVariant(locale84);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField49", (durationField3.compareTo(durationField49) == 0) == durationField3.equals(durationField49));
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test642");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DurationField durationField4 = islamicChronology2.months();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.minuteOfHour();
        org.joda.time.DurationField durationField6 = islamicChronology2.hours();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology2.hourOfHalfday();
        org.joda.time.DurationField durationField8 = islamicChronology2.centuries();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology2.monthOfYear();
        long long13 = islamicChronology2.add(19800L, (long) 132, 60);
        org.joda.time.DurationField durationField14 = islamicChronology2.years();
        org.joda.time.DurationField durationField15 = islamicChronology2.weeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField14", (durationField3.compareTo(durationField14) == 0) == durationField3.equals(durationField14));
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test643");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        int int2 = localDateTime1.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology7 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone6);
        org.joda.time.DateTime dateTime8 = localDateTime1.toDateTime(dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((long) 1);
        int int11 = localDateTime10.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime10.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology16 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone15);
        org.joda.time.DateTime dateTime17 = localDateTime10.toDateTime(dateTimeZone15);
        long long18 = dateTime17.getMillis();
        boolean boolean19 = dateTime8.isAfter((org.joda.time.ReadableInstant) dateTime17);
        long long20 = dateTime17.getMillis();
        org.joda.time.Instant instant21 = dateTime17.toInstant();
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime((long) 1);
        int int24 = localDateTime23.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime26 = localDateTime23.minusHours((int) (byte) -1);
        int int28 = localDateTime23.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime23.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod31 = null;
        org.joda.time.LocalDateTime localDateTime32 = localDateTime23.minus(readablePeriod31);
        org.joda.time.LocalDateTime.Property property33 = localDateTime23.millisOfSecond();
        long long34 = property33.remainder();
        java.lang.String str35 = property33.getName();
        java.util.Locale locale36 = java.util.Locale.CHINA;
        java.lang.String str37 = property33.getAsText(locale36);
        org.joda.time.LocalDateTime localDateTime38 = property33.withMinimumValue();
        org.joda.time.LocalDateTime localDateTime40 = localDateTime38.plusYears(4);
        org.joda.time.ReadablePeriod readablePeriod41 = null;
        org.joda.time.LocalDateTime localDateTime42 = localDateTime40.plus(readablePeriod41);
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology45 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone44);
        org.joda.time.DurationField durationField46 = islamicChronology45.weekyears();
        org.joda.time.DurationField durationField47 = islamicChronology45.halfdays();
        org.joda.time.DurationField durationField48 = islamicChronology45.weeks();
        org.joda.time.DateTimeField dateTimeField49 = islamicChronology45.yearOfEra();
        org.joda.time.LocalDateTime localDateTime51 = new org.joda.time.LocalDateTime((long) 1);
        int int52 = localDateTime51.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime54 = localDateTime51.minusHours((int) (byte) -1);
        org.joda.time.DateTimeField[] dateTimeFieldArray55 = localDateTime54.getFields();
        java.util.Locale locale56 = java.util.Locale.KOREA;
        java.util.Locale locale57 = java.util.Locale.KOREA;
        java.lang.String str58 = locale56.getDisplayLanguage(locale57);
        java.lang.String str59 = dateTimeField49.getAsText((org.joda.time.ReadablePartial) localDateTime54, locale56);
        org.joda.time.DateTimeFieldType dateTimeFieldType60 = dateTimeField49.getType();
        org.joda.time.LocalDateTime localDateTime62 = localDateTime40.withField(dateTimeFieldType60, (int) ' ');
        boolean boolean63 = instant21.isSupported(dateTimeFieldType60);
        org.joda.time.Chronology chronology64 = instant21.getChronology();
        org.joda.time.DateTimeField dateTimeField65 = chronology64.dayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and instant21", (dateTime8.compareTo(instant21) == 0) == dateTime8.equals(instant21));
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test644");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology2.hourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((long) 1);
        int int8 = localDateTime7.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime7.minusHours((int) (byte) -1);
        int int12 = localDateTime7.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime7.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.LocalDateTime localDateTime16 = localDateTime7.minus(readablePeriod15);
        int int17 = localDateTime16.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField19 = localDateTime16.getField(0);
        org.joda.time.LocalDateTime.Property property20 = localDateTime16.centuryOfEra();
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.LocalDateTime localDateTime22 = localDateTime16.plus(readableDuration21);
        int int23 = dateTimeField5.getMaximumValue((org.joda.time.ReadablePartial) localDateTime22);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime22.withCenturyOfEra(12);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology28 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone27);
        boolean boolean30 = dateTimeZone27.equals((java.lang.Object) 10L);
        java.lang.String str32 = dateTimeZone27.getName((long) '#');
        long long36 = dateTimeZone27.convertLocalToUTC(3L, false, 86400000L);
        int int38 = dateTimeZone27.getStandardOffset(35L);
        org.joda.time.DateTime dateTime39 = localDateTime25.toDateTime(dateTimeZone27);
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology43 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone42);
        org.joda.time.DateTimeField dateTimeField44 = islamicChronology43.weekyear();
        org.joda.time.DurationField durationField45 = islamicChronology43.years();
        org.joda.time.DateTimeField dateTimeField46 = islamicChronology43.secondOfDay();
        org.joda.time.LocalDateTime localDateTime47 = new org.joda.time.LocalDateTime((long) 45, (org.joda.time.Chronology) islamicChronology43);
        org.joda.time.DateTime dateTime48 = localDateTime47.toDateTime();
        org.joda.time.Instant instant49 = dateTime48.toInstant();
        org.joda.time.Chronology chronology50 = dateTime48.getChronology();
        boolean boolean51 = dateTime39.isAfter((org.joda.time.ReadableInstant) dateTime48);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField45", (durationField3.compareTo(durationField45) == 0) == durationField3.equals(durationField45));
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test645");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology2.weekyear();
        org.joda.time.DurationField durationField4 = islamicChronology2.years();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology2.hourOfDay();
        org.joda.time.DurationField durationField7 = islamicChronology2.hours();
        org.joda.time.DurationField durationField8 = islamicChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology2.monthOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField8", (durationField4.compareTo(durationField8) == 0) == durationField4.equals(durationField8));
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test646");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        int int3 = islamicChronology2.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology2.weekyear();
        org.joda.time.DurationField durationField5 = islamicChronology2.hours();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((long) 1);
        int int8 = localDateTime7.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime7.minusHours((int) (byte) -1);
        org.joda.time.DateTimeField[] dateTimeFieldArray11 = localDateTime10.getFields();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime10.minusDays(4);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology16 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField17 = islamicChronology16.yearOfCentury();
        org.joda.time.DurationField durationField18 = islamicChronology16.years();
        org.joda.time.DurationField durationField19 = islamicChronology16.halfdays();
        org.joda.time.DateTimeField dateTimeField20 = islamicChronology16.hourOfHalfday();
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime((long) 1);
        int int23 = localDateTime22.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime25 = localDateTime22.minusHours((int) (byte) -1);
        int int26 = localDateTime22.getSecondOfMinute();
        int[] intArray33 = new int[] { 292278993, ' ', (short) 1, (short) -1, (byte) -1 };
        int[] intArray35 = dateTimeField20.set((org.joda.time.ReadablePartial) localDateTime22, (int) (byte) 0, intArray33, 10);
        islamicChronology2.validate((org.joda.time.ReadablePartial) localDateTime10, intArray35);
        org.joda.time.DurationField durationField37 = islamicChronology2.years();
        org.joda.time.DateTimeField dateTimeField38 = islamicChronology2.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField39 = islamicChronology2.era();
        java.lang.String str41 = dateTimeField39.getAsShortText(17700100L);
        org.joda.time.tz.NameProvider nameProvider43 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale44 = java.util.Locale.KOREA;
        java.util.Set<java.lang.String> strSet45 = locale44.getUnicodeLocaleAttributes();
        java.lang.String str47 = locale44.getUnicodeLocaleType("FR");
        java.lang.String str50 = nameProvider43.getName(locale44, "\uc601\uc5b4", "GMT+00:00");
        org.joda.time.DateTimeZone.setNameProvider(nameProvider43);
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology54 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone53);
        org.joda.time.DurationField durationField55 = islamicChronology54.weekyears();
        org.joda.time.DurationField durationField56 = islamicChronology54.months();
        org.joda.time.DateTimeField dateTimeField57 = islamicChronology54.minuteOfHour();
        org.joda.time.DurationField durationField58 = islamicChronology54.hours();
        org.joda.time.DateTimeField dateTimeField59 = islamicChronology54.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone61 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 0);
        org.joda.time.Chronology chronology62 = islamicChronology54.withZone(dateTimeZone61);
        java.util.Locale locale64 = java.util.Locale.CANADA;
        java.lang.String str65 = dateTimeZone61.getShortName((long) 11, locale64);
        java.lang.String str66 = locale64.getVariant();
        java.lang.String str69 = nameProvider43.getShortName(locale64, "DateTimeField[millisOfSecond]", "+00:00");
        java.lang.String str70 = locale64.getLanguage();
        java.lang.String str71 = locale64.getVariant();
        java.lang.String str72 = locale64.getDisplayScript();
        java.lang.String str73 = dateTimeField39.getAsShortText(0L, locale64);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField18 and durationField55", (durationField18.compareTo(durationField55) == 0) == durationField18.equals(durationField55));
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test647");
        java.util.Set<java.lang.String> strSet0 = org.joda.time.DateTimeZone.getAvailableIDs();
        java.util.Locale locale1 = java.util.Locale.KOREA;
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleAttributes();
        java.util.Locale locale3 = java.util.Locale.KOREA;
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleAttributes();
        boolean boolean5 = strSet2.removeAll((java.util.Collection<java.lang.String>) strSet4);
        boolean boolean6 = strSet0.addAll((java.util.Collection<java.lang.String>) strSet2);
        java.util.Locale.LanguageRange[] languageRangeArray7 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList8 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList8, languageRangeArray7);
        java.util.Locale locale10 = java.util.Locale.JAPAN;
        java.lang.String str11 = locale10.getVariant();
        java.util.Locale locale12 = java.util.Locale.JAPAN;
        java.util.Locale locale13 = java.util.Locale.FRANCE;
        java.lang.String str14 = locale13.getCountry();
        java.util.Locale locale15 = java.util.Locale.GERMAN;
        java.util.Locale locale16 = java.util.Locale.KOREA;
        java.util.Set<java.lang.String> strSet17 = locale16.getUnicodeLocaleAttributes();
        java.util.Locale[] localeArray18 = new java.util.Locale[] { locale10, locale12, locale13, locale15, locale16 };
        java.util.ArrayList<java.util.Locale> localeList19 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList19, localeArray18);
        java.util.Locale.FilteringMode filteringMode21 = null;
        java.util.List<java.util.Locale> localeList22 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList8, (java.util.Collection<java.util.Locale>) localeList19, filteringMode21);
        boolean boolean23 = strSet2.remove((java.lang.Object) localeList19);
        boolean boolean24 = strSet2.isEmpty();
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime((long) 1);
        int int27 = localDateTime26.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime29 = localDateTime26.minusHours((int) (byte) -1);
        int int31 = localDateTime26.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime26.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        org.joda.time.LocalDateTime localDateTime35 = localDateTime26.minus(readablePeriod34);
        int int36 = localDateTime35.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField38 = localDateTime35.getField(0);
        boolean boolean39 = strSet2.remove((java.lang.Object) 0);
        boolean boolean40 = strSet2.isEmpty();
        int int41 = strSet2.size();
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology44 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone43);
        org.joda.time.DurationField durationField45 = islamicChronology44.weekyears();
        org.joda.time.DurationField durationField46 = islamicChronology44.halfdays();
        org.joda.time.DateTimeField dateTimeField47 = islamicChronology44.yearOfEra();
        org.joda.time.DateTimeField dateTimeField48 = islamicChronology44.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField49 = islamicChronology44.weekyear();
        boolean boolean50 = strSet2.contains((java.lang.Object) dateTimeField49);
        boolean boolean51 = strSet2.isEmpty();
        java.lang.Object[] objArray52 = strSet2.toArray();
        java.util.Locale locale53 = java.util.Locale.ENGLISH;
        java.lang.String str54 = locale53.getDisplayLanguage();
        org.joda.time.tz.NameProvider nameProvider55 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale56 = java.util.Locale.getDefault();
        java.lang.String str59 = nameProvider55.getName(locale56, "JPN", "0");
        java.lang.String str60 = locale53.getDisplayName(locale56);
        java.util.Set<java.lang.String> strSet61 = locale53.getUnicodeLocaleAttributes();
        boolean boolean62 = strSet2.addAll((java.util.Collection<java.lang.String>) strSet61);
        java.util.stream.Stream<java.lang.String> strStream63 = strSet61.parallelStream();
        org.joda.time.DateTimeZone dateTimeZone65 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology66 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone65);
        org.joda.time.DateTimeField dateTimeField67 = islamicChronology66.yearOfCentury();
        org.joda.time.DurationField durationField68 = islamicChronology66.years();
        org.joda.time.LocalDateTime localDateTime70 = new org.joda.time.LocalDateTime((long) 1);
        int int71 = localDateTime70.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime73 = localDateTime70.minusHours((int) (byte) -1);
        int int75 = localDateTime70.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime77 = localDateTime70.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod78 = null;
        org.joda.time.LocalDateTime localDateTime79 = localDateTime70.minus(readablePeriod78);
        int int80 = localDateTime79.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField82 = localDateTime79.getField(0);
        org.joda.time.LocalDateTime.Property property83 = localDateTime79.centuryOfEra();
        int[] intArray85 = islamicChronology66.get((org.joda.time.ReadablePartial) localDateTime79, (long) 0);
        org.joda.time.DateTimeField dateTimeField86 = islamicChronology66.millisOfDay();
        org.joda.time.DurationField durationField87 = islamicChronology66.centuries();
        org.joda.time.DateTimeZone dateTimeZone88 = islamicChronology66.getZone();
        org.joda.time.DateTimeField dateTimeField89 = islamicChronology66.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime90 = new org.joda.time.LocalDateTime();
        int[] intArray92 = islamicChronology66.get((org.joda.time.ReadablePartial) localDateTime90, 10L);
        org.joda.time.DateTimeField dateTimeField93 = islamicChronology66.secondOfDay();
        org.joda.time.DateTimeField dateTimeField94 = islamicChronology66.era();
        org.joda.time.DateTimeField dateTimeField95 = islamicChronology66.centuryOfEra();
        org.joda.time.DurationField durationField96 = islamicChronology66.halfdays();
        org.joda.time.Chronology chronology97 = islamicChronology66.withUTC();
        org.joda.time.DurationField durationField98 = islamicChronology66.millis();
        boolean boolean99 = strSet61.remove((java.lang.Object) islamicChronology66);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField45 and durationField68", (durationField45.compareTo(durationField68) == 0) == durationField45.equals(durationField68));
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test648");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        java.lang.String str3 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology4 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField5 = islamicChronology4.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology4.millisOfSecond();
        int int8 = dateTimeField6.getMaximumValue((long) 53);
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((long) 1);
        int int11 = localDateTime10.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime10.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology16 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone15);
        org.joda.time.DateTime dateTime17 = localDateTime10.toDateTime(dateTimeZone15);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology21 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone20);
        org.joda.time.DateTimeField dateTimeField22 = islamicChronology21.weekyear();
        org.joda.time.ReadablePartial readablePartial23 = null;
        int[] intArray30 = new int[] { (short) 100, 10, 100, (short) -1, (byte) 10 };
        int[] intArray32 = dateTimeField22.addWrapPartial(readablePartial23, 100, intArray30, (int) (short) 0);
        int int34 = dateTimeField22.getMinimumValue((long) (short) 0);
        org.joda.time.LocalDateTime localDateTime36 = new org.joda.time.LocalDateTime((long) 1);
        int int37 = localDateTime36.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime39 = localDateTime36.withYear((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod40 = null;
        org.joda.time.LocalDateTime localDateTime42 = localDateTime39.withPeriodAdded(readablePeriod40, 10);
        org.joda.time.LocalDateTime localDateTime44 = localDateTime39.plusSeconds((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology47 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone46);
        org.joda.time.DateTimeField dateTimeField48 = islamicChronology47.weekyear();
        org.joda.time.ReadablePartial readablePartial49 = null;
        int[] intArray56 = new int[] { (short) 100, 10, 100, (short) -1, (byte) 10 };
        int[] intArray58 = dateTimeField48.addWrapPartial(readablePartial49, 100, intArray56, (int) (short) 0);
        int int59 = dateTimeField22.getMaximumValue((org.joda.time.ReadablePartial) localDateTime44, intArray58);
        org.joda.time.DateTimeZone dateTimeZone62 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology63 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone62);
        org.joda.time.DateTimeField dateTimeField64 = islamicChronology63.yearOfCentury();
        org.joda.time.DurationField durationField65 = islamicChronology63.years();
        org.joda.time.DurationField durationField66 = islamicChronology63.halfdays();
        org.joda.time.DateTimeField dateTimeField67 = islamicChronology63.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField68 = islamicChronology63.secondOfMinute();
        java.util.Locale locale70 = java.util.Locale.TAIWAN;
        boolean boolean71 = locale70.hasExtensions();
        java.util.Locale locale72 = locale70.stripExtensions();
        java.lang.String str73 = locale70.getDisplayCountry();
        java.util.Set<java.lang.String> strSet74 = locale70.getUnicodeLocaleKeys();
        java.util.Set<java.lang.String> strSet75 = locale70.getUnicodeLocaleAttributes();
        java.lang.String str76 = dateTimeField68.getAsShortText(1592092800070L, locale70);
        java.util.Set<java.lang.String> strSet77 = locale70.getUnicodeLocaleKeys();
        java.lang.String str78 = dateTimeField22.getAsText(86399999, locale70);
        java.lang.String str79 = locale70.getDisplayName();
        java.lang.String str80 = dateTimeField6.getAsText((org.joda.time.ReadablePartial) localDateTime10, 7, locale70);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField65", (durationField5.compareTo(durationField65) == 0) == durationField5.equals(durationField65));
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test649");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        boolean boolean3 = dateTimeZone1.isFixed();
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((long) 1);
        int int6 = localDateTime5.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology11 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone10);
        org.joda.time.DateTime dateTime12 = localDateTime5.toDateTime(dateTimeZone10);
        org.joda.time.ReadableInstant readableInstant13 = null;
        boolean boolean14 = dateTime12.isAfter(readableInstant13);
        org.joda.time.Instant instant15 = dateTime12.toInstant();
        java.lang.String str16 = dateTime12.toString();
        int int17 = dateTimeZone1.getOffset((org.joda.time.ReadableInstant) dateTime12);
        long long18 = dateTime12.getMillis();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology21 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone20);
        java.lang.String str22 = dateTimeZone20.toString();
        long long24 = dateTimeZone20.nextTransition((long) 1);
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType25 = org.joda.time.chrono.IslamicChronology.LEAP_YEAR_INDIAN;
        org.joda.time.chrono.IslamicChronology islamicChronology26 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone20, leapYearPatternType25);
        org.joda.time.DurationField durationField27 = islamicChronology26.months();
        org.joda.time.DateTimeField dateTimeField28 = islamicChronology26.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField29 = islamicChronology26.dayOfWeek();
        boolean boolean30 = dateTime12.equals((java.lang.Object) islamicChronology26);
        org.joda.time.DateTimeZone dateTimeZone31 = dateTime12.getZone();
        int int33 = dateTimeZone31.getOffsetFromLocal((long) 7200098);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime12 and instant15", (dateTime12.compareTo(instant15) == 0) == dateTime12.equals(instant15));
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test650");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        int int2 = localDateTime1.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.minusHours((int) (byte) -1);
        int int5 = localDateTime1.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.minusMinutes((int) '#');
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.centuryOfEra();
        java.lang.String str9 = localDateTime7.toString();
        int int10 = localDateTime7.getWeekOfWeekyear();
        org.joda.time.LocalDateTime.Property property11 = localDateTime7.era();
        int int12 = localDateTime7.getDayOfWeek();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime7.minusDays((-1000));
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.year();
        org.joda.time.LocalDateTime.Property property16 = localDateTime14.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology19 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone18);
        org.joda.time.DateTimeField dateTimeField20 = islamicChronology19.weekyear();
        org.joda.time.DurationField durationField21 = islamicChronology19.years();
        org.joda.time.DateTimeField dateTimeField22 = islamicChronology19.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField23 = islamicChronology19.hourOfDay();
        org.joda.time.DateTimeField dateTimeField24 = islamicChronology19.weekOfWeekyear();
        org.joda.time.DurationField durationField25 = islamicChronology19.millis();
        org.joda.time.DateTimeField dateTimeField26 = islamicChronology19.clockhourOfHalfday();
        java.util.TimeZone timeZone29 = java.util.TimeZone.getTimeZone("");
        int int31 = timeZone29.getOffset((long) 100);
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forTimeZone(timeZone29);
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime((java.lang.Object) "0099-01-01T01:00:00.001", dateTimeZone32);
        org.joda.time.LocalDateTime localDateTime35 = localDateTime33.withMonthOfYear(5);
        java.util.Locale locale37 = new java.util.Locale("");
        java.lang.String str38 = locale37.getVariant();
        java.lang.String str39 = locale37.getISO3Country();
        java.lang.String str40 = locale37.getDisplayName();
        java.lang.String str41 = dateTimeField26.getAsText((org.joda.time.ReadablePartial) localDateTime35, locale37);
        boolean boolean42 = property16.equals((java.lang.Object) dateTimeField26);
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology45 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone44);
        org.joda.time.DurationField durationField46 = islamicChronology45.weekyears();
        org.joda.time.DurationField durationField47 = islamicChronology45.halfdays();
        org.joda.time.DateTimeField dateTimeField48 = islamicChronology45.era();
        org.joda.time.DateTimeField dateTimeField49 = islamicChronology45.secondOfMinute();
        java.util.Locale locale51 = java.util.Locale.TAIWAN;
        java.lang.String str52 = dateTimeField49.getAsText(17763840000100L, locale51);
        int int53 = property16.getMaximumShortTextLength(locale51);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField21 and durationField46", (durationField21.compareTo(durationField46) == 0) == durationField21.equals(durationField46));
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test651");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 1);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology5 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone4);
        org.joda.time.DurationField durationField6 = islamicChronology5.weekyears();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology5.yearOfEra();
        org.joda.time.DurationField durationField8 = islamicChronology5.hours();
        org.joda.time.DurationField durationField9 = islamicChronology5.halfdays();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType10 = islamicChronology5.getLeapYearPatternType();
        org.joda.time.chrono.IslamicChronology islamicChronology11 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1, leapYearPatternType10);
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((long) 1);
        int int14 = localDateTime13.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime13.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology19 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone18);
        org.joda.time.DateTime dateTime20 = localDateTime13.toDateTime(dateTimeZone18);
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime((long) 1);
        int int23 = localDateTime22.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime25 = localDateTime22.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology28 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone27);
        org.joda.time.DateTime dateTime29 = localDateTime22.toDateTime(dateTimeZone27);
        long long30 = dateTime29.getMillis();
        boolean boolean31 = dateTime20.isAfter((org.joda.time.ReadableInstant) dateTime29);
        long long32 = dateTime29.getMillis();
        org.joda.time.Instant instant33 = dateTime29.toInstant();
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology36 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone35);
        boolean boolean38 = dateTimeZone35.equals((java.lang.Object) 10L);
        java.util.Locale locale40 = java.util.Locale.JAPAN;
        java.lang.String str41 = locale40.getISO3Country();
        java.lang.String str42 = dateTimeZone35.getShortName(1970L, locale40);
        java.util.TimeZone timeZone43 = dateTimeZone35.toTimeZone();
        long long46 = dateTimeZone35.convertLocalToUTC(2626841168L, false);
        boolean boolean47 = instant33.equals((java.lang.Object) false);
        org.joda.time.DateTimeZone dateTimeZone48 = instant33.getZone();
        int int49 = dateTimeZone1.getOffset((org.joda.time.ReadableInstant) instant33);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime20 and instant33", (dateTime20.compareTo(instant33) == 0) == dateTime20.equals(instant33));
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test652");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DurationField durationField4 = islamicChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.yearOfEra();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology2.era();
        org.joda.time.DurationField durationField7 = islamicChronology2.years();
        org.joda.time.DurationField durationField8 = islamicChronology2.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField7", (durationField3.compareTo(durationField7) == 0) == durationField3.equals(durationField7));
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test653");
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(100, (int) (short) 10, (int) (short) 10, (int) (byte) 0, 0, (int) ' ');
        int int7 = localDateTime6.getMinuteOfHour();
        org.joda.time.LocalDateTime.Property property8 = localDateTime6.hourOfDay();
        org.joda.time.LocalDateTime localDateTime9 = property8.getLocalDateTime();
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.dayOfYear();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime9.minusMonths(100);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology15 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone14);
        org.joda.time.DurationField durationField16 = islamicChronology15.weekyears();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology19 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone18);
        boolean boolean21 = dateTimeZone18.equals((java.lang.Object) 10L);
        org.joda.time.Chronology chronology22 = islamicChronology15.withZone(dateTimeZone18);
        org.joda.time.DateTimeField dateTimeField23 = islamicChronology15.hourOfHalfday();
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime((long) 1);
        int int26 = localDateTime25.getHourOfDay();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology29 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone28);
        org.joda.time.DateTimeField dateTimeField30 = islamicChronology29.weekyear();
        org.joda.time.ReadablePartial readablePartial31 = null;
        int[] intArray38 = new int[] { (short) 100, 10, 100, (short) -1, (byte) 10 };
        int[] intArray40 = dateTimeField30.addWrapPartial(readablePartial31, 100, intArray38, (int) (short) 0);
        int int41 = dateTimeField23.getMaximumValue((org.joda.time.ReadablePartial) localDateTime25, intArray38);
        org.joda.time.LocalDateTime localDateTime43 = new org.joda.time.LocalDateTime((long) 1);
        int int44 = localDateTime43.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime46 = localDateTime43.minusHours((int) (byte) -1);
        int int48 = localDateTime43.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime50 = localDateTime43.withMillisOfSecond((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime51 = localDateTime25.withFields((org.joda.time.ReadablePartial) localDateTime50);
        int int52 = localDateTime50.getYearOfCentury();
        org.joda.time.LocalDateTime localDateTime54 = localDateTime50.minusHours((-1));
        org.joda.time.LocalDateTime.Property property55 = localDateTime54.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone57 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology58 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone57);
        org.joda.time.DurationField durationField59 = islamicChronology58.weekyears();
        org.joda.time.DateTimeField dateTimeField60 = islamicChronology58.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone61 = islamicChronology58.getZone();
        int int63 = dateTimeZone61.getOffsetFromLocal(19800L);
        long long66 = dateTimeZone61.adjustOffset((long) 11, false);
        long long68 = dateTimeZone61.convertUTCToLocal(0L);
        int int70 = dateTimeZone61.getOffsetFromLocal((long) 2922711);
        org.joda.time.DateTime dateTime71 = localDateTime54.toDateTime(dateTimeZone61);
        org.joda.time.Instant instant72 = dateTime71.toInstant();
        org.joda.time.Instant instant73 = dateTime71.toInstant();
        org.joda.time.DateTime dateTime74 = localDateTime12.toDateTime((org.joda.time.ReadableInstant) instant73);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime71 and instant72", (dateTime71.compareTo(instant72) == 0) == dateTime71.equals(instant72));
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test654");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology2.weekyear();
        org.joda.time.DurationField durationField4 = islamicChronology2.years();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone6 = islamicChronology2.getZone();
        org.joda.time.DurationField durationField7 = islamicChronology2.weekyears();
        org.joda.time.DurationField durationField8 = islamicChronology2.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField7", (durationField4.compareTo(durationField7) == 0) == durationField4.equals(durationField7));
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test655");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        int int2 = localDateTime1.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology7 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone6);
        org.joda.time.DateTime dateTime8 = localDateTime1.toDateTime(dateTimeZone6);
        long long9 = dateTime8.getMillis();
        long long10 = dateTime8.getMillis();
        org.joda.time.Instant instant11 = dateTime8.toInstant();
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((long) 1);
        int int14 = localDateTime13.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime13.minusHours((int) (byte) -1);
        org.joda.time.DateTimeField[] dateTimeFieldArray17 = localDateTime16.getFields();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.minusDays(4);
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime((long) 1);
        int int22 = localDateTime21.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime24 = localDateTime21.minusHours((int) (byte) -1);
        int int26 = localDateTime21.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime21.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        org.joda.time.LocalDateTime localDateTime30 = localDateTime21.minus(readablePeriod29);
        int int31 = localDateTime30.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField33 = localDateTime30.getField(0);
        org.joda.time.LocalDateTime.Property property34 = localDateTime30.centuryOfEra();
        org.joda.time.LocalDateTime.Property property35 = localDateTime30.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime40 = localDateTime30.withTime((int) (byte) 1, 0, 5, (int) (byte) 100);
        boolean boolean41 = localDateTime16.isBefore((org.joda.time.ReadablePartial) localDateTime40);
        org.joda.time.LocalDateTime.Property property42 = localDateTime40.weekyear();
        int int43 = property42.getLeapAmount();
        org.joda.time.LocalDateTime localDateTime45 = property42.addWrapFieldToCopy(45);
        org.joda.time.LocalDateTime localDateTime47 = new org.joda.time.LocalDateTime((long) 1);
        int int48 = localDateTime47.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime50 = localDateTime47.withYear((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod51 = null;
        org.joda.time.LocalDateTime localDateTime53 = localDateTime50.withPeriodAdded(readablePeriod51, 10);
        org.joda.time.LocalDateTime localDateTime55 = localDateTime53.withDayOfYear(11);
        org.joda.time.LocalDateTime localDateTime57 = localDateTime55.withYear(10);
        org.joda.time.DateTime dateTime58 = localDateTime55.toDateTime();
        long long59 = dateTime58.getMillis();
        int int60 = property42.compareTo((org.joda.time.ReadableInstant) dateTime58);
        org.joda.time.DateTimeZone dateTimeZone61 = dateTime58.getZone();
        boolean boolean62 = instant11.isAfter((org.joda.time.ReadableInstant) dateTime58);
        long long63 = dateTime58.getMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and instant11", (dateTime8.compareTo(instant11) == 0) == dateTime8.equals(instant11));
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test656");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = islamicChronology2.years();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) 1);
        int int7 = localDateTime6.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.minusHours((int) (byte) -1);
        int int11 = localDateTime6.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime6.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalDateTime localDateTime15 = localDateTime6.minus(readablePeriod14);
        int int16 = localDateTime15.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField18 = localDateTime15.getField(0);
        org.joda.time.LocalDateTime.Property property19 = localDateTime15.centuryOfEra();
        int[] intArray21 = islamicChronology2.get((org.joda.time.ReadablePartial) localDateTime15, (long) 0);
        org.joda.time.DateTimeField dateTimeField22 = islamicChronology2.millisOfDay();
        org.joda.time.DurationField durationField23 = islamicChronology2.centuries();
        org.joda.time.DateTimeField dateTimeField24 = islamicChronology2.year();
        org.joda.time.DurationField durationField25 = islamicChronology2.millis();
        org.joda.time.DateTimeField dateTimeField26 = islamicChronology2.year();
        org.joda.time.DurationField durationField27 = islamicChronology2.days();
        org.joda.time.DateTimeField dateTimeField28 = islamicChronology2.minuteOfDay();
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime((long) (byte) -1);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime30.minusDays(12);
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology35 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone34);
        org.joda.time.DurationField durationField36 = islamicChronology35.weekyears();
        org.joda.time.DurationField durationField37 = islamicChronology35.halfdays();
        org.joda.time.DateTimeField dateTimeField38 = islamicChronology35.yearOfEra();
        org.joda.time.DurationField durationField39 = islamicChronology35.halfdays();
        org.joda.time.DurationFieldType durationFieldType40 = durationField39.getType();
        org.joda.time.LocalDateTime localDateTime42 = localDateTime30.withFieldAdded(durationFieldType40, (int) '#');
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology45 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone44);
        org.joda.time.DurationField durationField46 = islamicChronology45.weekyears();
        org.joda.time.DurationField durationField47 = islamicChronology45.halfdays();
        org.joda.time.DurationField durationField48 = islamicChronology45.weeks();
        org.joda.time.DateTimeField dateTimeField49 = islamicChronology45.yearOfEra();
        org.joda.time.LocalDateTime localDateTime51 = new org.joda.time.LocalDateTime((long) 1);
        int int52 = localDateTime51.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime54 = localDateTime51.minusHours((int) (byte) -1);
        org.joda.time.DateTimeField[] dateTimeFieldArray55 = localDateTime54.getFields();
        java.util.Locale locale56 = java.util.Locale.KOREA;
        java.util.Locale locale57 = java.util.Locale.KOREA;
        java.lang.String str58 = locale56.getDisplayLanguage(locale57);
        java.lang.String str59 = dateTimeField49.getAsText((org.joda.time.ReadablePartial) localDateTime54, locale56);
        org.joda.time.DateTimeFieldType dateTimeFieldType60 = dateTimeField49.getType();
        org.joda.time.LocalDateTime.Property property61 = localDateTime42.property(dateTimeFieldType60);
        int int62 = localDateTime42.getDayOfMonth();
        org.joda.time.ReadableDuration readableDuration63 = null;
        org.joda.time.LocalDateTime localDateTime65 = localDateTime42.withDurationAdded(readableDuration63, 69);
        org.joda.time.LocalDateTime localDateTime67 = localDateTime65.withCenturyOfEra((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone70 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology71 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone70);
        org.joda.time.DurationField durationField72 = islamicChronology71.weekyears();
        org.joda.time.DateTimeField dateTimeField73 = islamicChronology71.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField74 = islamicChronology71.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField75 = islamicChronology71.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone76 = islamicChronology71.getZone();
        org.joda.time.LocalDateTime localDateTime77 = new org.joda.time.LocalDateTime((long) 365, dateTimeZone76);
        int int78 = localDateTime65.compareTo((org.joda.time.ReadablePartial) localDateTime77);
        org.joda.time.LocalDateTime localDateTime80 = localDateTime77.plusHours(405);
        org.joda.time.DateTimeZone dateTimeZone82 = org.joda.time.DateTimeZone.forOffsetHours(70);
        java.util.Locale.Category category84 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale85 = java.util.Locale.KOREA;
        java.util.Locale locale86 = java.util.Locale.KOREA;
        java.lang.String str87 = locale85.getDisplayLanguage(locale86);
        java.util.Locale.setDefault(locale85);
        java.util.Locale.setDefault(category84, locale85);
        java.util.Locale locale91 = new java.util.Locale("weekOfWeekyear");
        java.util.Locale.setDefault(category84, locale91);
        java.util.Set<java.lang.Character> charSet93 = locale91.getExtensionKeys();
        java.lang.String str94 = dateTimeZone82.getShortName(2535110820284400000L, locale91);
        java.lang.String str95 = dateTimeField28.getAsText((org.joda.time.ReadablePartial) localDateTime77, locale91);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField36", (durationField4.compareTo(durationField36) == 0) == durationField4.equals(durationField36));
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test657");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        int int3 = islamicChronology2.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology2.weekyear();
        org.joda.time.DurationField durationField5 = islamicChronology2.hours();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((long) 1);
        int int8 = localDateTime7.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime7.minusHours((int) (byte) -1);
        org.joda.time.DateTimeField[] dateTimeFieldArray11 = localDateTime10.getFields();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime10.minusDays(4);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology16 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField17 = islamicChronology16.yearOfCentury();
        org.joda.time.DurationField durationField18 = islamicChronology16.years();
        org.joda.time.DurationField durationField19 = islamicChronology16.halfdays();
        org.joda.time.DateTimeField dateTimeField20 = islamicChronology16.hourOfHalfday();
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime((long) 1);
        int int23 = localDateTime22.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime25 = localDateTime22.minusHours((int) (byte) -1);
        int int26 = localDateTime22.getSecondOfMinute();
        int[] intArray33 = new int[] { 292278993, ' ', (short) 1, (short) -1, (byte) -1 };
        int[] intArray35 = dateTimeField20.set((org.joda.time.ReadablePartial) localDateTime22, (int) (byte) 0, intArray33, 10);
        islamicChronology2.validate((org.joda.time.ReadablePartial) localDateTime10, intArray35);
        org.joda.time.DurationField durationField37 = islamicChronology2.years();
        org.joda.time.DurationField durationField38 = islamicChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField39 = islamicChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField40 = islamicChronology2.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology44 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone43);
        org.joda.time.DurationField durationField45 = islamicChronology44.weekyears();
        org.joda.time.DateTimeField dateTimeField46 = islamicChronology44.yearOfEra();
        long long48 = dateTimeField46.roundCeiling(0L);
        java.util.Locale locale50 = java.util.Locale.GERMAN;
        java.util.Locale locale51 = java.util.Locale.JAPAN;
        java.lang.String str52 = locale51.getISO3Country();
        java.lang.String str53 = locale50.getDisplayCountry(locale51);
        java.lang.String str54 = dateTimeField46.getAsShortText(355, locale51);
        java.util.Locale locale55 = java.util.Locale.ENGLISH;
        java.lang.String str56 = locale55.getDisplayLanguage();
        org.joda.time.tz.NameProvider nameProvider57 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale58 = java.util.Locale.getDefault();
        java.lang.String str61 = nameProvider57.getName(locale58, "JPN", "0");
        java.lang.String str62 = locale55.getDisplayName(locale58);
        java.lang.String str63 = locale51.getDisplayScript(locale55);
        java.lang.String str64 = locale55.getDisplayName();
        java.lang.String str65 = locale55.getDisplayVariant();
        java.lang.String str66 = dateTimeField40.getAsText(6747, locale55);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField18 and durationField45", (durationField18.compareTo(durationField45) == 0) == durationField18.equals(durationField45));
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test658");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DurationField durationField4 = islamicChronology2.months();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.minuteOfHour();
        org.joda.time.DurationField durationField6 = islamicChronology2.hours();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology2.hourOfHalfday();
        org.joda.time.DurationField durationField8 = islamicChronology2.centuries();
        java.lang.String str9 = islamicChronology2.toString();
        org.joda.time.DurationField durationField10 = islamicChronology2.halfdays();
        org.joda.time.Chronology chronology11 = islamicChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology2.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField13 = islamicChronology2.centuryOfEra();
        org.joda.time.DurationField durationField14 = islamicChronology2.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField14, durationField3, and durationField4", !(durationField14.compareTo(durationField3) == 0) || (Math.signum(durationField14.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test659");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology2.weekyear();
        org.joda.time.DurationField durationField4 = islamicChronology2.years();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology2.hourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology2.clockhourOfDay();
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((long) 1);
        int int11 = localDateTime10.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime10.minusHours((int) (byte) -1);
        org.joda.time.DateTimeField[] dateTimeFieldArray14 = localDateTime13.getFields();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime13.minusDays(4);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.minus(readablePeriod17);
        int int19 = localDateTime18.getYearOfCentury();
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime((long) 1);
        int int22 = localDateTime21.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime24 = localDateTime21.minusHours((int) (byte) -1);
        int int25 = localDateTime21.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime27 = localDateTime21.minusMinutes((int) '#');
        org.joda.time.LocalDateTime localDateTime29 = localDateTime21.plusMonths((-1));
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime((long) 1);
        int int32 = localDateTime31.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime34 = localDateTime31.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology37 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone36);
        org.joda.time.DurationField durationField38 = islamicChronology37.weekyears();
        org.joda.time.DurationField durationField39 = islamicChronology37.halfdays();
        org.joda.time.DateTimeField dateTimeField40 = islamicChronology37.yearOfEra();
        org.joda.time.DurationField durationField41 = islamicChronology37.halfdays();
        org.joda.time.DurationFieldType durationFieldType42 = durationField41.getType();
        boolean boolean43 = localDateTime31.isSupported(durationFieldType42);
        org.joda.time.LocalDateTime localDateTime45 = localDateTime21.withFieldAdded(durationFieldType42, 12);
        boolean boolean46 = localDateTime18.isSupported(durationFieldType42);
        org.joda.time.LocalDateTime.Property property47 = localDateTime18.hourOfDay();
        int int48 = property47.getMaximumValueOverall();
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology51 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone50);
        org.joda.time.DurationField durationField52 = islamicChronology51.weekyears();
        org.joda.time.DateTimeField dateTimeField53 = islamicChronology51.yearOfEra();
        long long55 = dateTimeField53.roundCeiling(0L);
        java.util.Locale locale57 = java.util.Locale.GERMAN;
        java.util.Locale locale58 = java.util.Locale.JAPAN;
        java.lang.String str59 = locale58.getISO3Country();
        java.lang.String str60 = locale57.getDisplayCountry(locale58);
        java.lang.String str61 = dateTimeField53.getAsShortText(355, locale58);
        java.util.Locale locale62 = java.util.Locale.ENGLISH;
        java.lang.String str63 = locale62.getDisplayLanguage();
        org.joda.time.tz.NameProvider nameProvider64 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale65 = java.util.Locale.getDefault();
        java.lang.String str68 = nameProvider64.getName(locale65, "JPN", "0");
        java.lang.String str69 = locale62.getDisplayName(locale65);
        java.lang.String str70 = locale58.getDisplayScript(locale62);
        int int71 = property47.getMaximumTextLength(locale62);
        java.lang.String str72 = dateTimeField7.getAsText((-913574), locale62);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField38", (durationField4.compareTo(durationField38) == 0) == durationField4.equals(durationField38));
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test660");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology2.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone5 = islamicChronology2.getZone();
        int int7 = dateTimeZone5.getOffsetFromLocal(19800L);
        long long10 = dateTimeZone5.adjustOffset((long) 11, false);
        java.util.Locale locale12 = java.util.Locale.KOREA;
        java.util.Locale locale13 = java.util.Locale.KOREA;
        java.lang.String str14 = locale12.getDisplayLanguage(locale13);
        java.lang.String str15 = locale13.getISO3Country();
        java.lang.String str16 = dateTimeZone5.getName((long) (short) 0, locale13);
        java.lang.String str17 = dateTimeZone5.toString();
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime((long) 1);
        int int20 = localDateTime19.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime22 = localDateTime19.minusHours((int) (byte) -1);
        int int24 = localDateTime19.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime19.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        org.joda.time.LocalDateTime localDateTime28 = localDateTime19.minus(readablePeriod27);
        org.joda.time.LocalDateTime.Property property29 = localDateTime19.millisOfSecond();
        long long30 = property29.remainder();
        java.lang.String str31 = property29.getName();
        java.util.Locale locale32 = java.util.Locale.CHINA;
        java.lang.String str33 = property29.getAsText(locale32);
        org.joda.time.LocalDateTime localDateTime34 = property29.withMinimumValue();
        org.joda.time.LocalDateTime localDateTime36 = localDateTime34.plusYears(4);
        org.joda.time.ReadablePeriod readablePeriod37 = null;
        org.joda.time.LocalDateTime localDateTime38 = localDateTime36.plus(readablePeriod37);
        org.joda.time.ReadablePeriod readablePeriod39 = null;
        org.joda.time.LocalDateTime localDateTime41 = localDateTime36.withPeriodAdded(readablePeriod39, 45);
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology44 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone43);
        boolean boolean46 = dateTimeZone43.equals((java.lang.Object) 10L);
        java.lang.String str48 = dateTimeZone43.getName((long) '#');
        org.joda.time.LocalDateTime localDateTime49 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime36, dateTimeZone43);
        int int51 = dateTimeZone43.getOffsetFromLocal(306172802880L);
        java.lang.String str53 = dateTimeZone43.getNameKey((long) 100);
        long long55 = dateTimeZone5.getMillisKeepLocal(dateTimeZone43, 232084826700001L);
        org.joda.time.DateTimeZone dateTimeZone57 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology58 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone57);
        org.joda.time.DateTimeField dateTimeField59 = islamicChronology58.yearOfCentury();
        org.joda.time.DurationField durationField60 = islamicChronology58.years();
        org.joda.time.LocalDateTime localDateTime62 = new org.joda.time.LocalDateTime((long) 1);
        int int63 = localDateTime62.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime65 = localDateTime62.minusHours((int) (byte) -1);
        int int67 = localDateTime62.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime69 = localDateTime62.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod70 = null;
        org.joda.time.LocalDateTime localDateTime71 = localDateTime62.minus(readablePeriod70);
        int int72 = localDateTime71.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField74 = localDateTime71.getField(0);
        org.joda.time.LocalDateTime.Property property75 = localDateTime71.centuryOfEra();
        int[] intArray77 = islamicChronology58.get((org.joda.time.ReadablePartial) localDateTime71, (long) 0);
        org.joda.time.DateTimeField dateTimeField78 = islamicChronology58.hourOfDay();
        org.joda.time.DateTimeField dateTimeField79 = islamicChronology58.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField80 = islamicChronology58.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField81 = islamicChronology58.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone82 = islamicChronology58.getZone();
        long long84 = dateTimeZone5.getMillisKeepLocal(dateTimeZone82, (long) 'x');
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField60", (durationField3.compareTo(durationField60) == 0) == durationField3.equals(durationField60));
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test661");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology2.yearOfEra();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology2.minuteOfDay();
        org.joda.time.DurationField durationField7 = islamicChronology2.eras();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology2.centuryOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField7", Math.signum(durationField3.compareTo(durationField7)) == -Math.signum(durationField7.compareTo(durationField3)));
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test662");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology6 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone5);
        boolean boolean8 = dateTimeZone5.equals((java.lang.Object) 10L);
        org.joda.time.Chronology chronology9 = islamicChronology2.withZone(dateTimeZone5);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        long long13 = islamicChronology2.add(readablePeriod10, (long) (byte) 0, (-1));
        org.joda.time.DateTimeField dateTimeField14 = islamicChronology2.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField15 = islamicChronology2.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField16 = islamicChronology2.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField17 = islamicChronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField18 = islamicChronology2.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology21 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone20);
        java.lang.String str22 = dateTimeZone20.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology23 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone20);
        org.joda.time.DateTimeField dateTimeField24 = islamicChronology23.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField25 = islamicChronology23.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField26 = islamicChronology23.secondOfDay();
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime((long) 1);
        int int29 = localDateTime28.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime31 = localDateTime28.withYear((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod32 = null;
        org.joda.time.LocalDateTime localDateTime34 = localDateTime31.withPeriodAdded(readablePeriod32, 10);
        int int35 = localDateTime31.getMinuteOfHour();
        int int36 = localDateTime31.getSecondOfMinute();
        org.joda.time.DateTimeField[] dateTimeFieldArray37 = localDateTime31.getFields();
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology40 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone39);
        org.joda.time.DateTimeField dateTimeField41 = islamicChronology40.yearOfCentury();
        org.joda.time.DurationField durationField42 = islamicChronology40.years();
        org.joda.time.LocalDateTime localDateTime44 = new org.joda.time.LocalDateTime((long) 1);
        int int45 = localDateTime44.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime47 = localDateTime44.minusHours((int) (byte) -1);
        int int49 = localDateTime44.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime51 = localDateTime44.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod52 = null;
        org.joda.time.LocalDateTime localDateTime53 = localDateTime44.minus(readablePeriod52);
        int int54 = localDateTime53.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField56 = localDateTime53.getField(0);
        org.joda.time.LocalDateTime.Property property57 = localDateTime53.centuryOfEra();
        int[] intArray59 = islamicChronology40.get((org.joda.time.ReadablePartial) localDateTime53, (long) 0);
        org.joda.time.LocalDateTime localDateTime61 = localDateTime53.withMillisOfSecond(60);
        org.joda.time.LocalDateTime localDateTime63 = new org.joda.time.LocalDateTime((long) 1);
        int int64 = localDateTime63.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime66 = localDateTime63.minusHours((int) (byte) -1);
        int int67 = localDateTime63.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime69 = localDateTime63.withMinuteOfHour((int) (byte) 1);
        int int71 = localDateTime69.getValue(0);
        boolean boolean72 = localDateTime61.equals((java.lang.Object) 0);
        org.joda.time.LocalDateTime localDateTime74 = localDateTime61.minusYears(951);
        int[] intArray75 = localDateTime74.getValues();
        islamicChronology23.validate((org.joda.time.ReadablePartial) localDateTime31, intArray75);
        org.joda.time.LocalDateTime.Property property77 = localDateTime31.centuryOfEra();
        org.joda.time.LocalDateTime.Property property78 = localDateTime31.dayOfWeek();
        java.util.Locale locale82 = new java.util.Locale("8970-01-01T00:25:00.001", "+01:00", "8970-01-01T00:25:00.001");
        java.lang.String str83 = dateTimeField18.getAsShortText((org.joda.time.ReadablePartial) localDateTime31, locale82);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField42", (durationField3.compareTo(durationField42) == 0) == durationField3.equals(durationField42));
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test663");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = islamicChronology2.years();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) 1);
        int int7 = localDateTime6.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.minusHours((int) (byte) -1);
        int int11 = localDateTime6.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime6.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalDateTime localDateTime15 = localDateTime6.minus(readablePeriod14);
        int int16 = localDateTime15.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField18 = localDateTime15.getField(0);
        org.joda.time.LocalDateTime.Property property19 = localDateTime15.centuryOfEra();
        int[] intArray21 = islamicChronology2.get((org.joda.time.ReadablePartial) localDateTime15, (long) 0);
        org.joda.time.DateTimeField dateTimeField22 = islamicChronology2.millisOfDay();
        org.joda.time.DurationField durationField23 = islamicChronology2.centuries();
        org.joda.time.DateTimeZone dateTimeZone24 = islamicChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField25 = islamicChronology2.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime();
        int[] intArray28 = islamicChronology2.get((org.joda.time.ReadablePartial) localDateTime26, 10L);
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime31 = localDateTime29.minusMinutes(0);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime31.plusMinutes(100);
        boolean boolean34 = localDateTime26.isEqual((org.joda.time.ReadablePartial) localDateTime31);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime26.plusWeeks(69);
        boolean boolean38 = localDateTime26.equals((java.lang.Object) 99);
        org.joda.time.LocalDateTime localDateTime40 = new org.joda.time.LocalDateTime((long) 1);
        int int41 = localDateTime40.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime43 = localDateTime40.minusHours((int) (byte) -1);
        int int45 = localDateTime40.getValue((int) (byte) 1);
        java.util.Locale locale47 = new java.util.Locale("");
        boolean boolean48 = localDateTime40.equals((java.lang.Object) "");
        org.joda.time.LocalDateTime localDateTime50 = localDateTime40.minusYears(349198);
        int int51 = localDateTime40.getWeekyear();
        int int52 = localDateTime40.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone54 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology55 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone54);
        org.joda.time.DurationField durationField56 = islamicChronology55.weekyears();
        org.joda.time.DateTimeField dateTimeField57 = islamicChronology55.millisOfSecond();
        long long61 = islamicChronology55.add((long) (byte) -1, (long) 0, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime63 = new org.joda.time.LocalDateTime((long) 1);
        int int64 = localDateTime63.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime66 = localDateTime63.minusHours((int) (byte) -1);
        int int68 = localDateTime63.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime70 = localDateTime63.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod71 = null;
        org.joda.time.LocalDateTime localDateTime72 = localDateTime63.minus(readablePeriod71);
        int int73 = localDateTime72.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField75 = localDateTime72.getField(0);
        org.joda.time.LocalDateTime.Property property76 = localDateTime72.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime78 = localDateTime72.withMonthOfYear((int) (short) 10);
        boolean boolean79 = islamicChronology55.equals((java.lang.Object) localDateTime72);
        org.joda.time.DateTimeField dateTimeField80 = islamicChronology55.weekOfWeekyear();
        org.joda.time.DurationField durationField81 = islamicChronology55.halfdays();
        org.joda.time.DurationField durationField82 = islamicChronology55.minutes();
        long long86 = islamicChronology55.add(43200010L, (long) 86399999, 387);
        org.joda.time.DurationField durationField87 = islamicChronology55.weeks();
        org.joda.time.DateTimeField dateTimeField88 = islamicChronology55.clockhourOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType89 = dateTimeField88.getType();
        int int90 = localDateTime40.get(dateTimeFieldType89);
        int int91 = localDateTime26.indexOf(dateTimeFieldType89);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField56", (durationField4.compareTo(durationField56) == 0) == durationField4.equals(durationField56));
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test664");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone2);
        org.joda.time.DurationField durationField4 = islamicChronology3.weekyears();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology3.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone6 = islamicChronology3.getZone();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology3.millisOfSecond();
        org.joda.time.DurationField durationField8 = islamicChronology3.seconds();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology3.secondOfDay();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        long long13 = islamicChronology3.add(readablePeriod10, 5616L, 53);
        org.joda.time.DurationField durationField14 = islamicChronology3.weekyears();
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((long) 365, (org.joda.time.Chronology) islamicChronology3);
        org.joda.time.DateTimeField dateTimeField16 = islamicChronology3.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone17 = islamicChronology3.getZone();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology20 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone19);
        org.joda.time.DateTimeField dateTimeField21 = islamicChronology20.yearOfCentury();
        org.joda.time.DurationField durationField22 = islamicChronology20.years();
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime((long) 1);
        int int25 = localDateTime24.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime27 = localDateTime24.minusHours((int) (byte) -1);
        int int29 = localDateTime24.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime24.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod32 = null;
        org.joda.time.LocalDateTime localDateTime33 = localDateTime24.minus(readablePeriod32);
        int int34 = localDateTime33.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField36 = localDateTime33.getField(0);
        org.joda.time.LocalDateTime.Property property37 = localDateTime33.centuryOfEra();
        int[] intArray39 = islamicChronology20.get((org.joda.time.ReadablePartial) localDateTime33, (long) 0);
        org.joda.time.DateTimeField dateTimeField40 = islamicChronology20.millisOfDay();
        org.joda.time.DurationField durationField41 = islamicChronology20.centuries();
        org.joda.time.DateTimeField dateTimeField42 = islamicChronology20.year();
        org.joda.time.DurationField durationField43 = islamicChronology20.millis();
        org.joda.time.DateTimeField dateTimeField44 = islamicChronology20.year();
        org.joda.time.DateTimeField dateTimeField45 = islamicChronology20.minuteOfHour();
        org.joda.time.DurationField durationField46 = islamicChronology20.centuries();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType47 = islamicChronology20.getLeapYearPatternType();
        org.joda.time.chrono.IslamicChronology islamicChronology48 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone17, leapYearPatternType47);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField22", (durationField4.compareTo(durationField22) == 0) == durationField4.equals(durationField22));
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test665");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DurationField durationField4 = islamicChronology2.months();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology8 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone7);
        org.joda.time.DurationField durationField9 = islamicChronology8.weekyears();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology12 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone11);
        boolean boolean14 = dateTimeZone11.equals((java.lang.Object) 10L);
        org.joda.time.Chronology chronology15 = islamicChronology8.withZone(dateTimeZone11);
        org.joda.time.DateTimeField dateTimeField16 = islamicChronology8.hourOfHalfday();
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime((long) 1);
        int int19 = localDateTime18.getHourOfDay();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology22 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone21);
        org.joda.time.DateTimeField dateTimeField23 = islamicChronology22.weekyear();
        org.joda.time.ReadablePartial readablePartial24 = null;
        int[] intArray31 = new int[] { (short) 100, 10, 100, (short) -1, (byte) 10 };
        int[] intArray33 = dateTimeField23.addWrapPartial(readablePartial24, 100, intArray31, (int) (short) 0);
        int int34 = dateTimeField16.getMaximumValue((org.joda.time.ReadablePartial) localDateTime18, intArray31);
        org.joda.time.LocalDateTime localDateTime36 = new org.joda.time.LocalDateTime((long) 1);
        int int37 = localDateTime36.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime39 = localDateTime36.minusHours((int) (byte) -1);
        int int41 = localDateTime36.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime43 = localDateTime36.withMillisOfSecond((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime44 = localDateTime18.withFields((org.joda.time.ReadablePartial) localDateTime43);
        int int45 = dateTimeField5.getMinimumValue((org.joda.time.ReadablePartial) localDateTime44);
        org.joda.time.LocalDateTime localDateTime47 = new org.joda.time.LocalDateTime((long) 1);
        int int48 = localDateTime47.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime50 = localDateTime47.minusHours((int) (byte) -1);
        org.joda.time.DateTimeField[] dateTimeFieldArray51 = localDateTime50.getFields();
        java.util.Locale locale52 = java.util.Locale.GERMAN;
        java.util.Locale locale53 = java.util.Locale.JAPAN;
        java.lang.String str54 = locale53.getISO3Country();
        java.lang.String str55 = locale52.getDisplayCountry(locale53);
        java.lang.String str56 = dateTimeField5.getAsShortText((org.joda.time.ReadablePartial) localDateTime50, locale52);
        org.joda.time.LocalDateTime localDateTime58 = localDateTime50.minusDays(292278993);
        org.joda.time.LocalDateTime.Property property59 = localDateTime50.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime61 = new org.joda.time.LocalDateTime((long) 1);
        int int62 = localDateTime61.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime64 = localDateTime61.minusHours((int) (byte) -1);
        int int65 = localDateTime61.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime67 = localDateTime61.withMinuteOfHour((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime69 = localDateTime61.plusHours((int) (byte) 100);
        java.util.Date date70 = localDateTime69.toDate();
        org.joda.time.DateTime dateTime71 = localDateTime69.toDateTime();
        org.joda.time.Instant instant72 = dateTime71.toInstant();
        org.joda.time.LocalDateTime localDateTime74 = new org.joda.time.LocalDateTime((long) 1);
        int int75 = localDateTime74.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime77 = localDateTime74.minusHours((int) (byte) -1);
        int int78 = localDateTime74.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime80 = localDateTime74.withMinuteOfHour((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime82 = localDateTime74.plusHours((int) (byte) 100);
        java.util.Date date83 = localDateTime82.toDate();
        org.joda.time.DateTime dateTime84 = localDateTime82.toDateTime();
        int int85 = dateTime71.compareTo((org.joda.time.ReadableInstant) dateTime84);
        int int86 = property59.compareTo((org.joda.time.ReadableInstant) dateTime71);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant72 and dateTime84", (instant72.compareTo(dateTime84) == 0) == instant72.equals(dateTime84));
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test666");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(29);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology5 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology5.yearOfCentury();
        org.joda.time.DurationField durationField7 = islamicChronology5.years();
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime((long) 1);
        int int10 = localDateTime9.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime9.minusHours((int) (byte) -1);
        int int14 = localDateTime9.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime9.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.LocalDateTime localDateTime18 = localDateTime9.minus(readablePeriod17);
        int int19 = localDateTime18.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField21 = localDateTime18.getField(0);
        org.joda.time.LocalDateTime.Property property22 = localDateTime18.centuryOfEra();
        int[] intArray24 = islamicChronology5.get((org.joda.time.ReadablePartial) localDateTime18, (long) 0);
        org.joda.time.DateTimeField dateTimeField25 = islamicChronology5.millisOfDay();
        org.joda.time.DurationField durationField26 = islamicChronology5.centuries();
        org.joda.time.DateTimeZone dateTimeZone27 = islamicChronology5.getZone();
        org.joda.time.DateTimeField dateTimeField28 = islamicChronology5.dayOfWeek();
        org.joda.time.DurationField durationField29 = islamicChronology5.minutes();
        org.joda.time.DurationField durationField30 = islamicChronology5.years();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType31 = islamicChronology5.getLeapYearPatternType();
        org.joda.time.chrono.IslamicChronology islamicChronology32 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1, leapYearPatternType31);
        org.joda.time.DurationField durationField33 = islamicChronology32.years();
        org.joda.time.DateTimeField dateTimeField34 = islamicChronology32.secondOfMinute();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField7 and durationField33", (durationField7.compareTo(durationField33) == 0) == durationField7.equals(durationField33));
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test667");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = islamicChronology2.years();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) 1);
        int int7 = localDateTime6.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.minusHours((int) (byte) -1);
        int int11 = localDateTime6.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime6.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalDateTime localDateTime15 = localDateTime6.minus(readablePeriod14);
        int int16 = localDateTime15.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField18 = localDateTime15.getField(0);
        org.joda.time.LocalDateTime.Property property19 = localDateTime15.centuryOfEra();
        int[] intArray21 = islamicChronology2.get((org.joda.time.ReadablePartial) localDateTime15, (long) 0);
        org.joda.time.DateTimeField dateTimeField22 = islamicChronology2.millisOfDay();
        org.joda.time.DurationField durationField23 = islamicChronology2.centuries();
        org.joda.time.DateTimeField dateTimeField24 = islamicChronology2.dayOfYear();
        org.joda.time.DateTimeField dateTimeField25 = islamicChronology2.clockhourOfDay();
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime((long) 1);
        int int28 = localDateTime27.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime30 = localDateTime27.minusHours((int) (byte) -1);
        int int31 = localDateTime27.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime33 = localDateTime27.minusMinutes((int) '#');
        org.joda.time.LocalDateTime.Property property34 = localDateTime33.centuryOfEra();
        java.lang.String str35 = property34.getAsShortText();
        org.joda.time.LocalDateTime localDateTime37 = property34.addToCopy((long) 70);
        org.joda.time.LocalDateTime localDateTime39 = localDateTime37.minusHours((int) (short) -1);
        org.joda.time.LocalDateTime localDateTime41 = new org.joda.time.LocalDateTime((long) (byte) -1);
        org.joda.time.LocalDateTime localDateTime43 = localDateTime41.minusDays(12);
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology46 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone45);
        org.joda.time.DurationField durationField47 = islamicChronology46.weekyears();
        org.joda.time.DurationField durationField48 = islamicChronology46.halfdays();
        org.joda.time.DateTimeField dateTimeField49 = islamicChronology46.yearOfEra();
        org.joda.time.DurationField durationField50 = islamicChronology46.halfdays();
        org.joda.time.DurationFieldType durationFieldType51 = durationField50.getType();
        org.joda.time.LocalDateTime localDateTime53 = localDateTime41.withFieldAdded(durationFieldType51, (int) '#');
        org.joda.time.LocalDateTime localDateTime55 = localDateTime37.withFieldAdded(durationFieldType51, 2922789);
        org.joda.time.LocalDateTime.Property property56 = localDateTime37.year();
        org.joda.time.LocalDateTime localDateTime58 = property56.addToCopy(0L);
        org.joda.time.LocalDateTime.Property property59 = localDateTime58.dayOfMonth();
        int int60 = localDateTime58.getDayOfMonth();
        int int61 = dateTimeField25.getMinimumValue((org.joda.time.ReadablePartial) localDateTime58);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField47", (durationField4.compareTo(durationField47) == 0) == durationField4.equals(durationField47));
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test668");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology2.yearOfEra();
        org.joda.time.DurationField durationField5 = islamicChronology2.hours();
        org.joda.time.DurationField durationField6 = islamicChronology2.days();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology2.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology2.dayOfYear();
        org.joda.time.DurationField durationField9 = islamicChronology2.days();
        org.joda.time.DurationField durationField10 = islamicChronology2.years();
        org.joda.time.DurationField durationField11 = islamicChronology2.weeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField10", (durationField3.compareTo(durationField10) == 0) == durationField3.equals(durationField10));
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test669");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DurationField durationField4 = islamicChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.yearOfEra();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology2.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology2.yearOfEra();
        org.joda.time.DurationField durationField8 = islamicChronology2.months();
        org.joda.time.DurationField durationField9 = islamicChronology2.years();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology2.secondOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField9", (durationField3.compareTo(durationField9) == 0) == durationField3.equals(durationField9));
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test670");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        int int2 = localDateTime1.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.minusHours((int) (byte) -1);
        int int6 = localDateTime1.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.LocalDateTime localDateTime10 = localDateTime1.minus(readablePeriod9);
        int int11 = localDateTime10.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField13 = localDateTime10.getField(0);
        org.joda.time.LocalDateTime.Property property14 = localDateTime10.centuryOfEra();
        org.joda.time.LocalDateTime.Property property15 = localDateTime10.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime10.withTime((int) (byte) 1, 0, 5, (int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime10.withWeekyear(59);
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime((long) 1);
        int int25 = localDateTime24.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime27 = localDateTime24.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology30 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone29);
        org.joda.time.DateTime dateTime31 = localDateTime24.toDateTime(dateTimeZone29);
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime((long) 1);
        int int34 = localDateTime33.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime36 = localDateTime33.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology39 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone38);
        org.joda.time.DateTime dateTime40 = localDateTime33.toDateTime(dateTimeZone38);
        long long41 = dateTime40.getMillis();
        boolean boolean42 = dateTime31.isAfter((org.joda.time.ReadableInstant) dateTime40);
        long long43 = dateTime40.getMillis();
        org.joda.time.Instant instant44 = dateTime40.toInstant();
        org.joda.time.DateTime dateTime45 = localDateTime10.toDateTime((org.joda.time.ReadableInstant) instant44);
        org.joda.time.DateTimeZone dateTimeZone46 = instant44.getZone();
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology49 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone48);
        org.joda.time.DurationField durationField50 = islamicChronology49.weekyears();
        org.joda.time.DurationField durationField51 = islamicChronology49.halfdays();
        org.joda.time.DateTimeField dateTimeField52 = islamicChronology49.yearOfEra();
        org.joda.time.DurationField durationField53 = islamicChronology49.halfdays();
        org.joda.time.LocalDateTime localDateTime54 = new org.joda.time.LocalDateTime((org.joda.time.Chronology) islamicChronology49);
        org.joda.time.ReadableDuration readableDuration55 = null;
        org.joda.time.LocalDateTime localDateTime57 = localDateTime54.withDurationAdded(readableDuration55, 951);
        boolean boolean58 = dateTimeZone46.isLocalDateTimeGap(localDateTime57);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime31 and instant44", (dateTime31.compareTo(instant44) == 0) == dateTime31.equals(instant44));
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test671");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology2.yearOfEra();
        org.joda.time.DurationField durationField5 = islamicChronology2.hours();
        org.joda.time.DurationField durationField6 = islamicChronology2.halfdays();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType7 = islamicChronology2.getLeapYearPatternType();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology2.minuteOfHour();
        org.joda.time.DurationField durationField9 = islamicChronology2.seconds();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology2.minuteOfDay();
        org.joda.time.DurationField durationField11 = islamicChronology2.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField11, durationField3, and durationField5", !(durationField11.compareTo(durationField3) == 0) || (Math.signum(durationField11.compareTo(durationField5)) == Math.signum(durationField3.compareTo(durationField5))));
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test672");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology2.yearOfEra();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.weekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = islamicChronology2.add(readablePeriod6, (long) 11, 82800001);
        org.joda.time.DurationField durationField10 = islamicChronology2.weeks();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology2.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime(100, (int) (short) 10, (int) (short) 10, (int) (byte) 0, 0, (int) ' ');
        int int19 = localDateTime18.getMinuteOfHour();
        org.joda.time.LocalDateTime.Property property20 = localDateTime18.hourOfDay();
        org.joda.time.LocalDateTime localDateTime22 = property20.addToCopy((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology25 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone24);
        org.joda.time.DateTimeField dateTimeField26 = islamicChronology25.yearOfCentury();
        org.joda.time.DurationField durationField27 = islamicChronology25.years();
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime((long) 1);
        int int30 = localDateTime29.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime32 = localDateTime29.minusHours((int) (byte) -1);
        int int34 = localDateTime29.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime29.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod37 = null;
        org.joda.time.LocalDateTime localDateTime38 = localDateTime29.minus(readablePeriod37);
        int int39 = localDateTime38.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField41 = localDateTime38.getField(0);
        org.joda.time.LocalDateTime.Property property42 = localDateTime38.centuryOfEra();
        int[] intArray44 = islamicChronology25.get((org.joda.time.ReadablePartial) localDateTime38, (long) 0);
        org.joda.time.DateTimeField dateTimeField45 = islamicChronology25.hourOfDay();
        org.joda.time.DurationField durationField46 = islamicChronology25.centuries();
        boolean boolean47 = property20.equals((java.lang.Object) durationField46);
        org.joda.time.LocalDateTime localDateTime48 = property20.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime50 = localDateTime48.minusWeeks(24);
        org.joda.time.LocalDateTime localDateTime52 = localDateTime48.plusDays(262152);
        org.joda.time.ReadableDuration readableDuration53 = null;
        org.joda.time.LocalDateTime localDateTime54 = localDateTime48.plus(readableDuration53);
        org.joda.time.DateTimeZone dateTimeZone56 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology57 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone56);
        org.joda.time.DateTimeField dateTimeField58 = islamicChronology57.yearOfCentury();
        org.joda.time.DurationField durationField59 = islamicChronology57.years();
        org.joda.time.LocalDateTime localDateTime61 = new org.joda.time.LocalDateTime((long) 1);
        int int62 = localDateTime61.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime64 = localDateTime61.minusHours((int) (byte) -1);
        int int66 = localDateTime61.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime68 = localDateTime61.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod69 = null;
        org.joda.time.LocalDateTime localDateTime70 = localDateTime61.minus(readablePeriod69);
        int int71 = localDateTime70.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField73 = localDateTime70.getField(0);
        org.joda.time.LocalDateTime.Property property74 = localDateTime70.centuryOfEra();
        int[] intArray76 = islamicChronology57.get((org.joda.time.ReadablePartial) localDateTime70, (long) 0);
        org.joda.time.DateTimeField dateTimeField77 = islamicChronology57.millisOfDay();
        org.joda.time.DurationField durationField78 = islamicChronology57.centuries();
        org.joda.time.DateTimeField dateTimeField79 = islamicChronology57.dayOfYear();
        org.joda.time.DateTimeField dateTimeField80 = islamicChronology57.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone81 = islamicChronology57.getZone();
        long long83 = dateTimeZone81.nextTransition((long) 59);
        org.joda.time.DateTime dateTime84 = localDateTime54.toDateTime(dateTimeZone81);
        java.util.Locale.Builder builder86 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder89 = builder86.setExtension('a', "FR");
        java.util.Locale.Builder builder91 = builder89.addUnicodeLocaleAttribute("KOR");
        java.util.Locale locale92 = java.util.Locale.TAIWAN;
        java.util.Locale.Builder builder93 = builder91.setLocale(locale92);
        java.util.Locale.Builder builder94 = builder91.clearExtensions();
        java.util.Locale locale95 = builder94.build();
        java.lang.String str96 = dateTimeField11.getAsText((org.joda.time.ReadablePartial) localDateTime54, 3632, locale95);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField27", (durationField3.compareTo(durationField27) == 0) == durationField3.equals(durationField27));
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test673");
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(100, (int) (short) 10, (int) (short) 10, (int) (byte) 0, 0, (int) ' ');
        int int7 = localDateTime6.getMinuteOfHour();
        org.joda.time.LocalDateTime.Property property8 = localDateTime6.hourOfDay();
        org.joda.time.LocalDateTime localDateTime10 = property8.addToCopy((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology13 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone12);
        org.joda.time.DateTimeField dateTimeField14 = islamicChronology13.yearOfCentury();
        org.joda.time.DurationField durationField15 = islamicChronology13.years();
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime((long) 1);
        int int18 = localDateTime17.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime17.minusHours((int) (byte) -1);
        int int22 = localDateTime17.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime17.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        org.joda.time.LocalDateTime localDateTime26 = localDateTime17.minus(readablePeriod25);
        int int27 = localDateTime26.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField29 = localDateTime26.getField(0);
        org.joda.time.LocalDateTime.Property property30 = localDateTime26.centuryOfEra();
        int[] intArray32 = islamicChronology13.get((org.joda.time.ReadablePartial) localDateTime26, (long) 0);
        org.joda.time.DateTimeField dateTimeField33 = islamicChronology13.hourOfDay();
        org.joda.time.DurationField durationField34 = islamicChronology13.centuries();
        boolean boolean35 = property8.equals((java.lang.Object) durationField34);
        org.joda.time.LocalDateTime localDateTime36 = property8.withMaximumValue();
        org.joda.time.DateTimeField dateTimeField37 = property8.getField();
        int int38 = dateTimeField37.getMaximumValue();
        boolean boolean40 = dateTimeField37.isLeap(220441897719245L);
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology43 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone42);
        org.joda.time.DurationField durationField44 = islamicChronology43.weekyears();
        org.joda.time.DurationField durationField45 = islamicChronology43.millis();
        org.joda.time.DurationField durationField46 = islamicChronology43.hours();
        org.joda.time.DurationField durationField47 = islamicChronology43.centuries();
        org.joda.time.DateTimeField dateTimeField48 = islamicChronology43.halfdayOfDay();
        java.util.Locale locale49 = java.util.Locale.TAIWAN;
        boolean boolean50 = locale49.hasExtensions();
        java.util.Locale locale51 = locale49.stripExtensions();
        java.lang.String str52 = locale49.getDisplayCountry();
        java.util.Locale locale53 = java.util.Locale.TAIWAN;
        boolean boolean54 = locale53.hasExtensions();
        java.lang.String str55 = locale49.getDisplayCountry(locale53);
        java.lang.String str56 = locale49.getLanguage();
        int int57 = dateTimeField48.getMaximumShortTextLength(locale49);
        java.lang.Object obj58 = null;
        org.joda.time.Chronology chronology59 = null;
        org.joda.time.LocalDateTime localDateTime60 = new org.joda.time.LocalDateTime(obj58, chronology59);
        org.joda.time.LocalDateTime localDateTime67 = new org.joda.time.LocalDateTime(100, (int) (short) 10, (int) (short) 10, (int) (byte) 0, 0, (int) ' ');
        int int68 = localDateTime67.getMinuteOfHour();
        org.joda.time.LocalDateTime.Property property69 = localDateTime67.hourOfDay();
        org.joda.time.LocalDateTime localDateTime71 = property69.addToCopy((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime72 = property69.roundFloorCopy();
        java.lang.String str73 = property69.getAsText();
        org.joda.time.DateTimeZone dateTimeZone75 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology76 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone75);
        org.joda.time.DurationField durationField77 = islamicChronology76.weekyears();
        org.joda.time.DurationField durationField78 = islamicChronology76.months();
        org.joda.time.DateTimeField dateTimeField79 = islamicChronology76.minuteOfHour();
        org.joda.time.DurationField durationField80 = islamicChronology76.hours();
        org.joda.time.DateTimeField dateTimeField81 = islamicChronology76.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone83 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 0);
        org.joda.time.Chronology chronology84 = islamicChronology76.withZone(dateTimeZone83);
        java.util.Locale locale86 = java.util.Locale.CANADA;
        java.lang.String str87 = dateTimeZone83.getShortName((long) 11, locale86);
        int int88 = property69.getMaximumShortTextLength(locale86);
        java.util.Locale locale89 = locale86.stripExtensions();
        java.lang.String str90 = locale89.getDisplayLanguage();
        java.lang.String str91 = dateTimeField48.getAsText((org.joda.time.ReadablePartial) localDateTime60, locale89);
        int int92 = dateTimeField37.getMaximumValue((org.joda.time.ReadablePartial) localDateTime60);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField15 and durationField44", (durationField15.compareTo(durationField44) == 0) == durationField15.equals(durationField44));
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test674");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology2.hourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology2.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology9 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone8);
        org.joda.time.DurationField durationField10 = islamicChronology9.weekyears();
        org.joda.time.DurationField durationField11 = islamicChronology9.months();
        org.joda.time.DurationField durationField12 = islamicChronology9.centuries();
        org.joda.time.DateTimeZone dateTimeZone13 = islamicChronology9.getZone();
        org.joda.time.Chronology chronology14 = islamicChronology2.withZone(dateTimeZone13);
        org.joda.time.DateTimeField dateTimeField15 = islamicChronology2.monthOfYear();
        org.joda.time.DurationField durationField16 = islamicChronology2.millis();
        org.joda.time.DateTimeField dateTimeField17 = islamicChronology2.weekyearOfCentury();
        org.joda.time.DurationField durationField18 = islamicChronology2.years();
        org.joda.time.DateTimeField dateTimeField19 = islamicChronology2.minuteOfHour();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField18", (durationField3.compareTo(durationField18) == 0) == durationField3.equals(durationField18));
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test675");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        int int2 = localDateTime1.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.minusHours((int) (byte) -1);
        int int5 = localDateTime1.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.minusMinutes((int) '#');
        org.joda.time.LocalDateTime localDateTime9 = localDateTime1.plusMonths((-1));
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((long) 1);
        int int12 = localDateTime11.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology17 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone16);
        org.joda.time.DurationField durationField18 = islamicChronology17.weekyears();
        org.joda.time.DurationField durationField19 = islamicChronology17.halfdays();
        org.joda.time.DateTimeField dateTimeField20 = islamicChronology17.yearOfEra();
        org.joda.time.DurationField durationField21 = islamicChronology17.halfdays();
        org.joda.time.DurationFieldType durationFieldType22 = durationField21.getType();
        boolean boolean23 = localDateTime11.isSupported(durationFieldType22);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime1.withFieldAdded(durationFieldType22, 12);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime25.minusMonths((int) 'a');
        org.joda.time.ReadableDuration readableDuration28 = null;
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.minus(readableDuration28);
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology32 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone31);
        org.joda.time.DateTimeField dateTimeField33 = islamicChronology32.weekyear();
        org.joda.time.DurationField durationField34 = islamicChronology32.years();
        org.joda.time.DateTimeField dateTimeField35 = islamicChronology32.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField36 = islamicChronology32.hourOfDay();
        org.joda.time.DateTimeField dateTimeField37 = islamicChronology32.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField38 = islamicChronology32.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone39 = islamicChronology32.getZone();
        org.joda.time.DurationField durationField40 = islamicChronology32.halfdays();
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.forOffsetMillis(101);
        org.joda.time.Chronology chronology43 = islamicChronology32.withZone(dateTimeZone42);
        org.joda.time.DurationField durationField44 = islamicChronology32.seconds();
        org.joda.time.DateTimeField dateTimeField45 = islamicChronology32.weekOfWeekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType46 = dateTimeField45.getType();
        int int47 = localDateTime27.get(dateTimeFieldType46);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField18 and durationField34", (durationField18.compareTo(durationField34) == 0) == durationField18.equals(durationField34));
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test676");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = islamicChronology2.years();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) 1);
        int int7 = localDateTime6.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.minusHours((int) (byte) -1);
        int int11 = localDateTime6.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime6.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalDateTime localDateTime15 = localDateTime6.minus(readablePeriod14);
        int int16 = localDateTime15.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField18 = localDateTime15.getField(0);
        org.joda.time.LocalDateTime.Property property19 = localDateTime15.centuryOfEra();
        int[] intArray21 = islamicChronology2.get((org.joda.time.ReadablePartial) localDateTime15, (long) 0);
        org.joda.time.DateTimeField dateTimeField22 = islamicChronology2.millisOfDay();
        org.joda.time.DurationField durationField23 = islamicChronology2.centuries();
        org.joda.time.DateTimeField dateTimeField24 = islamicChronology2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone25 = islamicChronology2.getZone();
        org.joda.time.LocalDateTime localDateTime26 = org.joda.time.LocalDateTime.now(dateTimeZone25);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime26.plusMonths(12);
        int int29 = localDateTime26.getDayOfWeek();
        org.joda.time.LocalDateTime localDateTime31 = localDateTime26.withYear(365);
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology34 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone33);
        org.joda.time.DurationField durationField35 = islamicChronology34.weekyears();
        org.joda.time.DateTimeField dateTimeField36 = islamicChronology34.hourOfHalfday();
        org.joda.time.LocalDateTime localDateTime38 = new org.joda.time.LocalDateTime((long) 1);
        int int39 = localDateTime38.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime41 = localDateTime38.minusHours((int) (byte) -1);
        org.joda.time.DateTimeField[] dateTimeFieldArray42 = localDateTime41.getFields();
        org.joda.time.LocalDateTime localDateTime44 = localDateTime41.minusDays(4);
        org.joda.time.LocalDateTime localDateTime46 = new org.joda.time.LocalDateTime((long) 1);
        int int47 = localDateTime46.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime49 = localDateTime46.minusHours((int) (byte) -1);
        int int51 = localDateTime46.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime53 = localDateTime46.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod54 = null;
        org.joda.time.LocalDateTime localDateTime55 = localDateTime46.minus(readablePeriod54);
        int int56 = localDateTime55.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField58 = localDateTime55.getField(0);
        org.joda.time.LocalDateTime.Property property59 = localDateTime55.centuryOfEra();
        org.joda.time.LocalDateTime.Property property60 = localDateTime55.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime65 = localDateTime55.withTime((int) (byte) 1, 0, 5, (int) (byte) 100);
        boolean boolean66 = localDateTime41.isBefore((org.joda.time.ReadablePartial) localDateTime65);
        org.joda.time.LocalDateTime.Property property67 = localDateTime65.weekyear();
        int[] intArray69 = islamicChronology34.get((org.joda.time.ReadablePartial) localDateTime65, 17763840000001L);
        boolean boolean70 = localDateTime26.isBefore((org.joda.time.ReadablePartial) localDateTime65);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField35", (durationField4.compareTo(durationField35) == 0) == durationField4.equals(durationField35));
    }

    @Test
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test677");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = islamicChronology2.years();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) 1);
        int int7 = localDateTime6.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.minusHours((int) (byte) -1);
        int int11 = localDateTime6.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime6.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalDateTime localDateTime15 = localDateTime6.minus(readablePeriod14);
        int int16 = localDateTime15.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField18 = localDateTime15.getField(0);
        org.joda.time.LocalDateTime.Property property19 = localDateTime15.centuryOfEra();
        int[] intArray21 = islamicChronology2.get((org.joda.time.ReadablePartial) localDateTime15, (long) 0);
        org.joda.time.DateTimeField dateTimeField22 = islamicChronology2.millisOfDay();
        org.joda.time.DurationField durationField23 = islamicChronology2.days();
        org.joda.time.DateTimeField dateTimeField24 = islamicChronology2.dayOfMonth();
        org.joda.time.Chronology chronology25 = islamicChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField26 = islamicChronology2.dayOfMonth();
        org.joda.time.DurationField durationField27 = islamicChronology2.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField27, durationField4, and durationField23", !(durationField27.compareTo(durationField4) == 0) || (Math.signum(durationField27.compareTo(durationField23)) == Math.signum(durationField4.compareTo(durationField23))));
    }

    @Test
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test678");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = islamicChronology2.years();
        org.joda.time.DurationField durationField5 = islamicChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology2.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone8 = islamicChronology2.getZone();
        org.joda.time.Chronology chronology9 = islamicChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology2.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology2.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology14 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone13);
        org.joda.time.DurationField durationField15 = islamicChronology14.weekyears();
        org.joda.time.DurationField durationField16 = islamicChronology14.months();
        org.joda.time.DateTimeField dateTimeField17 = islamicChronology14.minuteOfHour();
        org.joda.time.DurationField durationField18 = islamicChronology14.hours();
        org.joda.time.DateTimeField dateTimeField19 = islamicChronology14.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 0);
        org.joda.time.Chronology chronology22 = islamicChronology14.withZone(dateTimeZone21);
        java.util.Locale locale24 = java.util.Locale.CANADA;
        java.lang.String str25 = dateTimeZone21.getShortName((long) 11, locale24);
        long long29 = dateTimeZone21.convertLocalToUTC((long) 'a', true, 1970L);
        int int31 = dateTimeZone21.getOffsetFromLocal((long) 32);
        org.joda.time.Chronology chronology32 = islamicChronology2.withZone(dateTimeZone21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField15", (durationField4.compareTo(durationField15) == 0) == durationField4.equals(durationField15));
    }

    @Test
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test679");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        int int2 = localDateTime1.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology7 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone6);
        org.joda.time.DateTime dateTime8 = localDateTime1.toDateTime(dateTimeZone6);
        long long12 = dateTimeZone6.convertLocalToUTC(0L, true, (-4320000001L));
        boolean boolean14 = dateTimeZone6.isStandardOffset(50L);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 1);
        java.util.TimeZone timeZone17 = dateTimeZone16.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology20 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone19);
        org.joda.time.DurationField durationField21 = islamicChronology20.weekyears();
        org.joda.time.DateTimeField dateTimeField22 = islamicChronology20.yearOfEra();
        org.joda.time.DurationField durationField23 = islamicChronology20.hours();
        org.joda.time.DurationField durationField24 = islamicChronology20.halfdays();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType25 = islamicChronology20.getLeapYearPatternType();
        org.joda.time.chrono.IslamicChronology islamicChronology26 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone16, leapYearPatternType25);
        org.joda.time.chrono.IslamicChronology islamicChronology27 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone6, leapYearPatternType25);
        boolean boolean28 = dateTimeZone6.isFixed();
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology31 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone30);
        org.joda.time.DurationField durationField32 = islamicChronology31.weekyears();
        org.joda.time.DateTimeField dateTimeField33 = islamicChronology31.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology36 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone35);
        org.joda.time.DurationField durationField37 = islamicChronology36.weekyears();
        org.joda.time.DateTimeField dateTimeField38 = islamicChronology36.yearOfEra();
        long long40 = dateTimeField38.roundCeiling(0L);
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime((long) 1);
        int int43 = localDateTime42.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime45 = localDateTime42.minusHours((int) (byte) -1);
        int int46 = localDateTime42.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime48 = localDateTime42.withMinuteOfHour((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime50 = localDateTime42.plusHours((int) (byte) 100);
        org.joda.time.ReadableDuration readableDuration51 = null;
        org.joda.time.LocalDateTime localDateTime52 = localDateTime42.minus(readableDuration51);
        java.util.Locale locale53 = java.util.Locale.PRC;
        java.util.Locale locale54 = locale53.stripExtensions();
        java.lang.String str55 = dateTimeField38.getAsShortText((org.joda.time.ReadablePartial) localDateTime52, locale53);
        org.joda.time.ReadablePeriod readablePeriod56 = null;
        org.joda.time.LocalDateTime localDateTime57 = localDateTime52.plus(readablePeriod56);
        org.joda.time.ReadablePeriod readablePeriod58 = null;
        org.joda.time.LocalDateTime localDateTime59 = localDateTime52.plus(readablePeriod58);
        org.joda.time.LocalDateTime localDateTime61 = localDateTime59.plusMonths((int) (short) 100);
        org.joda.time.ReadableDuration readableDuration62 = null;
        org.joda.time.LocalDateTime localDateTime63 = localDateTime59.plus(readableDuration62);
        int int64 = localDateTime59.size();
        org.joda.time.LocalDateTime.Property property65 = localDateTime59.millisOfSecond();
        int int66 = dateTimeField33.getMaximumValue((org.joda.time.ReadablePartial) localDateTime59);
        boolean boolean67 = dateTimeZone6.isLocalDateTimeGap(localDateTime59);
        org.joda.time.DateTimeZone dateTimeZone69 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology70 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone69);
        org.joda.time.DateTimeField dateTimeField71 = islamicChronology70.yearOfCentury();
        org.joda.time.DurationField durationField72 = islamicChronology70.years();
        org.joda.time.LocalDateTime localDateTime74 = new org.joda.time.LocalDateTime((long) 1);
        int int75 = localDateTime74.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime77 = localDateTime74.minusHours((int) (byte) -1);
        int int79 = localDateTime74.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime81 = localDateTime74.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod82 = null;
        org.joda.time.LocalDateTime localDateTime83 = localDateTime74.minus(readablePeriod82);
        int int84 = localDateTime83.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField86 = localDateTime83.getField(0);
        org.joda.time.LocalDateTime.Property property87 = localDateTime83.centuryOfEra();
        int[] intArray89 = islamicChronology70.get((org.joda.time.ReadablePartial) localDateTime83, (long) 0);
        org.joda.time.DateTimeField dateTimeField90 = islamicChronology70.millisOfDay();
        org.joda.time.DurationField durationField91 = islamicChronology70.days();
        org.joda.time.Chronology chronology92 = islamicChronology70.withUTC();
        org.joda.time.DateTimeField dateTimeField93 = islamicChronology70.clockhourOfHalfday();
        boolean boolean94 = dateTimeZone6.equals((java.lang.Object) dateTimeField93);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField21 and durationField72", (durationField21.compareTo(durationField72) == 0) == durationField21.equals(durationField72));
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test680");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DurationField durationField4 = islamicChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.yearOfEra();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology2.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology2.monthOfYear();
        org.joda.time.DurationField durationField8 = islamicChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology2.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology2.year();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology2.minuteOfDay();
        org.joda.time.LocalDateTime localDateTime12 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) islamicChronology2);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology15 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone14);
        org.joda.time.DurationField durationField16 = islamicChronology15.weekyears();
        org.joda.time.DurationField durationField17 = islamicChronology15.months();
        org.joda.time.DurationField durationField18 = islamicChronology15.centuries();
        org.joda.time.DateTimeZone dateTimeZone19 = islamicChronology15.getZone();
        org.joda.time.DateTimeField dateTimeField20 = islamicChronology15.secondOfDay();
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime((long) 1);
        int int23 = localDateTime22.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime25 = localDateTime22.minusHours((int) (byte) -1);
        int int26 = localDateTime22.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime28 = localDateTime22.withMinuteOfHour((int) (byte) 1);
        org.joda.time.ReadableDuration readableDuration29 = null;
        org.joda.time.LocalDateTime localDateTime31 = localDateTime28.withDurationAdded(readableDuration29, (int) 'x');
        org.joda.time.LocalDateTime localDateTime33 = localDateTime31.minusDays(82800001);
        org.joda.time.LocalDateTime localDateTime35 = localDateTime31.plusHours(60);
        java.util.Locale locale36 = java.util.Locale.PRC;
        java.util.Locale locale37 = locale36.stripExtensions();
        java.lang.String str38 = dateTimeField20.getAsText((org.joda.time.ReadablePartial) localDateTime31, locale36);
        int[] intArray40 = islamicChronology2.get((org.joda.time.ReadablePartial) localDateTime31, (long) (short) 10);
        org.joda.time.DateTimeField dateTimeField41 = islamicChronology2.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField42 = islamicChronology2.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField43 = islamicChronology2.minuteOfHour();
        org.joda.time.DurationField durationField44 = islamicChronology2.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField44, durationField3, and durationField4", !(durationField44.compareTo(durationField3) == 0) || (Math.signum(durationField44.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test681");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = islamicChronology2.years();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) 1);
        int int7 = localDateTime6.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.minusHours((int) (byte) -1);
        int int11 = localDateTime6.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime6.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalDateTime localDateTime15 = localDateTime6.minus(readablePeriod14);
        int int16 = localDateTime15.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField18 = localDateTime15.getField(0);
        org.joda.time.LocalDateTime.Property property19 = localDateTime15.centuryOfEra();
        int[] intArray21 = islamicChronology2.get((org.joda.time.ReadablePartial) localDateTime15, (long) 0);
        org.joda.time.DateTimeField dateTimeField22 = islamicChronology2.hourOfDay();
        org.joda.time.DurationField durationField23 = islamicChronology2.centuries();
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime(100, (int) (short) 10, (int) (short) 10, (int) (byte) 0, 0, (int) ' ');
        org.joda.time.ReadableDuration readableDuration31 = null;
        org.joda.time.LocalDateTime localDateTime32 = localDateTime30.plus(readableDuration31);
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        org.joda.time.LocalDateTime localDateTime34 = localDateTime32.plus(readablePeriod33);
        org.joda.time.LocalDateTime localDateTime36 = new org.joda.time.LocalDateTime((long) 1);
        int int37 = localDateTime36.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime39 = localDateTime36.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology42 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone41);
        org.joda.time.DateTime dateTime43 = localDateTime36.toDateTime(dateTimeZone41);
        long long44 = dateTime43.getMillis();
        org.joda.time.DateTime dateTime45 = localDateTime32.toDateTime((org.joda.time.ReadableInstant) dateTime43);
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology48 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone47);
        org.joda.time.DurationField durationField49 = islamicChronology48.weekyears();
        org.joda.time.DurationField durationField50 = islamicChronology48.months();
        org.joda.time.DateTimeField dateTimeField51 = islamicChronology48.halfdayOfDay();
        org.joda.time.DurationField durationField52 = islamicChronology48.millis();
        org.joda.time.DateTimeField dateTimeField53 = islamicChronology48.hourOfHalfday();
        org.joda.time.DurationField durationField54 = islamicChronology48.centuries();
        org.joda.time.LocalDateTime localDateTime56 = new org.joda.time.LocalDateTime(0L);
        org.joda.time.LocalDateTime localDateTime58 = localDateTime56.withHourOfDay(5);
        org.joda.time.ReadableDuration readableDuration59 = null;
        org.joda.time.LocalDateTime localDateTime60 = localDateTime58.minus(readableDuration59);
        org.joda.time.LocalDateTime.Property property61 = localDateTime60.hourOfDay();
        org.joda.time.LocalDateTime localDateTime63 = localDateTime60.plusSeconds(51);
        org.joda.time.LocalDateTime.Property property64 = localDateTime63.monthOfYear();
        int[] intArray66 = islamicChronology48.get((org.joda.time.ReadablePartial) localDateTime63, (-3L));
        islamicChronology2.validate((org.joda.time.ReadablePartial) localDateTime32, intArray66);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField49", (durationField4.compareTo(durationField49) == 0) == durationField4.equals(durationField49));
    }

    @Test
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test682");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DurationField durationField4 = islamicChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.yearOfEra();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology2.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology2.hourOfDay();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology2.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((long) 1);
        int int12 = localDateTime11.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology17 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone16);
        org.joda.time.DateTime dateTime18 = localDateTime11.toDateTime(dateTimeZone16);
        long long20 = islamicChronology2.set((org.joda.time.ReadablePartial) localDateTime11, (long) 53);
        org.joda.time.LocalDateTime.Property property21 = localDateTime11.year();
        org.joda.time.LocalDateTime.Property property22 = localDateTime11.yearOfEra();
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime((long) 1);
        int int25 = localDateTime24.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime27 = localDateTime24.minusHours((int) (byte) -1);
        int int28 = localDateTime24.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime30 = localDateTime24.minusMinutes((int) '#');
        org.joda.time.LocalDateTime.Property property31 = localDateTime30.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime32 = property31.roundCeilingCopy();
        java.lang.String str33 = property31.toString();
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime((long) 1);
        int int36 = localDateTime35.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime38 = localDateTime35.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology41 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone40);
        org.joda.time.DateTime dateTime42 = localDateTime35.toDateTime(dateTimeZone40);
        org.joda.time.ReadableInstant readableInstant43 = null;
        boolean boolean44 = dateTime42.isAfter(readableInstant43);
        org.joda.time.Instant instant45 = dateTime42.toInstant();
        int int46 = property31.compareTo((org.joda.time.ReadableInstant) dateTime42);
        org.joda.time.DateTimeZone dateTimeZone47 = dateTime42.getZone();
        org.joda.time.LocalDateTime localDateTime49 = new org.joda.time.LocalDateTime((long) 1);
        int int50 = localDateTime49.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime52 = localDateTime49.minusHours((int) (byte) -1);
        int int54 = localDateTime49.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime56 = localDateTime49.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod57 = null;
        org.joda.time.LocalDateTime localDateTime58 = localDateTime49.minus(readablePeriod57);
        int int59 = localDateTime58.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField61 = localDateTime58.getField(0);
        org.joda.time.LocalDateTime.Property property62 = localDateTime58.centuryOfEra();
        org.joda.time.ReadableDuration readableDuration63 = null;
        org.joda.time.LocalDateTime localDateTime64 = localDateTime58.plus(readableDuration63);
        org.joda.time.LocalDateTime localDateTime66 = localDateTime58.minusMonths(59);
        int int67 = localDateTime58.getYearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone69 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology70 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone69);
        org.joda.time.DurationField durationField71 = islamicChronology70.weekyears();
        org.joda.time.DurationField durationField72 = islamicChronology70.halfdays();
        org.joda.time.DurationField durationField73 = islamicChronology70.weeks();
        org.joda.time.DateTimeField dateTimeField74 = islamicChronology70.yearOfEra();
        org.joda.time.LocalDateTime localDateTime76 = new org.joda.time.LocalDateTime((long) 1);
        int int77 = localDateTime76.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime79 = localDateTime76.minusHours((int) (byte) -1);
        org.joda.time.DateTimeField[] dateTimeFieldArray80 = localDateTime79.getFields();
        java.util.Locale locale81 = java.util.Locale.KOREA;
        java.util.Locale locale82 = java.util.Locale.KOREA;
        java.lang.String str83 = locale81.getDisplayLanguage(locale82);
        java.lang.String str84 = dateTimeField74.getAsText((org.joda.time.ReadablePartial) localDateTime79, locale81);
        org.joda.time.DateTimeFieldType dateTimeFieldType85 = dateTimeField74.getType();
        int int86 = localDateTime58.indexOf(dateTimeFieldType85);
        boolean boolean87 = dateTime42.isSupported(dateTimeFieldType85);
        int int88 = property22.compareTo((org.joda.time.ReadableInstant) dateTime42);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime18 and instant45", (dateTime18.compareTo(instant45) == 0) == dateTime18.equals(instant45));
    }

    @Test
    public void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test683");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DurationField durationField4 = islamicChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.yearOfEra();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology2.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology2.monthOfYear();
        org.joda.time.DurationField durationField8 = islamicChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology2.dayOfYear();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology2.year();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology2.dayOfMonth();
        org.joda.time.ReadablePartial readablePartial12 = null;
        org.joda.time.chrono.IslamicChronology islamicChronology13 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField14 = islamicChronology13.minuteOfDay();
        org.joda.time.DurationField durationField15 = islamicChronology13.months();
        org.joda.time.DateTimeField dateTimeField16 = islamicChronology13.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology19 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone18);
        org.joda.time.DateTimeField dateTimeField20 = islamicChronology19.yearOfCentury();
        org.joda.time.DurationField durationField21 = islamicChronology19.years();
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime((long) 1);
        int int24 = localDateTime23.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime26 = localDateTime23.minusHours((int) (byte) -1);
        int int28 = localDateTime23.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime23.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod31 = null;
        org.joda.time.LocalDateTime localDateTime32 = localDateTime23.minus(readablePeriod31);
        int int33 = localDateTime32.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField35 = localDateTime32.getField(0);
        org.joda.time.LocalDateTime.Property property36 = localDateTime32.centuryOfEra();
        int[] intArray38 = islamicChronology19.get((org.joda.time.ReadablePartial) localDateTime32, (long) 0);
        org.joda.time.DateTimeField dateTimeField39 = islamicChronology19.millisOfDay();
        org.joda.time.DurationField durationField40 = islamicChronology19.centuries();
        org.joda.time.DateTimeField dateTimeField41 = islamicChronology19.dayOfYear();
        org.joda.time.DateTimeField dateTimeField42 = islamicChronology19.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField43 = islamicChronology19.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology46 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone45);
        org.joda.time.LocalDateTime localDateTime48 = new org.joda.time.LocalDateTime((long) 1);
        int int49 = localDateTime48.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime51 = localDateTime48.minusHours((int) (byte) -1);
        org.joda.time.DateTimeField[] dateTimeFieldArray52 = localDateTime51.getFields();
        boolean boolean53 = dateTimeZone45.isLocalDateTimeGap(localDateTime51);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone45);
        java.util.TimeZone timeZone55 = dateTimeZone45.toTimeZone();
        org.joda.time.Chronology chronology56 = islamicChronology19.withZone(dateTimeZone45);
        org.joda.time.DateTimeField dateTimeField57 = islamicChronology19.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField58 = islamicChronology19.hourOfHalfday();
        java.lang.String str59 = islamicChronology19.toString();
        org.joda.time.DurationField durationField60 = islamicChronology19.months();
        org.joda.time.LocalDateTime localDateTime62 = new org.joda.time.LocalDateTime((long) 1);
        int int63 = localDateTime62.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime65 = localDateTime62.minusHours((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime67 = localDateTime65.withMinuteOfHour(19);
        org.joda.time.DateTimeField dateTimeField69 = localDateTime65.getField((int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime71 = new org.joda.time.LocalDateTime((long) 1);
        int int72 = localDateTime71.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime74 = localDateTime71.minusHours((int) (byte) -1);
        int int76 = localDateTime71.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime77 = localDateTime65.withFields((org.joda.time.ReadablePartial) localDateTime71);
        int[] intArray79 = islamicChronology19.get((org.joda.time.ReadablePartial) localDateTime77, (-39490502399999L));
        org.joda.time.DateTimeZone dateTimeZone82 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology83 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone82);
        org.joda.time.LocalDateTime localDateTime85 = new org.joda.time.LocalDateTime((long) 1);
        int int86 = localDateTime85.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime88 = localDateTime85.minusHours((int) (byte) -1);
        org.joda.time.DateTimeField[] dateTimeFieldArray89 = localDateTime88.getFields();
        boolean boolean90 = dateTimeZone82.isLocalDateTimeGap(localDateTime88);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone82);
        java.lang.String str92 = dateTimeZone82.getID();
        org.joda.time.chrono.IslamicChronology islamicChronology93 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone82);
        org.joda.time.LocalDateTime localDateTime94 = org.joda.time.LocalDateTime.now(dateTimeZone82);
        int[] intArray95 = localDateTime94.getValues();
        int[] intArray97 = dateTimeField16.addWrapPartial((org.joda.time.ReadablePartial) localDateTime77, 0, intArray95, 0);
        int int98 = dateTimeField11.getMinimumValue(readablePartial12, intArray97);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField21", (durationField3.compareTo(durationField21) == 0) == durationField3.equals(durationField21));
    }

    @Test
    public void test684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test684");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        int int2 = localDateTime1.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.plusMinutes(1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime1.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((long) 1);
        int int8 = localDateTime7.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime7.minusHours((int) (byte) -1);
        int int12 = localDateTime7.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime7.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.LocalDateTime localDateTime16 = localDateTime7.minus(readablePeriod15);
        org.joda.time.LocalDateTime.Property property17 = localDateTime7.millisOfSecond();
        long long18 = property17.remainder();
        java.lang.String str19 = property17.getName();
        org.joda.time.DurationField durationField20 = property17.getRangeDurationField();
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime((long) 1);
        int int23 = localDateTime22.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime25 = localDateTime22.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology28 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone27);
        org.joda.time.DateTime dateTime29 = localDateTime22.toDateTime(dateTimeZone27);
        long long30 = dateTime29.getMillis();
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime((long) 1);
        int int33 = localDateTime32.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime35 = localDateTime32.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology38 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone37);
        org.joda.time.DateTime dateTime39 = localDateTime32.toDateTime(dateTimeZone37);
        long long40 = dateTime39.getMillis();
        long long41 = dateTime39.getMillis();
        boolean boolean42 = dateTime29.isAfter((org.joda.time.ReadableInstant) dateTime39);
        org.joda.time.Chronology chronology43 = dateTime39.getChronology();
        java.util.Locale.FilteringMode filteringMode44 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        boolean boolean45 = dateTime39.equals((java.lang.Object) filteringMode44);
        org.joda.time.LocalDateTime localDateTime47 = new org.joda.time.LocalDateTime((long) 1);
        int int48 = localDateTime47.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime50 = localDateTime47.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone52 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology53 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone52);
        org.joda.time.DateTime dateTime54 = localDateTime47.toDateTime(dateTimeZone52);
        org.joda.time.LocalDateTime localDateTime56 = new org.joda.time.LocalDateTime((long) 1);
        int int57 = localDateTime56.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime59 = localDateTime56.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone61 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology62 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone61);
        org.joda.time.DateTime dateTime63 = localDateTime56.toDateTime(dateTimeZone61);
        long long64 = dateTime63.getMillis();
        boolean boolean65 = dateTime54.isAfter((org.joda.time.ReadableInstant) dateTime63);
        int int66 = dateTime39.compareTo((org.joda.time.ReadableInstant) dateTime54);
        int int67 = property17.getDifference((org.joda.time.ReadableInstant) dateTime54);
        int int68 = property5.getDifference((org.joda.time.ReadableInstant) dateTime54);
        org.joda.time.Instant instant69 = dateTime54.toInstant();
        org.joda.time.Chronology chronology70 = dateTime54.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime29 and instant69", (dateTime29.compareTo(instant69) == 0) == dateTime29.equals(instant69));
    }

    @Test
    public void test685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test685");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        int int2 = localDateTime1.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYear((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withPeriodAdded(readablePeriod5, 10);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withDayOfYear(11);
        int[] intArray10 = localDateTime9.getValues();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime9.plusYears((int) (short) -1);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.dayOfYear();
        java.lang.String str14 = property13.getAsShortText();
        java.lang.String str15 = property13.getAsString();
        java.util.Locale locale16 = java.util.Locale.PRC;
        java.util.Locale locale17 = locale16.stripExtensions();
        java.util.Locale locale20 = new java.util.Locale("weekOfWeekyear", "millisOfSecond");
        java.lang.String str21 = locale17.getDisplayScript(locale20);
        java.lang.String str22 = property13.getAsText(locale17);
        org.joda.time.LocalDateTime localDateTime24 = property13.addToCopy(864000000L);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology27 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone26);
        org.joda.time.DurationField durationField28 = islamicChronology27.weekyears();
        org.joda.time.DurationField durationField29 = islamicChronology27.halfdays();
        org.joda.time.DateTimeField dateTimeField30 = islamicChronology27.yearOfEra();
        org.joda.time.DurationField durationField31 = islamicChronology27.halfdays();
        org.joda.time.DateTimeField dateTimeField32 = islamicChronology27.secondOfDay();
        org.joda.time.DateTimeField dateTimeField33 = islamicChronology27.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField34 = islamicChronology27.millisOfSecond();
        java.util.Locale locale35 = java.util.Locale.KOREA;
        java.util.Locale locale36 = java.util.Locale.KOREA;
        java.lang.String str37 = locale35.getDisplayLanguage(locale36);
        java.util.Locale.setDefault(locale35);
        java.util.Locale locale39 = java.util.Locale.JAPAN;
        java.lang.String str40 = locale35.getDisplayCountry(locale39);
        java.util.Locale locale41 = locale39.stripExtensions();
        int int42 = dateTimeField34.getMaximumShortTextLength(locale41);
        int int43 = property13.getMaximumShortTextLength(locale41);
        java.lang.String str44 = property13.getAsText();
        java.util.Locale locale45 = java.util.Locale.FRENCH;
        java.lang.String str46 = locale45.getVariant();
        int int47 = property13.getMaximumTextLength(locale45);
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology50 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone49);
        org.joda.time.DateTimeField dateTimeField51 = islamicChronology50.weekyear();
        org.joda.time.DurationField durationField52 = islamicChronology50.years();
        org.joda.time.DateTimeField dateTimeField53 = islamicChronology50.secondOfDay();
        org.joda.time.DateTimeField dateTimeField54 = islamicChronology50.secondOfMinute();
        org.joda.time.DurationField durationField55 = islamicChronology50.seconds();
        org.joda.time.DateTimeZone dateTimeZone56 = islamicChronology50.getZone();
        java.lang.String str58 = dateTimeZone56.getName(36457200000L);
        java.util.Locale locale60 = java.util.Locale.KOREA;
        java.util.Set<java.lang.String> strSet61 = locale60.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.Character> charSet62 = locale60.getExtensionKeys();
        boolean boolean63 = locale60.hasExtensions();
        java.lang.String str64 = dateTimeZone56.getShortName(4208703009071022L, locale60);
        java.lang.String str65 = locale60.getDisplayVariant();
        java.lang.String str66 = locale45.getDisplayLanguage(locale60);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField28 and durationField52", (durationField28.compareTo(durationField52) == 0) == durationField28.equals(durationField52));
    }

    @Test
    public void test686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test686");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DurationField durationField4 = islamicChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.yearOfEra();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology2.era();
        org.joda.time.DurationField durationField7 = islamicChronology2.years();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology2.millisOfSecond();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField7", (durationField3.compareTo(durationField7) == 0) == durationField3.equals(durationField7));
    }

    @Test
    public void test687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test687");
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 1);
        int int3 = localDateTime2.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology8 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone7);
        org.joda.time.DateTime dateTime9 = localDateTime2.toDateTime(dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology12 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone11);
        org.joda.time.DurationField durationField13 = islamicChronology12.weekyears();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology16 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone15);
        boolean boolean18 = dateTimeZone15.equals((java.lang.Object) 10L);
        org.joda.time.Chronology chronology19 = islamicChronology12.withZone(dateTimeZone15);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        long long23 = islamicChronology12.add(readablePeriod20, (long) (byte) 0, (-1));
        org.joda.time.DateTimeField dateTimeField24 = islamicChronology12.dayOfMonth();
        boolean boolean25 = dateTimeZone7.equals((java.lang.Object) dateTimeField24);
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime(21600112L, dateTimeZone7);
        org.joda.time.LocalDateTime.Property property27 = localDateTime26.millisOfDay();
        int int28 = localDateTime26.getYear();
        org.joda.time.LocalDateTime localDateTime30 = localDateTime26.plusMinutes(993600000);
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime((long) 1);
        int int33 = localDateTime32.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime35 = localDateTime32.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology38 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone37);
        org.joda.time.DateTime dateTime39 = localDateTime32.toDateTime(dateTimeZone37);
        java.lang.String str41 = dateTimeZone37.getName(70L);
        int int43 = dateTimeZone37.getOffsetFromLocal((long) 12);
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology46 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone45);
        int int47 = islamicChronology46.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField48 = islamicChronology46.weekyear();
        org.joda.time.DurationField durationField49 = islamicChronology46.hours();
        org.joda.time.LocalDateTime localDateTime51 = new org.joda.time.LocalDateTime((long) 1);
        int int52 = localDateTime51.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime54 = localDateTime51.minusHours((int) (byte) -1);
        org.joda.time.DateTimeField[] dateTimeFieldArray55 = localDateTime54.getFields();
        org.joda.time.LocalDateTime localDateTime57 = localDateTime54.minusDays(4);
        org.joda.time.DateTimeZone dateTimeZone59 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology60 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone59);
        org.joda.time.DateTimeField dateTimeField61 = islamicChronology60.yearOfCentury();
        org.joda.time.DurationField durationField62 = islamicChronology60.years();
        org.joda.time.DurationField durationField63 = islamicChronology60.halfdays();
        org.joda.time.DateTimeField dateTimeField64 = islamicChronology60.hourOfHalfday();
        org.joda.time.LocalDateTime localDateTime66 = new org.joda.time.LocalDateTime((long) 1);
        int int67 = localDateTime66.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime69 = localDateTime66.minusHours((int) (byte) -1);
        int int70 = localDateTime66.getSecondOfMinute();
        int[] intArray77 = new int[] { 292278993, ' ', (short) 1, (short) -1, (byte) -1 };
        int[] intArray79 = dateTimeField64.set((org.joda.time.ReadablePartial) localDateTime66, (int) (byte) 0, intArray77, 10);
        islamicChronology46.validate((org.joda.time.ReadablePartial) localDateTime54, intArray79);
        org.joda.time.DurationField durationField81 = islamicChronology46.years();
        boolean boolean82 = dateTimeZone37.equals((java.lang.Object) durationField81);
        long long85 = durationField81.subtract(48L, 951);
        org.joda.time.DurationFieldType durationFieldType86 = durationField81.getType();
        boolean boolean87 = localDateTime30.isSupported(durationFieldType86);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField13 and durationField62", (durationField13.compareTo(durationField62) == 0) == durationField13.equals(durationField62));
    }

    @Test
    public void test688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test688");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        int int2 = localDateTime1.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.minusHours((int) (byte) -1);
        int int6 = localDateTime1.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.LocalDateTime localDateTime10 = localDateTime1.minus(readablePeriod9);
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime((long) 1);
        int int13 = localDateTime12.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime12.minusHours((int) (byte) -1);
        int int16 = localDateTime12.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime12.withMinuteOfHour((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime12.plusHours((int) (byte) 100);
        java.util.Date date21 = localDateTime20.toDate();
        org.joda.time.DateTime dateTime22 = localDateTime20.toDateTime();
        org.joda.time.Instant instant23 = dateTime22.toInstant();
        org.joda.time.DateTime dateTime24 = localDateTime1.toDateTime((org.joda.time.ReadableInstant) instant23);
        long long25 = dateTime24.getMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime22 and instant23", (dateTime22.compareTo(instant23) == 0) == dateTime22.equals(instant23));
    }

    @Test
    public void test689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test689");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        int int3 = islamicChronology2.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology2.secondOfDay();
        org.joda.time.DurationField durationField5 = islamicChronology2.seconds();
        java.lang.String str6 = islamicChronology2.toString();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology2.minuteOfDay();
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime((long) 1);
        int int10 = localDateTime9.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime9.minusHours((int) (byte) -1);
        int int13 = localDateTime9.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime9.withMinuteOfHour((int) (byte) 1);
        java.util.Locale.Builder builder17 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder19 = builder17.setVariant("");
        java.util.Locale locale20 = builder19.build();
        java.util.Locale locale22 = new java.util.Locale("");
        java.util.Locale.Builder builder23 = builder19.setLocale(locale22);
        java.util.Locale locale24 = java.util.Locale.TAIWAN;
        boolean boolean25 = locale24.hasExtensions();
        java.util.Locale locale26 = locale24.stripExtensions();
        java.lang.String str27 = locale24.getDisplayCountry();
        java.util.Locale locale28 = java.util.Locale.TAIWAN;
        boolean boolean29 = locale28.hasExtensions();
        java.lang.String str30 = locale24.getDisplayCountry(locale28);
        java.util.Locale.Builder builder31 = builder19.setLocale(locale28);
        java.util.Locale.setDefault(locale28);
        java.lang.String str33 = dateTimeField7.getAsText((org.joda.time.ReadablePartial) localDateTime9, 23, locale28);
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime((long) 1);
        int int36 = localDateTime35.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime38 = localDateTime35.withYear((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod39 = null;
        org.joda.time.LocalDateTime localDateTime41 = localDateTime38.withPeriodAdded(readablePeriod39, 10);
        org.joda.time.ReadablePeriod readablePeriod42 = null;
        org.joda.time.LocalDateTime localDateTime44 = localDateTime41.withPeriodAdded(readablePeriod42, 10);
        org.joda.time.LocalDateTime localDateTime46 = new org.joda.time.LocalDateTime((long) 1);
        int int47 = localDateTime46.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime49 = localDateTime46.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology52 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone51);
        org.joda.time.DateTime dateTime53 = localDateTime46.toDateTime(dateTimeZone51);
        org.joda.time.ReadableInstant readableInstant54 = null;
        boolean boolean55 = dateTime53.isAfter(readableInstant54);
        org.joda.time.LocalDateTime localDateTime57 = new org.joda.time.LocalDateTime((long) 1);
        int int58 = localDateTime57.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime60 = localDateTime57.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone62 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology63 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone62);
        org.joda.time.DateTime dateTime64 = localDateTime57.toDateTime(dateTimeZone62);
        org.joda.time.LocalDateTime localDateTime66 = new org.joda.time.LocalDateTime((long) 1);
        int int67 = localDateTime66.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime69 = localDateTime66.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone71 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology72 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone71);
        org.joda.time.DateTime dateTime73 = localDateTime66.toDateTime(dateTimeZone71);
        long long74 = dateTime73.getMillis();
        boolean boolean75 = dateTime64.isAfter((org.joda.time.ReadableInstant) dateTime73);
        long long76 = dateTime73.getMillis();
        boolean boolean77 = dateTime53.isAfter((org.joda.time.ReadableInstant) dateTime73);
        org.joda.time.DateTime dateTime78 = localDateTime44.toDateTime((org.joda.time.ReadableInstant) dateTime53);
        org.joda.time.DateTime dateTime79 = localDateTime9.toDateTime((org.joda.time.ReadableInstant) dateTime78);
        java.lang.String str80 = dateTime79.toString();
        org.joda.time.Instant instant81 = dateTime79.toInstant();
        org.joda.time.LocalDateTime localDateTime88 = new org.joda.time.LocalDateTime(100, (int) (short) 10, (int) (short) 10, (int) (byte) 0, 0, (int) ' ');
        int int89 = localDateTime88.getMinuteOfHour();
        org.joda.time.LocalDateTime.Property property90 = localDateTime88.hourOfDay();
        org.joda.time.LocalDateTime localDateTime92 = property90.addToCopy((int) (byte) 100);
        org.joda.time.LocalDateTime.Property property93 = localDateTime92.dayOfMonth();
        java.lang.String str94 = property93.getAsText();
        org.joda.time.DateTimeFieldType dateTimeFieldType95 = property93.getFieldType();
        int int96 = dateTime79.get(dateTimeFieldType95);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime53 and instant81", (dateTime53.compareTo(instant81) == 0) == dateTime53.equals(instant81));
    }

    @Test
    public void test690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test690");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = islamicChronology2.years();
        org.joda.time.DurationField durationField5 = islamicChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology2.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology2.dayOfYear();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology2.hourOfHalfday();
        org.joda.time.DurationField durationField9 = islamicChronology2.minutes();
        org.joda.time.DurationField durationField10 = islamicChronology2.years();
        org.joda.time.DurationField durationField11 = islamicChronology2.years();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology14 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone13);
        org.joda.time.DurationField durationField15 = islamicChronology14.weekyears();
        org.joda.time.DurationField durationField16 = islamicChronology14.halfdays();
        org.joda.time.DateTimeField dateTimeField17 = islamicChronology14.yearOfEra();
        org.joda.time.DateTimeField dateTimeField18 = islamicChronology14.halfdayOfDay();
        org.joda.time.DurationField durationField19 = islamicChronology14.halfdays();
        org.joda.time.DateTimeZone dateTimeZone20 = islamicChronology14.getZone();
        java.lang.String str21 = islamicChronology14.toString();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology24 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone23);
        org.joda.time.DurationField durationField25 = islamicChronology24.weekyears();
        org.joda.time.DurationField durationField26 = islamicChronology24.halfdays();
        org.joda.time.DateTimeField dateTimeField27 = islamicChronology24.yearOfEra();
        org.joda.time.DateTimeField dateTimeField28 = islamicChronology24.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField29 = islamicChronology24.weekyearOfCentury();
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime((long) 1);
        int int33 = localDateTime32.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime35 = localDateTime32.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology38 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone37);
        org.joda.time.DateTime dateTime39 = localDateTime32.toDateTime(dateTimeZone37);
        java.lang.String str40 = dateTimeZone37.getID();
        org.joda.time.LocalDateTime localDateTime41 = new org.joda.time.LocalDateTime((-20217598030L), dateTimeZone37);
        org.joda.time.Chronology chronology42 = islamicChronology24.withZone(dateTimeZone37);
        java.util.Locale locale44 = java.util.Locale.KOREA;
        java.util.Locale locale45 = java.util.Locale.KOREA;
        java.lang.String str46 = locale44.getDisplayLanguage(locale45);
        java.util.Locale.setDefault(locale44);
        java.lang.String str48 = dateTimeZone37.getShortName((-4320000001L), locale44);
        long long50 = dateTimeZone37.nextTransition(9185187933840384L);
        org.joda.time.Chronology chronology51 = islamicChronology14.withZone(dateTimeZone37);
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology54 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone53);
        org.joda.time.DurationField durationField55 = islamicChronology54.weekyears();
        org.joda.time.DateTimeZone dateTimeZone57 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology58 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone57);
        boolean boolean60 = dateTimeZone57.equals((java.lang.Object) 10L);
        org.joda.time.Chronology chronology61 = islamicChronology54.withZone(dateTimeZone57);
        long long63 = dateTimeZone37.getMillisKeepLocal(dateTimeZone57, 19360302568999L);
        org.joda.time.Chronology chronology64 = islamicChronology2.withZone(dateTimeZone57);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField15", (durationField4.compareTo(durationField15) == 0) == durationField4.equals(durationField15));
    }

    @Test
    public void test691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test691");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology6 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone5);
        boolean boolean8 = dateTimeZone5.equals((java.lang.Object) 10L);
        org.joda.time.Chronology chronology9 = islamicChronology2.withZone(dateTimeZone5);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        long long13 = islamicChronology2.add(readablePeriod10, (long) (byte) 0, (-1));
        org.joda.time.DateTimeField dateTimeField14 = islamicChronology2.halfdayOfDay();
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((long) 1);
        int int17 = localDateTime16.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.minusHours((int) (byte) -1);
        int int21 = localDateTime16.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime16.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        org.joda.time.LocalDateTime localDateTime25 = localDateTime16.minus(readablePeriod24);
        int int26 = localDateTime25.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField28 = localDateTime25.getField(0);
        org.joda.time.LocalDateTime.Property property29 = localDateTime25.centuryOfEra();
        org.joda.time.ReadableDuration readableDuration30 = null;
        org.joda.time.LocalDateTime localDateTime31 = localDateTime25.plus(readableDuration30);
        long long33 = islamicChronology2.set((org.joda.time.ReadablePartial) localDateTime25, (long) 59);
        org.joda.time.LocalDateTime localDateTime35 = localDateTime25.minusDays((int) (byte) 10);
        int int36 = localDateTime35.getMillisOfDay();
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology39 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone38);
        org.joda.time.DateTimeField dateTimeField40 = islamicChronology39.yearOfCentury();
        org.joda.time.DurationField durationField41 = islamicChronology39.years();
        org.joda.time.LocalDateTime localDateTime43 = new org.joda.time.LocalDateTime((long) 1);
        int int44 = localDateTime43.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime46 = localDateTime43.minusHours((int) (byte) -1);
        int int48 = localDateTime43.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime50 = localDateTime43.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod51 = null;
        org.joda.time.LocalDateTime localDateTime52 = localDateTime43.minus(readablePeriod51);
        int int53 = localDateTime52.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField55 = localDateTime52.getField(0);
        org.joda.time.LocalDateTime.Property property56 = localDateTime52.centuryOfEra();
        int[] intArray58 = islamicChronology39.get((org.joda.time.ReadablePartial) localDateTime52, (long) 0);
        org.joda.time.LocalDateTime localDateTime60 = localDateTime52.withMillisOfSecond(60);
        int int61 = localDateTime60.getSecondOfMinute();
        org.joda.time.LocalDateTime.Property property62 = localDateTime60.dayOfMonth();
        int int63 = localDateTime60.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime64 = localDateTime35.withFields((org.joda.time.ReadablePartial) localDateTime60);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField41", (durationField3.compareTo(durationField41) == 0) == durationField3.equals(durationField41));
    }

    @Test
    public void test692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test692");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = islamicChronology2.years();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) 1);
        int int7 = localDateTime6.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.minusHours((int) (byte) -1);
        int int11 = localDateTime6.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime6.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalDateTime localDateTime15 = localDateTime6.minus(readablePeriod14);
        int int16 = localDateTime15.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField18 = localDateTime15.getField(0);
        org.joda.time.LocalDateTime.Property property19 = localDateTime15.centuryOfEra();
        int[] intArray21 = islamicChronology2.get((org.joda.time.ReadablePartial) localDateTime15, (long) 0);
        org.joda.time.DateTimeField dateTimeField22 = islamicChronology2.millisOfDay();
        org.joda.time.DurationField durationField23 = islamicChronology2.centuries();
        org.joda.time.DateTimeZone dateTimeZone24 = islamicChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField25 = islamicChronology2.dayOfMonth();
        java.lang.String str26 = dateTimeField25.toString();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology29 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone28);
        org.joda.time.DurationField durationField30 = islamicChronology29.weekyears();
        org.joda.time.DurationField durationField31 = islamicChronology29.halfdays();
        org.joda.time.DateTimeField dateTimeField32 = islamicChronology29.yearOfEra();
        org.joda.time.DateTimeField dateTimeField33 = islamicChronology29.clockhourOfDay();
        int int34 = dateTimeField33.getMaximumValue();
        org.joda.time.DurationField durationField35 = dateTimeField33.getLeapDurationField();
        long long37 = dateTimeField33.roundCeiling((long) 82800001);
        org.joda.time.ReadablePartial readablePartial38 = null;
        java.util.Locale locale40 = java.util.Locale.KOREA;
        java.util.Set<java.lang.String> strSet41 = locale40.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.Character> charSet42 = locale40.getExtensionKeys();
        java.lang.String str43 = dateTimeField33.getAsShortText(readablePartial38, (-3600000), locale40);
        int int44 = dateTimeField25.getMaximumTextLength(locale40);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField30", (durationField4.compareTo(durationField30) == 0) == durationField4.equals(durationField30));
    }

    @Test
    public void test693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test693");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        java.lang.String str3 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology4 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField5 = islamicChronology4.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology4.millisOfSecond();
        org.joda.time.DurationField durationField7 = islamicChronology4.eras();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology4.millisOfSecond();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField5 and durationField7", Math.signum(durationField5.compareTo(durationField7)) == -Math.signum(durationField7.compareTo(durationField5)));
    }

    @Test
    public void test694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test694");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DurationField durationField4 = islamicChronology2.millis();
        org.joda.time.DurationField durationField5 = islamicChronology2.hours();
        org.joda.time.DurationField durationField6 = islamicChronology2.centuries();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology2.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology2.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology2.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((long) 1);
        int int12 = localDateTime11.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.minusHours((int) (byte) -1);
        int int16 = localDateTime11.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime11.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.LocalDateTime localDateTime20 = localDateTime11.minus(readablePeriod19);
        org.joda.time.LocalDateTime.Property property21 = localDateTime11.millisOfSecond();
        long long22 = property21.remainder();
        java.lang.String str23 = property21.getName();
        java.util.Locale locale24 = java.util.Locale.CHINA;
        java.lang.String str25 = property21.getAsText(locale24);
        org.joda.time.LocalDateTime localDateTime26 = property21.withMinimumValue();
        org.joda.time.LocalDateTime localDateTime28 = localDateTime26.withYear(69);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime26.plusMinutes((int) 'u');
        int[] intArray32 = islamicChronology2.get((org.joda.time.ReadablePartial) localDateTime26, 18579540002L);
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime((long) 1);
        int int35 = localDateTime34.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime37 = localDateTime34.minusHours((int) (byte) -1);
        int int38 = localDateTime34.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime40 = localDateTime34.minusMinutes((int) '#');
        org.joda.time.LocalDateTime.Property property41 = localDateTime40.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime42 = property41.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime44 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.LocalDateTime localDateTime45 = localDateTime42.withFields((org.joda.time.ReadablePartial) localDateTime44);
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology48 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone47);
        org.joda.time.DateTimeField dateTimeField49 = islamicChronology48.yearOfCentury();
        org.joda.time.DurationField durationField50 = islamicChronology48.years();
        org.joda.time.LocalDateTime localDateTime52 = new org.joda.time.LocalDateTime((long) 1);
        int int53 = localDateTime52.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime55 = localDateTime52.minusHours((int) (byte) -1);
        int int57 = localDateTime52.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime59 = localDateTime52.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod60 = null;
        org.joda.time.LocalDateTime localDateTime61 = localDateTime52.minus(readablePeriod60);
        int int62 = localDateTime61.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField64 = localDateTime61.getField(0);
        org.joda.time.LocalDateTime.Property property65 = localDateTime61.centuryOfEra();
        int[] intArray67 = islamicChronology48.get((org.joda.time.ReadablePartial) localDateTime61, (long) 0);
        org.joda.time.DateTimeField dateTimeField68 = islamicChronology48.millisOfDay();
        org.joda.time.DurationField durationField69 = islamicChronology48.centuries();
        org.joda.time.DateTimeZone dateTimeZone70 = islamicChronology48.getZone();
        org.joda.time.LocalDateTime localDateTime72 = new org.joda.time.LocalDateTime((long) 1);
        int int73 = localDateTime72.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime75 = localDateTime72.minusHours((int) (byte) -1);
        int int77 = localDateTime72.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime79 = localDateTime72.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod80 = null;
        org.joda.time.LocalDateTime localDateTime81 = localDateTime72.minus(readablePeriod80);
        int int82 = localDateTime81.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField84 = localDateTime81.getField(0);
        org.joda.time.LocalDateTime.Property property85 = localDateTime81.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime87 = localDateTime81.withMonthOfYear((int) (short) 10);
        boolean boolean88 = dateTimeZone70.isLocalDateTimeGap(localDateTime81);
        org.joda.time.LocalDateTime.Property property89 = localDateTime81.yearOfEra();
        int int90 = localDateTime44.compareTo((org.joda.time.ReadablePartial) localDateTime81);
        org.joda.time.LocalDateTime.Property property91 = localDateTime81.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime93 = localDateTime81.minusHours(51);
        org.joda.time.LocalDateTime.Property property94 = localDateTime93.dayOfYear();
        boolean boolean95 = localDateTime26.isEqual((org.joda.time.ReadablePartial) localDateTime93);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField50", (durationField3.compareTo(durationField50) == 0) == durationField3.equals(durationField50));
    }

    @Test
    public void test695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test695");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology2.weekyear();
        org.joda.time.DurationField durationField4 = islamicChronology2.weekyears();
        org.joda.time.DateTimeZone dateTimeZone5 = islamicChronology2.getZone();
        org.joda.time.chrono.IslamicChronology islamicChronology6 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = islamicChronology6.getZone();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone7);
        int int10 = dateTimeZone7.getOffsetFromLocal(745732313852400070L);
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime((long) 1);
        int int13 = localDateTime12.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime12.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology18 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone17);
        org.joda.time.DateTime dateTime19 = localDateTime12.toDateTime(dateTimeZone17);
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime((long) 1);
        int int22 = localDateTime21.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime24 = localDateTime21.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology27 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone26);
        org.joda.time.DateTime dateTime28 = localDateTime21.toDateTime(dateTimeZone26);
        long long29 = dateTime28.getMillis();
        boolean boolean30 = dateTime19.isAfter((org.joda.time.ReadableInstant) dateTime28);
        long long31 = dateTime28.getMillis();
        org.joda.time.Instant instant32 = dateTime28.toInstant();
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology35 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone34);
        boolean boolean37 = dateTimeZone34.equals((java.lang.Object) 10L);
        java.util.Locale locale39 = java.util.Locale.JAPAN;
        java.lang.String str40 = locale39.getISO3Country();
        java.lang.String str41 = dateTimeZone34.getShortName(1970L, locale39);
        java.util.TimeZone timeZone42 = dateTimeZone34.toTimeZone();
        long long45 = dateTimeZone34.convertLocalToUTC(2626841168L, false);
        boolean boolean46 = instant32.equals((java.lang.Object) false);
        org.joda.time.DateTimeZone dateTimeZone47 = instant32.getZone();
        org.joda.time.Instant instant48 = instant32.toInstant();
        int int49 = dateTimeZone7.getOffset((org.joda.time.ReadableInstant) instant48);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime19 and instant48", (dateTime19.compareTo(instant48) == 0) == dateTime19.equals(instant48));
    }

    @Test
    public void test696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test696");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology6 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone5);
        boolean boolean8 = dateTimeZone5.equals((java.lang.Object) 10L);
        org.joda.time.Chronology chronology9 = islamicChronology2.withZone(dateTimeZone5);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        long long13 = islamicChronology2.add(readablePeriod10, (long) (byte) 0, (-1));
        org.joda.time.DateTimeField dateTimeField14 = islamicChronology2.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField15 = islamicChronology2.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField16 = islamicChronology2.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField17 = islamicChronology2.secondOfMinute();
        org.joda.time.DurationField durationField18 = islamicChronology2.years();
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        long long22 = islamicChronology2.add(readablePeriod19, 311040086400000L, (-9));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField18", (durationField3.compareTo(durationField18) == 0) == durationField3.equals(durationField18));
    }

    @Test
    public void test697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test697");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DurationField durationField4 = islamicChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.yearOfEra();
        org.joda.time.DurationField durationField6 = islamicChronology2.halfdays();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((org.joda.time.Chronology) islamicChronology2);
        org.joda.time.DurationField durationField8 = islamicChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology2.hourOfDay();
        org.joda.time.DurationField durationField10 = islamicChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology2.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology2.weekyearOfCentury();
        org.joda.time.DurationField durationField13 = islamicChronology2.years();
        org.joda.time.DateTimeField dateTimeField14 = islamicChronology2.weekOfWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField13", (durationField3.compareTo(durationField13) == 0) == durationField3.equals(durationField13));
    }

    @Test
    public void test698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test698");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology2.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology2.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology2.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology2.year();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology2.millisOfDay();
        org.joda.time.DurationField durationField10 = islamicChronology2.years();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology2.secondOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField10", (durationField3.compareTo(durationField10) == 0) == durationField3.equals(durationField10));
    }

    @Test
    public void test699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test699");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DurationField durationField4 = islamicChronology2.months();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.minuteOfHour();
        org.joda.time.DurationField durationField6 = islamicChronology2.hours();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology2.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology2.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone9 = islamicChronology2.getZone();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology12 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone11);
        org.joda.time.DateTimeField dateTimeField13 = islamicChronology12.weekyear();
        org.joda.time.DurationField durationField14 = islamicChronology12.years();
        org.joda.time.DateTimeField dateTimeField15 = islamicChronology12.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField16 = islamicChronology12.hourOfDay();
        org.joda.time.DateTimeField dateTimeField17 = islamicChronology12.hourOfHalfday();
        boolean boolean18 = dateTimeZone9.equals((java.lang.Object) dateTimeField17);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField14", (durationField3.compareTo(durationField14) == 0) == durationField3.equals(durationField14));
    }

    @Test
    public void test700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test700");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        int int2 = localDateTime1.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology7 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone6);
        org.joda.time.DateTime dateTime8 = localDateTime1.toDateTime(dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((long) 1);
        int int11 = localDateTime10.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime10.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology16 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone15);
        org.joda.time.DateTime dateTime17 = localDateTime10.toDateTime(dateTimeZone15);
        long long18 = dateTime17.getMillis();
        boolean boolean19 = dateTime8.isAfter((org.joda.time.ReadableInstant) dateTime17);
        long long20 = dateTime17.getMillis();
        java.lang.String str21 = dateTime17.toString();
        org.joda.time.Instant instant22 = dateTime17.toInstant();
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime(100, (int) (short) 10, (int) (short) 10, (int) (byte) 0, 0, (int) ' ');
        int int30 = localDateTime29.getMinuteOfHour();
        org.joda.time.LocalDateTime.Property property31 = localDateTime29.hourOfDay();
        org.joda.time.LocalDateTime localDateTime33 = property31.addToCopy((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime34 = property31.roundFloorCopy();
        org.joda.time.LocalDateTime localDateTime36 = new org.joda.time.LocalDateTime((long) 1);
        int int37 = localDateTime36.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime39 = localDateTime36.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology42 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone41);
        org.joda.time.DateTime dateTime43 = localDateTime36.toDateTime(dateTimeZone41);
        long long44 = dateTime43.getMillis();
        long long45 = dateTime43.getMillis();
        org.joda.time.Instant instant46 = dateTime43.toInstant();
        org.joda.time.LocalDateTime localDateTime48 = new org.joda.time.LocalDateTime((long) 1);
        int int49 = localDateTime48.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime51 = localDateTime48.minusHours((int) (byte) -1);
        org.joda.time.DateTimeField[] dateTimeFieldArray52 = localDateTime51.getFields();
        org.joda.time.LocalDateTime localDateTime54 = localDateTime51.minusDays(4);
        org.joda.time.LocalDateTime localDateTime56 = new org.joda.time.LocalDateTime((long) 1);
        int int57 = localDateTime56.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime59 = localDateTime56.minusHours((int) (byte) -1);
        int int61 = localDateTime56.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime63 = localDateTime56.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod64 = null;
        org.joda.time.LocalDateTime localDateTime65 = localDateTime56.minus(readablePeriod64);
        int int66 = localDateTime65.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField68 = localDateTime65.getField(0);
        org.joda.time.LocalDateTime.Property property69 = localDateTime65.centuryOfEra();
        org.joda.time.LocalDateTime.Property property70 = localDateTime65.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime75 = localDateTime65.withTime((int) (byte) 1, 0, 5, (int) (byte) 100);
        boolean boolean76 = localDateTime51.isBefore((org.joda.time.ReadablePartial) localDateTime75);
        org.joda.time.LocalDateTime.Property property77 = localDateTime75.weekyear();
        int int78 = property77.getLeapAmount();
        org.joda.time.LocalDateTime localDateTime80 = property77.addWrapFieldToCopy(45);
        org.joda.time.LocalDateTime localDateTime82 = new org.joda.time.LocalDateTime((long) 1);
        int int83 = localDateTime82.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime85 = localDateTime82.withYear((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod86 = null;
        org.joda.time.LocalDateTime localDateTime88 = localDateTime85.withPeriodAdded(readablePeriod86, 10);
        org.joda.time.LocalDateTime localDateTime90 = localDateTime88.withDayOfYear(11);
        org.joda.time.LocalDateTime localDateTime92 = localDateTime90.withYear(10);
        org.joda.time.DateTime dateTime93 = localDateTime90.toDateTime();
        long long94 = dateTime93.getMillis();
        int int95 = property77.compareTo((org.joda.time.ReadableInstant) dateTime93);
        org.joda.time.DateTimeZone dateTimeZone96 = dateTime93.getZone();
        boolean boolean97 = instant46.isAfter((org.joda.time.ReadableInstant) dateTime93);
        org.joda.time.DateTime dateTime98 = localDateTime34.toDateTime((org.joda.time.ReadableInstant) instant46);
        boolean boolean99 = dateTime17.isEqual((org.joda.time.ReadableInstant) dateTime98);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and instant22", (dateTime8.compareTo(instant22) == 0) == dateTime8.equals(instant22));
    }

    @Test
    public void test701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test701");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = islamicChronology2.years();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) 1);
        int int7 = localDateTime6.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.minusHours((int) (byte) -1);
        int int11 = localDateTime6.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime6.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalDateTime localDateTime15 = localDateTime6.minus(readablePeriod14);
        int int16 = localDateTime15.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField18 = localDateTime15.getField(0);
        org.joda.time.LocalDateTime.Property property19 = localDateTime15.centuryOfEra();
        int[] intArray21 = islamicChronology2.get((org.joda.time.ReadablePartial) localDateTime15, (long) 0);
        org.joda.time.DateTimeField dateTimeField22 = islamicChronology2.millisOfDay();
        org.joda.time.DurationField durationField23 = islamicChronology2.centuries();
        org.joda.time.DateTimeZone dateTimeZone24 = islamicChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField25 = islamicChronology2.dayOfWeek();
        org.joda.time.DurationField durationField26 = islamicChronology2.minutes();
        org.joda.time.DateTimeField dateTimeField27 = islamicChronology2.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField28 = islamicChronology2.hourOfHalfday();
        org.joda.time.DurationField durationField29 = islamicChronology2.years();
        org.joda.time.DurationField durationField30 = islamicChronology2.minutes();
        org.joda.time.DurationField durationField31 = islamicChronology2.hours();
        org.joda.time.DurationField durationField32 = islamicChronology2.months();
        org.joda.time.DateTimeField dateTimeField33 = islamicChronology2.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField34 = islamicChronology2.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField35 = islamicChronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField36 = islamicChronology2.minuteOfDay();
        org.joda.time.LocalDateTime localDateTime39 = new org.joda.time.LocalDateTime((java.lang.Object) 2551440384L);
        org.joda.time.LocalDateTime.Property property40 = localDateTime39.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime41 = property40.getLocalDateTime();
        java.util.Locale locale45 = new java.util.Locale("GMT", "1970-01-01T02:00:00.001", "0100-10-10T00:00:32.000");
        java.util.Locale locale49 = new java.util.Locale("0099-01-01T01:00:00.001", "Korean", "DurationField[seconds]");
        java.lang.String str50 = locale45.getDisplayCountry(locale49);
        int int51 = property40.getMaximumShortTextLength(locale45);
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology54 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone53);
        org.joda.time.DurationField durationField55 = islamicChronology54.weekyears();
        org.joda.time.DurationField durationField56 = islamicChronology54.halfdays();
        org.joda.time.DateTimeField dateTimeField57 = islamicChronology54.yearOfEra();
        org.joda.time.DateTimeField dateTimeField58 = islamicChronology54.halfdayOfDay();
        org.joda.time.LocalDateTime localDateTime60 = new org.joda.time.LocalDateTime((long) 1);
        int int61 = localDateTime60.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime63 = localDateTime60.minusHours((int) (byte) -1);
        int int64 = localDateTime60.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime66 = localDateTime60.minusMinutes((int) '#');
        org.joda.time.LocalDateTime localDateTime68 = localDateTime60.plusMonths((-1));
        org.joda.time.LocalDateTime localDateTime70 = new org.joda.time.LocalDateTime((long) 1);
        int int71 = localDateTime70.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime73 = localDateTime70.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone75 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology76 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone75);
        org.joda.time.DurationField durationField77 = islamicChronology76.weekyears();
        org.joda.time.DurationField durationField78 = islamicChronology76.halfdays();
        org.joda.time.DateTimeField dateTimeField79 = islamicChronology76.yearOfEra();
        org.joda.time.DurationField durationField80 = islamicChronology76.halfdays();
        org.joda.time.DurationFieldType durationFieldType81 = durationField80.getType();
        boolean boolean82 = localDateTime70.isSupported(durationFieldType81);
        org.joda.time.LocalDateTime localDateTime84 = localDateTime60.withFieldAdded(durationFieldType81, 12);
        org.joda.time.tz.NameProvider nameProvider85 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale86 = java.util.Locale.KOREA;
        java.util.Set<java.lang.String> strSet87 = locale86.getUnicodeLocaleAttributes();
        java.lang.String str89 = locale86.getUnicodeLocaleType("FR");
        java.lang.String str92 = nameProvider85.getName(locale86, "\uc601\uc5b4", "GMT+00:00");
        java.lang.String str93 = dateTimeField58.getAsText((org.joda.time.ReadablePartial) localDateTime60, locale86);
        java.lang.String str94 = locale86.getISO3Language();
        java.util.Locale locale95 = locale86.stripExtensions();
        java.lang.String str96 = locale45.getDisplayScript(locale86);
        java.lang.String str97 = dateTimeField36.getAsShortText(289, locale45);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField55", (durationField4.compareTo(durationField55) == 0) == durationField4.equals(durationField55));
    }

    @Test
    public void test702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test702");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology2.hourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.year();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology2.minuteOfDay();
        org.joda.time.DurationField durationField7 = islamicChronology2.years();
        org.joda.time.DurationField durationField8 = islamicChronology2.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField7", (durationField3.compareTo(durationField7) == 0) == durationField3.equals(durationField7));
    }

    @Test
    public void test703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test703");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DurationField durationField4 = islamicChronology2.months();
        org.joda.time.DurationField durationField5 = islamicChronology2.centuries();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology2.clockhourOfHalfday();
        org.joda.time.DurationField durationField7 = islamicChronology2.weeks();
        org.joda.time.DurationField durationField8 = islamicChronology2.months();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology11 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone10);
        boolean boolean12 = dateTimeZone10.isFixed();
        org.joda.time.Chronology chronology13 = islamicChronology2.withZone(dateTimeZone10);
        org.joda.time.DurationField durationField14 = islamicChronology2.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField14, durationField3, and durationField4", !(durationField14.compareTo(durationField3) == 0) || (Math.signum(durationField14.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test704");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology4 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology4.weekyear();
        org.joda.time.DurationField durationField6 = islamicChronology4.years();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology4.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone8 = islamicChronology4.getZone();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology4.clockhourOfDay();
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((long) 1);
        int int12 = localDateTime11.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.minusHours((int) (byte) -1);
        int int15 = localDateTime11.getSecondOfMinute();
        int int16 = localDateTime11.getCenturyOfEra();
        long long18 = islamicChronology4.set((org.joda.time.ReadablePartial) localDateTime11, 70L);
        org.joda.time.LocalDateTime.Property property19 = localDateTime11.era();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime11.withCenturyOfEra(19);
        boolean boolean22 = dateTimeZone1.isLocalDateTimeGap(localDateTime21);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology25 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone24);
        org.joda.time.DurationField durationField26 = islamicChronology25.weekyears();
        org.joda.time.DateTimeField dateTimeField27 = islamicChronology25.millisOfSecond();
        long long31 = islamicChronology25.add((long) (byte) -1, (long) 0, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime((long) 1);
        int int34 = localDateTime33.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime36 = localDateTime33.minusHours((int) (byte) -1);
        int int38 = localDateTime33.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime40 = localDateTime33.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod41 = null;
        org.joda.time.LocalDateTime localDateTime42 = localDateTime33.minus(readablePeriod41);
        int int43 = localDateTime42.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField45 = localDateTime42.getField(0);
        org.joda.time.LocalDateTime.Property property46 = localDateTime42.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime48 = localDateTime42.withMonthOfYear((int) (short) 10);
        boolean boolean49 = islamicChronology25.equals((java.lang.Object) localDateTime42);
        org.joda.time.DurationField durationField50 = islamicChronology25.minutes();
        org.joda.time.DurationField durationField51 = islamicChronology25.hours();
        org.joda.time.DateTimeField dateTimeField52 = islamicChronology25.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField53 = islamicChronology25.weekOfWeekyear();
        boolean boolean54 = localDateTime21.equals((java.lang.Object) islamicChronology25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField26", (durationField6.compareTo(durationField26) == 0) == durationField6.equals(durationField26));
    }

    @Test
    public void test705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test705");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = islamicChronology2.years();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) 1);
        int int7 = localDateTime6.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.minusHours((int) (byte) -1);
        int int11 = localDateTime6.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime6.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalDateTime localDateTime15 = localDateTime6.minus(readablePeriod14);
        int int16 = localDateTime15.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField18 = localDateTime15.getField(0);
        org.joda.time.LocalDateTime.Property property19 = localDateTime15.centuryOfEra();
        int[] intArray21 = islamicChronology2.get((org.joda.time.ReadablePartial) localDateTime15, (long) 0);
        org.joda.time.DateTimeField dateTimeField22 = islamicChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField23 = islamicChronology2.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology26 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone25);
        org.joda.time.DurationField durationField27 = islamicChronology26.weekyears();
        org.joda.time.DateTimeField dateTimeField28 = islamicChronology26.millisOfSecond();
        long long32 = islamicChronology26.add((long) (byte) -1, (long) 0, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime((long) 1);
        int int35 = localDateTime34.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime37 = localDateTime34.minusHours((int) (byte) -1);
        int int39 = localDateTime34.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime41 = localDateTime34.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod42 = null;
        org.joda.time.LocalDateTime localDateTime43 = localDateTime34.minus(readablePeriod42);
        int int44 = localDateTime43.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField46 = localDateTime43.getField(0);
        org.joda.time.LocalDateTime.Property property47 = localDateTime43.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime49 = localDateTime43.withMonthOfYear((int) (short) 10);
        boolean boolean50 = islamicChronology26.equals((java.lang.Object) localDateTime43);
        org.joda.time.DateTimeField dateTimeField51 = islamicChronology26.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField52 = islamicChronology26.millisOfSecond();
        org.joda.time.tz.NameProvider nameProvider54 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale55 = java.util.Locale.getDefault();
        java.lang.String str58 = nameProvider54.getName(locale55, "JPN", "0");
        java.util.Locale.Builder builder59 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder62 = builder59.setExtension('a', "FR");
        java.util.Locale.Builder builder64 = builder62.addUnicodeLocaleAttribute("KOR");
        java.util.Locale.Builder builder65 = builder64.clear();
        java.util.Locale locale66 = builder65.build();
        java.lang.String str69 = nameProvider54.getName(locale66, "\u53f0\u6e7e", "2");
        java.util.TimeZone timeZone71 = java.util.TimeZone.getTimeZone("");
        java.util.TimeZone timeZone73 = java.util.TimeZone.getTimeZone("");
        boolean boolean74 = timeZone71.hasSameRules(timeZone73);
        timeZone73.setRawOffset(11);
        org.joda.time.DateTimeZone dateTimeZone77 = org.joda.time.DateTimeZone.forTimeZone(timeZone73);
        java.util.Locale locale79 = java.util.Locale.ITALIAN;
        java.lang.String str80 = locale79.toLanguageTag();
        java.lang.String str81 = dateTimeZone77.getShortName((long) 'u', locale79);
        java.util.Set<java.lang.String> strSet82 = locale79.getUnicodeLocaleKeys();
        java.lang.String str85 = nameProvider54.getName(locale79, "FR", "24");
        java.lang.String str86 = dateTimeField52.getAsShortText(2922711, locale79);
        int int87 = dateTimeField23.getMaximumShortTextLength(locale79);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField27", (durationField4.compareTo(durationField27) == 0) == durationField4.equals(durationField27));
    }
}

