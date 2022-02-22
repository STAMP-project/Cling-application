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
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.CopticChronology copticChronology2 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology2.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology2.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.Chronology chronology6 = copticChronology2.withZone(dateTimeZone5);
        org.joda.time.DateTimeField dateTimeField7 = copticChronology2.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology2.clockhourOfHalfday();
        org.joda.time.DurationField durationField9 = copticChronology2.days();
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime(4287241809L, (org.joda.time.Chronology) copticChronology2);
        org.joda.time.DateTimeField dateTimeField11 = copticChronology2.hourOfDay();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology2.clockhourOfDay();
        org.joda.time.DurationField durationField13 = copticChronology2.halfdays();
        org.joda.time.DurationField durationField14 = copticChronology2.seconds();
        org.joda.time.DurationField durationField15 = copticChronology2.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField15, durationField9, and durationField13", !(durationField15.compareTo(durationField9) == 0) || (Math.signum(durationField15.compareTo(durationField13)) == Math.signum(durationField9.compareTo(durationField13))));
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test502");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = copticChronology1.weekyears();
        org.joda.time.DurationField durationField4 = copticChronology1.hours();
        int int5 = copticChronology1.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.monthOfYear();
        org.joda.time.DurationField durationField7 = copticChronology1.seconds();
        long long11 = copticChronology1.add(4287296336L, (long) 373, (int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.chrono.CopticChronology copticChronology13 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone12);
        org.joda.time.DateTimeField dateTimeField14 = copticChronology13.weekyearOfCentury();
        org.joda.time.DurationField durationField15 = copticChronology13.seconds();
        org.joda.time.DurationField durationField16 = copticChronology13.years();
        org.joda.time.DateTimeZone dateTimeZone17 = copticChronology13.getZone();
        java.util.TimeZone timeZone18 = dateTimeZone17.toTimeZone();
        long long21 = dateTimeZone17.convertLocalToUTC((long) (byte) 0, true);
        org.joda.time.Chronology chronology22 = copticChronology1.withZone(dateTimeZone17);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField16", (durationField3.compareTo(durationField16) == 0) == durationField3.equals(durationField16));
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test503");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.DateTime dateTime9 = localDateTime7.toDateTime(readableInstant8);
        org.joda.time.LocalDateTime.Property property10 = localDateTime7.millisOfDay();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime7.plusMonths(999);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(chronology13);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime14.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime14.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.DateTime dateTime22 = localDateTime20.toDateTime(readableInstant21);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime(chronology23);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime24.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime24.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime24.plusWeeks((int) (byte) 10);
        int int31 = localDateTime30.getMillisOfSecond();
        int int32 = localDateTime30.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime34 = localDateTime30.plusHours((int) (short) -1);
        org.joda.time.DurationFieldType durationFieldType35 = null;
        boolean boolean36 = localDateTime30.isSupported(durationFieldType35);
        org.joda.time.DateTime dateTime37 = localDateTime30.toDateTime();
        boolean boolean38 = dateTime22.isAfter((org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.DateTimeZone dateTimeZone39 = dateTime37.getZone();
        org.joda.time.DateTime dateTime40 = localDateTime7.toDateTime((org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.Instant instant41 = dateTime37.toInstant();
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.LocalDateTime localDateTime43 = new org.joda.time.LocalDateTime(chronology42);
        org.joda.time.LocalDateTime localDateTime45 = localDateTime43.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime47 = localDateTime43.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime49 = localDateTime43.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant50 = null;
        org.joda.time.DateTime dateTime51 = localDateTime49.toDateTime(readableInstant50);
        java.util.Locale locale52 = java.util.Locale.GERMANY;
        boolean boolean53 = locale52.hasExtensions();
        boolean boolean54 = dateTime51.equals((java.lang.Object) locale52);
        java.util.Locale.LanguageRange[] languageRangeArray55 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList56 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList56, languageRangeArray55);
        java.util.Collection<java.lang.String> strCollection58 = null;
        java.util.List<java.lang.String> strList59 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList56, strCollection58);
        java.util.Collection<java.lang.String> strCollection60 = null;
        java.util.List<java.lang.String> strList61 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList56, strCollection60);
        java.util.Locale.LanguageRange[] languageRangeArray62 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList63 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList63, languageRangeArray62);
        java.util.Collection<java.lang.String> strCollection65 = null;
        java.util.List<java.lang.String> strList66 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList63, strCollection65);
        java.util.Collection<java.lang.String> strCollection67 = null;
        java.util.List<java.lang.String> strList68 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList63, strCollection67);
        java.util.Locale.FilteringMode filteringMode69 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList70 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList56, strCollection67, filteringMode69);
        boolean boolean71 = dateTime51.equals((java.lang.Object) languageRangeList56);
        org.joda.time.Chronology chronology72 = null;
        org.joda.time.LocalDateTime localDateTime73 = new org.joda.time.LocalDateTime(chronology72);
        org.joda.time.LocalDateTime localDateTime75 = localDateTime73.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime.Property property76 = localDateTime75.weekOfWeekyear();
        org.joda.time.LocalDateTime.Property property77 = localDateTime75.centuryOfEra();
        org.joda.time.Chronology chronology78 = null;
        org.joda.time.LocalDateTime localDateTime79 = new org.joda.time.LocalDateTime(chronology78);
        org.joda.time.LocalDateTime localDateTime81 = localDateTime79.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime83 = localDateTime79.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime85 = localDateTime79.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant86 = null;
        org.joda.time.DateTime dateTime87 = localDateTime85.toDateTime(readableInstant86);
        java.util.Locale locale88 = java.util.Locale.GERMANY;
        boolean boolean89 = locale88.hasExtensions();
        boolean boolean90 = dateTime87.equals((java.lang.Object) locale88);
        int int91 = property77.getDifference((org.joda.time.ReadableInstant) dateTime87);
        int int92 = dateTime51.compareTo((org.joda.time.ReadableInstant) dateTime87);
        boolean boolean93 = instant41.isAfter((org.joda.time.ReadableInstant) dateTime51);
        org.joda.time.DateTimeZone dateTimeZone94 = dateTime51.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime37 and instant41", (dateTime37.compareTo(instant41) == 0) == dateTime37.equals(instant41));
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test504");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = copticChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology1.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology1.weekyear();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology1.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology1.centuryOfEra();
        org.joda.time.DurationField durationField10 = copticChronology1.years();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology1.centuryOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField10", (durationField3.compareTo(durationField10) == 0) == durationField3.equals(durationField10));
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test505");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology1.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.Chronology chronology5 = copticChronology1.withZone(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.millisOfSecond();
        org.joda.time.DurationField durationField7 = copticChronology1.hours();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology1.dayOfMonth();
        org.joda.time.DurationField durationField9 = copticChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology1.monthOfYear();
        java.util.Locale locale12 = java.util.Locale.TAIWAN;
        java.lang.String str13 = locale12.getVariant();
        java.lang.String str14 = dateTimeField10.getAsText(4287238068L, locale12);
        java.util.Locale locale15 = locale12.stripExtensions();
        java.util.Set<java.lang.String> strSet16 = locale15.getUnicodeLocaleKeys();
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.withYear(5);
        boolean boolean20 = strSet16.equals((java.lang.Object) localDateTime17);
        org.joda.time.LocalDateTime.Property property21 = localDateTime17.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.chrono.CopticChronology copticChronology23 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone22);
        org.joda.time.DateTimeField dateTimeField24 = copticChronology23.clockhourOfDay();
        org.joda.time.DurationField durationField25 = copticChronology23.weekyears();
        org.joda.time.DateTimeField dateTimeField26 = copticChronology23.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone27 = copticChronology23.getZone();
        org.joda.time.LocalDateTime localDateTime28 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) copticChronology23);
        org.joda.time.LocalDateTime.Property property29 = localDateTime28.hourOfDay();
        org.joda.time.DurationField durationField30 = property29.getLeapDurationField();
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime(chronology31);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime32.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime32.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime38 = localDateTime32.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.DateTime dateTime40 = localDateTime38.toDateTime(readableInstant39);
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = null;
        boolean boolean42 = dateTime40.isSupported(dateTimeFieldType41);
        org.joda.time.DateTimeFieldType dateTimeFieldType43 = null;
        boolean boolean44 = dateTime40.isSupported(dateTimeFieldType43);
        int int45 = property29.getDifference((org.joda.time.ReadableInstant) dateTime40);
        org.joda.time.Instant instant46 = dateTime40.toInstant();
        int int47 = property21.getDifference((org.joda.time.ReadableInstant) dateTime40);
        int int48 = property21.getMinimumValueOverall();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime40 and instant46", (dateTime40.compareTo(instant46) == 0) == dateTime40.equals(instant46));
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test506");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology1.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology1.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) copticChronology1);
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology1.millisOfDay();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology1.monthOfYear();
        org.joda.time.DurationField durationField9 = copticChronology1.days();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology1.secondOfDay();
        org.joda.time.DurationField durationField11 = copticChronology1.hours();
        org.joda.time.DurationField durationField12 = copticChronology1.weekyears();
        org.joda.time.DurationField durationField13 = copticChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField13, durationField9, and durationField11", !(durationField13.compareTo(durationField9) == 0) || (Math.signum(durationField13.compareTo(durationField11)) == Math.signum(durationField9.compareTo(durationField11))));
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test507");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology1.centuryOfEra();
        org.joda.time.DurationField durationField4 = copticChronology1.millis();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology1.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.dayOfMonth();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(chronology7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime8.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime8.withYearOfCentury(0);
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.weekyear();
        org.joda.time.LocalDateTime localDateTime17 = property15.setCopy((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime18 = property15.roundFloorCopy();
        org.joda.time.Interval interval19 = property15.toInterval();
        org.joda.time.LocalDateTime localDateTime20 = property15.roundHalfFloorCopy();
        int[] intArray22 = copticChronology1.get((org.joda.time.ReadablePartial) localDateTime20, 4287278307L);
        org.joda.time.DateTimeField dateTimeField23 = copticChronology1.hourOfHalfday();
        org.joda.time.DurationField durationField24 = copticChronology1.hours();
        org.joda.time.DurationField durationField25 = copticChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField25, durationField4, and durationField24", !(durationField25.compareTo(durationField4) == 0) || (Math.signum(durationField25.compareTo(durationField24)) == Math.signum(durationField4.compareTo(durationField24))));
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test508");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.hourOfDay();
        org.joda.time.DurationField durationField3 = copticChronology1.eras();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology1.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology1.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone6);
        org.joda.time.DateTimeField dateTimeField8 = copticChronology7.hourOfDay();
        org.joda.time.DurationField durationField9 = copticChronology7.eras();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology7.weekOfWeekyear();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(chronology11);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.weekOfWeekyear();
        int int16 = localDateTime14.getYear();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.chrono.CopticChronology copticChronology18 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone17);
        org.joda.time.DateTimeField dateTimeField19 = copticChronology18.dayOfMonth();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime(chronology20);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime21.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime21.plusWeeks((int) (byte) 10);
        java.util.Locale locale28 = java.util.Locale.PRC;
        java.lang.String str29 = dateTimeField19.getAsText((org.joda.time.ReadablePartial) localDateTime27, locale28);
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime(chronology30);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime31.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime35 = localDateTime31.withMillisOfSecond((int) (byte) 1);
        java.util.Locale locale37 = java.util.Locale.JAPAN;
        java.lang.String str38 = dateTimeField19.getAsText((org.joda.time.ReadablePartial) localDateTime31, 2022, locale37);
        java.lang.String str39 = dateTimeField10.getAsShortText((org.joda.time.ReadablePartial) localDateTime14, locale37);
        org.joda.time.LocalDateTime localDateTime41 = localDateTime14.minusMonths((int) ' ');
        int int42 = dateTimeField5.getMinimumValue((org.joda.time.ReadablePartial) localDateTime41);
        org.joda.time.LocalDateTime localDateTime44 = localDateTime41.withMillisOfDay(426);
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.chrono.CopticChronology copticChronology46 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone45);
        org.joda.time.DateTimeField dateTimeField47 = copticChronology46.clockhourOfDay();
        org.joda.time.DurationField durationField48 = copticChronology46.weekyears();
        org.joda.time.DateTimeField dateTimeField49 = copticChronology46.clockhourOfDay();
        org.joda.time.DurationField durationField50 = copticChronology46.hours();
        org.joda.time.DateTimeZone dateTimeZone51 = copticChronology46.getZone();
        org.joda.time.DateTimeField dateTimeField52 = copticChronology46.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField53 = copticChronology46.hourOfHalfday();
        java.lang.String str54 = copticChronology46.toString();
        boolean boolean55 = localDateTime44.equals((java.lang.Object) copticChronology46);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField48", Math.signum(durationField3.compareTo(durationField48)) == -Math.signum(durationField48.compareTo(durationField3)));
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test509");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.CopticChronology copticChronology2 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology2.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology2.secondOfDay();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology2.secondOfDay();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology2.centuryOfEra();
        org.joda.time.DurationField durationField7 = copticChronology2.months();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology2.millisOfSecond();
        org.joda.time.DurationField durationField10 = copticChronology2.hours();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology2.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(11L, (org.joda.time.Chronology) copticChronology2);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.chrono.CopticChronology copticChronology14 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone13);
        org.joda.time.DateTimeField dateTimeField15 = copticChronology14.clockhourOfDay();
        org.joda.time.DurationField durationField16 = copticChronology14.weekyears();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology14.halfdayOfDay();
        org.joda.time.DurationField durationField18 = copticChronology14.millis();
        org.joda.time.DateTimeField dateTimeField19 = copticChronology14.clockhourOfDay();
        org.joda.time.DurationField durationField20 = copticChronology14.days();
        org.joda.time.DateTimeField dateTimeField21 = copticChronology14.dayOfYear();
        org.joda.time.DateTimeField dateTimeField22 = copticChronology14.millisOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = dateTimeField22.getType();
        org.joda.time.LocalDateTime.Property property24 = localDateTime12.property(dateTimeFieldType23);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime(chronology25);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime26.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime26.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime30.withMillisOfSecond((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime30.withMinuteOfHour(10);
        org.joda.time.ReadablePeriod readablePeriod35 = null;
        org.joda.time.LocalDateTime localDateTime36 = localDateTime34.minus(readablePeriod35);
        org.joda.time.Chronology chronology37 = localDateTime34.getChronology();
        org.joda.time.LocalDateTime localDateTime39 = localDateTime34.minusHours(1686);
        org.joda.time.LocalDateTime localDateTime41 = localDateTime34.withMinuteOfHour(30);
        org.joda.time.LocalDateTime.Property property42 = localDateTime41.millisOfSecond();
        java.lang.String str43 = property42.getAsString();
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.LocalDateTime localDateTime45 = new org.joda.time.LocalDateTime(chronology44);
        org.joda.time.LocalDateTime localDateTime47 = localDateTime45.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime49 = localDateTime45.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime51 = localDateTime45.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant52 = null;
        org.joda.time.DateTime dateTime53 = localDateTime51.toDateTime(readableInstant52);
        org.joda.time.LocalDateTime.Property property54 = localDateTime51.millisOfDay();
        org.joda.time.DurationField durationField55 = property54.getRangeDurationField();
        org.joda.time.DurationField durationField56 = property54.getLeapDurationField();
        org.joda.time.LocalDateTime localDateTime58 = property54.setCopy(122);
        java.lang.String str59 = property54.getAsString();
        java.util.Locale locale60 = java.util.Locale.CANADA;
        java.lang.String str61 = locale60.getCountry();
        java.util.Set<java.lang.String> strSet62 = locale60.getUnicodeLocaleKeys();
        int int63 = property54.getMaximumTextLength(locale60);
        int int64 = property42.getMaximumTextLength(locale60);
        org.joda.time.Chronology chronology65 = null;
        org.joda.time.LocalDateTime localDateTime66 = new org.joda.time.LocalDateTime(chronology65);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray67 = localDateTime66.getFieldTypes();
        org.joda.time.ReadablePeriod readablePeriod68 = null;
        org.joda.time.LocalDateTime localDateTime69 = localDateTime66.plus(readablePeriod68);
        int int70 = localDateTime66.getYearOfEra();
        int int71 = property42.compareTo((org.joda.time.ReadablePartial) localDateTime66);
        int int72 = property24.compareTo((org.joda.time.ReadablePartial) localDateTime66);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField20 and durationField55", (durationField20.compareTo(durationField55) == 0) == durationField20.equals(durationField55));
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test510");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology1.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.Chronology chronology5 = copticChronology1.withZone(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.millisOfSecond();
        org.joda.time.DurationField durationField7 = copticChronology1.hours();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology1.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology1.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology1.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology1.weekyear();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime(chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime13.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.withMillisOfSecond((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime17.withMinuteOfHour(10);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime17.minusDays(0);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime(chronology24);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime25.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime25.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime25.withYearOfCentury(0);
        org.joda.time.LocalDateTime.Property property32 = localDateTime31.weekyear();
        org.joda.time.LocalDateTime localDateTime34 = property32.setCopy((int) (byte) 1);
        long long35 = property32.remainder();
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime(chronology36);
        org.joda.time.LocalDateTime localDateTime39 = localDateTime37.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime41 = localDateTime37.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime43 = localDateTime37.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.DateTime dateTime45 = localDateTime43.toDateTime(readableInstant44);
        org.joda.time.LocalDateTime.Property property46 = localDateTime43.millisOfDay();
        int int47 = property32.compareTo((org.joda.time.ReadablePartial) localDateTime43);
        boolean boolean49 = property32.equals((java.lang.Object) 126L);
        org.joda.time.DateTimeFieldType dateTimeFieldType50 = property32.getFieldType();
        org.joda.time.LocalDateTime localDateTime52 = localDateTime23.withField(dateTimeFieldType50, 649);
        org.joda.time.LocalDateTime localDateTime54 = localDateTime23.withDayOfMonth(7);
        long long56 = copticChronology1.set((org.joda.time.ReadablePartial) localDateTime54, 4287227101L);
        org.joda.time.DateTimeField dateTimeField57 = copticChronology1.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone58 = null;
        org.joda.time.chrono.CopticChronology copticChronology59 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone58);
        org.joda.time.DateTimeField dateTimeField60 = copticChronology59.hourOfDay();
        org.joda.time.DateTimeField dateTimeField61 = copticChronology59.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone62 = null;
        org.joda.time.Chronology chronology63 = copticChronology59.withZone(dateTimeZone62);
        org.joda.time.DateTimeField dateTimeField64 = copticChronology59.millisOfSecond();
        org.joda.time.DurationField durationField65 = copticChronology59.hours();
        org.joda.time.DateTimeField dateTimeField66 = copticChronology59.halfdayOfDay();
        org.joda.time.DurationField durationField67 = copticChronology59.minutes();
        org.joda.time.DurationField durationField68 = copticChronology59.months();
        org.joda.time.DateTimeZone dateTimeZone69 = null;
        org.joda.time.chrono.CopticChronology copticChronology70 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone69);
        org.joda.time.DateTimeField dateTimeField71 = copticChronology70.clockhourOfDay();
        org.joda.time.DurationField durationField72 = copticChronology70.weekyears();
        org.joda.time.DateTimeField dateTimeField73 = copticChronology70.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField74 = copticChronology70.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField75 = copticChronology70.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField76 = copticChronology70.weekyear();
        org.joda.time.DateTimeZone dateTimeZone79 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime80 = new org.joda.time.LocalDateTime((long) 53, dateTimeZone79);
        org.joda.time.Chronology chronology81 = copticChronology70.withZone(dateTimeZone79);
        org.joda.time.DateTimeZone dateTimeZone83 = org.joda.time.DateTimeZone.forOffsetMillis(633);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone83);
        long long86 = dateTimeZone79.getMillisKeepLocal(dateTimeZone83, 10598050430264L);
        org.joda.time.Chronology chronology87 = copticChronology59.withZone(dateTimeZone83);
        long long89 = dateTimeZone83.convertUTCToLocal(0L);
        org.joda.time.Chronology chronology90 = copticChronology1.withZone(dateTimeZone83);
        org.joda.time.Chronology chronology91 = copticChronology1.withUTC();
        org.joda.time.DurationField durationField92 = copticChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField92, durationField7, and durationField67", !(durationField92.compareTo(durationField7) == 0) || (Math.signum(durationField92.compareTo(durationField67)) == Math.signum(durationField7.compareTo(durationField67))));
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test511");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology1.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone4 = copticChronology1.getZone();
        org.joda.time.Chronology chronology5 = copticChronology1.withUTC();
        org.joda.time.DurationField durationField6 = copticChronology1.weekyears();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(chronology7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime8.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime8.withYearOfCentury(0);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.withYearOfCentury((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 10);
        long long20 = dateTimeZone18.previousTransition((long) (-292275054));
        org.joda.time.LocalDateTime localDateTime21 = org.joda.time.LocalDateTime.now(dateTimeZone18);
        org.joda.time.LocalDateTime.Property property22 = localDateTime21.yearOfCentury();
        int[] intArray23 = localDateTime21.getValues();
        copticChronology1.validate((org.joda.time.ReadablePartial) localDateTime14, intArray23);
        org.joda.time.DurationField durationField25 = copticChronology1.eras();
        org.joda.time.DateTimeField dateTimeField26 = copticChronology1.weekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField6 and durationField25", Math.signum(durationField6.compareTo(durationField25)) == -Math.signum(durationField25.compareTo(durationField6)));
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test512");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology1.centuryOfEra();
        org.joda.time.DurationField durationField4 = copticChronology1.millis();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology1.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.secondOfMinute();
        org.joda.time.DurationField durationField7 = copticChronology1.eras();
        org.joda.time.DurationField durationField8 = copticChronology1.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField4 and durationField7", Math.signum(durationField4.compareTo(durationField7)) == -Math.signum(durationField7.compareTo(durationField4)));
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test513");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.CopticChronology copticChronology2 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology2.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology2.secondOfDay();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology2.secondOfDay();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology2.centuryOfEra();
        org.joda.time.DurationField durationField7 = copticChronology2.months();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology2.secondOfMinute();
        org.joda.time.DurationField durationField9 = copticChronology2.days();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology2.millisOfSecond();
        org.joda.time.DurationField durationField11 = copticChronology2.weeks();
        org.joda.time.DurationField durationField12 = copticChronology2.years();
        org.joda.time.DurationField durationField13 = copticChronology2.weekyears();
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(4287231445L, (org.joda.time.Chronology) copticChronology2);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField12 and durationField13", (durationField12.compareTo(durationField13) == 0) == durationField12.equals(durationField13));
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test514");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology1.weekyearOfCentury();
        org.joda.time.DurationField durationField4 = copticChronology1.years();
        org.joda.time.DurationField durationField5 = copticChronology1.weekyears();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean7 = dateTimeZone6.isFixed();
        org.joda.time.Chronology chronology8 = copticChronology1.withZone(dateTimeZone6);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField5", (durationField4.compareTo(durationField5) == 0) == durationField4.equals(durationField5));
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test515");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology1.secondOfDay();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology1.dayOfWeek();
        boolean boolean6 = copticChronology1.equals((java.lang.Object) (byte) 100);
        org.joda.time.DurationField durationField7 = copticChronology1.weeks();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.chrono.CopticChronology copticChronology9 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone8);
        org.joda.time.DateTimeField dateTimeField10 = copticChronology9.clockhourOfDay();
        org.joda.time.DurationField durationField11 = copticChronology9.weekyears();
        org.joda.time.DurationField durationField12 = copticChronology9.hours();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology9.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology9.weekyearOfCentury();
        long long18 = copticChronology9.add((long) (byte) 100, (long) 30, 113);
        org.joda.time.DateTimeField dateTimeField19 = copticChronology9.hourOfDay();
        long long21 = dateTimeField19.roundHalfFloor((long) 53739334);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime(chronology22);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime23.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime23.withYearOfCentury(0);
        org.joda.time.LocalDateTime.Property property30 = localDateTime29.weekyear();
        org.joda.time.LocalDateTime localDateTime32 = property30.setCopy((int) (byte) 1);
        org.joda.time.DurationField durationField33 = property30.getLeapDurationField();
        org.joda.time.LocalDateTime localDateTime34 = property30.getLocalDateTime();
        org.joda.time.LocalDateTime.Property property35 = localDateTime34.weekOfWeekyear();
        org.joda.time.LocalDateTime.Property property36 = localDateTime34.year();
        org.joda.time.LocalDateTime localDateTime38 = property36.addWrapFieldToCopy((int) (byte) 0);
        org.joda.time.LocalDateTime.Property property39 = localDateTime38.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.chrono.CopticChronology copticChronology41 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone40);
        org.joda.time.DateTimeField dateTimeField42 = copticChronology41.clockhourOfDay();
        org.joda.time.DurationField durationField43 = copticChronology41.weekyears();
        org.joda.time.DateTimeField dateTimeField44 = copticChronology41.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone45 = copticChronology41.getZone();
        org.joda.time.DateTimeField dateTimeField46 = copticChronology41.yearOfEra();
        org.joda.time.DurationField durationField47 = copticChronology41.minutes();
        org.joda.time.DateTimeField dateTimeField48 = copticChronology41.clockhourOfHalfday();
        org.joda.time.ReadablePeriod readablePeriod49 = null;
        long long52 = copticChronology41.add(readablePeriod49, 153L, 53740549);
        org.joda.time.DateTimeField dateTimeField53 = copticChronology41.dayOfWeek();
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.LocalDateTime localDateTime55 = new org.joda.time.LocalDateTime(chronology54);
        org.joda.time.LocalDateTime localDateTime57 = localDateTime55.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime59 = localDateTime55.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime61 = localDateTime55.plusWeeks((int) (byte) 10);
        org.joda.time.Chronology chronology62 = null;
        org.joda.time.LocalDateTime localDateTime63 = new org.joda.time.LocalDateTime(chronology62);
        org.joda.time.LocalDateTime localDateTime65 = localDateTime63.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime67 = localDateTime63.withMillisOfSecond((int) (byte) 1);
        int int68 = localDateTime55.compareTo((org.joda.time.ReadablePartial) localDateTime63);
        org.joda.time.LocalDateTime.Property property69 = localDateTime63.weekyear();
        org.joda.time.LocalDateTime.Property property70 = localDateTime63.millisOfDay();
        org.joda.time.LocalDateTime localDateTime72 = localDateTime63.minusYears(999);
        org.joda.time.ReadableDuration readableDuration73 = null;
        org.joda.time.LocalDateTime localDateTime74 = localDateTime63.plus(readableDuration73);
        org.joda.time.LocalDateTime localDateTime76 = localDateTime63.plusYears(44);
        int int77 = localDateTime76.getDayOfMonth();
        java.util.Locale locale78 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet79 = locale78.getExtensionKeys();
        java.util.Locale locale80 = java.util.Locale.CHINA;
        java.lang.String str81 = locale80.getDisplayCountry();
        java.lang.String str82 = locale78.getDisplayVariant(locale80);
        java.lang.String str83 = dateTimeField53.getAsShortText((org.joda.time.ReadablePartial) localDateTime76, locale80);
        java.lang.String str84 = dateTimeField19.getAsText((org.joda.time.ReadablePartial) localDateTime38, locale80);
        int[] intArray86 = copticChronology1.get((org.joda.time.ReadablePartial) localDateTime38, 4287499123L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField7 and durationField33", (durationField7.compareTo(durationField33) == 0) == durationField7.equals(durationField33));
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test516");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology1.secondOfDay();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology1.secondOfDay();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology1.centuryOfEra();
        org.joda.time.DurationField durationField6 = copticChronology1.months();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology1.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology1.millisOfSecond();
        org.joda.time.DurationField durationField9 = copticChronology1.hours();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology1.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology1.dayOfYear();
        org.joda.time.DurationField durationField12 = copticChronology1.years();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(chronology13);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.weekOfWeekyear();
        int[] intArray19 = copticChronology1.get((org.joda.time.ReadablePartial) localDateTime16, 9935362799367L);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.chrono.CopticChronology copticChronology21 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone20);
        org.joda.time.DateTimeField dateTimeField22 = copticChronology21.clockhourOfDay();
        org.joda.time.DurationField durationField23 = copticChronology21.weekyears();
        org.joda.time.DurationField durationField24 = copticChronology21.hours();
        int int25 = copticChronology21.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField26 = copticChronology21.monthOfYear();
        int int28 = dateTimeField26.getMinimumValue(4287217062L);
        int int29 = dateTimeField26.getMinimumValue();
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime(chronology30);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime31.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime35 = localDateTime31.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime37 = localDateTime31.withYearOfCentury(0);
        org.joda.time.LocalDateTime.Property property38 = localDateTime37.weekyear();
        org.joda.time.Interval interval39 = property38.toInterval();
        boolean boolean40 = property38.isLeap();
        java.lang.String str41 = property38.getAsText();
        org.joda.time.LocalDateTime localDateTime42 = property38.roundHalfCeilingCopy();
        int int43 = dateTimeField26.getMaximumValue((org.joda.time.ReadablePartial) localDateTime42);
        int int44 = localDateTime42.size();
        org.joda.time.ReadableDuration readableDuration45 = null;
        org.joda.time.LocalDateTime localDateTime46 = localDateTime42.minus(readableDuration45);
        org.joda.time.LocalDateTime localDateTime48 = localDateTime46.withMillisOfDay(611);
        int int49 = localDateTime16.compareTo((org.joda.time.ReadablePartial) localDateTime46);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField12 and durationField23", (durationField12.compareTo(durationField23) == 0) == durationField12.equals(durationField23));
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test517");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = copticChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.chrono.CopticChronology copticChronology6 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone5);
        org.joda.time.DateTimeField dateTimeField7 = copticChronology6.clockhourOfDay();
        java.util.Locale locale9 = java.util.Locale.ITALIAN;
        java.lang.String str10 = dateTimeField7.getAsText((long) 'a', locale9);
        int int11 = dateTimeField4.getMaximumTextLength(locale9);
        int int13 = dateTimeField4.getMinimumValue((-3600001L));
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime(chronology14);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.weekOfWeekyear();
        org.joda.time.LocalDateTime.Property property19 = localDateTime17.centuryOfEra();
        java.lang.String str20 = localDateTime17.toString();
        java.util.Locale locale22 = java.util.Locale.ENGLISH;
        java.lang.String str23 = dateTimeField4.getAsShortText((org.joda.time.ReadablePartial) localDateTime17, (-292275054), locale22);
        org.joda.time.LocalDateTime.Property property24 = localDateTime17.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime26 = property24.addWrapFieldToCopy((int) '#');
        org.joda.time.DateTime dateTime27 = localDateTime26.toDateTime();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime(chronology28);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime29.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime29.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime35 = localDateTime33.withMillisOfSecond((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime37 = localDateTime33.withMinuteOfHour(10);
        org.joda.time.LocalDateTime localDateTime39 = localDateTime33.minusDays(0);
        int int40 = localDateTime39.getHourOfDay();
        org.joda.time.DateTime dateTime41 = localDateTime39.toDateTime();
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.LocalDateTime localDateTime43 = new org.joda.time.LocalDateTime(chronology42);
        org.joda.time.LocalDateTime localDateTime45 = localDateTime43.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime47 = localDateTime43.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime49 = localDateTime43.withYearOfCentury(0);
        org.joda.time.LocalDateTime.Property property50 = localDateTime49.weekyear();
        org.joda.time.LocalDateTime localDateTime52 = property50.setCopy((int) (byte) 1);
        org.joda.time.DurationField durationField53 = property50.getLeapDurationField();
        org.joda.time.LocalDateTime localDateTime54 = property50.getLocalDateTime();
        org.joda.time.LocalDateTime.Property property55 = localDateTime54.weekOfWeekyear();
        org.joda.time.ReadableInstant readableInstant56 = null;
        org.joda.time.DateTime dateTime57 = localDateTime54.toDateTime(readableInstant56);
        org.joda.time.Instant instant58 = dateTime57.toInstant();
        boolean boolean59 = dateTime41.isAfter((org.joda.time.ReadableInstant) instant58);
        boolean boolean60 = dateTime27.isBefore((org.joda.time.ReadableInstant) dateTime41);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime57 and instant58", (dateTime57.compareTo(instant58) == 0) == dateTime57.equals(instant58));
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test518");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = copticChronology1.weekyears();
        org.joda.time.DurationField durationField4 = copticChronology1.hours();
        int int5 = copticChronology1.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.monthOfYear();
        org.joda.time.DurationField durationField7 = copticChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology1.secondOfDay();
        org.joda.time.DurationField durationField9 = copticChronology1.years();
        org.joda.time.DurationField durationField10 = copticChronology1.weeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField9", (durationField3.compareTo(durationField9) == 0) == durationField3.equals(durationField9));
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test519");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.hourOfDay();
        org.joda.time.DurationField durationField3 = copticChronology1.eras();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology1.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology1.era();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.clockhourOfDay();
        java.lang.String str7 = copticChronology1.toString();
        org.joda.time.DurationField durationField8 = copticChronology1.eras();
        org.joda.time.DurationField durationField9 = copticChronology1.years();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField3, durationField9, and durationField3", !(durationField3.compareTo(durationField9) == 0) || (Math.signum(durationField3.compareTo(durationField3)) == Math.signum(durationField9.compareTo(durationField3))));
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test520");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology1.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.Chronology chronology5 = copticChronology1.withZone(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.minuteOfDay();
        org.joda.time.DurationField durationField7 = copticChronology1.eras();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(chronology8);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray10 = localDateTime9.getFieldTypes();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime9.withMillisOfDay((int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.plusWeeks((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.chrono.CopticChronology copticChronology17 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone16);
        org.joda.time.DateTimeField dateTimeField18 = copticChronology17.hourOfDay();
        org.joda.time.DateTimeField dateTimeField19 = copticChronology17.secondOfDay();
        org.joda.time.DateTimeField dateTimeField20 = copticChronology17.secondOfDay();
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime((long) 10, (org.joda.time.Chronology) copticChronology17);
        int int22 = localDateTime21.getDayOfYear();
        boolean boolean23 = localDateTime14.isEqual((org.joda.time.ReadablePartial) localDateTime21);
        int int24 = localDateTime14.getYearOfCentury();
        java.util.TimeZone timeZone26 = null;
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forTimeZone(timeZone26);
        java.lang.String str29 = dateTimeZone27.getNameKey((long) (byte) 0);
        boolean boolean30 = dateTimeZone27.isFixed();
        java.lang.String str32 = dateTimeZone27.getShortName(3430L);
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime(4287236898L, dateTimeZone27);
        org.joda.time.DateTime dateTime34 = localDateTime14.toDateTime(dateTimeZone27);
        java.lang.String str35 = dateTimeZone27.toString();
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.chrono.CopticChronology copticChronology37 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone36);
        org.joda.time.DateTimeField dateTimeField38 = copticChronology37.clockhourOfDay();
        org.joda.time.DurationField durationField39 = copticChronology37.weekyears();
        org.joda.time.DateTimeField dateTimeField40 = copticChronology37.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone41 = copticChronology37.getZone();
        org.joda.time.DurationField durationField42 = copticChronology37.weeks();
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.chrono.CopticChronology copticChronology44 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone43);
        org.joda.time.DateTimeField dateTimeField45 = copticChronology44.clockhourOfDay();
        org.joda.time.DurationField durationField46 = copticChronology44.weekyears();
        org.joda.time.DateTimeField dateTimeField47 = copticChronology44.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField48 = copticChronology44.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField49 = copticChronology44.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField50 = copticChronology44.weekyear();
        org.joda.time.DateTimeField dateTimeField51 = copticChronology44.hourOfDay();
        boolean boolean52 = copticChronology37.equals((java.lang.Object) copticChronology44);
        org.joda.time.DateTimeZone dateTimeZone53 = null;
        org.joda.time.chrono.CopticChronology copticChronology54 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone53);
        org.joda.time.DateTimeField dateTimeField55 = copticChronology54.dayOfMonth();
        org.joda.time.Chronology chronology56 = null;
        org.joda.time.LocalDateTime localDateTime57 = new org.joda.time.LocalDateTime(chronology56);
        org.joda.time.LocalDateTime localDateTime59 = localDateTime57.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime61 = localDateTime57.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime63 = localDateTime57.plusWeeks((int) (byte) 10);
        java.util.Locale locale64 = java.util.Locale.PRC;
        java.lang.String str65 = dateTimeField55.getAsText((org.joda.time.ReadablePartial) localDateTime63, locale64);
        org.joda.time.ReadablePeriod readablePeriod66 = null;
        org.joda.time.LocalDateTime localDateTime67 = localDateTime63.plus(readablePeriod66);
        org.joda.time.LocalDateTime localDateTime69 = localDateTime63.withCenturyOfEra(522);
        org.joda.time.LocalDateTime.Property property70 = localDateTime63.secondOfMinute();
        org.joda.time.LocalDateTime.Property property71 = localDateTime63.year();
        boolean boolean72 = property71.isLeap();
        org.joda.time.Chronology chronology73 = null;
        org.joda.time.LocalDateTime localDateTime74 = new org.joda.time.LocalDateTime(chronology73);
        org.joda.time.LocalDateTime localDateTime76 = localDateTime74.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime78 = localDateTime74.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime80 = localDateTime74.withYearOfCentury(0);
        org.joda.time.LocalDateTime.Property property81 = localDateTime80.weekyear();
        org.joda.time.LocalDateTime localDateTime83 = property81.setCopy((int) (byte) 1);
        long long84 = property81.remainder();
        org.joda.time.LocalDateTime localDateTime85 = property81.withMinimumValue();
        org.joda.time.LocalDateTime.Property property86 = localDateTime85.millisOfDay();
        org.joda.time.LocalDateTime localDateTime88 = property86.addToCopy((long) 279);
        org.joda.time.LocalDateTime localDateTime90 = localDateTime88.plusYears((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime92 = localDateTime88.minusHours(20);
        boolean boolean93 = property71.equals((java.lang.Object) localDateTime92);
        org.joda.time.LocalDateTime localDateTime95 = localDateTime92.withMinuteOfHour(24);
        int[] intArray97 = copticChronology37.get((org.joda.time.ReadablePartial) localDateTime92, 3389481429574035456L);
        boolean boolean98 = dateTimeZone27.isLocalDateTimeGap(localDateTime92);
        org.joda.time.Chronology chronology99 = copticChronology1.withZone(dateTimeZone27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField7 and durationField39", Math.signum(durationField7.compareTo(durationField39)) == -Math.signum(durationField39.compareTo(durationField7)));
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test521");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = copticChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = copticChronology1.getZone();
        org.joda.time.LocalDateTime localDateTime6 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) copticChronology1);
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        org.joda.time.Chronology chronology9 = copticChronology1.withZone(dateTimeZone8);
        org.joda.time.DurationField durationField10 = copticChronology1.years();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology1.halfdayOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField10", (durationField3.compareTo(durationField10) == 0) == durationField3.equals(durationField10));
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test522");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray2 = localDateTime1.getFieldTypes();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfDay((int) (byte) 0);
        int int5 = localDateTime4.getYear();
        int int6 = localDateTime4.getEra();
        org.joda.time.LocalDateTime.Property property7 = localDateTime4.weekyear();
        java.lang.String str8 = property7.toString();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime(chronology9);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime10.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime10.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.DateTime dateTime18 = localDateTime16.toDateTime(readableInstant17);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime(chronology19);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime20.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime20.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime20.plusWeeks((int) (byte) 10);
        int int27 = localDateTime26.getMillisOfSecond();
        int int28 = localDateTime26.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime30 = localDateTime26.plusHours((int) (short) -1);
        org.joda.time.DurationFieldType durationFieldType31 = null;
        boolean boolean32 = localDateTime26.isSupported(durationFieldType31);
        org.joda.time.DateTime dateTime33 = localDateTime26.toDateTime();
        boolean boolean34 = dateTime18.isAfter((org.joda.time.ReadableInstant) dateTime33);
        org.joda.time.DateTimeZone dateTimeZone35 = dateTime33.getZone();
        org.joda.time.Instant instant36 = dateTime33.toInstant();
        int int37 = property7.getDifference((org.joda.time.ReadableInstant) instant36);
        org.joda.time.Instant instant38 = instant36.toInstant();
        java.util.TimeZone timeZone39 = null;
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.forTimeZone(timeZone39);
        java.lang.String str42 = dateTimeZone40.getNameKey((long) (byte) 0);
        org.joda.time.LocalDateTime localDateTime43 = new org.joda.time.LocalDateTime(dateTimeZone40);
        java.util.TimeZone timeZone44 = null;
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.forTimeZone(timeZone44);
        java.lang.String str47 = dateTimeZone45.getNameKey((long) (byte) 0);
        org.joda.time.LocalDateTime localDateTime48 = new org.joda.time.LocalDateTime(dateTimeZone45);
        boolean boolean49 = localDateTime43.isEqual((org.joda.time.ReadablePartial) localDateTime48);
        org.joda.time.LocalDateTime localDateTime51 = localDateTime48.plusWeeks(0);
        org.joda.time.LocalDateTime localDateTime53 = localDateTime48.withDayOfMonth(26);
        org.joda.time.DateTimeZone dateTimeZone54 = null;
        org.joda.time.chrono.CopticChronology copticChronology55 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone54);
        org.joda.time.DateTimeField dateTimeField56 = copticChronology55.hourOfDay();
        org.joda.time.DateTimeField dateTimeField57 = copticChronology55.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone58 = null;
        org.joda.time.Chronology chronology59 = copticChronology55.withZone(dateTimeZone58);
        org.joda.time.DateTimeField dateTimeField60 = copticChronology55.millisOfSecond();
        org.joda.time.Chronology chronology61 = null;
        org.joda.time.LocalDateTime localDateTime62 = new org.joda.time.LocalDateTime(chronology61);
        org.joda.time.LocalDateTime localDateTime64 = localDateTime62.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime66 = localDateTime62.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime68 = localDateTime62.withYearOfCentury(0);
        org.joda.time.LocalDateTime.Property property69 = localDateTime68.weekyear();
        org.joda.time.LocalDateTime localDateTime71 = property69.setCopy((int) (byte) 1);
        org.joda.time.DurationField durationField72 = property69.getLeapDurationField();
        org.joda.time.LocalDateTime localDateTime73 = property69.getLocalDateTime();
        org.joda.time.LocalDateTime.Property property74 = localDateTime73.weekOfWeekyear();
        int int75 = dateTimeField60.getMaximumValue((org.joda.time.ReadablePartial) localDateTime73);
        org.joda.time.DateTimeFieldType dateTimeFieldType76 = dateTimeField60.getType();
        int int77 = localDateTime48.get(dateTimeFieldType76);
        int int78 = instant38.get(dateTimeFieldType76);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime33 and instant38", (dateTime33.compareTo(instant38) == 0) == dateTime33.equals(instant38));
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test523");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.CopticChronology copticChronology2 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology2.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology2.weekyearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone6);
        org.joda.time.DateTimeField dateTimeField8 = copticChronology7.clockhourOfDay();
        java.util.Locale locale10 = java.util.Locale.ITALIAN;
        java.lang.String str11 = dateTimeField8.getAsText((long) 'a', locale10);
        java.lang.String str12 = dateTimeField4.getAsText((int) 'a', locale10);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.chrono.CopticChronology copticChronology14 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone13);
        org.joda.time.DateTimeField dateTimeField15 = copticChronology14.clockhourOfDay();
        org.joda.time.DurationField durationField16 = copticChronology14.weekyears();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology14.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.chrono.CopticChronology copticChronology19 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone18);
        org.joda.time.DateTimeField dateTimeField20 = copticChronology19.clockhourOfDay();
        java.util.Locale locale22 = java.util.Locale.ITALIAN;
        java.lang.String str23 = dateTimeField20.getAsText((long) 'a', locale22);
        int int24 = dateTimeField17.getMaximumTextLength(locale22);
        java.lang.String str25 = locale10.getDisplayCountry(locale22);
        java.util.Locale.Builder builder26 = builder0.setLocale(locale22);
        java.util.Locale.Builder builder28 = builder0.setRegion("");
        java.util.Locale locale29 = builder0.build();
        java.util.Locale.Builder builder30 = builder0.clearExtensions();
        java.util.Locale.Builder builder31 = builder30.clear();
        java.util.Locale locale32 = java.util.Locale.GERMANY;
        java.lang.String str33 = locale32.getScript();
        java.lang.String str34 = locale32.getScript();
        java.lang.String str35 = locale32.getDisplayCountry();
        java.lang.String str36 = locale32.getISO3Language();
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.chrono.CopticChronology copticChronology38 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone37);
        org.joda.time.DateTimeField dateTimeField39 = copticChronology38.hourOfDay();
        org.joda.time.DurationField durationField40 = copticChronology38.eras();
        org.joda.time.DateTimeField dateTimeField41 = copticChronology38.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField42 = copticChronology38.monthOfYear();
        java.util.Locale locale44 = java.util.Locale.GERMANY;
        java.lang.String str45 = locale44.getScript();
        java.lang.String str46 = dateTimeField42.getAsText(10598050431849L, locale44);
        java.lang.String str47 = locale32.getDisplayVariant(locale44);
        java.util.Set<java.lang.Character> charSet48 = locale44.getExtensionKeys();
        java.util.Locale.Builder builder49 = builder31.setLocale(locale44);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField16 and durationField40", Math.signum(durationField16.compareTo(durationField40)) == -Math.signum(durationField40.compareTo(durationField16)));
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test524");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology1.secondOfDay();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology1.secondOfDay();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology1.centuryOfEra();
        org.joda.time.DurationField durationField6 = copticChronology1.months();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology1.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology1.millisOfSecond();
        org.joda.time.DurationField durationField9 = copticChronology1.hours();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology1.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology1.dayOfYear();
        org.joda.time.DurationField durationField12 = copticChronology1.years();
        org.joda.time.DurationField durationField13 = copticChronology1.hours();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology1.clockhourOfDay();
        java.lang.Object obj15 = null;
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.chrono.CopticChronology copticChronology17 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone16);
        org.joda.time.DateTimeField dateTimeField18 = copticChronology17.clockhourOfDay();
        org.joda.time.DurationField durationField19 = copticChronology17.weekyears();
        org.joda.time.DurationField durationField20 = copticChronology17.centuries();
        org.joda.time.DateTimeField dateTimeField21 = copticChronology17.weekyear();
        org.joda.time.DateTimeZone dateTimeZone22 = copticChronology17.getZone();
        java.lang.String str24 = dateTimeZone22.getName((long) 53);
        java.lang.String str26 = dateTimeZone22.getShortName((-3600001L));
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime(obj15, dateTimeZone22);
        org.joda.time.Chronology chronology28 = copticChronology1.withZone(dateTimeZone22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField12 and durationField19", (durationField12.compareTo(durationField19) == 0) == durationField12.equals(durationField19));
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test525");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = copticChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = copticChronology1.getZone();
        org.joda.time.LocalDateTime localDateTime6 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) copticChronology1);
        org.joda.time.DurationField durationField7 = copticChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology1.hourOfHalfday();
        org.joda.time.DurationField durationField9 = copticChronology1.hours();
        org.joda.time.DurationField durationField10 = copticChronology1.minutes();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology1.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology1.weekyearOfCentury();
        org.joda.time.DurationField durationField13 = copticChronology1.millis();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology1.yearOfCentury();
        org.joda.time.DurationField durationField15 = copticChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField15, durationField3, and durationField9", !(durationField15.compareTo(durationField3) == 0) || (Math.signum(durationField15.compareTo(durationField9)) == Math.signum(durationField3.compareTo(durationField9))));
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test526");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology1.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.Chronology chronology5 = copticChronology1.withZone(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.millisOfSecond();
        org.joda.time.DurationField durationField7 = copticChronology1.hours();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology1.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.chrono.CopticChronology copticChronology10 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField11 = copticChronology10.hourOfDay();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology10.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.Chronology chronology14 = copticChronology10.withZone(dateTimeZone13);
        org.joda.time.DateTimeField dateTimeField15 = copticChronology10.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology10.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone17 = copticChronology10.getZone();
        org.joda.time.DurationField durationField18 = copticChronology10.eras();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime(chronology19);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime20.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime20.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime20.plusWeeks((int) (byte) 10);
        int int27 = localDateTime26.getMillisOfSecond();
        int int28 = localDateTime26.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime30 = localDateTime26.plusHours((int) (short) -1);
        org.joda.time.DurationFieldType durationFieldType31 = null;
        boolean boolean32 = localDateTime26.isSupported(durationFieldType31);
        int[] intArray34 = copticChronology10.get((org.joda.time.ReadablePartial) localDateTime26, (long) 761);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime26.minusYears(373);
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.LocalDateTime localDateTime38 = new org.joda.time.LocalDateTime(chronology37);
        org.joda.time.LocalDateTime localDateTime40 = localDateTime38.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime42 = localDateTime38.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime44 = localDateTime38.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.DateTime dateTime46 = localDateTime44.toDateTime(readableInstant45);
        org.joda.time.LocalDateTime.Property property47 = localDateTime44.millisOfDay();
        org.joda.time.LocalDateTime localDateTime49 = localDateTime44.plusMonths(999);
        org.joda.time.ReadablePeriod readablePeriod50 = null;
        org.joda.time.LocalDateTime localDateTime52 = localDateTime49.withPeriodAdded(readablePeriod50, 100);
        int[] intArray53 = localDateTime52.getValues();
        int int54 = dateTimeField8.getMaximumValue((org.joda.time.ReadablePartial) localDateTime26, intArray53);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField7 and durationField18", Math.signum(durationField7.compareTo(durationField18)) == -Math.signum(durationField18.compareTo(durationField7)));
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test527");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.dayOfMonth();
        org.joda.time.DurationField durationField3 = copticChronology1.eras();
        java.lang.String str4 = copticChronology1.toString();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology1.minuteOfHour();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime7.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime7.withYearOfCentury(0);
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.weekyear();
        org.joda.time.LocalDateTime localDateTime16 = property14.setCopy((int) (byte) 1);
        org.joda.time.DurationField durationField17 = property14.getLeapDurationField();
        org.joda.time.LocalDateTime localDateTime18 = property14.getLocalDateTime();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.plusWeeks(522);
        org.joda.time.LocalDateTime.Property property21 = localDateTime18.hourOfDay();
        java.lang.String str22 = localDateTime18.toString();
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime(chronology23);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime24.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime24.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime24.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.DateTime dateTime32 = localDateTime30.toDateTime(readableInstant31);
        org.joda.time.LocalDateTime.Property property33 = localDateTime30.millisOfDay();
        org.joda.time.LocalDateTime localDateTime34 = property33.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime35 = property33.roundHalfEvenCopy();
        int int36 = localDateTime18.compareTo((org.joda.time.ReadablePartial) localDateTime35);
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.chrono.CopticChronology copticChronology38 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone37);
        org.joda.time.DateTimeField dateTimeField39 = copticChronology38.clockhourOfDay();
        org.joda.time.DurationField durationField40 = copticChronology38.weekyears();
        org.joda.time.DurationField durationField41 = copticChronology38.centuries();
        org.joda.time.DateTimeField dateTimeField42 = copticChronology38.weekyear();
        org.joda.time.DateTimeZone dateTimeZone43 = copticChronology38.getZone();
        java.lang.String str45 = dateTimeZone43.getName((long) 53);
        org.joda.time.chrono.CopticChronology copticChronology46 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone43);
        org.joda.time.LocalDateTime localDateTime47 = org.joda.time.LocalDateTime.now(dateTimeZone43);
        org.joda.time.LocalDateTime.Property property48 = localDateTime47.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.chrono.CopticChronology copticChronology50 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone49);
        org.joda.time.DateTimeField dateTimeField51 = copticChronology50.hourOfDay();
        org.joda.time.DateTimeField dateTimeField52 = copticChronology50.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone53 = null;
        org.joda.time.Chronology chronology54 = copticChronology50.withZone(dateTimeZone53);
        org.joda.time.DateTimeField dateTimeField55 = copticChronology50.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField56 = copticChronology50.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField57 = copticChronology50.year();
        org.joda.time.DateTimeField dateTimeField58 = copticChronology50.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField59 = copticChronology50.yearOfEra();
        org.joda.time.DateTimeField dateTimeField60 = copticChronology50.year();
        org.joda.time.DurationField durationField61 = copticChronology50.seconds();
        org.joda.time.DurationFieldType durationFieldType62 = durationField61.getType();
        boolean boolean63 = localDateTime47.isSupported(durationFieldType62);
        boolean boolean64 = localDateTime35.isSupported(durationFieldType62);
        int[] intArray66 = copticChronology1.get((org.joda.time.ReadablePartial) localDateTime35, 36000022L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField17", Math.signum(durationField3.compareTo(durationField17)) == -Math.signum(durationField17.compareTo(durationField3)));
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test528");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology1.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology1.dayOfWeek();
        org.joda.time.DurationField durationField5 = copticChronology1.eras();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology1.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.chrono.CopticChronology copticChronology9 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone8);
        org.joda.time.DateTimeField dateTimeField10 = copticChronology9.clockhourOfDay();
        org.joda.time.DurationField durationField11 = copticChronology9.weekyears();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology9.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone13 = copticChronology9.getZone();
        org.joda.time.LocalDateTime localDateTime14 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) copticChronology9);
        org.joda.time.DurationField durationField15 = copticChronology9.weekyears();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(chronology16);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime17.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime.Property property22 = localDateTime21.dayOfWeek();
        int[] intArray24 = copticChronology9.get((org.joda.time.ReadablePartial) localDateTime21, 0L);
        int int25 = localDateTime21.size();
        org.joda.time.LocalDateTime localDateTime27 = localDateTime21.minusMillis((-292275054));
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.chrono.CopticChronology copticChronology29 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone28);
        org.joda.time.DateTimeField dateTimeField30 = copticChronology29.hourOfDay();
        org.joda.time.DateTimeField dateTimeField31 = copticChronology29.centuryOfEra();
        org.joda.time.DurationField durationField32 = copticChronology29.millis();
        org.joda.time.DateTimeField dateTimeField33 = copticChronology29.weekOfWeekyear();
        boolean boolean34 = dateTimeField33.isSupported();
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.LocalDateTime localDateTime36 = new org.joda.time.LocalDateTime(chronology35);
        org.joda.time.LocalDateTime localDateTime38 = localDateTime36.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime40 = localDateTime36.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime42 = localDateTime36.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant43 = null;
        org.joda.time.DateTime dateTime44 = localDateTime42.toDateTime(readableInstant43);
        java.util.Locale locale45 = java.util.Locale.GERMANY;
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.chrono.CopticChronology copticChronology47 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone46);
        org.joda.time.DateTimeField dateTimeField48 = copticChronology47.clockhourOfDay();
        org.joda.time.DurationField durationField49 = copticChronology47.weekyears();
        org.joda.time.DateTimeField dateTimeField50 = copticChronology47.clockhourOfDay();
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.LocalDateTime localDateTime52 = new org.joda.time.LocalDateTime(chronology51);
        org.joda.time.LocalDateTime localDateTime54 = localDateTime52.plusWeeks((int) (byte) -1);
        java.util.Locale locale56 = java.util.Locale.GERMANY;
        java.lang.String str57 = locale56.getScript();
        org.joda.time.DateTimeZone dateTimeZone58 = null;
        org.joda.time.chrono.CopticChronology copticChronology59 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone58);
        org.joda.time.DateTimeField dateTimeField60 = copticChronology59.clockhourOfDay();
        java.util.Locale locale62 = java.util.Locale.ITALIAN;
        java.lang.String str63 = dateTimeField60.getAsText((long) 'a', locale62);
        java.lang.String str64 = locale56.getDisplayName(locale62);
        java.lang.String str65 = dateTimeField50.getAsShortText((org.joda.time.ReadablePartial) localDateTime54, (int) ' ', locale62);
        java.lang.String str66 = locale45.getDisplayName(locale62);
        java.lang.String str67 = dateTimeField33.getAsText((org.joda.time.ReadablePartial) localDateTime42, locale45);
        java.lang.String str68 = locale45.toLanguageTag();
        java.lang.String str69 = dateTimeField7.getAsText((org.joda.time.ReadablePartial) localDateTime27, locale45);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField5 and durationField11", Math.signum(durationField5.compareTo(durationField11)) == -Math.signum(durationField11.compareTo(durationField5)));
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test529");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.weekOfWeekyear();
        java.lang.String str5 = property4.getAsText();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.weekOfWeekyear();
        org.joda.time.LocalDateTime.Property property11 = localDateTime9.centuryOfEra();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime(chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime13.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime13.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.DateTime dateTime21 = localDateTime19.toDateTime(readableInstant20);
        java.util.Locale locale22 = java.util.Locale.GERMANY;
        boolean boolean23 = locale22.hasExtensions();
        boolean boolean24 = dateTime21.equals((java.lang.Object) locale22);
        int int25 = property11.getDifference((org.joda.time.ReadableInstant) dateTime21);
        int int26 = property4.compareTo((org.joda.time.ReadableInstant) dateTime21);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime(chronology27);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime28.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime28.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime28.withYearOfCentury(0);
        org.joda.time.LocalDateTime.Property property35 = localDateTime34.weekyear();
        org.joda.time.LocalDateTime localDateTime37 = property35.setCopy((int) (byte) 1);
        long long38 = property35.remainder();
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.LocalDateTime localDateTime40 = new org.joda.time.LocalDateTime(chronology39);
        org.joda.time.LocalDateTime localDateTime42 = localDateTime40.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime44 = localDateTime40.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime46 = localDateTime40.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.DateTime dateTime48 = localDateTime46.toDateTime(readableInstant47);
        org.joda.time.LocalDateTime.Property property49 = localDateTime46.millisOfDay();
        int int50 = property35.compareTo((org.joda.time.ReadablePartial) localDateTime46);
        boolean boolean52 = property35.equals((java.lang.Object) 126L);
        org.joda.time.DateTimeFieldType dateTimeFieldType53 = property35.getFieldType();
        boolean boolean54 = dateTime21.isSupported(dateTimeFieldType53);
        org.joda.time.Instant instant55 = dateTime21.toInstant();
        org.joda.time.DateTimeZone dateTimeZone56 = dateTime21.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime48 and instant55", (dateTime48.compareTo(instant55) == 0) == dateTime48.equals(instant55));
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test530");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology1.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.Chronology chronology5 = copticChronology1.withZone(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology1.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone8 = copticChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology1.dayOfWeek();
        org.joda.time.DurationField durationField10 = copticChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology1.halfdayOfDay();
        org.joda.time.DurationField durationField12 = copticChronology1.years();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology1.weekOfWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField10 and durationField12", (durationField10.compareTo(durationField12) == 0) == durationField10.equals(durationField12));
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test531");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology1.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.Chronology chronology5 = copticChronology1.withZone(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology1.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone8 = copticChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology1.dayOfWeek();
        org.joda.time.DurationField durationField10 = copticChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology1.halfdayOfDay();
        org.joda.time.DurationField durationField12 = copticChronology1.years();
        org.joda.time.DateTimeZone dateTimeZone13 = copticChronology1.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField10 and durationField12", (durationField10.compareTo(durationField12) == 0) == durationField10.equals(durationField12));
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test532");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology1.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology1.dayOfWeek();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(chronology5);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray7 = localDateTime6.getFieldTypes();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.withMillisOfDay((int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.plusWeeks((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.chrono.CopticChronology copticChronology14 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone13);
        org.joda.time.DateTimeField dateTimeField15 = copticChronology14.hourOfDay();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology14.secondOfDay();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology14.secondOfDay();
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime((long) 10, (org.joda.time.Chronology) copticChronology14);
        int int19 = localDateTime18.getDayOfYear();
        boolean boolean20 = localDateTime11.isEqual((org.joda.time.ReadablePartial) localDateTime18);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.chrono.CopticChronology copticChronology22 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone21);
        org.joda.time.DateTimeField dateTimeField23 = copticChronology22.hourOfDay();
        org.joda.time.DateTimeField dateTimeField24 = copticChronology22.centuryOfEra();
        org.joda.time.DurationField durationField25 = copticChronology22.millis();
        org.joda.time.DateTimeField dateTimeField26 = copticChronology22.weekOfWeekyear();
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime(chronology27);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime28.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime28.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime28.plusWeeks((int) (byte) 10);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.LocalDateTime localDateTime36 = new org.joda.time.LocalDateTime(chronology35);
        org.joda.time.LocalDateTime localDateTime38 = localDateTime36.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime40 = localDateTime36.withMillisOfSecond((int) (byte) 1);
        int int41 = localDateTime28.compareTo((org.joda.time.ReadablePartial) localDateTime36);
        org.joda.time.LocalDateTime.Property property42 = localDateTime36.weekyear();
        org.joda.time.LocalDateTime localDateTime44 = localDateTime36.minusMillis(2022);
        int[] intArray46 = copticChronology22.get((org.joda.time.ReadablePartial) localDateTime36, (long) '#');
        int int47 = dateTimeField4.getMinimumValue((org.joda.time.ReadablePartial) localDateTime18, intArray46);
        int int48 = localDateTime18.getMinuteOfHour();
        int int49 = localDateTime18.getHourOfDay();
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.LocalDateTime localDateTime51 = new org.joda.time.LocalDateTime(chronology50);
        org.joda.time.LocalDateTime localDateTime53 = localDateTime51.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime.Property property54 = localDateTime53.weekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod55 = null;
        org.joda.time.LocalDateTime localDateTime57 = localDateTime53.withPeriodAdded(readablePeriod55, 8);
        boolean boolean58 = localDateTime18.isAfter((org.joda.time.ReadablePartial) localDateTime57);
        org.joda.time.LocalDateTime.Property property59 = localDateTime57.hourOfDay();
        org.joda.time.DurationField durationField60 = property59.getDurationField();
        org.joda.time.LocalDateTime localDateTime61 = property59.roundHalfFloorCopy();
        java.lang.String str62 = property59.getAsShortText();
        org.joda.time.DateTimeZone dateTimeZone63 = null;
        org.joda.time.chrono.CopticChronology copticChronology64 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone63);
        org.joda.time.DateTimeField dateTimeField65 = copticChronology64.clockhourOfDay();
        org.joda.time.DurationField durationField66 = copticChronology64.weekyears();
        org.joda.time.DurationField durationField67 = copticChronology64.hours();
        int int68 = copticChronology64.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField69 = copticChronology64.monthOfYear();
        org.joda.time.DurationField durationField70 = copticChronology64.seconds();
        org.joda.time.DurationField durationField71 = copticChronology64.weekyears();
        org.joda.time.DateTimeField dateTimeField72 = copticChronology64.millisOfDay();
        org.joda.time.DateTimeField dateTimeField73 = copticChronology64.dayOfYear();
        int int74 = copticChronology64.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField75 = copticChronology64.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField76 = copticChronology64.dayOfWeek();
        java.util.Locale locale79 = java.util.Locale.forLanguageTag("DurationField[weekyears]");
        java.util.Set<java.lang.String> strSet80 = locale79.getUnicodeLocaleAttributes();
        java.util.Locale locale81 = locale79.stripExtensions();
        java.lang.String str82 = dateTimeField76.getAsText(0, locale79);
        java.lang.String str83 = locale79.getScript();
        int int84 = property59.getMaximumTextLength(locale79);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField60 and durationField67", (durationField60.compareTo(durationField67) == 0) == durationField60.equals(durationField67));
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test533");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology1.secondOfDay();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology1.secondOfDay();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology1.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone6);
        org.joda.time.DateTimeField dateTimeField8 = copticChronology7.clockhourOfDay();
        org.joda.time.DurationField durationField9 = copticChronology7.weekyears();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology7.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.chrono.CopticChronology copticChronology12 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone11);
        org.joda.time.DateTimeField dateTimeField13 = copticChronology12.clockhourOfDay();
        java.util.Locale locale15 = java.util.Locale.ITALIAN;
        java.lang.String str16 = dateTimeField13.getAsText((long) 'a', locale15);
        int int17 = dateTimeField10.getMaximumTextLength(locale15);
        int int19 = dateTimeField10.getMinimumValue((-3600001L));
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime(chronology20);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime.Property property24 = localDateTime23.weekOfWeekyear();
        org.joda.time.LocalDateTime.Property property25 = localDateTime23.centuryOfEra();
        java.lang.String str26 = localDateTime23.toString();
        java.util.Locale locale28 = java.util.Locale.ENGLISH;
        java.lang.String str29 = dateTimeField10.getAsShortText((org.joda.time.ReadablePartial) localDateTime23, (-292275054), locale28);
        org.joda.time.ReadableDuration readableDuration30 = null;
        org.joda.time.LocalDateTime localDateTime32 = localDateTime23.withDurationAdded(readableDuration30, 22);
        java.util.Date date33 = localDateTime23.toDate();
        org.joda.time.LocalDateTime localDateTime34 = org.joda.time.LocalDateTime.fromDateFields(date33);
        long long36 = copticChronology1.set((org.joda.time.ReadablePartial) localDateTime34, (long) 8);
        org.joda.time.DurationField durationField37 = copticChronology1.millis();
        org.joda.time.DateTimeField dateTimeField38 = copticChronology1.era();
        org.joda.time.DateTimeField dateTimeField39 = copticChronology1.era();
        org.joda.time.DurationField durationField40 = copticChronology1.years();
        org.joda.time.Chronology chronology41 = copticChronology1.withUTC();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField9 and durationField40", (durationField9.compareTo(durationField40) == 0) == durationField9.equals(durationField40));
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test534");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology1.centuryOfEra();
        org.joda.time.DurationField durationField4 = copticChronology1.millis();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology1.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.clockhourOfDay();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((org.joda.time.Chronology) copticChronology1);
        org.joda.time.DateTimeField dateTimeField8 = copticChronology1.yearOfEra();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology1.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.chrono.CopticChronology copticChronology11 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone10);
        org.joda.time.DateTimeField dateTimeField12 = copticChronology11.dayOfMonth();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(chronology13);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime14.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime14.plusWeeks((int) (byte) 10);
        java.util.Locale locale21 = java.util.Locale.PRC;
        java.lang.String str22 = dateTimeField12.getAsText((org.joda.time.ReadablePartial) localDateTime20, locale21);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.LocalDateTime localDateTime24 = localDateTime20.plus(readablePeriod23);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime20.withCenturyOfEra(522);
        org.joda.time.LocalDateTime.Property property27 = localDateTime20.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.chrono.CopticChronology copticChronology29 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone28);
        org.joda.time.DateTimeField dateTimeField30 = copticChronology29.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField31 = copticChronology29.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone32 = copticChronology29.getZone();
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.chrono.CopticChronology copticChronology34 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone33);
        org.joda.time.DateTimeField dateTimeField35 = copticChronology34.hourOfDay();
        org.joda.time.DateTimeField dateTimeField36 = copticChronology34.dayOfMonth();
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.LocalDateTime localDateTime38 = new org.joda.time.LocalDateTime(chronology37);
        org.joda.time.LocalDateTime localDateTime40 = localDateTime38.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime42 = localDateTime38.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime44 = localDateTime38.withYearOfCentury(0);
        org.joda.time.LocalDateTime.Property property45 = localDateTime44.weekyear();
        org.joda.time.LocalDateTime localDateTime47 = property45.setCopy((int) (byte) 1);
        long long48 = property45.remainder();
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.LocalDateTime localDateTime50 = new org.joda.time.LocalDateTime(chronology49);
        org.joda.time.LocalDateTime localDateTime52 = localDateTime50.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime54 = localDateTime50.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime56 = localDateTime50.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant57 = null;
        org.joda.time.DateTime dateTime58 = localDateTime56.toDateTime(readableInstant57);
        org.joda.time.LocalDateTime.Property property59 = localDateTime56.millisOfDay();
        int int60 = property45.compareTo((org.joda.time.ReadablePartial) localDateTime56);
        int int61 = dateTimeField36.getMaximumValue((org.joda.time.ReadablePartial) localDateTime56);
        org.joda.time.LocalDateTime localDateTime63 = localDateTime56.plusMonths((int) (byte) 10);
        org.joda.time.Chronology chronology64 = null;
        org.joda.time.LocalDateTime localDateTime65 = new org.joda.time.LocalDateTime(chronology64);
        org.joda.time.LocalDateTime localDateTime67 = localDateTime65.minusSeconds((int) (short) -1);
        int[] intArray68 = localDateTime67.getValues();
        copticChronology29.validate((org.joda.time.ReadablePartial) localDateTime63, intArray68);
        copticChronology1.validate((org.joda.time.ReadablePartial) localDateTime20, intArray68);
        org.joda.time.DateTimeField dateTimeField71 = copticChronology1.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone72 = copticChronology1.getZone();
        org.joda.time.DurationField durationField73 = copticChronology1.eras();
        org.joda.time.DateTimeField dateTimeField74 = copticChronology1.dayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField4 and durationField73", Math.signum(durationField4.compareTo(durationField73)) == -Math.signum(durationField73.compareTo(durationField4)));
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test535");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.DateTime dateTime9 = localDateTime7.toDateTime(readableInstant8);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(chronology10);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime11.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime11.plusWeeks((int) (byte) 10);
        int int18 = localDateTime17.getMillisOfSecond();
        int int19 = localDateTime17.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime17.plusHours((int) (short) -1);
        org.joda.time.DurationFieldType durationFieldType22 = null;
        boolean boolean23 = localDateTime17.isSupported(durationFieldType22);
        org.joda.time.DateTime dateTime24 = localDateTime17.toDateTime();
        boolean boolean25 = dateTime9.isAfter((org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime(chronology26);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime27.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime27.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.DateTime dateTime35 = localDateTime33.toDateTime(readableInstant34);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime(chronology36);
        org.joda.time.LocalDateTime localDateTime39 = localDateTime37.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime41 = localDateTime37.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime43 = localDateTime37.plusWeeks((int) (byte) 10);
        int int44 = localDateTime43.getMillisOfSecond();
        int int45 = localDateTime43.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime47 = localDateTime43.plusHours((int) (short) -1);
        org.joda.time.DurationFieldType durationFieldType48 = null;
        boolean boolean49 = localDateTime43.isSupported(durationFieldType48);
        org.joda.time.DateTime dateTime50 = localDateTime43.toDateTime();
        boolean boolean51 = dateTime35.isAfter((org.joda.time.ReadableInstant) dateTime50);
        org.joda.time.Instant instant52 = dateTime35.toInstant();
        long long53 = dateTime35.getMillis();
        boolean boolean54 = dateTime24.isEqual((org.joda.time.ReadableInstant) dateTime35);
        org.joda.time.Chronology chronology55 = dateTime35.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and instant52", (dateTime9.compareTo(instant52) == 0) == dateTime9.equals(instant52));
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test536");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.plusWeeks((int) (byte) 10);
        int int8 = localDateTime7.getMillisOfSecond();
        int int9 = localDateTime7.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property10 = localDateTime7.secondOfMinute();
        boolean boolean11 = property10.isLeap();
        org.joda.time.LocalDateTime localDateTime12 = property10.roundHalfFloorCopy();
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.monthOfYear();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime(chronology14);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime15.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.withMillisOfSecond((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime19.withMinuteOfHour(10);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime19.minusDays(0);
        int int26 = localDateTime25.getHourOfDay();
        org.joda.time.DateTime dateTime27 = localDateTime25.toDateTime();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime(chronology28);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime29.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime29.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime35 = localDateTime29.withYearOfCentury(0);
        org.joda.time.LocalDateTime.Property property36 = localDateTime35.weekyear();
        org.joda.time.LocalDateTime localDateTime38 = property36.setCopy((int) (byte) 1);
        org.joda.time.DurationField durationField39 = property36.getLeapDurationField();
        org.joda.time.LocalDateTime localDateTime40 = property36.getLocalDateTime();
        org.joda.time.LocalDateTime.Property property41 = localDateTime40.weekOfWeekyear();
        org.joda.time.ReadableInstant readableInstant42 = null;
        org.joda.time.DateTime dateTime43 = localDateTime40.toDateTime(readableInstant42);
        org.joda.time.Instant instant44 = dateTime43.toInstant();
        boolean boolean45 = dateTime27.isAfter((org.joda.time.ReadableInstant) instant44);
        long long46 = property13.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime43 and instant44", (dateTime43.compareTo(instant44) == 0) == dateTime43.equals(instant44));
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test537");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology1.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.Chronology chronology5 = copticChronology1.withZone(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology1.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology1.year();
        org.joda.time.DurationField durationField9 = copticChronology1.years();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology1.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology1.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology1.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.chrono.CopticChronology copticChronology15 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone14);
        org.joda.time.DateTimeField dateTimeField16 = copticChronology15.clockhourOfDay();
        org.joda.time.DurationField durationField17 = copticChronology15.weekyears();
        org.joda.time.DurationField durationField18 = copticChronology15.hours();
        org.joda.time.DateTimeField dateTimeField19 = copticChronology15.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone20 = copticChronology15.getZone();
        org.joda.time.DateTimeZone dateTimeZone21 = copticChronology15.getZone();
        org.joda.time.DurationField durationField22 = copticChronology15.months();
        org.joda.time.DateTimeField dateTimeField23 = copticChronology15.dayOfMonth();
        long long25 = dateTimeField23.roundHalfCeiling((long) 73446480);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.chrono.CopticChronology copticChronology28 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone27);
        org.joda.time.DateTimeField dateTimeField29 = copticChronology28.clockhourOfDay();
        org.joda.time.DurationField durationField30 = copticChronology28.weekyears();
        org.joda.time.DateTimeField dateTimeField31 = copticChronology28.clockhourOfDay();
        int int32 = dateTimeField31.getMaximumValue();
        long long35 = dateTimeField31.addWrapField((long) 22, 10);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime(chronology36);
        org.joda.time.LocalDateTime localDateTime39 = localDateTime37.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime.Property property40 = localDateTime39.weekOfWeekyear();
        org.joda.time.LocalDateTime.Property property41 = localDateTime39.centuryOfEra();
        java.util.Locale locale42 = java.util.Locale.GERMANY;
        java.lang.String str43 = locale42.getScript();
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.chrono.CopticChronology copticChronology45 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone44);
        org.joda.time.DateTimeField dateTimeField46 = copticChronology45.clockhourOfDay();
        java.util.Locale locale48 = java.util.Locale.ITALIAN;
        java.lang.String str49 = dateTimeField46.getAsText((long) 'a', locale48);
        java.lang.String str50 = locale42.getDisplayName(locale48);
        java.lang.String str51 = locale48.getISO3Language();
        boolean boolean52 = locale48.hasExtensions();
        java.util.Locale locale53 = locale48.stripExtensions();
        java.lang.String str54 = dateTimeField31.getAsShortText((org.joda.time.ReadablePartial) localDateTime39, locale53);
        java.lang.String str55 = dateTimeField23.getAsText(53661664L, locale53);
        java.lang.String str56 = dateTimeField12.getAsText(4287669216L, locale53);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField9 and durationField17", (durationField9.compareTo(durationField17) == 0) == durationField9.equals(durationField17));
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test538");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.hourOfDay();
        org.joda.time.DurationField durationField3 = copticChronology1.eras();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology1.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology1.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone6 = copticChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology1.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone8 = copticChronology1.getZone();
        org.joda.time.DateTimeZone dateTimeZone9 = copticChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology1.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.chrono.CopticChronology copticChronology12 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone11);
        org.joda.time.DateTimeField dateTimeField13 = copticChronology12.clockhourOfDay();
        org.joda.time.DurationField durationField14 = copticChronology12.weekyears();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology12.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.chrono.CopticChronology copticChronology17 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone16);
        org.joda.time.DateTimeField dateTimeField18 = copticChronology17.clockhourOfDay();
        java.util.Locale locale20 = java.util.Locale.ITALIAN;
        java.lang.String str21 = dateTimeField18.getAsText((long) 'a', locale20);
        int int22 = dateTimeField15.getMaximumTextLength(locale20);
        int int24 = dateTimeField15.getMinimumValue((-3600001L));
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime(chronology25);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime26.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime.Property property29 = localDateTime28.weekOfWeekyear();
        org.joda.time.LocalDateTime.Property property30 = localDateTime28.centuryOfEra();
        java.lang.String str31 = localDateTime28.toString();
        java.util.Locale locale33 = java.util.Locale.ENGLISH;
        java.lang.String str34 = dateTimeField15.getAsShortText((org.joda.time.ReadablePartial) localDateTime28, (-292275054), locale33);
        java.lang.String str35 = localDateTime28.toString();
        int int36 = localDateTime28.getMonthOfYear();
        org.joda.time.LocalDateTime localDateTime38 = localDateTime28.minusWeeks(360000000);
        org.joda.time.LocalDateTime localDateTime40 = localDateTime38.minusHours(53693);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray41 = localDateTime40.getFieldTypes();
        org.joda.time.LocalDateTime localDateTime43 = localDateTime40.minusYears(503);
        int int44 = dateTimeField10.getMinimumValue((org.joda.time.ReadablePartial) localDateTime40);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField14", Math.signum(durationField3.compareTo(durationField14)) == -Math.signum(durationField14.compareTo(durationField3)));
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test539");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.withYearOfCentury(0);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.weekyear();
        org.joda.time.LocalDateTime localDateTime10 = property8.setCopy((int) (byte) 1);
        org.joda.time.DurationField durationField11 = property8.getLeapDurationField();
        org.joda.time.LocalDateTime localDateTime12 = property8.getLocalDateTime();
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.weekOfWeekyear();
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.DateTime dateTime15 = localDateTime12.toDateTime(readableInstant14);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime((long) 26, dateTimeZone17);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime(chronology19);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime20.minusSeconds((int) (short) -1);
        int int23 = localDateTime20.size();
        org.joda.time.DateTime dateTime24 = localDateTime20.toDateTime();
        org.joda.time.DateTime dateTime25 = localDateTime18.toDateTime((org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime(chronology26);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime.Property property30 = localDateTime29.weekOfWeekyear();
        java.lang.String str31 = property30.getAsText();
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime(chronology32);
        org.joda.time.LocalDateTime localDateTime35 = localDateTime33.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime.Property property36 = localDateTime35.weekOfWeekyear();
        org.joda.time.LocalDateTime.Property property37 = localDateTime35.centuryOfEra();
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.LocalDateTime localDateTime39 = new org.joda.time.LocalDateTime(chronology38);
        org.joda.time.LocalDateTime localDateTime41 = localDateTime39.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime43 = localDateTime39.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime45 = localDateTime39.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant46 = null;
        org.joda.time.DateTime dateTime47 = localDateTime45.toDateTime(readableInstant46);
        java.util.Locale locale48 = java.util.Locale.GERMANY;
        boolean boolean49 = locale48.hasExtensions();
        boolean boolean50 = dateTime47.equals((java.lang.Object) locale48);
        int int51 = property37.getDifference((org.joda.time.ReadableInstant) dateTime47);
        int int52 = property30.compareTo((org.joda.time.ReadableInstant) dateTime47);
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.LocalDateTime localDateTime54 = new org.joda.time.LocalDateTime(chronology53);
        org.joda.time.LocalDateTime localDateTime56 = localDateTime54.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime58 = localDateTime54.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime60 = localDateTime54.withYearOfCentury(0);
        org.joda.time.LocalDateTime.Property property61 = localDateTime60.weekyear();
        org.joda.time.LocalDateTime localDateTime63 = property61.setCopy((int) (byte) 1);
        long long64 = property61.remainder();
        org.joda.time.Chronology chronology65 = null;
        org.joda.time.LocalDateTime localDateTime66 = new org.joda.time.LocalDateTime(chronology65);
        org.joda.time.LocalDateTime localDateTime68 = localDateTime66.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime70 = localDateTime66.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime72 = localDateTime66.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant73 = null;
        org.joda.time.DateTime dateTime74 = localDateTime72.toDateTime(readableInstant73);
        org.joda.time.LocalDateTime.Property property75 = localDateTime72.millisOfDay();
        int int76 = property61.compareTo((org.joda.time.ReadablePartial) localDateTime72);
        boolean boolean78 = property61.equals((java.lang.Object) 126L);
        org.joda.time.DateTimeFieldType dateTimeFieldType79 = property61.getFieldType();
        boolean boolean80 = dateTime47.isSupported(dateTimeFieldType79);
        int int81 = dateTime24.get(dateTimeFieldType79);
        org.joda.time.Instant instant82 = dateTime24.toInstant();
        boolean boolean83 = dateTime15.isAfter((org.joda.time.ReadableInstant) instant82);
        long long84 = dateTime15.getMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime24 and instant82", (dateTime24.compareTo(instant82) == 0) == dateTime24.equals(instant82));
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test540");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology1.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.Chronology chronology5 = copticChronology1.withZone(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology1.clockhourOfHalfday();
        org.joda.time.DurationField durationField8 = copticChronology1.days();
        long long14 = copticChronology1.getDateTimeMillis(14L, 0, 26, 59, 944);
        java.lang.String str15 = copticChronology1.toString();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology1.era();
        org.joda.time.DurationField durationField17 = copticChronology1.eras();
        org.joda.time.DateTimeField dateTimeField18 = copticChronology1.yearOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField8 and durationField17", Math.signum(durationField8.compareTo(durationField17)) == -Math.signum(durationField17.compareTo(durationField8)));
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test541");
        java.lang.Object obj1 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.chrono.CopticChronology copticChronology3 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = copticChronology3.clockhourOfDay();
        org.joda.time.DurationField durationField5 = copticChronology3.weekyears();
        org.joda.time.DurationField durationField6 = copticChronology3.centuries();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology3.weekyear();
        org.joda.time.DateTimeZone dateTimeZone8 = copticChronology3.getZone();
        java.lang.String str10 = dateTimeZone8.getName((long) 53);
        java.lang.String str12 = dateTimeZone8.getShortName((-3600001L));
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime(obj1, dateTimeZone8);
        org.joda.time.chrono.CopticChronology copticChronology14 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone8);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(chronology15);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray17 = localDateTime16.getFieldTypes();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.withMillisOfDay((int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.plusWeeks((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.chrono.CopticChronology copticChronology24 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField25 = copticChronology24.hourOfDay();
        org.joda.time.DateTimeField dateTimeField26 = copticChronology24.secondOfDay();
        org.joda.time.DateTimeField dateTimeField27 = copticChronology24.secondOfDay();
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime((long) 10, (org.joda.time.Chronology) copticChronology24);
        int int29 = localDateTime28.getDayOfYear();
        boolean boolean30 = localDateTime21.isEqual((org.joda.time.ReadablePartial) localDateTime28);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime(chronology31);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime32.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime32.withMillisOfSecond((int) (byte) 1);
        boolean boolean37 = localDateTime21.isAfter((org.joda.time.ReadablePartial) localDateTime32);
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.LocalDateTime localDateTime39 = new org.joda.time.LocalDateTime(chronology38);
        org.joda.time.LocalDateTime localDateTime41 = localDateTime39.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime.Property property42 = localDateTime41.weekOfWeekyear();
        org.joda.time.LocalDateTime.Property property43 = localDateTime41.centuryOfEra();
        boolean boolean44 = localDateTime32.equals((java.lang.Object) property43);
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.LocalDateTime localDateTime46 = new org.joda.time.LocalDateTime(chronology45);
        org.joda.time.LocalDateTime localDateTime48 = localDateTime46.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime50 = localDateTime46.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime52 = localDateTime46.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant53 = null;
        org.joda.time.DateTime dateTime54 = localDateTime52.toDateTime(readableInstant53);
        org.joda.time.LocalDateTime.Property property55 = localDateTime52.millisOfDay();
        org.joda.time.LocalDateTime localDateTime57 = localDateTime52.plusMonths(999);
        org.joda.time.Chronology chronology58 = null;
        org.joda.time.LocalDateTime localDateTime59 = new org.joda.time.LocalDateTime(chronology58);
        org.joda.time.LocalDateTime localDateTime61 = localDateTime59.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime63 = localDateTime59.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime65 = localDateTime59.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant66 = null;
        org.joda.time.DateTime dateTime67 = localDateTime65.toDateTime(readableInstant66);
        org.joda.time.Chronology chronology68 = null;
        org.joda.time.LocalDateTime localDateTime69 = new org.joda.time.LocalDateTime(chronology68);
        org.joda.time.LocalDateTime localDateTime71 = localDateTime69.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime73 = localDateTime69.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime75 = localDateTime69.plusWeeks((int) (byte) 10);
        int int76 = localDateTime75.getMillisOfSecond();
        int int77 = localDateTime75.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime79 = localDateTime75.plusHours((int) (short) -1);
        org.joda.time.DurationFieldType durationFieldType80 = null;
        boolean boolean81 = localDateTime75.isSupported(durationFieldType80);
        org.joda.time.DateTime dateTime82 = localDateTime75.toDateTime();
        boolean boolean83 = dateTime67.isAfter((org.joda.time.ReadableInstant) dateTime82);
        org.joda.time.DateTimeZone dateTimeZone84 = dateTime82.getZone();
        org.joda.time.DateTime dateTime85 = localDateTime52.toDateTime((org.joda.time.ReadableInstant) dateTime82);
        org.joda.time.Instant instant86 = dateTime82.toInstant();
        org.joda.time.DateTime dateTime87 = localDateTime32.toDateTime((org.joda.time.ReadableInstant) instant86);
        int int88 = dateTimeZone8.getOffset((org.joda.time.ReadableInstant) instant86);
        org.joda.time.LocalDateTime localDateTime89 = new org.joda.time.LocalDateTime(10598050581464L, dateTimeZone8);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime82 and instant86", (dateTime82.compareTo(instant86) == 0) == dateTime82.equals(instant86));
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test542");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology1.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.Chronology chronology5 = copticChronology1.withZone(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology1.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology1.year();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology1.minuteOfDay();
        org.joda.time.DurationField durationField10 = copticChronology1.centuries();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology1.hourOfHalfday();
        org.joda.time.DurationField durationField12 = copticChronology1.eras();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.chrono.CopticChronology copticChronology14 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone13);
        org.joda.time.DateTimeField dateTimeField15 = copticChronology14.clockhourOfDay();
        org.joda.time.DurationField durationField16 = copticChronology14.weekyears();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology14.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone18 = copticChronology14.getZone();
        org.joda.time.LocalDateTime localDateTime19 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) copticChronology14);
        org.joda.time.DurationField durationField20 = copticChronology14.weekyears();
        org.joda.time.DateTimeField dateTimeField21 = copticChronology14.hourOfHalfday();
        org.joda.time.DurationField durationField22 = copticChronology14.hours();
        java.util.TimeZone timeZone23 = null;
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forTimeZone(timeZone23);
        java.lang.String str26 = dateTimeZone24.getNameKey((long) (byte) 0);
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime(dateTimeZone24);
        java.util.TimeZone timeZone28 = null;
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forTimeZone(timeZone28);
        java.lang.String str31 = dateTimeZone29.getNameKey((long) (byte) 0);
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime(dateTimeZone29);
        boolean boolean33 = localDateTime27.isEqual((org.joda.time.ReadablePartial) localDateTime32);
        int[] intArray35 = copticChronology14.get((org.joda.time.ReadablePartial) localDateTime32, (long) 30);
        org.joda.time.LocalDateTime localDateTime37 = localDateTime32.minusSeconds((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime39 = localDateTime32.minusMillis(190);
        org.joda.time.LocalDateTime.Property property40 = localDateTime39.weekOfWeekyear();
        int int41 = property40.getMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.chrono.CopticChronology copticChronology44 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone43);
        org.joda.time.DateTimeField dateTimeField45 = copticChronology44.hourOfDay();
        org.joda.time.DateTimeField dateTimeField46 = copticChronology44.secondOfDay();
        org.joda.time.DateTimeField dateTimeField47 = copticChronology44.secondOfDay();
        org.joda.time.DateTimeField dateTimeField48 = copticChronology44.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField49 = copticChronology44.clockhourOfHalfday();
        org.joda.time.LocalDateTime localDateTime50 = new org.joda.time.LocalDateTime(1L, (org.joda.time.Chronology) copticChronology44);
        org.joda.time.LocalDateTime localDateTime52 = localDateTime50.withMillisOfDay(53807264);
        int int53 = property40.compareTo((org.joda.time.ReadablePartial) localDateTime50);
        int[] intArray55 = copticChronology1.get((org.joda.time.ReadablePartial) localDateTime50, 4287625875L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField10 and durationField12", Math.signum(durationField10.compareTo(durationField12)) == -Math.signum(durationField12.compareTo(durationField10)));
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test543");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.plusWeeks((int) (byte) 10);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(chronology8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime9.withMillisOfSecond((int) (byte) 1);
        int int14 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime9);
        int int15 = localDateTime1.getMinuteOfHour();
        org.joda.time.LocalDateTime localDateTime17 = localDateTime1.withWeekyear(649);
        java.util.TimeZone timeZone18 = null;
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forTimeZone(timeZone18);
        java.lang.String str21 = dateTimeZone19.getNameKey((long) (byte) 0);
        boolean boolean22 = dateTimeZone19.isFixed();
        java.lang.String str24 = dateTimeZone19.getShortName(3430L);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 0);
        long long28 = dateTimeZone19.getMillisKeepLocal(dateTimeZone26, 82800001L);
        org.joda.time.DateTime dateTime29 = localDateTime17.toDateTime(dateTimeZone26);
        org.joda.time.chrono.CopticChronology copticChronology30 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone26);
        org.joda.time.DateTimeField dateTimeField31 = copticChronology30.yearOfEra();
        org.joda.time.DurationField durationField32 = copticChronology30.years();
        org.joda.time.DateTimeField dateTimeField33 = copticChronology30.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField34 = copticChronology30.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.chrono.CopticChronology copticChronology36 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone35);
        org.joda.time.DateTimeField dateTimeField37 = copticChronology36.clockhourOfDay();
        org.joda.time.DurationField durationField38 = copticChronology36.weekyears();
        org.joda.time.DateTimeField dateTimeField39 = copticChronology36.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone40 = copticChronology36.getZone();
        org.joda.time.DurationField durationField41 = copticChronology36.centuries();
        org.joda.time.DateTimeField dateTimeField42 = copticChronology36.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.chrono.CopticChronology copticChronology44 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone43);
        org.joda.time.DateTimeField dateTimeField45 = copticChronology44.clockhourOfDay();
        org.joda.time.DurationField durationField46 = copticChronology44.weekyears();
        org.joda.time.DateTimeField dateTimeField47 = copticChronology44.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone48 = copticChronology44.getZone();
        org.joda.time.LocalDateTime localDateTime49 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) copticChronology44);
        org.joda.time.DurationField durationField50 = copticChronology44.weekyears();
        org.joda.time.DateTimeField dateTimeField51 = copticChronology44.hourOfHalfday();
        org.joda.time.DurationField durationField52 = copticChronology44.hours();
        java.util.TimeZone timeZone53 = null;
        org.joda.time.DateTimeZone dateTimeZone54 = org.joda.time.DateTimeZone.forTimeZone(timeZone53);
        java.lang.String str56 = dateTimeZone54.getNameKey((long) (byte) 0);
        org.joda.time.LocalDateTime localDateTime57 = new org.joda.time.LocalDateTime(dateTimeZone54);
        java.util.TimeZone timeZone58 = null;
        org.joda.time.DateTimeZone dateTimeZone59 = org.joda.time.DateTimeZone.forTimeZone(timeZone58);
        java.lang.String str61 = dateTimeZone59.getNameKey((long) (byte) 0);
        org.joda.time.LocalDateTime localDateTime62 = new org.joda.time.LocalDateTime(dateTimeZone59);
        boolean boolean63 = localDateTime57.isEqual((org.joda.time.ReadablePartial) localDateTime62);
        int[] intArray65 = copticChronology44.get((org.joda.time.ReadablePartial) localDateTime62, (long) 30);
        long long67 = copticChronology36.set((org.joda.time.ReadablePartial) localDateTime62, (long) (byte) -1);
        org.joda.time.LocalDateTime localDateTime69 = localDateTime62.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone70 = null;
        org.joda.time.chrono.CopticChronology copticChronology71 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone70);
        org.joda.time.DateTimeField dateTimeField72 = copticChronology71.clockhourOfDay();
        org.joda.time.DurationField durationField73 = copticChronology71.weekyears();
        org.joda.time.DurationField durationField74 = copticChronology71.centuries();
        org.joda.time.DateTimeField dateTimeField75 = copticChronology71.weekyear();
        org.joda.time.DateTimeZone dateTimeZone76 = copticChronology71.getZone();
        java.lang.String str78 = dateTimeZone76.getName((long) 53);
        boolean boolean80 = dateTimeZone76.isStandardOffset(4287233667L);
        org.joda.time.LocalDateTime localDateTime81 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime69, dateTimeZone76);
        int int82 = localDateTime69.getMonthOfYear();
        org.joda.time.LocalDateTime localDateTime84 = localDateTime69.withCenturyOfEra(158);
        org.joda.time.ReadablePeriod readablePeriod85 = null;
        org.joda.time.LocalDateTime localDateTime86 = localDateTime69.plus(readablePeriod85);
        int int87 = dateTimeField34.getMaximumValue((org.joda.time.ReadablePartial) localDateTime86);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField32 and durationField38", (durationField32.compareTo(durationField38) == 0) == durationField32.equals(durationField38));
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test544");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.CopticChronology copticChronology2 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology2.hourOfDay();
        org.joda.time.DurationField durationField4 = copticChronology2.eras();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology2.weekyear();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) (-292275054), (org.joda.time.Chronology) copticChronology2);
        org.joda.time.DateTimeZone dateTimeZone7 = copticChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology2.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology2.monthOfYear();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(chronology10);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime11.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime11.withYearOfCentury(0);
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.weekyear();
        org.joda.time.LocalDateTime localDateTime20 = property18.setCopy((int) (byte) 1);
        long long21 = property18.remainder();
        org.joda.time.LocalDateTime localDateTime22 = property18.withMinimumValue();
        org.joda.time.LocalDateTime.Property property23 = localDateTime22.millisOfDay();
        int[] intArray25 = copticChronology2.get((org.joda.time.ReadablePartial) localDateTime22, 4287231445L);
        org.joda.time.DateTimeZone dateTimeZone26 = copticChronology2.getZone();
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime(chronology27);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime28.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime28.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime28.withYearOfCentury(0);
        org.joda.time.LocalDateTime.Property property35 = localDateTime34.weekyear();
        org.joda.time.LocalDateTime localDateTime37 = property35.setCopy((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime38 = property35.roundFloorCopy();
        org.joda.time.LocalDateTime localDateTime40 = localDateTime38.plusSeconds(522);
        org.joda.time.LocalDateTime.Property property41 = localDateTime38.dayOfWeek();
        int int42 = localDateTime38.getYearOfCentury();
        org.joda.time.LocalDateTime localDateTime44 = localDateTime38.minusSeconds(51);
        org.joda.time.ReadablePeriod readablePeriod45 = null;
        org.joda.time.LocalDateTime localDateTime46 = localDateTime38.plus(readablePeriod45);
        long long48 = copticChronology2.set((org.joda.time.ReadablePartial) localDateTime46, 1645455436219L);
        org.joda.time.DurationField durationField49 = copticChronology2.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField4, durationField49, and durationField4", !(durationField4.compareTo(durationField49) == 0) || (Math.signum(durationField4.compareTo(durationField4)) == Math.signum(durationField49.compareTo(durationField4))));
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test545");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = copticChronology1.weekyears();
        org.joda.time.DurationField durationField4 = copticChronology1.hours();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology1.dayOfMonth();
        org.joda.time.DurationField durationField6 = copticChronology1.years();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology1.minuteOfHour();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField6", (durationField3.compareTo(durationField6) == 0) == durationField3.equals(durationField6));
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test546");
        java.util.Locale locale0 = java.util.Locale.GERMANY;
        java.lang.String str1 = locale0.getScript();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.chrono.CopticChronology copticChronology3 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = copticChronology3.clockhourOfDay();
        java.util.Locale locale6 = java.util.Locale.ITALIAN;
        java.lang.String str7 = dateTimeField4.getAsText((long) 'a', locale6);
        java.lang.String str8 = locale0.getDisplayName(locale6);
        java.lang.String str9 = locale6.getDisplayCountry();
        java.util.Set<java.lang.String> strSet10 = locale6.getUnicodeLocaleAttributes();
        java.util.stream.Stream<java.lang.String> strStream11 = strSet10.stream();
        java.util.Spliterator<java.lang.String> strSpliterator12 = strSet10.spliterator();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.chrono.CopticChronology copticChronology14 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone13);
        org.joda.time.DateTimeField dateTimeField15 = copticChronology14.clockhourOfDay();
        org.joda.time.DurationField durationField16 = copticChronology14.weekyears();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology14.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField18 = copticChronology14.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField19 = copticChronology14.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField20 = copticChronology14.weekyear();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime((long) 53, dateTimeZone23);
        org.joda.time.Chronology chronology25 = copticChronology14.withZone(dateTimeZone23);
        org.joda.time.Chronology chronology26 = chronology25.withUTC();
        org.joda.time.DateTimeField dateTimeField27 = chronology25.dayOfMonth();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime(chronology28);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime29.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime29.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime35 = localDateTime33.withMillisOfSecond((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime37 = localDateTime33.withMinuteOfHour(10);
        org.joda.time.ReadablePeriod readablePeriod38 = null;
        org.joda.time.LocalDateTime localDateTime39 = localDateTime37.minus(readablePeriod38);
        org.joda.time.Chronology chronology40 = localDateTime37.getChronology();
        org.joda.time.LocalDateTime.Property property41 = localDateTime37.weekOfWeekyear();
        java.util.Locale.Category category43 = java.util.Locale.Category.DISPLAY;
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.chrono.CopticChronology copticChronology45 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone44);
        org.joda.time.DateTimeField dateTimeField46 = copticChronology45.dayOfMonth();
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.LocalDateTime localDateTime48 = new org.joda.time.LocalDateTime(chronology47);
        org.joda.time.LocalDateTime localDateTime50 = localDateTime48.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime52 = localDateTime48.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime54 = localDateTime48.plusWeeks((int) (byte) 10);
        java.util.Locale locale55 = java.util.Locale.PRC;
        java.lang.String str56 = dateTimeField46.getAsText((org.joda.time.ReadablePartial) localDateTime54, locale55);
        java.util.Set<java.lang.String> strSet57 = locale55.getUnicodeLocaleKeys();
        java.util.Locale.setDefault(category43, locale55);
        java.util.Set<java.lang.String> strSet59 = locale55.getUnicodeLocaleKeys();
        java.util.Locale locale60 = locale55.stripExtensions();
        java.lang.String str61 = dateTimeField27.getAsShortText((org.joda.time.ReadablePartial) localDateTime37, 0, locale55);
        java.util.Set<java.lang.String> strSet62 = locale55.getUnicodeLocaleKeys();
        strSet62.clear();
        boolean boolean64 = strSet10.addAll((java.util.Collection<java.lang.String>) strSet62);
        org.joda.time.DateTimeZone dateTimeZone65 = null;
        org.joda.time.chrono.CopticChronology copticChronology66 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone65);
        org.joda.time.DateTimeField dateTimeField67 = copticChronology66.hourOfDay();
        org.joda.time.DurationField durationField68 = copticChronology66.eras();
        org.joda.time.DateTimeField dateTimeField69 = copticChronology66.millisOfDay();
        org.joda.time.DateTimeField dateTimeField70 = copticChronology66.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone71 = copticChronology66.getZone();
        org.joda.time.DateTimeField dateTimeField72 = copticChronology66.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone73 = copticChronology66.getZone();
        org.joda.time.DateTimeZone dateTimeZone74 = copticChronology66.getZone();
        org.joda.time.DateTimeField dateTimeField75 = copticChronology66.centuryOfEra();
        boolean boolean76 = strSet62.equals((java.lang.Object) dateTimeField75);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField16 and durationField68", Math.signum(durationField16.compareTo(durationField68)) == -Math.signum(durationField68.compareTo(durationField16)));
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test547");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology1.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology1.dayOfWeek();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(chronology5);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray7 = localDateTime6.getFieldTypes();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.withMillisOfDay((int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.plusWeeks((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.chrono.CopticChronology copticChronology14 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone13);
        org.joda.time.DateTimeField dateTimeField15 = copticChronology14.hourOfDay();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology14.secondOfDay();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology14.secondOfDay();
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime((long) 10, (org.joda.time.Chronology) copticChronology14);
        int int19 = localDateTime18.getDayOfYear();
        boolean boolean20 = localDateTime11.isEqual((org.joda.time.ReadablePartial) localDateTime18);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.chrono.CopticChronology copticChronology22 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone21);
        org.joda.time.DateTimeField dateTimeField23 = copticChronology22.hourOfDay();
        org.joda.time.DateTimeField dateTimeField24 = copticChronology22.centuryOfEra();
        org.joda.time.DurationField durationField25 = copticChronology22.millis();
        org.joda.time.DateTimeField dateTimeField26 = copticChronology22.weekOfWeekyear();
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime(chronology27);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime28.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime28.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime28.plusWeeks((int) (byte) 10);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.LocalDateTime localDateTime36 = new org.joda.time.LocalDateTime(chronology35);
        org.joda.time.LocalDateTime localDateTime38 = localDateTime36.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime40 = localDateTime36.withMillisOfSecond((int) (byte) 1);
        int int41 = localDateTime28.compareTo((org.joda.time.ReadablePartial) localDateTime36);
        org.joda.time.LocalDateTime.Property property42 = localDateTime36.weekyear();
        org.joda.time.LocalDateTime localDateTime44 = localDateTime36.minusMillis(2022);
        int[] intArray46 = copticChronology22.get((org.joda.time.ReadablePartial) localDateTime36, (long) '#');
        int int47 = dateTimeField4.getMinimumValue((org.joda.time.ReadablePartial) localDateTime18, intArray46);
        int int48 = localDateTime18.getMinuteOfHour();
        org.joda.time.LocalDateTime localDateTime50 = localDateTime18.withWeekyear((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime52 = localDateTime50.plusMinutes(31);
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.LocalDateTime localDateTime54 = new org.joda.time.LocalDateTime(chronology53);
        org.joda.time.LocalDateTime localDateTime56 = localDateTime54.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime58 = localDateTime54.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime60 = localDateTime54.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant61 = null;
        org.joda.time.DateTime dateTime62 = localDateTime60.toDateTime(readableInstant61);
        org.joda.time.LocalDateTime.Property property63 = localDateTime60.millisOfDay();
        org.joda.time.LocalDateTime localDateTime65 = localDateTime60.plusMonths(999);
        org.joda.time.ReadablePeriod readablePeriod66 = null;
        org.joda.time.LocalDateTime localDateTime68 = localDateTime65.withPeriodAdded(readablePeriod66, 100);
        org.joda.time.LocalDateTime localDateTime70 = localDateTime68.plusDays(51);
        org.joda.time.ReadableDuration readableDuration71 = null;
        org.joda.time.LocalDateTime localDateTime72 = localDateTime70.plus(readableDuration71);
        org.joda.time.LocalDateTime localDateTime74 = localDateTime70.plusHours(53881178);
        org.joda.time.LocalDateTime localDateTime75 = localDateTime52.withFields((org.joda.time.ReadablePartial) localDateTime70);
        org.joda.time.LocalDateTime localDateTime77 = localDateTime52.plusWeeks(53625125);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on localDateTime70 and localDateTime75", (localDateTime70.compareTo(localDateTime75) == 0) == localDateTime70.equals(localDateTime75));
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test548");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.CopticChronology copticChronology2 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology2.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology2.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology2.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime6 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) copticChronology2);
        java.util.Locale locale8 = null;
        java.lang.String str9 = localDateTime6.toString("0", locale8);
        org.joda.time.Chronology chronology10 = localDateTime6.getChronology();
        org.joda.time.LocalDateTime localDateTime11 = org.joda.time.LocalDateTime.now(chronology10);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.chrono.CopticChronology copticChronology13 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone12);
        org.joda.time.DateTimeField dateTimeField14 = copticChronology13.hourOfDay();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology13.secondOfDay();
        org.joda.time.DurationField durationField16 = copticChronology13.years();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology13.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime((org.joda.time.Chronology) copticChronology13);
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime11, (org.joda.time.Chronology) copticChronology13);
        org.joda.time.DateTimeField dateTimeField20 = copticChronology13.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField21 = copticChronology13.era();
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime(10598050696409L, (org.joda.time.Chronology) copticChronology13);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.chrono.CopticChronology copticChronology24 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField25 = copticChronology24.hourOfDay();
        org.joda.time.DateTimeField dateTimeField26 = copticChronology24.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.Chronology chronology28 = copticChronology24.withZone(dateTimeZone27);
        org.joda.time.DateTimeField dateTimeField29 = copticChronology24.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField30 = copticChronology24.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone31 = copticChronology24.getZone();
        org.joda.time.DurationField durationField32 = copticChronology24.eras();
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime(chronology33);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime34.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime38 = localDateTime34.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime40 = localDateTime34.plusWeeks((int) (byte) 10);
        int int41 = localDateTime40.getMillisOfSecond();
        int int42 = localDateTime40.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime44 = localDateTime40.plusHours((int) (short) -1);
        org.joda.time.DurationFieldType durationFieldType45 = null;
        boolean boolean46 = localDateTime40.isSupported(durationFieldType45);
        int[] intArray48 = copticChronology24.get((org.joda.time.ReadablePartial) localDateTime40, (long) 761);
        org.joda.time.LocalDateTime localDateTime50 = localDateTime40.minusYears(373);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray51 = localDateTime50.getFieldTypes();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter52 = null;
        java.lang.String str53 = localDateTime50.toString(dateTimeFormatter52);
        int int54 = localDateTime22.compareTo((org.joda.time.ReadablePartial) localDateTime50);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField16 and durationField32", Math.signum(durationField16.compareTo(durationField32)) == -Math.signum(durationField32.compareTo(durationField16)));
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test549");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = copticChronology1.weekyears();
        org.joda.time.DurationField durationField4 = copticChronology1.hours();
        int int5 = copticChronology1.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.monthOfYear();
        org.joda.time.Chronology chronology7 = copticChronology1.withUTC();
        org.joda.time.DurationField durationField8 = copticChronology1.years();
        org.joda.time.DurationField durationField9 = copticChronology1.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField8", (durationField3.compareTo(durationField8) == 0) == durationField3.equals(durationField8));
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test550");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.dayOfMonth();
        org.joda.time.DurationField durationField3 = copticChronology1.eras();
        java.lang.String str4 = copticChronology1.toString();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology1.millisOfDay();
        org.joda.time.DurationField durationField6 = dateTimeField5.getDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField3, durationField6, and durationField3", !(durationField3.compareTo(durationField6) == 0) || (Math.signum(durationField3.compareTo(durationField3)) == Math.signum(durationField6.compareTo(durationField3))));
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test551");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = copticChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = copticChronology1.getZone();
        org.joda.time.LocalDateTime localDateTime6 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) copticChronology1);
        org.joda.time.DurationField durationField7 = copticChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology1.hourOfHalfday();
        org.joda.time.DurationField durationField9 = copticChronology1.hours();
        org.joda.time.DurationField durationField10 = copticChronology1.minutes();
        org.joda.time.DurationField durationField11 = copticChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology1.dayOfYear();
        org.joda.time.DurationField durationField14 = copticChronology1.years();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology1.weekyearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField14", (durationField3.compareTo(durationField14) == 0) == durationField3.equals(durationField14));
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test552");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.weekOfWeekyear();
        org.joda.time.LocalDateTime.Property property5 = localDateTime3.centuryOfEra();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime7.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime7.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.DateTime dateTime15 = localDateTime13.toDateTime(readableInstant14);
        java.util.Locale locale16 = java.util.Locale.GERMANY;
        boolean boolean17 = locale16.hasExtensions();
        boolean boolean18 = dateTime15.equals((java.lang.Object) locale16);
        int int19 = property5.getDifference((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime(chronology20);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime21.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime21.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.DateTime dateTime29 = localDateTime27.toDateTime(readableInstant28);
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = null;
        boolean boolean31 = dateTime29.isSupported(dateTimeFieldType30);
        long long32 = dateTime29.getMillis();
        org.joda.time.Chronology chronology33 = dateTime29.getChronology();
        boolean boolean34 = dateTime15.isAfter((org.joda.time.ReadableInstant) dateTime29);
        org.joda.time.Instant instant35 = dateTime15.toInstant();
        org.joda.time.Instant instant36 = instant35.toInstant();
        long long37 = instant35.getMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime15 and instant35", (dateTime15.compareTo(instant35) == 0) == dateTime15.equals(instant35));
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test553");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = copticChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = copticChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology1.year();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology1.dayOfWeek();
        org.joda.time.Chronology chronology9 = copticChronology1.withUTC();
        org.joda.time.DurationField durationField10 = copticChronology1.halfdays();
        org.joda.time.DurationField durationField11 = copticChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField11, durationField3, and durationField10", !(durationField11.compareTo(durationField3) == 0) || (Math.signum(durationField11.compareTo(durationField10)) == Math.signum(durationField3.compareTo(durationField10))));
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test554");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology1.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.Chronology chronology5 = copticChronology1.withZone(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.millisOfSecond();
        org.joda.time.DurationField durationField7 = copticChronology1.hours();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology1.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology1.centuryOfEra();
        java.util.Locale locale13 = new java.util.Locale("", "14");
        java.lang.String str14 = dateTimeField9.getAsText(4352978357L, locale13);
        java.util.Locale locale16 = java.util.Locale.forLanguageTag("2022-02-14T14:53:58.771");
        java.lang.String str17 = locale13.getDisplayVariant(locale16);
        java.lang.String str18 = locale16.getISO3Language();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.chrono.CopticChronology copticChronology20 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone19);
        org.joda.time.DateTimeField dateTimeField21 = copticChronology20.hourOfDay();
        org.joda.time.DateTimeField dateTimeField22 = copticChronology20.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField23 = copticChronology20.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.chrono.CopticChronology copticChronology25 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone24);
        org.joda.time.DateTimeField dateTimeField26 = copticChronology25.hourOfDay();
        org.joda.time.DurationField durationField27 = copticChronology25.eras();
        org.joda.time.DateTimeField dateTimeField28 = copticChronology25.weekOfWeekyear();
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime(chronology29);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime30.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime.Property property33 = localDateTime32.weekOfWeekyear();
        int int34 = localDateTime32.getYear();
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.chrono.CopticChronology copticChronology36 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone35);
        org.joda.time.DateTimeField dateTimeField37 = copticChronology36.dayOfMonth();
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.LocalDateTime localDateTime39 = new org.joda.time.LocalDateTime(chronology38);
        org.joda.time.LocalDateTime localDateTime41 = localDateTime39.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime43 = localDateTime39.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime45 = localDateTime39.plusWeeks((int) (byte) 10);
        java.util.Locale locale46 = java.util.Locale.PRC;
        java.lang.String str47 = dateTimeField37.getAsText((org.joda.time.ReadablePartial) localDateTime45, locale46);
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.LocalDateTime localDateTime49 = new org.joda.time.LocalDateTime(chronology48);
        org.joda.time.LocalDateTime localDateTime51 = localDateTime49.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime53 = localDateTime49.withMillisOfSecond((int) (byte) 1);
        java.util.Locale locale55 = java.util.Locale.JAPAN;
        java.lang.String str56 = dateTimeField37.getAsText((org.joda.time.ReadablePartial) localDateTime49, 2022, locale55);
        java.lang.String str57 = dateTimeField28.getAsShortText((org.joda.time.ReadablePartial) localDateTime32, locale55);
        int int58 = dateTimeField23.getMaximumTextLength(locale55);
        boolean boolean59 = locale16.equals((java.lang.Object) int58);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField7 and durationField27", Math.signum(durationField7.compareTo(durationField27)) == -Math.signum(durationField27.compareTo(durationField7)));
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test555");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.CopticChronology copticChronology2 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology2.hourOfDay();
        org.joda.time.DurationField durationField4 = copticChronology2.eras();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology2.weekyear();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) (-292275054), (org.joda.time.Chronology) copticChronology2);
        org.joda.time.DateTimeZone dateTimeZone7 = copticChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology2.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology2.monthOfYear();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology2.era();
        org.joda.time.DurationField durationField11 = copticChronology2.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField4, durationField11, and durationField4", !(durationField4.compareTo(durationField11) == 0) || (Math.signum(durationField4.compareTo(durationField4)) == Math.signum(durationField11.compareTo(durationField4))));
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test556");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = copticChronology1.weekyears();
        org.joda.time.DurationField durationField4 = copticChronology1.centuries();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(chronology5);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray7 = localDateTime6.getFieldTypes();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.withMillisOfDay((int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.plusWeeks((int) (byte) 10);
        long long13 = copticChronology1.set((org.joda.time.ReadablePartial) localDateTime9, 3490L);
        org.joda.time.DurationField durationField14 = copticChronology1.hours();
        org.joda.time.DurationField durationField15 = copticChronology1.weekyears();
        org.joda.time.DurationField durationField16 = copticChronology1.years();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology1.weekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField16", (durationField3.compareTo(durationField16) == 0) == durationField3.equals(durationField16));
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test557");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = copticChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = copticChronology1.getZone();
        org.joda.time.DurationField durationField6 = copticChronology1.centuries();
        org.joda.time.DurationField durationField7 = copticChronology1.seconds();
        org.joda.time.DurationField durationField8 = copticChronology1.years();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology1.hourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField8", (durationField3.compareTo(durationField8) == 0) == durationField3.equals(durationField8));
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test558");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = copticChronology1.weekyears();
        org.joda.time.DurationField durationField4 = copticChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology1.era();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology1.monthOfYear();
        org.joda.time.DurationField durationField8 = copticChronology1.centuries();
        org.joda.time.DurationField durationField9 = copticChronology1.months();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.chrono.CopticChronology copticChronology11 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone10);
        org.joda.time.DateTimeField dateTimeField12 = copticChronology11.hourOfDay();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology11.centuryOfEra();
        org.joda.time.DurationField durationField14 = copticChronology11.millis();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology11.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology11.clockhourOfDay();
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime((org.joda.time.Chronology) copticChronology11);
        int int18 = localDateTime17.getDayOfMonth();
        org.joda.time.ReadableDuration readableDuration19 = null;
        org.joda.time.LocalDateTime localDateTime20 = localDateTime17.plus(readableDuration19);
        int int21 = localDateTime20.getEra();
        org.joda.time.LocalDateTime localDateTime23 = localDateTime20.minusHours(53844);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.chrono.CopticChronology copticChronology25 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone24);
        org.joda.time.DateTimeField dateTimeField26 = copticChronology25.hourOfDay();
        org.joda.time.DateTimeField dateTimeField27 = copticChronology25.secondOfDay();
        org.joda.time.DateTimeField dateTimeField28 = copticChronology25.secondOfDay();
        org.joda.time.DateTimeField dateTimeField29 = copticChronology25.centuryOfEra();
        org.joda.time.DurationField durationField30 = copticChronology25.months();
        org.joda.time.DateTimeField dateTimeField31 = copticChronology25.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField32 = copticChronology25.millisOfSecond();
        org.joda.time.DurationField durationField33 = copticChronology25.hours();
        org.joda.time.DateTimeField dateTimeField34 = copticChronology25.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField35 = copticChronology25.dayOfYear();
        org.joda.time.DurationField durationField36 = copticChronology25.years();
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.LocalDateTime localDateTime38 = new org.joda.time.LocalDateTime(chronology37);
        org.joda.time.LocalDateTime localDateTime40 = localDateTime38.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime.Property property41 = localDateTime40.weekOfWeekyear();
        int[] intArray43 = copticChronology25.get((org.joda.time.ReadablePartial) localDateTime40, 9935362799367L);
        copticChronology1.validate((org.joda.time.ReadablePartial) localDateTime20, intArray43);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField36", (durationField3.compareTo(durationField36) == 0) == durationField3.equals(durationField36));
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test559");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology1.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology1.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) copticChronology1);
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.weekOfWeekyear();
        org.joda.time.DurationField durationField7 = copticChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology1.yearOfEra();
        org.joda.time.DurationField durationField9 = copticChronology1.eras();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology1.millisOfSecond();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField7 and durationField9", Math.signum(durationField7.compareTo(durationField9)) == -Math.signum(durationField9.compareTo(durationField7)));
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test560");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.DateTime dateTime9 = localDateTime7.toDateTime(readableInstant8);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(chronology10);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime11.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime11.plusWeeks((int) (byte) 10);
        int int18 = localDateTime17.getMillisOfSecond();
        int int19 = localDateTime17.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime17.plusHours((int) (short) -1);
        org.joda.time.DurationFieldType durationFieldType22 = null;
        boolean boolean23 = localDateTime17.isSupported(durationFieldType22);
        org.joda.time.DateTime dateTime24 = localDateTime17.toDateTime();
        boolean boolean25 = dateTime9.isAfter((org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.Instant instant26 = dateTime9.toInstant();
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.chrono.CopticChronology copticChronology28 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone27);
        org.joda.time.DateTimeField dateTimeField29 = copticChronology28.hourOfDay();
        org.joda.time.DateTimeField dateTimeField30 = copticChronology28.centuryOfEra();
        org.joda.time.DurationField durationField31 = copticChronology28.millis();
        org.joda.time.DateTimeField dateTimeField32 = copticChronology28.secondOfDay();
        org.joda.time.DateTimeField dateTimeField33 = copticChronology28.hourOfDay();
        org.joda.time.DateTimeField dateTimeField34 = copticChronology28.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField35 = copticChronology28.era();
        boolean boolean36 = dateTime9.equals((java.lang.Object) dateTimeField35);
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.chrono.CopticChronology copticChronology38 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone37);
        org.joda.time.DateTimeField dateTimeField39 = copticChronology38.clockhourOfDay();
        org.joda.time.DurationField durationField40 = copticChronology38.weekyears();
        org.joda.time.DateTimeField dateTimeField41 = copticChronology38.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField42 = copticChronology38.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField43 = copticChronology38.clockhourOfHalfday();
        org.joda.time.DurationField durationField44 = copticChronology38.halfdays();
        org.joda.time.DurationField durationField45 = copticChronology38.hours();
        org.joda.time.DateTimeField dateTimeField46 = copticChronology38.minuteOfDay();
        boolean boolean47 = dateTime9.equals((java.lang.Object) copticChronology38);
        org.joda.time.DateTimeZone dateTimeZone48 = null;
        org.joda.time.chrono.CopticChronology copticChronology49 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone48);
        org.joda.time.DateTimeField dateTimeField50 = copticChronology49.clockhourOfDay();
        org.joda.time.DurationField durationField51 = copticChronology49.weekyears();
        org.joda.time.DateTimeField dateTimeField52 = copticChronology49.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone53 = copticChronology49.getZone();
        org.joda.time.DurationField durationField54 = copticChronology49.centuries();
        org.joda.time.DateTimeField dateTimeField55 = copticChronology49.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone56 = null;
        org.joda.time.chrono.CopticChronology copticChronology57 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone56);
        org.joda.time.DateTimeField dateTimeField58 = copticChronology57.clockhourOfDay();
        org.joda.time.DurationField durationField59 = copticChronology57.weekyears();
        org.joda.time.DateTimeField dateTimeField60 = copticChronology57.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone61 = copticChronology57.getZone();
        org.joda.time.LocalDateTime localDateTime62 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) copticChronology57);
        org.joda.time.DurationField durationField63 = copticChronology57.weekyears();
        org.joda.time.DateTimeField dateTimeField64 = copticChronology57.hourOfHalfday();
        org.joda.time.DurationField durationField65 = copticChronology57.hours();
        java.util.TimeZone timeZone66 = null;
        org.joda.time.DateTimeZone dateTimeZone67 = org.joda.time.DateTimeZone.forTimeZone(timeZone66);
        java.lang.String str69 = dateTimeZone67.getNameKey((long) (byte) 0);
        org.joda.time.LocalDateTime localDateTime70 = new org.joda.time.LocalDateTime(dateTimeZone67);
        java.util.TimeZone timeZone71 = null;
        org.joda.time.DateTimeZone dateTimeZone72 = org.joda.time.DateTimeZone.forTimeZone(timeZone71);
        java.lang.String str74 = dateTimeZone72.getNameKey((long) (byte) 0);
        org.joda.time.LocalDateTime localDateTime75 = new org.joda.time.LocalDateTime(dateTimeZone72);
        boolean boolean76 = localDateTime70.isEqual((org.joda.time.ReadablePartial) localDateTime75);
        int[] intArray78 = copticChronology57.get((org.joda.time.ReadablePartial) localDateTime75, (long) 30);
        long long80 = copticChronology49.set((org.joda.time.ReadablePartial) localDateTime75, (long) (byte) -1);
        org.joda.time.DateTimeField[] dateTimeFieldArray81 = localDateTime75.getFields();
        int int82 = localDateTime75.size();
        long long84 = copticChronology38.set((org.joda.time.ReadablePartial) localDateTime75, (long) 53988);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and instant26", (dateTime9.compareTo(instant26) == 0) == dateTime9.equals(instant26));
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test561");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology1.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology1.dayOfWeek();
        org.joda.time.DurationField durationField5 = copticChronology1.eras();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology1.dayOfWeek();
        boolean boolean9 = dateTimeField8.isSupported();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(chronology10);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime11.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime11.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.DateTime dateTime19 = localDateTime17.toDateTime(readableInstant18);
        org.joda.time.LocalDateTime.Property property20 = localDateTime17.millisOfDay();
        org.joda.time.LocalDateTime localDateTime22 = localDateTime17.plusMonths(999);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.LocalDateTime localDateTime25 = localDateTime22.withPeriodAdded(readablePeriod23, 100);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime22.plusWeeks(380);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime(chronology28);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime29.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime29.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime35 = localDateTime29.plusWeeks((int) (byte) 10);
        int int36 = localDateTime35.getMillisOfSecond();
        int int37 = localDateTime35.getMillisOfSecond();
        java.lang.String str39 = localDateTime35.toString("+100:00");
        org.joda.time.LocalDateTime localDateTime41 = localDateTime35.withWeekyear(792);
        org.joda.time.LocalDateTime localDateTime43 = localDateTime35.withYearOfEra(202);
        org.joda.time.LocalDateTime localDateTime45 = localDateTime35.plusMillis(51054001);
        org.joda.time.LocalDateTime.Property property46 = localDateTime45.monthOfYear();
        boolean boolean47 = localDateTime27.isAfter((org.joda.time.ReadablePartial) localDateTime45);
        org.joda.time.LocalDateTime localDateTime49 = localDateTime45.withYear(53714019);
        java.util.Locale locale50 = java.util.Locale.GERMAN;
        java.util.Locale locale51 = locale50.stripExtensions();
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.chrono.CopticChronology copticChronology53 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone52);
        org.joda.time.DateTimeField dateTimeField54 = copticChronology53.hourOfDay();
        org.joda.time.DateTimeField dateTimeField55 = copticChronology53.weekyearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone57 = null;
        org.joda.time.chrono.CopticChronology copticChronology58 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone57);
        org.joda.time.DateTimeField dateTimeField59 = copticChronology58.clockhourOfDay();
        java.util.Locale locale61 = java.util.Locale.ITALIAN;
        java.lang.String str62 = dateTimeField59.getAsText((long) 'a', locale61);
        java.lang.String str63 = dateTimeField55.getAsText((int) 'a', locale61);
        org.joda.time.DateTimeZone dateTimeZone64 = null;
        org.joda.time.chrono.CopticChronology copticChronology65 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone64);
        org.joda.time.DateTimeField dateTimeField66 = copticChronology65.clockhourOfDay();
        org.joda.time.DurationField durationField67 = copticChronology65.weekyears();
        org.joda.time.DateTimeField dateTimeField68 = copticChronology65.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone69 = null;
        org.joda.time.chrono.CopticChronology copticChronology70 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone69);
        org.joda.time.DateTimeField dateTimeField71 = copticChronology70.clockhourOfDay();
        java.util.Locale locale73 = java.util.Locale.ITALIAN;
        java.lang.String str74 = dateTimeField71.getAsText((long) 'a', locale73);
        int int75 = dateTimeField68.getMaximumTextLength(locale73);
        java.lang.String str76 = locale61.getDisplayCountry(locale73);
        java.lang.String str77 = locale51.getDisplayLanguage(locale73);
        java.lang.String str78 = dateTimeField8.getAsShortText((org.joda.time.ReadablePartial) localDateTime49, locale51);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField5 and durationField67", Math.signum(durationField5.compareTo(durationField67)) == -Math.signum(durationField67.compareTo(durationField5)));
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test562");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology1.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.Chronology chronology5 = copticChronology1.withZone(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology1.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology1.year();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology1.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology1.yearOfEra();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology1.year();
        org.joda.time.DurationField durationField12 = copticChronology1.hours();
        org.joda.time.DurationField durationField13 = copticChronology1.years();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.chrono.CopticChronology copticChronology15 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone14);
        org.joda.time.DateTimeField dateTimeField16 = copticChronology15.hourOfDay();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology15.centuryOfEra();
        org.joda.time.DurationField durationField18 = copticChronology15.millis();
        org.joda.time.DateTimeField dateTimeField19 = copticChronology15.weekOfWeekyear();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime(chronology20);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime21.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime21.plusWeeks((int) (byte) 10);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime(chronology28);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime29.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime29.withMillisOfSecond((int) (byte) 1);
        int int34 = localDateTime21.compareTo((org.joda.time.ReadablePartial) localDateTime29);
        org.joda.time.LocalDateTime.Property property35 = localDateTime29.weekyear();
        org.joda.time.LocalDateTime localDateTime37 = localDateTime29.minusMillis(2022);
        int[] intArray39 = copticChronology15.get((org.joda.time.ReadablePartial) localDateTime29, (long) '#');
        org.joda.time.LocalDateTime.Property property40 = localDateTime29.millisOfDay();
        int int41 = property40.get();
        org.joda.time.LocalDateTime localDateTime42 = property40.withMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.DateTime dateTime44 = localDateTime42.toDateTime(dateTimeZone43);
        org.joda.time.ReadableDuration readableDuration45 = null;
        org.joda.time.LocalDateTime localDateTime46 = localDateTime42.minus(readableDuration45);
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.chrono.CopticChronology copticChronology48 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone47);
        org.joda.time.DateTimeField dateTimeField49 = copticChronology48.hourOfDay();
        org.joda.time.DateTimeField dateTimeField50 = copticChronology48.centuryOfEra();
        org.joda.time.DurationField durationField51 = copticChronology48.millis();
        org.joda.time.DateTimeField dateTimeField52 = copticChronology48.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField53 = copticChronology48.clockhourOfDay();
        org.joda.time.LocalDateTime localDateTime54 = new org.joda.time.LocalDateTime((org.joda.time.Chronology) copticChronology48);
        org.joda.time.DateTimeField dateTimeField55 = copticChronology48.yearOfEra();
        org.joda.time.DateTimeField dateTimeField56 = copticChronology48.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone57 = null;
        org.joda.time.chrono.CopticChronology copticChronology58 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone57);
        org.joda.time.DateTimeField dateTimeField59 = copticChronology58.hourOfDay();
        org.joda.time.DateTimeField dateTimeField60 = copticChronology58.centuryOfEra();
        org.joda.time.DurationField durationField61 = copticChronology58.millis();
        org.joda.time.DateTimeField dateTimeField62 = copticChronology58.weekOfWeekyear();
        org.joda.time.Chronology chronology63 = null;
        org.joda.time.LocalDateTime localDateTime64 = new org.joda.time.LocalDateTime(chronology63);
        org.joda.time.LocalDateTime localDateTime66 = localDateTime64.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime68 = localDateTime64.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime70 = localDateTime64.plusWeeks((int) (byte) 10);
        org.joda.time.Chronology chronology71 = null;
        org.joda.time.LocalDateTime localDateTime72 = new org.joda.time.LocalDateTime(chronology71);
        org.joda.time.LocalDateTime localDateTime74 = localDateTime72.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime76 = localDateTime72.withMillisOfSecond((int) (byte) 1);
        int int77 = localDateTime64.compareTo((org.joda.time.ReadablePartial) localDateTime72);
        org.joda.time.LocalDateTime.Property property78 = localDateTime72.weekyear();
        org.joda.time.LocalDateTime localDateTime80 = localDateTime72.minusMillis(2022);
        int[] intArray82 = copticChronology58.get((org.joda.time.ReadablePartial) localDateTime72, (long) '#');
        long long84 = copticChronology48.set((org.joda.time.ReadablePartial) localDateTime72, (long) 166);
        org.joda.time.DurationField durationField85 = copticChronology48.years();
        org.joda.time.DateTimeField dateTimeField86 = copticChronology48.hourOfDay();
        org.joda.time.DurationField durationField87 = copticChronology48.hours();
        org.joda.time.Chronology chronology88 = copticChronology48.withUTC();
        org.joda.time.LocalDateTime localDateTime89 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime46, (org.joda.time.Chronology) copticChronology48);
        java.util.Date date90 = localDateTime89.toDate();
        org.joda.time.LocalDateTime localDateTime92 = localDateTime89.minusYears(869);
        int[] intArray94 = copticChronology1.get((org.joda.time.ReadablePartial) localDateTime89, 4287379328L);
        org.joda.time.DateTimeField dateTimeField95 = copticChronology1.weekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on localDateTime42 and localDateTime89", (localDateTime42.compareTo(localDateTime89) == 0) == localDateTime42.equals(localDateTime89));
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test563");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.weekyearOfCentury();
        org.joda.time.DurationField durationField3 = copticChronology1.seconds();
        org.joda.time.DurationField durationField4 = copticChronology1.years();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology1.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.weekyear();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology1.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.chrono.CopticChronology copticChronology9 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone8);
        org.joda.time.DateTimeField dateTimeField10 = copticChronology9.clockhourOfDay();
        org.joda.time.DurationField durationField11 = copticChronology9.weekyears();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology9.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology9.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology9.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology9.weekyear();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology9.minuteOfDay();
        org.joda.time.DurationField durationField17 = copticChronology9.days();
        org.joda.time.DateTimeField dateTimeField18 = copticChronology9.secondOfDay();
        org.joda.time.Chronology chronology19 = copticChronology9.withUTC();
        org.joda.time.DateTimeField dateTimeField20 = copticChronology9.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField21 = copticChronology9.hourOfDay();
        java.lang.String str23 = dateTimeField21.getAsShortText(10598050512347L);
        boolean boolean24 = copticChronology1.equals((java.lang.Object) 10598050512347L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField11", (durationField4.compareTo(durationField11) == 0) == durationField4.equals(durationField11));
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test564");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology1.secondOfDay();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology1.secondOfDay();
        org.joda.time.DurationField durationField5 = copticChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.era();
        org.joda.time.DurationField durationField7 = copticChronology1.weekyears();
        org.joda.time.DurationField durationField8 = copticChronology1.seconds();
        org.joda.time.DurationField durationField9 = copticChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField5, and durationField7", !(durationField9.compareTo(durationField5) == 0) || (Math.signum(durationField9.compareTo(durationField7)) == Math.signum(durationField5.compareTo(durationField7))));
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test565");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology1.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.Chronology chronology5 = copticChronology1.withZone(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology1.clockhourOfHalfday();
        org.joda.time.DurationField durationField8 = copticChronology1.days();
        org.joda.time.DurationField durationField9 = copticChronology1.years();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(chronology10);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime11.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.withMillisOfSecond((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime15.withMinuteOfHour(10);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime15.minusDays(100);
        org.joda.time.LocalDateTime.Property property22 = localDateTime21.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime24 = property22.addToCopy((long) 271);
        org.joda.time.DateTimeField dateTimeField25 = property22.getField();
        boolean boolean26 = copticChronology1.equals((java.lang.Object) property22);
        java.lang.String str27 = property22.getAsString();
        org.joda.time.LocalDateTime localDateTime29 = property22.addToCopy((long) 674);
        int int30 = property22.getMaximumValueOverall();
        org.joda.time.tz.NameProvider nameProvider31 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider31);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider31);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider31);
        java.util.Locale.Builder builder35 = new java.util.Locale.Builder();
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.chrono.CopticChronology copticChronology37 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone36);
        org.joda.time.DateTimeField dateTimeField38 = copticChronology37.hourOfDay();
        org.joda.time.DateTimeField dateTimeField39 = copticChronology37.weekyearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.chrono.CopticChronology copticChronology42 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone41);
        org.joda.time.DateTimeField dateTimeField43 = copticChronology42.clockhourOfDay();
        java.util.Locale locale45 = java.util.Locale.ITALIAN;
        java.lang.String str46 = dateTimeField43.getAsText((long) 'a', locale45);
        java.lang.String str47 = dateTimeField39.getAsText((int) 'a', locale45);
        org.joda.time.DateTimeZone dateTimeZone48 = null;
        org.joda.time.chrono.CopticChronology copticChronology49 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone48);
        org.joda.time.DateTimeField dateTimeField50 = copticChronology49.clockhourOfDay();
        org.joda.time.DurationField durationField51 = copticChronology49.weekyears();
        org.joda.time.DateTimeField dateTimeField52 = copticChronology49.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone53 = null;
        org.joda.time.chrono.CopticChronology copticChronology54 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone53);
        org.joda.time.DateTimeField dateTimeField55 = copticChronology54.clockhourOfDay();
        java.util.Locale locale57 = java.util.Locale.ITALIAN;
        java.lang.String str58 = dateTimeField55.getAsText((long) 'a', locale57);
        int int59 = dateTimeField52.getMaximumTextLength(locale57);
        java.lang.String str60 = locale45.getDisplayCountry(locale57);
        java.util.Locale.Builder builder61 = builder35.setLocale(locale57);
        java.util.Locale.Builder builder63 = builder35.setRegion("");
        java.util.Locale locale64 = builder35.build();
        java.util.Locale locale66 = java.util.Locale.forLanguageTag("2022-02-14T14:54:10.634");
        java.lang.String str67 = locale64.getDisplayScript(locale66);
        java.lang.String str70 = nameProvider31.getShortName(locale66, "2022-02-14T14:54:29.817", "2974-02-21T14:56:37.471");
        int int71 = property22.getMaximumTextLength(locale66);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField9 and durationField51", (durationField9.compareTo(durationField51) == 0) == durationField9.equals(durationField51));
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test566");
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        java.lang.String str5 = dateTimeZone3.getNameKey((long) (byte) 0);
        boolean boolean6 = dateTimeZone3.isFixed();
        java.lang.String str8 = dateTimeZone3.getShortName(3430L);
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(4287236898L, dateTimeZone3);
        long long11 = dateTimeZone3.previousTransition(951144860629L);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetMillis(53625125);
        long long15 = dateTimeZone3.getMillisKeepLocal(dateTimeZone13, (long) 307);
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((long) (-264192), dateTimeZone13);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime(chronology17);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime18.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime18.withYearOfCentury(0);
        org.joda.time.LocalDateTime.Property property25 = localDateTime24.weekyear();
        org.joda.time.LocalDateTime localDateTime27 = property25.setCopy((int) (byte) 1);
        org.joda.time.DurationField durationField28 = property25.getLeapDurationField();
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime(chronology29);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime30.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime30.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime30.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.DateTime dateTime38 = localDateTime36.toDateTime(readableInstant37);
        java.util.Locale locale39 = java.util.Locale.GERMANY;
        boolean boolean40 = locale39.hasExtensions();
        boolean boolean41 = dateTime38.equals((java.lang.Object) locale39);
        java.util.Locale.LanguageRange[] languageRangeArray42 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList43 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList43, languageRangeArray42);
        java.util.Collection<java.lang.String> strCollection45 = null;
        java.util.List<java.lang.String> strList46 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList43, strCollection45);
        java.util.Collection<java.lang.String> strCollection47 = null;
        java.util.List<java.lang.String> strList48 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList43, strCollection47);
        java.util.Locale.LanguageRange[] languageRangeArray49 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList50 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList50, languageRangeArray49);
        java.util.Collection<java.lang.String> strCollection52 = null;
        java.util.List<java.lang.String> strList53 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList50, strCollection52);
        java.util.Collection<java.lang.String> strCollection54 = null;
        java.util.List<java.lang.String> strList55 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList50, strCollection54);
        java.util.Locale.FilteringMode filteringMode56 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList57 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList43, strCollection54, filteringMode56);
        boolean boolean58 = dateTime38.equals((java.lang.Object) languageRangeList43);
        org.joda.time.Chronology chronology59 = null;
        org.joda.time.LocalDateTime localDateTime60 = new org.joda.time.LocalDateTime(chronology59);
        org.joda.time.LocalDateTime localDateTime62 = localDateTime60.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime.Property property63 = localDateTime62.weekOfWeekyear();
        org.joda.time.LocalDateTime.Property property64 = localDateTime62.centuryOfEra();
        org.joda.time.Chronology chronology65 = null;
        org.joda.time.LocalDateTime localDateTime66 = new org.joda.time.LocalDateTime(chronology65);
        org.joda.time.LocalDateTime localDateTime68 = localDateTime66.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime70 = localDateTime66.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime72 = localDateTime66.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant73 = null;
        org.joda.time.DateTime dateTime74 = localDateTime72.toDateTime(readableInstant73);
        java.util.Locale locale75 = java.util.Locale.GERMANY;
        boolean boolean76 = locale75.hasExtensions();
        boolean boolean77 = dateTime74.equals((java.lang.Object) locale75);
        int int78 = property64.getDifference((org.joda.time.ReadableInstant) dateTime74);
        int int79 = dateTime38.compareTo((org.joda.time.ReadableInstant) dateTime74);
        long long80 = property25.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime74);
        org.joda.time.Instant instant81 = dateTime74.toInstant();
        org.joda.time.DateTime dateTime82 = localDateTime16.toDateTime((org.joda.time.ReadableInstant) instant81);
        org.joda.time.Chronology chronology83 = dateTime82.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime38 and instant81", (dateTime38.compareTo(instant81) == 0) == dateTime38.equals(instant81));
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test567");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = copticChronology1.weekyears();
        org.joda.time.DurationField durationField4 = copticChronology1.hours();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology1.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone6 = copticChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology1.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology1.weekOfWeekyear();
        org.joda.time.DurationField durationField9 = copticChronology1.years();
        org.joda.time.Chronology chronology10 = copticChronology1.withUTC();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField9", (durationField3.compareTo(durationField9) == 0) == durationField3.equals(durationField9));
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test568");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = copticChronology1.weekyears();
        org.joda.time.DurationField durationField4 = copticChronology1.hours();
        int int5 = copticChronology1.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.monthOfYear();
        org.joda.time.DurationField durationField7 = copticChronology1.seconds();
        org.joda.time.DurationField durationField8 = copticChronology1.weeks();
        org.joda.time.DurationField durationField9 = copticChronology1.years();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology1.millisOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField9", (durationField3.compareTo(durationField9) == 0) == durationField3.equals(durationField9));
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test569");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.CopticChronology copticChronology2 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology2.hourOfDay();
        org.joda.time.DurationField durationField4 = copticChronology2.eras();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology2.weekyear();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) (-292275054), (org.joda.time.Chronology) copticChronology2);
        org.joda.time.DateTimeZone dateTimeZone7 = copticChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology2.year();
        org.joda.time.DurationField durationField9 = copticChronology2.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField4, durationField9, and durationField4", !(durationField4.compareTo(durationField9) == 0) || (Math.signum(durationField4.compareTo(durationField4)) == Math.signum(durationField9.compareTo(durationField4))));
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test570");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology1.centuryOfEra();
        org.joda.time.DurationField durationField4 = copticChronology1.millis();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology1.halfdayOfDay();
        org.joda.time.DurationField durationField6 = copticChronology1.centuries();
        org.joda.time.DurationField durationField7 = copticChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField7, durationField4, and durationField6", !(durationField7.compareTo(durationField4) == 0) || (Math.signum(durationField7.compareTo(durationField6)) == Math.signum(durationField4.compareTo(durationField6))));
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test571");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology1.weekyearOfCentury();
        org.joda.time.DurationField durationField4 = copticChronology1.years();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology1.secondOfDay();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = copticChronology1.add(readablePeriod6, (long) 19, 596);
        org.joda.time.DurationField durationField10 = copticChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology1.minuteOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField10", (durationField4.compareTo(durationField10) == 0) == durationField4.equals(durationField10));
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test572");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology1.centuryOfEra();
        org.joda.time.DurationField durationField4 = copticChronology1.millis();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology1.secondOfDay();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology1.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology1.secondOfMinute();
        org.joda.time.DurationField durationField9 = copticChronology1.weekyears();
        org.joda.time.DurationField durationField10 = copticChronology1.millis();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology1.era();
        org.joda.time.DurationField durationField12 = copticChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField12, durationField4, and durationField9", !(durationField12.compareTo(durationField4) == 0) || (Math.signum(durationField12.compareTo(durationField9)) == Math.signum(durationField4.compareTo(durationField9))));
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test573");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.clockhourOfDay();
        long long6 = copticChronology1.add((long) '#', (long) 'a', (int) '#');
        org.joda.time.DateTimeField dateTimeField7 = copticChronology1.clockhourOfHalfday();
        org.joda.time.DurationField durationField8 = copticChronology1.eras();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology1.monthOfYear();
        long long13 = copticChronology1.add((long) 753, 4287404405L, 0);
        org.joda.time.DateTimeField dateTimeField14 = copticChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField15 = dateTimeField14.getRangeDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField8, durationField15, and durationField8", !(durationField8.compareTo(durationField15) == 0) || (Math.signum(durationField8.compareTo(durationField8)) == Math.signum(durationField15.compareTo(durationField8))));
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test574");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.hourOfDay();
        org.joda.time.DurationField durationField3 = copticChronology1.eras();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology1.weekyear();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology1.era();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime7.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime7.plusWeeks((int) (byte) 10);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime(chronology14);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime15.withMillisOfSecond((int) (byte) 1);
        int int20 = localDateTime7.compareTo((org.joda.time.ReadablePartial) localDateTime15);
        org.joda.time.LocalDateTime.Property property21 = localDateTime15.weekyear();
        int int22 = property21.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime23 = property21.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime24 = property21.roundHalfEvenCopy();
        long long26 = copticChronology1.set((org.joda.time.ReadablePartial) localDateTime24, 296L);
        org.joda.time.DateTimeField dateTimeField27 = copticChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField28 = copticChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField29 = copticChronology1.secondOfDay();
        org.joda.time.DateTimeField dateTimeField30 = copticChronology1.hourOfHalfday();
        org.joda.time.DurationField durationField31 = copticChronology1.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField3, durationField31, and durationField3", !(durationField3.compareTo(durationField31) == 0) || (Math.signum(durationField3.compareTo(durationField3)) == Math.signum(durationField31.compareTo(durationField3))));
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test575");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = copticChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField5 = copticChronology1.hours();
        org.joda.time.DateTimeZone dateTimeZone6 = copticChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology1.weekOfWeekyear();
        boolean boolean8 = dateTimeField7.isLenient();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.chrono.CopticChronology copticChronology10 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField11 = copticChronology10.hourOfDay();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology10.secondOfDay();
        org.joda.time.DurationField durationField13 = copticChronology10.years();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology10.year();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology10.minuteOfDay();
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((org.joda.time.Chronology) copticChronology10);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.minusHours(8029);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime16.withHourOfDay(0);
        java.util.Locale.Category category21 = java.util.Locale.Category.DISPLAY;
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.chrono.CopticChronology copticChronology23 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone22);
        org.joda.time.DateTimeField dateTimeField24 = copticChronology23.dayOfMonth();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime(chronology25);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime26.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime26.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime26.plusWeeks((int) (byte) 10);
        java.util.Locale locale33 = java.util.Locale.PRC;
        java.lang.String str34 = dateTimeField24.getAsText((org.joda.time.ReadablePartial) localDateTime32, locale33);
        java.util.Set<java.lang.String> strSet35 = locale33.getUnicodeLocaleKeys();
        java.util.Locale.setDefault(category21, locale33);
        java.util.Set<java.lang.String> strSet37 = locale33.getUnicodeLocaleKeys();
        java.lang.String str38 = dateTimeField7.getAsShortText((org.joda.time.ReadablePartial) localDateTime16, locale33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField13", (durationField3.compareTo(durationField13) == 0) == durationField3.equals(durationField13));
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test576");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.weekyearOfCentury();
        org.joda.time.DurationField durationField3 = copticChronology1.seconds();
        org.joda.time.DurationField durationField4 = copticChronology1.years();
        org.joda.time.DateTimeZone dateTimeZone5 = copticChronology1.getZone();
        org.joda.time.DurationField durationField6 = copticChronology1.months();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 10);
        long long11 = dateTimeZone9.previousTransition((long) (-292275054));
        int int13 = dateTimeZone9.getOffset(4287242686L);
        org.joda.time.Chronology chronology14 = copticChronology1.withZone(dateTimeZone9);
        org.joda.time.DurationField durationField15 = copticChronology1.weekyears();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.chrono.CopticChronology copticChronology17 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone16);
        org.joda.time.DateTimeField dateTimeField18 = copticChronology17.hourOfDay();
        org.joda.time.DateTimeField dateTimeField19 = copticChronology17.centuryOfEra();
        org.joda.time.DurationField durationField20 = copticChronology17.millis();
        org.joda.time.DateTimeField dateTimeField21 = copticChronology17.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField22 = copticChronology17.clockhourOfDay();
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime((org.joda.time.Chronology) copticChronology17);
        org.joda.time.DateTimeField dateTimeField24 = copticChronology17.yearOfEra();
        org.joda.time.DateTimeField dateTimeField25 = copticChronology17.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField26 = copticChronology17.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField27 = copticChronology17.yearOfEra();
        org.joda.time.LocalDateTime localDateTime28 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) copticChronology17);
        org.joda.time.DurationField durationField29 = copticChronology17.centuries();
        boolean boolean30 = copticChronology1.equals((java.lang.Object) copticChronology17);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField15", (durationField4.compareTo(durationField15) == 0) == durationField4.equals(durationField15));
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test577");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.clockhourOfDay();
        long long6 = copticChronology1.add((long) '#', (long) 'a', (int) '#');
        org.joda.time.DateTimeField dateTimeField7 = copticChronology1.clockhourOfHalfday();
        org.joda.time.DurationField durationField8 = copticChronology1.eras();
        org.joda.time.DurationField durationField9 = copticChronology1.eras();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology1.secondOfDay();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology1.monthOfYear();
        org.joda.time.DurationField durationField12 = copticChronology1.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField8, durationField12, and durationField8", !(durationField8.compareTo(durationField12) == 0) || (Math.signum(durationField8.compareTo(durationField8)) == Math.signum(durationField12.compareTo(durationField8))));
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test578");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.withMillisOfSecond((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime5.withMinuteOfHour(10);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime5.minusDays(0);
        int int12 = localDateTime11.getHourOfDay();
        org.joda.time.DateTime dateTime13 = localDateTime11.toDateTime();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime(chronology14);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime15.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime15.withYearOfCentury(0);
        org.joda.time.LocalDateTime.Property property22 = localDateTime21.weekyear();
        org.joda.time.LocalDateTime localDateTime24 = property22.setCopy((int) (byte) 1);
        org.joda.time.DurationField durationField25 = property22.getLeapDurationField();
        org.joda.time.LocalDateTime localDateTime26 = property22.getLocalDateTime();
        org.joda.time.LocalDateTime.Property property27 = localDateTime26.weekOfWeekyear();
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.DateTime dateTime29 = localDateTime26.toDateTime(readableInstant28);
        org.joda.time.Instant instant30 = dateTime29.toInstant();
        boolean boolean31 = dateTime13.isAfter((org.joda.time.ReadableInstant) instant30);
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime(chronology32);
        org.joda.time.LocalDateTime localDateTime35 = localDateTime33.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime37 = localDateTime33.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime39 = localDateTime33.plusWeeks((int) (byte) 10);
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.LocalDateTime localDateTime41 = new org.joda.time.LocalDateTime(chronology40);
        org.joda.time.LocalDateTime localDateTime43 = localDateTime41.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime45 = localDateTime41.withMillisOfSecond((int) (byte) 1);
        int int46 = localDateTime33.compareTo((org.joda.time.ReadablePartial) localDateTime41);
        org.joda.time.LocalDateTime.Property property47 = localDateTime41.weekyear();
        org.joda.time.LocalDateTime.Property property48 = localDateTime41.millisOfDay();
        org.joda.time.LocalDateTime localDateTime50 = localDateTime41.minusYears(999);
        org.joda.time.LocalDateTime localDateTime52 = localDateTime50.minusHours(6);
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.LocalDateTime localDateTime54 = new org.joda.time.LocalDateTime(chronology53);
        org.joda.time.LocalDateTime localDateTime56 = localDateTime54.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime58 = localDateTime54.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime60 = localDateTime54.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant61 = null;
        org.joda.time.DateTime dateTime62 = localDateTime60.toDateTime(readableInstant61);
        org.joda.time.DateTimeFieldType dateTimeFieldType63 = null;
        boolean boolean64 = dateTime62.isSupported(dateTimeFieldType63);
        long long65 = dateTime62.getMillis();
        org.joda.time.Chronology chronology66 = dateTime62.getChronology();
        org.joda.time.Chronology chronology67 = dateTime62.getChronology();
        org.joda.time.DateTime dateTime68 = localDateTime50.toDateTime((org.joda.time.ReadableInstant) dateTime62);
        int int69 = instant30.compareTo((org.joda.time.ReadableInstant) dateTime68);
        boolean boolean71 = dateTime68.equals((java.lang.Object) "2022-02-14T14:59:38.359");
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime29 and instant30", (dateTime29.compareTo(instant30) == 0) == dateTime29.equals(instant30));
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test579");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology1.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.Chronology chronology5 = copticChronology1.withZone(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology1.millisOfSecond();
        long long11 = copticChronology1.add(4287457L, 9935362672194L, 763);
        org.joda.time.DateTimeField dateTimeField12 = copticChronology1.dayOfWeek();
        org.joda.time.DurationField durationField13 = copticChronology1.eras();
        org.joda.time.DurationField durationField14 = copticChronology1.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField13, durationField14, and durationField13", !(durationField13.compareTo(durationField14) == 0) || (Math.signum(durationField13.compareTo(durationField13)) == Math.signum(durationField14.compareTo(durationField13))));
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test580");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.CopticChronology copticChronology2 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology2.clockhourOfDay();
        org.joda.time.DurationField durationField4 = copticChronology2.weekyears();
        org.joda.time.DurationField durationField5 = copticChronology2.centuries();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology2.weekyear();
        org.joda.time.DateTimeZone dateTimeZone7 = copticChronology2.getZone();
        java.lang.String str9 = dateTimeZone7.getName((long) 53);
        java.lang.String str11 = dateTimeZone7.getShortName((-3600001L));
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(obj0, dateTimeZone7);
        org.joda.time.chrono.CopticChronology copticChronology13 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone7);
        org.joda.time.DateTimeField dateTimeField14 = copticChronology13.secondOfDay();
        org.joda.time.DurationField durationField15 = copticChronology13.years();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology13.millisOfSecond();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField15", (durationField4.compareTo(durationField15) == 0) == durationField4.equals(durationField15));
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test581");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusSeconds((int) (short) -1);
        int int4 = localDateTime1.size();
        org.joda.time.DateTime dateTime5 = localDateTime1.toDateTime();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime7.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime7.plusWeeks((int) (byte) 10);
        int int14 = localDateTime13.getMillisOfSecond();
        int int15 = localDateTime13.getMillisOfSecond();
        java.lang.String str17 = localDateTime13.toString("+100:00");
        org.joda.time.LocalDateTime localDateTime19 = localDateTime13.withWeekyear(792);
        org.joda.time.LocalDateTime.Property property20 = localDateTime19.dayOfWeek();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime(chronology21);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime22.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime22.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime22.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.DateTime dateTime30 = localDateTime28.toDateTime(readableInstant29);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime(chronology31);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime32.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime32.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime38 = localDateTime32.plusWeeks((int) (byte) 10);
        int int39 = localDateTime38.getMillisOfSecond();
        int int40 = localDateTime38.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime42 = localDateTime38.plusHours((int) (short) -1);
        org.joda.time.DurationFieldType durationFieldType43 = null;
        boolean boolean44 = localDateTime38.isSupported(durationFieldType43);
        org.joda.time.DateTime dateTime45 = localDateTime38.toDateTime();
        boolean boolean46 = dateTime30.isAfter((org.joda.time.ReadableInstant) dateTime45);
        org.joda.time.Instant instant47 = dateTime30.toInstant();
        org.joda.time.DateTimeZone dateTimeZone48 = null;
        org.joda.time.chrono.CopticChronology copticChronology49 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone48);
        org.joda.time.DateTimeField dateTimeField50 = copticChronology49.hourOfDay();
        org.joda.time.DateTimeField dateTimeField51 = copticChronology49.centuryOfEra();
        org.joda.time.DurationField durationField52 = copticChronology49.millis();
        org.joda.time.DateTimeField dateTimeField53 = copticChronology49.secondOfDay();
        org.joda.time.DateTimeField dateTimeField54 = copticChronology49.hourOfDay();
        org.joda.time.DateTimeField dateTimeField55 = copticChronology49.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField56 = copticChronology49.era();
        boolean boolean57 = dateTime30.equals((java.lang.Object) dateTimeField56);
        org.joda.time.DateTimeZone dateTimeZone58 = null;
        org.joda.time.chrono.CopticChronology copticChronology59 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone58);
        org.joda.time.DateTimeField dateTimeField60 = copticChronology59.clockhourOfDay();
        org.joda.time.DurationField durationField61 = copticChronology59.weekyears();
        org.joda.time.DateTimeField dateTimeField62 = copticChronology59.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField63 = copticChronology59.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField64 = copticChronology59.clockhourOfHalfday();
        org.joda.time.DurationField durationField65 = copticChronology59.halfdays();
        org.joda.time.DurationField durationField66 = copticChronology59.hours();
        org.joda.time.DateTimeField dateTimeField67 = copticChronology59.minuteOfDay();
        boolean boolean68 = dateTime30.equals((java.lang.Object) copticChronology59);
        int int69 = property20.getDifference((org.joda.time.ReadableInstant) dateTime30);
        java.lang.String str70 = dateTime30.toString();
        org.joda.time.Chronology chronology71 = null;
        org.joda.time.LocalDateTime localDateTime72 = new org.joda.time.LocalDateTime(chronology71);
        org.joda.time.LocalDateTime localDateTime74 = localDateTime72.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime76 = localDateTime72.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime78 = localDateTime72.plusWeeks((int) (byte) 10);
        org.joda.time.Chronology chronology79 = null;
        org.joda.time.LocalDateTime localDateTime80 = new org.joda.time.LocalDateTime(chronology79);
        org.joda.time.LocalDateTime localDateTime82 = localDateTime80.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime84 = localDateTime80.withMillisOfSecond((int) (byte) 1);
        int int85 = localDateTime72.compareTo((org.joda.time.ReadablePartial) localDateTime80);
        org.joda.time.LocalDateTime.Property property86 = localDateTime80.weekyear();
        org.joda.time.LocalDateTime.Property property87 = localDateTime80.millisOfDay();
        org.joda.time.LocalDateTime localDateTime88 = property87.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime89 = property87.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime90 = localDateTime89.toDateTime();
        boolean boolean91 = dateTime30.isEqual((org.joda.time.ReadableInstant) dateTime90);
        boolean boolean92 = dateTime5.isBefore((org.joda.time.ReadableInstant) dateTime90);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime30 and instant47", (dateTime30.compareTo(instant47) == 0) == dateTime30.equals(instant47));
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test582");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = copticChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology1.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology1.weekyear();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((long) 53, dateTimeZone10);
        org.joda.time.Chronology chronology12 = copticChronology1.withZone(dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetMillis(633);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone14);
        long long17 = dateTimeZone10.getMillisKeepLocal(dateTimeZone14, 10598050430264L);
        java.lang.String str18 = dateTimeZone10.getID();
        long long22 = dateTimeZone10.convertLocalToUTC((long) 53777810, false, 4287268445L);
        org.joda.time.LocalDateTime localDateTime23 = org.joda.time.LocalDateTime.now(dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.chrono.CopticChronology copticChronology25 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone24);
        org.joda.time.DateTimeField dateTimeField26 = copticChronology25.clockhourOfDay();
        org.joda.time.DurationField durationField27 = copticChronology25.weekyears();
        org.joda.time.DateTimeField dateTimeField28 = copticChronology25.clockhourOfDay();
        org.joda.time.DurationField durationField29 = copticChronology25.hours();
        org.joda.time.DateTimeField dateTimeField30 = copticChronology25.yearOfEra();
        java.lang.String str31 = copticChronology25.toString();
        java.lang.String str32 = copticChronology25.toString();
        org.joda.time.DateTimeField dateTimeField33 = copticChronology25.centuryOfEra();
        org.joda.time.DurationField durationField34 = copticChronology25.years();
        long long36 = durationField34.getMillis(840);
        boolean boolean37 = localDateTime23.equals((java.lang.Object) 840);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField34", (durationField3.compareTo(durationField34) == 0) == durationField3.equals(durationField34));
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test583");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.hourOfDay();
        org.joda.time.DurationField durationField3 = copticChronology1.eras();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology1.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology1.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone6 = copticChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology1.yearOfEra();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology1.weekyear();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology1.minuteOfHour();
        long long13 = copticChronology1.add((long) 357, 4287366630L, 105);
        org.joda.time.DateTimeField dateTimeField14 = copticChronology1.clockhourOfHalfday();
        java.util.Locale.Category category15 = java.util.Locale.Category.DISPLAY;
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.chrono.CopticChronology copticChronology17 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone16);
        org.joda.time.DateTimeField dateTimeField18 = copticChronology17.dayOfMonth();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime(chronology19);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime20.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime20.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime20.plusWeeks((int) (byte) 10);
        java.util.Locale locale27 = java.util.Locale.PRC;
        java.lang.String str28 = dateTimeField18.getAsText((org.joda.time.ReadablePartial) localDateTime26, locale27);
        java.util.Set<java.lang.String> strSet29 = locale27.getUnicodeLocaleKeys();
        java.util.Locale.setDefault(category15, locale27);
        java.util.Locale locale31 = java.util.Locale.getDefault(category15);
        org.joda.time.tz.NameProvider nameProvider32 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider32);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider32);
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.chrono.CopticChronology copticChronology36 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone35);
        org.joda.time.DateTimeField dateTimeField37 = copticChronology36.hourOfDay();
        org.joda.time.DateTimeField dateTimeField38 = copticChronology36.centuryOfEra();
        org.joda.time.DurationField durationField39 = copticChronology36.millis();
        org.joda.time.DateTimeField dateTimeField40 = copticChronology36.weekOfWeekyear();
        java.util.Locale locale42 = java.util.Locale.UK;
        java.util.Locale locale43 = locale42.stripExtensions();
        java.lang.String str44 = dateTimeField40.getAsText(166, locale43);
        java.util.Locale locale45 = java.util.Locale.GERMANY;
        java.lang.String str46 = locale45.getScript();
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.chrono.CopticChronology copticChronology48 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone47);
        org.joda.time.DateTimeField dateTimeField49 = copticChronology48.clockhourOfDay();
        java.util.Locale locale51 = java.util.Locale.ITALIAN;
        java.lang.String str52 = dateTimeField49.getAsText((long) 'a', locale51);
        java.lang.String str53 = locale45.getDisplayName(locale51);
        java.lang.String str54 = locale51.getDisplayCountry();
        java.lang.String str55 = locale43.getDisplayName(locale51);
        java.lang.String str58 = nameProvider32.getShortName(locale43, "2022-02-14T14:53:48.559", "2022-02-14T14:53:50.202");
        java.util.Locale.setDefault(category15, locale43);
        int int60 = dateTimeField14.getMaximumShortTextLength(locale43);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField39", Math.signum(durationField3.compareTo(durationField39)) == -Math.signum(durationField39.compareTo(durationField3)));
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test584");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.CopticChronology copticChronology2 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology2.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology2.weekyearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone6);
        org.joda.time.DateTimeField dateTimeField8 = copticChronology7.clockhourOfDay();
        java.util.Locale locale10 = java.util.Locale.ITALIAN;
        java.lang.String str11 = dateTimeField8.getAsText((long) 'a', locale10);
        java.lang.String str12 = dateTimeField4.getAsText((int) 'a', locale10);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.chrono.CopticChronology copticChronology14 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone13);
        org.joda.time.DateTimeField dateTimeField15 = copticChronology14.clockhourOfDay();
        org.joda.time.DurationField durationField16 = copticChronology14.weekyears();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology14.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.chrono.CopticChronology copticChronology19 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone18);
        org.joda.time.DateTimeField dateTimeField20 = copticChronology19.clockhourOfDay();
        java.util.Locale locale22 = java.util.Locale.ITALIAN;
        java.lang.String str23 = dateTimeField20.getAsText((long) 'a', locale22);
        int int24 = dateTimeField17.getMaximumTextLength(locale22);
        java.lang.String str25 = locale10.getDisplayCountry(locale22);
        java.util.Locale.Builder builder26 = builder0.setLocale(locale22);
        java.util.Locale locale27 = builder0.build();
        java.util.Locale.Builder builder29 = builder0.setLanguage("year");
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.chrono.CopticChronology copticChronology31 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone30);
        org.joda.time.DateTimeField dateTimeField32 = copticChronology31.hourOfDay();
        org.joda.time.DateTimeField dateTimeField33 = copticChronology31.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField34 = copticChronology31.dayOfMonth();
        org.joda.time.tz.NameProvider nameProvider36 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.chrono.CopticChronology copticChronology38 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone37);
        org.joda.time.DateTimeField dateTimeField39 = copticChronology38.clockhourOfDay();
        org.joda.time.DurationField durationField40 = copticChronology38.weekyears();
        org.joda.time.DateTimeField dateTimeField41 = copticChronology38.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.chrono.CopticChronology copticChronology43 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone42);
        org.joda.time.DateTimeField dateTimeField44 = copticChronology43.clockhourOfDay();
        java.util.Locale locale46 = java.util.Locale.ITALIAN;
        java.lang.String str47 = dateTimeField44.getAsText((long) 'a', locale46);
        int int48 = dateTimeField41.getMaximumTextLength(locale46);
        java.lang.String str51 = nameProvider36.getName(locale46, "dayOfMonth", "GMT");
        java.lang.String str52 = locale46.getCountry();
        java.lang.String str53 = dateTimeField34.getAsShortText(10508058879L, locale46);
        java.util.Locale.Builder builder54 = builder29.setLocale(locale46);
        org.joda.time.DateTimeZone dateTimeZone55 = null;
        org.joda.time.chrono.CopticChronology copticChronology56 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone55);
        org.joda.time.DateTimeField dateTimeField57 = copticChronology56.hourOfDay();
        org.joda.time.DateTimeField dateTimeField58 = copticChronology56.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField59 = copticChronology56.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone60 = null;
        org.joda.time.chrono.CopticChronology copticChronology61 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone60);
        org.joda.time.DateTimeField dateTimeField62 = copticChronology61.hourOfDay();
        org.joda.time.DurationField durationField63 = copticChronology61.eras();
        org.joda.time.DateTimeField dateTimeField64 = copticChronology61.weekOfWeekyear();
        org.joda.time.Chronology chronology65 = null;
        org.joda.time.LocalDateTime localDateTime66 = new org.joda.time.LocalDateTime(chronology65);
        org.joda.time.LocalDateTime localDateTime68 = localDateTime66.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime.Property property69 = localDateTime68.weekOfWeekyear();
        int int70 = localDateTime68.getYear();
        org.joda.time.DateTimeZone dateTimeZone71 = null;
        org.joda.time.chrono.CopticChronology copticChronology72 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone71);
        org.joda.time.DateTimeField dateTimeField73 = copticChronology72.dayOfMonth();
        org.joda.time.Chronology chronology74 = null;
        org.joda.time.LocalDateTime localDateTime75 = new org.joda.time.LocalDateTime(chronology74);
        org.joda.time.LocalDateTime localDateTime77 = localDateTime75.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime79 = localDateTime75.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime81 = localDateTime75.plusWeeks((int) (byte) 10);
        java.util.Locale locale82 = java.util.Locale.PRC;
        java.lang.String str83 = dateTimeField73.getAsText((org.joda.time.ReadablePartial) localDateTime81, locale82);
        org.joda.time.Chronology chronology84 = null;
        org.joda.time.LocalDateTime localDateTime85 = new org.joda.time.LocalDateTime(chronology84);
        org.joda.time.LocalDateTime localDateTime87 = localDateTime85.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime89 = localDateTime85.withMillisOfSecond((int) (byte) 1);
        java.util.Locale locale91 = java.util.Locale.JAPAN;
        java.lang.String str92 = dateTimeField73.getAsText((org.joda.time.ReadablePartial) localDateTime85, 2022, locale91);
        java.lang.String str93 = dateTimeField64.getAsShortText((org.joda.time.ReadablePartial) localDateTime68, locale91);
        int int94 = dateTimeField59.getMaximumTextLength(locale91);
        java.util.Locale.Builder builder95 = builder29.setLocale(locale91);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField16 and durationField63", Math.signum(durationField16.compareTo(durationField63)) == -Math.signum(durationField63.compareTo(durationField16)));
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test585");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.weekyearOfCentury();
        org.joda.time.DurationField durationField3 = copticChronology1.seconds();
        org.joda.time.DurationField durationField4 = copticChronology1.years();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology1.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.weekyear();
        org.joda.time.DurationField durationField7 = copticChronology1.weekyears();
        org.joda.time.DurationField durationField8 = copticChronology1.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField7", (durationField4.compareTo(durationField7) == 0) == durationField4.equals(durationField7));
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test586");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = copticChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = copticChronology1.getZone();
        org.joda.time.LocalDateTime localDateTime6 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) copticChronology1);
        org.joda.time.DurationField durationField7 = copticChronology1.minutes();
        org.joda.time.DurationField durationField8 = copticChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField8, durationField3, and durationField7", !(durationField8.compareTo(durationField3) == 0) || (Math.signum(durationField8.compareTo(durationField7)) == Math.signum(durationField3.compareTo(durationField7))));
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test587");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology1.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology1.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.chrono.CopticChronology copticChronology6 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone5);
        org.joda.time.DateTimeField dateTimeField7 = copticChronology6.hourOfDay();
        org.joda.time.DurationField durationField8 = copticChronology6.eras();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology6.weekOfWeekyear();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(chronology10);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.weekOfWeekyear();
        int int15 = localDateTime13.getYear();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.chrono.CopticChronology copticChronology17 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone16);
        org.joda.time.DateTimeField dateTimeField18 = copticChronology17.dayOfMonth();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime(chronology19);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime20.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime20.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime20.plusWeeks((int) (byte) 10);
        java.util.Locale locale27 = java.util.Locale.PRC;
        java.lang.String str28 = dateTimeField18.getAsText((org.joda.time.ReadablePartial) localDateTime26, locale27);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime(chronology29);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime30.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime30.withMillisOfSecond((int) (byte) 1);
        java.util.Locale locale36 = java.util.Locale.JAPAN;
        java.lang.String str37 = dateTimeField18.getAsText((org.joda.time.ReadablePartial) localDateTime30, 2022, locale36);
        java.lang.String str38 = dateTimeField9.getAsShortText((org.joda.time.ReadablePartial) localDateTime13, locale36);
        int int39 = dateTimeField4.getMaximumTextLength(locale36);
        int int40 = dateTimeField4.getMinimumValue();
        int int42 = dateTimeField4.get(4287289035L);
        int int45 = dateTimeField4.getDifference(510L, 4461014001L);
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.chrono.CopticChronology copticChronology47 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone46);
        org.joda.time.DateTimeField dateTimeField48 = copticChronology47.hourOfDay();
        org.joda.time.DateTimeField dateTimeField49 = copticChronology47.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField50 = copticChronology47.dayOfWeek();
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.LocalDateTime localDateTime52 = new org.joda.time.LocalDateTime(chronology51);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray53 = localDateTime52.getFieldTypes();
        org.joda.time.LocalDateTime localDateTime55 = localDateTime52.withMillisOfDay((int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime57 = localDateTime55.plusWeeks((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone59 = null;
        org.joda.time.chrono.CopticChronology copticChronology60 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone59);
        org.joda.time.DateTimeField dateTimeField61 = copticChronology60.hourOfDay();
        org.joda.time.DateTimeField dateTimeField62 = copticChronology60.secondOfDay();
        org.joda.time.DateTimeField dateTimeField63 = copticChronology60.secondOfDay();
        org.joda.time.LocalDateTime localDateTime64 = new org.joda.time.LocalDateTime((long) 10, (org.joda.time.Chronology) copticChronology60);
        int int65 = localDateTime64.getDayOfYear();
        boolean boolean66 = localDateTime57.isEqual((org.joda.time.ReadablePartial) localDateTime64);
        org.joda.time.DateTimeZone dateTimeZone67 = null;
        org.joda.time.chrono.CopticChronology copticChronology68 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone67);
        org.joda.time.DateTimeField dateTimeField69 = copticChronology68.hourOfDay();
        org.joda.time.DateTimeField dateTimeField70 = copticChronology68.centuryOfEra();
        org.joda.time.DurationField durationField71 = copticChronology68.millis();
        org.joda.time.DateTimeField dateTimeField72 = copticChronology68.weekOfWeekyear();
        org.joda.time.Chronology chronology73 = null;
        org.joda.time.LocalDateTime localDateTime74 = new org.joda.time.LocalDateTime(chronology73);
        org.joda.time.LocalDateTime localDateTime76 = localDateTime74.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime78 = localDateTime74.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime80 = localDateTime74.plusWeeks((int) (byte) 10);
        org.joda.time.Chronology chronology81 = null;
        org.joda.time.LocalDateTime localDateTime82 = new org.joda.time.LocalDateTime(chronology81);
        org.joda.time.LocalDateTime localDateTime84 = localDateTime82.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime86 = localDateTime82.withMillisOfSecond((int) (byte) 1);
        int int87 = localDateTime74.compareTo((org.joda.time.ReadablePartial) localDateTime82);
        org.joda.time.LocalDateTime.Property property88 = localDateTime82.weekyear();
        org.joda.time.LocalDateTime localDateTime90 = localDateTime82.minusMillis(2022);
        int[] intArray92 = copticChronology68.get((org.joda.time.ReadablePartial) localDateTime82, (long) '#');
        int int93 = dateTimeField50.getMinimumValue((org.joda.time.ReadablePartial) localDateTime64, intArray92);
        org.joda.time.LocalDateTime.Property property94 = localDateTime64.monthOfYear();
        java.lang.String str95 = localDateTime64.toString();
        org.joda.time.LocalDateTime.Property property96 = localDateTime64.era();
        org.joda.time.LocalDateTime localDateTime98 = localDateTime64.minusMillis(53887918);
        int int99 = dateTimeField4.getMinimumValue((org.joda.time.ReadablePartial) localDateTime98);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField8 and durationField71", Math.signum(durationField8.compareTo(durationField71)) == -Math.signum(durationField71.compareTo(durationField8)));
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test588");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.withYearOfCentury(0);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.weekyear();
        org.joda.time.LocalDateTime localDateTime10 = property8.setCopy((int) (byte) 1);
        org.joda.time.DurationField durationField11 = property8.getLeapDurationField();
        org.joda.time.LocalDateTime localDateTime12 = property8.getLocalDateTime();
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.weekOfWeekyear();
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.DateTime dateTime15 = localDateTime12.toDateTime(readableInstant14);
        org.joda.time.Instant instant16 = dateTime15.toInstant();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.chrono.CopticChronology copticChronology19 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone18);
        org.joda.time.DateTimeField dateTimeField20 = copticChronology19.hourOfDay();
        org.joda.time.DateTimeField dateTimeField21 = copticChronology19.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.Chronology chronology23 = copticChronology19.withZone(dateTimeZone22);
        org.joda.time.DateTimeField dateTimeField24 = copticChronology19.weekyear();
        org.joda.time.DurationField durationField25 = copticChronology19.weeks();
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime(4287306418L, (org.joda.time.Chronology) copticChronology19);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.chrono.CopticChronology copticChronology28 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone27);
        org.joda.time.DateTimeField dateTimeField29 = copticChronology28.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField30 = copticChronology28.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone31 = copticChronology28.getZone();
        org.joda.time.Chronology chronology32 = copticChronology28.withUTC();
        org.joda.time.DateTimeField dateTimeField33 = copticChronology28.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.chrono.CopticChronology copticChronology36 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone35);
        org.joda.time.DateTimeField dateTimeField37 = copticChronology36.hourOfDay();
        org.joda.time.DateTimeField dateTimeField38 = copticChronology36.secondOfDay();
        org.joda.time.DateTimeField dateTimeField39 = copticChronology36.secondOfDay();
        org.joda.time.DateTimeField dateTimeField40 = copticChronology36.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField41 = copticChronology36.monthOfYear();
        org.joda.time.DurationField durationField42 = copticChronology36.days();
        org.joda.time.LocalDateTime localDateTime43 = new org.joda.time.LocalDateTime(10598050427926L, (org.joda.time.Chronology) copticChronology36);
        org.joda.time.LocalDateTime localDateTime45 = localDateTime43.minusYears(52);
        java.lang.String str46 = localDateTime45.toString();
        int[] intArray48 = copticChronology28.get((org.joda.time.ReadablePartial) localDateTime45, (-292275054L));
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.LocalDateTime localDateTime51 = new org.joda.time.LocalDateTime((long) 26, dateTimeZone50);
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.LocalDateTime localDateTime53 = new org.joda.time.LocalDateTime(chronology52);
        org.joda.time.LocalDateTime localDateTime55 = localDateTime53.minusSeconds((int) (short) -1);
        int int56 = localDateTime53.size();
        org.joda.time.DateTime dateTime57 = localDateTime53.toDateTime();
        org.joda.time.DateTime dateTime58 = localDateTime51.toDateTime((org.joda.time.ReadableInstant) dateTime57);
        org.joda.time.Chronology chronology59 = null;
        org.joda.time.LocalDateTime localDateTime60 = new org.joda.time.LocalDateTime(chronology59);
        org.joda.time.LocalDateTime localDateTime62 = localDateTime60.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime64 = localDateTime60.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime66 = localDateTime60.withYearOfCentury(0);
        org.joda.time.LocalDateTime.Property property67 = localDateTime66.weekyear();
        org.joda.time.LocalDateTime localDateTime69 = property67.setCopy((int) (byte) 1);
        long long70 = property67.remainder();
        org.joda.time.LocalDateTime localDateTime71 = property67.withMinimumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType72 = property67.getFieldType();
        int int73 = dateTime57.get(dateTimeFieldType72);
        boolean boolean74 = localDateTime45.isSupported(dateTimeFieldType72);
        int int75 = localDateTime26.get(dateTimeFieldType72);
        boolean boolean76 = dateTime15.isSupported(dateTimeFieldType72);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField11 and durationField25", (durationField11.compareTo(durationField25) == 0) == durationField11.equals(durationField25));
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test589");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.DateTime dateTime9 = localDateTime7.toDateTime(readableInstant8);
        org.joda.time.LocalDateTime.Property property10 = localDateTime7.millisOfDay();
        org.joda.time.DurationField durationField11 = property10.getRangeDurationField();
        org.joda.time.DurationField durationField12 = property10.getLeapDurationField();
        org.joda.time.LocalDateTime localDateTime14 = property10.setCopy(122);
        int int15 = property10.getMinimumValueOverall();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(chronology16);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime17.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime17.plusWeeks((int) (byte) 10);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime(chronology24);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime25.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime25.withMillisOfSecond((int) (byte) 1);
        int int30 = localDateTime17.compareTo((org.joda.time.ReadablePartial) localDateTime25);
        org.joda.time.LocalDateTime.Property property31 = localDateTime25.weekyear();
        org.joda.time.LocalDateTime.Property property32 = localDateTime25.millisOfDay();
        org.joda.time.LocalDateTime localDateTime33 = property32.roundHalfCeilingCopy();
        java.lang.String str34 = property32.getAsText();
        org.joda.time.DateTimeField dateTimeField35 = property32.getField();
        org.joda.time.LocalDateTime localDateTime36 = property32.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime38 = property32.addWrapFieldToCopy(1);
        org.joda.time.DurationField durationField39 = property32.getRangeDurationField();
        org.joda.time.LocalDateTime localDateTime40 = property32.withMinimumValue();
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime(chronology41);
        org.joda.time.LocalDateTime localDateTime44 = localDateTime42.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime46 = localDateTime42.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime48 = localDateTime42.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant49 = null;
        org.joda.time.DateTime dateTime50 = localDateTime48.toDateTime(readableInstant49);
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.LocalDateTime localDateTime52 = new org.joda.time.LocalDateTime(chronology51);
        org.joda.time.LocalDateTime localDateTime54 = localDateTime52.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime56 = localDateTime52.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime58 = localDateTime52.plusWeeks((int) (byte) 10);
        int int59 = localDateTime58.getMillisOfSecond();
        int int60 = localDateTime58.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime62 = localDateTime58.plusHours((int) (short) -1);
        org.joda.time.DurationFieldType durationFieldType63 = null;
        boolean boolean64 = localDateTime58.isSupported(durationFieldType63);
        org.joda.time.DateTime dateTime65 = localDateTime58.toDateTime();
        boolean boolean66 = dateTime50.isAfter((org.joda.time.ReadableInstant) dateTime65);
        org.joda.time.Instant instant67 = dateTime50.toInstant();
        long long68 = property32.getDifferenceAsLong((org.joda.time.ReadableInstant) instant67);
        int int69 = property10.compareTo((org.joda.time.ReadableInstant) instant67);
        int int70 = property10.get();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime50 and instant67", (dateTime50.compareTo(instant67) == 0) == dateTime50.equals(instant67));
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test590");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.CopticChronology copticChronology2 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology2.hourOfDay();
        org.joda.time.DurationField durationField4 = copticChronology2.eras();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology2.weekyear();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) (-292275054), (org.joda.time.Chronology) copticChronology2);
        org.joda.time.DateTimeZone dateTimeZone7 = copticChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology2.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology2.monthOfYear();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology2.era();
        org.joda.time.DurationField durationField11 = copticChronology2.months();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField4, durationField11, and durationField4", !(durationField4.compareTo(durationField11) == 0) || (Math.signum(durationField4.compareTo(durationField4)) == Math.signum(durationField11.compareTo(durationField4))));
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test591");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.hourOfDay();
        org.joda.time.DurationField durationField3 = copticChronology1.eras();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology1.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology1.monthOfYear();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.millisOfDay();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology1.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.chrono.CopticChronology copticChronology10 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField11 = copticChronology10.hourOfDay();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology10.secondOfDay();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology10.minuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.chrono.CopticChronology copticChronology16 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField17 = copticChronology16.hourOfDay();
        org.joda.time.DateTimeField dateTimeField18 = copticChronology16.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.Chronology chronology20 = copticChronology16.withZone(dateTimeZone19);
        org.joda.time.DateTimeField dateTimeField21 = copticChronology16.millisOfSecond();
        org.joda.time.DurationField durationField22 = copticChronology16.hours();
        org.joda.time.DateTimeField dateTimeField23 = copticChronology16.dayOfMonth();
        org.joda.time.DurationField durationField24 = copticChronology16.weeks();
        org.joda.time.DateTimeField dateTimeField25 = copticChronology16.monthOfYear();
        java.util.Locale locale27 = java.util.Locale.TAIWAN;
        java.lang.String str28 = locale27.getVariant();
        java.lang.String str29 = dateTimeField25.getAsText(4287238068L, locale27);
        java.lang.String str30 = dateTimeField13.getAsShortText(526, locale27);
        java.lang.String str31 = dateTimeField7.getAsShortText(0, locale27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField22", Math.signum(durationField3.compareTo(durationField22)) == -Math.signum(durationField22.compareTo(durationField3)));
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test592");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = copticChronology1.weekyears();
        org.joda.time.DurationField durationField4 = copticChronology1.hours();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology1.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone6 = copticChronology1.getZone();
        org.joda.time.DateTimeZone dateTimeZone7 = copticChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology1.weekOfWeekyear();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime(chronology9);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime10.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime10.withYearOfCentury(0);
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.weekyear();
        org.joda.time.LocalDateTime localDateTime19 = property17.setCopy((int) (byte) 1);
        org.joda.time.DurationField durationField20 = property17.getLeapDurationField();
        org.joda.time.LocalDateTime localDateTime21 = property17.getLocalDateTime();
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.plusWeeks(522);
        int[] intArray25 = copticChronology1.get((org.joda.time.ReadablePartial) localDateTime23, (long) 632);
        org.joda.time.Chronology chronology26 = copticChronology1.withUTC();
        org.joda.time.DurationField durationField27 = copticChronology1.years();
        org.joda.time.DateTimeField dateTimeField28 = copticChronology1.era();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField27", (durationField3.compareTo(durationField27) == 0) == durationField3.equals(durationField27));
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test593");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology1.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology1.dayOfWeek();
        org.joda.time.DurationField durationField5 = copticChronology1.eras();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology1.dayOfYear();
        org.joda.time.DurationField durationField8 = copticChronology1.years();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField5, durationField8, and durationField5", !(durationField5.compareTo(durationField8) == 0) || (Math.signum(durationField5.compareTo(durationField5)) == Math.signum(durationField8.compareTo(durationField5))));
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test594");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology1.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.Chronology chronology5 = copticChronology1.withZone(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology1.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology1.year();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology1.minuteOfDay();
        org.joda.time.DurationField durationField10 = copticChronology1.centuries();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology1.hourOfHalfday();
        org.joda.time.DurationField durationField12 = copticChronology1.eras();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology1.dayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField10 and durationField12", Math.signum(durationField10.compareTo(durationField12)) == -Math.signum(durationField12.compareTo(durationField10)));
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test595");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.CopticChronology copticChronology2 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology2.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology2.secondOfDay();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology2.secondOfDay();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology2.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology2.monthOfYear();
        org.joda.time.DurationField durationField8 = copticChronology2.days();
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(10598050427926L, (org.joda.time.Chronology) copticChronology2);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.minusYears(52);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.chrono.CopticChronology copticChronology13 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone12);
        org.joda.time.DateTimeField dateTimeField14 = copticChronology13.dayOfMonth();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(chronology15);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime16.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime16.plusWeeks((int) (byte) 10);
        java.util.Locale locale23 = java.util.Locale.PRC;
        java.lang.String str24 = dateTimeField14.getAsText((org.joda.time.ReadablePartial) localDateTime22, locale23);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime(chronology25);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime26.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime26.withMillisOfSecond((int) (byte) 1);
        java.util.Locale locale32 = java.util.Locale.JAPAN;
        java.lang.String str33 = dateTimeField14.getAsText((org.joda.time.ReadablePartial) localDateTime26, 2022, locale32);
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = dateTimeField14.getType();
        int int35 = localDateTime11.get(dateTimeFieldType34);
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.chrono.CopticChronology copticChronology37 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone36);
        org.joda.time.DateTimeField dateTimeField38 = copticChronology37.clockhourOfDay();
        org.joda.time.DurationField durationField39 = copticChronology37.weekyears();
        org.joda.time.DurationField durationField40 = copticChronology37.centuries();
        org.joda.time.DateTimeField dateTimeField41 = copticChronology37.weekyear();
        org.joda.time.DateTimeZone dateTimeZone42 = copticChronology37.getZone();
        org.joda.time.DateTimeField dateTimeField43 = copticChronology37.monthOfYear();
        org.joda.time.LocalDateTime localDateTime44 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) copticChronology37);
        org.joda.time.DurationField durationField45 = copticChronology37.years();
        org.joda.time.DurationFieldType durationFieldType46 = durationField45.getType();
        boolean boolean47 = localDateTime11.isSupported(durationFieldType46);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField39 and durationField45", (durationField39.compareTo(durationField45) == 0) == durationField39.equals(durationField45));
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test596");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.weekyearOfCentury();
        org.joda.time.DurationField durationField3 = copticChronology1.seconds();
        org.joda.time.DurationField durationField4 = copticChronology1.years();
        org.joda.time.DateTimeZone dateTimeZone5 = copticChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.chrono.CopticChronology copticChronology8 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone7);
        org.joda.time.DateTimeField dateTimeField9 = copticChronology8.hourOfDay();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology8.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology8.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime12 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) copticChronology8);
        java.util.Locale locale14 = null;
        java.lang.String str15 = localDateTime12.toString("0", locale14);
        org.joda.time.Chronology chronology16 = localDateTime12.getChronology();
        org.joda.time.LocalDateTime localDateTime17 = org.joda.time.LocalDateTime.now(chronology16);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.chrono.CopticChronology copticChronology19 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone18);
        org.joda.time.DateTimeField dateTimeField20 = copticChronology19.hourOfDay();
        org.joda.time.DateTimeField dateTimeField21 = copticChronology19.secondOfDay();
        org.joda.time.DurationField durationField22 = copticChronology19.years();
        org.joda.time.DateTimeField dateTimeField23 = copticChronology19.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime((org.joda.time.Chronology) copticChronology19);
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime17, (org.joda.time.Chronology) copticChronology19);
        org.joda.time.LocalDateTime.Property property26 = localDateTime25.year();
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.chrono.CopticChronology copticChronology28 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone27);
        org.joda.time.DateTimeField dateTimeField29 = copticChronology28.clockhourOfDay();
        org.joda.time.DurationField durationField30 = copticChronology28.weekyears();
        org.joda.time.DateTimeField dateTimeField31 = copticChronology28.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone32 = copticChronology28.getZone();
        org.joda.time.DurationField durationField33 = copticChronology28.centuries();
        org.joda.time.DurationField durationField34 = copticChronology28.weeks();
        java.util.TimeZone timeZone35 = null;
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forTimeZone(timeZone35);
        java.lang.String str38 = dateTimeZone36.getNameKey((long) (byte) 0);
        org.joda.time.LocalDateTime localDateTime39 = new org.joda.time.LocalDateTime(dateTimeZone36);
        org.joda.time.Chronology chronology40 = copticChronology28.withZone(dateTimeZone36);
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime(chronology41);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray43 = localDateTime42.getFieldTypes();
        org.joda.time.LocalDateTime localDateTime45 = localDateTime42.plusMinutes(1);
        int int46 = localDateTime45.size();
        long long48 = copticChronology28.set((org.joda.time.ReadablePartial) localDateTime45, 0L);
        org.joda.time.ReadablePeriod readablePeriod49 = null;
        long long52 = copticChronology28.add(readablePeriod49, (-67737599426L), 950);
        org.joda.time.LocalDateTime localDateTime54 = new org.joda.time.LocalDateTime(15873472800000L);
        org.joda.time.LocalDateTime localDateTime56 = localDateTime54.withMillisOfDay(53726845);
        int[] intArray58 = copticChronology28.get((org.joda.time.ReadablePartial) localDateTime56, (long) 53738468);
        copticChronology1.validate((org.joda.time.ReadablePartial) localDateTime25, intArray58);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField30", (durationField4.compareTo(durationField30) == 0) == durationField4.equals(durationField30));
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test597");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.CopticChronology copticChronology2 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology2.hourOfDay();
        org.joda.time.DurationField durationField4 = copticChronology2.eras();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology2.weekyear();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) (-292275054), (org.joda.time.Chronology) copticChronology2);
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.minus(readableDuration7);
        int int9 = localDateTime8.getEra();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(chronology10);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime11.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.withMillisOfSecond((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime15.withMinuteOfHour(10);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime15.minusDays(100);
        org.joda.time.LocalDateTime.Property property22 = localDateTime21.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime24 = property22.addToCopy((long) 271);
        org.joda.time.LocalDateTime.Property property25 = localDateTime24.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.chrono.CopticChronology copticChronology27 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone26);
        org.joda.time.DateTimeField dateTimeField28 = copticChronology27.clockhourOfDay();
        org.joda.time.DurationField durationField29 = copticChronology27.weekyears();
        org.joda.time.DateTimeField dateTimeField30 = copticChronology27.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone31 = copticChronology27.getZone();
        org.joda.time.LocalDateTime localDateTime32 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) copticChronology27);
        org.joda.time.DurationField durationField33 = copticChronology27.weekyears();
        org.joda.time.DateTimeField dateTimeField34 = copticChronology27.hourOfHalfday();
        org.joda.time.DurationField durationField35 = copticChronology27.hours();
        java.util.TimeZone timeZone36 = null;
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forTimeZone(timeZone36);
        java.lang.String str39 = dateTimeZone37.getNameKey((long) (byte) 0);
        org.joda.time.LocalDateTime localDateTime40 = new org.joda.time.LocalDateTime(dateTimeZone37);
        java.util.TimeZone timeZone41 = null;
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.forTimeZone(timeZone41);
        java.lang.String str44 = dateTimeZone42.getNameKey((long) (byte) 0);
        org.joda.time.LocalDateTime localDateTime45 = new org.joda.time.LocalDateTime(dateTimeZone42);
        boolean boolean46 = localDateTime40.isEqual((org.joda.time.ReadablePartial) localDateTime45);
        int[] intArray48 = copticChronology27.get((org.joda.time.ReadablePartial) localDateTime45, (long) 30);
        org.joda.time.LocalDateTime localDateTime50 = localDateTime45.minusSeconds((int) (short) 1);
        boolean boolean51 = localDateTime24.equals((java.lang.Object) localDateTime45);
        boolean boolean52 = localDateTime8.isEqual((org.joda.time.ReadablePartial) localDateTime45);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField4 and durationField29", Math.signum(durationField4.compareTo(durationField29)) == -Math.signum(durationField29.compareTo(durationField4)));
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test598");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.weekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime7 = localDateTime3.withPeriodAdded(readablePeriod5, 8);
        org.joda.time.LocalDateTime.Property property8 = localDateTime3.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime9 = property8.withMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.chrono.CopticChronology copticChronology11 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone10);
        org.joda.time.DateTimeField dateTimeField12 = copticChronology11.clockhourOfDay();
        org.joda.time.DurationField durationField13 = copticChronology11.weekyears();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology11.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone15 = copticChronology11.getZone();
        org.joda.time.LocalDateTime localDateTime16 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) copticChronology11);
        org.joda.time.DurationField durationField17 = copticChronology11.weekyears();
        org.joda.time.DateTimeField dateTimeField18 = copticChronology11.hourOfHalfday();
        org.joda.time.DurationField durationField19 = copticChronology11.hours();
        java.util.TimeZone timeZone20 = null;
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forTimeZone(timeZone20);
        java.lang.String str23 = dateTimeZone21.getNameKey((long) (byte) 0);
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime(dateTimeZone21);
        java.util.TimeZone timeZone25 = null;
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forTimeZone(timeZone25);
        java.lang.String str28 = dateTimeZone26.getNameKey((long) (byte) 0);
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime(dateTimeZone26);
        boolean boolean30 = localDateTime24.isEqual((org.joda.time.ReadablePartial) localDateTime29);
        int[] intArray32 = copticChronology11.get((org.joda.time.ReadablePartial) localDateTime29, (long) 30);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime29.minusSeconds((int) (short) 1);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.LocalDateTime localDateTime36 = new org.joda.time.LocalDateTime(chronology35);
        org.joda.time.LocalDateTime localDateTime38 = localDateTime36.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime40 = localDateTime36.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime42 = localDateTime36.plusWeeks((int) (byte) 10);
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.LocalDateTime localDateTime44 = new org.joda.time.LocalDateTime(chronology43);
        org.joda.time.LocalDateTime localDateTime46 = localDateTime44.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime48 = localDateTime44.withMillisOfSecond((int) (byte) 1);
        int int49 = localDateTime36.compareTo((org.joda.time.ReadablePartial) localDateTime44);
        org.joda.time.LocalDateTime.Property property50 = localDateTime44.weekyear();
        org.joda.time.LocalDateTime.Property property51 = localDateTime44.millisOfDay();
        org.joda.time.LocalDateTime localDateTime52 = property51.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime53 = property51.roundCeilingCopy();
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.LocalDateTime localDateTime55 = new org.joda.time.LocalDateTime(chronology54);
        org.joda.time.LocalDateTime localDateTime57 = localDateTime55.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime59 = localDateTime55.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime61 = localDateTime55.withYearOfCentury(0);
        org.joda.time.LocalDateTime.Property property62 = localDateTime61.weekyear();
        org.joda.time.LocalDateTime localDateTime64 = property62.setCopy((int) (byte) 1);
        org.joda.time.DurationField durationField65 = property62.getLeapDurationField();
        org.joda.time.LocalDateTime localDateTime66 = property62.getLocalDateTime();
        org.joda.time.LocalDateTime localDateTime68 = localDateTime66.plusWeeks(522);
        org.joda.time.DateTimeZone dateTimeZone69 = null;
        org.joda.time.chrono.CopticChronology copticChronology70 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone69);
        org.joda.time.DateTimeField dateTimeField71 = copticChronology70.clockhourOfDay();
        org.joda.time.DurationField durationField72 = copticChronology70.weekyears();
        org.joda.time.DateTimeField dateTimeField73 = copticChronology70.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone74 = copticChronology70.getZone();
        org.joda.time.LocalDateTime localDateTime75 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) copticChronology70);
        org.joda.time.DurationField durationField76 = copticChronology70.weekyears();
        org.joda.time.DateTimeField dateTimeField77 = copticChronology70.hourOfHalfday();
        org.joda.time.DurationField durationField78 = copticChronology70.hours();
        org.joda.time.DurationFieldType durationFieldType79 = durationField78.getType();
        org.joda.time.LocalDateTime localDateTime81 = localDateTime66.withFieldAdded(durationFieldType79, 0);
        boolean boolean82 = localDateTime53.isSupported(durationFieldType79);
        org.joda.time.LocalDateTime localDateTime84 = localDateTime34.withFieldAdded(durationFieldType79, 268);
        org.joda.time.LocalDateTime localDateTime86 = localDateTime84.plusMinutes(152);
        int int87 = property8.compareTo((org.joda.time.ReadablePartial) localDateTime84);
        org.joda.time.LocalDateTime.Property property88 = localDateTime84.era();
        org.joda.time.DurationField durationField89 = property88.getDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField89, durationField13, and durationField19", !(durationField89.compareTo(durationField13) == 0) || (Math.signum(durationField89.compareTo(durationField19)) == Math.signum(durationField13.compareTo(durationField19))));
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test599");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.secondOfDay();
        org.joda.time.DurationField durationField2 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.chrono.CopticChronology copticChronology5 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField6 = copticChronology5.clockhourOfDay();
        org.joda.time.DurationField durationField7 = copticChronology5.weekyears();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology5.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology5.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology5.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology5.weekyear();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((long) 53, dateTimeZone14);
        org.joda.time.Chronology chronology16 = copticChronology5.withZone(dateTimeZone14);
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(dateTimeZone14);
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime(dateTimeZone14);
        java.util.TimeZone timeZone19 = dateTimeZone14.toTimeZone();
        org.joda.time.Chronology chronology20 = copticChronology0.withZone(dateTimeZone14);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField2 and durationField7", Math.signum(durationField2.compareTo(durationField7)) == -Math.signum(durationField7.compareTo(durationField2)));
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test600");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology1.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.Chronology chronology5 = copticChronology1.withZone(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.millisOfSecond();
        org.joda.time.DurationField durationField7 = copticChronology1.hours();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology1.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology1.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology1.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.chrono.CopticChronology copticChronology12 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone11);
        org.joda.time.DateTimeField dateTimeField13 = copticChronology12.clockhourOfDay();
        org.joda.time.DurationField durationField14 = copticChronology12.weekyears();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology12.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology12.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology12.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField18 = copticChronology12.weekyear();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime((long) 53, dateTimeZone21);
        org.joda.time.Chronology chronology23 = copticChronology12.withZone(dateTimeZone21);
        boolean boolean24 = copticChronology1.equals((java.lang.Object) copticChronology12);
        org.joda.time.DurationField durationField25 = copticChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField26 = copticChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField27 = copticChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField28 = copticChronology1.weekyearOfCentury();
        org.joda.time.DurationField durationField29 = copticChronology1.hours();
        org.joda.time.DurationField durationField30 = copticChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField30, durationField7, and durationField14", !(durationField30.compareTo(durationField7) == 0) || (Math.signum(durationField30.compareTo(durationField14)) == Math.signum(durationField7.compareTo(durationField14))));
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test601");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = copticChronology1.weekyears();
        org.joda.time.DurationField durationField4 = copticChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology1.era();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.chrono.CopticChronology copticChronology8 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone7);
        org.joda.time.DateTimeField dateTimeField9 = copticChronology8.hourOfDay();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology8.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.Chronology chronology12 = copticChronology8.withZone(dateTimeZone11);
        org.joda.time.DateTimeField dateTimeField13 = copticChronology8.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology8.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone15 = copticChronology8.getZone();
        org.joda.time.DurationField durationField16 = copticChronology8.eras();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime(chronology17);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime18.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime18.plusWeeks((int) (byte) 10);
        int int25 = localDateTime24.getMillisOfSecond();
        int int26 = localDateTime24.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime28 = localDateTime24.plusHours((int) (short) -1);
        org.joda.time.DurationFieldType durationFieldType29 = null;
        boolean boolean30 = localDateTime24.isSupported(durationFieldType29);
        int[] intArray32 = copticChronology8.get((org.joda.time.ReadablePartial) localDateTime24, (long) 761);
        int int33 = dateTimeField6.getMinimumValue((org.joda.time.ReadablePartial) localDateTime24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField16", Math.signum(durationField3.compareTo(durationField16)) == -Math.signum(durationField16.compareTo(durationField3)));
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test602");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology1.weekyearOfCentury();
        org.joda.time.DurationField durationField4 = copticChronology1.years();
        org.joda.time.DurationField durationField5 = copticChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.millisOfSecond();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField5", (durationField4.compareTo(durationField5) == 0) == durationField4.equals(durationField5));
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test603");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = copticChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = copticChronology1.getZone();
        org.joda.time.DurationField durationField6 = copticChronology1.centuries();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology1.dayOfYear();
        org.joda.time.DurationField durationField8 = copticChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology1.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField11 = copticChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField11, durationField3, and durationField6", !(durationField11.compareTo(durationField3) == 0) || (Math.signum(durationField11.compareTo(durationField6)) == Math.signum(durationField3.compareTo(durationField6))));
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test604");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = copticChronology1.weekyears();
        org.joda.time.DurationField durationField4 = copticChronology1.hours();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology1.dayOfMonth();
        org.joda.time.DurationField durationField6 = copticChronology1.years();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetHours(9);
        boolean boolean9 = dateTimeZone8.isFixed();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone8);
        org.joda.time.Chronology chronology11 = copticChronology1.withZone(dateTimeZone8);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField6", (durationField3.compareTo(durationField6) == 0) == durationField3.equals(durationField6));
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test605");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = copticChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology1.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology1.weekyear();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((long) 53, dateTimeZone10);
        org.joda.time.Chronology chronology12 = copticChronology1.withZone(dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetMillis(633);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone14);
        long long17 = dateTimeZone10.getMillisKeepLocal(dateTimeZone14, 10598050430264L);
        org.joda.time.chrono.CopticChronology copticChronology18 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone10);
        org.joda.time.DurationField durationField19 = copticChronology18.seconds();
        org.joda.time.DateTimeField dateTimeField20 = copticChronology18.halfdayOfDay();
        org.joda.time.DurationField durationField21 = copticChronology18.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField21, durationField3, and durationField19", !(durationField21.compareTo(durationField3) == 0) || (Math.signum(durationField21.compareTo(durationField19)) == Math.signum(durationField3.compareTo(durationField19))));
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test606");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology1.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.Chronology chronology5 = copticChronology1.withZone(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology1.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology1.year();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology1.minuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.chrono.CopticChronology copticChronology11 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone10);
        org.joda.time.DateTimeField dateTimeField12 = copticChronology11.clockhourOfDay();
        org.joda.time.DurationField durationField13 = copticChronology11.weekyears();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology11.clockhourOfDay();
        int int15 = dateTimeField14.getMaximumValue();
        long long18 = dateTimeField14.addWrapField((long) 22, 10);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime(chronology19);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime20.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime.Property property23 = localDateTime22.weekOfWeekyear();
        org.joda.time.LocalDateTime.Property property24 = localDateTime22.centuryOfEra();
        java.util.Locale locale25 = java.util.Locale.GERMANY;
        java.lang.String str26 = locale25.getScript();
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.chrono.CopticChronology copticChronology28 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone27);
        org.joda.time.DateTimeField dateTimeField29 = copticChronology28.clockhourOfDay();
        java.util.Locale locale31 = java.util.Locale.ITALIAN;
        java.lang.String str32 = dateTimeField29.getAsText((long) 'a', locale31);
        java.lang.String str33 = locale25.getDisplayName(locale31);
        java.lang.String str34 = locale31.getISO3Language();
        boolean boolean35 = locale31.hasExtensions();
        java.util.Locale locale36 = locale31.stripExtensions();
        java.lang.String str37 = dateTimeField14.getAsShortText((org.joda.time.ReadablePartial) localDateTime22, locale36);
        org.joda.time.LocalDateTime localDateTime39 = localDateTime22.withMillisOfSecond(279);
        long long41 = copticChronology1.set((org.joda.time.ReadablePartial) localDateTime39, 0L);
        org.joda.time.DateTimeField dateTimeField42 = copticChronology1.clockhourOfHalfday();
        org.joda.time.DurationField durationField43 = copticChronology1.eras();
        org.joda.time.DateTimeField dateTimeField44 = copticChronology1.dayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField13 and durationField43", Math.signum(durationField13.compareTo(durationField43)) == -Math.signum(durationField43.compareTo(durationField13)));
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test607");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology1.secondOfDay();
        org.joda.time.DurationField durationField4 = copticChronology1.years();
        org.joda.time.DurationField durationField5 = copticChronology1.weeks();
        org.joda.time.DateTimeZone dateTimeZone6 = copticChronology1.getZone();
        org.joda.time.DurationField durationField7 = copticChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology1.millisOfSecond();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField7", (durationField4.compareTo(durationField7) == 0) == durationField4.equals(durationField7));
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test608");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.CopticChronology copticChronology2 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology2.clockhourOfDay();
        org.joda.time.DurationField durationField4 = copticChronology2.weekyears();
        org.joda.time.DurationField durationField5 = copticChronology2.centuries();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology2.weekyear();
        org.joda.time.DateTimeZone dateTimeZone7 = copticChronology2.getZone();
        java.lang.String str9 = dateTimeZone7.getName((long) 53);
        java.lang.String str11 = dateTimeZone7.getShortName((-3600001L));
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(obj0, dateTimeZone7);
        org.joda.time.chrono.CopticChronology copticChronology13 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone7);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime(chronology14);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray16 = localDateTime15.getFieldTypes();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime15.withMillisOfDay((int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.plusWeeks((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.chrono.CopticChronology copticChronology23 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone22);
        org.joda.time.DateTimeField dateTimeField24 = copticChronology23.hourOfDay();
        org.joda.time.DateTimeField dateTimeField25 = copticChronology23.secondOfDay();
        org.joda.time.DateTimeField dateTimeField26 = copticChronology23.secondOfDay();
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime((long) 10, (org.joda.time.Chronology) copticChronology23);
        int int28 = localDateTime27.getDayOfYear();
        boolean boolean29 = localDateTime20.isEqual((org.joda.time.ReadablePartial) localDateTime27);
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime(chronology30);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime31.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime35 = localDateTime31.withMillisOfSecond((int) (byte) 1);
        boolean boolean36 = localDateTime20.isAfter((org.joda.time.ReadablePartial) localDateTime31);
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.LocalDateTime localDateTime38 = new org.joda.time.LocalDateTime(chronology37);
        org.joda.time.LocalDateTime localDateTime40 = localDateTime38.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime.Property property41 = localDateTime40.weekOfWeekyear();
        org.joda.time.LocalDateTime.Property property42 = localDateTime40.centuryOfEra();
        boolean boolean43 = localDateTime31.equals((java.lang.Object) property42);
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.LocalDateTime localDateTime45 = new org.joda.time.LocalDateTime(chronology44);
        org.joda.time.LocalDateTime localDateTime47 = localDateTime45.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime49 = localDateTime45.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime51 = localDateTime45.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant52 = null;
        org.joda.time.DateTime dateTime53 = localDateTime51.toDateTime(readableInstant52);
        org.joda.time.LocalDateTime.Property property54 = localDateTime51.millisOfDay();
        org.joda.time.LocalDateTime localDateTime56 = localDateTime51.plusMonths(999);
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.LocalDateTime localDateTime58 = new org.joda.time.LocalDateTime(chronology57);
        org.joda.time.LocalDateTime localDateTime60 = localDateTime58.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime62 = localDateTime58.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime64 = localDateTime58.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant65 = null;
        org.joda.time.DateTime dateTime66 = localDateTime64.toDateTime(readableInstant65);
        org.joda.time.Chronology chronology67 = null;
        org.joda.time.LocalDateTime localDateTime68 = new org.joda.time.LocalDateTime(chronology67);
        org.joda.time.LocalDateTime localDateTime70 = localDateTime68.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime72 = localDateTime68.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime74 = localDateTime68.plusWeeks((int) (byte) 10);
        int int75 = localDateTime74.getMillisOfSecond();
        int int76 = localDateTime74.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime78 = localDateTime74.plusHours((int) (short) -1);
        org.joda.time.DurationFieldType durationFieldType79 = null;
        boolean boolean80 = localDateTime74.isSupported(durationFieldType79);
        org.joda.time.DateTime dateTime81 = localDateTime74.toDateTime();
        boolean boolean82 = dateTime66.isAfter((org.joda.time.ReadableInstant) dateTime81);
        org.joda.time.DateTimeZone dateTimeZone83 = dateTime81.getZone();
        org.joda.time.DateTime dateTime84 = localDateTime51.toDateTime((org.joda.time.ReadableInstant) dateTime81);
        org.joda.time.Instant instant85 = dateTime81.toInstant();
        org.joda.time.DateTime dateTime86 = localDateTime31.toDateTime((org.joda.time.ReadableInstant) instant85);
        int int87 = dateTimeZone7.getOffset((org.joda.time.ReadableInstant) instant85);
        java.lang.String str89 = dateTimeZone7.getName(10596840883368L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime81 and instant85", (dateTime81.compareTo(instant85) == 0) == dateTime81.equals(instant85));
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test609");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology1.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.Chronology chronology5 = copticChronology1.withZone(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology1.secondOfDay();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology1.monthOfYear();
        org.joda.time.DurationField durationField9 = copticChronology1.days();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology1.halfdayOfDay();
        org.joda.time.DurationField durationField11 = copticChronology1.years();
        org.joda.time.DurationField durationField12 = copticChronology1.hours();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(chronology13);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime14.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime14.withYearOfCentury(0);
        org.joda.time.LocalDateTime.Property property21 = localDateTime20.weekyear();
        org.joda.time.LocalDateTime localDateTime23 = property21.setCopy((int) (byte) 1);
        long long24 = property21.remainder();
        org.joda.time.LocalDateTime localDateTime25 = property21.withMinimumValue();
        org.joda.time.ReadableDuration readableDuration26 = null;
        org.joda.time.LocalDateTime localDateTime27 = localDateTime25.plus(readableDuration26);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray28 = localDateTime25.getFieldTypes();
        org.joda.time.LocalDateTime localDateTime30 = localDateTime25.minusWeeks(36);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.chrono.CopticChronology copticChronology32 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone31);
        org.joda.time.DateTimeField dateTimeField33 = copticChronology32.hourOfDay();
        org.joda.time.DateTimeField dateTimeField34 = copticChronology32.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.Chronology chronology36 = copticChronology32.withZone(dateTimeZone35);
        org.joda.time.DateTimeField dateTimeField37 = copticChronology32.millisOfSecond();
        org.joda.time.DurationField durationField38 = copticChronology32.hours();
        org.joda.time.DateTimeField dateTimeField39 = copticChronology32.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField40 = copticChronology32.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField41 = copticChronology32.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField42 = copticChronology32.weekyear();
        long long45 = dateTimeField42.add((long) 51004001, 11);
        int int47 = dateTimeField42.getMinimumValue((long) 262);
        boolean boolean48 = dateTimeField42.isLenient();
        org.joda.time.LocalDateTime localDateTime50 = new org.joda.time.LocalDateTime(4287291576L);
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.chrono.CopticChronology copticChronology53 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone52);
        org.joda.time.DateTimeField dateTimeField54 = copticChronology53.clockhourOfDay();
        org.joda.time.DurationField durationField55 = copticChronology53.weekyears();
        org.joda.time.DurationField durationField56 = copticChronology53.hours();
        int int57 = copticChronology53.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField58 = copticChronology53.monthOfYear();
        org.joda.time.DurationField durationField59 = copticChronology53.seconds();
        org.joda.time.DurationField durationField60 = copticChronology53.weeks();
        org.joda.time.Chronology chronology61 = null;
        org.joda.time.LocalDateTime localDateTime62 = new org.joda.time.LocalDateTime(chronology61);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray63 = localDateTime62.getFieldTypes();
        org.joda.time.LocalDateTime localDateTime65 = localDateTime62.plusMinutes(1);
        int[] intArray67 = copticChronology53.get((org.joda.time.ReadablePartial) localDateTime65, 0L);
        org.joda.time.DateTimeField dateTimeField68 = copticChronology53.centuryOfEra();
        org.joda.time.Chronology chronology69 = null;
        org.joda.time.LocalDateTime localDateTime70 = new org.joda.time.LocalDateTime(chronology69);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray71 = localDateTime70.getFieldTypes();
        org.joda.time.LocalDateTime localDateTime73 = localDateTime70.plusMinutes(1);
        int int74 = localDateTime70.getSecondOfMinute();
        org.joda.time.LocalDateTime.Property property75 = localDateTime70.millisOfDay();
        org.joda.time.LocalDateTime localDateTime76 = property75.withMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone77 = null;
        org.joda.time.chrono.CopticChronology copticChronology78 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone77);
        org.joda.time.DateTimeField dateTimeField79 = copticChronology78.clockhourOfDay();
        org.joda.time.DurationField durationField80 = copticChronology78.weekyears();
        org.joda.time.DateTimeField dateTimeField81 = copticChronology78.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone82 = null;
        org.joda.time.chrono.CopticChronology copticChronology83 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone82);
        org.joda.time.DateTimeField dateTimeField84 = copticChronology83.clockhourOfDay();
        java.util.Locale locale86 = java.util.Locale.ITALIAN;
        java.lang.String str87 = dateTimeField84.getAsText((long) 'a', locale86);
        int int88 = dateTimeField81.getMaximumTextLength(locale86);
        java.lang.String str89 = dateTimeField68.getAsShortText((org.joda.time.ReadablePartial) localDateTime76, locale86);
        java.lang.String str90 = locale86.getLanguage();
        java.lang.String str91 = locale86.getScript();
        java.lang.String str92 = dateTimeField42.getAsText((org.joda.time.ReadablePartial) localDateTime50, 479, locale86);
        boolean boolean93 = localDateTime30.isAfter((org.joda.time.ReadablePartial) localDateTime50);
        long long95 = copticChronology1.set((org.joda.time.ReadablePartial) localDateTime50, 5183999367L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField11 and durationField55", (durationField11.compareTo(durationField55) == 0) == durationField11.equals(durationField55));
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test610");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.CopticChronology copticChronology2 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology2.hourOfDay();
        org.joda.time.DurationField durationField4 = copticChronology2.eras();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology2.weekyear();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) (-292275054), (org.joda.time.Chronology) copticChronology2);
        org.joda.time.DateTimeZone dateTimeZone7 = copticChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology2.dayOfMonth();
        int int10 = dateTimeField8.getMaximumValue((long) 114);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.chrono.CopticChronology copticChronology12 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone11);
        org.joda.time.DateTimeField dateTimeField13 = copticChronology12.hourOfDay();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology12.weekyearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.chrono.CopticChronology copticChronology17 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone16);
        org.joda.time.DateTimeField dateTimeField18 = copticChronology17.clockhourOfDay();
        java.util.Locale locale20 = java.util.Locale.ITALIAN;
        java.lang.String str21 = dateTimeField18.getAsText((long) 'a', locale20);
        java.lang.String str22 = dateTimeField14.getAsText((int) 'a', locale20);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.chrono.CopticChronology copticChronology24 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField25 = copticChronology24.clockhourOfDay();
        org.joda.time.DurationField durationField26 = copticChronology24.weekyears();
        org.joda.time.DateTimeField dateTimeField27 = copticChronology24.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.chrono.CopticChronology copticChronology29 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone28);
        org.joda.time.DateTimeField dateTimeField30 = copticChronology29.clockhourOfDay();
        java.util.Locale locale32 = java.util.Locale.ITALIAN;
        java.lang.String str33 = dateTimeField30.getAsText((long) 'a', locale32);
        int int34 = dateTimeField27.getMaximumTextLength(locale32);
        java.lang.String str35 = locale20.getDisplayCountry(locale32);
        int int36 = dateTimeField8.getMaximumTextLength(locale20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField4 and durationField26", Math.signum(durationField4.compareTo(durationField26)) == -Math.signum(durationField26.compareTo(durationField4)));
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test611");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.hourOfDay();
        org.joda.time.DurationField durationField3 = copticChronology1.eras();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology1.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology1.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone6 = copticChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology1.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone8 = copticChronology1.getZone();
        org.joda.time.DateTimeZone dateTimeZone9 = copticChronology1.getZone();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(chronology11);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime12.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime12.withYearOfCentury(0);
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.weekyear();
        org.joda.time.LocalDateTime localDateTime21 = property19.setCopy((int) (byte) 1);
        org.joda.time.DurationField durationField22 = property19.getDurationField();
        java.util.Locale.Category category23 = java.util.Locale.Category.DISPLAY;
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.chrono.CopticChronology copticChronology25 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone24);
        org.joda.time.DateTimeField dateTimeField26 = copticChronology25.dayOfMonth();
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime(chronology27);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime28.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime28.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime28.plusWeeks((int) (byte) 10);
        java.util.Locale locale35 = java.util.Locale.PRC;
        java.lang.String str36 = dateTimeField26.getAsText((org.joda.time.ReadablePartial) localDateTime34, locale35);
        java.util.Set<java.lang.String> strSet37 = locale35.getUnicodeLocaleKeys();
        java.util.Locale.setDefault(category23, locale35);
        java.util.Set<java.lang.String> strSet39 = locale35.getUnicodeLocaleKeys();
        int int40 = property19.getMaximumShortTextLength(locale35);
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.chrono.CopticChronology copticChronology42 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone41);
        org.joda.time.DateTimeField dateTimeField43 = copticChronology42.clockhourOfDay();
        org.joda.time.DurationField durationField44 = copticChronology42.weekyears();
        org.joda.time.DateTimeField dateTimeField45 = copticChronology42.clockhourOfDay();
        int int46 = dateTimeField45.getMaximumValue();
        long long49 = dateTimeField45.addWrapField((long) 22, 10);
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.LocalDateTime localDateTime51 = new org.joda.time.LocalDateTime(chronology50);
        org.joda.time.LocalDateTime localDateTime53 = localDateTime51.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime.Property property54 = localDateTime53.weekOfWeekyear();
        org.joda.time.LocalDateTime.Property property55 = localDateTime53.centuryOfEra();
        java.util.Locale locale56 = java.util.Locale.GERMANY;
        java.lang.String str57 = locale56.getScript();
        org.joda.time.DateTimeZone dateTimeZone58 = null;
        org.joda.time.chrono.CopticChronology copticChronology59 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone58);
        org.joda.time.DateTimeField dateTimeField60 = copticChronology59.clockhourOfDay();
        java.util.Locale locale62 = java.util.Locale.ITALIAN;
        java.lang.String str63 = dateTimeField60.getAsText((long) 'a', locale62);
        java.lang.String str64 = locale56.getDisplayName(locale62);
        java.lang.String str65 = locale62.getISO3Language();
        boolean boolean66 = locale62.hasExtensions();
        java.util.Locale locale67 = locale62.stripExtensions();
        java.lang.String str68 = dateTimeField45.getAsShortText((org.joda.time.ReadablePartial) localDateTime53, locale67);
        java.lang.String str69 = locale35.getDisplayCountry(locale67);
        java.util.Locale locale70 = locale35.stripExtensions();
        java.lang.String str71 = dateTimeZone9.getName((long) 346, locale70);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField22", Math.signum(durationField3.compareTo(durationField22)) == -Math.signum(durationField22.compareTo(durationField3)));
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test612");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.plusWeeks((int) (byte) 10);
        int int8 = localDateTime7.getMillisOfSecond();
        int int9 = localDateTime7.getMillisOfSecond();
        java.lang.String str11 = localDateTime7.toString("+100:00");
        org.joda.time.LocalDateTime localDateTime13 = localDateTime7.withWeekyear(792);
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.dayOfWeek();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(chronology15);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime16.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime16.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.DateTime dateTime24 = localDateTime22.toDateTime(readableInstant23);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime(chronology25);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime26.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime26.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime26.plusWeeks((int) (byte) 10);
        int int33 = localDateTime32.getMillisOfSecond();
        int int34 = localDateTime32.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime36 = localDateTime32.plusHours((int) (short) -1);
        org.joda.time.DurationFieldType durationFieldType37 = null;
        boolean boolean38 = localDateTime32.isSupported(durationFieldType37);
        org.joda.time.DateTime dateTime39 = localDateTime32.toDateTime();
        boolean boolean40 = dateTime24.isAfter((org.joda.time.ReadableInstant) dateTime39);
        org.joda.time.Instant instant41 = dateTime24.toInstant();
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.chrono.CopticChronology copticChronology43 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone42);
        org.joda.time.DateTimeField dateTimeField44 = copticChronology43.hourOfDay();
        org.joda.time.DateTimeField dateTimeField45 = copticChronology43.centuryOfEra();
        org.joda.time.DurationField durationField46 = copticChronology43.millis();
        org.joda.time.DateTimeField dateTimeField47 = copticChronology43.secondOfDay();
        org.joda.time.DateTimeField dateTimeField48 = copticChronology43.hourOfDay();
        org.joda.time.DateTimeField dateTimeField49 = copticChronology43.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField50 = copticChronology43.era();
        boolean boolean51 = dateTime24.equals((java.lang.Object) dateTimeField50);
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.chrono.CopticChronology copticChronology53 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone52);
        org.joda.time.DateTimeField dateTimeField54 = copticChronology53.clockhourOfDay();
        org.joda.time.DurationField durationField55 = copticChronology53.weekyears();
        org.joda.time.DateTimeField dateTimeField56 = copticChronology53.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField57 = copticChronology53.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField58 = copticChronology53.clockhourOfHalfday();
        org.joda.time.DurationField durationField59 = copticChronology53.halfdays();
        org.joda.time.DurationField durationField60 = copticChronology53.hours();
        org.joda.time.DateTimeField dateTimeField61 = copticChronology53.minuteOfDay();
        boolean boolean62 = dateTime24.equals((java.lang.Object) copticChronology53);
        int int63 = property14.getDifference((org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.LocalDateTime localDateTime65 = property14.addWrapFieldToCopy(0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime24 and instant41", (dateTime24.compareTo(instant41) == 0) == dateTime24.equals(instant41));
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test613");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.CopticChronology copticChronology2 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology2.hourOfDay();
        org.joda.time.DurationField durationField4 = copticChronology2.eras();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology2.weekyear();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) (-292275054), (org.joda.time.Chronology) copticChronology2);
        org.joda.time.DateTimeZone dateTimeZone7 = copticChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology2.dayOfMonth();
        org.joda.time.DurationField durationField9 = copticChronology2.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField4, durationField9, and durationField4", !(durationField4.compareTo(durationField9) == 0) || (Math.signum(durationField4.compareTo(durationField4)) == Math.signum(durationField9.compareTo(durationField4))));
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test614");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.weekyearOfCentury();
        org.joda.time.DurationField durationField3 = copticChronology1.seconds();
        org.joda.time.DurationField durationField4 = copticChronology1.years();
        org.joda.time.DateTimeZone dateTimeZone5 = copticChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.era();
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) (byte) 0);
        int int9 = localDateTime8.getCenturyOfEra();
        int int10 = localDateTime8.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime8.plusSeconds(2922728);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime8.withMinuteOfHour(0);
        org.joda.time.LocalDateTime.Property property15 = localDateTime8.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.chrono.CopticChronology copticChronology17 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone16);
        org.joda.time.DateTimeField dateTimeField18 = copticChronology17.hourOfDay();
        org.joda.time.DateTimeField dateTimeField19 = copticChronology17.centuryOfEra();
        org.joda.time.DurationField durationField20 = copticChronology17.millis();
        org.joda.time.DateTimeField dateTimeField21 = copticChronology17.weekOfWeekyear();
        boolean boolean22 = dateTimeField21.isSupported();
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime(chronology23);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime24.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime24.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime24.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.DateTime dateTime32 = localDateTime30.toDateTime(readableInstant31);
        java.util.Locale locale33 = java.util.Locale.GERMANY;
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.chrono.CopticChronology copticChronology35 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone34);
        org.joda.time.DateTimeField dateTimeField36 = copticChronology35.clockhourOfDay();
        org.joda.time.DurationField durationField37 = copticChronology35.weekyears();
        org.joda.time.DateTimeField dateTimeField38 = copticChronology35.clockhourOfDay();
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.LocalDateTime localDateTime40 = new org.joda.time.LocalDateTime(chronology39);
        org.joda.time.LocalDateTime localDateTime42 = localDateTime40.plusWeeks((int) (byte) -1);
        java.util.Locale locale44 = java.util.Locale.GERMANY;
        java.lang.String str45 = locale44.getScript();
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.chrono.CopticChronology copticChronology47 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone46);
        org.joda.time.DateTimeField dateTimeField48 = copticChronology47.clockhourOfDay();
        java.util.Locale locale50 = java.util.Locale.ITALIAN;
        java.lang.String str51 = dateTimeField48.getAsText((long) 'a', locale50);
        java.lang.String str52 = locale44.getDisplayName(locale50);
        java.lang.String str53 = dateTimeField38.getAsShortText((org.joda.time.ReadablePartial) localDateTime42, (int) ' ', locale50);
        java.lang.String str54 = locale33.getDisplayName(locale50);
        java.lang.String str55 = dateTimeField21.getAsText((org.joda.time.ReadablePartial) localDateTime30, locale33);
        org.joda.time.LocalDateTime localDateTime57 = localDateTime30.withMillisOfSecond(0);
        org.joda.time.ReadablePeriod readablePeriod58 = null;
        org.joda.time.LocalDateTime localDateTime59 = localDateTime30.minus(readablePeriod58);
        boolean boolean60 = localDateTime8.isBefore((org.joda.time.ReadablePartial) localDateTime30);
        long long62 = copticChronology1.set((org.joda.time.ReadablePartial) localDateTime8, 951145050325L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField37", (durationField4.compareTo(durationField37) == 0) == durationField4.equals(durationField37));
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test615");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.dayOfMonth();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime(chronology3);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.weekOfWeekyear();
        org.joda.time.LocalDateTime.Property property8 = localDateTime6.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime9 = property8.roundHalfEvenCopy();
        long long11 = copticChronology1.set((org.joda.time.ReadablePartial) localDateTime9, 4287218474L);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime9.minusMillis(51004001);
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.millisOfSecond();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(chronology15);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime16.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime16.withYearOfCentury(0);
        org.joda.time.LocalDateTime.Property property23 = localDateTime22.weekyear();
        org.joda.time.Interval interval24 = property23.toInterval();
        boolean boolean25 = property23.isLeap();
        int int26 = property23.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime27 = property23.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime28 = property23.roundCeilingCopy();
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime(chronology29);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime30.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime30.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime30.withYearOfCentury(0);
        org.joda.time.LocalDateTime.Property property37 = localDateTime36.weekyear();
        org.joda.time.Interval interval38 = property37.toInterval();
        boolean boolean39 = property37.isLeap();
        int int40 = property37.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime41 = property37.roundHalfFloorCopy();
        java.util.Locale locale42 = java.util.Locale.UK;
        int int43 = property37.getMaximumTextLength(locale42);
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.LocalDateTime localDateTime45 = new org.joda.time.LocalDateTime(chronology44);
        org.joda.time.LocalDateTime localDateTime47 = localDateTime45.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime49 = localDateTime45.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime51 = localDateTime45.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant52 = null;
        org.joda.time.DateTime dateTime53 = localDateTime51.toDateTime(readableInstant52);
        org.joda.time.LocalDateTime.Property property54 = localDateTime51.millisOfDay();
        org.joda.time.LocalDateTime localDateTime56 = localDateTime51.plusMonths(999);
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.LocalDateTime localDateTime58 = new org.joda.time.LocalDateTime(chronology57);
        org.joda.time.LocalDateTime localDateTime60 = localDateTime58.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime62 = localDateTime58.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime64 = localDateTime58.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant65 = null;
        org.joda.time.DateTime dateTime66 = localDateTime64.toDateTime(readableInstant65);
        org.joda.time.Chronology chronology67 = null;
        org.joda.time.LocalDateTime localDateTime68 = new org.joda.time.LocalDateTime(chronology67);
        org.joda.time.LocalDateTime localDateTime70 = localDateTime68.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime72 = localDateTime68.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime74 = localDateTime68.plusWeeks((int) (byte) 10);
        int int75 = localDateTime74.getMillisOfSecond();
        int int76 = localDateTime74.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime78 = localDateTime74.plusHours((int) (short) -1);
        org.joda.time.DurationFieldType durationFieldType79 = null;
        boolean boolean80 = localDateTime74.isSupported(durationFieldType79);
        org.joda.time.DateTime dateTime81 = localDateTime74.toDateTime();
        boolean boolean82 = dateTime66.isAfter((org.joda.time.ReadableInstant) dateTime81);
        org.joda.time.DateTimeZone dateTimeZone83 = dateTime81.getZone();
        org.joda.time.DateTime dateTime84 = localDateTime51.toDateTime((org.joda.time.ReadableInstant) dateTime81);
        org.joda.time.Instant instant85 = dateTime81.toInstant();
        int int86 = property37.getDifference((org.joda.time.ReadableInstant) dateTime81);
        long long87 = property23.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime81);
        org.joda.time.DateTime dateTime88 = localDateTime13.toDateTime((org.joda.time.ReadableInstant) dateTime81);
        java.lang.String str89 = dateTime88.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime81 and instant85", (dateTime81.compareTo(instant85) == 0) == dateTime81.equals(instant85));
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test616");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.weekyearOfCentury();
        org.joda.time.DurationField durationField3 = copticChronology1.seconds();
        org.joda.time.DurationField durationField4 = copticChronology1.years();
        org.joda.time.DateTimeZone dateTimeZone5 = copticChronology1.getZone();
        org.joda.time.DurationField durationField6 = copticChronology1.months();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 10);
        long long11 = dateTimeZone9.previousTransition((long) (-292275054));
        int int13 = dateTimeZone9.getOffset(4287242686L);
        org.joda.time.Chronology chronology14 = copticChronology1.withZone(dateTimeZone9);
        org.joda.time.DurationField durationField15 = copticChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology1.hourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField15", (durationField4.compareTo(durationField15) == 0) == durationField4.equals(durationField15));
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test617");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.hourOfDay();
        org.joda.time.DurationField durationField3 = copticChronology1.eras();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology1.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology1.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone6 = copticChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology1.yearOfEra();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology1.weekyear();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology1.minuteOfHour();
        long long13 = copticChronology1.add((long) 357, 4287366630L, 105);
        org.joda.time.DateTimeField dateTimeField14 = copticChronology1.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology1.monthOfYear();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology1.weekyearOfCentury();
        org.joda.time.DurationField durationField17 = copticChronology1.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField3, durationField17, and durationField3", !(durationField3.compareTo(durationField17) == 0) || (Math.signum(durationField3.compareTo(durationField3)) == Math.signum(durationField17.compareTo(durationField3))));
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test618");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology1.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.Chronology chronology5 = copticChronology1.withZone(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology1.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone8 = copticChronology1.getZone();
        org.joda.time.DurationField durationField9 = copticChronology1.eras();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(chronology10);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime11.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime11.plusWeeks((int) (byte) 10);
        int int18 = localDateTime17.getMillisOfSecond();
        int int19 = localDateTime17.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime17.plusHours((int) (short) -1);
        org.joda.time.DurationFieldType durationFieldType22 = null;
        boolean boolean23 = localDateTime17.isSupported(durationFieldType22);
        int[] intArray25 = copticChronology1.get((org.joda.time.ReadablePartial) localDateTime17, (long) 761);
        org.joda.time.DateTimeZone dateTimeZone26 = copticChronology1.getZone();
        org.joda.time.DurationField durationField27 = copticChronology1.months();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField27, and durationField9", !(durationField9.compareTo(durationField27) == 0) || (Math.signum(durationField9.compareTo(durationField9)) == Math.signum(durationField27.compareTo(durationField9))));
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test619");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology1.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.Chronology chronology5 = copticChronology1.withZone(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.weekyear();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology1.minuteOfHour();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        long long11 = copticChronology1.add(readablePeriod8, 4287252828L, 649);
        org.joda.time.DurationField durationField12 = copticChronology1.centuries();
        org.joda.time.DateTimeZone dateTimeZone13 = copticChronology1.getZone();
        org.joda.time.DurationField durationField14 = copticChronology1.eras();
        org.joda.time.DurationField durationField15 = copticChronology1.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField15 and durationField14", Math.signum(durationField15.compareTo(durationField14)) == -Math.signum(durationField14.compareTo(durationField15)));
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test620");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology1.secondOfDay();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology1.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology1.weekOfWeekyear();
        org.joda.time.DurationField durationField6 = copticChronology1.centuries();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology1.year();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology1.halfdayOfDay();
        org.joda.time.DurationField durationField9 = copticChronology1.eras();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology1.hourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField6 and durationField9", Math.signum(durationField6.compareTo(durationField9)) == -Math.signum(durationField9.compareTo(durationField6)));
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test621");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology1.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.Chronology chronology5 = copticChronology1.withZone(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.millisOfSecond();
        org.joda.time.DurationField durationField7 = copticChronology1.hours();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology1.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology1.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology1.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.chrono.CopticChronology copticChronology12 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone11);
        org.joda.time.DateTimeField dateTimeField13 = copticChronology12.clockhourOfDay();
        org.joda.time.DurationField durationField14 = copticChronology12.weekyears();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology12.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology12.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology12.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField18 = copticChronology12.weekyear();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime((long) 53, dateTimeZone21);
        org.joda.time.Chronology chronology23 = copticChronology12.withZone(dateTimeZone21);
        boolean boolean24 = copticChronology1.equals((java.lang.Object) copticChronology12);
        org.joda.time.DurationField durationField25 = copticChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField26 = copticChronology1.hourOfDay();
        org.joda.time.DurationField durationField27 = copticChronology1.years();
        org.joda.time.DateTimeField dateTimeField28 = copticChronology1.year();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField14 and durationField27", (durationField14.compareTo(durationField27) == 0) == durationField14.equals(durationField27));
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test622");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology1.centuryOfEra();
        org.joda.time.DurationField durationField4 = copticChronology1.millis();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology1.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.clockhourOfDay();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((org.joda.time.Chronology) copticChronology1);
        org.joda.time.DateTimeField dateTimeField8 = copticChronology1.clockhourOfHalfday();
        org.joda.time.DurationField durationField9 = copticChronology1.eras();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology1.yearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField4 and durationField9", Math.signum(durationField4.compareTo(durationField9)) == -Math.signum(durationField9.compareTo(durationField4)));
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test623");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.CopticChronology copticChronology2 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology2.hourOfDay();
        org.joda.time.DurationField durationField4 = copticChronology2.eras();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology2.weekyear();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) (-292275054), (org.joda.time.Chronology) copticChronology2);
        org.joda.time.DateTimeZone dateTimeZone7 = copticChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology2.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology2.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology2.year();
        org.joda.time.DurationField durationField11 = copticChronology2.months();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField4, durationField11, and durationField4", !(durationField4.compareTo(durationField11) == 0) || (Math.signum(durationField4.compareTo(durationField4)) == Math.signum(durationField11.compareTo(durationField4))));
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test624");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = copticChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = copticChronology1.getZone();
        org.joda.time.DurationField durationField6 = copticChronology1.centuries();
        org.joda.time.DurationField durationField7 = copticChronology1.weeks();
        java.util.TimeZone timeZone8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        java.lang.String str11 = dateTimeZone9.getNameKey((long) (byte) 0);
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(dateTimeZone9);
        org.joda.time.Chronology chronology13 = copticChronology1.withZone(dateTimeZone9);
        boolean boolean15 = dateTimeZone9.isStandardOffset((long) 632);
        java.lang.String str17 = dateTimeZone9.getNameKey((long) 342);
        org.joda.time.LocalDateTime localDateTime18 = org.joda.time.LocalDateTime.now(dateTimeZone9);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime(chronology19);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime20.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime20.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime20.withYearOfCentury(0);
        org.joda.time.LocalDateTime.Property property27 = localDateTime26.weekyear();
        org.joda.time.LocalDateTime localDateTime29 = property27.setCopy((int) (byte) 1);
        org.joda.time.DurationField durationField30 = property27.getLeapDurationField();
        org.joda.time.LocalDateTime localDateTime31 = property27.getLocalDateTime();
        org.joda.time.LocalDateTime.Property property32 = localDateTime31.weekyear();
        org.joda.time.DurationField durationField33 = property32.getRangeDurationField();
        java.lang.String str34 = property32.toString();
        org.joda.time.LocalDateTime localDateTime35 = property32.roundHalfCeilingCopy();
        boolean boolean36 = dateTimeZone9.isLocalDateTimeGap(localDateTime35);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField7 and durationField30", (durationField7.compareTo(durationField30) == 0) == durationField7.equals(durationField30));
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test625");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = copticChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = copticChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology1.year();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology1.yearOfEra();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology1.dayOfMonth();
        org.joda.time.DurationField durationField10 = copticChronology1.days();
        int int11 = copticChronology1.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField14 = copticChronology1.years();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology1.dayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField14", (durationField3.compareTo(durationField14) == 0) == durationField3.equals(durationField14));
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test626");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology1.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.Chronology chronology5 = copticChronology1.withZone(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology1.clockhourOfHalfday();
        org.joda.time.DurationField durationField8 = copticChronology1.days();
        long long14 = copticChronology1.getDateTimeMillis(14L, 0, 26, 59, 944);
        java.lang.String str15 = copticChronology1.toString();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology1.era();
        org.joda.time.DurationField durationField17 = copticChronology1.weeks();
        long long21 = copticChronology1.add(10598050454747L, (long) 34, 574);
        org.joda.time.DurationField durationField22 = copticChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField22, durationField8, and durationField17", !(durationField22.compareTo(durationField8) == 0) || (Math.signum(durationField22.compareTo(durationField17)) == Math.signum(durationField8.compareTo(durationField17))));
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test627");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = copticChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = copticChronology1.getZone();
        org.joda.time.LocalDateTime localDateTime6 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) copticChronology1);
        org.joda.time.DurationField durationField7 = copticChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology1.hourOfHalfday();
        org.joda.time.DurationField durationField9 = copticChronology1.hours();
        java.util.TimeZone timeZone10 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        java.lang.String str13 = dateTimeZone11.getNameKey((long) (byte) 0);
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(dateTimeZone11);
        java.util.TimeZone timeZone15 = null;
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forTimeZone(timeZone15);
        java.lang.String str18 = dateTimeZone16.getNameKey((long) (byte) 0);
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime(dateTimeZone16);
        boolean boolean20 = localDateTime14.isEqual((org.joda.time.ReadablePartial) localDateTime19);
        int[] intArray22 = copticChronology1.get((org.joda.time.ReadablePartial) localDateTime19, (long) 30);
        org.joda.time.DateTimeField dateTimeField23 = copticChronology1.monthOfYear();
        org.joda.time.DateTimeField dateTimeField24 = copticChronology1.era();
        org.joda.time.DateTimeField dateTimeField25 = copticChronology1.weekyearOfCentury();
        org.joda.time.DurationField durationField26 = copticChronology1.years();
        org.joda.time.DateTimeField dateTimeField27 = copticChronology1.hourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField26", (durationField3.compareTo(durationField26) == 0) == durationField3.equals(durationField26));
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test628");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = copticChronology1.weekyears();
        org.joda.time.DurationField durationField4 = copticChronology1.hours();
        int int5 = copticChronology1.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.monthOfYear();
        org.joda.time.DurationField durationField7 = copticChronology1.seconds();
        org.joda.time.DurationField durationField8 = copticChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology1.millisOfDay();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology1.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology1.minuteOfHour();
        org.joda.time.DurationField durationField12 = copticChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField12, durationField3, and durationField4", !(durationField12.compareTo(durationField3) == 0) || (Math.signum(durationField12.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test629");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = copticChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = copticChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology1.year();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology1.yearOfEra();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology1.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime11 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) copticChronology1);
        org.joda.time.DurationField durationField12 = copticChronology1.eras();
        org.joda.time.DurationField durationField13 = copticChronology1.weeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField12", Math.signum(durationField3.compareTo(durationField12)) == -Math.signum(durationField12.compareTo(durationField3)));
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test630");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = copticChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology1.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology1.weekyear();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology1.minuteOfDay();
        org.joda.time.DurationField durationField9 = copticChronology1.days();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology1.secondOfDay();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology1.dayOfMonth();
        org.joda.time.DurationField durationField12 = copticChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField12, durationField3, and durationField9", !(durationField12.compareTo(durationField3) == 0) || (Math.signum(durationField12.compareTo(durationField9)) == Math.signum(durationField3.compareTo(durationField9))));
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test631");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology1.centuryOfEra();
        org.joda.time.DurationField durationField4 = copticChronology1.millis();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology1.weekOfWeekyear();
        org.joda.time.DurationField durationField6 = dateTimeField5.getLeapDurationField();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.chrono.CopticChronology copticChronology8 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone7);
        org.joda.time.DateTimeField dateTimeField9 = copticChronology8.clockhourOfDay();
        org.joda.time.DurationField durationField10 = copticChronology8.weekyears();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology8.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = copticChronology8.getZone();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology8.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology8.year();
        org.joda.time.DurationField durationField15 = copticChronology8.seconds();
        org.joda.time.Chronology chronology16 = copticChronology8.withUTC();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology8.centuryOfEra();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime(chronology18);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime19.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime19.plusWeeks((int) (byte) 10);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime(chronology26);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime27.withMillisOfSecond((int) (byte) 1);
        int int32 = localDateTime19.compareTo((org.joda.time.ReadablePartial) localDateTime27);
        org.joda.time.LocalDateTime.Property property33 = localDateTime27.weekyear();
        org.joda.time.LocalDateTime.Property property34 = localDateTime27.millisOfDay();
        org.joda.time.LocalDateTime localDateTime35 = property34.roundHalfCeilingCopy();
        org.joda.time.DurationField durationField36 = property34.getDurationField();
        org.joda.time.LocalDateTime localDateTime37 = property34.withMaximumValue();
        long long39 = copticChronology8.set((org.joda.time.ReadablePartial) localDateTime37, 1253049997158568879L);
        org.joda.time.ReadableDuration readableDuration40 = null;
        org.joda.time.LocalDateTime localDateTime41 = localDateTime37.plus(readableDuration40);
        int int42 = dateTimeField5.getMinimumValue((org.joda.time.ReadablePartial) localDateTime41);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField36", (durationField4.compareTo(durationField36) == 0) == durationField4.equals(durationField36));
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test632");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology1.secondOfDay();
        org.joda.time.DurationField durationField4 = copticChronology1.years();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology1.dayOfWeek();
        org.joda.time.DurationField durationField6 = copticChronology1.weekyears();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        long long10 = copticChronology1.add(readablePeriod7, 4704997464713414L, 1810800000);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField6", (durationField4.compareTo(durationField6) == 0) == durationField4.equals(durationField6));
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test633");
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.parse("86");
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusMinutes(710);
        int int4 = localDateTime3.getMonthOfYear();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(chronology5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime6.withYearOfCentury(0);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.weekyear();
        org.joda.time.LocalDateTime localDateTime15 = property13.setCopy((int) (byte) 1);
        org.joda.time.DurationField durationField16 = property13.getLeapDurationField();
        org.joda.time.LocalDateTime localDateTime17 = property13.getLocalDateTime();
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.weekOfWeekyear();
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.DateTime dateTime20 = localDateTime17.toDateTime(readableInstant19);
        org.joda.time.Instant instant21 = dateTime20.toInstant();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime(chronology22);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime23.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime23.withYearOfCentury(0);
        org.joda.time.LocalDateTime.Property property30 = localDateTime29.weekyear();
        org.joda.time.LocalDateTime localDateTime32 = property30.setCopy((int) (byte) 1);
        org.joda.time.DurationField durationField33 = property30.getLeapDurationField();
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime(chronology34);
        org.joda.time.LocalDateTime localDateTime37 = localDateTime35.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime39 = localDateTime35.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime41 = localDateTime35.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant42 = null;
        org.joda.time.DateTime dateTime43 = localDateTime41.toDateTime(readableInstant42);
        java.util.Locale locale44 = java.util.Locale.GERMANY;
        boolean boolean45 = locale44.hasExtensions();
        boolean boolean46 = dateTime43.equals((java.lang.Object) locale44);
        java.util.Locale.LanguageRange[] languageRangeArray47 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList48 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList48, languageRangeArray47);
        java.util.Collection<java.lang.String> strCollection50 = null;
        java.util.List<java.lang.String> strList51 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList48, strCollection50);
        java.util.Collection<java.lang.String> strCollection52 = null;
        java.util.List<java.lang.String> strList53 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList48, strCollection52);
        java.util.Locale.LanguageRange[] languageRangeArray54 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList55 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList55, languageRangeArray54);
        java.util.Collection<java.lang.String> strCollection57 = null;
        java.util.List<java.lang.String> strList58 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList55, strCollection57);
        java.util.Collection<java.lang.String> strCollection59 = null;
        java.util.List<java.lang.String> strList60 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList55, strCollection59);
        java.util.Locale.FilteringMode filteringMode61 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList62 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList48, strCollection59, filteringMode61);
        boolean boolean63 = dateTime43.equals((java.lang.Object) languageRangeList48);
        org.joda.time.Chronology chronology64 = null;
        org.joda.time.LocalDateTime localDateTime65 = new org.joda.time.LocalDateTime(chronology64);
        org.joda.time.LocalDateTime localDateTime67 = localDateTime65.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime.Property property68 = localDateTime67.weekOfWeekyear();
        org.joda.time.LocalDateTime.Property property69 = localDateTime67.centuryOfEra();
        org.joda.time.Chronology chronology70 = null;
        org.joda.time.LocalDateTime localDateTime71 = new org.joda.time.LocalDateTime(chronology70);
        org.joda.time.LocalDateTime localDateTime73 = localDateTime71.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime75 = localDateTime71.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime77 = localDateTime71.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant78 = null;
        org.joda.time.DateTime dateTime79 = localDateTime77.toDateTime(readableInstant78);
        java.util.Locale locale80 = java.util.Locale.GERMANY;
        boolean boolean81 = locale80.hasExtensions();
        boolean boolean82 = dateTime79.equals((java.lang.Object) locale80);
        int int83 = property69.getDifference((org.joda.time.ReadableInstant) dateTime79);
        int int84 = dateTime43.compareTo((org.joda.time.ReadableInstant) dateTime79);
        long long85 = property30.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime79);
        org.joda.time.Instant instant86 = dateTime79.toInstant();
        boolean boolean87 = instant21.isEqual((org.joda.time.ReadableInstant) dateTime79);
        org.joda.time.DateTime dateTime88 = localDateTime3.toDateTime((org.joda.time.ReadableInstant) instant21);
        java.lang.String str89 = instant21.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime79 and instant86", (dateTime79.compareTo(instant86) == 0) == dateTime79.equals(instant86));
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test634");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.CopticChronology copticChronology2 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology2.clockhourOfDay();
        org.joda.time.DurationField durationField4 = copticChronology2.weekyears();
        org.joda.time.DurationField durationField5 = copticChronology2.hours();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology2.dayOfMonth();
        org.joda.time.DurationField durationField7 = copticChronology2.years();
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(10598050565232L, (org.joda.time.Chronology) copticChronology2);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField7", (durationField4.compareTo(durationField7) == 0) == durationField4.equals(durationField7));
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test635");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = copticChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology1.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology1.weekyear();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology1.minuteOfDay();
        org.joda.time.DurationField durationField9 = copticChronology1.days();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology1.dayOfYear();
        org.joda.time.DurationField durationField11 = copticChronology1.years();
        org.joda.time.DurationField durationField12 = copticChronology1.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField12 and durationField11", (durationField12.compareTo(durationField11) == 0) == durationField12.equals(durationField11));
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test636");
        org.joda.time.tz.NameProvider nameProvider0 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.chrono.CopticChronology copticChronology4 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology4.hourOfDay();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology4.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.Chronology chronology8 = copticChronology4.withZone(dateTimeZone7);
        org.joda.time.DateTimeField dateTimeField9 = copticChronology4.millisOfSecond();
        long long12 = dateTimeField9.add((long) 100, 26);
        java.util.Locale locale14 = java.util.Locale.GERMANY;
        java.lang.String str15 = locale14.getScript();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.chrono.CopticChronology copticChronology17 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone16);
        org.joda.time.DateTimeField dateTimeField18 = copticChronology17.clockhourOfDay();
        java.util.Locale locale20 = java.util.Locale.ITALIAN;
        java.lang.String str21 = dateTimeField18.getAsText((long) 'a', locale20);
        java.lang.String str22 = locale14.getDisplayName(locale20);
        java.lang.String str23 = locale20.getISO3Language();
        boolean boolean24 = locale20.hasExtensions();
        java.lang.String str25 = dateTimeField9.getAsShortText((int) (short) 1, locale20);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime(chronology26);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime27.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime27.withYearOfCentury(0);
        org.joda.time.LocalDateTime.Property property34 = localDateTime33.weekyear();
        org.joda.time.LocalDateTime localDateTime36 = property34.setCopy((int) (byte) 1);
        org.joda.time.DurationField durationField37 = property34.getLeapDurationField();
        org.joda.time.LocalDateTime localDateTime38 = property34.getLocalDateTime();
        org.joda.time.LocalDateTime.Property property39 = localDateTime38.weekOfWeekyear();
        java.util.Locale locale41 = java.util.Locale.ROOT;
        java.lang.String str42 = locale41.getDisplayScript();
        java.lang.String str43 = dateTimeField9.getAsShortText((org.joda.time.ReadablePartial) localDateTime38, (int) ' ', locale41);
        java.lang.String str46 = nameProvider0.getName(locale41, "\u610f\u5927\u5229\u6587", "2022-02-14T14:54:06.969");
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        java.util.Locale locale50 = new java.util.Locale("2022-02-14T14:53:50.202", "2022-02-14T14:55:00.706");
        java.lang.String str53 = nameProvider0.getName(locale50, "2022-02-14T14:56:01.561", "2001-02-21T14:55:45.745");
        org.joda.time.DateTimeZone dateTimeZone54 = null;
        org.joda.time.chrono.CopticChronology copticChronology55 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone54);
        org.joda.time.DateTimeField dateTimeField56 = copticChronology55.dayOfMonth();
        org.joda.time.DurationField durationField57 = copticChronology55.months();
        org.joda.time.DurationField durationField58 = copticChronology55.weeks();
        org.joda.time.DateTimeField dateTimeField59 = copticChronology55.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone62 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime63 = new org.joda.time.LocalDateTime((long) (byte) 1, dateTimeZone62);
        org.joda.time.Chronology chronology64 = null;
        org.joda.time.LocalDateTime localDateTime65 = new org.joda.time.LocalDateTime(chronology64);
        org.joda.time.LocalDateTime localDateTime67 = localDateTime65.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime.Property property68 = localDateTime65.weekOfWeekyear();
        java.lang.String str69 = property68.getName();
        java.util.Locale locale70 = java.util.Locale.ITALY;
        int int71 = property68.getMaximumShortTextLength(locale70);
        java.lang.String str72 = dateTimeField59.getAsShortText((org.joda.time.ReadablePartial) localDateTime63, locale70);
        java.lang.String str73 = locale70.getISO3Language();
        java.lang.String str74 = locale70.getLanguage();
        java.lang.String str77 = nameProvider0.getName(locale70, "2022-02-14T14:55:21.808", "2022-02-14T14:54:03.002");
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField37 and durationField58", (durationField37.compareTo(durationField58) == 0) == durationField37.equals(durationField58));
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test637");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = copticChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = copticChronology1.getZone();
        org.joda.time.LocalDateTime localDateTime6 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) copticChronology1);
        org.joda.time.DurationField durationField7 = copticChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology1.hourOfHalfday();
        org.joda.time.DurationField durationField9 = copticChronology1.hours();
        org.joda.time.DurationField durationField10 = copticChronology1.minutes();
        org.joda.time.DurationField durationField11 = copticChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology1.dayOfYear();
        org.joda.time.DurationField durationField14 = copticChronology1.years();
        org.joda.time.DurationField durationField15 = copticChronology1.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField14", (durationField3.compareTo(durationField14) == 0) == durationField3.equals(durationField14));
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test638");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.weekyearOfCentury();
        org.joda.time.DurationField durationField3 = copticChronology1.seconds();
        org.joda.time.DurationField durationField4 = copticChronology1.years();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology1.weekOfWeekyear();
        org.joda.time.DurationField durationField6 = copticChronology1.centuries();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.chrono.CopticChronology copticChronology8 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone7);
        org.joda.time.DateTimeField dateTimeField9 = copticChronology8.clockhourOfDay();
        org.joda.time.DurationField durationField10 = copticChronology8.weekyears();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology8.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.chrono.CopticChronology copticChronology13 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone12);
        org.joda.time.DateTimeField dateTimeField14 = copticChronology13.clockhourOfDay();
        java.util.Locale locale16 = java.util.Locale.ITALIAN;
        java.lang.String str17 = dateTimeField14.getAsText((long) 'a', locale16);
        int int18 = dateTimeField11.getMaximumTextLength(locale16);
        int int20 = dateTimeField11.getMinimumValue((-3600001L));
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime(chronology21);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime22.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime.Property property25 = localDateTime24.weekOfWeekyear();
        org.joda.time.LocalDateTime.Property property26 = localDateTime24.centuryOfEra();
        java.lang.String str27 = localDateTime24.toString();
        java.util.Locale locale29 = java.util.Locale.ENGLISH;
        java.lang.String str30 = dateTimeField11.getAsShortText((org.joda.time.ReadablePartial) localDateTime24, (-292275054), locale29);
        org.joda.time.LocalDateTime.Property property31 = localDateTime24.millisOfSecond();
        org.joda.time.ReadableDuration readableDuration32 = null;
        org.joda.time.LocalDateTime localDateTime34 = localDateTime24.withDurationAdded(readableDuration32, 24);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime34.plusHours(52);
        int int37 = localDateTime34.getCenturyOfEra();
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.chrono.CopticChronology copticChronology39 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone38);
        org.joda.time.DateTimeField dateTimeField40 = copticChronology39.hourOfDay();
        org.joda.time.DateTimeField dateTimeField41 = copticChronology39.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField42 = copticChronology39.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime43 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) copticChronology39);
        org.joda.time.DateTimeField dateTimeField44 = copticChronology39.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField45 = copticChronology39.millisOfDay();
        org.joda.time.LocalDateTime localDateTime46 = new org.joda.time.LocalDateTime((org.joda.time.Chronology) copticChronology39);
        org.joda.time.LocalDateTime.Property property47 = localDateTime46.yearOfEra();
        org.joda.time.LocalDateTime localDateTime48 = property47.roundHalfCeilingCopy();
        int[] intArray49 = localDateTime48.getValues();
        copticChronology1.validate((org.joda.time.ReadablePartial) localDateTime34, intArray49);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField10", (durationField4.compareTo(durationField10) == 0) == durationField4.equals(durationField10));
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test639");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = copticChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField5 = copticChronology1.hours();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.yearOfEra();
        org.joda.time.DurationField durationField7 = copticChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField7, durationField3, and durationField5", !(durationField7.compareTo(durationField3) == 0) || (Math.signum(durationField7.compareTo(durationField5)) == Math.signum(durationField3.compareTo(durationField5))));
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test640");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.DateTime dateTime9 = localDateTime7.toDateTime(readableInstant8);
        long long10 = dateTime9.getMillis();
        java.util.TimeZone timeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        java.lang.String str14 = dateTimeZone12.getNameKey((long) (byte) 0);
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime(dateTimeZone12);
        java.util.TimeZone timeZone16 = null;
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forTimeZone(timeZone16);
        java.lang.String str19 = dateTimeZone17.getNameKey((long) (byte) 0);
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime(dateTimeZone17);
        boolean boolean21 = localDateTime15.isEqual((org.joda.time.ReadablePartial) localDateTime20);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime20.plusWeeks(0);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime20.withDayOfMonth(26);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.chrono.CopticChronology copticChronology27 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone26);
        org.joda.time.DateTimeField dateTimeField28 = copticChronology27.hourOfDay();
        org.joda.time.DateTimeField dateTimeField29 = copticChronology27.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.Chronology chronology31 = copticChronology27.withZone(dateTimeZone30);
        org.joda.time.DateTimeField dateTimeField32 = copticChronology27.millisOfSecond();
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime(chronology33);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime34.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime38 = localDateTime34.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime40 = localDateTime34.withYearOfCentury(0);
        org.joda.time.LocalDateTime.Property property41 = localDateTime40.weekyear();
        org.joda.time.LocalDateTime localDateTime43 = property41.setCopy((int) (byte) 1);
        org.joda.time.DurationField durationField44 = property41.getLeapDurationField();
        org.joda.time.LocalDateTime localDateTime45 = property41.getLocalDateTime();
        org.joda.time.LocalDateTime.Property property46 = localDateTime45.weekOfWeekyear();
        int int47 = dateTimeField32.getMaximumValue((org.joda.time.ReadablePartial) localDateTime45);
        org.joda.time.DateTimeFieldType dateTimeFieldType48 = dateTimeField32.getType();
        int int49 = localDateTime20.get(dateTimeFieldType48);
        boolean boolean50 = dateTime9.isSupported(dateTimeFieldType48);
        org.joda.time.Instant instant51 = dateTime9.toInstant();
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.LocalDateTime localDateTime53 = new org.joda.time.LocalDateTime(chronology52);
        org.joda.time.LocalDateTime localDateTime55 = localDateTime53.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime57 = localDateTime53.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime59 = localDateTime53.withYearOfCentury(0);
        org.joda.time.LocalDateTime.Property property60 = localDateTime59.weekyear();
        org.joda.time.LocalDateTime localDateTime62 = property60.setCopy((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime63 = property60.roundFloorCopy();
        org.joda.time.LocalDateTime localDateTime65 = localDateTime63.plusSeconds(522);
        org.joda.time.LocalDateTime.Property property66 = localDateTime63.dayOfWeek();
        int int67 = localDateTime63.getYearOfCentury();
        org.joda.time.LocalDateTime localDateTime69 = localDateTime63.plusSeconds((-292275054));
        org.joda.time.DateTime dateTime70 = localDateTime63.toDateTime();
        boolean boolean71 = instant51.isBefore((org.joda.time.ReadableInstant) dateTime70);
        org.joda.time.Chronology chronology72 = instant51.getChronology();
        long long76 = chronology72.add(10604185174193L, 1568L, 870);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and instant51", (dateTime9.compareTo(instant51) == 0) == dateTime9.equals(instant51));
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test641");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology1.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.Chronology chronology5 = copticChronology1.withZone(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology1.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone8 = copticChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology1.dayOfWeek();
        org.joda.time.DurationField durationField11 = copticChronology1.weekyears();
        org.joda.time.DurationField durationField12 = copticChronology1.eras();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology1.yearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField11 and durationField12", Math.signum(durationField11.compareTo(durationField12)) == -Math.signum(durationField12.compareTo(durationField11)));
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test642");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.weekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime7 = localDateTime3.withPeriodAdded(readablePeriod5, 8);
        int int8 = localDateTime3.getSecondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime((long) 53, dateTimeZone11);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(chronology13);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime14.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime14.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.DateTime dateTime22 = localDateTime20.toDateTime(readableInstant21);
        java.util.Locale locale23 = java.util.Locale.GERMANY;
        boolean boolean24 = locale23.hasExtensions();
        boolean boolean25 = dateTime22.equals((java.lang.Object) locale23);
        java.util.Locale.LanguageRange[] languageRangeArray26 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList27 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList27, languageRangeArray26);
        java.util.Collection<java.lang.String> strCollection29 = null;
        java.util.List<java.lang.String> strList30 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList27, strCollection29);
        java.util.Collection<java.lang.String> strCollection31 = null;
        java.util.List<java.lang.String> strList32 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList27, strCollection31);
        java.util.Locale.LanguageRange[] languageRangeArray33 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList34 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList34, languageRangeArray33);
        java.util.Collection<java.lang.String> strCollection36 = null;
        java.util.List<java.lang.String> strList37 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList34, strCollection36);
        java.util.Collection<java.lang.String> strCollection38 = null;
        java.util.List<java.lang.String> strList39 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList34, strCollection38);
        java.util.Locale.FilteringMode filteringMode40 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList41 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList27, strCollection38, filteringMode40);
        boolean boolean42 = dateTime22.equals((java.lang.Object) languageRangeList27);
        org.joda.time.DateTime dateTime43 = localDateTime12.toDateTime((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.Instant instant44 = dateTime43.toInstant();
        org.joda.time.DateTime dateTime45 = localDateTime3.toDateTime((org.joda.time.ReadableInstant) instant44);
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.LocalDateTime localDateTime48 = new org.joda.time.LocalDateTime((long) 26, dateTimeZone47);
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.LocalDateTime localDateTime50 = new org.joda.time.LocalDateTime(chronology49);
        org.joda.time.LocalDateTime localDateTime52 = localDateTime50.minusSeconds((int) (short) -1);
        int int53 = localDateTime50.size();
        org.joda.time.DateTime dateTime54 = localDateTime50.toDateTime();
        org.joda.time.DateTime dateTime55 = localDateTime48.toDateTime((org.joda.time.ReadableInstant) dateTime54);
        org.joda.time.Chronology chronology56 = null;
        org.joda.time.LocalDateTime localDateTime57 = new org.joda.time.LocalDateTime(chronology56);
        org.joda.time.LocalDateTime localDateTime59 = localDateTime57.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime61 = localDateTime57.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime63 = localDateTime57.withYearOfCentury(0);
        org.joda.time.LocalDateTime.Property property64 = localDateTime63.weekyear();
        org.joda.time.LocalDateTime localDateTime66 = property64.setCopy((int) (byte) 1);
        long long67 = property64.remainder();
        org.joda.time.LocalDateTime localDateTime68 = property64.withMinimumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType69 = property64.getFieldType();
        int int70 = dateTime54.get(dateTimeFieldType69);
        boolean boolean71 = dateTime45.isAfter((org.joda.time.ReadableInstant) dateTime54);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime43 and instant44", (dateTime43.compareTo(instant44) == 0) == dateTime43.equals(instant44));
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test643");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.CopticChronology copticChronology2 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology2.clockhourOfDay();
        org.joda.time.DurationField durationField4 = copticChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology2.clockhourOfDay();
        org.joda.time.DurationField durationField6 = copticChronology2.hours();
        org.joda.time.DateTimeZone dateTimeZone7 = copticChronology2.getZone();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone7);
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(49L, dateTimeZone7);
        org.joda.time.Chronology chronology10 = localDateTime9.getChronology();
        int int11 = localDateTime9.getWeekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime9.plusYears((-292269338));
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime16 = property14.addWrapFieldToCopy(53738468);
        org.joda.time.LocalDateTime localDateTime17 = property14.withMaximumValue();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime(chronology18);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime19.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime19.plusWeeks((int) (byte) 10);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime(chronology26);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime27.withMillisOfSecond((int) (byte) 1);
        int int32 = localDateTime19.compareTo((org.joda.time.ReadablePartial) localDateTime27);
        org.joda.time.LocalDateTime.Property property33 = localDateTime27.weekyear();
        org.joda.time.LocalDateTime.Property property34 = localDateTime27.millisOfDay();
        org.joda.time.LocalDateTime.Property property35 = localDateTime27.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime37 = localDateTime27.withWeekyear(9);
        org.joda.time.DateTimeField dateTimeField39 = localDateTime27.getField(0);
        org.joda.time.LocalDateTime localDateTime41 = localDateTime27.withMillisOfSecond(366);
        int int42 = property14.compareTo((org.joda.time.ReadablePartial) localDateTime27);
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.chrono.CopticChronology copticChronology44 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone43);
        org.joda.time.DateTimeField dateTimeField45 = copticChronology44.hourOfDay();
        org.joda.time.DateTimeField dateTimeField46 = copticChronology44.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.Chronology chronology48 = copticChronology44.withZone(dateTimeZone47);
        org.joda.time.DateTimeField dateTimeField49 = copticChronology44.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField50 = copticChronology44.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone51 = copticChronology44.getZone();
        org.joda.time.DurationField durationField52 = copticChronology44.eras();
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.LocalDateTime localDateTime54 = new org.joda.time.LocalDateTime(chronology53);
        org.joda.time.LocalDateTime localDateTime56 = localDateTime54.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime58 = localDateTime54.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime60 = localDateTime54.plusWeeks((int) (byte) 10);
        int int61 = localDateTime60.getMillisOfSecond();
        int int62 = localDateTime60.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime64 = localDateTime60.plusHours((int) (short) -1);
        org.joda.time.DurationFieldType durationFieldType65 = null;
        boolean boolean66 = localDateTime60.isSupported(durationFieldType65);
        int[] intArray68 = copticChronology44.get((org.joda.time.ReadablePartial) localDateTime60, (long) 761);
        org.joda.time.LocalDateTime localDateTime70 = localDateTime60.minusYears(373);
        org.joda.time.LocalDateTime localDateTime72 = localDateTime60.plusDays(202);
        boolean boolean73 = property14.equals((java.lang.Object) localDateTime72);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField4 and durationField52", Math.signum(durationField4.compareTo(durationField52)) == -Math.signum(durationField52.compareTo(durationField4)));
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test644");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = copticChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = copticChronology1.getZone();
        org.joda.time.Chronology chronology6 = copticChronology1.withUTC();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.chrono.CopticChronology copticChronology8 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone7);
        org.joda.time.DateTimeField dateTimeField9 = copticChronology8.clockhourOfDay();
        org.joda.time.DurationField durationField10 = copticChronology8.weekyears();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology8.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = copticChronology8.getZone();
        org.joda.time.LocalDateTime localDateTime13 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) copticChronology8);
        org.joda.time.DurationField durationField14 = copticChronology8.weekyears();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology8.hourOfHalfday();
        org.joda.time.DurationField durationField16 = copticChronology8.hours();
        java.util.TimeZone timeZone17 = null;
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forTimeZone(timeZone17);
        java.lang.String str20 = dateTimeZone18.getNameKey((long) (byte) 0);
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime(dateTimeZone18);
        java.util.TimeZone timeZone22 = null;
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        java.lang.String str25 = dateTimeZone23.getNameKey((long) (byte) 0);
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime(dateTimeZone23);
        boolean boolean27 = localDateTime21.isEqual((org.joda.time.ReadablePartial) localDateTime26);
        int[] intArray29 = copticChronology8.get((org.joda.time.ReadablePartial) localDateTime26, (long) 30);
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.chrono.CopticChronology copticChronology31 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone30);
        org.joda.time.DateTimeField dateTimeField32 = copticChronology31.hourOfDay();
        org.joda.time.DateTimeField dateTimeField33 = copticChronology31.centuryOfEra();
        org.joda.time.DurationField durationField34 = copticChronology31.millis();
        org.joda.time.DateTimeField dateTimeField35 = copticChronology31.weekOfWeekyear();
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime(chronology36);
        org.joda.time.LocalDateTime localDateTime39 = localDateTime37.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime41 = localDateTime37.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime43 = localDateTime37.plusWeeks((int) (byte) 10);
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.LocalDateTime localDateTime45 = new org.joda.time.LocalDateTime(chronology44);
        org.joda.time.LocalDateTime localDateTime47 = localDateTime45.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime49 = localDateTime45.withMillisOfSecond((int) (byte) 1);
        int int50 = localDateTime37.compareTo((org.joda.time.ReadablePartial) localDateTime45);
        org.joda.time.LocalDateTime.Property property51 = localDateTime45.weekyear();
        org.joda.time.LocalDateTime localDateTime53 = localDateTime45.minusMillis(2022);
        int[] intArray55 = copticChronology31.get((org.joda.time.ReadablePartial) localDateTime45, (long) '#');
        copticChronology1.validate((org.joda.time.ReadablePartial) localDateTime26, intArray55);
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.LocalDateTime localDateTime58 = new org.joda.time.LocalDateTime(chronology57);
        org.joda.time.LocalDateTime localDateTime60 = localDateTime58.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime62 = localDateTime58.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime64 = localDateTime58.withYearOfCentury(0);
        org.joda.time.LocalDateTime.Property property65 = localDateTime64.weekyear();
        org.joda.time.LocalDateTime localDateTime67 = localDateTime64.plusYears((int) (short) 1);
        long long69 = copticChronology1.set((org.joda.time.ReadablePartial) localDateTime67, (long) 999);
        java.lang.String str70 = copticChronology1.toString();
        org.joda.time.DurationField durationField71 = copticChronology1.hours();
        long long75 = copticChronology1.add(4287379328L, 10508118105L, 526);
        org.joda.time.DurationField durationField76 = copticChronology1.weeks();
        org.joda.time.DurationField durationField77 = copticChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField77, durationField3, and durationField16", !(durationField77.compareTo(durationField3) == 0) || (Math.signum(durationField77.compareTo(durationField16)) == Math.signum(durationField3.compareTo(durationField16))));
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test645");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology1.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology1.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) copticChronology1);
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology1.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology1.secondOfMinute();
        org.joda.time.DurationField durationField9 = copticChronology1.centuries();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology1.secondOfDay();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology1.era();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology1.minuteOfDay();
        long long16 = copticChronology1.add(10598050709676L, (long) 53859026, 18);
        org.joda.time.DurationField durationField17 = copticChronology1.years();
        org.joda.time.DurationField durationField18 = copticChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField18, durationField9, and durationField17", !(durationField18.compareTo(durationField9) == 0) || (Math.signum(durationField18.compareTo(durationField17)) == Math.signum(durationField9.compareTo(durationField17))));
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test646");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.weekyearOfCentury();
        org.joda.time.DurationField durationField3 = copticChronology1.seconds();
        org.joda.time.DurationField durationField4 = copticChronology1.years();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology1.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.minuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone7 = copticChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology1.era();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.chrono.CopticChronology copticChronology12 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone11);
        org.joda.time.DateTimeField dateTimeField13 = copticChronology12.hourOfDay();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology12.secondOfDay();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology12.secondOfDay();
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((long) 10, (org.joda.time.Chronology) copticChronology12);
        long long20 = copticChronology12.add(10L, (long) 522, (int) (byte) 0);
        org.joda.time.DurationField durationField21 = copticChronology12.millis();
        org.joda.time.DurationField durationField22 = copticChronology12.centuries();
        org.joda.time.DurationField durationField23 = copticChronology12.halfdays();
        org.joda.time.DateTimeField dateTimeField24 = copticChronology12.weekOfWeekyear();
        org.joda.time.DurationField durationField25 = copticChronology12.centuries();
        org.joda.time.DurationField durationField26 = copticChronology12.minutes();
        org.joda.time.DurationField durationField27 = copticChronology12.millis();
        org.joda.time.DateTimeZone dateTimeZone28 = copticChronology12.getZone();
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime(990L, dateTimeZone28);
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.chrono.CopticChronology copticChronology31 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone30);
        org.joda.time.DateTimeField dateTimeField32 = copticChronology31.hourOfDay();
        org.joda.time.DateTimeField dateTimeField33 = copticChronology31.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.Chronology chronology35 = copticChronology31.withZone(dateTimeZone34);
        org.joda.time.DateTimeField dateTimeField36 = copticChronology31.millisOfSecond();
        org.joda.time.DurationField durationField37 = copticChronology31.hours();
        org.joda.time.DateTimeField dateTimeField38 = copticChronology31.halfdayOfDay();
        org.joda.time.DurationField durationField39 = copticChronology31.minutes();
        org.joda.time.DateTimeField dateTimeField40 = copticChronology31.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField41 = copticChronology31.monthOfYear();
        int int42 = dateTimeField41.getMinimumValue();
        org.joda.time.LocalDateTime localDateTime44 = new org.joda.time.LocalDateTime((long) (byte) 0);
        int int45 = localDateTime44.getCenturyOfEra();
        int int46 = localDateTime44.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime48 = localDateTime44.plusSeconds(2922728);
        org.joda.time.LocalDateTime localDateTime50 = localDateTime48.plusYears(192863);
        org.joda.time.tz.NameProvider nameProvider51 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.chrono.CopticChronology copticChronology53 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone52);
        org.joda.time.DateTimeField dateTimeField54 = copticChronology53.clockhourOfDay();
        org.joda.time.DurationField durationField55 = copticChronology53.weekyears();
        org.joda.time.DateTimeField dateTimeField56 = copticChronology53.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone57 = null;
        org.joda.time.chrono.CopticChronology copticChronology58 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone57);
        org.joda.time.DateTimeField dateTimeField59 = copticChronology58.clockhourOfDay();
        java.util.Locale locale61 = java.util.Locale.ITALIAN;
        java.lang.String str62 = dateTimeField59.getAsText((long) 'a', locale61);
        int int63 = dateTimeField56.getMaximumTextLength(locale61);
        java.lang.String str66 = nameProvider51.getName(locale61, "dayOfMonth", "GMT");
        java.util.Locale locale67 = java.util.Locale.getDefault();
        java.lang.String str70 = nameProvider51.getName(locale67, "DateTimeField[weekyearOfCentury]", "");
        org.joda.time.DateTimeZone dateTimeZone71 = null;
        org.joda.time.chrono.CopticChronology copticChronology72 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone71);
        org.joda.time.DateTimeField dateTimeField73 = copticChronology72.dayOfMonth();
        org.joda.time.Chronology chronology74 = null;
        org.joda.time.LocalDateTime localDateTime75 = new org.joda.time.LocalDateTime(chronology74);
        org.joda.time.LocalDateTime localDateTime77 = localDateTime75.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime79 = localDateTime75.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime81 = localDateTime75.plusWeeks((int) (byte) 10);
        java.util.Locale locale82 = java.util.Locale.PRC;
        java.lang.String str83 = dateTimeField73.getAsText((org.joda.time.ReadablePartial) localDateTime81, locale82);
        java.lang.String str86 = nameProvider51.getName(locale82, "2022-02-14T14:55:47.103", "53772184");
        java.lang.String str87 = dateTimeField41.getAsText((org.joda.time.ReadablePartial) localDateTime50, locale82);
        java.lang.String str88 = dateTimeField8.getAsText((org.joda.time.ReadablePartial) localDateTime29, locale82);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField55", (durationField4.compareTo(durationField55) == 0) == durationField4.equals(durationField55));
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test647");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray2 = localDateTime1.getFieldTypes();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfDay((int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.plusWeeks((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.chrono.CopticChronology copticChronology9 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone8);
        org.joda.time.DateTimeField dateTimeField10 = copticChronology9.hourOfDay();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology9.secondOfDay();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology9.secondOfDay();
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((long) 10, (org.joda.time.Chronology) copticChronology9);
        int int14 = localDateTime13.getDayOfYear();
        boolean boolean15 = localDateTime6.isEqual((org.joda.time.ReadablePartial) localDateTime13);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(chronology16);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime17.withMillisOfSecond((int) (byte) 1);
        boolean boolean22 = localDateTime6.isAfter((org.joda.time.ReadablePartial) localDateTime17);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime(chronology23);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime24.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime.Property property27 = localDateTime26.weekOfWeekyear();
        org.joda.time.LocalDateTime.Property property28 = localDateTime26.centuryOfEra();
        boolean boolean29 = localDateTime17.equals((java.lang.Object) property28);
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime(chronology30);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime31.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime35 = localDateTime31.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime37 = localDateTime31.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant38 = null;
        org.joda.time.DateTime dateTime39 = localDateTime37.toDateTime(readableInstant38);
        org.joda.time.LocalDateTime.Property property40 = localDateTime37.millisOfDay();
        org.joda.time.LocalDateTime localDateTime42 = localDateTime37.plusMonths(999);
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.LocalDateTime localDateTime44 = new org.joda.time.LocalDateTime(chronology43);
        org.joda.time.LocalDateTime localDateTime46 = localDateTime44.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime48 = localDateTime44.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime50 = localDateTime44.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant51 = null;
        org.joda.time.DateTime dateTime52 = localDateTime50.toDateTime(readableInstant51);
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.LocalDateTime localDateTime54 = new org.joda.time.LocalDateTime(chronology53);
        org.joda.time.LocalDateTime localDateTime56 = localDateTime54.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime58 = localDateTime54.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime60 = localDateTime54.plusWeeks((int) (byte) 10);
        int int61 = localDateTime60.getMillisOfSecond();
        int int62 = localDateTime60.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime64 = localDateTime60.plusHours((int) (short) -1);
        org.joda.time.DurationFieldType durationFieldType65 = null;
        boolean boolean66 = localDateTime60.isSupported(durationFieldType65);
        org.joda.time.DateTime dateTime67 = localDateTime60.toDateTime();
        boolean boolean68 = dateTime52.isAfter((org.joda.time.ReadableInstant) dateTime67);
        org.joda.time.DateTimeZone dateTimeZone69 = dateTime67.getZone();
        org.joda.time.DateTime dateTime70 = localDateTime37.toDateTime((org.joda.time.ReadableInstant) dateTime67);
        org.joda.time.Instant instant71 = dateTime67.toInstant();
        org.joda.time.DateTime dateTime72 = localDateTime17.toDateTime((org.joda.time.ReadableInstant) instant71);
        org.joda.time.DateTimeZone dateTimeZone73 = instant71.getZone();
        java.lang.String str75 = dateTimeZone73.getNameKey(4287249003L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime67 and instant71", (dateTime67.compareTo(instant71) == 0) == dateTime67.equals(instant71));
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test648");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology1.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology1.dayOfWeek();
        org.joda.time.DurationField durationField5 = copticChronology1.eras();
        org.joda.time.DurationField durationField6 = copticChronology1.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField5, durationField6, and durationField5", !(durationField5.compareTo(durationField6) == 0) || (Math.signum(durationField5.compareTo(durationField5)) == Math.signum(durationField6.compareTo(durationField5))));
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test649");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = copticChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField5 = copticChronology1.hours();
        org.joda.time.DateTimeZone dateTimeZone6 = copticChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology1.weekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        long long11 = copticChronology1.add(readablePeriod8, 4287233667L, (int) (short) 1);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime(chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime13.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime13.plusWeeks((int) (byte) 10);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime(chronology20);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime21.withMillisOfSecond((int) (byte) 1);
        int int26 = localDateTime13.compareTo((org.joda.time.ReadablePartial) localDateTime21);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime13.plusWeeks(8035);
        int int29 = localDateTime28.size();
        org.joda.time.Chronology chronology30 = localDateTime28.getChronology();
        long long32 = copticChronology1.set((org.joda.time.ReadablePartial) localDateTime28, 4287465629L);
        org.joda.time.DurationField durationField33 = copticChronology1.years();
        org.joda.time.DurationField durationField34 = copticChronology1.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField33", (durationField3.compareTo(durationField33) == 0) == durationField3.equals(durationField33));
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test650");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.hourOfDay();
        org.joda.time.DurationField durationField3 = copticChronology1.eras();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology1.dayOfYear();
        org.joda.time.DurationField durationField5 = copticChronology1.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField3, durationField5, and durationField3", !(durationField3.compareTo(durationField5) == 0) || (Math.signum(durationField3.compareTo(durationField3)) == Math.signum(durationField5.compareTo(durationField3))));
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test651");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = copticChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = copticChronology1.getZone();
        org.joda.time.Chronology chronology6 = copticChronology1.withUTC();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.chrono.CopticChronology copticChronology8 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone7);
        org.joda.time.DateTimeField dateTimeField9 = copticChronology8.clockhourOfDay();
        org.joda.time.DurationField durationField10 = copticChronology8.weekyears();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology8.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = copticChronology8.getZone();
        org.joda.time.LocalDateTime localDateTime13 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) copticChronology8);
        org.joda.time.DurationField durationField14 = copticChronology8.weekyears();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology8.hourOfHalfday();
        org.joda.time.DurationField durationField16 = copticChronology8.hours();
        java.util.TimeZone timeZone17 = null;
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forTimeZone(timeZone17);
        java.lang.String str20 = dateTimeZone18.getNameKey((long) (byte) 0);
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime(dateTimeZone18);
        java.util.TimeZone timeZone22 = null;
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        java.lang.String str25 = dateTimeZone23.getNameKey((long) (byte) 0);
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime(dateTimeZone23);
        boolean boolean27 = localDateTime21.isEqual((org.joda.time.ReadablePartial) localDateTime26);
        int[] intArray29 = copticChronology8.get((org.joda.time.ReadablePartial) localDateTime26, (long) 30);
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.chrono.CopticChronology copticChronology31 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone30);
        org.joda.time.DateTimeField dateTimeField32 = copticChronology31.hourOfDay();
        org.joda.time.DateTimeField dateTimeField33 = copticChronology31.centuryOfEra();
        org.joda.time.DurationField durationField34 = copticChronology31.millis();
        org.joda.time.DateTimeField dateTimeField35 = copticChronology31.weekOfWeekyear();
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime(chronology36);
        org.joda.time.LocalDateTime localDateTime39 = localDateTime37.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime41 = localDateTime37.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime43 = localDateTime37.plusWeeks((int) (byte) 10);
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.LocalDateTime localDateTime45 = new org.joda.time.LocalDateTime(chronology44);
        org.joda.time.LocalDateTime localDateTime47 = localDateTime45.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime49 = localDateTime45.withMillisOfSecond((int) (byte) 1);
        int int50 = localDateTime37.compareTo((org.joda.time.ReadablePartial) localDateTime45);
        org.joda.time.LocalDateTime.Property property51 = localDateTime45.weekyear();
        org.joda.time.LocalDateTime localDateTime53 = localDateTime45.minusMillis(2022);
        int[] intArray55 = copticChronology31.get((org.joda.time.ReadablePartial) localDateTime45, (long) '#');
        copticChronology1.validate((org.joda.time.ReadablePartial) localDateTime26, intArray55);
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.LocalDateTime localDateTime58 = new org.joda.time.LocalDateTime(chronology57);
        org.joda.time.LocalDateTime localDateTime60 = localDateTime58.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime62 = localDateTime58.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime64 = localDateTime58.withYearOfCentury(0);
        org.joda.time.LocalDateTime.Property property65 = localDateTime64.weekyear();
        org.joda.time.LocalDateTime localDateTime67 = localDateTime64.plusYears((int) (short) 1);
        long long69 = copticChronology1.set((org.joda.time.ReadablePartial) localDateTime67, (long) 999);
        java.lang.String str70 = copticChronology1.toString();
        org.joda.time.DurationField durationField71 = copticChronology1.hours();
        org.joda.time.DurationField durationField72 = copticChronology1.years();
        org.joda.time.DateTimeZone dateTimeZone74 = null;
        org.joda.time.chrono.CopticChronology copticChronology75 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone74);
        org.joda.time.DateTimeField dateTimeField76 = copticChronology75.clockhourOfDay();
        org.joda.time.DurationField durationField77 = copticChronology75.weekyears();
        org.joda.time.DateTimeField dateTimeField78 = copticChronology75.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone79 = copticChronology75.getZone();
        org.joda.time.DateTimeField dateTimeField80 = copticChronology75.yearOfEra();
        org.joda.time.LocalDateTime localDateTime81 = new org.joda.time.LocalDateTime(951144880562L, (org.joda.time.Chronology) copticChronology75);
        org.joda.time.LocalDateTime localDateTime83 = localDateTime81.plusSeconds(862);
        org.joda.time.LocalDateTime.Property property84 = localDateTime81.yearOfEra();
        int[] intArray86 = copticChronology1.get((org.joda.time.ReadablePartial) localDateTime81, 937180799367L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField72", (durationField3.compareTo(durationField72) == 0) == durationField3.equals(durationField72));
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test652");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.plusWeeks((int) (byte) 10);
        int int8 = localDateTime7.getMillisOfSecond();
        int int9 = localDateTime7.getMillisOfSecond();
        java.lang.String str11 = localDateTime7.toString("+100:00");
        org.joda.time.LocalDateTime localDateTime13 = localDateTime7.withWeekyear(792);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime7.withYearOfEra(202);
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.year();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime(chronology17);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime18.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime18.plusWeeks((int) (byte) 10);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime(chronology25);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime26.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime26.withMillisOfSecond((int) (byte) 1);
        int int31 = localDateTime18.compareTo((org.joda.time.ReadablePartial) localDateTime26);
        org.joda.time.LocalDateTime.Property property32 = localDateTime26.weekyear();
        org.joda.time.LocalDateTime.Property property33 = localDateTime26.millisOfDay();
        org.joda.time.LocalDateTime localDateTime35 = property33.setCopy(0);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime(chronology36);
        org.joda.time.LocalDateTime localDateTime39 = localDateTime37.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime41 = localDateTime37.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime43 = localDateTime37.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.DateTime dateTime45 = localDateTime43.toDateTime(readableInstant44);
        org.joda.time.LocalDateTime.Property property46 = localDateTime43.millisOfDay();
        org.joda.time.LocalDateTime localDateTime48 = localDateTime43.plusMonths(999);
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.LocalDateTime localDateTime50 = new org.joda.time.LocalDateTime(chronology49);
        org.joda.time.LocalDateTime localDateTime52 = localDateTime50.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime54 = localDateTime50.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime56 = localDateTime50.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant57 = null;
        org.joda.time.DateTime dateTime58 = localDateTime56.toDateTime(readableInstant57);
        org.joda.time.Chronology chronology59 = null;
        org.joda.time.LocalDateTime localDateTime60 = new org.joda.time.LocalDateTime(chronology59);
        org.joda.time.LocalDateTime localDateTime62 = localDateTime60.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime64 = localDateTime60.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime66 = localDateTime60.plusWeeks((int) (byte) 10);
        int int67 = localDateTime66.getMillisOfSecond();
        int int68 = localDateTime66.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime70 = localDateTime66.plusHours((int) (short) -1);
        org.joda.time.DurationFieldType durationFieldType71 = null;
        boolean boolean72 = localDateTime66.isSupported(durationFieldType71);
        org.joda.time.DateTime dateTime73 = localDateTime66.toDateTime();
        boolean boolean74 = dateTime58.isAfter((org.joda.time.ReadableInstant) dateTime73);
        org.joda.time.DateTimeZone dateTimeZone75 = dateTime73.getZone();
        org.joda.time.DateTime dateTime76 = localDateTime43.toDateTime((org.joda.time.ReadableInstant) dateTime73);
        org.joda.time.Instant instant77 = dateTime73.toInstant();
        int int78 = property33.compareTo((org.joda.time.ReadableInstant) dateTime73);
        org.joda.time.ReadableInstant readableInstant79 = null;
        boolean boolean80 = dateTime73.isBefore(readableInstant79);
        org.joda.time.DateTime dateTime81 = localDateTime15.toDateTime((org.joda.time.ReadableInstant) dateTime73);
        org.joda.time.DateTimeZone dateTimeZone82 = dateTime81.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime73 and instant77", (dateTime73.compareTo(instant77) == 0) == dateTime73.equals(instant77));
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test653");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = copticChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = copticChronology1.getZone();
        org.joda.time.LocalDateTime localDateTime6 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) copticChronology1);
        org.joda.time.DateTimeField dateTimeField7 = copticChronology1.dayOfYear();
        org.joda.time.DurationField durationField8 = copticChronology1.years();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology1.minuteOfHour();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField8", (durationField3.compareTo(durationField8) == 0) == durationField3.equals(durationField8));
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test654");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.hourOfDay();
        org.joda.time.DurationField durationField3 = copticChronology1.eras();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology1.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology1.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone6);
        org.joda.time.DateTimeField dateTimeField8 = copticChronology7.clockhourOfDay();
        org.joda.time.DurationField durationField9 = copticChronology7.weekyears();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology7.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone11 = copticChronology7.getZone();
        org.joda.time.LocalDateTime localDateTime12 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) copticChronology7);
        org.joda.time.DurationField durationField13 = copticChronology7.weekyears();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology7.hourOfHalfday();
        org.joda.time.DurationField durationField15 = copticChronology7.hours();
        java.util.TimeZone timeZone16 = null;
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forTimeZone(timeZone16);
        java.lang.String str19 = dateTimeZone17.getNameKey((long) (byte) 0);
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime(dateTimeZone17);
        java.util.TimeZone timeZone21 = null;
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forTimeZone(timeZone21);
        java.lang.String str24 = dateTimeZone22.getNameKey((long) (byte) 0);
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime(dateTimeZone22);
        boolean boolean26 = localDateTime20.isEqual((org.joda.time.ReadablePartial) localDateTime25);
        int[] intArray28 = copticChronology7.get((org.joda.time.ReadablePartial) localDateTime25, (long) 30);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime25.minusSeconds((int) (short) 1);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime(chronology31);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime32.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime32.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime38 = localDateTime32.plusWeeks((int) (byte) 10);
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.LocalDateTime localDateTime40 = new org.joda.time.LocalDateTime(chronology39);
        org.joda.time.LocalDateTime localDateTime42 = localDateTime40.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime44 = localDateTime40.withMillisOfSecond((int) (byte) 1);
        int int45 = localDateTime32.compareTo((org.joda.time.ReadablePartial) localDateTime40);
        org.joda.time.LocalDateTime.Property property46 = localDateTime40.weekyear();
        org.joda.time.LocalDateTime.Property property47 = localDateTime40.millisOfDay();
        org.joda.time.LocalDateTime localDateTime49 = localDateTime40.minusYears(999);
        org.joda.time.LocalDateTime localDateTime51 = localDateTime49.plusDays((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime53 = localDateTime49.minusMinutes(51046001);
        org.joda.time.LocalDateTime localDateTime54 = localDateTime25.withFields((org.joda.time.ReadablePartial) localDateTime49);
        org.joda.time.LocalDateTime localDateTime56 = localDateTime54.minusMonths(736);
        org.joda.time.DateTimeZone dateTimeZone58 = null;
        org.joda.time.chrono.CopticChronology copticChronology59 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone58);
        org.joda.time.DateTimeField dateTimeField60 = copticChronology59.hourOfDay();
        org.joda.time.DateTimeField dateTimeField61 = copticChronology59.secondOfDay();
        org.joda.time.DurationField durationField62 = dateTimeField61.getLeapDurationField();
        java.util.Locale locale63 = java.util.Locale.PRC;
        int int64 = dateTimeField61.getMaximumShortTextLength(locale63);
        java.util.Set<java.lang.Character> charSet65 = locale63.getExtensionKeys();
        java.lang.String str66 = dateTimeField5.getAsText((org.joda.time.ReadablePartial) localDateTime56, 361, locale63);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField9", Math.signum(durationField3.compareTo(durationField9)) == -Math.signum(durationField9.compareTo(durationField3)));
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test655");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = copticChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology1.halfdayOfDay();
        org.joda.time.DurationField durationField5 = copticChronology1.millis();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField7 = copticChronology1.seconds();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.Chronology chronology9 = copticChronology1.withZone(dateTimeZone8);
        org.joda.time.DurationField durationField10 = chronology9.years();
        org.joda.time.DurationField durationField11 = chronology9.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField10", (durationField3.compareTo(durationField10) == 0) == durationField3.equals(durationField10));
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test656");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.dayOfMonth();
        org.joda.time.DurationField durationField3 = copticChronology1.months();
        org.joda.time.DurationField durationField4 = copticChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology1.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology1.secondOfDay();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology1.centuryOfEra();
        org.joda.time.DurationField durationField9 = copticChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField3, and durationField4", !(durationField9.compareTo(durationField3) == 0) || (Math.signum(durationField9.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test657");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = copticChronology1.weekyears();
        org.joda.time.DurationField durationField4 = copticChronology1.hours();
        int int5 = copticChronology1.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.monthOfYear();
        org.joda.time.DurationField durationField7 = copticChronology1.seconds();
        org.joda.time.DurationField durationField8 = copticChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology1.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.chrono.CopticChronology copticChronology11 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone10);
        org.joda.time.DateTimeField dateTimeField12 = copticChronology11.dayOfMonth();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(chronology13);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime14.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime14.plusWeeks((int) (byte) 10);
        java.util.Locale locale21 = java.util.Locale.PRC;
        java.lang.String str22 = dateTimeField12.getAsText((org.joda.time.ReadablePartial) localDateTime20, locale21);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime20.withDayOfMonth(26);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime20.plusWeeks(86399999);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.chrono.CopticChronology copticChronology28 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone27);
        org.joda.time.DateTimeField dateTimeField29 = copticChronology28.hourOfDay();
        org.joda.time.DateTimeField dateTimeField30 = copticChronology28.secondOfDay();
        org.joda.time.DurationField durationField31 = copticChronology28.years();
        org.joda.time.DateTimeField dateTimeField32 = copticChronology28.dayOfWeek();
        int int34 = dateTimeField32.getMaximumValue(10598050429631L);
        java.util.Locale locale37 = new java.util.Locale("ko-KR");
        java.lang.String str38 = dateTimeField32.getAsText(262, locale37);
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.LocalDateTime localDateTime40 = new org.joda.time.LocalDateTime(chronology39);
        org.joda.time.LocalDateTime localDateTime42 = localDateTime40.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime.Property property43 = localDateTime42.weekOfWeekyear();
        java.lang.String str44 = property43.getAsText();
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.LocalDateTime localDateTime46 = new org.joda.time.LocalDateTime(chronology45);
        org.joda.time.LocalDateTime localDateTime48 = localDateTime46.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime50 = localDateTime46.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime52 = localDateTime46.withYearOfCentury(0);
        org.joda.time.LocalDateTime.Property property53 = localDateTime52.weekyear();
        org.joda.time.LocalDateTime localDateTime55 = property53.setCopy((int) (byte) 1);
        long long56 = property53.remainder();
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.LocalDateTime localDateTime58 = new org.joda.time.LocalDateTime(chronology57);
        org.joda.time.LocalDateTime localDateTime60 = localDateTime58.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime62 = localDateTime58.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime64 = localDateTime58.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant65 = null;
        org.joda.time.DateTime dateTime66 = localDateTime64.toDateTime(readableInstant65);
        org.joda.time.LocalDateTime.Property property67 = localDateTime64.millisOfDay();
        int int68 = property53.compareTo((org.joda.time.ReadablePartial) localDateTime64);
        java.util.Locale locale69 = java.util.Locale.JAPANESE;
        int int70 = property53.getMaximumTextLength(locale69);
        java.util.Locale locale71 = java.util.Locale.GERMANY;
        java.lang.String str72 = locale71.getScript();
        org.joda.time.DateTimeZone dateTimeZone73 = null;
        org.joda.time.chrono.CopticChronology copticChronology74 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone73);
        org.joda.time.DateTimeField dateTimeField75 = copticChronology74.clockhourOfDay();
        java.util.Locale locale77 = java.util.Locale.ITALIAN;
        java.lang.String str78 = dateTimeField75.getAsText((long) 'a', locale77);
        java.lang.String str79 = locale71.getDisplayName(locale77);
        java.lang.String str80 = locale77.getDisplayName();
        java.lang.String str81 = locale77.getDisplayVariant();
        java.lang.String str82 = locale77.getDisplayVariant();
        java.util.Locale locale83 = locale77.stripExtensions();
        java.lang.String str84 = locale69.getDisplayScript(locale83);
        java.lang.String str85 = locale83.getDisplayCountry();
        int int86 = property43.getMaximumTextLength(locale83);
        java.lang.String str87 = locale83.getDisplayName();
        java.lang.String str88 = locale37.getDisplayName(locale83);
        java.lang.String str89 = dateTimeField9.getAsText((org.joda.time.ReadablePartial) localDateTime26, locale83);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField31", (durationField3.compareTo(durationField31) == 0) == durationField3.equals(durationField31));
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test658");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = copticChronology1.weekyears();
        org.joda.time.DurationField durationField4 = copticChronology1.hours();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology1.dayOfMonth();
        org.joda.time.DurationField durationField6 = copticChronology1.halfdays();
        org.joda.time.DurationField durationField7 = copticChronology1.seconds();
        org.joda.time.DurationField durationField8 = copticChronology1.millis();
        org.joda.time.DurationField durationField9 = copticChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField3, and durationField4", !(durationField9.compareTo(durationField3) == 0) || (Math.signum(durationField9.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test659");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = copticChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField5 = copticChronology1.hours();
        org.joda.time.DateTimeZone dateTimeZone6 = copticChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology1.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology1.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology1.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology1.millisOfSecond();
        org.joda.time.DurationField durationField11 = copticChronology1.years();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology1.secondOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField11", (durationField3.compareTo(durationField11) == 0) == durationField3.equals(durationField11));
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test660");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = copticChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology1.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology1.weekyear();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology1.minuteOfDay();
        org.joda.time.DurationField durationField9 = copticChronology1.days();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology1.dayOfYear();
        org.joda.time.DurationField durationField11 = copticChronology1.years();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology1.weekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField11", (durationField3.compareTo(durationField11) == 0) == durationField3.equals(durationField11));
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test661");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology1.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.Chronology chronology5 = copticChronology1.withZone(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology1.clockhourOfHalfday();
        org.joda.time.DurationField durationField8 = copticChronology1.days();
        org.joda.time.DurationField durationField9 = copticChronology1.years();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(chronology10);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime11.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.withMillisOfSecond((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime15.withMinuteOfHour(10);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime15.minusDays(100);
        org.joda.time.LocalDateTime.Property property22 = localDateTime21.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime24 = property22.addToCopy((long) 271);
        org.joda.time.DateTimeField dateTimeField25 = property22.getField();
        boolean boolean26 = copticChronology1.equals((java.lang.Object) property22);
        org.joda.time.DateTimeZone dateTimeZone27 = copticChronology1.getZone();
        java.lang.String str29 = dateTimeZone27.getShortName((long) 1826);
        org.joda.time.chrono.CopticChronology copticChronology30 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone27);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime(chronology31);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime32.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime32.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime38 = localDateTime32.withYearOfCentury(0);
        org.joda.time.LocalDateTime.Property property39 = localDateTime38.weekyear();
        org.joda.time.LocalDateTime localDateTime41 = property39.setCopy((int) (byte) 1);
        long long42 = property39.remainder();
        org.joda.time.LocalDateTime localDateTime43 = property39.withMinimumValue();
        org.joda.time.LocalDateTime localDateTime45 = localDateTime43.withMillisOfSecond(26);
        int int46 = localDateTime45.getMillisOfDay();
        org.joda.time.DateTime dateTime47 = localDateTime45.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.chrono.CopticChronology copticChronology50 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone49);
        org.joda.time.DateTimeField dateTimeField51 = copticChronology50.clockhourOfDay();
        org.joda.time.DurationField durationField52 = copticChronology50.weekyears();
        org.joda.time.DateTimeField dateTimeField53 = copticChronology50.clockhourOfDay();
        org.joda.time.DurationField durationField54 = copticChronology50.hours();
        org.joda.time.DateTimeZone dateTimeZone55 = copticChronology50.getZone();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone55);
        org.joda.time.LocalDateTime localDateTime57 = new org.joda.time.LocalDateTime(49L, dateTimeZone55);
        int int59 = dateTimeZone55.getOffset((long) 833);
        org.joda.time.DateTime dateTime60 = localDateTime45.toDateTime(dateTimeZone55);
        long long62 = dateTimeZone27.getMillisKeepLocal(dateTimeZone55, 10596841138368L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField9 and durationField52", (durationField9.compareTo(durationField52) == 0) == durationField9.equals(durationField52));
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test662");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.plusWeeks((int) (byte) 10);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(chronology8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime9.withMillisOfSecond((int) (byte) 1);
        int int14 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime9);
        org.joda.time.LocalDateTime.Property property15 = localDateTime9.weekyear();
        org.joda.time.LocalDateTime.Property property16 = localDateTime9.millisOfDay();
        org.joda.time.DurationField durationField17 = property16.getLeapDurationField();
        org.joda.time.LocalDateTime localDateTime18 = property16.withMinimumValue();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime(chronology19);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime20.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime20.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime20.withYearOfCentury(0);
        org.joda.time.LocalDateTime.Property property27 = localDateTime26.weekyear();
        org.joda.time.LocalDateTime localDateTime29 = property27.setCopy((int) (byte) 1);
        org.joda.time.DurationField durationField30 = property27.getLeapDurationField();
        org.joda.time.LocalDateTime localDateTime31 = property27.getLocalDateTime();
        org.joda.time.LocalDateTime.Property property32 = localDateTime31.weekOfWeekyear();
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.DateTime dateTime34 = localDateTime31.toDateTime(readableInstant33);
        org.joda.time.Instant instant35 = dateTime34.toInstant();
        org.joda.time.DateTime dateTime36 = localDateTime18.toDateTime((org.joda.time.ReadableInstant) instant35);
        org.joda.time.ReadablePeriod readablePeriod37 = null;
        org.joda.time.LocalDateTime localDateTime38 = localDateTime18.minus(readablePeriod37);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime34 and instant35", (dateTime34.compareTo(instant35) == 0) == dateTime34.equals(instant35));
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test663");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.hourOfDay();
        org.joda.time.DurationField durationField3 = copticChronology1.eras();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology1.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology1.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone6 = copticChronology1.getZone();
        java.lang.String str8 = dateTimeZone6.getNameKey((long) 761);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.chrono.CopticChronology copticChronology10 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField11 = copticChronology10.hourOfDay();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology10.secondOfDay();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(chronology13);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime14.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.withMillisOfSecond((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime18.withMinuteOfHour(10);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime18.minusDays(0);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.chrono.CopticChronology copticChronology26 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone25);
        org.joda.time.DateTimeField dateTimeField27 = copticChronology26.clockhourOfDay();
        org.joda.time.DurationField durationField28 = copticChronology26.weekyears();
        org.joda.time.DateTimeField dateTimeField29 = copticChronology26.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField30 = copticChronology26.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField31 = copticChronology26.hourOfDay();
        org.joda.time.ReadablePartial readablePartial32 = null;
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.chrono.CopticChronology copticChronology34 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone33);
        org.joda.time.DateTimeField dateTimeField35 = copticChronology34.hourOfDay();
        org.joda.time.DateTimeField dateTimeField36 = copticChronology34.centuryOfEra();
        org.joda.time.DurationField durationField37 = copticChronology34.millis();
        org.joda.time.DateTimeField dateTimeField38 = copticChronology34.weekOfWeekyear();
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.LocalDateTime localDateTime40 = new org.joda.time.LocalDateTime(chronology39);
        org.joda.time.LocalDateTime localDateTime42 = localDateTime40.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime44 = localDateTime40.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime46 = localDateTime40.plusWeeks((int) (byte) 10);
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.LocalDateTime localDateTime48 = new org.joda.time.LocalDateTime(chronology47);
        org.joda.time.LocalDateTime localDateTime50 = localDateTime48.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime52 = localDateTime48.withMillisOfSecond((int) (byte) 1);
        int int53 = localDateTime40.compareTo((org.joda.time.ReadablePartial) localDateTime48);
        org.joda.time.LocalDateTime.Property property54 = localDateTime48.weekyear();
        org.joda.time.LocalDateTime localDateTime56 = localDateTime48.minusMillis(2022);
        int[] intArray58 = copticChronology34.get((org.joda.time.ReadablePartial) localDateTime48, (long) '#');
        int int59 = dateTimeField31.getMinimumValue(readablePartial32, intArray58);
        int int60 = dateTimeField12.getMaximumValue((org.joda.time.ReadablePartial) localDateTime24, intArray58);
        org.joda.time.DateTimeZone dateTimeZone62 = null;
        org.joda.time.chrono.CopticChronology copticChronology63 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone62);
        org.joda.time.DateTimeField dateTimeField64 = copticChronology63.hourOfDay();
        org.joda.time.DateTimeField dateTimeField65 = copticChronology63.secondOfDay();
        org.joda.time.DateTimeField dateTimeField66 = copticChronology63.secondOfDay();
        org.joda.time.DateTimeField dateTimeField67 = copticChronology63.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField68 = copticChronology63.clockhourOfHalfday();
        org.joda.time.LocalDateTime localDateTime69 = new org.joda.time.LocalDateTime(1L, (org.joda.time.Chronology) copticChronology63);
        org.joda.time.Chronology chronology70 = null;
        org.joda.time.LocalDateTime localDateTime71 = new org.joda.time.LocalDateTime(chronology70);
        org.joda.time.LocalDateTime localDateTime73 = localDateTime71.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime75 = localDateTime71.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime77 = localDateTime71.withYearOfCentury(0);
        org.joda.time.LocalDateTime.Property property78 = localDateTime77.weekyear();
        org.joda.time.LocalDateTime localDateTime80 = property78.setCopy((int) (byte) 1);
        long long81 = property78.remainder();
        org.joda.time.Chronology chronology82 = null;
        org.joda.time.LocalDateTime localDateTime83 = new org.joda.time.LocalDateTime(chronology82);
        org.joda.time.LocalDateTime localDateTime85 = localDateTime83.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime87 = localDateTime83.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime89 = localDateTime83.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant90 = null;
        org.joda.time.DateTime dateTime91 = localDateTime89.toDateTime(readableInstant90);
        org.joda.time.LocalDateTime.Property property92 = localDateTime89.millisOfDay();
        int int93 = property78.compareTo((org.joda.time.ReadablePartial) localDateTime89);
        boolean boolean95 = property78.equals((java.lang.Object) 126L);
        org.joda.time.DateTimeFieldType dateTimeFieldType96 = property78.getFieldType();
        org.joda.time.LocalDateTime.Property property97 = localDateTime69.property(dateTimeFieldType96);
        boolean boolean98 = localDateTime24.isSupported(dateTimeFieldType96);
        boolean boolean99 = dateTimeZone6.isLocalDateTimeGap(localDateTime24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField28", Math.signum(durationField3.compareTo(durationField28)) == -Math.signum(durationField28.compareTo(durationField3)));
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test664");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology1.dayOfMonth();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(chronology4);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime5.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime5.withYearOfCentury(0);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.weekyear();
        org.joda.time.LocalDateTime localDateTime14 = property12.setCopy((int) (byte) 1);
        long long15 = property12.remainder();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(chronology16);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime17.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime17.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.DateTime dateTime25 = localDateTime23.toDateTime(readableInstant24);
        org.joda.time.LocalDateTime.Property property26 = localDateTime23.millisOfDay();
        int int27 = property12.compareTo((org.joda.time.ReadablePartial) localDateTime23);
        int int28 = dateTimeField3.getMaximumValue((org.joda.time.ReadablePartial) localDateTime23);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = null;
        java.lang.String str30 = localDateTime23.toString(dateTimeFormatter29);
        int int31 = localDateTime23.getSecondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.chrono.CopticChronology copticChronology33 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone32);
        org.joda.time.DateTimeField dateTimeField34 = copticChronology33.hourOfDay();
        org.joda.time.DateTimeField dateTimeField35 = copticChronology33.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField36 = copticChronology33.dayOfWeek();
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.LocalDateTime localDateTime38 = new org.joda.time.LocalDateTime(chronology37);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray39 = localDateTime38.getFieldTypes();
        org.joda.time.LocalDateTime localDateTime41 = localDateTime38.withMillisOfDay((int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime43 = localDateTime41.plusWeeks((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.chrono.CopticChronology copticChronology46 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone45);
        org.joda.time.DateTimeField dateTimeField47 = copticChronology46.hourOfDay();
        org.joda.time.DateTimeField dateTimeField48 = copticChronology46.secondOfDay();
        org.joda.time.DateTimeField dateTimeField49 = copticChronology46.secondOfDay();
        org.joda.time.LocalDateTime localDateTime50 = new org.joda.time.LocalDateTime((long) 10, (org.joda.time.Chronology) copticChronology46);
        int int51 = localDateTime50.getDayOfYear();
        boolean boolean52 = localDateTime43.isEqual((org.joda.time.ReadablePartial) localDateTime50);
        org.joda.time.DateTimeZone dateTimeZone53 = null;
        org.joda.time.chrono.CopticChronology copticChronology54 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone53);
        org.joda.time.DateTimeField dateTimeField55 = copticChronology54.hourOfDay();
        org.joda.time.DateTimeField dateTimeField56 = copticChronology54.centuryOfEra();
        org.joda.time.DurationField durationField57 = copticChronology54.millis();
        org.joda.time.DateTimeField dateTimeField58 = copticChronology54.weekOfWeekyear();
        org.joda.time.Chronology chronology59 = null;
        org.joda.time.LocalDateTime localDateTime60 = new org.joda.time.LocalDateTime(chronology59);
        org.joda.time.LocalDateTime localDateTime62 = localDateTime60.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime64 = localDateTime60.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime66 = localDateTime60.plusWeeks((int) (byte) 10);
        org.joda.time.Chronology chronology67 = null;
        org.joda.time.LocalDateTime localDateTime68 = new org.joda.time.LocalDateTime(chronology67);
        org.joda.time.LocalDateTime localDateTime70 = localDateTime68.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime72 = localDateTime68.withMillisOfSecond((int) (byte) 1);
        int int73 = localDateTime60.compareTo((org.joda.time.ReadablePartial) localDateTime68);
        org.joda.time.LocalDateTime.Property property74 = localDateTime68.weekyear();
        org.joda.time.LocalDateTime localDateTime76 = localDateTime68.minusMillis(2022);
        int[] intArray78 = copticChronology54.get((org.joda.time.ReadablePartial) localDateTime68, (long) '#');
        int int79 = dateTimeField36.getMinimumValue((org.joda.time.ReadablePartial) localDateTime50, intArray78);
        org.joda.time.LocalDateTime localDateTime80 = localDateTime23.withFields((org.joda.time.ReadablePartial) localDateTime50);
        org.joda.time.DateTimeZone dateTimeZone81 = null;
        org.joda.time.chrono.CopticChronology copticChronology82 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone81);
        org.joda.time.DateTimeField dateTimeField83 = copticChronology82.clockhourOfDay();
        org.joda.time.DurationField durationField84 = copticChronology82.weekyears();
        org.joda.time.DateTimeField dateTimeField85 = copticChronology82.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone86 = copticChronology82.getZone();
        org.joda.time.DurationField durationField87 = copticChronology82.weeks();
        org.joda.time.DateTimeField dateTimeField88 = copticChronology82.yearOfEra();
        org.joda.time.DateTimeField dateTimeField89 = copticChronology82.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone90 = copticChronology82.getZone();
        boolean boolean91 = localDateTime23.equals((java.lang.Object) dateTimeZone90);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on localDateTime50 and localDateTime80", (localDateTime50.compareTo(localDateTime80) == 0) == localDateTime50.equals(localDateTime80));
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test665");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology1.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology1.dayOfWeek();
        org.joda.time.DurationField durationField5 = copticChronology1.eras();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.weekyear();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology1.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology1.weekyear();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology1.yearOfEra();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology1.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology1.minuteOfDay();
        org.joda.time.DurationField durationField13 = copticChronology1.months();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField5, durationField13, and durationField5", !(durationField5.compareTo(durationField13) == 0) || (Math.signum(durationField5.compareTo(durationField5)) == Math.signum(durationField13.compareTo(durationField5))));
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test666");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.clockhourOfDay();
        long long6 = copticChronology1.add((long) '#', (long) 'a', (int) '#');
        org.joda.time.DateTimeField dateTimeField7 = copticChronology1.clockhourOfHalfday();
        org.joda.time.DurationField durationField8 = copticChronology1.eras();
        org.joda.time.DurationField durationField9 = copticChronology1.eras();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology1.secondOfDay();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology1.monthOfYear();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology1.monthOfYear();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology1.year();
        org.joda.time.DurationField durationField15 = copticChronology1.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField8, durationField15, and durationField8", !(durationField8.compareTo(durationField15) == 0) || (Math.signum(durationField8.compareTo(durationField8)) == Math.signum(durationField15.compareTo(durationField8))));
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test667");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology1.yearOfEra();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology1.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology1.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.chrono.CopticChronology copticChronology8 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone7);
        org.joda.time.DateTimeField dateTimeField9 = copticChronology8.hourOfDay();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology8.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology8.dayOfWeek();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime(chronology12);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray14 = localDateTime13.getFieldTypes();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime13.withMillisOfDay((int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.plusWeeks((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.chrono.CopticChronology copticChronology21 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone20);
        org.joda.time.DateTimeField dateTimeField22 = copticChronology21.hourOfDay();
        org.joda.time.DateTimeField dateTimeField23 = copticChronology21.secondOfDay();
        org.joda.time.DateTimeField dateTimeField24 = copticChronology21.secondOfDay();
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime((long) 10, (org.joda.time.Chronology) copticChronology21);
        int int26 = localDateTime25.getDayOfYear();
        boolean boolean27 = localDateTime18.isEqual((org.joda.time.ReadablePartial) localDateTime25);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.chrono.CopticChronology copticChronology29 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone28);
        org.joda.time.DateTimeField dateTimeField30 = copticChronology29.hourOfDay();
        org.joda.time.DateTimeField dateTimeField31 = copticChronology29.centuryOfEra();
        org.joda.time.DurationField durationField32 = copticChronology29.millis();
        org.joda.time.DateTimeField dateTimeField33 = copticChronology29.weekOfWeekyear();
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime(chronology34);
        org.joda.time.LocalDateTime localDateTime37 = localDateTime35.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime39 = localDateTime35.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime41 = localDateTime35.plusWeeks((int) (byte) 10);
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.LocalDateTime localDateTime43 = new org.joda.time.LocalDateTime(chronology42);
        org.joda.time.LocalDateTime localDateTime45 = localDateTime43.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime47 = localDateTime43.withMillisOfSecond((int) (byte) 1);
        int int48 = localDateTime35.compareTo((org.joda.time.ReadablePartial) localDateTime43);
        org.joda.time.LocalDateTime.Property property49 = localDateTime43.weekyear();
        org.joda.time.LocalDateTime localDateTime51 = localDateTime43.minusMillis(2022);
        int[] intArray53 = copticChronology29.get((org.joda.time.ReadablePartial) localDateTime43, (long) '#');
        int int54 = dateTimeField11.getMinimumValue((org.joda.time.ReadablePartial) localDateTime25, intArray53);
        int int55 = localDateTime25.getMinuteOfHour();
        org.joda.time.LocalDateTime localDateTime57 = localDateTime25.withWeekyear((int) (byte) 10);
        org.joda.time.Chronology chronology58 = null;
        org.joda.time.LocalDateTime localDateTime59 = new org.joda.time.LocalDateTime(chronology58);
        org.joda.time.LocalDateTime localDateTime61 = localDateTime59.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime63 = localDateTime59.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime65 = localDateTime59.withYearOfCentury(0);
        org.joda.time.LocalDateTime.Property property66 = localDateTime65.weekyear();
        org.joda.time.LocalDateTime localDateTime68 = property66.setCopy((int) (byte) 1);
        org.joda.time.DurationField durationField69 = property66.getLeapDurationField();
        org.joda.time.LocalDateTime localDateTime70 = property66.getLocalDateTime();
        org.joda.time.LocalDateTime localDateTime72 = localDateTime70.plusWeeks(522);
        org.joda.time.DateTimeZone dateTimeZone73 = null;
        org.joda.time.chrono.CopticChronology copticChronology74 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone73);
        org.joda.time.DateTimeField dateTimeField75 = copticChronology74.clockhourOfDay();
        org.joda.time.DurationField durationField76 = copticChronology74.weekyears();
        org.joda.time.DateTimeField dateTimeField77 = copticChronology74.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone78 = copticChronology74.getZone();
        org.joda.time.LocalDateTime localDateTime79 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) copticChronology74);
        org.joda.time.DurationField durationField80 = copticChronology74.weekyears();
        org.joda.time.DateTimeField dateTimeField81 = copticChronology74.hourOfHalfday();
        org.joda.time.DurationField durationField82 = copticChronology74.hours();
        org.joda.time.DurationFieldType durationFieldType83 = durationField82.getType();
        org.joda.time.LocalDateTime localDateTime85 = localDateTime70.withFieldAdded(durationFieldType83, 0);
        org.joda.time.LocalDateTime localDateTime87 = localDateTime57.withFieldAdded(durationFieldType83, 879);
        int[] intArray89 = copticChronology1.get((org.joda.time.ReadablePartial) localDateTime87, 10L);
        java.lang.String str90 = copticChronology1.toString();
        org.joda.time.DurationField durationField91 = copticChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField91, durationField32, and durationField69", !(durationField91.compareTo(durationField32) == 0) || (Math.signum(durationField91.compareTo(durationField69)) == Math.signum(durationField32.compareTo(durationField69))));
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test668");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology1.secondOfDay();
        org.joda.time.DurationField durationField4 = copticChronology1.years();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology1.year();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.minuteOfDay();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((org.joda.time.Chronology) copticChronology1);
        int int8 = localDateTime7.getWeekOfWeekyear();
        int int9 = localDateTime7.size();
        org.joda.time.LocalDateTime.Property property10 = localDateTime7.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.chrono.CopticChronology copticChronology12 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone11);
        org.joda.time.DateTimeField dateTimeField13 = copticChronology12.clockhourOfDay();
        org.joda.time.DurationField durationField14 = copticChronology12.weekyears();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology12.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone16 = copticChronology12.getZone();
        org.joda.time.LocalDateTime localDateTime17 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) copticChronology12);
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.secondOfMinute();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime(chronology19);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray21 = localDateTime20.getFieldTypes();
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        org.joda.time.LocalDateTime localDateTime23 = localDateTime20.plus(readablePeriod22);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime20.minusMinutes((int) 'a');
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime(chronology26);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime27.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime27.withYearOfCentury(0);
        org.joda.time.LocalDateTime.Property property34 = localDateTime33.weekyear();
        org.joda.time.LocalDateTime localDateTime36 = property34.setCopy((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime37 = property34.roundFloorCopy();
        org.joda.time.LocalDateTime localDateTime39 = property34.setCopy((int) '#');
        org.joda.time.ReadableDuration readableDuration40 = null;
        org.joda.time.LocalDateTime localDateTime41 = localDateTime39.plus(readableDuration40);
        org.joda.time.DateTime dateTime42 = localDateTime41.toDateTime();
        org.joda.time.ReadableDuration readableDuration43 = null;
        org.joda.time.LocalDateTime localDateTime44 = localDateTime41.minus(readableDuration43);
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.LocalDateTime localDateTime46 = new org.joda.time.LocalDateTime(chronology45);
        org.joda.time.LocalDateTime localDateTime48 = localDateTime46.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime50 = localDateTime46.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime52 = localDateTime46.withYearOfCentury(0);
        org.joda.time.LocalDateTime.Property property53 = localDateTime52.weekyear();
        org.joda.time.LocalDateTime localDateTime55 = property53.setCopy((int) (byte) 1);
        org.joda.time.DurationField durationField56 = property53.getLeapDurationField();
        org.joda.time.LocalDateTime localDateTime57 = property53.getLocalDateTime();
        org.joda.time.LocalDateTime.Property property58 = localDateTime57.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone59 = null;
        org.joda.time.chrono.CopticChronology copticChronology60 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone59);
        org.joda.time.DateTimeField dateTimeField61 = copticChronology60.hourOfDay();
        org.joda.time.DateTimeField dateTimeField62 = copticChronology60.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone63 = null;
        org.joda.time.Chronology chronology64 = copticChronology60.withZone(dateTimeZone63);
        org.joda.time.DateTimeField dateTimeField65 = copticChronology60.millisOfSecond();
        org.joda.time.Chronology chronology66 = null;
        org.joda.time.LocalDateTime localDateTime67 = new org.joda.time.LocalDateTime(chronology66);
        org.joda.time.LocalDateTime localDateTime69 = localDateTime67.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime71 = localDateTime67.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime73 = localDateTime67.withYearOfCentury(0);
        org.joda.time.LocalDateTime.Property property74 = localDateTime73.weekyear();
        org.joda.time.LocalDateTime localDateTime76 = property74.setCopy((int) (byte) 1);
        org.joda.time.DurationField durationField77 = property74.getLeapDurationField();
        org.joda.time.LocalDateTime localDateTime78 = property74.getLocalDateTime();
        org.joda.time.LocalDateTime.Property property79 = localDateTime78.weekOfWeekyear();
        int int80 = dateTimeField65.getMaximumValue((org.joda.time.ReadablePartial) localDateTime78);
        org.joda.time.DateTimeFieldType dateTimeFieldType81 = dateTimeField65.getType();
        int int82 = localDateTime57.indexOf(dateTimeFieldType81);
        int int83 = localDateTime44.indexOf(dateTimeFieldType81);
        int int84 = localDateTime20.get(dateTimeFieldType81);
        int int85 = localDateTime17.indexOf(dateTimeFieldType81);
        int int86 = localDateTime7.indexOf(dateTimeFieldType81);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField14", (durationField4.compareTo(durationField14) == 0) == durationField4.equals(durationField14));
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test669");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = copticChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = copticChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.yearOfEra();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology1.millisOfDay();
        org.joda.time.DurationField durationField8 = copticChronology1.eras();
        java.lang.String str9 = copticChronology1.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField8", Math.signum(durationField3.compareTo(durationField8)) == -Math.signum(durationField8.compareTo(durationField3)));
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test670");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.CopticChronology copticChronology2 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology2.clockhourOfDay();
        org.joda.time.DurationField durationField4 = copticChronology2.weekyears();
        org.joda.time.DurationField durationField5 = copticChronology2.centuries();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology2.weekyear();
        org.joda.time.DateTimeZone dateTimeZone7 = copticChronology2.getZone();
        java.lang.String str9 = dateTimeZone7.getName((long) 53);
        java.lang.String str11 = dateTimeZone7.getShortName((-3600001L));
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(obj0, dateTimeZone7);
        org.joda.time.chrono.CopticChronology copticChronology13 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone7);
        org.joda.time.DateTimeField dateTimeField14 = copticChronology13.secondOfDay();
        org.joda.time.DurationField durationField15 = copticChronology13.years();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology13.weekOfWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField15", (durationField4.compareTo(durationField15) == 0) == durationField4.equals(durationField15));
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test671");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.withYearOfCentury(0);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.weekyear();
        org.joda.time.LocalDateTime localDateTime10 = property8.setCopy((int) (byte) 1);
        org.joda.time.DurationField durationField11 = property8.getLeapDurationField();
        org.joda.time.LocalDateTime localDateTime12 = property8.getLocalDateTime();
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.weekOfWeekyear();
        boolean boolean14 = property13.isLeap();
        org.joda.time.LocalDateTime localDateTime16 = property13.addWrapFieldToCopy(53654026);
        java.util.Locale locale18 = java.util.Locale.forLanguageTag("2022-02-14T14:54:15.220");
        boolean boolean19 = property13.equals((java.lang.Object) locale18);
        org.joda.time.LocalDateTime localDateTime20 = property13.withMinimumValue();
        org.joda.time.LocalDateTime localDateTime21 = property13.roundCeilingCopy();
        int int22 = property13.getMaximumValueOverall();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.chrono.CopticChronology copticChronology24 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField25 = copticChronology24.clockhourOfDay();
        org.joda.time.DurationField durationField26 = copticChronology24.weekyears();
        org.joda.time.DateTimeField dateTimeField27 = copticChronology24.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone28 = copticChronology24.getZone();
        org.joda.time.DurationField durationField29 = copticChronology24.weeks();
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.chrono.CopticChronology copticChronology31 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone30);
        org.joda.time.DateTimeField dateTimeField32 = copticChronology31.clockhourOfDay();
        org.joda.time.DurationField durationField33 = copticChronology31.weekyears();
        org.joda.time.DateTimeField dateTimeField34 = copticChronology31.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField35 = copticChronology31.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField36 = copticChronology31.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField37 = copticChronology31.weekyear();
        org.joda.time.DateTimeField dateTimeField38 = copticChronology31.hourOfDay();
        boolean boolean39 = copticChronology24.equals((java.lang.Object) copticChronology31);
        org.joda.time.DurationField durationField40 = copticChronology24.months();
        org.joda.time.DateTimeField dateTimeField41 = copticChronology24.monthOfYear();
        java.util.Locale locale42 = java.util.Locale.JAPAN;
        java.lang.String str43 = locale42.getISO3Language();
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.chrono.CopticChronology copticChronology45 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone44);
        org.joda.time.DateTimeField dateTimeField46 = copticChronology45.hourOfDay();
        org.joda.time.DateTimeField dateTimeField47 = copticChronology45.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone48 = null;
        org.joda.time.Chronology chronology49 = copticChronology45.withZone(dateTimeZone48);
        org.joda.time.DateTimeField dateTimeField50 = copticChronology45.millisOfSecond();
        org.joda.time.DurationField durationField51 = copticChronology45.hours();
        org.joda.time.DateTimeField dateTimeField52 = copticChronology45.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField53 = copticChronology45.dayOfMonth();
        java.util.Locale locale55 = java.util.Locale.forLanguageTag("2022-02-21T14:53:57.365");
        int int56 = dateTimeField53.getMaximumShortTextLength(locale55);
        java.lang.String str57 = locale55.getScript();
        java.lang.String str58 = locale42.getDisplayScript(locale55);
        java.util.Locale locale59 = java.util.Locale.ROOT;
        java.util.Locale locale60 = java.util.Locale.UK;
        java.lang.String str61 = locale59.getDisplayCountry(locale60);
        java.lang.String str62 = locale42.getDisplayCountry(locale59);
        int int63 = dateTimeField41.getMaximumTextLength(locale59);
        int int64 = property13.getMaximumShortTextLength(locale59);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField11 and durationField29", (durationField11.compareTo(durationField29) == 0) == durationField11.equals(durationField29));
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test672");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology1.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.Chronology chronology5 = copticChronology1.withZone(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.millisOfSecond();
        org.joda.time.DurationField durationField7 = copticChronology1.hours();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology1.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology1.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology1.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.chrono.CopticChronology copticChronology12 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone11);
        org.joda.time.DateTimeField dateTimeField13 = copticChronology12.clockhourOfDay();
        org.joda.time.DurationField durationField14 = copticChronology12.weekyears();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology12.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology12.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology12.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField18 = copticChronology12.weekyear();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime((long) 53, dateTimeZone21);
        org.joda.time.Chronology chronology23 = copticChronology12.withZone(dateTimeZone21);
        boolean boolean24 = copticChronology1.equals((java.lang.Object) copticChronology12);
        org.joda.time.DurationField durationField25 = copticChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField26 = copticChronology1.hourOfDay();
        org.joda.time.DurationField durationField27 = copticChronology1.years();
        org.joda.time.DurationField durationField28 = copticChronology1.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField14 and durationField27", (durationField14.compareTo(durationField27) == 0) == durationField14.equals(durationField27));
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test673");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.dayOfMonth();
        org.joda.time.DurationField durationField3 = copticChronology1.months();
        org.joda.time.DurationField durationField4 = copticChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology1.yearOfCentury();
        org.joda.time.Chronology chronology6 = copticChronology1.withUTC();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.chrono.CopticChronology copticChronology9 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone8);
        org.joda.time.DateTimeField dateTimeField10 = copticChronology9.hourOfDay();
        org.joda.time.DurationField durationField11 = copticChronology9.eras();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology9.weekyear();
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((long) (-292275054), (org.joda.time.Chronology) copticChronology9);
        org.joda.time.DateTimeZone dateTimeZone14 = copticChronology9.getZone();
        boolean boolean15 = dateTimeZone14.isFixed();
        java.lang.String str17 = dateTimeZone14.getName(10598050694229L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone14);
        org.joda.time.Chronology chronology19 = copticChronology1.withZone(dateTimeZone14);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField11", Math.signum(durationField3.compareTo(durationField11)) == -Math.signum(durationField11.compareTo(durationField3)));
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test674");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = copticChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology1.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology1.weekyear();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology1.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone9 = copticChronology1.getZone();
        java.lang.String str11 = dateTimeZone9.getNameKey(0L);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime(chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime13.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime13.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.DateTime dateTime21 = localDateTime19.toDateTime(readableInstant20);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime(chronology22);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime23.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime23.plusWeeks((int) (byte) 10);
        int int30 = localDateTime29.getMillisOfSecond();
        int int31 = localDateTime29.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime33 = localDateTime29.plusHours((int) (short) -1);
        org.joda.time.DurationFieldType durationFieldType34 = null;
        boolean boolean35 = localDateTime29.isSupported(durationFieldType34);
        org.joda.time.DateTime dateTime36 = localDateTime29.toDateTime();
        boolean boolean37 = dateTime21.isAfter((org.joda.time.ReadableInstant) dateTime36);
        org.joda.time.DateTimeZone dateTimeZone38 = dateTime36.getZone();
        org.joda.time.Instant instant39 = dateTime36.toInstant();
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.chrono.CopticChronology copticChronology41 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone40);
        org.joda.time.DateTimeField dateTimeField42 = copticChronology41.hourOfDay();
        org.joda.time.DurationField durationField43 = copticChronology41.eras();
        org.joda.time.DateTimeField dateTimeField44 = copticChronology41.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField45 = copticChronology41.monthOfYear();
        org.joda.time.DateTimeField dateTimeField46 = copticChronology41.yearOfCentury();
        boolean boolean47 = dateTime36.equals((java.lang.Object) dateTimeField46);
        int int48 = dateTimeZone9.getOffset((org.joda.time.ReadableInstant) dateTime36);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField43", Math.signum(durationField3.compareTo(durationField43)) == -Math.signum(durationField43.compareTo(durationField3)));
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test675");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology1.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.Chronology chronology5 = copticChronology1.withZone(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology1.secondOfDay();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology1.monthOfYear();
        org.joda.time.DurationField durationField9 = copticChronology1.days();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology1.halfdayOfDay();
        org.joda.time.DurationField durationField11 = copticChronology1.years();
        org.joda.time.DurationField durationField12 = copticChronology1.hours();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology1.clockhourOfDay();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime(chronology14);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime15.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.withMillisOfSecond((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime19.withMinuteOfHour(10);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime(chronology24);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime25.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime25.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime25.withYearOfCentury(0);
        org.joda.time.LocalDateTime.Property property32 = localDateTime31.weekyear();
        org.joda.time.LocalDateTime localDateTime34 = localDateTime31.plusYears((int) (short) 1);
        int int35 = localDateTime23.compareTo((org.joda.time.ReadablePartial) localDateTime34);
        org.joda.time.LocalDateTime localDateTime37 = localDateTime23.minusHours(51004001);
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.LocalDateTime localDateTime39 = new org.joda.time.LocalDateTime(chronology38);
        org.joda.time.LocalDateTime localDateTime41 = localDateTime39.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime43 = localDateTime39.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime45 = localDateTime39.withYearOfCentury(0);
        org.joda.time.LocalDateTime.Property property46 = localDateTime45.weekyear();
        org.joda.time.LocalDateTime localDateTime48 = property46.setCopy((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime50 = localDateTime48.minusDays(10);
        int int51 = localDateTime50.getCenturyOfEra();
        org.joda.time.LocalDateTime localDateTime53 = localDateTime50.plusMinutes(2000);
        int int54 = localDateTime37.compareTo((org.joda.time.ReadablePartial) localDateTime53);
        org.joda.time.ReadableDuration readableDuration55 = null;
        org.joda.time.LocalDateTime localDateTime57 = localDateTime37.withDurationAdded(readableDuration55, 1);
        org.joda.time.DateTimeZone dateTimeZone58 = null;
        org.joda.time.chrono.CopticChronology copticChronology59 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone58);
        org.joda.time.DateTimeField dateTimeField60 = copticChronology59.clockhourOfDay();
        org.joda.time.DurationField durationField61 = copticChronology59.weekyears();
        org.joda.time.DurationField durationField62 = copticChronology59.hours();
        int int63 = copticChronology59.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField64 = copticChronology59.monthOfYear();
        org.joda.time.DurationField durationField65 = copticChronology59.seconds();
        org.joda.time.DurationField durationField66 = copticChronology59.weeks();
        org.joda.time.Chronology chronology67 = null;
        org.joda.time.LocalDateTime localDateTime68 = new org.joda.time.LocalDateTime(chronology67);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray69 = localDateTime68.getFieldTypes();
        org.joda.time.LocalDateTime localDateTime71 = localDateTime68.plusMinutes(1);
        int[] intArray73 = copticChronology59.get((org.joda.time.ReadablePartial) localDateTime71, 0L);
        org.joda.time.DateTimeField dateTimeField74 = copticChronology59.centuryOfEra();
        org.joda.time.Chronology chronology75 = null;
        org.joda.time.LocalDateTime localDateTime76 = new org.joda.time.LocalDateTime(chronology75);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray77 = localDateTime76.getFieldTypes();
        org.joda.time.LocalDateTime localDateTime79 = localDateTime76.plusMinutes(1);
        int int80 = localDateTime76.getSecondOfMinute();
        org.joda.time.LocalDateTime.Property property81 = localDateTime76.millisOfDay();
        org.joda.time.LocalDateTime localDateTime82 = property81.withMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone83 = null;
        org.joda.time.chrono.CopticChronology copticChronology84 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone83);
        org.joda.time.DateTimeField dateTimeField85 = copticChronology84.clockhourOfDay();
        org.joda.time.DurationField durationField86 = copticChronology84.weekyears();
        org.joda.time.DateTimeField dateTimeField87 = copticChronology84.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone88 = null;
        org.joda.time.chrono.CopticChronology copticChronology89 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone88);
        org.joda.time.DateTimeField dateTimeField90 = copticChronology89.clockhourOfDay();
        java.util.Locale locale92 = java.util.Locale.ITALIAN;
        java.lang.String str93 = dateTimeField90.getAsText((long) 'a', locale92);
        int int94 = dateTimeField87.getMaximumTextLength(locale92);
        java.lang.String str95 = dateTimeField74.getAsShortText((org.joda.time.ReadablePartial) localDateTime82, locale92);
        java.lang.String str96 = locale92.getISO3Country();
        java.util.Set<java.lang.String> strSet97 = locale92.getUnicodeLocaleAttributes();
        java.lang.String str98 = dateTimeField13.getAsShortText((org.joda.time.ReadablePartial) localDateTime57, locale92);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField11 and durationField61", (durationField11.compareTo(durationField61) == 0) == durationField11.equals(durationField61));
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test676");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = copticChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology1.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology1.weekyear();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology1.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone9 = copticChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology1.weekOfWeekyear();
        org.joda.time.DurationField durationField11 = copticChronology1.years();
        org.joda.time.LocalDateTime localDateTime12 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) copticChronology1);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField11", (durationField3.compareTo(durationField11) == 0) == durationField3.equals(durationField11));
    }

    @Test
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test677");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = copticChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.chrono.CopticChronology copticChronology6 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone5);
        org.joda.time.DateTimeField dateTimeField7 = copticChronology6.clockhourOfDay();
        java.util.Locale locale9 = java.util.Locale.ITALIAN;
        java.lang.String str10 = dateTimeField7.getAsText((long) 'a', locale9);
        int int11 = dateTimeField4.getMaximumTextLength(locale9);
        int int13 = dateTimeField4.getMinimumValue((-3600001L));
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime(chronology14);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.weekOfWeekyear();
        org.joda.time.LocalDateTime.Property property19 = localDateTime17.centuryOfEra();
        java.lang.String str20 = localDateTime17.toString();
        java.util.Locale locale22 = java.util.Locale.ENGLISH;
        java.lang.String str23 = dateTimeField4.getAsShortText((org.joda.time.ReadablePartial) localDateTime17, (-292275054), locale22);
        org.joda.time.ReadableDuration readableDuration24 = null;
        org.joda.time.LocalDateTime localDateTime26 = localDateTime17.withDurationAdded(readableDuration24, 22);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.chrono.CopticChronology copticChronology28 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone27);
        org.joda.time.DateTimeField dateTimeField29 = copticChronology28.clockhourOfDay();
        org.joda.time.DurationField durationField30 = copticChronology28.weekyears();
        org.joda.time.DateTimeField dateTimeField31 = copticChronology28.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.chrono.CopticChronology copticChronology33 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone32);
        org.joda.time.DateTimeField dateTimeField34 = copticChronology33.clockhourOfDay();
        java.util.Locale locale36 = java.util.Locale.ITALIAN;
        java.lang.String str37 = dateTimeField34.getAsText((long) 'a', locale36);
        int int38 = dateTimeField31.getMaximumTextLength(locale36);
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = dateTimeField31.getType();
        boolean boolean40 = localDateTime26.isSupported(dateTimeFieldType39);
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.chrono.CopticChronology copticChronology42 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone41);
        org.joda.time.DateTimeField dateTimeField43 = copticChronology42.hourOfDay();
        org.joda.time.DateTimeField dateTimeField44 = copticChronology42.centuryOfEra();
        org.joda.time.DurationField durationField45 = copticChronology42.millis();
        org.joda.time.DateTimeField dateTimeField46 = copticChronology42.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField47 = copticChronology42.clockhourOfDay();
        org.joda.time.LocalDateTime localDateTime48 = new org.joda.time.LocalDateTime((org.joda.time.Chronology) copticChronology42);
        int int49 = localDateTime48.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.chrono.CopticChronology copticChronology51 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone50);
        org.joda.time.DateTimeField dateTimeField52 = copticChronology51.dayOfMonth();
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.LocalDateTime localDateTime54 = new org.joda.time.LocalDateTime(chronology53);
        org.joda.time.LocalDateTime localDateTime56 = localDateTime54.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime58 = localDateTime54.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime60 = localDateTime54.plusWeeks((int) (byte) 10);
        java.util.Locale locale61 = java.util.Locale.PRC;
        java.lang.String str62 = dateTimeField52.getAsText((org.joda.time.ReadablePartial) localDateTime60, locale61);
        org.joda.time.ReadablePeriod readablePeriod63 = null;
        org.joda.time.LocalDateTime localDateTime64 = localDateTime60.plus(readablePeriod63);
        org.joda.time.LocalDateTime localDateTime66 = localDateTime60.withCenturyOfEra(522);
        org.joda.time.LocalDateTime.Property property67 = localDateTime60.dayOfWeek();
        boolean boolean68 = localDateTime48.isEqual((org.joda.time.ReadablePartial) localDateTime60);
        org.joda.time.LocalDateTime.Property property69 = localDateTime48.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime70 = localDateTime26.withFields((org.joda.time.ReadablePartial) localDateTime48);
        org.joda.time.DateTimeZone dateTimeZone72 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.LocalDateTime localDateTime73 = new org.joda.time.LocalDateTime((long) 26, dateTimeZone72);
        org.joda.time.LocalDateTime localDateTime74 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime26, dateTimeZone72);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on localDateTime48 and localDateTime70", (localDateTime48.compareTo(localDateTime70) == 0) == localDateTime48.equals(localDateTime70));
    }

    @Test
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test678");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology1.centuryOfEra();
        org.joda.time.DurationField durationField4 = copticChronology1.millis();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology1.secondOfDay();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology1.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology1.era();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology1.weekOfWeekyear();
        org.joda.time.DurationField durationField10 = copticChronology1.centuries();
        org.joda.time.DurationField durationField11 = copticChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField11, durationField4, and durationField10", !(durationField11.compareTo(durationField4) == 0) || (Math.signum(durationField11.compareTo(durationField10)) == Math.signum(durationField4.compareTo(durationField10))));
    }

    @Test
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test679");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = copticChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology1.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology1.weekyear();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology1.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology1.centuryOfEra();
        org.joda.time.DurationField durationField10 = copticChronology1.years();
        org.joda.time.DurationField durationField11 = copticChronology1.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField10", (durationField3.compareTo(durationField10) == 0) == durationField3.equals(durationField10));
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test680");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology1.centuryOfEra();
        org.joda.time.DurationField durationField4 = copticChronology1.millis();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology1.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.clockhourOfDay();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((org.joda.time.Chronology) copticChronology1);
        org.joda.time.DateTimeField dateTimeField8 = copticChronology1.yearOfEra();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology1.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.chrono.CopticChronology copticChronology11 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone10);
        org.joda.time.DateTimeField dateTimeField12 = copticChronology11.hourOfDay();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology11.centuryOfEra();
        org.joda.time.DurationField durationField14 = copticChronology11.millis();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology11.weekOfWeekyear();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(chronology16);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime17.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime17.plusWeeks((int) (byte) 10);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime(chronology24);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime25.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime25.withMillisOfSecond((int) (byte) 1);
        int int30 = localDateTime17.compareTo((org.joda.time.ReadablePartial) localDateTime25);
        org.joda.time.LocalDateTime.Property property31 = localDateTime25.weekyear();
        org.joda.time.LocalDateTime localDateTime33 = localDateTime25.minusMillis(2022);
        int[] intArray35 = copticChronology11.get((org.joda.time.ReadablePartial) localDateTime25, (long) '#');
        long long37 = copticChronology1.set((org.joda.time.ReadablePartial) localDateTime25, (long) 166);
        org.joda.time.DurationField durationField38 = copticChronology1.years();
        org.joda.time.DateTimeField dateTimeField39 = copticChronology1.hourOfDay();
        long long42 = dateTimeField39.getDifferenceAsLong((long) 583, 951144889216L);
        int int45 = dateTimeField39.getDifference((long) 680, (long) 942);
        org.joda.time.DateTimeFieldType dateTimeFieldType46 = dateTimeField39.getType();
        org.joda.time.DateTimeZone dateTimeZone48 = null;
        org.joda.time.chrono.CopticChronology copticChronology49 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone48);
        org.joda.time.DateTimeField dateTimeField50 = copticChronology49.clockhourOfDay();
        org.joda.time.DurationField durationField51 = copticChronology49.weekyears();
        org.joda.time.DurationField durationField52 = copticChronology49.hours();
        org.joda.time.DateTimeField dateTimeField53 = copticChronology49.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField54 = copticChronology49.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime55 = new org.joda.time.LocalDateTime((-9676800000L), (org.joda.time.Chronology) copticChronology49);
        java.util.Locale locale56 = null;
        java.lang.String str57 = dateTimeField39.getAsText((org.joda.time.ReadablePartial) localDateTime55, locale56);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField38 and durationField51", (durationField38.compareTo(durationField51) == 0) == durationField38.equals(durationField51));
    }

    @Test
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test681");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology1.secondOfDay();
        org.joda.time.DurationField durationField4 = copticChronology1.years();
        org.joda.time.DurationField durationField5 = copticChronology1.weeks();
        org.joda.time.DateTimeZone dateTimeZone6 = copticChronology1.getZone();
        java.lang.String str8 = dateTimeZone6.getShortName(10598050549911L);
        boolean boolean9 = dateTimeZone6.isFixed();
        boolean boolean11 = dateTimeZone6.equals((java.lang.Object) 4287704582L);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime(chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime13.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime13.plusWeeks((int) (byte) 10);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime(chronology20);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime21.withMillisOfSecond((int) (byte) 1);
        int int26 = localDateTime13.compareTo((org.joda.time.ReadablePartial) localDateTime21);
        org.joda.time.LocalDateTime.Property property27 = localDateTime21.weekyear();
        org.joda.time.LocalDateTime.Property property28 = localDateTime21.weekyear();
        org.joda.time.LocalDateTime localDateTime29 = property28.getLocalDateTime();
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime(chronology30);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray32 = localDateTime31.getFieldTypes();
        org.joda.time.LocalDateTime localDateTime34 = localDateTime31.withMillisOfDay((int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime34.plusWeeks((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.chrono.CopticChronology copticChronology39 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone38);
        org.joda.time.DateTimeField dateTimeField40 = copticChronology39.hourOfDay();
        org.joda.time.DateTimeField dateTimeField41 = copticChronology39.secondOfDay();
        org.joda.time.DateTimeField dateTimeField42 = copticChronology39.secondOfDay();
        org.joda.time.LocalDateTime localDateTime43 = new org.joda.time.LocalDateTime((long) 10, (org.joda.time.Chronology) copticChronology39);
        int int44 = localDateTime43.getDayOfYear();
        boolean boolean45 = localDateTime36.isEqual((org.joda.time.ReadablePartial) localDateTime43);
        org.joda.time.LocalDateTime localDateTime47 = localDateTime43.withHourOfDay((int) (short) 1);
        int int48 = localDateTime47.getDayOfYear();
        java.util.TimeZone timeZone49 = null;
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.forTimeZone(timeZone49);
        java.lang.String str52 = dateTimeZone50.getNameKey((long) (byte) 0);
        org.joda.time.LocalDateTime localDateTime53 = new org.joda.time.LocalDateTime(dateTimeZone50);
        java.util.TimeZone timeZone54 = null;
        org.joda.time.DateTimeZone dateTimeZone55 = org.joda.time.DateTimeZone.forTimeZone(timeZone54);
        java.lang.String str57 = dateTimeZone55.getNameKey((long) (byte) 0);
        org.joda.time.LocalDateTime localDateTime58 = new org.joda.time.LocalDateTime(dateTimeZone55);
        boolean boolean59 = localDateTime53.isEqual((org.joda.time.ReadablePartial) localDateTime58);
        org.joda.time.LocalDateTime localDateTime61 = localDateTime58.plusWeeks(0);
        org.joda.time.LocalDateTime localDateTime63 = localDateTime58.withDayOfMonth(26);
        org.joda.time.DateTimeZone dateTimeZone64 = null;
        org.joda.time.chrono.CopticChronology copticChronology65 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone64);
        org.joda.time.DateTimeField dateTimeField66 = copticChronology65.hourOfDay();
        org.joda.time.DateTimeField dateTimeField67 = copticChronology65.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone68 = null;
        org.joda.time.Chronology chronology69 = copticChronology65.withZone(dateTimeZone68);
        org.joda.time.DateTimeField dateTimeField70 = copticChronology65.millisOfSecond();
        org.joda.time.Chronology chronology71 = null;
        org.joda.time.LocalDateTime localDateTime72 = new org.joda.time.LocalDateTime(chronology71);
        org.joda.time.LocalDateTime localDateTime74 = localDateTime72.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime76 = localDateTime72.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime78 = localDateTime72.withYearOfCentury(0);
        org.joda.time.LocalDateTime.Property property79 = localDateTime78.weekyear();
        org.joda.time.LocalDateTime localDateTime81 = property79.setCopy((int) (byte) 1);
        org.joda.time.DurationField durationField82 = property79.getLeapDurationField();
        org.joda.time.LocalDateTime localDateTime83 = property79.getLocalDateTime();
        org.joda.time.LocalDateTime.Property property84 = localDateTime83.weekOfWeekyear();
        int int85 = dateTimeField70.getMaximumValue((org.joda.time.ReadablePartial) localDateTime83);
        org.joda.time.DateTimeFieldType dateTimeFieldType86 = dateTimeField70.getType();
        int int87 = localDateTime58.get(dateTimeFieldType86);
        int int88 = localDateTime47.get(dateTimeFieldType86);
        org.joda.time.LocalDateTime.Property property89 = localDateTime29.property(dateTimeFieldType86);
        org.joda.time.LocalDateTime.Property property90 = localDateTime29.yearOfEra();
        boolean boolean91 = dateTimeZone6.equals((java.lang.Object) localDateTime29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField82", (durationField5.compareTo(durationField82) == 0) == durationField5.equals(durationField82));
    }

    @Test
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test682");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology1.weekyearOfCentury();
        org.joda.time.DurationField durationField4 = copticChronology1.years();
        org.joda.time.DurationField durationField5 = copticChronology1.weekyears();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = copticChronology1.add(readablePeriod6, 4287228172L, 176542555);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField5", (durationField4.compareTo(durationField5) == 0) == durationField4.equals(durationField5));
    }

    @Test
    public void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test683");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = copticChronology1.weekyears();
        org.joda.time.DurationField durationField4 = copticChronology1.hours();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology1.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.weekyearOfCentury();
        long long10 = copticChronology1.add((long) (byte) 100, (long) 30, 113);
        org.joda.time.DurationField durationField11 = copticChronology1.weekyears();
        org.joda.time.DurationField durationField12 = copticChronology1.days();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology1.minuteOfHour();
        org.joda.time.DurationField durationField14 = copticChronology1.months();
        org.joda.time.DurationField durationField15 = copticChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField15, durationField3, and durationField4", !(durationField15.compareTo(durationField3) == 0) || (Math.signum(durationField15.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test684");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = copticChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = copticChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.yearOfEra();
        org.joda.time.DurationField durationField7 = copticChronology1.minutes();
        org.joda.time.DurationField durationField8 = copticChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField8, durationField3, and durationField7", !(durationField8.compareTo(durationField3) == 0) || (Math.signum(durationField8.compareTo(durationField7)) == Math.signum(durationField3.compareTo(durationField7))));
    }

    @Test
    public void test685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test685");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology1.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.Chronology chronology5 = copticChronology1.withZone(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology1.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology1.year();
        org.joda.time.DurationField durationField9 = copticChronology1.years();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology1.minuteOfHour();
        org.joda.time.DurationField durationField11 = copticChronology1.days();
        org.joda.time.DurationField durationField12 = copticChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology1.centuryOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField9 and durationField12", (durationField9.compareTo(durationField12) == 0) == durationField9.equals(durationField12));
    }

    @Test
    public void test686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test686");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = copticChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology1.halfdayOfDay();
        org.joda.time.DurationField durationField5 = copticChronology1.millis();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.chrono.CopticChronology copticChronology8 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone7);
        org.joda.time.DateTimeField dateTimeField9 = copticChronology8.hourOfDay();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology8.weekyearOfCentury();
        org.joda.time.DurationField durationField11 = copticChronology8.years();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology8.secondOfDay();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology8.dayOfMonth();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime(chronology14);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.minusSeconds((int) (short) -1);
        int int18 = localDateTime15.getMillisOfSecond();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime(chronology19);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime20.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime20.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime20.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.DateTime dateTime28 = localDateTime26.toDateTime(readableInstant27);
        long long29 = dateTime28.getMillis();
        java.util.TimeZone timeZone30 = null;
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forTimeZone(timeZone30);
        java.lang.String str33 = dateTimeZone31.getNameKey((long) (byte) 0);
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime(dateTimeZone31);
        java.util.TimeZone timeZone35 = null;
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forTimeZone(timeZone35);
        java.lang.String str38 = dateTimeZone36.getNameKey((long) (byte) 0);
        org.joda.time.LocalDateTime localDateTime39 = new org.joda.time.LocalDateTime(dateTimeZone36);
        boolean boolean40 = localDateTime34.isEqual((org.joda.time.ReadablePartial) localDateTime39);
        org.joda.time.LocalDateTime localDateTime42 = localDateTime39.plusWeeks(0);
        org.joda.time.LocalDateTime localDateTime44 = localDateTime39.withDayOfMonth(26);
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.chrono.CopticChronology copticChronology46 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone45);
        org.joda.time.DateTimeField dateTimeField47 = copticChronology46.hourOfDay();
        org.joda.time.DateTimeField dateTimeField48 = copticChronology46.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.Chronology chronology50 = copticChronology46.withZone(dateTimeZone49);
        org.joda.time.DateTimeField dateTimeField51 = copticChronology46.millisOfSecond();
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.LocalDateTime localDateTime53 = new org.joda.time.LocalDateTime(chronology52);
        org.joda.time.LocalDateTime localDateTime55 = localDateTime53.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime57 = localDateTime53.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime59 = localDateTime53.withYearOfCentury(0);
        org.joda.time.LocalDateTime.Property property60 = localDateTime59.weekyear();
        org.joda.time.LocalDateTime localDateTime62 = property60.setCopy((int) (byte) 1);
        org.joda.time.DurationField durationField63 = property60.getLeapDurationField();
        org.joda.time.LocalDateTime localDateTime64 = property60.getLocalDateTime();
        org.joda.time.LocalDateTime.Property property65 = localDateTime64.weekOfWeekyear();
        int int66 = dateTimeField51.getMaximumValue((org.joda.time.ReadablePartial) localDateTime64);
        org.joda.time.DateTimeFieldType dateTimeFieldType67 = dateTimeField51.getType();
        int int68 = localDateTime39.get(dateTimeFieldType67);
        boolean boolean69 = dateTime28.isSupported(dateTimeFieldType67);
        int int70 = localDateTime15.indexOf(dateTimeFieldType67);
        org.joda.time.LocalDateTime.Property property71 = localDateTime15.weekOfWeekyear();
        int int72 = localDateTime15.getYearOfCentury();
        int int73 = localDateTime15.getHourOfDay();
        java.util.Locale locale77 = new java.util.Locale("2022-02-21T14:56:44.811", "2022-02-14T14:55:12.427", "2022-02-14T14:55:23.646");
        java.lang.String str78 = dateTimeField13.getAsText((org.joda.time.ReadablePartial) localDateTime15, locale77);
        int int79 = dateTimeField6.getMaximumValue((org.joda.time.ReadablePartial) localDateTime15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField11", (durationField3.compareTo(durationField11) == 0) == durationField3.equals(durationField11));
    }

    @Test
    public void test687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test687");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = copticChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = copticChronology1.getZone();
        org.joda.time.LocalDateTime localDateTime6 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) copticChronology1);
        org.joda.time.DateTimeField dateTimeField7 = copticChronology1.halfdayOfDay();
        org.joda.time.DurationField durationField8 = copticChronology1.months();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology1.millisOfSecond();
        org.joda.time.DurationField durationField10 = copticChronology1.years();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology1.weekyearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField10", (durationField3.compareTo(durationField10) == 0) == durationField3.equals(durationField10));
    }

    @Test
    public void test688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test688");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.hourOfDay();
        org.joda.time.DurationField durationField3 = copticChronology1.eras();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology1.weekyear();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology1.era();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime7.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime7.plusWeeks((int) (byte) 10);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime(chronology14);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime15.withMillisOfSecond((int) (byte) 1);
        int int20 = localDateTime7.compareTo((org.joda.time.ReadablePartial) localDateTime15);
        org.joda.time.LocalDateTime.Property property21 = localDateTime15.weekyear();
        int int22 = property21.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime23 = property21.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime24 = property21.roundHalfEvenCopy();
        long long26 = copticChronology1.set((org.joda.time.ReadablePartial) localDateTime24, 296L);
        org.joda.time.DateTimeField dateTimeField27 = copticChronology1.era();
        org.joda.time.DateTimeField dateTimeField28 = copticChronology1.monthOfYear();
        org.joda.time.DateTimeField dateTimeField29 = copticChronology1.dayOfYear();
        org.joda.time.DurationField durationField30 = copticChronology1.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField3, durationField30, and durationField3", !(durationField3.compareTo(durationField30) == 0) || (Math.signum(durationField3.compareTo(durationField3)) == Math.signum(durationField30.compareTo(durationField3))));
    }

    @Test
    public void test689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test689");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology1.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone4 = copticChronology1.getZone();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.chrono.CopticChronology copticChronology6 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone5);
        org.joda.time.DateTimeField dateTimeField7 = copticChronology6.hourOfDay();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology6.dayOfMonth();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime(chronology9);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime10.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime10.withYearOfCentury(0);
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.weekyear();
        org.joda.time.LocalDateTime localDateTime19 = property17.setCopy((int) (byte) 1);
        long long20 = property17.remainder();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime(chronology21);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime22.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime22.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime22.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.DateTime dateTime30 = localDateTime28.toDateTime(readableInstant29);
        org.joda.time.LocalDateTime.Property property31 = localDateTime28.millisOfDay();
        int int32 = property17.compareTo((org.joda.time.ReadablePartial) localDateTime28);
        int int33 = dateTimeField8.getMaximumValue((org.joda.time.ReadablePartial) localDateTime28);
        org.joda.time.LocalDateTime localDateTime35 = localDateTime28.plusMonths((int) (byte) 10);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime(chronology36);
        org.joda.time.LocalDateTime localDateTime39 = localDateTime37.minusSeconds((int) (short) -1);
        int[] intArray40 = localDateTime39.getValues();
        copticChronology1.validate((org.joda.time.ReadablePartial) localDateTime35, intArray40);
        org.joda.time.DurationField durationField42 = copticChronology1.weeks();
        org.joda.time.DurationField durationField43 = copticChronology1.minutes();
        org.joda.time.DateTimeField dateTimeField44 = copticChronology1.secondOfMinute();
        org.joda.time.DurationField durationField45 = copticChronology1.millis();
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.chrono.CopticChronology copticChronology47 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone46);
        org.joda.time.DateTimeField dateTimeField48 = copticChronology47.dayOfMonth();
        org.joda.time.DurationField durationField49 = copticChronology47.months();
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.Chronology chronology51 = copticChronology47.withZone(dateTimeZone50);
        org.joda.time.DateTimeZone dateTimeZone52 = copticChronology47.getZone();
        org.joda.time.DateTimeZone dateTimeZone53 = null;
        org.joda.time.chrono.CopticChronology copticChronology54 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone53);
        org.joda.time.DateTimeField dateTimeField55 = copticChronology54.clockhourOfDay();
        org.joda.time.DurationField durationField56 = copticChronology54.weekyears();
        org.joda.time.DurationField durationField57 = copticChronology54.hours();
        org.joda.time.DateTimeField dateTimeField58 = copticChronology54.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone59 = copticChronology54.getZone();
        org.joda.time.DateTimeZone dateTimeZone60 = copticChronology54.getZone();
        org.joda.time.DateTimeField dateTimeField61 = copticChronology54.weekOfWeekyear();
        org.joda.time.Chronology chronology62 = null;
        org.joda.time.LocalDateTime localDateTime63 = new org.joda.time.LocalDateTime(chronology62);
        org.joda.time.LocalDateTime localDateTime65 = localDateTime63.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime67 = localDateTime63.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime69 = localDateTime63.withYearOfCentury(0);
        org.joda.time.LocalDateTime.Property property70 = localDateTime69.weekyear();
        org.joda.time.LocalDateTime localDateTime72 = property70.setCopy((int) (byte) 1);
        org.joda.time.DurationField durationField73 = property70.getLeapDurationField();
        org.joda.time.LocalDateTime localDateTime74 = property70.getLocalDateTime();
        org.joda.time.LocalDateTime localDateTime76 = localDateTime74.plusWeeks(522);
        int[] intArray78 = copticChronology54.get((org.joda.time.ReadablePartial) localDateTime76, (long) 632);
        int int79 = localDateTime76.getCenturyOfEra();
        org.joda.time.LocalDateTime.Property property80 = localDateTime76.yearOfCentury();
        int[] intArray82 = copticChronology47.get((org.joda.time.ReadablePartial) localDateTime76, (long) 51003001);
        int[] intArray84 = copticChronology1.get((org.joda.time.ReadablePartial) localDateTime76, 4287729724L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField42 and durationField73", (durationField42.compareTo(durationField73) == 0) == durationField42.equals(durationField73));
    }

    @Test
    public void test690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test690");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.hourOfDay();
        org.joda.time.DurationField durationField3 = copticChronology1.eras();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology1.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology1.monthOfYear();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.yearOfCentury();
        long long9 = dateTimeField6.add((long) 30, 5);
        int int10 = dateTimeField6.getMaximumValue();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.chrono.CopticChronology copticChronology13 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone12);
        org.joda.time.DateTimeField dateTimeField14 = copticChronology13.hourOfDay();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology13.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.Chronology chronology17 = copticChronology13.withZone(dateTimeZone16);
        org.joda.time.DateTimeField dateTimeField18 = copticChronology13.millisOfSecond();
        org.joda.time.DurationField durationField19 = copticChronology13.hours();
        org.joda.time.DateTimeField dateTimeField20 = copticChronology13.halfdayOfDay();
        org.joda.time.DurationField durationField21 = copticChronology13.minutes();
        org.joda.time.DurationField durationField22 = copticChronology13.months();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.chrono.CopticChronology copticChronology24 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField25 = copticChronology24.clockhourOfDay();
        org.joda.time.DurationField durationField26 = copticChronology24.weekyears();
        org.joda.time.DateTimeField dateTimeField27 = copticChronology24.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField28 = copticChronology24.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField29 = copticChronology24.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField30 = copticChronology24.weekyear();
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime((long) 53, dateTimeZone33);
        org.joda.time.Chronology chronology35 = copticChronology24.withZone(dateTimeZone33);
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forOffsetMillis(633);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone37);
        long long40 = dateTimeZone33.getMillisKeepLocal(dateTimeZone37, 10598050430264L);
        org.joda.time.Chronology chronology41 = copticChronology13.withZone(dateTimeZone37);
        long long43 = dateTimeZone37.convertUTCToLocal(0L);
        java.lang.String str45 = dateTimeZone37.getShortName((-31449599999L));
        org.joda.time.tz.NameProvider nameProvider47 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.chrono.CopticChronology copticChronology50 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone49);
        org.joda.time.DateTimeField dateTimeField51 = copticChronology50.clockhourOfDay();
        org.joda.time.DurationField durationField52 = copticChronology50.weekyears();
        org.joda.time.DateTimeField dateTimeField53 = copticChronology50.clockhourOfDay();
        org.joda.time.DurationField durationField54 = copticChronology50.hours();
        org.joda.time.DateTimeZone dateTimeZone55 = copticChronology50.getZone();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone55);
        org.joda.time.LocalDateTime localDateTime57 = new org.joda.time.LocalDateTime(49L, dateTimeZone55);
        org.joda.time.LocalDateTime localDateTime58 = org.joda.time.LocalDateTime.now(dateTimeZone55);
        java.util.Locale.Builder builder59 = new java.util.Locale.Builder();
        org.joda.time.DateTimeZone dateTimeZone60 = null;
        org.joda.time.chrono.CopticChronology copticChronology61 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone60);
        org.joda.time.DateTimeField dateTimeField62 = copticChronology61.hourOfDay();
        org.joda.time.DateTimeField dateTimeField63 = copticChronology61.weekyearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone65 = null;
        org.joda.time.chrono.CopticChronology copticChronology66 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone65);
        org.joda.time.DateTimeField dateTimeField67 = copticChronology66.clockhourOfDay();
        java.util.Locale locale69 = java.util.Locale.ITALIAN;
        java.lang.String str70 = dateTimeField67.getAsText((long) 'a', locale69);
        java.lang.String str71 = dateTimeField63.getAsText((int) 'a', locale69);
        org.joda.time.DateTimeZone dateTimeZone72 = null;
        org.joda.time.chrono.CopticChronology copticChronology73 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone72);
        org.joda.time.DateTimeField dateTimeField74 = copticChronology73.clockhourOfDay();
        org.joda.time.DurationField durationField75 = copticChronology73.weekyears();
        org.joda.time.DateTimeField dateTimeField76 = copticChronology73.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone77 = null;
        org.joda.time.chrono.CopticChronology copticChronology78 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone77);
        org.joda.time.DateTimeField dateTimeField79 = copticChronology78.clockhourOfDay();
        java.util.Locale locale81 = java.util.Locale.ITALIAN;
        java.lang.String str82 = dateTimeField79.getAsText((long) 'a', locale81);
        int int83 = dateTimeField76.getMaximumTextLength(locale81);
        java.lang.String str84 = locale69.getDisplayCountry(locale81);
        java.util.Locale.Builder builder85 = builder59.setLocale(locale81);
        boolean boolean86 = localDateTime58.equals((java.lang.Object) locale81);
        java.lang.String str89 = nameProvider47.getName(locale81, "hi!", "CopticChronology[+00:00:00.633]");
        java.lang.String str90 = dateTimeZone37.getName((long) 510, locale81);
        java.util.Set<java.lang.String> strSet91 = locale81.getUnicodeLocaleKeys();
        java.lang.String str92 = dateTimeField6.getAsShortText(10508480482L, locale81);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField19", Math.signum(durationField3.compareTo(durationField19)) == -Math.signum(durationField19.compareTo(durationField3)));
    }

    @Test
    public void test691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test691");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology1.secondOfDay();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology1.secondOfDay();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology1.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.monthOfYear();
        org.joda.time.DurationField durationField7 = copticChronology1.days();
        org.joda.time.DurationField durationField8 = copticChronology1.years();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField10 = copticChronology1.weekyears();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.chrono.CopticChronology copticChronology14 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone13);
        org.joda.time.DateTimeField dateTimeField15 = copticChronology14.clockhourOfDay();
        org.joda.time.DurationField durationField16 = copticChronology14.weekyears();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology14.clockhourOfDay();
        org.joda.time.DurationField durationField18 = copticChronology14.hours();
        org.joda.time.DateTimeZone dateTimeZone19 = copticChronology14.getZone();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone19);
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime(49L, dateTimeZone19);
        int int23 = dateTimeZone19.getOffset((long) 833);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone19);
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime(4457405001L, dateTimeZone19);
        int int27 = dateTimeZone19.getStandardOffset(3600000L);
        org.joda.time.LocalDateTime localDateTime28 = org.joda.time.LocalDateTime.now(dateTimeZone19);
        long long30 = copticChronology1.set((org.joda.time.ReadablePartial) localDateTime28, (long) 44779745);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField8 and durationField10", (durationField8.compareTo(durationField10) == 0) == durationField8.equals(durationField10));
    }

    @Test
    public void test692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test692");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = copticChronology1.weekyears();
        org.joda.time.DurationField durationField4 = copticChronology1.hours();
        java.lang.String str5 = copticChronology1.toString();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology1.minuteOfHour();
        org.joda.time.DurationField durationField8 = copticChronology1.months();
        org.joda.time.DurationField durationField9 = copticChronology1.years();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology1.clockhourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField9", (durationField3.compareTo(durationField9) == 0) == durationField3.equals(durationField9));
    }

    @Test
    public void test693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test693");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.CopticChronology copticChronology2 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology2.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology2.secondOfDay();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology2.secondOfDay();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) 10, (org.joda.time.Chronology) copticChronology2);
        org.joda.time.DurationField durationField7 = copticChronology2.eras();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology2.millisOfSecond();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime(chronology9);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime10.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime10.plusWeeks((int) (byte) 10);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime(chronology17);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime18.withMillisOfSecond((int) (byte) 1);
        int int23 = localDateTime10.compareTo((org.joda.time.ReadablePartial) localDateTime18);
        int int24 = localDateTime10.getMinuteOfHour();
        org.joda.time.LocalDateTime localDateTime26 = localDateTime10.withWeekyear(649);
        java.util.TimeZone timeZone27 = null;
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forTimeZone(timeZone27);
        java.lang.String str30 = dateTimeZone28.getNameKey((long) (byte) 0);
        boolean boolean31 = dateTimeZone28.isFixed();
        java.lang.String str33 = dateTimeZone28.getShortName(3430L);
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 0);
        long long37 = dateTimeZone28.getMillisKeepLocal(dateTimeZone35, 82800001L);
        org.joda.time.DateTime dateTime38 = localDateTime26.toDateTime(dateTimeZone35);
        org.joda.time.Chronology chronology39 = copticChronology2.withZone(dateTimeZone35);
        org.joda.time.DurationField durationField40 = copticChronology2.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField7, durationField40, and durationField7", !(durationField7.compareTo(durationField40) == 0) || (Math.signum(durationField7.compareTo(durationField7)) == Math.signum(durationField40.compareTo(durationField7))));
    }

    @Test
    public void test694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test694");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology1.centuryOfEra();
        org.joda.time.DurationField durationField4 = copticChronology1.millis();
        org.joda.time.DurationField durationField5 = copticChronology1.years();
        org.joda.time.DurationField durationField6 = copticChronology1.millis();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology1.year();
        org.joda.time.DurationField durationField8 = copticChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology1.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology1.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.chrono.CopticChronology copticChronology12 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone11);
        org.joda.time.DateTimeField dateTimeField13 = copticChronology12.hourOfDay();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology12.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.Chronology chronology16 = copticChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField17 = copticChronology12.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField18 = copticChronology12.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone19 = copticChronology12.getZone();
        org.joda.time.DateTimeField dateTimeField20 = copticChronology12.dayOfWeek();
        org.joda.time.DurationField durationField21 = copticChronology12.weekyears();
        org.joda.time.DurationField durationField22 = copticChronology12.days();
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime((org.joda.time.Chronology) copticChronology12);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.chrono.CopticChronology copticChronology25 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone24);
        org.joda.time.DateTimeField dateTimeField26 = copticChronology25.clockhourOfDay();
        org.joda.time.DurationField durationField27 = copticChronology25.weekyears();
        org.joda.time.DateTimeField dateTimeField28 = copticChronology25.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.chrono.CopticChronology copticChronology30 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone29);
        org.joda.time.DateTimeField dateTimeField31 = copticChronology30.clockhourOfDay();
        java.util.Locale locale33 = java.util.Locale.ITALIAN;
        java.lang.String str34 = dateTimeField31.getAsText((long) 'a', locale33);
        int int35 = dateTimeField28.getMaximumTextLength(locale33);
        int int37 = dateTimeField28.getMinimumValue((-3600001L));
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.LocalDateTime localDateTime39 = new org.joda.time.LocalDateTime(chronology38);
        org.joda.time.LocalDateTime localDateTime41 = localDateTime39.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime.Property property42 = localDateTime41.weekOfWeekyear();
        org.joda.time.LocalDateTime.Property property43 = localDateTime41.centuryOfEra();
        java.lang.String str44 = localDateTime41.toString();
        java.util.Locale locale46 = java.util.Locale.ENGLISH;
        java.lang.String str47 = dateTimeField28.getAsShortText((org.joda.time.ReadablePartial) localDateTime41, (-292275054), locale46);
        org.joda.time.ReadableDuration readableDuration48 = null;
        org.joda.time.LocalDateTime localDateTime50 = localDateTime41.withDurationAdded(readableDuration48, 22);
        java.util.Date date51 = localDateTime41.toDate();
        org.joda.time.LocalDateTime localDateTime52 = org.joda.time.LocalDateTime.fromDateFields(date51);
        org.joda.time.DateTimeField[] dateTimeFieldArray53 = localDateTime52.getFields();
        int[] intArray54 = localDateTime52.getValues();
        copticChronology1.validate((org.joda.time.ReadablePartial) localDateTime23, intArray54);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField21", (durationField5.compareTo(durationField21) == 0) == durationField5.equals(durationField21));
    }

    @Test
    public void test695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test695");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.DateTime dateTime9 = localDateTime7.toDateTime(readableInstant8);
        org.joda.time.LocalDateTime.Property property10 = localDateTime7.millisOfDay();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime7.plusMonths(999);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(chronology13);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime14.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime14.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.DateTime dateTime22 = localDateTime20.toDateTime(readableInstant21);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime(chronology23);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime24.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime24.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime24.plusWeeks((int) (byte) 10);
        int int31 = localDateTime30.getMillisOfSecond();
        int int32 = localDateTime30.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime34 = localDateTime30.plusHours((int) (short) -1);
        org.joda.time.DurationFieldType durationFieldType35 = null;
        boolean boolean36 = localDateTime30.isSupported(durationFieldType35);
        org.joda.time.DateTime dateTime37 = localDateTime30.toDateTime();
        boolean boolean38 = dateTime22.isAfter((org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.DateTimeZone dateTimeZone39 = dateTime37.getZone();
        org.joda.time.DateTime dateTime40 = localDateTime7.toDateTime((org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.Instant instant41 = dateTime37.toInstant();
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.chrono.CopticChronology copticChronology43 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone42);
        org.joda.time.DateTimeField dateTimeField44 = copticChronology43.clockhourOfDay();
        org.joda.time.DurationField durationField45 = copticChronology43.weekyears();
        org.joda.time.DateTimeField dateTimeField46 = copticChronology43.clockhourOfDay();
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.LocalDateTime localDateTime48 = new org.joda.time.LocalDateTime(chronology47);
        org.joda.time.LocalDateTime localDateTime50 = localDateTime48.plusWeeks((int) (byte) -1);
        java.util.Locale locale52 = java.util.Locale.GERMANY;
        java.lang.String str53 = locale52.getScript();
        org.joda.time.DateTimeZone dateTimeZone54 = null;
        org.joda.time.chrono.CopticChronology copticChronology55 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone54);
        org.joda.time.DateTimeField dateTimeField56 = copticChronology55.clockhourOfDay();
        java.util.Locale locale58 = java.util.Locale.ITALIAN;
        java.lang.String str59 = dateTimeField56.getAsText((long) 'a', locale58);
        java.lang.String str60 = locale52.getDisplayName(locale58);
        java.lang.String str61 = dateTimeField46.getAsShortText((org.joda.time.ReadablePartial) localDateTime50, (int) ' ', locale58);
        org.joda.time.LocalDateTime.Property property62 = localDateTime50.year();
        java.lang.String str63 = property62.getName();
        org.joda.time.DateTimeFieldType dateTimeFieldType64 = property62.getFieldType();
        boolean boolean65 = dateTime37.isSupported(dateTimeFieldType64);
        org.joda.time.Instant instant66 = dateTime37.toInstant();
        org.joda.time.Instant instant67 = dateTime37.toInstant();
        org.joda.time.Instant instant68 = dateTime37.toInstant();
        org.joda.time.Chronology chronology69 = instant68.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime37 and instant41", (dateTime37.compareTo(instant41) == 0) == dateTime37.equals(instant41));
    }

    @Test
    public void test696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test696");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.weekOfWeekyear();
        org.joda.time.LocalDateTime.Property property5 = localDateTime3.centuryOfEra();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime7.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime7.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.DateTime dateTime15 = localDateTime13.toDateTime(readableInstant14);
        java.util.Locale locale16 = java.util.Locale.GERMANY;
        boolean boolean17 = locale16.hasExtensions();
        boolean boolean18 = dateTime15.equals((java.lang.Object) locale16);
        int int19 = property5.getDifference((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime(chronology20);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime21.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime21.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.DateTime dateTime29 = localDateTime27.toDateTime(readableInstant28);
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = null;
        boolean boolean31 = dateTime29.isSupported(dateTimeFieldType30);
        long long32 = dateTime29.getMillis();
        org.joda.time.Chronology chronology33 = dateTime29.getChronology();
        boolean boolean34 = dateTime15.isAfter((org.joda.time.ReadableInstant) dateTime29);
        org.joda.time.Instant instant35 = dateTime15.toInstant();
        org.joda.time.Instant instant36 = instant35.toInstant();
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.LocalDateTime localDateTime38 = new org.joda.time.LocalDateTime(chronology37);
        org.joda.time.LocalDateTime localDateTime40 = localDateTime38.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime42 = localDateTime38.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime44 = localDateTime38.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.DateTime dateTime46 = localDateTime44.toDateTime(readableInstant45);
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.LocalDateTime localDateTime48 = new org.joda.time.LocalDateTime(chronology47);
        org.joda.time.LocalDateTime localDateTime50 = localDateTime48.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime52 = localDateTime48.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime54 = localDateTime48.plusWeeks((int) (byte) 10);
        int int55 = localDateTime54.getMillisOfSecond();
        int int56 = localDateTime54.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime58 = localDateTime54.plusHours((int) (short) -1);
        org.joda.time.DurationFieldType durationFieldType59 = null;
        boolean boolean60 = localDateTime54.isSupported(durationFieldType59);
        org.joda.time.DateTime dateTime61 = localDateTime54.toDateTime();
        boolean boolean62 = dateTime46.isAfter((org.joda.time.ReadableInstant) dateTime61);
        java.lang.String str63 = dateTime46.toString();
        int int64 = instant36.compareTo((org.joda.time.ReadableInstant) dateTime46);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime15 and instant36", (dateTime15.compareTo(instant36) == 0) == dateTime15.equals(instant36));
    }

    @Test
    public void test697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test697");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.weekOfWeekyear();
        org.joda.time.LocalDateTime.Property property5 = localDateTime3.centuryOfEra();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime7.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime7.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.DateTime dateTime15 = localDateTime13.toDateTime(readableInstant14);
        java.util.Locale locale16 = java.util.Locale.GERMANY;
        boolean boolean17 = locale16.hasExtensions();
        boolean boolean18 = dateTime15.equals((java.lang.Object) locale16);
        int int19 = property5.getDifference((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime(chronology20);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime21.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime21.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.DateTime dateTime29 = localDateTime27.toDateTime(readableInstant28);
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = null;
        boolean boolean31 = dateTime29.isSupported(dateTimeFieldType30);
        long long32 = dateTime29.getMillis();
        org.joda.time.Chronology chronology33 = dateTime29.getChronology();
        boolean boolean34 = dateTime15.isAfter((org.joda.time.ReadableInstant) dateTime29);
        org.joda.time.Instant instant35 = dateTime15.toInstant();
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.chrono.CopticChronology copticChronology37 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone36);
        org.joda.time.DateTimeField dateTimeField38 = copticChronology37.clockhourOfDay();
        org.joda.time.DurationField durationField39 = copticChronology37.weekyears();
        org.joda.time.DateTimeField dateTimeField40 = copticChronology37.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.chrono.CopticChronology copticChronology42 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone41);
        org.joda.time.DateTimeField dateTimeField43 = copticChronology42.clockhourOfDay();
        java.util.Locale locale45 = java.util.Locale.ITALIAN;
        java.lang.String str46 = dateTimeField43.getAsText((long) 'a', locale45);
        int int47 = dateTimeField40.getMaximumTextLength(locale45);
        int int49 = dateTimeField40.getMinimumValue((-3600001L));
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.LocalDateTime localDateTime51 = new org.joda.time.LocalDateTime(chronology50);
        org.joda.time.LocalDateTime localDateTime53 = localDateTime51.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime.Property property54 = localDateTime53.weekOfWeekyear();
        org.joda.time.LocalDateTime.Property property55 = localDateTime53.centuryOfEra();
        java.lang.String str56 = localDateTime53.toString();
        java.util.Locale locale58 = java.util.Locale.ENGLISH;
        java.lang.String str59 = dateTimeField40.getAsShortText((org.joda.time.ReadablePartial) localDateTime53, (-292275054), locale58);
        org.joda.time.LocalDateTime.Property property60 = localDateTime53.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime62 = localDateTime53.withMillisOfSecond(999);
        org.joda.time.LocalDateTime localDateTime64 = localDateTime53.minusHours(44);
        org.joda.time.DateTimeZone dateTimeZone65 = null;
        org.joda.time.chrono.CopticChronology copticChronology66 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone65);
        org.joda.time.DateTimeField dateTimeField67 = copticChronology66.hourOfDay();
        org.joda.time.DateTimeField dateTimeField68 = copticChronology66.centuryOfEra();
        org.joda.time.DurationField durationField69 = copticChronology66.millis();
        org.joda.time.DateTimeField dateTimeField70 = copticChronology66.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField71 = copticChronology66.clockhourOfDay();
        org.joda.time.LocalDateTime localDateTime72 = new org.joda.time.LocalDateTime((org.joda.time.Chronology) copticChronology66);
        org.joda.time.LocalDateTime.Property property73 = localDateTime72.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType74 = property73.getFieldType();
        org.joda.time.LocalDateTime.Property property75 = localDateTime64.property(dateTimeFieldType74);
        int int76 = dateTime15.get(dateTimeFieldType74);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime29 and instant35", (dateTime29.compareTo(instant35) == 0) == dateTime29.equals(instant35));
    }

    @Test
    public void test698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test698");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.dayOfMonth();
        org.joda.time.DurationField durationField3 = copticChronology1.eras();
        java.lang.String str4 = copticChronology1.toString();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology1.millisOfDay();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.weekyear();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology1.dayOfMonth();
        org.joda.time.DurationField durationField8 = copticChronology1.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField3, durationField8, and durationField3", !(durationField3.compareTo(durationField8) == 0) || (Math.signum(durationField3.compareTo(durationField3)) == Math.signum(durationField8.compareTo(durationField3))));
    }

    @Test
    public void test699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test699");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = copticChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = copticChronology1.getZone();
        org.joda.time.DurationField durationField6 = copticChronology1.eras();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology1.yearOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField6", Math.signum(durationField3.compareTo(durationField6)) == -Math.signum(durationField6.compareTo(durationField3)));
    }

    @Test
    public void test700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test700");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = copticChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology1.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology1.weekyear();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((long) 53, dateTimeZone10);
        org.joda.time.Chronology chronology12 = copticChronology1.withZone(dateTimeZone10);
        org.joda.time.DateTimeField dateTimeField13 = copticChronology1.millisOfSecond();
        org.joda.time.DurationField durationField14 = copticChronology1.years();
        org.joda.time.DurationField durationField15 = copticChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField14", (durationField3.compareTo(durationField14) == 0) == durationField3.equals(durationField14));
    }

    @Test
    public void test701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test701");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = copticChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology1.halfdayOfDay();
        org.joda.time.DurationField durationField5 = copticChronology1.millis();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField7 = copticChronology1.seconds();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.Chronology chronology9 = copticChronology1.withZone(dateTimeZone8);
        org.joda.time.DateTimeField dateTimeField10 = copticChronology1.weekOfWeekyear();
        org.joda.time.DurationField durationField11 = copticChronology1.millis();
        org.joda.time.DurationField durationField12 = copticChronology1.years();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology1.centuryOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField12", (durationField3.compareTo(durationField12) == 0) == durationField3.equals(durationField12));
    }

    @Test
    public void test702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test702");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.CopticChronology copticChronology2 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology2.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology2.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.Chronology chronology6 = copticChronology2.withZone(dateTimeZone5);
        org.joda.time.DateTimeField dateTimeField7 = copticChronology2.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology2.clockhourOfHalfday();
        org.joda.time.DurationField durationField9 = copticChronology2.days();
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime(4287241809L, (org.joda.time.Chronology) copticChronology2);
        java.lang.String str11 = copticChronology2.toString();
        org.joda.time.DurationField durationField12 = copticChronology2.years();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology2.halfdayOfDay();
        org.joda.time.DurationField durationField14 = copticChronology2.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField14, durationField9, and durationField12", !(durationField14.compareTo(durationField9) == 0) || (Math.signum(durationField14.compareTo(durationField12)) == Math.signum(durationField9.compareTo(durationField12))));
    }

    @Test
    public void test703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test703");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology1.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.Chronology chronology5 = copticChronology1.withZone(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology1.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone8 = copticChronology1.getZone();
        long long12 = copticChronology1.add((long) 53, (-3600001L), 2);
        org.joda.time.DurationField durationField13 = copticChronology1.weeks();
        org.joda.time.DurationField durationField14 = copticChronology1.eras();
        org.joda.time.DurationField durationField15 = copticChronology1.months();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField13 and durationField14", Math.signum(durationField13.compareTo(durationField14)) == -Math.signum(durationField14.compareTo(durationField13)));
    }

    @Test
    public void test704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test704");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.clockhourOfDay();
        long long6 = copticChronology1.add((long) '#', (long) 'a', (int) '#');
        org.joda.time.DateTimeField dateTimeField7 = copticChronology1.clockhourOfHalfday();
        org.joda.time.DurationField durationField8 = copticChronology1.eras();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology1.monthOfYear();
        long long13 = copticChronology1.add((long) 753, 4287404405L, 0);
        org.joda.time.DateTimeField dateTimeField14 = copticChronology1.clockhourOfDay();
        org.joda.time.LocalDateTime localDateTime16 = org.joda.time.LocalDateTime.parse("2022-02-14T14:54:35.214");
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.minusSeconds(191);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.chrono.CopticChronology copticChronology20 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone19);
        org.joda.time.DateTimeField dateTimeField21 = copticChronology20.hourOfDay();
        org.joda.time.DateTimeField dateTimeField22 = copticChronology20.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.Chronology chronology24 = copticChronology20.withZone(dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField25 = copticChronology20.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField26 = copticChronology20.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField27 = copticChronology20.dayOfMonth();
        long long31 = copticChronology20.add(4287227101L, 11L, (int) (short) 0);
        org.joda.time.DateTimeField dateTimeField32 = copticChronology20.dayOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = dateTimeField32.getType();
        org.joda.time.LocalDateTime.Property property34 = localDateTime18.property(dateTimeFieldType33);
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.chrono.CopticChronology copticChronology36 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone35);
        org.joda.time.DateTimeField dateTimeField37 = copticChronology36.dayOfMonth();
        org.joda.time.DurationField durationField38 = copticChronology36.months();
        org.joda.time.DateTimeField dateTimeField39 = copticChronology36.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField40 = copticChronology36.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone41 = copticChronology36.getZone();
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.chrono.CopticChronology copticChronology44 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone43);
        org.joda.time.DateTimeField dateTimeField45 = copticChronology44.dayOfMonth();
        java.util.Locale locale49 = new java.util.Locale("hi!", "hi!");
        java.lang.String str50 = dateTimeField45.getAsText((int) (byte) 10, locale49);
        java.lang.String str51 = dateTimeZone41.getShortName((long) 268, locale49);
        java.lang.String str52 = locale49.getDisplayScript();
        java.lang.String str53 = dateTimeField14.getAsShortText((org.joda.time.ReadablePartial) localDateTime18, locale49);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField8 and durationField38", Math.signum(durationField8.compareTo(durationField38)) == -Math.signum(durationField38.compareTo(durationField8)));
    }

    @Test
    public void test705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test705");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.plusWeeks((int) (byte) 10);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(chronology8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime9.withMillisOfSecond((int) (byte) 1);
        int int14 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime9);
        org.joda.time.LocalDateTime.Property property15 = localDateTime9.weekyear();
        org.joda.time.LocalDateTime.Property property16 = localDateTime9.millisOfDay();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime9.minusYears(999);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.plusDays((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime20.plusYears(522);
        org.joda.time.LocalDateTime.Property property23 = localDateTime22.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime25 = property23.addWrapFieldToCopy(2);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.chrono.CopticChronology copticChronology27 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone26);
        org.joda.time.DateTimeField dateTimeField28 = copticChronology27.hourOfDay();
        org.joda.time.DateTimeField dateTimeField29 = copticChronology27.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField30 = copticChronology27.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.chrono.CopticChronology copticChronology32 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone31);
        org.joda.time.DateTimeField dateTimeField33 = copticChronology32.hourOfDay();
        org.joda.time.DurationField durationField34 = copticChronology32.eras();
        org.joda.time.DateTimeField dateTimeField35 = copticChronology32.weekOfWeekyear();
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime(chronology36);
        org.joda.time.LocalDateTime localDateTime39 = localDateTime37.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime.Property property40 = localDateTime39.weekOfWeekyear();
        int int41 = localDateTime39.getYear();
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.chrono.CopticChronology copticChronology43 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone42);
        org.joda.time.DateTimeField dateTimeField44 = copticChronology43.dayOfMonth();
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.LocalDateTime localDateTime46 = new org.joda.time.LocalDateTime(chronology45);
        org.joda.time.LocalDateTime localDateTime48 = localDateTime46.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime50 = localDateTime46.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime52 = localDateTime46.plusWeeks((int) (byte) 10);
        java.util.Locale locale53 = java.util.Locale.PRC;
        java.lang.String str54 = dateTimeField44.getAsText((org.joda.time.ReadablePartial) localDateTime52, locale53);
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.LocalDateTime localDateTime56 = new org.joda.time.LocalDateTime(chronology55);
        org.joda.time.LocalDateTime localDateTime58 = localDateTime56.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime60 = localDateTime56.withMillisOfSecond((int) (byte) 1);
        java.util.Locale locale62 = java.util.Locale.JAPAN;
        java.lang.String str63 = dateTimeField44.getAsText((org.joda.time.ReadablePartial) localDateTime56, 2022, locale62);
        java.lang.String str64 = dateTimeField35.getAsShortText((org.joda.time.ReadablePartial) localDateTime39, locale62);
        int int65 = dateTimeField30.getMaximumTextLength(locale62);
        java.lang.String str66 = locale62.getLanguage();
        int int67 = property23.getMaximumTextLength(locale62);
        java.lang.String str68 = property23.getAsText();
        java.util.Locale locale69 = java.util.Locale.TAIWAN;
        java.lang.String str70 = locale69.getVariant();
        java.lang.String str71 = locale69.getVariant();
        java.util.Locale locale72 = java.util.Locale.GERMANY;
        org.joda.time.DateTimeZone dateTimeZone73 = null;
        org.joda.time.chrono.CopticChronology copticChronology74 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone73);
        org.joda.time.DateTimeField dateTimeField75 = copticChronology74.clockhourOfDay();
        org.joda.time.DurationField durationField76 = copticChronology74.weekyears();
        org.joda.time.DateTimeField dateTimeField77 = copticChronology74.clockhourOfDay();
        org.joda.time.Chronology chronology78 = null;
        org.joda.time.LocalDateTime localDateTime79 = new org.joda.time.LocalDateTime(chronology78);
        org.joda.time.LocalDateTime localDateTime81 = localDateTime79.plusWeeks((int) (byte) -1);
        java.util.Locale locale83 = java.util.Locale.GERMANY;
        java.lang.String str84 = locale83.getScript();
        org.joda.time.DateTimeZone dateTimeZone85 = null;
        org.joda.time.chrono.CopticChronology copticChronology86 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone85);
        org.joda.time.DateTimeField dateTimeField87 = copticChronology86.clockhourOfDay();
        java.util.Locale locale89 = java.util.Locale.ITALIAN;
        java.lang.String str90 = dateTimeField87.getAsText((long) 'a', locale89);
        java.lang.String str91 = locale83.getDisplayName(locale89);
        java.lang.String str92 = dateTimeField77.getAsShortText((org.joda.time.ReadablePartial) localDateTime81, (int) ' ', locale89);
        java.lang.String str93 = locale72.getDisplayName(locale89);
        java.lang.String str94 = locale69.getDisplayScript(locale89);
        java.lang.String str95 = property23.getAsShortText(locale89);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField34 and durationField76", Math.signum(durationField34.compareTo(durationField76)) == -Math.signum(durationField76.compareTo(durationField34)));
    }

    @Test
    public void test706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test706");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.hourOfDay();
        org.joda.time.DurationField durationField3 = copticChronology1.eras();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology1.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology1.monthOfYear();
        long long9 = copticChronology1.add(4287242686L, 53625125L, 522);
        org.joda.time.DateTimeField dateTimeField10 = copticChronology1.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology1.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology1.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.chrono.CopticChronology copticChronology14 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone13);
        org.joda.time.DateTimeField dateTimeField15 = copticChronology14.hourOfDay();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology14.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology14.dayOfWeek();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime(chronology18);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray20 = localDateTime19.getFieldTypes();
        org.joda.time.LocalDateTime localDateTime22 = localDateTime19.withMillisOfDay((int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime22.plusWeeks((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.chrono.CopticChronology copticChronology27 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone26);
        org.joda.time.DateTimeField dateTimeField28 = copticChronology27.hourOfDay();
        org.joda.time.DateTimeField dateTimeField29 = copticChronology27.secondOfDay();
        org.joda.time.DateTimeField dateTimeField30 = copticChronology27.secondOfDay();
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime((long) 10, (org.joda.time.Chronology) copticChronology27);
        int int32 = localDateTime31.getDayOfYear();
        boolean boolean33 = localDateTime24.isEqual((org.joda.time.ReadablePartial) localDateTime31);
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.chrono.CopticChronology copticChronology35 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone34);
        org.joda.time.DateTimeField dateTimeField36 = copticChronology35.hourOfDay();
        org.joda.time.DateTimeField dateTimeField37 = copticChronology35.centuryOfEra();
        org.joda.time.DurationField durationField38 = copticChronology35.millis();
        org.joda.time.DateTimeField dateTimeField39 = copticChronology35.weekOfWeekyear();
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.LocalDateTime localDateTime41 = new org.joda.time.LocalDateTime(chronology40);
        org.joda.time.LocalDateTime localDateTime43 = localDateTime41.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime45 = localDateTime41.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime47 = localDateTime41.plusWeeks((int) (byte) 10);
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.LocalDateTime localDateTime49 = new org.joda.time.LocalDateTime(chronology48);
        org.joda.time.LocalDateTime localDateTime51 = localDateTime49.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime53 = localDateTime49.withMillisOfSecond((int) (byte) 1);
        int int54 = localDateTime41.compareTo((org.joda.time.ReadablePartial) localDateTime49);
        org.joda.time.LocalDateTime.Property property55 = localDateTime49.weekyear();
        org.joda.time.LocalDateTime localDateTime57 = localDateTime49.minusMillis(2022);
        int[] intArray59 = copticChronology35.get((org.joda.time.ReadablePartial) localDateTime49, (long) '#');
        int int60 = dateTimeField17.getMinimumValue((org.joda.time.ReadablePartial) localDateTime31, intArray59);
        int int61 = localDateTime31.getMinuteOfHour();
        int int62 = localDateTime31.getHourOfDay();
        org.joda.time.Chronology chronology63 = null;
        org.joda.time.LocalDateTime localDateTime64 = new org.joda.time.LocalDateTime(chronology63);
        org.joda.time.LocalDateTime localDateTime66 = localDateTime64.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime.Property property67 = localDateTime66.weekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod68 = null;
        org.joda.time.LocalDateTime localDateTime70 = localDateTime66.withPeriodAdded(readablePeriod68, 8);
        boolean boolean71 = localDateTime31.isAfter((org.joda.time.ReadablePartial) localDateTime70);
        org.joda.time.LocalDateTime.Property property72 = localDateTime70.hourOfDay();
        int int73 = localDateTime70.getWeekOfWeekyear();
        int int74 = localDateTime70.getMillisOfSecond();
        long long76 = copticChronology1.set((org.joda.time.ReadablePartial) localDateTime70, 10597446004342L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField38", Math.signum(durationField3.compareTo(durationField38)) == -Math.signum(durationField38.compareTo(durationField3)));
    }

    @Test
    public void test707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test707");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.dayOfMonth();
        org.joda.time.DurationField durationField3 = copticChronology1.eras();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology1.yearOfEra();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.clockhourOfHalfday();
        org.joda.time.DurationField durationField7 = copticChronology1.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField3, durationField7, and durationField3", !(durationField3.compareTo(durationField7) == 0) || (Math.signum(durationField3.compareTo(durationField3)) == Math.signum(durationField7.compareTo(durationField3))));
    }

    @Test
    public void test708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test708");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology1.secondOfDay();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology1.secondOfDay();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology1.centuryOfEra();
        org.joda.time.Chronology chronology6 = copticChronology1.withUTC();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology1.yearOfCentury();
        org.joda.time.DurationField durationField8 = copticChronology1.years();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.chrono.CopticChronology copticChronology10 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField11 = copticChronology10.clockhourOfDay();
        org.joda.time.DurationField durationField12 = copticChronology10.weekyears();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology10.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone14 = copticChronology10.getZone();
        org.joda.time.DurationField durationField15 = copticChronology10.centuries();
        org.joda.time.DurationField durationField16 = copticChronology10.weeks();
        java.lang.String str17 = copticChronology10.toString();
        org.joda.time.DurationField durationField18 = copticChronology10.days();
        org.joda.time.DurationField durationField19 = copticChronology10.millis();
        int int20 = durationField8.compareTo(durationField19);
        long long23 = durationField19.add(267844392379368L, 10597445766741L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField8 and durationField12", (durationField8.compareTo(durationField12) == 0) == durationField8.equals(durationField12));
    }

    @Test
    public void test709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test709");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = copticChronology1.weekyears();
        org.joda.time.DurationField durationField4 = copticChronology1.hours();
        int int5 = copticChronology1.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.monthOfYear();
        org.joda.time.DurationField durationField7 = copticChronology1.seconds();
        org.joda.time.DurationField durationField8 = copticChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology1.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.chrono.CopticChronology copticChronology12 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone11);
        org.joda.time.DateTimeField dateTimeField13 = copticChronology12.clockhourOfDay();
        org.joda.time.DurationField durationField14 = copticChronology12.weekyears();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology12.clockhourOfDay();
        org.joda.time.DurationField durationField16 = copticChronology12.hours();
        org.joda.time.DateTimeZone dateTimeZone17 = copticChronology12.getZone();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone17);
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime(49L, dateTimeZone17);
        org.joda.time.Chronology chronology20 = copticChronology1.withZone(dateTimeZone17);
        org.joda.time.DurationField durationField21 = copticChronology1.months();
        java.lang.String str22 = copticChronology1.toString();
        org.joda.time.DurationField durationField23 = copticChronology1.months();
        org.joda.time.DateTimeField dateTimeField24 = copticChronology1.hourOfDay();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime(chronology25);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime26.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime26.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime26.plusWeeks((int) (byte) 10);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime(chronology33);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime34.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime38 = localDateTime34.withMillisOfSecond((int) (byte) 1);
        int int39 = localDateTime26.compareTo((org.joda.time.ReadablePartial) localDateTime34);
        org.joda.time.LocalDateTime.Property property40 = localDateTime34.weekyear();
        org.joda.time.LocalDateTime.Property property41 = localDateTime34.millisOfDay();
        org.joda.time.LocalDateTime localDateTime43 = localDateTime34.minusYears(999);
        org.joda.time.LocalDateTime localDateTime45 = localDateTime43.plusDays((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime47 = localDateTime45.plusYears(522);
        org.joda.time.LocalDateTime.Property property48 = localDateTime45.yearOfEra();
        org.joda.time.LocalDateTime localDateTime49 = property48.roundHalfCeilingCopy();
        org.joda.time.Chronology chronology50 = localDateTime49.getChronology();
        org.joda.time.LocalDateTime localDateTime52 = localDateTime49.plusHours(773);
        org.joda.time.DateTimeZone dateTimeZone53 = null;
        org.joda.time.chrono.CopticChronology copticChronology54 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone53);
        org.joda.time.DateTimeField dateTimeField55 = copticChronology54.hourOfDay();
        org.joda.time.DateTimeField dateTimeField56 = copticChronology54.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField57 = copticChronology54.hourOfDay();
        java.util.TimeZone timeZone58 = null;
        org.joda.time.DateTimeZone dateTimeZone59 = org.joda.time.DateTimeZone.forTimeZone(timeZone58);
        java.lang.String str61 = dateTimeZone59.getNameKey((long) (byte) 0);
        boolean boolean62 = dateTimeZone59.isFixed();
        java.lang.String str64 = dateTimeZone59.getShortName(3430L);
        org.joda.time.Chronology chronology65 = copticChronology54.withZone(dateTimeZone59);
        long long67 = dateTimeZone59.convertUTCToLocal(32054400000L);
        org.joda.time.LocalDateTime localDateTime68 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime49, dateTimeZone59);
        org.joda.time.DateTimeZone dateTimeZone69 = null;
        org.joda.time.chrono.CopticChronology copticChronology70 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone69);
        org.joda.time.DateTimeField dateTimeField71 = copticChronology70.hourOfDay();
        org.joda.time.DurationField durationField72 = copticChronology70.eras();
        org.joda.time.DateTimeField dateTimeField73 = copticChronology70.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone75 = null;
        org.joda.time.chrono.CopticChronology copticChronology76 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone75);
        org.joda.time.DateTimeField dateTimeField77 = copticChronology76.hourOfDay();
        org.joda.time.DurationField durationField78 = copticChronology76.eras();
        org.joda.time.DateTimeField dateTimeField79 = copticChronology76.weekyear();
        org.joda.time.LocalDateTime localDateTime80 = new org.joda.time.LocalDateTime((long) (-292275054), (org.joda.time.Chronology) copticChronology76);
        org.joda.time.LocalDateTime localDateTime82 = localDateTime80.minusYears(22);
        org.joda.time.DateTimeZone dateTimeZone84 = null;
        org.joda.time.chrono.CopticChronology copticChronology85 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone84);
        org.joda.time.DateTimeField dateTimeField86 = copticChronology85.hourOfDay();
        org.joda.time.DateTimeField dateTimeField87 = copticChronology85.weekyearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone89 = null;
        org.joda.time.chrono.CopticChronology copticChronology90 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone89);
        org.joda.time.DateTimeField dateTimeField91 = copticChronology90.clockhourOfDay();
        java.util.Locale locale93 = java.util.Locale.ITALIAN;
        java.lang.String str94 = dateTimeField91.getAsText((long) 'a', locale93);
        java.lang.String str95 = dateTimeField87.getAsText((int) 'a', locale93);
        java.lang.String str96 = dateTimeField73.getAsText((org.joda.time.ReadablePartial) localDateTime80, 292272708, locale93);
        int int97 = localDateTime80.getDayOfWeek();
        int[] intArray98 = localDateTime80.getValues();
        int int99 = dateTimeField24.getMinimumValue((org.joda.time.ReadablePartial) localDateTime68, intArray98);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField72", Math.signum(durationField3.compareTo(durationField72)) == -Math.signum(durationField72.compareTo(durationField3)));
    }
}

