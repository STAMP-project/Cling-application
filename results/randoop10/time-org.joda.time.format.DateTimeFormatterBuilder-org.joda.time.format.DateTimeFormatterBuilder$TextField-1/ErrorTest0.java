import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test001");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale3);
        org.joda.time.Chronology chronology5 = dateTimeParserBucket4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = chronology5.clockhourOfDay();
        org.joda.time.DurationField durationField9 = chronology5.hours();
        org.joda.time.DurationField durationField10 = chronology5.years();
        org.joda.time.DurationField durationField11 = chronology5.hours();
        org.joda.time.DateTimeField dateTimeField12 = chronology5.year();
        org.joda.time.DurationField durationField13 = chronology5.halfdays();
        org.joda.time.DurationField durationField14 = chronology5.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField14, durationField9, and durationField10", !(durationField14.compareTo(durationField9) == 0) || (Math.signum(durationField14.compareTo(durationField10)) == Math.signum(durationField9.compareTo(durationField10))));
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale3);
        org.joda.time.Chronology chronology5 = dateTimeParserBucket4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = chronology5.hourOfHalfday();
        org.joda.time.DurationField durationField8 = chronology5.hours();
        org.joda.time.DurationField durationField9 = chronology5.seconds();
        org.joda.time.DateTimeField dateTimeField10 = chronology5.era();
        org.joda.time.DurationField durationField11 = chronology5.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField11, durationField8, and durationField9", !(durationField11.compareTo(durationField8) == 0) || (Math.signum(durationField11.compareTo(durationField9)) == Math.signum(durationField8.compareTo(durationField9))));
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale3);
        org.joda.time.Chronology chronology5 = dateTimeParserBucket4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = chronology5.clockhourOfDay();
        org.joda.time.DurationField durationField9 = chronology5.hours();
        org.joda.time.DurationField durationField10 = chronology5.years();
        org.joda.time.DurationField durationField11 = chronology5.hours();
        org.joda.time.DateTimeField dateTimeField12 = chronology5.year();
        org.joda.time.DurationField durationField13 = chronology5.halfdays();
        long long17 = chronology5.add(0L, (long) '4', (int) (byte) 10);
        org.joda.time.DateTimeField dateTimeField18 = chronology5.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField19 = chronology5.minuteOfHour();
        org.joda.time.DurationField durationField20 = chronology5.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField20, durationField9, and durationField10", !(durationField20.compareTo(durationField9) == 0) || (Math.signum(durationField20.compareTo(durationField10)) == Math.signum(durationField9.compareTo(durationField10))));
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale3);
        org.joda.time.Chronology chronology5 = dateTimeParserBucket4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = chronology5.hourOfHalfday();
        org.joda.time.DurationField durationField8 = chronology5.hours();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 0);
        java.lang.String str12 = dateTimeZone10.getNameKey(1L);
        java.util.Locale locale14 = java.util.Locale.TAIWAN;
        java.lang.String str15 = dateTimeZone10.getName(100L, locale14);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone10);
        org.joda.time.Chronology chronology17 = chronology5.withZone(dateTimeZone10);
        org.joda.time.DurationField durationField18 = chronology5.halfdays();
        org.joda.time.DurationField durationField19 = chronology5.halfdays();
        org.joda.time.DurationField durationField20 = chronology5.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField20, durationField8, and durationField18", !(durationField20.compareTo(durationField8) == 0) || (Math.signum(durationField20.compareTo(durationField18)) == Math.signum(durationField8.compareTo(durationField18))));
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale3);
        org.joda.time.DateTimeField dateTimeField5 = null;
        dateTimeParserBucket4.saveField(dateTimeField5, (int) (byte) 0);
        java.util.Locale locale8 = dateTimeParserBucket4.getLocale();
        org.joda.time.Chronology chronology9 = dateTimeParserBucket4.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.eras();
        long long14 = chronology9.add((long) 'a', (long) 120, 97);
        org.joda.time.DurationField durationField15 = chronology9.months();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField10, durationField15, and durationField10", !(durationField10.compareTo(durationField15) == 0) || (Math.signum(durationField10.compareTo(durationField10)) == Math.signum(durationField15.compareTo(durationField10))));
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale3);
        org.joda.time.Chronology chronology5 = dateTimeParserBucket4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = chronology5.yearOfEra();
        org.joda.time.DurationField durationField8 = chronology5.hours();
        org.joda.time.Chronology chronology9 = chronology5.withUTC();
        org.joda.time.DurationField durationField10 = chronology5.seconds();
        org.joda.time.DateTimeField dateTimeField11 = chronology5.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str14 = dateTimeZone12.getName(97L);
        org.joda.time.Chronology chronology17 = null;
        java.util.Locale locale19 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket20 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology17, locale19);
        java.lang.String str21 = dateTimeZone12.getName((long) (byte) 10, locale19);
        long long25 = dateTimeZone12.convertLocalToUTC((long) 0, true, (long) 10);
        int int27 = dateTimeZone12.getOffset((long) 'u');
        org.joda.time.Chronology chronology28 = chronology5.withZone(dateTimeZone12);
        java.lang.String str29 = chronology5.toString();
        org.joda.time.DurationField durationField30 = chronology5.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField30, durationField8, and durationField10", !(durationField30.compareTo(durationField8) == 0) || (Math.signum(durationField30.compareTo(durationField10)) == Math.signum(durationField8.compareTo(durationField10))));
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale3);
        org.joda.time.Chronology chronology5 = dateTimeParserBucket4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = chronology5.clockhourOfDay();
        org.joda.time.DurationField durationField9 = chronology5.hours();
        org.joda.time.DurationField durationField10 = chronology5.years();
        org.joda.time.DurationField durationField11 = chronology5.hours();
        org.joda.time.DateTimeField dateTimeField12 = chronology5.year();
        org.joda.time.DurationField durationField13 = chronology5.halfdays();
        org.joda.time.DateTimeField dateTimeField14 = chronology5.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField15 = chronology5.yearOfEra();
        org.joda.time.DurationField durationField16 = chronology5.years();
        org.joda.time.DurationField durationField17 = chronology5.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField17, durationField9, and durationField10", !(durationField17.compareTo(durationField9) == 0) || (Math.signum(durationField17.compareTo(durationField10)) == Math.signum(durationField9.compareTo(durationField10))));
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale3);
        org.joda.time.DateTimeField dateTimeField5 = null;
        dateTimeParserBucket4.saveField(dateTimeField5, (int) (byte) 0);
        java.util.Locale locale8 = dateTimeParserBucket4.getLocale();
        java.lang.Object obj9 = dateTimeParserBucket4.saveState();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder10.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder12.appendTimeZoneId();
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder13.appendFixedDecimal(dateTimeFieldType14, (int) '4');
        dateTimeParserBucket4.saveField(dateTimeFieldType14, (int) (short) 1);
        java.lang.String str19 = dateTimeFieldType14.toString();
        org.joda.time.Chronology chronology21 = null;
        java.util.Locale locale23 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket24 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology21, locale23);
        org.joda.time.Chronology chronology25 = dateTimeParserBucket24.getChronology();
        org.joda.time.DateTimeField dateTimeField26 = chronology25.dayOfYear();
        org.joda.time.DateTimeField dateTimeField27 = chronology25.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField28 = chronology25.clockhourOfDay();
        org.joda.time.DurationField durationField29 = chronology25.weekyears();
        org.joda.time.DateTimeField dateTimeField30 = dateTimeFieldType14.getField(chronology25);
        org.joda.time.DurationField durationField31 = chronology25.years();
        org.joda.time.DateTimeField dateTimeField32 = chronology25.millisOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField29 and durationField31", (durationField29.compareTo(durationField31) == 0) == durationField29.equals(durationField31));
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale3);
        org.joda.time.DateTimeField dateTimeField5 = null;
        dateTimeParserBucket4.saveField(dateTimeField5, (int) (byte) 0);
        java.util.Locale locale8 = dateTimeParserBucket4.getLocale();
        org.joda.time.Chronology chronology9 = dateTimeParserBucket4.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.eras();
        org.joda.time.DurationField durationField11 = chronology9.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField10, durationField11, and durationField10", !(durationField10.compareTo(durationField11) == 0) || (Math.signum(durationField10.compareTo(durationField10)) == Math.signum(durationField11.compareTo(durationField10))));
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale4 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology2, locale4);
        org.joda.time.Chronology chronology6 = dateTimeParserBucket5.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.dayOfYear();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.yearOfEra();
        org.joda.time.DurationField durationField9 = chronology6.days();
        java.lang.String str10 = chronology6.toString();
        java.util.Locale locale12 = java.util.Locale.forLanguageTag("hi!");
        java.util.Set<java.lang.String> strSet13 = locale12.getUnicodeLocaleKeys();
        java.lang.String str14 = locale12.getDisplayScript();
        java.lang.String str15 = locale12.getCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket((long) (short) 10, chronology6, locale12, (java.lang.Integer) 10);
        org.joda.time.DurationField durationField18 = chronology6.days();
        org.joda.time.DurationField durationField19 = chronology6.years();
        org.joda.time.DurationField durationField20 = chronology6.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField20, durationField9, and durationField19", !(durationField20.compareTo(durationField9) == 0) || (Math.signum(durationField20.compareTo(durationField19)) == Math.signum(durationField9.compareTo(durationField19))));
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale3);
        org.joda.time.Chronology chronology5 = dateTimeParserBucket4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = chronology5.hourOfHalfday();
        org.joda.time.DurationField durationField8 = chronology5.hours();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 0);
        java.lang.String str12 = dateTimeZone10.getNameKey(1L);
        java.util.Locale locale14 = java.util.Locale.TAIWAN;
        java.lang.String str15 = dateTimeZone10.getName(100L, locale14);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone10);
        org.joda.time.Chronology chronology17 = chronology5.withZone(dateTimeZone10);
        org.joda.time.DurationField durationField18 = chronology5.halfdays();
        org.joda.time.DurationField durationField19 = chronology5.halfdays();
        org.joda.time.DurationField durationField20 = chronology5.minutes();
        org.joda.time.DateTimeField dateTimeField21 = chronology5.dayOfYear();
        org.joda.time.DurationField durationField22 = chronology5.halfdays();
        org.joda.time.DurationField durationField23 = chronology5.millis();
        org.joda.time.DurationField durationField24 = chronology5.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField24, durationField8, and durationField18", !(durationField24.compareTo(durationField8) == 0) || (Math.signum(durationField24.compareTo(durationField18)) == Math.signum(durationField8.compareTo(durationField18))));
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale3);
        org.joda.time.Chronology chronology5 = dateTimeParserBucket4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = chronology5.yearOfEra();
        org.joda.time.DurationField durationField8 = chronology5.hours();
        org.joda.time.DateTimeField dateTimeField9 = chronology5.secondOfMinute();
        org.joda.time.Chronology chronology10 = chronology5.withUTC();
        org.joda.time.DurationField durationField11 = chronology10.weeks();
        org.joda.time.DateTimeField dateTimeField12 = chronology10.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField13 = chronology10.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField14 = chronology10.clockhourOfHalfday();
        org.joda.time.DurationField durationField15 = chronology10.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField15, durationField8, and durationField11", !(durationField15.compareTo(durationField8) == 0) || (Math.signum(durationField15.compareTo(durationField11)) == Math.signum(durationField8.compareTo(durationField11))));
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale3);
        org.joda.time.Chronology chronology5 = dateTimeParserBucket4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = chronology5.hourOfHalfday();
        org.joda.time.DurationField durationField8 = chronology5.hours();
        org.joda.time.DurationField durationField9 = chronology5.seconds();
        org.joda.time.DateTimeField dateTimeField10 = chronology5.era();
        org.joda.time.DateTimeField dateTimeField11 = chronology5.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField12 = chronology5.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField13 = chronology5.weekyearOfCentury();
        org.joda.time.DurationField durationField14 = chronology5.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField14, durationField8, and durationField9", !(durationField14.compareTo(durationField8) == 0) || (Math.signum(durationField14.compareTo(durationField9)) == Math.signum(durationField8.compareTo(durationField9))));
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale3);
        org.joda.time.DateTimeField dateTimeField5 = null;
        dateTimeParserBucket4.saveField(dateTimeField5, (int) (byte) 0);
        java.util.Locale locale8 = dateTimeParserBucket4.getLocale();
        java.lang.Object obj9 = dateTimeParserBucket4.saveState();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder10.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder12.appendTimeZoneId();
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder13.appendFixedDecimal(dateTimeFieldType14, (int) '4');
        dateTimeParserBucket4.saveField(dateTimeFieldType14, (int) (short) 1);
        java.lang.String str19 = dateTimeFieldType14.toString();
        org.joda.time.Chronology chronology21 = null;
        java.util.Locale locale23 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket24 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology21, locale23);
        org.joda.time.Chronology chronology25 = dateTimeParserBucket24.getChronology();
        org.joda.time.DateTimeField dateTimeField26 = chronology25.dayOfYear();
        org.joda.time.DateTimeField dateTimeField27 = chronology25.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField28 = chronology25.clockhourOfDay();
        org.joda.time.DurationField durationField29 = chronology25.weekyears();
        org.joda.time.DateTimeField dateTimeField30 = dateTimeFieldType14.getField(chronology25);
        org.joda.time.DurationField durationField31 = chronology25.years();
        org.joda.time.DateTimeField dateTimeField32 = chronology25.secondOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField29 and durationField31", (durationField29.compareTo(durationField31) == 0) == durationField29.equals(durationField31));
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology4 = null;
        java.util.Locale locale6 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology4, locale6);
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withChronology(chronology8);
        boolean boolean10 = dateTimeFormatter9.isPrinter();
        org.joda.time.Chronology chronology11 = dateTimeFormatter9.getChronolgy();
        org.joda.time.DurationField durationField12 = chronology11.hours();
        org.joda.time.DateTimeField dateTimeField13 = chronology11.monthOfYear();
        org.joda.time.DurationField durationField14 = chronology11.minutes();
        org.joda.time.DurationField durationField15 = chronology11.months();
        org.joda.time.DurationField durationField16 = chronology11.days();
        org.joda.time.DurationField durationField17 = chronology11.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField17, durationField12, and durationField14", !(durationField17.compareTo(durationField12) == 0) || (Math.signum(durationField17.compareTo(durationField14)) == Math.signum(durationField12.compareTo(durationField14))));
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser4 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter5.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter7.withDefaultYear((-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter9.withPivotYear((int) 'u');
        org.joda.time.Chronology chronology13 = null;
        java.util.Locale locale15 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology13, locale15);
        org.joda.time.Chronology chronology17 = dateTimeParserBucket16.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.dayOfYear();
        org.joda.time.DateTimeField dateTimeField19 = chronology17.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField20 = chronology17.clockhourOfDay();
        org.joda.time.DurationField durationField21 = chronology17.hours();
        org.joda.time.DurationField durationField22 = chronology17.years();
        org.joda.time.DurationField durationField23 = chronology17.hours();
        org.joda.time.DateTimeField dateTimeField24 = chronology17.year();
        org.joda.time.DurationField durationField25 = chronology17.halfdays();
        long long29 = chronology17.add(0L, (long) '4', (int) (byte) 10);
        org.joda.time.DateTimeField dateTimeField30 = chronology17.clockhourOfDay();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = dateTimeFormatter9.withChronology(chronology17);
        org.joda.time.format.DateTimePrinter dateTimePrinter32 = dateTimeFormatter9.getPrinter();
        org.joda.time.Chronology chronology34 = null;
        java.util.Locale locale36 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket37 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology34, locale36);
        dateTimeParserBucket37.setPivotYear((java.lang.Integer) 0);
        java.util.Locale locale40 = dateTimeParserBucket37.getLocale();
        java.util.Set<java.lang.String> strSet41 = locale40.getUnicodeLocaleKeys();
        java.util.Set<java.lang.String> strSet42 = locale40.getUnicodeLocaleAttributes();
        org.joda.time.Chronology chronology45 = null;
        java.util.Locale locale47 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket48 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology45, locale47);
        org.joda.time.Chronology chronology49 = dateTimeParserBucket48.getChronology();
        org.joda.time.DateTimeField dateTimeField50 = chronology49.dayOfYear();
        org.joda.time.DateTimeField dateTimeField51 = chronology49.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField52 = chronology49.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField53 = chronology49.year();
        org.joda.time.DurationField durationField54 = chronology49.weeks();
        org.joda.time.DurationField durationField55 = chronology49.weekyears();
        java.util.Locale locale57 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale58 = locale57.stripExtensions();
        java.util.Locale locale59 = java.util.Locale.GERMANY;
        java.lang.String str60 = locale57.getDisplayLanguage(locale59);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket63 = new org.joda.time.format.DateTimeParserBucket((long) (short) 100, chronology49, locale57, (java.lang.Integer) 3600000, 0);
        java.util.Locale locale65 = new java.util.Locale("fr");
        java.util.Locale locale66 = java.util.Locale.FRENCH;
        java.lang.String str67 = locale66.toLanguageTag();
        java.lang.String str68 = locale65.getDisplayLanguage(locale66);
        java.util.Locale locale69 = null;
        java.lang.String str70 = locale65.getDisplayCountry(locale69);
        java.lang.String str71 = locale65.getISO3Language();
        java.lang.String str72 = locale57.getDisplayLanguage(locale65);
        java.lang.String str73 = locale40.getDisplayCountry(locale65);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter74 = dateTimeFormatter9.withLocale(locale40);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField22 and durationField55", (durationField22.compareTo(durationField55) == 0) == durationField22.equals(durationField55));
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale3);
        org.joda.time.DateTimeField dateTimeField5 = null;
        dateTimeParserBucket4.saveField(dateTimeField5, (int) (byte) 0);
        java.util.Locale locale8 = dateTimeParserBucket4.getLocale();
        org.joda.time.Chronology chronology9 = dateTimeParserBucket4.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.eras();
        long long14 = chronology9.add((long) 'a', (long) 120, 97);
        org.joda.time.DurationField durationField15 = chronology9.years();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField10, durationField15, and durationField10", !(durationField10.compareTo(durationField15) == 0) || (Math.signum(durationField10.compareTo(durationField10)) == Math.signum(durationField15.compareTo(durationField10))));
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale4 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology2, locale4);
        org.joda.time.Chronology chronology6 = dateTimeParserBucket5.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.dayOfYear();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField9 = chronology6.clockhourOfDay();
        org.joda.time.DurationField durationField10 = chronology6.hours();
        org.joda.time.DurationField durationField11 = chronology6.years();
        org.joda.time.DurationField durationField12 = chronology6.hours();
        org.joda.time.DateTimeField dateTimeField13 = chronology6.year();
        org.joda.time.DurationField durationField14 = chronology6.halfdays();
        org.joda.time.DateTimeField dateTimeField15 = chronology6.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField16 = chronology6.yearOfEra();
        org.joda.time.DateTimeField dateTimeField17 = chronology6.minuteOfDay();
        org.joda.time.DurationField durationField18 = chronology6.millis();
        org.joda.time.DateTimeField dateTimeField19 = chronology6.weekyearOfCentury();
        org.joda.time.DurationField durationField20 = chronology6.weekyears();
        org.joda.time.Chronology chronology22 = null;
        java.util.Locale locale24 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket25 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology22, locale24);
        dateTimeParserBucket25.setPivotYear((java.lang.Integer) 0);
        java.util.Locale locale28 = dateTimeParserBucket25.getLocale();
        java.util.Set<java.lang.String> strSet29 = locale28.getUnicodeLocaleKeys();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket31 = new org.joda.time.format.DateTimeParserBucket((-89999948L), chronology6, locale28, (java.lang.Integer) 36000000);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField11 and durationField20", (durationField11.compareTo(durationField20) == 0) == durationField11.equals(durationField20));
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale3);
        org.joda.time.Chronology chronology5 = dateTimeParserBucket4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = chronology5.yearOfEra();
        org.joda.time.DurationField durationField8 = chronology5.days();
        org.joda.time.DurationField durationField9 = chronology5.years();
        org.joda.time.DateTimeField dateTimeField10 = chronology5.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.Chronology chronology13 = chronology5.withZone(dateTimeZone12);
        org.joda.time.DateTimeField dateTimeField14 = chronology5.millisOfSecond();
        org.joda.time.DurationField durationField15 = chronology5.hours();
        org.joda.time.DurationField durationField16 = chronology5.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField16, durationField8, and durationField9", !(durationField16.compareTo(durationField8) == 0) || (Math.signum(durationField16.compareTo(durationField9)) == Math.signum(durationField8.compareTo(durationField9))));
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale3);
        org.joda.time.Chronology chronology5 = dateTimeParserBucket4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = chronology5.clockhourOfDay();
        org.joda.time.DurationField durationField9 = chronology5.weekyears();
        org.joda.time.DurationField durationField10 = chronology5.hours();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        long long14 = chronology5.add(readablePeriod11, (long) 3600000, 187200000);
        org.joda.time.DurationField durationField15 = chronology5.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField15, durationField9, and durationField10", !(durationField15.compareTo(durationField9) == 0) || (Math.signum(durationField15.compareTo(durationField10)) == Math.signum(durationField9.compareTo(durationField10))));
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale3);
        org.joda.time.DateTimeField dateTimeField5 = null;
        dateTimeParserBucket4.saveField(dateTimeField5, (int) (byte) 0);
        java.util.Locale locale8 = dateTimeParserBucket4.getLocale();
        org.joda.time.Chronology chronology9 = dateTimeParserBucket4.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.eras();
        org.joda.time.DurationField durationField11 = chronology9.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField10, durationField11, and durationField10", !(durationField10.compareTo(durationField11) == 0) || (Math.signum(durationField10.compareTo(durationField10)) == Math.signum(durationField11.compareTo(durationField10))));
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale3);
        org.joda.time.Chronology chronology5 = dateTimeParserBucket4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = chronology5.clockhourOfDay();
        org.joda.time.DurationField durationField9 = chronology5.weekyears();
        org.joda.time.DateTimeField dateTimeField10 = chronology5.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 0);
        java.lang.String str14 = dateTimeZone12.getNameKey(1L);
        org.joda.time.LocalDateTime localDateTime15 = null;
        boolean boolean16 = dateTimeZone12.isLocalDateTimeGap(localDateTime15);
        java.util.TimeZone timeZone17 = dateTimeZone12.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.UTC;
        long long20 = dateTimeZone12.getMillisKeepLocal(dateTimeZone18, (long) 0);
        org.joda.time.Chronology chronology21 = chronology5.withZone(dateTimeZone12);
        org.joda.time.DurationField durationField22 = chronology5.years();
        org.joda.time.DurationField durationField23 = chronology5.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField9 and durationField22", (durationField9.compareTo(durationField22) == 0) == durationField9.equals(durationField22));
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale3);
        org.joda.time.Chronology chronology5 = dateTimeParserBucket4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = chronology5.clockhourOfDay();
        org.joda.time.DurationField durationField9 = chronology5.hours();
        org.joda.time.DurationField durationField10 = chronology5.years();
        org.joda.time.DurationField durationField11 = chronology5.hours();
        org.joda.time.DateTimeField dateTimeField12 = chronology5.year();
        org.joda.time.DurationField durationField13 = chronology5.halfdays();
        org.joda.time.DateTimeField dateTimeField14 = chronology5.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField15 = chronology5.yearOfEra();
        org.joda.time.DurationField durationField16 = chronology5.years();
        org.joda.time.DateTimeZone dateTimeZone17 = chronology5.getZone();
        org.joda.time.DurationField durationField18 = chronology5.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField18, durationField9, and durationField10", !(durationField18.compareTo(durationField9) == 0) || (Math.signum(durationField18.compareTo(durationField10)) == Math.signum(durationField9.compareTo(durationField10))));
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.dayOfWeek();
        org.joda.time.format.DateTimePrinter dateTimePrinter3 = null;
        org.joda.time.format.DateTimeParser dateTimeParser4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter3, dateTimeParser4);
        org.joda.time.Chronology chronology7 = null;
        java.util.Locale locale9 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket10 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology7, locale9);
        org.joda.time.Chronology chronology11 = dateTimeParserBucket10.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter5.withChronology(chronology11);
        org.joda.time.DateTimeField dateTimeField13 = chronology11.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField14 = dateTimeFieldType2.getField(chronology11);
        org.joda.time.DateTimeField dateTimeField15 = chronology11.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField16 = chronology11.halfdayOfDay();
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        long long20 = chronology11.add(readablePeriod17, (long) (byte) 10, (int) (byte) -1);
        org.joda.time.DurationField durationField21 = chronology11.seconds();
        java.util.Locale locale23 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale24 = locale23.stripExtensions();
        boolean boolean25 = locale24.hasExtensions();
        java.lang.String str26 = locale24.getDisplayLanguage();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket29 = new org.joda.time.format.DateTimeParserBucket((long) (short) 1, chronology11, locale24, (java.lang.Integer) 97, (int) (short) -1);
        java.util.Locale locale31 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale32 = locale31.stripExtensions();
        boolean boolean33 = locale32.hasExtensions();
        java.lang.String str34 = locale32.toLanguageTag();
        java.lang.String str35 = locale32.getScript();
        org.joda.time.format.DateTimePrinter dateTimePrinter37 = null;
        org.joda.time.format.DateTimeParser dateTimeParser38 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter39 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter37, dateTimeParser38);
        org.joda.time.Chronology chronology41 = null;
        java.util.Locale locale43 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket44 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology41, locale43);
        org.joda.time.Chronology chronology45 = dateTimeParserBucket44.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter46 = dateTimeFormatter39.withChronology(chronology45);
        boolean boolean47 = dateTimeFormatter46.isPrinter();
        org.joda.time.Chronology chronology48 = dateTimeFormatter46.getChronolgy();
        org.joda.time.DateTimeField dateTimeField49 = chronology48.dayOfMonth();
        java.util.Locale locale50 = java.util.Locale.GERMANY;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket53 = new org.joda.time.format.DateTimeParserBucket(0L, chronology48, locale50, (java.lang.Integer) 1, (int) (short) 10);
        java.util.Locale locale54 = dateTimeParserBucket53.getLocale();
        java.lang.String str55 = locale54.getCountry();
        java.lang.String str56 = locale32.getDisplayScript(locale54);
        java.lang.String str57 = locale32.getLanguage();
        java.lang.String str58 = locale32.toLanguageTag();
        java.util.Set<java.lang.String> strSet59 = locale32.getUnicodeLocaleKeys();
        java.lang.String str60 = locale32.getDisplayLanguage();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket62 = new org.joda.time.format.DateTimeParserBucket(1119L, chronology11, locale32, (java.lang.Integer) 360060000);
        org.joda.time.DurationField durationField63 = chronology11.eras();
        org.joda.time.DateTimeField dateTimeField64 = chronology11.dayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField21 and durationField63", Math.signum(durationField21.compareTo(durationField63)) == -Math.signum(durationField63.compareTo(durationField21)));
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale3);
        org.joda.time.Chronology chronology5 = dateTimeParserBucket4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = chronology5.yearOfEra();
        org.joda.time.DurationField durationField8 = chronology5.hours();
        org.joda.time.Chronology chronology9 = chronology5.withUTC();
        org.joda.time.DurationField durationField10 = chronology5.seconds();
        org.joda.time.DateTimeField dateTimeField11 = chronology5.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str14 = dateTimeZone12.getName(97L);
        org.joda.time.Chronology chronology17 = null;
        java.util.Locale locale19 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket20 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology17, locale19);
        java.lang.String str21 = dateTimeZone12.getName((long) (byte) 10, locale19);
        long long25 = dateTimeZone12.convertLocalToUTC((long) 0, true, (long) 10);
        int int27 = dateTimeZone12.getOffset((long) 'u');
        org.joda.time.Chronology chronology28 = chronology5.withZone(dateTimeZone12);
        java.lang.String str29 = chronology5.toString();
        org.joda.time.DateTimeField dateTimeField30 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField31 = chronology5.weekyear();
        org.joda.time.DateTimeField dateTimeField32 = chronology5.hourOfHalfday();
        org.joda.time.Chronology chronology33 = chronology5.withUTC();
        org.joda.time.DurationField durationField34 = chronology5.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField34, durationField8, and durationField10", !(durationField34.compareTo(durationField8) == 0) || (Math.signum(durationField34.compareTo(durationField10)) == Math.signum(durationField8.compareTo(durationField10))));
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale3);
        org.joda.time.Chronology chronology5 = dateTimeParserBucket4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = chronology5.hourOfHalfday();
        org.joda.time.DurationField durationField8 = chronology5.hours();
        org.joda.time.DurationField durationField9 = chronology5.seconds();
        org.joda.time.DateTimeField dateTimeField10 = chronology5.era();
        org.joda.time.DateTimeField dateTimeField11 = chronology5.dayOfYear();
        org.joda.time.DateTimeField dateTimeField12 = chronology5.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField13 = chronology5.era();
        org.joda.time.DateTimeField dateTimeField14 = chronology5.millisOfDay();
        org.joda.time.DurationField durationField15 = chronology5.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField15, durationField8, and durationField9", !(durationField15.compareTo(durationField8) == 0) || (Math.signum(durationField15.compareTo(durationField9)) == Math.signum(durationField8.compareTo(durationField9))));
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale5 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology3, locale5);
        org.joda.time.Chronology chronology7 = dateTimeParserBucket6.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.dayOfYear();
        org.joda.time.DateTimeField dateTimeField9 = chronology7.yearOfEra();
        org.joda.time.DurationField durationField10 = chronology7.hours();
        org.joda.time.Chronology chronology11 = chronology7.withUTC();
        org.joda.time.DateTimeField dateTimeField12 = chronology7.dayOfWeek();
        java.util.Locale locale13 = java.util.Locale.FRENCH;
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str16 = dateTimeZone14.getName(97L);
        org.joda.time.Chronology chronology19 = null;
        java.util.Locale locale21 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket22 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology19, locale21);
        java.lang.String str23 = dateTimeZone14.getName((long) (byte) 10, locale21);
        java.lang.String str24 = locale13.getDisplayLanguage(locale21);
        java.lang.String str25 = locale13.getDisplayCountry();
        java.lang.String str26 = locale13.toLanguageTag();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket28 = new org.joda.time.format.DateTimeParserBucket((long) (-2), chronology7, locale13, (java.lang.Integer) 36000000);
        java.util.Locale locale30 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale31 = locale30.stripExtensions();
        boolean boolean32 = locale31.hasExtensions();
        java.lang.String str33 = locale31.toLanguageTag();
        java.lang.String str34 = locale31.getScript();
        org.joda.time.format.DateTimePrinter dateTimePrinter36 = null;
        org.joda.time.format.DateTimeParser dateTimeParser37 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter38 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter36, dateTimeParser37);
        org.joda.time.Chronology chronology40 = null;
        java.util.Locale locale42 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket43 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology40, locale42);
        org.joda.time.Chronology chronology44 = dateTimeParserBucket43.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter45 = dateTimeFormatter38.withChronology(chronology44);
        boolean boolean46 = dateTimeFormatter45.isPrinter();
        org.joda.time.Chronology chronology47 = dateTimeFormatter45.getChronolgy();
        org.joda.time.DateTimeField dateTimeField48 = chronology47.dayOfMonth();
        java.util.Locale locale49 = java.util.Locale.GERMANY;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket52 = new org.joda.time.format.DateTimeParserBucket(0L, chronology47, locale49, (java.lang.Integer) 1, (int) (short) 10);
        java.util.Locale locale53 = dateTimeParserBucket52.getLocale();
        java.lang.String str54 = locale53.getCountry();
        java.lang.String str55 = locale31.getDisplayScript(locale53);
        java.util.Locale locale57 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale58 = locale57.stripExtensions();
        boolean boolean59 = locale58.hasExtensions();
        java.lang.String str60 = locale58.getCountry();
        org.joda.time.Chronology chronology62 = null;
        java.util.Locale locale64 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket65 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology62, locale64);
        java.util.Locale locale67 = java.util.Locale.forLanguageTag("hi!");
        java.util.Set<java.lang.String> strSet68 = locale67.getUnicodeLocaleKeys();
        java.lang.String str69 = locale67.getDisplayScript();
        java.lang.String str70 = locale67.getCountry();
        java.lang.String str71 = locale64.getDisplayCountry(locale67);
        java.util.Set<java.lang.String> strSet72 = locale64.getUnicodeLocaleAttributes();
        java.lang.String str73 = locale58.getDisplayName(locale64);
        java.lang.String str74 = locale31.getDisplayName(locale64);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket76 = new org.joda.time.format.DateTimeParserBucket(321L, chronology7, locale64, (java.lang.Integer) (-121));
        org.joda.time.DurationField durationField77 = chronology7.eras();
        org.joda.time.DateTimeField dateTimeField78 = chronology7.yearOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField10 and durationField77", Math.signum(durationField10.compareTo(durationField77)) == -Math.signum(durationField77.compareTo(durationField10)));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale3);
        org.joda.time.Chronology chronology5 = dateTimeParserBucket4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = chronology5.clockhourOfDay();
        org.joda.time.DurationField durationField9 = chronology5.hours();
        org.joda.time.DurationField durationField10 = chronology5.years();
        org.joda.time.DurationField durationField11 = chronology5.hours();
        org.joda.time.DateTimeField dateTimeField12 = chronology5.halfdayOfDay();
        org.joda.time.DurationField durationField13 = chronology5.years();
        org.joda.time.DurationField durationField14 = chronology5.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField14, durationField9, and durationField10", !(durationField14.compareTo(durationField9) == 0) || (Math.signum(durationField14.compareTo(durationField10)) == Math.signum(durationField9.compareTo(durationField10))));
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale3);
        dateTimeParserBucket4.setPivotYear((java.lang.Integer) 0);
        long long9 = dateTimeParserBucket4.computeMillis(true, "ISOChronology[UTC]");
        org.joda.time.Chronology chronology11 = null;
        java.util.Locale locale13 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket14 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology11, locale13);
        org.joda.time.Chronology chronology15 = dateTimeParserBucket14.getChronology();
        org.joda.time.DateTimeField dateTimeField16 = chronology15.dayOfYear();
        org.joda.time.DateTimeField dateTimeField17 = chronology15.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField18 = chronology15.clockhourOfDay();
        org.joda.time.DurationField durationField19 = chronology15.hours();
        org.joda.time.DurationField durationField20 = chronology15.years();
        org.joda.time.DurationField durationField21 = chronology15.hours();
        org.joda.time.DateTimeField dateTimeField22 = chronology15.year();
        org.joda.time.DurationField durationField23 = chronology15.halfdays();
        org.joda.time.DateTimeField dateTimeField24 = chronology15.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField25 = chronology15.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField26 = chronology15.millisOfSecond();
        boolean boolean27 = dateTimeParserBucket4.restoreState((java.lang.Object) chronology15);
        java.lang.Integer int28 = dateTimeParserBucket4.getOffsetInteger();
        org.joda.time.Chronology chronology30 = null;
        java.util.Locale locale32 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket33 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology30, locale32);
        org.joda.time.DateTimeField dateTimeField34 = null;
        dateTimeParserBucket33.saveField(dateTimeField34, (int) (byte) 0);
        java.util.Locale locale37 = dateTimeParserBucket33.getLocale();
        java.lang.Object obj38 = dateTimeParserBucket33.saveState();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder39 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder41 = dateTimeFormatterBuilder39.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder42 = dateTimeFormatterBuilder41.appendTimeZoneId();
        org.joda.time.DateTimeFieldType dateTimeFieldType43 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder45 = dateTimeFormatterBuilder42.appendFixedDecimal(dateTimeFieldType43, (int) '4');
        dateTimeParserBucket33.saveField(dateTimeFieldType43, (int) (short) 1);
        java.lang.String str48 = dateTimeFieldType43.toString();
        org.joda.time.Chronology chronology50 = null;
        java.util.Locale locale52 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket53 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology50, locale52);
        org.joda.time.Chronology chronology54 = dateTimeParserBucket53.getChronology();
        org.joda.time.DateTimeField dateTimeField55 = chronology54.dayOfYear();
        org.joda.time.DateTimeField dateTimeField56 = chronology54.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField57 = chronology54.clockhourOfDay();
        org.joda.time.DurationField durationField58 = chronology54.weekyears();
        org.joda.time.DateTimeField dateTimeField59 = dateTimeFieldType43.getField(chronology54);
        org.joda.time.DateTimeField dateTimeField60 = chronology54.hourOfDay();
        dateTimeParserBucket4.saveField(dateTimeField60, (-2));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField20 and durationField58", (durationField20.compareTo(durationField58) == 0) == durationField20.equals(durationField58));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale3);
        org.joda.time.Chronology chronology5 = dateTimeParserBucket4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = chronology5.hourOfDay();
        org.joda.time.DateTimeField dateTimeField8 = chronology5.secondOfMinute();
        org.joda.time.DurationField durationField9 = chronology5.hours();
        org.joda.time.DurationField durationField10 = chronology5.months();
        org.joda.time.DurationField durationField11 = chronology5.years();
        org.joda.time.DurationField durationField12 = chronology5.years();
        org.joda.time.DateTimeField dateTimeField13 = chronology5.era();
        org.joda.time.DurationField durationField14 = chronology5.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField14, durationField9, and durationField10", !(durationField14.compareTo(durationField9) == 0) || (Math.signum(durationField14.compareTo(durationField10)) == Math.signum(durationField9.compareTo(durationField10))));
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale5 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology3, locale5);
        org.joda.time.Chronology chronology7 = dateTimeParserBucket6.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.dayOfYear();
        org.joda.time.DateTimeField dateTimeField9 = chronology7.yearOfEra();
        org.joda.time.DurationField durationField10 = chronology7.hours();
        org.joda.time.Chronology chronology11 = chronology7.withUTC();
        org.joda.time.DateTimeField dateTimeField12 = chronology7.dayOfWeek();
        java.util.Locale locale13 = java.util.Locale.FRENCH;
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str16 = dateTimeZone14.getName(97L);
        org.joda.time.Chronology chronology19 = null;
        java.util.Locale locale21 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket22 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology19, locale21);
        java.lang.String str23 = dateTimeZone14.getName((long) (byte) 10, locale21);
        java.lang.String str24 = locale13.getDisplayLanguage(locale21);
        java.lang.String str25 = locale13.getDisplayCountry();
        java.lang.String str26 = locale13.toLanguageTag();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket28 = new org.joda.time.format.DateTimeParserBucket((long) (-2), chronology7, locale13, (java.lang.Integer) 36000000);
        java.util.Locale locale30 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale31 = locale30.stripExtensions();
        boolean boolean32 = locale31.hasExtensions();
        java.lang.String str33 = locale31.toLanguageTag();
        java.lang.String str34 = locale31.getScript();
        org.joda.time.format.DateTimePrinter dateTimePrinter36 = null;
        org.joda.time.format.DateTimeParser dateTimeParser37 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter38 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter36, dateTimeParser37);
        org.joda.time.Chronology chronology40 = null;
        java.util.Locale locale42 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket43 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology40, locale42);
        org.joda.time.Chronology chronology44 = dateTimeParserBucket43.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter45 = dateTimeFormatter38.withChronology(chronology44);
        boolean boolean46 = dateTimeFormatter45.isPrinter();
        org.joda.time.Chronology chronology47 = dateTimeFormatter45.getChronolgy();
        org.joda.time.DateTimeField dateTimeField48 = chronology47.dayOfMonth();
        java.util.Locale locale49 = java.util.Locale.GERMANY;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket52 = new org.joda.time.format.DateTimeParserBucket(0L, chronology47, locale49, (java.lang.Integer) 1, (int) (short) 10);
        java.util.Locale locale53 = dateTimeParserBucket52.getLocale();
        java.lang.String str54 = locale53.getCountry();
        java.lang.String str55 = locale31.getDisplayScript(locale53);
        java.util.Locale locale57 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale58 = locale57.stripExtensions();
        boolean boolean59 = locale58.hasExtensions();
        java.lang.String str60 = locale58.getCountry();
        org.joda.time.Chronology chronology62 = null;
        java.util.Locale locale64 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket65 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology62, locale64);
        java.util.Locale locale67 = java.util.Locale.forLanguageTag("hi!");
        java.util.Set<java.lang.String> strSet68 = locale67.getUnicodeLocaleKeys();
        java.lang.String str69 = locale67.getDisplayScript();
        java.lang.String str70 = locale67.getCountry();
        java.lang.String str71 = locale64.getDisplayCountry(locale67);
        java.util.Set<java.lang.String> strSet72 = locale64.getUnicodeLocaleAttributes();
        java.lang.String str73 = locale58.getDisplayName(locale64);
        java.lang.String str74 = locale31.getDisplayName(locale64);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket76 = new org.joda.time.format.DateTimeParserBucket(321L, chronology7, locale64, (java.lang.Integer) (-121));
        org.joda.time.DurationField durationField77 = chronology7.eras();
        org.joda.time.DurationField durationField78 = chronology7.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField78 and durationField77", Math.signum(durationField78.compareTo(durationField77)) == -Math.signum(durationField77.compareTo(durationField78)));
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale3);
        org.joda.time.Chronology chronology5 = dateTimeParserBucket4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = chronology5.yearOfEra();
        org.joda.time.DurationField durationField8 = chronology5.hours();
        org.joda.time.DurationField durationField9 = chronology5.weeks();
        org.joda.time.DateTimeField dateTimeField10 = chronology5.era();
        org.joda.time.DurationField durationField11 = chronology5.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField11, durationField8, and durationField9", !(durationField11.compareTo(durationField8) == 0) || (Math.signum(durationField11.compareTo(durationField9)) == Math.signum(durationField8.compareTo(durationField9))));
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.dayOfWeek();
        org.joda.time.format.DateTimePrinter dateTimePrinter3 = null;
        org.joda.time.format.DateTimeParser dateTimeParser4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter3, dateTimeParser4);
        org.joda.time.Chronology chronology7 = null;
        java.util.Locale locale9 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket10 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology7, locale9);
        org.joda.time.Chronology chronology11 = dateTimeParserBucket10.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter5.withChronology(chronology11);
        org.joda.time.DateTimeField dateTimeField13 = chronology11.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField14 = dateTimeFieldType2.getField(chronology11);
        org.joda.time.DateTimeField dateTimeField15 = chronology11.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField16 = chronology11.halfdayOfDay();
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        long long20 = chronology11.add(readablePeriod17, (long) (byte) 10, (int) (byte) -1);
        org.joda.time.DurationField durationField21 = chronology11.seconds();
        java.util.Locale locale23 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale24 = locale23.stripExtensions();
        boolean boolean25 = locale24.hasExtensions();
        java.lang.String str26 = locale24.getDisplayLanguage();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket29 = new org.joda.time.format.DateTimeParserBucket((long) (short) 1, chronology11, locale24, (java.lang.Integer) 97, (int) (short) -1);
        java.util.Locale locale31 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale32 = locale31.stripExtensions();
        boolean boolean33 = locale32.hasExtensions();
        java.lang.String str34 = locale32.toLanguageTag();
        java.lang.String str35 = locale32.getScript();
        org.joda.time.format.DateTimePrinter dateTimePrinter37 = null;
        org.joda.time.format.DateTimeParser dateTimeParser38 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter39 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter37, dateTimeParser38);
        org.joda.time.Chronology chronology41 = null;
        java.util.Locale locale43 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket44 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology41, locale43);
        org.joda.time.Chronology chronology45 = dateTimeParserBucket44.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter46 = dateTimeFormatter39.withChronology(chronology45);
        boolean boolean47 = dateTimeFormatter46.isPrinter();
        org.joda.time.Chronology chronology48 = dateTimeFormatter46.getChronolgy();
        org.joda.time.DateTimeField dateTimeField49 = chronology48.dayOfMonth();
        java.util.Locale locale50 = java.util.Locale.GERMANY;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket53 = new org.joda.time.format.DateTimeParserBucket(0L, chronology48, locale50, (java.lang.Integer) 1, (int) (short) 10);
        java.util.Locale locale54 = dateTimeParserBucket53.getLocale();
        java.lang.String str55 = locale54.getCountry();
        java.lang.String str56 = locale32.getDisplayScript(locale54);
        java.lang.String str57 = locale32.getLanguage();
        java.lang.String str58 = locale32.toLanguageTag();
        java.util.Set<java.lang.String> strSet59 = locale32.getUnicodeLocaleKeys();
        java.lang.String str60 = locale32.getDisplayLanguage();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket62 = new org.joda.time.format.DateTimeParserBucket(1119L, chronology11, locale32, (java.lang.Integer) 360060000);
        org.joda.time.DurationField durationField63 = chronology11.eras();
        org.joda.time.DateTimeField dateTimeField64 = chronology11.hourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField21 and durationField63", Math.signum(durationField21.compareTo(durationField63)) == -Math.signum(durationField63.compareTo(durationField21)));
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale3);
        org.joda.time.Chronology chronology5 = dateTimeParserBucket4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = chronology5.yearOfEra();
        org.joda.time.DurationField durationField8 = chronology5.hours();
        org.joda.time.Chronology chronology9 = chronology5.withUTC();
        org.joda.time.DurationField durationField10 = chronology5.seconds();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 0);
        java.lang.String str14 = dateTimeZone12.getNameKey(1L);
        long long17 = dateTimeZone12.convertLocalToUTC((long) 'a', true);
        java.util.TimeZone timeZone18 = dateTimeZone12.toTimeZone();
        org.joda.time.Chronology chronology19 = chronology5.withZone(dateTimeZone12);
        org.joda.time.format.DateTimePrinter dateTimePrinter20 = null;
        org.joda.time.format.DateTimeParser dateTimeParser21 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter20, dateTimeParser21);
        boolean boolean23 = dateTimeFormatter22.isPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser24 = dateTimeFormatter22.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = dateTimeFormatter22.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 0);
        java.lang.String str29 = dateTimeZone27.getNameKey(1L);
        org.joda.time.LocalDateTime localDateTime30 = null;
        boolean boolean31 = dateTimeZone27.isLocalDateTimeGap(localDateTime30);
        java.lang.String str32 = dateTimeZone27.toString();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter33 = dateTimeFormatter25.withZone(dateTimeZone27);
        org.joda.time.Chronology chronology34 = chronology19.withZone(dateTimeZone27);
        org.joda.time.DateTimeField dateTimeField35 = chronology19.weekyear();
        org.joda.time.DateTimeField dateTimeField36 = chronology19.secondOfDay();
        org.joda.time.DateTimeField dateTimeField37 = chronology19.monthOfYear();
        org.joda.time.DurationField durationField38 = chronology19.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField38, durationField8, and durationField10", !(durationField38.compareTo(durationField8) == 0) || (Math.signum(durationField38.compareTo(durationField10)) == Math.signum(durationField8.compareTo(durationField10))));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale3);
        org.joda.time.Chronology chronology5 = dateTimeParserBucket4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = chronology5.clockhourOfDay();
        org.joda.time.DurationField durationField9 = chronology5.hours();
        org.joda.time.DurationField durationField10 = chronology5.years();
        org.joda.time.DurationField durationField11 = chronology5.hours();
        org.joda.time.DateTimeField dateTimeField12 = chronology5.year();
        org.joda.time.DurationField durationField13 = chronology5.halfdays();
        org.joda.time.DateTimeField dateTimeField14 = chronology5.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField15 = chronology5.yearOfEra();
        org.joda.time.DateTimeField dateTimeField16 = chronology5.minuteOfDay();
        org.joda.time.DurationField durationField17 = chronology5.millis();
        org.joda.time.DateTimeField dateTimeField18 = chronology5.weekyearOfCentury();
        org.joda.time.DurationField durationField19 = chronology5.weekyears();
        org.joda.time.DateTimeField dateTimeField20 = chronology5.year();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField10 and durationField19", (durationField10.compareTo(durationField19) == 0) == durationField10.equals(durationField19));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withDefaultYear(0);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str7 = dateTimeZone5.getName(97L);
        org.joda.time.Chronology chronology10 = null;
        java.util.Locale locale12 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology10, locale12);
        java.lang.String str14 = dateTimeZone5.getName((long) (byte) 10, locale12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter2.withLocale(locale12);
        org.joda.time.format.DateTimePrinter dateTimePrinter16 = null;
        org.joda.time.format.DateTimeParser dateTimeParser17 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter16, dateTimeParser17);
        org.joda.time.Chronology chronology20 = null;
        java.util.Locale locale22 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket23 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology20, locale22);
        org.joda.time.Chronology chronology24 = dateTimeParserBucket23.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = dateTimeFormatter18.withChronology(chronology24);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = dateTimeFormatter15.withChronology(chronology24);
        org.joda.time.Chronology chronology28 = null;
        java.util.Locale locale30 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket31 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology28, locale30);
        org.joda.time.Chronology chronology32 = dateTimeParserBucket31.getChronology();
        org.joda.time.DateTimeField dateTimeField33 = chronology32.dayOfYear();
        org.joda.time.DateTimeField dateTimeField34 = chronology32.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField35 = chronology32.clockhourOfDay();
        org.joda.time.DurationField durationField36 = chronology32.hours();
        org.joda.time.DurationField durationField37 = chronology32.years();
        org.joda.time.DurationField durationField38 = chronology32.hours();
        org.joda.time.DateTimeField dateTimeField39 = chronology32.year();
        org.joda.time.DurationField durationField40 = chronology32.halfdays();
        long long44 = chronology32.add(0L, (long) '4', (int) (byte) 10);
        org.joda.time.DateTimeField dateTimeField45 = chronology32.weekOfWeekyear();
        org.joda.time.DurationField durationField46 = chronology32.hours();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter47 = dateTimeFormatter26.withChronology(chronology32);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter49 = dateTimeFormatter47.withPivotYear((java.lang.Integer) 10);
        org.joda.time.Chronology chronology50 = dateTimeFormatter47.getChronology();
        org.joda.time.DateTimeField dateTimeField51 = chronology50.dayOfMonth();
        org.joda.time.DurationField durationField52 = chronology50.weekyears();
        org.joda.time.ReadablePeriod readablePeriod53 = null;
        long long56 = chronology50.add(readablePeriod53, 3600120L, (-3600000));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField37 and durationField52", (durationField37.compareTo(durationField52) == 0) == durationField37.equals(durationField52));
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale3);
        org.joda.time.Chronology chronology5 = dateTimeParserBucket4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField7 = chronology5.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField8 = chronology5.year();
        org.joda.time.DateTimeField dateTimeField9 = chronology5.year();
        org.joda.time.DateTimeField dateTimeField10 = chronology5.weekOfWeekyear();
        org.joda.time.DurationField durationField11 = chronology5.eras();
        org.joda.time.DurationField durationField12 = chronology5.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField11, durationField12, and durationField11", !(durationField11.compareTo(durationField12) == 0) || (Math.signum(durationField11.compareTo(durationField11)) == Math.signum(durationField12.compareTo(durationField11))));
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale3);
        org.joda.time.Chronology chronology5 = dateTimeParserBucket4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = chronology5.hourOfHalfday();
        org.joda.time.DurationField durationField8 = chronology5.hours();
        org.joda.time.DurationField durationField9 = chronology5.seconds();
        org.joda.time.DateTimeField dateTimeField10 = chronology5.era();
        org.joda.time.DateTimeField dateTimeField11 = chronology5.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField12 = chronology5.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField13 = chronology5.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField14 = chronology5.year();
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        long long18 = chronology5.add(readablePeriod15, (long) 37, 5);
        org.joda.time.DurationField durationField19 = chronology5.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField19, durationField8, and durationField9", !(durationField19.compareTo(durationField8) == 0) || (Math.signum(durationField19.compareTo(durationField9)) == Math.signum(durationField8.compareTo(durationField9))));
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale4 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology2, locale4);
        org.joda.time.Chronology chronology6 = dateTimeParserBucket5.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.dayOfYear();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.hourOfHalfday();
        org.joda.time.DurationField durationField9 = chronology6.hours();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 0);
        java.lang.String str13 = dateTimeZone11.getNameKey(1L);
        java.util.Locale locale15 = java.util.Locale.TAIWAN;
        java.lang.String str16 = dateTimeZone11.getName(100L, locale15);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone11);
        org.joda.time.Chronology chronology18 = chronology6.withZone(dateTimeZone11);
        org.joda.time.DateTimeField dateTimeField19 = chronology18.hourOfDay();
        org.joda.time.DurationField durationField20 = chronology18.years();
        java.util.Locale locale21 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket23 = new org.joda.time.format.DateTimeParserBucket(120L, chronology18, locale21, (java.lang.Integer) 25);
        org.joda.time.DurationField durationField24 = chronology18.weeks();
        org.joda.time.DurationField durationField25 = chronology18.weeks();
        org.joda.time.DurationField durationField26 = chronology18.hours();
        org.joda.time.DurationField durationField27 = chronology18.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField27, durationField9, and durationField20", !(durationField27.compareTo(durationField9) == 0) || (Math.signum(durationField27.compareTo(durationField20)) == Math.signum(durationField9.compareTo(durationField20))));
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale4 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology2, locale4);
        org.joda.time.Chronology chronology6 = dateTimeParserBucket5.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.dayOfYear();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.hourOfDay();
        java.util.Locale locale10 = new java.util.Locale("fr");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = new org.joda.time.format.DateTimeParserBucket((long) (short) 1, chronology6, locale10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        long long15 = chronology6.add(readablePeriod12, (long) (byte) 100, 100);
        org.joda.time.DurationField durationField16 = chronology6.eras();
        org.joda.time.DurationField durationField17 = chronology6.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField16, durationField17, and durationField16", !(durationField16.compareTo(durationField17) == 0) || (Math.signum(durationField16.compareTo(durationField16)) == Math.signum(durationField17.compareTo(durationField16))));
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale3);
        org.joda.time.Chronology chronology5 = dateTimeParserBucket4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = chronology5.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField9 = chronology5.year();
        org.joda.time.DurationField durationField10 = chronology5.weeks();
        org.joda.time.DurationField durationField11 = chronology5.weekyears();
        org.joda.time.DateTimeField dateTimeField12 = chronology5.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField13 = chronology5.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField14 = chronology5.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField15 = chronology5.minuteOfDay();
        org.joda.time.DurationField durationField16 = chronology5.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField16, durationField10, and durationField11", !(durationField16.compareTo(durationField10) == 0) || (Math.signum(durationField16.compareTo(durationField11)) == Math.signum(durationField10.compareTo(durationField11))));
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale3);
        org.joda.time.Chronology chronology5 = dateTimeParserBucket4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = chronology5.hourOfHalfday();
        org.joda.time.DurationField durationField8 = chronology5.hours();
        org.joda.time.DurationField durationField9 = chronology5.seconds();
        org.joda.time.DateTimeField dateTimeField10 = chronology5.era();
        org.joda.time.DateTimeField dateTimeField11 = chronology5.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField12 = chronology5.clockhourOfHalfday();
        org.joda.time.DurationField durationField13 = chronology5.halfdays();
        org.joda.time.DateTimeField dateTimeField14 = chronology5.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField15 = chronology5.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField16 = chronology5.halfdayOfDay();
        org.joda.time.DurationField durationField17 = chronology5.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField17, durationField8, and durationField9", !(durationField17.compareTo(durationField8) == 0) || (Math.signum(durationField17.compareTo(durationField9)) == Math.signum(durationField8.compareTo(durationField9))));
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology4 = null;
        java.util.Locale locale6 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology4, locale6);
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withChronology(chronology8);
        boolean boolean10 = dateTimeFormatter9.isPrinter();
        org.joda.time.Chronology chronology11 = dateTimeFormatter9.getChronolgy();
        org.joda.time.DateTimeField dateTimeField12 = chronology11.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField13 = chronology11.weekyearOfCentury();
        org.joda.time.DurationField durationField14 = chronology11.weekyears();
        org.joda.time.DurationField durationField15 = chronology11.centuries();
        org.joda.time.DurationField durationField16 = chronology11.years();
        org.joda.time.DurationField durationField17 = chronology11.years();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField14 and durationField17", (durationField14.compareTo(durationField17) == 0) == durationField14.equals(durationField17));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        org.joda.time.Chronology chronology4 = null;
        java.util.Locale locale6 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology4, locale6);
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.dayOfYear();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.yearOfEra();
        org.joda.time.DurationField durationField11 = chronology8.hours();
        org.joda.time.Chronology chronology12 = chronology8.withUTC();
        org.joda.time.DateTimeField dateTimeField13 = chronology8.dayOfWeek();
        java.util.Locale locale14 = java.util.Locale.FRENCH;
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str17 = dateTimeZone15.getName(97L);
        org.joda.time.Chronology chronology20 = null;
        java.util.Locale locale22 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket23 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology20, locale22);
        java.lang.String str24 = dateTimeZone15.getName((long) (byte) 10, locale22);
        java.lang.String str25 = locale14.getDisplayLanguage(locale22);
        java.lang.String str26 = locale14.getDisplayCountry();
        java.lang.String str27 = locale14.toLanguageTag();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket29 = new org.joda.time.format.DateTimeParserBucket((long) (-2), chronology8, locale14, (java.lang.Integer) 36000000);
        java.util.Locale locale31 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale32 = locale31.stripExtensions();
        boolean boolean33 = locale32.hasExtensions();
        java.lang.String str34 = locale32.toLanguageTag();
        java.lang.String str35 = locale32.getScript();
        org.joda.time.format.DateTimePrinter dateTimePrinter37 = null;
        org.joda.time.format.DateTimeParser dateTimeParser38 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter39 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter37, dateTimeParser38);
        org.joda.time.Chronology chronology41 = null;
        java.util.Locale locale43 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket44 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology41, locale43);
        org.joda.time.Chronology chronology45 = dateTimeParserBucket44.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter46 = dateTimeFormatter39.withChronology(chronology45);
        boolean boolean47 = dateTimeFormatter46.isPrinter();
        org.joda.time.Chronology chronology48 = dateTimeFormatter46.getChronolgy();
        org.joda.time.DateTimeField dateTimeField49 = chronology48.dayOfMonth();
        java.util.Locale locale50 = java.util.Locale.GERMANY;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket53 = new org.joda.time.format.DateTimeParserBucket(0L, chronology48, locale50, (java.lang.Integer) 1, (int) (short) 10);
        java.util.Locale locale54 = dateTimeParserBucket53.getLocale();
        java.lang.String str55 = locale54.getCountry();
        java.lang.String str56 = locale32.getDisplayScript(locale54);
        java.util.Locale locale58 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale59 = locale58.stripExtensions();
        boolean boolean60 = locale59.hasExtensions();
        java.lang.String str61 = locale59.getCountry();
        org.joda.time.Chronology chronology63 = null;
        java.util.Locale locale65 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket66 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology63, locale65);
        java.util.Locale locale68 = java.util.Locale.forLanguageTag("hi!");
        java.util.Set<java.lang.String> strSet69 = locale68.getUnicodeLocaleKeys();
        java.lang.String str70 = locale68.getDisplayScript();
        java.lang.String str71 = locale68.getCountry();
        java.lang.String str72 = locale65.getDisplayCountry(locale68);
        java.util.Set<java.lang.String> strSet73 = locale65.getUnicodeLocaleAttributes();
        java.lang.String str74 = locale59.getDisplayName(locale65);
        java.lang.String str75 = locale32.getDisplayName(locale65);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket77 = new org.joda.time.format.DateTimeParserBucket(321L, chronology8, locale65, (java.lang.Integer) (-121));
        org.joda.time.DurationField durationField78 = chronology8.eras();
        java.util.Locale locale80 = java.util.Locale.forLanguageTag("cinese");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket81 = new org.joda.time.format.DateTimeParserBucket((long) 97, chronology8, locale80);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField11 and durationField78", Math.signum(durationField11.compareTo(durationField78)) == -Math.signum(durationField78.compareTo(durationField11)));
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale3);
        org.joda.time.Chronology chronology5 = dateTimeParserBucket4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.clockhourOfHalfday();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        long long10 = chronology5.add(readablePeriod7, (long) (byte) 0, (int) (byte) -1);
        org.joda.time.DurationField durationField11 = chronology5.months();
        org.joda.time.DateTimeField dateTimeField12 = chronology5.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField13 = chronology5.secondOfMinute();
        org.joda.time.DurationField durationField14 = chronology5.centuries();
        org.joda.time.DurationField durationField15 = chronology5.halfdays();
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        long long19 = chronology5.add(readablePeriod16, (-360059679L), 3);
        org.joda.time.DurationField durationField20 = chronology5.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField20, durationField11, and durationField14", !(durationField20.compareTo(durationField11) == 0) || (Math.signum(durationField20.compareTo(durationField14)) == Math.signum(durationField11.compareTo(durationField14))));
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale3);
        org.joda.time.Chronology chronology5 = dateTimeParserBucket4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = chronology5.clockhourOfDay();
        org.joda.time.DurationField durationField9 = chronology5.hours();
        org.joda.time.DurationField durationField10 = chronology5.years();
        org.joda.time.DurationField durationField11 = chronology5.hours();
        org.joda.time.DateTimeField dateTimeField12 = chronology5.year();
        org.joda.time.DurationField durationField13 = chronology5.halfdays();
        org.joda.time.DateTimeField dateTimeField14 = chronology5.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField15 = chronology5.yearOfEra();
        org.joda.time.DurationField durationField16 = chronology5.years();
        org.joda.time.DateTimeZone dateTimeZone17 = chronology5.getZone();
        org.joda.time.DurationField durationField18 = chronology5.weekyears();
        org.joda.time.DurationField durationField19 = chronology5.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField10 and durationField18", (durationField10.compareTo(durationField18) == 0) == durationField10.equals(durationField18));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale3);
        org.joda.time.Chronology chronology5 = dateTimeParserBucket4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = chronology5.hourOfHalfday();
        org.joda.time.DurationField durationField8 = chronology5.hours();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 0);
        java.lang.String str12 = dateTimeZone10.getNameKey(1L);
        java.util.Locale locale14 = java.util.Locale.TAIWAN;
        java.lang.String str15 = dateTimeZone10.getName(100L, locale14);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone10);
        org.joda.time.Chronology chronology17 = chronology5.withZone(dateTimeZone10);
        org.joda.time.DateTimeField dateTimeField18 = chronology5.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField19 = chronology5.monthOfYear();
        org.joda.time.DurationField durationField20 = chronology5.days();
        org.joda.time.DurationField durationField21 = chronology5.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField21, durationField8, and durationField20", !(durationField21.compareTo(durationField8) == 0) || (Math.signum(durationField21.compareTo(durationField20)) == Math.signum(durationField8.compareTo(durationField20))));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale3);
        org.joda.time.Chronology chronology5 = dateTimeParserBucket4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = chronology5.hourOfHalfday();
        org.joda.time.DurationField durationField8 = chronology5.hours();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 0);
        java.lang.String str12 = dateTimeZone10.getNameKey(1L);
        java.util.Locale locale14 = java.util.Locale.TAIWAN;
        java.lang.String str15 = dateTimeZone10.getName(100L, locale14);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone10);
        org.joda.time.Chronology chronology17 = chronology5.withZone(dateTimeZone10);
        org.joda.time.DurationField durationField18 = chronology5.halfdays();
        org.joda.time.DurationField durationField19 = chronology5.halfdays();
        org.joda.time.DurationField durationField20 = chronology5.minutes();
        org.joda.time.DurationField durationField21 = chronology5.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField21, durationField8, and durationField18", !(durationField21.compareTo(durationField8) == 0) || (Math.signum(durationField21.compareTo(durationField18)) == Math.signum(durationField8.compareTo(durationField18))));
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale3);
        org.joda.time.Chronology chronology5 = dateTimeParserBucket4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = chronology5.clockhourOfDay();
        org.joda.time.DurationField durationField9 = chronology5.hours();
        org.joda.time.DurationField durationField10 = chronology5.years();
        org.joda.time.DurationField durationField11 = chronology5.hours();
        org.joda.time.DateTimeField dateTimeField12 = chronology5.year();
        org.joda.time.DurationField durationField13 = chronology5.halfdays();
        long long17 = chronology5.add(0L, (long) '4', (int) (byte) 10);
        org.joda.time.DateTimeField dateTimeField18 = chronology5.clockhourOfDay();
        org.joda.time.DurationField durationField19 = chronology5.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField19, durationField9, and durationField10", !(durationField19.compareTo(durationField9) == 0) || (Math.signum(durationField19.compareTo(durationField10)) == Math.signum(durationField9.compareTo(durationField10))));
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale3);
        org.joda.time.Chronology chronology5 = dateTimeParserBucket4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = chronology5.yearOfEra();
        org.joda.time.DurationField durationField8 = chronology5.days();
        org.joda.time.DateTimeField dateTimeField9 = chronology5.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField10 = chronology5.clockhourOfHalfday();
        org.joda.time.DurationField durationField11 = chronology5.eras();
        org.joda.time.DateTimeField dateTimeField12 = chronology5.yearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField8 and durationField11", Math.signum(durationField8.compareTo(durationField11)) == -Math.signum(durationField11.compareTo(durationField8)));
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale4 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology2, locale4);
        org.joda.time.Chronology chronology6 = dateTimeParserBucket5.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.dayOfYear();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.yearOfEra();
        org.joda.time.DurationField durationField9 = chronology6.days();
        java.lang.String str10 = chronology6.toString();
        java.util.Locale locale12 = java.util.Locale.forLanguageTag("hi!");
        java.util.Set<java.lang.String> strSet13 = locale12.getUnicodeLocaleKeys();
        java.lang.String str14 = locale12.getDisplayScript();
        java.lang.String str15 = locale12.getCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket((long) (short) 10, chronology6, locale12, (java.lang.Integer) 10);
        org.joda.time.DurationField durationField18 = chronology6.seconds();
        org.joda.time.DurationField durationField19 = chronology6.hours();
        org.joda.time.DurationField durationField20 = chronology6.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField20, durationField9, and durationField18", !(durationField20.compareTo(durationField9) == 0) || (Math.signum(durationField20.compareTo(durationField18)) == Math.signum(durationField9.compareTo(durationField18))));
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale3);
        org.joda.time.Chronology chronology5 = dateTimeParserBucket4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = chronology5.yearOfEra();
        org.joda.time.DurationField durationField8 = chronology5.hours();
        org.joda.time.Chronology chronology9 = chronology5.withUTC();
        org.joda.time.DurationField durationField10 = chronology5.seconds();
        org.joda.time.DateTimeField dateTimeField11 = chronology5.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str14 = dateTimeZone12.getName(97L);
        org.joda.time.Chronology chronology17 = null;
        java.util.Locale locale19 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket20 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology17, locale19);
        java.lang.String str21 = dateTimeZone12.getName((long) (byte) 10, locale19);
        long long25 = dateTimeZone12.convertLocalToUTC((long) 0, true, (long) 10);
        int int27 = dateTimeZone12.getOffset((long) 'u');
        org.joda.time.Chronology chronology28 = chronology5.withZone(dateTimeZone12);
        org.joda.time.DurationField durationField29 = chronology28.halfdays();
        org.joda.time.DurationField durationField30 = chronology28.hours();
        org.joda.time.DateTimeField dateTimeField31 = chronology28.monthOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField8 and durationField30", (durationField8.compareTo(durationField30) == 0) == durationField8.equals(durationField30));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale3);
        org.joda.time.Chronology chronology5 = dateTimeParserBucket4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = chronology5.clockhourOfDay();
        org.joda.time.DurationField durationField9 = chronology5.weekyears();
        org.joda.time.DateTimeField dateTimeField10 = chronology5.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 0);
        java.lang.String str14 = dateTimeZone12.getNameKey(1L);
        org.joda.time.LocalDateTime localDateTime15 = null;
        boolean boolean16 = dateTimeZone12.isLocalDateTimeGap(localDateTime15);
        java.util.TimeZone timeZone17 = dateTimeZone12.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.UTC;
        long long20 = dateTimeZone12.getMillisKeepLocal(dateTimeZone18, (long) 0);
        org.joda.time.Chronology chronology21 = chronology5.withZone(dateTimeZone12);
        org.joda.time.DurationField durationField22 = chronology5.years();
        org.joda.time.DateTimeField dateTimeField23 = chronology5.dayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField9 and durationField22", (durationField9.compareTo(durationField22) == 0) == durationField9.equals(durationField22));
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale3);
        org.joda.time.Chronology chronology5 = dateTimeParserBucket4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = chronology5.yearOfEra();
        org.joda.time.DurationField durationField8 = chronology5.hours();
        org.joda.time.Chronology chronology9 = chronology5.withUTC();
        org.joda.time.DateTimeField dateTimeField10 = chronology5.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField11 = chronology5.era();
        org.joda.time.DateTimeField dateTimeField12 = chronology5.dayOfYear();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        long long16 = chronology5.add(readablePeriod13, (long) '4', 10);
        org.joda.time.DurationField durationField17 = chronology5.eras();
        org.joda.time.DurationField durationField18 = chronology5.weeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField8 and durationField17", Math.signum(durationField8.compareTo(durationField17)) == -Math.signum(durationField17.compareTo(durationField8)));
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale4 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology2, locale4);
        org.joda.time.Chronology chronology6 = dateTimeParserBucket5.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.dayOfYear();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.hourOfHalfday();
        org.joda.time.DurationField durationField9 = chronology6.hours();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 0);
        java.lang.String str13 = dateTimeZone11.getNameKey(1L);
        java.util.Locale locale15 = java.util.Locale.TAIWAN;
        java.lang.String str16 = dateTimeZone11.getName(100L, locale15);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone11);
        org.joda.time.Chronology chronology18 = chronology6.withZone(dateTimeZone11);
        org.joda.time.DateTimeField dateTimeField19 = chronology18.hourOfDay();
        org.joda.time.DurationField durationField20 = chronology18.years();
        java.util.Locale locale21 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket23 = new org.joda.time.format.DateTimeParserBucket(120L, chronology18, locale21, (java.lang.Integer) 25);
        org.joda.time.DateTimeField dateTimeField24 = chronology18.clockhourOfDay();
        org.joda.time.DurationField durationField25 = chronology18.weekyears();
        org.joda.time.DurationField durationField26 = chronology18.weeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField20 and durationField25", (durationField20.compareTo(durationField25) == 0) == durationField20.equals(durationField25));
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale3);
        org.joda.time.Chronology chronology5 = dateTimeParserBucket4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = chronology5.yearOfEra();
        org.joda.time.DurationField durationField8 = chronology5.hours();
        org.joda.time.Chronology chronology9 = chronology5.withUTC();
        org.joda.time.DurationField durationField10 = chronology5.seconds();
        org.joda.time.DateTimeField dateTimeField11 = chronology5.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField12 = chronology5.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField13 = chronology5.millisOfDay();
        org.joda.time.DurationField durationField14 = chronology5.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField14, durationField8, and durationField10", !(durationField14.compareTo(durationField8) == 0) || (Math.signum(durationField14.compareTo(durationField10)) == Math.signum(durationField8.compareTo(durationField10))));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale3);
        org.joda.time.Chronology chronology5 = dateTimeParserBucket4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = chronology5.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField9 = chronology5.year();
        org.joda.time.DurationField durationField10 = chronology5.weeks();
        org.joda.time.DateTimeField dateTimeField11 = chronology5.secondOfMinute();
        org.joda.time.DurationField durationField12 = chronology5.months();
        org.joda.time.DateTimeField dateTimeField13 = chronology5.weekOfWeekyear();
        org.joda.time.DurationField durationField14 = chronology5.years();
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        long long18 = chronology5.add(readablePeriod15, 25L, 25);
        org.joda.time.DurationField durationField19 = chronology5.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField19, durationField10, and durationField12", !(durationField19.compareTo(durationField10) == 0) || (Math.signum(durationField19.compareTo(durationField12)) == Math.signum(durationField10.compareTo(durationField12))));
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfWeek();
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.Chronology chronology5 = null;
        java.util.Locale locale7 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology5, locale7);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket8.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter3.withChronology(chronology9);
        org.joda.time.DateTimeField dateTimeField11 = chronology9.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField12 = dateTimeFieldType0.getField(chronology9);
        org.joda.time.DateTimeField dateTimeField13 = chronology9.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField14 = chronology9.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField15 = chronology9.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField16 = chronology9.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField17 = chronology9.dayOfYear();
        org.joda.time.DurationField durationField18 = chronology9.eras();
        org.joda.time.DurationField durationField19 = chronology9.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField18, durationField19, and durationField18", !(durationField18.compareTo(durationField19) == 0) || (Math.signum(durationField18.compareTo(durationField18)) == Math.signum(durationField19.compareTo(durationField18))));
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale3);
        org.joda.time.Chronology chronology5 = dateTimeParserBucket4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = chronology5.hourOfHalfday();
        org.joda.time.DurationField durationField8 = chronology5.hours();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 0);
        java.lang.String str12 = dateTimeZone10.getNameKey(1L);
        java.util.Locale locale14 = java.util.Locale.TAIWAN;
        java.lang.String str15 = dateTimeZone10.getName(100L, locale14);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone10);
        org.joda.time.Chronology chronology17 = chronology5.withZone(dateTimeZone10);
        org.joda.time.DurationField durationField18 = chronology5.halfdays();
        org.joda.time.DurationField durationField19 = chronology5.days();
        org.joda.time.Chronology chronology20 = chronology5.withUTC();
        org.joda.time.DurationField durationField21 = chronology20.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField21, durationField8, and durationField18", !(durationField21.compareTo(durationField8) == 0) || (Math.signum(durationField21.compareTo(durationField18)) == Math.signum(durationField8.compareTo(durationField18))));
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale3);
        org.joda.time.Chronology chronology5 = dateTimeParserBucket4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = chronology5.yearOfEra();
        org.joda.time.DurationField durationField8 = chronology5.hours();
        org.joda.time.Chronology chronology9 = chronology5.withUTC();
        org.joda.time.DurationField durationField10 = chronology9.centuries();
        org.joda.time.DateTimeField dateTimeField11 = chronology9.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField12 = chronology9.dayOfWeek();
        org.joda.time.DurationField durationField13 = chronology9.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField13, durationField8, and durationField10", !(durationField13.compareTo(durationField8) == 0) || (Math.signum(durationField13.compareTo(durationField10)) == Math.signum(durationField8.compareTo(durationField10))));
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale3);
        org.joda.time.Chronology chronology5 = dateTimeParserBucket4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = chronology5.clockhourOfDay();
        org.joda.time.DurationField durationField9 = chronology5.hours();
        org.joda.time.DurationField durationField10 = chronology5.years();
        org.joda.time.DurationField durationField11 = chronology5.hours();
        org.joda.time.DateTimeField dateTimeField12 = chronology5.year();
        org.joda.time.DurationField durationField13 = chronology5.halfdays();
        org.joda.time.DateTimeField dateTimeField14 = chronology5.weekyearOfCentury();
        org.joda.time.DurationField durationField15 = chronology5.months();
        org.joda.time.DurationField durationField16 = chronology5.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField16, durationField9, and durationField10", !(durationField16.compareTo(durationField9) == 0) || (Math.signum(durationField16.compareTo(durationField10)) == Math.signum(durationField9.compareTo(durationField10))));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder2.appendTimeZoneId();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder3.appendTwoDigitYear((int) (short) -1, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder6.appendDayOfYear(187200000);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap9 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder6.appendTimeZoneShortName(strMap9);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder6.appendYear((int) (byte) 100, 36);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder14.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder16.appendTimeZoneId();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder20 = dateTimeFormatterBuilder17.appendFixedDecimal(dateTimeFieldType18, (int) '4');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder22 = dateTimeFormatterBuilder17.appendTwoDigitWeekyear(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder25 = dateTimeFormatterBuilder22.appendFixedDecimal(dateTimeFieldType23, (int) (short) 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder26 = dateTimeFormatterBuilder13.appendText(dateTimeFieldType23);
        org.joda.time.Chronology chronology28 = null;
        java.util.Locale locale30 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket31 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology28, locale30);
        org.joda.time.Chronology chronology32 = dateTimeParserBucket31.getChronology();
        org.joda.time.DateTimeField dateTimeField33 = chronology32.dayOfYear();
        org.joda.time.DateTimeField dateTimeField34 = chronology32.yearOfEra();
        org.joda.time.DurationField durationField35 = chronology32.hours();
        org.joda.time.DateTimeField dateTimeField36 = chronology32.secondOfMinute();
        org.joda.time.Chronology chronology37 = chronology32.withUTC();
        org.joda.time.DurationField durationField38 = chronology37.weeks();
        org.joda.time.DateTimeField dateTimeField39 = chronology37.minuteOfHour();
        boolean boolean40 = dateTimeFieldType23.isSupported(chronology37);
        org.joda.time.DateTimeField dateTimeField41 = chronology37.clockhourOfHalfday();
        org.joda.time.ReadablePeriod readablePeriod42 = null;
        long long45 = chronology37.add(readablePeriod42, (-3L), 3600000);
        org.joda.time.DurationField durationField46 = chronology37.minutes();
        org.joda.time.DurationField durationField47 = chronology37.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField47, durationField35, and durationField38", !(durationField47.compareTo(durationField35) == 0) || (Math.signum(durationField47.compareTo(durationField38)) == Math.signum(durationField35.compareTo(durationField38))));
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser4 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter5.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter7.withDefaultYear((-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter9.withPivotYear((int) 'u');
        org.joda.time.Chronology chronology13 = null;
        java.util.Locale locale15 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology13, locale15);
        org.joda.time.Chronology chronology17 = dateTimeParserBucket16.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.dayOfYear();
        org.joda.time.DateTimeField dateTimeField19 = chronology17.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField20 = chronology17.clockhourOfDay();
        org.joda.time.DurationField durationField21 = chronology17.hours();
        org.joda.time.DurationField durationField22 = chronology17.years();
        org.joda.time.DurationField durationField23 = chronology17.hours();
        org.joda.time.DateTimeField dateTimeField24 = chronology17.year();
        org.joda.time.DurationField durationField25 = chronology17.halfdays();
        long long29 = chronology17.add(0L, (long) '4', (int) (byte) 10);
        org.joda.time.DateTimeField dateTimeField30 = chronology17.clockhourOfDay();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = dateTimeFormatter9.withChronology(chronology17);
        java.util.Locale locale32 = dateTimeFormatter9.getLocale();
        org.joda.time.DateTimeZone dateTimeZone33 = dateTimeFormatter9.getZone();
        org.joda.time.Chronology chronology36 = null;
        java.util.Locale locale38 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket39 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology36, locale38);
        org.joda.time.Chronology chronology40 = dateTimeParserBucket39.getChronology();
        org.joda.time.DateTimeField dateTimeField41 = chronology40.dayOfYear();
        org.joda.time.DateTimeField dateTimeField42 = chronology40.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField43 = chronology40.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField44 = chronology40.year();
        org.joda.time.DurationField durationField45 = chronology40.weeks();
        org.joda.time.DurationField durationField46 = chronology40.weekyears();
        org.joda.time.DateTimeField dateTimeField47 = chronology40.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField48 = chronology40.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone49 = chronology40.getZone();
        java.util.Locale.Category category50 = java.util.Locale.Category.DISPLAY;
        org.joda.time.Chronology chronology52 = null;
        java.util.Locale locale54 = new java.util.Locale("fr");
        java.util.Locale locale55 = java.util.Locale.FRENCH;
        java.lang.String str56 = locale55.toLanguageTag();
        java.lang.String str57 = locale54.getDisplayLanguage(locale55);
        java.util.Locale locale58 = null;
        java.lang.String str59 = locale54.getDisplayCountry(locale58);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket61 = new org.joda.time.format.DateTimeParserBucket((long) 10, chronology52, locale54, (java.lang.Integer) 0);
        java.util.Set<java.lang.Character> charSet62 = locale54.getExtensionKeys();
        java.lang.String str63 = locale54.getISO3Country();
        java.util.Locale.setDefault(category50, locale54);
        java.util.Locale locale65 = java.util.Locale.FRENCH;
        java.lang.String str66 = locale65.toLanguageTag();
        java.util.Locale locale68 = java.util.Locale.forLanguageTag("hi!");
        java.util.Set<java.lang.String> strSet69 = locale68.getUnicodeLocaleKeys();
        java.lang.String str70 = locale68.getDisplayScript();
        java.lang.String str71 = locale68.getCountry();
        java.lang.String str72 = locale65.getDisplayName(locale68);
        java.lang.String str73 = locale54.getDisplayName(locale65);
        org.joda.time.DateTimeZone dateTimeZone74 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str76 = dateTimeZone74.getName(97L);
        org.joda.time.Chronology chronology79 = null;
        java.util.Locale locale81 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket82 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology79, locale81);
        java.lang.String str83 = dateTimeZone74.getName((long) (byte) 10, locale81);
        java.lang.String str84 = locale65.getDisplayScript(locale81);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket85 = new org.joda.time.format.DateTimeParserBucket((-97L), chronology40, locale81);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter86 = dateTimeFormatter9.withChronology(chronology40);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField22 and durationField46", (durationField22.compareTo(durationField46) == 0) == durationField22.equals(durationField46));
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.dayOfWeek();
        org.joda.time.format.DateTimePrinter dateTimePrinter3 = null;
        org.joda.time.format.DateTimeParser dateTimeParser4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter3, dateTimeParser4);
        org.joda.time.Chronology chronology7 = null;
        java.util.Locale locale9 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket10 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology7, locale9);
        org.joda.time.Chronology chronology11 = dateTimeParserBucket10.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter5.withChronology(chronology11);
        org.joda.time.DateTimeField dateTimeField13 = chronology11.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField14 = dateTimeFieldType2.getField(chronology11);
        org.joda.time.DateTimeField dateTimeField15 = chronology11.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone17);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone17);
        org.joda.time.Chronology chronology20 = chronology11.withZone(dateTimeZone17);
        org.joda.time.DurationField durationField21 = chronology11.days();
        java.util.Locale locale23 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale24 = locale23.stripExtensions();
        boolean boolean25 = locale24.hasExtensions();
        java.lang.String str26 = locale24.getISO3Language();
        java.util.Locale locale27 = java.util.Locale.KOREAN;
        boolean boolean28 = locale27.hasExtensions();
        java.lang.String str30 = locale27.getExtension('a');
        java.lang.String str31 = locale27.getDisplayName();
        java.lang.String str32 = locale24.getDisplayLanguage(locale27);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket33 = new org.joda.time.format.DateTimeParserBucket(3600120L, chronology11, locale24);
        org.joda.time.DurationField durationField34 = chronology11.years();
        org.joda.time.DateTimeField dateTimeField35 = chronology11.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forOffsetMillis(37);
        org.joda.time.Chronology chronology38 = chronology11.withZone(dateTimeZone37);
        org.joda.time.DurationField durationField39 = chronology38.years();
        java.util.Locale locale43 = new java.util.Locale("java.io.IOException: Italian", "53AMven.", "zho");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket44 = new org.joda.time.format.DateTimeParserBucket((-125797762817999892L), chronology38, locale43);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField34 and durationField39", (durationField34.compareTo(durationField39) == 0) == durationField34.equals(durationField39));
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology4 = null;
        java.util.Locale locale6 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology4, locale6);
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withChronology(chronology8);
        boolean boolean10 = dateTimeFormatter9.isPrinter();
        org.joda.time.Chronology chronology11 = dateTimeFormatter9.getChronolgy();
        org.joda.time.DateTimeField dateTimeField12 = chronology11.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField13 = chronology11.weekyearOfCentury();
        org.joda.time.DurationField durationField14 = chronology11.weekyears();
        org.joda.time.DurationField durationField15 = chronology11.centuries();
        org.joda.time.DurationField durationField16 = chronology11.years();
        org.joda.time.DateTimeField dateTimeField17 = chronology11.monthOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField14 and durationField16", (durationField14.compareTo(durationField16) == 0) == durationField14.equals(durationField16));
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology4 = null;
        java.util.Locale locale6 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology4, locale6);
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withChronology(chronology8);
        boolean boolean10 = dateTimeFormatter9.isPrinter();
        org.joda.time.Chronology chronology11 = dateTimeFormatter9.getChronolgy();
        org.joda.time.DurationField durationField12 = chronology11.hours();
        org.joda.time.DateTimeField dateTimeField13 = chronology11.monthOfYear();
        org.joda.time.DurationField durationField14 = chronology11.minutes();
        org.joda.time.DurationField durationField15 = chronology11.months();
        org.joda.time.DurationField durationField16 = chronology11.days();
        org.joda.time.DateTimeField dateTimeField17 = chronology11.secondOfMinute();
        org.joda.time.DurationField durationField18 = chronology11.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField18, durationField12, and durationField14", !(durationField18.compareTo(durationField12) == 0) || (Math.signum(durationField18.compareTo(durationField14)) == Math.signum(durationField12.compareTo(durationField14))));
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale3);
        org.joda.time.Chronology chronology5 = dateTimeParserBucket4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = chronology5.clockhourOfDay();
        org.joda.time.DurationField durationField9 = chronology5.hours();
        org.joda.time.DurationField durationField10 = chronology5.years();
        org.joda.time.DurationField durationField11 = chronology5.hours();
        org.joda.time.DateTimeField dateTimeField12 = chronology5.year();
        org.joda.time.DurationField durationField13 = chronology5.halfdays();
        long long17 = chronology5.add(0L, (long) '4', (int) (byte) 10);
        org.joda.time.DateTimeField dateTimeField18 = chronology5.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField19 = chronology5.minuteOfHour();
        org.joda.time.DurationField durationField20 = chronology5.hours();
        org.joda.time.DurationField durationField21 = chronology5.weekyears();
        org.joda.time.DateTimeField dateTimeField22 = chronology5.weekOfWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField10 and durationField21", (durationField10.compareTo(durationField21) == 0) == durationField10.equals(durationField21));
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale5 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology3, locale5);
        org.joda.time.Chronology chronology7 = dateTimeParserBucket6.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.dayOfYear();
        org.joda.time.DateTimeField dateTimeField9 = chronology7.yearOfEra();
        org.joda.time.DurationField durationField10 = chronology7.hours();
        org.joda.time.Chronology chronology11 = chronology7.withUTC();
        org.joda.time.DateTimeField dateTimeField12 = chronology7.dayOfWeek();
        java.util.Locale locale13 = java.util.Locale.FRENCH;
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str16 = dateTimeZone14.getName(97L);
        org.joda.time.Chronology chronology19 = null;
        java.util.Locale locale21 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket22 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology19, locale21);
        java.lang.String str23 = dateTimeZone14.getName((long) (byte) 10, locale21);
        java.lang.String str24 = locale13.getDisplayLanguage(locale21);
        java.lang.String str25 = locale13.getDisplayCountry();
        java.lang.String str26 = locale13.toLanguageTag();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket28 = new org.joda.time.format.DateTimeParserBucket((long) (-2), chronology7, locale13, (java.lang.Integer) 36000000);
        java.util.Locale locale30 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale31 = locale30.stripExtensions();
        boolean boolean32 = locale31.hasExtensions();
        java.lang.String str33 = locale31.toLanguageTag();
        java.lang.String str34 = locale31.getScript();
        org.joda.time.format.DateTimePrinter dateTimePrinter36 = null;
        org.joda.time.format.DateTimeParser dateTimeParser37 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter38 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter36, dateTimeParser37);
        org.joda.time.Chronology chronology40 = null;
        java.util.Locale locale42 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket43 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology40, locale42);
        org.joda.time.Chronology chronology44 = dateTimeParserBucket43.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter45 = dateTimeFormatter38.withChronology(chronology44);
        boolean boolean46 = dateTimeFormatter45.isPrinter();
        org.joda.time.Chronology chronology47 = dateTimeFormatter45.getChronolgy();
        org.joda.time.DateTimeField dateTimeField48 = chronology47.dayOfMonth();
        java.util.Locale locale49 = java.util.Locale.GERMANY;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket52 = new org.joda.time.format.DateTimeParserBucket(0L, chronology47, locale49, (java.lang.Integer) 1, (int) (short) 10);
        java.util.Locale locale53 = dateTimeParserBucket52.getLocale();
        java.lang.String str54 = locale53.getCountry();
        java.lang.String str55 = locale31.getDisplayScript(locale53);
        java.util.Locale locale57 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale58 = locale57.stripExtensions();
        boolean boolean59 = locale58.hasExtensions();
        java.lang.String str60 = locale58.getCountry();
        org.joda.time.Chronology chronology62 = null;
        java.util.Locale locale64 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket65 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology62, locale64);
        java.util.Locale locale67 = java.util.Locale.forLanguageTag("hi!");
        java.util.Set<java.lang.String> strSet68 = locale67.getUnicodeLocaleKeys();
        java.lang.String str69 = locale67.getDisplayScript();
        java.lang.String str70 = locale67.getCountry();
        java.lang.String str71 = locale64.getDisplayCountry(locale67);
        java.util.Set<java.lang.String> strSet72 = locale64.getUnicodeLocaleAttributes();
        java.lang.String str73 = locale58.getDisplayName(locale64);
        java.lang.String str74 = locale31.getDisplayName(locale64);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket76 = new org.joda.time.format.DateTimeParserBucket(321L, chronology7, locale64, (java.lang.Integer) (-121));
        org.joda.time.DurationField durationField77 = chronology7.eras();
        org.joda.time.DurationField durationField78 = chronology7.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField10 and durationField78", Math.signum(durationField10.compareTo(durationField78)) == -Math.signum(durationField78.compareTo(durationField10)));
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale3);
        org.joda.time.Chronology chronology5 = dateTimeParserBucket4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = chronology5.yearOfEra();
        org.joda.time.DurationField durationField8 = chronology5.hours();
        org.joda.time.DateTimeField dateTimeField9 = chronology5.secondOfMinute();
        org.joda.time.Chronology chronology10 = chronology5.withUTC();
        org.joda.time.DurationField durationField11 = chronology10.weeks();
        org.joda.time.DateTimeField dateTimeField12 = chronology10.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField13 = chronology10.centuryOfEra();
        org.joda.time.DurationField durationField14 = chronology10.hours();
        org.joda.time.DateTimeField dateTimeField15 = chronology10.hourOfHalfday();
        long long19 = chronology10.add(349201331L, (-3599999L), 360000000);
        org.joda.time.DurationField durationField20 = chronology10.seconds();
        org.joda.time.DurationField durationField21 = chronology10.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField21, durationField8, and durationField11", !(durationField21.compareTo(durationField8) == 0) || (Math.signum(durationField21.compareTo(durationField11)) == Math.signum(durationField8.compareTo(durationField11))));
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology4 = null;
        java.util.Locale locale6 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology4, locale6);
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withChronology(chronology8);
        boolean boolean10 = dateTimeFormatter9.isParser();
        org.joda.time.Chronology chronology11 = dateTimeFormatter9.getChronolgy();
        org.joda.time.format.DateTimeParser dateTimeParser12 = dateTimeFormatter9.getParser();
        org.joda.time.Chronology chronology16 = null;
        java.util.Locale locale18 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket19 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology16, locale18);
        org.joda.time.Chronology chronology20 = dateTimeParserBucket19.getChronology();
        org.joda.time.DateTimeField dateTimeField21 = chronology20.dayOfYear();
        org.joda.time.DateTimeField dateTimeField22 = chronology20.hourOfDay();
        java.util.Locale locale24 = new java.util.Locale("fr");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket25 = new org.joda.time.format.DateTimeParserBucket((long) (short) 1, chronology20, locale24);
        org.joda.time.DurationField durationField26 = chronology20.centuries();
        org.joda.time.DurationField durationField27 = chronology20.seconds();
        org.joda.time.DateTimeField dateTimeField28 = chronology20.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 0);
        java.lang.String str32 = dateTimeZone30.getNameKey(1L);
        java.util.Locale locale34 = java.util.Locale.TAIWAN;
        java.lang.String str35 = dateTimeZone30.getName(100L, locale34);
        java.util.Locale locale37 = java.util.Locale.GERMANY;
        java.lang.String str38 = dateTimeZone30.getShortName((long) '#', locale37);
        java.lang.String str40 = locale37.getExtension('x');
        java.lang.String str41 = locale37.getDisplayScript();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket44 = new org.joda.time.format.DateTimeParserBucket((long) 349200000, chronology20, locale37, (java.lang.Integer) 126, (int) (short) 100);
        org.joda.time.DurationField durationField45 = chronology20.years();
        org.joda.time.DurationField durationField46 = chronology20.weekyears();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter47 = dateTimeFormatter9.withChronology(chronology20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField45 and durationField46", (durationField45.compareTo(durationField46) == 0) == durationField45.equals(durationField46));
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale3);
        org.joda.time.Chronology chronology5 = dateTimeParserBucket4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = chronology5.yearOfEra();
        org.joda.time.DurationField durationField8 = chronology5.hours();
        org.joda.time.Chronology chronology9 = chronology5.withUTC();
        org.joda.time.DateTimeField dateTimeField10 = chronology5.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField11 = chronology5.year();
        org.joda.time.DurationField durationField12 = chronology5.weeks();
        org.joda.time.DurationField durationField13 = chronology5.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField13, durationField8, and durationField12", !(durationField13.compareTo(durationField8) == 0) || (Math.signum(durationField13.compareTo(durationField12)) == Math.signum(durationField8.compareTo(durationField12))));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder2.appendDayOfWeekShortText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder3.appendFractionOfSecond(1, (int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder6.appendText(dateTimeFieldType7);
        org.joda.time.Chronology chronology11 = null;
        java.util.Locale locale13 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket14 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology11, locale13);
        org.joda.time.Chronology chronology15 = dateTimeParserBucket14.getChronology();
        org.joda.time.DateTimeField dateTimeField16 = chronology15.dayOfYear();
        org.joda.time.DateTimeField dateTimeField17 = chronology15.hourOfDay();
        java.util.Locale locale19 = new java.util.Locale("fr");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket20 = new org.joda.time.format.DateTimeParserBucket((long) (short) 1, chronology15, locale19);
        org.joda.time.DurationField durationField21 = chronology15.centuries();
        org.joda.time.DurationField durationField22 = chronology15.weeks();
        boolean boolean23 = dateTimeFieldType7.isSupported(chronology15);
        org.joda.time.Chronology chronology27 = null;
        java.util.Locale locale29 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket30 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology27, locale29);
        org.joda.time.Chronology chronology31 = dateTimeParserBucket30.getChronology();
        org.joda.time.DateTimeField dateTimeField32 = chronology31.dayOfYear();
        org.joda.time.DateTimeField dateTimeField33 = chronology31.yearOfEra();
        org.joda.time.DurationField durationField34 = chronology31.days();
        java.lang.String str35 = chronology31.toString();
        java.util.Locale locale37 = java.util.Locale.forLanguageTag("hi!");
        java.util.Set<java.lang.String> strSet38 = locale37.getUnicodeLocaleKeys();
        java.lang.String str39 = locale37.getDisplayScript();
        java.lang.String str40 = locale37.getCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket42 = new org.joda.time.format.DateTimeParserBucket((long) (short) 10, chronology31, locale37, (java.lang.Integer) 10);
        org.joda.time.DurationField durationField43 = chronology31.days();
        org.joda.time.DateTimeField dateTimeField44 = chronology31.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField45 = chronology31.minuteOfDay();
        org.joda.time.Chronology chronology47 = null;
        java.util.Locale locale49 = new java.util.Locale("fr");
        java.util.Locale locale50 = java.util.Locale.FRENCH;
        java.lang.String str51 = locale50.toLanguageTag();
        java.lang.String str52 = locale49.getDisplayLanguage(locale50);
        java.util.Locale locale53 = null;
        java.lang.String str54 = locale49.getDisplayCountry(locale53);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket56 = new org.joda.time.format.DateTimeParserBucket((long) 10, chronology47, locale49, (java.lang.Integer) 0);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket57 = new org.joda.time.format.DateTimeParserBucket((long) (-1), chronology31, locale49);
        boolean boolean58 = dateTimeFieldType7.isSupported(chronology31);
        org.joda.time.DurationField durationField59 = chronology31.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField59, durationField21, and durationField22", !(durationField59.compareTo(durationField21) == 0) || (Math.signum(durationField59.compareTo(durationField22)) == Math.signum(durationField21.compareTo(durationField22))));
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale3);
        org.joda.time.Chronology chronology5 = dateTimeParserBucket4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = chronology5.yearOfEra();
        org.joda.time.DurationField durationField8 = chronology5.hours();
        org.joda.time.DateTimeField dateTimeField9 = chronology5.secondOfMinute();
        org.joda.time.Chronology chronology10 = chronology5.withUTC();
        org.joda.time.Chronology chronology11 = chronology10.withUTC();
        org.joda.time.DurationField durationField12 = chronology11.eras();
        org.joda.time.DateTimeField dateTimeField13 = chronology11.clockhourOfHalfday();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField8 and durationField12", Math.signum(durationField8.compareTo(durationField12)) == -Math.signum(durationField12.compareTo(durationField8)));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale4 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology2, locale4);
        org.joda.time.Chronology chronology6 = dateTimeParserBucket5.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.dayOfYear();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.hourOfHalfday();
        org.joda.time.DurationField durationField9 = chronology6.hours();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 0);
        java.lang.String str13 = dateTimeZone11.getNameKey(1L);
        java.util.Locale locale15 = java.util.Locale.TAIWAN;
        java.lang.String str16 = dateTimeZone11.getName(100L, locale15);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone11);
        org.joda.time.Chronology chronology18 = chronology6.withZone(dateTimeZone11);
        org.joda.time.DateTimeField dateTimeField19 = chronology18.hourOfDay();
        org.joda.time.DurationField durationField20 = chronology18.years();
        java.util.Locale locale21 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket23 = new org.joda.time.format.DateTimeParserBucket(120L, chronology18, locale21, (java.lang.Integer) 25);
        org.joda.time.DateTimeField dateTimeField24 = chronology18.clockhourOfDay();
        org.joda.time.DurationField durationField25 = chronology18.weekyears();
        org.joda.time.DateTimeField dateTimeField26 = chronology18.millisOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField20 and durationField25", (durationField20.compareTo(durationField25) == 0) == durationField20.equals(durationField25));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology4 = null;
        java.util.Locale locale6 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology4, locale6);
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withChronology(chronology8);
        boolean boolean10 = dateTimeFormatter9.isPrinter();
        org.joda.time.Chronology chronology11 = dateTimeFormatter9.getChronolgy();
        org.joda.time.DurationField durationField12 = chronology11.hours();
        org.joda.time.DateTimeField dateTimeField13 = chronology11.yearOfEra();
        org.joda.time.DateTimeField dateTimeField14 = chronology11.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField15 = chronology11.yearOfCentury();
        org.joda.time.DurationField durationField16 = chronology11.years();
        org.joda.time.DurationField durationField17 = chronology11.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField17, durationField12, and durationField16", !(durationField17.compareTo(durationField12) == 0) || (Math.signum(durationField17.compareTo(durationField16)) == Math.signum(durationField12.compareTo(durationField16))));
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale3);
        org.joda.time.Chronology chronology5 = dateTimeParserBucket4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = chronology5.yearOfEra();
        org.joda.time.DurationField durationField8 = chronology5.hours();
        org.joda.time.Chronology chronology9 = chronology5.withUTC();
        org.joda.time.DurationField durationField10 = chronology9.centuries();
        org.joda.time.DateTimeField dateTimeField11 = chronology9.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField12 = chronology9.secondOfDay();
        org.joda.time.DateTimeField dateTimeField13 = chronology9.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField14 = chronology9.yearOfEra();
        org.joda.time.DurationField durationField15 = chronology9.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField15, durationField8, and durationField10", !(durationField15.compareTo(durationField8) == 0) || (Math.signum(durationField15.compareTo(durationField10)) == Math.signum(durationField8.compareTo(durationField10))));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology4 = null;
        java.util.Locale locale6 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology4, locale6);
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withChronology(chronology8);
        boolean boolean10 = dateTimeFormatter9.isPrinter();
        org.joda.time.Chronology chronology11 = dateTimeFormatter9.getChronolgy();
        org.joda.time.DateTimeField dateTimeField12 = chronology11.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField13 = chronology11.weekyearOfCentury();
        org.joda.time.DurationField durationField14 = chronology11.weekyears();
        org.joda.time.DurationField durationField15 = chronology11.centuries();
        org.joda.time.DurationField durationField16 = chronology11.years();
        org.joda.time.DateTimeField dateTimeField17 = chronology11.yearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField14 and durationField16", (durationField14.compareTo(durationField16) == 0) == durationField14.equals(durationField16));
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfWeek();
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.Chronology chronology5 = null;
        java.util.Locale locale7 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology5, locale7);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket8.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter3.withChronology(chronology9);
        org.joda.time.DateTimeField dateTimeField11 = chronology9.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField12 = dateTimeFieldType0.getField(chronology9);
        org.joda.time.DateTimeField dateTimeField13 = chronology9.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone15);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone15);
        org.joda.time.Chronology chronology18 = chronology9.withZone(dateTimeZone15);
        org.joda.time.Chronology chronology21 = null;
        java.util.Locale locale23 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket24 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology21, locale23);
        org.joda.time.Chronology chronology25 = dateTimeParserBucket24.getChronology();
        org.joda.time.DateTimeField dateTimeField26 = chronology25.dayOfYear();
        org.joda.time.DateTimeField dateTimeField27 = chronology25.hourOfHalfday();
        org.joda.time.DurationField durationField28 = chronology25.hours();
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 0);
        java.lang.String str32 = dateTimeZone30.getNameKey(1L);
        java.util.Locale locale34 = java.util.Locale.TAIWAN;
        java.lang.String str35 = dateTimeZone30.getName(100L, locale34);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone30);
        org.joda.time.Chronology chronology37 = chronology25.withZone(dateTimeZone30);
        org.joda.time.DateTimeField dateTimeField38 = chronology37.hourOfDay();
        org.joda.time.DurationField durationField39 = chronology37.years();
        java.util.Locale locale40 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket42 = new org.joda.time.format.DateTimeParserBucket(120L, chronology37, locale40, (java.lang.Integer) 25);
        org.joda.time.DateTimeField dateTimeField43 = chronology37.clockhourOfDay();
        org.joda.time.DurationField durationField44 = chronology37.weekyears();
        boolean boolean45 = dateTimeZone15.equals((java.lang.Object) durationField44);
        int int47 = dateTimeZone15.getOffsetFromLocal((long) (-438));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField39 and durationField44", (durationField39.compareTo(durationField44) == 0) == durationField39.equals(durationField44));
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale3);
        org.joda.time.Chronology chronology5 = dateTimeParserBucket4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = chronology5.hourOfHalfday();
        org.joda.time.DurationField durationField8 = chronology5.hours();
        org.joda.time.DurationField durationField9 = chronology5.seconds();
        org.joda.time.DateTimeField dateTimeField10 = chronology5.era();
        org.joda.time.DateTimeField dateTimeField11 = chronology5.minuteOfDay();
        org.joda.time.DurationField durationField12 = chronology5.days();
        org.joda.time.DurationField durationField13 = chronology5.millis();
        long long17 = chronology5.add((long) (short) 100, (-122L), (-3600000));
        org.joda.time.DateTimeField dateTimeField18 = chronology5.minuteOfHour();
        org.joda.time.DurationField durationField19 = chronology5.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField19, durationField8, and durationField9", !(durationField19.compareTo(durationField8) == 0) || (Math.signum(durationField19.compareTo(durationField9)) == Math.signum(durationField8.compareTo(durationField9))));
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale5 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology3, locale5);
        org.joda.time.Chronology chronology7 = dateTimeParserBucket6.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.dayOfYear();
        org.joda.time.DateTimeField dateTimeField9 = chronology7.yearOfEra();
        org.joda.time.DurationField durationField10 = chronology7.days();
        java.lang.String str11 = chronology7.toString();
        java.util.Locale locale13 = java.util.Locale.forLanguageTag("hi!");
        java.util.Set<java.lang.String> strSet14 = locale13.getUnicodeLocaleKeys();
        java.lang.String str15 = locale13.getDisplayScript();
        java.lang.String str16 = locale13.getCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket18 = new org.joda.time.format.DateTimeParserBucket((long) (short) 10, chronology7, locale13, (java.lang.Integer) 10);
        org.joda.time.DurationField durationField19 = chronology7.days();
        org.joda.time.DateTimeField dateTimeField20 = chronology7.era();
        java.util.Locale.Builder builder21 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder23 = builder21.setVariant("Italian");
        java.util.Locale.Builder builder26 = builder21.setExtension('u', "");
        java.util.Locale.Builder builder28 = builder21.removeUnicodeLocaleAttribute("French");
        java.util.Locale locale29 = builder21.build();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket31 = new org.joda.time.format.DateTimeParserBucket((-1990L), chronology7, locale29, (java.lang.Integer) 0);
        org.joda.time.DurationField durationField32 = chronology7.weeks();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder33 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder34 = dateTimeFormatterBuilder33.appendDayOfWeekShortText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder36 = dateTimeFormatterBuilder34.appendMinuteOfDay((int) '4');
        org.joda.time.format.DateTimePrinter dateTimePrinter37 = null;
        org.joda.time.format.DateTimeParser dateTimeParser38 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter39 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter37, dateTimeParser38);
        boolean boolean40 = dateTimeFormatter39.isPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser41 = dateTimeFormatter39.getParser();
        org.joda.time.format.DateTimePrinter dateTimePrinter42 = dateTimeFormatter39.getPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter44 = dateTimeFormatter39.withDefaultYear((int) (byte) -1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder45 = dateTimeFormatterBuilder36.append(dateTimeFormatter44);
        java.lang.Integer int46 = dateTimeFormatter44.getPivotYear();
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter48 = dateTimeFormatter44.withZone(dateTimeZone47);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter50 = dateTimeFormatter48.withPivotYear((java.lang.Integer) 36000000);
        org.joda.time.Chronology chronology52 = null;
        java.util.Locale locale54 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket55 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology52, locale54);
        dateTimeParserBucket55.setPivotYear((java.lang.Integer) 0);
        java.util.Locale locale58 = dateTimeParserBucket55.getLocale();
        java.util.Set<java.lang.String> strSet59 = locale58.getUnicodeLocaleAttributes();
        java.lang.String str60 = locale58.getDisplayName();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter61 = dateTimeFormatter50.withLocale(locale58);
        org.joda.time.DateTimeFieldType dateTimeFieldType62 = org.joda.time.DateTimeFieldType.dayOfWeek();
        org.joda.time.format.DateTimePrinter dateTimePrinter63 = null;
        org.joda.time.format.DateTimeParser dateTimeParser64 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter65 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter63, dateTimeParser64);
        org.joda.time.Chronology chronology67 = null;
        java.util.Locale locale69 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket70 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology67, locale69);
        org.joda.time.Chronology chronology71 = dateTimeParserBucket70.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter72 = dateTimeFormatter65.withChronology(chronology71);
        org.joda.time.DateTimeField dateTimeField73 = chronology71.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField74 = dateTimeFieldType62.getField(chronology71);
        org.joda.time.DateTimeField dateTimeField75 = chronology71.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField76 = chronology71.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone79 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 100, 1);
        org.joda.time.Chronology chronology80 = chronology71.withZone(dateTimeZone79);
        org.joda.time.DurationField durationField81 = chronology80.months();
        org.joda.time.DurationField durationField82 = chronology80.days();
        org.joda.time.DateTimeZone dateTimeZone83 = chronology80.getZone();
        java.lang.String str85 = dateTimeZone83.getNameKey((long) 61);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter86 = dateTimeFormatter50.withZone(dateTimeZone83);
        org.joda.time.Chronology chronology87 = chronology7.withZone(dateTimeZone83);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField10 and durationField82", (durationField10.compareTo(durationField82) == 0) == durationField10.equals(durationField82));
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale5 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology3, locale5);
        org.joda.time.Chronology chronology7 = dateTimeParserBucket6.getChronology();
        java.util.Locale locale8 = dateTimeParserBucket6.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology1, locale8, (java.lang.Integer) 0, (int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        dateTimeParserBucket11.saveField(dateTimeFieldType12, (int) (short) 10);
        org.joda.time.Chronology chronology16 = null;
        java.util.Locale locale18 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket19 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology16, locale18);
        org.joda.time.Chronology chronology20 = dateTimeParserBucket19.getChronology();
        org.joda.time.DateTimeField dateTimeField21 = chronology20.dayOfYear();
        org.joda.time.DateTimeField dateTimeField22 = chronology20.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField23 = chronology20.clockhourOfDay();
        org.joda.time.DurationField durationField24 = chronology20.hours();
        org.joda.time.DurationField durationField25 = chronology20.years();
        org.joda.time.DurationField durationField26 = chronology20.hours();
        org.joda.time.DateTimeField dateTimeField27 = chronology20.year();
        org.joda.time.DateTimeField dateTimeField28 = dateTimeFieldType12.getField(chronology20);
        org.joda.time.DurationFieldType durationFieldType29 = dateTimeFieldType12.getRangeDurationType();
        org.joda.time.Chronology chronology31 = null;
        java.util.Locale locale33 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket34 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology31, locale33);
        org.joda.time.Chronology chronology35 = dateTimeParserBucket34.getChronology();
        org.joda.time.DateTimeField dateTimeField36 = chronology35.dayOfYear();
        org.joda.time.DateTimeField dateTimeField37 = chronology35.yearOfEra();
        org.joda.time.DateTimeField dateTimeField38 = chronology35.clockhourOfDay();
        org.joda.time.DurationField durationField39 = chronology35.days();
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        long long44 = dateTimeZone41.convertLocalToUTC((long) 1, false);
        org.joda.time.Chronology chronology45 = chronology35.withZone(dateTimeZone41);
        org.joda.time.DurationField durationField46 = chronology45.weekyears();
        org.joda.time.DateTimeField dateTimeField47 = chronology45.hourOfDay();
        org.joda.time.ReadablePeriod readablePeriod48 = null;
        long long51 = chronology45.add(readablePeriod48, (-87L), (int) (short) -1);
        boolean boolean52 = dateTimeFieldType12.isSupported(chronology45);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField25 and durationField46", (durationField25.compareTo(durationField46) == 0) == durationField25.equals(durationField46));
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale3);
        org.joda.time.Chronology chronology5 = dateTimeParserBucket4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = chronology5.yearOfEra();
        org.joda.time.DurationField durationField8 = chronology5.hours();
        org.joda.time.Chronology chronology9 = chronology5.withUTC();
        org.joda.time.DateTimeField dateTimeField10 = chronology5.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField11 = chronology5.year();
        org.joda.time.DurationField durationField12 = chronology5.hours();
        org.joda.time.DurationField durationField13 = chronology5.eras();
        org.joda.time.DateTimeField dateTimeField14 = chronology5.dayOfWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField8 and durationField13", Math.signum(durationField8.compareTo(durationField13)) == -Math.signum(durationField13.compareTo(durationField8)));
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder2.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder3.appendWeekOfWeekyear((int) 'a');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder5.appendCenturyOfEra((int) 'a', (int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder8.appendDecimal(dateTimeFieldType9, (int) (short) 1, (-1));
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder8.appendTwoDigitYear(0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder14.appendMinuteOfHour((int) 'u');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder14.appendWeekOfWeekyear((int) (short) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder20 = dateTimeFormatterBuilder14.appendSecondOfDay((int) '#');
        org.joda.time.format.DateTimePrinter dateTimePrinter22 = null;
        org.joda.time.format.DateTimeParser dateTimeParser23 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter22, dateTimeParser23);
        org.joda.time.Chronology chronology26 = null;
        java.util.Locale locale28 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket29 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology26, locale28);
        org.joda.time.Chronology chronology30 = dateTimeParserBucket29.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = dateTimeFormatter24.withChronology(chronology30);
        boolean boolean32 = dateTimeFormatter31.isPrinter();
        org.joda.time.Chronology chronology33 = dateTimeFormatter31.getChronolgy();
        org.joda.time.DateTimeField dateTimeField34 = chronology33.dayOfMonth();
        java.util.Locale locale35 = java.util.Locale.GERMANY;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket38 = new org.joda.time.format.DateTimeParserBucket(0L, chronology33, locale35, (java.lang.Integer) 1, (int) (short) 10);
        java.util.Locale locale39 = dateTimeParserBucket38.getLocale();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder40 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder41 = dateTimeFormatterBuilder40.appendDayOfWeekShortText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder43 = dateTimeFormatterBuilder41.appendMinuteOfDay((int) '4');
        org.joda.time.DateTimeFieldType dateTimeFieldType44 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder45 = dateTimeFormatterBuilder43.appendShortText(dateTimeFieldType44);
        dateTimeParserBucket38.saveField(dateTimeFieldType44, 10);
        java.lang.String str48 = dateTimeFieldType44.getName();
        org.joda.time.Chronology chronology50 = null;
        java.util.Locale locale52 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket53 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology50, locale52);
        org.joda.time.Chronology chronology54 = dateTimeParserBucket53.getChronology();
        org.joda.time.DateTimeField dateTimeField55 = chronology54.dayOfYear();
        org.joda.time.DateTimeField dateTimeField56 = chronology54.hourOfDay();
        org.joda.time.DateTimeField dateTimeField57 = chronology54.secondOfMinute();
        org.joda.time.DurationField durationField58 = chronology54.hours();
        org.joda.time.DurationField durationField59 = chronology54.months();
        org.joda.time.DurationField durationField60 = chronology54.years();
        org.joda.time.DateTimeField dateTimeField61 = dateTimeFieldType44.getField(chronology54);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder63 = dateTimeFormatterBuilder14.appendFixedSignedDecimal(dateTimeFieldType44, 90000000);
        org.joda.time.Chronology chronology65 = null;
        java.util.Locale locale67 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket68 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology65, locale67);
        org.joda.time.Chronology chronology69 = dateTimeParserBucket68.getChronology();
        org.joda.time.DateTimeField dateTimeField70 = chronology69.dayOfYear();
        org.joda.time.DateTimeField dateTimeField71 = chronology69.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField72 = chronology69.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField73 = chronology69.year();
        org.joda.time.DurationField durationField74 = chronology69.weeks();
        org.joda.time.DurationField durationField75 = chronology69.weekyears();
        org.joda.time.DurationField durationField76 = chronology69.months();
        org.joda.time.DurationField durationField77 = chronology69.weeks();
        org.joda.time.DateTimeField dateTimeField78 = dateTimeFieldType44.getField(chronology69);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField60 and durationField75", (durationField60.compareTo(durationField75) == 0) == durationField60.equals(durationField75));
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale4 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology2, locale4);
        org.joda.time.Chronology chronology6 = dateTimeParserBucket5.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.dayOfYear();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.yearOfEra();
        org.joda.time.DurationField durationField9 = chronology6.days();
        org.joda.time.DateTimeField dateTimeField10 = chronology6.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField11 = chronology6.secondOfDay();
        org.joda.time.DateTimeField dateTimeField12 = chronology6.hourOfDay();
        java.util.Locale locale14 = java.util.Locale.forLanguageTag("chinois (Chine)");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket(0L, chronology6, locale14, (java.lang.Integer) 187200000, 43);
        org.joda.time.DurationField durationField18 = chronology6.eras();
        org.joda.time.DurationField durationField19 = chronology6.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField9 and durationField18", Math.signum(durationField9.compareTo(durationField18)) == -Math.signum(durationField18.compareTo(durationField9)));
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology4 = null;
        java.util.Locale locale6 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology4, locale6);
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withChronology(chronology8);
        boolean boolean10 = dateTimeFormatter9.isPrinter();
        org.joda.time.Chronology chronology11 = dateTimeFormatter9.getChronolgy();
        org.joda.time.DateTimeField dateTimeField12 = chronology11.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField13 = chronology11.weekyearOfCentury();
        org.joda.time.DurationField durationField14 = chronology11.weekyears();
        org.joda.time.DurationField durationField15 = chronology11.hours();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder16.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder20 = dateTimeFormatterBuilder18.appendDayOfWeek(1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = dateTimeFormatterBuilder20.toFormatter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = dateTimeFormatter21.withPivotYear(1);
        java.util.Locale locale25 = java.util.Locale.forLanguageTag("hi!");
        java.util.Set<java.lang.String> strSet26 = locale25.getUnicodeLocaleKeys();
        java.lang.String str27 = locale25.getDisplayScript();
        java.lang.String str28 = locale25.getCountry();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = dateTimeFormatter23.withLocale(locale25);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = dateTimeFormatter23.withDefaultYear((-127));
        org.joda.time.LocalDateTime localDateTime33 = dateTimeFormatter31.parseLocalDateTime("555");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder34 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder36 = dateTimeFormatterBuilder34.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder38 = dateTimeFormatterBuilder36.appendDayOfWeek(1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter39 = dateTimeFormatterBuilder38.toFormatter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter41 = dateTimeFormatter39.withPivotYear(1);
        java.util.Locale locale43 = java.util.Locale.forLanguageTag("hi!");
        java.util.Set<java.lang.String> strSet44 = locale43.getUnicodeLocaleKeys();
        java.lang.String str45 = locale43.getDisplayScript();
        java.lang.String str46 = locale43.getCountry();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter47 = dateTimeFormatter41.withLocale(locale43);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter49 = dateTimeFormatter41.withDefaultYear((-127));
        org.joda.time.LocalDateTime localDateTime51 = dateTimeFormatter49.parseLocalDateTime("555");
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.forOffsetMillis(58);
        boolean boolean54 = localDateTime51.equals((java.lang.Object) dateTimeZone53);
        int int55 = localDateTime33.compareTo((org.joda.time.ReadablePartial) localDateTime51);
        java.lang.String str56 = localDateTime51.toString();
        int[] intArray58 = chronology11.get((org.joda.time.ReadablePartial) localDateTime51, (-360059900L));
        org.joda.time.DurationField durationField59 = chronology11.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField59, durationField14, and durationField15", !(durationField59.compareTo(durationField14) == 0) || (Math.signum(durationField59.compareTo(durationField15)) == Math.signum(durationField14.compareTo(durationField15))));
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale4 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology2, locale4);
        org.joda.time.Chronology chronology6 = dateTimeParserBucket5.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.dayOfYear();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.hourOfHalfday();
        org.joda.time.DurationField durationField9 = chronology6.hours();
        org.joda.time.DurationField durationField10 = chronology6.seconds();
        org.joda.time.DateTimeField dateTimeField11 = chronology6.era();
        org.joda.time.DateTimeField dateTimeField12 = chronology6.dayOfYear();
        java.util.Locale locale13 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str14 = locale13.getDisplayScript();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket(0L, chronology6, locale13, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology17 = dateTimeParserBucket16.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.yearOfEra();
        org.joda.time.DurationField durationField19 = chronology17.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField19, durationField9, and durationField10", !(durationField19.compareTo(durationField9) == 0) || (Math.signum(durationField19.compareTo(durationField10)) == Math.signum(durationField9.compareTo(durationField10))));
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology4 = null;
        java.util.Locale locale6 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology4, locale6);
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withChronology(chronology8);
        boolean boolean10 = dateTimeFormatter9.isParser();
        org.joda.time.Chronology chronology11 = dateTimeFormatter9.getChronolgy();
        org.joda.time.DateTimeField dateTimeField12 = chronology11.millisOfDay();
        org.joda.time.Chronology chronology13 = chronology11.withUTC();
        org.joda.time.DurationField durationField14 = chronology11.years();
        org.joda.time.DateTimeField dateTimeField15 = chronology11.year();
        org.joda.time.DateTimeField dateTimeField16 = chronology11.year();
        org.joda.time.DateTimeField dateTimeField17 = chronology11.yearOfEra();
        org.joda.time.DurationField durationField18 = chronology11.eras();
        org.joda.time.DateTimeField dateTimeField19 = chronology11.secondOfMinute();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField14 and durationField18", Math.signum(durationField14.compareTo(durationField18)) == -Math.signum(durationField18.compareTo(durationField14)));
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfWeek();
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.Chronology chronology5 = null;
        java.util.Locale locale7 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology5, locale7);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket8.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter3.withChronology(chronology9);
        org.joda.time.DateTimeField dateTimeField11 = chronology9.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField12 = dateTimeFieldType0.getField(chronology9);
        org.joda.time.DateTimeField dateTimeField13 = chronology9.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone15);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone15);
        org.joda.time.Chronology chronology18 = chronology9.withZone(dateTimeZone15);
        org.joda.time.DurationField durationField19 = chronology18.minutes();
        org.joda.time.DurationField durationField20 = chronology18.eras();
        org.joda.time.DateTimeField dateTimeField21 = chronology18.centuryOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField19 and durationField20", Math.signum(durationField19.compareTo(durationField20)) == -Math.signum(durationField20.compareTo(durationField19)));
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale3);
        org.joda.time.Chronology chronology5 = dateTimeParserBucket4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = chronology5.hourOfHalfday();
        org.joda.time.DurationField durationField8 = chronology5.hours();
        org.joda.time.DurationField durationField9 = chronology5.seconds();
        org.joda.time.DateTimeField dateTimeField10 = chronology5.era();
        org.joda.time.DateTimeField dateTimeField11 = chronology5.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField12 = chronology5.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone13 = chronology5.getZone();
        org.joda.time.DateTimeField dateTimeField14 = chronology5.hourOfHalfday();
        java.lang.String str15 = chronology5.toString();
        org.joda.time.DurationField durationField16 = chronology5.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField16, durationField8, and durationField9", !(durationField16.compareTo(durationField8) == 0) || (Math.signum(durationField16.compareTo(durationField9)) == Math.signum(durationField8.compareTo(durationField9))));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale3);
        org.joda.time.Chronology chronology5 = dateTimeParserBucket4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = chronology5.yearOfEra();
        org.joda.time.DurationField durationField8 = chronology5.hours();
        org.joda.time.DateTimeField dateTimeField9 = chronology5.secondOfMinute();
        org.joda.time.Chronology chronology10 = chronology5.withUTC();
        org.joda.time.DateTimeField dateTimeField11 = chronology10.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField12 = chronology10.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField13 = chronology10.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone14 = chronology10.getZone();
        org.joda.time.DurationField durationField15 = chronology10.days();
        org.joda.time.DurationField durationField16 = chronology10.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField16, durationField8, and durationField15", !(durationField16.compareTo(durationField8) == 0) || (Math.signum(durationField16.compareTo(durationField15)) == Math.signum(durationField8.compareTo(durationField15))));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale4 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology2, locale4);
        org.joda.time.Chronology chronology6 = dateTimeParserBucket5.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.dayOfYear();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.yearOfEra();
        org.joda.time.DurationField durationField9 = chronology6.hours();
        org.joda.time.Chronology chronology10 = chronology6.withUTC();
        org.joda.time.DurationField durationField11 = chronology6.seconds();
        org.joda.time.DateTimeField dateTimeField12 = chronology6.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str15 = dateTimeZone13.getName(97L);
        org.joda.time.Chronology chronology18 = null;
        java.util.Locale locale20 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket21 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology18, locale20);
        java.lang.String str22 = dateTimeZone13.getName((long) (byte) 10, locale20);
        long long26 = dateTimeZone13.convertLocalToUTC((long) 0, true, (long) 10);
        int int28 = dateTimeZone13.getOffset((long) 'u');
        org.joda.time.Chronology chronology29 = chronology6.withZone(dateTimeZone13);
        org.joda.time.DurationField durationField30 = chronology29.halfdays();
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = org.joda.time.DateTimeFieldType.dayOfWeek();
        org.joda.time.format.DateTimePrinter dateTimePrinter33 = null;
        org.joda.time.format.DateTimeParser dateTimeParser34 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter35 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter33, dateTimeParser34);
        org.joda.time.Chronology chronology37 = null;
        java.util.Locale locale39 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket40 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology37, locale39);
        org.joda.time.Chronology chronology41 = dateTimeParserBucket40.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter42 = dateTimeFormatter35.withChronology(chronology41);
        org.joda.time.DateTimeField dateTimeField43 = chronology41.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField44 = dateTimeFieldType32.getField(chronology41);
        org.joda.time.DateTimeField dateTimeField45 = chronology41.secondOfMinute();
        org.joda.time.ReadablePeriod readablePeriod46 = null;
        long long49 = chronology41.add(readablePeriod46, (long) 1, (int) (short) 10);
        java.util.Locale locale51 = java.util.Locale.forLanguageTag("hi!");
        java.lang.String str52 = locale51.getDisplayVariant();
        java.lang.String str53 = locale51.getCountry();
        java.lang.String str54 = locale51.getDisplayVariant();
        java.lang.String str55 = locale51.getDisplayCountry();
        java.lang.String str56 = locale51.getISO3Country();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket58 = new org.joda.time.format.DateTimeParserBucket((long) 97, chronology41, locale51, (java.lang.Integer) 88);
        org.joda.time.Chronology chronology61 = null;
        java.util.Locale locale63 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket64 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology61, locale63);
        org.joda.time.Chronology chronology65 = dateTimeParserBucket64.getChronology();
        org.joda.time.DateTimeField dateTimeField66 = chronology65.dayOfYear();
        org.joda.time.DateTimeField dateTimeField67 = chronology65.yearOfEra();
        org.joda.time.DurationField durationField68 = chronology65.days();
        java.lang.String str69 = chronology65.toString();
        java.util.Locale locale71 = java.util.Locale.forLanguageTag("hi!");
        java.util.Set<java.lang.String> strSet72 = locale71.getUnicodeLocaleKeys();
        java.lang.String str73 = locale71.getDisplayScript();
        java.lang.String str74 = locale71.getCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket76 = new org.joda.time.format.DateTimeParserBucket((long) (short) 10, chronology65, locale71, (java.lang.Integer) 10);
        java.util.Set<java.lang.String> strSet77 = locale71.getUnicodeLocaleKeys();
        java.lang.String str78 = locale51.getDisplayVariant(locale71);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket80 = new org.joda.time.format.DateTimeParserBucket((long) (-1), chronology29, locale51, (java.lang.Integer) 10800000);
        long long83 = dateTimeParserBucket80.computeMillis(true, "-04:00");
        org.joda.time.Chronology chronology84 = dateTimeParserBucket80.getChronology();
        org.joda.time.DurationField durationField85 = chronology84.halfdays();
        org.joda.time.ReadablePeriod readablePeriod86 = null;
        long long89 = chronology84.add(readablePeriod86, 363659999L, 0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField30 and durationField85", (durationField30.compareTo(durationField85) == 0) == durationField30.equals(durationField85));
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale3);
        org.joda.time.Chronology chronology5 = dateTimeParserBucket4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = chronology5.yearOfEra();
        org.joda.time.DurationField durationField8 = chronology5.hours();
        org.joda.time.Chronology chronology9 = chronology5.withUTC();
        org.joda.time.DateTimeField dateTimeField10 = chronology5.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField11 = chronology5.era();
        org.joda.time.DateTimeField dateTimeField12 = chronology5.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField13 = chronology5.dayOfWeek();
        org.joda.time.DurationField durationField14 = chronology5.seconds();
        org.joda.time.Chronology chronology15 = chronology5.withUTC();
        org.joda.time.DateTimeField dateTimeField16 = chronology15.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField17 = chronology15.monthOfYear();
        org.joda.time.DurationField durationField18 = chronology15.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField18, durationField8, and durationField14", !(durationField18.compareTo(durationField8) == 0) || (Math.signum(durationField18.compareTo(durationField14)) == Math.signum(durationField8.compareTo(durationField14))));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale3);
        org.joda.time.DateTimeField dateTimeField5 = null;
        dateTimeParserBucket4.saveField(dateTimeField5, (int) (byte) 0);
        java.util.Locale locale8 = dateTimeParserBucket4.getLocale();
        java.lang.Object obj9 = dateTimeParserBucket4.saveState();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder10.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder12.appendTimeZoneId();
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder13.appendFixedDecimal(dateTimeFieldType14, (int) '4');
        dateTimeParserBucket4.saveField(dateTimeFieldType14, (int) (short) 1);
        java.lang.String str19 = dateTimeFieldType14.toString();
        org.joda.time.Chronology chronology21 = null;
        java.util.Locale locale23 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket24 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology21, locale23);
        org.joda.time.Chronology chronology25 = dateTimeParserBucket24.getChronology();
        org.joda.time.DateTimeField dateTimeField26 = chronology25.dayOfYear();
        org.joda.time.DateTimeField dateTimeField27 = chronology25.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField28 = chronology25.clockhourOfDay();
        org.joda.time.DurationField durationField29 = chronology25.weekyears();
        org.joda.time.DateTimeField dateTimeField30 = dateTimeFieldType14.getField(chronology25);
        org.joda.time.DurationField durationField31 = chronology25.years();
        org.joda.time.DateTimeField dateTimeField32 = chronology25.secondOfMinute();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField29 and durationField31", (durationField29.compareTo(durationField31) == 0) == durationField29.equals(durationField31));
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology4 = null;
        java.util.Locale locale6 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology4, locale6);
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withChronology(chronology8);
        boolean boolean10 = dateTimeFormatter9.isParser();
        org.joda.time.Chronology chronology11 = dateTimeFormatter9.getChronolgy();
        org.joda.time.DateTimeField dateTimeField12 = chronology11.millisOfDay();
        org.joda.time.Chronology chronology13 = chronology11.withUTC();
        org.joda.time.DurationField durationField14 = chronology11.years();
        org.joda.time.DateTimeField dateTimeField15 = chronology11.year();
        org.joda.time.DateTimeField dateTimeField16 = chronology11.year();
        org.joda.time.DateTimeField dateTimeField17 = chronology11.yearOfEra();
        org.joda.time.DurationField durationField18 = chronology11.eras();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetMillis((int) 'x');
        org.joda.time.ReadableInstant readableInstant21 = null;
        int int22 = dateTimeZone20.getOffset(readableInstant21);
        org.joda.time.Chronology chronology23 = chronology11.withZone(dateTimeZone20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField14 and durationField18", Math.signum(durationField14.compareTo(durationField18)) == -Math.signum(durationField18.compareTo(durationField14)));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale3);
        org.joda.time.Chronology chronology5 = dateTimeParserBucket4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = chronology5.yearOfEra();
        org.joda.time.DurationField durationField8 = chronology5.hours();
        org.joda.time.Chronology chronology9 = chronology5.withUTC();
        org.joda.time.DateTimeField dateTimeField10 = chronology5.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField11 = chronology5.era();
        org.joda.time.DateTimeField dateTimeField12 = chronology5.dayOfYear();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        long long16 = chronology5.add(readablePeriod13, (long) '4', 10);
        org.joda.time.DurationField durationField17 = chronology5.eras();
        org.joda.time.Chronology chronology18 = chronology5.withUTC();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField8 and durationField17", Math.signum(durationField8.compareTo(durationField17)) == -Math.signum(durationField17.compareTo(durationField8)));
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale3);
        org.joda.time.Chronology chronology5 = dateTimeParserBucket4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = chronology5.hourOfHalfday();
        org.joda.time.DurationField durationField8 = chronology5.hours();
        org.joda.time.DurationField durationField9 = chronology5.seconds();
        org.joda.time.DateTimeField dateTimeField10 = chronology5.era();
        org.joda.time.DateTimeField dateTimeField11 = chronology5.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField12 = chronology5.clockhourOfHalfday();
        org.joda.time.DurationField durationField13 = chronology5.halfdays();
        org.joda.time.DateTimeField dateTimeField14 = chronology5.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField15 = chronology5.clockhourOfDay();
        org.joda.time.DurationField durationField16 = chronology5.minutes();
        org.joda.time.DurationField durationField17 = chronology5.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField17, durationField8, and durationField9", !(durationField17.compareTo(durationField8) == 0) || (Math.signum(durationField17.compareTo(durationField9)) == Math.signum(durationField8.compareTo(durationField9))));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale4 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology2, locale4);
        org.joda.time.Chronology chronology6 = dateTimeParserBucket5.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.dayOfYear();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.hourOfDay();
        java.util.Locale locale10 = new java.util.Locale("fr");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = new org.joda.time.format.DateTimeParserBucket((long) (short) 1, chronology6, locale10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        long long15 = chronology6.add(readablePeriod12, (long) (byte) 100, 100);
        org.joda.time.DurationField durationField16 = chronology6.eras();
        org.joda.time.DurationField durationField17 = chronology6.years();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField16, durationField17, and durationField16", !(durationField16.compareTo(durationField17) == 0) || (Math.signum(durationField16.compareTo(durationField16)) == Math.signum(durationField17.compareTo(durationField16))));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale3);
        org.joda.time.Chronology chronology5 = dateTimeParserBucket4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = chronology5.clockhourOfDay();
        org.joda.time.DurationField durationField9 = chronology5.weekyears();
        org.joda.time.DateTimeField dateTimeField10 = chronology5.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 0);
        java.lang.String str14 = dateTimeZone12.getNameKey(1L);
        org.joda.time.LocalDateTime localDateTime15 = null;
        boolean boolean16 = dateTimeZone12.isLocalDateTimeGap(localDateTime15);
        java.util.TimeZone timeZone17 = dateTimeZone12.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.UTC;
        long long20 = dateTimeZone12.getMillisKeepLocal(dateTimeZone18, (long) 0);
        org.joda.time.Chronology chronology21 = chronology5.withZone(dateTimeZone12);
        org.joda.time.DurationField durationField22 = chronology5.years();
        org.joda.time.DateTimeField dateTimeField23 = chronology5.era();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField9 and durationField22", (durationField9.compareTo(durationField22) == 0) == durationField9.equals(durationField22));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale3);
        org.joda.time.Chronology chronology5 = dateTimeParserBucket4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = chronology5.yearOfEra();
        org.joda.time.DurationField durationField8 = chronology5.hours();
        org.joda.time.DurationField durationField9 = chronology5.weeks();
        org.joda.time.DateTimeField dateTimeField10 = chronology5.era();
        org.joda.time.DurationField durationField11 = chronology5.weeks();
        org.joda.time.Chronology chronology12 = chronology5.withUTC();
        org.joda.time.DateTimeField dateTimeField13 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField14 = chronology5.weekyear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.getDefault();
        int int17 = dateTimeZone15.getStandardOffset((-33289018452L));
        org.joda.time.Chronology chronology18 = chronology5.withZone(dateTimeZone15);
        org.joda.time.DurationField durationField19 = chronology18.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField19, durationField8, and durationField9", !(durationField19.compareTo(durationField8) == 0) || (Math.signum(durationField19.compareTo(durationField9)) == Math.signum(durationField8.compareTo(durationField9))));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale3);
        org.joda.time.Chronology chronology5 = dateTimeParserBucket4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = chronology5.clockhourOfDay();
        org.joda.time.DurationField durationField9 = chronology5.weekyears();
        org.joda.time.DurationField durationField10 = chronology5.eras();
        org.joda.time.DateTimeField dateTimeField11 = chronology5.weekyearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField9 and durationField10", Math.signum(durationField9.compareTo(durationField10)) == -Math.signum(durationField10.compareTo(durationField9)));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale3);
        org.joda.time.Chronology chronology5 = dateTimeParserBucket4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.clockhourOfHalfday();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        long long10 = chronology5.add(readablePeriod7, (long) (byte) 0, (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField11 = chronology5.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField12 = chronology5.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField13 = chronology5.millisOfSecond();
        org.joda.time.Chronology chronology16 = null;
        java.util.Locale locale18 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket19 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology16, locale18);
        org.joda.time.Chronology chronology20 = dateTimeParserBucket19.getChronology();
        org.joda.time.DateTimeField dateTimeField21 = chronology20.dayOfYear();
        org.joda.time.DateTimeField dateTimeField22 = chronology20.yearOfEra();
        org.joda.time.DurationField durationField23 = chronology20.days();
        java.lang.String str24 = chronology20.toString();
        java.util.Locale locale26 = java.util.Locale.forLanguageTag("hi!");
        java.util.Set<java.lang.String> strSet27 = locale26.getUnicodeLocaleKeys();
        java.lang.String str28 = locale26.getDisplayScript();
        java.lang.String str29 = locale26.getCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket31 = new org.joda.time.format.DateTimeParserBucket((long) (short) 10, chronology20, locale26, (java.lang.Integer) 10);
        org.joda.time.DateTimeZone dateTimeZone32 = dateTimeParserBucket31.getZone();
        org.joda.time.Chronology chronology34 = null;
        java.util.Locale locale36 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket37 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology34, locale36);
        org.joda.time.Chronology chronology38 = dateTimeParserBucket37.getChronology();
        org.joda.time.DurationField durationField39 = chronology38.halfdays();
        boolean boolean40 = dateTimeZone32.equals((java.lang.Object) durationField39);
        java.util.TimeZone timeZone41 = dateTimeZone32.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.forTimeZone(timeZone41);
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.forTimeZone(timeZone41);
        org.joda.time.Chronology chronology44 = chronology5.withZone(dateTimeZone43);
        org.joda.time.DateTimeField dateTimeField45 = chronology44.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField46 = chronology44.hourOfHalfday();
        org.joda.time.format.DateTimePrinter dateTimePrinter48 = null;
        org.joda.time.format.DateTimeParser dateTimeParser49 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter50 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter48, dateTimeParser49);
        org.joda.time.Chronology chronology52 = null;
        java.util.Locale locale54 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket55 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology52, locale54);
        org.joda.time.Chronology chronology56 = dateTimeParserBucket55.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter57 = dateTimeFormatter50.withChronology(chronology56);
        boolean boolean58 = dateTimeFormatter57.isPrinter();
        org.joda.time.Chronology chronology59 = dateTimeFormatter57.getChronolgy();
        org.joda.time.DateTimeField dateTimeField60 = chronology59.dayOfMonth();
        java.util.Locale locale61 = java.util.Locale.GERMANY;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket64 = new org.joda.time.format.DateTimeParserBucket(0L, chronology59, locale61, (java.lang.Integer) 1, (int) (short) 10);
        java.lang.Integer int65 = dateTimeParserBucket64.getOffsetInteger();
        org.joda.time.DateTimeZone dateTimeZone66 = dateTimeParserBucket64.getZone();
        java.lang.String str68 = dateTimeZone66.getNameKey((long) 3);
        org.joda.time.Chronology chronology69 = chronology44.withZone(dateTimeZone66);
        org.joda.time.DurationField durationField70 = chronology69.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField70, durationField23, and durationField39", !(durationField70.compareTo(durationField23) == 0) || (Math.signum(durationField70.compareTo(durationField39)) == Math.signum(durationField23.compareTo(durationField39))));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale3);
        org.joda.time.Chronology chronology5 = dateTimeParserBucket4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = chronology5.clockhourOfDay();
        org.joda.time.DurationField durationField9 = chronology5.weekyears();
        org.joda.time.DateTimeField dateTimeField10 = chronology5.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 0);
        java.lang.String str14 = dateTimeZone12.getNameKey(1L);
        org.joda.time.LocalDateTime localDateTime15 = null;
        boolean boolean16 = dateTimeZone12.isLocalDateTimeGap(localDateTime15);
        java.util.TimeZone timeZone17 = dateTimeZone12.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.UTC;
        long long20 = dateTimeZone12.getMillisKeepLocal(dateTimeZone18, (long) 0);
        org.joda.time.Chronology chronology21 = chronology5.withZone(dateTimeZone12);
        org.joda.time.DateTimeZone dateTimeZone22 = chronology21.getZone();
        org.joda.time.DateTimeField dateTimeField23 = chronology21.hourOfDay();
        org.joda.time.DurationField durationField24 = chronology21.weeks();
        org.joda.time.DurationField durationField25 = chronology21.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField25, durationField9, and durationField24", !(durationField25.compareTo(durationField9) == 0) || (Math.signum(durationField25.compareTo(durationField24)) == Math.signum(durationField9.compareTo(durationField24))));
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale3);
        org.joda.time.Chronology chronology5 = dateTimeParserBucket4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = chronology5.yearOfEra();
        org.joda.time.DateTimeField dateTimeField8 = chronology5.clockhourOfDay();
        org.joda.time.DurationField durationField9 = chronology5.days();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        long long14 = dateTimeZone11.convertLocalToUTC((long) 1, false);
        org.joda.time.Chronology chronology15 = chronology5.withZone(dateTimeZone11);
        org.joda.time.DurationField durationField16 = chronology15.weekyears();
        org.joda.time.DateTimeField dateTimeField17 = chronology15.hourOfDay();
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        long long21 = chronology15.add(readablePeriod18, (-87L), (int) (short) -1);
        org.joda.time.DurationField durationField22 = chronology15.years();
        org.joda.time.DateTimeField dateTimeField23 = chronology15.clockhourOfHalfday();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField16 and durationField22", (durationField16.compareTo(durationField22) == 0) == durationField16.equals(durationField22));
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale3);
        org.joda.time.Chronology chronology5 = dateTimeParserBucket4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = chronology5.hourOfHalfday();
        org.joda.time.DurationField durationField8 = chronology5.hours();
        org.joda.time.DurationField durationField9 = chronology5.seconds();
        org.joda.time.DateTimeField dateTimeField10 = chronology5.era();
        org.joda.time.DateTimeField dateTimeField11 = chronology5.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField12 = chronology5.clockhourOfHalfday();
        org.joda.time.DurationField durationField13 = chronology5.halfdays();
        org.joda.time.DateTimeField dateTimeField14 = chronology5.millisOfSecond();
        org.joda.time.DurationField durationField15 = chronology5.halfdays();
        org.joda.time.Chronology chronology17 = null;
        java.util.Locale locale19 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket20 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology17, locale19);
        org.joda.time.DateTimeField dateTimeField21 = null;
        dateTimeParserBucket20.saveField(dateTimeField21, (int) (byte) 0);
        java.util.Locale locale24 = dateTimeParserBucket20.getLocale();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.UTC;
        dateTimeParserBucket20.setZone(dateTimeZone25);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.UTC;
        long long29 = dateTimeZone27.convertUTCToLocal((long) 'x');
        dateTimeParserBucket20.setZone(dateTimeZone27);
        int int32 = dateTimeZone27.getStandardOffset((long) 100);
        org.joda.time.Chronology chronology33 = chronology5.withZone(dateTimeZone27);
        long long37 = chronology5.add(2L, 36000239L, (-6));
        org.joda.time.DurationField durationField38 = chronology5.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField38, durationField8, and durationField9", !(durationField38.compareTo(durationField8) == 0) || (Math.signum(durationField38.compareTo(durationField9)) == Math.signum(durationField8.compareTo(durationField9))));
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale3);
        org.joda.time.Chronology chronology5 = dateTimeParserBucket4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = chronology5.hourOfDay();
        org.joda.time.DateTimeField dateTimeField8 = chronology5.secondOfMinute();
        org.joda.time.DurationField durationField9 = chronology5.eras();
        org.joda.time.DateTimeZone dateTimeZone10 = chronology5.getZone();
        org.joda.time.DurationField durationField11 = chronology5.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField11, and durationField9", !(durationField9.compareTo(durationField11) == 0) || (Math.signum(durationField9.compareTo(durationField9)) == Math.signum(durationField11.compareTo(durationField9))));
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale4 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology2, locale4);
        org.joda.time.Chronology chronology6 = dateTimeParserBucket5.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.dayOfYear();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.hourOfDay();
        org.joda.time.DurationField durationField9 = chronology6.years();
        org.joda.time.DurationField durationField10 = chronology6.centuries();
        org.joda.time.Chronology chronology14 = null;
        java.util.Locale locale16 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology14, locale16);
        org.joda.time.Chronology chronology18 = dateTimeParserBucket17.getChronology();
        org.joda.time.DateTimeField dateTimeField19 = chronology18.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField20 = chronology18.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField21 = chronology18.year();
        org.joda.time.Chronology chronology23 = null;
        java.util.Locale locale25 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket26 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology23, locale25);
        org.joda.time.Chronology chronology27 = dateTimeParserBucket26.getChronology();
        java.util.Locale locale28 = dateTimeParserBucket26.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket30 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology18, locale28, (java.lang.Integer) 1);
        java.util.Locale locale31 = java.util.Locale.TAIWAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket33 = new org.joda.time.format.DateTimeParserBucket(0L, chronology18, locale31, (java.lang.Integer) 100);
        org.joda.time.DateTimeZone dateTimeZone34 = dateTimeParserBucket33.getZone();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone34);
        java.lang.String str36 = dateTimeZone34.getID();
        int int38 = dateTimeZone34.getOffsetFromLocal(852076800010L);
        java.util.Locale locale41 = java.util.Locale.forLanguageTag("hi!");
        java.util.Set<java.lang.String> strSet42 = locale41.getUnicodeLocaleKeys();
        java.lang.String str44 = locale41.getExtension('a');
        org.joda.time.Chronology chronology47 = null;
        java.util.Locale locale49 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket50 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology47, locale49);
        org.joda.time.Chronology chronology51 = dateTimeParserBucket50.getChronology();
        org.joda.time.DateTimeField dateTimeField52 = chronology51.dayOfYear();
        org.joda.time.DateTimeField dateTimeField53 = chronology51.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField54 = chronology51.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField55 = chronology51.year();
        org.joda.time.DurationField durationField56 = chronology51.weeks();
        org.joda.time.DurationField durationField57 = chronology51.weekyears();
        java.util.Locale locale59 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale60 = locale59.stripExtensions();
        java.util.Locale locale61 = java.util.Locale.GERMANY;
        java.lang.String str62 = locale59.getDisplayLanguage(locale61);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket65 = new org.joda.time.format.DateTimeParserBucket((long) (short) 100, chronology51, locale59, (java.lang.Integer) 3600000, 0);
        java.lang.String str66 = locale41.getDisplayLanguage(locale59);
        java.util.Locale.setDefault(locale41);
        java.lang.String str68 = dateTimeZone34.getName(799199998L, locale41);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket69 = new org.joda.time.format.DateTimeParserBucket((long) 208800000, chronology6, locale41);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField9 and durationField57", (durationField9.compareTo(durationField57) == 0) == durationField9.equals(durationField57));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale4 = new java.util.Locale("fr");
        java.util.Locale locale5 = java.util.Locale.FRENCH;
        java.lang.String str6 = locale5.toLanguageTag();
        java.lang.String str7 = locale4.getDisplayLanguage(locale5);
        java.util.Locale locale8 = null;
        java.lang.String str9 = locale4.getDisplayCountry(locale8);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = new org.joda.time.format.DateTimeParserBucket((long) 10, chronology2, locale4, (java.lang.Integer) 0);
        java.util.TimeZone timeZone12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        dateTimeParserBucket11.setZone(dateTimeZone13);
        org.joda.time.Chronology chronology15 = dateTimeParserBucket11.getChronology();
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.Chronology chronology21 = null;
        java.util.Locale locale23 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket24 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology21, locale23);
        org.joda.time.Chronology chronology25 = dateTimeParserBucket24.getChronology();
        java.util.Locale locale26 = dateTimeParserBucket24.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket29 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology19, locale26, (java.lang.Integer) 0, (int) (short) 100);
        dateTimeParserBucket11.saveField(dateTimeFieldType16, "hi!", locale26);
        org.joda.time.format.DateTimePrinter dateTimePrinter31 = null;
        org.joda.time.format.DateTimeParser dateTimeParser32 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter33 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter31, dateTimeParser32);
        org.joda.time.Chronology chronology35 = null;
        java.util.Locale locale37 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket38 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology35, locale37);
        org.joda.time.Chronology chronology39 = dateTimeParserBucket38.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter40 = dateTimeFormatter33.withChronology(chronology39);
        boolean boolean41 = dateTimeFormatter40.isPrinter();
        org.joda.time.Chronology chronology42 = dateTimeFormatter40.getChronolgy();
        org.joda.time.DateTimeField dateTimeField43 = chronology42.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField44 = chronology42.weekyearOfCentury();
        boolean boolean45 = dateTimeFieldType16.isSupported(chronology42);
        org.joda.time.Chronology chronology47 = null;
        java.util.Locale locale49 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket50 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology47, locale49);
        org.joda.time.Chronology chronology51 = dateTimeParserBucket50.getChronology();
        org.joda.time.DateTimeField dateTimeField52 = chronology51.dayOfYear();
        org.joda.time.DateTimeField dateTimeField53 = chronology51.hourOfHalfday();
        org.joda.time.DurationField durationField54 = chronology51.hours();
        org.joda.time.DurationField durationField55 = chronology51.seconds();
        org.joda.time.DurationField durationField56 = chronology51.days();
        org.joda.time.DateTimeZone dateTimeZone57 = chronology51.getZone();
        org.joda.time.DateTimeField dateTimeField58 = chronology51.era();
        long long62 = chronology51.add(12625L, 18000000L, (-6));
        boolean boolean63 = dateTimeFieldType16.isSupported(chronology51);
        java.util.Locale locale65 = new java.util.Locale("fr");
        java.util.Locale locale66 = java.util.Locale.FRENCH;
        java.lang.String str67 = locale66.toLanguageTag();
        java.lang.String str68 = locale65.getDisplayLanguage(locale66);
        java.util.Locale locale69 = null;
        java.lang.String str70 = locale65.getDisplayCountry(locale69);
        java.lang.String str71 = locale65.getISO3Language();
        java.util.Locale locale74 = new java.util.Locale("+01:00", "it");
        java.lang.String str75 = locale65.getDisplayVariant(locale74);
        java.util.Locale.setDefault(locale65);
        java.util.Locale.setDefault(locale65);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket80 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology51, locale65, (java.lang.Integer) 0, 36000196);
        org.joda.time.DateTimeField dateTimeField81 = chronology51.clockhourOfHalfday();
        org.joda.time.DurationField durationField82 = chronology51.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField82, durationField54, and durationField55", !(durationField82.compareTo(durationField54) == 0) || (Math.signum(durationField82.compareTo(durationField55)) == Math.signum(durationField54.compareTo(durationField55))));
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale3);
        org.joda.time.Chronology chronology5 = dateTimeParserBucket4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = chronology5.yearOfEra();
        org.joda.time.DurationField durationField8 = chronology5.days();
        java.lang.String str9 = chronology5.toString();
        org.joda.time.DurationField durationField10 = chronology5.weeks();
        org.joda.time.DurationField durationField11 = chronology5.years();
        org.joda.time.DateTimeField dateTimeField12 = chronology5.monthOfYear();
        org.joda.time.DurationField durationField13 = chronology5.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField13, durationField8, and durationField10", !(durationField13.compareTo(durationField8) == 0) || (Math.signum(durationField13.compareTo(durationField10)) == Math.signum(durationField8.compareTo(durationField10))));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology4 = null;
        java.util.Locale locale6 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology4, locale6);
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withChronology(chronology8);
        boolean boolean10 = dateTimeFormatter9.isPrinter();
        org.joda.time.Chronology chronology11 = dateTimeFormatter9.getChronolgy();
        org.joda.time.DurationField durationField12 = chronology11.hours();
        org.joda.time.DateTimeField dateTimeField13 = chronology11.monthOfYear();
        org.joda.time.DateTimeField dateTimeField14 = chronology11.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField15 = chronology11.weekyearOfCentury();
        org.joda.time.DurationField durationField16 = chronology11.weekyears();
        org.joda.time.Chronology chronology17 = chronology11.withUTC();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.weekyear();
        org.joda.time.DateTimeField dateTimeField19 = chronology17.halfdayOfDay();
        org.joda.time.DurationField durationField20 = chronology17.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField20, durationField12, and durationField16", !(durationField20.compareTo(durationField12) == 0) || (Math.signum(durationField20.compareTo(durationField16)) == Math.signum(durationField12.compareTo(durationField16))));
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfWeek();
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.Chronology chronology5 = null;
        java.util.Locale locale7 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology5, locale7);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket8.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter3.withChronology(chronology9);
        org.joda.time.DateTimeField dateTimeField11 = chronology9.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField12 = dateTimeFieldType0.getField(chronology9);
        org.joda.time.DateTimeField dateTimeField13 = chronology9.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField14 = chronology9.halfdayOfDay();
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        long long18 = chronology9.add(readablePeriod15, (long) (byte) 10, (int) (byte) -1);
        org.joda.time.DurationField durationField19 = chronology9.seconds();
        org.joda.time.DurationField durationField20 = chronology9.weekyears();
        org.joda.time.DurationField durationField21 = chronology9.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField21, durationField19, and durationField20", !(durationField21.compareTo(durationField19) == 0) || (Math.signum(durationField21.compareTo(durationField20)) == Math.signum(durationField19.compareTo(durationField20))));
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale3);
        org.joda.time.Chronology chronology5 = dateTimeParserBucket4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = chronology5.clockhourOfDay();
        org.joda.time.DurationField durationField9 = chronology5.weekyears();
        org.joda.time.DateTimeField dateTimeField10 = chronology5.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 0);
        java.lang.String str14 = dateTimeZone12.getNameKey(1L);
        org.joda.time.LocalDateTime localDateTime15 = null;
        boolean boolean16 = dateTimeZone12.isLocalDateTimeGap(localDateTime15);
        java.util.TimeZone timeZone17 = dateTimeZone12.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.UTC;
        long long20 = dateTimeZone12.getMillisKeepLocal(dateTimeZone18, (long) 0);
        org.joda.time.Chronology chronology21 = chronology5.withZone(dateTimeZone12);
        org.joda.time.DurationField durationField22 = chronology5.years();
        org.joda.time.DateTimeField dateTimeField23 = chronology5.weekOfWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField9 and durationField22", (durationField9.compareTo(durationField22) == 0) == durationField9.equals(durationField22));
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendDayOfWeekShortText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendTimeZoneName();
        boolean boolean3 = dateTimeFormatterBuilder0.canBuildPrinter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder0.appendDayOfWeekShortText();
        org.joda.time.format.DateTimeParser dateTimeParser5 = dateTimeFormatterBuilder0.toParser();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.dayOfWeek();
        org.joda.time.format.DateTimePrinter dateTimePrinter8 = null;
        org.joda.time.format.DateTimeParser dateTimeParser9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter8, dateTimeParser9);
        org.joda.time.Chronology chronology12 = null;
        java.util.Locale locale14 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology12, locale14);
        org.joda.time.Chronology chronology16 = dateTimeParserBucket15.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter10.withChronology(chronology16);
        org.joda.time.DateTimeField dateTimeField18 = chronology16.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField19 = dateTimeFieldType7.getField(chronology16);
        org.joda.time.DateTimeField dateTimeField20 = chronology16.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone22);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone22);
        org.joda.time.Chronology chronology25 = chronology16.withZone(dateTimeZone22);
        org.joda.time.DurationField durationField26 = chronology16.days();
        java.util.Locale locale28 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale29 = locale28.stripExtensions();
        boolean boolean30 = locale29.hasExtensions();
        java.lang.String str31 = locale29.getISO3Language();
        java.util.Locale locale32 = java.util.Locale.KOREAN;
        boolean boolean33 = locale32.hasExtensions();
        java.lang.String str35 = locale32.getExtension('a');
        java.lang.String str36 = locale32.getDisplayName();
        java.lang.String str37 = locale29.getDisplayLanguage(locale32);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket38 = new org.joda.time.format.DateTimeParserBucket(3600120L, chronology16, locale29);
        int int41 = dateTimeParser5.parseInto(dateTimeParserBucket38, "Vereinigte Staaten von Amerika", 10);
        java.lang.Object obj42 = dateTimeParserBucket38.saveState();
        org.joda.time.Chronology chronology45 = null;
        java.util.Locale locale47 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket48 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology45, locale47);
        org.joda.time.Chronology chronology49 = dateTimeParserBucket48.getChronology();
        org.joda.time.DateTimeField dateTimeField50 = chronology49.dayOfYear();
        org.joda.time.DateTimeField dateTimeField51 = chronology49.hourOfDay();
        java.util.Locale locale53 = new java.util.Locale("fr");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket54 = new org.joda.time.format.DateTimeParserBucket((long) (short) 1, chronology49, locale53);
        org.joda.time.ReadablePeriod readablePeriod55 = null;
        long long58 = chronology49.add(readablePeriod55, (long) (byte) 100, 100);
        org.joda.time.DurationField durationField59 = chronology49.eras();
        org.joda.time.DateTimeField dateTimeField60 = chronology49.weekyear();
        dateTimeParserBucket38.saveField(dateTimeField60, 3600000);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField26 and durationField59", Math.signum(durationField26.compareTo(durationField59)) == -Math.signum(durationField59.compareTo(durationField26)));
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology4 = null;
        java.util.Locale locale6 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology4, locale6);
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withChronology(chronology8);
        boolean boolean10 = dateTimeFormatter9.isPrinter();
        org.joda.time.Chronology chronology11 = dateTimeFormatter9.getChronolgy();
        org.joda.time.DurationField durationField12 = chronology11.hours();
        org.joda.time.DateTimeField dateTimeField13 = chronology11.monthOfYear();
        org.joda.time.DateTimeField dateTimeField14 = chronology11.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField15 = chronology11.weekyearOfCentury();
        org.joda.time.DurationField durationField16 = chronology11.weekyears();
        org.joda.time.Chronology chronology17 = chronology11.withUTC();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.weekyear();
        org.joda.time.DurationField durationField19 = chronology17.millis();
        org.joda.time.DurationField durationField20 = chronology17.years();
        org.joda.time.DateTimeZone dateTimeZone21 = chronology17.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField16 and durationField20", (durationField16.compareTo(durationField20) == 0) == durationField16.equals(durationField20));
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale4 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology2, locale4);
        org.joda.time.Chronology chronology6 = dateTimeParserBucket5.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField9 = chronology6.year();
        org.joda.time.Chronology chronology11 = null;
        java.util.Locale locale13 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket14 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology11, locale13);
        org.joda.time.Chronology chronology15 = dateTimeParserBucket14.getChronology();
        java.util.Locale locale16 = dateTimeParserBucket14.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket18 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology6, locale16, (java.lang.Integer) 1);
        org.joda.time.DateTimeField dateTimeField19 = chronology6.millisOfSecond();
        org.joda.time.DurationField durationField20 = chronology6.months();
        org.joda.time.DurationField durationField21 = chronology6.weekyears();
        org.joda.time.DurationField durationField22 = chronology6.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField22, durationField20, and durationField21", !(durationField22.compareTo(durationField20) == 0) || (Math.signum(durationField22.compareTo(durationField21)) == Math.signum(durationField20.compareTo(durationField21))));
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale3);
        org.joda.time.Chronology chronology5 = dateTimeParserBucket4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = chronology5.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField9 = chronology5.year();
        org.joda.time.DurationField durationField10 = chronology5.weeks();
        org.joda.time.DurationField durationField11 = chronology5.weekyears();
        org.joda.time.DurationField durationField12 = chronology5.weeks();
        java.lang.String str13 = chronology5.toString();
        org.joda.time.DurationField durationField14 = chronology5.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField14, durationField10, and durationField11", !(durationField14.compareTo(durationField10) == 0) || (Math.signum(durationField14.compareTo(durationField11)) == Math.signum(durationField10.compareTo(durationField11))));
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale3);
        org.joda.time.Chronology chronology5 = dateTimeParserBucket4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = chronology5.yearOfEra();
        org.joda.time.DurationField durationField8 = chronology5.days();
        org.joda.time.DurationField durationField9 = chronology5.years();
        org.joda.time.DateTimeField dateTimeField10 = chronology5.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.Chronology chronology13 = chronology5.withZone(dateTimeZone12);
        org.joda.time.DateTimeField dateTimeField14 = chronology5.millisOfSecond();
        org.joda.time.Chronology chronology16 = null;
        java.util.Locale locale18 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket19 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology16, locale18);
        org.joda.time.DateTimeField dateTimeField20 = null;
        dateTimeParserBucket19.saveField(dateTimeField20, (int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone23 = dateTimeParserBucket19.getZone();
        boolean boolean25 = dateTimeZone23.isStandardOffset(120L);
        int int27 = dateTimeZone23.getOffset((-1L));
        org.joda.time.Chronology chronology28 = chronology5.withZone(dateTimeZone23);
        org.joda.time.DurationField durationField29 = chronology28.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField29, durationField8, and durationField9", !(durationField29.compareTo(durationField8) == 0) || (Math.signum(durationField29.compareTo(durationField9)) == Math.signum(durationField8.compareTo(durationField9))));
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale4 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology2, locale4);
        org.joda.time.Chronology chronology6 = dateTimeParserBucket5.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.dayOfYear();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.yearOfEra();
        org.joda.time.DurationField durationField9 = chronology6.days();
        java.lang.String str10 = chronology6.toString();
        java.util.Locale locale12 = java.util.Locale.forLanguageTag("hi!");
        java.util.Set<java.lang.String> strSet13 = locale12.getUnicodeLocaleKeys();
        java.lang.String str14 = locale12.getDisplayScript();
        java.lang.String str15 = locale12.getCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket((long) (short) 10, chronology6, locale12, (java.lang.Integer) 10);
        dateTimeParserBucket17.setOffset((java.lang.Integer) 97);
        int int20 = dateTimeParserBucket17.getOffset();
        org.joda.time.DateTimeField dateTimeField21 = null;
        dateTimeParserBucket17.saveField(dateTimeField21, 36);
        java.lang.Integer int24 = dateTimeParserBucket17.getOffsetInteger();
        org.joda.time.Chronology chronology26 = null;
        java.util.Locale locale28 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket29 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology26, locale28);
        org.joda.time.DateTimeField dateTimeField30 = null;
        dateTimeParserBucket29.saveField(dateTimeField30, (int) (byte) 0);
        java.util.Locale locale33 = dateTimeParserBucket29.getLocale();
        org.joda.time.DateTimeField dateTimeField34 = null;
        dateTimeParserBucket29.saveField(dateTimeField34, 0);
        dateTimeParserBucket29.setOffset((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone39 = dateTimeParserBucket29.getZone();
        dateTimeParserBucket17.setZone(dateTimeZone39);
        org.joda.time.Chronology chronology42 = null;
        java.util.Locale locale44 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket45 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology42, locale44);
        org.joda.time.Chronology chronology46 = dateTimeParserBucket45.getChronology();
        org.joda.time.DateTimeField dateTimeField47 = chronology46.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField48 = chronology46.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField49 = chronology46.year();
        org.joda.time.DateTimeField dateTimeField50 = chronology46.year();
        org.joda.time.DurationField durationField51 = chronology46.eras();
        long long57 = chronology46.getDateTimeMillis((long) (short) 100, 0, (int) (short) 1, 0, 3);
        org.joda.time.DateTimeField dateTimeField58 = chronology46.weekyear();
        dateTimeParserBucket17.saveField(dateTimeField58, 89);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField9 and durationField51", Math.signum(durationField9.compareTo(durationField51)) == -Math.signum(durationField51.compareTo(durationField9)));
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology4 = null;
        java.util.Locale locale6 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology4, locale6);
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withChronology(chronology8);
        boolean boolean10 = dateTimeFormatter9.isPrinter();
        org.joda.time.Chronology chronology11 = dateTimeFormatter9.getChronolgy();
        org.joda.time.DurationField durationField12 = chronology11.hours();
        org.joda.time.DateTimeField dateTimeField13 = chronology11.monthOfYear();
        org.joda.time.DateTimeField dateTimeField14 = chronology11.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField15 = chronology11.weekyearOfCentury();
        org.joda.time.DurationField durationField16 = chronology11.weekyears();
        org.joda.time.Chronology chronology17 = chronology11.withUTC();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.weekyear();
        org.joda.time.DurationField durationField19 = chronology17.millis();
        org.joda.time.DurationField durationField20 = chronology17.years();
        org.joda.time.DurationField durationField21 = chronology17.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField21 and durationField20", (durationField21.compareTo(durationField20) == 0) == durationField21.equals(durationField20));
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale3);
        org.joda.time.Chronology chronology5 = dateTimeParserBucket4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = chronology5.yearOfEra();
        org.joda.time.DurationField durationField8 = chronology5.days();
        org.joda.time.DateTimeField dateTimeField9 = chronology5.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField10 = chronology5.clockhourOfHalfday();
        org.joda.time.DurationField durationField11 = chronology5.eras();
        org.joda.time.DateTimeField dateTimeField12 = chronology5.weekOfWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField8 and durationField11", Math.signum(durationField8.compareTo(durationField11)) == -Math.signum(durationField11.compareTo(durationField8)));
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale3);
        org.joda.time.Chronology chronology5 = dateTimeParserBucket4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = chronology5.yearOfEra();
        org.joda.time.DurationField durationField8 = chronology5.days();
        org.joda.time.DateTimeField dateTimeField9 = chronology5.weekyearOfCentury();
        long long13 = chronology5.add(342000052L, (long) (-360060001), (-36));
        org.joda.time.DurationField durationField14 = chronology5.hours();
        org.joda.time.DurationField durationField15 = chronology5.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField15, durationField8, and durationField14", !(durationField15.compareTo(durationField8) == 0) || (Math.signum(durationField15.compareTo(durationField14)) == Math.signum(durationField8.compareTo(durationField14))));
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale3);
        org.joda.time.Chronology chronology5 = dateTimeParserBucket4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = chronology5.yearOfEra();
        org.joda.time.DurationField durationField8 = chronology5.days();
        org.joda.time.DurationField durationField9 = chronology5.years();
        org.joda.time.DateTimeField dateTimeField10 = chronology5.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.Chronology chronology13 = chronology5.withZone(dateTimeZone12);
        org.joda.time.Chronology chronology15 = null;
        java.util.Locale locale17 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket18 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology15, locale17);
        org.joda.time.Chronology chronology19 = dateTimeParserBucket18.getChronology();
        org.joda.time.DateTimeField dateTimeField20 = chronology19.hourOfDay();
        org.joda.time.DateTimeField dateTimeField21 = chronology19.secondOfDay();
        org.joda.time.DurationField durationField22 = chronology19.weekyears();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 0);
        int int26 = dateTimeZone24.getOffset((long) 'u');
        long long29 = dateTimeZone24.adjustOffset((-82164000L), false);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder30 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder32 = dateTimeFormatterBuilder30.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder33 = dateTimeFormatterBuilder32.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder35 = dateTimeFormatterBuilder33.appendWeekOfWeekyear((int) 'a');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder38 = dateTimeFormatterBuilder35.appendCenturyOfEra((int) 'a', (int) (short) 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder41 = dateTimeFormatterBuilder35.appendYearOfCentury((int) (short) 100, (int) (short) 1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter42 = dateTimeFormatterBuilder41.toFormatter();
        org.joda.time.DateTimeZone dateTimeZone43 = dateTimeFormatter42.getZone();
        org.joda.time.DateTimeZone dateTimeZone44 = dateTimeFormatter42.getZone();
        org.joda.time.Chronology chronology45 = dateTimeFormatter42.getChronolgy();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder46 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder48 = dateTimeFormatterBuilder46.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder50 = dateTimeFormatterBuilder48.appendDayOfWeek(1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter51 = dateTimeFormatterBuilder50.toFormatter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter53 = dateTimeFormatter51.withPivotYear(1);
        org.joda.time.DateTimeZone dateTimeZone54 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str56 = dateTimeZone54.getName(97L);
        org.joda.time.Chronology chronology59 = null;
        java.util.Locale locale61 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket62 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology59, locale61);
        java.lang.String str63 = dateTimeZone54.getName((long) (byte) 10, locale61);
        java.lang.String str64 = locale61.getVariant();
        java.lang.String str65 = locale61.toLanguageTag();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter66 = dateTimeFormatter53.withLocale(locale61);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter67 = dateTimeFormatter53.withOffsetParsed();
        org.joda.time.format.DateTimePrinter dateTimePrinter68 = dateTimeFormatter53.getPrinter();
        org.joda.time.DateTime dateTime70 = dateTimeFormatter53.parseDateTime("525");
        java.lang.String str71 = dateTimeFormatter42.print((org.joda.time.ReadableInstant) dateTime70);
        int int72 = dateTimeZone24.getOffset((org.joda.time.ReadableInstant) dateTime70);
        org.joda.time.Chronology chronology73 = chronology19.withZone(dateTimeZone24);
        org.joda.time.Chronology chronology74 = chronology13.withZone(dateTimeZone24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField9 and durationField22", (durationField9.compareTo(durationField22) == 0) == durationField9.equals(durationField22));
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfWeek();
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.Chronology chronology5 = null;
        java.util.Locale locale7 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology5, locale7);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket8.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter3.withChronology(chronology9);
        org.joda.time.DateTimeField dateTimeField11 = chronology9.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField12 = dateTimeFieldType0.getField(chronology9);
        org.joda.time.DateTimeField dateTimeField13 = chronology9.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone15);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone15);
        org.joda.time.Chronology chronology18 = chronology9.withZone(dateTimeZone15);
        org.joda.time.DurationField durationField19 = chronology18.minutes();
        org.joda.time.DurationField durationField20 = chronology18.eras();
        org.joda.time.DurationField durationField21 = chronology18.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField19 and durationField20", Math.signum(durationField19.compareTo(durationField20)) == -Math.signum(durationField20.compareTo(durationField19)));
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale4 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology2, locale4);
        org.joda.time.Chronology chronology6 = dateTimeParserBucket5.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.dayOfYear();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField9 = chronology6.clockhourOfDay();
        org.joda.time.DurationField durationField10 = chronology6.hours();
        org.joda.time.DurationField durationField11 = chronology6.years();
        org.joda.time.DurationField durationField12 = chronology6.hours();
        org.joda.time.DateTimeField dateTimeField13 = chronology6.year();
        org.joda.time.DurationField durationField14 = chronology6.halfdays();
        org.joda.time.DateTimeField dateTimeField15 = chronology6.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField16 = chronology6.yearOfEra();
        org.joda.time.DateTimeField dateTimeField17 = chronology6.minuteOfDay();
        org.joda.time.Chronology chronology18 = chronology6.withUTC();
        org.joda.time.format.DateTimePrinter dateTimePrinter20 = null;
        org.joda.time.format.DateTimeParser dateTimeParser21 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter20, dateTimeParser21);
        boolean boolean23 = dateTimeFormatter22.isPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser24 = dateTimeFormatter22.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = dateTimeFormatter22.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone26 = dateTimeFormatter25.getZone();
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = org.joda.time.DateTimeFieldType.dayOfWeek();
        org.joda.time.format.DateTimePrinter dateTimePrinter28 = null;
        org.joda.time.format.DateTimeParser dateTimeParser29 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter28, dateTimeParser29);
        org.joda.time.Chronology chronology32 = null;
        java.util.Locale locale34 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket35 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology32, locale34);
        org.joda.time.Chronology chronology36 = dateTimeParserBucket35.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter37 = dateTimeFormatter30.withChronology(chronology36);
        org.joda.time.DateTimeField dateTimeField38 = chronology36.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField39 = dateTimeFieldType27.getField(chronology36);
        org.joda.time.DateTimeField dateTimeField40 = chronology36.secondOfMinute();
        org.joda.time.ReadablePeriod readablePeriod41 = null;
        long long44 = chronology36.add(readablePeriod41, (long) 1, (int) (short) 10);
        java.lang.String str45 = chronology36.toString();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter46 = dateTimeFormatter25.withChronology(chronology36);
        org.joda.time.DurationField durationField47 = chronology36.seconds();
        org.joda.time.Chronology chronology48 = chronology36.withUTC();
        java.util.Locale locale50 = new java.util.Locale("fr");
        java.util.Locale locale51 = java.util.Locale.FRENCH;
        java.lang.String str52 = locale51.toLanguageTag();
        java.lang.String str53 = locale50.getDisplayLanguage(locale51);
        java.util.Locale.setDefault(locale51);
        java.lang.String str55 = locale51.getVariant();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket56 = new org.joda.time.format.DateTimeParserBucket(439200100L, chronology36, locale51);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket57 = new org.joda.time.format.DateTimeParserBucket(852073200004L, chronology18, locale51);
        org.joda.time.Chronology chronology58 = dateTimeParserBucket57.getChronology();
        org.joda.time.DurationField durationField59 = chronology58.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField59, durationField10, and durationField11", !(durationField59.compareTo(durationField10) == 0) || (Math.signum(durationField59.compareTo(durationField11)) == Math.signum(durationField10.compareTo(durationField11))));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology4 = null;
        java.util.Locale locale6 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology4, locale6);
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withChronology(chronology8);
        boolean boolean10 = dateTimeFormatter9.isPrinter();
        org.joda.time.Chronology chronology11 = dateTimeFormatter9.getChronolgy();
        org.joda.time.DurationField durationField12 = chronology11.hours();
        org.joda.time.DateTimeField dateTimeField13 = chronology11.monthOfYear();
        org.joda.time.DurationField durationField14 = chronology11.minutes();
        org.joda.time.DateTimeField dateTimeField15 = chronology11.dayOfYear();
        org.joda.time.DurationField durationField16 = chronology11.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField16, durationField12, and durationField14", !(durationField16.compareTo(durationField12) == 0) || (Math.signum(durationField16.compareTo(durationField14)) == Math.signum(durationField12.compareTo(durationField14))));
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale3);
        org.joda.time.Chronology chronology5 = dateTimeParserBucket4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = chronology5.hourOfHalfday();
        org.joda.time.DurationField durationField8 = chronology5.hours();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 0);
        java.lang.String str12 = dateTimeZone10.getNameKey(1L);
        java.util.Locale locale14 = java.util.Locale.TAIWAN;
        java.lang.String str15 = dateTimeZone10.getName(100L, locale14);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone10);
        org.joda.time.Chronology chronology17 = chronology5.withZone(dateTimeZone10);
        org.joda.time.DurationField durationField18 = chronology5.halfdays();
        org.joda.time.DateTimeField dateTimeField19 = chronology5.millisOfSecond();
        org.joda.time.DurationField durationField20 = chronology5.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField20, durationField8, and durationField18", !(durationField20.compareTo(durationField8) == 0) || (Math.signum(durationField20.compareTo(durationField18)) == Math.signum(durationField8.compareTo(durationField18))));
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale3);
        org.joda.time.Chronology chronology5 = dateTimeParserBucket4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField7 = chronology5.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField8 = chronology5.year();
        org.joda.time.DateTimeField dateTimeField9 = chronology5.year();
        org.joda.time.DurationField durationField10 = chronology5.eras();
        org.joda.time.DurationField durationField11 = chronology5.eras();
        org.joda.time.DurationField durationField12 = chronology5.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField10, durationField12, and durationField10", !(durationField10.compareTo(durationField12) == 0) || (Math.signum(durationField10.compareTo(durationField10)) == Math.signum(durationField12.compareTo(durationField10))));
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale3);
        org.joda.time.Chronology chronology5 = dateTimeParserBucket4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = chronology5.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField9 = chronology5.year();
        org.joda.time.DurationField durationField10 = chronology5.weeks();
        org.joda.time.DurationField durationField11 = chronology5.weekyears();
        org.joda.time.DurationField durationField12 = chronology5.months();
        org.joda.time.DateTimeField dateTimeField13 = chronology5.clockhourOfHalfday();
        org.joda.time.DurationField durationField14 = chronology5.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField14, durationField10, and durationField11", !(durationField14.compareTo(durationField10) == 0) || (Math.signum(durationField14.compareTo(durationField11)) == Math.signum(durationField10.compareTo(durationField11))));
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.dayOfWeek();
        org.joda.time.format.DateTimePrinter dateTimePrinter2 = null;
        org.joda.time.format.DateTimeParser dateTimeParser3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter2, dateTimeParser3);
        org.joda.time.Chronology chronology6 = null;
        java.util.Locale locale8 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket9 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology6, locale8);
        org.joda.time.Chronology chronology10 = dateTimeParserBucket9.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter4.withChronology(chronology10);
        org.joda.time.DateTimeField dateTimeField12 = chronology10.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField13 = dateTimeFieldType1.getField(chronology10);
        org.joda.time.DateTimeField dateTimeField14 = chronology10.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField15 = chronology10.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField16 = chronology10.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField17 = chronology10.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField18 = chronology10.weekyear();
        org.joda.time.Chronology chronology21 = null;
        java.util.Locale locale23 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket24 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology21, locale23);
        org.joda.time.Chronology chronology25 = dateTimeParserBucket24.getChronology();
        org.joda.time.DateTimeField dateTimeField26 = chronology25.dayOfYear();
        org.joda.time.DateTimeField dateTimeField27 = chronology25.hourOfHalfday();
        org.joda.time.DurationField durationField28 = chronology25.hours();
        org.joda.time.DurationField durationField29 = chronology25.seconds();
        org.joda.time.DateTimeField dateTimeField30 = chronology25.era();
        org.joda.time.DateTimeField dateTimeField31 = chronology25.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField32 = chronology25.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone33 = chronology25.getZone();
        org.joda.time.DateTimeField dateTimeField34 = chronology25.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField35 = chronology25.minuteOfDay();
        java.util.Locale locale37 = new java.util.Locale("fr");
        java.util.Locale locale38 = java.util.Locale.FRENCH;
        java.lang.String str39 = locale38.toLanguageTag();
        java.lang.String str40 = locale37.getDisplayLanguage(locale38);
        java.lang.String str41 = locale37.getDisplayCountry();
        java.lang.String str42 = locale37.getDisplayVariant();
        java.util.Locale locale43 = locale37.stripExtensions();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket46 = new org.joda.time.format.DateTimeParserBucket((-121L), chronology25, locale43, (java.lang.Integer) 120, (int) '#');
        java.lang.String str47 = locale43.getDisplayScript();
        java.lang.String str48 = locale43.getDisplayScript();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket50 = new org.joda.time.format.DateTimeParserBucket((long) (-360060001), chronology10, locale43, (java.lang.Integer) 117);
        org.joda.time.DateTimeField dateTimeField51 = chronology10.millisOfSecond();
        org.joda.time.DurationField durationField52 = chronology10.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField52, durationField28, and durationField29", !(durationField52.compareTo(durationField28) == 0) || (Math.signum(durationField52.compareTo(durationField29)) == Math.signum(durationField28.compareTo(durationField29))));
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale3);
        org.joda.time.Chronology chronology5 = dateTimeParserBucket4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField7 = chronology5.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField8 = chronology5.year();
        org.joda.time.DurationField durationField9 = chronology5.halfdays();
        org.joda.time.DateTimeField dateTimeField10 = chronology5.hourOfHalfday();
        org.joda.time.DurationField durationField11 = chronology5.millis();
        org.joda.time.DateTimeField dateTimeField12 = chronology5.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField13 = chronology5.weekyearOfCentury();
        org.joda.time.DurationField durationField14 = chronology5.centuries();
        org.joda.time.DurationField durationField15 = chronology5.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField15, durationField9, and durationField11", !(durationField15.compareTo(durationField9) == 0) || (Math.signum(durationField15.compareTo(durationField11)) == Math.signum(durationField9.compareTo(durationField11))));
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfWeek();
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.Chronology chronology5 = null;
        java.util.Locale locale7 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology5, locale7);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket8.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter3.withChronology(chronology9);
        org.joda.time.DateTimeField dateTimeField11 = chronology9.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField12 = dateTimeFieldType0.getField(chronology9);
        org.joda.time.DateTimeField dateTimeField13 = chronology9.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField14 = chronology9.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField15 = chronology9.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField16 = chronology9.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField17 = chronology9.dayOfYear();
        org.joda.time.DurationField durationField18 = chronology9.eras();
        org.joda.time.DurationField durationField19 = chronology9.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField18, durationField19, and durationField18", !(durationField18.compareTo(durationField19) == 0) || (Math.signum(durationField18.compareTo(durationField18)) == Math.signum(durationField19.compareTo(durationField18))));
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale3);
        org.joda.time.DateTimeField dateTimeField5 = null;
        dateTimeParserBucket4.saveField(dateTimeField5, (int) (byte) 0);
        java.util.Locale locale8 = dateTimeParserBucket4.getLocale();
        java.lang.Object obj9 = dateTimeParserBucket4.saveState();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder10.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder12.appendTimeZoneId();
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder13.appendFixedDecimal(dateTimeFieldType14, (int) '4');
        dateTimeParserBucket4.saveField(dateTimeFieldType14, (int) (short) 1);
        java.lang.String str19 = dateTimeFieldType14.toString();
        org.joda.time.Chronology chronology21 = null;
        java.util.Locale locale23 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket24 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology21, locale23);
        org.joda.time.Chronology chronology25 = dateTimeParserBucket24.getChronology();
        org.joda.time.DateTimeField dateTimeField26 = chronology25.dayOfYear();
        org.joda.time.DateTimeField dateTimeField27 = chronology25.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField28 = chronology25.clockhourOfDay();
        org.joda.time.DurationField durationField29 = chronology25.weekyears();
        org.joda.time.DateTimeField dateTimeField30 = dateTimeFieldType14.getField(chronology25);
        org.joda.time.DurationField durationField31 = chronology25.years();
        org.joda.time.DurationField durationField32 = chronology25.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField29 and durationField31", (durationField29.compareTo(durationField31) == 0) == durationField29.equals(durationField31));
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale3);
        org.joda.time.Chronology chronology5 = dateTimeParserBucket4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = chronology5.yearOfEra();
        org.joda.time.DurationField durationField8 = chronology5.days();
        java.lang.String str9 = chronology5.toString();
        org.joda.time.DurationField durationField10 = chronology5.weeks();
        org.joda.time.DurationField durationField11 = chronology5.years();
        org.joda.time.DateTimeField dateTimeField12 = chronology5.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField13 = chronology5.dayOfMonth();
        org.joda.time.DurationField durationField14 = chronology5.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField14, durationField8, and durationField10", !(durationField14.compareTo(durationField8) == 0) || (Math.signum(durationField14.compareTo(durationField10)) == Math.signum(durationField8.compareTo(durationField10))));
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder2.appendTimeZoneId();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder3.appendTwoDigitYear((int) (short) -1, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder6.appendDayOfYear(187200000);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap9 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder6.appendTimeZoneShortName(strMap9);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder6.appendYear((int) (byte) 100, 36);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder14.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder16.appendTimeZoneId();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder20 = dateTimeFormatterBuilder17.appendFixedDecimal(dateTimeFieldType18, (int) '4');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder22 = dateTimeFormatterBuilder17.appendTwoDigitWeekyear(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder25 = dateTimeFormatterBuilder22.appendFixedDecimal(dateTimeFieldType23, (int) (short) 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder26 = dateTimeFormatterBuilder13.appendText(dateTimeFieldType23);
        org.joda.time.Chronology chronology28 = null;
        java.util.Locale locale30 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket31 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology28, locale30);
        org.joda.time.Chronology chronology32 = dateTimeParserBucket31.getChronology();
        org.joda.time.DateTimeField dateTimeField33 = chronology32.dayOfYear();
        org.joda.time.DateTimeField dateTimeField34 = chronology32.yearOfEra();
        org.joda.time.DurationField durationField35 = chronology32.hours();
        org.joda.time.DateTimeField dateTimeField36 = chronology32.secondOfMinute();
        org.joda.time.Chronology chronology37 = chronology32.withUTC();
        org.joda.time.DurationField durationField38 = chronology37.weeks();
        org.joda.time.DateTimeField dateTimeField39 = chronology37.minuteOfHour();
        boolean boolean40 = dateTimeFieldType23.isSupported(chronology37);
        org.joda.time.DateTimeField dateTimeField41 = chronology37.clockhourOfHalfday();
        org.joda.time.DurationField durationField42 = chronology37.minutes();
        org.joda.time.DateTimeField dateTimeField43 = chronology37.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField44 = chronology37.hourOfDay();
        org.joda.time.DateTimeField dateTimeField45 = chronology37.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        boolean boolean49 = dateTimeZone47.isStandardOffset(0L);
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 0);
        java.lang.String str53 = dateTimeZone51.getNameKey(1L);
        org.joda.time.DateTimeZone dateTimeZone55 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 0);
        java.lang.String str57 = dateTimeZone55.getNameKey(1L);
        org.joda.time.LocalDateTime localDateTime58 = null;
        boolean boolean59 = dateTimeZone55.isLocalDateTimeGap(localDateTime58);
        long long61 = dateTimeZone51.getMillisKeepLocal(dateTimeZone55, (long) (byte) 100);
        long long63 = dateTimeZone47.getMillisKeepLocal(dateTimeZone55, 120L);
        int int65 = dateTimeZone55.getStandardOffset((long) (-6));
        org.joda.time.Chronology chronology66 = chronology37.withZone(dateTimeZone55);
        org.joda.time.DurationField durationField67 = chronology66.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField67, durationField35, and durationField38", !(durationField67.compareTo(durationField35) == 0) || (Math.signum(durationField67.compareTo(durationField38)) == Math.signum(durationField35.compareTo(durationField38))));
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfWeek();
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.Chronology chronology5 = null;
        java.util.Locale locale7 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology5, locale7);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket8.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter3.withChronology(chronology9);
        org.joda.time.DateTimeField dateTimeField11 = chronology9.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField12 = dateTimeFieldType0.getField(chronology9);
        org.joda.time.DateTimeField dateTimeField13 = chronology9.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone15);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone15);
        org.joda.time.Chronology chronology18 = chronology9.withZone(dateTimeZone15);
        org.joda.time.DurationField durationField19 = chronology9.millis();
        org.joda.time.DurationField durationField20 = chronology9.eras();
        org.joda.time.DurationField durationField21 = chronology9.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField21 and durationField20", Math.signum(durationField21.compareTo(durationField20)) == -Math.signum(durationField20.compareTo(durationField21)));
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale3);
        org.joda.time.Chronology chronology5 = dateTimeParserBucket4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = chronology5.clockhourOfDay();
        org.joda.time.DurationField durationField9 = chronology5.hours();
        org.joda.time.DurationField durationField10 = chronology5.years();
        org.joda.time.DurationField durationField11 = chronology5.hours();
        org.joda.time.DateTimeField dateTimeField12 = chronology5.year();
        org.joda.time.DurationField durationField13 = chronology5.halfdays();
        long long17 = chronology5.add(0L, (long) '4', (int) (byte) 10);
        org.joda.time.DateTimeField dateTimeField18 = chronology5.weekOfWeekyear();
        org.joda.time.DurationField durationField19 = chronology5.hours();
        long long23 = chronology5.add((long) (short) 1, (-378060001L), (int) 'u');
        org.joda.time.DurationField durationField24 = chronology5.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField24, durationField9, and durationField10", !(durationField24.compareTo(durationField9) == 0) || (Math.signum(durationField24.compareTo(durationField10)) == Math.signum(durationField9.compareTo(durationField10))));
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder2.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder3.appendWeekOfWeekyear((int) 'a');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder5.appendCenturyOfEra((int) 'a', (int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder8.appendDecimal(dateTimeFieldType9, (int) (short) 1, (-1));
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder8.appendTwoDigitYear(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder8.appendFraction(dateTimeFieldType15, 36, 2000);
        org.joda.time.Chronology chronology21 = null;
        java.util.Locale locale23 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket24 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology21, locale23);
        org.joda.time.Chronology chronology25 = dateTimeParserBucket24.getChronology();
        org.joda.time.DateTimeField dateTimeField26 = chronology25.dayOfYear();
        org.joda.time.DateTimeField dateTimeField27 = chronology25.hourOfHalfday();
        org.joda.time.DurationField durationField28 = chronology25.hours();
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 0);
        java.lang.String str32 = dateTimeZone30.getNameKey(1L);
        java.util.Locale locale34 = java.util.Locale.TAIWAN;
        java.lang.String str35 = dateTimeZone30.getName(100L, locale34);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone30);
        org.joda.time.Chronology chronology37 = chronology25.withZone(dateTimeZone30);
        org.joda.time.DateTimeField dateTimeField38 = chronology37.hourOfDay();
        org.joda.time.DurationField durationField39 = chronology37.years();
        java.util.Locale locale40 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket42 = new org.joda.time.format.DateTimeParserBucket(120L, chronology37, locale40, (java.lang.Integer) 25);
        org.joda.time.DurationField durationField43 = chronology37.weeks();
        org.joda.time.DateTimeField dateTimeField44 = dateTimeFieldType15.getField(chronology37);
        org.joda.time.Chronology chronology47 = null;
        java.util.Locale locale49 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket50 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology47, locale49);
        org.joda.time.Chronology chronology51 = dateTimeParserBucket50.getChronology();
        org.joda.time.DateTimeField dateTimeField52 = chronology51.dayOfYear();
        org.joda.time.DateTimeField dateTimeField53 = chronology51.yearOfEra();
        org.joda.time.DurationField durationField54 = chronology51.hours();
        org.joda.time.DateTimeField dateTimeField55 = chronology51.secondOfMinute();
        java.lang.String str56 = chronology51.toString();
        java.util.Locale locale58 = new java.util.Locale("fr");
        java.util.Locale locale59 = java.util.Locale.FRENCH;
        java.lang.String str60 = locale59.toLanguageTag();
        java.lang.String str61 = locale58.getDisplayLanguage(locale59);
        java.util.Locale locale62 = java.util.Locale.UK;
        java.lang.String str63 = locale62.getDisplayVariant();
        java.lang.String str64 = locale58.getDisplayScript(locale62);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket65 = new org.joda.time.format.DateTimeParserBucket((long) 100, chronology51, locale58);
        org.joda.time.DateTimeField dateTimeField66 = chronology51.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField67 = chronology51.monthOfYear();
        org.joda.time.DateTimeField dateTimeField68 = chronology51.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField69 = chronology51.dayOfWeek();
        org.joda.time.DurationField durationField70 = chronology51.weekyears();
        boolean boolean71 = dateTimeFieldType15.isSupported(chronology51);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField39 and durationField70", (durationField39.compareTo(durationField70) == 0) == durationField39.equals(durationField70));
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale3);
        org.joda.time.Chronology chronology5 = dateTimeParserBucket4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = chronology5.hourOfHalfday();
        org.joda.time.DurationField durationField8 = chronology5.hours();
        org.joda.time.DurationField durationField9 = chronology5.seconds();
        org.joda.time.DateTimeField dateTimeField10 = chronology5.era();
        org.joda.time.DateTimeField dateTimeField11 = chronology5.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField12 = chronology5.dayOfWeek();
        org.joda.time.Chronology chronology13 = chronology5.withUTC();
        org.joda.time.DurationField durationField14 = chronology13.weekyears();
        org.joda.time.DateTimeField dateTimeField15 = chronology13.dayOfWeek();
        org.joda.time.DurationField durationField16 = chronology13.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField16, durationField8, and durationField9", !(durationField16.compareTo(durationField8) == 0) || (Math.signum(durationField16.compareTo(durationField9)) == Math.signum(durationField8.compareTo(durationField9))));
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale4 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology2, locale4);
        org.joda.time.Chronology chronology6 = dateTimeParserBucket5.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.dayOfYear();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.yearOfEra();
        org.joda.time.DurationField durationField9 = chronology6.hours();
        org.joda.time.DateTimeField dateTimeField10 = chronology6.secondOfMinute();
        org.joda.time.Chronology chronology11 = chronology6.withUTC();
        org.joda.time.DateTimeField dateTimeField12 = chronology11.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField13 = chronology11.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField14 = chronology11.monthOfYear();
        org.joda.time.DateTimeField dateTimeField15 = chronology11.secondOfMinute();
        org.joda.time.DurationField durationField16 = chronology11.eras();
        java.util.Locale.Category category17 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale18 = java.util.Locale.getDefault(category17);
        java.util.Locale locale19 = java.util.Locale.getDefault(category17);
        org.joda.time.Chronology chronology22 = null;
        java.util.Locale locale24 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket25 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology22, locale24);
        org.joda.time.Chronology chronology26 = dateTimeParserBucket25.getChronology();
        org.joda.time.DateTimeField dateTimeField27 = chronology26.dayOfYear();
        org.joda.time.DateTimeField dateTimeField28 = chronology26.yearOfEra();
        org.joda.time.DurationField durationField29 = chronology26.hours();
        org.joda.time.Chronology chronology30 = chronology26.withUTC();
        org.joda.time.DateTimeField dateTimeField31 = chronology26.dayOfWeek();
        java.util.Locale locale32 = java.util.Locale.FRENCH;
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str35 = dateTimeZone33.getName(97L);
        org.joda.time.Chronology chronology38 = null;
        java.util.Locale locale40 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket41 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology38, locale40);
        java.lang.String str42 = dateTimeZone33.getName((long) (byte) 10, locale40);
        java.lang.String str43 = locale32.getDisplayLanguage(locale40);
        java.lang.String str44 = locale32.getDisplayCountry();
        java.lang.String str45 = locale32.toLanguageTag();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket47 = new org.joda.time.format.DateTimeParserBucket((long) (-2), chronology26, locale32, (java.lang.Integer) 36000000);
        java.util.Locale.setDefault(locale32);
        java.lang.String str49 = locale32.getCountry();
        java.util.Locale.setDefault(category17, locale32);
        java.lang.String str51 = locale32.getDisplayScript();
        java.lang.String str52 = locale32.toLanguageTag();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket53 = new org.joda.time.format.DateTimeParserBucket(3600003L, chronology11, locale32);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField9 and durationField16", Math.signum(durationField9.compareTo(durationField16)) == -Math.signum(durationField16.compareTo(durationField9)));
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale3);
        org.joda.time.Chronology chronology5 = dateTimeParserBucket4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = chronology5.clockhourOfDay();
        org.joda.time.DurationField durationField9 = chronology5.hours();
        org.joda.time.DurationField durationField10 = chronology5.years();
        org.joda.time.DurationField durationField11 = chronology5.hours();
        org.joda.time.DateTimeField dateTimeField12 = chronology5.year();
        org.joda.time.DurationField durationField13 = chronology5.halfdays();
        long long17 = chronology5.add(0L, (long) '4', (int) (byte) 10);
        org.joda.time.DateTimeField dateTimeField18 = chronology5.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField19 = chronology5.dayOfMonth();
        org.joda.time.DurationField durationField20 = chronology5.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField20, durationField9, and durationField10", !(durationField20.compareTo(durationField9) == 0) || (Math.signum(durationField20.compareTo(durationField10)) == Math.signum(durationField9.compareTo(durationField10))));
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale3);
        org.joda.time.Chronology chronology5 = dateTimeParserBucket4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = chronology5.yearOfEra();
        org.joda.time.DurationField durationField8 = chronology5.hours();
        org.joda.time.Chronology chronology9 = chronology5.withUTC();
        org.joda.time.DurationField durationField10 = chronology5.seconds();
        org.joda.time.DateTimeField dateTimeField11 = chronology5.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str14 = dateTimeZone12.getName(97L);
        org.joda.time.Chronology chronology17 = null;
        java.util.Locale locale19 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket20 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology17, locale19);
        java.lang.String str21 = dateTimeZone12.getName((long) (byte) 10, locale19);
        long long25 = dateTimeZone12.convertLocalToUTC((long) 0, true, (long) 10);
        int int27 = dateTimeZone12.getOffset((long) 'u');
        org.joda.time.Chronology chronology28 = chronology5.withZone(dateTimeZone12);
        java.lang.String str29 = chronology5.toString();
        org.joda.time.DateTimeField dateTimeField30 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField31 = chronology5.weekyear();
        org.joda.time.DateTimeField dateTimeField32 = chronology5.hourOfHalfday();
        org.joda.time.DurationField durationField33 = chronology5.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField33, durationField8, and durationField10", !(durationField33.compareTo(durationField8) == 0) || (Math.signum(durationField33.compareTo(durationField10)) == Math.signum(durationField8.compareTo(durationField10))));
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withDefaultYear(0);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str7 = dateTimeZone5.getName(97L);
        org.joda.time.Chronology chronology10 = null;
        java.util.Locale locale12 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology10, locale12);
        java.lang.String str14 = dateTimeZone5.getName((long) (byte) 10, locale12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter2.withLocale(locale12);
        org.joda.time.format.DateTimePrinter dateTimePrinter16 = null;
        org.joda.time.format.DateTimeParser dateTimeParser17 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter16, dateTimeParser17);
        org.joda.time.Chronology chronology20 = null;
        java.util.Locale locale22 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket23 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology20, locale22);
        org.joda.time.Chronology chronology24 = dateTimeParserBucket23.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = dateTimeFormatter18.withChronology(chronology24);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = dateTimeFormatter15.withChronology(chronology24);
        org.joda.time.Chronology chronology28 = null;
        java.util.Locale locale30 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket31 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology28, locale30);
        org.joda.time.Chronology chronology32 = dateTimeParserBucket31.getChronology();
        org.joda.time.DateTimeField dateTimeField33 = chronology32.dayOfYear();
        org.joda.time.DateTimeField dateTimeField34 = chronology32.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField35 = chronology32.clockhourOfDay();
        org.joda.time.DurationField durationField36 = chronology32.hours();
        org.joda.time.DurationField durationField37 = chronology32.years();
        org.joda.time.DurationField durationField38 = chronology32.hours();
        org.joda.time.DateTimeField dateTimeField39 = chronology32.year();
        org.joda.time.DurationField durationField40 = chronology32.halfdays();
        long long44 = chronology32.add(0L, (long) '4', (int) (byte) 10);
        org.joda.time.DateTimeField dateTimeField45 = chronology32.weekOfWeekyear();
        org.joda.time.DurationField durationField46 = chronology32.hours();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter47 = dateTimeFormatter26.withChronology(chronology32);
        org.joda.time.Chronology chronology49 = null;
        java.util.Locale locale51 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket52 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology49, locale51);
        org.joda.time.Chronology chronology53 = dateTimeParserBucket52.getChronology();
        org.joda.time.DateTimeField dateTimeField54 = chronology53.dayOfYear();
        org.joda.time.DateTimeField dateTimeField55 = chronology53.hourOfHalfday();
        org.joda.time.DurationField durationField56 = chronology53.hours();
        org.joda.time.DurationField durationField57 = chronology53.seconds();
        org.joda.time.DateTimeField dateTimeField58 = chronology53.era();
        org.joda.time.DateTimeField dateTimeField59 = chronology53.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField60 = chronology53.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone61 = chronology53.getZone();
        org.joda.time.DateTimeField dateTimeField62 = chronology53.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField63 = chronology53.yearOfEra();
        org.joda.time.DateTimeField dateTimeField64 = chronology53.era();
        org.joda.time.DateTimeField dateTimeField65 = chronology53.hourOfDay();
        org.joda.time.DateTimeField dateTimeField66 = chronology53.weekOfWeekyear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter67 = dateTimeFormatter26.withChronology(chronology53);
        org.joda.time.DurationField durationField68 = chronology53.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField68, durationField36, and durationField37", !(durationField68.compareTo(durationField36) == 0) || (Math.signum(durationField68.compareTo(durationField37)) == Math.signum(durationField36.compareTo(durationField37))));
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder2.appendTimeZoneId();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder3.appendFixedDecimal(dateTimeFieldType4, (int) '4');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder3.appendTwoDigitWeekyear(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder8.appendFixedDecimal(dateTimeFieldType9, (int) (short) 100);
        org.joda.time.Chronology chronology13 = null;
        java.util.Locale locale15 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology13, locale15);
        org.joda.time.Chronology chronology17 = dateTimeParserBucket16.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.dayOfYear();
        org.joda.time.DateTimeField dateTimeField19 = chronology17.yearOfEra();
        org.joda.time.DurationField durationField20 = chronology17.hours();
        org.joda.time.Chronology chronology21 = chronology17.withUTC();
        org.joda.time.DateTimeField dateTimeField22 = chronology17.dayOfWeek();
        org.joda.time.DurationField durationField23 = chronology17.seconds();
        boolean boolean24 = dateTimeFieldType9.isSupported(chronology17);
        org.joda.time.DateTimeField dateTimeField25 = chronology17.year();
        org.joda.time.DateTimeField dateTimeField26 = chronology17.weekyear();
        org.joda.time.DurationField durationField27 = chronology17.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField27, durationField20, and durationField23", !(durationField27.compareTo(durationField20) == 0) || (Math.signum(durationField27.compareTo(durationField23)) == Math.signum(durationField20.compareTo(durationField23))));
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser4 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimePrinter dateTimePrinter5 = dateTimeFormatter2.getPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withDefaultYear((int) (byte) -1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter7.withOffsetParsed();
        org.joda.time.format.DateTimePrinter dateTimePrinter9 = dateTimeFormatter7.getPrinter();
        boolean boolean10 = dateTimeFormatter7.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter7.withOffsetParsed();
        boolean boolean12 = dateTimeFormatter7.isParser();
        org.joda.time.format.DateTimePrinter dateTimePrinter13 = null;
        org.joda.time.format.DateTimeParser dateTimeParser14 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter13, dateTimeParser14);
        org.joda.time.Chronology chronology17 = null;
        java.util.Locale locale19 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket20 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology17, locale19);
        org.joda.time.Chronology chronology21 = dateTimeParserBucket20.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = dateTimeFormatter15.withChronology(chronology21);
        boolean boolean23 = dateTimeFormatter22.isPrinter();
        int int24 = dateTimeFormatter22.getDefaultYear();
        boolean boolean25 = dateTimeFormatter22.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = dateTimeFormatter22.withDefaultYear(10800000);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder28 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder30 = dateTimeFormatterBuilder28.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder31 = dateTimeFormatterBuilder30.appendTimeZoneId();
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder34 = dateTimeFormatterBuilder31.appendFixedDecimal(dateTimeFieldType32, (int) '4');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder36 = dateTimeFormatterBuilder31.appendTwoDigitWeekyear(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder39 = dateTimeFormatterBuilder36.appendFixedDecimal(dateTimeFieldType37, (int) (short) 100);
        java.lang.String str40 = dateTimeFieldType37.getName();
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        java.lang.String str42 = dateTimeFieldType41.toString();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder43 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder44 = dateTimeFormatterBuilder43.appendDayOfWeekShortText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder46 = dateTimeFormatterBuilder44.appendMinuteOfDay((int) '4');
        org.joda.time.DateTimeFieldType dateTimeFieldType47 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder48 = dateTimeFormatterBuilder46.appendShortText(dateTimeFieldType47);
        org.joda.time.format.DateTimePrinter dateTimePrinter49 = null;
        org.joda.time.format.DateTimeParser dateTimeParser50 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter51 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter49, dateTimeParser50);
        boolean boolean52 = dateTimeFormatter51.isPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser53 = dateTimeFormatter51.getParser();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder54 = dateTimeFormatterBuilder46.append(dateTimeFormatter51);
        boolean boolean55 = dateTimeFormatter51.isPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser56 = dateTimeFormatter51.getParser();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder57 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder58 = dateTimeFormatterBuilder57.appendDayOfWeekShortText();
        org.joda.time.DateTimeFieldType dateTimeFieldType59 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder62 = dateTimeFormatterBuilder57.appendDecimal(dateTimeFieldType59, (int) (short) 100, 0);
        org.joda.time.Chronology chronology64 = null;
        java.util.Locale locale66 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket67 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology64, locale66);
        org.joda.time.Chronology chronology68 = dateTimeParserBucket67.getChronology();
        org.joda.time.DateTimeField dateTimeField69 = chronology68.dayOfYear();
        org.joda.time.DateTimeField dateTimeField70 = chronology68.hourOfHalfday();
        org.joda.time.DurationField durationField71 = chronology68.hours();
        org.joda.time.DateTimeField dateTimeField72 = dateTimeFieldType59.getField(chronology68);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter73 = dateTimeFormatter51.withChronology(chronology68);
        org.joda.time.DateTimeField dateTimeField74 = dateTimeFieldType41.getField(chronology68);
        boolean boolean75 = dateTimeFieldType37.isSupported(chronology68);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter76 = dateTimeFormatter22.withChronology(chronology68);
        org.joda.time.DurationField durationField77 = chronology68.eras();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter78 = dateTimeFormatter7.withChronology(chronology68);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField71 and durationField77", Math.signum(durationField71.compareTo(durationField77)) == -Math.signum(durationField77.compareTo(durationField71)));
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder2.appendTimeZoneId();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder3.appendFixedDecimal(dateTimeFieldType4, (int) '4');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder3.appendTwoDigitWeekyear(0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder9.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder11.appendTimeZoneId();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder12.appendFixedDecimal(dateTimeFieldType13, (int) '4');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder16.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder19 = dateTimeFormatterBuilder18.appendHalfdayOfDayText();
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology21 = null;
        boolean boolean22 = dateTimeFieldType20.isSupported(chronology21);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder23 = dateTimeFormatterBuilder18.appendText(dateTimeFieldType20);
        java.lang.String str24 = dateTimeFieldType20.toString();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder25 = dateTimeFormatterBuilder12.appendText(dateTimeFieldType20);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder28 = dateTimeFormatterBuilder8.appendSignedDecimal(dateTimeFieldType20, 187200000, (int) (short) -1);
        org.joda.time.Chronology chronology30 = null;
        java.util.Locale locale32 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket33 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology30, locale32);
        org.joda.time.DateTimeField dateTimeField34 = null;
        dateTimeParserBucket33.saveField(dateTimeField34, (int) (byte) 0);
        java.util.Locale locale37 = dateTimeParserBucket33.getLocale();
        org.joda.time.DateTimeField dateTimeField38 = null;
        dateTimeParserBucket33.saveField(dateTimeField38, 0);
        dateTimeParserBucket33.setOffset(0);
        org.joda.time.Chronology chronology43 = dateTimeParserBucket33.getChronology();
        org.joda.time.DateTimeField dateTimeField44 = chronology43.monthOfYear();
        boolean boolean45 = dateTimeFieldType20.isSupported(chronology43);
        org.joda.time.DurationField durationField46 = chronology43.eras();
        org.joda.time.DurationField durationField47 = chronology43.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField46, durationField47, and durationField46", !(durationField46.compareTo(durationField47) == 0) || (Math.signum(durationField46.compareTo(durationField46)) == Math.signum(durationField47.compareTo(durationField46))));
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale3);
        org.joda.time.Chronology chronology5 = dateTimeParserBucket4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = chronology5.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField9 = chronology5.year();
        org.joda.time.DurationField durationField10 = chronology5.weeks();
        org.joda.time.DateTimeField dateTimeField11 = chronology5.secondOfMinute();
        org.joda.time.DurationField durationField12 = chronology5.weekyears();
        org.joda.time.DurationField durationField13 = chronology5.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField13, durationField10, and durationField12", !(durationField13.compareTo(durationField10) == 0) || (Math.signum(durationField13.compareTo(durationField12)) == Math.signum(durationField10.compareTo(durationField12))));
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale5 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology3, locale5);
        org.joda.time.Chronology chronology7 = dateTimeParserBucket6.getChronology();
        java.util.Locale locale8 = dateTimeParserBucket6.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology1, locale8, (java.lang.Integer) 0, (int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        dateTimeParserBucket11.saveField(dateTimeFieldType12, (int) (short) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder15.appendDayOfWeekShortText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder15.appendMinuteOfHour((int) (byte) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder20 = dateTimeFormatterBuilder18.appendMinuteOfDay((int) 'x');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder22 = dateTimeFormatterBuilder20.appendMinuteOfDay(25);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = dateTimeFormatterBuilder22.toFormatter();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = dateTimeFormatter23.withZone(dateTimeZone25);
        org.joda.time.Chronology chronology28 = null;
        java.util.Locale locale30 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket31 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology28, locale30);
        org.joda.time.Chronology chronology32 = dateTimeParserBucket31.getChronology();
        org.joda.time.DateTimeField dateTimeField33 = chronology32.dayOfYear();
        org.joda.time.DateTimeField dateTimeField34 = chronology32.hourOfHalfday();
        org.joda.time.DurationField durationField35 = chronology32.hours();
        org.joda.time.DurationField durationField36 = chronology32.seconds();
        org.joda.time.DateTimeField dateTimeField37 = chronology32.era();
        org.joda.time.DateTimeField dateTimeField38 = chronology32.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField39 = chronology32.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField40 = chronology32.millisOfSecond();
        org.joda.time.ReadablePeriod readablePeriod41 = null;
        long long44 = chronology32.add(readablePeriod41, 2000L, (int) (byte) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter45 = dateTimeFormatter26.withChronology(chronology32);
        org.joda.time.DateTimeField dateTimeField46 = dateTimeFieldType12.getField(chronology32);
        org.joda.time.Chronology chronology47 = chronology32.withUTC();
        org.joda.time.DateTimeField dateTimeField48 = chronology32.weekOfWeekyear();
        org.joda.time.DurationField durationField49 = chronology32.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField49, durationField35, and durationField36", !(durationField49.compareTo(durationField35) == 0) || (Math.signum(durationField49.compareTo(durationField36)) == Math.signum(durationField35.compareTo(durationField36))));
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology4 = null;
        java.util.Locale locale6 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology4, locale6);
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withChronology(chronology8);
        boolean boolean10 = dateTimeFormatter9.isPrinter();
        org.joda.time.Chronology chronology11 = dateTimeFormatter9.getChronolgy();
        org.joda.time.DurationField durationField12 = chronology11.hours();
        org.joda.time.DateTimeField dateTimeField13 = chronology11.yearOfEra();
        org.joda.time.DurationField durationField14 = chronology11.months();
        org.joda.time.DateTimeField dateTimeField15 = chronology11.weekyear();
        java.lang.String str16 = chronology11.toString();
        org.joda.time.DateTimeField dateTimeField17 = chronology11.year();
        org.joda.time.DateTimeField dateTimeField18 = chronology11.dayOfMonth();
        org.joda.time.DurationField durationField19 = chronology11.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField19, durationField12, and durationField14", !(durationField19.compareTo(durationField12) == 0) || (Math.signum(durationField19.compareTo(durationField14)) == Math.signum(durationField12.compareTo(durationField14))));
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder2.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder3.appendDayOfWeek(0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder5.appendEraText();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology8 = null;
        boolean boolean9 = dateTimeFieldType7.isSupported(chronology8);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder5.appendFixedSignedDecimal(dateTimeFieldType7, 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder5.appendText(dateTimeFieldType12);
        org.joda.time.Chronology chronology15 = null;
        java.util.Locale locale17 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket18 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology15, locale17);
        org.joda.time.Chronology chronology19 = dateTimeParserBucket18.getChronology();
        org.joda.time.DateTimeField dateTimeField20 = chronology19.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField21 = chronology19.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField22 = chronology19.year();
        org.joda.time.DateTimeField dateTimeField23 = chronology19.year();
        org.joda.time.DateTimeField dateTimeField24 = chronology19.yearOfEra();
        org.joda.time.DateTimeField dateTimeField25 = chronology19.yearOfCentury();
        boolean boolean26 = dateTimeFieldType12.isSupported(chronology19);
        org.joda.time.DateTimeField dateTimeField27 = chronology19.dayOfWeek();
        org.joda.time.DurationField durationField28 = chronology19.eras();
        org.joda.time.DateTimeField dateTimeField29 = chronology19.centuryOfEra();
        org.joda.time.DurationField durationField30 = chronology19.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField28, durationField30, and durationField28", !(durationField28.compareTo(durationField30) == 0) || (Math.signum(durationField28.compareTo(durationField28)) == Math.signum(durationField30.compareTo(durationField28))));
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale5 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology3, locale5);
        org.joda.time.Chronology chronology7 = dateTimeParserBucket6.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.dayOfYear();
        org.joda.time.DateTimeField dateTimeField9 = chronology7.yearOfEra();
        org.joda.time.DurationField durationField10 = chronology7.days();
        java.lang.String str11 = chronology7.toString();
        java.util.Locale locale13 = java.util.Locale.forLanguageTag("hi!");
        java.util.Set<java.lang.String> strSet14 = locale13.getUnicodeLocaleKeys();
        java.lang.String str15 = locale13.getDisplayScript();
        java.lang.String str16 = locale13.getCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket18 = new org.joda.time.format.DateTimeParserBucket((long) (short) 10, chronology7, locale13, (java.lang.Integer) 10);
        org.joda.time.DurationField durationField19 = chronology7.days();
        org.joda.time.DateTimeField dateTimeField20 = chronology7.era();
        org.joda.time.DateTimeField dateTimeField21 = chronology7.weekOfWeekyear();
        java.util.Locale locale23 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale24 = locale23.stripExtensions();
        boolean boolean25 = locale24.hasExtensions();
        java.lang.String str26 = locale24.toLanguageTag();
        java.lang.String str27 = locale24.getScript();
        org.joda.time.format.DateTimePrinter dateTimePrinter29 = null;
        org.joda.time.format.DateTimeParser dateTimeParser30 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter29, dateTimeParser30);
        org.joda.time.Chronology chronology33 = null;
        java.util.Locale locale35 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket36 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology33, locale35);
        org.joda.time.Chronology chronology37 = dateTimeParserBucket36.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter38 = dateTimeFormatter31.withChronology(chronology37);
        boolean boolean39 = dateTimeFormatter38.isPrinter();
        org.joda.time.Chronology chronology40 = dateTimeFormatter38.getChronolgy();
        org.joda.time.DateTimeField dateTimeField41 = chronology40.dayOfMonth();
        java.util.Locale locale42 = java.util.Locale.GERMANY;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket45 = new org.joda.time.format.DateTimeParserBucket(0L, chronology40, locale42, (java.lang.Integer) 1, (int) (short) 10);
        java.util.Locale locale46 = dateTimeParserBucket45.getLocale();
        java.lang.String str47 = locale46.getCountry();
        java.lang.String str48 = locale24.getDisplayScript(locale46);
        org.joda.time.Chronology chronology50 = null;
        java.util.Locale locale52 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket53 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology50, locale52);
        org.joda.time.DateTimeField dateTimeField54 = null;
        dateTimeParserBucket53.saveField(dateTimeField54, (int) (byte) 0);
        java.util.Locale locale57 = dateTimeParserBucket53.getLocale();
        org.joda.time.DateTimeField dateTimeField58 = null;
        dateTimeParserBucket53.saveField(dateTimeField58, 0);
        dateTimeParserBucket53.setOffset(0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder63 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder65 = dateTimeFormatterBuilder63.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder66 = dateTimeFormatterBuilder65.appendHalfdayOfDayText();
        org.joda.time.DateTimeFieldType dateTimeFieldType67 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology68 = null;
        boolean boolean69 = dateTimeFieldType67.isSupported(chronology68);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder70 = dateTimeFormatterBuilder65.appendText(dateTimeFieldType67);
        org.joda.time.DurationFieldType durationFieldType71 = dateTimeFieldType67.getDurationType();
        org.joda.time.Chronology chronology74 = null;
        java.util.Locale locale76 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket77 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology74, locale76);
        dateTimeParserBucket77.setPivotYear((java.lang.Integer) 0);
        java.util.Locale locale80 = dateTimeParserBucket77.getLocale();
        java.util.Set<java.lang.String> strSet81 = locale80.getUnicodeLocaleKeys();
        java.util.Set<java.lang.String> strSet82 = locale80.getUnicodeLocaleAttributes();
        dateTimeParserBucket53.saveField(dateTimeFieldType67, "", locale80);
        java.lang.String str84 = locale24.getDisplayName(locale80);
        boolean boolean85 = locale24.hasExtensions();
        java.util.Locale locale86 = java.util.Locale.ROOT;
        java.util.Locale locale87 = locale86.stripExtensions();
        java.lang.String str88 = locale24.getDisplayName(locale87);
        java.lang.String str89 = locale87.toLanguageTag();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket90 = new org.joda.time.format.DateTimeParserBucket((-187200090L), chronology7, locale87);
        org.joda.time.DateTimeField dateTimeField91 = chronology7.minuteOfHour();
        org.joda.time.DurationField durationField92 = chronology7.eras();
        org.joda.time.DateTimeField dateTimeField93 = chronology7.yearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField10 and durationField92", Math.signum(durationField10.compareTo(durationField92)) == -Math.signum(durationField92.compareTo(durationField10)));
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale3);
        dateTimeParserBucket4.setPivotYear((java.lang.Integer) 0);
        long long9 = dateTimeParserBucket4.computeMillis(true, "ISOChronology[UTC]");
        org.joda.time.Chronology chronology11 = null;
        java.util.Locale locale13 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket14 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology11, locale13);
        org.joda.time.Chronology chronology15 = dateTimeParserBucket14.getChronology();
        org.joda.time.DateTimeField dateTimeField16 = chronology15.dayOfYear();
        org.joda.time.DateTimeField dateTimeField17 = chronology15.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField18 = chronology15.clockhourOfDay();
        org.joda.time.DurationField durationField19 = chronology15.hours();
        org.joda.time.DurationField durationField20 = chronology15.years();
        org.joda.time.DurationField durationField21 = chronology15.hours();
        org.joda.time.DateTimeField dateTimeField22 = chronology15.year();
        org.joda.time.DurationField durationField23 = chronology15.halfdays();
        org.joda.time.DateTimeField dateTimeField24 = chronology15.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField25 = chronology15.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField26 = chronology15.millisOfSecond();
        boolean boolean27 = dateTimeParserBucket4.restoreState((java.lang.Object) chronology15);
        org.joda.time.Chronology chronology28 = dateTimeParserBucket4.getChronology();
        org.joda.time.DurationField durationField29 = chronology28.seconds();
        org.joda.time.DateTimeField dateTimeField30 = chronology28.secondOfMinute();
        org.joda.time.DurationField durationField31 = chronology28.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField31, durationField19, and durationField20", !(durationField31.compareTo(durationField19) == 0) || (Math.signum(durationField31.compareTo(durationField20)) == Math.signum(durationField19.compareTo(durationField20))));
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfWeek();
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.Chronology chronology5 = null;
        java.util.Locale locale7 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology5, locale7);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket8.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter3.withChronology(chronology9);
        org.joda.time.DateTimeField dateTimeField11 = chronology9.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField12 = dateTimeFieldType0.getField(chronology9);
        org.joda.time.DateTimeField dateTimeField13 = chronology9.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField14 = chronology9.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 100, 1);
        org.joda.time.Chronology chronology18 = chronology9.withZone(dateTimeZone17);
        org.joda.time.DurationField durationField19 = chronology18.months();
        org.joda.time.DurationField durationField20 = chronology18.days();
        org.joda.time.DateTimeZone dateTimeZone21 = chronology18.getZone();
        java.lang.String str23 = dateTimeZone21.getShortName(2000L);
        org.joda.time.Chronology chronology26 = null;
        java.util.Locale locale28 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket29 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology26, locale28);
        org.joda.time.Chronology chronology30 = dateTimeParserBucket29.getChronology();
        org.joda.time.DateTimeField dateTimeField31 = chronology30.dayOfYear();
        org.joda.time.DateTimeField dateTimeField32 = chronology30.yearOfEra();
        org.joda.time.DurationField durationField33 = chronology30.days();
        java.lang.String str34 = chronology30.toString();
        java.util.Locale locale36 = java.util.Locale.forLanguageTag("hi!");
        java.util.Set<java.lang.String> strSet37 = locale36.getUnicodeLocaleKeys();
        java.lang.String str38 = locale36.getDisplayScript();
        java.lang.String str39 = locale36.getCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket41 = new org.joda.time.format.DateTimeParserBucket((long) (short) 10, chronology30, locale36, (java.lang.Integer) 10);
        org.joda.time.DateTimeZone dateTimeZone42 = dateTimeParserBucket41.getZone();
        org.joda.time.Chronology chronology44 = null;
        java.util.Locale locale46 = java.util.Locale.forLanguageTag("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket47 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology44, locale46);
        org.joda.time.Chronology chronology48 = dateTimeParserBucket47.getChronology();
        org.joda.time.DurationField durationField49 = chronology48.halfdays();
        boolean boolean50 = dateTimeZone42.equals((java.lang.Object) durationField49);
        long long52 = dateTimeZone42.convertUTCToLocal(3L);
        int int54 = dateTimeZone42.getOffsetFromLocal(119L);
        java.lang.String str56 = dateTimeZone42.getShortName((long) 1);
        java.lang.String str58 = dateTimeZone42.getNameKey(97L);
        java.lang.String str59 = dateTimeZone42.toString();
        long long61 = dateTimeZone21.getMillisKeepLocal(dateTimeZone42, (long) 36);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField20 and durationField33", (durationField20.compareTo(durationField33) == 0) == durationField20.equals(durationField33));
    }
}

