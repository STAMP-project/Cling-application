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
        java.util.Locale locale2 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 100);
        java.lang.Integer int5 = dateTimeParserBucket4.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean7 = dateTimeParserBucket4.restoreState((java.lang.Object) dateTimeFieldType6);
        org.joda.time.Chronology chronology8 = dateTimeParserBucket4.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DurationField durationField10 = chronology8.millis();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.dayOfYear();
        org.joda.time.DurationField durationField12 = chronology8.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField12, durationField9, and durationField10", !(durationField12.compareTo(durationField9) == 0) || (Math.signum(durationField12.compareTo(durationField10)) == Math.signum(durationField9.compareTo(durationField10))));
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 100);
        java.lang.Integer int5 = dateTimeParserBucket4.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean7 = dateTimeParserBucket4.restoreState((java.lang.Object) dateTimeFieldType6);
        org.joda.time.Chronology chronology8 = dateTimeParserBucket4.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeZone dateTimeZone10 = chronology8.getZone();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.yearOfCentury();
        java.lang.String str12 = chronology8.toString();
        org.joda.time.DurationField durationField13 = chronology8.eras();
        org.joda.time.DurationField durationField14 = chronology8.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField9 and durationField13", Math.signum(durationField9.compareTo(durationField13)) == -Math.signum(durationField13.compareTo(durationField9)));
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 100);
        java.lang.Integer int5 = dateTimeParserBucket4.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean7 = dateTimeParserBucket4.restoreState((java.lang.Object) dateTimeFieldType6);
        org.joda.time.Chronology chronology8 = dateTimeParserBucket4.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeZone dateTimeZone10 = chronology8.getZone();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.yearOfCentury();
        java.lang.String str12 = chronology8.toString();
        org.joda.time.DurationField durationField13 = chronology8.eras();
        org.joda.time.DateTimeField dateTimeField14 = chronology8.centuryOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField9 and durationField13", Math.signum(durationField9.compareTo(durationField13)) == -Math.signum(durationField13.compareTo(durationField9)));
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 100);
        java.lang.Integer int5 = dateTimeParserBucket4.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean7 = dateTimeParserBucket4.restoreState((java.lang.Object) dateTimeFieldType6);
        org.joda.time.Chronology chronology8 = dateTimeParserBucket4.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeZone dateTimeZone10 = chronology8.getZone();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.yearOfCentury();
        java.lang.String str12 = chronology8.toString();
        org.joda.time.DurationField durationField13 = chronology8.eras();
        org.joda.time.DateTimeField dateTimeField14 = chronology8.yearOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField9 and durationField13", Math.signum(durationField9.compareTo(durationField13)) == -Math.signum(durationField13.compareTo(durationField9)));
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 100);
        java.lang.Integer int6 = dateTimeParserBucket5.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean8 = dateTimeParserBucket5.restoreState((java.lang.Object) dateTimeFieldType7);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket5.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        org.joda.time.DurationField durationField11 = chronology9.millis();
        org.joda.time.Chronology chronology13 = null;
        java.util.Locale locale14 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology13, locale14, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket(64713600009L, chronology9, locale14);
        org.joda.time.DurationField durationField18 = chronology9.weekyears();
        org.joda.time.DurationField durationField19 = chronology9.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField19, durationField10, and durationField11", !(durationField19.compareTo(durationField10) == 0) || (Math.signum(durationField19.compareTo(durationField11)) == Math.signum(durationField10.compareTo(durationField11))));
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 100);
        java.lang.Integer int6 = dateTimeParserBucket5.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean8 = dateTimeParserBucket5.restoreState((java.lang.Object) dateTimeFieldType7);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket5.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        org.joda.time.DateTimeField dateTimeField11 = dateTimeFieldType0.getField(chronology9);
        org.joda.time.DateTimeField dateTimeField12 = chronology9.dayOfMonth();
        org.joda.time.DurationField durationField13 = chronology9.millis();
        org.joda.time.DurationField durationField14 = chronology9.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField14, durationField10, and durationField13", !(durationField14.compareTo(durationField10) == 0) || (Math.signum(durationField14.compareTo(durationField13)) == Math.signum(durationField10.compareTo(durationField13))));
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 100);
        java.lang.Integer int6 = dateTimeParserBucket5.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean8 = dateTimeParserBucket5.restoreState((java.lang.Object) dateTimeFieldType7);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket5.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        org.joda.time.DurationField durationField11 = chronology9.millis();
        org.joda.time.Chronology chronology13 = null;
        java.util.Locale locale14 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology13, locale14, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket(64713600009L, chronology9, locale14);
        org.joda.time.DurationField durationField18 = chronology9.millis();
        org.joda.time.DurationField durationField19 = chronology9.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField19, durationField10, and durationField11", !(durationField19.compareTo(durationField10) == 0) || (Math.signum(durationField19.compareTo(durationField11)) == Math.signum(durationField10.compareTo(durationField11))));
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 100);
        java.lang.Integer int6 = dateTimeParserBucket5.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean8 = dateTimeParserBucket5.restoreState((java.lang.Object) dateTimeFieldType7);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket5.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.years();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.Chronology chronology14 = null;
        java.util.Locale locale15 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology14, locale15, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket18 = new org.joda.time.format.DateTimeParserBucket(100L, chronology12, locale15);
        java.lang.String str19 = locale15.getScript();
        java.lang.String str21 = locale15.getExtension('u');
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket24 = new org.joda.time.format.DateTimeParserBucket(259200117L, chronology9, locale15, (java.lang.Integer) 100, (int) (byte) 1);
        org.joda.time.DurationField durationField25 = chronology9.centuries();
        org.joda.time.DateTimeField dateTimeField26 = chronology9.secondOfDay();
        org.joda.time.DurationField durationField27 = chronology9.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField27, durationField10, and durationField25", !(durationField27.compareTo(durationField10) == 0) || (Math.signum(durationField27.compareTo(durationField25)) == Math.signum(durationField10.compareTo(durationField25))));
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.DurationFieldType durationFieldType1 = dateTimeFieldType0.getDurationType();
        org.joda.time.Chronology chronology4 = null;
        java.util.Locale locale5 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology4, locale5, (java.lang.Integer) 100);
        java.lang.Integer int8 = dateTimeParserBucket7.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean10 = dateTimeParserBucket7.restoreState((java.lang.Object) dateTimeFieldType9);
        org.joda.time.Chronology chronology11 = dateTimeParserBucket7.getChronology();
        org.joda.time.DurationField durationField12 = chronology11.days();
        org.joda.time.DurationField durationField13 = chronology11.millis();
        org.joda.time.Chronology chronology15 = null;
        java.util.Locale locale16 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket18 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology15, locale16, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket19 = new org.joda.time.format.DateTimeParserBucket(64713600009L, chronology11, locale16);
        org.joda.time.Chronology chronology21 = null;
        java.util.Locale locale22 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket24 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology21, locale22, (java.lang.Integer) 100);
        java.lang.Integer int25 = dateTimeParserBucket24.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean27 = dateTimeParserBucket24.restoreState((java.lang.Object) dateTimeFieldType26);
        org.joda.time.Chronology chronology28 = dateTimeParserBucket24.getChronology();
        org.joda.time.DurationField durationField29 = chronology28.days();
        org.joda.time.DurationField durationField30 = chronology28.hours();
        org.joda.time.DateTimeZone dateTimeZone31 = chronology28.getZone();
        java.util.TimeZone timeZone32 = dateTimeZone31.toTimeZone();
        org.joda.time.Chronology chronology33 = chronology11.withZone(dateTimeZone31);
        org.joda.time.DateTimeField dateTimeField34 = dateTimeFieldType0.getField(chronology11);
        org.joda.time.Chronology chronology37 = null;
        java.util.Locale locale38 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket40 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology37, locale38, (java.lang.Integer) 100);
        java.lang.Integer int41 = dateTimeParserBucket40.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType42 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean43 = dateTimeParserBucket40.restoreState((java.lang.Object) dateTimeFieldType42);
        org.joda.time.Chronology chronology44 = dateTimeParserBucket40.getChronology();
        org.joda.time.DurationField durationField45 = chronology44.days();
        org.joda.time.DurationField durationField46 = chronology44.millis();
        org.joda.time.Chronology chronology48 = null;
        java.util.Locale locale49 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket51 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology48, locale49, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket52 = new org.joda.time.format.DateTimeParserBucket(64713600009L, chronology44, locale49);
        org.joda.time.DateTimeField dateTimeField53 = chronology44.minuteOfDay();
        org.joda.time.DurationField durationField54 = chronology44.days();
        org.joda.time.DateTimeField dateTimeField55 = chronology44.minuteOfDay();
        boolean boolean56 = dateTimeFieldType0.isSupported(chronology44);
        org.joda.time.DateTimeZone dateTimeZone57 = chronology44.getZone();
        org.joda.time.DurationField durationField58 = chronology44.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField58, durationField12, and durationField13", !(durationField58.compareTo(durationField12) == 0) || (Math.signum(durationField58.compareTo(durationField13)) == Math.signum(durationField12.compareTo(durationField13))));
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        java.lang.Integer int7 = dateTimeParserBucket6.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean9 = dateTimeParserBucket6.restoreState((java.lang.Object) dateTimeFieldType8);
        org.joda.time.Chronology chronology10 = dateTimeParserBucket6.getChronology();
        org.joda.time.DurationField durationField11 = chronology10.days();
        org.joda.time.DateTimeZone dateTimeZone12 = chronology10.getZone();
        org.joda.time.DateTimeField dateTimeField13 = chronology10.yearOfCentury();
        java.lang.String str14 = chronology10.toString();
        org.joda.time.Chronology chronology15 = chronology10.withUTC();
        org.joda.time.DateTimeField dateTimeField16 = chronology10.secondOfDay();
        boolean boolean17 = dateTimeFieldType1.isSupported(chronology10);
        java.lang.String str18 = chronology10.toString();
        org.joda.time.DurationField durationField19 = chronology10.eras();
        org.joda.time.Chronology chronology23 = null;
        java.util.Locale locale24 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket26 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology23, locale24, (java.lang.Integer) 100);
        java.lang.Integer int27 = dateTimeParserBucket26.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean29 = dateTimeParserBucket26.restoreState((java.lang.Object) dateTimeFieldType28);
        org.joda.time.Chronology chronology30 = dateTimeParserBucket26.getChronology();
        org.joda.time.DurationField durationField31 = chronology30.days();
        org.joda.time.DateTimeZone dateTimeZone32 = chronology30.getZone();
        org.joda.time.Chronology chronology34 = null;
        java.util.Locale locale35 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket37 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology34, locale35, (java.lang.Integer) 100);
        java.lang.String str38 = locale35.getCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket41 = new org.joda.time.format.DateTimeParserBucket(0L, chronology30, locale35, (java.lang.Integer) 100, (int) (byte) 1);
        org.joda.time.DateTimeField dateTimeField42 = chronology30.centuryOfEra();
        java.util.Locale locale43 = java.util.Locale.ITALY;
        java.lang.String str44 = locale43.getScript();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket46 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology30, locale43, (java.lang.Integer) 31);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket49 = new org.joda.time.format.DateTimeParserBucket((long) 2922789, chronology10, locale43, (java.lang.Integer) 1970, (-1));
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField11 and durationField19", Math.signum(durationField11.compareTo(durationField19)) == -Math.signum(durationField19.compareTo(durationField11)));
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 100);
        java.lang.Integer int6 = dateTimeParserBucket5.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean8 = dateTimeParserBucket5.restoreState((java.lang.Object) dateTimeFieldType7);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket5.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        org.joda.time.DateTimeField dateTimeField11 = dateTimeFieldType0.getField(chronology9);
        org.joda.time.DateTimeField dateTimeField12 = chronology9.dayOfMonth();
        org.joda.time.DurationField durationField13 = chronology9.seconds();
        org.joda.time.DateTimeField dateTimeField14 = chronology9.millisOfDay();
        org.joda.time.DurationField durationField15 = chronology9.halfdays();
        org.joda.time.DurationField durationField16 = chronology9.days();
        org.joda.time.DurationField durationField17 = chronology9.days();
        org.joda.time.DurationField durationField18 = chronology9.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField18, durationField10, and durationField13", !(durationField18.compareTo(durationField10) == 0) || (Math.signum(durationField18.compareTo(durationField13)) == Math.signum(durationField10.compareTo(durationField13))));
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 100);
        java.lang.Integer int5 = dateTimeParserBucket4.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean7 = dateTimeParserBucket4.restoreState((java.lang.Object) dateTimeFieldType6);
        org.joda.time.Chronology chronology8 = dateTimeParserBucket4.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeZone dateTimeZone10 = chronology8.getZone();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.yearOfCentury();
        java.lang.String str12 = chronology8.toString();
        org.joda.time.DurationField durationField13 = chronology8.eras();
        org.joda.time.DateTimeField dateTimeField14 = chronology8.yearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField9 and durationField13", Math.signum(durationField9.compareTo(durationField13)) == -Math.signum(durationField13.compareTo(durationField9)));
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 100);
        java.lang.Integer int5 = dateTimeParserBucket4.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean7 = dateTimeParserBucket4.restoreState((java.lang.Object) dateTimeFieldType6);
        org.joda.time.Chronology chronology8 = dateTimeParserBucket4.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeZone dateTimeZone10 = chronology8.getZone();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.yearOfCentury();
        org.joda.time.DurationField durationField12 = chronology8.years();
        org.joda.time.DurationField durationField13 = chronology8.weekyears();
        org.joda.time.DurationField durationField14 = chronology8.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField12 and durationField13", (durationField12.compareTo(durationField13) == 0) == durationField12.equals(durationField13));
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 100);
        java.lang.Integer int6 = dateTimeParserBucket5.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean8 = dateTimeParserBucket5.restoreState((java.lang.Object) dateTimeFieldType7);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket5.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        org.joda.time.DateTimeField dateTimeField11 = dateTimeFieldType0.getField(chronology9);
        org.joda.time.DateTimeField dateTimeField12 = chronology9.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField13 = chronology9.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField14 = chronology9.yearOfEra();
        org.joda.time.DurationField durationField15 = chronology9.weeks();
        org.joda.time.DurationField durationField16 = chronology9.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField16, durationField10, and durationField15", !(durationField16.compareTo(durationField10) == 0) || (Math.signum(durationField16.compareTo(durationField15)) == Math.signum(durationField10.compareTo(durationField15))));
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 100);
        java.lang.Integer int6 = dateTimeParserBucket5.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean8 = dateTimeParserBucket5.restoreState((java.lang.Object) dateTimeFieldType7);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket5.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        org.joda.time.DateTimeZone dateTimeZone11 = chronology9.getZone();
        org.joda.time.DateTimeField dateTimeField12 = chronology9.monthOfYear();
        org.joda.time.DateTimeField dateTimeField13 = chronology9.weekyear();
        org.joda.time.DurationField durationField14 = chronology9.minutes();
        org.joda.time.DateTimeField dateTimeField15 = dateTimeFieldType0.getField(chronology9);
        org.joda.time.DateTimeField dateTimeField16 = chronology9.minuteOfDay();
        org.joda.time.DurationField durationField17 = chronology9.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField17, durationField10, and durationField14", !(durationField17.compareTo(durationField10) == 0) || (Math.signum(durationField17.compareTo(durationField14)) == Math.signum(durationField10.compareTo(durationField14))));
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 100);
        java.lang.Integer int6 = dateTimeParserBucket5.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean8 = dateTimeParserBucket5.restoreState((java.lang.Object) dateTimeFieldType7);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket5.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        org.joda.time.DurationField durationField11 = chronology9.millis();
        org.joda.time.Chronology chronology13 = null;
        java.util.Locale locale14 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology13, locale14, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket(64713600009L, chronology9, locale14);
        org.joda.time.Chronology chronology19 = null;
        java.util.Locale locale20 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket22 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology19, locale20, (java.lang.Integer) 100);
        java.lang.Integer int23 = dateTimeParserBucket22.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean25 = dateTimeParserBucket22.restoreState((java.lang.Object) dateTimeFieldType24);
        org.joda.time.Chronology chronology26 = dateTimeParserBucket22.getChronology();
        org.joda.time.DurationField durationField27 = chronology26.days();
        org.joda.time.DurationField durationField28 = chronology26.hours();
        org.joda.time.DateTimeZone dateTimeZone29 = chronology26.getZone();
        java.util.TimeZone timeZone30 = dateTimeZone29.toTimeZone();
        org.joda.time.Chronology chronology31 = chronology9.withZone(dateTimeZone29);
        org.joda.time.DateTimeField dateTimeField32 = chronology9.year();
        org.joda.time.Chronology chronology33 = chronology9.withUTC();
        org.joda.time.DurationField durationField34 = chronology9.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField34, durationField10, and durationField11", !(durationField34.compareTo(durationField10) == 0) || (Math.signum(durationField34.compareTo(durationField11)) == Math.signum(durationField10.compareTo(durationField11))));
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 100);
        java.lang.Integer int6 = dateTimeParserBucket5.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean8 = dateTimeParserBucket5.restoreState((java.lang.Object) dateTimeFieldType7);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket5.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        long long14 = chronology9.add(readablePeriod11, 0L, 0);
        org.joda.time.DateTimeField dateTimeField15 = chronology9.yearOfEra();
        java.util.Locale.Builder builder16 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder17 = builder16.clear();
        java.util.Locale locale18 = builder17.build();
        java.util.Set<java.lang.Character> charSet19 = locale18.getExtensionKeys();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket21 = new org.joda.time.format.DateTimeParserBucket((-61409041074993L), chronology9, locale18, (java.lang.Integer) 1497);
        org.joda.time.DurationField durationField22 = chronology9.eras();
        org.joda.time.DurationField durationField23 = chronology9.months();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField10 and durationField22", Math.signum(durationField10.compareTo(durationField22)) == -Math.signum(durationField22.compareTo(durationField10)));
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 100);
        java.lang.Integer int6 = dateTimeParserBucket5.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean8 = dateTimeParserBucket5.restoreState((java.lang.Object) dateTimeFieldType7);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket5.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        long long14 = chronology9.add(readablePeriod11, 0L, 0);
        org.joda.time.DateTimeField dateTimeField15 = chronology9.yearOfEra();
        java.util.Locale.Builder builder16 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder17 = builder16.clear();
        java.util.Locale locale18 = builder17.build();
        java.util.Set<java.lang.Character> charSet19 = locale18.getExtensionKeys();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket21 = new org.joda.time.format.DateTimeParserBucket((-61409041074993L), chronology9, locale18, (java.lang.Integer) 1497);
        org.joda.time.DurationField durationField22 = chronology9.eras();
        org.joda.time.DurationField durationField23 = chronology9.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField10 and durationField22", Math.signum(durationField10.compareTo(durationField22)) == -Math.signum(durationField22.compareTo(durationField10)));
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 100);
        java.lang.Integer int5 = dateTimeParserBucket4.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean7 = dateTimeParserBucket4.restoreState((java.lang.Object) dateTimeFieldType6);
        org.joda.time.Chronology chronology8 = dateTimeParserBucket4.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeZone dateTimeZone10 = chronology8.getZone();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.yearOfCentury();
        org.joda.time.DurationField durationField12 = chronology8.years();
        org.joda.time.DateTimeField dateTimeField13 = chronology8.clockhourOfHalfday();
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = dateTimeField13.getType();
        org.joda.time.ReadablePartial readablePartial15 = null;
        org.joda.time.Chronology chronology18 = null;
        java.util.Locale locale19 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket21 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology18, locale19, (java.lang.Integer) 100);
        java.lang.Integer int22 = dateTimeParserBucket21.getPivotYear();
        org.joda.time.DateTimeField dateTimeField23 = null;
        dateTimeParserBucket21.saveField(dateTimeField23, (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone26 = dateTimeParserBucket21.getZone();
        org.joda.time.Chronology chronology28 = null;
        java.util.Locale locale29 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket31 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology28, locale29, (java.lang.Integer) 100);
        java.lang.Integer int32 = dateTimeParserBucket31.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean34 = dateTimeParserBucket31.restoreState((java.lang.Object) dateTimeFieldType33);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.DateTimeField dateTimeField36 = dateTimeFieldType33.getField(chronology35);
        java.util.Locale locale38 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet39 = locale38.getUnicodeLocaleAttributes();
        org.joda.time.Chronology chronology41 = null;
        java.util.Locale locale42 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket44 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology41, locale42, (java.lang.Integer) 100);
        java.lang.String str45 = locale38.getDisplayScript(locale42);
        java.lang.String str46 = dateTimeField36.getAsShortText(10, locale38);
        dateTimeParserBucket21.saveField(dateTimeField36, (int) (byte) 1);
        org.joda.time.DurationField durationField49 = dateTimeField36.getRangeDurationField();
        long long51 = dateTimeField36.roundHalfEven((long) (short) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType52 = dateTimeField36.getType();
        java.util.Locale locale54 = null;
        java.lang.String str55 = dateTimeField36.getAsText((int) '#', locale54);
        long long57 = dateTimeField36.roundFloor((-259200000L));
        org.joda.time.ReadablePartial readablePartial58 = null;
        org.joda.time.Chronology chronology60 = null;
        java.util.Locale locale61 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket63 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology60, locale61, (java.lang.Integer) 100);
        java.lang.Integer int64 = dateTimeParserBucket63.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType65 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean66 = dateTimeParserBucket63.restoreState((java.lang.Object) dateTimeFieldType65);
        org.joda.time.Chronology chronology67 = null;
        org.joda.time.DateTimeField dateTimeField68 = dateTimeFieldType65.getField(chronology67);
        long long71 = dateTimeField68.getDifferenceAsLong((long) ' ', (long) 1);
        org.joda.time.ReadablePartial readablePartial72 = null;
        java.util.Locale locale74 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str75 = dateTimeField68.getAsShortText(readablePartial72, (int) ' ', locale74);
        org.joda.time.ReadablePartial readablePartial76 = null;
        int int77 = dateTimeField68.getMinimumValue(readablePartial76);
        org.joda.time.DurationField durationField78 = dateTimeField68.getRangeDurationField();
        org.joda.time.ReadablePartial readablePartial79 = null;
        int[] intArray80 = new int[] {};
        int int81 = dateTimeField68.getMinimumValue(readablePartial79, intArray80);
        int int82 = dateTimeField36.getMinimumValue(readablePartial58, intArray80);
        int[] intArray84 = dateTimeField13.addWrapPartial(readablePartial15, 193980000, intArray80, 0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField12 and durationField49", (durationField12.compareTo(durationField49) == 0) == durationField12.equals(durationField49));
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        java.lang.Integer int7 = dateTimeParserBucket6.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean9 = dateTimeParserBucket6.restoreState((java.lang.Object) dateTimeFieldType8);
        org.joda.time.Chronology chronology10 = dateTimeParserBucket6.getChronology();
        org.joda.time.DurationField durationField11 = chronology10.days();
        org.joda.time.DateTimeField dateTimeField12 = dateTimeFieldType1.getField(chronology10);
        org.joda.time.DateTimeField dateTimeField13 = chronology10.dayOfMonth();
        org.joda.time.DurationField durationField14 = chronology10.seconds();
        org.joda.time.DateTimeField dateTimeField15 = chronology10.millisOfDay();
        org.joda.time.DateTimeField dateTimeField16 = chronology10.year();
        java.util.Locale locale17 = java.util.Locale.ITALIAN;
        java.util.Locale locale18 = locale17.stripExtensions();
        org.joda.time.Chronology chronology20 = null;
        java.util.Locale locale21 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket23 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology20, locale21, (java.lang.Integer) 100);
        java.lang.Integer int24 = dateTimeParserBucket23.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean26 = dateTimeParserBucket23.restoreState((java.lang.Object) dateTimeFieldType25);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.DateTimeField dateTimeField28 = dateTimeFieldType25.getField(chronology27);
        long long30 = dateTimeField28.roundHalfEven(1L);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.Chronology chronology35 = null;
        java.util.Locale locale36 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket38 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology35, locale36, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket39 = new org.joda.time.format.DateTimeParserBucket(100L, chronology33, locale36);
        java.lang.String str40 = dateTimeField28.getAsText((long) (short) 0, locale36);
        java.lang.String str41 = locale18.getDisplayVariant(locale36);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket43 = new org.joda.time.format.DateTimeParserBucket((long) 'u', chronology10, locale36, (java.lang.Integer) 8);
        org.joda.time.DateTimeField dateTimeField44 = chronology10.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField45 = chronology10.weekyear();
        org.joda.time.DurationField durationField46 = chronology10.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField46, durationField11, and durationField14", !(durationField46.compareTo(durationField11) == 0) || (Math.signum(durationField46.compareTo(durationField14)) == Math.signum(durationField11.compareTo(durationField14))));
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 100);
        java.lang.Integer int6 = dateTimeParserBucket5.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean8 = dateTimeParserBucket5.restoreState((java.lang.Object) dateTimeFieldType7);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket5.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        long long14 = chronology9.add(readablePeriod11, 0L, 0);
        org.joda.time.DateTimeField dateTimeField15 = chronology9.yearOfEra();
        java.util.Locale.Builder builder16 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder17 = builder16.clear();
        java.util.Locale locale18 = builder17.build();
        java.util.Set<java.lang.Character> charSet19 = locale18.getExtensionKeys();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket21 = new org.joda.time.format.DateTimeParserBucket((-61409041074993L), chronology9, locale18, (java.lang.Integer) 1497);
        org.joda.time.DurationField durationField22 = chronology9.eras();
        org.joda.time.DateTimeField dateTimeField23 = chronology9.dayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField10 and durationField22", Math.signum(durationField10.compareTo(durationField22)) == -Math.signum(durationField22.compareTo(durationField10)));
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 100);
        java.lang.Integer int5 = dateTimeParserBucket4.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean7 = dateTimeParserBucket4.restoreState((java.lang.Object) dateTimeFieldType6);
        org.joda.time.Chronology chronology8 = dateTimeParserBucket4.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeZone dateTimeZone10 = chronology8.getZone();
        org.joda.time.DurationField durationField11 = chronology8.months();
        org.joda.time.DurationField durationField12 = chronology8.hours();
        org.joda.time.DateTimeField dateTimeField13 = chronology8.hourOfDay();
        org.joda.time.DateTimeField dateTimeField14 = chronology8.yearOfEra();
        org.joda.time.DurationField durationField15 = chronology8.millis();
        org.joda.time.DurationField durationField16 = chronology8.years();
        org.joda.time.DurationField durationField17 = chronology8.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField17, durationField9, and durationField11", !(durationField17.compareTo(durationField9) == 0) || (Math.signum(durationField17.compareTo(durationField11)) == Math.signum(durationField9.compareTo(durationField11))));
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 100);
        java.lang.Integer int6 = dateTimeParserBucket5.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean8 = dateTimeParserBucket5.restoreState((java.lang.Object) dateTimeFieldType7);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket5.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        org.joda.time.DateTimeField dateTimeField11 = dateTimeFieldType0.getField(chronology9);
        org.joda.time.DateTimeField dateTimeField12 = chronology9.dayOfMonth();
        org.joda.time.DurationField durationField13 = chronology9.seconds();
        org.joda.time.DateTimeField dateTimeField14 = chronology9.millisOfDay();
        org.joda.time.DurationField durationField15 = chronology9.halfdays();
        org.joda.time.DurationField durationField16 = chronology9.days();
        org.joda.time.DurationField durationField17 = chronology9.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField17, durationField10, and durationField13", !(durationField17.compareTo(durationField10) == 0) || (Math.signum(durationField17.compareTo(durationField13)) == Math.signum(durationField10.compareTo(durationField13))));
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        java.lang.Integer int7 = dateTimeParserBucket6.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean9 = dateTimeParserBucket6.restoreState((java.lang.Object) dateTimeFieldType8);
        org.joda.time.Chronology chronology10 = dateTimeParserBucket6.getChronology();
        org.joda.time.DurationField durationField11 = chronology10.days();
        org.joda.time.DurationField durationField12 = chronology10.millis();
        org.joda.time.Chronology chronology14 = null;
        java.util.Locale locale15 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology14, locale15, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket18 = new org.joda.time.format.DateTimeParserBucket(64713600009L, chronology10, locale15);
        org.joda.time.DateTimeField dateTimeField19 = chronology10.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField20 = chronology10.weekyear();
        java.lang.String str21 = chronology10.toString();
        java.util.Locale.Category category22 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale23 = java.util.Locale.GERMANY;
        java.lang.String str24 = locale23.getDisplayCountry();
        java.util.Locale.setDefault(category22, locale23);
        java.util.Locale locale26 = java.util.Locale.GERMAN;
        java.util.Locale locale27 = java.util.Locale.getDefault();
        java.lang.String str28 = locale26.getDisplayVariant(locale27);
        java.util.Locale.setDefault(category22, locale26);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket31 = new org.joda.time.format.DateTimeParserBucket(35L, chronology10, locale26, (java.lang.Integer) 3);
        org.joda.time.DurationField durationField32 = chronology10.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField32, durationField11, and durationField12", !(durationField32.compareTo(durationField11) == 0) || (Math.signum(durationField32.compareTo(durationField12)) == Math.signum(durationField11.compareTo(durationField12))));
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 100);
        java.lang.Integer int6 = dateTimeParserBucket5.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean8 = dateTimeParserBucket5.restoreState((java.lang.Object) dateTimeFieldType7);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket5.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        org.joda.time.DurationField durationField11 = chronology9.millis();
        org.joda.time.Chronology chronology13 = null;
        java.util.Locale locale14 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology13, locale14, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket(64713600009L, chronology9, locale14);
        org.joda.time.DurationField durationField18 = chronology9.weekyears();
        org.joda.time.DateTimeField dateTimeField19 = chronology9.secondOfDay();
        org.joda.time.DurationField durationField20 = chronology9.hours();
        org.joda.time.DurationField durationField21 = chronology9.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField21, durationField10, and durationField11", !(durationField21.compareTo(durationField10) == 0) || (Math.signum(durationField21.compareTo(durationField11)) == Math.signum(durationField10.compareTo(durationField11))));
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 100);
        java.lang.Integer int6 = dateTimeParserBucket5.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean8 = dateTimeParserBucket5.restoreState((java.lang.Object) dateTimeFieldType7);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket5.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        org.joda.time.DateTimeField dateTimeField11 = dateTimeFieldType0.getField(chronology9);
        org.joda.time.DateTimeField dateTimeField12 = chronology9.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField13 = chronology9.millisOfDay();
        long long17 = chronology9.add(9L, (long) 2, (int) (byte) 1);
        org.joda.time.DateTimeField dateTimeField18 = chronology9.clockhourOfDay();
        org.joda.time.DurationField durationField19 = chronology9.weeks();
        org.joda.time.DurationField durationField20 = chronology9.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField20, durationField10, and durationField19", !(durationField20.compareTo(durationField10) == 0) || (Math.signum(durationField20.compareTo(durationField19)) == Math.signum(durationField10.compareTo(durationField19))));
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 100);
        java.lang.Integer int6 = dateTimeParserBucket5.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean8 = dateTimeParserBucket5.restoreState((java.lang.Object) dateTimeFieldType7);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket5.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        org.joda.time.DateTimeField dateTimeField11 = dateTimeFieldType0.getField(chronology9);
        org.joda.time.DateTimeField dateTimeField12 = chronology9.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField13 = chronology9.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField14 = chronology9.yearOfEra();
        org.joda.time.DateTimeField dateTimeField15 = chronology9.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField16 = chronology9.dayOfYear();
        org.joda.time.DateTimeField dateTimeField17 = chronology9.hourOfDay();
        org.joda.time.DurationField durationField18 = chronology9.centuries();
        org.joda.time.DurationField durationField19 = chronology9.weekyears();
        org.joda.time.DateTimeField dateTimeField20 = chronology9.weekyear();
        org.joda.time.DateTimeField dateTimeField21 = chronology9.clockhourOfHalfday();
        org.joda.time.DurationField durationField22 = chronology9.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField22, durationField10, and durationField18", !(durationField22.compareTo(durationField10) == 0) || (Math.signum(durationField22.compareTo(durationField18)) == Math.signum(durationField10.compareTo(durationField18))));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 100);
        java.lang.Integer int5 = dateTimeParserBucket4.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean7 = dateTimeParserBucket4.restoreState((java.lang.Object) dateTimeFieldType6);
        org.joda.time.Chronology chronology8 = dateTimeParserBucket4.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.ReadableInstant readableInstant12 = null;
        int int13 = dateTimeZone11.getOffset(readableInstant12);
        org.joda.time.ReadableInstant readableInstant14 = null;
        int int15 = dateTimeZone11.getOffset(readableInstant14);
        org.joda.time.Chronology chronology18 = null;
        java.util.Locale locale19 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket21 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology18, locale19, (java.lang.Integer) 100);
        java.lang.String str22 = dateTimeZone11.getShortName(10L, locale19);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.Chronology chronology27 = null;
        java.util.Locale locale28 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket30 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology27, locale28, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket31 = new org.joda.time.format.DateTimeParserBucket(100L, chronology25, locale28);
        java.lang.String str32 = locale28.getScript();
        java.lang.String str33 = locale28.getISO3Country();
        java.lang.String str34 = locale28.getDisplayScript();
        java.lang.String str35 = dateTimeZone11.getName((long) 53, locale28);
        org.joda.time.Chronology chronology36 = chronology8.withZone(dateTimeZone11);
        org.joda.time.Chronology chronology37 = chronology36.withUTC();
        org.joda.time.DurationField durationField38 = chronology37.eras();
        org.joda.time.DateTimeField dateTimeField39 = chronology37.secondOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField9 and durationField38", Math.signum(durationField9.compareTo(durationField38)) == -Math.signum(durationField38.compareTo(durationField9)));
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 100);
        java.lang.Integer int6 = dateTimeParserBucket5.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean8 = dateTimeParserBucket5.restoreState((java.lang.Object) dateTimeFieldType7);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket5.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        org.joda.time.DateTimeField dateTimeField11 = dateTimeFieldType0.getField(chronology9);
        org.joda.time.DateTimeField dateTimeField12 = chronology9.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField13 = chronology9.weekOfWeekyear();
        java.lang.String str14 = chronology9.toString();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        long long18 = dateTimeZone16.convertUTCToLocal((long) (short) -1);
        org.joda.time.Chronology chronology20 = null;
        java.util.Locale locale21 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket23 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology20, locale21, (java.lang.Integer) 100);
        java.lang.Integer int24 = dateTimeParserBucket23.getPivotYear();
        org.joda.time.DateTimeField dateTimeField25 = null;
        dateTimeParserBucket23.saveField(dateTimeField25, (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone28 = dateTimeParserBucket23.getZone();
        long long30 = dateTimeZone16.getMillisKeepLocal(dateTimeZone28, 97L);
        java.lang.String str32 = dateTimeZone16.getShortName(0L);
        java.util.TimeZone timeZone34 = null;
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forTimeZone(timeZone34);
        java.util.Locale locale40 = new java.util.Locale("weekOfWeekyear", "UTC", "+00:00");
        boolean boolean41 = locale40.hasExtensions();
        org.joda.time.Chronology chronology43 = null;
        java.util.Locale locale44 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket46 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology43, locale44, (java.lang.Integer) 100);
        java.lang.String str47 = locale40.getDisplayCountry(locale44);
        java.lang.String str48 = dateTimeZone35.getShortName((long) (short) 1, locale44);
        java.lang.String str49 = dateTimeZone16.getName((long) 'u', locale44);
        org.joda.time.Chronology chronology50 = chronology9.withZone(dateTimeZone16);
        org.joda.time.DurationField durationField51 = chronology50.seconds();
        org.joda.time.DurationField durationField52 = chronology50.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField52, durationField10, and durationField51", !(durationField52.compareTo(durationField10) == 0) || (Math.signum(durationField52.compareTo(durationField51)) == Math.signum(durationField10.compareTo(durationField51))));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        java.lang.Integer int7 = dateTimeParserBucket6.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean9 = dateTimeParserBucket6.restoreState((java.lang.Object) dateTimeFieldType8);
        org.joda.time.Chronology chronology10 = dateTimeParserBucket6.getChronology();
        org.joda.time.DurationField durationField11 = chronology10.days();
        org.joda.time.DateTimeField dateTimeField12 = dateTimeFieldType1.getField(chronology10);
        org.joda.time.DateTimeField dateTimeField13 = chronology10.dayOfMonth();
        org.joda.time.DurationField durationField14 = chronology10.seconds();
        org.joda.time.DateTimeField dateTimeField15 = chronology10.millisOfDay();
        org.joda.time.DurationField durationField16 = chronology10.days();
        org.joda.time.Chronology chronology18 = null;
        java.util.Locale locale19 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket21 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology18, locale19, (java.lang.Integer) 100);
        java.lang.Integer int22 = dateTimeParserBucket21.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean24 = dateTimeParserBucket21.restoreState((java.lang.Object) dateTimeFieldType23);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateTimeField dateTimeField26 = dateTimeFieldType23.getField(chronology25);
        long long28 = dateTimeField26.roundHalfEven(1L);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.Chronology chronology33 = null;
        java.util.Locale locale34 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket36 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology33, locale34, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket37 = new org.joda.time.format.DateTimeParserBucket(100L, chronology31, locale34);
        java.lang.String str38 = dateTimeField26.getAsText((long) (short) 0, locale34);
        java.util.Locale.setDefault(locale34);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket40 = new org.joda.time.format.DateTimeParserBucket(3599999L, chronology10, locale34);
        org.joda.time.DateTimeField dateTimeField41 = chronology10.dayOfYear();
        org.joda.time.DurationField durationField42 = chronology10.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField42, durationField11, and durationField14", !(durationField42.compareTo(durationField11) == 0) || (Math.signum(durationField42.compareTo(durationField14)) == Math.signum(durationField11.compareTo(durationField14))));
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        java.lang.Integer int7 = dateTimeParserBucket6.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean9 = dateTimeParserBucket6.restoreState((java.lang.Object) dateTimeFieldType8);
        org.joda.time.Chronology chronology10 = dateTimeParserBucket6.getChronology();
        org.joda.time.DurationField durationField11 = chronology10.years();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.Chronology chronology15 = null;
        java.util.Locale locale16 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket18 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology15, locale16, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket19 = new org.joda.time.format.DateTimeParserBucket(100L, chronology13, locale16);
        java.lang.String str20 = locale16.getScript();
        java.lang.String str22 = locale16.getExtension('u');
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket25 = new org.joda.time.format.DateTimeParserBucket(259200117L, chronology10, locale16, (java.lang.Integer) 100, (int) (byte) 1);
        org.joda.time.DateTimeField dateTimeField26 = chronology10.hourOfHalfday();
        org.joda.time.DurationField durationField27 = chronology10.minutes();
        java.util.Locale.Builder builder28 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder29 = builder28.clear();
        java.util.Locale locale30 = builder29.build();
        java.util.Locale locale31 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str32 = locale30.getDisplayLanguage(locale31);
        java.util.Set<java.lang.String> strSet33 = locale31.getUnicodeLocaleKeys();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket36 = new org.joda.time.format.DateTimeParserBucket(2L, chronology10, locale31, (java.lang.Integer) 100, (int) (short) 10);
        long long40 = chronology10.add(32054400100L, 604800053L, (int) 'u');
        org.joda.time.DurationField durationField41 = chronology10.seconds();
        org.joda.time.DurationField durationField42 = chronology10.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField42, durationField11, and durationField27", !(durationField42.compareTo(durationField11) == 0) || (Math.signum(durationField42.compareTo(durationField27)) == Math.signum(durationField11.compareTo(durationField27))));
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 100);
        java.lang.Integer int6 = dateTimeParserBucket5.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean8 = dateTimeParserBucket5.restoreState((java.lang.Object) dateTimeFieldType7);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket5.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        org.joda.time.DurationField durationField11 = chronology9.millis();
        org.joda.time.Chronology chronology13 = null;
        java.util.Locale locale14 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology13, locale14, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket(64713600009L, chronology9, locale14);
        org.joda.time.DateTimeField dateTimeField18 = chronology9.minuteOfDay();
        org.joda.time.DurationField durationField19 = chronology9.days();
        org.joda.time.DateTimeField dateTimeField20 = chronology9.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField21 = chronology9.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField22 = chronology9.dayOfYear();
        org.joda.time.DateTimeField dateTimeField23 = chronology9.hourOfHalfday();
        org.joda.time.DurationField durationField24 = chronology9.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField24, durationField10, and durationField11", !(durationField24.compareTo(durationField10) == 0) || (Math.signum(durationField24.compareTo(durationField11)) == Math.signum(durationField10.compareTo(durationField11))));
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 100);
        java.lang.Integer int6 = dateTimeParserBucket5.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean8 = dateTimeParserBucket5.restoreState((java.lang.Object) dateTimeFieldType7);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket5.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        org.joda.time.DurationField durationField11 = chronology9.millis();
        org.joda.time.Chronology chronology13 = null;
        java.util.Locale locale14 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology13, locale14, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket(64713600009L, chronology9, locale14);
        org.joda.time.DateTimeField dateTimeField18 = chronology9.minuteOfDay();
        org.joda.time.DurationField durationField19 = chronology9.days();
        java.lang.String str20 = chronology9.toString();
        org.joda.time.DurationField durationField21 = chronology9.hours();
        org.joda.time.DurationField durationField22 = chronology9.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField22, durationField10, and durationField11", !(durationField22.compareTo(durationField10) == 0) || (Math.signum(durationField22.compareTo(durationField11)) == Math.signum(durationField10.compareTo(durationField11))));
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 100);
        java.lang.Integer int6 = dateTimeParserBucket5.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean8 = dateTimeParserBucket5.restoreState((java.lang.Object) dateTimeFieldType7);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket5.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        org.joda.time.DateTimeZone dateTimeZone11 = chronology9.getZone();
        org.joda.time.Chronology chronology13 = null;
        java.util.Locale locale14 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology13, locale14, (java.lang.Integer) 100);
        java.lang.String str17 = locale14.getCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket20 = new org.joda.time.format.DateTimeParserBucket(0L, chronology9, locale14, (java.lang.Integer) 100, (int) (byte) 1);
        org.joda.time.DurationField durationField21 = chronology9.halfdays();
        org.joda.time.DateTimeField dateTimeField22 = chronology9.dayOfYear();
        org.joda.time.DurationField durationField23 = chronology9.years();
        org.joda.time.DurationField durationField24 = chronology9.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField24, durationField10, and durationField21", !(durationField24.compareTo(durationField10) == 0) || (Math.signum(durationField24.compareTo(durationField21)) == Math.signum(durationField10.compareTo(durationField21))));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 100);
        java.lang.Integer int6 = dateTimeParserBucket5.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean8 = dateTimeParserBucket5.restoreState((java.lang.Object) dateTimeFieldType7);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket5.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        org.joda.time.DurationField durationField11 = chronology9.millis();
        org.joda.time.Chronology chronology13 = null;
        java.util.Locale locale14 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology13, locale14, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket(64713600009L, chronology9, locale14);
        org.joda.time.DateTimeField dateTimeField18 = chronology9.minuteOfDay();
        org.joda.time.DurationField durationField19 = chronology9.days();
        org.joda.time.DateTimeField dateTimeField20 = chronology9.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField21 = chronology9.weekyear();
        org.joda.time.DateTimeField dateTimeField22 = chronology9.millisOfDay();
        org.joda.time.DurationField durationField23 = chronology9.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField23, durationField10, and durationField11", !(durationField23.compareTo(durationField10) == 0) || (Math.signum(durationField23.compareTo(durationField11)) == Math.signum(durationField10.compareTo(durationField11))));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 100);
        java.lang.Integer int5 = dateTimeParserBucket4.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean7 = dateTimeParserBucket4.restoreState((java.lang.Object) dateTimeFieldType6);
        org.joda.time.Chronology chronology8 = dateTimeParserBucket4.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DurationField durationField10 = chronology8.millis();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.dayOfMonth();
        org.joda.time.DurationField durationField12 = chronology8.weeks();
        org.joda.time.DateTimeField dateTimeField13 = chronology8.year();
        org.joda.time.DateTimeField dateTimeField14 = chronology8.secondOfMinute();
        org.joda.time.DurationField durationField15 = chronology8.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField15, durationField9, and durationField10", !(durationField15.compareTo(durationField9) == 0) || (Math.signum(durationField15.compareTo(durationField10)) == Math.signum(durationField9.compareTo(durationField10))));
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 100);
        java.lang.Integer int6 = dateTimeParserBucket5.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean8 = dateTimeParserBucket5.restoreState((java.lang.Object) dateTimeFieldType7);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket5.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        org.joda.time.DurationField durationField11 = chronology9.millis();
        org.joda.time.DateTimeField dateTimeField12 = chronology9.clockhourOfHalfday();
        org.joda.time.Chronology chronology14 = null;
        java.util.Locale locale15 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology14, locale15, (java.lang.Integer) 100);
        java.lang.Integer int18 = dateTimeParserBucket17.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean20 = dateTimeParserBucket17.restoreState((java.lang.Object) dateTimeFieldType19);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.DateTimeField dateTimeField22 = dateTimeFieldType19.getField(chronology21);
        long long24 = dateTimeField22.roundHalfEven(1L);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.Chronology chronology29 = null;
        java.util.Locale locale30 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket32 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology29, locale30, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket33 = new org.joda.time.format.DateTimeParserBucket(100L, chronology27, locale30);
        java.lang.String str34 = dateTimeField22.getAsText((long) (short) 0, locale30);
        java.util.Locale locale36 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str37 = dateTimeField22.getAsShortText((long) (byte) -1, locale36);
        java.util.Locale locale38 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str40 = locale38.getUnicodeLocaleType("35");
        int int41 = dateTimeField22.getMaximumTextLength(locale38);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket43 = new org.joda.time.format.DateTimeParserBucket(11L, chronology9, locale38, (java.lang.Integer) (-434));
        java.util.Locale locale44 = dateTimeParserBucket43.getLocale();
        java.lang.Integer int45 = dateTimeParserBucket43.getPivotYear();
        org.joda.time.DateTimeZone dateTimeZone46 = dateTimeParserBucket43.getZone();
        org.joda.time.DateTimeFieldType dateTimeFieldType47 = org.joda.time.DateTimeFieldType.dayOfYear();
        java.util.Locale locale50 = new java.util.Locale("Chinese");
        java.util.Set<java.lang.String> strSet51 = locale50.getUnicodeLocaleKeys();
        dateTimeParserBucket43.saveField(dateTimeFieldType47, "it-IT", locale50);
        org.joda.time.Chronology chronology55 = null;
        java.util.Locale locale56 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket58 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology55, locale56, (java.lang.Integer) 100);
        java.lang.Integer int59 = dateTimeParserBucket58.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType60 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean61 = dateTimeParserBucket58.restoreState((java.lang.Object) dateTimeFieldType60);
        org.joda.time.Chronology chronology62 = dateTimeParserBucket58.getChronology();
        org.joda.time.DurationField durationField63 = chronology62.days();
        org.joda.time.DurationField durationField64 = chronology62.millis();
        org.joda.time.Chronology chronology66 = null;
        java.util.Locale locale67 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket69 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology66, locale67, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket70 = new org.joda.time.format.DateTimeParserBucket(64713600009L, chronology62, locale67);
        org.joda.time.DateTimeField dateTimeField71 = chronology62.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField72 = chronology62.weekyear();
        java.lang.String str73 = chronology62.toString();
        org.joda.time.DateTimeField dateTimeField74 = chronology62.minuteOfDay();
        org.joda.time.DurationField durationField75 = chronology62.weeks();
        org.joda.time.DurationField durationField76 = chronology62.weeks();
        org.joda.time.DurationField durationField77 = chronology62.hours();
        org.joda.time.DateTimeField dateTimeField78 = dateTimeFieldType47.getField(chronology62);
        org.joda.time.DurationField durationField79 = chronology62.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField79, durationField10, and durationField11", !(durationField79.compareTo(durationField10) == 0) || (Math.signum(durationField79.compareTo(durationField11)) == Math.signum(durationField10.compareTo(durationField11))));
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 100);
        java.lang.Integer int6 = dateTimeParserBucket5.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean8 = dateTimeParserBucket5.restoreState((java.lang.Object) dateTimeFieldType7);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket5.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        org.joda.time.DurationField durationField11 = chronology9.millis();
        org.joda.time.Chronology chronology13 = null;
        java.util.Locale locale14 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology13, locale14, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket(64713600009L, chronology9, locale14);
        org.joda.time.DateTimeField dateTimeField18 = chronology9.minuteOfDay();
        org.joda.time.DurationField durationField19 = chronology9.days();
        org.joda.time.DateTimeField dateTimeField20 = chronology9.minuteOfDay();
        org.joda.time.DurationField durationField21 = chronology9.months();
        org.joda.time.DurationField durationField22 = chronology9.hours();
        java.lang.String str23 = chronology9.toString();
        org.joda.time.DurationField durationField24 = chronology9.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField24, durationField10, and durationField11", !(durationField24.compareTo(durationField10) == 0) || (Math.signum(durationField24.compareTo(durationField11)) == Math.signum(durationField10.compareTo(durationField11))));
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 100);
        java.lang.Integer int6 = dateTimeParserBucket5.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean8 = dateTimeParserBucket5.restoreState((java.lang.Object) dateTimeFieldType7);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket5.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        org.joda.time.DateTimeField dateTimeField11 = dateTimeFieldType0.getField(chronology9);
        org.joda.time.DateTimeField dateTimeField12 = chronology9.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField13 = chronology9.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField14 = chronology9.yearOfEra();
        org.joda.time.DurationField durationField15 = chronology9.minutes();
        org.joda.time.DurationField durationField16 = chronology9.minutes();
        org.joda.time.DurationField durationField17 = chronology9.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField17, durationField10, and durationField15", !(durationField17.compareTo(durationField10) == 0) || (Math.signum(durationField17.compareTo(durationField15)) == Math.signum(durationField10.compareTo(durationField15))));
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 100);
        java.lang.Integer int6 = dateTimeParserBucket5.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean8 = dateTimeParserBucket5.restoreState((java.lang.Object) dateTimeFieldType7);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket5.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        org.joda.time.DateTimeField dateTimeField11 = dateTimeFieldType0.getField(chronology9);
        org.joda.time.DateTimeField dateTimeField12 = chronology9.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        long long16 = dateTimeZone14.convertUTCToLocal((long) (short) -1);
        org.joda.time.Chronology chronology18 = null;
        java.util.Locale locale19 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket21 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology18, locale19, (java.lang.Integer) 100);
        java.lang.Integer int22 = dateTimeParserBucket21.getPivotYear();
        org.joda.time.DateTimeField dateTimeField23 = null;
        dateTimeParserBucket21.saveField(dateTimeField23, (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone26 = dateTimeParserBucket21.getZone();
        long long28 = dateTimeZone14.getMillisKeepLocal(dateTimeZone26, 97L);
        int int30 = dateTimeZone14.getStandardOffset(1L);
        org.joda.time.Chronology chronology31 = chronology9.withZone(dateTimeZone14);
        java.util.TimeZone timeZone32 = null;
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forTimeZone(timeZone32);
        int int35 = dateTimeZone33.getStandardOffset((long) (byte) -1);
        java.lang.String str37 = dateTimeZone33.getName(32054400100L);
        org.joda.time.Chronology chronology38 = chronology31.withZone(dateTimeZone33);
        org.joda.time.DurationField durationField39 = chronology38.centuries();
        org.joda.time.DateTimeField dateTimeField40 = chronology38.hourOfHalfday();
        org.joda.time.DurationField durationField41 = chronology38.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField41, durationField10, and durationField39", !(durationField41.compareTo(durationField10) == 0) || (Math.signum(durationField41.compareTo(durationField39)) == Math.signum(durationField10.compareTo(durationField39))));
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 100);
        java.lang.Integer int6 = dateTimeParserBucket5.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean8 = dateTimeParserBucket5.restoreState((java.lang.Object) dateTimeFieldType7);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket5.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        org.joda.time.DateTimeField dateTimeField11 = dateTimeFieldType0.getField(chronology9);
        org.joda.time.DateTimeField dateTimeField12 = chronology9.dayOfMonth();
        org.joda.time.DurationField durationField13 = chronology9.millis();
        org.joda.time.DateTimeField dateTimeField14 = chronology9.weekyear();
        org.joda.time.DurationField durationField15 = chronology9.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField15, durationField10, and durationField13", !(durationField15.compareTo(durationField10) == 0) || (Math.signum(durationField15.compareTo(durationField13)) == Math.signum(durationField10.compareTo(durationField13))));
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 100);
        java.lang.Integer int6 = dateTimeParserBucket5.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean8 = dateTimeParserBucket5.restoreState((java.lang.Object) dateTimeFieldType7);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket5.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        org.joda.time.DurationField durationField11 = chronology9.millis();
        org.joda.time.Chronology chronology13 = null;
        java.util.Locale locale14 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology13, locale14, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket(64713600009L, chronology9, locale14);
        org.joda.time.DateTimeField dateTimeField18 = chronology9.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField19 = chronology9.weekyear();
        java.lang.String str20 = chronology9.toString();
        org.joda.time.DateTimeField dateTimeField21 = chronology9.minuteOfDay();
        org.joda.time.DurationField durationField22 = chronology9.weeks();
        org.joda.time.DurationField durationField23 = chronology9.weeks();
        org.joda.time.DurationField durationField24 = chronology9.years();
        org.joda.time.DateTimeField dateTimeField25 = chronology9.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField26 = chronology9.weekyear();
        org.joda.time.DurationField durationField27 = chronology9.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField27, durationField10, and durationField11", !(durationField27.compareTo(durationField10) == 0) || (Math.signum(durationField27.compareTo(durationField11)) == Math.signum(durationField10.compareTo(durationField11))));
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        java.lang.Integer int7 = dateTimeParserBucket6.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean9 = dateTimeParserBucket6.restoreState((java.lang.Object) dateTimeFieldType8);
        org.joda.time.Chronology chronology10 = dateTimeParserBucket6.getChronology();
        org.joda.time.DurationField durationField11 = chronology10.days();
        org.joda.time.DateTimeField dateTimeField12 = dateTimeFieldType1.getField(chronology10);
        org.joda.time.DateTimeField dateTimeField13 = chronology10.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField14 = chronology10.weekOfWeekyear();
        java.lang.String str15 = chronology10.toString();
        org.joda.time.DateTimeField dateTimeField16 = chronology10.dayOfYear();
        org.joda.time.DateTimeField dateTimeField17 = chronology10.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone18 = chronology10.getZone();
        org.joda.time.DateTimeField dateTimeField19 = chronology10.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField20 = chronology10.yearOfEra();
        org.joda.time.DurationField durationField21 = chronology10.weekyears();
        org.joda.time.Chronology chronology22 = chronology10.withUTC();
        org.joda.time.DurationField durationField23 = chronology22.millis();
        org.joda.time.DurationField durationField24 = chronology22.minutes();
        org.joda.time.Chronology chronology29 = null;
        java.util.Locale locale30 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket32 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology29, locale30, (java.lang.Integer) 100);
        java.lang.Integer int33 = dateTimeParserBucket32.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean35 = dateTimeParserBucket32.restoreState((java.lang.Object) dateTimeFieldType34);
        org.joda.time.Chronology chronology36 = dateTimeParserBucket32.getChronology();
        org.joda.time.DurationField durationField37 = chronology36.years();
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.Chronology chronology41 = null;
        java.util.Locale locale42 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket44 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology41, locale42, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket45 = new org.joda.time.format.DateTimeParserBucket(100L, chronology39, locale42);
        java.lang.String str46 = locale42.getScript();
        java.lang.String str48 = locale42.getExtension('u');
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket51 = new org.joda.time.format.DateTimeParserBucket(259200117L, chronology36, locale42, (java.lang.Integer) 100, (int) (byte) 1);
        org.joda.time.DurationField durationField52 = chronology36.centuries();
        java.util.Locale.Category category53 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale54 = java.util.Locale.GERMANY;
        java.lang.String str55 = locale54.getDisplayCountry();
        java.util.Locale.setDefault(category53, locale54);
        java.util.Locale locale57 = java.util.Locale.getDefault(category53);
        java.util.Locale locale58 = java.util.Locale.getDefault(category53);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket61 = new org.joda.time.format.DateTimeParserBucket(10L, chronology36, locale58, (java.lang.Integer) 100, 31);
        org.joda.time.Chronology chronology62 = chronology36.withUTC();
        java.util.Locale.Builder builder63 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder64 = builder63.clearExtensions();
        java.util.Locale locale65 = builder64.build();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket66 = new org.joda.time.format.DateTimeParserBucket(6048000035L, chronology62, locale65);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket68 = new org.joda.time.format.DateTimeParserBucket((long) 99, chronology22, locale65, (java.lang.Integer) 22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField21 and durationField37", (durationField21.compareTo(durationField37) == 0) == durationField21.equals(durationField37));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 100);
        java.lang.Integer int6 = dateTimeParserBucket5.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean8 = dateTimeParserBucket5.restoreState((java.lang.Object) dateTimeFieldType7);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket5.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        org.joda.time.DurationField durationField11 = chronology9.millis();
        org.joda.time.Chronology chronology13 = null;
        java.util.Locale locale14 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology13, locale14, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket(64713600009L, chronology9, locale14);
        org.joda.time.Chronology chronology19 = null;
        java.util.Locale locale20 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket22 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology19, locale20, (java.lang.Integer) 100);
        java.lang.Integer int23 = dateTimeParserBucket22.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean25 = dateTimeParserBucket22.restoreState((java.lang.Object) dateTimeFieldType24);
        org.joda.time.Chronology chronology26 = dateTimeParserBucket22.getChronology();
        org.joda.time.DurationField durationField27 = chronology26.days();
        org.joda.time.DurationField durationField28 = chronology26.hours();
        org.joda.time.DateTimeZone dateTimeZone29 = chronology26.getZone();
        java.util.TimeZone timeZone30 = dateTimeZone29.toTimeZone();
        org.joda.time.Chronology chronology31 = chronology9.withZone(dateTimeZone29);
        java.lang.String str32 = chronology9.toString();
        org.joda.time.DurationField durationField33 = chronology9.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField33, durationField10, and durationField11", !(durationField33.compareTo(durationField10) == 0) || (Math.signum(durationField33.compareTo(durationField11)) == Math.signum(durationField10.compareTo(durationField11))));
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 100);
        java.lang.Integer int5 = dateTimeParserBucket4.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean7 = dateTimeParserBucket4.restoreState((java.lang.Object) dateTimeFieldType6);
        org.joda.time.Chronology chronology8 = dateTimeParserBucket4.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DurationField durationField10 = chronology8.millis();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.clockhourOfDay();
        org.joda.time.DurationField durationField13 = chronology8.years();
        org.joda.time.DurationField durationField14 = chronology8.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField14, durationField9, and durationField10", !(durationField14.compareTo(durationField9) == 0) || (Math.signum(durationField14.compareTo(durationField10)) == Math.signum(durationField9.compareTo(durationField10))));
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 100);
        java.lang.Integer int6 = dateTimeParserBucket5.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean8 = dateTimeParserBucket5.restoreState((java.lang.Object) dateTimeFieldType7);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket5.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        org.joda.time.DateTimeField dateTimeField11 = dateTimeFieldType0.getField(chronology9);
        org.joda.time.DateTimeField dateTimeField12 = chronology9.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField13 = chronology9.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField14 = chronology9.yearOfCentury();
        org.joda.time.DurationField durationField15 = chronology9.centuries();
        org.joda.time.DateTimeField dateTimeField16 = chronology9.weekyear();
        org.joda.time.Chronology chronology17 = chronology9.withUTC();
        org.joda.time.DurationField durationField18 = chronology17.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField18, durationField10, and durationField15", !(durationField18.compareTo(durationField10) == 0) || (Math.signum(durationField18.compareTo(durationField15)) == Math.signum(durationField10.compareTo(durationField15))));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        java.lang.Integer int7 = dateTimeParserBucket6.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean9 = dateTimeParserBucket6.restoreState((java.lang.Object) dateTimeFieldType8);
        org.joda.time.Chronology chronology10 = dateTimeParserBucket6.getChronology();
        org.joda.time.DurationField durationField11 = chronology10.days();
        org.joda.time.DateTimeField dateTimeField12 = dateTimeFieldType1.getField(chronology10);
        org.joda.time.DateTimeField dateTimeField13 = chronology10.dayOfMonth();
        org.joda.time.DurationField durationField14 = chronology10.seconds();
        org.joda.time.DateTimeField dateTimeField15 = chronology10.millisOfDay();
        org.joda.time.DateTimeField dateTimeField16 = chronology10.year();
        java.util.Locale locale17 = java.util.Locale.ITALIAN;
        java.util.Locale locale18 = locale17.stripExtensions();
        org.joda.time.Chronology chronology20 = null;
        java.util.Locale locale21 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket23 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology20, locale21, (java.lang.Integer) 100);
        java.lang.Integer int24 = dateTimeParserBucket23.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean26 = dateTimeParserBucket23.restoreState((java.lang.Object) dateTimeFieldType25);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.DateTimeField dateTimeField28 = dateTimeFieldType25.getField(chronology27);
        long long30 = dateTimeField28.roundHalfEven(1L);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.Chronology chronology35 = null;
        java.util.Locale locale36 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket38 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology35, locale36, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket39 = new org.joda.time.format.DateTimeParserBucket(100L, chronology33, locale36);
        java.lang.String str40 = dateTimeField28.getAsText((long) (short) 0, locale36);
        java.lang.String str41 = locale18.getDisplayVariant(locale36);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket43 = new org.joda.time.format.DateTimeParserBucket((long) 'u', chronology10, locale36, (java.lang.Integer) 8);
        org.joda.time.DateTimeField dateTimeField44 = chronology10.hourOfHalfday();
        org.joda.time.DurationField durationField45 = chronology10.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField45, durationField11, and durationField14", !(durationField45.compareTo(durationField11) == 0) || (Math.signum(durationField45.compareTo(durationField14)) == Math.signum(durationField11.compareTo(durationField14))));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 100);
        java.lang.Integer int6 = dateTimeParserBucket5.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean8 = dateTimeParserBucket5.restoreState((java.lang.Object) dateTimeFieldType7);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket5.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.years();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.Chronology chronology14 = null;
        java.util.Locale locale15 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology14, locale15, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket18 = new org.joda.time.format.DateTimeParserBucket(100L, chronology12, locale15);
        java.lang.String str19 = locale15.getScript();
        java.lang.String str21 = locale15.getExtension('u');
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket24 = new org.joda.time.format.DateTimeParserBucket(259200117L, chronology9, locale15, (java.lang.Integer) 100, (int) (byte) 1);
        org.joda.time.DateTimeField dateTimeField25 = chronology9.hourOfHalfday();
        org.joda.time.DurationField durationField26 = chronology9.months();
        org.joda.time.DurationField durationField27 = chronology9.months();
        org.joda.time.DurationField durationField28 = chronology9.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField28, durationField10, and durationField26", !(durationField28.compareTo(durationField10) == 0) || (Math.signum(durationField28.compareTo(durationField26)) == Math.signum(durationField10.compareTo(durationField26))));
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        java.lang.Integer int7 = dateTimeParserBucket6.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean9 = dateTimeParserBucket6.restoreState((java.lang.Object) dateTimeFieldType8);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTimeField dateTimeField11 = dateTimeFieldType8.getField(chronology10);
        long long14 = dateTimeField11.getDifferenceAsLong((long) ' ', (long) 1);
        org.joda.time.ReadablePartial readablePartial15 = null;
        java.util.Locale locale17 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str18 = dateTimeField11.getAsShortText(readablePartial15, (int) ' ', locale17);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket21 = new org.joda.time.format.DateTimeParserBucket(9L, chronology1, locale17, (java.lang.Integer) 2, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.ReadableInstant readableInstant24 = null;
        int int25 = dateTimeZone23.getOffset(readableInstant24);
        java.util.Locale locale27 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str29 = locale27.getUnicodeLocaleType("35");
        java.lang.String str30 = dateTimeZone23.getName(64713600009L, locale27);
        boolean boolean31 = dateTimeParserBucket21.restoreState((java.lang.Object) locale27);
        org.joda.time.Chronology chronology32 = dateTimeParserBucket21.getChronology();
        org.joda.time.DateTimeField dateTimeField33 = chronology32.centuryOfEra();
        org.joda.time.DurationField durationField34 = chronology32.halfdays();
        org.joda.time.DurationField durationField35 = chronology32.eras();
        org.joda.time.DateTimeField dateTimeField36 = chronology32.dayOfWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField34 and durationField35", Math.signum(durationField34.compareTo(durationField35)) == -Math.signum(durationField35.compareTo(durationField34)));
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 100);
        java.lang.Integer int6 = dateTimeParserBucket5.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean8 = dateTimeParserBucket5.restoreState((java.lang.Object) dateTimeFieldType7);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket5.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        org.joda.time.DateTimeZone dateTimeZone11 = chronology9.getZone();
        org.joda.time.DateTimeField dateTimeField12 = chronology9.yearOfCentury();
        java.lang.String str13 = chronology9.toString();
        org.joda.time.Chronology chronology14 = chronology9.withUTC();
        org.joda.time.DateTimeField dateTimeField15 = chronology9.secondOfDay();
        boolean boolean16 = dateTimeFieldType0.isSupported(chronology9);
        java.lang.String str17 = chronology9.toString();
        org.joda.time.DurationField durationField18 = chronology9.halfdays();
        org.joda.time.DurationField durationField19 = chronology9.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField19, durationField10, and durationField18", !(durationField19.compareTo(durationField10) == 0) || (Math.signum(durationField19.compareTo(durationField18)) == Math.signum(durationField10.compareTo(durationField18))));
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 100);
        java.lang.Integer int5 = dateTimeParserBucket4.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean7 = dateTimeParserBucket4.restoreState((java.lang.Object) dateTimeFieldType6);
        org.joda.time.Chronology chronology8 = dateTimeParserBucket4.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        long long13 = chronology8.add(readablePeriod10, 0L, 0);
        org.joda.time.DateTimeField dateTimeField14 = chronology8.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField15 = chronology8.clockhourOfHalfday();
        org.joda.time.DurationField durationField16 = chronology8.eras();
        org.joda.time.DateTimeField dateTimeField17 = chronology8.clockhourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField9 and durationField16", Math.signum(durationField9.compareTo(durationField16)) == -Math.signum(durationField16.compareTo(durationField9)));
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 100);
        java.lang.Integer int6 = dateTimeParserBucket5.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean8 = dateTimeParserBucket5.restoreState((java.lang.Object) dateTimeFieldType7);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket5.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.years();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.Chronology chronology14 = null;
        java.util.Locale locale15 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology14, locale15, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket18 = new org.joda.time.format.DateTimeParserBucket(100L, chronology12, locale15);
        java.lang.String str19 = locale15.getScript();
        java.lang.String str21 = locale15.getExtension('u');
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket24 = new org.joda.time.format.DateTimeParserBucket(259200117L, chronology9, locale15, (java.lang.Integer) 100, (int) (byte) 1);
        org.joda.time.DateTimeField dateTimeField25 = chronology9.hourOfHalfday();
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.Chronology chronology29 = null;
        java.util.Locale locale30 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket32 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology29, locale30, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket33 = new org.joda.time.format.DateTimeParserBucket(100L, chronology27, locale30);
        org.joda.time.DateTimeZone dateTimeZone34 = dateTimeParserBucket33.getZone();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone34);
        int int37 = dateTimeZone34.getOffset(64713600009L);
        org.joda.time.Chronology chronology38 = chronology9.withZone(dateTimeZone34);
        org.joda.time.DateTimeField dateTimeField39 = chronology38.era();
        org.joda.time.DurationField durationField40 = chronology38.months();
        org.joda.time.DurationField durationField41 = chronology38.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField41, durationField10, and durationField40", !(durationField41.compareTo(durationField10) == 0) || (Math.signum(durationField41.compareTo(durationField40)) == Math.signum(durationField10.compareTo(durationField40))));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 100);
        java.lang.Integer int5 = dateTimeParserBucket4.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean7 = dateTimeParserBucket4.restoreState((java.lang.Object) dateTimeFieldType6);
        org.joda.time.Chronology chronology8 = dateTimeParserBucket4.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.ReadableInstant readableInstant12 = null;
        int int13 = dateTimeZone11.getOffset(readableInstant12);
        org.joda.time.ReadableInstant readableInstant14 = null;
        int int15 = dateTimeZone11.getOffset(readableInstant14);
        org.joda.time.Chronology chronology18 = null;
        java.util.Locale locale19 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket21 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology18, locale19, (java.lang.Integer) 100);
        java.lang.String str22 = dateTimeZone11.getShortName(10L, locale19);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.Chronology chronology27 = null;
        java.util.Locale locale28 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket30 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology27, locale28, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket31 = new org.joda.time.format.DateTimeParserBucket(100L, chronology25, locale28);
        java.lang.String str32 = locale28.getScript();
        java.lang.String str33 = locale28.getISO3Country();
        java.lang.String str34 = locale28.getDisplayScript();
        java.lang.String str35 = dateTimeZone11.getName((long) 53, locale28);
        org.joda.time.Chronology chronology36 = chronology8.withZone(dateTimeZone11);
        org.joda.time.Chronology chronology37 = chronology36.withUTC();
        org.joda.time.DurationField durationField38 = chronology37.eras();
        org.joda.time.DateTimeField dateTimeField39 = chronology37.monthOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField9 and durationField38", Math.signum(durationField9.compareTo(durationField38)) == -Math.signum(durationField38.compareTo(durationField9)));
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 100);
        java.lang.Integer int5 = dateTimeParserBucket4.getPivotYear();
        org.joda.time.DateTimeField dateTimeField6 = null;
        dateTimeParserBucket4.saveField(dateTimeField6, (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone9 = dateTimeParserBucket4.getZone();
        org.joda.time.Chronology chronology11 = null;
        java.util.Locale locale12 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket14 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology11, locale12, (java.lang.Integer) 100);
        java.lang.Integer int15 = dateTimeParserBucket14.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean17 = dateTimeParserBucket14.restoreState((java.lang.Object) dateTimeFieldType16);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTimeField dateTimeField19 = dateTimeFieldType16.getField(chronology18);
        java.util.Locale locale21 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet22 = locale21.getUnicodeLocaleAttributes();
        org.joda.time.Chronology chronology24 = null;
        java.util.Locale locale25 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket27 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology24, locale25, (java.lang.Integer) 100);
        java.lang.String str28 = locale21.getDisplayScript(locale25);
        java.lang.String str29 = dateTimeField19.getAsShortText(10, locale21);
        dateTimeParserBucket4.saveField(dateTimeField19, (int) (byte) 1);
        org.joda.time.DurationField durationField32 = dateTimeField19.getRangeDurationField();
        long long34 = dateTimeField19.roundHalfEven((long) (short) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType35 = dateTimeField19.getType();
        org.joda.time.DurationFieldType durationFieldType36 = dateTimeFieldType35.getDurationType();
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.Chronology chronology39 = null;
        java.util.Locale locale40 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket42 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology39, locale40, (java.lang.Integer) 100);
        java.lang.Integer int43 = dateTimeParserBucket42.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType44 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean45 = dateTimeParserBucket42.restoreState((java.lang.Object) dateTimeFieldType44);
        org.joda.time.Chronology chronology46 = dateTimeParserBucket42.getChronology();
        org.joda.time.DurationField durationField47 = chronology46.days();
        org.joda.time.DateTimeField dateTimeField48 = dateTimeFieldType37.getField(chronology46);
        org.joda.time.DateTimeField dateTimeField49 = chronology46.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField50 = chronology46.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField51 = chronology46.yearOfEra();
        org.joda.time.DurationField durationField52 = chronology46.weeks();
        org.joda.time.DurationField durationField53 = chronology46.centuries();
        org.joda.time.DateTimeField dateTimeField54 = dateTimeFieldType35.getField(chronology46);
        java.util.Locale locale56 = java.util.Locale.getDefault();
        java.lang.String str57 = locale56.getISO3Country();
        java.lang.String str58 = locale56.getISO3Language();
        java.util.Locale.setDefault(locale56);
        java.util.Set<java.lang.String> strSet60 = locale56.getUnicodeLocaleAttributes();
        org.joda.time.Chronology chronology63 = null;
        java.util.Locale locale64 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket66 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology63, locale64, (java.lang.Integer) 100);
        java.lang.Integer int67 = dateTimeParserBucket66.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType68 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean69 = dateTimeParserBucket66.restoreState((java.lang.Object) dateTimeFieldType68);
        org.joda.time.Chronology chronology70 = dateTimeParserBucket66.getChronology();
        org.joda.time.DurationField durationField71 = chronology70.years();
        org.joda.time.Chronology chronology73 = null;
        org.joda.time.Chronology chronology75 = null;
        java.util.Locale locale76 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket78 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology75, locale76, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket79 = new org.joda.time.format.DateTimeParserBucket(100L, chronology73, locale76);
        java.lang.String str80 = locale76.getScript();
        java.lang.String str82 = locale76.getExtension('u');
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket85 = new org.joda.time.format.DateTimeParserBucket(259200117L, chronology70, locale76, (java.lang.Integer) 100, (int) (byte) 1);
        java.lang.String str86 = locale56.getDisplayVariant(locale76);
        boolean boolean87 = locale76.hasExtensions();
        java.util.Locale locale88 = locale76.stripExtensions();
        java.lang.String str89 = dateTimeField54.getAsShortText((-101), locale88);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField32 and durationField71", (durationField32.compareTo(durationField71) == 0) == durationField32.equals(durationField71));
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 100);
        java.lang.Integer int5 = dateTimeParserBucket4.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean7 = dateTimeParserBucket4.restoreState((java.lang.Object) dateTimeFieldType6);
        org.joda.time.Chronology chronology8 = dateTimeParserBucket4.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeZone dateTimeZone10 = chronology8.getZone();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.yearOfCentury();
        org.joda.time.DurationField durationField12 = chronology8.millis();
        org.joda.time.DateTimeField dateTimeField13 = chronology8.dayOfWeek();
        org.joda.time.DurationField durationField14 = chronology8.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField14, durationField9, and durationField12", !(durationField14.compareTo(durationField9) == 0) || (Math.signum(durationField14.compareTo(durationField12)) == Math.signum(durationField9.compareTo(durationField12))));
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 100);
        java.lang.Integer int5 = dateTimeParserBucket4.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean7 = dateTimeParserBucket4.restoreState((java.lang.Object) dateTimeFieldType6);
        org.joda.time.Chronology chronology8 = dateTimeParserBucket4.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeZone dateTimeZone10 = chronology8.getZone();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.yearOfCentury();
        java.lang.String str12 = chronology8.toString();
        org.joda.time.Chronology chronology13 = chronology8.withUTC();
        org.joda.time.DateTimeField dateTimeField14 = chronology8.secondOfDay();
        org.joda.time.DurationField durationField15 = chronology8.weekyears();
        org.joda.time.DateTimeField dateTimeField16 = chronology8.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField17 = chronology8.yearOfEra();
        org.joda.time.DurationField durationField18 = chronology8.years();
        org.joda.time.DateTimeField dateTimeField19 = chronology8.clockhourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField15 and durationField18", (durationField15.compareTo(durationField18) == 0) == durationField15.equals(durationField18));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 100);
        java.lang.Integer int5 = dateTimeParserBucket4.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean7 = dateTimeParserBucket4.restoreState((java.lang.Object) dateTimeFieldType6);
        org.joda.time.Chronology chronology8 = dateTimeParserBucket4.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeZone dateTimeZone10 = chronology8.getZone();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.yearOfCentury();
        org.joda.time.DurationField durationField12 = chronology8.years();
        org.joda.time.DateTimeField dateTimeField13 = chronology8.weekyear();
        org.joda.time.DurationField durationField14 = chronology8.halfdays();
        org.joda.time.DurationField durationField15 = chronology8.millis();
        org.joda.time.DurationField durationField16 = chronology8.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField16, durationField9, and durationField12", !(durationField16.compareTo(durationField9) == 0) || (Math.signum(durationField16.compareTo(durationField12)) == Math.signum(durationField9.compareTo(durationField12))));
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        java.lang.Integer int7 = dateTimeParserBucket6.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean9 = dateTimeParserBucket6.restoreState((java.lang.Object) dateTimeFieldType8);
        org.joda.time.Chronology chronology10 = dateTimeParserBucket6.getChronology();
        org.joda.time.DurationField durationField11 = chronology10.years();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.Chronology chronology15 = null;
        java.util.Locale locale16 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket18 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology15, locale16, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket19 = new org.joda.time.format.DateTimeParserBucket(100L, chronology13, locale16);
        java.lang.String str20 = locale16.getScript();
        java.lang.String str22 = locale16.getExtension('u');
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket25 = new org.joda.time.format.DateTimeParserBucket(259200117L, chronology10, locale16, (java.lang.Integer) 100, (int) (byte) 1);
        org.joda.time.DurationField durationField26 = chronology10.centuries();
        java.util.Locale.Category category27 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale28 = java.util.Locale.GERMANY;
        java.lang.String str29 = locale28.getDisplayCountry();
        java.util.Locale.setDefault(category27, locale28);
        java.util.Locale locale31 = java.util.Locale.getDefault(category27);
        java.util.Locale locale32 = java.util.Locale.getDefault(category27);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket35 = new org.joda.time.format.DateTimeParserBucket(10L, chronology10, locale32, (java.lang.Integer) 100, 31);
        org.joda.time.Chronology chronology36 = chronology10.withUTC();
        org.joda.time.DurationField durationField37 = chronology36.halfdays();
        org.joda.time.DurationField durationField38 = chronology36.halfdays();
        org.joda.time.DurationField durationField39 = chronology36.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField39, durationField11, and durationField26", !(durationField39.compareTo(durationField11) == 0) || (Math.signum(durationField39.compareTo(durationField26)) == Math.signum(durationField11.compareTo(durationField26))));
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        java.lang.Integer int7 = dateTimeParserBucket6.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean9 = dateTimeParserBucket6.restoreState((java.lang.Object) dateTimeFieldType8);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTimeField dateTimeField11 = dateTimeFieldType8.getField(chronology10);
        long long14 = dateTimeField11.getDifferenceAsLong((long) ' ', (long) 1);
        org.joda.time.ReadablePartial readablePartial15 = null;
        java.util.Locale locale17 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str18 = dateTimeField11.getAsShortText(readablePartial15, (int) ' ', locale17);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket21 = new org.joda.time.format.DateTimeParserBucket(9L, chronology1, locale17, (java.lang.Integer) 2, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.ReadableInstant readableInstant24 = null;
        int int25 = dateTimeZone23.getOffset(readableInstant24);
        java.util.Locale locale27 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str29 = locale27.getUnicodeLocaleType("35");
        java.lang.String str30 = dateTimeZone23.getName(64713600009L, locale27);
        boolean boolean31 = dateTimeParserBucket21.restoreState((java.lang.Object) locale27);
        org.joda.time.Chronology chronology32 = dateTimeParserBucket21.getChronology();
        org.joda.time.DateTimeField dateTimeField33 = chronology32.centuryOfEra();
        org.joda.time.DurationField durationField34 = chronology32.halfdays();
        org.joda.time.DurationField durationField35 = chronology32.eras();
        org.joda.time.DurationField durationField36 = chronology32.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField34 and durationField35", Math.signum(durationField34.compareTo(durationField35)) == -Math.signum(durationField35.compareTo(durationField34)));
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 100);
        java.lang.Integer int5 = dateTimeParserBucket4.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean7 = dateTimeParserBucket4.restoreState((java.lang.Object) dateTimeFieldType6);
        org.joda.time.Chronology chronology8 = dateTimeParserBucket4.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeZone dateTimeZone10 = chronology8.getZone();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.yearOfCentury();
        org.joda.time.DurationField durationField12 = chronology8.years();
        org.joda.time.DateTimeField dateTimeField13 = chronology8.clockhourOfHalfday();
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = dateTimeField13.getType();
        java.lang.String str15 = dateTimeFieldType14.toString();
        org.joda.time.Chronology chronology17 = null;
        java.util.Locale locale18 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket20 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology17, locale18, (java.lang.Integer) 100);
        java.lang.Integer int21 = dateTimeParserBucket20.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean23 = dateTimeParserBucket20.restoreState((java.lang.Object) dateTimeFieldType22);
        org.joda.time.Chronology chronology24 = dateTimeParserBucket20.getChronology();
        org.joda.time.DurationField durationField25 = chronology24.days();
        org.joda.time.DurationField durationField26 = chronology24.millis();
        org.joda.time.DateTimeField dateTimeField27 = chronology24.dayOfMonth();
        org.joda.time.DurationField durationField28 = chronology24.weeks();
        boolean boolean29 = dateTimeFieldType14.isSupported(chronology24);
        org.joda.time.DurationField durationField30 = chronology24.weekyears();
        org.joda.time.DurationField durationField31 = chronology24.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField12 and durationField31", (durationField12.compareTo(durationField31) == 0) == durationField12.equals(durationField31));
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 100);
        java.lang.Integer int6 = dateTimeParserBucket5.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean8 = dateTimeParserBucket5.restoreState((java.lang.Object) dateTimeFieldType7);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket5.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.years();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.Chronology chronology14 = null;
        java.util.Locale locale15 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology14, locale15, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket18 = new org.joda.time.format.DateTimeParserBucket(100L, chronology12, locale15);
        java.lang.String str19 = locale15.getScript();
        java.lang.String str21 = locale15.getExtension('u');
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket24 = new org.joda.time.format.DateTimeParserBucket(259200117L, chronology9, locale15, (java.lang.Integer) 100, (int) (byte) 1);
        org.joda.time.DurationField durationField25 = chronology9.centuries();
        org.joda.time.DateTimeField dateTimeField26 = chronology9.secondOfDay();
        org.joda.time.Chronology chronology27 = chronology9.withUTC();
        org.joda.time.DurationField durationField28 = chronology9.weekyears();
        org.joda.time.DateTimeField dateTimeField29 = chronology9.minuteOfHour();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField10 and durationField28", (durationField10.compareTo(durationField28) == 0) == durationField10.equals(durationField28));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 100);
        java.lang.Integer int5 = dateTimeParserBucket4.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean7 = dateTimeParserBucket4.restoreState((java.lang.Object) dateTimeFieldType6);
        org.joda.time.Chronology chronology8 = dateTimeParserBucket4.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeZone dateTimeZone10 = chronology8.getZone();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.yearOfCentury();
        org.joda.time.DurationField durationField12 = chronology8.years();
        org.joda.time.DurationField durationField13 = chronology8.weekyears();
        org.joda.time.DateTimeField dateTimeField14 = chronology8.dayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField12 and durationField13", (durationField12.compareTo(durationField13) == 0) == durationField12.equals(durationField13));
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 100);
        java.lang.Integer int6 = dateTimeParserBucket5.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean8 = dateTimeParserBucket5.restoreState((java.lang.Object) dateTimeFieldType7);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket5.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        long long14 = chronology9.add(readablePeriod11, 0L, 0);
        org.joda.time.DateTimeField dateTimeField15 = chronology9.yearOfEra();
        java.util.Locale.Builder builder16 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder17 = builder16.clear();
        java.util.Locale locale18 = builder17.build();
        java.util.Set<java.lang.Character> charSet19 = locale18.getExtensionKeys();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket21 = new org.joda.time.format.DateTimeParserBucket((-61409041074993L), chronology9, locale18, (java.lang.Integer) 1497);
        org.joda.time.DurationField durationField22 = chronology9.eras();
        org.joda.time.DateTimeField dateTimeField23 = chronology9.clockhourOfHalfday();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField10 and durationField22", Math.signum(durationField10.compareTo(durationField22)) == -Math.signum(durationField22.compareTo(durationField10)));
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 100);
        java.lang.Integer int5 = dateTimeParserBucket4.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean7 = dateTimeParserBucket4.restoreState((java.lang.Object) dateTimeFieldType6);
        org.joda.time.Chronology chronology8 = dateTimeParserBucket4.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeZone dateTimeZone10 = chronology8.getZone();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.yearOfCentury();
        java.lang.String str12 = chronology8.toString();
        org.joda.time.DateTimeField dateTimeField13 = chronology8.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField14 = chronology8.clockhourOfHalfday();
        org.joda.time.DurationField durationField15 = chronology8.months();
        org.joda.time.DurationField durationField16 = chronology8.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField16, durationField9, and durationField15", !(durationField16.compareTo(durationField9) == 0) || (Math.signum(durationField16.compareTo(durationField15)) == Math.signum(durationField9.compareTo(durationField15))));
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 100);
        java.lang.Integer int5 = dateTimeParserBucket4.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean7 = dateTimeParserBucket4.restoreState((java.lang.Object) dateTimeFieldType6);
        org.joda.time.Chronology chronology8 = dateTimeParserBucket4.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeZone dateTimeZone10 = chronology8.getZone();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.minuteOfDay();
        org.joda.time.DurationField durationField12 = chronology8.hours();
        org.joda.time.DateTimeField dateTimeField13 = chronology8.halfdayOfDay();
        org.joda.time.DurationField durationField14 = chronology8.weekyears();
        org.joda.time.DateTimeField dateTimeField15 = chronology8.weekOfWeekyear();
        org.joda.time.DurationField durationField16 = chronology8.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField16, durationField9, and durationField12", !(durationField16.compareTo(durationField9) == 0) || (Math.signum(durationField16.compareTo(durationField12)) == Math.signum(durationField9.compareTo(durationField12))));
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'u', chronology1, locale3, (java.lang.Integer) 1, 0);
        dateTimeParserBucket6.setOffset((int) (short) 100);
        dateTimeParserBucket6.setOffset((java.lang.Integer) 12);
        java.util.Locale locale11 = dateTimeParserBucket6.getLocale();
        org.joda.time.Chronology chronology14 = null;
        java.util.Locale locale15 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology14, locale15, (java.lang.Integer) 100);
        java.lang.Integer int18 = dateTimeParserBucket17.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean20 = dateTimeParserBucket17.restoreState((java.lang.Object) dateTimeFieldType19);
        org.joda.time.Chronology chronology21 = dateTimeParserBucket17.getChronology();
        org.joda.time.DurationField durationField22 = chronology21.days();
        org.joda.time.DurationField durationField23 = chronology21.millis();
        org.joda.time.Chronology chronology25 = null;
        java.util.Locale locale26 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket28 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology25, locale26, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket29 = new org.joda.time.format.DateTimeParserBucket(64713600009L, chronology21, locale26);
        org.joda.time.DateTimeField dateTimeField30 = chronology21.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField31 = chronology21.weekyear();
        java.lang.String str32 = chronology21.toString();
        org.joda.time.DateTimeField dateTimeField33 = chronology21.minuteOfDay();
        org.joda.time.DurationField durationField34 = chronology21.weeks();
        org.joda.time.DurationField durationField35 = chronology21.weeks();
        org.joda.time.DurationField durationField36 = chronology21.years();
        org.joda.time.ReadablePeriod readablePeriod37 = null;
        long long40 = chronology21.add(readablePeriod37, 26006400048L, (int) ' ');
        org.joda.time.DateTimeField dateTimeField41 = chronology21.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType42 = dateTimeField41.getType();
        org.joda.time.Chronology chronology45 = null;
        java.util.Locale locale46 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket48 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology45, locale46, (java.lang.Integer) 100);
        java.lang.Integer int49 = dateTimeParserBucket48.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType50 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean51 = dateTimeParserBucket48.restoreState((java.lang.Object) dateTimeFieldType50);
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.DateTimeField dateTimeField53 = dateTimeFieldType50.getField(chronology52);
        org.joda.time.DurationField durationField54 = dateTimeField53.getDurationField();
        long long57 = dateTimeField53.add(9L, 107L);
        int int58 = dateTimeField53.getMaximumValue();
        org.joda.time.Chronology chronology60 = null;
        org.joda.time.Chronology chronology62 = null;
        java.util.Locale locale63 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket65 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology62, locale63, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket66 = new org.joda.time.format.DateTimeParserBucket(100L, chronology60, locale63);
        java.lang.String str67 = locale63.getDisplayScript();
        int int68 = dateTimeField53.getMaximumTextLength(locale63);
        org.joda.time.DateTimeZone dateTimeZone71 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.ReadableInstant readableInstant72 = null;
        int int73 = dateTimeZone71.getOffset(readableInstant72);
        java.util.Locale locale75 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str77 = locale75.getUnicodeLocaleType("35");
        java.lang.String str78 = dateTimeZone71.getName(64713600009L, locale75);
        java.lang.String str79 = dateTimeField53.getAsShortText((int) (short) -1, locale75);
        dateTimeParserBucket6.saveField(dateTimeFieldType42, "datetimefield[yearofcentury]", locale75);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField34 and durationField54", (durationField34.compareTo(durationField54) == 0) == durationField34.equals(durationField54));
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 100);
        java.lang.Integer int6 = dateTimeParserBucket5.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean8 = dateTimeParserBucket5.restoreState((java.lang.Object) dateTimeFieldType7);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket5.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        org.joda.time.DurationField durationField11 = chronology9.millis();
        org.joda.time.Chronology chronology13 = null;
        java.util.Locale locale14 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology13, locale14, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket(64713600009L, chronology9, locale14);
        org.joda.time.DateTimeField dateTimeField18 = chronology9.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField19 = chronology9.weekyear();
        java.lang.String str20 = chronology9.toString();
        org.joda.time.DateTimeField dateTimeField21 = chronology9.minuteOfDay();
        org.joda.time.DurationField durationField22 = chronology9.weeks();
        org.joda.time.DurationField durationField23 = chronology9.weeks();
        org.joda.time.DurationField durationField24 = chronology9.years();
        org.joda.time.DateTimeField dateTimeField25 = chronology9.minuteOfDay();
        org.joda.time.DurationField durationField26 = chronology9.millis();
        org.joda.time.DurationField durationField27 = chronology9.weekyears();
        org.joda.time.DurationField durationField28 = chronology9.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField24 and durationField27", (durationField24.compareTo(durationField27) == 0) == durationField24.equals(durationField27));
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        java.lang.Integer int7 = dateTimeParserBucket6.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean9 = dateTimeParserBucket6.restoreState((java.lang.Object) dateTimeFieldType8);
        org.joda.time.Chronology chronology10 = dateTimeParserBucket6.getChronology();
        org.joda.time.DurationField durationField11 = chronology10.days();
        org.joda.time.DateTimeZone dateTimeZone12 = chronology10.getZone();
        org.joda.time.DateTimeField dateTimeField13 = chronology10.yearOfCentury();
        java.lang.String str14 = chronology10.toString();
        org.joda.time.Chronology chronology16 = null;
        java.util.Locale locale17 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket19 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology16, locale17, (java.lang.Integer) 100);
        java.lang.Integer int20 = dateTimeParserBucket19.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean22 = dateTimeParserBucket19.restoreState((java.lang.Object) dateTimeFieldType21);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.DateTimeField dateTimeField24 = dateTimeFieldType21.getField(chronology23);
        long long27 = dateTimeField24.getDifferenceAsLong((long) ' ', (long) 1);
        org.joda.time.ReadablePartial readablePartial28 = null;
        java.util.Locale locale30 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str31 = dateTimeField24.getAsShortText(readablePartial28, (int) ' ', locale30);
        org.joda.time.Chronology chronology33 = null;
        java.util.Locale locale34 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket36 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology33, locale34, (java.lang.Integer) 100);
        java.lang.Integer int37 = dateTimeParserBucket36.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType38 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean39 = dateTimeParserBucket36.restoreState((java.lang.Object) dateTimeFieldType38);
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.DateTimeField dateTimeField41 = dateTimeFieldType38.getField(chronology40);
        long long43 = dateTimeField41.roundHalfEven(1L);
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.Chronology chronology48 = null;
        java.util.Locale locale49 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket51 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology48, locale49, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket52 = new org.joda.time.format.DateTimeParserBucket(100L, chronology46, locale49);
        java.lang.String str53 = dateTimeField41.getAsText((long) (short) 0, locale49);
        java.util.Locale.setDefault(locale49);
        java.lang.String str55 = locale30.getDisplayScript(locale49);
        java.lang.String str56 = locale30.getCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket58 = new org.joda.time.format.DateTimeParserBucket(31L, chronology10, locale30, (java.lang.Integer) 100);
        org.joda.time.DateTimeField dateTimeField59 = chronology10.year();
        java.util.Locale locale62 = new java.util.Locale("1439", "19");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket65 = new org.joda.time.format.DateTimeParserBucket(153L, chronology10, locale62, (java.lang.Integer) 31, (int) 'a');
        org.joda.time.DurationField durationField66 = chronology10.months();
        org.joda.time.DurationField durationField67 = chronology10.years();
        org.joda.time.DurationField durationField68 = chronology10.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField68, durationField11, and durationField66", !(durationField68.compareTo(durationField11) == 0) || (Math.signum(durationField68.compareTo(durationField66)) == Math.signum(durationField11.compareTo(durationField66))));
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 100);
        java.lang.Integer int5 = dateTimeParserBucket4.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean7 = dateTimeParserBucket4.restoreState((java.lang.Object) dateTimeFieldType6);
        org.joda.time.Chronology chronology8 = dateTimeParserBucket4.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeZone dateTimeZone10 = chronology8.getZone();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.yearOfCentury();
        org.joda.time.DurationField durationField12 = chronology8.years();
        java.lang.String str13 = chronology8.toString();
        org.joda.time.DateTimeField dateTimeField14 = chronology8.yearOfCentury();
        org.joda.time.DurationField durationField15 = chronology8.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField15, durationField9, and durationField12", !(durationField15.compareTo(durationField9) == 0) || (Math.signum(durationField15.compareTo(durationField12)) == Math.signum(durationField9.compareTo(durationField12))));
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 100);
        java.lang.Integer int6 = dateTimeParserBucket5.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean8 = dateTimeParserBucket5.restoreState((java.lang.Object) dateTimeFieldType7);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket5.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        org.joda.time.DateTimeField dateTimeField11 = dateTimeFieldType0.getField(chronology9);
        org.joda.time.DateTimeField dateTimeField12 = chronology9.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField13 = chronology9.millisOfDay();
        org.joda.time.DurationField durationField14 = chronology9.weeks();
        org.joda.time.DurationField durationField15 = chronology9.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField15, durationField10, and durationField14", !(durationField15.compareTo(durationField10) == 0) || (Math.signum(durationField15.compareTo(durationField14)) == Math.signum(durationField10.compareTo(durationField14))));
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        java.lang.Integer int7 = dateTimeParserBucket6.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean9 = dateTimeParserBucket6.restoreState((java.lang.Object) dateTimeFieldType8);
        org.joda.time.Chronology chronology10 = dateTimeParserBucket6.getChronology();
        org.joda.time.DurationField durationField11 = chronology10.days();
        org.joda.time.DateTimeField dateTimeField12 = dateTimeFieldType1.getField(chronology10);
        org.joda.time.DateTimeField dateTimeField13 = chronology10.dayOfMonth();
        org.joda.time.DurationField durationField14 = chronology10.seconds();
        org.joda.time.DateTimeField dateTimeField15 = chronology10.millisOfDay();
        org.joda.time.DurationField durationField16 = chronology10.days();
        org.joda.time.Chronology chronology18 = null;
        java.util.Locale locale19 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket21 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology18, locale19, (java.lang.Integer) 100);
        java.lang.Integer int22 = dateTimeParserBucket21.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean24 = dateTimeParserBucket21.restoreState((java.lang.Object) dateTimeFieldType23);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateTimeField dateTimeField26 = dateTimeFieldType23.getField(chronology25);
        long long28 = dateTimeField26.roundHalfEven(1L);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.Chronology chronology33 = null;
        java.util.Locale locale34 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket36 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology33, locale34, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket37 = new org.joda.time.format.DateTimeParserBucket(100L, chronology31, locale34);
        java.lang.String str38 = dateTimeField26.getAsText((long) (short) 0, locale34);
        java.util.Locale.setDefault(locale34);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket40 = new org.joda.time.format.DateTimeParserBucket(3599999L, chronology10, locale34);
        org.joda.time.DurationField durationField41 = chronology10.minutes();
        org.joda.time.DateTimeField dateTimeField42 = chronology10.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField43 = chronology10.clockhourOfHalfday();
        org.joda.time.DurationField durationField44 = chronology10.hours();
        org.joda.time.DateTimeField dateTimeField45 = chronology10.year();
        org.joda.time.DurationField durationField46 = chronology10.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField46, durationField11, and durationField14", !(durationField46.compareTo(durationField11) == 0) || (Math.signum(durationField46.compareTo(durationField14)) == Math.signum(durationField11.compareTo(durationField14))));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 100);
        java.lang.Integer int5 = dateTimeParserBucket4.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean7 = dateTimeParserBucket4.restoreState((java.lang.Object) dateTimeFieldType6);
        org.joda.time.Chronology chronology8 = dateTimeParserBucket4.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeZone dateTimeZone10 = chronology8.getZone();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.monthOfYear();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.weekyear();
        org.joda.time.DateTimeField dateTimeField13 = chronology8.yearOfEra();
        org.joda.time.Chronology chronology14 = chronology8.withUTC();
        org.joda.time.DurationField durationField15 = chronology14.eras();
        org.joda.time.DateTimeField dateTimeField16 = chronology14.centuryOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField9 and durationField15", Math.signum(durationField9.compareTo(durationField15)) == -Math.signum(durationField15.compareTo(durationField9)));
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        java.lang.Integer int7 = dateTimeParserBucket6.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean9 = dateTimeParserBucket6.restoreState((java.lang.Object) dateTimeFieldType8);
        org.joda.time.Chronology chronology10 = dateTimeParserBucket6.getChronology();
        org.joda.time.DurationField durationField11 = chronology10.days();
        org.joda.time.DurationField durationField12 = chronology10.millis();
        org.joda.time.Chronology chronology14 = null;
        java.util.Locale locale15 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology14, locale15, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket18 = new org.joda.time.format.DateTimeParserBucket(64713600009L, chronology10, locale15);
        org.joda.time.DurationField durationField19 = chronology10.weekyears();
        org.joda.time.DateTimeField dateTimeField20 = chronology10.secondOfDay();
        long long24 = chronology10.add(946684800000L, 1210L, 86399);
        org.joda.time.DateTimeField dateTimeField25 = chronology10.clockhourOfHalfday();
        java.util.Locale locale29 = new java.util.Locale("weekOfWeekyear", "UTC", "+00:00");
        boolean boolean30 = locale29.hasExtensions();
        org.joda.time.Chronology chronology32 = null;
        java.util.Locale locale33 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket35 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology32, locale33, (java.lang.Integer) 100);
        java.lang.String str36 = locale29.getDisplayCountry(locale33);
        java.util.Locale locale37 = locale33.stripExtensions();
        java.lang.String str38 = locale37.getVariant();
        java.util.Locale locale39 = locale37.stripExtensions();
        java.lang.String str40 = locale39.getDisplayName();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket41 = new org.joda.time.format.DateTimeParserBucket(946789342790L, chronology10, locale39);
        org.joda.time.DateTimeField dateTimeField42 = chronology10.millisOfSecond();
        org.joda.time.DurationField durationField43 = chronology10.years();
        org.joda.time.DateTimeField dateTimeField44 = chronology10.weekyearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField19 and durationField43", (durationField19.compareTo(durationField43) == 0) == durationField19.equals(durationField43));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        java.lang.Integer int7 = dateTimeParserBucket6.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean9 = dateTimeParserBucket6.restoreState((java.lang.Object) dateTimeFieldType8);
        org.joda.time.Chronology chronology10 = dateTimeParserBucket6.getChronology();
        org.joda.time.DurationField durationField11 = chronology10.years();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.Chronology chronology15 = null;
        java.util.Locale locale16 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket18 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology15, locale16, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket19 = new org.joda.time.format.DateTimeParserBucket(100L, chronology13, locale16);
        java.lang.String str20 = locale16.getScript();
        java.lang.String str22 = locale16.getExtension('u');
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket25 = new org.joda.time.format.DateTimeParserBucket(259200117L, chronology10, locale16, (java.lang.Integer) 100, (int) (byte) 1);
        org.joda.time.DurationField durationField26 = chronology10.centuries();
        java.util.Locale.Category category27 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale28 = java.util.Locale.GERMANY;
        java.lang.String str29 = locale28.getDisplayCountry();
        java.util.Locale.setDefault(category27, locale28);
        java.util.Locale locale31 = java.util.Locale.getDefault(category27);
        java.util.Locale locale32 = java.util.Locale.getDefault(category27);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket35 = new org.joda.time.format.DateTimeParserBucket(10L, chronology10, locale32, (java.lang.Integer) 100, 31);
        org.joda.time.DurationField durationField36 = chronology10.weekyears();
        org.joda.time.DateTimeField dateTimeField37 = chronology10.secondOfMinute();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField11 and durationField36", (durationField11.compareTo(durationField36) == 0) == durationField11.equals(durationField36));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 100);
        java.lang.Integer int6 = dateTimeParserBucket5.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean8 = dateTimeParserBucket5.restoreState((java.lang.Object) dateTimeFieldType7);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket5.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.years();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.Chronology chronology14 = null;
        java.util.Locale locale15 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology14, locale15, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket18 = new org.joda.time.format.DateTimeParserBucket(100L, chronology12, locale15);
        java.lang.String str19 = locale15.getScript();
        java.lang.String str21 = locale15.getExtension('u');
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket24 = new org.joda.time.format.DateTimeParserBucket(259200117L, chronology9, locale15, (java.lang.Integer) 100, (int) (byte) 1);
        org.joda.time.DurationField durationField25 = chronology9.centuries();
        org.joda.time.DateTimeField dateTimeField26 = chronology9.secondOfDay();
        org.joda.time.Chronology chronology27 = chronology9.withUTC();
        org.joda.time.DurationField durationField28 = chronology9.weekyears();
        org.joda.time.DateTimeField dateTimeField29 = chronology9.dayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField10 and durationField28", (durationField10.compareTo(durationField28) == 0) == durationField10.equals(durationField28));
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 100);
        java.lang.Integer int6 = dateTimeParserBucket5.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean8 = dateTimeParserBucket5.restoreState((java.lang.Object) dateTimeFieldType7);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket5.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        org.joda.time.DateTimeZone dateTimeZone11 = chronology9.getZone();
        org.joda.time.Chronology chronology13 = null;
        java.util.Locale locale14 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology13, locale14, (java.lang.Integer) 100);
        java.lang.String str17 = locale14.getCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket20 = new org.joda.time.format.DateTimeParserBucket(0L, chronology9, locale14, (java.lang.Integer) 100, (int) (byte) 1);
        org.joda.time.DurationField durationField21 = chronology9.halfdays();
        org.joda.time.DurationField durationField22 = chronology9.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField22, durationField10, and durationField21", !(durationField22.compareTo(durationField10) == 0) || (Math.signum(durationField22.compareTo(durationField21)) == Math.signum(durationField10.compareTo(durationField21))));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 100);
        java.lang.Integer int6 = dateTimeParserBucket5.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean8 = dateTimeParserBucket5.restoreState((java.lang.Object) dateTimeFieldType7);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket5.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        org.joda.time.DurationField durationField11 = chronology9.millis();
        org.joda.time.Chronology chronology13 = null;
        java.util.Locale locale14 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology13, locale14, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket(64713600009L, chronology9, locale14);
        org.joda.time.DurationField durationField18 = chronology9.weekyears();
        org.joda.time.DateTimeField dateTimeField19 = chronology9.secondOfDay();
        long long23 = chronology9.add(946684800000L, 1210L, 86399);
        org.joda.time.DateTimeField dateTimeField24 = chronology9.clockhourOfHalfday();
        org.joda.time.ReadablePartial readablePartial25 = null;
        org.joda.time.Chronology chronology31 = null;
        java.util.Locale locale32 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket34 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology31, locale32, (java.lang.Integer) 100);
        java.lang.Integer int35 = dateTimeParserBucket34.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean37 = dateTimeParserBucket34.restoreState((java.lang.Object) dateTimeFieldType36);
        org.joda.time.Chronology chronology38 = dateTimeParserBucket34.getChronology();
        org.joda.time.DurationField durationField39 = chronology38.years();
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.Chronology chronology43 = null;
        java.util.Locale locale44 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket46 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology43, locale44, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket47 = new org.joda.time.format.DateTimeParserBucket(100L, chronology41, locale44);
        java.lang.String str48 = locale44.getScript();
        java.lang.String str50 = locale44.getExtension('u');
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket53 = new org.joda.time.format.DateTimeParserBucket(259200117L, chronology38, locale44, (java.lang.Integer) 100, (int) (byte) 1);
        org.joda.time.DurationField durationField54 = chronology38.centuries();
        java.util.Locale.Category category55 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale56 = java.util.Locale.GERMANY;
        java.lang.String str57 = locale56.getDisplayCountry();
        java.util.Locale.setDefault(category55, locale56);
        java.util.Locale locale59 = java.util.Locale.getDefault(category55);
        java.util.Locale locale60 = java.util.Locale.getDefault(category55);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket63 = new org.joda.time.format.DateTimeParserBucket(10L, chronology38, locale60, (java.lang.Integer) 100, 31);
        org.joda.time.Chronology chronology64 = chronology38.withUTC();
        org.joda.time.DateTimeField dateTimeField65 = chronology38.halfdayOfDay();
        java.util.Locale.Builder builder66 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder67 = builder66.clear();
        java.util.Locale locale68 = builder67.build();
        java.util.Locale locale69 = locale68.stripExtensions();
        java.lang.String str70 = locale69.getCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket72 = new org.joda.time.format.DateTimeParserBucket(259200048L, chronology38, locale69, (java.lang.Integer) 365);
        org.joda.time.Chronology chronology74 = null;
        java.util.Locale locale75 = java.util.Locale.JAPANESE;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket77 = new org.joda.time.format.DateTimeParserBucket(9L, chronology74, locale75, (java.lang.Integer) 0);
        java.util.Locale.setDefault(locale75);
        java.lang.String str79 = locale69.getDisplayCountry(locale75);
        java.lang.String str80 = dateTimeField24.getAsShortText(readablePartial25, (-6011), locale69);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField18 and durationField39", (durationField18.compareTo(durationField39) == 0) == durationField18.equals(durationField39));
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str1 = dateTimeFieldType0.getName();
        org.joda.time.Chronology chronology4 = null;
        java.util.Locale locale5 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology4, locale5, (java.lang.Integer) 100);
        java.lang.Integer int8 = dateTimeParserBucket7.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean10 = dateTimeParserBucket7.restoreState((java.lang.Object) dateTimeFieldType9);
        org.joda.time.Chronology chronology11 = dateTimeParserBucket7.getChronology();
        org.joda.time.DurationField durationField12 = chronology11.days();
        org.joda.time.DurationField durationField13 = chronology11.millis();
        org.joda.time.Chronology chronology15 = null;
        java.util.Locale locale16 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket18 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology15, locale16, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket19 = new org.joda.time.format.DateTimeParserBucket(64713600009L, chronology11, locale16);
        org.joda.time.DateTimeField dateTimeField20 = chronology11.minuteOfDay();
        org.joda.time.DurationField durationField21 = chronology11.days();
        boolean boolean22 = dateTimeFieldType0.isSupported(chronology11);
        org.joda.time.DateTimeField dateTimeField23 = chronology11.clockhourOfDay();
        long long27 = chronology11.add(1187L, (long) 18874799, (int) '4');
        org.joda.time.DateTimeField dateTimeField28 = chronology11.hourOfDay();
        org.joda.time.DurationField durationField29 = chronology11.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField29, durationField12, and durationField13", !(durationField29.compareTo(durationField12) == 0) || (Math.signum(durationField29.compareTo(durationField13)) == Math.signum(durationField12.compareTo(durationField13))));
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        java.lang.Integer int7 = dateTimeParserBucket6.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean9 = dateTimeParserBucket6.restoreState((java.lang.Object) dateTimeFieldType8);
        org.joda.time.Chronology chronology10 = dateTimeParserBucket6.getChronology();
        org.joda.time.DurationField durationField11 = chronology10.days();
        org.joda.time.DurationField durationField12 = chronology10.millis();
        org.joda.time.Chronology chronology14 = null;
        java.util.Locale locale15 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology14, locale15, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket18 = new org.joda.time.format.DateTimeParserBucket(64713600009L, chronology10, locale15);
        org.joda.time.DurationField durationField19 = chronology10.weekyears();
        java.util.Locale locale20 = java.util.Locale.ITALIAN;
        java.util.Locale locale21 = locale20.stripExtensions();
        java.util.Locale locale22 = java.util.Locale.GERMAN;
        java.lang.String str23 = locale21.getDisplayVariant(locale22);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket26 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology10, locale21, (java.lang.Integer) 100, 31);
        org.joda.time.DateTimeField dateTimeField27 = chronology10.millisOfDay();
        org.joda.time.DateTimeField dateTimeField28 = chronology10.weekyearOfCentury();
        long long32 = chronology10.add((long) (byte) 10, (long) 'x', (int) (byte) 10);
        org.joda.time.DateTimeField dateTimeField33 = chronology10.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField34 = chronology10.dayOfMonth();
        java.util.Locale locale36 = java.util.Locale.KOREA;
        boolean boolean37 = locale36.hasExtensions();
        java.util.Locale locale38 = java.util.Locale.getDefault();
        java.lang.String str39 = locale38.getISO3Country();
        java.lang.String str40 = locale38.getISO3Language();
        java.util.Locale.setDefault(locale38);
        java.util.Set<java.lang.String> strSet42 = locale38.getUnicodeLocaleAttributes();
        org.joda.time.Chronology chronology45 = null;
        java.util.Locale locale46 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket48 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology45, locale46, (java.lang.Integer) 100);
        java.lang.Integer int49 = dateTimeParserBucket48.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType50 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean51 = dateTimeParserBucket48.restoreState((java.lang.Object) dateTimeFieldType50);
        org.joda.time.Chronology chronology52 = dateTimeParserBucket48.getChronology();
        org.joda.time.DurationField durationField53 = chronology52.years();
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.Chronology chronology57 = null;
        java.util.Locale locale58 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket60 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology57, locale58, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket61 = new org.joda.time.format.DateTimeParserBucket(100L, chronology55, locale58);
        java.lang.String str62 = locale58.getScript();
        java.lang.String str64 = locale58.getExtension('u');
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket67 = new org.joda.time.format.DateTimeParserBucket(259200117L, chronology52, locale58, (java.lang.Integer) 100, (int) (byte) 1);
        java.lang.String str68 = locale38.getDisplayVariant(locale58);
        boolean boolean69 = locale58.hasExtensions();
        java.util.Locale locale70 = locale58.stripExtensions();
        java.lang.String str71 = locale70.getVariant();
        java.lang.String str72 = locale36.getDisplayVariant(locale70);
        java.lang.String str73 = dateTimeField34.getAsShortText(5100, locale36);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField19 and durationField53", (durationField19.compareTo(durationField53) == 0) == durationField19.equals(durationField53));
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        java.lang.Integer int7 = dateTimeParserBucket6.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean9 = dateTimeParserBucket6.restoreState((java.lang.Object) dateTimeFieldType8);
        org.joda.time.Chronology chronology10 = dateTimeParserBucket6.getChronology();
        org.joda.time.DurationField durationField11 = chronology10.days();
        org.joda.time.DurationField durationField12 = chronology10.millis();
        org.joda.time.DateTimeZone dateTimeZone13 = chronology10.getZone();
        java.util.Locale locale14 = java.util.Locale.CHINESE;
        java.lang.String str15 = locale14.toLanguageTag();
        java.lang.String str16 = locale14.getLanguage();
        java.lang.String str17 = locale14.getISO3Language();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket20 = new org.joda.time.format.DateTimeParserBucket(0L, chronology10, locale14, (java.lang.Integer) 2, (int) (byte) 1);
        org.joda.time.DateTimeField dateTimeField21 = chronology10.weekyearOfCentury();
        java.util.Locale.Category category22 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale26 = new java.util.Locale("10", "jpn", "us");
        java.lang.String str27 = locale26.getDisplayName();
        java.util.Locale.setDefault(category22, locale26);
        java.util.Set<java.lang.String> strSet29 = locale26.getUnicodeLocaleAttributes();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket30 = new org.joda.time.format.DateTimeParserBucket((-1468800000L), chronology10, locale26);
        org.joda.time.DurationField durationField31 = chronology10.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField31, durationField11, and durationField12", !(durationField31.compareTo(durationField11) == 0) || (Math.signum(durationField31.compareTo(durationField12)) == Math.signum(durationField11.compareTo(durationField12))));
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        java.lang.Integer int7 = dateTimeParserBucket6.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean9 = dateTimeParserBucket6.restoreState((java.lang.Object) dateTimeFieldType8);
        org.joda.time.Chronology chronology10 = dateTimeParserBucket6.getChronology();
        org.joda.time.DurationField durationField11 = chronology10.days();
        org.joda.time.DateTimeZone dateTimeZone12 = chronology10.getZone();
        org.joda.time.DurationField durationField13 = chronology10.months();
        org.joda.time.DateTimeField dateTimeField14 = chronology10.dayOfMonth();
        org.joda.time.DurationField durationField15 = chronology10.centuries();
        boolean boolean16 = dateTimeFieldType1.isSupported(chronology10);
        org.joda.time.DurationField durationField17 = chronology10.years();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.Chronology chronology21 = null;
        java.util.Locale locale22 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket24 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology21, locale22, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket25 = new org.joda.time.format.DateTimeParserBucket(100L, chronology19, locale22);
        java.lang.String str26 = locale22.getScript();
        java.lang.String str28 = locale22.getExtension('u');
        java.util.Locale locale30 = new java.util.Locale("2");
        java.lang.String str31 = locale22.getDisplayCountry(locale30);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket33 = new org.joda.time.format.DateTimeParserBucket(28857600000L, chronology10, locale22, (java.lang.Integer) 53);
        org.joda.time.DurationField durationField34 = chronology10.weekyears();
        org.joda.time.DurationField durationField35 = chronology10.weeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField17 and durationField34", (durationField17.compareTo(durationField34) == 0) == durationField17.equals(durationField34));
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 100);
        java.lang.Integer int6 = dateTimeParserBucket5.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean8 = dateTimeParserBucket5.restoreState((java.lang.Object) dateTimeFieldType7);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket5.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        org.joda.time.DateTimeField dateTimeField11 = dateTimeFieldType0.getField(chronology9);
        org.joda.time.DateTimeField dateTimeField12 = chronology9.millisOfSecond();
        long long16 = chronology9.add(54L, (long) 360000000, (int) (byte) 10);
        org.joda.time.DurationField durationField17 = chronology9.eras();
        org.joda.time.DateTimeField dateTimeField18 = chronology9.dayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField10 and durationField17", Math.signum(durationField10.compareTo(durationField17)) == -Math.signum(durationField17.compareTo(durationField10)));
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 100);
        java.lang.Integer int6 = dateTimeParserBucket5.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean8 = dateTimeParserBucket5.restoreState((java.lang.Object) dateTimeFieldType7);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket5.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.years();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.Chronology chronology14 = null;
        java.util.Locale locale15 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology14, locale15, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket18 = new org.joda.time.format.DateTimeParserBucket(100L, chronology12, locale15);
        java.lang.String str19 = locale15.getScript();
        java.lang.String str21 = locale15.getExtension('u');
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket24 = new org.joda.time.format.DateTimeParserBucket(259200117L, chronology9, locale15, (java.lang.Integer) 100, (int) (byte) 1);
        org.joda.time.DurationField durationField25 = chronology9.centuries();
        org.joda.time.DateTimeField dateTimeField26 = chronology9.secondOfDay();
        org.joda.time.Chronology chronology27 = chronology9.withUTC();
        org.joda.time.DurationField durationField28 = chronology9.weekyears();
        org.joda.time.DateTimeField dateTimeField29 = chronology9.weekyearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField10 and durationField28", (durationField10.compareTo(durationField28) == 0) == durationField10.equals(durationField28));
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 100);
        java.lang.Integer int5 = dateTimeParserBucket4.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean7 = dateTimeParserBucket4.restoreState((java.lang.Object) dateTimeFieldType6);
        org.joda.time.Chronology chronology8 = dateTimeParserBucket4.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DurationField durationField10 = chronology8.millis();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.dayOfMonth();
        org.joda.time.DurationField durationField12 = chronology8.weeks();
        org.joda.time.DateTimeField dateTimeField13 = chronology8.year();
        long long17 = chronology8.add((-62104060800001L), 64713600009L, 0);
        org.joda.time.DateTimeField dateTimeField18 = chronology8.weekOfWeekyear();
        org.joda.time.DurationField durationField19 = chronology8.seconds();
        org.joda.time.DurationField durationField20 = chronology8.minutes();
        org.joda.time.DurationField durationField21 = chronology8.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField21, durationField9, and durationField10", !(durationField21.compareTo(durationField9) == 0) || (Math.signum(durationField21.compareTo(durationField10)) == Math.signum(durationField9.compareTo(durationField10))));
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 100);
        java.lang.Integer int5 = dateTimeParserBucket4.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean7 = dateTimeParserBucket4.restoreState((java.lang.Object) dateTimeFieldType6);
        org.joda.time.Chronology chronology8 = dateTimeParserBucket4.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeZone dateTimeZone10 = chronology8.getZone();
        org.joda.time.DurationField durationField11 = chronology8.months();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.dayOfMonth();
        org.joda.time.DurationField durationField13 = chronology8.centuries();
        org.joda.time.DurationField durationField14 = chronology8.millis();
        org.joda.time.Chronology chronology15 = chronology8.withUTC();
        org.joda.time.DurationField durationField16 = chronology15.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField16, durationField9, and durationField11", !(durationField16.compareTo(durationField9) == 0) || (Math.signum(durationField16.compareTo(durationField11)) == Math.signum(durationField9.compareTo(durationField11))));
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 100);
        java.lang.Integer int6 = dateTimeParserBucket5.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean8 = dateTimeParserBucket5.restoreState((java.lang.Object) dateTimeFieldType7);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket5.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        org.joda.time.DurationField durationField11 = chronology9.millis();
        org.joda.time.Chronology chronology13 = null;
        java.util.Locale locale14 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology13, locale14, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket(64713600009L, chronology9, locale14);
        org.joda.time.DateTimeField dateTimeField18 = chronology9.minuteOfDay();
        org.joda.time.DurationField durationField19 = chronology9.days();
        java.lang.String str20 = chronology9.toString();
        org.joda.time.DateTimeField dateTimeField21 = chronology9.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField22 = chronology9.yearOfCentury();
        org.joda.time.DurationField durationField23 = chronology9.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField23, durationField10, and durationField11", !(durationField23.compareTo(durationField10) == 0) || (Math.signum(durationField23.compareTo(durationField11)) == Math.signum(durationField10.compareTo(durationField11))));
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 100);
        java.lang.Integer int5 = dateTimeParserBucket4.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean7 = dateTimeParserBucket4.restoreState((java.lang.Object) dateTimeFieldType6);
        org.joda.time.Chronology chronology8 = dateTimeParserBucket4.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeZone dateTimeZone10 = chronology8.getZone();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.monthOfYear();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.hourOfHalfday();
        org.joda.time.DurationField durationField13 = chronology8.days();
        org.joda.time.DurationField durationField14 = chronology8.hours();
        org.joda.time.DateTimeField dateTimeField15 = chronology8.clockhourOfHalfday();
        org.joda.time.DurationField durationField16 = chronology8.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField16, durationField9, and durationField14", !(durationField16.compareTo(durationField9) == 0) || (Math.signum(durationField16.compareTo(durationField14)) == Math.signum(durationField9.compareTo(durationField14))));
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 100);
        java.lang.Integer int5 = dateTimeParserBucket4.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean7 = dateTimeParserBucket4.restoreState((java.lang.Object) dateTimeFieldType6);
        org.joda.time.Chronology chronology8 = dateTimeParserBucket4.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeZone dateTimeZone10 = chronology8.getZone();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.yearOfCentury();
        java.lang.String str12 = chronology8.toString();
        org.joda.time.Chronology chronology13 = chronology8.withUTC();
        org.joda.time.DateTimeField dateTimeField14 = chronology8.secondOfDay();
        org.joda.time.DateTimeField dateTimeField15 = chronology8.halfdayOfDay();
        org.joda.time.Chronology chronology16 = chronology8.withUTC();
        org.joda.time.DurationField durationField17 = chronology16.eras();
        org.joda.time.DateTimeField dateTimeField18 = chronology16.dayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField9 and durationField17", Math.signum(durationField9.compareTo(durationField17)) == -Math.signum(durationField17.compareTo(durationField9)));
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 100);
        java.lang.Integer int6 = dateTimeParserBucket5.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean8 = dateTimeParserBucket5.restoreState((java.lang.Object) dateTimeFieldType7);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket5.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        org.joda.time.DurationField durationField11 = chronology9.millis();
        org.joda.time.DateTimeField dateTimeField12 = chronology9.clockhourOfHalfday();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        long long16 = chronology9.add(readablePeriod13, (long) 'u', 11);
        java.util.Locale locale18 = java.util.Locale.forLanguageTag("CN");
        java.lang.String str19 = locale18.getVariant();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket22 = new org.joda.time.format.DateTimeParserBucket((long) 'u', chronology9, locale18, (java.lang.Integer) 86399999, (int) 'a');
        org.joda.time.Chronology chronology23 = dateTimeParserBucket22.getChronology();
        org.joda.time.Chronology chronology24 = chronology23.withUTC();
        org.joda.time.DurationField durationField25 = chronology24.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField25, durationField10, and durationField11", !(durationField25.compareTo(durationField10) == 0) || (Math.signum(durationField25.compareTo(durationField11)) == Math.signum(durationField10.compareTo(durationField11))));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 100);
        java.lang.Integer int6 = dateTimeParserBucket5.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean8 = dateTimeParserBucket5.restoreState((java.lang.Object) dateTimeFieldType7);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket5.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        org.joda.time.DateTimeZone dateTimeZone11 = chronology9.getZone();
        org.joda.time.DateTimeField dateTimeField12 = chronology9.yearOfCentury();
        java.lang.String str13 = chronology9.toString();
        org.joda.time.Chronology chronology14 = chronology9.withUTC();
        org.joda.time.DateTimeField dateTimeField15 = chronology9.secondOfDay();
        boolean boolean16 = dateTimeFieldType0.isSupported(chronology9);
        java.lang.String str17 = chronology9.toString();
        org.joda.time.DateTimeField dateTimeField18 = chronology9.secondOfMinute();
        org.joda.time.DurationField durationField19 = chronology9.centuries();
        org.joda.time.DateTimeField dateTimeField20 = chronology9.millisOfSecond();
        org.joda.time.DurationField durationField21 = chronology9.centuries();
        org.joda.time.DateTimeField dateTimeField22 = chronology9.secondOfDay();
        long long26 = chronology9.add(6652800026L, (long) 100, 18874799);
        org.joda.time.DateTimeField dateTimeField27 = chronology9.hourOfDay();
        org.joda.time.DurationField durationField28 = chronology9.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField28, durationField10, and durationField19", !(durationField28.compareTo(durationField10) == 0) || (Math.signum(durationField28.compareTo(durationField19)) == Math.signum(durationField10.compareTo(durationField19))));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 100);
        java.lang.Integer int6 = dateTimeParserBucket5.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean8 = dateTimeParserBucket5.restoreState((java.lang.Object) dateTimeFieldType7);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket5.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        org.joda.time.DurationField durationField11 = chronology9.millis();
        org.joda.time.Chronology chronology13 = null;
        java.util.Locale locale14 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology13, locale14, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket(64713600009L, chronology9, locale14);
        org.joda.time.DateTimeField dateTimeField18 = chronology9.weekOfWeekyear();
        org.joda.time.DurationField durationField19 = chronology9.centuries();
        org.joda.time.DateTimeField dateTimeField20 = chronology9.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField21 = chronology9.weekyear();
        org.joda.time.DateTimeField dateTimeField22 = chronology9.minuteOfDay();
        org.joda.time.DurationField durationField23 = chronology9.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField23, durationField10, and durationField11", !(durationField23.compareTo(durationField10) == 0) || (Math.signum(durationField23.compareTo(durationField11)) == Math.signum(durationField10.compareTo(durationField11))));
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        java.lang.Integer int7 = dateTimeParserBucket6.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean9 = dateTimeParserBucket6.restoreState((java.lang.Object) dateTimeFieldType8);
        org.joda.time.Chronology chronology10 = dateTimeParserBucket6.getChronology();
        org.joda.time.DurationField durationField11 = chronology10.days();
        org.joda.time.DateTimeZone dateTimeZone12 = chronology10.getZone();
        org.joda.time.DurationField durationField13 = chronology10.months();
        org.joda.time.DurationField durationField14 = chronology10.hours();
        org.joda.time.DateTimeField dateTimeField15 = chronology10.hourOfDay();
        org.joda.time.DateTimeField dateTimeField16 = chronology10.yearOfEra();
        org.joda.time.DurationField durationField17 = chronology10.millis();
        java.util.Locale locale20 = new java.util.Locale("24", "Cina");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket23 = new org.joda.time.format.DateTimeParserBucket(15552005220000L, chronology10, locale20, (java.lang.Integer) 5207, (int) (byte) 10);
        java.util.Locale locale26 = new java.util.Locale("Italienisch", "zho");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket28 = new org.joda.time.format.DateTimeParserBucket(6048000035L, chronology10, locale26, (java.lang.Integer) 11);
        org.joda.time.DateTimeField dateTimeField29 = chronology10.millisOfDay();
        org.joda.time.DateTimeField dateTimeField30 = chronology10.era();
        org.joda.time.DurationField durationField31 = chronology10.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField31, durationField11, and durationField13", !(durationField31.compareTo(durationField11) == 0) || (Math.signum(durationField31.compareTo(durationField13)) == Math.signum(durationField11.compareTo(durationField13))));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        java.lang.Integer int7 = dateTimeParserBucket6.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean9 = dateTimeParserBucket6.restoreState((java.lang.Object) dateTimeFieldType8);
        org.joda.time.Chronology chronology10 = dateTimeParserBucket6.getChronology();
        org.joda.time.DurationField durationField11 = chronology10.days();
        org.joda.time.DateTimeField dateTimeField12 = dateTimeFieldType1.getField(chronology10);
        org.joda.time.DateTimeField dateTimeField13 = chronology10.dayOfMonth();
        org.joda.time.DurationField durationField14 = chronology10.seconds();
        org.joda.time.DateTimeField dateTimeField15 = chronology10.millisOfDay();
        org.joda.time.DurationField durationField16 = chronology10.days();
        org.joda.time.Chronology chronology18 = null;
        java.util.Locale locale19 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket21 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology18, locale19, (java.lang.Integer) 100);
        java.lang.Integer int22 = dateTimeParserBucket21.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean24 = dateTimeParserBucket21.restoreState((java.lang.Object) dateTimeFieldType23);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateTimeField dateTimeField26 = dateTimeFieldType23.getField(chronology25);
        long long28 = dateTimeField26.roundHalfEven(1L);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.Chronology chronology33 = null;
        java.util.Locale locale34 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket36 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology33, locale34, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket37 = new org.joda.time.format.DateTimeParserBucket(100L, chronology31, locale34);
        java.lang.String str38 = dateTimeField26.getAsText((long) (short) 0, locale34);
        java.util.Locale.setDefault(locale34);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket40 = new org.joda.time.format.DateTimeParserBucket(3599999L, chronology10, locale34);
        org.joda.time.DurationField durationField41 = chronology10.months();
        org.joda.time.ReadablePeriod readablePeriod42 = null;
        long long45 = chronology10.add(readablePeriod42, (-193893601L), 7343661);
        org.joda.time.DurationField durationField46 = chronology10.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField46, durationField11, and durationField14", !(durationField46.compareTo(durationField11) == 0) || (Math.signum(durationField46.compareTo(durationField14)) == Math.signum(durationField11.compareTo(durationField14))));
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 100);
        java.lang.Integer int6 = dateTimeParserBucket5.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean8 = dateTimeParserBucket5.restoreState((java.lang.Object) dateTimeFieldType7);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket5.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        org.joda.time.DateTimeZone dateTimeZone11 = chronology9.getZone();
        org.joda.time.DateTimeField dateTimeField12 = chronology9.yearOfCentury();
        org.joda.time.DurationField durationField13 = chronology9.years();
        java.lang.String str14 = chronology9.toString();
        org.joda.time.DurationField durationField15 = chronology9.weekyears();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.Chronology chronology19 = null;
        java.util.Locale locale20 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket22 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology19, locale20, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket23 = new org.joda.time.format.DateTimeParserBucket(100L, chronology17, locale20);
        java.lang.String str24 = locale20.getScript();
        java.lang.String str25 = locale20.getISO3Country();
        java.util.Locale locale26 = java.util.Locale.CHINA;
        java.lang.String str27 = locale26.getDisplayName();
        org.joda.time.Chronology chronology29 = null;
        java.util.Locale locale30 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket32 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology29, locale30, (java.lang.Integer) 100);
        java.lang.Integer int33 = dateTimeParserBucket32.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean35 = dateTimeParserBucket32.restoreState((java.lang.Object) dateTimeFieldType34);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.DateTimeField dateTimeField37 = dateTimeFieldType34.getField(chronology36);
        org.joda.time.DurationField durationField38 = dateTimeField37.getDurationField();
        long long41 = dateTimeField37.add(9L, 107L);
        int int42 = dateTimeField37.getMaximumValue();
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.Chronology chronology46 = null;
        java.util.Locale locale47 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket49 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology46, locale47, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket50 = new org.joda.time.format.DateTimeParserBucket(100L, chronology44, locale47);
        java.lang.String str51 = locale47.getDisplayScript();
        int int52 = dateTimeField37.getMaximumTextLength(locale47);
        java.lang.String str53 = locale26.getDisplayName(locale47);
        java.lang.String str54 = locale20.getDisplayCountry(locale47);
        org.joda.time.Chronology chronology56 = null;
        java.util.Locale locale57 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket59 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology56, locale57, (java.lang.Integer) 100);
        java.lang.Integer int60 = dateTimeParserBucket59.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType61 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean62 = dateTimeParserBucket59.restoreState((java.lang.Object) dateTimeFieldType61);
        org.joda.time.Chronology chronology63 = null;
        org.joda.time.DateTimeField dateTimeField64 = dateTimeFieldType61.getField(chronology63);
        long long67 = dateTimeField64.getDifferenceAsLong((long) ' ', (long) 1);
        org.joda.time.ReadablePartial readablePartial68 = null;
        java.util.Locale locale70 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str71 = dateTimeField64.getAsShortText(readablePartial68, (int) ' ', locale70);
        org.joda.time.Chronology chronology73 = null;
        java.util.Locale locale74 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket76 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology73, locale74, (java.lang.Integer) 100);
        java.lang.Integer int77 = dateTimeParserBucket76.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType78 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean79 = dateTimeParserBucket76.restoreState((java.lang.Object) dateTimeFieldType78);
        org.joda.time.Chronology chronology80 = null;
        org.joda.time.DateTimeField dateTimeField81 = dateTimeFieldType78.getField(chronology80);
        long long83 = dateTimeField81.roundHalfEven(1L);
        org.joda.time.Chronology chronology86 = null;
        org.joda.time.Chronology chronology88 = null;
        java.util.Locale locale89 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket91 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology88, locale89, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket92 = new org.joda.time.format.DateTimeParserBucket(100L, chronology86, locale89);
        java.lang.String str93 = dateTimeField81.getAsText((long) (short) 0, locale89);
        java.util.Locale.setDefault(locale89);
        java.lang.String str95 = locale70.getDisplayScript(locale89);
        java.lang.String str96 = locale70.getISO3Language();
        java.lang.String str97 = locale47.getDisplayLanguage(locale70);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket98 = new org.joda.time.format.DateTimeParserBucket(0L, chronology9, locale47);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField13 and durationField15", (durationField13.compareTo(durationField15) == 0) == durationField13.equals(durationField15));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 100);
        java.lang.Integer int6 = dateTimeParserBucket5.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean8 = dateTimeParserBucket5.restoreState((java.lang.Object) dateTimeFieldType7);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket5.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        org.joda.time.DurationField durationField11 = chronology9.millis();
        org.joda.time.Chronology chronology13 = null;
        java.util.Locale locale14 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology13, locale14, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket(64713600009L, chronology9, locale14);
        org.joda.time.DateTimeField dateTimeField18 = chronology9.weekOfWeekyear();
        org.joda.time.DurationField durationField19 = chronology9.centuries();
        org.joda.time.DateTimeField dateTimeField20 = chronology9.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField21 = chronology9.millisOfDay();
        org.joda.time.DurationField durationField22 = chronology9.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField22, durationField10, and durationField11", !(durationField22.compareTo(durationField10) == 0) || (Math.signum(durationField22.compareTo(durationField11)) == Math.signum(durationField10.compareTo(durationField11))));
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        java.lang.Integer int7 = dateTimeParserBucket6.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean9 = dateTimeParserBucket6.restoreState((java.lang.Object) dateTimeFieldType8);
        org.joda.time.Chronology chronology10 = dateTimeParserBucket6.getChronology();
        org.joda.time.DurationField durationField11 = chronology10.days();
        org.joda.time.DateTimeField dateTimeField12 = dateTimeFieldType1.getField(chronology10);
        org.joda.time.DateTimeField dateTimeField13 = chronology10.dayOfMonth();
        org.joda.time.DurationField durationField14 = chronology10.seconds();
        org.joda.time.DateTimeField dateTimeField15 = chronology10.millisOfDay();
        org.joda.time.DurationField durationField16 = chronology10.days();
        org.joda.time.Chronology chronology18 = null;
        java.util.Locale locale19 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket21 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology18, locale19, (java.lang.Integer) 100);
        java.lang.Integer int22 = dateTimeParserBucket21.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean24 = dateTimeParserBucket21.restoreState((java.lang.Object) dateTimeFieldType23);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateTimeField dateTimeField26 = dateTimeFieldType23.getField(chronology25);
        long long28 = dateTimeField26.roundHalfEven(1L);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.Chronology chronology33 = null;
        java.util.Locale locale34 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket36 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology33, locale34, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket37 = new org.joda.time.format.DateTimeParserBucket(100L, chronology31, locale34);
        java.lang.String str38 = dateTimeField26.getAsText((long) (short) 0, locale34);
        java.util.Locale.setDefault(locale34);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket40 = new org.joda.time.format.DateTimeParserBucket(3599999L, chronology10, locale34);
        org.joda.time.DurationField durationField41 = chronology10.minutes();
        org.joda.time.DateTimeField dateTimeField42 = chronology10.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField43 = chronology10.clockhourOfHalfday();
        org.joda.time.DurationField durationField44 = chronology10.hours();
        org.joda.time.DurationField durationField45 = chronology10.years();
        org.joda.time.DurationField durationField46 = chronology10.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField46, durationField11, and durationField14", !(durationField46.compareTo(durationField11) == 0) || (Math.signum(durationField46.compareTo(durationField14)) == Math.signum(durationField11.compareTo(durationField14))));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 100);
        java.lang.Integer int6 = dateTimeParserBucket5.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean8 = dateTimeParserBucket5.restoreState((java.lang.Object) dateTimeFieldType7);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket5.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        org.joda.time.DurationField durationField11 = chronology9.millis();
        org.joda.time.Chronology chronology13 = null;
        java.util.Locale locale14 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology13, locale14, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket(64713600009L, chronology9, locale14);
        org.joda.time.DateTimeField dateTimeField18 = chronology9.minuteOfDay();
        org.joda.time.DurationField durationField19 = chronology9.days();
        java.lang.String str20 = chronology9.toString();
        org.joda.time.DateTimeField dateTimeField21 = chronology9.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField22 = chronology9.clockhourOfHalfday();
        org.joda.time.DurationField durationField23 = chronology9.minutes();
        org.joda.time.DurationField durationField24 = chronology9.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField24, durationField10, and durationField11", !(durationField24.compareTo(durationField10) == 0) || (Math.signum(durationField24.compareTo(durationField11)) == Math.signum(durationField10.compareTo(durationField11))));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        java.lang.Integer int7 = dateTimeParserBucket6.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean9 = dateTimeParserBucket6.restoreState((java.lang.Object) dateTimeFieldType8);
        org.joda.time.Chronology chronology10 = dateTimeParserBucket6.getChronology();
        org.joda.time.DurationField durationField11 = chronology10.days();
        org.joda.time.DateTimeZone dateTimeZone12 = chronology10.getZone();
        org.joda.time.Chronology chronology14 = null;
        java.util.Locale locale15 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology14, locale15, (java.lang.Integer) 100);
        java.lang.String str18 = locale15.getCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket21 = new org.joda.time.format.DateTimeParserBucket(0L, chronology10, locale15, (java.lang.Integer) 100, (int) (byte) 1);
        org.joda.time.DateTimeField dateTimeField22 = chronology10.centuryOfEra();
        java.util.Locale locale23 = java.util.Locale.ITALY;
        java.lang.String str24 = locale23.getScript();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket26 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology10, locale23, (java.lang.Integer) 31);
        org.joda.time.DurationField durationField27 = chronology10.halfdays();
        org.joda.time.DateTimeField dateTimeField28 = chronology10.minuteOfHour();
        org.joda.time.DurationField durationField29 = chronology10.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField29, durationField11, and durationField27", !(durationField29.compareTo(durationField11) == 0) || (Math.signum(durationField29.compareTo(durationField27)) == Math.signum(durationField11.compareTo(durationField27))));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 100);
        java.lang.Integer int5 = dateTimeParserBucket4.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean7 = dateTimeParserBucket4.restoreState((java.lang.Object) dateTimeFieldType6);
        org.joda.time.Chronology chronology8 = dateTimeParserBucket4.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeZone dateTimeZone10 = chronology8.getZone();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.yearOfCentury();
        org.joda.time.DurationField durationField12 = chronology8.years();
        org.joda.time.DateTimeField dateTimeField13 = chronology8.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField14 = chronology8.year();
        org.joda.time.DateTimeField dateTimeField15 = chronology8.dayOfMonth();
        org.joda.time.DurationField durationField16 = chronology8.halfdays();
        org.joda.time.DurationField durationField17 = chronology8.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField17, durationField9, and durationField12", !(durationField17.compareTo(durationField9) == 0) || (Math.signum(durationField17.compareTo(durationField12)) == Math.signum(durationField9.compareTo(durationField12))));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        java.lang.Integer int7 = dateTimeParserBucket6.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean9 = dateTimeParserBucket6.restoreState((java.lang.Object) dateTimeFieldType8);
        org.joda.time.Chronology chronology10 = dateTimeParserBucket6.getChronology();
        org.joda.time.DurationField durationField11 = chronology10.days();
        org.joda.time.DateTimeZone dateTimeZone12 = chronology10.getZone();
        org.joda.time.Chronology chronology14 = null;
        java.util.Locale locale15 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology14, locale15, (java.lang.Integer) 100);
        java.lang.String str18 = locale15.getCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket21 = new org.joda.time.format.DateTimeParserBucket(0L, chronology10, locale15, (java.lang.Integer) 100, (int) (byte) 1);
        org.joda.time.DateTimeField dateTimeField22 = chronology10.centuryOfEra();
        java.util.Locale locale23 = java.util.Locale.ITALY;
        java.lang.String str24 = locale23.getScript();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket26 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology10, locale23, (java.lang.Integer) 31);
        org.joda.time.DurationField durationField27 = chronology10.halfdays();
        org.joda.time.DateTimeField dateTimeField28 = chronology10.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        long long32 = dateTimeZone30.nextTransition((long) (-434));
        java.lang.String str33 = dateTimeZone30.getID();
        java.lang.String str35 = dateTimeZone30.getNameKey(64713600000L);
        boolean boolean37 = dateTimeZone30.isStandardOffset((long) 86399);
        long long39 = dateTimeZone30.convertUTCToLocal(86400001L);
        org.joda.time.Chronology chronology40 = chronology10.withZone(dateTimeZone30);
        org.joda.time.DurationField durationField41 = chronology10.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField41, durationField11, and durationField27", !(durationField41.compareTo(durationField11) == 0) || (Math.signum(durationField41.compareTo(durationField27)) == Math.signum(durationField11.compareTo(durationField27))));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 100);
        java.lang.Integer int6 = dateTimeParserBucket5.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean8 = dateTimeParserBucket5.restoreState((java.lang.Object) dateTimeFieldType7);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket5.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        org.joda.time.DurationField durationField11 = chronology9.millis();
        org.joda.time.Chronology chronology13 = null;
        java.util.Locale locale14 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology13, locale14, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket(64713600009L, chronology9, locale14);
        org.joda.time.DateTimeField dateTimeField18 = chronology9.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField19 = chronology9.millisOfSecond();
        org.joda.time.DurationField durationField20 = chronology9.minutes();
        org.joda.time.DateTimeZone dateTimeZone21 = chronology9.getZone();
        org.joda.time.DurationField durationField22 = chronology9.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField22, durationField10, and durationField11", !(durationField22.compareTo(durationField10) == 0) || (Math.signum(durationField22.compareTo(durationField11)) == Math.signum(durationField10.compareTo(durationField11))));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 100);
        java.lang.Integer int5 = dateTimeParserBucket4.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean7 = dateTimeParserBucket4.restoreState((java.lang.Object) dateTimeFieldType6);
        org.joda.time.Chronology chronology8 = dateTimeParserBucket4.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeZone dateTimeZone10 = chronology8.getZone();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.minuteOfDay();
        org.joda.time.DurationField durationField12 = chronology8.hours();
        org.joda.time.DateTimeField dateTimeField13 = chronology8.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField14 = chronology8.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField15 = chronology8.weekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        long long19 = chronology8.add(readablePeriod16, (long) (-1562400000), 7);
        org.joda.time.DurationField durationField20 = chronology8.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField20, durationField9, and durationField12", !(durationField20.compareTo(durationField9) == 0) || (Math.signum(durationField20.compareTo(durationField12)) == Math.signum(durationField9.compareTo(durationField12))));
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        java.lang.Integer int7 = dateTimeParserBucket6.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean9 = dateTimeParserBucket6.restoreState((java.lang.Object) dateTimeFieldType8);
        org.joda.time.Chronology chronology10 = dateTimeParserBucket6.getChronology();
        org.joda.time.DurationField durationField11 = chronology10.days();
        org.joda.time.DurationField durationField12 = chronology10.millis();
        org.joda.time.Chronology chronology14 = null;
        java.util.Locale locale15 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology14, locale15, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket18 = new org.joda.time.format.DateTimeParserBucket(64713600009L, chronology10, locale15);
        org.joda.time.DurationField durationField19 = chronology10.weekyears();
        java.util.Locale locale20 = java.util.Locale.ITALIAN;
        java.util.Locale locale21 = locale20.stripExtensions();
        java.util.Locale locale22 = java.util.Locale.GERMAN;
        java.lang.String str23 = locale21.getDisplayVariant(locale22);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket26 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology10, locale21, (java.lang.Integer) 100, 31);
        org.joda.time.DateTimeField dateTimeField27 = chronology10.millisOfDay();
        org.joda.time.DateTimeField dateTimeField28 = chronology10.secondOfMinute();
        org.joda.time.DurationField durationField29 = chronology10.seconds();
        org.joda.time.DurationField durationField30 = chronology10.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField30, durationField11, and durationField12", !(durationField30.compareTo(durationField11) == 0) || (Math.signum(durationField30.compareTo(durationField12)) == Math.signum(durationField11.compareTo(durationField12))));
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        java.lang.Integer int7 = dateTimeParserBucket6.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean9 = dateTimeParserBucket6.restoreState((java.lang.Object) dateTimeFieldType8);
        org.joda.time.Chronology chronology10 = dateTimeParserBucket6.getChronology();
        org.joda.time.DurationField durationField11 = chronology10.days();
        org.joda.time.DateTimeField dateTimeField12 = dateTimeFieldType1.getField(chronology10);
        org.joda.time.DateTimeField dateTimeField13 = chronology10.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField14 = chronology10.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField15 = chronology10.yearOfEra();
        org.joda.time.DateTimeField dateTimeField16 = chronology10.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField17 = chronology10.dayOfYear();
        org.joda.time.DateTimeField dateTimeField18 = chronology10.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str21 = dateTimeZone20.getID();
        long long23 = dateTimeZone19.getMillisKeepLocal(dateTimeZone20, 97L);
        boolean boolean24 = dateTimeZone20.isFixed();
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone26);
        boolean boolean28 = dateTimeZone20.equals((java.lang.Object) dateTimeZone26);
        org.joda.time.Chronology chronology29 = chronology10.withZone(dateTimeZone20);
        org.joda.time.DurationField durationField30 = chronology29.seconds();
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.ReadableInstant readableInstant33 = null;
        int int34 = dateTimeZone32.getOffset(readableInstant33);
        boolean boolean36 = dateTimeZone32.isStandardOffset((long) (byte) -1);
        org.joda.time.Chronology chronology39 = null;
        java.util.Locale locale40 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket42 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology39, locale40, (java.lang.Integer) 100);
        java.lang.Integer int43 = dateTimeParserBucket42.getPivotYear();
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        dateTimeParserBucket42.setZone(dateTimeZone44);
        dateTimeParserBucket42.setOffset((java.lang.Integer) 0);
        org.joda.time.Chronology chronology49 = null;
        java.util.Locale locale50 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket52 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology49, locale50, (java.lang.Integer) 100);
        java.lang.Integer int53 = dateTimeParserBucket52.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType54 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean55 = dateTimeParserBucket52.restoreState((java.lang.Object) dateTimeFieldType54);
        org.joda.time.Chronology chronology56 = null;
        org.joda.time.DateTimeField dateTimeField57 = dateTimeFieldType54.getField(chronology56);
        long long60 = dateTimeField57.getDifferenceAsLong((long) ' ', (long) 1);
        org.joda.time.ReadablePartial readablePartial61 = null;
        java.util.Locale locale63 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str64 = dateTimeField57.getAsShortText(readablePartial61, (int) ' ', locale63);
        dateTimeParserBucket42.saveField(dateTimeField57, (int) (byte) 10);
        int int67 = dateTimeField57.getMinimumValue();
        org.joda.time.Chronology chronology69 = null;
        java.util.Locale locale70 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket72 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology69, locale70, (java.lang.Integer) 100);
        java.lang.Integer int73 = dateTimeParserBucket72.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType74 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean75 = dateTimeParserBucket72.restoreState((java.lang.Object) dateTimeFieldType74);
        org.joda.time.Chronology chronology76 = null;
        org.joda.time.DateTimeField dateTimeField77 = dateTimeFieldType74.getField(chronology76);
        java.util.Locale locale79 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet80 = locale79.getUnicodeLocaleAttributes();
        org.joda.time.Chronology chronology82 = null;
        java.util.Locale locale83 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket85 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology82, locale83, (java.lang.Integer) 100);
        java.lang.String str86 = locale79.getDisplayScript(locale83);
        java.lang.String str87 = dateTimeField77.getAsShortText(10, locale79);
        java.util.Locale.setDefault(locale79);
        int int89 = dateTimeField57.getMaximumShortTextLength(locale79);
        java.util.Locale locale90 = locale79.stripExtensions();
        java.lang.String str91 = dateTimeZone32.getName(60220800000L, locale90);
        java.util.Set<java.lang.String> strSet92 = locale90.getUnicodeLocaleKeys();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket95 = new org.joda.time.format.DateTimeParserBucket((-259200010L), chronology29, locale90, (java.lang.Integer) 22, 99);
        org.joda.time.DateTimeField dateTimeField96 = chronology29.millisOfSecond();
        org.joda.time.DurationField durationField97 = chronology29.centuries();
        org.joda.time.DurationField durationField98 = chronology29.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField98, durationField11, and durationField30", !(durationField98.compareTo(durationField11) == 0) || (Math.signum(durationField98.compareTo(durationField30)) == Math.signum(durationField11.compareTo(durationField30))));
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 100);
        java.lang.Integer int5 = dateTimeParserBucket4.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean7 = dateTimeParserBucket4.restoreState((java.lang.Object) dateTimeFieldType6);
        org.joda.time.Chronology chronology8 = dateTimeParserBucket4.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeZone dateTimeZone10 = chronology8.getZone();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.yearOfCentury();
        org.joda.time.DurationField durationField12 = chronology8.years();
        org.joda.time.DateTimeField dateTimeField13 = chronology8.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField14 = chronology8.weekOfWeekyear();
        org.joda.time.DurationField durationField15 = chronology8.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField15, durationField9, and durationField12", !(durationField15.compareTo(durationField9) == 0) || (Math.signum(durationField15.compareTo(durationField12)) == Math.signum(durationField9.compareTo(durationField12))));
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 100);
        java.lang.Integer int6 = dateTimeParserBucket5.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean8 = dateTimeParserBucket5.restoreState((java.lang.Object) dateTimeFieldType7);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket5.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        org.joda.time.DateTimeField dateTimeField11 = dateTimeFieldType0.getField(chronology9);
        org.joda.time.DateTimeField dateTimeField12 = chronology9.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField13 = chronology9.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField14 = chronology9.yearOfCentury();
        org.joda.time.DurationField durationField15 = chronology9.centuries();
        org.joda.time.DateTimeField dateTimeField16 = chronology9.weekyear();
        org.joda.time.Chronology chronology17 = chronology9.withUTC();
        org.joda.time.DateTimeField dateTimeField18 = chronology9.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField19 = chronology9.hourOfHalfday();
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        long long23 = chronology9.add(readablePeriod20, 3155587200000L, (-33000000));
        org.joda.time.DurationField durationField24 = chronology9.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField24, durationField10, and durationField15", !(durationField24.compareTo(durationField10) == 0) || (Math.signum(durationField24.compareTo(durationField15)) == Math.signum(durationField10.compareTo(durationField15))));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        java.lang.Integer int7 = dateTimeParserBucket6.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean9 = dateTimeParserBucket6.restoreState((java.lang.Object) dateTimeFieldType8);
        org.joda.time.Chronology chronology10 = dateTimeParserBucket6.getChronology();
        org.joda.time.DurationField durationField11 = chronology10.days();
        org.joda.time.DateTimeField dateTimeField12 = dateTimeFieldType1.getField(chronology10);
        org.joda.time.DateTimeField dateTimeField13 = chronology10.dayOfMonth();
        org.joda.time.DurationField durationField14 = chronology10.seconds();
        org.joda.time.DateTimeField dateTimeField15 = chronology10.millisOfDay();
        org.joda.time.DurationField durationField16 = chronology10.days();
        org.joda.time.Chronology chronology18 = null;
        java.util.Locale locale19 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket21 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology18, locale19, (java.lang.Integer) 100);
        java.lang.Integer int22 = dateTimeParserBucket21.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean24 = dateTimeParserBucket21.restoreState((java.lang.Object) dateTimeFieldType23);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateTimeField dateTimeField26 = dateTimeFieldType23.getField(chronology25);
        long long28 = dateTimeField26.roundHalfEven(1L);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.Chronology chronology33 = null;
        java.util.Locale locale34 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket36 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology33, locale34, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket37 = new org.joda.time.format.DateTimeParserBucket(100L, chronology31, locale34);
        java.lang.String str38 = dateTimeField26.getAsText((long) (short) 0, locale34);
        java.util.Locale.setDefault(locale34);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket40 = new org.joda.time.format.DateTimeParserBucket(3599999L, chronology10, locale34);
        org.joda.time.DateTimeField dateTimeField41 = chronology10.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField42 = chronology10.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField43 = chronology10.weekyear();
        org.joda.time.DateTimeField dateTimeField44 = chronology10.minuteOfDay();
        org.joda.time.DurationField durationField45 = chronology10.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField45, durationField11, and durationField14", !(durationField45.compareTo(durationField11) == 0) || (Math.signum(durationField45.compareTo(durationField14)) == Math.signum(durationField11.compareTo(durationField14))));
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 100);
        java.lang.Integer int5 = dateTimeParserBucket4.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean7 = dateTimeParserBucket4.restoreState((java.lang.Object) dateTimeFieldType6);
        org.joda.time.Chronology chronology8 = dateTimeParserBucket4.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.years();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.secondOfDay();
        org.joda.time.DurationField durationField11 = chronology8.days();
        org.joda.time.DurationField durationField12 = chronology8.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField12, durationField9, and durationField11", !(durationField12.compareTo(durationField9) == 0) || (Math.signum(durationField12.compareTo(durationField11)) == Math.signum(durationField9.compareTo(durationField11))));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 100);
        java.lang.Integer int6 = dateTimeParserBucket5.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean8 = dateTimeParserBucket5.restoreState((java.lang.Object) dateTimeFieldType7);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket5.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        long long14 = chronology9.add(readablePeriod11, 0L, 0);
        org.joda.time.DurationField durationField15 = chronology9.eras();
        java.util.Locale locale16 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket18 = new org.joda.time.format.DateTimeParserBucket(54L, chronology9, locale16, (java.lang.Integer) 7343661);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField10 and durationField15", Math.signum(durationField10.compareTo(durationField15)) == -Math.signum(durationField15.compareTo(durationField10)));
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 100);
        java.lang.Integer int6 = dateTimeParserBucket5.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean8 = dateTimeParserBucket5.restoreState((java.lang.Object) dateTimeFieldType7);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket5.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        org.joda.time.DateTimeField dateTimeField11 = dateTimeFieldType0.getField(chronology9);
        org.joda.time.DateTimeField dateTimeField12 = chronology9.dayOfMonth();
        org.joda.time.DurationField durationField13 = chronology9.seconds();
        org.joda.time.DateTimeField dateTimeField14 = chronology9.millisOfDay();
        org.joda.time.DurationField durationField15 = chronology9.halfdays();
        org.joda.time.DurationField durationField16 = chronology9.days();
        org.joda.time.DateTimeField dateTimeField17 = chronology9.dayOfWeek();
        org.joda.time.DurationField durationField18 = chronology9.weekyears();
        org.joda.time.DateTimeField dateTimeField19 = chronology9.millisOfDay();
        org.joda.time.DateTimeField dateTimeField20 = chronology9.dayOfWeek();
        org.joda.time.DurationField durationField21 = chronology9.millis();
        org.joda.time.Chronology chronology23 = null;
        java.util.Locale locale24 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket26 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology23, locale24, (java.lang.Integer) 100);
        java.lang.Integer int27 = dateTimeParserBucket26.getPivotYear();
        org.joda.time.DateTimeField dateTimeField28 = null;
        dateTimeParserBucket26.saveField(dateTimeField28, (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone31 = dateTimeParserBucket26.getZone();
        org.joda.time.Chronology chronology33 = null;
        java.util.Locale locale34 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket36 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology33, locale34, (java.lang.Integer) 100);
        java.lang.Integer int37 = dateTimeParserBucket36.getPivotYear();
        org.joda.time.DateTimeField dateTimeField38 = null;
        dateTimeParserBucket36.saveField(dateTimeField38, (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone41 = dateTimeParserBucket36.getZone();
        org.joda.time.Chronology chronology43 = null;
        java.util.Locale locale44 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket46 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology43, locale44, (java.lang.Integer) 100);
        java.lang.Integer int47 = dateTimeParserBucket46.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType48 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean49 = dateTimeParserBucket46.restoreState((java.lang.Object) dateTimeFieldType48);
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.DateTimeField dateTimeField51 = dateTimeFieldType48.getField(chronology50);
        java.util.Locale locale53 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet54 = locale53.getUnicodeLocaleAttributes();
        org.joda.time.Chronology chronology56 = null;
        java.util.Locale locale57 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket59 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology56, locale57, (java.lang.Integer) 100);
        java.lang.String str60 = locale53.getDisplayScript(locale57);
        java.lang.String str61 = dateTimeField51.getAsShortText(10, locale53);
        dateTimeParserBucket36.saveField(dateTimeField51, (int) (byte) 1);
        boolean boolean64 = dateTimeParserBucket26.restoreState((java.lang.Object) dateTimeParserBucket36);
        org.joda.time.DateTimeZone dateTimeZone65 = dateTimeParserBucket36.getZone();
        boolean boolean67 = dateTimeZone65.isStandardOffset(10L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone65);
        boolean boolean69 = dateTimeZone65.isFixed();
        org.joda.time.ReadableInstant readableInstant70 = null;
        int int71 = dateTimeZone65.getOffset(readableInstant70);
        org.joda.time.Chronology chronology72 = chronology9.withZone(dateTimeZone65);
        org.joda.time.DurationField durationField73 = chronology72.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField73, durationField10, and durationField13", !(durationField73.compareTo(durationField10) == 0) || (Math.signum(durationField73.compareTo(durationField13)) == Math.signum(durationField10.compareTo(durationField13))));
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 100);
        java.lang.Integer int5 = dateTimeParserBucket4.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean7 = dateTimeParserBucket4.restoreState((java.lang.Object) dateTimeFieldType6);
        org.joda.time.Chronology chronology8 = dateTimeParserBucket4.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.era();
        java.lang.String str11 = chronology8.toString();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField13 = chronology8.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField14 = chronology8.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField15 = chronology8.era();
        org.joda.time.DurationField durationField16 = chronology8.eras();
        org.joda.time.DateTimeField dateTimeField17 = chronology8.secondOfMinute();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField9 and durationField16", Math.signum(durationField9.compareTo(durationField16)) == -Math.signum(durationField16.compareTo(durationField9)));
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 100);
        java.lang.Integer int6 = dateTimeParserBucket5.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean8 = dateTimeParserBucket5.restoreState((java.lang.Object) dateTimeFieldType7);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket5.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        org.joda.time.DateTimeZone dateTimeZone11 = chronology9.getZone();
        org.joda.time.DateTimeField dateTimeField12 = chronology9.yearOfCentury();
        org.joda.time.DurationField durationField13 = chronology9.years();
        org.joda.time.DateTimeField dateTimeField14 = chronology9.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField15 = chronology9.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField16 = chronology9.dayOfWeek();
        org.joda.time.Chronology chronology17 = chronology9.withUTC();
        org.joda.time.DurationField durationField18 = chronology17.minutes();
        org.joda.time.DateTimeField dateTimeField19 = chronology17.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField20 = chronology17.weekyearOfCentury();
        org.joda.time.DurationField durationField21 = chronology17.weeks();
        java.util.Locale.Builder builder22 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder23 = builder22.clearExtensions();
        java.util.Locale.Builder builder26 = builder23.setExtension('a', "");
        java.util.Locale.Builder builder28 = builder23.setLanguageTag("eng");
        java.util.Locale.Builder builder29 = builder23.clearExtensions();
        java.util.Locale locale30 = builder29.build();
        java.util.Locale.Builder builder31 = builder29.clear();
        java.util.Locale.Builder builder33 = builder31.addUnicodeLocaleAttribute("era");
        java.util.Locale locale34 = builder33.build();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket37 = new org.joda.time.format.DateTimeParserBucket(946684800000L, chronology17, locale34, (java.lang.Integer) 3, 168);
        org.joda.time.DateTimeFieldType dateTimeFieldType38 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.DurationFieldType durationFieldType39 = dateTimeFieldType38.getDurationType();
        java.lang.String str40 = dateTimeFieldType38.toString();
        java.lang.String str41 = dateTimeFieldType38.toString();
        org.joda.time.DateTimeFieldType dateTimeFieldType42 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.Chronology chronology44 = null;
        java.util.Locale locale45 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket47 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology44, locale45, (java.lang.Integer) 100);
        java.lang.Integer int48 = dateTimeParserBucket47.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType49 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean50 = dateTimeParserBucket47.restoreState((java.lang.Object) dateTimeFieldType49);
        org.joda.time.Chronology chronology51 = dateTimeParserBucket47.getChronology();
        org.joda.time.DurationField durationField52 = chronology51.days();
        org.joda.time.DateTimeField dateTimeField53 = dateTimeFieldType42.getField(chronology51);
        org.joda.time.DateTimeField dateTimeField54 = chronology51.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField55 = chronology51.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField56 = chronology51.yearOfEra();
        org.joda.time.DateTimeField dateTimeField57 = chronology51.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField58 = chronology51.dayOfYear();
        org.joda.time.DateTimeField dateTimeField59 = chronology51.hourOfDay();
        org.joda.time.DurationField durationField60 = chronology51.centuries();
        org.joda.time.DurationField durationField61 = chronology51.weekyears();
        org.joda.time.DateTimeField dateTimeField62 = chronology51.weekyear();
        org.joda.time.DurationField durationField63 = chronology51.centuries();
        org.joda.time.DateTimeField dateTimeField64 = dateTimeFieldType38.getField(chronology51);
        boolean boolean66 = dateTimeField64.isLeap((-262800000L));
        dateTimeParserBucket37.saveField(dateTimeField64, 332);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField13 and durationField61", (durationField13.compareTo(durationField61) == 0) == durationField13.equals(durationField61));
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        java.lang.Integer int7 = dateTimeParserBucket6.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean9 = dateTimeParserBucket6.restoreState((java.lang.Object) dateTimeFieldType8);
        org.joda.time.Chronology chronology10 = dateTimeParserBucket6.getChronology();
        org.joda.time.DurationField durationField11 = chronology10.years();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.Chronology chronology15 = null;
        java.util.Locale locale16 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket18 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology15, locale16, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket19 = new org.joda.time.format.DateTimeParserBucket(100L, chronology13, locale16);
        java.lang.String str20 = locale16.getScript();
        java.lang.String str22 = locale16.getExtension('u');
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket25 = new org.joda.time.format.DateTimeParserBucket(259200117L, chronology10, locale16, (java.lang.Integer) 100, (int) (byte) 1);
        org.joda.time.DurationField durationField26 = chronology10.centuries();
        java.util.Locale.Category category27 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale28 = java.util.Locale.GERMANY;
        java.lang.String str29 = locale28.getDisplayCountry();
        java.util.Locale.setDefault(category27, locale28);
        java.util.Locale locale31 = java.util.Locale.getDefault(category27);
        java.util.Locale locale32 = java.util.Locale.getDefault(category27);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket35 = new org.joda.time.format.DateTimeParserBucket(10L, chronology10, locale32, (java.lang.Integer) 100, 31);
        org.joda.time.DateTimeField dateTimeField36 = chronology10.hourOfHalfday();
        java.lang.String str37 = chronology10.toString();
        org.joda.time.DurationField durationField38 = chronology10.hours();
        org.joda.time.DurationField durationField39 = chronology10.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField39, durationField11, and durationField26", !(durationField39.compareTo(durationField11) == 0) || (Math.signum(durationField39.compareTo(durationField26)) == Math.signum(durationField11.compareTo(durationField26))));
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 100);
        java.lang.Integer int6 = dateTimeParserBucket5.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean8 = dateTimeParserBucket5.restoreState((java.lang.Object) dateTimeFieldType7);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket5.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        org.joda.time.DateTimeField dateTimeField11 = dateTimeFieldType0.getField(chronology9);
        org.joda.time.DateTimeField dateTimeField12 = chronology9.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        long long16 = dateTimeZone14.convertUTCToLocal((long) (short) -1);
        org.joda.time.Chronology chronology18 = null;
        java.util.Locale locale19 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket21 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology18, locale19, (java.lang.Integer) 100);
        java.lang.Integer int22 = dateTimeParserBucket21.getPivotYear();
        org.joda.time.DateTimeField dateTimeField23 = null;
        dateTimeParserBucket21.saveField(dateTimeField23, (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone26 = dateTimeParserBucket21.getZone();
        long long28 = dateTimeZone14.getMillisKeepLocal(dateTimeZone26, 97L);
        int int30 = dateTimeZone14.getStandardOffset(1L);
        org.joda.time.Chronology chronology31 = chronology9.withZone(dateTimeZone14);
        org.joda.time.DurationField durationField32 = chronology31.millis();
        long long36 = chronology31.add(28166400000L, 259200067L, (-2678388));
        org.joda.time.DurationField durationField37 = chronology31.days();
        org.joda.time.DateTimeField dateTimeField38 = chronology31.year();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField10 and durationField37", (durationField10.compareTo(durationField37) == 0) == durationField10.equals(durationField37));
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 100);
        java.lang.Integer int6 = dateTimeParserBucket5.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean8 = dateTimeParserBucket5.restoreState((java.lang.Object) dateTimeFieldType7);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket5.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        org.joda.time.DurationField durationField11 = chronology9.millis();
        org.joda.time.Chronology chronology13 = null;
        java.util.Locale locale14 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology13, locale14, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket(64713600009L, chronology9, locale14);
        org.joda.time.DateTimeField dateTimeField18 = chronology9.year();
        org.joda.time.DurationField durationField19 = chronology9.halfdays();
        org.joda.time.DurationField durationField20 = chronology9.days();
        org.joda.time.DurationField durationField21 = chronology9.years();
        org.joda.time.DurationField durationField22 = chronology9.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField22, durationField10, and durationField11", !(durationField22.compareTo(durationField10) == 0) || (Math.signum(durationField22.compareTo(durationField11)) == Math.signum(durationField10.compareTo(durationField11))));
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 100);
        java.lang.Integer int5 = dateTimeParserBucket4.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean7 = dateTimeParserBucket4.restoreState((java.lang.Object) dateTimeFieldType6);
        org.joda.time.Chronology chronology8 = dateTimeParserBucket4.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeZone dateTimeZone10 = chronology8.getZone();
        org.joda.time.DurationField durationField11 = chronology8.months();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.dayOfMonth();
        org.joda.time.DurationField durationField13 = chronology8.weekyears();
        org.joda.time.DateTimeField dateTimeField14 = chronology8.secondOfMinute();
        org.joda.time.DurationField durationField15 = chronology8.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField15, durationField9, and durationField11", !(durationField15.compareTo(durationField9) == 0) || (Math.signum(durationField15.compareTo(durationField11)) == Math.signum(durationField9.compareTo(durationField11))));
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        java.lang.Integer int7 = dateTimeParserBucket6.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean9 = dateTimeParserBucket6.restoreState((java.lang.Object) dateTimeFieldType8);
        org.joda.time.Chronology chronology10 = dateTimeParserBucket6.getChronology();
        org.joda.time.DurationField durationField11 = chronology10.days();
        org.joda.time.DateTimeZone dateTimeZone12 = chronology10.getZone();
        org.joda.time.DateTimeField dateTimeField13 = chronology10.yearOfCentury();
        java.lang.String str14 = chronology10.toString();
        org.joda.time.Chronology chronology16 = null;
        java.util.Locale locale17 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket19 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology16, locale17, (java.lang.Integer) 100);
        java.lang.Integer int20 = dateTimeParserBucket19.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean22 = dateTimeParserBucket19.restoreState((java.lang.Object) dateTimeFieldType21);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.DateTimeField dateTimeField24 = dateTimeFieldType21.getField(chronology23);
        long long27 = dateTimeField24.getDifferenceAsLong((long) ' ', (long) 1);
        org.joda.time.ReadablePartial readablePartial28 = null;
        java.util.Locale locale30 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str31 = dateTimeField24.getAsShortText(readablePartial28, (int) ' ', locale30);
        org.joda.time.Chronology chronology33 = null;
        java.util.Locale locale34 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket36 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology33, locale34, (java.lang.Integer) 100);
        java.lang.Integer int37 = dateTimeParserBucket36.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType38 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean39 = dateTimeParserBucket36.restoreState((java.lang.Object) dateTimeFieldType38);
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.DateTimeField dateTimeField41 = dateTimeFieldType38.getField(chronology40);
        long long43 = dateTimeField41.roundHalfEven(1L);
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.Chronology chronology48 = null;
        java.util.Locale locale49 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket51 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology48, locale49, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket52 = new org.joda.time.format.DateTimeParserBucket(100L, chronology46, locale49);
        java.lang.String str53 = dateTimeField41.getAsText((long) (short) 0, locale49);
        java.util.Locale.setDefault(locale49);
        java.lang.String str55 = locale30.getDisplayScript(locale49);
        java.lang.String str56 = locale30.getCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket58 = new org.joda.time.format.DateTimeParserBucket(31L, chronology10, locale30, (java.lang.Integer) 100);
        org.joda.time.DateTimeField dateTimeField59 = chronology10.year();
        java.util.Locale locale62 = new java.util.Locale("1439", "19");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket65 = new org.joda.time.format.DateTimeParserBucket(153L, chronology10, locale62, (java.lang.Integer) 31, (int) 'a');
        org.joda.time.DurationField durationField66 = chronology10.months();
        org.joda.time.DurationField durationField67 = chronology10.years();
        org.joda.time.DateTimeZone dateTimeZone68 = chronology10.getZone();
        org.joda.time.Chronology chronology69 = chronology10.withUTC();
        org.joda.time.ReadablePeriod readablePeriod70 = null;
        long long73 = chronology10.add(readablePeriod70, 0L, 8);
        org.joda.time.DurationField durationField74 = chronology10.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField74, durationField11, and durationField66", !(durationField74.compareTo(durationField11) == 0) || (Math.signum(durationField74.compareTo(durationField66)) == Math.signum(durationField11.compareTo(durationField66))));
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 100);
        java.lang.Integer int5 = dateTimeParserBucket4.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean7 = dateTimeParserBucket4.restoreState((java.lang.Object) dateTimeFieldType6);
        org.joda.time.Chronology chronology8 = dateTimeParserBucket4.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeZone dateTimeZone10 = chronology8.getZone();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.yearOfCentury();
        org.joda.time.DurationField durationField12 = chronology8.years();
        org.joda.time.DateTimeField dateTimeField13 = chronology8.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField14 = chronology8.year();
        org.joda.time.DateTimeField dateTimeField15 = chronology8.dayOfMonth();
        long long19 = chronology8.add((-7200000L), 4492738L, 4969628);
        org.joda.time.DurationField durationField20 = chronology8.weekyears();
        org.joda.time.DurationField durationField21 = chronology8.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField12 and durationField21", (durationField12.compareTo(durationField21) == 0) == durationField12.equals(durationField21));
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 100);
        java.lang.Integer int5 = dateTimeParserBucket4.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean7 = dateTimeParserBucket4.restoreState((java.lang.Object) dateTimeFieldType6);
        org.joda.time.Chronology chronology8 = dateTimeParserBucket4.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeZone dateTimeZone10 = chronology8.getZone();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.yearOfCentury();
        org.joda.time.DurationField durationField12 = chronology8.years();
        org.joda.time.DateTimeField dateTimeField13 = chronology8.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField14 = chronology8.weekOfWeekyear();
        org.joda.time.DurationField durationField15 = chronology8.seconds();
        org.joda.time.DurationField durationField16 = chronology8.weekyears();
        org.joda.time.DurationField durationField17 = chronology8.years();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField17 and durationField16", (durationField17.compareTo(durationField16) == 0) == durationField17.equals(durationField16));
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        java.lang.Integer int7 = dateTimeParserBucket6.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean9 = dateTimeParserBucket6.restoreState((java.lang.Object) dateTimeFieldType8);
        org.joda.time.Chronology chronology10 = dateTimeParserBucket6.getChronology();
        org.joda.time.DurationField durationField11 = chronology10.days();
        org.joda.time.DateTimeZone dateTimeZone12 = chronology10.getZone();
        org.joda.time.Chronology chronology14 = null;
        java.util.Locale locale15 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology14, locale15, (java.lang.Integer) 100);
        java.lang.String str18 = locale15.getCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket21 = new org.joda.time.format.DateTimeParserBucket(0L, chronology10, locale15, (java.lang.Integer) 100, (int) (byte) 1);
        org.joda.time.DateTimeField dateTimeField22 = chronology10.centuryOfEra();
        java.util.Locale locale23 = java.util.Locale.ITALY;
        java.lang.String str24 = locale23.getScript();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket26 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology10, locale23, (java.lang.Integer) 31);
        org.joda.time.DurationField durationField27 = chronology10.eras();
        org.joda.time.DateTimeZone dateTimeZone28 = chronology10.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField11 and durationField27", Math.signum(durationField11.compareTo(durationField27)) == -Math.signum(durationField27.compareTo(durationField11)));
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 100);
        java.lang.Integer int6 = dateTimeParserBucket5.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean8 = dateTimeParserBucket5.restoreState((java.lang.Object) dateTimeFieldType7);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket5.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        org.joda.time.DurationField durationField11 = chronology9.millis();
        org.joda.time.Chronology chronology13 = null;
        java.util.Locale locale14 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology13, locale14, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket(64713600009L, chronology9, locale14);
        org.joda.time.DateTimeField dateTimeField18 = chronology9.clockhourOfHalfday();
        org.joda.time.DurationField durationField19 = chronology9.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField19, durationField10, and durationField11", !(durationField19.compareTo(durationField10) == 0) || (Math.signum(durationField19.compareTo(durationField11)) == Math.signum(durationField10.compareTo(durationField11))));
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 100);
        java.lang.Integer int5 = dateTimeParserBucket4.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean7 = dateTimeParserBucket4.restoreState((java.lang.Object) dateTimeFieldType6);
        int int8 = dateTimeParserBucket4.getOffset();
        org.joda.time.DateTimeZone dateTimeZone9 = dateTimeParserBucket4.getZone();
        org.joda.time.Chronology chronology13 = null;
        java.util.Locale locale14 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology13, locale14, (java.lang.Integer) 100);
        java.lang.Integer int17 = dateTimeParserBucket16.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean19 = dateTimeParserBucket16.restoreState((java.lang.Object) dateTimeFieldType18);
        org.joda.time.Chronology chronology20 = dateTimeParserBucket16.getChronology();
        org.joda.time.DurationField durationField21 = chronology20.days();
        org.joda.time.DurationField durationField22 = chronology20.millis();
        org.joda.time.Chronology chronology24 = null;
        java.util.Locale locale25 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket27 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology24, locale25, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket28 = new org.joda.time.format.DateTimeParserBucket(64713600009L, chronology20, locale25);
        org.joda.time.DateTimeField dateTimeField29 = chronology20.minuteOfDay();
        org.joda.time.DurationField durationField30 = chronology20.days();
        org.joda.time.DateTimeField dateTimeField31 = chronology20.minuteOfDay();
        org.joda.time.DurationField durationField32 = chronology20.months();
        org.joda.time.DurationField durationField33 = chronology20.hours();
        org.joda.time.DurationField durationField34 = chronology20.seconds();
        java.util.Locale.Builder builder35 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder36 = builder35.clear();
        java.util.Locale locale37 = builder35.build();
        java.lang.String str38 = locale37.getScript();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket41 = new org.joda.time.format.DateTimeParserBucket(66528000000L, chronology20, locale37, (java.lang.Integer) 10, (-292275054));
        org.joda.time.DateTimeField dateTimeField42 = chronology20.hourOfDay();
        org.joda.time.DateTimeField dateTimeField43 = chronology20.millisOfSecond();
        boolean boolean44 = dateTimeParserBucket4.restoreState((java.lang.Object) chronology20);
        org.joda.time.DurationField durationField45 = chronology20.years();
        org.joda.time.DateTimeField dateTimeField46 = chronology20.clockhourOfHalfday();
        org.joda.time.DurationField durationField47 = chronology20.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField47, durationField21, and durationField22", !(durationField47.compareTo(durationField21) == 0) || (Math.signum(durationField47.compareTo(durationField22)) == Math.signum(durationField21.compareTo(durationField22))));
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 100);
        java.lang.Integer int6 = dateTimeParserBucket5.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean8 = dateTimeParserBucket5.restoreState((java.lang.Object) dateTimeFieldType7);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket5.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        org.joda.time.DateTimeZone dateTimeZone11 = chronology9.getZone();
        org.joda.time.DateTimeField dateTimeField12 = chronology9.yearOfCentury();
        java.lang.String str13 = chronology9.toString();
        org.joda.time.Chronology chronology14 = chronology9.withUTC();
        org.joda.time.DateTimeField dateTimeField15 = chronology9.secondOfDay();
        boolean boolean16 = dateTimeFieldType0.isSupported(chronology9);
        java.lang.String str17 = chronology9.toString();
        org.joda.time.DurationField durationField18 = chronology9.eras();
        org.joda.time.DateTimeField dateTimeField19 = chronology9.halfdayOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField10 and durationField18", Math.signum(durationField10.compareTo(durationField18)) == -Math.signum(durationField18.compareTo(durationField10)));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 100);
        java.lang.Integer int6 = dateTimeParserBucket5.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean8 = dateTimeParserBucket5.restoreState((java.lang.Object) dateTimeFieldType7);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket5.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.ReadableInstant readableInstant13 = null;
        int int14 = dateTimeZone12.getOffset(readableInstant13);
        org.joda.time.ReadableInstant readableInstant15 = null;
        int int16 = dateTimeZone12.getOffset(readableInstant15);
        org.joda.time.Chronology chronology19 = null;
        java.util.Locale locale20 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket22 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology19, locale20, (java.lang.Integer) 100);
        java.lang.String str23 = dateTimeZone12.getShortName(10L, locale20);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.Chronology chronology28 = null;
        java.util.Locale locale29 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket31 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology28, locale29, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket32 = new org.joda.time.format.DateTimeParserBucket(100L, chronology26, locale29);
        java.lang.String str33 = locale29.getScript();
        java.lang.String str34 = locale29.getISO3Country();
        java.lang.String str35 = locale29.getDisplayScript();
        java.lang.String str36 = dateTimeZone12.getName((long) 53, locale29);
        org.joda.time.Chronology chronology37 = chronology9.withZone(dateTimeZone12);
        org.joda.time.Chronology chronology38 = chronology37.withUTC();
        org.joda.time.DateTimeField dateTimeField39 = dateTimeFieldType0.getField(chronology37);
        org.joda.time.DateTimeField dateTimeField40 = chronology37.dayOfMonth();
        org.joda.time.DurationField durationField41 = chronology37.eras();
        org.joda.time.DurationField durationField42 = chronology37.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField10 and durationField42", Math.signum(durationField10.compareTo(durationField42)) == -Math.signum(durationField42.compareTo(durationField10)));
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        java.lang.Integer int7 = dateTimeParserBucket6.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean9 = dateTimeParserBucket6.restoreState((java.lang.Object) dateTimeFieldType8);
        org.joda.time.Chronology chronology10 = dateTimeParserBucket6.getChronology();
        org.joda.time.Chronology chronology11 = chronology10.withUTC();
        org.joda.time.DateTimeField dateTimeField12 = chronology11.secondOfMinute();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.Chronology chronology16 = null;
        java.util.Locale locale17 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket19 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology16, locale17, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket20 = new org.joda.time.format.DateTimeParserBucket(100L, chronology14, locale17);
        org.joda.time.DateTimeZone dateTimeZone21 = dateTimeParserBucket20.getZone();
        long long24 = dateTimeParserBucket20.computeMillis(true, "\u4e2d\u6587\u4e2d\u56fd)");
        int int25 = dateTimeParserBucket20.getOffset();
        java.util.Locale locale26 = dateTimeParserBucket20.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket29 = new org.joda.time.format.DateTimeParserBucket(98L, chronology11, locale26, (java.lang.Integer) 5207, (int) 'u');
        org.joda.time.DurationField durationField30 = chronology11.halfdays();
        java.util.Locale locale31 = java.util.Locale.ITALY;
        java.lang.String str32 = locale31.getDisplayName();
        java.lang.String str33 = locale31.getISO3Language();
        java.lang.String str34 = locale31.getVariant();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket35 = new org.joda.time.format.DateTimeParserBucket(19353600000L, chronology11, locale31);
        java.lang.String str36 = chronology11.toString();
        org.joda.time.DurationField durationField37 = chronology11.eras();
        org.joda.time.Chronology chronology38 = chronology11.withUTC();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField30 and durationField37", Math.signum(durationField30.compareTo(durationField37)) == -Math.signum(durationField37.compareTo(durationField30)));
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 100);
        java.lang.Integer int6 = dateTimeParserBucket5.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean8 = dateTimeParserBucket5.restoreState((java.lang.Object) dateTimeFieldType7);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket5.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        org.joda.time.DurationField durationField11 = chronology9.millis();
        org.joda.time.Chronology chronology13 = null;
        java.util.Locale locale14 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology13, locale14, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket(64713600009L, chronology9, locale14);
        org.joda.time.DateTimeField dateTimeField18 = chronology9.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField19 = chronology9.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField20 = chronology9.weekyearOfCentury();
        org.joda.time.DurationField durationField21 = chronology9.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField21, durationField10, and durationField11", !(durationField21.compareTo(durationField10) == 0) || (Math.signum(durationField21.compareTo(durationField11)) == Math.signum(durationField10.compareTo(durationField11))));
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        java.lang.Integer int7 = dateTimeParserBucket6.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean9 = dateTimeParserBucket6.restoreState((java.lang.Object) dateTimeFieldType8);
        org.joda.time.Chronology chronology10 = dateTimeParserBucket6.getChronology();
        org.joda.time.DurationField durationField11 = chronology10.years();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.Chronology chronology15 = null;
        java.util.Locale locale16 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket18 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology15, locale16, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket19 = new org.joda.time.format.DateTimeParserBucket(100L, chronology13, locale16);
        java.lang.String str20 = locale16.getScript();
        java.lang.String str22 = locale16.getExtension('u');
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket25 = new org.joda.time.format.DateTimeParserBucket(259200117L, chronology10, locale16, (java.lang.Integer) 100, (int) (byte) 1);
        org.joda.time.DateTimeField dateTimeField26 = chronology10.hourOfHalfday();
        org.joda.time.DurationField durationField27 = chronology10.minutes();
        java.util.Locale.Builder builder28 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder29 = builder28.clear();
        java.util.Locale locale30 = builder29.build();
        java.util.Locale locale31 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str32 = locale30.getDisplayLanguage(locale31);
        java.util.Set<java.lang.String> strSet33 = locale31.getUnicodeLocaleKeys();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket36 = new org.joda.time.format.DateTimeParserBucket(2L, chronology10, locale31, (java.lang.Integer) 100, (int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone37 = dateTimeParserBucket36.getZone();
        org.joda.time.DateTimeFieldType dateTimeFieldType38 = org.joda.time.DateTimeFieldType.secondOfMinute();
        java.util.Locale locale42 = new java.util.Locale("hi!", "ISOChronology[UTC]");
        dateTimeParserBucket36.saveField(dateTimeFieldType38, "", locale42);
        org.joda.time.Chronology chronology46 = null;
        java.util.Locale locale47 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket49 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology46, locale47, (java.lang.Integer) 100);
        java.lang.Integer int50 = dateTimeParserBucket49.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType51 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean52 = dateTimeParserBucket49.restoreState((java.lang.Object) dateTimeFieldType51);
        org.joda.time.Chronology chronology53 = dateTimeParserBucket49.getChronology();
        org.joda.time.DurationField durationField54 = chronology53.days();
        org.joda.time.DateTimeZone dateTimeZone55 = chronology53.getZone();
        org.joda.time.DateTimeField dateTimeField56 = chronology53.minuteOfDay();
        java.util.Locale locale57 = java.util.Locale.FRENCH;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket58 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology53, locale57);
        org.joda.time.DateTimeField dateTimeField59 = chronology53.year();
        boolean boolean60 = dateTimeFieldType38.isSupported(chronology53);
        org.joda.time.DurationField durationField61 = chronology53.weekyears();
        org.joda.time.DateTimeField dateTimeField62 = chronology53.yearOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField11 and durationField61", (durationField11.compareTo(durationField61) == 0) == durationField11.equals(durationField61));
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 100);
        java.lang.Integer int6 = dateTimeParserBucket5.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean8 = dateTimeParserBucket5.restoreState((java.lang.Object) dateTimeFieldType7);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket5.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        org.joda.time.DateTimeField dateTimeField11 = dateTimeFieldType0.getField(chronology9);
        org.joda.time.DateTimeField dateTimeField12 = chronology9.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField13 = chronology9.weekOfWeekyear();
        java.lang.String str14 = chronology9.toString();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        long long18 = dateTimeZone16.convertUTCToLocal((long) (short) -1);
        org.joda.time.Chronology chronology20 = null;
        java.util.Locale locale21 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket23 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology20, locale21, (java.lang.Integer) 100);
        java.lang.Integer int24 = dateTimeParserBucket23.getPivotYear();
        org.joda.time.DateTimeField dateTimeField25 = null;
        dateTimeParserBucket23.saveField(dateTimeField25, (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone28 = dateTimeParserBucket23.getZone();
        long long30 = dateTimeZone16.getMillisKeepLocal(dateTimeZone28, 97L);
        java.lang.String str32 = dateTimeZone16.getShortName(0L);
        java.util.TimeZone timeZone34 = null;
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forTimeZone(timeZone34);
        java.util.Locale locale40 = new java.util.Locale("weekOfWeekyear", "UTC", "+00:00");
        boolean boolean41 = locale40.hasExtensions();
        org.joda.time.Chronology chronology43 = null;
        java.util.Locale locale44 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket46 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology43, locale44, (java.lang.Integer) 100);
        java.lang.String str47 = locale40.getDisplayCountry(locale44);
        java.lang.String str48 = dateTimeZone35.getShortName((long) (short) 1, locale44);
        java.lang.String str49 = dateTimeZone16.getName((long) 'u', locale44);
        org.joda.time.Chronology chronology50 = chronology9.withZone(dateTimeZone16);
        org.joda.time.DurationField durationField51 = chronology50.seconds();
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone53);
        long long57 = dateTimeZone53.adjustOffset(604801053L, true);
        org.joda.time.Chronology chronology58 = chronology50.withZone(dateTimeZone53);
        java.lang.String str59 = chronology58.toString();
        org.joda.time.DurationField durationField60 = chronology58.seconds();
        org.joda.time.DateTimeZone dateTimeZone62 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        java.util.TimeZone timeZone63 = dateTimeZone62.toTimeZone();
        boolean boolean65 = dateTimeZone62.isStandardOffset((long) (byte) 100);
        long long68 = dateTimeZone62.convertLocalToUTC(179566L, true);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone62);
        long long71 = dateTimeZone62.convertUTCToLocal((long) (-101));
        org.joda.time.Chronology chronology72 = chronology58.withZone(dateTimeZone62);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField51 and durationField60", (durationField51.compareTo(durationField60) == 0) == durationField51.equals(durationField60));
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        java.lang.Integer int7 = dateTimeParserBucket6.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean9 = dateTimeParserBucket6.restoreState((java.lang.Object) dateTimeFieldType8);
        org.joda.time.Chronology chronology10 = dateTimeParserBucket6.getChronology();
        org.joda.time.DurationField durationField11 = chronology10.years();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.Chronology chronology15 = null;
        java.util.Locale locale16 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket18 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology15, locale16, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket19 = new org.joda.time.format.DateTimeParserBucket(100L, chronology13, locale16);
        java.lang.String str20 = locale16.getScript();
        java.lang.String str22 = locale16.getExtension('u');
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket25 = new org.joda.time.format.DateTimeParserBucket(259200117L, chronology10, locale16, (java.lang.Integer) 100, (int) (byte) 1);
        org.joda.time.DurationField durationField26 = chronology10.centuries();
        java.util.Locale.Category category27 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale28 = java.util.Locale.GERMANY;
        java.lang.String str29 = locale28.getDisplayCountry();
        java.util.Locale.setDefault(category27, locale28);
        java.util.Locale locale31 = java.util.Locale.getDefault(category27);
        java.util.Locale locale32 = java.util.Locale.getDefault(category27);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket35 = new org.joda.time.format.DateTimeParserBucket(10L, chronology10, locale32, (java.lang.Integer) 100, 31);
        org.joda.time.DurationField durationField36 = chronology10.weekyears();
        org.joda.time.DateTimeField dateTimeField37 = chronology10.weekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField11 and durationField36", (durationField11.compareTo(durationField36) == 0) == durationField11.equals(durationField36));
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 100);
        java.lang.Integer int5 = dateTimeParserBucket4.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean7 = dateTimeParserBucket4.restoreState((java.lang.Object) dateTimeFieldType6);
        org.joda.time.Chronology chronology8 = dateTimeParserBucket4.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeZone dateTimeZone10 = chronology8.getZone();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.yearOfCentury();
        java.lang.String str12 = chronology8.toString();
        org.joda.time.DurationField durationField13 = chronology8.eras();
        org.joda.time.DateTimeField dateTimeField14 = chronology8.clockhourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField9 and durationField13", Math.signum(durationField9.compareTo(durationField13)) == -Math.signum(durationField13.compareTo(durationField9)));
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        java.lang.Integer int7 = dateTimeParserBucket6.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean9 = dateTimeParserBucket6.restoreState((java.lang.Object) dateTimeFieldType8);
        org.joda.time.Chronology chronology10 = dateTimeParserBucket6.getChronology();
        org.joda.time.DurationField durationField11 = chronology10.days();
        org.joda.time.DateTimeField dateTimeField12 = dateTimeFieldType1.getField(chronology10);
        org.joda.time.DateTimeField dateTimeField13 = chronology10.dayOfMonth();
        org.joda.time.DurationField durationField14 = chronology10.seconds();
        org.joda.time.DateTimeField dateTimeField15 = chronology10.millisOfDay();
        org.joda.time.DurationField durationField16 = chronology10.halfdays();
        java.util.Locale locale17 = java.util.Locale.ITALIAN;
        java.util.Locale locale18 = locale17.stripExtensions();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket20 = new org.joda.time.format.DateTimeParserBucket(345600000L, chronology10, locale17, (java.lang.Integer) 3);
        org.joda.time.Chronology chronology21 = dateTimeParserBucket20.getChronology();
        org.joda.time.Chronology chronology22 = chronology21.withUTC();
        org.joda.time.DurationField durationField23 = chronology22.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField23, durationField11, and durationField14", !(durationField23.compareTo(durationField11) == 0) || (Math.signum(durationField23.compareTo(durationField14)) == Math.signum(durationField11.compareTo(durationField14))));
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 100);
        java.lang.Integer int6 = dateTimeParserBucket5.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean8 = dateTimeParserBucket5.restoreState((java.lang.Object) dateTimeFieldType7);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket5.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        org.joda.time.DateTimeField dateTimeField11 = dateTimeFieldType0.getField(chronology9);
        org.joda.time.DateTimeField dateTimeField12 = chronology9.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField13 = chronology9.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField14 = chronology9.yearOfEra();
        org.joda.time.DateTimeField dateTimeField15 = chronology9.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField16 = chronology9.dayOfWeek();
        org.joda.time.DurationField durationField17 = chronology9.weeks();
        org.joda.time.DurationField durationField18 = chronology9.weekyears();
        org.joda.time.DateTimeField dateTimeField19 = chronology9.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField20 = chronology9.centuryOfEra();
        org.joda.time.DurationField durationField21 = chronology9.years();
        org.joda.time.DurationField durationField22 = chronology9.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField18 and durationField21", (durationField18.compareTo(durationField21) == 0) == durationField18.equals(durationField21));
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 100);
        java.lang.Integer int5 = dateTimeParserBucket4.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean7 = dateTimeParserBucket4.restoreState((java.lang.Object) dateTimeFieldType6);
        org.joda.time.Chronology chronology8 = dateTimeParserBucket4.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeZone dateTimeZone10 = chronology8.getZone();
        org.joda.time.DurationField durationField11 = chronology8.months();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.dayOfMonth();
        org.joda.time.DurationField durationField13 = chronology8.centuries();
        org.joda.time.DurationField durationField14 = chronology8.millis();
        org.joda.time.DurationField durationField15 = chronology8.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField15, durationField9, and durationField11", !(durationField15.compareTo(durationField9) == 0) || (Math.signum(durationField15.compareTo(durationField11)) == Math.signum(durationField9.compareTo(durationField11))));
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        java.lang.Integer int7 = dateTimeParserBucket6.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean9 = dateTimeParserBucket6.restoreState((java.lang.Object) dateTimeFieldType8);
        org.joda.time.Chronology chronology10 = dateTimeParserBucket6.getChronology();
        org.joda.time.DurationField durationField11 = chronology10.days();
        org.joda.time.DurationField durationField12 = chronology10.millis();
        org.joda.time.Chronology chronology14 = null;
        java.util.Locale locale15 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology14, locale15, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket18 = new org.joda.time.format.DateTimeParserBucket(64713600009L, chronology10, locale15);
        org.joda.time.DateTimeField dateTimeField19 = chronology10.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField20 = chronology10.weekyear();
        java.lang.String str21 = chronology10.toString();
        org.joda.time.DateTimeField dateTimeField22 = chronology10.minuteOfDay();
        org.joda.time.DurationField durationField23 = chronology10.weeks();
        org.joda.time.DurationField durationField24 = chronology10.weeks();
        org.joda.time.DurationField durationField25 = chronology10.years();
        org.joda.time.DateTimeField dateTimeField26 = chronology10.minuteOfDay();
        org.joda.time.DurationField durationField27 = chronology10.millis();
        org.joda.time.Chronology chronology31 = null;
        java.util.Locale locale32 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket34 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology31, locale32, (java.lang.Integer) 100);
        java.lang.Integer int35 = dateTimeParserBucket34.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean37 = dateTimeParserBucket34.restoreState((java.lang.Object) dateTimeFieldType36);
        org.joda.time.Chronology chronology38 = dateTimeParserBucket34.getChronology();
        org.joda.time.DurationField durationField39 = chronology38.days();
        org.joda.time.DurationField durationField40 = chronology38.millis();
        org.joda.time.Chronology chronology42 = null;
        java.util.Locale locale43 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket45 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology42, locale43, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket46 = new org.joda.time.format.DateTimeParserBucket(64713600009L, chronology38, locale43);
        org.joda.time.DurationField durationField47 = chronology38.weekyears();
        org.joda.time.DateTimeField dateTimeField48 = chronology38.secondOfDay();
        long long52 = chronology38.add(946684800000L, 1210L, 86399);
        org.joda.time.DateTimeField dateTimeField53 = chronology38.clockhourOfHalfday();
        java.util.Locale locale57 = new java.util.Locale("weekOfWeekyear", "UTC", "+00:00");
        boolean boolean58 = locale57.hasExtensions();
        org.joda.time.Chronology chronology60 = null;
        java.util.Locale locale61 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket63 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology60, locale61, (java.lang.Integer) 100);
        java.lang.String str64 = locale57.getDisplayCountry(locale61);
        java.util.Locale locale65 = locale61.stripExtensions();
        java.lang.String str66 = locale65.getVariant();
        java.util.Locale locale67 = locale65.stripExtensions();
        java.lang.String str68 = locale67.getDisplayName();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket69 = new org.joda.time.format.DateTimeParserBucket(946789342790L, chronology38, locale67);
        java.util.Locale locale70 = dateTimeParserBucket69.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket71 = new org.joda.time.format.DateTimeParserBucket(6393599990L, chronology10, locale70);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField25 and durationField47", (durationField25.compareTo(durationField47) == 0) == durationField25.equals(durationField47));
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 100);
        java.lang.Integer int6 = dateTimeParserBucket5.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean8 = dateTimeParserBucket5.restoreState((java.lang.Object) dateTimeFieldType7);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket5.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        org.joda.time.DurationField durationField11 = chronology9.millis();
        org.joda.time.Chronology chronology13 = null;
        java.util.Locale locale14 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology13, locale14, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket(64713600009L, chronology9, locale14);
        org.joda.time.DateTimeField dateTimeField18 = chronology9.weekOfWeekyear();
        org.joda.time.DurationField durationField19 = chronology9.centuries();
        org.joda.time.DateTimeField dateTimeField20 = chronology9.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField21 = chronology9.dayOfYear();
        org.joda.time.DurationField durationField22 = chronology9.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField22, durationField10, and durationField11", !(durationField22.compareTo(durationField10) == 0) || (Math.signum(durationField22.compareTo(durationField11)) == Math.signum(durationField10.compareTo(durationField11))));
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        java.lang.Integer int7 = dateTimeParserBucket6.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean9 = dateTimeParserBucket6.restoreState((java.lang.Object) dateTimeFieldType8);
        org.joda.time.Chronology chronology10 = dateTimeParserBucket6.getChronology();
        org.joda.time.DurationField durationField11 = chronology10.days();
        org.joda.time.DurationField durationField12 = chronology10.millis();
        org.joda.time.Chronology chronology14 = null;
        java.util.Locale locale15 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology14, locale15, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket18 = new org.joda.time.format.DateTimeParserBucket(64713600009L, chronology10, locale15);
        org.joda.time.DateTimeField dateTimeField19 = chronology10.clockhourOfHalfday();
        org.joda.time.Chronology chronology21 = null;
        java.util.Locale locale22 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket24 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology21, locale22, (java.lang.Integer) 100);
        java.lang.Integer int25 = dateTimeParserBucket24.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean27 = dateTimeParserBucket24.restoreState((java.lang.Object) dateTimeFieldType26);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.DateTimeField dateTimeField29 = dateTimeFieldType26.getField(chronology28);
        long long31 = dateTimeField29.roundHalfEven(1L);
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.Chronology chronology36 = null;
        java.util.Locale locale37 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket39 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology36, locale37, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket40 = new org.joda.time.format.DateTimeParserBucket(100L, chronology34, locale37);
        java.lang.String str41 = dateTimeField29.getAsText((long) (short) 0, locale37);
        java.util.Locale.setDefault(locale37);
        java.util.Set<java.lang.String> strSet43 = locale37.getUnicodeLocaleKeys();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket44 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology10, locale37);
        org.joda.time.DurationField durationField45 = chronology10.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField45, durationField11, and durationField12", !(durationField45.compareTo(durationField11) == 0) || (Math.signum(durationField45.compareTo(durationField12)) == Math.signum(durationField11.compareTo(durationField12))));
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 100);
        java.lang.Integer int6 = dateTimeParserBucket5.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean8 = dateTimeParserBucket5.restoreState((java.lang.Object) dateTimeFieldType7);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket5.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        org.joda.time.DateTimeField dateTimeField11 = dateTimeFieldType0.getField(chronology9);
        org.joda.time.DateTimeField dateTimeField12 = chronology9.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField13 = chronology9.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField14 = chronology9.yearOfEra();
        org.joda.time.DateTimeField dateTimeField15 = chronology9.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField16 = chronology9.dayOfYear();
        org.joda.time.DateTimeField dateTimeField17 = chronology9.hourOfDay();
        org.joda.time.DurationField durationField18 = chronology9.centuries();
        org.joda.time.DurationField durationField19 = chronology9.weekyears();
        org.joda.time.DateTimeField dateTimeField20 = chronology9.weekyear();
        org.joda.time.DateTimeField dateTimeField21 = chronology9.hourOfHalfday();
        org.joda.time.DurationField durationField22 = chronology9.minutes();
        org.joda.time.DateTimeField dateTimeField23 = chronology9.year();
        org.joda.time.DurationField durationField24 = dateTimeField23.getDurationField();
        java.lang.String str25 = dateTimeField23.getName();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField19 and durationField24", (durationField19.compareTo(durationField24) == 0) == durationField19.equals(durationField24));
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 100);
        java.lang.Integer int6 = dateTimeParserBucket5.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean8 = dateTimeParserBucket5.restoreState((java.lang.Object) dateTimeFieldType7);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket5.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        org.joda.time.DateTimeField dateTimeField11 = dateTimeFieldType0.getField(chronology9);
        org.joda.time.DateTimeField dateTimeField12 = chronology9.dayOfMonth();
        org.joda.time.DurationField durationField13 = chronology9.seconds();
        org.joda.time.Chronology chronology14 = chronology9.withUTC();
        org.joda.time.DateTimeField dateTimeField15 = chronology9.weekyear();
        org.joda.time.DurationField durationField16 = chronology9.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField16, durationField10, and durationField13", !(durationField16.compareTo(durationField10) == 0) || (Math.signum(durationField16.compareTo(durationField13)) == Math.signum(durationField10.compareTo(durationField13))));
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 100);
        java.lang.Integer int6 = dateTimeParserBucket5.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean8 = dateTimeParserBucket5.restoreState((java.lang.Object) dateTimeFieldType7);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket5.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.Chronology chronology14 = null;
        java.util.Locale locale15 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology14, locale15, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket18 = new org.joda.time.format.DateTimeParserBucket(100L, chronology12, locale15);
        java.lang.String str19 = locale15.getScript();
        java.lang.String str21 = locale15.getExtension('u');
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket24 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology9, locale15, (java.lang.Integer) (-1), 2);
        org.joda.time.DateTimeField dateTimeField25 = chronology9.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField26 = chronology9.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField27 = chronology9.secondOfMinute();
        org.joda.time.DurationField durationField28 = chronology9.weeks();
        org.joda.time.DurationField durationField29 = chronology9.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField29, durationField10, and durationField28", !(durationField29.compareTo(durationField10) == 0) || (Math.signum(durationField29.compareTo(durationField28)) == Math.signum(durationField10.compareTo(durationField28))));
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        org.joda.time.DurationFieldType durationFieldType2 = dateTimeFieldType1.getRangeDurationType();
        java.lang.String str3 = dateTimeFieldType1.toString();
        org.joda.time.Chronology chronology5 = null;
        java.util.Locale locale6 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology5, locale6, (java.lang.Integer) 100);
        java.lang.Integer int9 = dateTimeParserBucket8.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean11 = dateTimeParserBucket8.restoreState((java.lang.Object) dateTimeFieldType10);
        org.joda.time.Chronology chronology12 = dateTimeParserBucket8.getChronology();
        org.joda.time.DurationField durationField13 = chronology12.days();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        long long17 = chronology12.add(readablePeriod14, 0L, 0);
        org.joda.time.DateTimeField dateTimeField18 = chronology12.weekyear();
        org.joda.time.DateTimeField dateTimeField19 = chronology12.year();
        org.joda.time.DateTimeField dateTimeField20 = dateTimeFieldType1.getField(chronology12);
        org.joda.time.DurationField durationField21 = chronology12.years();
        java.util.Locale locale25 = new java.util.Locale("weekOfWeekyear", "UTC", "+00:00");
        boolean boolean26 = locale25.hasExtensions();
        org.joda.time.Chronology chronology28 = null;
        java.util.Locale locale29 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket31 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology28, locale29, (java.lang.Integer) 100);
        java.lang.String str32 = locale25.getDisplayCountry(locale29);
        java.util.Locale locale33 = locale29.stripExtensions();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket36 = new org.joda.time.format.DateTimeParserBucket(0L, chronology12, locale29, (java.lang.Integer) 7343661, 52);
        org.joda.time.DurationField durationField37 = chronology12.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField37, durationField13, and durationField21", !(durationField37.compareTo(durationField13) == 0) || (Math.signum(durationField37.compareTo(durationField21)) == Math.signum(durationField13.compareTo(durationField21))));
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 100);
        java.lang.Integer int5 = dateTimeParserBucket4.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean7 = dateTimeParserBucket4.restoreState((java.lang.Object) dateTimeFieldType6);
        org.joda.time.Chronology chronology8 = dateTimeParserBucket4.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.ReadableInstant readableInstant12 = null;
        int int13 = dateTimeZone11.getOffset(readableInstant12);
        org.joda.time.ReadableInstant readableInstant14 = null;
        int int15 = dateTimeZone11.getOffset(readableInstant14);
        org.joda.time.Chronology chronology18 = null;
        java.util.Locale locale19 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket21 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology18, locale19, (java.lang.Integer) 100);
        java.lang.String str22 = dateTimeZone11.getShortName(10L, locale19);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.Chronology chronology27 = null;
        java.util.Locale locale28 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket30 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology27, locale28, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket31 = new org.joda.time.format.DateTimeParserBucket(100L, chronology25, locale28);
        java.lang.String str32 = locale28.getScript();
        java.lang.String str33 = locale28.getISO3Country();
        java.lang.String str34 = locale28.getDisplayScript();
        java.lang.String str35 = dateTimeZone11.getName((long) 53, locale28);
        org.joda.time.Chronology chronology36 = chronology8.withZone(dateTimeZone11);
        org.joda.time.Chronology chronology37 = chronology36.withUTC();
        org.joda.time.DurationField durationField38 = chronology37.eras();
        org.joda.time.ReadablePeriod readablePeriod39 = null;
        long long42 = chronology37.add(readablePeriod39, (-176675418255600000L), 18720052);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField9 and durationField38", Math.signum(durationField9.compareTo(durationField38)) == -Math.signum(durationField38.compareTo(durationField9)));
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 100);
        java.lang.Integer int6 = dateTimeParserBucket5.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean8 = dateTimeParserBucket5.restoreState((java.lang.Object) dateTimeFieldType7);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket5.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        org.joda.time.DateTimeZone dateTimeZone11 = chronology9.getZone();
        org.joda.time.DurationField durationField12 = chronology9.months();
        org.joda.time.DurationField durationField13 = chronology9.hours();
        org.joda.time.DateTimeField dateTimeField14 = chronology9.hourOfDay();
        org.joda.time.DateTimeField dateTimeField15 = dateTimeFieldType0.getField(chronology9);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateTimeField dateTimeField17 = dateTimeFieldType0.getField(chronology16);
        java.lang.String str18 = dateTimeFieldType0.toString();
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.Chronology chronology21 = null;
        java.util.Locale locale22 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket24 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology21, locale22, (java.lang.Integer) 100);
        java.lang.Integer int25 = dateTimeParserBucket24.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean27 = dateTimeParserBucket24.restoreState((java.lang.Object) dateTimeFieldType26);
        org.joda.time.Chronology chronology28 = dateTimeParserBucket24.getChronology();
        org.joda.time.DurationField durationField29 = chronology28.days();
        org.joda.time.DateTimeField dateTimeField30 = dateTimeFieldType19.getField(chronology28);
        org.joda.time.DateTimeField dateTimeField31 = chronology28.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        long long35 = dateTimeZone33.convertUTCToLocal((long) (short) -1);
        org.joda.time.Chronology chronology37 = null;
        java.util.Locale locale38 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket40 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology37, locale38, (java.lang.Integer) 100);
        java.lang.Integer int41 = dateTimeParserBucket40.getPivotYear();
        org.joda.time.DateTimeField dateTimeField42 = null;
        dateTimeParserBucket40.saveField(dateTimeField42, (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone45 = dateTimeParserBucket40.getZone();
        long long47 = dateTimeZone33.getMillisKeepLocal(dateTimeZone45, 97L);
        int int49 = dateTimeZone33.getStandardOffset(1L);
        org.joda.time.Chronology chronology50 = chronology28.withZone(dateTimeZone33);
        java.util.TimeZone timeZone51 = null;
        org.joda.time.DateTimeZone dateTimeZone52 = org.joda.time.DateTimeZone.forTimeZone(timeZone51);
        int int54 = dateTimeZone52.getStandardOffset((long) (byte) -1);
        java.lang.String str56 = dateTimeZone52.getName(32054400100L);
        org.joda.time.Chronology chronology57 = chronology50.withZone(dateTimeZone52);
        org.joda.time.DateTimeField dateTimeField58 = dateTimeFieldType0.getField(chronology50);
        org.joda.time.DateTimeField dateTimeField59 = chronology50.hourOfDay();
        org.joda.time.DateTimeField dateTimeField60 = chronology50.weekyear();
        org.joda.time.DurationField durationField61 = chronology50.months();
        org.joda.time.DurationField durationField62 = chronology50.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField12 and durationField61", (durationField12.compareTo(durationField61) == 0) == durationField12.equals(durationField61));
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 100);
        java.lang.Integer int6 = dateTimeParserBucket5.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean8 = dateTimeParserBucket5.restoreState((java.lang.Object) dateTimeFieldType7);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket5.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        org.joda.time.DateTimeZone dateTimeZone11 = chronology9.getZone();
        org.joda.time.DateTimeField dateTimeField12 = chronology9.yearOfCentury();
        org.joda.time.DurationField durationField13 = chronology9.years();
        org.joda.time.DateTimeField dateTimeField14 = chronology9.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField15 = chronology9.weekOfWeekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.Chronology chronology18 = null;
        java.util.Locale locale19 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket21 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology18, locale19, (java.lang.Integer) 100);
        java.lang.Integer int22 = dateTimeParserBucket21.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean24 = dateTimeParserBucket21.restoreState((java.lang.Object) dateTimeFieldType23);
        org.joda.time.Chronology chronology25 = dateTimeParserBucket21.getChronology();
        org.joda.time.DurationField durationField26 = chronology25.days();
        org.joda.time.DateTimeZone dateTimeZone27 = chronology25.getZone();
        org.joda.time.DurationField durationField28 = chronology25.months();
        org.joda.time.DurationField durationField29 = chronology25.hours();
        org.joda.time.DateTimeField dateTimeField30 = chronology25.hourOfDay();
        org.joda.time.DateTimeField dateTimeField31 = dateTimeFieldType16.getField(chronology25);
        org.joda.time.DateTimeField dateTimeField32 = chronology25.millisOfSecond();
        org.joda.time.ReadablePartial readablePartial33 = null;
        org.joda.time.Chronology chronology36 = null;
        java.util.Locale locale37 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket39 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology36, locale37, (java.lang.Integer) 100);
        java.lang.Integer int40 = dateTimeParserBucket39.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean42 = dateTimeParserBucket39.restoreState((java.lang.Object) dateTimeFieldType41);
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.DateTimeField dateTimeField44 = dateTimeFieldType41.getField(chronology43);
        long long46 = dateTimeField44.roundHalfEven(1L);
        java.util.Locale locale47 = java.util.Locale.CHINESE;
        java.lang.String str48 = locale47.toLanguageTag();
        java.lang.String str49 = locale47.getDisplayScript();
        int int50 = dateTimeField44.getMaximumShortTextLength(locale47);
        java.util.Set<java.lang.Character> charSet51 = locale47.getExtensionKeys();
        java.util.Locale locale52 = java.util.Locale.GERMAN;
        java.util.Locale locale53 = java.util.Locale.getDefault();
        java.lang.String str54 = locale52.getDisplayVariant(locale53);
        java.lang.String str55 = locale47.getDisplayScript(locale52);
        java.lang.String str56 = locale52.getISO3Language();
        java.lang.String str57 = dateTimeField32.getAsShortText(readablePartial33, 0, locale52);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket59 = new org.joda.time.format.DateTimeParserBucket(1219855139999L, chronology9, locale52, (java.lang.Integer) 24);
        org.joda.time.DateTimeZone dateTimeZone61 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str62 = dateTimeZone61.getID();
        long long64 = dateTimeZone61.previousTransition((long) 'a');
        boolean boolean65 = dateTimeZone61.isFixed();
        java.lang.String str67 = dateTimeZone61.getShortName((long) (short) 100);
        java.lang.String str69 = dateTimeZone61.getName((long) 86399);
        org.joda.time.Chronology chronology70 = chronology9.withZone(dateTimeZone61);
        org.joda.time.Chronology chronology71 = chronology9.withUTC();
        java.util.TimeZone timeZone72 = null;
        org.joda.time.DateTimeZone dateTimeZone73 = org.joda.time.DateTimeZone.forTimeZone(timeZone72);
        java.util.Locale locale78 = new java.util.Locale("weekOfWeekyear", "UTC", "+00:00");
        boolean boolean79 = locale78.hasExtensions();
        org.joda.time.Chronology chronology81 = null;
        java.util.Locale locale82 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket84 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology81, locale82, (java.lang.Integer) 100);
        java.lang.String str85 = locale78.getDisplayCountry(locale82);
        java.lang.String str86 = dateTimeZone73.getShortName((long) (short) 1, locale82);
        java.lang.String str87 = dateTimeZone73.getID();
        org.joda.time.Chronology chronology88 = chronology9.withZone(dateTimeZone73);
        org.joda.time.DurationField durationField89 = chronology9.weekyears();
        org.joda.time.DurationField durationField90 = chronology9.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField13 and durationField90", (durationField13.compareTo(durationField90) == 0) == durationField13.equals(durationField90));
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 100);
        java.lang.Integer int6 = dateTimeParserBucket5.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean8 = dateTimeParserBucket5.restoreState((java.lang.Object) dateTimeFieldType7);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket5.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        org.joda.time.DateTimeZone dateTimeZone11 = chronology9.getZone();
        org.joda.time.DateTimeField dateTimeField12 = chronology9.yearOfCentury();
        org.joda.time.DurationField durationField13 = chronology9.years();
        org.joda.time.DurationField durationField14 = chronology9.weekyears();
        java.util.Locale locale18 = new java.util.Locale("\u5927\u97d3\u6c11\u56fd", "ko-kr", "50");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket20 = new org.joda.time.format.DateTimeParserBucket(26881919999L, chronology9, locale18, (java.lang.Integer) 1497);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField13 and durationField14", (durationField13.compareTo(durationField14) == 0) == durationField13.equals(durationField14));
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        java.lang.Integer int7 = dateTimeParserBucket6.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean9 = dateTimeParserBucket6.restoreState((java.lang.Object) dateTimeFieldType8);
        org.joda.time.Chronology chronology10 = dateTimeParserBucket6.getChronology();
        org.joda.time.DurationField durationField11 = chronology10.days();
        org.joda.time.DurationField durationField12 = chronology10.millis();
        org.joda.time.Chronology chronology14 = null;
        java.util.Locale locale15 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology14, locale15, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket18 = new org.joda.time.format.DateTimeParserBucket(64713600009L, chronology10, locale15);
        org.joda.time.DateTimeField dateTimeField19 = chronology10.minuteOfDay();
        org.joda.time.DurationField durationField20 = chronology10.days();
        org.joda.time.DateTimeField dateTimeField21 = chronology10.minuteOfDay();
        org.joda.time.DurationField durationField22 = chronology10.months();
        org.joda.time.DurationField durationField23 = chronology10.hours();
        org.joda.time.DurationField durationField24 = chronology10.seconds();
        java.util.Locale.Builder builder25 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder26 = builder25.clear();
        java.util.Locale locale27 = builder25.build();
        java.lang.String str28 = locale27.getScript();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket31 = new org.joda.time.format.DateTimeParserBucket(66528000000L, chronology10, locale27, (java.lang.Integer) 10, (-292275054));
        org.joda.time.DateTimeField dateTimeField32 = chronology10.hourOfDay();
        org.joda.time.DateTimeField dateTimeField33 = chronology10.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField34 = chronology10.era();
        org.joda.time.DateTimeField dateTimeField35 = chronology10.millisOfDay();
        org.joda.time.DurationField durationField36 = chronology10.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField36, durationField11, and durationField12", !(durationField36.compareTo(durationField11) == 0) || (Math.signum(durationField36.compareTo(durationField12)) == Math.signum(durationField11.compareTo(durationField12))));
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 100);
        java.lang.Integer int5 = dateTimeParserBucket4.getPivotYear();
        org.joda.time.DateTimeField dateTimeField6 = null;
        dateTimeParserBucket4.saveField(dateTimeField6, (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone9 = dateTimeParserBucket4.getZone();
        org.joda.time.Chronology chronology11 = null;
        java.util.Locale locale12 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket14 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology11, locale12, (java.lang.Integer) 100);
        java.lang.Integer int15 = dateTimeParserBucket14.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean17 = dateTimeParserBucket14.restoreState((java.lang.Object) dateTimeFieldType16);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTimeField dateTimeField19 = dateTimeFieldType16.getField(chronology18);
        java.util.Locale locale21 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet22 = locale21.getUnicodeLocaleAttributes();
        org.joda.time.Chronology chronology24 = null;
        java.util.Locale locale25 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket27 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology24, locale25, (java.lang.Integer) 100);
        java.lang.String str28 = locale21.getDisplayScript(locale25);
        java.lang.String str29 = dateTimeField19.getAsShortText(10, locale21);
        dateTimeParserBucket4.saveField(dateTimeField19, (int) (byte) 1);
        org.joda.time.DurationField durationField32 = dateTimeField19.getRangeDurationField();
        long long34 = dateTimeField19.roundHalfEven((long) (short) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType35 = dateTimeField19.getType();
        org.joda.time.DurationFieldType durationFieldType36 = dateTimeFieldType35.getDurationType();
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.Chronology chronology39 = null;
        java.util.Locale locale40 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket42 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology39, locale40, (java.lang.Integer) 100);
        java.lang.Integer int43 = dateTimeParserBucket42.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType44 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean45 = dateTimeParserBucket42.restoreState((java.lang.Object) dateTimeFieldType44);
        org.joda.time.Chronology chronology46 = dateTimeParserBucket42.getChronology();
        org.joda.time.DurationField durationField47 = chronology46.days();
        org.joda.time.DateTimeField dateTimeField48 = dateTimeFieldType37.getField(chronology46);
        org.joda.time.DateTimeField dateTimeField49 = chronology46.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField50 = chronology46.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField51 = chronology46.yearOfEra();
        org.joda.time.DurationField durationField52 = chronology46.weeks();
        org.joda.time.DurationField durationField53 = chronology46.centuries();
        org.joda.time.DateTimeField dateTimeField54 = dateTimeFieldType35.getField(chronology46);
        org.joda.time.Chronology chronology57 = null;
        java.util.Locale locale58 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket60 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology57, locale58, (java.lang.Integer) 100);
        java.lang.Integer int61 = dateTimeParserBucket60.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType62 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean63 = dateTimeParserBucket60.restoreState((java.lang.Object) dateTimeFieldType62);
        org.joda.time.Chronology chronology64 = dateTimeParserBucket60.getChronology();
        org.joda.time.DurationField durationField65 = chronology64.years();
        org.joda.time.Chronology chronology67 = null;
        org.joda.time.Chronology chronology69 = null;
        java.util.Locale locale70 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket72 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology69, locale70, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket73 = new org.joda.time.format.DateTimeParserBucket(100L, chronology67, locale70);
        java.lang.String str74 = locale70.getScript();
        java.lang.String str76 = locale70.getExtension('u');
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket79 = new org.joda.time.format.DateTimeParserBucket(259200117L, chronology64, locale70, (java.lang.Integer) 100, (int) (byte) 1);
        org.joda.time.DateTimeField dateTimeField80 = chronology64.hourOfHalfday();
        org.joda.time.DurationField durationField81 = chronology64.minutes();
        org.joda.time.DateTimeField dateTimeField82 = chronology64.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField83 = chronology64.secondOfDay();
        boolean boolean84 = dateTimeFieldType35.isSupported(chronology64);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField32 and durationField65", (durationField32.compareTo(durationField65) == 0) == durationField32.equals(durationField65));
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 100);
        java.lang.Integer int5 = dateTimeParserBucket4.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean7 = dateTimeParserBucket4.restoreState((java.lang.Object) dateTimeFieldType6);
        org.joda.time.Chronology chronology8 = dateTimeParserBucket4.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        long long13 = chronology8.add(readablePeriod10, 0L, 0);
        org.joda.time.DateTimeField dateTimeField14 = chronology8.weekyear();
        org.joda.time.DateTimeField dateTimeField15 = chronology8.year();
        long long19 = chronology8.add(2L, (long) (short) 10, (-9));
        org.joda.time.DateTimeField dateTimeField20 = chronology8.minuteOfDay();
        org.joda.time.DurationField durationField21 = chronology8.halfdays();
        org.joda.time.DateTimeField dateTimeField22 = chronology8.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.ReadableInstant readableInstant25 = null;
        int int26 = dateTimeZone24.getOffset(readableInstant25);
        long long29 = dateTimeZone24.convertLocalToUTC((long) 1, true);
        java.lang.String str30 = dateTimeZone24.toString();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone24);
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(53, 53);
        long long36 = dateTimeZone34.previousTransition((-259200000L));
        org.joda.time.ReadableInstant readableInstant37 = null;
        int int38 = dateTimeZone34.getOffset(readableInstant37);
        long long40 = dateTimeZone24.getMillisKeepLocal(dateTimeZone34, (long) 86399);
        org.joda.time.Chronology chronology41 = chronology8.withZone(dateTimeZone24);
        org.joda.time.DurationField durationField42 = chronology41.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField42, durationField9, and durationField21", !(durationField42.compareTo(durationField9) == 0) || (Math.signum(durationField42.compareTo(durationField21)) == Math.signum(durationField9.compareTo(durationField21))));
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 100);
        java.lang.Integer int6 = dateTimeParserBucket5.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean8 = dateTimeParserBucket5.restoreState((java.lang.Object) dateTimeFieldType7);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket5.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        org.joda.time.DateTimeZone dateTimeZone11 = chronology9.getZone();
        org.joda.time.DateTimeField dateTimeField12 = chronology9.monthOfYear();
        org.joda.time.DateTimeField dateTimeField13 = chronology9.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField14 = chronology9.secondOfDay();
        org.joda.time.DateTimeField dateTimeField15 = chronology9.clockhourOfDay();
        org.joda.time.DurationField durationField16 = chronology9.eras();
        java.util.Locale.Category category17 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale18 = java.util.Locale.GERMANY;
        java.lang.String str19 = locale18.getDisplayCountry();
        java.util.Locale.setDefault(category17, locale18);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.Chronology chronology24 = null;
        java.util.Locale locale25 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket27 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology24, locale25, (java.lang.Integer) 100);
        java.lang.Integer int28 = dateTimeParserBucket27.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean30 = dateTimeParserBucket27.restoreState((java.lang.Object) dateTimeFieldType29);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.DateTimeField dateTimeField32 = dateTimeFieldType29.getField(chronology31);
        long long35 = dateTimeField32.getDifferenceAsLong((long) ' ', (long) 1);
        org.joda.time.ReadablePartial readablePartial36 = null;
        java.util.Locale locale38 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str39 = dateTimeField32.getAsShortText(readablePartial36, (int) ' ', locale38);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket42 = new org.joda.time.format.DateTimeParserBucket(9L, chronology22, locale38, (java.lang.Integer) 2, (int) '4');
        java.lang.Object obj43 = dateTimeParserBucket42.saveState();
        long long44 = dateTimeParserBucket42.computeMillis();
        dateTimeParserBucket42.setPivotYear((java.lang.Integer) 53);
        org.joda.time.DateTimeFieldType dateTimeFieldType47 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.Chronology chronology49 = null;
        java.util.Locale locale50 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket52 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology49, locale50, (java.lang.Integer) 100);
        java.lang.Integer int53 = dateTimeParserBucket52.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType54 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean55 = dateTimeParserBucket52.restoreState((java.lang.Object) dateTimeFieldType54);
        org.joda.time.Chronology chronology56 = dateTimeParserBucket52.getChronology();
        org.joda.time.DurationField durationField57 = chronology56.days();
        org.joda.time.DateTimeField dateTimeField58 = dateTimeFieldType47.getField(chronology56);
        org.joda.time.DateTimeField dateTimeField59 = chronology56.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField60 = chronology56.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField61 = chronology56.hourOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType62 = dateTimeField61.getType();
        int int64 = dateTimeField61.getLeapAmount((long) 3);
        org.joda.time.DateTimeFieldType dateTimeFieldType65 = dateTimeField61.getType();
        java.util.Locale.Builder builder67 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder68 = builder67.clear();
        java.util.Locale locale69 = builder68.build();
        org.joda.time.Chronology chronology71 = null;
        java.util.Locale locale73 = new java.util.Locale("");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket76 = new org.joda.time.format.DateTimeParserBucket((long) 'u', chronology71, locale73, (java.lang.Integer) 1, 0);
        java.lang.String str77 = locale69.getDisplayVariant(locale73);
        java.lang.String str78 = locale73.getDisplayVariant();
        dateTimeParserBucket42.saveField(dateTimeFieldType65, "\u97e9\u56fd", locale73);
        java.util.Locale.setDefault(category17, locale73);
        org.joda.time.Chronology chronology82 = null;
        java.util.Locale locale84 = new java.util.Locale("");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket87 = new org.joda.time.format.DateTimeParserBucket((long) 'u', chronology82, locale84, (java.lang.Integer) 1, 0);
        java.util.Locale locale88 = java.util.Locale.ENGLISH;
        java.lang.String str89 = locale84.getDisplayName(locale88);
        java.util.Locale locale93 = new java.util.Locale("ko-KR", "32", "");
        java.lang.String str94 = locale88.getDisplayLanguage(locale93);
        java.lang.String str95 = locale88.getDisplayName();
        java.util.Locale.setDefault(category17, locale88);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket99 = new org.joda.time.format.DateTimeParserBucket((long) 200, chronology9, locale88, (java.lang.Integer) 1439, 1380);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField10 and durationField16", Math.signum(durationField10.compareTo(durationField16)) == -Math.signum(durationField16.compareTo(durationField10)));
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 100);
        java.lang.Integer int6 = dateTimeParserBucket5.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean8 = dateTimeParserBucket5.restoreState((java.lang.Object) dateTimeFieldType7);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket5.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        org.joda.time.DateTimeField dateTimeField11 = dateTimeFieldType0.getField(chronology9);
        org.joda.time.DateTimeField dateTimeField12 = chronology9.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        long long16 = dateTimeZone14.convertUTCToLocal((long) (short) -1);
        org.joda.time.Chronology chronology18 = null;
        java.util.Locale locale19 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket21 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology18, locale19, (java.lang.Integer) 100);
        java.lang.Integer int22 = dateTimeParserBucket21.getPivotYear();
        org.joda.time.DateTimeField dateTimeField23 = null;
        dateTimeParserBucket21.saveField(dateTimeField23, (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone26 = dateTimeParserBucket21.getZone();
        long long28 = dateTimeZone14.getMillisKeepLocal(dateTimeZone26, 97L);
        int int30 = dateTimeZone14.getStandardOffset(1L);
        org.joda.time.Chronology chronology31 = chronology9.withZone(dateTimeZone14);
        org.joda.time.DurationField durationField32 = chronology31.millis();
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        long long36 = chronology31.add(readablePeriod33, (-62104060800001L), 2);
        java.lang.String str37 = chronology31.toString();
        org.joda.time.DurationField durationField38 = chronology31.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField38, durationField10, and durationField32", !(durationField38.compareTo(durationField10) == 0) || (Math.signum(durationField38.compareTo(durationField32)) == Math.signum(durationField10.compareTo(durationField32))));
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 100);
        java.lang.Integer int6 = dateTimeParserBucket5.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean8 = dateTimeParserBucket5.restoreState((java.lang.Object) dateTimeFieldType7);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket5.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        org.joda.time.DateTimeField dateTimeField11 = dateTimeFieldType0.getField(chronology9);
        org.joda.time.DateTimeField dateTimeField12 = chronology9.dayOfMonth();
        org.joda.time.DurationField durationField13 = chronology9.seconds();
        org.joda.time.DateTimeField dateTimeField14 = chronology9.millisOfDay();
        org.joda.time.DurationField durationField15 = chronology9.days();
        org.joda.time.DateTimeField dateTimeField16 = chronology9.clockhourOfDay();
        long long20 = chronology9.add(604800053L, 100L, (int) (byte) 10);
        org.joda.time.DateTimeField dateTimeField21 = chronology9.hourOfDay();
        java.lang.String str22 = dateTimeField21.toString();
        int int24 = dateTimeField21.getMinimumValue((long) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = dateTimeField21.getType();
        org.joda.time.Chronology chronology29 = null;
        java.util.Locale locale30 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket32 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology29, locale30, (java.lang.Integer) 100);
        java.lang.Integer int33 = dateTimeParserBucket32.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean35 = dateTimeParserBucket32.restoreState((java.lang.Object) dateTimeFieldType34);
        org.joda.time.Chronology chronology36 = dateTimeParserBucket32.getChronology();
        org.joda.time.DurationField durationField37 = chronology36.years();
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.Chronology chronology41 = null;
        java.util.Locale locale42 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket44 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology41, locale42, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket45 = new org.joda.time.format.DateTimeParserBucket(100L, chronology39, locale42);
        java.lang.String str46 = locale42.getScript();
        java.lang.String str48 = locale42.getExtension('u');
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket51 = new org.joda.time.format.DateTimeParserBucket(259200117L, chronology36, locale42, (java.lang.Integer) 100, (int) (byte) 1);
        org.joda.time.Chronology chronology52 = dateTimeParserBucket51.getChronology();
        java.util.Locale locale53 = java.util.Locale.KOREA;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket55 = new org.joda.time.format.DateTimeParserBucket((long) 86399999, chronology52, locale53, (java.lang.Integer) 0);
        long long58 = dateTimeParserBucket55.computeMillis(false, "0");
        long long60 = dateTimeParserBucket55.computeMillis(false);
        org.joda.time.Chronology chronology61 = dateTimeParserBucket55.getChronology();
        org.joda.time.DateTimeField dateTimeField62 = chronology61.year();
        org.joda.time.DateTimeField dateTimeField63 = chronology61.monthOfYear();
        boolean boolean64 = dateTimeFieldType25.isSupported(chronology61);
        org.joda.time.DateTimeFieldType dateTimeFieldType65 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.Chronology chronology67 = null;
        java.util.Locale locale68 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket70 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology67, locale68, (java.lang.Integer) 100);
        java.lang.Integer int71 = dateTimeParserBucket70.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType72 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean73 = dateTimeParserBucket70.restoreState((java.lang.Object) dateTimeFieldType72);
        org.joda.time.Chronology chronology74 = dateTimeParserBucket70.getChronology();
        org.joda.time.DurationField durationField75 = chronology74.days();
        org.joda.time.DateTimeField dateTimeField76 = dateTimeFieldType65.getField(chronology74);
        org.joda.time.DateTimeField dateTimeField77 = chronology74.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField78 = chronology74.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField79 = chronology74.yearOfEra();
        org.joda.time.DateTimeField dateTimeField80 = chronology74.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField81 = chronology74.dayOfWeek();
        org.joda.time.DurationField durationField82 = chronology74.weeks();
        org.joda.time.DurationField durationField83 = chronology74.weekyears();
        org.joda.time.DateTimeField dateTimeField84 = chronology74.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField85 = chronology74.centuryOfEra();
        org.joda.time.DurationField durationField86 = chronology74.years();
        boolean boolean87 = dateTimeFieldType25.isSupported(chronology74);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField37 and durationField83", (durationField37.compareTo(durationField83) == 0) == durationField37.equals(durationField83));
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 100);
        java.lang.Integer int6 = dateTimeParserBucket5.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean8 = dateTimeParserBucket5.restoreState((java.lang.Object) dateTimeFieldType7);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket5.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        org.joda.time.DateTimeField dateTimeField11 = dateTimeFieldType0.getField(chronology9);
        org.joda.time.DateTimeField dateTimeField12 = chronology9.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        long long16 = dateTimeZone14.convertUTCToLocal((long) (short) -1);
        org.joda.time.Chronology chronology18 = null;
        java.util.Locale locale19 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket21 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology18, locale19, (java.lang.Integer) 100);
        java.lang.Integer int22 = dateTimeParserBucket21.getPivotYear();
        org.joda.time.DateTimeField dateTimeField23 = null;
        dateTimeParserBucket21.saveField(dateTimeField23, (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone26 = dateTimeParserBucket21.getZone();
        long long28 = dateTimeZone14.getMillisKeepLocal(dateTimeZone26, 97L);
        int int30 = dateTimeZone14.getStandardOffset(1L);
        org.joda.time.Chronology chronology31 = chronology9.withZone(dateTimeZone14);
        org.joda.time.DurationField durationField32 = chronology31.millis();
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        long long36 = chronology31.add(readablePeriod33, (-62104060800001L), 2);
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str39 = dateTimeZone38.getID();
        int int41 = dateTimeZone38.getOffsetFromLocal((long) 100);
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.Chronology chronology46 = null;
        java.util.Locale locale47 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket49 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology46, locale47, (java.lang.Integer) 100);
        java.lang.Integer int50 = dateTimeParserBucket49.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType51 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean52 = dateTimeParserBucket49.restoreState((java.lang.Object) dateTimeFieldType51);
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.DateTimeField dateTimeField54 = dateTimeFieldType51.getField(chronology53);
        java.util.Locale locale56 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet57 = locale56.getUnicodeLocaleAttributes();
        org.joda.time.Chronology chronology59 = null;
        java.util.Locale locale60 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket62 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology59, locale60, (java.lang.Integer) 100);
        java.lang.String str63 = locale56.getDisplayScript(locale60);
        java.lang.String str64 = dateTimeField54.getAsShortText(10, locale56);
        java.util.Locale.setDefault(locale56);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket66 = new org.joda.time.format.DateTimeParserBucket((-259200000L), chronology44, locale56);
        java.lang.String str67 = dateTimeZone38.getShortName(97L, locale56);
        long long71 = dateTimeZone38.convertLocalToUTC((long) (-1), false, 60480000010L);
        boolean boolean72 = dateTimeZone38.isFixed();
        org.joda.time.Chronology chronology73 = chronology31.withZone(dateTimeZone38);
        org.joda.time.DurationField durationField74 = chronology31.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField74, durationField10, and durationField32", !(durationField74.compareTo(durationField10) == 0) || (Math.signum(durationField74.compareTo(durationField32)) == Math.signum(durationField10.compareTo(durationField32))));
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 100);
        java.lang.Integer int6 = dateTimeParserBucket5.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean8 = dateTimeParserBucket5.restoreState((java.lang.Object) dateTimeFieldType7);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket5.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        org.joda.time.DurationField durationField11 = chronology9.millis();
        org.joda.time.Chronology chronology13 = null;
        java.util.Locale locale14 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology13, locale14, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket(64713600009L, chronology9, locale14);
        org.joda.time.DateTimeField dateTimeField18 = chronology9.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField19 = chronology9.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField20 = chronology9.clockhourOfDay();
        org.joda.time.DurationField durationField21 = chronology9.halfdays();
        org.joda.time.DurationField durationField22 = chronology9.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField22, durationField10, and durationField11", !(durationField22.compareTo(durationField10) == 0) || (Math.signum(durationField22.compareTo(durationField11)) == Math.signum(durationField10.compareTo(durationField11))));
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        java.lang.Integer int7 = dateTimeParserBucket6.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean9 = dateTimeParserBucket6.restoreState((java.lang.Object) dateTimeFieldType8);
        org.joda.time.Chronology chronology10 = dateTimeParserBucket6.getChronology();
        org.joda.time.DurationField durationField11 = chronology10.days();
        org.joda.time.DateTimeField dateTimeField12 = dateTimeFieldType1.getField(chronology10);
        org.joda.time.DateTimeField dateTimeField13 = chronology10.dayOfMonth();
        org.joda.time.DurationField durationField14 = chronology10.seconds();
        org.joda.time.DateTimeField dateTimeField15 = chronology10.millisOfDay();
        org.joda.time.DurationField durationField16 = chronology10.halfdays();
        org.joda.time.DurationField durationField17 = chronology10.days();
        org.joda.time.DateTimeField dateTimeField18 = chronology10.dayOfWeek();
        org.joda.time.DurationField durationField19 = chronology10.weekyears();
        java.util.Locale locale20 = java.util.Locale.ITALIAN;
        java.util.Locale locale21 = locale20.stripExtensions();
        java.lang.String str22 = locale21.getDisplayName();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket23 = new org.joda.time.format.DateTimeParserBucket(60480000010L, chronology10, locale21);
        org.joda.time.DateTimeZone dateTimeZone24 = dateTimeParserBucket23.getZone();
        org.joda.time.Chronology chronology28 = null;
        java.util.Locale locale29 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket31 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology28, locale29, (java.lang.Integer) 100);
        java.lang.Integer int32 = dateTimeParserBucket31.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean34 = dateTimeParserBucket31.restoreState((java.lang.Object) dateTimeFieldType33);
        org.joda.time.Chronology chronology35 = dateTimeParserBucket31.getChronology();
        org.joda.time.DurationField durationField36 = chronology35.days();
        org.joda.time.DurationField durationField37 = chronology35.millis();
        org.joda.time.Chronology chronology39 = null;
        java.util.Locale locale40 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket42 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology39, locale40, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket43 = new org.joda.time.format.DateTimeParserBucket(64713600009L, chronology35, locale40);
        org.joda.time.DateTimeField dateTimeField44 = chronology35.minuteOfDay();
        org.joda.time.DurationField durationField45 = chronology35.days();
        org.joda.time.DateTimeField dateTimeField46 = chronology35.minuteOfDay();
        org.joda.time.DurationField durationField47 = chronology35.months();
        org.joda.time.DurationField durationField48 = chronology35.hours();
        org.joda.time.DurationField durationField49 = chronology35.seconds();
        java.util.Locale.Builder builder50 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder51 = builder50.clear();
        java.util.Locale locale52 = builder50.build();
        java.lang.String str53 = locale52.getScript();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket56 = new org.joda.time.format.DateTimeParserBucket(66528000000L, chronology35, locale52, (java.lang.Integer) 10, (-292275054));
        org.joda.time.DurationField durationField57 = chronology35.years();
        org.joda.time.DateTimeField dateTimeField58 = chronology35.era();
        dateTimeParserBucket23.saveField(dateTimeField58, 117);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField19 and durationField57", (durationField19.compareTo(durationField57) == 0) == durationField19.equals(durationField57));
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 100);
        java.lang.Integer int6 = dateTimeParserBucket5.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean8 = dateTimeParserBucket5.restoreState((java.lang.Object) dateTimeFieldType7);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket5.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        org.joda.time.DateTimeZone dateTimeZone11 = chronology9.getZone();
        org.joda.time.DurationField durationField12 = chronology9.months();
        org.joda.time.DateTimeField dateTimeField13 = chronology9.dayOfMonth();
        org.joda.time.DurationField durationField14 = chronology9.centuries();
        boolean boolean15 = dateTimeFieldType0.isSupported(chronology9);
        org.joda.time.DurationField durationField16 = chronology9.weekyears();
        org.joda.time.DateTimeField dateTimeField17 = chronology9.secondOfMinute();
        org.joda.time.DurationField durationField18 = chronology9.years();
        org.joda.time.DateTimeField dateTimeField19 = chronology9.centuryOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField16 and durationField18", (durationField16.compareTo(durationField18) == 0) == durationField16.equals(durationField18));
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        java.lang.Integer int7 = dateTimeParserBucket6.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean9 = dateTimeParserBucket6.restoreState((java.lang.Object) dateTimeFieldType8);
        org.joda.time.Chronology chronology10 = dateTimeParserBucket6.getChronology();
        org.joda.time.DurationField durationField11 = chronology10.years();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.Chronology chronology15 = null;
        java.util.Locale locale16 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket18 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology15, locale16, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket19 = new org.joda.time.format.DateTimeParserBucket(100L, chronology13, locale16);
        java.lang.String str20 = locale16.getScript();
        java.lang.String str22 = locale16.getExtension('u');
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket25 = new org.joda.time.format.DateTimeParserBucket(259200117L, chronology10, locale16, (java.lang.Integer) 100, (int) (byte) 1);
        org.joda.time.DurationField durationField26 = chronology10.centuries();
        java.util.Locale.Category category27 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale28 = java.util.Locale.GERMANY;
        java.lang.String str29 = locale28.getDisplayCountry();
        java.util.Locale.setDefault(category27, locale28);
        java.util.Locale locale31 = java.util.Locale.getDefault(category27);
        java.util.Locale locale32 = java.util.Locale.getDefault(category27);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket35 = new org.joda.time.format.DateTimeParserBucket(10L, chronology10, locale32, (java.lang.Integer) 100, 31);
        org.joda.time.Chronology chronology36 = chronology10.withUTC();
        org.joda.time.DateTimeField dateTimeField37 = chronology36.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField38 = chronology36.dayOfMonth();
        org.joda.time.DurationField durationField39 = chronology36.weekyears();
        org.joda.time.DateTimeField dateTimeField40 = chronology36.millisOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField11 and durationField39", (durationField11.compareTo(durationField39) == 0) == durationField11.equals(durationField39));
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 100);
        java.lang.Integer int5 = dateTimeParserBucket4.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean7 = dateTimeParserBucket4.restoreState((java.lang.Object) dateTimeFieldType6);
        org.joda.time.Chronology chronology8 = dateTimeParserBucket4.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeZone dateTimeZone10 = chronology8.getZone();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.yearOfCentury();
        org.joda.time.DurationField durationField12 = chronology8.years();
        org.joda.time.DateTimeField dateTimeField13 = chronology8.clockhourOfHalfday();
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = dateTimeField13.getType();
        java.lang.String str15 = dateTimeFieldType14.getName();
        org.joda.time.Chronology chronology18 = null;
        java.util.Locale locale19 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket21 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology18, locale19, (java.lang.Integer) 100);
        java.lang.Integer int22 = dateTimeParserBucket21.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean24 = dateTimeParserBucket21.restoreState((java.lang.Object) dateTimeFieldType23);
        org.joda.time.Chronology chronology25 = dateTimeParserBucket21.getChronology();
        org.joda.time.DurationField durationField26 = chronology25.days();
        org.joda.time.DurationField durationField27 = chronology25.millis();
        org.joda.time.Chronology chronology29 = null;
        java.util.Locale locale30 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket32 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology29, locale30, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket33 = new org.joda.time.format.DateTimeParserBucket(64713600009L, chronology25, locale30);
        org.joda.time.Chronology chronology35 = null;
        java.util.Locale locale36 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket38 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology35, locale36, (java.lang.Integer) 100);
        java.lang.Integer int39 = dateTimeParserBucket38.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType40 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean41 = dateTimeParserBucket38.restoreState((java.lang.Object) dateTimeFieldType40);
        org.joda.time.Chronology chronology42 = dateTimeParserBucket38.getChronology();
        org.joda.time.DurationField durationField43 = chronology42.days();
        org.joda.time.DurationField durationField44 = chronology42.hours();
        org.joda.time.DateTimeZone dateTimeZone45 = chronology42.getZone();
        java.util.TimeZone timeZone46 = dateTimeZone45.toTimeZone();
        org.joda.time.Chronology chronology47 = chronology25.withZone(dateTimeZone45);
        java.lang.String str48 = chronology25.toString();
        boolean boolean49 = dateTimeFieldType14.isSupported(chronology25);
        org.joda.time.DateTimeFieldType dateTimeFieldType50 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.Chronology chronology52 = null;
        java.util.Locale locale53 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket55 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology52, locale53, (java.lang.Integer) 100);
        java.lang.Integer int56 = dateTimeParserBucket55.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType57 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean58 = dateTimeParserBucket55.restoreState((java.lang.Object) dateTimeFieldType57);
        org.joda.time.Chronology chronology59 = dateTimeParserBucket55.getChronology();
        org.joda.time.DurationField durationField60 = chronology59.days();
        org.joda.time.DateTimeZone dateTimeZone62 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.ReadableInstant readableInstant63 = null;
        int int64 = dateTimeZone62.getOffset(readableInstant63);
        org.joda.time.ReadableInstant readableInstant65 = null;
        int int66 = dateTimeZone62.getOffset(readableInstant65);
        org.joda.time.Chronology chronology69 = null;
        java.util.Locale locale70 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket72 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology69, locale70, (java.lang.Integer) 100);
        java.lang.String str73 = dateTimeZone62.getShortName(10L, locale70);
        org.joda.time.Chronology chronology76 = null;
        org.joda.time.Chronology chronology78 = null;
        java.util.Locale locale79 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket81 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology78, locale79, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket82 = new org.joda.time.format.DateTimeParserBucket(100L, chronology76, locale79);
        java.lang.String str83 = locale79.getScript();
        java.lang.String str84 = locale79.getISO3Country();
        java.lang.String str85 = locale79.getDisplayScript();
        java.lang.String str86 = dateTimeZone62.getName((long) 53, locale79);
        org.joda.time.Chronology chronology87 = chronology59.withZone(dateTimeZone62);
        org.joda.time.Chronology chronology88 = chronology87.withUTC();
        org.joda.time.DateTimeField dateTimeField89 = dateTimeFieldType50.getField(chronology87);
        org.joda.time.DurationField durationField90 = chronology87.weekyears();
        org.joda.time.DateTimeField dateTimeField91 = dateTimeFieldType14.getField(chronology87);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField12 and durationField90", (durationField12.compareTo(durationField90) == 0) == durationField12.equals(durationField90));
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 100);
        java.lang.Integer int5 = dateTimeParserBucket4.getPivotYear();
        int int6 = dateTimeParserBucket4.getOffset();
        java.util.Locale locale7 = dateTimeParserBucket4.getLocale();
        java.lang.Object obj8 = dateTimeParserBucket4.saveState();
        org.joda.time.Chronology chronology10 = null;
        java.util.Locale locale11 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology10, locale11, (java.lang.Integer) 100);
        java.lang.Integer int14 = dateTimeParserBucket13.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean16 = dateTimeParserBucket13.restoreState((java.lang.Object) dateTimeFieldType15);
        org.joda.time.Chronology chronology17 = dateTimeParserBucket13.getChronology();
        org.joda.time.DurationField durationField18 = chronology17.days();
        org.joda.time.DateTimeZone dateTimeZone19 = chronology17.getZone();
        org.joda.time.DateTimeField dateTimeField20 = chronology17.yearOfCentury();
        java.lang.String str21 = chronology17.toString();
        org.joda.time.DurationField durationField22 = chronology17.eras();
        boolean boolean23 = dateTimeParserBucket4.restoreState((java.lang.Object) durationField22);
        long long25 = dateTimeParserBucket4.computeMillis(true);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField18 and durationField22", Math.signum(durationField18.compareTo(durationField22)) == -Math.signum(durationField22.compareTo(durationField18)));
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 100);
        java.lang.Integer int6 = dateTimeParserBucket5.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean8 = dateTimeParserBucket5.restoreState((java.lang.Object) dateTimeFieldType7);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket5.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        org.joda.time.DateTimeField dateTimeField11 = dateTimeFieldType0.getField(chronology9);
        org.joda.time.DateTimeField dateTimeField12 = chronology9.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField13 = chronology9.weekOfWeekyear();
        java.lang.String str14 = chronology9.toString();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        long long18 = dateTimeZone16.convertUTCToLocal((long) (short) -1);
        org.joda.time.Chronology chronology20 = null;
        java.util.Locale locale21 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket23 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology20, locale21, (java.lang.Integer) 100);
        java.lang.Integer int24 = dateTimeParserBucket23.getPivotYear();
        org.joda.time.DateTimeField dateTimeField25 = null;
        dateTimeParserBucket23.saveField(dateTimeField25, (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone28 = dateTimeParserBucket23.getZone();
        long long30 = dateTimeZone16.getMillisKeepLocal(dateTimeZone28, 97L);
        java.lang.String str32 = dateTimeZone16.getShortName(0L);
        java.util.TimeZone timeZone34 = null;
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forTimeZone(timeZone34);
        java.util.Locale locale40 = new java.util.Locale("weekOfWeekyear", "UTC", "+00:00");
        boolean boolean41 = locale40.hasExtensions();
        org.joda.time.Chronology chronology43 = null;
        java.util.Locale locale44 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket46 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology43, locale44, (java.lang.Integer) 100);
        java.lang.String str47 = locale40.getDisplayCountry(locale44);
        java.lang.String str48 = dateTimeZone35.getShortName((long) (short) 1, locale44);
        java.lang.String str49 = dateTimeZone16.getName((long) 'u', locale44);
        org.joda.time.Chronology chronology50 = chronology9.withZone(dateTimeZone16);
        org.joda.time.DurationField durationField51 = chronology50.seconds();
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone53);
        long long57 = dateTimeZone53.adjustOffset(604801053L, true);
        org.joda.time.Chronology chronology58 = chronology50.withZone(dateTimeZone53);
        java.lang.String str59 = chronology58.toString();
        org.joda.time.DurationField durationField60 = chronology58.seconds();
        org.joda.time.DateTimeField dateTimeField61 = chronology58.yearOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField51 and durationField60", (durationField51.compareTo(durationField60) == 0) == durationField51.equals(durationField60));
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 100);
        java.lang.Integer int6 = dateTimeParserBucket5.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean8 = dateTimeParserBucket5.restoreState((java.lang.Object) dateTimeFieldType7);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket5.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.ReadableInstant readableInstant13 = null;
        int int14 = dateTimeZone12.getOffset(readableInstant13);
        org.joda.time.ReadableInstant readableInstant15 = null;
        int int16 = dateTimeZone12.getOffset(readableInstant15);
        org.joda.time.Chronology chronology19 = null;
        java.util.Locale locale20 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket22 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology19, locale20, (java.lang.Integer) 100);
        java.lang.String str23 = dateTimeZone12.getShortName(10L, locale20);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.Chronology chronology28 = null;
        java.util.Locale locale29 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket31 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology28, locale29, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket32 = new org.joda.time.format.DateTimeParserBucket(100L, chronology26, locale29);
        java.lang.String str33 = locale29.getScript();
        java.lang.String str34 = locale29.getISO3Country();
        java.lang.String str35 = locale29.getDisplayScript();
        java.lang.String str36 = dateTimeZone12.getName((long) 53, locale29);
        org.joda.time.Chronology chronology37 = chronology9.withZone(dateTimeZone12);
        org.joda.time.Chronology chronology38 = chronology37.withUTC();
        org.joda.time.DurationField durationField39 = chronology38.seconds();
        java.util.Locale locale40 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale.Category category41 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale42 = java.util.Locale.getDefault(category41);
        java.util.Locale locale43 = java.util.Locale.GERMANY;
        java.util.Locale.setDefault(category41, locale43);
        java.util.Locale locale45 = java.util.Locale.getDefault(category41);
        java.util.Locale locale46 = java.util.Locale.getDefault(category41);
        java.lang.String str47 = locale40.getDisplayLanguage(locale46);
        java.lang.String str48 = locale46.getCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket49 = new org.joda.time.format.DateTimeParserBucket((long) 292278993, chronology38, locale46);
        org.joda.time.DurationField durationField50 = chronology38.weeks();
        org.joda.time.DurationField durationField51 = chronology38.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField51, durationField10, and durationField39", !(durationField51.compareTo(durationField10) == 0) || (Math.signum(durationField51.compareTo(durationField39)) == Math.signum(durationField10.compareTo(durationField39))));
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 100);
        java.lang.Integer int5 = dateTimeParserBucket4.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean7 = dateTimeParserBucket4.restoreState((java.lang.Object) dateTimeFieldType6);
        org.joda.time.Chronology chronology8 = dateTimeParserBucket4.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DurationField durationField10 = chronology8.millis();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.dayOfMonth();
        org.joda.time.DurationField durationField12 = chronology8.weeks();
        org.joda.time.DateTimeField dateTimeField13 = chronology8.year();
        org.joda.time.DateTimeField dateTimeField14 = chronology8.halfdayOfDay();
        org.joda.time.DurationField durationField15 = chronology8.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField15, durationField9, and durationField10", !(durationField15.compareTo(durationField9) == 0) || (Math.signum(durationField15.compareTo(durationField10)) == Math.signum(durationField9.compareTo(durationField10))));
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 100);
        java.lang.Integer int6 = dateTimeParserBucket5.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean8 = dateTimeParserBucket5.restoreState((java.lang.Object) dateTimeFieldType7);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket5.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        org.joda.time.DateTimeField dateTimeField11 = dateTimeFieldType0.getField(chronology9);
        org.joda.time.DateTimeField dateTimeField12 = chronology9.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField13 = chronology9.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField14 = chronology9.yearOfEra();
        org.joda.time.DateTimeField dateTimeField15 = chronology9.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField16 = chronology9.dayOfYear();
        org.joda.time.DateTimeField dateTimeField17 = chronology9.hourOfDay();
        org.joda.time.DurationField durationField18 = chronology9.centuries();
        org.joda.time.DurationField durationField19 = chronology9.weekyears();
        org.joda.time.DateTimeField dateTimeField20 = chronology9.weekyear();
        org.joda.time.DateTimeField dateTimeField21 = chronology9.hourOfHalfday();
        org.joda.time.DurationField durationField22 = chronology9.minutes();
        org.joda.time.DateTimeField dateTimeField23 = chronology9.year();
        org.joda.time.DurationField durationField24 = dateTimeField23.getDurationField();
        long long26 = dateTimeField23.roundHalfCeiling(345599100L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField19 and durationField24", (durationField19.compareTo(durationField24) == 0) == durationField19.equals(durationField24));
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        org.joda.time.Chronology chronology4 = null;
        java.util.Locale locale5 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology4, locale5, (java.lang.Integer) 100);
        java.lang.Integer int8 = dateTimeParserBucket7.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean10 = dateTimeParserBucket7.restoreState((java.lang.Object) dateTimeFieldType9);
        org.joda.time.Chronology chronology11 = dateTimeParserBucket7.getChronology();
        org.joda.time.DurationField durationField12 = chronology11.years();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.Chronology chronology16 = null;
        java.util.Locale locale17 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket19 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology16, locale17, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket20 = new org.joda.time.format.DateTimeParserBucket(100L, chronology14, locale17);
        java.lang.String str21 = locale17.getScript();
        java.lang.String str23 = locale17.getExtension('u');
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket26 = new org.joda.time.format.DateTimeParserBucket(259200117L, chronology11, locale17, (java.lang.Integer) 100, (int) (byte) 1);
        org.joda.time.DurationField durationField27 = chronology11.centuries();
        java.util.Locale.Category category28 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale29 = java.util.Locale.GERMANY;
        java.lang.String str30 = locale29.getDisplayCountry();
        java.util.Locale.setDefault(category28, locale29);
        java.util.Locale locale32 = java.util.Locale.getDefault(category28);
        java.util.Locale locale33 = java.util.Locale.getDefault(category28);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket36 = new org.joda.time.format.DateTimeParserBucket(10L, chronology11, locale33, (java.lang.Integer) 100, 31);
        org.joda.time.Chronology chronology37 = chronology11.withUTC();
        org.joda.time.DateTimeField dateTimeField38 = chronology11.halfdayOfDay();
        java.util.Locale.Builder builder39 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder40 = builder39.clear();
        java.util.Locale locale41 = builder40.build();
        java.util.Locale locale42 = locale41.stripExtensions();
        java.lang.String str43 = locale42.getCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket45 = new org.joda.time.format.DateTimeParserBucket(259200048L, chronology11, locale42, (java.lang.Integer) 365);
        org.joda.time.DurationField durationField46 = chronology11.weekyears();
        org.joda.time.DurationField durationField47 = chronology11.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField12 and durationField46", (durationField12.compareTo(durationField46) == 0) == durationField12.equals(durationField46));
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 100);
        java.lang.Integer int5 = dateTimeParserBucket4.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean7 = dateTimeParserBucket4.restoreState((java.lang.Object) dateTimeFieldType6);
        org.joda.time.Chronology chronology8 = dateTimeParserBucket4.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeZone dateTimeZone10 = chronology8.getZone();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.yearOfCentury();
        org.joda.time.DurationField durationField12 = chronology8.years();
        java.lang.String str13 = chronology8.toString();
        org.joda.time.DurationField durationField14 = chronology8.months();
        org.joda.time.DateTimeZone dateTimeZone15 = chronology8.getZone();
        org.joda.time.DateTimeField dateTimeField16 = chronology8.dayOfWeek();
        org.joda.time.DurationField durationField17 = chronology8.months();
        org.joda.time.DurationField durationField18 = chronology8.weekyears();
        org.joda.time.DateTimeField dateTimeField19 = chronology8.minuteOfHour();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField12 and durationField18", (durationField12.compareTo(durationField18) == 0) == durationField12.equals(durationField18));
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 100);
        java.lang.Integer int6 = dateTimeParserBucket5.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean8 = dateTimeParserBucket5.restoreState((java.lang.Object) dateTimeFieldType7);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket5.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        org.joda.time.DateTimeField dateTimeField11 = dateTimeFieldType0.getField(chronology9);
        org.joda.time.DateTimeField dateTimeField12 = chronology9.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField13 = chronology9.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField14 = chronology9.yearOfEra();
        org.joda.time.DateTimeField dateTimeField15 = chronology9.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField16 = chronology9.dayOfYear();
        org.joda.time.DateTimeField dateTimeField17 = chronology9.hourOfDay();
        org.joda.time.DurationField durationField18 = chronology9.centuries();
        org.joda.time.DurationField durationField19 = chronology9.weekyears();
        org.joda.time.DateTimeField dateTimeField20 = chronology9.weekyear();
        org.joda.time.DurationField durationField21 = chronology9.centuries();
        org.joda.time.DurationField durationField22 = chronology9.weeks();
        org.joda.time.DateTimeField dateTimeField23 = chronology9.era();
        org.joda.time.Chronology chronology24 = chronology9.withUTC();
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.Chronology chronology28 = null;
        java.util.Locale locale29 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket31 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology28, locale29, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket32 = new org.joda.time.format.DateTimeParserBucket(100L, chronology26, locale29);
        org.joda.time.DateTimeZone dateTimeZone33 = dateTimeParserBucket32.getZone();
        int int35 = dateTimeZone33.getOffsetFromLocal((long) (byte) 1);
        boolean boolean36 = dateTimeZone33.isFixed();
        java.lang.String str38 = dateTimeZone33.getShortName((long) 'u');
        org.joda.time.Chronology chronology40 = null;
        java.util.Locale locale41 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket43 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology40, locale41, (java.lang.Integer) 100);
        java.lang.Integer int44 = dateTimeParserBucket43.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType45 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean46 = dateTimeParserBucket43.restoreState((java.lang.Object) dateTimeFieldType45);
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.DateTimeField dateTimeField48 = dateTimeFieldType45.getField(chronology47);
        long long51 = dateTimeField48.getDifferenceAsLong((long) ' ', (long) 1);
        org.joda.time.ReadablePartial readablePartial52 = null;
        java.util.Locale locale54 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str55 = dateTimeField48.getAsShortText(readablePartial52, (int) ' ', locale54);
        org.joda.time.ReadablePartial readablePartial56 = null;
        int int57 = dateTimeField48.getMinimumValue(readablePartial56);
        java.lang.String str59 = dateTimeField48.getAsText((long) (byte) 0);
        int int61 = dateTimeField48.getMaximumValue((long) (-1));
        boolean boolean62 = dateTimeZone33.equals((java.lang.Object) (-1));
        java.lang.String str64 = dateTimeZone33.getName(1L);
        org.joda.time.ReadableInstant readableInstant65 = null;
        int int66 = dateTimeZone33.getOffset(readableInstant65);
        long long70 = dateTimeZone33.convertLocalToUTC(24796800010L, true, (long) 101537);
        org.joda.time.Chronology chronology71 = chronology9.withZone(dateTimeZone33);
        org.joda.time.DurationField durationField72 = chronology9.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField72, durationField10, and durationField18", !(durationField72.compareTo(durationField10) == 0) || (Math.signum(durationField72.compareTo(durationField18)) == Math.signum(durationField10.compareTo(durationField18))));
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 100);
        java.lang.Integer int5 = dateTimeParserBucket4.getPivotYear();
        int int6 = dateTimeParserBucket4.getOffset();
        java.util.Locale locale7 = dateTimeParserBucket4.getLocale();
        java.lang.Object obj8 = dateTimeParserBucket4.saveState();
        org.joda.time.Chronology chronology10 = null;
        java.util.Locale locale11 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology10, locale11, (java.lang.Integer) 100);
        java.lang.Integer int14 = dateTimeParserBucket13.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean16 = dateTimeParserBucket13.restoreState((java.lang.Object) dateTimeFieldType15);
        org.joda.time.Chronology chronology17 = dateTimeParserBucket13.getChronology();
        org.joda.time.DurationField durationField18 = chronology17.days();
        org.joda.time.DateTimeZone dateTimeZone19 = chronology17.getZone();
        org.joda.time.DateTimeField dateTimeField20 = chronology17.yearOfCentury();
        java.lang.String str21 = chronology17.toString();
        org.joda.time.DurationField durationField22 = chronology17.eras();
        boolean boolean23 = dateTimeParserBucket4.restoreState((java.lang.Object) durationField22);
        long long25 = dateTimeParserBucket4.computeMillis(false);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField18 and durationField22", Math.signum(durationField18.compareTo(durationField22)) == -Math.signum(durationField22.compareTo(durationField18)));
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 100);
        java.lang.Integer int5 = dateTimeParserBucket4.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean7 = dateTimeParserBucket4.restoreState((java.lang.Object) dateTimeFieldType6);
        org.joda.time.Chronology chronology8 = dateTimeParserBucket4.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeZone dateTimeZone10 = chronology8.getZone();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.yearOfCentury();
        org.joda.time.DurationField durationField12 = chronology8.years();
        org.joda.time.DateTimeField dateTimeField13 = chronology8.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField14 = chronology8.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone15 = chronology8.getZone();
        org.joda.time.DurationField durationField16 = chronology8.millis();
        org.joda.time.DateTimeField dateTimeField17 = chronology8.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField18 = chronology8.weekyear();
        org.joda.time.DurationField durationField19 = chronology8.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField19, durationField9, and durationField12", !(durationField19.compareTo(durationField9) == 0) || (Math.signum(durationField19.compareTo(durationField12)) == Math.signum(durationField9.compareTo(durationField12))));
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 100);
        java.lang.Integer int5 = dateTimeParserBucket4.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean7 = dateTimeParserBucket4.restoreState((java.lang.Object) dateTimeFieldType6);
        org.joda.time.Chronology chronology8 = dateTimeParserBucket4.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeZone dateTimeZone10 = chronology8.getZone();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.monthOfYear();
        org.joda.time.DurationField durationField12 = chronology8.centuries();
        org.joda.time.DurationField durationField13 = chronology8.halfdays();
        org.joda.time.DateTimeField dateTimeField14 = chronology8.minuteOfHour();
        org.joda.time.DurationField durationField15 = chronology8.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField15, durationField9, and durationField12", !(durationField15.compareTo(durationField9) == 0) || (Math.signum(durationField15.compareTo(durationField12)) == Math.signum(durationField9.compareTo(durationField12))));
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 100);
        java.lang.Integer int6 = dateTimeParserBucket5.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean8 = dateTimeParserBucket5.restoreState((java.lang.Object) dateTimeFieldType7);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket5.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        org.joda.time.DateTimeField dateTimeField11 = dateTimeFieldType0.getField(chronology9);
        org.joda.time.DateTimeField dateTimeField12 = chronology9.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        long long16 = dateTimeZone14.convertUTCToLocal((long) (short) -1);
        org.joda.time.Chronology chronology18 = null;
        java.util.Locale locale19 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket21 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology18, locale19, (java.lang.Integer) 100);
        java.lang.Integer int22 = dateTimeParserBucket21.getPivotYear();
        org.joda.time.DateTimeField dateTimeField23 = null;
        dateTimeParserBucket21.saveField(dateTimeField23, (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone26 = dateTimeParserBucket21.getZone();
        long long28 = dateTimeZone14.getMillisKeepLocal(dateTimeZone26, 97L);
        int int30 = dateTimeZone14.getStandardOffset(1L);
        org.joda.time.Chronology chronology31 = chronology9.withZone(dateTimeZone14);
        org.joda.time.DurationField durationField32 = chronology31.millis();
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        long long36 = chronology31.add(readablePeriod33, (-62104060800001L), 2);
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str39 = dateTimeZone38.getID();
        int int41 = dateTimeZone38.getOffsetFromLocal((long) 100);
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.Chronology chronology46 = null;
        java.util.Locale locale47 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket49 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology46, locale47, (java.lang.Integer) 100);
        java.lang.Integer int50 = dateTimeParserBucket49.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType51 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean52 = dateTimeParserBucket49.restoreState((java.lang.Object) dateTimeFieldType51);
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.DateTimeField dateTimeField54 = dateTimeFieldType51.getField(chronology53);
        java.util.Locale locale56 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet57 = locale56.getUnicodeLocaleAttributes();
        org.joda.time.Chronology chronology59 = null;
        java.util.Locale locale60 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket62 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology59, locale60, (java.lang.Integer) 100);
        java.lang.String str63 = locale56.getDisplayScript(locale60);
        java.lang.String str64 = dateTimeField54.getAsShortText(10, locale56);
        java.util.Locale.setDefault(locale56);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket66 = new org.joda.time.format.DateTimeParserBucket((-259200000L), chronology44, locale56);
        java.lang.String str67 = dateTimeZone38.getShortName(97L, locale56);
        long long71 = dateTimeZone38.convertLocalToUTC((long) (-1), false, 60480000010L);
        boolean boolean72 = dateTimeZone38.isFixed();
        org.joda.time.Chronology chronology73 = chronology31.withZone(dateTimeZone38);
        org.joda.time.DateTimeField dateTimeField74 = chronology31.clockhourOfDay();
        org.joda.time.DurationField durationField75 = chronology31.centuries();
        org.joda.time.DateTimeField dateTimeField76 = chronology31.dayOfWeek();
        org.joda.time.DurationField durationField77 = chronology31.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField77, durationField10, and durationField32", !(durationField77.compareTo(durationField10) == 0) || (Math.signum(durationField77.compareTo(durationField32)) == Math.signum(durationField10.compareTo(durationField32))));
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        org.joda.time.Chronology chronology4 = null;
        java.util.Locale locale5 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology4, locale5, (java.lang.Integer) 100);
        java.lang.Integer int8 = dateTimeParserBucket7.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean10 = dateTimeParserBucket7.restoreState((java.lang.Object) dateTimeFieldType9);
        org.joda.time.Chronology chronology11 = dateTimeParserBucket7.getChronology();
        org.joda.time.DurationField durationField12 = chronology11.years();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.Chronology chronology16 = null;
        java.util.Locale locale17 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket19 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology16, locale17, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket20 = new org.joda.time.format.DateTimeParserBucket(100L, chronology14, locale17);
        java.lang.String str21 = locale17.getScript();
        java.lang.String str23 = locale17.getExtension('u');
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket26 = new org.joda.time.format.DateTimeParserBucket(259200117L, chronology11, locale17, (java.lang.Integer) 100, (int) (byte) 1);
        org.joda.time.DurationField durationField27 = chronology11.centuries();
        java.util.Locale locale29 = java.util.Locale.forLanguageTag("12");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket31 = new org.joda.time.format.DateTimeParserBucket(0L, chronology11, locale29, (java.lang.Integer) 0);
        org.joda.time.DateTimeField dateTimeField32 = chronology11.millisOfSecond();
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        long long36 = chronology11.add(readablePeriod33, (long) (-8), 100);
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.Chronology chronology38 = chronology11.withZone(dateTimeZone37);
        org.joda.time.Chronology chronology42 = null;
        java.util.Locale locale43 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket45 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology42, locale43, (java.lang.Integer) 100);
        java.lang.Integer int46 = dateTimeParserBucket45.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType47 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean48 = dateTimeParserBucket45.restoreState((java.lang.Object) dateTimeFieldType47);
        org.joda.time.Chronology chronology49 = dateTimeParserBucket45.getChronology();
        org.joda.time.DurationField durationField50 = chronology49.days();
        org.joda.time.DateTimeZone dateTimeZone51 = chronology49.getZone();
        org.joda.time.Chronology chronology53 = null;
        java.util.Locale locale54 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket56 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology53, locale54, (java.lang.Integer) 100);
        java.lang.String str57 = locale54.getCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket60 = new org.joda.time.format.DateTimeParserBucket(0L, chronology49, locale54, (java.lang.Integer) 100, (int) (byte) 1);
        org.joda.time.DurationField durationField61 = chronology49.weeks();
        org.joda.time.DurationField durationField62 = chronology49.days();
        org.joda.time.DateTimeFieldType dateTimeFieldType63 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.Chronology chronology65 = null;
        java.util.Locale locale66 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket68 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology65, locale66, (java.lang.Integer) 100);
        java.lang.Integer int69 = dateTimeParserBucket68.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType70 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean71 = dateTimeParserBucket68.restoreState((java.lang.Object) dateTimeFieldType70);
        org.joda.time.Chronology chronology72 = dateTimeParserBucket68.getChronology();
        org.joda.time.DurationField durationField73 = chronology72.days();
        org.joda.time.DateTimeField dateTimeField74 = dateTimeFieldType63.getField(chronology72);
        org.joda.time.DurationField durationField75 = chronology72.minutes();
        org.joda.time.DateTimeField dateTimeField76 = chronology72.hourOfDay();
        long long79 = dateTimeField76.add(3124396800014L, (long) (short) 1);
        org.joda.time.ReadablePartial readablePartial80 = null;
        java.util.Locale locale83 = new java.util.Locale("\u30a4\u30bf\u30ea\u30a2");
        java.lang.String str84 = dateTimeField76.getAsShortText(readablePartial80, (-8), locale83);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket85 = new org.joda.time.format.DateTimeParserBucket(21427200000L, chronology49, locale83);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket88 = new org.joda.time.format.DateTimeParserBucket(129600000L, chronology11, locale83, (java.lang.Integer) 4492738, (int) ' ');
        org.joda.time.DurationField durationField89 = chronology11.weekyears();
        org.joda.time.DateTimeField dateTimeField90 = chronology11.secondOfMinute();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField12 and durationField89", (durationField12.compareTo(durationField89) == 0) == durationField12.equals(durationField89));
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        org.joda.time.Chronology chronology4 = null;
        java.util.Locale locale5 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology4, locale5, (java.lang.Integer) 100);
        java.lang.Integer int8 = dateTimeParserBucket7.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean10 = dateTimeParserBucket7.restoreState((java.lang.Object) dateTimeFieldType9);
        org.joda.time.Chronology chronology11 = dateTimeParserBucket7.getChronology();
        org.joda.time.DurationField durationField12 = chronology11.years();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.Chronology chronology16 = null;
        java.util.Locale locale17 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket19 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology16, locale17, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket20 = new org.joda.time.format.DateTimeParserBucket(100L, chronology14, locale17);
        java.lang.String str21 = locale17.getScript();
        java.lang.String str23 = locale17.getExtension('u');
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket26 = new org.joda.time.format.DateTimeParserBucket(259200117L, chronology11, locale17, (java.lang.Integer) 100, (int) (byte) 1);
        org.joda.time.DurationField durationField27 = chronology11.centuries();
        java.util.Locale.Category category28 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale29 = java.util.Locale.GERMANY;
        java.lang.String str30 = locale29.getDisplayCountry();
        java.util.Locale.setDefault(category28, locale29);
        java.util.Locale locale32 = java.util.Locale.getDefault(category28);
        java.util.Locale locale33 = java.util.Locale.getDefault(category28);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket36 = new org.joda.time.format.DateTimeParserBucket(10L, chronology11, locale33, (java.lang.Integer) 100, 31);
        org.joda.time.Chronology chronology37 = chronology11.withUTC();
        java.util.Locale.Builder builder38 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder39 = builder38.clearExtensions();
        java.util.Locale locale40 = builder39.build();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket41 = new org.joda.time.format.DateTimeParserBucket(6048000035L, chronology37, locale40);
        org.joda.time.Chronology chronology42 = dateTimeParserBucket41.getChronology();
        org.joda.time.DateTimeField dateTimeField43 = chronology42.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField44 = chronology42.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField45 = chronology42.secondOfDay();
        org.joda.time.DurationField durationField46 = chronology42.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField46, durationField12, and durationField27", !(durationField46.compareTo(durationField12) == 0) || (Math.signum(durationField46.compareTo(durationField27)) == Math.signum(durationField12.compareTo(durationField27))));
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 100);
        java.lang.Integer int6 = dateTimeParserBucket5.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean8 = dateTimeParserBucket5.restoreState((java.lang.Object) dateTimeFieldType7);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket5.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        org.joda.time.DurationField durationField11 = chronology9.millis();
        org.joda.time.Chronology chronology13 = null;
        java.util.Locale locale14 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology13, locale14, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket(64713600009L, chronology9, locale14);
        org.joda.time.DateTimeField dateTimeField18 = chronology9.year();
        org.joda.time.DurationField durationField19 = chronology9.halfdays();
        org.joda.time.DurationField durationField20 = chronology9.days();
        org.joda.time.DurationField durationField21 = chronology9.years();
        org.joda.time.DateTimeField dateTimeField22 = chronology9.clockhourOfHalfday();
        long long26 = chronology9.add(9999L, 446399991L, 0);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.Chronology chronology30 = null;
        java.util.Locale locale31 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket33 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology30, locale31, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket34 = new org.joda.time.format.DateTimeParserBucket(100L, chronology28, locale31);
        org.joda.time.Chronology chronology35 = dateTimeParserBucket34.getChronology();
        org.joda.time.DateTimeField dateTimeField36 = chronology35.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField37 = chronology35.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone38 = chronology35.getZone();
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.forOffsetMillis(1497);
        long long42 = dateTimeZone38.getMillisKeepLocal(dateTimeZone40, 28166400000L);
        org.joda.time.Chronology chronology43 = chronology9.withZone(dateTimeZone40);
        java.lang.String str44 = chronology9.toString();
        org.joda.time.DurationField durationField45 = chronology9.weekyears();
        org.joda.time.DateTimeField dateTimeField46 = chronology9.centuryOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField21 and durationField45", (durationField21.compareTo(durationField45) == 0) == durationField21.equals(durationField45));
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        java.lang.Integer int7 = dateTimeParserBucket6.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean9 = dateTimeParserBucket6.restoreState((java.lang.Object) dateTimeFieldType8);
        org.joda.time.Chronology chronology10 = dateTimeParserBucket6.getChronology();
        org.joda.time.DurationField durationField11 = chronology10.years();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.Chronology chronology15 = null;
        java.util.Locale locale16 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket18 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology15, locale16, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket19 = new org.joda.time.format.DateTimeParserBucket(100L, chronology13, locale16);
        java.lang.String str20 = locale16.getScript();
        java.lang.String str22 = locale16.getExtension('u');
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket25 = new org.joda.time.format.DateTimeParserBucket(259200117L, chronology10, locale16, (java.lang.Integer) 100, (int) (byte) 1);
        org.joda.time.DurationField durationField26 = chronology10.centuries();
        java.util.Locale locale28 = java.util.Locale.forLanguageTag("12");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket30 = new org.joda.time.format.DateTimeParserBucket(0L, chronology10, locale28, (java.lang.Integer) 0);
        org.joda.time.DateTimeField dateTimeField31 = chronology10.millisOfSecond();
        org.joda.time.ReadablePeriod readablePeriod32 = null;
        long long35 = chronology10.add(readablePeriod32, (long) (-8), 100);
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.Chronology chronology37 = chronology10.withZone(dateTimeZone36);
        org.joda.time.DurationField durationField38 = chronology37.seconds();
        org.joda.time.DurationField durationField39 = chronology37.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField39, durationField11, and durationField26", !(durationField39.compareTo(durationField11) == 0) || (Math.signum(durationField39.compareTo(durationField26)) == Math.signum(durationField11.compareTo(durationField26))));
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 100);
        java.lang.Integer int5 = dateTimeParserBucket4.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean7 = dateTimeParserBucket4.restoreState((java.lang.Object) dateTimeFieldType6);
        org.joda.time.Chronology chronology8 = dateTimeParserBucket4.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DurationField durationField10 = chronology8.hours();
        org.joda.time.DateTimeZone dateTimeZone11 = chronology8.getZone();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField13 = chronology8.dayOfYear();
        org.joda.time.DateTimeField dateTimeField14 = chronology8.weekyear();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHours((-434));
        java.lang.String str17 = dateTimeZone16.toString();
        int int19 = dateTimeZone16.getOffsetFromLocal((long) 2);
        boolean boolean21 = dateTimeZone16.isStandardOffset(0L);
        long long25 = dateTimeZone16.convertLocalToUTC((-292260000L), true, 3084498489600000L);
        org.joda.time.Chronology chronology26 = chronology8.withZone(dateTimeZone16);
        org.joda.time.DateTimeField dateTimeField27 = chronology26.weekyear();
        org.joda.time.Chronology chronology28 = chronology26.withUTC();
        org.joda.time.DurationField durationField29 = chronology28.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField29, durationField9, and durationField10", !(durationField29.compareTo(durationField9) == 0) || (Math.signum(durationField29.compareTo(durationField10)) == Math.signum(durationField9.compareTo(durationField10))));
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        java.lang.Integer int7 = dateTimeParserBucket6.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean9 = dateTimeParserBucket6.restoreState((java.lang.Object) dateTimeFieldType8);
        org.joda.time.Chronology chronology10 = dateTimeParserBucket6.getChronology();
        org.joda.time.DurationField durationField11 = chronology10.days();
        org.joda.time.DurationField durationField12 = chronology10.hours();
        org.joda.time.DateTimeField dateTimeField13 = chronology10.secondOfMinute();
        org.joda.time.DurationField durationField14 = chronology10.days();
        java.util.Locale locale15 = java.util.Locale.getDefault();
        java.lang.String str16 = locale15.getISO3Country();
        java.lang.String str17 = locale15.getISO3Language();
        java.util.Locale locale18 = java.util.Locale.getDefault();
        java.lang.String str19 = locale15.getDisplayVariant(locale18);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket22 = new org.joda.time.format.DateTimeParserBucket(0L, chronology10, locale15, (java.lang.Integer) 31, (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField23 = chronology10.hourOfDay();
        org.joda.time.Chronology chronology25 = null;
        java.util.Locale locale26 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket28 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology25, locale26, (java.lang.Integer) 100);
        java.lang.Integer int29 = dateTimeParserBucket28.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean31 = dateTimeParserBucket28.restoreState((java.lang.Object) dateTimeFieldType30);
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.DateTimeField dateTimeField33 = dateTimeFieldType30.getField(chronology32);
        long long35 = dateTimeField33.roundHalfEven(1L);
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.Chronology chronology40 = null;
        java.util.Locale locale41 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket43 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology40, locale41, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket44 = new org.joda.time.format.DateTimeParserBucket(100L, chronology38, locale41);
        java.lang.String str45 = dateTimeField33.getAsText((long) (short) 0, locale41);
        java.util.Locale locale47 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str48 = dateTimeField33.getAsShortText((long) (byte) -1, locale47);
        java.util.Locale locale49 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str51 = locale49.getUnicodeLocaleType("35");
        java.lang.String str52 = locale47.getDisplayCountry(locale49);
        java.lang.String str53 = locale49.getScript();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket56 = new org.joda.time.format.DateTimeParserBucket(262799566L, chronology10, locale49, (java.lang.Integer) 34, 18874799);
        org.joda.time.DurationField durationField57 = chronology10.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField57, durationField11, and durationField12", !(durationField57.compareTo(durationField11) == 0) || (Math.signum(durationField57.compareTo(durationField12)) == Math.signum(durationField11.compareTo(durationField12))));
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 100);
        java.lang.Integer int6 = dateTimeParserBucket5.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean8 = dateTimeParserBucket5.restoreState((java.lang.Object) dateTimeFieldType7);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket5.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        org.joda.time.DateTimeField dateTimeField11 = dateTimeFieldType0.getField(chronology9);
        org.joda.time.DateTimeField dateTimeField12 = chronology9.dayOfMonth();
        org.joda.time.DurationField durationField13 = chronology9.seconds();
        org.joda.time.DateTimeField dateTimeField14 = chronology9.millisOfDay();
        org.joda.time.DurationField durationField15 = chronology9.halfdays();
        org.joda.time.DurationField durationField16 = chronology9.days();
        org.joda.time.DurationField durationField17 = chronology9.days();
        org.joda.time.DateTimeField dateTimeField18 = chronology9.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField19 = chronology9.minuteOfDay();
        long long23 = chronology9.add(130032010L, 2415601210L, 11);
        org.joda.time.DateTimeField dateTimeField24 = chronology9.dayOfWeek();
        org.joda.time.DurationField durationField25 = chronology9.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField25, durationField10, and durationField13", !(durationField25.compareTo(durationField10) == 0) || (Math.signum(durationField25.compareTo(durationField13)) == Math.signum(durationField10.compareTo(durationField13))));
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        java.lang.Integer int7 = dateTimeParserBucket6.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean9 = dateTimeParserBucket6.restoreState((java.lang.Object) dateTimeFieldType8);
        org.joda.time.Chronology chronology10 = dateTimeParserBucket6.getChronology();
        org.joda.time.DurationField durationField11 = chronology10.days();
        org.joda.time.DurationField durationField12 = chronology10.millis();
        org.joda.time.Chronology chronology14 = null;
        java.util.Locale locale15 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology14, locale15, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket18 = new org.joda.time.format.DateTimeParserBucket(64713600009L, chronology10, locale15);
        org.joda.time.DurationField durationField19 = chronology10.weekyears();
        java.util.Locale locale20 = java.util.Locale.ITALIAN;
        java.util.Locale locale21 = locale20.stripExtensions();
        java.util.Locale locale22 = java.util.Locale.GERMAN;
        java.lang.String str23 = locale21.getDisplayVariant(locale22);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket26 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology10, locale21, (java.lang.Integer) 100, 31);
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = org.joda.time.DateTimeFieldType.monthOfYear();
        java.lang.String str28 = dateTimeFieldType27.toString();
        org.joda.time.DurationFieldType durationFieldType29 = dateTimeFieldType27.getRangeDurationType();
        dateTimeParserBucket26.saveField(dateTimeFieldType27, 0);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.Chronology chronology35 = null;
        java.util.Locale locale36 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket38 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology35, locale36, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket39 = new org.joda.time.format.DateTimeParserBucket(100L, chronology33, locale36);
        java.lang.Object obj40 = dateTimeParserBucket39.saveState();
        dateTimeParserBucket39.setOffset((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType43 = org.joda.time.DateTimeFieldType.yearOfCentury();
        java.util.Locale locale45 = java.util.Locale.US;
        dateTimeParserBucket39.saveField(dateTimeFieldType43, "centuryOfEra", locale45);
        org.joda.time.Chronology chronology49 = null;
        java.util.Locale locale50 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket52 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology49, locale50, (java.lang.Integer) 100);
        java.lang.Integer int53 = dateTimeParserBucket52.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType54 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean55 = dateTimeParserBucket52.restoreState((java.lang.Object) dateTimeFieldType54);
        org.joda.time.Chronology chronology56 = dateTimeParserBucket52.getChronology();
        org.joda.time.DurationField durationField57 = chronology56.years();
        org.joda.time.Chronology chronology59 = null;
        org.joda.time.Chronology chronology61 = null;
        java.util.Locale locale62 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket64 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology61, locale62, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket65 = new org.joda.time.format.DateTimeParserBucket(100L, chronology59, locale62);
        java.lang.String str66 = locale62.getScript();
        java.lang.String str68 = locale62.getExtension('u');
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket71 = new org.joda.time.format.DateTimeParserBucket(259200117L, chronology56, locale62, (java.lang.Integer) 100, (int) (byte) 1);
        org.joda.time.DurationField durationField72 = chronology56.centuries();
        boolean boolean73 = dateTimeFieldType43.isSupported(chronology56);
        java.util.Locale locale75 = java.util.Locale.CANADA_FRENCH;
        dateTimeParserBucket26.saveField(dateTimeFieldType43, "332", locale75);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField19 and durationField57", (durationField19.compareTo(durationField57) == 0) == durationField19.equals(durationField57));
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
        org.joda.time.Chronology chronology4 = null;
        java.util.Locale locale5 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology4, locale5, (java.lang.Integer) 100);
        java.lang.Integer int8 = dateTimeParserBucket7.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean10 = dateTimeParserBucket7.restoreState((java.lang.Object) dateTimeFieldType9);
        org.joda.time.Chronology chronology11 = dateTimeParserBucket7.getChronology();
        org.joda.time.DurationField durationField12 = chronology11.years();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.Chronology chronology16 = null;
        java.util.Locale locale17 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket19 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology16, locale17, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket20 = new org.joda.time.format.DateTimeParserBucket(100L, chronology14, locale17);
        java.lang.String str21 = locale17.getScript();
        java.lang.String str23 = locale17.getExtension('u');
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket26 = new org.joda.time.format.DateTimeParserBucket(259200117L, chronology11, locale17, (java.lang.Integer) 100, (int) (byte) 1);
        org.joda.time.DurationField durationField27 = chronology11.centuries();
        java.util.Locale locale29 = java.util.Locale.forLanguageTag("12");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket31 = new org.joda.time.format.DateTimeParserBucket(0L, chronology11, locale29, (java.lang.Integer) 0);
        org.joda.time.DateTimeField dateTimeField32 = chronology11.millisOfSecond();
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        long long36 = chronology11.add(readablePeriod33, (long) (-8), 100);
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.Chronology chronology38 = chronology11.withZone(dateTimeZone37);
        org.joda.time.Chronology chronology42 = null;
        java.util.Locale locale43 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket45 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology42, locale43, (java.lang.Integer) 100);
        java.lang.Integer int46 = dateTimeParserBucket45.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType47 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean48 = dateTimeParserBucket45.restoreState((java.lang.Object) dateTimeFieldType47);
        org.joda.time.Chronology chronology49 = dateTimeParserBucket45.getChronology();
        org.joda.time.DurationField durationField50 = chronology49.days();
        org.joda.time.DateTimeZone dateTimeZone51 = chronology49.getZone();
        org.joda.time.Chronology chronology53 = null;
        java.util.Locale locale54 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket56 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology53, locale54, (java.lang.Integer) 100);
        java.lang.String str57 = locale54.getCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket60 = new org.joda.time.format.DateTimeParserBucket(0L, chronology49, locale54, (java.lang.Integer) 100, (int) (byte) 1);
        org.joda.time.DurationField durationField61 = chronology49.weeks();
        org.joda.time.DurationField durationField62 = chronology49.days();
        org.joda.time.DateTimeFieldType dateTimeFieldType63 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.Chronology chronology65 = null;
        java.util.Locale locale66 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket68 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology65, locale66, (java.lang.Integer) 100);
        java.lang.Integer int69 = dateTimeParserBucket68.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType70 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean71 = dateTimeParserBucket68.restoreState((java.lang.Object) dateTimeFieldType70);
        org.joda.time.Chronology chronology72 = dateTimeParserBucket68.getChronology();
        org.joda.time.DurationField durationField73 = chronology72.days();
        org.joda.time.DateTimeField dateTimeField74 = dateTimeFieldType63.getField(chronology72);
        org.joda.time.DurationField durationField75 = chronology72.minutes();
        org.joda.time.DateTimeField dateTimeField76 = chronology72.hourOfDay();
        long long79 = dateTimeField76.add(3124396800014L, (long) (short) 1);
        org.joda.time.ReadablePartial readablePartial80 = null;
        java.util.Locale locale83 = new java.util.Locale("\u30a4\u30bf\u30ea\u30a2");
        java.lang.String str84 = dateTimeField76.getAsShortText(readablePartial80, (-8), locale83);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket85 = new org.joda.time.format.DateTimeParserBucket(21427200000L, chronology49, locale83);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket88 = new org.joda.time.format.DateTimeParserBucket(129600000L, chronology11, locale83, (java.lang.Integer) 4492738, (int) ' ');
        org.joda.time.DurationField durationField89 = chronology11.weekyears();
        org.joda.time.DurationField durationField90 = chronology11.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField12 and durationField89", (durationField12.compareTo(durationField89) == 0) == durationField12.equals(durationField89));
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 100);
        java.lang.Integer int6 = dateTimeParserBucket5.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean8 = dateTimeParserBucket5.restoreState((java.lang.Object) dateTimeFieldType7);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket5.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        org.joda.time.DurationField durationField11 = chronology9.millis();
        org.joda.time.Chronology chronology13 = null;
        java.util.Locale locale14 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology13, locale14, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket(64713600009L, chronology9, locale14);
        org.joda.time.DateTimeField dateTimeField18 = chronology9.minuteOfDay();
        org.joda.time.DurationField durationField19 = chronology9.days();
        org.joda.time.DateTimeField dateTimeField20 = chronology9.minuteOfDay();
        long long24 = chronology9.add((long) 'u', 107L, (int) (short) 10);
        org.joda.time.DurationField durationField25 = chronology9.seconds();
        long long29 = chronology9.add(86400002L, 130032010L, 0);
        org.joda.time.DateTimeField dateTimeField30 = chronology9.hourOfDay();
        org.joda.time.DurationField durationField31 = chronology9.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField31, durationField10, and durationField11", !(durationField31.compareTo(durationField10) == 0) || (Math.signum(durationField31.compareTo(durationField11)) == Math.signum(durationField10.compareTo(durationField11))));
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 100);
        java.lang.Integer int5 = dateTimeParserBucket4.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean7 = dateTimeParserBucket4.restoreState((java.lang.Object) dateTimeFieldType6);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateTimeField dateTimeField9 = dateTimeFieldType6.getField(chronology8);
        java.util.Locale locale11 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet12 = locale11.getUnicodeLocaleAttributes();
        org.joda.time.Chronology chronology14 = null;
        java.util.Locale locale15 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology14, locale15, (java.lang.Integer) 100);
        java.lang.String str18 = locale11.getDisplayScript(locale15);
        java.lang.String str19 = dateTimeField9.getAsShortText(10, locale11);
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = dateTimeField9.getType();
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.Chronology chronology24 = null;
        java.util.Locale locale25 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket27 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology24, locale25, (java.lang.Integer) 100);
        java.lang.Integer int28 = dateTimeParserBucket27.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean30 = dateTimeParserBucket27.restoreState((java.lang.Object) dateTimeFieldType29);
        org.joda.time.Chronology chronology31 = dateTimeParserBucket27.getChronology();
        org.joda.time.DurationField durationField32 = chronology31.days();
        org.joda.time.DateTimeField dateTimeField33 = dateTimeFieldType22.getField(chronology31);
        org.joda.time.DateTimeField dateTimeField34 = chronology31.dayOfMonth();
        org.joda.time.DurationField durationField35 = chronology31.seconds();
        org.joda.time.DateTimeField dateTimeField36 = chronology31.millisOfDay();
        org.joda.time.DurationField durationField37 = chronology31.halfdays();
        java.util.Locale locale38 = java.util.Locale.ITALIAN;
        java.util.Locale locale39 = locale38.stripExtensions();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket41 = new org.joda.time.format.DateTimeParserBucket(345600000L, chronology31, locale38, (java.lang.Integer) 3);
        boolean boolean42 = dateTimeFieldType20.isSupported(chronology31);
        org.joda.time.DateTimeField dateTimeField43 = chronology31.weekyearOfCentury();
        org.joda.time.DurationField durationField44 = chronology31.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField44, durationField32, and durationField35", !(durationField44.compareTo(durationField32) == 0) || (Math.signum(durationField44.compareTo(durationField35)) == Math.signum(durationField32.compareTo(durationField35))));
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        java.lang.Integer int7 = dateTimeParserBucket6.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean9 = dateTimeParserBucket6.restoreState((java.lang.Object) dateTimeFieldType8);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTimeField dateTimeField11 = dateTimeFieldType8.getField(chronology10);
        long long14 = dateTimeField11.getDifferenceAsLong((long) ' ', (long) 1);
        org.joda.time.ReadablePartial readablePartial15 = null;
        java.util.Locale locale17 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str18 = dateTimeField11.getAsShortText(readablePartial15, (int) ' ', locale17);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket21 = new org.joda.time.format.DateTimeParserBucket(9L, chronology1, locale17, (java.lang.Integer) 2, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.ReadableInstant readableInstant24 = null;
        int int25 = dateTimeZone23.getOffset(readableInstant24);
        java.util.Locale locale27 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str29 = locale27.getUnicodeLocaleType("35");
        java.lang.String str30 = dateTimeZone23.getName(64713600009L, locale27);
        boolean boolean31 = dateTimeParserBucket21.restoreState((java.lang.Object) locale27);
        org.joda.time.Chronology chronology32 = dateTimeParserBucket21.getChronology();
        org.joda.time.DateTimeField dateTimeField33 = chronology32.centuryOfEra();
        org.joda.time.DurationField durationField34 = chronology32.halfdays();
        org.joda.time.DurationField durationField35 = chronology32.eras();
        org.joda.time.DurationField durationField36 = chronology32.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField36 and durationField35", Math.signum(durationField36.compareTo(durationField35)) == -Math.signum(durationField35.compareTo(durationField36)));
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 100);
        java.lang.Integer int6 = dateTimeParserBucket5.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean8 = dateTimeParserBucket5.restoreState((java.lang.Object) dateTimeFieldType7);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket5.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        org.joda.time.DateTimeField dateTimeField11 = dateTimeFieldType0.getField(chronology9);
        org.joda.time.DateTimeField dateTimeField12 = chronology9.dayOfMonth();
        org.joda.time.DurationField durationField13 = chronology9.seconds();
        org.joda.time.DateTimeField dateTimeField14 = chronology9.millisOfDay();
        org.joda.time.DateTimeField dateTimeField15 = chronology9.year();
        org.joda.time.DateTimeField dateTimeField16 = chronology9.hourOfDay();
        org.joda.time.DateTimeField dateTimeField17 = chronology9.year();
        org.joda.time.DurationField durationField18 = chronology9.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField18, durationField10, and durationField13", !(durationField18.compareTo(durationField10) == 0) || (Math.signum(durationField18.compareTo(durationField13)) == Math.signum(durationField10.compareTo(durationField13))));
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 100);
        java.lang.Integer int5 = dateTimeParserBucket4.getPivotYear();
        int int6 = dateTimeParserBucket4.getOffset();
        java.util.Locale locale7 = dateTimeParserBucket4.getLocale();
        java.lang.Object obj8 = dateTimeParserBucket4.saveState();
        org.joda.time.Chronology chronology10 = null;
        java.util.Locale locale11 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology10, locale11, (java.lang.Integer) 100);
        java.lang.Integer int14 = dateTimeParserBucket13.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean16 = dateTimeParserBucket13.restoreState((java.lang.Object) dateTimeFieldType15);
        org.joda.time.Chronology chronology17 = dateTimeParserBucket13.getChronology();
        org.joda.time.DurationField durationField18 = chronology17.days();
        org.joda.time.DateTimeZone dateTimeZone19 = chronology17.getZone();
        org.joda.time.DateTimeField dateTimeField20 = chronology17.yearOfCentury();
        java.lang.String str21 = chronology17.toString();
        org.joda.time.DurationField durationField22 = chronology17.eras();
        boolean boolean23 = dateTimeParserBucket4.restoreState((java.lang.Object) durationField22);
        long long26 = dateTimeParserBucket4.computeMillis(true, "ISOChronology[UTC]");
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField18 and durationField22", Math.signum(durationField18.compareTo(durationField22)) == -Math.signum(durationField22.compareTo(durationField18)));
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        java.lang.Integer int7 = dateTimeParserBucket6.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean9 = dateTimeParserBucket6.restoreState((java.lang.Object) dateTimeFieldType8);
        org.joda.time.Chronology chronology10 = dateTimeParserBucket6.getChronology();
        org.joda.time.DurationField durationField11 = chronology10.days();
        org.joda.time.DateTimeField dateTimeField12 = dateTimeFieldType1.getField(chronology10);
        org.joda.time.DateTimeField dateTimeField13 = chronology10.dayOfMonth();
        org.joda.time.Chronology chronology16 = null;
        java.util.Locale locale17 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket19 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology16, locale17, (java.lang.Integer) 100);
        java.lang.Integer int20 = dateTimeParserBucket19.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean22 = dateTimeParserBucket19.restoreState((java.lang.Object) dateTimeFieldType21);
        org.joda.time.Chronology chronology23 = dateTimeParserBucket19.getChronology();
        org.joda.time.Chronology chronology25 = null;
        java.util.Locale locale26 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket28 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology25, locale26, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket31 = new org.joda.time.format.DateTimeParserBucket((-1L), chronology23, locale26, (java.lang.Integer) 0, (int) '#');
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket34 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology10, locale26, (java.lang.Integer) 1, (int) (byte) -1);
        org.joda.time.DurationField durationField35 = chronology10.centuries();
        org.joda.time.DurationField durationField36 = chronology10.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField36, durationField11, and durationField35", !(durationField36.compareTo(durationField11) == 0) || (Math.signum(durationField36.compareTo(durationField35)) == Math.signum(durationField11.compareTo(durationField35))));
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 100);
        java.lang.Integer int6 = dateTimeParserBucket5.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean8 = dateTimeParserBucket5.restoreState((java.lang.Object) dateTimeFieldType7);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket5.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        org.joda.time.DurationField durationField11 = chronology9.millis();
        org.joda.time.Chronology chronology13 = null;
        java.util.Locale locale14 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology13, locale14, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket(64713600009L, chronology9, locale14);
        org.joda.time.DateTimeField dateTimeField18 = chronology9.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField19 = chronology9.weekyear();
        java.lang.String str20 = chronology9.toString();
        org.joda.time.DurationField durationField21 = chronology9.days();
        org.joda.time.DurationField durationField22 = chronology9.hours();
        org.joda.time.DateTimeField dateTimeField23 = chronology9.era();
        org.joda.time.DurationField durationField24 = chronology9.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField24, durationField10, and durationField11", !(durationField24.compareTo(durationField10) == 0) || (Math.signum(durationField24.compareTo(durationField11)) == Math.signum(durationField10.compareTo(durationField11))));
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 100);
        java.lang.Integer int6 = dateTimeParserBucket5.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean8 = dateTimeParserBucket5.restoreState((java.lang.Object) dateTimeFieldType7);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket5.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        org.joda.time.DateTimeField dateTimeField11 = dateTimeFieldType0.getField(chronology9);
        org.joda.time.DateTimeField dateTimeField12 = chronology9.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField13 = chronology9.weekOfWeekyear();
        java.lang.String str14 = chronology9.toString();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        long long18 = dateTimeZone16.convertUTCToLocal((long) (short) -1);
        org.joda.time.Chronology chronology20 = null;
        java.util.Locale locale21 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket23 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology20, locale21, (java.lang.Integer) 100);
        java.lang.Integer int24 = dateTimeParserBucket23.getPivotYear();
        org.joda.time.DateTimeField dateTimeField25 = null;
        dateTimeParserBucket23.saveField(dateTimeField25, (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone28 = dateTimeParserBucket23.getZone();
        long long30 = dateTimeZone16.getMillisKeepLocal(dateTimeZone28, 97L);
        java.lang.String str32 = dateTimeZone16.getShortName(0L);
        java.util.TimeZone timeZone34 = null;
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forTimeZone(timeZone34);
        java.util.Locale locale40 = new java.util.Locale("weekOfWeekyear", "UTC", "+00:00");
        boolean boolean41 = locale40.hasExtensions();
        org.joda.time.Chronology chronology43 = null;
        java.util.Locale locale44 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket46 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology43, locale44, (java.lang.Integer) 100);
        java.lang.String str47 = locale40.getDisplayCountry(locale44);
        java.lang.String str48 = dateTimeZone35.getShortName((long) (short) 1, locale44);
        java.lang.String str49 = dateTimeZone16.getName((long) 'u', locale44);
        org.joda.time.Chronology chronology50 = chronology9.withZone(dateTimeZone16);
        org.joda.time.DurationField durationField51 = chronology50.seconds();
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone53);
        long long57 = dateTimeZone53.adjustOffset(604801053L, true);
        org.joda.time.Chronology chronology58 = chronology50.withZone(dateTimeZone53);
        org.joda.time.DateTimeField dateTimeField59 = chronology58.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField60 = chronology58.clockhourOfHalfday();
        java.lang.String str61 = chronology58.toString();
        org.joda.time.DateTimeField dateTimeField62 = chronology58.dayOfWeek();
        org.joda.time.DurationField durationField63 = chronology58.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField63, durationField10, and durationField51", !(durationField63.compareTo(durationField10) == 0) || (Math.signum(durationField63.compareTo(durationField51)) == Math.signum(durationField10.compareTo(durationField51))));
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 100);
        java.lang.Integer int6 = dateTimeParserBucket5.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean8 = dateTimeParserBucket5.restoreState((java.lang.Object) dateTimeFieldType7);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket5.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        org.joda.time.DurationField durationField11 = chronology9.millis();
        org.joda.time.Chronology chronology13 = null;
        java.util.Locale locale14 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology13, locale14, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket(64713600009L, chronology9, locale14);
        long long20 = dateTimeParserBucket17.computeMillis(false, "Cina");
        org.joda.time.Chronology chronology21 = dateTimeParserBucket17.getChronology();
        java.lang.Object obj22 = dateTimeParserBucket17.saveState();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.Chronology chronology26 = null;
        java.util.Locale locale27 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket29 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology26, locale27, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket30 = new org.joda.time.format.DateTimeParserBucket(100L, chronology24, locale27);
        org.joda.time.DateTimeZone dateTimeZone31 = dateTimeParserBucket30.getZone();
        int int32 = dateTimeParserBucket30.getOffset();
        org.joda.time.Chronology chronology34 = null;
        java.util.Locale locale35 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket37 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology34, locale35, (java.lang.Integer) 100);
        java.lang.Integer int38 = dateTimeParserBucket37.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean40 = dateTimeParserBucket37.restoreState((java.lang.Object) dateTimeFieldType39);
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.DateTimeField dateTimeField42 = dateTimeFieldType39.getField(chronology41);
        org.joda.time.ReadablePartial readablePartial43 = null;
        int int44 = dateTimeField42.getMinimumValue(readablePartial43);
        boolean boolean45 = dateTimeParserBucket30.restoreState((java.lang.Object) readablePartial43);
        org.joda.time.DateTimeFieldType dateTimeFieldType46 = org.joda.time.DateTimeFieldType.monthOfYear();
        java.lang.String str47 = dateTimeFieldType46.toString();
        dateTimeParserBucket30.saveField(dateTimeFieldType46, (int) (short) -1);
        java.lang.String str50 = dateTimeFieldType46.toString();
        dateTimeParserBucket17.saveField(dateTimeFieldType46, (-25));
        org.joda.time.DateTimeFieldType dateTimeFieldType53 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.Chronology chronology55 = null;
        java.util.Locale locale56 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket58 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology55, locale56, (java.lang.Integer) 100);
        java.lang.Integer int59 = dateTimeParserBucket58.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType60 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean61 = dateTimeParserBucket58.restoreState((java.lang.Object) dateTimeFieldType60);
        org.joda.time.Chronology chronology62 = dateTimeParserBucket58.getChronology();
        org.joda.time.DurationField durationField63 = chronology62.days();
        org.joda.time.DateTimeField dateTimeField64 = dateTimeFieldType53.getField(chronology62);
        org.joda.time.DateTimeField dateTimeField65 = chronology62.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone67 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        long long69 = dateTimeZone67.convertUTCToLocal((long) (short) -1);
        org.joda.time.Chronology chronology71 = null;
        java.util.Locale locale72 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket74 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology71, locale72, (java.lang.Integer) 100);
        java.lang.Integer int75 = dateTimeParserBucket74.getPivotYear();
        org.joda.time.DateTimeField dateTimeField76 = null;
        dateTimeParserBucket74.saveField(dateTimeField76, (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone79 = dateTimeParserBucket74.getZone();
        long long81 = dateTimeZone67.getMillisKeepLocal(dateTimeZone79, 97L);
        int int83 = dateTimeZone67.getStandardOffset(1L);
        org.joda.time.Chronology chronology84 = chronology62.withZone(dateTimeZone67);
        org.joda.time.DurationField durationField85 = chronology84.millis();
        org.joda.time.ReadablePeriod readablePeriod86 = null;
        long long89 = chronology84.add(readablePeriod86, (-62104060800001L), 2);
        org.joda.time.DurationField durationField90 = chronology84.millis();
        org.joda.time.DateTimeField dateTimeField91 = chronology84.dayOfYear();
        org.joda.time.DurationField durationField92 = chronology84.years();
        boolean boolean93 = dateTimeFieldType46.isSupported(chronology84);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField11 and durationField85", (durationField11.compareTo(durationField85) == 0) == durationField11.equals(durationField85));
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 100);
        java.lang.Integer int6 = dateTimeParserBucket5.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean8 = dateTimeParserBucket5.restoreState((java.lang.Object) dateTimeFieldType7);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket5.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        org.joda.time.DateTimeField dateTimeField11 = dateTimeFieldType0.getField(chronology9);
        org.joda.time.DateTimeField dateTimeField12 = chronology9.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField13 = chronology9.weekOfWeekyear();
        java.lang.String str14 = chronology9.toString();
        org.joda.time.DateTimeField dateTimeField15 = chronology9.dayOfYear();
        org.joda.time.DateTimeField dateTimeField16 = chronology9.hourOfDay();
        org.joda.time.DurationField durationField17 = chronology9.years();
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        long long21 = chronology9.add(readablePeriod18, (long) 356580000, 360660000);
        org.joda.time.DurationField durationField22 = chronology9.days();
        org.joda.time.DurationField durationField23 = chronology9.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField23, durationField10, and durationField17", !(durationField23.compareTo(durationField10) == 0) || (Math.signum(durationField23.compareTo(durationField17)) == Math.signum(durationField10.compareTo(durationField17))));
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 100);
        java.lang.Integer int6 = dateTimeParserBucket5.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean8 = dateTimeParserBucket5.restoreState((java.lang.Object) dateTimeFieldType7);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket5.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        org.joda.time.DateTimeZone dateTimeZone11 = chronology9.getZone();
        org.joda.time.DateTimeField dateTimeField12 = chronology9.yearOfCentury();
        org.joda.time.DurationField durationField13 = chronology9.years();
        org.joda.time.DateTimeField dateTimeField14 = chronology9.weekyear();
        org.joda.time.DurationField durationField15 = chronology9.halfdays();
        org.joda.time.DurationField durationField16 = chronology9.weekyears();
        java.util.Locale locale19 = new java.util.Locale("24", "Cina");
        java.util.Locale locale20 = locale19.stripExtensions();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket23 = new org.joda.time.format.DateTimeParserBucket((long) (-292275054), chronology9, locale19, (java.lang.Integer) 1011, 86399999);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField13 and durationField16", (durationField13.compareTo(durationField16) == 0) == durationField13.equals(durationField16));
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 100);
        java.lang.Integer int6 = dateTimeParserBucket5.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean8 = dateTimeParserBucket5.restoreState((java.lang.Object) dateTimeFieldType7);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket5.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        org.joda.time.DurationField durationField11 = chronology9.millis();
        org.joda.time.Chronology chronology13 = null;
        java.util.Locale locale14 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology13, locale14, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket(64713600009L, chronology9, locale14);
        org.joda.time.Chronology chronology19 = null;
        java.util.Locale locale20 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket22 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology19, locale20, (java.lang.Integer) 100);
        java.lang.Integer int23 = dateTimeParserBucket22.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean25 = dateTimeParserBucket22.restoreState((java.lang.Object) dateTimeFieldType24);
        org.joda.time.Chronology chronology26 = dateTimeParserBucket22.getChronology();
        org.joda.time.DurationField durationField27 = chronology26.days();
        org.joda.time.DurationField durationField28 = chronology26.hours();
        org.joda.time.DateTimeZone dateTimeZone29 = chronology26.getZone();
        java.util.TimeZone timeZone30 = dateTimeZone29.toTimeZone();
        org.joda.time.Chronology chronology31 = chronology9.withZone(dateTimeZone29);
        org.joda.time.DateTimeField dateTimeField32 = chronology9.year();
        org.joda.time.Chronology chronology33 = chronology9.withUTC();
        org.joda.time.DurationField durationField34 = chronology9.months();
        org.joda.time.DurationField durationField35 = chronology9.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField35, durationField10, and durationField11", !(durationField35.compareTo(durationField10) == 0) || (Math.signum(durationField35.compareTo(durationField11)) == Math.signum(durationField10.compareTo(durationField11))));
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 100);
        java.lang.Integer int6 = dateTimeParserBucket5.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean8 = dateTimeParserBucket5.restoreState((java.lang.Object) dateTimeFieldType7);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket5.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        org.joda.time.DateTimeField dateTimeField11 = dateTimeFieldType0.getField(chronology9);
        org.joda.time.DateTimeField dateTimeField12 = chronology9.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField13 = chronology9.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField14 = chronology9.yearOfEra();
        org.joda.time.DateTimeField dateTimeField15 = chronology9.millisOfSecond();
        org.joda.time.DurationField durationField16 = chronology9.years();
        org.joda.time.DateTimeField dateTimeField17 = chronology9.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone18 = chronology9.getZone();
        org.joda.time.DurationField durationField19 = chronology9.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField19, durationField10, and durationField16", !(durationField19.compareTo(durationField10) == 0) || (Math.signum(durationField19.compareTo(durationField16)) == Math.signum(durationField10.compareTo(durationField16))));
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 100);
        java.lang.Integer int5 = dateTimeParserBucket4.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean7 = dateTimeParserBucket4.restoreState((java.lang.Object) dateTimeFieldType6);
        org.joda.time.Chronology chronology8 = dateTimeParserBucket4.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeZone dateTimeZone10 = chronology8.getZone();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.yearOfCentury();
        org.joda.time.DurationField durationField12 = chronology8.years();
        java.lang.String str13 = chronology8.toString();
        org.joda.time.DateTimeField dateTimeField14 = chronology8.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField15 = chronology8.era();
        org.joda.time.DurationField durationField16 = chronology8.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField16, durationField9, and durationField12", !(durationField16.compareTo(durationField9) == 0) || (Math.signum(durationField16.compareTo(durationField12)) == Math.signum(durationField9.compareTo(durationField12))));
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 100);
        java.lang.Integer int5 = dateTimeParserBucket4.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean7 = dateTimeParserBucket4.restoreState((java.lang.Object) dateTimeFieldType6);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateTimeField dateTimeField9 = dateTimeFieldType6.getField(chronology8);
        long long12 = dateTimeField9.getDifferenceAsLong((long) ' ', (long) 1);
        org.joda.time.ReadablePartial readablePartial13 = null;
        java.util.Locale locale15 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str16 = dateTimeField9.getAsShortText(readablePartial13, (int) ' ', locale15);
        org.joda.time.ReadablePartial readablePartial17 = null;
        int int18 = dateTimeField9.getMinimumValue(readablePartial17);
        int int21 = dateTimeField9.getDifference((long) 1, (long) (short) 10);
        java.lang.String str23 = dateTimeField9.getAsShortText((long) (short) -1);
        long long25 = dateTimeField9.remainder((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = dateTimeField9.getType();
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.DurationFieldType durationFieldType28 = dateTimeFieldType27.getDurationType();
        java.lang.String str29 = dateTimeFieldType27.toString();
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.Chronology chronology32 = null;
        java.util.Locale locale33 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket35 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology32, locale33, (java.lang.Integer) 100);
        java.lang.Integer int36 = dateTimeParserBucket35.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean38 = dateTimeParserBucket35.restoreState((java.lang.Object) dateTimeFieldType37);
        org.joda.time.Chronology chronology39 = dateTimeParserBucket35.getChronology();
        org.joda.time.DurationField durationField40 = chronology39.days();
        org.joda.time.DateTimeField dateTimeField41 = dateTimeFieldType30.getField(chronology39);
        org.joda.time.DateTimeField dateTimeField42 = chronology39.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField43 = chronology39.dayOfYear();
        org.joda.time.DurationField durationField44 = chronology39.millis();
        org.joda.time.DateTimeField dateTimeField45 = dateTimeFieldType27.getField(chronology39);
        java.lang.String str46 = dateTimeFieldType27.toString();
        org.joda.time.Chronology chronology48 = null;
        java.util.Locale locale49 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket51 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology48, locale49, (java.lang.Integer) 100);
        java.lang.Integer int52 = dateTimeParserBucket51.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType53 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean54 = dateTimeParserBucket51.restoreState((java.lang.Object) dateTimeFieldType53);
        org.joda.time.Chronology chronology55 = dateTimeParserBucket51.getChronology();
        org.joda.time.DurationField durationField56 = chronology55.days();
        org.joda.time.DateTimeZone dateTimeZone57 = chronology55.getZone();
        org.joda.time.DateTimeField dateTimeField58 = chronology55.yearOfCentury();
        org.joda.time.DurationField durationField59 = chronology55.years();
        java.lang.String str60 = chronology55.toString();
        org.joda.time.DateTimeField dateTimeField61 = chronology55.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField62 = chronology55.yearOfEra();
        boolean boolean63 = dateTimeFieldType27.isSupported(chronology55);
        org.joda.time.DateTimeField dateTimeField64 = chronology55.hourOfHalfday();
        boolean boolean65 = dateTimeFieldType26.isSupported(chronology55);
        org.joda.time.DurationField durationField66 = chronology55.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField66, durationField40, and durationField44", !(durationField66.compareTo(durationField40) == 0) || (Math.signum(durationField66.compareTo(durationField44)) == Math.signum(durationField40.compareTo(durationField44))));
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 100);
        java.lang.Integer int6 = dateTimeParserBucket5.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean8 = dateTimeParserBucket5.restoreState((java.lang.Object) dateTimeFieldType7);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket5.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        org.joda.time.DateTimeField dateTimeField11 = dateTimeFieldType0.getField(chronology9);
        org.joda.time.DateTimeField dateTimeField12 = chronology9.dayOfMonth();
        org.joda.time.DurationField durationField13 = chronology9.seconds();
        org.joda.time.DateTimeField dateTimeField14 = chronology9.millisOfDay();
        org.joda.time.DurationField durationField15 = chronology9.halfdays();
        org.joda.time.DurationField durationField16 = chronology9.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField16, durationField10, and durationField13", !(durationField16.compareTo(durationField10) == 0) || (Math.signum(durationField16.compareTo(durationField13)) == Math.signum(durationField10.compareTo(durationField13))));
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 100);
        java.lang.Integer int5 = dateTimeParserBucket4.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean7 = dateTimeParserBucket4.restoreState((java.lang.Object) dateTimeFieldType6);
        org.joda.time.Chronology chronology8 = dateTimeParserBucket4.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeZone dateTimeZone10 = chronology8.getZone();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.yearOfCentury();
        org.joda.time.DurationField durationField12 = chronology8.years();
        java.lang.String str13 = chronology8.toString();
        org.joda.time.DurationField durationField14 = chronology8.months();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str17 = dateTimeZone16.getID();
        int int19 = dateTimeZone16.getOffsetFromLocal((long) 100);
        org.joda.time.LocalDateTime localDateTime20 = null;
        boolean boolean21 = dateTimeZone16.isLocalDateTimeGap(localDateTime20);
        boolean boolean22 = dateTimeZone16.isFixed();
        long long25 = dateTimeZone16.convertLocalToUTC(10540800087L, false);
        org.joda.time.Chronology chronology26 = chronology8.withZone(dateTimeZone16);
        org.joda.time.DurationField durationField27 = chronology8.weekyears();
        org.joda.time.DurationField durationField28 = chronology8.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField12 and durationField27", (durationField12.compareTo(durationField27) == 0) == durationField12.equals(durationField27));
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        java.lang.Integer int7 = dateTimeParserBucket6.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean9 = dateTimeParserBucket6.restoreState((java.lang.Object) dateTimeFieldType8);
        org.joda.time.Chronology chronology10 = dateTimeParserBucket6.getChronology();
        org.joda.time.DurationField durationField11 = chronology10.days();
        org.joda.time.DurationField durationField12 = chronology10.millis();
        org.joda.time.Chronology chronology14 = null;
        java.util.Locale locale15 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology14, locale15, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket18 = new org.joda.time.format.DateTimeParserBucket(64713600009L, chronology10, locale15);
        org.joda.time.DurationField durationField19 = chronology10.weekyears();
        java.util.Locale locale20 = java.util.Locale.ITALIAN;
        java.util.Locale locale21 = locale20.stripExtensions();
        java.util.Locale locale22 = java.util.Locale.GERMAN;
        java.lang.String str23 = locale21.getDisplayVariant(locale22);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket26 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology10, locale21, (java.lang.Integer) 100, 31);
        org.joda.time.DateTimeField dateTimeField27 = chronology10.millisOfDay();
        org.joda.time.DateTimeField dateTimeField28 = chronology10.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField29 = chronology10.clockhourOfHalfday();
        org.joda.time.DurationField durationField30 = chronology10.years();
        org.joda.time.DurationField durationField31 = chronology10.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField19 and durationField30", (durationField19.compareTo(durationField30) == 0) == durationField19.equals(durationField30));
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.DurationFieldType durationFieldType1 = dateTimeFieldType0.getDurationType();
        org.joda.time.Chronology chronology4 = null;
        java.util.Locale locale5 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology4, locale5, (java.lang.Integer) 100);
        java.lang.Integer int8 = dateTimeParserBucket7.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean10 = dateTimeParserBucket7.restoreState((java.lang.Object) dateTimeFieldType9);
        org.joda.time.Chronology chronology11 = dateTimeParserBucket7.getChronology();
        org.joda.time.DurationField durationField12 = chronology11.days();
        org.joda.time.DurationField durationField13 = chronology11.millis();
        org.joda.time.Chronology chronology15 = null;
        java.util.Locale locale16 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket18 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology15, locale16, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket19 = new org.joda.time.format.DateTimeParserBucket(64713600009L, chronology11, locale16);
        org.joda.time.Chronology chronology21 = null;
        java.util.Locale locale22 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket24 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology21, locale22, (java.lang.Integer) 100);
        java.lang.Integer int25 = dateTimeParserBucket24.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean27 = dateTimeParserBucket24.restoreState((java.lang.Object) dateTimeFieldType26);
        org.joda.time.Chronology chronology28 = dateTimeParserBucket24.getChronology();
        org.joda.time.DurationField durationField29 = chronology28.days();
        org.joda.time.DurationField durationField30 = chronology28.hours();
        org.joda.time.DateTimeZone dateTimeZone31 = chronology28.getZone();
        java.util.TimeZone timeZone32 = dateTimeZone31.toTimeZone();
        org.joda.time.Chronology chronology33 = chronology11.withZone(dateTimeZone31);
        org.joda.time.DateTimeField dateTimeField34 = dateTimeFieldType0.getField(chronology11);
        org.joda.time.DateTimeField dateTimeField35 = chronology11.era();
        org.joda.time.DurationField durationField36 = chronology11.seconds();
        org.joda.time.DateTimeField dateTimeField37 = chronology11.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField38 = chronology11.clockhourOfDay();
        org.joda.time.DurationField durationField39 = chronology11.centuries();
        org.joda.time.DateTimeField dateTimeField40 = chronology11.monthOfYear();
        org.joda.time.DurationField durationField41 = chronology11.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField41, durationField12, and durationField13", !(durationField41.compareTo(durationField12) == 0) || (Math.signum(durationField41.compareTo(durationField13)) == Math.signum(durationField12.compareTo(durationField13))));
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.DurationFieldType durationFieldType1 = dateTimeFieldType0.getDurationType();
        java.lang.String str2 = dateTimeFieldType0.toString();
        java.lang.String str3 = dateTimeFieldType0.toString();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.Chronology chronology6 = null;
        java.util.Locale locale7 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket9 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology6, locale7, (java.lang.Integer) 100);
        java.lang.Integer int10 = dateTimeParserBucket9.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean12 = dateTimeParserBucket9.restoreState((java.lang.Object) dateTimeFieldType11);
        org.joda.time.Chronology chronology13 = dateTimeParserBucket9.getChronology();
        org.joda.time.DurationField durationField14 = chronology13.days();
        org.joda.time.DateTimeField dateTimeField15 = dateTimeFieldType4.getField(chronology13);
        org.joda.time.DateTimeField dateTimeField16 = chronology13.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField17 = chronology13.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField18 = chronology13.yearOfEra();
        org.joda.time.DateTimeField dateTimeField19 = chronology13.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField20 = chronology13.dayOfYear();
        org.joda.time.DateTimeField dateTimeField21 = chronology13.hourOfDay();
        org.joda.time.DurationField durationField22 = chronology13.centuries();
        org.joda.time.DurationField durationField23 = chronology13.weekyears();
        org.joda.time.DateTimeField dateTimeField24 = chronology13.weekyear();
        org.joda.time.DurationField durationField25 = chronology13.centuries();
        org.joda.time.DateTimeField dateTimeField26 = dateTimeFieldType0.getField(chronology13);
        org.joda.time.Chronology chronology29 = null;
        java.util.Locale locale30 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket32 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology29, locale30, (java.lang.Integer) 100);
        java.lang.Integer int33 = dateTimeParserBucket32.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean35 = dateTimeParserBucket32.restoreState((java.lang.Object) dateTimeFieldType34);
        org.joda.time.Chronology chronology36 = dateTimeParserBucket32.getChronology();
        org.joda.time.DurationField durationField37 = chronology36.days();
        org.joda.time.DurationField durationField38 = chronology36.millis();
        org.joda.time.Chronology chronology40 = null;
        java.util.Locale locale41 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket43 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology40, locale41, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket44 = new org.joda.time.format.DateTimeParserBucket(64713600009L, chronology36, locale41);
        org.joda.time.DateTimeField dateTimeField45 = chronology36.minuteOfDay();
        org.joda.time.DurationField durationField46 = chronology36.days();
        org.joda.time.DateTimeField dateTimeField47 = chronology36.minuteOfDay();
        org.joda.time.DurationField durationField48 = chronology36.months();
        org.joda.time.DurationField durationField49 = chronology36.hours();
        boolean boolean50 = dateTimeFieldType0.isSupported(chronology36);
        org.joda.time.DurationField durationField51 = chronology36.weeks();
        org.joda.time.DurationField durationField52 = chronology36.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField52, durationField14, and durationField22", !(durationField52.compareTo(durationField14) == 0) || (Math.signum(durationField52.compareTo(durationField22)) == Math.signum(durationField14.compareTo(durationField22))));
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 100);
        java.lang.Integer int6 = dateTimeParserBucket5.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean8 = dateTimeParserBucket5.restoreState((java.lang.Object) dateTimeFieldType7);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket5.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        org.joda.time.DateTimeField dateTimeField11 = dateTimeFieldType0.getField(chronology9);
        org.joda.time.DateTimeField dateTimeField12 = chronology9.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        long long16 = dateTimeZone14.convertUTCToLocal((long) (short) -1);
        org.joda.time.Chronology chronology18 = null;
        java.util.Locale locale19 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket21 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology18, locale19, (java.lang.Integer) 100);
        java.lang.Integer int22 = dateTimeParserBucket21.getPivotYear();
        org.joda.time.DateTimeField dateTimeField23 = null;
        dateTimeParserBucket21.saveField(dateTimeField23, (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone26 = dateTimeParserBucket21.getZone();
        long long28 = dateTimeZone14.getMillisKeepLocal(dateTimeZone26, 97L);
        int int30 = dateTimeZone14.getStandardOffset(1L);
        org.joda.time.Chronology chronology31 = chronology9.withZone(dateTimeZone14);
        org.joda.time.DurationField durationField32 = chronology31.millis();
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        long long36 = chronology31.add(readablePeriod33, (-62104060800001L), 2);
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str39 = dateTimeZone38.getID();
        int int41 = dateTimeZone38.getOffsetFromLocal((long) 100);
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.Chronology chronology46 = null;
        java.util.Locale locale47 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket49 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology46, locale47, (java.lang.Integer) 100);
        java.lang.Integer int50 = dateTimeParserBucket49.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType51 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean52 = dateTimeParserBucket49.restoreState((java.lang.Object) dateTimeFieldType51);
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.DateTimeField dateTimeField54 = dateTimeFieldType51.getField(chronology53);
        java.util.Locale locale56 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet57 = locale56.getUnicodeLocaleAttributes();
        org.joda.time.Chronology chronology59 = null;
        java.util.Locale locale60 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket62 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology59, locale60, (java.lang.Integer) 100);
        java.lang.String str63 = locale56.getDisplayScript(locale60);
        java.lang.String str64 = dateTimeField54.getAsShortText(10, locale56);
        java.util.Locale.setDefault(locale56);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket66 = new org.joda.time.format.DateTimeParserBucket((-259200000L), chronology44, locale56);
        java.lang.String str67 = dateTimeZone38.getShortName(97L, locale56);
        long long71 = dateTimeZone38.convertLocalToUTC((long) (-1), false, 60480000010L);
        boolean boolean72 = dateTimeZone38.isFixed();
        org.joda.time.Chronology chronology73 = chronology31.withZone(dateTimeZone38);
        org.joda.time.DateTimeField dateTimeField74 = chronology31.clockhourOfDay();
        org.joda.time.DurationField durationField75 = chronology31.centuries();
        org.joda.time.DateTimeField dateTimeField76 = chronology31.weekyear();
        org.joda.time.DurationField durationField77 = chronology31.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField77, durationField10, and durationField32", !(durationField77.compareTo(durationField10) == 0) || (Math.signum(durationField77.compareTo(durationField32)) == Math.signum(durationField10.compareTo(durationField32))));
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        java.lang.Integer int7 = dateTimeParserBucket6.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean9 = dateTimeParserBucket6.restoreState((java.lang.Object) dateTimeFieldType8);
        org.joda.time.Chronology chronology10 = dateTimeParserBucket6.getChronology();
        org.joda.time.DurationField durationField11 = chronology10.days();
        org.joda.time.DateTimeField dateTimeField12 = dateTimeFieldType1.getField(chronology10);
        org.joda.time.DateTimeField dateTimeField13 = chronology10.dayOfMonth();
        org.joda.time.DurationField durationField14 = chronology10.seconds();
        org.joda.time.DateTimeField dateTimeField15 = chronology10.millisOfDay();
        org.joda.time.DurationField durationField16 = chronology10.days();
        org.joda.time.Chronology chronology18 = null;
        java.util.Locale locale19 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket21 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology18, locale19, (java.lang.Integer) 100);
        java.lang.Integer int22 = dateTimeParserBucket21.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean24 = dateTimeParserBucket21.restoreState((java.lang.Object) dateTimeFieldType23);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateTimeField dateTimeField26 = dateTimeFieldType23.getField(chronology25);
        long long28 = dateTimeField26.roundHalfEven(1L);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.Chronology chronology33 = null;
        java.util.Locale locale34 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket36 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology33, locale34, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket37 = new org.joda.time.format.DateTimeParserBucket(100L, chronology31, locale34);
        java.lang.String str38 = dateTimeField26.getAsText((long) (short) 0, locale34);
        java.util.Locale.setDefault(locale34);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket40 = new org.joda.time.format.DateTimeParserBucket(3599999L, chronology10, locale34);
        org.joda.time.DateTimeField dateTimeField41 = chronology10.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField42 = chronology10.centuryOfEra();
        org.joda.time.Chronology chronology43 = chronology10.withUTC();
        org.joda.time.DateTimeField dateTimeField44 = chronology43.minuteOfHour();
        org.joda.time.DurationField durationField45 = chronology43.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField45, durationField11, and durationField14", !(durationField45.compareTo(durationField11) == 0) || (Math.signum(durationField45.compareTo(durationField14)) == Math.signum(durationField11.compareTo(durationField14))));
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        java.lang.Integer int7 = dateTimeParserBucket6.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean9 = dateTimeParserBucket6.restoreState((java.lang.Object) dateTimeFieldType8);
        org.joda.time.Chronology chronology10 = dateTimeParserBucket6.getChronology();
        org.joda.time.DurationField durationField11 = chronology10.days();
        org.joda.time.DateTimeField dateTimeField12 = dateTimeFieldType1.getField(chronology10);
        org.joda.time.DateTimeField dateTimeField13 = chronology10.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField14 = chronology10.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField15 = chronology10.yearOfEra();
        org.joda.time.DateTimeField dateTimeField16 = chronology10.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField17 = chronology10.secondOfDay();
        org.joda.time.DateTimeField dateTimeField18 = chronology10.minuteOfHour();
        org.joda.time.Chronology chronology20 = null;
        java.util.Locale locale21 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket23 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology20, locale21, (java.lang.Integer) 100);
        java.lang.Integer int24 = dateTimeParserBucket23.getPivotYear();
        org.joda.time.DateTimeField dateTimeField25 = null;
        dateTimeParserBucket23.saveField(dateTimeField25, (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone28 = dateTimeParserBucket23.getZone();
        org.joda.time.Chronology chronology31 = null;
        java.util.Locale locale32 = java.util.Locale.FRENCH;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket35 = new org.joda.time.format.DateTimeParserBucket((long) 'u', chronology31, locale32, (java.lang.Integer) (-1), 0);
        java.util.Locale locale36 = locale32.stripExtensions();
        java.lang.String str37 = dateTimeZone28.getShortName((long) '4', locale36);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket39 = new org.joda.time.format.DateTimeParserBucket((long) (short) 1, chronology10, locale36, (java.lang.Integer) 365);
        org.joda.time.DateTimeField dateTimeField40 = chronology10.monthOfYear();
        org.joda.time.DurationField durationField41 = chronology10.eras();
        org.joda.time.DateTimeField dateTimeField42 = chronology10.centuryOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField11 and durationField41", Math.signum(durationField11.compareTo(durationField41)) == -Math.signum(durationField41.compareTo(durationField11)));
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 100);
        java.lang.Integer int6 = dateTimeParserBucket5.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean8 = dateTimeParserBucket5.restoreState((java.lang.Object) dateTimeFieldType7);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket5.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        org.joda.time.DateTimeZone dateTimeZone11 = chronology9.getZone();
        org.joda.time.DateTimeField dateTimeField12 = chronology9.monthOfYear();
        org.joda.time.DateTimeField dateTimeField13 = chronology9.weekyear();
        org.joda.time.DurationField durationField14 = chronology9.minutes();
        org.joda.time.DateTimeField dateTimeField15 = chronology9.clockhourOfDay();
        org.joda.time.DurationField durationField16 = chronology9.minutes();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.Chronology chronology19 = null;
        java.util.Locale locale20 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket22 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology19, locale20, (java.lang.Integer) 100);
        java.lang.Integer int23 = dateTimeParserBucket22.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean25 = dateTimeParserBucket22.restoreState((java.lang.Object) dateTimeFieldType24);
        org.joda.time.Chronology chronology26 = dateTimeParserBucket22.getChronology();
        org.joda.time.DurationField durationField27 = chronology26.days();
        org.joda.time.DateTimeField dateTimeField28 = dateTimeFieldType17.getField(chronology26);
        org.joda.time.DateTimeField dateTimeField29 = chronology26.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField30 = chronology26.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField31 = chronology26.yearOfEra();
        org.joda.time.DateTimeField dateTimeField32 = chronology26.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField33 = chronology26.dayOfYear();
        org.joda.time.DateTimeField dateTimeField34 = chronology26.hourOfDay();
        org.joda.time.DurationField durationField35 = chronology26.centuries();
        org.joda.time.DurationField durationField36 = chronology26.weekyears();
        org.joda.time.DateTimeField dateTimeField37 = chronology26.weekyear();
        org.joda.time.DurationField durationField38 = chronology26.centuries();
        org.joda.time.DurationField durationField39 = chronology26.weeks();
        org.joda.time.DateTimeField dateTimeField40 = chronology26.era();
        int int42 = dateTimeField40.getLeapAmount(363599999L);
        org.joda.time.Chronology chronology44 = null;
        java.util.Locale locale45 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket47 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology44, locale45, (java.lang.Integer) 100);
        java.lang.Integer int48 = dateTimeParserBucket47.getPivotYear();
        org.joda.time.DateTimeField dateTimeField49 = null;
        dateTimeParserBucket47.saveField(dateTimeField49, (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone52 = dateTimeParserBucket47.getZone();
        long long55 = dateTimeZone52.convertLocalToUTC(18748800000L, false);
        java.util.Locale locale57 = java.util.Locale.getDefault();
        java.lang.String str58 = locale57.getISO3Country();
        java.lang.String str59 = dateTimeZone52.getShortName((long) 86399999, locale57);
        java.lang.String str60 = locale57.getISO3Language();
        int int61 = dateTimeField40.getMaximumShortTextLength(locale57);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket62 = new org.joda.time.format.DateTimeParserBucket((-62104060800001L), chronology9, locale57);
        long long64 = dateTimeParserBucket62.computeMillis(false);
        org.joda.time.Chronology chronology65 = dateTimeParserBucket62.getChronology();
        org.joda.time.DurationField durationField66 = chronology65.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField66, durationField10, and durationField14", !(durationField66.compareTo(durationField10) == 0) || (Math.signum(durationField66.compareTo(durationField14)) == Math.signum(durationField10.compareTo(durationField14))));
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 100);
        java.lang.Integer int6 = dateTimeParserBucket5.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean8 = dateTimeParserBucket5.restoreState((java.lang.Object) dateTimeFieldType7);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket5.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        org.joda.time.DurationField durationField11 = chronology9.millis();
        org.joda.time.Chronology chronology13 = null;
        java.util.Locale locale14 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology13, locale14, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket(64713600009L, chronology9, locale14);
        org.joda.time.DateTimeField dateTimeField18 = chronology9.minuteOfDay();
        org.joda.time.DurationField durationField19 = chronology9.days();
        java.lang.String str20 = chronology9.toString();
        org.joda.time.DurationField durationField21 = chronology9.days();
        org.joda.time.DateTimeField dateTimeField22 = chronology9.era();
        org.joda.time.DurationField durationField23 = dateTimeField22.getDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField23, durationField10, and durationField11", !(durationField23.compareTo(durationField10) == 0) || (Math.signum(durationField23.compareTo(durationField11)) == Math.signum(durationField10.compareTo(durationField11))));
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test203");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        java.lang.Integer int7 = dateTimeParserBucket6.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean9 = dateTimeParserBucket6.restoreState((java.lang.Object) dateTimeFieldType8);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTimeField dateTimeField11 = dateTimeFieldType8.getField(chronology10);
        long long14 = dateTimeField11.getDifferenceAsLong((long) ' ', (long) 1);
        org.joda.time.ReadablePartial readablePartial15 = null;
        java.util.Locale locale17 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str18 = dateTimeField11.getAsShortText(readablePartial15, (int) ' ', locale17);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket21 = new org.joda.time.format.DateTimeParserBucket(9L, chronology1, locale17, (java.lang.Integer) 2, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.ReadableInstant readableInstant24 = null;
        int int25 = dateTimeZone23.getOffset(readableInstant24);
        java.util.Locale locale27 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str29 = locale27.getUnicodeLocaleType("35");
        java.lang.String str30 = dateTimeZone23.getName(64713600009L, locale27);
        boolean boolean31 = dateTimeParserBucket21.restoreState((java.lang.Object) locale27);
        org.joda.time.Chronology chronology32 = dateTimeParserBucket21.getChronology();
        org.joda.time.DateTimeField dateTimeField33 = chronology32.centuryOfEra();
        org.joda.time.DurationField durationField34 = chronology32.eras();
        org.joda.time.DateTimeField dateTimeField35 = chronology32.era();
        org.joda.time.DateTimeField dateTimeField36 = chronology32.year();
        org.joda.time.DurationField durationField37 = chronology32.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField34, durationField37, and durationField34", !(durationField34.compareTo(durationField37) == 0) || (Math.signum(durationField34.compareTo(durationField34)) == Math.signum(durationField37.compareTo(durationField34))));
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test204");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(100L, chronology1, locale4);
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeParserBucket7.getZone();
        int int10 = dateTimeZone8.getOffsetFromLocal((long) (byte) 1);
        boolean boolean11 = dateTimeZone8.isFixed();
        java.lang.String str13 = dateTimeZone8.getShortName((long) 'u');
        long long15 = dateTimeZone8.nextTransition(26006400L);
        long long17 = dateTimeZone8.convertUTCToLocal(9L);
        org.joda.time.Chronology chronology19 = null;
        java.util.Locale locale20 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket22 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology19, locale20, (java.lang.Integer) 100);
        java.lang.Integer int23 = dateTimeParserBucket22.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean25 = dateTimeParserBucket22.restoreState((java.lang.Object) dateTimeFieldType24);
        org.joda.time.Chronology chronology26 = dateTimeParserBucket22.getChronology();
        org.joda.time.DurationField durationField27 = chronology26.days();
        org.joda.time.DateTimeZone dateTimeZone28 = chronology26.getZone();
        org.joda.time.DateTimeField dateTimeField29 = chronology26.yearOfCentury();
        java.lang.String str30 = chronology26.toString();
        org.joda.time.Chronology chronology31 = chronology26.withUTC();
        org.joda.time.DateTimeField dateTimeField32 = chronology26.secondOfDay();
        org.joda.time.DurationField durationField33 = chronology26.weekyears();
        org.joda.time.DateTimeField dateTimeField34 = chronology26.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField35 = chronology26.millisOfSecond();
        boolean boolean36 = dateTimeZone8.equals((java.lang.Object) dateTimeField35);
        org.joda.time.Chronology chronology39 = null;
        java.util.Locale locale40 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket42 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology39, locale40, (java.lang.Integer) 100);
        java.lang.Integer int43 = dateTimeParserBucket42.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType44 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean45 = dateTimeParserBucket42.restoreState((java.lang.Object) dateTimeFieldType44);
        org.joda.time.Chronology chronology46 = dateTimeParserBucket42.getChronology();
        org.joda.time.DurationField durationField47 = chronology46.years();
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.Chronology chronology51 = null;
        java.util.Locale locale52 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket54 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology51, locale52, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket55 = new org.joda.time.format.DateTimeParserBucket(100L, chronology49, locale52);
        java.lang.String str56 = locale52.getScript();
        java.lang.String str58 = locale52.getExtension('u');
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket61 = new org.joda.time.format.DateTimeParserBucket(259200117L, chronology46, locale52, (java.lang.Integer) 100, (int) (byte) 1);
        org.joda.time.DateTimeField dateTimeField62 = chronology46.hourOfHalfday();
        org.joda.time.DurationField durationField63 = chronology46.months();
        org.joda.time.DateTimeField dateTimeField64 = chronology46.year();
        org.joda.time.DateTimeField dateTimeField65 = chronology46.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField66 = chronology46.centuryOfEra();
        long long68 = dateTimeField66.roundHalfFloor((long) 1439);
        org.joda.time.ReadablePartial readablePartial69 = null;
        java.util.Locale locale71 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet72 = locale71.getUnicodeLocaleAttributes();
        org.joda.time.Chronology chronology74 = null;
        java.util.Locale locale75 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket77 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology74, locale75, (java.lang.Integer) 100);
        java.lang.String str78 = locale71.getDisplayScript(locale75);
        java.lang.String str79 = locale71.getDisplayName();
        java.lang.String str81 = locale71.getUnicodeLocaleType("de");
        java.lang.String str82 = dateTimeField66.getAsShortText(readablePartial69, (-46), locale71);
        java.lang.String str83 = locale71.getVariant();
        boolean boolean84 = dateTimeZone8.equals((java.lang.Object) str83);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField33 and durationField47", (durationField33.compareTo(durationField47) == 0) == durationField33.equals(durationField47));
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test205");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 100);
        java.lang.Integer int6 = dateTimeParserBucket5.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean8 = dateTimeParserBucket5.restoreState((java.lang.Object) dateTimeFieldType7);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket5.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        org.joda.time.DateTimeField dateTimeField11 = dateTimeFieldType0.getField(chronology9);
        org.joda.time.DateTimeField dateTimeField12 = chronology9.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField13 = chronology9.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField14 = chronology9.yearOfEra();
        org.joda.time.DateTimeField dateTimeField15 = chronology9.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField16 = chronology9.dayOfYear();
        org.joda.time.DateTimeField dateTimeField17 = chronology9.hourOfDay();
        org.joda.time.DurationField durationField18 = chronology9.centuries();
        org.joda.time.DurationField durationField19 = chronology9.millis();
        org.joda.time.DateTimeZone dateTimeZone20 = chronology9.getZone();
        org.joda.time.DurationField durationField21 = chronology9.weekyears();
        org.joda.time.DateTimeField dateTimeField22 = chronology9.yearOfEra();
        org.joda.time.DateTimeField dateTimeField23 = chronology9.millisOfSecond();
        org.joda.time.Chronology chronology25 = null;
        java.util.Locale locale26 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket28 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology25, locale26, (java.lang.Integer) 100);
        java.lang.Integer int29 = dateTimeParserBucket28.getPivotYear();
        org.joda.time.DateTimeField dateTimeField30 = null;
        dateTimeParserBucket28.saveField(dateTimeField30, (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone33 = dateTimeParserBucket28.getZone();
        org.joda.time.Chronology chronology35 = null;
        java.util.Locale locale36 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket38 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology35, locale36, (java.lang.Integer) 100);
        java.lang.Integer int39 = dateTimeParserBucket38.getPivotYear();
        org.joda.time.DateTimeField dateTimeField40 = null;
        dateTimeParserBucket38.saveField(dateTimeField40, (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone43 = dateTimeParserBucket38.getZone();
        org.joda.time.Chronology chronology45 = null;
        java.util.Locale locale46 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket48 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology45, locale46, (java.lang.Integer) 100);
        java.lang.Integer int49 = dateTimeParserBucket48.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType50 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean51 = dateTimeParserBucket48.restoreState((java.lang.Object) dateTimeFieldType50);
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.DateTimeField dateTimeField53 = dateTimeFieldType50.getField(chronology52);
        java.util.Locale locale55 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet56 = locale55.getUnicodeLocaleAttributes();
        org.joda.time.Chronology chronology58 = null;
        java.util.Locale locale59 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket61 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology58, locale59, (java.lang.Integer) 100);
        java.lang.String str62 = locale55.getDisplayScript(locale59);
        java.lang.String str63 = dateTimeField53.getAsShortText(10, locale55);
        dateTimeParserBucket38.saveField(dateTimeField53, (int) (byte) 1);
        boolean boolean66 = dateTimeParserBucket28.restoreState((java.lang.Object) dateTimeParserBucket38);
        java.util.Locale locale67 = java.util.Locale.CHINESE;
        java.lang.String str68 = locale67.toLanguageTag();
        java.lang.String str69 = locale67.getLanguage();
        java.lang.String str70 = locale67.getLanguage();
        boolean boolean71 = dateTimeParserBucket38.restoreState((java.lang.Object) locale67);
        org.joda.time.DateTimeZone dateTimeZone72 = dateTimeParserBucket38.getZone();
        org.joda.time.Chronology chronology74 = null;
        org.joda.time.Chronology chronology76 = null;
        java.util.Locale locale77 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket79 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology76, locale77, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket80 = new org.joda.time.format.DateTimeParserBucket(100L, chronology74, locale77);
        org.joda.time.DateTimeZone dateTimeZone81 = dateTimeParserBucket80.getZone();
        int int83 = dateTimeZone81.getOffsetFromLocal((long) (byte) 1);
        boolean boolean84 = dateTimeZone81.isFixed();
        dateTimeParserBucket38.setZone(dateTimeZone81);
        org.joda.time.ReadableInstant readableInstant86 = null;
        int int87 = dateTimeZone81.getOffset(readableInstant86);
        java.lang.String str88 = dateTimeZone81.getID();
        int int90 = dateTimeZone81.getOffsetFromLocal((-2L));
        org.joda.time.Chronology chronology91 = chronology9.withZone(dateTimeZone81);
        org.joda.time.DurationField durationField92 = chronology9.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField92, durationField10, and durationField18", !(durationField92.compareTo(durationField10) == 0) || (Math.signum(durationField92.compareTo(durationField18)) == Math.signum(durationField10.compareTo(durationField18))));
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test206");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 100);
        java.lang.Integer int5 = dateTimeParserBucket4.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean7 = dateTimeParserBucket4.restoreState((java.lang.Object) dateTimeFieldType6);
        org.joda.time.Chronology chronology8 = dateTimeParserBucket4.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeZone dateTimeZone10 = chronology8.getZone();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.monthOfYear();
        org.joda.time.DurationField durationField12 = chronology8.centuries();
        org.joda.time.DurationField durationField13 = chronology8.days();
        org.joda.time.DateTimeField dateTimeField14 = chronology8.secondOfMinute();
        org.joda.time.DurationField durationField15 = chronology8.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField15, durationField9, and durationField12", !(durationField15.compareTo(durationField9) == 0) || (Math.signum(durationField15.compareTo(durationField12)) == Math.signum(durationField9.compareTo(durationField12))));
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test207");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 100);
        java.lang.Integer int6 = dateTimeParserBucket5.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean8 = dateTimeParserBucket5.restoreState((java.lang.Object) dateTimeFieldType7);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket5.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        org.joda.time.DateTimeField dateTimeField11 = dateTimeFieldType0.getField(chronology9);
        org.joda.time.DateTimeField dateTimeField12 = chronology9.dayOfMonth();
        org.joda.time.DurationField durationField13 = chronology9.millis();
        org.joda.time.DurationField durationField14 = chronology9.millis();
        org.joda.time.DateTimeField dateTimeField15 = chronology9.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField16 = chronology9.era();
        org.joda.time.DateTimeField dateTimeField17 = chronology9.secondOfDay();
        org.joda.time.DateTimeField dateTimeField18 = chronology9.halfdayOfDay();
        org.joda.time.DurationField durationField19 = chronology9.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField19, durationField10, and durationField13", !(durationField19.compareTo(durationField10) == 0) || (Math.signum(durationField19.compareTo(durationField13)) == Math.signum(durationField10.compareTo(durationField13))));
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test208");
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        java.lang.Integer int7 = dateTimeParserBucket6.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean9 = dateTimeParserBucket6.restoreState((java.lang.Object) dateTimeFieldType8);
        org.joda.time.Chronology chronology10 = dateTimeParserBucket6.getChronology();
        org.joda.time.DurationField durationField11 = chronology10.days();
        org.joda.time.DateTimeField dateTimeField12 = dateTimeFieldType1.getField(chronology10);
        org.joda.time.DateTimeField dateTimeField13 = chronology10.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField14 = chronology10.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField15 = chronology10.yearOfEra();
        org.joda.time.DateTimeField dateTimeField16 = chronology10.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField17 = chronology10.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField18 = chronology10.clockhourOfDay();
        org.joda.time.Chronology chronology20 = null;
        java.util.Locale locale21 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket23 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology20, locale21, (java.lang.Integer) 100);
        java.lang.Integer int24 = dateTimeParserBucket23.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean26 = dateTimeParserBucket23.restoreState((java.lang.Object) dateTimeFieldType25);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.DateTimeField dateTimeField28 = dateTimeFieldType25.getField(chronology27);
        long long30 = dateTimeField28.roundHalfEven(1L);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.Chronology chronology35 = null;
        java.util.Locale locale36 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket38 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology35, locale36, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket39 = new org.joda.time.format.DateTimeParserBucket(100L, chronology33, locale36);
        java.lang.String str40 = dateTimeField28.getAsText((long) (short) 0, locale36);
        java.util.Locale locale42 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str43 = dateTimeField28.getAsShortText((long) (byte) -1, locale42);
        java.util.Set<java.lang.String> strSet44 = locale42.getUnicodeLocaleAttributes();
        java.lang.String str45 = locale42.toLanguageTag();
        java.lang.String str47 = locale42.getExtension('a');
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket48 = new org.joda.time.format.DateTimeParserBucket(60480000010L, chronology10, locale42);
        org.joda.time.DurationField durationField49 = chronology10.eras();
        org.joda.time.Chronology chronology50 = chronology10.withUTC();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField11 and durationField49", Math.signum(durationField11.compareTo(durationField49)) == -Math.signum(durationField49.compareTo(durationField11)));
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test209");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 100);
        java.lang.Integer int6 = dateTimeParserBucket5.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean8 = dateTimeParserBucket5.restoreState((java.lang.Object) dateTimeFieldType7);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket5.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        org.joda.time.DateTimeField dateTimeField11 = dateTimeFieldType0.getField(chronology9);
        org.joda.time.DateTimeField dateTimeField12 = chronology9.dayOfMonth();
        org.joda.time.DurationField durationField13 = chronology9.seconds();
        org.joda.time.DateTimeField dateTimeField14 = chronology9.millisOfDay();
        org.joda.time.DateTimeField dateTimeField15 = chronology9.halfdayOfDay();
        org.joda.time.DurationField durationField16 = chronology9.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField16, durationField10, and durationField13", !(durationField16.compareTo(durationField10) == 0) || (Math.signum(durationField16.compareTo(durationField13)) == Math.signum(durationField10.compareTo(durationField13))));
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test210");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 100);
        java.lang.Integer int6 = dateTimeParserBucket5.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean8 = dateTimeParserBucket5.restoreState((java.lang.Object) dateTimeFieldType7);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket5.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        org.joda.time.DurationField durationField11 = chronology9.millis();
        org.joda.time.DateTimeField dateTimeField12 = chronology9.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField13 = chronology9.era();
        org.joda.time.Chronology chronology15 = null;
        java.util.Locale locale16 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket18 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology15, locale16, (java.lang.Integer) 100);
        java.lang.Integer int19 = dateTimeParserBucket18.getPivotYear();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        dateTimeParserBucket18.setZone(dateTimeZone20);
        dateTimeParserBucket18.setOffset((java.lang.Integer) 0);
        java.lang.Integer int24 = dateTimeParserBucket18.getOffsetInteger();
        long long27 = dateTimeParserBucket18.computeMillis(true, "32");
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.Chronology chronology30 = null;
        java.util.Locale locale31 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket33 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology30, locale31, (java.lang.Integer) 100);
        java.lang.Integer int34 = dateTimeParserBucket33.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType35 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean36 = dateTimeParserBucket33.restoreState((java.lang.Object) dateTimeFieldType35);
        org.joda.time.Chronology chronology37 = dateTimeParserBucket33.getChronology();
        org.joda.time.DurationField durationField38 = chronology37.days();
        org.joda.time.DateTimeField dateTimeField39 = dateTimeFieldType28.getField(chronology37);
        org.joda.time.DateTimeField dateTimeField40 = chronology37.dayOfMonth();
        org.joda.time.DurationField durationField41 = chronology37.seconds();
        org.joda.time.DateTimeField dateTimeField42 = chronology37.millisOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType43 = dateTimeField42.getType();
        java.util.Locale.Builder builder45 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder46 = builder45.clearExtensions();
        java.util.Locale.Builder builder48 = builder45.setScript("");
        java.util.Locale locale49 = builder45.build();
        dateTimeParserBucket18.saveField(dateTimeFieldType43, "millisOfSecond", locale49);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket52 = new org.joda.time.format.DateTimeParserBucket(31449600097L, chronology9, locale49, (java.lang.Integer) 5);
        org.joda.time.DurationField durationField53 = chronology9.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField53, durationField10, and durationField11", !(durationField53.compareTo(durationField10) == 0) || (Math.signum(durationField53.compareTo(durationField11)) == Math.signum(durationField10.compareTo(durationField11))));
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test211");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 100);
        java.lang.Integer int6 = dateTimeParserBucket5.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean8 = dateTimeParserBucket5.restoreState((java.lang.Object) dateTimeFieldType7);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket5.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        org.joda.time.DateTimeField dateTimeField11 = dateTimeFieldType0.getField(chronology9);
        org.joda.time.DateTimeField dateTimeField12 = chronology9.dayOfMonth();
        org.joda.time.DurationField durationField13 = chronology9.seconds();
        org.joda.time.DateTimeField dateTimeField14 = chronology9.millisOfDay();
        org.joda.time.DurationField durationField15 = chronology9.days();
        org.joda.time.DateTimeField dateTimeField16 = chronology9.clockhourOfDay();
        long long20 = chronology9.add(604800053L, 100L, (int) (byte) 10);
        org.joda.time.Chronology chronology22 = null;
        java.util.Locale locale23 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket25 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology22, locale23, (java.lang.Integer) 100);
        java.lang.Integer int26 = dateTimeParserBucket25.getPivotYear();
        org.joda.time.DateTimeField dateTimeField27 = null;
        dateTimeParserBucket25.saveField(dateTimeField27, (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone30 = dateTimeParserBucket25.getZone();
        org.joda.time.Chronology chronology32 = null;
        java.util.Locale locale33 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket35 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology32, locale33, (java.lang.Integer) 100);
        java.lang.Integer int36 = dateTimeParserBucket35.getPivotYear();
        org.joda.time.DateTimeField dateTimeField37 = null;
        dateTimeParserBucket35.saveField(dateTimeField37, (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone40 = dateTimeParserBucket35.getZone();
        org.joda.time.Chronology chronology42 = null;
        java.util.Locale locale43 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket45 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology42, locale43, (java.lang.Integer) 100);
        java.lang.Integer int46 = dateTimeParserBucket45.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType47 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean48 = dateTimeParserBucket45.restoreState((java.lang.Object) dateTimeFieldType47);
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.DateTimeField dateTimeField50 = dateTimeFieldType47.getField(chronology49);
        java.util.Locale locale52 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet53 = locale52.getUnicodeLocaleAttributes();
        org.joda.time.Chronology chronology55 = null;
        java.util.Locale locale56 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket58 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology55, locale56, (java.lang.Integer) 100);
        java.lang.String str59 = locale52.getDisplayScript(locale56);
        java.lang.String str60 = dateTimeField50.getAsShortText(10, locale52);
        dateTimeParserBucket35.saveField(dateTimeField50, (int) (byte) 1);
        boolean boolean63 = dateTimeParserBucket25.restoreState((java.lang.Object) dateTimeParserBucket35);
        org.joda.time.DateTimeZone dateTimeZone64 = dateTimeParserBucket35.getZone();
        java.util.TimeZone timeZone65 = dateTimeZone64.toTimeZone();
        long long68 = dateTimeZone64.convertLocalToUTC(100L, true);
        org.joda.time.Chronology chronology69 = chronology9.withZone(dateTimeZone64);
        org.joda.time.DurationField durationField70 = chronology69.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField70, durationField10, and durationField13", !(durationField70.compareTo(durationField10) == 0) || (Math.signum(durationField70.compareTo(durationField13)) == Math.signum(durationField10.compareTo(durationField13))));
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test212");
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        java.lang.Integer int7 = dateTimeParserBucket6.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean9 = dateTimeParserBucket6.restoreState((java.lang.Object) dateTimeFieldType8);
        org.joda.time.Chronology chronology10 = dateTimeParserBucket6.getChronology();
        org.joda.time.DurationField durationField11 = chronology10.days();
        org.joda.time.DurationField durationField12 = chronology10.millis();
        org.joda.time.Chronology chronology14 = null;
        java.util.Locale locale15 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology14, locale15, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket18 = new org.joda.time.format.DateTimeParserBucket(64713600009L, chronology10, locale15);
        org.joda.time.DurationField durationField19 = chronology10.weekyears();
        org.joda.time.DateTimeField dateTimeField20 = chronology10.secondOfDay();
        long long24 = chronology10.add(946684800000L, 1210L, 86399);
        org.joda.time.DateTimeField dateTimeField25 = chronology10.clockhourOfHalfday();
        java.util.Locale locale29 = new java.util.Locale("weekOfWeekyear", "UTC", "+00:00");
        boolean boolean30 = locale29.hasExtensions();
        org.joda.time.Chronology chronology32 = null;
        java.util.Locale locale33 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket35 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology32, locale33, (java.lang.Integer) 100);
        java.lang.String str36 = locale29.getDisplayCountry(locale33);
        java.util.Locale locale37 = locale33.stripExtensions();
        java.lang.String str38 = locale37.getVariant();
        java.util.Locale locale39 = locale37.stripExtensions();
        java.lang.String str40 = locale39.getDisplayName();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket41 = new org.joda.time.format.DateTimeParserBucket(946789342790L, chronology10, locale39);
        org.joda.time.DateTimeField dateTimeField42 = chronology10.millisOfSecond();
        org.joda.time.DurationField durationField43 = chronology10.years();
        org.joda.time.DateTimeField dateTimeField44 = chronology10.millisOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField19 and durationField43", (durationField19.compareTo(durationField43) == 0) == durationField19.equals(durationField43));
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test213");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 100);
        java.lang.Integer int6 = dateTimeParserBucket5.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean8 = dateTimeParserBucket5.restoreState((java.lang.Object) dateTimeFieldType7);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket5.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.years();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.Chronology chronology14 = null;
        java.util.Locale locale15 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology14, locale15, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket18 = new org.joda.time.format.DateTimeParserBucket(100L, chronology12, locale15);
        java.lang.String str19 = locale15.getScript();
        java.lang.String str21 = locale15.getExtension('u');
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket24 = new org.joda.time.format.DateTimeParserBucket(259200117L, chronology9, locale15, (java.lang.Integer) 100, (int) (byte) 1);
        org.joda.time.DateTimeField dateTimeField25 = chronology9.hourOfHalfday();
        org.joda.time.DurationField durationField26 = chronology9.months();
        org.joda.time.DurationField durationField27 = chronology9.months();
        org.joda.time.DurationField durationField28 = chronology9.weekyears();
        org.joda.time.DurationField durationField29 = chronology9.weeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField10 and durationField28", (durationField10.compareTo(durationField28) == 0) == durationField10.equals(durationField28));
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test214");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 100);
        java.lang.Integer int6 = dateTimeParserBucket5.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean8 = dateTimeParserBucket5.restoreState((java.lang.Object) dateTimeFieldType7);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket5.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        org.joda.time.DateTimeZone dateTimeZone11 = chronology9.getZone();
        org.joda.time.DateTimeField dateTimeField12 = chronology9.yearOfCentury();
        java.lang.String str13 = chronology9.toString();
        org.joda.time.Chronology chronology14 = chronology9.withUTC();
        org.joda.time.DateTimeField dateTimeField15 = chronology9.secondOfDay();
        boolean boolean16 = dateTimeFieldType0.isSupported(chronology9);
        java.lang.String str17 = chronology9.toString();
        org.joda.time.DateTimeField dateTimeField18 = chronology9.secondOfMinute();
        org.joda.time.DurationField durationField19 = chronology9.centuries();
        org.joda.time.DateTimeField dateTimeField20 = chronology9.era();
        org.joda.time.DateTimeField dateTimeField21 = chronology9.yearOfEra();
        org.joda.time.Chronology chronology22 = chronology9.withUTC();
        org.joda.time.DurationField durationField23 = chronology9.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField23, durationField10, and durationField19", !(durationField23.compareTo(durationField10) == 0) || (Math.signum(durationField23.compareTo(durationField19)) == Math.signum(durationField10.compareTo(durationField19))));
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test215");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 100);
        java.lang.Integer int6 = dateTimeParserBucket5.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean8 = dateTimeParserBucket5.restoreState((java.lang.Object) dateTimeFieldType7);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket5.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        org.joda.time.DateTimeZone dateTimeZone11 = chronology9.getZone();
        org.joda.time.DurationField durationField12 = chronology9.months();
        org.joda.time.DateTimeField dateTimeField13 = chronology9.dayOfMonth();
        org.joda.time.DurationField durationField14 = chronology9.centuries();
        boolean boolean15 = dateTimeFieldType0.isSupported(chronology9);
        org.joda.time.DurationField durationField16 = chronology9.weekyears();
        org.joda.time.DateTimeField dateTimeField17 = chronology9.secondOfMinute();
        org.joda.time.DurationField durationField18 = chronology9.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField18, durationField10, and durationField12", !(durationField18.compareTo(durationField10) == 0) || (Math.signum(durationField18.compareTo(durationField12)) == Math.signum(durationField10.compareTo(durationField12))));
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test216");
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        java.lang.Integer int7 = dateTimeParserBucket6.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean9 = dateTimeParserBucket6.restoreState((java.lang.Object) dateTimeFieldType8);
        org.joda.time.Chronology chronology10 = dateTimeParserBucket6.getChronology();
        org.joda.time.DurationField durationField11 = chronology10.days();
        org.joda.time.DurationField durationField12 = chronology10.millis();
        org.joda.time.Chronology chronology14 = null;
        java.util.Locale locale15 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology14, locale15, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket18 = new org.joda.time.format.DateTimeParserBucket(64713600009L, chronology10, locale15);
        org.joda.time.DateTimeField dateTimeField19 = chronology10.minuteOfDay();
        org.joda.time.DurationField durationField20 = chronology10.days();
        org.joda.time.DateTimeField dateTimeField21 = chronology10.minuteOfDay();
        long long25 = chronology10.add((long) 'u', 107L, (int) (short) 10);
        org.joda.time.DateTimeField dateTimeField26 = chronology10.year();
        java.util.Locale locale27 = java.util.Locale.ROOT;
        java.util.Locale locale28 = locale27.stripExtensions();
        java.util.Locale locale29 = locale28.stripExtensions();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket31 = new org.joda.time.format.DateTimeParserBucket((-359999998L), chronology10, locale29, (java.lang.Integer) 14);
        org.joda.time.DurationField durationField32 = chronology10.weekyears();
        org.joda.time.DateTimeField dateTimeField33 = chronology10.yearOfEra();
        org.joda.time.DateTimeField dateTimeField34 = chronology10.clockhourOfHalfday();
        org.joda.time.DurationField durationField35 = chronology10.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField35, durationField11, and durationField12", !(durationField35.compareTo(durationField11) == 0) || (Math.signum(durationField35.compareTo(durationField12)) == Math.signum(durationField11.compareTo(durationField12))));
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test217");
        org.joda.time.Chronology chronology4 = null;
        java.util.Locale locale5 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology4, locale5, (java.lang.Integer) 100);
        java.lang.Integer int8 = dateTimeParserBucket7.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean10 = dateTimeParserBucket7.restoreState((java.lang.Object) dateTimeFieldType9);
        org.joda.time.Chronology chronology11 = dateTimeParserBucket7.getChronology();
        org.joda.time.DurationField durationField12 = chronology11.years();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.Chronology chronology16 = null;
        java.util.Locale locale17 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket19 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology16, locale17, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket20 = new org.joda.time.format.DateTimeParserBucket(100L, chronology14, locale17);
        java.lang.String str21 = locale17.getScript();
        java.lang.String str23 = locale17.getExtension('u');
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket26 = new org.joda.time.format.DateTimeParserBucket(259200117L, chronology11, locale17, (java.lang.Integer) 100, (int) (byte) 1);
        org.joda.time.DurationField durationField27 = chronology11.centuries();
        java.util.Locale.Category category28 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale29 = java.util.Locale.GERMANY;
        java.lang.String str30 = locale29.getDisplayCountry();
        java.util.Locale.setDefault(category28, locale29);
        java.util.Locale locale32 = java.util.Locale.getDefault(category28);
        java.util.Locale locale33 = java.util.Locale.getDefault(category28);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket36 = new org.joda.time.format.DateTimeParserBucket(10L, chronology11, locale33, (java.lang.Integer) 100, 31);
        org.joda.time.Chronology chronology37 = chronology11.withUTC();
        org.joda.time.DateTimeField dateTimeField38 = chronology11.halfdayOfDay();
        java.util.Locale.Builder builder39 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder40 = builder39.clear();
        java.util.Locale locale41 = builder40.build();
        java.util.Locale locale42 = locale41.stripExtensions();
        java.lang.String str43 = locale42.getCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket45 = new org.joda.time.format.DateTimeParserBucket(259200048L, chronology11, locale42, (java.lang.Integer) 365);
        org.joda.time.DurationField durationField46 = chronology11.weekyears();
        org.joda.time.DateTimeField dateTimeField47 = chronology11.millisOfSecond();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField12 and durationField46", (durationField12.compareTo(durationField46) == 0) == durationField12.equals(durationField46));
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test218");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 100);
        java.lang.Integer int6 = dateTimeParserBucket5.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean8 = dateTimeParserBucket5.restoreState((java.lang.Object) dateTimeFieldType7);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket5.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        org.joda.time.DateTimeField dateTimeField11 = dateTimeFieldType0.getField(chronology9);
        org.joda.time.DateTimeField dateTimeField12 = chronology9.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.Chronology chronology14 = chronology9.withZone(dateTimeZone13);
        org.joda.time.DateTimeField dateTimeField15 = chronology14.millisOfDay();
        org.joda.time.DateTimeField dateTimeField16 = chronology14.secondOfMinute();
        org.joda.time.DurationField durationField17 = chronology14.days();
        org.joda.time.DateTimeZone dateTimeZone18 = chronology14.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField10 and durationField17", (durationField10.compareTo(durationField17) == 0) == durationField10.equals(durationField17));
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test219");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 100);
        java.lang.Integer int6 = dateTimeParserBucket5.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean8 = dateTimeParserBucket5.restoreState((java.lang.Object) dateTimeFieldType7);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket5.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.years();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.Chronology chronology14 = null;
        java.util.Locale locale15 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology14, locale15, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket18 = new org.joda.time.format.DateTimeParserBucket(100L, chronology12, locale15);
        java.lang.String str19 = locale15.getScript();
        java.lang.String str21 = locale15.getExtension('u');
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket24 = new org.joda.time.format.DateTimeParserBucket(259200117L, chronology9, locale15, (java.lang.Integer) 100, (int) (byte) 1);
        org.joda.time.DateTimeField dateTimeField25 = chronology9.hourOfHalfday();
        org.joda.time.DurationField durationField26 = chronology9.months();
        org.joda.time.DateTimeField dateTimeField27 = chronology9.year();
        org.joda.time.DurationField durationField28 = chronology9.centuries();
        org.joda.time.DateTimeField dateTimeField29 = chronology9.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField30 = chronology9.era();
        org.joda.time.DurationField durationField31 = chronology9.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField31, durationField10, and durationField26", !(durationField31.compareTo(durationField10) == 0) || (Math.signum(durationField31.compareTo(durationField26)) == Math.signum(durationField10.compareTo(durationField26))));
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test220");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 100);
        java.lang.Integer int5 = dateTimeParserBucket4.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean7 = dateTimeParserBucket4.restoreState((java.lang.Object) dateTimeFieldType6);
        org.joda.time.Chronology chronology8 = dateTimeParserBucket4.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeZone dateTimeZone10 = chronology8.getZone();
        org.joda.time.DurationField durationField11 = chronology8.months();
        org.joda.time.DurationField durationField12 = chronology8.hours();
        org.joda.time.DateTimeField dateTimeField13 = chronology8.hourOfDay();
        org.joda.time.DateTimeField dateTimeField14 = chronology8.yearOfEra();
        org.joda.time.Chronology chronology15 = chronology8.withUTC();
        org.joda.time.DurationField durationField16 = chronology15.halfdays();
        org.joda.time.DateTimeField dateTimeField17 = chronology15.dayOfMonth();
        org.joda.time.DurationField durationField18 = chronology15.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField18, durationField9, and durationField11", !(durationField18.compareTo(durationField9) == 0) || (Math.signum(durationField18.compareTo(durationField11)) == Math.signum(durationField9.compareTo(durationField11))));
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test221");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 100);
        java.lang.Integer int6 = dateTimeParserBucket5.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean8 = dateTimeParserBucket5.restoreState((java.lang.Object) dateTimeFieldType7);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket5.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.years();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.Chronology chronology14 = null;
        java.util.Locale locale15 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology14, locale15, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket18 = new org.joda.time.format.DateTimeParserBucket(100L, chronology12, locale15);
        java.lang.String str19 = locale15.getScript();
        java.lang.String str21 = locale15.getExtension('u');
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket24 = new org.joda.time.format.DateTimeParserBucket(259200117L, chronology9, locale15, (java.lang.Integer) 100, (int) (byte) 1);
        org.joda.time.DateTimeField dateTimeField25 = chronology9.hourOfHalfday();
        org.joda.time.DurationField durationField26 = chronology9.months();
        org.joda.time.DurationField durationField27 = chronology9.months();
        org.joda.time.DurationField durationField28 = chronology9.weekyears();
        org.joda.time.DateTimeField dateTimeField29 = chronology9.millisOfSecond();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField10 and durationField28", (durationField10.compareTo(durationField28) == 0) == durationField10.equals(durationField28));
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test222");
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        java.lang.Integer int7 = dateTimeParserBucket6.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean9 = dateTimeParserBucket6.restoreState((java.lang.Object) dateTimeFieldType8);
        org.joda.time.Chronology chronology10 = dateTimeParserBucket6.getChronology();
        org.joda.time.DurationField durationField11 = chronology10.years();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.Chronology chronology15 = null;
        java.util.Locale locale16 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket18 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology15, locale16, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket19 = new org.joda.time.format.DateTimeParserBucket(100L, chronology13, locale16);
        java.lang.String str20 = locale16.getScript();
        java.lang.String str22 = locale16.getExtension('u');
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket25 = new org.joda.time.format.DateTimeParserBucket(259200117L, chronology10, locale16, (java.lang.Integer) 100, (int) (byte) 1);
        org.joda.time.DateTimeField dateTimeField26 = chronology10.hourOfHalfday();
        org.joda.time.DurationField durationField27 = chronology10.minutes();
        java.util.Locale.Builder builder28 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder29 = builder28.clear();
        java.util.Locale locale30 = builder29.build();
        java.util.Locale locale31 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str32 = locale30.getDisplayLanguage(locale31);
        java.util.Set<java.lang.String> strSet33 = locale31.getUnicodeLocaleKeys();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket36 = new org.joda.time.format.DateTimeParserBucket(2L, chronology10, locale31, (java.lang.Integer) 100, (int) (short) 10);
        long long40 = chronology10.add(32054400100L, 604800053L, (int) 'u');
        org.joda.time.DateTimeField dateTimeField41 = chronology10.era();
        org.joda.time.DateTimeField dateTimeField42 = chronology10.clockhourOfHalfday();
        org.joda.time.DurationField durationField43 = chronology10.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField43, durationField11, and durationField27", !(durationField43.compareTo(durationField11) == 0) || (Math.signum(durationField43.compareTo(durationField27)) == Math.signum(durationField11.compareTo(durationField27))));
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test223");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 100);
        java.lang.Integer int5 = dateTimeParserBucket4.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean7 = dateTimeParserBucket4.restoreState((java.lang.Object) dateTimeFieldType6);
        org.joda.time.Chronology chronology8 = dateTimeParserBucket4.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.era();
        java.lang.String str11 = chronology8.toString();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField13 = chronology8.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField14 = chronology8.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField15 = chronology8.era();
        org.joda.time.DurationField durationField16 = chronology8.eras();
        org.joda.time.DateTimeField dateTimeField17 = chronology8.yearOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField9 and durationField16", Math.signum(durationField9.compareTo(durationField16)) == -Math.signum(durationField16.compareTo(durationField9)));
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test224");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 100);
        java.lang.Integer int5 = dateTimeParserBucket4.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean7 = dateTimeParserBucket4.restoreState((java.lang.Object) dateTimeFieldType6);
        org.joda.time.Chronology chronology8 = dateTimeParserBucket4.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeZone dateTimeZone10 = chronology8.getZone();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.yearOfCentury();
        org.joda.time.DurationField durationField12 = chronology8.years();
        org.joda.time.DateTimeField dateTimeField13 = chronology8.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField14 = chronology8.weekOfWeekyear();
        org.joda.time.DurationField durationField15 = chronology8.seconds();
        org.joda.time.DurationField durationField16 = chronology8.centuries();
        org.joda.time.DurationField durationField17 = chronology8.weekyears();
        org.joda.time.DateTimeField dateTimeField18 = chronology8.dayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField12 and durationField17", (durationField12.compareTo(durationField17) == 0) == durationField12.equals(durationField17));
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test225");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 100);
        java.lang.Integer int6 = dateTimeParserBucket5.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean8 = dateTimeParserBucket5.restoreState((java.lang.Object) dateTimeFieldType7);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket5.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        org.joda.time.DateTimeZone dateTimeZone11 = chronology9.getZone();
        org.joda.time.DurationField durationField12 = chronology9.months();
        org.joda.time.DateTimeField dateTimeField13 = chronology9.dayOfMonth();
        org.joda.time.DurationField durationField14 = chronology9.centuries();
        boolean boolean15 = dateTimeFieldType0.isSupported(chronology9);
        org.joda.time.DurationField durationField16 = chronology9.weekyears();
        org.joda.time.DateTimeField dateTimeField17 = chronology9.secondOfMinute();
        org.joda.time.DurationField durationField18 = chronology9.years();
        org.joda.time.DateTimeZone dateTimeZone19 = chronology9.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField16 and durationField18", (durationField16.compareTo(durationField18) == 0) == durationField16.equals(durationField18));
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test226");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 100);
        java.lang.Integer int5 = dateTimeParserBucket4.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean7 = dateTimeParserBucket4.restoreState((java.lang.Object) dateTimeFieldType6);
        org.joda.time.Chronology chronology8 = dateTimeParserBucket4.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.years();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.secondOfDay();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.monthOfYear();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField13 = chronology8.era();
        org.joda.time.DurationField durationField14 = chronology8.weekyears();
        org.joda.time.DurationField durationField15 = chronology8.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField9 and durationField14", (durationField9.compareTo(durationField14) == 0) == durationField9.equals(durationField14));
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test227");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 100);
        java.lang.Integer int5 = dateTimeParserBucket4.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean7 = dateTimeParserBucket4.restoreState((java.lang.Object) dateTimeFieldType6);
        org.joda.time.Chronology chronology8 = dateTimeParserBucket4.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeZone dateTimeZone10 = chronology8.getZone();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.yearOfCentury();
        org.joda.time.DurationField durationField12 = chronology8.years();
        java.lang.String str13 = chronology8.toString();
        org.joda.time.DateTimeField dateTimeField14 = chronology8.clockhourOfHalfday();
        org.joda.time.DurationField durationField15 = chronology8.weekyears();
        java.lang.Class<?> wildcardClass16 = chronology8.getClass();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField12 and durationField15", (durationField12.compareTo(durationField15) == 0) == durationField12.equals(durationField15));
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test228");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 100);
        java.lang.Integer int6 = dateTimeParserBucket5.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean8 = dateTimeParserBucket5.restoreState((java.lang.Object) dateTimeFieldType7);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket5.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        org.joda.time.DateTimeField dateTimeField11 = dateTimeFieldType0.getField(chronology9);
        org.joda.time.DateTimeField dateTimeField12 = chronology9.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField13 = chronology9.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField14 = chronology9.yearOfEra();
        org.joda.time.DateTimeField dateTimeField15 = chronology9.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField16 = chronology9.dayOfYear();
        org.joda.time.DateTimeField dateTimeField17 = chronology9.hourOfDay();
        org.joda.time.DateTimeField dateTimeField18 = chronology9.clockhourOfHalfday();
        org.joda.time.DurationField durationField19 = chronology9.days();
        org.joda.time.DateTimeField dateTimeField20 = chronology9.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField21 = chronology9.dayOfMonth();
        org.joda.time.DurationField durationField22 = chronology9.eras();
        org.joda.time.DurationField durationField23 = chronology9.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField10 and durationField22", Math.signum(durationField10.compareTo(durationField22)) == -Math.signum(durationField22.compareTo(durationField10)));
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test229");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 100);
        java.lang.Integer int6 = dateTimeParserBucket5.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean8 = dateTimeParserBucket5.restoreState((java.lang.Object) dateTimeFieldType7);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket5.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        org.joda.time.DurationField durationField11 = chronology9.millis();
        org.joda.time.Chronology chronology13 = null;
        java.util.Locale locale14 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology13, locale14, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket(64713600009L, chronology9, locale14);
        java.lang.String str18 = chronology9.toString();
        org.joda.time.DateTimeField dateTimeField19 = chronology9.clockhourOfHalfday();
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = dateTimeField19.getType();
        java.lang.String str21 = dateTimeFieldType20.toString();
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.Chronology chronology25 = null;
        java.util.Locale locale26 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket28 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology25, locale26, (java.lang.Integer) 100);
        java.lang.Integer int29 = dateTimeParserBucket28.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean31 = dateTimeParserBucket28.restoreState((java.lang.Object) dateTimeFieldType30);
        org.joda.time.Chronology chronology32 = dateTimeParserBucket28.getChronology();
        org.joda.time.DurationField durationField33 = chronology32.days();
        org.joda.time.DateTimeField dateTimeField34 = dateTimeFieldType23.getField(chronology32);
        org.joda.time.DateTimeField dateTimeField35 = chronology32.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField36 = chronology32.weekOfWeekyear();
        java.lang.String str37 = chronology32.toString();
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        long long41 = dateTimeZone39.convertUTCToLocal((long) (short) -1);
        org.joda.time.Chronology chronology43 = null;
        java.util.Locale locale44 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket46 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology43, locale44, (java.lang.Integer) 100);
        java.lang.Integer int47 = dateTimeParserBucket46.getPivotYear();
        org.joda.time.DateTimeField dateTimeField48 = null;
        dateTimeParserBucket46.saveField(dateTimeField48, (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone51 = dateTimeParserBucket46.getZone();
        long long53 = dateTimeZone39.getMillisKeepLocal(dateTimeZone51, 97L);
        java.lang.String str55 = dateTimeZone39.getShortName(0L);
        java.util.TimeZone timeZone57 = null;
        org.joda.time.DateTimeZone dateTimeZone58 = org.joda.time.DateTimeZone.forTimeZone(timeZone57);
        java.util.Locale locale63 = new java.util.Locale("weekOfWeekyear", "UTC", "+00:00");
        boolean boolean64 = locale63.hasExtensions();
        org.joda.time.Chronology chronology66 = null;
        java.util.Locale locale67 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket69 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology66, locale67, (java.lang.Integer) 100);
        java.lang.String str70 = locale63.getDisplayCountry(locale67);
        java.lang.String str71 = dateTimeZone58.getShortName((long) (short) 1, locale67);
        java.lang.String str72 = dateTimeZone39.getName((long) 'u', locale67);
        org.joda.time.Chronology chronology73 = chronology32.withZone(dateTimeZone39);
        boolean boolean74 = dateTimeFieldType22.isSupported(chronology32);
        org.joda.time.DateTimeField dateTimeField75 = chronology32.yearOfEra();
        org.joda.time.Chronology chronology76 = chronology32.withUTC();
        org.joda.time.DateTimeField dateTimeField77 = chronology76.year();
        org.joda.time.DateTimeField dateTimeField78 = dateTimeFieldType20.getField(chronology76);
        org.joda.time.DurationField durationField79 = chronology76.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField79, durationField10, and durationField11", !(durationField79.compareTo(durationField10) == 0) || (Math.signum(durationField79.compareTo(durationField11)) == Math.signum(durationField10.compareTo(durationField11))));
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test230");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 100);
        java.lang.Integer int5 = dateTimeParserBucket4.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean7 = dateTimeParserBucket4.restoreState((java.lang.Object) dateTimeFieldType6);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateTimeField dateTimeField9 = dateTimeFieldType6.getField(chronology8);
        org.joda.time.Chronology chronology13 = null;
        java.util.Locale locale14 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology13, locale14, (java.lang.Integer) 100);
        java.lang.Integer int17 = dateTimeParserBucket16.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean19 = dateTimeParserBucket16.restoreState((java.lang.Object) dateTimeFieldType18);
        org.joda.time.Chronology chronology20 = dateTimeParserBucket16.getChronology();
        org.joda.time.DurationField durationField21 = chronology20.years();
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.Chronology chronology25 = null;
        java.util.Locale locale26 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket28 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology25, locale26, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket29 = new org.joda.time.format.DateTimeParserBucket(100L, chronology23, locale26);
        java.lang.String str30 = locale26.getScript();
        java.lang.String str32 = locale26.getExtension('u');
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket35 = new org.joda.time.format.DateTimeParserBucket(259200117L, chronology20, locale26, (java.lang.Integer) 100, (int) (byte) 1);
        org.joda.time.DateTimeField dateTimeField36 = chronology20.hourOfHalfday();
        org.joda.time.DurationField durationField37 = chronology20.minutes();
        java.util.Locale.Builder builder38 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder39 = builder38.clear();
        java.util.Locale locale40 = builder39.build();
        java.util.Locale locale41 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str42 = locale40.getDisplayLanguage(locale41);
        java.util.Set<java.lang.String> strSet43 = locale41.getUnicodeLocaleKeys();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket46 = new org.joda.time.format.DateTimeParserBucket(2L, chronology20, locale41, (java.lang.Integer) 100, (int) (short) 10);
        long long50 = chronology20.add(32054400100L, 604800053L, (int) 'u');
        org.joda.time.DateTimeField dateTimeField51 = dateTimeFieldType6.getField(chronology20);
        org.joda.time.DurationField durationField52 = dateTimeField51.getRangeDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType53 = dateTimeField51.getType();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField21 and durationField52", (durationField21.compareTo(durationField52) == 0) == durationField21.equals(durationField52));
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test231");
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        java.lang.Integer int7 = dateTimeParserBucket6.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean9 = dateTimeParserBucket6.restoreState((java.lang.Object) dateTimeFieldType8);
        org.joda.time.Chronology chronology10 = dateTimeParserBucket6.getChronology();
        org.joda.time.DurationField durationField11 = chronology10.days();
        org.joda.time.DurationField durationField12 = chronology10.millis();
        org.joda.time.Chronology chronology14 = null;
        java.util.Locale locale15 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology14, locale15, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket18 = new org.joda.time.format.DateTimeParserBucket(64713600009L, chronology10, locale15);
        org.joda.time.DurationField durationField19 = chronology10.weekyears();
        java.util.Locale locale20 = java.util.Locale.ITALIAN;
        java.util.Locale locale21 = locale20.stripExtensions();
        java.util.Locale locale22 = java.util.Locale.GERMAN;
        java.lang.String str23 = locale21.getDisplayVariant(locale22);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket26 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology10, locale21, (java.lang.Integer) 100, 31);
        org.joda.time.DateTimeField dateTimeField27 = chronology10.era();
        org.joda.time.DurationField durationField28 = chronology10.halfdays();
        org.joda.time.DateTimeField dateTimeField29 = chronology10.era();
        org.joda.time.DurationField durationField30 = chronology10.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField30, durationField11, and durationField12", !(durationField30.compareTo(durationField11) == 0) || (Math.signum(durationField30.compareTo(durationField12)) == Math.signum(durationField11.compareTo(durationField12))));
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test232");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 100);
        java.lang.Integer int5 = dateTimeParserBucket4.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean7 = dateTimeParserBucket4.restoreState((java.lang.Object) dateTimeFieldType6);
        org.joda.time.Chronology chronology8 = dateTimeParserBucket4.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        long long13 = chronology8.add(readablePeriod10, 0L, 0);
        org.joda.time.DateTimeField dateTimeField14 = chronology8.weekyear();
        org.joda.time.DateTimeField dateTimeField15 = chronology8.year();
        long long19 = chronology8.add(2L, (long) (short) 10, (-9));
        org.joda.time.DateTimeField dateTimeField20 = chronology8.weekyear();
        org.joda.time.DateTimeField dateTimeField21 = chronology8.centuryOfEra();
        org.joda.time.DurationField durationField22 = chronology8.centuries();
        org.joda.time.DateTimeField dateTimeField23 = chronology8.weekOfWeekyear();
        org.joda.time.DurationField durationField24 = chronology8.weekyears();
        org.joda.time.DurationField durationField25 = chronology8.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField25, durationField9, and durationField22", !(durationField25.compareTo(durationField9) == 0) || (Math.signum(durationField25.compareTo(durationField22)) == Math.signum(durationField9.compareTo(durationField22))));
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test233");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.DurationFieldType durationFieldType1 = dateTimeFieldType0.getDurationType();
        java.lang.String str2 = dateTimeFieldType0.toString();
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        org.joda.time.Chronology chronology5 = null;
        java.util.Locale locale6 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology5, locale6, (java.lang.Integer) 100);
        java.lang.Integer int9 = dateTimeParserBucket8.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean11 = dateTimeParserBucket8.restoreState((java.lang.Object) dateTimeFieldType10);
        org.joda.time.Chronology chronology12 = dateTimeParserBucket8.getChronology();
        org.joda.time.DurationField durationField13 = chronology12.days();
        org.joda.time.DateTimeZone dateTimeZone14 = chronology12.getZone();
        org.joda.time.DateTimeField dateTimeField15 = chronology12.monthOfYear();
        org.joda.time.DateTimeField dateTimeField16 = chronology12.weekyear();
        org.joda.time.DurationField durationField17 = chronology12.minutes();
        org.joda.time.DateTimeField dateTimeField18 = dateTimeFieldType3.getField(chronology12);
        boolean boolean19 = dateTimeFieldType0.isSupported(chronology12);
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str21 = dateTimeFieldType20.getName();
        org.joda.time.Chronology chronology24 = null;
        java.util.Locale locale25 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket27 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology24, locale25, (java.lang.Integer) 100);
        java.lang.Integer int28 = dateTimeParserBucket27.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean30 = dateTimeParserBucket27.restoreState((java.lang.Object) dateTimeFieldType29);
        org.joda.time.Chronology chronology31 = dateTimeParserBucket27.getChronology();
        org.joda.time.DurationField durationField32 = chronology31.days();
        org.joda.time.DurationField durationField33 = chronology31.millis();
        org.joda.time.Chronology chronology35 = null;
        java.util.Locale locale36 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket38 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology35, locale36, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket39 = new org.joda.time.format.DateTimeParserBucket(64713600009L, chronology31, locale36);
        org.joda.time.DateTimeField dateTimeField40 = chronology31.minuteOfDay();
        org.joda.time.DurationField durationField41 = chronology31.days();
        boolean boolean42 = dateTimeFieldType20.isSupported(chronology31);
        org.joda.time.DateTimeField dateTimeField43 = chronology31.clockhourOfDay();
        boolean boolean44 = dateTimeFieldType0.isSupported(chronology31);
        org.joda.time.DateTimeField dateTimeField45 = chronology31.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField46 = chronology31.clockhourOfHalfday();
        org.joda.time.DurationField durationField47 = chronology31.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField47, durationField13, and durationField17", !(durationField47.compareTo(durationField13) == 0) || (Math.signum(durationField47.compareTo(durationField17)) == Math.signum(durationField13.compareTo(durationField17))));
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test234");
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        java.lang.Integer int7 = dateTimeParserBucket6.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean9 = dateTimeParserBucket6.restoreState((java.lang.Object) dateTimeFieldType8);
        org.joda.time.Chronology chronology10 = dateTimeParserBucket6.getChronology();
        org.joda.time.DurationField durationField11 = chronology10.days();
        org.joda.time.DateTimeZone dateTimeZone12 = chronology10.getZone();
        org.joda.time.DateTimeField dateTimeField13 = chronology10.monthOfYear();
        org.joda.time.DateTimeField dateTimeField14 = chronology10.weekyear();
        org.joda.time.DurationField durationField15 = chronology10.minutes();
        org.joda.time.DateTimeField dateTimeField16 = dateTimeFieldType1.getField(chronology10);
        org.joda.time.DateTimeField dateTimeField17 = chronology10.minuteOfDay();
        org.joda.time.Chronology chronology20 = null;
        java.util.Locale locale21 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket23 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology20, locale21, (java.lang.Integer) 100);
        java.lang.Integer int24 = dateTimeParserBucket23.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean26 = dateTimeParserBucket23.restoreState((java.lang.Object) dateTimeFieldType25);
        org.joda.time.Chronology chronology27 = dateTimeParserBucket23.getChronology();
        org.joda.time.Chronology chronology29 = null;
        java.util.Locale locale30 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket32 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology29, locale30, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket35 = new org.joda.time.format.DateTimeParserBucket((-1L), chronology27, locale30, (java.lang.Integer) 0, (int) '#');
        java.util.Set<java.lang.String> strSet36 = locale30.getUnicodeLocaleAttributes();
        java.lang.String str37 = locale30.getISO3Country();
        java.lang.String str38 = locale30.getDisplayName();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket41 = new org.joda.time.format.DateTimeParserBucket(54L, chronology10, locale30, (java.lang.Integer) 3600000, (int) (short) 0);
        long long45 = chronology10.add(100L, 70010L, 86399999);
        org.joda.time.DurationField durationField46 = chronology10.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField46, durationField11, and durationField15", !(durationField46.compareTo(durationField11) == 0) || (Math.signum(durationField46.compareTo(durationField15)) == Math.signum(durationField11.compareTo(durationField15))));
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test235");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 100);
        java.lang.Integer int6 = dateTimeParserBucket5.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean8 = dateTimeParserBucket5.restoreState((java.lang.Object) dateTimeFieldType7);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket5.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.years();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.Chronology chronology14 = null;
        java.util.Locale locale15 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology14, locale15, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket18 = new org.joda.time.format.DateTimeParserBucket(100L, chronology12, locale15);
        java.lang.String str19 = locale15.getScript();
        java.lang.String str21 = locale15.getExtension('u');
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket24 = new org.joda.time.format.DateTimeParserBucket(259200117L, chronology9, locale15, (java.lang.Integer) 100, (int) (byte) 1);
        org.joda.time.Chronology chronology25 = dateTimeParserBucket24.getChronology();
        org.joda.time.DateTimeField dateTimeField26 = chronology25.dayOfMonth();
        org.joda.time.DurationField durationField27 = chronology25.weekyears();
        long long31 = chronology25.add(0L, 61084800010L, 99);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField10 and durationField27", (durationField10.compareTo(durationField27) == 0) == durationField10.equals(durationField27));
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test236");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 100);
        java.lang.Integer int5 = dateTimeParserBucket4.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean7 = dateTimeParserBucket4.restoreState((java.lang.Object) dateTimeFieldType6);
        org.joda.time.Chronology chronology8 = dateTimeParserBucket4.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeZone dateTimeZone10 = chronology8.getZone();
        org.joda.time.DurationField durationField11 = chronology8.months();
        org.joda.time.DurationField durationField12 = chronology8.seconds();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone14);
        long long17 = dateTimeZone14.nextTransition(64713600009L);
        int int19 = dateTimeZone14.getStandardOffset(6652801000L);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.Chronology chronology24 = null;
        java.util.Locale locale25 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket27 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology24, locale25, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket28 = new org.joda.time.format.DateTimeParserBucket(100L, chronology22, locale25);
        java.lang.String str29 = locale25.getScript();
        java.util.Set<java.lang.String> strSet30 = locale25.getUnicodeLocaleKeys();
        java.lang.String str31 = locale25.getDisplayCountry();
        java.lang.String str32 = dateTimeZone14.getName(259286399L, locale25);
        org.joda.time.LocalDateTime localDateTime33 = null;
        boolean boolean34 = dateTimeZone14.isLocalDateTimeGap(localDateTime33);
        org.joda.time.Chronology chronology35 = chronology8.withZone(dateTimeZone14);
        org.joda.time.DateTimeField dateTimeField36 = chronology8.millisOfDay();
        org.joda.time.DateTimeField dateTimeField37 = chronology8.yearOfCentury();
        org.joda.time.DurationField durationField38 = chronology8.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField38, durationField9, and durationField11", !(durationField38.compareTo(durationField9) == 0) || (Math.signum(durationField38.compareTo(durationField11)) == Math.signum(durationField9.compareTo(durationField11))));
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test237");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 100);
        java.lang.Integer int6 = dateTimeParserBucket5.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean8 = dateTimeParserBucket5.restoreState((java.lang.Object) dateTimeFieldType7);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket5.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        org.joda.time.DateTimeZone dateTimeZone11 = chronology9.getZone();
        org.joda.time.DateTimeField dateTimeField12 = chronology9.yearOfCentury();
        org.joda.time.DurationField durationField13 = chronology9.years();
        org.joda.time.DateTimeField dateTimeField14 = chronology9.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField15 = chronology9.weekOfWeekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.Chronology chronology18 = null;
        java.util.Locale locale19 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket21 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology18, locale19, (java.lang.Integer) 100);
        java.lang.Integer int22 = dateTimeParserBucket21.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean24 = dateTimeParserBucket21.restoreState((java.lang.Object) dateTimeFieldType23);
        org.joda.time.Chronology chronology25 = dateTimeParserBucket21.getChronology();
        org.joda.time.DurationField durationField26 = chronology25.days();
        org.joda.time.DateTimeZone dateTimeZone27 = chronology25.getZone();
        org.joda.time.DurationField durationField28 = chronology25.months();
        org.joda.time.DurationField durationField29 = chronology25.hours();
        org.joda.time.DateTimeField dateTimeField30 = chronology25.hourOfDay();
        org.joda.time.DateTimeField dateTimeField31 = dateTimeFieldType16.getField(chronology25);
        org.joda.time.DateTimeField dateTimeField32 = chronology25.millisOfSecond();
        org.joda.time.ReadablePartial readablePartial33 = null;
        org.joda.time.Chronology chronology36 = null;
        java.util.Locale locale37 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket39 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology36, locale37, (java.lang.Integer) 100);
        java.lang.Integer int40 = dateTimeParserBucket39.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean42 = dateTimeParserBucket39.restoreState((java.lang.Object) dateTimeFieldType41);
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.DateTimeField dateTimeField44 = dateTimeFieldType41.getField(chronology43);
        long long46 = dateTimeField44.roundHalfEven(1L);
        java.util.Locale locale47 = java.util.Locale.CHINESE;
        java.lang.String str48 = locale47.toLanguageTag();
        java.lang.String str49 = locale47.getDisplayScript();
        int int50 = dateTimeField44.getMaximumShortTextLength(locale47);
        java.util.Set<java.lang.Character> charSet51 = locale47.getExtensionKeys();
        java.util.Locale locale52 = java.util.Locale.GERMAN;
        java.util.Locale locale53 = java.util.Locale.getDefault();
        java.lang.String str54 = locale52.getDisplayVariant(locale53);
        java.lang.String str55 = locale47.getDisplayScript(locale52);
        java.lang.String str56 = locale52.getISO3Language();
        java.lang.String str57 = dateTimeField32.getAsShortText(readablePartial33, 0, locale52);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket59 = new org.joda.time.format.DateTimeParserBucket(1219855139999L, chronology9, locale52, (java.lang.Integer) 24);
        org.joda.time.DateTimeZone dateTimeZone61 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str62 = dateTimeZone61.getID();
        long long64 = dateTimeZone61.previousTransition((long) 'a');
        boolean boolean65 = dateTimeZone61.isFixed();
        java.lang.String str67 = dateTimeZone61.getShortName((long) (short) 100);
        java.lang.String str69 = dateTimeZone61.getName((long) 86399);
        org.joda.time.Chronology chronology70 = chronology9.withZone(dateTimeZone61);
        org.joda.time.Chronology chronology71 = chronology9.withUTC();
        org.joda.time.DateTimeField dateTimeField72 = chronology71.yearOfCentury();
        org.joda.time.DurationField durationField73 = chronology71.weekyears();
        org.joda.time.DateTimeField dateTimeField74 = chronology71.yearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField13 and durationField73", (durationField13.compareTo(durationField73) == 0) == durationField13.equals(durationField73));
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test238");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 100);
        java.lang.Integer int6 = dateTimeParserBucket5.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean8 = dateTimeParserBucket5.restoreState((java.lang.Object) dateTimeFieldType7);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket5.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        org.joda.time.DateTimeField dateTimeField11 = dateTimeFieldType0.getField(chronology9);
        org.joda.time.DateTimeField dateTimeField12 = chronology9.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.Chronology chronology14 = chronology9.withZone(dateTimeZone13);
        org.joda.time.DateTimeField dateTimeField15 = chronology9.secondOfMinute();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.Chronology chronology19 = null;
        java.util.Locale locale20 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket22 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology19, locale20, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket23 = new org.joda.time.format.DateTimeParserBucket(100L, chronology17, locale20);
        int int24 = dateTimeParserBucket23.getOffset();
        java.lang.Object obj25 = dateTimeParserBucket23.saveState();
        java.util.Locale locale26 = dateTimeParserBucket23.getLocale();
        org.joda.time.DateTimeZone dateTimeZone27 = dateTimeParserBucket23.getZone();
        boolean boolean28 = dateTimeZone27.isFixed();
        org.joda.time.Chronology chronology29 = chronology9.withZone(dateTimeZone27);
        org.joda.time.DurationField durationField30 = chronology9.weekyears();
        org.joda.time.DurationField durationField31 = chronology9.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField31, durationField10, and durationField30", !(durationField31.compareTo(durationField10) == 0) || (Math.signum(durationField31.compareTo(durationField30)) == Math.signum(durationField10.compareTo(durationField30))));
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test239");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.DurationFieldType durationFieldType1 = dateTimeFieldType0.getDurationType();
        org.joda.time.Chronology chronology4 = null;
        java.util.Locale locale5 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology4, locale5, (java.lang.Integer) 100);
        java.lang.Integer int8 = dateTimeParserBucket7.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean10 = dateTimeParserBucket7.restoreState((java.lang.Object) dateTimeFieldType9);
        org.joda.time.Chronology chronology11 = dateTimeParserBucket7.getChronology();
        org.joda.time.DurationField durationField12 = chronology11.days();
        org.joda.time.DurationField durationField13 = chronology11.millis();
        org.joda.time.Chronology chronology15 = null;
        java.util.Locale locale16 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket18 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology15, locale16, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket19 = new org.joda.time.format.DateTimeParserBucket(64713600009L, chronology11, locale16);
        org.joda.time.Chronology chronology21 = null;
        java.util.Locale locale22 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket24 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology21, locale22, (java.lang.Integer) 100);
        java.lang.Integer int25 = dateTimeParserBucket24.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean27 = dateTimeParserBucket24.restoreState((java.lang.Object) dateTimeFieldType26);
        org.joda.time.Chronology chronology28 = dateTimeParserBucket24.getChronology();
        org.joda.time.DurationField durationField29 = chronology28.days();
        org.joda.time.DurationField durationField30 = chronology28.hours();
        org.joda.time.DateTimeZone dateTimeZone31 = chronology28.getZone();
        java.util.TimeZone timeZone32 = dateTimeZone31.toTimeZone();
        org.joda.time.Chronology chronology33 = chronology11.withZone(dateTimeZone31);
        org.joda.time.DateTimeField dateTimeField34 = dateTimeFieldType0.getField(chronology11);
        org.joda.time.DateTimeField dateTimeField35 = chronology11.era();
        org.joda.time.DurationField durationField36 = chronology11.seconds();
        org.joda.time.DateTimeField dateTimeField37 = chronology11.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField38 = chronology11.clockhourOfDay();
        org.joda.time.DurationField durationField39 = chronology11.centuries();
        org.joda.time.DateTimeField dateTimeField40 = chronology11.millisOfDay();
        org.joda.time.DurationField durationField41 = chronology11.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField41, durationField12, and durationField13", !(durationField41.compareTo(durationField12) == 0) || (Math.signum(durationField41.compareTo(durationField13)) == Math.signum(durationField12.compareTo(durationField13))));
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test240");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 100);
        java.lang.Integer int6 = dateTimeParserBucket5.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean8 = dateTimeParserBucket5.restoreState((java.lang.Object) dateTimeFieldType7);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket5.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        org.joda.time.DurationField durationField11 = chronology9.millis();
        org.joda.time.Chronology chronology13 = null;
        java.util.Locale locale14 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology13, locale14, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket(64713600009L, chronology9, locale14);
        org.joda.time.DurationField durationField18 = chronology9.millis();
        org.joda.time.DateTimeField dateTimeField19 = chronology9.yearOfEra();
        org.joda.time.DateTimeField dateTimeField20 = chronology9.weekyear();
        org.joda.time.DateTimeField dateTimeField21 = chronology9.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField22 = chronology9.dayOfMonth();
        org.joda.time.DurationField durationField23 = chronology9.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField23, durationField10, and durationField11", !(durationField23.compareTo(durationField10) == 0) || (Math.signum(durationField23.compareTo(durationField11)) == Math.signum(durationField10.compareTo(durationField11))));
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test241");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 100);
        java.lang.Integer int5 = dateTimeParserBucket4.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean7 = dateTimeParserBucket4.restoreState((java.lang.Object) dateTimeFieldType6);
        org.joda.time.Chronology chronology8 = dateTimeParserBucket4.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DurationField durationField10 = chronology8.hours();
        org.joda.time.DateTimeZone dateTimeZone11 = chronology8.getZone();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField13 = chronology8.millisOfDay();
        long long17 = chronology8.add((-10L), (long) (short) 1, (-1));
        org.joda.time.DateTimeField dateTimeField18 = chronology8.era();
        org.joda.time.DurationField durationField19 = dateTimeField18.getDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField19, durationField9, and durationField10", !(durationField19.compareTo(durationField9) == 0) || (Math.signum(durationField19.compareTo(durationField10)) == Math.signum(durationField9.compareTo(durationField10))));
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test242");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 100);
        java.lang.Integer int6 = dateTimeParserBucket5.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean8 = dateTimeParserBucket5.restoreState((java.lang.Object) dateTimeFieldType7);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket5.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        org.joda.time.DateTimeZone dateTimeZone11 = chronology9.getZone();
        org.joda.time.Chronology chronology13 = null;
        java.util.Locale locale14 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology13, locale14, (java.lang.Integer) 100);
        java.lang.String str17 = locale14.getCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket20 = new org.joda.time.format.DateTimeParserBucket(0L, chronology9, locale14, (java.lang.Integer) 100, (int) (byte) 1);
        org.joda.time.DurationField durationField21 = chronology9.halfdays();
        org.joda.time.DateTimeField dateTimeField22 = chronology9.dayOfYear();
        org.joda.time.DateTimeField dateTimeField23 = chronology9.era();
        org.joda.time.DurationField durationField24 = dateTimeField23.getRangeDurationField();
        org.joda.time.DurationField durationField25 = dateTimeField23.getDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField25, durationField10, and durationField21", !(durationField25.compareTo(durationField10) == 0) || (Math.signum(durationField25.compareTo(durationField21)) == Math.signum(durationField10.compareTo(durationField21))));
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test243");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 100);
        java.lang.Integer int6 = dateTimeParserBucket5.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean8 = dateTimeParserBucket5.restoreState((java.lang.Object) dateTimeFieldType7);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket5.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        org.joda.time.DateTimeField dateTimeField11 = dateTimeFieldType0.getField(chronology9);
        org.joda.time.DateTimeField dateTimeField12 = chronology9.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField13 = chronology9.clockhourOfDay();
        org.joda.time.DurationField durationField14 = chronology9.months();
        org.joda.time.DateTimeField dateTimeField15 = chronology9.era();
        org.joda.time.DurationField durationField16 = dateTimeField15.getDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField16, durationField10, and durationField14", !(durationField16.compareTo(durationField10) == 0) || (Math.signum(durationField16.compareTo(durationField14)) == Math.signum(durationField10.compareTo(durationField14))));
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test244");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 100);
        java.lang.Integer int5 = dateTimeParserBucket4.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean7 = dateTimeParserBucket4.restoreState((java.lang.Object) dateTimeFieldType6);
        org.joda.time.Chronology chronology8 = dateTimeParserBucket4.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeZone dateTimeZone10 = chronology8.getZone();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.yearOfCentury();
        org.joda.time.DurationField durationField12 = chronology8.years();
        org.joda.time.DateTimeField dateTimeField13 = chronology8.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField14 = chronology8.weekOfWeekyear();
        org.joda.time.DurationField durationField15 = chronology8.seconds();
        org.joda.time.DurationField durationField16 = chronology8.centuries();
        org.joda.time.DurationField durationField17 = chronology8.weekyears();
        org.joda.time.DateTimeField dateTimeField18 = chronology8.yearOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField12 and durationField17", (durationField12.compareTo(durationField17) == 0) == durationField12.equals(durationField17));
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test245");
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        java.lang.Integer int7 = dateTimeParserBucket6.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean9 = dateTimeParserBucket6.restoreState((java.lang.Object) dateTimeFieldType8);
        org.joda.time.Chronology chronology10 = dateTimeParserBucket6.getChronology();
        org.joda.time.DurationField durationField11 = chronology10.days();
        org.joda.time.DateTimeZone dateTimeZone12 = chronology10.getZone();
        org.joda.time.Chronology chronology14 = null;
        java.util.Locale locale15 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology14, locale15, (java.lang.Integer) 100);
        java.lang.String str18 = locale15.getCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket21 = new org.joda.time.format.DateTimeParserBucket(0L, chronology10, locale15, (java.lang.Integer) 100, (int) (byte) 1);
        org.joda.time.DateTimeField dateTimeField22 = chronology10.centuryOfEra();
        java.util.Locale locale23 = java.util.Locale.ITALY;
        java.lang.String str24 = locale23.getScript();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket26 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology10, locale23, (java.lang.Integer) 31);
        org.joda.time.DurationField durationField27 = chronology10.eras();
        org.joda.time.DateTimeField dateTimeField28 = chronology10.monthOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField11 and durationField27", Math.signum(durationField11.compareTo(durationField27)) == -Math.signum(durationField27.compareTo(durationField11)));
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test246");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 100);
        java.lang.Integer int6 = dateTimeParserBucket5.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean8 = dateTimeParserBucket5.restoreState((java.lang.Object) dateTimeFieldType7);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket5.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.years();
        java.util.Locale locale11 = java.util.Locale.getDefault();
        java.lang.String str12 = locale11.getISO3Country();
        java.lang.String str13 = locale11.getISO3Language();
        java.lang.String str14 = locale11.getScript();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket((-1349913608121600000L), chronology9, locale11, (java.lang.Integer) 86399, 999);
        java.lang.String str18 = locale11.toLanguageTag();
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.Chronology chronology21 = null;
        java.util.Locale locale22 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket24 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology21, locale22, (java.lang.Integer) 100);
        java.lang.Integer int25 = dateTimeParserBucket24.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean27 = dateTimeParserBucket24.restoreState((java.lang.Object) dateTimeFieldType26);
        org.joda.time.Chronology chronology28 = dateTimeParserBucket24.getChronology();
        org.joda.time.DurationField durationField29 = chronology28.days();
        org.joda.time.DateTimeField dateTimeField30 = dateTimeFieldType19.getField(chronology28);
        org.joda.time.DateTimeField dateTimeField31 = chronology28.dayOfMonth();
        int int32 = dateTimeField31.getMinimumValue();
        int int34 = dateTimeField31.getMaximumValue(100L);
        java.util.Locale.Builder builder36 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder37 = builder36.clear();
        java.util.Locale locale38 = builder37.build();
        java.util.Locale locale39 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str40 = locale38.getDisplayLanguage(locale39);
        java.util.Set<java.lang.String> strSet41 = locale39.getUnicodeLocaleKeys();
        java.lang.String str42 = dateTimeField31.getAsText((long) 86399999, locale39);
        java.util.Locale locale48 = new java.util.Locale("2", "DateTimeField[clockhourOfHalfday]", "en");
        long long49 = dateTimeField31.set(6652800031L, "7", locale48);
        java.lang.String str50 = locale48.getScript();
        java.lang.String str51 = locale48.getLanguage();
        java.lang.String str53 = locale48.getExtension('a');
        java.lang.String str54 = locale11.getDisplayVariant(locale48);
        org.joda.time.Chronology chronology56 = null;
        java.util.Locale locale57 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket59 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology56, locale57, (java.lang.Integer) 100);
        java.lang.Integer int60 = dateTimeParserBucket59.getOffsetInteger();
        java.util.TimeZone timeZone61 = null;
        org.joda.time.DateTimeZone dateTimeZone62 = org.joda.time.DateTimeZone.forTimeZone(timeZone61);
        int int64 = dateTimeZone62.getStandardOffset((long) (byte) -1);
        java.lang.String str66 = dateTimeZone62.getName(32054400100L);
        dateTimeParserBucket59.setZone(dateTimeZone62);
        dateTimeParserBucket59.setPivotYear((java.lang.Integer) 0);
        int int70 = dateTimeParserBucket59.getOffset();
        org.joda.time.Chronology chronology73 = null;
        java.util.Locale locale74 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket76 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology73, locale74, (java.lang.Integer) 100);
        java.lang.Integer int77 = dateTimeParserBucket76.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType78 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean79 = dateTimeParserBucket76.restoreState((java.lang.Object) dateTimeFieldType78);
        org.joda.time.Chronology chronology80 = dateTimeParserBucket76.getChronology();
        org.joda.time.DurationField durationField81 = chronology80.days();
        org.joda.time.DurationField durationField82 = chronology80.millis();
        org.joda.time.Chronology chronology84 = null;
        java.util.Locale locale85 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket87 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology84, locale85, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket88 = new org.joda.time.format.DateTimeParserBucket(64713600009L, chronology80, locale85);
        org.joda.time.DurationField durationField89 = chronology80.weekyears();
        org.joda.time.DateTimeField dateTimeField90 = chronology80.secondOfDay();
        boolean boolean92 = dateTimeField90.isLeap((long) 1497);
        long long94 = dateTimeField90.roundFloor(259200000L);
        dateTimeParserBucket59.saveField(dateTimeField90, 999);
        dateTimeParserBucket59.setOffset(32);
        boolean boolean99 = locale48.equals((java.lang.Object) 32);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField10 and durationField89", (durationField10.compareTo(durationField89) == 0) == durationField10.equals(durationField89));
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test247");
        org.joda.time.Chronology chronology4 = null;
        java.util.Locale locale5 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology4, locale5, (java.lang.Integer) 100);
        java.lang.Integer int8 = dateTimeParserBucket7.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean10 = dateTimeParserBucket7.restoreState((java.lang.Object) dateTimeFieldType9);
        org.joda.time.Chronology chronology11 = dateTimeParserBucket7.getChronology();
        org.joda.time.DurationField durationField12 = chronology11.days();
        org.joda.time.DurationField durationField13 = chronology11.millis();
        org.joda.time.Chronology chronology15 = null;
        java.util.Locale locale16 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket18 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology15, locale16, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket19 = new org.joda.time.format.DateTimeParserBucket(64713600009L, chronology11, locale16);
        org.joda.time.DateTimeField dateTimeField20 = chronology11.minuteOfDay();
        org.joda.time.DurationField durationField21 = chronology11.days();
        org.joda.time.DateTimeField dateTimeField22 = chronology11.minuteOfDay();
        long long26 = chronology11.add((long) 'u', 107L, (int) (short) 10);
        org.joda.time.DateTimeField dateTimeField27 = chronology11.year();
        java.util.Locale locale28 = java.util.Locale.ROOT;
        java.util.Locale locale29 = locale28.stripExtensions();
        java.util.Locale locale30 = locale29.stripExtensions();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket32 = new org.joda.time.format.DateTimeParserBucket((-359999998L), chronology11, locale30, (java.lang.Integer) 14);
        java.lang.String str33 = chronology11.toString();
        org.joda.time.DateTimeField dateTimeField34 = chronology11.minuteOfHour();
        org.joda.time.DurationField durationField35 = chronology11.days();
        org.joda.time.DurationField durationField36 = chronology11.weeks();
        org.joda.time.Chronology chronology38 = null;
        java.util.Locale locale40 = new java.util.Locale("");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket43 = new org.joda.time.format.DateTimeParserBucket((long) 'u', chronology38, locale40, (java.lang.Integer) 1, 0);
        dateTimeParserBucket43.setOffset((int) (short) 100);
        dateTimeParserBucket43.setOffset((java.lang.Integer) 12);
        org.joda.time.Chronology chronology49 = null;
        java.util.Locale locale50 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket52 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology49, locale50, (java.lang.Integer) 100);
        java.lang.Integer int53 = dateTimeParserBucket52.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType54 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean55 = dateTimeParserBucket52.restoreState((java.lang.Object) dateTimeFieldType54);
        org.joda.time.Chronology chronology56 = null;
        org.joda.time.DateTimeField dateTimeField57 = dateTimeFieldType54.getField(chronology56);
        java.util.Locale locale59 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet60 = locale59.getUnicodeLocaleAttributes();
        org.joda.time.Chronology chronology62 = null;
        java.util.Locale locale63 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket65 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology62, locale63, (java.lang.Integer) 100);
        java.lang.String str66 = locale59.getDisplayScript(locale63);
        java.lang.String str67 = dateTimeField57.getAsShortText(10, locale59);
        org.joda.time.DateTimeFieldType dateTimeFieldType68 = dateTimeField57.getType();
        org.joda.time.Chronology chronology69 = null;
        boolean boolean70 = dateTimeFieldType68.isSupported(chronology69);
        java.util.Locale locale73 = java.util.Locale.forLanguageTag("yearOfCentury");
        dateTimeParserBucket43.saveField(dateTimeFieldType68, "86399", locale73);
        java.util.Locale locale75 = dateTimeParserBucket43.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket77 = new org.joda.time.format.DateTimeParserBucket((-3390278388L), chronology11, locale75, (java.lang.Integer) 3);
        org.joda.time.DurationField durationField78 = chronology11.halfdays();
        org.joda.time.DurationField durationField79 = chronology11.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField79, durationField12, and durationField13", !(durationField79.compareTo(durationField12) == 0) || (Math.signum(durationField79.compareTo(durationField13)) == Math.signum(durationField12.compareTo(durationField13))));
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test248");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 100);
        java.lang.Integer int6 = dateTimeParserBucket5.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean8 = dateTimeParserBucket5.restoreState((java.lang.Object) dateTimeFieldType7);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket5.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        org.joda.time.DateTimeZone dateTimeZone11 = chronology9.getZone();
        org.joda.time.DateTimeField dateTimeField12 = chronology9.yearOfCentury();
        java.lang.String str13 = chronology9.toString();
        org.joda.time.Chronology chronology14 = chronology9.withUTC();
        org.joda.time.DateTimeField dateTimeField15 = chronology9.secondOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = dateTimeField15.getType();
        org.joda.time.Chronology chronology19 = null;
        java.util.Locale locale20 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket22 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology19, locale20, (java.lang.Integer) 100);
        java.lang.Integer int23 = dateTimeParserBucket22.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean25 = dateTimeParserBucket22.restoreState((java.lang.Object) dateTimeFieldType24);
        org.joda.time.Chronology chronology26 = dateTimeParserBucket22.getChronology();
        org.joda.time.DurationField durationField27 = chronology26.days();
        org.joda.time.DurationField durationField28 = chronology26.millis();
        org.joda.time.Chronology chronology30 = null;
        java.util.Locale locale31 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket33 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology30, locale31, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket34 = new org.joda.time.format.DateTimeParserBucket(64713600009L, chronology26, locale31);
        org.joda.time.DateTimeField dateTimeField35 = chronology26.weekOfWeekyear();
        org.joda.time.DurationField durationField36 = chronology26.centuries();
        org.joda.time.DateTimeField dateTimeField37 = chronology26.halfdayOfDay();
        boolean boolean38 = dateTimeFieldType16.isSupported(chronology26);
        org.joda.time.DurationField durationField39 = chronology26.seconds();
        org.joda.time.DateTimeField dateTimeField40 = chronology26.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField41 = chronology26.weekOfWeekyear();
        org.joda.time.Chronology chronology43 = null;
        java.util.Locale locale44 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket46 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology43, locale44, (java.lang.Integer) 100);
        java.lang.Integer int47 = dateTimeParserBucket46.getPivotYear();
        org.joda.time.DateTimeZone dateTimeZone48 = null;
        dateTimeParserBucket46.setZone(dateTimeZone48);
        dateTimeParserBucket46.setOffset((java.lang.Integer) 0);
        org.joda.time.Chronology chronology53 = null;
        java.util.Locale locale54 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket56 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology53, locale54, (java.lang.Integer) 100);
        java.lang.Integer int57 = dateTimeParserBucket56.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType58 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean59 = dateTimeParserBucket56.restoreState((java.lang.Object) dateTimeFieldType58);
        org.joda.time.Chronology chronology60 = null;
        org.joda.time.DateTimeField dateTimeField61 = dateTimeFieldType58.getField(chronology60);
        long long64 = dateTimeField61.getDifferenceAsLong((long) ' ', (long) 1);
        org.joda.time.ReadablePartial readablePartial65 = null;
        java.util.Locale locale67 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str68 = dateTimeField61.getAsShortText(readablePartial65, (int) ' ', locale67);
        dateTimeParserBucket46.saveField(dateTimeField61, (int) (byte) 10);
        int int71 = dateTimeField61.getMinimumValue();
        org.joda.time.Chronology chronology73 = null;
        java.util.Locale locale74 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket76 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology73, locale74, (java.lang.Integer) 100);
        java.lang.Integer int77 = dateTimeParserBucket76.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType78 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean79 = dateTimeParserBucket76.restoreState((java.lang.Object) dateTimeFieldType78);
        org.joda.time.Chronology chronology80 = null;
        org.joda.time.DateTimeField dateTimeField81 = dateTimeFieldType78.getField(chronology80);
        java.util.Locale locale83 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet84 = locale83.getUnicodeLocaleAttributes();
        org.joda.time.Chronology chronology86 = null;
        java.util.Locale locale87 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket89 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology86, locale87, (java.lang.Integer) 100);
        java.lang.String str90 = locale83.getDisplayScript(locale87);
        java.lang.String str91 = dateTimeField81.getAsShortText(10, locale83);
        java.util.Locale.setDefault(locale83);
        int int93 = dateTimeField61.getMaximumShortTextLength(locale83);
        java.lang.String str94 = locale83.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket96 = new org.joda.time.format.DateTimeParserBucket((-176675418255600000L), chronology26, locale83, (java.lang.Integer) 7200000);
        org.joda.time.DurationField durationField97 = chronology26.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField97, durationField10, and durationField28", !(durationField97.compareTo(durationField10) == 0) || (Math.signum(durationField97.compareTo(durationField28)) == Math.signum(durationField10.compareTo(durationField28))));
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test249");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 100);
        java.lang.Integer int6 = dateTimeParserBucket5.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean8 = dateTimeParserBucket5.restoreState((java.lang.Object) dateTimeFieldType7);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket5.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        org.joda.time.DateTimeField dateTimeField11 = dateTimeFieldType0.getField(chronology9);
        org.joda.time.DateTimeField dateTimeField12 = chronology9.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField13 = chronology9.weekOfWeekyear();
        java.lang.String str14 = chronology9.toString();
        org.joda.time.DateTimeField dateTimeField15 = chronology9.dayOfYear();
        org.joda.time.DateTimeField dateTimeField16 = chronology9.hourOfDay();
        org.joda.time.DurationField durationField17 = chronology9.years();
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        long long21 = chronology9.add(readablePeriod18, (long) 356580000, 360660000);
        org.joda.time.DurationField durationField22 = chronology9.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField22, durationField10, and durationField17", !(durationField22.compareTo(durationField10) == 0) || (Math.signum(durationField22.compareTo(durationField17)) == Math.signum(durationField10.compareTo(durationField17))));
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test250");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 100);
        java.lang.Integer int5 = dateTimeParserBucket4.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean7 = dateTimeParserBucket4.restoreState((java.lang.Object) dateTimeFieldType6);
        org.joda.time.Chronology chronology8 = dateTimeParserBucket4.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        long long13 = chronology8.add(readablePeriod10, 0L, 0);
        org.joda.time.DateTimeField dateTimeField14 = chronology8.weekyear();
        org.joda.time.DateTimeField dateTimeField15 = chronology8.year();
        long long19 = chronology8.add(2L, (long) (short) 10, (-9));
        org.joda.time.DateTimeField dateTimeField20 = chronology8.weekyear();
        org.joda.time.DateTimeField dateTimeField21 = chronology8.centuryOfEra();
        org.joda.time.DurationField durationField22 = chronology8.centuries();
        org.joda.time.DateTimeField dateTimeField23 = chronology8.weekOfWeekyear();
        org.joda.time.DurationField durationField24 = chronology8.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField24, durationField9, and durationField22", !(durationField24.compareTo(durationField9) == 0) || (Math.signum(durationField24.compareTo(durationField22)) == Math.signum(durationField9.compareTo(durationField22))));
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test251");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 100);
        java.lang.Integer int5 = dateTimeParserBucket4.getPivotYear();
        int int6 = dateTimeParserBucket4.getOffset();
        java.util.Locale locale7 = dateTimeParserBucket4.getLocale();
        java.lang.Object obj8 = dateTimeParserBucket4.saveState();
        org.joda.time.Chronology chronology10 = null;
        java.util.Locale locale11 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology10, locale11, (java.lang.Integer) 100);
        java.lang.Integer int14 = dateTimeParserBucket13.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean16 = dateTimeParserBucket13.restoreState((java.lang.Object) dateTimeFieldType15);
        org.joda.time.Chronology chronology17 = dateTimeParserBucket13.getChronology();
        org.joda.time.DurationField durationField18 = chronology17.days();
        org.joda.time.DateTimeZone dateTimeZone19 = chronology17.getZone();
        org.joda.time.DateTimeField dateTimeField20 = chronology17.yearOfCentury();
        java.lang.String str21 = chronology17.toString();
        org.joda.time.DurationField durationField22 = chronology17.eras();
        boolean boolean23 = dateTimeParserBucket4.restoreState((java.lang.Object) durationField22);
        org.joda.time.Chronology chronology27 = null;
        java.util.Locale locale28 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket30 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology27, locale28, (java.lang.Integer) 100);
        java.lang.Integer int31 = dateTimeParserBucket30.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean33 = dateTimeParserBucket30.restoreState((java.lang.Object) dateTimeFieldType32);
        org.joda.time.Chronology chronology34 = dateTimeParserBucket30.getChronology();
        org.joda.time.DurationField durationField35 = chronology34.days();
        org.joda.time.DurationField durationField36 = chronology34.millis();
        org.joda.time.Chronology chronology38 = null;
        java.util.Locale locale39 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket41 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology38, locale39, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket42 = new org.joda.time.format.DateTimeParserBucket(64713600009L, chronology34, locale39);
        org.joda.time.DateTimeField dateTimeField43 = chronology34.minuteOfDay();
        org.joda.time.DurationField durationField44 = chronology34.days();
        org.joda.time.DateTimeField dateTimeField45 = chronology34.minuteOfDay();
        org.joda.time.DurationField durationField46 = chronology34.months();
        org.joda.time.DurationField durationField47 = chronology34.hours();
        java.util.Locale.Category category48 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale49 = java.util.Locale.GERMANY;
        java.lang.String str50 = locale49.getDisplayCountry();
        java.util.Locale.setDefault(category48, locale49);
        java.util.Locale locale52 = java.util.Locale.getDefault(category48);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket55 = new org.joda.time.format.DateTimeParserBucket(18489600000L, chronology34, locale52, (java.lang.Integer) 5207, 0);
        dateTimeParserBucket55.setOffset(10);
        dateTimeParserBucket55.setPivotYear((java.lang.Integer) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType60 = org.joda.time.DateTimeFieldType.millisOfDay();
        java.util.Locale locale63 = new java.util.Locale("Chinese");
        java.util.Locale locale65 = java.util.Locale.forLanguageTag("1");
        java.lang.String str66 = locale63.getDisplayCountry(locale65);
        dateTimeParserBucket55.saveField(dateTimeFieldType60, "361920000", locale65);
        org.joda.time.DurationFieldType durationFieldType68 = dateTimeFieldType60.getDurationType();
        dateTimeParserBucket4.saveField(dateTimeFieldType60, 4969628);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField18 and durationField22", Math.signum(durationField18.compareTo(durationField22)) == -Math.signum(durationField22.compareTo(durationField18)));
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test252");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 100);
        java.lang.Integer int6 = dateTimeParserBucket5.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean8 = dateTimeParserBucket5.restoreState((java.lang.Object) dateTimeFieldType7);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket5.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.years();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.Chronology chronology14 = null;
        java.util.Locale locale15 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology14, locale15, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket18 = new org.joda.time.format.DateTimeParserBucket(100L, chronology12, locale15);
        java.lang.String str19 = locale15.getScript();
        java.lang.String str21 = locale15.getExtension('u');
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket24 = new org.joda.time.format.DateTimeParserBucket(259200117L, chronology9, locale15, (java.lang.Integer) 100, (int) (byte) 1);
        org.joda.time.DateTimeField dateTimeField25 = chronology9.hourOfHalfday();
        org.joda.time.DurationField durationField26 = chronology9.months();
        org.joda.time.DateTimeField dateTimeField27 = chronology9.clockhourOfHalfday();
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = dateTimeField27.getType();
        org.joda.time.Chronology chronology30 = null;
        java.util.Locale locale31 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket33 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology30, locale31, (java.lang.Integer) 100);
        java.lang.Integer int34 = dateTimeParserBucket33.getPivotYear();
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        dateTimeParserBucket33.setZone(dateTimeZone35);
        dateTimeParserBucket33.setOffset((java.lang.Integer) 0);
        org.joda.time.Chronology chronology40 = null;
        java.util.Locale locale41 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket43 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology40, locale41, (java.lang.Integer) 100);
        java.lang.Integer int44 = dateTimeParserBucket43.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType45 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean46 = dateTimeParserBucket43.restoreState((java.lang.Object) dateTimeFieldType45);
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.DateTimeField dateTimeField48 = dateTimeFieldType45.getField(chronology47);
        long long51 = dateTimeField48.getDifferenceAsLong((long) ' ', (long) 1);
        org.joda.time.ReadablePartial readablePartial52 = null;
        java.util.Locale locale54 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str55 = dateTimeField48.getAsShortText(readablePartial52, (int) ' ', locale54);
        dateTimeParserBucket33.saveField(dateTimeField48, (int) (byte) 10);
        java.lang.Integer int58 = dateTimeParserBucket33.getOffsetInteger();
        java.lang.Object obj59 = dateTimeParserBucket33.saveState();
        org.joda.time.Chronology chronology60 = dateTimeParserBucket33.getChronology();
        org.joda.time.DateTimeField dateTimeField61 = chronology60.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField62 = chronology60.centuryOfEra();
        boolean boolean63 = dateTimeFieldType28.isSupported(chronology60);
        org.joda.time.DurationFieldType durationFieldType64 = dateTimeFieldType28.getRangeDurationType();
        org.joda.time.DateTimeFieldType dateTimeFieldType65 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.Chronology chronology67 = null;
        java.util.Locale locale68 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket70 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology67, locale68, (java.lang.Integer) 100);
        java.lang.Integer int71 = dateTimeParserBucket70.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType72 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean73 = dateTimeParserBucket70.restoreState((java.lang.Object) dateTimeFieldType72);
        org.joda.time.Chronology chronology74 = dateTimeParserBucket70.getChronology();
        org.joda.time.DurationField durationField75 = chronology74.days();
        org.joda.time.DateTimeZone dateTimeZone76 = chronology74.getZone();
        org.joda.time.DateTimeField dateTimeField77 = chronology74.yearOfCentury();
        java.lang.String str78 = chronology74.toString();
        org.joda.time.Chronology chronology79 = chronology74.withUTC();
        org.joda.time.DateTimeField dateTimeField80 = chronology74.secondOfDay();
        boolean boolean81 = dateTimeFieldType65.isSupported(chronology74);
        org.joda.time.DurationField durationField82 = chronology74.weekyears();
        org.joda.time.DateTimeField dateTimeField83 = chronology74.yearOfEra();
        org.joda.time.DurationField durationField84 = chronology74.weekyears();
        org.joda.time.DurationField durationField85 = chronology74.millis();
        org.joda.time.Chronology chronology86 = chronology74.withUTC();
        org.joda.time.DateTimeField dateTimeField87 = dateTimeFieldType28.getField(chronology86);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField10 and durationField82", (durationField10.compareTo(durationField82) == 0) == durationField10.equals(durationField82));
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test253");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 100);
        java.lang.Integer int6 = dateTimeParserBucket5.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean8 = dateTimeParserBucket5.restoreState((java.lang.Object) dateTimeFieldType7);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket5.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        org.joda.time.DateTimeField dateTimeField11 = dateTimeFieldType0.getField(chronology9);
        org.joda.time.DateTimeField dateTimeField12 = chronology9.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        long long16 = dateTimeZone14.convertUTCToLocal((long) (short) -1);
        org.joda.time.Chronology chronology18 = null;
        java.util.Locale locale19 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket21 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology18, locale19, (java.lang.Integer) 100);
        java.lang.Integer int22 = dateTimeParserBucket21.getPivotYear();
        org.joda.time.DateTimeField dateTimeField23 = null;
        dateTimeParserBucket21.saveField(dateTimeField23, (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone26 = dateTimeParserBucket21.getZone();
        long long28 = dateTimeZone14.getMillisKeepLocal(dateTimeZone26, 97L);
        int int30 = dateTimeZone14.getStandardOffset(1L);
        org.joda.time.Chronology chronology31 = chronology9.withZone(dateTimeZone14);
        java.util.TimeZone timeZone32 = null;
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forTimeZone(timeZone32);
        java.util.Locale locale38 = new java.util.Locale("weekOfWeekyear", "UTC", "+00:00");
        boolean boolean39 = locale38.hasExtensions();
        org.joda.time.Chronology chronology41 = null;
        java.util.Locale locale42 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket44 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology41, locale42, (java.lang.Integer) 100);
        java.lang.String str45 = locale38.getDisplayCountry(locale42);
        java.lang.String str46 = dateTimeZone33.getShortName((long) (short) 1, locale42);
        java.lang.String str47 = dateTimeZone33.getID();
        int int49 = dateTimeZone33.getStandardOffset(60480000010L);
        int int51 = dateTimeZone33.getStandardOffset(259200107L);
        org.joda.time.Chronology chronology52 = chronology31.withZone(dateTimeZone33);
        org.joda.time.DateTimeField dateTimeField53 = chronology31.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone55 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str56 = dateTimeZone55.getID();
        int int58 = dateTimeZone55.getOffsetFromLocal((long) 100);
        org.joda.time.LocalDateTime localDateTime59 = null;
        boolean boolean60 = dateTimeZone55.isLocalDateTimeGap(localDateTime59);
        boolean boolean61 = dateTimeZone55.isFixed();
        long long64 = dateTimeZone55.adjustOffset(6048000035L, false);
        org.joda.time.Chronology chronology65 = chronology31.withZone(dateTimeZone55);
        org.joda.time.DurationField durationField66 = chronology31.weekyears();
        org.joda.time.DurationField durationField67 = chronology31.days();
        org.joda.time.DateTimeField dateTimeField68 = chronology31.weekOfWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField10 and durationField67", (durationField10.compareTo(durationField67) == 0) == durationField10.equals(durationField67));
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test254");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 100);
        java.lang.Integer int5 = dateTimeParserBucket4.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean7 = dateTimeParserBucket4.restoreState((java.lang.Object) dateTimeFieldType6);
        org.joda.time.Chronology chronology8 = dateTimeParserBucket4.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeZone dateTimeZone10 = chronology8.getZone();
        org.joda.time.DurationField durationField11 = chronology8.hours();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.secondOfDay();
        org.joda.time.Chronology chronology14 = null;
        java.util.Locale locale15 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology14, locale15, (java.lang.Integer) 100);
        java.lang.Integer int18 = dateTimeParserBucket17.getPivotYear();
        org.joda.time.DateTimeField dateTimeField19 = null;
        dateTimeParserBucket17.saveField(dateTimeField19, (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone22 = dateTimeParserBucket17.getZone();
        org.joda.time.Chronology chronology24 = null;
        java.util.Locale locale25 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket27 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology24, locale25, (java.lang.Integer) 100);
        java.lang.Integer int28 = dateTimeParserBucket27.getPivotYear();
        org.joda.time.DateTimeField dateTimeField29 = null;
        dateTimeParserBucket27.saveField(dateTimeField29, (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone32 = dateTimeParserBucket27.getZone();
        org.joda.time.Chronology chronology34 = null;
        java.util.Locale locale35 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket37 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology34, locale35, (java.lang.Integer) 100);
        java.lang.Integer int38 = dateTimeParserBucket37.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean40 = dateTimeParserBucket37.restoreState((java.lang.Object) dateTimeFieldType39);
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.DateTimeField dateTimeField42 = dateTimeFieldType39.getField(chronology41);
        java.util.Locale locale44 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet45 = locale44.getUnicodeLocaleAttributes();
        org.joda.time.Chronology chronology47 = null;
        java.util.Locale locale48 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket50 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology47, locale48, (java.lang.Integer) 100);
        java.lang.String str51 = locale44.getDisplayScript(locale48);
        java.lang.String str52 = dateTimeField42.getAsShortText(10, locale44);
        dateTimeParserBucket27.saveField(dateTimeField42, (int) (byte) 1);
        boolean boolean55 = dateTimeParserBucket17.restoreState((java.lang.Object) dateTimeParserBucket27);
        org.joda.time.DateTimeZone dateTimeZone56 = dateTimeParserBucket27.getZone();
        boolean boolean58 = dateTimeZone56.isStandardOffset(10L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone56);
        java.lang.String str60 = dateTimeZone56.toString();
        boolean boolean61 = dateTimeZone56.isFixed();
        long long64 = dateTimeZone56.adjustOffset(27654780000L, false);
        long long67 = dateTimeZone56.convertLocalToUTC((long) (byte) -1, true);
        org.joda.time.Chronology chronology68 = chronology8.withZone(dateTimeZone56);
        org.joda.time.DateTimeField dateTimeField69 = chronology68.clockhourOfHalfday();
        boolean boolean71 = dateTimeField69.isLeap((-1648800000L));
        org.joda.time.DurationField durationField72 = dateTimeField69.getDurationField();
        org.joda.time.DurationField durationField73 = dateTimeField69.getDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField11 and durationField73", (durationField11.compareTo(durationField73) == 0) == durationField11.equals(durationField73));
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test255");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 100);
        java.lang.Integer int5 = dateTimeParserBucket4.getPivotYear();
        int int6 = dateTimeParserBucket4.getOffset();
        java.lang.Object obj7 = dateTimeParserBucket4.saveState();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.Chronology chronology10 = null;
        java.util.Locale locale11 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology10, locale11, (java.lang.Integer) 100);
        java.lang.Integer int14 = dateTimeParserBucket13.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean16 = dateTimeParserBucket13.restoreState((java.lang.Object) dateTimeFieldType15);
        org.joda.time.Chronology chronology17 = dateTimeParserBucket13.getChronology();
        org.joda.time.DurationField durationField18 = chronology17.days();
        org.joda.time.DateTimeZone dateTimeZone19 = chronology17.getZone();
        org.joda.time.DateTimeField dateTimeField20 = chronology17.yearOfCentury();
        java.lang.String str21 = chronology17.toString();
        org.joda.time.Chronology chronology22 = chronology17.withUTC();
        org.joda.time.DateTimeField dateTimeField23 = chronology17.secondOfDay();
        boolean boolean24 = dateTimeFieldType8.isSupported(chronology17);
        org.joda.time.DurationField durationField25 = chronology17.weekyears();
        org.joda.time.DateTimeField dateTimeField26 = chronology17.yearOfEra();
        java.util.Locale locale28 = null;
        java.lang.String str29 = dateTimeField26.getAsShortText(53, locale28);
        java.lang.String str31 = dateTimeField26.getAsShortText((long) 24);
        long long33 = dateTimeField26.roundFloor((-292122054L));
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = dateTimeField26.getType();
        dateTimeParserBucket4.saveField(dateTimeField26, 36000000);
        org.joda.time.ReadablePartial readablePartial37 = null;
        org.joda.time.Chronology chronology41 = null;
        java.util.Locale locale42 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket44 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology41, locale42, (java.lang.Integer) 100);
        java.lang.Integer int45 = dateTimeParserBucket44.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType46 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean47 = dateTimeParserBucket44.restoreState((java.lang.Object) dateTimeFieldType46);
        org.joda.time.Chronology chronology48 = dateTimeParserBucket44.getChronology();
        org.joda.time.DurationField durationField49 = chronology48.days();
        org.joda.time.DurationField durationField50 = chronology48.millis();
        org.joda.time.Chronology chronology52 = null;
        java.util.Locale locale53 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket55 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology52, locale53, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket56 = new org.joda.time.format.DateTimeParserBucket(64713600009L, chronology48, locale53);
        org.joda.time.DateTimeField dateTimeField57 = chronology48.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField58 = chronology48.weekyear();
        java.lang.String str59 = chronology48.toString();
        org.joda.time.DateTimeField dateTimeField60 = chronology48.minuteOfDay();
        org.joda.time.DurationField durationField61 = chronology48.weeks();
        org.joda.time.DurationField durationField62 = chronology48.weeks();
        org.joda.time.DurationField durationField63 = chronology48.years();
        org.joda.time.DateTimeField dateTimeField64 = chronology48.minuteOfDay();
        org.joda.time.DurationField durationField65 = chronology48.hours();
        org.joda.time.DateTimeField dateTimeField66 = chronology48.dayOfYear();
        boolean boolean67 = dateTimeField66.isSupported();
        long long70 = dateTimeField66.addWrapField(6048950400000L, (-713));
        java.util.Locale locale74 = new java.util.Locale("Italia", "19");
        java.util.Locale locale75 = java.util.Locale.getDefault();
        java.lang.String str76 = locale75.getISO3Country();
        java.lang.String str77 = locale75.getISO3Language();
        java.util.Locale locale78 = java.util.Locale.getDefault();
        java.lang.String str79 = locale75.getDisplayVariant(locale78);
        java.util.Locale locale80 = java.util.Locale.ITALY;
        java.lang.String str81 = locale80.getDisplayName();
        java.lang.String str82 = locale80.getISO3Language();
        java.lang.String str83 = locale78.getDisplayScript(locale80);
        java.lang.String str84 = locale80.getVariant();
        java.lang.String str85 = locale74.getDisplayCountry(locale80);
        java.lang.String str86 = locale74.getLanguage();
        java.lang.String str87 = dateTimeField66.getAsText(58, locale74);
        java.lang.String str88 = dateTimeField26.getAsText(readablePartial37, 1971, locale74);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField25 and durationField63", (durationField25.compareTo(durationField63) == 0) == durationField25.equals(durationField63));
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test256");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 100);
        java.lang.Integer int5 = dateTimeParserBucket4.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean7 = dateTimeParserBucket4.restoreState((java.lang.Object) dateTimeFieldType6);
        org.joda.time.Chronology chronology8 = dateTimeParserBucket4.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeZone dateTimeZone10 = chronology8.getZone();
        org.joda.time.DurationField durationField11 = chronology8.hours();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.secondOfDay();
        org.joda.time.DurationField durationField13 = chronology8.years();
        org.joda.time.DurationField durationField14 = chronology8.years();
        org.joda.time.DurationField durationField15 = chronology8.years();
        org.joda.time.DateTimeField dateTimeField16 = chronology8.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField17 = chronology8.monthOfYear();
        org.joda.time.DurationField durationField18 = chronology8.weekyears();
        org.joda.time.DateTimeField dateTimeField19 = chronology8.clockhourOfHalfday();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField13 and durationField18", (durationField13.compareTo(durationField18) == 0) == durationField13.equals(durationField18));
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test257");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.DurationFieldType durationFieldType1 = dateTimeFieldType0.getDurationType();
        java.lang.String str2 = dateTimeFieldType0.toString();
        org.joda.time.Chronology chronology5 = null;
        java.util.Locale locale6 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology5, locale6, (java.lang.Integer) 100);
        java.lang.Integer int9 = dateTimeParserBucket8.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean11 = dateTimeParserBucket8.restoreState((java.lang.Object) dateTimeFieldType10);
        org.joda.time.Chronology chronology12 = dateTimeParserBucket8.getChronology();
        org.joda.time.DurationField durationField13 = chronology12.days();
        org.joda.time.DateTimeZone dateTimeZone14 = chronology12.getZone();
        org.joda.time.DateTimeField dateTimeField15 = chronology12.minuteOfDay();
        java.util.Locale locale16 = java.util.Locale.FRENCH;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology12, locale16);
        org.joda.time.DateTimeField dateTimeField18 = chronology12.year();
        org.joda.time.DateTimeField dateTimeField19 = chronology12.secondOfMinute();
        org.joda.time.DurationField durationField20 = chronology12.eras();
        boolean boolean21 = dateTimeFieldType0.isSupported(chronology12);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField13 and durationField20", Math.signum(durationField13.compareTo(durationField20)) == -Math.signum(durationField20.compareTo(durationField13)));
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test258");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 100);
        java.lang.Integer int5 = dateTimeParserBucket4.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean7 = dateTimeParserBucket4.restoreState((java.lang.Object) dateTimeFieldType6);
        org.joda.time.Chronology chronology8 = dateTimeParserBucket4.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeZone dateTimeZone10 = chronology8.getZone();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.yearOfCentury();
        org.joda.time.DurationField durationField12 = chronology8.years();
        org.joda.time.DateTimeField dateTimeField13 = chronology8.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField14 = chronology8.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField15 = chronology8.dayOfWeek();
        org.joda.time.Chronology chronology16 = chronology8.withUTC();
        org.joda.time.DurationField durationField17 = chronology16.minutes();
        org.joda.time.DateTimeField dateTimeField18 = chronology16.centuryOfEra();
        java.util.Locale locale20 = java.util.Locale.PRC;
        java.lang.String str22 = locale20.getExtension('a');
        java.lang.String str23 = dateTimeField18.getAsShortText(3103354800000L, locale20);
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = dateTimeField18.getType();
        org.joda.time.Chronology chronology28 = null;
        java.util.Locale locale29 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket31 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology28, locale29, (java.lang.Integer) 100);
        java.lang.Integer int32 = dateTimeParserBucket31.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean34 = dateTimeParserBucket31.restoreState((java.lang.Object) dateTimeFieldType33);
        org.joda.time.Chronology chronology35 = dateTimeParserBucket31.getChronology();
        org.joda.time.DurationField durationField36 = chronology35.days();
        org.joda.time.DurationField durationField37 = chronology35.millis();
        org.joda.time.Chronology chronology39 = null;
        java.util.Locale locale40 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket42 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology39, locale40, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket43 = new org.joda.time.format.DateTimeParserBucket(64713600009L, chronology35, locale40);
        org.joda.time.DateTimeField dateTimeField44 = chronology35.minuteOfDay();
        org.joda.time.DurationField durationField45 = chronology35.days();
        org.joda.time.DateTimeField dateTimeField46 = chronology35.minuteOfDay();
        org.joda.time.DurationField durationField47 = chronology35.months();
        org.joda.time.DurationField durationField48 = chronology35.hours();
        org.joda.time.DurationField durationField49 = chronology35.seconds();
        java.util.Locale.Builder builder50 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder51 = builder50.clear();
        java.util.Locale locale52 = builder50.build();
        java.lang.String str53 = locale52.getScript();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket56 = new org.joda.time.format.DateTimeParserBucket(66528000000L, chronology35, locale52, (java.lang.Integer) 10, (-292275054));
        org.joda.time.DateTimeField dateTimeField57 = dateTimeFieldType24.getField(chronology35);
        org.joda.time.DurationField durationField58 = chronology35.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField58, durationField9, and durationField12", !(durationField58.compareTo(durationField9) == 0) || (Math.signum(durationField58.compareTo(durationField12)) == Math.signum(durationField9.compareTo(durationField12))));
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test259");
        org.joda.time.Chronology chronology4 = null;
        java.util.Locale locale5 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology4, locale5, (java.lang.Integer) 100);
        java.lang.Integer int8 = dateTimeParserBucket7.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean10 = dateTimeParserBucket7.restoreState((java.lang.Object) dateTimeFieldType9);
        org.joda.time.Chronology chronology11 = dateTimeParserBucket7.getChronology();
        org.joda.time.DurationField durationField12 = chronology11.years();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.Chronology chronology16 = null;
        java.util.Locale locale17 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket19 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology16, locale17, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket20 = new org.joda.time.format.DateTimeParserBucket(100L, chronology14, locale17);
        java.lang.String str21 = locale17.getScript();
        java.lang.String str23 = locale17.getExtension('u');
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket26 = new org.joda.time.format.DateTimeParserBucket(259200117L, chronology11, locale17, (java.lang.Integer) 100, (int) (byte) 1);
        org.joda.time.DurationField durationField27 = chronology11.centuries();
        java.util.Locale.Category category28 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale29 = java.util.Locale.GERMANY;
        java.lang.String str30 = locale29.getDisplayCountry();
        java.util.Locale.setDefault(category28, locale29);
        java.util.Locale locale32 = java.util.Locale.getDefault(category28);
        java.util.Locale locale33 = java.util.Locale.getDefault(category28);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket36 = new org.joda.time.format.DateTimeParserBucket(10L, chronology11, locale33, (java.lang.Integer) 100, 31);
        org.joda.time.Chronology chronology37 = chronology11.withUTC();
        org.joda.time.DateTimeField dateTimeField38 = chronology11.halfdayOfDay();
        java.util.Locale.Builder builder39 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder40 = builder39.clear();
        java.util.Locale locale41 = builder40.build();
        java.util.Locale locale42 = locale41.stripExtensions();
        java.lang.String str43 = locale42.getCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket45 = new org.joda.time.format.DateTimeParserBucket(259200048L, chronology11, locale42, (java.lang.Integer) 365);
        org.joda.time.DateTimeField dateTimeField46 = chronology11.dayOfMonth();
        org.joda.time.DurationField durationField47 = chronology11.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField47, durationField12, and durationField27", !(durationField47.compareTo(durationField12) == 0) || (Math.signum(durationField47.compareTo(durationField27)) == Math.signum(durationField12.compareTo(durationField27))));
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test260");
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        java.lang.Integer int7 = dateTimeParserBucket6.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean9 = dateTimeParserBucket6.restoreState((java.lang.Object) dateTimeFieldType8);
        org.joda.time.Chronology chronology10 = dateTimeParserBucket6.getChronology();
        org.joda.time.DurationField durationField11 = chronology10.days();
        org.joda.time.DurationField durationField12 = chronology10.millis();
        org.joda.time.Chronology chronology14 = null;
        java.util.Locale locale15 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology14, locale15, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket18 = new org.joda.time.format.DateTimeParserBucket(64713600009L, chronology10, locale15);
        org.joda.time.DateTimeField dateTimeField19 = chronology10.minuteOfDay();
        org.joda.time.DurationField durationField20 = chronology10.days();
        org.joda.time.DateTimeField dateTimeField21 = chronology10.minuteOfDay();
        long long25 = chronology10.add((long) 'u', 107L, (int) (short) 10);
        org.joda.time.DateTimeField dateTimeField26 = chronology10.year();
        java.util.Locale locale27 = java.util.Locale.ROOT;
        java.util.Locale locale28 = locale27.stripExtensions();
        java.util.Locale locale29 = locale28.stripExtensions();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket31 = new org.joda.time.format.DateTimeParserBucket((-359999998L), chronology10, locale29, (java.lang.Integer) 14);
        org.joda.time.DurationField durationField32 = chronology10.minutes();
        org.joda.time.DurationField durationField33 = chronology10.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField33, durationField11, and durationField12", !(durationField33.compareTo(durationField11) == 0) || (Math.signum(durationField33.compareTo(durationField12)) == Math.signum(durationField11.compareTo(durationField12))));
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test261");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 100);
        java.lang.Integer int5 = dateTimeParserBucket4.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean7 = dateTimeParserBucket4.restoreState((java.lang.Object) dateTimeFieldType6);
        org.joda.time.Chronology chronology8 = dateTimeParserBucket4.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeZone dateTimeZone10 = chronology8.getZone();
        org.joda.time.DurationField durationField11 = chronology8.months();
        org.joda.time.DurationField durationField12 = chronology8.hours();
        org.joda.time.DateTimeField dateTimeField13 = chronology8.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField14 = chronology8.secondOfDay();
        org.joda.time.DateTimeField dateTimeField15 = chronology8.era();
        org.joda.time.DurationField durationField16 = chronology8.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField16, durationField9, and durationField11", !(durationField16.compareTo(durationField9) == 0) || (Math.signum(durationField16.compareTo(durationField11)) == Math.signum(durationField9.compareTo(durationField11))));
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test262");
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        java.lang.Integer int7 = dateTimeParserBucket6.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean9 = dateTimeParserBucket6.restoreState((java.lang.Object) dateTimeFieldType8);
        org.joda.time.Chronology chronology10 = dateTimeParserBucket6.getChronology();
        org.joda.time.DurationField durationField11 = chronology10.days();
        org.joda.time.DurationField durationField12 = chronology10.millis();
        org.joda.time.Chronology chronology14 = null;
        java.util.Locale locale15 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology14, locale15, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket18 = new org.joda.time.format.DateTimeParserBucket(64713600009L, chronology10, locale15);
        org.joda.time.DateTimeField dateTimeField19 = chronology10.minuteOfDay();
        org.joda.time.DurationField durationField20 = chronology10.days();
        org.joda.time.DateTimeField dateTimeField21 = chronology10.minuteOfDay();
        org.joda.time.DurationField durationField22 = chronology10.months();
        org.joda.time.DurationField durationField23 = chronology10.hours();
        org.joda.time.DurationField durationField24 = chronology10.seconds();
        java.util.Locale.Builder builder25 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder26 = builder25.clear();
        java.util.Locale locale27 = builder25.build();
        java.lang.String str28 = locale27.getScript();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket31 = new org.joda.time.format.DateTimeParserBucket(66528000000L, chronology10, locale27, (java.lang.Integer) 10, (-292275054));
        org.joda.time.DurationField durationField32 = chronology10.years();
        org.joda.time.DateTimeField dateTimeField33 = chronology10.era();
        org.joda.time.DurationField durationField34 = chronology10.years();
        org.joda.time.DurationField durationField35 = chronology10.seconds();
        org.joda.time.DateTimeField dateTimeField36 = chronology10.weekOfWeekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.Chronology chronology41 = null;
        java.util.Locale locale42 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket44 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology41, locale42, (java.lang.Integer) 100);
        java.lang.Integer int45 = dateTimeParserBucket44.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType46 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean47 = dateTimeParserBucket44.restoreState((java.lang.Object) dateTimeFieldType46);
        org.joda.time.Chronology chronology48 = dateTimeParserBucket44.getChronology();
        org.joda.time.DurationField durationField49 = chronology48.days();
        org.joda.time.DateTimeField dateTimeField50 = dateTimeFieldType39.getField(chronology48);
        org.joda.time.DateTimeField dateTimeField51 = chronology48.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField52 = chronology48.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField53 = chronology48.yearOfEra();
        org.joda.time.DateTimeField dateTimeField54 = chronology48.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField55 = chronology48.dayOfYear();
        org.joda.time.DateTimeField dateTimeField56 = chronology48.hourOfDay();
        org.joda.time.DurationField durationField57 = chronology48.centuries();
        org.joda.time.DurationField durationField58 = chronology48.weekyears();
        org.joda.time.DateTimeField dateTimeField59 = chronology48.weekyear();
        java.util.Locale locale60 = java.util.Locale.TAIWAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket63 = new org.joda.time.format.DateTimeParserBucket(17L, chronology48, locale60, (java.lang.Integer) 10, 8);
        java.util.Locale.Builder builder64 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder65 = builder64.clear();
        java.util.Locale locale66 = builder65.build();
        org.joda.time.Chronology chronology68 = null;
        java.util.Locale locale70 = new java.util.Locale("");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket73 = new org.joda.time.format.DateTimeParserBucket((long) 'u', chronology68, locale70, (java.lang.Integer) 1, 0);
        java.lang.String str74 = locale66.getDisplayVariant(locale70);
        java.util.Set<java.lang.Character> charSet75 = locale70.getExtensionKeys();
        java.lang.String str76 = locale60.getDisplayName(locale70);
        java.lang.String str77 = dateTimeField36.getAsShortText(64450860000L, locale70);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField32 and durationField58", (durationField32.compareTo(durationField58) == 0) == durationField32.equals(durationField58));
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test263");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 100);
        java.lang.Integer int5 = dateTimeParserBucket4.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean7 = dateTimeParserBucket4.restoreState((java.lang.Object) dateTimeFieldType6);
        org.joda.time.Chronology chronology8 = dateTimeParserBucket4.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.era();
        java.lang.String str11 = chronology8.toString();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField13 = chronology8.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField14 = chronology8.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField15 = chronology8.era();
        org.joda.time.DurationField durationField16 = chronology8.eras();
        org.joda.time.DateTimeField dateTimeField17 = chronology8.clockhourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField9 and durationField16", Math.signum(durationField9.compareTo(durationField16)) == -Math.signum(durationField16.compareTo(durationField9)));
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test264");
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        java.lang.Integer int7 = dateTimeParserBucket6.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean9 = dateTimeParserBucket6.restoreState((java.lang.Object) dateTimeFieldType8);
        org.joda.time.Chronology chronology10 = dateTimeParserBucket6.getChronology();
        org.joda.time.DurationField durationField11 = chronology10.years();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.Chronology chronology15 = null;
        java.util.Locale locale16 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket18 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology15, locale16, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket19 = new org.joda.time.format.DateTimeParserBucket(100L, chronology13, locale16);
        java.lang.String str20 = locale16.getScript();
        java.lang.String str22 = locale16.getExtension('u');
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket25 = new org.joda.time.format.DateTimeParserBucket(259200117L, chronology10, locale16, (java.lang.Integer) 100, (int) (byte) 1);
        org.joda.time.DateTimeField dateTimeField26 = chronology10.hourOfHalfday();
        org.joda.time.DurationField durationField27 = chronology10.minutes();
        java.util.Locale.Builder builder28 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder29 = builder28.clear();
        java.util.Locale locale30 = builder29.build();
        java.util.Locale locale31 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str32 = locale30.getDisplayLanguage(locale31);
        java.util.Set<java.lang.String> strSet33 = locale31.getUnicodeLocaleKeys();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket36 = new org.joda.time.format.DateTimeParserBucket(2L, chronology10, locale31, (java.lang.Integer) 100, (int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone37 = dateTimeParserBucket36.getZone();
        org.joda.time.DateTimeFieldType dateTimeFieldType38 = org.joda.time.DateTimeFieldType.secondOfMinute();
        java.util.Locale locale42 = new java.util.Locale("hi!", "ISOChronology[UTC]");
        dateTimeParserBucket36.saveField(dateTimeFieldType38, "", locale42);
        org.joda.time.Chronology chronology46 = null;
        java.util.Locale locale47 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket49 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology46, locale47, (java.lang.Integer) 100);
        java.lang.Integer int50 = dateTimeParserBucket49.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType51 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean52 = dateTimeParserBucket49.restoreState((java.lang.Object) dateTimeFieldType51);
        org.joda.time.Chronology chronology53 = dateTimeParserBucket49.getChronology();
        org.joda.time.DurationField durationField54 = chronology53.days();
        org.joda.time.DateTimeZone dateTimeZone55 = chronology53.getZone();
        org.joda.time.DateTimeField dateTimeField56 = chronology53.minuteOfDay();
        java.util.Locale locale57 = java.util.Locale.FRENCH;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket58 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology53, locale57);
        org.joda.time.DateTimeField dateTimeField59 = chronology53.year();
        boolean boolean60 = dateTimeFieldType38.isSupported(chronology53);
        org.joda.time.DurationField durationField61 = chronology53.weekyears();
        org.joda.time.DurationField durationField62 = chronology53.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField11 and durationField61", (durationField11.compareTo(durationField61) == 0) == durationField11.equals(durationField61));
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test265");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 100);
        java.lang.Integer int5 = dateTimeParserBucket4.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean7 = dateTimeParserBucket4.restoreState((java.lang.Object) dateTimeFieldType6);
        org.joda.time.Chronology chronology8 = dateTimeParserBucket4.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeZone dateTimeZone10 = chronology8.getZone();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.yearOfCentury();
        org.joda.time.DurationField durationField12 = chronology8.years();
        org.joda.time.DateTimeField dateTimeField13 = chronology8.clockhourOfHalfday();
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = dateTimeField13.getType();
        java.lang.String str15 = dateTimeFieldType14.getName();
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.DurationFieldType durationFieldType17 = dateTimeFieldType16.getDurationType();
        org.joda.time.Chronology chronology20 = null;
        java.util.Locale locale21 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket23 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology20, locale21, (java.lang.Integer) 100);
        java.lang.Integer int24 = dateTimeParserBucket23.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean26 = dateTimeParserBucket23.restoreState((java.lang.Object) dateTimeFieldType25);
        org.joda.time.Chronology chronology27 = dateTimeParserBucket23.getChronology();
        org.joda.time.DurationField durationField28 = chronology27.days();
        org.joda.time.DurationField durationField29 = chronology27.millis();
        org.joda.time.Chronology chronology31 = null;
        java.util.Locale locale32 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket34 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology31, locale32, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket35 = new org.joda.time.format.DateTimeParserBucket(64713600009L, chronology27, locale32);
        org.joda.time.Chronology chronology37 = null;
        java.util.Locale locale38 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket40 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology37, locale38, (java.lang.Integer) 100);
        java.lang.Integer int41 = dateTimeParserBucket40.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType42 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean43 = dateTimeParserBucket40.restoreState((java.lang.Object) dateTimeFieldType42);
        org.joda.time.Chronology chronology44 = dateTimeParserBucket40.getChronology();
        org.joda.time.DurationField durationField45 = chronology44.days();
        org.joda.time.DurationField durationField46 = chronology44.hours();
        org.joda.time.DateTimeZone dateTimeZone47 = chronology44.getZone();
        java.util.TimeZone timeZone48 = dateTimeZone47.toTimeZone();
        org.joda.time.Chronology chronology49 = chronology27.withZone(dateTimeZone47);
        org.joda.time.DateTimeField dateTimeField50 = dateTimeFieldType16.getField(chronology27);
        org.joda.time.DateTimeField dateTimeField51 = chronology27.clockhourOfHalfday();
        boolean boolean52 = dateTimeFieldType14.isSupported(chronology27);
        java.lang.String str53 = dateTimeFieldType14.getName();
        org.joda.time.Chronology chronology56 = null;
        java.util.Locale locale57 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket59 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology56, locale57, (java.lang.Integer) 100);
        java.lang.Integer int60 = dateTimeParserBucket59.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType61 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean62 = dateTimeParserBucket59.restoreState((java.lang.Object) dateTimeFieldType61);
        org.joda.time.Chronology chronology63 = dateTimeParserBucket59.getChronology();
        org.joda.time.DurationField durationField64 = chronology63.days();
        org.joda.time.DurationField durationField65 = chronology63.millis();
        org.joda.time.Chronology chronology67 = null;
        java.util.Locale locale68 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket70 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology67, locale68, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket71 = new org.joda.time.format.DateTimeParserBucket(64713600009L, chronology63, locale68);
        org.joda.time.DateTimeField dateTimeField72 = chronology63.minuteOfDay();
        org.joda.time.DurationField durationField73 = chronology63.days();
        org.joda.time.DateTimeField dateTimeField74 = chronology63.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField75 = dateTimeFieldType14.getField(chronology63);
        org.joda.time.DurationField durationField76 = chronology63.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField76, durationField9, and durationField12", !(durationField76.compareTo(durationField9) == 0) || (Math.signum(durationField76.compareTo(durationField12)) == Math.signum(durationField9.compareTo(durationField12))));
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test266");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 100);
        java.lang.Integer int6 = dateTimeParserBucket5.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean8 = dateTimeParserBucket5.restoreState((java.lang.Object) dateTimeFieldType7);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket5.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        org.joda.time.DateTimeZone dateTimeZone11 = chronology9.getZone();
        org.joda.time.DateTimeField dateTimeField12 = chronology9.monthOfYear();
        org.joda.time.Chronology chronology13 = chronology9.withUTC();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.Chronology chronology17 = null;
        java.util.Locale locale18 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket20 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology17, locale18, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket21 = new org.joda.time.format.DateTimeParserBucket(100L, chronology15, locale18);
        java.lang.String str22 = locale18.getScript();
        java.lang.String str23 = locale18.getISO3Country();
        java.util.Locale locale24 = java.util.Locale.CHINA;
        java.lang.String str25 = locale24.getDisplayName();
        org.joda.time.Chronology chronology27 = null;
        java.util.Locale locale28 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket30 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology27, locale28, (java.lang.Integer) 100);
        java.lang.Integer int31 = dateTimeParserBucket30.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean33 = dateTimeParserBucket30.restoreState((java.lang.Object) dateTimeFieldType32);
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.DateTimeField dateTimeField35 = dateTimeFieldType32.getField(chronology34);
        org.joda.time.DurationField durationField36 = dateTimeField35.getDurationField();
        long long39 = dateTimeField35.add(9L, 107L);
        int int40 = dateTimeField35.getMaximumValue();
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.Chronology chronology44 = null;
        java.util.Locale locale45 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket47 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology44, locale45, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket48 = new org.joda.time.format.DateTimeParserBucket(100L, chronology42, locale45);
        java.lang.String str49 = locale45.getDisplayScript();
        int int50 = dateTimeField35.getMaximumTextLength(locale45);
        java.lang.String str51 = locale24.getDisplayName(locale45);
        java.lang.String str52 = locale18.getDisplayCountry(locale45);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket53 = new org.joda.time.format.DateTimeParserBucket((long) 9, chronology9, locale18);
        org.joda.time.DurationField durationField54 = chronology9.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField54, durationField10, and durationField36", !(durationField54.compareTo(durationField10) == 0) || (Math.signum(durationField54.compareTo(durationField36)) == Math.signum(durationField10.compareTo(durationField36))));
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test267");
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        java.lang.Integer int7 = dateTimeParserBucket6.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean9 = dateTimeParserBucket6.restoreState((java.lang.Object) dateTimeFieldType8);
        org.joda.time.Chronology chronology10 = dateTimeParserBucket6.getChronology();
        org.joda.time.DurationField durationField11 = chronology10.days();
        org.joda.time.DateTimeField dateTimeField12 = dateTimeFieldType1.getField(chronology10);
        org.joda.time.DateTimeField dateTimeField13 = chronology10.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        long long17 = dateTimeZone15.convertUTCToLocal((long) (short) -1);
        org.joda.time.Chronology chronology19 = null;
        java.util.Locale locale20 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket22 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology19, locale20, (java.lang.Integer) 100);
        java.lang.Integer int23 = dateTimeParserBucket22.getPivotYear();
        org.joda.time.DateTimeField dateTimeField24 = null;
        dateTimeParserBucket22.saveField(dateTimeField24, (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone27 = dateTimeParserBucket22.getZone();
        long long29 = dateTimeZone15.getMillisKeepLocal(dateTimeZone27, 97L);
        int int31 = dateTimeZone15.getStandardOffset(1L);
        org.joda.time.Chronology chronology32 = chronology10.withZone(dateTimeZone15);
        java.util.Locale locale33 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale34 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str35 = locale33.getDisplayCountry(locale34);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket37 = new org.joda.time.format.DateTimeParserBucket((long) (short) 1, chronology32, locale33, (java.lang.Integer) 2);
        org.joda.time.DurationField durationField38 = chronology32.days();
        org.joda.time.DateTimeField dateTimeField39 = chronology32.minuteOfHour();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField11 and durationField38", (durationField11.compareTo(durationField38) == 0) == durationField11.equals(durationField38));
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test268");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 100);
        java.lang.Integer int5 = dateTimeParserBucket4.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean7 = dateTimeParserBucket4.restoreState((java.lang.Object) dateTimeFieldType6);
        org.joda.time.Chronology chronology8 = dateTimeParserBucket4.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        long long13 = chronology8.add(readablePeriod10, 0L, 0);
        org.joda.time.DateTimeField dateTimeField14 = chronology8.yearOfEra();
        org.joda.time.DateTimeField dateTimeField15 = chronology8.hourOfDay();
        org.joda.time.DurationField durationField16 = chronology8.years();
        org.joda.time.DurationField durationField17 = chronology8.weekyears();
        org.joda.time.DateTimeField dateTimeField18 = chronology8.hourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField16 and durationField17", (durationField16.compareTo(durationField17) == 0) == durationField16.equals(durationField17));
    }
}

