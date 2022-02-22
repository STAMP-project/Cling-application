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
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DurationField durationField4 = islamicChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.year();
        org.joda.time.DurationField durationField6 = islamicChronology2.years();
        org.joda.time.DurationField durationField7 = islamicChronology2.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField6", (durationField3.compareTo(durationField6) == 0) == durationField3.equals(durationField6));
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test502");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = islamicChronology0.weekyears();
        org.joda.time.DurationField durationField2 = islamicChronology0.hours();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology5 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone4);
        org.joda.time.DurationField durationField6 = islamicChronology5.weekyears();
        org.joda.time.DurationField durationField7 = islamicChronology5.months();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology5.minuteOfHour();
        org.joda.time.DurationField durationField9 = islamicChronology5.hours();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology5.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 0);
        org.joda.time.Chronology chronology13 = islamicChronology5.withZone(dateTimeZone12);
        java.lang.String str15 = dateTimeZone12.getShortName(100L);
        org.joda.time.chrono.IslamicChronology islamicChronology16 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone12);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology19 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone18);
        org.joda.time.DurationField durationField20 = islamicChronology19.weekyears();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology23 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone22);
        boolean boolean25 = dateTimeZone22.equals((java.lang.Object) 10L);
        org.joda.time.Chronology chronology26 = islamicChronology19.withZone(dateTimeZone22);
        java.lang.String str27 = dateTimeZone22.getID();
        org.joda.time.Chronology chronology28 = islamicChronology16.withZone(dateTimeZone22);
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology31 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone30);
        org.joda.time.DurationField durationField32 = islamicChronology31.weekyears();
        org.joda.time.DurationField durationField33 = islamicChronology31.halfdays();
        org.joda.time.DateTimeField dateTimeField34 = islamicChronology31.yearOfEra();
        org.joda.time.DurationField durationField35 = islamicChronology31.halfdays();
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology38 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone37);
        org.joda.time.DurationField durationField39 = islamicChronology38.weekyears();
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology42 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone41);
        boolean boolean44 = dateTimeZone41.equals((java.lang.Object) 10L);
        org.joda.time.Chronology chronology45 = islamicChronology38.withZone(dateTimeZone41);
        java.util.Locale locale47 = java.util.Locale.KOREA;
        java.util.Locale locale48 = java.util.Locale.KOREA;
        java.lang.String str49 = locale47.getDisplayLanguage(locale48);
        java.lang.String str50 = locale48.getISO3Country();
        java.util.Set<java.lang.String> strSet51 = locale48.getUnicodeLocaleAttributes();
        java.lang.String str52 = dateTimeZone41.getName(24796800001L, locale48);
        org.joda.time.Chronology chronology53 = islamicChronology31.withZone(dateTimeZone41);
        int int55 = dateTimeZone41.getStandardOffset(43200010L);
        org.joda.time.Chronology chronology56 = islamicChronology16.withZone(dateTimeZone41);
        org.joda.time.Chronology chronology57 = islamicChronology0.withZone(dateTimeZone41);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField1 and durationField6", (durationField1.compareTo(durationField6) == 0) == durationField1.equals(durationField6));
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test503");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        int int2 = localDateTime1.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYear((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withPeriodAdded(readablePeriod5, 10);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withDayOfYear(11);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withYear(10);
        org.joda.time.DateTime dateTime12 = localDateTime9.toDateTime();
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((long) 1);
        int int15 = localDateTime14.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime17 = localDateTime14.minusHours((int) (byte) -1);
        int int18 = localDateTime14.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime14.withMinuteOfHour((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime14.plusHours((int) (byte) 100);
        java.util.Date date23 = localDateTime22.toDate();
        org.joda.time.DateTime dateTime24 = localDateTime22.toDateTime();
        boolean boolean25 = dateTime12.isBefore((org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime((long) 1);
        int int28 = localDateTime27.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime30 = localDateTime27.minusHours((int) (byte) -1);
        int int31 = localDateTime27.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime33 = localDateTime27.minusMinutes((int) '#');
        org.joda.time.LocalDateTime.Property property34 = localDateTime33.centuryOfEra();
        org.joda.time.DurationField durationField35 = property34.getRangeDurationField();
        org.joda.time.LocalDateTime localDateTime36 = property34.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime38 = property34.addWrapFieldToCopy((-3600000));
        org.joda.time.DateTime dateTime39 = localDateTime38.toDateTime();
        boolean boolean40 = dateTime12.isEqual((org.joda.time.ReadableInstant) dateTime39);
        java.util.Locale locale41 = java.util.Locale.KOREA;
        java.util.Locale locale42 = java.util.Locale.KOREA;
        java.lang.String str43 = locale41.getDisplayLanguage(locale42);
        java.lang.String str44 = locale42.getISO3Country();
        java.util.Set<java.lang.String> strSet45 = locale42.getUnicodeLocaleAttributes();
        strSet45.clear();
        org.joda.time.LocalDateTime localDateTime48 = new org.joda.time.LocalDateTime((long) 1);
        int int49 = localDateTime48.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime51 = localDateTime48.minusHours((int) (byte) -1);
        int int53 = localDateTime48.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime55 = localDateTime48.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod56 = null;
        org.joda.time.LocalDateTime localDateTime57 = localDateTime48.minus(readablePeriod56);
        org.joda.time.LocalDateTime.Property property58 = localDateTime48.millisOfSecond();
        long long59 = property58.remainder();
        java.lang.String str60 = property58.getName();
        int int61 = property58.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime63 = property58.addWrapFieldToCopy(70);
        org.joda.time.LocalDateTime localDateTime64 = property58.roundFloorCopy();
        boolean boolean65 = strSet45.remove((java.lang.Object) localDateTime64);
        org.joda.time.DateTimeZone dateTimeZone66 = null;
        org.joda.time.DateTime dateTime67 = localDateTime64.toDateTime(dateTimeZone66);
        org.joda.time.Instant instant68 = dateTime67.toInstant();
        boolean boolean69 = dateTime39.isAfter((org.joda.time.ReadableInstant) dateTime67);
        org.joda.time.LocalDateTime localDateTime71 = new org.joda.time.LocalDateTime((long) 1);
        int int72 = localDateTime71.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime74 = localDateTime71.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone76 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology77 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone76);
        org.joda.time.DateTime dateTime78 = localDateTime71.toDateTime(dateTimeZone76);
        org.joda.time.LocalDateTime localDateTime80 = new org.joda.time.LocalDateTime((long) 1);
        int int81 = localDateTime80.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime83 = localDateTime80.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone85 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology86 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone85);
        org.joda.time.DateTime dateTime87 = localDateTime80.toDateTime(dateTimeZone85);
        long long88 = dateTime87.getMillis();
        boolean boolean89 = dateTime78.isAfter((org.joda.time.ReadableInstant) dateTime87);
        boolean boolean90 = dateTime39.isAfter((org.joda.time.ReadableInstant) dateTime87);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime67 and instant68", (dateTime67.compareTo(instant68) == 0) == dateTime67.equals(instant68));
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test504");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology2.hourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology2.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology2.halfdayOfDay();
        org.joda.time.DurationField durationField8 = islamicChronology2.eras();
        org.joda.time.DurationField durationField9 = islamicChronology2.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField8", Math.signum(durationField3.compareTo(durationField8)) == -Math.signum(durationField8.compareTo(durationField3)));
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test505");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        int int2 = localDateTime1.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.minusHours((int) (byte) -1);
        int int5 = localDateTime1.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.minusMinutes((int) '#');
        org.joda.time.LocalDateTime localDateTime9 = localDateTime1.plusMonths((-1));
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = localDateTime9.getFieldType((int) (short) 0);
        org.joda.time.LocalDateTime.Property property12 = localDateTime9.year();
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((long) 1);
        int int15 = localDateTime14.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime17 = localDateTime14.withYear((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        org.joda.time.LocalDateTime localDateTime20 = localDateTime17.withPeriodAdded(readablePeriod18, 10);
        int int21 = localDateTime20.getMinuteOfHour();
        org.joda.time.LocalDateTime.Property property22 = localDateTime20.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime23 = property22.roundCeilingCopy();
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
        org.joda.time.Instant instant45 = dateTime41.toInstant();
        int int46 = property22.compareTo((org.joda.time.ReadableInstant) instant45);
        int int47 = property12.getDifference((org.joda.time.ReadableInstant) instant45);
        int int48 = property12.getMinimumValueOverall();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime32 and instant45", (dateTime32.compareTo(instant45) == 0) == dateTime32.equals(instant45));
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
        org.joda.time.DateTimeField dateTimeField30 = islamicChronology2.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone31 = islamicChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField32 = islamicChronology2.halfdayOfDay();
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime((long) 1);
        int int35 = localDateTime34.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime37 = localDateTime34.minusHours((int) (byte) -1);
        int int39 = localDateTime34.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime41 = localDateTime34.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod42 = null;
        org.joda.time.LocalDateTime localDateTime43 = localDateTime34.minus(readablePeriod42);
        org.joda.time.LocalDateTime.Property property44 = localDateTime34.millisOfSecond();
        long long45 = property44.remainder();
        java.util.Locale locale46 = java.util.Locale.KOREA;
        java.util.Locale locale47 = java.util.Locale.KOREA;
        java.lang.String str48 = locale46.getDisplayLanguage(locale47);
        java.util.Locale.setDefault(locale46);
        int int50 = property44.getMaximumShortTextLength(locale46);
        java.lang.String str51 = locale46.getCountry();
        java.lang.String str52 = locale46.getDisplayCountry();
        org.joda.time.LocalDateTime localDateTime54 = new org.joda.time.LocalDateTime((long) 1);
        int int55 = localDateTime54.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime57 = localDateTime54.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone59 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology60 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone59);
        org.joda.time.DateTime dateTime61 = localDateTime54.toDateTime(dateTimeZone59);
        org.joda.time.LocalDateTime localDateTime63 = new org.joda.time.LocalDateTime((long) 1);
        int int64 = localDateTime63.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime66 = localDateTime63.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone68 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology69 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone68);
        org.joda.time.DateTime dateTime70 = localDateTime63.toDateTime(dateTimeZone68);
        long long71 = dateTime70.getMillis();
        boolean boolean72 = dateTime61.isAfter((org.joda.time.ReadableInstant) dateTime70);
        org.joda.time.DateTimeZone dateTimeZone73 = dateTime61.getZone();
        org.joda.time.DateTimeZone dateTimeZone76 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology77 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone76);
        org.joda.time.DurationField durationField78 = islamicChronology77.weekyears();
        org.joda.time.DurationField durationField79 = islamicChronology77.halfdays();
        org.joda.time.DateTimeField dateTimeField80 = islamicChronology77.yearOfEra();
        org.joda.time.DurationField durationField81 = islamicChronology77.halfdays();
        org.joda.time.LocalDateTime localDateTime82 = new org.joda.time.LocalDateTime((org.joda.time.Chronology) islamicChronology77);
        org.joda.time.DateTimeField dateTimeField83 = islamicChronology77.yearOfEra();
        java.util.Locale locale84 = java.util.Locale.US;
        int int85 = dateTimeField83.getMaximumShortTextLength(locale84);
        java.lang.String str86 = locale84.getDisplayLanguage();
        java.lang.String str87 = dateTimeZone73.getName(9000L, locale84);
        java.lang.String str88 = locale46.getDisplayLanguage(locale84);
        int int89 = dateTimeField32.getMaximumShortTextLength(locale84);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField78", (durationField4.compareTo(durationField78) == 0) == durationField4.equals(durationField78));
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test507");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DurationField durationField4 = islamicChronology2.months();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.minuteOfHour();
        org.joda.time.DurationField durationField6 = islamicChronology2.hours();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology2.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime((long) 1);
        int int10 = localDateTime9.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime9.minusHours((int) (byte) -1);
        int int13 = localDateTime9.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime9.minusMinutes((int) '#');
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.centuryOfEra();
        java.util.Locale locale18 = java.util.Locale.FRENCH;
        java.lang.String str19 = dateTimeField7.getAsShortText((org.joda.time.ReadablePartial) localDateTime15, (int) (short) 100, locale18);
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime((long) 1);
        int int22 = localDateTime21.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime24 = localDateTime21.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology27 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone26);
        org.joda.time.DateTime dateTime28 = localDateTime21.toDateTime(dateTimeZone26);
        org.joda.time.ReadableInstant readableInstant29 = null;
        boolean boolean30 = dateTime28.isAfter(readableInstant29);
        org.joda.time.Instant instant31 = dateTime28.toInstant();
        org.joda.time.DateTime dateTime32 = localDateTime15.toDateTime((org.joda.time.ReadableInstant) instant31);
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology35 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone34);
        org.joda.time.DateTimeField dateTimeField36 = islamicChronology35.yearOfCentury();
        org.joda.time.DurationField durationField37 = islamicChronology35.years();
        org.joda.time.LocalDateTime localDateTime39 = new org.joda.time.LocalDateTime((long) 1);
        int int40 = localDateTime39.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime42 = localDateTime39.minusHours((int) (byte) -1);
        int int44 = localDateTime39.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime46 = localDateTime39.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod47 = null;
        org.joda.time.LocalDateTime localDateTime48 = localDateTime39.minus(readablePeriod47);
        int int49 = localDateTime48.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField51 = localDateTime48.getField(0);
        org.joda.time.LocalDateTime.Property property52 = localDateTime48.centuryOfEra();
        int[] intArray54 = islamicChronology35.get((org.joda.time.ReadablePartial) localDateTime48, (long) 0);
        org.joda.time.DateTimeField dateTimeField55 = islamicChronology35.millisOfDay();
        org.joda.time.DurationField durationField56 = islamicChronology35.centuries();
        org.joda.time.DateTimeField dateTimeField57 = islamicChronology35.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone58 = islamicChronology35.getZone();
        org.joda.time.LocalDateTime localDateTime59 = org.joda.time.LocalDateTime.now(dateTimeZone58);
        org.joda.time.LocalDateTime localDateTime61 = localDateTime59.plusMonths(12);
        int int62 = localDateTime59.getEra();
        org.joda.time.LocalDateTime localDateTime64 = localDateTime59.minusSeconds(53);
        boolean boolean65 = localDateTime15.isEqual((org.joda.time.ReadablePartial) localDateTime59);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField37", (durationField3.compareTo(durationField37) == 0) == durationField3.equals(durationField37));
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test508");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology2.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.minuteOfHour();
        org.joda.time.DurationField durationField6 = islamicChronology2.years();
        org.joda.time.DurationField durationField7 = islamicChronology2.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField6", (durationField3.compareTo(durationField6) == 0) == durationField3.equals(durationField6));
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test509");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = islamicChronology2.years();
        org.joda.time.DurationField durationField5 = islamicChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology2.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone8 = islamicChronology2.getZone();
        org.joda.time.Chronology chronology9 = islamicChronology2.withUTC();
        org.joda.time.DurationField durationField10 = islamicChronology2.years();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology2.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology14 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone13);
        org.joda.time.DurationField durationField15 = islamicChronology14.weekyears();
        org.joda.time.DateTimeField dateTimeField16 = islamicChronology14.hourOfDay();
        org.joda.time.DateTimeField dateTimeField17 = islamicChronology14.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime((long) 1);
        int int20 = localDateTime19.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime22 = localDateTime19.minusHours((int) (byte) -1);
        int int24 = localDateTime19.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime19.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        org.joda.time.LocalDateTime localDateTime28 = localDateTime19.minus(readablePeriod27);
        int int29 = localDateTime28.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField31 = localDateTime28.getField(0);
        org.joda.time.LocalDateTime.Property property32 = localDateTime28.centuryOfEra();
        org.joda.time.ReadableDuration readableDuration33 = null;
        org.joda.time.LocalDateTime localDateTime34 = localDateTime28.plus(readableDuration33);
        int int35 = dateTimeField17.getMaximumValue((org.joda.time.ReadablePartial) localDateTime34);
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
        org.joda.time.LocalDateTime localDateTime52 = localDateTime46.withMonthOfYear((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime54 = localDateTime52.minusDays(10);
        org.joda.time.LocalDateTime localDateTime56 = localDateTime52.withYear(292278993);
        int[] intArray57 = localDateTime52.getValues();
        islamicChronology2.validate((org.joda.time.ReadablePartial) localDateTime34, intArray57);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField15", (durationField4.compareTo(durationField15) == 0) == durationField4.equals(durationField15));
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test510");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        boolean boolean1 = locale0.hasExtensions();
        java.util.Locale locale2 = locale0.stripExtensions();
        java.lang.String str3 = locale0.getDisplayCountry();
        java.util.Set<java.lang.String> strSet4 = locale0.getUnicodeLocaleKeys();
        java.util.Set<java.lang.String> strSet5 = locale0.getUnicodeLocaleAttributes();
        java.util.TimeZone timeZone7 = java.util.TimeZone.getTimeZone("");
        java.util.TimeZone timeZone9 = java.util.TimeZone.getTimeZone("");
        boolean boolean10 = timeZone7.hasSameRules(timeZone9);
        boolean boolean11 = strSet5.equals((java.lang.Object) timeZone7);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology14 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone13);
        org.joda.time.DurationField durationField15 = islamicChronology14.weekyears();
        org.joda.time.DurationField durationField16 = islamicChronology14.millis();
        org.joda.time.DurationField durationField17 = islamicChronology14.hours();
        org.joda.time.DurationField durationField18 = islamicChronology14.weekyears();
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime((org.joda.time.Chronology) islamicChronology14);
        boolean boolean20 = strSet5.contains((java.lang.Object) islamicChronology14);
        java.util.Locale locale21 = java.util.Locale.TAIWAN;
        boolean boolean22 = locale21.hasExtensions();
        java.util.Locale locale23 = locale21.stripExtensions();
        java.lang.String str24 = locale21.getDisplayCountry();
        java.util.Set<java.lang.String> strSet25 = locale21.getUnicodeLocaleKeys();
        java.util.Set<java.lang.String> strSet26 = locale21.getUnicodeLocaleAttributes();
        strSet26.clear();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology30 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone29);
        org.joda.time.DateTimeField dateTimeField31 = islamicChronology30.yearOfCentury();
        org.joda.time.DurationField durationField32 = islamicChronology30.years();
        org.joda.time.DurationField durationField33 = islamicChronology30.halfdays();
        org.joda.time.DateTimeField dateTimeField34 = islamicChronology30.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField35 = islamicChronology30.dayOfYear();
        org.joda.time.DateTimeField dateTimeField36 = islamicChronology30.hourOfHalfday();
        org.joda.time.DurationField durationField37 = islamicChronology30.minutes();
        boolean boolean38 = strSet26.equals((java.lang.Object) islamicChronology30);
        boolean boolean39 = strSet5.containsAll((java.util.Collection<java.lang.String>) strSet26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField15 and durationField32", (durationField15.compareTo(durationField32) == 0) == durationField15.equals(durationField32));
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test511");
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
        org.joda.time.DateTimeField dateTimeField15 = islamicChronology2.era();
        org.joda.time.DateTimeField dateTimeField16 = islamicChronology2.minuteOfHour();
        org.joda.time.DurationField durationField17 = islamicChronology2.years();
        org.joda.time.DateTimeField dateTimeField18 = islamicChronology2.era();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField17", (durationField3.compareTo(durationField17) == 0) == durationField3.equals(durationField17));
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
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology2.halfdayOfDay();
        org.joda.time.DurationField durationField7 = islamicChronology2.halfdays();
        org.joda.time.DateTimeZone dateTimeZone8 = islamicChronology2.getZone();
        org.joda.time.DurationField durationField9 = islamicChronology2.millis();
        java.lang.String str10 = islamicChronology2.toString();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology2.era();
        org.joda.time.DurationField durationField12 = islamicChronology2.years();
        int int13 = islamicChronology2.getMinimumDaysInFirstWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField12", (durationField3.compareTo(durationField12) == 0) == durationField3.equals(durationField12));
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
        org.joda.time.DurationField durationField26 = islamicChronology2.minutes();
        org.joda.time.DurationField durationField27 = islamicChronology2.years();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType28 = islamicChronology2.getLeapYearPatternType();
        org.joda.time.DurationField durationField29 = islamicChronology2.days();
        org.joda.time.DateTimeField dateTimeField30 = islamicChronology2.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField31 = islamicChronology2.weekyearOfCentury();
        org.joda.time.DurationField durationField32 = islamicChronology2.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField32, durationField4, and durationField23", !(durationField32.compareTo(durationField4) == 0) || (Math.signum(durationField32.compareTo(durationField23)) == Math.signum(durationField4.compareTo(durationField23))));
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test514");
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
        org.joda.time.DateTimeField dateTimeField28 = islamicChronology2.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField29 = islamicChronology2.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone30 = islamicChronology2.getZone();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType31 = islamicChronology2.getLeapYearPatternType();
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology34 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone33);
        org.joda.time.DurationField durationField35 = islamicChronology34.weekyears();
        org.joda.time.DateTimeField dateTimeField36 = islamicChronology34.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone37 = islamicChronology34.getZone();
        int int39 = dateTimeZone37.getOffsetFromLocal(19800L);
        long long42 = dateTimeZone37.adjustOffset((long) 11, false);
        org.joda.time.Chronology chronology43 = islamicChronology2.withZone(dateTimeZone37);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField35", (durationField4.compareTo(durationField35) == 0) == durationField4.equals(durationField35));
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test515");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology2.weekyear();
        org.joda.time.DurationField durationField4 = islamicChronology2.years();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology2.hourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology2.hourOfHalfday();
        org.joda.time.DurationField durationField8 = islamicChronology2.centuries();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology2.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology12 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone11);
        boolean boolean14 = dateTimeZone11.equals((java.lang.Object) 10L);
        java.lang.String str16 = dateTimeZone11.getName((long) (short) 100);
        long long20 = dateTimeZone11.convertLocalToUTC(2143234800001L, false, (-3599999L));
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology23 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone22);
        org.joda.time.DurationField durationField24 = islamicChronology23.weekyears();
        org.joda.time.DateTimeField dateTimeField25 = islamicChronology23.hourOfDay();
        org.joda.time.DateTimeField dateTimeField26 = islamicChronology23.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField27 = islamicChronology23.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField28 = islamicChronology23.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime((long) 1);
        int int31 = localDateTime30.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime33 = localDateTime30.minusHours((int) (byte) -1);
        int int34 = localDateTime30.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime36 = localDateTime30.minusMinutes((int) '#');
        org.joda.time.LocalDateTime.Property property37 = localDateTime36.centuryOfEra();
        java.lang.String str38 = localDateTime36.toString();
        int int39 = localDateTime36.getWeekOfWeekyear();
        org.joda.time.LocalDateTime.Property property40 = localDateTime36.era();
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology43 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone42);
        org.joda.time.DurationField durationField44 = islamicChronology43.weekyears();
        org.joda.time.DurationField durationField45 = islamicChronology43.months();
        org.joda.time.DateTimeField dateTimeField46 = islamicChronology43.halfdayOfDay();
        org.joda.time.LocalDateTime localDateTime48 = new org.joda.time.LocalDateTime((long) 1);
        int int49 = localDateTime48.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime51 = localDateTime48.minusHours((int) (byte) -1);
        int int53 = localDateTime48.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime55 = localDateTime48.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod56 = null;
        org.joda.time.LocalDateTime localDateTime57 = localDateTime48.minus(readablePeriod56);
        int int58 = localDateTime57.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField60 = localDateTime57.getField(0);
        org.joda.time.LocalDateTime.Property property61 = localDateTime57.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime63 = new org.joda.time.LocalDateTime((long) 1);
        int int64 = localDateTime63.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime66 = localDateTime63.withYear((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod67 = null;
        org.joda.time.LocalDateTime localDateTime69 = localDateTime66.withPeriodAdded(readablePeriod67, 10);
        org.joda.time.LocalDateTime localDateTime71 = localDateTime69.withDayOfYear(11);
        int[] intArray72 = localDateTime71.getValues();
        islamicChronology43.validate((org.joda.time.ReadablePartial) localDateTime57, intArray72);
        int int74 = dateTimeField28.getMaximumValue((org.joda.time.ReadablePartial) localDateTime36, intArray72);
        org.joda.time.DateTimeZone dateTimeZone75 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime76 = localDateTime36.toDateTime(dateTimeZone75);
        long long77 = dateTime76.getMillis();
        int int78 = dateTimeZone11.getOffset((org.joda.time.ReadableInstant) dateTime76);
        boolean boolean79 = dateTimeZone11.isFixed();
        org.joda.time.Chronology chronology80 = islamicChronology2.withZone(dateTimeZone11);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField24", (durationField4.compareTo(durationField24) == 0) == durationField4.equals(durationField24));
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test516");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DurationField durationField4 = islamicChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.yearOfEra();
        org.joda.time.DurationField durationField6 = islamicChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology2.secondOfDay();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        long long11 = islamicChronology2.add(readablePeriod8, (long) 3600001, 0);
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology2.secondOfDay();
        org.joda.time.Chronology chronology13 = islamicChronology2.withUTC();
        org.joda.time.DurationField durationField14 = islamicChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField15 = islamicChronology2.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField16 = islamicChronology2.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField17 = islamicChronology2.era();
        org.joda.time.DurationField durationField18 = islamicChronology2.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField18, durationField3, and durationField4", !(durationField18.compareTo(durationField3) == 0) || (Math.signum(durationField18.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test517");
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
        java.util.Locale locale44 = locale39.stripExtensions();
        java.util.Set<java.lang.String> strSet45 = locale44.getUnicodeLocaleAttributes();
        java.lang.Object[] objArray46 = strSet45.toArray();
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology49 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone48);
        org.joda.time.DateTimeField dateTimeField50 = islamicChronology49.yearOfCentury();
        org.joda.time.DurationField durationField51 = islamicChronology49.years();
        org.joda.time.DurationField durationField52 = islamicChronology49.halfdays();
        org.joda.time.DateTimeField dateTimeField53 = islamicChronology49.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField54 = islamicChronology49.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone55 = islamicChronology49.getZone();
        org.joda.time.Chronology chronology56 = islamicChronology49.withUTC();
        org.joda.time.DurationField durationField57 = islamicChronology49.years();
        org.joda.time.DateTimeField dateTimeField58 = islamicChronology49.era();
        org.joda.time.DateTimeField dateTimeField59 = islamicChronology49.dayOfWeek();
        boolean boolean60 = strSet45.remove((java.lang.Object) islamicChronology49);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField51", (durationField3.compareTo(durationField51) == 0) == durationField3.equals(durationField51));
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test518");
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
        org.joda.time.DateTimeField dateTimeField30 = islamicChronology2.halfdayOfDay();
        org.joda.time.Chronology chronology31 = islamicChronology2.withUTC();
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology34 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone33);
        org.joda.time.DateTimeField dateTimeField35 = islamicChronology34.yearOfCentury();
        org.joda.time.DurationField durationField36 = islamicChronology34.years();
        org.joda.time.DurationField durationField37 = islamicChronology34.halfdays();
        org.joda.time.DateTimeField dateTimeField38 = islamicChronology34.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField39 = islamicChronology34.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone40 = islamicChronology34.getZone();
        java.util.TimeZone timeZone41 = dateTimeZone40.toTimeZone();
        org.joda.time.Chronology chronology42 = chronology31.withZone(dateTimeZone40);
        int int44 = dateTimeZone40.getOffsetFromLocal((-34586034507360L));
        org.joda.time.LocalDateTime localDateTime46 = new org.joda.time.LocalDateTime((long) 1);
        int int47 = localDateTime46.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime49 = localDateTime46.minusHours((int) (byte) -1);
        int int51 = localDateTime46.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime53 = localDateTime46.withMillisOfSecond((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime55 = new org.joda.time.LocalDateTime((long) 1);
        int int56 = localDateTime55.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime58 = localDateTime55.minusHours((int) (byte) -1);
        int int60 = localDateTime55.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime62 = localDateTime55.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod63 = null;
        org.joda.time.LocalDateTime localDateTime64 = localDateTime55.minus(readablePeriod63);
        org.joda.time.LocalDateTime.Property property65 = localDateTime55.millisOfSecond();
        long long66 = property65.remainder();
        java.lang.String str67 = property65.getName();
        java.util.Locale locale68 = java.util.Locale.CHINA;
        java.lang.String str69 = property65.getAsText(locale68);
        org.joda.time.LocalDateTime localDateTime70 = property65.withMinimumValue();
        org.joda.time.LocalDateTime localDateTime72 = localDateTime70.plusYears(4);
        org.joda.time.ReadablePeriod readablePeriod73 = null;
        org.joda.time.LocalDateTime localDateTime74 = localDateTime72.plus(readablePeriod73);
        org.joda.time.DateTimeZone dateTimeZone76 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology77 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone76);
        org.joda.time.DurationField durationField78 = islamicChronology77.weekyears();
        org.joda.time.DurationField durationField79 = islamicChronology77.halfdays();
        org.joda.time.DurationField durationField80 = islamicChronology77.weeks();
        org.joda.time.DateTimeField dateTimeField81 = islamicChronology77.yearOfEra();
        org.joda.time.LocalDateTime localDateTime83 = new org.joda.time.LocalDateTime((long) 1);
        int int84 = localDateTime83.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime86 = localDateTime83.minusHours((int) (byte) -1);
        org.joda.time.DateTimeField[] dateTimeFieldArray87 = localDateTime86.getFields();
        java.util.Locale locale88 = java.util.Locale.KOREA;
        java.util.Locale locale89 = java.util.Locale.KOREA;
        java.lang.String str90 = locale88.getDisplayLanguage(locale89);
        java.lang.String str91 = dateTimeField81.getAsText((org.joda.time.ReadablePartial) localDateTime86, locale88);
        org.joda.time.DateTimeFieldType dateTimeFieldType92 = dateTimeField81.getType();
        org.joda.time.LocalDateTime localDateTime94 = localDateTime72.withField(dateTimeFieldType92, (int) ' ');
        int int95 = localDateTime53.get(dateTimeFieldType92);
        int int96 = localDateTime53.size();
        org.joda.time.DateTime dateTime97 = localDateTime53.toDateTime();
        org.joda.time.Instant instant98 = dateTime97.toInstant();
        int int99 = dateTimeZone40.getOffset((org.joda.time.ReadableInstant) dateTime97);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField78", (durationField4.compareTo(durationField78) == 0) == durationField4.equals(durationField78));
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test519");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = islamicChronology2.years();
        org.joda.time.DurationField durationField5 = islamicChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology2.hourOfHalfday();
        org.joda.time.DurationField durationField7 = islamicChronology2.weeks();
        long long11 = islamicChronology2.add(100L, 1970L, 10);
        org.joda.time.DurationField durationField12 = islamicChronology2.seconds();
        org.joda.time.DateTimeField dateTimeField13 = islamicChronology2.weekyearOfCentury();
        org.joda.time.DurationField durationField14 = islamicChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField15 = islamicChronology2.dayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField14", (durationField4.compareTo(durationField14) == 0) == durationField4.equals(durationField14));
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test520");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology2.weekyear();
        org.joda.time.DurationField durationField4 = islamicChronology2.years();
        org.joda.time.DurationField durationField5 = islamicChronology2.weekyears();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology8 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone7);
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology8.yearOfCentury();
        org.joda.time.DurationField durationField10 = islamicChronology8.years();
        org.joda.time.DurationField durationField11 = islamicChronology8.halfdays();
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology8.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField13 = islamicChronology8.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone14 = islamicChronology8.getZone();
        org.joda.time.Chronology chronology15 = islamicChronology2.withZone(dateTimeZone14);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField5", (durationField4.compareTo(durationField5) == 0) == durationField4.equals(durationField5));
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test521");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DurationField durationField4 = islamicChronology2.months();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.halfdayOfDay();
        org.joda.time.DurationField durationField6 = islamicChronology2.millis();
        java.lang.String str7 = islamicChronology2.toString();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology2.secondOfMinute();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        long long12 = islamicChronology2.add(readablePeriod9, (long) 1969, 30);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology16 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone15);
        boolean boolean17 = dateTimeZone15.isFixed();
        long long21 = dateTimeZone15.convertLocalToUTC((long) (byte) 100, false, 10L);
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime((long) 86399, dateTimeZone15);
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime(dateTimeZone15);
        org.joda.time.chrono.IslamicChronology islamicChronology24 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone15);
        org.joda.time.Chronology chronology25 = islamicChronology2.withZone(dateTimeZone15);
        long long29 = dateTimeZone15.convertLocalToUTC(19360364400000L, false, 115200999L);
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology32 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone31);
        org.joda.time.DateTimeField dateTimeField33 = islamicChronology32.weekyear();
        org.joda.time.DurationField durationField34 = islamicChronology32.years();
        org.joda.time.DateTimeField dateTimeField35 = islamicChronology32.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone36 = islamicChronology32.getZone();
        org.joda.time.DateTimeField dateTimeField37 = islamicChronology32.clockhourOfDay();
        org.joda.time.LocalDateTime localDateTime39 = new org.joda.time.LocalDateTime((long) 1);
        int int40 = localDateTime39.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime42 = localDateTime39.minusHours((int) (byte) -1);
        int int43 = localDateTime39.getSecondOfMinute();
        int int44 = localDateTime39.getCenturyOfEra();
        long long46 = islamicChronology32.set((org.joda.time.ReadablePartial) localDateTime39, 70L);
        org.joda.time.LocalDateTime.Property property47 = localDateTime39.era();
        org.joda.time.LocalDateTime localDateTime49 = localDateTime39.withCenturyOfEra(19);
        org.joda.time.LocalDateTime.Property property50 = localDateTime39.yearOfCentury();
        int int51 = localDateTime39.getMillisOfDay();
        boolean boolean52 = dateTimeZone15.isLocalDateTimeGap(localDateTime39);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField34", (durationField3.compareTo(durationField34) == 0) == durationField3.equals(durationField34));
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test522");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = islamicChronology2.years();
        org.joda.time.DurationField durationField5 = islamicChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology2.hourOfHalfday();
        org.joda.time.DurationField durationField7 = islamicChronology2.weeks();
        long long11 = islamicChronology2.add(100L, 1970L, 10);
        java.util.Locale locale13 = new java.util.Locale("7");
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology17 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone16);
        org.joda.time.DurationField durationField18 = islamicChronology17.weekyears();
        org.joda.time.DurationField durationField19 = islamicChronology17.halfdays();
        org.joda.time.DateTimeField dateTimeField20 = islamicChronology17.yearOfEra();
        org.joda.time.DateTimeField dateTimeField21 = islamicChronology17.minuteOfHour();
        org.joda.time.DurationField durationField22 = islamicChronology17.centuries();
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime((long) 1);
        int int25 = localDateTime24.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime27 = localDateTime24.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology30 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone29);
        org.joda.time.DateTime dateTime31 = localDateTime24.toDateTime(dateTimeZone29);
        long long35 = dateTimeZone29.convertLocalToUTC(0L, true, (-4320000001L));
        java.lang.String str37 = dateTimeZone29.getNameKey((long) 1443);
        org.joda.time.Chronology chronology38 = islamicChronology17.withZone(dateTimeZone29);
        long long42 = dateTimeZone29.convertLocalToUTC((long) 6, false, 19360365006266L);
        org.joda.time.LocalDateTime localDateTime43 = new org.joda.time.LocalDateTime(3L, dateTimeZone29);
        org.joda.time.LocalDateTime localDateTime44 = new org.joda.time.LocalDateTime((java.lang.Object) "7", dateTimeZone29);
        org.joda.time.Chronology chronology45 = islamicChronology2.withZone(dateTimeZone29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField18", (durationField4.compareTo(durationField18) == 0) == durationField4.equals(durationField18));
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test523");
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
        org.joda.time.DateTimeField dateTimeField15 = islamicChronology2.era();
        org.joda.time.DateTimeField dateTimeField16 = islamicChronology2.minuteOfHour();
        org.joda.time.DurationField durationField17 = islamicChronology2.eras();
        org.joda.time.DateTimeField dateTimeField18 = islamicChronology2.clockhourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField17", Math.signum(durationField3.compareTo(durationField17)) == -Math.signum(durationField17.compareTo(durationField3)));
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test524");
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 1);
        int int3 = localDateTime2.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology8 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone7);
        org.joda.time.DateTime dateTime9 = localDateTime2.toDateTime(dateTimeZone7);
        java.lang.String str10 = dateTimeZone7.getID();
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((-20217598030L), dateTimeZone7);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.minusWeeks((int) (short) 0);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalDateTime localDateTime15 = localDateTime11.minus(readablePeriod14);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime11.withWeekyear(82800001);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.plusMinutes(32);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 0);
        java.util.TimeZone timeZone22 = dateTimeZone21.toTimeZone();
        boolean boolean24 = dateTimeZone21.isStandardOffset((long) 60);
        java.lang.String str26 = dateTimeZone21.getShortName((long) 3600001);
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime((long) 1);
        int int29 = localDateTime28.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime31 = localDateTime28.minusHours((int) (byte) -1);
        int int32 = localDateTime28.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime34 = localDateTime28.minusMinutes((int) '#');
        org.joda.time.LocalDateTime.Property property35 = localDateTime34.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime36 = property35.roundCeilingCopy();
        java.lang.String str37 = property35.toString();
        org.joda.time.LocalDateTime localDateTime39 = new org.joda.time.LocalDateTime((long) 1);
        int int40 = localDateTime39.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime42 = localDateTime39.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology45 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone44);
        org.joda.time.DateTime dateTime46 = localDateTime39.toDateTime(dateTimeZone44);
        org.joda.time.ReadableInstant readableInstant47 = null;
        boolean boolean48 = dateTime46.isAfter(readableInstant47);
        org.joda.time.Instant instant49 = dateTime46.toInstant();
        int int50 = property35.compareTo((org.joda.time.ReadableInstant) dateTime46);
        int int51 = dateTimeZone21.getOffset((org.joda.time.ReadableInstant) dateTime46);
        org.joda.time.Chronology chronology52 = dateTime46.getChronology();
        org.joda.time.LocalDateTime localDateTime54 = new org.joda.time.LocalDateTime((long) 1);
        int int55 = localDateTime54.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime57 = localDateTime54.minusHours((int) (byte) -1);
        org.joda.time.DateTimeField[] dateTimeFieldArray58 = localDateTime57.getFields();
        org.joda.time.LocalDateTime localDateTime60 = localDateTime57.minusDays(4);
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
        org.joda.time.LocalDateTime.Property property76 = localDateTime71.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime81 = localDateTime71.withTime((int) (byte) 1, 0, 5, (int) (byte) 100);
        boolean boolean82 = localDateTime57.isBefore((org.joda.time.ReadablePartial) localDateTime81);
        org.joda.time.LocalDateTime.Property property83 = localDateTime81.weekyear();
        org.joda.time.LocalDateTime localDateTime85 = localDateTime81.withDayOfWeek(5);
        org.joda.time.LocalDateTime localDateTime87 = localDateTime81.minusMillis(0);
        org.joda.time.LocalDateTime.Property property88 = localDateTime81.weekOfWeekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType89 = property88.getFieldType();
        int int90 = dateTime46.get(dateTimeFieldType89);
        int int91 = localDateTime19.get(dateTimeFieldType89);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and instant49", (dateTime9.compareTo(instant49) == 0) == dateTime9.equals(instant49));
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test525");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DurationField durationField4 = islamicChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.yearOfEra();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology2.halfdayOfDay();
        org.joda.time.DurationField durationField7 = islamicChronology2.halfdays();
        org.joda.time.DateTimeZone dateTimeZone8 = islamicChronology2.getZone();
        java.lang.String str9 = islamicChronology2.toString();
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((long) 1);
        int int12 = localDateTime11.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.minusHours((int) (byte) -1);
        int int15 = localDateTime11.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime17 = localDateTime11.minusMinutes((int) '#');
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime19 = property18.roundCeilingCopy();
        int[] intArray21 = islamicChronology2.get((org.joda.time.ReadablePartial) localDateTime19, (long) 354);
        org.joda.time.DateTimeField dateTimeField22 = islamicChronology2.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField23 = islamicChronology2.secondOfMinute();
        org.joda.time.DurationField durationField24 = islamicChronology2.halfdays();
        org.joda.time.DateTimeZone dateTimeZone25 = islamicChronology2.getZone();
        org.joda.time.DurationField durationField26 = islamicChronology2.millis();
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
        org.joda.time.DurationField durationField50 = islamicChronology29.centuries();
        org.joda.time.DateTimeZone dateTimeZone51 = islamicChronology29.getZone();
        org.joda.time.DateTimeField dateTimeField52 = islamicChronology29.dayOfWeek();
        org.joda.time.DurationField durationField53 = islamicChronology29.minutes();
        org.joda.time.DateTimeField dateTimeField54 = islamicChronology29.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField55 = islamicChronology29.hourOfHalfday();
        org.joda.time.DurationField durationField56 = islamicChronology29.years();
        org.joda.time.DurationField durationField57 = islamicChronology29.minutes();
        org.joda.time.DurationField durationField58 = islamicChronology29.millis();
        int int59 = durationField26.compareTo(durationField58);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField31", (durationField3.compareTo(durationField31) == 0) == durationField3.equals(durationField31));
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test526");
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
        org.joda.time.DateTimeField dateTimeField31 = islamicChronology2.year();
        org.joda.time.DateTimeField dateTimeField32 = islamicChronology2.era();
        org.joda.time.DurationField durationField33 = islamicChronology2.years();
        org.joda.time.DateTimeField dateTimeField34 = islamicChronology2.minuteOfHour();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField33", (durationField3.compareTo(durationField33) == 0) == durationField3.equals(durationField33));
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test527");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology2.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology7 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone6);
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology7.yearOfCentury();
        org.joda.time.DurationField durationField9 = islamicChronology7.years();
        org.joda.time.DurationField durationField10 = islamicChronology7.halfdays();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology7.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology7.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone13 = islamicChronology7.getZone();
        java.util.TimeZone timeZone14 = dateTimeZone13.toTimeZone();
        org.joda.time.Chronology chronology15 = islamicChronology2.withZone(dateTimeZone13);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField9", (durationField3.compareTo(durationField9) == 0) == durationField3.equals(durationField9));
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test528");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        int int2 = localDateTime1.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology7 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone6);
        org.joda.time.DateTime dateTime8 = localDateTime1.toDateTime(dateTimeZone6);
        long long9 = dateTime8.getMillis();
        long long10 = dateTime8.getMillis();
        long long11 = dateTime8.getMillis();
        org.joda.time.Instant instant12 = dateTime8.toInstant();
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
        org.joda.time.Chronology chronology46 = dateTime41.getChronology();
        boolean boolean47 = dateTime8.isAfter((org.joda.time.ReadableInstant) dateTime41);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant12 and dateTime21", (instant12.compareTo(dateTime21) == 0) == instant12.equals(dateTime21));
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test529");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        int int2 = localDateTime1.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.minusHours((int) (byte) -1);
        int int6 = localDateTime1.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.LocalDateTime localDateTime10 = localDateTime1.minus(readablePeriod9);
        org.joda.time.LocalDateTime.Property property11 = localDateTime1.secondOfMinute();
        org.joda.time.DurationField durationField12 = property11.getDurationField();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology15 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone14);
        org.joda.time.DateTimeField dateTimeField16 = islamicChronology15.weekyear();
        org.joda.time.DurationField durationField17 = islamicChronology15.years();
        org.joda.time.DateTimeField dateTimeField18 = islamicChronology15.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone19 = islamicChronology15.getZone();
        org.joda.time.DateTimeField dateTimeField20 = islamicChronology15.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField21 = islamicChronology15.secondOfMinute();
        org.joda.time.DurationField durationField22 = islamicChronology15.eras();
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
        org.joda.time.LocalDateTime.Property property38 = localDateTime33.hourOfDay();
        org.joda.time.DurationField durationField39 = property38.getDurationField();
        int int40 = durationField22.compareTo(durationField39);
        int int41 = durationField12.compareTo(durationField39);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField17 and durationField22", Math.signum(durationField17.compareTo(durationField22)) == -Math.signum(durationField22.compareTo(durationField17)));
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test530");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology2.secondOfMinute();
        org.joda.time.DurationField durationField5 = islamicChronology2.centuries();
        org.joda.time.DurationField durationField6 = islamicChronology2.hours();
        org.joda.time.DurationField durationField7 = islamicChronology2.seconds();
        org.joda.time.DurationField durationField8 = islamicChronology2.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField8, durationField5, and durationField6", !(durationField8.compareTo(durationField5) == 0) || (Math.signum(durationField8.compareTo(durationField6)) == Math.signum(durationField5.compareTo(durationField6))));
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test531");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone2);
        org.joda.time.DurationField durationField4 = islamicChronology3.weekyears();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology3.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone6 = islamicChronology3.getZone();
        java.lang.String str7 = dateTimeZone6.toString();
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) (-1), dateTimeZone6);
        java.util.TimeZone timeZone10 = java.util.TimeZone.getTimeZone("");
        java.util.TimeZone timeZone12 = java.util.TimeZone.getTimeZone("");
        boolean boolean13 = timeZone10.hasSameRules(timeZone12);
        timeZone12.setRawOffset(11);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        java.util.TimeZone timeZone17 = dateTimeZone16.toTimeZone();
        org.joda.time.chrono.IslamicChronology islamicChronology18 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone16);
        long long20 = dateTimeZone6.getMillisKeepLocal(dateTimeZone16, 115200999L);
        org.joda.time.LocalDateTime localDateTime21 = org.joda.time.LocalDateTime.now(dateTimeZone16);
        int int23 = dateTimeZone16.getOffset((long) 349200000);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology26 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone25);
        org.joda.time.DurationField durationField27 = islamicChronology26.weekyears();
        org.joda.time.DateTimeField dateTimeField28 = islamicChronology26.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone29 = islamicChronology26.getZone();
        org.joda.time.DateTimeField dateTimeField30 = islamicChronology26.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField31 = islamicChronology26.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField32 = islamicChronology26.year();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType33 = islamicChronology26.getLeapYearPatternType();
        org.joda.time.chrono.IslamicChronology islamicChronology34 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone16, leapYearPatternType33);
        org.joda.time.DateTimeField dateTimeField35 = islamicChronology34.yearOfEra();
        org.joda.time.DurationField durationField36 = islamicChronology34.centuries();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType37 = islamicChronology34.getLeapYearPatternType();
        org.joda.time.DurationField durationField38 = islamicChronology34.years();
        org.joda.time.DateTimeField dateTimeField39 = islamicChronology34.secondOfMinute();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField38", (durationField4.compareTo(durationField38) == 0) == durationField4.equals(durationField38));
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test532");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        int int2 = localDateTime1.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology7 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone6);
        org.joda.time.DateTime dateTime8 = localDateTime1.toDateTime(dateTimeZone6);
        long long9 = dateTime8.getMillis();
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((long) 1);
        int int12 = localDateTime11.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology17 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone16);
        org.joda.time.DateTime dateTime18 = localDateTime11.toDateTime(dateTimeZone16);
        long long19 = dateTime18.getMillis();
        long long20 = dateTime18.getMillis();
        boolean boolean21 = dateTime8.isAfter((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.Chronology chronology22 = dateTime18.getChronology();
        org.joda.time.Instant instant23 = dateTime18.toInstant();
        java.lang.String str24 = dateTime18.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and instant23", (dateTime8.compareTo(instant23) == 0) == dateTime8.equals(instant23));
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test533");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology2.hourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.millisOfSecond();
        java.lang.String str6 = islamicChronology2.toString();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology9 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone8);
        java.lang.String str10 = dateTimeZone8.toString();
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime((long) 1);
        int int13 = localDateTime12.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime12.withYear((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.LocalDateTime localDateTime18 = localDateTime15.withPeriodAdded(readablePeriod16, 10);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime15.plusSeconds((int) ' ');
        boolean boolean21 = dateTimeZone8.isLocalDateTimeGap(localDateTime20);
        org.joda.time.Chronology chronology22 = islamicChronology2.withZone(dateTimeZone8);
        org.joda.time.DurationField durationField23 = islamicChronology2.eras();
        org.joda.time.DateTimeField dateTimeField24 = islamicChronology2.minuteOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField23", Math.signum(durationField3.compareTo(durationField23)) == -Math.signum(durationField23.compareTo(durationField3)));
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test534");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DurationField durationField4 = islamicChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.era();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology2.dayOfWeek();
        org.joda.time.DurationField durationField8 = islamicChronology2.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField8, durationField3, and durationField4", !(durationField8.compareTo(durationField3) == 0) || (Math.signum(durationField8.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test535");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DurationField durationField4 = islamicChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.yearOfEra();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology2.era();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology2.dayOfWeek();
        org.joda.time.DurationField durationField8 = islamicChronology2.months();
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
        org.joda.time.LocalDateTime localDateTime37 = localDateTime35.plusMonths(12);
        org.joda.time.LocalDateTime localDateTime39 = localDateTime35.withMinuteOfHour(0);
        org.joda.time.LocalDateTime.Property property40 = localDateTime39.millisOfDay();
        int int41 = localDateTime39.getMillisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology44 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone43);
        org.joda.time.DurationField durationField45 = islamicChronology44.weekyears();
        org.joda.time.DurationField durationField46 = islamicChronology44.halfdays();
        org.joda.time.DateTimeField dateTimeField47 = islamicChronology44.yearOfEra();
        org.joda.time.DateTimeField dateTimeField48 = islamicChronology44.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField49 = islamicChronology44.hourOfHalfday();
        org.joda.time.LocalDateTime localDateTime51 = new org.joda.time.LocalDateTime((long) (byte) -1);
        org.joda.time.LocalDateTime localDateTime53 = new org.joda.time.LocalDateTime((long) 1);
        int int54 = localDateTime53.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime56 = localDateTime53.minusHours((int) (byte) -1);
        int int57 = localDateTime53.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime59 = localDateTime53.withMinuteOfHour((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime61 = localDateTime53.plusHours((int) (byte) 100);
        org.joda.time.ReadableDuration readableDuration62 = null;
        org.joda.time.LocalDateTime localDateTime63 = localDateTime53.minus(readableDuration62);
        int int64 = localDateTime53.getSecondOfMinute();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray65 = localDateTime53.getFieldTypes();
        int[] intArray66 = localDateTime53.getValues();
        islamicChronology44.validate((org.joda.time.ReadablePartial) localDateTime51, intArray66);
        islamicChronology2.validate((org.joda.time.ReadablePartial) localDateTime39, intArray66);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField13", (durationField3.compareTo(durationField13) == 0) == durationField3.equals(durationField13));
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test536");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.yearOfCentury();
        org.joda.time.DurationField durationField5 = islamicChronology3.years();
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
        int[] intArray22 = islamicChronology3.get((org.joda.time.ReadablePartial) localDateTime16, (long) 0);
        org.joda.time.DateTimeField dateTimeField23 = islamicChronology3.millisOfDay();
        org.joda.time.DurationField durationField24 = islamicChronology3.centuries();
        org.joda.time.DateTimeField dateTimeField25 = islamicChronology3.dayOfYear();
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime(17763836400101L, (org.joda.time.Chronology) islamicChronology3);
        org.joda.time.DurationField durationField27 = islamicChronology3.minutes();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology30 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone29);
        org.joda.time.DurationField durationField31 = islamicChronology30.weekyears();
        org.joda.time.DurationField durationField32 = islamicChronology30.halfdays();
        org.joda.time.DateTimeField dateTimeField33 = islamicChronology30.yearOfEra();
        org.joda.time.DurationField durationField34 = islamicChronology30.halfdays();
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology37 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone36);
        org.joda.time.DurationField durationField38 = islamicChronology37.weekyears();
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology41 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone40);
        boolean boolean43 = dateTimeZone40.equals((java.lang.Object) 10L);
        org.joda.time.Chronology chronology44 = islamicChronology37.withZone(dateTimeZone40);
        java.util.Locale locale46 = java.util.Locale.KOREA;
        java.util.Locale locale47 = java.util.Locale.KOREA;
        java.lang.String str48 = locale46.getDisplayLanguage(locale47);
        java.lang.String str49 = locale47.getISO3Country();
        java.util.Set<java.lang.String> strSet50 = locale47.getUnicodeLocaleAttributes();
        java.lang.String str51 = dateTimeZone40.getName(24796800001L, locale47);
        org.joda.time.Chronology chronology52 = islamicChronology30.withZone(dateTimeZone40);
        long long56 = islamicChronology30.add((-9930L), 2967561L, 2022);
        org.joda.time.DurationField durationField57 = islamicChronology30.hours();
        boolean boolean58 = islamicChronology3.equals((java.lang.Object) islamicChronology30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField31", (durationField5.compareTo(durationField31) == 0) == durationField5.equals(durationField31));
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test537");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = islamicChronology2.years();
        org.joda.time.DateTimeZone dateTimeZone5 = islamicChronology2.getZone();
        org.joda.time.DateTimeZone dateTimeZone6 = islamicChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology2.era();
        java.util.Locale locale9 = java.util.Locale.ITALIAN;
        java.lang.String str10 = locale9.getISO3Language();
        java.lang.String str11 = dateTimeField7.getAsShortText(3600004L, locale9);
        long long13 = dateTimeField7.roundCeiling((long) 183);
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((long) 1);
        int int16 = localDateTime15.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime15.minusHours((int) (byte) -1);
        int int19 = localDateTime15.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime15.withMinuteOfHour((int) (byte) 1);
        int int23 = localDateTime21.getValue(0);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime21.plusSeconds(11);
        org.joda.time.LocalDateTime.Property property26 = localDateTime25.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology29 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone28);
        org.joda.time.DurationField durationField30 = islamicChronology29.weekyears();
        org.joda.time.DurationField durationField31 = islamicChronology29.halfdays();
        org.joda.time.DateTimeField dateTimeField32 = islamicChronology29.yearOfEra();
        org.joda.time.DateTimeField dateTimeField33 = islamicChronology29.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField34 = islamicChronology29.hourOfHalfday();
        org.joda.time.LocalDateTime localDateTime36 = new org.joda.time.LocalDateTime((long) (byte) -1);
        org.joda.time.LocalDateTime localDateTime38 = new org.joda.time.LocalDateTime((long) 1);
        int int39 = localDateTime38.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime41 = localDateTime38.minusHours((int) (byte) -1);
        int int42 = localDateTime38.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime44 = localDateTime38.withMinuteOfHour((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime46 = localDateTime38.plusHours((int) (byte) 100);
        org.joda.time.ReadableDuration readableDuration47 = null;
        org.joda.time.LocalDateTime localDateTime48 = localDateTime38.minus(readableDuration47);
        int int49 = localDateTime38.getSecondOfMinute();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray50 = localDateTime38.getFieldTypes();
        int[] intArray51 = localDateTime38.getValues();
        islamicChronology29.validate((org.joda.time.ReadablePartial) localDateTime36, intArray51);
        org.joda.time.LocalDateTime localDateTime54 = new org.joda.time.LocalDateTime((long) 1);
        int int55 = localDateTime54.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime57 = localDateTime54.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone59 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology60 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone59);
        org.joda.time.DateTime dateTime61 = localDateTime54.toDateTime(dateTimeZone59);
        org.joda.time.LocalDateTime localDateTime63 = new org.joda.time.LocalDateTime((long) 1);
        int int64 = localDateTime63.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime66 = localDateTime63.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone68 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology69 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone68);
        org.joda.time.DateTime dateTime70 = localDateTime63.toDateTime(dateTimeZone68);
        long long71 = dateTime70.getMillis();
        boolean boolean72 = dateTime61.isAfter((org.joda.time.ReadableInstant) dateTime70);
        org.joda.time.DateTimeZone dateTimeZone73 = dateTime61.getZone();
        org.joda.time.LocalDateTime localDateTime75 = new org.joda.time.LocalDateTime((long) 1);
        int int76 = localDateTime75.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime78 = localDateTime75.minusHours((int) (byte) -1);
        int int79 = localDateTime75.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime81 = localDateTime75.withMinuteOfHour((int) (byte) 1);
        org.joda.time.ReadableDuration readableDuration82 = null;
        org.joda.time.LocalDateTime localDateTime84 = localDateTime81.withDurationAdded(readableDuration82, (int) 'x');
        org.joda.time.LocalDateTime localDateTime86 = localDateTime84.minusDays(82800001);
        org.joda.time.LocalDateTime localDateTime88 = localDateTime84.plusHours(60);
        boolean boolean89 = dateTimeZone73.isLocalDateTimeGap(localDateTime84);
        org.joda.time.DateTime dateTime90 = localDateTime36.toDateTime(dateTimeZone73);
        int int91 = localDateTime25.compareTo((org.joda.time.ReadablePartial) localDateTime36);
        int int92 = dateTimeField7.getMinimumValue((org.joda.time.ReadablePartial) localDateTime25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField30", (durationField4.compareTo(durationField30) == 0) == durationField4.equals(durationField30));
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test538");
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
        org.joda.time.ReadableDuration readableDuration26 = null;
        org.joda.time.LocalDateTime localDateTime27 = localDateTime23.plus(readableDuration26);
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology30 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone29);
        org.joda.time.DurationField durationField31 = islamicChronology30.weekyears();
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology34 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone33);
        boolean boolean36 = dateTimeZone33.equals((java.lang.Object) 10L);
        org.joda.time.Chronology chronology37 = islamicChronology30.withZone(dateTimeZone33);
        org.joda.time.DurationField durationField38 = islamicChronology30.eras();
        boolean boolean39 = localDateTime23.equals((java.lang.Object) durationField38);
        int int40 = localDateTime23.getSecondOfMinute();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField38", Math.signum(durationField3.compareTo(durationField38)) == -Math.signum(durationField38.compareTo(durationField3)));
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
        org.joda.time.DateTimeField dateTimeField22 = islamicChronology2.millisOfDay();
        org.joda.time.DurationField durationField23 = islamicChronology2.centuries();
        org.joda.time.DateTimeField dateTimeField24 = islamicChronology2.dayOfYear();
        org.joda.time.DateTimeField dateTimeField25 = islamicChronology2.millisOfDay();
        org.joda.time.DurationField durationField26 = islamicChronology2.minutes();
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
        org.joda.time.LocalDateTime localDateTime43 = localDateTime37.withMonthOfYear((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime45 = localDateTime43.minusDays(10);
        org.joda.time.LocalDateTime localDateTime47 = localDateTime43.withYear(292278993);
        int[] intArray49 = islamicChronology2.get((org.joda.time.ReadablePartial) localDateTime47, (-42160266000000L));
        org.joda.time.DateTimeField dateTimeField50 = islamicChronology2.monthOfYear();
        org.joda.time.DurationField durationField51 = islamicChronology2.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField51, durationField4, and durationField23", !(durationField51.compareTo(durationField4) == 0) || (Math.signum(durationField51.compareTo(durationField23)) == Math.signum(durationField4.compareTo(durationField23))));
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test540");
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(100, (int) (short) 10, (int) (short) 10, (int) (byte) 0, 0, (int) ' ');
        int int7 = localDateTime6.getMinuteOfHour();
        org.joda.time.LocalDateTime.Property property8 = localDateTime6.hourOfDay();
        org.joda.time.LocalDateTime localDateTime10 = property8.addToCopy((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime12 = property8.addToCopy(1);
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((long) 1);
        int int15 = localDateTime14.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime17 = localDateTime14.minusHours((int) (byte) -1);
        int int18 = localDateTime14.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime14.minusMinutes((int) '#');
        org.joda.time.LocalDateTime localDateTime22 = localDateTime14.plusMonths((-1));
        org.joda.time.LocalDateTime localDateTime24 = localDateTime22.plusHours(3600000);
        int int25 = property8.compareTo((org.joda.time.ReadablePartial) localDateTime24);
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
        org.joda.time.DateTimeZone dateTimeZone50 = islamicChronology28.getZone();
        org.joda.time.DateTimeField dateTimeField51 = islamicChronology28.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime52 = new org.joda.time.LocalDateTime();
        int[] intArray54 = islamicChronology28.get((org.joda.time.ReadablePartial) localDateTime52, 10L);
        org.joda.time.DateTimeField dateTimeField55 = islamicChronology28.secondOfDay();
        org.joda.time.DateTimeField dateTimeField56 = islamicChronology28.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone57 = islamicChronology28.getZone();
        boolean boolean58 = localDateTime24.equals((java.lang.Object) islamicChronology28);
        org.joda.time.LocalDateTime localDateTime60 = new org.joda.time.LocalDateTime((long) 1);
        int int61 = localDateTime60.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime63 = localDateTime60.minusHours((int) (byte) -1);
        int int65 = localDateTime60.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime67 = localDateTime60.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod68 = null;
        org.joda.time.LocalDateTime localDateTime69 = localDateTime60.minus(readablePeriod68);
        org.joda.time.LocalDateTime.Property property70 = localDateTime60.millisOfSecond();
        int int71 = property70.getMinimumValue();
        org.joda.time.LocalDateTime localDateTime73 = property70.addWrapFieldToCopy((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime75 = localDateTime73.plusMinutes(2022);
        org.joda.time.DateTimeZone dateTimeZone77 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology78 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone77);
        org.joda.time.DurationField durationField79 = islamicChronology78.weekyears();
        org.joda.time.DurationField durationField80 = islamicChronology78.halfdays();
        org.joda.time.DurationField durationField81 = islamicChronology78.weeks();
        org.joda.time.DateTimeField dateTimeField82 = islamicChronology78.yearOfEra();
        org.joda.time.LocalDateTime localDateTime84 = new org.joda.time.LocalDateTime((long) 1);
        int int85 = localDateTime84.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime87 = localDateTime84.minusHours((int) (byte) -1);
        org.joda.time.DateTimeField[] dateTimeFieldArray88 = localDateTime87.getFields();
        java.util.Locale locale89 = java.util.Locale.KOREA;
        java.util.Locale locale90 = java.util.Locale.KOREA;
        java.lang.String str91 = locale89.getDisplayLanguage(locale90);
        java.lang.String str92 = dateTimeField82.getAsText((org.joda.time.ReadablePartial) localDateTime87, locale89);
        org.joda.time.LocalDateTime localDateTime94 = localDateTime87.minusSeconds((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime96 = localDateTime94.withSecondOfMinute(45);
        boolean boolean97 = localDateTime75.isEqual((org.joda.time.ReadablePartial) localDateTime96);
        boolean boolean98 = localDateTime24.isEqual((org.joda.time.ReadablePartial) localDateTime96);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField30 and durationField79", (durationField30.compareTo(durationField79) == 0) == durationField30.equals(durationField79));
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test541");
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
        java.util.Locale locale14 = java.util.Locale.CHINA;
        java.lang.String str15 = property11.getAsText(locale14);
        org.joda.time.LocalDateTime localDateTime16 = property11.withMinimumValue();
        org.joda.time.Interval interval17 = property11.toInterval();
        boolean boolean18 = property11.isLeap();
        org.joda.time.LocalDateTime localDateTime19 = property11.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime20 = property11.roundHalfEvenCopy();
        java.lang.String str21 = property11.getAsString();
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
        org.joda.time.ReadablePeriod readablePeriod43 = null;
        org.joda.time.LocalDateTime localDateTime45 = localDateTime40.withPeriodAdded(readablePeriod43, 45);
        org.joda.time.LocalDateTime localDateTime47 = localDateTime45.withCenturyOfEra(101);
        org.joda.time.LocalDateTime localDateTime49 = new org.joda.time.LocalDateTime((long) 1);
        int int50 = localDateTime49.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime52 = localDateTime49.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone54 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology55 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone54);
        org.joda.time.DateTime dateTime56 = localDateTime49.toDateTime(dateTimeZone54);
        org.joda.time.LocalDateTime localDateTime58 = new org.joda.time.LocalDateTime((long) 1);
        int int59 = localDateTime58.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime61 = localDateTime58.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone63 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology64 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone63);
        org.joda.time.DateTime dateTime65 = localDateTime58.toDateTime(dateTimeZone63);
        long long66 = dateTime65.getMillis();
        boolean boolean67 = dateTime56.isAfter((org.joda.time.ReadableInstant) dateTime65);
        long long68 = dateTime65.getMillis();
        org.joda.time.Instant instant69 = dateTime65.toInstant();
        org.joda.time.DateTime dateTime70 = localDateTime47.toDateTime((org.joda.time.ReadableInstant) instant69);
        long long71 = property11.getDifferenceAsLong((org.joda.time.ReadableInstant) instant69);
        long long72 = property11.remainder();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime56 and instant69", (dateTime56.compareTo(instant69) == 0) == dateTime56.equals(instant69));
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test542");
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
        org.joda.time.LocalDateTime localDateTime36 = localDateTime23.minusMinutes(45);
        org.joda.time.LocalDateTime localDateTime38 = new org.joda.time.LocalDateTime((long) 1);
        int int39 = localDateTime38.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime41 = localDateTime38.minusHours((int) (byte) -1);
        int int43 = localDateTime38.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime45 = localDateTime38.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod46 = null;
        org.joda.time.LocalDateTime localDateTime47 = localDateTime38.minus(readablePeriod46);
        org.joda.time.LocalDateTime.Property property48 = localDateTime38.millisOfSecond();
        long long49 = property48.remainder();
        java.lang.String str50 = property48.getName();
        org.joda.time.DurationField durationField51 = property48.getRangeDurationField();
        int int52 = property48.getMinimumValue();
        org.joda.time.LocalDateTime localDateTime53 = property48.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone55 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology56 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone55);
        org.joda.time.DurationField durationField57 = islamicChronology56.weekyears();
        org.joda.time.DateTimeField dateTimeField58 = islamicChronology56.hourOfHalfday();
        org.joda.time.LocalDateTime localDateTime60 = new org.joda.time.LocalDateTime((long) 1);
        int int61 = localDateTime60.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime63 = localDateTime60.minusHours((int) (byte) -1);
        org.joda.time.DateTimeField[] dateTimeFieldArray64 = localDateTime63.getFields();
        org.joda.time.LocalDateTime localDateTime66 = localDateTime63.minusDays(4);
        org.joda.time.LocalDateTime localDateTime68 = new org.joda.time.LocalDateTime((long) 1);
        int int69 = localDateTime68.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime71 = localDateTime68.minusHours((int) (byte) -1);
        int int73 = localDateTime68.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime75 = localDateTime68.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod76 = null;
        org.joda.time.LocalDateTime localDateTime77 = localDateTime68.minus(readablePeriod76);
        int int78 = localDateTime77.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField80 = localDateTime77.getField(0);
        org.joda.time.LocalDateTime.Property property81 = localDateTime77.centuryOfEra();
        org.joda.time.LocalDateTime.Property property82 = localDateTime77.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime87 = localDateTime77.withTime((int) (byte) 1, 0, 5, (int) (byte) 100);
        boolean boolean88 = localDateTime63.isBefore((org.joda.time.ReadablePartial) localDateTime87);
        org.joda.time.LocalDateTime.Property property89 = localDateTime87.weekyear();
        int[] intArray91 = islamicChronology56.get((org.joda.time.ReadablePartial) localDateTime87, 17763840000001L);
        org.joda.time.LocalDateTime localDateTime93 = localDateTime87.minusHours((int) ' ');
        org.joda.time.LocalDateTime localDateTime95 = localDateTime87.withMillisOfSecond((int) 'a');
        boolean boolean96 = localDateTime53.isEqual((org.joda.time.ReadablePartial) localDateTime87);
        int int97 = localDateTime23.compareTo((org.joda.time.ReadablePartial) localDateTime53);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField57", (durationField4.compareTo(durationField57) == 0) == durationField4.equals(durationField57));
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test543");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology2.weekyear();
        org.joda.time.DurationField durationField4 = islamicChronology2.years();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone6 = islamicChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology2.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology2.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology11 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone10);
        org.joda.time.DurationField durationField12 = islamicChronology11.weekyears();
        org.joda.time.DurationField durationField13 = islamicChronology11.halfdays();
        org.joda.time.DateTimeField dateTimeField14 = islamicChronology11.yearOfEra();
        org.joda.time.DateTimeField dateTimeField15 = islamicChronology11.minuteOfHour();
        org.joda.time.DurationField durationField16 = islamicChronology11.centuries();
        org.joda.time.DateTimeField dateTimeField17 = islamicChronology11.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField18 = islamicChronology11.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField19 = islamicChronology11.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField20 = islamicChronology11.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime(0L);
        int int23 = localDateTime22.getYearOfCentury();
        int int24 = localDateTime22.getDayOfWeek();
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime((long) (byte) -1);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime26.minusDays(12);
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology31 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone30);
        org.joda.time.DurationField durationField32 = islamicChronology31.weekyears();
        org.joda.time.DurationField durationField33 = islamicChronology31.halfdays();
        org.joda.time.DateTimeField dateTimeField34 = islamicChronology31.yearOfEra();
        org.joda.time.DurationField durationField35 = islamicChronology31.halfdays();
        org.joda.time.DurationFieldType durationFieldType36 = durationField35.getType();
        org.joda.time.LocalDateTime localDateTime38 = localDateTime26.withFieldAdded(durationFieldType36, (int) '#');
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology41 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone40);
        org.joda.time.DurationField durationField42 = islamicChronology41.weekyears();
        org.joda.time.DurationField durationField43 = islamicChronology41.halfdays();
        org.joda.time.DurationField durationField44 = islamicChronology41.weeks();
        org.joda.time.DateTimeField dateTimeField45 = islamicChronology41.yearOfEra();
        org.joda.time.LocalDateTime localDateTime47 = new org.joda.time.LocalDateTime((long) 1);
        int int48 = localDateTime47.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime50 = localDateTime47.minusHours((int) (byte) -1);
        org.joda.time.DateTimeField[] dateTimeFieldArray51 = localDateTime50.getFields();
        java.util.Locale locale52 = java.util.Locale.KOREA;
        java.util.Locale locale53 = java.util.Locale.KOREA;
        java.lang.String str54 = locale52.getDisplayLanguage(locale53);
        java.lang.String str55 = dateTimeField45.getAsText((org.joda.time.ReadablePartial) localDateTime50, locale52);
        org.joda.time.DateTimeFieldType dateTimeFieldType56 = dateTimeField45.getType();
        org.joda.time.LocalDateTime.Property property57 = localDateTime38.property(dateTimeFieldType56);
        org.joda.time.LocalDateTime localDateTime59 = localDateTime38.minusSeconds(1910);
        boolean boolean60 = localDateTime22.isEqual((org.joda.time.ReadablePartial) localDateTime59);
        org.joda.time.LocalDateTime localDateTime62 = localDateTime59.plusSeconds(9);
        org.joda.time.LocalDateTime localDateTime64 = localDateTime62.plusYears(90);
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
        org.joda.time.LocalDateTime localDateTime84 = localDateTime77.minusSeconds((int) (short) 100);
        org.joda.time.LocalDateTime.Property property85 = localDateTime77.dayOfYear();
        java.lang.String str86 = property85.getAsString();
        org.joda.time.DateTimeZone dateTimeZone88 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology89 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone88);
        org.joda.time.DurationField durationField90 = islamicChronology89.weekyears();
        org.joda.time.DurationField durationField91 = islamicChronology89.halfdays();
        org.joda.time.DateTimeField dateTimeField92 = islamicChronology89.yearOfEra();
        java.util.Locale locale94 = new java.util.Locale("");
        java.lang.String str95 = locale94.getISO3Language();
        int int96 = dateTimeField92.getMaximumShortTextLength(locale94);
        int int97 = property85.getMaximumTextLength(locale94);
        java.lang.String str98 = dateTimeField20.getAsText((org.joda.time.ReadablePartial) localDateTime64, (-224729), locale94);
        int int99 = dateTimeField8.getMinimumValue((org.joda.time.ReadablePartial) localDateTime64);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField12", (durationField4.compareTo(durationField12) == 0) == durationField4.equals(durationField12));
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test544");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 1);
        int int3 = localDateTime2.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withYear((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.withPeriodAdded(readablePeriod6, 10);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.withDayOfYear(11);
        int[] intArray11 = localDateTime10.getValues();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime10.plusHours((int) (short) 0);
        int int14 = localDateTime0.compareTo((org.joda.time.ReadablePartial) localDateTime10);
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((long) 1);
        int int17 = localDateTime16.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology22 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone21);
        org.joda.time.DateTime dateTime23 = localDateTime16.toDateTime(dateTimeZone21);
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime((long) 1);
        int int26 = localDateTime25.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime28 = localDateTime25.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology31 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone30);
        org.joda.time.DateTime dateTime32 = localDateTime25.toDateTime(dateTimeZone30);
        long long33 = dateTime32.getMillis();
        boolean boolean34 = dateTime23.isAfter((org.joda.time.ReadableInstant) dateTime32);
        long long35 = dateTime32.getMillis();
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology38 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone37);
        org.joda.time.DurationField durationField39 = islamicChronology38.weekyears();
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology42 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone41);
        boolean boolean44 = dateTimeZone41.equals((java.lang.Object) 10L);
        org.joda.time.Chronology chronology45 = islamicChronology38.withZone(dateTimeZone41);
        org.joda.time.DateTimeField dateTimeField46 = islamicChronology38.hourOfHalfday();
        org.joda.time.DurationField durationField47 = dateTimeField46.getRangeDurationField();
        boolean boolean48 = dateTime32.equals((java.lang.Object) durationField47);
        org.joda.time.Instant instant49 = dateTime32.toInstant();
        org.joda.time.LocalDateTime localDateTime51 = new org.joda.time.LocalDateTime((long) 1);
        int int52 = localDateTime51.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime54 = localDateTime51.minusHours((int) (byte) -1);
        int int56 = localDateTime51.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime58 = localDateTime51.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod59 = null;
        org.joda.time.LocalDateTime localDateTime60 = localDateTime51.minus(readablePeriod59);
        org.joda.time.LocalDateTime.Property property61 = localDateTime51.millisOfSecond();
        long long62 = property61.remainder();
        java.lang.String str63 = property61.getName();
        java.util.Locale locale64 = java.util.Locale.CHINA;
        java.lang.String str65 = property61.getAsText(locale64);
        org.joda.time.LocalDateTime localDateTime66 = property61.withMinimumValue();
        org.joda.time.LocalDateTime localDateTime68 = localDateTime66.plusYears(4);
        org.joda.time.ReadablePeriod readablePeriod69 = null;
        org.joda.time.LocalDateTime localDateTime70 = localDateTime68.plus(readablePeriod69);
        org.joda.time.DateTimeZone dateTimeZone72 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology73 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone72);
        org.joda.time.DurationField durationField74 = islamicChronology73.weekyears();
        org.joda.time.DurationField durationField75 = islamicChronology73.halfdays();
        org.joda.time.DurationField durationField76 = islamicChronology73.weeks();
        org.joda.time.DateTimeField dateTimeField77 = islamicChronology73.yearOfEra();
        org.joda.time.LocalDateTime localDateTime79 = new org.joda.time.LocalDateTime((long) 1);
        int int80 = localDateTime79.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime82 = localDateTime79.minusHours((int) (byte) -1);
        org.joda.time.DateTimeField[] dateTimeFieldArray83 = localDateTime82.getFields();
        java.util.Locale locale84 = java.util.Locale.KOREA;
        java.util.Locale locale85 = java.util.Locale.KOREA;
        java.lang.String str86 = locale84.getDisplayLanguage(locale85);
        java.lang.String str87 = dateTimeField77.getAsText((org.joda.time.ReadablePartial) localDateTime82, locale84);
        org.joda.time.DateTimeFieldType dateTimeFieldType88 = dateTimeField77.getType();
        org.joda.time.LocalDateTime localDateTime90 = localDateTime68.withField(dateTimeFieldType88, (int) ' ');
        boolean boolean91 = instant49.isSupported(dateTimeFieldType88);
        org.joda.time.DateTime dateTime92 = localDateTime0.toDateTime((org.joda.time.ReadableInstant) instant49);
        org.joda.time.LocalDateTime localDateTime94 = localDateTime0.withWeekyear(1910);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime23 and instant49", (dateTime23.compareTo(instant49) == 0) == dateTime23.equals(instant49));
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test545");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology2.hourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology2.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology2.halfdayOfDay();
        org.joda.time.DurationField durationField8 = islamicChronology2.eras();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology2.halfdayOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField8", Math.signum(durationField3.compareTo(durationField8)) == -Math.signum(durationField8.compareTo(durationField3)));
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test546");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        boolean boolean4 = dateTimeZone1.equals((java.lang.Object) 10L);
        java.lang.String str6 = dateTimeZone1.getName((long) (short) 100);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) 1);
        int int9 = localDateTime8.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.minusHours((int) (byte) -1);
        org.joda.time.DateTimeField[] dateTimeFieldArray12 = localDateTime11.getFields();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.minusDays(4);
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
        org.joda.time.LocalDateTime localDateTime35 = localDateTime25.withTime((int) (byte) 1, 0, 5, (int) (byte) 100);
        boolean boolean36 = localDateTime11.isBefore((org.joda.time.ReadablePartial) localDateTime35);
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
        org.joda.time.LocalDateTime.Property property52 = localDateTime47.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime57 = localDateTime47.withTime((int) (byte) 1, 0, 5, (int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime59 = new org.joda.time.LocalDateTime((long) 1);
        int int60 = localDateTime59.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime62 = localDateTime59.minusHours((int) (byte) -1);
        int int64 = localDateTime59.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime66 = localDateTime59.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod67 = null;
        org.joda.time.LocalDateTime localDateTime68 = localDateTime59.minus(readablePeriod67);
        int int69 = localDateTime68.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField71 = localDateTime68.getField(0);
        org.joda.time.LocalDateTime.Property property72 = localDateTime68.centuryOfEra();
        org.joda.time.LocalDateTime.Property property73 = localDateTime68.millisOfSecond();
        org.joda.time.DateTimeFieldType dateTimeFieldType74 = property73.getFieldType();
        boolean boolean75 = localDateTime57.isSupported(dateTimeFieldType74);
        boolean boolean76 = localDateTime35.isSupported(dateTimeFieldType74);
        org.joda.time.ReadableDuration readableDuration77 = null;
        org.joda.time.LocalDateTime localDateTime79 = localDateTime35.withDurationAdded(readableDuration77, 10);
        org.joda.time.LocalDateTime.Property property80 = localDateTime35.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime82 = new org.joda.time.LocalDateTime((long) 1);
        int int83 = localDateTime82.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime85 = localDateTime82.minusHours((int) (byte) -1);
        int int86 = localDateTime82.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime88 = localDateTime82.withMinuteOfHour((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime90 = localDateTime82.plusHours((int) (byte) 100);
        java.util.Date date91 = localDateTime90.toDate();
        org.joda.time.DateTime dateTime92 = localDateTime90.toDateTime();
        org.joda.time.Instant instant93 = dateTime92.toInstant();
        long long94 = property80.getDifferenceAsLong((org.joda.time.ReadableInstant) instant93);
        int int95 = dateTimeZone1.getOffset((org.joda.time.ReadableInstant) instant93);
        int int97 = dateTimeZone1.getOffset((-646523999999L));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime92 and instant93", (dateTime92.compareTo(instant93) == 0) == dateTime92.equals(instant93));
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test547");
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
        org.joda.time.Chronology chronology30 = islamicChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField31 = islamicChronology2.era();
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime((org.joda.time.Chronology) islamicChronology2);
        org.joda.time.DateTimeZone dateTimeZone33 = islamicChronology2.getZone();
        long long37 = dateTimeZone33.convertLocalToUTC(24796800001L, false, (-20217559612L));
        long long39 = dateTimeZone33.convertUTCToLocal((long) 366);
        java.lang.String str40 = dateTimeZone33.getID();
        long long42 = dateTimeZone33.convertUTCToLocal((-16754064L));
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology45 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone44);
        org.joda.time.DurationField durationField46 = islamicChronology45.weekyears();
        org.joda.time.DateTimeField dateTimeField47 = islamicChronology45.yearOfEra();
        long long49 = dateTimeField47.roundCeiling(0L);
        org.joda.time.LocalDateTime localDateTime51 = new org.joda.time.LocalDateTime((long) 1);
        int int52 = localDateTime51.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime54 = localDateTime51.minusHours((int) (byte) -1);
        int int55 = localDateTime51.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime57 = localDateTime51.withMinuteOfHour((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime59 = localDateTime51.plusHours((int) (byte) 100);
        org.joda.time.ReadableDuration readableDuration60 = null;
        org.joda.time.LocalDateTime localDateTime61 = localDateTime51.minus(readableDuration60);
        java.util.Locale locale62 = java.util.Locale.PRC;
        java.util.Locale locale63 = locale62.stripExtensions();
        java.lang.String str64 = dateTimeField47.getAsShortText((org.joda.time.ReadablePartial) localDateTime61, locale62);
        org.joda.time.LocalDateTime localDateTime66 = localDateTime61.plusMillis(9);
        int int67 = localDateTime66.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime69 = new org.joda.time.LocalDateTime((long) 1);
        int int70 = localDateTime69.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime72 = localDateTime69.minusHours((int) (byte) -1);
        int int74 = localDateTime69.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime76 = localDateTime69.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod77 = null;
        org.joda.time.LocalDateTime localDateTime78 = localDateTime69.minus(readablePeriod77);
        org.joda.time.LocalDateTime.Property property79 = localDateTime69.millisOfSecond();
        long long80 = property79.remainder();
        java.lang.String str81 = property79.getName();
        java.util.Locale locale82 = java.util.Locale.CHINA;
        java.lang.String str83 = property79.getAsText(locale82);
        org.joda.time.LocalDateTime localDateTime84 = property79.withMinimumValue();
        org.joda.time.LocalDateTime localDateTime86 = localDateTime84.plusYears(4);
        boolean boolean87 = localDateTime66.isAfter((org.joda.time.ReadablePartial) localDateTime84);
        boolean boolean88 = dateTimeZone33.isLocalDateTimeGap(localDateTime84);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField46", (durationField4.compareTo(durationField46) == 0) == durationField4.equals(durationField46));
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test548");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        int int2 = localDateTime1.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.minusHours((int) (byte) -1);
        int int5 = localDateTime1.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.withMinuteOfHour((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime1.plusHours((int) (byte) 100);
        java.util.Date date10 = localDateTime9.toDate();
        org.joda.time.LocalDateTime localDateTime11 = org.joda.time.LocalDateTime.fromDateFields(date10);
        org.joda.time.LocalDateTime localDateTime12 = org.joda.time.LocalDateTime.fromDateFields(date10);
        org.joda.time.LocalDateTime localDateTime13 = org.joda.time.LocalDateTime.fromDateFields(date10);
        org.joda.time.LocalDateTime localDateTime14 = org.joda.time.LocalDateTime.fromDateFields(date10);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology17 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone16);
        org.joda.time.DurationField durationField18 = islamicChronology17.weekyears();
        org.joda.time.DurationField durationField19 = islamicChronology17.halfdays();
        org.joda.time.DurationField durationField20 = islamicChronology17.weeks();
        org.joda.time.DateTimeField dateTimeField21 = islamicChronology17.yearOfEra();
        org.joda.time.DateTimeField dateTimeField22 = islamicChronology17.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField23 = islamicChronology17.dayOfYear();
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime(100, (int) (short) 10, (int) (short) 10, (int) (byte) 0, 0, (int) ' ');
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime((long) 1);
        int int33 = localDateTime32.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime35 = localDateTime32.minusHours((int) (byte) -1);
        int int36 = localDateTime32.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime38 = localDateTime32.withMinuteOfHour((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime40 = localDateTime32.plusHours((int) (byte) 100);
        org.joda.time.ReadableDuration readableDuration41 = null;
        org.joda.time.LocalDateTime localDateTime42 = localDateTime32.minus(readableDuration41);
        int int43 = localDateTime32.getSecondOfMinute();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray44 = localDateTime32.getFieldTypes();
        int[] intArray45 = localDateTime32.getValues();
        int int46 = dateTimeField23.getMaximumValue((org.joda.time.ReadablePartial) localDateTime30, intArray45);
        java.util.Locale locale50 = new java.util.Locale("", "0099-01-01T01:00:00.001", "\u53f0\u7063");
        int int51 = dateTimeField23.getMaximumShortTextLength(locale50);
        org.joda.time.DateTimeFieldType dateTimeFieldType52 = dateTimeField23.getType();
        int int53 = localDateTime14.get(dateTimeFieldType52);
        java.util.Locale locale54 = java.util.Locale.KOREA;
        java.util.Locale locale55 = java.util.Locale.KOREA;
        java.lang.String str56 = locale54.getDisplayLanguage(locale55);
        java.lang.String str57 = locale55.getISO3Country();
        java.util.Set<java.lang.String> strSet58 = locale55.getUnicodeLocaleAttributes();
        strSet58.clear();
        org.joda.time.LocalDateTime localDateTime61 = new org.joda.time.LocalDateTime((long) 1);
        int int62 = localDateTime61.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime64 = localDateTime61.minusHours((int) (byte) -1);
        int int66 = localDateTime61.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime68 = localDateTime61.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod69 = null;
        org.joda.time.LocalDateTime localDateTime70 = localDateTime61.minus(readablePeriod69);
        org.joda.time.LocalDateTime.Property property71 = localDateTime61.millisOfSecond();
        long long72 = property71.remainder();
        java.lang.String str73 = property71.getName();
        int int74 = property71.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime76 = property71.addWrapFieldToCopy(70);
        org.joda.time.LocalDateTime localDateTime77 = property71.roundFloorCopy();
        boolean boolean78 = strSet58.remove((java.lang.Object) localDateTime77);
        org.joda.time.DateTimeZone dateTimeZone79 = null;
        org.joda.time.DateTime dateTime80 = localDateTime77.toDateTime(dateTimeZone79);
        org.joda.time.Instant instant81 = dateTime80.toInstant();
        org.joda.time.DateTimeZone dateTimeZone83 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology84 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone83);
        org.joda.time.DateTimeField dateTimeField85 = islamicChronology84.yearOfCentury();
        org.joda.time.DurationField durationField86 = islamicChronology84.years();
        org.joda.time.DurationField durationField87 = islamicChronology84.halfdays();
        org.joda.time.DateTimeField dateTimeField88 = islamicChronology84.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField89 = islamicChronology84.dayOfYear();
        org.joda.time.DateTimeField dateTimeField90 = islamicChronology84.hourOfHalfday();
        int int91 = dateTimeField90.getMaximumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType92 = dateTimeField90.getType();
        int int93 = dateTime80.get(dateTimeFieldType92);
        boolean boolean94 = localDateTime14.isSupported(dateTimeFieldType92);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField18 and durationField86", (durationField18.compareTo(durationField86) == 0) == durationField18.equals(durationField86));
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test549");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        int int2 = localDateTime1.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology7 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone6);
        org.joda.time.DateTime dateTime8 = localDateTime1.toDateTime(dateTimeZone6);
        java.lang.String str9 = dateTimeZone6.getID();
        java.util.TimeZone timeZone10 = dateTimeZone6.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology13 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone12);
        org.joda.time.DurationField durationField14 = islamicChronology13.weekyears();
        org.joda.time.DateTimeField dateTimeField15 = islamicChronology13.halfdayOfDay();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType16 = islamicChronology13.getLeapYearPatternType();
        org.joda.time.chrono.IslamicChronology islamicChronology17 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone6, leapYearPatternType16);
        org.joda.time.DateTimeField dateTimeField18 = islamicChronology17.era();
        org.joda.time.DurationField durationField19 = islamicChronology17.years();
        org.joda.time.DateTimeField dateTimeField20 = islamicChronology17.weekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField14 and durationField19", (durationField14.compareTo(durationField19) == 0) == durationField14.equals(durationField19));
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test550");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DurationField durationField4 = islamicChronology2.months();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.minuteOfHour();
        org.joda.time.DurationField durationField6 = islamicChronology2.hours();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology2.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 0);
        org.joda.time.Chronology chronology10 = islamicChronology2.withZone(dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology2.yearOfEra();
        java.lang.String str12 = islamicChronology2.toString();
        org.joda.time.DurationField durationField13 = islamicChronology2.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField13, durationField3, and durationField4", !(durationField13.compareTo(durationField3) == 0) || (Math.signum(durationField13.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test551");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone2);
        int int4 = islamicChronology3.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology3.weekyear();
        org.joda.time.DurationField durationField6 = islamicChronology3.hours();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology3.millisOfDay();
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) 59, (org.joda.time.Chronology) islamicChronology3);
        int int9 = localDateTime8.getWeekOfWeekyear();
        org.joda.time.LocalDateTime.Property property10 = localDateTime8.dayOfWeek();
        int int11 = localDateTime8.getDayOfMonth();
        org.joda.time.LocalDateTime.Property property12 = localDateTime8.era();
        org.joda.time.DurationField durationField13 = property12.getDurationField();
        java.util.Locale locale15 = new java.util.Locale("3601");
        java.lang.String str16 = locale15.getDisplayCountry();
        int int17 = property12.getMaximumShortTextLength(locale15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField6 and durationField13", Math.signum(durationField6.compareTo(durationField13)) == -Math.signum(durationField13.compareTo(durationField6)));
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test552");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology2.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone5 = islamicChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology2.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology2.hourOfHalfday();
        org.joda.time.DurationField durationField8 = islamicChronology2.months();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology2.weekyear();
        org.joda.time.DurationField durationField10 = islamicChronology2.seconds();
        org.joda.time.DateTimeZone dateTimeZone11 = islamicChronology2.getZone();
        org.joda.time.DurationField durationField12 = islamicChronology2.years();
        org.joda.time.DateTimeField dateTimeField13 = islamicChronology2.era();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField12", (durationField3.compareTo(durationField12) == 0) == durationField3.equals(durationField12));
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test553");
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
        org.joda.time.DurationField durationField28 = islamicChronology2.minutes();
        int int29 = islamicChronology2.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField30 = islamicChronology2.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField31 = islamicChronology2.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology35 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone34);
        org.joda.time.DateTimeField dateTimeField36 = islamicChronology35.weekyear();
        org.joda.time.DurationField durationField37 = islamicChronology35.years();
        org.joda.time.DateTimeField dateTimeField38 = islamicChronology35.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField39 = islamicChronology35.hourOfDay();
        org.joda.time.DateTimeField dateTimeField40 = islamicChronology35.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField41 = islamicChronology35.monthOfYear();
        org.joda.time.DateTimeField dateTimeField42 = islamicChronology35.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField43 = islamicChronology35.halfdayOfDay();
        int int45 = dateTimeField43.getMaximumValue((-30585600000L));
        org.joda.time.LocalDateTime localDateTime48 = new org.joda.time.LocalDateTime((long) 1);
        int int49 = localDateTime48.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime51 = localDateTime48.minusHours((int) (byte) -1);
        int int53 = localDateTime48.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime55 = localDateTime48.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod56 = null;
        org.joda.time.LocalDateTime localDateTime57 = localDateTime48.minus(readablePeriod56);
        org.joda.time.LocalDateTime.Property property58 = localDateTime48.millisOfSecond();
        long long59 = property58.remainder();
        java.lang.String str60 = property58.getName();
        org.joda.time.DurationField durationField61 = property58.getRangeDurationField();
        org.joda.time.DateTimeField dateTimeField62 = property58.getField();
        org.joda.time.DateTimeField dateTimeField63 = property58.getField();
        java.util.Locale locale64 = java.util.Locale.PRC;
        java.util.Locale locale65 = locale64.stripExtensions();
        java.lang.String str66 = locale64.getScript();
        java.util.Locale locale67 = locale64.stripExtensions();
        java.util.Set<java.lang.Character> charSet68 = locale67.getExtensionKeys();
        java.lang.String str69 = property58.getAsText(locale67);
        java.util.Locale locale70 = java.util.Locale.PRC;
        java.util.Locale locale71 = locale70.stripExtensions();
        java.util.Locale locale74 = new java.util.Locale("weekOfWeekyear", "millisOfSecond");
        java.lang.String str75 = locale71.getDisplayScript(locale74);
        java.lang.String str76 = property58.getAsText(locale74);
        java.lang.String str77 = dateTimeField43.getAsText((-3598L), locale74);
        java.lang.String str78 = dateTimeField31.getAsText(70, locale74);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField37", (durationField3.compareTo(durationField37) == 0) == durationField3.equals(durationField37));
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test554");
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
        java.util.Locale locale14 = java.util.Locale.CHINA;
        java.lang.String str15 = property11.getAsText(locale14);
        org.joda.time.LocalDateTime localDateTime16 = property11.withMinimumValue();
        java.lang.String str17 = property11.getAsShortText();
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime((long) 1);
        int int20 = localDateTime19.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime22 = localDateTime19.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology25 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone24);
        org.joda.time.DateTime dateTime26 = localDateTime19.toDateTime(dateTimeZone24);
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime((long) 1);
        int int29 = localDateTime28.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime31 = localDateTime28.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology34 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone33);
        org.joda.time.DateTime dateTime35 = localDateTime28.toDateTime(dateTimeZone33);
        long long36 = dateTime35.getMillis();
        boolean boolean37 = dateTime26.isAfter((org.joda.time.ReadableInstant) dateTime35);
        long long38 = dateTime35.getMillis();
        org.joda.time.Instant instant39 = dateTime35.toInstant();
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology42 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone41);
        boolean boolean44 = dateTimeZone41.equals((java.lang.Object) 10L);
        java.util.Locale locale46 = java.util.Locale.JAPAN;
        java.lang.String str47 = locale46.getISO3Country();
        java.lang.String str48 = dateTimeZone41.getShortName(1970L, locale46);
        java.util.TimeZone timeZone49 = dateTimeZone41.toTimeZone();
        long long52 = dateTimeZone41.convertLocalToUTC(2626841168L, false);
        boolean boolean53 = instant39.equals((java.lang.Object) false);
        int int54 = property11.getDifference((org.joda.time.ReadableInstant) instant39);
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
        org.joda.time.DateTimeZone dateTimeZone75 = dateTime72.getZone();
        java.lang.String str76 = dateTime72.toString();
        boolean boolean77 = instant39.isBefore((org.joda.time.ReadableInstant) dateTime72);
        org.joda.time.DateTimeZone dateTimeZone78 = instant39.getZone();
        org.joda.time.ReadableInstant readableInstant79 = null;
        boolean boolean80 = instant39.isBefore(readableInstant79);
        org.joda.time.LocalDateTime localDateTime87 = new org.joda.time.LocalDateTime(100, (int) (short) 10, (int) (short) 10, (int) (byte) 0, 0, (int) ' ');
        int int88 = localDateTime87.getMinuteOfHour();
        org.joda.time.LocalDateTime.Property property89 = localDateTime87.hourOfDay();
        org.joda.time.LocalDateTime localDateTime91 = property89.addToCopy((int) (byte) 100);
        org.joda.time.LocalDateTime.Property property92 = localDateTime91.dayOfMonth();
        boolean boolean93 = instant39.equals((java.lang.Object) property92);
        long long94 = property92.remainder();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime26 and instant39", (dateTime26.compareTo(instant39) == 0) == dateTime26.equals(instant39));
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test555");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = islamicChronology2.years();
        org.joda.time.DurationField durationField5 = islamicChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology2.hourOfHalfday();
        org.joda.time.DurationField durationField7 = islamicChronology2.hours();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology2.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology11 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone10);
        org.joda.time.DurationField durationField12 = islamicChronology11.weekyears();
        org.joda.time.DurationField durationField13 = islamicChronology11.months();
        org.joda.time.DateTimeField dateTimeField14 = islamicChronology11.minuteOfHour();
        org.joda.time.DurationField durationField15 = islamicChronology11.hours();
        org.joda.time.DateTimeField dateTimeField16 = islamicChronology11.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 0);
        org.joda.time.Chronology chronology19 = islamicChronology11.withZone(dateTimeZone18);
        org.joda.time.Chronology chronology20 = islamicChronology2.withZone(dateTimeZone18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField12", (durationField4.compareTo(durationField12) == 0) == durationField4.equals(durationField12));
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test556");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology2.yearOfEra();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.era();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology2.minuteOfDay();
        org.joda.time.DurationField durationField7 = islamicChronology2.centuries();
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((org.joda.time.Chronology) islamicChronology2);
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology2.millisOfSecond();
        org.joda.time.DurationField durationField10 = islamicChronology2.weekyears();
        org.joda.time.DurationField durationField11 = islamicChronology2.years();
        org.joda.time.DateTimeZone dateTimeZone12 = islamicChronology2.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField11", (durationField3.compareTo(durationField11) == 0) == durationField3.equals(durationField11));
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test557");
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(100, (int) (short) 10, (int) (short) 10, (int) (byte) 0, 0, (int) ' ');
        int int7 = localDateTime6.getMinuteOfHour();
        org.joda.time.LocalDateTime.Property property8 = localDateTime6.hourOfDay();
        org.joda.time.LocalDateTime localDateTime10 = property8.addToCopy((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime12 = property8.addToCopy(1);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.withCenturyOfEra(69);
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.yearOfCentury();
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = property15.getFieldType();
        java.lang.String str17 = property15.getAsString();
        org.joda.time.DurationField durationField18 = property15.getRangeDurationField();
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime((long) 1);
        int int21 = localDateTime20.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime23 = localDateTime20.withYear((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        org.joda.time.LocalDateTime localDateTime26 = localDateTime23.withPeriodAdded(readablePeriod24, 10);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime26.withDayOfYear(11);
        int[] intArray29 = localDateTime28.getValues();
        org.joda.time.LocalDateTime localDateTime31 = localDateTime28.plusYears((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology34 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone33);
        org.joda.time.DurationField durationField35 = islamicChronology34.weekyears();
        org.joda.time.DurationField durationField36 = islamicChronology34.months();
        org.joda.time.DateTimeField dateTimeField37 = islamicChronology34.minuteOfHour();
        org.joda.time.DurationField durationField38 = islamicChronology34.hours();
        org.joda.time.DateTimeField dateTimeField39 = islamicChronology34.yearOfCentury();
        org.joda.time.DurationField durationField40 = islamicChronology34.months();
        org.joda.time.DurationFieldType durationFieldType41 = durationField40.getType();
        boolean boolean42 = localDateTime28.isSupported(durationFieldType41);
        org.joda.time.LocalDateTime localDateTime44 = localDateTime28.withYearOfEra(9);
        java.util.Locale locale45 = java.util.Locale.KOREA;
        java.util.Locale locale46 = java.util.Locale.KOREA;
        java.lang.String str47 = locale45.getDisplayLanguage(locale46);
        java.lang.String str48 = locale46.getISO3Country();
        java.util.Set<java.lang.String> strSet49 = locale46.getUnicodeLocaleAttributes();
        strSet49.clear();
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
        int int65 = property62.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime67 = property62.addWrapFieldToCopy(70);
        org.joda.time.LocalDateTime localDateTime68 = property62.roundFloorCopy();
        boolean boolean69 = strSet49.remove((java.lang.Object) localDateTime68);
        org.joda.time.DateTimeZone dateTimeZone70 = null;
        org.joda.time.DateTime dateTime71 = localDateTime68.toDateTime(dateTimeZone70);
        org.joda.time.chrono.IslamicChronology islamicChronology72 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField73 = islamicChronology72.minuteOfDay();
        org.joda.time.DurationField durationField74 = islamicChronology72.months();
        org.joda.time.DateTimeField dateTimeField75 = islamicChronology72.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime77 = new org.joda.time.LocalDateTime((long) 1);
        int int78 = localDateTime77.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime80 = localDateTime77.minusHours((int) (byte) -1);
        int int81 = localDateTime77.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime83 = localDateTime77.withMinuteOfHour((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime85 = localDateTime77.plusHours((int) (byte) 100);
        int[] intArray87 = islamicChronology72.get((org.joda.time.ReadablePartial) localDateTime85, (long) 1969);
        org.joda.time.LocalDateTime localDateTime89 = localDateTime85.withWeekyear((int) '4');
        org.joda.time.DateTime dateTime90 = localDateTime89.toDateTime();
        int int91 = dateTime71.compareTo((org.joda.time.ReadableInstant) dateTime90);
        org.joda.time.DateTime dateTime92 = localDateTime28.toDateTime((org.joda.time.ReadableInstant) dateTime90);
        int int93 = property15.compareTo((org.joda.time.ReadableInstant) dateTime92);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField36 and durationField74", (durationField36.compareTo(durationField74) == 0) == durationField36.equals(durationField74));
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test558");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology2.weekyear();
        org.joda.time.DurationField durationField4 = islamicChronology2.years();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone6 = islamicChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology2.weekOfWeekyear();
        org.joda.time.DurationField durationField8 = islamicChronology2.months();
        org.joda.time.DurationField durationField9 = islamicChronology2.centuries();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology12 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone11);
        org.joda.time.DurationField durationField13 = islamicChronology12.weekyears();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology16 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone15);
        boolean boolean18 = dateTimeZone15.equals((java.lang.Object) 10L);
        org.joda.time.Chronology chronology19 = islamicChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField20 = islamicChronology12.hourOfHalfday();
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime((long) 1);
        int int23 = localDateTime22.getHourOfDay();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology26 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone25);
        org.joda.time.DateTimeField dateTimeField27 = islamicChronology26.weekyear();
        org.joda.time.ReadablePartial readablePartial28 = null;
        int[] intArray35 = new int[] { (short) 100, 10, 100, (short) -1, (byte) 10 };
        int[] intArray37 = dateTimeField27.addWrapPartial(readablePartial28, 100, intArray35, (int) (short) 0);
        int int38 = dateTimeField20.getMaximumValue((org.joda.time.ReadablePartial) localDateTime22, intArray35);
        org.joda.time.LocalDateTime localDateTime40 = new org.joda.time.LocalDateTime((long) 1);
        int int41 = localDateTime40.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime43 = localDateTime40.minusHours((int) (byte) -1);
        int int45 = localDateTime40.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime47 = localDateTime40.withMillisOfSecond((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime48 = localDateTime22.withFields((org.joda.time.ReadablePartial) localDateTime47);
        org.joda.time.LocalDateTime.Property property49 = localDateTime22.hourOfDay();
        org.joda.time.LocalDateTime localDateTime50 = property49.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime51 = property49.getLocalDateTime();
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology54 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone53);
        org.joda.time.DurationField durationField55 = islamicChronology54.weekyears();
        org.joda.time.DurationField durationField56 = islamicChronology54.halfdays();
        org.joda.time.DateTimeField dateTimeField57 = islamicChronology54.yearOfEra();
        org.joda.time.DateTimeField dateTimeField58 = islamicChronology54.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField59 = islamicChronology54.monthOfYear();
        org.joda.time.Chronology chronology60 = islamicChronology54.withUTC();
        long long64 = islamicChronology54.add((long) 2000, 52000L, (int) '4');
        org.joda.time.LocalDateTime localDateTime66 = new org.joda.time.LocalDateTime((long) 1);
        int int67 = localDateTime66.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime69 = localDateTime66.minusHours((int) (byte) -1);
        int int70 = localDateTime66.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime72 = localDateTime66.withMinuteOfHour((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime74 = localDateTime66.plusHours((int) (byte) 100);
        org.joda.time.ReadableDuration readableDuration75 = null;
        org.joda.time.LocalDateTime localDateTime76 = localDateTime66.minus(readableDuration75);
        int int77 = localDateTime66.getCenturyOfEra();
        java.lang.String str78 = localDateTime66.toString();
        org.joda.time.LocalDateTime localDateTime80 = localDateTime66.plusHours((int) '#');
        int int81 = localDateTime80.getSecondOfMinute();
        int int82 = localDateTime80.getMinuteOfHour();
        int[] intArray84 = islamicChronology54.get((org.joda.time.ReadablePartial) localDateTime80, 30170880043200010L);
        islamicChronology2.validate((org.joda.time.ReadablePartial) localDateTime51, intArray84);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField13", (durationField4.compareTo(durationField13) == 0) == durationField4.equals(durationField13));
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test559");
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
        org.joda.time.LocalDateTime localDateTime29 = localDateTime23.withYear((int) (byte) 0);
        org.joda.time.LocalDateTime.Property property30 = localDateTime23.weekyear();
        org.joda.time.LocalDateTime localDateTime31 = property30.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime33 = property30.setCopy((-683357));
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology36 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone35);
        int int37 = islamicChronology36.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField38 = islamicChronology36.secondOfDay();
        org.joda.time.DurationField durationField39 = islamicChronology36.seconds();
        org.joda.time.DateTimeField dateTimeField40 = islamicChronology36.clockhourOfHalfday();
        org.joda.time.DurationField durationField41 = islamicChronology36.years();
        org.joda.time.DurationField durationField42 = islamicChronology36.days();
        boolean boolean43 = localDateTime33.equals((java.lang.Object) durationField42);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField41", (durationField3.compareTo(durationField41) == 0) == durationField3.equals(durationField41));
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test560");
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
        org.joda.time.DateTimeField dateTimeField24 = islamicChronology2.secondOfDay();
        org.joda.time.DateTimeField dateTimeField25 = islamicChronology2.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField26 = islamicChronology2.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology29 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone28);
        org.joda.time.DurationField durationField30 = islamicChronology29.weekyears();
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology33 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone32);
        boolean boolean35 = dateTimeZone32.equals((java.lang.Object) 10L);
        org.joda.time.Chronology chronology36 = islamicChronology29.withZone(dateTimeZone32);
        org.joda.time.ReadablePeriod readablePeriod37 = null;
        long long40 = islamicChronology29.add(readablePeriod37, (long) (byte) 0, (-1));
        org.joda.time.DateTimeField dateTimeField41 = islamicChronology29.dayOfMonth();
        org.joda.time.DurationField durationField42 = dateTimeField41.getDurationField();
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
        org.joda.time.LocalDateTime localDateTime61 = localDateTime54.minusSeconds((int) (short) 100);
        java.util.Locale locale63 = null;
        java.lang.String str64 = dateTimeField41.getAsShortText((org.joda.time.ReadablePartial) localDateTime61, 82800001, locale63);
        int int65 = localDateTime61.getDayOfWeek();
        int int66 = dateTimeField26.getMaximumValue((org.joda.time.ReadablePartial) localDateTime61);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField30", (durationField4.compareTo(durationField30) == 0) == durationField4.equals(durationField30));
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test561");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        int int2 = localDateTime1.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.minusHours((int) (byte) -1);
        org.joda.time.DateTimeField[] dateTimeFieldArray5 = localDateTime4.getFields();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.minusDays(4);
        org.joda.time.DateTime dateTime8 = localDateTime7.toDateTime();
        org.joda.time.Chronology chronology9 = dateTime8.getChronology();
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
        org.joda.time.DateTimeZone dateTimeZone30 = dateTime27.getZone();
        java.lang.String str31 = dateTime27.toString();
        java.lang.String str32 = dateTime27.toString();
        org.joda.time.Instant instant33 = dateTime27.toInstant();
        boolean boolean34 = dateTime8.isBefore((org.joda.time.ReadableInstant) instant33);
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology37 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone36);
        org.joda.time.DateTimeField dateTimeField38 = islamicChronology37.weekyear();
        org.joda.time.DurationField durationField39 = islamicChronology37.weekyears();
        org.joda.time.DateTimeZone dateTimeZone40 = islamicChronology37.getZone();
        org.joda.time.chrono.IslamicChronology islamicChronology41 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone40);
        org.joda.time.DateTimeZone dateTimeZone42 = islamicChronology41.getZone();
        long long45 = dateTimeZone42.adjustOffset((long) (byte) 10, true);
        java.lang.String str47 = dateTimeZone42.getNameKey((long) 292278993);
        org.joda.time.LocalDateTime localDateTime49 = new org.joda.time.LocalDateTime((long) (byte) -1);
        org.joda.time.LocalDateTime localDateTime51 = localDateTime49.minusDays(12);
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology54 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone53);
        org.joda.time.DurationField durationField55 = islamicChronology54.weekyears();
        org.joda.time.DurationField durationField56 = islamicChronology54.halfdays();
        org.joda.time.DateTimeField dateTimeField57 = islamicChronology54.yearOfEra();
        org.joda.time.DurationField durationField58 = islamicChronology54.halfdays();
        org.joda.time.DurationFieldType durationFieldType59 = durationField58.getType();
        org.joda.time.LocalDateTime localDateTime61 = localDateTime49.withFieldAdded(durationFieldType59, (int) '#');
        boolean boolean62 = dateTimeZone42.isLocalDateTimeGap(localDateTime61);
        long long64 = dateTimeZone42.previousTransition(1403L);
        org.joda.time.LocalDateTime localDateTime65 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime8, dateTimeZone42);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime18 and instant33", (dateTime18.compareTo(instant33) == 0) == dateTime18.equals(instant33));
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test562");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology2.weekyear();
        org.joda.time.DurationField durationField4 = islamicChronology2.years();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology2.hourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology2.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology2.monthOfYear();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology2.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology2.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology2.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((long) 1);
        int int14 = localDateTime13.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime13.minusHours((int) (byte) -1);
        int int17 = localDateTime13.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime13.withMinuteOfHour((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime13.plusHours((int) (byte) 100);
        java.util.Date date22 = localDateTime21.toDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = null;
        boolean boolean24 = localDateTime21.isSupported(dateTimeFieldType23);
        int int25 = localDateTime21.getCenturyOfEra();
        long long27 = islamicChronology2.set((org.joda.time.ReadablePartial) localDateTime21, 6656400000L);
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology30 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone29);
        org.joda.time.DurationField durationField31 = islamicChronology30.weekyears();
        org.joda.time.DurationField durationField32 = islamicChronology30.halfdays();
        org.joda.time.DateTimeField dateTimeField33 = islamicChronology30.yearOfEra();
        org.joda.time.DurationField durationField34 = islamicChronology30.months();
        org.joda.time.DateTimeField dateTimeField35 = islamicChronology30.yearOfCentury();
        org.joda.time.DurationField durationField36 = islamicChronology30.weeks();
        org.joda.time.DateTimeField dateTimeField37 = islamicChronology30.weekOfWeekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType38 = dateTimeField37.getType();
        org.joda.time.LocalDateTime.Property property39 = localDateTime21.property(dateTimeFieldType38);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField31", (durationField4.compareTo(durationField31) == 0) == durationField4.equals(durationField31));
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test563");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.minuteOfDay();
        org.joda.time.DurationField durationField2 = islamicChronology0.months();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology5 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone4);
        org.joda.time.DurationField durationField6 = islamicChronology5.weekyears();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology5.hourOfDay();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology5.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology5.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology12 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone11);
        org.joda.time.DurationField durationField13 = islamicChronology12.weekyears();
        org.joda.time.DurationField durationField14 = islamicChronology12.months();
        org.joda.time.DurationField durationField15 = islamicChronology12.centuries();
        org.joda.time.DateTimeZone dateTimeZone16 = islamicChronology12.getZone();
        org.joda.time.Chronology chronology17 = islamicChronology5.withZone(dateTimeZone16);
        org.joda.time.DateTimeField dateTimeField18 = islamicChronology5.monthOfYear();
        org.joda.time.DurationField durationField19 = islamicChronology5.millis();
        org.joda.time.DateTimeField dateTimeField20 = islamicChronology5.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField21 = islamicChronology5.yearOfEra();
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime((long) 1);
        int int24 = localDateTime23.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime26 = localDateTime23.minusHours((int) (byte) -1);
        int int27 = localDateTime23.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime29 = localDateTime23.withMinuteOfHour((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime23.plusHours((int) (byte) 100);
        java.util.Date date32 = localDateTime31.toDate();
        org.joda.time.DateTime dateTime33 = localDateTime31.toDateTime();
        int[] intArray35 = islamicChronology5.get((org.joda.time.ReadablePartial) localDateTime31, (-3599999L));
        boolean boolean36 = islamicChronology0.equals((java.lang.Object) islamicChronology5);
        org.joda.time.DateTimeField dateTimeField37 = islamicChronology5.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField38 = islamicChronology5.dayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField14", (durationField2.compareTo(durationField14) == 0) == durationField2.equals(durationField14));
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test564");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = islamicChronology2.years();
        org.joda.time.DurationField durationField5 = islamicChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology2.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology2.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology12 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone11);
        org.joda.time.DurationField durationField13 = islamicChronology12.weekyears();
        org.joda.time.DateTimeField dateTimeField14 = islamicChronology12.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone15 = islamicChronology12.getZone();
        int int17 = dateTimeZone15.getOffsetFromLocal(19800L);
        long long20 = dateTimeZone15.adjustOffset((long) 11, false);
        java.util.Locale locale22 = java.util.Locale.KOREA;
        java.util.Locale locale23 = java.util.Locale.KOREA;
        java.lang.String str24 = locale22.getDisplayLanguage(locale23);
        java.lang.String str25 = locale23.getISO3Country();
        java.lang.String str26 = dateTimeZone15.getName((long) (short) 0, locale23);
        boolean boolean28 = dateTimeZone15.isStandardOffset(2143234800001L);
        org.joda.time.Chronology chronology29 = islamicChronology2.withZone(dateTimeZone15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField13", (durationField4.compareTo(durationField13) == 0) == durationField4.equals(durationField13));
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test565");
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
        org.joda.time.DurationField durationField27 = islamicChronology2.seconds();
        org.joda.time.DurationField durationField28 = islamicChronology2.weeks();
        org.joda.time.DurationField durationField29 = islamicChronology2.halfdays();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology32 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone31);
        org.joda.time.DurationField durationField33 = islamicChronology32.weekyears();
        org.joda.time.DateTimeField dateTimeField34 = islamicChronology32.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology37 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone36);
        org.joda.time.DateTimeField dateTimeField38 = islamicChronology37.weekyear();
        org.joda.time.LocalDateTime localDateTime45 = new org.joda.time.LocalDateTime(100, (int) (short) 10, (int) (short) 10, (int) (byte) 0, 0, (int) ' ');
        org.joda.time.ReadableDuration readableDuration46 = null;
        org.joda.time.LocalDateTime localDateTime47 = localDateTime45.plus(readableDuration46);
        org.joda.time.ReadablePeriod readablePeriod48 = null;
        org.joda.time.LocalDateTime localDateTime49 = localDateTime47.plus(readablePeriod48);
        org.joda.time.LocalDateTime localDateTime51 = localDateTime47.withMinuteOfHour(0);
        java.util.Locale locale53 = new java.util.Locale("\u5927\u97d3\u6c11\u56fd");
        java.lang.String str54 = dateTimeField38.getAsShortText((org.joda.time.ReadablePartial) localDateTime47, locale53);
        org.joda.time.DateTimeFieldType dateTimeFieldType56 = localDateTime47.getFieldType((int) (byte) 0);
        int[] intArray58 = islamicChronology32.get((org.joda.time.ReadablePartial) localDateTime47, 20217598041L);
        int int59 = localDateTime47.getMinuteOfHour();
        int[] intArray61 = islamicChronology2.get((org.joda.time.ReadablePartial) localDateTime47, 1179251742300001L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField33", (durationField4.compareTo(durationField33) == 0) == durationField4.equals(durationField33));
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test566");
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
        org.joda.time.DurationField durationField18 = islamicChronology2.eras();
        org.joda.time.DateTimeField dateTimeField19 = islamicChronology2.yearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField18", Math.signum(durationField3.compareTo(durationField18)) == -Math.signum(durationField18.compareTo(durationField3)));
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test567");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology6 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone5);
        boolean boolean8 = dateTimeZone5.equals((java.lang.Object) 10L);
        org.joda.time.Chronology chronology9 = islamicChronology2.withZone(dateTimeZone5);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        long long13 = islamicChronology2.add(readablePeriod10, 82799999L, 9);
        org.joda.time.DateTimeField dateTimeField14 = islamicChronology2.secondOfDay();
        long long18 = islamicChronology2.add((-4304999901L), (-129383481600000000L), 0);
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime((long) 1);
        int int21 = localDateTime20.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime23 = localDateTime20.minusHours((int) (byte) -1);
        int int25 = localDateTime20.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime20.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.LocalDateTime localDateTime29 = localDateTime20.minus(readablePeriod28);
        int int30 = localDateTime29.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField32 = localDateTime29.getField(0);
        org.joda.time.LocalDateTime.Property property33 = localDateTime29.centuryOfEra();
        org.joda.time.LocalDateTime.Property property34 = localDateTime29.millisOfSecond();
        org.joda.time.DateTimeFieldType dateTimeFieldType35 = property34.getFieldType();
        java.lang.String str36 = property34.getAsString();
        org.joda.time.LocalDateTime localDateTime38 = property34.addWrapFieldToCopy(999);
        org.joda.time.ReadablePeriod readablePeriod39 = null;
        org.joda.time.LocalDateTime localDateTime41 = localDateTime38.withPeriodAdded(readablePeriod39, 43);
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology44 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone43);
        org.joda.time.DateTimeField dateTimeField45 = islamicChronology44.yearOfCentury();
        org.joda.time.DurationField durationField46 = islamicChronology44.years();
        org.joda.time.LocalDateTime localDateTime48 = new org.joda.time.LocalDateTime((long) 1);
        int int49 = localDateTime48.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime51 = localDateTime48.minusHours((int) (byte) -1);
        int int53 = localDateTime48.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime55 = localDateTime48.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod56 = null;
        org.joda.time.LocalDateTime localDateTime57 = localDateTime48.minus(readablePeriod56);
        int int58 = localDateTime57.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField60 = localDateTime57.getField(0);
        org.joda.time.LocalDateTime.Property property61 = localDateTime57.centuryOfEra();
        int[] intArray63 = islamicChronology44.get((org.joda.time.ReadablePartial) localDateTime57, (long) 0);
        org.joda.time.DateTimeField dateTimeField64 = islamicChronology44.millisOfDay();
        org.joda.time.DurationField durationField65 = islamicChronology44.centuries();
        org.joda.time.DateTimeZone dateTimeZone66 = islamicChronology44.getZone();
        org.joda.time.DateTimeField dateTimeField67 = islamicChronology44.dayOfWeek();
        org.joda.time.DurationField durationField68 = islamicChronology44.minutes();
        org.joda.time.DateTimeField dateTimeField69 = islamicChronology44.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField70 = islamicChronology44.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField71 = islamicChronology44.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone73 = org.joda.time.DateTimeZone.forOffsetHours(12);
        org.joda.time.Chronology chronology74 = islamicChronology44.withZone(dateTimeZone73);
        org.joda.time.DateTimeField dateTimeField75 = islamicChronology44.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField76 = islamicChronology44.clockhourOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType77 = dateTimeField76.getType();
        int int78 = localDateTime41.indexOf(dateTimeFieldType77);
        int[] intArray80 = islamicChronology2.get((org.joda.time.ReadablePartial) localDateTime41, 11774L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField46", (durationField3.compareTo(durationField46) == 0) == durationField3.equals(durationField46));
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test568");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        int int2 = localDateTime1.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology7 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone6);
        org.joda.time.DateTime dateTime8 = localDateTime1.toDateTime(dateTimeZone6);
        long long9 = dateTime8.getMillis();
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((long) 1);
        int int12 = localDateTime11.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology17 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone16);
        org.joda.time.DateTime dateTime18 = localDateTime11.toDateTime(dateTimeZone16);
        long long19 = dateTime18.getMillis();
        long long20 = dateTime18.getMillis();
        boolean boolean21 = dateTime8.isAfter((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.Chronology chronology22 = dateTime18.getChronology();
        java.util.Locale.FilteringMode filteringMode23 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        boolean boolean24 = dateTime18.equals((java.lang.Object) filteringMode23);
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime((long) 1);
        int int27 = localDateTime26.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime29 = localDateTime26.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology32 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone31);
        org.joda.time.DateTime dateTime33 = localDateTime26.toDateTime(dateTimeZone31);
        long long34 = dateTime33.getMillis();
        long long35 = dateTime33.getMillis();
        org.joda.time.Instant instant36 = dateTime33.toInstant();
        boolean boolean37 = dateTime18.isEqual((org.joda.time.ReadableInstant) instant36);
        org.joda.time.Instant instant38 = instant36.toInstant();
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology41 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone40);
        org.joda.time.DurationField durationField42 = islamicChronology41.weekyears();
        org.joda.time.DateTimeField dateTimeField43 = islamicChronology41.hourOfDay();
        org.joda.time.DateTimeField dateTimeField44 = islamicChronology41.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField45 = islamicChronology41.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField46 = islamicChronology41.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime48 = new org.joda.time.LocalDateTime((long) 1);
        int int49 = localDateTime48.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime51 = localDateTime48.minusHours((int) (byte) -1);
        int int52 = localDateTime48.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime54 = localDateTime48.minusMinutes((int) '#');
        org.joda.time.LocalDateTime.Property property55 = localDateTime54.centuryOfEra();
        java.lang.String str56 = localDateTime54.toString();
        int int57 = localDateTime54.getWeekOfWeekyear();
        org.joda.time.LocalDateTime.Property property58 = localDateTime54.era();
        org.joda.time.DateTimeZone dateTimeZone60 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology61 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone60);
        org.joda.time.DurationField durationField62 = islamicChronology61.weekyears();
        org.joda.time.DurationField durationField63 = islamicChronology61.months();
        org.joda.time.DateTimeField dateTimeField64 = islamicChronology61.halfdayOfDay();
        org.joda.time.LocalDateTime localDateTime66 = new org.joda.time.LocalDateTime((long) 1);
        int int67 = localDateTime66.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime69 = localDateTime66.minusHours((int) (byte) -1);
        int int71 = localDateTime66.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime73 = localDateTime66.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod74 = null;
        org.joda.time.LocalDateTime localDateTime75 = localDateTime66.minus(readablePeriod74);
        int int76 = localDateTime75.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField78 = localDateTime75.getField(0);
        org.joda.time.LocalDateTime.Property property79 = localDateTime75.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime81 = new org.joda.time.LocalDateTime((long) 1);
        int int82 = localDateTime81.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime84 = localDateTime81.withYear((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod85 = null;
        org.joda.time.LocalDateTime localDateTime87 = localDateTime84.withPeriodAdded(readablePeriod85, 10);
        org.joda.time.LocalDateTime localDateTime89 = localDateTime87.withDayOfYear(11);
        int[] intArray90 = localDateTime89.getValues();
        islamicChronology61.validate((org.joda.time.ReadablePartial) localDateTime75, intArray90);
        int int92 = dateTimeField46.getMaximumValue((org.joda.time.ReadablePartial) localDateTime54, intArray90);
        org.joda.time.DateTimeZone dateTimeZone93 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime94 = localDateTime54.toDateTime(dateTimeZone93);
        long long95 = dateTime94.getMillis();
        int int96 = instant36.compareTo((org.joda.time.ReadableInstant) dateTime94);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and instant36", (dateTime8.compareTo(instant36) == 0) == dateTime8.equals(instant36));
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test569");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology2.hourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.millisOfSecond();
        java.lang.String str6 = islamicChronology2.toString();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology9 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone8);
        java.lang.String str10 = dateTimeZone8.toString();
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime((long) 1);
        int int13 = localDateTime12.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime12.withYear((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.LocalDateTime localDateTime18 = localDateTime15.withPeriodAdded(readablePeriod16, 10);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime15.plusSeconds((int) ' ');
        boolean boolean21 = dateTimeZone8.isLocalDateTimeGap(localDateTime20);
        org.joda.time.Chronology chronology22 = islamicChronology2.withZone(dateTimeZone8);
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime((long) 1);
        int int26 = localDateTime25.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime28 = localDateTime25.minusHours((int) (byte) -1);
        int int30 = localDateTime25.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime25.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        org.joda.time.LocalDateTime localDateTime34 = localDateTime25.minus(readablePeriod33);
        org.joda.time.LocalDateTime.Property property35 = localDateTime25.millisOfSecond();
        long long36 = property35.remainder();
        java.util.Locale locale37 = java.util.Locale.KOREA;
        java.util.Locale locale38 = java.util.Locale.KOREA;
        java.lang.String str39 = locale37.getDisplayLanguage(locale38);
        java.util.Locale.setDefault(locale37);
        int int41 = property35.getMaximumShortTextLength(locale37);
        java.lang.String str42 = locale37.getCountry();
        java.lang.String str43 = locale37.getDisplayCountry();
        org.joda.time.LocalDateTime localDateTime45 = new org.joda.time.LocalDateTime((long) 1);
        int int46 = localDateTime45.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime48 = localDateTime45.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology51 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone50);
        org.joda.time.DateTime dateTime52 = localDateTime45.toDateTime(dateTimeZone50);
        org.joda.time.LocalDateTime localDateTime54 = new org.joda.time.LocalDateTime((long) 1);
        int int55 = localDateTime54.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime57 = localDateTime54.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone59 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology60 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone59);
        org.joda.time.DateTime dateTime61 = localDateTime54.toDateTime(dateTimeZone59);
        long long62 = dateTime61.getMillis();
        boolean boolean63 = dateTime52.isAfter((org.joda.time.ReadableInstant) dateTime61);
        org.joda.time.DateTimeZone dateTimeZone64 = dateTime52.getZone();
        org.joda.time.DateTimeZone dateTimeZone67 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology68 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone67);
        org.joda.time.DurationField durationField69 = islamicChronology68.weekyears();
        org.joda.time.DurationField durationField70 = islamicChronology68.halfdays();
        org.joda.time.DateTimeField dateTimeField71 = islamicChronology68.yearOfEra();
        org.joda.time.DurationField durationField72 = islamicChronology68.halfdays();
        org.joda.time.LocalDateTime localDateTime73 = new org.joda.time.LocalDateTime((org.joda.time.Chronology) islamicChronology68);
        org.joda.time.DateTimeField dateTimeField74 = islamicChronology68.yearOfEra();
        java.util.Locale locale75 = java.util.Locale.US;
        int int76 = dateTimeField74.getMaximumShortTextLength(locale75);
        java.lang.String str77 = locale75.getDisplayLanguage();
        java.lang.String str78 = dateTimeZone64.getName(9000L, locale75);
        java.lang.String str79 = locale37.getDisplayLanguage(locale75);
        java.lang.String str80 = dateTimeZone8.getShortName(0L, locale37);
        org.joda.time.LocalDateTime localDateTime82 = new org.joda.time.LocalDateTime((long) 1);
        int int83 = localDateTime82.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime85 = localDateTime82.minusHours((int) (byte) -1);
        int int86 = localDateTime82.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime88 = localDateTime82.withMinuteOfHour((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime90 = localDateTime82.plusHours((int) (byte) 100);
        java.util.Date date91 = localDateTime90.toDate();
        org.joda.time.DateTime dateTime92 = localDateTime90.toDateTime();
        org.joda.time.Instant instant93 = dateTime92.toInstant();
        int int94 = dateTimeZone8.getOffset((org.joda.time.ReadableInstant) instant93);
        long long96 = dateTimeZone8.convertUTCToLocal(1244160086400000L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime92 and instant93", (dateTime92.compareTo(instant93) == 0) == dateTime92.equals(instant93));
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test570");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology2.hourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.millisOfSecond();
        java.lang.String str6 = islamicChronology2.toString();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology2.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology2.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology2.centuryOfEra();
        java.lang.String str10 = islamicChronology2.toString();
        org.joda.time.DurationField durationField11 = islamicChronology2.eras();
        org.joda.time.DurationField durationField12 = islamicChronology2.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField11", Math.signum(durationField3.compareTo(durationField11)) == -Math.signum(durationField11.compareTo(durationField3)));
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test571");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DurationField durationField4 = islamicChronology2.months();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.halfdayOfDay();
        org.joda.time.DurationField durationField6 = islamicChronology2.years();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology2.yearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField6", (durationField3.compareTo(durationField6) == 0) == durationField3.equals(durationField6));
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test572");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DurationField durationField4 = islamicChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.yearOfEra();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology2.weekyear();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology2.dayOfYear();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology2.era();
        org.joda.time.DurationField durationField10 = islamicChronology2.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField10, durationField3, and durationField4", !(durationField10.compareTo(durationField3) == 0) || (Math.signum(durationField10.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test573");
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
        org.joda.time.DateTimeZone dateTimeZone20 = dateTime8.getZone();
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime((long) 1);
        int int23 = localDateTime22.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime25 = localDateTime22.minusHours((int) (byte) -1);
        int int26 = localDateTime22.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime28 = localDateTime22.withMinuteOfHour((int) (byte) 1);
        org.joda.time.ReadableDuration readableDuration29 = null;
        org.joda.time.LocalDateTime localDateTime31 = localDateTime28.withDurationAdded(readableDuration29, (int) 'x');
        org.joda.time.LocalDateTime localDateTime33 = localDateTime31.minusDays(82800001);
        org.joda.time.LocalDateTime localDateTime35 = localDateTime31.plusHours(60);
        boolean boolean36 = dateTimeZone20.isLocalDateTimeGap(localDateTime31);
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
        org.joda.time.DurationField durationField59 = islamicChronology39.minutes();
        boolean boolean60 = dateTimeZone20.equals((java.lang.Object) durationField59);
        java.lang.String str62 = dateTimeZone20.getNameKey(1746800049884400000L);
        org.joda.time.DateTimeZone dateTimeZone64 = org.joda.time.DateTimeZone.forID("+01:00");
        org.joda.time.LocalDateTime localDateTime66 = new org.joda.time.LocalDateTime((long) 1);
        int int67 = localDateTime66.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime69 = localDateTime66.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone71 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology72 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone71);
        org.joda.time.DurationField durationField73 = islamicChronology72.weekyears();
        org.joda.time.DurationField durationField74 = islamicChronology72.halfdays();
        org.joda.time.DateTimeField dateTimeField75 = islamicChronology72.yearOfEra();
        org.joda.time.DurationField durationField76 = islamicChronology72.halfdays();
        org.joda.time.DurationFieldType durationFieldType77 = durationField76.getType();
        boolean boolean78 = localDateTime66.isSupported(durationFieldType77);
        org.joda.time.LocalDateTime.Property property79 = localDateTime66.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime81 = property79.setCopy(10);
        int int82 = localDateTime81.getYear();
        boolean boolean83 = dateTimeZone64.equals((java.lang.Object) int82);
        long long85 = dateTimeZone20.getMillisKeepLocal(dateTimeZone64, 19359990000000L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField41 and durationField73", (durationField41.compareTo(durationField73) == 0) == durationField41.equals(durationField73));
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test574");
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
        java.util.Locale locale14 = java.util.Locale.CHINA;
        java.lang.String str15 = property11.getAsText(locale14);
        org.joda.time.LocalDateTime localDateTime16 = property11.withMinimumValue();
        boolean boolean18 = property11.equals((java.lang.Object) 59);
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime((long) 1);
        int int21 = localDateTime20.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime23 = localDateTime20.minusHours((int) (byte) -1);
        org.joda.time.DateTimeField[] dateTimeFieldArray24 = localDateTime23.getFields();
        org.joda.time.LocalDateTime localDateTime26 = localDateTime23.minusDays(4);
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
        org.joda.time.LocalDateTime.Property property42 = localDateTime37.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime47 = localDateTime37.withTime((int) (byte) 1, 0, 5, (int) (byte) 100);
        boolean boolean48 = localDateTime23.isBefore((org.joda.time.ReadablePartial) localDateTime47);
        org.joda.time.LocalDateTime.Property property49 = localDateTime47.weekyear();
        boolean boolean50 = property11.equals((java.lang.Object) localDateTime47);
        org.joda.time.LocalDateTime.Property property51 = localDateTime47.weekyear();
        org.joda.time.LocalDateTime localDateTime52 = property51.withMinimumValue();
        java.util.Locale locale54 = java.util.Locale.PRC;
        java.util.Locale locale55 = locale54.stripExtensions();
        java.util.Locale locale58 = new java.util.Locale("weekOfWeekyear", "millisOfSecond");
        java.lang.String str59 = locale55.getDisplayScript(locale58);
        java.lang.String str60 = locale55.getVariant();
        java.lang.String str61 = locale55.getDisplayCountry();
        org.joda.time.LocalDateTime localDateTime62 = property51.setCopy("90", locale55);
        org.joda.time.DateTimeZone dateTimeZone64 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology65 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone64);
        org.joda.time.DurationField durationField66 = islamicChronology65.weekyears();
        org.joda.time.DurationField durationField67 = islamicChronology65.millis();
        org.joda.time.DateTimeField dateTimeField68 = islamicChronology65.millisOfSecond();
        org.joda.time.DurationField durationField69 = islamicChronology65.seconds();
        org.joda.time.DurationField durationField70 = islamicChronology65.years();
        org.joda.time.DurationFieldType durationFieldType71 = durationField70.getType();
        org.joda.time.DurationFieldType durationFieldType72 = durationField70.getType();
        boolean boolean73 = localDateTime62.isSupported(durationFieldType72);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField66 and durationField70", (durationField66.compareTo(durationField70) == 0) == durationField66.equals(durationField70));
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test575");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology2.hourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.weekOfWeekyear();
        org.joda.time.DurationField durationField6 = islamicChronology2.days();
        org.joda.time.DurationField durationField7 = islamicChronology2.months();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology2.year();
        org.joda.time.DurationField durationField9 = islamicChronology2.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField3, and durationField6", !(durationField9.compareTo(durationField3) == 0) || (Math.signum(durationField9.compareTo(durationField6)) == Math.signum(durationField3.compareTo(durationField6))));
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test576");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        java.lang.String str3 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology4 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField5 = islamicChronology4.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology4.dayOfMonth();
        org.joda.time.DurationField durationField7 = islamicChronology4.days();
        org.joda.time.DurationField durationField8 = islamicChronology4.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField8, durationField5, and durationField7", !(durationField8.compareTo(durationField5) == 0) || (Math.signum(durationField8.compareTo(durationField7)) == Math.signum(durationField5.compareTo(durationField7))));
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test577");
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
        org.joda.time.DurationField durationField26 = islamicChronology2.centuries();
        org.joda.time.DateTimeField dateTimeField27 = islamicChronology2.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField28 = islamicChronology2.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField29 = islamicChronology2.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime((org.joda.time.Chronology) islamicChronology2);
        org.joda.time.DurationField durationField31 = islamicChronology2.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField31, durationField4, and durationField23", !(durationField31.compareTo(durationField4) == 0) || (Math.signum(durationField31.compareTo(durationField23)) == Math.signum(durationField4.compareTo(durationField23))));
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test578");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DurationField durationField4 = islamicChronology2.months();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.minuteOfHour();
        org.joda.time.DurationField durationField6 = islamicChronology2.hours();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology2.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 0);
        org.joda.time.Chronology chronology10 = islamicChronology2.withZone(dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology2.yearOfEra();
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology2.halfdayOfDay();
        org.joda.time.DurationField durationField13 = islamicChronology2.millis();
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((long) 1);
        int int16 = localDateTime15.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime15.minusHours((int) (byte) -1);
        int int19 = localDateTime15.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime15.minusMinutes((int) '#');
        org.joda.time.LocalDateTime.Property property22 = localDateTime21.centuryOfEra();
        java.util.Locale locale23 = java.util.Locale.FRENCH;
        java.lang.String str24 = property22.getAsShortText(locale23);
        boolean boolean26 = property22.equals((java.lang.Object) "\u5927\u97d3\u6c11\u56fd");
        org.joda.time.LocalDateTime localDateTime27 = property22.roundHalfFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology30 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone29);
        boolean boolean32 = dateTimeZone29.equals((java.lang.Object) 10L);
        java.lang.String str34 = dateTimeZone29.getName((long) '#');
        long long38 = dateTimeZone29.convertLocalToUTC(3L, false, 86400000L);
        org.joda.time.DateTime dateTime39 = localDateTime27.toDateTime(dateTimeZone29);
        int[] intArray41 = islamicChronology2.get((org.joda.time.ReadablePartial) localDateTime27, 19360361440124L);
        org.joda.time.DateTimeField dateTimeField42 = islamicChronology2.year();
        org.joda.time.DurationField durationField43 = islamicChronology2.minutes();
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology46 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone45);
        org.joda.time.DateTimeField dateTimeField47 = islamicChronology46.yearOfCentury();
        org.joda.time.DurationField durationField48 = islamicChronology46.years();
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
        int[] intArray65 = islamicChronology46.get((org.joda.time.ReadablePartial) localDateTime59, (long) 0);
        org.joda.time.DateTimeField dateTimeField66 = islamicChronology46.millisOfDay();
        org.joda.time.DurationField durationField67 = islamicChronology46.centuries();
        org.joda.time.DateTimeZone dateTimeZone68 = islamicChronology46.getZone();
        org.joda.time.DateTimeField dateTimeField69 = islamicChronology46.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField70 = islamicChronology46.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField71 = islamicChronology46.monthOfYear();
        org.joda.time.DurationField durationField72 = dateTimeField71.getRangeDurationField();
        boolean boolean73 = islamicChronology2.equals((java.lang.Object) durationField72);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField72", (durationField3.compareTo(durationField72) == 0) == durationField3.equals(durationField72));
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
        org.joda.time.DateTimeField dateTimeField24 = islamicChronology2.dayOfYear();
        org.joda.time.DateTimeField dateTimeField25 = islamicChronology2.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone26 = islamicChronology2.getZone();
        int int28 = dateTimeZone26.getStandardOffset(24796800001L);
        long long32 = dateTimeZone26.convertLocalToUTC((long) 100, true, (long) (byte) 1);
        long long34 = dateTimeZone26.convertUTCToLocal((long) 9);
        long long36 = dateTimeZone26.convertUTCToLocal((-3599990L));
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology39 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone38);
        org.joda.time.DurationField durationField40 = islamicChronology39.weekyears();
        org.joda.time.DateTimeField dateTimeField41 = islamicChronology39.millisOfSecond();
        long long45 = islamicChronology39.add((long) (byte) -1, (long) 0, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime47 = new org.joda.time.LocalDateTime((long) 1);
        int int48 = localDateTime47.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime50 = localDateTime47.minusHours((int) (byte) -1);
        int int52 = localDateTime47.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime54 = localDateTime47.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod55 = null;
        org.joda.time.LocalDateTime localDateTime56 = localDateTime47.minus(readablePeriod55);
        int int57 = localDateTime56.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField59 = localDateTime56.getField(0);
        org.joda.time.LocalDateTime.Property property60 = localDateTime56.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime62 = localDateTime56.withMonthOfYear((int) (short) 10);
        boolean boolean63 = islamicChronology39.equals((java.lang.Object) localDateTime56);
        org.joda.time.DateTimeField dateTimeField64 = islamicChronology39.weekOfWeekyear();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType65 = islamicChronology39.getLeapYearPatternType();
        org.joda.time.chrono.IslamicChronology islamicChronology66 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone26, leapYearPatternType65);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField40", (durationField4.compareTo(durationField40) == 0) == durationField4.equals(durationField40));
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test580");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        int int2 = localDateTime1.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology7 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone6);
        org.joda.time.DateTime dateTime8 = localDateTime1.toDateTime(dateTimeZone6);
        long long9 = dateTime8.getMillis();
        long long10 = dateTime8.getMillis();
        org.joda.time.Instant instant11 = dateTime8.toInstant();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology14 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone13);
        org.joda.time.DurationField durationField15 = islamicChronology14.weekyears();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology18 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone17);
        boolean boolean20 = dateTimeZone17.equals((java.lang.Object) 10L);
        org.joda.time.Chronology chronology21 = islamicChronology14.withZone(dateTimeZone17);
        org.joda.time.DateTimeField dateTimeField22 = islamicChronology14.hourOfHalfday();
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime(0L);
        int int25 = localDateTime24.getYearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology28 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone27);
        org.joda.time.DateTimeField dateTimeField29 = islamicChronology28.weekyear();
        org.joda.time.ReadablePartial readablePartial30 = null;
        int[] intArray37 = new int[] { (short) 100, 10, 100, (short) -1, (byte) 10 };
        int[] intArray39 = dateTimeField29.addWrapPartial(readablePartial30, 100, intArray37, (int) (short) 0);
        int int41 = dateTimeField29.getMinimumValue((long) (short) 0);
        org.joda.time.LocalDateTime localDateTime43 = new org.joda.time.LocalDateTime((long) 1);
        int int44 = localDateTime43.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime46 = localDateTime43.withYear((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod47 = null;
        org.joda.time.LocalDateTime localDateTime49 = localDateTime46.withPeriodAdded(readablePeriod47, 10);
        org.joda.time.LocalDateTime localDateTime51 = localDateTime46.plusSeconds((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology54 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone53);
        org.joda.time.DateTimeField dateTimeField55 = islamicChronology54.weekyear();
        org.joda.time.ReadablePartial readablePartial56 = null;
        int[] intArray63 = new int[] { (short) 100, 10, 100, (short) -1, (byte) 10 };
        int[] intArray65 = dateTimeField55.addWrapPartial(readablePartial56, 100, intArray63, (int) (short) 0);
        int int66 = dateTimeField29.getMaximumValue((org.joda.time.ReadablePartial) localDateTime51, intArray65);
        int int67 = dateTimeField22.getMinimumValue((org.joda.time.ReadablePartial) localDateTime24, intArray65);
        boolean boolean68 = instant11.equals((java.lang.Object) intArray65);
        org.joda.time.DateTimeZone dateTimeZone69 = instant11.getZone();
        org.joda.time.LocalDateTime localDateTime71 = new org.joda.time.LocalDateTime((long) 1);
        int int72 = localDateTime71.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime74 = localDateTime71.withYear((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod75 = null;
        org.joda.time.LocalDateTime localDateTime77 = localDateTime74.withPeriodAdded(readablePeriod75, 10);
        org.joda.time.LocalDateTime localDateTime79 = localDateTime77.withDayOfYear(11);
        org.joda.time.LocalDateTime localDateTime81 = localDateTime79.withYear(10);
        org.joda.time.DateTime dateTime82 = localDateTime79.toDateTime();
        org.joda.time.LocalDateTime localDateTime84 = localDateTime79.withYear((int) (byte) 10);
        boolean boolean85 = instant11.equals((java.lang.Object) localDateTime79);
        java.lang.String str86 = localDateTime79.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and instant11", (dateTime8.compareTo(instant11) == 0) == dateTime8.equals(instant11));
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test581");
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
        java.lang.String str36 = property8.getAsText();
        org.joda.time.LocalDateTime localDateTime38 = property8.addToCopy(11);
        org.joda.time.DateTimeField dateTimeField39 = property8.getField();
        org.joda.time.LocalDateTime localDateTime40 = property8.getLocalDateTime();
        org.joda.time.LocalDateTime localDateTime41 = property8.withMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology44 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone43);
        org.joda.time.DurationField durationField45 = islamicChronology44.weekyears();
        org.joda.time.DurationField durationField46 = islamicChronology44.halfdays();
        org.joda.time.DateTimeField dateTimeField47 = islamicChronology44.year();
        java.util.Locale locale49 = java.util.Locale.TAIWAN;
        boolean boolean50 = locale49.hasExtensions();
        java.lang.String str51 = locale49.getVariant();
        java.lang.String str52 = dateTimeField47.getAsText((-3601921L), locale49);
        boolean boolean53 = localDateTime41.equals((java.lang.Object) (-3601921L));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField15 and durationField45", (durationField15.compareTo(durationField45) == 0) == durationField15.equals(durationField45));
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test582");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        int int2 = localDateTime1.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology7 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone6);
        org.joda.time.DateTime dateTime8 = localDateTime1.toDateTime(dateTimeZone6);
        long long9 = dateTime8.getMillis();
        org.joda.time.ReadableInstant readableInstant10 = null;
        boolean boolean11 = dateTime8.isAfter(readableInstant10);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology14 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone13);
        org.joda.time.DurationField durationField15 = islamicChronology14.weekyears();
        org.joda.time.DurationField durationField16 = islamicChronology14.halfdays();
        org.joda.time.DurationField durationField17 = islamicChronology14.weeks();
        org.joda.time.DateTimeField dateTimeField18 = islamicChronology14.yearOfEra();
        org.joda.time.DateTimeField dateTimeField19 = islamicChronology14.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField20 = islamicChronology14.dayOfYear();
        org.joda.time.DateTimeField dateTimeField21 = islamicChronology14.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime((long) 1);
        int int24 = localDateTime23.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime26 = localDateTime23.withYear((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        org.joda.time.LocalDateTime localDateTime29 = localDateTime26.withPeriodAdded(readablePeriod27, 10);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime29.withDayOfYear(11);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime31.withYear(10);
        int int34 = dateTimeField21.getMinimumValue((org.joda.time.ReadablePartial) localDateTime31);
        org.joda.time.LocalDateTime.Property property35 = localDateTime31.yearOfEra();
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime((long) 1);
        int int38 = localDateTime37.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime40 = localDateTime37.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology43 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone42);
        org.joda.time.DateTime dateTime44 = localDateTime37.toDateTime(dateTimeZone42);
        long long45 = dateTime44.getMillis();
        long long46 = dateTime44.getMillis();
        org.joda.time.Instant instant47 = dateTime44.toInstant();
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology50 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone49);
        org.joda.time.DurationField durationField51 = islamicChronology50.weekyears();
        org.joda.time.DurationField durationField52 = islamicChronology50.halfdays();
        org.joda.time.DateTimeField dateTimeField53 = islamicChronology50.yearOfEra();
        org.joda.time.DateTimeField dateTimeField54 = islamicChronology50.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField55 = islamicChronology50.weekyear();
        org.joda.time.DurationField durationField56 = islamicChronology50.days();
        org.joda.time.DateTimeField dateTimeField57 = islamicChronology50.millisOfSecond();
        org.joda.time.DateTimeFieldType dateTimeFieldType58 = dateTimeField57.getType();
        boolean boolean59 = dateTime44.isSupported(dateTimeFieldType58);
        int int60 = property35.compareTo((org.joda.time.ReadableInstant) dateTime44);
        boolean boolean61 = dateTime8.isAfter((org.joda.time.ReadableInstant) dateTime44);
        org.joda.time.LocalDateTime localDateTime63 = new org.joda.time.LocalDateTime((long) 1);
        int int64 = localDateTime63.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime66 = localDateTime63.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone68 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology69 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone68);
        org.joda.time.DateTime dateTime70 = localDateTime63.toDateTime(dateTimeZone68);
        long long71 = dateTime70.getMillis();
        org.joda.time.LocalDateTime localDateTime73 = new org.joda.time.LocalDateTime((long) 1);
        int int74 = localDateTime73.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime76 = localDateTime73.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone78 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology79 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone78);
        org.joda.time.DateTime dateTime80 = localDateTime73.toDateTime(dateTimeZone78);
        long long81 = dateTime80.getMillis();
        long long82 = dateTime80.getMillis();
        boolean boolean83 = dateTime70.isAfter((org.joda.time.ReadableInstant) dateTime80);
        org.joda.time.Chronology chronology84 = dateTime80.getChronology();
        org.joda.time.Chronology chronology85 = dateTime80.getChronology();
        boolean boolean86 = dateTime8.isAfter((org.joda.time.ReadableInstant) dateTime80);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime44 and instant47", (dateTime44.compareTo(instant47) == 0) == dateTime44.equals(instant47));
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test583");
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
        org.joda.time.DurationField durationField29 = islamicChronology2.hours();
        java.lang.Object obj30 = null;
        boolean boolean31 = islamicChronology2.equals(obj30);
        org.joda.time.DurationField durationField32 = islamicChronology2.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField32, durationField4, and durationField23", !(durationField32.compareTo(durationField4) == 0) || (Math.signum(durationField32.compareTo(durationField23)) == Math.signum(durationField4.compareTo(durationField23))));
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test584");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = islamicChronology2.years();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.yearOfCentury();
        org.joda.time.DurationField durationField6 = islamicChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology2.dayOfWeek();
        java.lang.String str8 = dateTimeField7.getName();
        long long11 = dateTimeField7.getDifferenceAsLong((-16385L), (long) 1036122487);
        java.util.Locale locale12 = java.util.Locale.KOREA;
        java.util.Set<java.lang.String> strSet13 = locale12.getUnicodeLocaleAttributes();
        boolean boolean14 = locale12.hasExtensions();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology17 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone16);
        org.joda.time.DurationField durationField18 = islamicChronology17.weekyears();
        org.joda.time.DurationField durationField19 = islamicChronology17.millis();
        org.joda.time.DurationField durationField20 = islamicChronology17.hours();
        org.joda.time.DurationField durationField21 = islamicChronology17.centuries();
        org.joda.time.DateTimeField dateTimeField22 = islamicChronology17.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField23 = islamicChronology17.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology26 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone25);
        org.joda.time.DurationField durationField27 = islamicChronology26.weekyears();
        org.joda.time.DurationField durationField28 = islamicChronology26.halfdays();
        org.joda.time.DateTimeField dateTimeField29 = islamicChronology26.yearOfEra();
        org.joda.time.DurationField durationField30 = islamicChronology26.halfdays();
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime((org.joda.time.Chronology) islamicChronology26);
        java.util.Locale locale34 = new java.util.Locale("\u5927\u97d3\u6c11\u56fd");
        java.lang.String str35 = dateTimeField23.getAsText((org.joda.time.ReadablePartial) localDateTime31, (int) (byte) 0, locale34);
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology38 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone37);
        org.joda.time.DurationField durationField39 = islamicChronology38.weekyears();
        org.joda.time.DurationField durationField40 = islamicChronology38.halfdays();
        org.joda.time.DateTimeField dateTimeField41 = islamicChronology38.yearOfEra();
        org.joda.time.DateTimeField dateTimeField42 = islamicChronology38.centuryOfEra();
        java.util.Locale.Builder builder43 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder45 = builder43.setVariant("");
        java.util.Locale locale46 = java.util.Locale.PRC;
        java.util.Locale locale47 = locale46.stripExtensions();
        java.lang.String str48 = locale46.getScript();
        java.util.Locale.Builder builder49 = builder43.setLocale(locale46);
        java.util.Locale.Builder builder52 = builder49.setExtension('x', "1969");
        java.util.Locale locale53 = builder49.build();
        java.util.Locale locale54 = java.util.Locale.KOREA;
        java.util.Locale locale55 = java.util.Locale.KOREA;
        java.lang.String str56 = locale54.getDisplayLanguage(locale55);
        java.lang.String str57 = locale53.getDisplayCountry(locale55);
        int int58 = dateTimeField42.getMaximumShortTextLength(locale53);
        java.lang.String str59 = locale53.getVariant();
        java.lang.String str60 = locale34.getDisplayVariant(locale53);
        java.lang.String str61 = locale12.getDisplayName(locale53);
        java.lang.String str62 = locale53.getVariant();
        int int63 = dateTimeField7.getMaximumShortTextLength(locale53);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField18", (durationField4.compareTo(durationField18) == 0) == durationField4.equals(durationField18));
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test585");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DurationField durationField4 = islamicChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.era();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology2.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology9 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone8);
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((long) 1);
        int int12 = localDateTime11.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.minusHours((int) (byte) -1);
        org.joda.time.DateTimeField[] dateTimeFieldArray15 = localDateTime14.getFields();
        boolean boolean16 = dateTimeZone8.isLocalDateTimeGap(localDateTime14);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone8);
        java.util.TimeZone timeZone18 = dateTimeZone8.toTimeZone();
        java.lang.String str19 = dateTimeZone8.toString();
        org.joda.time.Chronology chronology20 = islamicChronology2.withZone(dateTimeZone8);
        java.util.TimeZone timeZone21 = dateTimeZone8.toTimeZone();
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
        org.joda.time.DateTimeField dateTimeField45 = islamicChronology25.millisOfDay();
        org.joda.time.DurationField durationField46 = islamicChronology25.centuries();
        org.joda.time.DateTimeField dateTimeField47 = islamicChronology25.dayOfYear();
        org.joda.time.DateTimeField dateTimeField48 = islamicChronology25.millisOfDay();
        org.joda.time.DurationField durationField49 = islamicChronology25.minutes();
        org.joda.time.DateTimeField dateTimeField50 = islamicChronology25.yearOfCentury();
        org.joda.time.DurationField durationField51 = dateTimeField50.getDurationField();
        java.util.Locale.Builder builder53 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder55 = builder53.setVariant("");
        java.util.Locale locale56 = builder55.build();
        java.util.Locale locale58 = new java.util.Locale("");
        java.util.Locale.Builder builder59 = builder55.setLocale(locale58);
        java.util.Locale locale60 = builder55.build();
        java.util.Locale.Builder builder62 = builder55.setLanguage("UTC");
        java.util.Locale locale63 = builder55.build();
        java.util.Locale locale64 = java.util.Locale.KOREA;
        java.util.Locale locale65 = java.util.Locale.KOREA;
        java.lang.String str66 = locale64.getDisplayLanguage(locale65);
        java.lang.String str67 = locale65.getISO3Country();
        java.util.Set<java.lang.String> strSet68 = locale65.getUnicodeLocaleAttributes();
        java.util.Locale.Builder builder69 = builder55.setLocale(locale65);
        java.util.Locale locale70 = java.util.Locale.JAPAN;
        org.joda.time.LocalDateTime localDateTime72 = new org.joda.time.LocalDateTime((long) 1);
        int int73 = localDateTime72.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime75 = localDateTime72.minusHours((int) (byte) -1);
        int int77 = localDateTime72.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime79 = localDateTime72.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod80 = null;
        org.joda.time.LocalDateTime localDateTime81 = localDateTime72.minus(readablePeriod80);
        org.joda.time.LocalDateTime.Property property82 = localDateTime72.millisOfSecond();
        long long83 = property82.remainder();
        java.util.Locale locale84 = java.util.Locale.KOREA;
        java.util.Locale locale85 = java.util.Locale.KOREA;
        java.lang.String str86 = locale84.getDisplayLanguage(locale85);
        java.util.Locale.setDefault(locale84);
        int int88 = property82.getMaximumShortTextLength(locale84);
        java.lang.String str89 = locale70.getDisplayVariant(locale84);
        java.util.Locale locale90 = locale84.stripExtensions();
        java.lang.String str91 = locale65.getDisplayName(locale84);
        java.lang.String str92 = dateTimeField50.getAsText(58200110L, locale65);
        java.lang.String str93 = dateTimeZone8.getShortName(17791917540001L, locale65);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField27", (durationField3.compareTo(durationField27) == 0) == durationField3.equals(durationField27));
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test586");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        int int2 = localDateTime1.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.minusHours((int) (byte) -1);
        int int5 = localDateTime1.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.minusMinutes((int) '#');
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.centuryOfEra();
        org.joda.time.DurationField durationField9 = property8.getRangeDurationField();
        org.joda.time.LocalDateTime localDateTime10 = property8.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime12 = property8.addWrapFieldToCopy((-3600000));
        org.joda.time.DateTime dateTime13 = localDateTime12.toDateTime();
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((long) 1);
        int int16 = localDateTime15.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime15.minusHours((int) (byte) -1);
        int int20 = localDateTime15.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime15.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.LocalDateTime localDateTime24 = localDateTime15.minus(readablePeriod23);
        org.joda.time.LocalDateTime.Property property25 = localDateTime15.millisOfSecond();
        long long26 = property25.remainder();
        java.lang.String str27 = property25.getName();
        java.util.Locale locale28 = java.util.Locale.CHINA;
        java.lang.String str29 = property25.getAsText(locale28);
        org.joda.time.LocalDateTime localDateTime30 = property25.withMinimumValue();
        org.joda.time.LocalDateTime localDateTime32 = localDateTime30.plusYears(4);
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        org.joda.time.LocalDateTime localDateTime34 = localDateTime32.plus(readablePeriod33);
        org.joda.time.ReadablePeriod readablePeriod35 = null;
        org.joda.time.LocalDateTime localDateTime37 = localDateTime32.withPeriodAdded(readablePeriod35, 45);
        org.joda.time.LocalDateTime localDateTime39 = localDateTime37.withCenturyOfEra(101);
        org.joda.time.LocalDateTime localDateTime41 = new org.joda.time.LocalDateTime((long) 1);
        int int42 = localDateTime41.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime44 = localDateTime41.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology47 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone46);
        org.joda.time.DateTime dateTime48 = localDateTime41.toDateTime(dateTimeZone46);
        org.joda.time.LocalDateTime localDateTime50 = new org.joda.time.LocalDateTime((long) 1);
        int int51 = localDateTime50.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime53 = localDateTime50.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone55 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology56 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone55);
        org.joda.time.DateTime dateTime57 = localDateTime50.toDateTime(dateTimeZone55);
        long long58 = dateTime57.getMillis();
        boolean boolean59 = dateTime48.isAfter((org.joda.time.ReadableInstant) dateTime57);
        long long60 = dateTime57.getMillis();
        org.joda.time.Instant instant61 = dateTime57.toInstant();
        org.joda.time.DateTime dateTime62 = localDateTime39.toDateTime((org.joda.time.ReadableInstant) instant61);
        boolean boolean63 = dateTime13.isAfter((org.joda.time.ReadableInstant) instant61);
        org.joda.time.Chronology chronology64 = instant61.getChronology();
        org.joda.time.DateTimeField dateTimeField65 = chronology64.weekOfWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime48 and instant61", (dateTime48.compareTo(instant61) == 0) == dateTime48.equals(instant61));
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test587");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = islamicChronology2.years();
        org.joda.time.DateTimeZone dateTimeZone5 = islamicChronology2.getZone();
        org.joda.time.DateTimeZone dateTimeZone6 = islamicChronology2.getZone();
        org.joda.time.DurationField durationField7 = islamicChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology2.secondOfMinute();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField7", (durationField4.compareTo(durationField7) == 0) == durationField4.equals(durationField7));
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test588");
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
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology23 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone22);
        org.joda.time.DurationField durationField24 = islamicChronology23.weekyears();
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology27 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone26);
        boolean boolean29 = dateTimeZone26.equals((java.lang.Object) 10L);
        org.joda.time.Chronology chronology30 = islamicChronology23.withZone(dateTimeZone26);
        org.joda.time.DateTimeField dateTimeField31 = islamicChronology23.hourOfHalfday();
        org.joda.time.DurationField durationField32 = dateTimeField31.getRangeDurationField();
        boolean boolean33 = dateTime17.equals((java.lang.Object) durationField32);
        org.joda.time.Instant instant34 = dateTime17.toInstant();
        long long35 = instant34.getMillis();
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime((long) 1);
        int int38 = localDateTime37.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime40 = localDateTime37.minusHours((int) (byte) -1);
        int int42 = localDateTime37.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime44 = localDateTime37.withMillisOfSecond((int) (byte) 100);
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
        int int86 = localDateTime44.get(dateTimeFieldType83);
        int int87 = localDateTime44.size();
        org.joda.time.DateTime dateTime88 = localDateTime44.toDateTime();
        org.joda.time.Instant instant89 = dateTime88.toInstant();
        org.joda.time.Instant instant90 = instant89.toInstant();
        boolean boolean91 = instant34.isBefore((org.joda.time.ReadableInstant) instant90);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime88 and instant90", (dateTime88.compareTo(instant90) == 0) == dateTime88.equals(instant90));
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test589");
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
        org.joda.time.DurationField durationField11 = islamicChronology2.days();
        org.joda.time.DurationField durationField12 = islamicChronology2.weekyears();
        org.joda.time.DurationField durationField13 = islamicChronology2.years();
        org.joda.time.DateTimeField dateTimeField14 = islamicChronology2.centuryOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField13", (durationField3.compareTo(durationField13) == 0) == durationField3.equals(durationField13));
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test590");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleAttributes();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology4 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone3);
        org.joda.time.DurationField durationField5 = islamicChronology4.weekyears();
        org.joda.time.DurationField durationField6 = islamicChronology4.halfdays();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology4.yearOfEra();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology4.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology4.monthOfYear();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology4.secondOfDay();
        boolean boolean11 = strSet1.equals((java.lang.Object) islamicChronology4);
        org.joda.time.DurationField durationField12 = islamicChronology4.years();
        java.lang.String str13 = islamicChronology4.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField12", (durationField5.compareTo(durationField12) == 0) == durationField5.equals(durationField12));
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test591");
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
        org.joda.time.DurationField durationField30 = islamicChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField31 = islamicChronology2.hourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField30", (durationField4.compareTo(durationField30) == 0) == durationField4.equals(durationField30));
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test592");
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
        java.util.Locale locale14 = java.util.Locale.CHINA;
        java.lang.String str15 = property11.getAsText(locale14);
        org.joda.time.LocalDateTime localDateTime16 = property11.withMinimumValue();
        java.lang.String str17 = property11.getAsShortText();
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime((long) 1);
        int int20 = localDateTime19.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime22 = localDateTime19.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology25 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone24);
        org.joda.time.DateTime dateTime26 = localDateTime19.toDateTime(dateTimeZone24);
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime((long) 1);
        int int29 = localDateTime28.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime31 = localDateTime28.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology34 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone33);
        org.joda.time.DateTime dateTime35 = localDateTime28.toDateTime(dateTimeZone33);
        long long36 = dateTime35.getMillis();
        boolean boolean37 = dateTime26.isAfter((org.joda.time.ReadableInstant) dateTime35);
        long long38 = dateTime35.getMillis();
        org.joda.time.Instant instant39 = dateTime35.toInstant();
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology42 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone41);
        boolean boolean44 = dateTimeZone41.equals((java.lang.Object) 10L);
        java.util.Locale locale46 = java.util.Locale.JAPAN;
        java.lang.String str47 = locale46.getISO3Country();
        java.lang.String str48 = dateTimeZone41.getShortName(1970L, locale46);
        java.util.TimeZone timeZone49 = dateTimeZone41.toTimeZone();
        long long52 = dateTimeZone41.convertLocalToUTC(2626841168L, false);
        boolean boolean53 = instant39.equals((java.lang.Object) false);
        int int54 = property11.getDifference((org.joda.time.ReadableInstant) instant39);
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
        org.joda.time.DateTimeZone dateTimeZone75 = dateTime72.getZone();
        java.lang.String str76 = dateTime72.toString();
        boolean boolean77 = instant39.isBefore((org.joda.time.ReadableInstant) dateTime72);
        org.joda.time.DateTimeZone dateTimeZone78 = instant39.getZone();
        org.joda.time.Chronology chronology79 = instant39.getChronology();
        org.joda.time.DurationField durationField80 = chronology79.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime26 and instant39", (dateTime26.compareTo(instant39) == 0) == dateTime26.equals(instant39));
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test593");
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
        org.joda.time.DateTimeField dateTimeField29 = islamicChronology2.hourOfHalfday();
        org.joda.time.LocalDateTime localDateTime30 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime((long) 1);
        int int33 = localDateTime32.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime35 = localDateTime32.withYear((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod36 = null;
        org.joda.time.LocalDateTime localDateTime38 = localDateTime35.withPeriodAdded(readablePeriod36, 10);
        org.joda.time.LocalDateTime localDateTime40 = localDateTime38.withDayOfYear(11);
        int[] intArray41 = localDateTime40.getValues();
        org.joda.time.LocalDateTime localDateTime43 = localDateTime40.plusHours((int) (short) 0);
        int int44 = localDateTime30.compareTo((org.joda.time.ReadablePartial) localDateTime40);
        org.joda.time.LocalDateTime localDateTime46 = localDateTime30.minusYears((-16385303));
        int int47 = localDateTime46.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime49 = new org.joda.time.LocalDateTime((long) 1);
        int int50 = localDateTime49.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime52 = localDateTime49.minusHours((int) (byte) -1);
        int int53 = localDateTime49.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime55 = localDateTime49.minusMinutes((int) '#');
        org.joda.time.LocalDateTime.Property property56 = localDateTime55.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime57 = property56.roundCeilingCopy();
        java.lang.String str58 = property56.toString();
        int int59 = property56.getMinimumValue();
        org.joda.time.LocalDateTime localDateTime60 = property56.roundHalfCeilingCopy();
        org.joda.time.ReadablePeriod readablePeriod61 = null;
        org.joda.time.LocalDateTime localDateTime62 = localDateTime60.plus(readablePeriod61);
        org.joda.time.LocalDateTime localDateTime63 = localDateTime46.withFields((org.joda.time.ReadablePartial) localDateTime60);
        org.joda.time.LocalDateTime localDateTime65 = new org.joda.time.LocalDateTime((long) 1);
        int int66 = localDateTime65.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime68 = localDateTime65.minusHours((int) (byte) -1);
        int int70 = localDateTime65.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime72 = localDateTime65.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod73 = null;
        org.joda.time.LocalDateTime localDateTime74 = localDateTime65.minus(readablePeriod73);
        org.joda.time.DateTimeField[] dateTimeFieldArray75 = localDateTime74.getFields();
        org.joda.time.LocalDateTime localDateTime77 = new org.joda.time.LocalDateTime((long) 1);
        int int78 = localDateTime77.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime80 = localDateTime77.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone82 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology83 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone82);
        org.joda.time.DurationField durationField84 = islamicChronology83.weekyears();
        org.joda.time.DurationField durationField85 = islamicChronology83.halfdays();
        org.joda.time.DateTimeField dateTimeField86 = islamicChronology83.yearOfEra();
        org.joda.time.DurationField durationField87 = islamicChronology83.halfdays();
        org.joda.time.DurationFieldType durationFieldType88 = durationField87.getType();
        boolean boolean89 = localDateTime77.isSupported(durationFieldType88);
        boolean boolean90 = localDateTime74.isSupported(durationFieldType88);
        org.joda.time.LocalDateTime localDateTime92 = localDateTime46.withFieldAdded(durationFieldType88, 2022);
        org.joda.time.LocalDateTime.Property property93 = localDateTime92.weekOfWeekyear();
        int int94 = dateTimeField29.getMaximumValue((org.joda.time.ReadablePartial) localDateTime92);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField84", (durationField4.compareTo(durationField84) == 0) == durationField4.equals(durationField84));
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test594");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.minuteOfDay();
        org.joda.time.DurationField durationField2 = islamicChronology0.months();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((long) 1);
        int int6 = localDateTime5.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.minusHours((int) (byte) -1);
        int int9 = localDateTime5.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime5.withMinuteOfHour((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime5.plusHours((int) (byte) 100);
        int[] intArray15 = islamicChronology0.get((org.joda.time.ReadablePartial) localDateTime13, (long) 1969);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime13.withWeekyear((int) '4');
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.dayOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = property18.getFieldType();
        int int20 = property18.getMaximumValueOverall();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 0);
        java.util.TimeZone timeZone23 = dateTimeZone22.toTimeZone();
        boolean boolean25 = dateTimeZone22.isStandardOffset((long) 60);
        java.lang.String str27 = dateTimeZone22.getShortName((long) 3600001);
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime((long) 1);
        int int30 = localDateTime29.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime32 = localDateTime29.minusHours((int) (byte) -1);
        int int33 = localDateTime29.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime35 = localDateTime29.minusMinutes((int) '#');
        org.joda.time.LocalDateTime.Property property36 = localDateTime35.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime37 = property36.roundCeilingCopy();
        java.lang.String str38 = property36.toString();
        org.joda.time.LocalDateTime localDateTime40 = new org.joda.time.LocalDateTime((long) 1);
        int int41 = localDateTime40.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime43 = localDateTime40.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology46 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone45);
        org.joda.time.DateTime dateTime47 = localDateTime40.toDateTime(dateTimeZone45);
        org.joda.time.ReadableInstant readableInstant48 = null;
        boolean boolean49 = dateTime47.isAfter(readableInstant48);
        org.joda.time.Instant instant50 = dateTime47.toInstant();
        int int51 = property36.compareTo((org.joda.time.ReadableInstant) dateTime47);
        int int52 = dateTimeZone22.getOffset((org.joda.time.ReadableInstant) dateTime47);
        int int53 = property18.getDifference((org.joda.time.ReadableInstant) dateTime47);
        org.joda.time.LocalDateTime localDateTime54 = new org.joda.time.LocalDateTime();
        int int55 = localDateTime54.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property56 = localDateTime54.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime58 = new org.joda.time.LocalDateTime((long) 1);
        int int59 = localDateTime58.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime61 = localDateTime58.minusHours((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime63 = localDateTime61.withMinuteOfHour(19);
        int int64 = localDateTime63.size();
        org.joda.time.LocalDateTime.Property property65 = localDateTime63.hourOfDay();
        org.joda.time.LocalDateTime localDateTime67 = new org.joda.time.LocalDateTime((long) 1);
        int int68 = localDateTime67.getHourOfDay();
        org.joda.time.LocalDateTime.Property property69 = localDateTime67.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime71 = new org.joda.time.LocalDateTime((long) 1);
        int int72 = localDateTime71.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime74 = localDateTime71.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone76 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology77 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone76);
        org.joda.time.DateTime dateTime78 = localDateTime71.toDateTime(dateTimeZone76);
        long long79 = dateTime78.getMillis();
        org.joda.time.LocalDateTime localDateTime81 = new org.joda.time.LocalDateTime((long) 1);
        int int82 = localDateTime81.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime84 = localDateTime81.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone86 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology87 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone86);
        org.joda.time.DateTime dateTime88 = localDateTime81.toDateTime(dateTimeZone86);
        long long89 = dateTime88.getMillis();
        long long90 = dateTime88.getMillis();
        boolean boolean91 = dateTime78.isAfter((org.joda.time.ReadableInstant) dateTime88);
        org.joda.time.Chronology chronology92 = dateTime88.getChronology();
        int int93 = property69.compareTo((org.joda.time.ReadableInstant) dateTime88);
        int int94 = property65.getDifference((org.joda.time.ReadableInstant) dateTime88);
        org.joda.time.DateTime dateTime95 = localDateTime54.toDateTime((org.joda.time.ReadableInstant) dateTime88);
        boolean boolean96 = dateTime47.isAfter((org.joda.time.ReadableInstant) dateTime95);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant50 and dateTime78", (instant50.compareTo(dateTime78) == 0) == instant50.equals(dateTime78));
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test595");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        int int2 = localDateTime1.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.minusHours((int) (byte) -1);
        org.joda.time.DateTimeField[] dateTimeFieldArray5 = localDateTime4.getFields();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.minusDays(4);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.minus(readablePeriod8);
        int int10 = localDateTime9.getYearOfCentury();
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime((long) 1);
        int int13 = localDateTime12.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime12.minusHours((int) (byte) -1);
        int int16 = localDateTime12.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime12.minusMinutes((int) '#');
        org.joda.time.LocalDateTime localDateTime20 = localDateTime12.plusMonths((-1));
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime((long) 1);
        int int23 = localDateTime22.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime25 = localDateTime22.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology28 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone27);
        org.joda.time.DurationField durationField29 = islamicChronology28.weekyears();
        org.joda.time.DurationField durationField30 = islamicChronology28.halfdays();
        org.joda.time.DateTimeField dateTimeField31 = islamicChronology28.yearOfEra();
        org.joda.time.DurationField durationField32 = islamicChronology28.halfdays();
        org.joda.time.DurationFieldType durationFieldType33 = durationField32.getType();
        boolean boolean34 = localDateTime22.isSupported(durationFieldType33);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime12.withFieldAdded(durationFieldType33, 12);
        boolean boolean37 = localDateTime9.isSupported(durationFieldType33);
        org.joda.time.LocalDateTime localDateTime39 = new org.joda.time.LocalDateTime((long) 1);
        int int40 = localDateTime39.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime42 = localDateTime39.minusHours((int) (byte) -1);
        int int43 = localDateTime39.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime45 = localDateTime39.minusMinutes((int) '#');
        org.joda.time.LocalDateTime.Property property46 = localDateTime45.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime47 = property46.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime49 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.LocalDateTime localDateTime50 = localDateTime47.withFields((org.joda.time.ReadablePartial) localDateTime49);
        boolean boolean51 = localDateTime9.isAfter((org.joda.time.ReadablePartial) localDateTime49);
        java.util.Date date52 = localDateTime49.toDate();
        org.joda.time.ReadableDuration readableDuration53 = null;
        org.joda.time.LocalDateTime localDateTime55 = localDateTime49.withDurationAdded(readableDuration53, (-16385301));
        org.joda.time.LocalDateTime localDateTime57 = localDateTime49.minusSeconds(42);
        org.joda.time.LocalDateTime.Property property58 = localDateTime49.weekyear();
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
        org.joda.time.DurationField durationField82 = islamicChronology61.centuries();
        org.joda.time.DateTimeZone dateTimeZone83 = islamicChronology61.getZone();
        org.joda.time.DateTimeField dateTimeField84 = islamicChronology61.dayOfWeek();
        org.joda.time.DurationField durationField85 = islamicChronology61.minutes();
        org.joda.time.DateTimeField dateTimeField86 = islamicChronology61.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField87 = islamicChronology61.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField88 = islamicChronology61.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone90 = org.joda.time.DateTimeZone.forOffsetHours(12);
        org.joda.time.Chronology chronology91 = islamicChronology61.withZone(dateTimeZone90);
        org.joda.time.DateTimeField dateTimeField92 = islamicChronology61.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField93 = islamicChronology61.clockhourOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType94 = dateTimeField93.getType();
        org.joda.time.LocalDateTime.Property property95 = localDateTime49.property(dateTimeFieldType94);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField29 and durationField63", (durationField29.compareTo(durationField63) == 0) == durationField29.equals(durationField63));
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test596");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = islamicChronology2.years();
        org.joda.time.DurationField durationField5 = islamicChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology2.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology2.secondOfMinute();
        org.joda.time.DurationField durationField8 = islamicChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology2.year();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField8", (durationField4.compareTo(durationField8) == 0) == durationField4.equals(durationField8));
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test597");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone2);
        org.joda.time.DurationField durationField4 = islamicChronology3.weekyears();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology3.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone6 = islamicChronology3.getZone();
        java.lang.String str7 = dateTimeZone6.toString();
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) (-1), dateTimeZone6);
        java.util.TimeZone timeZone10 = java.util.TimeZone.getTimeZone("");
        java.util.TimeZone timeZone12 = java.util.TimeZone.getTimeZone("");
        boolean boolean13 = timeZone10.hasSameRules(timeZone12);
        timeZone12.setRawOffset(11);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        java.util.TimeZone timeZone17 = dateTimeZone16.toTimeZone();
        org.joda.time.chrono.IslamicChronology islamicChronology18 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone16);
        long long20 = dateTimeZone6.getMillisKeepLocal(dateTimeZone16, 115200999L);
        org.joda.time.LocalDateTime localDateTime21 = org.joda.time.LocalDateTime.now(dateTimeZone16);
        int int23 = dateTimeZone16.getOffset((long) 349200000);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology26 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone25);
        org.joda.time.DurationField durationField27 = islamicChronology26.weekyears();
        org.joda.time.DateTimeField dateTimeField28 = islamicChronology26.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone29 = islamicChronology26.getZone();
        org.joda.time.DateTimeField dateTimeField30 = islamicChronology26.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField31 = islamicChronology26.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField32 = islamicChronology26.year();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType33 = islamicChronology26.getLeapYearPatternType();
        org.joda.time.chrono.IslamicChronology islamicChronology34 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone16, leapYearPatternType33);
        org.joda.time.DateTimeField dateTimeField35 = islamicChronology34.yearOfEra();
        org.joda.time.DurationField durationField36 = islamicChronology34.centuries();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType37 = islamicChronology34.getLeapYearPatternType();
        org.joda.time.DurationField durationField38 = islamicChronology34.years();
        org.joda.time.DurationField durationField39 = islamicChronology34.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField38", (durationField4.compareTo(durationField38) == 0) == durationField4.equals(durationField38));
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test598");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = islamicChronology2.years();
        org.joda.time.DurationField durationField5 = islamicChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology2.hourOfHalfday();
        org.joda.time.DurationField durationField7 = islamicChronology2.hours();
        org.joda.time.DurationField durationField8 = islamicChronology2.hours();
        long long12 = islamicChronology2.add(3L, 0L, 82800001);
        org.joda.time.DateTimeZone dateTimeZone13 = islamicChronology2.getZone();
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(dateTimeZone13);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology17 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone16);
        org.joda.time.DurationField durationField18 = islamicChronology17.weekyears();
        org.joda.time.DurationField durationField19 = islamicChronology17.halfdays();
        org.joda.time.DateTimeField dateTimeField20 = islamicChronology17.yearOfEra();
        org.joda.time.DateTimeField dateTimeField21 = islamicChronology17.halfdayOfDay();
        org.joda.time.DurationField durationField22 = islamicChronology17.halfdays();
        org.joda.time.DateTimeZone dateTimeZone23 = islamicChronology17.getZone();
        java.lang.String str24 = islamicChronology17.toString();
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime((long) 1);
        int int27 = localDateTime26.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime29 = localDateTime26.minusHours((int) (byte) -1);
        int int30 = localDateTime26.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime32 = localDateTime26.minusMinutes((int) '#');
        org.joda.time.LocalDateTime.Property property33 = localDateTime32.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime34 = property33.roundCeilingCopy();
        int[] intArray36 = islamicChronology17.get((org.joda.time.ReadablePartial) localDateTime34, (long) 354);
        org.joda.time.DateTimeField dateTimeField37 = islamicChronology17.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField38 = islamicChronology17.secondOfMinute();
        org.joda.time.DurationField durationField39 = islamicChronology17.halfdays();
        org.joda.time.DateTimeZone dateTimeZone40 = islamicChronology17.getZone();
        org.joda.time.DateTime dateTime41 = localDateTime14.toDateTime(dateTimeZone40);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField18", (durationField4.compareTo(durationField18) == 0) == durationField4.equals(durationField18));
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test599");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DurationField durationField4 = islamicChronology2.months();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.minuteOfHour();
        org.joda.time.DurationField durationField6 = islamicChronology2.hours();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology2.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 0);
        org.joda.time.Chronology chronology10 = islamicChronology2.withZone(dateTimeZone9);
        java.lang.String str12 = dateTimeZone9.getShortName(100L);
        org.joda.time.chrono.IslamicChronology islamicChronology13 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone9);
        org.joda.time.DurationField durationField14 = islamicChronology13.weeks();
        org.joda.time.DateTimeField dateTimeField15 = islamicChronology13.yearOfEra();
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
        org.joda.time.DateTimeField dateTimeField39 = islamicChronology19.weekyearOfCentury();
        org.joda.time.LocalDateTime localDateTime41 = new org.joda.time.LocalDateTime((long) 1);
        int int42 = localDateTime41.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime44 = localDateTime41.withYear((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod45 = null;
        org.joda.time.LocalDateTime localDateTime47 = localDateTime44.withPeriodAdded(readablePeriod45, 10);
        org.joda.time.LocalDateTime localDateTime49 = localDateTime47.withDayOfYear(11);
        int[] intArray50 = localDateTime49.getValues();
        org.joda.time.LocalDateTime localDateTime52 = localDateTime49.plusYears((int) (short) -1);
        org.joda.time.LocalDateTime.Property property53 = localDateTime52.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone55 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology56 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone55);
        org.joda.time.DateTimeField dateTimeField57 = islamicChronology56.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField58 = islamicChronology56.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime61 = new org.joda.time.LocalDateTime((long) 1);
        int int62 = localDateTime61.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime64 = localDateTime61.minusHours((int) (byte) -1);
        int int66 = localDateTime61.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime68 = localDateTime61.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod69 = null;
        org.joda.time.LocalDateTime localDateTime70 = localDateTime61.minus(readablePeriod69);
        org.joda.time.LocalDateTime.Property property71 = localDateTime61.millisOfSecond();
        long long72 = property71.remainder();
        java.util.Locale locale73 = java.util.Locale.KOREA;
        java.util.Locale locale74 = java.util.Locale.KOREA;
        java.lang.String str75 = locale73.getDisplayLanguage(locale74);
        java.util.Locale.setDefault(locale73);
        int int77 = property71.getMaximumShortTextLength(locale73);
        java.lang.String str78 = dateTimeField58.getAsShortText((-4319999989L), locale73);
        java.lang.String str79 = dateTimeField39.getAsShortText((org.joda.time.ReadablePartial) localDateTime52, locale73);
        java.util.Locale.setDefault(locale73);
        java.lang.String str81 = locale73.toLanguageTag();
        java.lang.String str82 = dateTimeField15.getAsText((-7199899L), locale73);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField21", (durationField3.compareTo(durationField21) == 0) == durationField3.equals(durationField21));
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test600");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DurationField durationField4 = islamicChronology2.millis();
        org.joda.time.DurationField durationField5 = islamicChronology2.hours();
        org.joda.time.DurationField durationField6 = islamicChronology2.centuries();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology2.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology2.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology2.centuryOfEra();
        boolean boolean10 = dateTimeField9.isLenient();
        org.joda.time.ReadablePartial readablePartial11 = null;
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
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime((long) 1);
        int int36 = localDateTime35.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime38 = localDateTime35.withYear((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod39 = null;
        org.joda.time.LocalDateTime localDateTime41 = localDateTime38.withPeriodAdded(readablePeriod39, 10);
        boolean boolean42 = localDateTime27.equals((java.lang.Object) 10);
        org.joda.time.LocalDateTime localDateTime44 = localDateTime27.plusHours(1978);
        org.joda.time.LocalDateTime localDateTime46 = localDateTime27.minusDays((int) 'u');
        int[] intArray47 = localDateTime46.getValues();
        int int48 = dateTimeField9.getMinimumValue(readablePartial11, intArray47);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField16", (durationField3.compareTo(durationField16) == 0) == durationField3.equals(durationField16));
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test601");
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
        org.joda.time.DateTimeField dateTimeField17 = islamicChronology14.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology20 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone19);
        org.joda.time.DurationField durationField21 = islamicChronology20.weekyears();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology24 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone23);
        boolean boolean26 = dateTimeZone23.equals((java.lang.Object) 10L);
        org.joda.time.Chronology chronology27 = islamicChronology20.withZone(dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField28 = islamicChronology20.hourOfHalfday();
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime((long) 1);
        int int31 = localDateTime30.getHourOfDay();
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology34 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone33);
        org.joda.time.DateTimeField dateTimeField35 = islamicChronology34.weekyear();
        org.joda.time.ReadablePartial readablePartial36 = null;
        int[] intArray43 = new int[] { (short) 100, 10, 100, (short) -1, (byte) 10 };
        int[] intArray45 = dateTimeField35.addWrapPartial(readablePartial36, 100, intArray43, (int) (short) 0);
        int int46 = dateTimeField28.getMaximumValue((org.joda.time.ReadablePartial) localDateTime30, intArray43);
        org.joda.time.LocalDateTime localDateTime48 = new org.joda.time.LocalDateTime((long) 1);
        int int49 = localDateTime48.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime51 = localDateTime48.minusHours((int) (byte) -1);
        int int53 = localDateTime48.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime55 = localDateTime48.withMillisOfSecond((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime56 = localDateTime30.withFields((org.joda.time.ReadablePartial) localDateTime55);
        int int57 = dateTimeField17.getMinimumValue((org.joda.time.ReadablePartial) localDateTime56);
        org.joda.time.LocalDateTime localDateTime59 = new org.joda.time.LocalDateTime((long) 1);
        int int60 = localDateTime59.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime62 = localDateTime59.minusHours((int) (byte) -1);
        org.joda.time.DateTimeField[] dateTimeFieldArray63 = localDateTime62.getFields();
        java.util.Locale locale64 = java.util.Locale.GERMAN;
        java.util.Locale locale65 = java.util.Locale.JAPAN;
        java.lang.String str66 = locale65.getISO3Country();
        java.lang.String str67 = locale64.getDisplayCountry(locale65);
        java.lang.String str68 = dateTimeField17.getAsShortText((org.joda.time.ReadablePartial) localDateTime62, locale64);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter69 = null;
        java.lang.String str70 = localDateTime62.toString(dateTimeFormatter69);
        org.joda.time.LocalDateTime localDateTime72 = localDateTime62.minusDays((int) 'a');
        org.joda.time.LocalDateTime localDateTime74 = localDateTime72.plusMonths(411199);
        org.joda.time.DateTimeZone dateTimeZone76 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology77 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone76);
        org.joda.time.DurationField durationField78 = islamicChronology77.weekyears();
        org.joda.time.DateTimeField dateTimeField79 = islamicChronology77.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone80 = islamicChronology77.getZone();
        int int82 = dateTimeZone80.getOffsetFromLocal(19800L);
        java.lang.String str83 = dateTimeZone80.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone80);
        long long88 = dateTimeZone80.convertLocalToUTC((long) 99, true, 30170880043200010L);
        org.joda.time.DateTime dateTime89 = localDateTime74.toDateTime(dateTimeZone80);
        int int90 = dateTimeZone8.getOffset((org.joda.time.ReadableInstant) dateTime89);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField15", (durationField4.compareTo(durationField15) == 0) == durationField4.equals(durationField15));
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test602");
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
        org.joda.time.DateTimeField dateTimeField39 = islamicChronology2.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField40 = islamicChronology2.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology43 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone42);
        org.joda.time.DateTimeField dateTimeField44 = islamicChronology43.weekyear();
        org.joda.time.DurationField durationField45 = islamicChronology43.weekyears();
        org.joda.time.DateTimeZone dateTimeZone46 = islamicChronology43.getZone();
        org.joda.time.chrono.IslamicChronology islamicChronology47 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone46);
        org.joda.time.DateTimeZone dateTimeZone48 = islamicChronology47.getZone();
        long long51 = dateTimeZone48.adjustOffset((long) (byte) 10, true);
        java.lang.String str53 = dateTimeZone48.getNameKey((long) 292278993);
        org.joda.time.LocalDateTime localDateTime55 = new org.joda.time.LocalDateTime((long) (byte) -1);
        org.joda.time.LocalDateTime localDateTime57 = localDateTime55.minusDays(12);
        org.joda.time.DateTimeZone dateTimeZone59 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology60 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone59);
        org.joda.time.DurationField durationField61 = islamicChronology60.weekyears();
        org.joda.time.DurationField durationField62 = islamicChronology60.halfdays();
        org.joda.time.DateTimeField dateTimeField63 = islamicChronology60.yearOfEra();
        org.joda.time.DurationField durationField64 = islamicChronology60.halfdays();
        org.joda.time.DurationFieldType durationFieldType65 = durationField64.getType();
        org.joda.time.LocalDateTime localDateTime67 = localDateTime55.withFieldAdded(durationFieldType65, (int) '#');
        boolean boolean68 = dateTimeZone48.isLocalDateTimeGap(localDateTime67);
        org.joda.time.Chronology chronology69 = islamicChronology2.withZone(dateTimeZone48);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField18 and durationField45", (durationField18.compareTo(durationField45) == 0) == durationField18.equals(durationField45));
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test603");
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(100, (int) (short) 10, (int) (short) 10, (int) (byte) 0, 0, (int) ' ');
        int int7 = localDateTime6.getMinuteOfHour();
        org.joda.time.LocalDateTime.Property property8 = localDateTime6.hourOfDay();
        org.joda.time.LocalDateTime localDateTime10 = property8.addToCopy((int) (byte) 100);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.dayOfMonth();
        java.lang.String str12 = property11.getAsText();
        org.joda.time.DurationField durationField13 = property11.getLeapDurationField();
        boolean boolean14 = property11.isLeap();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology17 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone16);
        org.joda.time.DurationField durationField18 = islamicChronology17.weekyears();
        org.joda.time.DurationField durationField19 = islamicChronology17.halfdays();
        org.joda.time.DateTimeField dateTimeField20 = islamicChronology17.yearOfEra();
        org.joda.time.DateTimeField dateTimeField21 = islamicChronology17.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField22 = islamicChronology17.monthOfYear();
        org.joda.time.DurationField durationField23 = islamicChronology17.weekyears();
        org.joda.time.DateTimeField dateTimeField24 = islamicChronology17.yearOfCentury();
        java.util.Locale.Builder builder25 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder27 = builder25.setVariant("");
        java.util.Locale locale28 = java.util.Locale.PRC;
        java.util.Locale locale29 = locale28.stripExtensions();
        java.lang.String str30 = locale28.getScript();
        java.util.Locale.Builder builder31 = builder25.setLocale(locale28);
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology34 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone33);
        org.joda.time.DurationField durationField35 = islamicChronology34.weekyears();
        org.joda.time.DateTimeField dateTimeField36 = islamicChronology34.yearOfEra();
        long long38 = dateTimeField36.roundCeiling(0L);
        org.joda.time.LocalDateTime localDateTime40 = new org.joda.time.LocalDateTime((long) 1);
        int int41 = localDateTime40.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime43 = localDateTime40.minusHours((int) (byte) -1);
        int int44 = localDateTime40.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime46 = localDateTime40.withMinuteOfHour((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime48 = localDateTime40.plusHours((int) (byte) 100);
        org.joda.time.ReadableDuration readableDuration49 = null;
        org.joda.time.LocalDateTime localDateTime50 = localDateTime40.minus(readableDuration49);
        java.util.Locale locale51 = java.util.Locale.PRC;
        java.util.Locale locale52 = locale51.stripExtensions();
        java.lang.String str53 = dateTimeField36.getAsShortText((org.joda.time.ReadablePartial) localDateTime50, locale51);
        java.lang.String str54 = locale28.getDisplayCountry(locale51);
        int int55 = dateTimeField24.getMaximumShortTextLength(locale28);
        java.lang.String str56 = property11.getAsText(locale28);
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
        org.joda.time.DateTimeField dateTimeField81 = islamicChronology59.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone82 = islamicChronology59.getZone();
        java.util.TimeZone timeZone83 = dateTimeZone82.toTimeZone();
        java.time.ZoneId zoneId84 = timeZone83.toZoneId();
        java.util.TimeZone timeZone85 = java.util.TimeZone.getTimeZone(zoneId84);
        boolean boolean86 = locale28.equals((java.lang.Object) zoneId84);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField18 and durationField61", (durationField18.compareTo(durationField61) == 0) == durationField18.equals(durationField61));
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test604");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        int int2 = localDateTime1.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.minusHours((int) (byte) -1);
        int int6 = localDateTime1.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.LocalDateTime localDateTime10 = localDateTime1.minus(readablePeriod9);
        org.joda.time.LocalDateTime.Property property11 = localDateTime1.millisOfSecond();
        long long12 = property11.remainder();
        java.util.Locale locale13 = java.util.Locale.KOREA;
        java.util.Locale locale14 = java.util.Locale.KOREA;
        java.lang.String str15 = locale13.getDisplayLanguage(locale14);
        java.util.Locale.setDefault(locale13);
        int int17 = property11.getMaximumShortTextLength(locale13);
        org.joda.time.LocalDateTime localDateTime19 = property11.addToCopy(100L);
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.LocalDateTime localDateTime22 = localDateTime19.withDurationAdded(readableDuration20, 3601970);
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
        org.joda.time.DateTimeField dateTimeField45 = islamicChronology25.millisOfDay();
        org.joda.time.DurationField durationField46 = islamicChronology25.centuries();
        org.joda.time.DateTimeField dateTimeField47 = islamicChronology25.dayOfYear();
        org.joda.time.DateTimeField dateTimeField48 = islamicChronology25.clockhourOfDay();
        org.joda.time.DurationField durationField49 = islamicChronology25.centuries();
        org.joda.time.DateTimeField dateTimeField50 = islamicChronology25.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone51 = islamicChronology25.getZone();
        org.joda.time.DateTime dateTime52 = localDateTime22.toDateTime(dateTimeZone51);
        org.joda.time.Chronology chronology53 = localDateTime22.getChronology();
        org.joda.time.LocalDateTime.Property property54 = localDateTime22.centuryOfEra();
        int[] intArray55 = localDateTime22.getValues();
        org.joda.time.DateTimeZone dateTimeZone57 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology58 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone57);
        org.joda.time.DateTimeField dateTimeField59 = islamicChronology58.weekyear();
        org.joda.time.DurationField durationField60 = islamicChronology58.weekyears();
        org.joda.time.DateTimeZone dateTimeZone61 = islamicChronology58.getZone();
        org.joda.time.chrono.IslamicChronology islamicChronology62 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone61);
        org.joda.time.LocalDateTime localDateTime63 = org.joda.time.LocalDateTime.now(dateTimeZone61);
        org.joda.time.LocalDateTime localDateTime64 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime22, dateTimeZone61);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField27 and durationField60", (durationField27.compareTo(durationField60) == 0) == durationField27.equals(durationField60));
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test605");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology2.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.dayOfWeek();
        org.joda.time.DurationField durationField6 = islamicChronology2.years();
        org.joda.time.DurationField durationField7 = islamicChronology2.eras();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology2.era();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField6 and durationField7", Math.signum(durationField6.compareTo(durationField7)) == -Math.signum(durationField7.compareTo(durationField6)));
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test606");
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
        java.util.Locale locale14 = java.util.Locale.CHINA;
        java.lang.String str15 = property11.getAsText(locale14);
        org.joda.time.LocalDateTime localDateTime16 = property11.withMinimumValue();
        java.lang.String str17 = property11.getAsShortText();
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime((long) 1);
        int int20 = localDateTime19.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime22 = localDateTime19.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology25 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone24);
        org.joda.time.DateTime dateTime26 = localDateTime19.toDateTime(dateTimeZone24);
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime((long) 1);
        int int29 = localDateTime28.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime31 = localDateTime28.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology34 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone33);
        org.joda.time.DateTime dateTime35 = localDateTime28.toDateTime(dateTimeZone33);
        long long36 = dateTime35.getMillis();
        boolean boolean37 = dateTime26.isAfter((org.joda.time.ReadableInstant) dateTime35);
        long long38 = dateTime35.getMillis();
        org.joda.time.Instant instant39 = dateTime35.toInstant();
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology42 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone41);
        boolean boolean44 = dateTimeZone41.equals((java.lang.Object) 10L);
        java.util.Locale locale46 = java.util.Locale.JAPAN;
        java.lang.String str47 = locale46.getISO3Country();
        java.lang.String str48 = dateTimeZone41.getShortName(1970L, locale46);
        java.util.TimeZone timeZone49 = dateTimeZone41.toTimeZone();
        long long52 = dateTimeZone41.convertLocalToUTC(2626841168L, false);
        boolean boolean53 = instant39.equals((java.lang.Object) false);
        int int54 = property11.getDifference((org.joda.time.ReadableInstant) instant39);
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
        org.joda.time.DateTimeZone dateTimeZone75 = dateTime72.getZone();
        java.lang.String str76 = dateTime72.toString();
        boolean boolean77 = instant39.isBefore((org.joda.time.ReadableInstant) dateTime72);
        org.joda.time.DateTimeZone dateTimeZone78 = instant39.getZone();
        org.joda.time.chrono.IslamicChronology islamicChronology79 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone78);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime26 and instant39", (dateTime26.compareTo(instant39) == 0) == dateTime26.equals(instant39));
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test607");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology6 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone5);
        org.joda.time.DurationField durationField7 = islamicChronology6.weekyears();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology6.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone9 = islamicChronology6.getZone();
        long long11 = dateTimeZone9.previousTransition((-262800000L));
        java.lang.String str13 = dateTimeZone9.getShortName((long) ' ');
        org.joda.time.Chronology chronology14 = islamicChronology0.withZone(dateTimeZone9);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology17 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone16);
        org.joda.time.DateTimeField dateTimeField18 = islamicChronology17.yearOfCentury();
        org.joda.time.DurationField durationField19 = islamicChronology17.years();
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
        int[] intArray36 = islamicChronology17.get((org.joda.time.ReadablePartial) localDateTime30, (long) 0);
        org.joda.time.DateTimeField dateTimeField37 = islamicChronology17.millisOfDay();
        org.joda.time.DurationField durationField38 = islamicChronology17.centuries();
        org.joda.time.DateTimeField dateTimeField39 = islamicChronology17.dayOfYear();
        org.joda.time.DateTimeField dateTimeField40 = islamicChronology17.clockhourOfDay();
        org.joda.time.DurationField durationField41 = islamicChronology17.centuries();
        org.joda.time.DateTimeField dateTimeField42 = islamicChronology17.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone43 = islamicChronology17.getZone();
        java.lang.String str44 = dateTimeZone43.getID();
        org.joda.time.Chronology chronology45 = chronology14.withZone(dateTimeZone43);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField7 and durationField19", (durationField7.compareTo(durationField19) == 0) == durationField7.equals(durationField19));
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test608");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology2.weekyear();
        org.joda.time.DurationField durationField4 = islamicChronology2.weekyears();
        org.joda.time.DateTimeZone dateTimeZone5 = islamicChronology2.getZone();
        org.joda.time.chrono.IslamicChronology islamicChronology6 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = islamicChronology6.getZone();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology10 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone9);
        org.joda.time.DurationField durationField11 = islamicChronology10.millis();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(45, 24);
        org.joda.time.Chronology chronology15 = islamicChronology10.withZone(dateTimeZone14);
        long long17 = dateTimeZone7.getMillisKeepLocal(dateTimeZone14, 17604950400283L);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology20 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone19);
        org.joda.time.DurationField durationField21 = islamicChronology20.weekyears();
        org.joda.time.DateTimeField dateTimeField22 = islamicChronology20.millisOfSecond();
        long long26 = islamicChronology20.add((long) (byte) -1, (long) 0, (int) (byte) 10);
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
        org.joda.time.LocalDateTime localDateTime43 = localDateTime37.withMonthOfYear((int) (short) 10);
        boolean boolean44 = islamicChronology20.equals((java.lang.Object) localDateTime37);
        org.joda.time.DateTimeField dateTimeField45 = islamicChronology20.weekOfWeekyear();
        org.joda.time.DurationField durationField46 = islamicChronology20.minutes();
        int int47 = islamicChronology20.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField48 = islamicChronology20.hours();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType49 = islamicChronology20.getLeapYearPatternType();
        org.joda.time.chrono.IslamicChronology islamicChronology50 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone14, leapYearPatternType49);
        org.joda.time.DateTimeZone dateTimeZone51 = islamicChronology50.getZone();
        org.joda.time.DurationField durationField52 = islamicChronology50.hours();
        org.joda.time.DateTimeField dateTimeField53 = islamicChronology50.monthOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField48 and durationField52", (durationField48.compareTo(durationField52) == 0) == durationField48.equals(durationField52));
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test609");
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
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime((long) 1);
        int int26 = localDateTime25.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime28 = localDateTime25.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology31 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone30);
        org.joda.time.DateTime dateTime32 = localDateTime25.toDateTime(dateTimeZone30);
        java.lang.String str33 = dateTimeZone30.getID();
        java.util.TimeZone timeZone34 = dateTimeZone30.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology37 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone36);
        org.joda.time.DurationField durationField38 = islamicChronology37.weekyears();
        org.joda.time.DateTimeField dateTimeField39 = islamicChronology37.halfdayOfDay();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType40 = islamicChronology37.getLeapYearPatternType();
        org.joda.time.chrono.IslamicChronology islamicChronology41 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone30, leapYearPatternType40);
        org.joda.time.DateTimeField dateTimeField42 = islamicChronology41.era();
        org.joda.time.DurationField durationField43 = islamicChronology41.years();
        int int44 = durationField23.compareTo(durationField43);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField43 and durationField38", (durationField43.compareTo(durationField38) == 0) == durationField43.equals(durationField38));
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test610");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.minuteOfDay();
        org.joda.time.DurationField durationField2 = islamicChronology0.months();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((long) 1);
        int int6 = localDateTime5.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.minusHours((int) (byte) -1);
        int int9 = localDateTime5.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime5.withMinuteOfHour((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime5.plusHours((int) (byte) 100);
        int[] intArray15 = islamicChronology0.get((org.joda.time.ReadablePartial) localDateTime13, (long) 1969);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime13.withWeekyear((int) '4');
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.dayOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = property18.getFieldType();
        int int20 = property18.getMaximumValueOverall();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 0);
        java.util.TimeZone timeZone23 = dateTimeZone22.toTimeZone();
        boolean boolean25 = dateTimeZone22.isStandardOffset((long) 60);
        java.lang.String str27 = dateTimeZone22.getShortName((long) 3600001);
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime((long) 1);
        int int30 = localDateTime29.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime32 = localDateTime29.minusHours((int) (byte) -1);
        int int33 = localDateTime29.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime35 = localDateTime29.minusMinutes((int) '#');
        org.joda.time.LocalDateTime.Property property36 = localDateTime35.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime37 = property36.roundCeilingCopy();
        java.lang.String str38 = property36.toString();
        org.joda.time.LocalDateTime localDateTime40 = new org.joda.time.LocalDateTime((long) 1);
        int int41 = localDateTime40.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime43 = localDateTime40.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology46 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone45);
        org.joda.time.DateTime dateTime47 = localDateTime40.toDateTime(dateTimeZone45);
        org.joda.time.ReadableInstant readableInstant48 = null;
        boolean boolean49 = dateTime47.isAfter(readableInstant48);
        org.joda.time.Instant instant50 = dateTime47.toInstant();
        int int51 = property36.compareTo((org.joda.time.ReadableInstant) dateTime47);
        int int52 = dateTimeZone22.getOffset((org.joda.time.ReadableInstant) dateTime47);
        int int53 = property18.getDifference((org.joda.time.ReadableInstant) dateTime47);
        int int54 = property18.get();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime47 and instant50", (dateTime47.compareTo(instant50) == 0) == dateTime47.equals(instant50));
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
        org.joda.time.DateTimeField dateTimeField22 = islamicChronology2.millisOfDay();
        org.joda.time.DurationField durationField23 = islamicChronology2.centuries();
        org.joda.time.DateTimeZone dateTimeZone24 = islamicChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField25 = islamicChronology2.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime();
        int[] intArray28 = islamicChronology2.get((org.joda.time.ReadablePartial) localDateTime26, 10L);
        org.joda.time.DateTimeField dateTimeField29 = islamicChronology2.secondOfDay();
        org.joda.time.DurationField durationField30 = islamicChronology2.weekyears();
        org.joda.time.DurationField durationField31 = islamicChronology2.weeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField30", (durationField4.compareTo(durationField30) == 0) == durationField4.equals(durationField30));
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test612");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DurationField durationField4 = islamicChronology2.months();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.minuteOfHour();
        org.joda.time.DurationField durationField6 = islamicChronology2.hours();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology2.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 0);
        org.joda.time.Chronology chronology10 = islamicChronology2.withZone(dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology2.yearOfEra();
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology2.halfdayOfDay();
        org.joda.time.DurationField durationField13 = islamicChronology2.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField13, durationField3, and durationField4", !(durationField13.compareTo(durationField3) == 0) || (Math.signum(durationField13.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test613");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        int int2 = localDateTime1.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.minusHours((int) (byte) -1);
        org.joda.time.DateTimeField[] dateTimeFieldArray5 = localDateTime4.getFields();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.minusDays(4);
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
        org.joda.time.LocalDateTime.Property property23 = localDateTime18.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime28 = localDateTime18.withTime((int) (byte) 1, 0, 5, (int) (byte) 100);
        boolean boolean29 = localDateTime4.isBefore((org.joda.time.ReadablePartial) localDateTime28);
        org.joda.time.LocalDateTime.Property property30 = localDateTime28.weekyear();
        org.joda.time.LocalDateTime localDateTime32 = localDateTime28.withDayOfWeek(5);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime28.minusMillis(0);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime28.plusMinutes(24);
        org.joda.time.LocalDateTime localDateTime38 = localDateTime28.withMillisOfDay(1969);
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
        org.joda.time.Instant instant60 = dateTime56.toInstant();
        org.joda.time.DateTimeZone dateTimeZone62 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology63 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone62);
        boolean boolean65 = dateTimeZone62.equals((java.lang.Object) 10L);
        java.util.Locale locale67 = java.util.Locale.JAPAN;
        java.lang.String str68 = locale67.getISO3Country();
        java.lang.String str69 = dateTimeZone62.getShortName(1970L, locale67);
        java.util.TimeZone timeZone70 = dateTimeZone62.toTimeZone();
        long long73 = dateTimeZone62.convertLocalToUTC(2626841168L, false);
        boolean boolean74 = instant60.equals((java.lang.Object) false);
        org.joda.time.Instant instant75 = instant60.toInstant();
        org.joda.time.DateTime dateTime76 = localDateTime28.toDateTime((org.joda.time.ReadableInstant) instant60);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime47 and instant60", (dateTime47.compareTo(instant60) == 0) == dateTime47.equals(instant60));
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test614");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DurationField durationField4 = islamicChronology2.months();
        org.joda.time.DurationField durationField5 = islamicChronology2.centuries();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology2.millisOfDay();
        org.joda.time.DurationField durationField7 = islamicChronology2.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField7, durationField3, and durationField4", !(durationField7.compareTo(durationField3) == 0) || (Math.signum(durationField7.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test615");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        int int2 = localDateTime1.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.minusHours((int) (byte) -1);
        int int5 = localDateTime1.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.withMinuteOfHour((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withYear(19);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDateTime localDateTime12 = localDateTime9.withPeriodAdded(readablePeriod10, 10);
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((long) 1);
        int int15 = localDateTime14.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime17 = localDateTime14.withYear((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        org.joda.time.LocalDateTime localDateTime20 = localDateTime17.withPeriodAdded(readablePeriod18, 10);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime20.withDayOfYear(11);
        org.joda.time.Chronology chronology23 = localDateTime22.getChronology();
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = localDateTime22.getFieldType((int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime9.withField(dateTimeFieldType25, (int) ' ');
        org.joda.time.LocalDateTime localDateTime29 = localDateTime9.withSecondOfMinute((int) '#');
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime((long) 1);
        int int32 = localDateTime31.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime34 = localDateTime31.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology37 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone36);
        org.joda.time.DateTime dateTime38 = localDateTime31.toDateTime(dateTimeZone36);
        org.joda.time.LocalDateTime localDateTime40 = new org.joda.time.LocalDateTime((long) 1);
        int int41 = localDateTime40.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime43 = localDateTime40.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology46 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone45);
        org.joda.time.DateTime dateTime47 = localDateTime40.toDateTime(dateTimeZone45);
        long long48 = dateTime47.getMillis();
        boolean boolean49 = dateTime38.isAfter((org.joda.time.ReadableInstant) dateTime47);
        long long50 = dateTime47.getMillis();
        org.joda.time.Instant instant51 = dateTime47.toInstant();
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology54 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone53);
        boolean boolean56 = dateTimeZone53.equals((java.lang.Object) 10L);
        java.util.Locale locale58 = java.util.Locale.JAPAN;
        java.lang.String str59 = locale58.getISO3Country();
        java.lang.String str60 = dateTimeZone53.getShortName(1970L, locale58);
        java.util.TimeZone timeZone61 = dateTimeZone53.toTimeZone();
        long long64 = dateTimeZone53.convertLocalToUTC(2626841168L, false);
        boolean boolean65 = instant51.equals((java.lang.Object) false);
        org.joda.time.DateTime dateTime66 = localDateTime9.toDateTime((org.joda.time.ReadableInstant) instant51);
        org.joda.time.LocalDateTime localDateTime68 = new org.joda.time.LocalDateTime((long) 1);
        int int69 = localDateTime68.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime71 = localDateTime68.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone73 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology74 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone73);
        org.joda.time.DateTime dateTime75 = localDateTime68.toDateTime(dateTimeZone73);
        org.joda.time.LocalDateTime localDateTime77 = new org.joda.time.LocalDateTime((long) 1);
        int int78 = localDateTime77.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime80 = localDateTime77.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone82 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology83 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone82);
        org.joda.time.DateTime dateTime84 = localDateTime77.toDateTime(dateTimeZone82);
        long long85 = dateTime84.getMillis();
        boolean boolean86 = dateTime75.isAfter((org.joda.time.ReadableInstant) dateTime84);
        org.joda.time.DateTimeZone dateTimeZone87 = dateTime84.getZone();
        org.joda.time.LocalDateTime localDateTime88 = new org.joda.time.LocalDateTime(dateTimeZone87);
        boolean boolean90 = dateTimeZone87.isStandardOffset(3582218193696L);
        boolean boolean91 = dateTime66.equals((java.lang.Object) 3582218193696L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime38 and instant51", (dateTime38.compareTo(instant51) == 0) == dateTime38.equals(instant51));
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test616");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology2.weekyear();
        org.joda.time.DurationField durationField4 = islamicChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.weekyearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology8 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone7);
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology8.yearOfCentury();
        org.joda.time.DurationField durationField10 = islamicChronology8.years();
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime((long) 1);
        int int13 = localDateTime12.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime12.minusHours((int) (byte) -1);
        int int17 = localDateTime12.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime12.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        org.joda.time.LocalDateTime localDateTime21 = localDateTime12.minus(readablePeriod20);
        int int22 = localDateTime21.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField24 = localDateTime21.getField(0);
        org.joda.time.LocalDateTime.Property property25 = localDateTime21.centuryOfEra();
        int[] intArray27 = islamicChronology8.get((org.joda.time.ReadablePartial) localDateTime21, (long) 0);
        org.joda.time.DateTimeField dateTimeField28 = islamicChronology8.millisOfDay();
        org.joda.time.DurationField durationField29 = islamicChronology8.days();
        org.joda.time.DateTimeField dateTimeField30 = islamicChronology8.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField31 = islamicChronology8.dayOfWeek();
        org.joda.time.DurationField durationField32 = islamicChronology8.halfdays();
        boolean boolean33 = islamicChronology2.equals((java.lang.Object) islamicChronology8);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField10", (durationField4.compareTo(durationField10) == 0) == durationField4.equals(durationField10));
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test617");
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
        org.joda.time.LocalDateTime.Property property46 = localDateTime10.weekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime31 and instant44", (dateTime31.compareTo(instant44) == 0) == dateTime31.equals(instant44));
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test618");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology2.hourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 0);
        org.joda.time.Chronology chronology8 = islamicChronology2.withZone(dateTimeZone7);
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology2.yearOfCentury();
        org.joda.time.DurationField durationField10 = islamicChronology2.years();
        org.joda.time.DurationField durationField11 = islamicChronology2.weeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField10", (durationField3.compareTo(durationField10) == 0) == durationField3.equals(durationField10));
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test619");
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
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology32 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone31);
        org.joda.time.DateTimeField dateTimeField33 = islamicChronology32.yearOfCentury();
        org.joda.time.DurationField durationField34 = islamicChronology32.years();
        org.joda.time.LocalDateTime localDateTime36 = new org.joda.time.LocalDateTime((long) 1);
        int int37 = localDateTime36.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime39 = localDateTime36.minusHours((int) (byte) -1);
        int int41 = localDateTime36.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime43 = localDateTime36.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod44 = null;
        org.joda.time.LocalDateTime localDateTime45 = localDateTime36.minus(readablePeriod44);
        int int46 = localDateTime45.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField48 = localDateTime45.getField(0);
        org.joda.time.LocalDateTime.Property property49 = localDateTime45.centuryOfEra();
        int[] intArray51 = islamicChronology32.get((org.joda.time.ReadablePartial) localDateTime45, (long) 0);
        org.joda.time.LocalDateTime localDateTime53 = localDateTime45.withMillisOfSecond(60);
        org.joda.time.LocalDateTime localDateTime55 = new org.joda.time.LocalDateTime((long) 1);
        int int56 = localDateTime55.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime58 = localDateTime55.minusHours((int) (byte) -1);
        int int59 = localDateTime55.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime61 = localDateTime55.withMinuteOfHour((int) (byte) 1);
        int int63 = localDateTime61.getValue(0);
        boolean boolean64 = localDateTime53.equals((java.lang.Object) 0);
        org.joda.time.LocalDateTime localDateTime66 = localDateTime53.minusYears(183);
        int[] intArray68 = islamicChronology2.get((org.joda.time.ReadablePartial) localDateTime53, 97L);
        org.joda.time.ReadableDuration readableDuration69 = null;
        org.joda.time.LocalDateTime localDateTime70 = localDateTime53.minus(readableDuration69);
        org.joda.time.ReadablePeriod readablePeriod71 = null;
        org.joda.time.LocalDateTime localDateTime73 = localDateTime53.withPeriodAdded(readablePeriod71, (int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone75 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology76 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone75);
        org.joda.time.DurationField durationField77 = islamicChronology76.weekyears();
        org.joda.time.DurationField durationField78 = islamicChronology76.halfdays();
        org.joda.time.DateTimeField dateTimeField79 = islamicChronology76.yearOfEra();
        org.joda.time.DateTimeField dateTimeField80 = islamicChronology76.minuteOfHour();
        org.joda.time.DurationField durationField81 = islamicChronology76.centuries();
        org.joda.time.DateTimeField dateTimeField82 = islamicChronology76.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField83 = islamicChronology76.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField84 = islamicChronology76.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField85 = islamicChronology76.dayOfWeek();
        boolean boolean86 = localDateTime73.equals((java.lang.Object) dateTimeField85);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField77", (durationField4.compareTo(durationField77) == 0) == durationField4.equals(durationField77));
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test620");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology2.hourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 0);
        org.joda.time.Chronology chronology8 = islamicChronology2.withZone(dateTimeZone7);
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
        org.joda.time.DateTimeField dateTimeField31 = islamicChronology11.hourOfDay();
        org.joda.time.DateTimeField dateTimeField32 = islamicChronology11.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField33 = islamicChronology11.dayOfYear();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType34 = islamicChronology11.getLeapYearPatternType();
        org.joda.time.chrono.IslamicChronology islamicChronology35 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone7, leapYearPatternType34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField13", (durationField3.compareTo(durationField13) == 0) == durationField3.equals(durationField13));
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test621");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology2.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology2.monthOfYear();
        java.util.Locale locale7 = java.util.Locale.KOREA;
        java.util.Set<java.lang.String> strSet8 = locale7.getUnicodeLocaleAttributes();
        java.util.Locale locale9 = java.util.Locale.KOREA;
        java.util.Set<java.lang.String> strSet10 = locale9.getUnicodeLocaleAttributes();
        boolean boolean11 = strSet8.removeAll((java.util.Collection<java.lang.String>) strSet10);
        java.util.Set<java.lang.String> strSet12 = org.joda.time.DateTimeZone.getAvailableIDs();
        java.util.Locale locale13 = java.util.Locale.KOREA;
        java.util.Set<java.lang.String> strSet14 = locale13.getUnicodeLocaleAttributes();
        java.util.Locale locale15 = java.util.Locale.KOREA;
        java.util.Set<java.lang.String> strSet16 = locale15.getUnicodeLocaleAttributes();
        boolean boolean17 = strSet14.removeAll((java.util.Collection<java.lang.String>) strSet16);
        boolean boolean18 = strSet12.addAll((java.util.Collection<java.lang.String>) strSet14);
        boolean boolean19 = strSet8.addAll((java.util.Collection<java.lang.String>) strSet14);
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime((long) 1);
        int int22 = localDateTime21.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime24 = localDateTime21.minusHours((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime24.withMinuteOfHour(19);
        boolean boolean27 = strSet14.remove((java.lang.Object) localDateTime26);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime26.plusMonths(11);
        org.joda.time.DateTimeField[] dateTimeFieldArray30 = localDateTime26.getFields();
        boolean boolean31 = islamicChronology2.equals((java.lang.Object) dateTimeFieldArray30);
        org.joda.time.DurationField durationField32 = islamicChronology2.years();
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology35 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone34);
        org.joda.time.DateTimeField dateTimeField36 = islamicChronology35.weekyear();
        org.joda.time.DurationField durationField37 = islamicChronology35.weekyears();
        org.joda.time.DateTimeZone dateTimeZone38 = islamicChronology35.getZone();
        org.joda.time.chrono.IslamicChronology islamicChronology39 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone38);
        org.joda.time.DateTimeZone dateTimeZone40 = islamicChronology39.getZone();
        java.lang.String str42 = dateTimeZone40.getName(0L);
        org.joda.time.Chronology chronology43 = islamicChronology2.withZone(dateTimeZone40);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField32", (durationField3.compareTo(durationField32) == 0) == durationField3.equals(durationField32));
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test622");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        int int3 = islamicChronology2.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology2.weekyear();
        org.joda.time.DurationField durationField5 = islamicChronology2.hours();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology2.centuryOfEra();
        org.joda.time.DurationField durationField8 = islamicChronology2.eras();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology2.era();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField5 and durationField8", Math.signum(durationField5.compareTo(durationField8)) == -Math.signum(durationField8.compareTo(durationField5)));
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test623");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = islamicChronology2.years();
        org.joda.time.DurationField durationField5 = islamicChronology2.halfdays();
        org.joda.time.DurationField durationField6 = islamicChronology2.hours();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology9 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone8);
        org.joda.time.DurationField durationField10 = islamicChronology9.weekyears();
        org.joda.time.DurationField durationField11 = islamicChronology9.months();
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology9.minuteOfHour();
        org.joda.time.DurationField durationField13 = islamicChronology9.hours();
        org.joda.time.DateTimeField dateTimeField14 = islamicChronology9.hourOfHalfday();
        org.joda.time.DurationField durationField15 = islamicChronology9.hours();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology18 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone17);
        org.joda.time.DurationField durationField19 = islamicChronology18.weekyears();
        org.joda.time.DurationField durationField20 = islamicChronology18.halfdays();
        org.joda.time.DateTimeField dateTimeField21 = islamicChronology18.yearOfEra();
        org.joda.time.DateTimeField dateTimeField22 = islamicChronology18.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField23 = islamicChronology18.weekyearOfCentury();
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime((long) 1);
        int int27 = localDateTime26.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime29 = localDateTime26.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology32 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone31);
        org.joda.time.DateTime dateTime33 = localDateTime26.toDateTime(dateTimeZone31);
        java.lang.String str34 = dateTimeZone31.getID();
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime((-20217598030L), dateTimeZone31);
        org.joda.time.Chronology chronology36 = islamicChronology18.withZone(dateTimeZone31);
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime(dateTimeZone31);
        org.joda.time.ReadableDuration readableDuration38 = null;
        org.joda.time.LocalDateTime localDateTime39 = localDateTime37.minus(readableDuration38);
        org.joda.time.LocalDateTime localDateTime41 = new org.joda.time.LocalDateTime((long) 1);
        int int42 = localDateTime41.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime44 = localDateTime41.minusHours((int) (byte) -1);
        int int46 = localDateTime41.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime48 = localDateTime41.withMillisOfSecond((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime50 = new org.joda.time.LocalDateTime((long) 1);
        int int51 = localDateTime50.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime53 = localDateTime50.minusHours((int) (byte) -1);
        int int55 = localDateTime50.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime57 = localDateTime50.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod58 = null;
        org.joda.time.LocalDateTime localDateTime59 = localDateTime50.minus(readablePeriod58);
        org.joda.time.LocalDateTime.Property property60 = localDateTime50.millisOfSecond();
        long long61 = property60.remainder();
        java.lang.String str62 = property60.getName();
        java.util.Locale locale63 = java.util.Locale.CHINA;
        java.lang.String str64 = property60.getAsText(locale63);
        org.joda.time.LocalDateTime localDateTime65 = property60.withMinimumValue();
        org.joda.time.LocalDateTime localDateTime67 = localDateTime65.plusYears(4);
        org.joda.time.ReadablePeriod readablePeriod68 = null;
        org.joda.time.LocalDateTime localDateTime69 = localDateTime67.plus(readablePeriod68);
        org.joda.time.DateTimeZone dateTimeZone71 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology72 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone71);
        org.joda.time.DurationField durationField73 = islamicChronology72.weekyears();
        org.joda.time.DurationField durationField74 = islamicChronology72.halfdays();
        org.joda.time.DurationField durationField75 = islamicChronology72.weeks();
        org.joda.time.DateTimeField dateTimeField76 = islamicChronology72.yearOfEra();
        org.joda.time.LocalDateTime localDateTime78 = new org.joda.time.LocalDateTime((long) 1);
        int int79 = localDateTime78.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime81 = localDateTime78.minusHours((int) (byte) -1);
        org.joda.time.DateTimeField[] dateTimeFieldArray82 = localDateTime81.getFields();
        java.util.Locale locale83 = java.util.Locale.KOREA;
        java.util.Locale locale84 = java.util.Locale.KOREA;
        java.lang.String str85 = locale83.getDisplayLanguage(locale84);
        java.lang.String str86 = dateTimeField76.getAsText((org.joda.time.ReadablePartial) localDateTime81, locale83);
        org.joda.time.DateTimeFieldType dateTimeFieldType87 = dateTimeField76.getType();
        org.joda.time.LocalDateTime localDateTime89 = localDateTime67.withField(dateTimeFieldType87, (int) ' ');
        int int90 = localDateTime48.get(dateTimeFieldType87);
        boolean boolean91 = localDateTime39.isSupported(dateTimeFieldType87);
        int[] intArray93 = islamicChronology9.get((org.joda.time.ReadablePartial) localDateTime39, 31330000L);
        long long95 = islamicChronology2.set((org.joda.time.ReadablePartial) localDateTime39, (long) 748);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField10", (durationField4.compareTo(durationField10) == 0) == durationField4.equals(durationField10));
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test624");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology6 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone5);
        boolean boolean8 = dateTimeZone5.equals((java.lang.Object) 10L);
        org.joda.time.Chronology chronology9 = islamicChronology2.withZone(dateTimeZone5);
        org.joda.time.chrono.IslamicChronology islamicChronology10 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone5);
        org.joda.time.DurationField durationField11 = islamicChronology10.eras();
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology10.year();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField11", Math.signum(durationField3.compareTo(durationField11)) == -Math.signum(durationField11.compareTo(durationField3)));
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test625");
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
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology23 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone22);
        org.joda.time.DurationField durationField24 = islamicChronology23.weekyears();
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology27 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone26);
        boolean boolean29 = dateTimeZone26.equals((java.lang.Object) 10L);
        org.joda.time.Chronology chronology30 = islamicChronology23.withZone(dateTimeZone26);
        org.joda.time.DateTimeField dateTimeField31 = islamicChronology23.hourOfHalfday();
        org.joda.time.DurationField durationField32 = dateTimeField31.getRangeDurationField();
        boolean boolean33 = dateTime17.equals((java.lang.Object) durationField32);
        org.joda.time.Instant instant34 = dateTime17.toInstant();
        org.joda.time.LocalDateTime localDateTime36 = new org.joda.time.LocalDateTime((long) 1);
        int int37 = localDateTime36.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime39 = localDateTime36.minusHours((int) (byte) -1);
        int int41 = localDateTime36.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime43 = localDateTime36.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod44 = null;
        org.joda.time.LocalDateTime localDateTime45 = localDateTime36.minus(readablePeriod44);
        org.joda.time.LocalDateTime.Property property46 = localDateTime36.millisOfSecond();
        long long47 = property46.remainder();
        java.lang.String str48 = property46.getName();
        java.util.Locale locale49 = java.util.Locale.CHINA;
        java.lang.String str50 = property46.getAsText(locale49);
        org.joda.time.LocalDateTime localDateTime51 = property46.withMinimumValue();
        org.joda.time.LocalDateTime localDateTime53 = localDateTime51.plusYears(4);
        org.joda.time.ReadablePeriod readablePeriod54 = null;
        org.joda.time.LocalDateTime localDateTime55 = localDateTime53.plus(readablePeriod54);
        org.joda.time.DateTimeZone dateTimeZone57 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology58 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone57);
        org.joda.time.DurationField durationField59 = islamicChronology58.weekyears();
        org.joda.time.DurationField durationField60 = islamicChronology58.halfdays();
        org.joda.time.DurationField durationField61 = islamicChronology58.weeks();
        org.joda.time.DateTimeField dateTimeField62 = islamicChronology58.yearOfEra();
        org.joda.time.LocalDateTime localDateTime64 = new org.joda.time.LocalDateTime((long) 1);
        int int65 = localDateTime64.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime67 = localDateTime64.minusHours((int) (byte) -1);
        org.joda.time.DateTimeField[] dateTimeFieldArray68 = localDateTime67.getFields();
        java.util.Locale locale69 = java.util.Locale.KOREA;
        java.util.Locale locale70 = java.util.Locale.KOREA;
        java.lang.String str71 = locale69.getDisplayLanguage(locale70);
        java.lang.String str72 = dateTimeField62.getAsText((org.joda.time.ReadablePartial) localDateTime67, locale69);
        org.joda.time.DateTimeFieldType dateTimeFieldType73 = dateTimeField62.getType();
        org.joda.time.LocalDateTime localDateTime75 = localDateTime53.withField(dateTimeFieldType73, (int) ' ');
        boolean boolean76 = instant34.isSupported(dateTimeFieldType73);
        org.joda.time.Instant instant77 = instant34.toInstant();
        java.lang.Object obj78 = null;
        boolean boolean79 = instant77.equals(obj78);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and instant77", (dateTime8.compareTo(instant77) == 0) == dateTime8.equals(instant77));
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test626");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology2.hourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.year();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology2.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology2.era();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology2.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology2.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology12 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone11);
        org.joda.time.DateTimeField dateTimeField13 = islamicChronology12.yearOfCentury();
        org.joda.time.DurationField durationField14 = islamicChronology12.years();
        org.joda.time.DurationField durationField15 = islamicChronology12.halfdays();
        org.joda.time.DateTimeField dateTimeField16 = islamicChronology12.hourOfHalfday();
        org.joda.time.DurationField durationField17 = islamicChronology12.weeks();
        long long21 = islamicChronology12.add(100L, 1970L, 10);
        org.joda.time.DurationField durationField22 = islamicChronology12.seconds();
        org.joda.time.DateTimeZone dateTimeZone23 = islamicChronology12.getZone();
        java.lang.Object obj24 = null;
        boolean boolean25 = islamicChronology12.equals(obj24);
        org.joda.time.LocalDateTime localDateTime26 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime((long) 1);
        int int29 = localDateTime28.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime31 = localDateTime28.withYear((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod32 = null;
        org.joda.time.LocalDateTime localDateTime34 = localDateTime31.withPeriodAdded(readablePeriod32, 10);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime34.withDayOfYear(11);
        int[] intArray37 = localDateTime36.getValues();
        org.joda.time.LocalDateTime localDateTime39 = localDateTime36.plusHours((int) (short) 0);
        int int40 = localDateTime26.compareTo((org.joda.time.ReadablePartial) localDateTime36);
        org.joda.time.ReadableDuration readableDuration41 = null;
        org.joda.time.LocalDateTime localDateTime42 = localDateTime26.plus(readableDuration41);
        boolean boolean43 = islamicChronology12.equals((java.lang.Object) localDateTime42);
        java.util.Locale locale47 = new java.util.Locale("DateTimeField[minuteOfDay]", "kor", "fra");
        java.util.Locale locale48 = java.util.Locale.KOREA;
        java.util.Set<java.lang.String> strSet49 = locale48.getUnicodeLocaleAttributes();
        java.util.Locale.Builder builder50 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder53 = builder50.setExtension('a', "FR");
        java.util.Locale.Builder builder55 = builder53.addUnicodeLocaleAttribute("KOR");
        java.util.Locale locale56 = java.util.Locale.TAIWAN;
        java.util.Locale.Builder builder57 = builder55.setLocale(locale56);
        java.lang.String str58 = locale48.getDisplayCountry(locale56);
        java.util.Locale.Builder builder59 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder61 = builder59.setVariant("");
        java.util.Locale locale62 = builder61.build();
        java.lang.String str63 = locale62.getDisplayVariant();
        java.lang.String str64 = locale56.getDisplayName(locale62);
        java.lang.String str65 = locale47.getDisplayName(locale62);
        java.util.Locale.Category category66 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale67 = java.util.Locale.KOREA;
        java.util.Locale locale68 = java.util.Locale.KOREA;
        java.lang.String str69 = locale67.getDisplayLanguage(locale68);
        java.util.Locale.setDefault(locale67);
        java.util.Locale.setDefault(category66, locale67);
        java.util.Locale locale73 = new java.util.Locale("1970-01-01T00:25:00.001");
        java.util.Locale.setDefault(category66, locale73);
        java.lang.String str75 = locale47.getDisplayLanguage(locale73);
        java.lang.String str76 = locale73.getLanguage();
        java.lang.String str77 = dateTimeField9.getAsShortText((org.joda.time.ReadablePartial) localDateTime42, locale73);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField14", (durationField3.compareTo(durationField14) == 0) == durationField3.equals(durationField14));
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
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType7 = islamicChronology2.getLeapYearPatternType();
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime((long) (byte) -1);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.minusDays(12);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology14 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone13);
        org.joda.time.DurationField durationField15 = islamicChronology14.weekyears();
        org.joda.time.DurationField durationField16 = islamicChronology14.halfdays();
        org.joda.time.DateTimeField dateTimeField17 = islamicChronology14.yearOfEra();
        org.joda.time.DurationField durationField18 = islamicChronology14.halfdays();
        org.joda.time.DurationFieldType durationFieldType19 = durationField18.getType();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime9.withFieldAdded(durationFieldType19, (int) '#');
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology24 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone23);
        org.joda.time.DurationField durationField25 = islamicChronology24.weekyears();
        org.joda.time.DurationField durationField26 = islamicChronology24.halfdays();
        org.joda.time.DurationField durationField27 = islamicChronology24.weeks();
        org.joda.time.DateTimeField dateTimeField28 = islamicChronology24.yearOfEra();
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime((long) 1);
        int int31 = localDateTime30.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime33 = localDateTime30.minusHours((int) (byte) -1);
        org.joda.time.DateTimeField[] dateTimeFieldArray34 = localDateTime33.getFields();
        java.util.Locale locale35 = java.util.Locale.KOREA;
        java.util.Locale locale36 = java.util.Locale.KOREA;
        java.lang.String str37 = locale35.getDisplayLanguage(locale36);
        java.lang.String str38 = dateTimeField28.getAsText((org.joda.time.ReadablePartial) localDateTime33, locale35);
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = dateTimeField28.getType();
        org.joda.time.LocalDateTime.Property property40 = localDateTime21.property(dateTimeFieldType39);
        int[] intArray42 = islamicChronology2.get((org.joda.time.ReadablePartial) localDateTime21, 0L);
        org.joda.time.DurationField durationField43 = islamicChronology2.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField43, durationField3, and durationField5", !(durationField43.compareTo(durationField3) == 0) || (Math.signum(durationField43.compareTo(durationField5)) == Math.signum(durationField3.compareTo(durationField5))));
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test628");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DurationField durationField4 = islamicChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.yearOfEra();
        org.joda.time.DurationField durationField6 = islamicChronology2.months();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology2.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology2.yearOfEra();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology2.dayOfYear();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology2.monthOfYear();
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology2.secondOfDay();
        org.joda.time.DurationField durationField13 = islamicChronology2.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField13, durationField3, and durationField4", !(durationField13.compareTo(durationField3) == 0) || (Math.signum(durationField13.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test629");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology2.hourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.millisOfSecond();
        java.lang.String str6 = islamicChronology2.toString();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology2.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology2.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology11 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone10);
        org.joda.time.DurationField durationField12 = islamicChronology11.weekyears();
        org.joda.time.DateTimeField dateTimeField13 = islamicChronology11.yearOfEra();
        long long15 = dateTimeField13.roundCeiling(0L);
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime((long) 1);
        int int18 = localDateTime17.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime17.minusHours((int) (byte) -1);
        int int21 = localDateTime17.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime23 = localDateTime17.withMinuteOfHour((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime17.plusHours((int) (byte) 100);
        org.joda.time.ReadableDuration readableDuration26 = null;
        org.joda.time.LocalDateTime localDateTime27 = localDateTime17.minus(readableDuration26);
        java.util.Locale locale28 = java.util.Locale.PRC;
        java.util.Locale locale29 = locale28.stripExtensions();
        java.lang.String str30 = dateTimeField13.getAsShortText((org.joda.time.ReadablePartial) localDateTime27, locale28);
        org.joda.time.ReadablePeriod readablePeriod31 = null;
        org.joda.time.LocalDateTime localDateTime32 = localDateTime27.plus(readablePeriod31);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime32.plusYears(100);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime32.plusMillis(4);
        org.joda.time.LocalDateTime localDateTime38 = localDateTime32.withYear((int) (byte) 0);
        int[] intArray40 = islamicChronology2.get((org.joda.time.ReadablePartial) localDateTime32, (-3599997L));
        org.joda.time.DateTimeField dateTimeField41 = islamicChronology2.hourOfHalfday();
        org.joda.time.DurationField durationField42 = islamicChronology2.centuries();
        org.joda.time.DateTimeField dateTimeField43 = islamicChronology2.dayOfMonth();
        org.joda.time.DurationField durationField44 = islamicChronology2.years();
        org.joda.time.DateTimeField dateTimeField45 = islamicChronology2.dayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField44", (durationField3.compareTo(durationField44) == 0) == durationField3.equals(durationField44));
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test630");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = islamicChronology2.years();
        org.joda.time.DurationField durationField5 = islamicChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology2.hourOfHalfday();
        org.joda.time.DurationField durationField7 = islamicChronology2.weeks();
        long long11 = islamicChronology2.add(100L, 1970L, 10);
        org.joda.time.DurationField durationField12 = islamicChronology2.seconds();
        org.joda.time.DateTimeField dateTimeField13 = islamicChronology2.weekyearOfCentury();
        org.joda.time.DurationField durationField14 = islamicChronology2.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField14, durationField4, and durationField5", !(durationField14.compareTo(durationField4) == 0) || (Math.signum(durationField14.compareTo(durationField5)) == Math.signum(durationField4.compareTo(durationField5))));
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test631");
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
        org.joda.time.DateTimeField dateTimeField18 = islamicChronology2.yearOfEra();
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime((long) 1);
        int int21 = localDateTime20.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime23 = localDateTime20.minusHours((int) (byte) -1);
        int int24 = localDateTime20.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime26 = localDateTime20.withMinuteOfHour((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime20.plusHours((int) (byte) 100);
        java.util.Date date29 = localDateTime28.toDate();
        org.joda.time.DateTime dateTime30 = localDateTime28.toDateTime();
        int[] intArray32 = islamicChronology2.get((org.joda.time.ReadablePartial) localDateTime28, (-3599999L));
        org.joda.time.DurationField durationField33 = islamicChronology2.years();
        org.joda.time.DateTimeField dateTimeField34 = islamicChronology2.minuteOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField33", (durationField3.compareTo(durationField33) == 0) == durationField3.equals(durationField33));
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test632");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        int int2 = localDateTime1.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.minusHours((int) (byte) -1);
        org.joda.time.DateTimeField[] dateTimeFieldArray5 = localDateTime4.getFields();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.minusDays(4);
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
        org.joda.time.LocalDateTime.Property property23 = localDateTime18.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime28 = localDateTime18.withTime((int) (byte) 1, 0, 5, (int) (byte) 100);
        boolean boolean29 = localDateTime4.isBefore((org.joda.time.ReadablePartial) localDateTime28);
        org.joda.time.LocalDateTime.Property property30 = localDateTime28.weekyear();
        org.joda.time.LocalDateTime localDateTime32 = localDateTime28.withDayOfWeek(5);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime28.minusMillis(0);
        org.joda.time.LocalDateTime.Property property35 = localDateTime28.weekOfWeekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = property35.getFieldType();
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 0);
        java.util.TimeZone timeZone39 = dateTimeZone38.toTimeZone();
        boolean boolean41 = dateTimeZone38.isStandardOffset((long) 60);
        java.lang.String str43 = dateTimeZone38.getShortName((long) 3600001);
        org.joda.time.LocalDateTime localDateTime45 = new org.joda.time.LocalDateTime((long) 1);
        int int46 = localDateTime45.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime48 = localDateTime45.minusHours((int) (byte) -1);
        int int49 = localDateTime45.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime51 = localDateTime45.minusMinutes((int) '#');
        org.joda.time.LocalDateTime.Property property52 = localDateTime51.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime53 = property52.roundCeilingCopy();
        java.lang.String str54 = property52.toString();
        org.joda.time.LocalDateTime localDateTime56 = new org.joda.time.LocalDateTime((long) 1);
        int int57 = localDateTime56.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime59 = localDateTime56.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone61 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology62 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone61);
        org.joda.time.DateTime dateTime63 = localDateTime56.toDateTime(dateTimeZone61);
        org.joda.time.ReadableInstant readableInstant64 = null;
        boolean boolean65 = dateTime63.isAfter(readableInstant64);
        org.joda.time.Instant instant66 = dateTime63.toInstant();
        int int67 = property52.compareTo((org.joda.time.ReadableInstant) dateTime63);
        int int68 = dateTimeZone38.getOffset((org.joda.time.ReadableInstant) dateTime63);
        org.joda.time.Chronology chronology69 = dateTime63.getChronology();
        int int70 = property35.getDifference((org.joda.time.ReadableInstant) dateTime63);
        long long71 = property35.remainder();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime63 and instant66", (dateTime63.compareTo(instant66) == 0) == dateTime63.equals(instant66));
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test633");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DurationField durationField4 = islamicChronology2.months();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.minuteOfHour();
        org.joda.time.DurationField durationField6 = islamicChronology2.hours();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology2.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology2.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology11 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone10);
        org.joda.time.DurationField durationField12 = islamicChronology11.weekyears();
        org.joda.time.DurationField durationField13 = islamicChronology11.halfdays();
        org.joda.time.DateTimeField dateTimeField14 = islamicChronology11.yearOfEra();
        org.joda.time.DateTimeField dateTimeField15 = islamicChronology11.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField16 = islamicChronology11.monthOfYear();
        org.joda.time.DurationField durationField17 = islamicChronology11.weekyears();
        org.joda.time.DateTimeField dateTimeField18 = islamicChronology11.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField19 = islamicChronology11.year();
        org.joda.time.DurationField durationField20 = islamicChronology11.minutes();
        org.joda.time.DateTimeField dateTimeField21 = islamicChronology11.clockhourOfHalfday();
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
        org.joda.time.DateTimeZone dateTimeZone42 = dateTime39.getZone();
        org.joda.time.LocalDateTime localDateTime43 = new org.joda.time.LocalDateTime(dateTimeZone42);
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology46 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone45);
        org.joda.time.DurationField durationField47 = islamicChronology46.weekyears();
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology50 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone49);
        boolean boolean52 = dateTimeZone49.equals((java.lang.Object) 10L);
        org.joda.time.Chronology chronology53 = islamicChronology46.withZone(dateTimeZone49);
        org.joda.time.chrono.IslamicChronology islamicChronology54 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone49);
        long long56 = dateTimeZone42.getMillisKeepLocal(dateTimeZone49, 100L);
        org.joda.time.Chronology chronology57 = islamicChronology11.withZone(dateTimeZone42);
        org.joda.time.Chronology chronology58 = islamicChronology2.withZone(dateTimeZone42);
        org.joda.time.DurationField durationField59 = islamicChronology2.years();
        org.joda.time.DurationField durationField60 = islamicChronology2.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField59", (durationField3.compareTo(durationField59) == 0) == durationField3.equals(durationField59));
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test634");
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
        org.joda.time.DateTimeField dateTimeField29 = islamicChronology2.halfdayOfDay();
        org.joda.time.DurationField durationField30 = islamicChronology2.weekyears();
        java.lang.String str31 = islamicChronology2.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField30", (durationField4.compareTo(durationField30) == 0) == durationField4.equals(durationField30));
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test635");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.millisOfSecond();
        org.joda.time.DurationField durationField6 = islamicChronology2.years();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology2.weekyearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField6", (durationField3.compareTo(durationField6) == 0) == durationField3.equals(durationField6));
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test636");
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
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology27 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone26);
        org.joda.time.DateTimeField dateTimeField28 = islamicChronology27.yearOfCentury();
        org.joda.time.DurationField durationField29 = islamicChronology27.years();
        org.joda.time.DurationField durationField30 = islamicChronology27.halfdays();
        org.joda.time.DateTimeField dateTimeField31 = islamicChronology27.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField32 = islamicChronology27.dayOfYear();
        org.joda.time.DateTimeField dateTimeField33 = islamicChronology27.hourOfHalfday();
        int int34 = dateTimeField33.getMaximumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType35 = dateTimeField33.getType();
        int int36 = dateTime24.get(dateTimeFieldType35);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime22 and instant23", (dateTime22.compareTo(instant23) == 0) == dateTime22.equals(instant23));
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test637");
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
        org.joda.time.ReadableDuration readableDuration26 = null;
        org.joda.time.LocalDateTime localDateTime27 = localDateTime23.plus(readableDuration26);
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology30 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone29);
        org.joda.time.DurationField durationField31 = islamicChronology30.weekyears();
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology34 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone33);
        boolean boolean36 = dateTimeZone33.equals((java.lang.Object) 10L);
        org.joda.time.Chronology chronology37 = islamicChronology30.withZone(dateTimeZone33);
        org.joda.time.DurationField durationField38 = islamicChronology30.eras();
        boolean boolean39 = localDateTime23.equals((java.lang.Object) durationField38);
        org.joda.time.LocalDateTime.Property property40 = localDateTime23.secondOfMinute();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField38", Math.signum(durationField3.compareTo(durationField38)) == -Math.signum(durationField38.compareTo(durationField3)));
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test638");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        int int2 = localDateTime1.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology7 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone6);
        org.joda.time.DateTime dateTime8 = localDateTime1.toDateTime(dateTimeZone6);
        long long9 = dateTime8.getMillis();
        long long10 = dateTime8.getMillis();
        long long11 = dateTime8.getMillis();
        org.joda.time.Instant instant12 = dateTime8.toInstant();
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((long) 1);
        int int15 = localDateTime14.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime17 = localDateTime14.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology20 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone19);
        org.joda.time.DateTime dateTime21 = localDateTime14.toDateTime(dateTimeZone19);
        org.joda.time.ReadableInstant readableInstant22 = null;
        boolean boolean23 = dateTime21.isAfter(readableInstant22);
        org.joda.time.Instant instant24 = dateTime21.toInstant();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology28 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone27);
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime((long) 1);
        int int31 = localDateTime30.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime33 = localDateTime30.minusHours((int) (byte) -1);
        org.joda.time.DateTimeField[] dateTimeFieldArray34 = localDateTime33.getFields();
        boolean boolean35 = dateTimeZone27.isLocalDateTimeGap(localDateTime33);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone27);
        java.util.TimeZone timeZone37 = dateTimeZone27.toTimeZone();
        long long39 = dateTimeZone27.previousTransition((long) 24);
        org.joda.time.LocalDateTime localDateTime40 = new org.joda.time.LocalDateTime(11L, dateTimeZone27);
        org.joda.time.LocalDateTime localDateTime41 = org.joda.time.LocalDateTime.now(dateTimeZone27);
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
        int int61 = property53.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime63 = new org.joda.time.LocalDateTime((long) 1);
        int int64 = localDateTime63.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime66 = localDateTime63.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone68 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology69 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone68);
        org.joda.time.DateTime dateTime70 = localDateTime63.toDateTime(dateTimeZone68);
        long long71 = dateTime70.getMillis();
        long long72 = property53.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime70);
        org.joda.time.DateTime dateTime73 = localDateTime41.toDateTime((org.joda.time.ReadableInstant) dateTime70);
        org.joda.time.DateTimeZone dateTimeZone75 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology76 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone75);
        org.joda.time.DurationField durationField77 = islamicChronology76.weekyears();
        org.joda.time.DurationField durationField78 = islamicChronology76.halfdays();
        org.joda.time.DurationField durationField79 = islamicChronology76.weeks();
        org.joda.time.DateTimeField dateTimeField80 = islamicChronology76.yearOfEra();
        org.joda.time.LocalDateTime localDateTime82 = new org.joda.time.LocalDateTime((long) 1);
        int int83 = localDateTime82.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime85 = localDateTime82.minusHours((int) (byte) -1);
        org.joda.time.DateTimeField[] dateTimeFieldArray86 = localDateTime85.getFields();
        java.util.Locale locale87 = java.util.Locale.KOREA;
        java.util.Locale locale88 = java.util.Locale.KOREA;
        java.lang.String str89 = locale87.getDisplayLanguage(locale88);
        java.lang.String str90 = dateTimeField80.getAsText((org.joda.time.ReadablePartial) localDateTime85, locale87);
        org.joda.time.DateTimeFieldType dateTimeFieldType91 = dateTimeField80.getType();
        int int92 = dateTime70.get(dateTimeFieldType91);
        boolean boolean93 = instant24.isSupported(dateTimeFieldType91);
        boolean boolean94 = instant12.isSupported(dateTimeFieldType91);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and instant24", (dateTime8.compareTo(instant24) == 0) == dateTime8.equals(instant24));
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
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology2.minuteOfHour();
        org.joda.time.DurationField durationField7 = islamicChronology2.centuries();
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((org.joda.time.Chronology) islamicChronology2);
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology2.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone10 = islamicChronology2.getZone();
        org.joda.time.DurationField durationField11 = islamicChronology2.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField11, durationField3, and durationField4", !(durationField11.compareTo(durationField3) == 0) || (Math.signum(durationField11.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test640");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology6 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone5);
        boolean boolean8 = dateTimeZone5.equals((java.lang.Object) 10L);
        org.joda.time.Chronology chronology9 = islamicChronology2.withZone(dateTimeZone5);
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology2.hourOfHalfday();
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime((long) 1);
        int int13 = localDateTime12.getHourOfDay();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology16 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField17 = islamicChronology16.weekyear();
        org.joda.time.ReadablePartial readablePartial18 = null;
        int[] intArray25 = new int[] { (short) 100, 10, 100, (short) -1, (byte) 10 };
        int[] intArray27 = dateTimeField17.addWrapPartial(readablePartial18, 100, intArray25, (int) (short) 0);
        int int28 = dateTimeField10.getMaximumValue((org.joda.time.ReadablePartial) localDateTime12, intArray25);
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime((long) 1);
        int int31 = localDateTime30.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime33 = localDateTime30.minusHours((int) (byte) -1);
        int int35 = localDateTime30.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime37 = localDateTime30.withMillisOfSecond((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime38 = localDateTime12.withFields((org.joda.time.ReadablePartial) localDateTime37);
        org.joda.time.LocalDateTime localDateTime40 = localDateTime38.withYearOfCentury((int) 'a');
        org.joda.time.LocalDateTime localDateTime42 = localDateTime40.minusWeeks(60);
        int int43 = localDateTime42.size();
        org.joda.time.LocalDateTime localDateTime45 = localDateTime42.plusSeconds(9);
        int int46 = localDateTime42.getMonthOfYear();
        org.joda.time.LocalDateTime localDateTime48 = new org.joda.time.LocalDateTime((long) 1);
        int int49 = localDateTime48.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime51 = localDateTime48.minusHours((int) (byte) -1);
        int int53 = localDateTime48.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime55 = localDateTime48.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod56 = null;
        org.joda.time.LocalDateTime localDateTime57 = localDateTime48.minus(readablePeriod56);
        org.joda.time.LocalDateTime.Property property58 = localDateTime48.millisOfSecond();
        long long59 = property58.remainder();
        java.lang.String str60 = property58.getName();
        java.util.Locale locale61 = java.util.Locale.CHINA;
        java.lang.String str62 = property58.getAsText(locale61);
        org.joda.time.LocalDateTime localDateTime63 = property58.withMinimumValue();
        boolean boolean65 = property58.equals((java.lang.Object) 59);
        int int66 = property58.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime68 = new org.joda.time.LocalDateTime((long) 1);
        int int69 = localDateTime68.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime71 = localDateTime68.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone73 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology74 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone73);
        org.joda.time.DateTime dateTime75 = localDateTime68.toDateTime(dateTimeZone73);
        long long76 = dateTime75.getMillis();
        long long77 = property58.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime75);
        org.joda.time.Instant instant78 = dateTime75.toInstant();
        org.joda.time.DateTimeFieldType dateTimeFieldType79 = null;
        boolean boolean80 = dateTime75.isSupported(dateTimeFieldType79);
        org.joda.time.ReadableInstant readableInstant81 = null;
        boolean boolean82 = dateTime75.isAfter(readableInstant81);
        org.joda.time.DateTime dateTime83 = localDateTime42.toDateTime(readableInstant81);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime75 and instant78", (dateTime75.compareTo(instant78) == 0) == dateTime75.equals(instant78));
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test641");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        int int2 = localDateTime1.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology7 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone6);
        org.joda.time.DateTime dateTime8 = localDateTime1.toDateTime(dateTimeZone6);
        long long9 = dateTime8.getMillis();
        org.joda.time.ReadableInstant readableInstant10 = null;
        boolean boolean11 = dateTime8.isAfter(readableInstant10);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology14 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone13);
        org.joda.time.DurationField durationField15 = islamicChronology14.weekyears();
        org.joda.time.DurationField durationField16 = islamicChronology14.halfdays();
        org.joda.time.DurationField durationField17 = islamicChronology14.weeks();
        org.joda.time.DateTimeField dateTimeField18 = islamicChronology14.yearOfEra();
        org.joda.time.DateTimeField dateTimeField19 = islamicChronology14.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField20 = islamicChronology14.dayOfYear();
        org.joda.time.DateTimeField dateTimeField21 = islamicChronology14.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime((long) 1);
        int int24 = localDateTime23.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime26 = localDateTime23.withYear((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        org.joda.time.LocalDateTime localDateTime29 = localDateTime26.withPeriodAdded(readablePeriod27, 10);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime29.withDayOfYear(11);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime31.withYear(10);
        int int34 = dateTimeField21.getMinimumValue((org.joda.time.ReadablePartial) localDateTime31);
        org.joda.time.LocalDateTime.Property property35 = localDateTime31.yearOfEra();
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime((long) 1);
        int int38 = localDateTime37.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime40 = localDateTime37.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology43 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone42);
        org.joda.time.DateTime dateTime44 = localDateTime37.toDateTime(dateTimeZone42);
        long long45 = dateTime44.getMillis();
        long long46 = dateTime44.getMillis();
        org.joda.time.Instant instant47 = dateTime44.toInstant();
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology50 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone49);
        org.joda.time.DurationField durationField51 = islamicChronology50.weekyears();
        org.joda.time.DurationField durationField52 = islamicChronology50.halfdays();
        org.joda.time.DateTimeField dateTimeField53 = islamicChronology50.yearOfEra();
        org.joda.time.DateTimeField dateTimeField54 = islamicChronology50.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField55 = islamicChronology50.weekyear();
        org.joda.time.DurationField durationField56 = islamicChronology50.days();
        org.joda.time.DateTimeField dateTimeField57 = islamicChronology50.millisOfSecond();
        org.joda.time.DateTimeFieldType dateTimeFieldType58 = dateTimeField57.getType();
        boolean boolean59 = dateTime44.isSupported(dateTimeFieldType58);
        int int60 = property35.compareTo((org.joda.time.ReadableInstant) dateTime44);
        boolean boolean61 = dateTime8.isAfter((org.joda.time.ReadableInstant) dateTime44);
        org.joda.time.LocalDateTime localDateTime63 = new org.joda.time.LocalDateTime((long) 1);
        int int64 = localDateTime63.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime66 = localDateTime63.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone68 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology69 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone68);
        org.joda.time.DateTime dateTime70 = localDateTime63.toDateTime(dateTimeZone68);
        long long71 = dateTime70.getMillis();
        long long72 = dateTime70.getMillis();
        long long73 = dateTime70.getMillis();
        java.lang.String str74 = dateTime70.toString();
        boolean boolean75 = dateTime44.isEqual((org.joda.time.ReadableInstant) dateTime70);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and instant47", (dateTime8.compareTo(instant47) == 0) == dateTime8.equals(instant47));
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test642");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DurationField durationField4 = islamicChronology2.months();
        org.joda.time.DurationField durationField5 = islamicChronology2.centuries();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology2.hourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology2.millisOfDay();
        org.joda.time.DurationField durationField8 = islamicChronology2.years();
        org.joda.time.DurationField durationField9 = islamicChronology2.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField8", (durationField3.compareTo(durationField8) == 0) == durationField3.equals(durationField8));
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test643");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        int int2 = localDateTime1.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.minusHours((int) (byte) -1);
        int int5 = localDateTime1.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.minusMinutes((int) '#');
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.centuryOfEra();
        java.lang.String str9 = property8.getAsShortText();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology12 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone11);
        org.joda.time.DurationField durationField13 = islamicChronology12.weekyears();
        org.joda.time.DateTimeField dateTimeField14 = islamicChronology12.millisOfSecond();
        long long18 = islamicChronology12.add((long) (byte) -1, (long) 0, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime((long) 1);
        int int21 = localDateTime20.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime23 = localDateTime20.minusHours((int) (byte) -1);
        int int25 = localDateTime20.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime20.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.LocalDateTime localDateTime29 = localDateTime20.minus(readablePeriod28);
        int int30 = localDateTime29.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField32 = localDateTime29.getField(0);
        org.joda.time.LocalDateTime.Property property33 = localDateTime29.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime35 = localDateTime29.withMonthOfYear((int) (short) 10);
        boolean boolean36 = islamicChronology12.equals((java.lang.Object) localDateTime29);
        org.joda.time.DateTimeField dateTimeField37 = islamicChronology12.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone38 = islamicChronology12.getZone();
        java.lang.String str39 = dateTimeZone38.toString();
        long long41 = dateTimeZone38.convertUTCToLocal(30617280288L);
        java.util.Locale locale42 = java.util.Locale.KOREA;
        java.util.Locale locale43 = java.util.Locale.KOREA;
        java.lang.String str44 = locale42.getDisplayLanguage(locale43);
        java.lang.String str45 = locale43.getISO3Country();
        java.util.Set<java.lang.String> strSet46 = locale43.getUnicodeLocaleAttributes();
        strSet46.clear();
        org.joda.time.LocalDateTime localDateTime49 = new org.joda.time.LocalDateTime((long) 1);
        int int50 = localDateTime49.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime52 = localDateTime49.minusHours((int) (byte) -1);
        int int54 = localDateTime49.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime56 = localDateTime49.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod57 = null;
        org.joda.time.LocalDateTime localDateTime58 = localDateTime49.minus(readablePeriod57);
        org.joda.time.LocalDateTime.Property property59 = localDateTime49.millisOfSecond();
        long long60 = property59.remainder();
        java.lang.String str61 = property59.getName();
        int int62 = property59.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime64 = property59.addWrapFieldToCopy(70);
        org.joda.time.LocalDateTime localDateTime65 = property59.roundFloorCopy();
        boolean boolean66 = strSet46.remove((java.lang.Object) localDateTime65);
        org.joda.time.DateTimeZone dateTimeZone67 = null;
        org.joda.time.DateTime dateTime68 = localDateTime65.toDateTime(dateTimeZone67);
        org.joda.time.Instant instant69 = dateTime68.toInstant();
        int int70 = dateTimeZone38.getOffset((org.joda.time.ReadableInstant) instant69);
        int int71 = property8.compareTo((org.joda.time.ReadableInstant) instant69);
        org.joda.time.DateTimeFieldType dateTimeFieldType72 = property8.getFieldType();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime68 and instant69", (dateTime68.compareTo(instant69) == 0) == dateTime68.equals(instant69));
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test644");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        long long3 = dateTimeZone1.nextTransition((long) (-306028799));
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((long) 1);
        int int6 = localDateTime5.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology11 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone10);
        org.joda.time.DateTime dateTime12 = localDateTime5.toDateTime(dateTimeZone10);
        org.joda.time.ReadableInstant readableInstant13 = null;
        boolean boolean14 = dateTime12.isAfter(readableInstant13);
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((long) 1);
        int int17 = localDateTime16.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology22 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone21);
        org.joda.time.DateTime dateTime23 = localDateTime16.toDateTime(dateTimeZone21);
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime((long) 1);
        int int26 = localDateTime25.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime28 = localDateTime25.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology31 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone30);
        org.joda.time.DateTime dateTime32 = localDateTime25.toDateTime(dateTimeZone30);
        long long33 = dateTime32.getMillis();
        boolean boolean34 = dateTime23.isAfter((org.joda.time.ReadableInstant) dateTime32);
        long long35 = dateTime32.getMillis();
        boolean boolean36 = dateTime12.isAfter((org.joda.time.ReadableInstant) dateTime32);
        org.joda.time.Instant instant37 = dateTime12.toInstant();
        int int38 = dateTimeZone1.getOffset((org.joda.time.ReadableInstant) dateTime12);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime23 and instant37", (dateTime23.compareTo(instant37) == 0) == dateTime23.equals(instant37));
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test645");
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
        org.joda.time.DateTimeZone dateTimeZone54 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology55 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone54);
        org.joda.time.DurationField durationField56 = islamicChronology55.weekyears();
        org.joda.time.DurationField durationField57 = islamicChronology55.halfdays();
        org.joda.time.DateTimeField dateTimeField58 = islamicChronology55.yearOfEra();
        org.joda.time.DurationField durationField59 = islamicChronology55.months();
        org.joda.time.DateTimeField dateTimeField60 = islamicChronology55.yearOfEra();
        org.joda.time.DateTimeField dateTimeField61 = islamicChronology55.yearOfCentury();
        boolean boolean62 = strSet2.contains((java.lang.Object) dateTimeField61);
        org.joda.time.chrono.IslamicChronology islamicChronology63 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField64 = islamicChronology63.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField65 = islamicChronology63.centuryOfEra();
        org.joda.time.DurationField durationField66 = islamicChronology63.millis();
        org.joda.time.DurationField durationField67 = islamicChronology63.eras();
        boolean boolean68 = strSet2.remove((java.lang.Object) islamicChronology63);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField45 and durationField67", Math.signum(durationField45.compareTo(durationField67)) == -Math.signum(durationField67.compareTo(durationField45)));
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test646");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology2.weekyear();
        org.joda.time.DurationField durationField4 = islamicChronology2.years();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone6 = islamicChronology2.getZone();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology9 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone8);
        org.joda.time.DurationField durationField10 = islamicChronology9.weekyears();
        org.joda.time.DurationField durationField11 = islamicChronology9.halfdays();
        org.joda.time.DurationField durationField12 = islamicChronology9.weeks();
        org.joda.time.DateTimeField dateTimeField13 = islamicChronology9.yearOfEra();
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((long) 1);
        int int16 = localDateTime15.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime15.minusHours((int) (byte) -1);
        org.joda.time.DateTimeField[] dateTimeFieldArray19 = localDateTime18.getFields();
        java.util.Locale locale20 = java.util.Locale.KOREA;
        java.util.Locale locale21 = java.util.Locale.KOREA;
        java.lang.String str22 = locale20.getDisplayLanguage(locale21);
        java.lang.String str23 = dateTimeField13.getAsText((org.joda.time.ReadablePartial) localDateTime18, locale20);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime18.minusSeconds((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime25.withSecondOfMinute(45);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.plusMinutes(31);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime29.minusDays((-5640));
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology34 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone33);
        org.joda.time.DateTimeField dateTimeField35 = islamicChronology34.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField36 = islamicChronology34.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology39 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone38);
        org.joda.time.DurationField durationField40 = islamicChronology39.weekyears();
        org.joda.time.DurationField durationField41 = islamicChronology39.halfdays();
        org.joda.time.DurationField durationField42 = islamicChronology39.weeks();
        org.joda.time.DateTimeField dateTimeField43 = islamicChronology39.yearOfEra();
        org.joda.time.LocalDateTime localDateTime45 = new org.joda.time.LocalDateTime((long) 1);
        int int46 = localDateTime45.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime48 = localDateTime45.minusHours((int) (byte) -1);
        org.joda.time.DateTimeField[] dateTimeFieldArray49 = localDateTime48.getFields();
        java.util.Locale locale50 = java.util.Locale.KOREA;
        java.util.Locale locale51 = java.util.Locale.KOREA;
        java.lang.String str52 = locale50.getDisplayLanguage(locale51);
        java.lang.String str53 = dateTimeField43.getAsText((org.joda.time.ReadablePartial) localDateTime48, locale50);
        org.joda.time.LocalDateTime localDateTime55 = localDateTime48.minusSeconds((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime57 = localDateTime55.withSecondOfMinute(45);
        org.joda.time.DateTimeZone dateTimeZone59 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology60 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone59);
        org.joda.time.DurationField durationField61 = islamicChronology60.weekyears();
        org.joda.time.DurationField durationField62 = islamicChronology60.halfdays();
        org.joda.time.DateTimeField dateTimeField63 = islamicChronology60.era();
        org.joda.time.DateTimeField dateTimeField64 = islamicChronology60.yearOfCentury();
        boolean boolean65 = localDateTime55.equals((java.lang.Object) dateTimeField64);
        org.joda.time.LocalDateTime localDateTime67 = localDateTime55.minusWeeks((int) ' ');
        org.joda.time.ReadablePeriod readablePeriod68 = null;
        org.joda.time.LocalDateTime localDateTime69 = localDateTime55.minus(readablePeriod68);
        int[] intArray71 = islamicChronology34.get((org.joda.time.ReadablePartial) localDateTime55, (long) 43);
        islamicChronology2.validate((org.joda.time.ReadablePartial) localDateTime31, intArray71);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField10", (durationField4.compareTo(durationField10) == 0) == durationField4.equals(durationField10));
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test647");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DurationField durationField4 = islamicChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.yearOfEra();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology2.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology2.weekyear();
        org.joda.time.DurationField durationField8 = islamicChronology2.days();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology2.minuteOfDay();
        org.joda.time.DurationField durationField10 = islamicChronology2.years();
        java.lang.Class<?> wildcardClass11 = islamicChronology2.getClass();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField10", (durationField3.compareTo(durationField10) == 0) == durationField3.equals(durationField10));
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test648");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DurationField durationField4 = islamicChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.yearOfEra();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology2.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology2.monthOfYear();
        org.joda.time.Chronology chronology8 = islamicChronology2.withUTC();
        org.joda.time.DurationField durationField9 = islamicChronology2.weekyears();
        org.joda.time.DurationField durationField10 = islamicChronology2.weeks();
        org.joda.time.LocalDateTime localDateTime11 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) islamicChronology2);
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology2.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField13 = islamicChronology2.weekyear();
        long long17 = islamicChronology2.add((-20217598030L), 2022L, 19);
        org.joda.time.DateTimeField dateTimeField18 = islamicChronology2.secondOfMinute();
        org.joda.time.DurationField durationField19 = islamicChronology2.hours();
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime((long) 1);
        int int22 = localDateTime21.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime24 = localDateTime21.minusHours((int) (byte) -1);
        org.joda.time.DateTimeField[] dateTimeFieldArray25 = localDateTime24.getFields();
        org.joda.time.LocalDateTime localDateTime27 = localDateTime24.minusDays(4);
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
        org.joda.time.LocalDateTime.Property property43 = localDateTime38.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime48 = localDateTime38.withTime((int) (byte) 1, 0, 5, (int) (byte) 100);
        boolean boolean49 = localDateTime24.isBefore((org.joda.time.ReadablePartial) localDateTime48);
        org.joda.time.LocalDateTime.Property property50 = localDateTime48.weekyear();
        int int51 = property50.getLeapAmount();
        org.joda.time.LocalDateTime localDateTime53 = property50.addWrapFieldToCopy(45);
        int int54 = property50.get();
        org.joda.time.DateTimeZone dateTimeZone56 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology57 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone56);
        org.joda.time.DurationField durationField58 = islamicChronology57.weekyears();
        org.joda.time.DurationField durationField59 = islamicChronology57.months();
        org.joda.time.DurationField durationField60 = islamicChronology57.centuries();
        org.joda.time.DateTimeField dateTimeField61 = islamicChronology57.clockhourOfHalfday();
        boolean boolean62 = property50.equals((java.lang.Object) dateTimeField61);
        org.joda.time.DurationField durationField63 = property50.getLeapDurationField();
        java.util.Locale locale66 = new java.util.Locale("\u65e5\u672c", "0099-01-01T01:00:00.001");
        java.lang.String str67 = locale66.getScript();
        java.lang.String str68 = locale66.getDisplayVariant();
        int int69 = property50.getMaximumShortTextLength(locale66);
        org.joda.time.LocalDateTime localDateTime70 = property50.roundCeilingCopy();
        boolean boolean71 = islamicChronology2.equals((java.lang.Object) localDateTime70);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField10 and durationField63", (durationField10.compareTo(durationField63) == 0) == durationField10.equals(durationField63));
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test649");
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
        org.joda.time.DateTimeField dateTimeField32 = islamicChronology2.minuteOfHour();
        org.joda.time.DurationField durationField33 = islamicChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField34 = islamicChronology2.halfdayOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField33", (durationField4.compareTo(durationField33) == 0) == durationField4.equals(durationField33));
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test650");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.DateTime dateTime2 = localDateTime1.toDateTime();
        int int3 = localDateTime1.getWeekOfWeekyear();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.millisOfDay();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.plus(readableDuration5);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.yearOfEra();
        int[] intArray8 = localDateTime6.getValues();
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((long) 1);
        int int11 = localDateTime10.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime10.plusMinutes(1);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology16 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone15);
        org.joda.time.DurationField durationField17 = islamicChronology16.weekyears();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology20 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone19);
        boolean boolean22 = dateTimeZone19.equals((java.lang.Object) 10L);
        org.joda.time.Chronology chronology23 = islamicChronology16.withZone(dateTimeZone19);
        org.joda.time.DateTimeField dateTimeField24 = islamicChronology16.hourOfHalfday();
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime((long) 1);
        int int27 = localDateTime26.getHourOfDay();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology30 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone29);
        org.joda.time.DateTimeField dateTimeField31 = islamicChronology30.weekyear();
        org.joda.time.ReadablePartial readablePartial32 = null;
        int[] intArray39 = new int[] { (short) 100, 10, 100, (short) -1, (byte) 10 };
        int[] intArray41 = dateTimeField31.addWrapPartial(readablePartial32, 100, intArray39, (int) (short) 0);
        int int42 = dateTimeField24.getMaximumValue((org.joda.time.ReadablePartial) localDateTime26, intArray39);
        org.joda.time.LocalDateTime localDateTime44 = new org.joda.time.LocalDateTime((long) 1);
        int int45 = localDateTime44.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime47 = localDateTime44.minusHours((int) (byte) -1);
        int int49 = localDateTime44.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime51 = localDateTime44.withMillisOfSecond((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime52 = localDateTime26.withFields((org.joda.time.ReadablePartial) localDateTime51);
        int int53 = localDateTime52.getEra();
        org.joda.time.LocalDateTime localDateTime55 = localDateTime52.minusMillis(365);
        org.joda.time.LocalDateTime localDateTime56 = localDateTime13.withFields((org.joda.time.ReadablePartial) localDateTime55);
        org.joda.time.LocalDateTime localDateTime57 = localDateTime6.withFields((org.joda.time.ReadablePartial) localDateTime13);
        org.joda.time.DateTimeZone dateTimeZone59 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology60 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone59);
        org.joda.time.DateTimeField dateTimeField61 = islamicChronology60.weekyear();
        org.joda.time.DurationField durationField62 = islamicChronology60.years();
        org.joda.time.DateTimeField dateTimeField63 = islamicChronology60.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField64 = islamicChronology60.hourOfDay();
        org.joda.time.DateTimeField dateTimeField65 = islamicChronology60.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField66 = islamicChronology60.weekyear();
        org.joda.time.DateTimeField dateTimeField67 = islamicChronology60.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType68 = dateTimeField67.getType();
        boolean boolean69 = localDateTime13.isSupported(dateTimeFieldType68);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField17 and durationField62", (durationField17.compareTo(durationField62) == 0) == durationField17.equals(durationField62));
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test651");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.util.Locale locale1 = java.util.Locale.JAPAN;
        java.lang.String str2 = locale1.getISO3Country();
        java.lang.String str3 = locale0.getDisplayCountry(locale1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology6 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone5);
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology6.yearOfCentury();
        org.joda.time.DurationField durationField8 = islamicChronology6.years();
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
        int[] intArray25 = islamicChronology6.get((org.joda.time.ReadablePartial) localDateTime19, (long) 0);
        org.joda.time.DateTimeField dateTimeField26 = islamicChronology6.hourOfDay();
        java.util.Locale locale28 = java.util.Locale.FRANCE;
        java.lang.String str29 = locale28.getCountry();
        java.lang.String str30 = dateTimeField26.getAsShortText((-306028799989L), locale28);
        java.lang.String str31 = locale28.getVariant();
        java.lang.String str32 = locale1.getDisplayLanguage(locale28);
        java.util.Set<java.lang.String> strSet33 = locale28.getUnicodeLocaleKeys();
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology36 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone35);
        org.joda.time.DurationField durationField37 = islamicChronology36.weekyears();
        org.joda.time.DurationField durationField38 = islamicChronology36.halfdays();
        org.joda.time.DateTimeField dateTimeField39 = islamicChronology36.yearOfEra();
        org.joda.time.DateTimeField dateTimeField40 = islamicChronology36.clockhourOfDay();
        int int41 = dateTimeField40.getMaximumValue();
        org.joda.time.DurationField durationField42 = dateTimeField40.getLeapDurationField();
        long long44 = dateTimeField40.roundHalfEven((long) (short) 10);
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
        int int61 = localDateTime55.getMillisOfDay();
        org.joda.time.LocalDateTime.Property property62 = localDateTime55.yearOfCentury();
        java.lang.String str63 = property62.getAsShortText();
        org.joda.time.LocalDateTime localDateTime65 = property62.addToCopy((int) ' ');
        org.joda.time.LocalDateTime localDateTime67 = localDateTime65.minusHours(2000);
        java.util.Locale locale69 = java.util.Locale.ENGLISH;
        java.lang.String str70 = locale69.getDisplayLanguage();
        java.util.Set<java.lang.String> strSet71 = locale69.getUnicodeLocaleAttributes();
        java.lang.String str72 = dateTimeField40.getAsShortText((org.joda.time.ReadablePartial) localDateTime67, 7200000, locale69);
        java.lang.String str73 = locale28.getDisplayScript(locale69);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField8 and durationField37", (durationField8.compareTo(durationField37) == 0) == durationField8.equals(durationField37));
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test652");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology2.weekyear();
        org.joda.time.DurationField durationField4 = islamicChronology2.years();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology2.hourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology2.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology2.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology2.minuteOfDay();
        org.joda.time.DurationField durationField10 = islamicChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology2.weekOfWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField10", (durationField4.compareTo(durationField10) == 0) == durationField4.equals(durationField10));
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test653");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.weekyear();
        org.joda.time.DurationField durationField5 = islamicChronology3.years();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology3.secondOfDay();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((long) 45, (org.joda.time.Chronology) islamicChronology3);
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology3.minuteOfHour();
        long long12 = islamicChronology3.add((-42068116800001L), (long) 360000000, 17);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology15 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone14);
        org.joda.time.DurationField durationField16 = islamicChronology15.weekyears();
        org.joda.time.DurationField durationField17 = islamicChronology15.months();
        org.joda.time.DurationField durationField18 = islamicChronology15.centuries();
        org.joda.time.DurationField durationField19 = islamicChronology15.centuries();
        org.joda.time.DateTimeField dateTimeField20 = islamicChronology15.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone21 = islamicChronology15.getZone();
        boolean boolean22 = dateTimeZone21.isFixed();
        org.joda.time.Chronology chronology23 = islamicChronology3.withZone(dateTimeZone21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField16", (durationField5.compareTo(durationField16) == 0) == durationField5.equals(durationField16));
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test654");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        int int2 = localDateTime1.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.minusHours((int) (byte) -1);
        org.joda.time.DateTimeField[] dateTimeFieldArray5 = localDateTime4.getFields();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.minusDays(4);
        org.joda.time.DateTime dateTime8 = localDateTime7.toDateTime();
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
        org.joda.time.DateTimeZone dateTimeZone33 = islamicChronology11.getZone();
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime((long) 1);
        int int36 = localDateTime35.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime38 = localDateTime35.minusHours((int) (byte) -1);
        int int40 = localDateTime35.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime42 = localDateTime35.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod43 = null;
        org.joda.time.LocalDateTime localDateTime44 = localDateTime35.minus(readablePeriod43);
        int int45 = localDateTime44.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField47 = localDateTime44.getField(0);
        org.joda.time.LocalDateTime.Property property48 = localDateTime44.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime50 = localDateTime44.withMonthOfYear((int) (short) 10);
        boolean boolean51 = dateTimeZone33.isLocalDateTimeGap(localDateTime44);
        org.joda.time.LocalDateTime.Property property52 = localDateTime44.yearOfEra();
        org.joda.time.LocalDateTime localDateTime54 = property52.addToCopy((int) 'x');
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
        org.joda.time.Instant instant76 = dateTime72.toInstant();
        org.joda.time.DateTime dateTime77 = localDateTime54.toDateTime((org.joda.time.ReadableInstant) instant76);
        boolean boolean78 = dateTime8.isAfter((org.joda.time.ReadableInstant) dateTime77);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime63 and instant76", (dateTime63.compareTo(instant76) == 0) == dateTime63.equals(instant76));
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test655");
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
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime((long) 1);
        int int24 = localDateTime23.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime26 = localDateTime23.withYear((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        org.joda.time.LocalDateTime localDateTime29 = localDateTime26.withPeriodAdded(readablePeriod27, 10);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime29.withDayOfYear(11);
        int int32 = localDateTime8.compareTo((org.joda.time.ReadablePartial) localDateTime29);
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology35 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone34);
        org.joda.time.DurationField durationField36 = islamicChronology35.weekyears();
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology39 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone38);
        boolean boolean41 = dateTimeZone38.equals((java.lang.Object) 10L);
        org.joda.time.Chronology chronology42 = islamicChronology35.withZone(dateTimeZone38);
        org.joda.time.ReadablePeriod readablePeriod43 = null;
        long long46 = islamicChronology35.add(readablePeriod43, (long) (byte) 0, (-1));
        org.joda.time.DateTimeField dateTimeField47 = islamicChronology35.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField48 = islamicChronology35.clockhourOfHalfday();
        org.joda.time.DurationField durationField49 = islamicChronology35.days();
        org.joda.time.DurationField durationField50 = islamicChronology35.weeks();
        org.joda.time.DurationField durationField51 = islamicChronology35.seconds();
        org.joda.time.DurationField durationField52 = islamicChronology35.millis();
        org.joda.time.DurationFieldType durationFieldType53 = durationField52.getType();
        org.joda.time.LocalDateTime localDateTime55 = localDateTime29.withFieldAdded(durationFieldType53, 24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField36", (durationField4.compareTo(durationField36) == 0) == durationField4.equals(durationField36));
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test656");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology2.yearOfEra();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology2.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology2.monthOfYear();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology2.weekOfWeekyear();
        org.joda.time.DurationField durationField9 = islamicChronology2.centuries();
        org.joda.time.DurationField durationField10 = islamicChronology2.weeks();
        org.joda.time.DurationField durationField11 = islamicChronology2.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField11, durationField3, and durationField9", !(durationField11.compareTo(durationField3) == 0) || (Math.signum(durationField11.compareTo(durationField9)) == Math.signum(durationField3.compareTo(durationField9))));
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test657");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DurationField durationField4 = islamicChronology2.months();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.minuteOfHour();
        org.joda.time.DurationField durationField6 = islamicChronology2.hours();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology2.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 0);
        org.joda.time.Chronology chronology10 = islamicChronology2.withZone(dateTimeZone9);
        java.lang.String str12 = dateTimeZone9.getShortName(100L);
        org.joda.time.chrono.IslamicChronology islamicChronology13 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone9);
        org.joda.time.DurationField durationField14 = islamicChronology13.weeks();
        org.joda.time.DateTimeField dateTimeField15 = islamicChronology13.minuteOfHour();
        org.joda.time.DurationField durationField16 = islamicChronology13.weekyears();
        org.joda.time.Chronology chronology17 = islamicChronology13.withUTC();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField16", (durationField3.compareTo(durationField16) == 0) == durationField3.equals(durationField16));
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test658");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology2.hourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.millisOfSecond();
        java.lang.String str6 = islamicChronology2.toString();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology2.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology2.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology11 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone10);
        org.joda.time.DurationField durationField12 = islamicChronology11.weekyears();
        org.joda.time.DateTimeField dateTimeField13 = islamicChronology11.yearOfEra();
        long long15 = dateTimeField13.roundCeiling(0L);
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime((long) 1);
        int int18 = localDateTime17.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime17.minusHours((int) (byte) -1);
        int int21 = localDateTime17.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime23 = localDateTime17.withMinuteOfHour((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime17.plusHours((int) (byte) 100);
        org.joda.time.ReadableDuration readableDuration26 = null;
        org.joda.time.LocalDateTime localDateTime27 = localDateTime17.minus(readableDuration26);
        java.util.Locale locale28 = java.util.Locale.PRC;
        java.util.Locale locale29 = locale28.stripExtensions();
        java.lang.String str30 = dateTimeField13.getAsShortText((org.joda.time.ReadablePartial) localDateTime27, locale28);
        org.joda.time.ReadablePeriod readablePeriod31 = null;
        org.joda.time.LocalDateTime localDateTime32 = localDateTime27.plus(readablePeriod31);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime32.plusYears(100);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime32.plusMillis(4);
        org.joda.time.LocalDateTime localDateTime38 = localDateTime32.withYear((int) (byte) 0);
        int[] intArray40 = islamicChronology2.get((org.joda.time.ReadablePartial) localDateTime32, (-3599997L));
        org.joda.time.LocalDateTime localDateTime42 = localDateTime32.plusDays(205600);
        org.joda.time.LocalDateTime localDateTime44 = new org.joda.time.LocalDateTime((long) 1);
        int int45 = localDateTime44.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime47 = localDateTime44.minusHours((int) (byte) -1);
        org.joda.time.DateTimeField[] dateTimeFieldArray48 = localDateTime47.getFields();
        org.joda.time.LocalDateTime localDateTime50 = localDateTime47.withYearOfCentury(10);
        org.joda.time.ReadablePeriod readablePeriod51 = null;
        org.joda.time.LocalDateTime localDateTime52 = localDateTime47.minus(readablePeriod51);
        int int53 = localDateTime52.getDayOfWeek();
        org.joda.time.DateTimeField[] dateTimeFieldArray54 = localDateTime52.getFields();
        int int55 = localDateTime42.compareTo((org.joda.time.ReadablePartial) localDateTime52);
        org.joda.time.LocalDateTime localDateTime57 = localDateTime42.plusWeeks(0);
        org.joda.time.DateTimeZone dateTimeZone59 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology60 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone59);
        org.joda.time.DateTimeField dateTimeField61 = islamicChronology60.yearOfCentury();
        org.joda.time.DurationField durationField62 = islamicChronology60.years();
        org.joda.time.LocalDateTime localDateTime64 = new org.joda.time.LocalDateTime((long) 1);
        int int65 = localDateTime64.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime67 = localDateTime64.minusHours((int) (byte) -1);
        int int69 = localDateTime64.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime71 = localDateTime64.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod72 = null;
        org.joda.time.LocalDateTime localDateTime73 = localDateTime64.minus(readablePeriod72);
        int int74 = localDateTime73.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField76 = localDateTime73.getField(0);
        org.joda.time.LocalDateTime.Property property77 = localDateTime73.centuryOfEra();
        int[] intArray79 = islamicChronology60.get((org.joda.time.ReadablePartial) localDateTime73, (long) 0);
        org.joda.time.DateTimeField dateTimeField80 = islamicChronology60.millisOfDay();
        org.joda.time.DurationField durationField81 = islamicChronology60.centuries();
        org.joda.time.DateTimeField dateTimeField82 = islamicChronology60.dayOfYear();
        org.joda.time.DateTimeField dateTimeField83 = islamicChronology60.monthOfYear();
        org.joda.time.DurationField durationField84 = islamicChronology60.halfdays();
        org.joda.time.DateTimeField dateTimeField85 = islamicChronology60.dayOfWeek();
        boolean boolean86 = localDateTime57.equals((java.lang.Object) dateTimeField85);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField62", (durationField3.compareTo(durationField62) == 0) == durationField3.equals(durationField62));
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test659");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = islamicChronology2.weekyears();
        org.joda.time.DurationField durationField5 = islamicChronology2.eras();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology2.clockhourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField4 and durationField5", Math.signum(durationField4.compareTo(durationField5)) == -Math.signum(durationField5.compareTo(durationField4)));
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test660");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology6 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone5);
        boolean boolean8 = dateTimeZone5.equals((java.lang.Object) 10L);
        org.joda.time.Chronology chronology9 = islamicChronology2.withZone(dateTimeZone5);
        org.joda.time.DurationField durationField10 = chronology9.eras();
        org.joda.time.DateTimeField dateTimeField11 = chronology9.era();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField10", Math.signum(durationField3.compareTo(durationField10)) == -Math.signum(durationField10.compareTo(durationField3)));
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test661");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DurationField durationField4 = islamicChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.yearOfEra();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology2.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology2.weekyear();
        org.joda.time.DurationField durationField8 = islamicChronology2.days();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology2.minuteOfDay();
        org.joda.time.DurationField durationField10 = islamicChronology2.years();
        org.joda.time.DurationField durationField11 = islamicChronology2.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField10", (durationField3.compareTo(durationField10) == 0) == durationField3.equals(durationField10));
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test662");
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
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test663");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        java.lang.String str3 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology4 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(100, (int) (short) 10, (int) (short) 10, (int) (byte) 0, 0, (int) ' ');
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.plus(readableDuration12);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.plus(readablePeriod14);
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime((long) 1);
        int int18 = localDateTime17.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime17.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology23 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone22);
        org.joda.time.DateTime dateTime24 = localDateTime17.toDateTime(dateTimeZone22);
        long long25 = dateTime24.getMillis();
        org.joda.time.DateTime dateTime26 = localDateTime13.toDateTime((org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology29 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone28);
        org.joda.time.DateTimeField dateTimeField30 = islamicChronology29.yearOfCentury();
        org.joda.time.DurationField durationField31 = islamicChronology29.years();
        org.joda.time.DurationField durationField32 = islamicChronology29.halfdays();
        org.joda.time.DateTimeField dateTimeField33 = islamicChronology29.hourOfHalfday();
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime((long) 1);
        int int36 = localDateTime35.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime38 = localDateTime35.minusHours((int) (byte) -1);
        int int39 = localDateTime35.getSecondOfMinute();
        int[] intArray46 = new int[] { 292278993, ' ', (short) 1, (short) -1, (byte) -1 };
        int[] intArray48 = dateTimeField33.set((org.joda.time.ReadablePartial) localDateTime35, (int) (byte) 0, intArray46, 10);
        islamicChronology4.validate((org.joda.time.ReadablePartial) localDateTime13, intArray46);
        org.joda.time.ReadableDuration readableDuration50 = null;
        org.joda.time.LocalDateTime localDateTime51 = localDateTime13.minus(readableDuration50);
        org.joda.time.LocalDateTime localDateTime53 = localDateTime51.plusSeconds(8);
        int int54 = localDateTime51.size();
        org.joda.time.DateTimeZone dateTimeZone56 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology57 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone56);
        int int58 = islamicChronology57.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField59 = islamicChronology57.weekyear();
        org.joda.time.DurationField durationField60 = islamicChronology57.hours();
        org.joda.time.DateTimeField dateTimeField61 = islamicChronology57.millisOfDay();
        org.joda.time.DateTimeField dateTimeField62 = islamicChronology57.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField63 = islamicChronology57.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone66 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology67 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone66);
        org.joda.time.DurationField durationField68 = islamicChronology67.weekyears();
        org.joda.time.DurationField durationField69 = islamicChronology67.months();
        org.joda.time.DateTimeField dateTimeField70 = islamicChronology67.minuteOfHour();
        org.joda.time.DurationField durationField71 = islamicChronology67.hours();
        org.joda.time.DateTimeField dateTimeField72 = islamicChronology67.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone74 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 0);
        org.joda.time.Chronology chronology75 = islamicChronology67.withZone(dateTimeZone74);
        java.util.Locale locale77 = java.util.Locale.CANADA;
        java.lang.String str78 = dateTimeZone74.getShortName((long) 11, locale77);
        org.joda.time.DateTimeZone dateTimeZone80 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology81 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone80);
        boolean boolean83 = dateTimeZone80.equals((java.lang.Object) 10L);
        java.util.Locale locale85 = java.util.Locale.JAPAN;
        java.lang.String str86 = locale85.getISO3Country();
        java.lang.String str87 = dateTimeZone80.getShortName(1970L, locale85);
        java.lang.String str88 = locale77.getDisplayLanguage(locale85);
        java.lang.String str89 = dateTimeField63.getAsShortText((long) (short) 0, locale77);
        boolean boolean90 = localDateTime51.equals((java.lang.Object) locale77);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField31 and durationField68", (durationField31.compareTo(durationField68) == 0) == durationField31.equals(durationField68));
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test664");
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
        org.joda.time.LocalDateTime localDateTime26 = localDateTime23.withYear((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        org.joda.time.LocalDateTime localDateTime29 = localDateTime26.withPeriodAdded(readablePeriod27, 10);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime29.withDayOfYear(11);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime31.withYear(10);
        org.joda.time.DateTime dateTime34 = localDateTime31.toDateTime();
        long long35 = dateTime34.getMillis();
        java.lang.String str36 = dateTime34.toString();
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology39 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone38);
        org.joda.time.DurationField durationField40 = islamicChronology39.weekyears();
        org.joda.time.DurationField durationField41 = islamicChronology39.months();
        org.joda.time.DateTimeField dateTimeField42 = islamicChronology39.halfdayOfDay();
        long long44 = dateTimeField42.roundHalfEven((-3599999L));
        org.joda.time.DateTimeFieldType dateTimeFieldType45 = dateTimeField42.getType();
        boolean boolean46 = dateTime34.equals((java.lang.Object) dateTimeField42);
        boolean boolean47 = dateTime17.equals((java.lang.Object) dateTimeField42);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and instant21", (dateTime8.compareTo(instant21) == 0) == dateTime8.equals(instant21));
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test665");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DurationField durationField4 = islamicChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.yearOfEra();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology2.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology2.weekyear();
        org.joda.time.DurationField durationField8 = islamicChronology2.days();
        org.joda.time.DurationField durationField9 = islamicChronology2.days();
        org.joda.time.DurationField durationField10 = islamicChronology2.years();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology2.weekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField10", (durationField3.compareTo(durationField10) == 0) == durationField3.equals(durationField10));
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test666");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DurationField durationField4 = islamicChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.yearOfEra();
        org.joda.time.DurationField durationField6 = islamicChronology2.months();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology2.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology2.year();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology11 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone10);
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology11.weekyear();
        org.joda.time.DurationField durationField13 = islamicChronology11.years();
        org.joda.time.DateTimeField dateTimeField14 = islamicChronology11.secondOfDay();
        org.joda.time.DateTimeField dateTimeField15 = islamicChronology11.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField16 = islamicChronology11.millisOfDay();
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime((long) 1);
        int int19 = localDateTime18.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime18.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology24 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone23);
        org.joda.time.DateTime dateTime25 = localDateTime18.toDateTime(dateTimeZone23);
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime((long) 1);
        int int28 = localDateTime27.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime30 = localDateTime27.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology33 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone32);
        org.joda.time.DateTime dateTime34 = localDateTime27.toDateTime(dateTimeZone32);
        long long35 = dateTime34.getMillis();
        boolean boolean36 = dateTime25.isAfter((org.joda.time.ReadableInstant) dateTime34);
        org.joda.time.DateTimeZone dateTimeZone37 = dateTime25.getZone();
        org.joda.time.LocalDateTime localDateTime38 = org.joda.time.LocalDateTime.now(dateTimeZone37);
        org.joda.time.ReadablePeriod readablePeriod39 = null;
        org.joda.time.LocalDateTime localDateTime40 = localDateTime38.minus(readablePeriod39);
        int int41 = dateTimeField16.getMaximumValue((org.joda.time.ReadablePartial) localDateTime40);
        org.joda.time.LocalDateTime localDateTime43 = localDateTime40.minusWeeks(0);
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology46 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone45);
        org.joda.time.DurationField durationField47 = islamicChronology46.weekyears();
        org.joda.time.DateTimeField dateTimeField48 = islamicChronology46.yearOfEra();
        org.joda.time.DateTimeField dateTimeField49 = islamicChronology46.dayOfYear();
        org.joda.time.DateTimeField dateTimeField50 = islamicChronology46.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField51 = islamicChronology46.monthOfYear();
        org.joda.time.DurationField durationField52 = islamicChronology46.weeks();
        org.joda.time.DateTimeZone dateTimeZone54 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology55 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone54);
        boolean boolean57 = dateTimeZone54.equals((java.lang.Object) 10L);
        java.util.Locale locale59 = java.util.Locale.JAPAN;
        java.lang.String str60 = locale59.getISO3Country();
        java.lang.String str61 = dateTimeZone54.getShortName(1970L, locale59);
        org.joda.time.LocalDateTime localDateTime62 = new org.joda.time.LocalDateTime(dateTimeZone54);
        org.joda.time.LocalDateTime localDateTime69 = new org.joda.time.LocalDateTime(100, (int) (short) 10, (int) (short) 10, (int) (byte) 0, 0, (int) ' ');
        int int70 = localDateTime69.getCenturyOfEra();
        org.joda.time.LocalDateTime.Property property71 = localDateTime69.hourOfDay();
        org.joda.time.LocalDateTime localDateTime73 = new org.joda.time.LocalDateTime((long) 1);
        int int74 = localDateTime73.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime76 = localDateTime73.withYear((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod77 = null;
        org.joda.time.LocalDateTime localDateTime79 = localDateTime76.withPeriodAdded(readablePeriod77, 10);
        org.joda.time.LocalDateTime localDateTime81 = localDateTime79.withDayOfYear(11);
        org.joda.time.Chronology chronology82 = localDateTime81.getChronology();
        org.joda.time.DateTimeFieldType dateTimeFieldType84 = localDateTime81.getFieldType((int) (byte) 0);
        boolean boolean85 = localDateTime69.isSupported(dateTimeFieldType84);
        boolean boolean86 = dateTimeZone54.equals((java.lang.Object) localDateTime69);
        int[] intArray88 = islamicChronology46.get((org.joda.time.ReadablePartial) localDateTime69, 296L);
        islamicChronology2.validate((org.joda.time.ReadablePartial) localDateTime40, intArray88);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField13", (durationField3.compareTo(durationField13) == 0) == durationField3.equals(durationField13));
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test667");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DurationField durationField4 = islamicChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.yearOfEra();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology2.minuteOfHour();
        org.joda.time.DurationField durationField7 = islamicChronology2.centuries();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology2.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology2.hourOfHalfday();
        org.joda.time.DurationField durationField10 = islamicChronology2.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField10, durationField3, and durationField4", !(durationField10.compareTo(durationField3) == 0) || (Math.signum(durationField10.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test668");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology2.hourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.millisOfSecond();
        java.lang.String str6 = islamicChronology2.toString();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology2.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology2.secondOfDay();
        org.joda.time.DurationField durationField9 = islamicChronology2.eras();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology2.clockhourOfHalfday();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField9", Math.signum(durationField3.compareTo(durationField9)) == -Math.signum(durationField9.compareTo(durationField3)));
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
        org.joda.time.DurationField durationField6 = islamicChronology2.months();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology2.yearOfEra();
        org.joda.time.DurationField durationField8 = islamicChronology2.weekyears();
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((long) 1);
        int int11 = localDateTime10.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime10.minusHours((int) (byte) -1);
        int int14 = localDateTime10.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime10.minusMinutes((int) '#');
        org.joda.time.LocalDateTime localDateTime18 = localDateTime10.plusMonths((-1));
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.plusHours(3600000);
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime((long) 1);
        int int23 = localDateTime22.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime25 = localDateTime22.minusHours((int) (byte) -1);
        int int27 = localDateTime22.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime22.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod30 = null;
        org.joda.time.LocalDateTime localDateTime31 = localDateTime22.minus(readablePeriod30);
        org.joda.time.DateTimeField[] dateTimeFieldArray32 = localDateTime31.getFields();
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime((long) 1);
        int int35 = localDateTime34.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime37 = localDateTime34.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology40 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone39);
        org.joda.time.DurationField durationField41 = islamicChronology40.weekyears();
        org.joda.time.DurationField durationField42 = islamicChronology40.halfdays();
        org.joda.time.DateTimeField dateTimeField43 = islamicChronology40.yearOfEra();
        org.joda.time.DurationField durationField44 = islamicChronology40.halfdays();
        org.joda.time.DurationFieldType durationFieldType45 = durationField44.getType();
        boolean boolean46 = localDateTime34.isSupported(durationFieldType45);
        boolean boolean47 = localDateTime31.isSupported(durationFieldType45);
        org.joda.time.LocalDateTime localDateTime49 = localDateTime20.withFieldAdded(durationFieldType45, 0);
        long long51 = islamicChronology2.set((org.joda.time.ReadablePartial) localDateTime20, (-418284L));
        org.joda.time.DurationField durationField52 = islamicChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField53 = islamicChronology2.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone54 = islamicChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField55 = islamicChronology2.year();
        org.joda.time.DateTimeZone dateTimeZone57 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology58 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone57);
        org.joda.time.DateTimeField dateTimeField59 = islamicChronology58.weekyear();
        org.joda.time.DurationField durationField60 = islamicChronology58.years();
        org.joda.time.DateTimeField dateTimeField61 = islamicChronology58.secondOfDay();
        org.joda.time.DateTimeField dateTimeField62 = islamicChronology58.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField63 = islamicChronology58.millisOfDay();
        org.joda.time.LocalDateTime localDateTime65 = new org.joda.time.LocalDateTime((long) 1);
        int int66 = localDateTime65.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime68 = localDateTime65.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone70 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology71 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone70);
        org.joda.time.DateTime dateTime72 = localDateTime65.toDateTime(dateTimeZone70);
        org.joda.time.LocalDateTime localDateTime74 = new org.joda.time.LocalDateTime((long) 1);
        int int75 = localDateTime74.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime77 = localDateTime74.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone79 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology80 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone79);
        org.joda.time.DateTime dateTime81 = localDateTime74.toDateTime(dateTimeZone79);
        long long82 = dateTime81.getMillis();
        boolean boolean83 = dateTime72.isAfter((org.joda.time.ReadableInstant) dateTime81);
        org.joda.time.DateTimeZone dateTimeZone84 = dateTime72.getZone();
        org.joda.time.LocalDateTime localDateTime85 = org.joda.time.LocalDateTime.now(dateTimeZone84);
        org.joda.time.ReadablePeriod readablePeriod86 = null;
        org.joda.time.LocalDateTime localDateTime87 = localDateTime85.minus(readablePeriod86);
        int int88 = dateTimeField63.getMaximumValue((org.joda.time.ReadablePartial) localDateTime87);
        org.joda.time.LocalDateTime.Property property89 = localDateTime87.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime91 = property89.addWrapFieldToCopy(349200000);
        int int92 = localDateTime91.getDayOfYear();
        java.util.Locale locale93 = java.util.Locale.JAPAN;
        java.lang.String str94 = dateTimeField55.getAsText((org.joda.time.ReadablePartial) localDateTime91, locale93);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField60", (durationField3.compareTo(durationField60) == 0) == durationField3.equals(durationField60));
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test670");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology2.hourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.millisOfSecond();
        java.lang.String str6 = islamicChronology2.toString();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology2.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology2.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology11 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone10);
        org.joda.time.DurationField durationField12 = islamicChronology11.weekyears();
        org.joda.time.DateTimeField dateTimeField13 = islamicChronology11.yearOfEra();
        long long15 = dateTimeField13.roundCeiling(0L);
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime((long) 1);
        int int18 = localDateTime17.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime17.minusHours((int) (byte) -1);
        int int21 = localDateTime17.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime23 = localDateTime17.withMinuteOfHour((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime17.plusHours((int) (byte) 100);
        org.joda.time.ReadableDuration readableDuration26 = null;
        org.joda.time.LocalDateTime localDateTime27 = localDateTime17.minus(readableDuration26);
        java.util.Locale locale28 = java.util.Locale.PRC;
        java.util.Locale locale29 = locale28.stripExtensions();
        java.lang.String str30 = dateTimeField13.getAsShortText((org.joda.time.ReadablePartial) localDateTime27, locale28);
        org.joda.time.ReadablePeriod readablePeriod31 = null;
        org.joda.time.LocalDateTime localDateTime32 = localDateTime27.plus(readablePeriod31);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime32.plusYears(100);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime32.plusMillis(4);
        org.joda.time.LocalDateTime localDateTime38 = localDateTime32.withYear((int) (byte) 0);
        int[] intArray40 = islamicChronology2.get((org.joda.time.ReadablePartial) localDateTime32, (-3599997L));
        org.joda.time.DateTimeField dateTimeField41 = islamicChronology2.hourOfHalfday();
        org.joda.time.DurationField durationField42 = islamicChronology2.centuries();
        org.joda.time.DateTimeField dateTimeField43 = islamicChronology2.dayOfMonth();
        org.joda.time.DurationField durationField44 = islamicChronology2.years();
        org.joda.time.DurationField durationField45 = islamicChronology2.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField44", (durationField3.compareTo(durationField44) == 0) == durationField3.equals(durationField44));
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test671");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DurationField durationField4 = islamicChronology2.months();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.halfdayOfDay();
        org.joda.time.DurationField durationField6 = islamicChronology2.millis();
        java.lang.String str7 = islamicChronology2.toString();
        org.joda.time.DurationField durationField8 = islamicChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology2.millisOfDay();
        org.joda.time.DurationField durationField10 = islamicChronology2.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField10, durationField3, and durationField4", !(durationField10.compareTo(durationField3) == 0) || (Math.signum(durationField10.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test672");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DurationField durationField4 = islamicChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.yearOfEra();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology2.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology2.weekyearOfCentury();
        org.joda.time.DurationField durationField8 = islamicChronology2.months();
        org.joda.time.DurationField durationField9 = islamicChronology2.years();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology2.weekyearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField9", (durationField3.compareTo(durationField9) == 0) == durationField3.equals(durationField9));
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test673");
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
        org.joda.time.DateTimeZone dateTimeZone39 = islamicChronology2.getZone();
        org.joda.time.DurationField durationField40 = islamicChronology2.centuries();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType41 = islamicChronology2.getLeapYearPatternType();
        org.joda.time.DateTimeField dateTimeField42 = islamicChronology2.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime44 = new org.joda.time.LocalDateTime((long) 1);
        int int45 = localDateTime44.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime47 = localDateTime44.minusHours((int) (byte) -1);
        int int48 = localDateTime44.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime50 = localDateTime44.minusMinutes((int) '#');
        org.joda.time.DateTimeZone dateTimeZone52 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology53 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone52);
        org.joda.time.DurationField durationField54 = islamicChronology53.weekyears();
        org.joda.time.DurationField durationField55 = islamicChronology53.halfdays();
        org.joda.time.DateTimeField dateTimeField56 = islamicChronology53.yearOfEra();
        org.joda.time.DurationField durationField57 = islamicChronology53.halfdays();
        org.joda.time.DurationFieldType durationFieldType58 = durationField57.getType();
        org.joda.time.LocalDateTime localDateTime60 = localDateTime44.withFieldAdded(durationFieldType58, (int) (short) 0);
        org.joda.time.LocalDateTime localDateTime62 = localDateTime60.plusWeeks((-6));
        org.joda.time.tz.NameProvider nameProvider64 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale65 = java.util.Locale.getDefault();
        java.lang.String str68 = nameProvider64.getName(locale65, "JPN", "0");
        java.lang.String str69 = locale65.getVariant();
        java.lang.String str70 = dateTimeField42.getAsText((org.joda.time.ReadablePartial) localDateTime62, 3600003, locale65);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField18 and durationField54", (durationField18.compareTo(durationField54) == 0) == durationField18.equals(durationField54));
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test674");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = islamicChronology2.years();
        org.joda.time.DurationField durationField5 = islamicChronology2.halfdays();
        org.joda.time.DurationField durationField6 = islamicChronology2.seconds();
        java.util.Locale locale7 = java.util.Locale.ITALIAN;
        java.lang.String str8 = locale7.getDisplayLanguage();
        java.util.Set<java.lang.Character> charSet9 = locale7.getExtensionKeys();
        boolean boolean10 = islamicChronology2.equals((java.lang.Object) charSet9);
        org.joda.time.DurationField durationField11 = islamicChronology2.years();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology14 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone13);
        org.joda.time.DurationField durationField15 = islamicChronology14.weekyears();
        org.joda.time.DurationField durationField16 = islamicChronology14.millis();
        org.joda.time.DurationField durationField17 = islamicChronology14.hours();
        org.joda.time.DurationField durationField18 = islamicChronology14.centuries();
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime((long) 1);
        int int21 = localDateTime20.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime23 = localDateTime20.minusHours((int) (byte) -1);
        int int25 = localDateTime20.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime20.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.LocalDateTime localDateTime29 = localDateTime20.minus(readablePeriod28);
        org.joda.time.LocalDateTime.Property property30 = localDateTime20.millisOfSecond();
        long long31 = property30.remainder();
        java.lang.String str32 = property30.getName();
        java.util.Locale locale33 = java.util.Locale.CHINA;
        java.lang.String str34 = property30.getAsText(locale33);
        org.joda.time.LocalDateTime localDateTime35 = property30.withMinimumValue();
        boolean boolean37 = property30.equals((java.lang.Object) 59);
        org.joda.time.LocalDateTime localDateTime39 = new org.joda.time.LocalDateTime((long) 1);
        int int40 = localDateTime39.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime42 = localDateTime39.minusHours((int) (byte) -1);
        org.joda.time.DateTimeField[] dateTimeFieldArray43 = localDateTime42.getFields();
        org.joda.time.LocalDateTime localDateTime45 = localDateTime42.minusDays(4);
        org.joda.time.LocalDateTime localDateTime47 = new org.joda.time.LocalDateTime((long) 1);
        int int48 = localDateTime47.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime50 = localDateTime47.minusHours((int) (byte) -1);
        int int52 = localDateTime47.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime54 = localDateTime47.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod55 = null;
        org.joda.time.LocalDateTime localDateTime56 = localDateTime47.minus(readablePeriod55);
        int int57 = localDateTime56.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField59 = localDateTime56.getField(0);
        org.joda.time.LocalDateTime.Property property60 = localDateTime56.centuryOfEra();
        org.joda.time.LocalDateTime.Property property61 = localDateTime56.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime66 = localDateTime56.withTime((int) (byte) 1, 0, 5, (int) (byte) 100);
        boolean boolean67 = localDateTime42.isBefore((org.joda.time.ReadablePartial) localDateTime66);
        org.joda.time.LocalDateTime.Property property68 = localDateTime66.weekyear();
        boolean boolean69 = property30.equals((java.lang.Object) localDateTime66);
        org.joda.time.LocalDateTime localDateTime71 = new org.joda.time.LocalDateTime((long) 1);
        int int72 = localDateTime71.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime74 = localDateTime71.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone76 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology77 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone76);
        org.joda.time.DurationField durationField78 = islamicChronology77.weekyears();
        org.joda.time.DurationField durationField79 = islamicChronology77.halfdays();
        org.joda.time.DateTimeField dateTimeField80 = islamicChronology77.yearOfEra();
        org.joda.time.DurationField durationField81 = islamicChronology77.halfdays();
        org.joda.time.DurationFieldType durationFieldType82 = durationField81.getType();
        boolean boolean83 = localDateTime71.isSupported(durationFieldType82);
        org.joda.time.LocalDateTime localDateTime84 = localDateTime66.withFields((org.joda.time.ReadablePartial) localDateTime71);
        org.joda.time.ReadableDuration readableDuration85 = null;
        org.joda.time.LocalDateTime localDateTime86 = localDateTime66.minus(readableDuration85);
        long long88 = islamicChronology14.set((org.joda.time.ReadablePartial) localDateTime86, (long) 59);
        org.joda.time.LocalDateTime localDateTime90 = localDateTime86.plusMonths((int) (byte) 100);
        boolean boolean91 = islamicChronology2.equals((java.lang.Object) localDateTime86);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField15", (durationField4.compareTo(durationField15) == 0) == durationField4.equals(durationField15));
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test675");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DurationField durationField4 = islamicChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.yearOfCentury();
        org.joda.time.DurationField durationField6 = islamicChronology2.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField6, durationField3, and durationField4", !(durationField6.compareTo(durationField3) == 0) || (Math.signum(durationField6.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
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
        org.joda.time.DateTimeZone dateTimeZone24 = islamicChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField25 = islamicChronology2.dayOfWeek();
        org.joda.time.DurationField durationField26 = islamicChronology2.months();
        org.joda.time.DurationField durationField27 = islamicChronology2.months();
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.DateTime dateTime30 = localDateTime29.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology33 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone32);
        org.joda.time.DurationField durationField34 = islamicChronology33.weekyears();
        org.joda.time.DurationField durationField35 = islamicChronology33.months();
        org.joda.time.DateTimeField dateTimeField36 = islamicChronology33.minuteOfHour();
        org.joda.time.DurationField durationField37 = islamicChronology33.hours();
        org.joda.time.DateTimeField dateTimeField38 = islamicChronology33.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 0);
        org.joda.time.Chronology chronology41 = islamicChronology33.withZone(dateTimeZone40);
        java.lang.String str43 = dateTimeZone40.getShortName(100L);
        org.joda.time.chrono.IslamicChronology islamicChronology44 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone40);
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology47 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone46);
        org.joda.time.DurationField durationField48 = islamicChronology47.weekyears();
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology51 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone50);
        boolean boolean53 = dateTimeZone50.equals((java.lang.Object) 10L);
        org.joda.time.Chronology chronology54 = islamicChronology47.withZone(dateTimeZone50);
        java.lang.String str55 = dateTimeZone50.getID();
        org.joda.time.Chronology chronology56 = islamicChronology44.withZone(dateTimeZone50);
        boolean boolean57 = dateTimeZone50.isFixed();
        org.joda.time.DateTime dateTime58 = localDateTime29.toDateTime(dateTimeZone50);
        org.joda.time.Chronology chronology59 = islamicChronology2.withZone(dateTimeZone50);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField34", (durationField4.compareTo(durationField34) == 0) == durationField4.equals(durationField34));
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
        org.joda.time.DurationField durationField23 = islamicChronology2.centuries();
        org.joda.time.DateTimeZone dateTimeZone24 = islamicChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField25 = islamicChronology2.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime();
        int[] intArray28 = islamicChronology2.get((org.joda.time.ReadablePartial) localDateTime26, 10L);
        org.joda.time.DateTimeField dateTimeField29 = islamicChronology2.secondOfDay();
        org.joda.time.DateTimeField dateTimeField30 = islamicChronology2.era();
        org.joda.time.DateTimeField dateTimeField31 = islamicChronology2.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField32 = islamicChronology2.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology35 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone34);
        org.joda.time.DurationField durationField36 = islamicChronology35.weekyears();
        org.joda.time.DateTimeField dateTimeField37 = islamicChronology35.yearOfEra();
        org.joda.time.DurationField durationField38 = islamicChronology35.hours();
        org.joda.time.DateTimeZone dateTimeZone39 = islamicChronology35.getZone();
        org.joda.time.DateTimeField dateTimeField40 = islamicChronology35.dayOfYear();
        org.joda.time.DurationField durationField41 = islamicChronology35.halfdays();
        org.joda.time.DateTimeField dateTimeField42 = islamicChronology35.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField43 = islamicChronology35.clockhourOfDay();
        org.joda.time.LocalDateTime localDateTime45 = new org.joda.time.LocalDateTime((long) 1);
        int int46 = localDateTime45.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime48 = localDateTime45.minusHours((int) (byte) -1);
        int int50 = localDateTime45.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime52 = localDateTime45.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod53 = null;
        org.joda.time.LocalDateTime localDateTime54 = localDateTime45.minus(readablePeriod53);
        org.joda.time.LocalDateTime.Property property55 = localDateTime45.millisOfSecond();
        int int56 = localDateTime45.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime58 = localDateTime45.minusWeeks(10);
        int int59 = localDateTime45.getEra();
        int int60 = dateTimeField43.getMaximumValue((org.joda.time.ReadablePartial) localDateTime45);
        java.util.TimeZone timeZone62 = java.util.TimeZone.getTimeZone("");
        java.util.TimeZone timeZone64 = java.util.TimeZone.getTimeZone("");
        boolean boolean65 = timeZone62.hasSameRules(timeZone64);
        timeZone64.setRawOffset(11);
        org.joda.time.DateTimeZone dateTimeZone68 = org.joda.time.DateTimeZone.forTimeZone(timeZone64);
        java.util.TimeZone timeZone69 = dateTimeZone68.toTimeZone();
        org.joda.time.chrono.IslamicChronology islamicChronology70 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone68);
        org.joda.time.LocalDateTime localDateTime71 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime73 = localDateTime71.minusMinutes(0);
        org.joda.time.LocalDateTime localDateTime75 = localDateTime73.plusMinutes(100);
        org.joda.time.LocalDateTime localDateTime76 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime78 = localDateTime76.minusMinutes(0);
        org.joda.time.LocalDateTime localDateTime80 = localDateTime78.plusMinutes(100);
        int[] intArray81 = localDateTime78.getValues();
        islamicChronology70.validate((org.joda.time.ReadablePartial) localDateTime73, intArray81);
        int int83 = dateTimeField32.getMaximumValue((org.joda.time.ReadablePartial) localDateTime45, intArray81);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField36", (durationField4.compareTo(durationField36) == 0) == durationField4.equals(durationField36));
    }

    @Test
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test678");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DurationField durationField4 = islamicChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.yearOfEra();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology2.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology2.weekyearOfCentury();
        org.joda.time.DurationField durationField8 = islamicChronology2.months();
        org.joda.time.DurationField durationField9 = islamicChronology2.years();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology2.hourOfHalfday();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField9", (durationField3.compareTo(durationField9) == 0) == durationField3.equals(durationField9));
    }

    @Test
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test679");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology2.hourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.millisOfSecond();
        java.lang.String str6 = islamicChronology2.toString();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology2.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology2.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology2.clockhourOfHalfday();
        org.joda.time.DurationField durationField10 = islamicChronology2.years();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology13 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone12);
        org.joda.time.DateTimeField dateTimeField14 = islamicChronology13.yearOfCentury();
        org.joda.time.DurationField durationField15 = islamicChronology13.years();
        org.joda.time.DurationField durationField16 = islamicChronology13.halfdays();
        org.joda.time.DateTimeField dateTimeField17 = islamicChronology13.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField18 = islamicChronology13.dayOfYear();
        org.joda.time.DateTimeField dateTimeField19 = islamicChronology13.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField20 = islamicChronology13.weekyear();
        int int21 = dateTimeField20.getMaximumValue();
        boolean boolean22 = islamicChronology2.equals((java.lang.Object) int21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField10", (durationField3.compareTo(durationField10) == 0) == durationField3.equals(durationField10));
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test680");
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
        org.joda.time.DateTimeField dateTimeField24 = islamicChronology2.clockhourOfDay();
        org.joda.time.DurationField durationField25 = islamicChronology2.days();
        org.joda.time.DateTimeField dateTimeField26 = islamicChronology2.secondOfDay();
        org.joda.time.DurationField durationField27 = islamicChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField28 = islamicChronology2.minuteOfHour();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField27", (durationField4.compareTo(durationField27) == 0) == durationField4.equals(durationField27));
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
        org.joda.time.DateTimeField dateTimeField22 = islamicChronology2.millisOfDay();
        org.joda.time.DurationField durationField23 = islamicChronology2.centuries();
        org.joda.time.DateTimeField dateTimeField24 = islamicChronology2.dayOfYear();
        org.joda.time.DateTimeField dateTimeField25 = islamicChronology2.clockhourOfDay();
        org.joda.time.DurationField durationField26 = islamicChronology2.centuries();
        org.joda.time.DateTimeField dateTimeField27 = islamicChronology2.clockhourOfDay();
        java.lang.String str28 = islamicChronology2.toString();
        org.joda.time.DateTimeField dateTimeField29 = islamicChronology2.year();
        org.joda.time.DurationField durationField30 = islamicChronology2.seconds();
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology33 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone32);
        org.joda.time.DurationField durationField34 = islamicChronology33.weekyears();
        org.joda.time.DurationField durationField35 = islamicChronology33.weekyears();
        int int36 = durationField30.compareTo(durationField35);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField35", (durationField4.compareTo(durationField35) == 0) == durationField4.equals(durationField35));
    }

    @Test
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test682");
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
        java.util.Locale locale14 = java.util.Locale.CHINA;
        java.lang.String str15 = property11.getAsText(locale14);
        org.joda.time.LocalDateTime localDateTime16 = property11.withMinimumValue();
        java.lang.String str17 = property11.getAsShortText();
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime((long) 1);
        int int20 = localDateTime19.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime22 = localDateTime19.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology25 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone24);
        org.joda.time.DateTime dateTime26 = localDateTime19.toDateTime(dateTimeZone24);
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime((long) 1);
        int int29 = localDateTime28.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime31 = localDateTime28.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology34 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone33);
        org.joda.time.DateTime dateTime35 = localDateTime28.toDateTime(dateTimeZone33);
        long long36 = dateTime35.getMillis();
        boolean boolean37 = dateTime26.isAfter((org.joda.time.ReadableInstant) dateTime35);
        long long38 = dateTime35.getMillis();
        org.joda.time.Instant instant39 = dateTime35.toInstant();
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology42 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone41);
        boolean boolean44 = dateTimeZone41.equals((java.lang.Object) 10L);
        java.util.Locale locale46 = java.util.Locale.JAPAN;
        java.lang.String str47 = locale46.getISO3Country();
        java.lang.String str48 = dateTimeZone41.getShortName(1970L, locale46);
        java.util.TimeZone timeZone49 = dateTimeZone41.toTimeZone();
        long long52 = dateTimeZone41.convertLocalToUTC(2626841168L, false);
        boolean boolean53 = instant39.equals((java.lang.Object) false);
        int int54 = property11.getDifference((org.joda.time.ReadableInstant) instant39);
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
        org.joda.time.DateTimeZone dateTimeZone75 = dateTime72.getZone();
        java.lang.String str76 = dateTime72.toString();
        boolean boolean77 = instant39.isBefore((org.joda.time.ReadableInstant) dateTime72);
        org.joda.time.DateTimeZone dateTimeZone78 = instant39.getZone();
        java.util.TimeZone timeZone79 = dateTimeZone78.toTimeZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime26 and instant39", (dateTime26.compareTo(instant39) == 0) == dateTime26.equals(instant39));
    }

    @Test
    public void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test683");
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
        org.joda.time.DateTimeField dateTimeField26 = islamicChronology2.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField27 = islamicChronology2.dayOfYear();
        org.joda.time.DateTimeField dateTimeField28 = islamicChronology2.weekOfWeekyear();
        org.joda.time.DurationField durationField29 = islamicChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField30 = islamicChronology2.clockhourOfDay();
        org.joda.time.DurationField durationField31 = islamicChronology2.seconds();
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime((long) (-16703), dateTimeZone33);
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology37 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone36);
        org.joda.time.DurationField durationField38 = islamicChronology37.weekyears();
        org.joda.time.DurationField durationField39 = islamicChronology37.halfdays();
        org.joda.time.DateTimeField dateTimeField40 = islamicChronology37.yearOfEra();
        org.joda.time.DateTimeField dateTimeField41 = islamicChronology37.halfdayOfDay();
        org.joda.time.DurationField durationField42 = islamicChronology37.halfdays();
        org.joda.time.DateTimeZone dateTimeZone43 = islamicChronology37.getZone();
        java.lang.String str44 = islamicChronology37.toString();
        org.joda.time.LocalDateTime localDateTime46 = new org.joda.time.LocalDateTime((long) 1);
        int int47 = localDateTime46.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime49 = localDateTime46.minusHours((int) (byte) -1);
        int int50 = localDateTime46.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime52 = localDateTime46.minusMinutes((int) '#');
        org.joda.time.LocalDateTime.Property property53 = localDateTime52.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime54 = property53.roundCeilingCopy();
        int[] intArray56 = islamicChronology37.get((org.joda.time.ReadablePartial) localDateTime54, (long) 354);
        islamicChronology2.validate((org.joda.time.ReadablePartial) localDateTime34, intArray56);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField38", (durationField4.compareTo(durationField38) == 0) == durationField4.equals(durationField38));
    }

    @Test
    public void test684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test684");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((long) 1);
        int int6 = localDateTime5.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.minusHours((int) (byte) -1);
        int int9 = localDateTime5.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime5.minusMinutes((int) '#');
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.centuryOfEra();
        org.joda.time.DurationField durationField13 = property12.getRangeDurationField();
        org.joda.time.LocalDateTime localDateTime14 = property12.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime16 = property12.addWrapFieldToCopy((-3600000));
        org.joda.time.DateTime dateTime17 = localDateTime16.toDateTime();
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
        org.joda.time.LocalDateTime localDateTime43 = localDateTime41.withCenturyOfEra(101);
        org.joda.time.LocalDateTime localDateTime45 = new org.joda.time.LocalDateTime((long) 1);
        int int46 = localDateTime45.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime48 = localDateTime45.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology51 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone50);
        org.joda.time.DateTime dateTime52 = localDateTime45.toDateTime(dateTimeZone50);
        org.joda.time.LocalDateTime localDateTime54 = new org.joda.time.LocalDateTime((long) 1);
        int int55 = localDateTime54.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime57 = localDateTime54.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone59 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology60 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone59);
        org.joda.time.DateTime dateTime61 = localDateTime54.toDateTime(dateTimeZone59);
        long long62 = dateTime61.getMillis();
        boolean boolean63 = dateTime52.isAfter((org.joda.time.ReadableInstant) dateTime61);
        long long64 = dateTime61.getMillis();
        org.joda.time.Instant instant65 = dateTime61.toInstant();
        org.joda.time.DateTime dateTime66 = localDateTime43.toDateTime((org.joda.time.ReadableInstant) instant65);
        boolean boolean67 = dateTime17.isAfter((org.joda.time.ReadableInstant) instant65);
        int int68 = dateTimeZone0.getOffset((org.joda.time.ReadableInstant) dateTime17);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime52 and instant65", (dateTime52.compareTo(instant65) == 0) == dateTime52.equals(instant65));
    }

    @Test
    public void test685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test685");
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
        org.joda.time.DateTimeField dateTimeField28 = islamicChronology2.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField29 = islamicChronology2.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology32 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone31);
        org.joda.time.DurationField durationField33 = islamicChronology32.weekyears();
        org.joda.time.DurationField durationField34 = islamicChronology32.months();
        org.joda.time.DurationField durationField35 = islamicChronology32.centuries();
        org.joda.time.DateTimeZone dateTimeZone36 = islamicChronology32.getZone();
        org.joda.time.LocalDateTime localDateTime37 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) islamicChronology32);
        org.joda.time.LocalDateTime.Property property38 = localDateTime37.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime40 = new org.joda.time.LocalDateTime((long) 1);
        int int41 = localDateTime40.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime43 = localDateTime40.minusHours((int) (byte) -1);
        int int45 = localDateTime40.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime47 = localDateTime40.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod48 = null;
        org.joda.time.LocalDateTime localDateTime49 = localDateTime40.minus(readablePeriod48);
        int int50 = localDateTime49.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField52 = localDateTime49.getField(0);
        org.joda.time.LocalDateTime.Property property53 = localDateTime49.centuryOfEra();
        org.joda.time.LocalDateTime.Property property54 = localDateTime49.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime59 = localDateTime49.withTime((int) (byte) 1, 0, 5, (int) (byte) 100);
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
        org.joda.time.LocalDateTime.Property property75 = localDateTime70.millisOfSecond();
        org.joda.time.DateTimeFieldType dateTimeFieldType76 = property75.getFieldType();
        boolean boolean77 = localDateTime59.isSupported(dateTimeFieldType76);
        org.joda.time.LocalDateTime.Property property78 = localDateTime37.property(dateTimeFieldType76);
        long long80 = islamicChronology2.set((org.joda.time.ReadablePartial) localDateTime37, (-39490502367999L));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField33", (durationField4.compareTo(durationField33) == 0) == durationField4.equals(durationField33));
    }

    @Test
    public void test686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test686");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        int int2 = localDateTime1.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.minusHours((int) (byte) -1);
        int int5 = localDateTime1.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.minusMinutes((int) '#');
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.centuryOfEra();
        org.joda.time.DurationField durationField9 = property8.getRangeDurationField();
        org.joda.time.LocalDateTime localDateTime10 = property8.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime12 = property8.addWrapFieldToCopy((-3600000));
        org.joda.time.DateTime dateTime13 = localDateTime12.toDateTime();
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((long) 1);
        int int16 = localDateTime15.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime15.minusHours((int) (byte) -1);
        int int19 = localDateTime15.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime15.minusMinutes((int) '#');
        org.joda.time.LocalDateTime localDateTime23 = localDateTime15.plusMonths((-1));
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime((long) 1);
        int int26 = localDateTime25.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime28 = localDateTime25.minusHours((int) (byte) -1);
        int int29 = localDateTime25.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime31 = localDateTime25.minusMinutes((int) '#');
        org.joda.time.LocalDateTime.Property property32 = localDateTime31.centuryOfEra();
        java.lang.String str33 = property32.getAsShortText();
        org.joda.time.LocalDateTime localDateTime35 = property32.addToCopy((long) 70);
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = property32.getFieldType();
        int int37 = localDateTime15.get(dateTimeFieldType36);
        boolean boolean38 = dateTime13.isSupported(dateTimeFieldType36);
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology41 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone40);
        org.joda.time.DurationField durationField42 = islamicChronology41.weekyears();
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology45 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone44);
        boolean boolean47 = dateTimeZone44.equals((java.lang.Object) 10L);
        org.joda.time.Chronology chronology48 = islamicChronology41.withZone(dateTimeZone44);
        org.joda.time.DateTimeField dateTimeField49 = islamicChronology41.hourOfHalfday();
        org.joda.time.LocalDateTime localDateTime51 = new org.joda.time.LocalDateTime((long) 1);
        int int52 = localDateTime51.getHourOfDay();
        org.joda.time.DateTimeZone dateTimeZone54 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology55 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone54);
        org.joda.time.DateTimeField dateTimeField56 = islamicChronology55.weekyear();
        org.joda.time.ReadablePartial readablePartial57 = null;
        int[] intArray64 = new int[] { (short) 100, 10, 100, (short) -1, (byte) 10 };
        int[] intArray66 = dateTimeField56.addWrapPartial(readablePartial57, 100, intArray64, (int) (short) 0);
        int int67 = dateTimeField49.getMaximumValue((org.joda.time.ReadablePartial) localDateTime51, intArray64);
        org.joda.time.LocalDateTime.Property property68 = localDateTime51.era();
        org.joda.time.LocalDateTime localDateTime70 = new org.joda.time.LocalDateTime((long) 1);
        int int71 = localDateTime70.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime73 = localDateTime70.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone75 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology76 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone75);
        org.joda.time.DateTime dateTime77 = localDateTime70.toDateTime(dateTimeZone75);
        org.joda.time.ReadableInstant readableInstant78 = null;
        boolean boolean79 = dateTime77.isAfter(readableInstant78);
        org.joda.time.Instant instant80 = dateTime77.toInstant();
        org.joda.time.DateTime dateTime81 = localDateTime51.toDateTime((org.joda.time.ReadableInstant) dateTime77);
        boolean boolean82 = dateTime13.isAfter((org.joda.time.ReadableInstant) dateTime81);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime77 and instant80", (dateTime77.compareTo(instant80) == 0) == dateTime77.equals(instant80));
    }

    @Test
    public void test687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test687");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        int int2 = localDateTime1.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology7 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone6);
        org.joda.time.DateTime dateTime8 = localDateTime1.toDateTime(dateTimeZone6);
        long long9 = dateTime8.getMillis();
        long long10 = dateTime8.getMillis();
        org.joda.time.Instant instant11 = dateTime8.toInstant();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology14 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone13);
        org.joda.time.DurationField durationField15 = islamicChronology14.weekyears();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology18 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone17);
        boolean boolean20 = dateTimeZone17.equals((java.lang.Object) 10L);
        org.joda.time.Chronology chronology21 = islamicChronology14.withZone(dateTimeZone17);
        org.joda.time.DateTimeField dateTimeField22 = islamicChronology14.hourOfHalfday();
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime(0L);
        int int25 = localDateTime24.getYearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology28 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone27);
        org.joda.time.DateTimeField dateTimeField29 = islamicChronology28.weekyear();
        org.joda.time.ReadablePartial readablePartial30 = null;
        int[] intArray37 = new int[] { (short) 100, 10, 100, (short) -1, (byte) 10 };
        int[] intArray39 = dateTimeField29.addWrapPartial(readablePartial30, 100, intArray37, (int) (short) 0);
        int int41 = dateTimeField29.getMinimumValue((long) (short) 0);
        org.joda.time.LocalDateTime localDateTime43 = new org.joda.time.LocalDateTime((long) 1);
        int int44 = localDateTime43.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime46 = localDateTime43.withYear((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod47 = null;
        org.joda.time.LocalDateTime localDateTime49 = localDateTime46.withPeriodAdded(readablePeriod47, 10);
        org.joda.time.LocalDateTime localDateTime51 = localDateTime46.plusSeconds((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology54 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone53);
        org.joda.time.DateTimeField dateTimeField55 = islamicChronology54.weekyear();
        org.joda.time.ReadablePartial readablePartial56 = null;
        int[] intArray63 = new int[] { (short) 100, 10, 100, (short) -1, (byte) 10 };
        int[] intArray65 = dateTimeField55.addWrapPartial(readablePartial56, 100, intArray63, (int) (short) 0);
        int int66 = dateTimeField29.getMaximumValue((org.joda.time.ReadablePartial) localDateTime51, intArray65);
        int int67 = dateTimeField22.getMinimumValue((org.joda.time.ReadablePartial) localDateTime24, intArray65);
        boolean boolean68 = instant11.equals((java.lang.Object) intArray65);
        org.joda.time.DateTimeZone dateTimeZone69 = instant11.getZone();
        org.joda.time.LocalDateTime localDateTime71 = new org.joda.time.LocalDateTime((long) 1);
        int int72 = localDateTime71.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime74 = localDateTime71.withYear((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod75 = null;
        org.joda.time.LocalDateTime localDateTime77 = localDateTime74.withPeriodAdded(readablePeriod75, 10);
        org.joda.time.LocalDateTime localDateTime79 = localDateTime77.withDayOfYear(11);
        org.joda.time.LocalDateTime localDateTime81 = localDateTime79.withYear(10);
        org.joda.time.DateTime dateTime82 = localDateTime79.toDateTime();
        org.joda.time.LocalDateTime localDateTime84 = localDateTime79.withYear((int) (byte) 10);
        boolean boolean85 = instant11.equals((java.lang.Object) localDateTime79);
        long long86 = instant11.getMillis();
        org.joda.time.DateTimeZone dateTimeZone87 = instant11.getZone();
        org.joda.time.LocalDateTime localDateTime88 = org.joda.time.LocalDateTime.now(dateTimeZone87);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and instant11", (dateTime8.compareTo(instant11) == 0) == dateTime8.equals(instant11));
    }

    @Test
    public void test688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test688");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.minuteOfDay();
        org.joda.time.DurationField durationField2 = islamicChronology0.months();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((long) 1);
        int int6 = localDateTime5.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.minusHours((int) (byte) -1);
        int int9 = localDateTime5.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime5.withMinuteOfHour((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime5.plusHours((int) (byte) 100);
        int[] intArray15 = islamicChronology0.get((org.joda.time.ReadablePartial) localDateTime13, (long) 1969);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime13.withWeekyear((int) '4');
        org.joda.time.DateTime dateTime18 = localDateTime17.toDateTime();
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime((long) 1);
        int int21 = localDateTime20.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime23 = localDateTime20.minusHours((int) (byte) -1);
        int int25 = localDateTime20.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime20.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.LocalDateTime localDateTime29 = localDateTime20.minus(readablePeriod28);
        org.joda.time.LocalDateTime.Property property30 = localDateTime20.millisOfSecond();
        long long31 = property30.remainder();
        java.lang.String str32 = property30.getName();
        java.util.Locale locale33 = java.util.Locale.CHINA;
        java.lang.String str34 = property30.getAsText(locale33);
        org.joda.time.LocalDateTime localDateTime35 = property30.withMinimumValue();
        java.lang.String str36 = property30.getAsShortText();
        org.joda.time.LocalDateTime localDateTime38 = new org.joda.time.LocalDateTime((long) 1);
        int int39 = localDateTime38.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime41 = localDateTime38.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology44 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone43);
        org.joda.time.DateTime dateTime45 = localDateTime38.toDateTime(dateTimeZone43);
        org.joda.time.LocalDateTime localDateTime47 = new org.joda.time.LocalDateTime((long) 1);
        int int48 = localDateTime47.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime50 = localDateTime47.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone52 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology53 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone52);
        org.joda.time.DateTime dateTime54 = localDateTime47.toDateTime(dateTimeZone52);
        long long55 = dateTime54.getMillis();
        boolean boolean56 = dateTime45.isAfter((org.joda.time.ReadableInstant) dateTime54);
        long long57 = dateTime54.getMillis();
        org.joda.time.Instant instant58 = dateTime54.toInstant();
        org.joda.time.DateTimeZone dateTimeZone60 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology61 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone60);
        boolean boolean63 = dateTimeZone60.equals((java.lang.Object) 10L);
        java.util.Locale locale65 = java.util.Locale.JAPAN;
        java.lang.String str66 = locale65.getISO3Country();
        java.lang.String str67 = dateTimeZone60.getShortName(1970L, locale65);
        java.util.TimeZone timeZone68 = dateTimeZone60.toTimeZone();
        long long71 = dateTimeZone60.convertLocalToUTC(2626841168L, false);
        boolean boolean72 = instant58.equals((java.lang.Object) false);
        int int73 = property30.getDifference((org.joda.time.ReadableInstant) instant58);
        org.joda.time.LocalDateTime localDateTime75 = new org.joda.time.LocalDateTime((long) 1);
        int int76 = localDateTime75.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime78 = localDateTime75.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone80 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology81 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone80);
        org.joda.time.DateTime dateTime82 = localDateTime75.toDateTime(dateTimeZone80);
        org.joda.time.LocalDateTime localDateTime84 = new org.joda.time.LocalDateTime((long) 1);
        int int85 = localDateTime84.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime87 = localDateTime84.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone89 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology90 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone89);
        org.joda.time.DateTime dateTime91 = localDateTime84.toDateTime(dateTimeZone89);
        long long92 = dateTime91.getMillis();
        boolean boolean93 = dateTime82.isAfter((org.joda.time.ReadableInstant) dateTime91);
        org.joda.time.DateTimeZone dateTimeZone94 = dateTime91.getZone();
        java.lang.String str95 = dateTime91.toString();
        boolean boolean96 = instant58.isBefore((org.joda.time.ReadableInstant) dateTime91);
        int int97 = dateTime18.compareTo((org.joda.time.ReadableInstant) instant58);
        long long98 = dateTime18.getMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime45 and instant58", (dateTime45.compareTo(instant58) == 0) == dateTime45.equals(instant58));
    }

    @Test
    public void test689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test689");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = islamicChronology2.years();
        org.joda.time.DateTimeZone dateTimeZone5 = islamicChronology2.getZone();
        org.joda.time.DateTimeZone dateTimeZone6 = islamicChronology2.getZone();
        org.joda.time.DurationField durationField7 = islamicChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology2.minuteOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField7", (durationField4.compareTo(durationField7) == 0) == durationField4.equals(durationField7));
    }

    @Test
    public void test690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test690");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone2);
        org.joda.time.DurationField durationField4 = islamicChronology3.weekyears();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology3.hourOfDay();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology3.millisOfSecond();
        java.lang.String str7 = islamicChronology3.toString();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology10 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone9);
        java.lang.String str11 = dateTimeZone9.toString();
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((long) 1);
        int int14 = localDateTime13.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime13.withYear((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.withPeriodAdded(readablePeriod17, 10);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime16.plusSeconds((int) ' ');
        boolean boolean22 = dateTimeZone9.isLocalDateTimeGap(localDateTime21);
        org.joda.time.Chronology chronology23 = islamicChronology3.withZone(dateTimeZone9);
        org.joda.time.DurationField durationField24 = islamicChronology3.seconds();
        org.joda.time.DurationField durationField25 = islamicChronology3.halfdays();
        org.joda.time.DateTimeField dateTimeField26 = islamicChronology3.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime(6540L, (org.joda.time.Chronology) islamicChronology3);
        org.joda.time.DurationField durationField28 = islamicChronology3.months();
        org.joda.time.DurationField durationField29 = islamicChronology3.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField29, durationField4, and durationField24", !(durationField29.compareTo(durationField4) == 0) || (Math.signum(durationField29.compareTo(durationField24)) == Math.signum(durationField4.compareTo(durationField24))));
    }

    @Test
    public void test691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test691");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        int int2 = localDateTime1.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology7 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone6);
        org.joda.time.DateTime dateTime8 = localDateTime1.toDateTime(dateTimeZone6);
        long long9 = dateTime8.getMillis();
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((long) 1);
        int int12 = localDateTime11.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology17 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone16);
        org.joda.time.DateTime dateTime18 = localDateTime11.toDateTime(dateTimeZone16);
        long long19 = dateTime18.getMillis();
        long long20 = dateTime18.getMillis();
        boolean boolean21 = dateTime8.isAfter((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.Chronology chronology22 = dateTime18.getChronology();
        java.util.Locale.FilteringMode filteringMode23 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        boolean boolean24 = dateTime18.equals((java.lang.Object) filteringMode23);
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime((long) 1);
        int int27 = localDateTime26.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime29 = localDateTime26.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology32 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone31);
        org.joda.time.DateTime dateTime33 = localDateTime26.toDateTime(dateTimeZone31);
        long long34 = dateTime33.getMillis();
        long long35 = dateTime33.getMillis();
        org.joda.time.Instant instant36 = dateTime33.toInstant();
        boolean boolean37 = dateTime18.isEqual((org.joda.time.ReadableInstant) instant36);
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology40 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone39);
        org.joda.time.DateTimeField dateTimeField41 = islamicChronology40.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField42 = islamicChronology40.secondOfDay();
        org.joda.time.DurationField durationField43 = islamicChronology40.seconds();
        org.joda.time.LocalDateTime localDateTime44 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime46 = localDateTime44.minusMinutes(0);
        org.joda.time.ReadablePeriod readablePeriod47 = null;
        org.joda.time.LocalDateTime localDateTime48 = localDateTime44.minus(readablePeriod47);
        org.joda.time.ReadablePeriod readablePeriod49 = null;
        org.joda.time.LocalDateTime localDateTime51 = localDateTime44.withPeriodAdded(readablePeriod49, (int) (byte) 10);
        long long53 = islamicChronology40.set((org.joda.time.ReadablePartial) localDateTime44, 2015L);
        org.joda.time.LocalDateTime localDateTime55 = new org.joda.time.LocalDateTime((long) 1);
        int int56 = localDateTime55.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime58 = localDateTime55.minusHours((int) (byte) -1);
        int int60 = localDateTime55.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime62 = localDateTime55.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod63 = null;
        org.joda.time.LocalDateTime localDateTime64 = localDateTime55.minus(readablePeriod63);
        org.joda.time.LocalDateTime localDateTime66 = new org.joda.time.LocalDateTime((long) 1);
        int int67 = localDateTime66.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime69 = localDateTime66.minusHours((int) (byte) -1);
        int int70 = localDateTime66.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime72 = localDateTime66.withMinuteOfHour((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime74 = localDateTime66.plusHours((int) (byte) 100);
        java.util.Date date75 = localDateTime74.toDate();
        org.joda.time.DateTime dateTime76 = localDateTime74.toDateTime();
        org.joda.time.Instant instant77 = dateTime76.toInstant();
        org.joda.time.DateTime dateTime78 = localDateTime55.toDateTime((org.joda.time.ReadableInstant) instant77);
        org.joda.time.DateTime dateTime79 = localDateTime44.toDateTime((org.joda.time.ReadableInstant) instant77);
        org.joda.time.DateTimeZone dateTimeZone80 = instant77.getZone();
        boolean boolean81 = dateTime18.isBefore((org.joda.time.ReadableInstant) instant77);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and instant36", (dateTime8.compareTo(instant36) == 0) == dateTime8.equals(instant36));
    }

    @Test
    public void test692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test692");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        int int2 = localDateTime1.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.minusHours((int) (byte) -1);
        int int5 = localDateTime1.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.withMinuteOfHour((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withYear(19);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDateTime localDateTime12 = localDateTime9.withPeriodAdded(readablePeriod10, 10);
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((long) 1);
        int int15 = localDateTime14.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime17 = localDateTime14.withYear((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        org.joda.time.LocalDateTime localDateTime20 = localDateTime17.withPeriodAdded(readablePeriod18, 10);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime20.withDayOfYear(11);
        org.joda.time.Chronology chronology23 = localDateTime22.getChronology();
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = localDateTime22.getFieldType((int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime9.withField(dateTimeFieldType25, (int) ' ');
        org.joda.time.LocalDateTime localDateTime29 = localDateTime9.withSecondOfMinute((int) '#');
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime((long) 1);
        int int32 = localDateTime31.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime34 = localDateTime31.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology37 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone36);
        org.joda.time.DateTime dateTime38 = localDateTime31.toDateTime(dateTimeZone36);
        org.joda.time.LocalDateTime localDateTime40 = new org.joda.time.LocalDateTime((long) 1);
        int int41 = localDateTime40.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime43 = localDateTime40.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology46 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone45);
        org.joda.time.DateTime dateTime47 = localDateTime40.toDateTime(dateTimeZone45);
        long long48 = dateTime47.getMillis();
        boolean boolean49 = dateTime38.isAfter((org.joda.time.ReadableInstant) dateTime47);
        long long50 = dateTime47.getMillis();
        org.joda.time.Instant instant51 = dateTime47.toInstant();
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology54 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone53);
        boolean boolean56 = dateTimeZone53.equals((java.lang.Object) 10L);
        java.util.Locale locale58 = java.util.Locale.JAPAN;
        java.lang.String str59 = locale58.getISO3Country();
        java.lang.String str60 = dateTimeZone53.getShortName(1970L, locale58);
        java.util.TimeZone timeZone61 = dateTimeZone53.toTimeZone();
        long long64 = dateTimeZone53.convertLocalToUTC(2626841168L, false);
        boolean boolean65 = instant51.equals((java.lang.Object) false);
        org.joda.time.DateTime dateTime66 = localDateTime9.toDateTime((org.joda.time.ReadableInstant) instant51);
        org.joda.time.ReadableInstant readableInstant67 = null;
        boolean boolean68 = dateTime66.isBefore(readableInstant67);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime38 and instant51", (dateTime38.compareTo(instant51) == 0) == dateTime38.equals(instant51));
    }

    @Test
    public void test693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test693");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology2.secondOfMinute();
        org.joda.time.DurationField durationField5 = islamicChronology2.centuries();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology8 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone7);
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology8.yearOfCentury();
        org.joda.time.DurationField durationField10 = islamicChronology8.years();
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime((long) 1);
        int int13 = localDateTime12.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime12.minusHours((int) (byte) -1);
        int int17 = localDateTime12.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime12.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        org.joda.time.LocalDateTime localDateTime21 = localDateTime12.minus(readablePeriod20);
        int int22 = localDateTime21.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField24 = localDateTime21.getField(0);
        org.joda.time.LocalDateTime.Property property25 = localDateTime21.centuryOfEra();
        int[] intArray27 = islamicChronology8.get((org.joda.time.ReadablePartial) localDateTime21, (long) 0);
        org.joda.time.DateTimeField dateTimeField28 = islamicChronology8.millisOfDay();
        org.joda.time.DurationField durationField29 = islamicChronology8.centuries();
        org.joda.time.DateTimeField dateTimeField30 = islamicChronology8.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone31 = islamicChronology8.getZone();
        org.joda.time.DateTimeZone dateTimeZone32 = islamicChronology8.getZone();
        int int34 = dateTimeZone32.getOffset((long) (-683357));
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime(dateTimeZone32);
        org.joda.time.LocalDateTime localDateTime36 = new org.joda.time.LocalDateTime(dateTimeZone32);
        org.joda.time.LocalDateTime localDateTime38 = new org.joda.time.LocalDateTime((long) 1);
        int int39 = localDateTime38.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime41 = localDateTime38.minusHours((int) (byte) -1);
        int int42 = localDateTime38.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime44 = localDateTime38.minusMinutes((int) '#');
        org.joda.time.LocalDateTime.Property property45 = localDateTime44.centuryOfEra();
        java.lang.String str46 = localDateTime44.toString();
        int int47 = localDateTime44.getWeekOfWeekyear();
        org.joda.time.LocalDateTime.Property property48 = localDateTime44.era();
        org.joda.time.LocalDateTime.Property property49 = localDateTime44.hourOfDay();
        int int50 = localDateTime44.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime51 = localDateTime36.withFields((org.joda.time.ReadablePartial) localDateTime44);
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology54 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone53);
        org.joda.time.DurationField durationField55 = islamicChronology54.weekyears();
        org.joda.time.DateTimeField dateTimeField56 = islamicChronology54.hourOfDay();
        org.joda.time.DateTimeField dateTimeField57 = islamicChronology54.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField58 = islamicChronology54.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone60 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology61 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone60);
        org.joda.time.DurationField durationField62 = islamicChronology61.weekyears();
        org.joda.time.DurationField durationField63 = islamicChronology61.months();
        org.joda.time.DurationField durationField64 = islamicChronology61.centuries();
        org.joda.time.DateTimeZone dateTimeZone65 = islamicChronology61.getZone();
        org.joda.time.Chronology chronology66 = islamicChronology54.withZone(dateTimeZone65);
        org.joda.time.DurationField durationField67 = islamicChronology54.months();
        org.joda.time.LocalDateTime localDateTime69 = new org.joda.time.LocalDateTime((java.lang.Object) 2551440384L);
        org.joda.time.LocalDateTime localDateTime71 = localDateTime69.plusYears(183);
        int int72 = localDateTime71.size();
        int[] intArray74 = islamicChronology54.get((org.joda.time.ReadablePartial) localDateTime71, 19360357841629L);
        islamicChronology2.validate((org.joda.time.ReadablePartial) localDateTime51, intArray74);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField10 and durationField55", (durationField10.compareTo(durationField55) == 0) == durationField10.equals(durationField55));
    }

    @Test
    public void test694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test694");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology2.yearOfEra();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.halfdayOfDay();
        org.joda.time.DurationField durationField6 = islamicChronology2.years();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology2.clockhourOfHalfday();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField6", (durationField3.compareTo(durationField6) == 0) == durationField3.equals(durationField6));
    }

    @Test
    public void test695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test695");
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
        org.joda.time.LocalDateTime localDateTime36 = localDateTime23.minusYears(183);
        int[] intArray37 = localDateTime36.getValues();
        org.joda.time.LocalDateTime.Property property38 = localDateTime36.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology41 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone40);
        org.joda.time.DurationField durationField42 = islamicChronology41.weekyears();
        org.joda.time.DurationField durationField43 = islamicChronology41.halfdays();
        org.joda.time.DurationFieldType durationFieldType44 = durationField43.getType();
        boolean boolean45 = localDateTime36.isSupported(durationFieldType44);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField42", (durationField4.compareTo(durationField42) == 0) == durationField4.equals(durationField42));
    }

    @Test
    public void test696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test696");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology2.hourOfDay();
        long long7 = dateTimeField4.set((long) 9, 11);
        long long10 = dateTimeField4.add(10L, 3);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology14 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone13);
        org.joda.time.DateTimeField dateTimeField15 = islamicChronology14.weekyear();
        org.joda.time.DurationField durationField16 = islamicChronology14.years();
        org.joda.time.DateTimeField dateTimeField17 = islamicChronology14.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField18 = islamicChronology14.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField19 = islamicChronology14.clockhourOfHalfday();
        org.joda.time.DurationField durationField20 = islamicChronology14.centuries();
        org.joda.time.DateTimeField dateTimeField21 = islamicChronology14.secondOfMinute();
        java.util.Locale.Builder builder23 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder26 = builder23.setExtension('a', "FR");
        java.util.Locale.Builder builder28 = builder26.addUnicodeLocaleAttribute("KOR");
        java.util.Locale.Builder builder29 = builder28.clear();
        java.util.Locale locale30 = builder29.build();
        java.util.Locale locale31 = builder29.build();
        java.lang.String str32 = locale31.getDisplayLanguage();
        java.lang.String str33 = dateTimeField21.getAsText((-336992), locale31);
        java.lang.String str34 = dateTimeField4.getAsText(19, locale31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField16", (durationField3.compareTo(durationField16) == 0) == durationField3.equals(durationField16));
    }

    @Test
    public void test697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test697");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = islamicChronology2.years();
        org.joda.time.DurationField durationField5 = islamicChronology2.halfdays();
        org.joda.time.DurationField durationField6 = islamicChronology2.hours();
        org.joda.time.DurationField durationField7 = islamicChronology2.years();
        org.joda.time.DurationField durationField8 = islamicChronology2.days();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology2.secondOfMinute();
        org.joda.time.DurationField durationField10 = dateTimeField9.getLeapDurationField();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology13 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone12);
        org.joda.time.DurationField durationField14 = islamicChronology13.weekyears();
        org.joda.time.DateTimeField dateTimeField15 = islamicChronology13.millisOfSecond();
        long long19 = islamicChronology13.add((long) (byte) -1, (long) 0, (int) (byte) 10);
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
        org.joda.time.LocalDateTime localDateTime36 = localDateTime30.withMonthOfYear((int) (short) 10);
        boolean boolean37 = islamicChronology13.equals((java.lang.Object) localDateTime30);
        int int38 = localDateTime30.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime40 = localDateTime30.plusDays((-5641));
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime((long) 1);
        int int43 = localDateTime42.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime45 = localDateTime42.minusHours((int) (byte) -1);
        int int47 = localDateTime42.getValue((int) (byte) 1);
        java.util.Locale locale49 = new java.util.Locale("");
        boolean boolean50 = localDateTime42.equals((java.lang.Object) "");
        int int51 = localDateTime42.getMillisOfDay();
        org.joda.time.LocalDateTime localDateTime53 = localDateTime42.minusHours(1);
        org.joda.time.LocalDateTime localDateTime55 = localDateTime53.minusMinutes((int) 'a');
        int[] intArray56 = localDateTime55.getValues();
        int int57 = dateTimeField9.getMinimumValue((org.joda.time.ReadablePartial) localDateTime30, intArray56);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField14", (durationField4.compareTo(durationField14) == 0) == durationField4.equals(durationField14));
    }

    @Test
    public void test698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test698");
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
        long long27 = dateTimeZone24.adjustOffset((long) 70, true);
        boolean boolean28 = dateTimeZone24.isFixed();
        java.lang.String str29 = dateTimeZone24.toString();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology32 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone31);
        org.joda.time.DurationField durationField33 = islamicChronology32.weekyears();
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology36 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone35);
        boolean boolean38 = dateTimeZone35.equals((java.lang.Object) 10L);
        org.joda.time.Chronology chronology39 = islamicChronology32.withZone(dateTimeZone35);
        org.joda.time.DateTimeField dateTimeField40 = islamicChronology32.hourOfHalfday();
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime(0L);
        int int43 = localDateTime42.getYearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology46 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone45);
        org.joda.time.DateTimeField dateTimeField47 = islamicChronology46.weekyear();
        org.joda.time.ReadablePartial readablePartial48 = null;
        int[] intArray55 = new int[] { (short) 100, 10, 100, (short) -1, (byte) 10 };
        int[] intArray57 = dateTimeField47.addWrapPartial(readablePartial48, 100, intArray55, (int) (short) 0);
        int int59 = dateTimeField47.getMinimumValue((long) (short) 0);
        org.joda.time.LocalDateTime localDateTime61 = new org.joda.time.LocalDateTime((long) 1);
        int int62 = localDateTime61.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime64 = localDateTime61.withYear((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod65 = null;
        org.joda.time.LocalDateTime localDateTime67 = localDateTime64.withPeriodAdded(readablePeriod65, 10);
        org.joda.time.LocalDateTime localDateTime69 = localDateTime64.plusSeconds((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone71 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology72 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone71);
        org.joda.time.DateTimeField dateTimeField73 = islamicChronology72.weekyear();
        org.joda.time.ReadablePartial readablePartial74 = null;
        int[] intArray81 = new int[] { (short) 100, 10, 100, (short) -1, (byte) 10 };
        int[] intArray83 = dateTimeField73.addWrapPartial(readablePartial74, 100, intArray81, (int) (short) 0);
        int int84 = dateTimeField47.getMaximumValue((org.joda.time.ReadablePartial) localDateTime69, intArray83);
        int int85 = dateTimeField40.getMinimumValue((org.joda.time.ReadablePartial) localDateTime42, intArray83);
        long long87 = dateTimeField40.roundFloor(17763839957100L);
        int int88 = dateTimeField40.getMinimumValue();
        boolean boolean89 = dateTimeZone24.equals((java.lang.Object) dateTimeField40);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField33", (durationField4.compareTo(durationField33) == 0) == durationField4.equals(durationField33));
    }

    @Test
    public void test699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test699");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology2.weekyear();
        org.joda.time.DurationField durationField4 = islamicChronology2.years();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology2.hourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology2.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology2.monthOfYear();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology2.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology2.halfdayOfDay();
        java.util.Locale locale12 = java.util.Locale.FRANCE;
        java.lang.String str13 = dateTimeField10.getAsShortText((int) (byte) 10, locale12);
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((long) 1);
        int int16 = localDateTime15.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime15.withYear((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.LocalDateTime localDateTime21 = localDateTime18.withPeriodAdded(readablePeriod19, 10);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.withDayOfYear(11);
        int[] intArray24 = localDateTime23.getValues();
        org.joda.time.LocalDateTime.Property property25 = localDateTime23.weekOfWeekyear();
        java.util.Locale locale28 = new java.util.Locale("");
        java.lang.String str29 = locale28.getISO3Language();
        java.util.Locale locale31 = new java.util.Locale("");
        java.lang.String str32 = locale28.getDisplayLanguage(locale31);
        java.util.Locale locale33 = java.util.Locale.PRC;
        java.util.Locale locale34 = locale33.stripExtensions();
        java.util.Locale locale37 = new java.util.Locale("weekOfWeekyear", "millisOfSecond");
        java.lang.String str38 = locale34.getDisplayScript(locale37);
        java.lang.String str39 = locale31.getDisplayName(locale37);
        java.lang.String str40 = dateTimeField10.getAsText((org.joda.time.ReadablePartial) localDateTime23, 33, locale37);
        int int41 = localDateTime23.getCenturyOfEra();
        org.joda.time.LocalDateTime localDateTime43 = localDateTime23.plusMonths(47);
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology46 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone45);
        org.joda.time.DurationField durationField47 = islamicChronology46.weekyears();
        org.joda.time.DurationField durationField48 = islamicChronology46.halfdays();
        org.joda.time.DateTimeField dateTimeField49 = islamicChronology46.yearOfEra();
        org.joda.time.DateTimeField dateTimeField50 = islamicChronology46.minuteOfHour();
        org.joda.time.DurationField durationField51 = islamicChronology46.centuries();
        org.joda.time.LocalDateTime localDateTime52 = new org.joda.time.LocalDateTime((org.joda.time.Chronology) islamicChronology46);
        org.joda.time.DateTimeField dateTimeField53 = islamicChronology46.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField54 = islamicChronology46.era();
        org.joda.time.DateTimeZone dateTimeZone56 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology57 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone56);
        int int58 = islamicChronology57.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField59 = islamicChronology57.weekyear();
        org.joda.time.DurationField durationField60 = islamicChronology57.hours();
        org.joda.time.DurationField durationField61 = islamicChronology57.seconds();
        org.joda.time.DateTimeZone dateTimeZone62 = islamicChronology57.getZone();
        org.joda.time.Chronology chronology63 = islamicChronology46.withZone(dateTimeZone62);
        boolean boolean64 = localDateTime43.equals((java.lang.Object) chronology63);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField47", (durationField4.compareTo(durationField47) == 0) == durationField4.equals(durationField47));
    }

    @Test
    public void test700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test700");
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 1);
        int int3 = localDateTime2.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology8 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone7);
        org.joda.time.DateTime dateTime9 = localDateTime2.toDateTime(dateTimeZone7);
        java.lang.String str10 = dateTimeZone7.getID();
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((-20217598030L), dateTimeZone7);
        java.lang.String str13 = dateTimeZone7.getName(43200004L);
        int int15 = dateTimeZone7.getOffsetFromLocal((-418284L));
        org.joda.time.chrono.IslamicChronology islamicChronology16 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology19 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone18);
        org.joda.time.DateTimeField dateTimeField20 = islamicChronology19.weekyear();
        org.joda.time.DurationField durationField21 = islamicChronology19.years();
        org.joda.time.DateTimeField dateTimeField22 = islamicChronology19.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone23 = islamicChronology19.getZone();
        org.joda.time.Chronology chronology24 = islamicChronology16.withZone(dateTimeZone23);
        java.util.TimeZone timeZone25 = dateTimeZone23.toTimeZone();
        java.util.Locale.Category category28 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale29 = java.util.Locale.getDefault(category28);
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology32 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone31);
        org.joda.time.DurationField durationField33 = islamicChronology32.weekyears();
        org.joda.time.DurationField durationField34 = islamicChronology32.halfdays();
        org.joda.time.DateTimeField dateTimeField35 = islamicChronology32.yearOfEra();
        org.joda.time.DateTimeField dateTimeField36 = islamicChronology32.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField37 = islamicChronology32.weekyearOfCentury();
        org.joda.time.LocalDateTime localDateTime40 = new org.joda.time.LocalDateTime((long) 1);
        int int41 = localDateTime40.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime43 = localDateTime40.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology46 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone45);
        org.joda.time.DateTime dateTime47 = localDateTime40.toDateTime(dateTimeZone45);
        java.lang.String str48 = dateTimeZone45.getID();
        org.joda.time.LocalDateTime localDateTime49 = new org.joda.time.LocalDateTime((-20217598030L), dateTimeZone45);
        org.joda.time.Chronology chronology50 = islamicChronology32.withZone(dateTimeZone45);
        java.util.Locale locale52 = java.util.Locale.KOREA;
        java.util.Locale locale53 = java.util.Locale.KOREA;
        java.lang.String str54 = locale52.getDisplayLanguage(locale53);
        java.util.Locale.setDefault(locale52);
        java.lang.String str56 = dateTimeZone45.getShortName((-4320000001L), locale52);
        java.util.Locale.setDefault(category28, locale52);
        java.util.Set<java.lang.Character> charSet58 = locale52.getExtensionKeys();
        java.lang.String str59 = timeZone25.getDisplayName(false, 0, locale52);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField21 and durationField33", (durationField21.compareTo(durationField33) == 0) == durationField21.equals(durationField33));
    }

    @Test
    public void test701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test701");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((-1));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        int int4 = dateTimeZone1.getOffset((long) 5);
        java.util.Locale.Builder builder6 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder8 = builder6.setVariant("");
        java.util.Locale locale9 = builder8.build();
        java.util.Locale locale11 = new java.util.Locale("");
        java.util.Locale.Builder builder12 = builder8.setLocale(locale11);
        java.util.Locale locale13 = builder8.build();
        java.lang.String str14 = dateTimeZone1.getShortName((-2938031L), locale13);
        java.util.Locale locale15 = java.util.Locale.KOREA;
        java.util.Set<java.lang.String> strSet16 = locale15.getUnicodeLocaleAttributes();
        java.util.Locale locale17 = java.util.Locale.KOREA;
        java.util.Set<java.lang.String> strSet18 = locale17.getUnicodeLocaleAttributes();
        boolean boolean19 = strSet16.removeAll((java.util.Collection<java.lang.String>) strSet18);
        java.util.Set<java.lang.String> strSet20 = org.joda.time.DateTimeZone.getAvailableIDs();
        java.util.Locale locale21 = java.util.Locale.KOREA;
        java.util.Set<java.lang.String> strSet22 = locale21.getUnicodeLocaleAttributes();
        java.util.Locale locale23 = java.util.Locale.KOREA;
        java.util.Set<java.lang.String> strSet24 = locale23.getUnicodeLocaleAttributes();
        boolean boolean25 = strSet22.removeAll((java.util.Collection<java.lang.String>) strSet24);
        boolean boolean26 = strSet20.addAll((java.util.Collection<java.lang.String>) strSet22);
        boolean boolean27 = strSet16.addAll((java.util.Collection<java.lang.String>) strSet22);
        java.lang.Object[] objArray28 = strSet16.toArray();
        java.util.Set<java.lang.String> strSet29 = org.joda.time.DateTimeZone.getAvailableIDs();
        java.util.stream.Stream<java.lang.String> strStream30 = strSet29.stream();
        boolean boolean31 = strSet16.retainAll((java.util.Collection<java.lang.String>) strSet29);
        boolean boolean32 = strSet29.isEmpty();
        java.lang.String[] strArray34 = new java.lang.String[] { "1970" };
        java.util.LinkedHashSet<java.lang.String> strSet35 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet35, strArray34);
        java.lang.Object[] objArray37 = strSet35.toArray();
        java.util.stream.Stream<java.lang.String> strStream38 = strSet35.parallelStream();
        boolean boolean39 = strSet29.containsAll((java.util.Collection<java.lang.String>) strSet35);
        java.lang.Object[] objArray40 = strSet35.toArray();
        java.util.Iterator<java.lang.String> strItor41 = strSet35.iterator();
        boolean boolean42 = dateTimeZone1.equals((java.lang.Object) strSet35);
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology45 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone44);
        org.joda.time.DateTimeField dateTimeField46 = islamicChronology45.weekyear();
        org.joda.time.DurationField durationField47 = islamicChronology45.years();
        org.joda.time.DateTimeField dateTimeField48 = islamicChronology45.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone49 = islamicChronology45.getZone();
        long long51 = dateTimeZone49.convertUTCToLocal((long) (byte) 0);
        org.joda.time.LocalDateTime localDateTime52 = org.joda.time.LocalDateTime.now(dateTimeZone49);
        long long54 = dateTimeZone49.previousTransition(3L);
        int int56 = dateTimeZone49.getOffset((long) 0);
        boolean boolean57 = strSet35.remove((java.lang.Object) 0);
        java.lang.Object[] objArray58 = strSet35.toArray();
        org.joda.time.DateTimeZone dateTimeZone60 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology61 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone60);
        org.joda.time.DurationField durationField62 = islamicChronology61.weekyears();
        org.joda.time.DurationField durationField63 = islamicChronology61.halfdays();
        org.joda.time.DateTimeField dateTimeField64 = islamicChronology61.yearOfEra();
        org.joda.time.DateTimeField dateTimeField65 = islamicChronology61.minuteOfHour();
        boolean boolean66 = strSet35.remove((java.lang.Object) dateTimeField65);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField47 and durationField62", (durationField47.compareTo(durationField62) == 0) == durationField47.equals(durationField62));
    }

    @Test
    public void test702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test702");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DurationField durationField4 = islamicChronology2.months();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.halfdayOfDay();
        org.joda.time.DurationField durationField6 = islamicChronology2.millis();
        java.lang.String str7 = islamicChronology2.toString();
        org.joda.time.DurationField durationField8 = islamicChronology2.years();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology2.halfdayOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField8", (durationField3.compareTo(durationField8) == 0) == durationField3.equals(durationField8));
    }

    @Test
    public void test703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test703");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DurationField durationField4 = islamicChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.year();
        org.joda.time.DurationField durationField6 = islamicChronology2.years();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology2.dayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField6", (durationField3.compareTo(durationField6) == 0) == durationField3.equals(durationField6));
    }

    @Test
    public void test704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test704");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology2.secondOfMinute();
        long long8 = islamicChronology2.add((-3598030L), (long) 292271022, 9);
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology2.halfdayOfDay();
        org.joda.time.DurationField durationField10 = islamicChronology2.eras();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology2.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone12 = islamicChronology2.getZone();
        java.util.TimeZone timeZone13 = dateTimeZone12.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology16 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone15);
        org.joda.time.DurationField durationField17 = islamicChronology16.weekyears();
        org.joda.time.DateTimeField dateTimeField18 = islamicChronology16.hourOfDay();
        org.joda.time.DurationField durationField19 = islamicChronology16.weeks();
        long long23 = islamicChronology16.add(24796800001L, 17763839999999L, (-1));
        org.joda.time.DateTimeField dateTimeField24 = islamicChronology16.halfdayOfDay();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType25 = islamicChronology16.getLeapYearPatternType();
        org.joda.time.chrono.IslamicChronology islamicChronology26 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone12, leapYearPatternType25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField10 and durationField17", Math.signum(durationField10.compareTo(durationField17)) == -Math.signum(durationField17.compareTo(durationField10)));
    }

    @Test
    public void test705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test705");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        int int2 = localDateTime1.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology7 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone6);
        org.joda.time.DateTime dateTime8 = localDateTime1.toDateTime(dateTimeZone6);
        long long9 = dateTime8.getMillis();
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((long) 1);
        int int12 = localDateTime11.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology17 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone16);
        org.joda.time.DateTime dateTime18 = localDateTime11.toDateTime(dateTimeZone16);
        long long19 = dateTime18.getMillis();
        long long20 = dateTime18.getMillis();
        boolean boolean21 = dateTime8.isAfter((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.Chronology chronology22 = dateTime18.getChronology();
        java.util.Locale.FilteringMode filteringMode23 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        boolean boolean24 = dateTime18.equals((java.lang.Object) filteringMode23);
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime((long) 1);
        int int27 = localDateTime26.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime29 = localDateTime26.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology32 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone31);
        org.joda.time.DateTime dateTime33 = localDateTime26.toDateTime(dateTimeZone31);
        long long34 = dateTime33.getMillis();
        long long35 = dateTime33.getMillis();
        org.joda.time.Instant instant36 = dateTime33.toInstant();
        boolean boolean37 = dateTime18.isEqual((org.joda.time.ReadableInstant) instant36);
        org.joda.time.LocalDateTime localDateTime39 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.DateTime dateTime40 = localDateTime39.toDateTime();
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime((long) 1);
        int int43 = localDateTime42.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime45 = localDateTime42.minusHours((int) (byte) -1);
        int int47 = localDateTime42.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime49 = localDateTime42.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod50 = null;
        org.joda.time.LocalDateTime localDateTime51 = localDateTime42.minus(readablePeriod50);
        int int52 = localDateTime51.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField54 = localDateTime51.getField(0);
        org.joda.time.LocalDateTime.Property property55 = localDateTime51.centuryOfEra();
        org.joda.time.LocalDateTime.Property property56 = localDateTime51.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime61 = localDateTime51.withTime((int) (byte) 1, 0, 5, (int) (byte) 100);
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
        org.joda.time.LocalDateTime.Property property77 = localDateTime72.millisOfSecond();
        org.joda.time.DateTimeFieldType dateTimeFieldType78 = property77.getFieldType();
        boolean boolean79 = localDateTime61.isSupported(dateTimeFieldType78);
        int int80 = localDateTime61.getMinuteOfHour();
        boolean boolean81 = dateTime40.equals((java.lang.Object) int80);
        org.joda.time.Chronology chronology82 = dateTime40.getChronology();
        boolean boolean83 = instant36.isAfter((org.joda.time.ReadableInstant) dateTime40);
        org.joda.time.Chronology chronology84 = dateTime40.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and instant36", (dateTime8.compareTo(instant36) == 0) == dateTime8.equals(instant36));
    }

    @Test
    public void test706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test706");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DurationField durationField4 = islamicChronology2.months();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology2.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology2.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology2.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology2.halfdayOfDay();
        org.joda.time.DurationField durationField10 = islamicChronology2.millis();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology2.halfdayOfDay();
        org.joda.time.DurationField durationField12 = islamicChronology2.years();
        org.joda.time.DurationField durationField13 = islamicChronology2.months();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField12", (durationField3.compareTo(durationField12) == 0) == durationField3.equals(durationField12));
    }

    @Test
    public void test707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test707");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology2.hourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.millisOfSecond();
        java.lang.String str6 = islamicChronology2.toString();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology2.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology2.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology11 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone10);
        org.joda.time.DurationField durationField12 = islamicChronology11.weekyears();
        org.joda.time.DateTimeField dateTimeField13 = islamicChronology11.yearOfEra();
        long long15 = dateTimeField13.roundCeiling(0L);
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime((long) 1);
        int int18 = localDateTime17.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime17.minusHours((int) (byte) -1);
        int int21 = localDateTime17.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime23 = localDateTime17.withMinuteOfHour((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime17.plusHours((int) (byte) 100);
        org.joda.time.ReadableDuration readableDuration26 = null;
        org.joda.time.LocalDateTime localDateTime27 = localDateTime17.minus(readableDuration26);
        java.util.Locale locale28 = java.util.Locale.PRC;
        java.util.Locale locale29 = locale28.stripExtensions();
        java.lang.String str30 = dateTimeField13.getAsShortText((org.joda.time.ReadablePartial) localDateTime27, locale28);
        org.joda.time.ReadablePeriod readablePeriod31 = null;
        org.joda.time.LocalDateTime localDateTime32 = localDateTime27.plus(readablePeriod31);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime32.plusYears(100);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime32.plusMillis(4);
        org.joda.time.LocalDateTime localDateTime38 = localDateTime32.withYear((int) (byte) 0);
        int[] intArray40 = islamicChronology2.get((org.joda.time.ReadablePartial) localDateTime32, (-3599997L));
        org.joda.time.DateTimeField dateTimeField41 = islamicChronology2.hourOfHalfday();
        org.joda.time.DurationField durationField42 = islamicChronology2.centuries();
        org.joda.time.DateTimeField dateTimeField43 = islamicChronology2.dayOfMonth();
        org.joda.time.DurationField durationField44 = islamicChronology2.years();
        org.joda.time.DateTimeZone dateTimeZone45 = islamicChronology2.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField44", (durationField3.compareTo(durationField44) == 0) == durationField3.equals(durationField44));
    }

    @Test
    public void test708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test708");
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
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology27 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone26);
        org.joda.time.DateTimeField dateTimeField28 = islamicChronology27.yearOfCentury();
        org.joda.time.DurationField durationField29 = islamicChronology27.years();
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime((long) 1);
        int int32 = localDateTime31.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime34 = localDateTime31.minusHours((int) (byte) -1);
        int int36 = localDateTime31.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime38 = localDateTime31.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod39 = null;
        org.joda.time.LocalDateTime localDateTime40 = localDateTime31.minus(readablePeriod39);
        int int41 = localDateTime40.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField43 = localDateTime40.getField(0);
        org.joda.time.LocalDateTime.Property property44 = localDateTime40.centuryOfEra();
        int[] intArray46 = islamicChronology27.get((org.joda.time.ReadablePartial) localDateTime40, (long) 0);
        org.joda.time.DateTimeField dateTimeField47 = islamicChronology27.millisOfDay();
        org.joda.time.DurationField durationField48 = islamicChronology27.centuries();
        org.joda.time.DateTimeZone dateTimeZone49 = islamicChronology27.getZone();
        org.joda.time.Chronology chronology50 = islamicChronology2.withZone(dateTimeZone49);
        org.joda.time.DateTimeField dateTimeField51 = islamicChronology2.clockhourOfHalfday();
        org.joda.time.DurationField durationField52 = islamicChronology2.millis();
        org.joda.time.DateTimeZone dateTimeZone55 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology56 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone55);
        org.joda.time.DurationField durationField57 = islamicChronology56.weekyears();
        org.joda.time.DateTimeField dateTimeField58 = islamicChronology56.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone59 = islamicChronology56.getZone();
        java.lang.String str60 = dateTimeZone59.toString();
        org.joda.time.LocalDateTime localDateTime61 = new org.joda.time.LocalDateTime((long) (-1), dateTimeZone59);
        java.util.TimeZone timeZone63 = java.util.TimeZone.getTimeZone("");
        java.util.TimeZone timeZone65 = java.util.TimeZone.getTimeZone("");
        boolean boolean66 = timeZone63.hasSameRules(timeZone65);
        timeZone65.setRawOffset(11);
        org.joda.time.DateTimeZone dateTimeZone69 = org.joda.time.DateTimeZone.forTimeZone(timeZone65);
        java.util.TimeZone timeZone70 = dateTimeZone69.toTimeZone();
        org.joda.time.chrono.IslamicChronology islamicChronology71 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone69);
        long long73 = dateTimeZone59.getMillisKeepLocal(dateTimeZone69, 115200999L);
        org.joda.time.LocalDateTime localDateTime74 = org.joda.time.LocalDateTime.now(dateTimeZone69);
        int int76 = dateTimeZone69.getOffset((long) 349200000);
        org.joda.time.DateTimeZone dateTimeZone78 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology79 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone78);
        org.joda.time.DurationField durationField80 = islamicChronology79.weekyears();
        org.joda.time.DateTimeField dateTimeField81 = islamicChronology79.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone82 = islamicChronology79.getZone();
        org.joda.time.DateTimeField dateTimeField83 = islamicChronology79.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField84 = islamicChronology79.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField85 = islamicChronology79.year();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType86 = islamicChronology79.getLeapYearPatternType();
        org.joda.time.chrono.IslamicChronology islamicChronology87 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone69, leapYearPatternType86);
        org.joda.time.DateTimeZone dateTimeZone89 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology90 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone89);
        org.joda.time.DurationField durationField91 = islamicChronology90.weekyears();
        org.joda.time.DurationField durationField92 = islamicChronology90.months();
        org.joda.time.DateTimeField dateTimeField93 = islamicChronology90.minuteOfHour();
        org.joda.time.DurationField durationField94 = islamicChronology90.hours();
        org.joda.time.DateTimeField dateTimeField95 = islamicChronology90.minuteOfDay();
        boolean boolean96 = dateTimeZone69.equals((java.lang.Object) dateTimeField95);
        java.lang.String str98 = dateTimeZone69.getNameKey((long) 2922711);
        org.joda.time.Chronology chronology99 = islamicChronology2.withZone(dateTimeZone69);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField57", (durationField4.compareTo(durationField57) == 0) == durationField4.equals(durationField57));
    }

    @Test
    public void test709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test709");
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
        int int33 = localDateTime32.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField35 = localDateTime32.getField(0);
        org.joda.time.LocalDateTime.Property property36 = localDateTime32.centuryOfEra();
        int int37 = property36.getMaximumValue();
        boolean boolean38 = property36.isLeap();
        org.joda.time.LocalDateTime localDateTime40 = new org.joda.time.LocalDateTime((long) 1);
        int int41 = localDateTime40.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime43 = localDateTime40.minusHours((int) (byte) -1);
        org.joda.time.DateTimeField[] dateTimeFieldArray44 = localDateTime43.getFields();
        org.joda.time.LocalDateTime localDateTime46 = localDateTime43.withYearOfCentury(10);
        int int47 = localDateTime43.getMinuteOfHour();
        org.joda.time.ReadableDuration readableDuration48 = null;
        org.joda.time.LocalDateTime localDateTime49 = localDateTime43.plus(readableDuration48);
        org.joda.time.ReadablePeriod readablePeriod50 = null;
        org.joda.time.LocalDateTime localDateTime51 = localDateTime49.plus(readablePeriod50);
        int int52 = property36.compareTo((org.joda.time.ReadablePartial) localDateTime49);
        org.joda.time.DateTimeFieldType dateTimeFieldType53 = property36.getFieldType();
        boolean boolean54 = dateTime17.isSupported(dateTimeFieldType53);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and instant21", (dateTime8.compareTo(instant21) == 0) == dateTime8.equals(instant21));
    }

    @Test
    public void test710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test710");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology2.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology2.monthOfYear();
        java.util.Locale locale7 = java.util.Locale.KOREA;
        java.util.Set<java.lang.String> strSet8 = locale7.getUnicodeLocaleAttributes();
        java.util.Locale locale9 = java.util.Locale.KOREA;
        java.util.Set<java.lang.String> strSet10 = locale9.getUnicodeLocaleAttributes();
        boolean boolean11 = strSet8.removeAll((java.util.Collection<java.lang.String>) strSet10);
        java.util.Set<java.lang.String> strSet12 = org.joda.time.DateTimeZone.getAvailableIDs();
        java.util.Locale locale13 = java.util.Locale.KOREA;
        java.util.Set<java.lang.String> strSet14 = locale13.getUnicodeLocaleAttributes();
        java.util.Locale locale15 = java.util.Locale.KOREA;
        java.util.Set<java.lang.String> strSet16 = locale15.getUnicodeLocaleAttributes();
        boolean boolean17 = strSet14.removeAll((java.util.Collection<java.lang.String>) strSet16);
        boolean boolean18 = strSet12.addAll((java.util.Collection<java.lang.String>) strSet14);
        boolean boolean19 = strSet8.addAll((java.util.Collection<java.lang.String>) strSet14);
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime((long) 1);
        int int22 = localDateTime21.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime24 = localDateTime21.minusHours((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime24.withMinuteOfHour(19);
        boolean boolean27 = strSet14.remove((java.lang.Object) localDateTime26);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime26.plusMonths(11);
        org.joda.time.DateTimeField[] dateTimeFieldArray30 = localDateTime26.getFields();
        boolean boolean31 = islamicChronology2.equals((java.lang.Object) dateTimeFieldArray30);
        org.joda.time.DateTimeField dateTimeField32 = islamicChronology2.era();
        org.joda.time.DurationField durationField33 = islamicChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField34 = islamicChronology2.weekOfWeekyear();
        org.joda.time.DurationField durationField35 = islamicChronology2.centuries();
        org.joda.time.DateTimeField dateTimeField36 = islamicChronology2.minuteOfHour();
        org.joda.time.DurationField durationField37 = islamicChronology2.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField37, durationField3, and durationField35", !(durationField37.compareTo(durationField3) == 0) || (Math.signum(durationField37.compareTo(durationField35)) == Math.signum(durationField3.compareTo(durationField35))));
    }

    @Test
    public void test711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test711");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        java.lang.String str3 = dateTimeZone1.toString();
        long long5 = dateTimeZone1.nextTransition((long) 1);
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType6 = org.joda.time.chrono.IslamicChronology.LEAP_YEAR_INDIAN;
        org.joda.time.chrono.IslamicChronology islamicChronology7 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1, leapYearPatternType6);
        org.joda.time.DateTimeZone dateTimeZone8 = islamicChronology7.getZone();
        java.lang.String str9 = islamicChronology7.toString();
        org.joda.time.DurationField durationField10 = islamicChronology7.hours();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology7.year();
        org.joda.time.DurationField durationField12 = islamicChronology7.centuries();
        org.joda.time.DateTimeField dateTimeField13 = islamicChronology7.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology17 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone16);
        org.joda.time.DurationField durationField18 = islamicChronology17.weekyears();
        org.joda.time.DurationField durationField19 = islamicChronology17.months();
        org.joda.time.DateTimeField dateTimeField20 = islamicChronology17.minuteOfHour();
        org.joda.time.DurationField durationField21 = islamicChronology17.hours();
        org.joda.time.DateTimeField dateTimeField22 = islamicChronology17.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 0);
        org.joda.time.Chronology chronology25 = islamicChronology17.withZone(dateTimeZone24);
        java.lang.String str27 = dateTimeZone24.getShortName(100L);
        int int29 = dateTimeZone24.getStandardOffset(30043584539362L);
        org.joda.time.LocalDateTime localDateTime30 = org.joda.time.LocalDateTime.now(dateTimeZone24);
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime((-61084799941L), dateTimeZone24);
        long long33 = islamicChronology7.set((org.joda.time.ReadablePartial) localDateTime31, 0L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField10 and durationField21", (durationField10.compareTo(durationField21) == 0) == durationField10.equals(durationField21));
    }

    @Test
    public void test712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test712");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology2.secondOfMinute();
        org.joda.time.DurationField durationField5 = islamicChronology2.centuries();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology2.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology2.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime((long) 1);
        int int10 = localDateTime9.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime9.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology15 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone14);
        org.joda.time.DateTime dateTime16 = localDateTime9.toDateTime(dateTimeZone14);
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime((long) 1);
        int int19 = localDateTime18.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime18.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology24 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone23);
        org.joda.time.DateTime dateTime25 = localDateTime18.toDateTime(dateTimeZone23);
        long long26 = dateTime25.getMillis();
        boolean boolean27 = dateTime16.isAfter((org.joda.time.ReadableInstant) dateTime25);
        org.joda.time.DateTimeZone dateTimeZone28 = dateTime16.getZone();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology32 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone31);
        org.joda.time.DurationField durationField33 = islamicChronology32.weekyears();
        org.joda.time.DurationField durationField34 = islamicChronology32.halfdays();
        org.joda.time.DateTimeField dateTimeField35 = islamicChronology32.yearOfEra();
        org.joda.time.DurationField durationField36 = islamicChronology32.halfdays();
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime((org.joda.time.Chronology) islamicChronology32);
        org.joda.time.DateTimeField dateTimeField38 = islamicChronology32.yearOfEra();
        java.util.Locale locale39 = java.util.Locale.US;
        int int40 = dateTimeField38.getMaximumShortTextLength(locale39);
        java.lang.String str41 = locale39.getDisplayLanguage();
        java.lang.String str42 = dateTimeZone28.getName(9000L, locale39);
        org.joda.time.Chronology chronology43 = islamicChronology2.withZone(dateTimeZone28);
        org.joda.time.DateTimeField dateTimeField44 = islamicChronology2.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField45 = islamicChronology2.millisOfDay();
        org.joda.time.DurationField durationField46 = islamicChronology2.years();
        org.joda.time.DateTimeField dateTimeField47 = islamicChronology2.yearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField33 and durationField46", (durationField33.compareTo(durationField46) == 0) == durationField33.equals(durationField46));
    }

    @Test
    public void test713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test713");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = islamicChronology2.years();
        org.joda.time.DurationField durationField5 = islamicChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology2.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology2.dayOfYear();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology2.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology2.hourOfHalfday();
        int int10 = islamicChronology2.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField11 = islamicChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology2.secondOfMinute();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField11", (durationField4.compareTo(durationField11) == 0) == durationField4.equals(durationField11));
    }

    @Test
    public void test714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test714");
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
        org.joda.time.DateTimeZone dateTimeZone28 = islamicChronology2.getZone();
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology31 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone30);
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime((long) 1);
        int int34 = localDateTime33.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime36 = localDateTime33.minusHours((int) (byte) -1);
        org.joda.time.DateTimeField[] dateTimeFieldArray37 = localDateTime36.getFields();
        boolean boolean38 = dateTimeZone30.isLocalDateTimeGap(localDateTime36);
        org.joda.time.LocalDateTime localDateTime39 = new org.joda.time.LocalDateTime(dateTimeZone30);
        org.joda.time.LocalDateTime.Property property40 = localDateTime39.centuryOfEra();
        int[] intArray42 = islamicChronology2.get((org.joda.time.ReadablePartial) localDateTime39, 60480000035L);
        org.joda.time.LocalDateTime localDateTime44 = localDateTime39.minusWeeks(5);
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
        org.joda.time.DateTimeField dateTimeField67 = islamicChronology47.millisOfDay();
        org.joda.time.DurationField durationField68 = islamicChronology47.centuries();
        org.joda.time.DateTimeZone dateTimeZone69 = islamicChronology47.getZone();
        org.joda.time.DateTimeField dateTimeField70 = islamicChronology47.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime71 = new org.joda.time.LocalDateTime();
        int[] intArray73 = islamicChronology47.get((org.joda.time.ReadablePartial) localDateTime71, 10L);
        org.joda.time.DateTimeField dateTimeField74 = islamicChronology47.secondOfDay();
        org.joda.time.DateTimeField dateTimeField75 = islamicChronology47.halfdayOfDay();
        org.joda.time.Chronology chronology76 = islamicChronology47.withUTC();
        org.joda.time.DateTimeZone dateTimeZone78 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology79 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone78);
        org.joda.time.DateTimeField dateTimeField80 = islamicChronology79.yearOfCentury();
        org.joda.time.DurationField durationField81 = islamicChronology79.years();
        org.joda.time.DurationField durationField82 = islamicChronology79.halfdays();
        org.joda.time.DateTimeField dateTimeField83 = islamicChronology79.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField84 = islamicChronology79.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone85 = islamicChronology79.getZone();
        java.util.TimeZone timeZone86 = dateTimeZone85.toTimeZone();
        org.joda.time.Chronology chronology87 = chronology76.withZone(dateTimeZone85);
        org.joda.time.DateTime dateTime88 = localDateTime39.toDateTime(dateTimeZone85);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField49", (durationField3.compareTo(durationField49) == 0) == durationField3.equals(durationField49));
    }

    @Test
    public void test715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test715");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology2.weekyear();
        org.joda.time.DurationField durationField4 = islamicChronology2.years();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology2.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology2.clockhourOfHalfday();
        org.joda.time.DurationField durationField8 = islamicChronology2.centuries();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology2.secondOfMinute();
        java.util.Locale.Builder builder11 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder14 = builder11.setExtension('a', "FR");
        java.util.Locale.Builder builder16 = builder14.addUnicodeLocaleAttribute("KOR");
        java.util.Locale.Builder builder17 = builder16.clear();
        java.util.Locale locale18 = builder17.build();
        java.util.Locale locale19 = builder17.build();
        java.lang.String str20 = locale19.getDisplayLanguage();
        java.lang.String str21 = dateTimeField9.getAsText((-336992), locale19);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology25 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone24);
        org.joda.time.DurationField durationField26 = islamicChronology25.weekyears();
        org.joda.time.DurationField durationField27 = islamicChronology25.months();
        org.joda.time.DateTimeField dateTimeField28 = islamicChronology25.minuteOfHour();
        org.joda.time.DurationField durationField29 = islamicChronology25.hours();
        org.joda.time.DateTimeField dateTimeField30 = islamicChronology25.clockhourOfHalfday();
        long long32 = dateTimeField30.remainder(58665600000L);
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime((long) 1);
        int int35 = localDateTime34.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime37 = localDateTime34.minusHours((int) (byte) -1);
        int int39 = localDateTime34.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime41 = localDateTime34.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod42 = null;
        org.joda.time.LocalDateTime localDateTime43 = localDateTime34.minus(readablePeriod42);
        org.joda.time.LocalDateTime.Property property44 = localDateTime34.millisOfSecond();
        long long45 = property44.remainder();
        java.lang.String str46 = property44.getName();
        java.util.Locale locale47 = java.util.Locale.CHINA;
        java.lang.String str48 = property44.getAsText(locale47);
        org.joda.time.LocalDateTime localDateTime49 = property44.withMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology52 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone51);
        boolean boolean54 = dateTimeZone51.equals((java.lang.Object) 10L);
        java.util.Locale locale56 = java.util.Locale.JAPAN;
        java.lang.String str57 = locale56.getISO3Country();
        java.lang.String str58 = dateTimeZone51.getShortName(1970L, locale56);
        org.joda.time.DateTime dateTime59 = localDateTime49.toDateTime(dateTimeZone51);
        org.joda.time.LocalDateTime.Property property60 = localDateTime49.dayOfYear();
        java.util.Locale locale62 = new java.util.Locale("+00:00:00.100");
        java.lang.String str63 = dateTimeField30.getAsShortText((org.joda.time.ReadablePartial) localDateTime49, locale62);
        java.lang.String str64 = dateTimeField9.getAsShortText(3601970, locale62);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField26", (durationField4.compareTo(durationField26) == 0) == durationField4.equals(durationField26));
    }

    @Test
    public void test716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test716");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DurationField durationField4 = islamicChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.yearOfEra();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology2.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology2.monthOfYear();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology2.secondOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = dateTimeField8.getType();
        java.lang.String str10 = dateTimeField8.getName();
        int int12 = dateTimeField8.getMinimumValue((long) 1978);
        boolean boolean13 = dateTimeField8.isSupported();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology17 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone16);
        org.joda.time.DateTimeField dateTimeField18 = islamicChronology17.weekyear();
        org.joda.time.DurationField durationField19 = islamicChronology17.years();
        org.joda.time.DateTimeField dateTimeField20 = islamicChronology17.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField21 = islamicChronology17.hourOfDay();
        org.joda.time.DateTimeField dateTimeField22 = islamicChronology17.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField23 = islamicChronology17.monthOfYear();
        org.joda.time.DateTimeField dateTimeField24 = islamicChronology17.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField25 = islamicChronology17.halfdayOfDay();
        java.util.Locale locale27 = java.util.Locale.FRANCE;
        java.lang.String str28 = dateTimeField25.getAsShortText((int) (byte) 10, locale27);
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime((long) 1);
        int int31 = localDateTime30.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime33 = localDateTime30.withYear((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        org.joda.time.LocalDateTime localDateTime36 = localDateTime33.withPeriodAdded(readablePeriod34, 10);
        org.joda.time.LocalDateTime localDateTime38 = localDateTime36.withDayOfYear(11);
        int[] intArray39 = localDateTime38.getValues();
        org.joda.time.LocalDateTime.Property property40 = localDateTime38.weekOfWeekyear();
        java.util.Locale locale43 = new java.util.Locale("");
        java.lang.String str44 = locale43.getISO3Language();
        java.util.Locale locale46 = new java.util.Locale("");
        java.lang.String str47 = locale43.getDisplayLanguage(locale46);
        java.util.Locale locale48 = java.util.Locale.PRC;
        java.util.Locale locale49 = locale48.stripExtensions();
        java.util.Locale locale52 = new java.util.Locale("weekOfWeekyear", "millisOfSecond");
        java.lang.String str53 = locale49.getDisplayScript(locale52);
        java.lang.String str54 = locale46.getDisplayName(locale52);
        java.lang.String str55 = dateTimeField25.getAsText((org.joda.time.ReadablePartial) localDateTime38, 33, locale52);
        java.lang.String str56 = locale52.getLanguage();
        java.util.Locale locale58 = new java.util.Locale("1389");
        java.lang.String str59 = locale52.getDisplayScript(locale58);
        java.lang.String str60 = dateTimeField8.getAsText((int) (byte) 0, locale52);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField19", (durationField3.compareTo(durationField19) == 0) == durationField3.equals(durationField19));
    }

    @Test
    public void test717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test717");
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
        java.lang.String str18 = dateTimeZone5.getName(0L);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology21 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone20);
        org.joda.time.DateTimeField dateTimeField22 = islamicChronology21.yearOfCentury();
        org.joda.time.DurationField durationField23 = islamicChronology21.years();
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime((long) 1);
        int int26 = localDateTime25.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime28 = localDateTime25.minusHours((int) (byte) -1);
        int int30 = localDateTime25.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime25.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        org.joda.time.LocalDateTime localDateTime34 = localDateTime25.minus(readablePeriod33);
        int int35 = localDateTime34.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField37 = localDateTime34.getField(0);
        org.joda.time.LocalDateTime.Property property38 = localDateTime34.centuryOfEra();
        int[] intArray40 = islamicChronology21.get((org.joda.time.ReadablePartial) localDateTime34, (long) 0);
        org.joda.time.DateTimeField dateTimeField41 = islamicChronology21.millisOfDay();
        org.joda.time.DurationField durationField42 = islamicChronology21.centuries();
        org.joda.time.DateTimeField dateTimeField43 = islamicChronology21.dayOfYear();
        org.joda.time.DateTimeField dateTimeField44 = islamicChronology21.clockhourOfDay();
        long long48 = islamicChronology21.add(20217598041L, 4871L, (-1));
        org.joda.time.LocalDateTime localDateTime50 = new org.joda.time.LocalDateTime((long) 1);
        int int51 = localDateTime50.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime53 = localDateTime50.minusHours((int) (byte) -1);
        int int54 = localDateTime50.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime56 = localDateTime50.minusMinutes((int) '#');
        org.joda.time.LocalDateTime.Property property57 = localDateTime56.centuryOfEra();
        java.lang.String str58 = localDateTime56.toString();
        int int59 = localDateTime56.getWeekOfWeekyear();
        long long61 = islamicChronology21.set((org.joda.time.ReadablePartial) localDateTime56, 19360361351766L);
        java.lang.String str62 = islamicChronology21.toString();
        org.joda.time.DateTimeField dateTimeField63 = islamicChronology21.weekyearOfCentury();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType64 = islamicChronology21.getLeapYearPatternType();
        org.joda.time.chrono.IslamicChronology islamicChronology65 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone5, leapYearPatternType64);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField23", (durationField3.compareTo(durationField23) == 0) == durationField3.equals(durationField23));
    }

    @Test
    public void test718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test718");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DurationField durationField4 = islamicChronology2.months();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.minuteOfHour();
        org.joda.time.DurationField durationField6 = islamicChronology2.seconds();
        org.joda.time.Chronology chronology7 = islamicChronology2.withUTC();
        org.joda.time.DurationField durationField8 = islamicChronology2.years();
        org.joda.time.DurationField durationField9 = islamicChronology2.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField8", (durationField3.compareTo(durationField8) == 0) == durationField3.equals(durationField8));
    }

    @Test
    public void test719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test719");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DurationField durationField4 = islamicChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.yearOfEra();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology2.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology2.weekyear();
        org.joda.time.DurationField durationField8 = islamicChronology2.days();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology2.secondOfDay();
        org.joda.time.DurationField durationField10 = islamicChronology2.years();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology2.minuteOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField10", (durationField3.compareTo(durationField10) == 0) == durationField3.equals(durationField10));
    }

    @Test
    public void test720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test720");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = islamicChronology2.years();
        org.joda.time.DurationField durationField5 = islamicChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology2.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology2.dayOfYear();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology2.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology2.weekyear();
        org.joda.time.DurationField durationField10 = islamicChronology2.days();
        org.joda.time.DurationField durationField11 = islamicChronology2.minutes();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology14 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone13);
        org.joda.time.DurationField durationField15 = islamicChronology14.weekyears();
        org.joda.time.DateTimeField dateTimeField16 = islamicChronology14.yearOfEra();
        long long18 = dateTimeField16.roundCeiling(0L);
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime((long) 1);
        int int21 = localDateTime20.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime23 = localDateTime20.minusHours((int) (byte) -1);
        int int24 = localDateTime20.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime26 = localDateTime20.withMinuteOfHour((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime20.plusHours((int) (byte) 100);
        org.joda.time.ReadableDuration readableDuration29 = null;
        org.joda.time.LocalDateTime localDateTime30 = localDateTime20.minus(readableDuration29);
        java.util.Locale locale31 = java.util.Locale.PRC;
        java.util.Locale locale32 = locale31.stripExtensions();
        java.lang.String str33 = dateTimeField16.getAsShortText((org.joda.time.ReadablePartial) localDateTime30, locale31);
        java.lang.String str35 = locale31.getUnicodeLocaleType("JP");
        java.util.Locale.setDefault(locale31);
        java.util.Set<java.lang.String> strSet37 = locale31.getUnicodeLocaleAttributes();
        java.util.Iterator<java.lang.String> strItor38 = strSet37.iterator();
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology41 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone40);
        int int42 = islamicChronology41.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField43 = islamicChronology41.weekyear();
        org.joda.time.DateTimeField dateTimeField44 = islamicChronology41.dayOfMonth();
        boolean boolean45 = strSet37.contains((java.lang.Object) islamicChronology41);
        org.joda.time.DateTimeField dateTimeField46 = islamicChronology41.monthOfYear();
        org.joda.time.DurationField durationField47 = islamicChronology41.years();
        int int48 = durationField11.compareTo(durationField47);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField47 and durationField15", (durationField47.compareTo(durationField15) == 0) == durationField47.equals(durationField15));
    }

    @Test
    public void test721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test721");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(6294913521071022L);
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((long) 1);
        int int4 = localDateTime3.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology9 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone8);
        org.joda.time.DateTime dateTime10 = localDateTime3.toDateTime(dateTimeZone8);
        long long11 = dateTime10.getMillis();
        long long12 = dateTime10.getMillis();
        org.joda.time.Instant instant13 = dateTime10.toInstant();
        org.joda.time.DateTimeZone dateTimeZone14 = dateTime10.getZone();
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((long) 1);
        int int17 = localDateTime16.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.minusHours((int) (byte) -1);
        int int20 = localDateTime16.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime22 = localDateTime16.minusMinutes((int) '#');
        org.joda.time.LocalDateTime.Property property23 = localDateTime22.centuryOfEra();
        java.lang.String str24 = localDateTime22.toString();
        int int25 = localDateTime22.getWeekOfWeekyear();
        org.joda.time.LocalDateTime.Property property26 = localDateTime22.era();
        org.joda.time.LocalDateTime.Property property27 = localDateTime22.hourOfDay();
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime((long) 1);
        int int30 = localDateTime29.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime32 = localDateTime29.minusHours((int) (byte) -1);
        int int34 = localDateTime29.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime29.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod37 = null;
        org.joda.time.LocalDateTime localDateTime38 = localDateTime29.minus(readablePeriod37);
        int int39 = localDateTime38.getYearOfCentury();
        org.joda.time.LocalDateTime localDateTime41 = new org.joda.time.LocalDateTime((long) 1);
        int int42 = localDateTime41.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime44 = localDateTime41.minusHours((int) (byte) -1);
        int int46 = localDateTime41.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime48 = localDateTime41.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod49 = null;
        org.joda.time.LocalDateTime localDateTime50 = localDateTime41.minus(readablePeriod49);
        org.joda.time.LocalDateTime.Property property51 = localDateTime41.millisOfSecond();
        long long52 = property51.remainder();
        java.lang.String str53 = property51.getName();
        java.util.Locale locale54 = java.util.Locale.CHINA;
        java.lang.String str55 = property51.getAsText(locale54);
        org.joda.time.LocalDateTime localDateTime56 = property51.withMinimumValue();
        boolean boolean58 = property51.equals((java.lang.Object) 59);
        org.joda.time.LocalDateTime localDateTime59 = property51.getLocalDateTime();
        org.joda.time.LocalDateTime localDateTime61 = new org.joda.time.LocalDateTime((long) 1);
        int int62 = localDateTime61.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime64 = localDateTime61.withYear((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod65 = null;
        org.joda.time.LocalDateTime localDateTime67 = localDateTime64.withPeriodAdded(readablePeriod65, 10);
        org.joda.time.LocalDateTime localDateTime69 = localDateTime67.withDayOfYear(11);
        org.joda.time.Chronology chronology70 = localDateTime69.getChronology();
        org.joda.time.DateTimeFieldType dateTimeFieldType72 = localDateTime69.getFieldType((int) (byte) 0);
        int int73 = localDateTime59.indexOf(dateTimeFieldType72);
        int int74 = localDateTime38.get(dateTimeFieldType72);
        org.joda.time.LocalDateTime.Property property75 = localDateTime22.property(dateTimeFieldType72);
        int int76 = dateTime10.get(dateTimeFieldType72);
        int int77 = localDateTime1.indexOf(dateTimeFieldType72);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and instant13", (dateTime10.compareTo(instant13) == 0) == dateTime10.equals(instant13));
    }

    @Test
    public void test722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test722");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = islamicChronology2.years();
        org.joda.time.DateTimeZone dateTimeZone5 = islamicChronology2.getZone();
        org.joda.time.chrono.IslamicChronology islamicChronology6 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology9 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone8);
        org.joda.time.DurationField durationField10 = islamicChronology9.weekyears();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology9.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone12 = islamicChronology9.getZone();
        long long16 = dateTimeZone12.convertLocalToUTC(19360364951766L, false, 17763839999999L);
        int int18 = dateTimeZone12.getOffsetFromLocal((long) (-364));
        org.joda.time.Chronology chronology19 = islamicChronology6.withZone(dateTimeZone12);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField10", (durationField4.compareTo(durationField10) == 0) == durationField4.equals(durationField10));
    }

    @Test
    public void test723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test723");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = islamicChronology2.years();
        org.joda.time.DurationField durationField5 = islamicChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology2.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology2.era();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology11 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone10);
        org.joda.time.DurationField durationField12 = islamicChronology11.weekyears();
        org.joda.time.DurationField durationField13 = islamicChronology11.months();
        org.joda.time.DateTimeField dateTimeField14 = islamicChronology11.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology17 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone16);
        org.joda.time.DurationField durationField18 = islamicChronology17.weekyears();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology21 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone20);
        boolean boolean23 = dateTimeZone20.equals((java.lang.Object) 10L);
        org.joda.time.Chronology chronology24 = islamicChronology17.withZone(dateTimeZone20);
        org.joda.time.DateTimeField dateTimeField25 = islamicChronology17.hourOfHalfday();
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime((long) 1);
        int int28 = localDateTime27.getHourOfDay();
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology31 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone30);
        org.joda.time.DateTimeField dateTimeField32 = islamicChronology31.weekyear();
        org.joda.time.ReadablePartial readablePartial33 = null;
        int[] intArray40 = new int[] { (short) 100, 10, 100, (short) -1, (byte) 10 };
        int[] intArray42 = dateTimeField32.addWrapPartial(readablePartial33, 100, intArray40, (int) (short) 0);
        int int43 = dateTimeField25.getMaximumValue((org.joda.time.ReadablePartial) localDateTime27, intArray40);
        org.joda.time.LocalDateTime localDateTime45 = new org.joda.time.LocalDateTime((long) 1);
        int int46 = localDateTime45.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime48 = localDateTime45.minusHours((int) (byte) -1);
        int int50 = localDateTime45.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime52 = localDateTime45.withMillisOfSecond((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime53 = localDateTime27.withFields((org.joda.time.ReadablePartial) localDateTime52);
        int int54 = dateTimeField14.getMinimumValue((org.joda.time.ReadablePartial) localDateTime53);
        org.joda.time.DateTimeZone dateTimeZone56 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology57 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone56);
        org.joda.time.DurationField durationField58 = islamicChronology57.weekyears();
        org.joda.time.DurationField durationField59 = islamicChronology57.halfdays();
        org.joda.time.DateTimeField dateTimeField60 = islamicChronology57.yearOfEra();
        org.joda.time.DurationField durationField61 = islamicChronology57.halfdays();
        org.joda.time.LocalDateTime localDateTime62 = new org.joda.time.LocalDateTime((org.joda.time.Chronology) islamicChronology57);
        int int63 = dateTimeField14.getMinimumValue((org.joda.time.ReadablePartial) localDateTime62);
        org.joda.time.DateTimeZone dateTimeZone66 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology67 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone66);
        org.joda.time.DateTimeField dateTimeField68 = islamicChronology67.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField69 = islamicChronology67.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime72 = new org.joda.time.LocalDateTime((long) 1);
        int int73 = localDateTime72.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime75 = localDateTime72.minusHours((int) (byte) -1);
        int int77 = localDateTime72.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime79 = localDateTime72.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod80 = null;
        org.joda.time.LocalDateTime localDateTime81 = localDateTime72.minus(readablePeriod80);
        org.joda.time.LocalDateTime.Property property82 = localDateTime72.millisOfSecond();
        long long83 = property82.remainder();
        java.util.Locale locale84 = java.util.Locale.KOREA;
        java.util.Locale locale85 = java.util.Locale.KOREA;
        java.lang.String str86 = locale84.getDisplayLanguage(locale85);
        java.util.Locale.setDefault(locale84);
        int int88 = property82.getMaximumShortTextLength(locale84);
        java.lang.String str89 = dateTimeField69.getAsShortText((-4319999989L), locale84);
        java.lang.String str90 = dateTimeField14.getAsText(3, locale84);
        java.lang.String str91 = locale84.toLanguageTag();
        java.lang.String str92 = locale84.getScript();
        java.lang.String str93 = dateTimeField7.getAsShortText(19360357968715L, locale84);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField12", (durationField4.compareTo(durationField12) == 0) == durationField4.equals(durationField12));
    }

    @Test
    public void test724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test724");
        java.util.Set<java.lang.String> strSet0 = org.joda.time.DateTimeZone.getAvailableIDs();
        java.util.Locale locale1 = java.util.Locale.KOREA;
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleAttributes();
        java.util.Locale locale3 = java.util.Locale.KOREA;
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleAttributes();
        boolean boolean5 = strSet2.removeAll((java.util.Collection<java.lang.String>) strSet4);
        boolean boolean6 = strSet0.addAll((java.util.Collection<java.lang.String>) strSet2);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology9 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone8);
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology9.yearOfCentury();
        org.joda.time.DurationField durationField11 = islamicChronology9.years();
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
        int[] intArray28 = islamicChronology9.get((org.joda.time.ReadablePartial) localDateTime22, (long) 0);
        org.joda.time.DateTimeField dateTimeField29 = islamicChronology9.millisOfDay();
        org.joda.time.DurationField durationField30 = islamicChronology9.centuries();
        org.joda.time.DateTimeZone dateTimeZone31 = islamicChronology9.getZone();
        org.joda.time.DateTimeField dateTimeField32 = islamicChronology9.dayOfWeek();
        org.joda.time.DurationField durationField33 = islamicChronology9.weeks();
        org.joda.time.DurationField durationField34 = islamicChronology9.hours();
        org.joda.time.DateTimeField dateTimeField35 = islamicChronology9.centuryOfEra();
        boolean boolean36 = strSet0.equals((java.lang.Object) islamicChronology9);
        java.util.TimeZone timeZone38 = java.util.TimeZone.getTimeZone("");
        java.util.TimeZone timeZone40 = java.util.TimeZone.getTimeZone("");
        boolean boolean41 = timeZone38.hasSameRules(timeZone40);
        timeZone40.setRawOffset(11);
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.forTimeZone(timeZone40);
        java.util.Locale locale46 = java.util.Locale.KOREA;
        java.util.Set<java.lang.String> strSet47 = locale46.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.Character> charSet48 = locale46.getExtensionKeys();
        java.util.Locale.Category category49 = java.util.Locale.Category.DISPLAY;
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology52 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone51);
        boolean boolean54 = dateTimeZone51.equals((java.lang.Object) 10L);
        java.util.Locale locale56 = java.util.Locale.JAPAN;
        java.lang.String str57 = locale56.getISO3Country();
        java.lang.String str58 = dateTimeZone51.getShortName(1970L, locale56);
        java.util.Set<java.lang.String> strSet59 = locale56.getUnicodeLocaleKeys();
        java.lang.String str60 = locale56.getCountry();
        java.util.Locale.setDefault(category49, locale56);
        java.util.Locale locale62 = java.util.Locale.getDefault(category49);
        java.lang.String str63 = locale46.getDisplayCountry(locale62);
        java.lang.String str64 = dateTimeZone44.getName(6048000000L, locale46);
        org.joda.time.Chronology chronology65 = islamicChronology9.withZone(dateTimeZone44);
        org.joda.time.DurationField durationField66 = chronology65.hours();
        org.joda.time.DurationField durationField67 = chronology65.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField34 and durationField66", (durationField34.compareTo(durationField66) == 0) == durationField34.equals(durationField66));
    }

    @Test
    public void test725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test725");
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
        int int31 = localDateTime29.getValue(0);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime29.withYearOfEra(17);
        org.joda.time.LocalDateTime localDateTime35 = localDateTime33.plusDays(3600001);
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology38 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone37);
        org.joda.time.DateTimeField dateTimeField39 = islamicChronology38.yearOfCentury();
        org.joda.time.DurationField durationField40 = islamicChronology38.years();
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime((long) 1);
        int int43 = localDateTime42.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime45 = localDateTime42.minusHours((int) (byte) -1);
        int int47 = localDateTime42.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime49 = localDateTime42.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod50 = null;
        org.joda.time.LocalDateTime localDateTime51 = localDateTime42.minus(readablePeriod50);
        int int52 = localDateTime51.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField54 = localDateTime51.getField(0);
        org.joda.time.LocalDateTime.Property property55 = localDateTime51.centuryOfEra();
        int[] intArray57 = islamicChronology38.get((org.joda.time.ReadablePartial) localDateTime51, (long) 0);
        org.joda.time.DateTimeField dateTimeField58 = islamicChronology38.millisOfDay();
        org.joda.time.DurationField durationField59 = islamicChronology38.centuries();
        org.joda.time.DateTimeZone dateTimeZone60 = islamicChronology38.getZone();
        org.joda.time.DateTimeField dateTimeField61 = islamicChronology38.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime62 = new org.joda.time.LocalDateTime();
        int[] intArray64 = islamicChronology38.get((org.joda.time.ReadablePartial) localDateTime62, 10L);
        org.joda.time.DateTimeField dateTimeField65 = islamicChronology38.secondOfDay();
        org.joda.time.DateTimeField dateTimeField66 = islamicChronology38.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField67 = islamicChronology38.secondOfDay();
        org.joda.time.DurationField durationField68 = islamicChronology38.centuries();
        org.joda.time.DurationField durationField69 = islamicChronology38.hours();
        long long72 = durationField69.getMillis(47, 20217598041L);
        boolean boolean73 = localDateTime33.equals((java.lang.Object) durationField69);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField40", (durationField3.compareTo(durationField40) == 0) == durationField3.equals(durationField40));
    }

    @Test
    public void test726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test726");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DurationField durationField4 = islamicChronology2.months();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.halfdayOfDay();
        org.joda.time.DurationField durationField6 = islamicChronology2.millis();
        java.lang.String str7 = islamicChronology2.toString();
        org.joda.time.DurationField durationField8 = islamicChronology2.years();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology2.hourOfHalfday();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField8", (durationField3.compareTo(durationField8) == 0) == durationField3.equals(durationField8));
    }

    @Test
    public void test727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test727");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        int int3 = islamicChronology2.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology2.weekyear();
        org.joda.time.DurationField durationField5 = islamicChronology2.hours();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology2.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology2.hourOfDay();
        org.joda.time.DurationField durationField9 = islamicChronology2.eras();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology2.clockhourOfHalfday();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField5 and durationField9", Math.signum(durationField5.compareTo(durationField9)) == -Math.signum(durationField9.compareTo(durationField5)));
    }

    @Test
    public void test728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test728");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology2.hourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 0);
        org.joda.time.Chronology chronology8 = islamicChronology2.withZone(dateTimeZone7);
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology2.yearOfCentury();
        org.joda.time.DurationField durationField10 = islamicChronology2.years();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology2.dayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField10", (durationField3.compareTo(durationField10) == 0) == durationField3.equals(durationField10));
    }

    @Test
    public void test729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test729");
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
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology23 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone22);
        org.joda.time.DurationField durationField24 = islamicChronology23.weekyears();
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology27 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone26);
        boolean boolean29 = dateTimeZone26.equals((java.lang.Object) 10L);
        org.joda.time.Chronology chronology30 = islamicChronology23.withZone(dateTimeZone26);
        org.joda.time.DateTimeField dateTimeField31 = islamicChronology23.hourOfHalfday();
        org.joda.time.DurationField durationField32 = dateTimeField31.getRangeDurationField();
        boolean boolean33 = dateTime17.equals((java.lang.Object) durationField32);
        org.joda.time.Instant instant34 = dateTime17.toInstant();
        org.joda.time.LocalDateTime localDateTime36 = new org.joda.time.LocalDateTime((long) 1);
        int int37 = localDateTime36.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime39 = localDateTime36.minusHours((int) (byte) -1);
        int int41 = localDateTime36.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime43 = localDateTime36.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod44 = null;
        org.joda.time.LocalDateTime localDateTime45 = localDateTime36.minus(readablePeriod44);
        org.joda.time.LocalDateTime.Property property46 = localDateTime36.millisOfSecond();
        long long47 = property46.remainder();
        java.lang.String str48 = property46.getName();
        java.util.Locale locale49 = java.util.Locale.CHINA;
        java.lang.String str50 = property46.getAsText(locale49);
        org.joda.time.LocalDateTime localDateTime51 = property46.withMinimumValue();
        org.joda.time.LocalDateTime localDateTime53 = localDateTime51.plusYears(4);
        org.joda.time.ReadablePeriod readablePeriod54 = null;
        org.joda.time.LocalDateTime localDateTime55 = localDateTime53.plus(readablePeriod54);
        org.joda.time.DateTimeZone dateTimeZone57 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology58 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone57);
        org.joda.time.DurationField durationField59 = islamicChronology58.weekyears();
        org.joda.time.DurationField durationField60 = islamicChronology58.halfdays();
        org.joda.time.DurationField durationField61 = islamicChronology58.weeks();
        org.joda.time.DateTimeField dateTimeField62 = islamicChronology58.yearOfEra();
        org.joda.time.LocalDateTime localDateTime64 = new org.joda.time.LocalDateTime((long) 1);
        int int65 = localDateTime64.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime67 = localDateTime64.minusHours((int) (byte) -1);
        org.joda.time.DateTimeField[] dateTimeFieldArray68 = localDateTime67.getFields();
        java.util.Locale locale69 = java.util.Locale.KOREA;
        java.util.Locale locale70 = java.util.Locale.KOREA;
        java.lang.String str71 = locale69.getDisplayLanguage(locale70);
        java.lang.String str72 = dateTimeField62.getAsText((org.joda.time.ReadablePartial) localDateTime67, locale69);
        org.joda.time.DateTimeFieldType dateTimeFieldType73 = dateTimeField62.getType();
        org.joda.time.LocalDateTime localDateTime75 = localDateTime53.withField(dateTimeFieldType73, (int) ' ');
        boolean boolean76 = instant34.isSupported(dateTimeFieldType73);
        long long77 = instant34.getMillis();
        org.joda.time.Chronology chronology78 = instant34.getChronology();
        org.joda.time.DateTimeField dateTimeField79 = chronology78.hourOfHalfday();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and instant34", (dateTime8.compareTo(instant34) == 0) == dateTime8.equals(instant34));
    }

    @Test
    public void test730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test730");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology2.hourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.millisOfSecond();
        java.lang.String str6 = islamicChronology2.toString();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology2.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology2.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology2.clockhourOfHalfday();
        org.joda.time.DurationField durationField10 = islamicChronology2.years();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology2.millisOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField10", (durationField3.compareTo(durationField10) == 0) == durationField3.equals(durationField10));
    }

    @Test
    public void test731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test731");
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
        org.joda.time.DateTimeZone dateTimeZone39 = islamicChronology2.getZone();
        org.joda.time.DurationField durationField40 = islamicChronology2.centuries();
        org.joda.time.DurationField durationField41 = islamicChronology2.halfdays();
        org.joda.time.DurationField durationField42 = islamicChronology2.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField42, durationField5, and durationField18", !(durationField42.compareTo(durationField5) == 0) || (Math.signum(durationField42.compareTo(durationField18)) == Math.signum(durationField5.compareTo(durationField18))));
    }
}

