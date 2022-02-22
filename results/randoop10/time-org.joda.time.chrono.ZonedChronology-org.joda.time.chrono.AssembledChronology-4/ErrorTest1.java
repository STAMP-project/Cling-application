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
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology18 = zonedChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology12.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField21 = zonedChronology12.weekyear();
        org.joda.time.DurationField durationField22 = zonedChronology12.years();
        org.joda.time.DurationField durationField23 = zonedChronology12.weekyears();
        org.joda.time.LocalDateTime localDateTime24 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) zonedChronology12);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField22 and durationField23", (durationField22.compareTo(durationField23) == 0) == durationField22.equals(durationField23));
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test502");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology1 = null;
        boolean boolean2 = dateTimeFieldType0.isSupported(chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime(dateTimeZone3);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.minusWeeks(0);
        org.joda.time.Chronology chronology7 = localDateTime6.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = dateTimeFieldType0.getField(chronology7);
        java.lang.String str9 = dateTimeField8.getName();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(dateTimeZone10);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.minusWeeks(0);
        org.joda.time.Chronology chronology14 = localDateTime13.getChronology();
        java.util.Locale locale16 = java.util.Locale.JAPANESE;
        java.lang.String str17 = locale16.getDisplayLanguage();
        java.lang.String str18 = locale16.getISO3Country();
        java.lang.String str19 = dateTimeField8.getAsShortText((org.joda.time.ReadablePartial) localDateTime13, 2, locale16);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime13.minusDays((int) (byte) 1);
        org.joda.time.LocalDateTime.Property property22 = localDateTime13.yearOfCentury();
        org.joda.time.DurationField durationField23 = property22.getRangeDurationField();
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime(dateTimeZone24);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime25.minusWeeks(0);
        org.joda.time.Chronology chronology28 = localDateTime27.getChronology();
        org.joda.time.DurationField durationField29 = chronology28.days();
        org.joda.time.DurationField durationField30 = chronology28.minutes();
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str35 = dateTimeZone33.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology36 = org.joda.time.chrono.ZonedChronology.getInstance(chronology28, dateTimeZone33);
        org.joda.time.DurationField durationField37 = zonedChronology36.weeks();
        org.joda.time.DateTimeField dateTimeField38 = zonedChronology36.year();
        org.joda.time.DateTimeField dateTimeField39 = zonedChronology36.yearOfEra();
        org.joda.time.DurationField durationField40 = zonedChronology36.years();
        boolean boolean41 = property22.equals((java.lang.Object) zonedChronology36);
        org.joda.time.DurationField durationField42 = zonedChronology36.minutes();
        org.joda.time.DateTimeField dateTimeField43 = zonedChronology36.dayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField30 and durationField42", (durationField30.compareTo(durationField42) == 0) == durationField30.equals(durationField42));
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test503");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology18 = zonedChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology12.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField21 = zonedChronology12.weekyear();
        org.joda.time.DateTimeZone dateTimeZone22 = zonedChronology12.getZone();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology12.era();
        org.joda.time.DurationField durationField24 = zonedChronology12.halfdays();
        org.joda.time.DateTimeField dateTimeField25 = zonedChronology12.millisOfDay();
        org.joda.time.DateTimeField dateTimeField26 = zonedChronology12.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone27 = zonedChronology12.getZone();
        org.joda.time.DurationField durationField28 = zonedChronology12.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField28, durationField5, and durationField6", !(durationField28.compareTo(durationField5) == 0) || (Math.signum(durationField28.compareTo(durationField6)) == Math.signum(durationField5.compareTo(durationField6))));
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test504");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DurationField durationField13 = zonedChronology12.weeks();
        org.joda.time.DateTimeField dateTimeField14 = zonedChronology12.year();
        org.joda.time.DurationField durationField15 = zonedChronology12.months();
        org.joda.time.DateTimeField dateTimeField16 = zonedChronology12.hourOfDay();
        org.joda.time.DurationField durationField17 = zonedChronology12.days();
        org.joda.time.DateTimeField dateTimeField18 = zonedChronology12.dayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField17", (durationField5.compareTo(durationField17) == 0) == durationField5.equals(durationField17));
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test505");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DurationField durationField13 = zonedChronology12.weeks();
        org.joda.time.DateTimeField dateTimeField14 = zonedChronology12.year();
        org.joda.time.DurationField durationField15 = zonedChronology12.months();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str20 = dateTimeZone18.getShortName((long) 10);
        java.lang.String str21 = dateTimeZone18.getID();
        long long24 = dateTimeZone18.convertLocalToUTC((long) (short) 1, false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone18);
        int int27 = dateTimeZone18.getStandardOffset(1L);
        org.joda.time.chrono.ZonedChronology zonedChronology28 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) zonedChronology12, dateTimeZone18);
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology12.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField30 = zonedChronology12.centuryOfEra();
        org.joda.time.DurationField durationField31 = zonedChronology12.days();
        org.joda.time.DateTimeField dateTimeField32 = zonedChronology12.dayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField31", (durationField5.compareTo(durationField31) == 0) == durationField5.equals(durationField31));
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test506");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology18 = zonedChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology12.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        org.joda.time.Chronology chronology24 = zonedChronology12.withZone(dateTimeZone23);
        org.joda.time.DurationField durationField25 = zonedChronology12.years();
        org.joda.time.DateTimeField dateTimeField26 = zonedChronology12.dayOfYear();
        org.joda.time.DateTimeField dateTimeField27 = zonedChronology12.millisOfDay();
        org.joda.time.DateTimeField dateTimeField28 = zonedChronology12.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime((org.joda.time.Chronology) zonedChronology12);
        org.joda.time.DateTimeField dateTimeField30 = zonedChronology12.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime(dateTimeZone32);
        org.joda.time.LocalDateTime localDateTime35 = localDateTime33.minusWeeks(0);
        org.joda.time.Chronology chronology36 = localDateTime35.getChronology();
        org.joda.time.DurationField durationField37 = chronology36.days();
        org.joda.time.DurationField durationField38 = chronology36.minutes();
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str43 = dateTimeZone41.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology44 = org.joda.time.chrono.ZonedChronology.getInstance(chronology36, dateTimeZone41);
        org.joda.time.DateTimeField dateTimeField45 = zonedChronology44.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean49 = dateTimeZone47.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology50 = zonedChronology44.withZone(dateTimeZone47);
        org.joda.time.DateTimeField dateTimeField51 = zonedChronology44.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField52 = zonedChronology44.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField53 = zonedChronology44.weekyear();
        org.joda.time.DurationField durationField54 = zonedChronology44.years();
        org.joda.time.DateTimeZone dateTimeZone57 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (short) 0);
        boolean boolean59 = dateTimeZone57.isStandardOffset((long) 61673414);
        org.joda.time.Chronology chronology60 = zonedChronology44.withZone(dateTimeZone57);
        org.joda.time.LocalDateTime localDateTime61 = new org.joda.time.LocalDateTime((long) 12, (org.joda.time.Chronology) zonedChronology44);
        org.joda.time.DateTimeField dateTimeField62 = zonedChronology44.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField63 = zonedChronology44.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField64 = zonedChronology44.weekyear();
        org.joda.time.DateTimeZone dateTimeZone65 = null;
        org.joda.time.LocalDateTime localDateTime66 = new org.joda.time.LocalDateTime(dateTimeZone65);
        org.joda.time.LocalDateTime localDateTime68 = localDateTime66.minusWeeks(0);
        int int69 = localDateTime66.getWeekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType70 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime72 = localDateTime66.withField(dateTimeFieldType70, (int) '#');
        org.joda.time.LocalDateTime.Property property73 = localDateTime66.year();
        org.joda.time.LocalDateTime localDateTime75 = org.joda.time.LocalDateTime.parse("2022-02-22T17:08:21.910");
        org.joda.time.LocalDateTime.Property property76 = localDateTime75.weekyear();
        java.util.Locale locale78 = java.util.Locale.forLanguageTag("593");
        int int79 = property76.getMaximumShortTextLength(locale78);
        java.lang.String str80 = dateTimeField64.getAsShortText((org.joda.time.ReadablePartial) localDateTime66, locale78);
        int int81 = dateTimeField30.getMaximumTextLength(locale78);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField25 and durationField54", (durationField25.compareTo(durationField54) == 0) == durationField25.equals(durationField54));
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test507");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minusWeeks(0);
        org.joda.time.Chronology chronology5 = localDateTime4.getChronology();
        org.joda.time.DurationField durationField6 = chronology5.days();
        org.joda.time.DurationField durationField7 = chronology5.minutes();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str12 = dateTimeZone10.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology13 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone10);
        org.joda.time.DurationField durationField14 = zonedChronology13.weeks();
        org.joda.time.DateTimeField dateTimeField15 = zonedChronology13.year();
        org.joda.time.DurationField durationField16 = zonedChronology13.months();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str21 = dateTimeZone19.getShortName((long) 10);
        java.lang.String str22 = dateTimeZone19.getID();
        long long25 = dateTimeZone19.convertLocalToUTC((long) (short) 1, false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone19);
        int int28 = dateTimeZone19.getStandardOffset(1L);
        org.joda.time.chrono.ZonedChronology zonedChronology29 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) zonedChronology13, dateTimeZone19);
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime(1645427283555L, (org.joda.time.Chronology) zonedChronology13);
        org.joda.time.DateTimeZone dateTimeZone31 = zonedChronology13.getZone();
        org.joda.time.DurationField durationField32 = zonedChronology13.minutes();
        org.joda.time.DurationField durationField33 = zonedChronology13.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField7 and durationField32", (durationField7.compareTo(durationField32) == 0) == durationField7.equals(durationField32));
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test508");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DurationField durationField13 = zonedChronology12.weeks();
        org.joda.time.DateTimeField dateTimeField14 = zonedChronology12.yearOfEra();
        org.joda.time.DurationField durationField15 = zonedChronology12.weekyears();
        org.joda.time.DurationField durationField16 = zonedChronology12.weekyears();
        org.joda.time.DateTimeZone dateTimeZone17 = zonedChronology12.getZone();
        org.joda.time.DurationField durationField18 = zonedChronology12.millis();
        org.joda.time.DurationField durationField19 = zonedChronology12.months();
        java.lang.String str20 = zonedChronology12.toString();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime(dateTimeZone21);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime22.minusWeeks(0);
        int int25 = localDateTime24.getYearOfCentury();
        org.joda.time.LocalDateTime localDateTime27 = localDateTime24.minusMinutes(749);
        org.joda.time.ReadableDuration readableDuration28 = null;
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.minus(readableDuration28);
        org.joda.time.LocalDateTime.Property property30 = localDateTime29.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime(dateTimeZone32);
        org.joda.time.LocalDateTime localDateTime35 = localDateTime33.minusWeeks(0);
        org.joda.time.Chronology chronology36 = localDateTime35.getChronology();
        org.joda.time.DurationField durationField37 = chronology36.days();
        org.joda.time.DurationField durationField38 = chronology36.minutes();
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str43 = dateTimeZone41.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology44 = org.joda.time.chrono.ZonedChronology.getInstance(chronology36, dateTimeZone41);
        java.lang.String str45 = dateTimeZone41.getID();
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.LocalDateTime localDateTime47 = new org.joda.time.LocalDateTime(dateTimeZone46);
        org.joda.time.DateTimeZone dateTimeZone48 = null;
        org.joda.time.LocalDateTime localDateTime49 = new org.joda.time.LocalDateTime(dateTimeZone48);
        int int50 = localDateTime47.compareTo((org.joda.time.ReadablePartial) localDateTime49);
        org.joda.time.ReadableInstant readableInstant51 = null;
        org.joda.time.DateTime dateTime52 = localDateTime47.toDateTime(readableInstant51);
        boolean boolean54 = dateTime52.equals((java.lang.Object) 'a');
        org.joda.time.DateTimeZone dateTimeZone55 = null;
        org.joda.time.LocalDateTime localDateTime56 = new org.joda.time.LocalDateTime(dateTimeZone55);
        org.joda.time.DateTimeZone dateTimeZone57 = null;
        org.joda.time.LocalDateTime localDateTime58 = new org.joda.time.LocalDateTime(dateTimeZone57);
        int int59 = localDateTime56.compareTo((org.joda.time.ReadablePartial) localDateTime58);
        org.joda.time.ReadableInstant readableInstant60 = null;
        org.joda.time.DateTime dateTime61 = localDateTime56.toDateTime(readableInstant60);
        org.joda.time.DateTimeZone dateTimeZone62 = null;
        org.joda.time.LocalDateTime localDateTime63 = new org.joda.time.LocalDateTime(dateTimeZone62);
        org.joda.time.LocalDateTime.Property property64 = localDateTime63.yearOfEra();
        int int65 = property64.getMinimumValue();
        boolean boolean66 = dateTime61.equals((java.lang.Object) int65);
        org.joda.time.Chronology chronology67 = dateTime61.getChronology();
        int int68 = dateTime52.compareTo((org.joda.time.ReadableInstant) dateTime61);
        int int69 = dateTimeZone41.getOffset((org.joda.time.ReadableInstant) dateTime61);
        java.lang.String str70 = dateTimeZone41.toString();
        long long72 = dateTimeZone41.previousTransition((long) (byte) 10);
        org.joda.time.LocalDateTime localDateTime73 = new org.joda.time.LocalDateTime(dateTimeZone41);
        org.joda.time.LocalDateTime localDateTime74 = new org.joda.time.LocalDateTime((java.lang.Object) 1645427289074L, dateTimeZone41);
        int int75 = localDateTime74.getDayOfYear();
        boolean boolean76 = localDateTime29.isEqual((org.joda.time.ReadablePartial) localDateTime74);
        int[] intArray78 = zonedChronology12.get((org.joda.time.ReadablePartial) localDateTime29, 1645427439038L);
        org.joda.time.DurationField durationField79 = zonedChronology12.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField79, durationField5, and durationField6", !(durationField79.compareTo(durationField5) == 0) || (Math.signum(durationField79.compareTo(durationField6)) == Math.signum(durationField5.compareTo(durationField6))));
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test509");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology18 = zonedChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology12.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField21 = zonedChronology12.weekyear();
        org.joda.time.DurationField durationField22 = zonedChronology12.years();
        org.joda.time.DurationField durationField23 = zonedChronology12.weeks();
        org.joda.time.DurationField durationField24 = zonedChronology12.months();
        org.joda.time.DurationField durationField25 = zonedChronology12.days();
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        long long29 = zonedChronology12.add(readablePeriod26, 4554555103L, 61685839);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField25", (durationField5.compareTo(durationField25) == 0) == durationField5.equals(durationField25));
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test510");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfSecond();
        java.lang.String str1 = dateTimeFieldType0.getName();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime(dateTimeZone2);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.minusWeeks(0);
        org.joda.time.Chronology chronology6 = localDateTime5.getChronology();
        org.joda.time.DurationField durationField7 = chronology6.days();
        org.joda.time.DurationField durationField8 = chronology6.minutes();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str13 = dateTimeZone11.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology14 = org.joda.time.chrono.ZonedChronology.getInstance(chronology6, dateTimeZone11);
        org.joda.time.DurationField durationField15 = zonedChronology14.weeks();
        org.joda.time.DateTimeField dateTimeField16 = zonedChronology14.year();
        org.joda.time.DurationField durationField17 = zonedChronology14.months();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str22 = dateTimeZone20.getShortName((long) 10);
        java.lang.String str23 = dateTimeZone20.getID();
        long long26 = dateTimeZone20.convertLocalToUTC((long) (short) 1, false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone20);
        int int29 = dateTimeZone20.getStandardOffset(1L);
        org.joda.time.chrono.ZonedChronology zonedChronology30 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) zonedChronology14, dateTimeZone20);
        org.joda.time.DateTimeField dateTimeField31 = zonedChronology14.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField32 = zonedChronology14.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField33 = zonedChronology14.weekyear();
        boolean boolean34 = dateTimeFieldType0.isSupported((org.joda.time.Chronology) zonedChronology14);
        org.joda.time.DurationField durationField35 = zonedChronology14.hours();
        org.joda.time.DateTimeField dateTimeField36 = zonedChronology14.weekyear();
        org.joda.time.tz.NameProvider nameProvider37 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider37);
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.LocalDateTime localDateTime40 = new org.joda.time.LocalDateTime(dateTimeZone39);
        org.joda.time.LocalDateTime localDateTime42 = localDateTime40.minusWeeks(0);
        org.joda.time.Chronology chronology43 = localDateTime42.getChronology();
        org.joda.time.DurationField durationField44 = chronology43.days();
        org.joda.time.DurationField durationField45 = chronology43.minutes();
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str50 = dateTimeZone48.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology51 = org.joda.time.chrono.ZonedChronology.getInstance(chronology43, dateTimeZone48);
        org.joda.time.DurationField durationField52 = zonedChronology51.weeks();
        org.joda.time.DateTimeField dateTimeField53 = zonedChronology51.year();
        org.joda.time.DateTimeZone dateTimeZone54 = zonedChronology51.getZone();
        java.util.Locale locale56 = java.util.Locale.ROOT;
        java.lang.String str57 = dateTimeZone54.getShortName((long) '4', locale56);
        java.lang.String str58 = locale56.getDisplayCountry();
        java.lang.String str61 = nameProvider37.getName(locale56, "Japanese", "");
        org.joda.time.DateTimeZone.setNameProvider(nameProvider37);
        java.util.Locale locale63 = java.util.Locale.GERMAN;
        boolean boolean64 = locale63.hasExtensions();
        org.joda.time.DateTimeZone dateTimeZone65 = null;
        org.joda.time.LocalDateTime localDateTime66 = new org.joda.time.LocalDateTime(dateTimeZone65);
        org.joda.time.LocalDateTime.Property property67 = localDateTime66.yearOfEra();
        int int68 = property67.getMinimumValue();
        java.lang.String str69 = property67.getAsText();
        java.util.Locale locale70 = java.util.Locale.FRANCE;
        java.lang.String str71 = property67.getAsText(locale70);
        java.lang.String str72 = locale63.getDisplayVariant(locale70);
        java.lang.String str75 = nameProvider37.getName(locale70, "120", "\uce90\ub098\ub2e4");
        int int76 = dateTimeField36.getMaximumShortTextLength(locale70);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField15 and durationField52", (durationField15.compareTo(durationField52) == 0) == durationField15.equals(durationField52));
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test511");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology18 = zonedChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology12.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField21 = zonedChronology12.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField22 = zonedChronology12.hourOfDay();
        org.joda.time.DurationField durationField23 = zonedChronology12.halfdays();
        org.joda.time.DurationField durationField24 = zonedChronology12.days();
        org.joda.time.DurationField durationField25 = zonedChronology12.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField24", (durationField5.compareTo(durationField24) == 0) == durationField5.equals(durationField24));
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test512");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DurationField durationField13 = zonedChronology12.weeks();
        org.joda.time.DateTimeField dateTimeField14 = zonedChronology12.year();
        org.joda.time.DurationField durationField15 = zonedChronology12.months();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str20 = dateTimeZone18.getShortName((long) 10);
        java.lang.String str21 = dateTimeZone18.getID();
        long long24 = dateTimeZone18.convertLocalToUTC((long) (short) 1, false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone18);
        int int27 = dateTimeZone18.getStandardOffset(1L);
        org.joda.time.chrono.ZonedChronology zonedChronology28 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) zonedChronology12, dateTimeZone18);
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology12.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField30 = zonedChronology12.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField31 = zonedChronology12.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime(dateTimeZone32);
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime(dateTimeZone34);
        int int36 = localDateTime33.compareTo((org.joda.time.ReadablePartial) localDateTime35);
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.DateTime dateTime38 = localDateTime33.toDateTime(readableInstant37);
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.LocalDateTime localDateTime40 = new org.joda.time.LocalDateTime(dateTimeZone39);
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime(dateTimeZone41);
        int int43 = localDateTime40.compareTo((org.joda.time.ReadablePartial) localDateTime42);
        org.joda.time.LocalDateTime localDateTime44 = new org.joda.time.LocalDateTime();
        boolean boolean45 = localDateTime40.isEqual((org.joda.time.ReadablePartial) localDateTime44);
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.LocalDateTime localDateTime47 = new org.joda.time.LocalDateTime(dateTimeZone46);
        org.joda.time.LocalDateTime localDateTime49 = localDateTime47.minusWeeks(0);
        int int50 = localDateTime44.compareTo((org.joda.time.ReadablePartial) localDateTime47);
        org.joda.time.LocalDateTime localDateTime51 = localDateTime33.withFields((org.joda.time.ReadablePartial) localDateTime44);
        org.joda.time.LocalDateTime.Property property52 = localDateTime33.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime53 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime33);
        org.joda.time.ReadableDuration readableDuration54 = null;
        org.joda.time.LocalDateTime localDateTime55 = localDateTime33.plus(readableDuration54);
        org.joda.time.DurationFieldType durationFieldType56 = org.joda.time.DurationFieldType.millis();
        boolean boolean57 = localDateTime55.isSupported(durationFieldType56);
        org.joda.time.LocalDateTime localDateTime59 = localDateTime55.plusWeeks(170888);
        org.joda.time.DateTimeZone dateTimeZone60 = null;
        org.joda.time.LocalDateTime localDateTime61 = new org.joda.time.LocalDateTime(dateTimeZone60);
        org.joda.time.LocalDateTime localDateTime63 = localDateTime61.minusWeeks(0);
        org.joda.time.Chronology chronology64 = localDateTime63.getChronology();
        org.joda.time.DurationField durationField65 = chronology64.days();
        org.joda.time.DurationField durationField66 = chronology64.minutes();
        org.joda.time.DateTimeZone dateTimeZone69 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str71 = dateTimeZone69.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology72 = org.joda.time.chrono.ZonedChronology.getInstance(chronology64, dateTimeZone69);
        org.joda.time.DateTimeField dateTimeField73 = zonedChronology72.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone75 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean77 = dateTimeZone75.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology78 = zonedChronology72.withZone(dateTimeZone75);
        org.joda.time.DateTimeField dateTimeField79 = zonedChronology72.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField80 = zonedChronology72.year();
        org.joda.time.DateTimeField dateTimeField81 = zonedChronology72.dayOfYear();
        org.joda.time.Chronology chronology82 = zonedChronology72.withUTC();
        org.joda.time.DurationField durationField83 = zonedChronology72.months();
        org.joda.time.DateTimeField dateTimeField84 = zonedChronology72.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField85 = zonedChronology72.monthOfYear();
        org.joda.time.DateTimeField dateTimeField86 = zonedChronology72.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField87 = zonedChronology72.monthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType88 = dateTimeField87.getType();
        java.util.Locale locale89 = java.util.Locale.TAIWAN;
        java.lang.String str90 = locale89.getCountry();
        int int91 = dateTimeField87.getMaximumShortTextLength(locale89);
        java.lang.String str92 = dateTimeField31.getAsText((org.joda.time.ReadablePartial) localDateTime55, locale89);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField15 and durationField83", (durationField15.compareTo(durationField83) == 0) == durationField15.equals(durationField83));
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test513");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DurationField durationField13 = zonedChronology12.weeks();
        org.joda.time.DateTimeField dateTimeField14 = zonedChronology12.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField15 = zonedChronology12.dayOfWeek();
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        long long19 = zonedChronology12.add(readablePeriod16, 0L, 2);
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology12.weekyearOfCentury();
        org.joda.time.DurationField durationField21 = zonedChronology12.centuries();
        org.joda.time.DurationField durationField22 = zonedChronology12.weekyears();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology12.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime();
        int int26 = localDateTime25.getYear();
        org.joda.time.LocalDateTime localDateTime28 = localDateTime25.plusHours(2022);
        org.joda.time.LocalDateTime.Property property29 = localDateTime25.hourOfDay();
        java.util.Locale.Category category30 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale31 = java.util.Locale.CANADA;
        java.util.Locale.setDefault(category30, locale31);
        java.lang.String str33 = locale31.toLanguageTag();
        java.util.Locale.Category category34 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale35 = java.util.Locale.CANADA;
        java.util.Locale.setDefault(category34, locale35);
        java.lang.String str37 = locale35.toLanguageTag();
        java.lang.String str38 = locale31.getDisplayLanguage(locale35);
        java.util.Locale locale39 = locale31.stripExtensions();
        java.lang.String str40 = property29.getAsShortText(locale39);
        java.lang.String str41 = dateTimeField23.getAsShortText(1645427292133L, locale39);
        int int44 = dateTimeField23.getDifference((long) 'x', (long) 278);
        int int46 = dateTimeField23.getLeapAmount((long) 1);
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.LocalDateTime localDateTime48 = new org.joda.time.LocalDateTime(dateTimeZone47);
        org.joda.time.LocalDateTime localDateTime50 = localDateTime48.minusWeeks(0);
        org.joda.time.Chronology chronology51 = localDateTime50.getChronology();
        org.joda.time.DurationField durationField52 = chronology51.days();
        org.joda.time.DurationField durationField53 = chronology51.minutes();
        org.joda.time.DateTimeZone dateTimeZone56 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str58 = dateTimeZone56.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology59 = org.joda.time.chrono.ZonedChronology.getInstance(chronology51, dateTimeZone56);
        org.joda.time.DurationField durationField60 = zonedChronology59.weeks();
        org.joda.time.DateTimeField dateTimeField61 = zonedChronology59.year();
        org.joda.time.DateTimeZone dateTimeZone62 = zonedChronology59.getZone();
        org.joda.time.DateTimeField dateTimeField63 = zonedChronology59.millisOfSecond();
        org.joda.time.DurationField durationField64 = zonedChronology59.hours();
        org.joda.time.DurationField durationField65 = zonedChronology59.centuries();
        org.joda.time.Chronology chronology66 = zonedChronology59.withUTC();
        org.joda.time.DateTimeField dateTimeField67 = zonedChronology59.secondOfMinute();
        org.joda.time.DurationField durationField68 = zonedChronology59.seconds();
        org.joda.time.LocalDateTime localDateTime69 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property70 = localDateTime69.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone71 = null;
        org.joda.time.LocalDateTime localDateTime72 = new org.joda.time.LocalDateTime(dateTimeZone71);
        org.joda.time.LocalDateTime.Property property73 = localDateTime72.yearOfEra();
        org.joda.time.LocalDateTime.Property property74 = localDateTime72.monthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType75 = property74.getFieldType();
        boolean boolean76 = localDateTime69.isSupported(dateTimeFieldType75);
        org.joda.time.LocalDateTime localDateTime78 = localDateTime69.withMillisOfDay(1);
        int int79 = localDateTime78.getMillisOfSecond();
        long long81 = zonedChronology59.set((org.joda.time.ReadablePartial) localDateTime78, (-18L));
        int int82 = localDateTime78.size();
        org.joda.time.DateTimeZone dateTimeZone83 = null;
        org.joda.time.LocalDateTime localDateTime84 = new org.joda.time.LocalDateTime(dateTimeZone83);
        org.joda.time.LocalDateTime.Property property85 = localDateTime84.yearOfEra();
        org.joda.time.LocalDateTime.Property property86 = localDateTime84.monthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType87 = property86.getFieldType();
        org.joda.time.DurationFieldType durationFieldType88 = dateTimeFieldType87.getDurationType();
        org.joda.time.DurationFieldType durationFieldType89 = dateTimeFieldType87.getRangeDurationType();
        boolean boolean90 = localDateTime78.isSupported(dateTimeFieldType87);
        java.util.Locale locale92 = null;
        java.lang.String str93 = dateTimeField23.getAsText((org.joda.time.ReadablePartial) localDateTime78, 234, locale92);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField13 and durationField60", (durationField13.compareTo(durationField60) == 0) == durationField13.equals(durationField60));
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test514");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime(dateTimeZone2);
        int int4 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime3);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.DateTime dateTime6 = localDateTime1.toDateTime(readableInstant5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime(dateTimeZone9);
        int int11 = localDateTime8.compareTo((org.joda.time.ReadablePartial) localDateTime10);
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime();
        boolean boolean13 = localDateTime8.isEqual((org.joda.time.ReadablePartial) localDateTime12);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime(dateTimeZone14);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.minusWeeks(0);
        int int18 = localDateTime12.compareTo((org.joda.time.ReadablePartial) localDateTime15);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime1.withFields((org.joda.time.ReadablePartial) localDateTime12);
        org.joda.time.LocalDateTime.Property property20 = localDateTime12.year();
        int int21 = localDateTime12.getCenturyOfEra();
        org.joda.time.LocalDateTime localDateTime23 = localDateTime12.withYearOfEra(75307);
        org.joda.time.DurationFieldType durationFieldType24 = org.joda.time.DurationFieldType.minutes();
        boolean boolean25 = localDateTime23.isSupported(durationFieldType24);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime(dateTimeZone26);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.minusWeeks(0);
        org.joda.time.Chronology chronology30 = localDateTime29.getChronology();
        org.joda.time.DurationField durationField31 = chronology30.days();
        org.joda.time.DurationField durationField32 = chronology30.minutes();
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str37 = dateTimeZone35.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology38 = org.joda.time.chrono.ZonedChronology.getInstance(chronology30, dateTimeZone35);
        org.joda.time.DurationField durationField39 = zonedChronology38.weeks();
        org.joda.time.DateTimeField dateTimeField40 = zonedChronology38.year();
        org.joda.time.DurationField durationField41 = zonedChronology38.months();
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str46 = dateTimeZone44.getShortName((long) 10);
        java.lang.String str47 = dateTimeZone44.getID();
        long long50 = dateTimeZone44.convertLocalToUTC((long) (short) 1, false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone44);
        int int53 = dateTimeZone44.getStandardOffset(1L);
        org.joda.time.chrono.ZonedChronology zonedChronology54 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) zonedChronology38, dateTimeZone44);
        org.joda.time.DateTimeField dateTimeField55 = zonedChronology38.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField56 = zonedChronology38.centuryOfEra();
        org.joda.time.ReadablePeriod readablePeriod57 = null;
        long long60 = zonedChronology38.add(readablePeriod57, (long) 'a', 61677168);
        java.lang.String str61 = zonedChronology38.toString();
        org.joda.time.DateTimeField dateTimeField62 = zonedChronology38.year();
        org.joda.time.DateTimeField dateTimeField63 = zonedChronology38.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField64 = zonedChronology38.secondOfDay();
        org.joda.time.DateTimeField dateTimeField65 = zonedChronology38.year();
        org.joda.time.DurationField durationField66 = durationFieldType24.getField((org.joda.time.Chronology) zonedChronology38);
        org.joda.time.DateTimeField dateTimeField67 = zonedChronology38.era();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField32 and durationField66", (durationField32.compareTo(durationField66) == 0) == durationField32.equals(durationField66));
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test515");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology18 = zonedChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology12.millisOfSecond();
        org.joda.time.DurationField durationField21 = zonedChronology12.weeks();
        org.joda.time.DurationField durationField22 = zonedChronology12.hours();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (short) 0);
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime(dateTimeZone25);
        long long29 = dateTimeZone25.convertLocalToUTC(0L, true);
        org.joda.time.Chronology chronology30 = zonedChronology12.withZone(dateTimeZone25);
        org.joda.time.DurationField durationField31 = zonedChronology12.minutes();
        org.joda.time.DurationField durationField32 = zonedChronology12.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField31", (durationField6.compareTo(durationField31) == 0) == durationField6.equals(durationField31));
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test516");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minusWeeks(0);
        org.joda.time.Chronology chronology5 = localDateTime4.getChronology();
        org.joda.time.DurationField durationField6 = chronology5.days();
        org.joda.time.DurationField durationField7 = chronology5.minutes();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str12 = dateTimeZone10.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology13 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone10);
        org.joda.time.DateTimeField dateTimeField14 = zonedChronology13.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean18 = dateTimeZone16.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology19 = zonedChronology13.withZone(dateTimeZone16);
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology13.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField21 = zonedChronology13.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField22 = zonedChronology13.weekyear();
        org.joda.time.DurationField durationField23 = zonedChronology13.years();
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (short) 0);
        boolean boolean28 = dateTimeZone26.isStandardOffset((long) 61673414);
        org.joda.time.Chronology chronology29 = zonedChronology13.withZone(dateTimeZone26);
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime((long) 12, (org.joda.time.Chronology) zonedChronology13);
        org.joda.time.DateTimeField dateTimeField31 = zonedChronology13.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField32 = zonedChronology13.millisOfSecond();
        org.joda.time.DurationField durationField33 = zonedChronology13.months();
        long long37 = zonedChronology13.add((long) 803, 1645427289074L, 850);
        org.joda.time.DateTimeField dateTimeField38 = zonedChronology13.weekyear();
        org.joda.time.DurationField durationField39 = zonedChronology13.millis();
        org.joda.time.DateTimeField dateTimeField40 = zonedChronology13.hourOfHalfday();
        org.joda.time.DurationField durationField41 = zonedChronology13.millis();
        org.joda.time.DateTimeField dateTimeField42 = zonedChronology13.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone43 = zonedChronology13.getZone();
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.LocalDateTime localDateTime45 = new org.joda.time.LocalDateTime(dateTimeZone44);
        org.joda.time.LocalDateTime.Property property46 = localDateTime45.yearOfEra();
        org.joda.time.LocalDateTime.Property property47 = localDateTime45.monthOfYear();
        org.joda.time.LocalDateTime localDateTime48 = property47.roundHalfFloorCopy();
        java.lang.String str49 = property47.getAsShortText();
        org.joda.time.LocalDateTime localDateTime50 = property47.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime51 = property47.getLocalDateTime();
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.LocalDateTime localDateTime53 = new org.joda.time.LocalDateTime(dateTimeZone52);
        org.joda.time.LocalDateTime localDateTime55 = localDateTime53.minusWeeks(0);
        org.joda.time.Chronology chronology56 = localDateTime55.getChronology();
        org.joda.time.DurationField durationField57 = chronology56.days();
        org.joda.time.DurationField durationField58 = chronology56.minutes();
        org.joda.time.DateTimeZone dateTimeZone61 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str63 = dateTimeZone61.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology64 = org.joda.time.chrono.ZonedChronology.getInstance(chronology56, dateTimeZone61);
        org.joda.time.DurationField durationField65 = zonedChronology64.weeks();
        org.joda.time.DateTimeField dateTimeField66 = zonedChronology64.year();
        org.joda.time.DurationField durationField67 = zonedChronology64.months();
        org.joda.time.DateTimeZone dateTimeZone70 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str72 = dateTimeZone70.getShortName((long) 10);
        java.lang.String str73 = dateTimeZone70.getID();
        long long76 = dateTimeZone70.convertLocalToUTC((long) (short) 1, false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone70);
        int int79 = dateTimeZone70.getStandardOffset(1L);
        org.joda.time.chrono.ZonedChronology zonedChronology80 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) zonedChronology64, dateTimeZone70);
        org.joda.time.DateTimeField dateTimeField81 = zonedChronology64.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone82 = zonedChronology64.getZone();
        org.joda.time.DateTimeField dateTimeField83 = zonedChronology64.secondOfDay();
        org.joda.time.DurationField durationField84 = zonedChronology64.weeks();
        org.joda.time.DateTimeField dateTimeField85 = zonedChronology64.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone86 = null;
        org.joda.time.LocalDateTime localDateTime87 = new org.joda.time.LocalDateTime(dateTimeZone86);
        org.joda.time.LocalDateTime localDateTime89 = localDateTime87.minusWeeks(0);
        int int90 = localDateTime89.getYearOfCentury();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray91 = localDateTime89.getFieldTypes();
        int[] intArray93 = zonedChronology64.get((org.joda.time.ReadablePartial) localDateTime89, (long) 20);
        zonedChronology13.validate((org.joda.time.ReadablePartial) localDateTime51, intArray93);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField33 and durationField67", (durationField33.compareTo(durationField67) == 0) == durationField33.equals(durationField67));
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test517");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        boolean boolean14 = zonedChronology12.equals((java.lang.Object) "292278993-02-22T07:07:50.878");
        org.joda.time.LocalDateTime localDateTime15 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) zonedChronology12);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.minusWeeks((int) (short) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.secondOfMinute();
        org.joda.time.DurationFieldType durationFieldType19 = dateTimeFieldType18.getDurationType();
        boolean boolean20 = localDateTime15.isSupported(dateTimeFieldType18);
        org.joda.time.LocalDateTime.Property property21 = localDateTime15.weekOfWeekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalDateTime.Property property23 = localDateTime15.property(dateTimeFieldType22);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime(dateTimeZone24);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime25.minusWeeks(0);
        org.joda.time.Chronology chronology28 = localDateTime27.getChronology();
        org.joda.time.DurationField durationField29 = chronology28.days();
        org.joda.time.DurationField durationField30 = chronology28.minutes();
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str35 = dateTimeZone33.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology36 = org.joda.time.chrono.ZonedChronology.getInstance(chronology28, dateTimeZone33);
        org.joda.time.DurationField durationField37 = zonedChronology36.weeks();
        org.joda.time.DateTimeField dateTimeField38 = zonedChronology36.year();
        org.joda.time.DateTimeZone dateTimeZone39 = zonedChronology36.getZone();
        org.joda.time.DateTimeField dateTimeField40 = zonedChronology36.year();
        org.joda.time.DateTimeField dateTimeField41 = zonedChronology36.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField42 = zonedChronology36.minuteOfHour();
        long long46 = zonedChronology36.add(1645391275084L, (long) 61678279, 21);
        org.joda.time.DateTimeField dateTimeField47 = zonedChronology36.dayOfYear();
        org.joda.time.DateTimeField dateTimeField48 = zonedChronology36.secondOfDay();
        org.joda.time.DateTimeField dateTimeField49 = zonedChronology36.hourOfHalfday();
        org.joda.time.DurationField durationField50 = zonedChronology36.days();
        org.joda.time.DateTimeField dateTimeField51 = dateTimeFieldType22.getField((org.joda.time.Chronology) zonedChronology36);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField50", (durationField5.compareTo(durationField50) == 0) == durationField5.equals(durationField50));
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test518");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minusWeeks(0);
        org.joda.time.Chronology chronology5 = localDateTime4.getChronology();
        org.joda.time.DurationField durationField6 = chronology5.days();
        org.joda.time.DurationField durationField7 = chronology5.minutes();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str12 = dateTimeZone10.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology13 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone10);
        org.joda.time.DateTimeField dateTimeField14 = zonedChronology13.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean18 = dateTimeZone16.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology19 = zonedChronology13.withZone(dateTimeZone16);
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology13.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField21 = zonedChronology13.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField22 = zonedChronology13.weekyear();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology13.era();
        org.joda.time.DateTimeField dateTimeField24 = dateTimeFieldType0.getField((org.joda.time.Chronology) zonedChronology13);
        java.lang.String str25 = dateTimeFieldType0.getName();
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime(dateTimeZone26);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.minusWeeks(0);
        org.joda.time.Chronology chronology30 = localDateTime29.getChronology();
        org.joda.time.DurationField durationField31 = chronology30.days();
        org.joda.time.DurationField durationField32 = chronology30.minutes();
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str37 = dateTimeZone35.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology38 = org.joda.time.chrono.ZonedChronology.getInstance(chronology30, dateTimeZone35);
        org.joda.time.DateTimeField dateTimeField39 = zonedChronology38.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean43 = dateTimeZone41.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology44 = zonedChronology38.withZone(dateTimeZone41);
        org.joda.time.DateTimeField dateTimeField45 = zonedChronology38.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField46 = zonedChronology38.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField47 = zonedChronology38.weekyear();
        org.joda.time.DateTimeField dateTimeField48 = zonedChronology38.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField49 = zonedChronology38.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField50 = zonedChronology38.millisOfSecond();
        boolean boolean51 = dateTimeFieldType0.isSupported((org.joda.time.Chronology) zonedChronology38);
        org.joda.time.DateTimeField dateTimeField52 = zonedChronology38.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField53 = zonedChronology38.year();
        org.joda.time.DurationField durationField54 = zonedChronology38.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField54, durationField6, and durationField7", !(durationField54.compareTo(durationField6) == 0) || (Math.signum(durationField54.compareTo(durationField7)) == Math.signum(durationField6.compareTo(durationField7))));
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test519");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology18 = zonedChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology12.year();
        org.joda.time.DateTimeField dateTimeField21 = zonedChronology12.dayOfYear();
        org.joda.time.Chronology chronology22 = zonedChronology12.withUTC();
        org.joda.time.DurationField durationField23 = zonedChronology12.seconds();
        org.joda.time.DurationField durationField24 = zonedChronology12.weeks();
        org.joda.time.DateTimeField dateTimeField25 = zonedChronology12.hourOfHalfday();
        org.joda.time.DurationField durationField26 = zonedChronology12.days();
        org.joda.time.DurationField durationField27 = zonedChronology12.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField26", (durationField5.compareTo(durationField26) == 0) == durationField5.equals(durationField26));
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test520");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology18 = zonedChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology12.weekOfWeekyear();
        org.joda.time.Chronology chronology21 = zonedChronology12.withUTC();
        org.joda.time.DurationField durationField22 = zonedChronology12.seconds();
        org.joda.time.DurationField durationField23 = zonedChronology12.minutes();
        org.joda.time.DateTimeZone dateTimeZone24 = zonedChronology12.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField23", (durationField6.compareTo(durationField23) == 0) == durationField6.equals(durationField23));
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test521");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minusWeeks(0);
        org.joda.time.Chronology chronology5 = localDateTime4.getChronology();
        org.joda.time.DurationField durationField6 = chronology5.days();
        org.joda.time.DurationField durationField7 = chronology5.minutes();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str12 = dateTimeZone10.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology13 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone10);
        org.joda.time.DurationField durationField14 = zonedChronology13.weeks();
        org.joda.time.DateTimeField dateTimeField15 = zonedChronology13.year();
        org.joda.time.DateTimeZone dateTimeZone16 = zonedChronology13.getZone();
        org.joda.time.DateTimeField dateTimeField17 = zonedChronology13.year();
        java.lang.String str18 = zonedChronology13.toString();
        org.joda.time.DurationField durationField19 = zonedChronology13.months();
        org.joda.time.DurationField durationField20 = zonedChronology13.years();
        org.joda.time.DurationField durationField21 = zonedChronology13.days();
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime(4878859948L, (org.joda.time.Chronology) zonedChronology13);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField21", (durationField6.compareTo(durationField21) == 0) == durationField6.equals(durationField21));
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test522");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minusWeeks(0);
        org.joda.time.Chronology chronology5 = localDateTime4.getChronology();
        org.joda.time.DurationField durationField6 = chronology5.days();
        org.joda.time.DurationField durationField7 = chronology5.minutes();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str12 = dateTimeZone10.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology13 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone10);
        org.joda.time.DateTimeField dateTimeField14 = zonedChronology13.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean18 = dateTimeZone16.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology19 = zonedChronology13.withZone(dateTimeZone16);
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology13.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField21 = zonedChronology13.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField22 = zonedChronology13.weekyear();
        org.joda.time.DurationField durationField23 = zonedChronology13.years();
        org.joda.time.DurationField durationField24 = zonedChronology13.weeks();
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime((long) 61751964, (org.joda.time.Chronology) zonedChronology13);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime25, chronology26);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime25.minusYears(0);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime(dateTimeZone31);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime32.minusWeeks(0);
        org.joda.time.Chronology chronology35 = localDateTime34.getChronology();
        org.joda.time.DurationField durationField36 = chronology35.days();
        org.joda.time.DurationField durationField37 = chronology35.minutes();
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str42 = dateTimeZone40.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology43 = org.joda.time.chrono.ZonedChronology.getInstance(chronology35, dateTimeZone40);
        org.joda.time.DateTimeField dateTimeField44 = zonedChronology43.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean48 = dateTimeZone46.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology49 = zonedChronology43.withZone(dateTimeZone46);
        org.joda.time.DateTimeField dateTimeField50 = zonedChronology43.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField51 = zonedChronology43.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField52 = zonedChronology43.weekyear();
        org.joda.time.DurationField durationField53 = zonedChronology43.years();
        org.joda.time.DateTimeZone dateTimeZone56 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (short) 0);
        boolean boolean58 = dateTimeZone56.isStandardOffset((long) 61673414);
        org.joda.time.Chronology chronology59 = zonedChronology43.withZone(dateTimeZone56);
        org.joda.time.LocalDateTime localDateTime60 = new org.joda.time.LocalDateTime((long) 12, (org.joda.time.Chronology) zonedChronology43);
        org.joda.time.DateTimeField dateTimeField61 = zonedChronology43.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField62 = zonedChronology43.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone63 = zonedChronology43.getZone();
        org.joda.time.ReadablePeriod readablePeriod64 = null;
        long long67 = zonedChronology43.add(readablePeriod64, (long) 1028, 1028);
        org.joda.time.LocalDateTime localDateTime68 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) zonedChronology43);
        org.joda.time.LocalDateTime localDateTime69 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime29, (org.joda.time.Chronology) zonedChronology43);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField23 and durationField53", (durationField23.compareTo(durationField53) == 0) == durationField23.equals(durationField53));
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test523");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DurationField durationField13 = zonedChronology12.weeks();
        org.joda.time.DateTimeField dateTimeField14 = zonedChronology12.year();
        org.joda.time.DateTimeZone dateTimeZone15 = zonedChronology12.getZone();
        org.joda.time.DateTimeField dateTimeField16 = zonedChronology12.millisOfSecond();
        org.joda.time.DurationField durationField17 = zonedChronology12.hours();
        org.joda.time.DurationField durationField18 = zonedChronology12.centuries();
        org.joda.time.DurationField durationField19 = zonedChronology12.seconds();
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology12.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField21 = zonedChronology12.era();
        org.joda.time.DurationField durationField22 = zonedChronology12.seconds();
        org.joda.time.DurationFieldType durationFieldType23 = durationField22.getType();
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime(dateTimeZone24);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime25.minusWeeks(0);
        org.joda.time.Chronology chronology28 = localDateTime27.getChronology();
        org.joda.time.DurationField durationField29 = chronology28.days();
        org.joda.time.DurationField durationField30 = chronology28.minutes();
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str35 = dateTimeZone33.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology36 = org.joda.time.chrono.ZonedChronology.getInstance(chronology28, dateTimeZone33);
        org.joda.time.DateTimeField dateTimeField37 = zonedChronology36.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean41 = dateTimeZone39.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology42 = zonedChronology36.withZone(dateTimeZone39);
        org.joda.time.DateTimeField dateTimeField43 = zonedChronology36.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField44 = zonedChronology36.millisOfSecond();
        org.joda.time.DurationField durationField45 = zonedChronology36.weeks();
        org.joda.time.DurationField durationField46 = zonedChronology36.hours();
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (short) 0);
        org.joda.time.LocalDateTime localDateTime50 = new org.joda.time.LocalDateTime(dateTimeZone49);
        long long53 = dateTimeZone49.convertLocalToUTC(0L, true);
        org.joda.time.Chronology chronology54 = zonedChronology36.withZone(dateTimeZone49);
        org.joda.time.DateTimeField dateTimeField55 = zonedChronology36.secondOfDay();
        org.joda.time.DateTimeField dateTimeField56 = zonedChronology36.clockhourOfDay();
        org.joda.time.DurationField durationField57 = durationFieldType23.getField((org.joda.time.Chronology) zonedChronology36);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField13 and durationField45", (durationField13.compareTo(durationField45) == 0) == durationField13.equals(durationField45));
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test524");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DurationField durationField13 = zonedChronology12.weeks();
        org.joda.time.DateTimeField dateTimeField14 = zonedChronology12.year();
        org.joda.time.DurationField durationField15 = zonedChronology12.months();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str20 = dateTimeZone18.getShortName((long) 10);
        java.lang.String str21 = dateTimeZone18.getID();
        long long24 = dateTimeZone18.convertLocalToUTC((long) (short) 1, false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone18);
        int int27 = dateTimeZone18.getStandardOffset(1L);
        org.joda.time.chrono.ZonedChronology zonedChronology28 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) zonedChronology12, dateTimeZone18);
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology28.secondOfDay();
        org.joda.time.DateTimeField dateTimeField30 = zonedChronology28.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField31 = zonedChronology28.millisOfSecond();
        org.joda.time.DurationField durationField32 = zonedChronology28.months();
        org.joda.time.DateTimeField dateTimeField33 = zonedChronology28.weekOfWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField15 and durationField32", (durationField15.compareTo(durationField32) == 0) == durationField15.equals(durationField32));
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test525");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology18 = zonedChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology12.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField21 = zonedChronology12.weekyear();
        org.joda.time.DateTimeZone dateTimeZone22 = zonedChronology12.getZone();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology12.era();
        org.joda.time.DateTimeField dateTimeField24 = zonedChronology12.clockhourOfDay();
        org.joda.time.DurationField durationField25 = zonedChronology12.halfdays();
        org.joda.time.DateTimeField dateTimeField26 = zonedChronology12.era();
        org.joda.time.DurationField durationField27 = zonedChronology12.minutes();
        org.joda.time.DurationField durationField28 = zonedChronology12.weeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField27", (durationField6.compareTo(durationField27) == 0) == durationField6.equals(durationField27));
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test526");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.weekyears();
        java.lang.String str1 = durationFieldType0.getName();
        java.lang.String str2 = durationFieldType0.getName();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime(dateTimeZone3);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.minusWeeks(0);
        org.joda.time.Chronology chronology7 = localDateTime6.getChronology();
        org.joda.time.DurationField durationField8 = chronology7.days();
        org.joda.time.DurationField durationField9 = chronology7.minutes();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str14 = dateTimeZone12.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology15 = org.joda.time.chrono.ZonedChronology.getInstance(chronology7, dateTimeZone12);
        org.joda.time.DateTimeField dateTimeField16 = zonedChronology15.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean20 = dateTimeZone18.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology21 = zonedChronology15.withZone(dateTimeZone18);
        org.joda.time.DateTimeField dateTimeField22 = zonedChronology15.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology15.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField24 = zonedChronology15.weekyear();
        org.joda.time.DurationField durationField25 = zonedChronology15.years();
        org.joda.time.DurationField durationField26 = zonedChronology15.weeks();
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime(dateTimeZone27);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime28.minusWeeks(0);
        org.joda.time.Chronology chronology31 = localDateTime30.getChronology();
        org.joda.time.DurationField durationField32 = chronology31.days();
        org.joda.time.DurationField durationField33 = chronology31.minutes();
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str38 = dateTimeZone36.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology39 = org.joda.time.chrono.ZonedChronology.getInstance(chronology31, dateTimeZone36);
        org.joda.time.DateTimeField dateTimeField40 = zonedChronology39.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean44 = dateTimeZone42.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology45 = zonedChronology39.withZone(dateTimeZone42);
        org.joda.time.DateTimeField dateTimeField46 = zonedChronology39.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField47 = zonedChronology39.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField48 = zonedChronology39.weekyear();
        org.joda.time.DateTimeZone dateTimeZone49 = zonedChronology39.getZone();
        org.joda.time.Chronology chronology50 = zonedChronology15.withZone(dateTimeZone49);
        org.joda.time.DateTimeField dateTimeField51 = zonedChronology15.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField52 = zonedChronology15.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField53 = zonedChronology15.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField54 = zonedChronology15.monthOfYear();
        org.joda.time.DurationField durationField55 = durationFieldType0.getField((org.joda.time.Chronology) zonedChronology15);
        org.joda.time.DateTimeZone dateTimeZone56 = zonedChronology15.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField25 and durationField55", (durationField25.compareTo(durationField55) == 0) == durationField25.equals(durationField55));
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test527");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology18 = zonedChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology12.year();
        java.lang.String str21 = zonedChronology12.toString();
        org.joda.time.DurationField durationField22 = zonedChronology12.months();
        org.joda.time.DurationField durationField23 = zonedChronology12.days();
        org.joda.time.DateTimeField dateTimeField24 = zonedChronology12.yearOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField23", (durationField5.compareTo(durationField23) == 0) == durationField5.equals(durationField23));
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test528");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minusWeeks(0);
        org.joda.time.Chronology chronology5 = localDateTime4.getChronology();
        org.joda.time.DurationField durationField6 = chronology5.days();
        org.joda.time.DurationField durationField7 = chronology5.minutes();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str12 = dateTimeZone10.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology13 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone10);
        org.joda.time.DateTimeField dateTimeField14 = zonedChronology13.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean18 = dateTimeZone16.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology19 = zonedChronology13.withZone(dateTimeZone16);
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology13.dayOfMonth();
        org.joda.time.DurationField durationField21 = zonedChronology13.seconds();
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime(4518471600L, (org.joda.time.Chronology) zonedChronology13);
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology13.monthOfYear();
        org.joda.time.DurationField durationField24 = zonedChronology13.hours();
        org.joda.time.DateTimeField dateTimeField25 = zonedChronology13.millisOfDay();
        org.joda.time.DurationField durationField26 = zonedChronology13.days();
        org.joda.time.DateTimeField dateTimeField27 = zonedChronology13.weekyearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField26", (durationField6.compareTo(durationField26) == 0) == durationField6.equals(durationField26));
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test529");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime(dateTimeZone2);
        int int4 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime3);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.DateTime dateTime6 = localDateTime1.toDateTime(readableInstant5);
        boolean boolean8 = dateTime6.equals((java.lang.Object) 'a');
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime(dateTimeZone9);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(dateTimeZone11);
        int int13 = localDateTime10.compareTo((org.joda.time.ReadablePartial) localDateTime12);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.DateTime dateTime15 = localDateTime10.toDateTime(readableInstant14);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(dateTimeZone16);
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.yearOfEra();
        int int19 = property18.getMinimumValue();
        boolean boolean20 = dateTime15.equals((java.lang.Object) int19);
        org.joda.time.Chronology chronology21 = dateTime15.getChronology();
        int int22 = dateTime6.compareTo((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime(dateTimeZone23);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime(dateTimeZone25);
        int int27 = localDateTime24.compareTo((org.joda.time.ReadablePartial) localDateTime26);
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.DateTime dateTime29 = localDateTime24.toDateTime(readableInstant28);
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime(dateTimeZone30);
        org.joda.time.LocalDateTime.Property property32 = localDateTime31.yearOfEra();
        int int33 = property32.getMinimumValue();
        boolean boolean34 = dateTime29.equals((java.lang.Object) int33);
        org.joda.time.DateTimeFieldType dateTimeFieldType35 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        int int36 = dateTime29.get(dateTimeFieldType35);
        boolean boolean37 = dateTime15.isBefore((org.joda.time.ReadableInstant) dateTime29);
        long long38 = dateTime29.getMillis();
        org.joda.time.Instant instant39 = dateTime29.toInstant();
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.LocalDateTime localDateTime41 = new org.joda.time.LocalDateTime(dateTimeZone40);
        org.joda.time.LocalDateTime localDateTime43 = localDateTime41.minusWeeks(0);
        org.joda.time.Chronology chronology44 = localDateTime43.getChronology();
        org.joda.time.DurationField durationField45 = chronology44.days();
        org.joda.time.DurationField durationField46 = chronology44.minutes();
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str51 = dateTimeZone49.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology52 = org.joda.time.chrono.ZonedChronology.getInstance(chronology44, dateTimeZone49);
        org.joda.time.DurationField durationField53 = zonedChronology52.weeks();
        org.joda.time.DateTimeField dateTimeField54 = zonedChronology52.year();
        org.joda.time.DurationField durationField55 = zonedChronology52.months();
        org.joda.time.DateTimeZone dateTimeZone58 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str60 = dateTimeZone58.getShortName((long) 10);
        java.lang.String str61 = dateTimeZone58.getID();
        long long64 = dateTimeZone58.convertLocalToUTC((long) (short) 1, false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone58);
        int int67 = dateTimeZone58.getStandardOffset(1L);
        org.joda.time.chrono.ZonedChronology zonedChronology68 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) zonedChronology52, dateTimeZone58);
        org.joda.time.DateTimeField dateTimeField69 = zonedChronology52.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField70 = zonedChronology52.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField71 = zonedChronology52.weekyear();
        org.joda.time.DateTimeZone dateTimeZone72 = null;
        org.joda.time.LocalDateTime localDateTime73 = new org.joda.time.LocalDateTime(dateTimeZone72);
        org.joda.time.DateTimeZone dateTimeZone74 = null;
        org.joda.time.LocalDateTime localDateTime75 = new org.joda.time.LocalDateTime(dateTimeZone74);
        int int76 = localDateTime73.compareTo((org.joda.time.ReadablePartial) localDateTime75);
        org.joda.time.LocalDateTime localDateTime77 = new org.joda.time.LocalDateTime();
        boolean boolean78 = localDateTime73.isEqual((org.joda.time.ReadablePartial) localDateTime77);
        int int79 = localDateTime73.getDayOfYear();
        org.joda.time.LocalDateTime.Property property80 = localDateTime73.hourOfDay();
        int[] intArray82 = zonedChronology52.get((org.joda.time.ReadablePartial) localDateTime73, (long) '4');
        org.joda.time.DurationField durationField83 = zonedChronology52.weeks();
        org.joda.time.DateTimeField dateTimeField84 = zonedChronology52.weekyear();
        boolean boolean85 = dateTime29.equals((java.lang.Object) dateTimeField84);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and instant39", (dateTime6.compareTo(instant39) == 0) == dateTime6.equals(instant39));
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test530");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DurationField durationField13 = zonedChronology12.weeks();
        org.joda.time.DateTimeField dateTimeField14 = zonedChronology12.year();
        org.joda.time.DateTimeZone dateTimeZone15 = zonedChronology12.getZone();
        org.joda.time.DateTimeField dateTimeField16 = zonedChronology12.millisOfSecond();
        org.joda.time.DurationField durationField17 = zonedChronology12.hours();
        org.joda.time.DurationField durationField18 = zonedChronology12.centuries();
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology12.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime(dateTimeZone21);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime22.minusWeeks(0);
        org.joda.time.Chronology chronology25 = localDateTime24.getChronology();
        org.joda.time.DurationField durationField26 = chronology25.days();
        org.joda.time.DurationField durationField27 = chronology25.minutes();
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str32 = dateTimeZone30.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology33 = org.joda.time.chrono.ZonedChronology.getInstance(chronology25, dateTimeZone30);
        org.joda.time.DateTimeField dateTimeField34 = zonedChronology33.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean38 = dateTimeZone36.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology39 = zonedChronology33.withZone(dateTimeZone36);
        org.joda.time.DateTimeField dateTimeField40 = zonedChronology33.minuteOfHour();
        org.joda.time.Chronology chronology41 = zonedChronology33.withUTC();
        org.joda.time.DurationField durationField42 = zonedChronology33.hours();
        org.joda.time.DateTimeField dateTimeField43 = zonedChronology33.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField44 = zonedChronology33.year();
        org.joda.time.DateTimeField dateTimeField45 = zonedChronology33.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField46 = zonedChronology33.millisOfSecond();
        boolean boolean47 = zonedChronology12.equals((java.lang.Object) zonedChronology33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField17 and durationField42", (durationField17.compareTo(durationField42) == 0) == durationField17.equals(durationField42));
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test531");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology12.year();
        org.joda.time.DateTimeField dateTimeField14 = zonedChronology12.year();
        org.joda.time.DateTimeField dateTimeField15 = zonedChronology12.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField16 = zonedChronology12.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField17 = zonedChronology12.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime(dateTimeZone18);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.minusWeeks(0);
        org.joda.time.Chronology chronology22 = localDateTime21.getChronology();
        org.joda.time.DurationField durationField23 = chronology22.days();
        org.joda.time.DurationField durationField24 = chronology22.minutes();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str29 = dateTimeZone27.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology30 = org.joda.time.chrono.ZonedChronology.getInstance(chronology22, dateTimeZone27);
        org.joda.time.DurationField durationField31 = zonedChronology30.weeks();
        org.joda.time.DateTimeField dateTimeField32 = zonedChronology30.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone33 = zonedChronology30.getZone();
        java.lang.String str34 = dateTimeZone33.toString();
        org.joda.time.Chronology chronology35 = zonedChronology12.withZone(dateTimeZone33);
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime((long) 538);
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.LocalDateTime localDateTime39 = new org.joda.time.LocalDateTime(dateTimeZone38);
        org.joda.time.LocalDateTime localDateTime41 = localDateTime39.minusWeeks(0);
        org.joda.time.Chronology chronology42 = localDateTime41.getChronology();
        org.joda.time.DurationField durationField43 = chronology42.days();
        org.joda.time.DurationField durationField44 = chronology42.minutes();
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str49 = dateTimeZone47.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology50 = org.joda.time.chrono.ZonedChronology.getInstance(chronology42, dateTimeZone47);
        org.joda.time.DurationField durationField51 = zonedChronology50.weeks();
        org.joda.time.DateTimeField dateTimeField52 = zonedChronology50.year();
        org.joda.time.DurationField durationField53 = zonedChronology50.months();
        org.joda.time.DateTimeZone dateTimeZone56 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str58 = dateTimeZone56.getShortName((long) 10);
        java.lang.String str59 = dateTimeZone56.getID();
        long long62 = dateTimeZone56.convertLocalToUTC((long) (short) 1, false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone56);
        int int65 = dateTimeZone56.getStandardOffset(1L);
        org.joda.time.chrono.ZonedChronology zonedChronology66 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) zonedChronology50, dateTimeZone56);
        org.joda.time.DateTimeField dateTimeField67 = zonedChronology50.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone68 = null;
        org.joda.time.LocalDateTime localDateTime69 = new org.joda.time.LocalDateTime(dateTimeZone68);
        org.joda.time.LocalDateTime.Property property70 = localDateTime69.yearOfEra();
        int int71 = property70.getMinimumValue();
        java.lang.String str72 = property70.getAsText();
        org.joda.time.LocalDateTime localDateTime73 = property70.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime75 = localDateTime73.minusMinutes(100);
        int[] intArray77 = zonedChronology50.get((org.joda.time.ReadablePartial) localDateTime75, 1961046540333L);
        chronology35.validate((org.joda.time.ReadablePartial) localDateTime37, intArray77);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField31 and durationField51", (durationField31.compareTo(durationField51) == 0) == durationField31.equals(durationField51));
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test532");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DurationField durationField13 = zonedChronology12.weeks();
        org.joda.time.DateTimeField dateTimeField14 = zonedChronology12.year();
        org.joda.time.DurationField durationField15 = zonedChronology12.months();
        org.joda.time.DateTimeField dateTimeField16 = zonedChronology12.hourOfDay();
        org.joda.time.DurationField durationField17 = zonedChronology12.days();
        org.joda.time.DurationField durationField18 = zonedChronology12.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField17", (durationField5.compareTo(durationField17) == 0) == durationField5.equals(durationField17));
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test533");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DurationField durationField13 = zonedChronology12.weeks();
        org.joda.time.DateTimeField dateTimeField14 = zonedChronology12.year();
        org.joda.time.DurationField durationField15 = zonedChronology12.months();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str20 = dateTimeZone18.getShortName((long) 10);
        java.lang.String str21 = dateTimeZone18.getID();
        long long24 = dateTimeZone18.convertLocalToUTC((long) (short) 1, false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone18);
        int int27 = dateTimeZone18.getStandardOffset(1L);
        org.joda.time.chrono.ZonedChronology zonedChronology28 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) zonedChronology12, dateTimeZone18);
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology12.yearOfCentury();
        org.joda.time.DurationField durationField30 = zonedChronology12.hours();
        org.joda.time.DateTimeField dateTimeField31 = zonedChronology12.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean35 = dateTimeZone33.isStandardOffset((long) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.LocalDateTime localDateTime38 = new org.joda.time.LocalDateTime(dateTimeZone37);
        org.joda.time.LocalDateTime localDateTime40 = localDateTime38.minusWeeks(0);
        org.joda.time.Chronology chronology41 = localDateTime40.getChronology();
        org.joda.time.DurationField durationField42 = chronology41.days();
        org.joda.time.DurationField durationField43 = chronology41.minutes();
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str48 = dateTimeZone46.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology49 = org.joda.time.chrono.ZonedChronology.getInstance(chronology41, dateTimeZone46);
        org.joda.time.DateTimeField dateTimeField50 = zonedChronology49.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone52 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean54 = dateTimeZone52.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology55 = zonedChronology49.withZone(dateTimeZone52);
        org.joda.time.DateTimeField dateTimeField56 = zonedChronology49.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField57 = zonedChronology49.weekOfWeekyear();
        org.joda.time.DurationField durationField58 = dateTimeField57.getLeapDurationField();
        java.util.Locale locale59 = java.util.Locale.GERMAN;
        java.util.Locale locale60 = java.util.Locale.GERMAN;
        java.lang.String str61 = locale59.getDisplayCountry(locale60);
        java.util.Locale locale62 = locale59.stripExtensions();
        int int63 = dateTimeField57.getMaximumShortTextLength(locale62);
        java.lang.String str64 = dateTimeZone33.getName(4554472850L, locale62);
        org.joda.time.Chronology chronology65 = zonedChronology12.withZone(dateTimeZone33);
        org.joda.time.DurationField durationField66 = zonedChronology12.days();
        org.joda.time.DateTimeField dateTimeField67 = zonedChronology12.minuteOfHour();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField66", (durationField5.compareTo(durationField66) == 0) == durationField5.equals(durationField66));
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test534");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DurationField durationField13 = zonedChronology12.weeks();
        org.joda.time.DateTimeField dateTimeField14 = zonedChronology12.year();
        org.joda.time.DurationField durationField15 = zonedChronology12.months();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str20 = dateTimeZone18.getShortName((long) 10);
        java.lang.String str21 = dateTimeZone18.getID();
        long long24 = dateTimeZone18.convertLocalToUTC((long) (short) 1, false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone18);
        int int27 = dateTimeZone18.getStandardOffset(1L);
        org.joda.time.chrono.ZonedChronology zonedChronology28 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) zonedChronology12, dateTimeZone18);
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology28.dayOfYear();
        org.joda.time.DateTimeField dateTimeField30 = zonedChronology28.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField31 = zonedChronology28.dayOfWeek();
        org.joda.time.DurationField durationField32 = zonedChronology28.weeks();
        org.joda.time.DateTimeField dateTimeField33 = zonedChronology28.monthOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField13 and durationField32", (durationField13.compareTo(durationField32) == 0) == durationField13.equals(durationField32));
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test535");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minusWeeks(0);
        org.joda.time.Chronology chronology5 = localDateTime4.getChronology();
        org.joda.time.DurationField durationField6 = chronology5.days();
        org.joda.time.DurationField durationField7 = chronology5.minutes();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str12 = dateTimeZone10.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology13 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone10);
        org.joda.time.DateTimeField dateTimeField14 = zonedChronology13.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean18 = dateTimeZone16.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology19 = zonedChronology13.withZone(dateTimeZone16);
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology13.dayOfMonth();
        org.joda.time.DurationField durationField21 = zonedChronology13.seconds();
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime(4518471600L, (org.joda.time.Chronology) zonedChronology13);
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology13.monthOfYear();
        org.joda.time.DurationField durationField24 = zonedChronology13.hours();
        org.joda.time.DateTimeField dateTimeField25 = zonedChronology13.millisOfDay();
        org.joda.time.DateTimeField dateTimeField26 = zonedChronology13.dayOfMonth();
        org.joda.time.DurationField durationField27 = zonedChronology13.days();
        org.joda.time.DateTimeField dateTimeField28 = zonedChronology13.secondOfMinute();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField27", (durationField6.compareTo(durationField27) == 0) == durationField6.equals(durationField27));
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test536");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology18 = zonedChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.minuteOfHour();
        org.joda.time.Chronology chronology20 = zonedChronology12.withUTC();
        org.joda.time.DurationField durationField21 = zonedChronology12.years();
        org.joda.time.DateTimeField dateTimeField22 = zonedChronology12.minuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime(dateTimeZone23);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime24.minusWeeks(0);
        int int27 = localDateTime26.getYearOfCentury();
        org.joda.time.LocalDateTime localDateTime29 = localDateTime26.withMillisOfSecond((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime29.minusHours((int) '#');
        int[] intArray33 = zonedChronology12.get((org.joda.time.ReadablePartial) localDateTime29, (long) 2022);
        org.joda.time.LocalDateTime.Property property34 = localDateTime29.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime36 = localDateTime29.minusSeconds((-292275054));
        org.joda.time.LocalDateTime localDateTime38 = localDateTime36.minusYears(1255);
        org.joda.time.LocalDateTime.Property property39 = localDateTime38.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.LocalDateTime localDateTime41 = new org.joda.time.LocalDateTime(dateTimeZone40);
        org.joda.time.LocalDateTime.Property property42 = localDateTime41.yearOfEra();
        long long43 = property42.remainder();
        org.joda.time.DurationField durationField44 = property42.getDurationField();
        org.joda.time.LocalDateTime localDateTime45 = property42.roundHalfFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType46 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology47 = null;
        boolean boolean48 = dateTimeFieldType46.isSupported(chronology47);
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.LocalDateTime localDateTime50 = new org.joda.time.LocalDateTime(dateTimeZone49);
        org.joda.time.LocalDateTime localDateTime52 = localDateTime50.minusWeeks(0);
        org.joda.time.Chronology chronology53 = localDateTime52.getChronology();
        org.joda.time.DateTimeField dateTimeField54 = dateTimeFieldType46.getField(chronology53);
        java.lang.String str55 = dateTimeField54.getName();
        org.joda.time.DateTimeZone dateTimeZone56 = null;
        org.joda.time.LocalDateTime localDateTime57 = new org.joda.time.LocalDateTime(dateTimeZone56);
        org.joda.time.LocalDateTime localDateTime59 = localDateTime57.minusWeeks(0);
        org.joda.time.Chronology chronology60 = localDateTime59.getChronology();
        java.util.Locale locale62 = java.util.Locale.JAPANESE;
        java.lang.String str63 = locale62.getDisplayLanguage();
        java.lang.String str64 = locale62.getISO3Country();
        java.lang.String str65 = dateTimeField54.getAsShortText((org.joda.time.ReadablePartial) localDateTime59, 2, locale62);
        org.joda.time.LocalDateTime localDateTime67 = localDateTime59.minusDays((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime69 = localDateTime67.withMinuteOfHour((int) '#');
        java.util.Date date70 = localDateTime67.toDate();
        org.joda.time.LocalDateTime localDateTime72 = localDateTime67.plusMillis(749);
        org.joda.time.LocalDateTime localDateTime74 = localDateTime72.withWeekyear(17);
        int int75 = localDateTime72.getDayOfWeek();
        boolean boolean76 = localDateTime45.equals((java.lang.Object) int75);
        org.joda.time.LocalDateTime.Property property77 = localDateTime45.year();
        org.joda.time.LocalDateTime.Property property78 = localDateTime45.monthOfYear();
        boolean boolean79 = property39.equals((java.lang.Object) localDateTime45);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField21 and durationField44", (durationField21.compareTo(durationField44) == 0) == durationField21.equals(durationField44));
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test537");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology18 = zonedChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology12.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField21 = zonedChronology12.weekyear();
        org.joda.time.DurationField durationField22 = zonedChronology12.years();
        org.joda.time.DurationField durationField23 = zonedChronology12.weeks();
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime(dateTimeZone24);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime25.minusWeeks(0);
        org.joda.time.Chronology chronology28 = localDateTime27.getChronology();
        org.joda.time.DurationField durationField29 = chronology28.days();
        org.joda.time.DurationField durationField30 = chronology28.minutes();
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str35 = dateTimeZone33.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology36 = org.joda.time.chrono.ZonedChronology.getInstance(chronology28, dateTimeZone33);
        org.joda.time.DateTimeField dateTimeField37 = zonedChronology36.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean41 = dateTimeZone39.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology42 = zonedChronology36.withZone(dateTimeZone39);
        org.joda.time.DateTimeField dateTimeField43 = zonedChronology36.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField44 = zonedChronology36.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField45 = zonedChronology36.weekyear();
        org.joda.time.DateTimeZone dateTimeZone46 = zonedChronology36.getZone();
        org.joda.time.Chronology chronology47 = zonedChronology12.withZone(dateTimeZone46);
        long long51 = zonedChronology12.add(1645513695572L, (long) 0, 893);
        org.joda.time.DateTimeField dateTimeField52 = zonedChronology12.clockhourOfDay();
        org.joda.time.DurationField durationField53 = zonedChronology12.weekyears();
        org.joda.time.DateTimeField dateTimeField54 = zonedChronology12.weekyearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField22 and durationField53", (durationField22.compareTo(durationField53) == 0) == durationField22.equals(durationField53));
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test538");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DurationField durationField13 = zonedChronology12.weeks();
        org.joda.time.DateTimeField dateTimeField14 = zonedChronology12.year();
        org.joda.time.DateTimeZone dateTimeZone15 = zonedChronology12.getZone();
        org.joda.time.DateTimeField dateTimeField16 = zonedChronology12.millisOfSecond();
        org.joda.time.DurationField durationField17 = zonedChronology12.hours();
        org.joda.time.DateTimeField dateTimeField18 = zonedChronology12.yearOfCentury();
        org.joda.time.DurationField durationField19 = zonedChronology12.seconds();
        org.joda.time.DurationField durationField20 = zonedChronology12.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField20, durationField5, and durationField6", !(durationField20.compareTo(durationField5) == 0) || (Math.signum(durationField20.compareTo(durationField6)) == Math.signum(durationField5.compareTo(durationField6))));
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test539");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology18 = zonedChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology12.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField21 = zonedChronology12.weekyear();
        org.joda.time.DurationField durationField22 = zonedChronology12.years();
        org.joda.time.DurationField durationField23 = zonedChronology12.weeks();
        org.joda.time.DateTimeField dateTimeField24 = zonedChronology12.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime(dateTimeZone25);
        org.joda.time.LocalDateTime.Property property27 = localDateTime26.yearOfEra();
        long long28 = property27.remainder();
        org.joda.time.DurationField durationField29 = property27.getDurationField();
        org.joda.time.LocalDateTime localDateTime30 = property27.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime31 = property27.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime32 = property27.roundHalfEvenCopy();
        int[] intArray34 = zonedChronology12.get((org.joda.time.ReadablePartial) localDateTime32, 1952101406204712000L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField22 and durationField29", (durationField22.compareTo(durationField29) == 0) == durationField22.equals(durationField29));
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test540");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DurationField durationField13 = zonedChronology12.weeks();
        org.joda.time.DateTimeField dateTimeField14 = zonedChronology12.year();
        org.joda.time.DurationField durationField15 = zonedChronology12.months();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str20 = dateTimeZone18.getShortName((long) 10);
        java.lang.String str21 = dateTimeZone18.getID();
        long long24 = dateTimeZone18.convertLocalToUTC((long) (short) 1, false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone18);
        int int27 = dateTimeZone18.getStandardOffset(1L);
        org.joda.time.chrono.ZonedChronology zonedChronology28 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) zonedChronology12, dateTimeZone18);
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology12.centuryOfEra();
        org.joda.time.DurationField durationField30 = zonedChronology12.minutes();
        org.joda.time.DurationField durationField31 = zonedChronology12.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField30", (durationField6.compareTo(durationField30) == 0) == durationField6.equals(durationField30));
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test541");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minusWeeks(0);
        org.joda.time.Chronology chronology5 = localDateTime4.getChronology();
        org.joda.time.DurationField durationField6 = chronology5.days();
        org.joda.time.DurationField durationField7 = chronology5.minutes();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str12 = dateTimeZone10.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology13 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone10);
        org.joda.time.DateTimeField dateTimeField14 = zonedChronology13.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean18 = dateTimeZone16.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology19 = zonedChronology13.withZone(dateTimeZone16);
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology13.dayOfMonth();
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        long long24 = zonedChronology13.add(readablePeriod21, (long) 53, (int) (byte) 0);
        org.joda.time.DateTimeField dateTimeField25 = zonedChronology13.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime((long) 61685839, (org.joda.time.Chronology) zonedChronology13);
        org.joda.time.DateTimeField dateTimeField27 = zonedChronology13.millisOfDay();
        long long31 = zonedChronology13.add(0L, (long) 520, 61685839);
        org.joda.time.DateTimeField dateTimeField32 = zonedChronology13.millisOfDay();
        org.joda.time.DurationField durationField33 = zonedChronology13.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField33, durationField6, and durationField7", !(durationField33.compareTo(durationField6) == 0) || (Math.signum(durationField33.compareTo(durationField7)) == Math.signum(durationField6.compareTo(durationField7))));
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test542");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology18 = zonedChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology12.millisOfSecond();
        org.joda.time.DurationField durationField21 = zonedChronology12.weeks();
        org.joda.time.DateTimeField dateTimeField22 = zonedChronology12.era();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology12.clockhourOfHalfday();
        org.joda.time.DurationField durationField24 = zonedChronology12.minutes();
        org.joda.time.DateTimeField dateTimeField25 = zonedChronology12.millisOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField24", (durationField6.compareTo(durationField24) == 0) == durationField6.equals(durationField24));
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test543");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology18 = zonedChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.dayOfMonth();
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        long long23 = zonedChronology12.add(readablePeriod20, (long) 53, (int) (byte) 0);
        long long27 = zonedChronology12.add(1645427275536L, 0L, 8);
        org.joda.time.Chronology chronology28 = zonedChronology12.withUTC();
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology12.weekyearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone30 = zonedChronology12.getZone();
        org.joda.time.DurationField durationField31 = zonedChronology12.minutes();
        org.joda.time.DurationField durationField32 = zonedChronology12.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField31", (durationField6.compareTo(durationField31) == 0) == durationField6.equals(durationField31));
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test544");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology12.monthOfYear();
        org.joda.time.DurationField durationField14 = zonedChronology12.hours();
        org.joda.time.DurationField durationField15 = zonedChronology12.seconds();
        org.joda.time.DateTimeField dateTimeField16 = zonedChronology12.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField17 = zonedChronology12.monthOfYear();
        org.joda.time.DurationField durationField18 = zonedChronology12.days();
        org.joda.time.DurationField durationField19 = zonedChronology12.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField18", (durationField5.compareTo(durationField18) == 0) == durationField5.equals(durationField18));
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test545");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        boolean boolean14 = zonedChronology12.equals((java.lang.Object) "292278993-02-22T07:07:50.878");
        org.joda.time.DateTimeField dateTimeField15 = zonedChronology12.era();
        org.joda.time.DateTimeField dateTimeField16 = zonedChronology12.minuteOfDay();
        org.joda.time.DurationField durationField17 = zonedChronology12.weeks();
        java.lang.String str18 = zonedChronology12.toString();
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.year();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime(dateTimeZone21);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime22.minusWeeks(0);
        org.joda.time.Chronology chronology25 = localDateTime24.getChronology();
        org.joda.time.DurationField durationField26 = chronology25.days();
        org.joda.time.DurationField durationField27 = chronology25.minutes();
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str32 = dateTimeZone30.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology33 = org.joda.time.chrono.ZonedChronology.getInstance(chronology25, dateTimeZone30);
        org.joda.time.DurationField durationField34 = zonedChronology33.weeks();
        org.joda.time.DateTimeField dateTimeField35 = zonedChronology33.year();
        org.joda.time.DurationField durationField36 = zonedChronology33.months();
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str41 = dateTimeZone39.getShortName((long) 10);
        java.lang.String str42 = dateTimeZone39.getID();
        long long45 = dateTimeZone39.convertLocalToUTC((long) (short) 1, false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone39);
        int int48 = dateTimeZone39.getStandardOffset(1L);
        org.joda.time.chrono.ZonedChronology zonedChronology49 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) zonedChronology33, dateTimeZone39);
        org.joda.time.LocalDateTime localDateTime50 = new org.joda.time.LocalDateTime(1645427283555L, (org.joda.time.Chronology) zonedChronology33);
        org.joda.time.LocalDateTime localDateTime52 = localDateTime50.withYearOfEra(61718894);
        int int53 = dateTimeField19.getMinimumValue((org.joda.time.ReadablePartial) localDateTime52);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField17 and durationField34", (durationField17.compareTo(durationField34) == 0) == durationField17.equals(durationField34));
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test546");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology18 = zonedChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology12.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField21 = zonedChronology12.weekyear();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean25 = dateTimeZone23.isStandardOffset((long) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime(dateTimeZone27);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime28.minusWeeks(0);
        org.joda.time.Chronology chronology31 = localDateTime30.getChronology();
        org.joda.time.DurationField durationField32 = chronology31.days();
        org.joda.time.DurationField durationField33 = chronology31.minutes();
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str38 = dateTimeZone36.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology39 = org.joda.time.chrono.ZonedChronology.getInstance(chronology31, dateTimeZone36);
        org.joda.time.DateTimeField dateTimeField40 = zonedChronology39.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean44 = dateTimeZone42.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology45 = zonedChronology39.withZone(dateTimeZone42);
        org.joda.time.DateTimeField dateTimeField46 = zonedChronology39.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField47 = zonedChronology39.weekOfWeekyear();
        org.joda.time.DurationField durationField48 = dateTimeField47.getLeapDurationField();
        java.util.Locale locale49 = java.util.Locale.GERMAN;
        java.util.Locale locale50 = java.util.Locale.GERMAN;
        java.lang.String str51 = locale49.getDisplayCountry(locale50);
        java.util.Locale locale52 = locale49.stripExtensions();
        int int53 = dateTimeField47.getMaximumShortTextLength(locale52);
        java.lang.String str54 = dateTimeZone23.getName(4554472850L, locale52);
        org.joda.time.Chronology chronology55 = zonedChronology12.withZone(dateTimeZone23);
        org.joda.time.DateTimeZone dateTimeZone57 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        int int59 = dateTimeZone57.getOffsetFromLocal(4518471413L);
        org.joda.time.LocalDateTime localDateTime60 = new org.joda.time.LocalDateTime(dateTimeZone57);
        org.joda.time.LocalDateTime localDateTime62 = localDateTime60.withYear((int) ' ');
        org.joda.time.LocalDateTime localDateTime64 = localDateTime62.plusYears(0);
        org.joda.time.LocalDateTime.Property property65 = localDateTime62.weekyear();
        long long67 = zonedChronology12.set((org.joda.time.ReadablePartial) localDateTime62, (long) 61705356);
        org.joda.time.DurationField durationField68 = zonedChronology12.days();
        org.joda.time.DurationField durationField69 = zonedChronology12.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField69", (durationField5.compareTo(durationField69) == 0) == durationField5.equals(durationField69));
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test547");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology18 = zonedChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology12.year();
        org.joda.time.DateTimeField dateTimeField21 = zonedChronology12.dayOfYear();
        org.joda.time.Chronology chronology22 = zonedChronology12.withUTC();
        org.joda.time.DurationField durationField23 = zonedChronology12.months();
        org.joda.time.DateTimeField dateTimeField24 = zonedChronology12.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField25 = zonedChronology12.year();
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime(dateTimeZone26);
        org.joda.time.LocalDateTime.Property property28 = localDateTime27.yearOfEra();
        org.joda.time.LocalDateTime.Property property29 = localDateTime27.monthOfYear();
        long long30 = property29.remainder();
        boolean boolean31 = zonedChronology12.equals((java.lang.Object) property29);
        org.joda.time.DurationField durationField32 = zonedChronology12.days();
        org.joda.time.DateTimeField dateTimeField33 = zonedChronology12.clockhourOfHalfday();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField32", (durationField5.compareTo(durationField32) == 0) == durationField5.equals(durationField32));
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test548");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology18 = zonedChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology12.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField21 = zonedChronology12.weekyear();
        org.joda.time.DurationField durationField22 = zonedChronology12.years();
        org.joda.time.DurationField durationField23 = zonedChronology12.weeks();
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime(dateTimeZone24);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime25.minusWeeks(0);
        org.joda.time.Chronology chronology28 = localDateTime27.getChronology();
        org.joda.time.DurationField durationField29 = chronology28.days();
        org.joda.time.DurationField durationField30 = chronology28.minutes();
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str35 = dateTimeZone33.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology36 = org.joda.time.chrono.ZonedChronology.getInstance(chronology28, dateTimeZone33);
        org.joda.time.DateTimeField dateTimeField37 = zonedChronology36.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean41 = dateTimeZone39.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology42 = zonedChronology36.withZone(dateTimeZone39);
        org.joda.time.DateTimeField dateTimeField43 = zonedChronology36.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField44 = zonedChronology36.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField45 = zonedChronology36.weekyear();
        org.joda.time.DateTimeZone dateTimeZone46 = zonedChronology36.getZone();
        org.joda.time.Chronology chronology47 = zonedChronology12.withZone(dateTimeZone46);
        org.joda.time.DateTimeField dateTimeField48 = zonedChronology12.dayOfMonth();
        org.joda.time.DurationField durationField49 = zonedChronology12.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField49, durationField5, and durationField6", !(durationField49.compareTo(durationField5) == 0) || (Math.signum(durationField49.compareTo(durationField6)) == Math.signum(durationField5.compareTo(durationField6))));
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test549");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        boolean boolean14 = zonedChronology12.equals((java.lang.Object) "292278993-02-22T07:07:50.878");
        org.joda.time.DateTimeField dateTimeField15 = zonedChronology12.hourOfDay();
        org.joda.time.DateTimeField dateTimeField16 = zonedChronology12.dayOfYear();
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime((org.joda.time.Chronology) zonedChronology12);
        org.joda.time.DurationField durationField18 = zonedChronology12.minutes();
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.yearOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField18", (durationField6.compareTo(durationField18) == 0) == durationField6.equals(durationField18));
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test550");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime(dateTimeZone2);
        int int4 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime3);
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime();
        boolean boolean6 = localDateTime1.isEqual((org.joda.time.ReadablePartial) localDateTime5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(dateTimeZone7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.minusWeeks(0);
        int int11 = localDateTime5.compareTo((org.joda.time.ReadablePartial) localDateTime8);
        org.joda.time.LocalDateTime.Property property12 = localDateTime8.dayOfWeek();
        int int13 = property12.getMinimumValue();
        org.joda.time.LocalDateTime localDateTime14 = property12.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime();
        int int16 = localDateTime15.getYear();
        int int17 = localDateTime15.getMinuteOfHour();
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.LocalDateTime localDateTime19 = localDateTime15.plus(readableDuration18);
        int int20 = localDateTime14.compareTo((org.joda.time.ReadablePartial) localDateTime19);
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime((long) (byte) -1);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime22.plusMinutes(0);
        org.joda.time.LocalDateTime.Property property25 = localDateTime22.hourOfDay();
        org.joda.time.LocalDateTime localDateTime27 = property25.addToCopy(6000000L);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime(dateTimeZone28);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime29.minusWeeks(0);
        org.joda.time.Chronology chronology32 = localDateTime31.getChronology();
        org.joda.time.DurationField durationField33 = chronology32.days();
        org.joda.time.DurationField durationField34 = chronology32.minutes();
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str39 = dateTimeZone37.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology40 = org.joda.time.chrono.ZonedChronology.getInstance(chronology32, dateTimeZone37);
        org.joda.time.DateTimeField dateTimeField41 = zonedChronology40.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean45 = dateTimeZone43.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology46 = zonedChronology40.withZone(dateTimeZone43);
        org.joda.time.DateTimeField dateTimeField47 = zonedChronology40.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField48 = zonedChronology40.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField49 = zonedChronology40.weekyear();
        org.joda.time.LocalDateTime localDateTime51 = new org.joda.time.LocalDateTime((long) (byte) -1);
        int int52 = localDateTime51.getMonthOfYear();
        org.joda.time.DurationFieldType durationFieldType53 = org.joda.time.DurationFieldType.seconds();
        boolean boolean54 = localDateTime51.isSupported(durationFieldType53);
        org.joda.time.LocalDateTime.Property property55 = localDateTime51.yearOfEra();
        int[] intArray57 = new int[] { 'a' };
        int int58 = dateTimeField49.getMinimumValue((org.joda.time.ReadablePartial) localDateTime51, intArray57);
        org.joda.time.LocalDateTime localDateTime60 = localDateTime51.minusDays(0);
        org.joda.time.DateTime dateTime61 = localDateTime60.toDateTime();
        int int62 = property25.getDifference((org.joda.time.ReadableInstant) dateTime61);
        org.joda.time.Instant instant63 = dateTime61.toInstant();
        org.joda.time.DateTime dateTime64 = localDateTime19.toDateTime((org.joda.time.ReadableInstant) instant63);
        org.joda.time.LocalDateTime localDateTime65 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime67 = localDateTime65.withYearOfCentury((int) (short) 1);
        org.joda.time.Chronology chronology68 = localDateTime65.getChronology();
        org.joda.time.DateTimeFieldType dateTimeFieldType69 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology70 = null;
        boolean boolean71 = dateTimeFieldType69.isSupported(chronology70);
        org.joda.time.DateTimeZone dateTimeZone72 = null;
        org.joda.time.LocalDateTime localDateTime73 = new org.joda.time.LocalDateTime(dateTimeZone72);
        org.joda.time.LocalDateTime localDateTime75 = localDateTime73.minusWeeks(0);
        org.joda.time.Chronology chronology76 = localDateTime75.getChronology();
        org.joda.time.DateTimeField dateTimeField77 = dateTimeFieldType69.getField(chronology76);
        org.joda.time.DateTimeZone dateTimeZone80 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str82 = dateTimeZone80.getShortName((long) 10);
        java.lang.String str83 = dateTimeZone80.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone80);
        org.joda.time.chrono.ZonedChronology zonedChronology85 = org.joda.time.chrono.ZonedChronology.getInstance(chronology76, dateTimeZone80);
        java.lang.String str87 = dateTimeZone80.getShortName(4518470650L);
        java.util.TimeZone timeZone88 = dateTimeZone80.toTimeZone();
        int int90 = timeZone88.getOffset((-35999999L));
        org.joda.time.DateTimeZone dateTimeZone91 = org.joda.time.DateTimeZone.forTimeZone(timeZone88);
        java.time.ZoneId zoneId92 = timeZone88.toZoneId();
        org.joda.time.DateTimeZone dateTimeZone93 = org.joda.time.DateTimeZone.forTimeZone(timeZone88);
        org.joda.time.DateTime dateTime94 = localDateTime65.toDateTime(dateTimeZone93);
        boolean boolean95 = dateTime64.isAfter((org.joda.time.ReadableInstant) dateTime94);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime61 and instant63", (dateTime61.compareTo(instant63) == 0) == dateTime61.equals(instant63));
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test551");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfSecond();
        java.lang.String str1 = dateTimeFieldType0.getName();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime(dateTimeZone2);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.minusWeeks(0);
        org.joda.time.Chronology chronology6 = localDateTime5.getChronology();
        org.joda.time.DurationField durationField7 = chronology6.days();
        org.joda.time.DurationField durationField8 = chronology6.minutes();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str13 = dateTimeZone11.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology14 = org.joda.time.chrono.ZonedChronology.getInstance(chronology6, dateTimeZone11);
        org.joda.time.DurationField durationField15 = zonedChronology14.weeks();
        org.joda.time.DateTimeField dateTimeField16 = zonedChronology14.year();
        org.joda.time.DurationField durationField17 = zonedChronology14.months();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str22 = dateTimeZone20.getShortName((long) 10);
        java.lang.String str23 = dateTimeZone20.getID();
        long long26 = dateTimeZone20.convertLocalToUTC((long) (short) 1, false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone20);
        int int29 = dateTimeZone20.getStandardOffset(1L);
        org.joda.time.chrono.ZonedChronology zonedChronology30 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) zonedChronology14, dateTimeZone20);
        org.joda.time.DateTimeField dateTimeField31 = zonedChronology14.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField32 = zonedChronology14.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField33 = zonedChronology14.weekyear();
        boolean boolean34 = dateTimeFieldType0.isSupported((org.joda.time.Chronology) zonedChronology14);
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime((org.joda.time.Chronology) zonedChronology14);
        org.joda.time.DurationFieldType durationFieldType36 = org.joda.time.DurationFieldType.minutes();
        java.lang.String str37 = durationFieldType36.toString();
        java.lang.String str38 = durationFieldType36.toString();
        org.joda.time.LocalDateTime localDateTime40 = localDateTime35.withFieldAdded(durationFieldType36, 20);
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime(dateTimeZone41);
        org.joda.time.LocalDateTime localDateTime44 = localDateTime42.minusWeeks(0);
        org.joda.time.Chronology chronology45 = localDateTime44.getChronology();
        org.joda.time.DurationField durationField46 = chronology45.days();
        org.joda.time.DurationField durationField47 = chronology45.months();
        org.joda.time.DateTimeField dateTimeField48 = chronology45.year();
        org.joda.time.DateTimeField dateTimeField49 = chronology45.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField50 = chronology45.minuteOfDay();
        org.joda.time.LocalDateTime localDateTime51 = new org.joda.time.LocalDateTime(chronology45);
        boolean boolean52 = durationFieldType36.isSupported(chronology45);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField17 and durationField47", (durationField17.compareTo(durationField47) == 0) == durationField17.equals(durationField47));
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test552");
        org.joda.time.tz.NameProvider nameProvider0 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime(dateTimeZone2);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.minusWeeks(0);
        org.joda.time.Chronology chronology6 = localDateTime5.getChronology();
        org.joda.time.DurationField durationField7 = chronology6.days();
        org.joda.time.DurationField durationField8 = chronology6.minutes();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str13 = dateTimeZone11.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology14 = org.joda.time.chrono.ZonedChronology.getInstance(chronology6, dateTimeZone11);
        org.joda.time.DurationField durationField15 = zonedChronology14.weeks();
        org.joda.time.DateTimeField dateTimeField16 = zonedChronology14.year();
        org.joda.time.DateTimeZone dateTimeZone17 = zonedChronology14.getZone();
        java.util.Locale locale19 = java.util.Locale.ROOT;
        java.lang.String str20 = dateTimeZone17.getShortName((long) '4', locale19);
        java.lang.String str21 = locale19.getDisplayCountry();
        java.lang.String str24 = nameProvider0.getName(locale19, "Japanese", "");
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        java.util.Locale locale26 = java.util.Locale.GERMAN;
        boolean boolean27 = locale26.hasExtensions();
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime(dateTimeZone28);
        org.joda.time.LocalDateTime.Property property30 = localDateTime29.yearOfEra();
        int int31 = property30.getMinimumValue();
        java.lang.String str32 = property30.getAsText();
        java.util.Locale locale33 = java.util.Locale.FRANCE;
        java.lang.String str34 = property30.getAsText(locale33);
        java.lang.String str35 = locale26.getDisplayVariant(locale33);
        java.lang.String str38 = nameProvider0.getName(locale33, "120", "\uce90\ub098\ub2e4");
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.LocalDateTime localDateTime41 = new org.joda.time.LocalDateTime(dateTimeZone40);
        org.joda.time.LocalDateTime localDateTime43 = localDateTime41.minusWeeks(0);
        org.joda.time.Chronology chronology44 = localDateTime43.getChronology();
        org.joda.time.DurationField durationField45 = chronology44.days();
        org.joda.time.DurationField durationField46 = chronology44.minutes();
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str51 = dateTimeZone49.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology52 = org.joda.time.chrono.ZonedChronology.getInstance(chronology44, dateTimeZone49);
        org.joda.time.DateTimeField dateTimeField53 = zonedChronology52.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone55 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean57 = dateTimeZone55.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology58 = zonedChronology52.withZone(dateTimeZone55);
        org.joda.time.DateTimeField dateTimeField59 = zonedChronology52.dayOfMonth();
        org.joda.time.ReadablePeriod readablePeriod60 = null;
        long long63 = zonedChronology52.add(readablePeriod60, (long) 53, (int) (byte) 0);
        org.joda.time.DateTimeField dateTimeField64 = zonedChronology52.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime65 = new org.joda.time.LocalDateTime((long) 61685839, (org.joda.time.Chronology) zonedChronology52);
        org.joda.time.DurationField durationField66 = zonedChronology52.seconds();
        org.joda.time.LocalDateTime localDateTime67 = new org.joda.time.LocalDateTime((java.lang.Object) str38, (org.joda.time.Chronology) zonedChronology52);
        org.joda.time.DateTimeField dateTimeField68 = zonedChronology52.yearOfCentury();
        org.joda.time.ReadablePeriod readablePeriod69 = null;
        long long72 = zonedChronology52.add(readablePeriod69, 13345731397L, 517);
        org.joda.time.DurationField durationField73 = zonedChronology52.days();
        org.joda.time.DurationField durationField74 = zonedChronology52.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField7 and durationField73", (durationField7.compareTo(durationField73) == 0) == durationField7.equals(durationField73));
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test553");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology18 = zonedChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology12.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField21 = zonedChronology12.weekyear();
        org.joda.time.DurationField durationField22 = zonedChronology12.years();
        org.joda.time.DurationField durationField23 = zonedChronology12.weeks();
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime(dateTimeZone24);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime25.minusWeeks(0);
        org.joda.time.Chronology chronology28 = localDateTime27.getChronology();
        org.joda.time.DurationField durationField29 = chronology28.days();
        org.joda.time.DurationField durationField30 = chronology28.minutes();
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str35 = dateTimeZone33.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology36 = org.joda.time.chrono.ZonedChronology.getInstance(chronology28, dateTimeZone33);
        org.joda.time.DateTimeField dateTimeField37 = zonedChronology36.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean41 = dateTimeZone39.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology42 = zonedChronology36.withZone(dateTimeZone39);
        org.joda.time.DateTimeField dateTimeField43 = zonedChronology36.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField44 = zonedChronology36.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField45 = zonedChronology36.weekyear();
        org.joda.time.DateTimeZone dateTimeZone46 = zonedChronology36.getZone();
        org.joda.time.Chronology chronology47 = zonedChronology12.withZone(dateTimeZone46);
        org.joda.time.DateTimeField dateTimeField48 = zonedChronology12.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField49 = zonedChronology12.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField50 = zonedChronology12.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField51 = zonedChronology12.yearOfCentury();
        org.joda.time.DurationField durationField52 = zonedChronology12.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField52, durationField5, and durationField6", !(durationField52.compareTo(durationField5) == 0) || (Math.signum(durationField52.compareTo(durationField6)) == Math.signum(durationField5.compareTo(durationField6))));
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test554");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology18 = zonedChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology12.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        org.joda.time.Chronology chronology24 = zonedChronology12.withZone(dateTimeZone23);
        org.joda.time.DurationField durationField25 = zonedChronology12.years();
        org.joda.time.DurationField durationField26 = zonedChronology12.months();
        org.joda.time.DateTimeField dateTimeField27 = zonedChronology12.weekOfWeekyear();
        org.joda.time.DurationField durationField28 = zonedChronology12.seconds();
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology12.halfdayOfDay();
        java.lang.String str31 = dateTimeField29.getAsText(1641600020L);
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime(dateTimeZone32);
        org.joda.time.LocalDateTime localDateTime35 = localDateTime33.minusWeeks(0);
        org.joda.time.Chronology chronology36 = localDateTime35.getChronology();
        org.joda.time.DurationField durationField37 = chronology36.days();
        org.joda.time.DurationField durationField38 = chronology36.minutes();
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str43 = dateTimeZone41.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology44 = org.joda.time.chrono.ZonedChronology.getInstance(chronology36, dateTimeZone41);
        org.joda.time.DateTimeField dateTimeField45 = zonedChronology44.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean49 = dateTimeZone47.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology50 = zonedChronology44.withZone(dateTimeZone47);
        org.joda.time.DateTimeField dateTimeField51 = zonedChronology44.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField52 = zonedChronology44.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField53 = zonedChronology44.clockhourOfDay();
        org.joda.time.DurationField durationField54 = zonedChronology44.weeks();
        org.joda.time.DurationField durationField55 = zonedChronology44.weekyears();
        org.joda.time.LocalDateTime localDateTime56 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property57 = localDateTime56.millisOfSecond();
        org.joda.time.LocalDateTime.Property property58 = localDateTime56.weekOfWeekyear();
        org.joda.time.Chronology chronology59 = localDateTime56.getChronology();
        int int60 = localDateTime56.getMillisOfDay();
        org.joda.time.LocalDateTime localDateTime62 = localDateTime56.withMinuteOfHour((int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime64 = localDateTime56.minusMinutes(12);
        int[] intArray66 = zonedChronology44.get((org.joda.time.ReadablePartial) localDateTime56, 604800000L);
        int int67 = dateTimeField29.getMinimumValue((org.joda.time.ReadablePartial) localDateTime56);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField25 and durationField55", (durationField25.compareTo(durationField55) == 0) == durationField25.equals(durationField55));
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test555");
        org.joda.time.tz.NameProvider nameProvider0 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime(dateTimeZone2);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.minusWeeks(0);
        org.joda.time.Chronology chronology6 = localDateTime5.getChronology();
        org.joda.time.DurationField durationField7 = chronology6.days();
        org.joda.time.DurationField durationField8 = chronology6.minutes();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str13 = dateTimeZone11.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology14 = org.joda.time.chrono.ZonedChronology.getInstance(chronology6, dateTimeZone11);
        org.joda.time.DurationField durationField15 = zonedChronology14.weeks();
        org.joda.time.DateTimeField dateTimeField16 = zonedChronology14.year();
        org.joda.time.DateTimeZone dateTimeZone17 = zonedChronology14.getZone();
        java.util.Locale locale19 = java.util.Locale.ROOT;
        java.lang.String str20 = dateTimeZone17.getShortName((long) '4', locale19);
        java.lang.String str21 = locale19.getDisplayCountry();
        java.lang.String str24 = nameProvider0.getName(locale19, "Japanese", "");
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        java.util.Locale locale26 = java.util.Locale.GERMAN;
        java.util.Locale locale27 = java.util.Locale.GERMAN;
        java.lang.String str28 = locale26.getDisplayCountry(locale27);
        java.util.Locale locale29 = locale26.stripExtensions();
        java.lang.String str30 = locale29.getDisplayVariant();
        boolean boolean31 = locale29.hasExtensions();
        java.util.Locale locale32 = java.util.Locale.GERMANY;
        java.lang.String str33 = locale29.getDisplayScript(locale32);
        java.lang.String str34 = locale32.getDisplayLanguage();
        java.lang.String str37 = nameProvider0.getShortName(locale32, "", "292278993-02-22T17:07:53.990");
        java.util.Locale locale40 = new java.util.Locale("17", "Etc/UTC");
        java.lang.String str43 = nameProvider0.getName(locale40, "CAN", "0");
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.LocalDateTime localDateTime46 = new org.joda.time.LocalDateTime(dateTimeZone45);
        org.joda.time.LocalDateTime localDateTime48 = localDateTime46.minusWeeks(0);
        org.joda.time.Chronology chronology49 = localDateTime48.getChronology();
        org.joda.time.DurationField durationField50 = chronology49.days();
        org.joda.time.DurationField durationField51 = chronology49.minutes();
        org.joda.time.DateTimeZone dateTimeZone54 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str56 = dateTimeZone54.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology57 = org.joda.time.chrono.ZonedChronology.getInstance(chronology49, dateTimeZone54);
        org.joda.time.DurationField durationField58 = zonedChronology57.weeks();
        org.joda.time.DateTimeField dateTimeField59 = zonedChronology57.year();
        org.joda.time.DateTimeZone dateTimeZone60 = zonedChronology57.getZone();
        org.joda.time.DateTimeField dateTimeField61 = zonedChronology57.millisOfSecond();
        org.joda.time.DurationField durationField62 = zonedChronology57.hours();
        org.joda.time.DurationField durationField63 = zonedChronology57.centuries();
        org.joda.time.DateTimeField dateTimeField64 = zonedChronology57.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField65 = zonedChronology57.weekyear();
        boolean boolean66 = dateTimeField65.isSupported();
        java.util.Locale locale67 = java.util.Locale.GERMAN;
        java.util.Locale locale68 = java.util.Locale.GERMAN;
        java.lang.String str69 = locale67.getDisplayCountry(locale68);
        java.util.Locale locale70 = locale67.stripExtensions();
        java.lang.String str71 = locale70.getDisplayVariant();
        java.util.Set<java.lang.Character> charSet72 = locale70.getExtensionKeys();
        java.lang.String str73 = locale70.getCountry();
        int int74 = dateTimeField65.getMaximumTextLength(locale70);
        java.util.Set<java.lang.String> strSet75 = locale70.getUnicodeLocaleAttributes();
        java.lang.String str78 = nameProvider0.getName(locale70, "53", "62033963");
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField15 and durationField58", (durationField15.compareTo(durationField58) == 0) == durationField15.equals(durationField58));
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test556");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DurationField durationField13 = zonedChronology12.days();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime(dateTimeZone14);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(dateTimeZone16);
        int int18 = localDateTime15.compareTo((org.joda.time.ReadablePartial) localDateTime17);
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.DateTime dateTime20 = localDateTime15.toDateTime(readableInstant19);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime(dateTimeZone21);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime(dateTimeZone23);
        int int25 = localDateTime22.compareTo((org.joda.time.ReadablePartial) localDateTime24);
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime();
        boolean boolean27 = localDateTime22.isEqual((org.joda.time.ReadablePartial) localDateTime26);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime(dateTimeZone28);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime29.minusWeeks(0);
        int int32 = localDateTime26.compareTo((org.joda.time.ReadablePartial) localDateTime29);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime15.withFields((org.joda.time.ReadablePartial) localDateTime26);
        org.joda.time.LocalDateTime.Property property34 = localDateTime26.year();
        org.joda.time.LocalDateTime.Property property35 = localDateTime26.dayOfWeek();
        org.joda.time.LocalDateTime.Property property36 = localDateTime26.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.LocalDateTime localDateTime38 = new org.joda.time.LocalDateTime(dateTimeZone37);
        org.joda.time.LocalDateTime localDateTime40 = localDateTime38.minusWeeks(0);
        int int41 = localDateTime40.getYearOfCentury();
        org.joda.time.LocalDateTime localDateTime43 = localDateTime40.minusDays(100);
        org.joda.time.LocalDateTime localDateTime45 = localDateTime43.withWeekyear(893);
        int int46 = localDateTime43.getMinuteOfHour();
        boolean boolean47 = localDateTime26.isAfter((org.joda.time.ReadablePartial) localDateTime43);
        org.joda.time.LocalDateTime localDateTime49 = localDateTime43.plusMillis((int) (short) -1);
        org.joda.time.LocalDateTime localDateTime51 = localDateTime49.plusWeeks(61683951);
        org.joda.time.LocalDateTime localDateTime53 = localDateTime51.minusWeeks((int) 'x');
        org.joda.time.LocalDateTime localDateTime54 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property55 = localDateTime54.millisOfSecond();
        org.joda.time.LocalDateTime.Property property56 = localDateTime54.weekOfWeekyear();
        org.joda.time.Chronology chronology57 = localDateTime54.getChronology();
        org.joda.time.DateTimeFieldType dateTimeFieldType58 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology59 = null;
        boolean boolean60 = dateTimeFieldType58.isSupported(chronology59);
        org.joda.time.DateTimeZone dateTimeZone61 = null;
        org.joda.time.LocalDateTime localDateTime62 = new org.joda.time.LocalDateTime(dateTimeZone61);
        org.joda.time.LocalDateTime localDateTime64 = localDateTime62.minusWeeks(0);
        org.joda.time.Chronology chronology65 = localDateTime64.getChronology();
        org.joda.time.DateTimeField dateTimeField66 = dateTimeFieldType58.getField(chronology65);
        org.joda.time.DurationFieldType durationFieldType67 = dateTimeFieldType58.getRangeDurationType();
        int int68 = localDateTime54.get(dateTimeFieldType58);
        org.joda.time.LocalDateTime localDateTime70 = localDateTime54.withSecondOfMinute(20);
        org.joda.time.LocalDateTime localDateTime72 = localDateTime70.minusYears(61678279);
        org.joda.time.LocalDateTime localDateTime73 = localDateTime51.withFields((org.joda.time.ReadablePartial) localDateTime70);
        long long75 = zonedChronology12.set((org.joda.time.ReadablePartial) localDateTime73, 32L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField13", (durationField5.compareTo(durationField13) == 0) == durationField5.equals(durationField13));
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test557");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        boolean boolean14 = zonedChronology12.equals((java.lang.Object) "292278993-02-22T07:07:50.878");
        org.joda.time.DateTimeField dateTimeField15 = zonedChronology12.hourOfDay();
        org.joda.time.DateTimeField dateTimeField16 = zonedChronology12.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone17 = zonedChronology12.getZone();
        org.joda.time.DurationField durationField18 = zonedChronology12.days();
        long long21 = durationField18.add(61704000L, 93);
        org.joda.time.DurationFieldType durationFieldType22 = durationField18.getType();
        java.lang.String str23 = durationFieldType22.getName();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField18", (durationField5.compareTo(durationField18) == 0) == durationField5.equals(durationField18));
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test558");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DurationField durationField13 = zonedChronology12.weeks();
        org.joda.time.DateTimeField dateTimeField14 = zonedChronology12.yearOfEra();
        org.joda.time.DurationField durationField15 = zonedChronology12.weekyears();
        org.joda.time.DateTimeField dateTimeField16 = zonedChronology12.monthOfYear();
        org.joda.time.DurationField durationField17 = zonedChronology12.halfdays();
        org.joda.time.DateTimeField dateTimeField18 = zonedChronology12.weekyear();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime(dateTimeZone19);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime(dateTimeZone21);
        int int23 = localDateTime20.compareTo((org.joda.time.ReadablePartial) localDateTime22);
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime();
        boolean boolean25 = localDateTime20.isEqual((org.joda.time.ReadablePartial) localDateTime24);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime(dateTimeZone26);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.minusWeeks(0);
        int int30 = localDateTime24.compareTo((org.joda.time.ReadablePartial) localDateTime27);
        int int31 = localDateTime27.getEra();
        int int32 = dateTimeField18.getMinimumValue((org.joda.time.ReadablePartial) localDateTime27);
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property34 = localDateTime33.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.LocalDateTime localDateTime36 = new org.joda.time.LocalDateTime(dateTimeZone35);
        org.joda.time.LocalDateTime.Property property37 = localDateTime36.yearOfEra();
        org.joda.time.LocalDateTime.Property property38 = localDateTime36.monthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = property38.getFieldType();
        boolean boolean40 = localDateTime33.isSupported(dateTimeFieldType39);
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime(dateTimeZone41);
        org.joda.time.LocalDateTime localDateTime44 = localDateTime42.minusWeeks(0);
        org.joda.time.Chronology chronology45 = localDateTime44.getChronology();
        org.joda.time.DurationField durationField46 = chronology45.days();
        org.joda.time.DurationField durationField47 = chronology45.minutes();
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str52 = dateTimeZone50.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology53 = org.joda.time.chrono.ZonedChronology.getInstance(chronology45, dateTimeZone50);
        org.joda.time.DurationField durationField54 = zonedChronology53.weeks();
        org.joda.time.DateTimeField dateTimeField55 = zonedChronology53.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone56 = zonedChronology53.getZone();
        boolean boolean57 = dateTimeFieldType39.isSupported((org.joda.time.Chronology) zonedChronology53);
        int int58 = localDateTime27.indexOf(dateTimeFieldType39);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField13 and durationField54", (durationField13.compareTo(durationField54) == 0) == durationField13.equals(durationField54));
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test559");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        int int4 = localDateTime3.getYearOfCentury();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.minusDays(100);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology8 = null;
        boolean boolean9 = dateTimeFieldType7.isSupported(chronology8);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(dateTimeZone10);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.minusWeeks(0);
        org.joda.time.Chronology chronology14 = localDateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = dateTimeFieldType7.getField(chronology14);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime6.withField(dateTimeFieldType7, (int) 'x');
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime(dateTimeZone18);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.minusWeeks(0);
        org.joda.time.Chronology chronology22 = localDateTime21.getChronology();
        org.joda.time.DurationField durationField23 = chronology22.days();
        org.joda.time.DurationField durationField24 = chronology22.minutes();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str29 = dateTimeZone27.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology30 = org.joda.time.chrono.ZonedChronology.getInstance(chronology22, dateTimeZone27);
        org.joda.time.DateTimeField dateTimeField31 = zonedChronology30.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean35 = dateTimeZone33.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology36 = zonedChronology30.withZone(dateTimeZone33);
        org.joda.time.DateTimeField dateTimeField37 = zonedChronology30.dayOfMonth();
        org.joda.time.DurationField durationField38 = zonedChronology30.years();
        org.joda.time.LocalDateTime localDateTime39 = new org.joda.time.LocalDateTime((org.joda.time.Chronology) zonedChronology30);
        org.joda.time.DateTimeZone dateTimeZone40 = zonedChronology30.getZone();
        org.joda.time.DurationField durationField41 = zonedChronology30.seconds();
        org.joda.time.DateTimeField dateTimeField42 = dateTimeFieldType7.getField((org.joda.time.Chronology) zonedChronology30);
        org.joda.time.DateTimeField dateTimeField43 = zonedChronology30.dayOfYear();
        org.joda.time.DateTimeField dateTimeField44 = zonedChronology30.weekyearOfCentury();
        org.joda.time.DurationField durationField45 = zonedChronology30.days();
        org.joda.time.DateTimeField dateTimeField46 = zonedChronology30.weekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField23 and durationField45", (durationField23.compareTo(durationField45) == 0) == durationField23.equals(durationField45));
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test560");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        int int4 = localDateTime3.getYearOfCentury();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.minusDays(100);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withWeekyear(893);
        int int9 = localDateTime6.getMinuteOfHour();
        org.joda.time.Chronology chronology10 = localDateTime6.getChronology();
        org.joda.time.DurationField durationField11 = chronology10.eras();
        org.joda.time.DurationField durationField12 = chronology10.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField11, durationField12, and durationField11", !(durationField11.compareTo(durationField12) == 0) || (Math.signum(durationField11.compareTo(durationField11)) == Math.signum(durationField12.compareTo(durationField11))));
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test561");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology18 = zonedChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology12.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField21 = zonedChronology12.yearOfEra();
        org.joda.time.DurationField durationField22 = zonedChronology12.weeks();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology12.clockhourOfDay();
        org.joda.time.DurationField durationField24 = zonedChronology12.minutes();
        org.joda.time.DurationField durationField25 = zonedChronology12.weeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField24", (durationField6.compareTo(durationField24) == 0) == durationField6.equals(durationField24));
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test562");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology18 = zonedChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology12.weekOfWeekyear();
        org.joda.time.Chronology chronology21 = zonedChronology12.withUTC();
        org.joda.time.DurationField durationField22 = zonedChronology12.minutes();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology12.halfdayOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField22", (durationField6.compareTo(durationField22) == 0) == durationField6.equals(durationField22));
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test563");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DurationField durationField13 = zonedChronology12.weeks();
        org.joda.time.DateTimeField dateTimeField14 = zonedChronology12.year();
        org.joda.time.DateTimeZone dateTimeZone15 = zonedChronology12.getZone();
        org.joda.time.DateTimeField dateTimeField16 = zonedChronology12.millisOfSecond();
        org.joda.time.DurationField durationField17 = zonedChronology12.hours();
        org.joda.time.DurationField durationField18 = zonedChronology12.centuries();
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology12.yearOfEra();
        org.joda.time.Chronology chronology21 = zonedChronology12.withUTC();
        org.joda.time.DurationField durationField22 = zonedChronology12.seconds();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime(dateTimeZone23);
        org.joda.time.LocalDateTime.Property property25 = localDateTime24.yearOfEra();
        int int26 = property25.getMinimumValue();
        org.joda.time.DurationField durationField27 = property25.getLeapDurationField();
        int int28 = property25.getMinimumValue();
        java.lang.String str29 = property25.getName();
        org.joda.time.LocalDateTime localDateTime31 = property25.addWrapFieldToCopy((int) (short) 10);
        long long33 = zonedChronology12.set((org.joda.time.ReadablePartial) localDateTime31, (long) (byte) 100);
        org.joda.time.DurationField durationField34 = zonedChronology12.millis();
        org.joda.time.DurationField durationField35 = zonedChronology12.weeks();
        org.joda.time.DurationField durationField36 = zonedChronology12.years();
        org.joda.time.DateTimeField dateTimeField37 = zonedChronology12.secondOfDay();
        org.joda.time.DurationField durationField38 = zonedChronology12.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField38, durationField5, and durationField6", !(durationField38.compareTo(durationField5) == 0) || (Math.signum(durationField38.compareTo(durationField6)) == Math.signum(durationField5.compareTo(durationField6))));
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test564");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        boolean boolean14 = zonedChronology12.equals((java.lang.Object) "292278993-02-22T07:07:50.878");
        org.joda.time.DateTimeField dateTimeField15 = zonedChronology12.hourOfDay();
        org.joda.time.DateTimeField dateTimeField16 = zonedChronology12.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField17 = zonedChronology12.hourOfHalfday();
        org.joda.time.Chronology chronology18 = zonedChronology12.withUTC();
        java.lang.Object obj19 = null;
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime(dateTimeZone20);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.minusWeeks(0);
        org.joda.time.Chronology chronology24 = localDateTime23.getChronology();
        org.joda.time.DurationField durationField25 = chronology24.days();
        org.joda.time.DurationField durationField26 = chronology24.minutes();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str31 = dateTimeZone29.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology32 = org.joda.time.chrono.ZonedChronology.getInstance(chronology24, dateTimeZone29);
        org.joda.time.DateTimeField dateTimeField33 = zonedChronology32.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean37 = dateTimeZone35.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology38 = zonedChronology32.withZone(dateTimeZone35);
        org.joda.time.DateTimeField dateTimeField39 = zonedChronology32.minuteOfHour();
        org.joda.time.Chronology chronology40 = zonedChronology32.withUTC();
        org.joda.time.DurationField durationField41 = zonedChronology32.years();
        org.joda.time.DateTimeField dateTimeField42 = zonedChronology32.minuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.LocalDateTime localDateTime44 = new org.joda.time.LocalDateTime(dateTimeZone43);
        org.joda.time.LocalDateTime localDateTime46 = localDateTime44.minusWeeks(0);
        int int47 = localDateTime46.getYearOfCentury();
        org.joda.time.LocalDateTime localDateTime49 = localDateTime46.withMillisOfSecond((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime51 = localDateTime49.minusHours((int) '#');
        int[] intArray53 = zonedChronology32.get((org.joda.time.ReadablePartial) localDateTime49, (long) 2022);
        org.joda.time.DateTimeFieldType dateTimeFieldType54 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology55 = null;
        boolean boolean56 = dateTimeFieldType54.isSupported(chronology55);
        org.joda.time.DateTimeZone dateTimeZone57 = null;
        org.joda.time.LocalDateTime localDateTime58 = new org.joda.time.LocalDateTime(dateTimeZone57);
        org.joda.time.LocalDateTime localDateTime60 = localDateTime58.minusWeeks(0);
        org.joda.time.Chronology chronology61 = localDateTime60.getChronology();
        org.joda.time.DateTimeField dateTimeField62 = dateTimeFieldType54.getField(chronology61);
        org.joda.time.DateTimeZone dateTimeZone65 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str67 = dateTimeZone65.getShortName((long) 10);
        java.lang.String str68 = dateTimeZone65.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone65);
        org.joda.time.chrono.ZonedChronology zonedChronology70 = org.joda.time.chrono.ZonedChronology.getInstance(chronology61, dateTimeZone65);
        java.lang.String str72 = dateTimeZone65.getShortName(4518470650L);
        java.util.TimeZone timeZone73 = dateTimeZone65.toTimeZone();
        org.joda.time.Chronology chronology74 = zonedChronology32.withZone(dateTimeZone65);
        org.joda.time.LocalDateTime localDateTime75 = new org.joda.time.LocalDateTime(obj19, dateTimeZone65);
        long long77 = zonedChronology12.set((org.joda.time.ReadablePartial) localDateTime75, 1876085055L);
        org.joda.time.Chronology chronology78 = zonedChronology12.withUTC();
        org.joda.time.DateTimeField dateTimeField79 = zonedChronology12.halfdayOfDay();
        org.joda.time.DurationField durationField80 = zonedChronology12.minutes();
        org.joda.time.DurationField durationField81 = zonedChronology12.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField80", (durationField6.compareTo(durationField80) == 0) == durationField6.equals(durationField80));
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test565");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology12.monthOfYear();
        org.joda.time.DurationField durationField14 = zonedChronology12.hours();
        org.joda.time.DurationField durationField15 = zonedChronology12.seconds();
        org.joda.time.DateTimeField dateTimeField16 = zonedChronology12.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField17 = zonedChronology12.monthOfYear();
        org.joda.time.DurationField durationField18 = zonedChronology12.days();
        org.joda.time.DurationField durationField19 = zonedChronology12.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField18", (durationField5.compareTo(durationField18) == 0) == durationField5.equals(durationField18));
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test566");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DurationField durationField13 = zonedChronology12.weeks();
        org.joda.time.DateTimeField dateTimeField14 = zonedChronology12.year();
        org.joda.time.DateTimeZone dateTimeZone15 = zonedChronology12.getZone();
        org.joda.time.DateTimeField dateTimeField16 = zonedChronology12.millisOfSecond();
        org.joda.time.DurationField durationField17 = zonedChronology12.hours();
        org.joda.time.DurationField durationField18 = zonedChronology12.centuries();
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology12.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField21 = zonedChronology12.yearOfEra();
        org.joda.time.DurationField durationField22 = zonedChronology12.days();
        org.joda.time.DurationField durationField23 = zonedChronology12.years();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField22", (durationField5.compareTo(durationField22) == 0) == durationField5.equals(durationField22));
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test567");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DurationField durationField13 = zonedChronology12.weeks();
        org.joda.time.DateTimeField dateTimeField14 = zonedChronology12.year();
        org.joda.time.DateTimeZone dateTimeZone15 = zonedChronology12.getZone();
        org.joda.time.DateTimeField dateTimeField16 = zonedChronology12.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        int int20 = dateTimeZone18.getOffsetFromLocal(4518471413L);
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime(dateTimeZone18);
        long long23 = dateTimeZone18.nextTransition(60639990L);
        java.util.Locale.Category category25 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale26 = java.util.Locale.CANADA;
        java.util.Locale.setDefault(category25, locale26);
        java.lang.String str28 = locale26.toLanguageTag();
        java.util.Locale.Category category29 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale30 = java.util.Locale.CANADA;
        java.util.Locale.setDefault(category29, locale30);
        java.lang.String str32 = locale30.toLanguageTag();
        java.lang.String str33 = locale26.getDisplayLanguage(locale30);
        java.lang.String str34 = dateTimeZone18.getName(0L, locale26);
        org.joda.time.chrono.ZonedChronology zonedChronology35 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) zonedChronology12, dateTimeZone18);
        org.joda.time.DateTimeField dateTimeField36 = zonedChronology12.dayOfYear();
        org.joda.time.DurationField durationField37 = zonedChronology12.minutes();
        org.joda.time.DurationField durationField38 = zonedChronology12.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField38", (durationField6.compareTo(durationField38) == 0) == durationField6.equals(durationField38));
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test568");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology18 = zonedChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology12.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField21 = zonedChronology12.weekyear();
        org.joda.time.DurationField durationField22 = zonedChronology12.years();
        org.joda.time.DurationField durationField23 = zonedChronology12.weeks();
        org.joda.time.DurationField durationField24 = zonedChronology12.months();
        org.joda.time.DurationField durationField25 = zonedChronology12.days();
        org.joda.time.Chronology chronology26 = zonedChronology12.withUTC();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField25", (durationField5.compareTo(durationField25) == 0) == durationField5.equals(durationField25));
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test569");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DurationField durationField13 = zonedChronology12.weeks();
        org.joda.time.DateTimeField dateTimeField14 = zonedChronology12.year();
        org.joda.time.DateTimeZone dateTimeZone15 = zonedChronology12.getZone();
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        long long19 = zonedChronology12.add(readablePeriod16, 468L, (int) 'u');
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology12.era();
        org.joda.time.DurationField durationField21 = zonedChronology12.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField21, durationField5, and durationField6", !(durationField21.compareTo(durationField5) == 0) || (Math.signum(durationField21.compareTo(durationField6)) == Math.signum(durationField5.compareTo(durationField6))));
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test570");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DurationField durationField13 = zonedChronology12.weeks();
        org.joda.time.DateTimeField dateTimeField14 = zonedChronology12.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField15 = zonedChronology12.dayOfWeek();
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        long long19 = zonedChronology12.add(readablePeriod16, 0L, 2);
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology12.weekyearOfCentury();
        java.lang.String str21 = zonedChronology12.toString();
        org.joda.time.DateTimeField dateTimeField22 = zonedChronology12.monthOfYear();
        org.joda.time.DurationField durationField23 = zonedChronology12.months();
        org.joda.time.DurationField durationField24 = zonedChronology12.seconds();
        org.joda.time.DurationField durationField25 = zonedChronology12.hours();
        org.joda.time.DurationField durationField26 = zonedChronology12.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField26, durationField5, and durationField6", !(durationField26.compareTo(durationField5) == 0) || (Math.signum(durationField26.compareTo(durationField6)) == Math.signum(durationField5.compareTo(durationField6))));
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test571");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DurationField durationField13 = zonedChronology12.weeks();
        org.joda.time.DateTimeField dateTimeField14 = zonedChronology12.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone15 = zonedChronology12.getZone();
        java.lang.String str17 = dateTimeZone15.getName(1876077118L);
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime(dateTimeZone15);
        java.util.TimeZone timeZone19 = dateTimeZone15.toTimeZone();
        java.util.TimeZone timeZone20 = dateTimeZone15.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime(dateTimeZone22);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.minusWeeks(0);
        org.joda.time.Chronology chronology26 = localDateTime25.getChronology();
        org.joda.time.DurationField durationField27 = chronology26.days();
        org.joda.time.DurationField durationField28 = chronology26.minutes();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str33 = dateTimeZone31.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology34 = org.joda.time.chrono.ZonedChronology.getInstance(chronology26, dateTimeZone31);
        org.joda.time.DurationField durationField35 = zonedChronology34.weeks();
        org.joda.time.DateTimeField dateTimeField36 = zonedChronology34.year();
        org.joda.time.DurationField durationField37 = zonedChronology34.months();
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str42 = dateTimeZone40.getShortName((long) 10);
        java.lang.String str43 = dateTimeZone40.getID();
        long long46 = dateTimeZone40.convertLocalToUTC((long) (short) 1, false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone40);
        int int49 = dateTimeZone40.getStandardOffset(1L);
        org.joda.time.chrono.ZonedChronology zonedChronology50 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) zonedChronology34, dateTimeZone40);
        org.joda.time.DateTimeField dateTimeField51 = zonedChronology34.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone52 = zonedChronology34.getZone();
        java.util.Locale.Category category54 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale55 = java.util.Locale.CANADA;
        java.util.Locale.setDefault(category54, locale55);
        org.joda.time.DateTimeZone dateTimeZone57 = null;
        org.joda.time.LocalDateTime localDateTime58 = new org.joda.time.LocalDateTime(dateTimeZone57);
        org.joda.time.LocalDateTime.Property property59 = localDateTime58.yearOfEra();
        int int60 = property59.getMinimumValue();
        java.lang.String str61 = property59.getAsText();
        java.util.Locale locale62 = java.util.Locale.FRANCE;
        java.lang.String str63 = property59.getAsText(locale62);
        java.lang.String str64 = locale55.getDisplayCountry(locale62);
        java.lang.String str65 = dateTimeZone52.getName((long) 879, locale62);
        java.lang.String str66 = dateTimeZone15.getShortName((long) 61744661, locale62);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField13 and durationField35", (durationField13.compareTo(durationField35) == 0) == durationField13.equals(durationField35));
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test572");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minusWeeks(0);
        org.joda.time.Chronology chronology5 = localDateTime4.getChronology();
        org.joda.time.DurationField durationField6 = chronology5.days();
        org.joda.time.DurationField durationField7 = chronology5.minutes();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str12 = dateTimeZone10.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology13 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone10);
        org.joda.time.DateTimeField dateTimeField14 = zonedChronology13.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean18 = dateTimeZone16.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology19 = zonedChronology13.withZone(dateTimeZone16);
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology13.dayOfMonth();
        org.joda.time.DurationField durationField21 = zonedChronology13.seconds();
        org.joda.time.DateTimeField dateTimeField22 = dateTimeFieldType0.getField((org.joda.time.Chronology) zonedChronology13);
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology13.millisOfSecond();
        org.joda.time.DurationField durationField24 = zonedChronology13.weeks();
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime(dateTimeZone25);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime26.minusWeeks(0);
        org.joda.time.Chronology chronology29 = localDateTime28.getChronology();
        org.joda.time.DurationField durationField30 = chronology29.days();
        org.joda.time.DurationField durationField31 = chronology29.minutes();
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str36 = dateTimeZone34.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology37 = org.joda.time.chrono.ZonedChronology.getInstance(chronology29, dateTimeZone34);
        org.joda.time.DateTimeField dateTimeField38 = zonedChronology37.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean42 = dateTimeZone40.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology43 = zonedChronology37.withZone(dateTimeZone40);
        org.joda.time.DateTimeField dateTimeField44 = zonedChronology37.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField45 = zonedChronology37.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField46 = zonedChronology37.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField47 = zonedChronology37.hourOfDay();
        org.joda.time.DurationField durationField48 = zonedChronology37.halfdays();
        org.joda.time.LocalDateTime localDateTime50 = new org.joda.time.LocalDateTime((long) (byte) -1);
        int[] intArray52 = zonedChronology37.get((org.joda.time.ReadablePartial) localDateTime50, 4554642067L);
        org.joda.time.DateTimeZone dateTimeZone53 = null;
        org.joda.time.LocalDateTime localDateTime54 = new org.joda.time.LocalDateTime(dateTimeZone53);
        org.joda.time.LocalDateTime localDateTime56 = localDateTime54.minusWeeks(0);
        org.joda.time.Chronology chronology57 = localDateTime56.getChronology();
        org.joda.time.DurationField durationField58 = chronology57.days();
        org.joda.time.DurationField durationField59 = chronology57.minutes();
        org.joda.time.DateTimeZone dateTimeZone62 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str64 = dateTimeZone62.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology65 = org.joda.time.chrono.ZonedChronology.getInstance(chronology57, dateTimeZone62);
        org.joda.time.DurationField durationField66 = zonedChronology65.weeks();
        org.joda.time.DateTimeField dateTimeField67 = zonedChronology65.year();
        org.joda.time.DurationField durationField68 = zonedChronology65.months();
        org.joda.time.DateTimeZone dateTimeZone71 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str73 = dateTimeZone71.getShortName((long) 10);
        java.lang.String str74 = dateTimeZone71.getID();
        long long77 = dateTimeZone71.convertLocalToUTC((long) (short) 1, false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone71);
        int int80 = dateTimeZone71.getStandardOffset(1L);
        org.joda.time.chrono.ZonedChronology zonedChronology81 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) zonedChronology65, dateTimeZone71);
        org.joda.time.DateTimeField dateTimeField82 = zonedChronology65.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone83 = zonedChronology65.getZone();
        org.joda.time.DateTimeField dateTimeField84 = zonedChronology65.secondOfDay();
        org.joda.time.DurationField durationField85 = zonedChronology65.weeks();
        org.joda.time.DateTimeField dateTimeField86 = zonedChronology65.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone87 = null;
        org.joda.time.LocalDateTime localDateTime88 = new org.joda.time.LocalDateTime(dateTimeZone87);
        org.joda.time.LocalDateTime localDateTime90 = localDateTime88.minusWeeks(0);
        int int91 = localDateTime90.getYearOfCentury();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray92 = localDateTime90.getFieldTypes();
        int[] intArray94 = zonedChronology65.get((org.joda.time.ReadablePartial) localDateTime90, (long) 20);
        zonedChronology13.validate((org.joda.time.ReadablePartial) localDateTime50, intArray94);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField24 and durationField66", (durationField24.compareTo(durationField66) == 0) == durationField24.equals(durationField66));
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test573");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology18 = zonedChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.dayOfMonth();
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        long long23 = zonedChronology12.add(readablePeriod20, (long) 53, (int) (byte) 0);
        long long27 = zonedChronology12.add(1645427275536L, 0L, 8);
        org.joda.time.DurationField durationField28 = zonedChronology12.hours();
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology12.hourOfDay();
        org.joda.time.DateTimeField dateTimeField30 = zonedChronology12.millisOfSecond();
        org.joda.time.DurationField durationField31 = zonedChronology12.days();
        org.joda.time.Chronology chronology32 = zonedChronology12.withUTC();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField31", (durationField5.compareTo(durationField31) == 0) == durationField5.equals(durationField31));
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test574");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology18 = zonedChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology12.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField21 = zonedChronology12.weekyear();
        org.joda.time.DurationField durationField22 = zonedChronology12.years();
        org.joda.time.DurationField durationField23 = zonedChronology12.weeks();
        org.joda.time.DurationField durationField24 = zonedChronology12.years();
        org.joda.time.DurationField durationField25 = zonedChronology12.centuries();
        org.joda.time.DurationField durationField26 = zonedChronology12.weekyears();
        org.joda.time.DurationField durationField27 = zonedChronology12.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField22 and durationField27", (durationField22.compareTo(durationField27) == 0) == durationField22.equals(durationField27));
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test575");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology18 = zonedChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology12.year();
        org.joda.time.DateTimeField dateTimeField21 = zonedChronology12.dayOfYear();
        org.joda.time.Chronology chronology22 = zonedChronology12.withUTC();
        org.joda.time.DurationField durationField23 = zonedChronology12.seconds();
        org.joda.time.DurationField durationField24 = zonedChronology12.weeks();
        org.joda.time.DateTimeField dateTimeField25 = zonedChronology12.hourOfHalfday();
        org.joda.time.DurationField durationField26 = zonedChronology12.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField26, durationField5, and durationField6", !(durationField26.compareTo(durationField5) == 0) || (Math.signum(durationField26.compareTo(durationField6)) == Math.signum(durationField5.compareTo(durationField6))));
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test576");
        java.util.Locale locale0 = java.util.Locale.KOREAN;
        java.util.Set<java.lang.Character> charSet1 = locale0.getExtensionKeys();
        java.util.Iterator<java.lang.Character> charItor2 = charSet1.iterator();
        java.util.Locale locale3 = java.util.Locale.KOREAN;
        java.util.Set<java.lang.Character> charSet4 = locale3.getExtensionKeys();
        java.lang.Object[] objArray5 = charSet4.toArray();
        java.util.Locale locale6 = java.util.Locale.KOREAN;
        java.util.Set<java.lang.Character> charSet7 = locale6.getExtensionKeys();
        boolean boolean8 = charSet4.retainAll((java.util.Collection<java.lang.Character>) charSet7);
        boolean boolean9 = charSet1.containsAll((java.util.Collection<java.lang.Character>) charSet4);
        java.util.stream.Stream<java.lang.Character> charStream10 = charSet4.stream();
        java.util.Locale locale11 = java.util.Locale.KOREAN;
        java.util.Set<java.lang.Character> charSet12 = locale11.getExtensionKeys();
        java.lang.Object[] objArray13 = charSet12.toArray();
        org.joda.time.ReadableInstant[] readableInstantArray14 = new org.joda.time.ReadableInstant[] {};
        org.joda.time.ReadableInstant[] readableInstantArray15 = charSet12.toArray(readableInstantArray14);
        org.joda.time.DurationField[] durationFieldArray16 = new org.joda.time.DurationField[] {};
        org.joda.time.DurationField[] durationFieldArray17 = charSet12.toArray(durationFieldArray16);
        boolean boolean18 = charSet4.addAll((java.util.Collection<java.lang.Character>) charSet12);
        java.util.Locale locale19 = java.util.Locale.KOREAN;
        java.util.Set<java.lang.Character> charSet20 = locale19.getExtensionKeys();
        int int21 = charSet20.size();
        boolean boolean22 = charSet4.addAll((java.util.Collection<java.lang.Character>) charSet20);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime(dateTimeZone23);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime24.minusWeeks(0);
        org.joda.time.Chronology chronology27 = localDateTime26.getChronology();
        org.joda.time.DurationField durationField28 = chronology27.days();
        org.joda.time.DurationField durationField29 = chronology27.minutes();
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str34 = dateTimeZone32.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology35 = org.joda.time.chrono.ZonedChronology.getInstance(chronology27, dateTimeZone32);
        org.joda.time.DateTimeField dateTimeField36 = zonedChronology35.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean40 = dateTimeZone38.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology41 = zonedChronology35.withZone(dateTimeZone38);
        org.joda.time.DateTimeField dateTimeField42 = zonedChronology35.dayOfMonth();
        org.joda.time.ReadablePeriod readablePeriod43 = null;
        long long46 = zonedChronology35.add(readablePeriod43, (long) 53, (int) (byte) 0);
        long long50 = zonedChronology35.add(1645427275536L, 0L, 8);
        org.joda.time.Chronology chronology51 = zonedChronology35.withUTC();
        org.joda.time.DateTimeField dateTimeField52 = zonedChronology35.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField53 = zonedChronology35.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField54 = zonedChronology35.weekyearOfCentury();
        boolean boolean55 = charSet4.equals((java.lang.Object) zonedChronology35);
        org.joda.time.DateTimeField dateTimeField56 = zonedChronology35.yearOfEra();
        org.joda.time.DurationField durationField57 = zonedChronology35.months();
        org.joda.time.DurationFieldType durationFieldType58 = durationField57.getType();
        org.joda.time.DateTimeZone dateTimeZone59 = null;
        org.joda.time.LocalDateTime localDateTime60 = new org.joda.time.LocalDateTime(dateTimeZone59);
        org.joda.time.LocalDateTime localDateTime62 = localDateTime60.minusWeeks(0);
        org.joda.time.Chronology chronology63 = localDateTime62.getChronology();
        org.joda.time.DurationField durationField64 = chronology63.days();
        org.joda.time.DurationField durationField65 = chronology63.minutes();
        org.joda.time.DateTimeZone dateTimeZone68 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str70 = dateTimeZone68.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology71 = org.joda.time.chrono.ZonedChronology.getInstance(chronology63, dateTimeZone68);
        boolean boolean73 = zonedChronology71.equals((java.lang.Object) "292278993-02-22T07:07:50.878");
        org.joda.time.DateTimeField dateTimeField74 = zonedChronology71.hourOfDay();
        org.joda.time.DateTimeField dateTimeField75 = zonedChronology71.dayOfYear();
        org.joda.time.LocalDateTime localDateTime76 = new org.joda.time.LocalDateTime((org.joda.time.Chronology) zonedChronology71);
        org.joda.time.DurationField durationField77 = zonedChronology71.months();
        java.lang.String str78 = zonedChronology71.toString();
        boolean boolean79 = durationFieldType58.isSupported((org.joda.time.Chronology) zonedChronology71);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField57 and durationField77", (durationField57.compareTo(durationField77) == 0) == durationField57.equals(durationField77));
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test577");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.yearOfEra();
        long long3 = property2.remainder();
        org.joda.time.DurationField durationField4 = property2.getDurationField();
        org.joda.time.LocalDateTime localDateTime5 = property2.roundHalfFloorCopy();
        int int6 = property2.getLeapAmount();
        org.joda.time.LocalDateTime localDateTime7 = property2.withMaximumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime7.withField(dateTimeFieldType8, 61844804);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(dateTimeZone11);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.minusWeeks(0);
        org.joda.time.Chronology chronology15 = localDateTime14.getChronology();
        org.joda.time.DurationField durationField16 = chronology15.days();
        org.joda.time.DurationField durationField17 = chronology15.minutes();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str22 = dateTimeZone20.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology23 = org.joda.time.chrono.ZonedChronology.getInstance(chronology15, dateTimeZone20);
        org.joda.time.DurationField durationField24 = zonedChronology23.weeks();
        org.joda.time.DateTimeField dateTimeField25 = zonedChronology23.year();
        org.joda.time.DateTimeZone dateTimeZone26 = zonedChronology23.getZone();
        org.joda.time.DateTimeField dateTimeField27 = zonedChronology23.year();
        java.lang.String str28 = zonedChronology23.toString();
        org.joda.time.DurationField durationField29 = zonedChronology23.months();
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime(dateTimeZone30);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime31.minusWeeks(0);
        org.joda.time.Chronology chronology34 = localDateTime33.getChronology();
        org.joda.time.DurationField durationField35 = chronology34.days();
        org.joda.time.DurationField durationField36 = chronology34.minutes();
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str41 = dateTimeZone39.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology42 = org.joda.time.chrono.ZonedChronology.getInstance(chronology34, dateTimeZone39);
        org.joda.time.DateTimeField dateTimeField43 = zonedChronology42.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean47 = dateTimeZone45.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology48 = zonedChronology42.withZone(dateTimeZone45);
        org.joda.time.DateTimeField dateTimeField49 = zonedChronology42.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField50 = zonedChronology42.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField51 = zonedChronology42.weekyear();
        org.joda.time.DateTimeField dateTimeField52 = zonedChronology42.dayOfMonth();
        long long56 = zonedChronology42.add(1876103295L, (long) 356, (int) (short) -1);
        org.joda.time.DateTimeField dateTimeField57 = zonedChronology42.weekyearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone58 = zonedChronology42.getZone();
        org.joda.time.Chronology chronology59 = zonedChronology23.withZone(dateTimeZone58);
        boolean boolean60 = dateTimeFieldType8.isSupported(chronology59);
        org.joda.time.DurationField durationField61 = chronology59.hours();
        org.joda.time.DurationFieldType durationFieldType62 = durationField61.getType();
        org.joda.time.DateTimeFieldType dateTimeFieldType63 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone64 = null;
        org.joda.time.LocalDateTime localDateTime65 = new org.joda.time.LocalDateTime(dateTimeZone64);
        org.joda.time.LocalDateTime localDateTime67 = localDateTime65.minusWeeks(0);
        org.joda.time.Chronology chronology68 = localDateTime67.getChronology();
        org.joda.time.DurationField durationField69 = chronology68.days();
        org.joda.time.DurationField durationField70 = chronology68.minutes();
        org.joda.time.DateTimeZone dateTimeZone73 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str75 = dateTimeZone73.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology76 = org.joda.time.chrono.ZonedChronology.getInstance(chronology68, dateTimeZone73);
        org.joda.time.DurationField durationField77 = zonedChronology76.seconds();
        org.joda.time.DateTimeField dateTimeField78 = dateTimeFieldType63.getField((org.joda.time.Chronology) zonedChronology76);
        org.joda.time.DurationField durationField79 = zonedChronology76.hours();
        org.joda.time.DateTimeField dateTimeField80 = zonedChronology76.halfdayOfDay();
        org.joda.time.DurationField durationField81 = durationFieldType62.getField((org.joda.time.Chronology) zonedChronology76);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField61 and durationField81", (durationField61.compareTo(durationField81) == 0) == durationField61.equals(durationField81));
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test578");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        boolean boolean14 = zonedChronology12.equals((java.lang.Object) "292278993-02-22T07:07:50.878");
        org.joda.time.DateTimeField dateTimeField15 = zonedChronology12.hourOfDay();
        org.joda.time.DurationField durationField16 = zonedChronology12.hours();
        org.joda.time.DurationField durationField17 = zonedChronology12.weeks();
        org.joda.time.DateTimeField dateTimeField18 = zonedChronology12.yearOfCentury();
        org.joda.time.DurationField durationField19 = zonedChronology12.centuries();
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology12.era();
        int int22 = dateTimeField20.getMaximumValue(61722864L);
        org.joda.time.DurationField durationField23 = dateTimeField20.getDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField23, durationField5, and durationField6", !(durationField23.compareTo(durationField5) == 0) || (Math.signum(durationField23.compareTo(durationField6)) == Math.signum(durationField5.compareTo(durationField6))));
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test579");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DurationField durationField13 = zonedChronology12.weeks();
        org.joda.time.DateTimeField dateTimeField14 = zonedChronology12.year();
        org.joda.time.DurationField durationField15 = zonedChronology12.months();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str20 = dateTimeZone18.getShortName((long) 10);
        java.lang.String str21 = dateTimeZone18.getID();
        long long24 = dateTimeZone18.convertLocalToUTC((long) (short) 1, false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone18);
        int int27 = dateTimeZone18.getStandardOffset(1L);
        org.joda.time.chrono.ZonedChronology zonedChronology28 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) zonedChronology12, dateTimeZone18);
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology12.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField30 = zonedChronology12.centuryOfEra();
        org.joda.time.DurationField durationField31 = zonedChronology12.days();
        org.joda.time.DurationField durationField32 = zonedChronology12.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField31", (durationField5.compareTo(durationField31) == 0) == durationField5.equals(durationField31));
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test580");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str4 = dateTimeZone2.getShortName((long) 10);
        long long6 = dateTimeZone2.convertUTCToLocal((long) 55);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime(dateTimeZone9);
        int int11 = localDateTime8.compareTo((org.joda.time.ReadablePartial) localDateTime10);
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime();
        boolean boolean13 = localDateTime8.isEqual((org.joda.time.ReadablePartial) localDateTime12);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime(dateTimeZone14);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.minusWeeks(0);
        int int18 = localDateTime12.compareTo((org.joda.time.ReadablePartial) localDateTime15);
        int int19 = localDateTime15.getEra();
        org.joda.time.LocalDateTime.Property property20 = localDateTime15.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str25 = dateTimeZone23.getShortName((long) 10);
        java.lang.String str26 = dateTimeZone23.getID();
        long long29 = dateTimeZone23.convertLocalToUTC((long) (short) 1, false);
        java.util.Locale.Builder builder31 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder33 = builder31.addUnicodeLocaleAttribute("eras");
        java.util.Locale locale34 = builder33.build();
        java.lang.String str35 = dateTimeZone23.getName((long) 749, locale34);
        org.joda.time.DateTime dateTime36 = localDateTime15.toDateTime(dateTimeZone23);
        int int37 = dateTimeZone2.getOffset((org.joda.time.ReadableInstant) dateTime36);
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.LocalDateTime localDateTime39 = new org.joda.time.LocalDateTime(dateTimeZone38);
        org.joda.time.LocalDateTime localDateTime41 = localDateTime39.minusWeeks(0);
        int int42 = localDateTime41.getYearOfCentury();
        org.joda.time.LocalDateTime localDateTime44 = localDateTime41.withMillisOfSecond((int) (short) 0);
        int int45 = localDateTime41.getMillisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.LocalDateTime localDateTime47 = new org.joda.time.LocalDateTime(dateTimeZone46);
        org.joda.time.LocalDateTime localDateTime49 = localDateTime47.minusWeeks(0);
        int int50 = localDateTime49.getYearOfCentury();
        org.joda.time.LocalDateTime localDateTime52 = localDateTime49.withMillisOfSecond((int) (short) 0);
        org.joda.time.LocalDateTime.Property property53 = localDateTime52.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone55 = org.joda.time.DateTimeZone.forOffsetHours(4);
        org.joda.time.LocalDateTime localDateTime56 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime52, dateTimeZone55);
        org.joda.time.DateTime dateTime57 = localDateTime41.toDateTime(dateTimeZone55);
        org.joda.time.LocalDateTime localDateTime58 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property59 = localDateTime58.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime61 = property59.addToCopy((long) (short) 0);
        org.joda.time.DateTime dateTime62 = localDateTime61.toDateTime();
        org.joda.time.Instant instant63 = dateTime62.toInstant();
        org.joda.time.DateTimeZone dateTimeZone64 = null;
        org.joda.time.LocalDateTime localDateTime65 = new org.joda.time.LocalDateTime(dateTimeZone64);
        org.joda.time.LocalDateTime localDateTime67 = localDateTime65.minusWeeks(0);
        org.joda.time.Chronology chronology68 = localDateTime67.getChronology();
        org.joda.time.DurationField durationField69 = chronology68.days();
        org.joda.time.DurationField durationField70 = chronology68.minutes();
        org.joda.time.DateTimeZone dateTimeZone73 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str75 = dateTimeZone73.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology76 = org.joda.time.chrono.ZonedChronology.getInstance(chronology68, dateTimeZone73);
        org.joda.time.DateTimeField dateTimeField77 = zonedChronology76.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone79 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean81 = dateTimeZone79.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology82 = zonedChronology76.withZone(dateTimeZone79);
        org.joda.time.DateTimeField dateTimeField83 = zonedChronology76.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField84 = zonedChronology76.year();
        java.lang.String str85 = zonedChronology76.toString();
        org.joda.time.DateTimeField dateTimeField86 = zonedChronology76.weekyear();
        boolean boolean87 = dateTime62.equals((java.lang.Object) zonedChronology76);
        boolean boolean88 = dateTime57.isEqual((org.joda.time.ReadableInstant) dateTime62);
        boolean boolean89 = dateTime36.isAfter((org.joda.time.ReadableInstant) dateTime57);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime62 and instant63", (dateTime62.compareTo(instant63) == 0) == dateTime62.equals(instant63));
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test581");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DurationField durationField13 = zonedChronology12.weeks();
        org.joda.time.DateTimeField dateTimeField14 = zonedChronology12.year();
        org.joda.time.DateTimeZone dateTimeZone15 = zonedChronology12.getZone();
        org.joda.time.DateTimeField dateTimeField16 = zonedChronology12.millisOfSecond();
        org.joda.time.DurationField durationField17 = zonedChronology12.hours();
        org.joda.time.DurationField durationField18 = zonedChronology12.centuries();
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology12.year();
        org.joda.time.DateTimeField dateTimeField21 = zonedChronology12.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime(dateTimeZone22);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime(dateTimeZone24);
        int int26 = localDateTime23.compareTo((org.joda.time.ReadablePartial) localDateTime25);
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime();
        boolean boolean28 = localDateTime23.isEqual((org.joda.time.ReadablePartial) localDateTime27);
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime(dateTimeZone29);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime30.minusWeeks(0);
        int int33 = localDateTime27.compareTo((org.joda.time.ReadablePartial) localDateTime30);
        java.util.Date date34 = localDateTime30.toDate();
        org.joda.time.LocalDateTime localDateTime35 = org.joda.time.LocalDateTime.fromDateFields(date34);
        org.joda.time.LocalDateTime localDateTime36 = org.joda.time.LocalDateTime.fromDateFields(date34);
        org.joda.time.LocalDateTime localDateTime37 = org.joda.time.LocalDateTime.fromDateFields(date34);
        int int38 = localDateTime37.size();
        int[] intArray40 = zonedChronology12.get((org.joda.time.ReadablePartial) localDateTime37, 0L);
        org.joda.time.DateTimeField dateTimeField41 = zonedChronology12.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField42 = zonedChronology12.clockhourOfDay();
        org.joda.time.DurationField durationField43 = zonedChronology12.days();
        org.joda.time.DurationField durationField44 = zonedChronology12.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField43", (durationField5.compareTo(durationField43) == 0) == durationField5.equals(durationField43));
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test582");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology18 = zonedChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.dayOfMonth();
        org.joda.time.DurationField durationField20 = zonedChronology12.years();
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime((org.joda.time.Chronology) zonedChronology12);
        org.joda.time.DateTimeZone dateTimeZone22 = zonedChronology12.getZone();
        org.joda.time.DurationField durationField23 = zonedChronology12.seconds();
        long long25 = durationField23.getValueAsLong(0L);
        org.joda.time.DurationFieldType durationFieldType26 = durationField23.getType();
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime(dateTimeZone27);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime28.minusWeeks(0);
        org.joda.time.Chronology chronology31 = localDateTime30.getChronology();
        org.joda.time.DurationField durationField32 = chronology31.days();
        org.joda.time.DurationField durationField33 = chronology31.minutes();
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str38 = dateTimeZone36.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology39 = org.joda.time.chrono.ZonedChronology.getInstance(chronology31, dateTimeZone36);
        org.joda.time.DateTimeField dateTimeField40 = zonedChronology39.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean44 = dateTimeZone42.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology45 = zonedChronology39.withZone(dateTimeZone42);
        org.joda.time.DateTimeField dateTimeField46 = zonedChronology39.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField47 = zonedChronology39.year();
        java.lang.String str48 = zonedChronology39.toString();
        org.joda.time.DateTimeField dateTimeField49 = zonedChronology39.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField50 = zonedChronology39.minuteOfHour();
        boolean boolean51 = durationFieldType26.isSupported((org.joda.time.Chronology) zonedChronology39);
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.LocalDateTime localDateTime53 = new org.joda.time.LocalDateTime(dateTimeZone52);
        org.joda.time.LocalDateTime localDateTime55 = localDateTime53.minusWeeks(0);
        org.joda.time.Chronology chronology56 = localDateTime55.getChronology();
        org.joda.time.DurationField durationField57 = chronology56.days();
        org.joda.time.DurationField durationField58 = chronology56.minutes();
        org.joda.time.DateTimeZone dateTimeZone61 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str63 = dateTimeZone61.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology64 = org.joda.time.chrono.ZonedChronology.getInstance(chronology56, dateTimeZone61);
        boolean boolean66 = zonedChronology64.equals((java.lang.Object) "292278993-02-22T07:07:50.878");
        org.joda.time.DateTimeField dateTimeField67 = zonedChronology64.weekyear();
        org.joda.time.DurationField durationField68 = zonedChronology64.years();
        boolean boolean69 = durationFieldType26.isSupported((org.joda.time.Chronology) zonedChronology64);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField20 and durationField68", (durationField20.compareTo(durationField68) == 0) == durationField20.equals(durationField68));
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test583");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DurationField durationField13 = zonedChronology12.weeks();
        org.joda.time.DateTimeField dateTimeField14 = zonedChronology12.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField15 = zonedChronology12.dayOfWeek();
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        long long19 = zonedChronology12.add(readablePeriod16, 0L, 2);
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology12.weekyearOfCentury();
        org.joda.time.DurationField durationField21 = zonedChronology12.hours();
        org.joda.time.DurationField durationField22 = zonedChronology12.centuries();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology12.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField24 = zonedChronology12.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField25 = zonedChronology12.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField26 = zonedChronology12.minuteOfDay();
        java.lang.Object obj27 = null;
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime(dateTimeZone29);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime30.minusWeeks(0);
        org.joda.time.Chronology chronology33 = localDateTime32.getChronology();
        org.joda.time.DurationField durationField34 = chronology33.days();
        org.joda.time.DurationField durationField35 = chronology33.minutes();
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str40 = dateTimeZone38.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology41 = org.joda.time.chrono.ZonedChronology.getInstance(chronology33, dateTimeZone38);
        org.joda.time.DateTimeField dateTimeField42 = zonedChronology41.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean46 = dateTimeZone44.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology47 = zonedChronology41.withZone(dateTimeZone44);
        org.joda.time.DateTimeField dateTimeField48 = zonedChronology41.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField49 = zonedChronology41.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField50 = zonedChronology41.weekyear();
        org.joda.time.DateTimeField dateTimeField51 = zonedChronology41.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField52 = zonedChronology41.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone53 = zonedChronology41.getZone();
        org.joda.time.DateTimeZone dateTimeZone55 = null;
        org.joda.time.LocalDateTime localDateTime56 = new org.joda.time.LocalDateTime(dateTimeZone55);
        org.joda.time.LocalDateTime localDateTime58 = localDateTime56.minusWeeks(0);
        org.joda.time.Chronology chronology59 = localDateTime58.getChronology();
        org.joda.time.DurationField durationField60 = chronology59.days();
        org.joda.time.DurationField durationField61 = chronology59.minutes();
        org.joda.time.DateTimeZone dateTimeZone64 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str66 = dateTimeZone64.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology67 = org.joda.time.chrono.ZonedChronology.getInstance(chronology59, dateTimeZone64);
        org.joda.time.DurationField durationField68 = zonedChronology67.weeks();
        org.joda.time.DateTimeField dateTimeField69 = zonedChronology67.year();
        org.joda.time.DateTimeZone dateTimeZone70 = zonedChronology67.getZone();
        org.joda.time.DateTimeField dateTimeField71 = zonedChronology67.millisOfSecond();
        org.joda.time.DurationField durationField72 = zonedChronology67.hours();
        org.joda.time.DurationField durationField73 = zonedChronology67.centuries();
        org.joda.time.DateTimeField dateTimeField74 = zonedChronology67.weekyearOfCentury();
        java.util.Locale locale77 = new java.util.Locale("");
        java.lang.String str78 = dateTimeField74.getAsShortText((int) (byte) -1, locale77);
        java.util.Locale locale79 = java.util.Locale.PRC;
        java.util.Locale.Builder builder80 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder82 = builder80.addUnicodeLocaleAttribute("eras");
        java.util.Locale locale83 = builder82.build();
        java.util.Locale.Builder builder84 = builder82.clear();
        java.util.Locale locale85 = builder82.build();
        java.lang.String str86 = locale79.getDisplayName(locale85);
        java.lang.String str87 = locale77.getDisplayName(locale85);
        java.lang.String str88 = dateTimeZone53.getName(393506525408903L, locale85);
        org.joda.time.LocalDateTime localDateTime89 = new org.joda.time.LocalDateTime((long) 791, dateTimeZone53);
        org.joda.time.LocalDateTime localDateTime90 = new org.joda.time.LocalDateTime(obj27, dateTimeZone53);
        org.joda.time.LocalDateTime localDateTime92 = localDateTime90.plusMinutes(868);
        org.joda.time.DateTimeZone dateTimeZone93 = null;
        org.joda.time.LocalDateTime localDateTime94 = new org.joda.time.LocalDateTime(dateTimeZone93);
        org.joda.time.LocalDateTime.Property property95 = localDateTime94.yearOfEra();
        org.joda.time.LocalDateTime localDateTime97 = localDateTime94.plusSeconds(10);
        int[] intArray98 = localDateTime97.getValues();
        zonedChronology12.validate((org.joda.time.ReadablePartial) localDateTime90, intArray98);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField13 and durationField68", (durationField13.compareTo(durationField68) == 0) == durationField13.equals(durationField68));
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test584");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology18 = zonedChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology12.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        org.joda.time.Chronology chronology24 = zonedChronology12.withZone(dateTimeZone23);
        org.joda.time.DurationField durationField25 = zonedChronology12.years();
        org.joda.time.DateTimeField dateTimeField26 = zonedChronology12.weekyearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime(dateTimeZone27);
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime(dateTimeZone29);
        int int31 = localDateTime28.compareTo((org.joda.time.ReadablePartial) localDateTime30);
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime();
        boolean boolean33 = localDateTime28.isEqual((org.joda.time.ReadablePartial) localDateTime32);
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime(dateTimeZone34);
        org.joda.time.LocalDateTime localDateTime37 = localDateTime35.minusWeeks(0);
        int int38 = localDateTime32.compareTo((org.joda.time.ReadablePartial) localDateTime35);
        org.joda.time.LocalDateTime.Property property39 = localDateTime35.millisOfDay();
        long long41 = zonedChronology12.set((org.joda.time.ReadablePartial) localDateTime35, 1876077150L);
        org.joda.time.DateTimeField dateTimeField42 = zonedChronology12.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField43 = zonedChronology12.yearOfEra();
        org.joda.time.DateTimeField dateTimeField44 = zonedChronology12.year();
        org.joda.time.DurationField durationField45 = zonedChronology12.minutes();
        org.joda.time.DateTimeField dateTimeField46 = zonedChronology12.dayOfWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField45", (durationField6.compareTo(durationField45) == 0) == durationField6.equals(durationField45));
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test585");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime(dateTimeZone2);
        int int4 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime3);
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime();
        boolean boolean6 = localDateTime1.isEqual((org.joda.time.ReadablePartial) localDateTime5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(dateTimeZone7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.minusWeeks(0);
        int int11 = localDateTime5.compareTo((org.joda.time.ReadablePartial) localDateTime8);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime5.minusSeconds((int) '4');
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(dateTimeZone15);
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.yearOfEra();
        int int18 = property17.getMinimumValue();
        java.lang.String str19 = property17.getAsText();
        java.util.Locale locale20 = java.util.Locale.FRANCE;
        java.lang.String str21 = property17.getAsText(locale20);
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology23 = null;
        boolean boolean24 = dateTimeFieldType22.isSupported(chronology23);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime(dateTimeZone25);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime26.minusWeeks(0);
        org.joda.time.Chronology chronology29 = localDateTime28.getChronology();
        org.joda.time.DateTimeField dateTimeField30 = dateTimeFieldType22.getField(chronology29);
        java.lang.String str31 = dateTimeField30.getName();
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime(dateTimeZone32);
        org.joda.time.LocalDateTime localDateTime35 = localDateTime33.minusWeeks(0);
        org.joda.time.Chronology chronology36 = localDateTime35.getChronology();
        java.util.Locale locale38 = java.util.Locale.JAPANESE;
        java.lang.String str39 = locale38.getDisplayLanguage();
        java.lang.String str40 = locale38.getISO3Country();
        java.lang.String str41 = dateTimeField30.getAsShortText((org.joda.time.ReadablePartial) localDateTime35, 2, locale38);
        org.joda.time.LocalDateTime.Property property42 = localDateTime35.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.LocalDateTime localDateTime44 = new org.joda.time.LocalDateTime(dateTimeZone43);
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.LocalDateTime localDateTime46 = new org.joda.time.LocalDateTime(dateTimeZone45);
        int int47 = localDateTime44.compareTo((org.joda.time.ReadablePartial) localDateTime46);
        org.joda.time.ReadableInstant readableInstant48 = null;
        org.joda.time.DateTime dateTime49 = localDateTime44.toDateTime(readableInstant48);
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.LocalDateTime localDateTime51 = new org.joda.time.LocalDateTime(dateTimeZone50);
        org.joda.time.LocalDateTime.Property property52 = localDateTime51.yearOfEra();
        int int53 = property52.getMinimumValue();
        boolean boolean54 = dateTime49.equals((java.lang.Object) int53);
        long long55 = property42.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime49);
        int int56 = property17.getDifference((org.joda.time.ReadableInstant) dateTime49);
        org.joda.time.Chronology chronology57 = dateTime49.getChronology();
        org.joda.time.LocalDateTime localDateTime58 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property59 = localDateTime58.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime61 = property59.addToCopy((long) (short) 0);
        org.joda.time.DateTime dateTime62 = localDateTime61.toDateTime();
        org.joda.time.Instant instant63 = dateTime62.toInstant();
        boolean boolean64 = dateTime49.isEqual((org.joda.time.ReadableInstant) dateTime62);
        org.joda.time.DateTime dateTime65 = localDateTime13.toDateTime((org.joda.time.ReadableInstant) dateTime62);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime49 and instant63", (dateTime49.compareTo(instant63) == 0) == dateTime49.equals(instant63));
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test586");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology18 = zonedChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology12.year();
        java.lang.String str21 = zonedChronology12.toString();
        org.joda.time.DateTimeField dateTimeField22 = zonedChronology12.weekyear();
        org.joda.time.DurationField durationField23 = zonedChronology12.weeks();
        org.joda.time.DurationField durationField24 = zonedChronology12.weekyears();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str29 = dateTimeZone27.getShortName((long) 10);
        java.util.Locale locale31 = java.util.Locale.GERMAN;
        java.util.Locale locale32 = java.util.Locale.GERMAN;
        java.lang.String str33 = locale31.getDisplayCountry(locale32);
        java.util.Locale locale34 = java.util.Locale.JAPANESE;
        java.lang.String str35 = locale34.getDisplayLanguage();
        java.util.Set<java.lang.String> strSet36 = locale34.getUnicodeLocaleKeys();
        java.lang.String str37 = locale31.getDisplayCountry(locale34);
        java.lang.String str38 = dateTimeZone27.getShortName(1L, locale34);
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (short) 0);
        boolean boolean43 = dateTimeZone41.isStandardOffset((long) 61673414);
        long long45 = dateTimeZone27.getMillisKeepLocal(dateTimeZone41, (long) 53);
        long long47 = dateTimeZone27.previousTransition((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str52 = dateTimeZone50.getShortName((long) 10);
        java.lang.String str53 = dateTimeZone50.getID();
        long long56 = dateTimeZone50.convertLocalToUTC((long) (short) 1, false);
        java.util.Locale.Builder builder58 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder60 = builder58.addUnicodeLocaleAttribute("eras");
        java.util.Locale locale61 = builder60.build();
        java.lang.String str62 = dateTimeZone50.getName((long) 749, locale61);
        java.util.TimeZone timeZone63 = dateTimeZone50.toTimeZone();
        long long66 = dateTimeZone50.adjustOffset((long) 61677168, false);
        long long68 = dateTimeZone27.getMillisKeepLocal(dateTimeZone50, 0L);
        org.joda.time.Chronology chronology69 = zonedChronology12.withZone(dateTimeZone27);
        org.joda.time.DurationField durationField70 = chronology69.days();
        org.joda.time.DurationField durationField71 = chronology69.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField70", (durationField5.compareTo(durationField70) == 0) == durationField5.equals(durationField70));
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test587");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minusWeeks(0);
        org.joda.time.Chronology chronology5 = localDateTime4.getChronology();
        org.joda.time.DurationField durationField6 = chronology5.days();
        org.joda.time.DurationField durationField7 = chronology5.minutes();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str12 = dateTimeZone10.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology13 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone10);
        org.joda.time.DateTimeField dateTimeField14 = zonedChronology13.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean18 = dateTimeZone16.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology19 = zonedChronology13.withZone(dateTimeZone16);
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology13.dayOfMonth();
        org.joda.time.DurationField durationField21 = zonedChronology13.seconds();
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime(4518471600L, (org.joda.time.Chronology) zonedChronology13);
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology13.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime(dateTimeZone25);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime26.minusWeeks(0);
        org.joda.time.Chronology chronology29 = localDateTime28.getChronology();
        org.joda.time.DurationField durationField30 = chronology29.days();
        org.joda.time.DurationField durationField31 = chronology29.minutes();
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str36 = dateTimeZone34.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology37 = org.joda.time.chrono.ZonedChronology.getInstance(chronology29, dateTimeZone34);
        org.joda.time.DateTimeField dateTimeField38 = zonedChronology37.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean42 = dateTimeZone40.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology43 = zonedChronology37.withZone(dateTimeZone40);
        org.joda.time.DateTimeField dateTimeField44 = zonedChronology37.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField45 = zonedChronology37.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField46 = zonedChronology37.weekyear();
        org.joda.time.DurationField durationField47 = zonedChronology37.years();
        org.joda.time.DurationField durationField48 = zonedChronology37.weeks();
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.LocalDateTime localDateTime50 = new org.joda.time.LocalDateTime(dateTimeZone49);
        org.joda.time.LocalDateTime localDateTime52 = localDateTime50.minusWeeks(0);
        org.joda.time.Chronology chronology53 = localDateTime52.getChronology();
        org.joda.time.DurationField durationField54 = chronology53.days();
        org.joda.time.DurationField durationField55 = chronology53.minutes();
        org.joda.time.DateTimeZone dateTimeZone58 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str60 = dateTimeZone58.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology61 = org.joda.time.chrono.ZonedChronology.getInstance(chronology53, dateTimeZone58);
        org.joda.time.DateTimeField dateTimeField62 = zonedChronology61.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone64 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean66 = dateTimeZone64.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology67 = zonedChronology61.withZone(dateTimeZone64);
        org.joda.time.DateTimeField dateTimeField68 = zonedChronology61.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField69 = zonedChronology61.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField70 = zonedChronology61.weekyear();
        org.joda.time.DateTimeZone dateTimeZone71 = zonedChronology61.getZone();
        org.joda.time.Chronology chronology72 = zonedChronology37.withZone(dateTimeZone71);
        long long76 = zonedChronology37.add(1645513695572L, (long) 0, 893);
        org.joda.time.DateTimeField dateTimeField77 = zonedChronology37.clockhourOfDay();
        org.joda.time.DurationField durationField78 = zonedChronology37.seconds();
        org.joda.time.LocalDateTime localDateTime79 = new org.joda.time.LocalDateTime(0L, (org.joda.time.Chronology) zonedChronology37);
        long long81 = zonedChronology13.set((org.joda.time.ReadablePartial) localDateTime79, 162999351716796000L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField21 and durationField78", (durationField21.compareTo(durationField78) == 0) == durationField21.equals(durationField78));
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test588");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DurationField durationField13 = zonedChronology12.weeks();
        org.joda.time.DateTimeField dateTimeField14 = zonedChronology12.year();
        org.joda.time.DateTimeZone dateTimeZone15 = zonedChronology12.getZone();
        org.joda.time.DateTimeField dateTimeField16 = zonedChronology12.year();
        org.joda.time.DateTimeField dateTimeField17 = zonedChronology12.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField18 = zonedChronology12.minuteOfHour();
        org.joda.time.DurationField durationField19 = zonedChronology12.seconds();
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        long long23 = zonedChronology12.add(readablePeriod20, 1876077118L, (-7));
        org.joda.time.DateTimeField dateTimeField24 = zonedChronology12.clockhourOfHalfday();
        org.joda.time.DurationField durationField25 = zonedChronology12.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField25, durationField5, and durationField6", !(durationField25.compareTo(durationField5) == 0) || (Math.signum(durationField25.compareTo(durationField6)) == Math.signum(durationField5.compareTo(durationField6))));
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test589");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DurationField durationField13 = zonedChronology12.weeks();
        org.joda.time.DateTimeField dateTimeField14 = zonedChronology12.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField15 = zonedChronology12.dayOfWeek();
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        long long19 = zonedChronology12.add(readablePeriod16, 0L, 2);
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology12.weekyearOfCentury();
        java.lang.String str21 = zonedChronology12.toString();
        org.joda.time.DateTimeField dateTimeField22 = zonedChronology12.monthOfYear();
        org.joda.time.DurationField durationField23 = zonedChronology12.months();
        org.joda.time.DurationField durationField24 = zonedChronology12.minutes();
        org.joda.time.DateTimeField dateTimeField25 = zonedChronology12.weekyearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField24", (durationField6.compareTo(durationField24) == 0) == durationField6.equals(durationField24));
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test590");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology18 = zonedChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.dayOfMonth();
        org.joda.time.DurationField durationField20 = zonedChronology12.years();
        org.joda.time.DateTimeField dateTimeField21 = zonedChronology12.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField22 = zonedChronology12.dayOfWeek();
        org.joda.time.DurationField durationField23 = zonedChronology12.weekyears();
        org.joda.time.DateTimeField dateTimeField24 = zonedChronology12.secondOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField20 and durationField23", (durationField20.compareTo(durationField23) == 0) == durationField20.equals(durationField23));
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test591");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DurationField durationField13 = zonedChronology12.weeks();
        org.joda.time.DateTimeField dateTimeField14 = zonedChronology12.year();
        org.joda.time.DurationField durationField15 = zonedChronology12.months();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str20 = dateTimeZone18.getShortName((long) 10);
        java.lang.String str21 = dateTimeZone18.getID();
        long long24 = dateTimeZone18.convertLocalToUTC((long) (short) 1, false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone18);
        int int27 = dateTimeZone18.getStandardOffset(1L);
        org.joda.time.chrono.ZonedChronology zonedChronology28 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) zonedChronology12, dateTimeZone18);
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology12.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField30 = zonedChronology12.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField31 = zonedChronology12.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime(dateTimeZone32);
        org.joda.time.LocalDateTime localDateTime35 = localDateTime33.minusWeeks(0);
        int int36 = localDateTime35.getYearOfCentury();
        org.joda.time.LocalDateTime localDateTime38 = localDateTime35.withMillisOfSecond((int) (short) 0);
        int int39 = localDateTime35.getMillisOfSecond();
        java.util.Locale locale41 = null;
        java.lang.String str42 = dateTimeField31.getAsShortText((org.joda.time.ReadablePartial) localDateTime35, 811, locale41);
        org.joda.time.ReadableDuration readableDuration43 = null;
        org.joda.time.LocalDateTime localDateTime44 = localDateTime35.plus(readableDuration43);
        int int45 = localDateTime35.getYearOfCentury();
        org.joda.time.LocalDateTime localDateTime47 = localDateTime35.plusWeeks(725);
        org.joda.time.DateTimeFieldType dateTimeFieldType48 = org.joda.time.DateTimeFieldType.millisOfSecond();
        java.lang.String str49 = dateTimeFieldType48.getName();
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.LocalDateTime localDateTime51 = new org.joda.time.LocalDateTime(dateTimeZone50);
        org.joda.time.LocalDateTime localDateTime53 = localDateTime51.minusWeeks(0);
        org.joda.time.Chronology chronology54 = localDateTime53.getChronology();
        org.joda.time.DurationField durationField55 = chronology54.days();
        org.joda.time.DurationField durationField56 = chronology54.minutes();
        org.joda.time.DateTimeZone dateTimeZone59 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str61 = dateTimeZone59.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology62 = org.joda.time.chrono.ZonedChronology.getInstance(chronology54, dateTimeZone59);
        org.joda.time.DurationField durationField63 = zonedChronology62.weeks();
        org.joda.time.DateTimeField dateTimeField64 = zonedChronology62.year();
        org.joda.time.DurationField durationField65 = zonedChronology62.months();
        org.joda.time.DateTimeZone dateTimeZone68 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str70 = dateTimeZone68.getShortName((long) 10);
        java.lang.String str71 = dateTimeZone68.getID();
        long long74 = dateTimeZone68.convertLocalToUTC((long) (short) 1, false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone68);
        int int77 = dateTimeZone68.getStandardOffset(1L);
        org.joda.time.chrono.ZonedChronology zonedChronology78 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) zonedChronology62, dateTimeZone68);
        org.joda.time.DateTimeField dateTimeField79 = zonedChronology62.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField80 = zonedChronology62.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField81 = zonedChronology62.weekyear();
        boolean boolean82 = dateTimeFieldType48.isSupported((org.joda.time.Chronology) zonedChronology62);
        java.lang.String str83 = dateTimeFieldType48.getName();
        int int84 = localDateTime35.get(dateTimeFieldType48);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField13 and durationField63", (durationField13.compareTo(durationField63) == 0) == durationField13.equals(durationField63));
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test592");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology18 = zonedChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.dayOfMonth();
        org.joda.time.DurationField durationField20 = zonedChronology12.years();
        org.joda.time.DateTimeField dateTimeField21 = zonedChronology12.millisOfSecond();
        org.joda.time.DurationField durationField22 = zonedChronology12.days();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology12.hourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField22", (durationField5.compareTo(durationField22) == 0) == durationField5.equals(durationField22));
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test593");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology18 = zonedChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology12.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        org.joda.time.Chronology chronology24 = zonedChronology12.withZone(dateTimeZone23);
        org.joda.time.DurationField durationField25 = zonedChronology12.years();
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime(dateTimeZone26);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime(dateTimeZone28);
        int int30 = localDateTime27.compareTo((org.joda.time.ReadablePartial) localDateTime29);
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime();
        boolean boolean32 = localDateTime27.isEqual((org.joda.time.ReadablePartial) localDateTime31);
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime(dateTimeZone33);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime34.minusWeeks(0);
        int int37 = localDateTime31.compareTo((org.joda.time.ReadablePartial) localDateTime34);
        org.joda.time.LocalDateTime.Property property38 = localDateTime34.dayOfWeek();
        org.joda.time.LocalDateTime.Property property39 = localDateTime34.yearOfEra();
        org.joda.time.LocalDateTime localDateTime41 = new org.joda.time.LocalDateTime((long) (byte) -1);
        org.joda.time.LocalDateTime localDateTime43 = localDateTime41.plusMinutes(0);
        org.joda.time.LocalDateTime.Property property44 = localDateTime41.hourOfDay();
        org.joda.time.LocalDateTime localDateTime45 = localDateTime34.withFields((org.joda.time.ReadablePartial) localDateTime41);
        org.joda.time.LocalDateTime localDateTime47 = localDateTime41.minusYears((int) '#');
        org.joda.time.LocalDateTime localDateTime49 = localDateTime41.withMillisOfSecond((int) (short) 0);
        org.joda.time.LocalDateTime.Property property50 = localDateTime41.dayOfWeek();
        int int51 = localDateTime41.getDayOfYear();
        boolean boolean52 = zonedChronology12.equals((java.lang.Object) localDateTime41);
        org.joda.time.DurationField durationField53 = zonedChronology12.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField53, durationField5, and durationField6", !(durationField53.compareTo(durationField5) == 0) || (Math.signum(durationField53.compareTo(durationField6)) == Math.signum(durationField5.compareTo(durationField6))));
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test594");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology18 = zonedChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology12.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField21 = zonedChronology12.weekyear();
        org.joda.time.DurationField durationField22 = zonedChronology12.years();
        org.joda.time.DurationField durationField23 = zonedChronology12.weeks();
        org.joda.time.DateTimeField dateTimeField24 = zonedChronology12.millisOfSecond();
        java.lang.String str25 = zonedChronology12.toString();
        org.joda.time.DateTimeField dateTimeField26 = zonedChronology12.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime(dateTimeZone27);
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime(dateTimeZone29);
        int int31 = localDateTime28.compareTo((org.joda.time.ReadablePartial) localDateTime30);
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.DateTime dateTime33 = localDateTime28.toDateTime(readableInstant32);
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime(dateTimeZone34);
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime(dateTimeZone36);
        int int38 = localDateTime35.compareTo((org.joda.time.ReadablePartial) localDateTime37);
        org.joda.time.LocalDateTime localDateTime39 = new org.joda.time.LocalDateTime();
        boolean boolean40 = localDateTime35.isEqual((org.joda.time.ReadablePartial) localDateTime39);
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime(dateTimeZone41);
        org.joda.time.LocalDateTime localDateTime44 = localDateTime42.minusWeeks(0);
        int int45 = localDateTime39.compareTo((org.joda.time.ReadablePartial) localDateTime42);
        org.joda.time.LocalDateTime localDateTime46 = localDateTime28.withFields((org.joda.time.ReadablePartial) localDateTime39);
        org.joda.time.LocalDateTime.Property property47 = localDateTime39.year();
        org.joda.time.DateTimeZone dateTimeZone48 = null;
        org.joda.time.LocalDateTime localDateTime49 = new org.joda.time.LocalDateTime(dateTimeZone48);
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.LocalDateTime localDateTime51 = new org.joda.time.LocalDateTime(dateTimeZone50);
        int int52 = localDateTime49.compareTo((org.joda.time.ReadablePartial) localDateTime51);
        org.joda.time.ReadableInstant readableInstant53 = null;
        org.joda.time.DateTime dateTime54 = localDateTime49.toDateTime(readableInstant53);
        org.joda.time.DateTimeZone dateTimeZone55 = null;
        org.joda.time.LocalDateTime localDateTime56 = new org.joda.time.LocalDateTime(dateTimeZone55);
        org.joda.time.LocalDateTime.Property property57 = localDateTime56.yearOfEra();
        int int58 = property57.getMinimumValue();
        boolean boolean59 = dateTime54.equals((java.lang.Object) int58);
        org.joda.time.DateTimeFieldType dateTimeFieldType60 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        int int61 = dateTime54.get(dateTimeFieldType60);
        int int62 = property47.compareTo((org.joda.time.ReadableInstant) dateTime54);
        java.lang.String str63 = property47.getAsText();
        org.joda.time.DurationField durationField64 = property47.getDurationField();
        org.joda.time.DateTimeZone dateTimeZone65 = null;
        org.joda.time.LocalDateTime localDateTime66 = new org.joda.time.LocalDateTime(dateTimeZone65);
        org.joda.time.LocalDateTime localDateTime68 = localDateTime66.minusWeeks(0);
        org.joda.time.Chronology chronology69 = localDateTime68.getChronology();
        org.joda.time.DurationField durationField70 = chronology69.days();
        org.joda.time.DurationField durationField71 = chronology69.minutes();
        org.joda.time.DateTimeZone dateTimeZone74 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str76 = dateTimeZone74.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology77 = org.joda.time.chrono.ZonedChronology.getInstance(chronology69, dateTimeZone74);
        boolean boolean79 = zonedChronology77.equals((java.lang.Object) "292278993-02-22T07:07:50.878");
        org.joda.time.LocalDateTime localDateTime80 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) zonedChronology77);
        org.joda.time.LocalDateTime localDateTime82 = localDateTime80.minusWeeks((int) (short) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType83 = org.joda.time.DateTimeFieldType.secondOfMinute();
        org.joda.time.DurationFieldType durationFieldType84 = dateTimeFieldType83.getDurationType();
        boolean boolean85 = localDateTime80.isSupported(dateTimeFieldType83);
        int int86 = property47.compareTo((org.joda.time.ReadablePartial) localDateTime80);
        org.joda.time.DurationField durationField87 = property47.getRangeDurationField();
        org.joda.time.LocalDateTime localDateTime88 = property47.roundHalfCeilingCopy();
        long long90 = zonedChronology12.set((org.joda.time.ReadablePartial) localDateTime88, 4554946300L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField22 and durationField64", (durationField22.compareTo(durationField64) == 0) == durationField22.equals(durationField64));
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test595");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DurationField durationField13 = zonedChronology12.weeks();
        org.joda.time.DateTimeField dateTimeField14 = zonedChronology12.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone15 = zonedChronology12.getZone();
        org.joda.time.DateTimeField dateTimeField16 = zonedChronology12.weekyear();
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime20 = property18.addToCopy((long) (short) 0);
        org.joda.time.DurationFieldType durationFieldType21 = org.joda.time.DurationFieldType.centuries();
        boolean boolean22 = property18.equals((java.lang.Object) durationFieldType21);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.DurationField durationField24 = durationFieldType21.getField(chronology23);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime(dateTimeZone25);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime26.minusWeeks(0);
        org.joda.time.Chronology chronology29 = localDateTime28.getChronology();
        org.joda.time.DurationField durationField30 = chronology29.days();
        org.joda.time.DurationField durationField31 = chronology29.minutes();
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str36 = dateTimeZone34.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology37 = org.joda.time.chrono.ZonedChronology.getInstance(chronology29, dateTimeZone34);
        org.joda.time.DurationField durationField38 = zonedChronology37.weeks();
        org.joda.time.DateTimeField dateTimeField39 = zonedChronology37.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField40 = zonedChronology37.dayOfWeek();
        org.joda.time.ReadablePeriod readablePeriod41 = null;
        long long44 = zonedChronology37.add(readablePeriod41, 0L, 2);
        org.joda.time.DateTimeField dateTimeField45 = zonedChronology37.weekyearOfCentury();
        java.lang.String str46 = zonedChronology37.toString();
        boolean boolean47 = durationFieldType21.isSupported((org.joda.time.Chronology) zonedChronology37);
        org.joda.time.DateTimeField dateTimeField48 = zonedChronology37.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField49 = zonedChronology37.dayOfWeek();
        org.joda.time.DateTimeFieldType dateTimeFieldType50 = dateTimeField49.getType();
        java.util.Locale.Builder builder52 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder54 = builder52.addUnicodeLocaleAttribute("eras");
        java.util.Locale locale55 = builder54.build();
        java.util.Locale.Builder builder56 = builder54.clear();
        java.util.Locale locale57 = builder54.build();
        java.util.Locale.setDefault(locale57);
        org.joda.time.tz.NameProvider nameProvider59 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone dateTimeZone60 = null;
        org.joda.time.LocalDateTime localDateTime61 = new org.joda.time.LocalDateTime(dateTimeZone60);
        org.joda.time.LocalDateTime localDateTime63 = localDateTime61.minusWeeks(0);
        org.joda.time.Chronology chronology64 = localDateTime63.getChronology();
        org.joda.time.DurationField durationField65 = chronology64.days();
        org.joda.time.DurationField durationField66 = chronology64.minutes();
        org.joda.time.DateTimeZone dateTimeZone69 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str71 = dateTimeZone69.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology72 = org.joda.time.chrono.ZonedChronology.getInstance(chronology64, dateTimeZone69);
        boolean boolean74 = zonedChronology72.equals((java.lang.Object) "292278993-02-22T07:07:50.878");
        org.joda.time.DateTimeField dateTimeField75 = zonedChronology72.hourOfDay();
        org.joda.time.DateTimeField dateTimeField76 = zonedChronology72.dayOfYear();
        java.util.Locale locale78 = java.util.Locale.PRC;
        java.lang.String str79 = dateTimeField76.getAsText(7, locale78);
        java.lang.String str82 = nameProvider59.getName(locale78, "f\351vr.", "1027");
        java.lang.String str83 = locale78.getCountry();
        java.lang.String str84 = locale78.getISO3Language();
        java.util.Set<java.lang.Character> charSet85 = locale78.getExtensionKeys();
        java.lang.String str86 = locale57.getDisplayCountry(locale78);
        java.lang.String str87 = dateTimeField49.getAsText(4518471000L, locale57);
        int int88 = dateTimeField16.getMaximumTextLength(locale57);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField13 and durationField38", (durationField13.compareTo(durationField38) == 0) == durationField13.equals(durationField38));
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test596");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        boolean boolean14 = zonedChronology12.equals((java.lang.Object) "292278993-02-22T07:07:50.878");
        org.joda.time.DateTimeField dateTimeField15 = zonedChronology12.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField16 = zonedChronology12.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField17 = zonedChronology12.secondOfDay();
        org.joda.time.DurationField durationField18 = zonedChronology12.millis();
        org.joda.time.DurationField durationField19 = zonedChronology12.minutes();
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology12.year();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField19", (durationField6.compareTo(durationField19) == 0) == durationField6.equals(durationField19));
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test597");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology18 = zonedChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.dayOfMonth();
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        long long23 = zonedChronology12.add(readablePeriod20, (long) 53, (int) (byte) 0);
        long long27 = zonedChronology12.add(1645427275536L, 0L, 8);
        org.joda.time.Chronology chronology28 = zonedChronology12.withUTC();
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology12.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField30 = zonedChronology12.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField31 = zonedChronology12.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField32 = zonedChronology12.clockhourOfHalfday();
        org.joda.time.DurationField durationField33 = zonedChronology12.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField33, durationField5, and durationField6", !(durationField33.compareTo(durationField5) == 0) || (Math.signum(durationField33.compareTo(durationField6)) == Math.signum(durationField5.compareTo(durationField6))));
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test598");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        int int3 = dateTimeZone1.getOffsetFromLocal(4518471413L);
        boolean boolean5 = dateTimeZone1.isStandardOffset((long) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (short) 0);
        boolean boolean10 = dateTimeZone8.isStandardOffset((long) 61673414);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology12 = null;
        boolean boolean13 = dateTimeFieldType11.isSupported(chronology12);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime(dateTimeZone14);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.minusWeeks(0);
        org.joda.time.Chronology chronology18 = localDateTime17.getChronology();
        org.joda.time.DateTimeField dateTimeField19 = dateTimeFieldType11.getField(chronology18);
        java.lang.String str20 = dateTimeField19.getName();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime(dateTimeZone21);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime22.minusWeeks(0);
        org.joda.time.Chronology chronology25 = localDateTime24.getChronology();
        java.util.Locale locale27 = java.util.Locale.JAPANESE;
        java.lang.String str28 = locale27.getDisplayLanguage();
        java.lang.String str29 = locale27.getISO3Country();
        java.lang.String str30 = dateTimeField19.getAsShortText((org.joda.time.ReadablePartial) localDateTime24, 2, locale27);
        int int32 = dateTimeField19.getMaximumValue(0L);
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology34 = null;
        boolean boolean35 = dateTimeFieldType33.isSupported(chronology34);
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime(dateTimeZone36);
        org.joda.time.LocalDateTime localDateTime39 = localDateTime37.minusWeeks(0);
        org.joda.time.Chronology chronology40 = localDateTime39.getChronology();
        org.joda.time.DateTimeField dateTimeField41 = dateTimeFieldType33.getField(chronology40);
        java.lang.String str42 = dateTimeField41.getName();
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.LocalDateTime localDateTime44 = new org.joda.time.LocalDateTime(dateTimeZone43);
        org.joda.time.LocalDateTime localDateTime46 = localDateTime44.minusWeeks(0);
        org.joda.time.Chronology chronology47 = localDateTime46.getChronology();
        java.util.Locale locale49 = java.util.Locale.JAPANESE;
        java.lang.String str50 = locale49.getDisplayLanguage();
        java.lang.String str51 = locale49.getISO3Country();
        java.lang.String str52 = dateTimeField41.getAsShortText((org.joda.time.ReadablePartial) localDateTime46, 2, locale49);
        org.joda.time.LocalDateTime localDateTime54 = localDateTime46.minusDays((int) (byte) 1);
        org.joda.time.ReadableDuration readableDuration55 = null;
        org.joda.time.LocalDateTime localDateTime56 = localDateTime54.plus(readableDuration55);
        int[] intArray61 = new int[] { 0, 292278993, 10, 'a' };
        int int62 = dateTimeField19.getMinimumValue((org.joda.time.ReadablePartial) localDateTime56, intArray61);
        org.joda.time.DateTimeZone dateTimeZone63 = null;
        org.joda.time.LocalDateTime localDateTime64 = new org.joda.time.LocalDateTime(dateTimeZone63);
        org.joda.time.DateTimeZone dateTimeZone65 = null;
        org.joda.time.LocalDateTime localDateTime66 = new org.joda.time.LocalDateTime(dateTimeZone65);
        int int67 = localDateTime64.compareTo((org.joda.time.ReadablePartial) localDateTime66);
        org.joda.time.ReadableInstant readableInstant68 = null;
        org.joda.time.DateTime dateTime69 = localDateTime64.toDateTime(readableInstant68);
        boolean boolean71 = dateTime69.equals((java.lang.Object) 'a');
        org.joda.time.DateTime dateTime72 = localDateTime56.toDateTime((org.joda.time.ReadableInstant) dateTime69);
        int int73 = dateTimeZone8.getOffset((org.joda.time.ReadableInstant) dateTime69);
        int int74 = dateTimeZone1.getOffset((org.joda.time.ReadableInstant) dateTime69);
        org.joda.time.Instant instant75 = dateTime69.toInstant();
        org.joda.time.DateTimeZone dateTimeZone76 = dateTime69.getZone();
        org.joda.time.Chronology chronology77 = dateTime69.getChronology();
        org.joda.time.DurationField durationField78 = chronology77.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime69 and instant75", (dateTime69.compareTo(instant75) == 0) == dateTime69.equals(instant75));
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test599");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DurationField durationField13 = zonedChronology12.weeks();
        org.joda.time.DateTimeField dateTimeField14 = zonedChronology12.year();
        org.joda.time.DurationField durationField15 = zonedChronology12.months();
        org.joda.time.DateTimeField dateTimeField16 = zonedChronology12.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime(dateTimeZone17);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.minusWeeks(0);
        org.joda.time.Chronology chronology21 = localDateTime20.getChronology();
        org.joda.time.DurationField durationField22 = chronology21.days();
        org.joda.time.DurationField durationField23 = chronology21.minutes();
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str28 = dateTimeZone26.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology29 = org.joda.time.chrono.ZonedChronology.getInstance(chronology21, dateTimeZone26);
        org.joda.time.DurationField durationField30 = zonedChronology29.weeks();
        org.joda.time.DateTimeField dateTimeField31 = zonedChronology29.year();
        org.joda.time.DateTimeZone dateTimeZone32 = zonedChronology29.getZone();
        java.util.Locale locale34 = java.util.Locale.ROOT;
        java.lang.String str35 = dateTimeZone32.getShortName((long) '4', locale34);
        org.joda.time.LocalDateTime localDateTime36 = new org.joda.time.LocalDateTime(dateTimeZone32);
        boolean boolean37 = dateTimeZone32.isFixed();
        org.joda.time.Chronology chronology38 = zonedChronology12.withZone(dateTimeZone32);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField13 and durationField30", (durationField13.compareTo(durationField30) == 0) == durationField13.equals(durationField30));
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test600");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime(dateTimeZone2);
        int int4 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime3);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.DateTime dateTime6 = localDateTime1.toDateTime(readableInstant5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime(dateTimeZone9);
        int int11 = localDateTime8.compareTo((org.joda.time.ReadablePartial) localDateTime10);
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime();
        boolean boolean13 = localDateTime8.isEqual((org.joda.time.ReadablePartial) localDateTime12);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime(dateTimeZone14);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.minusWeeks(0);
        int int18 = localDateTime12.compareTo((org.joda.time.ReadablePartial) localDateTime15);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime1.withFields((org.joda.time.ReadablePartial) localDateTime12);
        org.joda.time.LocalDateTime.Property property20 = localDateTime12.year();
        int int21 = localDateTime12.getCenturyOfEra();
        org.joda.time.LocalDateTime localDateTime23 = localDateTime12.withYearOfEra(75307);
        org.joda.time.DurationFieldType durationFieldType24 = org.joda.time.DurationFieldType.minutes();
        boolean boolean25 = localDateTime23.isSupported(durationFieldType24);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime(dateTimeZone26);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.minusWeeks(0);
        org.joda.time.Chronology chronology30 = localDateTime29.getChronology();
        org.joda.time.DurationField durationField31 = chronology30.days();
        org.joda.time.DurationField durationField32 = chronology30.minutes();
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str37 = dateTimeZone35.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology38 = org.joda.time.chrono.ZonedChronology.getInstance(chronology30, dateTimeZone35);
        org.joda.time.DurationField durationField39 = zonedChronology38.weeks();
        org.joda.time.DateTimeField dateTimeField40 = zonedChronology38.year();
        org.joda.time.DurationField durationField41 = zonedChronology38.months();
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str46 = dateTimeZone44.getShortName((long) 10);
        java.lang.String str47 = dateTimeZone44.getID();
        long long50 = dateTimeZone44.convertLocalToUTC((long) (short) 1, false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone44);
        int int53 = dateTimeZone44.getStandardOffset(1L);
        org.joda.time.chrono.ZonedChronology zonedChronology54 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) zonedChronology38, dateTimeZone44);
        org.joda.time.DateTimeField dateTimeField55 = zonedChronology38.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField56 = zonedChronology38.centuryOfEra();
        org.joda.time.ReadablePeriod readablePeriod57 = null;
        long long60 = zonedChronology38.add(readablePeriod57, (long) 'a', 61677168);
        java.lang.String str61 = zonedChronology38.toString();
        org.joda.time.DateTimeField dateTimeField62 = zonedChronology38.year();
        org.joda.time.DateTimeField dateTimeField63 = zonedChronology38.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField64 = zonedChronology38.secondOfDay();
        org.joda.time.DateTimeField dateTimeField65 = zonedChronology38.year();
        org.joda.time.DurationField durationField66 = durationFieldType24.getField((org.joda.time.Chronology) zonedChronology38);
        org.joda.time.DateTimeField dateTimeField67 = zonedChronology38.year();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField32 and durationField66", (durationField32.compareTo(durationField66) == 0) == durationField32.equals(durationField66));
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test601");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.millisOfSecond();
        org.joda.time.LocalDateTime.Property property2 = localDateTime0.weekOfWeekyear();
        org.joda.time.Chronology chronology3 = localDateTime0.getChronology();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology5 = null;
        boolean boolean6 = dateTimeFieldType4.isSupported(chronology5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(dateTimeZone7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.minusWeeks(0);
        org.joda.time.Chronology chronology11 = localDateTime10.getChronology();
        org.joda.time.DateTimeField dateTimeField12 = dateTimeFieldType4.getField(chronology11);
        org.joda.time.DurationFieldType durationFieldType13 = dateTimeFieldType4.getRangeDurationType();
        int int14 = localDateTime0.get(dateTimeFieldType4);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(dateTimeZone15);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.minusWeeks(0);
        org.joda.time.Chronology chronology19 = localDateTime18.getChronology();
        org.joda.time.DurationField durationField20 = chronology19.days();
        org.joda.time.DurationField durationField21 = chronology19.minutes();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str26 = dateTimeZone24.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology27 = org.joda.time.chrono.ZonedChronology.getInstance(chronology19, dateTimeZone24);
        org.joda.time.DateTimeField dateTimeField28 = zonedChronology27.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean32 = dateTimeZone30.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology33 = zonedChronology27.withZone(dateTimeZone30);
        org.joda.time.DateTimeField dateTimeField34 = zonedChronology27.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField35 = zonedChronology27.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField36 = zonedChronology27.weekyear();
        org.joda.time.DateTimeZone dateTimeZone37 = zonedChronology27.getZone();
        org.joda.time.DateTimeField dateTimeField38 = zonedChronology27.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField39 = zonedChronology27.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField40 = zonedChronology27.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField41 = zonedChronology27.year();
        org.joda.time.DateTimeField dateTimeField42 = zonedChronology27.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField43 = dateTimeFieldType4.getField((org.joda.time.Chronology) zonedChronology27);
        org.joda.time.DurationField durationField44 = zonedChronology27.minutes();
        org.joda.time.ReadablePeriod readablePeriod45 = null;
        long long48 = zonedChronology27.add(readablePeriod45, (long) 835, 32);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField21 and durationField44", (durationField21.compareTo(durationField44) == 0) == durationField21.equals(durationField44));
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test602");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology18 = zonedChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology12.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField21 = zonedChronology12.weekyear();
        org.joda.time.DateTimeZone dateTimeZone22 = zonedChronology12.getZone();
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology24 = null;
        boolean boolean25 = dateTimeFieldType23.isSupported(chronology24);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime(dateTimeZone26);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.minusWeeks(0);
        org.joda.time.Chronology chronology30 = localDateTime29.getChronology();
        org.joda.time.DateTimeField dateTimeField31 = dateTimeFieldType23.getField(chronology30);
        java.lang.String str32 = dateTimeField31.getName();
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime(dateTimeZone33);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime34.minusWeeks(0);
        org.joda.time.Chronology chronology37 = localDateTime36.getChronology();
        java.util.Locale locale39 = java.util.Locale.JAPANESE;
        java.lang.String str40 = locale39.getDisplayLanguage();
        java.lang.String str41 = locale39.getISO3Country();
        java.lang.String str42 = dateTimeField31.getAsShortText((org.joda.time.ReadablePartial) localDateTime36, 2, locale39);
        int int44 = dateTimeField31.getMaximumValue(0L);
        org.joda.time.DateTimeFieldType dateTimeFieldType45 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology46 = null;
        boolean boolean47 = dateTimeFieldType45.isSupported(chronology46);
        org.joda.time.DateTimeZone dateTimeZone48 = null;
        org.joda.time.LocalDateTime localDateTime49 = new org.joda.time.LocalDateTime(dateTimeZone48);
        org.joda.time.LocalDateTime localDateTime51 = localDateTime49.minusWeeks(0);
        org.joda.time.Chronology chronology52 = localDateTime51.getChronology();
        org.joda.time.DateTimeField dateTimeField53 = dateTimeFieldType45.getField(chronology52);
        java.lang.String str54 = dateTimeField53.getName();
        org.joda.time.DateTimeZone dateTimeZone55 = null;
        org.joda.time.LocalDateTime localDateTime56 = new org.joda.time.LocalDateTime(dateTimeZone55);
        org.joda.time.LocalDateTime localDateTime58 = localDateTime56.minusWeeks(0);
        org.joda.time.Chronology chronology59 = localDateTime58.getChronology();
        java.util.Locale locale61 = java.util.Locale.JAPANESE;
        java.lang.String str62 = locale61.getDisplayLanguage();
        java.lang.String str63 = locale61.getISO3Country();
        java.lang.String str64 = dateTimeField53.getAsShortText((org.joda.time.ReadablePartial) localDateTime58, 2, locale61);
        org.joda.time.LocalDateTime localDateTime66 = localDateTime58.minusDays((int) (byte) 1);
        org.joda.time.ReadableDuration readableDuration67 = null;
        org.joda.time.LocalDateTime localDateTime68 = localDateTime66.plus(readableDuration67);
        int[] intArray73 = new int[] { 0, 292278993, 10, 'a' };
        int int74 = dateTimeField31.getMinimumValue((org.joda.time.ReadablePartial) localDateTime68, intArray73);
        org.joda.time.DateTimeZone dateTimeZone75 = null;
        org.joda.time.LocalDateTime localDateTime76 = new org.joda.time.LocalDateTime(dateTimeZone75);
        org.joda.time.DateTimeZone dateTimeZone77 = null;
        org.joda.time.LocalDateTime localDateTime78 = new org.joda.time.LocalDateTime(dateTimeZone77);
        int int79 = localDateTime76.compareTo((org.joda.time.ReadablePartial) localDateTime78);
        org.joda.time.ReadableInstant readableInstant80 = null;
        org.joda.time.DateTime dateTime81 = localDateTime76.toDateTime(readableInstant80);
        boolean boolean83 = dateTime81.equals((java.lang.Object) 'a');
        org.joda.time.DateTime dateTime84 = localDateTime68.toDateTime((org.joda.time.ReadableInstant) dateTime81);
        long long86 = zonedChronology12.set((org.joda.time.ReadablePartial) localDateTime68, 10L);
        org.joda.time.DateTimeField dateTimeField87 = zonedChronology12.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField88 = zonedChronology12.era();
        org.joda.time.DateTimeField dateTimeField89 = zonedChronology12.monthOfYear();
        org.joda.time.DurationField durationField90 = zonedChronology12.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField90, durationField5, and durationField6", !(durationField90.compareTo(durationField5) == 0) || (Math.signum(durationField90.compareTo(durationField6)) == Math.signum(durationField5.compareTo(durationField6))));
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test603");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology18 = zonedChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology12.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField21 = zonedChronology12.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField22 = zonedChronology12.hourOfDay();
        org.joda.time.DurationField durationField23 = zonedChronology12.halfdays();
        org.joda.time.DurationField durationField24 = zonedChronology12.days();
        org.joda.time.DateTimeField dateTimeField25 = zonedChronology12.dayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField24", (durationField5.compareTo(durationField24) == 0) == durationField5.equals(durationField24));
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test604");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology18 = zonedChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology12.year();
        org.joda.time.DateTimeField dateTimeField21 = zonedChronology12.dayOfYear();
        org.joda.time.Chronology chronology22 = zonedChronology12.withUTC();
        org.joda.time.DurationField durationField23 = zonedChronology12.seconds();
        org.joda.time.DurationField durationField24 = zonedChronology12.minutes();
        org.joda.time.DateTimeField dateTimeField25 = zonedChronology12.minuteOfHour();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField24", (durationField6.compareTo(durationField24) == 0) == durationField6.equals(durationField24));
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test605");
        java.util.Locale locale0 = java.util.Locale.KOREAN;
        java.util.Set<java.lang.Character> charSet1 = locale0.getExtensionKeys();
        java.util.Iterator<java.lang.Character> charItor2 = charSet1.iterator();
        java.util.Locale locale3 = java.util.Locale.KOREAN;
        java.util.Set<java.lang.Character> charSet4 = locale3.getExtensionKeys();
        java.lang.Object[] objArray5 = charSet4.toArray();
        java.util.Locale locale6 = java.util.Locale.KOREAN;
        java.util.Set<java.lang.Character> charSet7 = locale6.getExtensionKeys();
        boolean boolean8 = charSet4.retainAll((java.util.Collection<java.lang.Character>) charSet7);
        boolean boolean9 = charSet1.containsAll((java.util.Collection<java.lang.Character>) charSet4);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.dayOfYear();
        boolean boolean11 = charSet1.equals((java.lang.Object) dateTimeFieldType10);
        org.joda.time.DurationFieldType durationFieldType12 = dateTimeFieldType10.getRangeDurationType();
        java.lang.String str13 = dateTimeFieldType10.getName();
        org.joda.time.DurationFieldType durationFieldType14 = dateTimeFieldType10.getRangeDurationType();
        java.lang.String str15 = durationFieldType14.toString();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(dateTimeZone16);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.minusWeeks(0);
        int int20 = localDateTime19.getYearOfCentury();
        org.joda.time.LocalDateTime localDateTime22 = localDateTime19.minusDays(100);
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology24 = null;
        boolean boolean25 = dateTimeFieldType23.isSupported(chronology24);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime(dateTimeZone26);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.minusWeeks(0);
        org.joda.time.Chronology chronology30 = localDateTime29.getChronology();
        org.joda.time.DateTimeField dateTimeField31 = dateTimeFieldType23.getField(chronology30);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime22.withField(dateTimeFieldType23, (int) 'x');
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime(dateTimeZone34);
        org.joda.time.LocalDateTime localDateTime37 = localDateTime35.minusWeeks(0);
        org.joda.time.Chronology chronology38 = localDateTime37.getChronology();
        org.joda.time.DurationField durationField39 = chronology38.days();
        org.joda.time.DurationField durationField40 = chronology38.minutes();
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str45 = dateTimeZone43.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology46 = org.joda.time.chrono.ZonedChronology.getInstance(chronology38, dateTimeZone43);
        org.joda.time.DateTimeField dateTimeField47 = zonedChronology46.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean51 = dateTimeZone49.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology52 = zonedChronology46.withZone(dateTimeZone49);
        org.joda.time.DateTimeField dateTimeField53 = zonedChronology46.dayOfMonth();
        org.joda.time.DurationField durationField54 = zonedChronology46.years();
        org.joda.time.LocalDateTime localDateTime55 = new org.joda.time.LocalDateTime((org.joda.time.Chronology) zonedChronology46);
        org.joda.time.DateTimeZone dateTimeZone56 = zonedChronology46.getZone();
        org.joda.time.DurationField durationField57 = zonedChronology46.seconds();
        org.joda.time.DateTimeField dateTimeField58 = dateTimeFieldType23.getField((org.joda.time.Chronology) zonedChronology46);
        org.joda.time.DurationField durationField59 = zonedChronology46.minutes();
        org.joda.time.DurationField durationField60 = durationFieldType14.getField((org.joda.time.Chronology) zonedChronology46);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField40 and durationField59", (durationField40.compareTo(durationField59) == 0) == durationField40.equals(durationField59));
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test606");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology18 = zonedChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.dayOfMonth();
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        long long23 = zonedChronology12.add(readablePeriod20, (long) 53, (int) (byte) 0);
        long long27 = zonedChronology12.add(1645427275536L, 0L, 8);
        org.joda.time.Chronology chronology28 = zonedChronology12.withUTC();
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology12.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField30 = zonedChronology12.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField31 = zonedChronology12.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField32 = zonedChronology12.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField33 = zonedChronology12.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField34 = zonedChronology12.dayOfYear();
        org.joda.time.DateTimeField dateTimeField35 = zonedChronology12.dayOfWeek();
        org.joda.time.DurationField durationField36 = zonedChronology12.days();
        org.joda.time.DateTimeField dateTimeField37 = zonedChronology12.weekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField36", (durationField5.compareTo(durationField36) == 0) == durationField5.equals(durationField36));
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test607");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minusWeeks(0);
        org.joda.time.Chronology chronology5 = localDateTime4.getChronology();
        org.joda.time.DurationField durationField6 = chronology5.days();
        org.joda.time.DurationField durationField7 = chronology5.minutes();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str12 = dateTimeZone10.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology13 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone10);
        org.joda.time.DateTimeField dateTimeField14 = zonedChronology13.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean18 = dateTimeZone16.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology19 = zonedChronology13.withZone(dateTimeZone16);
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology13.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField21 = zonedChronology13.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField22 = zonedChronology13.weekyear();
        org.joda.time.DurationField durationField23 = zonedChronology13.years();
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (short) 0);
        boolean boolean28 = dateTimeZone26.isStandardOffset((long) 61673414);
        org.joda.time.Chronology chronology29 = zonedChronology13.withZone(dateTimeZone26);
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime((long) 12, (org.joda.time.Chronology) zonedChronology13);
        org.joda.time.DateTimeField dateTimeField31 = zonedChronology13.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField32 = zonedChronology13.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField33 = zonedChronology13.weekyear();
        org.joda.time.DurationField durationField34 = zonedChronology13.weekyears();
        org.joda.time.DateTimeField dateTimeField35 = zonedChronology13.clockhourOfHalfday();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField23 and durationField34", (durationField23.compareTo(durationField34) == 0) == durationField23.equals(durationField34));
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test608");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology18 = zonedChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology12.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField21 = zonedChronology12.dayOfYear();
        org.joda.time.DurationField durationField22 = zonedChronology12.weekyears();
        org.joda.time.DurationField durationField23 = zonedChronology12.weekyears();
        java.lang.String str24 = zonedChronology12.toString();
        org.joda.time.DateTimeField dateTimeField25 = zonedChronology12.halfdayOfDay();
        org.joda.time.DurationField durationField26 = zonedChronology12.days();
        org.joda.time.DateTimeField dateTimeField27 = zonedChronology12.hourOfHalfday();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField26", (durationField5.compareTo(durationField26) == 0) == durationField5.equals(durationField26));
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test609");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology18 = zonedChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology12.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField21 = zonedChronology12.weekyear();
        org.joda.time.DurationField durationField22 = zonedChronology12.years();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology12.halfdayOfDay();
        org.joda.time.DurationField durationField24 = zonedChronology12.minutes();
        org.joda.time.DurationField durationField25 = zonedChronology12.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField25", (durationField6.compareTo(durationField25) == 0) == durationField6.equals(durationField25));
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test610");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("days");
        java.lang.String[] strArray11 = new java.lang.String[] { "427", "+10:00", "\uce90\ub098\ub2e4", "2022", "2", "2022", "2022-02-22T07:07:50.018", "2022", "millisOfSecond" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        java.util.List<java.lang.String> strList14 = java.util.Locale.filterTags(languageRangeList1, (java.util.Collection<java.lang.String>) strList12);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(dateTimeZone15);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.minusWeeks(0);
        org.joda.time.Chronology chronology19 = localDateTime18.getChronology();
        org.joda.time.DurationField durationField20 = chronology19.days();
        org.joda.time.DurationField durationField21 = chronology19.minutes();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str26 = dateTimeZone24.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology27 = org.joda.time.chrono.ZonedChronology.getInstance(chronology19, dateTimeZone24);
        org.joda.time.DurationField durationField28 = zonedChronology27.weeks();
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology27.year();
        org.joda.time.DurationField durationField30 = zonedChronology27.months();
        org.joda.time.DateTimeField dateTimeField31 = zonedChronology27.hourOfDay();
        java.util.Locale locale32 = java.util.Locale.GERMAN;
        java.util.Locale locale33 = java.util.Locale.GERMAN;
        java.lang.String str34 = locale32.getDisplayCountry(locale33);
        java.util.Locale locale35 = java.util.Locale.JAPANESE;
        java.lang.String str36 = locale35.getDisplayLanguage();
        java.util.Set<java.lang.String> strSet37 = locale35.getUnicodeLocaleKeys();
        java.lang.String str38 = locale32.getDisplayCountry(locale35);
        int int39 = dateTimeField31.getMaximumTextLength(locale32);
        java.util.Locale locale43 = new java.util.Locale("8", "2022-02-22T17:08:36.936", "");
        java.util.Set<java.lang.Character> charSet44 = locale43.getExtensionKeys();
        boolean boolean45 = locale43.hasExtensions();
        java.lang.String str46 = locale43.getDisplayCountry();
        java.lang.String str47 = locale32.getDisplayVariant(locale43);
        java.lang.String str48 = locale43.getCountry();
        java.util.Set<java.lang.String> strSet49 = locale43.getUnicodeLocaleAttributes();
        java.lang.String str50 = java.util.Locale.lookupTag(languageRangeList1, (java.util.Collection<java.lang.String>) strSet49);
        org.joda.time.DateTimeZone dateTimeZone51 = null;
        org.joda.time.LocalDateTime localDateTime52 = new org.joda.time.LocalDateTime(dateTimeZone51);
        org.joda.time.LocalDateTime localDateTime54 = localDateTime52.minusWeeks(0);
        org.joda.time.Chronology chronology55 = localDateTime54.getChronology();
        org.joda.time.DurationField durationField56 = chronology55.days();
        org.joda.time.DurationField durationField57 = chronology55.minutes();
        org.joda.time.DateTimeZone dateTimeZone60 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str62 = dateTimeZone60.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology63 = org.joda.time.chrono.ZonedChronology.getInstance(chronology55, dateTimeZone60);
        org.joda.time.DurationField durationField64 = zonedChronology63.weeks();
        org.joda.time.DateTimeField dateTimeField65 = zonedChronology63.year();
        org.joda.time.DurationField durationField66 = zonedChronology63.months();
        org.joda.time.DateTimeField dateTimeField67 = zonedChronology63.hourOfDay();
        java.util.Locale locale68 = java.util.Locale.GERMAN;
        java.util.Locale locale69 = java.util.Locale.GERMAN;
        java.lang.String str70 = locale68.getDisplayCountry(locale69);
        java.util.Locale locale71 = java.util.Locale.JAPANESE;
        java.lang.String str72 = locale71.getDisplayLanguage();
        java.util.Set<java.lang.String> strSet73 = locale71.getUnicodeLocaleKeys();
        java.lang.String str74 = locale68.getDisplayCountry(locale71);
        int int75 = dateTimeField67.getMaximumTextLength(locale68);
        java.util.Locale locale79 = new java.util.Locale("8", "2022-02-22T17:08:36.936", "");
        java.util.Set<java.lang.Character> charSet80 = locale79.getExtensionKeys();
        boolean boolean81 = locale79.hasExtensions();
        java.lang.String str82 = locale79.getDisplayCountry();
        java.lang.String str83 = locale68.getDisplayVariant(locale79);
        java.lang.String str84 = locale79.getCountry();
        java.util.Set<java.lang.String> strSet85 = locale79.getUnicodeLocaleAttributes();
        java.lang.String str86 = java.util.Locale.lookupTag(languageRangeList1, (java.util.Collection<java.lang.String>) strSet85);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField28 and durationField64", (durationField28.compareTo(durationField64) == 0) == durationField28.equals(durationField64));
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test611");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology18 = zonedChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology12.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField21 = zonedChronology12.weekyear();
        org.joda.time.DurationField durationField22 = zonedChronology12.years();
        org.joda.time.DurationField durationField23 = zonedChronology12.weeks();
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime(dateTimeZone24);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime25.minusWeeks(0);
        org.joda.time.Chronology chronology28 = localDateTime27.getChronology();
        org.joda.time.DurationField durationField29 = chronology28.days();
        org.joda.time.DurationField durationField30 = chronology28.minutes();
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str35 = dateTimeZone33.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology36 = org.joda.time.chrono.ZonedChronology.getInstance(chronology28, dateTimeZone33);
        org.joda.time.DateTimeField dateTimeField37 = zonedChronology36.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean41 = dateTimeZone39.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology42 = zonedChronology36.withZone(dateTimeZone39);
        org.joda.time.DateTimeField dateTimeField43 = zonedChronology36.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField44 = zonedChronology36.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField45 = zonedChronology36.weekyear();
        org.joda.time.DateTimeZone dateTimeZone46 = zonedChronology36.getZone();
        org.joda.time.Chronology chronology47 = zonedChronology12.withZone(dateTimeZone46);
        java.util.Locale.Builder builder49 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder51 = builder49.setLanguage("CAN");
        java.util.Locale.Builder builder52 = builder49.clearExtensions();
        java.util.Locale.Builder builder53 = builder49.clearExtensions();
        java.util.Locale locale54 = builder49.build();
        java.lang.String str55 = dateTimeZone46.getShortName(1645513737867L, locale54);
        java.lang.String str56 = locale54.getDisplayScript();
        org.joda.time.DateTimeZone dateTimeZone57 = null;
        org.joda.time.LocalDateTime localDateTime58 = new org.joda.time.LocalDateTime(dateTimeZone57);
        org.joda.time.LocalDateTime localDateTime60 = localDateTime58.minusWeeks(0);
        org.joda.time.Chronology chronology61 = localDateTime60.getChronology();
        org.joda.time.DurationField durationField62 = chronology61.days();
        org.joda.time.DurationField durationField63 = chronology61.minutes();
        org.joda.time.DateTimeZone dateTimeZone66 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str68 = dateTimeZone66.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology69 = org.joda.time.chrono.ZonedChronology.getInstance(chronology61, dateTimeZone66);
        org.joda.time.DurationField durationField70 = zonedChronology69.weeks();
        org.joda.time.DateTimeField dateTimeField71 = zonedChronology69.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField72 = zonedChronology69.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone73 = zonedChronology69.getZone();
        org.joda.time.DateTimeZone dateTimeZone74 = zonedChronology69.getZone();
        java.util.Locale.Builder builder75 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder77 = builder75.setVariant("");
        java.util.Locale.Builder builder78 = builder77.clearExtensions();
        java.util.Locale locale80 = new java.util.Locale("CN");
        java.util.Locale.Builder builder81 = builder78.setLocale(locale80);
        boolean boolean82 = dateTimeZone74.equals((java.lang.Object) locale80);
        java.lang.String str83 = locale54.getDisplayCountry(locale80);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField23 and durationField70", (durationField23.compareTo(durationField70) == 0) == durationField23.equals(durationField70));
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test612");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology18 = zonedChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology12.weekOfWeekyear();
        org.joda.time.Chronology chronology21 = zonedChronology12.withUTC();
        org.joda.time.LocalDateTime localDateTime22 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) zonedChronology12);
        org.joda.time.DurationField durationField23 = zonedChronology12.minutes();
        org.joda.time.DurationField durationField24 = zonedChronology12.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField23", (durationField6.compareTo(durationField23) == 0) == durationField6.equals(durationField23));
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test613");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DurationField durationField13 = zonedChronology12.weeks();
        org.joda.time.DateTimeField dateTimeField14 = zonedChronology12.year();
        org.joda.time.DateTimeZone dateTimeZone15 = zonedChronology12.getZone();
        org.joda.time.DateTimeField dateTimeField16 = zonedChronology12.millisOfSecond();
        org.joda.time.DurationField durationField17 = zonedChronology12.hours();
        org.joda.time.DurationField durationField18 = zonedChronology12.centuries();
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology12.year();
        org.joda.time.DateTimeField dateTimeField21 = zonedChronology12.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime(dateTimeZone22);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime(dateTimeZone24);
        int int26 = localDateTime23.compareTo((org.joda.time.ReadablePartial) localDateTime25);
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime();
        boolean boolean28 = localDateTime23.isEqual((org.joda.time.ReadablePartial) localDateTime27);
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime(dateTimeZone29);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime30.minusWeeks(0);
        int int33 = localDateTime27.compareTo((org.joda.time.ReadablePartial) localDateTime30);
        java.util.Date date34 = localDateTime30.toDate();
        org.joda.time.LocalDateTime localDateTime35 = org.joda.time.LocalDateTime.fromDateFields(date34);
        org.joda.time.LocalDateTime localDateTime36 = org.joda.time.LocalDateTime.fromDateFields(date34);
        org.joda.time.LocalDateTime localDateTime37 = org.joda.time.LocalDateTime.fromDateFields(date34);
        int int38 = localDateTime37.size();
        int[] intArray40 = zonedChronology12.get((org.joda.time.ReadablePartial) localDateTime37, 0L);
        org.joda.time.DateTimeField dateTimeField41 = zonedChronology12.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField42 = zonedChronology12.clockhourOfDay();
        org.joda.time.DurationField durationField43 = zonedChronology12.days();
        org.joda.time.DurationField durationField44 = zonedChronology12.years();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField43", (durationField5.compareTo(durationField43) == 0) == durationField5.equals(durationField43));
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test614");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DurationField durationField13 = zonedChronology12.weeks();
        org.joda.time.DateTimeField dateTimeField14 = zonedChronology12.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField15 = zonedChronology12.dayOfWeek();
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        long long19 = zonedChronology12.add(readablePeriod16, 0L, 2);
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology12.weekyearOfCentury();
        org.joda.time.DurationField durationField21 = zonedChronology12.centuries();
        org.joda.time.DateTimeField dateTimeField22 = zonedChronology12.yearOfCentury();
        org.joda.time.DurationField durationField23 = zonedChronology12.centuries();
        org.joda.time.DurationField durationField24 = zonedChronology12.minutes();
        org.joda.time.DateTimeField dateTimeField25 = zonedChronology12.era();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField24", (durationField6.compareTo(durationField24) == 0) == durationField6.equals(durationField24));
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test615");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology18 = zonedChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology12.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField21 = zonedChronology12.weekyear();
        org.joda.time.DateTimeZone dateTimeZone22 = zonedChronology12.getZone();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology12.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField24 = zonedChronology12.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField25 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime(dateTimeZone26);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime(dateTimeZone28);
        int int30 = localDateTime27.compareTo((org.joda.time.ReadablePartial) localDateTime29);
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.DateTime dateTime32 = localDateTime27.toDateTime(readableInstant31);
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime(dateTimeZone33);
        org.joda.time.LocalDateTime.Property property35 = localDateTime34.yearOfEra();
        int int36 = property35.getMinimumValue();
        boolean boolean37 = dateTime32.equals((java.lang.Object) int36);
        org.joda.time.Chronology chronology38 = dateTime32.getChronology();
        org.joda.time.DateTimeZone dateTimeZone39 = dateTime32.getZone();
        boolean boolean40 = dateTimeZone39.isFixed();
        org.joda.time.Chronology chronology41 = zonedChronology12.withZone(dateTimeZone39);
        org.joda.time.DurationField durationField42 = zonedChronology12.days();
        org.joda.time.DateTimeField dateTimeField43 = zonedChronology12.hourOfHalfday();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField42", (durationField5.compareTo(durationField42) == 0) == durationField5.equals(durationField42));
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test616");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology18 = zonedChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.dayOfMonth();
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        long long23 = zonedChronology12.add(readablePeriod20, (long) 53, (int) (byte) 0);
        org.joda.time.DurationField durationField24 = zonedChronology12.weeks();
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        long long28 = zonedChronology12.add(readablePeriod25, (long) 12, (int) (short) 100);
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology12.halfdayOfDay();
        org.joda.time.DurationField durationField30 = zonedChronology12.months();
        org.joda.time.DurationField durationField31 = zonedChronology12.seconds();
        org.joda.time.DurationField durationField32 = zonedChronology12.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField32, durationField5, and durationField6", !(durationField32.compareTo(durationField5) == 0) || (Math.signum(durationField32.compareTo(durationField6)) == Math.signum(durationField5.compareTo(durationField6))));
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test617");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology18 = zonedChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.dayOfMonth();
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        long long23 = zonedChronology12.add(readablePeriod20, (long) 53, (int) (byte) 0);
        org.joda.time.DateTimeField dateTimeField24 = zonedChronology12.year();
        org.joda.time.DateTimeField dateTimeField25 = zonedChronology12.clockhourOfDay();
        org.joda.time.DurationField durationField26 = zonedChronology12.minutes();
        org.joda.time.DateTimeField dateTimeField27 = zonedChronology12.weekOfWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField26", (durationField6.compareTo(durationField26) == 0) == durationField6.equals(durationField26));
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test618");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime(dateTimeZone2);
        int int4 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime3.monthOfYear();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime3.withWeekyear((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(dateTimeZone8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.minusWeeks(0);
        org.joda.time.Chronology chronology12 = localDateTime11.getChronology();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.withYear((int) (short) 100);
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.year();
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.DateTime dateTime17 = localDateTime14.toDateTime(readableInstant16);
        org.joda.time.DurationFieldType durationFieldType18 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology20 = null;
        boolean boolean21 = dateTimeFieldType19.isSupported(chronology20);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime(dateTimeZone22);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.minusWeeks(0);
        org.joda.time.Chronology chronology26 = localDateTime25.getChronology();
        org.joda.time.DateTimeField dateTimeField27 = dateTimeFieldType19.getField(chronology26);
        org.joda.time.DurationField durationField28 = durationFieldType18.getField(chronology26);
        org.joda.time.DurationField durationField29 = chronology26.weeks();
        org.joda.time.DateTimeField dateTimeField30 = chronology26.centuryOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = dateTimeField30.getType();
        boolean boolean32 = dateTime17.isSupported(dateTimeFieldType31);
        int int33 = localDateTime7.get(dateTimeFieldType31);
        java.lang.String str34 = dateTimeFieldType31.getName();
        org.joda.time.DurationFieldType durationFieldType35 = dateTimeFieldType31.getDurationType();
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime(dateTimeZone36);
        org.joda.time.LocalDateTime localDateTime39 = localDateTime37.minusWeeks(0);
        org.joda.time.Chronology chronology40 = localDateTime39.getChronology();
        org.joda.time.DurationField durationField41 = chronology40.days();
        org.joda.time.DurationField durationField42 = chronology40.minutes();
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str47 = dateTimeZone45.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology48 = org.joda.time.chrono.ZonedChronology.getInstance(chronology40, dateTimeZone45);
        org.joda.time.DateTimeField dateTimeField49 = zonedChronology48.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean53 = dateTimeZone51.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology54 = zonedChronology48.withZone(dateTimeZone51);
        org.joda.time.DateTimeField dateTimeField55 = zonedChronology48.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField56 = zonedChronology48.year();
        java.lang.String str57 = zonedChronology48.toString();
        org.joda.time.DurationField durationField58 = zonedChronology48.months();
        org.joda.time.DateTimeField dateTimeField59 = zonedChronology48.year();
        org.joda.time.ReadablePeriod readablePeriod60 = null;
        long long63 = zonedChronology48.add(readablePeriod60, 1645427332359L, 61703107);
        org.joda.time.DateTimeZone dateTimeZone64 = null;
        org.joda.time.LocalDateTime localDateTime65 = new org.joda.time.LocalDateTime(dateTimeZone64);
        org.joda.time.LocalDateTime localDateTime67 = localDateTime65.minusWeeks(0);
        org.joda.time.Chronology chronology68 = localDateTime67.getChronology();
        org.joda.time.DurationField durationField69 = chronology68.days();
        org.joda.time.DurationField durationField70 = chronology68.minutes();
        org.joda.time.DateTimeZone dateTimeZone73 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str75 = dateTimeZone73.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology76 = org.joda.time.chrono.ZonedChronology.getInstance(chronology68, dateTimeZone73);
        org.joda.time.DateTimeField dateTimeField77 = zonedChronology76.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone79 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean81 = dateTimeZone79.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology82 = zonedChronology76.withZone(dateTimeZone79);
        org.joda.time.DateTimeField dateTimeField83 = zonedChronology76.dayOfMonth();
        org.joda.time.ReadablePeriod readablePeriod84 = null;
        long long87 = zonedChronology76.add(readablePeriod84, (long) 53, (int) (byte) 0);
        org.joda.time.DateTimeField dateTimeField88 = zonedChronology76.year();
        org.joda.time.DurationField durationField89 = zonedChronology76.weeks();
        boolean boolean90 = zonedChronology48.equals((java.lang.Object) zonedChronology76);
        org.joda.time.DurationField durationField91 = zonedChronology76.millis();
        org.joda.time.DateTimeField dateTimeField92 = zonedChronology76.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField93 = zonedChronology76.minuteOfHour();
        org.joda.time.Chronology chronology94 = zonedChronology76.withUTC();
        boolean boolean95 = durationFieldType35.isSupported((org.joda.time.Chronology) zonedChronology76);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField29 and durationField89", (durationField29.compareTo(durationField89) == 0) == durationField29.equals(durationField89));
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test619");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology12.monthOfYear();
        org.joda.time.DurationField durationField14 = zonedChronology12.hours();
        org.joda.time.DurationField durationField15 = zonedChronology12.seconds();
        org.joda.time.DateTimeField dateTimeField16 = zonedChronology12.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField17 = zonedChronology12.year();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime(dateTimeZone19);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime20.minusWeeks(0);
        org.joda.time.Chronology chronology23 = localDateTime22.getChronology();
        org.joda.time.DurationField durationField24 = chronology23.days();
        org.joda.time.DurationField durationField25 = chronology23.minutes();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str30 = dateTimeZone28.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology31 = org.joda.time.chrono.ZonedChronology.getInstance(chronology23, dateTimeZone28);
        org.joda.time.DateTimeField dateTimeField32 = zonedChronology31.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean36 = dateTimeZone34.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology37 = zonedChronology31.withZone(dateTimeZone34);
        org.joda.time.DateTimeField dateTimeField38 = zonedChronology31.dayOfMonth();
        org.joda.time.DurationField durationField39 = zonedChronology31.seconds();
        org.joda.time.LocalDateTime localDateTime40 = new org.joda.time.LocalDateTime(4518471600L, (org.joda.time.Chronology) zonedChronology31);
        org.joda.time.DateTimeField dateTimeField41 = zonedChronology31.monthOfYear();
        org.joda.time.DateTimeField dateTimeField42 = zonedChronology31.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField43 = zonedChronology31.monthOfYear();
        org.joda.time.DateTimeField dateTimeField44 = zonedChronology31.weekyear();
        org.joda.time.ReadablePartial readablePartial45 = null;
        java.util.Locale locale47 = java.util.Locale.JAPAN;
        java.lang.String str48 = dateTimeField44.getAsText(readablePartial45, (int) (byte) 100, locale47);
        java.lang.String str50 = dateTimeField44.getAsShortText(1645426616298L);
        java.util.Locale locale54 = new java.util.Locale("2022-02-22T17:09:53.068", "COORDINATED UNIVERSAL TIME");
        java.lang.String str55 = dateTimeField44.getAsShortText((long) 62024693, locale54);
        int int56 = dateTimeField17.getMaximumTextLength(locale54);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField15 and durationField39", (durationField15.compareTo(durationField39) == 0) == durationField15.equals(durationField39));
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test620");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withYear((int) (short) 100);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.year();
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.DateTime dateTime9 = localDateTime6.toDateTime(readableInstant8);
        org.joda.time.DurationFieldType durationFieldType10 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology12 = null;
        boolean boolean13 = dateTimeFieldType11.isSupported(chronology12);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime(dateTimeZone14);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.minusWeeks(0);
        org.joda.time.Chronology chronology18 = localDateTime17.getChronology();
        org.joda.time.DateTimeField dateTimeField19 = dateTimeFieldType11.getField(chronology18);
        org.joda.time.DurationField durationField20 = durationFieldType10.getField(chronology18);
        org.joda.time.DurationField durationField21 = chronology18.weeks();
        org.joda.time.DateTimeField dateTimeField22 = chronology18.centuryOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = dateTimeField22.getType();
        boolean boolean24 = dateTime9.isSupported(dateTimeFieldType23);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime(dateTimeZone26);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.minusWeeks(0);
        org.joda.time.Chronology chronology30 = localDateTime29.getChronology();
        org.joda.time.DurationField durationField31 = chronology30.days();
        org.joda.time.DurationField durationField32 = chronology30.minutes();
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str37 = dateTimeZone35.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology38 = org.joda.time.chrono.ZonedChronology.getInstance(chronology30, dateTimeZone35);
        org.joda.time.DateTimeField dateTimeField39 = zonedChronology38.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean43 = dateTimeZone41.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology44 = zonedChronology38.withZone(dateTimeZone41);
        org.joda.time.DateTimeField dateTimeField45 = zonedChronology38.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField46 = zonedChronology38.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField47 = zonedChronology38.weekyear();
        org.joda.time.DurationField durationField48 = zonedChronology38.years();
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (short) 0);
        boolean boolean53 = dateTimeZone51.isStandardOffset((long) 61673414);
        org.joda.time.Chronology chronology54 = zonedChronology38.withZone(dateTimeZone51);
        org.joda.time.LocalDateTime localDateTime55 = new org.joda.time.LocalDateTime((long) 12, (org.joda.time.Chronology) zonedChronology38);
        org.joda.time.DateTimeField dateTimeField56 = zonedChronology38.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField57 = dateTimeFieldType23.getField((org.joda.time.Chronology) zonedChronology38);
        org.joda.time.DurationField durationField58 = zonedChronology38.days();
        org.joda.time.DateTimeField dateTimeField59 = zonedChronology38.weekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField31 and durationField58", (durationField31.compareTo(durationField58) == 0) == durationField31.equals(durationField58));
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test621");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime(dateTimeZone3);
        int int5 = localDateTime2.compareTo((org.joda.time.ReadablePartial) localDateTime4);
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.DateTime dateTime7 = localDateTime2.toDateTime(readableInstant6);
        org.joda.time.Chronology chronology8 = dateTime7.getChronology();
        org.joda.time.DurationField durationField9 = durationFieldType0.getField(chronology8);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(dateTimeZone10);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.minusWeeks(0);
        org.joda.time.Chronology chronology14 = localDateTime13.getChronology();
        org.joda.time.DurationField durationField15 = chronology14.days();
        org.joda.time.DurationField durationField16 = chronology14.minutes();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str21 = dateTimeZone19.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology22 = org.joda.time.chrono.ZonedChronology.getInstance(chronology14, dateTimeZone19);
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology22.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean27 = dateTimeZone25.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology28 = zonedChronology22.withZone(dateTimeZone25);
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology22.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField30 = zonedChronology22.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        org.joda.time.Chronology chronology34 = zonedChronology22.withZone(dateTimeZone33);
        org.joda.time.DurationField durationField35 = zonedChronology22.years();
        org.joda.time.DurationField durationField36 = zonedChronology22.months();
        org.joda.time.DurationField durationField37 = zonedChronology22.seconds();
        boolean boolean38 = durationFieldType0.isSupported((org.joda.time.Chronology) zonedChronology22);
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.LocalDateTime localDateTime40 = new org.joda.time.LocalDateTime(dateTimeZone39);
        org.joda.time.LocalDateTime localDateTime42 = localDateTime40.minusWeeks(0);
        org.joda.time.Chronology chronology43 = localDateTime42.getChronology();
        org.joda.time.DurationField durationField44 = chronology43.days();
        org.joda.time.DurationField durationField45 = chronology43.minutes();
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str50 = dateTimeZone48.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology51 = org.joda.time.chrono.ZonedChronology.getInstance(chronology43, dateTimeZone48);
        org.joda.time.DateTimeField dateTimeField52 = zonedChronology51.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone54 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean56 = dateTimeZone54.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology57 = zonedChronology51.withZone(dateTimeZone54);
        org.joda.time.DateTimeField dateTimeField58 = zonedChronology51.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField59 = zonedChronology51.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField60 = zonedChronology51.dayOfYear();
        org.joda.time.DurationField durationField61 = zonedChronology51.weekyears();
        org.joda.time.DateTimeField dateTimeField62 = zonedChronology51.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField63 = zonedChronology51.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField64 = zonedChronology51.yearOfCentury();
        boolean boolean65 = durationFieldType0.isSupported((org.joda.time.Chronology) zonedChronology51);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField35 and durationField61", (durationField35.compareTo(durationField61) == 0) == durationField35.equals(durationField61));
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test622");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DurationField durationField13 = zonedChronology12.weeks();
        org.joda.time.DateTimeField dateTimeField14 = zonedChronology12.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone15 = zonedChronology12.getZone();
        java.lang.String str17 = dateTimeZone15.getName(1876077118L);
        long long20 = dateTimeZone15.convertLocalToUTC((-5960854693144799988L), false);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime(dateTimeZone21);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime22.minusWeeks(0);
        org.joda.time.Chronology chronology25 = localDateTime24.getChronology();
        org.joda.time.DurationField durationField26 = chronology25.days();
        org.joda.time.DurationField durationField27 = chronology25.minutes();
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str32 = dateTimeZone30.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology33 = org.joda.time.chrono.ZonedChronology.getInstance(chronology25, dateTimeZone30);
        org.joda.time.DurationField durationField34 = zonedChronology33.weeks();
        org.joda.time.DateTimeField dateTimeField35 = zonedChronology33.year();
        org.joda.time.DateTimeZone dateTimeZone36 = zonedChronology33.getZone();
        org.joda.time.DateTimeField dateTimeField37 = zonedChronology33.millisOfSecond();
        org.joda.time.DurationField durationField38 = zonedChronology33.hours();
        org.joda.time.DurationField durationField39 = zonedChronology33.centuries();
        org.joda.time.DateTimeField dateTimeField40 = zonedChronology33.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime((long) (byte) -1);
        int int43 = localDateTime42.getEra();
        int int44 = localDateTime42.getYearOfEra();
        java.util.Locale locale45 = null;
        java.lang.String str46 = dateTimeField40.getAsShortText((org.joda.time.ReadablePartial) localDateTime42, locale45);
        boolean boolean47 = dateTimeZone15.isLocalDateTimeGap(localDateTime42);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField13 and durationField34", (durationField13.compareTo(durationField34) == 0) == durationField13.equals(durationField34));
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test623");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology18 = zonedChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology12.year();
        org.joda.time.DateTimeField dateTimeField21 = zonedChronology12.dayOfMonth();
        org.joda.time.DurationField durationField22 = zonedChronology12.weeks();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology12.weekyearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone24 = zonedChronology12.getZone();
        org.joda.time.DurationField durationField25 = zonedChronology12.minutes();
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime(dateTimeZone26);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.minusWeeks(0);
        org.joda.time.Chronology chronology30 = localDateTime29.getChronology();
        org.joda.time.DurationField durationField31 = chronology30.days();
        org.joda.time.DurationField durationField32 = chronology30.minutes();
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str37 = dateTimeZone35.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology38 = org.joda.time.chrono.ZonedChronology.getInstance(chronology30, dateTimeZone35);
        org.joda.time.DurationField durationField39 = zonedChronology38.weeks();
        org.joda.time.DateTimeField dateTimeField40 = zonedChronology38.year();
        org.joda.time.DateTimeZone dateTimeZone41 = zonedChronology38.getZone();
        org.joda.time.DateTimeField dateTimeField42 = zonedChronology38.year();
        java.lang.String str43 = zonedChronology38.toString();
        org.joda.time.DurationField durationField44 = zonedChronology38.months();
        org.joda.time.DateTimeField dateTimeField45 = zonedChronology38.dayOfYear();
        org.joda.time.DateTimeField dateTimeField46 = zonedChronology38.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField47 = zonedChronology38.yearOfEra();
        org.joda.time.DurationField durationField48 = zonedChronology38.weekyears();
        int int49 = durationField25.compareTo(durationField48);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField22 and durationField39", (durationField22.compareTo(durationField39) == 0) == durationField22.equals(durationField39));
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test624");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (byte) -1);
        int int2 = localDateTime1.getEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.monthOfYear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.withYearOfCentury(10);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.minusDays((int) (byte) 100);
        int int8 = localDateTime7.getCenturyOfEra();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime7.withYearOfEra(61718894);
        org.joda.time.DateTimeField[] dateTimeFieldArray11 = localDateTime10.getFields();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean15 = dateTimeZone13.isStandardOffset((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime16 = org.joda.time.LocalDateTime.now(dateTimeZone13);
        long long18 = dateTimeZone13.previousTransition(190L);
        org.joda.time.DateTime dateTime19 = localDateTime10.toDateTime(dateTimeZone13);
        org.joda.time.Instant instant20 = dateTime19.toInstant();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        int int24 = dateTimeZone22.getOffsetFromLocal(4518471413L);
        boolean boolean26 = dateTimeZone22.isStandardOffset((long) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (short) 0);
        boolean boolean31 = dateTimeZone29.isStandardOffset((long) 61673414);
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology33 = null;
        boolean boolean34 = dateTimeFieldType32.isSupported(chronology33);
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.LocalDateTime localDateTime36 = new org.joda.time.LocalDateTime(dateTimeZone35);
        org.joda.time.LocalDateTime localDateTime38 = localDateTime36.minusWeeks(0);
        org.joda.time.Chronology chronology39 = localDateTime38.getChronology();
        org.joda.time.DateTimeField dateTimeField40 = dateTimeFieldType32.getField(chronology39);
        java.lang.String str41 = dateTimeField40.getName();
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.LocalDateTime localDateTime43 = new org.joda.time.LocalDateTime(dateTimeZone42);
        org.joda.time.LocalDateTime localDateTime45 = localDateTime43.minusWeeks(0);
        org.joda.time.Chronology chronology46 = localDateTime45.getChronology();
        java.util.Locale locale48 = java.util.Locale.JAPANESE;
        java.lang.String str49 = locale48.getDisplayLanguage();
        java.lang.String str50 = locale48.getISO3Country();
        java.lang.String str51 = dateTimeField40.getAsShortText((org.joda.time.ReadablePartial) localDateTime45, 2, locale48);
        int int53 = dateTimeField40.getMaximumValue(0L);
        org.joda.time.DateTimeFieldType dateTimeFieldType54 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology55 = null;
        boolean boolean56 = dateTimeFieldType54.isSupported(chronology55);
        org.joda.time.DateTimeZone dateTimeZone57 = null;
        org.joda.time.LocalDateTime localDateTime58 = new org.joda.time.LocalDateTime(dateTimeZone57);
        org.joda.time.LocalDateTime localDateTime60 = localDateTime58.minusWeeks(0);
        org.joda.time.Chronology chronology61 = localDateTime60.getChronology();
        org.joda.time.DateTimeField dateTimeField62 = dateTimeFieldType54.getField(chronology61);
        java.lang.String str63 = dateTimeField62.getName();
        org.joda.time.DateTimeZone dateTimeZone64 = null;
        org.joda.time.LocalDateTime localDateTime65 = new org.joda.time.LocalDateTime(dateTimeZone64);
        org.joda.time.LocalDateTime localDateTime67 = localDateTime65.minusWeeks(0);
        org.joda.time.Chronology chronology68 = localDateTime67.getChronology();
        java.util.Locale locale70 = java.util.Locale.JAPANESE;
        java.lang.String str71 = locale70.getDisplayLanguage();
        java.lang.String str72 = locale70.getISO3Country();
        java.lang.String str73 = dateTimeField62.getAsShortText((org.joda.time.ReadablePartial) localDateTime67, 2, locale70);
        org.joda.time.LocalDateTime localDateTime75 = localDateTime67.minusDays((int) (byte) 1);
        org.joda.time.ReadableDuration readableDuration76 = null;
        org.joda.time.LocalDateTime localDateTime77 = localDateTime75.plus(readableDuration76);
        int[] intArray82 = new int[] { 0, 292278993, 10, 'a' };
        int int83 = dateTimeField40.getMinimumValue((org.joda.time.ReadablePartial) localDateTime77, intArray82);
        org.joda.time.DateTimeZone dateTimeZone84 = null;
        org.joda.time.LocalDateTime localDateTime85 = new org.joda.time.LocalDateTime(dateTimeZone84);
        org.joda.time.DateTimeZone dateTimeZone86 = null;
        org.joda.time.LocalDateTime localDateTime87 = new org.joda.time.LocalDateTime(dateTimeZone86);
        int int88 = localDateTime85.compareTo((org.joda.time.ReadablePartial) localDateTime87);
        org.joda.time.ReadableInstant readableInstant89 = null;
        org.joda.time.DateTime dateTime90 = localDateTime85.toDateTime(readableInstant89);
        boolean boolean92 = dateTime90.equals((java.lang.Object) 'a');
        org.joda.time.DateTime dateTime93 = localDateTime77.toDateTime((org.joda.time.ReadableInstant) dateTime90);
        int int94 = dateTimeZone29.getOffset((org.joda.time.ReadableInstant) dateTime90);
        int int95 = dateTimeZone22.getOffset((org.joda.time.ReadableInstant) dateTime90);
        org.joda.time.Instant instant96 = dateTime90.toInstant();
        org.joda.time.DateTimeZone dateTimeZone97 = dateTime90.getZone();
        boolean boolean98 = instant20.isBefore((org.joda.time.ReadableInstant) dateTime90);
        org.joda.time.Instant instant99 = instant20.toInstant();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime90 and instant96", (dateTime90.compareTo(instant96) == 0) == dateTime90.equals(instant96));
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test625");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology18 = zonedChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology12.year();
        java.lang.String str21 = zonedChronology12.toString();
        org.joda.time.DurationField durationField22 = zonedChronology12.halfdays();
        org.joda.time.DurationField durationField23 = zonedChronology12.months();
        org.joda.time.DateTimeField dateTimeField24 = zonedChronology12.millisOfSecond();
        org.joda.time.DurationField durationField25 = zonedChronology12.days();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (short) 0);
        java.util.TimeZone timeZone29 = dateTimeZone28.toTimeZone();
        org.joda.time.Chronology chronology30 = zonedChronology12.withZone(dateTimeZone28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField25", (durationField5.compareTo(durationField25) == 0) == durationField5.equals(durationField25));
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test626");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime3 = property1.addToCopy((long) (short) 0);
        org.joda.time.DurationFieldType durationFieldType4 = org.joda.time.DurationFieldType.centuries();
        boolean boolean5 = property1.equals((java.lang.Object) durationFieldType4);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DurationField durationField7 = durationFieldType4.getField(chronology6);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(dateTimeZone8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.minusWeeks(0);
        org.joda.time.Chronology chronology12 = localDateTime11.getChronology();
        org.joda.time.DurationField durationField13 = chronology12.days();
        org.joda.time.DurationField durationField14 = chronology12.minutes();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str19 = dateTimeZone17.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology20 = org.joda.time.chrono.ZonedChronology.getInstance(chronology12, dateTimeZone17);
        org.joda.time.DurationField durationField21 = zonedChronology20.weeks();
        org.joda.time.DateTimeField dateTimeField22 = zonedChronology20.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology20.dayOfWeek();
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        long long27 = zonedChronology20.add(readablePeriod24, 0L, 2);
        org.joda.time.DateTimeField dateTimeField28 = zonedChronology20.weekyearOfCentury();
        java.lang.String str29 = zonedChronology20.toString();
        boolean boolean30 = durationFieldType4.isSupported((org.joda.time.Chronology) zonedChronology20);
        org.joda.time.DateTimeField dateTimeField31 = zonedChronology20.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField32 = zonedChronology20.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime(dateTimeZone33);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime34.minusWeeks(0);
        org.joda.time.Chronology chronology37 = localDateTime36.getChronology();
        org.joda.time.DurationField durationField38 = chronology37.days();
        org.joda.time.DurationField durationField39 = chronology37.minutes();
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str44 = dateTimeZone42.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology45 = org.joda.time.chrono.ZonedChronology.getInstance(chronology37, dateTimeZone42);
        org.joda.time.DurationField durationField46 = zonedChronology45.weeks();
        org.joda.time.DateTimeField dateTimeField47 = zonedChronology45.year();
        org.joda.time.DurationField durationField48 = zonedChronology45.months();
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str53 = dateTimeZone51.getShortName((long) 10);
        java.lang.String str54 = dateTimeZone51.getID();
        long long57 = dateTimeZone51.convertLocalToUTC((long) (short) 1, false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone51);
        int int60 = dateTimeZone51.getStandardOffset(1L);
        org.joda.time.chrono.ZonedChronology zonedChronology61 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) zonedChronology45, dateTimeZone51);
        org.joda.time.DateTimeField dateTimeField62 = zonedChronology45.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone63 = zonedChronology45.getZone();
        org.joda.time.DateTimeField dateTimeField64 = zonedChronology45.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone65 = null;
        org.joda.time.LocalDateTime localDateTime66 = new org.joda.time.LocalDateTime(dateTimeZone65);
        org.joda.time.LocalDateTime.Property property67 = localDateTime66.yearOfEra();
        long long68 = property67.remainder();
        int int69 = property67.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime70 = property67.withMaximumValue();
        long long72 = zonedChronology45.set((org.joda.time.ReadablePartial) localDateTime70, (long) (short) 1);
        org.joda.time.DateTimeField dateTimeField73 = zonedChronology45.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField74 = zonedChronology45.dayOfMonth();
        boolean boolean75 = dateTimeField74.isLenient();
        java.util.Locale locale76 = java.util.Locale.KOREA;
        java.lang.String str77 = locale76.getDisplayLanguage();
        java.util.Locale.setDefault(locale76);
        java.lang.String str79 = locale76.getDisplayLanguage();
        int int80 = dateTimeField74.getMaximumTextLength(locale76);
        boolean boolean81 = locale76.hasExtensions();
        int int82 = dateTimeField32.getMaximumTextLength(locale76);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField21 and durationField46", (durationField21.compareTo(durationField46) == 0) == durationField21.equals(durationField46));
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test627");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology18 = zonedChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology12.millisOfSecond();
        org.joda.time.DurationField durationField21 = zonedChronology12.weeks();
        org.joda.time.DateTimeField dateTimeField22 = zonedChronology12.era();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology12.clockhourOfHalfday();
        org.joda.time.DurationField durationField24 = zonedChronology12.minutes();
        org.joda.time.DurationField durationField25 = zonedChronology12.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField24", (durationField6.compareTo(durationField24) == 0) == durationField6.equals(durationField24));
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test628");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DurationField durationField13 = zonedChronology12.weeks();
        org.joda.time.DateTimeField dateTimeField14 = zonedChronology12.year();
        org.joda.time.DurationField durationField15 = zonedChronology12.months();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str20 = dateTimeZone18.getShortName((long) 10);
        java.lang.String str21 = dateTimeZone18.getID();
        long long24 = dateTimeZone18.convertLocalToUTC((long) (short) 1, false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone18);
        int int27 = dateTimeZone18.getStandardOffset(1L);
        org.joda.time.chrono.ZonedChronology zonedChronology28 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) zonedChronology12, dateTimeZone18);
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology28.secondOfDay();
        org.joda.time.DateTimeField dateTimeField30 = zonedChronology28.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField31 = zonedChronology28.millisOfSecond();
        org.joda.time.DurationField durationField32 = zonedChronology28.months();
        org.joda.time.DurationField durationField33 = zonedChronology28.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField15 and durationField32", (durationField15.compareTo(durationField32) == 0) == durationField15.equals(durationField32));
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test629");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology18 = zonedChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology12.year();
        java.lang.String str21 = zonedChronology12.toString();
        org.joda.time.DurationField durationField22 = zonedChronology12.halfdays();
        org.joda.time.DurationField durationField23 = zonedChronology12.months();
        org.joda.time.DateTimeField dateTimeField24 = zonedChronology12.millisOfSecond();
        org.joda.time.DurationField durationField25 = zonedChronology12.days();
        org.joda.time.DurationField durationField26 = zonedChronology12.years();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField25", (durationField5.compareTo(durationField25) == 0) == durationField5.equals(durationField25));
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test630");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.DurationFieldType durationFieldType1 = dateTimeFieldType0.getRangeDurationType();
        org.joda.time.DurationFieldType durationFieldType2 = dateTimeFieldType0.getRangeDurationType();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime(dateTimeZone3);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.minusWeeks(0);
        org.joda.time.Chronology chronology7 = localDateTime6.getChronology();
        org.joda.time.DurationField durationField8 = chronology7.days();
        org.joda.time.DurationField durationField9 = chronology7.minutes();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str14 = dateTimeZone12.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology15 = org.joda.time.chrono.ZonedChronology.getInstance(chronology7, dateTimeZone12);
        org.joda.time.DateTimeField dateTimeField16 = zonedChronology15.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean20 = dateTimeZone18.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology21 = zonedChronology15.withZone(dateTimeZone18);
        org.joda.time.DateTimeField dateTimeField22 = zonedChronology15.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology15.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField24 = zonedChronology15.dayOfYear();
        org.joda.time.DurationField durationField25 = zonedChronology15.halfdays();
        boolean boolean26 = durationFieldType2.isSupported((org.joda.time.Chronology) zonedChronology15);
        org.joda.time.DateTimeField dateTimeField27 = zonedChronology15.clockhourOfHalfday();
        org.joda.time.DurationField durationField28 = zonedChronology15.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField28, durationField8, and durationField9", !(durationField28.compareTo(durationField8) == 0) || (Math.signum(durationField28.compareTo(durationField9)) == Math.signum(durationField8.compareTo(durationField9))));
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test631");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology1 = null;
        boolean boolean2 = dateTimeFieldType0.isSupported(chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime(dateTimeZone3);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.minusWeeks(0);
        org.joda.time.Chronology chronology7 = localDateTime6.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = dateTimeFieldType0.getField(chronology7);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str13 = dateTimeZone11.getShortName((long) 10);
        java.lang.String str14 = dateTimeZone11.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone11);
        org.joda.time.chrono.ZonedChronology zonedChronology16 = org.joda.time.chrono.ZonedChronology.getInstance(chronology7, dateTimeZone11);
        java.lang.String str18 = dateTimeZone11.getShortName(4518470650L);
        java.util.TimeZone timeZone19 = dateTimeZone11.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime(dateTimeZone20);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime(dateTimeZone22);
        int int24 = localDateTime21.compareTo((org.joda.time.ReadablePartial) localDateTime23);
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.DateTime dateTime26 = localDateTime21.toDateTime(readableInstant25);
        boolean boolean28 = dateTime26.equals((java.lang.Object) 'a');
        java.lang.String str29 = dateTime26.toString();
        int int30 = dateTimeZone11.getOffset((org.joda.time.ReadableInstant) dateTime26);
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str35 = dateTimeZone33.getShortName((long) 10);
        java.lang.String str36 = dateTimeZone33.getID();
        long long39 = dateTimeZone33.convertLocalToUTC((long) (short) 1, false);
        java.util.Locale.Builder builder41 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder43 = builder41.addUnicodeLocaleAttribute("eras");
        java.util.Locale locale44 = builder43.build();
        java.lang.String str45 = dateTimeZone33.getName((long) 749, locale44);
        java.util.TimeZone timeZone46 = dateTimeZone33.toTimeZone();
        long long49 = dateTimeZone33.adjustOffset((long) 61677168, false);
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.LocalDateTime localDateTime51 = new org.joda.time.LocalDateTime(dateTimeZone50);
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.LocalDateTime localDateTime53 = new org.joda.time.LocalDateTime(dateTimeZone52);
        int int54 = localDateTime51.compareTo((org.joda.time.ReadablePartial) localDateTime53);
        org.joda.time.ReadableInstant readableInstant55 = null;
        org.joda.time.DateTime dateTime56 = localDateTime51.toDateTime(readableInstant55);
        org.joda.time.DateTimeZone dateTimeZone57 = null;
        org.joda.time.LocalDateTime localDateTime58 = new org.joda.time.LocalDateTime(dateTimeZone57);
        org.joda.time.LocalDateTime.Property property59 = localDateTime58.yearOfEra();
        int int60 = property59.getMinimumValue();
        boolean boolean61 = dateTime56.equals((java.lang.Object) int60);
        org.joda.time.DurationFieldType durationFieldType62 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTimeFieldType dateTimeFieldType63 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology64 = null;
        boolean boolean65 = dateTimeFieldType63.isSupported(chronology64);
        org.joda.time.DateTimeZone dateTimeZone66 = null;
        org.joda.time.LocalDateTime localDateTime67 = new org.joda.time.LocalDateTime(dateTimeZone66);
        org.joda.time.LocalDateTime localDateTime69 = localDateTime67.minusWeeks(0);
        org.joda.time.Chronology chronology70 = localDateTime69.getChronology();
        org.joda.time.DateTimeField dateTimeField71 = dateTimeFieldType63.getField(chronology70);
        org.joda.time.DurationField durationField72 = durationFieldType62.getField(chronology70);
        boolean boolean73 = dateTime56.equals((java.lang.Object) chronology70);
        int int74 = dateTimeZone33.getOffset((org.joda.time.ReadableInstant) dateTime56);
        int int75 = dateTime26.compareTo((org.joda.time.ReadableInstant) dateTime56);
        org.joda.time.DateTimeZone dateTimeZone76 = null;
        org.joda.time.LocalDateTime localDateTime77 = new org.joda.time.LocalDateTime(dateTimeZone76);
        org.joda.time.DateTimeZone dateTimeZone78 = null;
        org.joda.time.LocalDateTime localDateTime79 = new org.joda.time.LocalDateTime(dateTimeZone78);
        int int80 = localDateTime77.compareTo((org.joda.time.ReadablePartial) localDateTime79);
        org.joda.time.ReadableInstant readableInstant81 = null;
        org.joda.time.DateTime dateTime82 = localDateTime77.toDateTime(readableInstant81);
        org.joda.time.Chronology chronology83 = dateTime82.getChronology();
        boolean boolean84 = dateTime26.isAfter((org.joda.time.ReadableInstant) dateTime82);
        org.joda.time.Instant instant85 = dateTime82.toInstant();
        org.joda.time.DateTimeZone dateTimeZone86 = dateTime82.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime26 and instant85", (dateTime26.compareTo(instant85) == 0) == dateTime26.equals(instant85));
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test632");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DurationField durationField13 = zonedChronology12.weeks();
        org.joda.time.DateTimeField dateTimeField14 = zonedChronology12.year();
        org.joda.time.DurationField durationField15 = zonedChronology12.months();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str20 = dateTimeZone18.getShortName((long) 10);
        java.lang.String str21 = dateTimeZone18.getID();
        long long24 = dateTimeZone18.convertLocalToUTC((long) (short) 1, false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone18);
        int int27 = dateTimeZone18.getStandardOffset(1L);
        org.joda.time.chrono.ZonedChronology zonedChronology28 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) zonedChronology12, dateTimeZone18);
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology12.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField30 = zonedChronology12.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField31 = zonedChronology12.yearOfCentury();
        org.joda.time.DurationField durationField32 = zonedChronology12.days();
        org.joda.time.DurationField durationField33 = zonedChronology12.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField32", (durationField5.compareTo(durationField32) == 0) == durationField5.equals(durationField32));
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test633");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology18 = zonedChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.minuteOfHour();
        org.joda.time.Chronology chronology20 = zonedChronology12.withUTC();
        org.joda.time.DurationField durationField21 = zonedChronology12.years();
        org.joda.time.DateTimeField dateTimeField22 = zonedChronology12.minuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime(dateTimeZone23);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime24.minusWeeks(0);
        int int27 = localDateTime26.getYearOfCentury();
        org.joda.time.LocalDateTime localDateTime29 = localDateTime26.withMillisOfSecond((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime29.minusHours((int) '#');
        int[] intArray33 = zonedChronology12.get((org.joda.time.ReadablePartial) localDateTime29, (long) 2022);
        org.joda.time.LocalDateTime.Property property34 = localDateTime29.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime36 = localDateTime29.minusSeconds((-292275054));
        org.joda.time.DateTime dateTime37 = localDateTime29.toDateTime();
        org.joda.time.LocalDateTime.Property property38 = localDateTime29.monthOfYear();
        int int39 = localDateTime29.getDayOfYear();
        org.joda.time.LocalDateTime localDateTime41 = new org.joda.time.LocalDateTime((long) (byte) -1);
        org.joda.time.LocalDateTime localDateTime43 = localDateTime41.plusMinutes(0);
        org.joda.time.LocalDateTime.Property property44 = localDateTime41.hourOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType45 = org.joda.time.DateTimeFieldType.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.LocalDateTime localDateTime47 = new org.joda.time.LocalDateTime(dateTimeZone46);
        org.joda.time.LocalDateTime localDateTime49 = localDateTime47.minusWeeks(0);
        org.joda.time.Chronology chronology50 = localDateTime49.getChronology();
        org.joda.time.DurationField durationField51 = chronology50.days();
        org.joda.time.DurationField durationField52 = chronology50.minutes();
        org.joda.time.DateTimeZone dateTimeZone55 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str57 = dateTimeZone55.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology58 = org.joda.time.chrono.ZonedChronology.getInstance(chronology50, dateTimeZone55);
        org.joda.time.DurationField durationField59 = zonedChronology58.weeks();
        org.joda.time.DateTimeField dateTimeField60 = zonedChronology58.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField61 = zonedChronology58.dayOfWeek();
        org.joda.time.ReadablePeriod readablePeriod62 = null;
        long long65 = zonedChronology58.add(readablePeriod62, 0L, 2);
        org.joda.time.DateTimeField dateTimeField66 = zonedChronology58.weekyearOfCentury();
        org.joda.time.DurationField durationField67 = zonedChronology58.hours();
        org.joda.time.DurationField durationField68 = zonedChronology58.centuries();
        boolean boolean69 = dateTimeFieldType45.isSupported((org.joda.time.Chronology) zonedChronology58);
        boolean boolean70 = localDateTime41.isSupported(dateTimeFieldType45);
        boolean boolean71 = localDateTime29.isSupported(dateTimeFieldType45);
        org.joda.time.DateTimeZone dateTimeZone72 = null;
        org.joda.time.LocalDateTime localDateTime73 = new org.joda.time.LocalDateTime(dateTimeZone72);
        org.joda.time.LocalDateTime localDateTime75 = localDateTime73.minusWeeks(0);
        org.joda.time.Chronology chronology76 = localDateTime75.getChronology();
        org.joda.time.DurationField durationField77 = chronology76.days();
        org.joda.time.DurationField durationField78 = chronology76.minutes();
        org.joda.time.DateTimeZone dateTimeZone81 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str83 = dateTimeZone81.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology84 = org.joda.time.chrono.ZonedChronology.getInstance(chronology76, dateTimeZone81);
        org.joda.time.DateTimeField dateTimeField85 = zonedChronology84.monthOfYear();
        org.joda.time.DurationField durationField86 = zonedChronology84.hours();
        org.joda.time.DateTimeField dateTimeField87 = zonedChronology84.year();
        boolean boolean88 = dateTimeFieldType45.isSupported((org.joda.time.Chronology) zonedChronology84);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField67 and durationField86", (durationField67.compareTo(durationField86) == 0) == durationField67.equals(durationField86));
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test634");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DurationField durationField13 = zonedChronology12.weeks();
        org.joda.time.DateTimeField dateTimeField14 = zonedChronology12.year();
        org.joda.time.DurationField durationField15 = zonedChronology12.months();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str20 = dateTimeZone18.getShortName((long) 10);
        java.lang.String str21 = dateTimeZone18.getID();
        long long24 = dateTimeZone18.convertLocalToUTC((long) (short) 1, false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone18);
        int int27 = dateTimeZone18.getStandardOffset(1L);
        org.joda.time.chrono.ZonedChronology zonedChronology28 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) zonedChronology12, dateTimeZone18);
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology12.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField30 = zonedChronology12.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField31 = zonedChronology12.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField32 = zonedChronology12.monthOfYear();
        org.joda.time.DurationField durationField33 = zonedChronology12.days();
        org.joda.time.DateTimeField dateTimeField34 = zonedChronology12.yearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField33", (durationField5.compareTo(durationField33) == 0) == durationField5.equals(durationField33));
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test635");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfSecond();
        java.lang.String str1 = dateTimeFieldType0.getName();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime(dateTimeZone2);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.minusWeeks(0);
        org.joda.time.Chronology chronology6 = localDateTime5.getChronology();
        org.joda.time.DurationField durationField7 = chronology6.days();
        org.joda.time.DurationField durationField8 = chronology6.minutes();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str13 = dateTimeZone11.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology14 = org.joda.time.chrono.ZonedChronology.getInstance(chronology6, dateTimeZone11);
        org.joda.time.DurationField durationField15 = zonedChronology14.weeks();
        org.joda.time.DateTimeField dateTimeField16 = zonedChronology14.year();
        org.joda.time.DurationField durationField17 = zonedChronology14.months();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str22 = dateTimeZone20.getShortName((long) 10);
        java.lang.String str23 = dateTimeZone20.getID();
        long long26 = dateTimeZone20.convertLocalToUTC((long) (short) 1, false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone20);
        int int29 = dateTimeZone20.getStandardOffset(1L);
        org.joda.time.chrono.ZonedChronology zonedChronology30 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) zonedChronology14, dateTimeZone20);
        org.joda.time.DateTimeField dateTimeField31 = zonedChronology14.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField32 = zonedChronology14.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField33 = zonedChronology14.weekyear();
        boolean boolean34 = dateTimeFieldType0.isSupported((org.joda.time.Chronology) zonedChronology14);
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime((org.joda.time.Chronology) zonedChronology14);
        org.joda.time.DurationFieldType durationFieldType36 = org.joda.time.DurationFieldType.minutes();
        java.lang.String str37 = durationFieldType36.toString();
        java.lang.String str38 = durationFieldType36.toString();
        org.joda.time.LocalDateTime localDateTime40 = localDateTime35.withFieldAdded(durationFieldType36, 20);
        java.lang.String str41 = durationFieldType36.toString();
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.LocalDateTime localDateTime43 = new org.joda.time.LocalDateTime(dateTimeZone42);
        org.joda.time.LocalDateTime localDateTime45 = localDateTime43.minusWeeks(0);
        org.joda.time.Chronology chronology46 = localDateTime45.getChronology();
        org.joda.time.DurationField durationField47 = chronology46.days();
        org.joda.time.DurationField durationField48 = chronology46.minutes();
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str53 = dateTimeZone51.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology54 = org.joda.time.chrono.ZonedChronology.getInstance(chronology46, dateTimeZone51);
        org.joda.time.DurationField durationField55 = zonedChronology54.weeks();
        org.joda.time.DateTimeField dateTimeField56 = zonedChronology54.year();
        org.joda.time.DurationField durationField57 = zonedChronology54.months();
        org.joda.time.DateTimeZone dateTimeZone60 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str62 = dateTimeZone60.getShortName((long) 10);
        java.lang.String str63 = dateTimeZone60.getID();
        long long66 = dateTimeZone60.convertLocalToUTC((long) (short) 1, false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone60);
        int int69 = dateTimeZone60.getStandardOffset(1L);
        org.joda.time.chrono.ZonedChronology zonedChronology70 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) zonedChronology54, dateTimeZone60);
        org.joda.time.DateTimeField dateTimeField71 = zonedChronology54.millisOfDay();
        boolean boolean72 = durationFieldType36.isSupported((org.joda.time.Chronology) zonedChronology54);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField15 and durationField55", (durationField15.compareTo(durationField55) == 0) == durationField15.equals(durationField55));
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test636");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology18 = zonedChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.dayOfMonth();
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        long long23 = zonedChronology12.add(readablePeriod20, (long) 53, (int) (byte) 0);
        long long27 = zonedChronology12.add(1645427275536L, 0L, 8);
        org.joda.time.Chronology chronology28 = zonedChronology12.withUTC();
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology12.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField30 = zonedChronology12.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField31 = zonedChronology12.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField32 = zonedChronology12.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField33 = zonedChronology12.clockhourOfDay();
        org.joda.time.DurationField durationField34 = zonedChronology12.minutes();
        org.joda.time.LocalDateTime localDateTime36 = new org.joda.time.LocalDateTime(1645427457459L);
        org.joda.time.LocalDateTime.Property property37 = localDateTime36.monthOfYear();
        long long39 = zonedChronology12.set((org.joda.time.ReadablePartial) localDateTime36, 259200109L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField34", (durationField6.compareTo(durationField34) == 0) == durationField6.equals(durationField34));
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test637");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        boolean boolean14 = zonedChronology12.equals((java.lang.Object) "292278993-02-22T07:07:50.878");
        org.joda.time.LocalDateTime localDateTime15 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) zonedChronology12);
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.year();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime15.plusWeeks((int) 'a');
        org.joda.time.LocalDateTime.Property property19 = localDateTime15.weekOfWeekyear();
        java.lang.String str20 = property19.getAsText();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime(dateTimeZone21);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime(dateTimeZone23);
        int int25 = localDateTime22.compareTo((org.joda.time.ReadablePartial) localDateTime24);
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.DateTime dateTime27 = localDateTime22.toDateTime(readableInstant26);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime(dateTimeZone28);
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime(dateTimeZone30);
        int int32 = localDateTime29.compareTo((org.joda.time.ReadablePartial) localDateTime31);
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime();
        boolean boolean34 = localDateTime29.isEqual((org.joda.time.ReadablePartial) localDateTime33);
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.LocalDateTime localDateTime36 = new org.joda.time.LocalDateTime(dateTimeZone35);
        org.joda.time.LocalDateTime localDateTime38 = localDateTime36.minusWeeks(0);
        int int39 = localDateTime33.compareTo((org.joda.time.ReadablePartial) localDateTime36);
        org.joda.time.LocalDateTime localDateTime40 = localDateTime22.withFields((org.joda.time.ReadablePartial) localDateTime33);
        org.joda.time.LocalDateTime.Property property41 = localDateTime33.year();
        java.util.Locale locale44 = new java.util.Locale("", "\uce90\ub098\ub2e4");
        int int45 = property41.getMaximumShortTextLength(locale44);
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.LocalDateTime localDateTime47 = new org.joda.time.LocalDateTime(dateTimeZone46);
        org.joda.time.DateTimeZone dateTimeZone48 = null;
        org.joda.time.LocalDateTime localDateTime49 = new org.joda.time.LocalDateTime(dateTimeZone48);
        int int50 = localDateTime47.compareTo((org.joda.time.ReadablePartial) localDateTime49);
        org.joda.time.ReadableInstant readableInstant51 = null;
        org.joda.time.DateTime dateTime52 = localDateTime47.toDateTime(readableInstant51);
        org.joda.time.DateTimeZone dateTimeZone53 = null;
        org.joda.time.LocalDateTime localDateTime54 = new org.joda.time.LocalDateTime(dateTimeZone53);
        org.joda.time.LocalDateTime.Property property55 = localDateTime54.yearOfEra();
        int int56 = property55.getMinimumValue();
        boolean boolean57 = dateTime52.equals((java.lang.Object) int56);
        int int58 = property41.compareTo((org.joda.time.ReadableInstant) dateTime52);
        org.joda.time.Instant instant59 = dateTime52.toInstant();
        org.joda.time.DateTimeZone dateTimeZone60 = null;
        org.joda.time.LocalDateTime localDateTime61 = new org.joda.time.LocalDateTime(dateTimeZone60);
        org.joda.time.LocalDateTime localDateTime63 = localDateTime61.minusWeeks(0);
        org.joda.time.Chronology chronology64 = localDateTime63.getChronology();
        org.joda.time.LocalDateTime localDateTime66 = localDateTime63.withYear((int) (short) 100);
        org.joda.time.LocalDateTime.Property property67 = localDateTime66.year();
        org.joda.time.ReadableInstant readableInstant68 = null;
        org.joda.time.DateTime dateTime69 = localDateTime66.toDateTime(readableInstant68);
        boolean boolean70 = instant59.isEqual((org.joda.time.ReadableInstant) dateTime69);
        int int71 = property19.getDifference((org.joda.time.ReadableInstant) instant59);
        org.joda.time.DateTimeZone dateTimeZone72 = instant59.getZone();
        long long74 = dateTimeZone72.nextTransition(1947914997840001709L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime52 and instant59", (dateTime52.compareTo(instant59) == 0) == dateTime52.equals(instant59));
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test638");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        java.lang.String str2 = dateTime1.toString();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        int int6 = dateTimeZone4.getOffsetFromLocal(4518471413L);
        boolean boolean8 = dateTimeZone4.isStandardOffset((long) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (short) 0);
        boolean boolean13 = dateTimeZone11.isStandardOffset((long) 61673414);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology15 = null;
        boolean boolean16 = dateTimeFieldType14.isSupported(chronology15);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime(dateTimeZone17);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.minusWeeks(0);
        org.joda.time.Chronology chronology21 = localDateTime20.getChronology();
        org.joda.time.DateTimeField dateTimeField22 = dateTimeFieldType14.getField(chronology21);
        java.lang.String str23 = dateTimeField22.getName();
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime(dateTimeZone24);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime25.minusWeeks(0);
        org.joda.time.Chronology chronology28 = localDateTime27.getChronology();
        java.util.Locale locale30 = java.util.Locale.JAPANESE;
        java.lang.String str31 = locale30.getDisplayLanguage();
        java.lang.String str32 = locale30.getISO3Country();
        java.lang.String str33 = dateTimeField22.getAsShortText((org.joda.time.ReadablePartial) localDateTime27, 2, locale30);
        int int35 = dateTimeField22.getMaximumValue(0L);
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology37 = null;
        boolean boolean38 = dateTimeFieldType36.isSupported(chronology37);
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.LocalDateTime localDateTime40 = new org.joda.time.LocalDateTime(dateTimeZone39);
        org.joda.time.LocalDateTime localDateTime42 = localDateTime40.minusWeeks(0);
        org.joda.time.Chronology chronology43 = localDateTime42.getChronology();
        org.joda.time.DateTimeField dateTimeField44 = dateTimeFieldType36.getField(chronology43);
        java.lang.String str45 = dateTimeField44.getName();
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.LocalDateTime localDateTime47 = new org.joda.time.LocalDateTime(dateTimeZone46);
        org.joda.time.LocalDateTime localDateTime49 = localDateTime47.minusWeeks(0);
        org.joda.time.Chronology chronology50 = localDateTime49.getChronology();
        java.util.Locale locale52 = java.util.Locale.JAPANESE;
        java.lang.String str53 = locale52.getDisplayLanguage();
        java.lang.String str54 = locale52.getISO3Country();
        java.lang.String str55 = dateTimeField44.getAsShortText((org.joda.time.ReadablePartial) localDateTime49, 2, locale52);
        org.joda.time.LocalDateTime localDateTime57 = localDateTime49.minusDays((int) (byte) 1);
        org.joda.time.ReadableDuration readableDuration58 = null;
        org.joda.time.LocalDateTime localDateTime59 = localDateTime57.plus(readableDuration58);
        int[] intArray64 = new int[] { 0, 292278993, 10, 'a' };
        int int65 = dateTimeField22.getMinimumValue((org.joda.time.ReadablePartial) localDateTime59, intArray64);
        org.joda.time.DateTimeZone dateTimeZone66 = null;
        org.joda.time.LocalDateTime localDateTime67 = new org.joda.time.LocalDateTime(dateTimeZone66);
        org.joda.time.DateTimeZone dateTimeZone68 = null;
        org.joda.time.LocalDateTime localDateTime69 = new org.joda.time.LocalDateTime(dateTimeZone68);
        int int70 = localDateTime67.compareTo((org.joda.time.ReadablePartial) localDateTime69);
        org.joda.time.ReadableInstant readableInstant71 = null;
        org.joda.time.DateTime dateTime72 = localDateTime67.toDateTime(readableInstant71);
        boolean boolean74 = dateTime72.equals((java.lang.Object) 'a');
        org.joda.time.DateTime dateTime75 = localDateTime59.toDateTime((org.joda.time.ReadableInstant) dateTime72);
        int int76 = dateTimeZone11.getOffset((org.joda.time.ReadableInstant) dateTime72);
        int int77 = dateTimeZone4.getOffset((org.joda.time.ReadableInstant) dateTime72);
        org.joda.time.Instant instant78 = dateTime72.toInstant();
        boolean boolean79 = dateTime1.isEqual((org.joda.time.ReadableInstant) dateTime72);
        org.joda.time.Instant instant80 = dateTime72.toInstant();
        org.joda.time.Chronology chronology81 = dateTime72.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant78", (dateTime1.compareTo(instant78) == 0) == dateTime1.equals(instant78));
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test639");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        boolean boolean14 = zonedChronology12.equals((java.lang.Object) "292278993-02-22T07:07:50.878");
        org.joda.time.LocalDateTime localDateTime15 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) zonedChronology12);
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.year();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime15.withDate(292278993, (int) (byte) 1, (int) (byte) 1);
        int int21 = localDateTime20.getMonthOfYear();
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        org.joda.time.LocalDateTime localDateTime23 = localDateTime20.minus(readablePeriod22);
        int int24 = localDateTime23.getMinuteOfHour();
        org.joda.time.LocalDateTime.Property property25 = localDateTime23.secondOfMinute();
        int int26 = localDateTime23.size();
        org.joda.time.LocalDateTime.Property property27 = localDateTime23.era();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        int int31 = dateTimeZone29.getOffsetFromLocal(4518471413L);
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime(dateTimeZone29);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime32.withYear((int) ' ');
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property36 = localDateTime35.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime38 = property36.addToCopy((long) (short) 0);
        org.joda.time.LocalDateTime localDateTime40 = localDateTime38.minusSeconds(0);
        int int41 = localDateTime34.compareTo((org.joda.time.ReadablePartial) localDateTime38);
        org.joda.time.Chronology chronology42 = localDateTime38.getChronology();
        org.joda.time.DurationField durationField43 = chronology42.eras();
        org.joda.time.DurationFieldType durationFieldType44 = durationField43.getType();
        boolean boolean45 = localDateTime23.isSupported(durationFieldType44);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField5 and durationField43", Math.signum(durationField5.compareTo(durationField43)) == -Math.signum(durationField43.compareTo(durationField5)));
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test640");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (byte) -1);
        int int2 = localDateTime1.getEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.monthOfYear();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.era();
        org.joda.time.LocalDateTime.Property property5 = localDateTime1.era();
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.plus(readableDuration6);
        org.joda.time.DurationFieldType durationFieldType8 = org.joda.time.DurationFieldType.days();
        java.lang.String str9 = durationFieldType8.toString();
        java.lang.String str10 = durationFieldType8.getName();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(dateTimeZone11);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.minusWeeks(0);
        org.joda.time.Chronology chronology15 = localDateTime14.getChronology();
        org.joda.time.DurationField durationField16 = chronology15.days();
        org.joda.time.DurationField durationField17 = chronology15.minutes();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str22 = dateTimeZone20.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology23 = org.joda.time.chrono.ZonedChronology.getInstance(chronology15, dateTimeZone20);
        org.joda.time.DateTimeField dateTimeField24 = zonedChronology23.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean28 = dateTimeZone26.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology29 = zonedChronology23.withZone(dateTimeZone26);
        org.joda.time.DateTimeField dateTimeField30 = zonedChronology23.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField31 = zonedChronology23.year();
        org.joda.time.DateTimeField dateTimeField32 = zonedChronology23.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField33 = zonedChronology23.hourOfDay();
        org.joda.time.DateTimeField dateTimeField34 = zonedChronology23.minuteOfDay();
        org.joda.time.DurationField durationField35 = zonedChronology23.years();
        org.joda.time.DateTimeField dateTimeField36 = zonedChronology23.hourOfHalfday();
        org.joda.time.DurationField durationField37 = durationFieldType8.getField((org.joda.time.Chronology) zonedChronology23);
        boolean boolean38 = localDateTime1.isSupported(durationFieldType8);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField16 and durationField37", (durationField16.compareTo(durationField37) == 0) == durationField16.equals(durationField37));
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test641");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology18 = zonedChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology12.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        org.joda.time.Chronology chronology24 = zonedChronology12.withZone(dateTimeZone23);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime(dateTimeZone26);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.minusWeeks(0);
        org.joda.time.Chronology chronology30 = localDateTime29.getChronology();
        org.joda.time.DurationField durationField31 = chronology30.days();
        org.joda.time.DurationField durationField32 = chronology30.minutes();
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str37 = dateTimeZone35.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology38 = org.joda.time.chrono.ZonedChronology.getInstance(chronology30, dateTimeZone35);
        org.joda.time.DateTimeField dateTimeField39 = zonedChronology38.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean43 = dateTimeZone41.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology44 = zonedChronology38.withZone(dateTimeZone41);
        org.joda.time.DateTimeField dateTimeField45 = zonedChronology38.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField46 = zonedChronology38.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField47 = zonedChronology38.weekyear();
        org.joda.time.DurationField durationField48 = zonedChronology38.years();
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (short) 0);
        boolean boolean53 = dateTimeZone51.isStandardOffset((long) 61673414);
        org.joda.time.Chronology chronology54 = zonedChronology38.withZone(dateTimeZone51);
        org.joda.time.LocalDateTime localDateTime55 = new org.joda.time.LocalDateTime((long) 12, (org.joda.time.Chronology) zonedChronology38);
        org.joda.time.DateTimeField dateTimeField56 = zonedChronology38.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField57 = zonedChronology38.yearOfEra();
        boolean boolean58 = dateTimeZone23.equals((java.lang.Object) zonedChronology38);
        org.joda.time.DurationField durationField59 = zonedChronology38.weekyears();
        org.joda.time.DateTimeField dateTimeField60 = zonedChronology38.year();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField48 and durationField59", (durationField48.compareTo(durationField59) == 0) == durationField48.equals(durationField59));
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test642");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DurationField durationField13 = zonedChronology12.weeks();
        org.joda.time.DateTimeField dateTimeField14 = zonedChronology12.year();
        org.joda.time.DateTimeZone dateTimeZone15 = zonedChronology12.getZone();
        org.joda.time.DateTimeField dateTimeField16 = zonedChronology12.millisOfSecond();
        org.joda.time.DurationField durationField17 = zonedChronology12.hours();
        org.joda.time.DurationField durationField18 = zonedChronology12.centuries();
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeField dateTimeField21 = zonedChronology12.weekyear();
        org.joda.time.DurationField durationField22 = zonedChronology12.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField22, durationField5, and durationField6", !(durationField22.compareTo(durationField5) == 0) || (Math.signum(durationField22.compareTo(durationField6)) == Math.signum(durationField5.compareTo(durationField6))));
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test643");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.yearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.monthOfYear();
        java.util.Locale locale4 = java.util.Locale.KOREAN;
        java.util.Set<java.lang.Character> charSet5 = locale4.getExtensionKeys();
        java.lang.Object[] objArray6 = charSet5.toArray();
        java.util.Locale locale7 = java.util.Locale.KOREAN;
        java.util.Set<java.lang.Character> charSet8 = locale7.getExtensionKeys();
        boolean boolean9 = charSet5.retainAll((java.util.Collection<java.lang.Character>) charSet8);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime(dateTimeZone12);
        int int14 = localDateTime11.compareTo((org.joda.time.ReadablePartial) localDateTime13);
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.DateTime dateTime16 = localDateTime11.toDateTime(readableInstant15);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime11.minusWeeks((int) (short) 1);
        boolean boolean19 = charSet5.remove((java.lang.Object) localDateTime18);
        boolean boolean20 = localDateTime1.isEqual((org.joda.time.ReadablePartial) localDateTime18);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime18.withMillisOfDay(99);
        java.lang.String str23 = localDateTime22.toString();
        org.joda.time.ReadableDuration readableDuration24 = null;
        org.joda.time.LocalDateTime localDateTime25 = localDateTime22.minus(readableDuration24);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime(dateTimeZone26);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.minusWeeks(0);
        org.joda.time.Chronology chronology30 = localDateTime29.getChronology();
        org.joda.time.DurationField durationField31 = chronology30.days();
        org.joda.time.DurationField durationField32 = chronology30.minutes();
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str37 = dateTimeZone35.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology38 = org.joda.time.chrono.ZonedChronology.getInstance(chronology30, dateTimeZone35);
        org.joda.time.DateTimeField dateTimeField39 = zonedChronology38.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean43 = dateTimeZone41.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology44 = zonedChronology38.withZone(dateTimeZone41);
        org.joda.time.DateTimeField dateTimeField45 = zonedChronology38.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField46 = zonedChronology38.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField47 = zonedChronology38.weekyear();
        org.joda.time.DurationField durationField48 = zonedChronology38.years();
        org.joda.time.DateTimeField dateTimeField49 = zonedChronology38.halfdayOfDay();
        org.joda.time.DurationField durationField50 = zonedChronology38.minutes();
        long long53 = durationField50.subtract(0L, 1645426367627L);
        org.joda.time.DurationFieldType durationFieldType54 = durationField50.getType();
        boolean boolean55 = localDateTime25.equals((java.lang.Object) durationField50);
        org.joda.time.LocalDateTime localDateTime57 = localDateTime25.minusDays(2022);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField32 and durationField50", (durationField32.compareTo(durationField50) == 0) == durationField32.equals(durationField50));
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test644");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime(dateTimeZone2);
        int int4 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime3);
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime();
        boolean boolean6 = localDateTime1.isEqual((org.joda.time.ReadablePartial) localDateTime5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(dateTimeZone7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.minusWeeks(0);
        int int11 = localDateTime5.compareTo((org.joda.time.ReadablePartial) localDateTime8);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime5.minusSeconds((int) '4');
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.centuryOfEra();
        java.lang.String str15 = property14.getName();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(dateTimeZone16);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime(dateTimeZone18);
        int int20 = localDateTime17.compareTo((org.joda.time.ReadablePartial) localDateTime19);
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime();
        boolean boolean22 = localDateTime17.isEqual((org.joda.time.ReadablePartial) localDateTime21);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime21.plusYears((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime(dateTimeZone25);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime26.minusWeeks(0);
        org.joda.time.Chronology chronology29 = localDateTime28.getChronology();
        org.joda.time.DurationField durationField30 = chronology29.days();
        org.joda.time.DurationField durationField31 = chronology29.minutes();
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str36 = dateTimeZone34.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology37 = org.joda.time.chrono.ZonedChronology.getInstance(chronology29, dateTimeZone34);
        org.joda.time.DurationField durationField38 = zonedChronology37.weeks();
        org.joda.time.DateTimeField dateTimeField39 = zonedChronology37.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField40 = zonedChronology37.dayOfWeek();
        org.joda.time.ReadablePeriod readablePeriod41 = null;
        long long44 = zonedChronology37.add(readablePeriod41, 0L, 2);
        org.joda.time.DateTimeField dateTimeField45 = zonedChronology37.weekyearOfCentury();
        java.lang.String str46 = zonedChronology37.toString();
        org.joda.time.LocalDateTime localDateTime47 = new org.joda.time.LocalDateTime((org.joda.time.Chronology) zonedChronology37);
        org.joda.time.DateTime dateTime48 = localDateTime47.toDateTime();
        org.joda.time.Instant instant49 = dateTime48.toInstant();
        org.joda.time.DateTime dateTime50 = localDateTime21.toDateTime((org.joda.time.ReadableInstant) dateTime48);
        int int51 = property14.compareTo((org.joda.time.ReadableInstant) dateTime48);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant49 and dateTime50", (instant49.compareTo(dateTime50) == 0) == instant49.equals(dateTime50));
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test645");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minusWeeks(0);
        org.joda.time.Chronology chronology5 = localDateTime4.getChronology();
        org.joda.time.DurationField durationField6 = chronology5.days();
        org.joda.time.DurationField durationField7 = chronology5.minutes();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str12 = dateTimeZone10.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology13 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone10);
        org.joda.time.DateTimeField dateTimeField14 = zonedChronology13.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean18 = dateTimeZone16.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology19 = zonedChronology13.withZone(dateTimeZone16);
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology13.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField21 = zonedChronology13.hourOfHalfday();
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime((long) 131, (org.joda.time.Chronology) zonedChronology13);
        org.joda.time.DurationField durationField23 = zonedChronology13.seconds();
        org.joda.time.DurationField durationField24 = zonedChronology13.minutes();
        org.joda.time.DateTimeField dateTimeField25 = zonedChronology13.hourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField7 and durationField24", (durationField7.compareTo(durationField24) == 0) == durationField7.equals(durationField24));
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test646");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minusWeeks(0);
        org.joda.time.Chronology chronology5 = localDateTime4.getChronology();
        org.joda.time.DurationField durationField6 = chronology5.days();
        org.joda.time.DurationField durationField7 = chronology5.minutes();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str12 = dateTimeZone10.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology13 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone10);
        org.joda.time.DurationField durationField14 = zonedChronology13.weeks();
        org.joda.time.DateTimeField dateTimeField15 = zonedChronology13.yearOfEra();
        org.joda.time.DurationField durationField16 = zonedChronology13.weekyears();
        org.joda.time.DurationField durationField17 = zonedChronology13.weekyears();
        org.joda.time.DurationField durationField18 = zonedChronology13.months();
        boolean boolean20 = zonedChronology13.equals((java.lang.Object) "\u897f\u66a6");
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        long long24 = zonedChronology13.add(readablePeriod21, 1645427275L, 852);
        org.joda.time.DurationField durationField25 = durationFieldType0.getField((org.joda.time.Chronology) zonedChronology13);
        org.joda.time.DurationField durationField26 = zonedChronology13.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField26, durationField6, and durationField7", !(durationField26.compareTo(durationField6) == 0) || (Math.signum(durationField26.compareTo(durationField7)) == Math.signum(durationField6.compareTo(durationField7))));
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test647");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology18 = zonedChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.minuteOfHour();
        org.joda.time.Chronology chronology20 = zonedChronology12.withUTC();
        org.joda.time.DurationField durationField21 = zonedChronology12.years();
        org.joda.time.DurationField durationField22 = zonedChronology12.seconds();
        org.joda.time.DurationField durationField23 = zonedChronology12.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField23, durationField5, and durationField6", !(durationField23.compareTo(durationField5) == 0) || (Math.signum(durationField23.compareTo(durationField6)) == Math.signum(durationField5.compareTo(durationField6))));
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test648");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DurationField durationField13 = zonedChronology12.weeks();
        org.joda.time.DateTimeField dateTimeField14 = zonedChronology12.year();
        org.joda.time.DateTimeZone dateTimeZone15 = zonedChronology12.getZone();
        org.joda.time.DateTimeField dateTimeField16 = zonedChronology12.year();
        org.joda.time.DateTimeField dateTimeField17 = zonedChronology12.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField18 = zonedChronology12.minuteOfHour();
        org.joda.time.DurationField durationField19 = zonedChronology12.seconds();
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        long long23 = zonedChronology12.add(readablePeriod20, 1876077118L, (-7));
        org.joda.time.DurationField durationField24 = zonedChronology12.minutes();
        org.joda.time.DurationField durationField25 = zonedChronology12.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField24", (durationField6.compareTo(durationField24) == 0) == durationField6.equals(durationField24));
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test649");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DurationField durationField13 = zonedChronology12.weeks();
        org.joda.time.DateTimeField dateTimeField14 = zonedChronology12.year();
        org.joda.time.DurationField durationField15 = zonedChronology12.months();
        org.joda.time.DateTimeField dateTimeField16 = zonedChronology12.hourOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = dateTimeField16.getType();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime(dateTimeZone18);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.minusWeeks(0);
        org.joda.time.Chronology chronology22 = localDateTime21.getChronology();
        org.joda.time.DurationField durationField23 = chronology22.days();
        org.joda.time.DurationField durationField24 = chronology22.minutes();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str29 = dateTimeZone27.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology30 = org.joda.time.chrono.ZonedChronology.getInstance(chronology22, dateTimeZone27);
        org.joda.time.DurationField durationField31 = zonedChronology30.weeks();
        org.joda.time.DateTimeField dateTimeField32 = zonedChronology30.year();
        org.joda.time.DateTimeZone dateTimeZone33 = zonedChronology30.getZone();
        org.joda.time.DateTimeField dateTimeField34 = zonedChronology30.year();
        java.lang.String str35 = zonedChronology30.toString();
        org.joda.time.DurationField durationField36 = zonedChronology30.months();
        org.joda.time.DurationField durationField37 = zonedChronology30.weekyears();
        org.joda.time.DateTimeField dateTimeField38 = zonedChronology30.hourOfHalfday();
        boolean boolean39 = dateTimeFieldType17.isSupported((org.joda.time.Chronology) zonedChronology30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField13 and durationField31", (durationField13.compareTo(durationField31) == 0) == durationField13.equals(durationField31));
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test650");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology18 = zonedChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology12.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField21 = zonedChronology12.weekyear();
        org.joda.time.DurationField durationField22 = zonedChronology12.years();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology12.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone24 = zonedChronology12.getZone();
        org.joda.time.DurationField durationField25 = zonedChronology12.millis();
        org.joda.time.DurationField durationField26 = zonedChronology12.weekyears();
        java.lang.String str27 = zonedChronology12.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField22 and durationField26", (durationField22.compareTo(durationField26) == 0) == durationField22.equals(durationField26));
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test651");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minusWeeks(0);
        org.joda.time.Chronology chronology5 = localDateTime4.getChronology();
        org.joda.time.DurationField durationField6 = chronology5.days();
        org.joda.time.DurationField durationField7 = chronology5.minutes();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str12 = dateTimeZone10.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology13 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone10);
        org.joda.time.DateTimeField dateTimeField14 = zonedChronology13.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean18 = dateTimeZone16.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology19 = zonedChronology13.withZone(dateTimeZone16);
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology13.dayOfMonth();
        org.joda.time.DurationField durationField21 = zonedChronology13.seconds();
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime(4518471600L, (org.joda.time.Chronology) zonedChronology13);
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology13.monthOfYear();
        org.joda.time.DurationField durationField24 = zonedChronology13.hours();
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        long long28 = zonedChronology13.add(readablePeriod25, 0L, 256);
        org.joda.time.DurationField durationField29 = zonedChronology13.days();
        org.joda.time.DurationField durationField30 = zonedChronology13.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField29", (durationField6.compareTo(durationField29) == 0) == durationField6.equals(durationField29));
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test652");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology18 = zonedChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology12.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField21 = zonedChronology12.weekyear();
        org.joda.time.DateTimeField dateTimeField22 = zonedChronology12.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology12.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField24 = zonedChronology12.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField25 = zonedChronology12.yearOfEra();
        org.joda.time.DateTimeField dateTimeField26 = zonedChronology12.millisOfDay();
        org.joda.time.DateTimeField dateTimeField27 = zonedChronology12.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone28 = zonedChronology12.getZone();
        org.joda.time.DurationField durationField29 = zonedChronology12.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField29, durationField5, and durationField6", !(durationField29.compareTo(durationField5) == 0) || (Math.signum(durationField29.compareTo(durationField6)) == Math.signum(durationField5.compareTo(durationField6))));
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test653");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology18 = zonedChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.secondOfDay();
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology12.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField21 = zonedChronology12.dayOfMonth();
        org.joda.time.DurationField durationField22 = zonedChronology12.millis();
        org.joda.time.DurationField durationField23 = zonedChronology12.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField23, durationField5, and durationField6", !(durationField23.compareTo(durationField5) == 0) || (Math.signum(durationField23.compareTo(durationField6)) == Math.signum(durationField5.compareTo(durationField6))));
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test654");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology18 = zonedChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology12.weekOfWeekyear();
        org.joda.time.Chronology chronology21 = zonedChronology12.withUTC();
        org.joda.time.LocalDateTime localDateTime22 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) zonedChronology12);
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology12.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField24 = zonedChronology12.millisOfDay();
        org.joda.time.DurationField durationField25 = zonedChronology12.centuries();
        org.joda.time.DurationField durationField26 = zonedChronology12.minutes();
        java.lang.Class<?> wildcardClass27 = zonedChronology12.getClass();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField26", (durationField6.compareTo(durationField26) == 0) == durationField6.equals(durationField26));
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test655");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology12.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(dateTimeZone15);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.minusWeeks(0);
        org.joda.time.Chronology chronology19 = localDateTime18.getChronology();
        org.joda.time.DurationField durationField20 = chronology19.days();
        org.joda.time.DurationField durationField21 = chronology19.minutes();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str26 = dateTimeZone24.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology27 = org.joda.time.chrono.ZonedChronology.getInstance(chronology19, dateTimeZone24);
        org.joda.time.DateTimeField dateTimeField28 = zonedChronology27.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean32 = dateTimeZone30.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology33 = zonedChronology27.withZone(dateTimeZone30);
        org.joda.time.DateTimeField dateTimeField34 = zonedChronology27.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField35 = zonedChronology27.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField36 = zonedChronology27.weekyear();
        org.joda.time.DurationField durationField37 = zonedChronology27.years();
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (short) 0);
        boolean boolean42 = dateTimeZone40.isStandardOffset((long) 61673414);
        org.joda.time.Chronology chronology43 = zonedChronology27.withZone(dateTimeZone40);
        org.joda.time.LocalDateTime localDateTime44 = new org.joda.time.LocalDateTime((long) 12, (org.joda.time.Chronology) zonedChronology27);
        org.joda.time.DateTimeField dateTimeField45 = zonedChronology27.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField46 = zonedChronology27.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone47 = zonedChronology27.getZone();
        long long50 = dateTimeZone47.adjustOffset((long) 1255, false);
        org.joda.time.Chronology chronology51 = zonedChronology12.withZone(dateTimeZone47);
        org.joda.time.DurationField durationField52 = zonedChronology12.weekyears();
        org.joda.time.DurationField durationField53 = zonedChronology12.years();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField37 and durationField52", (durationField37.compareTo(durationField52) == 0) == durationField37.equals(durationField52));
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test656");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.yearOfEra();
        int int3 = property2.getMinimumValue();
        java.lang.String str4 = property2.getAsText();
        org.joda.time.LocalDateTime localDateTime5 = property2.withMaximumValue();
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plusMillis((int) 'a');
        org.joda.time.DateTime dateTime9 = localDateTime8.toDateTime();
        long long10 = dateTime9.getMillis();
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime();
        org.joda.time.DateTime dateTime12 = localDateTime11.toDateTime();
        java.lang.String str13 = dateTime12.toString();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        int int17 = dateTimeZone15.getOffsetFromLocal(4518471413L);
        boolean boolean19 = dateTimeZone15.isStandardOffset((long) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (short) 0);
        boolean boolean24 = dateTimeZone22.isStandardOffset((long) 61673414);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology26 = null;
        boolean boolean27 = dateTimeFieldType25.isSupported(chronology26);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime(dateTimeZone28);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime29.minusWeeks(0);
        org.joda.time.Chronology chronology32 = localDateTime31.getChronology();
        org.joda.time.DateTimeField dateTimeField33 = dateTimeFieldType25.getField(chronology32);
        java.lang.String str34 = dateTimeField33.getName();
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.LocalDateTime localDateTime36 = new org.joda.time.LocalDateTime(dateTimeZone35);
        org.joda.time.LocalDateTime localDateTime38 = localDateTime36.minusWeeks(0);
        org.joda.time.Chronology chronology39 = localDateTime38.getChronology();
        java.util.Locale locale41 = java.util.Locale.JAPANESE;
        java.lang.String str42 = locale41.getDisplayLanguage();
        java.lang.String str43 = locale41.getISO3Country();
        java.lang.String str44 = dateTimeField33.getAsShortText((org.joda.time.ReadablePartial) localDateTime38, 2, locale41);
        int int46 = dateTimeField33.getMaximumValue(0L);
        org.joda.time.DateTimeFieldType dateTimeFieldType47 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology48 = null;
        boolean boolean49 = dateTimeFieldType47.isSupported(chronology48);
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.LocalDateTime localDateTime51 = new org.joda.time.LocalDateTime(dateTimeZone50);
        org.joda.time.LocalDateTime localDateTime53 = localDateTime51.minusWeeks(0);
        org.joda.time.Chronology chronology54 = localDateTime53.getChronology();
        org.joda.time.DateTimeField dateTimeField55 = dateTimeFieldType47.getField(chronology54);
        java.lang.String str56 = dateTimeField55.getName();
        org.joda.time.DateTimeZone dateTimeZone57 = null;
        org.joda.time.LocalDateTime localDateTime58 = new org.joda.time.LocalDateTime(dateTimeZone57);
        org.joda.time.LocalDateTime localDateTime60 = localDateTime58.minusWeeks(0);
        org.joda.time.Chronology chronology61 = localDateTime60.getChronology();
        java.util.Locale locale63 = java.util.Locale.JAPANESE;
        java.lang.String str64 = locale63.getDisplayLanguage();
        java.lang.String str65 = locale63.getISO3Country();
        java.lang.String str66 = dateTimeField55.getAsShortText((org.joda.time.ReadablePartial) localDateTime60, 2, locale63);
        org.joda.time.LocalDateTime localDateTime68 = localDateTime60.minusDays((int) (byte) 1);
        org.joda.time.ReadableDuration readableDuration69 = null;
        org.joda.time.LocalDateTime localDateTime70 = localDateTime68.plus(readableDuration69);
        int[] intArray75 = new int[] { 0, 292278993, 10, 'a' };
        int int76 = dateTimeField33.getMinimumValue((org.joda.time.ReadablePartial) localDateTime70, intArray75);
        org.joda.time.DateTimeZone dateTimeZone77 = null;
        org.joda.time.LocalDateTime localDateTime78 = new org.joda.time.LocalDateTime(dateTimeZone77);
        org.joda.time.DateTimeZone dateTimeZone79 = null;
        org.joda.time.LocalDateTime localDateTime80 = new org.joda.time.LocalDateTime(dateTimeZone79);
        int int81 = localDateTime78.compareTo((org.joda.time.ReadablePartial) localDateTime80);
        org.joda.time.ReadableInstant readableInstant82 = null;
        org.joda.time.DateTime dateTime83 = localDateTime78.toDateTime(readableInstant82);
        boolean boolean85 = dateTime83.equals((java.lang.Object) 'a');
        org.joda.time.DateTime dateTime86 = localDateTime70.toDateTime((org.joda.time.ReadableInstant) dateTime83);
        int int87 = dateTimeZone22.getOffset((org.joda.time.ReadableInstant) dateTime83);
        int int88 = dateTimeZone15.getOffset((org.joda.time.ReadableInstant) dateTime83);
        org.joda.time.Instant instant89 = dateTime83.toInstant();
        boolean boolean90 = dateTime12.isEqual((org.joda.time.ReadableInstant) dateTime83);
        boolean boolean91 = dateTime9.isEqual((org.joda.time.ReadableInstant) dateTime83);
        org.joda.time.Chronology chronology92 = dateTime83.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime12 and instant89", (dateTime12.compareTo(instant89) == 0) == dateTime12.equals(instant89));
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test657");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology18 = zonedChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology12.year();
        java.lang.String str21 = zonedChronology12.toString();
        org.joda.time.DurationField durationField22 = zonedChronology12.months();
        org.joda.time.DurationField durationField23 = zonedChronology12.days();
        java.lang.String str24 = zonedChronology12.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField23", (durationField5.compareTo(durationField23) == 0) == durationField5.equals(durationField23));
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test658");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology18 = zonedChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology12.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField21 = zonedChronology12.weekyear();
        org.joda.time.DurationField durationField22 = zonedChronology12.years();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology12.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone24 = zonedChronology12.getZone();
        org.joda.time.DurationField durationField25 = zonedChronology12.millis();
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        long long29 = zonedChronology12.add(readablePeriod26, (long) 616, (int) '4');
        org.joda.time.DurationField durationField30 = zonedChronology12.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField30, durationField5, and durationField6", !(durationField30.compareTo(durationField5) == 0) || (Math.signum(durationField30.compareTo(durationField6)) == Math.signum(durationField5.compareTo(durationField6))));
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test659");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DurationField durationField13 = zonedChronology12.weeks();
        org.joda.time.DateTimeField dateTimeField14 = zonedChronology12.year();
        org.joda.time.DurationField durationField15 = zonedChronology12.months();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str20 = dateTimeZone18.getShortName((long) 10);
        java.lang.String str21 = dateTimeZone18.getID();
        long long24 = dateTimeZone18.convertLocalToUTC((long) (short) 1, false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone18);
        int int27 = dateTimeZone18.getStandardOffset(1L);
        org.joda.time.chrono.ZonedChronology zonedChronology28 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) zonedChronology12, dateTimeZone18);
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology12.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField30 = zonedChronology12.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField31 = zonedChronology12.yearOfCentury();
        org.joda.time.DurationField durationField32 = zonedChronology12.days();
        org.joda.time.DateTimeField dateTimeField33 = zonedChronology12.millisOfSecond();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField32", (durationField5.compareTo(durationField32) == 0) == durationField5.equals(durationField32));
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test660");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DurationField durationField13 = zonedChronology12.weeks();
        org.joda.time.DateTimeField dateTimeField14 = zonedChronology12.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField15 = zonedChronology12.era();
        org.joda.time.DateTimeField dateTimeField16 = zonedChronology12.yearOfEra();
        org.joda.time.DurationField durationField17 = zonedChronology12.days();
        org.joda.time.DateTimeField dateTimeField18 = zonedChronology12.minuteOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField17", (durationField5.compareTo(durationField17) == 0) == durationField5.equals(durationField17));
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test661");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        java.util.Locale locale13 = java.util.Locale.KOREAN;
        java.util.Set<java.lang.Character> charSet14 = locale13.getExtensionKeys();
        java.lang.Object[] objArray15 = charSet14.toArray();
        java.util.Locale locale16 = java.util.Locale.KOREAN;
        java.util.Set<java.lang.Character> charSet17 = locale16.getExtensionKeys();
        boolean boolean18 = charSet14.retainAll((java.util.Collection<java.lang.Character>) charSet17);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime(dateTimeZone19);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime(dateTimeZone21);
        int int23 = localDateTime20.compareTo((org.joda.time.ReadablePartial) localDateTime22);
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.DateTime dateTime25 = localDateTime20.toDateTime(readableInstant24);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime20.minusWeeks((int) (short) 1);
        boolean boolean28 = charSet14.remove((java.lang.Object) localDateTime27);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray29 = localDateTime27.getFieldTypes();
        org.joda.time.LocalDateTime.Property property30 = localDateTime27.millisOfDay();
        long long32 = zonedChronology12.set((org.joda.time.ReadablePartial) localDateTime27, (long) 536);
        org.joda.time.DateTimeField dateTimeField33 = zonedChronology12.millisOfDay();
        org.joda.time.DurationField durationField34 = zonedChronology12.days();
        org.joda.time.DurationField durationField35 = zonedChronology12.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField34", (durationField5.compareTo(durationField34) == 0) == durationField5.equals(durationField34));
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test662");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str4 = dateTimeZone2.getShortName((long) 10);
        java.lang.String str5 = dateTimeZone2.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(dateTimeZone7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.minusWeeks(0);
        org.joda.time.Chronology chronology11 = localDateTime10.getChronology();
        org.joda.time.DurationField durationField12 = chronology11.days();
        org.joda.time.DurationField durationField13 = chronology11.minutes();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str18 = dateTimeZone16.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology19 = org.joda.time.chrono.ZonedChronology.getInstance(chronology11, dateTimeZone16);
        org.joda.time.DurationField durationField20 = zonedChronology19.weeks();
        org.joda.time.DateTimeField dateTimeField21 = zonedChronology19.year();
        org.joda.time.DurationField durationField22 = zonedChronology19.months();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str27 = dateTimeZone25.getShortName((long) 10);
        java.lang.String str28 = dateTimeZone25.getID();
        long long31 = dateTimeZone25.convertLocalToUTC((long) (short) 1, false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone25);
        int int34 = dateTimeZone25.getStandardOffset(1L);
        org.joda.time.chrono.ZonedChronology zonedChronology35 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) zonedChronology19, dateTimeZone25);
        long long37 = dateTimeZone2.getMillisKeepLocal(dateTimeZone25, (long) 'a');
        int int39 = dateTimeZone2.getOffsetFromLocal((long) 813);
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.forOffsetMillis(21);
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.LocalDateTime localDateTime43 = new org.joda.time.LocalDateTime(dateTimeZone42);
        org.joda.time.LocalDateTime localDateTime45 = localDateTime43.minusWeeks(0);
        org.joda.time.Chronology chronology46 = localDateTime45.getChronology();
        org.joda.time.DurationField durationField47 = chronology46.days();
        org.joda.time.DurationField durationField48 = chronology46.minutes();
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str53 = dateTimeZone51.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology54 = org.joda.time.chrono.ZonedChronology.getInstance(chronology46, dateTimeZone51);
        org.joda.time.DurationField durationField55 = zonedChronology54.weeks();
        org.joda.time.DateTimeField dateTimeField56 = zonedChronology54.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField57 = zonedChronology54.dayOfWeek();
        org.joda.time.ReadablePeriod readablePeriod58 = null;
        long long61 = zonedChronology54.add(readablePeriod58, 0L, 2);
        org.joda.time.DateTimeField dateTimeField62 = zonedChronology54.weekyearOfCentury();
        java.lang.String str63 = zonedChronology54.toString();
        org.joda.time.LocalDateTime localDateTime64 = new org.joda.time.LocalDateTime((org.joda.time.Chronology) zonedChronology54);
        org.joda.time.DateTime dateTime65 = localDateTime64.toDateTime();
        org.joda.time.Instant instant66 = dateTime65.toInstant();
        int int67 = dateTimeZone41.getOffset((org.joda.time.ReadableInstant) instant66);
        org.joda.time.DateTimeZone dateTimeZone68 = null;
        org.joda.time.LocalDateTime localDateTime69 = new org.joda.time.LocalDateTime(dateTimeZone68);
        org.joda.time.LocalDateTime.Property property70 = localDateTime69.yearOfEra();
        org.joda.time.LocalDateTime.Property property71 = localDateTime69.monthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType72 = property71.getFieldType();
        org.joda.time.DurationFieldType durationFieldType73 = dateTimeFieldType72.getDurationType();
        org.joda.time.DurationFieldType durationFieldType74 = dateTimeFieldType72.getRangeDurationType();
        boolean boolean75 = instant66.isSupported(dateTimeFieldType72);
        int int76 = dateTimeZone2.getOffset((org.joda.time.ReadableInstant) instant66);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField20 and durationField55", (durationField20.compareTo(durationField55) == 0) == durationField20.equals(durationField55));
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test663");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DurationField durationField13 = zonedChronology12.weeks();
        org.joda.time.DateTimeField dateTimeField14 = zonedChronology12.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField15 = zonedChronology12.dayOfWeek();
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        long long19 = zonedChronology12.add(readablePeriod16, 0L, 2);
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology12.weekyearOfCentury();
        java.lang.String str21 = zonedChronology12.toString();
        org.joda.time.DateTimeField dateTimeField22 = zonedChronology12.monthOfYear();
        org.joda.time.DurationField durationField23 = zonedChronology12.months();
        org.joda.time.DurationField durationField24 = zonedChronology12.minutes();
        org.joda.time.DateTimeField dateTimeField25 = zonedChronology12.hourOfHalfday();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField24", (durationField6.compareTo(durationField24) == 0) == durationField6.equals(durationField24));
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test664");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology18 = zonedChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology12.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField21 = zonedChronology12.dayOfYear();
        org.joda.time.Chronology chronology22 = zonedChronology12.withUTC();
        org.joda.time.DurationField durationField23 = zonedChronology12.hours();
        org.joda.time.DateTimeField dateTimeField24 = zonedChronology12.halfdayOfDay();
        org.joda.time.DurationField durationField25 = zonedChronology12.weeks();
        org.joda.time.DateTimeField dateTimeField26 = zonedChronology12.minuteOfHour();
        org.joda.time.DurationField durationField27 = zonedChronology12.millis();
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime(dateTimeZone28);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime29.minusWeeks(0);
        org.joda.time.Chronology chronology32 = localDateTime31.getChronology();
        org.joda.time.DurationField durationField33 = chronology32.days();
        org.joda.time.DurationField durationField34 = chronology32.minutes();
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str39 = dateTimeZone37.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology40 = org.joda.time.chrono.ZonedChronology.getInstance(chronology32, dateTimeZone37);
        org.joda.time.DateTimeField dateTimeField41 = zonedChronology40.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean45 = dateTimeZone43.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology46 = zonedChronology40.withZone(dateTimeZone43);
        org.joda.time.DateTimeField dateTimeField47 = zonedChronology40.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField48 = zonedChronology40.minuteOfDay();
        org.joda.time.LocalDateTime localDateTime50 = new org.joda.time.LocalDateTime((long) (byte) -1);
        org.joda.time.LocalDateTime localDateTime52 = localDateTime50.plusMinutes(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType53 = org.joda.time.DateTimeFieldType.millisOfSecond();
        java.lang.String str54 = dateTimeFieldType53.getName();
        org.joda.time.DateTimeZone dateTimeZone55 = null;
        org.joda.time.LocalDateTime localDateTime56 = new org.joda.time.LocalDateTime(dateTimeZone55);
        org.joda.time.LocalDateTime localDateTime58 = localDateTime56.minusWeeks(0);
        org.joda.time.Chronology chronology59 = localDateTime58.getChronology();
        org.joda.time.DurationField durationField60 = chronology59.days();
        org.joda.time.DurationField durationField61 = chronology59.minutes();
        org.joda.time.DateTimeZone dateTimeZone64 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str66 = dateTimeZone64.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology67 = org.joda.time.chrono.ZonedChronology.getInstance(chronology59, dateTimeZone64);
        org.joda.time.DurationField durationField68 = zonedChronology67.weeks();
        org.joda.time.DateTimeField dateTimeField69 = zonedChronology67.year();
        org.joda.time.DurationField durationField70 = zonedChronology67.months();
        org.joda.time.DateTimeZone dateTimeZone73 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str75 = dateTimeZone73.getShortName((long) 10);
        java.lang.String str76 = dateTimeZone73.getID();
        long long79 = dateTimeZone73.convertLocalToUTC((long) (short) 1, false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone73);
        int int82 = dateTimeZone73.getStandardOffset(1L);
        org.joda.time.chrono.ZonedChronology zonedChronology83 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) zonedChronology67, dateTimeZone73);
        org.joda.time.DateTimeField dateTimeField84 = zonedChronology67.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField85 = zonedChronology67.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField86 = zonedChronology67.weekyear();
        boolean boolean87 = dateTimeFieldType53.isSupported((org.joda.time.Chronology) zonedChronology67);
        java.lang.String str88 = dateTimeFieldType53.toString();
        int int89 = localDateTime50.get(dateTimeFieldType53);
        java.util.Locale locale90 = null;
        java.lang.String str91 = dateTimeField48.getAsShortText((org.joda.time.ReadablePartial) localDateTime50, locale90);
        long long93 = zonedChronology12.set((org.joda.time.ReadablePartial) localDateTime50, (-59006940195568L));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField25 and durationField68", (durationField25.compareTo(durationField68) == 0) == durationField25.equals(durationField68));
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test665");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology18 = zonedChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology12.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField21 = zonedChronology12.weekyear();
        org.joda.time.DurationField durationField22 = zonedChronology12.years();
        org.joda.time.DurationField durationField23 = zonedChronology12.weeks();
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime(dateTimeZone24);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime25.minusWeeks(0);
        org.joda.time.Chronology chronology28 = localDateTime27.getChronology();
        org.joda.time.DurationField durationField29 = chronology28.days();
        org.joda.time.DurationField durationField30 = chronology28.minutes();
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str35 = dateTimeZone33.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology36 = org.joda.time.chrono.ZonedChronology.getInstance(chronology28, dateTimeZone33);
        org.joda.time.DateTimeField dateTimeField37 = zonedChronology36.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean41 = dateTimeZone39.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology42 = zonedChronology36.withZone(dateTimeZone39);
        org.joda.time.DateTimeField dateTimeField43 = zonedChronology36.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField44 = zonedChronology36.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField45 = zonedChronology36.weekyear();
        org.joda.time.DateTimeZone dateTimeZone46 = zonedChronology36.getZone();
        org.joda.time.Chronology chronology47 = zonedChronology12.withZone(dateTimeZone46);
        long long49 = dateTimeZone46.nextTransition(4554472850L);
        long long52 = dateTimeZone46.adjustOffset(59940000L, true);
        org.joda.time.DateTimeZone dateTimeZone53 = null;
        org.joda.time.LocalDateTime localDateTime54 = new org.joda.time.LocalDateTime(dateTimeZone53);
        org.joda.time.DateTimeZone dateTimeZone55 = null;
        org.joda.time.LocalDateTime localDateTime56 = new org.joda.time.LocalDateTime(dateTimeZone55);
        int int57 = localDateTime54.compareTo((org.joda.time.ReadablePartial) localDateTime56);
        org.joda.time.ReadableInstant readableInstant58 = null;
        org.joda.time.DateTime dateTime59 = localDateTime54.toDateTime(readableInstant58);
        org.joda.time.DateTimeZone dateTimeZone60 = null;
        org.joda.time.LocalDateTime localDateTime61 = new org.joda.time.LocalDateTime(dateTimeZone60);
        org.joda.time.DateTimeZone dateTimeZone62 = null;
        org.joda.time.LocalDateTime localDateTime63 = new org.joda.time.LocalDateTime(dateTimeZone62);
        int int64 = localDateTime61.compareTo((org.joda.time.ReadablePartial) localDateTime63);
        org.joda.time.LocalDateTime localDateTime65 = new org.joda.time.LocalDateTime();
        boolean boolean66 = localDateTime61.isEqual((org.joda.time.ReadablePartial) localDateTime65);
        org.joda.time.DateTimeZone dateTimeZone67 = null;
        org.joda.time.LocalDateTime localDateTime68 = new org.joda.time.LocalDateTime(dateTimeZone67);
        org.joda.time.LocalDateTime localDateTime70 = localDateTime68.minusWeeks(0);
        int int71 = localDateTime65.compareTo((org.joda.time.ReadablePartial) localDateTime68);
        org.joda.time.LocalDateTime localDateTime72 = localDateTime54.withFields((org.joda.time.ReadablePartial) localDateTime65);
        org.joda.time.LocalDateTime.Property property73 = localDateTime65.year();
        java.util.Locale locale76 = new java.util.Locale("", "\uce90\ub098\ub2e4");
        int int77 = property73.getMaximumShortTextLength(locale76);
        org.joda.time.DateTimeZone dateTimeZone78 = null;
        org.joda.time.LocalDateTime localDateTime79 = new org.joda.time.LocalDateTime(dateTimeZone78);
        org.joda.time.DateTimeZone dateTimeZone80 = null;
        org.joda.time.LocalDateTime localDateTime81 = new org.joda.time.LocalDateTime(dateTimeZone80);
        int int82 = localDateTime79.compareTo((org.joda.time.ReadablePartial) localDateTime81);
        org.joda.time.ReadableInstant readableInstant83 = null;
        org.joda.time.DateTime dateTime84 = localDateTime79.toDateTime(readableInstant83);
        org.joda.time.DateTimeZone dateTimeZone85 = null;
        org.joda.time.LocalDateTime localDateTime86 = new org.joda.time.LocalDateTime(dateTimeZone85);
        org.joda.time.LocalDateTime.Property property87 = localDateTime86.yearOfEra();
        int int88 = property87.getMinimumValue();
        boolean boolean89 = dateTime84.equals((java.lang.Object) int88);
        int int90 = property73.compareTo((org.joda.time.ReadableInstant) dateTime84);
        int int91 = dateTimeZone46.getOffset((org.joda.time.ReadableInstant) dateTime84);
        org.joda.time.Instant instant92 = dateTime84.toInstant();
        org.joda.time.Instant instant93 = dateTime84.toInstant();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime59 and instant92", (dateTime59.compareTo(instant92) == 0) == dateTime59.equals(instant92));
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test666");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minusWeeks(0);
        org.joda.time.Chronology chronology5 = localDateTime4.getChronology();
        org.joda.time.DurationField durationField6 = chronology5.days();
        org.joda.time.DurationField durationField7 = chronology5.minutes();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str12 = dateTimeZone10.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology13 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone10);
        org.joda.time.DateTimeField dateTimeField14 = zonedChronology13.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean18 = dateTimeZone16.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology19 = zonedChronology13.withZone(dateTimeZone16);
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology13.dayOfMonth();
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        long long24 = zonedChronology13.add(readablePeriod21, (long) 53, (int) (byte) 0);
        org.joda.time.DateTimeField dateTimeField25 = zonedChronology13.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime((long) 61685839, (org.joda.time.Chronology) zonedChronology13);
        org.joda.time.DateTimeField dateTimeField27 = zonedChronology13.weekOfWeekyear();
        org.joda.time.DurationField durationField28 = zonedChronology13.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField28, durationField6, and durationField7", !(durationField28.compareTo(durationField6) == 0) || (Math.signum(durationField28.compareTo(durationField7)) == Math.signum(durationField6.compareTo(durationField7))));
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test667");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DurationField durationField13 = zonedChronology12.weeks();
        org.joda.time.DateTimeField dateTimeField14 = zonedChronology12.year();
        org.joda.time.DurationField durationField15 = zonedChronology12.months();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str20 = dateTimeZone18.getShortName((long) 10);
        java.lang.String str21 = dateTimeZone18.getID();
        long long24 = dateTimeZone18.convertLocalToUTC((long) (short) 1, false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone18);
        int int27 = dateTimeZone18.getStandardOffset(1L);
        org.joda.time.chrono.ZonedChronology zonedChronology28 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) zonedChronology12, dateTimeZone18);
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology12.millisOfDay();
        org.joda.time.DateTimeField dateTimeField30 = zonedChronology12.clockhourOfDay();
        org.joda.time.DurationField durationField31 = zonedChronology12.days();
        org.joda.time.DateTimeField dateTimeField32 = zonedChronology12.centuryOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField31", (durationField5.compareTo(durationField31) == 0) == durationField5.equals(durationField31));
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test668");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology18 = zonedChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.dayOfMonth();
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        long long23 = zonedChronology12.add(readablePeriod20, (long) 53, (int) (byte) 0);
        org.joda.time.DurationField durationField24 = zonedChronology12.weeks();
        org.joda.time.DurationField durationField25 = zonedChronology12.halfdays();
        org.joda.time.DateTimeField dateTimeField26 = zonedChronology12.era();
        org.joda.time.DateTimeField dateTimeField27 = zonedChronology12.weekyearOfCentury();
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology29 = null;
        boolean boolean30 = dateTimeFieldType28.isSupported(chronology29);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime(dateTimeZone31);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime32.minusWeeks(0);
        org.joda.time.Chronology chronology35 = localDateTime34.getChronology();
        org.joda.time.DateTimeField dateTimeField36 = dateTimeFieldType28.getField(chronology35);
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str41 = dateTimeZone39.getShortName((long) 10);
        java.lang.String str42 = dateTimeZone39.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone39);
        org.joda.time.chrono.ZonedChronology zonedChronology44 = org.joda.time.chrono.ZonedChronology.getInstance(chronology35, dateTimeZone39);
        java.lang.String str46 = dateTimeZone39.getShortName(4518470650L);
        boolean boolean48 = dateTimeZone39.isStandardOffset((long) 999);
        org.joda.time.Chronology chronology49 = zonedChronology12.withZone(dateTimeZone39);
        org.joda.time.DateTimeField dateTimeField50 = zonedChronology12.yearOfEra();
        org.joda.time.DateTimeField dateTimeField51 = zonedChronology12.millisOfDay();
        org.joda.time.DurationField durationField52 = zonedChronology12.minutes();
        org.joda.time.DateTimeField dateTimeField53 = zonedChronology12.yearOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField52", (durationField6.compareTo(durationField52) == 0) == durationField6.equals(durationField52));
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test669");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology18 = zonedChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology12.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField21 = zonedChronology12.weekyear();
        org.joda.time.DateTimeField dateTimeField22 = zonedChronology12.era();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology12.millisOfDay();
        org.joda.time.DateTimeField dateTimeField24 = zonedChronology12.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField25 = zonedChronology12.yearOfEra();
        org.joda.time.DurationField durationField26 = zonedChronology12.minutes();
        org.joda.time.DurationField durationField27 = zonedChronology12.weeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField26", (durationField6.compareTo(durationField26) == 0) == durationField6.equals(durationField26));
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test670");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DurationField durationField13 = zonedChronology12.weeks();
        org.joda.time.DateTimeField dateTimeField14 = zonedChronology12.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField15 = zonedChronology12.dayOfWeek();
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        long long19 = zonedChronology12.add(readablePeriod16, 0L, 2);
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology12.weekyearOfCentury();
        org.joda.time.DurationField durationField21 = zonedChronology12.hours();
        org.joda.time.DurationField durationField22 = zonedChronology12.centuries();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology12.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime(dateTimeZone24);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime(dateTimeZone26);
        int int28 = localDateTime25.compareTo((org.joda.time.ReadablePartial) localDateTime27);
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime();
        boolean boolean30 = localDateTime25.isEqual((org.joda.time.ReadablePartial) localDateTime29);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime(dateTimeZone31);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime32.minusWeeks(0);
        int int35 = localDateTime29.compareTo((org.joda.time.ReadablePartial) localDateTime32);
        org.joda.time.LocalDateTime.Property property36 = localDateTime32.dayOfWeek();
        int int37 = property36.getMinimumValue();
        org.joda.time.LocalDateTime localDateTime38 = property36.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime39 = new org.joda.time.LocalDateTime();
        int int40 = localDateTime39.getYear();
        int int41 = localDateTime39.getMinuteOfHour();
        org.joda.time.ReadableDuration readableDuration42 = null;
        org.joda.time.LocalDateTime localDateTime43 = localDateTime39.plus(readableDuration42);
        int int44 = localDateTime38.compareTo((org.joda.time.ReadablePartial) localDateTime43);
        int[] intArray46 = zonedChronology12.get((org.joda.time.ReadablePartial) localDateTime43, (-58376098292591L));
        org.joda.time.DateTimeField dateTimeField47 = zonedChronology12.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField48 = zonedChronology12.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.LocalDateTime localDateTime50 = new org.joda.time.LocalDateTime(dateTimeZone49);
        org.joda.time.LocalDateTime localDateTime52 = localDateTime50.minusWeeks(0);
        org.joda.time.Chronology chronology53 = localDateTime52.getChronology();
        org.joda.time.DurationField durationField54 = chronology53.days();
        org.joda.time.DurationField durationField55 = chronology53.minutes();
        org.joda.time.DateTimeZone dateTimeZone58 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str60 = dateTimeZone58.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology61 = org.joda.time.chrono.ZonedChronology.getInstance(chronology53, dateTimeZone58);
        org.joda.time.DurationField durationField62 = zonedChronology61.weeks();
        org.joda.time.DateTimeField dateTimeField63 = zonedChronology61.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField64 = zonedChronology61.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone65 = zonedChronology61.getZone();
        org.joda.time.DurationField durationField66 = zonedChronology61.halfdays();
        org.joda.time.DateTimeZone dateTimeZone67 = zonedChronology61.getZone();
        org.joda.time.chrono.ZonedChronology zonedChronology68 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) zonedChronology12, dateTimeZone67);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField13 and durationField62", (durationField13.compareTo(durationField62) == 0) == durationField13.equals(durationField62));
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test671");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.yearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.monthOfYear();
        org.joda.time.LocalDateTime localDateTime4 = property3.roundHalfFloorCopy();
        org.joda.time.DurationField durationField5 = property3.getDurationField();
        org.joda.time.Interval interval6 = property3.toInterval();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(dateTimeZone7);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.yearOfEra();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.plusSeconds(10);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.withEra(0);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime11.withMillisOfDay(12);
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.plus(readableDuration16);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime(dateTimeZone18);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.minusWeeks(0);
        org.joda.time.Chronology chronology22 = localDateTime21.getChronology();
        org.joda.time.DurationField durationField23 = chronology22.days();
        org.joda.time.DurationField durationField24 = chronology22.minutes();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str29 = dateTimeZone27.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology30 = org.joda.time.chrono.ZonedChronology.getInstance(chronology22, dateTimeZone27);
        org.joda.time.DurationField durationField31 = zonedChronology30.weeks();
        org.joda.time.DateTimeField dateTimeField32 = zonedChronology30.year();
        org.joda.time.DurationField durationField33 = zonedChronology30.months();
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str38 = dateTimeZone36.getShortName((long) 10);
        java.lang.String str39 = dateTimeZone36.getID();
        long long42 = dateTimeZone36.convertLocalToUTC((long) (short) 1, false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone36);
        int int45 = dateTimeZone36.getStandardOffset(1L);
        org.joda.time.chrono.ZonedChronology zonedChronology46 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) zonedChronology30, dateTimeZone36);
        long long50 = dateTimeZone36.convertLocalToUTC(1645391275084L, true, (long) 5);
        org.joda.time.DateTime dateTime51 = localDateTime15.toDateTime(dateTimeZone36);
        long long52 = property3.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime51);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField33", (durationField5.compareTo(durationField33) == 0) == durationField5.equals(durationField33));
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test672");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minusWeeks(0);
        org.joda.time.Chronology chronology5 = localDateTime4.getChronology();
        org.joda.time.DurationField durationField6 = chronology5.days();
        org.joda.time.DurationField durationField7 = chronology5.minutes();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str12 = dateTimeZone10.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology13 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone10);
        org.joda.time.DateTimeField dateTimeField14 = zonedChronology13.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean18 = dateTimeZone16.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology19 = zonedChronology13.withZone(dateTimeZone16);
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology13.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField21 = zonedChronology13.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField22 = zonedChronology13.weekyear();
        org.joda.time.DurationField durationField23 = zonedChronology13.years();
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (short) 0);
        boolean boolean28 = dateTimeZone26.isStandardOffset((long) 61673414);
        org.joda.time.Chronology chronology29 = zonedChronology13.withZone(dateTimeZone26);
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime((long) 12, (org.joda.time.Chronology) zonedChronology13);
        org.joda.time.DateTimeField dateTimeField31 = zonedChronology13.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField32 = zonedChronology13.millisOfSecond();
        org.joda.time.DurationField durationField33 = zonedChronology13.months();
        long long37 = zonedChronology13.add((long) 803, 1645427289074L, 850);
        org.joda.time.DurationField durationField38 = zonedChronology13.years();
        org.joda.time.DurationField durationField39 = zonedChronology13.halfdays();
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.LocalDateTime localDateTime44 = new org.joda.time.LocalDateTime(dateTimeZone43);
        org.joda.time.LocalDateTime localDateTime46 = localDateTime44.minusWeeks(0);
        org.joda.time.Chronology chronology47 = localDateTime46.getChronology();
        org.joda.time.DurationField durationField48 = chronology47.days();
        org.joda.time.DurationField durationField49 = chronology47.minutes();
        org.joda.time.DateTimeZone dateTimeZone52 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str54 = dateTimeZone52.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology55 = org.joda.time.chrono.ZonedChronology.getInstance(chronology47, dateTimeZone52);
        org.joda.time.DateTimeField dateTimeField56 = zonedChronology55.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone58 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean60 = dateTimeZone58.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology61 = zonedChronology55.withZone(dateTimeZone58);
        org.joda.time.DateTimeField dateTimeField62 = zonedChronology55.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField63 = zonedChronology55.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField64 = zonedChronology55.weekyear();
        org.joda.time.DurationField durationField65 = zonedChronology55.years();
        org.joda.time.DateTimeField dateTimeField66 = zonedChronology55.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone67 = zonedChronology55.getZone();
        boolean boolean68 = dateTimeZone42.equals((java.lang.Object) dateTimeZone67);
        org.joda.time.LocalDateTime localDateTime69 = org.joda.time.LocalDateTime.now(dateTimeZone42);
        long long71 = zonedChronology13.set((org.joda.time.ReadablePartial) localDateTime69, (long) 61834555);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField23 and durationField65", (durationField23.compareTo(durationField65) == 0) == durationField23.equals(durationField65));
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test673");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology18 = zonedChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology12.year();
        java.lang.String str21 = zonedChronology12.toString();
        org.joda.time.DateTimeField dateTimeField22 = zonedChronology12.weekyear();
        org.joda.time.DurationField durationField23 = zonedChronology12.weeks();
        org.joda.time.DurationField durationField24 = zonedChronology12.weekyears();
        org.joda.time.DurationField durationField25 = zonedChronology12.weekyears();
        org.joda.time.DateTimeField dateTimeField26 = zonedChronology12.secondOfDay();
        org.joda.time.DurationField durationField27 = zonedChronology12.minutes();
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime(dateTimeZone28);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime29.minusWeeks(0);
        org.joda.time.Chronology chronology32 = localDateTime31.getChronology();
        org.joda.time.DurationField durationField33 = chronology32.days();
        org.joda.time.DurationField durationField34 = chronology32.minutes();
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str39 = dateTimeZone37.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology40 = org.joda.time.chrono.ZonedChronology.getInstance(chronology32, dateTimeZone37);
        org.joda.time.DateTimeField dateTimeField41 = zonedChronology40.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean45 = dateTimeZone43.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology46 = zonedChronology40.withZone(dateTimeZone43);
        org.joda.time.DateTimeField dateTimeField47 = zonedChronology40.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField48 = zonedChronology40.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField49 = zonedChronology40.weekyear();
        org.joda.time.LocalDateTime localDateTime51 = new org.joda.time.LocalDateTime((long) (byte) -1);
        int int52 = localDateTime51.getMonthOfYear();
        org.joda.time.DurationFieldType durationFieldType53 = org.joda.time.DurationFieldType.seconds();
        boolean boolean54 = localDateTime51.isSupported(durationFieldType53);
        org.joda.time.LocalDateTime.Property property55 = localDateTime51.yearOfEra();
        int[] intArray57 = new int[] { 'a' };
        int int58 = dateTimeField49.getMinimumValue((org.joda.time.ReadablePartial) localDateTime51, intArray57);
        org.joda.time.LocalDateTime localDateTime60 = localDateTime51.minusDays(0);
        org.joda.time.DateTime dateTime61 = localDateTime60.toDateTime();
        java.lang.String str62 = localDateTime60.toString();
        org.joda.time.LocalDateTime localDateTime64 = localDateTime60.plusHours(61704329);
        int int65 = localDateTime64.getYearOfCentury();
        org.joda.time.LocalDateTime localDateTime67 = localDateTime64.minusMillis(659);
        int int68 = localDateTime64.getDayOfYear();
        long long70 = zonedChronology12.set((org.joda.time.ReadablePartial) localDateTime64, 56332800000L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField27", (durationField6.compareTo(durationField27) == 0) == durationField6.equals(durationField27));
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test674");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minusWeeks(0);
        org.joda.time.Chronology chronology5 = localDateTime4.getChronology();
        org.joda.time.DurationField durationField6 = chronology5.days();
        org.joda.time.DurationField durationField7 = chronology5.minutes();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str12 = dateTimeZone10.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology13 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone10);
        org.joda.time.DurationField durationField14 = zonedChronology13.weeks();
        org.joda.time.DateTimeField dateTimeField15 = zonedChronology13.year();
        org.joda.time.DurationField durationField16 = zonedChronology13.months();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str21 = dateTimeZone19.getShortName((long) 10);
        java.lang.String str22 = dateTimeZone19.getID();
        long long25 = dateTimeZone19.convertLocalToUTC((long) (short) 1, false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone19);
        int int28 = dateTimeZone19.getStandardOffset(1L);
        org.joda.time.chrono.ZonedChronology zonedChronology29 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) zonedChronology13, dateTimeZone19);
        org.joda.time.DateTimeField dateTimeField30 = zonedChronology13.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone31 = zonedChronology13.getZone();
        org.joda.time.DateTimeField dateTimeField32 = zonedChronology13.secondOfDay();
        org.joda.time.DurationField durationField33 = zonedChronology13.weeks();
        org.joda.time.DateTimeField dateTimeField34 = zonedChronology13.halfdayOfDay();
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime(4554570986L, (org.joda.time.Chronology) zonedChronology13);
        org.joda.time.DurationField durationField36 = zonedChronology13.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField36, durationField6, and durationField7", !(durationField36.compareTo(durationField6) == 0) || (Math.signum(durationField36.compareTo(durationField7)) == Math.signum(durationField6.compareTo(durationField7))));
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test675");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withYear((int) (short) 100);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.year();
        org.joda.time.LocalDateTime.Property property8 = localDateTime6.year();
        org.joda.time.DurationField durationField9 = property8.getDurationField();
        org.joda.time.DurationField durationField10 = property8.getRangeDurationField();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(dateTimeZone11);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.yearOfEra();
        int int14 = property13.getMinimumValue();
        java.lang.String str15 = property13.getAsText();
        java.util.Locale locale16 = java.util.Locale.FRANCE;
        java.lang.String str17 = property13.getAsText(locale16);
        java.util.Locale locale18 = locale16.stripExtensions();
        boolean boolean19 = property8.equals((java.lang.Object) locale18);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime(dateTimeZone20);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.minusWeeks(0);
        org.joda.time.Chronology chronology24 = localDateTime23.getChronology();
        org.joda.time.DurationField durationField25 = chronology24.days();
        org.joda.time.DurationField durationField26 = chronology24.minutes();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str31 = dateTimeZone29.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology32 = org.joda.time.chrono.ZonedChronology.getInstance(chronology24, dateTimeZone29);
        org.joda.time.DateTimeField dateTimeField33 = zonedChronology32.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean37 = dateTimeZone35.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology38 = zonedChronology32.withZone(dateTimeZone35);
        org.joda.time.DateTimeField dateTimeField39 = zonedChronology32.dayOfMonth();
        org.joda.time.DurationField durationField40 = zonedChronology32.months();
        org.joda.time.DateTimeField dateTimeField41 = zonedChronology32.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField42 = zonedChronology32.dayOfYear();
        org.joda.time.DateTimeField dateTimeField43 = zonedChronology32.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.LocalDateTime localDateTime47 = new org.joda.time.LocalDateTime(dateTimeZone46);
        org.joda.time.LocalDateTime localDateTime49 = localDateTime47.minusWeeks(0);
        org.joda.time.Chronology chronology50 = localDateTime49.getChronology();
        org.joda.time.DurationField durationField51 = chronology50.days();
        org.joda.time.DurationField durationField52 = chronology50.minutes();
        org.joda.time.DateTimeZone dateTimeZone55 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str57 = dateTimeZone55.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology58 = org.joda.time.chrono.ZonedChronology.getInstance(chronology50, dateTimeZone55);
        org.joda.time.DateTimeField dateTimeField59 = zonedChronology58.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone61 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean63 = dateTimeZone61.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology64 = zonedChronology58.withZone(dateTimeZone61);
        org.joda.time.DateTimeField dateTimeField65 = zonedChronology58.dayOfMonth();
        org.joda.time.DurationField durationField66 = zonedChronology58.years();
        org.joda.time.DateTimeField dateTimeField67 = zonedChronology58.centuryOfEra();
        java.util.Locale locale68 = java.util.Locale.ROOT;
        java.util.Locale.Category category69 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale70 = java.util.Locale.CANADA;
        java.util.Locale.setDefault(category69, locale70);
        java.lang.String str72 = locale70.toLanguageTag();
        java.util.Locale.Category category73 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale74 = java.util.Locale.CANADA;
        java.util.Locale.setDefault(category73, locale74);
        java.lang.String str76 = locale74.toLanguageTag();
        java.lang.String str77 = locale70.getDisplayLanguage(locale74);
        java.lang.String str78 = locale68.getDisplayCountry(locale70);
        int int79 = dateTimeField67.getMaximumTextLength(locale70);
        long long80 = dateTimeField43.set(4554729176L, "61693097", locale70);
        java.lang.String str81 = locale18.getDisplayName(locale70);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField9 and durationField66", (durationField9.compareTo(durationField66) == 0) == durationField9.equals(durationField66));
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test676");
        org.joda.time.tz.NameProvider nameProvider0 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime(dateTimeZone2);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.minusWeeks(0);
        org.joda.time.Chronology chronology6 = localDateTime5.getChronology();
        org.joda.time.DurationField durationField7 = chronology6.days();
        org.joda.time.DurationField durationField8 = chronology6.minutes();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str13 = dateTimeZone11.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology14 = org.joda.time.chrono.ZonedChronology.getInstance(chronology6, dateTimeZone11);
        org.joda.time.DurationField durationField15 = zonedChronology14.weeks();
        org.joda.time.DateTimeField dateTimeField16 = zonedChronology14.year();
        org.joda.time.DateTimeZone dateTimeZone17 = zonedChronology14.getZone();
        java.util.Locale locale19 = java.util.Locale.ROOT;
        java.lang.String str20 = dateTimeZone17.getShortName((long) '4', locale19);
        java.lang.String str21 = locale19.getDisplayCountry();
        java.lang.String str24 = nameProvider0.getName(locale19, "Japanese", "");
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        java.util.Locale locale26 = java.util.Locale.GERMAN;
        boolean boolean27 = locale26.hasExtensions();
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime(dateTimeZone28);
        org.joda.time.LocalDateTime.Property property30 = localDateTime29.yearOfEra();
        int int31 = property30.getMinimumValue();
        java.lang.String str32 = property30.getAsText();
        java.util.Locale locale33 = java.util.Locale.FRANCE;
        java.lang.String str34 = property30.getAsText(locale33);
        java.lang.String str35 = locale26.getDisplayVariant(locale33);
        java.lang.String str38 = nameProvider0.getName(locale33, "120", "\uce90\ub098\ub2e4");
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.LocalDateTime localDateTime41 = new org.joda.time.LocalDateTime(dateTimeZone40);
        org.joda.time.LocalDateTime localDateTime43 = localDateTime41.minusWeeks(0);
        org.joda.time.Chronology chronology44 = localDateTime43.getChronology();
        org.joda.time.DurationField durationField45 = chronology44.days();
        org.joda.time.DurationField durationField46 = chronology44.minutes();
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str51 = dateTimeZone49.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology52 = org.joda.time.chrono.ZonedChronology.getInstance(chronology44, dateTimeZone49);
        org.joda.time.DateTimeField dateTimeField53 = zonedChronology52.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone55 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean57 = dateTimeZone55.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology58 = zonedChronology52.withZone(dateTimeZone55);
        org.joda.time.DateTimeField dateTimeField59 = zonedChronology52.dayOfMonth();
        org.joda.time.ReadablePeriod readablePeriod60 = null;
        long long63 = zonedChronology52.add(readablePeriod60, (long) 53, (int) (byte) 0);
        org.joda.time.DateTimeField dateTimeField64 = zonedChronology52.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime65 = new org.joda.time.LocalDateTime((long) 61685839, (org.joda.time.Chronology) zonedChronology52);
        org.joda.time.DurationField durationField66 = zonedChronology52.seconds();
        org.joda.time.LocalDateTime localDateTime67 = new org.joda.time.LocalDateTime((java.lang.Object) str38, (org.joda.time.Chronology) zonedChronology52);
        org.joda.time.DateTimeField dateTimeField68 = zonedChronology52.yearOfCentury();
        org.joda.time.ReadablePeriod readablePeriod69 = null;
        long long72 = zonedChronology52.add(readablePeriod69, 13345731397L, 517);
        org.joda.time.DurationField durationField73 = zonedChronology52.minutes();
        org.joda.time.DateTimeField dateTimeField74 = zonedChronology52.secondOfMinute();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField8 and durationField73", (durationField8.compareTo(durationField73) == 0) == durationField8.equals(durationField73));
    }

    @Test
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test677");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DurationField durationField13 = zonedChronology12.seconds();
        org.joda.time.DateTimeField dateTimeField14 = zonedChronology12.hourOfHalfday();
        org.joda.time.DurationField durationField15 = zonedChronology12.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField15, durationField5, and durationField6", !(durationField15.compareTo(durationField5) == 0) || (Math.signum(durationField15.compareTo(durationField6)) == Math.signum(durationField5.compareTo(durationField6))));
    }

    @Test
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test678");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfSecond();
        java.lang.String str1 = dateTimeFieldType0.getName();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime(dateTimeZone2);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.minusWeeks(0);
        org.joda.time.Chronology chronology6 = localDateTime5.getChronology();
        org.joda.time.DurationField durationField7 = chronology6.days();
        org.joda.time.DurationField durationField8 = chronology6.minutes();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str13 = dateTimeZone11.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology14 = org.joda.time.chrono.ZonedChronology.getInstance(chronology6, dateTimeZone11);
        org.joda.time.DurationField durationField15 = zonedChronology14.weeks();
        org.joda.time.DateTimeField dateTimeField16 = zonedChronology14.year();
        org.joda.time.DurationField durationField17 = zonedChronology14.months();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str22 = dateTimeZone20.getShortName((long) 10);
        java.lang.String str23 = dateTimeZone20.getID();
        long long26 = dateTimeZone20.convertLocalToUTC((long) (short) 1, false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone20);
        int int29 = dateTimeZone20.getStandardOffset(1L);
        org.joda.time.chrono.ZonedChronology zonedChronology30 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) zonedChronology14, dateTimeZone20);
        org.joda.time.DateTimeField dateTimeField31 = zonedChronology14.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField32 = zonedChronology14.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField33 = zonedChronology14.weekyear();
        boolean boolean34 = dateTimeFieldType0.isSupported((org.joda.time.Chronology) zonedChronology14);
        org.joda.time.DurationField durationField35 = zonedChronology14.hours();
        long long38 = durationField35.getValueAsLong((long) 97, 1645428245419L);
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.LocalDateTime localDateTime40 = new org.joda.time.LocalDateTime(dateTimeZone39);
        org.joda.time.LocalDateTime localDateTime42 = localDateTime40.minusWeeks(0);
        org.joda.time.Chronology chronology43 = localDateTime42.getChronology();
        org.joda.time.DurationField durationField44 = chronology43.days();
        org.joda.time.DurationField durationField45 = chronology43.minutes();
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str50 = dateTimeZone48.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology51 = org.joda.time.chrono.ZonedChronology.getInstance(chronology43, dateTimeZone48);
        org.joda.time.DateTimeField dateTimeField52 = zonedChronology51.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone54 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean56 = dateTimeZone54.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology57 = zonedChronology51.withZone(dateTimeZone54);
        org.joda.time.DateTimeField dateTimeField58 = zonedChronology51.dayOfMonth();
        org.joda.time.ReadablePeriod readablePeriod59 = null;
        long long62 = zonedChronology51.add(readablePeriod59, (long) 53, (int) (byte) 0);
        org.joda.time.DurationField durationField63 = zonedChronology51.weeks();
        org.joda.time.ReadablePeriod readablePeriod64 = null;
        long long67 = zonedChronology51.add(readablePeriod64, (long) 12, (int) (short) 100);
        org.joda.time.DurationField durationField68 = zonedChronology51.years();
        boolean boolean69 = durationField68.isSupported();
        java.lang.String str70 = durationField68.toString();
        int int73 = durationField68.getValue(190L, (long) 485);
        int int74 = durationField35.compareTo(durationField68);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField15 and durationField63", (durationField15.compareTo(durationField63) == 0) == durationField15.equals(durationField63));
    }

    @Test
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test679");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology18 = zonedChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology12.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField21 = zonedChronology12.year();
        org.joda.time.DurationField durationField22 = dateTimeField21.getLeapDurationField();
        long long25 = dateTimeField21.add(1645514186850L, 570);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField22", (durationField5.compareTo(durationField22) == 0) == durationField5.equals(durationField22));
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test680");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology18 = zonedChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology12.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        org.joda.time.Chronology chronology24 = zonedChronology12.withZone(dateTimeZone23);
        org.joda.time.DurationField durationField25 = zonedChronology12.years();
        org.joda.time.DurationField durationField26 = zonedChronology12.months();
        org.joda.time.DurationField durationField27 = zonedChronology12.seconds();
        org.joda.time.DateTimeField dateTimeField28 = zonedChronology12.era();
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology12.halfdayOfDay();
        org.joda.time.DurationField durationField30 = zonedChronology12.weekyears();
        org.joda.time.DateTimeField dateTimeField31 = zonedChronology12.dayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField25 and durationField30", (durationField25.compareTo(durationField30) == 0) == durationField25.equals(durationField30));
    }

    @Test
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test681");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        boolean boolean14 = zonedChronology12.equals((java.lang.Object) "292278993-02-22T07:07:50.878");
        org.joda.time.DateTimeField dateTimeField15 = zonedChronology12.hourOfDay();
        org.joda.time.DateTimeField dateTimeField16 = zonedChronology12.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField17 = zonedChronology12.hourOfHalfday();
        org.joda.time.Chronology chronology18 = zonedChronology12.withUTC();
        java.lang.Object obj19 = null;
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime(dateTimeZone20);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.minusWeeks(0);
        org.joda.time.Chronology chronology24 = localDateTime23.getChronology();
        org.joda.time.DurationField durationField25 = chronology24.days();
        org.joda.time.DurationField durationField26 = chronology24.minutes();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str31 = dateTimeZone29.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology32 = org.joda.time.chrono.ZonedChronology.getInstance(chronology24, dateTimeZone29);
        org.joda.time.DateTimeField dateTimeField33 = zonedChronology32.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean37 = dateTimeZone35.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology38 = zonedChronology32.withZone(dateTimeZone35);
        org.joda.time.DateTimeField dateTimeField39 = zonedChronology32.minuteOfHour();
        org.joda.time.Chronology chronology40 = zonedChronology32.withUTC();
        org.joda.time.DurationField durationField41 = zonedChronology32.years();
        org.joda.time.DateTimeField dateTimeField42 = zonedChronology32.minuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.LocalDateTime localDateTime44 = new org.joda.time.LocalDateTime(dateTimeZone43);
        org.joda.time.LocalDateTime localDateTime46 = localDateTime44.minusWeeks(0);
        int int47 = localDateTime46.getYearOfCentury();
        org.joda.time.LocalDateTime localDateTime49 = localDateTime46.withMillisOfSecond((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime51 = localDateTime49.minusHours((int) '#');
        int[] intArray53 = zonedChronology32.get((org.joda.time.ReadablePartial) localDateTime49, (long) 2022);
        org.joda.time.DateTimeFieldType dateTimeFieldType54 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology55 = null;
        boolean boolean56 = dateTimeFieldType54.isSupported(chronology55);
        org.joda.time.DateTimeZone dateTimeZone57 = null;
        org.joda.time.LocalDateTime localDateTime58 = new org.joda.time.LocalDateTime(dateTimeZone57);
        org.joda.time.LocalDateTime localDateTime60 = localDateTime58.minusWeeks(0);
        org.joda.time.Chronology chronology61 = localDateTime60.getChronology();
        org.joda.time.DateTimeField dateTimeField62 = dateTimeFieldType54.getField(chronology61);
        org.joda.time.DateTimeZone dateTimeZone65 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str67 = dateTimeZone65.getShortName((long) 10);
        java.lang.String str68 = dateTimeZone65.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone65);
        org.joda.time.chrono.ZonedChronology zonedChronology70 = org.joda.time.chrono.ZonedChronology.getInstance(chronology61, dateTimeZone65);
        java.lang.String str72 = dateTimeZone65.getShortName(4518470650L);
        java.util.TimeZone timeZone73 = dateTimeZone65.toTimeZone();
        org.joda.time.Chronology chronology74 = zonedChronology32.withZone(dateTimeZone65);
        org.joda.time.LocalDateTime localDateTime75 = new org.joda.time.LocalDateTime(obj19, dateTimeZone65);
        long long77 = zonedChronology12.set((org.joda.time.ReadablePartial) localDateTime75, 1876085055L);
        org.joda.time.Chronology chronology78 = zonedChronology12.withUTC();
        org.joda.time.DateTimeField dateTimeField79 = zonedChronology12.hourOfDay();
        org.joda.time.DurationField durationField80 = zonedChronology12.days();
        org.joda.time.DateTimeField dateTimeField81 = zonedChronology12.weekyearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField80", (durationField5.compareTo(durationField80) == 0) == durationField5.equals(durationField80));
    }

    @Test
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test682");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology18 = zonedChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology12.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        org.joda.time.Chronology chronology24 = zonedChronology12.withZone(dateTimeZone23);
        org.joda.time.DurationField durationField25 = zonedChronology12.years();
        org.joda.time.DurationField durationField26 = zonedChronology12.months();
        org.joda.time.DateTimeField dateTimeField27 = zonedChronology12.weekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        long long31 = zonedChronology12.add(readablePeriod28, (long) (-292275054), 292278993);
        org.joda.time.DateTimeZone dateTimeZone32 = zonedChronology12.getZone();
        org.joda.time.DurationField durationField33 = zonedChronology12.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField33, durationField5, and durationField6", !(durationField33.compareTo(durationField5) == 0) || (Math.signum(durationField33.compareTo(durationField6)) == Math.signum(durationField5.compareTo(durationField6))));
    }

    @Test
    public void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test683");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minusWeeks(0);
        org.joda.time.Chronology chronology5 = localDateTime4.getChronology();
        org.joda.time.DurationField durationField6 = chronology5.days();
        org.joda.time.DurationField durationField7 = chronology5.minutes();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str12 = dateTimeZone10.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology13 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone10);
        org.joda.time.DateTimeField dateTimeField14 = zonedChronology13.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean18 = dateTimeZone16.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology19 = zonedChronology13.withZone(dateTimeZone16);
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology13.minuteOfHour();
        org.joda.time.Chronology chronology21 = zonedChronology13.withUTC();
        org.joda.time.DurationField durationField22 = zonedChronology13.years();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology13.minuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime(dateTimeZone24);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime25.minusWeeks(0);
        int int28 = localDateTime27.getYearOfCentury();
        org.joda.time.LocalDateTime localDateTime30 = localDateTime27.withMillisOfSecond((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime30.minusHours((int) '#');
        int[] intArray34 = zonedChronology13.get((org.joda.time.ReadablePartial) localDateTime30, (long) 2022);
        org.joda.time.DateTimeFieldType dateTimeFieldType35 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology36 = null;
        boolean boolean37 = dateTimeFieldType35.isSupported(chronology36);
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.LocalDateTime localDateTime39 = new org.joda.time.LocalDateTime(dateTimeZone38);
        org.joda.time.LocalDateTime localDateTime41 = localDateTime39.minusWeeks(0);
        org.joda.time.Chronology chronology42 = localDateTime41.getChronology();
        org.joda.time.DateTimeField dateTimeField43 = dateTimeFieldType35.getField(chronology42);
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str48 = dateTimeZone46.getShortName((long) 10);
        java.lang.String str49 = dateTimeZone46.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone46);
        org.joda.time.chrono.ZonedChronology zonedChronology51 = org.joda.time.chrono.ZonedChronology.getInstance(chronology42, dateTimeZone46);
        java.lang.String str53 = dateTimeZone46.getShortName(4518470650L);
        java.util.TimeZone timeZone54 = dateTimeZone46.toTimeZone();
        org.joda.time.Chronology chronology55 = zonedChronology13.withZone(dateTimeZone46);
        org.joda.time.LocalDateTime localDateTime56 = new org.joda.time.LocalDateTime(obj0, dateTimeZone46);
        int int57 = localDateTime56.getHourOfDay();
        org.joda.time.DateTimeZone dateTimeZone58 = null;
        org.joda.time.LocalDateTime localDateTime59 = new org.joda.time.LocalDateTime(dateTimeZone58);
        org.joda.time.LocalDateTime localDateTime61 = localDateTime59.minusWeeks(0);
        org.joda.time.Chronology chronology62 = localDateTime61.getChronology();
        org.joda.time.DurationField durationField63 = chronology62.days();
        org.joda.time.DurationField durationField64 = chronology62.minutes();
        org.joda.time.DateTimeZone dateTimeZone67 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str69 = dateTimeZone67.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology70 = org.joda.time.chrono.ZonedChronology.getInstance(chronology62, dateTimeZone67);
        org.joda.time.DateTimeField dateTimeField71 = zonedChronology70.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone73 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean75 = dateTimeZone73.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology76 = zonedChronology70.withZone(dateTimeZone73);
        org.joda.time.DateTimeField dateTimeField77 = zonedChronology70.dayOfMonth();
        org.joda.time.ReadablePeriod readablePeriod78 = null;
        long long81 = zonedChronology70.add(readablePeriod78, (long) 53, (int) (byte) 0);
        org.joda.time.DurationField durationField82 = zonedChronology70.weeks();
        org.joda.time.ReadablePeriod readablePeriod83 = null;
        long long86 = zonedChronology70.add(readablePeriod83, (long) 12, (int) (short) 100);
        org.joda.time.DurationField durationField87 = zonedChronology70.years();
        long long89 = durationField87.getMillis((long) 61738194);
        org.joda.time.DurationFieldType durationFieldType90 = durationField87.getType();
        org.joda.time.LocalDateTime localDateTime92 = localDateTime56.withFieldAdded(durationFieldType90, 511);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField22 and durationField87", (durationField22.compareTo(durationField87) == 0) == durationField22.equals(durationField87));
    }

    @Test
    public void test684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test684");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology18 = zonedChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.dayOfMonth();
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        long long23 = zonedChronology12.add(readablePeriod20, (long) 53, (int) (byte) 0);
        long long27 = zonedChronology12.add(1645427275536L, 0L, 8);
        org.joda.time.DurationField durationField28 = zonedChronology12.hours();
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forOffsetMillis(21);
        org.joda.time.Chronology chronology31 = zonedChronology12.withZone(dateTimeZone30);
        org.joda.time.DateTimeField dateTimeField32 = zonedChronology12.dayOfWeek();
        org.joda.time.Chronology chronology33 = zonedChronology12.withUTC();
        org.joda.time.DurationField durationField34 = zonedChronology12.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField34, durationField5, and durationField6", !(durationField34.compareTo(durationField5) == 0) || (Math.signum(durationField34.compareTo(durationField6)) == Math.signum(durationField5.compareTo(durationField6))));
    }

    @Test
    public void test685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test685");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DurationField durationField13 = zonedChronology12.weeks();
        org.joda.time.DateTimeField dateTimeField14 = zonedChronology12.year();
        org.joda.time.DateTimeZone dateTimeZone15 = zonedChronology12.getZone();
        org.joda.time.DateTimeField dateTimeField16 = zonedChronology12.millisOfSecond();
        org.joda.time.DurationField durationField17 = zonedChronology12.hours();
        org.joda.time.DurationField durationField18 = zonedChronology12.centuries();
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime(dateTimeZone21);
        org.joda.time.LocalDateTime.Property property23 = localDateTime22.yearOfEra();
        int int24 = property23.getMinimumValue();
        java.lang.String str25 = property23.getAsText();
        org.joda.time.LocalDateTime localDateTime26 = property23.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime27 = property23.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.plusMonths((int) '4');
        org.joda.time.LocalDateTime localDateTime31 = localDateTime27.withCenturyOfEra(1970);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime27.minusMinutes(19);
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime(dateTimeZone34);
        org.joda.time.LocalDateTime localDateTime37 = localDateTime35.minusWeeks(0);
        org.joda.time.Chronology chronology38 = localDateTime37.getChronology();
        org.joda.time.DurationField durationField39 = chronology38.days();
        org.joda.time.DurationField durationField40 = chronology38.minutes();
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str45 = dateTimeZone43.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology46 = org.joda.time.chrono.ZonedChronology.getInstance(chronology38, dateTimeZone43);
        org.joda.time.DurationField durationField47 = zonedChronology46.weeks();
        org.joda.time.DateTimeField dateTimeField48 = zonedChronology46.yearOfEra();
        org.joda.time.DurationField durationField49 = zonedChronology46.weekyears();
        org.joda.time.DateTimeField dateTimeField50 = zonedChronology46.secondOfDay();
        org.joda.time.DateTimeField dateTimeField51 = zonedChronology46.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.LocalDateTime localDateTime53 = new org.joda.time.LocalDateTime(dateTimeZone52);
        org.joda.time.LocalDateTime.Property property54 = localDateTime53.yearOfEra();
        int int55 = property54.getMinimumValue();
        java.lang.String str56 = property54.getAsText();
        org.joda.time.LocalDateTime localDateTime57 = property54.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime58 = property54.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime60 = localDateTime58.plusMonths((int) '4');
        org.joda.time.LocalDateTime.Property property61 = localDateTime58.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone62 = null;
        org.joda.time.LocalDateTime localDateTime63 = new org.joda.time.LocalDateTime(dateTimeZone62);
        org.joda.time.LocalDateTime.Property property64 = localDateTime63.yearOfEra();
        int int65 = property64.getMinimumValue();
        java.lang.String str66 = property64.getAsText();
        org.joda.time.LocalDateTime localDateTime67 = property64.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime69 = localDateTime67.minusMinutes(100);
        int[] intArray70 = localDateTime67.getValues();
        zonedChronology46.validate((org.joda.time.ReadablePartial) localDateTime58, intArray70);
        int int72 = dateTimeField20.getMinimumValue((org.joda.time.ReadablePartial) localDateTime33, intArray70);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField13 and durationField47", (durationField13.compareTo(durationField47) == 0) == durationField13.equals(durationField47));
    }

    @Test
    public void test686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test686");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology18 = zonedChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology12.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        org.joda.time.Chronology chronology24 = zonedChronology12.withZone(dateTimeZone23);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime(dateTimeZone26);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.minusWeeks(0);
        org.joda.time.Chronology chronology30 = localDateTime29.getChronology();
        org.joda.time.DurationField durationField31 = chronology30.days();
        org.joda.time.DurationField durationField32 = chronology30.minutes();
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str37 = dateTimeZone35.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology38 = org.joda.time.chrono.ZonedChronology.getInstance(chronology30, dateTimeZone35);
        org.joda.time.DateTimeField dateTimeField39 = zonedChronology38.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean43 = dateTimeZone41.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology44 = zonedChronology38.withZone(dateTimeZone41);
        org.joda.time.DateTimeField dateTimeField45 = zonedChronology38.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField46 = zonedChronology38.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField47 = zonedChronology38.weekyear();
        org.joda.time.DurationField durationField48 = zonedChronology38.years();
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (short) 0);
        boolean boolean53 = dateTimeZone51.isStandardOffset((long) 61673414);
        org.joda.time.Chronology chronology54 = zonedChronology38.withZone(dateTimeZone51);
        org.joda.time.LocalDateTime localDateTime55 = new org.joda.time.LocalDateTime((long) 12, (org.joda.time.Chronology) zonedChronology38);
        org.joda.time.DateTimeField dateTimeField56 = zonedChronology38.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField57 = zonedChronology38.yearOfEra();
        boolean boolean58 = dateTimeZone23.equals((java.lang.Object) zonedChronology38);
        org.joda.time.DurationField durationField59 = zonedChronology38.weekyears();
        org.joda.time.DateTimeField dateTimeField60 = zonedChronology38.yearOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField48 and durationField59", (durationField48.compareTo(durationField59) == 0) == durationField48.equals(durationField59));
    }

    @Test
    public void test687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test687");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime(dateTimeZone2);
        int int4 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime3);
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime();
        boolean boolean6 = localDateTime1.isEqual((org.joda.time.ReadablePartial) localDateTime5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(dateTimeZone7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.minusWeeks(0);
        int int11 = localDateTime5.compareTo((org.joda.time.ReadablePartial) localDateTime8);
        int int12 = localDateTime8.getCenturyOfEra();
        org.joda.time.LocalDateTime.Property property13 = localDateTime8.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime14 = property13.roundHalfEvenCopy();
        int int15 = property13.getLeapAmount();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(dateTimeZone16);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.minusWeeks(0);
        org.joda.time.Chronology chronology20 = localDateTime19.getChronology();
        org.joda.time.DurationField durationField21 = chronology20.days();
        org.joda.time.DurationField durationField22 = chronology20.minutes();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str27 = dateTimeZone25.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology28 = org.joda.time.chrono.ZonedChronology.getInstance(chronology20, dateTimeZone25);
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology28.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean33 = dateTimeZone31.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology34 = zonedChronology28.withZone(dateTimeZone31);
        org.joda.time.DateTimeField dateTimeField35 = zonedChronology28.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField36 = zonedChronology28.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        org.joda.time.Chronology chronology40 = zonedChronology28.withZone(dateTimeZone39);
        org.joda.time.LocalDateTime localDateTime41 = new org.joda.time.LocalDateTime((org.joda.time.Chronology) zonedChronology28);
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.LocalDateTime localDateTime43 = new org.joda.time.LocalDateTime(dateTimeZone42);
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.LocalDateTime localDateTime45 = new org.joda.time.LocalDateTime(dateTimeZone44);
        int int46 = localDateTime43.compareTo((org.joda.time.ReadablePartial) localDateTime45);
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.DateTime dateTime48 = localDateTime43.toDateTime(readableInstant47);
        boolean boolean50 = dateTime48.equals((java.lang.Object) 'a');
        org.joda.time.DateTimeZone dateTimeZone51 = null;
        org.joda.time.LocalDateTime localDateTime52 = new org.joda.time.LocalDateTime(dateTimeZone51);
        org.joda.time.DateTimeZone dateTimeZone53 = null;
        org.joda.time.LocalDateTime localDateTime54 = new org.joda.time.LocalDateTime(dateTimeZone53);
        int int55 = localDateTime52.compareTo((org.joda.time.ReadablePartial) localDateTime54);
        org.joda.time.ReadableInstant readableInstant56 = null;
        org.joda.time.DateTime dateTime57 = localDateTime52.toDateTime(readableInstant56);
        org.joda.time.DateTimeZone dateTimeZone58 = null;
        org.joda.time.LocalDateTime localDateTime59 = new org.joda.time.LocalDateTime(dateTimeZone58);
        org.joda.time.LocalDateTime.Property property60 = localDateTime59.yearOfEra();
        int int61 = property60.getMinimumValue();
        boolean boolean62 = dateTime57.equals((java.lang.Object) int61);
        org.joda.time.Chronology chronology63 = dateTime57.getChronology();
        int int64 = dateTime48.compareTo((org.joda.time.ReadableInstant) dateTime57);
        org.joda.time.DateTimeZone dateTimeZone65 = null;
        org.joda.time.LocalDateTime localDateTime66 = new org.joda.time.LocalDateTime(dateTimeZone65);
        org.joda.time.DateTimeZone dateTimeZone67 = null;
        org.joda.time.LocalDateTime localDateTime68 = new org.joda.time.LocalDateTime(dateTimeZone67);
        int int69 = localDateTime66.compareTo((org.joda.time.ReadablePartial) localDateTime68);
        org.joda.time.ReadableInstant readableInstant70 = null;
        org.joda.time.DateTime dateTime71 = localDateTime66.toDateTime(readableInstant70);
        org.joda.time.DateTimeZone dateTimeZone72 = null;
        org.joda.time.LocalDateTime localDateTime73 = new org.joda.time.LocalDateTime(dateTimeZone72);
        org.joda.time.LocalDateTime.Property property74 = localDateTime73.yearOfEra();
        int int75 = property74.getMinimumValue();
        boolean boolean76 = dateTime71.equals((java.lang.Object) int75);
        org.joda.time.DateTimeFieldType dateTimeFieldType77 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        int int78 = dateTime71.get(dateTimeFieldType77);
        boolean boolean79 = dateTime57.isBefore((org.joda.time.ReadableInstant) dateTime71);
        org.joda.time.DateTime dateTime80 = localDateTime41.toDateTime((org.joda.time.ReadableInstant) dateTime71);
        org.joda.time.DateTimeZone dateTimeZone81 = null;
        org.joda.time.LocalDateTime localDateTime82 = new org.joda.time.LocalDateTime(dateTimeZone81);
        org.joda.time.DateTimeZone dateTimeZone83 = null;
        org.joda.time.LocalDateTime localDateTime84 = new org.joda.time.LocalDateTime(dateTimeZone83);
        int int85 = localDateTime82.compareTo((org.joda.time.ReadablePartial) localDateTime84);
        org.joda.time.ReadableInstant readableInstant86 = null;
        org.joda.time.DateTime dateTime87 = localDateTime82.toDateTime(readableInstant86);
        org.joda.time.Chronology chronology88 = dateTime87.getChronology();
        org.joda.time.DateTime dateTime89 = localDateTime41.toDateTime((org.joda.time.ReadableInstant) dateTime87);
        java.lang.String str90 = dateTime87.toString();
        org.joda.time.Instant instant91 = dateTime87.toInstant();
        long long92 = property13.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime87);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime48 and instant91", (dateTime48.compareTo(instant91) == 0) == dateTime48.equals(instant91));
    }

    @Test
    public void test688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test688");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology18 = zonedChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology12.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField21 = zonedChronology12.weekyear();
        org.joda.time.DateTimeZone dateTimeZone22 = zonedChronology12.getZone();
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology24 = null;
        boolean boolean25 = dateTimeFieldType23.isSupported(chronology24);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime(dateTimeZone26);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.minusWeeks(0);
        org.joda.time.Chronology chronology30 = localDateTime29.getChronology();
        org.joda.time.DateTimeField dateTimeField31 = dateTimeFieldType23.getField(chronology30);
        java.lang.String str32 = dateTimeField31.getName();
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime(dateTimeZone33);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime34.minusWeeks(0);
        org.joda.time.Chronology chronology37 = localDateTime36.getChronology();
        java.util.Locale locale39 = java.util.Locale.JAPANESE;
        java.lang.String str40 = locale39.getDisplayLanguage();
        java.lang.String str41 = locale39.getISO3Country();
        java.lang.String str42 = dateTimeField31.getAsShortText((org.joda.time.ReadablePartial) localDateTime36, 2, locale39);
        int int44 = dateTimeField31.getMaximumValue(0L);
        org.joda.time.DateTimeFieldType dateTimeFieldType45 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology46 = null;
        boolean boolean47 = dateTimeFieldType45.isSupported(chronology46);
        org.joda.time.DateTimeZone dateTimeZone48 = null;
        org.joda.time.LocalDateTime localDateTime49 = new org.joda.time.LocalDateTime(dateTimeZone48);
        org.joda.time.LocalDateTime localDateTime51 = localDateTime49.minusWeeks(0);
        org.joda.time.Chronology chronology52 = localDateTime51.getChronology();
        org.joda.time.DateTimeField dateTimeField53 = dateTimeFieldType45.getField(chronology52);
        java.lang.String str54 = dateTimeField53.getName();
        org.joda.time.DateTimeZone dateTimeZone55 = null;
        org.joda.time.LocalDateTime localDateTime56 = new org.joda.time.LocalDateTime(dateTimeZone55);
        org.joda.time.LocalDateTime localDateTime58 = localDateTime56.minusWeeks(0);
        org.joda.time.Chronology chronology59 = localDateTime58.getChronology();
        java.util.Locale locale61 = java.util.Locale.JAPANESE;
        java.lang.String str62 = locale61.getDisplayLanguage();
        java.lang.String str63 = locale61.getISO3Country();
        java.lang.String str64 = dateTimeField53.getAsShortText((org.joda.time.ReadablePartial) localDateTime58, 2, locale61);
        org.joda.time.LocalDateTime localDateTime66 = localDateTime58.minusDays((int) (byte) 1);
        org.joda.time.ReadableDuration readableDuration67 = null;
        org.joda.time.LocalDateTime localDateTime68 = localDateTime66.plus(readableDuration67);
        int[] intArray73 = new int[] { 0, 292278993, 10, 'a' };
        int int74 = dateTimeField31.getMinimumValue((org.joda.time.ReadablePartial) localDateTime68, intArray73);
        org.joda.time.DateTimeZone dateTimeZone75 = null;
        org.joda.time.LocalDateTime localDateTime76 = new org.joda.time.LocalDateTime(dateTimeZone75);
        org.joda.time.DateTimeZone dateTimeZone77 = null;
        org.joda.time.LocalDateTime localDateTime78 = new org.joda.time.LocalDateTime(dateTimeZone77);
        int int79 = localDateTime76.compareTo((org.joda.time.ReadablePartial) localDateTime78);
        org.joda.time.ReadableInstant readableInstant80 = null;
        org.joda.time.DateTime dateTime81 = localDateTime76.toDateTime(readableInstant80);
        boolean boolean83 = dateTime81.equals((java.lang.Object) 'a');
        org.joda.time.DateTime dateTime84 = localDateTime68.toDateTime((org.joda.time.ReadableInstant) dateTime81);
        long long86 = zonedChronology12.set((org.joda.time.ReadablePartial) localDateTime68, 10L);
        org.joda.time.DateTimeField dateTimeField87 = zonedChronology12.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField88 = zonedChronology12.clockhourOfHalfday();
        org.joda.time.DurationField durationField89 = zonedChronology12.centuries();
        org.joda.time.DurationField durationField90 = zonedChronology12.minutes();
        org.joda.time.DateTimeField dateTimeField91 = zonedChronology12.yearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField90", (durationField6.compareTo(durationField90) == 0) == durationField6.equals(durationField90));
    }

    @Test
    public void test689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test689");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DurationField durationField13 = zonedChronology12.weeks();
        org.joda.time.DateTimeField dateTimeField14 = zonedChronology12.year();
        org.joda.time.DateTimeZone dateTimeZone15 = zonedChronology12.getZone();
        org.joda.time.DateTimeField dateTimeField16 = zonedChronology12.year();
        org.joda.time.DateTimeField dateTimeField17 = zonedChronology12.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField18 = zonedChronology12.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.yearOfEra();
        org.joda.time.DurationField durationField20 = zonedChronology12.seconds();
        org.joda.time.DurationField durationField21 = zonedChronology12.days();
        org.joda.time.DurationField durationField22 = zonedChronology12.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField22", (durationField5.compareTo(durationField22) == 0) == durationField5.equals(durationField22));
    }

    @Test
    public void test690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test690");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withYear((int) (short) 100);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.year();
        org.joda.time.LocalDateTime localDateTime8 = property7.getLocalDateTime();
        org.joda.time.DateTimeField dateTimeField9 = property7.getField();
        org.joda.time.LocalDateTime localDateTime10 = property7.withMaximumValue();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(dateTimeZone13);
        int int15 = localDateTime12.compareTo((org.joda.time.ReadablePartial) localDateTime14);
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.DateTime dateTime17 = localDateTime12.toDateTime(readableInstant16);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime(dateTimeZone18);
        org.joda.time.LocalDateTime.Property property20 = localDateTime19.yearOfEra();
        int int21 = property20.getMinimumValue();
        boolean boolean22 = dateTime17.equals((java.lang.Object) int21);
        int int23 = property7.compareTo((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.Instant instant24 = dateTime17.toInstant();
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime(dateTimeZone25);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime(dateTimeZone27);
        int int29 = localDateTime26.compareTo((org.joda.time.ReadablePartial) localDateTime28);
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.DateTime dateTime31 = localDateTime26.toDateTime(readableInstant30);
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime(dateTimeZone32);
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime(dateTimeZone34);
        int int36 = localDateTime33.compareTo((org.joda.time.ReadablePartial) localDateTime35);
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime();
        boolean boolean38 = localDateTime33.isEqual((org.joda.time.ReadablePartial) localDateTime37);
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.LocalDateTime localDateTime40 = new org.joda.time.LocalDateTime(dateTimeZone39);
        org.joda.time.LocalDateTime localDateTime42 = localDateTime40.minusWeeks(0);
        int int43 = localDateTime37.compareTo((org.joda.time.ReadablePartial) localDateTime40);
        org.joda.time.LocalDateTime localDateTime44 = localDateTime26.withFields((org.joda.time.ReadablePartial) localDateTime37);
        org.joda.time.LocalDateTime.Property property45 = localDateTime37.year();
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.LocalDateTime localDateTime47 = new org.joda.time.LocalDateTime(dateTimeZone46);
        org.joda.time.DateTimeZone dateTimeZone48 = null;
        org.joda.time.LocalDateTime localDateTime49 = new org.joda.time.LocalDateTime(dateTimeZone48);
        int int50 = localDateTime47.compareTo((org.joda.time.ReadablePartial) localDateTime49);
        org.joda.time.ReadableInstant readableInstant51 = null;
        org.joda.time.DateTime dateTime52 = localDateTime47.toDateTime(readableInstant51);
        org.joda.time.DateTimeZone dateTimeZone53 = null;
        org.joda.time.LocalDateTime localDateTime54 = new org.joda.time.LocalDateTime(dateTimeZone53);
        org.joda.time.LocalDateTime.Property property55 = localDateTime54.yearOfEra();
        int int56 = property55.getMinimumValue();
        boolean boolean57 = dateTime52.equals((java.lang.Object) int56);
        org.joda.time.DateTimeFieldType dateTimeFieldType58 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        int int59 = dateTime52.get(dateTimeFieldType58);
        int int60 = property45.compareTo((org.joda.time.ReadableInstant) dateTime52);
        boolean boolean61 = dateTime17.isBefore((org.joda.time.ReadableInstant) dateTime52);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant24 and dateTime31", (instant24.compareTo(dateTime31) == 0) == instant24.equals(dateTime31));
    }

    @Test
    public void test691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test691");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minusWeeks(0);
        org.joda.time.Chronology chronology5 = localDateTime4.getChronology();
        org.joda.time.DurationField durationField6 = chronology5.days();
        org.joda.time.DurationField durationField7 = chronology5.minutes();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str12 = dateTimeZone10.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology13 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone10);
        boolean boolean15 = zonedChronology13.equals((java.lang.Object) "292278993-02-22T07:07:50.878");
        org.joda.time.DateTimeField dateTimeField16 = zonedChronology13.hourOfDay();
        org.joda.time.DurationField durationField17 = zonedChronology13.hours();
        org.joda.time.DurationField durationField18 = zonedChronology13.centuries();
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology13.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology13.dayOfWeek();
        org.joda.time.DurationField durationField21 = zonedChronology13.months();
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime((-58380429600000L), (org.joda.time.Chronology) zonedChronology13);
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology13.monthOfYear();
        org.joda.time.DurationField durationField24 = zonedChronology13.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField24, durationField6, and durationField7", !(durationField24.compareTo(durationField6) == 0) || (Math.signum(durationField24.compareTo(durationField7)) == Math.signum(durationField6.compareTo(durationField7))));
    }

    @Test
    public void test692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test692");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minusWeeks(0);
        org.joda.time.Chronology chronology5 = localDateTime4.getChronology();
        org.joda.time.DurationField durationField6 = chronology5.days();
        org.joda.time.DurationField durationField7 = chronology5.minutes();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str12 = dateTimeZone10.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology13 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone10);
        org.joda.time.DateTimeField dateTimeField14 = zonedChronology13.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean18 = dateTimeZone16.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology19 = zonedChronology13.withZone(dateTimeZone16);
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology13.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField21 = zonedChronology13.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField22 = zonedChronology13.weekyear();
        org.joda.time.DurationField durationField23 = zonedChronology13.years();
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (short) 0);
        boolean boolean28 = dateTimeZone26.isStandardOffset((long) 61673414);
        org.joda.time.Chronology chronology29 = zonedChronology13.withZone(dateTimeZone26);
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime((long) 12, (org.joda.time.Chronology) zonedChronology13);
        org.joda.time.DateTimeField dateTimeField31 = zonedChronology13.centuryOfEra();
        org.joda.time.DurationField durationField32 = zonedChronology13.weekyears();
        org.joda.time.DateTimeField dateTimeField33 = zonedChronology13.dayOfWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField23 and durationField32", (durationField23.compareTo(durationField32) == 0) == durationField23.equals(durationField32));
    }
}

