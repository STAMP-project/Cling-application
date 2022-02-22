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
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology1.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.Chronology chronology5 = copticChronology1.withZone(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.millisOfSecond();
        org.joda.time.DurationField durationField7 = copticChronology1.months();
        org.joda.time.LocalDateTime localDateTime8 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) copticChronology1);
        org.joda.time.DateTimeField dateTimeField9 = copticChronology1.year();
        org.joda.time.DurationField durationField10 = copticChronology1.eras();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology1.dayOfWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField7 and durationField10", Math.signum(durationField7.compareTo(durationField10)) == -Math.signum(durationField10.compareTo(durationField7)));
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test502");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology1.secondOfDay();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology1.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology1.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology1.secondOfDay();
        org.joda.time.DurationField durationField8 = copticChronology1.minutes();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology1.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology1.yearOfCentury();
        org.joda.time.DurationField durationField11 = copticChronology1.eras();
        java.lang.String str12 = copticChronology1.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField8 and durationField11", Math.signum(durationField8.compareTo(durationField11)) == -Math.signum(durationField11.compareTo(durationField8)));
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test503");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology1.centuryOfEra();
        org.joda.time.DurationField durationField4 = copticChronology1.hours();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology1.weekOfWeekyear();
        org.joda.time.DurationField durationField6 = copticChronology1.millis();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology1.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology1.dayOfWeek();
        org.joda.time.DurationField durationField9 = copticChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField4, and durationField6", !(durationField9.compareTo(durationField4) == 0) || (Math.signum(durationField9.compareTo(durationField6)) == Math.signum(durationField4.compareTo(durationField6))));
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
        org.joda.time.DateTimeZone dateTimeZone5 = copticChronology1.getZone();
        org.joda.time.LocalDateTime localDateTime6 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) copticChronology1);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.weekOfWeekyear();
        long long8 = property7.remainder();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.chrono.CopticChronology copticChronology10 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField11 = copticChronology10.hourOfDay();
        org.joda.time.DurationField durationField12 = copticChronology10.eras();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology10.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology10.minuteOfHour();
        java.lang.String str15 = dateTimeField14.getName();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(chronology16);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.minusSeconds((int) (short) -1);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime17.withYearOfEra((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.chrono.CopticChronology copticChronology24 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField25 = copticChronology24.dayOfMonth();
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime(chronology26);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime27.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime27.plusWeeks((int) (byte) 10);
        java.util.Locale locale34 = java.util.Locale.PRC;
        java.lang.String str35 = dateTimeField25.getAsText((org.joda.time.ReadablePartial) localDateTime33, locale34);
        java.util.Set<java.lang.String> strSet36 = locale34.getUnicodeLocaleKeys();
        java.util.Set<java.lang.String> strSet37 = org.joda.time.DateTimeZone.getAvailableIDs();
        strSet37.clear();
        java.lang.Object[] objArray39 = strSet37.toArray();
        boolean boolean40 = strSet36.addAll((java.util.Collection<java.lang.String>) strSet37);
        strSet36.clear();
        java.util.Locale locale44 = new java.util.Locale("hi!", "hi!");
        java.lang.String str45 = locale44.toLanguageTag();
        boolean boolean46 = strSet36.equals((java.lang.Object) locale44);
        java.lang.String str47 = dateTimeField14.getAsShortText((org.joda.time.ReadablePartial) localDateTime21, 724, locale44);
        java.lang.String str48 = locale44.toLanguageTag();
        java.lang.String str49 = property7.getAsShortText(locale44);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField12", Math.signum(durationField3.compareTo(durationField12)) == -Math.signum(durationField12.compareTo(durationField3)));
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test505");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.CopticChronology copticChronology2 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology2.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology2.secondOfDay();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology2.secondOfDay();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) 10, (org.joda.time.Chronology) copticChronology2);
        org.joda.time.DurationField durationField7 = copticChronology2.eras();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology2.year();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology2.weekyear();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology2.secondOfMinute();
        org.joda.time.DurationField durationField11 = copticChronology2.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField7, durationField11, and durationField7", !(durationField7.compareTo(durationField11) == 0) || (Math.signum(durationField7.compareTo(durationField7)) == Math.signum(durationField11.compareTo(durationField7))));
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test506");
        java.util.Locale locale0 = java.util.Locale.GERMANY;
        java.lang.String str1 = locale0.getScript();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.chrono.CopticChronology copticChronology3 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = copticChronology3.clockhourOfDay();
        java.util.Locale locale6 = java.util.Locale.ITALIAN;
        java.lang.String str7 = dateTimeField4.getAsText((long) 'a', locale6);
        java.lang.String str8 = locale0.getDisplayName(locale6);
        java.util.Set<java.lang.String> strSet9 = locale6.getUnicodeLocaleAttributes();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.chrono.CopticChronology copticChronology11 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone10);
        org.joda.time.DateTimeField dateTimeField12 = copticChronology11.clockhourOfDay();
        org.joda.time.DurationField durationField13 = copticChronology11.weekyears();
        org.joda.time.DurationField durationField14 = copticChronology11.hours();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology11.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology11.weekyearOfCentury();
        boolean boolean17 = strSet9.remove((java.lang.Object) copticChronology11);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetMillis(8106);
        org.joda.time.chrono.CopticChronology copticChronology20 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone19);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.chrono.CopticChronology copticChronology22 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone21);
        org.joda.time.DateTimeField dateTimeField23 = copticChronology22.hourOfDay();
        org.joda.time.DateTimeField dateTimeField24 = copticChronology22.secondOfDay();
        org.joda.time.DateTimeField dateTimeField25 = copticChronology22.secondOfDay();
        org.joda.time.DurationField durationField26 = copticChronology22.years();
        org.joda.time.DateTimeField dateTimeField27 = copticChronology22.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField28 = copticChronology22.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField29 = copticChronology22.secondOfDay();
        org.joda.time.DateTimeField dateTimeField30 = copticChronology22.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField31 = copticChronology22.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 10);
        java.lang.String str35 = dateTimeZone33.getShortName((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.chrono.CopticChronology copticChronology37 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone36);
        org.joda.time.DateTimeField dateTimeField38 = copticChronology37.clockhourOfDay();
        org.joda.time.DurationField durationField39 = copticChronology37.weekyears();
        org.joda.time.DateTimeField dateTimeField40 = copticChronology37.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone41 = copticChronology37.getZone();
        org.joda.time.LocalDateTime localDateTime42 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) copticChronology37);
        org.joda.time.DurationField durationField43 = copticChronology37.weekyears();
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.LocalDateTime localDateTime45 = new org.joda.time.LocalDateTime(chronology44);
        org.joda.time.LocalDateTime localDateTime47 = localDateTime45.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime49 = localDateTime45.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime.Property property50 = localDateTime49.dayOfWeek();
        int[] intArray52 = copticChronology37.get((org.joda.time.ReadablePartial) localDateTime49, 0L);
        org.joda.time.DurationField durationField53 = copticChronology37.minutes();
        org.joda.time.DurationField durationField54 = copticChronology37.seconds();
        org.joda.time.DateTimeField dateTimeField55 = copticChronology37.weekyearOfCentury();
        boolean boolean56 = dateTimeZone33.equals((java.lang.Object) copticChronology37);
        boolean boolean58 = copticChronology37.equals((java.lang.Object) 2916391);
        org.joda.time.DateTimeField dateTimeField59 = copticChronology37.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone60 = null;
        org.joda.time.chrono.CopticChronology copticChronology61 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone60);
        org.joda.time.DateTimeField dateTimeField62 = copticChronology61.hourOfDay();
        org.joda.time.DateTimeField dateTimeField63 = copticChronology61.centuryOfEra();
        org.joda.time.DurationField durationField64 = copticChronology61.millis();
        org.joda.time.DateTimeField dateTimeField65 = copticChronology61.weekOfWeekyear();
        org.joda.time.DurationField durationField66 = copticChronology61.weekyears();
        org.joda.time.DateTimeField dateTimeField67 = copticChronology61.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField68 = copticChronology61.millisOfDay();
        org.joda.time.DurationField durationField69 = copticChronology61.weekyears();
        org.joda.time.chrono.CopticChronology[] copticChronologyArray70 = new org.joda.time.chrono.CopticChronology[] { copticChronology20, copticChronology22, copticChronology37, copticChronology61 };
        org.joda.time.chrono.CopticChronology[] copticChronologyArray71 = strSet9.toArray(copticChronologyArray70);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField13 and durationField26", (durationField13.compareTo(durationField26) == 0) == durationField13.equals(durationField26));
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test507");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology1.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology1.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology1.millisOfDay();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.centuryOfEra();
        org.joda.time.DurationField durationField7 = copticChronology1.weeks();
        org.joda.time.DurationField durationField8 = copticChronology1.eras();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology1.year();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField7 and durationField8", Math.signum(durationField7.compareTo(durationField8)) == -Math.signum(durationField8.compareTo(durationField7)));
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test508");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology1.centuryOfEra();
        org.joda.time.DurationField durationField4 = copticChronology1.millis();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology1.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone6);
        org.joda.time.DateTimeField dateTimeField8 = copticChronology7.hourOfDay();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology7.centuryOfEra();
        org.joda.time.DurationField durationField10 = copticChronology7.millis();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology7.weekOfWeekyear();
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
        org.joda.time.LocalDateTime localDateTime29 = localDateTime21.minusMillis(2022);
        int[] intArray31 = copticChronology7.get((org.joda.time.ReadablePartial) localDateTime21, (long) '#');
        long long33 = copticChronology1.set((org.joda.time.ReadablePartial) localDateTime21, 32054400000L);
        org.joda.time.DateTimeField dateTimeField34 = copticChronology1.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField35 = copticChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField36 = copticChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField37 = copticChronology1.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField38 = copticChronology1.minuteOfHour();
        org.joda.time.DurationField durationField39 = copticChronology1.eras();
        org.joda.time.DurationField durationField40 = copticChronology1.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField40 and durationField39", Math.signum(durationField40.compareTo(durationField39)) == -Math.signum(durationField39.compareTo(durationField40)));
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test509");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = copticChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = copticChronology1.getZone();
        org.joda.time.DurationField durationField6 = copticChronology1.centuries();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology1.millisOfDay();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology1.era();
        org.joda.time.DurationField durationField10 = dateTimeField9.getDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField10, durationField3, and durationField6", !(durationField10.compareTo(durationField3) == 0) || (Math.signum(durationField10.compareTo(durationField6)) == Math.signum(durationField3.compareTo(durationField6))));
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test510");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = copticChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField5 = copticChronology1.hours();
        org.joda.time.DurationField durationField6 = copticChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology1.hourOfDay();
        org.joda.time.DurationField durationField8 = copticChronology1.centuries();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology1.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology1.dayOfYear();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(chronology11);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime12.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime12.plusWeeks((int) (byte) 10);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime(chronology19);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime20.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime20.withMillisOfSecond((int) (byte) 1);
        int int25 = localDateTime12.compareTo((org.joda.time.ReadablePartial) localDateTime20);
        org.joda.time.LocalDateTime.Property property26 = localDateTime20.weekyear();
        org.joda.time.LocalDateTime.Property property27 = localDateTime20.millisOfDay();
        org.joda.time.LocalDateTime localDateTime28 = property27.withMinimumValue();
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
        org.joda.time.LocalDateTime.Property property44 = localDateTime38.weekyear();
        org.joda.time.LocalDateTime localDateTime46 = localDateTime38.minusMillis(2022);
        boolean boolean47 = localDateTime28.isAfter((org.joda.time.ReadablePartial) localDateTime38);
        java.util.TimeZone timeZone48 = null;
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.forTimeZone(timeZone48);
        java.lang.String str51 = dateTimeZone49.getNameKey((long) (byte) 0);
        org.joda.time.LocalDateTime localDateTime52 = new org.joda.time.LocalDateTime(dateTimeZone49);
        java.util.TimeZone timeZone53 = null;
        org.joda.time.DateTimeZone dateTimeZone54 = org.joda.time.DateTimeZone.forTimeZone(timeZone53);
        java.lang.String str56 = dateTimeZone54.getNameKey((long) (byte) 0);
        org.joda.time.LocalDateTime localDateTime57 = new org.joda.time.LocalDateTime(dateTimeZone54);
        boolean boolean58 = localDateTime52.isEqual((org.joda.time.ReadablePartial) localDateTime57);
        org.joda.time.LocalDateTime localDateTime59 = localDateTime38.withFields((org.joda.time.ReadablePartial) localDateTime57);
        org.joda.time.LocalDateTime localDateTime61 = localDateTime57.minusMinutes(26153572);
        int[] intArray62 = null;
        int int63 = dateTimeField10.getMaximumValue((org.joda.time.ReadablePartial) localDateTime61, intArray62);
        org.joda.time.LocalDateTime localDateTime65 = localDateTime61.minusSeconds(2524799);
        org.joda.time.DateTimeZone dateTimeZone66 = null;
        org.joda.time.chrono.CopticChronology copticChronology67 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone66);
        org.joda.time.DateTimeField dateTimeField68 = copticChronology67.hourOfDay();
        org.joda.time.DateTimeField dateTimeField69 = copticChronology67.secondOfDay();
        org.joda.time.DateTimeField dateTimeField70 = copticChronology67.minuteOfDay();
        org.joda.time.DurationField durationField71 = copticChronology67.centuries();
        org.joda.time.DurationField durationField72 = copticChronology67.weeks();
        org.joda.time.DurationField durationField73 = copticChronology67.years();
        org.joda.time.DateTimeZone dateTimeZone74 = null;
        org.joda.time.chrono.CopticChronology copticChronology75 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone74);
        org.joda.time.DateTimeField dateTimeField76 = copticChronology75.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField77 = copticChronology75.weekOfWeekyear();
        org.joda.time.DurationField durationField78 = copticChronology75.hours();
        org.joda.time.DurationField durationField79 = copticChronology75.seconds();
        int int80 = durationField73.compareTo(durationField79);
        long long82 = durationField79.getMillis(4680077);
        long long84 = durationField79.getValueAsLong((long) 40702460);
        boolean boolean85 = localDateTime61.equals((java.lang.Object) 40702460);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField73", (durationField3.compareTo(durationField73) == 0) == durationField3.equals(durationField73));
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test511");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology1.centuryOfEra();
        org.joda.time.DurationField durationField4 = copticChronology1.millis();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology1.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone6);
        org.joda.time.DateTimeField dateTimeField8 = copticChronology7.hourOfDay();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology7.centuryOfEra();
        org.joda.time.DurationField durationField10 = copticChronology7.millis();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology7.weekOfWeekyear();
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
        org.joda.time.LocalDateTime localDateTime29 = localDateTime21.minusMillis(2022);
        int[] intArray31 = copticChronology7.get((org.joda.time.ReadablePartial) localDateTime21, (long) '#');
        long long33 = copticChronology1.set((org.joda.time.ReadablePartial) localDateTime21, 32054400000L);
        org.joda.time.DateTimeField dateTimeField34 = copticChronology1.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField35 = copticChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField36 = copticChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField37 = copticChronology1.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField38 = copticChronology1.minuteOfHour();
        org.joda.time.DurationField durationField39 = copticChronology1.eras();
        org.joda.time.DateTimeField dateTimeField40 = copticChronology1.clockhourOfHalfday();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField4 and durationField39", Math.signum(durationField4.compareTo(durationField39)) == -Math.signum(durationField39.compareTo(durationField4)));
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test512");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.clockhourOfDay();
        long long6 = copticChronology1.add((long) '#', (long) 'a', (int) '#');
        org.joda.time.DateTimeField dateTimeField7 = copticChronology1.clockhourOfHalfday();
        org.joda.time.DurationField durationField8 = copticChronology1.eras();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology1.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology1.hourOfDay();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(chronology11);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime12.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.withMillisOfSecond((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime16.minusYears((-292269338));
        java.lang.String str22 = localDateTime16.toString("1");
        int[] intArray24 = copticChronology1.get((org.joda.time.ReadablePartial) localDateTime16, 4346236708L);
        org.joda.time.DateTimeField dateTimeField25 = copticChronology1.weekyear();
        org.joda.time.DurationField durationField26 = copticChronology1.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField8, durationField26, and durationField8", !(durationField8.compareTo(durationField26) == 0) || (Math.signum(durationField8.compareTo(durationField8)) == Math.signum(durationField26.compareTo(durationField8))));
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test513");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = copticChronology1.weekyears();
        org.joda.time.DurationField durationField4 = copticChronology1.hours();
        int int5 = copticChronology1.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology1.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone8 = copticChronology1.getZone();
        java.lang.String str9 = copticChronology1.toString();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology1.clockhourOfHalfday();
        org.joda.time.DurationField durationField11 = copticChronology1.minutes();
        org.joda.time.DateTimeZone dateTimeZone12 = copticChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology1.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology1.secondOfDay();
        long long18 = copticChronology1.add(13136339742L, 375509088146588595L, 18);
        org.joda.time.DurationField durationField19 = copticChronology1.halfdays();
        org.joda.time.DurationField durationField20 = copticChronology1.months();
        org.joda.time.DurationField durationField21 = copticChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField21, durationField3, and durationField4", !(durationField21.compareTo(durationField3) == 0) || (Math.signum(durationField21.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test514");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.weekyearOfCentury();
        org.joda.time.DurationField durationField3 = copticChronology1.minutes();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology1.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.era();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology1.minuteOfHour();
        org.joda.time.DurationField durationField8 = copticChronology1.seconds();
        org.joda.time.DurationField durationField9 = copticChronology1.months();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology1.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetMillis(575);
        org.joda.time.chrono.CopticChronology copticChronology13 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone12);
        java.util.TimeZone timeZone14 = dateTimeZone12.toTimeZone();
        org.joda.time.Chronology chronology15 = copticChronology1.withZone(dateTimeZone12);
        org.joda.time.DateTimeField dateTimeField16 = copticChronology1.era();
        org.joda.time.DurationField durationField17 = copticChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField17, durationField3, and durationField8", !(durationField17.compareTo(durationField3) == 0) || (Math.signum(durationField17.compareTo(durationField8)) == Math.signum(durationField3.compareTo(durationField8))));
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test515");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.clockhourOfDay();
        long long6 = copticChronology1.add((long) '#', (long) 'a', (int) '#');
        org.joda.time.DateTimeField dateTimeField7 = copticChronology1.clockhourOfHalfday();
        org.joda.time.DurationField durationField8 = copticChronology1.eras();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology1.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology1.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology1.clockhourOfHalfday();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime(chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime13.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime19 = property18.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.withYearOfCentury(30);
        int int22 = localDateTime21.getWeekOfWeekyear();
        org.joda.time.ReadableDuration readableDuration23 = null;
        org.joda.time.LocalDateTime localDateTime24 = localDateTime21.minus(readableDuration23);
        org.joda.time.Chronology chronology25 = localDateTime21.getChronology();
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime(chronology26);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime.Property property30 = localDateTime27.weekOfWeekyear();
        int int31 = localDateTime27.getSecondOfMinute();
        org.joda.time.ReadableDuration readableDuration32 = null;
        org.joda.time.LocalDateTime localDateTime33 = localDateTime27.plus(readableDuration32);
        int int34 = localDateTime33.getEra();
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.LocalDateTime localDateTime36 = new org.joda.time.LocalDateTime(chronology35);
        org.joda.time.LocalDateTime localDateTime38 = localDateTime36.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime40 = localDateTime36.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime42 = localDateTime40.withMillisOfSecond((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime44 = localDateTime42.plusYears(15);
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.chrono.CopticChronology copticChronology46 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone45);
        org.joda.time.DateTimeField dateTimeField47 = copticChronology46.clockhourOfDay();
        org.joda.time.DurationField durationField48 = copticChronology46.weeks();
        org.joda.time.DurationFieldType durationFieldType49 = durationField48.getType();
        org.joda.time.LocalDateTime localDateTime51 = localDateTime42.withFieldAdded(durationFieldType49, (int) (short) 1);
        boolean boolean52 = localDateTime33.isSupported(durationFieldType49);
        boolean boolean53 = localDateTime21.isSupported(durationFieldType49);
        org.joda.time.LocalDateTime localDateTime55 = localDateTime21.plusYears(245328);
        java.util.Locale locale56 = null;
        java.lang.String str57 = dateTimeField11.getAsText((org.joda.time.ReadablePartial) localDateTime55, locale56);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField8 and durationField48", Math.signum(durationField8.compareTo(durationField48)) == -Math.signum(durationField48.compareTo(durationField8)));
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test516");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.withMillisOfSecond((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime5.plusWeeks(2000);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(chronology10);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime11.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime11.plusWeeks((int) (byte) 10);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime(chronology18);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime19.withMillisOfSecond((int) (byte) 1);
        int int24 = localDateTime11.compareTo((org.joda.time.ReadablePartial) localDateTime19);
        org.joda.time.LocalDateTime.Property property25 = localDateTime19.weekyear();
        org.joda.time.LocalDateTime.Property property26 = localDateTime19.millisOfDay();
        org.joda.time.LocalDateTime localDateTime27 = property26.roundHalfCeilingCopy();
        org.joda.time.DurationField durationField28 = property26.getDurationField();
        org.joda.time.LocalDateTime localDateTime29 = property26.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime31 = localDateTime29.minusMonths(26172895);
        int int32 = localDateTime5.compareTo((org.joda.time.ReadablePartial) localDateTime31);
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.chrono.CopticChronology copticChronology34 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone33);
        org.joda.time.DateTimeField dateTimeField35 = copticChronology34.hourOfDay();
        org.joda.time.DateTimeField dateTimeField36 = copticChronology34.centuryOfEra();
        org.joda.time.DurationField durationField37 = copticChronology34.millis();
        org.joda.time.DateTimeField dateTimeField38 = copticChronology34.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField39 = copticChronology34.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.chrono.CopticChronology copticChronology41 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone40);
        org.joda.time.DateTimeField dateTimeField42 = copticChronology41.dayOfMonth();
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.LocalDateTime localDateTime44 = new org.joda.time.LocalDateTime(chronology43);
        org.joda.time.LocalDateTime localDateTime46 = localDateTime44.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime48 = localDateTime44.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime50 = localDateTime44.plusWeeks((int) (byte) 10);
        java.util.Locale locale51 = java.util.Locale.PRC;
        java.lang.String str52 = dateTimeField42.getAsText((org.joda.time.ReadablePartial) localDateTime50, locale51);
        int int53 = dateTimeField39.getMaximumValue((org.joda.time.ReadablePartial) localDateTime50);
        java.lang.String str54 = localDateTime50.toString();
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.LocalDateTime localDateTime56 = new org.joda.time.LocalDateTime(chronology55);
        org.joda.time.LocalDateTime localDateTime58 = localDateTime56.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime60 = localDateTime56.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime62 = localDateTime60.withMillisOfSecond((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime64 = localDateTime60.withMinuteOfHour(10);
        org.joda.time.Chronology chronology65 = null;
        org.joda.time.LocalDateTime localDateTime66 = new org.joda.time.LocalDateTime(chronology65);
        org.joda.time.LocalDateTime localDateTime68 = localDateTime66.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime70 = localDateTime66.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime72 = localDateTime66.withYearOfCentury(0);
        org.joda.time.LocalDateTime.Property property73 = localDateTime72.weekyear();
        org.joda.time.LocalDateTime localDateTime75 = localDateTime72.plusYears((int) (short) 1);
        int int76 = localDateTime64.compareTo((org.joda.time.ReadablePartial) localDateTime75);
        int int77 = localDateTime64.getMillisOfDay();
        org.joda.time.LocalDateTime localDateTime78 = localDateTime50.withFields((org.joda.time.ReadablePartial) localDateTime64);
        org.joda.time.Chronology chronology79 = null;
        org.joda.time.LocalDateTime localDateTime80 = new org.joda.time.LocalDateTime(chronology79);
        org.joda.time.LocalDateTime localDateTime82 = localDateTime80.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime.Property property83 = localDateTime82.weekOfWeekyear();
        java.lang.String str84 = property83.getAsText();
        org.joda.time.DateTimeFieldType dateTimeFieldType85 = property83.getFieldType();
        org.joda.time.LocalDateTime localDateTime86 = property83.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime87 = property83.roundFloorCopy();
        org.joda.time.LocalDateTime localDateTime89 = localDateTime87.plusWeeks(988);
        int int90 = localDateTime78.compareTo((org.joda.time.ReadablePartial) localDateTime87);
        org.joda.time.DateTimeFieldType dateTimeFieldType92 = localDateTime87.getFieldType(0);
        int int93 = localDateTime31.get(dateTimeFieldType92);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField28 and durationField37", (durationField28.compareTo(durationField37) == 0) == durationField28.equals(durationField37));
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test517");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.hourOfDay();
        org.joda.time.DurationField durationField3 = copticChronology1.eras();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology1.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology1.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology1.era();
        org.joda.time.DurationField durationField8 = copticChronology1.weeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField3, durationField8, and durationField3", !(durationField3.compareTo(durationField8) == 0) || (Math.signum(durationField3.compareTo(durationField3)) == Math.signum(durationField8.compareTo(durationField3))));
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test518");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = copticChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = copticChronology1.getZone();
        org.joda.time.DurationField durationField6 = copticChronology1.centuries();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology1.millisOfDay();
        org.joda.time.DurationField durationField9 = copticChronology1.seconds();
        org.joda.time.DateTimeZone dateTimeZone10 = copticChronology1.getZone();
        org.joda.time.DurationField durationField11 = copticChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField11, durationField3, and durationField6", !(durationField11.compareTo(durationField3) == 0) || (Math.signum(durationField11.compareTo(durationField6)) == Math.signum(durationField3.compareTo(durationField6))));
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test519");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.dayOfMonth();
        org.joda.time.DurationField durationField3 = copticChronology1.years();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology1.millisOfSecond();
        org.joda.time.DurationField durationField6 = dateTimeField5.getLeapDurationField();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.chrono.CopticChronology copticChronology8 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone7);
        org.joda.time.DateTimeField dateTimeField9 = copticChronology8.hourOfDay();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology8.centuryOfEra();
        org.joda.time.DurationField durationField11 = copticChronology8.millis();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology8.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.chrono.CopticChronology copticChronology14 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone13);
        org.joda.time.DateTimeField dateTimeField15 = copticChronology14.hourOfDay();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology14.centuryOfEra();
        org.joda.time.DurationField durationField17 = copticChronology14.millis();
        org.joda.time.DateTimeField dateTimeField18 = copticChronology14.weekOfWeekyear();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime(chronology19);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime20.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime20.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime20.plusWeeks((int) (byte) 10);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime(chronology27);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime28.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime28.withMillisOfSecond((int) (byte) 1);
        int int33 = localDateTime20.compareTo((org.joda.time.ReadablePartial) localDateTime28);
        org.joda.time.LocalDateTime.Property property34 = localDateTime28.weekyear();
        org.joda.time.LocalDateTime localDateTime36 = localDateTime28.minusMillis(2022);
        int[] intArray38 = copticChronology14.get((org.joda.time.ReadablePartial) localDateTime28, (long) '#');
        long long40 = copticChronology8.set((org.joda.time.ReadablePartial) localDateTime28, 32054400000L);
        int int41 = localDateTime28.getWeekOfWeekyear();
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.LocalDateTime localDateTime43 = new org.joda.time.LocalDateTime(chronology42);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray44 = localDateTime43.getFieldTypes();
        org.joda.time.LocalDateTime localDateTime46 = localDateTime43.plusMinutes(1);
        org.joda.time.LocalDateTime localDateTime48 = localDateTime46.minusHours((int) (byte) 10);
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.LocalDateTime localDateTime50 = new org.joda.time.LocalDateTime(chronology49);
        org.joda.time.LocalDateTime localDateTime52 = localDateTime50.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime54 = localDateTime50.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime56 = localDateTime50.withYearOfCentury(0);
        org.joda.time.LocalDateTime.Property property57 = localDateTime56.weekyear();
        org.joda.time.Interval interval58 = property57.toInterval();
        boolean boolean59 = property57.isLeap();
        org.joda.time.LocalDateTime localDateTime60 = property57.roundFloorCopy();
        boolean boolean61 = localDateTime48.equals((java.lang.Object) property57);
        int int62 = localDateTime48.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone63 = null;
        org.joda.time.chrono.CopticChronology copticChronology64 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone63);
        org.joda.time.DateTimeField dateTimeField65 = copticChronology64.clockhourOfDay();
        org.joda.time.DurationField durationField66 = copticChronology64.weekyears();
        org.joda.time.DateTimeField dateTimeField67 = copticChronology64.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField68 = copticChronology64.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField69 = copticChronology64.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone70 = copticChronology64.getZone();
        java.lang.String str72 = dateTimeZone70.getShortName(0L);
        int int74 = dateTimeZone70.getOffset(4346169777L);
        org.joda.time.DateTimeZone dateTimeZone75 = null;
        org.joda.time.chrono.CopticChronology copticChronology76 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone75);
        org.joda.time.DateTimeField dateTimeField77 = copticChronology76.clockhourOfDay();
        org.joda.time.DurationField durationField78 = copticChronology76.weekyears();
        org.joda.time.DateTimeField dateTimeField79 = copticChronology76.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone80 = copticChronology76.getZone();
        org.joda.time.LocalDateTime localDateTime81 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) copticChronology76);
        java.util.TimeZone timeZone82 = null;
        org.joda.time.DateTimeZone dateTimeZone83 = org.joda.time.DateTimeZone.forTimeZone(timeZone82);
        org.joda.time.Chronology chronology84 = copticChronology76.withZone(dateTimeZone83);
        long long86 = dateTimeZone70.getMillisKeepLocal(dateTimeZone83, (long) 761);
        long long89 = dateTimeZone83.adjustOffset(242L, true);
        long long92 = dateTimeZone83.adjustOffset(0L, false);
        org.joda.time.LocalDateTime localDateTime93 = org.joda.time.LocalDateTime.now(dateTimeZone83);
        boolean boolean94 = localDateTime48.isBefore((org.joda.time.ReadablePartial) localDateTime93);
        int[] intArray95 = localDateTime93.getValues();
        int int96 = dateTimeField5.getMaximumValue((org.joda.time.ReadablePartial) localDateTime28, intArray95);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField66", (durationField3.compareTo(durationField66) == 0) == durationField3.equals(durationField66));
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test520");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = copticChronology1.weekyears();
        org.joda.time.DurationField durationField4 = copticChronology1.hours();
        int int5 = copticChronology1.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField6 = copticChronology1.centuries();
        org.joda.time.DurationField durationField7 = copticChronology1.days();
        org.joda.time.DurationField durationField8 = copticChronology1.years();
        org.joda.time.DurationField durationField9 = copticChronology1.months();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField8", (durationField3.compareTo(durationField8) == 0) == durationField3.equals(durationField8));
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test521");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.CopticChronology copticChronology2 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology2.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology2.secondOfDay();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology2.secondOfDay();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) 10, (org.joda.time.Chronology) copticChronology2);
        org.joda.time.DurationField durationField7 = copticChronology2.eras();
        org.joda.time.DurationField durationField8 = copticChronology2.eras();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology2.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology2.yearOfCentury();
        org.joda.time.DurationField durationField11 = copticChronology2.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField7, durationField11, and durationField7", !(durationField7.compareTo(durationField11) == 0) || (Math.signum(durationField7.compareTo(durationField7)) == Math.signum(durationField11.compareTo(durationField7))));
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test522");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology1.centuryOfEra();
        org.joda.time.DurationField durationField4 = copticChronology1.millis();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology1.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone6);
        org.joda.time.DateTimeField dateTimeField8 = copticChronology7.hourOfDay();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology7.centuryOfEra();
        org.joda.time.DurationField durationField10 = copticChronology7.millis();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology7.weekOfWeekyear();
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
        org.joda.time.LocalDateTime localDateTime29 = localDateTime21.minusMillis(2022);
        int[] intArray31 = copticChronology7.get((org.joda.time.ReadablePartial) localDateTime21, (long) '#');
        long long33 = copticChronology1.set((org.joda.time.ReadablePartial) localDateTime21, 32054400000L);
        org.joda.time.DateTimeField dateTimeField34 = copticChronology1.weekyearOfCentury();
        org.joda.time.DurationField durationField35 = copticChronology1.years();
        java.lang.String str36 = copticChronology1.toString();
        org.joda.time.DateTimeField dateTimeField37 = copticChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField38 = copticChronology1.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField39 = copticChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField40 = copticChronology1.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.chrono.CopticChronology copticChronology43 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone42);
        org.joda.time.DateTimeField dateTimeField44 = copticChronology43.hourOfDay();
        org.joda.time.DateTimeField dateTimeField45 = copticChronology43.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField46 = copticChronology43.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime47 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) copticChronology43);
        org.joda.time.LocalDateTime localDateTime48 = new org.joda.time.LocalDateTime(10598109358471L, (org.joda.time.Chronology) copticChronology43);
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.LocalDateTime localDateTime50 = new org.joda.time.LocalDateTime(chronology49);
        org.joda.time.LocalDateTime localDateTime52 = localDateTime50.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime.Property property53 = localDateTime50.weekOfWeekyear();
        org.joda.time.ReadableDuration readableDuration54 = null;
        org.joda.time.LocalDateTime localDateTime56 = localDateTime50.withDurationAdded(readableDuration54, (int) '#');
        org.joda.time.LocalDateTime localDateTime58 = localDateTime50.plusMillis(30);
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
        org.joda.time.LocalDateTime.Property property75 = localDateTime68.millisOfDay();
        org.joda.time.LocalDateTime.Property property76 = localDateTime68.yearOfCentury();
        org.joda.time.DurationField durationField77 = property76.getRangeDurationField();
        org.joda.time.LocalDateTime localDateTime78 = property76.withMinimumValue();
        java.util.Locale locale79 = java.util.Locale.ENGLISH;
        int int80 = property76.getMaximumShortTextLength(locale79);
        org.joda.time.LocalDateTime localDateTime82 = property76.addToCopy(292272708);
        org.joda.time.DateTimeZone dateTimeZone83 = null;
        org.joda.time.chrono.CopticChronology copticChronology84 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone83);
        org.joda.time.DateTimeField dateTimeField85 = copticChronology84.clockhourOfDay();
        org.joda.time.DurationField durationField86 = copticChronology84.weekyears();
        org.joda.time.DateTimeField dateTimeField87 = copticChronology84.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone88 = copticChronology84.getZone();
        org.joda.time.LocalDateTime localDateTime89 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) copticChronology84);
        org.joda.time.DurationField durationField90 = copticChronology84.weekyears();
        org.joda.time.DateTimeField dateTimeField91 = copticChronology84.hourOfHalfday();
        org.joda.time.DateTimeFieldType dateTimeFieldType92 = dateTimeField91.getType();
        org.joda.time.LocalDateTime.Property property93 = localDateTime82.property(dateTimeFieldType92);
        int int94 = localDateTime50.get(dateTimeFieldType92);
        org.joda.time.LocalDateTime localDateTime96 = localDateTime48.withField(dateTimeFieldType92, 0);
        long long98 = copticChronology1.set((org.joda.time.ReadablePartial) localDateTime48, 99898059600149L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField35 and durationField86", (durationField35.compareTo(durationField86) == 0) == durationField35.equals(durationField86));
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test523");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology1.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology1.monthOfYear();
        int int5 = copticChronology1.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.yearOfEra();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology1.halfdayOfDay();
        org.joda.time.DurationField durationField8 = copticChronology1.eras();
        org.joda.time.Chronology chronology9 = copticChronology1.withUTC();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology1.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology1.year();
        org.joda.time.DurationField durationField13 = copticChronology1.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField8, durationField13, and durationField8", !(durationField8.compareTo(durationField13) == 0) || (Math.signum(durationField8.compareTo(durationField8)) == Math.signum(durationField13.compareTo(durationField8))));
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test524");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.hourOfDay();
        org.joda.time.DurationField durationField3 = copticChronology1.eras();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology1.millisOfDay();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(chronology5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime6.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.DateTime dateTime14 = localDateTime12.toDateTime(readableInstant13);
        java.util.Locale locale15 = java.util.Locale.GERMANY;
        boolean boolean16 = locale15.hasExtensions();
        boolean boolean17 = dateTime14.equals((java.lang.Object) locale15);
        org.joda.time.DateTimeZone dateTimeZone18 = dateTime14.getZone();
        org.joda.time.DateTimeZone dateTimeZone19 = dateTime14.getZone();
        org.joda.time.Chronology chronology20 = copticChronology1.withZone(dateTimeZone19);
        org.joda.time.DateTimeField dateTimeField21 = copticChronology1.era();
        org.joda.time.DateTimeZone dateTimeZone22 = copticChronology1.getZone();
        org.joda.time.DurationField durationField23 = copticChronology1.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField3, durationField23, and durationField3", !(durationField3.compareTo(durationField23) == 0) || (Math.signum(durationField3.compareTo(durationField3)) == Math.signum(durationField23.compareTo(durationField3))));
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test525");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.hourOfDay();
        org.joda.time.DurationField durationField3 = copticChronology1.eras();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology1.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology1.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone6 = copticChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology1.weekyear();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology1.weekOfWeekyear();
        org.joda.time.DurationField durationField9 = copticChronology1.eras();
        org.joda.time.DurationField durationField10 = copticChronology1.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField3, durationField10, and durationField3", !(durationField3.compareTo(durationField10) == 0) || (Math.signum(durationField3.compareTo(durationField3)) == Math.signum(durationField10.compareTo(durationField3))));
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test526");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.CopticChronology copticChronology2 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology2.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology2.secondOfDay();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology2.secondOfDay();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) 10, (org.joda.time.Chronology) copticChronology2);
        org.joda.time.DurationField durationField7 = copticChronology2.eras();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology2.year();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology2.yearOfCentury();
        java.lang.String str10 = copticChronology2.toString();
        org.joda.time.DurationField durationField11 = copticChronology2.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField7, durationField11, and durationField7", !(durationField7.compareTo(durationField11) == 0) || (Math.signum(durationField7.compareTo(durationField7)) == Math.signum(durationField11.compareTo(durationField7))));
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test527");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.CopticChronology copticChronology2 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology2.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology2.secondOfDay();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology2.secondOfDay();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) 10, (org.joda.time.Chronology) copticChronology2);
        org.joda.time.DurationField durationField7 = copticChronology2.eras();
        org.joda.time.DurationField durationField8 = copticChronology2.eras();
        long long12 = copticChronology2.add(4197160800000L, (long) 3, 25802001);
        org.joda.time.DurationField durationField13 = copticChronology2.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField7, durationField13, and durationField7", !(durationField7.compareTo(durationField13) == 0) || (Math.signum(durationField7.compareTo(durationField7)) == Math.signum(durationField13.compareTo(durationField7))));
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test528");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = copticChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = copticChronology1.getZone();
        org.joda.time.LocalDateTime localDateTime6 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) copticChronology1);
        org.joda.time.DurationField durationField7 = copticChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology1.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.chrono.CopticChronology copticChronology10 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField11 = copticChronology10.clockhourOfDay();
        org.joda.time.DurationField durationField12 = copticChronology10.weekyears();
        org.joda.time.DurationField durationField13 = copticChronology10.hours();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology10.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology10.dayOfMonth();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(chronology16);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime.Property property20 = localDateTime17.weekOfWeekyear();
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.LocalDateTime localDateTime23 = localDateTime17.withDurationAdded(readableDuration21, (int) '#');
        int int24 = dateTimeField15.getMaximumValue((org.joda.time.ReadablePartial) localDateTime17);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime17.plusHours(9806);
        int int27 = localDateTime26.size();
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.chrono.CopticChronology copticChronology30 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone29);
        org.joda.time.DateTimeField dateTimeField31 = copticChronology30.hourOfDay();
        org.joda.time.DateTimeField dateTimeField32 = copticChronology30.secondOfDay();
        org.joda.time.DurationField durationField33 = copticChronology30.years();
        org.joda.time.DurationField durationField34 = copticChronology30.centuries();
        org.joda.time.DateTimeField dateTimeField35 = copticChronology30.yearOfEra();
        org.joda.time.DateTimeField dateTimeField36 = copticChronology30.weekOfWeekyear();
        java.util.Locale.Category category37 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale38 = java.util.Locale.CHINA;
        java.util.Locale.setDefault(category37, locale38);
        java.util.Locale locale40 = java.util.Locale.getDefault(category37);
        java.lang.String str41 = locale40.getDisplayVariant();
        java.util.Set<java.lang.String> strSet42 = locale40.getUnicodeLocaleAttributes();
        int int43 = dateTimeField36.getMaximumShortTextLength(locale40);
        java.lang.String str44 = dateTimeField8.getAsShortText((org.joda.time.ReadablePartial) localDateTime26, 545, locale40);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField33", (durationField3.compareTo(durationField33) == 0) == durationField3.equals(durationField33));
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test529");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology1.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.Chronology chronology5 = copticChronology1.withZone(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology1.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone8 = copticChronology1.getZone();
        long long12 = copticChronology1.add((long) 15, (-3600001L), 2);
        org.joda.time.DateTimeField dateTimeField13 = copticChronology1.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology1.monthOfYear();
        org.joda.time.DurationField durationField15 = copticChronology1.weeks();
        org.joda.time.DurationField durationField16 = copticChronology1.halfdays();
        org.joda.time.DurationField durationField17 = copticChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField17, durationField15, and durationField16", !(durationField17.compareTo(durationField15) == 0) || (Math.signum(durationField17.compareTo(durationField16)) == Math.signum(durationField15.compareTo(durationField16))));
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test530");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology1.dayOfMonth();
        org.joda.time.DurationField durationField4 = copticChronology1.weeks();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.chrono.CopticChronology copticChronology6 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone5);
        org.joda.time.DateTimeField dateTimeField7 = copticChronology6.hourOfDay();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology6.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.Chronology chronology10 = copticChronology6.withZone(dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField11 = copticChronology6.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology6.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology6.year();
        org.joda.time.DateTimeZone dateTimeZone14 = copticChronology6.getZone();
        org.joda.time.Chronology chronology15 = copticChronology1.withZone(dateTimeZone14);
        org.joda.time.DateTimeField dateTimeField16 = copticChronology1.year();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.chrono.CopticChronology copticChronology18 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone17);
        org.joda.time.DateTimeField dateTimeField19 = copticChronology18.clockhourOfDay();
        org.joda.time.DurationField durationField20 = copticChronology18.weekyears();
        org.joda.time.DateTimeField dateTimeField21 = copticChronology18.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone22 = copticChronology18.getZone();
        org.joda.time.LocalDateTime localDateTime23 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) copticChronology18);
        org.joda.time.DurationField durationField24 = copticChronology18.weekyears();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime(chronology25);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime26.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime26.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime.Property property31 = localDateTime30.dayOfWeek();
        int[] intArray33 = copticChronology18.get((org.joda.time.ReadablePartial) localDateTime30, 0L);
        org.joda.time.DateTimeField dateTimeField34 = copticChronology18.dayOfWeek();
        org.joda.time.DurationField durationField35 = copticChronology18.minutes();
        org.joda.time.DateTimeField dateTimeField36 = copticChronology18.dayOfYear();
        java.util.TimeZone timeZone38 = null;
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.forTimeZone(timeZone38);
        java.lang.String str41 = dateTimeZone39.getNameKey((long) (byte) 0);
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime((long) 717, dateTimeZone39);
        org.joda.time.LocalDateTime localDateTime44 = localDateTime42.plusDays(54);
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
        org.joda.time.Chronology chronology59 = localDateTime57.getChronology();
        int[] intArray60 = localDateTime57.getValues();
        copticChronology18.validate((org.joda.time.ReadablePartial) localDateTime44, intArray60);
        long long63 = copticChronology1.set((org.joda.time.ReadablePartial) localDateTime44, 4658400000L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField56", (durationField4.compareTo(durationField56) == 0) == durationField4.equals(durationField56));
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test531");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = copticChronology1.weekyears();
        org.joda.time.DurationField durationField4 = copticChronology1.hours();
        int int5 = copticChronology1.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.monthOfYear();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology1.dayOfMonth();
        java.lang.String str8 = copticChronology1.toString();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        long long12 = copticChronology1.add(readablePeriod9, (long) 'a', (-292269338));
        org.joda.time.DurationField durationField13 = copticChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField13, durationField3, and durationField4", !(durationField13.compareTo(durationField3) == 0) || (Math.signum(durationField13.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test532");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology1.secondOfDay();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology1.secondOfDay();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology1.yearOfCentury();
        org.joda.time.DurationField durationField6 = copticChronology1.eras();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology1.millisOfDay();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology1.year();
        org.joda.time.DateTimeZone dateTimeZone9 = copticChronology1.getZone();
        long long13 = copticChronology1.add((long) 173, (long) 17, 29);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime(chronology14);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime15.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime15.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.DateTime dateTime23 = localDateTime21.toDateTime(readableInstant22);
        org.joda.time.LocalDateTime.Property property24 = localDateTime21.millisOfDay();
        org.joda.time.Interval interval25 = property24.toInterval();
        org.joda.time.DurationField durationField26 = property24.getDurationField();
        org.joda.time.LocalDateTime localDateTime28 = property24.addWrapFieldToCopy(25802001);
        java.lang.String str29 = property24.toString();
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.chrono.CopticChronology copticChronology31 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone30);
        org.joda.time.DateTimeField dateTimeField32 = copticChronology31.clockhourOfDay();
        org.joda.time.DurationField durationField33 = copticChronology31.weekyears();
        org.joda.time.DurationField durationField34 = copticChronology31.centuries();
        org.joda.time.DateTimeField dateTimeField35 = copticChronology31.weekyear();
        int int36 = dateTimeField35.getMinimumValue();
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.LocalDateTime localDateTime38 = new org.joda.time.LocalDateTime(chronology37);
        org.joda.time.LocalDateTime localDateTime40 = localDateTime38.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime42 = localDateTime38.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime44 = localDateTime38.plusWeeks((int) (byte) 10);
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.LocalDateTime localDateTime46 = new org.joda.time.LocalDateTime(chronology45);
        org.joda.time.LocalDateTime localDateTime48 = localDateTime46.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime50 = localDateTime46.withMillisOfSecond((int) (byte) 1);
        int int51 = localDateTime38.compareTo((org.joda.time.ReadablePartial) localDateTime46);
        org.joda.time.LocalDateTime.Property property52 = localDateTime46.weekyear();
        org.joda.time.LocalDateTime.Property property53 = localDateTime46.millisOfDay();
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.LocalDateTime localDateTime55 = new org.joda.time.LocalDateTime(chronology54);
        org.joda.time.LocalDateTime localDateTime57 = localDateTime55.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime59 = localDateTime55.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime61 = localDateTime55.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant62 = null;
        org.joda.time.DateTime dateTime63 = localDateTime61.toDateTime(readableInstant62);
        java.util.Locale locale64 = java.util.Locale.GERMANY;
        boolean boolean65 = locale64.hasExtensions();
        boolean boolean66 = dateTime63.equals((java.lang.Object) locale64);
        java.lang.String str67 = dateTimeField35.getAsShortText((org.joda.time.ReadablePartial) localDateTime46, locale64);
        java.lang.String str68 = locale64.getDisplayCountry();
        java.lang.String str69 = locale64.getLanguage();
        java.lang.String str70 = locale64.getDisplayName();
        java.lang.String str71 = locale64.getLanguage();
        java.lang.String str72 = locale64.toLanguageTag();
        java.util.Locale locale73 = locale64.stripExtensions();
        java.lang.String str74 = locale64.getScript();
        int int75 = property24.getMaximumShortTextLength(locale64);
        org.joda.time.LocalDateTime localDateTime77 = property24.setCopy("3");
        org.joda.time.LocalDateTime.Property property78 = localDateTime77.yearOfEra();
        int int79 = localDateTime77.getYearOfEra();
        int[] intArray81 = copticChronology1.get((org.joda.time.ReadablePartial) localDateTime77, 843000L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField6 and durationField26", Math.signum(durationField6.compareTo(durationField26)) == -Math.signum(durationField26.compareTo(durationField6)));
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test533");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.chrono.CopticChronology copticChronology3 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = copticChronology3.hourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology3.secondOfDay();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology3.secondOfDay();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((long) 10, (org.joda.time.Chronology) copticChronology3);
        org.joda.time.DurationField durationField8 = copticChronology3.eras();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology3.year();
        org.joda.time.DateTimeZone dateTimeZone10 = copticChronology3.getZone();
        org.joda.time.LocalDateTime localDateTime11 = null;
        boolean boolean12 = dateTimeZone10.isLocalDateTimeGap(localDateTime11);
        int int14 = dateTimeZone10.getStandardOffset((long) 132);
        int int16 = dateTimeZone10.getStandardOffset(112L);
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(311040000000500L, dateTimeZone10);
        java.lang.String str19 = dateTimeZone10.getName(10499008678361L);
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.LocalDateTime localDateTime22 = localDateTime20.minus(readableDuration21);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 10);
        long long26 = dateTimeZone24.convertUTCToLocal((long) (short) 1);
        long long29 = dateTimeZone24.adjustOffset((long) 984, true);
        java.util.Locale locale31 = null;
        java.lang.String str32 = dateTimeZone24.getName((long) 242, locale31);
        org.joda.time.DateTime dateTime33 = localDateTime20.toDateTime(dateTimeZone24);
        org.joda.time.Instant instant34 = dateTime33.toInstant();
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.LocalDateTime localDateTime36 = new org.joda.time.LocalDateTime(chronology35);
        org.joda.time.LocalDateTime localDateTime38 = localDateTime36.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime40 = localDateTime36.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime42 = localDateTime36.withYearOfCentury(0);
        org.joda.time.LocalDateTime.Property property43 = localDateTime42.weekyear();
        org.joda.time.Interval interval44 = property43.toInterval();
        boolean boolean45 = property43.isLeap();
        org.joda.time.LocalDateTime localDateTime46 = property43.roundFloorCopy();
        org.joda.time.LocalDateTime localDateTime47 = property43.roundHalfEvenCopy();
        boolean boolean48 = instant34.equals((java.lang.Object) property43);
        int int49 = dateTimeZone10.getOffset((org.joda.time.ReadableInstant) instant34);
        long long51 = dateTimeZone10.previousTransition(10598109618114L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime33 and instant34", (dateTime33.compareTo(instant34) == 0) == dateTime33.equals(instant34));
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test534");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.minus(readableDuration1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 10);
        long long6 = dateTimeZone4.convertUTCToLocal((long) (short) 1);
        long long9 = dateTimeZone4.adjustOffset((long) 984, true);
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone4.getName((long) 242, locale11);
        org.joda.time.DateTime dateTime13 = localDateTime0.toDateTime(dateTimeZone4);
        org.joda.time.Instant instant14 = dateTime13.toInstant();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(chronology15);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime16.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime16.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.DateTime dateTime24 = localDateTime22.toDateTime(readableInstant23);
        java.util.Locale locale25 = java.util.Locale.GERMANY;
        boolean boolean26 = locale25.hasExtensions();
        boolean boolean27 = dateTime24.equals((java.lang.Object) locale25);
        java.util.Locale.LanguageRange[] languageRangeArray28 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList29 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList29, languageRangeArray28);
        java.util.Collection<java.lang.String> strCollection31 = null;
        java.util.List<java.lang.String> strList32 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList29, strCollection31);
        java.util.Collection<java.lang.String> strCollection33 = null;
        java.util.List<java.lang.String> strList34 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList29, strCollection33);
        java.util.Locale.LanguageRange[] languageRangeArray35 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList36 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList36, languageRangeArray35);
        java.util.Collection<java.lang.String> strCollection38 = null;
        java.util.List<java.lang.String> strList39 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList36, strCollection38);
        java.util.Collection<java.lang.String> strCollection40 = null;
        java.util.List<java.lang.String> strList41 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList36, strCollection40);
        java.util.Locale.FilteringMode filteringMode42 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList43 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList29, strCollection40, filteringMode42);
        boolean boolean44 = dateTime24.equals((java.lang.Object) languageRangeList29);
        org.joda.time.Instant instant45 = dateTime24.toInstant();
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.chrono.CopticChronology copticChronology47 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone46);
        org.joda.time.DateTimeField dateTimeField48 = copticChronology47.hourOfDay();
        org.joda.time.DateTimeField dateTimeField49 = copticChronology47.centuryOfEra();
        org.joda.time.DurationField durationField50 = copticChronology47.millis();
        org.joda.time.DateTimeField dateTimeField51 = copticChronology47.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField52 = copticChronology47.clockhourOfDay();
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
        int int66 = dateTimeField52.getMaximumValue((org.joda.time.ReadablePartial) localDateTime63);
        org.joda.time.DateTime dateTime67 = localDateTime63.toDateTime();
        int int68 = instant45.compareTo((org.joda.time.ReadableInstant) dateTime67);
        boolean boolean69 = instant14.isAfter((org.joda.time.ReadableInstant) instant45);
        org.joda.time.ReadableInstant readableInstant70 = null;
        boolean boolean71 = instant14.isAfter(readableInstant70);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime24 and instant45", (dateTime24.compareTo(instant45) == 0) == dateTime24.equals(instant45));
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test535");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.hourOfDay();
        org.joda.time.DurationField durationField3 = copticChronology1.eras();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology1.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology1.hourOfHalfday();
        org.joda.time.DurationField durationField6 = copticChronology1.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField3, durationField6, and durationField3", !(durationField3.compareTo(durationField6) == 0) || (Math.signum(durationField3.compareTo(durationField3)) == Math.signum(durationField6.compareTo(durationField3))));
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test536");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology1.centuryOfEra();
        org.joda.time.DurationField durationField4 = copticChronology1.millis();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology1.weekOfWeekyear();
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
        org.joda.time.LocalDateTime localDateTime23 = localDateTime15.minusMillis(2022);
        int[] intArray25 = copticChronology1.get((org.joda.time.ReadablePartial) localDateTime15, (long) '#');
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        long long29 = copticChronology1.add(readablePeriod26, 4346143961L, 984);
        org.joda.time.DateTimeField dateTimeField30 = copticChronology1.year();
        org.joda.time.DateTimeField dateTimeField31 = copticChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField32 = copticChronology1.eras();
        org.joda.time.DateTimeField dateTimeField33 = copticChronology1.dayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField4 and durationField32", Math.signum(durationField4.compareTo(durationField32)) == -Math.signum(durationField32.compareTo(durationField4)));
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test537");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.CopticChronology copticChronology2 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology2.hourOfDay();
        org.joda.time.DurationField durationField4 = copticChronology2.eras();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology2.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology2.millisOfSecond();
        java.lang.String str7 = copticChronology2.toString();
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((-30829079975L), (org.joda.time.Chronology) copticChronology2);
        org.joda.time.DurationField durationField9 = copticChronology2.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField4, durationField9, and durationField4", !(durationField4.compareTo(durationField9) == 0) || (Math.signum(durationField4.compareTo(durationField4)) == Math.signum(durationField9.compareTo(durationField4))));
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test538");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale.Category category2 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale3 = java.util.Locale.getDefault(category2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.chrono.CopticChronology copticChronology5 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField6 = copticChronology5.hourOfDay();
        org.joda.time.DurationField durationField7 = copticChronology5.eras();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology5.weekOfWeekyear();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime(chronology9);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.weekOfWeekyear();
        int int14 = localDateTime12.getYear();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.chrono.CopticChronology copticChronology16 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField17 = copticChronology16.dayOfMonth();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime(chronology18);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime19.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime19.plusWeeks((int) (byte) 10);
        java.util.Locale locale26 = java.util.Locale.PRC;
        java.lang.String str27 = dateTimeField17.getAsText((org.joda.time.ReadablePartial) localDateTime25, locale26);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime(chronology28);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime29.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime29.withMillisOfSecond((int) (byte) 1);
        java.util.Locale locale35 = java.util.Locale.JAPAN;
        java.lang.String str36 = dateTimeField17.getAsText((org.joda.time.ReadablePartial) localDateTime29, 2022, locale35);
        java.lang.String str37 = dateTimeField8.getAsShortText((org.joda.time.ReadablePartial) localDateTime12, locale35);
        java.util.Locale.setDefault(category2, locale35);
        java.lang.String str39 = locale35.getDisplayCountry();
        java.util.Locale.setDefault(category0, locale35);
        java.util.Locale locale41 = java.util.Locale.getDefault(category0);
        java.util.Locale locale42 = java.util.Locale.getDefault(category0);
        java.util.Locale locale43 = java.util.Locale.getDefault(category0);
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.chrono.CopticChronology copticChronology45 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone44);
        org.joda.time.DateTimeField dateTimeField46 = copticChronology45.hourOfDay();
        org.joda.time.DateTimeField dateTimeField47 = copticChronology45.centuryOfEra();
        org.joda.time.DurationField durationField48 = copticChronology45.millis();
        org.joda.time.DateTimeField dateTimeField49 = copticChronology45.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField50 = copticChronology45.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField51 = copticChronology45.centuryOfEra();
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.LocalDateTime localDateTime53 = new org.joda.time.LocalDateTime(chronology52);
        org.joda.time.LocalDateTime localDateTime55 = localDateTime53.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime57 = localDateTime55.minusHours(666);
        org.joda.time.DateTimeZone dateTimeZone58 = null;
        org.joda.time.chrono.CopticChronology copticChronology59 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone58);
        org.joda.time.DateTimeField dateTimeField60 = copticChronology59.clockhourOfDay();
        org.joda.time.DurationField durationField61 = copticChronology59.weekyears();
        org.joda.time.DateTimeField dateTimeField62 = copticChronology59.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone63 = copticChronology59.getZone();
        org.joda.time.DurationField durationField64 = copticChronology59.centuries();
        org.joda.time.DateTimeField dateTimeField65 = copticChronology59.hourOfHalfday();
        org.joda.time.Chronology chronology67 = null;
        org.joda.time.LocalDateTime localDateTime68 = new org.joda.time.LocalDateTime(chronology67);
        org.joda.time.LocalDateTime localDateTime70 = localDateTime68.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime72 = localDateTime68.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime74 = localDateTime68.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant75 = null;
        org.joda.time.DateTime dateTime76 = localDateTime74.toDateTime(readableInstant75);
        org.joda.time.LocalDateTime.Property property77 = localDateTime74.millisOfDay();
        org.joda.time.LocalDateTime localDateTime78 = property77.withMaximumValue();
        java.util.Locale locale79 = java.util.Locale.GERMANY;
        java.lang.String str80 = locale79.getScript();
        org.joda.time.DateTimeZone dateTimeZone81 = null;
        org.joda.time.chrono.CopticChronology copticChronology82 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone81);
        org.joda.time.DateTimeField dateTimeField83 = copticChronology82.clockhourOfDay();
        java.util.Locale locale85 = java.util.Locale.ITALIAN;
        java.lang.String str86 = dateTimeField83.getAsText((long) 'a', locale85);
        java.lang.String str87 = locale79.getDisplayName(locale85);
        java.lang.String str88 = property77.getAsShortText(locale79);
        java.lang.String str89 = dateTimeField65.getAsShortText(54, locale79);
        java.lang.String str90 = dateTimeField51.getAsText((org.joda.time.ReadablePartial) localDateTime57, locale79);
        java.util.Locale.setDefault(category0, locale79);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField7 and durationField48", Math.signum(durationField7.compareTo(durationField48)) == -Math.signum(durationField48.compareTo(durationField7)));
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test539");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.CopticChronology copticChronology2 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology2.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology2.secondOfDay();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology2.secondOfDay();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) 10, (org.joda.time.Chronology) copticChronology2);
        org.joda.time.DurationField durationField7 = copticChronology2.eras();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology2.year();
        org.joda.time.DateTimeZone dateTimeZone9 = copticChronology2.getZone();
        org.joda.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = dateTimeZone9.isLocalDateTimeGap(localDateTime10);
        org.joda.time.chrono.CopticChronology copticChronology12 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone9);
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
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.LocalDateTime localDateTime44 = new org.joda.time.LocalDateTime(chronology43);
        org.joda.time.LocalDateTime localDateTime46 = localDateTime44.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime.Property property47 = localDateTime46.weekOfWeekyear();
        org.joda.time.LocalDateTime.Property property48 = localDateTime46.centuryOfEra();
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.LocalDateTime localDateTime50 = new org.joda.time.LocalDateTime(chronology49);
        org.joda.time.LocalDateTime localDateTime52 = localDateTime50.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime54 = localDateTime50.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime56 = localDateTime50.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant57 = null;
        org.joda.time.DateTime dateTime58 = localDateTime56.toDateTime(readableInstant57);
        java.util.Locale locale59 = java.util.Locale.GERMANY;
        boolean boolean60 = locale59.hasExtensions();
        boolean boolean61 = dateTime58.equals((java.lang.Object) locale59);
        int int62 = property48.getDifference((org.joda.time.ReadableInstant) dateTime58);
        int int63 = dateTime22.compareTo((org.joda.time.ReadableInstant) dateTime58);
        long long64 = dateTime58.getMillis();
        org.joda.time.Instant instant65 = dateTime58.toInstant();
        int int66 = dateTimeZone9.getOffset((org.joda.time.ReadableInstant) dateTime58);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime22 and instant65", (dateTime22.compareTo(instant65) == 0) == dateTime22.equals(instant65));
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test540");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology1.centuryOfEra();
        org.joda.time.DurationField durationField4 = copticChronology1.millis();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology1.weekOfWeekyear();
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
        org.joda.time.LocalDateTime localDateTime23 = localDateTime15.minusMillis(2022);
        int[] intArray25 = copticChronology1.get((org.joda.time.ReadablePartial) localDateTime15, (long) '#');
        org.joda.time.DateTimeField dateTimeField26 = copticChronology1.yearOfEra();
        org.joda.time.DateTimeField dateTimeField27 = copticChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField28 = copticChronology1.minuteOfHour();
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime(chronology29);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime30.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime32.minusHours(11);
        int int35 = localDateTime34.getWeekyear();
        java.lang.String str36 = localDateTime34.toString();
        org.joda.time.ReadableDuration readableDuration37 = null;
        org.joda.time.LocalDateTime localDateTime38 = localDateTime34.minus(readableDuration37);
        java.util.Locale.Category category39 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale40 = java.util.Locale.getDefault(category39);
        java.util.Locale.Category category41 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale42 = java.util.Locale.getDefault(category41);
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.chrono.CopticChronology copticChronology44 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone43);
        org.joda.time.DateTimeField dateTimeField45 = copticChronology44.hourOfDay();
        org.joda.time.DurationField durationField46 = copticChronology44.eras();
        org.joda.time.DateTimeField dateTimeField47 = copticChronology44.weekOfWeekyear();
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.LocalDateTime localDateTime49 = new org.joda.time.LocalDateTime(chronology48);
        org.joda.time.LocalDateTime localDateTime51 = localDateTime49.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime.Property property52 = localDateTime51.weekOfWeekyear();
        int int53 = localDateTime51.getYear();
        org.joda.time.DateTimeZone dateTimeZone54 = null;
        org.joda.time.chrono.CopticChronology copticChronology55 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone54);
        org.joda.time.DateTimeField dateTimeField56 = copticChronology55.dayOfMonth();
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.LocalDateTime localDateTime58 = new org.joda.time.LocalDateTime(chronology57);
        org.joda.time.LocalDateTime localDateTime60 = localDateTime58.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime62 = localDateTime58.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime64 = localDateTime58.plusWeeks((int) (byte) 10);
        java.util.Locale locale65 = java.util.Locale.PRC;
        java.lang.String str66 = dateTimeField56.getAsText((org.joda.time.ReadablePartial) localDateTime64, locale65);
        org.joda.time.Chronology chronology67 = null;
        org.joda.time.LocalDateTime localDateTime68 = new org.joda.time.LocalDateTime(chronology67);
        org.joda.time.LocalDateTime localDateTime70 = localDateTime68.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime72 = localDateTime68.withMillisOfSecond((int) (byte) 1);
        java.util.Locale locale74 = java.util.Locale.JAPAN;
        java.lang.String str75 = dateTimeField56.getAsText((org.joda.time.ReadablePartial) localDateTime68, 2022, locale74);
        java.lang.String str76 = dateTimeField47.getAsShortText((org.joda.time.ReadablePartial) localDateTime51, locale74);
        java.util.Locale.setDefault(category41, locale74);
        java.lang.String str78 = locale74.getDisplayCountry();
        java.util.Locale.setDefault(category39, locale74);
        java.lang.String str80 = dateTimeField28.getAsText((org.joda.time.ReadablePartial) localDateTime38, locale74);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField4 and durationField46", Math.signum(durationField4.compareTo(durationField46)) == -Math.signum(durationField46.compareTo(durationField4)));
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test541");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.CopticChronology copticChronology2 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology2.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology2.secondOfDay();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology2.secondOfDay();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) 10, (org.joda.time.Chronology) copticChronology2);
        org.joda.time.DurationField durationField7 = copticChronology2.eras();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology2.year();
        org.joda.time.DateTimeZone dateTimeZone9 = copticChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology2.weekOfWeekyear();
        org.joda.time.Chronology chronology11 = copticChronology2.withUTC();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        long long15 = copticChronology2.add(readablePeriod12, 26220008L, 770);
        org.joda.time.DurationField durationField16 = copticChronology2.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField7, durationField16, and durationField7", !(durationField7.compareTo(durationField16) == 0) || (Math.signum(durationField7.compareTo(durationField7)) == Math.signum(durationField16.compareTo(durationField7))));
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test542");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology1.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology1.monthOfYear();
        int int5 = copticChronology1.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.yearOfEra();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology1.halfdayOfDay();
        org.joda.time.DurationField durationField8 = copticChronology1.eras();
        org.joda.time.DateTimeZone dateTimeZone9 = copticChronology1.getZone();
        org.joda.time.DurationField durationField10 = copticChronology1.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField8, durationField10, and durationField8", !(durationField8.compareTo(durationField10) == 0) || (Math.signum(durationField8.compareTo(durationField8)) == Math.signum(durationField10.compareTo(durationField8))));
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test543");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.DateTime dateTime9 = localDateTime7.toDateTime(readableInstant8);
        org.joda.time.LocalDateTime.Property property10 = localDateTime7.millisOfDay();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime7.plusMonths((int) '4');
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.chrono.CopticChronology copticChronology14 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone13);
        org.joda.time.DateTimeField dateTimeField15 = copticChronology14.clockhourOfDay();
        org.joda.time.DurationField durationField16 = copticChronology14.months();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.Chronology chronology18 = copticChronology14.withZone(dateTimeZone17);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.chrono.CopticChronology copticChronology20 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone19);
        org.joda.time.DateTimeField dateTimeField21 = copticChronology20.clockhourOfDay();
        org.joda.time.DurationField durationField22 = copticChronology20.weekyears();
        org.joda.time.DateTimeField dateTimeField23 = copticChronology20.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone24 = copticChronology20.getZone();
        org.joda.time.LocalDateTime localDateTime25 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) copticChronology20);
        org.joda.time.DurationField durationField26 = copticChronology20.weekyears();
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime(chronology27);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime28.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime28.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime.Property property33 = localDateTime32.dayOfWeek();
        int[] intArray35 = copticChronology20.get((org.joda.time.ReadablePartial) localDateTime32, 0L);
        org.joda.time.DurationField durationField36 = copticChronology20.minutes();
        org.joda.time.Chronology chronology37 = copticChronology20.withUTC();
        boolean boolean38 = copticChronology14.equals((java.lang.Object) copticChronology20);
        org.joda.time.LocalDateTime localDateTime39 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime12, (org.joda.time.Chronology) copticChronology20);
        org.joda.time.DurationField durationField40 = copticChronology20.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on localDateTime12 and localDateTime39", (localDateTime12.compareTo(localDateTime39) == 0) == localDateTime12.equals(localDateTime39));
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test544");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.CopticChronology copticChronology2 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology2.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology2.secondOfDay();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology2.secondOfDay();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) 10, (org.joda.time.Chronology) copticChronology2);
        org.joda.time.DurationField durationField7 = copticChronology2.eras();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology2.year();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology2.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology2.weekyear();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology2.dayOfMonth();
        org.joda.time.DurationField durationField12 = copticChronology2.years();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField7, durationField12, and durationField7", !(durationField7.compareTo(durationField12) == 0) || (Math.signum(durationField7.compareTo(durationField7)) == Math.signum(durationField12.compareTo(durationField7))));
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test545");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.DateTime dateTime9 = localDateTime7.toDateTime(readableInstant8);
        org.joda.time.LocalDateTime.Property property10 = localDateTime7.millisOfDay();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime7.plusMonths((int) '4');
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.chrono.CopticChronology copticChronology14 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone13);
        org.joda.time.DateTimeField dateTimeField15 = copticChronology14.clockhourOfDay();
        org.joda.time.DurationField durationField16 = copticChronology14.months();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.Chronology chronology18 = copticChronology14.withZone(dateTimeZone17);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.chrono.CopticChronology copticChronology20 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone19);
        org.joda.time.DateTimeField dateTimeField21 = copticChronology20.clockhourOfDay();
        org.joda.time.DurationField durationField22 = copticChronology20.weekyears();
        org.joda.time.DateTimeField dateTimeField23 = copticChronology20.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone24 = copticChronology20.getZone();
        org.joda.time.LocalDateTime localDateTime25 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) copticChronology20);
        org.joda.time.DurationField durationField26 = copticChronology20.weekyears();
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime(chronology27);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime28.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime28.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime.Property property33 = localDateTime32.dayOfWeek();
        int[] intArray35 = copticChronology20.get((org.joda.time.ReadablePartial) localDateTime32, 0L);
        org.joda.time.DurationField durationField36 = copticChronology20.minutes();
        org.joda.time.Chronology chronology37 = copticChronology20.withUTC();
        boolean boolean38 = copticChronology14.equals((java.lang.Object) copticChronology20);
        org.joda.time.LocalDateTime localDateTime39 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime12, (org.joda.time.Chronology) copticChronology20);
        org.joda.time.DurationField durationField40 = copticChronology20.years();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on localDateTime12 and localDateTime39", (localDateTime12.compareTo(localDateTime39) == 0) == localDateTime12.equals(localDateTime39));
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test546");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = copticChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = copticChronology1.getZone();
        org.joda.time.LocalDateTime localDateTime6 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) copticChronology1);
        org.joda.time.DurationField durationField7 = copticChronology1.weekyears();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(chronology8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime9.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.dayOfWeek();
        int[] intArray16 = copticChronology1.get((org.joda.time.ReadablePartial) localDateTime13, 0L);
        org.joda.time.DateTimeField dateTimeField17 = copticChronology1.dayOfWeek();
        org.joda.time.DurationField durationField18 = copticChronology1.minutes();
        org.joda.time.DateTimeField dateTimeField19 = copticChronology1.weekyearOfCentury();
        org.joda.time.DurationField durationField20 = copticChronology1.millis();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.chrono.CopticChronology copticChronology22 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone21);
        org.joda.time.DateTimeField dateTimeField23 = copticChronology22.hourOfDay();
        org.joda.time.DateTimeField dateTimeField24 = copticChronology22.secondOfDay();
        org.joda.time.DateTimeField dateTimeField25 = copticChronology22.secondOfDay();
        org.joda.time.DurationField durationField26 = copticChronology22.years();
        org.joda.time.DateTimeField dateTimeField27 = copticChronology22.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField28 = copticChronology22.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField29 = copticChronology22.secondOfDay();
        org.joda.time.DateTimeField dateTimeField30 = copticChronology22.clockhourOfHalfday();
        org.joda.time.DurationField durationField31 = copticChronology22.eras();
        int int32 = durationField20.compareTo(durationField31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField26", (durationField3.compareTo(durationField26) == 0) == durationField3.equals(durationField26));
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test547");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology1.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.Chronology chronology5 = copticChronology1.withZone(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.era();
        org.joda.time.DurationField durationField7 = copticChronology1.seconds();
        org.joda.time.DurationField durationField8 = copticChronology1.halfdays();
        org.joda.time.DurationField durationField9 = copticChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField7, and durationField8", !(durationField9.compareTo(durationField7) == 0) || (Math.signum(durationField9.compareTo(durationField8)) == Math.signum(durationField7.compareTo(durationField8))));
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test548");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.dayOfMonth();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime(chronology3);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime4.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime4.plusWeeks((int) (byte) 10);
        java.util.Locale locale11 = java.util.Locale.PRC;
        java.lang.String str12 = dateTimeField2.getAsText((org.joda.time.ReadablePartial) localDateTime10, locale11);
        java.util.Set<java.lang.String> strSet13 = locale11.getUnicodeLocaleKeys();
        java.lang.Object[] objArray14 = strSet13.toArray();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.chrono.CopticChronology copticChronology16 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField17 = copticChronology16.clockhourOfDay();
        org.joda.time.DurationField durationField18 = copticChronology16.weekyears();
        org.joda.time.DurationField durationField19 = copticChronology16.weekyears();
        boolean boolean20 = strSet13.equals((java.lang.Object) copticChronology16);
        org.joda.time.DateTimeField dateTimeField21 = copticChronology16.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField22 = copticChronology16.weekyear();
        org.joda.time.DurationField durationField23 = copticChronology16.years();
        org.joda.time.DateTimeField dateTimeField24 = copticChronology16.dayOfWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField18 and durationField23", (durationField18.compareTo(durationField23) == 0) == durationField18.equals(durationField23));
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test549");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.CopticChronology copticChronology2 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology2.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology2.secondOfDay();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology2.secondOfDay();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) 10, (org.joda.time.Chronology) copticChronology2);
        org.joda.time.DurationField durationField7 = copticChronology2.eras();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology2.year();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology2.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology2.weekyear();
        org.joda.time.DurationField durationField11 = copticChronology2.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField7, durationField11, and durationField7", !(durationField7.compareTo(durationField11) == 0) || (Math.signum(durationField7.compareTo(durationField7)) == Math.signum(durationField11.compareTo(durationField7))));
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test550");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology1.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.Chronology chronology5 = copticChronology1.withZone(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology1.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology1.year();
        org.joda.time.DateTimeZone dateTimeZone9 = copticChronology1.getZone();
        org.joda.time.DurationField durationField10 = copticChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology1.year();
        org.joda.time.DurationField durationField12 = copticChronology1.minutes();
        org.joda.time.DurationField durationField13 = copticChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField13, durationField10, and durationField12", !(durationField13.compareTo(durationField10) == 0) || (Math.signum(durationField13.compareTo(durationField12)) == Math.signum(durationField10.compareTo(durationField12))));
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test551");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.CopticChronology copticChronology2 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology2.clockhourOfDay();
        org.joda.time.DurationField durationField4 = copticChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology2.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone6 = copticChronology2.getZone();
        org.joda.time.LocalDateTime localDateTime7 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) copticChronology2);
        org.joda.time.DurationField durationField8 = copticChronology2.weekyears();
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(4346159663L, (org.joda.time.Chronology) copticChronology2);
        org.joda.time.DurationField durationField10 = copticChronology2.minutes();
        org.joda.time.DurationField durationField11 = copticChronology2.years();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology2.yearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField11", (durationField4.compareTo(durationField11) == 0) == durationField4.equals(durationField11));
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test552");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField5 = copticChronology1.years();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.clockhourOfHalfday();
        java.util.Locale.Builder builder7 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder9 = builder7.removeUnicodeLocaleAttribute("weekyear");
        java.util.Locale locale10 = builder9.build();
        java.util.Locale.Builder builder13 = builder9.setExtension('u', "86");
        java.util.Locale.Builder builder14 = builder13.clear();
        java.util.Locale locale15 = java.util.Locale.TAIWAN;
        java.lang.String str16 = locale15.getDisplayLanguage();
        java.util.Locale.Builder builder17 = builder14.setLocale(locale15);
        java.util.Locale.Builder builder18 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder20 = builder18.removeUnicodeLocaleAttribute("weekyear");
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.chrono.CopticChronology copticChronology22 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone21);
        org.joda.time.DateTimeField dateTimeField23 = copticChronology22.hourOfDay();
        org.joda.time.DateTimeField dateTimeField24 = copticChronology22.centuryOfEra();
        org.joda.time.DurationField durationField25 = copticChronology22.hours();
        org.joda.time.DateTimeField dateTimeField26 = copticChronology22.weekOfWeekyear();
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime(chronology27);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime28.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime.Property property31 = localDateTime30.weekOfWeekyear();
        org.joda.time.LocalDateTime.Property property32 = localDateTime30.centuryOfEra();
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime(chronology33);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime34.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime38 = localDateTime34.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime40 = localDateTime34.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant41 = null;
        org.joda.time.DateTime dateTime42 = localDateTime40.toDateTime(readableInstant41);
        java.util.Locale locale43 = java.util.Locale.GERMANY;
        boolean boolean44 = locale43.hasExtensions();
        boolean boolean45 = dateTime42.equals((java.lang.Object) locale43);
        int int46 = property32.getDifference((org.joda.time.ReadableInstant) dateTime42);
        org.joda.time.LocalDateTime localDateTime47 = property32.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime49 = localDateTime47.plusHours(984);
        int[] intArray51 = copticChronology22.get((org.joda.time.ReadablePartial) localDateTime49, 10598401646747L);
        org.joda.time.DateTimeField dateTimeField52 = copticChronology22.clockhourOfHalfday();
        int int54 = dateTimeField52.getMaximumValue(34440112L);
        org.joda.time.LocalDateTime localDateTime55 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadableDuration readableDuration56 = null;
        org.joda.time.LocalDateTime localDateTime57 = localDateTime55.minus(readableDuration56);
        int int58 = localDateTime57.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime60 = localDateTime57.minusMillis(9);
        org.joda.time.DateTimeZone dateTimeZone63 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        java.util.Locale locale65 = java.util.Locale.GERMANY;
        org.joda.time.DateTimeZone dateTimeZone66 = null;
        org.joda.time.chrono.CopticChronology copticChronology67 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone66);
        org.joda.time.DateTimeField dateTimeField68 = copticChronology67.clockhourOfDay();
        org.joda.time.DurationField durationField69 = copticChronology67.weekyears();
        org.joda.time.DateTimeField dateTimeField70 = copticChronology67.clockhourOfDay();
        org.joda.time.Chronology chronology71 = null;
        org.joda.time.LocalDateTime localDateTime72 = new org.joda.time.LocalDateTime(chronology71);
        org.joda.time.LocalDateTime localDateTime74 = localDateTime72.plusWeeks((int) (byte) -1);
        java.util.Locale locale76 = java.util.Locale.GERMANY;
        java.lang.String str77 = locale76.getScript();
        org.joda.time.DateTimeZone dateTimeZone78 = null;
        org.joda.time.chrono.CopticChronology copticChronology79 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone78);
        org.joda.time.DateTimeField dateTimeField80 = copticChronology79.clockhourOfDay();
        java.util.Locale locale82 = java.util.Locale.ITALIAN;
        java.lang.String str83 = dateTimeField80.getAsText((long) 'a', locale82);
        java.lang.String str84 = locale76.getDisplayName(locale82);
        java.lang.String str85 = dateTimeField70.getAsShortText((org.joda.time.ReadablePartial) localDateTime74, (int) ' ', locale82);
        java.lang.String str86 = locale65.getDisplayName(locale82);
        java.lang.String str87 = dateTimeZone63.getName(0L, locale65);
        java.lang.String str88 = dateTimeField52.getAsShortText((org.joda.time.ReadablePartial) localDateTime60, 14400002, locale65);
        java.util.Locale.Builder builder89 = builder18.setLocale(locale65);
        java.util.Locale.Builder builder90 = builder14.setLocale(locale65);
        java.util.Locale.Builder builder92 = builder90.setLanguageTag("Japanese");
        java.util.Locale locale93 = builder92.build();
        java.lang.String str94 = locale93.getVariant();
        int int95 = dateTimeField6.getMaximumTextLength(locale93);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField69", (durationField5.compareTo(durationField69) == 0) == durationField5.equals(durationField69));
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test553");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = copticChronology1.weekyears();
        org.joda.time.DurationField durationField4 = copticChronology1.hours();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology1.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone6 = copticChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology1.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology1.dayOfYear();
        org.joda.time.DurationField durationField9 = copticChronology1.months();
        org.joda.time.DurationField durationField10 = copticChronology1.centuries();
        org.joda.time.DurationField durationField11 = copticChronology1.millis();
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
        org.joda.time.LocalDateTime.Property property28 = localDateTime21.millisOfDay();
        org.joda.time.LocalDateTime localDateTime30 = localDateTime21.minusYears(999);
        int int31 = localDateTime21.getDayOfYear();
        org.joda.time.LocalDateTime localDateTime33 = localDateTime21.minusSeconds(30);
        org.joda.time.LocalDateTime.Property property34 = localDateTime33.millisOfDay();
        org.joda.time.LocalDateTime localDateTime36 = localDateTime33.minusDays(451);
        int[] intArray37 = localDateTime36.getValues();
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.chrono.CopticChronology copticChronology39 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone38);
        org.joda.time.DateTimeField dateTimeField40 = copticChronology39.hourOfDay();
        org.joda.time.DateTimeField dateTimeField41 = copticChronology39.centuryOfEra();
        org.joda.time.DurationField durationField42 = copticChronology39.hours();
        org.joda.time.DateTimeField dateTimeField43 = copticChronology39.weekOfWeekyear();
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.LocalDateTime localDateTime45 = new org.joda.time.LocalDateTime(chronology44);
        org.joda.time.LocalDateTime localDateTime47 = localDateTime45.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime49 = localDateTime45.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime51 = localDateTime45.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant52 = null;
        org.joda.time.DateTime dateTime53 = localDateTime51.toDateTime(readableInstant52);
        org.joda.time.LocalDateTime.Property property54 = localDateTime51.millisOfDay();
        org.joda.time.Interval interval55 = property54.toInterval();
        org.joda.time.DurationField durationField56 = property54.getDurationField();
        org.joda.time.LocalDateTime localDateTime57 = property54.withMaximumValue();
        long long59 = copticChronology39.set((org.joda.time.ReadablePartial) localDateTime57, 10598109377074L);
        org.joda.time.DurationField durationField60 = copticChronology39.weekyears();
        org.joda.time.DateTimeZone dateTimeZone61 = null;
        org.joda.time.chrono.CopticChronology copticChronology62 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone61);
        org.joda.time.DateTimeField dateTimeField63 = copticChronology62.dayOfMonth();
        org.joda.time.Chronology chronology64 = null;
        org.joda.time.LocalDateTime localDateTime65 = new org.joda.time.LocalDateTime(chronology64);
        org.joda.time.LocalDateTime localDateTime67 = localDateTime65.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime69 = localDateTime65.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime71 = localDateTime65.plusWeeks((int) (byte) 10);
        java.util.Locale locale72 = java.util.Locale.PRC;
        java.lang.String str73 = dateTimeField63.getAsText((org.joda.time.ReadablePartial) localDateTime71, locale72);
        org.joda.time.ReadablePeriod readablePeriod74 = null;
        org.joda.time.LocalDateTime localDateTime75 = localDateTime71.plus(readablePeriod74);
        int int76 = localDateTime75.getMillisOfDay();
        int[] intArray78 = copticChronology39.get((org.joda.time.ReadablePartial) localDateTime75, 0L);
        copticChronology1.validate((org.joda.time.ReadablePartial) localDateTime36, intArray78);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField11 and durationField56", (durationField11.compareTo(durationField56) == 0) == durationField11.equals(durationField56));
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test554");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = copticChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = copticChronology1.getZone();
        org.joda.time.DurationField durationField6 = copticChronology1.centuries();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology1.dayOfYear();
        org.joda.time.DurationField durationField8 = copticChronology1.years();
        java.lang.String str9 = copticChronology1.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField8", (durationField3.compareTo(durationField8) == 0) == durationField3.equals(durationField8));
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test555");
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
        org.joda.time.LocalDateTime localDateTime17 = property16.roundHalfCeilingCopy();
        org.joda.time.DurationField durationField18 = property16.getDurationField();
        org.joda.time.LocalDateTime localDateTime19 = property16.roundHalfEvenCopy();
        org.joda.time.DateTimeField dateTimeField20 = property16.getField();
        org.joda.time.LocalDateTime localDateTime22 = property16.addToCopy((long) 745);
        org.joda.time.LocalDateTime localDateTime23 = property16.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime24 = property16.getLocalDateTime();
        org.joda.time.ReadableDuration readableDuration25 = null;
        org.joda.time.LocalDateTime localDateTime26 = localDateTime24.plus(readableDuration25);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime24.plusDays(59);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = null;
        java.lang.String str30 = localDateTime24.toString(dateTimeFormatter29);
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.chrono.CopticChronology copticChronology33 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone32);
        org.joda.time.DateTimeField dateTimeField34 = copticChronology33.hourOfDay();
        org.joda.time.DurationField durationField35 = copticChronology33.eras();
        org.joda.time.DateTimeField dateTimeField36 = copticChronology33.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField37 = copticChronology33.millisOfSecond();
        java.lang.String str38 = copticChronology33.toString();
        org.joda.time.LocalDateTime localDateTime39 = new org.joda.time.LocalDateTime((-30829079975L), (org.joda.time.Chronology) copticChronology33);
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.LocalDateTime localDateTime41 = new org.joda.time.LocalDateTime(chronology40);
        org.joda.time.LocalDateTime localDateTime43 = localDateTime41.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime.Property property44 = localDateTime43.weekOfWeekyear();
        java.lang.String str45 = property44.getAsText();
        org.joda.time.DateTimeFieldType dateTimeFieldType46 = property44.getFieldType();
        boolean boolean47 = localDateTime39.isSupported(dateTimeFieldType46);
        boolean boolean48 = localDateTime24.isSupported(dateTimeFieldType46);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField18 and durationField35", Math.signum(durationField18.compareTo(durationField35)) == -Math.signum(durationField35.compareTo(durationField18)));
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
        org.joda.time.DateTimeField dateTimeField5 = copticChronology1.weekyear();
        int int6 = dateTimeField5.getMinimumValue();
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
        org.joda.time.LocalDateTime.Property property23 = localDateTime16.millisOfDay();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime(chronology24);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime25.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime25.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime25.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.DateTime dateTime33 = localDateTime31.toDateTime(readableInstant32);
        java.util.Locale locale34 = java.util.Locale.GERMANY;
        boolean boolean35 = locale34.hasExtensions();
        boolean boolean36 = dateTime33.equals((java.lang.Object) locale34);
        java.lang.String str37 = dateTimeField5.getAsShortText((org.joda.time.ReadablePartial) localDateTime16, locale34);
        java.lang.String str38 = locale34.getDisplayCountry();
        java.lang.String str39 = locale34.getLanguage();
        java.lang.String str40 = locale34.getDisplayCountry();
        java.lang.String str41 = locale34.getScript();
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.chrono.CopticChronology copticChronology43 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone42);
        org.joda.time.DateTimeField dateTimeField44 = copticChronology43.hourOfDay();
        org.joda.time.DurationField durationField45 = copticChronology43.eras();
        org.joda.time.DateTimeField dateTimeField46 = copticChronology43.weekOfWeekyear();
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.LocalDateTime localDateTime48 = new org.joda.time.LocalDateTime(chronology47);
        org.joda.time.LocalDateTime localDateTime50 = localDateTime48.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime.Property property51 = localDateTime50.weekOfWeekyear();
        int int52 = localDateTime50.getYear();
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
        org.joda.time.Chronology chronology66 = null;
        org.joda.time.LocalDateTime localDateTime67 = new org.joda.time.LocalDateTime(chronology66);
        org.joda.time.LocalDateTime localDateTime69 = localDateTime67.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime71 = localDateTime67.withMillisOfSecond((int) (byte) 1);
        java.util.Locale locale73 = java.util.Locale.JAPAN;
        java.lang.String str74 = dateTimeField55.getAsText((org.joda.time.ReadablePartial) localDateTime67, 2022, locale73);
        java.lang.String str75 = dateTimeField46.getAsShortText((org.joda.time.ReadablePartial) localDateTime50, locale73);
        java.util.Set<java.lang.Character> charSet76 = locale73.getExtensionKeys();
        java.lang.String str78 = locale73.getUnicodeLocaleType("97");
        java.lang.String str79 = locale73.getDisplayName();
        java.lang.String str80 = locale34.getDisplayCountry(locale73);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField45", Math.signum(durationField3.compareTo(durationField45)) == -Math.signum(durationField45.compareTo(durationField3)));
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test557");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.weekyears();
        org.joda.time.DurationField durationField2 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.centuryOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField1 and durationField2", Math.signum(durationField1.compareTo(durationField2)) == -Math.signum(durationField2.compareTo(durationField1)));
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test558");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology1.centuryOfEra();
        org.joda.time.DurationField durationField4 = copticChronology1.millis();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology1.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone6);
        org.joda.time.DateTimeField dateTimeField8 = copticChronology7.hourOfDay();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology7.centuryOfEra();
        org.joda.time.DurationField durationField10 = copticChronology7.millis();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology7.weekOfWeekyear();
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
        org.joda.time.LocalDateTime localDateTime29 = localDateTime21.minusMillis(2022);
        int[] intArray31 = copticChronology7.get((org.joda.time.ReadablePartial) localDateTime21, (long) '#');
        long long33 = copticChronology1.set((org.joda.time.ReadablePartial) localDateTime21, 32054400000L);
        org.joda.time.DateTimeField dateTimeField34 = copticChronology1.weekyearOfCentury();
        java.lang.String str35 = copticChronology1.toString();
        org.joda.time.DateTimeField dateTimeField36 = copticChronology1.millisOfSecond();
        org.joda.time.DurationField durationField37 = copticChronology1.eras();
        org.joda.time.DateTimeField dateTimeField38 = copticChronology1.hourOfHalfday();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField4 and durationField37", Math.signum(durationField4.compareTo(durationField37)) == -Math.signum(durationField37.compareTo(durationField4)));
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test559");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = copticChronology1.months();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.Chronology chronology5 = copticChronology1.withZone(dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone6);
        org.joda.time.DateTimeField dateTimeField8 = copticChronology7.clockhourOfDay();
        org.joda.time.DurationField durationField9 = copticChronology7.weekyears();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology7.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone11 = copticChronology7.getZone();
        org.joda.time.LocalDateTime localDateTime12 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) copticChronology7);
        org.joda.time.DurationField durationField13 = copticChronology7.weekyears();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime(chronology14);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime15.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime.Property property20 = localDateTime19.dayOfWeek();
        int[] intArray22 = copticChronology7.get((org.joda.time.ReadablePartial) localDateTime19, 0L);
        org.joda.time.DurationField durationField23 = copticChronology7.minutes();
        org.joda.time.Chronology chronology24 = copticChronology7.withUTC();
        boolean boolean25 = copticChronology1.equals((java.lang.Object) copticChronology7);
        org.joda.time.DateTimeZone dateTimeZone26 = copticChronology1.getZone();
        org.joda.time.DurationField durationField27 = copticChronology1.years();
        org.joda.time.DurationField durationField28 = copticChronology1.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField9 and durationField27", (durationField9.compareTo(durationField27) == 0) == durationField9.equals(durationField27));
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test560");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.withMillisOfSecond((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime5.withMinuteOfHour(10);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime5.minusDays(100);
        org.joda.time.DateTime dateTime12 = localDateTime5.toDateTime();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(chronology13);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray15 = localDateTime14.getFieldTypes();
        org.joda.time.LocalDateTime localDateTime17 = localDateTime14.withMillisOfDay((int) (byte) 0);
        int int18 = localDateTime17.getYear();
        org.joda.time.LocalDateTime.Property property19 = localDateTime17.yearOfEra();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime(chronology20);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime21.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime21.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.DateTime dateTime29 = localDateTime27.toDateTime(readableInstant28);
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime(chronology30);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime31.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime35 = localDateTime31.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime37 = localDateTime31.plusWeeks((int) (byte) 10);
        int int38 = localDateTime37.getMillisOfSecond();
        int int39 = localDateTime37.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime41 = localDateTime37.plusHours((int) (short) -1);
        org.joda.time.DurationFieldType durationFieldType42 = null;
        boolean boolean43 = localDateTime37.isSupported(durationFieldType42);
        org.joda.time.DateTime dateTime44 = localDateTime37.toDateTime();
        boolean boolean45 = dateTime29.isAfter((org.joda.time.ReadableInstant) dateTime44);
        org.joda.time.DateTimeZone dateTimeZone46 = dateTime44.getZone();
        org.joda.time.Instant instant47 = dateTime44.toInstant();
        int int48 = property19.getDifference((org.joda.time.ReadableInstant) dateTime44);
        boolean boolean49 = dateTime12.isEqual((org.joda.time.ReadableInstant) dateTime44);
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.LocalDateTime localDateTime51 = new org.joda.time.LocalDateTime(chronology50);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray52 = localDateTime51.getFieldTypes();
        org.joda.time.LocalDateTime localDateTime54 = localDateTime51.withMillisOfDay((int) (byte) 0);
        int int55 = localDateTime54.getYear();
        org.joda.time.LocalDateTime.Property property56 = localDateTime54.yearOfEra();
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
        org.joda.time.Instant instant84 = dateTime81.toInstant();
        int int85 = property56.getDifference((org.joda.time.ReadableInstant) dateTime81);
        boolean boolean86 = dateTime12.isBefore((org.joda.time.ReadableInstant) dateTime81);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime44 and instant47", (dateTime44.compareTo(instant47) == 0) == dateTime44.equals(instant47));
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test561");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = copticChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField5 = copticChronology1.hours();
        org.joda.time.DurationField durationField6 = copticChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology1.millisOfSecond();
        org.joda.time.DurationField durationField9 = copticChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology1.hourOfDay();
        org.joda.time.DurationField durationField12 = copticChronology1.years();
        org.joda.time.DateTimeZone dateTimeZone13 = copticChronology1.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField12", (durationField3.compareTo(durationField12) == 0) == durationField3.equals(durationField12));
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test562");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology1.centuryOfEra();
        org.joda.time.DurationField durationField4 = copticChronology1.millis();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology1.monthOfYear();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology1.era();
        org.joda.time.DurationField durationField8 = copticChronology1.eras();
        org.joda.time.DurationField durationField9 = copticChronology1.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField4 and durationField8", Math.signum(durationField4.compareTo(durationField8)) == -Math.signum(durationField8.compareTo(durationField4)));
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test563");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology1.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.Chronology chronology5 = copticChronology1.withZone(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.millisOfSecond();
        org.joda.time.DurationField durationField7 = copticChronology1.months();
        org.joda.time.DurationField durationField8 = copticChronology1.halfdays();
        org.joda.time.DateTimeZone dateTimeZone9 = copticChronology1.getZone();
        java.util.Locale locale13 = new java.util.Locale("2022-02-27T16:20:15.789", "Japan");
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.chrono.CopticChronology copticChronology15 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone14);
        org.joda.time.DateTimeField dateTimeField16 = copticChronology15.hourOfDay();
        org.joda.time.DurationField durationField17 = copticChronology15.eras();
        org.joda.time.DateTimeField dateTimeField18 = copticChronology15.weekOfWeekyear();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime(chronology19);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime20.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime.Property property23 = localDateTime22.weekOfWeekyear();
        int int24 = localDateTime22.getYear();
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.chrono.CopticChronology copticChronology26 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone25);
        org.joda.time.DateTimeField dateTimeField27 = copticChronology26.dayOfMonth();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime(chronology28);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime29.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime29.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime35 = localDateTime29.plusWeeks((int) (byte) 10);
        java.util.Locale locale36 = java.util.Locale.PRC;
        java.lang.String str37 = dateTimeField27.getAsText((org.joda.time.ReadablePartial) localDateTime35, locale36);
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.LocalDateTime localDateTime39 = new org.joda.time.LocalDateTime(chronology38);
        org.joda.time.LocalDateTime localDateTime41 = localDateTime39.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime43 = localDateTime39.withMillisOfSecond((int) (byte) 1);
        java.util.Locale locale45 = java.util.Locale.JAPAN;
        java.lang.String str46 = dateTimeField27.getAsText((org.joda.time.ReadablePartial) localDateTime39, 2022, locale45);
        java.lang.String str47 = dateTimeField18.getAsShortText((org.joda.time.ReadablePartial) localDateTime22, locale45);
        java.lang.String str48 = locale13.getDisplayName(locale45);
        java.lang.String str49 = locale45.getDisplayLanguage();
        java.lang.String str50 = dateTimeZone9.getShortName((long) 512, locale45);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField7 and durationField17", Math.signum(durationField7.compareTo(durationField17)) == -Math.signum(durationField17.compareTo(durationField7)));
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test564");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.CopticChronology copticChronology2 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology2.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology2.secondOfDay();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology2.secondOfDay();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) 10, (org.joda.time.Chronology) copticChronology2);
        org.joda.time.DurationField durationField7 = copticChronology2.eras();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology2.dayOfYear();
        org.joda.time.DurationField durationField9 = dateTimeField8.getDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField7, durationField9, and durationField7", !(durationField7.compareTo(durationField9) == 0) || (Math.signum(durationField7.compareTo(durationField7)) == Math.signum(durationField9.compareTo(durationField7))));
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test565");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.minus(readableDuration1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 10);
        long long6 = dateTimeZone4.convertUTCToLocal((long) (short) 1);
        long long9 = dateTimeZone4.adjustOffset((long) 984, true);
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone4.getName((long) 242, locale11);
        org.joda.time.DateTime dateTime13 = localDateTime0.toDateTime(dateTimeZone4);
        org.joda.time.Instant instant14 = dateTime13.toInstant();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(chronology15);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime16.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime20.withMillisOfSecond((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime20.withMinuteOfHour(10);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime20.minusDays(100);
        org.joda.time.LocalDateTime.Property property27 = localDateTime26.minuteOfHour();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime(chronology28);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime29.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime29.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime35 = localDateTime29.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.DateTime dateTime37 = localDateTime35.toDateTime(readableInstant36);
        org.joda.time.DateTimeFieldType dateTimeFieldType38 = null;
        boolean boolean39 = dateTime37.isSupported(dateTimeFieldType38);
        org.joda.time.DateTime dateTime40 = localDateTime26.toDateTime((org.joda.time.ReadableInstant) dateTime37);
        int int41 = instant14.compareTo((org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.Chronology chronology42 = dateTime37.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime13 and instant14", (dateTime13.compareTo(instant14) == 0) == dateTime13.equals(instant14));
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test566");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime5 = property4.roundHalfEvenCopy();
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
        java.util.Locale.LanguageRange[] languageRangeArray19 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList20 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList20, languageRangeArray19);
        java.util.Collection<java.lang.String> strCollection22 = null;
        java.util.List<java.lang.String> strList23 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList20, strCollection22);
        java.util.Collection<java.lang.String> strCollection24 = null;
        java.util.List<java.lang.String> strList25 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList20, strCollection24);
        java.util.Locale.LanguageRange[] languageRangeArray26 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList27 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList27, languageRangeArray26);
        java.util.Collection<java.lang.String> strCollection29 = null;
        java.util.List<java.lang.String> strList30 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList27, strCollection29);
        java.util.Collection<java.lang.String> strCollection31 = null;
        java.util.List<java.lang.String> strList32 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList27, strCollection31);
        java.util.Locale.FilteringMode filteringMode33 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList34 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList20, strCollection31, filteringMode33);
        boolean boolean35 = dateTime15.equals((java.lang.Object) languageRangeList20);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime(chronology36);
        org.joda.time.LocalDateTime localDateTime39 = localDateTime37.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime.Property property40 = localDateTime39.weekOfWeekyear();
        org.joda.time.LocalDateTime.Property property41 = localDateTime39.centuryOfEra();
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
        int int55 = property41.getDifference((org.joda.time.ReadableInstant) dateTime51);
        int int56 = dateTime15.compareTo((org.joda.time.ReadableInstant) dateTime51);
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.LocalDateTime localDateTime58 = new org.joda.time.LocalDateTime(chronology57);
        org.joda.time.LocalDateTime localDateTime60 = localDateTime58.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime62 = localDateTime58.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime64 = localDateTime58.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant65 = null;
        org.joda.time.DateTime dateTime66 = localDateTime64.toDateTime(readableInstant65);
        java.util.Locale locale67 = java.util.Locale.GERMANY;
        boolean boolean68 = locale67.hasExtensions();
        boolean boolean69 = dateTime66.equals((java.lang.Object) locale67);
        boolean boolean70 = dateTime15.isEqual((org.joda.time.ReadableInstant) dateTime66);
        org.joda.time.Instant instant71 = dateTime15.toInstant();
        org.joda.time.Instant instant72 = dateTime15.toInstant();
        int int73 = property4.getDifference((org.joda.time.ReadableInstant) dateTime15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime51 and instant71", (dateTime51.compareTo(instant71) == 0) == dateTime51.equals(instant71));
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test567");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.DateTime dateTime9 = localDateTime7.toDateTime(readableInstant8);
        org.joda.time.LocalDateTime.Property property10 = localDateTime7.millisOfDay();
        java.lang.String str11 = property10.getName();
        org.joda.time.Interval interval12 = property10.toInterval();
        org.joda.time.LocalDateTime localDateTime13 = property10.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime15 = property10.addToCopy(52);
        int int16 = property10.getMinimumValueOverall();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.chrono.CopticChronology copticChronology18 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone17);
        org.joda.time.DateTimeField dateTimeField19 = copticChronology18.hourOfDay();
        org.joda.time.DateTimeField dateTimeField20 = copticChronology18.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.Chronology chronology22 = copticChronology18.withZone(dateTimeZone21);
        org.joda.time.DateTimeField dateTimeField23 = copticChronology18.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField24 = copticChronology18.clockhourOfHalfday();
        org.joda.time.DurationField durationField25 = copticChronology18.millis();
        org.joda.time.DateTimeField dateTimeField26 = copticChronology18.dayOfWeek();
        org.joda.time.DurationField durationField27 = copticChronology18.days();
        org.joda.time.DateTimeField dateTimeField28 = copticChronology18.year();
        org.joda.time.DateTimeField dateTimeField29 = copticChronology18.clockhourOfDay();
        java.util.Locale locale33 = new java.util.Locale("2000", "86", "dopo Cristo");
        int int34 = dateTimeField29.getMaximumShortTextLength(locale33);
        java.lang.String str35 = property10.getAsText(locale33);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime(chronology36);
        org.joda.time.LocalDateTime localDateTime39 = localDateTime37.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime41 = localDateTime37.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime43 = localDateTime37.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.DateTime dateTime45 = localDateTime43.toDateTime(readableInstant44);
        org.joda.time.DateTimeFieldType dateTimeFieldType46 = null;
        boolean boolean47 = dateTime45.isSupported(dateTimeFieldType46);
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.LocalDateTime localDateTime49 = new org.joda.time.LocalDateTime(chronology48);
        org.joda.time.LocalDateTime localDateTime51 = localDateTime49.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime53 = localDateTime49.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime55 = localDateTime49.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant56 = null;
        org.joda.time.DateTime dateTime57 = localDateTime55.toDateTime(readableInstant56);
        boolean boolean58 = dateTime45.isAfter((org.joda.time.ReadableInstant) dateTime57);
        long long59 = dateTime57.getMillis();
        org.joda.time.LocalDateTime localDateTime60 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadableDuration readableDuration61 = null;
        org.joda.time.LocalDateTime localDateTime62 = localDateTime60.minus(readableDuration61);
        org.joda.time.DateTimeZone dateTimeZone64 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 10);
        long long66 = dateTimeZone64.convertUTCToLocal((long) (short) 1);
        long long69 = dateTimeZone64.adjustOffset((long) 984, true);
        java.util.Locale locale71 = null;
        java.lang.String str72 = dateTimeZone64.getName((long) 242, locale71);
        org.joda.time.DateTime dateTime73 = localDateTime60.toDateTime(dateTimeZone64);
        boolean boolean74 = dateTime57.isAfter((org.joda.time.ReadableInstant) dateTime73);
        long long75 = dateTime73.getMillis();
        org.joda.time.Instant instant76 = dateTime73.toInstant();
        long long77 = property10.getDifferenceAsLong((org.joda.time.ReadableInstant) instant76);
        int int78 = property10.get();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime73 and instant76", (dateTime73.compareTo(instant76) == 0) == dateTime73.equals(instant76));
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test568");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology1.secondOfDay();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology1.minuteOfDay();
        org.joda.time.DurationField durationField5 = copticChronology1.centuries();
        org.joda.time.DurationField durationField6 = copticChronology1.weeks();
        org.joda.time.DurationField durationField7 = copticChronology1.years();
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
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime(chronology24);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime25.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime25.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime29.withMillisOfSecond((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime29.withMinuteOfHour(10);
        boolean boolean34 = localDateTime17.isEqual((org.joda.time.ReadablePartial) localDateTime33);
        int int35 = localDateTime33.getMillisOfDay();
        int int36 = localDateTime33.getDayOfWeek();
        org.joda.time.LocalDateTime localDateTime38 = localDateTime33.plusWeeks(26284924);
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.chrono.CopticChronology copticChronology40 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone39);
        org.joda.time.DateTimeField dateTimeField41 = copticChronology40.clockhourOfDay();
        org.joda.time.DurationField durationField42 = copticChronology40.weekyears();
        org.joda.time.DurationField durationField43 = copticChronology40.hours();
        int int44 = copticChronology40.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField45 = copticChronology40.centuries();
        org.joda.time.DurationField durationField46 = copticChronology40.days();
        org.joda.time.DurationField durationField47 = copticChronology40.centuries();
        org.joda.time.DateTimeZone dateTimeZone48 = copticChronology40.getZone();
        org.joda.time.DateTimeField dateTimeField49 = copticChronology40.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField50 = copticChronology40.clockhourOfHalfday();
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.LocalDateTime localDateTime52 = new org.joda.time.LocalDateTime(chronology51);
        org.joda.time.LocalDateTime localDateTime54 = localDateTime52.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime.Property property55 = localDateTime52.weekOfWeekyear();
        int int56 = localDateTime52.getSecondOfMinute();
        org.joda.time.ReadableDuration readableDuration57 = null;
        org.joda.time.LocalDateTime localDateTime58 = localDateTime52.plus(readableDuration57);
        org.joda.time.DateTimeZone dateTimeZone59 = null;
        org.joda.time.chrono.CopticChronology copticChronology60 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone59);
        org.joda.time.DateTimeField dateTimeField61 = copticChronology60.clockhourOfDay();
        org.joda.time.DurationField durationField62 = copticChronology60.weekyears();
        org.joda.time.DateTimeField dateTimeField63 = copticChronology60.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone64 = null;
        org.joda.time.chrono.CopticChronology copticChronology65 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone64);
        org.joda.time.DateTimeField dateTimeField66 = copticChronology65.clockhourOfDay();
        java.util.Locale locale68 = java.util.Locale.ITALIAN;
        java.lang.String str69 = dateTimeField66.getAsText((long) 'a', locale68);
        int int70 = dateTimeField63.getMaximumTextLength(locale68);
        int int72 = dateTimeField63.getMinimumValue((-3600001L));
        org.joda.time.Chronology chronology73 = null;
        org.joda.time.LocalDateTime localDateTime74 = new org.joda.time.LocalDateTime(chronology73);
        org.joda.time.LocalDateTime localDateTime76 = localDateTime74.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime.Property property77 = localDateTime76.weekOfWeekyear();
        org.joda.time.LocalDateTime.Property property78 = localDateTime76.centuryOfEra();
        java.lang.String str79 = localDateTime76.toString();
        java.util.Locale locale81 = java.util.Locale.ENGLISH;
        java.lang.String str82 = dateTimeField63.getAsShortText((org.joda.time.ReadablePartial) localDateTime76, (-292275054), locale81);
        java.util.Set<java.lang.String> strSet83 = locale81.getUnicodeLocaleKeys();
        boolean boolean84 = locale81.hasExtensions();
        boolean boolean85 = localDateTime58.equals((java.lang.Object) boolean84);
        org.joda.time.LocalDateTime localDateTime87 = localDateTime58.plusDays(993);
        int int88 = localDateTime87.getWeekyear();
        org.joda.time.Chronology chronology90 = null;
        org.joda.time.LocalDateTime localDateTime91 = new org.joda.time.LocalDateTime(chronology90);
        org.joda.time.LocalDateTime localDateTime93 = localDateTime91.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime.Property property94 = localDateTime91.weekOfWeekyear();
        int int95 = localDateTime91.getSecondOfMinute();
        int[] intArray96 = localDateTime91.getValues();
        int[] intArray98 = dateTimeField50.addWrapField((org.joda.time.ReadablePartial) localDateTime87, 0, intArray96, 96);
        copticChronology1.validate((org.joda.time.ReadablePartial) localDateTime38, intArray96);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField7 and durationField42", (durationField7.compareTo(durationField42) == 0) == durationField7.equals(durationField42));
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test569");
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
        org.joda.time.DateTimeField dateTimeField10 = copticChronology1.minuteOfHour();
        org.joda.time.DurationField durationField11 = copticChronology1.weekyears();
        java.lang.String str12 = copticChronology1.toString();
        org.joda.time.DurationField durationField13 = copticChronology1.hours();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology1.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology1.era();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.chrono.CopticChronology copticChronology18 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone17);
        org.joda.time.DateTimeField dateTimeField19 = copticChronology18.hourOfDay();
        org.joda.time.DurationField durationField20 = copticChronology18.eras();
        org.joda.time.DateTimeField dateTimeField21 = copticChronology18.weekOfWeekyear();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime(chronology22);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime.Property property26 = localDateTime25.weekOfWeekyear();
        int int27 = localDateTime25.getYear();
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.chrono.CopticChronology copticChronology29 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone28);
        org.joda.time.DateTimeField dateTimeField30 = copticChronology29.dayOfMonth();
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime(chronology31);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime32.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime32.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime38 = localDateTime32.plusWeeks((int) (byte) 10);
        java.util.Locale locale39 = java.util.Locale.PRC;
        java.lang.String str40 = dateTimeField30.getAsText((org.joda.time.ReadablePartial) localDateTime38, locale39);
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime(chronology41);
        org.joda.time.LocalDateTime localDateTime44 = localDateTime42.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime46 = localDateTime42.withMillisOfSecond((int) (byte) 1);
        java.util.Locale locale48 = java.util.Locale.JAPAN;
        java.lang.String str49 = dateTimeField30.getAsText((org.joda.time.ReadablePartial) localDateTime42, 2022, locale48);
        java.lang.String str50 = dateTimeField21.getAsShortText((org.joda.time.ReadablePartial) localDateTime25, locale48);
        java.util.Set<java.lang.Character> charSet51 = locale48.getExtensionKeys();
        java.lang.String str53 = locale48.getUnicodeLocaleType("97");
        java.lang.String str54 = locale48.getScript();
        java.util.Locale locale57 = new java.util.Locale("hi!", "hi!");
        java.util.Locale locale58 = java.util.Locale.GERMANY;
        java.lang.String str59 = locale58.getScript();
        org.joda.time.DateTimeZone dateTimeZone60 = null;
        org.joda.time.chrono.CopticChronology copticChronology61 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone60);
        org.joda.time.DateTimeField dateTimeField62 = copticChronology61.clockhourOfDay();
        java.util.Locale locale64 = java.util.Locale.ITALIAN;
        java.lang.String str65 = dateTimeField62.getAsText((long) 'a', locale64);
        java.lang.String str66 = locale58.getDisplayName(locale64);
        java.lang.String str67 = locale64.getISO3Language();
        boolean boolean68 = locale64.hasExtensions();
        java.util.Locale locale69 = locale64.stripExtensions();
        java.lang.String str70 = locale57.getDisplayVariant(locale64);
        java.lang.String str71 = locale48.getDisplayVariant(locale57);
        java.lang.String str72 = locale57.getDisplayScript();
        java.lang.String str73 = dateTimeField15.getAsText(10598109420421L, locale57);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField11 and durationField20", Math.signum(durationField11.compareTo(durationField20)) == -Math.signum(durationField20.compareTo(durationField11)));
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test570");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology1.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.Chronology chronology5 = copticChronology1.withZone(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology1.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology1.year();
        org.joda.time.DateTimeZone dateTimeZone9 = copticChronology1.getZone();
        org.joda.time.DurationField durationField10 = copticChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology1.year();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology1.minuteOfDay();
        org.joda.time.DurationField durationField13 = copticChronology1.eras();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology1.weekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField10 and durationField13", Math.signum(durationField10.compareTo(durationField13)) == -Math.signum(durationField13.compareTo(durationField10)));
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test571");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.clockhourOfDay();
        long long6 = copticChronology1.add((long) '#', (long) 'a', (int) '#');
        org.joda.time.DurationField durationField7 = copticChronology1.years();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology1.era();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.chrono.CopticChronology copticChronology10 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField11 = copticChronology10.hourOfDay();
        org.joda.time.DurationField durationField12 = copticChronology10.eras();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology10.weekOfWeekyear();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime(chronology14);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.weekOfWeekyear();
        int int19 = localDateTime17.getYear();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.chrono.CopticChronology copticChronology21 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone20);
        org.joda.time.DateTimeField dateTimeField22 = copticChronology21.dayOfMonth();
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime(chronology23);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime24.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime24.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime24.plusWeeks((int) (byte) 10);
        java.util.Locale locale31 = java.util.Locale.PRC;
        java.lang.String str32 = dateTimeField22.getAsText((org.joda.time.ReadablePartial) localDateTime30, locale31);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime(chronology33);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime34.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime38 = localDateTime34.withMillisOfSecond((int) (byte) 1);
        java.util.Locale locale40 = java.util.Locale.JAPAN;
        java.lang.String str41 = dateTimeField22.getAsText((org.joda.time.ReadablePartial) localDateTime34, 2022, locale40);
        java.lang.String str42 = dateTimeField13.getAsShortText((org.joda.time.ReadablePartial) localDateTime17, locale40);
        org.joda.time.ReadableDuration readableDuration43 = null;
        org.joda.time.LocalDateTime localDateTime45 = localDateTime17.withDurationAdded(readableDuration43, 16601);
        org.joda.time.LocalDateTime.Property property46 = localDateTime45.yearOfEra();
        org.joda.time.ReadablePeriod readablePeriod47 = null;
        org.joda.time.LocalDateTime localDateTime49 = localDateTime45.withPeriodAdded(readablePeriod47, 999);
        java.util.Date date50 = localDateTime45.toDate();
        org.joda.time.LocalDateTime localDateTime51 = org.joda.time.LocalDateTime.fromDateFields(date50);
        int int52 = dateTimeField8.getMaximumValue((org.joda.time.ReadablePartial) localDateTime51);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField7 and durationField12", Math.signum(durationField7.compareTo(durationField12)) == -Math.signum(durationField12.compareTo(durationField7)));
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test572");
        org.joda.time.tz.Provider provider0 = org.joda.time.DateTimeZone.getProvider();
        org.joda.time.DateTimeZone.setProvider(provider0);
        org.joda.time.DateTimeZone.setProvider(provider0);
        java.util.Set<java.lang.String> strSet3 = provider0.getAvailableIDs();
        java.util.Set<java.lang.String> strSet4 = provider0.getAvailableIDs();
        boolean boolean5 = strSet4.isEmpty();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone6);
        org.joda.time.DateTimeField dateTimeField8 = copticChronology7.dayOfMonth();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime(chronology9);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime10.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime10.plusWeeks((int) (byte) 10);
        java.util.Locale locale17 = java.util.Locale.PRC;
        java.lang.String str18 = dateTimeField8.getAsText((org.joda.time.ReadablePartial) localDateTime16, locale17);
        java.util.Set<java.lang.String> strSet19 = locale17.getUnicodeLocaleKeys();
        java.util.Set<java.lang.String> strSet20 = org.joda.time.DateTimeZone.getAvailableIDs();
        strSet20.clear();
        java.lang.Object[] objArray22 = strSet20.toArray();
        boolean boolean23 = strSet19.addAll((java.util.Collection<java.lang.String>) strSet20);
        java.lang.String[] strArray33 = new java.lang.String[] { "UTC", "UTC", "tedesco (Germania)", "Etc/UTC", "Etc/UTC", "", "", "10", "Etc/UTC" };
        java.util.LinkedHashSet<java.lang.String> strSet34 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet34, strArray33);
        java.util.Locale.LanguageRange[] languageRangeArray36 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList37 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList37, languageRangeArray36);
        java.util.Collection<java.lang.String> strCollection39 = null;
        java.util.List<java.lang.String> strList40 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList37, strCollection39);
        boolean boolean41 = strSet34.retainAll((java.util.Collection<java.lang.String>) strList40);
        boolean boolean42 = strSet19.addAll((java.util.Collection<java.lang.String>) strSet34);
        boolean boolean43 = strSet4.removeAll((java.util.Collection<java.lang.String>) strSet34);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap45 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList46 = java.util.Locale.LanguageRange.parse("ita", strMap45);
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.chrono.CopticChronology copticChronology48 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone47);
        org.joda.time.DateTimeField dateTimeField49 = copticChronology48.hourOfDay();
        org.joda.time.DurationField durationField50 = copticChronology48.eras();
        org.joda.time.DateTimeField dateTimeField51 = copticChronology48.weekOfWeekyear();
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.LocalDateTime localDateTime53 = new org.joda.time.LocalDateTime(chronology52);
        org.joda.time.LocalDateTime localDateTime55 = localDateTime53.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime.Property property56 = localDateTime55.weekOfWeekyear();
        int int57 = localDateTime55.getYear();
        org.joda.time.DateTimeZone dateTimeZone58 = null;
        org.joda.time.chrono.CopticChronology copticChronology59 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone58);
        org.joda.time.DateTimeField dateTimeField60 = copticChronology59.dayOfMonth();
        org.joda.time.Chronology chronology61 = null;
        org.joda.time.LocalDateTime localDateTime62 = new org.joda.time.LocalDateTime(chronology61);
        org.joda.time.LocalDateTime localDateTime64 = localDateTime62.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime66 = localDateTime62.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime68 = localDateTime62.plusWeeks((int) (byte) 10);
        java.util.Locale locale69 = java.util.Locale.PRC;
        java.lang.String str70 = dateTimeField60.getAsText((org.joda.time.ReadablePartial) localDateTime68, locale69);
        org.joda.time.Chronology chronology71 = null;
        org.joda.time.LocalDateTime localDateTime72 = new org.joda.time.LocalDateTime(chronology71);
        org.joda.time.LocalDateTime localDateTime74 = localDateTime72.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime76 = localDateTime72.withMillisOfSecond((int) (byte) 1);
        java.util.Locale locale78 = java.util.Locale.JAPAN;
        java.lang.String str79 = dateTimeField60.getAsText((org.joda.time.ReadablePartial) localDateTime72, 2022, locale78);
        java.lang.String str80 = dateTimeField51.getAsShortText((org.joda.time.ReadablePartial) localDateTime55, locale78);
        java.util.Set<java.lang.String> strSet81 = locale78.getUnicodeLocaleAttributes();
        java.util.Locale.FilteringMode filteringMode82 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList83 = java.util.Locale.filterTags(languageRangeList46, (java.util.Collection<java.lang.String>) strSet81, filteringMode82);
        java.util.stream.Stream<java.lang.String> strStream84 = strSet81.stream();
        java.lang.Object[] objArray85 = strSet81.toArray();
        boolean boolean86 = strSet4.addAll((java.util.Collection<java.lang.String>) strSet81);
        org.joda.time.DateTimeZone dateTimeZone87 = null;
        org.joda.time.chrono.CopticChronology copticChronology88 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone87);
        org.joda.time.DateTimeField dateTimeField89 = copticChronology88.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField90 = copticChronology88.weekOfWeekyear();
        org.joda.time.DurationField durationField91 = copticChronology88.days();
        org.joda.time.DateTimeField dateTimeField92 = copticChronology88.weekyearOfCentury();
        boolean boolean93 = strSet81.contains((java.lang.Object) dateTimeField92);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField50 and durationField91", Math.signum(durationField50.compareTo(durationField91)) == -Math.signum(durationField91.compareTo(durationField50)));
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
        org.joda.time.DateTimeField dateTimeField9 = copticChronology1.hourOfDay();
        org.joda.time.DurationField durationField10 = copticChronology1.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField8, durationField10, and durationField8", !(durationField8.compareTo(durationField10) == 0) || (Math.signum(durationField8.compareTo(durationField8)) == Math.signum(durationField10.compareTo(durationField8))));
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test574");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.CopticChronology copticChronology2 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology2.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology2.centuryOfEra();
        org.joda.time.DurationField durationField5 = copticChronology2.millis();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology2.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology2.clockhourOfDay();
        org.joda.time.Chronology chronology8 = copticChronology2.withUTC();
        org.joda.time.DurationField durationField9 = copticChronology2.years();
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.minus(readableDuration11);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 10);
        long long16 = dateTimeZone14.convertUTCToLocal((long) (short) 1);
        long long19 = dateTimeZone14.adjustOffset((long) 984, true);
        java.util.Locale locale21 = null;
        java.lang.String str22 = dateTimeZone14.getName((long) 242, locale21);
        org.joda.time.DateTime dateTime23 = localDateTime10.toDateTime(dateTimeZone14);
        org.joda.time.Chronology chronology24 = copticChronology2.withZone(dateTimeZone14);
        org.joda.time.DateTimeField dateTimeField25 = copticChronology2.clockhourOfDay();
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime(10040483819387L, (org.joda.time.Chronology) copticChronology2);
        org.joda.time.DateTimeField dateTimeField27 = copticChronology2.weekyearOfCentury();
        org.joda.time.LocalDateTime localDateTime28 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) copticChronology2);
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime((org.joda.time.Chronology) copticChronology2);
        org.joda.time.DateTimeField dateTimeField30 = copticChronology2.clockhourOfDay();
        org.joda.time.DurationField durationField31 = copticChronology2.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField31, durationField5, and durationField9", !(durationField31.compareTo(durationField5) == 0) || (Math.signum(durationField31.compareTo(durationField9)) == Math.signum(durationField5.compareTo(durationField9))));
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test575");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.CopticChronology copticChronology2 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology2.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology2.secondOfDay();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology2.secondOfDay();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) 10, (org.joda.time.Chronology) copticChronology2);
        org.joda.time.DurationField durationField7 = copticChronology2.eras();
        org.joda.time.DurationField durationField8 = copticChronology2.eras();
        long long12 = copticChronology2.add(4197160800000L, (long) 3, 25802001);
        org.joda.time.DateTimeField dateTimeField13 = copticChronology2.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology2.minuteOfDay();
        org.joda.time.DurationField durationField15 = copticChronology2.months();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField7, durationField15, and durationField7", !(durationField7.compareTo(durationField15) == 0) || (Math.signum(durationField7.compareTo(durationField7)) == Math.signum(durationField15.compareTo(durationField7))));
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test576");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = copticChronology1.weekyears();
        org.joda.time.DurationField durationField4 = copticChronology1.hours();
        int int5 = copticChronology1.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology1.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone8 = copticChronology1.getZone();
        java.lang.String str9 = copticChronology1.toString();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology1.clockhourOfHalfday();
        org.joda.time.DurationField durationField11 = copticChronology1.minutes();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology1.yearOfCentury();
        org.joda.time.DurationField durationField13 = copticChronology1.millis();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology1.hourOfDay();
        org.joda.time.DurationField durationField15 = copticChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField15, durationField3, and durationField4", !(durationField15.compareTo(durationField3) == 0) || (Math.signum(durationField15.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test577");
        java.util.Locale locale0 = java.util.Locale.GERMANY;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.CopticChronology copticChronology2 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology2.clockhourOfDay();
        org.joda.time.DurationField durationField4 = copticChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology2.clockhourOfDay();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.plusWeeks((int) (byte) -1);
        java.util.Locale locale11 = java.util.Locale.GERMANY;
        java.lang.String str12 = locale11.getScript();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.chrono.CopticChronology copticChronology14 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone13);
        org.joda.time.DateTimeField dateTimeField15 = copticChronology14.clockhourOfDay();
        java.util.Locale locale17 = java.util.Locale.ITALIAN;
        java.lang.String str18 = dateTimeField15.getAsText((long) 'a', locale17);
        java.lang.String str19 = locale11.getDisplayName(locale17);
        java.lang.String str20 = dateTimeField5.getAsShortText((org.joda.time.ReadablePartial) localDateTime9, (int) ' ', locale17);
        java.lang.String str21 = locale0.getDisplayName(locale17);
        java.lang.String str22 = locale0.getCountry();
        java.util.Set<java.lang.String> strSet23 = locale0.getUnicodeLocaleAttributes();
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
        java.util.Set<java.lang.String> strSet38 = org.joda.time.DateTimeZone.getAvailableIDs();
        strSet38.clear();
        java.lang.Object[] objArray40 = strSet38.toArray();
        boolean boolean41 = strSet37.addAll((java.util.Collection<java.lang.String>) strSet38);
        strSet37.clear();
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.chrono.CopticChronology copticChronology44 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone43);
        org.joda.time.DateTimeField dateTimeField45 = copticChronology44.hourOfDay();
        org.joda.time.DurationField durationField46 = copticChronology44.eras();
        org.joda.time.DateTimeField dateTimeField47 = copticChronology44.weekOfWeekyear();
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.LocalDateTime localDateTime49 = new org.joda.time.LocalDateTime(chronology48);
        org.joda.time.LocalDateTime localDateTime51 = localDateTime49.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime.Property property52 = localDateTime51.weekOfWeekyear();
        int int53 = localDateTime51.getYear();
        org.joda.time.DateTimeZone dateTimeZone54 = null;
        org.joda.time.chrono.CopticChronology copticChronology55 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone54);
        org.joda.time.DateTimeField dateTimeField56 = copticChronology55.dayOfMonth();
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.LocalDateTime localDateTime58 = new org.joda.time.LocalDateTime(chronology57);
        org.joda.time.LocalDateTime localDateTime60 = localDateTime58.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime62 = localDateTime58.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime64 = localDateTime58.plusWeeks((int) (byte) 10);
        java.util.Locale locale65 = java.util.Locale.PRC;
        java.lang.String str66 = dateTimeField56.getAsText((org.joda.time.ReadablePartial) localDateTime64, locale65);
        org.joda.time.Chronology chronology67 = null;
        org.joda.time.LocalDateTime localDateTime68 = new org.joda.time.LocalDateTime(chronology67);
        org.joda.time.LocalDateTime localDateTime70 = localDateTime68.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime72 = localDateTime68.withMillisOfSecond((int) (byte) 1);
        java.util.Locale locale74 = java.util.Locale.JAPAN;
        java.lang.String str75 = dateTimeField56.getAsText((org.joda.time.ReadablePartial) localDateTime68, 2022, locale74);
        java.lang.String str76 = dateTimeField47.getAsShortText((org.joda.time.ReadablePartial) localDateTime51, locale74);
        java.util.Set<java.lang.String> strSet77 = locale74.getUnicodeLocaleAttributes();
        int int78 = strSet77.size();
        boolean boolean79 = strSet37.containsAll((java.util.Collection<java.lang.String>) strSet77);
        java.util.Iterator<java.lang.String> strItor80 = strSet77.iterator();
        boolean boolean81 = strSet23.retainAll((java.util.Collection<java.lang.String>) strSet77);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField4 and durationField46", Math.signum(durationField4.compareTo(durationField46)) == -Math.signum(durationField46.compareTo(durationField4)));
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test578");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology1.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology1.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) copticChronology1);
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology1.minuteOfDay();
        org.joda.time.DurationField durationField8 = copticChronology1.days();
        org.joda.time.DurationField durationField9 = copticChronology1.millis();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology1.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology1.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology1.hourOfHalfday();
        org.joda.time.DurationField durationField14 = copticChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField14, durationField8, and durationField9", !(durationField14.compareTo(durationField8) == 0) || (Math.signum(durationField14.compareTo(durationField9)) == Math.signum(durationField8.compareTo(durationField9))));
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test579");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology1.centuryOfEra();
        org.joda.time.DurationField durationField4 = copticChronology1.millis();
        org.joda.time.DurationField durationField5 = copticChronology1.months();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.clockhourOfHalfday();
        org.joda.time.DurationField durationField7 = copticChronology1.seconds();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(chronology8);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray10 = localDateTime9.getFieldTypes();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime9.withMillisOfDay((int) (byte) 0);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(chronology13);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime14.withMillisOfSecond((int) (byte) 1);
        boolean boolean19 = localDateTime9.isAfter((org.joda.time.ReadablePartial) localDateTime14);
        int[] intArray21 = copticChronology1.get((org.joda.time.ReadablePartial) localDateTime14, 10598109404691L);
        org.joda.time.DurationField durationField22 = copticChronology1.halfdays();
        org.joda.time.DurationField durationField23 = copticChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField23, durationField4, and durationField5", !(durationField23.compareTo(durationField4) == 0) || (Math.signum(durationField23.compareTo(durationField5)) == Math.signum(durationField4.compareTo(durationField5))));
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test580");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.hourOfDay();
        org.joda.time.DurationField durationField3 = copticChronology1.eras();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology1.weekOfWeekyear();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(chronology5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.weekOfWeekyear();
        int int10 = localDateTime8.getYear();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.chrono.CopticChronology copticChronology12 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone11);
        org.joda.time.DateTimeField dateTimeField13 = copticChronology12.dayOfMonth();
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
        java.lang.String str33 = dateTimeField4.getAsShortText((org.joda.time.ReadablePartial) localDateTime8, locale31);
        java.util.Set<java.lang.Character> charSet34 = locale31.getExtensionKeys();
        java.lang.String str36 = locale31.getUnicodeLocaleType("97");
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.chrono.CopticChronology copticChronology38 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone37);
        org.joda.time.DateTimeField dateTimeField39 = copticChronology38.clockhourOfDay();
        org.joda.time.DurationField durationField40 = copticChronology38.weekyears();
        org.joda.time.DurationField durationField41 = copticChronology38.hours();
        org.joda.time.DateTimeField dateTimeField42 = copticChronology38.dayOfMonth();
        org.joda.time.DurationField durationField43 = copticChronology38.millis();
        org.joda.time.DurationField durationField44 = copticChronology38.centuries();
        org.joda.time.DateTimeField dateTimeField45 = copticChronology38.clockhourOfDay();
        java.lang.String str46 = dateTimeField45.toString();
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.forOffsetHours(209);
        org.joda.time.DateTimeZone dateTimeZone51 = null;
        org.joda.time.chrono.CopticChronology copticChronology52 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone51);
        org.joda.time.DateTimeField dateTimeField53 = copticChronology52.clockhourOfDay();
        org.joda.time.DurationField durationField54 = copticChronology52.weekyears();
        org.joda.time.DurationField durationField55 = copticChronology52.hours();
        int int56 = copticChronology52.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField57 = copticChronology52.monthOfYear();
        org.joda.time.DateTimeField dateTimeField58 = copticChronology52.dayOfMonth();
        java.util.Locale locale60 = java.util.Locale.GERMANY;
        java.lang.String str61 = locale60.getScript();
        java.lang.String str62 = locale60.getDisplayVariant();
        java.util.Locale locale63 = locale60.stripExtensions();
        java.lang.String str64 = locale63.getVariant();
        boolean boolean65 = locale63.hasExtensions();
        java.lang.String str66 = dateTimeField58.getAsShortText(10597504671723L, locale63);
        java.lang.String str67 = dateTimeZone49.getShortName(6474410312185L, locale63);
        java.lang.String str68 = dateTimeField45.getAsShortText(4706329325L, locale63);
        java.lang.String str69 = locale31.getDisplayName(locale63);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField40", Math.signum(durationField3.compareTo(durationField40)) == -Math.signum(durationField40.compareTo(durationField3)));
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test581");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology1.centuryOfEra();
        org.joda.time.DurationField durationField4 = copticChronology1.hours();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.secondOfDay();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology1.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology1.minuteOfDay();
        org.joda.time.DurationField durationField9 = copticChronology1.years();
        org.joda.time.DurationField durationField10 = copticChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField10, durationField4, and durationField9", !(durationField10.compareTo(durationField4) == 0) || (Math.signum(durationField10.compareTo(durationField9)) == Math.signum(durationField4.compareTo(durationField9))));
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test582");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.minus(readableDuration1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 10);
        long long6 = dateTimeZone4.convertUTCToLocal((long) (short) 1);
        long long9 = dateTimeZone4.adjustOffset((long) 984, true);
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone4.getName((long) 242, locale11);
        org.joda.time.DateTime dateTime13 = localDateTime0.toDateTime(dateTimeZone4);
        org.joda.time.Instant instant14 = dateTime13.toInstant();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(chronology15);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime16.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime16.withYearOfCentury(0);
        org.joda.time.LocalDateTime.Property property23 = localDateTime22.weekyear();
        org.joda.time.Interval interval24 = property23.toInterval();
        boolean boolean25 = property23.isLeap();
        org.joda.time.LocalDateTime localDateTime26 = property23.roundFloorCopy();
        org.joda.time.LocalDateTime localDateTime27 = property23.roundHalfEvenCopy();
        boolean boolean28 = instant14.equals((java.lang.Object) property23);
        org.joda.time.Instant instant29 = instant14.toInstant();
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.chrono.CopticChronology copticChronology32 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone31);
        org.joda.time.DateTimeField dateTimeField33 = copticChronology32.hourOfDay();
        org.joda.time.DurationField durationField34 = copticChronology32.eras();
        org.joda.time.DateTimeField dateTimeField35 = copticChronology32.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField36 = copticChronology32.millisOfSecond();
        java.lang.String str37 = copticChronology32.toString();
        org.joda.time.LocalDateTime localDateTime38 = new org.joda.time.LocalDateTime((-30829079975L), (org.joda.time.Chronology) copticChronology32);
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.LocalDateTime localDateTime40 = new org.joda.time.LocalDateTime(chronology39);
        org.joda.time.LocalDateTime localDateTime42 = localDateTime40.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime.Property property43 = localDateTime42.weekOfWeekyear();
        java.lang.String str44 = property43.getAsText();
        org.joda.time.DateTimeFieldType dateTimeFieldType45 = property43.getFieldType();
        boolean boolean46 = localDateTime38.isSupported(dateTimeFieldType45);
        boolean boolean47 = instant14.isSupported(dateTimeFieldType45);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime13 and instant14", (dateTime13.compareTo(instant14) == 0) == dateTime13.equals(instant14));
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test583");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = copticChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = copticChronology1.getZone();
        org.joda.time.LocalDateTime localDateTime6 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) copticChronology1);
        org.joda.time.DurationField durationField7 = copticChronology1.weekyears();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(chronology8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime9.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.dayOfWeek();
        int[] intArray16 = copticChronology1.get((org.joda.time.ReadablePartial) localDateTime13, 0L);
        org.joda.time.DurationField durationField17 = copticChronology1.minutes();
        org.joda.time.Chronology chronology18 = copticChronology1.withUTC();
        org.joda.time.DateTimeField dateTimeField19 = copticChronology1.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField20 = copticChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField21 = copticChronology1.secondOfMinute();
        org.joda.time.DurationField durationField22 = copticChronology1.years();
        org.joda.time.DurationField durationField23 = copticChronology1.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField22", (durationField3.compareTo(durationField22) == 0) == durationField3.equals(durationField22));
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test584");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = copticChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = copticChronology1.getZone();
        org.joda.time.LocalDateTime localDateTime6 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) copticChronology1);
        org.joda.time.DurationField durationField7 = copticChronology1.weekyears();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(chronology8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime9.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.dayOfWeek();
        int[] intArray16 = copticChronology1.get((org.joda.time.ReadablePartial) localDateTime13, 0L);
        org.joda.time.DurationField durationField17 = copticChronology1.minutes();
        org.joda.time.Chronology chronology18 = copticChronology1.withUTC();
        long long22 = copticChronology1.add((-31449599999L), (long) 25855001, 24);
        java.lang.Object obj23 = null;
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime(obj23);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime(chronology25);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray27 = localDateTime26.getFieldTypes();
        org.joda.time.LocalDateTime localDateTime29 = localDateTime26.withMillisOfDay((int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime29.plusWeeks((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.chrono.CopticChronology copticChronology34 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone33);
        org.joda.time.DateTimeField dateTimeField35 = copticChronology34.hourOfDay();
        org.joda.time.DateTimeField dateTimeField36 = copticChronology34.secondOfDay();
        org.joda.time.DateTimeField dateTimeField37 = copticChronology34.secondOfDay();
        org.joda.time.LocalDateTime localDateTime38 = new org.joda.time.LocalDateTime((long) 10, (org.joda.time.Chronology) copticChronology34);
        int int39 = localDateTime38.getDayOfYear();
        boolean boolean40 = localDateTime31.isEqual((org.joda.time.ReadablePartial) localDateTime38);
        int int41 = localDateTime31.getYearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.chrono.CopticChronology copticChronology44 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone43);
        org.joda.time.DateTimeField dateTimeField45 = copticChronology44.hourOfDay();
        org.joda.time.DateTimeField dateTimeField46 = copticChronology44.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.Chronology chronology48 = copticChronology44.withZone(dateTimeZone47);
        org.joda.time.DateTimeField dateTimeField49 = copticChronology44.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField50 = copticChronology44.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField51 = copticChronology44.year();
        org.joda.time.DateTimeField dateTimeField52 = copticChronology44.minuteOfDay();
        org.joda.time.LocalDateTime localDateTime53 = new org.joda.time.LocalDateTime((long) 761, (org.joda.time.Chronology) copticChronology44);
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.LocalDateTime localDateTime55 = new org.joda.time.LocalDateTime(chronology54);
        org.joda.time.LocalDateTime localDateTime57 = localDateTime55.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime59 = localDateTime55.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime61 = localDateTime55.withYearOfCentury(0);
        org.joda.time.LocalDateTime.Property property62 = localDateTime61.weekyear();
        org.joda.time.LocalDateTime localDateTime64 = property62.setCopy((int) (byte) 1);
        long long65 = property62.remainder();
        org.joda.time.Chronology chronology66 = null;
        org.joda.time.LocalDateTime localDateTime67 = new org.joda.time.LocalDateTime(chronology66);
        org.joda.time.LocalDateTime localDateTime69 = localDateTime67.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime71 = localDateTime67.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime73 = localDateTime67.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant74 = null;
        org.joda.time.DateTime dateTime75 = localDateTime73.toDateTime(readableInstant74);
        org.joda.time.LocalDateTime.Property property76 = localDateTime73.millisOfDay();
        int int77 = property62.compareTo((org.joda.time.ReadablePartial) localDateTime73);
        boolean boolean79 = property62.equals((java.lang.Object) 342L);
        org.joda.time.DateTimeFieldType dateTimeFieldType80 = property62.getFieldType();
        org.joda.time.LocalDateTime.Property property81 = localDateTime53.property(dateTimeFieldType80);
        int int82 = localDateTime31.get(dateTimeFieldType80);
        org.joda.time.LocalDateTime localDateTime84 = localDateTime24.withField(dateTimeFieldType80, (int) 'a');
        org.joda.time.LocalDateTime localDateTime86 = localDateTime84.plusYears(0);
        int[] intArray88 = copticChronology1.get((org.joda.time.ReadablePartial) localDateTime84, 4346153397L);
        org.joda.time.DateTimeField dateTimeField89 = copticChronology1.millisOfSecond();
        org.joda.time.ReadablePeriod readablePeriod90 = null;
        long long93 = copticChronology1.add(readablePeriod90, (long) 26185925, 50);
        org.joda.time.DateTimeField dateTimeField94 = copticChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField95 = copticChronology1.centuryOfEra();
        org.joda.time.DurationField durationField96 = copticChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField96, durationField3, and durationField17", !(durationField96.compareTo(durationField3) == 0) || (Math.signum(durationField96.compareTo(durationField17)) == Math.signum(durationField3.compareTo(durationField17))));
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test585");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = copticChronology1.months();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.Chronology chronology5 = copticChronology1.withZone(dateTimeZone4);
        org.joda.time.DurationField durationField6 = copticChronology1.eras();
        org.joda.time.DurationField durationField7 = copticChronology1.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField6", Math.signum(durationField3.compareTo(durationField6)) == -Math.signum(durationField6.compareTo(durationField3)));
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test586");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology1.centuryOfEra();
        org.joda.time.DurationField durationField4 = copticChronology1.hours();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology1.weekOfWeekyear();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime7.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime7.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.DateTime dateTime15 = localDateTime13.toDateTime(readableInstant14);
        org.joda.time.LocalDateTime.Property property16 = localDateTime13.millisOfDay();
        org.joda.time.Interval interval17 = property16.toInterval();
        org.joda.time.DurationField durationField18 = property16.getDurationField();
        org.joda.time.LocalDateTime localDateTime19 = property16.withMaximumValue();
        long long21 = copticChronology1.set((org.joda.time.ReadablePartial) localDateTime19, 10598109377074L);
        org.joda.time.DurationField durationField22 = copticChronology1.minutes();
        org.joda.time.DurationField durationField23 = copticChronology1.weeks();
        org.joda.time.DurationField durationField24 = copticChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField24, durationField4, and durationField18", !(durationField24.compareTo(durationField4) == 0) || (Math.signum(durationField24.compareTo(durationField18)) == Math.signum(durationField4.compareTo(durationField18))));
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test587");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.chrono.CopticChronology copticChronology3 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = copticChronology3.hourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology3.secondOfDay();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology3.secondOfDay();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((long) 10, (org.joda.time.Chronology) copticChronology3);
        org.joda.time.DurationField durationField8 = copticChronology3.eras();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology3.year();
        org.joda.time.DateTimeZone dateTimeZone10 = copticChronology3.getZone();
        org.joda.time.LocalDateTime localDateTime11 = null;
        boolean boolean12 = dateTimeZone10.isLocalDateTimeGap(localDateTime11);
        int int14 = dateTimeZone10.getStandardOffset((long) 132);
        int int16 = dateTimeZone10.getStandardOffset(112L);
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(311040000000500L, dateTimeZone10);
        java.lang.String str19 = dateTimeZone10.getName(10499008678361L);
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.LocalDateTime localDateTime22 = localDateTime20.minus(readableDuration21);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 10);
        long long26 = dateTimeZone24.convertUTCToLocal((long) (short) 1);
        long long29 = dateTimeZone24.adjustOffset((long) 984, true);
        java.util.Locale locale31 = null;
        java.lang.String str32 = dateTimeZone24.getName((long) 242, locale31);
        org.joda.time.DateTime dateTime33 = localDateTime20.toDateTime(dateTimeZone24);
        org.joda.time.Instant instant34 = dateTime33.toInstant();
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.LocalDateTime localDateTime36 = new org.joda.time.LocalDateTime(chronology35);
        org.joda.time.LocalDateTime localDateTime38 = localDateTime36.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime40 = localDateTime36.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime42 = localDateTime36.withYearOfCentury(0);
        org.joda.time.LocalDateTime.Property property43 = localDateTime42.weekyear();
        org.joda.time.Interval interval44 = property43.toInterval();
        boolean boolean45 = property43.isLeap();
        org.joda.time.LocalDateTime localDateTime46 = property43.roundFloorCopy();
        org.joda.time.LocalDateTime localDateTime47 = property43.roundHalfEvenCopy();
        boolean boolean48 = instant34.equals((java.lang.Object) property43);
        int int49 = dateTimeZone10.getOffset((org.joda.time.ReadableInstant) instant34);
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.chrono.CopticChronology copticChronology51 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone50);
        org.joda.time.DateTimeField dateTimeField52 = copticChronology51.hourOfDay();
        org.joda.time.DateTimeField dateTimeField53 = copticChronology51.secondOfDay();
        org.joda.time.DateTimeField dateTimeField54 = copticChronology51.secondOfDay();
        org.joda.time.DateTimeField dateTimeField55 = copticChronology51.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField56 = copticChronology51.dayOfYear();
        org.joda.time.DateTimeField dateTimeField57 = copticChronology51.hourOfDay();
        int int58 = copticChronology51.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeZone dateTimeZone59 = copticChronology51.getZone();
        org.joda.time.DateTimeField dateTimeField60 = copticChronology51.millisOfDay();
        org.joda.time.DateTimeField dateTimeField61 = copticChronology51.secondOfDay();
        boolean boolean62 = dateTimeZone10.equals((java.lang.Object) dateTimeField61);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime33 and instant34", (dateTime33.compareTo(instant34) == 0) == dateTime33.equals(instant34));
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test588");
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
        org.joda.time.LocalDateTime localDateTime17 = property16.roundHalfCeilingCopy();
        org.joda.time.DurationField durationField18 = property16.getDurationField();
        org.joda.time.LocalDateTime localDateTime19 = property16.roundHalfEvenCopy();
        org.joda.time.DateTimeField dateTimeField20 = property16.getField();
        org.joda.time.LocalDateTime localDateTime22 = property16.addToCopy((long) 745);
        org.joda.time.LocalDateTime localDateTime23 = property16.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime24 = property16.getLocalDateTime();
        org.joda.time.ReadableDuration readableDuration25 = null;
        org.joda.time.LocalDateTime localDateTime26 = localDateTime24.plus(readableDuration25);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime24.plusDays(59);
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.chrono.CopticChronology copticChronology30 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone29);
        org.joda.time.DateTimeField dateTimeField31 = copticChronology30.hourOfDay();
        org.joda.time.DateTimeField dateTimeField32 = copticChronology30.centuryOfEra();
        org.joda.time.DurationField durationField33 = copticChronology30.millis();
        org.joda.time.DateTimeField dateTimeField34 = copticChronology30.weekOfWeekyear();
        org.joda.time.DurationField durationField35 = copticChronology30.weekyears();
        org.joda.time.DateTimeField dateTimeField36 = copticChronology30.minuteOfDay();
        org.joda.time.DurationField durationField37 = copticChronology30.hours();
        org.joda.time.DateTimeField dateTimeField38 = copticChronology30.dayOfYear();
        boolean boolean39 = localDateTime28.equals((java.lang.Object) copticChronology30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField18 and durationField33", (durationField18.compareTo(durationField33) == 0) == durationField18.equals(durationField33));
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test589");
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
        org.joda.time.LocalDateTime localDateTime17 = property16.roundHalfCeilingCopy();
        org.joda.time.DurationField durationField18 = property16.getDurationField();
        org.joda.time.LocalDateTime localDateTime19 = property16.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.minusMonths(26172895);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime19.plusWeeks(559);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.chrono.CopticChronology copticChronology25 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone24);
        org.joda.time.DateTimeField dateTimeField26 = copticChronology25.hourOfDay();
        org.joda.time.DateTimeField dateTimeField27 = copticChronology25.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField28 = copticChronology25.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.chrono.CopticChronology copticChronology32 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone31);
        org.joda.time.DateTimeField dateTimeField33 = copticChronology32.hourOfDay();
        org.joda.time.DateTimeField dateTimeField34 = copticChronology32.secondOfDay();
        org.joda.time.DateTimeField dateTimeField35 = copticChronology32.secondOfDay();
        org.joda.time.LocalDateTime localDateTime36 = new org.joda.time.LocalDateTime((long) 10, (org.joda.time.Chronology) copticChronology32);
        org.joda.time.DurationField durationField37 = copticChronology32.eras();
        org.joda.time.DateTimeField dateTimeField38 = copticChronology32.year();
        org.joda.time.DateTimeZone dateTimeZone39 = copticChronology32.getZone();
        org.joda.time.LocalDateTime localDateTime40 = null;
        boolean boolean41 = dateTimeZone39.isLocalDateTimeGap(localDateTime40);
        int int43 = dateTimeZone39.getStandardOffset((long) 132);
        int int45 = dateTimeZone39.getStandardOffset(112L);
        org.joda.time.LocalDateTime localDateTime46 = new org.joda.time.LocalDateTime(311040000000500L, dateTimeZone39);
        org.joda.time.Chronology chronology47 = copticChronology25.withZone(dateTimeZone39);
        java.util.TimeZone timeZone48 = dateTimeZone39.toTimeZone();
        org.joda.time.DateTime dateTime49 = localDateTime19.toDateTime(dateTimeZone39);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField18 and durationField37", Math.signum(durationField18.compareTo(durationField37)) == -Math.signum(durationField37.compareTo(durationField18)));
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test590");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology1.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology1.monthOfYear();
        int int5 = copticChronology1.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.yearOfEra();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology1.halfdayOfDay();
        org.joda.time.DurationField durationField8 = copticChronology1.eras();
        org.joda.time.DurationField durationField9 = copticChronology1.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField8, durationField9, and durationField8", !(durationField8.compareTo(durationField9) == 0) || (Math.signum(durationField8.compareTo(durationField8)) == Math.signum(durationField9.compareTo(durationField8))));
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test591");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.CopticChronology copticChronology2 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology2.clockhourOfDay();
        org.joda.time.DurationField durationField4 = copticChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology2.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone6 = copticChronology2.getZone();
        org.joda.time.LocalDateTime localDateTime7 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) copticChronology2);
        org.joda.time.DurationField durationField8 = copticChronology2.weekyears();
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(4346159663L, (org.joda.time.Chronology) copticChronology2);
        org.joda.time.DurationField durationField10 = copticChronology2.minutes();
        org.joda.time.DurationField durationField11 = copticChronology2.years();
        org.joda.time.DurationField durationField12 = copticChronology2.months();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField11", (durationField4.compareTo(durationField11) == 0) == durationField4.equals(durationField11));
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test592");
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
        org.joda.time.DateTimeField dateTimeField10 = copticChronology1.minuteOfHour();
        org.joda.time.DurationField durationField11 = copticChronology1.weekyears();
        java.lang.String str12 = copticChronology1.toString();
        org.joda.time.DurationField durationField13 = copticChronology1.hours();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology1.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology1.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology1.weekyear();
        org.joda.time.DurationField durationField17 = copticChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField17, durationField11, and durationField13", !(durationField17.compareTo(durationField11) == 0) || (Math.signum(durationField17.compareTo(durationField13)) == Math.signum(durationField11.compareTo(durationField13))));
    }
}

