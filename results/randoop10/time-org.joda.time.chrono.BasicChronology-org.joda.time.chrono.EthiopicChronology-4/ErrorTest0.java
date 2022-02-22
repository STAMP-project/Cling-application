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
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DurationField durationField4 = ethiopicChronology1.centuries();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology1.weekyear();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.yearOfEra();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology1.weekyear();
        org.joda.time.DurationField durationField8 = ethiopicChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField8, durationField3, and durationField4", !(durationField8.compareTo(durationField3) == 0) || (Math.signum(durationField8.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = ethiopicChronology1.getZone();
        org.joda.time.Chronology chronology6 = ethiopicChronology1.withUTC();
        org.joda.time.DurationField durationField7 = ethiopicChronology1.minutes();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology1.clockhourOfHalfday();
        org.joda.time.DurationField durationField9 = ethiopicChronology1.years();
        java.lang.String[] strArray19 = new java.lang.String[] { "de_DE", "", "", "7", "3", "UTC", "24", "2022-02-15T07:08:12.450", "2022-02-15T07:08:12.450" };
        java.util.LinkedHashSet<java.lang.String> strSet20 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet20, strArray19);
        java.util.Set<java.lang.String> strSet22 = org.joda.time.DateTimeZone.getAvailableIDs();
        boolean boolean23 = strSet20.addAll((java.util.Collection<java.lang.String>) strSet22);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology25 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone24);
        org.joda.time.DateTimeField dateTimeField26 = ethiopicChronology25.hourOfDay();
        org.joda.time.DateTimeField dateTimeField27 = ethiopicChronology25.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.Chronology chronology29 = ethiopicChronology25.withZone(dateTimeZone28);
        org.joda.time.DateTimeField dateTimeField30 = ethiopicChronology25.millisOfSecond();
        boolean boolean31 = strSet20.contains((java.lang.Object) ethiopicChronology25);
        boolean boolean32 = ethiopicChronology1.equals((java.lang.Object) ethiopicChronology25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField9", (durationField3.compareTo(durationField9) == 0) == durationField3.equals(durationField9));
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology2 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology2.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology2.secondOfDay();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology2.secondOfDay();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) 10, (org.joda.time.Chronology) ethiopicChronology2);
        org.joda.time.DurationField durationField7 = ethiopicChronology2.eras();
        org.joda.time.DurationField durationField8 = ethiopicChronology2.weeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField7, durationField8, and durationField7", !(durationField7.compareTo(durationField8) == 0) || (Math.signum(durationField7.compareTo(durationField7)) == Math.signum(durationField8.compareTo(durationField7))));
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = ethiopicChronology1.getZone();
        org.joda.time.Chronology chronology6 = ethiopicChronology1.withUTC();
        org.joda.time.DurationField durationField7 = ethiopicChronology1.minutes();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology1.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology1.minuteOfDay();
        org.joda.time.DurationField durationField10 = ethiopicChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField10, durationField3, and durationField7", !(durationField10.compareTo(durationField3) == 0) || (Math.signum(durationField10.compareTo(durationField7)) == Math.signum(durationField3.compareTo(durationField7))));
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology1.centuryOfEra();
        org.joda.time.DurationField durationField4 = ethiopicChronology1.eras();
        org.joda.time.DurationField durationField5 = ethiopicChronology1.years();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField4, durationField5, and durationField4", !(durationField4.compareTo(durationField5) == 0) || (Math.signum(durationField4.compareTo(durationField4)) == Math.signum(durationField5.compareTo(durationField4))));
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology1.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.Chronology chronology5 = ethiopicChronology1.withZone(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.millisOfSecond();
        org.joda.time.DurationField durationField7 = ethiopicChronology1.eras();
        org.joda.time.Chronology chronology8 = ethiopicChronology1.withUTC();
        org.joda.time.DurationField durationField9 = ethiopicChronology1.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField7, durationField9, and durationField7", !(durationField7.compareTo(durationField9) == 0) || (Math.signum(durationField7.compareTo(durationField7)) == Math.signum(durationField9.compareTo(durationField7))));
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology2 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology2.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology2.secondOfDay();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology2.secondOfDay();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) 10, (org.joda.time.Chronology) ethiopicChronology2);
        org.joda.time.DurationField durationField7 = ethiopicChronology2.days();
        org.joda.time.DateTimeZone dateTimeZone8 = ethiopicChronology2.getZone();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology10 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology10.hourOfDay();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology10.centuryOfEra();
        org.joda.time.DurationField durationField13 = ethiopicChronology10.millis();
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology10.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField15 = ethiopicChronology10.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField16 = ethiopicChronology10.weekyear();
        boolean boolean17 = ethiopicChronology2.equals((java.lang.Object) dateTimeField16);
        org.joda.time.DateTimeField dateTimeField18 = ethiopicChronology2.halfdayOfDay();
        org.joda.time.DurationField durationField19 = ethiopicChronology2.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField19, durationField7, and durationField13", !(durationField19.compareTo(durationField7) == 0) || (Math.signum(durationField19.compareTo(durationField13)) == Math.signum(durationField7.compareTo(durationField13))));
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DurationField durationField4 = ethiopicChronology1.centuries();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology1.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.weekyear();
        java.lang.String str7 = ethiopicChronology1.toString();
        org.joda.time.DateTimeZone dateTimeZone8 = ethiopicChronology1.getZone();
        org.joda.time.DurationField durationField9 = ethiopicChronology1.years();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology1.millisOfSecond();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField9", (durationField3.compareTo(durationField9) == 0) == durationField3.equals(durationField9));
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = ethiopicChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField7 = ethiopicChronology1.eras();
        org.joda.time.DurationField durationField8 = ethiopicChronology1.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField7", Math.signum(durationField3.compareTo(durationField7)) == -Math.signum(durationField7.compareTo(durationField3)));
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DurationField durationField4 = ethiopicChronology1.centuries();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology1.weekyear();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.yearOfEra();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology1.weekyear();
        org.joda.time.DurationField durationField8 = ethiopicChronology1.millis();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology1.era();
        org.joda.time.DurationField durationField10 = ethiopicChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField10, durationField3, and durationField4", !(durationField10.compareTo(durationField3) == 0) || (Math.signum(durationField10.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.dayOfMonth();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime(chronology3);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime4.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime4.plusWeeks((int) (byte) 10);
        java.util.Locale locale11 = java.util.Locale.PRC;
        java.lang.String str12 = dateTimeField2.getAsText((org.joda.time.ReadablePartial) localDateTime10, locale11);
        java.util.Set<java.lang.String> strSet13 = locale11.getUnicodeLocaleKeys();
        java.lang.String[] strArray23 = new java.lang.String[] { "UTC", "UTC", "tedesco (Germania)", "Etc/UTC", "Etc/UTC", "", "", "10", "Etc/UTC" };
        java.util.LinkedHashSet<java.lang.String> strSet24 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet24, strArray23);
        java.util.Locale.LanguageRange[] languageRangeArray26 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList27 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList27, languageRangeArray26);
        java.util.Collection<java.lang.String> strCollection29 = null;
        java.util.List<java.lang.String> strList30 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList27, strCollection29);
        boolean boolean31 = strSet24.retainAll((java.util.Collection<java.lang.String>) strList30);
        boolean boolean32 = strSet13.containsAll((java.util.Collection<java.lang.String>) strList30);
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology34 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone33);
        org.joda.time.DateTimeField dateTimeField35 = ethiopicChronology34.hourOfDay();
        org.joda.time.DateTimeField dateTimeField36 = ethiopicChronology34.secondOfDay();
        org.joda.time.DateTimeField dateTimeField37 = ethiopicChronology34.secondOfDay();
        org.joda.time.DurationField durationField38 = ethiopicChronology34.weeks();
        org.joda.time.DateTimeField dateTimeField39 = ethiopicChronology34.clockhourOfHalfday();
        org.joda.time.DurationField durationField40 = ethiopicChronology34.weekyears();
        org.joda.time.DateTimeZone dateTimeZone41 = ethiopicChronology34.getZone();
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology44 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone43);
        org.joda.time.DateTimeField dateTimeField45 = ethiopicChronology44.hourOfDay();
        org.joda.time.DateTimeField dateTimeField46 = ethiopicChronology44.secondOfDay();
        org.joda.time.DateTimeField dateTimeField47 = ethiopicChronology44.secondOfDay();
        org.joda.time.LocalDateTime localDateTime48 = new org.joda.time.LocalDateTime((long) 10, (org.joda.time.Chronology) ethiopicChronology44);
        org.joda.time.DurationField durationField49 = ethiopicChronology44.days();
        org.joda.time.DateTimeField dateTimeField50 = ethiopicChronology44.secondOfDay();
        boolean boolean52 = ethiopicChronology44.equals((java.lang.Object) "24");
        org.joda.time.DurationField durationField53 = ethiopicChronology44.years();
        org.joda.time.chrono.AssembledChronology[] assembledChronologyArray54 = new org.joda.time.chrono.AssembledChronology[] { ethiopicChronology34, ethiopicChronology44 };
        org.joda.time.chrono.AssembledChronology[] assembledChronologyArray55 = strSet13.toArray(assembledChronologyArray54);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField40 and durationField53", (durationField40.compareTo(durationField53) == 0) == durationField40.equals(durationField53));
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = ethiopicChronology1.getZone();
        org.joda.time.Chronology chronology6 = ethiopicChronology1.withUTC();
        org.joda.time.DurationField durationField7 = ethiopicChronology1.minutes();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology1.clockhourOfHalfday();
        org.joda.time.DurationField durationField9 = ethiopicChronology1.centuries();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology1.millisOfDay();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology1.year();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology1.year();
        org.joda.time.DurationField durationField13 = ethiopicChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField13, durationField3, and durationField7", !(durationField13.compareTo(durationField3) == 0) || (Math.signum(durationField13.compareTo(durationField7)) == Math.signum(durationField3.compareTo(durationField7))));
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology1.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.Chronology chronology5 = ethiopicChronology1.withZone(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.millisOfSecond();
        org.joda.time.DurationField durationField7 = ethiopicChronology1.eras();
        org.joda.time.Chronology chronology8 = ethiopicChronology1.withUTC();
        org.joda.time.DurationField durationField9 = ethiopicChronology1.months();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField7, durationField9, and durationField7", !(durationField7.compareTo(durationField9) == 0) || (Math.signum(durationField7.compareTo(durationField7)) == Math.signum(durationField9.compareTo(durationField7))));
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology1.secondOfDay();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology1.secondOfDay();
        org.joda.time.DurationField durationField5 = ethiopicChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.clockhourOfHalfday();
        org.joda.time.DurationField durationField7 = ethiopicChronology1.weeks();
        org.joda.time.DurationField durationField8 = ethiopicChronology1.years();
        org.joda.time.DurationField durationField9 = ethiopicChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology1.minuteOfHour();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField8 and durationField9", (durationField8.compareTo(durationField9) == 0) == durationField8.equals(durationField9));
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = ethiopicChronology1.getZone();
        org.joda.time.Chronology chronology6 = ethiopicChronology1.withUTC();
        org.joda.time.DurationField durationField7 = ethiopicChronology1.minutes();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology1.clockhourOfHalfday();
        org.joda.time.DurationField durationField9 = ethiopicChronology1.years();
        java.lang.String str10 = ethiopicChronology1.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField9", (durationField3.compareTo(durationField9) == 0) == durationField3.equals(durationField9));
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology2 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology2.clockhourOfDay();
        org.joda.time.DurationField durationField4 = ethiopicChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology2.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone6 = ethiopicChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology2.monthOfYear();
        org.joda.time.DurationField durationField8 = ethiopicChronology2.seconds();
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(obj0, (org.joda.time.Chronology) ethiopicChronology2);
        java.lang.String str10 = ethiopicChronology2.toString();
        org.joda.time.DurationField durationField11 = ethiopicChronology2.years();
        org.joda.time.DurationField durationField12 = ethiopicChronology2.months();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField11", (durationField4.compareTo(durationField11) == 0) == durationField4.equals(durationField11));
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology1.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.Chronology chronology5 = ethiopicChronology1.withZone(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.millisOfSecond();
        org.joda.time.DurationField durationField7 = ethiopicChronology1.eras();
        org.joda.time.Chronology chronology8 = ethiopicChronology1.withUTC();
        org.joda.time.DurationField durationField9 = ethiopicChronology1.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField7, durationField9, and durationField7", !(durationField7.compareTo(durationField9) == 0) || (Math.signum(durationField7.compareTo(durationField7)) == Math.signum(durationField9.compareTo(durationField7))));
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology1.centuryOfEra();
        org.joda.time.DurationField durationField4 = ethiopicChronology1.eras();
        org.joda.time.Chronology chronology5 = ethiopicChronology1.withUTC();
        org.joda.time.DurationField durationField6 = chronology5.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField4, durationField6, and durationField4", !(durationField4.compareTo(durationField6) == 0) || (Math.signum(durationField4.compareTo(durationField4)) == Math.signum(durationField6.compareTo(durationField4))));
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology1.centuryOfEra();
        org.joda.time.DurationField durationField4 = ethiopicChronology1.eras();
        org.joda.time.Chronology chronology5 = ethiopicChronology1.withUTC();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = ethiopicChronology1.add(readablePeriod6, 0L, 1439);
        org.joda.time.DurationField durationField10 = ethiopicChronology1.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField4, durationField10, and durationField4", !(durationField4.compareTo(durationField10) == 0) || (Math.signum(durationField4.compareTo(durationField4)) == Math.signum(durationField10.compareTo(durationField4))));
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DurationField durationField4 = ethiopicChronology1.hours();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology1.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology1.yearOfEra();
        java.lang.String str8 = ethiopicChronology1.toString();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology1.year();
        org.joda.time.DurationField durationField10 = ethiopicChronology1.years();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology1.weekOfWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField10", (durationField3.compareTo(durationField10) == 0) == durationField3.equals(durationField10));
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.DateTime dateTime9 = localDateTime7.toDateTime(readableInstant8);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = null;
        boolean boolean11 = dateTime9.isSupported(dateTimeFieldType10);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime(chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime13.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime13.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.DateTime dateTime21 = localDateTime19.toDateTime(readableInstant20);
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = null;
        boolean boolean23 = dateTime21.isSupported(dateTimeFieldType22);
        int int24 = dateTime9.compareTo((org.joda.time.ReadableInstant) dateTime21);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime(chronology25);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime26.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime26.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime26.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.DateTime dateTime34 = localDateTime32.toDateTime(readableInstant33);
        java.util.Locale locale35 = java.util.Locale.GERMANY;
        boolean boolean36 = locale35.hasExtensions();
        boolean boolean37 = dateTime34.equals((java.lang.Object) locale35);
        boolean boolean38 = dateTime21.isAfter((org.joda.time.ReadableInstant) dateTime34);
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.LocalDateTime localDateTime40 = new org.joda.time.LocalDateTime(chronology39);
        org.joda.time.LocalDateTime localDateTime42 = localDateTime40.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime44 = localDateTime40.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime46 = localDateTime40.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.DateTime dateTime48 = localDateTime46.toDateTime(readableInstant47);
        java.util.Locale locale49 = java.util.Locale.GERMANY;
        boolean boolean50 = locale49.hasExtensions();
        boolean boolean51 = dateTime48.equals((java.lang.Object) locale49);
        java.lang.String str52 = dateTime48.toString();
        long long53 = dateTime48.getMillis();
        boolean boolean54 = dateTime34.isAfter((org.joda.time.ReadableInstant) dateTime48);
        org.joda.time.DateTimeZone dateTimeZone55 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology56 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone55);
        org.joda.time.DateTimeField dateTimeField57 = ethiopicChronology56.clockhourOfDay();
        org.joda.time.DurationField durationField58 = ethiopicChronology56.weekyears();
        org.joda.time.DateTimeField dateTimeField59 = ethiopicChronology56.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone60 = ethiopicChronology56.getZone();
        java.lang.String str61 = dateTimeZone60.getID();
        int int63 = dateTimeZone60.getStandardOffset((long) (-1));
        org.joda.time.Chronology chronology64 = null;
        org.joda.time.LocalDateTime localDateTime65 = new org.joda.time.LocalDateTime(chronology64);
        org.joda.time.LocalDateTime localDateTime67 = localDateTime65.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime69 = localDateTime65.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime71 = localDateTime65.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant72 = null;
        org.joda.time.DateTime dateTime73 = localDateTime71.toDateTime(readableInstant72);
        org.joda.time.DateTimeFieldType dateTimeFieldType74 = null;
        boolean boolean75 = dateTime73.isSupported(dateTimeFieldType74);
        org.joda.time.Chronology chronology76 = null;
        org.joda.time.LocalDateTime localDateTime77 = new org.joda.time.LocalDateTime(chronology76);
        org.joda.time.LocalDateTime localDateTime79 = localDateTime77.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime81 = localDateTime77.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime83 = localDateTime77.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant84 = null;
        org.joda.time.DateTime dateTime85 = localDateTime83.toDateTime(readableInstant84);
        org.joda.time.DateTimeFieldType dateTimeFieldType86 = null;
        boolean boolean87 = dateTime85.isSupported(dateTimeFieldType86);
        int int88 = dateTime73.compareTo((org.joda.time.ReadableInstant) dateTime85);
        int int89 = dateTimeZone60.getOffset((org.joda.time.ReadableInstant) dateTime73);
        org.joda.time.Instant instant90 = dateTime73.toInstant();
        boolean boolean91 = dateTime34.isBefore((org.joda.time.ReadableInstant) dateTime73);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and instant90", (dateTime9.compareTo(instant90) == 0) == dateTime9.equals(instant90));
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology1.secondOfDay();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology1.secondOfDay();
        org.joda.time.DurationField durationField5 = ethiopicChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.clockhourOfHalfday();
        org.joda.time.DurationField durationField7 = ethiopicChronology1.weeks();
        org.joda.time.DurationField durationField8 = ethiopicChronology1.years();
        org.joda.time.DurationField durationField9 = ethiopicChronology1.weekyears();
        org.joda.time.DurationField durationField10 = ethiopicChronology1.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField8 and durationField10", (durationField8.compareTo(durationField10) == 0) == durationField8.equals(durationField10));
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = ethiopicChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology1.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology1.millisOfDay();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology1.dayOfYear();
        org.joda.time.DurationField durationField10 = ethiopicChronology1.years();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(chronology11);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime12.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.withMillisOfSecond((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime16.withMinuteOfHour(10);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime20.plusMonths(272);
        long long24 = ethiopicChronology1.set((org.joda.time.ReadablePartial) localDateTime22, 1193987317742L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField10", (durationField3.compareTo(durationField10) == 0) == durationField3.equals(durationField10));
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology1.secondOfDay();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology1.secondOfDay();
        org.joda.time.DurationField durationField5 = ethiopicChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.weekyear();
        org.joda.time.DurationField durationField7 = ethiopicChronology1.eras();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology1.hourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField5 and durationField7", Math.signum(durationField5.compareTo(durationField7)) == -Math.signum(durationField7.compareTo(durationField5)));
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
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
        int int15 = localDateTime9.getSecondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology17 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone16);
        org.joda.time.DateTimeField dateTimeField18 = ethiopicChronology17.clockhourOfDay();
        org.joda.time.DurationField durationField19 = ethiopicChronology17.weekyears();
        org.joda.time.DurationField durationField20 = ethiopicChronology17.hours();
        org.joda.time.DateTimeField dateTimeField21 = ethiopicChronology17.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField22 = ethiopicChronology17.hourOfDay();
        org.joda.time.DateTimeField dateTimeField23 = ethiopicChronology17.yearOfEra();
        long long26 = dateTimeField23.add(100L, (int) (byte) 0);
        org.joda.time.DurationField durationField27 = dateTimeField23.getDurationField();
        org.joda.time.DurationFieldType durationFieldType28 = durationField27.getType();
        boolean boolean29 = localDateTime9.isSupported(durationFieldType28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField19 and durationField27", (durationField19.compareTo(durationField27) == 0) == durationField19.equals(durationField27));
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology1.centuryOfEra();
        org.joda.time.DurationField durationField4 = ethiopicChronology1.eras();
        org.joda.time.Chronology chronology5 = ethiopicChronology1.withUTC();
        org.joda.time.DurationField durationField6 = ethiopicChronology1.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField4, durationField6, and durationField4", !(durationField4.compareTo(durationField6) == 0) || (Math.signum(durationField4.compareTo(durationField4)) == Math.signum(durationField6.compareTo(durationField4))));
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = ethiopicChronology1.getZone();
        org.joda.time.Chronology chronology6 = ethiopicChronology1.withUTC();
        org.joda.time.DurationField durationField7 = ethiopicChronology1.minutes();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology1.clockhourOfHalfday();
        org.joda.time.DurationField durationField9 = ethiopicChronology1.years();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology1.dayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField9", (durationField3.compareTo(durationField9) == 0) == durationField3.equals(durationField9));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology1.centuryOfEra();
        org.joda.time.DurationField durationField4 = ethiopicChronology1.eras();
        org.joda.time.Chronology chronology5 = ethiopicChronology1.withUTC();
        org.joda.time.DurationField durationField6 = ethiopicChronology1.weeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField4, durationField6, and durationField4", !(durationField4.compareTo(durationField6) == 0) || (Math.signum(durationField4.compareTo(durationField4)) == Math.signum(durationField6.compareTo(durationField4))));
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = ethiopicChronology1.getZone();
        org.joda.time.Chronology chronology6 = ethiopicChronology1.withUTC();
        org.joda.time.DurationField durationField7 = ethiopicChronology1.minutes();
        org.joda.time.DurationField durationField8 = ethiopicChronology1.centuries();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology1.dayOfWeek();
        org.joda.time.DurationField durationField10 = ethiopicChronology1.weeks();
        org.joda.time.DurationField durationField11 = ethiopicChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField11, durationField3, and durationField7", !(durationField11.compareTo(durationField3) == 0) || (Math.signum(durationField11.compareTo(durationField7)) == Math.signum(durationField3.compareTo(durationField7))));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DurationField durationField4 = ethiopicChronology1.centuries();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology1.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.weekyear();
        java.lang.String str7 = ethiopicChronology1.toString();
        org.joda.time.DateTimeZone dateTimeZone8 = ethiopicChronology1.getZone();
        org.joda.time.DurationField durationField9 = ethiopicChronology1.years();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology1.minuteOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField9", (durationField3.compareTo(durationField9) == 0) == durationField3.equals(durationField9));
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = ethiopicChronology1.getZone();
        org.joda.time.Chronology chronology6 = ethiopicChronology1.withUTC();
        org.joda.time.DurationField durationField7 = ethiopicChronology1.minutes();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology1.clockhourOfHalfday();
        org.joda.time.DurationField durationField9 = ethiopicChronology1.years();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology1.weekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField9", (durationField3.compareTo(durationField9) == 0) == durationField3.equals(durationField9));
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology1.secondOfDay();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology1.secondOfDay();
        org.joda.time.DurationField durationField5 = ethiopicChronology1.weeks();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime7.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime7.withYearOfCentury(0);
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.weekyear();
        org.joda.time.LocalDateTime.Property property15 = localDateTime13.secondOfMinute();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(chronology16);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime17.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime17.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.DateTime dateTime25 = localDateTime23.toDateTime(readableInstant24);
        org.joda.time.LocalDateTime.Property property26 = localDateTime23.millisOfDay();
        org.joda.time.Interval interval27 = property26.toInterval();
        boolean boolean28 = localDateTime13.equals((java.lang.Object) property26);
        int[] intArray30 = ethiopicChronology1.get((org.joda.time.ReadablePartial) localDateTime13, (long) 1439);
        org.joda.time.DateTimeField dateTimeField31 = ethiopicChronology1.millisOfDay();
        org.joda.time.DateTimeField dateTimeField32 = ethiopicChronology1.yearOfEra();
        org.joda.time.DurationField durationField33 = ethiopicChronology1.eras();
        org.joda.time.DateTimeField dateTimeField34 = ethiopicChronology1.clockhourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField5 and durationField33", Math.signum(durationField5.compareTo(durationField33)) == -Math.signum(durationField33.compareTo(durationField5)));
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 10);
        long long3 = dateTimeZone1.convertUTCToLocal((long) (short) 100);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology4 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField5 = ethiopicChronology4.eras();
        org.joda.time.DurationField durationField6 = ethiopicChronology4.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField5, durationField6, and durationField5", !(durationField5.compareTo(durationField6) == 0) || (Math.signum(durationField5.compareTo(durationField5)) == Math.signum(durationField6.compareTo(durationField5))));
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = ethiopicChronology1.getZone();
        org.joda.time.Chronology chronology6 = ethiopicChronology1.withUTC();
        org.joda.time.DurationField durationField7 = ethiopicChronology1.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis(30);
        org.joda.time.Chronology chronology10 = ethiopicChronology1.withZone(dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology1.yearOfEra();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology1.yearOfCentury();
        org.joda.time.DurationField durationField13 = ethiopicChronology1.months();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 100);
        long long18 = dateTimeZone15.adjustOffset((-31449599999L), false);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 10);
        long long22 = dateTimeZone15.getMillisKeepLocal(dateTimeZone20, (long) 'a');
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology24 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField25 = ethiopicChronology24.clockhourOfDay();
        org.joda.time.DurationField durationField26 = ethiopicChronology24.weekyears();
        org.joda.time.DateTimeField dateTimeField27 = ethiopicChronology24.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone28 = ethiopicChronology24.getZone();
        java.lang.String str29 = dateTimeZone28.getID();
        int int31 = dateTimeZone28.getStandardOffset((long) (-1));
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime(chronology32);
        org.joda.time.LocalDateTime localDateTime35 = localDateTime33.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime37 = localDateTime33.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime39 = localDateTime33.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.DateTime dateTime41 = localDateTime39.toDateTime(readableInstant40);
        org.joda.time.DateTimeFieldType dateTimeFieldType42 = null;
        boolean boolean43 = dateTime41.isSupported(dateTimeFieldType42);
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.LocalDateTime localDateTime45 = new org.joda.time.LocalDateTime(chronology44);
        org.joda.time.LocalDateTime localDateTime47 = localDateTime45.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime49 = localDateTime45.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime51 = localDateTime45.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant52 = null;
        org.joda.time.DateTime dateTime53 = localDateTime51.toDateTime(readableInstant52);
        org.joda.time.DateTimeFieldType dateTimeFieldType54 = null;
        boolean boolean55 = dateTime53.isSupported(dateTimeFieldType54);
        int int56 = dateTime41.compareTo((org.joda.time.ReadableInstant) dateTime53);
        int int57 = dateTimeZone28.getOffset((org.joda.time.ReadableInstant) dateTime41);
        org.joda.time.Instant instant58 = dateTime41.toInstant();
        int int59 = dateTimeZone15.getOffset((org.joda.time.ReadableInstant) instant58);
        org.joda.time.Chronology chronology60 = ethiopicChronology1.withZone(dateTimeZone15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime41 and instant58", (dateTime41.compareTo(instant58) == 0) == dateTime41.equals(instant58));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology1.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.Chronology chronology5 = ethiopicChronology1.withZone(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology1.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology1.hourOfHalfday();
        org.joda.time.DurationField durationField9 = ethiopicChronology1.eras();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology1.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology12 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone11);
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology12.clockhourOfDay();
        org.joda.time.DurationField durationField14 = ethiopicChronology12.weekyears();
        org.joda.time.DurationField durationField15 = ethiopicChronology12.hours();
        org.joda.time.DateTimeField dateTimeField16 = ethiopicChronology12.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField17 = ethiopicChronology12.hourOfDay();
        org.joda.time.DateTimeField dateTimeField18 = ethiopicChronology12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone19 = ethiopicChronology12.getZone();
        java.util.Locale locale21 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str22 = dateTimeZone19.getName((long) 2000, locale21);
        org.joda.time.tz.NameProvider nameProvider24 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime(chronology25);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime26.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime26.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime26.withYearOfCentury(0);
        org.joda.time.LocalDateTime.Property property33 = localDateTime32.weekyear();
        org.joda.time.LocalDateTime localDateTime34 = property33.withMaximumValue();
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology36 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone35);
        org.joda.time.DateTimeField dateTimeField37 = ethiopicChronology36.dayOfMonth();
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.LocalDateTime localDateTime39 = new org.joda.time.LocalDateTime(chronology38);
        org.joda.time.LocalDateTime localDateTime41 = localDateTime39.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime43 = localDateTime39.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime45 = localDateTime39.plusWeeks((int) (byte) 10);
        java.util.Locale locale46 = java.util.Locale.PRC;
        java.lang.String str47 = dateTimeField37.getAsText((org.joda.time.ReadablePartial) localDateTime45, locale46);
        java.util.Set<java.lang.String> strSet48 = locale46.getUnicodeLocaleKeys();
        java.lang.String str49 = property33.getAsShortText(locale46);
        java.lang.String str52 = nameProvider24.getName(locale46, "52", "666");
        java.lang.String str53 = dateTimeZone19.getShortName((-2L), locale46);
        org.joda.time.DateTimeZone dateTimeZone55 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology56 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone55);
        org.joda.time.DateTimeField dateTimeField57 = ethiopicChronology56.dayOfMonth();
        org.joda.time.Chronology chronology58 = null;
        org.joda.time.LocalDateTime localDateTime59 = new org.joda.time.LocalDateTime(chronology58);
        org.joda.time.LocalDateTime localDateTime61 = localDateTime59.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime63 = localDateTime59.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime65 = localDateTime59.plusWeeks((int) (byte) 10);
        java.util.Locale locale66 = java.util.Locale.PRC;
        java.lang.String str67 = dateTimeField57.getAsText((org.joda.time.ReadablePartial) localDateTime65, locale66);
        java.util.Locale locale68 = java.util.Locale.TAIWAN;
        java.lang.String str69 = locale66.getDisplayName(locale68);
        java.lang.String str70 = dateTimeZone19.getName((long) 575, locale68);
        org.joda.time.Chronology chronology71 = ethiopicChronology1.withZone(dateTimeZone19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField9 and durationField14", Math.signum(durationField9.compareTo(durationField14)) == -Math.signum(durationField14.compareTo(durationField9)));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = ethiopicChronology1.getZone();
        java.lang.String str6 = dateTimeZone5.getID();
        int int8 = dateTimeZone5.getStandardOffset((long) (-1));
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime(chronology9);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime10.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime10.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.DateTime dateTime18 = localDateTime16.toDateTime(readableInstant17);
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = null;
        boolean boolean20 = dateTime18.isSupported(dateTimeFieldType19);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime(chronology21);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime22.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime22.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime22.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.DateTime dateTime30 = localDateTime28.toDateTime(readableInstant29);
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = null;
        boolean boolean32 = dateTime30.isSupported(dateTimeFieldType31);
        int int33 = dateTime18.compareTo((org.joda.time.ReadableInstant) dateTime30);
        int int34 = dateTimeZone5.getOffset((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.Instant instant35 = dateTime18.toInstant();
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime(chronology36);
        org.joda.time.LocalDateTime localDateTime39 = localDateTime37.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime41 = localDateTime37.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime43 = localDateTime41.withMillisOfSecond((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime45 = localDateTime41.withMinuteOfHour(10);
        org.joda.time.LocalDateTime localDateTime47 = localDateTime41.minusDays(100);
        org.joda.time.DateTime dateTime48 = localDateTime41.toDateTime();
        java.lang.String str49 = dateTime48.toString();
        boolean boolean50 = dateTime18.isBefore((org.joda.time.ReadableInstant) dateTime48);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime30 and instant35", (dateTime30.compareTo(instant35) == 0) == dateTime30.equals(instant35));
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.dayOfMonth();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime(chronology3);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime4.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime4.plusWeeks((int) (byte) 10);
        java.util.Locale locale11 = java.util.Locale.PRC;
        java.lang.String str12 = dateTimeField2.getAsText((org.joda.time.ReadablePartial) localDateTime10, locale11);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(chronology13);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime14.withMillisOfSecond((int) (byte) 1);
        java.util.Locale locale20 = java.util.Locale.JAPAN;
        java.lang.String str21 = dateTimeField2.getAsText((org.joda.time.ReadablePartial) localDateTime14, 2022, locale20);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology24 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField25 = ethiopicChronology24.hourOfDay();
        org.joda.time.DateTimeField dateTimeField26 = ethiopicChronology24.secondOfDay();
        org.joda.time.DateTimeField dateTimeField27 = ethiopicChronology24.secondOfDay();
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime((long) 10, (org.joda.time.Chronology) ethiopicChronology24);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime28.withDayOfYear((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime30.plusDays(0);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime14.withFields((org.joda.time.ReadablePartial) localDateTime32);
        org.joda.time.LocalDateTime localDateTime35 = localDateTime32.minusYears(262);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on localDateTime32 and localDateTime33", (localDateTime32.compareTo(localDateTime33) == 0) == localDateTime32.equals(localDateTime33));
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.weekOfWeekyear();
        java.lang.String str5 = property4.getAsText();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime7.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime7.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.DateTime dateTime15 = localDateTime13.toDateTime(readableInstant14);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(chronology16);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime17.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime17.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.DateTime dateTime25 = localDateTime23.toDateTime(readableInstant24);
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = null;
        boolean boolean27 = dateTime25.isSupported(dateTimeFieldType26);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime(chronology28);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime29.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime29.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime35 = localDateTime29.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.DateTime dateTime37 = localDateTime35.toDateTime(readableInstant36);
        org.joda.time.DateTimeFieldType dateTimeFieldType38 = null;
        boolean boolean39 = dateTime37.isSupported(dateTimeFieldType38);
        int int40 = dateTime25.compareTo((org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime(chronology41);
        org.joda.time.LocalDateTime localDateTime44 = localDateTime42.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime46 = localDateTime42.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime48 = localDateTime42.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant49 = null;
        org.joda.time.DateTime dateTime50 = localDateTime48.toDateTime(readableInstant49);
        java.util.Locale locale51 = java.util.Locale.GERMANY;
        boolean boolean52 = locale51.hasExtensions();
        boolean boolean53 = dateTime50.equals((java.lang.Object) locale51);
        boolean boolean54 = dateTime37.isAfter((org.joda.time.ReadableInstant) dateTime50);
        boolean boolean55 = dateTime15.isAfter((org.joda.time.ReadableInstant) dateTime50);
        org.joda.time.Instant instant56 = dateTime50.toInstant();
        int int57 = property4.compareTo((org.joda.time.ReadableInstant) dateTime50);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime15 and instant56", (dateTime15.compareTo(instant56) == 0) == dateTime15.equals(instant56));
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = ethiopicChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.monthOfYear();
        org.joda.time.DurationField durationField7 = ethiopicChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology1.year();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology1.millisOfDay();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        long long14 = ethiopicChronology1.add(readablePeriod11, 21153600000L, 292272984);
        org.joda.time.DurationField durationField15 = ethiopicChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField15, durationField3, and durationField7", !(durationField15.compareTo(durationField3) == 0) || (Math.signum(durationField15.compareTo(durationField7)) == Math.signum(durationField3.compareTo(durationField7))));
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DurationField durationField4 = ethiopicChronology1.centuries();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology1.weekyear();
        org.joda.time.DurationField durationField6 = ethiopicChronology1.halfdays();
        org.joda.time.DateTimeZone dateTimeZone7 = ethiopicChronology1.getZone();
        org.joda.time.DurationField durationField8 = ethiopicChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField8, durationField3, and durationField4", !(durationField8.compareTo(durationField3) == 0) || (Math.signum(durationField8.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = ethiopicChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.monthOfYear();
        org.joda.time.DurationField durationField7 = ethiopicChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology1.year();
        org.joda.time.DurationField durationField10 = ethiopicChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField10, durationField3, and durationField7", !(durationField10.compareTo(durationField3) == 0) || (Math.signum(durationField10.compareTo(durationField7)) == Math.signum(durationField3.compareTo(durationField7))));
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DurationField durationField4 = ethiopicChronology1.hours();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology1.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology1.yearOfEra();
        java.lang.String str8 = ethiopicChronology1.toString();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology1.dayOfMonth();
        org.joda.time.DurationField durationField10 = ethiopicChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField10, durationField3, and durationField4", !(durationField10.compareTo(durationField3) == 0) || (Math.signum(durationField10.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology1.centuryOfEra();
        org.joda.time.DurationField durationField4 = ethiopicChronology1.eras();
        org.joda.time.DurationField durationField5 = ethiopicChronology1.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField4, durationField5, and durationField4", !(durationField4.compareTo(durationField5) == 0) || (Math.signum(durationField4.compareTo(durationField4)) == Math.signum(durationField5.compareTo(durationField4))));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = ethiopicChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.monthOfYear();
        org.joda.time.DurationField durationField7 = ethiopicChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology1.millisOfSecond();
        org.joda.time.DurationField durationField9 = ethiopicChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology1.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology1.millisOfSecond();
        org.joda.time.DurationField durationField12 = ethiopicChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField12, durationField3, and durationField7", !(durationField12.compareTo(durationField3) == 0) || (Math.signum(durationField12.compareTo(durationField7)) == Math.signum(durationField3.compareTo(durationField7))));
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology1.halfdayOfDay();
        org.joda.time.DurationField durationField6 = ethiopicChronology1.eras();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 100);
        long long12 = dateTimeZone8.convertLocalToUTC((long) (short) -1, false, (long) (short) 0);
        org.joda.time.Chronology chronology13 = ethiopicChronology1.withZone(dateTimeZone8);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField6", Math.signum(durationField3.compareTo(durationField6)) == -Math.signum(durationField6.compareTo(durationField3)));
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology1.centuryOfEra();
        org.joda.time.DurationField durationField4 = ethiopicChronology1.millis();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology1.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology1.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology1.era();
        org.joda.time.DurationField durationField10 = ethiopicChronology1.eras();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology12 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone11);
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology12.hourOfDay();
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology12.centuryOfEra();
        org.joda.time.DurationField durationField15 = ethiopicChronology12.millis();
        org.joda.time.DateTimeField dateTimeField16 = ethiopicChronology12.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone17 = ethiopicChronology12.getZone();
        java.lang.String str19 = dateTimeZone17.getNameKey((long) (short) 0);
        long long23 = dateTimeZone17.convertLocalToUTC(360000087L, true, (long) 681);
        java.lang.String str25 = dateTimeZone17.getShortName((long) 86);
        org.joda.time.Chronology chronology26 = ethiopicChronology1.withZone(dateTimeZone17);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField4 and durationField10", Math.signum(durationField4.compareTo(durationField10)) == -Math.signum(durationField10.compareTo(durationField4)));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology2 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology2.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology2.secondOfDay();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology2.secondOfDay();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) 10, (org.joda.time.Chronology) ethiopicChronology2);
        org.joda.time.DurationField durationField7 = ethiopicChronology2.hours();
        org.joda.time.DurationField durationField8 = ethiopicChronology2.eras();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology2.halfdayOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField7 and durationField8", Math.signum(durationField7.compareTo(durationField8)) == -Math.signum(durationField8.compareTo(durationField7)));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology1.centuryOfEra();
        org.joda.time.DurationField durationField4 = ethiopicChronology1.millis();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology1.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology1.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology1.era();
        org.joda.time.DurationField durationField10 = ethiopicChronology1.eras();
        org.joda.time.DurationField durationField11 = ethiopicChronology1.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField4 and durationField10", Math.signum(durationField4.compareTo(durationField10)) == -Math.signum(durationField10.compareTo(durationField4)));
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.DateTime dateTime9 = localDateTime7.toDateTime(readableInstant8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime7.withSecondOfMinute((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology13 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone12);
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology13.clockhourOfDay();
        org.joda.time.DurationField durationField15 = ethiopicChronology13.weekyears();
        org.joda.time.DurationField durationField16 = ethiopicChronology13.centuries();
        org.joda.time.DateTimeField dateTimeField17 = ethiopicChronology13.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField18 = ethiopicChronology13.weekyear();
        java.lang.String str19 = ethiopicChronology13.toString();
        org.joda.time.DateTimeZone dateTimeZone20 = ethiopicChronology13.getZone();
        org.joda.time.DurationField durationField21 = ethiopicChronology13.years();
        boolean boolean22 = localDateTime7.equals((java.lang.Object) ethiopicChronology13);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField15 and durationField21", (durationField15.compareTo(durationField21) == 0) == durationField15.equals(durationField21));
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DurationField durationField4 = ethiopicChronology1.hours();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology1.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology1.yearOfEra();
        java.lang.String str8 = ethiopicChronology1.toString();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology1.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology1.year();
        org.joda.time.DurationField durationField11 = ethiopicChronology1.years();
        org.joda.time.DurationField durationField12 = ethiopicChronology1.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField11", (durationField3.compareTo(durationField11) == 0) == durationField3.equals(durationField11));
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = ethiopicChronology1.getZone();
        java.lang.String str6 = dateTimeZone5.getID();
        int int8 = dateTimeZone5.getStandardOffset((long) (-1));
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime(chronology9);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime10.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime10.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.DateTime dateTime18 = localDateTime16.toDateTime(readableInstant17);
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = null;
        boolean boolean20 = dateTime18.isSupported(dateTimeFieldType19);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime(chronology21);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime22.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime22.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime22.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.DateTime dateTime30 = localDateTime28.toDateTime(readableInstant29);
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = null;
        boolean boolean32 = dateTime30.isSupported(dateTimeFieldType31);
        int int33 = dateTime18.compareTo((org.joda.time.ReadableInstant) dateTime30);
        int int34 = dateTimeZone5.getOffset((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.Instant instant35 = dateTime18.toInstant();
        java.lang.String str36 = dateTime18.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime30 and instant35", (dateTime30.compareTo(instant35) == 0) == dateTime30.equals(instant35));
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) ethiopicChronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(chronology4);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime5.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime5.withYearOfCentury(0);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.weekyear();
        org.joda.time.LocalDateTime localDateTime14 = property12.setCopy((int) (byte) 1);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(chronology15);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime16.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime16.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.DateTime dateTime24 = localDateTime22.toDateTime(readableInstant23);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = null;
        boolean boolean26 = dateTime24.isSupported(dateTimeFieldType25);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime(chronology27);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime28.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime28.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime28.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.DateTime dateTime36 = localDateTime34.toDateTime(readableInstant35);
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = null;
        boolean boolean38 = dateTime36.isSupported(dateTimeFieldType37);
        int int39 = dateTime24.compareTo((org.joda.time.ReadableInstant) dateTime36);
        int int40 = property12.compareTo((org.joda.time.ReadableInstant) dateTime36);
        java.lang.String str41 = dateTime36.toString();
        org.joda.time.Instant instant42 = dateTime36.toInstant();
        org.joda.time.DateTime dateTime43 = localDateTime3.toDateTime((org.joda.time.ReadableInstant) dateTime36);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime24 and instant42", (dateTime24.compareTo(instant42) == 0) == dateTime24.equals(instant42));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology1.centuryOfEra();
        org.joda.time.DurationField durationField4 = ethiopicChronology1.millis();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology1.weekOfWeekyear();
        org.joda.time.DurationField durationField6 = ethiopicChronology1.weekyears();
        org.joda.time.DurationField durationField7 = ethiopicChronology1.halfdays();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology1.hourOfDay();
        org.joda.time.DurationField durationField9 = ethiopicChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField4, and durationField6", !(durationField9.compareTo(durationField4) == 0) || (Math.signum(durationField9.compareTo(durationField6)) == Math.signum(durationField4.compareTo(durationField6))));
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology1.centuryOfEra();
        org.joda.time.DurationField durationField4 = ethiopicChronology1.millis();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology1.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology1.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology1.era();
        org.joda.time.DurationField durationField10 = ethiopicChronology1.eras();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology1.millisOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField4 and durationField10", Math.signum(durationField4.compareTo(durationField10)) == -Math.signum(durationField10.compareTo(durationField4)));
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology1.centuryOfEra();
        org.joda.time.DurationField durationField4 = ethiopicChronology1.millis();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology1.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology1.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology1.era();
        org.joda.time.DurationField durationField10 = ethiopicChronology1.eras();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology1.minuteOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField4 and durationField10", Math.signum(durationField4.compareTo(durationField10)) == -Math.signum(durationField10.compareTo(durationField4)));
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology1.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.Chronology chronology5 = ethiopicChronology1.withZone(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology1.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology1.hourOfHalfday();
        org.joda.time.DurationField durationField9 = ethiopicChronology1.eras();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology1.millisOfSecond();
        org.joda.time.DurationField durationField11 = ethiopicChronology1.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField11, and durationField9", !(durationField9.compareTo(durationField11) == 0) || (Math.signum(durationField9.compareTo(durationField9)) == Math.signum(durationField11.compareTo(durationField9))));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology1.centuryOfEra();
        org.joda.time.DurationField durationField4 = ethiopicChronology1.eras();
        org.joda.time.Chronology chronology5 = ethiopicChronology1.withUTC();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = ethiopicChronology1.add(readablePeriod6, 0L, 1439);
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology1.clockhourOfHalfday();
        org.joda.time.DurationField durationField11 = ethiopicChronology1.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField4, durationField11, and durationField4", !(durationField4.compareTo(durationField11) == 0) || (Math.signum(durationField4.compareTo(durationField4)) == Math.signum(durationField11.compareTo(durationField4))));
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology1.secondOfDay();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology1.secondOfDay();
        org.joda.time.DurationField durationField5 = ethiopicChronology1.weeks();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime7.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime7.withYearOfCentury(0);
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.weekyear();
        org.joda.time.LocalDateTime.Property property15 = localDateTime13.secondOfMinute();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(chronology16);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime17.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime17.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.DateTime dateTime25 = localDateTime23.toDateTime(readableInstant24);
        org.joda.time.LocalDateTime.Property property26 = localDateTime23.millisOfDay();
        org.joda.time.Interval interval27 = property26.toInterval();
        boolean boolean28 = localDateTime13.equals((java.lang.Object) property26);
        int[] intArray30 = ethiopicChronology1.get((org.joda.time.ReadablePartial) localDateTime13, (long) 1439);
        org.joda.time.DateTimeField dateTimeField31 = ethiopicChronology1.millisOfDay();
        org.joda.time.DateTimeField dateTimeField32 = ethiopicChronology1.yearOfEra();
        org.joda.time.DurationField durationField33 = ethiopicChronology1.eras();
        org.joda.time.Chronology chronology34 = ethiopicChronology1.withUTC();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField5 and durationField33", Math.signum(durationField5.compareTo(durationField33)) == -Math.signum(durationField33.compareTo(durationField5)));
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology1.centuryOfEra();
        org.joda.time.DurationField durationField4 = ethiopicChronology1.eras();
        org.joda.time.DurationField durationField5 = ethiopicChronology1.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField4, durationField5, and durationField4", !(durationField4.compareTo(durationField5) == 0) || (Math.signum(durationField4.compareTo(durationField4)) == Math.signum(durationField5.compareTo(durationField4))));
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = ethiopicChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.monthOfYear();
        org.joda.time.DurationField durationField7 = ethiopicChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology1.millisOfSecond();
        org.joda.time.DurationField durationField9 = ethiopicChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology1.hourOfHalfday();
        org.joda.time.DurationField durationField11 = ethiopicChronology1.years();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology1.millisOfSecond();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField11", (durationField3.compareTo(durationField11) == 0) == durationField3.equals(durationField11));
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = ethiopicChronology1.getZone();
        java.lang.String str6 = dateTimeZone5.getID();
        int int8 = dateTimeZone5.getStandardOffset((long) (-1));
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime(chronology9);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime10.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime10.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.DateTime dateTime18 = localDateTime16.toDateTime(readableInstant17);
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = null;
        boolean boolean20 = dateTime18.isSupported(dateTimeFieldType19);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime(chronology21);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime22.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime22.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime22.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.DateTime dateTime30 = localDateTime28.toDateTime(readableInstant29);
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = null;
        boolean boolean32 = dateTime30.isSupported(dateTimeFieldType31);
        int int33 = dateTime18.compareTo((org.joda.time.ReadableInstant) dateTime30);
        int int34 = dateTimeZone5.getOffset((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.Instant instant35 = dateTime18.toInstant();
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime((-36518L));
        org.joda.time.LocalDateTime localDateTime39 = localDateTime37.minusMonths(7);
        org.joda.time.LocalDateTime localDateTime41 = org.joda.time.LocalDateTime.parse("25717721");
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.LocalDateTime localDateTime43 = new org.joda.time.LocalDateTime(chronology42);
        org.joda.time.LocalDateTime localDateTime45 = localDateTime43.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime47 = localDateTime43.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime49 = localDateTime43.plusWeeks((int) (byte) 10);
        int int50 = localDateTime49.getMillisOfSecond();
        int int51 = localDateTime49.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime53 = localDateTime49.plusHours((int) (short) -1);
        org.joda.time.LocalDateTime localDateTime55 = localDateTime49.plusWeeks((int) (short) 100);
        org.joda.time.Chronology chronology56 = null;
        org.joda.time.LocalDateTime localDateTime57 = new org.joda.time.LocalDateTime(chronology56);
        org.joda.time.LocalDateTime localDateTime59 = localDateTime57.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime61 = localDateTime57.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime63 = localDateTime61.withMillisOfSecond((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone64 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology65 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone64);
        org.joda.time.DateTimeField dateTimeField66 = ethiopicChronology65.hourOfDay();
        org.joda.time.DateTimeField dateTimeField67 = ethiopicChronology65.secondOfDay();
        org.joda.time.DurationField durationField68 = dateTimeField67.getLeapDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType69 = dateTimeField67.getType();
        boolean boolean70 = localDateTime63.isSupported(dateTimeFieldType69);
        boolean boolean71 = localDateTime55.isSupported(dateTimeFieldType69);
        boolean boolean72 = localDateTime41.isSupported(dateTimeFieldType69);
        org.joda.time.LocalDateTime.Property property73 = localDateTime37.property(dateTimeFieldType69);
        boolean boolean74 = dateTime18.isSupported(dateTimeFieldType69);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime30 and instant35", (dateTime30.compareTo(instant35) == 0) == dateTime30.equals(instant35));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology1.monthOfYear();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology1.era();
        org.joda.time.DateTimeZone dateTimeZone5 = ethiopicChronology1.getZone();
        long long9 = ethiopicChronology1.add(12626192908800000L, (long) 30, 458);
        org.joda.time.DurationField durationField10 = ethiopicChronology1.eras();
        org.joda.time.DurationField durationField11 = ethiopicChronology1.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField10, durationField11, and durationField10", !(durationField10.compareTo(durationField11) == 0) || (Math.signum(durationField10.compareTo(durationField10)) == Math.signum(durationField11.compareTo(durationField10))));
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = ethiopicChronology1.getZone();
        org.joda.time.Chronology chronology6 = ethiopicChronology1.withUTC();
        org.joda.time.DurationField durationField7 = ethiopicChronology1.minutes();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology1.clockhourOfHalfday();
        org.joda.time.DurationField durationField9 = ethiopicChronology1.centuries();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology1.millisOfDay();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology1.year();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology1.dayOfWeek();
        org.joda.time.DurationField durationField13 = ethiopicChronology1.seconds();
        org.joda.time.DurationField durationField14 = ethiopicChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField14, durationField3, and durationField7", !(durationField14.compareTo(durationField3) == 0) || (Math.signum(durationField14.compareTo(durationField7)) == Math.signum(durationField3.compareTo(durationField7))));
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology1.centuryOfEra();
        org.joda.time.DurationField durationField4 = ethiopicChronology1.millis();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology1.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology1.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology1.era();
        org.joda.time.DurationField durationField10 = ethiopicChronology1.eras();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology1.clockhourOfHalfday();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField4 and durationField10", Math.signum(durationField4.compareTo(durationField10)) == -Math.signum(durationField10.compareTo(durationField4)));
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology1.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.Chronology chronology5 = ethiopicChronology1.withZone(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.millisOfSecond();
        org.joda.time.DurationField durationField7 = ethiopicChronology1.eras();
        org.joda.time.DurationField durationField8 = ethiopicChronology1.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField7, durationField8, and durationField7", !(durationField7.compareTo(durationField8) == 0) || (Math.signum(durationField7.compareTo(durationField7)) == Math.signum(durationField8.compareTo(durationField7))));
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology1.centuryOfEra();
        org.joda.time.DurationField durationField4 = ethiopicChronology1.millis();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology1.weekOfWeekyear();
        org.joda.time.DurationField durationField6 = ethiopicChronology1.weekyears();
        org.joda.time.DurationField durationField7 = ethiopicChronology1.years();
        org.joda.time.DurationField durationField8 = ethiopicChronology1.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField8 and durationField7", (durationField8.compareTo(durationField7) == 0) == durationField8.equals(durationField7));
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology1.centuryOfEra();
        org.joda.time.DurationField durationField4 = ethiopicChronology1.millis();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology1.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.centuryOfEra();
        org.joda.time.DurationField durationField7 = ethiopicChronology1.eras();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology1.hourOfHalfday();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField4 and durationField7", Math.signum(durationField4.compareTo(durationField7)) == -Math.signum(durationField7.compareTo(durationField4)));
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = ethiopicChronology1.getZone();
        org.joda.time.Chronology chronology6 = ethiopicChronology1.withUTC();
        org.joda.time.DurationField durationField7 = ethiopicChronology1.minutes();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology1.clockhourOfHalfday();
        org.joda.time.DurationField durationField9 = ethiopicChronology1.years();
        org.joda.time.DurationField durationField10 = ethiopicChronology1.months();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField9", (durationField3.compareTo(durationField9) == 0) == durationField3.equals(durationField9));
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology2 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology2.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology2.secondOfDay();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology2.secondOfDay();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) 10, (org.joda.time.Chronology) ethiopicChronology2);
        org.joda.time.Chronology chronology7 = ethiopicChronology2.withUTC();
        org.joda.time.DurationField durationField8 = ethiopicChronology2.weekyears();
        org.joda.time.DurationField durationField9 = ethiopicChronology2.eras();
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((org.joda.time.Chronology) ethiopicChronology2);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField8 and durationField9", Math.signum(durationField8.compareTo(durationField9)) == -Math.signum(durationField9.compareTo(durationField8)));
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology2 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology2.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology2.secondOfDay();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology2.secondOfDay();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) 10, (org.joda.time.Chronology) ethiopicChronology2);
        org.joda.time.DurationField durationField7 = ethiopicChronology2.days();
        org.joda.time.DateTimeZone dateTimeZone8 = ethiopicChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology2.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology2.millisOfDay();
        org.joda.time.DurationField durationField11 = ethiopicChronology2.eras();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology2.era();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField7 and durationField11", Math.signum(durationField7.compareTo(durationField11)) == -Math.signum(durationField11.compareTo(durationField7)));
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = ethiopicChronology1.getZone();
        org.joda.time.Chronology chronology6 = ethiopicChronology1.withUTC();
        org.joda.time.DurationField durationField7 = ethiopicChronology1.minutes();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology1.clockhourOfHalfday();
        org.joda.time.DurationField durationField9 = ethiopicChronology1.years();
        org.joda.time.DurationField durationField10 = ethiopicChronology1.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField9", (durationField3.compareTo(durationField9) == 0) == durationField3.equals(durationField9));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = ethiopicChronology1.getZone();
        org.joda.time.DurationField durationField6 = ethiopicChronology1.centuries();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology1.secondOfMinute();
        org.joda.time.DurationField durationField9 = ethiopicChronology1.weeks();
        org.joda.time.DurationField durationField10 = ethiopicChronology1.minutes();
        org.joda.time.DurationField durationField11 = ethiopicChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField11, durationField3, and durationField6", !(durationField11.compareTo(durationField3) == 0) || (Math.signum(durationField11.compareTo(durationField6)) == Math.signum(durationField3.compareTo(durationField6))));
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology1.centuryOfEra();
        org.joda.time.DurationField durationField4 = ethiopicChronology1.millis();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology1.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology1.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology1.era();
        org.joda.time.DurationField durationField10 = ethiopicChronology1.eras();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology1.hourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField4 and durationField10", Math.signum(durationField4.compareTo(durationField10)) == -Math.signum(durationField10.compareTo(durationField4)));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DurationField durationField4 = ethiopicChronology1.hours();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology1.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology1.monthOfYear();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology1.yearOfEra();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology1.weekOfWeekyear();
        org.joda.time.DurationField durationField11 = ethiopicChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField11, durationField3, and durationField4", !(durationField11.compareTo(durationField3) == 0) || (Math.signum(durationField11.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology1.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.Chronology chronology5 = ethiopicChronology1.withZone(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology1.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology1.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology1.weekOfWeekyear();
        org.joda.time.DurationField durationField10 = ethiopicChronology1.seconds();
        java.lang.String str11 = ethiopicChronology1.toString();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology13 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone12);
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology13.hourOfDay();
        org.joda.time.DateTimeField dateTimeField15 = ethiopicChronology13.centuryOfEra();
        org.joda.time.DurationField durationField16 = ethiopicChronology13.millis();
        org.joda.time.DurationField durationField17 = ethiopicChronology13.months();
        org.joda.time.DateTimeField dateTimeField18 = ethiopicChronology13.minuteOfDay();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime(chronology19);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime20.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime20.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime20.withYearOfEra(10);
        int[] intArray28 = ethiopicChronology13.get((org.joda.time.ReadablePartial) localDateTime20, (long) 458);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime20.withMillisOfDay(122);
        long long32 = ethiopicChronology1.set((org.joda.time.ReadablePartial) localDateTime30, 694310400009L);
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forOffsetMillis(30);
        org.joda.time.Chronology chronology35 = ethiopicChronology1.withZone(dateTimeZone34);
        org.joda.time.DurationField durationField36 = ethiopicChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField36, durationField10, and durationField16", !(durationField36.compareTo(durationField10) == 0) || (Math.signum(durationField36.compareTo(durationField16)) == Math.signum(durationField10.compareTo(durationField16))));
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology1.secondOfDay();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology1.secondOfDay();
        org.joda.time.DurationField durationField5 = ethiopicChronology1.weeks();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime7.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime7.withYearOfCentury(0);
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.weekyear();
        org.joda.time.LocalDateTime.Property property15 = localDateTime13.secondOfMinute();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(chronology16);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime17.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime17.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.DateTime dateTime25 = localDateTime23.toDateTime(readableInstant24);
        org.joda.time.LocalDateTime.Property property26 = localDateTime23.millisOfDay();
        org.joda.time.Interval interval27 = property26.toInterval();
        boolean boolean28 = localDateTime13.equals((java.lang.Object) property26);
        int[] intArray30 = ethiopicChronology1.get((org.joda.time.ReadablePartial) localDateTime13, (long) 1439);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime(chronology31);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray33 = localDateTime32.getFieldTypes();
        org.joda.time.LocalDateTime localDateTime35 = localDateTime32.withMillisOfDay((int) (byte) 0);
        boolean boolean36 = localDateTime13.isBefore((org.joda.time.ReadablePartial) localDateTime32);
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 100);
        long long42 = dateTimeZone39.adjustOffset((-31449599999L), false);
        org.joda.time.LocalDateTime localDateTime43 = new org.joda.time.LocalDateTime((long) 123, dateTimeZone39);
        org.joda.time.DateTime dateTime44 = localDateTime13.toDateTime(dateTimeZone39);
        org.joda.time.Instant instant45 = dateTime44.toInstant();
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.LocalDateTime localDateTime47 = new org.joda.time.LocalDateTime(chronology46);
        org.joda.time.LocalDateTime localDateTime49 = localDateTime47.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime51 = localDateTime47.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime53 = localDateTime47.plusWeeks((int) (byte) 10);
        int int54 = localDateTime53.getMillisOfSecond();
        int int55 = localDateTime53.getMillisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone56 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology57 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone56);
        org.joda.time.DateTimeField dateTimeField58 = ethiopicChronology57.clockhourOfDay();
        org.joda.time.DurationField durationField59 = ethiopicChronology57.weekyears();
        org.joda.time.DateTimeField dateTimeField60 = ethiopicChronology57.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone61 = ethiopicChronology57.getZone();
        org.joda.time.Chronology chronology62 = ethiopicChronology57.withUTC();
        org.joda.time.DurationField durationField63 = ethiopicChronology57.minutes();
        org.joda.time.DateTimeField dateTimeField64 = ethiopicChronology57.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField65 = ethiopicChronology57.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField66 = ethiopicChronology57.clockhourOfDay();
        boolean boolean67 = localDateTime53.equals((java.lang.Object) dateTimeField66);
        org.joda.time.LocalDateTime localDateTime69 = localDateTime53.plusMonths(0);
        org.joda.time.Chronology chronology70 = null;
        org.joda.time.LocalDateTime localDateTime71 = new org.joda.time.LocalDateTime(chronology70);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray72 = localDateTime71.getFieldTypes();
        org.joda.time.LocalDateTime localDateTime74 = localDateTime71.minusMonths(980);
        org.joda.time.ReadableInstant readableInstant75 = null;
        org.joda.time.DateTime dateTime76 = localDateTime71.toDateTime(readableInstant75);
        long long77 = dateTime76.getMillis();
        org.joda.time.DateTime dateTime78 = localDateTime69.toDateTime((org.joda.time.ReadableInstant) dateTime76);
        org.joda.time.Chronology chronology79 = dateTime76.getChronology();
        boolean boolean80 = dateTime44.isAfter((org.joda.time.ReadableInstant) dateTime76);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime25 and instant45", (dateTime25.compareTo(instant45) == 0) == dateTime25.equals(instant45));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DurationField durationField4 = ethiopicChronology1.centuries();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology1.weekyear();
        org.joda.time.DurationField durationField6 = ethiopicChronology1.halfdays();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology1.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology1.secondOfDay();
        org.joda.time.DurationField durationField9 = ethiopicChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField3, and durationField4", !(durationField9.compareTo(durationField3) == 0) || (Math.signum(durationField9.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DurationField durationField4 = ethiopicChronology1.centuries();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology1.weekyear();
        org.joda.time.DurationField durationField6 = ethiopicChronology1.halfdays();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology1.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology1.era();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology1.year();
        org.joda.time.DurationField durationField10 = ethiopicChronology1.centuries();
        org.joda.time.DurationField durationField11 = ethiopicChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField11, durationField3, and durationField4", !(durationField11.compareTo(durationField3) == 0) || (Math.signum(durationField11.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology2 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology2.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology2.secondOfDay();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology2.secondOfDay();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) 10, (org.joda.time.Chronology) ethiopicChronology2);
        org.joda.time.DurationField durationField7 = ethiopicChronology2.days();
        org.joda.time.DateTimeZone dateTimeZone8 = ethiopicChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology2.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology2.millisOfDay();
        org.joda.time.DurationField durationField11 = ethiopicChronology2.eras();
        org.joda.time.DurationField durationField12 = ethiopicChronology2.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField7 and durationField11", Math.signum(durationField7.compareTo(durationField11)) == -Math.signum(durationField11.compareTo(durationField7)));
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology1.secondOfDay();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology1.secondOfDay();
        org.joda.time.DurationField durationField5 = ethiopicChronology1.weeks();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime7.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime7.withYearOfCentury(0);
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.weekyear();
        org.joda.time.LocalDateTime.Property property15 = localDateTime13.secondOfMinute();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(chronology16);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime17.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime17.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.DateTime dateTime25 = localDateTime23.toDateTime(readableInstant24);
        org.joda.time.LocalDateTime.Property property26 = localDateTime23.millisOfDay();
        org.joda.time.Interval interval27 = property26.toInterval();
        boolean boolean28 = localDateTime13.equals((java.lang.Object) property26);
        int[] intArray30 = ethiopicChronology1.get((org.joda.time.ReadablePartial) localDateTime13, (long) 1439);
        org.joda.time.DateTimeField dateTimeField31 = ethiopicChronology1.millisOfDay();
        org.joda.time.DateTimeField dateTimeField32 = ethiopicChronology1.yearOfEra();
        org.joda.time.DurationField durationField33 = ethiopicChronology1.eras();
        org.joda.time.DateTimeField dateTimeField34 = ethiopicChronology1.dayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField5 and durationField33", Math.signum(durationField5.compareTo(durationField33)) == -Math.signum(durationField33.compareTo(durationField5)));
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology1.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.Chronology chronology5 = ethiopicChronology1.withZone(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.millisOfSecond();
        org.joda.time.DurationField durationField7 = ethiopicChronology1.eras();
        org.joda.time.Chronology chronology8 = ethiopicChronology1.withUTC();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology1.millisOfDay();
        org.joda.time.DurationField durationField10 = ethiopicChronology1.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField7, durationField10, and durationField7", !(durationField7.compareTo(durationField10) == 0) || (Math.signum(durationField7.compareTo(durationField7)) == Math.signum(durationField10.compareTo(durationField7))));
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = ethiopicChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology1.halfdayOfDay();
        org.joda.time.DurationField durationField8 = ethiopicChronology1.years();
        org.joda.time.DurationField durationField9 = ethiopicChronology1.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField8", (durationField3.compareTo(durationField8) == 0) == durationField3.equals(durationField8));
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology1.secondOfDay();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology1.secondOfDay();
        org.joda.time.DurationField durationField5 = ethiopicChronology1.weeks();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime7.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime7.withYearOfCentury(0);
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.weekyear();
        org.joda.time.LocalDateTime.Property property15 = localDateTime13.secondOfMinute();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(chronology16);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime17.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime17.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.DateTime dateTime25 = localDateTime23.toDateTime(readableInstant24);
        org.joda.time.LocalDateTime.Property property26 = localDateTime23.millisOfDay();
        org.joda.time.Interval interval27 = property26.toInterval();
        boolean boolean28 = localDateTime13.equals((java.lang.Object) property26);
        int[] intArray30 = ethiopicChronology1.get((org.joda.time.ReadablePartial) localDateTime13, (long) 1439);
        org.joda.time.DateTimeField dateTimeField31 = ethiopicChronology1.millisOfDay();
        org.joda.time.DateTimeField dateTimeField32 = ethiopicChronology1.yearOfEra();
        org.joda.time.DurationField durationField33 = ethiopicChronology1.eras();
        org.joda.time.Chronology chronology34 = ethiopicChronology1.withUTC();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField5 and durationField33", Math.signum(durationField5.compareTo(durationField33)) == -Math.signum(durationField33.compareTo(durationField5)));
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DurationField durationField4 = ethiopicChronology1.centuries();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology1.weekyear();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.yearOfEra();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology1.weekyear();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology1.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology1.hourOfDay();
        org.joda.time.DurationField durationField10 = ethiopicChronology1.years();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology1.halfdayOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField10", (durationField3.compareTo(durationField10) == 0) == durationField3.equals(durationField10));
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DurationField durationField4 = ethiopicChronology1.centuries();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology1.weekyear();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.yearOfEra();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology1.weekyear();
        org.joda.time.DurationField durationField8 = ethiopicChronology1.millis();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology1.dayOfYear();
        org.joda.time.DurationField durationField11 = ethiopicChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology1.halfdayOfDay();
        org.joda.time.DurationField durationField13 = ethiopicChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField13, durationField3, and durationField4", !(durationField13.compareTo(durationField3) == 0) || (Math.signum(durationField13.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology2 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology2.clockhourOfDay();
        org.joda.time.DurationField durationField4 = ethiopicChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology2.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone6 = ethiopicChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology2.monthOfYear();
        org.joda.time.DurationField durationField8 = ethiopicChronology2.seconds();
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(obj0, (org.joda.time.Chronology) ethiopicChronology2);
        org.joda.time.DurationField durationField10 = ethiopicChronology2.days();
        org.joda.time.DurationField durationField11 = ethiopicChronology2.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField11, durationField4, and durationField8", !(durationField11.compareTo(durationField4) == 0) || (Math.signum(durationField11.compareTo(durationField8)) == Math.signum(durationField4.compareTo(durationField8))));
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 100);
        long long4 = dateTimeZone1.adjustOffset((-31449599999L), false);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 10);
        long long8 = dateTimeZone1.getMillisKeepLocal(dateTimeZone6, (long) 'a');
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology10 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology10.clockhourOfDay();
        org.joda.time.DurationField durationField12 = ethiopicChronology10.weekyears();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology10.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone14 = ethiopicChronology10.getZone();
        java.lang.String str15 = dateTimeZone14.getID();
        int int17 = dateTimeZone14.getStandardOffset((long) (-1));
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime(chronology18);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime19.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime19.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.DateTime dateTime27 = localDateTime25.toDateTime(readableInstant26);
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = null;
        boolean boolean29 = dateTime27.isSupported(dateTimeFieldType28);
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime(chronology30);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime31.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime35 = localDateTime31.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime37 = localDateTime31.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant38 = null;
        org.joda.time.DateTime dateTime39 = localDateTime37.toDateTime(readableInstant38);
        org.joda.time.DateTimeFieldType dateTimeFieldType40 = null;
        boolean boolean41 = dateTime39.isSupported(dateTimeFieldType40);
        int int42 = dateTime27.compareTo((org.joda.time.ReadableInstant) dateTime39);
        int int43 = dateTimeZone14.getOffset((org.joda.time.ReadableInstant) dateTime27);
        org.joda.time.Instant instant44 = dateTime27.toInstant();
        int int45 = dateTimeZone1.getOffset((org.joda.time.ReadableInstant) instant44);
        java.util.Locale.Category category46 = java.util.Locale.Category.DISPLAY;
        boolean boolean47 = instant44.equals((java.lang.Object) category46);
        java.util.Locale locale48 = java.util.Locale.getDefault(category46);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime27 and instant44", (dateTime27.compareTo(instant44) == 0) == dateTime27.equals(instant44));
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = ethiopicChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.monthOfYear();
        org.joda.time.DurationField durationField7 = ethiopicChronology1.seconds();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology9 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone8);
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology9.clockhourOfDay();
        org.joda.time.DurationField durationField11 = ethiopicChronology9.weekyears();
        org.joda.time.DurationField durationField12 = ethiopicChronology9.hours();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology9.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology9.hourOfDay();
        org.joda.time.DateTimeField dateTimeField15 = ethiopicChronology9.yearOfEra();
        org.joda.time.DurationField durationField16 = ethiopicChronology9.weekyears();
        org.joda.time.DateTimeField dateTimeField17 = ethiopicChronology9.dayOfYear();
        org.joda.time.DurationField durationField18 = ethiopicChronology9.hours();
        boolean boolean19 = ethiopicChronology1.equals((java.lang.Object) durationField18);
        org.joda.time.DateTimeField dateTimeField20 = ethiopicChronology1.dayOfWeek();
        org.joda.time.DurationField durationField21 = ethiopicChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField21, durationField3, and durationField7", !(durationField21.compareTo(durationField3) == 0) || (Math.signum(durationField21.compareTo(durationField7)) == Math.signum(durationField3.compareTo(durationField7))));
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(548);
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime(chronology2);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime3.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime3.plusWeeks((int) (byte) 10);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(chronology10);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime11.withMillisOfSecond((int) (byte) 1);
        int int16 = localDateTime3.compareTo((org.joda.time.ReadablePartial) localDateTime11);
        org.joda.time.LocalDateTime.Property property17 = localDateTime11.weekyear();
        org.joda.time.LocalDateTime.Property property18 = localDateTime11.millisOfDay();
        org.joda.time.LocalDateTime.Property property19 = localDateTime11.dayOfWeek();
        boolean boolean20 = dateTimeZone1.isLocalDateTimeGap(localDateTime11);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 100);
        long long25 = dateTimeZone22.adjustOffset((-31449599999L), false);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 10);
        long long29 = dateTimeZone22.getMillisKeepLocal(dateTimeZone27, (long) 'a');
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology31 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone30);
        org.joda.time.DateTimeField dateTimeField32 = ethiopicChronology31.clockhourOfDay();
        org.joda.time.DurationField durationField33 = ethiopicChronology31.weekyears();
        org.joda.time.DateTimeField dateTimeField34 = ethiopicChronology31.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone35 = ethiopicChronology31.getZone();
        java.lang.String str36 = dateTimeZone35.getID();
        int int38 = dateTimeZone35.getStandardOffset((long) (-1));
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.LocalDateTime localDateTime40 = new org.joda.time.LocalDateTime(chronology39);
        org.joda.time.LocalDateTime localDateTime42 = localDateTime40.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime44 = localDateTime40.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime46 = localDateTime40.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.DateTime dateTime48 = localDateTime46.toDateTime(readableInstant47);
        org.joda.time.DateTimeFieldType dateTimeFieldType49 = null;
        boolean boolean50 = dateTime48.isSupported(dateTimeFieldType49);
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.LocalDateTime localDateTime52 = new org.joda.time.LocalDateTime(chronology51);
        org.joda.time.LocalDateTime localDateTime54 = localDateTime52.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime56 = localDateTime52.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime58 = localDateTime52.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant59 = null;
        org.joda.time.DateTime dateTime60 = localDateTime58.toDateTime(readableInstant59);
        org.joda.time.DateTimeFieldType dateTimeFieldType61 = null;
        boolean boolean62 = dateTime60.isSupported(dateTimeFieldType61);
        int int63 = dateTime48.compareTo((org.joda.time.ReadableInstant) dateTime60);
        int int64 = dateTimeZone35.getOffset((org.joda.time.ReadableInstant) dateTime48);
        org.joda.time.Instant instant65 = dateTime48.toInstant();
        int int66 = dateTimeZone22.getOffset((org.joda.time.ReadableInstant) instant65);
        org.joda.time.DateTime dateTime67 = localDateTime11.toDateTime((org.joda.time.ReadableInstant) instant65);
        long long68 = dateTime67.getMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime48 and instant65", (dateTime48.compareTo(instant65) == 0) == dateTime48.equals(instant65));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology2 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology2.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology2.secondOfDay();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology2.secondOfDay();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) 10, (org.joda.time.Chronology) ethiopicChronology2);
        org.joda.time.DurationField durationField7 = ethiopicChronology2.days();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology2.secondOfDay();
        boolean boolean10 = ethiopicChronology2.equals((java.lang.Object) "24");
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology2.weekyearOfCentury();
        org.joda.time.DurationField durationField12 = ethiopicChronology2.years();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology2.yearOfEra();
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology2.weekyearOfCentury();
        org.joda.time.DurationField durationField15 = ethiopicChronology2.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField15, durationField7, and durationField12", !(durationField15.compareTo(durationField7) == 0) || (Math.signum(durationField15.compareTo(durationField12)) == Math.signum(durationField7.compareTo(durationField12))));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = ethiopicChronology1.getZone();
        org.joda.time.DurationField durationField6 = ethiopicChronology1.centuries();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology1.year();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime(chronology9);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime10.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.withMillisOfSecond((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.minusMonths(263);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime16.minusHours((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology23 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone22);
        org.joda.time.DateTimeField dateTimeField24 = ethiopicChronology23.hourOfDay();
        org.joda.time.DateTimeField dateTimeField25 = ethiopicChronology23.secondOfDay();
        org.joda.time.DateTimeField dateTimeField26 = ethiopicChronology23.secondOfDay();
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime((long) 10, (org.joda.time.Chronology) ethiopicChronology23);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.withDayOfYear((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology31 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone30);
        org.joda.time.DateTimeField dateTimeField32 = ethiopicChronology31.hourOfDay();
        org.joda.time.DateTimeField dateTimeField33 = ethiopicChronology31.secondOfDay();
        org.joda.time.DateTimeField dateTimeField34 = ethiopicChronology31.secondOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType35 = dateTimeField34.getType();
        int int36 = localDateTime27.get(dateTimeFieldType35);
        int int37 = localDateTime16.get(dateTimeFieldType35);
        org.joda.time.LocalDateTime localDateTime39 = localDateTime16.minusMonths(359999999);
        java.util.Locale locale41 = java.util.Locale.GERMANY;
        java.lang.String str42 = locale41.getScript();
        java.lang.String str43 = locale41.getScript();
        java.lang.String str44 = dateTimeField8.getAsShortText((org.joda.time.ReadablePartial) localDateTime16, 465, locale41);
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology47 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone46);
        org.joda.time.DateTimeField dateTimeField48 = ethiopicChronology47.hourOfDay();
        org.joda.time.DateTimeField dateTimeField49 = ethiopicChronology47.secondOfDay();
        org.joda.time.DateTimeField dateTimeField50 = ethiopicChronology47.secondOfDay();
        org.joda.time.LocalDateTime localDateTime51 = new org.joda.time.LocalDateTime((long) 10, (org.joda.time.Chronology) ethiopicChronology47);
        org.joda.time.DurationField durationField52 = ethiopicChronology47.eras();
        org.joda.time.DurationField durationField53 = ethiopicChronology47.eras();
        org.joda.time.DateTimeField dateTimeField54 = ethiopicChronology47.monthOfYear();
        org.joda.time.DateTimeField dateTimeField55 = ethiopicChronology47.clockhourOfDay();
        boolean boolean56 = localDateTime16.equals((java.lang.Object) ethiopicChronology47);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField52", Math.signum(durationField3.compareTo(durationField52)) == -Math.signum(durationField52.compareTo(durationField3)));
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.DateTime dateTime9 = localDateTime7.toDateTime(readableInstant8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime7.withSecondOfMinute((int) (short) 0);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.minus(readablePeriod12);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalDateTime localDateTime16 = localDateTime13.withPeriodAdded(readablePeriod14, (int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 100);
        long long21 = dateTimeZone18.adjustOffset((-31449599999L), false);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 10);
        long long25 = dateTimeZone18.getMillisKeepLocal(dateTimeZone23, (long) 'a');
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology27 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone26);
        org.joda.time.DateTimeField dateTimeField28 = ethiopicChronology27.clockhourOfDay();
        org.joda.time.DurationField durationField29 = ethiopicChronology27.weekyears();
        org.joda.time.DateTimeField dateTimeField30 = ethiopicChronology27.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone31 = ethiopicChronology27.getZone();
        java.lang.String str32 = dateTimeZone31.getID();
        int int34 = dateTimeZone31.getStandardOffset((long) (-1));
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.LocalDateTime localDateTime36 = new org.joda.time.LocalDateTime(chronology35);
        org.joda.time.LocalDateTime localDateTime38 = localDateTime36.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime40 = localDateTime36.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime42 = localDateTime36.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant43 = null;
        org.joda.time.DateTime dateTime44 = localDateTime42.toDateTime(readableInstant43);
        org.joda.time.DateTimeFieldType dateTimeFieldType45 = null;
        boolean boolean46 = dateTime44.isSupported(dateTimeFieldType45);
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.LocalDateTime localDateTime48 = new org.joda.time.LocalDateTime(chronology47);
        org.joda.time.LocalDateTime localDateTime50 = localDateTime48.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime52 = localDateTime48.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime54 = localDateTime48.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant55 = null;
        org.joda.time.DateTime dateTime56 = localDateTime54.toDateTime(readableInstant55);
        org.joda.time.DateTimeFieldType dateTimeFieldType57 = null;
        boolean boolean58 = dateTime56.isSupported(dateTimeFieldType57);
        int int59 = dateTime44.compareTo((org.joda.time.ReadableInstant) dateTime56);
        int int60 = dateTimeZone31.getOffset((org.joda.time.ReadableInstant) dateTime44);
        org.joda.time.Instant instant61 = dateTime44.toInstant();
        int int62 = dateTimeZone18.getOffset((org.joda.time.ReadableInstant) instant61);
        java.util.Locale.Category category63 = java.util.Locale.Category.DISPLAY;
        boolean boolean64 = instant61.equals((java.lang.Object) category63);
        org.joda.time.DateTime dateTime65 = localDateTime13.toDateTime((org.joda.time.ReadableInstant) instant61);
        java.util.TimeZone timeZone66 = null;
        org.joda.time.DateTimeZone dateTimeZone67 = org.joda.time.DateTimeZone.forTimeZone(timeZone66);
        java.lang.String str69 = dateTimeZone67.getNameKey((long) (byte) 0);
        org.joda.time.LocalDateTime localDateTime70 = org.joda.time.LocalDateTime.now(dateTimeZone67);
        java.lang.String str71 = dateTimeZone67.getID();
        org.joda.time.LocalDateTime localDateTime72 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime65, dateTimeZone67);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and instant61", (dateTime9.compareTo(instant61) == 0) == dateTime9.equals(instant61));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology1.centuryOfEra();
        org.joda.time.DurationField durationField4 = ethiopicChronology1.eras();
        org.joda.time.Chronology chronology5 = ethiopicChronology1.withUTC();
        long long9 = ethiopicChronology1.add((-61379337599980L), (long) 475, 115);
        org.joda.time.DurationField durationField10 = ethiopicChronology1.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField4, durationField10, and durationField4", !(durationField4.compareTo(durationField10) == 0) || (Math.signum(durationField4.compareTo(durationField4)) == Math.signum(durationField10.compareTo(durationField4))));
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = ethiopicChronology1.getZone();
        org.joda.time.Chronology chronology6 = ethiopicChronology1.withUTC();
        org.joda.time.DurationField durationField7 = ethiopicChronology1.days();
        org.joda.time.DurationField durationField8 = ethiopicChronology1.hours();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology1.weekyear();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology1.millisOfDay();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology1.secondOfDay();
        org.joda.time.DurationField durationField12 = ethiopicChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField12, durationField3, and durationField7", !(durationField12.compareTo(durationField3) == 0) || (Math.signum(durationField12.compareTo(durationField7)) == Math.signum(durationField3.compareTo(durationField7))));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology1.centuryOfEra();
        org.joda.time.DurationField durationField4 = ethiopicChronology1.eras();
        org.joda.time.Chronology chronology5 = ethiopicChronology1.withUTC();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = ethiopicChronology1.add(readablePeriod6, 0L, 1439);
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology1.clockhourOfHalfday();
        org.joda.time.DurationField durationField11 = ethiopicChronology1.years();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField4, durationField11, and durationField4", !(durationField4.compareTo(durationField11) == 0) || (Math.signum(durationField4.compareTo(durationField4)) == Math.signum(durationField11.compareTo(durationField4))));
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology2 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology2.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology2.secondOfDay();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology2.secondOfDay();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) 10, (org.joda.time.Chronology) ethiopicChronology2);
        org.joda.time.DurationField durationField7 = ethiopicChronology2.days();
        org.joda.time.DateTimeZone dateTimeZone8 = ethiopicChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology2.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology2.millisOfDay();
        org.joda.time.DurationField durationField11 = ethiopicChronology2.eras();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology2.year();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField7 and durationField11", Math.signum(durationField7.compareTo(durationField11)) == -Math.signum(durationField11.compareTo(durationField7)));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        long long6 = ethiopicChronology1.add((long) '#', (long) 'a', (int) '#');
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology1.hourOfHalfday();
        long long11 = ethiopicChronology1.add(53L, 0L, 346);
        org.joda.time.DurationField durationField12 = ethiopicChronology1.eras();
        org.joda.time.DurationField durationField13 = ethiopicChronology1.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField12, durationField13, and durationField12", !(durationField12.compareTo(durationField13) == 0) || (Math.signum(durationField12.compareTo(durationField12)) == Math.signum(durationField13.compareTo(durationField12))));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology1.secondOfDay();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology1.secondOfDay();
        org.joda.time.DurationField durationField5 = ethiopicChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.clockhourOfHalfday();
        org.joda.time.DurationField durationField7 = ethiopicChronology1.weeks();
        org.joda.time.DurationField durationField8 = ethiopicChronology1.years();
        org.joda.time.DurationField durationField9 = ethiopicChronology1.weekyears();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(chronology10);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime11.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.withMillisOfSecond((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime15.withMinuteOfHour(10);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.plusMonths(272);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime19.withMillisOfDay((int) (byte) 100);
        org.joda.time.ReadableDuration readableDuration24 = null;
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.minus(readableDuration24);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime25.withSecondOfMinute(32);
        long long29 = ethiopicChronology1.set((org.joda.time.ReadablePartial) localDateTime27, (long) 131);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField8 and durationField9", (durationField8.compareTo(durationField9) == 0) == durationField8.equals(durationField9));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DurationField durationField4 = ethiopicChronology1.hours();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology1.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology1.yearOfEra();
        java.lang.String str8 = ethiopicChronology1.toString();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology1.year();
        org.joda.time.DurationField durationField10 = ethiopicChronology1.years();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology1.weekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField10", (durationField3.compareTo(durationField10) == 0) == durationField3.equals(durationField10));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = ethiopicChronology1.getZone();
        org.joda.time.Chronology chronology6 = ethiopicChronology1.withUTC();
        org.joda.time.DurationField durationField7 = ethiopicChronology1.days();
        org.joda.time.DurationField durationField8 = ethiopicChronology1.hours();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology1.weekyear();
        org.joda.time.DurationField durationField10 = ethiopicChronology1.years();
        org.joda.time.DurationField durationField11 = ethiopicChronology1.months();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField10", (durationField3.compareTo(durationField10) == 0) == durationField3.equals(durationField10));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DurationField durationField4 = ethiopicChronology1.centuries();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology1.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.weekyear();
        java.lang.String str7 = ethiopicChronology1.toString();
        org.joda.time.DateTimeZone dateTimeZone8 = ethiopicChronology1.getZone();
        org.joda.time.DurationField durationField9 = ethiopicChronology1.years();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology1.secondOfMinute();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField9", (durationField3.compareTo(durationField9) == 0) == durationField3.equals(durationField9));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DurationField durationField4 = ethiopicChronology1.hours();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology1.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology1.yearOfEra();
        long long10 = dateTimeField7.add(100L, (int) (byte) 0);
        org.joda.time.DurationField durationField11 = dateTimeField7.getDurationField();
        long long13 = dateTimeField7.roundHalfEven(1645513824537L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField11", (durationField3.compareTo(durationField11) == 0) == durationField3.equals(durationField11));
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DurationField durationField4 = ethiopicChronology1.centuries();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology1.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.dayOfYear();
        java.lang.String str7 = ethiopicChronology1.toString();
        org.joda.time.DurationField durationField8 = ethiopicChronology1.months();
        org.joda.time.DurationField durationField9 = ethiopicChronology1.years();
        org.joda.time.LocalDateTime localDateTime10 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) ethiopicChronology1);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField9", (durationField3.compareTo(durationField9) == 0) == durationField3.equals(durationField9));
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = ethiopicChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.monthOfYear();
        org.joda.time.DurationField durationField7 = ethiopicChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology1.year();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology1.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology1.weekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        long long14 = ethiopicChronology1.add(readablePeriod11, (long) '#', 515);
        org.joda.time.DurationField durationField15 = ethiopicChronology1.months();
        org.joda.time.DateTimeField dateTimeField16 = ethiopicChronology1.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology20 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone19);
        org.joda.time.DateTimeField dateTimeField21 = ethiopicChronology20.hourOfDay();
        org.joda.time.DateTimeField dateTimeField22 = ethiopicChronology20.secondOfDay();
        org.joda.time.DateTimeField dateTimeField23 = ethiopicChronology20.secondOfDay();
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime((long) 10, (org.joda.time.Chronology) ethiopicChronology20);
        org.joda.time.DurationField durationField25 = ethiopicChronology20.eras();
        org.joda.time.DurationField durationField26 = ethiopicChronology20.eras();
        org.joda.time.DateTimeField dateTimeField27 = ethiopicChronology20.monthOfYear();
        org.joda.time.DateTimeField dateTimeField28 = ethiopicChronology20.clockhourOfDay();
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime(chronology29);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime30.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime30.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime30.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.DateTime dateTime38 = localDateTime36.toDateTime(readableInstant37);
        org.joda.time.LocalDateTime.Property property39 = localDateTime36.millisOfDay();
        org.joda.time.LocalDateTime localDateTime41 = localDateTime36.plusHours(13);
        java.lang.String str42 = localDateTime36.toString();
        org.joda.time.LocalDateTime localDateTime43 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime36);
        org.joda.time.LocalDateTime localDateTime45 = localDateTime36.minusMillis(496);
        java.util.Locale locale47 = java.util.Locale.GERMANY;
        boolean boolean48 = locale47.hasExtensions();
        java.lang.String str49 = locale47.getLanguage();
        java.util.Locale locale50 = locale47.stripExtensions();
        java.lang.String str51 = dateTimeField28.getAsText((org.joda.time.ReadablePartial) localDateTime45, 489, locale47);
        java.lang.String str52 = dateTimeField16.getAsShortText(0, locale47);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField25", Math.signum(durationField3.compareTo(durationField25)) == -Math.signum(durationField25.compareTo(durationField3)));
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DurationField durationField4 = ethiopicChronology1.hours();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology1.dayOfMonth();
        org.joda.time.DurationField durationField6 = ethiopicChronology1.months();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(chronology7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime8.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime8.plusWeeks((int) (byte) 10);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(chronology15);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime16.withMillisOfSecond((int) (byte) 1);
        int int21 = localDateTime8.compareTo((org.joda.time.ReadablePartial) localDateTime16);
        org.joda.time.LocalDateTime.Property property22 = localDateTime16.weekyear();
        int[] intArray24 = ethiopicChronology1.get((org.joda.time.ReadablePartial) localDateTime16, 0L);
        org.joda.time.DurationField durationField25 = ethiopicChronology1.days();
        org.joda.time.Chronology chronology26 = ethiopicChronology1.withUTC();
        org.joda.time.DurationField durationField27 = ethiopicChronology1.years();
        org.joda.time.DateTimeField dateTimeField28 = ethiopicChronology1.era();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField27", (durationField3.compareTo(durationField27) == 0) == durationField3.equals(durationField27));
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 100);
        long long4 = dateTimeZone1.adjustOffset((-31449599999L), false);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 10);
        long long8 = dateTimeZone1.getMillisKeepLocal(dateTimeZone6, (long) 'a');
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology10 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology10.clockhourOfDay();
        org.joda.time.DurationField durationField12 = ethiopicChronology10.weekyears();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology10.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone14 = ethiopicChronology10.getZone();
        java.lang.String str15 = dateTimeZone14.getID();
        int int17 = dateTimeZone14.getStandardOffset((long) (-1));
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime(chronology18);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime19.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime19.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.DateTime dateTime27 = localDateTime25.toDateTime(readableInstant26);
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = null;
        boolean boolean29 = dateTime27.isSupported(dateTimeFieldType28);
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime(chronology30);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime31.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime35 = localDateTime31.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime37 = localDateTime31.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant38 = null;
        org.joda.time.DateTime dateTime39 = localDateTime37.toDateTime(readableInstant38);
        org.joda.time.DateTimeFieldType dateTimeFieldType40 = null;
        boolean boolean41 = dateTime39.isSupported(dateTimeFieldType40);
        int int42 = dateTime27.compareTo((org.joda.time.ReadableInstant) dateTime39);
        int int43 = dateTimeZone14.getOffset((org.joda.time.ReadableInstant) dateTime27);
        org.joda.time.Instant instant44 = dateTime27.toInstant();
        int int45 = dateTimeZone1.getOffset((org.joda.time.ReadableInstant) instant44);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime27 and instant44", (dateTime27.compareTo(instant44) == 0) == dateTime27.equals(instant44));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology1.centuryOfEra();
        org.joda.time.DurationField durationField4 = ethiopicChronology1.eras();
        org.joda.time.Chronology chronology5 = ethiopicChronology1.withUTC();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = ethiopicChronology1.add(readablePeriod6, 0L, 1439);
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology1.clockhourOfHalfday();
        org.joda.time.DurationField durationField11 = ethiopicChronology1.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField4, durationField11, and durationField4", !(durationField4.compareTo(durationField11) == 0) || (Math.signum(durationField4.compareTo(durationField4)) == Math.signum(durationField11.compareTo(durationField4))));
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 10);
        java.lang.String str8 = dateTimeZone6.getShortName((long) 1);
        org.joda.time.Chronology chronology9 = ethiopicChronology1.withZone(dateTimeZone6);
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology1.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology1.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology1.year();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology14 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone13);
        org.joda.time.DateTimeField dateTimeField15 = ethiopicChronology14.hourOfDay();
        org.joda.time.DateTimeField dateTimeField16 = ethiopicChronology14.secondOfDay();
        org.joda.time.DateTimeField dateTimeField17 = ethiopicChronology14.secondOfDay();
        org.joda.time.DurationField durationField18 = ethiopicChronology14.weeks();
        org.joda.time.DateTimeField dateTimeField19 = ethiopicChronology14.clockhourOfHalfday();
        org.joda.time.DurationField durationField20 = ethiopicChronology14.weeks();
        org.joda.time.DurationField durationField21 = ethiopicChronology14.years();
        org.joda.time.DurationField durationField22 = ethiopicChronology14.seconds();
        boolean boolean23 = ethiopicChronology1.equals((java.lang.Object) durationField22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField21", (durationField3.compareTo(durationField21) == 0) == durationField3.equals(durationField21));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = ethiopicChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology1.dayOfWeek();
        org.joda.time.DurationField durationField8 = ethiopicChronology1.days();
        org.joda.time.DurationField durationField9 = ethiopicChronology1.days();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology1.minuteOfDay();
        org.joda.time.DurationField durationField12 = ethiopicChronology1.hours();
        org.joda.time.DurationField durationField13 = ethiopicChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField13, durationField3, and durationField8", !(durationField13.compareTo(durationField3) == 0) || (Math.signum(durationField13.compareTo(durationField8)) == Math.signum(durationField3.compareTo(durationField8))));
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DurationField durationField4 = ethiopicChronology1.centuries();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology1.weekyear();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology1.minuteOfDay();
        org.joda.time.DurationField durationField8 = ethiopicChronology1.years();
        org.joda.time.DurationField durationField9 = ethiopicChronology1.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField8", (durationField3.compareTo(durationField8) == 0) == durationField3.equals(durationField8));
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology1.secondOfDay();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology1.secondOfDay();
        org.joda.time.DurationField durationField5 = ethiopicChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.clockhourOfHalfday();
        org.joda.time.DurationField durationField7 = ethiopicChronology1.weeks();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology9 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone8);
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology9.clockhourOfDay();
        org.joda.time.DurationField durationField11 = ethiopicChronology9.weekyears();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology9.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone13 = ethiopicChronology9.getZone();
        java.lang.String str14 = dateTimeZone13.getID();
        int int16 = dateTimeZone13.getStandardOffset((long) (-1));
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime(chronology17);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime18.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime18.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.DateTime dateTime26 = localDateTime24.toDateTime(readableInstant25);
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = null;
        boolean boolean28 = dateTime26.isSupported(dateTimeFieldType27);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime(chronology29);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime30.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime30.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime30.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.DateTime dateTime38 = localDateTime36.toDateTime(readableInstant37);
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = null;
        boolean boolean40 = dateTime38.isSupported(dateTimeFieldType39);
        int int41 = dateTime26.compareTo((org.joda.time.ReadableInstant) dateTime38);
        int int42 = dateTimeZone13.getOffset((org.joda.time.ReadableInstant) dateTime26);
        org.joda.time.Chronology chronology43 = ethiopicChronology1.withZone(dateTimeZone13);
        org.joda.time.DateTimeField dateTimeField44 = ethiopicChronology1.minuteOfDay();
        org.joda.time.DurationField durationField45 = ethiopicChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField45, durationField5, and durationField11", !(durationField45.compareTo(durationField5) == 0) || (Math.signum(durationField45.compareTo(durationField11)) == Math.signum(durationField5.compareTo(durationField11))));
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = ethiopicChronology1.getZone();
        org.joda.time.DurationField durationField6 = ethiopicChronology1.centuries();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology1.millisOfSecond();
        org.joda.time.DurationField durationField8 = ethiopicChronology1.halfdays();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime(chronology9);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime10.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime10.plusWeeks((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.minusSeconds(614);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime16.withDayOfWeek((int) (byte) 1);
        int[] intArray22 = ethiopicChronology1.get((org.joda.time.ReadablePartial) localDateTime20, (long) 723);
        org.joda.time.DateTimeField dateTimeField23 = ethiopicChronology1.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField24 = ethiopicChronology1.clockhourOfHalfday();
        org.joda.time.DurationField durationField25 = ethiopicChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField25, durationField3, and durationField6", !(durationField25.compareTo(durationField3) == 0) || (Math.signum(durationField25.compareTo(durationField6)) == Math.signum(durationField3.compareTo(durationField6))));
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.DateTime dateTime9 = localDateTime7.toDateTime(readableInstant8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime7.withSecondOfMinute((int) (short) 0);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.minus(readablePeriod12);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalDateTime localDateTime16 = localDateTime13.withPeriodAdded(readablePeriod14, (int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 100);
        long long21 = dateTimeZone18.adjustOffset((-31449599999L), false);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 10);
        long long25 = dateTimeZone18.getMillisKeepLocal(dateTimeZone23, (long) 'a');
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology27 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone26);
        org.joda.time.DateTimeField dateTimeField28 = ethiopicChronology27.clockhourOfDay();
        org.joda.time.DurationField durationField29 = ethiopicChronology27.weekyears();
        org.joda.time.DateTimeField dateTimeField30 = ethiopicChronology27.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone31 = ethiopicChronology27.getZone();
        java.lang.String str32 = dateTimeZone31.getID();
        int int34 = dateTimeZone31.getStandardOffset((long) (-1));
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.LocalDateTime localDateTime36 = new org.joda.time.LocalDateTime(chronology35);
        org.joda.time.LocalDateTime localDateTime38 = localDateTime36.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime40 = localDateTime36.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime42 = localDateTime36.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant43 = null;
        org.joda.time.DateTime dateTime44 = localDateTime42.toDateTime(readableInstant43);
        org.joda.time.DateTimeFieldType dateTimeFieldType45 = null;
        boolean boolean46 = dateTime44.isSupported(dateTimeFieldType45);
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.LocalDateTime localDateTime48 = new org.joda.time.LocalDateTime(chronology47);
        org.joda.time.LocalDateTime localDateTime50 = localDateTime48.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime52 = localDateTime48.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime54 = localDateTime48.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant55 = null;
        org.joda.time.DateTime dateTime56 = localDateTime54.toDateTime(readableInstant55);
        org.joda.time.DateTimeFieldType dateTimeFieldType57 = null;
        boolean boolean58 = dateTime56.isSupported(dateTimeFieldType57);
        int int59 = dateTime44.compareTo((org.joda.time.ReadableInstant) dateTime56);
        int int60 = dateTimeZone31.getOffset((org.joda.time.ReadableInstant) dateTime44);
        org.joda.time.Instant instant61 = dateTime44.toInstant();
        int int62 = dateTimeZone18.getOffset((org.joda.time.ReadableInstant) instant61);
        java.util.Locale.Category category63 = java.util.Locale.Category.DISPLAY;
        boolean boolean64 = instant61.equals((java.lang.Object) category63);
        org.joda.time.DateTime dateTime65 = localDateTime13.toDateTime((org.joda.time.ReadableInstant) instant61);
        org.joda.time.LocalDateTime.Property property66 = localDateTime13.year();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and instant61", (dateTime9.compareTo(instant61) == 0) == dateTime9.equals(instant61));
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology2 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology2.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology2.secondOfDay();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology2.secondOfDay();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) 10, (org.joda.time.Chronology) ethiopicChronology2);
        org.joda.time.DurationField durationField7 = ethiopicChronology2.hours();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology2.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology2.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology2.secondOfDay();
        org.joda.time.DurationField durationField11 = ethiopicChronology2.eras();
        org.joda.time.DurationField durationField12 = ethiopicChronology2.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField7 and durationField11", Math.signum(durationField7.compareTo(durationField11)) == -Math.signum(durationField11.compareTo(durationField7)));
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology1.secondOfDay();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology1.secondOfDay();
        org.joda.time.DurationField durationField5 = ethiopicChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.clockhourOfHalfday();
        org.joda.time.DurationField durationField7 = ethiopicChronology1.weeks();
        org.joda.time.DurationField durationField8 = ethiopicChronology1.eras();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology1.secondOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField5 and durationField8", Math.signum(durationField5.compareTo(durationField8)) == -Math.signum(durationField8.compareTo(durationField5)));
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology2 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology2.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology2.secondOfDay();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology2.secondOfDay();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) 10, (org.joda.time.Chronology) ethiopicChronology2);
        org.joda.time.DurationField durationField7 = ethiopicChronology2.hours();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology2.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology2.monthOfYear();
        org.joda.time.DurationField durationField10 = ethiopicChronology2.centuries();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology12 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone11);
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology12.clockhourOfDay();
        org.joda.time.DurationField durationField14 = ethiopicChronology12.weekyears();
        org.joda.time.DurationField durationField15 = ethiopicChronology12.hours();
        org.joda.time.DateTimeField dateTimeField16 = ethiopicChronology12.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField17 = ethiopicChronology12.hourOfDay();
        org.joda.time.DateTimeField dateTimeField18 = ethiopicChronology12.yearOfEra();
        long long21 = dateTimeField18.add(100L, (int) (byte) 0);
        org.joda.time.DurationField durationField22 = dateTimeField18.getDurationField();
        long long24 = durationField22.getMillis(923);
        int int25 = durationField10.compareTo(durationField22);
        long long27 = durationField10.getMillis(891);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField14 and durationField22", (durationField14.compareTo(durationField22) == 0) == durationField14.equals(durationField22));
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology2 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology2.clockhourOfDay();
        org.joda.time.DurationField durationField4 = ethiopicChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology2.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone6 = ethiopicChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology2.monthOfYear();
        org.joda.time.DurationField durationField8 = ethiopicChronology2.seconds();
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(obj0, (org.joda.time.Chronology) ethiopicChronology2);
        java.lang.String str10 = ethiopicChronology2.toString();
        org.joda.time.DurationField durationField11 = ethiopicChronology2.years();
        org.joda.time.DurationField durationField12 = ethiopicChronology2.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField11", (durationField4.compareTo(durationField11) == 0) == durationField4.equals(durationField11));
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.DateTime dateTime9 = localDateTime7.toDateTime(readableInstant8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime7.withSecondOfMinute((int) (short) 0);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.minus(readablePeriod12);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalDateTime localDateTime16 = localDateTime13.withPeriodAdded(readablePeriod14, (int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 100);
        long long21 = dateTimeZone18.adjustOffset((-31449599999L), false);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 10);
        long long25 = dateTimeZone18.getMillisKeepLocal(dateTimeZone23, (long) 'a');
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology27 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone26);
        org.joda.time.DateTimeField dateTimeField28 = ethiopicChronology27.clockhourOfDay();
        org.joda.time.DurationField durationField29 = ethiopicChronology27.weekyears();
        org.joda.time.DateTimeField dateTimeField30 = ethiopicChronology27.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone31 = ethiopicChronology27.getZone();
        java.lang.String str32 = dateTimeZone31.getID();
        int int34 = dateTimeZone31.getStandardOffset((long) (-1));
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.LocalDateTime localDateTime36 = new org.joda.time.LocalDateTime(chronology35);
        org.joda.time.LocalDateTime localDateTime38 = localDateTime36.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime40 = localDateTime36.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime42 = localDateTime36.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant43 = null;
        org.joda.time.DateTime dateTime44 = localDateTime42.toDateTime(readableInstant43);
        org.joda.time.DateTimeFieldType dateTimeFieldType45 = null;
        boolean boolean46 = dateTime44.isSupported(dateTimeFieldType45);
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.LocalDateTime localDateTime48 = new org.joda.time.LocalDateTime(chronology47);
        org.joda.time.LocalDateTime localDateTime50 = localDateTime48.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime52 = localDateTime48.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime54 = localDateTime48.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant55 = null;
        org.joda.time.DateTime dateTime56 = localDateTime54.toDateTime(readableInstant55);
        org.joda.time.DateTimeFieldType dateTimeFieldType57 = null;
        boolean boolean58 = dateTime56.isSupported(dateTimeFieldType57);
        int int59 = dateTime44.compareTo((org.joda.time.ReadableInstant) dateTime56);
        int int60 = dateTimeZone31.getOffset((org.joda.time.ReadableInstant) dateTime44);
        org.joda.time.Instant instant61 = dateTime44.toInstant();
        int int62 = dateTimeZone18.getOffset((org.joda.time.ReadableInstant) instant61);
        java.util.Locale.Category category63 = java.util.Locale.Category.DISPLAY;
        boolean boolean64 = instant61.equals((java.lang.Object) category63);
        org.joda.time.DateTime dateTime65 = localDateTime13.toDateTime((org.joda.time.ReadableInstant) instant61);
        org.joda.time.LocalDateTime localDateTime67 = localDateTime13.minusHours(904);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and instant61", (dateTime9.compareTo(instant61) == 0) == dateTime9.equals(instant61));
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
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
        org.joda.time.LocalDateTime localDateTime16 = localDateTime1.withMillisOfSecond((int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.withDayOfYear(37);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime(chronology19);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime20.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime20.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime20.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.DateTime dateTime28 = localDateTime26.toDateTime(readableInstant27);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime(chronology29);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime30.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime30.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime30.withYearOfCentury(0);
        org.joda.time.LocalDateTime.Property property37 = localDateTime36.weekyear();
        org.joda.time.LocalDateTime localDateTime39 = property37.setCopy((int) (byte) 1);
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.LocalDateTime localDateTime41 = new org.joda.time.LocalDateTime(chronology40);
        org.joda.time.LocalDateTime localDateTime43 = localDateTime41.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime45 = localDateTime41.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime47 = localDateTime41.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant48 = null;
        org.joda.time.DateTime dateTime49 = localDateTime47.toDateTime(readableInstant48);
        org.joda.time.DateTimeFieldType dateTimeFieldType50 = null;
        boolean boolean51 = dateTime49.isSupported(dateTimeFieldType50);
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.LocalDateTime localDateTime53 = new org.joda.time.LocalDateTime(chronology52);
        org.joda.time.LocalDateTime localDateTime55 = localDateTime53.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime57 = localDateTime53.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime59 = localDateTime53.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant60 = null;
        org.joda.time.DateTime dateTime61 = localDateTime59.toDateTime(readableInstant60);
        org.joda.time.DateTimeFieldType dateTimeFieldType62 = null;
        boolean boolean63 = dateTime61.isSupported(dateTimeFieldType62);
        int int64 = dateTime49.compareTo((org.joda.time.ReadableInstant) dateTime61);
        int int65 = property37.compareTo((org.joda.time.ReadableInstant) dateTime61);
        boolean boolean66 = dateTime28.isEqual((org.joda.time.ReadableInstant) dateTime61);
        org.joda.time.Chronology chronology67 = null;
        org.joda.time.LocalDateTime localDateTime68 = new org.joda.time.LocalDateTime(chronology67);
        org.joda.time.LocalDateTime localDateTime70 = localDateTime68.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime72 = localDateTime68.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime74 = localDateTime68.plusWeeks((int) (byte) 10);
        org.joda.time.Chronology chronology75 = null;
        org.joda.time.LocalDateTime localDateTime76 = new org.joda.time.LocalDateTime(chronology75);
        org.joda.time.LocalDateTime localDateTime78 = localDateTime76.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime80 = localDateTime76.withMillisOfSecond((int) (byte) 1);
        int int81 = localDateTime68.compareTo((org.joda.time.ReadablePartial) localDateTime76);
        org.joda.time.LocalDateTime.Property property82 = localDateTime76.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType83 = property82.getFieldType();
        boolean boolean84 = dateTime61.isSupported(dateTimeFieldType83);
        java.lang.String str85 = dateTime61.toString();
        org.joda.time.Instant instant86 = dateTime61.toInstant();
        org.joda.time.DateTime dateTime87 = localDateTime16.toDateTime((org.joda.time.ReadableInstant) instant86);
        org.joda.time.Chronology chronology88 = dateTime87.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime28 and instant86", (dateTime28.compareTo(instant86) == 0) == dateTime28.equals(instant86));
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology1.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.era();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology1.minuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology9 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone8);
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology9.clockhourOfDay();
        org.joda.time.DurationField durationField11 = ethiopicChronology9.weekyears();
        org.joda.time.DurationField durationField12 = ethiopicChronology9.hours();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology9.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology9.hourOfDay();
        org.joda.time.DateTimeField dateTimeField15 = ethiopicChronology9.monthOfYear();
        org.joda.time.DateTimeField dateTimeField16 = ethiopicChronology9.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField17 = ethiopicChronology9.minuteOfHour();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime(chronology18);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime19.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime19.plusWeeks((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = localDateTime19.getFieldType((int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime19.minusWeeks(671);
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology31 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone30);
        org.joda.time.DateTimeField dateTimeField32 = ethiopicChronology31.hourOfDay();
        org.joda.time.DateTimeField dateTimeField33 = ethiopicChronology31.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.Chronology chronology35 = ethiopicChronology31.withZone(dateTimeZone34);
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology37 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone36);
        org.joda.time.DateTimeField dateTimeField38 = ethiopicChronology37.clockhourOfDay();
        org.joda.time.DurationField durationField39 = ethiopicChronology37.weekyears();
        org.joda.time.DateTimeField dateTimeField40 = ethiopicChronology37.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 10);
        java.lang.String str44 = dateTimeZone42.getShortName((long) 1);
        org.joda.time.Chronology chronology45 = ethiopicChronology37.withZone(dateTimeZone42);
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.LocalDateTime localDateTime47 = new org.joda.time.LocalDateTime(chronology46);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray48 = localDateTime47.getFieldTypes();
        org.joda.time.LocalDateTime localDateTime50 = localDateTime47.withMillisOfDay((int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone51 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology52 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone51);
        org.joda.time.DateTimeField dateTimeField53 = ethiopicChronology52.dayOfMonth();
        java.util.Locale locale57 = new java.util.Locale("hi!", "hi!");
        java.lang.String str58 = dateTimeField53.getAsText((int) (byte) 10, locale57);
        org.joda.time.Chronology chronology59 = null;
        org.joda.time.LocalDateTime localDateTime60 = new org.joda.time.LocalDateTime(chronology59);
        org.joda.time.LocalDateTime localDateTime62 = localDateTime60.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime64 = localDateTime60.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime66 = localDateTime64.withMillisOfSecond((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime68 = localDateTime64.withMinuteOfHour(10);
        org.joda.time.LocalDateTime localDateTime70 = localDateTime64.minusDays(100);
        int[] intArray77 = new int[] { (short) 10, 1, 614, 822, (byte) 100 };
        int[] intArray79 = dateTimeField53.addWrapField((org.joda.time.ReadablePartial) localDateTime70, 0, intArray77, (int) (short) 1);
        ethiopicChronology37.validate((org.joda.time.ReadablePartial) localDateTime50, intArray79);
        int[] intArray82 = ethiopicChronology31.get((org.joda.time.ReadablePartial) localDateTime50, (long) (-292269338));
        int int83 = dateTimeField17.getMinimumValue((org.joda.time.ReadablePartial) localDateTime29, intArray82);
        int[] intArray84 = localDateTime29.getValues();
        org.joda.time.DateTimeZone dateTimeZone86 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 100);
        long long89 = dateTimeZone86.adjustOffset((-31449599999L), false);
        org.joda.time.DateTimeZone dateTimeZone91 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 10);
        long long93 = dateTimeZone86.getMillisKeepLocal(dateTimeZone91, (long) 'a');
        org.joda.time.LocalDateTime localDateTime94 = org.joda.time.LocalDateTime.now(dateTimeZone91);
        int int95 = localDateTime29.compareTo((org.joda.time.ReadablePartial) localDateTime94);
        int[] intArray97 = ethiopicChronology1.get((org.joda.time.ReadablePartial) localDateTime29, (long) 1962);
        int int98 = ethiopicChronology1.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField99 = ethiopicChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField99, durationField3, and durationField12", !(durationField99.compareTo(durationField3) == 0) || (Math.signum(durationField99.compareTo(durationField12)) == Math.signum(durationField3.compareTo(durationField12))));
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DurationField durationField4 = ethiopicChronology1.centuries();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology1.weekyear();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology1.weekOfWeekyear();
        org.joda.time.DurationField durationField8 = ethiopicChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField8, durationField3, and durationField4", !(durationField8.compareTo(durationField3) == 0) || (Math.signum(durationField8.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = ethiopicChronology1.getZone();
        org.joda.time.Chronology chronology6 = ethiopicChronology1.withUTC();
        org.joda.time.DurationField durationField7 = ethiopicChronology1.minutes();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology1.clockhourOfHalfday();
        org.joda.time.DurationField durationField9 = ethiopicChronology1.years();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology1.dayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField9", (durationField3.compareTo(durationField9) == 0) == durationField3.equals(durationField9));
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = ethiopicChronology1.getZone();
        org.joda.time.Chronology chronology6 = ethiopicChronology1.withUTC();
        org.joda.time.DurationField durationField7 = ethiopicChronology1.minutes();
        org.joda.time.DurationField durationField8 = ethiopicChronology1.centuries();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology1.dayOfWeek();
        long long13 = ethiopicChronology1.add((long) 487, 22L, 7);
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology1.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField15 = ethiopicChronology1.minuteOfHour();
        org.joda.time.DurationField durationField16 = ethiopicChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField16, durationField3, and durationField7", !(durationField16.compareTo(durationField3) == 0) || (Math.signum(durationField16.compareTo(durationField7)) == Math.signum(durationField3.compareTo(durationField7))));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology2 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology2.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology2.secondOfDay();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology2.secondOfDay();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) 10, (org.joda.time.Chronology) ethiopicChronology2);
        org.joda.time.DurationField durationField7 = ethiopicChronology2.hours();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology2.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology2.monthOfYear();
        org.joda.time.DurationField durationField10 = ethiopicChronology2.centuries();
        java.lang.String str11 = ethiopicChronology2.toString();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology2.yearOfCentury();
        org.joda.time.Chronology chronology13 = ethiopicChronology2.withUTC();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime(chronology14);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime15.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime15.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.DateTime dateTime23 = localDateTime21.toDateTime(readableInstant22);
        org.joda.time.LocalDateTime.Property property24 = localDateTime21.millisOfDay();
        org.joda.time.Interval interval25 = property24.toInterval();
        org.joda.time.LocalDateTime localDateTime26 = property24.withMaximumValue();
        org.joda.time.Chronology chronology27 = localDateTime26.getChronology();
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology29 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone28);
        org.joda.time.DateTimeField dateTimeField30 = ethiopicChronology29.clockhourOfDay();
        org.joda.time.DurationField durationField31 = ethiopicChronology29.weekyears();
        org.joda.time.DurationField durationField32 = ethiopicChronology29.centuries();
        org.joda.time.DateTimeField dateTimeField33 = ethiopicChronology29.weekyear();
        org.joda.time.DateTimeField dateTimeField34 = ethiopicChronology29.yearOfEra();
        org.joda.time.DateTimeField dateTimeField35 = ethiopicChronology29.weekyear();
        org.joda.time.DateTimeField dateTimeField36 = ethiopicChronology29.dayOfMonth();
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.LocalDateTime localDateTime38 = new org.joda.time.LocalDateTime(chronology37);
        org.joda.time.LocalDateTime localDateTime40 = localDateTime38.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime42 = localDateTime38.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime44 = localDateTime38.plusWeeks((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime46 = localDateTime44.minusSeconds(614);
        org.joda.time.LocalDateTime localDateTime48 = localDateTime44.withDayOfWeek((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology51 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone50);
        org.joda.time.DateTimeField dateTimeField52 = ethiopicChronology51.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField53 = ethiopicChronology51.dayOfMonth();
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.LocalDateTime localDateTime55 = new org.joda.time.LocalDateTime(chronology54);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray56 = localDateTime55.getFieldTypes();
        org.joda.time.LocalDateTime localDateTime58 = localDateTime55.withMillisOfDay((int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime60 = localDateTime58.withDayOfYear(53);
        org.joda.time.ReadableDuration readableDuration61 = null;
        org.joda.time.LocalDateTime localDateTime62 = localDateTime58.plus(readableDuration61);
        int[] intArray64 = ethiopicChronology51.get((org.joda.time.ReadablePartial) localDateTime62, (long) 8);
        int[] intArray66 = dateTimeField36.addWrapPartial((org.joda.time.ReadablePartial) localDateTime44, 0, intArray64, 458);
        ethiopicChronology2.validate((org.joda.time.ReadablePartial) localDateTime26, intArray66);
        org.joda.time.DurationField durationField68 = ethiopicChronology2.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField68, durationField7, and durationField10", !(durationField68.compareTo(durationField7) == 0) || (Math.signum(durationField68.compareTo(durationField10)) == Math.signum(durationField7.compareTo(durationField10))));
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.plusWeeks((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology9 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone8);
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology9.clockhourOfDay();
        org.joda.time.DurationField durationField11 = ethiopicChronology9.weekyears();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology9.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone13 = ethiopicChronology9.getZone();
        java.lang.String str14 = dateTimeZone13.getID();
        int int16 = dateTimeZone13.getStandardOffset((long) (-1));
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime(chronology17);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime18.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime18.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.DateTime dateTime26 = localDateTime24.toDateTime(readableInstant25);
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = null;
        boolean boolean28 = dateTime26.isSupported(dateTimeFieldType27);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime(chronology29);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime30.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime30.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime30.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.DateTime dateTime38 = localDateTime36.toDateTime(readableInstant37);
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = null;
        boolean boolean40 = dateTime38.isSupported(dateTimeFieldType39);
        int int41 = dateTime26.compareTo((org.joda.time.ReadableInstant) dateTime38);
        int int42 = dateTimeZone13.getOffset((org.joda.time.ReadableInstant) dateTime26);
        org.joda.time.Instant instant43 = dateTime26.toInstant();
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.LocalDateTime localDateTime45 = new org.joda.time.LocalDateTime(chronology44);
        org.joda.time.LocalDateTime localDateTime47 = localDateTime45.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime49 = localDateTime45.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime51 = localDateTime49.withMillisOfSecond((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime53 = localDateTime49.withMinuteOfHour(10);
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.LocalDateTime localDateTime55 = new org.joda.time.LocalDateTime(chronology54);
        org.joda.time.LocalDateTime localDateTime57 = localDateTime55.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime59 = localDateTime55.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime61 = localDateTime55.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant62 = null;
        org.joda.time.DateTime dateTime63 = localDateTime61.toDateTime(readableInstant62);
        org.joda.time.LocalDateTime.Property property64 = localDateTime61.millisOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType66 = localDateTime61.getFieldType((int) (short) 1);
        boolean boolean67 = localDateTime49.isSupported(dateTimeFieldType66);
        boolean boolean68 = instant43.isSupported(dateTimeFieldType66);
        int int69 = localDateTime1.indexOf(dateTimeFieldType66);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime26 and instant43", (dateTime26.compareTo(instant43) == 0) == dateTime26.equals(instant43));
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = ethiopicChronology1.getZone();
        org.joda.time.DurationField durationField6 = ethiopicChronology1.centuries();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology1.millisOfSecond();
        org.joda.time.DurationField durationField8 = ethiopicChronology1.halfdays();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime(chronology9);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime10.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime10.plusWeeks((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.minusSeconds(614);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime16.withDayOfWeek((int) (byte) 1);
        int[] intArray22 = ethiopicChronology1.get((org.joda.time.ReadablePartial) localDateTime20, (long) 723);
        java.lang.Object obj23 = null;
        boolean boolean24 = ethiopicChronology1.equals(obj23);
        org.joda.time.DateTimeField dateTimeField25 = ethiopicChronology1.hourOfHalfday();
        org.joda.time.DurationField durationField26 = ethiopicChronology1.months();
        org.joda.time.DurationField durationField27 = ethiopicChronology1.centuries();
        org.joda.time.DateTimeField dateTimeField28 = ethiopicChronology1.dayOfMonth();
        org.joda.time.DurationField durationField29 = ethiopicChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField29, durationField3, and durationField6", !(durationField29.compareTo(durationField3) == 0) || (Math.signum(durationField29.compareTo(durationField6)) == Math.signum(durationField3.compareTo(durationField6))));
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DurationField durationField4 = ethiopicChronology1.centuries();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology1.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.weekyear();
        java.lang.String str7 = ethiopicChronology1.toString();
        org.joda.time.DateTimeZone dateTimeZone8 = ethiopicChronology1.getZone();
        org.joda.time.DurationField durationField9 = ethiopicChronology1.years();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology1.weekOfWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField9", (durationField3.compareTo(durationField9) == 0) == durationField3.equals(durationField9));
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology2 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology2.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology2.secondOfDay();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology2.secondOfDay();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) 10, (org.joda.time.Chronology) ethiopicChronology2);
        org.joda.time.DurationField durationField7 = ethiopicChronology2.hours();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology2.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology2.halfdayOfDay();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(chronology10);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime11.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime11.withYearOfCentury(0);
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.weekyear();
        org.joda.time.LocalDateTime.Property property19 = localDateTime17.secondOfMinute();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime(chronology20);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime21.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime21.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.DateTime dateTime29 = localDateTime27.toDateTime(readableInstant28);
        org.joda.time.LocalDateTime.Property property30 = localDateTime27.millisOfDay();
        org.joda.time.Interval interval31 = property30.toInterval();
        boolean boolean32 = localDateTime17.equals((java.lang.Object) property30);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime17.withWeekyear(458);
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology36 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone35);
        org.joda.time.DateTimeField dateTimeField37 = ethiopicChronology36.hourOfDay();
        org.joda.time.DateTimeField dateTimeField38 = ethiopicChronology36.secondOfDay();
        org.joda.time.DateTimeField dateTimeField39 = ethiopicChronology36.secondOfDay();
        org.joda.time.DurationField durationField40 = ethiopicChronology36.weeks();
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime(chronology41);
        org.joda.time.LocalDateTime localDateTime44 = localDateTime42.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime46 = localDateTime42.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime48 = localDateTime42.withYearOfCentury(0);
        org.joda.time.LocalDateTime.Property property49 = localDateTime48.weekyear();
        org.joda.time.LocalDateTime.Property property50 = localDateTime48.secondOfMinute();
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.LocalDateTime localDateTime52 = new org.joda.time.LocalDateTime(chronology51);
        org.joda.time.LocalDateTime localDateTime54 = localDateTime52.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime56 = localDateTime52.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime58 = localDateTime52.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant59 = null;
        org.joda.time.DateTime dateTime60 = localDateTime58.toDateTime(readableInstant59);
        org.joda.time.LocalDateTime.Property property61 = localDateTime58.millisOfDay();
        org.joda.time.Interval interval62 = property61.toInterval();
        boolean boolean63 = localDateTime48.equals((java.lang.Object) property61);
        int[] intArray65 = ethiopicChronology36.get((org.joda.time.ReadablePartial) localDateTime48, (long) 1439);
        ethiopicChronology2.validate((org.joda.time.ReadablePartial) localDateTime34, intArray65);
        org.joda.time.DurationField durationField67 = ethiopicChronology2.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField67, durationField7, and durationField40", !(durationField67.compareTo(durationField7) == 0) || (Math.signum(durationField67.compareTo(durationField40)) == Math.signum(durationField7.compareTo(durationField40))));
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DurationField durationField4 = ethiopicChronology1.centuries();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology1.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.dayOfYear();
        java.lang.String str7 = ethiopicChronology1.toString();
        org.joda.time.DurationField durationField8 = ethiopicChronology1.months();
        org.joda.time.DurationField durationField9 = ethiopicChronology1.years();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology11 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone10);
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology11.hourOfDay();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology11.centuryOfEra();
        org.joda.time.DurationField durationField14 = ethiopicChronology11.millis();
        org.joda.time.DateTimeField dateTimeField15 = ethiopicChronology11.secondOfMinute();
        org.joda.time.DurationField durationField16 = ethiopicChronology11.weekyears();
        org.joda.time.DateTimeZone dateTimeZone17 = ethiopicChronology11.getZone();
        int int19 = dateTimeZone17.getStandardOffset((long) 8766);
        java.lang.String str20 = dateTimeZone17.toString();
        org.joda.time.Chronology chronology21 = ethiopicChronology1.withZone(dateTimeZone17);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField9", (durationField3.compareTo(durationField9) == 0) == durationField3.equals(durationField9));
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology1.secondOfDay();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology1.secondOfDay();
        org.joda.time.DurationField durationField5 = ethiopicChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.weekyear();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.Chronology chronology8 = ethiopicChronology1.withZone(dateTimeZone7);
        org.joda.time.DurationField durationField9 = ethiopicChronology1.eras();
        org.joda.time.DurationField durationField10 = ethiopicChronology1.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField5 and durationField9", Math.signum(durationField5.compareTo(durationField9)) == -Math.signum(durationField9.compareTo(durationField5)));
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology1.centuryOfEra();
        org.joda.time.DurationField durationField4 = ethiopicChronology1.millis();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology1.weekOfWeekyear();
        org.joda.time.DurationField durationField6 = ethiopicChronology1.weekyears();
        org.joda.time.DurationField durationField7 = ethiopicChronology1.halfdays();
        org.joda.time.DurationField durationField8 = ethiopicChronology1.years();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology1.weekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField8", (durationField6.compareTo(durationField8) == 0) == durationField6.equals(durationField8));
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = ethiopicChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField7 = ethiopicChronology1.eras();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology1.weekOfWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField7", Math.signum(durationField3.compareTo(durationField7)) == -Math.signum(durationField7.compareTo(durationField3)));
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology1.halfdayOfDay();
        org.joda.time.DurationField durationField6 = ethiopicChronology1.eras();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology1.dayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField6", Math.signum(durationField3.compareTo(durationField6)) == -Math.signum(durationField6.compareTo(durationField3)));
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology1.centuryOfEra();
        org.joda.time.DurationField durationField4 = ethiopicChronology1.millis();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology1.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.dayOfWeek();
        org.joda.time.DurationField durationField7 = ethiopicChronology1.years();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology1.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology10 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology10.clockhourOfDay();
        org.joda.time.DurationField durationField12 = ethiopicChronology10.weekyears();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology10.clockhourOfDay();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime(chronology14);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.plusWeeks((int) (byte) -1);
        java.util.Locale locale19 = java.util.Locale.GERMANY;
        java.lang.String str20 = locale19.getScript();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology22 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone21);
        org.joda.time.DateTimeField dateTimeField23 = ethiopicChronology22.clockhourOfDay();
        java.util.Locale locale25 = java.util.Locale.ITALIAN;
        java.lang.String str26 = dateTimeField23.getAsText((long) 'a', locale25);
        java.lang.String str27 = locale19.getDisplayName(locale25);
        java.lang.String str28 = dateTimeField13.getAsShortText((org.joda.time.ReadablePartial) localDateTime17, (int) ' ', locale25);
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology31 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone30);
        org.joda.time.DateTimeField dateTimeField32 = ethiopicChronology31.hourOfDay();
        org.joda.time.DateTimeField dateTimeField33 = ethiopicChronology31.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.Chronology chronology35 = ethiopicChronology31.withZone(dateTimeZone34);
        org.joda.time.DateTimeField dateTimeField36 = ethiopicChronology31.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone37 = ethiopicChronology31.getZone();
        org.joda.time.LocalDateTime localDateTime38 = new org.joda.time.LocalDateTime(1900800010L, dateTimeZone37);
        java.util.Locale locale40 = java.util.Locale.GERMANY;
        java.util.Locale locale41 = java.util.Locale.GERMANY;
        java.lang.String str42 = locale41.getScript();
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology44 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone43);
        org.joda.time.DateTimeField dateTimeField45 = ethiopicChronology44.clockhourOfDay();
        java.util.Locale locale47 = java.util.Locale.ITALIAN;
        java.lang.String str48 = dateTimeField45.getAsText((long) 'a', locale47);
        java.lang.String str49 = locale41.getDisplayName(locale47);
        java.lang.String str50 = locale47.getISO3Language();
        boolean boolean51 = locale47.hasExtensions();
        java.lang.String str52 = locale40.getDisplayScript(locale47);
        java.lang.String str53 = dateTimeZone37.getName((-360000083L), locale40);
        int int54 = dateTimeField13.getMaximumShortTextLength(locale40);
        java.lang.String str55 = locale40.getVariant();
        java.lang.String str56 = locale40.getDisplayScript();
        int int57 = dateTimeField8.getMaximumTextLength(locale40);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField7 and durationField12", (durationField7.compareTo(durationField12) == 0) == durationField7.equals(durationField12));
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DurationField durationField4 = ethiopicChronology1.hours();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology1.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology1.yearOfEra();
        org.joda.time.DurationField durationField8 = ethiopicChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology1.dayOfYear();
        org.joda.time.DurationField durationField10 = ethiopicChronology1.hours();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology1.millisOfSecond();
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
        int int28 = property27.getMinimumValueOverall();
        java.lang.String str29 = property27.getAsShortText();
        org.joda.time.LocalDateTime localDateTime31 = property27.addToCopy(8);
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime(chronology32);
        org.joda.time.LocalDateTime localDateTime35 = localDateTime33.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime37 = localDateTime33.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime39 = localDateTime37.withMillisOfSecond((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime41 = localDateTime37.withMinuteOfHour(10);
        int int42 = localDateTime31.compareTo((org.joda.time.ReadablePartial) localDateTime37);
        long long44 = ethiopicChronology1.set((org.joda.time.ReadablePartial) localDateTime37, (long) 980);
        org.joda.time.DurationField durationField45 = ethiopicChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField45, durationField3, and durationField4", !(durationField45.compareTo(durationField3) == 0) || (Math.signum(durationField45.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.DateTime dateTime9 = localDateTime7.toDateTime(readableInstant8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime7.withSecondOfMinute((int) (short) 0);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.minus(readablePeriod12);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalDateTime localDateTime16 = localDateTime13.withPeriodAdded(readablePeriod14, (int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 100);
        long long21 = dateTimeZone18.adjustOffset((-31449599999L), false);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 10);
        long long25 = dateTimeZone18.getMillisKeepLocal(dateTimeZone23, (long) 'a');
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology27 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone26);
        org.joda.time.DateTimeField dateTimeField28 = ethiopicChronology27.clockhourOfDay();
        org.joda.time.DurationField durationField29 = ethiopicChronology27.weekyears();
        org.joda.time.DateTimeField dateTimeField30 = ethiopicChronology27.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone31 = ethiopicChronology27.getZone();
        java.lang.String str32 = dateTimeZone31.getID();
        int int34 = dateTimeZone31.getStandardOffset((long) (-1));
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.LocalDateTime localDateTime36 = new org.joda.time.LocalDateTime(chronology35);
        org.joda.time.LocalDateTime localDateTime38 = localDateTime36.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime40 = localDateTime36.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime42 = localDateTime36.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant43 = null;
        org.joda.time.DateTime dateTime44 = localDateTime42.toDateTime(readableInstant43);
        org.joda.time.DateTimeFieldType dateTimeFieldType45 = null;
        boolean boolean46 = dateTime44.isSupported(dateTimeFieldType45);
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.LocalDateTime localDateTime48 = new org.joda.time.LocalDateTime(chronology47);
        org.joda.time.LocalDateTime localDateTime50 = localDateTime48.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime52 = localDateTime48.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime54 = localDateTime48.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant55 = null;
        org.joda.time.DateTime dateTime56 = localDateTime54.toDateTime(readableInstant55);
        org.joda.time.DateTimeFieldType dateTimeFieldType57 = null;
        boolean boolean58 = dateTime56.isSupported(dateTimeFieldType57);
        int int59 = dateTime44.compareTo((org.joda.time.ReadableInstant) dateTime56);
        int int60 = dateTimeZone31.getOffset((org.joda.time.ReadableInstant) dateTime44);
        org.joda.time.Instant instant61 = dateTime44.toInstant();
        int int62 = dateTimeZone18.getOffset((org.joda.time.ReadableInstant) instant61);
        java.util.Locale.Category category63 = java.util.Locale.Category.DISPLAY;
        boolean boolean64 = instant61.equals((java.lang.Object) category63);
        org.joda.time.DateTime dateTime65 = localDateTime13.toDateTime((org.joda.time.ReadableInstant) instant61);
        org.joda.time.Instant instant66 = dateTime65.toInstant();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and instant61", (dateTime9.compareTo(instant61) == 0) == dateTime9.equals(instant61));
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DurationField durationField4 = ethiopicChronology1.centuries();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology1.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.clockhourOfHalfday();
        org.joda.time.DurationField durationField7 = ethiopicChronology1.years();
        org.joda.time.DurationField durationField8 = ethiopicChronology1.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField7", (durationField3.compareTo(durationField7) == 0) == durationField3.equals(durationField7));
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.DateTime dateTime9 = localDateTime7.toDateTime(readableInstant8);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = null;
        boolean boolean11 = dateTime9.isSupported(dateTimeFieldType10);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime(chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime13.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime13.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.DateTime dateTime21 = localDateTime19.toDateTime(readableInstant20);
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = null;
        boolean boolean23 = dateTime21.isSupported(dateTimeFieldType22);
        int int24 = dateTime9.compareTo((org.joda.time.ReadableInstant) dateTime21);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime(chronology25);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime26.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime26.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime26.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.DateTime dateTime34 = localDateTime32.toDateTime(readableInstant33);
        java.util.Locale locale35 = java.util.Locale.GERMANY;
        boolean boolean36 = locale35.hasExtensions();
        boolean boolean37 = dateTime34.equals((java.lang.Object) locale35);
        boolean boolean38 = dateTime21.isAfter((org.joda.time.ReadableInstant) dateTime34);
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.LocalDateTime localDateTime40 = new org.joda.time.LocalDateTime(chronology39);
        org.joda.time.LocalDateTime localDateTime42 = localDateTime40.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime44 = localDateTime40.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime46 = localDateTime40.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.DateTime dateTime48 = localDateTime46.toDateTime(readableInstant47);
        java.util.Locale locale49 = java.util.Locale.GERMANY;
        boolean boolean50 = locale49.hasExtensions();
        boolean boolean51 = dateTime48.equals((java.lang.Object) locale49);
        java.lang.String str52 = dateTime48.toString();
        long long53 = dateTime48.getMillis();
        boolean boolean54 = dateTime34.isAfter((org.joda.time.ReadableInstant) dateTime48);
        org.joda.time.Instant instant55 = dateTime48.toInstant();
        long long56 = dateTime48.getMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and instant55", (dateTime9.compareTo(instant55) == 0) == dateTime9.equals(instant55));
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology1.centuryOfEra();
        org.joda.time.DurationField durationField4 = ethiopicChronology1.millis();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology1.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.centuryOfEra();
        org.joda.time.DurationField durationField7 = ethiopicChronology1.eras();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology1.monthOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField4 and durationField7", Math.signum(durationField4.compareTo(durationField7)) == -Math.signum(durationField7.compareTo(durationField4)));
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology2 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology2.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology2.secondOfDay();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology2.secondOfDay();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) 10, (org.joda.time.Chronology) ethiopicChronology2);
        org.joda.time.DurationField durationField7 = ethiopicChronology2.days();
        org.joda.time.DateTimeZone dateTimeZone8 = ethiopicChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology2.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology2.millisOfDay();
        org.joda.time.Chronology chronology11 = ethiopicChronology2.withUTC();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology13 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone12);
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology13.dayOfMonth();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(chronology15);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime16.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime16.plusWeeks((int) (byte) 10);
        java.util.Locale locale23 = java.util.Locale.PRC;
        java.lang.String str24 = dateTimeField14.getAsText((org.joda.time.ReadablePartial) localDateTime22, locale23);
        java.util.Set<java.lang.String> strSet25 = locale23.getUnicodeLocaleKeys();
        java.lang.String[] strArray35 = new java.lang.String[] { "UTC", "UTC", "tedesco (Germania)", "Etc/UTC", "Etc/UTC", "", "", "10", "Etc/UTC" };
        java.util.LinkedHashSet<java.lang.String> strSet36 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet36, strArray35);
        java.util.Locale.LanguageRange[] languageRangeArray38 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList39 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList39, languageRangeArray38);
        java.util.Collection<java.lang.String> strCollection41 = null;
        java.util.List<java.lang.String> strList42 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList39, strCollection41);
        boolean boolean43 = strSet36.retainAll((java.util.Collection<java.lang.String>) strList42);
        boolean boolean44 = strSet25.containsAll((java.util.Collection<java.lang.String>) strList42);
        java.util.Locale.LanguageRange[] languageRangeArray45 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList46 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList46, languageRangeArray45);
        java.util.Collection<java.lang.String> strCollection48 = null;
        java.util.List<java.lang.String> strList49 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList46, strCollection48);
        java.util.Collection<java.lang.String> strCollection50 = null;
        java.util.Locale.FilteringMode filteringMode51 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList52 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList46, strCollection50, filteringMode51);
        boolean boolean53 = strSet25.retainAll((java.util.Collection<java.lang.String>) strList52);
        boolean boolean54 = ethiopicChronology2.equals((java.lang.Object) boolean53);
        org.joda.time.DurationField durationField55 = ethiopicChronology2.eras();
        org.joda.time.DurationField durationField56 = ethiopicChronology2.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField7 and durationField55", Math.signum(durationField7.compareTo(durationField55)) == -Math.signum(durationField55.compareTo(durationField7)));
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology1.centuryOfEra();
        org.joda.time.DurationField durationField4 = ethiopicChronology1.millis();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology1.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology1.secondOfDay();
        org.joda.time.DurationField durationField8 = ethiopicChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology1.weekOfWeekyear();
        long long13 = ethiopicChronology1.add(1447226291425675L, 1193987359755L, 680);
        org.joda.time.DurationField durationField14 = ethiopicChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField14, durationField4, and durationField8", !(durationField14.compareTo(durationField4) == 0) || (Math.signum(durationField14.compareTo(durationField8)) == Math.signum(durationField4.compareTo(durationField8))));
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology1.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.Chronology chronology5 = ethiopicChronology1.withZone(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology1.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology1.hourOfHalfday();
        org.joda.time.DurationField durationField9 = ethiopicChronology1.eras();
        org.joda.time.DurationField durationField10 = ethiopicChronology1.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField10, and durationField9", !(durationField9.compareTo(durationField10) == 0) || (Math.signum(durationField9.compareTo(durationField9)) == Math.signum(durationField10.compareTo(durationField9))));
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology1.secondOfDay();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology1.secondOfDay();
        org.joda.time.DurationField durationField5 = ethiopicChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.clockhourOfHalfday();
        org.joda.time.DurationField durationField7 = ethiopicChronology1.weeks();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology9 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone8);
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology9.clockhourOfDay();
        org.joda.time.DurationField durationField11 = ethiopicChronology9.weekyears();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology9.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone13 = ethiopicChronology9.getZone();
        java.lang.String str14 = dateTimeZone13.getID();
        int int16 = dateTimeZone13.getStandardOffset((long) (-1));
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime(chronology17);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime18.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime18.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.DateTime dateTime26 = localDateTime24.toDateTime(readableInstant25);
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = null;
        boolean boolean28 = dateTime26.isSupported(dateTimeFieldType27);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime(chronology29);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime30.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime30.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime30.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.DateTime dateTime38 = localDateTime36.toDateTime(readableInstant37);
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = null;
        boolean boolean40 = dateTime38.isSupported(dateTimeFieldType39);
        int int41 = dateTime26.compareTo((org.joda.time.ReadableInstant) dateTime38);
        int int42 = dateTimeZone13.getOffset((org.joda.time.ReadableInstant) dateTime26);
        org.joda.time.Chronology chronology43 = ethiopicChronology1.withZone(dateTimeZone13);
        org.joda.time.DateTimeField dateTimeField44 = ethiopicChronology1.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone45 = ethiopicChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField46 = ethiopicChronology1.millisOfDay();
        org.joda.time.DurationField durationField47 = ethiopicChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField47, durationField5, and durationField11", !(durationField47.compareTo(durationField5) == 0) || (Math.signum(durationField47.compareTo(durationField11)) == Math.signum(durationField5.compareTo(durationField11))));
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DurationField durationField4 = ethiopicChronology1.centuries();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology1.weekyear();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.yearOfEra();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology1.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology1.millisOfDay();
        org.joda.time.DurationField durationField9 = ethiopicChronology1.centuries();
        org.joda.time.DurationField durationField10 = ethiopicChronology1.years();
        java.lang.String str11 = ethiopicChronology1.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField10", (durationField3.compareTo(durationField10) == 0) == durationField3.equals(durationField10));
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology1.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.Chronology chronology5 = ethiopicChronology1.withZone(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology1.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology1.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology10 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology10.hourOfDay();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology10.centuryOfEra();
        org.joda.time.DurationField durationField13 = ethiopicChronology10.millis();
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology10.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField15 = ethiopicChronology10.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField16 = ethiopicChronology10.weekyear();
        org.joda.time.DurationField durationField17 = dateTimeField16.getRangeDurationField();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime(chronology18);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime19.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime19.plusWeeks((int) (byte) 10);
        int int26 = localDateTime25.getMillisOfSecond();
        int int27 = localDateTime25.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime29 = localDateTime25.plusHours((int) (short) -1);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime25.plusWeeks((int) (short) 100);
        java.util.Locale locale32 = java.util.Locale.JAPAN;
        java.lang.String str33 = dateTimeField16.getAsShortText((org.joda.time.ReadablePartial) localDateTime25, locale32);
        int[] intArray35 = ethiopicChronology1.get((org.joda.time.ReadablePartial) localDateTime25, 1193987443716L);
        java.lang.Object obj36 = null;
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology38 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone37);
        org.joda.time.DateTimeField dateTimeField39 = ethiopicChronology38.hourOfDay();
        org.joda.time.DateTimeField dateTimeField40 = ethiopicChronology38.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.Chronology chronology42 = ethiopicChronology38.withZone(dateTimeZone41);
        org.joda.time.DateTimeField dateTimeField43 = ethiopicChronology38.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField44 = ethiopicChronology38.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField45 = ethiopicChronology38.hourOfHalfday();
        org.joda.time.DurationField durationField46 = ethiopicChronology38.eras();
        org.joda.time.DateTimeZone dateTimeZone47 = ethiopicChronology38.getZone();
        org.joda.time.LocalDateTime localDateTime48 = new org.joda.time.LocalDateTime(obj36, dateTimeZone47);
        org.joda.time.Chronology chronology49 = ethiopicChronology1.withZone(dateTimeZone47);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField13 and durationField46", Math.signum(durationField13.compareTo(durationField46)) == -Math.signum(durationField46.compareTo(durationField13)));
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology2 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology2.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology2.secondOfDay();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology2.secondOfDay();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) 10, (org.joda.time.Chronology) ethiopicChronology2);
        org.joda.time.DurationField durationField7 = ethiopicChronology2.days();
        org.joda.time.DateTimeZone dateTimeZone8 = ethiopicChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology2.weekyear();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology2.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology2.yearOfCentury();
        org.joda.time.DurationField durationField12 = ethiopicChronology2.eras();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology2.yearOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField7 and durationField12", Math.signum(durationField7.compareTo(durationField12)) == -Math.signum(durationField12.compareTo(durationField7)));
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
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
        org.joda.time.LocalDateTime localDateTime17 = localDateTime11.withYearOfCentury(0);
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.weekyear();
        org.joda.time.LocalDateTime localDateTime20 = property18.setCopy((int) (byte) 1);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime(chronology21);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime22.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime22.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime22.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.DateTime dateTime30 = localDateTime28.toDateTime(readableInstant29);
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = null;
        boolean boolean32 = dateTime30.isSupported(dateTimeFieldType31);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime(chronology33);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime34.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime38 = localDateTime34.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime40 = localDateTime34.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant41 = null;
        org.joda.time.DateTime dateTime42 = localDateTime40.toDateTime(readableInstant41);
        org.joda.time.DateTimeFieldType dateTimeFieldType43 = null;
        boolean boolean44 = dateTime42.isSupported(dateTimeFieldType43);
        int int45 = dateTime30.compareTo((org.joda.time.ReadableInstant) dateTime42);
        int int46 = property18.compareTo((org.joda.time.ReadableInstant) dateTime42);
        boolean boolean47 = dateTime9.isEqual((org.joda.time.ReadableInstant) dateTime42);
        org.joda.time.DateTimeZone dateTimeZone48 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology49 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone48);
        org.joda.time.DateTimeField dateTimeField50 = ethiopicChronology49.hourOfDay();
        org.joda.time.DateTimeField dateTimeField51 = ethiopicChronology49.secondOfDay();
        org.joda.time.DateTimeField dateTimeField52 = ethiopicChronology49.secondOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType53 = dateTimeField52.getType();
        boolean boolean54 = dateTime42.isSupported(dateTimeFieldType53);
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.LocalDateTime localDateTime56 = new org.joda.time.LocalDateTime(chronology55);
        org.joda.time.LocalDateTime localDateTime58 = localDateTime56.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime60 = localDateTime56.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime62 = localDateTime56.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant63 = null;
        org.joda.time.DateTime dateTime64 = localDateTime62.toDateTime(readableInstant63);
        java.util.Locale locale65 = java.util.Locale.GERMANY;
        boolean boolean66 = locale65.hasExtensions();
        boolean boolean67 = dateTime64.equals((java.lang.Object) locale65);
        java.lang.String str68 = dateTime64.toString();
        long long69 = dateTime64.getMillis();
        boolean boolean70 = dateTime42.isBefore((org.joda.time.ReadableInstant) dateTime64);
        org.joda.time.Instant instant71 = dateTime64.toInstant();
        org.joda.time.ReadableInstant readableInstant72 = null;
        boolean boolean73 = dateTime64.isBefore(readableInstant72);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and instant71", (dateTime9.compareTo(instant71) == 0) == dateTime9.equals(instant71));
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = ethiopicChronology1.getZone();
        org.joda.time.DurationField durationField6 = ethiopicChronology1.days();
        org.joda.time.DurationField durationField7 = ethiopicChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField7, durationField3, and durationField6", !(durationField7.compareTo(durationField3) == 0) || (Math.signum(durationField7.compareTo(durationField6)) == Math.signum(durationField3.compareTo(durationField6))));
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology1.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.Chronology chronology5 = ethiopicChronology1.withZone(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.millisOfSecond();
        org.joda.time.DurationField durationField7 = ethiopicChronology1.eras();
        org.joda.time.Chronology chronology8 = ethiopicChronology1.withUTC();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology1.millisOfDay();
        org.joda.time.DurationField durationField10 = ethiopicChronology1.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField7, durationField10, and durationField7", !(durationField7.compareTo(durationField10) == 0) || (Math.signum(durationField7.compareTo(durationField7)) == Math.signum(durationField10.compareTo(durationField7))));
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology1.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology1.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology1.secondOfDay();
        org.joda.time.DurationField durationField6 = ethiopicChronology1.minutes();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology1.clockhourOfHalfday();
        org.joda.time.DurationField durationField8 = ethiopicChronology1.hours();
        org.joda.time.DurationField durationField9 = ethiopicChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField6, and durationField8", !(durationField9.compareTo(durationField6) == 0) || (Math.signum(durationField9.compareTo(durationField8)) == Math.signum(durationField6.compareTo(durationField8))));
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology1.centuryOfEra();
        org.joda.time.DurationField durationField4 = ethiopicChronology1.millis();
        int int5 = ethiopicChronology1.getMinimumDaysInFirstWeek();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = ethiopicChronology1.add(readablePeriod6, 360000087L, 2);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(chronology10);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime11.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime11.plusWeeks((int) (byte) 10);
        int int18 = localDateTime17.getMillisOfSecond();
        int int19 = localDateTime17.getMillisOfSecond();
        org.joda.time.DateTimeField[] dateTimeFieldArray20 = localDateTime17.getFields();
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.LocalDateTime localDateTime23 = localDateTime17.withDurationAdded(readableDuration21, 0);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology25 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone24);
        org.joda.time.DateTimeField dateTimeField26 = ethiopicChronology25.hourOfDay();
        org.joda.time.DateTimeField dateTimeField27 = ethiopicChronology25.secondOfDay();
        org.joda.time.DateTimeField dateTimeField28 = ethiopicChronology25.secondOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = dateTimeField28.getType();
        boolean boolean30 = localDateTime23.isSupported(dateTimeFieldType29);
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
        org.joda.time.LocalDateTime localDateTime47 = localDateTime32.withMillisOfSecond((int) (byte) 0);
        boolean boolean48 = localDateTime23.isAfter((org.joda.time.ReadablePartial) localDateTime32);
        org.joda.time.LocalDateTime localDateTime50 = localDateTime32.withYearOfEra((int) (byte) 1);
        int[] intArray52 = ethiopicChronology1.get((org.joda.time.ReadablePartial) localDateTime50, (long) 81);
        org.joda.time.DurationField durationField53 = ethiopicChronology1.days();
        org.joda.time.DurationField durationField54 = ethiopicChronology1.hours();
        org.joda.time.DurationField durationField55 = ethiopicChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField55, durationField4, and durationField53", !(durationField55.compareTo(durationField4) == 0) || (Math.signum(durationField55.compareTo(durationField53)) == Math.signum(durationField4.compareTo(durationField53))));
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology2 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology2.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology2.secondOfDay();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology2.secondOfDay();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) 10, (org.joda.time.Chronology) ethiopicChronology2);
        org.joda.time.DurationField durationField7 = ethiopicChronology2.hours();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology2.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology2.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology2.secondOfDay();
        org.joda.time.DurationField durationField11 = ethiopicChronology2.eras();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology2.year();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField7 and durationField11", Math.signum(durationField7.compareTo(durationField11)) == -Math.signum(durationField11.compareTo(durationField7)));
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology1.secondOfDay();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology1.secondOfDay();
        org.joda.time.DurationField durationField5 = ethiopicChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.clockhourOfHalfday();
        org.joda.time.DurationField durationField7 = ethiopicChronology1.weeks();
        org.joda.time.DurationField durationField8 = ethiopicChronology1.eras();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        long long12 = ethiopicChronology1.add(readablePeriod9, (long) 252, 301);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField5 and durationField8", Math.signum(durationField5.compareTo(durationField8)) == -Math.signum(durationField8.compareTo(durationField5)));
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology1.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.Chronology chronology5 = ethiopicChronology1.withZone(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.millisOfSecond();
        org.joda.time.DurationField durationField7 = ethiopicChronology1.eras();
        org.joda.time.Chronology chronology8 = ethiopicChronology1.withUTC();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology1.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology11 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone10);
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology11.clockhourOfDay();
        org.joda.time.DurationField durationField13 = ethiopicChronology11.weekyears();
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology11.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone15 = ethiopicChronology11.getZone();
        org.joda.time.Chronology chronology16 = ethiopicChronology11.withUTC();
        org.joda.time.DurationField durationField17 = ethiopicChronology11.minutes();
        org.joda.time.DateTimeField dateTimeField18 = ethiopicChronology11.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField19 = ethiopicChronology11.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField20 = ethiopicChronology11.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField21 = ethiopicChronology11.millisOfDay();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime(chronology22);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime23.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.withMillisOfSecond((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime27.withMinuteOfHour(10);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime31.plusMonths(272);
        int int34 = localDateTime33.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime36 = localDateTime33.withMillisOfDay(634);
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forOffsetMillis(30);
        java.util.TimeZone timeZone39 = dateTimeZone38.toTimeZone();
        org.joda.time.DateTime dateTime40 = localDateTime36.toDateTime(dateTimeZone38);
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology42 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone41);
        org.joda.time.DateTimeField dateTimeField43 = ethiopicChronology42.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField44 = ethiopicChronology42.dayOfMonth();
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.LocalDateTime localDateTime46 = new org.joda.time.LocalDateTime(chronology45);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray47 = localDateTime46.getFieldTypes();
        org.joda.time.LocalDateTime localDateTime49 = localDateTime46.withMillisOfDay((int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime51 = localDateTime49.withDayOfYear(53);
        org.joda.time.ReadableDuration readableDuration52 = null;
        org.joda.time.LocalDateTime localDateTime53 = localDateTime49.plus(readableDuration52);
        int[] intArray55 = ethiopicChronology42.get((org.joda.time.ReadablePartial) localDateTime53, (long) 8);
        int int56 = dateTimeField21.getMinimumValue((org.joda.time.ReadablePartial) localDateTime36, intArray55);
        int[] intArray58 = ethiopicChronology1.get((org.joda.time.ReadablePartial) localDateTime36, 73785600020L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField7 and durationField13", Math.signum(durationField7.compareTo(durationField13)) == -Math.signum(durationField13.compareTo(durationField7)));
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = ethiopicChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.monthOfYear();
        org.joda.time.DurationField durationField7 = ethiopicChronology1.seconds();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology9 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone8);
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology9.clockhourOfDay();
        org.joda.time.DurationField durationField11 = ethiopicChronology9.weekyears();
        org.joda.time.DurationField durationField12 = ethiopicChronology9.hours();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology9.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology9.hourOfDay();
        org.joda.time.DateTimeField dateTimeField15 = ethiopicChronology9.yearOfEra();
        org.joda.time.DurationField durationField16 = ethiopicChronology9.weekyears();
        org.joda.time.DateTimeField dateTimeField17 = ethiopicChronology9.dayOfYear();
        org.joda.time.DurationField durationField18 = ethiopicChronology9.hours();
        boolean boolean19 = ethiopicChronology1.equals((java.lang.Object) durationField18);
        org.joda.time.DateTimeZone dateTimeZone20 = ethiopicChronology1.getZone();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime(chronology21);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime22.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime22.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime26.withMillisOfSecond((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime26.minusHours((int) (short) -1);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime26.withCenturyOfEra(53);
        org.joda.time.DateTime dateTime33 = localDateTime32.toDateTime();
        long long35 = ethiopicChronology1.set((org.joda.time.ReadablePartial) localDateTime32, 62391945600000L);
        org.joda.time.DurationField durationField36 = ethiopicChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField36, durationField3, and durationField7", !(durationField36.compareTo(durationField3) == 0) || (Math.signum(durationField36.compareTo(durationField7)) == Math.signum(durationField3.compareTo(durationField7))));
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.dayOfMonth();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime(chronology3);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime4.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime4.plusWeeks((int) (byte) 10);
        java.util.Locale locale11 = java.util.Locale.PRC;
        java.lang.String str12 = dateTimeField2.getAsText((org.joda.time.ReadablePartial) localDateTime10, locale11);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(chronology13);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime14.withMillisOfSecond((int) (byte) 1);
        java.util.Locale locale20 = java.util.Locale.JAPAN;
        java.lang.String str21 = dateTimeField2.getAsText((org.joda.time.ReadablePartial) localDateTime14, 2022, locale20);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology24 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField25 = ethiopicChronology24.hourOfDay();
        org.joda.time.DateTimeField dateTimeField26 = ethiopicChronology24.secondOfDay();
        org.joda.time.DateTimeField dateTimeField27 = ethiopicChronology24.secondOfDay();
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime((long) 10, (org.joda.time.Chronology) ethiopicChronology24);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime28.withDayOfYear((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime30.plusDays(0);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime14.withFields((org.joda.time.ReadablePartial) localDateTime32);
        int int34 = localDateTime33.getMillisOfDay();
        org.joda.time.DateTime dateTime35 = localDateTime33.toDateTime();
        org.joda.time.Chronology chronology36 = dateTime35.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on localDateTime30 and localDateTime33", (localDateTime30.compareTo(localDateTime33) == 0) == localDateTime30.equals(localDateTime33));
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = ethiopicChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.monthOfYear();
        org.joda.time.DurationField durationField7 = ethiopicChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology1.millisOfSecond();
        org.joda.time.DurationField durationField9 = ethiopicChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology1.hourOfHalfday();
        org.joda.time.DurationField durationField11 = dateTimeField10.getRangeDurationField();
        long long13 = dateTimeField10.roundHalfFloor(815L);
        long long16 = dateTimeField10.addWrapField(1307L, 1962);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology18 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone17);
        org.joda.time.DateTimeField dateTimeField19 = ethiopicChronology18.clockhourOfDay();
        long long23 = ethiopicChronology18.add((long) '#', (long) 'a', (int) '#');
        org.joda.time.DateTimeField dateTimeField24 = ethiopicChronology18.hourOfHalfday();
        org.joda.time.DurationField durationField25 = ethiopicChronology18.minutes();
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime(chronology26);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime27.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime27.plusWeeks((int) (byte) 10);
        int int34 = localDateTime33.getMillisOfSecond();
        int int35 = localDateTime33.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property36 = localDateTime33.millisOfDay();
        org.joda.time.ReadableDuration readableDuration37 = null;
        org.joda.time.LocalDateTime localDateTime38 = localDateTime33.plus(readableDuration37);
        org.joda.time.ReadablePeriod readablePeriod39 = null;
        org.joda.time.LocalDateTime localDateTime41 = localDateTime38.withPeriodAdded(readablePeriod39, 28);
        long long43 = ethiopicChronology18.set((org.joda.time.ReadablePartial) localDateTime41, (long) 197);
        java.lang.String str44 = localDateTime41.toString();
        org.joda.time.LocalDateTime.Property property45 = localDateTime41.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime47 = localDateTime41.minusSeconds(143);
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology50 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone49);
        org.joda.time.DateTimeField dateTimeField51 = ethiopicChronology50.hourOfDay();
        org.joda.time.DateTimeField dateTimeField52 = ethiopicChronology50.secondOfDay();
        org.joda.time.DateTimeField dateTimeField53 = ethiopicChronology50.secondOfDay();
        org.joda.time.DurationField durationField54 = ethiopicChronology50.weeks();
        org.joda.time.DateTimeField dateTimeField55 = ethiopicChronology50.clockhourOfHalfday();
        org.joda.time.DurationField durationField56 = ethiopicChronology50.weeks();
        org.joda.time.DurationField durationField57 = ethiopicChronology50.years();
        org.joda.time.Chronology chronology58 = null;
        org.joda.time.LocalDateTime localDateTime59 = new org.joda.time.LocalDateTime(chronology58);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray60 = localDateTime59.getFieldTypes();
        org.joda.time.LocalDateTime localDateTime62 = localDateTime59.withMillisOfDay((int) (byte) 0);
        int int63 = localDateTime62.getYear();
        org.joda.time.ReadableInstant readableInstant64 = null;
        org.joda.time.DateTime dateTime65 = localDateTime62.toDateTime(readableInstant64);
        org.joda.time.DateTimeZone dateTimeZone66 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology67 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone66);
        org.joda.time.DateTimeField dateTimeField68 = ethiopicChronology67.hourOfDay();
        org.joda.time.DurationField durationField69 = ethiopicChronology67.days();
        org.joda.time.Chronology chronology70 = null;
        org.joda.time.LocalDateTime localDateTime71 = new org.joda.time.LocalDateTime(chronology70);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray72 = localDateTime71.getFieldTypes();
        org.joda.time.LocalDateTime localDateTime74 = localDateTime71.withMillisOfDay((int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime76 = localDateTime74.plusSeconds((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone78 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime79 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime76, dateTimeZone78);
        int[] intArray81 = ethiopicChronology67.get((org.joda.time.ReadablePartial) localDateTime79, 31450177L);
        ethiopicChronology50.validate((org.joda.time.ReadablePartial) localDateTime62, intArray81);
        int[] intArray84 = dateTimeField10.addWrapField((org.joda.time.ReadablePartial) localDateTime41, 0, intArray81, 314);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField57", (durationField3.compareTo(durationField57) == 0) == durationField3.equals(durationField57));
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = ethiopicChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField7 = ethiopicChronology1.eras();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(chronology8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime9.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime9.plusWeeks((int) (byte) 10);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(chronology16);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime17.withMillisOfSecond((int) (byte) 1);
        int int22 = localDateTime9.compareTo((org.joda.time.ReadablePartial) localDateTime17);
        org.joda.time.LocalDateTime.Property property23 = localDateTime17.weekyear();
        org.joda.time.LocalDateTime.Property property24 = localDateTime17.millisOfDay();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime(chronology25);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime26.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime26.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime26.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.DateTime dateTime34 = localDateTime32.toDateTime(readableInstant33);
        java.util.Locale locale35 = java.util.Locale.GERMANY;
        boolean boolean36 = locale35.hasExtensions();
        boolean boolean37 = dateTime34.equals((java.lang.Object) locale35);
        long long38 = property24.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime34);
        org.joda.time.LocalDateTime localDateTime40 = property24.setCopy("1962");
        org.joda.time.LocalDateTime localDateTime42 = localDateTime40.minusHours(4);
        org.joda.time.LocalDateTime.Property property43 = localDateTime42.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime44 = property43.getLocalDateTime();
        long long46 = ethiopicChronology1.set((org.joda.time.ReadablePartial) localDateTime44, 4345907651L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField7", Math.signum(durationField3.compareTo(durationField7)) == -Math.signum(durationField7.compareTo(durationField3)));
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        java.lang.String[] strArray9 = new java.lang.String[] { "de_DE", "", "", "7", "3", "UTC", "24", "2022-02-15T07:08:12.450", "2022-02-15T07:08:12.450" };
        java.util.LinkedHashSet<java.lang.String> strSet10 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet10, strArray9);
        java.util.Set<java.lang.String> strSet12 = org.joda.time.DateTimeZone.getAvailableIDs();
        boolean boolean13 = strSet10.addAll((java.util.Collection<java.lang.String>) strSet12);
        int int14 = strSet10.size();
        java.util.stream.Stream<java.lang.String> strStream15 = strSet10.parallelStream();
        java.lang.String[] strArray25 = new java.lang.String[] { "de_DE", "", "", "7", "3", "UTC", "24", "2022-02-15T07:08:12.450", "2022-02-15T07:08:12.450" };
        java.util.LinkedHashSet<java.lang.String> strSet26 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet26, strArray25);
        java.util.Set<java.lang.String> strSet28 = org.joda.time.DateTimeZone.getAvailableIDs();
        boolean boolean29 = strSet26.addAll((java.util.Collection<java.lang.String>) strSet28);
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology31 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone30);
        org.joda.time.DateTimeField dateTimeField32 = ethiopicChronology31.hourOfDay();
        org.joda.time.DateTimeField dateTimeField33 = ethiopicChronology31.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.Chronology chronology35 = ethiopicChronology31.withZone(dateTimeZone34);
        org.joda.time.DateTimeField dateTimeField36 = ethiopicChronology31.millisOfSecond();
        boolean boolean37 = strSet26.contains((java.lang.Object) ethiopicChronology31);
        java.util.stream.Stream<java.lang.String> strStream38 = strSet26.parallelStream();
        boolean boolean39 = strSet10.addAll((java.util.Collection<java.lang.String>) strSet26);
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology41 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone40);
        org.joda.time.DateTimeField dateTimeField42 = ethiopicChronology41.clockhourOfDay();
        org.joda.time.DurationField durationField43 = ethiopicChronology41.weekyears();
        org.joda.time.DateTimeField dateTimeField44 = ethiopicChronology41.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 10);
        java.lang.String str48 = dateTimeZone46.getShortName((long) 1);
        org.joda.time.Chronology chronology49 = ethiopicChronology41.withZone(dateTimeZone46);
        boolean boolean50 = strSet10.contains((java.lang.Object) ethiopicChronology41);
        org.joda.time.DateTimeField dateTimeField51 = ethiopicChronology41.clockhourOfHalfday();
        org.joda.time.LocalDateTime localDateTime52 = new org.joda.time.LocalDateTime((org.joda.time.Chronology) ethiopicChronology41);
        org.joda.time.DateTimeZone dateTimeZone53 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology54 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone53);
        org.joda.time.DateTimeField dateTimeField55 = ethiopicChronology54.hourOfDay();
        org.joda.time.DateTimeField dateTimeField56 = ethiopicChronology54.secondOfDay();
        org.joda.time.DateTimeField dateTimeField57 = ethiopicChronology54.secondOfDay();
        org.joda.time.Chronology chronology58 = null;
        org.joda.time.LocalDateTime localDateTime59 = new org.joda.time.LocalDateTime(chronology58);
        org.joda.time.LocalDateTime localDateTime61 = localDateTime59.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime63 = localDateTime59.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime65 = localDateTime63.withMillisOfSecond((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime67 = localDateTime63.withMinuteOfHour(10);
        org.joda.time.LocalDateTime localDateTime69 = localDateTime63.minusDays(100);
        org.joda.time.LocalDateTime.Property property70 = localDateTime63.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime72 = localDateTime63.withWeekyear(1439);
        int int73 = localDateTime63.getHourOfDay();
        java.util.Locale locale76 = new java.util.Locale("Greenwich Zeit", "25704839");
        java.lang.String str77 = dateTimeField57.getAsShortText((org.joda.time.ReadablePartial) localDateTime63, locale76);
        org.joda.time.LocalDateTime.Property property78 = localDateTime63.era();
        org.joda.time.LocalDateTime localDateTime79 = localDateTime52.withFields((org.joda.time.ReadablePartial) localDateTime63);
        org.joda.time.LocalDateTime.Property property80 = localDateTime63.yearOfCentury();
        java.lang.String str81 = property80.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on localDateTime63 and localDateTime79", (localDateTime63.compareTo(localDateTime79) == 0) == localDateTime63.equals(localDateTime79));
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = ethiopicChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.monthOfYear();
        org.joda.time.DurationField durationField7 = ethiopicChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology1.millisOfSecond();
        org.joda.time.DurationField durationField9 = ethiopicChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology1.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology1.dayOfYear();
        org.joda.time.DurationField durationField13 = ethiopicChronology1.years();
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology1.yearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField13", (durationField3.compareTo(durationField13) == 0) == durationField3.equals(durationField13));
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = ethiopicChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology1.halfdayOfDay();
        org.joda.time.DurationField durationField8 = ethiopicChronology1.years();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology1.halfdayOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField8", (durationField3.compareTo(durationField8) == 0) == durationField3.equals(durationField8));
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DurationField durationField4 = ethiopicChronology1.centuries();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology1.weekyear();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology1.minuteOfDay();
        org.joda.time.DurationField durationField8 = ethiopicChronology1.years();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology1.secondOfMinute();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField8", (durationField3.compareTo(durationField8) == 0) == durationField3.equals(durationField8));
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime2.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime2.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.DateTime dateTime10 = localDateTime8.toDateTime(readableInstant9);
        java.util.Locale locale11 = java.util.Locale.GERMANY;
        boolean boolean12 = locale11.hasExtensions();
        boolean boolean13 = dateTime10.equals((java.lang.Object) locale11);
        java.lang.String str14 = locale0.getDisplayCountry(locale11);
        java.util.Locale locale15 = locale11.stripExtensions();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetMillis(548);
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
        org.joda.time.LocalDateTime.Property property35 = localDateTime27.dayOfWeek();
        boolean boolean36 = dateTimeZone17.isLocalDateTimeGap(localDateTime27);
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 100);
        long long41 = dateTimeZone38.adjustOffset((-31449599999L), false);
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 10);
        long long45 = dateTimeZone38.getMillisKeepLocal(dateTimeZone43, (long) 'a');
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology47 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone46);
        org.joda.time.DateTimeField dateTimeField48 = ethiopicChronology47.clockhourOfDay();
        org.joda.time.DurationField durationField49 = ethiopicChronology47.weekyears();
        org.joda.time.DateTimeField dateTimeField50 = ethiopicChronology47.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone51 = ethiopicChronology47.getZone();
        java.lang.String str52 = dateTimeZone51.getID();
        int int54 = dateTimeZone51.getStandardOffset((long) (-1));
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.LocalDateTime localDateTime56 = new org.joda.time.LocalDateTime(chronology55);
        org.joda.time.LocalDateTime localDateTime58 = localDateTime56.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime60 = localDateTime56.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime62 = localDateTime56.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant63 = null;
        org.joda.time.DateTime dateTime64 = localDateTime62.toDateTime(readableInstant63);
        org.joda.time.DateTimeFieldType dateTimeFieldType65 = null;
        boolean boolean66 = dateTime64.isSupported(dateTimeFieldType65);
        org.joda.time.Chronology chronology67 = null;
        org.joda.time.LocalDateTime localDateTime68 = new org.joda.time.LocalDateTime(chronology67);
        org.joda.time.LocalDateTime localDateTime70 = localDateTime68.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime72 = localDateTime68.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime74 = localDateTime68.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant75 = null;
        org.joda.time.DateTime dateTime76 = localDateTime74.toDateTime(readableInstant75);
        org.joda.time.DateTimeFieldType dateTimeFieldType77 = null;
        boolean boolean78 = dateTime76.isSupported(dateTimeFieldType77);
        int int79 = dateTime64.compareTo((org.joda.time.ReadableInstant) dateTime76);
        int int80 = dateTimeZone51.getOffset((org.joda.time.ReadableInstant) dateTime64);
        org.joda.time.Instant instant81 = dateTime64.toInstant();
        int int82 = dateTimeZone38.getOffset((org.joda.time.ReadableInstant) instant81);
        org.joda.time.DateTime dateTime83 = localDateTime27.toDateTime((org.joda.time.ReadableInstant) instant81);
        boolean boolean84 = locale11.equals((java.lang.Object) localDateTime27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and instant81", (dateTime10.compareTo(instant81) == 0) == dateTime10.equals(instant81));
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology1.secondOfDay();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology1.secondOfDay();
        org.joda.time.DurationField durationField5 = ethiopicChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.clockhourOfHalfday();
        org.joda.time.DurationField durationField7 = ethiopicChronology1.weeks();
        org.joda.time.DurationField durationField8 = ethiopicChronology1.eras();
        org.joda.time.LocalDateTime localDateTime9 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) ethiopicChronology1);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField5 and durationField8", Math.signum(durationField5.compareTo(durationField8)) == -Math.signum(durationField8.compareTo(durationField5)));
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.withYearOfCentury(0);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.weekyear();
        org.joda.time.LocalDateTime localDateTime9 = property8.withMaximumValue();
        int int10 = localDateTime9.getWeekyear();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(chronology11);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime12.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime12.withYearOfCentury(0);
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.weekyear();
        org.joda.time.LocalDateTime localDateTime21 = property19.setCopy((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime9.withFields((org.joda.time.ReadablePartial) localDateTime21);
        org.joda.time.LocalDateTime.Property property23 = localDateTime21.hourOfDay();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime(chronology24);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime25.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime25.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime25.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.DateTime dateTime33 = localDateTime31.toDateTime(readableInstant32);
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime(chronology34);
        org.joda.time.LocalDateTime localDateTime37 = localDateTime35.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime39 = localDateTime35.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime41 = localDateTime35.withYearOfCentury(0);
        org.joda.time.LocalDateTime.Property property42 = localDateTime41.weekyear();
        org.joda.time.LocalDateTime localDateTime44 = property42.setCopy((int) (byte) 1);
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.LocalDateTime localDateTime46 = new org.joda.time.LocalDateTime(chronology45);
        org.joda.time.LocalDateTime localDateTime48 = localDateTime46.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime50 = localDateTime46.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime52 = localDateTime46.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant53 = null;
        org.joda.time.DateTime dateTime54 = localDateTime52.toDateTime(readableInstant53);
        org.joda.time.DateTimeFieldType dateTimeFieldType55 = null;
        boolean boolean56 = dateTime54.isSupported(dateTimeFieldType55);
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.LocalDateTime localDateTime58 = new org.joda.time.LocalDateTime(chronology57);
        org.joda.time.LocalDateTime localDateTime60 = localDateTime58.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime62 = localDateTime58.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime64 = localDateTime58.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant65 = null;
        org.joda.time.DateTime dateTime66 = localDateTime64.toDateTime(readableInstant65);
        org.joda.time.DateTimeFieldType dateTimeFieldType67 = null;
        boolean boolean68 = dateTime66.isSupported(dateTimeFieldType67);
        int int69 = dateTime54.compareTo((org.joda.time.ReadableInstant) dateTime66);
        int int70 = property42.compareTo((org.joda.time.ReadableInstant) dateTime66);
        boolean boolean71 = dateTime33.isEqual((org.joda.time.ReadableInstant) dateTime66);
        org.joda.time.Chronology chronology72 = null;
        org.joda.time.LocalDateTime localDateTime73 = new org.joda.time.LocalDateTime(chronology72);
        org.joda.time.LocalDateTime localDateTime75 = localDateTime73.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime77 = localDateTime73.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime79 = localDateTime73.plusWeeks((int) (byte) 10);
        org.joda.time.Chronology chronology80 = null;
        org.joda.time.LocalDateTime localDateTime81 = new org.joda.time.LocalDateTime(chronology80);
        org.joda.time.LocalDateTime localDateTime83 = localDateTime81.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime85 = localDateTime81.withMillisOfSecond((int) (byte) 1);
        int int86 = localDateTime73.compareTo((org.joda.time.ReadablePartial) localDateTime81);
        org.joda.time.LocalDateTime.Property property87 = localDateTime81.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType88 = property87.getFieldType();
        boolean boolean89 = dateTime66.isSupported(dateTimeFieldType88);
        java.lang.String str90 = dateTime66.toString();
        org.joda.time.Instant instant91 = dateTime66.toInstant();
        int int92 = property23.getDifference((org.joda.time.ReadableInstant) instant91);
        int int93 = property23.getMinimumValue();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime33 and instant91", (dateTime33.compareTo(instant91) == 0) == dateTime33.equals(instant91));
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology1.centuryOfEra();
        org.joda.time.DurationField durationField4 = ethiopicChronology1.millis();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology1.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone6 = ethiopicChronology1.getZone();
        java.lang.String str7 = dateTimeZone6.getID();
        long long9 = dateTimeZone6.convertUTCToLocal((long) 10);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology10 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone6);
        org.joda.time.DurationField durationField11 = ethiopicChronology10.centuries();
        org.joda.time.DurationField durationField12 = ethiopicChronology10.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField12, durationField4, and durationField11", !(durationField12.compareTo(durationField4) == 0) || (Math.signum(durationField12.compareTo(durationField11)) == Math.signum(durationField4.compareTo(durationField11))));
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology1.dayOfMonth();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(chronology4);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray6 = localDateTime5.getFieldTypes();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.withMillisOfDay((int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.withDayOfYear(53);
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.LocalDateTime localDateTime12 = localDateTime8.plus(readableDuration11);
        int[] intArray14 = ethiopicChronology1.get((org.joda.time.ReadablePartial) localDateTime12, (long) 8);
        java.lang.String str15 = ethiopicChronology1.toString();
        org.joda.time.DurationField durationField16 = ethiopicChronology1.eras();
        org.joda.time.DurationField durationField17 = ethiopicChronology1.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField16, durationField17, and durationField16", !(durationField16.compareTo(durationField17) == 0) || (Math.signum(durationField16.compareTo(durationField16)) == Math.signum(durationField17.compareTo(durationField16))));
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DurationField durationField4 = ethiopicChronology1.centuries();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology1.weekyear();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.yearOfEra();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology1.weekyear();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology1.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology1.hourOfDay();
        org.joda.time.DurationField durationField10 = ethiopicChronology1.years();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology1.millisOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField10", (durationField3.compareTo(durationField10) == 0) == durationField3.equals(durationField10));
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.dayOfMonth();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime(chronology3);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime4.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime4.plusWeeks((int) (byte) 10);
        java.util.Locale locale11 = java.util.Locale.PRC;
        java.lang.String str12 = dateTimeField2.getAsText((org.joda.time.ReadablePartial) localDateTime10, locale11);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(chronology13);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime14.withMillisOfSecond((int) (byte) 1);
        java.util.Locale locale20 = java.util.Locale.JAPAN;
        java.lang.String str21 = dateTimeField2.getAsText((org.joda.time.ReadablePartial) localDateTime14, 2022, locale20);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology24 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField25 = ethiopicChronology24.hourOfDay();
        org.joda.time.DateTimeField dateTimeField26 = ethiopicChronology24.secondOfDay();
        org.joda.time.DateTimeField dateTimeField27 = ethiopicChronology24.secondOfDay();
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime((long) 10, (org.joda.time.Chronology) ethiopicChronology24);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime28.withDayOfYear((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime30.plusDays(0);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime14.withFields((org.joda.time.ReadablePartial) localDateTime32);
        org.joda.time.LocalDateTime localDateTime35 = localDateTime33.plusYears(2044);
        org.joda.time.LocalDateTime localDateTime37 = localDateTime35.plusMinutes(842);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on localDateTime30 and localDateTime33", (localDateTime30.compareTo(localDateTime33) == 0) == localDateTime30.equals(localDateTime33));
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = ethiopicChronology1.getZone();
        org.joda.time.Chronology chronology6 = ethiopicChronology1.withUTC();
        org.joda.time.DurationField durationField7 = ethiopicChronology1.days();
        org.joda.time.DurationField durationField8 = ethiopicChronology1.hours();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology1.weekyear();
        org.joda.time.DurationField durationField10 = ethiopicChronology1.years();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(chronology11);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime12.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime12.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.DateTime dateTime20 = localDateTime18.toDateTime(readableInstant19);
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = null;
        boolean boolean22 = dateTime20.isSupported(dateTimeFieldType21);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime(chronology23);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime24.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime24.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime24.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.DateTime dateTime32 = localDateTime30.toDateTime(readableInstant31);
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = null;
        boolean boolean34 = dateTime32.isSupported(dateTimeFieldType33);
        int int35 = dateTime20.compareTo((org.joda.time.ReadableInstant) dateTime32);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime(chronology36);
        org.joda.time.LocalDateTime localDateTime39 = localDateTime37.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime41 = localDateTime37.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime43 = localDateTime37.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.DateTime dateTime45 = localDateTime43.toDateTime(readableInstant44);
        java.util.Locale locale46 = java.util.Locale.GERMANY;
        boolean boolean47 = locale46.hasExtensions();
        boolean boolean48 = dateTime45.equals((java.lang.Object) locale46);
        boolean boolean49 = dateTime32.isAfter((org.joda.time.ReadableInstant) dateTime45);
        org.joda.time.DateTimeZone dateTimeZone50 = dateTime45.getZone();
        org.joda.time.LocalDateTime localDateTime51 = new org.joda.time.LocalDateTime(dateTimeZone50);
        java.util.TimeZone timeZone52 = dateTimeZone50.toTimeZone();
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.LocalDateTime localDateTime54 = new org.joda.time.LocalDateTime(chronology53);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray55 = localDateTime54.getFieldTypes();
        org.joda.time.LocalDateTime localDateTime57 = localDateTime54.withMillisOfDay((int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime59 = localDateTime57.plusWeeks((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone60 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology61 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone60);
        org.joda.time.DateTimeField dateTimeField62 = ethiopicChronology61.clockhourOfDay();
        org.joda.time.DurationField durationField63 = ethiopicChronology61.weekyears();
        org.joda.time.DurationField durationField64 = ethiopicChronology61.hours();
        org.joda.time.DateTimeField dateTimeField65 = ethiopicChronology61.dayOfMonth();
        org.joda.time.DurationField durationField66 = ethiopicChronology61.months();
        org.joda.time.DurationFieldType durationFieldType67 = durationField66.getType();
        boolean boolean68 = durationField66.isPrecise();
        org.joda.time.DurationFieldType durationFieldType69 = durationField66.getType();
        org.joda.time.LocalDateTime localDateTime71 = localDateTime59.withFieldAdded(durationFieldType69, (-292275054));
        org.joda.time.LocalDateTime localDateTime73 = localDateTime71.withCenturyOfEra(723);
        boolean boolean74 = dateTimeZone50.isLocalDateTimeGap(localDateTime73);
        org.joda.time.Chronology chronology75 = ethiopicChronology1.withZone(dateTimeZone50);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField10", (durationField3.compareTo(durationField10) == 0) == durationField3.equals(durationField10));
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology1.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.Chronology chronology5 = ethiopicChronology1.withZone(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.millisOfSecond();
        org.joda.time.DurationField durationField7 = ethiopicChronology1.eras();
        org.joda.time.Chronology chronology8 = ethiopicChronology1.withUTC();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology1.millisOfDay();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology1.dayOfWeek();
        org.joda.time.DurationField durationField11 = ethiopicChronology1.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField7, durationField11, and durationField7", !(durationField7.compareTo(durationField11) == 0) || (Math.signum(durationField7.compareTo(durationField7)) == Math.signum(durationField11.compareTo(durationField7))));
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        java.lang.String[] strArray10 = new java.lang.String[] { "de_DE", "", "", "7", "3", "UTC", "24", "2022-02-15T07:08:12.450", "2022-02-15T07:08:12.450" };
        java.util.LinkedHashSet<java.lang.String> strSet11 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet11, strArray10);
        java.util.Set<java.lang.String> strSet13 = org.joda.time.DateTimeZone.getAvailableIDs();
        boolean boolean14 = strSet11.addAll((java.util.Collection<java.lang.String>) strSet13);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology16 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField17 = ethiopicChronology16.hourOfDay();
        org.joda.time.DateTimeField dateTimeField18 = ethiopicChronology16.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.Chronology chronology20 = ethiopicChronology16.withZone(dateTimeZone19);
        org.joda.time.DateTimeField dateTimeField21 = ethiopicChronology16.millisOfSecond();
        boolean boolean22 = strSet11.contains((java.lang.Object) ethiopicChronology16);
        org.joda.time.DateTimeField dateTimeField23 = ethiopicChronology16.minuteOfDay();
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime((long) (byte) 1, (org.joda.time.Chronology) ethiopicChronology16);
        java.lang.String str26 = localDateTime24.toString("de_DE");
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology28 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone27);
        org.joda.time.DateTimeField dateTimeField29 = ethiopicChronology28.hourOfDay();
        org.joda.time.DateTimeField dateTimeField30 = ethiopicChronology28.centuryOfEra();
        org.joda.time.DurationField durationField31 = ethiopicChronology28.millis();
        org.joda.time.DateTimeField dateTimeField32 = ethiopicChronology28.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField33 = ethiopicChronology28.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField34 = ethiopicChronology28.secondOfDay();
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.LocalDateTime localDateTime36 = new org.joda.time.LocalDateTime(chronology35);
        org.joda.time.LocalDateTime localDateTime38 = localDateTime36.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime40 = localDateTime36.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime42 = localDateTime36.plusWeeks((int) (byte) 10);
        int int43 = localDateTime42.getMillisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology45 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone44);
        org.joda.time.DateTimeField dateTimeField46 = ethiopicChronology45.clockhourOfDay();
        org.joda.time.DurationField durationField47 = ethiopicChronology45.weekyears();
        org.joda.time.DateTimeField dateTimeField48 = ethiopicChronology45.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField49 = ethiopicChronology45.dayOfWeek();
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.LocalDateTime localDateTime51 = new org.joda.time.LocalDateTime(chronology50);
        org.joda.time.LocalDateTime localDateTime53 = localDateTime51.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime55 = localDateTime51.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime57 = localDateTime51.plusWeeks((int) (byte) 10);
        int int58 = localDateTime57.getMillisOfSecond();
        int int59 = localDateTime57.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime61 = localDateTime57.plusHours((int) (short) -1);
        int int62 = localDateTime57.getDayOfYear();
        int int63 = localDateTime57.getYearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone65 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology66 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone65);
        org.joda.time.DateTimeField dateTimeField67 = ethiopicChronology66.hourOfDay();
        org.joda.time.DateTimeField dateTimeField68 = ethiopicChronology66.secondOfDay();
        org.joda.time.DateTimeField dateTimeField69 = ethiopicChronology66.secondOfDay();
        org.joda.time.LocalDateTime localDateTime70 = new org.joda.time.LocalDateTime((long) 10, (org.joda.time.Chronology) ethiopicChronology66);
        org.joda.time.DurationField durationField71 = ethiopicChronology66.days();
        org.joda.time.DateTimeZone dateTimeZone72 = ethiopicChronology66.getZone();
        org.joda.time.DateTimeZone dateTimeZone73 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology74 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone73);
        org.joda.time.DateTimeField dateTimeField75 = ethiopicChronology74.hourOfDay();
        org.joda.time.DateTimeField dateTimeField76 = ethiopicChronology74.centuryOfEra();
        org.joda.time.DurationField durationField77 = ethiopicChronology74.millis();
        org.joda.time.DateTimeField dateTimeField78 = ethiopicChronology74.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField79 = ethiopicChronology74.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField80 = ethiopicChronology74.weekyear();
        boolean boolean81 = ethiopicChronology66.equals((java.lang.Object) dateTimeField80);
        org.joda.time.Chronology chronology82 = null;
        org.joda.time.LocalDateTime localDateTime83 = new org.joda.time.LocalDateTime(chronology82);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray84 = localDateTime83.getFieldTypes();
        org.joda.time.LocalDateTime localDateTime86 = localDateTime83.withMillisOfDay((int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime88 = localDateTime86.plusWeeks((int) (byte) 10);
        int[] intArray93 = new int[] { 2, 30, 123 };
        int[] intArray95 = dateTimeField80.addWrapPartial((org.joda.time.ReadablePartial) localDateTime86, (int) (byte) 1, intArray93, 0);
        int int96 = dateTimeField49.getMaximumValue((org.joda.time.ReadablePartial) localDateTime57, intArray95);
        int int97 = dateTimeField34.getMinimumValue((org.joda.time.ReadablePartial) localDateTime42, intArray95);
        org.joda.time.LocalDateTime localDateTime98 = localDateTime24.withFields((org.joda.time.ReadablePartial) localDateTime42);
        org.joda.time.LocalDateTime.Property property99 = localDateTime24.dayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on localDateTime42 and localDateTime98", (localDateTime42.compareTo(localDateTime98) == 0) == localDateTime42.equals(localDateTime98));
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = ethiopicChronology1.getZone();
        org.joda.time.Chronology chronology6 = ethiopicChronology1.withUTC();
        org.joda.time.DurationField durationField7 = ethiopicChronology1.minutes();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology1.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology1.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology1.millisOfDay();
        org.joda.time.DurationField durationField12 = ethiopicChronology1.years();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology1.monthOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField12", (durationField3.compareTo(durationField12) == 0) == durationField3.equals(durationField12));
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology2 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology2.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology2.secondOfDay();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology2.secondOfDay();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) 10, (org.joda.time.Chronology) ethiopicChronology2);
        org.joda.time.Chronology chronology7 = ethiopicChronology2.withUTC();
        org.joda.time.DurationField durationField8 = ethiopicChronology2.weekyears();
        org.joda.time.DurationField durationField9 = ethiopicChronology2.eras();
        org.joda.time.DurationField durationField10 = ethiopicChronology2.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField8 and durationField9", Math.signum(durationField8.compareTo(durationField9)) == -Math.signum(durationField9.compareTo(durationField8)));
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = ethiopicChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.monthOfYear();
        org.joda.time.DurationField durationField7 = ethiopicChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology1.millisOfSecond();
        org.joda.time.DurationField durationField9 = ethiopicChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology1.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology1.clockhourOfDay();
        java.lang.String str12 = ethiopicChronology1.toString();
        long long16 = ethiopicChronology1.add((long) 161, (long) (short) 0, 167);
        org.joda.time.DateTimeField dateTimeField17 = ethiopicChronology1.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField18 = ethiopicChronology1.minuteOfDay();
        org.joda.time.DurationField durationField19 = ethiopicChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField19, durationField3, and durationField7", !(durationField19.compareTo(durationField3) == 0) || (Math.signum(durationField19.compareTo(durationField7)) == Math.signum(durationField3.compareTo(durationField7))));
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology1.dayOfMonth();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(chronology4);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray6 = localDateTime5.getFieldTypes();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.withMillisOfDay((int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.withDayOfYear(53);
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.LocalDateTime localDateTime12 = localDateTime8.plus(readableDuration11);
        int[] intArray14 = ethiopicChronology1.get((org.joda.time.ReadablePartial) localDateTime12, (long) 8);
        java.lang.String str15 = ethiopicChronology1.toString();
        org.joda.time.DurationField durationField16 = ethiopicChronology1.eras();
        org.joda.time.DurationField durationField17 = ethiopicChronology1.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField16, durationField17, and durationField16", !(durationField16.compareTo(durationField17) == 0) || (Math.signum(durationField16.compareTo(durationField16)) == Math.signum(durationField17.compareTo(durationField16))));
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology1.secondOfDay();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology1.secondOfDay();
        org.joda.time.DurationField durationField5 = ethiopicChronology1.weeks();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime7.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime7.withYearOfCentury(0);
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.weekyear();
        org.joda.time.LocalDateTime.Property property15 = localDateTime13.secondOfMinute();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(chronology16);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime17.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime17.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.DateTime dateTime25 = localDateTime23.toDateTime(readableInstant24);
        org.joda.time.LocalDateTime.Property property26 = localDateTime23.millisOfDay();
        org.joda.time.Interval interval27 = property26.toInterval();
        boolean boolean28 = localDateTime13.equals((java.lang.Object) property26);
        int[] intArray30 = ethiopicChronology1.get((org.joda.time.ReadablePartial) localDateTime13, (long) 1439);
        org.joda.time.DateTimeField dateTimeField31 = ethiopicChronology1.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField32 = ethiopicChronology1.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField33 = ethiopicChronology1.minuteOfHour();
        org.joda.time.DurationField durationField34 = ethiopicChronology1.years();
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology36 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone35);
        org.joda.time.DateTimeField dateTimeField37 = ethiopicChronology36.hourOfDay();
        org.joda.time.DateTimeField dateTimeField38 = ethiopicChronology36.centuryOfEra();
        org.joda.time.DurationField durationField39 = ethiopicChronology36.millis();
        org.joda.time.DateTimeField dateTimeField40 = ethiopicChronology36.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField41 = ethiopicChronology36.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField42 = ethiopicChronology36.centuryOfEra();
        java.util.TimeZone timeZone43 = java.util.TimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.forTimeZone(timeZone43);
        long long46 = dateTimeZone44.previousTransition((long) 22);
        org.joda.time.Chronology chronology47 = ethiopicChronology36.withZone(dateTimeZone44);
        org.joda.time.Chronology chronology48 = ethiopicChronology1.withZone(dateTimeZone44);
        org.joda.time.DateTimeField dateTimeField49 = ethiopicChronology1.dayOfMonth();
        org.joda.time.DurationField durationField50 = ethiopicChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField51 = ethiopicChronology1.clockhourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField34 and durationField50", (durationField34.compareTo(durationField50) == 0) == durationField34.equals(durationField50));
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = ethiopicChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.monthOfYear();
        org.joda.time.DurationField durationField7 = ethiopicChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology1.millisOfSecond();
        org.joda.time.DurationField durationField9 = ethiopicChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology1.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology1.era();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology1.millisOfSecond();
        org.joda.time.DurationField durationField13 = ethiopicChronology1.years();
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology1.weekOfWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField13", (durationField3.compareTo(durationField13) == 0) == durationField3.equals(durationField13));
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = ethiopicChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.minuteOfDay();
        org.joda.time.DurationField durationField7 = ethiopicChronology1.eras();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology1.hourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField7", Math.signum(durationField3.compareTo(durationField7)) == -Math.signum(durationField7.compareTo(durationField3)));
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        java.lang.String[] strArray9 = new java.lang.String[] { "de_DE", "", "", "7", "3", "UTC", "24", "2022-02-15T07:08:12.450", "2022-02-15T07:08:12.450" };
        java.util.LinkedHashSet<java.lang.String> strSet10 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet10, strArray9);
        java.util.Set<java.lang.String> strSet12 = org.joda.time.DateTimeZone.getAvailableIDs();
        boolean boolean13 = strSet10.addAll((java.util.Collection<java.lang.String>) strSet12);
        int int14 = strSet10.size();
        java.util.stream.Stream<java.lang.String> strStream15 = strSet10.parallelStream();
        java.lang.String[] strArray25 = new java.lang.String[] { "de_DE", "", "", "7", "3", "UTC", "24", "2022-02-15T07:08:12.450", "2022-02-15T07:08:12.450" };
        java.util.LinkedHashSet<java.lang.String> strSet26 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet26, strArray25);
        java.util.Set<java.lang.String> strSet28 = org.joda.time.DateTimeZone.getAvailableIDs();
        boolean boolean29 = strSet26.addAll((java.util.Collection<java.lang.String>) strSet28);
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology31 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone30);
        org.joda.time.DateTimeField dateTimeField32 = ethiopicChronology31.hourOfDay();
        org.joda.time.DateTimeField dateTimeField33 = ethiopicChronology31.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.Chronology chronology35 = ethiopicChronology31.withZone(dateTimeZone34);
        org.joda.time.DateTimeField dateTimeField36 = ethiopicChronology31.millisOfSecond();
        boolean boolean37 = strSet26.contains((java.lang.Object) ethiopicChronology31);
        java.util.stream.Stream<java.lang.String> strStream38 = strSet26.parallelStream();
        boolean boolean39 = strSet10.addAll((java.util.Collection<java.lang.String>) strSet26);
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology41 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone40);
        org.joda.time.DateTimeField dateTimeField42 = ethiopicChronology41.clockhourOfDay();
        org.joda.time.DurationField durationField43 = ethiopicChronology41.weekyears();
        org.joda.time.DateTimeField dateTimeField44 = ethiopicChronology41.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 10);
        java.lang.String str48 = dateTimeZone46.getShortName((long) 1);
        org.joda.time.Chronology chronology49 = ethiopicChronology41.withZone(dateTimeZone46);
        boolean boolean50 = strSet10.contains((java.lang.Object) ethiopicChronology41);
        org.joda.time.ReadablePeriod readablePeriod51 = null;
        long long54 = ethiopicChronology41.add(readablePeriod51, (long) 510, 0);
        org.joda.time.DurationField durationField55 = ethiopicChronology41.eras();
        org.joda.time.DurationField durationField56 = ethiopicChronology41.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField43 and durationField55", Math.signum(durationField43.compareTo(durationField55)) == -Math.signum(durationField55.compareTo(durationField43)));
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology1.secondOfDay();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology1.secondOfDay();
        org.joda.time.DurationField durationField5 = ethiopicChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.clockhourOfHalfday();
        org.joda.time.DurationField durationField7 = ethiopicChronology1.weeks();
        org.joda.time.DurationField durationField8 = ethiopicChronology1.years();
        org.joda.time.DurationField durationField9 = ethiopicChronology1.seconds();
        org.joda.time.DurationField durationField10 = ethiopicChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField10, durationField5, and durationField8", !(durationField10.compareTo(durationField5) == 0) || (Math.signum(durationField10.compareTo(durationField8)) == Math.signum(durationField5.compareTo(durationField8))));
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology2 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology2.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology2.secondOfDay();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology2.secondOfDay();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) 10, (org.joda.time.Chronology) ethiopicChronology2);
        org.joda.time.DurationField durationField7 = ethiopicChronology2.days();
        org.joda.time.DateTimeZone dateTimeZone8 = ethiopicChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology2.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology2.hourOfDay();
        org.joda.time.DurationField durationField11 = ethiopicChronology2.minutes();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology2.halfdayOfDay();
        org.joda.time.DurationField durationField13 = ethiopicChronology2.seconds();
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology2.monthOfYear();
        org.joda.time.DateTimeField dateTimeField15 = ethiopicChronology2.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField16 = ethiopicChronology2.year();
        org.joda.time.DurationField durationField17 = ethiopicChronology2.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField17, durationField7, and durationField11", !(durationField17.compareTo(durationField7) == 0) || (Math.signum(durationField17.compareTo(durationField11)) == Math.signum(durationField7.compareTo(durationField11))));
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DurationField durationField4 = ethiopicChronology1.centuries();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology1.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.weekyear();
        java.lang.String str7 = ethiopicChronology1.toString();
        org.joda.time.DateTimeZone dateTimeZone8 = ethiopicChronology1.getZone();
        org.joda.time.DurationField durationField9 = ethiopicChronology1.years();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology1.clockhourOfHalfday();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField9", (durationField3.compareTo(durationField9) == 0) == durationField3.equals(durationField9));
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
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
        org.joda.time.LocalDateTime localDateTime17 = localDateTime11.withYearOfCentury(0);
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.weekyear();
        org.joda.time.LocalDateTime localDateTime20 = property18.setCopy((int) (byte) 1);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime(chronology21);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime22.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime22.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime22.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.DateTime dateTime30 = localDateTime28.toDateTime(readableInstant29);
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = null;
        boolean boolean32 = dateTime30.isSupported(dateTimeFieldType31);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime(chronology33);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime34.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime38 = localDateTime34.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime40 = localDateTime34.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant41 = null;
        org.joda.time.DateTime dateTime42 = localDateTime40.toDateTime(readableInstant41);
        org.joda.time.DateTimeFieldType dateTimeFieldType43 = null;
        boolean boolean44 = dateTime42.isSupported(dateTimeFieldType43);
        int int45 = dateTime30.compareTo((org.joda.time.ReadableInstant) dateTime42);
        int int46 = property18.compareTo((org.joda.time.ReadableInstant) dateTime42);
        boolean boolean47 = dateTime9.isEqual((org.joda.time.ReadableInstant) dateTime42);
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.LocalDateTime localDateTime49 = new org.joda.time.LocalDateTime(chronology48);
        org.joda.time.LocalDateTime localDateTime51 = localDateTime49.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime53 = localDateTime49.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime55 = localDateTime49.plusWeeks((int) (byte) 10);
        org.joda.time.Chronology chronology56 = null;
        org.joda.time.LocalDateTime localDateTime57 = new org.joda.time.LocalDateTime(chronology56);
        org.joda.time.LocalDateTime localDateTime59 = localDateTime57.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime61 = localDateTime57.withMillisOfSecond((int) (byte) 1);
        int int62 = localDateTime49.compareTo((org.joda.time.ReadablePartial) localDateTime57);
        org.joda.time.LocalDateTime.Property property63 = localDateTime57.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType64 = property63.getFieldType();
        boolean boolean65 = dateTime42.isSupported(dateTimeFieldType64);
        java.lang.String str66 = dateTime42.toString();
        org.joda.time.Instant instant67 = dateTime42.toInstant();
        org.joda.time.Chronology chronology68 = instant67.getChronology();
        org.joda.time.DateTimeField dateTimeField69 = chronology68.weekyearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and instant67", (dateTime9.compareTo(instant67) == 0) == dateTime9.equals(instant67));
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DurationField durationField4 = ethiopicChronology1.hours();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology1.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.hourOfDay();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        long long10 = ethiopicChronology1.add(readablePeriod7, (long) 100, 581);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology12 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone11);
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology12.dayOfMonth();
        java.util.Locale locale17 = new java.util.Locale("hi!", "hi!");
        java.lang.String str18 = dateTimeField13.getAsText((int) (byte) 10, locale17);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime(chronology19);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime20.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime20.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime24.withMillisOfSecond((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime24.withMinuteOfHour(10);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime24.minusDays(100);
        int[] intArray37 = new int[] { (short) 10, 1, 614, 822, (byte) 100 };
        int[] intArray39 = dateTimeField13.addWrapField((org.joda.time.ReadablePartial) localDateTime30, 0, intArray37, (int) (short) 1);
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.LocalDateTime localDateTime41 = new org.joda.time.LocalDateTime(chronology40);
        org.joda.time.LocalDateTime localDateTime43 = localDateTime41.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime45 = localDateTime41.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime47 = localDateTime41.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant48 = null;
        org.joda.time.DateTime dateTime49 = localDateTime47.toDateTime(readableInstant48);
        org.joda.time.LocalDateTime localDateTime51 = localDateTime47.withSecondOfMinute((int) (short) 0);
        org.joda.time.ReadablePeriod readablePeriod52 = null;
        org.joda.time.LocalDateTime localDateTime53 = localDateTime51.minus(readablePeriod52);
        org.joda.time.DateTimeField[] dateTimeFieldArray54 = localDateTime53.getFields();
        org.joda.time.DateTimeZone dateTimeZone56 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology57 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone56);
        org.joda.time.DateTimeField dateTimeField58 = ethiopicChronology57.dayOfMonth();
        java.util.Locale locale62 = new java.util.Locale("hi!", "hi!");
        java.lang.String str63 = dateTimeField58.getAsText((int) (byte) 10, locale62);
        org.joda.time.Chronology chronology64 = null;
        org.joda.time.LocalDateTime localDateTime65 = new org.joda.time.LocalDateTime(chronology64);
        org.joda.time.LocalDateTime localDateTime67 = localDateTime65.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime69 = localDateTime65.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime71 = localDateTime69.withMillisOfSecond((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime73 = localDateTime69.withMinuteOfHour(10);
        org.joda.time.LocalDateTime localDateTime75 = localDateTime69.minusDays(100);
        int[] intArray82 = new int[] { (short) 10, 1, 614, 822, (byte) 100 };
        int[] intArray84 = dateTimeField58.addWrapField((org.joda.time.ReadablePartial) localDateTime75, 0, intArray82, (int) (short) 1);
        int[] intArray86 = dateTimeField13.add((org.joda.time.ReadablePartial) localDateTime53, (int) (short) 1, intArray82, 8);
        long long88 = ethiopicChronology1.set((org.joda.time.ReadablePartial) localDateTime53, (long) 487);
        org.joda.time.DateTimeField dateTimeField89 = ethiopicChronology1.millisOfDay();
        org.joda.time.DurationField durationField90 = ethiopicChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField90, durationField3, and durationField4", !(durationField90.compareTo(durationField3) == 0) || (Math.signum(durationField90.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = ethiopicChronology1.getZone();
        org.joda.time.DurationField durationField6 = ethiopicChronology1.days();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology8 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone7);
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology8.clockhourOfDay();
        org.joda.time.DurationField durationField10 = ethiopicChronology8.weekyears();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology8.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = ethiopicChronology8.getZone();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology8.minuteOfDay();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime(chronology14);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray16 = localDateTime15.getFieldTypes();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime15.withMillisOfDay((int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.plusWeeks((int) (byte) 10);
        int int21 = localDateTime20.size();
        int int22 = dateTimeField13.getMaximumValue((org.joda.time.ReadablePartial) localDateTime20);
        org.joda.time.ReadableDuration readableDuration23 = null;
        org.joda.time.LocalDateTime localDateTime24 = localDateTime20.minus(readableDuration23);
        java.lang.String str25 = localDateTime24.toString();
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology27 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone26);
        org.joda.time.DateTimeField dateTimeField28 = ethiopicChronology27.clockhourOfDay();
        org.joda.time.DurationField durationField29 = ethiopicChronology27.weekyears();
        org.joda.time.DateTimeField dateTimeField30 = ethiopicChronology27.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 10);
        java.lang.String str34 = dateTimeZone32.getShortName((long) 1);
        org.joda.time.Chronology chronology35 = ethiopicChronology27.withZone(dateTimeZone32);
        org.joda.time.DurationField durationField36 = ethiopicChronology27.halfdays();
        org.joda.time.DateTimeField dateTimeField37 = ethiopicChronology27.yearOfCentury();
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.LocalDateTime localDateTime39 = new org.joda.time.LocalDateTime(chronology38);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray40 = localDateTime39.getFieldTypes();
        org.joda.time.LocalDateTime localDateTime42 = localDateTime39.withMillisOfDay((int) (byte) 0);
        int int43 = localDateTime42.getYear();
        int[] intArray45 = ethiopicChronology27.get((org.joda.time.ReadablePartial) localDateTime42, (long) 548);
        ethiopicChronology1.validate((org.joda.time.ReadablePartial) localDateTime24, intArray45);
        org.joda.time.DurationField durationField47 = ethiopicChronology1.weekyears();
        org.joda.time.DurationField durationField48 = ethiopicChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField48, durationField3, and durationField6", !(durationField48.compareTo(durationField3) == 0) || (Math.signum(durationField48.compareTo(durationField6)) == Math.signum(durationField3.compareTo(durationField6))));
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DurationField durationField4 = ethiopicChronology1.hours();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology1.dayOfMonth();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = ethiopicChronology1.add(readablePeriod6, (long) (-1), 422);
        org.joda.time.DurationField durationField10 = ethiopicChronology1.years();
        org.joda.time.DurationField durationField11 = ethiopicChronology1.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField10", (durationField3.compareTo(durationField10) == 0) == durationField3.equals(durationField10));
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DurationField durationField4 = ethiopicChronology1.centuries();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology1.weekyear();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.yearOfEra();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology1.weekyear();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology1.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology1.monthOfYear();
        org.joda.time.DurationField durationField10 = ethiopicChronology1.months();
        org.joda.time.DurationField durationField11 = ethiopicChronology1.minutes();
        org.joda.time.DurationField durationField12 = ethiopicChronology1.years();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology1.weekOfWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField12", (durationField3.compareTo(durationField12) == 0) == durationField3.equals(durationField12));
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 10);
        java.lang.String str8 = dateTimeZone6.getShortName((long) 1);
        org.joda.time.Chronology chronology9 = ethiopicChronology1.withZone(dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology11 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone10);
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology11.clockhourOfDay();
        org.joda.time.DurationField durationField13 = ethiopicChronology11.weekyears();
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology11.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 10);
        java.lang.String str18 = dateTimeZone16.getShortName((long) 1);
        org.joda.time.Chronology chronology19 = ethiopicChronology11.withZone(dateTimeZone16);
        long long21 = dateTimeZone6.getMillisKeepLocal(dateTimeZone16, (long) 552);
        java.util.TimeZone timeZone22 = dateTimeZone6.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology24 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField25 = ethiopicChronology24.hourOfDay();
        org.joda.time.DateTimeField dateTimeField26 = ethiopicChronology24.secondOfDay();
        org.joda.time.DateTimeField dateTimeField27 = ethiopicChronology24.secondOfDay();
        org.joda.time.DurationField durationField28 = ethiopicChronology24.weeks();
        org.joda.time.DateTimeField dateTimeField29 = ethiopicChronology24.clockhourOfHalfday();
        org.joda.time.DurationField durationField30 = ethiopicChronology24.weeks();
        org.joda.time.DurationField durationField31 = ethiopicChronology24.years();
        org.joda.time.DateTimeField dateTimeField32 = ethiopicChronology24.year();
        org.joda.time.DurationField durationField33 = ethiopicChronology24.seconds();
        org.joda.time.DateTimeZone dateTimeZone34 = ethiopicChronology24.getZone();
        long long37 = dateTimeZone34.adjustOffset((long) 931, true);
        long long39 = dateTimeZone34.nextTransition(100L);
        boolean boolean40 = dateTimeZone6.equals((java.lang.Object) dateTimeZone34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField31", (durationField3.compareTo(durationField31) == 0) == durationField3.equals(durationField31));
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology1.centuryOfEra();
        org.joda.time.DurationField durationField4 = ethiopicChronology1.millis();
        int int5 = ethiopicChronology1.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology1.hourOfHalfday();
        org.joda.time.DurationField durationField8 = ethiopicChronology1.years();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology1.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology1.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology12 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone11);
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology12.clockhourOfDay();
        org.joda.time.DurationField durationField14 = ethiopicChronology12.weekyears();
        org.joda.time.DateTimeField dateTimeField15 = ethiopicChronology12.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology17 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone16);
        org.joda.time.DateTimeField dateTimeField18 = ethiopicChronology17.clockhourOfDay();
        org.joda.time.DurationField durationField19 = ethiopicChronology17.weekyears();
        org.joda.time.DateTimeField dateTimeField20 = ethiopicChronology17.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology22 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone21);
        org.joda.time.DateTimeField dateTimeField23 = ethiopicChronology22.clockhourOfDay();
        java.util.Locale locale25 = java.util.Locale.ITALIAN;
        java.lang.String str26 = dateTimeField23.getAsText((long) 'a', locale25);
        int int27 = dateTimeField20.getMaximumTextLength(locale25);
        int int28 = dateTimeField15.getMaximumShortTextLength(locale25);
        java.lang.String str29 = locale25.getDisplayLanguage();
        java.util.Set<java.lang.String> strSet30 = locale25.getUnicodeLocaleAttributes();
        java.util.Iterator<java.lang.String> strItor31 = strSet30.iterator();
        java.util.Iterator<java.lang.String> strItor32 = strSet30.iterator();
        boolean boolean34 = strSet30.contains((java.lang.Object) 789);
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
        org.joda.time.LocalDateTime localDateTime51 = localDateTime36.withMillisOfSecond((int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime53 = localDateTime51.withDayOfYear(37);
        org.joda.time.LocalDateTime.Property property54 = localDateTime53.centuryOfEra();
        boolean boolean55 = strSet30.contains((java.lang.Object) localDateTime53);
        java.util.Locale.Category category56 = java.util.Locale.Category.DISPLAY;
        org.joda.time.DateTimeZone dateTimeZone57 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology58 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone57);
        org.joda.time.DateTimeField dateTimeField59 = ethiopicChronology58.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField60 = ethiopicChronology58.minuteOfDay();
        org.joda.time.Chronology chronology61 = null;
        org.joda.time.LocalDateTime localDateTime62 = new org.joda.time.LocalDateTime(chronology61);
        org.joda.time.LocalDateTime localDateTime64 = localDateTime62.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime66 = localDateTime62.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime68 = localDateTime66.withMillisOfSecond((int) (short) 0);
        int int69 = dateTimeField60.getMinimumValue((org.joda.time.ReadablePartial) localDateTime68);
        java.util.Locale locale71 = java.util.Locale.GERMANY;
        boolean boolean72 = locale71.hasExtensions();
        java.lang.String str73 = dateTimeField60.getAsText(0L, locale71);
        java.util.Locale.setDefault(category56, locale71);
        org.joda.time.Chronology chronology75 = null;
        org.joda.time.LocalDateTime localDateTime76 = new org.joda.time.LocalDateTime(chronology75);
        org.joda.time.LocalDateTime localDateTime78 = localDateTime76.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime80 = localDateTime76.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime82 = localDateTime76.plusWeeks((int) (byte) 10);
        org.joda.time.Chronology chronology83 = null;
        org.joda.time.LocalDateTime localDateTime84 = new org.joda.time.LocalDateTime(chronology83);
        org.joda.time.LocalDateTime localDateTime86 = localDateTime84.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime88 = localDateTime84.withMillisOfSecond((int) (byte) 1);
        int int89 = localDateTime76.compareTo((org.joda.time.ReadablePartial) localDateTime84);
        org.joda.time.LocalDateTime.Property property90 = localDateTime84.weekyear();
        org.joda.time.LocalDateTime.Property property91 = localDateTime84.millisOfDay();
        org.joda.time.DurationField durationField92 = property91.getLeapDurationField();
        org.joda.time.LocalDateTime localDateTime93 = property91.withMinimumValue();
        java.util.Locale locale94 = java.util.Locale.JAPAN;
        java.lang.String str95 = property91.getAsShortText(locale94);
        java.util.Locale.setDefault(category56, locale94);
        java.lang.String str97 = dateTimeField10.getAsShortText((org.joda.time.ReadablePartial) localDateTime53, locale94);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField8 and durationField14", (durationField8.compareTo(durationField14) == 0) == durationField8.equals(durationField14));
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = ethiopicChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.monthOfYear();
        org.joda.time.DurationField durationField7 = ethiopicChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology1.year();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology1.millisOfDay();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        long long14 = ethiopicChronology1.add(readablePeriod11, 21153600000L, 292272984);
        org.joda.time.DurationField durationField15 = ethiopicChronology1.seconds();
        org.joda.time.DurationField durationField16 = ethiopicChronology1.years();
        org.joda.time.DateTimeField dateTimeField17 = ethiopicChronology1.yearOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField16", (durationField3.compareTo(durationField16) == 0) == durationField3.equals(durationField16));
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DurationField durationField4 = ethiopicChronology1.hours();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology1.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.minuteOfDay();
        org.joda.time.Chronology chronology7 = ethiopicChronology1.withUTC();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        long long11 = ethiopicChronology1.add(readablePeriod8, 631152000062L, 487);
        java.lang.String str12 = ethiopicChronology1.toString();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology1.era();
        org.joda.time.DurationField durationField14 = ethiopicChronology1.minutes();
        org.joda.time.DurationField durationField15 = ethiopicChronology1.minutes();
        org.joda.time.DurationField durationField16 = ethiopicChronology1.seconds();
        org.joda.time.DurationField durationField17 = ethiopicChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField17, durationField3, and durationField4", !(durationField17.compareTo(durationField3) == 0) || (Math.signum(durationField17.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DurationField durationField4 = ethiopicChronology1.hours();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology1.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.hourOfDay();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        long long10 = ethiopicChronology1.add(readablePeriod7, (long) 100, 581);
        org.joda.time.DurationField durationField11 = ethiopicChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology1.hourOfDay();
        org.joda.time.DurationField durationField13 = ethiopicChronology1.years();
        org.joda.time.DurationField durationField14 = ethiopicChronology1.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField13", (durationField3.compareTo(durationField13) == 0) == durationField3.equals(durationField13));
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DurationField durationField4 = ethiopicChronology1.hours();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology1.dayOfMonth();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime7.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime7.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.DateTime dateTime15 = localDateTime13.toDateTime(readableInstant14);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime13.withSecondOfMinute((int) (short) 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray18 = localDateTime13.getFields();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology20 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone19);
        org.joda.time.DateTimeField dateTimeField21 = ethiopicChronology20.hourOfDay();
        org.joda.time.DateTimeField dateTimeField22 = ethiopicChronology20.centuryOfEra();
        org.joda.time.DurationField durationField23 = ethiopicChronology20.millis();
        org.joda.time.DateTimeField dateTimeField24 = ethiopicChronology20.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField25 = ethiopicChronology20.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField26 = ethiopicChronology20.weekyear();
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime(chronology27);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime28.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime28.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime32.withMillisOfSecond((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime32.withMinuteOfHour(10);
        org.joda.time.LocalDateTime.Property property37 = localDateTime36.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology39 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone38);
        org.joda.time.DateTimeField dateTimeField40 = ethiopicChronology39.dayOfMonth();
        java.util.Locale locale44 = new java.util.Locale("hi!", "hi!");
        java.lang.String str45 = dateTimeField40.getAsText((int) (byte) 10, locale44);
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.LocalDateTime localDateTime47 = new org.joda.time.LocalDateTime(chronology46);
        org.joda.time.LocalDateTime localDateTime49 = localDateTime47.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime51 = localDateTime47.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime53 = localDateTime51.withMillisOfSecond((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime55 = localDateTime51.withMinuteOfHour(10);
        org.joda.time.LocalDateTime localDateTime57 = localDateTime51.minusDays(100);
        int[] intArray64 = new int[] { (short) 10, 1, 614, 822, (byte) 100 };
        int[] intArray66 = dateTimeField40.addWrapField((org.joda.time.ReadablePartial) localDateTime57, 0, intArray64, (int) (short) 1);
        int int67 = dateTimeField26.getMaximumValue((org.joda.time.ReadablePartial) localDateTime36, intArray66);
        ethiopicChronology1.validate((org.joda.time.ReadablePartial) localDateTime13, intArray66);
        org.joda.time.DurationField durationField69 = ethiopicChronology1.hours();
        org.joda.time.DateTimeZone dateTimeZone70 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology71 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone70);
        org.joda.time.DateTimeField dateTimeField72 = ethiopicChronology71.clockhourOfDay();
        org.joda.time.DurationField durationField73 = ethiopicChronology71.weekyears();
        org.joda.time.DateTimeField dateTimeField74 = ethiopicChronology71.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone75 = ethiopicChronology71.getZone();
        java.lang.String str76 = dateTimeZone75.getID();
        java.lang.String str78 = dateTimeZone75.getNameKey((long) 848);
        org.joda.time.Chronology chronology79 = ethiopicChronology1.withZone(dateTimeZone75);
        org.joda.time.DateTimeField dateTimeField80 = ethiopicChronology1.weekyear();
        org.joda.time.DateTimeField dateTimeField81 = ethiopicChronology1.dayOfMonth();
        org.joda.time.DurationField durationField82 = ethiopicChronology1.seconds();
        org.joda.time.DurationField durationField83 = ethiopicChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField83, durationField3, and durationField4", !(durationField83.compareTo(durationField3) == 0) || (Math.signum(durationField83.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology1.secondOfDay();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology1.secondOfDay();
        org.joda.time.DurationField durationField5 = ethiopicChronology1.weeks();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime7.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime7.withYearOfCentury(0);
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.weekyear();
        org.joda.time.LocalDateTime.Property property15 = localDateTime13.secondOfMinute();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(chronology16);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime17.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime17.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.DateTime dateTime25 = localDateTime23.toDateTime(readableInstant24);
        org.joda.time.LocalDateTime.Property property26 = localDateTime23.millisOfDay();
        org.joda.time.Interval interval27 = property26.toInterval();
        boolean boolean28 = localDateTime13.equals((java.lang.Object) property26);
        int[] intArray30 = ethiopicChronology1.get((org.joda.time.ReadablePartial) localDateTime13, (long) 1439);
        org.joda.time.DateTimeField dateTimeField31 = ethiopicChronology1.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField32 = ethiopicChronology1.yearOfCentury();
        org.joda.time.DurationField durationField33 = ethiopicChronology1.eras();
        org.joda.time.DateTimeField dateTimeField34 = ethiopicChronology1.millisOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField5 and durationField33", Math.signum(durationField5.compareTo(durationField33)) == -Math.signum(durationField33.compareTo(durationField5)));
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
        java.lang.String[] strArray9 = new java.lang.String[] { "de_DE", "", "", "7", "3", "UTC", "24", "2022-02-15T07:08:12.450", "2022-02-15T07:08:12.450" };
        java.util.LinkedHashSet<java.lang.String> strSet10 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet10, strArray9);
        java.util.Set<java.lang.String> strSet12 = org.joda.time.DateTimeZone.getAvailableIDs();
        boolean boolean13 = strSet10.addAll((java.util.Collection<java.lang.String>) strSet12);
        int int14 = strSet10.size();
        java.util.stream.Stream<java.lang.String> strStream15 = strSet10.parallelStream();
        java.lang.String[] strArray25 = new java.lang.String[] { "de_DE", "", "", "7", "3", "UTC", "24", "2022-02-15T07:08:12.450", "2022-02-15T07:08:12.450" };
        java.util.LinkedHashSet<java.lang.String> strSet26 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet26, strArray25);
        java.util.Set<java.lang.String> strSet28 = org.joda.time.DateTimeZone.getAvailableIDs();
        boolean boolean29 = strSet26.addAll((java.util.Collection<java.lang.String>) strSet28);
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology31 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone30);
        org.joda.time.DateTimeField dateTimeField32 = ethiopicChronology31.hourOfDay();
        org.joda.time.DateTimeField dateTimeField33 = ethiopicChronology31.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.Chronology chronology35 = ethiopicChronology31.withZone(dateTimeZone34);
        org.joda.time.DateTimeField dateTimeField36 = ethiopicChronology31.millisOfSecond();
        boolean boolean37 = strSet26.contains((java.lang.Object) ethiopicChronology31);
        java.util.stream.Stream<java.lang.String> strStream38 = strSet26.parallelStream();
        boolean boolean39 = strSet10.addAll((java.util.Collection<java.lang.String>) strSet26);
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology41 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone40);
        org.joda.time.DateTimeField dateTimeField42 = ethiopicChronology41.clockhourOfDay();
        org.joda.time.DurationField durationField43 = ethiopicChronology41.weekyears();
        org.joda.time.DateTimeField dateTimeField44 = ethiopicChronology41.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 10);
        java.lang.String str48 = dateTimeZone46.getShortName((long) 1);
        org.joda.time.Chronology chronology49 = ethiopicChronology41.withZone(dateTimeZone46);
        boolean boolean50 = strSet10.contains((java.lang.Object) ethiopicChronology41);
        org.joda.time.ReadablePeriod readablePeriod51 = null;
        long long54 = ethiopicChronology41.add(readablePeriod51, (long) 510, 0);
        org.joda.time.DurationField durationField55 = ethiopicChronology41.eras();
        org.joda.time.DurationField durationField56 = ethiopicChronology41.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField43 and durationField55", Math.signum(durationField43.compareTo(durationField55)) == -Math.signum(durationField55.compareTo(durationField43)));
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DurationField durationField4 = ethiopicChronology1.hours();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology1.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.minuteOfDay();
        org.joda.time.Chronology chronology7 = ethiopicChronology1.withUTC();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(chronology8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime9.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime9.withYearOfCentury(0);
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.weekyear();
        org.joda.time.LocalDateTime localDateTime17 = property16.withMaximumValue();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology19 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone18);
        org.joda.time.DateTimeField dateTimeField20 = ethiopicChronology19.dayOfMonth();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime(chronology21);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime22.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime22.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime22.plusWeeks((int) (byte) 10);
        java.util.Locale locale29 = java.util.Locale.PRC;
        java.lang.String str30 = dateTimeField20.getAsText((org.joda.time.ReadablePartial) localDateTime28, locale29);
        java.util.Set<java.lang.String> strSet31 = locale29.getUnicodeLocaleKeys();
        java.lang.String str32 = property16.getAsShortText(locale29);
        org.joda.time.Interval interval33 = property16.toInterval();
        java.lang.String str34 = property16.getAsText();
        org.joda.time.LocalDateTime localDateTime36 = property16.addToCopy(13);
        org.joda.time.LocalDateTime localDateTime38 = localDateTime36.withCenturyOfEra(86);
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology40 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone39);
        org.joda.time.DateTimeField dateTimeField41 = ethiopicChronology40.hourOfDay();
        org.joda.time.DateTimeField dateTimeField42 = ethiopicChronology40.centuryOfEra();
        org.joda.time.DurationField durationField43 = ethiopicChronology40.millis();
        org.joda.time.DateTimeField dateTimeField44 = ethiopicChronology40.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField45 = ethiopicChronology40.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField46 = ethiopicChronology40.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField47 = ethiopicChronology40.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField48 = ethiopicChronology40.era();
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.LocalDateTime localDateTime50 = new org.joda.time.LocalDateTime(chronology49);
        org.joda.time.LocalDateTime localDateTime52 = localDateTime50.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime54 = localDateTime50.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime56 = localDateTime50.withYearOfCentury(0);
        org.joda.time.LocalDateTime.Property property57 = localDateTime56.weekyear();
        org.joda.time.LocalDateTime localDateTime58 = property57.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime60 = localDateTime58.minusDays(304);
        int[] intArray62 = ethiopicChronology40.get((org.joda.time.ReadablePartial) localDateTime58, 4320000000L);
        ethiopicChronology1.validate((org.joda.time.ReadablePartial) localDateTime38, intArray62);
        org.joda.time.DateTimeField dateTimeField64 = ethiopicChronology1.clockhourOfHalfday();
        org.joda.time.DurationField durationField65 = ethiopicChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField65, durationField3, and durationField4", !(durationField65.compareTo(durationField3) == 0) || (Math.signum(durationField65.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 10);
        java.lang.String str8 = dateTimeZone6.getShortName((long) 1);
        org.joda.time.Chronology chronology9 = ethiopicChronology1.withZone(dateTimeZone6);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(chronology10);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray12 = localDateTime11.getFieldTypes();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.withMillisOfDay((int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology16 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField17 = ethiopicChronology16.dayOfMonth();
        java.util.Locale locale21 = new java.util.Locale("hi!", "hi!");
        java.lang.String str22 = dateTimeField17.getAsText((int) (byte) 10, locale21);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime(chronology23);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime24.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime24.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime28.withMillisOfSecond((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime28.withMinuteOfHour(10);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime28.minusDays(100);
        int[] intArray41 = new int[] { (short) 10, 1, 614, 822, (byte) 100 };
        int[] intArray43 = dateTimeField17.addWrapField((org.joda.time.ReadablePartial) localDateTime34, 0, intArray41, (int) (short) 1);
        ethiopicChronology1.validate((org.joda.time.ReadablePartial) localDateTime14, intArray43);
        org.joda.time.DateTimeField dateTimeField45 = ethiopicChronology1.yearOfCentury();
        org.joda.time.DurationField durationField46 = dateTimeField45.getDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType47 = dateTimeField45.getType();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField46", (durationField3.compareTo(durationField46) == 0) == durationField3.equals(durationField46));
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DurationField durationField4 = ethiopicChronology1.hours();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology1.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.hourOfDay();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        long long10 = ethiopicChronology1.add(readablePeriod7, (long) 100, 581);
        org.joda.time.DurationField durationField11 = ethiopicChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology1.hourOfDay();
        org.joda.time.DurationField durationField13 = ethiopicChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField13, durationField3, and durationField4", !(durationField13.compareTo(durationField3) == 0) || (Math.signum(durationField13.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DurationField durationField4 = ethiopicChronology1.hours();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology1.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology1.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology1.dayOfWeek();
        org.joda.time.DurationField durationField9 = ethiopicChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField3, and durationField4", !(durationField9.compareTo(durationField3) == 0) || (Math.signum(durationField9.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DurationField durationField4 = ethiopicChronology1.centuries();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology1.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.dayOfYear();
        java.lang.String str7 = ethiopicChronology1.toString();
        org.joda.time.DurationField durationField8 = ethiopicChronology1.months();
        org.joda.time.DurationField durationField9 = ethiopicChronology1.years();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology1.dayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField9", (durationField3.compareTo(durationField9) == 0) == durationField3.equals(durationField9));
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DurationField durationField4 = ethiopicChronology1.hours();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology1.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology1.monthOfYear();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology1.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology1.era();
        org.joda.time.DurationField durationField11 = ethiopicChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField11, durationField3, and durationField4", !(durationField11.compareTo(durationField3) == 0) || (Math.signum(durationField11.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test203");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology1.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.Chronology chronology5 = ethiopicChronology1.withZone(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.millisOfSecond();
        org.joda.time.DurationField durationField7 = ethiopicChronology1.eras();
        long long11 = ethiopicChronology1.add((-31449600000L), (long) 346, 634);
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField13 = ethiopicChronology1.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField7, durationField13, and durationField7", !(durationField7.compareTo(durationField13) == 0) || (Math.signum(durationField7.compareTo(durationField7)) == Math.signum(durationField13.compareTo(durationField7))));
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test204");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology1.halfdayOfDay();
        org.joda.time.DurationField durationField6 = ethiopicChronology1.eras();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology1.hourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField6", Math.signum(durationField3.compareTo(durationField6)) == -Math.signum(durationField6.compareTo(durationField3)));
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test205");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology1.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.Chronology chronology5 = ethiopicChronology1.withZone(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology1.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology1.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology1.weekOfWeekyear();
        org.joda.time.DurationField durationField10 = ethiopicChronology1.seconds();
        java.lang.String str11 = ethiopicChronology1.toString();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology13 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone12);
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology13.clockhourOfDay();
        org.joda.time.DurationField durationField15 = ethiopicChronology13.weekyears();
        org.joda.time.DurationField durationField16 = ethiopicChronology13.hours();
        org.joda.time.DateTimeField dateTimeField17 = ethiopicChronology13.dayOfMonth();
        org.joda.time.DurationField durationField18 = ethiopicChronology13.months();
        org.joda.time.DateTimeField dateTimeField19 = ethiopicChronology13.millisOfDay();
        java.lang.String str20 = ethiopicChronology13.toString();
        org.joda.time.DurationField durationField21 = ethiopicChronology13.millis();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime(chronology22);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime23.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime23.plusWeeks((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime29.minusSeconds(614);
        int[] intArray33 = ethiopicChronology13.get((org.joda.time.ReadablePartial) localDateTime31, (-1221091199983L));
        org.joda.time.LocalDateTime localDateTime35 = localDateTime31.withYearOfEra(2022);
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology38 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone37);
        org.joda.time.DateTimeField dateTimeField39 = ethiopicChronology38.hourOfDay();
        org.joda.time.DateTimeField dateTimeField40 = ethiopicChronology38.secondOfDay();
        org.joda.time.DateTimeField dateTimeField41 = ethiopicChronology38.secondOfDay();
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime((long) 10, (org.joda.time.Chronology) ethiopicChronology38);
        org.joda.time.LocalDateTime localDateTime44 = localDateTime42.withDayOfYear((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime46 = localDateTime44.plusDays(0);
        java.lang.String str47 = localDateTime46.toString();
        org.joda.time.LocalDateTime.Property property48 = localDateTime46.yearOfEra();
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.LocalDateTime localDateTime50 = new org.joda.time.LocalDateTime(chronology49);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray51 = localDateTime50.getFieldTypes();
        org.joda.time.LocalDateTime localDateTime53 = localDateTime50.withMillisOfDay((int) (byte) 0);
        org.joda.time.LocalDateTime.Property property54 = localDateTime50.centuryOfEra();
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.LocalDateTime localDateTime56 = new org.joda.time.LocalDateTime(chronology55);
        org.joda.time.LocalDateTime localDateTime58 = localDateTime56.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime60 = localDateTime56.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime62 = localDateTime56.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant63 = null;
        org.joda.time.DateTime dateTime64 = localDateTime62.toDateTime(readableInstant63);
        org.joda.time.DateTimeFieldType dateTimeFieldType65 = null;
        boolean boolean66 = dateTime64.isSupported(dateTimeFieldType65);
        int int67 = property54.compareTo((org.joda.time.ReadableInstant) dateTime64);
        org.joda.time.Chronology chronology68 = dateTime64.getChronology();
        int int69 = property48.compareTo((org.joda.time.ReadableInstant) dateTime64);
        org.joda.time.DateTime dateTime70 = localDateTime31.toDateTime((org.joda.time.ReadableInstant) dateTime64);
        org.joda.time.DateTimeZone dateTimeZone71 = dateTime64.getZone();
        org.joda.time.Chronology chronology72 = ethiopicChronology1.withZone(dateTimeZone71);
        org.joda.time.DurationField durationField73 = ethiopicChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField73, durationField10, and durationField15", !(durationField73.compareTo(durationField10) == 0) || (Math.signum(durationField73.compareTo(durationField15)) == Math.signum(durationField10.compareTo(durationField15))));
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test206");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.withYearOfCentury(0);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.weekyear();
        org.joda.time.LocalDateTime localDateTime9 = property8.roundHalfFloorCopy();
        org.joda.time.Interval interval10 = property8.toInterval();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(chronology11);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime12.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime12.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.DateTime dateTime20 = localDateTime18.toDateTime(readableInstant19);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime(chronology21);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime22.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime22.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime22.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.DateTime dateTime30 = localDateTime28.toDateTime(readableInstant29);
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = null;
        boolean boolean32 = dateTime30.isSupported(dateTimeFieldType31);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime(chronology33);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime34.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime38 = localDateTime34.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime40 = localDateTime34.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant41 = null;
        org.joda.time.DateTime dateTime42 = localDateTime40.toDateTime(readableInstant41);
        org.joda.time.DateTimeFieldType dateTimeFieldType43 = null;
        boolean boolean44 = dateTime42.isSupported(dateTimeFieldType43);
        int int45 = dateTime30.compareTo((org.joda.time.ReadableInstant) dateTime42);
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.LocalDateTime localDateTime47 = new org.joda.time.LocalDateTime(chronology46);
        org.joda.time.LocalDateTime localDateTime49 = localDateTime47.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime51 = localDateTime47.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime53 = localDateTime47.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant54 = null;
        org.joda.time.DateTime dateTime55 = localDateTime53.toDateTime(readableInstant54);
        java.util.Locale locale56 = java.util.Locale.GERMANY;
        boolean boolean57 = locale56.hasExtensions();
        boolean boolean58 = dateTime55.equals((java.lang.Object) locale56);
        boolean boolean59 = dateTime42.isAfter((org.joda.time.ReadableInstant) dateTime55);
        boolean boolean60 = dateTime20.isAfter((org.joda.time.ReadableInstant) dateTime55);
        org.joda.time.Instant instant61 = dateTime55.toInstant();
        int int62 = property8.compareTo((org.joda.time.ReadableInstant) instant61);
        org.joda.time.LocalDateTime localDateTime64 = property8.setCopy(135);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime20 and instant61", (dateTime20.compareTo(instant61) == 0) == dateTime20.equals(instant61));
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test207");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology1.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.Chronology chronology5 = ethiopicChronology1.withZone(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.millisOfSecond();
        org.joda.time.DurationField durationField7 = ethiopicChronology1.eras();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology1.weekyear();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology10 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology10.clockhourOfDay();
        org.joda.time.DurationField durationField12 = ethiopicChronology10.weekyears();
        org.joda.time.DurationField durationField13 = ethiopicChronology10.centuries();
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology10.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField15 = ethiopicChronology10.weekyear();
        java.lang.String str16 = ethiopicChronology10.toString();
        org.joda.time.DateTimeZone dateTimeZone17 = ethiopicChronology10.getZone();
        int int19 = dateTimeZone17.getStandardOffset((-31449380636L));
        org.joda.time.LocalDateTime localDateTime20 = org.joda.time.LocalDateTime.now(dateTimeZone17);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime20.plusMinutes(962);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology24 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField25 = ethiopicChronology24.clockhourOfDay();
        org.joda.time.DurationField durationField26 = ethiopicChronology24.weekyears();
        org.joda.time.DateTimeField dateTimeField27 = ethiopicChronology24.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone28 = ethiopicChronology24.getZone();
        org.joda.time.Chronology chronology29 = ethiopicChronology24.withUTC();
        org.joda.time.DurationField durationField30 = ethiopicChronology24.minutes();
        org.joda.time.DateTimeField dateTimeField31 = ethiopicChronology24.clockhourOfHalfday();
        org.joda.time.DurationField durationField32 = ethiopicChronology24.centuries();
        org.joda.time.DateTimeField dateTimeField33 = ethiopicChronology24.millisOfDay();
        org.joda.time.DateTimeField dateTimeField34 = ethiopicChronology24.year();
        java.util.Locale locale35 = java.util.Locale.GERMANY;
        int int36 = dateTimeField34.getMaximumShortTextLength(locale35);
        java.util.Locale locale38 = java.util.Locale.GERMANY;
        java.lang.String str39 = locale38.getScript();
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology41 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone40);
        org.joda.time.DateTimeField dateTimeField42 = ethiopicChronology41.clockhourOfDay();
        java.util.Locale locale44 = java.util.Locale.ITALIAN;
        java.lang.String str45 = dateTimeField42.getAsText((long) 'a', locale44);
        java.lang.String str46 = locale38.getDisplayName(locale44);
        java.lang.String str47 = locale44.getISO3Language();
        boolean boolean48 = locale44.hasExtensions();
        java.lang.String str49 = dateTimeField34.getAsText((long) 822, locale44);
        java.lang.String str50 = locale44.getISO3Language();
        org.joda.time.DateTimeZone dateTimeZone51 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology52 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone51);
        org.joda.time.DateTimeField dateTimeField53 = ethiopicChronology52.dayOfMonth();
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.LocalDateTime localDateTime55 = new org.joda.time.LocalDateTime(chronology54);
        org.joda.time.LocalDateTime localDateTime57 = localDateTime55.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime59 = localDateTime55.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime61 = localDateTime55.plusWeeks((int) (byte) 10);
        java.util.Locale locale62 = java.util.Locale.PRC;
        java.lang.String str63 = dateTimeField53.getAsText((org.joda.time.ReadablePartial) localDateTime61, locale62);
        java.lang.String str64 = locale62.getDisplayScript();
        java.lang.String str65 = locale44.getDisplayScript(locale62);
        java.lang.String str66 = dateTimeField8.getAsText((org.joda.time.ReadablePartial) localDateTime20, locale44);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField7 and durationField12", Math.signum(durationField7.compareTo(durationField12)) == -Math.signum(durationField12.compareTo(durationField7)));
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test208");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = ethiopicChronology1.getZone();
        org.joda.time.DurationField durationField6 = ethiopicChronology1.centuries();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology1.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime((org.joda.time.Chronology) ethiopicChronology1);
        org.joda.time.DurationField durationField10 = ethiopicChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField10, durationField3, and durationField6", !(durationField10.compareTo(durationField3) == 0) || (Math.signum(durationField10.compareTo(durationField6)) == Math.signum(durationField3.compareTo(durationField6))));
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test209");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DurationField durationField4 = ethiopicChronology1.hours();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology1.dayOfMonth();
        org.joda.time.DurationField durationField6 = ethiopicChronology1.months();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology1.millisOfDay();
        java.lang.String str8 = ethiopicChronology1.toString();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology1.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology1.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology1.yearOfCentury();
        org.joda.time.DurationField durationField12 = ethiopicChronology1.years();
        org.joda.time.DurationField durationField13 = ethiopicChronology1.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField12", (durationField3.compareTo(durationField12) == 0) == durationField3.equals(durationField12));
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test210");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology1.centuryOfEra();
        org.joda.time.DurationField durationField4 = ethiopicChronology1.millis();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology1.secondOfMinute();
        long long9 = ethiopicChronology1.add(6311520000100L, (long) 5, 25702);
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology1.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology1.secondOfMinute();
        org.joda.time.DurationField durationField12 = ethiopicChronology1.minutes();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        long long16 = ethiopicChronology1.add(readablePeriod13, 90536080134001L, 929);
        org.joda.time.DateTimeField dateTimeField17 = ethiopicChronology1.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField18 = ethiopicChronology1.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField19 = ethiopicChronology1.dayOfWeek();
        org.joda.time.DurationField durationField20 = ethiopicChronology1.hours();
        org.joda.time.DurationField durationField21 = ethiopicChronology1.seconds();
        org.joda.time.DurationField durationField22 = ethiopicChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField22, durationField4, and durationField12", !(durationField22.compareTo(durationField4) == 0) || (Math.signum(durationField22.compareTo(durationField12)) == Math.signum(durationField4.compareTo(durationField12))));
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test211");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology1.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.Chronology chronology5 = ethiopicChronology1.withZone(dateTimeZone4);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime7.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime7.plusWeeks((int) (byte) 10);
        int int14 = localDateTime13.getMillisOfSecond();
        int int15 = localDateTime13.getMillisOfSecond();
        org.joda.time.DateTimeField[] dateTimeFieldArray16 = localDateTime13.getFields();
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.LocalDateTime localDateTime19 = localDateTime13.withDurationAdded(readableDuration17, 0);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology21 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone20);
        org.joda.time.DateTimeField dateTimeField22 = ethiopicChronology21.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField23 = ethiopicChronology21.monthOfYear();
        org.joda.time.DateTimeField dateTimeField24 = ethiopicChronology21.era();
        org.joda.time.DateTimeZone dateTimeZone25 = ethiopicChronology21.getZone();
        org.joda.time.DateTime dateTime26 = localDateTime13.toDateTime(dateTimeZone25);
        org.joda.time.Chronology chronology27 = ethiopicChronology1.withZone(dateTimeZone25);
        boolean boolean29 = dateTimeZone25.isStandardOffset(694310400010L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone25);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime(chronology31);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime32.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime32.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime38 = localDateTime32.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.DateTime dateTime40 = localDateTime38.toDateTime(readableInstant39);
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = null;
        boolean boolean42 = dateTime40.isSupported(dateTimeFieldType41);
        int int43 = dateTimeZone25.getOffset((org.joda.time.ReadableInstant) dateTime40);
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.LocalDateTime localDateTime45 = new org.joda.time.LocalDateTime(chronology44);
        org.joda.time.LocalDateTime localDateTime47 = localDateTime45.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime49 = localDateTime45.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime51 = localDateTime45.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant52 = null;
        org.joda.time.DateTime dateTime53 = localDateTime51.toDateTime(readableInstant52);
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.LocalDateTime localDateTime55 = new org.joda.time.LocalDateTime(chronology54);
        org.joda.time.LocalDateTime localDateTime57 = localDateTime55.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime59 = localDateTime55.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime61 = localDateTime55.withYearOfCentury(0);
        org.joda.time.LocalDateTime.Property property62 = localDateTime61.weekyear();
        org.joda.time.LocalDateTime localDateTime64 = property62.setCopy((int) (byte) 1);
        org.joda.time.Chronology chronology65 = null;
        org.joda.time.LocalDateTime localDateTime66 = new org.joda.time.LocalDateTime(chronology65);
        org.joda.time.LocalDateTime localDateTime68 = localDateTime66.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime70 = localDateTime66.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime72 = localDateTime66.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant73 = null;
        org.joda.time.DateTime dateTime74 = localDateTime72.toDateTime(readableInstant73);
        org.joda.time.DateTimeFieldType dateTimeFieldType75 = null;
        boolean boolean76 = dateTime74.isSupported(dateTimeFieldType75);
        org.joda.time.Chronology chronology77 = null;
        org.joda.time.LocalDateTime localDateTime78 = new org.joda.time.LocalDateTime(chronology77);
        org.joda.time.LocalDateTime localDateTime80 = localDateTime78.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime82 = localDateTime78.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime84 = localDateTime78.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant85 = null;
        org.joda.time.DateTime dateTime86 = localDateTime84.toDateTime(readableInstant85);
        org.joda.time.DateTimeFieldType dateTimeFieldType87 = null;
        boolean boolean88 = dateTime86.isSupported(dateTimeFieldType87);
        int int89 = dateTime74.compareTo((org.joda.time.ReadableInstant) dateTime86);
        int int90 = property62.compareTo((org.joda.time.ReadableInstant) dateTime86);
        boolean boolean91 = dateTime53.isEqual((org.joda.time.ReadableInstant) dateTime86);
        boolean boolean92 = dateTime40.isBefore((org.joda.time.ReadableInstant) dateTime53);
        org.joda.time.Instant instant93 = dateTime40.toInstant();
        long long94 = dateTime40.getMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime53 and instant93", (dateTime53.compareTo(instant93) == 0) == dateTime53.equals(instant93));
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test212");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = ethiopicChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.monthOfYear();
        org.joda.time.DurationField durationField7 = ethiopicChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology1.millisOfSecond();
        org.joda.time.DurationField durationField9 = ethiopicChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField3, and durationField7", !(durationField9.compareTo(durationField3) == 0) || (Math.signum(durationField9.compareTo(durationField7)) == Math.signum(durationField3.compareTo(durationField7))));
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test213");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = ethiopicChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.monthOfYear();
        org.joda.time.DurationField durationField7 = ethiopicChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology1.millisOfSecond();
        org.joda.time.DurationField durationField9 = ethiopicChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology1.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology1.era();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology1.millisOfSecond();
        org.joda.time.DurationField durationField13 = ethiopicChronology1.years();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        long long17 = ethiopicChronology1.add(readablePeriod14, 18144000051L, 89);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField13", (durationField3.compareTo(durationField13) == 0) == durationField3.equals(durationField13));
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test214");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = ethiopicChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.minuteOfDay();
        org.joda.time.DurationField durationField7 = ethiopicChronology1.eras();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology1.monthOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField7", Math.signum(durationField3.compareTo(durationField7)) == -Math.signum(durationField7.compareTo(durationField3)));
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test215");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = ethiopicChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology1.dayOfWeek();
        org.joda.time.DurationField durationField8 = ethiopicChronology1.weeks();
        long long12 = ethiopicChronology1.add((long) 4, (-100800000L), 11);
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology1.millisOfSecond();
        org.joda.time.DurationField durationField14 = ethiopicChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField14, durationField3, and durationField8", !(durationField14.compareTo(durationField3) == 0) || (Math.signum(durationField14.compareTo(durationField8)) == Math.signum(durationField3.compareTo(durationField8))));
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test216");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DurationField durationField4 = ethiopicChronology1.centuries();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology1.hourOfHalfday();
        org.joda.time.DurationField durationField6 = ethiopicChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField6, durationField3, and durationField4", !(durationField6.compareTo(durationField3) == 0) || (Math.signum(durationField6.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test217");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DurationField durationField4 = ethiopicChronology1.hours();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology1.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology1.yearOfEra();
        java.lang.String str8 = ethiopicChronology1.toString();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology1.year();
        org.joda.time.DurationField durationField10 = ethiopicChronology1.years();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology1.weekOfWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField10", (durationField3.compareTo(durationField10) == 0) == durationField3.equals(durationField10));
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test218");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology1.centuryOfEra();
        org.joda.time.DurationField durationField4 = ethiopicChronology1.millis();
        int int5 = ethiopicChronology1.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField6 = ethiopicChronology1.weekyears();
        org.joda.time.DurationField durationField7 = ethiopicChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField7, durationField4, and durationField6", !(durationField7.compareTo(durationField4) == 0) || (Math.signum(durationField7.compareTo(durationField6)) == Math.signum(durationField4.compareTo(durationField6))));
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test219");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology2 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology2.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology2.secondOfDay();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology2.secondOfDay();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) 10, (org.joda.time.Chronology) ethiopicChronology2);
        org.joda.time.DurationField durationField7 = ethiopicChronology2.hours();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology2.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology2.monthOfYear();
        org.joda.time.DurationField durationField10 = ethiopicChronology2.centuries();
        java.lang.String str11 = ethiopicChronology2.toString();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology2.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology2.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology2.era();
        org.joda.time.DateTimeField dateTimeField15 = ethiopicChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField16 = ethiopicChronology2.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField17 = ethiopicChronology2.yearOfEra();
        org.joda.time.DateTimeField dateTimeField18 = ethiopicChronology2.monthOfYear();
        org.joda.time.DurationField durationField19 = ethiopicChronology2.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField19, durationField7, and durationField10", !(durationField19.compareTo(durationField7) == 0) || (Math.signum(durationField19.compareTo(durationField10)) == Math.signum(durationField7.compareTo(durationField10))));
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test220");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DurationField durationField4 = ethiopicChronology1.hours();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology1.dayOfMonth();
        org.joda.time.DurationField durationField6 = ethiopicChronology1.months();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(chronology7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime8.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime8.plusWeeks((int) (byte) 10);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(chronology15);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime16.withMillisOfSecond((int) (byte) 1);
        int int21 = localDateTime8.compareTo((org.joda.time.ReadablePartial) localDateTime16);
        org.joda.time.LocalDateTime.Property property22 = localDateTime16.weekyear();
        int[] intArray24 = ethiopicChronology1.get((org.joda.time.ReadablePartial) localDateTime16, 0L);
        org.joda.time.DurationField durationField25 = ethiopicChronology1.days();
        org.joda.time.Chronology chronology26 = ethiopicChronology1.withUTC();
        org.joda.time.DurationField durationField27 = ethiopicChronology1.years();
        org.joda.time.DateTimeField dateTimeField28 = ethiopicChronology1.weekOfWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField27", (durationField3.compareTo(durationField27) == 0) == durationField3.equals(durationField27));
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test221");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.DateTime dateTime9 = localDateTime7.toDateTime(readableInstant8);
        org.joda.time.LocalDateTime.Property property10 = localDateTime7.millisOfDay();
        org.joda.time.Interval interval11 = property10.toInterval();
        org.joda.time.DurationField durationField12 = property10.getRangeDurationField();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(chronology13);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime14.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime14.withYearOfCentury(0);
        org.joda.time.LocalDateTime.Property property21 = localDateTime20.weekyear();
        org.joda.time.LocalDateTime.Property property22 = localDateTime20.yearOfEra();
        java.util.Locale locale23 = java.util.Locale.GERMANY;
        boolean boolean24 = locale23.hasExtensions();
        java.lang.String str25 = locale23.getDisplayName();
        java.lang.String str27 = locale23.getUnicodeLocaleType("32");
        java.lang.String str28 = property22.getAsShortText(locale23);
        java.util.TimeZone timeZone29 = null;
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forTimeZone(timeZone29);
        java.lang.String str32 = dateTimeZone30.getNameKey((long) (byte) 0);
        org.joda.time.LocalDateTime localDateTime33 = org.joda.time.LocalDateTime.now(dateTimeZone30);
        java.util.Locale locale35 = java.util.Locale.GERMANY;
        java.util.Locale locale36 = java.util.Locale.GERMANY;
        java.lang.String str37 = locale36.getScript();
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology39 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone38);
        org.joda.time.DateTimeField dateTimeField40 = ethiopicChronology39.clockhourOfDay();
        java.util.Locale locale42 = java.util.Locale.ITALIAN;
        java.lang.String str43 = dateTimeField40.getAsText((long) 'a', locale42);
        java.lang.String str44 = locale36.getDisplayName(locale42);
        java.lang.String str45 = locale42.getISO3Language();
        boolean boolean46 = locale42.hasExtensions();
        java.lang.String str47 = locale35.getDisplayScript(locale42);
        java.lang.String str48 = localDateTime33.toString("32", locale42);
        java.lang.String str49 = locale42.getScript();
        java.util.Locale.setDefault(locale42);
        java.lang.String str51 = locale23.getDisplayName(locale42);
        java.lang.String str52 = locale23.getScript();
        java.util.Locale locale55 = new java.util.Locale("\u5fb7\u6587\u5fb7\u570b)", "2000-02-22T07:09:28.307");
        java.lang.String str56 = locale23.getDisplayCountry(locale55);
        org.joda.time.DateTimeZone dateTimeZone57 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology58 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone57);
        org.joda.time.DateTimeField dateTimeField59 = ethiopicChronology58.dayOfMonth();
        org.joda.time.DurationField durationField60 = dateTimeField59.getDurationField();
        org.joda.time.DateTimeZone dateTimeZone62 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology63 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone62);
        org.joda.time.DateTimeField dateTimeField64 = ethiopicChronology63.dayOfMonth();
        org.joda.time.Chronology chronology65 = null;
        org.joda.time.LocalDateTime localDateTime66 = new org.joda.time.LocalDateTime(chronology65);
        org.joda.time.LocalDateTime localDateTime68 = localDateTime66.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime70 = localDateTime66.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime72 = localDateTime66.plusWeeks((int) (byte) 10);
        java.util.Locale locale73 = java.util.Locale.PRC;
        java.lang.String str74 = dateTimeField64.getAsText((org.joda.time.ReadablePartial) localDateTime72, locale73);
        java.lang.String str75 = locale73.getDisplayScript();
        java.lang.String str76 = dateTimeField59.getAsShortText((long) (byte) 10, locale73);
        java.lang.String str77 = locale23.getDisplayScript(locale73);
        int int78 = property10.getMaximumTextLength(locale73);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField12 and durationField60", (durationField12.compareTo(durationField60) == 0) == durationField12.equals(durationField60));
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test222");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DurationField durationField4 = ethiopicChronology1.hours();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology1.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField7 = ethiopicChronology1.days();
        org.joda.time.DurationField durationField8 = ethiopicChronology1.years();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology1.secondOfMinute();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField8", (durationField3.compareTo(durationField8) == 0) == durationField3.equals(durationField8));
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test223");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 10);
        long long3 = dateTimeZone1.convertUTCToLocal((long) (short) 100);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology4 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField5 = ethiopicChronology4.eras();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology4.weekyear();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology4.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology4.halfdayOfDay();
        org.joda.time.DurationField durationField9 = ethiopicChronology4.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField5, durationField9, and durationField5", !(durationField5.compareTo(durationField9) == 0) || (Math.signum(durationField5.compareTo(durationField5)) == Math.signum(durationField9.compareTo(durationField5))));
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test224");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology2 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology2.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology2.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.Chronology chronology6 = ethiopicChronology2.withZone(dateTimeZone5);
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology2.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone8 = ethiopicChronology2.getZone();
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(1900800010L, dateTimeZone8);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(chronology10);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime11.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime11.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.DateTime dateTime19 = localDateTime17.toDateTime(readableInstant18);
        org.joda.time.LocalDateTime.Property property20 = localDateTime17.millisOfDay();
        org.joda.time.LocalDateTime localDateTime22 = localDateTime17.plusHours(13);
        int int23 = localDateTime9.compareTo((org.joda.time.ReadablePartial) localDateTime17);
        int int24 = localDateTime17.getMillisOfDay();
        int int25 = localDateTime17.getDayOfYear();
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology27 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone26);
        org.joda.time.DateTimeField dateTimeField28 = ethiopicChronology27.clockhourOfDay();
        org.joda.time.DurationField durationField29 = ethiopicChronology27.weekyears();
        org.joda.time.DateTimeField dateTimeField30 = ethiopicChronology27.clockhourOfDay();
        int int31 = ethiopicChronology27.getMinimumDaysInFirstWeek();
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime17, (org.joda.time.Chronology) ethiopicChronology27);
        org.joda.time.DurationField durationField33 = ethiopicChronology27.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on localDateTime17 and localDateTime32", (localDateTime17.compareTo(localDateTime32) == 0) == localDateTime17.equals(localDateTime32));
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test225");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.DateTime dateTime9 = localDateTime7.toDateTime(readableInstant8);
        org.joda.time.LocalDateTime.Property property10 = localDateTime7.millisOfDay();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime7.plusHours(13);
        java.lang.String str13 = localDateTime7.toString();
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime7);
        org.joda.time.LocalDateTime.Property property15 = localDateTime7.year();
        org.joda.time.LocalDateTime localDateTime17 = property15.addToCopy(296);
        org.joda.time.LocalDateTime localDateTime18 = property15.getLocalDateTime();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime(chronology19);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime20.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime20.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime20.withYearOfCentury(0);
        org.joda.time.LocalDateTime.Property property27 = localDateTime26.weekyear();
        org.joda.time.LocalDateTime localDateTime28 = property27.withMaximumValue();
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology30 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone29);
        org.joda.time.DateTimeField dateTimeField31 = ethiopicChronology30.dayOfMonth();
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime(chronology32);
        org.joda.time.LocalDateTime localDateTime35 = localDateTime33.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime37 = localDateTime33.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime39 = localDateTime33.plusWeeks((int) (byte) 10);
        java.util.Locale locale40 = java.util.Locale.PRC;
        java.lang.String str41 = dateTimeField31.getAsText((org.joda.time.ReadablePartial) localDateTime39, locale40);
        java.util.Set<java.lang.String> strSet42 = locale40.getUnicodeLocaleKeys();
        java.lang.String str43 = property27.getAsShortText(locale40);
        org.joda.time.Interval interval44 = property27.toInterval();
        java.lang.String str45 = property27.getAsText();
        org.joda.time.LocalDateTime localDateTime47 = property27.addWrapFieldToCopy(581);
        org.joda.time.ReadablePeriod readablePeriod48 = null;
        org.joda.time.LocalDateTime localDateTime49 = localDateTime47.minus(readablePeriod48);
        org.joda.time.LocalDateTime localDateTime51 = localDateTime49.plusYears((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime53 = localDateTime51.minusMillis(359999999);
        java.lang.String str54 = localDateTime53.toString();
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.LocalDateTime localDateTime56 = new org.joda.time.LocalDateTime(chronology55);
        org.joda.time.LocalDateTime localDateTime58 = localDateTime56.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime60 = localDateTime56.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime62 = localDateTime56.withYearOfCentury(0);
        org.joda.time.LocalDateTime.Property property63 = localDateTime62.weekyear();
        org.joda.time.LocalDateTime localDateTime65 = property63.setCopy((int) (byte) 1);
        org.joda.time.Chronology chronology66 = null;
        org.joda.time.LocalDateTime localDateTime67 = new org.joda.time.LocalDateTime(chronology66);
        org.joda.time.LocalDateTime localDateTime69 = localDateTime67.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime71 = localDateTime67.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime73 = localDateTime67.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant74 = null;
        org.joda.time.DateTime dateTime75 = localDateTime73.toDateTime(readableInstant74);
        org.joda.time.DateTimeFieldType dateTimeFieldType76 = null;
        boolean boolean77 = dateTime75.isSupported(dateTimeFieldType76);
        org.joda.time.Chronology chronology78 = null;
        org.joda.time.LocalDateTime localDateTime79 = new org.joda.time.LocalDateTime(chronology78);
        org.joda.time.LocalDateTime localDateTime81 = localDateTime79.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime83 = localDateTime79.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime85 = localDateTime79.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant86 = null;
        org.joda.time.DateTime dateTime87 = localDateTime85.toDateTime(readableInstant86);
        org.joda.time.DateTimeFieldType dateTimeFieldType88 = null;
        boolean boolean89 = dateTime87.isSupported(dateTimeFieldType88);
        int int90 = dateTime75.compareTo((org.joda.time.ReadableInstant) dateTime87);
        int int91 = property63.compareTo((org.joda.time.ReadableInstant) dateTime87);
        java.lang.String str92 = dateTime87.toString();
        org.joda.time.Instant instant93 = dateTime87.toInstant();
        org.joda.time.DateTime dateTime94 = localDateTime53.toDateTime((org.joda.time.ReadableInstant) instant93);
        boolean boolean95 = localDateTime18.isBefore((org.joda.time.ReadablePartial) localDateTime53);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime75 and instant93", (dateTime75.compareTo(instant93) == 0) == dateTime75.equals(instant93));
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test226");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DurationField durationField4 = ethiopicChronology1.hours();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology1.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology1.monthOfYear();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology1.era();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(chronology10);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime11.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.withMillisOfSecond((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime15.withMinuteOfHour(10);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime15.withYear(4);
        java.util.Date date22 = localDateTime15.toDate();
        org.joda.time.LocalDateTime localDateTime23 = org.joda.time.LocalDateTime.fromDateFields(date22);
        org.joda.time.LocalDateTime localDateTime24 = org.joda.time.LocalDateTime.fromDateFields(date22);
        long long26 = ethiopicChronology1.set((org.joda.time.ReadablePartial) localDateTime24, (long) 962);
        org.joda.time.DurationField durationField27 = ethiopicChronology1.years();
        org.joda.time.DateTimeField dateTimeField28 = ethiopicChronology1.dayOfWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField27", (durationField3.compareTo(durationField27) == 0) == durationField3.equals(durationField27));
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test227");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology2 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology2.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology2.secondOfDay();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology2.secondOfDay();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) 10, (org.joda.time.Chronology) ethiopicChronology2);
        org.joda.time.DurationField durationField7 = ethiopicChronology2.days();
        org.joda.time.DateTimeZone dateTimeZone8 = ethiopicChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology2.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology2.millisOfDay();
        org.joda.time.Chronology chronology11 = ethiopicChronology2.withUTC();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology13 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone12);
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology13.dayOfMonth();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(chronology15);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime16.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime16.plusWeeks((int) (byte) 10);
        java.util.Locale locale23 = java.util.Locale.PRC;
        java.lang.String str24 = dateTimeField14.getAsText((org.joda.time.ReadablePartial) localDateTime22, locale23);
        java.util.Set<java.lang.String> strSet25 = locale23.getUnicodeLocaleKeys();
        java.lang.String[] strArray35 = new java.lang.String[] { "UTC", "UTC", "tedesco (Germania)", "Etc/UTC", "Etc/UTC", "", "", "10", "Etc/UTC" };
        java.util.LinkedHashSet<java.lang.String> strSet36 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet36, strArray35);
        java.util.Locale.LanguageRange[] languageRangeArray38 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList39 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList39, languageRangeArray38);
        java.util.Collection<java.lang.String> strCollection41 = null;
        java.util.List<java.lang.String> strList42 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList39, strCollection41);
        boolean boolean43 = strSet36.retainAll((java.util.Collection<java.lang.String>) strList42);
        boolean boolean44 = strSet25.containsAll((java.util.Collection<java.lang.String>) strList42);
        java.util.Locale.LanguageRange[] languageRangeArray45 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList46 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList46, languageRangeArray45);
        java.util.Collection<java.lang.String> strCollection48 = null;
        java.util.List<java.lang.String> strList49 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList46, strCollection48);
        java.util.Collection<java.lang.String> strCollection50 = null;
        java.util.Locale.FilteringMode filteringMode51 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList52 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList46, strCollection50, filteringMode51);
        boolean boolean53 = strSet25.retainAll((java.util.Collection<java.lang.String>) strList52);
        boolean boolean54 = ethiopicChronology2.equals((java.lang.Object) boolean53);
        org.joda.time.DurationField durationField55 = ethiopicChronology2.eras();
        org.joda.time.DurationField durationField56 = ethiopicChronology2.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField7 and durationField55", Math.signum(durationField7.compareTo(durationField55)) == -Math.signum(durationField55.compareTo(durationField7)));
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test228");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = ethiopicChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology1.dayOfWeek();
        org.joda.time.DurationField durationField8 = ethiopicChronology1.weeks();
        org.joda.time.DurationField durationField9 = ethiopicChronology1.years();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology1.clockhourOfHalfday();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField9", (durationField3.compareTo(durationField9) == 0) == durationField3.equals(durationField9));
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test229");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DurationField durationField4 = ethiopicChronology1.hours();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology1.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.hourOfDay();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        long long10 = ethiopicChronology1.add(readablePeriod7, (long) 100, 581);
        org.joda.time.DurationField durationField11 = ethiopicChronology1.weeks();
        org.joda.time.DurationField durationField12 = ethiopicChronology1.days();
        org.joda.time.DurationField durationField13 = ethiopicChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField13, durationField3, and durationField4", !(durationField13.compareTo(durationField3) == 0) || (Math.signum(durationField13.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test230");
        java.lang.String[] strArray9 = new java.lang.String[] { "de_DE", "", "", "7", "3", "UTC", "24", "2022-02-15T07:08:12.450", "2022-02-15T07:08:12.450" };
        java.util.LinkedHashSet<java.lang.String> strSet10 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet10, strArray9);
        java.util.Set<java.lang.String> strSet12 = org.joda.time.DateTimeZone.getAvailableIDs();
        boolean boolean13 = strSet10.addAll((java.util.Collection<java.lang.String>) strSet12);
        int int14 = strSet10.size();
        java.util.stream.Stream<java.lang.String> strStream15 = strSet10.parallelStream();
        java.lang.String[] strArray25 = new java.lang.String[] { "de_DE", "", "", "7", "3", "UTC", "24", "2022-02-15T07:08:12.450", "2022-02-15T07:08:12.450" };
        java.util.LinkedHashSet<java.lang.String> strSet26 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet26, strArray25);
        java.util.Set<java.lang.String> strSet28 = org.joda.time.DateTimeZone.getAvailableIDs();
        boolean boolean29 = strSet26.addAll((java.util.Collection<java.lang.String>) strSet28);
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology31 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone30);
        org.joda.time.DateTimeField dateTimeField32 = ethiopicChronology31.hourOfDay();
        org.joda.time.DateTimeField dateTimeField33 = ethiopicChronology31.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.Chronology chronology35 = ethiopicChronology31.withZone(dateTimeZone34);
        org.joda.time.DateTimeField dateTimeField36 = ethiopicChronology31.millisOfSecond();
        boolean boolean37 = strSet26.contains((java.lang.Object) ethiopicChronology31);
        java.util.stream.Stream<java.lang.String> strStream38 = strSet26.parallelStream();
        boolean boolean39 = strSet10.addAll((java.util.Collection<java.lang.String>) strSet26);
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology41 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone40);
        org.joda.time.DateTimeField dateTimeField42 = ethiopicChronology41.clockhourOfDay();
        org.joda.time.DurationField durationField43 = ethiopicChronology41.weekyears();
        org.joda.time.DateTimeField dateTimeField44 = ethiopicChronology41.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 10);
        java.lang.String str48 = dateTimeZone46.getShortName((long) 1);
        org.joda.time.Chronology chronology49 = ethiopicChronology41.withZone(dateTimeZone46);
        boolean boolean50 = strSet10.contains((java.lang.Object) ethiopicChronology41);
        org.joda.time.ReadablePeriod readablePeriod51 = null;
        long long54 = ethiopicChronology41.add(readablePeriod51, (long) 510, 0);
        org.joda.time.DurationField durationField55 = ethiopicChronology41.eras();
        org.joda.time.DateTimeZone dateTimeZone56 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology57 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone56);
        org.joda.time.DateTimeField dateTimeField58 = ethiopicChronology57.hourOfDay();
        org.joda.time.DateTimeField dateTimeField59 = ethiopicChronology57.centuryOfEra();
        org.joda.time.DurationField durationField60 = ethiopicChronology57.millis();
        org.joda.time.DateTimeField dateTimeField61 = ethiopicChronology57.weekOfWeekyear();
        org.joda.time.DurationField durationField62 = ethiopicChronology57.weekyears();
        org.joda.time.DurationField durationField63 = ethiopicChronology57.halfdays();
        org.joda.time.LocalDateTime localDateTime64 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) ethiopicChronology57);
        org.joda.time.DateTimeField dateTimeField65 = ethiopicChronology57.millisOfDay();
        org.joda.time.DateTimeField dateTimeField66 = ethiopicChronology57.secondOfDay();
        org.joda.time.DurationField durationField67 = ethiopicChronology57.hours();
        int int68 = durationField55.compareTo(durationField67);
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField55, durationField43, and durationField60", !(durationField55.compareTo(durationField43) == 0) || (Math.signum(durationField55.compareTo(durationField60)) == Math.signum(durationField43.compareTo(durationField60))));
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test231");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = ethiopicChronology1.getZone();
        org.joda.time.Chronology chronology6 = ethiopicChronology1.withUTC();
        org.joda.time.DurationField durationField7 = ethiopicChronology1.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis(30);
        org.joda.time.Chronology chronology10 = ethiopicChronology1.withZone(dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology1.yearOfEra();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology1.yearOfCentury();
        org.joda.time.DurationField durationField13 = ethiopicChronology1.months();
        org.joda.time.DurationField durationField14 = ethiopicChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField14, durationField3, and durationField7", !(durationField14.compareTo(durationField3) == 0) || (Math.signum(durationField14.compareTo(durationField7)) == Math.signum(durationField3.compareTo(durationField7))));
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test232");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology1.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology1.dayOfMonth();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(chronology5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withMillisOfSecond((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.minusMonths(263);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime12.minusHours((int) ' ');
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime(chronology17);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime18.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime18.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.DateTime dateTime26 = localDateTime24.toDateTime(readableInstant25);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime24.withSecondOfMinute((int) (short) 0);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime(chronology29);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime30.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime30.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime30.plusWeeks((int) (byte) 10);
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.LocalDateTime localDateTime38 = new org.joda.time.LocalDateTime(chronology37);
        org.joda.time.LocalDateTime localDateTime40 = localDateTime38.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime42 = localDateTime38.withMillisOfSecond((int) (byte) 1);
        int int43 = localDateTime30.compareTo((org.joda.time.ReadablePartial) localDateTime38);
        org.joda.time.LocalDateTime localDateTime45 = localDateTime30.withMillisOfSecond((int) (byte) 0);
        boolean boolean46 = localDateTime28.isAfter((org.joda.time.ReadablePartial) localDateTime30);
        org.joda.time.LocalDateTime.Property property47 = localDateTime28.secondOfMinute();
        org.joda.time.Interval interval48 = property47.toInterval();
        org.joda.time.DurationField durationField49 = property47.getDurationField();
        org.joda.time.LocalDateTime localDateTime51 = property47.addWrapFieldToCopy(200);
        org.joda.time.LocalDateTime localDateTime53 = localDateTime51.minusYears(308);
        org.joda.time.LocalDateTime localDateTime54 = localDateTime12.withFields((org.joda.time.ReadablePartial) localDateTime53);
        org.joda.time.DateTimeZone dateTimeZone56 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology57 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone56);
        org.joda.time.DateTimeField dateTimeField58 = ethiopicChronology57.clockhourOfDay();
        org.joda.time.DurationField durationField59 = ethiopicChronology57.weekyears();
        org.joda.time.DateTimeField dateTimeField60 = ethiopicChronology57.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone61 = ethiopicChronology57.getZone();
        org.joda.time.DateTimeField dateTimeField62 = ethiopicChronology57.monthOfYear();
        org.joda.time.DurationField durationField63 = ethiopicChronology57.seconds();
        org.joda.time.DateTimeField dateTimeField64 = ethiopicChronology57.millisOfSecond();
        org.joda.time.DurationField durationField65 = ethiopicChronology57.weeks();
        org.joda.time.DateTimeField dateTimeField66 = ethiopicChronology57.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField67 = ethiopicChronology57.clockhourOfDay();
        java.lang.String str68 = ethiopicChronology57.toString();
        long long72 = ethiopicChronology57.add((long) 161, (long) (short) 0, 167);
        org.joda.time.DateTimeField dateTimeField73 = ethiopicChronology57.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone75 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology76 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone75);
        org.joda.time.DateTimeField dateTimeField77 = ethiopicChronology76.hourOfDay();
        org.joda.time.DateTimeField dateTimeField78 = ethiopicChronology76.secondOfDay();
        org.joda.time.DateTimeField dateTimeField79 = ethiopicChronology76.secondOfDay();
        org.joda.time.LocalDateTime localDateTime80 = new org.joda.time.LocalDateTime((long) 10, (org.joda.time.Chronology) ethiopicChronology76);
        org.joda.time.DurationField durationField81 = ethiopicChronology76.days();
        org.joda.time.DateTimeZone dateTimeZone82 = ethiopicChronology76.getZone();
        org.joda.time.DateTimeField dateTimeField83 = ethiopicChronology76.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField84 = ethiopicChronology76.millisOfDay();
        org.joda.time.Chronology chronology85 = ethiopicChronology76.withUTC();
        org.joda.time.DateTimeField dateTimeField86 = ethiopicChronology76.clockhourOfHalfday();
        java.util.Locale locale88 = java.util.Locale.GERMAN;
        java.lang.String str89 = locale88.getVariant();
        java.lang.String str90 = dateTimeField86.getAsShortText(359999999, locale88);
        java.lang.String str91 = locale88.getScript();
        int int92 = dateTimeField73.getMaximumTextLength(locale88);
        java.lang.String str93 = dateTimeField4.getAsText((org.joda.time.ReadablePartial) localDateTime54, 40136, locale88);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField49 and durationField63", (durationField49.compareTo(durationField63) == 0) == durationField49.equals(durationField63));
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test233");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.plusWeeks((int) (byte) 10);
        int int8 = localDateTime7.getMillisOfSecond();
        int int9 = localDateTime7.getMillisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology11 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone10);
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology11.clockhourOfDay();
        org.joda.time.DurationField durationField13 = ethiopicChronology11.weekyears();
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology11.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone15 = ethiopicChronology11.getZone();
        org.joda.time.Chronology chronology16 = ethiopicChronology11.withUTC();
        org.joda.time.DurationField durationField17 = ethiopicChronology11.minutes();
        org.joda.time.DateTimeField dateTimeField18 = ethiopicChronology11.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField19 = ethiopicChronology11.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField20 = ethiopicChronology11.clockhourOfDay();
        boolean boolean21 = localDateTime7.equals((java.lang.Object) dateTimeField20);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime7.plusMonths(0);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime(chronology24);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray26 = localDateTime25.getFieldTypes();
        org.joda.time.LocalDateTime localDateTime28 = localDateTime25.minusMonths(980);
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.DateTime dateTime30 = localDateTime25.toDateTime(readableInstant29);
        long long31 = dateTime30.getMillis();
        org.joda.time.DateTime dateTime32 = localDateTime23.toDateTime((org.joda.time.ReadableInstant) dateTime30);
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology34 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone33);
        org.joda.time.DateTimeField dateTimeField35 = ethiopicChronology34.clockhourOfDay();
        org.joda.time.DurationField durationField36 = ethiopicChronology34.weekyears();
        org.joda.time.DateTimeField dateTimeField37 = ethiopicChronology34.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 10);
        java.lang.String str41 = dateTimeZone39.getShortName((long) 1);
        org.joda.time.Chronology chronology42 = ethiopicChronology34.withZone(dateTimeZone39);
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.LocalDateTime localDateTime44 = new org.joda.time.LocalDateTime(chronology43);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray45 = localDateTime44.getFieldTypes();
        org.joda.time.LocalDateTime localDateTime47 = localDateTime44.withMillisOfDay((int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone48 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology49 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone48);
        org.joda.time.DateTimeField dateTimeField50 = ethiopicChronology49.dayOfMonth();
        java.util.Locale locale54 = new java.util.Locale("hi!", "hi!");
        java.lang.String str55 = dateTimeField50.getAsText((int) (byte) 10, locale54);
        org.joda.time.Chronology chronology56 = null;
        org.joda.time.LocalDateTime localDateTime57 = new org.joda.time.LocalDateTime(chronology56);
        org.joda.time.LocalDateTime localDateTime59 = localDateTime57.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime61 = localDateTime57.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime63 = localDateTime61.withMillisOfSecond((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime65 = localDateTime61.withMinuteOfHour(10);
        org.joda.time.LocalDateTime localDateTime67 = localDateTime61.minusDays(100);
        int[] intArray74 = new int[] { (short) 10, 1, 614, 822, (byte) 100 };
        int[] intArray76 = dateTimeField50.addWrapField((org.joda.time.ReadablePartial) localDateTime67, 0, intArray74, (int) (short) 1);
        ethiopicChronology34.validate((org.joda.time.ReadablePartial) localDateTime47, intArray76);
        org.joda.time.LocalDateTime localDateTime79 = localDateTime47.withMillisOfDay(57);
        org.joda.time.LocalDateTime.Property property80 = localDateTime47.secondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType81 = property80.getFieldType();
        int int82 = dateTime32.get(dateTimeFieldType81);
        org.joda.time.DateTimeZone dateTimeZone84 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology85 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone84);
        org.joda.time.DateTimeField dateTimeField86 = ethiopicChronology85.hourOfDay();
        org.joda.time.DateTimeField dateTimeField87 = ethiopicChronology85.secondOfDay();
        org.joda.time.DateTimeField dateTimeField88 = ethiopicChronology85.secondOfDay();
        org.joda.time.LocalDateTime localDateTime89 = new org.joda.time.LocalDateTime((long) 10, (org.joda.time.Chronology) ethiopicChronology85);
        org.joda.time.DurationField durationField90 = ethiopicChronology85.days();
        org.joda.time.DateTimeField dateTimeField91 = ethiopicChronology85.secondOfDay();
        org.joda.time.DurationField durationField92 = ethiopicChronology85.minutes();
        org.joda.time.DurationField durationField93 = ethiopicChronology85.years();
        org.joda.time.DateTimeField dateTimeField94 = ethiopicChronology85.minuteOfHour();
        boolean boolean95 = dateTime32.equals((java.lang.Object) ethiopicChronology85);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField13 and durationField93", (durationField13.compareTo(durationField93) == 0) == durationField13.equals(durationField93));
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test234");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = ethiopicChronology1.getZone();
        org.joda.time.Chronology chronology6 = ethiopicChronology1.withUTC();
        org.joda.time.DurationField durationField7 = ethiopicChronology1.minutes();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology1.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology1.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology1.millisOfDay();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology1.year();
        org.joda.time.DurationField durationField13 = ethiopicChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField13, durationField3, and durationField7", !(durationField13.compareTo(durationField3) == 0) || (Math.signum(durationField13.compareTo(durationField7)) == Math.signum(durationField3.compareTo(durationField7))));
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test235");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology1.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.Chronology chronology5 = ethiopicChronology1.withZone(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology1.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology1.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology1.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology1.year();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology1.minuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = ethiopicChronology1.getZone();
        org.joda.time.DateTimeZone dateTimeZone13 = ethiopicChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology1.centuryOfEra();
        org.joda.time.DurationField durationField15 = ethiopicChronology1.weeks();
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        long long19 = ethiopicChronology1.add(readablePeriod16, 53L, 126);
        org.joda.time.DurationField durationField20 = ethiopicChronology1.eras();
        org.joda.time.DateTimeField dateTimeField21 = ethiopicChronology1.clockhourOfHalfday();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField15 and durationField20", Math.signum(durationField15.compareTo(durationField20)) == -Math.signum(durationField20.compareTo(durationField15)));
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test236");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(548);
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime(chronology2);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime3.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime3.plusWeeks((int) (byte) 10);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(chronology10);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime11.withMillisOfSecond((int) (byte) 1);
        int int16 = localDateTime3.compareTo((org.joda.time.ReadablePartial) localDateTime11);
        org.joda.time.LocalDateTime.Property property17 = localDateTime11.weekyear();
        org.joda.time.LocalDateTime.Property property18 = localDateTime11.millisOfDay();
        org.joda.time.LocalDateTime.Property property19 = localDateTime11.dayOfWeek();
        boolean boolean20 = dateTimeZone1.isLocalDateTimeGap(localDateTime11);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 100);
        long long25 = dateTimeZone22.adjustOffset((-31449599999L), false);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 10);
        long long29 = dateTimeZone22.getMillisKeepLocal(dateTimeZone27, (long) 'a');
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology31 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone30);
        org.joda.time.DateTimeField dateTimeField32 = ethiopicChronology31.clockhourOfDay();
        org.joda.time.DurationField durationField33 = ethiopicChronology31.weekyears();
        org.joda.time.DateTimeField dateTimeField34 = ethiopicChronology31.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone35 = ethiopicChronology31.getZone();
        java.lang.String str36 = dateTimeZone35.getID();
        int int38 = dateTimeZone35.getStandardOffset((long) (-1));
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.LocalDateTime localDateTime40 = new org.joda.time.LocalDateTime(chronology39);
        org.joda.time.LocalDateTime localDateTime42 = localDateTime40.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime44 = localDateTime40.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime46 = localDateTime40.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.DateTime dateTime48 = localDateTime46.toDateTime(readableInstant47);
        org.joda.time.DateTimeFieldType dateTimeFieldType49 = null;
        boolean boolean50 = dateTime48.isSupported(dateTimeFieldType49);
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.LocalDateTime localDateTime52 = new org.joda.time.LocalDateTime(chronology51);
        org.joda.time.LocalDateTime localDateTime54 = localDateTime52.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime56 = localDateTime52.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime58 = localDateTime52.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant59 = null;
        org.joda.time.DateTime dateTime60 = localDateTime58.toDateTime(readableInstant59);
        org.joda.time.DateTimeFieldType dateTimeFieldType61 = null;
        boolean boolean62 = dateTime60.isSupported(dateTimeFieldType61);
        int int63 = dateTime48.compareTo((org.joda.time.ReadableInstant) dateTime60);
        int int64 = dateTimeZone35.getOffset((org.joda.time.ReadableInstant) dateTime48);
        org.joda.time.Instant instant65 = dateTime48.toInstant();
        int int66 = dateTimeZone22.getOffset((org.joda.time.ReadableInstant) instant65);
        org.joda.time.DateTime dateTime67 = localDateTime11.toDateTime((org.joda.time.ReadableInstant) instant65);
        org.joda.time.DateTimeZone dateTimeZone68 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology69 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone68);
        org.joda.time.DateTimeField dateTimeField70 = ethiopicChronology69.clockhourOfDay();
        org.joda.time.DurationField durationField71 = ethiopicChronology69.weekyears();
        org.joda.time.DateTimeField dateTimeField72 = ethiopicChronology69.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone73 = ethiopicChronology69.getZone();
        org.joda.time.Chronology chronology74 = ethiopicChronology69.withUTC();
        org.joda.time.DurationField durationField75 = ethiopicChronology69.days();
        org.joda.time.DurationField durationField76 = ethiopicChronology69.hours();
        org.joda.time.DateTimeField dateTimeField77 = ethiopicChronology69.weekyear();
        org.joda.time.DateTimeField dateTimeField78 = ethiopicChronology69.millisOfDay();
        org.joda.time.DateTimeField dateTimeField79 = ethiopicChronology69.secondOfDay();
        boolean boolean80 = dateTime67.equals((java.lang.Object) ethiopicChronology69);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime48 and instant65", (dateTime48.compareTo(instant65) == 0) == dateTime48.equals(instant65));
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test237");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DurationField durationField4 = ethiopicChronology1.centuries();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology1.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 100);
        long long11 = dateTimeZone8.adjustOffset((-31449599999L), false);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 10);
        long long15 = dateTimeZone8.getMillisKeepLocal(dateTimeZone13, (long) 'a');
        org.joda.time.LocalDateTime localDateTime16 = org.joda.time.LocalDateTime.now(dateTimeZone13);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.plusDays((int) 'u');
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology20 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone19);
        org.joda.time.DateTimeField dateTimeField21 = ethiopicChronology20.hourOfDay();
        org.joda.time.DateTimeField dateTimeField22 = ethiopicChronology20.centuryOfEra();
        org.joda.time.DurationField durationField23 = ethiopicChronology20.millis();
        org.joda.time.DateTimeField dateTimeField24 = ethiopicChronology20.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField25 = ethiopicChronology20.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField26 = ethiopicChronology20.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField27 = ethiopicChronology20.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField28 = ethiopicChronology20.era();
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime(chronology29);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime30.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime30.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime30.withYearOfCentury(0);
        org.joda.time.LocalDateTime.Property property37 = localDateTime36.weekyear();
        org.joda.time.LocalDateTime localDateTime38 = property37.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime40 = localDateTime38.minusDays(304);
        int[] intArray42 = ethiopicChronology20.get((org.joda.time.ReadablePartial) localDateTime38, 4320000000L);
        ethiopicChronology1.validate((org.joda.time.ReadablePartial) localDateTime16, intArray42);
        org.joda.time.DurationField durationField44 = ethiopicChronology1.weekyears();
        org.joda.time.DurationField durationField45 = ethiopicChronology1.years();
        org.joda.time.DurationField durationField46 = ethiopicChronology1.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField46 and durationField45", (durationField46.compareTo(durationField45) == 0) == durationField46.equals(durationField45));
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test238");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology2 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology2.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology2.secondOfDay();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology2.secondOfDay();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) 10, (org.joda.time.Chronology) ethiopicChronology2);
        org.joda.time.DurationField durationField7 = ethiopicChronology2.hours();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology2.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology2.halfdayOfDay();
        org.joda.time.DurationField durationField10 = ethiopicChronology2.millis();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology2.clockhourOfDay();
        org.joda.time.DurationField durationField12 = ethiopicChronology2.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField12, durationField7, and durationField10", !(durationField12.compareTo(durationField7) == 0) || (Math.signum(durationField12.compareTo(durationField10)) == Math.signum(durationField7.compareTo(durationField10))));
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test239");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology1.centuryOfEra();
        org.joda.time.DurationField durationField4 = ethiopicChronology1.millis();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology1.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology1.secondOfDay();
        java.lang.String str8 = ethiopicChronology1.toString();
        org.joda.time.DurationField durationField9 = ethiopicChronology1.centuries();
        org.joda.time.DurationField durationField10 = ethiopicChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField10, durationField4, and durationField9", !(durationField10.compareTo(durationField4) == 0) || (Math.signum(durationField10.compareTo(durationField9)) == Math.signum(durationField4.compareTo(durationField9))));
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test240");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = ethiopicChronology1.getZone();
        org.joda.time.Chronology chronology6 = ethiopicChronology1.withUTC();
        org.joda.time.DurationField durationField7 = ethiopicChronology1.minutes();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology1.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology1.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology1.millisOfDay();
        org.joda.time.DurationField durationField12 = ethiopicChronology1.years();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology1.millisOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField12", (durationField3.compareTo(durationField12) == 0) == durationField3.equals(durationField12));
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test241");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = ethiopicChronology1.getZone();
        org.joda.time.DurationField durationField6 = ethiopicChronology1.centuries();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology1.secondOfMinute();
        org.joda.time.DurationField durationField9 = ethiopicChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology1.clockhourOfHalfday();
        org.joda.time.DurationField durationField11 = ethiopicChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology1.yearOfCentury();
        org.joda.time.DurationField durationField13 = ethiopicChronology1.years();
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology1.yearOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField13", (durationField3.compareTo(durationField13) == 0) == durationField3.equals(durationField13));
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test242");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = ethiopicChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.monthOfYear();
        org.joda.time.DurationField durationField7 = ethiopicChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology1.year();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology1.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology1.weekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        long long14 = ethiopicChronology1.add(readablePeriod11, (long) '#', 515);
        org.joda.time.DurationField durationField15 = ethiopicChronology1.halfdays();
        org.joda.time.DurationField durationField16 = ethiopicChronology1.years();
        org.joda.time.DateTimeField dateTimeField17 = ethiopicChronology1.dayOfWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField16", (durationField3.compareTo(durationField16) == 0) == durationField3.equals(durationField16));
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test243");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology1.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.Chronology chronology5 = ethiopicChronology1.withZone(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.millisOfSecond();
        org.joda.time.DurationField durationField7 = ethiopicChronology1.eras();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology1.dayOfWeek();
        org.joda.time.DurationField durationField9 = ethiopicChronology1.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField7, durationField9, and durationField7", !(durationField7.compareTo(durationField9) == 0) || (Math.signum(durationField7.compareTo(durationField7)) == Math.signum(durationField9.compareTo(durationField7))));
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test244");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = ethiopicChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.monthOfYear();
        org.joda.time.DurationField durationField7 = ethiopicChronology1.seconds();
        org.joda.time.DurationField durationField8 = ethiopicChronology1.hours();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology1.era();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology1.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology1.dayOfMonth();
        org.joda.time.DurationField durationField12 = ethiopicChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField12, durationField3, and durationField7", !(durationField12.compareTo(durationField3) == 0) || (Math.signum(durationField12.compareTo(durationField7)) == Math.signum(durationField3.compareTo(durationField7))));
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test245");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DurationField durationField4 = ethiopicChronology1.centuries();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology1.weekyear();
        org.joda.time.DurationField durationField6 = ethiopicChronology1.halfdays();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology1.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology1.era();
        org.joda.time.DurationField durationField9 = ethiopicChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField3, and durationField4", !(durationField9.compareTo(durationField3) == 0) || (Math.signum(durationField9.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test246");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology1.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.Chronology chronology5 = ethiopicChronology1.withZone(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.millisOfSecond();
        org.joda.time.DurationField durationField7 = ethiopicChronology1.eras();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(chronology8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime9.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withMillisOfSecond((int) (short) 0);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(chronology16);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray18 = localDateTime17.getFieldTypes();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime17.withMillisOfDay((int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime20.withDayOfYear(53);
        boolean boolean23 = localDateTime15.isAfter((org.joda.time.ReadablePartial) localDateTime22);
        long long25 = ethiopicChronology1.set((org.joda.time.ReadablePartial) localDateTime15, (long) 3);
        org.joda.time.DateTimeField dateTimeField26 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField27 = ethiopicChronology1.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField7, durationField27, and durationField7", !(durationField7.compareTo(durationField27) == 0) || (Math.signum(durationField7.compareTo(durationField7)) == Math.signum(durationField27.compareTo(durationField7))));
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test247");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology2 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology2.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology2.secondOfDay();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology2.secondOfDay();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) 10, (org.joda.time.Chronology) ethiopicChronology2);
        org.joda.time.DurationField durationField7 = ethiopicChronology2.hours();
        org.joda.time.DurationField durationField8 = ethiopicChronology2.eras();
        org.joda.time.DurationField durationField9 = ethiopicChronology2.years();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField7 and durationField8", Math.signum(durationField7.compareTo(durationField8)) == -Math.signum(durationField8.compareTo(durationField7)));
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test248");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = ethiopicChronology1.getZone();
        org.joda.time.Chronology chronology6 = ethiopicChronology1.withUTC();
        org.joda.time.DurationField durationField7 = ethiopicChronology1.days();
        org.joda.time.DurationField durationField8 = ethiopicChronology1.hours();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology1.weekyear();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology1.millisOfDay();
        org.joda.time.DurationField durationField11 = ethiopicChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField11, durationField3, and durationField7", !(durationField11.compareTo(durationField3) == 0) || (Math.signum(durationField11.compareTo(durationField7)) == Math.signum(durationField3.compareTo(durationField7))));
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test249");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DurationField durationField4 = ethiopicChronology1.hours();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology1.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology1.yearOfEra();
        org.joda.time.DurationField durationField8 = ethiopicChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology1.dayOfYear();
        org.joda.time.DurationField durationField10 = ethiopicChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology1.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((long) (-36518));
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology17 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone16);
        org.joda.time.DateTimeField dateTimeField18 = ethiopicChronology17.clockhourOfDay();
        org.joda.time.DurationField durationField19 = ethiopicChronology17.weekyears();
        org.joda.time.DateTimeField dateTimeField20 = ethiopicChronology17.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone21 = ethiopicChronology17.getZone();
        org.joda.time.Chronology chronology22 = ethiopicChronology17.withUTC();
        org.joda.time.DurationField durationField23 = ethiopicChronology17.minutes();
        org.joda.time.DurationField durationField24 = ethiopicChronology17.centuries();
        org.joda.time.DateTimeField dateTimeField25 = ethiopicChronology17.secondOfMinute();
        org.joda.time.DurationField durationField26 = ethiopicChronology17.months();
        boolean boolean27 = durationField26.isSupported();
        org.joda.time.DurationFieldType durationFieldType28 = durationField26.getType();
        org.joda.time.LocalDateTime localDateTime30 = localDateTime15.withFieldAdded(durationFieldType28, 40151);
        org.joda.time.LocalDateTime.Property property31 = localDateTime30.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime33 = localDateTime30.minusSeconds(0);
        int[] intArray35 = ethiopicChronology1.get((org.joda.time.ReadablePartial) localDateTime30, 544494225L);
        org.joda.time.DurationField durationField36 = ethiopicChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField36, durationField3, and durationField4", !(durationField36.compareTo(durationField3) == 0) || (Math.signum(durationField36.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test250");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology1.secondOfDay();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology1.secondOfDay();
        org.joda.time.DurationField durationField5 = ethiopicChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.clockhourOfHalfday();
        org.joda.time.DurationField durationField7 = ethiopicChronology1.weeks();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology9 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone8);
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology9.clockhourOfDay();
        org.joda.time.DurationField durationField11 = ethiopicChronology9.weekyears();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology9.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone13 = ethiopicChronology9.getZone();
        java.lang.String str14 = dateTimeZone13.getID();
        int int16 = dateTimeZone13.getStandardOffset((long) (-1));
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime(chronology17);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime18.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime18.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.DateTime dateTime26 = localDateTime24.toDateTime(readableInstant25);
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = null;
        boolean boolean28 = dateTime26.isSupported(dateTimeFieldType27);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime(chronology29);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime30.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime30.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime30.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.DateTime dateTime38 = localDateTime36.toDateTime(readableInstant37);
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = null;
        boolean boolean40 = dateTime38.isSupported(dateTimeFieldType39);
        int int41 = dateTime26.compareTo((org.joda.time.ReadableInstant) dateTime38);
        int int42 = dateTimeZone13.getOffset((org.joda.time.ReadableInstant) dateTime26);
        org.joda.time.Chronology chronology43 = ethiopicChronology1.withZone(dateTimeZone13);
        org.joda.time.DateTimeField dateTimeField44 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone45 = ethiopicChronology1.getZone();
        org.joda.time.DurationField durationField46 = ethiopicChronology1.seconds();
        org.joda.time.DurationField durationField47 = ethiopicChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField47, durationField5, and durationField11", !(durationField47.compareTo(durationField5) == 0) || (Math.signum(durationField47.compareTo(durationField11)) == Math.signum(durationField5.compareTo(durationField11))));
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test251");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = ethiopicChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.monthOfYear();
        org.joda.time.DurationField durationField7 = ethiopicChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology1.weekOfWeekyear();
        org.joda.time.DurationField durationField10 = ethiopicChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField10, durationField3, and durationField7", !(durationField10.compareTo(durationField3) == 0) || (Math.signum(durationField10.compareTo(durationField7)) == Math.signum(durationField3.compareTo(durationField7))));
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test252");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = ethiopicChronology1.getZone();
        org.joda.time.DurationField durationField6 = ethiopicChronology1.centuries();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology1.secondOfMinute();
        org.joda.time.DurationField durationField9 = ethiopicChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology1.clockhourOfHalfday();
        org.joda.time.DurationField durationField11 = ethiopicChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology1.yearOfCentury();
        org.joda.time.DurationField durationField13 = ethiopicChronology1.years();
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology1.yearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField13", (durationField3.compareTo(durationField13) == 0) == durationField3.equals(durationField13));
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test253");
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
        org.joda.time.LocalDateTime localDateTime17 = localDateTime11.withYearOfCentury(0);
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.weekyear();
        org.joda.time.LocalDateTime localDateTime20 = property18.setCopy((int) (byte) 1);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime(chronology21);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime22.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime22.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime22.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.DateTime dateTime30 = localDateTime28.toDateTime(readableInstant29);
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = null;
        boolean boolean32 = dateTime30.isSupported(dateTimeFieldType31);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime(chronology33);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime34.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime38 = localDateTime34.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime40 = localDateTime34.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant41 = null;
        org.joda.time.DateTime dateTime42 = localDateTime40.toDateTime(readableInstant41);
        org.joda.time.DateTimeFieldType dateTimeFieldType43 = null;
        boolean boolean44 = dateTime42.isSupported(dateTimeFieldType43);
        int int45 = dateTime30.compareTo((org.joda.time.ReadableInstant) dateTime42);
        int int46 = property18.compareTo((org.joda.time.ReadableInstant) dateTime42);
        boolean boolean47 = dateTime9.isEqual((org.joda.time.ReadableInstant) dateTime42);
        org.joda.time.DateTimeZone dateTimeZone48 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology49 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone48);
        org.joda.time.DateTimeField dateTimeField50 = ethiopicChronology49.hourOfDay();
        org.joda.time.DateTimeField dateTimeField51 = ethiopicChronology49.secondOfDay();
        org.joda.time.DateTimeField dateTimeField52 = ethiopicChronology49.secondOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType53 = dateTimeField52.getType();
        boolean boolean54 = dateTime42.isSupported(dateTimeFieldType53);
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.LocalDateTime localDateTime56 = new org.joda.time.LocalDateTime(chronology55);
        org.joda.time.LocalDateTime localDateTime58 = localDateTime56.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime60 = localDateTime56.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime62 = localDateTime56.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant63 = null;
        org.joda.time.DateTime dateTime64 = localDateTime62.toDateTime(readableInstant63);
        java.util.Locale locale65 = java.util.Locale.GERMANY;
        boolean boolean66 = locale65.hasExtensions();
        boolean boolean67 = dateTime64.equals((java.lang.Object) locale65);
        java.lang.String str68 = dateTime64.toString();
        long long69 = dateTime64.getMillis();
        boolean boolean70 = dateTime42.isBefore((org.joda.time.ReadableInstant) dateTime64);
        org.joda.time.Instant instant71 = dateTime64.toInstant();
        long long72 = dateTime64.getMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and instant71", (dateTime9.compareTo(instant71) == 0) == dateTime9.equals(instant71));
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test254");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DurationField durationField4 = ethiopicChronology1.centuries();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology1.weekyear();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.yearOfEra();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology1.weekyear();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology1.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology1.monthOfYear();
        org.joda.time.DurationField durationField10 = ethiopicChronology1.months();
        org.joda.time.DurationField durationField11 = ethiopicChronology1.minutes();
        org.joda.time.DurationField durationField12 = ethiopicChronology1.years();
        java.lang.String str13 = ethiopicChronology1.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField12", (durationField3.compareTo(durationField12) == 0) == durationField3.equals(durationField12));
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test255");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DurationField durationField4 = ethiopicChronology1.centuries();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology1.weekyear();
        org.joda.time.DurationField durationField6 = ethiopicChronology1.halfdays();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology1.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology1.era();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology1.year();
        org.joda.time.DurationField durationField10 = ethiopicChronology1.centuries();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology1.minuteOfHour();
        org.joda.time.DurationField durationField13 = ethiopicChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField13, durationField3, and durationField4", !(durationField13.compareTo(durationField3) == 0) || (Math.signum(durationField13.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test256");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DurationField durationField4 = ethiopicChronology1.hours();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology1.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.minuteOfDay();
        org.joda.time.Chronology chronology7 = ethiopicChronology1.withUTC();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        long long11 = ethiopicChronology1.add(readablePeriod8, 631152000062L, 487);
        java.lang.String str12 = ethiopicChronology1.toString();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology1.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology1.hourOfDay();
        org.joda.time.DurationField durationField15 = ethiopicChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField15, durationField3, and durationField4", !(durationField15.compareTo(durationField3) == 0) || (Math.signum(durationField15.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test257");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = ethiopicChronology1.getZone();
        org.joda.time.Chronology chronology6 = ethiopicChronology1.withUTC();
        org.joda.time.DurationField durationField7 = ethiopicChronology1.minutes();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(chronology8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime9.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withMillisOfSecond((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime13.withMinuteOfHour(10);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime13.minusYears((-292269338));
        org.joda.time.LocalDateTime localDateTime21 = localDateTime13.minusYears(40146);
        int[] intArray23 = ethiopicChronology1.get((org.joda.time.ReadablePartial) localDateTime13, (long) 433);
        org.joda.time.DurationField durationField24 = ethiopicChronology1.months();
        org.joda.time.DurationField durationField25 = ethiopicChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField25, durationField3, and durationField7", !(durationField25.compareTo(durationField3) == 0) || (Math.signum(durationField25.compareTo(durationField7)) == Math.signum(durationField3.compareTo(durationField7))));
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test258");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 10);
        java.lang.String str8 = dateTimeZone6.getShortName((long) 1);
        org.joda.time.Chronology chronology9 = ethiopicChronology1.withZone(dateTimeZone6);
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology1.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology1.secondOfDay();
        org.joda.time.DurationField durationField12 = ethiopicChronology1.years();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology1.minuteOfHour();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField12", (durationField3.compareTo(durationField12) == 0) == durationField3.equals(durationField12));
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test259");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology1.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.Chronology chronology5 = ethiopicChronology1.withZone(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology1.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology1.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology1.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology1.year();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology1.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology1.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology1.yearOfEra();
        org.joda.time.DurationField durationField14 = ethiopicChronology1.weeks();
        int int16 = durationField14.getValue(77249400000L);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology18 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone17);
        org.joda.time.DateTimeField dateTimeField19 = ethiopicChronology18.clockhourOfDay();
        org.joda.time.DurationField durationField20 = ethiopicChronology18.weekyears();
        org.joda.time.DateTimeField dateTimeField21 = ethiopicChronology18.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone22 = ethiopicChronology18.getZone();
        org.joda.time.Chronology chronology23 = ethiopicChronology18.withUTC();
        org.joda.time.DurationField durationField24 = ethiopicChronology18.days();
        org.joda.time.DurationField durationField25 = ethiopicChronology18.hours();
        org.joda.time.DateTimeField dateTimeField26 = ethiopicChronology18.weekyear();
        org.joda.time.DurationField durationField27 = ethiopicChronology18.years();
        java.lang.String str28 = durationField27.toString();
        int int29 = durationField14.compareTo(durationField27);
        long long32 = durationField14.getMillis(2922789, 15120000000L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField20 and durationField27", (durationField20.compareTo(durationField27) == 0) == durationField20.equals(durationField27));
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test260");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DurationField durationField4 = ethiopicChronology1.centuries();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology1.weekyear();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.yearOfEra();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology1.weekyear();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology1.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology1.monthOfYear();
        org.joda.time.DurationField durationField10 = ethiopicChronology1.months();
        org.joda.time.DurationField durationField11 = ethiopicChronology1.minutes();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology1.yearOfCentury();
        org.joda.time.DurationField durationField13 = ethiopicChronology1.years();
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology1.dayOfWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField13", (durationField3.compareTo(durationField13) == 0) == durationField3.equals(durationField13));
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test261");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = ethiopicChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.monthOfYear();
        org.joda.time.DurationField durationField7 = ethiopicChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology1.year();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology1.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology1.weekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        long long14 = ethiopicChronology1.add(readablePeriod11, (long) '#', 515);
        org.joda.time.DurationField durationField15 = ethiopicChronology1.halfdays();
        org.joda.time.DurationField durationField16 = ethiopicChronology1.years();
        org.joda.time.DateTimeField dateTimeField17 = ethiopicChronology1.minuteOfHour();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField16", (durationField3.compareTo(durationField16) == 0) == durationField3.equals(durationField16));
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test262");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology1.centuryOfEra();
        org.joda.time.DurationField durationField4 = ethiopicChronology1.eras();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology1.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology8 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone7);
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology8.hourOfDay();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology8.secondOfDay();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology8.secondOfDay();
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime((long) 10, (org.joda.time.Chronology) ethiopicChronology8);
        org.joda.time.DurationField durationField13 = ethiopicChronology8.days();
        org.joda.time.DateTimeZone dateTimeZone14 = ethiopicChronology8.getZone();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology16 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField17 = ethiopicChronology16.hourOfDay();
        org.joda.time.DateTimeField dateTimeField18 = ethiopicChronology16.centuryOfEra();
        org.joda.time.DurationField durationField19 = ethiopicChronology16.millis();
        org.joda.time.DateTimeField dateTimeField20 = ethiopicChronology16.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField21 = ethiopicChronology16.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField22 = ethiopicChronology16.weekyear();
        boolean boolean23 = ethiopicChronology8.equals((java.lang.Object) dateTimeField22);
        org.joda.time.DateTimeField dateTimeField24 = ethiopicChronology8.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField25 = ethiopicChronology8.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology27 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone26);
        org.joda.time.DateTimeField dateTimeField28 = ethiopicChronology27.hourOfDay();
        org.joda.time.DateTimeField dateTimeField29 = ethiopicChronology27.centuryOfEra();
        org.joda.time.DurationField durationField30 = ethiopicChronology27.millis();
        org.joda.time.DateTimeField dateTimeField31 = ethiopicChronology27.secondOfMinute();
        long long35 = ethiopicChronology27.add(6311520000100L, (long) 5, 25702);
        org.joda.time.DateTimeField dateTimeField36 = ethiopicChronology27.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField37 = ethiopicChronology27.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField38 = ethiopicChronology27.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone39 = ethiopicChronology27.getZone();
        org.joda.time.Chronology chronology40 = ethiopicChronology8.withZone(dateTimeZone39);
        org.joda.time.DateTimeField dateTimeField41 = ethiopicChronology8.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology43 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone42);
        org.joda.time.DateTimeField dateTimeField44 = ethiopicChronology43.clockhourOfDay();
        org.joda.time.DurationField durationField45 = ethiopicChronology43.weekyears();
        org.joda.time.DateTimeField dateTimeField46 = ethiopicChronology43.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone47 = ethiopicChronology43.getZone();
        org.joda.time.DateTimeField dateTimeField48 = ethiopicChronology43.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField49 = ethiopicChronology43.dayOfWeek();
        org.joda.time.DurationField durationField50 = ethiopicChronology43.days();
        org.joda.time.DurationField durationField51 = ethiopicChronology43.days();
        org.joda.time.DateTimeField dateTimeField52 = ethiopicChronology43.dayOfYear();
        org.joda.time.DateTimeField dateTimeField53 = ethiopicChronology43.minuteOfDay();
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.LocalDateTime localDateTime55 = new org.joda.time.LocalDateTime(chronology54);
        org.joda.time.LocalDateTime localDateTime57 = localDateTime55.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime59 = localDateTime55.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime.Property property60 = localDateTime59.dayOfWeek();
        java.lang.String str61 = property60.getName();
        org.joda.time.LocalDateTime localDateTime63 = property60.addToCopy(542);
        java.util.Locale locale64 = java.util.Locale.ITALIAN;
        org.joda.time.DateTimeZone dateTimeZone65 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology66 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone65);
        org.joda.time.DateTimeField dateTimeField67 = ethiopicChronology66.clockhourOfDay();
        java.util.Locale locale69 = java.util.Locale.ITALIAN;
        java.lang.String str70 = dateTimeField67.getAsText((long) 'a', locale69);
        org.joda.time.DateTimeZone dateTimeZone71 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology72 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone71);
        org.joda.time.DateTimeField dateTimeField73 = ethiopicChronology72.clockhourOfDay();
        org.joda.time.DurationField durationField74 = ethiopicChronology72.weekyears();
        org.joda.time.DateTimeField dateTimeField75 = ethiopicChronology72.clockhourOfDay();
        org.joda.time.Chronology chronology76 = null;
        org.joda.time.LocalDateTime localDateTime77 = new org.joda.time.LocalDateTime(chronology76);
        org.joda.time.LocalDateTime localDateTime79 = localDateTime77.plusWeeks((int) (byte) -1);
        java.util.Locale locale81 = java.util.Locale.GERMANY;
        java.lang.String str82 = locale81.getScript();
        org.joda.time.DateTimeZone dateTimeZone83 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology84 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone83);
        org.joda.time.DateTimeField dateTimeField85 = ethiopicChronology84.clockhourOfDay();
        java.util.Locale locale87 = java.util.Locale.ITALIAN;
        java.lang.String str88 = dateTimeField85.getAsText((long) 'a', locale87);
        java.lang.String str89 = locale81.getDisplayName(locale87);
        java.lang.String str90 = dateTimeField75.getAsShortText((org.joda.time.ReadablePartial) localDateTime79, (int) ' ', locale87);
        java.lang.String str91 = locale69.getDisplayVariant(locale87);
        java.lang.String str92 = locale64.getDisplayCountry(locale69);
        java.lang.String str93 = dateTimeField53.getAsText((org.joda.time.ReadablePartial) localDateTime63, locale69);
        int int94 = dateTimeField41.getMaximumTextLength(locale69);
        int int95 = dateTimeField5.getMaximumShortTextLength(locale69);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField4 and durationField13", Math.signum(durationField4.compareTo(durationField13)) == -Math.signum(durationField13.compareTo(durationField4)));
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test263");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DurationField durationField4 = ethiopicChronology1.centuries();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology1.weekyear();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.yearOfEra();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology1.weekyear();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology1.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology1.monthOfYear();
        org.joda.time.DurationField durationField10 = ethiopicChronology1.months();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology1.hourOfDay();
        org.joda.time.DurationField durationField12 = ethiopicChronology1.millis();
        long long14 = durationField12.getValueAsLong((long) 792);
        long long17 = durationField12.getDifferenceAsLong(5707065600021L, (-1922L));
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology20 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone19);
        org.joda.time.DateTimeField dateTimeField21 = ethiopicChronology20.hourOfDay();
        org.joda.time.DateTimeField dateTimeField22 = ethiopicChronology20.secondOfDay();
        org.joda.time.DateTimeField dateTimeField23 = ethiopicChronology20.secondOfDay();
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime((long) 10, (org.joda.time.Chronology) ethiopicChronology20);
        org.joda.time.DurationField durationField25 = ethiopicChronology20.days();
        org.joda.time.DateTimeZone dateTimeZone26 = ethiopicChronology20.getZone();
        org.joda.time.DateTimeField dateTimeField27 = ethiopicChronology20.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField28 = ethiopicChronology20.millisOfDay();
        org.joda.time.Chronology chronology29 = ethiopicChronology20.withUTC();
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology31 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone30);
        org.joda.time.DateTimeField dateTimeField32 = ethiopicChronology31.dayOfMonth();
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime(chronology33);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime34.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime38 = localDateTime34.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime40 = localDateTime34.plusWeeks((int) (byte) 10);
        java.util.Locale locale41 = java.util.Locale.PRC;
        java.lang.String str42 = dateTimeField32.getAsText((org.joda.time.ReadablePartial) localDateTime40, locale41);
        java.util.Set<java.lang.String> strSet43 = locale41.getUnicodeLocaleKeys();
        java.lang.String[] strArray53 = new java.lang.String[] { "UTC", "UTC", "tedesco (Germania)", "Etc/UTC", "Etc/UTC", "", "", "10", "Etc/UTC" };
        java.util.LinkedHashSet<java.lang.String> strSet54 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet54, strArray53);
        java.util.Locale.LanguageRange[] languageRangeArray56 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList57 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList57, languageRangeArray56);
        java.util.Collection<java.lang.String> strCollection59 = null;
        java.util.List<java.lang.String> strList60 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList57, strCollection59);
        boolean boolean61 = strSet54.retainAll((java.util.Collection<java.lang.String>) strList60);
        boolean boolean62 = strSet43.containsAll((java.util.Collection<java.lang.String>) strList60);
        java.util.Locale.LanguageRange[] languageRangeArray63 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList64 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList64, languageRangeArray63);
        java.util.Collection<java.lang.String> strCollection66 = null;
        java.util.List<java.lang.String> strList67 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList64, strCollection66);
        java.util.Collection<java.lang.String> strCollection68 = null;
        java.util.Locale.FilteringMode filteringMode69 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList70 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList64, strCollection68, filteringMode69);
        boolean boolean71 = strSet43.retainAll((java.util.Collection<java.lang.String>) strList70);
        boolean boolean72 = ethiopicChronology20.equals((java.lang.Object) boolean71);
        org.joda.time.DurationField durationField73 = ethiopicChronology20.eras();
        int int74 = durationField12.compareTo(durationField73);
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField73, durationField3, and durationField4", !(durationField73.compareTo(durationField3) == 0) || (Math.signum(durationField73.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test264");
        java.lang.String[] strArray9 = new java.lang.String[] { "de_DE", "", "", "7", "3", "UTC", "24", "2022-02-15T07:08:12.450", "2022-02-15T07:08:12.450" };
        java.util.LinkedHashSet<java.lang.String> strSet10 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet10, strArray9);
        java.util.Set<java.lang.String> strSet12 = org.joda.time.DateTimeZone.getAvailableIDs();
        boolean boolean13 = strSet10.addAll((java.util.Collection<java.lang.String>) strSet12);
        int int14 = strSet10.size();
        java.util.stream.Stream<java.lang.String> strStream15 = strSet10.parallelStream();
        java.lang.String[] strArray25 = new java.lang.String[] { "de_DE", "", "", "7", "3", "UTC", "24", "2022-02-15T07:08:12.450", "2022-02-15T07:08:12.450" };
        java.util.LinkedHashSet<java.lang.String> strSet26 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet26, strArray25);
        java.util.Set<java.lang.String> strSet28 = org.joda.time.DateTimeZone.getAvailableIDs();
        boolean boolean29 = strSet26.addAll((java.util.Collection<java.lang.String>) strSet28);
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology31 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone30);
        org.joda.time.DateTimeField dateTimeField32 = ethiopicChronology31.hourOfDay();
        org.joda.time.DateTimeField dateTimeField33 = ethiopicChronology31.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.Chronology chronology35 = ethiopicChronology31.withZone(dateTimeZone34);
        org.joda.time.DateTimeField dateTimeField36 = ethiopicChronology31.millisOfSecond();
        boolean boolean37 = strSet26.contains((java.lang.Object) ethiopicChronology31);
        java.util.stream.Stream<java.lang.String> strStream38 = strSet26.parallelStream();
        boolean boolean39 = strSet10.addAll((java.util.Collection<java.lang.String>) strSet26);
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology41 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone40);
        org.joda.time.DateTimeField dateTimeField42 = ethiopicChronology41.clockhourOfDay();
        org.joda.time.DurationField durationField43 = ethiopicChronology41.weekyears();
        org.joda.time.DateTimeField dateTimeField44 = ethiopicChronology41.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 10);
        java.lang.String str48 = dateTimeZone46.getShortName((long) 1);
        org.joda.time.Chronology chronology49 = ethiopicChronology41.withZone(dateTimeZone46);
        boolean boolean50 = strSet10.contains((java.lang.Object) ethiopicChronology41);
        org.joda.time.DateTimeField dateTimeField51 = ethiopicChronology41.clockhourOfHalfday();
        org.joda.time.LocalDateTime localDateTime52 = new org.joda.time.LocalDateTime((org.joda.time.Chronology) ethiopicChronology41);
        org.joda.time.DateTimeZone dateTimeZone53 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology54 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone53);
        org.joda.time.DateTimeField dateTimeField55 = ethiopicChronology54.hourOfDay();
        org.joda.time.DateTimeField dateTimeField56 = ethiopicChronology54.secondOfDay();
        org.joda.time.DateTimeField dateTimeField57 = ethiopicChronology54.secondOfDay();
        org.joda.time.Chronology chronology58 = null;
        org.joda.time.LocalDateTime localDateTime59 = new org.joda.time.LocalDateTime(chronology58);
        org.joda.time.LocalDateTime localDateTime61 = localDateTime59.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime63 = localDateTime59.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime65 = localDateTime63.withMillisOfSecond((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime67 = localDateTime63.withMinuteOfHour(10);
        org.joda.time.LocalDateTime localDateTime69 = localDateTime63.minusDays(100);
        org.joda.time.LocalDateTime.Property property70 = localDateTime63.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime72 = localDateTime63.withWeekyear(1439);
        int int73 = localDateTime63.getHourOfDay();
        java.util.Locale locale76 = new java.util.Locale("Greenwich Zeit", "25704839");
        java.lang.String str77 = dateTimeField57.getAsShortText((org.joda.time.ReadablePartial) localDateTime63, locale76);
        org.joda.time.LocalDateTime.Property property78 = localDateTime63.era();
        org.joda.time.LocalDateTime localDateTime79 = localDateTime52.withFields((org.joda.time.ReadablePartial) localDateTime63);
        org.joda.time.LocalDateTime.Property property80 = localDateTime63.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime82 = localDateTime63.plusSeconds(687);
        java.util.Date date83 = localDateTime82.toDate();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on localDateTime63 and localDateTime79", (localDateTime63.compareTo(localDateTime79) == 0) == localDateTime63.equals(localDateTime79));
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test265");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = ethiopicChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.monthOfYear();
        org.joda.time.DurationField durationField7 = ethiopicChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology1.year();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology1.secondOfMinute();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(chronology10);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray12 = localDateTime11.getFieldTypes();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.withMillisOfDay((int) (byte) 0);
        org.joda.time.LocalDateTime.Property property15 = localDateTime11.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime17 = property15.addToCopy(458);
        long long19 = ethiopicChronology1.set((org.joda.time.ReadablePartial) localDateTime17, (long) 815);
        org.joda.time.DateTimeField dateTimeField20 = ethiopicChronology1.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField21 = ethiopicChronology1.weekyear();
        org.joda.time.DateTimeZone dateTimeZone22 = ethiopicChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField23 = ethiopicChronology1.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField24 = ethiopicChronology1.weekyearOfCentury();
        org.joda.time.DurationField durationField25 = ethiopicChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField25, durationField3, and durationField7", !(durationField25.compareTo(durationField3) == 0) || (Math.signum(durationField25.compareTo(durationField7)) == Math.signum(durationField3.compareTo(durationField7))));
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test266");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 10);
        long long3 = dateTimeZone1.convertUTCToLocal((long) (short) 100);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology4 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField5 = ethiopicChronology4.eras();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology4.weekyear();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology4.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology4.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology4.centuryOfEra();
        org.joda.time.DurationField durationField10 = ethiopicChronology4.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField5, durationField10, and durationField5", !(durationField5.compareTo(durationField10) == 0) || (Math.signum(durationField5.compareTo(durationField5)) == Math.signum(durationField10.compareTo(durationField5))));
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test267");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray2 = localDateTime1.getFieldTypes();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfDay((int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withDayOfYear(53);
        org.joda.time.LocalDateTime.Property property7 = localDateTime4.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime4.plusHours(529);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology11 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone10);
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology11.clockhourOfDay();
        org.joda.time.DurationField durationField13 = ethiopicChronology11.weekyears();
        org.joda.time.DurationField durationField14 = ethiopicChronology11.centuries();
        org.joda.time.DateTimeField dateTimeField15 = ethiopicChronology11.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField16 = ethiopicChronology11.weekyear();
        java.lang.String str17 = ethiopicChronology11.toString();
        org.joda.time.DateTimeZone dateTimeZone18 = ethiopicChronology11.getZone();
        org.joda.time.DurationField durationField19 = ethiopicChronology11.years();
        long long21 = durationField19.getMillis(0);
        org.joda.time.DurationFieldType durationFieldType22 = durationField19.getType();
        boolean boolean23 = localDateTime9.isSupported(durationFieldType22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField13 and durationField19", (durationField13.compareTo(durationField19) == 0) == durationField13.equals(durationField19));
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test268");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology1.monthOfYear();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology1.minuteOfHour();
        long long7 = dateTimeField4.getDifferenceAsLong((long) (byte) 100, (long) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology9 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone8);
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology9.hourOfDay();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology9.secondOfDay();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology9.secondOfDay();
        org.joda.time.DurationField durationField13 = ethiopicChronology9.weeks();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime(chronology14);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime15.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime15.withYearOfCentury(0);
        org.joda.time.LocalDateTime.Property property22 = localDateTime21.weekyear();
        org.joda.time.LocalDateTime.Property property23 = localDateTime21.secondOfMinute();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime(chronology24);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime25.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime25.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime25.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.DateTime dateTime33 = localDateTime31.toDateTime(readableInstant32);
        org.joda.time.LocalDateTime.Property property34 = localDateTime31.millisOfDay();
        org.joda.time.Interval interval35 = property34.toInterval();
        boolean boolean36 = localDateTime21.equals((java.lang.Object) property34);
        int[] intArray38 = ethiopicChronology9.get((org.joda.time.ReadablePartial) localDateTime21, (long) 1439);
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.LocalDateTime localDateTime40 = new org.joda.time.LocalDateTime(chronology39);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray41 = localDateTime40.getFieldTypes();
        org.joda.time.LocalDateTime localDateTime43 = localDateTime40.withMillisOfDay((int) (byte) 0);
        boolean boolean44 = localDateTime21.isBefore((org.joda.time.ReadablePartial) localDateTime40);
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology46 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone45);
        org.joda.time.DateTimeField dateTimeField47 = ethiopicChronology46.hourOfDay();
        org.joda.time.DateTimeField dateTimeField48 = ethiopicChronology46.centuryOfEra();
        org.joda.time.DurationField durationField49 = ethiopicChronology46.millis();
        org.joda.time.DurationField durationField50 = ethiopicChronology46.months();
        org.joda.time.DateTimeField dateTimeField51 = ethiopicChronology46.minuteOfDay();
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.LocalDateTime localDateTime53 = new org.joda.time.LocalDateTime(chronology52);
        org.joda.time.LocalDateTime localDateTime55 = localDateTime53.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime57 = localDateTime53.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime59 = localDateTime53.withYearOfEra(10);
        int[] intArray61 = ethiopicChronology46.get((org.joda.time.ReadablePartial) localDateTime53, (long) 458);
        int int62 = dateTimeField4.getMinimumValue((org.joda.time.ReadablePartial) localDateTime40, intArray61);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter63 = null;
        java.lang.String str64 = localDateTime40.toString(dateTimeFormatter63);
        org.joda.time.LocalDateTime localDateTime66 = localDateTime40.minusSeconds(100);
        org.joda.time.ReadableDuration readableDuration67 = null;
        org.joda.time.LocalDateTime localDateTime68 = localDateTime40.plus(readableDuration67);
        org.joda.time.DateTimeZone dateTimeZone69 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology70 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone69);
        org.joda.time.DateTimeField dateTimeField71 = ethiopicChronology70.hourOfDay();
        org.joda.time.DateTimeField dateTimeField72 = ethiopicChronology70.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone73 = null;
        org.joda.time.Chronology chronology74 = ethiopicChronology70.withZone(dateTimeZone73);
        org.joda.time.DateTimeField dateTimeField75 = ethiopicChronology70.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField76 = ethiopicChronology70.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField77 = ethiopicChronology70.hourOfHalfday();
        org.joda.time.DurationField durationField78 = ethiopicChronology70.eras();
        org.joda.time.DurationField durationField79 = ethiopicChronology70.eras();
        org.joda.time.DurationFieldType durationFieldType80 = durationField79.getType();
        org.joda.time.DurationFieldType durationFieldType81 = durationField79.getType();
        boolean boolean82 = localDateTime68.isSupported(durationFieldType81);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField13 and durationField78", Math.signum(durationField13.compareTo(durationField78)) == -Math.signum(durationField78.compareTo(durationField13)));
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test269");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = ethiopicChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.monthOfYear();
        org.joda.time.DurationField durationField7 = ethiopicChronology1.seconds();
        org.joda.time.DurationField durationField8 = ethiopicChronology1.hours();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology1.centuryOfEra();
        org.joda.time.DurationField durationField11 = ethiopicChronology1.years();
        org.joda.time.DurationField durationField12 = ethiopicChronology1.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField11", (durationField3.compareTo(durationField11) == 0) == durationField3.equals(durationField11));
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test270");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology1.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.Chronology chronology5 = ethiopicChronology1.withZone(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.millisOfSecond();
        org.joda.time.DurationField durationField7 = ethiopicChronology1.eras();
        org.joda.time.Chronology chronology8 = ethiopicChronology1.withUTC();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology1.secondOfDay();
        org.joda.time.DurationField durationField10 = ethiopicChronology1.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField7, durationField10, and durationField7", !(durationField7.compareTo(durationField10) == 0) || (Math.signum(durationField7.compareTo(durationField7)) == Math.signum(durationField10.compareTo(durationField7))));
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test271");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology1.secondOfDay();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology1.secondOfDay();
        org.joda.time.DurationField durationField5 = ethiopicChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.clockhourOfHalfday();
        org.joda.time.DurationField durationField7 = ethiopicChronology1.weeks();
        org.joda.time.DurationField durationField8 = ethiopicChronology1.years();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime(chronology9);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray11 = localDateTime10.getFieldTypes();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime10.withMillisOfDay((int) (byte) 0);
        int int14 = localDateTime13.getYear();
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.DateTime dateTime16 = localDateTime13.toDateTime(readableInstant15);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology18 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone17);
        org.joda.time.DateTimeField dateTimeField19 = ethiopicChronology18.hourOfDay();
        org.joda.time.DurationField durationField20 = ethiopicChronology18.days();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime(chronology21);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray23 = localDateTime22.getFieldTypes();
        org.joda.time.LocalDateTime localDateTime25 = localDateTime22.withMillisOfDay((int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime25.plusSeconds((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime27, dateTimeZone29);
        int[] intArray32 = ethiopicChronology18.get((org.joda.time.ReadablePartial) localDateTime30, 31450177L);
        ethiopicChronology1.validate((org.joda.time.ReadablePartial) localDateTime13, intArray32);
        org.joda.time.DurationField durationField34 = ethiopicChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField34, durationField5, and durationField8", !(durationField34.compareTo(durationField5) == 0) || (Math.signum(durationField34.compareTo(durationField8)) == Math.signum(durationField5.compareTo(durationField8))));
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test272");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology1.secondOfDay();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology1.secondOfDay();
        org.joda.time.DurationField durationField5 = ethiopicChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.weekyear();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.Chronology chronology8 = ethiopicChronology1.withZone(dateTimeZone7);
        org.joda.time.DurationField durationField9 = ethiopicChronology1.eras();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(chronology10);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime11.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime11.plusWeeks((int) (byte) 10);
        int int18 = localDateTime17.getMillisOfSecond();
        int int19 = localDateTime17.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime17.plusHours((int) (short) -1);
        int int22 = localDateTime17.getDayOfYear();
        org.joda.time.LocalDateTime.Property property23 = localDateTime17.weekyear();
        org.joda.time.LocalDateTime localDateTime25 = localDateTime17.withDayOfYear(12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = null;
        java.lang.String str27 = localDateTime25.toString(dateTimeFormatter26);
        int[] intArray29 = ethiopicChronology1.get((org.joda.time.ReadablePartial) localDateTime25, (long) 5000);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField5 and durationField9", Math.signum(durationField5.compareTo(durationField9)) == -Math.signum(durationField9.compareTo(durationField5)));
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test273");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology1.secondOfDay();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology1.secondOfDay();
        org.joda.time.DurationField durationField5 = ethiopicChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.clockhourOfHalfday();
        org.joda.time.DurationField durationField7 = ethiopicChronology1.weekyears();
        org.joda.time.DurationField durationField8 = ethiopicChronology1.months();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology1.minuteOfHour();
        int int10 = ethiopicChronology1.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField11 = ethiopicChronology1.centuries();
        org.joda.time.DurationField durationField12 = ethiopicChronology1.years();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology1.monthOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField7 and durationField12", (durationField7.compareTo(durationField12) == 0) == durationField7.equals(durationField12));
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test274");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DurationField durationField4 = ethiopicChronology1.centuries();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology1.weekyear();
        org.joda.time.DurationField durationField6 = ethiopicChronology1.halfdays();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology1.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology1.era();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 100);
        long long13 = dateTimeZone10.adjustOffset((-31449599999L), false);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 10);
        long long17 = dateTimeZone10.getMillisKeepLocal(dateTimeZone15, (long) 'a');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone10);
        long long20 = dateTimeZone10.nextTransition(1888211304007L);
        org.joda.time.Chronology chronology21 = ethiopicChronology1.withZone(dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology23 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone22);
        org.joda.time.DateTimeField dateTimeField24 = ethiopicChronology23.clockhourOfDay();
        org.joda.time.DurationField durationField25 = ethiopicChronology23.weekyears();
        org.joda.time.DurationField durationField26 = ethiopicChronology23.hours();
        org.joda.time.DateTimeField dateTimeField27 = ethiopicChronology23.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField28 = ethiopicChronology23.hourOfDay();
        org.joda.time.DateTimeField dateTimeField29 = ethiopicChronology23.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone30 = ethiopicChronology23.getZone();
        long long32 = dateTimeZone30.previousTransition((long) (-36518));
        org.joda.time.LocalDateTime localDateTime33 = org.joda.time.LocalDateTime.now(dateTimeZone30);
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime(chronology34);
        org.joda.time.LocalDateTime localDateTime37 = localDateTime35.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime39 = localDateTime35.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime41 = localDateTime35.withYearOfCentury(0);
        org.joda.time.LocalDateTime.Property property42 = localDateTime41.weekyear();
        org.joda.time.LocalDateTime localDateTime44 = property42.setCopy((int) (byte) 1);
        org.joda.time.ReadablePeriod readablePeriod45 = null;
        org.joda.time.LocalDateTime localDateTime46 = localDateTime44.plus(readablePeriod45);
        org.joda.time.LocalDateTime.Property property47 = localDateTime46.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime49 = localDateTime46.minusDays(681);
        boolean boolean50 = dateTimeZone30.isLocalDateTimeGap(localDateTime49);
        long long54 = dateTimeZone30.convertLocalToUTC((long) 17, false, (long) 8);
        long long56 = dateTimeZone10.getMillisKeepLocal(dateTimeZone30, 1193987550162L);
        long long58 = dateTimeZone30.nextTransition(1894345954277L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField25", (durationField3.compareTo(durationField25) == 0) == durationField3.equals(durationField25));
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test275");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray2 = localDateTime1.getFieldTypes();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfDay((int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.plusSeconds((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime6, dateTimeZone8);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(chronology10);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime11.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime11.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.DateTime dateTime19 = localDateTime17.toDateTime(readableInstant18);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime(chronology20);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime21.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime21.withYearOfCentury(0);
        org.joda.time.LocalDateTime.Property property28 = localDateTime27.weekyear();
        org.joda.time.LocalDateTime localDateTime30 = property28.setCopy((int) (byte) 1);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime(chronology31);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime32.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime32.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime38 = localDateTime32.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.DateTime dateTime40 = localDateTime38.toDateTime(readableInstant39);
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = null;
        boolean boolean42 = dateTime40.isSupported(dateTimeFieldType41);
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.LocalDateTime localDateTime44 = new org.joda.time.LocalDateTime(chronology43);
        org.joda.time.LocalDateTime localDateTime46 = localDateTime44.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime48 = localDateTime44.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime50 = localDateTime44.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant51 = null;
        org.joda.time.DateTime dateTime52 = localDateTime50.toDateTime(readableInstant51);
        org.joda.time.DateTimeFieldType dateTimeFieldType53 = null;
        boolean boolean54 = dateTime52.isSupported(dateTimeFieldType53);
        int int55 = dateTime40.compareTo((org.joda.time.ReadableInstant) dateTime52);
        int int56 = property28.compareTo((org.joda.time.ReadableInstant) dateTime52);
        boolean boolean57 = dateTime19.isEqual((org.joda.time.ReadableInstant) dateTime52);
        int int58 = dateTimeZone8.getOffset((org.joda.time.ReadableInstant) dateTime52);
        long long59 = dateTime52.getMillis();
        org.joda.time.Instant instant60 = dateTime52.toInstant();
        org.joda.time.Instant instant61 = dateTime52.toInstant();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime19 and instant60", (dateTime19.compareTo(instant60) == 0) == dateTime19.equals(instant60));
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test276");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology1.secondOfDay();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology1.secondOfDay();
        org.joda.time.DurationField durationField5 = ethiopicChronology1.weeks();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime7.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime7.withYearOfCentury(0);
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.weekyear();
        org.joda.time.LocalDateTime.Property property15 = localDateTime13.secondOfMinute();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(chronology16);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime17.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime17.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.DateTime dateTime25 = localDateTime23.toDateTime(readableInstant24);
        org.joda.time.LocalDateTime.Property property26 = localDateTime23.millisOfDay();
        org.joda.time.Interval interval27 = property26.toInterval();
        boolean boolean28 = localDateTime13.equals((java.lang.Object) property26);
        int[] intArray30 = ethiopicChronology1.get((org.joda.time.ReadablePartial) localDateTime13, (long) 1439);
        org.joda.time.DateTimeField dateTimeField31 = ethiopicChronology1.millisOfDay();
        org.joda.time.DurationField durationField32 = ethiopicChronology1.hours();
        org.joda.time.DurationField durationField33 = ethiopicChronology1.seconds();
        org.joda.time.DurationField durationField34 = ethiopicChronology1.days();
        org.joda.time.DurationField durationField35 = ethiopicChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField35, durationField5, and durationField32", !(durationField35.compareTo(durationField5) == 0) || (Math.signum(durationField35.compareTo(durationField32)) == Math.signum(durationField5.compareTo(durationField32))));
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test277");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DurationField durationField4 = ethiopicChronology1.hours();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology1.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.hourOfDay();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        long long10 = ethiopicChronology1.add(readablePeriod7, (long) 100, 581);
        org.joda.time.DurationField durationField11 = ethiopicChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology1.hourOfDay();
        org.joda.time.DurationField durationField13 = ethiopicChronology1.years();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        long long17 = ethiopicChronology1.add(readablePeriod14, 1888211239707L, (int) 'a');
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField13", (durationField3.compareTo(durationField13) == 0) == durationField3.equals(durationField13));
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test278");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology1.centuryOfEra();
        org.joda.time.DurationField durationField4 = ethiopicChronology1.millis();
        int int5 = ethiopicChronology1.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField6 = ethiopicChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology1.yearOfEra();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology1.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology1.millisOfDay();
        org.joda.time.DurationField durationField10 = ethiopicChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField10, durationField4, and durationField6", !(durationField10.compareTo(durationField4) == 0) || (Math.signum(durationField10.compareTo(durationField6)) == Math.signum(durationField4.compareTo(durationField6))));
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test279");
        java.lang.String[] strArray9 = new java.lang.String[] { "de_DE", "", "", "7", "3", "UTC", "24", "2022-02-15T07:08:12.450", "2022-02-15T07:08:12.450" };
        java.util.LinkedHashSet<java.lang.String> strSet10 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet10, strArray9);
        java.util.Set<java.lang.String> strSet12 = org.joda.time.DateTimeZone.getAvailableIDs();
        boolean boolean13 = strSet10.addAll((java.util.Collection<java.lang.String>) strSet12);
        int int14 = strSet10.size();
        java.util.stream.Stream<java.lang.String> strStream15 = strSet10.parallelStream();
        java.lang.String[] strArray25 = new java.lang.String[] { "de_DE", "", "", "7", "3", "UTC", "24", "2022-02-15T07:08:12.450", "2022-02-15T07:08:12.450" };
        java.util.LinkedHashSet<java.lang.String> strSet26 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet26, strArray25);
        java.util.Set<java.lang.String> strSet28 = org.joda.time.DateTimeZone.getAvailableIDs();
        boolean boolean29 = strSet26.addAll((java.util.Collection<java.lang.String>) strSet28);
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology31 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone30);
        org.joda.time.DateTimeField dateTimeField32 = ethiopicChronology31.hourOfDay();
        org.joda.time.DateTimeField dateTimeField33 = ethiopicChronology31.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.Chronology chronology35 = ethiopicChronology31.withZone(dateTimeZone34);
        org.joda.time.DateTimeField dateTimeField36 = ethiopicChronology31.millisOfSecond();
        boolean boolean37 = strSet26.contains((java.lang.Object) ethiopicChronology31);
        java.util.stream.Stream<java.lang.String> strStream38 = strSet26.parallelStream();
        boolean boolean39 = strSet10.addAll((java.util.Collection<java.lang.String>) strSet26);
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology41 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone40);
        org.joda.time.DateTimeField dateTimeField42 = ethiopicChronology41.clockhourOfDay();
        org.joda.time.DurationField durationField43 = ethiopicChronology41.weekyears();
        org.joda.time.DateTimeField dateTimeField44 = ethiopicChronology41.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 10);
        java.lang.String str48 = dateTimeZone46.getShortName((long) 1);
        org.joda.time.Chronology chronology49 = ethiopicChronology41.withZone(dateTimeZone46);
        boolean boolean50 = strSet10.contains((java.lang.Object) ethiopicChronology41);
        org.joda.time.ReadablePeriod readablePeriod51 = null;
        long long54 = ethiopicChronology41.add(readablePeriod51, (long) 510, 0);
        org.joda.time.DurationField durationField55 = ethiopicChronology41.eras();
        org.joda.time.DateTimeZone dateTimeZone56 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology57 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone56);
        org.joda.time.DateTimeField dateTimeField58 = ethiopicChronology57.hourOfDay();
        org.joda.time.DateTimeField dateTimeField59 = ethiopicChronology57.centuryOfEra();
        org.joda.time.DurationField durationField60 = ethiopicChronology57.millis();
        org.joda.time.DateTimeField dateTimeField61 = ethiopicChronology57.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField62 = ethiopicChronology57.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField63 = ethiopicChronology57.centuryOfEra();
        java.util.TimeZone timeZone64 = java.util.TimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone65 = org.joda.time.DateTimeZone.forTimeZone(timeZone64);
        long long67 = dateTimeZone65.previousTransition((long) 22);
        org.joda.time.Chronology chronology68 = ethiopicChronology57.withZone(dateTimeZone65);
        long long72 = dateTimeZone65.convertLocalToUTC((long) 20, false, 6311520000100L);
        java.util.Locale locale74 = java.util.Locale.US;
        java.util.Locale locale76 = new java.util.Locale("2022-04-20T15:08:29.578");
        java.util.Set<java.lang.String> strSet77 = locale76.getUnicodeLocaleAttributes();
        java.lang.String str78 = locale74.getDisplayScript(locale76);
        java.lang.String str79 = dateTimeZone65.getName((-8208000535L), locale76);
        org.joda.time.Chronology chronology80 = ethiopicChronology41.withZone(dateTimeZone65);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField43 and durationField55", Math.signum(durationField43.compareTo(durationField55)) == -Math.signum(durationField55.compareTo(durationField43)));
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test280");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.withYearOfCentury(0);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.weekyear();
        org.joda.time.LocalDateTime localDateTime9 = property8.withMaximumValue();
        int int10 = localDateTime9.getWeekyear();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(chronology11);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime12.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime12.withYearOfCentury(0);
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.weekyear();
        org.joda.time.LocalDateTime localDateTime21 = property19.setCopy((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime9.withFields((org.joda.time.ReadablePartial) localDateTime21);
        org.joda.time.LocalDateTime.Property property23 = localDateTime21.hourOfDay();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime(chronology24);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime25.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime25.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime25.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.DateTime dateTime33 = localDateTime31.toDateTime(readableInstant32);
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime(chronology34);
        org.joda.time.LocalDateTime localDateTime37 = localDateTime35.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime39 = localDateTime35.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime41 = localDateTime35.withYearOfCentury(0);
        org.joda.time.LocalDateTime.Property property42 = localDateTime41.weekyear();
        org.joda.time.LocalDateTime localDateTime44 = property42.setCopy((int) (byte) 1);
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.LocalDateTime localDateTime46 = new org.joda.time.LocalDateTime(chronology45);
        org.joda.time.LocalDateTime localDateTime48 = localDateTime46.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime50 = localDateTime46.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime52 = localDateTime46.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant53 = null;
        org.joda.time.DateTime dateTime54 = localDateTime52.toDateTime(readableInstant53);
        org.joda.time.DateTimeFieldType dateTimeFieldType55 = null;
        boolean boolean56 = dateTime54.isSupported(dateTimeFieldType55);
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.LocalDateTime localDateTime58 = new org.joda.time.LocalDateTime(chronology57);
        org.joda.time.LocalDateTime localDateTime60 = localDateTime58.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime62 = localDateTime58.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime64 = localDateTime58.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant65 = null;
        org.joda.time.DateTime dateTime66 = localDateTime64.toDateTime(readableInstant65);
        org.joda.time.DateTimeFieldType dateTimeFieldType67 = null;
        boolean boolean68 = dateTime66.isSupported(dateTimeFieldType67);
        int int69 = dateTime54.compareTo((org.joda.time.ReadableInstant) dateTime66);
        int int70 = property42.compareTo((org.joda.time.ReadableInstant) dateTime66);
        boolean boolean71 = dateTime33.isEqual((org.joda.time.ReadableInstant) dateTime66);
        org.joda.time.Chronology chronology72 = null;
        org.joda.time.LocalDateTime localDateTime73 = new org.joda.time.LocalDateTime(chronology72);
        org.joda.time.LocalDateTime localDateTime75 = localDateTime73.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime77 = localDateTime73.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime79 = localDateTime73.plusWeeks((int) (byte) 10);
        org.joda.time.Chronology chronology80 = null;
        org.joda.time.LocalDateTime localDateTime81 = new org.joda.time.LocalDateTime(chronology80);
        org.joda.time.LocalDateTime localDateTime83 = localDateTime81.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime85 = localDateTime81.withMillisOfSecond((int) (byte) 1);
        int int86 = localDateTime73.compareTo((org.joda.time.ReadablePartial) localDateTime81);
        org.joda.time.LocalDateTime.Property property87 = localDateTime81.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType88 = property87.getFieldType();
        boolean boolean89 = dateTime66.isSupported(dateTimeFieldType88);
        java.lang.String str90 = dateTime66.toString();
        org.joda.time.Instant instant91 = dateTime66.toInstant();
        int int92 = property23.getDifference((org.joda.time.ReadableInstant) instant91);
        org.joda.time.DateTimeField dateTimeField93 = property23.getField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime33 and instant91", (dateTime33.compareTo(instant91) == 0) == dateTime33.equals(instant91));
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test281");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DurationField durationField4 = ethiopicChronology1.centuries();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology1.weekyear();
        org.joda.time.DurationField durationField6 = ethiopicChronology1.halfdays();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology1.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology1.era();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 100);
        long long13 = dateTimeZone10.adjustOffset((-31449599999L), false);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 10);
        long long17 = dateTimeZone10.getMillisKeepLocal(dateTimeZone15, (long) 'a');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone10);
        long long20 = dateTimeZone10.nextTransition(1888211304007L);
        org.joda.time.Chronology chronology21 = ethiopicChronology1.withZone(dateTimeZone10);
        int int22 = ethiopicChronology1.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField23 = ethiopicChronology1.minuteOfDay();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime(chronology24);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime25.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime.Property property28 = localDateTime27.weekOfWeekyear();
        org.joda.time.LocalDateTime.Property property29 = localDateTime27.centuryOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = property29.getFieldType();
        org.joda.time.LocalDateTime localDateTime31 = property29.roundHalfFloorCopy();
        org.joda.time.LocalDateTime.Property property32 = localDateTime31.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology35 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone34);
        org.joda.time.DateTimeField dateTimeField36 = ethiopicChronology35.clockhourOfDay();
        org.joda.time.DurationField durationField37 = ethiopicChronology35.weekyears();
        org.joda.time.DurationField durationField38 = ethiopicChronology35.hours();
        org.joda.time.DateTimeField dateTimeField39 = ethiopicChronology35.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField40 = ethiopicChronology35.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology42 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone41);
        org.joda.time.DateTimeField dateTimeField43 = ethiopicChronology42.dayOfMonth();
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.LocalDateTime localDateTime45 = new org.joda.time.LocalDateTime(chronology44);
        org.joda.time.LocalDateTime localDateTime47 = localDateTime45.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime49 = localDateTime45.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime51 = localDateTime45.plusWeeks((int) (byte) 10);
        java.util.Locale locale52 = java.util.Locale.PRC;
        java.lang.String str53 = dateTimeField43.getAsText((org.joda.time.ReadablePartial) localDateTime51, locale52);
        java.util.Locale locale54 = java.util.Locale.TAIWAN;
        java.lang.String str55 = locale52.getDisplayName(locale54);
        int int56 = dateTimeField40.getMaximumShortTextLength(locale54);
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.LocalDateTime localDateTime58 = new org.joda.time.LocalDateTime(chronology57);
        org.joda.time.LocalDateTime localDateTime60 = localDateTime58.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime62 = localDateTime58.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime64 = localDateTime58.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant65 = null;
        org.joda.time.DateTime dateTime66 = localDateTime64.toDateTime(readableInstant65);
        org.joda.time.LocalDateTime localDateTime68 = localDateTime64.withSecondOfMinute((int) (short) 0);
        org.joda.time.ReadablePeriod readablePeriod69 = null;
        org.joda.time.LocalDateTime localDateTime70 = localDateTime68.minus(readablePeriod69);
        org.joda.time.ReadablePeriod readablePeriod71 = null;
        org.joda.time.LocalDateTime localDateTime73 = localDateTime70.withPeriodAdded(readablePeriod71, (int) (short) 10);
        java.util.Locale locale75 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str76 = locale75.getDisplayCountry();
        java.lang.String str77 = locale75.getLanguage();
        java.lang.String str78 = dateTimeField40.getAsText((org.joda.time.ReadablePartial) localDateTime73, 91, locale75);
        java.lang.String str79 = dateTimeField23.getAsShortText((org.joda.time.ReadablePartial) localDateTime31, 19045, locale75);
        org.joda.time.LocalDateTime.Property property80 = localDateTime31.year();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField37", (durationField3.compareTo(durationField37) == 0) == durationField3.equals(durationField37));
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test282");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology2 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology2.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology2.secondOfDay();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology2.secondOfDay();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) 10, (org.joda.time.Chronology) ethiopicChronology2);
        org.joda.time.DurationField durationField7 = ethiopicChronology2.eras();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology10 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology10.hourOfDay();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology10.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.Chronology chronology14 = ethiopicChronology10.withZone(dateTimeZone13);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology16 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField17 = ethiopicChronology16.clockhourOfDay();
        org.joda.time.DurationField durationField18 = ethiopicChronology16.weekyears();
        org.joda.time.DateTimeField dateTimeField19 = ethiopicChronology16.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 10);
        java.lang.String str23 = dateTimeZone21.getShortName((long) 1);
        org.joda.time.Chronology chronology24 = ethiopicChronology16.withZone(dateTimeZone21);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime(chronology25);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray27 = localDateTime26.getFieldTypes();
        org.joda.time.LocalDateTime localDateTime29 = localDateTime26.withMillisOfDay((int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology31 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone30);
        org.joda.time.DateTimeField dateTimeField32 = ethiopicChronology31.dayOfMonth();
        java.util.Locale locale36 = new java.util.Locale("hi!", "hi!");
        java.lang.String str37 = dateTimeField32.getAsText((int) (byte) 10, locale36);
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.LocalDateTime localDateTime39 = new org.joda.time.LocalDateTime(chronology38);
        org.joda.time.LocalDateTime localDateTime41 = localDateTime39.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime43 = localDateTime39.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime45 = localDateTime43.withMillisOfSecond((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime47 = localDateTime43.withMinuteOfHour(10);
        org.joda.time.LocalDateTime localDateTime49 = localDateTime43.minusDays(100);
        int[] intArray56 = new int[] { (short) 10, 1, 614, 822, (byte) 100 };
        int[] intArray58 = dateTimeField32.addWrapField((org.joda.time.ReadablePartial) localDateTime49, 0, intArray56, (int) (short) 1);
        ethiopicChronology16.validate((org.joda.time.ReadablePartial) localDateTime29, intArray58);
        int[] intArray61 = ethiopicChronology10.get((org.joda.time.ReadablePartial) localDateTime29, (long) (-292269338));
        org.joda.time.DurationField durationField62 = ethiopicChronology10.seconds();
        int int63 = ethiopicChronology10.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField64 = ethiopicChronology10.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone65 = ethiopicChronology10.getZone();
        org.joda.time.LocalDateTime localDateTime66 = new org.joda.time.LocalDateTime(19528758574505L, dateTimeZone65);
        org.joda.time.ReadablePeriod readablePeriod67 = null;
        org.joda.time.LocalDateTime localDateTime68 = localDateTime66.plus(readablePeriod67);
        int[] intArray70 = ethiopicChronology2.get((org.joda.time.ReadablePartial) localDateTime68, (long) 754);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField7 and durationField18", Math.signum(durationField7.compareTo(durationField18)) == -Math.signum(durationField18.compareTo(durationField7)));
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test283");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.dayOfMonth();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime(chronology3);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime4.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime4.plusWeeks((int) (byte) 10);
        java.util.Locale locale11 = java.util.Locale.PRC;
        java.lang.String str12 = dateTimeField2.getAsText((org.joda.time.ReadablePartial) localDateTime10, locale11);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(chronology13);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime14.withMillisOfSecond((int) (byte) 1);
        java.util.Locale locale20 = java.util.Locale.JAPAN;
        java.lang.String str21 = dateTimeField2.getAsText((org.joda.time.ReadablePartial) localDateTime14, 2022, locale20);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology24 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField25 = ethiopicChronology24.hourOfDay();
        org.joda.time.DateTimeField dateTimeField26 = ethiopicChronology24.secondOfDay();
        org.joda.time.DateTimeField dateTimeField27 = ethiopicChronology24.secondOfDay();
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime((long) 10, (org.joda.time.Chronology) ethiopicChronology24);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime28.withDayOfYear((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime30.plusDays(0);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime14.withFields((org.joda.time.ReadablePartial) localDateTime32);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray34 = localDateTime14.getFieldTypes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on localDateTime30 and localDateTime33", (localDateTime30.compareTo(localDateTime33) == 0) == localDateTime30.equals(localDateTime33));
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test284");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = ethiopicChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField7 = ethiopicChronology1.eras();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology1.minuteOfHour();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField7", Math.signum(durationField3.compareTo(durationField7)) == -Math.signum(durationField7.compareTo(durationField3)));
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test285");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology1.secondOfDay();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology1.secondOfDay();
        org.joda.time.DurationField durationField5 = ethiopicChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.clockhourOfHalfday();
        org.joda.time.DurationField durationField7 = ethiopicChronology1.weeks();
        org.joda.time.DurationField durationField8 = ethiopicChronology1.years();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology1.year();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology12 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone11);
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology12.clockhourOfDay();
        org.joda.time.DurationField durationField14 = ethiopicChronology12.weekyears();
        org.joda.time.DateTimeField dateTimeField15 = ethiopicChronology12.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 10);
        java.lang.String str19 = dateTimeZone17.getShortName((long) 1);
        org.joda.time.Chronology chronology20 = ethiopicChronology12.withZone(dateTimeZone17);
        org.joda.time.DurationField durationField21 = ethiopicChronology12.halfdays();
        org.joda.time.DateTimeField dateTimeField22 = ethiopicChronology12.yearOfCentury();
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime(chronology23);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray25 = localDateTime24.getFieldTypes();
        org.joda.time.LocalDateTime localDateTime27 = localDateTime24.withMillisOfDay((int) (byte) 0);
        int int28 = localDateTime27.getYear();
        int[] intArray30 = ethiopicChronology12.get((org.joda.time.ReadablePartial) localDateTime27, (long) 548);
        org.joda.time.LocalDateTime.Property property31 = localDateTime27.weekyear();
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology33 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone32);
        org.joda.time.DateTimeField dateTimeField34 = ethiopicChronology33.clockhourOfDay();
        org.joda.time.DurationField durationField35 = ethiopicChronology33.weekyears();
        org.joda.time.DateTimeField dateTimeField36 = ethiopicChronology33.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField37 = ethiopicChronology33.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField38 = ethiopicChronology33.era();
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology42 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone41);
        org.joda.time.DateTimeField dateTimeField43 = ethiopicChronology42.hourOfDay();
        org.joda.time.DateTimeField dateTimeField44 = ethiopicChronology42.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.Chronology chronology46 = ethiopicChronology42.withZone(dateTimeZone45);
        org.joda.time.DateTimeField dateTimeField47 = ethiopicChronology42.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone48 = ethiopicChronology42.getZone();
        org.joda.time.LocalDateTime localDateTime49 = new org.joda.time.LocalDateTime(1900800010L, dateTimeZone48);
        java.util.Locale locale51 = java.util.Locale.GERMANY;
        java.util.Locale locale52 = java.util.Locale.GERMANY;
        java.lang.String str53 = locale52.getScript();
        org.joda.time.DateTimeZone dateTimeZone54 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology55 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone54);
        org.joda.time.DateTimeField dateTimeField56 = ethiopicChronology55.clockhourOfDay();
        java.util.Locale locale58 = java.util.Locale.ITALIAN;
        java.lang.String str59 = dateTimeField56.getAsText((long) 'a', locale58);
        java.lang.String str60 = locale52.getDisplayName(locale58);
        java.lang.String str61 = locale58.getISO3Language();
        boolean boolean62 = locale58.hasExtensions();
        java.lang.String str63 = locale51.getDisplayScript(locale58);
        java.lang.String str64 = dateTimeZone48.getName((-360000083L), locale51);
        java.lang.String str65 = dateTimeField38.getAsShortText(980, locale51);
        java.lang.String str66 = locale51.getDisplayScript();
        int int67 = property31.getMaximumTextLength(locale51);
        java.lang.String str68 = dateTimeField9.getAsShortText(1645514146096L, locale51);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField8 and durationField14", (durationField8.compareTo(durationField14) == 0) == durationField8.equals(durationField14));
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test286");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology1.secondOfDay();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology1.secondOfDay();
        org.joda.time.DurationField durationField5 = ethiopicChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.clockhourOfHalfday();
        org.joda.time.DurationField durationField7 = ethiopicChronology1.weeks();
        org.joda.time.DurationField durationField8 = ethiopicChronology1.eras();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology1.minuteOfHour();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField5 and durationField8", Math.signum(durationField5.compareTo(durationField8)) == -Math.signum(durationField8.compareTo(durationField5)));
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test287");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DurationField durationField4 = ethiopicChronology1.hours();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology1.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.hourOfDay();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        long long10 = ethiopicChronology1.add(readablePeriod7, (long) 100, 581);
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology1.weekyear();
        org.joda.time.DurationField durationField12 = ethiopicChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology1.centuryOfEra();
        org.joda.time.DurationField durationField14 = ethiopicChronology1.years();
        org.joda.time.DateTimeField dateTimeField15 = ethiopicChronology1.era();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField14", (durationField3.compareTo(durationField14) == 0) == durationField3.equals(durationField14));
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test288");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology2 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology2.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology2.secondOfDay();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology2.secondOfDay();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) 10, (org.joda.time.Chronology) ethiopicChronology2);
        org.joda.time.DurationField durationField7 = ethiopicChronology2.eras();
        org.joda.time.DurationField durationField8 = ethiopicChronology2.eras();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology2.monthOfYear();
        org.joda.time.Chronology chronology10 = ethiopicChronology2.withUTC();
        org.joda.time.DurationField durationField11 = ethiopicChronology2.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField7, durationField11, and durationField7", !(durationField7.compareTo(durationField11) == 0) || (Math.signum(durationField7.compareTo(durationField7)) == Math.signum(durationField11.compareTo(durationField7))));
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test289");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology1.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.Chronology chronology5 = ethiopicChronology1.withZone(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.millisOfSecond();
        org.joda.time.DurationField durationField7 = ethiopicChronology1.eras();
        long long11 = ethiopicChronology1.add((-31449600000L), (long) 346, 634);
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology1.hourOfHalfday();
        org.joda.time.DurationField durationField14 = ethiopicChronology1.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField7, durationField14, and durationField7", !(durationField7.compareTo(durationField14) == 0) || (Math.signum(durationField7.compareTo(durationField7)) == Math.signum(durationField14.compareTo(durationField7))));
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test290");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology2 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology2.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology2.secondOfDay();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology2.secondOfDay();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) 10, (org.joda.time.Chronology) ethiopicChronology2);
        org.joda.time.DurationField durationField7 = ethiopicChronology2.days();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology2.secondOfDay();
        boolean boolean10 = ethiopicChronology2.equals((java.lang.Object) "24");
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology2.weekyearOfCentury();
        org.joda.time.DurationField durationField12 = ethiopicChronology2.years();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology2.yearOfEra();
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology2.clockhourOfDay();
        org.joda.time.DurationField durationField15 = ethiopicChronology2.halfdays();
        org.joda.time.DurationField durationField16 = ethiopicChronology2.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField16, durationField7, and durationField12", !(durationField16.compareTo(durationField7) == 0) || (Math.signum(durationField16.compareTo(durationField12)) == Math.signum(durationField7.compareTo(durationField12))));
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test291");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = ethiopicChronology1.getZone();
        org.joda.time.DurationField durationField6 = ethiopicChronology1.centuries();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology1.yearOfCentury();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(chronology8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime9.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime9.plusWeeks((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime9.withMillisOfDay((int) '#');
        int int18 = localDateTime17.getMillisOfSecond();
        int[] intArray20 = ethiopicChronology1.get((org.joda.time.ReadablePartial) localDateTime17, (long) 23);
        org.joda.time.DateTimeField dateTimeField21 = ethiopicChronology1.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology24 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField25 = ethiopicChronology24.hourOfDay();
        org.joda.time.DateTimeField dateTimeField26 = ethiopicChronology24.secondOfDay();
        org.joda.time.DateTimeField dateTimeField27 = ethiopicChronology24.secondOfDay();
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime((long) 10, (org.joda.time.Chronology) ethiopicChronology24);
        org.joda.time.DurationField durationField29 = ethiopicChronology24.eras();
        org.joda.time.DurationField durationField30 = ethiopicChronology24.eras();
        org.joda.time.DateTimeField dateTimeField31 = ethiopicChronology24.monthOfYear();
        org.joda.time.DateTimeField dateTimeField32 = ethiopicChronology24.clockhourOfDay();
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime(chronology33);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime34.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime38 = localDateTime34.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime40 = localDateTime34.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant41 = null;
        org.joda.time.DateTime dateTime42 = localDateTime40.toDateTime(readableInstant41);
        org.joda.time.LocalDateTime.Property property43 = localDateTime40.millisOfDay();
        org.joda.time.LocalDateTime localDateTime45 = localDateTime40.plusHours(13);
        java.lang.String str46 = localDateTime40.toString();
        org.joda.time.LocalDateTime localDateTime47 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime40);
        org.joda.time.LocalDateTime localDateTime49 = localDateTime40.minusMillis(496);
        java.util.Locale locale51 = java.util.Locale.GERMANY;
        boolean boolean52 = locale51.hasExtensions();
        java.lang.String str53 = locale51.getLanguage();
        java.util.Locale locale54 = locale51.stripExtensions();
        java.lang.String str55 = dateTimeField32.getAsText((org.joda.time.ReadablePartial) localDateTime49, 489, locale51);
        boolean boolean56 = ethiopicChronology1.equals((java.lang.Object) dateTimeField32);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField29", Math.signum(durationField3.compareTo(durationField29)) == -Math.signum(durationField29.compareTo(durationField3)));
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test292");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology1.centuryOfEra();
        org.joda.time.DurationField durationField4 = ethiopicChronology1.millis();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology1.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology1.millisOfSecond();
        org.joda.time.Chronology chronology9 = ethiopicChronology1.withUTC();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology1.secondOfDay();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology1.weekyear();
        org.joda.time.DurationField durationField12 = ethiopicChronology1.halfdays();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology1.millisOfDay();
        org.joda.time.DurationField durationField14 = ethiopicChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField14, durationField4, and durationField12", !(durationField14.compareTo(durationField4) == 0) || (Math.signum(durationField14.compareTo(durationField12)) == Math.signum(durationField4.compareTo(durationField12))));
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test293");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DurationField durationField4 = ethiopicChronology1.centuries();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology1.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 100);
        long long11 = dateTimeZone8.adjustOffset((-31449599999L), false);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 10);
        long long15 = dateTimeZone8.getMillisKeepLocal(dateTimeZone13, (long) 'a');
        org.joda.time.LocalDateTime localDateTime16 = org.joda.time.LocalDateTime.now(dateTimeZone13);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.plusDays((int) 'u');
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology20 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone19);
        org.joda.time.DateTimeField dateTimeField21 = ethiopicChronology20.hourOfDay();
        org.joda.time.DateTimeField dateTimeField22 = ethiopicChronology20.centuryOfEra();
        org.joda.time.DurationField durationField23 = ethiopicChronology20.millis();
        org.joda.time.DateTimeField dateTimeField24 = ethiopicChronology20.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField25 = ethiopicChronology20.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField26 = ethiopicChronology20.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField27 = ethiopicChronology20.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField28 = ethiopicChronology20.era();
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime(chronology29);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime30.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime30.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime30.withYearOfCentury(0);
        org.joda.time.LocalDateTime.Property property37 = localDateTime36.weekyear();
        org.joda.time.LocalDateTime localDateTime38 = property37.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime40 = localDateTime38.minusDays(304);
        int[] intArray42 = ethiopicChronology20.get((org.joda.time.ReadablePartial) localDateTime38, 4320000000L);
        ethiopicChronology1.validate((org.joda.time.ReadablePartial) localDateTime16, intArray42);
        org.joda.time.DateTimeField dateTimeField44 = ethiopicChronology1.year();
        org.joda.time.DateTimeField dateTimeField45 = ethiopicChronology1.halfdayOfDay();
        org.joda.time.DurationField durationField46 = ethiopicChronology1.years();
        org.joda.time.DateTimeField dateTimeField47 = ethiopicChronology1.halfdayOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField46", (durationField3.compareTo(durationField46) == 0) == durationField3.equals(durationField46));
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test294");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology1.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.Chronology chronology5 = ethiopicChronology1.withZone(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology1.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology1.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology1.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology1.year();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology1.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology1.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology1.yearOfEra();
        org.joda.time.DurationField durationField14 = ethiopicChronology1.weeks();
        int int16 = durationField14.getValue(77249400000L);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology18 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone17);
        org.joda.time.DateTimeField dateTimeField19 = ethiopicChronology18.clockhourOfDay();
        org.joda.time.DurationField durationField20 = ethiopicChronology18.weekyears();
        org.joda.time.DateTimeField dateTimeField21 = ethiopicChronology18.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone22 = ethiopicChronology18.getZone();
        org.joda.time.Chronology chronology23 = ethiopicChronology18.withUTC();
        org.joda.time.DurationField durationField24 = ethiopicChronology18.days();
        org.joda.time.DurationField durationField25 = ethiopicChronology18.hours();
        org.joda.time.DateTimeField dateTimeField26 = ethiopicChronology18.weekyear();
        org.joda.time.DurationField durationField27 = ethiopicChronology18.years();
        java.lang.String str28 = durationField27.toString();
        int int29 = durationField14.compareTo(durationField27);
        int int32 = durationField14.getDifference(1882509339001L, (-173556L));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField20 and durationField27", (durationField20.compareTo(durationField27) == 0) == durationField20.equals(durationField27));
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test295");
        java.lang.String[] strArray9 = new java.lang.String[] { "de_DE", "", "", "7", "3", "UTC", "24", "2022-02-15T07:08:12.450", "2022-02-15T07:08:12.450" };
        java.util.LinkedHashSet<java.lang.String> strSet10 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet10, strArray9);
        java.util.Set<java.lang.String> strSet12 = org.joda.time.DateTimeZone.getAvailableIDs();
        boolean boolean13 = strSet10.addAll((java.util.Collection<java.lang.String>) strSet12);
        int int14 = strSet10.size();
        java.util.stream.Stream<java.lang.String> strStream15 = strSet10.parallelStream();
        java.lang.String[] strArray25 = new java.lang.String[] { "de_DE", "", "", "7", "3", "UTC", "24", "2022-02-15T07:08:12.450", "2022-02-15T07:08:12.450" };
        java.util.LinkedHashSet<java.lang.String> strSet26 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet26, strArray25);
        java.util.Set<java.lang.String> strSet28 = org.joda.time.DateTimeZone.getAvailableIDs();
        boolean boolean29 = strSet26.addAll((java.util.Collection<java.lang.String>) strSet28);
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology31 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone30);
        org.joda.time.DateTimeField dateTimeField32 = ethiopicChronology31.hourOfDay();
        org.joda.time.DateTimeField dateTimeField33 = ethiopicChronology31.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.Chronology chronology35 = ethiopicChronology31.withZone(dateTimeZone34);
        org.joda.time.DateTimeField dateTimeField36 = ethiopicChronology31.millisOfSecond();
        boolean boolean37 = strSet26.contains((java.lang.Object) ethiopicChronology31);
        java.util.stream.Stream<java.lang.String> strStream38 = strSet26.parallelStream();
        boolean boolean39 = strSet10.addAll((java.util.Collection<java.lang.String>) strSet26);
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology41 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone40);
        org.joda.time.DateTimeField dateTimeField42 = ethiopicChronology41.clockhourOfDay();
        org.joda.time.DurationField durationField43 = ethiopicChronology41.weekyears();
        org.joda.time.DateTimeField dateTimeField44 = ethiopicChronology41.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 10);
        java.lang.String str48 = dateTimeZone46.getShortName((long) 1);
        org.joda.time.Chronology chronology49 = ethiopicChronology41.withZone(dateTimeZone46);
        boolean boolean50 = strSet10.contains((java.lang.Object) ethiopicChronology41);
        org.joda.time.DateTimeField dateTimeField51 = ethiopicChronology41.weekyearOfCentury();
        org.joda.time.DurationField durationField52 = ethiopicChronology41.centuries();
        org.joda.time.DateTimeField dateTimeField53 = ethiopicChronology41.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField54 = ethiopicChronology41.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField55 = ethiopicChronology41.minuteOfDay();
        org.joda.time.DurationField durationField56 = ethiopicChronology41.years();
        org.joda.time.DurationField durationField57 = ethiopicChronology41.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField43 and durationField56", (durationField43.compareTo(durationField56) == 0) == durationField43.equals(durationField56));
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test296");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DurationField durationField4 = ethiopicChronology1.hours();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology1.dayOfMonth();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = ethiopicChronology1.add(readablePeriod6, (long) (-1), 422);
        org.joda.time.DurationField durationField10 = ethiopicChronology1.years();
        org.joda.time.DurationField durationField11 = ethiopicChronology1.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField10", (durationField3.compareTo(durationField10) == 0) == durationField3.equals(durationField10));
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test297");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology1.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.Chronology chronology5 = ethiopicChronology1.withZone(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.millisOfSecond();
        org.joda.time.DurationField durationField7 = ethiopicChronology1.eras();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(chronology8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime9.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withMillisOfSecond((int) (short) 0);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(chronology16);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray18 = localDateTime17.getFieldTypes();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime17.withMillisOfDay((int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime20.withDayOfYear(53);
        boolean boolean23 = localDateTime15.isAfter((org.joda.time.ReadablePartial) localDateTime22);
        long long25 = ethiopicChronology1.set((org.joda.time.ReadablePartial) localDateTime15, (long) 3);
        org.joda.time.DateTimeField dateTimeField26 = ethiopicChronology1.yearOfEra();
        org.joda.time.DurationField durationField27 = ethiopicChronology1.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField7, durationField27, and durationField7", !(durationField7.compareTo(durationField27) == 0) || (Math.signum(durationField7.compareTo(durationField7)) == Math.signum(durationField27.compareTo(durationField7))));
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test298");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology1.centuryOfEra();
        org.joda.time.DurationField durationField4 = ethiopicChronology1.millis();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology1.weekyearOfCentury();
        org.joda.time.DurationField durationField6 = ethiopicChronology1.eras();
        org.joda.time.DurationField durationField7 = ethiopicChronology1.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField4 and durationField6", Math.signum(durationField4.compareTo(durationField6)) == -Math.signum(durationField6.compareTo(durationField4)));
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test299");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = ethiopicChronology1.getZone();
        org.joda.time.Chronology chronology6 = ethiopicChronology1.withUTC();
        org.joda.time.DurationField durationField7 = ethiopicChronology1.minutes();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology1.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology1.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology1.clockhourOfHalfday();
        org.joda.time.DurationField durationField11 = ethiopicChronology1.days();
        org.joda.time.DurationField durationField12 = ethiopicChronology1.months();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology1.yearOfEra();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime(chronology14);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime15.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime15.plusWeeks((int) (byte) 10);
        int int22 = localDateTime21.getMillisOfSecond();
        int int23 = localDateTime21.getMillisOfSecond();
        org.joda.time.ReadableDuration readableDuration24 = null;
        org.joda.time.LocalDateTime localDateTime25 = localDateTime21.minus(readableDuration24);
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = null;
        boolean boolean27 = localDateTime25.isSupported(dateTimeFieldType26);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime25.plusMinutes(2000);
        org.joda.time.LocalDateTime.Property property30 = localDateTime25.yearOfEra();
        boolean boolean31 = ethiopicChronology1.equals((java.lang.Object) property30);
        org.joda.time.DateTimeField dateTimeField32 = ethiopicChronology1.clockhourOfHalfday();
        org.joda.time.DurationField durationField33 = ethiopicChronology1.years();
        org.joda.time.DurationField durationField34 = ethiopicChronology1.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField33", (durationField3.compareTo(durationField33) == 0) == durationField3.equals(durationField33));
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test300");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology1.secondOfDay();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology1.secondOfDay();
        org.joda.time.DurationField durationField5 = ethiopicChronology1.weeks();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime7.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime7.withYearOfCentury(0);
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.weekyear();
        org.joda.time.LocalDateTime.Property property15 = localDateTime13.secondOfMinute();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(chronology16);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime17.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime17.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.DateTime dateTime25 = localDateTime23.toDateTime(readableInstant24);
        org.joda.time.LocalDateTime.Property property26 = localDateTime23.millisOfDay();
        org.joda.time.Interval interval27 = property26.toInterval();
        boolean boolean28 = localDateTime13.equals((java.lang.Object) property26);
        int[] intArray30 = ethiopicChronology1.get((org.joda.time.ReadablePartial) localDateTime13, (long) 1439);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime(chronology31);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray33 = localDateTime32.getFieldTypes();
        org.joda.time.LocalDateTime localDateTime35 = localDateTime32.withMillisOfDay((int) (byte) 0);
        boolean boolean36 = localDateTime13.isBefore((org.joda.time.ReadablePartial) localDateTime32);
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 100);
        long long42 = dateTimeZone39.adjustOffset((-31449599999L), false);
        org.joda.time.LocalDateTime localDateTime43 = new org.joda.time.LocalDateTime((long) 123, dateTimeZone39);
        org.joda.time.DateTime dateTime44 = localDateTime13.toDateTime(dateTimeZone39);
        java.lang.String str45 = dateTime44.toString();
        org.joda.time.DateTimeZone dateTimeZone46 = dateTime44.getZone();
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.LocalDateTime localDateTime48 = new org.joda.time.LocalDateTime(chronology47);
        org.joda.time.LocalDateTime localDateTime50 = localDateTime48.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime52 = localDateTime48.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime54 = localDateTime48.withYearOfCentury(0);
        org.joda.time.LocalDateTime.Property property55 = localDateTime54.weekyear();
        org.joda.time.LocalDateTime localDateTime57 = property55.setCopy((int) (byte) 1);
        org.joda.time.Chronology chronology58 = null;
        org.joda.time.LocalDateTime localDateTime59 = new org.joda.time.LocalDateTime(chronology58);
        org.joda.time.LocalDateTime localDateTime61 = localDateTime59.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime63 = localDateTime59.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime65 = localDateTime59.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant66 = null;
        org.joda.time.DateTime dateTime67 = localDateTime65.toDateTime(readableInstant66);
        org.joda.time.DateTimeFieldType dateTimeFieldType68 = null;
        boolean boolean69 = dateTime67.isSupported(dateTimeFieldType68);
        org.joda.time.Chronology chronology70 = null;
        org.joda.time.LocalDateTime localDateTime71 = new org.joda.time.LocalDateTime(chronology70);
        org.joda.time.LocalDateTime localDateTime73 = localDateTime71.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime75 = localDateTime71.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime77 = localDateTime71.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant78 = null;
        org.joda.time.DateTime dateTime79 = localDateTime77.toDateTime(readableInstant78);
        org.joda.time.DateTimeFieldType dateTimeFieldType80 = null;
        boolean boolean81 = dateTime79.isSupported(dateTimeFieldType80);
        int int82 = dateTime67.compareTo((org.joda.time.ReadableInstant) dateTime79);
        int int83 = property55.compareTo((org.joda.time.ReadableInstant) dateTime79);
        java.lang.String str84 = dateTime79.toString();
        org.joda.time.Instant instant85 = dateTime79.toInstant();
        boolean boolean86 = dateTime44.isBefore((org.joda.time.ReadableInstant) dateTime79);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime25 and instant85", (dateTime25.compareTo(instant85) == 0) == dateTime25.equals(instant85));
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test301");
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
        org.joda.time.LocalDateTime localDateTime17 = property16.roundHalfFloorCopy();
        java.lang.String str18 = property16.getAsText();
        org.joda.time.DurationField durationField19 = property16.getRangeDurationField();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology21 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone20);
        org.joda.time.DateTimeField dateTimeField22 = ethiopicChronology21.clockhourOfDay();
        org.joda.time.DurationField durationField23 = ethiopicChronology21.weekyears();
        org.joda.time.DateTimeField dateTimeField24 = ethiopicChronology21.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone25 = ethiopicChronology21.getZone();
        org.joda.time.Chronology chronology26 = ethiopicChronology21.withUTC();
        org.joda.time.DurationField durationField27 = ethiopicChronology21.minutes();
        org.joda.time.DateTimeField dateTimeField28 = ethiopicChronology21.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField29 = ethiopicChronology21.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField30 = ethiopicChronology21.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField31 = ethiopicChronology21.hourOfDay();
        org.joda.time.DateTimeField dateTimeField32 = ethiopicChronology21.millisOfDay();
        long long34 = dateTimeField32.roundCeiling((-9936000010L));
        org.joda.time.DurationField durationField35 = dateTimeField32.getRangeDurationField();
        java.util.Locale locale37 = java.util.Locale.GERMANY;
        boolean boolean38 = locale37.hasExtensions();
        java.util.Locale locale39 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str40 = locale39.getDisplayCountry();
        java.lang.String str41 = locale37.getDisplayVariant(locale39);
        java.lang.String str42 = dateTimeField32.getAsText(814, locale37);
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology45 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone44);
        org.joda.time.DateTimeField dateTimeField46 = ethiopicChronology45.hourOfDay();
        org.joda.time.DateTimeField dateTimeField47 = ethiopicChronology45.secondOfDay();
        org.joda.time.DateTimeField dateTimeField48 = ethiopicChronology45.secondOfDay();
        org.joda.time.LocalDateTime localDateTime49 = new org.joda.time.LocalDateTime((long) 10, (org.joda.time.Chronology) ethiopicChronology45);
        org.joda.time.DurationField durationField50 = ethiopicChronology45.days();
        org.joda.time.DateTimeZone dateTimeZone51 = ethiopicChronology45.getZone();
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology53 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone52);
        org.joda.time.DateTimeField dateTimeField54 = ethiopicChronology53.hourOfDay();
        org.joda.time.DateTimeField dateTimeField55 = ethiopicChronology53.centuryOfEra();
        org.joda.time.DurationField durationField56 = ethiopicChronology53.millis();
        org.joda.time.DateTimeField dateTimeField57 = ethiopicChronology53.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField58 = ethiopicChronology53.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField59 = ethiopicChronology53.weekyear();
        boolean boolean60 = ethiopicChronology45.equals((java.lang.Object) dateTimeField59);
        org.joda.time.Chronology chronology61 = null;
        org.joda.time.LocalDateTime localDateTime62 = new org.joda.time.LocalDateTime(chronology61);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray63 = localDateTime62.getFieldTypes();
        org.joda.time.LocalDateTime localDateTime65 = localDateTime62.withMillisOfDay((int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime67 = localDateTime65.plusWeeks((int) (byte) 10);
        int[] intArray72 = new int[] { 2, 30, 123 };
        int[] intArray74 = dateTimeField59.addWrapPartial((org.joda.time.ReadablePartial) localDateTime65, (int) (byte) 1, intArray72, 0);
        java.util.Locale locale75 = java.util.Locale.ITALY;
        int int76 = dateTimeField59.getMaximumTextLength(locale75);
        long long79 = dateTimeField59.set(31535999990L, 292272984);
        int int80 = dateTimeField59.getMaximumValue();
        java.util.Locale locale82 = java.util.Locale.ITALY;
        java.lang.String str83 = locale82.getISO3Country();
        java.lang.String str84 = dateTimeField59.getAsShortText((long) 157, locale82);
        java.lang.String str85 = locale82.getISO3Language();
        java.lang.String str86 = locale37.getDisplayLanguage(locale82);
        int int87 = property16.getMaximumTextLength(locale82);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField19 and durationField35", (durationField19.compareTo(durationField35) == 0) == durationField19.equals(durationField35));
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test302");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DurationField durationField4 = ethiopicChronology1.centuries();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology1.weekyear();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.yearOfEra();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology1.weekyear();
        org.joda.time.DurationField durationField8 = ethiopicChronology1.millis();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField10 = ethiopicChronology1.centuries();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology1.secondOfDay();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology1.weekyearOfCentury();
        org.joda.time.DurationField durationField13 = ethiopicChronology1.years();
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology1.hourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField13", (durationField3.compareTo(durationField13) == 0) == durationField3.equals(durationField13));
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test303");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DurationField durationField4 = ethiopicChronology1.centuries();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology1.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.clockhourOfHalfday();
        org.joda.time.DurationField durationField7 = ethiopicChronology1.years();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology1.weekyearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField7", (durationField3.compareTo(durationField7) == 0) == durationField3.equals(durationField7));
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test304");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.DateTime dateTime9 = localDateTime7.toDateTime(readableInstant8);
        org.joda.time.LocalDateTime.Property property10 = localDateTime7.millisOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = localDateTime7.getFieldType((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime7.plusMinutes(100);
        int int15 = localDateTime14.getMillisOfDay();
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.LocalDateTime localDateTime18 = localDateTime14.withDurationAdded(readableDuration16, 122);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.LocalDateTime localDateTime20 = localDateTime14.plus(readablePeriod19);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology22 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone21);
        org.joda.time.DateTimeField dateTimeField23 = ethiopicChronology22.clockhourOfDay();
        org.joda.time.DurationField durationField24 = ethiopicChronology22.weekyears();
        org.joda.time.DateTimeField dateTimeField25 = ethiopicChronology22.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone26 = ethiopicChronology22.getZone();
        java.lang.String str27 = dateTimeZone26.getID();
        int int29 = dateTimeZone26.getStandardOffset((long) (-1));
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime(chronology30);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime31.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime35 = localDateTime31.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime37 = localDateTime31.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant38 = null;
        org.joda.time.DateTime dateTime39 = localDateTime37.toDateTime(readableInstant38);
        org.joda.time.DateTimeFieldType dateTimeFieldType40 = null;
        boolean boolean41 = dateTime39.isSupported(dateTimeFieldType40);
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.LocalDateTime localDateTime43 = new org.joda.time.LocalDateTime(chronology42);
        org.joda.time.LocalDateTime localDateTime45 = localDateTime43.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime47 = localDateTime43.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime49 = localDateTime43.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant50 = null;
        org.joda.time.DateTime dateTime51 = localDateTime49.toDateTime(readableInstant50);
        org.joda.time.DateTimeFieldType dateTimeFieldType52 = null;
        boolean boolean53 = dateTime51.isSupported(dateTimeFieldType52);
        int int54 = dateTime39.compareTo((org.joda.time.ReadableInstant) dateTime51);
        int int55 = dateTimeZone26.getOffset((org.joda.time.ReadableInstant) dateTime39);
        org.joda.time.Instant instant56 = dateTime39.toInstant();
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.LocalDateTime localDateTime58 = new org.joda.time.LocalDateTime(chronology57);
        org.joda.time.LocalDateTime localDateTime60 = localDateTime58.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime62 = localDateTime58.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime64 = localDateTime62.withMillisOfSecond((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime66 = localDateTime62.withMinuteOfHour(10);
        org.joda.time.Chronology chronology67 = null;
        org.joda.time.LocalDateTime localDateTime68 = new org.joda.time.LocalDateTime(chronology67);
        org.joda.time.LocalDateTime localDateTime70 = localDateTime68.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime72 = localDateTime68.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime74 = localDateTime68.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant75 = null;
        org.joda.time.DateTime dateTime76 = localDateTime74.toDateTime(readableInstant75);
        org.joda.time.LocalDateTime.Property property77 = localDateTime74.millisOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType79 = localDateTime74.getFieldType((int) (short) 1);
        boolean boolean80 = localDateTime62.isSupported(dateTimeFieldType79);
        boolean boolean81 = instant56.isSupported(dateTimeFieldType79);
        org.joda.time.LocalDateTime.Property property82 = localDateTime14.property(dateTimeFieldType79);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and instant56", (dateTime9.compareTo(instant56) == 0) == dateTime9.equals(instant56));
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test305");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str3 = dateTimeZone1.getNameKey((long) (byte) 0);
        org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.now(dateTimeZone1);
        java.lang.String str5 = dateTimeZone1.getID();
        long long9 = dateTimeZone1.convertLocalToUTC((long) (short) 100, false, 14400052L);
        java.lang.String str10 = dateTimeZone1.toString();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(chronology11);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime12.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime12.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.DateTime dateTime20 = localDateTime18.toDateTime(readableInstant19);
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = null;
        boolean boolean22 = dateTime20.isSupported(dateTimeFieldType21);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime(chronology23);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime24.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime24.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime24.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.DateTime dateTime32 = localDateTime30.toDateTime(readableInstant31);
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = null;
        boolean boolean34 = dateTime32.isSupported(dateTimeFieldType33);
        int int35 = dateTime20.compareTo((org.joda.time.ReadableInstant) dateTime32);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime(chronology36);
        org.joda.time.LocalDateTime localDateTime39 = localDateTime37.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime41 = localDateTime37.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime43 = localDateTime37.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.DateTime dateTime45 = localDateTime43.toDateTime(readableInstant44);
        java.util.Locale locale46 = java.util.Locale.GERMANY;
        boolean boolean47 = locale46.hasExtensions();
        boolean boolean48 = dateTime45.equals((java.lang.Object) locale46);
        boolean boolean49 = dateTime32.isAfter((org.joda.time.ReadableInstant) dateTime45);
        int int50 = dateTimeZone1.getOffset((org.joda.time.ReadableInstant) dateTime32);
        long long51 = dateTime32.getMillis();
        org.joda.time.Instant instant52 = dateTime32.toInstant();
        org.joda.time.Chronology chronology53 = dateTime32.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime20 and instant52", (dateTime20.compareTo(instant52) == 0) == dateTime20.equals(instant52));
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test306");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DurationField durationField4 = ethiopicChronology1.centuries();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology1.weekyear();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.yearOfEra();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology1.weekyear();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology1.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology1.monthOfYear();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology1.weekOfWeekyear();
        org.joda.time.DurationField durationField12 = ethiopicChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField12, durationField3, and durationField4", !(durationField12.compareTo(durationField3) == 0) || (Math.signum(durationField12.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test307");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DurationField durationField4 = ethiopicChronology1.centuries();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology1.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.weekyear();
        java.lang.String str7 = ethiopicChronology1.toString();
        org.joda.time.DurationField durationField8 = ethiopicChronology1.days();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology1.weekyearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetMillis(30);
        long long15 = dateTimeZone12.convertLocalToUTC(21772800272L, false);
        java.lang.String str16 = dateTimeZone12.getID();
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime((long) 556, dateTimeZone12);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology19 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone18);
        org.joda.time.DateTimeField dateTimeField20 = ethiopicChronology19.clockhourOfDay();
        org.joda.time.DurationField durationField21 = ethiopicChronology19.weekyears();
        org.joda.time.DateTimeField dateTimeField22 = ethiopicChronology19.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone23 = ethiopicChronology19.getZone();
        org.joda.time.Chronology chronology24 = ethiopicChronology19.withUTC();
        org.joda.time.DurationField durationField25 = ethiopicChronology19.minutes();
        org.joda.time.DurationField durationField26 = ethiopicChronology19.centuries();
        org.joda.time.DateTimeField dateTimeField27 = ethiopicChronology19.secondOfMinute();
        org.joda.time.DurationField durationField28 = ethiopicChronology19.months();
        boolean boolean29 = durationField28.isSupported();
        org.joda.time.DurationFieldType durationFieldType30 = durationField28.getType();
        boolean boolean31 = localDateTime17.isSupported(durationFieldType30);
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology33 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone32);
        org.joda.time.DateTimeField dateTimeField34 = ethiopicChronology33.hourOfDay();
        org.joda.time.DateTimeField dateTimeField35 = ethiopicChronology33.centuryOfEra();
        org.joda.time.DurationField durationField36 = ethiopicChronology33.millis();
        org.joda.time.DateTimeField dateTimeField37 = ethiopicChronology33.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField38 = ethiopicChronology33.dayOfWeek();
        org.joda.time.DurationField durationField39 = ethiopicChronology33.years();
        org.joda.time.DurationField durationField40 = ethiopicChronology33.seconds();
        org.joda.time.DateTimeField dateTimeField41 = ethiopicChronology33.hourOfHalfday();
        java.util.Locale locale44 = new java.util.Locale("39", "weekyear");
        java.lang.String str45 = locale44.getDisplayScript();
        java.util.Locale locale46 = locale44.stripExtensions();
        int int47 = dateTimeField41.getMaximumTextLength(locale46);
        java.lang.String str48 = dateTimeField9.getAsShortText((org.joda.time.ReadablePartial) localDateTime17, locale46);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField39", (durationField3.compareTo(durationField39) == 0) == durationField3.equals(durationField39));
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test308");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology1.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology1.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology1.yearOfCentury();
        org.joda.time.DurationField durationField6 = ethiopicChronology1.eras();
        org.joda.time.DurationField durationField7 = ethiopicChronology1.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField6, durationField7, and durationField6", !(durationField6.compareTo(durationField7) == 0) || (Math.signum(durationField6.compareTo(durationField6)) == Math.signum(durationField7.compareTo(durationField6))));
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test309");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DurationField durationField4 = ethiopicChronology1.hours();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology1.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.yearOfEra();
        org.joda.time.DurationField durationField7 = ethiopicChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology1.era();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology1.monthOfYear();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology12 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone11);
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology12.dayOfMonth();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime(chronology14);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime15.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime15.plusWeeks((int) (byte) 10);
        java.util.Locale locale22 = java.util.Locale.PRC;
        java.lang.String str23 = dateTimeField13.getAsText((org.joda.time.ReadablePartial) localDateTime21, locale22);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime(chronology24);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime25.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime25.withMillisOfSecond((int) (byte) 1);
        java.util.Locale locale31 = java.util.Locale.JAPAN;
        java.lang.String str32 = dateTimeField13.getAsText((org.joda.time.ReadablePartial) localDateTime25, 2022, locale31);
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology35 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone34);
        org.joda.time.DateTimeField dateTimeField36 = ethiopicChronology35.hourOfDay();
        org.joda.time.DateTimeField dateTimeField37 = ethiopicChronology35.secondOfDay();
        org.joda.time.DateTimeField dateTimeField38 = ethiopicChronology35.secondOfDay();
        org.joda.time.LocalDateTime localDateTime39 = new org.joda.time.LocalDateTime((long) 10, (org.joda.time.Chronology) ethiopicChronology35);
        org.joda.time.LocalDateTime localDateTime41 = localDateTime39.withDayOfYear((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime43 = localDateTime41.plusDays(0);
        org.joda.time.LocalDateTime localDateTime44 = localDateTime25.withFields((org.joda.time.ReadablePartial) localDateTime43);
        org.joda.time.LocalDateTime localDateTime46 = localDateTime44.plusYears(2044);
        java.util.Locale locale48 = java.util.Locale.KOREA;
        java.util.Set<java.lang.String> strSet49 = locale48.getUnicodeLocaleKeys();
        java.util.Locale locale50 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str51 = locale48.getDisplayVariant(locale50);
        java.util.Set<java.lang.String> strSet52 = locale50.getUnicodeLocaleKeys();
        java.lang.String str53 = dateTimeField10.getAsText((org.joda.time.ReadablePartial) localDateTime46, 198, locale50);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on localDateTime41 and localDateTime44", (localDateTime41.compareTo(localDateTime44) == 0) == localDateTime41.equals(localDateTime44));
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test310");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = ethiopicChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.monthOfYear();
        org.joda.time.DurationField durationField7 = ethiopicChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology1.millisOfSecond();
        org.joda.time.DurationField durationField9 = ethiopicChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology1.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology1.era();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology1.millisOfSecond();
        org.joda.time.DurationField durationField13 = ethiopicChronology1.years();
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology1.minuteOfHour();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField13", (durationField3.compareTo(durationField13) == 0) == durationField3.equals(durationField13));
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test311");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology1.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.Chronology chronology5 = ethiopicChronology1.withZone(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology1.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology1.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology1.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology1.year();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology1.minuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = ethiopicChronology1.getZone();
        org.joda.time.DateTimeZone dateTimeZone13 = ethiopicChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology1.centuryOfEra();
        org.joda.time.DurationField durationField15 = ethiopicChronology1.weeks();
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        long long19 = ethiopicChronology1.add(readablePeriod16, 53L, 126);
        org.joda.time.DurationField durationField20 = ethiopicChronology1.eras();
        org.joda.time.DateTimeField dateTimeField21 = ethiopicChronology1.hourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField15 and durationField20", Math.signum(durationField15.compareTo(durationField20)) == -Math.signum(durationField20.compareTo(durationField15)));
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test312");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DurationField durationField4 = ethiopicChronology1.hours();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology1.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology1.yearOfEra();
        org.joda.time.DurationField durationField8 = ethiopicChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology1.dayOfYear();
        org.joda.time.DurationField durationField10 = ethiopicChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology1.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology1.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology1.hourOfHalfday();
        org.joda.time.DurationField durationField14 = ethiopicChronology1.years();
        org.joda.time.DateTimeField dateTimeField15 = ethiopicChronology1.hourOfHalfday();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField14", (durationField3.compareTo(durationField14) == 0) == durationField3.equals(durationField14));
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test313");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology2 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology2.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology2.secondOfDay();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology2.secondOfDay();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) 10, (org.joda.time.Chronology) ethiopicChronology2);
        org.joda.time.DurationField durationField7 = ethiopicChronology2.days();
        org.joda.time.DurationField durationField8 = ethiopicChronology2.weekyears();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime(chronology9);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime10.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime10.plusWeeks((int) (byte) 10);
        int int17 = localDateTime16.getMillisOfSecond();
        int int18 = localDateTime16.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime16.plusHours((int) (short) -1);
        int int21 = localDateTime16.getDayOfYear();
        int int22 = localDateTime16.getYearOfCentury();
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime(chronology23);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime24.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime24.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime24.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.DateTime dateTime32 = localDateTime30.toDateTime(readableInstant31);
        java.util.Locale locale33 = java.util.Locale.GERMANY;
        boolean boolean34 = locale33.hasExtensions();
        boolean boolean35 = dateTime32.equals((java.lang.Object) locale33);
        java.util.Locale.LanguageRange[] languageRangeArray36 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList37 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList37, languageRangeArray36);
        java.util.Collection<java.lang.String> strCollection39 = null;
        java.util.List<java.lang.String> strList40 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList37, strCollection39);
        java.util.Collection<java.lang.String> strCollection41 = null;
        java.util.List<java.lang.String> strList42 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList37, strCollection41);
        java.util.Locale.LanguageRange[] languageRangeArray43 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList44 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList44, languageRangeArray43);
        java.util.Collection<java.lang.String> strCollection46 = null;
        java.util.List<java.lang.String> strList47 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList44, strCollection46);
        java.util.Collection<java.lang.String> strCollection48 = null;
        java.util.List<java.lang.String> strList49 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList44, strCollection48);
        java.util.Locale.FilteringMode filteringMode50 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList51 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList37, strCollection48, filteringMode50);
        boolean boolean52 = dateTime32.equals((java.lang.Object) languageRangeList37);
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.LocalDateTime localDateTime54 = new org.joda.time.LocalDateTime(chronology53);
        org.joda.time.LocalDateTime localDateTime56 = localDateTime54.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime58 = localDateTime54.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime60 = localDateTime54.plusWeeks((int) (byte) 10);
        org.joda.time.Chronology chronology61 = null;
        org.joda.time.LocalDateTime localDateTime62 = new org.joda.time.LocalDateTime(chronology61);
        org.joda.time.LocalDateTime localDateTime64 = localDateTime62.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime66 = localDateTime62.withMillisOfSecond((int) (byte) 1);
        int int67 = localDateTime54.compareTo((org.joda.time.ReadablePartial) localDateTime62);
        org.joda.time.LocalDateTime.Property property68 = localDateTime62.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType69 = property68.getFieldType();
        int int70 = dateTime32.get(dateTimeFieldType69);
        org.joda.time.DateTime dateTime71 = localDateTime16.toDateTime((org.joda.time.ReadableInstant) dateTime32);
        long long73 = ethiopicChronology2.set((org.joda.time.ReadablePartial) localDateTime16, (-9936000010L));
        org.joda.time.ReadablePeriod readablePeriod74 = null;
        long long77 = ethiopicChronology2.add(readablePeriod74, 950400000L, 0);
        org.joda.time.DateTimeField dateTimeField78 = ethiopicChronology2.dayOfYear();
        org.joda.time.DurationField durationField79 = ethiopicChronology2.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField79, durationField7, and durationField8", !(durationField79.compareTo(durationField7) == 0) || (Math.signum(durationField79.compareTo(durationField8)) == Math.signum(durationField7.compareTo(durationField8))));
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test314");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = ethiopicChronology1.getZone();
        org.joda.time.DurationField durationField6 = ethiopicChronology1.centuries();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology1.secondOfMinute();
        org.joda.time.DurationField durationField9 = ethiopicChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology1.clockhourOfHalfday();
        org.joda.time.DurationField durationField11 = ethiopicChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology1.yearOfCentury();
        org.joda.time.DurationField durationField13 = ethiopicChronology1.years();
        org.joda.time.DurationField durationField14 = ethiopicChronology1.years();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField14", (durationField3.compareTo(durationField14) == 0) == durationField3.equals(durationField14));
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test315");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology1.centuryOfEra();
        org.joda.time.DurationField durationField4 = ethiopicChronology1.millis();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology1.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology1.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology1.era();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(chronology10);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime11.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime11.withYearOfCentury(0);
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.weekyear();
        org.joda.time.LocalDateTime localDateTime19 = property18.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.minusDays(304);
        int[] intArray23 = ethiopicChronology1.get((org.joda.time.ReadablePartial) localDateTime19, 4320000000L);
        long long27 = ethiopicChronology1.add((-9676800010L), 951203303110L, 458);
        org.joda.time.DurationField durationField28 = ethiopicChronology1.centuries();
        org.joda.time.DateTimeField dateTimeField29 = ethiopicChronology1.weekyear();
        org.joda.time.DurationField durationField30 = ethiopicChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField30, durationField4, and durationField28", !(durationField30.compareTo(durationField4) == 0) || (Math.signum(durationField30.compareTo(durationField28)) == Math.signum(durationField4.compareTo(durationField28))));
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test316");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DurationField durationField4 = ethiopicChronology1.centuries();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology1.weekyear();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.yearOfEra();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology1.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology1.millisOfDay();
        org.joda.time.DurationField durationField9 = ethiopicChronology1.centuries();
        org.joda.time.DurationField durationField10 = ethiopicChronology1.years();
        org.joda.time.Chronology chronology11 = ethiopicChronology1.withUTC();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField10", (durationField3.compareTo(durationField10) == 0) == durationField3.equals(durationField10));
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test317");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = ethiopicChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.monthOfYear();
        org.joda.time.DurationField durationField7 = ethiopicChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology1.millisOfSecond();
        org.joda.time.DurationField durationField9 = ethiopicChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology1.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology1.minuteOfDay();
        org.joda.time.DurationField durationField13 = ethiopicChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField13, durationField3, and durationField7", !(durationField13.compareTo(durationField3) == 0) || (Math.signum(durationField13.compareTo(durationField7)) == Math.signum(durationField3.compareTo(durationField7))));
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test318");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = ethiopicChronology1.getZone();
        org.joda.time.Chronology chronology6 = ethiopicChronology1.withUTC();
        org.joda.time.DurationField durationField7 = ethiopicChronology1.minutes();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology1.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology1.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology1.millisOfDay();
        org.joda.time.DurationField durationField12 = ethiopicChronology1.years();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology1.secondOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField12", (durationField3.compareTo(durationField12) == 0) == durationField3.equals(durationField12));
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test319");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology2 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology2.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology2.secondOfDay();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology2.secondOfDay();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) 10, (org.joda.time.Chronology) ethiopicChronology2);
        org.joda.time.DurationField durationField7 = ethiopicChronology2.hours();
        org.joda.time.DurationField durationField8 = ethiopicChronology2.eras();
        org.joda.time.DurationField durationField9 = ethiopicChronology2.months();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField7 and durationField8", Math.signum(durationField7.compareTo(durationField8)) == -Math.signum(durationField8.compareTo(durationField7)));
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test320");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology1.dayOfMonth();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(chronology4);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray6 = localDateTime5.getFieldTypes();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.withMillisOfDay((int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.withDayOfYear(53);
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.LocalDateTime localDateTime12 = localDateTime8.plus(readableDuration11);
        int[] intArray14 = ethiopicChronology1.get((org.joda.time.ReadablePartial) localDateTime12, (long) 8);
        org.joda.time.DurationField durationField15 = ethiopicChronology1.halfdays();
        org.joda.time.DateTimeField dateTimeField16 = ethiopicChronology1.centuryOfEra();
        org.joda.time.DurationField durationField17 = ethiopicChronology1.years();
        org.joda.time.Chronology chronology18 = ethiopicChronology1.withUTC();
        org.joda.time.DateTimeField dateTimeField19 = ethiopicChronology1.secondOfDay();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime(chronology20);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime21.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime25.withMillisOfSecond((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime25.withMinuteOfHour(10);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime25.withYear(4);
        java.util.Date date32 = localDateTime25.toDate();
        org.joda.time.LocalDateTime localDateTime33 = org.joda.time.LocalDateTime.fromDateFields(date32);
        org.joda.time.LocalDateTime localDateTime35 = localDateTime33.minusHours((int) (short) 100);
        int int36 = localDateTime33.size();
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology38 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone37);
        org.joda.time.DateTimeField dateTimeField39 = ethiopicChronology38.clockhourOfDay();
        org.joda.time.DurationField durationField40 = ethiopicChronology38.weekyears();
        org.joda.time.DateTimeField dateTimeField41 = ethiopicChronology38.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone42 = ethiopicChronology38.getZone();
        org.joda.time.DateTimeField dateTimeField43 = ethiopicChronology38.monthOfYear();
        org.joda.time.DurationField durationField44 = ethiopicChronology38.seconds();
        org.joda.time.DateTimeField dateTimeField45 = ethiopicChronology38.millisOfSecond();
        org.joda.time.DurationField durationField46 = ethiopicChronology38.weeks();
        org.joda.time.DateTimeField dateTimeField47 = ethiopicChronology38.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField48 = ethiopicChronology38.era();
        org.joda.time.DurationField durationField49 = ethiopicChronology38.weeks();
        int int50 = ethiopicChronology38.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField51 = ethiopicChronology38.days();
        org.joda.time.DateTimeZone dateTimeZone53 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology54 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone53);
        org.joda.time.DateTimeField dateTimeField55 = ethiopicChronology54.hourOfDay();
        org.joda.time.DateTimeField dateTimeField56 = ethiopicChronology54.centuryOfEra();
        org.joda.time.DurationField durationField57 = ethiopicChronology54.millis();
        org.joda.time.DateTimeField dateTimeField58 = ethiopicChronology54.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone59 = ethiopicChronology54.getZone();
        java.lang.String str61 = dateTimeZone59.getNameKey((long) (short) 0);
        org.joda.time.LocalDateTime localDateTime62 = new org.joda.time.LocalDateTime(314191295045000L, dateTimeZone59);
        int int64 = dateTimeZone59.getStandardOffset((long) 981);
        org.joda.time.LocalDateTime localDateTime65 = new org.joda.time.LocalDateTime(dateTimeZone59);
        int[] intArray67 = ethiopicChronology38.get((org.joda.time.ReadablePartial) localDateTime65, (long) 40485);
        int int68 = dateTimeField19.getMaximumValue((org.joda.time.ReadablePartial) localDateTime33, intArray67);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField17 and durationField40", (durationField17.compareTo(durationField40) == 0) == durationField17.equals(durationField40));
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test321");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology2 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology2.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology2.secondOfDay();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology2.secondOfDay();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) 10, (org.joda.time.Chronology) ethiopicChronology2);
        org.joda.time.DurationField durationField7 = ethiopicChronology2.hours();
        org.joda.time.DurationField durationField8 = ethiopicChronology2.eras();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology2.dayOfWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField7 and durationField8", Math.signum(durationField7.compareTo(durationField8)) == -Math.signum(durationField8.compareTo(durationField7)));
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test322");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology1.centuryOfEra();
        org.joda.time.DurationField durationField4 = ethiopicChronology1.eras();
        org.joda.time.Chronology chronology5 = ethiopicChronology1.withUTC();
        long long9 = ethiopicChronology1.add((-61379337599980L), (long) 475, 115);
        org.joda.time.Chronology chronology10 = ethiopicChronology1.withUTC();
        org.joda.time.DurationField durationField11 = ethiopicChronology1.eras();
        org.joda.time.DurationField durationField12 = ethiopicChronology1.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField4, durationField12, and durationField4", !(durationField4.compareTo(durationField12) == 0) || (Math.signum(durationField4.compareTo(durationField4)) == Math.signum(durationField12.compareTo(durationField4))));
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test323");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DurationField durationField4 = ethiopicChronology1.hours();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology1.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.yearOfEra();
        org.joda.time.DurationField durationField7 = ethiopicChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology1.era();
        org.joda.time.DurationField durationField9 = ethiopicChronology1.months();
        org.joda.time.DurationField durationField10 = ethiopicChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField10, durationField3, and durationField4", !(durationField10.compareTo(durationField3) == 0) || (Math.signum(durationField10.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test324");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = ethiopicChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.monthOfYear();
        org.joda.time.DurationField durationField7 = ethiopicChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology1.year();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology1.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology1.weekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        long long14 = ethiopicChronology1.add(readablePeriod11, (long) '#', 515);
        org.joda.time.DurationField durationField15 = ethiopicChronology1.halfdays();
        org.joda.time.DurationField durationField16 = ethiopicChronology1.years();
        org.joda.time.DateTimeField dateTimeField17 = ethiopicChronology1.year();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField16", (durationField3.compareTo(durationField16) == 0) == durationField3.equals(durationField16));
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test325");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology2 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology2.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology2.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.Chronology chronology6 = ethiopicChronology2.withZone(dateTimeZone5);
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology2.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone8 = ethiopicChronology2.getZone();
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(1900800010L, dateTimeZone8);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(chronology10);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime11.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime11.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.DateTime dateTime19 = localDateTime17.toDateTime(readableInstant18);
        org.joda.time.LocalDateTime.Property property20 = localDateTime17.millisOfDay();
        org.joda.time.LocalDateTime localDateTime22 = localDateTime17.plusHours(13);
        int int23 = localDateTime9.compareTo((org.joda.time.ReadablePartial) localDateTime17);
        int int24 = localDateTime17.getMillisOfDay();
        int int25 = localDateTime17.getDayOfYear();
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology27 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone26);
        org.joda.time.DateTimeField dateTimeField28 = ethiopicChronology27.clockhourOfDay();
        org.joda.time.DurationField durationField29 = ethiopicChronology27.weekyears();
        org.joda.time.DateTimeField dateTimeField30 = ethiopicChronology27.clockhourOfDay();
        int int31 = ethiopicChronology27.getMinimumDaysInFirstWeek();
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime17, (org.joda.time.Chronology) ethiopicChronology27);
        org.joda.time.DateTimeField dateTimeField33 = ethiopicChronology27.dayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on localDateTime17 and localDateTime32", (localDateTime17.compareTo(localDateTime32) == 0) == localDateTime17.equals(localDateTime32));
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test326");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.weekOfWeekyear();
        org.joda.time.LocalDateTime.Property property5 = localDateTime3.centuryOfEra();
        int int6 = localDateTime3.getYear();
        int int7 = localDateTime3.size();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology10 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology10.hourOfDay();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology10.secondOfDay();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology10.secondOfDay();
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((long) 10, (org.joda.time.Chronology) ethiopicChronology10);
        org.joda.time.DurationField durationField15 = ethiopicChronology10.hours();
        org.joda.time.DateTimeField dateTimeField16 = ethiopicChronology10.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField17 = ethiopicChronology10.monthOfYear();
        org.joda.time.DurationField durationField18 = ethiopicChronology10.centuries();
        java.lang.String str19 = ethiopicChronology10.toString();
        org.joda.time.DateTimeField dateTimeField20 = ethiopicChronology10.weekOfWeekyear();
        org.joda.time.DurationField durationField21 = ethiopicChronology10.millis();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology23 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone22);
        org.joda.time.DateTimeField dateTimeField24 = ethiopicChronology23.hourOfDay();
        org.joda.time.DateTimeField dateTimeField25 = ethiopicChronology23.centuryOfEra();
        org.joda.time.DurationField durationField26 = ethiopicChronology23.millis();
        org.joda.time.DateTimeField dateTimeField27 = ethiopicChronology23.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField28 = ethiopicChronology23.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField29 = ethiopicChronology23.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField30 = ethiopicChronology23.weekOfWeekyear();
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime(chronology31);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime32.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime32.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime38 = localDateTime32.plusWeeks((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime40 = localDateTime38.minusSeconds(614);
        org.joda.time.LocalDateTime localDateTime42 = localDateTime38.withDayOfWeek((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology44 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone43);
        org.joda.time.DateTimeField dateTimeField45 = ethiopicChronology44.clockhourOfDay();
        org.joda.time.DurationField durationField46 = ethiopicChronology44.weekyears();
        org.joda.time.DateTimeField dateTimeField47 = ethiopicChronology44.clockhourOfDay();
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.LocalDateTime localDateTime49 = new org.joda.time.LocalDateTime(chronology48);
        org.joda.time.LocalDateTime localDateTime51 = localDateTime49.plusWeeks((int) (byte) -1);
        java.util.Locale locale53 = java.util.Locale.GERMANY;
        java.lang.String str54 = locale53.getScript();
        org.joda.time.DateTimeZone dateTimeZone55 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology56 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone55);
        org.joda.time.DateTimeField dateTimeField57 = ethiopicChronology56.clockhourOfDay();
        java.util.Locale locale59 = java.util.Locale.ITALIAN;
        java.lang.String str60 = dateTimeField57.getAsText((long) 'a', locale59);
        java.lang.String str61 = locale53.getDisplayName(locale59);
        java.lang.String str62 = dateTimeField47.getAsShortText((org.joda.time.ReadablePartial) localDateTime51, (int) ' ', locale59);
        int int63 = localDateTime38.compareTo((org.joda.time.ReadablePartial) localDateTime51);
        int[] intArray65 = ethiopicChronology23.get((org.joda.time.ReadablePartial) localDateTime38, (long) (byte) 0);
        org.joda.time.LocalDateTime localDateTime67 = localDateTime38.minusMonths(581);
        int int68 = localDateTime38.getYearOfEra();
        org.joda.time.DateTimeZone dateTimeZone69 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology70 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone69);
        org.joda.time.DateTimeField dateTimeField71 = ethiopicChronology70.hourOfDay();
        org.joda.time.DateTimeField dateTimeField72 = ethiopicChronology70.centuryOfEra();
        org.joda.time.DurationField durationField73 = ethiopicChronology70.millis();
        org.joda.time.DateTimeField dateTimeField74 = ethiopicChronology70.secondOfMinute();
        long long78 = ethiopicChronology70.add(6311520000100L, (long) 5, 25702);
        boolean boolean79 = localDateTime38.equals((java.lang.Object) 5);
        int int80 = localDateTime38.getHourOfDay();
        org.joda.time.Chronology chronology81 = null;
        org.joda.time.LocalDateTime localDateTime82 = new org.joda.time.LocalDateTime(chronology81);
        org.joda.time.LocalDateTime localDateTime84 = localDateTime82.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime86 = localDateTime82.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime88 = localDateTime82.withYearOfCentury(0);
        org.joda.time.LocalDateTime.Property property89 = localDateTime88.weekyear();
        org.joda.time.LocalDateTime localDateTime91 = property89.setCopy((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime92 = property89.roundCeilingCopy();
        int int93 = localDateTime92.getDayOfMonth();
        org.joda.time.Chronology chronology94 = localDateTime92.getChronology();
        boolean boolean95 = localDateTime38.isBefore((org.joda.time.ReadablePartial) localDateTime92);
        long long97 = ethiopicChronology10.set((org.joda.time.ReadablePartial) localDateTime38, (long) 4);
        boolean boolean98 = localDateTime3.equals((java.lang.Object) ethiopicChronology10);
        org.joda.time.DurationField durationField99 = ethiopicChronology10.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField99, durationField15, and durationField18", !(durationField99.compareTo(durationField15) == 0) || (Math.signum(durationField99.compareTo(durationField18)) == Math.signum(durationField15.compareTo(durationField18))));
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test327");
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
        org.joda.time.LocalDateTime localDateTime17 = localDateTime11.withYearOfCentury(0);
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.weekyear();
        org.joda.time.LocalDateTime localDateTime20 = property18.setCopy((int) (byte) 1);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime(chronology21);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime22.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime22.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime22.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.DateTime dateTime30 = localDateTime28.toDateTime(readableInstant29);
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = null;
        boolean boolean32 = dateTime30.isSupported(dateTimeFieldType31);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime(chronology33);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime34.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime38 = localDateTime34.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime40 = localDateTime34.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant41 = null;
        org.joda.time.DateTime dateTime42 = localDateTime40.toDateTime(readableInstant41);
        org.joda.time.DateTimeFieldType dateTimeFieldType43 = null;
        boolean boolean44 = dateTime42.isSupported(dateTimeFieldType43);
        int int45 = dateTime30.compareTo((org.joda.time.ReadableInstant) dateTime42);
        int int46 = property18.compareTo((org.joda.time.ReadableInstant) dateTime42);
        boolean boolean47 = dateTime9.isEqual((org.joda.time.ReadableInstant) dateTime42);
        org.joda.time.DateTimeZone dateTimeZone48 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology49 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone48);
        org.joda.time.DateTimeField dateTimeField50 = ethiopicChronology49.hourOfDay();
        org.joda.time.DateTimeField dateTimeField51 = ethiopicChronology49.secondOfDay();
        org.joda.time.DateTimeField dateTimeField52 = ethiopicChronology49.secondOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType53 = dateTimeField52.getType();
        boolean boolean54 = dateTime42.isSupported(dateTimeFieldType53);
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.LocalDateTime localDateTime56 = new org.joda.time.LocalDateTime(chronology55);
        org.joda.time.LocalDateTime localDateTime58 = localDateTime56.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime60 = localDateTime56.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime62 = localDateTime56.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant63 = null;
        org.joda.time.DateTime dateTime64 = localDateTime62.toDateTime(readableInstant63);
        java.util.Locale locale65 = java.util.Locale.GERMANY;
        boolean boolean66 = locale65.hasExtensions();
        boolean boolean67 = dateTime64.equals((java.lang.Object) locale65);
        java.lang.String str68 = dateTime64.toString();
        long long69 = dateTime64.getMillis();
        boolean boolean70 = dateTime42.isBefore((org.joda.time.ReadableInstant) dateTime64);
        org.joda.time.Instant instant71 = dateTime64.toInstant();
        org.joda.time.Instant instant72 = dateTime64.toInstant();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and instant71", (dateTime9.compareTo(instant71) == 0) == dateTime9.equals(instant71));
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test328");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = ethiopicChronology1.getZone();
        org.joda.time.Chronology chronology6 = ethiopicChronology1.withUTC();
        org.joda.time.DurationField durationField7 = ethiopicChronology1.minutes();
        org.joda.time.DurationField durationField8 = ethiopicChronology1.centuries();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology1.dayOfWeek();
        long long13 = ethiopicChronology1.add((long) 487, 22L, 7);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        long long17 = ethiopicChronology1.add(readablePeriod14, 30926448000000L, 20);
        org.joda.time.DateTimeField dateTimeField18 = ethiopicChronology1.dayOfMonth();
        org.joda.time.DurationField durationField19 = ethiopicChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField19, durationField3, and durationField7", !(durationField19.compareTo(durationField3) == 0) || (Math.signum(durationField19.compareTo(durationField7)) == Math.signum(durationField3.compareTo(durationField7))));
    }
}

